import java.applet.Applet;
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
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class441 implements Runnable {

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field6139 = null;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Lqd;")
    private class277 field6136 = null;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "Lrq;")
    public class38 field6140 = null;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "Lrq;")
    public class38 field6148 = null;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "Lqd;")
    private class277 field6149 = null;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "Lrq;")
    public class38 field6154 = null;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "Z")
    private boolean field6141 = false;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    private int field6135;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Ljava/lang/String;")
    private String field6153;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6156;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field6155;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field6150 = 3;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field6151 = new Hashtable(16);

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "J")
    public static volatile long field6158 = 0L;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "Lgm;")
    private class101 field6143;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6137;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6138;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6142;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Ljava/lang/String;")
    private static String field6144;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6145;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6146;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6147;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6157;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6159;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "[Lrq;")
    public class38[] field6152;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)Lqd;")
    public final class277 method2604(int arg0, int arg1) {
        return arg0 == 4479 ? this.method2611(arg1, null, 21, 0, 3) : null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;I)Lqd;")
    public final class277 method2605(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field6136 = null;
        }
        return this.method2611(0, arg0, 21, 0, 16);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)Lqd;")
    public final class277 method2606(byte arg0) {
        return arg0 == -65 ? this.method2611(0, null, 21, 0, 18) : null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/net/URL;)Lqd;")
    public final class277 method2607(int arg0, URL arg1) {
        if (arg0 < 81) {
            field6138 = null;
        }
        return this.method2611(0, arg1, 21, 0, 4);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lqd;")
    public final class277 method2608(String arg0, Class arg1, byte arg2) {
        if (arg2 != 63) {
            this.run();
        }
        return this.method2611(0, new Object[] { arg1, arg0 }, arg2 - 42, 0, 9);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public final File method2609(String arg0, int arg1) {
        if (arg1 < 123) {
            field6150 = 51;
        }
        return method2614(this.field6153, arg0, 0, this.field6135);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lqd;")
    private final class277 method2610(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        class277 var6 = new class277();
        synchronized (var6) {
            var6.field3540 = arg3;
            var6.field3543 = arg4;
            var6.field3544 = arg0;
            synchronized (this) {
                if (this.field6136 == null) {
                    this.field6136 = this.field6149 = var6;
                } else {
                    this.field6136.field3545 = var6;
                    this.field6136 = var6;
                }
                this.notify();
                if (arg2 <= 113) {
                    method2614(null, null, -113, -36);
                }
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/lang/Object;III)Lqd;")
    private final class277 method2611(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class277 var6 = new class277();
        var6.field3544 = arg0;
        var6.field3543 = arg4;
        var6.field3540 = arg1;
        if (arg2 != 21) {
            this.field6155 = null;
        }
        synchronized (this) {
            if (this.field6136 == null) {
                this.field6136 = this.field6149 = var6;
            } else {
                this.field6136.field3545 = var6;
                this.field6136 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Component;III)Lqd;")
    public final class277 method2612(Component arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 31331) {
            this.field6156 = null;
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method2611(var5.x + arg2, null, 21, var5.y + arg3, 14);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Lqd;")
    public final class277 method2613(String arg0, Class[] arg1, byte arg2, Class arg3) {
        return arg2 == -6 ? this.method2611(0, new Object[] { arg3, arg0, arg1 }, 21, 0, 8) : null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static final File method2614(String arg0, String arg1, int arg2, int arg3) {
        File var4 = (File) field6151.get(arg1);
        if (var4 != null) {
            return var4;
        }
        if (arg2 != 0) {
            method2614(null, null, -25, 8);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field6144, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg0 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg0)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field6151.put(arg1, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var17) {
                        try {
                            if (var11 != null) {
                                var11.close();
                                Object var15 = null;
                            }
                        } catch (Exception var16) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZLjava/lang/Class;)Lqd;")
    public final class277 method2615(boolean arg0, Class arg1) {
        if (!arg0) {
            this.method2626(127);
        }
        return this.method2611(0, arg1, 21, 0, 20);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/awt/Frame;)Lqd;")
    public final class277 method2616(int arg0, Frame arg1) {
        if (arg0 <= 37) {
            this.field6149 = null;
        }
        return this.method2611(0, arg1, 21, 0, 7);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
    public final byte[] method2617(String arg0, boolean arg1) {
        if (arg1) {
            this.method2624(52, 124, -6, (byte) 108, 109);
        }
        class277 var3 = this.method2610(0, 0, (byte) 127, arg0, 21);
        return (byte[]) var3.field3541;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Lqd;")
    public final class277 method2618(int arg0) {
        return arg0 == 0 ? this.method2611(0, null, arg0 + 21, 0, 5) : null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;B)Lqd;")
    public final class277 method2619(String arg0, byte arg1) {
        return arg1 < 113 ? null : this.method2611(0, arg0, 21, 0, 21);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lqd;")
    public final class277 method2620(Runnable arg0, int arg1, int arg2) {
        return arg2 < 51 ? null : this.method2611(arg1, arg0, 21, 0, 2);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Lgm;")
    public final class101 method2621(byte arg0) {
        return arg0 == 38 ? this.field6143 : null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;II)Lqd;")
    public final class277 method2622(String arg0, int arg1, int arg2) {
        return arg2 == -1727 ? this.method2611(arg1, arg0, arg2 + 1748, 0, 1) : null;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public final void method2623(int arg0) {
        field6158 = class173.method1134(true) + 5000L;
        if (arg0 != 0) {
            this.method2604(-51, 10);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIBI)Lqd;")
    public final class277 method2624(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        return arg3 >= -29 ? null : this.method2611((arg2 << 16) + arg1, null, 21, (arg0 << 16) + arg4, 6);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;[IIII)Lqd;")
    public final class277 method2625(Component arg0, Point arg1, int[] arg2, int arg3, int arg4, int arg5) {
        int var7 = -91 / ((arg3 - 79) / 42);
        return this.method2611(arg4, new Object[] { arg0, arg2, arg1 }, 21, arg5, 17);
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
    public final void method2626(int arg0) {
        if (arg0 != -14823) {
            return;
        }
        synchronized (this) {
            this.field6141 = true;
            this.notifyAll();
        }
        try {
            this.field6155.join();
        } catch (InterruptedException var8) {
        }
        if (this.field6148 != null) {
            try {
                this.field6148.method243(arg0 + 14823);
            } catch (IOException var7) {
            }
        }
        if (this.field6154 != null) {
            try {
                this.field6154.method243(0);
            } catch (IOException var6) {
            }
        }
        if (this.field6152 != null) {
            for (int var3 = 0; var3 < this.field6152.length; var3++) {
                if (this.field6152[var3] != null) {
                    try {
                        this.field6152[var3].method243(arg0 + 14823);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6140 != null) {
            try {
                this.field6140.method243(arg0 + 14823);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLjava/lang/Class;)Lqd;")
    public final class277 method2627(byte arg0, Class arg1) {
        if (arg0 > -60) {
            this.method2606((byte) 55);
        }
        return this.method2611(0, arg1, 21, 0, 11);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/Class;I)V")
    public final void method2628(Class arg0, int arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        if (arg1 != -13805) {
            this.field6148 = null;
        }
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field6145.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field6145.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method2609("sw3d.dll", arg1 ^ 0xFFFFCA6D).toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!hs", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class277 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6141) {
                        return;
                    }
                    if (this.field6149 != null) {
                        var2 = this.field6149;
                        this.field6149 = this.field6149.field3545;
                        if (this.field6149 == null) {
                            this.field6136 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var17) {
                    }
                }
            }
            try {
                int var3 = var2.field3543;
                if (var3 == 1) {
                    if (field6158 > class173.method1134(true)) {
                        throw new IOException();
                    }
                    var2.field3541 = new Socket(InetAddress.getByName((String) var2.field3540), var2.field3544);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3540);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3544);
                    var2.field3541 = var4;
                } else if (var3 == 4) {
                    if (field6158 > class173.method1134(true)) {
                        throw new IOException();
                    }
                    var2.field3541 = new DataInputStream(((URL) var2.field3540).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3540;
                    var2.field3541 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field3540;
                    var2.field3541 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3541 = var8.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field3540;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else {
                    throw new Exception("");
                }
                var2.field3542 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3542 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Ljava/lang/String;Z)Lqd;")
    public final class277 method2629(String arg0, boolean arg1) {
        return arg1 ? null : this.method2611(0, arg0, 21, 0, 12);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lqd;")
    public final class277 method2630(Transferable arg0, int arg1) {
        if (arg1 != -26435) {
            this.field6136 = null;
        }
        return this.method2611(0, arg0, arg1 + 26456, 0, 19);
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)Z")
    public final boolean method2631(int arg0) {
        if (arg0 >= -121) {
            this.field6143 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLjava/awt/Component;Z)Lqd;")
    public final class277 method2632(byte arg0, Component arg1, boolean arg2) {
        if (arg0 != -33) {
            this.field6148 = null;
        }
        return this.method2611(arg2 ? 1 : 0, arg1, 21, 0, 15);
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class441(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field6142 = "1.1";
        this.field6139 = arg0;
        field6146 = "Unknown";
        this.field6135 = arg1;
        this.field6153 = arg2;
        try {
            field6146 = System.getProperty("java.vendor");
            field6142 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field6147 = System.getProperty("os.name");
        } catch (Exception var11) {
            field6147 = "Unknown";
        }
        field6145 = field6147.toLowerCase();
        try {
            field6137 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field6137 = "";
        }
        try {
            field6138 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field6138 = "";
        }
        try {
            field6144 = System.getProperty("user.home");
            if (field6144 != null) {
                field6144 = field6144 + "/";
            }
        } catch (Exception var8) {
        }
        if (field6144 == null) {
            field6144 = "~/";
        }
        try {
            this.field6156 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field6159 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field6159 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field6157 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field6157 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field6141 = false;
        this.field6155 = new Thread(this);
        this.field6155.setPriority(10);
        this.field6155.setDaemon(true);
        this.field6155.start();
    }
}
