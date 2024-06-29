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

@OriginalClass("client!qg")
public class class465 implements Runnable {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Ldq;")
    public class700 field6230 = null;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Ldq;")
    public class700 field6236 = null;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lsq;")
    private class181 field6243 = null;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lsq;")
    private class181 field6229 = null;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Z")
    public boolean field6235 = false;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Ldq;")
    public class700 field6248 = null;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Z")
    private boolean field6251 = false;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "Z")
    public boolean field6256 = false;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6237;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "[Ldq;")
    public class700[] field6242;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field6253;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Ljava/lang/Object;")
    private Object field6231;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "Lqd;")
    private class451 field6249;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lkfa;")
    private class604 field6244;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Ljava/lang/Object;")
    private Object field6246;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field6234;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "J")
    private static volatile long field6254 = 0L;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    private static int field6255;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field6257;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field6258;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field6259;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field6260;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Ljava/lang/String;")
    private static String field6232;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field6233;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6239;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6240;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6241;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field6245;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Ljava/lang/String;")
    private static String field6247;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Ljava/lang/String;")
    private static String field6250;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6238;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6252;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2657(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ldq;", line = 6)
    private static final class700 method2637(int arg0, String arg1, String arg2, int arg3) {
        if (arg0 != -23789) {
            method2644(-33, null);
        }
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field6232, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class700(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;IZ)Lsq;", line = 48)
    public final class181 method2638(String arg0, int arg1, boolean arg2) {
        if (arg1 != 3070) {
            this.method2651(null, (byte) 12);
        }
        return arg2 ? this.method2653(2, 12, arg0, 0, 0) : this.method2653(2, 13, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Frame;I)Lsq;", line = 63)
    public final class181 method2639(Frame arg0, int arg1) {
        if (arg1 != 0) {
            method2644(-78, null);
        }
        return this.method2653(2, 7, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lsq;", line = 74)
    public final class181 method2640(int arg0, byte arg1) {
        return arg1 > -112 ? null : this.method2653(2, 3, null, arg0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 699)
    public class465(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field6245 = "Unknown";
        field6255 = arg0;
        field6239 = "1.1";
        field6247 = arg1;
        this.field6256 = arg3;
        try {
            field6245 = System.getProperty("java.vendor");
            field6239 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field6245.toLowerCase().indexOf("microsoft") != -1) {
            this.field6235 = true;
        }
        try {
            field6250 = System.getProperty("os.name");
        } catch (Exception var19) {
            field6250 = "Unknown";
        }
        field6233 = field6250.toLowerCase();
        try {
            field6241 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field6241 = "";
        }
        try {
            field6240 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field6240 = "";
        }
        try {
            field6232 = System.getProperty("user.home");
            if (field6232 != null) {
                field6232 = field6232 + "/";
            }
        } catch (Exception var16) {
        }
        if (field6232 == null) {
            field6232 = "~/";
        }
        try {
            this.field6237 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field6235) {
            try {
                field6238 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field6252 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class664.method3746(field6255, 1, field6247);
        if (this.field6256) {
            this.field6230 = new class700(class664.method3744(null, 86, "random.dat", field6255), "rw", 25L);
            this.field6236 = new class700(class664.method3745("main_file_cache.dat2", 0), "rw", 209715200L);
            this.field6248 = new class700(class664.method3745("main_file_cache.idx255", 0), "rw", 1048576L);
            this.field6242 = new class700[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field6242[var5] = new class700(class664.method3745("main_file_cache.idx" + var5, 0), "rw", 1048576L);
            }
            if (this.field6235) {
                try {
                    this.field6253 = Class.forName("np").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field6235) {
                    this.field6249 = new class451();
                } else {
                    this.field6231 = Class.forName("ws").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field6235) {
                    this.field6244 = new class604();
                } else {
                    this.field6246 = Class.forName("gn").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field6256 && !this.field6235) {
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
        this.field6251 = false;
        this.field6234 = new Thread(this);
        this.field6234.setPriority(10);
        this.field6234.setDaemon(true);
        this.field6234.start();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Component;IZLjava/awt/Point;[II)Lsq;", line = 90)
    public final class181 method2641(Component arg0, int arg1, boolean arg2, Point arg3, int[] arg4, int arg5) {
        if (!arg2) {
            this.field6249 = null;
        }
        return this.method2653(2, 17, new Object[] { arg0, arg4, arg3 }, arg5, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Lsq;", line = 101)
    public final class181 method2642(int arg0) {
        return arg0 == 5 ? this.method2653(2, 5, null, 0, 0) : null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lsq;", line = 112)
    public final class181 method2643(int arg0, Runnable arg1, byte arg2) {
        return arg2 == 82 ? this.method2653(arg2 - 80, 2, arg1, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;)Ldq;", line = 122)
    public static final class700 method2644(int arg0, String arg1) {
        if (arg0 != 2) {
            method2644(-85, null);
        }
        return method2637(-23789, field6247, arg1, field6255);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lsq;", line = 133)
    public final class181 method2645(byte arg0, Class arg1, Class[] arg2, String arg3) {
        if (arg0 != 89) {
            this.field6229 = null;
        }
        return this.method2653(2, 8, new Object[] { arg1, arg3, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "run", descriptor = "()V", line = 144)
    public final void run() {
        while (true) {
            class181 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6251) {
                        return;
                    }
                    if (this.field6229 != null) {
                        var2 = this.field6229;
                        this.field6229 = this.field6229.field2539;
                        if (this.field6229 == null) {
                            this.field6243 = null;
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
                int var3 = var2.field2537;
                if (var3 == 1) {
                    if (class446.method2525(500) < field6254) {
                        throw new IOException();
                    }
                    var2.field2540 = new Socket(InetAddress.getByName((String) var2.field2541), var2.field2536);
                } else if (var3 == 22) {
                    if (class446.method2525(500) < field6254) {
                        throw new IOException();
                    }
                    try {
                        var2.field2540 = class597.method3387(30, (String) var2.field2541, var2.field2536).method677(19877);
                    } catch (class579 var29) {
                        var2.field2540 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field2541);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field2536);
                    var2.field2540 = var23;
                } else if (var3 == 4) {
                    if (field6254 > class446.method2525(500)) {
                        throw new IOException();
                    }
                    var2.field2540 = new DataInputStream(((URL) var2.field2541).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2541;
                    if (this.field6256 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2540 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var22 = (Object[]) var2.field2541;
                    if (this.field6256 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2540 = ((Class) var22[0]).getDeclaredField((String) var22[1]);
                } else if (var3 == 18) {
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2540 = var21.getContents(null);
                } else if (var3 == 19) {
                    Transferable var19 = (Transferable) var2.field2541;
                    Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var20.setContents(var19, null);
                } else if (!this.field6256) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field6254 > class446.method2525(500)) {
                        throw new IOException();
                    }
                    String var18 = (var2.field2536 >> 24 & 0xFF) + "." + (var2.field2536 >> 16 & 0xFF) + "." + (var2.field2536 >> 8 & 0xFF) + "." + (var2.field2536 & 0xFF);
                    var2.field2540 = InetAddress.getByName(var18).getHostName();
                } else if (var3 == 21) {
                    if (field6254 > class446.method2525(500)) {
                        throw new IOException();
                    }
                    var2.field2540 = InetAddress.getByName((String) var2.field2541).getAddress();
                } else if (var3 == 5) {
                    if (this.field6235) {
                        var2.field2540 = this.field6249.method2536(0);
                    } else {
                        var2.field2540 = Class.forName("ws").getMethod("listmodes").invoke(this.field6231);
                    }
                } else if (var3 == 6) {
                    Frame var17 = new Frame("Jagex Full Screen");
                    var2.field2540 = var17;
                    var17.setResizable(false);
                    if (this.field6235) {
                        this.field6249.method2538(var2.field2536 >>> 16, var17, var2.field2536 & 0xFFFF, var2.field2535 & 0xFFFF, var2.field2535 >> 16, (byte) -54);
                    } else {
                        Class.forName("ws").getMethod("enter", field6260 == null ? (field6260 = method2657("java.awt.Frame")) : field6260, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field6231, var17, Integer.valueOf(var2.field2536 >>> 16), new Integer(var2.field2536 & 0xFFFF), Integer.valueOf(var2.field2535 >> 16), new Integer(var2.field2535 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field6235) {
                        this.field6249.method2537((byte) -97, (Frame) var2.field2541);
                    } else {
                        Class.forName("ws").getMethod("exit").invoke(this.field6231);
                    }
                } else if (var3 == 12) {
                    class700 var16 = method2637(-23789, field6247, (String) var2.field2541, field6255);
                    var2.field2540 = var16;
                } else if (var3 == 13) {
                    class700 var15 = method2637(-23789, "", (String) var2.field2541, field6255);
                    var2.field2540 = var15;
                } else if (this.field6256 && var3 == 14) {
                    int var13 = var2.field2536;
                    int var14 = var2.field2535;
                    if (this.field6235) {
                        this.field6244.method3415(-56, var14, var13);
                    } else {
                        Class.forName("gn").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field6246, Integer.valueOf(var13), new Integer(var14));
                    }
                } else if (this.field6256 && var3 == 15) {
                    boolean var11 = var2.field2536 != 0;
                    Component var12 = (Component) var2.field2541;
                    if (this.field6235) {
                        this.field6244.method3414(false, var11, var12);
                    } else {
                        Class.forName("gn").getDeclaredMethod("showcursor", field6257 == null ? (field6257 = method2657("java.awt.Component")) : field6257, Boolean.TYPE).invoke(this.field6246, var12, Boolean.valueOf(var11));
                    }
                } else if (!this.field6235 && var3 == 17) {
                    Object[] var10 = (Object[]) var2.field2541;
                    Class.forName("gn").getDeclaredMethod("setcustomcursor", field6257 == null ? (field6257 = method2657("java.awt.Component")) : field6257, field6258 == null ? (field6258 = method2657("[I")) : field6258, Integer.TYPE, Integer.TYPE, field6259 == null ? (field6259 = method2657("java.awt.Point")) : field6259).invoke(this.field6246, (Component) var10[0], (int[]) var10[1], Integer.valueOf(var2.field2536), new Integer(var2.field2535), (Point) var10[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field6233.startsWith("win")) {
                            throw new Exception();
                        }
                        String var6 = (String) var2.field2541;
                        if (!var6.startsWith("http://") && !var6.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var7 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var8 = 0; var6.length() > var8; var8++) {
                            if (var7.indexOf(var6.charAt(var8)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var6 + "\"");
                        var2.field2540 = null;
                    } catch (Exception var31) {
                        var2.field2540 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field2538 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field2538 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 446)
    public final Object method2646(byte arg0) {
        int var2 = -99 / ((-arg0 - 1) / 46);
        return this.field6253;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 456)
    public final void method2647(int arg0) {
        field6254 = class446.method2525(500) + 5000L;
        int var2 = 40 / ((arg0 + 81) / 42);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V", line = 471)
    public final void method2648(boolean arg0) {
        synchronized (this) {
            this.field6251 = arg0;
            this.notifyAll();
        }
        try {
            this.field6234.join();
        } catch (InterruptedException var8) {
        }
        if (this.field6236 != null) {
            try {
                this.field6236.method3941(true);
            } catch (IOException var7) {
            }
        }
        if (this.field6248 != null) {
            try {
                this.field6248.method3941(true);
            } catch (IOException var6) {
            }
        }
        if (this.field6242 != null) {
            for (int var3 = 0; var3 < this.field6242.length; var3++) {
                if (this.field6242[var3] != null) {
                    try {
                        this.field6242[var3].method3941(true);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6230 != null) {
            try {
                this.field6230.method3941(true);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZLjava/lang/String;I)Lsq;", line = 525)
    public final class181 method2649(boolean arg0, boolean arg1, String arg2, int arg3) {
        return arg1 ? null : this.method2653(2, arg0 ? 22 : 1, arg2, arg3, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/net/URL;I)Lsq;", line = 536)
    public final class181 method2650(URL arg0, int arg1) {
        if (arg1 <= 116) {
            this.method2641(null, 39, true, null, null, -70);
        }
        return this.method2653(2, 4, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;B)Lsq;", line = 547)
    public final class181 method2651(String arg0, byte arg1) {
        if (arg1 != 119) {
            field6239 = null;
        }
        return this.method2653(2, 16, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lsq;", line = 560)
    public final class181 method2652(String arg0, byte arg1, Class arg2) {
        if (arg1 <= 25) {
            method2644(56, null);
        }
        return this.method2653(2, 9, new Object[] { arg2, arg0 }, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/Object;II)Lsq;", line = 576)
    private final class181 method2653(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class181 var6 = new class181();
        var6.field2537 = arg1;
        var6.field2541 = arg2;
        var6.field2535 = arg4;
        var6.field2536 = arg3;
        synchronized (this) {
            if (this.field6243 == null) {
                this.field6243 = this.field6229 = var6;
            } else {
                this.field6243.field2539 = var6;
                this.field6243 = var6;
            }
            this.notify();
        }
        return arg0 == 2 ? var6 : null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/io/File;I[B)Z", line = 620)
    public final boolean method2654(File arg0, int arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg0);
            var4.write(arg2, arg1, arg2.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIII)Lsq;", line = 665)
    public final class181 method2655(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = 123 / ((arg1 + 38) / 60);
        return this.method2653(2, 6, null, (arg0 << 16) + arg4, (arg2 << 16) - -arg3);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)Z", line = 675)
    public final boolean method2656(int arg0) {
        if (!this.field6256) {
            return false;
        }
        if (arg0 != -16) {
            field6247 = null;
        }
        if (this.field6235) {
            return this.field6249 != null;
        } else {
            return this.field6231 != null;
        }
    }
}
