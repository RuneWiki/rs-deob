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

@OriginalClass("client!ew")
public class class226 implements Runnable {

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "Z")
    private boolean field2988 = false;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "Lsr;")
    public class568 field3000 = null;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "Lae;")
    private class254 field2991 = null;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "Z")
    public boolean field2983 = false;

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "Lsr;")
    public class568 field3001 = null;

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "Z")
    public boolean field3004 = false;

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "Lae;")
    private class254 field3007 = null;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "Lsr;")
    public class568 field3010 = null;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2990;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "[Lsr;")
    public class568[] field2987;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "Ljava/lang/Object;")
    private Object field2997;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "Ljava/lang/Object;")
    private Object field2992;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "Lbe;")
    private class182 field3008;

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field3003;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "Loca;")
    private class570 field2994;

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "Ljava/lang/Thread;")
    private Thread field3009;

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "J")
    private static volatile long field3002 = 0L;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    private static int field2995;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ew", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field3011;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ew", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field3012;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ew", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field3013;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ew", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field3014;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2984;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2986;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "Ljava/lang/String;")
    private static String field2989;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "Ljava/lang/String;")
    private static String field2993;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2996;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2998;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "Ljava/lang/String;")
    private static String field2999;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3006;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2985;

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3005;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Lae;")
    public final class254 method1399(Class arg0, byte arg1, Class[] arg2, String arg3) {
        int var5 = -20 / ((arg1 - 25) / 59);
        return this.method1400(8, 0, new Object[] { arg0, arg3, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILjava/lang/Object;II)Lae;")
    private final class254 method1400(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class254 var6 = new class254();
        var6.field3308 = arg4;
        if (arg3 != 0) {
            this.field2983 = false;
        }
        var6.field3309 = arg2;
        var6.field3312 = arg1;
        var6.field3313 = arg0;
        synchronized (this) {
            if (this.field2991 == null) {
                this.field2991 = this.field3007 = var6;
            } else {
                this.field2991.field3310 = var6;
                this.field2991 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIII)Lae;")
    public final class254 method1401(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 10762) {
            field3006 = null;
        }
        return this.method1400(6, (arg1 << 16) + arg2, null, 0, (arg0 << 16) + arg3);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lae;")
    public final class254 method1402(String arg0, Class arg1, byte arg2) {
        return arg2 > -59 ? null : this.method1400(9, 0, new Object[] { arg1, arg0 }, 0, 0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)Z")
    public final boolean method1403(byte arg0) {
        if (!this.field3004) {
            return false;
        }
        if (arg0 != 113) {
            this.method1408((byte) 90);
        }
        if (this.field2983) {
            return this.field3008 != null;
        } else {
            return this.field2992 != null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLjava/awt/Frame;)Lae;")
    public final class254 method1404(byte arg0, Frame arg1) {
        return arg0 == -24 ? this.method1400(7, 0, arg1, arg0 + 24, 0) : null;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V")
    public final void method1405(byte arg0) {
        synchronized (this) {
            this.field2988 = true;
            if (arg0 >= -21) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field3009.join();
        } catch (InterruptedException var10) {
        }
        if (this.field3000 != null) {
            try {
                this.field3000.method3271((byte) -111);
            } catch (IOException var9) {
            }
        }
        if (this.field3010 != null) {
            try {
                this.field3010.method3271((byte) -87);
            } catch (IOException var8) {
            }
        }
        if (this.field2987 != null) {
            for (int var3 = 0; var3 < this.field2987.length; var3++) {
                if (this.field2987[var3] != null) {
                    try {
                        this.field2987[var3].method3271((byte) -121);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field3001 != null) {
            try {
                this.field3001.method3271((byte) -85);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILjava/awt/Point;I[ILjava/awt/Component;)Lae;")
    public final class254 method1406(int arg0, int arg1, Point arg2, int arg3, int[] arg4, Component arg5) {
        if (arg0 != -30547) {
            field2993 = null;
        }
        return this.method1400(17, arg3, new Object[] { arg5, arg4, arg2 }, 0, arg1);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
    public final boolean method1407(File arg0, int arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg0);
            var4.write(arg2, arg1, arg2.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1408(byte arg0) {
        if (arg0 != 3) {
            this.method1408((byte) -98);
        }
        return this.field2997;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/String;I)Lsr;")
    public static final class568 method1409(String arg0, int arg1) {
        if (arg1 != 1) {
            method1409(null, 110);
        }
        return method1415(109, field2999, field2995, arg0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)Lae;")
    public final class254 method1410(int arg0, byte arg1) {
        return arg1 == -103 ? this.method1400(3, 0, null, arg1 + 103, arg0) : null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/net/URL;)Lae;")
    public final class254 method1411(int arg0, URL arg1) {
        int var3 = 59 / ((arg0 - 60) / 36);
        return this.method1400(4, 0, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Lae;")
    public final class254 method1412(int arg0) {
        if (arg0 != 1152) {
            field2985 = null;
        }
        return this.method1400(5, 0, null, 0, 0);
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(Ljava/lang/String;I)Lae;")
    public final class254 method1413(String arg0, int arg1) {
        if (arg1 > -24) {
            this.field3001 = null;
        }
        return this.method1400(16, 0, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lae;")
    public final class254 method1414(int arg0, Runnable arg1, int arg2) {
        return arg0 == 16 ? this.method1400(2, 0, arg1, arg0 ^ 0x10, arg2) : null;
    }

    @OriginalMember(owner = "client!ew", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class254 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2988) {
                        return;
                    }
                    if (this.field3007 != null) {
                        var2 = this.field3007;
                        this.field3007 = this.field3007.field3310;
                        if (this.field3007 == null) {
                            this.field2991 = null;
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
                int var3 = var2.field3313;
                if (var3 == 1) {
                    if (class60.method371(false) < field3002) {
                        throw new IOException();
                    }
                    var2.field3307 = new Socket(InetAddress.getByName((String) var2.field3309), var2.field3308);
                } else if (var3 == 22) {
                    if (class60.method371(false) < field3002) {
                        throw new IOException();
                    }
                    try {
                        var2.field3307 = class380.method2355(var2.field3308, -1, (String) var2.field3309).method1136(83);
                    } catch (class54 var29) {
                        var2.field3307 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field3309);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field3308);
                    var2.field3307 = var23;
                } else if (var3 == 4) {
                    if (field3002 > class60.method371(false)) {
                        throw new IOException();
                    }
                    var2.field3307 = new DataInputStream(((URL) var2.field3309).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3309;
                    if (this.field3004 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3307 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field3309;
                    if (this.field3004 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3307 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3307 = var22.getContents(null);
                } else if (var3 == 19) {
                    Transferable var20 = (Transferable) var2.field3309;
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var21.setContents(var20, null);
                } else if (!this.field3004) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class60.method371(false) < field3002) {
                        throw new IOException();
                    }
                    String var7 = (var2.field3308 >> 24 & 0xFF) + "." + ((var2.field3308 & 0xFF82D1) >> 16) + "." + ((var2.field3308 & 0xFFCE) >> 8) + "." + (var2.field3308 & 0xFF);
                    var2.field3307 = InetAddress.getByName(var7).getHostName();
                } else if (var3 == 21) {
                    if (field3002 > class60.method371(false)) {
                        throw new IOException();
                    }
                    var2.field3307 = InetAddress.getByName((String) var2.field3309).getAddress();
                } else if (var3 == 5) {
                    if (this.field2983) {
                        var2.field3307 = this.field3008.method1222(0);
                    } else {
                        var2.field3307 = Class.forName("cga").getMethod("listmodes").invoke(this.field2992);
                    }
                } else if (var3 == 6) {
                    Frame var8 = new Frame("Jagex Full Screen");
                    var2.field3307 = var8;
                    var8.setResizable(false);
                    if (this.field2983) {
                        this.field3008.method1220(var2.field3312 >> 16, var2.field3308 & 0xFFFF, var2.field3312 & 0xFFFF, var2.field3308 >>> 16, var8, false);
                    } else {
                        Class.forName("cga").getMethod("enter", field3011 == null ? (field3011 = method1419("java.awt.Frame")) : field3011, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field2992, var8, Integer.valueOf(var2.field3308 >>> 16), new Integer(var2.field3308 & 0xFFFF), Integer.valueOf(var2.field3312 >> 16), new Integer(var2.field3312 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field2983) {
                        this.field3008.method1221((Frame) var2.field3309, false);
                    } else {
                        Class.forName("cga").getMethod("exit").invoke(this.field2992);
                    }
                } else if (var3 == 12) {
                    class568 var9 = method1415(124, field2999, field2995, (String) var2.field3309);
                    var2.field3307 = var9;
                } else if (var3 == 13) {
                    class568 var19 = method1415(124, "", field2995, (String) var2.field3309);
                    var2.field3307 = var19;
                } else if (this.field3004 && var3 == 14) {
                    int var10 = var2.field3308;
                    int var11 = var2.field3312;
                    if (this.field2983) {
                        this.field2994.method3277(var10, var11, 0);
                    } else {
                        Class.forName("ng").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field3003, Integer.valueOf(var10), new Integer(var11));
                    }
                } else if (this.field3004 && var3 == 15) {
                    boolean var12 = var2.field3308 != 0;
                    Component var13 = (Component) var2.field3309;
                    if (this.field2983) {
                        this.field2994.method3278(var12, 125, var13);
                    } else {
                        Class.forName("ng").getDeclaredMethod("showcursor", field3012 == null ? (field3012 = method1419("java.awt.Component")) : field3012, Boolean.TYPE).invoke(this.field3003, var13, Boolean.valueOf(var12));
                    }
                } else if (!this.field2983 && var3 == 17) {
                    Object[] var18 = (Object[]) var2.field3309;
                    Class.forName("ng").getDeclaredMethod("setcustomcursor", field3012 == null ? (field3012 = method1419("java.awt.Component")) : field3012, field3013 == null ? (field3013 = method1419("[I")) : field3013, Integer.TYPE, Integer.TYPE, field3014 == null ? (field3014 = method1419("java.awt.Point")) : field3014).invoke(this.field3003, (Component) var18[0], (int[]) var18[1], Integer.valueOf(var2.field3308), new Integer(var2.field3312), (Point) var18[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field2996.startsWith("win")) {
                            throw new Exception();
                        }
                        String var14 = (String) var2.field3309;
                        if (!var14.startsWith("http://") && !var14.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var15 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var16 = 0;
                        while (true) {
                            if (var14.length() <= var16) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                                var2.field3307 = null;
                                break;
                            }
                            if (var15.indexOf(var14.charAt(var16)) == -1) {
                                throw new Exception();
                            }
                            var16++;
                        }
                    } catch (Exception var31) {
                        var2.field3307 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field3311 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field3311 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lsr;")
    private static final class568 method1415(int arg0, String arg1, int arg2, String arg3) {
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg1 + "_preferences" + arg3 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg1 + "_preferences" + arg3 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg1 + "_preferences" + arg3 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field2989, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        if (arg0 < 102) {
            return null;
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class568(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZILjava/lang/String;)Lae;")
    public final class254 method1416(boolean arg0, int arg1, String arg2) {
        if (arg1 <= 78) {
            field2984 = null;
        }
        return arg0 ? this.method1400(12, 0, arg2, 0, 0) : this.method1400(13, 0, arg2, 0, 0);
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
    public final void method1417(int arg0) {
        if (arg0 != -7) {
            this.method1410(80, (byte) 24);
        }
        field3002 = class60.method371(false) + 5000L;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZLjava/lang/String;)Lae;")
    public final class254 method1418(int arg0, int arg1, boolean arg2, String arg3) {
        return arg1 == 1 ? this.method1400(arg2 ? 22 : 1, 0, arg3, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class226(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field2999 = arg1;
        this.field3004 = arg3;
        field2986 = "1.1";
        field3006 = "Unknown";
        field2995 = arg0;
        try {
            field3006 = System.getProperty("java.vendor");
            field2986 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field3006.toLowerCase().indexOf("microsoft") != -1) {
            this.field2983 = true;
        }
        try {
            field2993 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2993 = "Unknown";
        }
        field2996 = field2993.toLowerCase();
        try {
            field2984 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2984 = "";
        }
        try {
            field2998 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2998 = "";
        }
        try {
            field2989 = System.getProperty("user.home");
            if (field2989 != null) {
                field2989 = field2989 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2989 == null) {
            field2989 = "~/";
        }
        try {
            this.field2990 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field2983) {
            try {
                field2985 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field3005 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class536.method3094(-203, field2999, field2995);
        if (this.field3004) {
            this.field3001 = new class568(class536.method3092(field2995, 0, null, "random.dat"), "rw", 25L);
            this.field3000 = new class568(class536.method3093((byte) 79, "main_file_cache.dat2"), "rw", 209715200L);
            this.field3010 = new class568(class536.method3093((byte) 79, "main_file_cache.idx255"), "rw", 1048576L);
            this.field2987 = new class568[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2987[var5] = new class568(class536.method3093((byte) 79, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field2983) {
                try {
                    this.field2997 = Class.forName("so").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field2983) {
                    this.field3008 = new class182();
                } else {
                    this.field2992 = Class.forName("cga").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field2983) {
                    this.field2994 = new class570();
                } else {
                    this.field3003 = Class.forName("ng").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field3004 && !this.field2983) {
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
        this.field2988 = false;
        this.field3009 = new Thread(this);
        this.field3009.setPriority(10);
        this.field3009.setDaemon(true);
        this.field3009.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1419(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
