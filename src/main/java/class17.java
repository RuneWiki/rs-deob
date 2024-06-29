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

@OriginalClass("client!n")
public class class17 implements Runnable {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Loaa;")
    public class263 field772 = null;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Z")
    public boolean field771 = false;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Loaa;")
    public class263 field790 = null;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Z")
    private boolean field786 = false;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lkp;")
    private class456 field783 = null;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Z")
    public boolean field795 = false;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Loaa;")
    public class263 field777 = null;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Lkp;")
    private class456 field797 = null;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field789;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "[Loaa;")
    public class263[] field775;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Ljava/lang/Object;")
    private Object field782;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Lfw;")
    private class52 field796;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field791;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Ljava/lang/Object;")
    private Object field773;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lo;")
    private class28 field774;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field779;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "J")
    private static volatile long field794 = 0L;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    private static int field788;

    // $FF: synthetic field
    @OriginalMember(owner = "client!n", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field799;

    // $FF: synthetic field
    @OriginalMember(owner = "client!n", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field800;

    // $FF: synthetic field
    @OriginalMember(owner = "client!n", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field801;

    // $FF: synthetic field
    @OriginalMember(owner = "client!n", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field802;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Ljava/lang/String;")
    private static String field776;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Ljava/lang/String;")
    public static String field778;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Ljava/lang/String;")
    public static String field780;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Ljava/lang/String;")
    public static String field781;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Ljava/lang/String;")
    private static String field785;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Ljava/lang/String;")
    public static String field787;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Ljava/lang/String;")
    public static String field793;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "Ljava/lang/String;")
    private static String field798;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field784;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field792;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;I)Loaa;")
    public static final class263 method391(String arg0, int arg1) {
        if (arg1 != 2) {
            method391(null, -38);
        }
        return method395(field798, arg0, field788, arg1 - 100);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BZLjava/io/File;)Z")
    public final boolean method392(byte[] arg0, boolean arg1, File arg2) {
        if (!arg1) {
            this.run();
        }
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIZ)Lkp;")
    public final class456 method393(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? this.method401((arg3 << 16) + arg2, 48, (arg0 << 16) + arg1, null, 6) : null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method394(boolean arg0) {
        return arg0 ? null : this.field782;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Loaa;")
    private static final class263 method395(String arg0, String arg1, int arg2, int arg3) {
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field776, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        int var6 = 0;
        int var7 = -112 % ((-arg3 - 9) / 60);
        while (var6 < var5.length) {
            String var8 = var5[var6];
            if (var8.length() <= 0 || (new File(var8)).exists()) {
                try {
                    return new class263(new File(var8, var4), "rw", 10000L);
                } catch (Exception var10) {
                }
            }
            var6++;
        }
        return null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;ZBI)Lkp;")
    public final class456 method396(String arg0, boolean arg1, byte arg2, int arg3) {
        if (arg2 < 0) {
            field792 = null;
        }
        return this.method401(0, 31, arg3, arg0, arg1 ? 22 : 1);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/net/URL;I)Lkp;")
    public final class456 method397(URL arg0, int arg1) {
        if (arg1 >= -12) {
            field784 = null;
        }
        return this.method401(0, 34, 0, arg0, 4);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Frame;I)Lkp;")
    public final class456 method398(Frame arg0, int arg1) {
        int var3 = -31 % ((-arg1 - 1) / 61);
        return this.method401(0, 114, 0, arg0, 7);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([IZLjava/awt/Point;IILjava/awt/Component;)Lkp;")
    public final class456 method399(int[] arg0, boolean arg1, Point arg2, int arg3, int arg4, Component arg5) {
        if (!arg1) {
            this.method405(49, (byte) 38);
        }
        return this.method401(arg3, 44, arg4, new Object[] { arg5, arg0, arg2 }, 17);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Lkp;")
    public final class456 method400(int arg0, Runnable arg1, boolean arg2) {
        return arg2 ? null : this.method401(0, 115, arg0, arg1, 2);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILjava/lang/Object;I)Lkp;")
    private final class456 method401(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class456 var6 = new class456();
        var6.field6501 = arg3;
        var6.field6497 = arg4;
        var6.field6500 = arg0;
        var6.field6503 = arg2;
        if (arg1 < 27) {
            this.method396(null, false, (byte) -119, -87);
        }
        synchronized (this) {
            if (this.field797 == null) {
                this.field797 = this.field783 = var6;
            } else {
                this.field797.field6498 = var6;
                this.field797 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;ZB)Lkp;")
    public final class456 method402(String arg0, boolean arg1, byte arg2) {
        int var4 = -72 / ((arg2 + 70) / 51);
        return arg1 ? this.method401(0, 122, 0, arg0, 12) : this.method401(0, 106, 0, arg0, 13);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public final void method403(int arg0) {
        field794 = class525.method3074((byte) -101) + 5000L;
        if (arg0 != 3) {
            this.method393(-1, -24, -41, -122, true);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lkp;")
    public final class456 method404(int arg0, String arg1, Class arg2, Class[] arg3) {
        int var5 = 83 % ((65 - arg0) / 37);
        return this.method401(0, 87, 0, new Object[] { arg2, arg1, arg3 }, 8);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lkp;")
    public final class456 method405(int arg0, byte arg1) {
        if (arg1 > -11) {
            this.field791 = null;
        }
        return this.method401(0, 123, arg0, null, 3);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)Z")
    public final boolean method406(int arg0) {
        if (arg0 != 0) {
            return false;
        } else if (!this.field795) {
            return false;
        } else if (this.field771) {
            return this.field796 != null;
        } else {
            return this.field791 != null;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public final void method407(int arg0) {
        synchronized (this) {
            this.field786 = true;
            this.notifyAll();
        }
        if (arg0 != 0) {
            return;
        }
        try {
            this.field779.join();
        } catch (InterruptedException var8) {
        }
        if (this.field790 != null) {
            try {
                this.field790.method1726((byte) -128);
            } catch (IOException var7) {
            }
        }
        if (this.field772 != null) {
            try {
                this.field772.method1726((byte) -128);
            } catch (IOException var6) {
            }
        }
        if (this.field775 != null) {
            for (int var3 = 0; var3 < this.field775.length; var3++) {
                if (this.field775[var3] != null) {
                    try {
                        this.field775[var3].method1726((byte) -128);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field777 != null) {
            try {
                this.field777.method1726((byte) -128);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)Lkp;")
    public final class456 method408(int arg0) {
        return arg0 == 65535 ? this.method401(0, 120, 0, null, 5) : null;
    }

    @OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class456 var2;
            synchronized (this) {
                while (true) {
                    if (this.field786) {
                        return;
                    }
                    if (this.field783 != null) {
                        var2 = this.field783;
                        this.field783 = this.field783.field6498;
                        if (this.field783 == null) {
                            this.field797 = null;
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
                int var3 = var2.field6497;
                if (var3 == 1) {
                    if (class525.method3074((byte) -101) < field794) {
                        throw new IOException();
                    }
                    var2.field6499 = new Socket(InetAddress.getByName((String) var2.field6501), var2.field6503);
                } else if (var3 == 22) {
                    if (class525.method3074((byte) -101) < field794) {
                        throw new IOException();
                    }
                    try {
                        var2.field6499 = class35.method527(var2.field6503, (String) var2.field6501, (byte) -107).method1857(-127);
                    } catch (class583 var29) {
                        var2.field6499 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var22 = new Thread((Runnable) var2.field6501);
                    var22.setDaemon(true);
                    var22.start();
                    var22.setPriority(var2.field6503);
                    var2.field6499 = var22;
                } else if (var3 == 4) {
                    if (class525.method3074((byte) -101) < field794) {
                        throw new IOException();
                    }
                    var2.field6499 = new DataInputStream(((URL) var2.field6501).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field6501;
                    if (this.field795 && ((Class) var4[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field6499 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field6501;
                    if (this.field795 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field6499 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6499 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field6501;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field795) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field794 > class525.method3074((byte) -101)) {
                        throw new IOException();
                    }
                    String var21 = (var2.field6503 >> 24 & 0xFF) + "." + ((var2.field6503 & 0xFF942D) >> 16) + "." + (var2.field6503 >> 8 & 0xFF) + "." + (var2.field6503 & 0xFF);
                    var2.field6499 = InetAddress.getByName(var21).getHostName();
                } else if (var3 == 21) {
                    if (field794 > class525.method3074((byte) -101)) {
                        throw new IOException();
                    }
                    var2.field6499 = InetAddress.getByName((String) var2.field6501).getAddress();
                } else if (var3 == 5) {
                    if (this.field771) {
                        var2.field6499 = this.field796.method630(-113);
                    } else {
                        var2.field6499 = Class.forName("uh").getMethod("listmodes").invoke(this.field791);
                    }
                } else if (var3 == 6) {
                    Frame var20 = new Frame("Jagex Full Screen");
                    var2.field6499 = var20;
                    var20.setResizable(false);
                    if (this.field771) {
                        this.field796.method631(var2.field6500 & 0xFFFF, var2.field6503 & 0xFFFF, var20, var2.field6503 >>> 16, -46, var2.field6500 >> 16);
                    } else {
                        Class.forName("uh").getMethod("enter", field802 == null ? (field802 = method411("java.awt.Frame")) : field802, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field791, var20, Integer.valueOf(var2.field6503 >>> 16), new Integer(var2.field6503 & 0xFFFF), Integer.valueOf(var2.field6500 >> 16), new Integer(var2.field6500 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field771) {
                        this.field796.method629((Frame) var2.field6501, (byte) 78);
                    } else {
                        Class.forName("uh").getMethod("exit").invoke(this.field791);
                    }
                } else if (var3 == 12) {
                    class263 var19 = method395(field798, (String) var2.field6501, field788, 98);
                    var2.field6499 = var19;
                } else if (var3 == 13) {
                    class263 var18 = method395("", (String) var2.field6501, field788, -92);
                    var2.field6499 = var18;
                } else if (this.field795 && var3 == 14) {
                    int var16 = var2.field6503;
                    int var17 = var2.field6500;
                    if (this.field771) {
                        this.field774.method493(var16, var17, 32512);
                    } else {
                        Class.forName("qga").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field773, Integer.valueOf(var16), new Integer(var17));
                    }
                } else if (this.field795 && var3 == 15) {
                    boolean var14 = var2.field6503 != 0;
                    Component var15 = (Component) var2.field6501;
                    if (this.field771) {
                        this.field774.method494(var14, var15, (byte) 17);
                    } else {
                        Class.forName("qga").getDeclaredMethod("showcursor", field799 == null ? (field799 = method411("java.awt.Component")) : field799, Boolean.TYPE).invoke(this.field773, var15, Boolean.valueOf(var14));
                    }
                } else if (!this.field771 && var3 == 17) {
                    Object[] var9 = (Object[]) var2.field6501;
                    Class.forName("qga").getDeclaredMethod("setcustomcursor", field799 == null ? (field799 = method411("java.awt.Component")) : field799, field800 == null ? (field800 = method411("[I")) : field800, Integer.TYPE, Integer.TYPE, field801 == null ? (field801 = method411("java.awt.Point")) : field801).invoke(this.field773, (Component) var9[0], (int[]) var9[1], Integer.valueOf(var2.field6503), new Integer(var2.field6500), (Point) var9[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field780.startsWith("win")) {
                            throw new Exception();
                        }
                        String var10 = (String) var2.field6501;
                        if (!var10.startsWith("http://") && !var10.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var12 = 0;
                        while (true) {
                            if (var12 >= var10.length()) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var10 + "\"");
                                var2.field6499 = null;
                                break;
                            }
                            if (var11.indexOf(var10.charAt(var12)) == -1) {
                                throw new Exception();
                            }
                            var12++;
                        }
                    } catch (Exception var31) {
                        var2.field6499 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field6502 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field6502 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;B)Lkp;")
    public final class456 method409(String arg0, byte arg1) {
        int var3 = -31 / ((arg1 + 18) / 36);
        return this.method401(0, 79, 0, arg0, 16);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lkp;")
    public final class456 method410(String arg0, Class arg1, int arg2) {
        if (arg2 <= 3) {
            this.method408(-81);
        }
        return this.method401(0, 28, 0, new Object[] { arg1, arg0 }, 9);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class17(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field793 = "1.1";
        field778 = "Unknown";
        this.field795 = arg3;
        field788 = arg0;
        field798 = arg1;
        try {
            field778 = System.getProperty("java.vendor");
            field793 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field778.toLowerCase().indexOf("microsoft") != -1) {
            this.field771 = true;
        }
        try {
            field785 = System.getProperty("os.name");
        } catch (Exception var19) {
            field785 = "Unknown";
        }
        field780 = field785.toLowerCase();
        try {
            field787 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field787 = "";
        }
        try {
            field781 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field781 = "";
        }
        try {
            field776 = System.getProperty("user.home");
            if (field776 != null) {
                field776 = field776 + "/";
            }
        } catch (Exception var16) {
        }
        if (field776 == null) {
            field776 = "~/";
        }
        try {
            this.field789 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field771) {
            try {
                field792 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field784 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class567.method3277(field798, field788, 1);
        if (this.field795) {
            this.field777 = new class263(class567.method3279("random.dat", null, field788, 2177), "rw", 25L);
            this.field790 = new class263(class567.method3278(false, "main_file_cache.dat2"), "rw", 209715200L);
            this.field772 = new class263(class567.method3278(false, "main_file_cache.idx255"), "rw", 1048576L);
            this.field775 = new class263[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field775[var5] = new class263(class567.method3278(false, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field771) {
                try {
                    this.field782 = Class.forName("fr").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field771) {
                    this.field796 = new class52();
                } else {
                    this.field791 = Class.forName("uh").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field771) {
                    this.field774 = new class28();
                } else {
                    this.field773 = Class.forName("qga").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field795 && !this.field771) {
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
        this.field786 = false;
        this.field779 = new Thread(this);
        this.field779.setPriority(10);
        this.field779.setDaemon(true);
        this.field779.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method411(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
