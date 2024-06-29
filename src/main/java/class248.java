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

@OriginalClass("client!ec")
public class class248 implements Runnable {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Z")
    public boolean field3233 = false;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
    private boolean field3237 = false;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
    public boolean field3248 = false;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lth;")
    private class621 field3244 = null;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Lro;")
    public class2 field3252 = null;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "Lro;")
    public class2 field3257 = null;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lth;")
    private class621 field3240 = null;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lro;")
    public class2 field3236 = null;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3241;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "[Lro;")
    public class2[] field3254;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field3249;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field3253;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lrk;")
    private class35 field3245;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Ljava/lang/Object;")
    private Object field3255;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ltg;")
    private class244 field3242;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field3251;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "J")
    private static volatile long field3234 = 0L;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    private static int field3230;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ec", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field3258;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field3259;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ec", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field3260;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field3261;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/lang/String;")
    private static String field3231;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3232;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3235;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Ljava/lang/String;")
    private static String field3238;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Ljava/lang/String;")
    private static String field3239;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3246;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3247;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3250;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3243;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3256;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1556(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method1536(byte arg0) {
        if (arg0 != -105) {
            this.method1555((byte) 13);
        }
        if (!this.field3248) {
            return false;
        } else if (this.field3233) {
            return this.field3245 != null;
        } else {
            return this.field3253 != null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 21)
    public final void method1537(byte arg0) {
        if (arg0 != -86) {
            this.method1537((byte) 105);
        }
        field3234 = class401.method2440(false) + 5000L;
    }

    @OriginalMember(owner = "client!ec", name = "run", descriptor = "()V", line = 37)
    public final void run() {
        while (true) {
            class621 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3237) {
                        return;
                    }
                    if (this.field3240 != null) {
                        var2 = this.field3240;
                        this.field3240 = this.field3240.field8400;
                        if (this.field3240 == null) {
                            this.field3244 = null;
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
                int var3 = var2.field8399;
                if (var3 == 1) {
                    if (class401.method2440(false) < field3234) {
                        throw new IOException();
                    }
                    var2.field8403 = new Socket(InetAddress.getByName((String) var2.field8401), var2.field8402);
                } else if (var3 == 22) {
                    if (field3234 > class401.method2440(false)) {
                        throw new IOException();
                    }
                    try {
                        var2.field8403 = class442.method2638(-1, (String) var2.field8401, var2.field8402).method303((byte) 113);
                    } catch (class642 var29) {
                        var2.field8403 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field8401);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field8402);
                    var2.field8403 = var5;
                } else if (var3 == 4) {
                    if (class401.method2440(false) < field3234) {
                        throw new IOException();
                    }
                    var2.field8403 = new DataInputStream(((URL) var2.field8401).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field8401;
                    if (this.field3248 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field8403 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field8401;
                    if (this.field3248 && ((Class) var7[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field8403 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var23 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field8403 = var23.getContents(null);
                } else if (var3 == 19) {
                    Transferable var8 = (Transferable) var2.field8401;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, null);
                } else if (!this.field3248) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field3234 > class401.method2440(false)) {
                        throw new IOException();
                    }
                    String var22 = (var2.field8402 >> 24 & 0xFF) + "." + ((var2.field8402 & 0xFF5D79) >> 16) + "." + (var2.field8402 >> 8 & 0xFF) + "." + (var2.field8402 & 0xFF);
                    var2.field8403 = InetAddress.getByName(var22).getHostName();
                } else if (var3 == 21) {
                    if (class401.method2440(false) < field3234) {
                        throw new IOException();
                    }
                    var2.field8403 = InetAddress.getByName((String) var2.field8401).getAddress();
                } else if (var3 == 5) {
                    if (this.field3233) {
                        var2.field8403 = this.field3245.method208((byte) 17);
                    } else {
                        var2.field8403 = Class.forName("ko").getMethod("listmodes").invoke(this.field3253);
                    }
                } else if (var3 == 6) {
                    Frame var10 = new Frame("Jagex Full Screen");
                    var2.field8403 = var10;
                    var10.setResizable(false);
                    if (this.field3233) {
                        this.field3245.method206(var10, var2.field8404 & 0xFFFF, var2.field8402 >>> 16, -16, var2.field8402 & 0xFFFF, var2.field8404 >> 16);
                    } else {
                        Class.forName("ko").getMethod("enter", field3258 == null ? (field3258 = method1556("java.awt.Frame")) : field3258, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field3253, var10, Integer.valueOf(var2.field8402 >>> 16), new Integer(var2.field8402 & 0xFFFF), Integer.valueOf(var2.field8404 >> 16), new Integer(var2.field8404 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field3233) {
                        this.field3245.method207((Frame) var2.field8401, 84);
                    } else {
                        Class.forName("ko").getMethod("exit").invoke(this.field3253);
                    }
                } else if (var3 == 12) {
                    class2 var11 = method1539(field3230, false, (String) var2.field8401, field3239);
                    var2.field8403 = var11;
                } else if (var3 == 13) {
                    class2 var12 = method1539(field3230, false, (String) var2.field8401, "");
                    var2.field8403 = var12;
                } else if (this.field3248 && var3 == 14) {
                    int var13 = var2.field8402;
                    int var14 = var2.field8404;
                    if (this.field3233) {
                        this.field3242.method1525((byte) 122, var14, var13);
                    } else {
                        Class.forName("vo").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field3255, Integer.valueOf(var13), new Integer(var14));
                    }
                } else if (this.field3248 && var3 == 15) {
                    boolean var20 = var2.field8402 != 0;
                    Component var21 = (Component) var2.field8401;
                    if (this.field3233) {
                        this.field3242.method1524(var21, true, var20);
                    } else {
                        Class.forName("vo").getDeclaredMethod("showcursor", field3259 == null ? (field3259 = method1556("java.awt.Component")) : field3259, Boolean.TYPE).invoke(this.field3255, var21, Boolean.valueOf(var20));
                    }
                } else if (!this.field3233 && var3 == 17) {
                    Object[] var19 = (Object[]) var2.field8401;
                    Class.forName("vo").getDeclaredMethod("setcustomcursor", field3259 == null ? (field3259 = method1556("java.awt.Component")) : field3259, field3260 == null ? (field3260 = method1556("[I")) : field3260, Integer.TYPE, Integer.TYPE, field3261 == null ? (field3261 = method1556("java.awt.Point")) : field3261).invoke(this.field3255, (Component) var19[0], (int[]) var19[1], Integer.valueOf(var2.field8402), new Integer(var2.field8404), (Point) var19[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field3232.startsWith("win")) {
                            throw new Exception();
                        }
                        String var15 = (String) var2.field8401;
                        if (!var15.startsWith("http://") && !var15.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var16 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var17 = 0; var17 < var15.length(); var17++) {
                            if (var16.indexOf(var15.charAt(var17)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                        var2.field8403 = null;
                    } catch (Exception var31) {
                        var2.field8403 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field8405 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field8405 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lth;", line = 331)
    public final class621 method1538(Runnable arg0, byte arg1, int arg2) {
        if (arg1 > -46) {
            field3234 = 119L;
        }
        return this.method1553(arg2, 0, 2, arg0, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)Lro;", line = 344)
    private static final class2 method1539(int arg0, boolean arg1, String arg2, String arg3) {
        String var4;
        if (arg0 == 33) {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg0 == 34) {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field3238, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class2(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        if (arg1) {
            field3243 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIILjava/lang/String;)Lth;", line = 385)
    public final class621 method1540(boolean arg0, int arg1, int arg2, String arg3) {
        return arg1 == 0 ? this.method1553(arg2, 0, arg0 ? 22 : 1, arg3, (byte) 56) : null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 693)
    public class248(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field3246 = "Unknown";
        this.field3248 = arg3;
        field3239 = arg1;
        field3250 = "1.1";
        field3230 = arg0;
        try {
            field3246 = System.getProperty("java.vendor");
            field3250 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field3246.toLowerCase().indexOf("microsoft") != -1) {
            this.field3233 = true;
        }
        try {
            field3231 = System.getProperty("os.name");
        } catch (Exception var19) {
            field3231 = "Unknown";
        }
        field3232 = field3231.toLowerCase();
        try {
            field3247 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field3247 = "";
        }
        try {
            field3235 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field3235 = "";
        }
        try {
            field3238 = System.getProperty("user.home");
            if (field3238 != null) {
                field3238 = field3238 + "/";
            }
        } catch (Exception var16) {
        }
        if (field3238 == null) {
            field3238 = "~/";
        }
        try {
            this.field3241 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field3233) {
            try {
                field3256 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field3243 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class167.method1141(field3239, 0, field3230);
        if (this.field3248) {
            this.field3257 = new class2(class167.method1142(null, 0, field3230, "random.dat"), "rw", 25L);
            this.field3252 = new class2(class167.method1140(84, "main_file_cache.dat2"), "rw", 314572800L);
            this.field3236 = new class2(class167.method1140(-102, "main_file_cache.idx255"), "rw", 1048576L);
            this.field3254 = new class2[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field3254[var5] = new class2(class167.method1140(15, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field3233) {
                try {
                    this.field3249 = Class.forName("cu").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field3233) {
                    this.field3245 = new class35();
                } else {
                    this.field3253 = Class.forName("ko").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field3233) {
                    this.field3242 = new class244();
                } else {
                    this.field3255 = Class.forName("vo").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field3248 && !this.field3233) {
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
        this.field3237 = false;
        this.field3251 = new Thread(this);
        this.field3251.setPriority(10);
        this.field3251.setDaemon(true);
        this.field3251.start();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Point;Ljava/awt/Component;[IIII)Lth;", line = 399)
    public final class621 method1541(Point arg0, Component arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 1989375728) {
            this.method1536((byte) 47);
        }
        return this.method1553(arg4, arg3, 17, new Object[] { arg1, arg2, arg0 }, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lth;", line = 415)
    public final class621 method1542(Class[] arg0, int arg1, Class arg2, String arg3) {
        if (arg1 != 0) {
            this.field3237 = true;
        }
        return this.method1553(0, 0, 8, new Object[] { arg2, arg3, arg0 }, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Lth;", line = 425)
    public final class621 method1543(byte arg0, int arg1) {
        return arg0 == -10 ? this.method1553(arg1, 0, 3, null, (byte) 56) : null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Lth;", line = 436)
    public final class621 method1544(boolean arg0) {
        return arg0 ? null : this.method1553(0, 0, 5, null, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;B)Lro;", line = 451)
    public static final class2 method1545(String arg0, byte arg1) {
        return arg1 <= 77 ? null : method1539(field3230, false, arg0, field3239);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/net/URL;)Lth;", line = 464)
    public final class621 method1546(int arg0, URL arg1) {
        if (arg0 != 17) {
            field3239 = null;
        }
        return this.method1553(0, 0, 4, arg1, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLjava/lang/String;Z)Lth;", line = 481)
    public final class621 method1547(byte arg0, String arg1, boolean arg2) {
        if (arg0 != 25) {
            field3250 = null;
        }
        return arg2 ? this.method1553(0, 0, 12, arg1, (byte) 56) : this.method1553(0, 0, 13, arg1, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)Lth;", line = 499)
    public final class621 method1548(String arg0, int arg1) {
        if (arg1 != 11383) {
            this.field3245 = null;
        }
        return this.method1553(0, 0, 16, arg0, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 510)
    public final void method1549(int arg0) {
        synchronized (this) {
            this.field3237 = true;
            if (arg0 != 14909) {
                this.method1544(false);
            }
            this.notifyAll();
        }
        try {
            this.field3251.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3252 != null) {
            try {
                this.field3252.method6(125);
            } catch (IOException var7) {
            }
        }
        if (this.field3236 != null) {
            try {
                this.field3236.method6(arg0 ^ 0x3A05);
            } catch (IOException var6) {
            }
        }
        if (this.field3254 != null) {
            for (int var3 = 0; var3 < this.field3254.length; var3++) {
                if (this.field3254[var3] != null) {
                    try {
                        this.field3254[var3].method6(113);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3257 != null) {
            try {
                this.field3257.method6(90);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB)Lth;", line = 566)
    public final class621 method1550(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 125) {
            this.method1546(-2, null);
        }
        return this.method1553((arg0 << 16) + arg2, (arg1 << 16) + arg3, 6, null, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Frame;)Lth;", line = 584)
    public final class621 method1551(int arg0, Frame arg1) {
        return arg0 < 101 ? null : this.method1553(0, 0, 7, arg1, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lth;", line = 611)
    public final class621 method1552(String arg0, Class arg1, int arg2) {
        if (arg2 != 9) {
            this.method1554(null, 38, null);
        }
        return this.method1553(0, 0, 9, new Object[] { arg1, arg0 }, (byte) 56);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILjava/lang/Object;B)Lth;", line = 628)
    private final class621 method1553(int arg0, int arg1, int arg2, Object arg3, byte arg4) {
        class621 var6 = new class621();
        var6.field8404 = arg1;
        var6.field8401 = arg3;
        var6.field8402 = arg0;
        var6.field8399 = arg2;
        synchronized (this) {
            if (this.field3244 == null) {
                this.field3244 = this.field3240 = var6;
            } else {
                this.field3244.field8400 = var6;
                this.field3244 = var6;
            }
            this.notify();
            if (arg4 != 56) {
                this.method1553(105, -114, 38, null, (byte) -26);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BILjava/io/File;)Z", line = 663)
    public final boolean method1554(byte[] arg0, int arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            if (arg1 != 1048576) {
                this.method1548(null, 18);
            }
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 847)
    public final Object method1555(byte arg0) {
        int var2 = 84 % ((arg0 - 30) / 47);
        return this.field3249;
    }
}
