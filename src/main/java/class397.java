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

@OriginalClass("client!kj")
public class class397 implements Runnable {

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field5516 = null;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Ljo;")
    public class219 field5523 = null;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Ljo;")
    public class219 field5515 = null;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Ljo;")
    public class219 field5527 = null;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Z")
    private boolean field5531 = false;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Lgu;")
    private class409 field5533 = null;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Lgu;")
    private class409 field5530 = null;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Ljava/lang/String;")
    private String field5524;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    private int field5514;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5526;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field5528;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field5519 = 3;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5532 = new Hashtable(16);

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "J")
    public static volatile long field5534 = 0L;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Lpu;")
    private class394 field5529;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5512;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5517;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5518;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5520;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Ljava/lang/String;")
    private static String field5521;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5522;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5525;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5535;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5536;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[Ljo;")
    public class219[] field5513;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;I)Lgu;")
    public final class409 method2270(String arg0, int arg1) {
        if (arg1 <= 92) {
            this.field5533 = null;
        }
        return this.method2283(0, 0, 4, 16, arg0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Lgu;")
    public final class409 method2271(Class[] arg0, int arg1, String arg2, Class arg3) {
        if (arg1 != -8413) {
            this.method2288((byte) -122);
        }
        return this.method2283(0, 0, 4, 8, new Object[] { arg3, arg2, arg0 });
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;II[II)Lgu;")
    public final class409 method2272(Component arg0, Point arg1, int arg2, int arg3, int[] arg4, int arg5) {
        if (arg3 != 21124) {
            this.method2297(-67, 100);
        }
        return this.method2283(arg2, arg5, 4, 17, new Object[] { arg0, arg4, arg1 });
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/net/URL;)Lgu;")
    public final class409 method2273(boolean arg0, URL arg1) {
        if (!arg0) {
            this.method2272(null, null, -89, -30, null, 29);
        }
        return this.method2283(0, 0, 4, 4, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/Class;I)Lgu;")
    public final class409 method2274(Class arg0, int arg1) {
        return arg1 == 0 ? this.method2283(0, 0, arg1 + 4, 20, arg0) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;)Lgu;")
    public final class409 method2275(int arg0, String arg1) {
        return arg0 <= 87 ? null : this.method2283(0, 0, 4, 21, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public final void method2276(int arg0) {
        field5534 = class333.method1850(-3562) + 5000L;
        if (arg0 != -11384) {
            this.method2289(true, null);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;III)Lgu;")
    public final class409 method2277(Component arg0, int arg1, int arg2, int arg3) {
        Point var5 = arg0.getLocationOnScreen();
        return arg3 == 0 ? this.method2283(arg1 + var5.x, var5.y + arg2, arg3 ^ 0x4, 14, null) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/lang/Class;)Lgu;")
    public final class409 method2278(byte arg0, Class arg1) {
        return arg0 == 28 ? this.method2283(0, 0, 4, 11, arg1) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
    public static final File method2279(String arg0, int arg1, String arg2, int arg3) {
        File var4 = (File) field5532.get(arg2);
        if (var4 != null) {
            return var4;
        } else if (arg3 == -13325) {
            String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5521, "/tmp/", "" };
            String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
            for (int var7 = 0; var7 < 2; var7++) {
                for (int var8 = 0; var8 < var6.length; var8++) {
                    for (int var9 = 0; var9 < var5.length; var9++) {
                        String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
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
                                    field5532.put(arg2, var12);
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
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)Lgu;")
    public final class409 method2280(byte arg0) {
        return arg0 == 71 ? this.method2283(0, 0, 4, 18, null) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZILjava/lang/String;)Lgu;")
    public final class409 method2281(boolean arg0, int arg1, String arg2) {
        if (!arg0) {
            this.method2284(116, -89, null, -82, -108);
        }
        return this.method2283(arg1, 0, 4, 1, arg2);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Frame;B)Lgu;")
    public final class409 method2282(Frame arg0, byte arg1) {
        if (arg1 != 12) {
            this.field5527 = null;
        }
        return this.method2283(0, 0, arg1 - 8, 7, arg0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIILjava/lang/Object;)Lgu;")
    private final class409 method2283(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class409 var6 = new class409();
        if (arg2 != 4) {
            this.method2289(true, null);
        }
        var6.field5649 = arg0;
        var6.field5651 = arg4;
        var6.field5650 = arg3;
        synchronized (this) {
            if (this.field5530 == null) {
                this.field5530 = this.field5533 = var6;
            } else {
                this.field5530.field5653 = var6;
                this.field5530 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILjava/lang/Object;II)Lgu;")
    private final class409 method2284(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class409 var6 = new class409();
        synchronized (var6) {
            var6.field5650 = arg3;
            var6.field5649 = arg4;
            var6.field5651 = arg2;
            synchronized (this) {
                if (this.field5530 == null) {
                    this.field5530 = this.field5533 = var6;
                } else {
                    this.field5530.field5653 = var6;
                    this.field5530 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
                if (arg0 != 3969) {
                    this.field5529 = null;
                }
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)Z")
    public final boolean method2285(byte arg0) {
        return arg0 >= -14;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
    public final void method2286(byte arg0) {
        synchronized (this) {
            this.field5531 = true;
            this.notifyAll();
        }
        try {
            this.field5528.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 != -79) {
            this.method2291(false);
        }
        if (this.field5523 != null) {
            try {
                this.field5523.method1297((byte) 103);
            } catch (IOException var7) {
            }
        }
        if (this.field5527 != null) {
            try {
                this.field5527.method1297((byte) 95);
            } catch (IOException var6) {
            }
        }
        if (this.field5513 != null) {
            for (int var3 = 0; var3 < this.field5513.length; var3++) {
                if (this.field5513[var3] != null) {
                    try {
                        this.field5513[var3].method1297((byte) -88);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field5515 != null) {
            try {
                this.field5515.method1297((byte) 54);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(BLjava/lang/Class;)V")
    public final void method2287(byte arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        if (arg0 >= -58) {
            return;
        }
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field5517.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field5517.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method2289(false, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!kj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class409 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5531) {
                        return;
                    }
                    if (this.field5533 != null) {
                        var2 = this.field5533;
                        this.field5533 = this.field5533.field5653;
                        if (this.field5533 == null) {
                            this.field5530 = null;
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
                int var3 = var2.field5650;
                if (var3 == 1) {
                    if (class333.method1850(-3562) < field5534) {
                        throw new IOException();
                    }
                    var2.field5654 = new Socket(InetAddress.getByName((String) var2.field5651), var2.field5649);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field5651);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field5649);
                    var2.field5654 = var9;
                } else if (var3 == 4) {
                    if (class333.method1850(-3562) < field5534) {
                        throw new IOException();
                    }
                    var2.field5654 = new DataInputStream(((URL) var2.field5651).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field5651;
                    var2.field5654 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field5651;
                    var2.field5654 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5654 = var4.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field5651;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else {
                    throw new Exception("");
                }
                var2.field5652 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field5652 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)Lpu;")
    public final class394 method2288(byte arg0) {
        if (arg0 != -42) {
            this.field5516 = null;
        }
        return this.field5529;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
    public final File method2289(boolean arg0, String arg1) {
        return arg0 ? null : method2279(this.field5524, this.field5514, arg1, -13325);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public final byte[] method2290(String arg0, byte arg1) {
        class409 var3 = this.method2284(3969, 0, arg0, 21, 0);
        return arg1 == -16 ? (byte[]) var3.field5654 : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)Lgu;")
    public final class409 method2291(boolean arg0) {
        return arg0 ? null : this.method2283(0, 0, 4, 5, null);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/lang/String;)Lgu;")
    public final class409 method2292(byte arg0, String arg1) {
        return arg0 < 37 ? null : this.method2283(0, 0, 4, 12, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lgu;")
    public final class409 method2293(Component arg0, byte arg1, boolean arg2) {
        if (arg1 != -98) {
            field5532 = null;
        }
        return this.method2283(arg2 ? 1 : 0, 0, 4, 15, arg0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lgu;")
    public final class409 method2294(Class arg0, int arg1, String arg2) {
        if (arg1 != 0) {
            method2279(null, 20, null, 93);
        }
        return this.method2283(0, 0, arg1 + 4, 9, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lgu;")
    public final class409 method2295(Transferable arg0, int arg1) {
        if (arg1 != -13915) {
            this.method2270(null, -27);
        }
        return this.method2283(0, 0, 4, 19, arg0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lgu;")
    public final class409 method2296(int arg0, Runnable arg1, byte arg2) {
        if (arg2 != 32) {
            this.method2288((byte) 42);
        }
        return this.method2283(arg0, 0, arg2 - 28, 2, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lgu;")
    public final class409 method2297(int arg0, int arg1) {
        return arg1 == 0 ? this.method2283(arg0, 0, arg1 + 4, 3, null) : null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBIII)Lgu;")
    public final class409 method2298(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = 36 / ((-arg1 - 28) / 41);
        return this.method2283((arg4 << 16) + arg0, (arg3 << 16) + arg2, 4, 6, null);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class397(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field5524 = arg2;
        this.field5514 = arg1;
        this.field5516 = arg0;
        field5520 = "Unknown";
        field5525 = "1.1";
        try {
            field5520 = System.getProperty("java.vendor");
            field5525 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field5518 = System.getProperty("os.name");
        } catch (Exception var11) {
            field5518 = "Unknown";
        }
        field5517 = field5518.toLowerCase();
        try {
            field5522 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field5522 = "";
        }
        try {
            field5512 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field5512 = "";
        }
        try {
            field5521 = System.getProperty("user.home");
            if (field5521 != null) {
                field5521 = field5521 + "/";
            }
        } catch (Exception var8) {
        }
        if (field5521 == null) {
            field5521 = "~/";
        }
        try {
            this.field5526 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field5536 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5536 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field5535 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5535 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field5531 = false;
        this.field5528 = new Thread(this);
        this.field5528.setPriority(10);
        this.field5528.setDaemon(true);
        this.field5528.start();
    }
}
