package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("cj")
public class class104 implements Runnable {

    @ObfuscatedName("cj.c")
    public class103 field1658 = null;

    @ObfuscatedName("cj.l")
    public class103 field1661 = null;

    @ObfuscatedName("cj.y")
    public Thread field1664;

    @ObfuscatedName("cj.j")
    public boolean field1662 = false;

    @ObfuscatedName("cj.g")
    public EventQueue field1663;

    public class104() {
        Statics.field1660 = "Unknown";
        Statics.field1657 = "1.1";
        try {
            Statics.field1660 = System.getProperty("java.vendor");
            Statics.field1657 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1663 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1662 = false;
        this.field1664 = new Thread(this);
        this.field1664.setPriority(10);
        this.field1664.setDaemon(true);
        this.field1664.start();
    }

    @ObfuscatedName("cj.l(I)V")
    public final void method1900() {
        synchronized (this) {
            this.field1662 = true;
            this.notifyAll();
        }
        try {
            this.field1664.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1662) {
                        return;
                    }
                    if (this.field1658 != null) {
                        var2 = this.field1658;
                        this.field1658 = this.field1658.field1654;
                        if (this.field1658 == null) {
                            this.field1661 = null;
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
                int var5 = var2.field1648;
                if (var5 == 1) {
                    var2.field1656 = new Socket(InetAddress.getByName((String) var2.field1655), var2.field1653);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1655);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1653);
                    var2.field1656 = var6;
                } else if (var5 == 4) {
                    var2.field1656 = new DataInputStream(((URL) var2.field1655).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1653 >> 24 & 0xFF) + "." + (var2.field1653 >> 16 & 0xFF) + "." + (var2.field1653 >> 8 & 0xFF) + "." + (var2.field1653 & 0xFF);
                    var2.field1656 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1652 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1652 = 2;
            }
        }
    }

    @ObfuscatedName("cj.y(IIILjava/lang/Object;I)Lcc;")
    public final class103 method1903(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1648 = arg0;
        var5.field1653 = arg1;
        var5.field1655 = arg3;
        synchronized (this) {
            if (this.field1661 == null) {
                this.field1661 = this.field1658 = var5;
            } else {
                this.field1661.field1654 = var5;
                this.field1661 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("cj.j(Ljava/lang/String;II)Lcc;")
    public final class103 method1908(String arg0, int arg1) {
        return this.method1903(1, arg1, 0, arg0);
    }

    @ObfuscatedName("cj.t(Ljava/lang/Runnable;II)Lcc;")
    public final class103 method1905(Runnable arg0, int arg1) {
        return this.method1903(2, arg1, 0, arg0);
    }

    @ObfuscatedName("cj.k(II)Lcc;")
    public final class103 method1906(int arg0) {
        return this.method1903(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("cj.f(Ljava/net/URL;I)Lcc;")
    public final class103 method1918(URL arg0) {
        return this.method1903(4, 0, 0, arg0);
    }
}
