package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ci")
public class class104 implements Runnable {

    @ObfuscatedName("ci.m")
    public class103 field1667 = null;

    @ObfuscatedName("ci.h")
    public class103 field1675 = null;

    @ObfuscatedName("ci.w")
    public Thread field1674;

    @ObfuscatedName("ci.r")
    public boolean field1670 = false;

    @ObfuscatedName("ci.c")
    public EventQueue field1671;

    public class104() {
        Statics.field1673 = "Unknown";
        Statics.field1668 = "1.1";
        try {
            Statics.field1673 = System.getProperty("java.vendor");
            Statics.field1668 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1671 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1670 = false;
        this.field1674 = new Thread(this);
        this.field1674.setPriority(10);
        this.field1674.setDaemon(true);
        this.field1674.start();
    }

    @ObfuscatedName("ci.w(I)V")
    public final void method1888() {
        synchronized (this) {
            this.field1670 = true;
            this.notifyAll();
        }
        try {
            this.field1674.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1670) {
                        return;
                    }
                    if (this.field1667 != null) {
                        var2 = this.field1667;
                        this.field1667 = this.field1667.field1656;
                        if (this.field1667 == null) {
                            this.field1675 = null;
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
                int var5 = var2.field1661;
                if (var5 == 1) {
                    var2.field1664 = new Socket(InetAddress.getByName((String) var2.field1663), var2.field1660);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1663);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1660);
                    var2.field1664 = var6;
                } else if (var5 == 4) {
                    var2.field1664 = new DataInputStream(((URL) var2.field1663).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1660 >> 24 & 0xFF) + "." + (var2.field1660 >> 16 & 0xFF) + "." + (var2.field1660 >> 8 & 0xFF) + "." + (var2.field1660 & 0xFF);
                    var2.field1664 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1662 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1662 = 2;
            }
        }
    }

    @ObfuscatedName("ci.r(IIILjava/lang/Object;I)Lcn;")
    public final class103 method1864(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1661 = arg0;
        var5.field1660 = arg1;
        var5.field1663 = arg3;
        synchronized (this) {
            if (this.field1675 == null) {
                this.field1675 = this.field1667 = var5;
            } else {
                this.field1675.field1656 = var5;
                this.field1675 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ci.c(Ljava/lang/String;IB)Lcn;")
    public final class103 method1865(String arg0, int arg1) {
        return this.method1864(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ci.z(Ljava/lang/Runnable;IB)Lcn;")
    public final class103 method1871(Runnable arg0, int arg1) {
        return this.method1864(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ci.q(II)Lcn;")
    public final class103 method1867(int arg0) {
        return this.method1864(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ci.l(Ljava/net/URL;I)Lcn;")
    public final class103 method1868(URL arg0) {
        return this.method1864(4, 0, 0, arg0);
    }
}
