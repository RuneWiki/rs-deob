package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ch")
public class class104 implements Runnable {

    @ObfuscatedName("ch.n")
    public class103 field1661 = null;

    @ObfuscatedName("ch.q")
    public class103 field1662 = null;

    @ObfuscatedName("ch.t")
    public Thread field1663;

    @ObfuscatedName("ch.p")
    public boolean field1664 = false;

    @ObfuscatedName("ch.u")
    public EventQueue field1665;

    public class104() {
        Statics.field1660 = "Unknown";
        Statics.field1669 = "1.1";
        try {
            Statics.field1660 = System.getProperty("java.vendor");
            Statics.field1669 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1665 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1664 = false;
        this.field1663 = new Thread(this);
        this.field1663.setPriority(10);
        this.field1663.setDaemon(true);
        this.field1663.start();
    }

    @ObfuscatedName("ch.p(S)V")
    public final void method1860() {
        synchronized (this) {
            this.field1664 = true;
            this.notifyAll();
        }
        try {
            this.field1663.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1664) {
                        return;
                    }
                    if (this.field1661 != null) {
                        var2 = this.field1661;
                        this.field1661 = this.field1661.field1655;
                        if (this.field1661 == null) {
                            this.field1662 = null;
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
                int var5 = var2.field1650;
                if (var5 == 1) {
                    var2.field1658 = new Socket(InetAddress.getByName((String) var2.field1657), var2.field1656);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1657);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1656);
                    var2.field1658 = var6;
                } else if (var5 == 4) {
                    var2.field1658 = new DataInputStream(((URL) var2.field1657).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1656 >> 24 & 0xFF) + "." + (var2.field1656 >> 16 & 0xFF) + "." + (var2.field1656 >> 8 & 0xFF) + "." + (var2.field1656 & 0xFF);
                    var2.field1658 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1654 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1654 = 2;
            }
        }
    }

    @ObfuscatedName("ch.u(IIILjava/lang/Object;I)Lcw;")
    public final class103 method1850(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1650 = arg0;
        var5.field1656 = arg1;
        var5.field1657 = arg3;
        synchronized (this) {
            if (this.field1662 == null) {
                this.field1662 = this.field1661 = var5;
            } else {
                this.field1662.field1655 = var5;
                this.field1662 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ch.w(Ljava/lang/String;IB)Lcw;")
    public final class103 method1859(String arg0, int arg1) {
        return this.method1850(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ch.r(Ljava/lang/Runnable;II)Lcw;")
    public final class103 method1852(Runnable arg0, int arg1) {
        return this.method1850(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ch.s(II)Lcw;")
    public final class103 method1853(int arg0) {
        return this.method1850(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ch.k(Ljava/net/URL;I)Lcw;")
    public final class103 method1875(URL arg0) {
        return this.method1850(4, 0, 0, arg0);
    }
}
