import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 implements Runnable {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Z")
    private boolean field2365 = false;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lee;")
    public class34 field2374 = null;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Ln;")
    private class90 field2367 = null;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Ljava/applet/Applet;")
    public Applet field2366 = null;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public int field2377 = 0;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Ln;")
    private class90 field2378 = null;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Ljava/io/File;")
    public File field2369 = null;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lee;")
    public class34 field2379 = null;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Ljava/io/File;")
    private File field2382 = null;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2372;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field2381;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2373 = 3;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lpf;")
    private class110 field2380;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2370;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2371;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Ljava/lang/String;")
    private static String field2376;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2368;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2383;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[Lee;")
    public class34[] field2375;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public final void method819(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                this.field2369 = null;
            }
            this.field2365 = true;
            this.notifyAll();
        }
        try {
            this.field2381.join();
        } catch (InterruptedException var7) {
        }
        if (this.field2374 != null) {
            try {
                this.field2374.method306(-126);
            } catch (IOException var6) {
            }
        }
        if (this.field2379 != null) {
            try {
                this.field2379.method306(-55);
            } catch (IOException var5) {
            }
        }
        if (this.field2375 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2375.length; var3++) {
            if (this.field2375[var3] != null) {
                try {
                    this.field2375[var3].method306(-66);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method820(int arg0, String arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2376, "/tmp/", "" };
        boolean var6 = false;
        String[] var7 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var7[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (!var6) {
                            try {
                                File var14 = new File(var12, "uid.dat");
                                if (var8 == 1 && (!var14.exists() || var14.length() < 4L)) {
                                    int var15 = -1;
                                    Random var16 = new Random();
                                    while (var15 == -1) {
                                        var15 = var16.nextInt();
                                    }
                                    DataOutputStream var17 = new DataOutputStream(new FileOutputStream(var14));
                                    var17.writeInt(var15);
                                    var17.close();
                                }
                                if (var14.exists()) {
                                    var6 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field2377 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field2382 == null) {
                            try {
                                File var19 = new File(var12, arg1);
                                if (var8 == 1 && !var19.exists()) {
                                    boolean var20 = var19.mkdir();
                                    if (!var20) {
                                        continue;
                                    }
                                }
                                File var21 = new File(var19, "main_file_cache.dat2");
                                if (var8 == 0 && !var21.exists()) {
                                    continue;
                                }
                                this.field2374 = new class34(var21, "rw", 52428800L);
                                this.field2375 = new class34[arg2];
                                for (int var22 = 0; var22 < arg2; var22++) {
                                    this.field2375[var22] = new class34(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field2379 = new class34(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2369 = this.field2382 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field2374.method306(-102);
                                    for (int var23 = 0; var23 < arg2; var23++) {
                                        this.field2375[var23].method306(-90);
                                    }
                                    this.field2379.method306(-117);
                                } catch (Exception var24) {
                                }
                                this.field2375 = null;
                                this.field2369 = this.field2382 = null;
                                this.field2374 = this.field2379 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var6 && this.field2382 != null) {
                        return;
                    }
                }
            }
        }
        if (arg0 < 16) {
            this.method827(-73, (byte) -122);
        }
        if (this.field2382 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Lpf;")
    public final class110 method821(boolean arg0) {
        if (!arg0) {
            this.field2366 = null;
        }
        return this.field2380;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;I)Ln;")
    public final class90 method822(int arg0, String arg1, int arg2) {
        if (arg0 != -10176) {
            this.method822(82, null, -67);
        }
        return this.method824(arg1, 1, 0, 65, arg2);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BILjava/lang/Runnable;)Ln;")
    public final class90 method823(byte arg0, int arg1, Runnable arg2) {
        if (arg0 > -71) {
            this.method828(121, null);
        }
        return this.method824(arg2, 2, 0, 56, arg1);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/Object;IIII)Ln;")
    private final class90 method824(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class90 var6 = new class90();
        var6.field2085 = arg0;
        var6.field2088 = arg4;
        if (arg3 < 26) {
            this.method823((byte) 43, -96, null);
        }
        var6.field2086 = arg1;
        synchronized (this) {
            if (this.field2367 == null) {
                this.field2367 = this.field2378 = var6;
            } else {
                this.field2367.field2089 = var6;
                this.field2367 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!oc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class90 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2365) {
                        return;
                    }
                    if (this.field2378 != null) {
                        var2 = this.field2378;
                        this.field2378 = this.field2378.field2089;
                        if (this.field2378 == null) {
                            this.field2367 = null;
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
                int var3 = var2.field2086;
                if (var3 == 1) {
                    var2.field2090 = new Socket(InetAddress.getByName((String) var2.field2085), var2.field2088);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2085);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2088);
                    var2.field2090 = var4;
                } else if (var3 == 4) {
                    var2.field2090 = new DataInputStream(((URL) var2.field2085).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field2085;
                    var2.field2090 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2085;
                    var2.field2090 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2087 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2087 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Ln;")
    public final class90 method825(String arg0, Class[] arg1, byte arg2, Class arg3) {
        if (arg2 > -68) {
            this.field2380 = null;
        }
        return this.method824(new Object[] { arg3, arg0, arg1 }, 8, 0, 81, 0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ln;")
    public final class90 method826(String arg0, int arg1, Class arg2) {
        if (arg1 != 0) {
            field2373 = 102;
        }
        return this.method824(new Object[] { arg2, arg0 }, 9, 0, 91, 0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Ln;")
    public final class90 method827(int arg0, byte arg1) {
        if (arg1 >= -122) {
            field2370 = null;
        }
        return this.method824(null, 3, 0, 31, arg0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/net/URL;)Ln;")
    public final class90 method828(int arg0, URL arg1) {
        return arg0 == 0 ? this.method824(arg1, 4, 0, 61, 0) : null;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class100(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field2371 = "1.1";
        this.field2366 = arg1;
        field2370 = "Unknown";
        try {
            field2370 = System.getProperty("java.vendor");
            field2371 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field2376 = System.getProperty("user.home");
            if (field2376 != null) {
                field2376 = field2376 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2376 == null) {
            field2376 = "~/";
        }
        try {
            this.field2372 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2368 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2368 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2383 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2383 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method820(70, arg3, arg4, arg2);
        }
        this.field2365 = false;
        this.field2381 = new Thread(this);
        this.field2381.setPriority(10);
        this.field2381.setDaemon(true);
        this.field2381.start();
    }
}
