import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
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

@OriginalClass("client!sc")
public class class229 implements Runnable {

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lac;")
    public class126 field3995 = null;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lac;")
    public class126 field3989 = null;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Ljava/io/File;")
    public File field3994 = null;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljava/io/File;")
    private File field3987 = null;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Loj;")
    private class150 field3991 = null;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lac;")
    public class126 field4001 = null;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Ljava/applet/Applet;")
    public Applet field3999 = null;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Loj;")
    private class150 field4006 = null;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Z")
    private boolean field4005 = false;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4004;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field4002;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field3998 = 3;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lhh;")
    private class110 field3997;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3985;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3986;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3990;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3992;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3993;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Ljava/lang/String;")
    private static String field3996;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4003;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3984;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4000;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[Lac;")
    public class126[] field3988;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;II)V")
    private final void method1568(byte arg0, String arg1, int arg2, int arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3996, "/tmp/", "" };
        int var6 = 22 % ((9 - arg0) / 34);
        String[] var7 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
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
                        if (this.field4001 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var8 == 1 || var14.exists()) {
                                    this.field4001 = new class126(var14, "rw", 25L);
                                }
                            } catch (Exception var22) {
                                this.field4001 = null;
                            }
                        }
                        if (this.field3987 == null) {
                            try {
                                File var15 = new File(var12, arg1);
                                if (var8 == 1 && !var15.exists()) {
                                    boolean var16 = var15.mkdir();
                                    if (!var16) {
                                        continue;
                                    }
                                }
                                File var17 = new File(var15, "main_file_cache.dat2");
                                if (var8 == 0 && !var17.exists()) {
                                    continue;
                                }
                                this.field3995 = new class126(var17, "rw", 104857600L);
                                this.field3988 = new class126[arg3];
                                for (int var18 = 0; var18 < arg3; var18++) {
                                    this.field3988[var18] = new class126(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field3989 = new class126(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3994 = this.field3987 = var15;
                            } catch (Exception var21) {
                                try {
                                    this.field3995.method937(0);
                                    for (int var19 = 0; var19 < arg3; var19++) {
                                        this.field3988[var19].method937(0);
                                    }
                                    this.field3989.method937(0);
                                } catch (Exception var20) {
                                }
                                this.field3994 = this.field3987 = null;
                                this.field3995 = this.field3989 = null;
                                this.field3988 = null;
                            }
                        }
                    } catch (Exception var23) {
                    }
                    if (this.field4001 != null && this.field3987 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3987 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lhh;")
    public final class110 method1569(int arg0) {
        if (arg0 != 2) {
            this.method1581((Class) null, (String) null, 108);
        }
        return this.field3997;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/Runnable;II)Loj;")
    public final class150 method1570(Runnable arg0, int arg1, int arg2) {
        return arg1 == -28437 ? this.method1571(arg0, 0, arg2, 2, 5006) : null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/Object;IIII)Loj;")
    private final class150 method1571(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class150 var6 = new class150();
        var6.field2506 = arg3;
        var6.field2508 = arg2;
        var6.field2507 = arg0;
        synchronized (this) {
            if (this.field3991 == null) {
                this.field3991 = this.field4006 = var6;
            } else {
                this.field3991.field2509 = var6;
                this.field3991 = var6;
            }
            this.notify();
        }
        if (arg4 != 5006) {
            this.method1569(5);
        }
        return var6;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)Loj;")
    public final class150 method1572(String arg0, int arg1) {
        if (arg1 != -14718) {
            this.method1568((byte) 35, (String) null, -68, -12);
        }
        return this.method1571(arg0, 0, 0, 12, 5006);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;BI)Loj;")
    public final class150 method1573(int arg0, Component arg1, byte arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        return arg2 > -10 ? null : this.method1571((Object) null, arg0 + var5.y, var5.x + arg3, 14, 5006);
    }

    @OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4005) {
                        return;
                    }
                    if (this.field4006 != null) {
                        var2 = this.field4006;
                        this.field4006 = this.field4006.field2509;
                        if (this.field4006 == null) {
                            this.field3991 = null;
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
                int var3 = var2.field2506;
                if (var3 == 1) {
                    var2.field2505 = new Socket(InetAddress.getByName((String) var2.field2507), var2.field2508);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2507);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2508);
                    var2.field2505 = var6;
                } else if (var3 == 4) {
                    var2.field2505 = new DataInputStream(((URL) var2.field2507).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2507;
                    var2.field2505 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2507;
                    var2.field2505 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field2504 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2504 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/net/URL;I)Loj;")
    public final class150 method1574(URL arg0, int arg1) {
        if (arg1 != -22708) {
            this.field3997 = null;
        }
        return this.method1571(arg0, 0, 0, 4, 5006);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method1575(int arg0) {
        synchronized (this) {
            this.field4005 = true;
            this.notifyAll();
        }
        try {
            this.field4002.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 != -7503) {
            this.method1571((Object) null, 73, 116, -53, -115);
        }
        if (this.field3995 != null) {
            try {
                this.field3995.method937(0);
            } catch (IOException var7) {
            }
        }
        if (this.field3989 != null) {
            try {
                this.field3989.method937(0);
            } catch (IOException var6) {
            }
        }
        if (this.field3988 != null) {
            for (int var3 = 0; var3 < this.field3988.length; var3++) {
                if (this.field3988[var3] != null) {
                    try {
                        this.field3988[var3].method937(arg0 ^ 0xFFFFE2B1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4001 != null) {
            try {
                this.field4001.method937(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)Loj;")
    public final class150 method1576(int arg0, boolean arg1) {
        if (arg1) {
            this.method1575(-61);
        }
        return this.method1571((Object) null, 0, arg0, 3, 5006);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLjava/lang/Class;)Loj;")
    public final class150 method1577(boolean arg0, Class arg1) {
        return arg0 ? this.method1571(arg1, 0, 0, 13, 5006) : null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/Class;)Loj;")
    public final class150 method1578(int arg0, Class arg1) {
        if (arg0 != 11233) {
            this.field4001 = null;
        }
        return this.method1571(arg1, 0, 0, 11, 5006);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZILjava/awt/Component;)Loj;")
    public final class150 method1579(boolean arg0, int arg1, Component arg2) {
        if (arg1 != 0) {
            this.field3988 = null;
        }
        return this.method1571(arg2, 0, arg0 ? 1 : 0, 15, 5006);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;I)Loj;")
    public final class150 method1580(byte arg0, String arg1, int arg2) {
        if (arg0 != 8) {
            this.field3997 = null;
        }
        return this.method1571(arg1, 0, arg2, 1, 5006);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Loj;")
    public final class150 method1581(Class arg0, String arg1, int arg2) {
        return arg2 > -80 ? null : this.method1571(new Object[] { arg0, arg1 }, 0, 0, 9, 5006);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Loj;")
    public final class150 method1582(int arg0, Class[] arg1, String arg2, Class arg3) {
        if (arg0 != 1) {
            this.method1573(-37, (Component) null, (byte) -52, -118);
        }
        return this.method1571(new Object[] { arg3, arg2, arg1 }, 0, 0, 8, 5006);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class229(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3986 = "1.1";
        field4003 = "Unknown";
        this.field3999 = arg1;
        try {
            field4003 = System.getProperty("java.vendor");
            field3986 = System.getProperty("java.version");
        } catch (Exception var13) {
        }
        try {
            field3985 = System.getProperty("os.name");
        } catch (Exception var12) {
            field3985 = "Unknown";
        }
        field3993 = field3985.toLowerCase();
        try {
            field3992 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var11) {
            field3992 = "";
        }
        try {
            field3990 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var10) {
            field3990 = "";
        }
        try {
            field3996 = System.getProperty("user.home");
            if (field3996 != null) {
                field3996 = field3996 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3996 == null) {
            field3996 = "~/";
        }
        try {
            this.field4004 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3984 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3984 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field4000 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4000 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1568((byte) 94, arg3, arg2, arg4);
        }
        this.field4005 = false;
        this.field4002 = new Thread(this);
        this.field4002.setPriority(10);
        this.field4002.setDaemon(true);
        this.field4002.start();
    }
}
