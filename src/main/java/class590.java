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

@OriginalClass("client!kj")
public class class590 implements Runnable {

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Z")
    public boolean field8334 = false;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Lqaa;")
    public class29 field8333 = null;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Lrb;")
    private class370 field8331 = null;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Z")
    private boolean field8337 = false;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Lqaa;")
    public class29 field8343 = null;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Lrb;")
    private class370 field8348 = null;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Z")
    public boolean field8345 = false;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "Lqaa;")
    public class29 field8344 = null;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field8335;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "[Lqaa;")
    public class29[] field8324;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Ljava/lang/Object;")
    private Object field8330;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field8351;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "Lsaa;")
    private class343 field8350;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field8342;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Lifa;")
    private class447 field8341;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field8325;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "J")
    private static volatile long field8338 = 0L;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private static int field8329;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kj", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field8352;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kj", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field8353;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kj", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field8354;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kj", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field8355;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field8326;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Ljava/lang/String;")
    private static String field8327;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/lang/String;")
    private static String field8328;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Ljava/lang/String;")
    private static String field8332;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field8336;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field8339;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "Ljava/lang/String;")
    public static String field8346;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Ljava/lang/String;")
    public static String field8347;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field8340;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field8349;

    @OriginalMember(owner = "client!kj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class370 var2;
            synchronized (this) {
                while (true) {
                    if (this.field8337) {
                        return;
                    }
                    if (this.field8331 != null) {
                        var2 = this.field8331;
                        this.field8331 = this.field8331.field5318;
                        if (this.field8331 == null) {
                            this.field8348 = null;
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
                int var3 = var2.field5315;
                if (var3 == 1) {
                    if (class109.method731(112) < field8338) {
                        throw new IOException();
                    }
                    var2.field5317 = new Socket(InetAddress.getByName((String) var2.field5319), var2.field5313);
                } else if (var3 == 22) {
                    if (field8338 > class109.method731(110)) {
                        throw new IOException();
                    }
                    try {
                        var2.field5317 = class557.method3232((String) var2.field5319, var2.field5313, 30482).method153((byte) -36);
                    } catch (class471 var29) {
                        var2.field5317 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field5319);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field5313);
                    var2.field5317 = var4;
                } else if (var3 == 4) {
                    if (field8338 > class109.method731(44)) {
                        throw new IOException();
                    }
                    var2.field5317 = new DataInputStream(((URL) var2.field5319).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field5319;
                    if (this.field8334 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field5317 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field5319;
                    if (this.field8334 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field5317 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5317 = var22.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field5319;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field8334) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field8338 > class109.method731(21)) {
                        throw new IOException();
                    }
                    String var21 = (var2.field5313 >> 24 & 0xFF) + "." + ((var2.field5313 & 0xFFA50E) >> 16) + "." + (var2.field5313 >> 8 & 0xFF) + "." + (var2.field5313 & 0xFF);
                    var2.field5317 = InetAddress.getByName(var21).getHostName();
                } else if (var3 == 21) {
                    if (class109.method731(98) < field8338) {
                        throw new IOException();
                    }
                    var2.field5317 = InetAddress.getByName((String) var2.field5319).getAddress();
                } else if (var3 == 5) {
                    if (this.field8345) {
                        var2.field5317 = this.field8350.method2190(false);
                    } else {
                        var2.field5317 = Class.forName("vja").getMethod("listmodes").invoke(this.field8351);
                    }
                } else if (var3 == 6) {
                    Frame var9 = new Frame("Jagex Full Screen");
                    var2.field5317 = var9;
                    var9.setResizable(false);
                    if (this.field8345) {
                        this.field8350.method2191((byte) 87, var2.field5316 >> 16, var9, var2.field5313 >>> 16, var2.field5316 & 0xFFFF, var2.field5313 & 0xFFFF);
                    } else {
                        Class.forName("vja").getMethod("enter", field8352 == null ? (field8352 = method3432("java.awt.Frame")) : field8352, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field8351, var9, Integer.valueOf(var2.field5313 >>> 16), new Integer(var2.field5313 & 0xFFFF), Integer.valueOf(var2.field5316 >> 16), new Integer(var2.field5316 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field8345) {
                        this.field8350.method2189((Frame) var2.field5319, (byte) 102);
                    } else {
                        Class.forName("vja").getMethod("exit").invoke(this.field8351);
                    }
                } else if (var3 == 12) {
                    class29 var10 = method3425(field8332, (byte) -40, (String) var2.field5319, field8329);
                    var2.field5317 = var10;
                } else if (var3 == 13) {
                    class29 var11 = method3425("", (byte) -16, (String) var2.field5319, field8329);
                    var2.field5317 = var11;
                } else if (this.field8334 && var3 == 14) {
                    int var12 = var2.field5313;
                    int var13 = var2.field5316;
                    if (this.field8345) {
                        this.field8341.method2684(var13, -59, var12);
                    } else {
                        Class.forName("ed").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field8342, Integer.valueOf(var12), new Integer(var13));
                    }
                } else if (this.field8334 && var3 == 15) {
                    boolean var19 = var2.field5313 != 0;
                    Component var20 = (Component) var2.field5319;
                    if (this.field8345) {
                        this.field8341.method2685(var20, 5496, var19);
                    } else {
                        Class.forName("ed").getDeclaredMethod("showcursor", field8353 == null ? (field8353 = method3432("java.awt.Component")) : field8353, Boolean.TYPE).invoke(this.field8342, var20, Boolean.valueOf(var19));
                    }
                } else if (!this.field8345 && var3 == 17) {
                    Object[] var18 = (Object[]) var2.field5319;
                    Class.forName("ed").getDeclaredMethod("setcustomcursor", field8353 == null ? (field8353 = method3432("java.awt.Component")) : field8353, field8354 == null ? (field8354 = method3432("[I")) : field8354, Integer.TYPE, Integer.TYPE, field8355 == null ? (field8355 = method3432("java.awt.Point")) : field8355).invoke(this.field8342, (Component) var18[0], (int[]) var18[1], Integer.valueOf(var2.field5313), new Integer(var2.field5316), (Point) var18[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field8347.startsWith("win")) {
                            throw new Exception();
                        }
                        String var14 = (String) var2.field5319;
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
                        var2.field5317 = null;
                    } catch (Exception var31) {
                        var2.field5317 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field5314 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field5314 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public final void method3412(boolean arg0) {
        field8338 = class109.method731(119) + 5000L;
        if (arg0) {
            this.method3417(-113, null, 87, (byte) 104, 61);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method3413(boolean arg0) {
        return arg0 ? this.field8330 : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lrb;")
    public final class370 method3414(boolean arg0, String arg1, Class arg2) {
        return arg0 ? this.method3417(0, new Object[] { arg2, arg1 }, 0, (byte) 1, 9) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;)Lrb;")
    public final class370 method3415(int arg0, String arg1) {
        if (arg0 != 4) {
            this.method3422(null, -67, true);
        }
        return this.method3417(0, arg1, 0, (byte) 1, 16);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/awt/Frame;)Lrb;")
    public final class370 method3416(int arg0, Frame arg1) {
        if (arg0 != 16) {
            this.method3429(null, (byte) 60);
        }
        return this.method3417(0, arg1, 0, (byte) 1, 7);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lrb;")
    private final class370 method3417(int arg0, Object arg1, int arg2, byte arg3, int arg4) {
        class370 var6 = new class370();
        var6.field5315 = arg4;
        var6.field5316 = arg2;
        if (arg3 != 1) {
            return null;
        }
        var6.field5319 = arg1;
        var6.field5313 = arg0;
        synchronized (this) {
            if (this.field8348 == null) {
                this.field8348 = this.field8331 = var6;
            } else {
                this.field8348.field5318 = var6;
                this.field8348 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lrb;")
    public final class370 method3418(int arg0, int arg1) {
        return arg1 == 570795760 ? this.method3417(arg0, null, 0, (byte) 1, 3) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZIILjava/lang/String;)Lrb;")
    public final class370 method3419(boolean arg0, int arg1, int arg2, String arg3) {
        if (arg2 != 255) {
            this.field8334 = true;
        }
        return this.method3417(arg1, arg3, 0, (byte) 1, arg0 ? 22 : 1);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIILjava/awt/Component;BLjava/awt/Point;)Lrb;")
    public final class370 method3420(int[] arg0, int arg1, int arg2, Component arg3, byte arg4, Point arg5) {
        if (arg4 != -57) {
            this.field8334 = true;
        }
        return this.method3417(arg2, new Object[] { arg3, arg0, arg5 }, arg1, (byte) 1, 17);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([BLjava/io/File;I)Z")
    public final boolean method3421(byte[] arg0, File arg1, int arg2) {
        if (arg2 != 65535) {
            return false;
        }
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;IZ)Lrb;")
    public final class370 method3422(String arg0, int arg1, boolean arg2) {
        int var4 = 28 % ((arg1 - 14) / 45);
        return arg2 ? this.method3417(0, arg0, 0, (byte) 1, 12) : this.method3417(0, arg0, 0, (byte) 1, 13);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public final void method3423(int arg0) {
        synchronized (this) {
            this.field8337 = true;
            this.notifyAll();
        }
        if (arg0 <= 121) {
            return;
        }
        try {
            this.field8325.join();
        } catch (InterruptedException var8) {
        }
        if (this.field8343 != null) {
            try {
                this.field8343.method210(14471);
            } catch (IOException var7) {
            }
        }
        if (this.field8344 != null) {
            try {
                this.field8344.method210(14471);
            } catch (IOException var6) {
            }
        }
        if (this.field8324 != null) {
            for (int var3 = 0; var3 < this.field8324.length; var3++) {
                if (this.field8324[var3] != null) {
                    try {
                        this.field8324[var3].method210(14471);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field8333 != null) {
            try {
                this.field8333.method210(14471);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;B)Lqaa;")
    public static final class29 method3424(String arg0, byte arg1) {
        if (arg1 != 73) {
            method3425(null, (byte) 85, null, 93);
        }
        return method3425(field8332, (byte) -71, arg0, field8329);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Lqaa;")
    private static final class29 method3425(String arg0, byte arg1, String arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field8328, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        int var6 = 0;
        if (arg1 > -8) {
            return null;
        }
        while (var6 < var5.length) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class29(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
            var6++;
        }
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lrb;")
    public final class370 method3426(int arg0, Runnable arg1, int arg2) {
        if (arg0 < 87) {
            field8328 = null;
        }
        return this.method3417(arg2, arg1, 0, (byte) 1, 2);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;Z)Lrb;")
    public final class370 method3427(Class arg0, Class[] arg1, String arg2, boolean arg3) {
        return arg3 ? null : this.method3417(0, new Object[] { arg0, arg2, arg1 }, 0, (byte) 1, 8);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)Lrb;")
    public final class370 method3428(int arg0) {
        if (arg0 != 1) {
            field8332 = null;
        }
        return this.method3417(0, null, 0, (byte) 1, 5);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/net/URL;B)Lrb;")
    public final class370 method3429(URL arg0, byte arg1) {
        if (arg1 > -20) {
            this.method3428(-58);
        }
        return this.method3417(0, arg0, 0, (byte) 1, 4);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)Lrb;")
    public final class370 method3430(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg1 == 7 ? this.method3417((arg4 << 16) + arg0, null, (arg3 << 16) + arg2, (byte) 1, 6) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)Z")
    public final boolean method3431(byte arg0) {
        if (arg0 < 39) {
            this.method3417(-5, null, 118, (byte) 54, 32);
        }
        if (!this.field8334) {
            return false;
        } else if (this.field8345) {
            return this.field8350 != null;
        } else {
            return this.field8351 != null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class590(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field8329 = arg0;
        field8336 = "Unknown";
        field8332 = arg1;
        this.field8334 = arg3;
        field8326 = "1.1";
        try {
            field8336 = System.getProperty("java.vendor");
            field8326 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field8336.toLowerCase().indexOf("microsoft") != -1) {
            this.field8345 = true;
        }
        try {
            field8327 = System.getProperty("os.name");
        } catch (Exception var19) {
            field8327 = "Unknown";
        }
        field8347 = field8327.toLowerCase();
        try {
            field8346 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field8346 = "";
        }
        try {
            field8339 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field8339 = "";
        }
        try {
            field8328 = System.getProperty("user.home");
            if (field8328 != null) {
                field8328 = field8328 + "/";
            }
        } catch (Exception var16) {
        }
        if (field8328 == null) {
            field8328 = "~/";
        }
        try {
            this.field8335 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field8345) {
            try {
                field8340 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field8349 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class236.method1622(field8332, -3, field8329);
        if (this.field8334) {
            this.field8333 = new class29(class236.method1624((byte) 16, field8329, "random.dat", null), "rw", 25L);
            this.field8343 = new class29(class236.method1623(true, "main_file_cache.dat2"), "rw", 209715200L);
            this.field8344 = new class29(class236.method1623(true, "main_file_cache.idx255"), "rw", 1048576L);
            this.field8324 = new class29[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field8324[var5] = new class29(class236.method1623(true, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field8345) {
                try {
                    this.field8330 = Class.forName("nu").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field8345) {
                    this.field8350 = new class343();
                } else {
                    this.field8351 = Class.forName("vja").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field8345) {
                    this.field8341 = new class447();
                } else {
                    this.field8342 = Class.forName("ed").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field8334 && !this.field8345) {
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
        this.field8337 = false;
        this.field8325 = new Thread(this);
        this.field8325.setPriority(10);
        this.field8325.setDaemon(true);
        this.field8325.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3432(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
