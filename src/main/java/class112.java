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

@OriginalClass("client!cr")
public class class112 implements Runnable {

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Z")
    private boolean field1341 = false;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Lhh;")
    public class428 field1339 = null;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "Lhh;")
    public class428 field1344 = null;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Lrp;")
    private class280 field1343 = null;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "Lhh;")
    public class428 field1361 = null;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "Lrp;")
    private class280 field1358 = null;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "Z")
    public boolean field1357 = false;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "Z")
    public boolean field1356 = false;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1362;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "[Lhh;")
    public class428[] field1350;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "Ljava/lang/Object;")
    private Object field1355;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "Lrs;")
    private class231 field1359;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "Ljava/lang/Object;")
    private Object field1354;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "Lhca;")
    private class469 field1348;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "Ljava/lang/Object;")
    private Object field1347;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field1342;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "J")
    private static volatile long field1346 = 0L;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    private static int field1338;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cr", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field1365;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cr", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field1366;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cr", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field1367;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cr", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field1368;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Ljava/lang/String;")
    private static String field1340;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1345;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1351;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "Ljava/lang/String;")
    private static String field1352;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "Ljava/lang/String;")
    private static String field1353;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1360;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1363;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1349;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1364;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method630(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lrp;", line = 10)
    public final class280 method610(String arg0, Class[] arg1, Class arg2, byte arg3) {
        if (arg3 > -43) {
            this.method621(-88, 10);
        }
        return this.method616(new Object[] { arg2, arg0, arg1 }, 0, 65464, 8, 0);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 692)
    public class112(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        this.field1356 = arg3;
        field1363 = "1.1";
        field1345 = "Unknown";
        field1352 = arg1;
        field1338 = arg0;
        try {
            field1345 = System.getProperty("java.vendor");
            field1363 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field1345.toLowerCase().indexOf("microsoft") != -1) {
            this.field1357 = true;
        }
        try {
            field1353 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1353 = "Unknown";
        }
        field1360 = field1353.toLowerCase();
        try {
            field1351 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1351 = "";
        }
        try {
            System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
        }
        try {
            field1340 = System.getProperty("user.home");
            if (field1340 != null) {
                field1340 = field1340 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1340 == null) {
            field1340 = "~/";
        }
        try {
            this.field1362 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field1357) {
            try {
                field1349 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field1364 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class583.method3269((byte) -5, field1338, field1352);
        if (this.field1356) {
            this.field1361 = new class428(class583.method3270(null, (byte) 75, "random.dat", field1338), "rw", 25L);
            this.field1339 = new class428(class583.method3268(-3, "main_file_cache.dat2"), "rw", 209715200L);
            this.field1344 = new class428(class583.method3268(-3, "main_file_cache.idx255"), "rw", 1048576L);
            this.field1350 = new class428[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1350[var5] = new class428(class583.method3268(-3, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field1357) {
                try {
                    this.field1355 = Class.forName("ow").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field1357) {
                    this.field1359 = new class231();
                } else {
                    this.field1354 = Class.forName("nca").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field1357) {
                    this.field1348 = new class469();
                } else {
                    this.field1347 = Class.forName("n").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field1356 && !this.field1357) {
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
        this.field1341 = false;
        this.field1342 = new Thread(this);
        this.field1342.setPriority(10);
        this.field1342.setDaemon(true);
        this.field1342.start();
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Z", line = 31)
    public final boolean method611(int arg0) {
        if (arg0 != 0) {
            field1338 = 84;
        }
        if (!this.field1356) {
            return false;
        } else if (this.field1357) {
            return this.field1359 != null;
        } else {
            return this.field1354 != null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lrp;", line = 51)
    public final class280 method612(int arg0, Runnable arg1, byte arg2) {
        int var4 = 36 % ((18 - arg2) / 38);
        return this.method616(arg1, arg0, 65464, 2, 0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLjava/net/URL;)Lrp;", line = 61)
    public final class280 method613(byte arg0, URL arg1) {
        int var3 = 114 % ((arg0 - 7) / 53);
        return this.method616(arg1, 0, 65464, 4, 0);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V", line = 70)
    public final void method614(int arg0) {
        synchronized (this) {
            this.field1341 = true;
            this.notifyAll();
        }
        try {
            this.field1342.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 >= -78) {
            this.method614(-33);
        }
        if (this.field1339 != null) {
            try {
                this.field1339.method2467((byte) 106);
            } catch (IOException var7) {
            }
        }
        if (this.field1344 != null) {
            try {
                this.field1344.method2467((byte) 106);
            } catch (IOException var6) {
            }
        }
        if (this.field1350 != null) {
            for (int var3 = 0; var3 < this.field1350.length; var3++) {
                if (this.field1350[var3] != null) {
                    try {
                        this.field1350[var3].method2467((byte) 106);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1361 != null) {
            try {
                this.field1361.method2467((byte) 106);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/awt/Frame;I)Lrp;", line = 127)
    public final class280 method615(Frame arg0, int arg1) {
        return arg1 == 26420 ? this.method616(arg0, 0, arg1 ^ 0x988C, 7, 0) : null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lrp;", line = 144)
    private final class280 method616(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 65464) {
            return null;
        }
        class280 var6 = new class280();
        var6.field3775 = arg1;
        var6.field3776 = arg4;
        var6.field3771 = arg0;
        var6.field3774 = arg3;
        synchronized (this) {
            if (this.field1358 == null) {
                this.field1358 = this.field1343 = var6;
            } else {
                this.field1358.field3777 = var6;
                this.field1358 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZILjava/lang/String;)Lrp;", line = 174)
    public final class280 method617(int arg0, boolean arg1, int arg2, String arg3) {
        if (arg0 != 22) {
            this.field1361 = null;
        }
        return this.method616(arg3, arg2, 65464, arg1 ? 22 : 1, 0);
    }

    @OriginalMember(owner = "client!cr", name = "run", descriptor = "()V", line = 184)
    public final void run() {
        while (true) {
            class280 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1341) {
                        return;
                    }
                    if (this.field1343 != null) {
                        var2 = this.field1343;
                        this.field1343 = this.field1343.field3777;
                        if (this.field1343 == null) {
                            this.field1358 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var28) {
                    }
                }
            }
            try {
                int var3 = var2.field3774;
                if (var3 == 1) {
                    if (field1346 > class669.method3713(0)) {
                        throw new IOException();
                    }
                    var2.field3772 = new Socket(InetAddress.getByName((String) var2.field3771), var2.field3775);
                } else if (var3 == 22) {
                    if (field1346 > class669.method3713(0)) {
                        throw new IOException();
                    }
                    var2.field3772 = class466.method2638((byte) 108, var2.field3775, (String) var2.field3771).method458(21974);
                } else if (var3 == 2) {
                    Thread var22 = new Thread((Runnable) var2.field3771);
                    var22.setDaemon(true);
                    var22.start();
                    var22.setPriority(var2.field3775);
                    var2.field3772 = var22;
                } else if (var3 == 4) {
                    if (class669.method3713(0) < field1346) {
                        throw new IOException();
                    }
                    var2.field3772 = new DataInputStream(((URL) var2.field3771).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3771;
                    if (this.field1356 && ((Class) var4[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3772 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var21 = (Object[]) var2.field3771;
                    if (this.field1356 && ((Class) var21[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3772 = ((Class) var21[0]).getDeclaredField((String) var21[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3772 = var5.getContents(null);
                } else if (var3 == 19) {
                    Transferable var19 = (Transferable) var2.field3771;
                    Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var20.setContents(var19, null);
                } else if (!this.field1356) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field1346 > class669.method3713(0)) {
                        throw new IOException();
                    }
                    String var6 = (var2.field3775 >> 24 & 0xFF) + "." + ((var2.field3775 & 0xFFA78A) >> 16) + "." + ((var2.field3775 & 0xFFB8) >> 8) + "." + (var2.field3775 & 0xFF);
                    var2.field3772 = InetAddress.getByName(var6).getHostName();
                } else if (var3 == 21) {
                    if (class669.method3713(0) < field1346) {
                        throw new IOException();
                    }
                    var2.field3772 = InetAddress.getByName((String) var2.field3771).getAddress();
                } else if (var3 == 5) {
                    if (this.field1357) {
                        var2.field3772 = this.field1359.method1427(false);
                    } else {
                        var2.field3772 = Class.forName("nca").getMethod("listmodes").invoke(this.field1354);
                    }
                } else if (var3 == 6) {
                    Frame var7 = new Frame("Jagex Full Screen");
                    var2.field3772 = var7;
                    var7.setResizable(false);
                    if (this.field1357) {
                        this.field1359.method1425(var2.field3775 >>> 16, var7, var2.field3776 & 0xFFFF, 21582, var2.field3776 >> 16, var2.field3775 & 0xFFFF);
                    } else {
                        Class.forName("nca").getMethod("enter", field1365 == null ? (field1365 = method630("java.awt.Frame")) : field1365, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field1354, var7, Integer.valueOf(var2.field3775 >>> 16), new Integer(var2.field3775 & 0xFFFF), Integer.valueOf(var2.field3776 >> 16), new Integer(var2.field3776 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field1357) {
                        this.field1359.method1426((Frame) var2.field3771, -27740);
                    } else {
                        Class.forName("nca").getMethod("exit").invoke(this.field1354);
                    }
                } else if (var3 == 12) {
                    class428 var8 = method620(1, (String) var2.field3771, field1338, field1352);
                    var2.field3772 = var8;
                } else if (var3 == 13) {
                    class428 var9 = method620(1, (String) var2.field3771, field1338, "");
                    var2.field3772 = var9;
                } else if (this.field1356 && var3 == 14) {
                    int var17 = var2.field3775;
                    int var18 = var2.field3776;
                    if (this.field1357) {
                        this.field1348.method2645(var17, var18, 8);
                    } else {
                        Class.forName("n").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field1347, Integer.valueOf(var17), new Integer(var18));
                    }
                } else if (this.field1356 && var3 == 15) {
                    boolean var10 = var2.field3775 != 0;
                    Component var11 = (Component) var2.field3771;
                    if (this.field1357) {
                        this.field1348.method2644(0, var10, var11);
                    } else {
                        Class.forName("n").getDeclaredMethod("showcursor", field1366 == null ? (field1366 = method630("java.awt.Component")) : field1366, Boolean.TYPE).invoke(this.field1347, var11, Boolean.valueOf(var10));
                    }
                } else if (!this.field1357 && var3 == 17) {
                    Object[] var12 = (Object[]) var2.field3771;
                    Class.forName("n").getDeclaredMethod("setcustomcursor", field1366 == null ? (field1366 = method630("java.awt.Component")) : field1366, field1367 == null ? (field1367 = method630("[I")) : field1367, Integer.TYPE, Integer.TYPE, field1368 == null ? (field1368 = method630("java.awt.Point")) : field1368).invoke(this.field1347, (Component) var12[0], (int[]) var12[1], Integer.valueOf(var2.field3775), new Integer(var2.field3776), (Point) var12[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field1360.startsWith("win")) {
                            throw new Exception();
                        }
                        String var13 = (String) var2.field3771;
                        if (!var13.startsWith("http://") && !var13.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var15 = 0; var13.length() > var15; var15++) {
                            if (var14.indexOf(var13.charAt(var15)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                        var2.field3772 = null;
                    } catch (Exception var29) {
                        var2.field3772 = var29;
                        throw var29;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field3773 = 1;
            } catch (ThreadDeath var30) {
                throw var30;
            } catch (Throwable var31) {
                var2.field3773 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([BLjava/io/File;I)Z", line = 474)
    public final boolean method618(byte[] arg0, File arg1, int arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return arg2 == 8239;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lrp;", line = 499)
    public final class280 method619(Class arg0, byte arg1, String arg2) {
        if (arg1 < 79) {
            this.method615(null, -36);
        }
        return this.method616(new Object[] { arg0, arg2 }, 0, 65464, 9, 0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lhh;", line = 517)
    private static final class428 method620(int arg0, String arg1, int arg2, String arg3) {
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field1340, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class428(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        if (arg0 != 1) {
            field1364 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)Lrp;", line = 565)
    public final class280 method621(int arg0, int arg1) {
        return arg0 == 65535 ? this.method616(null, arg1, 65464, 3, 0) : null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;)Lhh;", line = 578)
    public static final class428 method622(int arg0, String arg1) {
        if (arg0 != -15) {
            method620(-128, null, 26, null);
        }
        return method620(1, arg1, field1338, field1352);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBIII)Lrp;", line = 588)
    public final class280 method623(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -100) {
            this.field1362 = null;
        }
        return this.method616(null, (arg4 << 16) + arg0, 65464, 6, (arg2 << 16) + arg3);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLjava/lang/String;)Lrp;", line = 598)
    public final class280 method624(byte arg0, String arg1) {
        if (arg0 != 78) {
            this.field1348 = null;
        }
        return this.method616(arg1, 0, arg0 + 65386, 16, 0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZILjava/lang/String;)Lrp;", line = 615)
    public final class280 method625(boolean arg0, int arg1, String arg2) {
        if (arg1 == -25857) {
            return arg0 ? this.method616(arg2, 0, 65464, 12, 0) : this.method616(arg2, 0, 65464, 13, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V", line = 630)
    public final void method626(byte arg0) {
        field1346 = class669.method3713(0) + 5000L;
        int var2 = -91 % ((49 - arg0) / 40);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[III)Lrp;", line = 643)
    public final class280 method627(int arg0, Point arg1, Component arg2, int[] arg3, int arg4, int arg5) {
        return arg5 == -11597 ? this.method616(new Object[] { arg2, arg3, arg1 }, arg4, 65464, 17, arg0) : null;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 662)
    public final Object method628(int arg0) {
        return arg0 == -19177 ? this.field1355 : null;
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)Lrp;", line = 675)
    public final class280 method629(int arg0) {
        if (arg0 != 4) {
            this.field1358 = null;
        }
        return this.method616(null, 0, arg0 + 65460, 5, 0);
    }
}
