package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dt")
public class class128 implements Runnable {

    @ObfuscatedName("dt.u")
    public class134 field1468 = null;

    @ObfuscatedName("dt.p")
    public class134 field1469 = null;

    @ObfuscatedName("dt.b")
    public Thread field1467;

    @ObfuscatedName("dt.e")
    public boolean field1471 = false;

    public class128() {
        Statics.field1466 = "Unknown";
        Statics.field1474 = "1.6";
        try {
            Statics.field1466 = System.getProperty("java.vendor");
            Statics.field1474 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1471 = false;
        this.field1467 = new Thread(this);
        this.field1467.setPriority(10);
        this.field1467.setDaemon(true);
        this.field1467.start();
    }

    @ObfuscatedName("dt.f(I)V")
    public final void method2217() {
        synchronized (this) {
            this.field1471 = true;
            this.notifyAll();
        }
        try {
            this.field1467.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class134 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1471) {
                        return;
                    }
                    if (this.field1468 != null) {
                        var2 = this.field1468;
                        this.field1468 = this.field1468.field1513;
                        if (this.field1468 == null) {
                            this.field1469 = null;
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
                int var5 = var2.field1511;
                if (var5 == 1) {
                    var2.field1519 = new Socket(InetAddress.getByName((String) var2.field1518), var2.field1516);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1518);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1516);
                    var2.field1519 = var6;
                } else if (var5 == 4) {
                    var2.field1519 = new DataInputStream(((URL) var2.field1518).openStream());
                }
                var2.field1515 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1515 = 2;
            }
        }
    }

    @ObfuscatedName("dt.o(IIILjava/lang/Object;I)Lep;")
    public final class134 method2216(int arg0, int arg1, int arg2, Object arg3) {
        class134 var5 = new class134();
        var5.field1511 = arg0;
        var5.field1516 = arg1;
        var5.field1518 = arg3;
        synchronized (this) {
            if (this.field1469 == null) {
                this.field1469 = this.field1468 = var5;
            } else {
                this.field1469.field1513 = var5;
                this.field1469 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dt.u(Ljava/lang/String;IB)Lep;")
    public final class134 method2219(String arg0, int arg1) {
        return this.method2216(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dt.p(Ljava/lang/Runnable;IB)Lep;")
    public final class134 method2223(Runnable arg0, int arg1) {
        return this.method2216(2, arg1, 0, arg0);
    }
}
