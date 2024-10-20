package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ci")
public class class104 implements Runnable {

    @ObfuscatedName("ci.f")
    public class103 field1681 = null;

    @ObfuscatedName("ci.h")
    public class103 field1674 = null;

    @ObfuscatedName("ci.a")
    public Thread field1672;

    @ObfuscatedName("ci.g")
    public boolean field1669 = false;

    @ObfuscatedName("ci.k")
    public EventQueue field1675;

    public class104() {
        Statics.field1671 = "Unknown";
        Statics.field1670 = "1.1";
        try {
            Statics.field1671 = System.getProperty("java.vendor");
            Statics.field1670 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1675 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1669 = false;
        this.field1672 = new Thread(this);
        this.field1672.setPriority(10);
        this.field1672.setDaemon(true);
        this.field1672.start();
    }

    @ObfuscatedName("ci.k(I)V")
    public final void method1825() {
        synchronized (this) {
            this.field1669 = true;
            this.notifyAll();
        }
        try {
            this.field1672.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1669) {
                        return;
                    }
                    if (this.field1681 != null) {
                        var2 = this.field1681;
                        this.field1681 = this.field1681.field1668;
                        if (this.field1681 == null) {
                            this.field1674 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var5 = var2.field1663;
                if (var5 == 1) {
                    var2.field1667 = new Socket(InetAddress.getByName((String) var2.field1660), var2.field1666);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1660);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1666);
                    var2.field1667 = var6;
                } else if (var5 == 4) {
                    var2.field1667 = new DataInputStream(((URL) var2.field1660).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1666 >> 24 & 0xFF) + "." + (var2.field1666 >> 16 & 0xFF) + "." + (var2.field1666 >> 8 & 0xFF) + "." + (var2.field1666 & 0xFF);
                    var2.field1667 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1664 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1664 = 2;
            }
        }
    }

    @ObfuscatedName("ci.u(IIILjava/lang/Object;I)Lco;")
    public final class103 method1804(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1663 = arg0;
        var5.field1666 = arg1;
        var5.field1660 = arg3;
        synchronized (this) {
            if (this.field1674 == null) {
                this.field1674 = this.field1681 = var5;
            } else {
                this.field1674.field1668 = var5;
                this.field1674 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ci.b(Ljava/lang/String;II)Lco;")
    public final class103 method1805(String arg0, int arg1) {
        return this.method1804(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ci.x(Ljava/lang/Runnable;II)Lco;")
    public final class103 method1806(Runnable arg0, int arg1) {
        return this.method1804(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ci.r(IB)Lco;")
    public final class103 method1807(int arg0) {
        return this.method1804(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ci.n(Ljava/net/URL;B)Lco;")
    public final class103 method1808(URL arg0) {
        return this.method1804(4, 0, 0, arg0);
    }
}
