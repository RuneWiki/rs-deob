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

@OriginalClass("client!wd")
public class class248 implements Runnable {

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Z")
    private boolean field3400 = false;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Lvba;")
    public class38 field3412 = null;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Z")
    public boolean field3401 = false;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lnga;")
    private class477 field3409 = null;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lvba;")
    public class38 field3399 = null;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Z")
    public boolean field3404 = false;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Lnga;")
    private class477 field3419 = null;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lvba;")
    public class38 field3411 = null;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3395;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "[Lvba;")
    public class38[] field3413;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field3417;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field3405;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lwp;")
    private class162 field3408;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lmg;")
    private class132 field3415;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Ljava/lang/Object;")
    private Object field3407;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field3396;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "J")
    private static volatile long field3393 = 0L;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    private static int field3394;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field3421;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field3422;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field3423;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field3424;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Ljava/lang/String;")
    private static String field3397;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3398;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3402;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3403;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Ljava/lang/String;")
    private static String field3406;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3410;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Ljava/lang/String;")
    private static String field3416;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3420;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3414;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3418;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIB)Lnga;")
    public final class477 method1504(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -10) {
            field3416 = null;
        }
        return this.method1517((arg0 << 16) + arg2, null, 6, (arg3 << 16) + arg1, 10);
    }

    @OriginalMember(owner = "client!wd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class477 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3400) {
                        return;
                    }
                    if (this.field3419 != null) {
                        var2 = this.field3419;
                        this.field3419 = this.field3419.field6696;
                        if (this.field3419 == null) {
                            this.field3409 = null;
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
                int var3 = var2.field6692;
                if (var3 == 1) {
                    if (field3393 > class301.method1787((byte) -66)) {
                        throw new IOException();
                    }
                    var2.field6695 = new Socket(InetAddress.getByName((String) var2.field6698), var2.field6697);
                } else if (var3 == 22) {
                    if (class301.method1787((byte) 123) < field3393) {
                        throw new IOException();
                    }
                    try {
                        var2.field6695 = class411.method2482(var2.field6697, 0, (String) var2.field6698).method765(512);
                    } catch (class437 var29) {
                        var2.field6695 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field6698);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field6697);
                    var2.field6695 = var23;
                } else if (var3 == 4) {
                    if (class301.method1787((byte) -47) < field3393) {
                        throw new IOException();
                    }
                    var2.field6695 = new DataInputStream(((URL) var2.field6698).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field6698;
                    if (this.field3404 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field6695 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var22 = (Object[]) var2.field6698;
                    if (this.field3404 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field6695 = ((Class) var22[0]).getDeclaredField((String) var22[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6695 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field6698;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field3404) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class301.method1787((byte) 121) < field3393) {
                        throw new IOException();
                    }
                    String var9 = (var2.field6697 >> 24 & 0xFF) + "." + (var2.field6697 >> 16 & 0xFF) + "." + (var2.field6697 >> 8 & 0xFF) + "." + (var2.field6697 & 0xFF);
                    var2.field6695 = InetAddress.getByName(var9).getHostName();
                } else if (var3 == 21) {
                    if (class301.method1787((byte) 41) < field3393) {
                        throw new IOException();
                    }
                    var2.field6695 = InetAddress.getByName((String) var2.field6698).getAddress();
                } else if (var3 == 5) {
                    if (this.field3401) {
                        var2.field6695 = this.field3408.method1024(-86);
                    } else {
                        var2.field6695 = Class.forName("oj").getMethod("listmodes").invoke(this.field3405);
                    }
                } else if (var3 == 6) {
                    Frame var21 = new Frame("Jagex Full Screen");
                    var2.field6695 = var21;
                    var21.setResizable(false);
                    if (this.field3401) {
                        this.field3408.method1023(var21, -126, var2.field6697 >>> 16, var2.field6697 & 0xFFFF, var2.field6694 >> 16, var2.field6694 & 0xFFFF);
                    } else {
                        Class.forName("oj").getMethod("enter", field3424 == null ? (field3424 = method1524("java.awt.Frame")) : field3424, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field3405, var21, Integer.valueOf(var2.field6697 >>> 16), new Integer(var2.field6697 & 0xFFFF), Integer.valueOf(var2.field6694 >> 16), new Integer(var2.field6694 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field3401) {
                        this.field3408.method1025((byte) -122, (Frame) var2.field6698);
                    } else {
                        Class.forName("oj").getMethod("exit").invoke(this.field3405);
                    }
                } else if (var3 == 12) {
                    class38 var10 = method1506((String) var2.field6698, (byte) -95, field3406, field3394);
                    var2.field6695 = var10;
                } else if (var3 == 13) {
                    class38 var20 = method1506((String) var2.field6698, (byte) -46, "", field3394);
                    var2.field6695 = var20;
                } else if (this.field3404 && var3 == 14) {
                    int var18 = var2.field6697;
                    int var19 = var2.field6694;
                    if (this.field3401) {
                        this.field3415.method889(var19, var18, (byte) 105);
                    } else {
                        Class.forName("uw").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field3407, Integer.valueOf(var18), new Integer(var19));
                    }
                } else if (this.field3404 && var3 == 15) {
                    boolean var16 = var2.field6697 != 0;
                    Component var17 = (Component) var2.field6698;
                    if (this.field3401) {
                        this.field3415.method888(var17, var16, 0);
                    } else {
                        Class.forName("uw").getDeclaredMethod("showcursor", field3421 == null ? (field3421 = method1524("java.awt.Component")) : field3421, Boolean.TYPE).invoke(this.field3407, var17, Boolean.valueOf(var16));
                    }
                } else if (!this.field3401 && var3 == 17) {
                    Object[] var11 = (Object[]) var2.field6698;
                    Class.forName("uw").getDeclaredMethod("setcustomcursor", field3421 == null ? (field3421 = method1524("java.awt.Component")) : field3421, field3422 == null ? (field3422 = method1524("[I")) : field3422, Integer.TYPE, Integer.TYPE, field3423 == null ? (field3423 = method1524("java.awt.Point")) : field3423).invoke(this.field3407, (Component) var11[0], (int[]) var11[1], Integer.valueOf(var2.field6697), new Integer(var2.field6694), (Point) var11[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field3420.startsWith("win")) {
                            throw new Exception();
                        }
                        String var12 = (String) var2.field6698;
                        if (!var12.startsWith("http://") && !var12.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var14 = 0; var12.length() > var14; var14++) {
                            if (var13.indexOf(var12.charAt(var14)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                        var2.field6695 = null;
                    } catch (Exception var31) {
                        var2.field6695 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field6693 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field6693 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;IZ)Lnga;")
    public final class477 method1505(String arg0, int arg1, boolean arg2) {
        if (arg1 == -1) {
            return arg2 ? this.method1517(0, arg0, 12, 0, arg1 + 11) : this.method1517(0, arg0, 13, 0, arg1 + 11);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Lvba;")
    private static final class38 method1506(String arg0, byte arg1, String arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field3416, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        if (arg1 >= -40) {
            field3394 = -107;
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class38(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final void method1507(byte arg0) {
        field3393 = class301.method1787((byte) -64) + 5000L;
        if (arg0 != -31) {
            this.method1507((byte) 15);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/net/URL;Z)Lnga;")
    public final class477 method1508(URL arg0, boolean arg1) {
        if (arg1) {
            this.method1516((byte) 1);
        }
        return this.method1517(0, arg0, 4, 0, 10);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Frame;I)Lnga;")
    public final class477 method1509(Frame arg0, int arg1) {
        if (arg1 != 0) {
            field3393 = -94L;
        }
        return this.method1517(0, arg0, 7, 0, arg1 ^ 0xA);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZILjava/lang/String;)Lnga;")
    public final class477 method1510(int arg0, boolean arg1, int arg2, String arg3) {
        int var5 = 85 / ((-arg2 - 41) / 57);
        return this.method1517(0, arg3, arg1 ? 22 : 1, arg0, 10);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lnga;")
    public final class477 method1511(String arg0, Class[] arg1, int arg2, Class arg3) {
        int var5 = 19 / ((-arg2 - 62) / 51);
        return this.method1517(0, new Object[] { arg3, arg0, arg1 }, 8, 0, 10);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1512(byte arg0) {
        return arg0 == 65 ? this.field3417 : null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lnga;")
    public final class477 method1513(byte arg0, int arg1) {
        return arg0 == -57 ? this.method1517(0, null, 3, arg1, arg0 ^ 0xFFFFFFCD) : null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lnga;")
    public final class477 method1514(String arg0, Class arg1, int arg2) {
        return arg2 == 65535 ? this.method1517(0, new Object[] { arg1, arg0 }, 9, 0, arg2 - 65525) : null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public final void method1515(int arg0) {
        synchronized (this) {
            this.field3400 = true;
            this.notifyAll();
        }
        try {
            this.field3396.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3411 != null) {
            try {
                this.field3411.method442((byte) -72);
            } catch (IOException var7) {
            }
        }
        if (this.field3399 != null) {
            try {
                this.field3399.method442((byte) -72);
            } catch (IOException var6) {
            }
        }
        if (this.field3413 != null) {
            for (int var3 = 0; var3 < this.field3413.length; var3++) {
                if (this.field3413[var3] != null) {
                    try {
                        this.field3413[var3].method442((byte) -72);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 == 0 && this.field3412 != null) {
            try {
                this.field3412.method442((byte) -72);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)Z")
    public final boolean method1516(byte arg0) {
        if (!this.field3404) {
            return false;
        }
        int var2 = -64 % ((arg0 - 30) / 55);
        if (this.field3401) {
            return this.field3408 != null;
        } else {
            return this.field3405 != null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/Object;III)Lnga;")
    private final class477 method1517(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class477 var6 = new class477();
        var6.field6698 = arg1;
        var6.field6694 = arg0;
        var6.field6697 = arg3;
        var6.field6692 = arg2;
        synchronized (this) {
            if (arg4 != 10) {
                this.method1511(null, null, 80, null);
            }
            if (this.field3409 == null) {
                this.field3409 = this.field3419 = var6;
            } else {
                this.field3409.field6696 = var6;
                this.field3409 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;Z)Lvba;")
    public static final class38 method1518(String arg0, boolean arg1) {
        return arg1 ? method1506(arg0, (byte) -126, field3406, field3394) : null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[BLjava/io/File;)Z")
    public final boolean method1519(byte arg0, byte[] arg1, File arg2) {
        if (arg0 <= 105) {
            return true;
        }
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg1, 0, arg1.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Component;II[ILjava/awt/Point;I)Lnga;")
    public final class477 method1520(Component arg0, int arg1, int arg2, int[] arg3, Point arg4, int arg5) {
        return arg5 < 112 ? null : this.method1517(arg2, new Object[] { arg0, arg3, arg4 }, 17, arg1, 10);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lnga;")
    public final class477 method1521(Runnable arg0, int arg1, int arg2) {
        return arg2 <= 43 ? null : this.method1517(0, arg0, 2, arg1, 10);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)Lnga;")
    public final class477 method1522(String arg0, int arg1) {
        return arg1 >= -89 ? null : this.method1517(0, arg0, 16, 0, 10);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lnga;")
    public final class477 method1523(int arg0) {
        if (arg0 != -15448) {
            this.run();
        }
        return this.method1517(0, null, 5, 0, arg0 ^ 0xFFFFC3A2);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class248(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field3398 = "1.1";
        field3402 = "Unknown";
        field3406 = arg1;
        field3394 = arg0;
        this.field3404 = arg3;
        try {
            field3402 = System.getProperty("java.vendor");
            field3398 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field3402.toLowerCase().indexOf("microsoft") != -1) {
            this.field3401 = true;
        }
        try {
            field3397 = System.getProperty("os.name");
        } catch (Exception var19) {
            field3397 = "Unknown";
        }
        field3420 = field3397.toLowerCase();
        try {
            field3403 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field3403 = "";
        }
        try {
            field3410 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field3410 = "";
        }
        try {
            field3416 = System.getProperty("user.home");
            if (field3416 != null) {
                field3416 = field3416 + "/";
            }
        } catch (Exception var16) {
        }
        if (field3416 == null) {
            field3416 = "~/";
        }
        try {
            this.field3395 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field3401) {
            try {
                field3418 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field3414 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class292.method1734(true, field3394, field3406);
        if (this.field3404) {
            this.field3412 = new class38(class292.method1736(0, null, "random.dat", field3394), "rw", 25L);
            this.field3411 = new class38(class292.method1735("main_file_cache.dat2", 31025), "rw", 209715200L);
            this.field3399 = new class38(class292.method1735("main_file_cache.idx255", 31025), "rw", 1048576L);
            this.field3413 = new class38[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field3413[var5] = new class38(class292.method1735("main_file_cache.idx" + var5, 31025), "rw", 1048576L);
            }
            if (this.field3401) {
                try {
                    this.field3417 = Class.forName("jm").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field3401) {
                    this.field3408 = new class162();
                } else {
                    this.field3405 = Class.forName("oj").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field3401) {
                    this.field3415 = new class132();
                } else {
                    this.field3407 = Class.forName("uw").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field3404 && !this.field3401) {
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
        this.field3400 = false;
        this.field3396 = new Thread(this);
        this.field3396.setPriority(10);
        this.field3396.setDaemon(true);
        this.field3396.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1524(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
