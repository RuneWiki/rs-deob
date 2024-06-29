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

@OriginalClass("client!td")
public class class477 implements Runnable {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
    public boolean field6674 = false;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Lhu;")
    private class141 field6688 = null;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lqia;")
    public class23 field6691 = null;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lhu;")
    private class141 field6687 = null;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Lqia;")
    public class23 field6695 = null;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Z")
    public boolean field6692 = false;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Z")
    private boolean field6697 = false;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "Lqia;")
    public class23 field6696 = null;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6684;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "[Lqia;")
    public class23[] field6698;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field6693;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Ljava/lang/Object;")
    private Object field6675;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lqn;")
    private class69 field6681;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field6685;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lfv;")
    private class131 field6673;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field6676;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "J")
    private static volatile long field6694 = 0L;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    private static int field6677;

    // $FF: synthetic field
    @OriginalMember(owner = "client!td", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field6701;

    // $FF: synthetic field
    @OriginalMember(owner = "client!td", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field6702;

    // $FF: synthetic field
    @OriginalMember(owner = "client!td", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field6703;

    // $FF: synthetic field
    @OriginalMember(owner = "client!td", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field6704;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Ljava/lang/String;")
    private static String field6678;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6679;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6682;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6683;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Ljava/lang/String;")
    private static String field6689;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Ljava/lang/String;")
    public static String field6690;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "Ljava/lang/String;")
    private static String field6699;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "Ljava/lang/String;")
    public static String field6700;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6680;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6686;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lhu;")
    public final class141 method2831(int arg0, int arg1) {
        int var3 = -3 / ((arg0 + 64) / 53);
        return this.method2838(null, 3, (byte) 122, arg1, 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/net/URL;)Lhu;")
    public final class141 method2832(byte arg0, URL arg1) {
        if (arg0 != -10) {
            field6678 = null;
        }
        return this.method2838(arg1, 4, (byte) 127, 0, 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/awt/Point;[IILjava/awt/Component;B)Lhu;")
    public final class141 method2833(int arg0, Point arg1, int[] arg2, int arg3, Component arg4, byte arg5) {
        if (arg5 < 51) {
            this.field6697 = false;
        }
        return this.method2838(new Object[] { arg4, arg2, arg1 }, 17, (byte) 123, arg0, arg3);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lqia;")
    private static final class23 method2834(String arg0, String arg1, int arg2, int arg3) {
        if (arg3 > -68) {
            method2847(-48, null);
        }
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field6678, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class23(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public final void method2835(byte arg0) {
        if (arg0 == 109) {
            field6694 = class459.method2731(96) + 5000L;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Lhu;")
    public final class141 method2836(byte arg0) {
        if (arg0 > -52) {
            field6682 = null;
        }
        return this.method2838(null, 5, (byte) 117, 0, 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)Lhu;")
    public final class141 method2837(String arg0, int arg1) {
        return arg1 == 65535 ? this.method2838(arg0, 16, (byte) 123, 0, 0) : null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lhu;")
    private final class141 method2838(Object arg0, int arg1, byte arg2, int arg3, int arg4) {
        class141 var6 = new class141();
        var6.field2086 = arg1;
        if (arg2 <= 116) {
            this.method2844(-39, false, -31, -107, 83);
        }
        var6.field2090 = arg4;
        var6.field2087 = arg3;
        var6.field2091 = arg0;
        synchronized (this) {
            if (this.field6688 == null) {
                this.field6688 = this.field6687 = var6;
            } else {
                this.field6688.field2088 = var6;
                this.field6688 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class141 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6697) {
                        return;
                    }
                    if (this.field6687 != null) {
                        var2 = this.field6687;
                        this.field6687 = this.field6687.field2088;
                        if (this.field6687 == null) {
                            this.field6688 = null;
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
                int var3 = var2.field2086;
                if (var3 == 1) {
                    if (field6694 > class459.method2731(107)) {
                        throw new IOException();
                    }
                    var2.field2092 = new Socket(InetAddress.getByName((String) var2.field2091), var2.field2087);
                } else if (var3 == 22) {
                    if (class459.method2731(119) < field6694) {
                        throw new IOException();
                    }
                    try {
                        var2.field2092 = class465.method2782((String) var2.field2091, -115, var2.field2087).method588(71);
                    } catch (class328 var29) {
                        var2.field2092 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field2091);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field2087);
                    var2.field2092 = var5;
                } else if (var3 == 4) {
                    if (field6694 > class459.method2731(124)) {
                        throw new IOException();
                    }
                    var2.field2092 = new DataInputStream(((URL) var2.field2091).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field2091;
                    if (this.field6674 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2092 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var23 = (Object[]) var2.field2091;
                    if (this.field6674 && ((Class) var23[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2092 = ((Class) var23[0]).getDeclaredField((String) var23[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2092 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var21 = (Transferable) var2.field2091;
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var22.setContents(var21, null);
                } else if (!this.field6674) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class459.method2731(122) < field6694) {
                        throw new IOException();
                    }
                    String var8 = (var2.field2087 >> 24 & 0xFF) + "." + ((var2.field2087 & 0xFF556A) >> 16) + "." + (var2.field2087 >> 8 & 0xFF) + "." + (var2.field2087 & 0xFF);
                    var2.field2092 = InetAddress.getByName(var8).getHostName();
                } else if (var3 == 21) {
                    if (class459.method2731(99) < field6694) {
                        throw new IOException();
                    }
                    var2.field2092 = InetAddress.getByName((String) var2.field2091).getAddress();
                } else if (var3 == 5) {
                    if (this.field6692) {
                        var2.field2092 = this.field6681.method578(53);
                    } else {
                        var2.field2092 = Class.forName("ab").getMethod("listmodes").invoke(this.field6675);
                    }
                } else if (var3 == 6) {
                    Frame var20 = new Frame("Jagex Full Screen");
                    var2.field2092 = var20;
                    var20.setResizable(false);
                    if (this.field6692) {
                        this.field6681.method579(var2.field2087 & 0xFFFF, var2.field2090 & 0xFFFF, 0, var2.field2087 >>> 16, var20, var2.field2090 >> 16);
                    } else {
                        Class.forName("ab").getMethod("enter", field6704 == null ? (field6704 = method2851("java.awt.Frame")) : field6704, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field6675, var20, Integer.valueOf(var2.field2087 >>> 16), new Integer(var2.field2087 & 0xFFFF), Integer.valueOf(var2.field2090 >> 16), new Integer(var2.field2090 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field6692) {
                        this.field6681.method577((byte) 20, (Frame) var2.field2091);
                    } else {
                        Class.forName("ab").getMethod("exit").invoke(this.field6675);
                    }
                } else if (var3 == 12) {
                    class23 var9 = method2834((String) var2.field2091, field6689, field6677, -122);
                    var2.field2092 = var9;
                } else if (var3 == 13) {
                    class23 var10 = method2834((String) var2.field2091, "", field6677, -78);
                    var2.field2092 = var10;
                } else if (this.field6674 && var3 == 14) {
                    int var18 = var2.field2087;
                    int var19 = var2.field2090;
                    if (this.field6692) {
                        this.field6673.method973(var18, var19, -2);
                    } else {
                        Class.forName("qs").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field6685, Integer.valueOf(var18), new Integer(var19));
                    }
                } else if (this.field6674 && var3 == 15) {
                    boolean var16 = var2.field2087 != 0;
                    Component var17 = (Component) var2.field2091;
                    if (this.field6692) {
                        this.field6673.method972(-4, var16, var17);
                    } else {
                        Class.forName("qs").getDeclaredMethod("showcursor", field6701 == null ? (field6701 = method2851("java.awt.Component")) : field6701, Boolean.TYPE).invoke(this.field6685, var17, Boolean.valueOf(var16));
                    }
                } else if (!this.field6692 && var3 == 17) {
                    Object[] var15 = (Object[]) var2.field2091;
                    Class.forName("qs").getDeclaredMethod("setcustomcursor", field6701 == null ? (field6701 = method2851("java.awt.Component")) : field6701, field6702 == null ? (field6702 = method2851("[I")) : field6702, Integer.TYPE, Integer.TYPE, field6703 == null ? (field6703 = method2851("java.awt.Point")) : field6703).invoke(this.field6685, (Component) var15[0], (int[]) var15[1], Integer.valueOf(var2.field2087), new Integer(var2.field2090), (Point) var15[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field6690.startsWith("win")) {
                            throw new Exception();
                        }
                        String var11 = (String) var2.field2091;
                        if (!var11.startsWith("http://") && !var11.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var13 = 0; var13 < var11.length(); var13++) {
                            if (var12.indexOf(var11.charAt(var13)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                        var2.field2092 = null;
                    } catch (Exception var31) {
                        var2.field2092 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field2089 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field2089 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLjava/lang/String;I)Lhu;")
    public final class141 method2839(boolean arg0, String arg1, int arg2) {
        if (arg2 != 0) {
            this.method2831(-120, -84);
        }
        return arg0 ? this.method2838(arg1, 12, (byte) 124, 0, 0) : this.method2838(arg1, 13, (byte) 125, 0, 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Frame;B)Lhu;")
    public final class141 method2840(Frame arg0, byte arg1) {
        if (arg1 != -70) {
            field6682 = null;
        }
        return this.method2838(arg0, 7, (byte) 121, 0, 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lhu;")
    public final class141 method2841(String arg0, Class arg1, byte arg2) {
        if (arg2 != -79) {
            this.field6685 = null;
        }
        return this.method2838(new Object[] { arg1, arg0 }, 9, (byte) 122, 0, 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILjava/lang/String;Z)Lhu;")
    public final class141 method2842(int arg0, int arg1, String arg2, boolean arg3) {
        if (arg0 <= 34) {
            field6686 = null;
        }
        return this.method2838(arg2, arg3 ? 22 : 1, (byte) 119, arg1, 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z")
    public final boolean method2843(int arg0) {
        if (!this.field6674) {
            return false;
        }
        if (arg0 != 1) {
            this.field6673 = null;
        }
        if (this.field6692) {
            return this.field6681 != null;
        } else {
            return this.field6675 != null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIII)Lhu;")
    public final class141 method2844(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            field6682 = null;
        }
        return this.method2838(null, 6, (byte) 117, (arg2 << 16) + arg4, (arg0 << 16) + arg3);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2845(int arg0) {
        if (arg0 != 0) {
            field6683 = null;
        }
        return this.field6693;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final void method2846(boolean arg0) {
        synchronized (this) {
            this.field6697 = arg0;
            this.notifyAll();
        }
        try {
            this.field6676.join();
        } catch (InterruptedException var8) {
        }
        if (this.field6695 != null) {
            try {
                this.field6695.method230((byte) 112);
            } catch (IOException var7) {
            }
        }
        if (this.field6696 != null) {
            try {
                this.field6696.method230((byte) -90);
            } catch (IOException var6) {
            }
        }
        if (this.field6698 != null) {
            for (int var3 = 0; var3 < this.field6698.length; var3++) {
                if (this.field6698[var3] != null) {
                    try {
                        this.field6698[var3].method230((byte) -39);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6691 != null) {
            try {
                this.field6691.method230((byte) 116);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;)Lqia;")
    public static final class23 method2847(int arg0, String arg1) {
        return arg0 == 9 ? method2834(arg1, field6689, field6677, -86) : null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lhu;")
    public final class141 method2848(Class[] arg0, int arg1, Class arg2, String arg3) {
        int var5 = 108 % ((-arg1 - 46) / 38);
        return this.method2838(new Object[] { arg2, arg3, arg0 }, 8, (byte) 120, 0, 0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLjava/io/File;[B)Z")
    public final boolean method2849(boolean arg0, File arg1, byte[] arg2) {
        if (arg0) {
            this.method2832((byte) -23, null);
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

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class477(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field6682 = "1.1";
        field6679 = "Unknown";
        field6677 = arg0;
        field6689 = arg1;
        this.field6674 = arg3;
        try {
            field6679 = System.getProperty("java.vendor");
            field6682 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field6679.toLowerCase().indexOf("microsoft") != -1) {
            this.field6692 = true;
        }
        try {
            field6699 = System.getProperty("os.name");
        } catch (Exception var19) {
            field6699 = "Unknown";
        }
        field6690 = field6699.toLowerCase();
        try {
            field6683 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field6683 = "";
        }
        try {
            field6700 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field6700 = "";
        }
        try {
            field6678 = System.getProperty("user.home");
            if (field6678 != null) {
                field6678 = field6678 + "/";
            }
        } catch (Exception var16) {
        }
        if (field6678 == null) {
            field6678 = "~/";
        }
        try {
            this.field6684 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field6692) {
            try {
                field6686 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field6680 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class655.method3748(field6689, 31795, field6677);
        if (this.field6674) {
            this.field6691 = new class23(class655.method3749(null, -79, "random.dat", field6677), "rw", 25L);
            this.field6695 = new class23(class655.method3747("main_file_cache.dat2", 0), "rw", 314572800L);
            this.field6696 = new class23(class655.method3747("main_file_cache.idx255", 0), "rw", 1048576L);
            this.field6698 = new class23[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field6698[var5] = new class23(class655.method3747("main_file_cache.idx" + var5, 0), "rw", 1048576L);
            }
            if (this.field6692) {
                try {
                    this.field6693 = Class.forName("uja").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field6692) {
                    this.field6681 = new class69();
                } else {
                    this.field6675 = Class.forName("ab").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field6692) {
                    this.field6673 = new class131();
                } else {
                    this.field6685 = Class.forName("qs").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field6674 && !this.field6692) {
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
        this.field6697 = false;
        this.field6676 = new Thread(this);
        this.field6676.setPriority(10);
        this.field6676.setDaemon(true);
        this.field6676.start();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lhu;")
    public final class141 method2850(int arg0, Runnable arg1, int arg2) {
        if (arg2 < 1) {
            field6686 = null;
        }
        return this.method2838(arg1, 2, (byte) 119, arg0, 0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2851(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
