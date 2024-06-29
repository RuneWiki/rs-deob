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

@OriginalClass("client!ge")
public class class711 implements Runnable {

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Z")
    public boolean field10019 = false;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Ltj;")
    private class197 field10016 = null;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Z")
    public boolean field10022 = false;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Z")
    private boolean field10031 = false;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lkda;")
    public class390 field10028 = null;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Ltj;")
    private class197 field10014 = null;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Lkda;")
    public class390 field10036 = null;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Lkda;")
    public class390 field10033 = null;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field10021;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[Lkda;")
    public class390[] field10032;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Ljava/lang/Object;")
    private Object field10013;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Ljava/lang/Object;")
    private Object field10024;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lhga;")
    private class174 field10029;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Ljava/lang/Object;")
    private Object field10020;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lgi;")
    private class680 field10026;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Ljava/lang/Thread;")
    private Thread field10034;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "J")
    private static volatile long field10011 = 0L;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    private static int field10037;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field10038;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field10039;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ge", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field10040;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field10041;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Ljava/lang/String;")
    public static String field10010;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Ljava/lang/String;")
    private static String field10012;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Ljava/lang/String;")
    public static String field10015;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Ljava/lang/String;")
    private static String field10018;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Ljava/lang/String;")
    public static String field10023;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Ljava/lang/String;")
    private static String field10025;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Ljava/lang/String;")
    public static String field10027;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Ljava/lang/String;")
    public static String field10035;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10017;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10030;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z")
    public final boolean method4041(int arg0) {
        if (arg0 != -15004) {
            return true;
        } else if (!this.field10019) {
            return false;
        } else if (this.field10022) {
            return this.field10029 != null;
        } else {
            return this.field10024 != null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/io/File;[B)Z")
    public final boolean method4042(byte arg0, File arg1, byte[] arg2) {
        try {
            if (arg0 != -124) {
                this.method4052(46);
            }
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, 0, arg2.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lkda;")
    private static final class390 method4043(String arg0, String arg1, int arg2, int arg3) {
        if (arg2 <= 76) {
            return null;
        }
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field10018, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class390(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Frame;I)Ltj;")
    public final class197 method4044(Frame arg0, int arg1) {
        return arg1 < 66 ? null : this.method4051(7, 0, arg0, 1, 0);
    }

    @OriginalMember(owner = "client!ge", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class197 var2;
            synchronized (this) {
                while (true) {
                    if (this.field10031) {
                        return;
                    }
                    if (this.field10016 != null) {
                        var2 = this.field10016;
                        this.field10016 = this.field10016.field2985;
                        if (this.field10016 == null) {
                            this.field10014 = null;
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
                int var3 = var2.field2988;
                if (var3 == 1) {
                    if (field10011 > class524.method3075(18)) {
                        throw new IOException();
                    }
                    var2.field2990 = new Socket(InetAddress.getByName((String) var2.field2984), var2.field2987);
                } else if (var3 == 22) {
                    if (field10011 > class524.method3075(18)) {
                        throw new IOException();
                    }
                    try {
                        var2.field2990 = class461.method2811((String) var2.field2984, -25, var2.field2987).method1710(41);
                    } catch (class263 var29) {
                        var2.field2990 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var22 = new Thread((Runnable) var2.field2984);
                    var22.setDaemon(true);
                    var22.start();
                    var22.setPriority(var2.field2987);
                    var2.field2990 = var22;
                } else if (var3 == 4) {
                    if (field10011 > class524.method3075(18)) {
                        throw new IOException();
                    }
                    var2.field2990 = new DataInputStream(((URL) var2.field2984).openStream());
                } else if (var3 == 8) {
                    Object[] var21 = (Object[]) var2.field2984;
                    if (this.field10019 && ((Class) var21[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2990 = ((Class) var21[0]).getDeclaredMethod((String) var21[1], (Class[]) var21[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2984;
                    if (this.field10019 && ((Class) var4[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2990 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2990 = var5.getContents(null);
                } else if (var3 == 19) {
                    Transferable var19 = (Transferable) var2.field2984;
                    Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var20.setContents(var19, null);
                } else if (!this.field10019) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field10011 > class524.method3075(18)) {
                        throw new IOException();
                    }
                    String var6 = (var2.field2987 >> 24 & 0xFF) + "." + (var2.field2987 >> 16 & 0xFF) + "." + (var2.field2987 >> 8 & 0xFF) + "." + (var2.field2987 & 0xFF);
                    var2.field2990 = InetAddress.getByName(var6).getHostName();
                } else if (var3 == 21) {
                    if (class524.method3075(18) < field10011) {
                        throw new IOException();
                    }
                    var2.field2990 = InetAddress.getByName((String) var2.field2984).getAddress();
                } else if (var3 == 5) {
                    if (this.field10022) {
                        var2.field2990 = this.field10029.method1240((byte) 127);
                    } else {
                        var2.field2990 = Class.forName("lda").getMethod("listmodes").invoke(this.field10024);
                    }
                } else if (var3 == 6) {
                    Frame var18 = new Frame("Jagex Full Screen");
                    var2.field2990 = var18;
                    var18.setResizable(false);
                    if (this.field10022) {
                        this.field10029.method1239(var2.field2989 & 0xFFFF, var2.field2987 >>> 16, var18, var2.field2987 & 0xFFFF, false, var2.field2989 >> 16);
                    } else {
                        Class.forName("lda").getMethod("enter", field10041 == null ? (field10041 = method4061("java.awt.Frame")) : field10041, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field10024, var18, Integer.valueOf(var2.field2987 >>> 16), new Integer(var2.field2987 & 0xFFFF), Integer.valueOf(var2.field2989 >> 16), new Integer(var2.field2989 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field10022) {
                        this.field10029.method1238((Frame) var2.field2984, (byte) -48);
                    } else {
                        Class.forName("lda").getMethod("exit").invoke(this.field10024);
                    }
                } else if (var3 == 12) {
                    class390 var7 = method4043(field10012, (String) var2.field2984, 93, field10037);
                    var2.field2990 = var7;
                } else if (var3 == 13) {
                    class390 var8 = method4043("", (String) var2.field2984, 103, field10037);
                    var2.field2990 = var8;
                } else if (this.field10019 && var3 == 14) {
                    int var16 = var2.field2987;
                    int var17 = var2.field2989;
                    if (this.field10022) {
                        this.field10026.method3898(var16, 28937, var17);
                    } else {
                        Class.forName("hr").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field10020, Integer.valueOf(var16), new Integer(var17));
                    }
                } else if (this.field10019 && var3 == 15) {
                    boolean var14 = var2.field2987 != 0;
                    Component var15 = (Component) var2.field2984;
                    if (this.field10022) {
                        this.field10026.method3899(var15, var14, -30729);
                    } else {
                        Class.forName("hr").getDeclaredMethod("showcursor", field10038 == null ? (field10038 = method4061("java.awt.Component")) : field10038, Boolean.TYPE).invoke(this.field10020, var15, Boolean.valueOf(var14));
                    }
                } else if (!this.field10022 && var3 == 17) {
                    Object[] var13 = (Object[]) var2.field2984;
                    Class.forName("hr").getDeclaredMethod("setcustomcursor", field10038 == null ? (field10038 = method4061("java.awt.Component")) : field10038, field10039 == null ? (field10039 = method4061("[I")) : field10039, Integer.TYPE, Integer.TYPE, field10040 == null ? (field10040 = method4061("java.awt.Point")) : field10040).invoke(this.field10020, (Component) var13[0], (int[]) var13[1], Integer.valueOf(var2.field2987), new Integer(var2.field2989), (Point) var13[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field10015.startsWith("win")) {
                            throw new Exception();
                        }
                        String var9 = (String) var2.field2984;
                        if (!var9.startsWith("http://") && !var9.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var11 = 0;
                        while (true) {
                            if (var9.length() <= var11) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var9 + "\"");
                                var2.field2990 = null;
                                break;
                            }
                            if (var10.indexOf(var9.charAt(var11)) == -1) {
                                throw new Exception();
                            }
                            var11++;
                        }
                    } catch (Exception var31) {
                        var2.field2990 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field2986 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field2986 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Ltj;")
    public final class197 method4045(int arg0, Class arg1, String arg2) {
        int var4 = -76 % ((37 - arg0) / 33);
        return this.method4051(9, 0, new Object[] { arg1, arg2 }, 1, 0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/String;)Lkda;")
    public static final class390 method4046(int arg0, String arg1) {
        if (arg0 >= -23) {
            method4043(null, null, 104, -112);
        }
        return method4043(field10012, arg1, 84, field10037);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/String;ZI)Ltj;")
    public final class197 method4047(int arg0, String arg1, boolean arg2, int arg3) {
        return arg0 == 65535 ? this.method4051(arg2 ? 22 : 1, 0, arg1, 1, arg3) : null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Ltj;")
    public final class197 method4048(byte arg0, int arg1) {
        if (arg0 != -116) {
            this.field10029 = null;
        }
        return this.method4051(3, 0, null, 1, arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBIII)Ltj;")
    public final class197 method4049(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 7) {
            this.field10024 = null;
        }
        return this.method4051(6, (arg4 << 16) + arg0, null, 1, (arg3 << 16) + arg2);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method4050(int arg0) {
        if (arg0 != 16879) {
            this.method4051(85, 55, null, 121, 79);
        }
        return this.field10013;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILjava/lang/Object;II)Ltj;")
    private final class197 method4051(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class197 var6 = new class197();
        var6.field2987 = arg4;
        var6.field2988 = arg0;
        var6.field2989 = arg1;
        var6.field2984 = arg2;
        synchronized (this) {
            if (arg3 != 1) {
                field10018 = null;
            }
            if (this.field10014 == null) {
                this.field10014 = this.field10016 = var6;
            } else {
                this.field10014.field2985 = var6;
                this.field10014 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public final void method4052(int arg0) {
        field10011 = class524.method3075(18) + 5000L;
        if (arg0 < 58) {
            this.method4052(-111);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;I)Ltj;")
    public final class197 method4053(Component arg0, int[] arg1, int arg2, int arg3, Point arg4, int arg5) {
        if (arg2 != 25015) {
            this.field10021 = null;
        }
        return this.method4051(17, arg5, new Object[] { arg0, arg1, arg4 }, 1, arg3);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Ltj;")
    public final class197 method4054(byte arg0) {
        return arg0 > -50 ? null : this.method4051(5, 0, null, 1, 0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/net/URL;B)Ltj;")
    public final class197 method4055(URL arg0, byte arg1) {
        if (arg1 != 37) {
            field10027 = null;
        }
        return this.method4051(4, 0, arg0, 1, 0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ltj;")
    public final class197 method4056(Runnable arg0, int arg1, int arg2) {
        if (arg1 < 52) {
            this.method4041(72);
        }
        return this.method4051(2, 0, arg0, 1, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Ltj;")
    public final class197 method4057(Class[] arg0, String arg1, Class arg2, int arg3) {
        if (arg3 != 0) {
            this.method4054((byte) 84);
        }
        return this.method4051(8, 0, new Object[] { arg2, arg1, arg0 }, 1, 0);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
    public final void method4058(int arg0) {
        synchronized (this) {
            this.field10031 = true;
            this.notifyAll();
        }
        try {
            this.field10034.join();
        } catch (InterruptedException var9) {
        }
        if (this.field10028 != null) {
            try {
                this.field10028.method2504(115);
            } catch (IOException var8) {
            }
        }
        if (this.field10036 != null) {
            try {
                this.field10036.method2504(-80);
            } catch (IOException var7) {
            }
        }
        if (this.field10032 != null) {
            for (int var3 = 0; var3 < this.field10032.length; var3++) {
                if (this.field10032[var3] != null) {
                    try {
                        this.field10032[var3].method2504(107);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        int var4 = -93 % ((arg0 - 61) / 35);
        if (this.field10033 != null) {
            try {
                this.field10033.method2504(-121);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/lang/String;)Ltj;")
    public final class197 method4059(byte arg0, String arg1) {
        if (arg0 != 88) {
            this.method4049(122, (byte) 82, 1, 5, 91);
        }
        return this.method4051(16, 0, arg1, 1, 0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;ZB)Ltj;")
    public final class197 method4060(String arg0, boolean arg1, byte arg2) {
        if (arg2 < 28) {
            this.method4052(-124);
        }
        return arg1 ? this.method4051(12, 0, arg0, 1, 0) : this.method4051(13, 0, arg0, 1, 0);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class711(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field10037 = arg0;
        this.field10019 = arg3;
        field10012 = arg1;
        field10023 = "Unknown";
        field10035 = "1.1";
        try {
            field10023 = System.getProperty("java.vendor");
            field10035 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field10023.toLowerCase().indexOf("microsoft") != -1) {
            this.field10022 = true;
        }
        try {
            field10025 = System.getProperty("os.name");
        } catch (Exception var19) {
            field10025 = "Unknown";
        }
        field10015 = field10025.toLowerCase();
        try {
            field10010 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field10010 = "";
        }
        try {
            field10027 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field10027 = "";
        }
        try {
            field10018 = System.getProperty("user.home");
            if (field10018 != null) {
                field10018 = field10018 + "/";
            }
        } catch (Exception var16) {
        }
        if (field10018 == null) {
            field10018 = "~/";
        }
        try {
            this.field10021 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field10022) {
            try {
                field10017 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field10030 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class5.method34(field10012, field10037, (byte) -14);
        if (this.field10019) {
            this.field10033 = new class390(class5.method32("random.dat", null, field10037, (byte) 59), "rw", 25L);
            this.field10028 = new class390(class5.method33("main_file_cache.dat2", 7375), "rw", 209715200L);
            this.field10036 = new class390(class5.method33("main_file_cache.idx255", 7375), "rw", 1048576L);
            this.field10032 = new class390[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field10032[var5] = new class390(class5.method33("main_file_cache.idx" + var5, 7375), "rw", 1048576L);
            }
            if (this.field10022) {
                try {
                    this.field10013 = Class.forName("gv").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field10022) {
                    this.field10029 = new class174();
                } else {
                    this.field10024 = Class.forName("lda").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field10022) {
                    this.field10026 = new class680();
                } else {
                    this.field10020 = Class.forName("hr").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field10019 && !this.field10022) {
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
        this.field10031 = false;
        this.field10034 = new Thread(this);
        this.field10034.setPriority(10);
        this.field10034.setDaemon(true);
        this.field10034.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4061(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
