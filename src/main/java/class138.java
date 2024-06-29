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

@OriginalClass("client!n")
public class class138 implements Runnable {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    private boolean field2392 = false;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lfb;")
    private class9 field2395 = null;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Ljava/io/File;")
    private File field2394 = null;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lfh;")
    public class180 field2388 = null;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lfb;")
    private class9 field2396 = null;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lfh;")
    public class180 field2405 = null;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Ljava/applet/Applet;")
    public Applet field2408 = null;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Lfh;")
    public class180 field2409 = null;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Ljava/io/File;")
    public File field2404 = null;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2406;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Ljava/lang/Thread;")
    private Thread field2410;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field2402 = 3;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lqg;")
    private class181 field2407;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2389;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2390;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2391;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2397;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Ljava/lang/String;")
    private static String field2398;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2399;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2400;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2401;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2403;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[Lfh;")
    public class180[] field2393;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/Class;B)Lfb;")
    public final class9 method955(Class arg0, byte arg1) {
        if (arg1 < 86) {
            this.method958(-80);
        }
        return this.method967(11, -2, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lfb;")
    public final class9 method956(Runnable arg0, byte arg1, int arg2) {
        if (arg1 >= -114) {
            this.method965((String) null, -68);
        }
        return this.method967(2, -2, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/net/URL;B)Lfb;")
    public final class9 method957(URL arg0, byte arg1) {
        return arg1 == 110 ? this.method967(4, -2, 0, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public final void method958(int arg0) {
        synchronized (this) {
            this.field2392 = true;
            this.notifyAll();
        }
        try {
            this.field2410.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2409 != null) {
            try {
                this.field2409.method1227(-104);
            } catch (IOException var7) {
            }
        }
        if (arg0 <= 2) {
            this.field2393 = null;
        }
        if (this.field2405 != null) {
            try {
                this.field2405.method1227(-57);
            } catch (IOException var6) {
            }
        }
        if (this.field2393 != null) {
            for (int var3 = 0; var3 < this.field2393.length; var3++) {
                if (this.field2393[var3] != null) {
                    try {
                        this.field2393[var3].method1227(-94);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2388 != null) {
            try {
                this.field2388.method1227(69);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lfb;")
    public final class9 method959(byte arg0, int arg1) {
        return arg0 == 95 ? this.method967(3, -2, arg1, (Object) null, 0) : null;
    }

    @OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class9 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2392) {
                        return;
                    }
                    if (this.field2395 != null) {
                        var2 = this.field2395;
                        this.field2395 = this.field2395.field130;
                        if (this.field2395 == null) {
                            this.field2396 = null;
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
                int var3 = var2.field129;
                if (var3 == 1) {
                    var2.field132 = new Socket(InetAddress.getByName((String) var2.field131), var2.field128);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field131);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field128);
                    var2.field132 = var6;
                } else if (var3 == 4) {
                    var2.field132 = new DataInputStream(((URL) var2.field131).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field131;
                    var2.field132 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field131;
                    var2.field132 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field133 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field133 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Lqg;")
    public final class181 method960(byte arg0) {
        return arg0 == -97 ? this.field2407 : null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Lfb;")
    public final class9 method961(String arg0, boolean arg1, Class arg2) {
        if (arg1) {
            this.method956((Runnable) null, (byte) 72, -117);
        }
        return this.method967(9, -2, 0, new Object[] { arg2, arg0 }, 0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B[Ljava/lang/Class;)Lfb;")
    public final class9 method962(Class arg0, String arg1, byte arg2, Class[] arg3) {
        return arg2 <= 92 ? null : this.method967(8, -2, 0, new Object[] { arg0, arg1, arg3 }, 0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBILjava/lang/String;)V")
    private final void method963(int arg0, byte arg1, int arg2, String arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2398, "/tmp/", "" };
        if (arg1 < 82) {
            this.method964((Class) null, -120);
        }
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
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
                        if (this.field2388 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2388 = new class180(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2388 = null;
                            }
                        }
                        if (this.field2394 == null) {
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
                                this.field2409 = new class180(var16, "rw", 104857600L);
                                this.field2393 = new class180[arg0];
                                for (int var17 = 0; var17 < arg0; var17++) {
                                    this.field2393[var17] = new class180(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2405 = new class180(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2404 = this.field2394 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2409.method1227(112);
                                    for (int var18 = 0; var18 < arg0; var18++) {
                                        this.field2393[var18].method1227(-124);
                                    }
                                    this.field2405.method1227(-109);
                                } catch (Exception var19) {
                                }
                                this.field2393 = null;
                                this.field2409 = this.field2405 = null;
                                this.field2404 = this.field2394 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2388 != null && this.field2394 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2394 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/Class;I)Lfb;")
    public final class9 method964(Class arg0, int arg1) {
        return arg1 == -10939 ? this.method967(13, arg1 ^ 0x2ABB, 0, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;I)Lfb;")
    public final class9 method965(String arg0, int arg1) {
        if (arg1 != 0) {
            field2391 = null;
        }
        return this.method967(12, -2, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/lang/String;I)Lfb;")
    public final class9 method966(byte arg0, String arg1, int arg2) {
        if (arg0 != 51) {
            field2401 = null;
        }
        return this.method967(1, -2, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILjava/lang/Object;I)Lfb;")
    private final class9 method967(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg1 != -2) {
            this.method963(-29, (byte) 41, 36, (String) null);
        }
        class9 var6 = new class9();
        var6.field131 = arg3;
        var6.field129 = arg0;
        var6.field128 = arg2;
        synchronized (this) {
            if (this.field2396 == null) {
                this.field2396 = this.field2395 = var6;
            } else {
                this.field2396.field130 = var6;
                this.field2396 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class138(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field2408 = arg1;
        field2390 = "1.1";
        field2397 = "Unknown";
        try {
            field2397 = System.getProperty("java.vendor");
            field2390 = System.getProperty("java.version");
        } catch (Exception var13) {
        }
        try {
            field2391 = System.getProperty("os.name");
        } catch (Exception var12) {
            field2391 = "Unknown";
        }
        field2389 = field2391.toLowerCase();
        try {
            field2400 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var11) {
            field2400 = "";
        }
        try {
            field2399 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var10) {
            field2399 = "";
        }
        try {
            field2398 = System.getProperty("user.home");
            if (field2398 != null) {
                field2398 = field2398 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2398 == null) {
            field2398 = "~/";
        }
        try {
            this.field2406 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2401 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2401 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2403 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2403 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method963(arg4, (byte) 125, arg2, arg3);
        }
        this.field2392 = false;
        this.field2410 = new Thread(this);
        this.field2410.setPriority(10);
        this.field2410.setDaemon(true);
        this.field2410.start();
    }
}
