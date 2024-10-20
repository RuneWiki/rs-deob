package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dl")
public class class123 implements Runnable {

    @ObfuscatedName("dl.z")
    public class47 field1953;

    @ObfuscatedName("dl.h")
    public class133 field1954 = null;

    @ObfuscatedName("dl.k")
    public class133 field1955 = null;

    @ObfuscatedName("dl.l")
    public Thread field1956;

    @ObfuscatedName("dl.e")
    public boolean field1957 = false;

    @ObfuscatedName("dl.j")
    public EventQueue field1961;

    public class123() {
        Statics.field1962 = "Unknown";
        Statics.field1920 = "1.1";
        try {
            Statics.field1962 = System.getProperty("java.vendor");
            Statics.field1920 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1961 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1957 = false;
        this.field1956 = new Thread(this);
        this.field1956.setPriority(10);
        this.field1956.setDaemon(true);
        this.field1956.start();
    }

    @ObfuscatedName("dl.z(I)V")
    public final void method2491() {
        synchronized (this) {
            this.field1957 = true;
            this.notifyAll();
        }
        try {
            this.field1956.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1957) {
                        return;
                    }
                    if (this.field1954 != null) {
                        var2 = this.field1954;
                        this.field1954 = this.field1954.field2077;
                        if (this.field1954 == null) {
                            this.field1955 = null;
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
                int var5 = var2.field2082;
                if (var5 == 1) {
                    var2.field2083 = new Socket(InetAddress.getByName((String) var2.field2084), var2.field2085);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2084);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2085);
                    var2.field2083 = var6;
                } else if (var5 == 4) {
                    var2.field2083 = new DataInputStream(((URL) var2.field2084).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2085 >> 24 & 0xFF) + "." + (var2.field2085 >> 16 & 0xFF) + "." + (var2.field2085 >> 8 & 0xFF) + "." + (var2.field2085 & 0xFF);
                    var2.field2083 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2081 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2081 = 2;
            }
        }
    }

    @ObfuscatedName("dl.h(IIILjava/lang/Object;I)Lew;")
    public final class133 method2470(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2082 = arg0;
        var5.field2085 = arg1;
        var5.field2084 = arg3;
        synchronized (this) {
            if (this.field1955 == null) {
                this.field1955 = this.field1954 = var5;
            } else {
                this.field1955.field2077 = var5;
                this.field1955 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dl.k(Ljava/lang/String;II)Lew;")
    public final class133 method2468(String arg0, int arg1) {
        return this.method2470(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dl.l(Ljava/lang/Runnable;II)Lew;")
    public final class133 method2472(Runnable arg0, int arg1) {
        return this.method2470(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dl.e(II)Lew;")
    public final class133 method2473(int arg0) {
        return this.method2470(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dl.j(Ljava/net/URL;S)Lew;")
    public final class133 method2474(URL arg0) {
        return this.method2470(4, 0, 0, arg0);
    }

    @ObfuscatedName("dl.n(B)Lah;")
    public final class47 method2484() {
        return this.field1953;
    }
}
