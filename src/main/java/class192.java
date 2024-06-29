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

@OriginalClass("client!kk")
public class class192 implements Runnable {

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Lcr;")
    public class574 field2887 = null;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "Z")
    public boolean field2892 = false;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Z")
    private boolean field2888 = false;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Lcr;")
    public class574 field2889 = null;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Ltj;")
    private class198 field2874 = null;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Lcr;")
    public class574 field2895 = null;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "Z")
    public boolean field2900 = false;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Ltj;")
    private class198 field2883 = null;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2880;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[Lcr;")
    public class574[] field2886;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Ljava/lang/Object;")
    private Object field2877;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Ljava/lang/Object;")
    private Object field2885;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "Lfd;")
    private class529 field2894;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "Laq;")
    private class162 field2901;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Ljava/lang/Object;")
    private Object field2890;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2884;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "J")
    private static volatile long field2891 = 0L;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    private static int field2893;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kk", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field2902;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kk", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field2903;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kk", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field2904;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kk", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field2905;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Ljava/lang/String;")
    private static String field2875;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Ljava/lang/String;")
    private static String field2876;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Ljava/lang/String;")
    private static String field2878;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2879;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2881;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2897;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2898;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2899;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2882;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2896;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)Ltj;")
    public final class198 method1299(int arg0, byte arg1) {
        if (arg1 > 0) {
            field2898 = null;
        }
        return this.method1304(0, (byte) -124, arg0, 3, null);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Ltj;")
    public final class198 method1300(boolean arg0) {
        if (!arg0) {
            this.field2880 = null;
        }
        return this.method1304(0, (byte) -114, 0, 5, null);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZBLjava/lang/String;)Ltj;")
    public final class198 method1301(int arg0, boolean arg1, byte arg2, String arg3) {
        if (arg2 < 75) {
            this.method1318(null, true, -39, null, 113, null);
        }
        return this.method1304(0, (byte) -125, arg0, arg1 ? 22 : 1, arg3);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Z")
    public final boolean method1302(int arg0) {
        if (arg0 != 31625) {
            this.method1299(38, (byte) 75);
        }
        if (!this.field2892) {
            return false;
        } else if (this.field2900) {
            return this.field2894 != null;
        } else {
            return this.field2885 != null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public final void method1303(byte arg0) {
        synchronized (this) {
            this.field2888 = true;
            this.notifyAll();
        }
        try {
            int var3 = 114 / ((63 - arg0) / 60);
            this.field2884.join();
        } catch (InterruptedException var9) {
        }
        if (this.field2895 != null) {
            try {
                this.field2895.method3157(-113);
            } catch (IOException var8) {
            }
        }
        if (this.field2889 != null) {
            try {
                this.field2889.method3157(-93);
            } catch (IOException var7) {
            }
        }
        if (this.field2886 != null) {
            for (int var4 = 0; var4 < this.field2886.length; var4++) {
                if (this.field2886[var4] != null) {
                    try {
                        this.field2886[var4].method3157(33);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field2887 != null) {
            try {
                this.field2887.method3157(-62);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class198 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2888) {
                        return;
                    }
                    if (this.field2874 != null) {
                        var2 = this.field2874;
                        this.field2874 = this.field2874.field2982;
                        if (this.field2874 == null) {
                            this.field2883 = null;
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
                int var3 = var2.field2985;
                if (var3 == 1) {
                    if (class375.method2193(116) < field2891) {
                        throw new IOException();
                    }
                    var2.field2986 = new Socket(InetAddress.getByName((String) var2.field2981), var2.field2983);
                } else if (var3 == 22) {
                    if (field2891 > class375.method2193(116)) {
                        throw new IOException();
                    }
                    try {
                        var2.field2986 = class309.method1903(var2.field2983, 17509, (String) var2.field2981).method788(98);
                    } catch (class271 var29) {
                        var2.field2986 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field2981);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field2983);
                    var2.field2986 = var23;
                } else if (var3 == 4) {
                    if (class375.method2193(116) < field2891) {
                        throw new IOException();
                    }
                    var2.field2986 = new DataInputStream(((URL) var2.field2981).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2981;
                    if (this.field2892 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2986 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var22 = (Object[]) var2.field2981;
                    if (this.field2892 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2986 = ((Class) var22[0]).getDeclaredField((String) var22[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2986 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var20 = (Transferable) var2.field2981;
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var21.setContents(var20, null);
                } else if (!this.field2892) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field2891 > class375.method2193(116)) {
                        throw new IOException();
                    }
                    String var7 = (var2.field2983 >> 24 & 0xFF) + "." + (var2.field2983 >> 16 & 0xFF) + "." + (var2.field2983 >> 8 & 0xFF) + "." + (var2.field2983 & 0xFF);
                    var2.field2986 = InetAddress.getByName(var7).getHostName();
                } else if (var3 == 21) {
                    if (field2891 > class375.method2193(116)) {
                        throw new IOException();
                    }
                    var2.field2986 = InetAddress.getByName((String) var2.field2981).getAddress();
                } else if (var3 == 5) {
                    if (this.field2900) {
                        var2.field2986 = this.field2894.method2955((byte) -120);
                    } else {
                        var2.field2986 = Class.forName("fja").getMethod("listmodes").invoke(this.field2885);
                    }
                } else if (var3 == 6) {
                    Frame var8 = new Frame("Jagex Full Screen");
                    var2.field2986 = var8;
                    var8.setResizable(false);
                    if (this.field2900) {
                        this.field2894.method2957(var8, var2.field2984 >> 16, var2.field2984 & 0xFFFF, var2.field2983 & 0xFFFF, var2.field2983 >>> 16, 0);
                    } else {
                        Class.forName("fja").getMethod("enter", field2902 == null ? (field2902 = method1319("java.awt.Frame")) : field2902, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field2885, var8, Integer.valueOf(var2.field2983 >>> 16), new Integer(var2.field2983 & 0xFFFF), Integer.valueOf(var2.field2984 >> 16), new Integer(var2.field2984 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field2900) {
                        this.field2894.method2956((Frame) var2.field2981, (byte) 85);
                    } else {
                        Class.forName("fja").getMethod("exit").invoke(this.field2885);
                    }
                } else if (var3 == 12) {
                    class574 var9 = method1310(field2875, field2893, -1, (String) var2.field2981);
                    var2.field2986 = var9;
                } else if (var3 == 13) {
                    class574 var19 = method1310("", field2893, -1, (String) var2.field2981);
                    var2.field2986 = var19;
                } else if (this.field2892 && var3 == 14) {
                    int var10 = var2.field2983;
                    int var11 = var2.field2984;
                    if (this.field2900) {
                        this.field2901.method1163(var10, 67, var11);
                    } else {
                        Class.forName("lr").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field2890, Integer.valueOf(var10), new Integer(var11));
                    }
                } else if (this.field2892 && var3 == 15) {
                    boolean var12 = var2.field2983 != 0;
                    Component var13 = (Component) var2.field2981;
                    if (this.field2900) {
                        this.field2901.method1162(117, var13, var12);
                    } else {
                        Class.forName("lr").getDeclaredMethod("showcursor", field2903 == null ? (field2903 = method1319("java.awt.Component")) : field2903, Boolean.TYPE).invoke(this.field2890, var13, Boolean.valueOf(var12));
                    }
                } else if (!this.field2900 && var3 == 17) {
                    Object[] var14 = (Object[]) var2.field2981;
                    Class.forName("lr").getDeclaredMethod("setcustomcursor", field2903 == null ? (field2903 = method1319("java.awt.Component")) : field2903, field2904 == null ? (field2904 = method1319("[I")) : field2904, Integer.TYPE, Integer.TYPE, field2905 == null ? (field2905 = method1319("java.awt.Point")) : field2905).invoke(this.field2890, (Component) var14[0], (int[]) var14[1], Integer.valueOf(var2.field2983), new Integer(var2.field2984), (Point) var14[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field2897.startsWith("win")) {
                            throw new Exception();
                        }
                        String var15 = (String) var2.field2981;
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
                        var2.field2986 = null;
                    } catch (Exception var31) {
                        var2.field2986 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field2987 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field2987 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBIILjava/lang/Object;)Ltj;")
    private final class198 method1304(int arg0, byte arg1, int arg2, int arg3, Object arg4) {
        int var6 = 10 / ((-arg1 - 76) / 38);
        class198 var7 = new class198();
        var7.field2984 = arg0;
        var7.field2981 = arg4;
        var7.field2983 = arg2;
        var7.field2985 = arg3;
        synchronized (this) {
            if (this.field2883 == null) {
                this.field2883 = this.field2874 = var7;
            } else {
                this.field2883.field2982 = var7;
                this.field2883 = var7;
            }
            this.notify();
            return var7;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([BLjava/io/File;I)Z")
    public final boolean method1305(byte[] arg0, File arg1, int arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            if (arg2 != 29478) {
                field2878 = null;
            }
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Ltj;")
    public final class198 method1306(boolean arg0, Class arg1, String arg2) {
        if (!arg0) {
            this.method1309(true, 63, null);
        }
        return this.method1304(0, (byte) 107, 0, 9, new Object[] { arg1, arg2 });
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLjava/lang/String;)Lcr;")
    public static final class574 method1307(byte arg0, String arg1) {
        if (arg0 != -91) {
            method1310(null, -72, -82, null);
        }
        return method1310(field2875, field2893, -1, arg1);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;I)Ltj;")
    public final class198 method1308(String arg0, int arg1) {
        if (arg1 != -12903) {
            this.field2877 = null;
        }
        return this.method1304(0, (byte) -116, 0, 16, arg0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZILjava/lang/String;)Ltj;")
    public final class198 method1309(boolean arg0, int arg1, String arg2) {
        if (arg1 != 0) {
            this.method1311(null, -93, 69);
        }
        return arg0 ? this.method1304(0, (byte) -117, 0, 12, arg2) : this.method1304(0, (byte) 125, 0, 13, arg2);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lcr;")
    private static final class574 method1310(String arg0, int arg1, int arg2, String arg3) {
        String var4;
        if (arg1 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg3 + "_rc.dat";
        } else if (arg1 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg3 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg3 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field2878, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        if (arg2 != -1) {
            return null;
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class574(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ltj;")
    public final class198 method1311(Runnable arg0, int arg1, int arg2) {
        return arg2 == 0 ? this.method1304(0, (byte) -120, arg1, 2, arg0) : null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public final void method1312(int arg0) {
        field2891 = class375.method2193(116) + 5000L;
        int var2 = -30 / ((arg0 + 66) / 48);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)Ltj;")
    public final class198 method1313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 209715200) {
            this.field2887 = null;
        }
        return this.method1304((arg2 << 16) + arg3, (byte) -125, (arg0 << 16) + arg1, 6, null);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/net/URL;B)Ltj;")
    public final class198 method1314(URL arg0, byte arg1) {
        if (arg1 != 67) {
            this.method1301(28, false, (byte) -36, null);
        }
        return this.method1304(0, (byte) -114, 0, 4, arg0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ltj;")
    public final class198 method1315(int arg0, Class arg1, String arg2, Class[] arg3) {
        return arg0 == -17 ? this.method1304(0, (byte) -114, 0, 8, new Object[] { arg1, arg2, arg3 }) : null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILjava/awt/Frame;)Ltj;")
    public final class198 method1316(int arg0, Frame arg1) {
        if (arg0 != 1404065264) {
            this.method1318(null, false, -113, null, -116, null);
        }
        return this.method1304(0, (byte) -125, 0, 7, arg1);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1317(byte arg0) {
        int var2 = 64 / ((arg0 - 2) / 36);
        return this.field2877;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/awt/Component;ZILjava/awt/Point;I[I)Ltj;")
    public final class198 method1318(Component arg0, boolean arg1, int arg2, Point arg3, int arg4, int[] arg5) {
        return arg1 ? null : this.method1304(arg2, (byte) -121, arg4, 17, new Object[] { arg0, arg5, arg3 });
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class192(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field2879 = "1.1";
        field2893 = arg0;
        field2875 = arg1;
        field2899 = "Unknown";
        this.field2892 = arg3;
        try {
            field2899 = System.getProperty("java.vendor");
            field2879 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field2899.toLowerCase().indexOf("microsoft") != -1) {
            this.field2900 = true;
        }
        try {
            field2876 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2876 = "Unknown";
        }
        field2897 = field2876.toLowerCase();
        try {
            field2881 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2881 = "";
        }
        try {
            field2898 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2898 = "";
        }
        try {
            field2878 = System.getProperty("user.home");
            if (field2878 != null) {
                field2878 = field2878 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2878 == null) {
            field2878 = "~/";
        }
        try {
            this.field2880 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field2900) {
            try {
                field2882 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field2896 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class429.method2474(field2893, field2875, 16);
        if (this.field2892) {
            this.field2887 = new class574(class429.method2475(field2893, (byte) 43, null, "random.dat"), "rw", 25L);
            this.field2895 = new class574(class429.method2476(-3251, "main_file_cache.dat2"), "rw", 209715200L);
            this.field2889 = new class574(class429.method2476(-3251, "main_file_cache.idx255"), "rw", 1048576L);
            this.field2886 = new class574[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2886[var5] = new class574(class429.method2476(-3251, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field2900) {
                try {
                    this.field2877 = Class.forName("fq").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field2900) {
                    this.field2894 = new class529();
                } else {
                    this.field2885 = Class.forName("fja").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field2900) {
                    this.field2901 = new class162();
                } else {
                    this.field2890 = Class.forName("lr").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field2892 && !this.field2900) {
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
        this.field2888 = false;
        this.field2884 = new Thread(this);
        this.field2884.setPriority(10);
        this.field2884.setDaemon(true);
        this.field2884.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1319(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
