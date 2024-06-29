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

@OriginalClass("client!ii")
public class class519 implements Runnable {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Z")
    private boolean field6912 = false;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Z")
    public boolean field6915 = false;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Lbaa;")
    public class488 field6914 = null;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lsa;")
    private class192 field6911 = null;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Lbaa;")
    public class488 field6918 = null;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Z")
    public boolean field6917 = false;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "Lsa;")
    private class192 field6930 = null;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Lbaa;")
    public class488 field6933 = null;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6925;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[Lbaa;")
    public class488[] field6908;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field6932;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "Lbr;")
    private class365 field6934;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Ljava/lang/Object;")
    private Object field6913;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Liea;")
    private class447 field6922;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field6931;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field6909;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "J")
    private static volatile long field6926 = 0L;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    private static int field6927;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field6936;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ii", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field6937;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ii", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field6938;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ii", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field6939;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Ljava/lang/String;")
    private static String field6910;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6920;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6921;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Ljava/lang/String;")
    public static String field6923;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Ljava/lang/String;")
    private static String field6924;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "Ljava/lang/String;")
    public static String field6928;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Ljava/lang/String;")
    public static String field6929;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "Ljava/lang/String;")
    private static String field6935;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6916;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6919;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2910(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;I)Lbaa;", line = 3)
    public static final class488 method2890(String arg0, int arg1) {
        return arg1 >= -75 ? null : method2907(0, field6910, arg0, field6927);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lsa;", line = 13)
    public final class192 method2891(Class arg0, int arg1, String arg2) {
        if (arg1 != -4) {
            this.field6933 = null;
        }
        return this.method2898(9, -34, 0, new Object[] { arg0, arg2 }, 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;ZZ)Lsa;", line = 23)
    public final class192 method2892(String arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            return arg2 ? this.method2898(12, -98, 0, arg0, 0) : this.method2898(13, -45, 0, arg0, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Z", line = 39)
    public final boolean method2893(int arg0) {
        if (arg0 != -34) {
            return true;
        } else if (!this.field6915) {
            return false;
        } else if (this.field6917) {
            return this.field6934 != null;
        } else {
            return this.field6913 != null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/net/URL;B)Lsa;", line = 60)
    public final class192 method2894(URL arg0, byte arg1) {
        if (arg1 < 40) {
            this.method2899(80);
        }
        return this.method2898(4, -110, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 72)
    public final Object method2895(int arg0) {
        if (arg0 != 25150) {
            this.method2893(53);
        }
        return this.field6932;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 84)
    public final void method2896(int arg0) {
        field6926 = class681.method3802(arg0 - 89135) + 5000L;
        if (arg0 != 65535) {
            this.method2898(39, 4, 43, null, -17);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;IZ)Lsa;", line = 95)
    public final class192 method2897(int arg0, String arg1, int arg2, boolean arg3) {
        return arg2 == 0 ? this.method2898(arg3 ? 22 : 1, -46, 0, arg1, arg0) : null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIILjava/lang/Object;I)Lsa;", line = 107)
    private final class192 method2898(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class192 var6 = new class192();
        var6.field2819 = arg4;
        var6.field2815 = arg2;
        var6.field2814 = arg0;
        var6.field2818 = arg3;
        synchronized (this) {
            if (this.field6930 == null) {
                this.field6930 = this.field6911 = var6;
            } else {
                this.field6930.field2817 = var6;
                this.field6930 = var6;
            }
            this.notify();
        }
        if (arg1 >= -30) {
            this.method2891(null, -8, null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V", line = 141)
    public final void method2899(int arg0) {
        synchronized (this) {
            this.field6912 = true;
            this.notifyAll();
            int var3 = 42 / ((arg0 - 62) / 56);
        }
        try {
            this.field6909.join();
        } catch (InterruptedException var9) {
        }
        if (this.field6933 != null) {
            try {
                this.field6933.method2729((byte) -21);
            } catch (IOException var8) {
            }
        }
        if (this.field6914 != null) {
            try {
                this.field6914.method2729((byte) 108);
            } catch (IOException var7) {
            }
        }
        if (this.field6908 != null) {
            for (int var4 = 0; var4 < this.field6908.length; var4++) {
                if (this.field6908[var4] != null) {
                    try {
                        this.field6908[var4].method2729((byte) -117);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field6918 != null) {
            try {
                this.field6918.method2729((byte) -101);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "run", descriptor = "()V", line = 201)
    public final void run() {
        while (true) {
            class192 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6912) {
                        return;
                    }
                    if (this.field6911 != null) {
                        var2 = this.field6911;
                        this.field6911 = this.field6911.field2817;
                        if (this.field6911 == null) {
                            this.field6930 = null;
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
                int var3 = var2.field2814;
                if (var3 == 1) {
                    if (class681.method3802(-23600) < field6926) {
                        throw new IOException();
                    }
                    var2.field2820 = new Socket(InetAddress.getByName((String) var2.field2818), var2.field2819);
                } else if (var3 == 22) {
                    if (field6926 > class681.method3802(-23600)) {
                        throw new IOException();
                    }
                    try {
                        var2.field2820 = class106.method802((String) var2.field2818, (byte) -112, var2.field2819).method1870(-23280);
                    } catch (class664 var29) {
                        var2.field2820 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2818);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2819);
                    var2.field2820 = var4;
                } else if (var3 == 4) {
                    if (field6926 > class681.method3802(-23600)) {
                        throw new IOException();
                    }
                    var2.field2820 = new DataInputStream(((URL) var2.field2818).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2818;
                    if (this.field6915 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2820 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var22 = (Object[]) var2.field2818;
                    if (this.field6915 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2820 = ((Class) var22[0]).getDeclaredField((String) var22[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2820 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field2818;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field6915) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class681.method3802(-23600) < field6926) {
                        throw new IOException();
                    }
                    String var21 = (var2.field2819 >> 24 & 0xFF) + "." + ((var2.field2819 & 0xFFA9F6) >> 16) + "." + (var2.field2819 >> 8 & 0xFF) + "." + (var2.field2819 & 0xFF);
                    var2.field2820 = InetAddress.getByName(var21).getHostName();
                } else if (var3 == 21) {
                    if (field6926 > class681.method3802(-23600)) {
                        throw new IOException();
                    }
                    var2.field2820 = InetAddress.getByName((String) var2.field2818).getAddress();
                } else if (var3 == 5) {
                    if (this.field6917) {
                        var2.field2820 = this.field6934.method2156(true);
                    } else {
                        var2.field2820 = Class.forName("se").getMethod("listmodes").invoke(this.field6913);
                    }
                } else if (var3 == 6) {
                    Frame var20 = new Frame("Jagex Full Screen");
                    var2.field2820 = var20;
                    var20.setResizable(false);
                    if (this.field6917) {
                        this.field6934.method2154(var2.field2819 >>> 16, var2.field2815 >> 16, -127, var2.field2819 & 0xFFFF, var2.field2815 & 0xFFFF, var20);
                    } else {
                        Class.forName("se").getMethod("enter", field6939 == null ? (field6939 = method2910("java.awt.Frame")) : field6939, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field6913, var20, Integer.valueOf(var2.field2819 >>> 16), new Integer(var2.field2819 & 0xFFFF), Integer.valueOf(var2.field2815 >> 16), new Integer(var2.field2815 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field6917) {
                        this.field6934.method2155(false, (Frame) var2.field2818);
                    } else {
                        Class.forName("se").getMethod("exit").invoke(this.field6913);
                    }
                } else if (var3 == 12) {
                    class488 var9 = method2907(0, field6910, (String) var2.field2818, field6927);
                    var2.field2820 = var9;
                } else if (var3 == 13) {
                    class488 var10 = method2907(0, "", (String) var2.field2818, field6927);
                    var2.field2820 = var10;
                } else if (this.field6915 && var3 == 14) {
                    int var11 = var2.field2819;
                    int var12 = var2.field2815;
                    if (this.field6917) {
                        this.field6922.method2519(var12, true, var11);
                    } else {
                        Class.forName("ud").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field6931, Integer.valueOf(var11), new Integer(var12));
                    }
                } else if (this.field6915 && var3 == 15) {
                    boolean var13 = var2.field2819 != 0;
                    Component var14 = (Component) var2.field2818;
                    if (this.field6917) {
                        this.field6922.method2518(16489, var14, var13);
                    } else {
                        Class.forName("ud").getDeclaredMethod("showcursor", field6936 == null ? (field6936 = method2910("java.awt.Component")) : field6936, Boolean.TYPE).invoke(this.field6931, var14, Boolean.valueOf(var13));
                    }
                } else if (!this.field6917 && var3 == 17) {
                    Object[] var15 = (Object[]) var2.field2818;
                    Class.forName("ud").getDeclaredMethod("setcustomcursor", field6936 == null ? (field6936 = method2910("java.awt.Component")) : field6936, field6937 == null ? (field6937 = method2910("[I")) : field6937, Integer.TYPE, Integer.TYPE, field6938 == null ? (field6938 = method2910("java.awt.Point")) : field6938).invoke(this.field6931, (Component) var15[0], (int[]) var15[1], Integer.valueOf(var2.field2819), new Integer(var2.field2815), (Point) var15[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field6923.startsWith("win")) {
                            throw new Exception();
                        }
                        String var16 = (String) var2.field2818;
                        if (!var16.startsWith("http://") && !var16.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var17 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var18 = 0;
                        while (true) {
                            if (var18 >= var16.length()) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var16 + "\"");
                                var2.field2820 = null;
                                break;
                            }
                            if (var17.indexOf(var16.charAt(var18)) == -1) {
                                throw new Exception();
                            }
                            var18++;
                        }
                    } catch (Exception var31) {
                        var2.field2820 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field2816 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field2816 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;)Lsa;", line = 497)
    public final class192 method2900(int arg0, String arg1) {
        int var3 = 119 / ((32 - arg0) / 45);
        return this.method2898(16, -54, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 697)
    public class519(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field6920 = "1.1";
        field6927 = arg0;
        this.field6915 = arg3;
        field6910 = arg1;
        field6928 = "Unknown";
        try {
            field6928 = System.getProperty("java.vendor");
            field6920 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field6928.toLowerCase().indexOf("microsoft") != -1) {
            this.field6917 = true;
        }
        try {
            field6935 = System.getProperty("os.name");
        } catch (Exception var19) {
            field6935 = "Unknown";
        }
        field6923 = field6935.toLowerCase();
        try {
            field6929 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field6929 = "";
        }
        try {
            field6921 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field6921 = "";
        }
        try {
            field6924 = System.getProperty("user.home");
            if (field6924 != null) {
                field6924 = field6924 + "/";
            }
        } catch (Exception var16) {
        }
        if (field6924 == null) {
            field6924 = "~/";
        }
        try {
            this.field6925 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field6917) {
            try {
                field6919 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field6916 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class598.method3296(field6927, field6910, 0);
        if (this.field6915) {
            this.field6918 = new class488(class598.method3297(null, field6927, "random.dat", (byte) 58), "rw", 25L);
            this.field6933 = new class488(class598.method3295((byte) 13, "main_file_cache.dat2"), "rw", 209715200L);
            this.field6914 = new class488(class598.method3295((byte) 13, "main_file_cache.idx255"), "rw", 1048576L);
            this.field6908 = new class488[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field6908[var5] = new class488(class598.method3295((byte) 13, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field6917) {
                try {
                    this.field6932 = Class.forName("mj").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field6917) {
                    this.field6934 = new class365();
                } else {
                    this.field6913 = Class.forName("se").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field6917) {
                    this.field6922 = new class447();
                } else {
                    this.field6931 = Class.forName("ud").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field6915 && !this.field6917) {
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
        this.field6912 = false;
        this.field6909 = new Thread(this);
        this.field6909.setPriority(10);
        this.field6909.setDaemon(true);
        this.field6909.start();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lsa;", line = 520)
    public final class192 method2901(boolean arg0, Class[] arg1, String arg2, Class arg3) {
        if (arg0) {
            method2907(74, null, null, -19);
        }
        return this.method2898(8, -67, 0, new Object[] { arg3, arg2, arg1 }, 0);
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)Lsa;", line = 530)
    public final class192 method2902(int arg0) {
        if (arg0 < 61) {
            this.field6918 = null;
        }
        return this.method2898(5, -66, 0, null, 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Point;Ljava/awt/Component;ZII[I)Lsa;", line = 550)
    public final class192 method2903(Point arg0, Component arg1, boolean arg2, int arg3, int arg4, int[] arg5) {
        return arg2 ? this.method2898(17, -40, arg4, new Object[] { arg1, arg5, arg0 }, arg3) : null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lsa;", line = 567)
    public final class192 method2904(Runnable arg0, int arg1, byte arg2) {
        int var4 = 94 / ((58 - arg2) / 44);
        return this.method2898(2, -58, 0, arg0, arg1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIBII)Lsa;", line = 585)
    public final class192 method2905(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = -33 % ((arg2 + 25) / 56);
        return this.method2898(6, -111, (arg3 << 16) + arg1, null, (arg4 << 16) + arg0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Frame;I)Lsa;", line = 599)
    public final class192 method2906(Frame arg0, int arg1) {
        return arg1 == 0 ? this.method2898(7, -114, 0, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Lbaa;", line = 610)
    private static final class488 method2907(int arg0, String arg1, String arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field6924, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = arg0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class488(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLjava/io/File;[B)Z", line = 653)
    public final boolean method2908(boolean arg0, File arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            if (arg0) {
                this.method2908(true, null, null);
            }
            var4.write(arg2, 0, arg2.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)Lsa;", line = 687)
    public final class192 method2909(int arg0, byte arg1) {
        if (arg1 > -95) {
            this.method2902(97);
        }
        return this.method2898(3, -32, 0, null, arg0);
    }
}
