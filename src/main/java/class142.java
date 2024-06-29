import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Ljava/io/File;")
    public File field2294 = null;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "Lfi;")
    public class6 field2297 = null;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Lni;")
    private class118 field2300 = null;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Ljava/io/File;")
    private File field2302 = null;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Z")
    private boolean field2301 = false;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lfi;")
    public class6 field2293 = null;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Lni;")
    private class118 field2299 = null;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field2285 = null;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Lfi;")
    public class6 field2307 = null;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2292;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field2289;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field2296 = 3;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Lui;")
    private class105 field2286;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2287;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2290;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2295;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Ljava/lang/String;")
    private static String field2303;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2304;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2305;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2306;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2291;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2298;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[Lfi;")
    public class6[] field2288;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Lui;")
    public final class105 method906(int arg0) {
        return arg0 == 3 ? this.field2286 : null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method907(int arg0, String arg1, int arg2, int arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2303, "/tmp/", "" };
        for (int var7 = arg3; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var5.length; var8++) {
                for (int var9 = 0; var9 < var6.length; var9++) {
                    try {
                        String var10 = var6[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var5[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field2307 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2307 = new class6(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2307 = null;
                            }
                        }
                        if (this.field2302 == null) {
                            try {
                                File var14 = new File(var11, arg1);
                                if (var7 == 1 && !var14.exists()) {
                                    boolean var15 = var14.mkdir();
                                    if (!var15) {
                                        continue;
                                    }
                                }
                                File var16 = new File(var14, "main_file_cache.dat2");
                                if (var7 == 0 && !var16.exists()) {
                                    continue;
                                }
                                this.field2293 = new class6(var16, "rw", 104857600L);
                                this.field2288 = new class6[arg2];
                                for (int var17 = 0; var17 < arg2; var17++) {
                                    this.field2288[var17] = new class6(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2297 = new class6(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2294 = this.field2302 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2293.method49(false);
                                    for (int var18 = 0; var18 < arg2; var18++) {
                                        this.field2288[var18].method49(false);
                                    }
                                    this.field2297.method49(false);
                                } catch (Exception var19) {
                                }
                                this.field2294 = this.field2302 = null;
                                this.field2288 = null;
                                this.field2293 = this.field2297 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2307 != null && this.field2302 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2302 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILjava/lang/Object;II)Lni;")
    private final class118 method908(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class118 var6 = new class118();
        var6.field1934 = arg2;
        var6.field1937 = arg4;
        var6.field1932 = arg3;
        synchronized (this) {
            if (this.field2299 == null) {
                this.field2299 = this.field2300 = var6;
            } else {
                this.field2299.field1936 = var6;
                this.field2299 = var6;
            }
            this.notify();
            if (arg1 <= 47) {
                this.method906(-38);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ej", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class118 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2301) {
                        return;
                    }
                    if (this.field2300 != null) {
                        var2 = this.field2300;
                        this.field2300 = this.field2300.field1936;
                        if (this.field2300 == null) {
                            this.field2299 = null;
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
                int var3 = var2.field1937;
                if (var3 == 1) {
                    var2.field1935 = new Socket(InetAddress.getByName((String) var2.field1934), var2.field1932);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1934);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1932);
                    var2.field1935 = var6;
                } else if (var3 == 4) {
                    var2.field1935 = new DataInputStream(((URL) var2.field1934).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1934;
                    var2.field1935 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field1934;
                    var2.field1935 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field1933 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1933 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLjava/lang/Class;)Lni;")
    public final class118 method909(boolean arg0, Class arg1) {
        if (!arg0) {
            field2298 = null;
        }
        return this.method908(0, 62, arg1, 0, 11);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;B)Lni;")
    public final class118 method910(String arg0, byte arg1) {
        int var3 = 15 % ((54 - arg1) / 44);
        return this.method908(0, 65, arg0, 0, 12);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Lni;")
    public final class118 method911(int arg0, byte arg1) {
        if (arg1 >= -58) {
            this.field2289 = null;
        }
        return this.method908(0, 63, (Object) null, arg0, 3);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/net/URL;Z)Lni;")
    public final class118 method912(URL arg0, boolean arg1) {
        if (!arg1) {
            this.method906(-104);
        }
        return this.method908(0, 86, arg0, 0, 4);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lni;")
    public final class118 method913(String arg0, Class arg1, int arg2) {
        int var4 = 114 % ((38 - arg2) / 54);
        return this.method908(0, 118, new Object[] { arg1, arg0 }, 0, 9);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public final void method914(int arg0) {
        synchronized (this) {
            this.field2301 = true;
            this.notifyAll();
        }
        if (arg0 != 0) {
            this.field2307 = null;
        }
        try {
            this.field2289.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2293 != null) {
            try {
                this.field2293.method49(false);
            } catch (IOException var7) {
            }
        }
        if (this.field2297 != null) {
            try {
                this.field2297.method49(false);
            } catch (IOException var6) {
            }
        }
        if (this.field2288 != null) {
            for (int var3 = 0; var3 < this.field2288.length; var3++) {
                if (this.field2288[var3] != null) {
                    try {
                        this.field2288[var3].method49(false);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2307 != null) {
            try {
                this.field2307.method49(false);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILjava/lang/String;)Lni;")
    public final class118 method915(int arg0, int arg1, String arg2) {
        return arg1 == 0 ? this.method908(0, 77, arg2, arg0, 1) : null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/Class;)Lni;")
    public final class118 method916(int arg0, Class arg1) {
        if (arg0 != -16473) {
            field2306 = null;
        }
        return this.method908(0, 117, arg1, 0, 13);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lni;")
    public final class118 method917(Class[] arg0, String arg1, Class arg2, int arg3) {
        return arg3 == 8 ? this.method908(0, arg3 + 53, new Object[] { arg2, arg1, arg0 }, 0, 8) : null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILjava/lang/Runnable;)Lni;")
    public final class118 method918(int arg0, int arg1, Runnable arg2) {
        return arg1 == 0 ? this.method908(0, 107, arg2, arg0, 2) : null;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class142(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field2285 = arg1;
        field2295 = "1.1";
        field2287 = "Unknown";
        try {
            field2287 = System.getProperty("java.vendor");
            field2295 = System.getProperty("java.version");
        } catch (Exception var13) {
        }
        try {
            field2304 = System.getProperty("os.name");
        } catch (Exception var12) {
            field2304 = "Unknown";
        }
        field2305 = field2304.toLowerCase();
        try {
            field2290 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var11) {
            field2290 = "";
        }
        try {
            field2306 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var10) {
            field2306 = "";
        }
        try {
            field2303 = System.getProperty("user.home");
            if (field2303 != null) {
                field2303 = field2303 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2303 == null) {
            field2303 = "~/";
        }
        try {
            this.field2292 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2298 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2298 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2291 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2291 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method907(arg2, arg3, arg4, 0);
        }
        this.field2301 = false;
        this.field2289 = new Thread(this);
        this.field2289.setPriority(10);
        this.field2289.setDaemon(true);
        this.field2289.start();
    }
}
