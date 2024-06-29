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

@OriginalClass("client!vk")
public class class367 implements Runnable {

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Z")
    private boolean field5125 = false;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lbt;")
    public class42 field5118 = null;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "Z")
    public boolean field5130 = false;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Lav;")
    private class637 field5124 = null;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "Lbt;")
    public class42 field5139 = null;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "Lbt;")
    public class42 field5138 = null;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "Lav;")
    private class637 field5135 = null;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "Z")
    public boolean field5141 = false;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5132;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "[Lbt;")
    public class42[] field5131;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Ljava/lang/Object;")
    private Object field5119;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Leba;")
    private class585 field5120;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field5137;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "Lnn;")
    private class413 field5133;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Ljava/lang/Object;")
    private Object field5123;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field5128;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "J")
    private static volatile long field5140 = 0L;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    private static int field5116;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vk", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field5142;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vk", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field5143;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vk", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field5144;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vk", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field5145;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5114;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/lang/String;")
    private static String field5115;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Ljava/lang/String;")
    private static String field5121;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5126;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5127;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5129;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "Ljava/lang/String;")
    private static String field5134;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "Ljava/lang/String;")
    public static String field5136;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5117;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5122;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2296(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method2276(byte arg0) {
        return arg0 <= 121 ? null : this.field5119;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZLjava/lang/String;)Lav;", line = 20)
    public final class637 method2277(boolean arg0, boolean arg1, String arg2) {
        if (!arg0) {
            this.method2278(false);
        }
        return arg1 ? this.method2292(0, 0, 12, arg2, (byte) 93) : this.method2292(0, 0, 13, arg2, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 35)
    public final void method2278(boolean arg0) {
        synchronized (this) {
            this.field5125 = arg0;
            this.notifyAll();
        }
        try {
            this.field5128.join();
        } catch (InterruptedException var8) {
        }
        if (this.field5118 != null) {
            try {
                this.field5118.method389(31);
            } catch (IOException var7) {
            }
        }
        if (this.field5139 != null) {
            try {
                this.field5139.method389(31);
            } catch (IOException var6) {
            }
        }
        if (this.field5131 != null) {
            for (int var3 = 0; var3 < this.field5131.length; var3++) {
                if (this.field5131[var3] != null) {
                    try {
                        this.field5131[var3].method389(31);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field5138 != null) {
            try {
                this.field5138.method389(31);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/awt/Frame;B)Lav;", line = 103)
    public final class637 method2279(Frame arg0, byte arg1) {
        if (arg1 <= 18) {
            this.method2284(null, -33, null, null);
        }
        return this.method2292(0, 0, 7, arg0, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "run", descriptor = "()V", line = 115)
    public final void run() {
        while (true) {
            class637 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5125) {
                        return;
                    }
                    if (this.field5124 != null) {
                        var2 = this.field5124;
                        this.field5124 = this.field5124.field9092;
                        if (this.field5124 == null) {
                            this.field5135 = null;
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
                int var3 = var2.field9087;
                if (var3 == 1) {
                    if (class742.method4128(1) < field5140) {
                        throw new IOException();
                    }
                    var2.field9093 = new Socket(InetAddress.getByName((String) var2.field9088), var2.field9089);
                } else if (var3 == 22) {
                    if (class742.method4128(1) < field5140) {
                        throw new IOException();
                    }
                    try {
                        var2.field9093 = class327.method2089((String) var2.field9088, var2.field9089, (byte) -72).method2274((byte) -40);
                    } catch (class275 var29) {
                        var2.field9093 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field9088);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field9089);
                    var2.field9093 = var4;
                } else if (var3 == 4) {
                    if (field5140 > class742.method4128(1)) {
                        throw new IOException();
                    }
                    var2.field9093 = new DataInputStream(((URL) var2.field9088).openStream());
                } else if (var3 == 8) {
                    Object[] var22 = (Object[]) var2.field9088;
                    if (this.field5141 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field9093 = ((Class) var22[0]).getDeclaredMethod((String) var22[1], (Class[]) var22[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field9088;
                    if (this.field5141 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field9093 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field9093 = var21.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field9088;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else if (!this.field5141) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field5140 > class742.method4128(1)) {
                        throw new IOException();
                    }
                    String var20 = (var2.field9089 >> 24 & 0xFF) + "." + (var2.field9089 >> 16 & 0xFF) + "." + (var2.field9089 >> 8 & 0xFF) + "." + (var2.field9089 & 0xFF);
                    var2.field9093 = InetAddress.getByName(var20).getHostName();
                } else if (var3 == 21) {
                    if (class742.method4128(1) < field5140) {
                        throw new IOException();
                    }
                    var2.field9093 = InetAddress.getByName((String) var2.field9088).getAddress();
                } else if (var3 == 5) {
                    if (this.field5130) {
                        var2.field9093 = this.field5120.method3379(118);
                    } else {
                        var2.field9093 = Class.forName("gaa").getMethod("listmodes").invoke(this.field5137);
                    }
                } else if (var3 == 6) {
                    Frame var19 = new Frame("Jagex Full Screen");
                    var2.field9093 = var19;
                    var19.setResizable(false);
                    if (this.field5130) {
                        this.field5120.method3377(var2.field9090 >> 16, 4, var2.field9089 & 0xFFFF, var2.field9089 >>> 16, var2.field9090 & 0xFFFF, var19);
                    } else {
                        Class.forName("gaa").getMethod("enter", field5145 == null ? (field5145 = method2296("java.awt.Frame")) : field5145, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field5137, var19, Integer.valueOf(var2.field9089 >>> 16), new Integer(var2.field9089 & 0xFFFF), Integer.valueOf(var2.field9090 >> 16), new Integer(var2.field9090 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field5130) {
                        this.field5120.method3378((Frame) var2.field9088, 8);
                    } else {
                        Class.forName("gaa").getMethod("exit").invoke(this.field5137);
                    }
                } else if (var3 == 12) {
                    class42 var18 = method2286((String) var2.field9088, field5134, field5116, -27031);
                    var2.field9093 = var18;
                } else if (var3 == 13) {
                    class42 var17 = method2286((String) var2.field9088, "", field5116, -27031);
                    var2.field9093 = var17;
                } else if (this.field5141 && var3 == 14) {
                    int var8 = var2.field9089;
                    int var9 = var2.field9090;
                    if (this.field5130) {
                        this.field5133.method2509(-20066, var9, var8);
                    } else {
                        Class.forName("ta").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field5123, Integer.valueOf(var8), new Integer(var9));
                    }
                } else if (this.field5141 && var3 == 15) {
                    boolean var10 = var2.field9089 != 0;
                    Component var11 = (Component) var2.field9088;
                    if (this.field5130) {
                        this.field5133.method2508(var11, var10, 0);
                    } else {
                        Class.forName("ta").getDeclaredMethod("showcursor", field5142 == null ? (field5142 = method2296("java.awt.Component")) : field5142, Boolean.TYPE).invoke(this.field5123, var11, Boolean.valueOf(var10));
                    }
                } else if (!this.field5130 && var3 == 17) {
                    Object[] var16 = (Object[]) var2.field9088;
                    Class.forName("ta").getDeclaredMethod("setcustomcursor", field5142 == null ? (field5142 = method2296("java.awt.Component")) : field5142, field5143 == null ? (field5143 = method2296("[I")) : field5143, Integer.TYPE, Integer.TYPE, field5144 == null ? (field5144 = method2296("java.awt.Point")) : field5144).invoke(this.field5123, (Component) var16[0], (int[]) var16[1], Integer.valueOf(var2.field9089), new Integer(var2.field9090), (Point) var16[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field5136.startsWith("win")) {
                            throw new Exception();
                        }
                        String var12 = (String) var2.field9088;
                        if (!var12.startsWith("http://") && !var12.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var14 = 0;
                        while (true) {
                            if (var12.length() <= var14) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                var2.field9093 = null;
                                break;
                            }
                            if (var13.indexOf(var12.charAt(var14)) == -1) {
                                throw new Exception();
                            }
                            var14++;
                        }
                    } catch (Exception var31) {
                        var2.field9093 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field9091 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field9091 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 688)
    public class367(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field5116 = arg0;
        field5134 = arg1;
        field5127 = "Unknown";
        field5129 = "1.1";
        this.field5141 = arg3;
        try {
            field5127 = System.getProperty("java.vendor");
            field5129 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field5127.toLowerCase().indexOf("microsoft") != -1) {
            this.field5130 = true;
        }
        try {
            field5115 = System.getProperty("os.name");
        } catch (Exception var19) {
            field5115 = "Unknown";
        }
        field5136 = field5115.toLowerCase();
        try {
            field5114 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field5114 = "";
        }
        try {
            field5126 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field5126 = "";
        }
        try {
            field5121 = System.getProperty("user.home");
            if (field5121 != null) {
                field5121 = field5121 + "/";
            }
        } catch (Exception var16) {
        }
        if (field5121 == null) {
            field5121 = "~/";
        }
        try {
            this.field5132 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field5130) {
            try {
                field5117 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field5122 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class553.method3240(0, field5134, field5116);
        if (this.field5141) {
            this.field5138 = new class42(class553.method3241(field5116, (byte) 94, null, "random.dat"), "rw", 25L);
            this.field5118 = new class42(class553.method3242((byte) 97, "main_file_cache.dat2"), "rw", 209715200L);
            this.field5139 = new class42(class553.method3242((byte) 82, "main_file_cache.idx255"), "rw", 1048576L);
            this.field5131 = new class42[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field5131[var5] = new class42(class553.method3242((byte) 117, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field5130) {
                try {
                    this.field5119 = Class.forName("ui").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field5130) {
                    this.field5120 = new class585();
                } else {
                    this.field5137 = Class.forName("gaa").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field5130) {
                    this.field5133 = new class413();
                } else {
                    this.field5123 = Class.forName("ta").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field5141 && !this.field5130) {
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
        this.field5125 = false;
        this.field5128 = new Thread(this);
        this.field5128.setPriority(10);
        this.field5128.setDaemon(true);
        this.field5128.start();
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZBLjava/lang/String;I)Lav;", line = 419)
    public final class637 method2280(boolean arg0, byte arg1, String arg2, int arg3) {
        if (arg1 >= -20) {
            this.field5141 = false;
        }
        return this.method2292(arg3, 0, arg0 ? 22 : 1, arg2, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BILjava/io/File;)Z", line = 429)
    public final boolean method2281(byte[] arg0, int arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            if (arg1 < 39) {
                this.field5139 = null;
            }
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)Lav;", line = 453)
    public final class637 method2282(boolean arg0) {
        if (!arg0) {
            this.method2289((byte) -6);
        }
        return this.method2292(0, 0, 5, null, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 464)
    public final void method2283(int arg0) {
        if (arg0 > 4) {
            field5140 = class742.method4128(1) + 5000L;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lav;", line = 479)
    public final class637 method2284(Class arg0, int arg1, String arg2, Class[] arg3) {
        int var5 = -106 % ((14 - arg1) / 52);
        return this.method2292(0, 0, 8, new Object[] { arg0, arg2, arg3 }, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)Lav;", line = 489)
    public final class637 method2285(int arg0, byte arg1) {
        return arg1 >= -57 ? null : this.method2292(arg0, 0, 3, null, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lbt;", line = 502)
    private static final class42 method2286(String arg0, String arg1, int arg2, int arg3) {
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
        }
        if (arg3 != -27031) {
            method2287(false, null);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field5121, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class42(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLjava/lang/String;)Lbt;", line = 545)
    public static final class42 method2287(boolean arg0, String arg1) {
        if (!arg0) {
            method2287(false, null);
        }
        return method2286(arg1, field5134, field5116, -27031);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/lang/String;)Lav;", line = 561)
    public final class637 method2288(int arg0, String arg1) {
        if (arg0 >= -18) {
            this.method2282(false);
        }
        return this.method2292(0, 0, 16, arg1, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)Z", line = 576)
    public final boolean method2289(byte arg0) {
        if (arg0 >= -105) {
            this.field5128 = null;
        }
        if (!this.field5141) {
            return false;
        } else if (this.field5130) {
            return this.field5120 != null;
        } else {
            return this.field5137 != null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/awt/Component;IIILjava/awt/Point;[I)Lav;", line = 594)
    public final class637 method2290(Component arg0, int arg1, int arg2, int arg3, Point arg4, int[] arg5) {
        if (arg1 != 19) {
            this.method2282(true);
        }
        return this.method2292(arg3, arg2, 17, new Object[] { arg0, arg5, arg4 }, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/net/URL;)Lav;", line = 613)
    public final class637 method2291(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.field5131 = null;
        }
        return this.method2292(0, 0, 4, arg1, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIILjava/lang/Object;B)Lav;", line = 631)
    private final class637 method2292(int arg0, int arg1, int arg2, Object arg3, byte arg4) {
        class637 var6 = new class637();
        var6.field9088 = arg3;
        var6.field9087 = arg2;
        if (arg4 != 93) {
            return null;
        }
        var6.field9090 = arg1;
        var6.field9089 = arg0;
        synchronized (this) {
            if (this.field5135 == null) {
                this.field5135 = this.field5124 = var6;
            } else {
                this.field5135.field9092 = var6;
                this.field5135 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBIII)Lav;", line = 661)
    public final class637 method2293(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -87) {
            this.method2292(98, 126, -118, null, (byte) 102);
        }
        return this.method2292((arg0 << 16) + arg3, (arg2 << 16) + arg4, 6, null, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Lav;", line = 675)
    public final class637 method2294(String arg0, Class arg1, boolean arg2) {
        return arg2 ? null : this.method2292(0, 0, 9, new Object[] { arg1, arg0 }, (byte) 93);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lav;", line = 842)
    public final class637 method2295(int arg0, byte arg1, Runnable arg2) {
        if (arg1 < 5) {
            this.field5137 = null;
        }
        return this.method2292(arg0, 0, 2, arg2, (byte) 93);
    }
}
