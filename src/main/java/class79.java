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

@OriginalClass("client!tt")
public class class79 implements Runnable {

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Loaa;")
    private class260 field1081 = null;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "Z")
    public boolean field1084 = false;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Loaa;")
    private class260 field1085 = null;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "Z")
    private boolean field1078 = false;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "Lfn;")
    public class124 field1094 = null;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "Lfn;")
    public class124 field1086 = null;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Lfn;")
    public class124 field1073 = null;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "Z")
    public boolean field1090 = false;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1076;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "[Lfn;")
    public class124[] field1080;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field1092;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "Ljava/lang/Object;")
    private Object field1074;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Lcba;")
    private class505 field1079;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "Lbq;")
    private class262 field1083;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Ljava/lang/Object;")
    private Object field1077;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field1088;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "J")
    private static volatile long field1097 = 0L;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    private static int field1075;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field1101;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field1102;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field1103;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field1104;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1082;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1087;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "Ljava/lang/String;")
    private static String field1091;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1093;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1095;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1096;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "Ljava/lang/String;")
    private static String field1099;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "Ljava/lang/String;")
    private static String field1100;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1089;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1098;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method632(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Loaa;", line = 10)
    private final class260 method612(Object arg0, int arg1, int arg2, byte arg3, int arg4) {
        class260 var6 = new class260();
        var6.field3704 = arg0;
        var6.field3707 = arg2;
        var6.field3701 = arg1;
        if (arg3 != 49) {
            this.field1083 = null;
        }
        var6.field3703 = arg4;
        synchronized (this) {
            if (this.field1081 == null) {
                this.field1081 = this.field1085 = var6;
            } else {
                this.field1081.field3705 = var6;
                this.field1081 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)Loaa;", line = 48)
    public final class260 method613(int arg0, int arg1) {
        if (arg1 != 7324) {
            this.method630(null, 58);
        }
        return this.method612(null, arg0, 3, (byte) 49, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Loaa;", line = 59)
    public final class260 method614(byte arg0, String arg1, Class arg2) {
        if (arg0 > -82) {
            field1089 = null;
        }
        return this.method612(new Object[] { arg2, arg1 }, 0, 9, (byte) 49, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/awt/Frame;I)Loaa;", line = 69)
    public final class260 method615(Frame arg0, int arg1) {
        if (arg1 != 27237) {
            field1095 = null;
        }
        return this.method612(arg0, 0, 7, (byte) 49, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;BIZ)Loaa;", line = 80)
    public final class260 method616(String arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 != -123) {
            field1093 = null;
        }
        return this.method612(arg0, arg2, arg3 ? 22 : 1, (byte) 49, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 96)
    public final void method617(int arg0) {
        synchronized (this) {
            this.field1078 = true;
            this.notifyAll();
        }
        try {
            this.field1088.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1094 != null) {
            try {
                this.field1094.method886(true);
            } catch (IOException var7) {
            }
        }
        if (this.field1073 != null) {
            try {
                this.field1073.method886(true);
            } catch (IOException var6) {
            }
        }
        if (this.field1080 != null) {
            for (int var3 = 0; var3 < this.field1080.length; var3++) {
                if (this.field1080[var3] != null) {
                    try {
                        this.field1080[var3].method886(true);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 > -61) {
            this.method615(null, -91);
        }
        if (this.field1086 != null) {
            try {
                this.field1086.method886(true);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 154)
    public final void method618(int arg0) {
        field1097 = class680.method3756(-46) + 5000L;
        if (arg0 < 41) {
            this.field1090 = true;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 703)
    public class79(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field1096 = "1.1";
        field1091 = arg1;
        field1075 = arg0;
        field1093 = "Unknown";
        this.field1084 = arg3;
        try {
            field1093 = System.getProperty("java.vendor");
            field1096 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field1093.toLowerCase().indexOf("microsoft") != -1) {
            this.field1090 = true;
        }
        try {
            field1100 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1100 = "Unknown";
        }
        field1095 = field1100.toLowerCase();
        try {
            field1087 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1087 = "";
        }
        try {
            field1082 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field1082 = "";
        }
        try {
            field1099 = System.getProperty("user.home");
            if (field1099 != null) {
                field1099 = field1099 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1099 == null) {
            field1099 = "~/";
        }
        try {
            this.field1076 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field1090) {
            try {
                field1089 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field1098 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class510.method2835(field1075, field1091, (byte) -83);
        if (this.field1084) {
            this.field1086 = new class124(class510.method2836(null, field1075, "random.dat", true), "rw", 25L);
            this.field1094 = new class124(class510.method2837("main_file_cache.dat2", 127), "rw", 209715200L);
            this.field1073 = new class124(class510.method2837("main_file_cache.idx255", 126), "rw", 1048576L);
            this.field1080 = new class124[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1080[var5] = new class124(class510.method2837("main_file_cache.idx" + var5, 112), "rw", 1048576L);
            }
            if (this.field1090) {
                try {
                    this.field1092 = Class.forName("mo").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field1090) {
                    this.field1079 = new class505();
                } else {
                    this.field1074 = Class.forName("kd").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field1090) {
                    this.field1083 = new class262();
                } else {
                    this.field1077 = Class.forName("hf").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field1084 && !this.field1090) {
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
        this.field1078 = false;
        this.field1088 = new Thread(this);
        this.field1088.setPriority(10);
        this.field1088.setDaemon(true);
        this.field1088.start();
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)Loaa;", line = 167)
    public final class260 method619(int arg0) {
        if (arg0 != 30795) {
            this.method617(70);
        }
        return this.method612(null, 0, 5, (byte) 49, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BIIII)Loaa;", line = 179)
    public final class260 method620(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -48) {
            this.field1079 = null;
        }
        return this.method612(null, (arg3 << 16) + arg2, 6, (byte) 49, (arg1 << 16) + arg4);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)Lfn;", line = 191)
    private static final class124 method621(boolean arg0, int arg1, String arg2, String arg3) {
        String var4;
        if (arg1 == 33) {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg1 == 34) {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + ".dat";
        }
        if (arg0) {
            method621(false, 25, null, null);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field1099, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class124(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Class;)Loaa;", line = 234)
    public final class260 method622(Class[] arg0, String arg1, byte arg2, Class arg3) {
        int var5 = -22 / ((arg2 - 49) / 36);
        return this.method612(new Object[] { arg3, arg1, arg0 }, 0, 8, (byte) 49, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I[IBLjava/awt/Component;ILjava/awt/Point;)Loaa;", line = 245)
    public final class260 method623(int arg0, int[] arg1, byte arg2, Component arg3, int arg4, Point arg5) {
        return arg2 == 78 ? this.method612(new Object[] { arg3, arg1, arg5 }, arg4, 17, (byte) 49, arg0) : null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;Z)Lfn;", line = 260)
    public static final class124 method624(String arg0, boolean arg1) {
        return arg1 ? null : method621(arg1, field1075, arg0, field1091);
    }

    @OriginalMember(owner = "client!tt", name = "run", descriptor = "()V", line = 270)
    public final void run() {
        while (true) {
            class260 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1078) {
                        return;
                    }
                    if (this.field1085 != null) {
                        var2 = this.field1085;
                        this.field1085 = this.field1085.field3705;
                        if (this.field1085 == null) {
                            this.field1081 = null;
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
                int var3 = var2.field3707;
                if (var3 == 1) {
                    if (field1097 > class680.method3756(-49)) {
                        throw new IOException();
                    }
                    var2.field3706 = new Socket(InetAddress.getByName((String) var2.field3704), var2.field3701);
                } else if (var3 == 22) {
                    if (field1097 > class680.method3756(-69)) {
                        throw new IOException();
                    }
                    try {
                        var2.field3706 = class182.method1229((String) var2.field3704, 100, var2.field3701).method1408(0);
                    } catch (class83 var29) {
                        var2.field3706 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field3704);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field3701);
                    var2.field3706 = var5;
                } else if (var3 == 4) {
                    if (class680.method3756(-56) < field1097) {
                        throw new IOException();
                    }
                    var2.field3706 = new DataInputStream(((URL) var2.field3704).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field3704;
                    if (this.field1084 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3706 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var23 = (Object[]) var2.field3704;
                    if (this.field1084 && ((Class) var23[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3706 = ((Class) var23[0]).getDeclaredField((String) var23[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3706 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var8 = (Transferable) var2.field3704;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, null);
                } else if (!this.field1084) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class680.method3756(-124) < field1097) {
                        throw new IOException();
                    }
                    String var10 = (var2.field3701 >> 24 & 0xFF) + "." + ((var2.field3701 & 0xFFC0AE) >> 16) + "." + (var2.field3701 >> 8 & 0xFF) + "." + (var2.field3701 & 0xFF);
                    var2.field3706 = InetAddress.getByName(var10).getHostName();
                } else if (var3 == 21) {
                    if (class680.method3756(-30) < field1097) {
                        throw new IOException();
                    }
                    var2.field3706 = InetAddress.getByName((String) var2.field3704).getAddress();
                } else if (var3 == 5) {
                    if (this.field1090) {
                        var2.field3706 = this.field1079.method2816(0);
                    } else {
                        var2.field3706 = Class.forName("kd").getMethod("listmodes").invoke(this.field1074);
                    }
                } else if (var3 == 6) {
                    Frame var22 = new Frame("Jagex Full Screen");
                    var2.field3706 = var22;
                    var22.setResizable(false);
                    if (this.field1090) {
                        this.field1079.method2815(var2.field3703 & 0xFFFF, var2.field3701 & 0xFFFF, var22, var2.field3703 >> 16, (byte) 109, var2.field3701 >>> 16);
                    } else {
                        Class.forName("kd").getMethod("enter", field1104 == null ? (field1104 = method632("java.awt.Frame")) : field1104, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field1074, var22, Integer.valueOf(var2.field3701 >>> 16), new Integer(var2.field3701 & 0xFFFF), Integer.valueOf(var2.field3703 >> 16), new Integer(var2.field3703 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field1090) {
                        this.field1079.method2817((Frame) var2.field3704, 109);
                    } else {
                        Class.forName("kd").getMethod("exit").invoke(this.field1074);
                    }
                } else if (var3 == 12) {
                    class124 var21 = method621(false, field1075, (String) var2.field3704, field1091);
                    var2.field3706 = var21;
                } else if (var3 == 13) {
                    class124 var20 = method621(false, field1075, (String) var2.field3704, "");
                    var2.field3706 = var20;
                } else if (this.field1084 && var3 == 14) {
                    int var18 = var2.field3701;
                    int var19 = var2.field3703;
                    if (this.field1090) {
                        this.field1083.method1601(var19, var18, (byte) 56);
                    } else {
                        Class.forName("hf").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field1077, Integer.valueOf(var18), new Integer(var19));
                    }
                } else if (this.field1084 && var3 == 15) {
                    boolean var16 = var2.field3701 != 0;
                    Component var17 = (Component) var2.field3704;
                    if (this.field1090) {
                        this.field1083.method1600(var17, var16, false);
                    } else {
                        Class.forName("hf").getDeclaredMethod("showcursor", field1101 == null ? (field1101 = method632("java.awt.Component")) : field1101, Boolean.TYPE).invoke(this.field1077, var17, Boolean.valueOf(var16));
                    }
                } else if (!this.field1090 && var3 == 17) {
                    Object[] var11 = (Object[]) var2.field3704;
                    Class.forName("hf").getDeclaredMethod("setcustomcursor", field1101 == null ? (field1101 = method632("java.awt.Component")) : field1101, field1102 == null ? (field1102 = method632("[I")) : field1102, Integer.TYPE, Integer.TYPE, field1103 == null ? (field1103 = method632("java.awt.Point")) : field1103).invoke(this.field1077, (Component) var11[0], (int[]) var11[1], Integer.valueOf(var2.field3701), new Integer(var2.field3703), (Point) var11[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field1095.startsWith("win")) {
                            throw new Exception();
                        }
                        String var12 = (String) var2.field3704;
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
                        var2.field3706 = null;
                    } catch (Exception var31) {
                        var2.field3706 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field3702 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field3702 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/lang/Runnable;B)Loaa;", line = 570)
    public final class260 method625(int arg0, Runnable arg1, byte arg2) {
        if (arg2 != -94) {
            field1075 = -2;
        }
        return this.method612(arg1, arg0, 2, (byte) 49, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 583)
    public final Object method626(byte arg0) {
        return arg0 == -7 ? this.field1092 : null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([BILjava/io/File;)Z", line = 603)
    public final boolean method627(byte[] arg0, int arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            if (arg1 < 35) {
                this.method630(null, -49);
            }
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/lang/String;Z)Loaa;", line = 624)
    public final class260 method628(int arg0, String arg1, boolean arg2) {
        if (arg0 == 14) {
            return arg2 ? this.method612(arg1, 0, 12, (byte) 49, 0) : this.method612(arg1, 0, 13, (byte) 49, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/net/URL;)Loaa;", line = 654)
    public final class260 method629(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.method615(null, 52);
        }
        return this.method612(arg1, 0, 4, (byte) 49, 0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;I)Loaa;", line = 668)
    public final class260 method630(String arg0, int arg1) {
        if (arg1 != 21) {
            field1093 = null;
        }
        return this.method612(arg0, 0, 16, (byte) 49, 0);
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)Z", line = 679)
    public final boolean method631(int arg0) {
        if (!this.field1084) {
            return false;
        } else if (arg0 != 5631) {
            return false;
        } else if (this.field1090) {
            return this.field1079 != null;
        } else {
            return this.field1074 != null;
        }
    }
}
