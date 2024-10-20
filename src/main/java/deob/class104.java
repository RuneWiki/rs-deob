package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("cb")
public class class104 implements Runnable {

    @ObfuscatedName("cb.o")
    public class103 field1678 = null;

    @ObfuscatedName("cb.r")
    public class103 field1677 = null;

    @ObfuscatedName("cb.w")
    public Thread field1680;

    @ObfuscatedName("cb.j")
    public boolean field1681 = false;

    @ObfuscatedName("cb.q")
    public EventQueue field1682;

    public class104() {
        Statics.field1688 = "Unknown";
        Statics.field905 = "1.1";
        try {
            Statics.field1688 = System.getProperty("java.vendor");
            Statics.field905 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1682 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1681 = false;
        this.field1680 = new Thread(this);
        this.field1680.setPriority(10);
        this.field1680.setDaemon(true);
        this.field1680.start();
    }

    @ObfuscatedName("cb.w(I)V")
    public final void method1838() {
        synchronized (this) {
            this.field1681 = true;
            this.notifyAll();
        }
        try {
            this.field1680.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1681) {
                        return;
                    }
                    if (this.field1678 != null) {
                        var2 = this.field1678;
                        this.field1678 = this.field1678.field1674;
                        if (this.field1678 == null) {
                            this.field1677 = null;
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
                int var5 = var2.field1673;
                if (var5 == 1) {
                    var2.field1676 = new Socket(InetAddress.getByName((String) var2.field1672), var2.field1671);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1672);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1671);
                    var2.field1676 = var6;
                } else if (var5 == 4) {
                    var2.field1676 = new DataInputStream(((URL) var2.field1672).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1671 >> 24 & 0xFF) + "." + (var2.field1671 >> 16 & 0xFF) + "." + (var2.field1671 >> 8 & 0xFF) + "." + (var2.field1671 & 0xFF);
                    var2.field1676 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1668 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1668 = 2;
            }
        }
    }

    @ObfuscatedName("cb.j(IIILjava/lang/Object;I)Lcc;")
    public final class103 method1829(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1673 = arg0;
        var5.field1671 = arg1;
        var5.field1672 = arg3;
        synchronized (this) {
            if (this.field1677 == null) {
                this.field1677 = this.field1678 = var5;
            } else {
                this.field1677.field1674 = var5;
                this.field1677 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("cb.c(Ljava/lang/String;II)Lcc;")
    public final class103 method1830(String arg0, int arg1) {
        return this.method1829(1, arg1, 0, arg0);
    }

    @ObfuscatedName("cb.g(Ljava/lang/Runnable;II)Lcc;")
    public final class103 method1831(Runnable arg0, int arg1) {
        return this.method1829(2, arg1, 0, arg0);
    }

    @ObfuscatedName("cb.i(II)Lcc;")
    public final class103 method1846(int arg0) {
        return this.method1829(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("cb.v(Ljava/net/URL;I)Lcc;")
    public final class103 method1833(URL arg0) {
        return this.method1829(4, 0, 0, arg0);
    }
}
