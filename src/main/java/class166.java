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

@OriginalClass("client!pc")
public class class166 implements Runnable {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Ljava/io/File;")
    private File field3053 = null;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lud;")
    private class198 field3052 = null;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lfg;")
    public class230 field3056 = null;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lfg;")
    public class230 field3061 = null;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lfg;")
    public class230 field3051 = null;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field3055 = null;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Z")
    private boolean field3069 = false;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Lud;")
    private class198 field3072 = null;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Ljava/io/File;")
    public File field3059 = null;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3066;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field3054;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field3060 = 3;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Lih;")
    private class261 field3062;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3058;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Ljava/lang/String;")
    private static String field3065;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3067;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3068;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3070;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3071;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3073;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3057;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3064;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "[Lfg;")
    public class230[] field3063;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;II)V")
    private final void method1244(byte arg0, String arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3065, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        if (arg0 != 124) {
            this.field3062 = null;
        }
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
                        if (this.field3061 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field3061 = new class230(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field3061 = null;
                            }
                        }
                        if (this.field3053 == null) {
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
                                this.field3051 = new class230(var16, "rw", 104857600L);
                                this.field3063 = new class230[arg2];
                                for (int var17 = 0; var17 < arg2; var17++) {
                                    this.field3063[var17] = new class230(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field3056 = new class230(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3059 = this.field3053 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field3051.method1603(0);
                                    for (int var18 = 0; var18 < arg2; var18++) {
                                        this.field3063[var18].method1603(0);
                                    }
                                    this.field3056.method1603(arg0 - 124);
                                } catch (Exception var19) {
                                }
                                this.field3059 = this.field3053 = null;
                                this.field3051 = this.field3056 = null;
                                this.field3063 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field3061 != null && this.field3053 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3053 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZILjava/lang/String;)Lud;")
    public final class198 method1245(boolean arg0, int arg1, String arg2) {
        if (arg0) {
            this.method1244((byte) 47, (String) null, 122, 51);
        }
        return this.method1252(0, 1, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lih;")
    public final class261 method1246(int arg0) {
        return arg0 >= -5 ? null : this.field3062;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/Class;)Lud;")
    public final class198 method1247(byte arg0, Class arg1) {
        int var3 = -70 / ((arg0 - 51) / 44);
        return this.method1252(0, 13, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lud;")
    public final class198 method1248(Class[] arg0, Class arg1, String arg2, int arg3) {
        return arg3 == 0 ? this.method1252(0, 8, arg3, 0, new Object[] { arg1, arg2, arg0 }) : null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)Lud;")
    public final class198 method1249(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field3072 = null;
        }
        return this.method1252(0, 12, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lud;")
    public final class198 method1250(int arg0, int arg1) {
        return arg0 == 10732 ? this.method1252(0, 3, 0, arg1, (Object) null) : null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/net/URL;I)Lud;")
    public final class198 method1251(URL arg0, int arg1) {
        if (arg1 != 4) {
            this.method1244((byte) -103, (String) null, -80, -95);
        }
        return this.method1252(0, 4, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILjava/lang/Object;)Lud;")
    private final class198 method1252(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        if (arg2 != 0) {
            return null;
        }
        class198 var6 = new class198();
        var6.field3562 = arg4;
        var6.field3561 = arg3;
        var6.field3564 = arg1;
        synchronized (this) {
            if (this.field3072 == null) {
                this.field3072 = this.field3052 = var6;
            } else {
                this.field3072.field3565 = var6;
                this.field3072 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lud;")
    public final class198 method1253(Runnable arg0, int arg1, int arg2) {
        if (arg2 != 2244) {
            this.method1249(35, (String) null);
        }
        return this.method1252(0, 2, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public final void method1254(byte arg0) {
        synchronized (this) {
            this.field3069 = true;
            this.notifyAll();
        }
        try {
            this.field3054.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3051 != null) {
            try {
                this.field3051.method1603(0);
            } catch (IOException var7) {
            }
        }
        if (this.field3056 != null) {
            try {
                this.field3056.method1603(0);
            } catch (IOException var6) {
            }
        }
        if (this.field3063 != null) {
            for (int var3 = 0; var3 < this.field3063.length; var3++) {
                if (this.field3063[var3] != null) {
                    try {
                        this.field3063[var3].method1603(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 >= -122) {
            field3071 = null;
        }
        if (this.field3061 != null) {
            try {
                this.field3061.method1603(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class166(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3067 = "Unknown";
        field3070 = "1.1";
        this.field3055 = arg1;
        try {
            field3067 = System.getProperty("java.vendor");
            field3070 = System.getProperty("java.version");
        } catch (Exception var13) {
        }
        try {
            field3068 = System.getProperty("os.name");
        } catch (Exception var12) {
            field3068 = "Unknown";
        }
        field3071 = field3068.toLowerCase();
        try {
            field3058 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var11) {
            field3058 = "";
        }
        try {
            field3073 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var10) {
            field3073 = "";
        }
        try {
            field3065 = System.getProperty("user.home");
            if (field3065 != null) {
                field3065 = field3065 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3065 == null) {
            field3065 = "~/";
        }
        try {
            this.field3066 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3064 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3064 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3057 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3057 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1244((byte) 124, arg3, arg4, arg2);
        }
        this.field3069 = false;
        this.field3054 = new Thread(this);
        this.field3054.setPriority(10);
        this.field3054.setDaemon(true);
        this.field3054.start();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/Class;)Lud;")
    public final class198 method1255(int arg0, Class arg1) {
        if (arg0 != 0) {
            this.run();
        }
        return this.method1252(0, 11, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class198 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3069) {
                        return;
                    }
                    if (this.field3052 != null) {
                        var2 = this.field3052;
                        this.field3052 = this.field3052.field3565;
                        if (this.field3052 == null) {
                            this.field3072 = null;
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
                int var3 = var2.field3564;
                if (var3 == 1) {
                    var2.field3563 = new Socket(InetAddress.getByName((String) var2.field3562), var2.field3561);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3562);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3561);
                    var2.field3563 = var6;
                } else if (var3 == 4) {
                    var2.field3563 = new DataInputStream(((URL) var2.field3562).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3562;
                    var2.field3563 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3562;
                    var2.field3563 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3566 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3566 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lud;")
    public final class198 method1256(Class arg0, String arg1, int arg2) {
        if (arg2 > -108) {
            this.method1248((Class[]) null, (Class) null, (String) null, 14);
        }
        return this.method1252(0, 9, 0, 0, new Object[] { arg0, arg1 });
    }
}
