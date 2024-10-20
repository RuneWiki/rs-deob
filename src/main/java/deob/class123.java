package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dt")
public class class123 implements Runnable {

    @ObfuscatedName("dt.k")
    public class47 field1924;

    @ObfuscatedName("dt.i")
    public class133 field1925 = null;

    @ObfuscatedName("dt.d")
    public class133 field1926 = null;

    @ObfuscatedName("dt.q")
    public Thread field1927;

    @ObfuscatedName("dt.m")
    public boolean field1928 = false;

    @ObfuscatedName("dt.a")
    public EventQueue field1929;

    public class123() {
        Statics.field1936 = "Unknown";
        Statics.field1923 = "1.1";
        try {
            Statics.field1936 = System.getProperty("java.vendor");
            Statics.field1923 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1929 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1928 = false;
        this.field1927 = new Thread(this);
        this.field1927.setPriority(10);
        this.field1927.setDaemon(true);
        this.field1927.start();
    }

    @ObfuscatedName("dt.i(I)V")
    public final void method2476() {
        synchronized (this) {
            this.field1928 = true;
            this.notifyAll();
        }
        try {
            this.field1927.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1928) {
                        return;
                    }
                    if (this.field1925 != null) {
                        var2 = this.field1925;
                        this.field1925 = this.field1925.field2048;
                        if (this.field1925 == null) {
                            this.field1926 = null;
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
                int var5 = var2.field2046;
                if (var5 == 1) {
                    var2.field2049 = new Socket(InetAddress.getByName((String) var2.field2041), var2.field2047);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2041);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2047);
                    var2.field2049 = var6;
                } else if (var5 == 4) {
                    var2.field2049 = new DataInputStream(((URL) var2.field2041).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2047 >> 24 & 0xFF) + "." + (var2.field2047 >> 16 & 0xFF) + "." + (var2.field2047 >> 8 & 0xFF) + "." + (var2.field2047 & 0xFF);
                    var2.field2049 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2045 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2045 = 2;
            }
        }
    }

    @ObfuscatedName("dt.d(IIILjava/lang/Object;I)Leu;")
    public final class133 method2456(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2046 = arg0;
        var5.field2047 = arg1;
        var5.field2041 = arg3;
        synchronized (this) {
            if (this.field1926 == null) {
                this.field1926 = this.field1925 = var5;
            } else {
                this.field1926.field2048 = var5;
                this.field1926 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dt.q(Ljava/lang/String;II)Leu;")
    public final class133 method2465(String arg0, int arg1) {
        return this.method2456(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dt.m(Ljava/lang/Runnable;II)Leu;")
    public final class133 method2458(Runnable arg0, int arg1) {
        return this.method2456(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dt.a(IB)Leu;")
    public final class133 method2459(int arg0) {
        return this.method2456(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dt.w(Ljava/net/URL;I)Leu;")
    public final class133 method2460(URL arg0) {
        return this.method2456(4, 0, 0, arg0);
    }

    @ObfuscatedName("dt.e(I)Lap;")
    public final class47 method2461() {
        return this.field1924;
    }
}
