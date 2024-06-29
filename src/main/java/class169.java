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

@OriginalClass("client!rh")
public class class169 implements Runnable {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Ljava/io/File;")
    public File field3295 = null;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Z")
    private boolean field3302 = false;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Ltd;")
    private class183 field3305 = null;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lkh;")
    public class106 field3300 = null;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lkh;")
    public class106 field3306 = null;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Ljava/io/File;")
    private File field3308 = null;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "Ljava/applet/Applet;")
    public Applet field3312 = null;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Ltd;")
    private class183 field3311 = null;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lkh;")
    public class106 field3307 = null;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3294;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field3296;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3299 = 3;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Lr;")
    private class161 field3310;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Ljava/lang/String;")
    private static String field3297;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3301;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3309;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3298;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3303;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "[Lkh;")
    public class106[] field3304;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/net/URL;)Ltd;")
    public final class183 method1119(int arg0, URL arg1) {
        if (arg0 != 2) {
            this.field3305 = null;
        }
        return this.method1126(0, 123, 4, arg1, 0);
    }

    @OriginalMember(owner = "client!rh", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class183 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3302) {
                        return;
                    }
                    if (this.field3311 != null) {
                        var2 = this.field3311;
                        this.field3311 = this.field3311.field3473;
                        if (this.field3311 == null) {
                            this.field3305 = null;
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
                int var3 = var2.field3475;
                if (var3 == 1) {
                    var2.field3474 = new Socket(InetAddress.getByName((String) var2.field3472), var2.field3477);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3472);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3477);
                    var2.field3474 = var6;
                } else if (var3 == 4) {
                    var2.field3474 = new DataInputStream(((URL) var2.field3472).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3472;
                    var2.field3474 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3472;
                    var2.field3474 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3476 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3476 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)Ltd;")
    public final class183 method1120(int arg0, boolean arg1) {
        if (arg1) {
            this.method1120(-34, true);
        }
        return this.method1126(arg0, 119, 3, null, 0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public final void method1121(int arg0) {
        synchronized (this) {
            this.field3302 = true;
            this.notifyAll();
        }
        try {
            this.field3296.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3307 != null) {
            try {
                this.field3307.method725((byte) 50);
            } catch (IOException var7) {
            }
        }
        if (arg0 != -20500) {
            return;
        }
        if (this.field3300 != null) {
            try {
                this.field3300.method725((byte) 50);
            } catch (IOException var6) {
            }
        }
        if (this.field3304 != null) {
            for (int var3 = 0; var3 < this.field3304.length; var3++) {
                if (this.field3304[var3] != null) {
                    try {
                        this.field3304[var3].method725((byte) 50);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3306 != null) {
            try {
                this.field3306.method725((byte) 50);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ltd;")
    public final class183 method1122(Class arg0, String arg1, byte arg2) {
        if (arg2 < 38) {
            this.field3296 = null;
        }
        return this.method1126(0, 117, 9, new Object[] { arg0, arg1 }, 0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;II)Ltd;")
    public final class183 method1123(String arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.run();
        }
        return this.method1126(arg2, 126, 1, arg0, 0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ltd;")
    public final class183 method1124(int arg0, Class arg1, String arg2, Class[] arg3) {
        return arg0 >= -103 ? null : this.method1126(0, 125, 8, new Object[] { arg1, arg2, arg3 }, 0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ltd;")
    public final class183 method1125(Runnable arg0, int arg1, int arg2) {
        if (arg2 != 17258) {
            field3299 = 49;
        }
        return this.method1126(arg1, 118, 2, arg0, 0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILjava/lang/Object;I)Ltd;")
    private final class183 method1126(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class183 var6 = new class183();
        var6.field3475 = arg2;
        var6.field3472 = arg3;
        var6.field3477 = arg0;
        synchronized (this) {
            if (this.field3305 == null) {
                this.field3305 = this.field3311 = var6;
            } else {
                this.field3305.field3473 = var6;
                this.field3305 = var6;
            }
            this.notify();
        }
        if (arg1 <= 114) {
            this.field3295 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIILjava/lang/String;)V")
    private final void method1127(boolean arg0, int arg1, int arg2, String arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3297, "/tmp/", "" };
        if (arg0) {
            return;
        }
        for (int var7 = 0; var7 < 2; var7++) {
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
                        if (this.field3306 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field3306 = new class106(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field3306 = null;
                            }
                        }
                        if (this.field3308 == null) {
                            try {
                                File var14 = new File(var11, arg3);
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
                                this.field3307 = new class106(var16, "rw", 104857600L);
                                this.field3304 = new class106[arg1];
                                for (int var17 = 0; var17 < arg1; var17++) {
                                    this.field3304[var17] = new class106(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field3300 = new class106(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3295 = this.field3308 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field3307.method725((byte) 50);
                                    for (int var18 = 0; var18 < arg1; var18++) {
                                        this.field3304[var18].method725((byte) 50);
                                    }
                                    this.field3300.method725((byte) 50);
                                } catch (Exception var19) {
                                }
                                this.field3304 = null;
                                this.field3295 = this.field3308 = null;
                                this.field3307 = this.field3300 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field3306 != null && this.field3308 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3308 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lr;")
    public final class161 method1128(byte arg0) {
        if (arg0 != 8) {
            this.method1122(null, null, (byte) 41);
        }
        return this.field3310;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class169(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field3312 = arg1;
        field3301 = "Unknown";
        field3309 = "1.1";
        try {
            field3301 = System.getProperty("java.vendor");
            field3309 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3297 = System.getProperty("user.home");
            if (field3297 != null) {
                field3297 = field3297 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3297 == null) {
            field3297 = "~/";
        }
        try {
            this.field3294 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3298 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3298 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3303 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3303 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1127(false, arg4, arg2, arg3);
        }
        this.field3302 = false;
        this.field3296 = new Thread(this);
        this.field3296.setPriority(10);
        this.field3296.setDaemon(true);
        this.field3296.start();
    }
}
