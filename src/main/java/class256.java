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

@OriginalClass("client!nga")
public class class256 implements Runnable {

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "Z")
    public boolean field3240 = false;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "Lwp;")
    private class435 field3252 = null;

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "Lis;")
    public class112 field3253 = null;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "Lis;")
    public class112 field3245 = null;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "Z")
    public boolean field3251 = false;

    @OriginalMember(owner = "client!nga", name = "u", descriptor = "Z")
    private boolean field3260 = false;

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "Lis;")
    public class112 field3265 = null;

    @OriginalMember(owner = "client!nga", name = "x", descriptor = "Lwp;")
    private class435 field3263 = null;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3249;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "[Lis;")
    public class112[] field3248;

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "Ljava/lang/Object;")
    private Object field3257;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "Ljava/lang/Object;")
    private Object field3242;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "Llga;")
    private class19 field3255;

    @OriginalMember(owner = "client!nga", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field3266;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "Lqha;")
    private class381 field3246;

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field3258;

    @OriginalMember(owner = "client!nga", name = "v", descriptor = "J")
    private static volatile long field3261 = 0L;

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "I")
    private static int field3259;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nga", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field3268;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nga", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field3269;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nga", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field3270;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nga", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field3271;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3243;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "Ljava/lang/String;")
    private static String field3244;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3247;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3250;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "Ljava/lang/String;")
    private static String field3254;

    @OriginalMember(owner = "client!nga", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3262;

    @OriginalMember(owner = "client!nga", name = "y", descriptor = "Ljava/lang/String;")
    private static String field3264;

    @OriginalMember(owner = "client!nga", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3267;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3241;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3256;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1566(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V", line = 7)
    public final void method1546(byte arg0) {
        synchronized (this) {
            this.field3260 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != 48) {
                return;
            }
            this.field3258.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3265 != null) {
            try {
                this.field3265.method756(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field3245 != null) {
            try {
                this.field3245.method756(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field3248 != null) {
            for (int var3 = 0; var3 < this.field3248.length; var3++) {
                if (this.field3248[var3] != null) {
                    try {
                        this.field3248[var3].method756(-1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3253 != null) {
            try {
                this.field3253.method756(-1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;)Lis;", line = 64)
    public static final class112 method1547(int arg0, String arg1) {
        return arg0 == 0 ? method1558(field3259, field3244, -52, arg1) : null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V", line = 78)
    public final void method1548(int arg0) {
        field3261 = (long) arg0 + class97.method654((byte) 124);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "([BILjava/io/File;)Z", line = 85)
    public final boolean method1549(byte[] arg0, int arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg0, arg1, arg0.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(B)Lwp;", line = 104)
    public final class435 method1550(byte arg0) {
        if (arg0 != -47) {
            field3254 = null;
        }
        return this.method1559(0, (byte) -79, 5, null, 0);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "([IILjava/awt/Component;Ljava/awt/Point;II)Lwp;", line = 116)
    public final class435 method1551(int[] arg0, int arg1, Component arg2, Point arg3, int arg4, int arg5) {
        return arg5 == -14686 ? this.method1559(arg1, (byte) -117, 17, new Object[] { arg2, arg0, arg3 }, arg4) : null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IZLjava/lang/String;)Lwp;", line = 132)
    public final class435 method1552(int arg0, boolean arg1, String arg2) {
        if (arg0 != -12111) {
            this.method1563((byte) 14, null);
        }
        return arg1 ? this.method1559(0, (byte) -46, 12, arg2, 0) : this.method1559(0, (byte) -47, 13, arg2, 0);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Class;Ljava/lang/Class;)Lwp;", line = 146)
    public final class435 method1553(String arg0, int arg1, Class[] arg2, Class arg3) {
        if (arg1 != 14042) {
            this.run();
        }
        return this.method1559(0, (byte) -33, 8, new Object[] { arg3, arg0, arg2 }, 0);
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(B)Z", line = 158)
    public final boolean method1554(byte arg0) {
        int var2 = -33 % ((arg0 - 48) / 58);
        if (!this.field3251) {
            return false;
        } else if (this.field3240) {
            return this.field3255 != null;
        } else {
            return this.field3242 != null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lwp;", line = 177)
    public final class435 method1555(int arg0, boolean arg1, Runnable arg2) {
        if (!arg1) {
            this.field3240 = false;
        }
        return this.method1559(0, (byte) -34, 2, arg2, arg0);
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 191)
    public final Object method1556(byte arg0) {
        int var2 = -6 / ((arg0 - 46) / 40);
        return this.field3257;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/String;ZII)Lwp;", line = 205)
    public final class435 method1557(String arg0, boolean arg1, int arg2, int arg3) {
        return arg2 == 22 ? this.method1559(0, (byte) -99, arg1 ? 22 : 1, arg0, arg3) : null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lis;", line = 217)
    private static final class112 method1558(int arg0, String arg1, int arg2, String arg3) {
        String var4;
        if (arg0 == 33) {
            var4 = "jagex_" + arg1 + "_preferences" + arg3 + "_rc.dat";
        } else if (arg0 == 34) {
            var4 = "jagex_" + arg1 + "_preferences" + arg3 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg1 + "_preferences" + arg3 + ".dat";
        }
        if (arg2 >= -41) {
            method1547(-81, null);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field3264, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class112(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IBILjava/lang/Object;I)Lwp;", line = 264)
    private final class435 method1559(int arg0, byte arg1, int arg2, Object arg3, int arg4) {
        class435 var6 = new class435();
        var6.field6129 = arg2;
        var6.field6127 = arg4;
        var6.field6125 = arg0;
        var6.field6126 = arg3;
        synchronized (this) {
            if (this.field3263 == null) {
                this.field3263 = this.field3252 = var6;
            } else {
                this.field3263.field6128 = var6;
                this.field3263 = var6;
            }
            this.notify();
        }
        if (arg1 >= -32) {
            field3241 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!nga", name = "run", descriptor = "()V", line = 297)
    public final void run() {
        while (true) {
            class435 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3260) {
                        return;
                    }
                    if (this.field3252 != null) {
                        var2 = this.field3252;
                        this.field3252 = this.field3252.field6128;
                        if (this.field3252 == null) {
                            this.field3263 = null;
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
                int var3 = var2.field6129;
                if (var3 == 1) {
                    if (field3261 > class97.method654((byte) 93)) {
                        throw new IOException();
                    }
                    var2.field6123 = new Socket(InetAddress.getByName((String) var2.field6126), var2.field6127);
                } else if (var3 == 22) {
                    if (field3261 > class97.method654((byte) 68)) {
                        throw new IOException();
                    }
                    try {
                        var2.field6123 = class41.method342((byte) 72, var2.field6127, (String) var2.field6126).method323(4096);
                    } catch (class295 var29) {
                        var2.field6123 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field6126);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field6127);
                    var2.field6123 = var23;
                } else if (var3 == 4) {
                    if (class97.method654((byte) 55) < field3261) {
                        throw new IOException();
                    }
                    var2.field6123 = new DataInputStream(((URL) var2.field6126).openStream());
                } else if (var3 == 8) {
                    Object[] var22 = (Object[]) var2.field6126;
                    if (this.field3251 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field6123 = ((Class) var22[0]).getDeclaredMethod((String) var22[1], (Class[]) var22[2]);
                } else if (var3 == 9) {
                    Object[] var21 = (Object[]) var2.field6126;
                    if (this.field3251 && ((Class) var21[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field6123 = ((Class) var21[0]).getDeclaredField((String) var21[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6123 = var5.getContents(null);
                } else if (var3 == 19) {
                    Transferable var19 = (Transferable) var2.field6126;
                    Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var20.setContents(var19, null);
                } else if (!this.field3251) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field3261 > class97.method654((byte) 80)) {
                        throw new IOException();
                    }
                    String var6 = (var2.field6127 >> 24 & 0xFF) + "." + ((var2.field6127 & 0xFF7750) >> 16) + "." + ((var2.field6127 & 0xFF2F) >> 8) + "." + (var2.field6127 & 0xFF);
                    var2.field6123 = InetAddress.getByName(var6).getHostName();
                } else if (var3 == 21) {
                    if (field3261 > class97.method654((byte) 94)) {
                        throw new IOException();
                    }
                    var2.field6123 = InetAddress.getByName((String) var2.field6126).getAddress();
                } else if (var3 == 5) {
                    if (this.field3240) {
                        var2.field6123 = this.field3255.method216(17);
                    } else {
                        var2.field6123 = Class.forName("qw").getMethod("listmodes").invoke(this.field3242);
                    }
                } else if (var3 == 6) {
                    Frame var18 = new Frame("Jagex Full Screen");
                    var2.field6123 = var18;
                    var18.setResizable(false);
                    if (this.field3240) {
                        this.field3255.method217(var2.field6127 & 0xFFFF, var18, false, var2.field6127 >>> 16, var2.field6125 >> 16, var2.field6125 & 0xFFFF);
                    } else {
                        Class.forName("qw").getMethod("enter", field3271 == null ? (field3271 = method1566("java.awt.Frame")) : field3271, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field3242, var18, Integer.valueOf(var2.field6127 >>> 16), new Integer(var2.field6127 & 0xFFFF), Integer.valueOf(var2.field6125 >> 16), new Integer(var2.field6125 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field3240) {
                        this.field3255.method215(-14820, (Frame) var2.field6126);
                    } else {
                        Class.forName("qw").getMethod("exit").invoke(this.field3242);
                    }
                } else if (var3 == 12) {
                    class112 var17 = method1558(field3259, field3244, -45, (String) var2.field6126);
                    var2.field6123 = var17;
                } else if (var3 == 13) {
                    class112 var7 = method1558(field3259, "", -76, (String) var2.field6126);
                    var2.field6123 = var7;
                } else if (this.field3251 && var3 == 14) {
                    int var15 = var2.field6127;
                    int var16 = var2.field6125;
                    if (this.field3240) {
                        this.field3246.method2299(var16, 0, var15);
                    } else {
                        Class.forName("pr").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field3266, Integer.valueOf(var15), new Integer(var16));
                    }
                } else if (this.field3251 && var3 == 15) {
                    boolean var13 = var2.field6127 != 0;
                    Component var14 = (Component) var2.field6126;
                    if (this.field3240) {
                        this.field3246.method2298(false, var13, var14);
                    } else {
                        Class.forName("pr").getDeclaredMethod("showcursor", field3268 == null ? (field3268 = method1566("java.awt.Component")) : field3268, Boolean.TYPE).invoke(this.field3266, var14, Boolean.valueOf(var13));
                    }
                } else if (!this.field3240 && var3 == 17) {
                    Object[] var12 = (Object[]) var2.field6126;
                    Class.forName("pr").getDeclaredMethod("setcustomcursor", field3268 == null ? (field3268 = method1566("java.awt.Component")) : field3268, field3269 == null ? (field3269 = method1566("[I")) : field3269, Integer.TYPE, Integer.TYPE, field3270 == null ? (field3270 = method1566("java.awt.Point")) : field3270).invoke(this.field3266, (Component) var12[0], (int[]) var12[1], Integer.valueOf(var2.field6127), new Integer(var2.field6125), (Point) var12[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field3250.startsWith("win")) {
                            throw new Exception();
                        }
                        String var8 = (String) var2.field6126;
                        if (!var8.startsWith("http://") && !var8.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var9 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var10 = 0; var10 < var8.length(); var10++) {
                            if (var9.indexOf(var8.charAt(var10)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                        var2.field6123 = null;
                    } catch (Exception var31) {
                        var2.field6123 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field6124 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field6124 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 685)
    public class256(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field3243 = "Unknown";
        field3267 = "1.1";
        field3259 = arg0;
        this.field3251 = arg3;
        field3244 = arg1;
        try {
            field3243 = System.getProperty("java.vendor");
            field3267 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field3243.toLowerCase().indexOf("microsoft") != -1) {
            this.field3240 = true;
        }
        try {
            field3254 = System.getProperty("os.name");
        } catch (Exception var19) {
            field3254 = "Unknown";
        }
        field3250 = field3254.toLowerCase();
        try {
            field3247 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field3247 = "";
        }
        try {
            field3262 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field3262 = "";
        }
        try {
            field3264 = System.getProperty("user.home");
            if (field3264 != null) {
                field3264 = field3264 + "/";
            }
        } catch (Exception var16) {
        }
        if (field3264 == null) {
            field3264 = "~/";
        }
        try {
            this.field3249 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field3240) {
            try {
                field3241 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field3256 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class392.method2340(field3244, field3259, (byte) -31);
        if (this.field3251) {
            this.field3253 = new class112(class392.method2342(null, true, "random.dat", field3259), "rw", 25L);
            this.field3265 = new class112(class392.method2341("main_file_cache.dat2", -2), "rw", 209715200L);
            this.field3245 = new class112(class392.method2341("main_file_cache.idx255", -2), "rw", 1048576L);
            this.field3248 = new class112[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field3248[var5] = new class112(class392.method2341("main_file_cache.idx" + var5, -2), "rw", 1048576L);
            }
            if (this.field3240) {
                try {
                    this.field3257 = Class.forName("rfa").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field3240) {
                    this.field3255 = new class19();
                } else {
                    this.field3242 = Class.forName("qw").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field3240) {
                    this.field3246 = new class381();
                } else {
                    this.field3266 = Class.forName("pr").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field3251 && !this.field3240) {
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
        this.field3260 = false;
        this.field3258 = new Thread(this);
        this.field3258.setPriority(10);
        this.field3258.setDaemon(true);
        this.field3258.start();
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)Lwp;", line = 599)
    public final class435 method1560(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1546((byte) -121);
        }
        return this.method1559(0, (byte) -107, 3, null, arg0);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/awt/Frame;B)Lwp;", line = 613)
    public final class435 method1561(Frame arg0, byte arg1) {
        int var3 = 109 / ((-arg1 - 37) / 47);
        return this.method1559(0, (byte) -74, 7, arg0, 0);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/net/URL;Z)Lwp;", line = 626)
    public final class435 method1562(URL arg0, boolean arg1) {
        return arg1 ? this.method1559(0, (byte) -42, 4, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(BLjava/lang/String;)Lwp;", line = 639)
    public final class435 method1563(byte arg0, String arg1) {
        int var3 = 100 / ((arg0 + 76) / 36);
        return this.method1559(0, (byte) -90, 16, arg1, 0);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIZ)Lwp;", line = 655)
    public final class435 method1564(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? this.method1559((arg2 << 16) + arg3, (byte) -48, 6, null, (arg1 << 16) + arg0) : null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lwp;", line = 838)
    public final class435 method1565(Class arg0, byte arg1, String arg2) {
        if (arg1 <= 6) {
            this.field3248 = null;
        }
        return this.method1559(0, (byte) -35, 9, new Object[] { arg0, arg2 }, 0);
    }
}
