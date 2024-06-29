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

@OriginalClass("client!ji")
public class class432 implements Runnable {

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lrv;")
    public class71 field6458 = null;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Lrv;")
    public class71 field6464 = null;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field6462 = null;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Z")
    private boolean field6472 = false;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lrm;")
    private class281 field6460 = null;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "Lrv;")
    public class71 field6469 = null;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Lrm;")
    private class281 field6468 = null;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Ljava/lang/String;")
    private String field6465;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    private int field6466;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6456;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field6471;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field6459 = 3;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field6454 = new Hashtable(16);

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "J")
    public static volatile long field6475 = 0L;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Laf;")
    private class298 field6463;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6452;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Ljava/lang/String;")
    private static String field6453;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6457;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6461;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Ljava/lang/String;")
    public static String field6467;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "Ljava/lang/String;")
    public static String field6470;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "Ljava/lang/String;")
    public static String field6473;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6474;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6476;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[Lrv;")
    public class71[] field6455;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lrm;", line = 4)
    public final class281 method2570(Class arg0, String arg1, int arg2, Class[] arg3) {
        if (arg2 < 19) {
            this.method2570(null, null, 110, null);
        }
        return this.method2573(0, new Object[] { arg0, arg1, arg3 }, 120, 8, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)Lrm;", line = 16)
    public final class281 method2571(byte arg0, int arg1) {
        if (arg0 > -83) {
            field6459 = 18;
        }
        return this.method2573(0, null, 88, 3, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Class;I)Lrm;", line = 31)
    public final class281 method2572(Class arg0, int arg1) {
        if (arg1 != 0) {
            this.field6463 = null;
        }
        return this.method2573(0, arg0, 98, 11, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/lang/Object;III)Lrm;", line = 43)
    private final class281 method2573(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class281 var6 = new class281();
        var6.field4028 = arg1;
        if (arg2 < 8) {
            this.method2578(-96);
        }
        var6.field4031 = arg4;
        var6.field4029 = arg3;
        synchronized (this) {
            if (this.field6468 == null) {
                this.field6468 = this.field6460 = var6;
            } else {
                this.field6468.field4033 = var6;
                this.field6468 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILjava/awt/Component;)Lrm;", line = 73)
    public final class281 method2574(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 > -95) {
            return null;
        } else {
            Point var5 = arg3.getLocationOnScreen();
            return this.method2573(arg0 + var5.y, null, 93, 14, var5.x + arg2);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 87)
    public static final File method2575(String arg0, int arg1, String arg2, int arg3) {
        File var4 = (File) field6454.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field6453, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = arg1; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg2 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg2)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field6454.put(arg0, var12);
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

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZLjava/awt/Component;)Lrm;", line = 173)
    public final class281 method2576(boolean arg0, boolean arg1, Component arg2) {
        if (arg0) {
            field6452 = null;
        }
        return this.method2573(0, arg2, 39, 15, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;", line = 186)
    public final File method2577(byte arg0, String arg1) {
        return arg0 <= 110 ? null : method2575(arg1, 0, this.field6465, this.field6466);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 196)
    public final void method2578(int arg0) {
        synchronized (this) {
            if (arg0 <= 8) {
                this.method2573(105, null, -21, 86, -40);
            }
            this.field6472 = true;
            this.notifyAll();
        }
        try {
            this.field6471.join();
        } catch (InterruptedException var8) {
        }
        if (this.field6458 != null) {
            try {
                this.field6458.method410(-120);
            } catch (IOException var7) {
            }
        }
        if (this.field6464 != null) {
            try {
                this.field6464.method410(-123);
            } catch (IOException var6) {
            }
        }
        if (this.field6455 != null) {
            for (int var3 = 0; var3 < this.field6455.length; var3++) {
                if (this.field6455[var3] != null) {
                    try {
                        this.field6455[var3].method410(-128);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6469 != null) {
            try {
                this.field6469.method410(-125);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 255)
    public final byte[] method2579(int arg0, String arg1) {
        int var3 = -45 % ((35 - arg0) / 54);
        class281 var4 = this.method2587(arg1, (byte) 66, 21, 0, 0);
        return (byte[]) var4.field4030;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;)Lrm;", line = 268)
    public final class281 method2580(boolean arg0, String arg1) {
        return arg0 ? this.method2573(0, arg1, 102, 21, 0) : null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Lrm;", line = 280)
    public final class281 method2581(int arg0) {
        if (arg0 != 0) {
            this.method2588(null, -89);
        }
        return this.method2573(0, null, arg0 ^ 0x5A, 18, 0);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)Laf;", line = 290)
    public final class298 method2582(int arg0) {
        if (arg0 != 6) {
            this.method2570(null, null, 92, null);
        }
        return this.field6463;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[III)Lrm;", line = 300)
    public final class281 method2583(int arg0, Point arg1, Component arg2, int[] arg3, int arg4, int arg5) {
        if (arg5 != 17) {
            this.field6456 = null;
        }
        return this.method2573(arg4, new Object[] { arg2, arg3, arg1 }, 26, 17, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 694)
    public class432(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field6462 = arg0;
        field6461 = "Unknown";
        this.field6465 = arg2;
        field6457 = "1.1";
        this.field6466 = arg1;
        try {
            field6461 = System.getProperty("java.vendor");
            field6457 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field6467 = System.getProperty("os.name");
        } catch (Exception var11) {
            field6467 = "Unknown";
        }
        field6470 = field6467.toLowerCase();
        try {
            field6473 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field6473 = "";
        }
        try {
            field6452 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field6452 = "";
        }
        try {
            field6453 = System.getProperty("user.home");
            if (field6453 != null) {
                field6453 = field6453 + "/";
            }
        } catch (Exception var8) {
        }
        if (field6453 == null) {
            field6453 = "~/";
        }
        try {
            this.field6456 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field6474 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field6474 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field6476 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field6476 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field6472 = false;
        this.field6471 = new Thread(this);
        this.field6471.setPriority(10);
        this.field6471.setDaemon(true);
        this.field6471.start();
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)Z", line = 317)
    public final boolean method2584(int arg0) {
        if (arg0 >= -85) {
            this.field6464 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lrm;", line = 332)
    public final class281 method2585(byte arg0, String arg1, Class arg2) {
        if (arg0 != -99) {
            this.method2585((byte) 83, null, null);
        }
        return this.method2573(0, new Object[] { arg2, arg1 }, arg0 ^ 0xFFFFFFE0, 9, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/net/URL;I)Lrm;", line = 342)
    public final class281 method2586(URL arg0, int arg1) {
        return arg1 == 19 ? this.method2573(0, arg0, 124, 4, 0) : null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lrm;", line = 360)
    private final class281 method2587(Object arg0, byte arg1, int arg2, int arg3, int arg4) {
        class281 var6 = new class281();
        synchronized (var6) {
            var6.field4028 = arg0;
            if (arg1 <= 64) {
                this.method2578(36);
            }
            var6.field4029 = arg2;
            var6.field4031 = arg3;
            synchronized (this) {
                if (this.field6468 == null) {
                    this.field6468 = this.field6460 = var6;
                } else {
                    this.field6468.field4033 = var6;
                    this.field6468 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ji", name = "run", descriptor = "()V", line = 396)
    public final void run() {
        while (true) {
            class281 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6472) {
                        return;
                    }
                    if (this.field6460 != null) {
                        var2 = this.field6460;
                        this.field6460 = this.field6460.field4033;
                        if (this.field6460 == null) {
                            this.field6468 = null;
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
                int var3 = var2.field4029;
                if (var3 == 1) {
                    if (field6475 > class256.method1708((byte) 118)) {
                        throw new IOException();
                    }
                    var2.field4030 = new Socket(InetAddress.getByName((String) var2.field4028), var2.field4031);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field4028);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field4031);
                    var2.field4030 = var9;
                } else if (var3 == 4) {
                    if (class256.method1708((byte) 118) < field6475) {
                        throw new IOException();
                    }
                    var2.field4030 = new DataInputStream(((URL) var2.field4028).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field4028;
                    var2.field4030 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field4028;
                    var2.field4030 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4030 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var4 = (Transferable) var2.field4028;
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var5.setContents(var4, null);
                } else {
                    throw new Exception("");
                }
                var2.field4032 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4032 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lrm;", line = 525)
    public final class281 method2588(Transferable arg0, int arg1) {
        if (arg1 != -2103) {
            field6470 = null;
        }
        return this.method2573(0, arg0, 46, 19, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;Z)Lrm;", line = 538)
    public final class281 method2589(String arg0, boolean arg1) {
        if (!arg1) {
            this.field6468 = null;
        }
        return this.method2573(0, arg0, 65, 12, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/Class;)V", line = 554)
    public final void method2590(byte arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field6470.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        if (arg0 < 50) {
            this.method2593(71);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field6470.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method2577((byte) 115, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Frame;B)Lrm;", line = 589)
    public final class281 method2591(Frame arg0, byte arg1) {
        if (arg1 != 76) {
            method2575(null, 105, null, 100);
        }
        return this.method2573(0, arg0, 126, 7, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Class;Z)Lrm;", line = 602)
    public final class281 method2592(Class arg0, boolean arg1) {
        return arg1 ? this.method2573(0, arg0, 44, 20, 0) : null;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V", line = 615)
    public final void method2593(int arg0) {
        field6475 = (long) arg0 + class256.method1708((byte) 118);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Lrm;", line = 623)
    public final class281 method2594(boolean arg0) {
        return arg0 ? null : this.method2573(0, null, 75, 5, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lrm;", line = 648)
    public final class281 method2595(Runnable arg0, int arg1, int arg2) {
        if (arg2 < 73) {
            this.method2585((byte) -66, null, null);
        }
        return this.method2573(0, arg0, 40, 2, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)Lrm;", line = 658)
    public final class281 method2596(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 12 % ((arg3 - 74) / 38);
        return this.method2573((arg1 << 16) + arg0, null, 25, 6, (arg4 << 16) + arg2);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;I)Lrm;", line = 668)
    public final class281 method2597(String arg0, int arg1) {
        int var3 = -93 % ((arg1 + 33) / 58);
        return this.method2573(0, arg0, 12, 16, 0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;IB)Lrm;", line = 682)
    public final class281 method2598(String arg0, int arg1, byte arg2) {
        int var4 = -95 % ((57 - arg2) / 43);
        return this.method2573(0, arg0, 79, 1, arg1);
    }
}
