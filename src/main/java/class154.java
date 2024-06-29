import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
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

@OriginalClass("client!hf")
public class class154 implements Runnable {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/io/File;")
    private File field2260 = null;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field2262 = null;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Z")
    private boolean field2274 = false;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lrl;")
    public class291 field2261 = null;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljava/io/File;")
    public File field2266 = null;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Lrl;")
    public class291 field2273 = null;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Loi;")
    private class32 field2277 = null;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Loi;")
    private class32 field2279 = null;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lrl;")
    public class291 field2269 = null;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2276;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field2281;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field2278 = 3;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lmd;")
    private class215 field2263;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2264;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2267;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2268;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2271;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Ljava/lang/String;")
    private static String field2275;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2280;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2282;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2265;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2270;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "[Lrl;")
    public class291[] field2272;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZLjava/lang/String;I)V", line = 11)
    private final void method972(int arg0, boolean arg1, String arg2, int arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2275, "/tmp/", "" };
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    try {
                        String var10 = var5[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var6[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field2273 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2273 = new class291(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field2273 = null;
                            }
                        }
                        if (this.field2260 == null) {
                            try {
                                File var15 = new File(var11, arg2);
                                if (var7 == 1 && !var15.exists()) {
                                    boolean var16 = var15.mkdir();
                                    if (!var16) {
                                        continue;
                                    }
                                }
                                File var17 = new File(var15, "main_file_cache.dat2");
                                if (var7 == 0 && !var17.exists()) {
                                    continue;
                                }
                                this.field2261 = new class291(var17, "rw", 104857600L);
                                this.field2272 = new class291[arg0];
                                for (int var18 = 0; var18 < arg0; var18++) {
                                    this.field2272[var18] = new class291(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field2269 = new class291(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2266 = this.field2260 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field2261.method1966(1);
                                    for (int var20 = 0; var20 < arg0; var20++) {
                                        this.field2272[var20].method1966(1);
                                    }
                                    this.field2269.method1966(1);
                                } catch (Exception var23) {
                                }
                                this.field2261 = this.field2269 = null;
                                this.field2272 = null;
                                this.field2266 = this.field2260 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field2273 != null && this.field2260 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2260 == null) {
            throw new RuntimeException();
        } else if (!arg1) {
            this.method989(92, -101, -29, -93, -104);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;I)Loi;", line = 181)
    public final class32 method973(Class arg0, int arg1) {
        return arg1 == 11 ? this.method987(arg1 - 6, 11, 0, arg0, 0) : (class32) null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Loi;", line = 192)
    public final class32 method974(Class arg0, String arg1, int arg2) {
        if (arg2 < 33) {
            this.field2263 = (class215) null;
        }
        return this.method987(5, 9, 0, new Object[] { arg0, arg1 }, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/awt/Frame;B)Loi;", line = 202)
    public final class32 method975(Frame arg0, byte arg1) {
        if (arg1 <= 50) {
            this.field2281 = (Thread) null;
        }
        return this.method987(5, 7, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)Loi;", line = 213)
    public final class32 method976(boolean arg0, int arg1) {
        if (arg0) {
            field2280 = (String) null;
        }
        return this.method987(5, 3, 0, (Object) null, arg1);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Z", line = 225)
    public final boolean method977(int arg0) {
        if (arg0 != 11) {
            this.method981((byte) 17, (URL) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;ZI)Loi;", line = 241)
    public final class32 method978(String arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method977(118);
        }
        return this.method987(5, 1, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZLjava/awt/Component;)Loi;", line = 252)
    public final class32 method979(boolean arg0, boolean arg1, Component arg2) {
        return arg0 ? this.method987(5, 15, 0, arg2, arg1 ? 1 : 0) : (class32) null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/lang/Class;)Loi;", line = 263)
    public final class32 method980(byte arg0, Class arg1) {
        return arg0 == 26 ? this.method987(5, 13, 0, arg1, 0) : (class32) null;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 607)
    public class154(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field2280 = "Unknown";
        this.field2262 = arg1;
        field2271 = "1.1";
        try {
            field2280 = System.getProperty("java.vendor");
            field2271 = System.getProperty("java.version");
        } catch (Exception var25) {
        }
        try {
            field2282 = System.getProperty("os.name");
        } catch (Exception var24) {
            field2282 = "Unknown";
        }
        field2268 = field2282.toLowerCase();
        try {
            field2267 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var23) {
            field2267 = "";
        }
        try {
            field2264 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var22) {
            field2264 = "";
        }
        try {
            field2275 = System.getProperty("user.home");
            if (field2275 != null) {
                field2275 = field2275 + "/";
            }
        } catch (Exception var21) {
        }
        if (field2275 == null) {
            field2275 = "~/";
        }
        try {
            this.field2276 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var20) {
        }
        try {
            if (arg1 == null) {
                field2265 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2265 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var19) {
        }
        try {
            if (arg1 == null) {
                field2270 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2270 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var18) {
        }
        if (arg0) {
            this.method972(arg4, true, arg3, arg2);
        }
        if (arg0) {
            ThreadGroup var14 = Thread.currentThread().getThreadGroup();
            Thread[] var15 = new Thread[1000];
            for (ThreadGroup var16 = var14.getParent(); var16 != null; var16 = var16.getParent()) {
                var14 = var16;
            }
            var14.enumerate(var15);
            for (int var17 = 0; var17 < var15.length; var17++) {
                if (var15[var17] != null && var15[var17].getName().startsWith("AWT")) {
                    var15[var17].setPriority(1);
                }
            }
        }
        this.field2274 = false;
        this.field2281 = new Thread(this);
        this.field2281.setPriority(10);
        this.field2281.setDaemon(true);
        this.field2281.start();
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/net/URL;)Loi;", line = 295)
    public final class32 method981(byte arg0, URL arg1) {
        if (arg0 != -13) {
            this.method982(-59);
        }
        return this.method987(5, 4, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lmd;", line = 306)
    public final class215 method982(int arg0) {
        if (arg0 != 11) {
            this.method987(-10, 39, 26, (Object) null, 43);
        }
        return this.field2263;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)Loi;", line = 323)
    public final class32 method983(int arg0) {
        if (arg0 >= -101) {
            this.method981((byte) 23, (URL) null);
        }
        return this.method987(5, 5, 0, (Object) null, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;Z)Loi;", line = 342)
    public final class32 method984(Class arg0, boolean arg1) {
        return arg1 ? (class32) null : this.method987(5, 10, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V", line = 354)
    public final void method985(int arg0) {
        synchronized (this) {
            if (arg0 > -88) {
                return;
            }
            this.field2274 = true;
            this.notifyAll();
        }
        try {
            this.field2281.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2261 != null) {
            try {
                this.field2261.method1966(1);
            } catch (IOException var13) {
            }
        }
        if (this.field2269 != null) {
            try {
                this.field2269.method1966(1);
            } catch (IOException var12) {
            }
        }
        if (this.field2272 != null) {
            for (int var7 = 0; var7 < this.field2272.length; var7++) {
                if (this.field2272[var7] != null) {
                    try {
                        this.field2272[var7].method1966(1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2273 != null) {
            try {
                this.field2273.method1966(1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/awt/Component;ZII)Loi;", line = 412)
    public final class32 method986(Component arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.method991((Runnable) null, false, -57);
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method987(5, 14, var5.y + arg3, (Object) null, var5.x + arg2);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILjava/lang/Object;I)Loi;", line = 428)
    private final class32 method987(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg0 != 5) {
            field2275 = (String) null;
        }
        class32 var6 = new class32();
        var6.field494 = arg1;
        var6.field498 = arg4;
        var6.field495 = arg3;
        synchronized (this) {
            if (this.field2277 == null) {
                this.field2277 = this.field2279 = var6;
            } else {
                this.field2277.field493 = var6;
                this.field2277 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Loi;", line = 457)
    public final class32 method988(Class[] arg0, int arg1, Class arg2, String arg3) {
        if (arg1 != 0) {
            this.method977(108);
        }
        return this.method987(5, 8, 0, new Object[] { arg2, arg3, arg0 }, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)Loi;", line = 467)
    public final class32 method989(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -5066) {
            this.field2262 = (Applet) null;
        }
        return this.method987(5, 6, (arg3 << 16) + arg1, (Object) null, (arg4 << 16) + arg0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Z)Loi;", line = 481)
    public final class32 method990(String arg0, boolean arg1) {
        if (!arg1) {
            this.field2279 = (class32) null;
        }
        return this.method987(5, 12, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Loi;", line = 495)
    public final class32 method991(Runnable arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field2277 = (class32) null;
        }
        return this.method987(5, 2, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!hf", name = "run", descriptor = "()V", line = 520)
    public final void run() {
        while (true) {
            class32 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2274) {
                        return;
                    }
                    if (this.field2279 != null) {
                        var2 = this.field2279;
                        this.field2279 = this.field2279.field493;
                        if (this.field2279 == null) {
                            this.field2277 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field494;
                if (var5 == 1) {
                    var2.field496 = new Socket(InetAddress.getByName((String) var2.field495), var2.field498);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field495);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field498);
                    var2.field496 = var6;
                } else if (var5 == 4) {
                    var2.field496 = new DataInputStream(((URL) var2.field495).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field495);
                    var2.field496 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field495);
                    var2.field496 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field497 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field497 = 2;
            }
        }
    }
}
