package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dz")
public class class130 implements Runnable {

    @ObfuscatedName("dz.v")
    public class136 field1465 = null;

    @ObfuscatedName("dz.j")
    public class136 field1462 = null;

    @ObfuscatedName("dz.l")
    public Thread field1466;

    @ObfuscatedName("dz.n")
    public boolean field1467 = false;

    public class130() {
        Statics.field1469 = "Unknown";
        Statics.field1463 = "1.6";
        try {
            Statics.field1469 = System.getProperty("java.vendor");
            Statics.field1463 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1467 = false;
        this.field1466 = new Thread(this);
        this.field1466.setPriority(10);
        this.field1466.setDaemon(true);
        this.field1466.start();
    }

    @ObfuscatedName("dz.s(B)V")
    public final void method2299() {
        synchronized (this) {
            this.field1467 = true;
            this.notifyAll();
        }
        try {
            this.field1466.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class136 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1467) {
                        return;
                    }
                    if (this.field1465 != null) {
                        var2 = this.field1465;
                        this.field1465 = this.field1465.field1507;
                        if (this.field1465 == null) {
                            this.field1462 = null;
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
                int var5 = var2.field1512;
                if (var5 == 1) {
                    var2.field1510 = new Socket(InetAddress.getByName((String) var2.field1514), var2.field1515);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1514);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1515);
                    var2.field1510 = var6;
                } else if (var5 == 4) {
                    var2.field1510 = new DataInputStream(((URL) var2.field1514).openStream());
                }
                var2.field1511 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1511 = 2;
            }
        }
    }

    @ObfuscatedName("dz.t(IIILjava/lang/Object;B)Lex;")
    public final class136 method2305(int arg0, int arg1, int arg2, Object arg3) {
        class136 var5 = new class136();
        var5.field1512 = arg0;
        var5.field1515 = arg1;
        var5.field1514 = arg3;
        synchronized (this) {
            if (this.field1462 == null) {
                this.field1462 = this.field1465 = var5;
            } else {
                this.field1462.field1507 = var5;
                this.field1462 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dz.v(Ljava/lang/String;IB)Lex;")
    public final class136 method2289(String arg0, int arg1) {
        return this.method2305(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dz.j(Ljava/lang/Runnable;II)Lex;")
    public final class136 method2288(Runnable arg0, int arg1) {
        return this.method2305(2, arg1, 0, arg0);
    }
}
