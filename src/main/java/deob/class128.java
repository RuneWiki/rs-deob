package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dp")
public class class128 implements Runnable {

    @ObfuscatedName("dp.p")
    public class49 field1965;

    @ObfuscatedName("dp.e")
    public class138 field1974 = null;

    @ObfuscatedName("dp.i")
    public class138 field1967 = null;

    @ObfuscatedName("dp.o")
    public Thread field1968;

    @ObfuscatedName("dp.f")
    public boolean field1972 = false;

    @ObfuscatedName("dp.d")
    public EventQueue field1970;

    public class128() {
        Statics.field3060 = "Unknown";
        Statics.field1969 = "1.1";
        try {
            Statics.field3060 = System.getProperty("java.vendor");
            Statics.field1969 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1970 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1972 = false;
        this.field1968 = new Thread(this);
        this.field1968.setPriority(10);
        this.field1968.setDaemon(true);
        this.field1968.start();
    }

    @ObfuscatedName("dp.b(S)V")
    public final void method2548() {
        synchronized (this) {
            this.field1972 = true;
            this.notifyAll();
        }
        try {
            this.field1968.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1972) {
                        return;
                    }
                    if (this.field1974 != null) {
                        var2 = this.field1974;
                        this.field1974 = this.field1974.field2102;
                        if (this.field1974 == null) {
                            this.field1967 = null;
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
                int var5 = var2.field2103;
                if (var5 == 1) {
                    var2.field2099 = new Socket(InetAddress.getByName((String) var2.field2105), var2.field2104);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2105);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2104);
                    var2.field2099 = var6;
                } else if (var5 == 4) {
                    var2.field2099 = new DataInputStream(((URL) var2.field2105).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2104 >> 24 & 0xFF) + "." + (var2.field2104 >> 16 & 0xFF) + "." + (var2.field2104 >> 8 & 0xFF) + "." + (var2.field2104 & 0xFF);
                    var2.field2099 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2106 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2106 = 2;
            }
        }
    }

    @ObfuscatedName("dp.p(IIILjava/lang/Object;B)Led;")
    public final class138 method2549(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2103 = arg0;
        var5.field2104 = arg1;
        var5.field2105 = arg3;
        synchronized (this) {
            if (this.field1967 == null) {
                this.field1967 = this.field1974 = var5;
            } else {
                this.field1967.field2102 = var5;
                this.field1967 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dp.e(Ljava/lang/String;IB)Led;")
    public final class138 method2550(String arg0, int arg1) {
        return this.method2549(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dp.i(Ljava/lang/Runnable;II)Led;")
    public final class138 method2551(Runnable arg0, int arg1) {
        return this.method2549(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dp.o(IB)Led;")
    public final class138 method2565(int arg0) {
        return this.method2549(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dp.f(Ljava/net/URL;I)Led;")
    public final class138 method2553(URL arg0) {
        return this.method2549(4, 0, 0, arg0);
    }

    @ObfuscatedName("dp.d(I)Laa;")
    public final class49 method2569() {
        return this.field1965;
    }
}
