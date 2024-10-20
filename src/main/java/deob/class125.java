package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dy")
public class class125 implements Runnable {

    @ObfuscatedName("dy.k")
    public class48 field1951;

    @ObfuscatedName("dy.g")
    public class135 field1945 = null;

    @ObfuscatedName("dy.q")
    public class135 field1946 = null;

    @ObfuscatedName("dy.l")
    public Thread field1947;

    @ObfuscatedName("dy.a")
    public boolean field1953 = false;

    @ObfuscatedName("dy.b")
    public EventQueue field1942;

    public class125() {
        Statics.field1944 = "Unknown";
        Statics.field1943 = "1.1";
        try {
            Statics.field1944 = System.getProperty("java.vendor");
            Statics.field1943 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1942 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1953 = false;
        this.field1947 = new Thread(this);
        this.field1947.setPriority(10);
        this.field1947.setDaemon(true);
        this.field1947.start();
    }

    @ObfuscatedName("dy.g(B)V")
    public final void method2484() {
        synchronized (this) {
            this.field1953 = true;
            this.notifyAll();
        }
        try {
            this.field1947.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class135 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1953) {
                        return;
                    }
                    if (this.field1945 != null) {
                        var2 = this.field1945;
                        this.field1945 = this.field1945.field2071;
                        if (this.field1945 == null) {
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
                int var5 = var2.field2074;
                if (var5 == 1) {
                    var2.field2079 = new Socket(InetAddress.getByName((String) var2.field2078), var2.field2076);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2078);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2076);
                    var2.field2079 = var6;
                } else if (var5 == 4) {
                    var2.field2079 = new DataInputStream(((URL) var2.field2078).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2076 >> 24 & 0xFF) + "." + (var2.field2076 >> 16 & 0xFF) + "." + (var2.field2076 >> 8 & 0xFF) + "." + (var2.field2076 & 0xFF);
                    var2.field2079 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2075 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2075 = 2;
            }
        }
    }

    @ObfuscatedName("dy.q(IIILjava/lang/Object;I)Lec;")
    public final class135 method2483(int arg0, int arg1, int arg2, Object arg3) {
        class135 var5 = new class135();
        var5.field2074 = arg0;
        var5.field2076 = arg1;
        var5.field2078 = arg3;
        synchronized (this) {
            if (this.field1946 == null) {
                this.field1946 = this.field1945 = var5;
            } else {
                this.field1946.field2071 = var5;
                this.field1946 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dy.l(Ljava/lang/String;II)Lec;")
    public final class135 method2490(String arg0, int arg1) {
        return this.method2483(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dy.a(Ljava/lang/Runnable;II)Lec;")
    public final class135 method2487(Runnable arg0, int arg1) {
        return this.method2483(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dy.b(II)Lec;")
    public final class135 method2500(int arg0) {
        return this.method2483(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dy.z(Ljava/net/URL;B)Lec;")
    public final class135 method2485(URL arg0) {
        return this.method2483(4, 0, 0, arg0);
    }

    @ObfuscatedName("dy.w(I)Laj;")
    public final class48 method2504() {
        return this.field1951;
    }
}
