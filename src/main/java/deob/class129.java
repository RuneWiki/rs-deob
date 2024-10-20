package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("da")
public class class129 implements Runnable {

    @ObfuscatedName("da.v")
    public class135 field1482 = null;

    @ObfuscatedName("da.y")
    public class135 field1488 = null;

    @ObfuscatedName("da.j")
    public Thread field1484;

    @ObfuscatedName("da.o")
    public boolean field1487 = false;

    public class129() {
        Statics.field1485 = "Unknown";
        Statics.field1483 = "1.6";
        try {
            Statics.field1485 = System.getProperty("java.vendor");
            Statics.field1483 = System.getProperty("java.version");
        } catch (Exception var2) {
        }
        this.field1487 = false;
        this.field1484 = new Thread(this);
        this.field1484.setPriority(10);
        this.field1484.setDaemon(true);
        this.field1484.start();
    }

    @ObfuscatedName("da.f(I)V")
    public final void method2333() {
        synchronized (this) {
            this.field1487 = true;
            this.notifyAll();
        }
        try {
            this.field1484.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class135 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1487) {
                        return;
                    }
                    if (this.field1482 != null) {
                        var2 = this.field1482;
                        this.field1482 = this.field1482.field1536;
                        if (this.field1482 == null) {
                            this.field1488 = null;
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
                int var5 = var2.field1534;
                if (var5 == 1) {
                    var2.field1532 = new Socket(InetAddress.getByName((String) var2.field1531), var2.field1535);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1531);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1535);
                    var2.field1532 = var6;
                } else if (var5 == 4) {
                    var2.field1532 = new DataInputStream(((URL) var2.field1531).openStream());
                }
                var2.field1533 = 1;
            } catch (ThreadDeath var9) {
                throw var9;
            } catch (Throwable var10) {
                var2.field1533 = 2;
            }
        }
    }

    @ObfuscatedName("da.e(IIILjava/lang/Object;B)Lel;")
    public final class135 method2326(int arg0, int arg1, int arg2, Object arg3) {
        class135 var5 = new class135();
        var5.field1534 = arg0;
        var5.field1535 = arg1;
        var5.field1531 = arg3;
        synchronized (this) {
            if (this.field1488 == null) {
                this.field1488 = this.field1482 = var5;
            } else {
                this.field1488.field1536 = var5;
                this.field1488 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("da.v(Ljava/lang/String;II)Lel;")
    public final class135 method2327(String arg0, int arg1) {
        return this.method2326(1, arg1, 0, arg0);
    }

    @ObfuscatedName("da.y(Ljava/lang/Runnable;II)Lel;")
    public final class135 method2330(Runnable arg0, int arg1) {
        return this.method2326(2, arg1, 0, arg0);
    }
}
