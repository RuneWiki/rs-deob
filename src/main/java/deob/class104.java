package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("cx")
public class class104 implements Runnable {

    @ObfuscatedName("cx.i")
    public class103 field1666 = null;

    @ObfuscatedName("cx.t")
    public class103 field1664 = null;

    @ObfuscatedName("cx.k")
    public Thread field1665;

    @ObfuscatedName("cx.h")
    public boolean field1663 = false;

    @ObfuscatedName("cx.n")
    public EventQueue field1667;

    public class104() {
        Statics.field1662 = "Unknown";
        Statics.field1661 = "1.1";
        try {
            Statics.field1662 = System.getProperty("java.vendor");
            Statics.field1661 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1667 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1663 = false;
        this.field1665 = new Thread(this);
        this.field1665.setPriority(10);
        this.field1665.setDaemon(true);
        this.field1665.start();
    }

    @ObfuscatedName("cx.t(B)V")
    public final void method1921() {
        synchronized (this) {
            this.field1663 = true;
            this.notifyAll();
        }
        try {
            this.field1665.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1663) {
                        return;
                    }
                    if (this.field1666 != null) {
                        var2 = this.field1666;
                        this.field1666 = this.field1666.field1655;
                        if (this.field1666 == null) {
                            this.field1664 = null;
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
                int var5 = var2.field1654;
                if (var5 == 1) {
                    var2.field1660 = new Socket(InetAddress.getByName((String) var2.field1652), var2.field1658);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1652);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1658);
                    var2.field1660 = var6;
                } else if (var5 == 4) {
                    var2.field1660 = new DataInputStream(((URL) var2.field1652).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1658 >> 24 & 0xFF) + "." + (var2.field1658 >> 16 & 0xFF) + "." + (var2.field1658 >> 8 & 0xFF) + "." + (var2.field1658 & 0xFF);
                    var2.field1660 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1656 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1656 = 2;
            }
        }
    }

    @ObfuscatedName("cx.k(IIILjava/lang/Object;I)Lch;")
    public final class103 method1931(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1654 = arg0;
        var5.field1658 = arg1;
        var5.field1652 = arg3;
        synchronized (this) {
            if (this.field1664 == null) {
                this.field1664 = this.field1666 = var5;
            } else {
                this.field1664.field1655 = var5;
                this.field1664 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("cx.x(Ljava/lang/String;II)Lch;")
    public final class103 method1912(String arg0, int arg1) {
        return this.method1931(1, arg1, 0, arg0);
    }

    @ObfuscatedName("cx.z(Ljava/lang/Runnable;IB)Lch;")
    public final class103 method1923(Runnable arg0, int arg1) {
        return this.method1931(2, arg1, 0, arg0);
    }

    @ObfuscatedName("cx.p(II)Lch;")
    public final class103 method1909(int arg0) {
        return this.method1931(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("cx.s(Ljava/net/URL;B)Lch;")
    public final class103 method1914(URL arg0) {
        return this.method1931(4, 0, 0, arg0);
    }
}
