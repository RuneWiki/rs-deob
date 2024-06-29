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

@OriginalClass("client!gh")
public class class546 implements Runnable {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lsb;")
    private class290 field7834 = null;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lww;")
    public class729 field7838 = null;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lsb;")
    private class290 field7842 = null;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Lww;")
    public class729 field7853 = null;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Z")
    public boolean field7847 = false;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Z")
    public boolean field7851 = false;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lww;")
    public class729 field7843 = null;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Z")
    private boolean field7859 = false;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field7832;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[Lww;")
    public class729[] field7839;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Ljava/lang/Object;")
    private Object field7835;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field7844;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Low;")
    private class346 field7848;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Ljava/lang/Object;")
    private Object field7841;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lgda;")
    private class53 field7833;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Ljava/lang/Thread;")
    private Thread field7855;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "J")
    private static volatile long field7857 = 0L;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    private static int field7850;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gh", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field7860;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gh", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field7861;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gh", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field7862;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gh", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field7863;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field7836;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7837;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field7840;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Ljava/lang/String;")
    private static String field7846;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Ljava/lang/String;")
    private static String field7849;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Ljava/lang/String;")
    public static String field7852;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Ljava/lang/String;")
    public static String field7856;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "Ljava/lang/String;")
    private static String field7858;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7845;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7854;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3218(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;B)Lsb;", line = 3)
    public final class290 method3198(Class arg0, String arg1, Class[] arg2, byte arg3) {
        if (arg3 != -108) {
            this.field7835 = null;
        }
        return this.method3209(8, new Object[] { arg0, arg1, arg2 }, 5868, 0, 0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/io/File;[B)Z", line = 22)
    public final boolean method3199(int arg0, File arg1, byte[] arg2) {
        if (arg0 > -64) {
            this.method3200((byte) -62);
        }
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, 0, arg2.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Lsb;", line = 46)
    public final class290 method3200(byte arg0) {
        if (arg0 != -94) {
            this.field7835 = null;
        }
        return this.method3209(5, null, arg0 ^ 0xFFFFE94E, 0, 0);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 702)
    public class546(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field7850 = arg0;
        this.field7851 = arg3;
        field7856 = "1.1";
        field7858 = arg1;
        field7837 = "Unknown";
        try {
            field7837 = System.getProperty("java.vendor");
            field7856 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field7837.toLowerCase().indexOf("microsoft") != -1) {
            this.field7847 = true;
        }
        try {
            field7849 = System.getProperty("os.name");
        } catch (Exception var19) {
            field7849 = "Unknown";
        }
        field7836 = field7849.toLowerCase();
        try {
            field7852 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field7852 = "";
        }
        try {
            field7840 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field7840 = "";
        }
        try {
            field7846 = System.getProperty("user.home");
            if (field7846 != null) {
                field7846 = field7846 + "/";
            }
        } catch (Exception var16) {
        }
        if (field7846 == null) {
            field7846 = "~/";
        }
        try {
            this.field7832 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field7847) {
            try {
                field7845 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field7854 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class580.method3341(field7850, 0, field7858);
        if (this.field7851) {
            this.field7853 = new class729(class580.method3343(null, -26, "random.dat", field7850), "rw", 25L);
            this.field7838 = new class729(class580.method3342("main_file_cache.dat2", 16), "rw", 209715200L);
            this.field7843 = new class729(class580.method3342("main_file_cache.idx255", 16), "rw", 1048576L);
            this.field7839 = new class729[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field7839[var5] = new class729(class580.method3342("main_file_cache.idx" + var5, 16), "rw", 1048576L);
            }
            if (this.field7847) {
                try {
                    this.field7835 = Class.forName("df").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field7847) {
                    this.field7848 = new class346();
                } else {
                    this.field7844 = Class.forName("ep").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field7847) {
                    this.field7833 = new class53();
                } else {
                    this.field7841 = Class.forName("vb").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field7851 && !this.field7847) {
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
        this.field7859 = false;
        this.field7855 = new Thread(this);
        this.field7855.setPriority(10);
        this.field7855.setDaemon(true);
        this.field7855.start();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZBLjava/lang/String;)Lsb;", line = 66)
    public final class290 method3201(boolean arg0, byte arg1, String arg2) {
        int var4 = 49 % ((arg1 + 67) / 47);
        return arg0 ? this.method3209(12, arg2, 5868, 0, 0) : this.method3209(13, arg2, 5868, 0, 0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILjava/awt/Component;[ILjava/awt/Point;)Lsb;", line = 79)
    public final class290 method3202(int arg0, int arg1, int arg2, Component arg3, int[] arg4, Point arg5) {
        if (arg0 != -4052) {
            field7850 = -13;
        }
        return this.method3209(17, new Object[] { arg3, arg4, arg5 }, 5868, arg2, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)Lsb;", line = 97)
    public final class290 method3203(byte arg0, int arg1) {
        int var3 = 70 / ((-arg0 - 37) / 57);
        return this.method3209(3, null, 5868, 0, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/net/URL;I)Lsb;", line = 110)
    public final class290 method3204(URL arg0, int arg1) {
        return arg1 == -18528 ? this.method3209(4, arg0, 5868, 0, 0) : null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)Lsb;", line = 125)
    public final class290 method3205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 77) {
            this.method3213(null, null, (byte) -80);
        }
        return this.method3209(6, null, 5868, (arg2 << 16) + arg1, (arg0 << 16) - -arg4);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)Lww;", line = 143)
    private static final class729 method3206(boolean arg0, String arg1, String arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
        }
        if (!arg0) {
            return null;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field7846, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class729(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZLjava/lang/String;Z)Lsb;", line = 184)
    public final class290 method3207(int arg0, boolean arg1, String arg2, boolean arg3) {
        if (arg1) {
            this.method3215(13, null, 53);
        }
        return this.method3209(arg3 ? 22 : 1, arg2, 5868, 0, arg0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 195)
    public final void method3208(int arg0) {
        synchronized (this) {
            this.field7859 = true;
            this.notifyAll();
        }
        try {
            this.field7855.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 != 0) {
            this.method3198(null, null, null, (byte) -122);
        }
        if (this.field7838 != null) {
            try {
                this.field7838.method4060((byte) 75);
            } catch (IOException var7) {
            }
        }
        if (this.field7843 != null) {
            try {
                this.field7843.method4060((byte) 117);
            } catch (IOException var6) {
            }
        }
        if (this.field7839 != null) {
            for (int var3 = 0; var3 < this.field7839.length; var3++) {
                if (this.field7839[var3] != null) {
                    try {
                        this.field7839[var3].method4060((byte) 125);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field7853 != null) {
            try {
                this.field7853.method4060((byte) 98);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/Object;III)Lsb;", line = 253)
    private final class290 method3209(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class290 var6 = new class290();
        var6.field3574 = arg3;
        var6.field3576 = arg0;
        var6.field3575 = arg1;
        if (arg2 != 5868) {
            this.method3208(103);
        }
        var6.field3578 = arg4;
        synchronized (this) {
            if (this.field7842 == null) {
                this.field7842 = this.field7834 = var6;
            } else {
                this.field7842.field3579 = var6;
                this.field7842 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLjava/awt/Frame;)Lsb;", line = 283)
    public final class290 method3210(boolean arg0, Frame arg1) {
        return arg0 ? this.method3209(7, arg1, 5868, 0, 0) : null;
    }

    @OriginalMember(owner = "client!gh", name = "run", descriptor = "()V", line = 296)
    public final void run() {
        while (true) {
            class290 var2;
            synchronized (this) {
                while (true) {
                    if (this.field7859) {
                        return;
                    }
                    if (this.field7834 != null) {
                        var2 = this.field7834;
                        this.field7834 = this.field7834.field3579;
                        if (this.field7834 == null) {
                            this.field7842 = null;
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
                int var3 = var2.field3576;
                if (var3 == 1) {
                    if (field7857 > class652.method3700(-1)) {
                        throw new IOException();
                    }
                    var2.field3577 = new Socket(InetAddress.getByName((String) var2.field3575), var2.field3578);
                } else if (var3 == 22) {
                    if (class652.method3700(-1) < field7857) {
                        throw new IOException();
                    }
                    try {
                        var2.field3577 = class729.method4061((byte) -66, var2.field3578, (String) var2.field3575).method874(15447);
                    } catch (class117 var29) {
                        var2.field3577 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3575);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3578);
                    var2.field3577 = var4;
                } else if (var3 == 4) {
                    if (class652.method3700(-1) < field7857) {
                        throw new IOException();
                    }
                    var2.field3577 = new DataInputStream(((URL) var2.field3575).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3575;
                    if (this.field7851 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3577 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field3575;
                    if (this.field7851 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3577 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3577 = var22.getContents(null);
                } else if (var3 == 19) {
                    Transferable var20 = (Transferable) var2.field3575;
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var21.setContents(var20, null);
                } else if (!this.field7851) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field7857 > class652.method3700(-1)) {
                        throw new IOException();
                    }
                    String var19 = (var2.field3578 >> 24 & 0xFF) + "." + ((var2.field3578 & 0xFFEBE9) >> 16) + "." + (var2.field3578 >> 8 & 0xFF) + "." + (var2.field3578 & 0xFF);
                    var2.field3577 = InetAddress.getByName(var19).getHostName();
                } else if (var3 == 21) {
                    if (field7857 > class652.method3700(-1)) {
                        throw new IOException();
                    }
                    var2.field3577 = InetAddress.getByName((String) var2.field3575).getAddress();
                } else if (var3 == 5) {
                    if (this.field7847) {
                        var2.field3577 = this.field7848.method2059(true);
                    } else {
                        var2.field3577 = Class.forName("ep").getMethod("listmodes").invoke(this.field7844);
                    }
                } else if (var3 == 6) {
                    Frame var7 = new Frame("Jagex Full Screen");
                    var2.field3577 = var7;
                    var7.setResizable(false);
                    if (this.field7847) {
                        this.field7848.method2061(6130, var2.field3574 >> 16, var2.field3578 & 0xFFFF, var7, var2.field3574 & 0xFFFF, var2.field3578 >>> 16);
                    } else {
                        Class.forName("ep").getMethod("enter", field7860 == null ? (field7860 = method3218("java.awt.Frame")) : field7860, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field7844, var7, Integer.valueOf(var2.field3578 >>> 16), new Integer(var2.field3578 & 0xFFFF), Integer.valueOf(var2.field3574 >> 16), new Integer(var2.field3574 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field7847) {
                        this.field7848.method2060((Frame) var2.field3575, 8);
                    } else {
                        Class.forName("ep").getMethod("exit").invoke(this.field7844);
                    }
                } else if (var3 == 12) {
                    class729 var8 = method3206(true, field7858, (String) var2.field3575, field7850);
                    var2.field3577 = var8;
                } else if (var3 == 13) {
                    class729 var9 = method3206(true, "", (String) var2.field3575, field7850);
                    var2.field3577 = var9;
                } else if (this.field7851 && var3 == 14) {
                    int var17 = var2.field3578;
                    int var18 = var2.field3574;
                    if (this.field7847) {
                        this.field7833.method301(var18, 89, var17);
                    } else {
                        Class.forName("vb").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field7841, Integer.valueOf(var17), new Integer(var18));
                    }
                } else if (this.field7851 && var3 == 15) {
                    boolean var15 = var2.field3578 != 0;
                    Component var16 = (Component) var2.field3575;
                    if (this.field7847) {
                        this.field7833.method300(0, var16, var15);
                    } else {
                        Class.forName("vb").getDeclaredMethod("showcursor", field7861 == null ? (field7861 = method3218("java.awt.Component")) : field7861, Boolean.TYPE).invoke(this.field7841, var16, Boolean.valueOf(var15));
                    }
                } else if (!this.field7847 && var3 == 17) {
                    Object[] var14 = (Object[]) var2.field3575;
                    Class.forName("vb").getDeclaredMethod("setcustomcursor", field7861 == null ? (field7861 = method3218("java.awt.Component")) : field7861, field7862 == null ? (field7862 = method3218("[I")) : field7862, Integer.TYPE, Integer.TYPE, field7863 == null ? (field7863 = method3218("java.awt.Point")) : field7863).invoke(this.field7841, (Component) var14[0], (int[]) var14[1], Integer.valueOf(var2.field3578), new Integer(var2.field3574), (Point) var14[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field7836.startsWith("win")) {
                            throw new Exception();
                        }
                        String var10 = (String) var2.field3575;
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
                        var2.field3577 = null;
                    } catch (Exception var31) {
                        var2.field3577 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field3573 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field3573 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 593)
    public final Object method3211(int arg0) {
        if (arg0 != 0) {
            this.method3212(-4, null);
        }
        return this.field7835;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/String;)Lsb;", line = 603)
    public final class290 method3212(int arg0, String arg1) {
        if (arg0 != 0) {
            this.method3208(121);
        }
        return this.method3209(16, arg1, 5868, 0, 0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lsb;", line = 621)
    public final class290 method3213(Class arg0, String arg1, byte arg2) {
        if (arg2 > -26) {
            this.field7848 = null;
        }
        return this.method3209(9, new Object[] { arg0, arg1 }, 5868, 0, 0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLjava/lang/String;)Lww;", line = 632)
    public static final class729 method3214(byte arg0, String arg1) {
        return arg0 == -13 ? method3206(true, field7858, arg1, field7850) : null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lsb;", line = 652)
    public final class290 method3215(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 2) {
            this.field7835 = null;
        }
        return this.method3209(2, arg1, 5868, 0, arg0);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)Z", line = 668)
    public final boolean method3216(int arg0) {
        if (!this.field7851) {
            return false;
        }
        if (arg0 > -112) {
            field7856 = null;
        }
        if (this.field7847) {
            return this.field7848 != null;
        } else {
            return this.field7844 != null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 689)
    public final void method3217(int arg0) {
        if (arg0 != 10450) {
            field7852 = null;
        }
        field7857 = class652.method3700(-1) + 5000L;
    }
}
