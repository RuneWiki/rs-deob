package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ca")
public class class104 implements Runnable {

    @ObfuscatedName("ca.c")
    public class103 field1681 = null;

    @ObfuscatedName("ca.d")
    public class103 field1682 = null;

    @ObfuscatedName("ca.w")
    public Thread field1683;

    @ObfuscatedName("ca.h")
    public boolean field1684 = false;

    @ObfuscatedName("ca.u")
    public EventQueue field1680;

    public class104() {
        Statics.field1679 = "Unknown";
        Statics.field1688 = "1.1";
        try {
            Statics.field1679 = System.getProperty("java.vendor");
            Statics.field1688 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1680 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1684 = false;
        this.field1683 = new Thread(this);
        this.field1683.setPriority(10);
        this.field1683.setDaemon(true);
        this.field1683.start();
    }

    @ObfuscatedName("ca.c(I)V")
    public final void method1903() {
        synchronized (this) {
            this.field1684 = true;
            this.notifyAll();
        }
        try {
            this.field1683.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1684) {
                        return;
                    }
                    if (this.field1681 != null) {
                        var2 = this.field1681;
                        this.field1681 = this.field1681.field1676;
                        if (this.field1681 == null) {
                            this.field1682 = null;
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
                int var5 = var2.field1675;
                if (var5 == 1) {
                    var2.field1678 = new Socket(InetAddress.getByName((String) var2.field1671), var2.field1672);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1671);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1672);
                    var2.field1678 = var6;
                } else if (var5 == 4) {
                    var2.field1678 = new DataInputStream(((URL) var2.field1671).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1672 >> 24 & 0xFF) + "." + (var2.field1672 >> 16 & 0xFF) + "." + (var2.field1672 >> 8 & 0xFF) + "." + (var2.field1672 & 0xFF);
                    var2.field1678 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1674 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1674 = 2;
            }
        }
    }

    @ObfuscatedName("ca.d(IIILjava/lang/Object;I)Lci;")
    public final class103 method1904(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1675 = arg0;
        var5.field1672 = arg1;
        var5.field1671 = arg3;
        synchronized (this) {
            if (this.field1682 == null) {
                this.field1682 = this.field1681 = var5;
            } else {
                this.field1682.field1676 = var5;
                this.field1682 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ca.w(Ljava/lang/String;II)Lci;")
    public final class103 method1905(String arg0, int arg1) {
        return this.method1904(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ca.u(Ljava/lang/Runnable;II)Lci;")
    public final class103 method1906(Runnable arg0, int arg1) {
        return this.method1904(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ca.y(IB)Lci;")
    public final class103 method1907(int arg0) {
        return this.method1904(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ca.e(Ljava/net/URL;I)Lci;")
    public final class103 method1919(URL arg0) {
        return this.method1904(4, 0, 0, arg0);
    }
}
