package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("cc")
public class class104 implements Runnable {

    @ObfuscatedName("cc.h")
    public class103 field1676 = null;

    @ObfuscatedName("cc.p")
    public class103 field1677 = null;

    @ObfuscatedName("cc.j")
    public Thread field1680;

    @ObfuscatedName("cc.n")
    public boolean field1679 = false;

    @ObfuscatedName("cc.r")
    public EventQueue field1678;

    public class104() {
        Statics.field1686 = "Unknown";
        Statics.field1675 = "1.1";
        try {
            Statics.field1686 = System.getProperty("java.vendor");
            Statics.field1675 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1678 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1679 = false;
        this.field1680 = new Thread(this);
        this.field1680.setPriority(10);
        this.field1680.setDaemon(true);
        this.field1680.start();
    }

    @ObfuscatedName("cc.h(I)V")
    public final void method1927() {
        synchronized (this) {
            this.field1679 = true;
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
                    if (this.field1679) {
                        return;
                    }
                    if (this.field1676 != null) {
                        var2 = this.field1676;
                        this.field1676 = this.field1676.field1669;
                        if (this.field1676 == null) {
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
                int var5 = var2.field1670;
                if (var5 == 1) {
                    var2.field1673 = new Socket(InetAddress.getByName((String) var2.field1667), var2.field1668);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1667);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1668);
                    var2.field1673 = var6;
                } else if (var5 == 4) {
                    var2.field1673 = new DataInputStream(((URL) var2.field1667).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1668 >> 24 & 0xFF) + "." + (var2.field1668 >> 16 & 0xFF) + "." + (var2.field1668 >> 8 & 0xFF) + "." + (var2.field1668 & 0xFF);
                    var2.field1673 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1672 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1672 = 2;
            }
        }
    }

    @ObfuscatedName("cc.p(IIILjava/lang/Object;B)Lca;")
    public final class103 method1928(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1670 = arg0;
        var5.field1668 = arg1;
        var5.field1667 = arg3;
        synchronized (this) {
            if (this.field1677 == null) {
                this.field1677 = this.field1676 = var5;
            } else {
                this.field1677.field1669 = var5;
                this.field1677 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("cc.j(Ljava/lang/String;II)Lca;")
    public final class103 method1929(String arg0, int arg1) {
        return this.method1928(1, arg1, 0, arg0);
    }

    @ObfuscatedName("cc.n(Ljava/lang/Runnable;II)Lca;")
    public final class103 method1930(Runnable arg0, int arg1) {
        return this.method1928(2, arg1, 0, arg0);
    }

    @ObfuscatedName("cc.c(IB)Lca;")
    public final class103 method1934(int arg0) {
        return this.method1928(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("cc.o(Ljava/net/URL;I)Lca;")
    public final class103 method1940(URL arg0) {
        return this.method1928(4, 0, 0, arg0);
    }
}
