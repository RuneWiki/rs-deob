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

@OriginalClass("client!qn")
public class class70 implements Runnable {

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "Leba;")
    private class615 field980 = null;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "Leba;")
    private class615 field983 = null;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "Z")
    private boolean field985 = false;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "Z")
    public boolean field984 = false;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "Lmea;")
    public class455 field988 = null;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
    public boolean field977 = false;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "Lmea;")
    public class455 field990 = null;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "Lmea;")
    public class455 field1000 = null;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field996;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "[Lmea;")
    public class455[] field1002;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Ljava/lang/Object;")
    private Object field981;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "Ljava/lang/Object;")
    private Object field992;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "Lsr;")
    private class266 field978;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field995;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Ljf;")
    private class228 field975;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field987;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "J")
    private static volatile long field979 = 0L;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    private static int field991;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field1003;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qn", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field1004;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qn", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field1005;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qn", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field1006;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1001;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Ljava/lang/String;")
    public static String field976;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field982;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field986;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "Ljava/lang/String;")
    private static String field989;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Ljava/lang/String;")
    private static String field997;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "Ljava/lang/String;")
    public static String field998;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "Ljava/lang/String;")
    private static String field999;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field993;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field994;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method630(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILjava/lang/Object;II)Leba;", line = 3)
    private final class615 method610(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class615 var6 = new class615();
        var6.field8322 = arg2;
        var6.field8319 = arg1;
        if (arg0 != 15463) {
            this.field985 = false;
        }
        var6.field8323 = arg3;
        var6.field8320 = arg4;
        synchronized (this) {
            if (this.field983 == null) {
                this.field983 = this.field980 = var6;
            } else {
                this.field983.field8317 = var6;
                this.field983 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Leba;", line = 33)
    public final class615 method611(int arg0, Class arg1, String arg2) {
        if (arg0 != 3551) {
            field979 = -28L;
        }
        return this.method610(15463, 0, new Object[] { arg1, arg2 }, 0, 9);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)Leba;", line = 44)
    public final class615 method612(String arg0, int arg1) {
        if (arg1 <= 29) {
            this.method623(null, 57, 75);
        }
        return this.method610(15463, 0, arg0, 0, 16);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZII)Leba;", line = 54)
    public final class615 method613(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            field976 = null;
        }
        return this.method610(15463, (arg3 << 16) + arg1, null, (arg0 << 16) + arg4, 6);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/net/URL;I)Leba;", line = 65)
    public final class615 method614(URL arg0, int arg1) {
        if (arg1 != 4159) {
            this.field987 = null;
        }
        return this.method610(arg1 ^ 0x2C58, 0, arg0, 0, 4);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)Leba;", line = 75)
    public final class615 method615(byte arg0, int arg1) {
        int var3 = -61 % ((arg0 + 73) / 36);
        return this.method610(15463, 0, null, arg1, 3);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 86)
    public final void method616(int arg0) {
        synchronized (this) {
            this.field985 = true;
            this.notifyAll();
        }
        try {
            this.field987.join();
        } catch (InterruptedException var8) {
        }
        if (this.field988 != null) {
            try {
                this.field988.method2702(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field990 != null) {
            try {
                this.field990.method2702(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field1002 != null) {
            for (int var3 = 0; var3 < this.field1002.length; var3++) {
                if (this.field1002[var3] != null) {
                    try {
                        this.field1002[var3].method2702(-1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1000 != null) {
            try {
                this.field1000.method2702(-1);
            } catch (IOException var4) {
            }
        }
        if (arg0 >= -122) {
            method627(92, -40, null, null);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/lang/String;Z)Leba;", line = 144)
    public final class615 method617(byte arg0, String arg1, boolean arg2) {
        if (arg0 < 80) {
            return null;
        } else if (arg2) {
            return this.method610(15463, 0, arg1, 0, 12);
        } else {
            return this.method610(15463, 0, arg1, 0, 13);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)Lmea;", line = 160)
    public static final class455 method618(int arg0, String arg1) {
        if (arg0 != 0) {
            method618(-19, null);
        }
        return method627(field991, arg0 ^ 0xFFFFFFA3, field989, arg1);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)Leba;", line = 170)
    public final class615 method619(int arg0) {
        return arg0 >= -112 ? null : this.method610(15463, 0, null, 0, 5);
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 703)
    public class70(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        this.field984 = arg3;
        field991 = arg0;
        field989 = arg1;
        field998 = "Unknown";
        field986 = "1.1";
        try {
            field998 = System.getProperty("java.vendor");
            field986 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field998.toLowerCase().indexOf("microsoft") != -1) {
            this.field977 = true;
        }
        try {
            field997 = System.getProperty("os.name");
        } catch (Exception var19) {
            field997 = "Unknown";
        }
        field976 = field997.toLowerCase();
        try {
            field1001 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1001 = "";
        }
        try {
            field982 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field982 = "";
        }
        try {
            field999 = System.getProperty("user.home");
            if (field999 != null) {
                field999 = field999 + "/";
            }
        } catch (Exception var16) {
        }
        if (field999 == null) {
            field999 = "~/";
        }
        try {
            this.field996 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field977) {
            try {
                field994 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field993 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class44.method344(false, field991, field989);
        if (this.field984) {
            this.field1000 = new class455(class44.method346((byte) 51, field991, null, "random.dat"), "rw", 25L);
            this.field988 = new class455(class44.method345(-98, "main_file_cache.dat2"), "rw", 314572800L);
            this.field990 = new class455(class44.method345(6, "main_file_cache.idx255"), "rw", 1048576L);
            this.field1002 = new class455[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1002[var5] = new class455(class44.method345(-115, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field977) {
                try {
                    this.field981 = Class.forName("iga").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field977) {
                    this.field978 = new class266();
                } else {
                    this.field992 = Class.forName("wca").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field977) {
                    this.field975 = new class228();
                } else {
                    this.field995 = Class.forName("iia").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field984 && !this.field977) {
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
        this.field985 = false;
        this.field987 = new Thread(this);
        this.field987.setPriority(10);
        this.field987.setDaemon(true);
        this.field987.start();
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Z", line = 189)
    public final boolean method620(byte arg0) {
        if (arg0 != -10) {
            this.field1002 = null;
        }
        if (!this.field984) {
            return false;
        } else if (this.field977) {
            return this.field978 != null;
        } else {
            return this.field992 != null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V", line = 208)
    public final void method621(byte arg0) {
        if (arg0 <= -127) {
            field979 = class302.method1910(0) + 5000L;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/awt/Frame;I)Leba;", line = 219)
    public final class615 method622(Frame arg0, int arg1) {
        if (arg1 != 0) {
            this.field978 = null;
        }
        return this.method610(15463, 0, arg0, 0, 7);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Runnable;II)Leba;", line = 231)
    public final class615 method623(Runnable arg0, int arg1, int arg2) {
        if (arg2 != -5697) {
            this.method625(null, (byte) 125, null, null);
        }
        return this.method610(arg2 ^ 0xFFFFD5D8, 0, arg0, arg1, 2);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;IIZ)Leba;", line = 243)
    public final class615 method624(String arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 < 4) {
            this.method626(null, 54, null);
        }
        return this.method610(15463, 0, arg0, arg1, arg3 ? 22 : 1);
    }

    @OriginalMember(owner = "client!qn", name = "run", descriptor = "()V", line = 253)
    public final void run() {
        while (true) {
            class615 var2;
            synchronized (this) {
                while (true) {
                    if (this.field985) {
                        return;
                    }
                    if (this.field980 != null) {
                        var2 = this.field980;
                        this.field980 = this.field980.field8317;
                        if (this.field980 == null) {
                            this.field983 = null;
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
                int var3 = var2.field8320;
                if (var3 == 1) {
                    if (class302.method1910(0) < field979) {
                        throw new IOException();
                    }
                    var2.field8318 = new Socket(InetAddress.getByName((String) var2.field8322), var2.field8323);
                } else if (var3 == 22) {
                    if (class302.method1910(0) < field979) {
                        throw new IOException();
                    }
                    try {
                        var2.field8318 = class446.method2680(1, var2.field8323, (String) var2.field8322).method758(-120);
                    } catch (class370 var29) {
                        var2.field8318 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field8322);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field8323);
                    var2.field8318 = var23;
                } else if (var3 == 4) {
                    if (field979 > class302.method1910(0)) {
                        throw new IOException();
                    }
                    var2.field8318 = new DataInputStream(((URL) var2.field8322).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field8322;
                    if (this.field984 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field8318 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field8322;
                    if (this.field984 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field8318 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field8318 = var22.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field8322;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field984) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field979 > class302.method1910(0)) {
                        throw new IOException();
                    }
                    String var21 = (var2.field8323 >> 24 & 0xFF) + "." + ((var2.field8323 & 0xFF8F76) >> 16) + "." + ((var2.field8323 & 0xFF34) >> 8) + "." + (var2.field8323 & 0xFF);
                    var2.field8318 = InetAddress.getByName(var21).getHostName();
                } else if (var3 == 21) {
                    if (field979 > class302.method1910(0)) {
                        throw new IOException();
                    }
                    var2.field8318 = InetAddress.getByName((String) var2.field8322).getAddress();
                } else if (var3 == 5) {
                    if (this.field977) {
                        var2.field8318 = this.field978.method1740(-51);
                    } else {
                        var2.field8318 = Class.forName("wca").getMethod("listmodes").invoke(this.field992);
                    }
                } else if (var3 == 6) {
                    Frame var9 = new Frame("Jagex Full Screen");
                    var2.field8318 = var9;
                    var9.setResizable(false);
                    if (this.field977) {
                        this.field978.method1742(var2.field8323 & 0xFFFF, var9, var2.field8319 >> 16, var2.field8319 & 0xFFFF, var2.field8323 >>> 16, 0);
                    } else {
                        Class.forName("wca").getMethod("enter", field1003 == null ? (field1003 = method630("java.awt.Frame")) : field1003, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field992, var9, Integer.valueOf(var2.field8323 >>> 16), new Integer(var2.field8323 & 0xFFFF), Integer.valueOf(var2.field8319 >> 16), new Integer(var2.field8319 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field977) {
                        this.field978.method1741((Frame) var2.field8322, -125);
                    } else {
                        Class.forName("wca").getMethod("exit").invoke(this.field992);
                    }
                } else if (var3 == 12) {
                    class455 var20 = method627(field991, -88, field989, (String) var2.field8322);
                    var2.field8318 = var20;
                } else if (var3 == 13) {
                    class455 var19 = method627(field991, -75, "", (String) var2.field8322);
                    var2.field8318 = var19;
                } else if (this.field984 && var3 == 14) {
                    int var17 = var2.field8323;
                    int var18 = var2.field8319;
                    if (this.field977) {
                        this.field975.method1495(118, var17, var18);
                    } else {
                        Class.forName("iia").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field995, Integer.valueOf(var17), new Integer(var18));
                    }
                } else if (this.field984 && var3 == 15) {
                    boolean var15 = var2.field8323 != 0;
                    Component var16 = (Component) var2.field8322;
                    if (this.field977) {
                        this.field975.method1496(var16, var15, 15798);
                    } else {
                        Class.forName("iia").getDeclaredMethod("showcursor", field1004 == null ? (field1004 = method630("java.awt.Component")) : field1004, Boolean.TYPE).invoke(this.field995, var16, Boolean.valueOf(var15));
                    }
                } else if (!this.field977 && var3 == 17) {
                    Object[] var10 = (Object[]) var2.field8322;
                    Class.forName("iia").getDeclaredMethod("setcustomcursor", field1004 == null ? (field1004 = method630("java.awt.Component")) : field1004, field1005 == null ? (field1005 = method630("[I")) : field1005, Integer.TYPE, Integer.TYPE, field1006 == null ? (field1006 = method630("java.awt.Point")) : field1006).invoke(this.field995, (Component) var10[0], (int[]) var10[1], Integer.valueOf(var2.field8323), new Integer(var2.field8319), (Point) var10[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field976.startsWith("win")) {
                            throw new Exception();
                        }
                        String var11 = (String) var2.field8322;
                        if (!var11.startsWith("http://") && !var11.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var13 = 0;
                        while (true) {
                            if (var13 >= var11.length()) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                var2.field8318 = null;
                                break;
                            }
                            if (var12.indexOf(var11.charAt(var13)) == -1) {
                                throw new Exception();
                            }
                            var13++;
                        }
                    } catch (Exception var31) {
                        var2.field8318 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field8321 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field8321 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Class;Ljava/lang/Class;)Leba;", line = 564)
    public final class615 method625(String arg0, byte arg1, Class[] arg2, Class arg3) {
        int var5 = 45 / ((-arg1 - 77) / 43);
        return this.method610(15463, 0, new Object[] { arg3, arg0, arg2 }, 0, 8);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([BILjava/io/File;)Z", line = 578)
    public final boolean method626(byte[] arg0, int arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg0, 0, arg0.length);
            if (arg1 != 65535) {
                this.run();
            }
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Lmea;", line = 606)
    private static final class455 method627(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 > -50) {
            method627(122, -40, null, null);
        }
        String var4;
        if (arg0 == 33) {
            var4 = "jagex_" + arg2 + "_preferences" + arg3 + "_rc.dat";
        } else if (arg0 == 34) {
            var4 = "jagex_" + arg2 + "_preferences" + arg3 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg2 + "_preferences" + arg3 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field999, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class455(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 679)
    public final Object method628(int arg0) {
        return arg0 > -121 ? null : this.field981;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ[IILjava/awt/Component;Ljava/awt/Point;)Leba;", line = 689)
    public final class615 method629(int arg0, boolean arg1, int[] arg2, int arg3, Component arg4, Point arg5) {
        if (arg1) {
            field997 = null;
        }
        return this.method610(15463, arg3, new Object[] { arg4, arg2, arg5 }, arg0, 17);
    }
}
