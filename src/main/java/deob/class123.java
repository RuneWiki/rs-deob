package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dy")
public class class123 implements Runnable {

    @ObfuscatedName("dy.f")
    public class47 field1931;

    @ObfuscatedName("dy.e")
    public class133 field1932 = null;

    @ObfuscatedName("dy.d")
    public class133 field1933 = null;

    @ObfuscatedName("dy.n")
    public Thread field1934;

    @ObfuscatedName("dy.v")
    public boolean field1935 = false;

    @ObfuscatedName("dy.z")
    public EventQueue field1938;

    public class123() {
        Statics.field1936 = "Unknown";
        Statics.field1930 = "1.1";
        try {
            Statics.field1936 = System.getProperty("java.vendor");
            Statics.field1930 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1938 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1935 = false;
        this.field1934 = new Thread(this);
        this.field1934.setPriority(10);
        this.field1934.setDaemon(true);
        this.field1934.start();
    }

    @ObfuscatedName("dy.s(I)V")
    public final void method2489() {
        synchronized (this) {
            this.field1935 = true;
            this.notifyAll();
        }
        try {
            this.field1934.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1935) {
                        return;
                    }
                    if (this.field1932 != null) {
                        var2 = this.field1932;
                        this.field1932 = this.field1932.field2064;
                        if (this.field1932 == null) {
                            this.field1933 = null;
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
                int var5 = var2.field2062;
                if (var5 == 1) {
                    var2.field2065 = new Socket(InetAddress.getByName((String) var2.field2059), var2.field2063);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2059);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2063);
                    var2.field2065 = var6;
                } else if (var5 == 4) {
                    var2.field2065 = new DataInputStream(((URL) var2.field2059).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2063 >> 24 & 0xFF) + "." + (var2.field2063 >> 16 & 0xFF) + "." + (var2.field2063 >> 8 & 0xFF) + "." + (var2.field2063 & 0xFF);
                    var2.field2065 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2061 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2061 = 2;
            }
        }
    }

    @ObfuscatedName("dy.f(IIILjava/lang/Object;I)Lea;")
    public final class133 method2466(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2062 = arg0;
        var5.field2063 = arg1;
        var5.field2059 = arg3;
        synchronized (this) {
            if (this.field1933 == null) {
                this.field1933 = this.field1932 = var5;
            } else {
                this.field1933.field2064 = var5;
                this.field1933 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dy.e(Ljava/lang/String;II)Lea;")
    public final class133 method2472(String arg0, int arg1) {
        return this.method2466(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dy.d(Ljava/lang/Runnable;II)Lea;")
    public final class133 method2468(Runnable arg0, int arg1) {
        return this.method2466(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dy.n(IB)Lea;")
    public final class133 method2469(int arg0) {
        return this.method2466(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dy.v(Ljava/net/URL;I)Lea;")
    public final class133 method2470(URL arg0) {
        return this.method2466(4, 0, 0, arg0);
    }

    @ObfuscatedName("dy.z(I)Lac;")
    public final class47 method2471() {
        return this.field1931;
    }
}
