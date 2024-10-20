package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bv")
public class class110 implements Runnable {

    @ObfuscatedName("bv.g")
    public EventQueue field1763;

    @ObfuscatedName("bv.n")
    public boolean field1765 = false;

    @ObfuscatedName("bv.o")
    public class178 field1758;

    @ObfuscatedName("bv.h")
    public class107 field1760 = null;

    @ObfuscatedName("bv.t")
    public class107 field1759 = null;

    @ObfuscatedName("bv.r")
    public Thread field1762;

    @ObfuscatedName("bv.o(I)V")
    public final void method1902() {
        synchronized (this) {
            this.field1765 = true;
            this.notifyAll();
        }
        try {
            this.field1762.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class107 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1765) {
                        return;
                    }
                    if (this.field1759 != null) {
                        var2 = this.field1759;
                        this.field1759 = this.field1759.field1469;
                        if (this.field1759 == null) {
                            this.field1760 = null;
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
                int var5 = var2.field1464;
                if (var5 == 1) {
                    var2.field1471 = new Socket(InetAddress.getByName((String) var2.field1468), var2.field1463);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1468);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1463);
                    var2.field1471 = var6;
                } else if (var5 == 4) {
                    var2.field1471 = new DataInputStream(((URL) var2.field1468).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1463 >> 24 & 0xFF) + "." + (var2.field1463 >> 16 & 0xFF) + "." + (var2.field1463 >> 8 & 0xFF) + "." + (var2.field1463 & 0xFF);
                    var2.field1471 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1467 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1467 = 2;
            }
        }
    }

    @ObfuscatedName("bv.h(Ljava/lang/String;II)Lca;")
    public final class107 method1904(String arg0, int arg1) {
        return this.method1920(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bv.r(Ljava/lang/Runnable;II)Lca;")
    public final class107 method1905(Runnable arg0, int arg1) {
        return this.method1920(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bv.n(IB)Lca;")
    public final class107 method1906(int arg0) {
        return this.method1920(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("bv.e(B)Lan;")
    public final class178 method1908() {
        return this.field1758;
    }

    @ObfuscatedName("bv.g(Ljava/net/URL;I)Lca;")
    public final class107 method1915(URL arg0) {
        return this.method1920(4, 0, 0, arg0);
    }

    @ObfuscatedName("bv.t(IIILjava/lang/Object;I)Lca;")
    public final class107 method1920(int arg0, int arg1, int arg2, Object arg3) {
        class107 var5 = new class107();
        var5.field1464 = arg0;
        var5.field1463 = arg1;
        var5.field1468 = arg3;
        synchronized (this) {
            if (this.field1760 == null) {
                this.field1760 = this.field1759 = var5;
            } else {
                this.field1760.field1469 = var5;
                this.field1760 = var5;
            }
            this.notify();
            return var5;
        }
    }

    public class110() {
        Statics.field1761 = "Unknown";
        Statics.field57 = "1.1";
        try {
            Statics.field1761 = System.getProperty("java.vendor");
            Statics.field57 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1763 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1765 = false;
        this.field1762 = new Thread(this);
        this.field1762.setPriority(10);
        this.field1762.setDaemon(true);
        this.field1762.start();
    }
}
