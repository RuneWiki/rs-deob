package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dp")
public class class128 implements Runnable {

    @ObfuscatedName("dp.f")
    public class134 field1480 = null;

    @ObfuscatedName("dp.y")
    public class134 field1483 = null;

    @ObfuscatedName("dp.p")
    public Thread field1482;

    @ObfuscatedName("dp.j")
    public boolean field1484 = false;

    public class128() {
        Statics.field1485 = "Unknown";
        Statics.field1479 = "1.6";
        try {
            Statics.field1485 = System.getProperty("java.vendor");
            Statics.field1479 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1484 = false;
        this.field1482 = new Thread(this);
        this.field1482.setPriority(10);
        this.field1482.setDaemon(true);
        this.field1482.start();
    }

    @ObfuscatedName("dp.v(B)V")
    public final void method2303() {
        synchronized (this) {
            this.field1484 = true;
            this.notifyAll();
        }
        try {
            this.field1482.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class134 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1484) {
                        return;
                    }
                    if (this.field1480 != null) {
                        var2 = this.field1480;
                        this.field1480 = this.field1480.field1531;
                        if (this.field1480 == null) {
                            this.field1483 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var11) {
                    }
                }
            }
            try {
                int var5 = var2.field1528;
                if (var5 == 1) {
                    var2.field1532 = new Socket(InetAddress.getByName((String) var2.field1525), var2.field1529);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1525);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1529);
                    var2.field1532 = var6;
                } else if (var5 == 4) {
                    var2.field1532 = new DataInputStream(((URL) var2.field1525).openStream());
                }
                var2.field1524 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1524 = 2;
            }
        }
    }

    @ObfuscatedName("dp.n(IIILjava/lang/Object;I)Leu;")
    public final class134 method2293(int arg0, int arg1, int arg2, Object arg3) {
        class134 var5 = new class134();
        var5.field1528 = arg0;
        var5.field1529 = arg1;
        var5.field1525 = arg3;
        synchronized (this) {
            if (this.field1483 == null) {
                this.field1483 = this.field1480 = var5;
            } else {
                this.field1483.field1531 = var5;
                this.field1483 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dp.f(Ljava/lang/String;IB)Leu;")
    public final class134 method2294(String arg0, int arg1) {
        return this.method2293(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dp.y(Ljava/lang/Runnable;IB)Leu;")
    public final class134 method2295(Runnable arg0, int arg1) {
        return this.method2293(2, arg1, 0, arg0);
    }
}
