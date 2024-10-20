package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dh")
public class class123 implements Runnable {

    @ObfuscatedName("dh.y")
    public class47 field1952;

    @ObfuscatedName("dh.w")
    public class133 field1954 = null;

    @ObfuscatedName("dh.m")
    public class133 field1956 = null;

    @ObfuscatedName("dh.j")
    public Thread field1957;

    @ObfuscatedName("dh.g")
    public boolean field1958 = false;

    @ObfuscatedName("dh.p")
    public EventQueue field1959;

    public class123() {
        Statics.field1961 = "Unknown";
        Statics.field1953 = "1.1";
        try {
            Statics.field1961 = System.getProperty("java.vendor");
            Statics.field1953 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1959 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1958 = false;
        this.field1957 = new Thread(this);
        this.field1957.setPriority(10);
        this.field1957.setDaemon(true);
        this.field1957.start();
    }

    @ObfuscatedName("dh.m(I)V")
    public final void method2460() {
        synchronized (this) {
            this.field1958 = true;
            this.notifyAll();
        }
        try {
            this.field1957.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1958) {
                        return;
                    }
                    if (this.field1954 != null) {
                        var2 = this.field1954;
                        this.field1954 = this.field1954.field2067;
                        if (this.field1954 == null) {
                            this.field1956 = null;
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
                int var5 = var2.field2068;
                if (var5 == 1) {
                    var2.field2070 = new Socket(InetAddress.getByName((String) var2.field2069), var2.field2062);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2069);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2062);
                    var2.field2070 = var6;
                } else if (var5 == 4) {
                    var2.field2070 = new DataInputStream(((URL) var2.field2069).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2062 >> 24 & 0xFF) + "." + (var2.field2062 >> 16 & 0xFF) + "." + (var2.field2062 >> 8 & 0xFF) + "." + (var2.field2062 & 0xFF);
                    var2.field2070 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2066 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2066 = 2;
            }
        }
    }

    @ObfuscatedName("dh.j(IIILjava/lang/Object;I)Leb;")
    public final class133 method2461(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2068 = arg0;
        var5.field2062 = arg1;
        var5.field2069 = arg3;
        synchronized (this) {
            if (this.field1956 == null) {
                this.field1956 = this.field1954 = var5;
            } else {
                this.field1956.field2067 = var5;
                this.field1956 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dh.g(Ljava/lang/String;IS)Leb;")
    public final class133 method2462(String arg0, int arg1) {
        return this.method2461(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dh.p(Ljava/lang/Runnable;II)Leb;")
    public final class133 method2463(Runnable arg0, int arg1) {
        return this.method2461(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dh.o(II)Leb;")
    public final class133 method2477(int arg0) {
        return this.method2461(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dh.b(Ljava/net/URL;I)Leb;")
    public final class133 method2464(URL arg0) {
        return this.method2461(4, 0, 0, arg0);
    }

    @ObfuscatedName("dh.x(I)Lag;")
    public final class47 method2465() {
        return this.field1952;
    }
}
