package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dj")
public class class125 implements Runnable {

    @ObfuscatedName("dj.y")
    public class48 field1961;

    @ObfuscatedName("dj.e")
    public class135 field1964 = null;

    @ObfuscatedName("dj.r")
    public class135 field1963 = null;

    @ObfuscatedName("dj.a")
    public Thread field1966;

    @ObfuscatedName("dj.n")
    public boolean field1965 = false;

    @ObfuscatedName("dj.x")
    public EventQueue field1962;

    public class125() {
        Statics.field1959 = "Unknown";
        Statics.field1960 = "1.1";
        try {
            Statics.field1959 = System.getProperty("java.vendor");
            Statics.field1960 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1962 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1965 = false;
        this.field1966 = new Thread(this);
        this.field1966.setPriority(10);
        this.field1966.setDaemon(true);
        this.field1966.start();
    }

    @ObfuscatedName("dj.e(I)V")
    public final void method2522() {
        synchronized (this) {
            this.field1965 = true;
            this.notifyAll();
        }
        try {
            this.field1966.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class135 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1965) {
                        return;
                    }
                    if (this.field1964 != null) {
                        var2 = this.field1964;
                        this.field1964 = this.field1964.field2096;
                        if (this.field1964 == null) {
                            this.field1963 = null;
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
                int var5 = var2.field2094;
                if (var5 == 1) {
                    var2.field2092 = new Socket(InetAddress.getByName((String) var2.field2097), var2.field2095);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2097);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2095);
                    var2.field2092 = var6;
                } else if (var5 == 4) {
                    var2.field2092 = new DataInputStream(((URL) var2.field2097).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2095 >> 24 & 0xFF) + "." + (var2.field2095 >> 16 & 0xFF) + "." + (var2.field2095 >> 8 & 0xFF) + "." + (var2.field2095 & 0xFF);
                    var2.field2092 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2093 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2093 = 2;
            }
        }
    }

    @ObfuscatedName("dj.r(IIILjava/lang/Object;I)Ler;")
    public final class135 method2536(int arg0, int arg1, int arg2, Object arg3) {
        class135 var5 = new class135();
        var5.field2094 = arg0;
        var5.field2095 = arg1;
        var5.field2097 = arg3;
        synchronized (this) {
            if (this.field1963 == null) {
                this.field1963 = this.field1964 = var5;
            } else {
                this.field1963.field2096 = var5;
                this.field1963 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dj.a(Ljava/lang/String;IB)Ler;")
    public final class135 method2525(String arg0, int arg1) {
        return this.method2536(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dj.n(Ljava/lang/Runnable;II)Ler;")
    public final class135 method2526(Runnable arg0, int arg1) {
        return this.method2536(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dj.x(II)Ler;")
    public final class135 method2527(int arg0) {
        return this.method2536(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dj.g(Ljava/net/URL;B)Ler;")
    public final class135 method2528(URL arg0) {
        return this.method2536(4, 0, 0, arg0);
    }

    @ObfuscatedName("dj.o(I)Lac;")
    public final class48 method2541() {
        return this.field1961;
    }
}
