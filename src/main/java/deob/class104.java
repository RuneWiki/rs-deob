package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("cz")
public class class104 implements Runnable {

    @ObfuscatedName("cz.b")
    public class103 field1668 = null;

    @ObfuscatedName("cz.g")
    public class103 field1669 = null;

    @ObfuscatedName("cz.h")
    public Thread field1673;

    @ObfuscatedName("cz.v")
    public boolean field1682 = false;

    @ObfuscatedName("cz.l")
    public EventQueue field1670;

    public class104() {
        Statics.field1679 = "Unknown";
        Statics.field1667 = "1.1";
        try {
            Statics.field1679 = System.getProperty("java.vendor");
            Statics.field1667 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1670 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1682 = false;
        this.field1673 = new Thread(this);
        this.field1673.setPriority(10);
        this.field1673.setDaemon(true);
        this.field1673.start();
    }

    @ObfuscatedName("cz.b(I)V")
    public final void method1810() {
        synchronized (this) {
            this.field1682 = true;
            this.notifyAll();
        }
        try {
            this.field1673.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1682) {
                        return;
                    }
                    if (this.field1668 != null) {
                        var2 = this.field1668;
                        this.field1668 = this.field1668.field1661;
                        if (this.field1668 == null) {
                            this.field1669 = null;
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
                int var5 = var2.field1662;
                if (var5 == 1) {
                    var2.field1663 = new Socket(InetAddress.getByName((String) var2.field1664), var2.field1657);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1664);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1657);
                    var2.field1663 = var6;
                } else if (var5 == 4) {
                    var2.field1663 = new DataInputStream(((URL) var2.field1664).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1657 >> 24 & 0xFF) + "." + (var2.field1657 >> 16 & 0xFF) + "." + (var2.field1657 >> 8 & 0xFF) + "." + (var2.field1657 & 0xFF);
                    var2.field1663 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1665 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1665 = 2;
            }
        }
    }

    @ObfuscatedName("cz.g(IIILjava/lang/Object;I)Lcm;")
    public final class103 method1809(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1662 = arg0;
        var5.field1657 = arg1;
        var5.field1664 = arg3;
        synchronized (this) {
            if (this.field1669 == null) {
                this.field1669 = this.field1668 = var5;
            } else {
                this.field1669.field1661 = var5;
                this.field1669 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("cz.l(Ljava/lang/String;IB)Lcm;")
    public final class103 method1812(String arg0, int arg1) {
        return this.method1809(1, arg1, 0, arg0);
    }

    @ObfuscatedName("cz.c(Ljava/lang/Runnable;II)Lcm;")
    public final class103 method1833(Runnable arg0, int arg1) {
        return this.method1809(2, arg1, 0, arg0);
    }

    @ObfuscatedName("cz.u(II)Lcm;")
    public final class103 method1814(int arg0) {
        return this.method1809(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("cz.k(Ljava/net/URL;B)Lcm;")
    public final class103 method1815(URL arg0) {
        return this.method1809(4, 0, 0, arg0);
    }
}
