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

@OriginalClass("client!fl")
public class class739 implements Runnable {

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Ljt;")
    private class107 field10297 = null;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lvl;")
    public class13 field10288 = null;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Lvl;")
    public class13 field10293 = null;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Z")
    private boolean field10289 = false;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Ljt;")
    private class107 field10305 = null;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Z")
    public boolean field10290 = false;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
    public boolean field10283 = false;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "Lvl;")
    public class13 field10310 = null;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field10306;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "[Lvl;")
    public class13[] field10303;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Ljava/lang/Object;")
    private Object field10291;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field10301;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "Lbha;")
    private class575 field10292;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field10295;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Lkea;")
    private class240 field10285;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field10294;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "J")
    private static volatile long field10309 = 0L;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    private static int field10299;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fl", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field10311;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fl", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field10312;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fl", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field10313;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fl", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field10314;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field10284;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Ljava/lang/String;")
    private static String field10287;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "Ljava/lang/String;")
    private static String field10296;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Ljava/lang/String;")
    public static String field10298;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Ljava/lang/String;")
    public static String field10300;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Ljava/lang/String;")
    private static String field10302;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "Ljava/lang/String;")
    public static String field10304;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "Ljava/lang/String;")
    public static String field10307;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10286;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10308;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4146(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/Runnable;I)Ljt;", line = 4)
    public final class107 method4126(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 1) {
            this.method4142(-5);
        }
        return this.method4145(0, -115, arg0, 2, arg1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/String;)Ljt;", line = 20)
    public final class107 method4127(int arg0, String arg1) {
        if (arg0 != -14) {
            this.field10292 = null;
        }
        return this.method4145(0, -126, 0, 16, arg1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Z", line = 30)
    public final boolean method4128(byte arg0) {
        int var2 = 6 % ((-arg0 - 56) / 40);
        if (!this.field10290) {
            return false;
        } else if (this.field10283) {
            return this.field10292 != null;
        } else {
            return this.field10301 != null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 49)
    public final void method4129(int arg0) {
        field10309 = class538.method2963(-47) + 5000L;
        int var2 = -113 / ((arg0 - 88) / 32);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/awt/Frame;)Ljt;", line = 59)
    public final class107 method4130(int arg0, Frame arg1) {
        if (arg0 != -3470) {
            field10300 = null;
        }
        return this.method4145(0, -66, 0, 7, arg1);
    }

    @OriginalMember(owner = "client!fl", name = "run", descriptor = "()V", line = 69)
    public final void run() {
        while (true) {
            class107 var2;
            synchronized (this) {
                while (true) {
                    if (this.field10289) {
                        return;
                    }
                    if (this.field10305 != null) {
                        var2 = this.field10305;
                        this.field10305 = this.field10305.field1423;
                        if (this.field10305 == null) {
                            this.field10297 = null;
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
                int var3 = var2.field1420;
                if (var3 == 1) {
                    if (field10309 > class538.method2963(-47)) {
                        throw new IOException();
                    }
                    var2.field1418 = new Socket(InetAddress.getByName((String) var2.field1417), var2.field1422);
                } else if (var3 == 22) {
                    if (field10309 > class538.method2963(-47)) {
                        throw new IOException();
                    }
                    try {
                        var2.field1418 = class30.method124((String) var2.field1417, 0, var2.field1422).method995(-2);
                    } catch (class149 var29) {
                        var2.field1418 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field1417);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field1422);
                    var2.field1418 = var5;
                } else if (var3 == 4) {
                    if (field10309 > class538.method2963(-47)) {
                        throw new IOException();
                    }
                    var2.field1418 = new DataInputStream(((URL) var2.field1417).openStream());
                } else if (var3 == 8) {
                    Object[] var23 = (Object[]) var2.field1417;
                    if (this.field10290 && ((Class) var23[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field1418 = ((Class) var23[0]).getDeclaredMethod((String) var23[1], (Class[]) var23[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field1417;
                    if (this.field10290 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field1418 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field1418 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var21 = (Transferable) var2.field1417;
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var22.setContents(var21, null);
                } else if (!this.field10290) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field10309 > class538.method2963(-47)) {
                        throw new IOException();
                    }
                    String var8 = (var2.field1422 >> 24 & 0xFF) + "." + (var2.field1422 >> 16 & 0xFF) + "." + ((var2.field1422 & 0xFFFC) >> 8) + "." + (var2.field1422 & 0xFF);
                    var2.field1418 = InetAddress.getByName(var8).getHostName();
                } else if (var3 == 21) {
                    if (field10309 > class538.method2963(-47)) {
                        throw new IOException();
                    }
                    var2.field1418 = InetAddress.getByName((String) var2.field1417).getAddress();
                } else if (var3 == 5) {
                    if (this.field10283) {
                        var2.field1418 = this.field10292.method3227(false);
                    } else {
                        var2.field1418 = Class.forName("eha").getMethod("listmodes").invoke(this.field10301);
                    }
                } else if (var3 == 6) {
                    Frame var9 = new Frame("Jagex Full Screen");
                    var2.field1418 = var9;
                    var9.setResizable(false);
                    if (this.field10283) {
                        this.field10292.method3229(var2.field1421 >> 16, Integer.MIN_VALUE, var2.field1422 >>> 16, var2.field1421 & 0xFFFF, var2.field1422 & 0xFFFF, var9);
                    } else {
                        Class.forName("eha").getMethod("enter", field10311 == null ? (field10311 = method4146("java.awt.Frame")) : field10311, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field10301, var9, Integer.valueOf(var2.field1422 >>> 16), new Integer(var2.field1422 & 0xFFFF), Integer.valueOf(var2.field1421 >> 16), new Integer(var2.field1421 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field10283) {
                        this.field10292.method3228(83, (Frame) var2.field1417);
                    } else {
                        Class.forName("eha").getMethod("exit").invoke(this.field10301);
                    }
                } else if (var3 == 12) {
                    class13 var10 = method4139(field10302, (String) var2.field1417, field10299, (byte) -121);
                    var2.field1418 = var10;
                } else if (var3 == 13) {
                    class13 var20 = method4139("", (String) var2.field1417, field10299, (byte) -110);
                    var2.field1418 = var20;
                } else if (this.field10290 && var3 == 14) {
                    int var11 = var2.field1422;
                    int var12 = var2.field1421;
                    if (this.field10283) {
                        this.field10285.method1446(1, var12, var11);
                    } else {
                        Class.forName("tq").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field10295, Integer.valueOf(var11), new Integer(var12));
                    }
                } else if (this.field10290 && var3 == 15) {
                    boolean var13 = var2.field1422 != 0;
                    Component var14 = (Component) var2.field1417;
                    if (this.field10283) {
                        this.field10285.method1447(var13, var14, (byte) -104);
                    } else {
                        Class.forName("tq").getDeclaredMethod("showcursor", field10312 == null ? (field10312 = method4146("java.awt.Component")) : field10312, Boolean.TYPE).invoke(this.field10295, var14, Boolean.valueOf(var13));
                    }
                } else if (!this.field10283 && var3 == 17) {
                    Object[] var19 = (Object[]) var2.field1417;
                    Class.forName("tq").getDeclaredMethod("setcustomcursor", field10312 == null ? (field10312 = method4146("java.awt.Component")) : field10312, field10313 == null ? (field10313 = method4146("[I")) : field10313, Integer.TYPE, Integer.TYPE, field10314 == null ? (field10314 = method4146("java.awt.Point")) : field10314).invoke(this.field10295, (Component) var19[0], (int[]) var19[1], Integer.valueOf(var2.field1422), new Integer(var2.field1421), (Point) var19[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field10307.startsWith("win")) {
                            throw new Exception();
                        }
                        String var15 = (String) var2.field1417;
                        if (!var15.startsWith("http://") && !var15.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var16 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var17 = 0;
                        while (true) {
                            if (var17 >= var15.length()) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                var2.field1418 = null;
                                break;
                            }
                            if (var16.indexOf(var15.charAt(var17)) == -1) {
                                throw new Exception();
                            }
                            var17++;
                        }
                    } catch (Exception var31) {
                        var2.field1418 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field1419 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field1419 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;ZIZ)Ljt;", line = 366)
    public final class107 method4131(String arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg1) {
            this.field10285 = null;
        }
        return this.method4145(0, -93, arg2, arg3 ? 22 : 1, arg0);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Ljt;", line = 380)
    public final class107 method4132(int arg0) {
        if (arg0 < 36) {
            this.method4129(-64);
        }
        return this.method4145(0, -114, 0, 5, null);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(ILjava/lang/String;)Lvl;", line = 390)
    public static final class13 method4133(int arg0, String arg1) {
        return arg0 > -64 ? null : method4139(field10302, arg1, field10299, (byte) -106);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/net/URL;)Ljt;", line = 406)
    public final class107 method4134(int arg0, URL arg1) {
        if (arg0 >= -96) {
            this.method4143(null, false, -55);
        }
        return this.method4145(0, -102, 0, 4, arg1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 419)
    public final Object method4135(boolean arg0) {
        if (arg0) {
            field10296 = null;
        }
        return this.field10291;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Ljt;", line = 429)
    public final class107 method4136(int arg0, int arg1) {
        if (arg1 < 91) {
            this.field10290 = true;
        }
        return this.method4145(0, -77, arg0, 3, null);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 703)
    public class739(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field10300 = "1.1";
        field10302 = arg1;
        this.field10290 = arg3;
        field10304 = "Unknown";
        field10299 = arg0;
        try {
            field10304 = System.getProperty("java.vendor");
            field10300 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field10304.toLowerCase().indexOf("microsoft") != -1) {
            this.field10283 = true;
        }
        try {
            field10296 = System.getProperty("os.name");
        } catch (Exception var19) {
            field10296 = "Unknown";
        }
        field10307 = field10296.toLowerCase();
        try {
            field10298 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field10298 = "";
        }
        try {
            field10284 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field10284 = "";
        }
        try {
            field10287 = System.getProperty("user.home");
            if (field10287 != null) {
                field10287 = field10287 + "/";
            }
        } catch (Exception var16) {
        }
        if (field10287 == null) {
            field10287 = "~/";
        }
        try {
            this.field10306 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field10283) {
            try {
                field10308 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field10286 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class597.method3305(false, field10299, field10302);
        if (this.field10290) {
            this.field10293 = new class13(class597.method3303(field10299, 0, "random.dat", null), "rw", 25L);
            this.field10310 = new class13(class597.method3304("main_file_cache.dat2", 13), "rw", 209715200L);
            this.field10288 = new class13(class597.method3304("main_file_cache.idx255", 61), "rw", 1048576L);
            this.field10303 = new class13[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field10303[var5] = new class13(class597.method3304("main_file_cache.idx" + var5, -128), "rw", 1048576L);
            }
            if (this.field10283) {
                try {
                    this.field10291 = Class.forName("kl").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field10283) {
                    this.field10292 = new class575();
                } else {
                    this.field10301 = Class.forName("eha").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field10283) {
                    this.field10285 = new class240();
                } else {
                    this.field10295 = Class.forName("tq").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field10290 && !this.field10283) {
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
        this.field10289 = false;
        this.field10294 = new Thread(this);
        this.field10294.setPriority(10);
        this.field10294.setDaemon(true);
        this.field10294.start();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIII)Ljt;", line = 451)
    public final class107 method4137(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 == -21605 ? this.method4145((arg1 << 16) + arg3, arg0 + 21511, (arg2 << 16) + arg4, 6, null) : null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Ljt;", line = 464)
    public final class107 method4138(String arg0, Class arg1, int arg2, Class[] arg3) {
        if (arg2 != 0) {
            this.method4144(null, false, null);
        }
        return this.method4145(0, -66, 0, 8, new Object[] { arg1, arg0, arg3 });
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Lvl;", line = 474)
    private static final class13 method4139(String arg0, String arg1, int arg2, byte arg3) {
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field10287, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        int var6 = -102 % ((arg3 + 59) / 47);
        for (int var7 = 0; var7 < var5.length; var7++) {
            String var8 = var5[var7];
            if (var8.length() <= 0 || (new File(var8)).exists()) {
                try {
                    return new class13(new File(var8, var4), "rw", 10000L);
                } catch (Exception var10) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([ILjava/awt/Point;IBILjava/awt/Component;)Ljt;", line = 529)
    public final class107 method4140(int[] arg0, Point arg1, int arg2, byte arg3, int arg4, Component arg5) {
        if (arg3 < 56) {
            this.method4129(16);
        }
        return this.method4145(arg2, -101, arg4, 17, new Object[] { arg5, arg0, arg1 });
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljt;", line = 546)
    public final class107 method4141(String arg0, Class arg1, int arg2) {
        return arg2 == -27303 ? this.method4145(0, -72, 0, 9, new Object[] { arg1, arg0 }) : null;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 571)
    public final void method4142(int arg0) {
        synchronized (this) {
            this.field10289 = true;
            this.notifyAll();
        }
        try {
            this.field10294.join();
        } catch (InterruptedException var8) {
        }
        if (this.field10310 != null) {
            try {
                this.field10310.method51(true);
            } catch (IOException var7) {
            }
        }
        if (arg0 < 54) {
            return;
        }
        if (this.field10288 != null) {
            try {
                this.field10288.method51(true);
            } catch (IOException var6) {
            }
        }
        if (this.field10303 != null) {
            for (int var3 = 0; var3 < this.field10303.length; var3++) {
                if (this.field10303[var3] != null) {
                    try {
                        this.field10303[var3].method51(true);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field10293 != null) {
            try {
                this.field10293.method51(true);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;ZI)Ljt;", line = 630)
    public final class107 method4143(String arg0, boolean arg1, int arg2) {
        if (arg2 == 21516) {
            return arg1 ? this.method4145(0, -119, 0, 12, arg0) : this.method4145(0, arg2 - 21585, 0, 13, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([BZLjava/io/File;)Z", line = 644)
    public final boolean method4144(byte[] arg0, boolean arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return arg1;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIILjava/lang/Object;)Ljt;", line = 668)
    private final class107 method4145(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        if (arg1 > -61) {
            this.field10294 = null;
        }
        class107 var6 = new class107();
        var6.field1417 = arg4;
        var6.field1420 = arg3;
        var6.field1422 = arg2;
        var6.field1421 = arg0;
        synchronized (this) {
            if (this.field10297 == null) {
                this.field10297 = this.field10305 = var6;
            } else {
                this.field10297.field1423 = var6;
                this.field10297 = var6;
            }
            this.notify();
            return var6;
        }
    }
}
