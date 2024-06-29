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

@OriginalClass("client!rf")
public class class160 implements Runnable {

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lkc;")
    public class94 field3236 = null;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Z")
    private boolean field3233 = false;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lpe;")
    private class141 field3230 = null;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Ljava/io/File;")
    private File field3240 = null;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Lkc;")
    public class94 field3241 = null;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field3231 = null;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lkc;")
    public class94 field3239 = null;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lpe;")
    private class141 field3243 = null;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Ljava/io/File;")
    public File field3246 = null;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3245;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field3234;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field3237 = 3;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lsb;")
    private class165 field3242;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3232;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3235;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Ljava/lang/String;")
    private static String field3238;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3229;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3244;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[Lkc;")
    public class94[] field3228;

    @OriginalMember(owner = "client!rf", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class141 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3233) {
                        return;
                    }
                    if (this.field3230 != null) {
                        var2 = this.field3230;
                        this.field3230 = this.field3230.field2926;
                        if (this.field3230 == null) {
                            this.field3243 = null;
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
                int var3 = var2.field2928;
                if (var3 == 1) {
                    var2.field2930 = new Socket(InetAddress.getByName((String) var2.field2925), var2.field2929);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2925);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2929);
                    var2.field2930 = var4;
                } else if (var3 == 4) {
                    var2.field2930 = new DataInputStream(((URL) var2.field2925).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field2925;
                    var2.field2930 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2925;
                    var2.field2930 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2927 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2927 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Lpe;")
    public final class141 method1004(Class arg0, int arg1, Class[] arg2, String arg3) {
        if (arg1 >= -45) {
            this.method1007(31, null, -94, -111, -60);
        }
        return this.method1007(8, new Object[] { arg0, arg3, arg2 }, 0, 0, 24);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILjava/lang/String;)Lpe;")
    public final class141 method1005(int arg0, int arg1, String arg2) {
        int var4 = 21 % ((arg0 - 77) / 47);
        return this.method1007(1, arg2, 0, arg1, -107);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method1006(String arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 34) {
            this.run();
        }
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3238, "/tmp/", "" };
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
                        if (this.field3236 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field3236 = new class94(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field3236 = null;
                            }
                        }
                        if (this.field3240 == null) {
                            try {
                                File var14 = new File(var11, arg0);
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
                                this.field3241 = new class94(var16, "rw", 104857600L);
                                this.field3228 = new class94[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field3228[var17] = new class94(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field3239 = new class94(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3246 = this.field3240 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field3241.method603(-1);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field3228[var18].method603(-1);
                                    }
                                    this.field3239.method603(-1);
                                } catch (Exception var19) {
                                }
                                this.field3246 = this.field3240 = null;
                                this.field3228 = null;
                                this.field3241 = this.field3239 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field3236 != null && this.field3240 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3240 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/lang/Object;III)Lpe;")
    private final class141 method1007(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class141 var6 = new class141();
        var6.field2928 = arg0;
        var6.field2925 = arg1;
        var6.field2929 = arg3;
        int var7 = -55 / ((arg4 + 19) / 36);
        synchronized (this) {
            if (this.field3243 == null) {
                this.field3243 = this.field3230 = var6;
            } else {
                this.field3243.field2926 = var6;
                this.field3243 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lpe;")
    public final class141 method1008(Class arg0, String arg1, int arg2) {
        if (arg2 != -22579) {
            this.field3243 = null;
        }
        return this.method1007(9, new Object[] { arg0, arg1 }, 0, 0, 112);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lpe;")
    public final class141 method1009(int arg0, int arg1) {
        return arg0 == 10037 ? this.method1007(3, null, 0, arg1, arg0 ^ 0x277B) : null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method1010(int arg0) {
        synchronized (this) {
            if (arg0 != 5822) {
                return;
            }
            this.field3233 = true;
            this.notifyAll();
        }
        try {
            this.field3234.join();
        } catch (InterruptedException var10) {
        }
        if (this.field3241 != null) {
            try {
                this.field3241.method603(-1);
            } catch (IOException var9) {
            }
        }
        if (this.field3239 != null) {
            try {
                this.field3239.method603(arg0 ^ 0xFFFFE941);
            } catch (IOException var8) {
            }
        }
        if (this.field3228 != null) {
            for (int var3 = 0; var3 < this.field3228.length; var3++) {
                if (this.field3228[var3] != null) {
                    try {
                        this.field3228[var3].method603(arg0 - 5823);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field3236 != null) {
            try {
                this.field3236.method603(-1);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lpe;")
    public final class141 method1011(int arg0, Runnable arg1, int arg2) {
        if (arg0 != -9054) {
            this.method1012(null, -90);
        }
        return this.method1007(2, arg1, 0, arg2, -109);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/net/URL;I)Lpe;")
    public final class141 method1012(URL arg0, int arg1) {
        return arg1 == 0 ? this.method1007(4, arg0, 0, 0, 45) : null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Lsb;")
    public final class165 method1013(int arg0) {
        if (arg0 != 0) {
            field3229 = null;
        }
        return this.field3242;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class160(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field3231 = arg1;
        field3235 = "Unknown";
        field3232 = "1.1";
        try {
            field3235 = System.getProperty("java.vendor");
            field3232 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3238 = System.getProperty("user.home");
            if (field3238 != null) {
                field3238 = field3238 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3238 == null) {
            field3238 = "~/";
        }
        try {
            this.field3245 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3244 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3244 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3229 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3229 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1006(arg3, 34, arg2, arg4);
        }
        this.field3233 = false;
        this.field3234 = new Thread(this);
        this.field3234.setPriority(10);
        this.field3234.setDaemon(true);
        this.field3234.start();
    }
}
