package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dw")
public class class125 implements Runnable {

    @ObfuscatedName("dw.y")
    public class48 field1940;

    @ObfuscatedName("dw.r")
    public class135 field1945 = null;

    @ObfuscatedName("dw.f")
    public class135 field1942 = null;

    @ObfuscatedName("dw.l")
    public Thread field1938;

    @ObfuscatedName("dw.b")
    public boolean field1941 = false;

    @ObfuscatedName("dw.k")
    public EventQueue field1944;

    public class125() {
        Statics.field1943 = "Unknown";
        Statics.field1939 = "1.1";
        try {
            Statics.field1943 = System.getProperty("java.vendor");
            Statics.field1939 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1944 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1941 = false;
        this.field1938 = new Thread(this);
        this.field1938.setPriority(10);
        this.field1938.setDaemon(true);
        this.field1938.start();
    }

    @ObfuscatedName("dw.r(I)V")
    public final void method2496() {
        synchronized (this) {
            this.field1941 = true;
            this.notifyAll();
        }
        try {
            this.field1938.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class135 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1941) {
                        return;
                    }
                    if (this.field1945 != null) {
                        var2 = this.field1945;
                        this.field1945 = this.field1945.field2058;
                        if (this.field1945 == null) {
                            this.field1942 = null;
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
                int var5 = var2.field2057;
                if (var5 == 1) {
                    var2.field2062 = new Socket(InetAddress.getByName((String) var2.field2061), var2.field2060);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2061);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2060);
                    var2.field2062 = var6;
                } else if (var5 == 4) {
                    var2.field2062 = new DataInputStream(((URL) var2.field2061).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2060 >> 24 & 0xFF) + "." + (var2.field2060 >> 16 & 0xFF) + "." + (var2.field2060 >> 8 & 0xFF) + "." + (var2.field2060 & 0xFF);
                    var2.field2062 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2059 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2059 = 2;
            }
        }
    }

    @ObfuscatedName("dw.f(IIILjava/lang/Object;I)Ley;")
    public final class135 method2495(int arg0, int arg1, int arg2, Object arg3) {
        class135 var5 = new class135();
        var5.field2057 = arg0;
        var5.field2060 = arg1;
        var5.field2061 = arg3;
        synchronized (this) {
            if (this.field1942 == null) {
                this.field1942 = this.field1945 = var5;
            } else {
                this.field1942.field2058 = var5;
                this.field1942 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dw.l(Ljava/lang/String;II)Ley;")
    public final class135 method2499(String arg0, int arg1) {
        return this.method2495(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dw.b(Ljava/lang/Runnable;IB)Ley;")
    public final class135 method2500(Runnable arg0, int arg1) {
        return this.method2495(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dw.k(IS)Ley;")
    public final class135 method2505(int arg0) {
        return this.method2495(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dw.g(Ljava/net/URL;B)Ley;")
    public final class135 method2502(URL arg0) {
        return this.method2495(4, 0, 0, arg0);
    }

    @ObfuscatedName("dw.v(I)Law;")
    public final class48 method2498() {
        return this.field1940;
    }
}
