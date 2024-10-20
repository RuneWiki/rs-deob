package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dm")
public class class123 implements Runnable {

    @ObfuscatedName("dm.k")
    public class47 field1942;

    @ObfuscatedName("dm.v")
    public class133 field1940 = null;

    @ObfuscatedName("dm.l")
    public class133 field1944 = null;

    @ObfuscatedName("dm.g")
    public Thread field1945;

    @ObfuscatedName("dm.a")
    public boolean field1954 = false;

    @ObfuscatedName("dm.x")
    public EventQueue field1947;

    public class123() {
        Statics.field1955 = "Unknown";
        Statics.field1950 = "1.1";
        try {
            Statics.field1955 = System.getProperty("java.vendor");
            Statics.field1950 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1947 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1954 = false;
        this.field1945 = new Thread(this);
        this.field1945.setPriority(10);
        this.field1945.setDaemon(true);
        this.field1945.start();
    }

    @ObfuscatedName("dm.k(I)V")
    public final void method2473() {
        synchronized (this) {
            this.field1954 = true;
            this.notifyAll();
        }
        try {
            this.field1945.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1954) {
                        return;
                    }
                    if (this.field1940 != null) {
                        var2 = this.field1940;
                        this.field1940 = this.field1940.field2069;
                        if (this.field1940 == null) {
                            this.field1944 = null;
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
                int var5 = var2.field2071;
                if (var5 == 1) {
                    var2.field2066 = new Socket(InetAddress.getByName((String) var2.field2073), var2.field2067);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2073);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2067);
                    var2.field2066 = var6;
                } else if (var5 == 4) {
                    var2.field2066 = new DataInputStream(((URL) var2.field2073).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2067 >> 24 & 0xFF) + "." + (var2.field2067 >> 16 & 0xFF) + "." + (var2.field2067 >> 8 & 0xFF) + "." + (var2.field2067 & 0xFF);
                    var2.field2066 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2070 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2070 = 2;
            }
        }
    }

    @ObfuscatedName("dm.v(IIILjava/lang/Object;B)Lek;")
    public final class133 method2480(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2071 = arg0;
        var5.field2067 = arg1;
        var5.field2073 = arg3;
        synchronized (this) {
            if (this.field1944 == null) {
                this.field1944 = this.field1940 = var5;
            } else {
                this.field1944.field2069 = var5;
                this.field1944 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dm.l(Ljava/lang/String;IB)Lek;")
    public final class133 method2460(String arg0, int arg1) {
        return this.method2480(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dm.g(Ljava/lang/Runnable;IB)Lek;")
    public final class133 method2465(Runnable arg0, int arg1) {
        return this.method2480(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dm.a(II)Lek;")
    public final class133 method2461(int arg0) {
        return this.method2480(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dm.x(Ljava/net/URL;I)Lek;")
    public final class133 method2462(URL arg0) {
        return this.method2480(4, 0, 0, arg0);
    }

    @ObfuscatedName("dm.r(I)Laz;")
    public final class47 method2463() {
        return this.field1942;
    }
}
