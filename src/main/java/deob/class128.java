package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("df")
public class class128 implements Runnable {

    @ObfuscatedName("df.h")
    public class49 field1948;

    @ObfuscatedName("df.e")
    public class138 field1949 = null;

    @ObfuscatedName("df.n")
    public class138 field1946 = null;

    @ObfuscatedName("df.t")
    public Thread field1951;

    @ObfuscatedName("df.l")
    public boolean field1953 = false;

    @ObfuscatedName("df.m")
    public EventQueue field1952;

    public class128() {
        Statics.field1947 = "Unknown";
        Statics.field1950 = "1.1";
        try {
            Statics.field1947 = System.getProperty("java.vendor");
            Statics.field1950 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1952 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1953 = false;
        this.field1951 = new Thread(this);
        this.field1951.setPriority(10);
        this.field1951.setDaemon(true);
        this.field1951.start();
    }

    @ObfuscatedName("df.n(I)V")
    public final void method2497() {
        synchronized (this) {
            this.field1953 = true;
            this.notifyAll();
        }
        try {
            this.field1951.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1953) {
                        return;
                    }
                    if (this.field1949 != null) {
                        var2 = this.field1949;
                        this.field1949 = this.field1949.field2065;
                        if (this.field1949 == null) {
                            this.field1946 = null;
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
                int var5 = var2.field2064;
                if (var5 == 1) {
                    var2.field2067 = new Socket(InetAddress.getByName((String) var2.field2059), var2.field2061);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2059);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2061);
                    var2.field2067 = var6;
                } else if (var5 == 4) {
                    var2.field2067 = new DataInputStream(((URL) var2.field2059).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2061 >> 24 & 0xFF) + "." + (var2.field2061 >> 16 & 0xFF) + "." + (var2.field2061 >> 8 & 0xFF) + "." + (var2.field2061 & 0xFF);
                    var2.field2067 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2063 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2063 = 2;
            }
        }
    }

    @ObfuscatedName("df.t(IIILjava/lang/Object;I)Leq;")
    public final class138 method2507(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2064 = arg0;
        var5.field2061 = arg1;
        var5.field2059 = arg3;
        synchronized (this) {
            if (this.field1946 == null) {
                this.field1946 = this.field1949 = var5;
            } else {
                this.field1946.field2065 = var5;
                this.field1946 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("df.l(Ljava/lang/String;II)Leq;")
    public final class138 method2505(String arg0, int arg1) {
        return this.method2507(1, arg1, 0, arg0);
    }

    @ObfuscatedName("df.m(Ljava/lang/Runnable;II)Leq;")
    public final class138 method2501(Runnable arg0, int arg1) {
        return this.method2507(2, arg1, 0, arg0);
    }

    @ObfuscatedName("df.o(II)Leq;")
    public final class138 method2511(int arg0) {
        return this.method2507(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("df.k(Ljava/net/URL;B)Leq;")
    public final class138 method2503(URL arg0) {
        return this.method2507(4, 0, 0, arg0);
    }

    @ObfuscatedName("df.p(I)Lah;")
    public final class49 method2504() {
        return this.field1948;
    }
}
