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

@OriginalClass("client!k")
public class class525 implements Runnable {

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lqq;")
    public class441 field7652 = null;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Z")
    private boolean field7654 = false;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lsw;")
    private class701 field7657 = null;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Z")
    public boolean field7655 = false;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lsw;")
    private class701 field7667 = null;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Lqq;")
    public class441 field7672 = null;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "Lqq;")
    public class441 field7676 = null;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "Z")
    public boolean field7677 = false;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field7668;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "[Lqq;")
    public class441[] field7673;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field7662;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field7674;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lig;")
    private class223 field7669;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lg;")
    private class141 field7665;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Ljava/lang/Object;")
    private Object field7656;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field7658;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "J")
    private static volatile long field7653 = 0L;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    private static int field7675;

    // $FF: synthetic field
    @OriginalMember(owner = "client!k", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field7678;

    // $FF: synthetic field
    @OriginalMember(owner = "client!k", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field7679;

    // $FF: synthetic field
    @OriginalMember(owner = "client!k", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field7680;

    // $FF: synthetic field
    @OriginalMember(owner = "client!k", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field7681;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Ljava/lang/String;")
    private static String field7651;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7659;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Ljava/lang/String;")
    public static String field7660;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Ljava/lang/String;")
    public static String field7663;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Ljava/lang/String;")
    public static String field7664;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Ljava/lang/String;")
    private static String field7666;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Ljava/lang/String;")
    public static String field7670;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Ljava/lang/String;")
    private static String field7671;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7650;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7661;

    @OriginalMember(owner = "client!k", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class701 var2;
            synchronized (this) {
                while (true) {
                    if (this.field7654) {
                        return;
                    }
                    if (this.field7657 != null) {
                        var2 = this.field7657;
                        this.field7657 = this.field7657.field9887;
                        if (this.field7657 == null) {
                            this.field7667 = null;
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
                int var3 = var2.field9888;
                if (var3 == 1) {
                    if (class112.method1033(-11752) < field7653) {
                        throw new IOException();
                    }
                    var2.field9885 = new Socket(InetAddress.getByName((String) var2.field9886), var2.field9890);
                } else if (var3 == 22) {
                    if (class112.method1033(-11752) < field7653) {
                        throw new IOException();
                    }
                    try {
                        var2.field9885 = class98.method956(var2.field9890, (String) var2.field9886, 251).method1604(-90);
                    } catch (class191 var29) {
                        var2.field9885 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field9886);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field9890);
                    var2.field9885 = var23;
                } else if (var3 == 4) {
                    if (class112.method1033(-11752) < field7653) {
                        throw new IOException();
                    }
                    var2.field9885 = new DataInputStream(((URL) var2.field9886).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field9886;
                    if (this.field7655 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field9885 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var22 = (Object[]) var2.field9886;
                    if (this.field7655 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field9885 = ((Class) var22[0]).getDeclaredField((String) var22[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field9885 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field9886;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field7655) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class112.method1033(-11752) < field7653) {
                        throw new IOException();
                    }
                    String var21 = (var2.field9890 >> 24 & 0xFF) + "." + ((var2.field9890 & 0xFFA8EE) >> 16) + "." + (var2.field9890 >> 8 & 0xFF) + "." + (var2.field9890 & 0xFF);
                    var2.field9885 = InetAddress.getByName(var21).getHostName();
                } else if (var3 == 21) {
                    if (field7653 > class112.method1033(-11752)) {
                        throw new IOException();
                    }
                    var2.field9885 = InetAddress.getByName((String) var2.field9886).getAddress();
                } else if (var3 == 5) {
                    if (this.field7677) {
                        var2.field9885 = this.field7669.method1642((byte) 121);
                    } else {
                        var2.field9885 = Class.forName("wa").getMethod("listmodes").invoke(this.field7674);
                    }
                } else if (var3 == 6) {
                    Frame var9 = new Frame("Jagex Full Screen");
                    var2.field9885 = var9;
                    var9.setResizable(false);
                    if (this.field7677) {
                        this.field7669.method1644(var2.field9889 >> 16, var9, var2.field9890 >>> 16, (byte) -112, var2.field9890 & 0xFFFF, var2.field9889 & 0xFFFF);
                    } else {
                        Class.forName("wa").getMethod("enter", field7678 == null ? (field7678 = method3185("java.awt.Frame")) : field7678, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field7674, var9, Integer.valueOf(var2.field9890 >>> 16), new Integer(var2.field9890 & 0xFFFF), Integer.valueOf(var2.field9889 >> 16), new Integer(var2.field9889 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field7677) {
                        this.field7669.method1643((Frame) var2.field9886, -101);
                    } else {
                        Class.forName("wa").getMethod("exit").invoke(this.field7674);
                    }
                } else if (var3 == 12) {
                    class441 var10 = method3182(field7675, false, (String) var2.field9886, field7671);
                    var2.field9885 = var10;
                } else if (var3 == 13) {
                    class441 var20 = method3182(field7675, false, (String) var2.field9886, "");
                    var2.field9885 = var20;
                } else if (this.field7655 && var3 == 14) {
                    int var18 = var2.field9890;
                    int var19 = var2.field9889;
                    if (this.field7677) {
                        this.field7665.method1199(var18, (byte) -80, var19);
                    } else {
                        Class.forName("nv").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field7656, Integer.valueOf(var18), new Integer(var19));
                    }
                } else if (this.field7655 && var3 == 15) {
                    boolean var11 = var2.field9890 != 0;
                    Component var12 = (Component) var2.field9886;
                    if (this.field7677) {
                        this.field7665.method1198(var12, var11, (byte) -126);
                    } else {
                        Class.forName("nv").getDeclaredMethod("showcursor", field7679 == null ? (field7679 = method3185("java.awt.Component")) : field7679, Boolean.TYPE).invoke(this.field7656, var12, Boolean.valueOf(var11));
                    }
                } else if (!this.field7677 && var3 == 17) {
                    Object[] var13 = (Object[]) var2.field9886;
                    Class.forName("nv").getDeclaredMethod("setcustomcursor", field7679 == null ? (field7679 = method3185("java.awt.Component")) : field7679, field7680 == null ? (field7680 = method3185("[I")) : field7680, Integer.TYPE, Integer.TYPE, field7681 == null ? (field7681 = method3185("java.awt.Point")) : field7681).invoke(this.field7656, (Component) var13[0], (int[]) var13[1], Integer.valueOf(var2.field9890), new Integer(var2.field9889), (Point) var13[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field7660.startsWith("win")) {
                            throw new Exception();
                        }
                        String var14 = (String) var2.field9886;
                        if (!var14.startsWith("http://") && !var14.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var15 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var16 = 0; var16 < var14.length(); var16++) {
                            if (var15.indexOf(var14.charAt(var16)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                        var2.field9885 = null;
                    } catch (Exception var31) {
                        var2.field9885 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field9884 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field9884 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZI)Lsw;")
    public final class701 method3165(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method3176(64, null, null);
        }
        return this.method3172(70, null, (arg2 << 16) + arg0, (arg1 << 16) + arg4, 6);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Z")
    public final boolean method3166(byte arg0) {
        if (arg0 != -12) {
            return false;
        } else if (!this.field7655) {
            return false;
        } else if (this.field7677) {
            return this.field7669 != null;
        } else {
            return this.field7674 != null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z[BLjava/io/File;)Z")
    public final boolean method3167(boolean arg0, byte[] arg1, File arg2) {
        try {
            if (arg0) {
                FileOutputStream var4 = new FileOutputStream(arg2);
                var4.write(arg1, 0, arg1.length);
                var4.close();
                return true;
            } else {
                return false;
            }
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/net/URL;B)Lsw;")
    public final class701 method3168(URL arg0, byte arg1) {
        return arg1 == -30 ? this.method3172(75, arg0, 0, 0, 4) : null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;Z)Lsw;")
    public final class701 method3169(int arg0, String arg1, boolean arg2) {
        if (arg0 == 0) {
            return arg2 ? this.method3172(70, arg1, 0, 0, 12) : this.method3172(91, arg1, 0, 0, 13);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;B)Lsw;")
    public final class701 method3170(Class[] arg0, Class arg1, String arg2, byte arg3) {
        if (arg3 != -67) {
            this.method3173(false, -32, null, -102);
        }
        return this.method3172(105, new Object[] { arg1, arg2, arg0 }, 0, 0, 8);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
    public final void method3171(byte arg0) {
        if (arg0 <= -15) {
            field7653 = class112.method1033(-11752) + 5000L;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/Object;III)Lsw;")
    private final class701 method3172(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class701 var6 = new class701();
        var6.field9888 = arg4;
        if (arg0 < 69) {
            field7659 = null;
        }
        var6.field9890 = arg2;
        var6.field9886 = arg1;
        var6.field9889 = arg3;
        synchronized (this) {
            if (this.field7667 == null) {
                this.field7667 = this.field7657 = var6;
            } else {
                this.field7667.field9887 = var6;
                this.field7667 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZILjava/lang/String;I)Lsw;")
    public final class701 method3173(boolean arg0, int arg1, String arg2, int arg3) {
        if (arg1 != -29469) {
            field7670 = null;
        }
        return this.method3172(75, arg2, arg3, 0, arg0 ? 22 : 1);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Lsw;")
    public final class701 method3174(boolean arg0) {
        if (!arg0) {
            this.field7677 = false;
        }
        return this.method3172(114, null, 0, 0, 5);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;B)Lsw;")
    public final class701 method3175(String arg0, byte arg1) {
        if (arg1 > -116) {
            this.field7665 = null;
        }
        return this.method3172(98, arg0, 0, 0, 16);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lsw;")
    public final class701 method3176(int arg0, String arg1, Class arg2) {
        if (arg0 != 9) {
            field7650 = null;
        }
        return this.method3172(94, new Object[] { arg2, arg1 }, 0, 0, 9);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/Point;[IIILjava/awt/Component;)Lsw;")
    public final class701 method3177(int arg0, Point arg1, int[] arg2, int arg3, int arg4, Component arg5) {
        if (arg0 != 0) {
            field7664 = null;
        }
        return this.method3172(arg0 + 88, new Object[] { arg5, arg2, arg1 }, arg3, arg4, 17);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Frame;B)Lsw;")
    public final class701 method3178(Frame arg0, byte arg1) {
        return arg1 <= 92 ? null : this.method3172(104, arg0, 0, 0, 7);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method3179(int arg0) {
        return arg0 == -16 ? this.field7662 : null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lsw;")
    public final class701 method3180(Runnable arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method3178(null, (byte) -90);
        }
        return this.method3172(85, arg0, arg2, 0, 2);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLjava/lang/String;)Lqq;")
    public static final class441 method3181(byte arg0, String arg1) {
        if (arg0 > -96) {
            method3181((byte) -74, null);
        }
        return method3182(field7675, false, arg1, field7671);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)Lqq;")
    private static final class441 method3182(int arg0, boolean arg1, String arg2, String arg3) {
        if (arg1) {
            method3181((byte) 45, null);
        }
        String var4;
        if (arg0 == 33) {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg0 == 34) {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field7666, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class441(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)Lsw;")
    public final class701 method3183(byte arg0, int arg1) {
        if (arg0 != 115) {
            this.field7668 = null;
        }
        return this.method3172(arg0 ^ 0xC, null, arg1, 0, 3);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public final void method3184(int arg0) {
        if (arg0 != 5) {
            this.method3184(-107);
        }
        synchronized (this) {
            this.field7654 = true;
            this.notifyAll();
        }
        try {
            this.field7658.join();
        } catch (InterruptedException var8) {
        }
        if (this.field7672 != null) {
            try {
                this.field7672.method2785(-1856);
            } catch (IOException var7) {
            }
        }
        if (this.field7652 != null) {
            try {
                this.field7652.method2785(-1856);
            } catch (IOException var6) {
            }
        }
        if (this.field7673 != null) {
            for (int var3 = 0; var3 < this.field7673.length; var3++) {
                if (this.field7673[var3] != null) {
                    try {
                        this.field7673[var3].method2785(-1856);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field7676 != null) {
            try {
                this.field7676.method2785(-1856);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class525(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        this.field7655 = arg3;
        field7670 = "1.1";
        field7675 = arg0;
        field7663 = "Unknown";
        field7671 = arg1;
        try {
            field7663 = System.getProperty("java.vendor");
            field7670 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field7663.toLowerCase().indexOf("microsoft") != -1) {
            this.field7677 = true;
        }
        try {
            field7651 = System.getProperty("os.name");
        } catch (Exception var19) {
            field7651 = "Unknown";
        }
        field7660 = field7651.toLowerCase();
        try {
            field7659 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field7659 = "";
        }
        try {
            field7664 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field7664 = "";
        }
        try {
            field7666 = System.getProperty("user.home");
            if (field7666 != null) {
                field7666 = field7666 + "/";
            }
        } catch (Exception var16) {
        }
        if (field7666 == null) {
            field7666 = "~/";
        }
        try {
            this.field7668 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field7677) {
            try {
                field7661 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field7650 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class317.method2165(field7675, 118, field7671);
        if (this.field7655) {
            this.field7676 = new class441(class317.method2163("random.dat", null, field7675, (byte) 115), "rw", 25L);
            this.field7672 = new class441(class317.method2164("main_file_cache.dat2", -25419), "rw", 209715200L);
            this.field7652 = new class441(class317.method2164("main_file_cache.idx255", -25419), "rw", 1048576L);
            this.field7673 = new class441[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field7673[var5] = new class441(class317.method2164("main_file_cache.idx" + var5, -25419), "rw", 1048576L);
            }
            if (this.field7677) {
                try {
                    this.field7662 = Class.forName("pq").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field7677) {
                    this.field7669 = new class223();
                } else {
                    this.field7674 = Class.forName("wa").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field7677) {
                    this.field7665 = new class141();
                } else {
                    this.field7656 = Class.forName("nv").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field7655 && !this.field7677) {
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
        this.field7654 = false;
        this.field7658 = new Thread(this);
        this.field7658.setPriority(10);
        this.field7658.setDaemon(true);
        this.field7658.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3185(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
