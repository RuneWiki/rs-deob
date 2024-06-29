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

@OriginalClass("client!wea")
public class class158 implements Runnable {

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "Lso;")
    public class470 field2527 = null;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "Lso;")
    public class470 field2533 = null;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "Z")
    public boolean field2525 = false;

    @OriginalMember(owner = "client!wea", name = "w", descriptor = "Lof;")
    private class622 field2546 = null;

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "Z")
    private boolean field2549 = false;

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "Lso;")
    public class470 field2536 = null;

    @OriginalMember(owner = "client!wea", name = "s", descriptor = "Z")
    public boolean field2542 = false;

    @OriginalMember(owner = "client!wea", name = "v", descriptor = "Lof;")
    private class622 field2545 = null;

    @OriginalMember(owner = "client!wea", name = "x", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2547;

    @OriginalMember(owner = "client!wea", name = "t", descriptor = "[Lso;")
    public class470[] field2543;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "Ljava/lang/Object;")
    private Object field2535;

    @OriginalMember(owner = "client!wea", name = "r", descriptor = "Ljava/lang/Object;")
    private Object field2541;

    @OriginalMember(owner = "client!wea", name = "A", descriptor = "Lnt;")
    private class224 field2550;

    @OriginalMember(owner = "client!wea", name = "p", descriptor = "Ljava/lang/Object;")
    private Object field2539;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "Llq;")
    private class552 field2524;

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field2538;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "J")
    private static volatile long field2529 = 0L;

    @OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
    private static int field2540;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wea", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field2552;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wea", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field2553;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wea", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field2554;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wea", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field2555;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2526;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2528;

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2530;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "Ljava/lang/String;")
    private static String field2532;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "Ljava/lang/String;")
    private static String field2537;

    @OriginalMember(owner = "client!wea", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2544;

    @OriginalMember(owner = "client!wea", name = "y", descriptor = "Ljava/lang/String;")
    private static String field2548;

    @OriginalMember(owner = "client!wea", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2551;

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2531;

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2534;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIIB)Lof;")
    public final class622 method1203(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -11) {
            field2529 = 34L;
        }
        return this.method1220(8, (arg2 << 16) + arg0, 6, (arg3 << 16) + arg1, null);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lof;")
    public final class622 method1204(Class[] arg0, int arg1, Class arg2, String arg3) {
        return arg1 < 49 ? null : this.method1220(8, 0, 8, 0, new Object[] { arg2, arg3, arg0 });
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;I)Lso;")
    public static final class470 method1205(String arg0, int arg1) {
        return arg1 == -1141472112 ? method1215(arg0, 12606, field2537, field2540) : null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)Lof;")
    public final class622 method1206(int arg0, int arg1) {
        if (arg0 <= 20) {
            this.method1210(null, -123, -128);
        }
        return this.method1220(8, 0, 3, arg1, null);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(BLjava/lang/String;Z)Lof;")
    public final class622 method1207(byte arg0, String arg1, boolean arg2) {
        if (arg0 == -46) {
            return arg2 ? this.method1220(8, 0, 12, 0, arg1) : this.method1220(8, 0, 13, 0, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class622 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2549) {
                        return;
                    }
                    if (this.field2545 != null) {
                        var2 = this.field2545;
                        this.field2545 = this.field2545.field8460;
                        if (this.field2545 == null) {
                            this.field2546 = null;
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
                int var3 = var2.field8459;
                if (var3 == 1) {
                    if (class554.method3190(-53) < field2529) {
                        throw new IOException();
                    }
                    var2.field8463 = new Socket(InetAddress.getByName((String) var2.field8461), var2.field8465);
                } else if (var3 == 22) {
                    if (class554.method3190(-92) < field2529) {
                        throw new IOException();
                    }
                    try {
                        var2.field8463 = class80.method739(var2.field8465, (byte) -90, (String) var2.field8461).method1879(-112);
                    } catch (class82 var29) {
                        var2.field8463 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field8461);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field8465);
                    var2.field8463 = var4;
                } else if (var3 == 4) {
                    if (field2529 > class554.method3190(-73)) {
                        throw new IOException();
                    }
                    var2.field8463 = new DataInputStream(((URL) var2.field8461).openStream());
                } else if (var3 == 8) {
                    Object[] var22 = (Object[]) var2.field8461;
                    if (this.field2525 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field8463 = ((Class) var22[0]).getDeclaredMethod((String) var22[1], (Class[]) var22[2]);
                } else if (var3 == 9) {
                    Object[] var21 = (Object[]) var2.field8461;
                    if (this.field2525 && ((Class) var21[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field8463 = ((Class) var21[0]).getDeclaredField((String) var21[1]);
                } else if (var3 == 18) {
                    Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field8463 = var20.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field8461;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else if (!this.field2525) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field2529 > class554.method3190(-123)) {
                        throw new IOException();
                    }
                    String var7 = (var2.field8465 >> 24 & 0xFF) + "." + (var2.field8465 >> 16 & 0xFF) + "." + (var2.field8465 >> 8 & 0xFF) + "." + (var2.field8465 & 0xFF);
                    var2.field8463 = InetAddress.getByName(var7).getHostName();
                } else if (var3 == 21) {
                    if (class554.method3190(-82) < field2529) {
                        throw new IOException();
                    }
                    var2.field8463 = InetAddress.getByName((String) var2.field8461).getAddress();
                } else if (var3 == 5) {
                    if (this.field2542) {
                        var2.field8463 = this.field2550.method1581(true);
                    } else {
                        var2.field8463 = Class.forName("gp").getMethod("listmodes").invoke(this.field2541);
                    }
                } else if (var3 == 6) {
                    Frame var19 = new Frame("Jagex Full Screen");
                    var2.field8463 = var19;
                    var19.setResizable(false);
                    if (this.field2542) {
                        this.field2550.method1582(var2.field8465 & 0xFFFF, var2.field8464 >> 16, var2.field8465 >>> 16, -43, var2.field8464 & 0xFFFF, var19);
                    } else {
                        Class.forName("gp").getMethod("enter", field2555 == null ? (field2555 = method1223("java.awt.Frame")) : field2555, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field2541, var19, Integer.valueOf(var2.field8465 >>> 16), new Integer(var2.field8465 & 0xFFFF), Integer.valueOf(var2.field8464 >> 16), new Integer(var2.field8464 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field2542) {
                        this.field2550.method1583((Frame) var2.field8461, 8);
                    } else {
                        Class.forName("gp").getMethod("exit").invoke(this.field2541);
                    }
                } else if (var3 == 12) {
                    class470 var8 = method1215((String) var2.field8461, 12606, field2537, field2540);
                    var2.field8463 = var8;
                } else if (var3 == 13) {
                    class470 var18 = method1215((String) var2.field8461, 12606, "", field2540);
                    var2.field8463 = var18;
                } else if (this.field2525 && var3 == 14) {
                    int var9 = var2.field8465;
                    int var10 = var2.field8464;
                    if (this.field2542) {
                        this.field2524.method3177(var9, (byte) 115, var10);
                    } else {
                        Class.forName("pfa").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field2539, Integer.valueOf(var9), new Integer(var10));
                    }
                } else if (this.field2525 && var3 == 15) {
                    boolean var11 = var2.field8465 != 0;
                    Component var12 = (Component) var2.field8461;
                    if (this.field2542) {
                        this.field2524.method3178(var11, 13259, var12);
                    } else {
                        Class.forName("pfa").getDeclaredMethod("showcursor", field2552 == null ? (field2552 = method1223("java.awt.Component")) : field2552, Boolean.TYPE).invoke(this.field2539, var12, Boolean.valueOf(var11));
                    }
                } else if (!this.field2542 && var3 == 17) {
                    Object[] var13 = (Object[]) var2.field8461;
                    Class.forName("pfa").getDeclaredMethod("setcustomcursor", field2552 == null ? (field2552 = method1223("java.awt.Component")) : field2552, field2553 == null ? (field2553 = method1223("[I")) : field2553, Integer.TYPE, Integer.TYPE, field2554 == null ? (field2554 = method1223("java.awt.Point")) : field2554).invoke(this.field2539, (Component) var13[0], (int[]) var13[1], Integer.valueOf(var2.field8465), new Integer(var2.field8464), (Point) var13[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field2551.startsWith("win")) {
                            throw new Exception();
                        }
                        String var14 = (String) var2.field8461;
                        if (!var14.startsWith("http://") && !var14.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var15 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var16 = 0; var14.length() > var16; var16++) {
                            if (var15.indexOf(var14.charAt(var16)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                        var2.field8463 = null;
                    } catch (Exception var31) {
                        var2.field8463 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field8462 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field8462 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
    public final void method1208(byte arg0) {
        synchronized (this) {
            this.field2549 = true;
            this.notifyAll();
        }
        try {
            this.field2538.join();
            if (arg0 != 103) {
                this.field2536 = null;
            }
        } catch (InterruptedException var8) {
        }
        if (this.field2533 != null) {
            try {
                this.field2533.method2769(false);
            } catch (IOException var7) {
            }
        }
        if (this.field2527 != null) {
            try {
                this.field2527.method2769(false);
            } catch (IOException var6) {
            }
        }
        if (this.field2543 != null) {
            for (int var3 = 0; var3 < this.field2543.length; var3++) {
                if (this.field2543[var3] != null) {
                    try {
                        this.field2543[var3].method2769(false);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2536 != null) {
            try {
                this.field2536.method2769(false);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZILjava/lang/String;I)Lof;")
    public final class622 method1209(boolean arg0, int arg1, String arg2, int arg3) {
        return arg3 == 28225 ? this.method1220(arg3 ^ 0x6E49, 0, arg0 ? 22 : 1, arg1, arg2) : null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lof;")
    public final class622 method1210(Runnable arg0, int arg1, int arg2) {
        if (arg1 != -10240) {
            this.method1216(null, (byte) 57, null);
        }
        return this.method1220(8, 0, 2, arg2, arg0);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/net/URL;I)Lof;")
    public final class622 method1211(URL arg0, int arg1) {
        return arg1 == 8362 ? this.method1220(8, 0, 4, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[IILjava/awt/Point;Ljava/awt/Component;I)Lof;")
    public final class622 method1212(int arg0, int[] arg1, int arg2, Point arg3, Component arg4, int arg5) {
        if (arg2 != 17) {
            this.method1214(-75);
        }
        return this.method1220(arg2 - 9, arg0, 17, arg5, new Object[] { arg4, arg1, arg3 });
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
    public final void method1213(int arg0) {
        if (arg0 > -90) {
            this.field2527 = null;
        }
        field2529 = class554.method3190(-107) + 5000L;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)Lof;")
    public final class622 method1214(int arg0) {
        return arg0 == 972476528 ? this.method1220(8, 0, 5, 0, null) : null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lso;")
    private static final class470 method1215(String arg0, int arg1, String arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
        }
        if (arg1 != 12606) {
            return null;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field2548, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class470(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "([BBLjava/io/File;)Z")
    public final boolean method1216(byte[] arg0, byte arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg0, 0, arg0.length);
            if (arg1 == -104) {
                var4.close();
                return true;
            } else {
                return false;
            }
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lof;")
    public final class622 method1217(int arg0, String arg1, Class arg2) {
        if (arg0 != 0) {
            this.method1213(-13);
        }
        return this.method1220(8, 0, 9, 0, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1218(int arg0) {
        if (arg0 != 21) {
            this.method1211(null, 23);
        }
        return this.field2535;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(Ljava/lang/String;I)Lof;")
    public final class622 method1219(String arg0, int arg1) {
        return arg1 == 16 ? this.method1220(arg1 - 8, 0, 16, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIILjava/lang/Object;)Lof;")
    private final class622 method1220(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class622 var6 = new class622();
        var6.field8461 = arg4;
        var6.field8464 = arg1;
        var6.field8459 = arg2;
        var6.field8465 = arg3;
        synchronized (this) {
            if (this.field2546 == null) {
                this.field2546 = this.field2545 = var6;
            } else {
                this.field2546.field8460 = var6;
                this.field2546 = var6;
            }
            this.notify();
            if (arg0 != 8) {
                this.method1209(false, 76, null, 37);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "(I)Z")
    public final boolean method1221(int arg0) {
        if (arg0 != -4) {
            this.method1219(null, 50);
        }
        if (!this.field2525) {
            return false;
        } else if (this.field2542) {
            return this.field2550 != null;
        } else {
            return this.field2541 != null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(BLjava/awt/Frame;)Lof;")
    public final class622 method1222(byte arg0, Frame arg1) {
        return arg0 == 89 ? this.method1220(arg0 ^ 0x51, 0, 7, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class158(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field2537 = arg1;
        this.field2525 = arg3;
        field2544 = "1.1";
        field2530 = "Unknown";
        field2540 = arg0;
        try {
            field2530 = System.getProperty("java.vendor");
            field2544 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field2530.toLowerCase().indexOf("microsoft") != -1) {
            this.field2542 = true;
        }
        try {
            field2532 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2532 = "Unknown";
        }
        field2551 = field2532.toLowerCase();
        try {
            field2528 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2528 = "";
        }
        try {
            field2526 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2526 = "";
        }
        try {
            field2548 = System.getProperty("user.home");
            if (field2548 != null) {
                field2548 = field2548 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2548 == null) {
            field2548 = "~/";
        }
        try {
            this.field2547 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field2542) {
            try {
                field2531 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field2534 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class395.method2478((byte) -121, field2537, field2540);
        if (this.field2525) {
            this.field2536 = new class470(class395.method2477(0, field2540, "random.dat", null), "rw", 25L);
            this.field2533 = new class470(class395.method2479(-2, "main_file_cache.dat2"), "rw", 209715200L);
            this.field2527 = new class470(class395.method2479(-2, "main_file_cache.idx255"), "rw", 1048576L);
            this.field2543 = new class470[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2543[var5] = new class470(class395.method2479(-2, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field2542) {
                try {
                    this.field2535 = Class.forName("ac").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field2542) {
                    this.field2550 = new class224();
                } else {
                    this.field2541 = Class.forName("gp").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field2542) {
                    this.field2524 = new class552();
                } else {
                    this.field2539 = Class.forName("pfa").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field2525 && !this.field2542) {
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
        this.field2549 = false;
        this.field2538 = new Thread(this);
        this.field2538.setPriority(10);
        this.field2538.setDaemon(true);
        this.field2538.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1223(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
