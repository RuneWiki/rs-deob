import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class742 implements Runnable {

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "Lfi;")
    public class583 field10239 = null;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "Lfi;")
    public class583 field10229 = null;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "Z")
    public boolean field10241 = false;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "Lfo;")
    private class545 field10238 = null;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "Z")
    private boolean field10249 = false;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "Lfo;")
    private class545 field10230 = null;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "Z")
    public boolean field10253 = false;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "Lfi;")
    public class583 field10254 = null;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field10255;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "[Lfi;")
    public class583[] field10252;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "Ljava/lang/Object;")
    private Object field10242;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "Ljava/lang/Object;")
    private Object field10237;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "Lup;")
    private class292 field10233;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "Lkaa;")
    private class52 field10251;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "Ljava/lang/Object;")
    private Object field10232;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field10243;

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "J")
    private static volatile long field10236 = 0L;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    private static int field10235;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field10257;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field10258;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field10259;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field10260;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "Ljava/lang/String;")
    public static String field10231;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "Ljava/lang/String;")
    public static String field10234;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "Ljava/lang/String;")
    private static String field10240;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "Ljava/lang/String;")
    public static String field10244;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "Ljava/lang/String;")
    private static String field10245;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "Ljava/lang/String;")
    public static String field10247;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "Ljava/lang/String;")
    private static String field10250;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "Ljava/lang/String;")
    public static String field10256;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10246;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10248;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4123(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;Z)Lfo;", line = 9)
    public final class545 method4103(String arg0, boolean arg1) {
        if (!arg1) {
            this.method4105((byte) 69, 56, null, true);
        }
        return this.method4121(arg0, 0, 16, (byte) 125, 0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lfi;", line = 21)
    private static final class583 method4104(String arg0, int arg1, int arg2, String arg3) {
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg3 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg3 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg3 + ".dat";
        }
        int var5 = 76 % ((-arg1 - 24) / 53);
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", field10250, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (var8.length() <= 0 || (new File(var8)).exists()) {
                try {
                    return new class583(new File(var8, var4), "rw", 10000L);
                } catch (Exception var10) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BILjava/lang/String;Z)Lfo;", line = 65)
    public final class545 method4105(byte arg0, int arg1, String arg2, boolean arg3) {
        int var5 = -69 % ((36 - arg0) / 63);
        return this.method4121(arg2, 0, arg3 ? 22 : 1, (byte) 118, arg1);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([BBLjava/io/File;)Z", line = 75)
    public final boolean method4106(byte[] arg0, byte arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg0, 0, arg0.length);
            if (arg1 < 111) {
                return false;
            } else {
                var4.close();
                return true;
            }
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)Lfo;", line = 95)
    public final class545 method4107(int arg0, int arg1) {
        if (arg1 >= -35) {
            this.field10238 = null;
        }
        return this.method4121(null, 0, 3, (byte) 117, arg0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;I)Lfi;", line = 107)
    public static final class583 method4108(String arg0, int arg1) {
        if (arg1 <= 3) {
            method4104(null, 95, -10, null);
        }
        return method4104(field10240, -92, field10235, arg0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lfo;", line = 117)
    public final class545 method4109(Class arg0, String arg1, int arg2) {
        return arg2 == 1 ? this.method4121(new Object[] { arg0, arg1 }, 0, 9, (byte) 110, 0) : null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)Lfo;", line = 131)
    public final class545 method4110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -12658) {
            field10234 = null;
        }
        return this.method4121(null, (arg1 << 16) + arg2, 6, (byte) 119, (arg4 << 16) + arg3);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLjava/net/URL;)Lfo;", line = 142)
    public final class545 method4111(byte arg0, URL arg1) {
        int var3 = -91 / ((arg0 + 79) / 36);
        return this.method4121(arg1, 0, 4, (byte) 110, 0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V", line = 156)
    public final void method4112(byte arg0) {
        field10236 = class197.method1423(1) + 5000L;
        if (arg0 != -46) {
            field10240 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 705)
    public class742(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field10240 = arg1;
        this.field10241 = arg3;
        field10247 = "1.1";
        field10231 = "Unknown";
        field10235 = arg0;
        try {
            field10231 = System.getProperty("java.vendor");
            field10247 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field10231.toLowerCase().indexOf("microsoft") != -1) {
            this.field10253 = true;
        }
        try {
            field10245 = System.getProperty("os.name");
        } catch (Exception var19) {
            field10245 = "Unknown";
        }
        field10234 = field10245.toLowerCase();
        try {
            field10256 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field10256 = "";
        }
        try {
            field10244 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field10244 = "";
        }
        try {
            field10250 = System.getProperty("user.home");
            if (field10250 != null) {
                field10250 = field10250 + "/";
            }
        } catch (Exception var16) {
        }
        if (field10250 == null) {
            field10250 = "~/";
        }
        try {
            this.field10255 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field10253) {
            try {
                field10246 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field10248 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class587.method3372(field10235, field10240, 0);
        if (this.field10241) {
            this.field10254 = new class583(class587.method3373(field10235, 17771, "random.dat", null), "rw", 25L);
            this.field10229 = new class583(class587.method3374(124, "main_file_cache.dat2"), "rw", 209715200L);
            this.field10239 = new class583(class587.method3374(98, "main_file_cache.idx255"), "rw", 1048576L);
            this.field10252 = new class583[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field10252[var5] = new class583(class587.method3374(119, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field10253) {
                try {
                    this.field10242 = Class.forName("no").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field10253) {
                    this.field10233 = new class292();
                } else {
                    this.field10237 = Class.forName("hda").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field10253) {
                    this.field10251 = new class52();
                } else {
                    this.field10232 = Class.forName("ls").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field10241 && !this.field10253) {
            ThreadGroup var6 = Thread.currentThread().getThreadGroup();
            for (ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
                var6 = var7;
            }
            Thread[] var8 = new Thread[1000];
            var6.enumerate(var8);
            for (int var9 = 0; var9 < var8.length; var9++) {
                if (var8[var9] != null && var8[var9].getName().startsWith("AWT")) {
                    var8[var9].setPriority(1);
                }
            }
        }
        this.field10249 = false;
        this.field10243 = new Thread(this);
        this.field10243.setPriority(10);
        this.field10243.setDaemon(true);
        this.field10243.start();
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)Z", line = 183)
    public final boolean method4113(byte arg0) {
        if (arg0 > -51) {
            this.field10242 = null;
        }
        if (!this.field10241) {
            return false;
        } else if (this.field10253) {
            return this.field10233 != null;
        } else {
            return this.field10237 != null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "run", descriptor = "()V", line = 212)
    public final void run() {
        while (true) {
            class545 var2;
            synchronized (this) {
                while (true) {
                    if (this.field10249) {
                        return;
                    }
                    if (this.field10230 != null) {
                        var2 = this.field10230;
                        this.field10230 = this.field10230.field7413;
                        if (this.field10230 == null) {
                            this.field10238 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var30) {
                    }
                }
            }
            try {
                int var3 = var2.field7415;
                if (var3 == 1) {
                    if (class197.method1423(1) < field10236) {
                        throw new IOException();
                    }
                    var2.field7416 = new Socket(InetAddress.getByName((String) var2.field7410), var2.field7414);
                } else if (var3 == 22) {
                    if (field10236 > class197.method1423(1)) {
                        throw new IOException();
                    }
                    try {
                        var2.field7416 = class24.method162((byte) -118, var2.field7414, (String) var2.field7410).method912((byte) 103);
                    } catch (class565 var29) {
                        var2.field7416 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field7410);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field7414);
                    var2.field7416 = var5;
                } else if (var3 == 4) {
                    if (field10236 > class197.method1423(1)) {
                        throw new IOException();
                    }
                    var2.field7416 = new DataInputStream(((URL) var2.field7410).openStream());
                } else if (var3 == 8) {
                    Object[] var23 = (Object[]) var2.field7410;
                    if (this.field10241 && ((Class) var23[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field7416 = ((Class) var23[0]).getDeclaredMethod((String) var23[1], (Class[]) var23[2]);
                } else if (var3 == 9) {
                    Object[] var22 = (Object[]) var2.field7410;
                    if (this.field10241 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field7416 = ((Class) var22[0]).getDeclaredField((String) var22[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field7416 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field7410;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field10241) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class197.method1423(1) < field10236) {
                        throw new IOException();
                    }
                    String var21 = (var2.field7414 >> 24 & 0xFF) + "." + ((var2.field7414 & 0xFF63B7) >> 16) + "." + (var2.field7414 >> 8 & 0xFF) + "." + (var2.field7414 & 0xFF);
                    var2.field7416 = InetAddress.getByName(var21).getHostName();
                } else if (var3 == 21) {
                    if (class197.method1423(1) < field10236) {
                        throw new IOException();
                    }
                    var2.field7416 = InetAddress.getByName((String) var2.field7410).getAddress();
                } else if (var3 == 5) {
                    if (this.field10253) {
                        var2.field7416 = this.field10233.method1858(-14048);
                    } else {
                        var2.field7416 = Class.forName("hda").getMethod("listmodes").invoke(this.field10237);
                    }
                } else if (var3 == 6) {
                    Frame var20 = new Frame("Jagex Full Screen");
                    var2.field7416 = var20;
                    var20.setResizable(false);
                    if (this.field10253) {
                        this.field10233.method1857(var2.field7411 & 0xFFFF, var2.field7411 >> 16, -16, var20, var2.field7414 & 0xFFFF, var2.field7414 >>> 16);
                    } else {
                        Class.forName("hda").getMethod("enter", field10260 == null ? (field10260 = method4123("java.awt.Frame")) : field10260, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field10237, var20, Integer.valueOf(var2.field7414 >>> 16), new Integer(var2.field7414 & 0xFFFF), Integer.valueOf(var2.field7411 >> 16), new Integer(var2.field7411 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field10253) {
                        this.field10233.method1856((Frame) var2.field7410, -124);
                    } else {
                        Class.forName("hda").getMethod("exit").invoke(this.field10237);
                    }
                } else if (var3 == 12) {
                    class583 var19 = method4104(field10240, -99, field10235, (String) var2.field7410);
                    var2.field7416 = var19;
                } else if (var3 == 13) {
                    class583 var9 = method4104("", -90, field10235, (String) var2.field7410);
                    var2.field7416 = var9;
                } else if (this.field10241 && var3 == 14) {
                    int var17 = var2.field7414;
                    int var18 = var2.field7411;
                    if (this.field10253) {
                        this.field10251.method388(var18, 0, var17);
                    } else {
                        Class.forName("ls").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field10232, Integer.valueOf(var17), new Integer(var18));
                    }
                } else if (this.field10241 && var3 == 15) {
                    boolean var15 = var2.field7414 != 0;
                    Component var16 = (Component) var2.field7410;
                    if (this.field10253) {
                        this.field10251.method387(var15, var16, 0);
                    } else {
                        Class.forName("ls").getDeclaredMethod("showcursor", field10257 == null ? (field10257 = method4123("java.awt.Component")) : field10257, Boolean.TYPE).invoke(this.field10232, var16, Boolean.valueOf(var15));
                    }
                } else if (!this.field10253 && var3 == 17) {
                    Object[] var14 = (Object[]) var2.field7410;
                    Class.forName("ls").getDeclaredMethod("setcustomcursor", field10257 == null ? (field10257 = method4123("java.awt.Component")) : field10257, field10258 == null ? (field10258 = method4123("[I")) : field10258, Integer.TYPE, Integer.TYPE, field10259 == null ? (field10259 = method4123("java.awt.Point")) : field10259).invoke(this.field10232, (Component) var14[0], (int[]) var14[1], Integer.valueOf(var2.field7414), new Integer(var2.field7411), (Point) var14[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field10234.startsWith("win")) {
                            throw new Exception();
                        }
                        String var10 = (String) var2.field7410;
                        if (!var10.startsWith("http://") && !var10.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var12 = 0; var12 < var10.length(); var12++) {
                            if (var11.indexOf(var10.charAt(var12)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var10 + "\"");
                        var2.field7416 = null;
                    } catch (Exception var31) {
                        var2.field7416 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field7412 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field7412 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLjava/lang/String;Z)Lfo;", line = 511)
    public final class545 method4114(boolean arg0, String arg1, boolean arg2) {
        if (!arg0) {
            this.method4105((byte) -89, 11, null, true);
        }
        return arg2 ? this.method4121(arg1, 0, 12, (byte) 110, 0) : this.method4121(arg1, 0, 13, (byte) 111, 0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLjava/awt/Frame;)Lfo;", line = 532)
    public final class545 method4115(byte arg0, Frame arg1) {
        if (arg0 > -102) {
            this.method4111((byte) 104, null);
        }
        return this.method4121(arg1, 0, 7, (byte) 122, 0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lfo;", line = 542)
    public final class545 method4116(int arg0, Runnable arg1, byte arg2) {
        return arg2 == 124 ? this.method4121(arg1, 0, 2, (byte) 124, arg0) : null;
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 552)
    public final Object method4117(byte arg0) {
        return arg0 == -21 ? this.field10242 : null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lfo;", line = 568)
    public final class545 method4118(String arg0, Class[] arg1, int arg2, Class arg3) {
        return arg2 == 25 ? this.method4121(new Object[] { arg3, arg0, arg1 }, 0, 8, (byte) 114, 0) : null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;BI[II)Lfo;", line = 582)
    public final class545 method4119(Component arg0, Point arg1, byte arg2, int arg3, int[] arg4, int arg5) {
        if (arg2 > -53) {
            this.field10253 = false;
        }
        return this.method4121(new Object[] { arg0, arg4, arg1 }, arg3, 17, (byte) 120, arg5);
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)V", line = 602)
    public final void method4120(byte arg0) {
        synchronized (this) {
            this.field10249 = true;
            this.notifyAll();
            if (arg0 != -25) {
                this.field10230 = null;
            }
        }
        try {
            this.field10243.join();
        } catch (InterruptedException var8) {
        }
        if (this.field10229 != null) {
            try {
                this.field10229.method3349(-4013);
            } catch (IOException var7) {
            }
        }
        if (this.field10239 != null) {
            try {
                this.field10239.method3349(-4013);
            } catch (IOException var6) {
            }
        }
        if (this.field10252 != null) {
            for (int var3 = 0; var3 < this.field10252.length; var3++) {
                if (this.field10252[var3] != null) {
                    try {
                        this.field10252[var3].method3349(-4013);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field10254 != null) {
            try {
                this.field10254.method3349(arg0 ^ 0xFB4);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Lfo;", line = 663)
    private final class545 method4121(Object arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 93) {
            field10235 = -98;
        }
        class545 var6 = new class545();
        var6.field7410 = arg0;
        var6.field7414 = arg4;
        var6.field7415 = arg2;
        var6.field7411 = arg1;
        synchronized (this) {
            if (this.field10238 == null) {
                this.field10238 = this.field10230 = var6;
            } else {
                this.field10238.field7413 = var6;
                this.field10238 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)Lfo;", line = 697)
    public final class545 method4122(int arg0) {
        int var2 = 106 % ((-arg0 - 57) / 58);
        return this.method4121(null, 0, 5, (byte) 124, 0);
    }
}
