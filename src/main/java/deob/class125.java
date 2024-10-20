package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("du")
public class class125 implements Runnable {

    @ObfuscatedName("du.g")
    public class48 field1933;

    @ObfuscatedName("du.j")
    public class135 field1943 = null;

    @ObfuscatedName("du.w")
    public class135 field1935 = null;

    @ObfuscatedName("du.c")
    public Thread field1936;

    @ObfuscatedName("du.x")
    public boolean field1937 = false;

    @ObfuscatedName("du.f")
    public EventQueue field1938;

    public class125() {
        Statics.field1944 = "Unknown";
        Statics.field1932 = "1.1";
        try {
            Statics.field1944 = System.getProperty("java.vendor");
            Statics.field1932 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1938 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1937 = false;
        this.field1936 = new Thread(this);
        this.field1936.setPriority(10);
        this.field1936.setDaemon(true);
        this.field1936.start();
    }

    @ObfuscatedName("du.j(I)V")
    public final void method2521() {
        synchronized (this) {
            this.field1937 = true;
            this.notifyAll();
        }
        try {
            this.field1936.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class135 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1937) {
                        return;
                    }
                    if (this.field1943 != null) {
                        var2 = this.field1943;
                        this.field1943 = this.field1943.field2049;
                        if (this.field1943 == null) {
                            this.field1935 = null;
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
                int var5 = var2.field2054;
                if (var5 == 1) {
                    var2.field2057 = new Socket(InetAddress.getByName((String) var2.field2055), var2.field2056);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2055);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2056);
                    var2.field2057 = var6;
                } else if (var5 == 4) {
                    var2.field2057 = new DataInputStream(((URL) var2.field2055).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2056 >> 24 & 0xFF) + "." + (var2.field2056 >> 16 & 0xFF) + "." + (var2.field2056 >> 8 & 0xFF) + "." + (var2.field2056 & 0xFF);
                    var2.field2057 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2053 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2053 = 2;
            }
        }
    }

    @ObfuscatedName("du.w(IIILjava/lang/Object;I)Lej;")
    public final class135 method2495(int arg0, int arg1, int arg2, Object arg3) {
        class135 var5 = new class135();
        var5.field2054 = arg0;
        var5.field2056 = arg1;
        var5.field2055 = arg3;
        synchronized (this) {
            if (this.field1935 == null) {
                this.field1935 = this.field1943 = var5;
            } else {
                this.field1935.field2049 = var5;
                this.field1935 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("du.c(Ljava/lang/String;IB)Lej;")
    public final class135 method2496(String arg0, int arg1) {
        return this.method2495(1, arg1, 0, arg0);
    }

    @ObfuscatedName("du.x(Ljava/lang/Runnable;IB)Lej;")
    public final class135 method2497(Runnable arg0, int arg1) {
        return this.method2495(2, arg1, 0, arg0);
    }

    @ObfuscatedName("du.f(II)Lej;")
    public final class135 method2498(int arg0) {
        return this.method2495(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("du.t(Ljava/net/URL;I)Lej;")
    public final class135 method2499(URL arg0) {
        return this.method2495(4, 0, 0, arg0);
    }

    @ObfuscatedName("du.n(I)Lar;")
    public final class48 method2500() {
        return this.field1933;
    }
}
