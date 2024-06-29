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

@OriginalClass("client!od")
public class class352 implements Runnable {

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Ljava/applet/Applet;")
    public Applet field5199 = null;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lam;")
    private class449 field5192 = null;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Z")
    private boolean field5202 = false;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lsh;")
    public class51 field5201 = null;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Lam;")
    private class449 field5187 = null;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lsh;")
    public class51 field5204 = null;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Lsh;")
    public class51 field5206 = null;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    private int field5191;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Ljava/lang/String;")
    private String field5189;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5184;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field5185;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field5196 = 3;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5200 = new Hashtable(16);

    @OriginalMember(owner = "client!od", name = "v", descriptor = "J")
    public static volatile long field5205 = 0L;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lfa;")
    private class159 field5195;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5186;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5188;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5190;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5193;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5194;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Ljava/lang/String;")
    private static String field5197;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Ljava/lang/String;")
    public static String field5203;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5207;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5208;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[Lsh;")
    public class51[] field5198;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lam;", line = 4)
    public final class449 method2183(Class arg0, String arg1, int arg2) {
        if (arg2 != 25556) {
            this.run();
        }
        return this.method2193(arg2 ^ 0x63D4, new Object[] { arg0, arg1 }, 9, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 14)
    public final void method2184(int arg0) {
        field5205 = class493.method2937(-59) + 5000L;
        int var2 = -44 % ((arg0 - 51) / 53);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lam;", line = 28)
    public final class449 method2185(int arg0, int arg1) {
        return arg0 == -1732301360 ? this.method2193(0, null, 3, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!od", name = "run", descriptor = "()V", line = 38)
    public final void run() {
        while (true) {
            class449 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5202) {
                        return;
                    }
                    if (this.field5187 != null) {
                        var2 = this.field5187;
                        this.field5187 = this.field5187.field6567;
                        if (this.field5187 == null) {
                            this.field5192 = null;
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
                int var3 = var2.field6566;
                if (var3 == 1) {
                    if (field5205 > class493.method2937(-68)) {
                        throw new IOException();
                    }
                    var2.field6569 = new Socket(InetAddress.getByName((String) var2.field6568), var2.field6565);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field6568);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field6565);
                    var2.field6569 = var4;
                } else if (var3 == 4) {
                    if (class493.method2937(-62) < field5205) {
                        throw new IOException();
                    }
                    var2.field6569 = new DataInputStream(((URL) var2.field6568).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field6568;
                    var2.field6569 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field6568;
                    var2.field6569 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6569 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field6568;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else {
                    throw new Exception("");
                }
                var2.field6570 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field6570 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;B)Lam;", line = 159)
    public final class449 method2186(String arg0, byte arg1) {
        if (arg1 > -102) {
            this.method2202(null, null, -72, (byte) -3, null, 77);
        }
        return this.method2193(0, arg0, 21, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/net/URL;)Lam;", line = 169)
    public final class449 method2187(int arg0, URL arg1) {
        if (arg0 != 2281) {
            this.field5202 = true;
        }
        return this.method2193(0, arg1, 4, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/lang/Class;)Lam;", line = 181)
    public final class449 method2188(byte arg0, Class arg1) {
        return arg0 == 41 ? this.method2193(0, arg1, 11, 0, 0) : null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lam;", line = 191)
    public final class449 method2189(int arg0) {
        if (arg0 != 7) {
            this.method2208(-99, -2, 70, null);
        }
        return this.method2193(0, null, 18, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Lam;", line = 203)
    public final class449 method2190(int arg0) {
        if (arg0 != 5) {
            this.field5187 = null;
        }
        return this.method2193(0, null, 5, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lam;", line = 219)
    public final class449 method2191(boolean arg0, Transferable arg1) {
        if (!arg0) {
            this.method2196(true, null);
        }
        return this.method2193(0, arg1, 19, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lam;", line = 230)
    public final class449 method2192(Component arg0, int arg1, boolean arg2) {
        if (arg1 != 10000) {
            method2209(null, -87, 106, null);
        }
        return this.method2193(0, arg0, 15, 0, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/Object;III)Lam;", line = 242)
    private final class449 method2193(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class449 var6 = new class449();
        if (arg0 != 0) {
            this.method2191(true, null);
        }
        var6.field6565 = arg4;
        var6.field6568 = arg1;
        var6.field6566 = arg2;
        synchronized (this) {
            if (this.field5192 == null) {
                this.field5192 = this.field5187 = var6;
            } else {
                this.field5192.field6567 = var6;
                this.field5192 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;ZI)Lam;", line = 272)
    public final class449 method2194(String arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            this.method2190(39);
        }
        return arg1 ? this.method2193(arg2, arg0, 12, 0, 0) : this.method2193(arg2, arg0, 13, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILjava/lang/Runnable;)Lam;", line = 287)
    public final class449 method2195(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 0) {
            field5194 = null;
        }
        return this.method2193(0, arg2, 2, 0, arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;", line = 300)
    public final File method2196(boolean arg0, String arg1) {
        return arg0 ? null : method2209(this.field5189, this.field5191, 108, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;I)Lam;", line = 314)
    public final class449 method2197(int arg0, String arg1, int arg2) {
        if (arg2 != 0) {
            field5194 = null;
        }
        return this.method2193(0, arg1, 1, 0, arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lam;", line = 327)
    public final class449 method2198(Class arg0, String arg1, Class[] arg2, boolean arg3) {
        if (!arg3) {
            this.method2197(-107, null, 24);
        }
        return this.method2193(0, new Object[] { arg0, arg1, arg2 }, 8, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Z", line = 339)
    public final boolean method2199(int arg0) {
        if (arg0 != 1) {
            this.method2190(-117);
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Class;I)V", line = 354)
    public final void method2200(Class arg0, int arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field5203.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        if (arg1 != 0) {
            field5197 = null;
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field5203.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method2196(false, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;I)Lam;", line = 395)
    public final class449 method2201(String arg0, int arg1) {
        int var3 = -5 % ((4 - arg1) / 52);
        return this.method2193(0, arg0, 16, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Point;[IIBLjava/awt/Component;I)Lam;", line = 404)
    public final class449 method2202(Point arg0, int[] arg1, int arg2, byte arg3, Component arg4, int arg5) {
        if (arg3 > -12) {
            field5208 = null;
        }
        return this.method2193(0, new Object[] { arg4, arg1, arg0 }, 17, arg2, arg5);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Ljava/lang/Class;I)Lam;", line = 414)
    public final class449 method2203(Class arg0, int arg1) {
        if (arg1 != 0) {
            field5196 = -46;
        }
        return this.method2193(0, arg0, 20, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Frame;I)Lam;", line = 424)
    public final class449 method2204(Frame arg0, int arg1) {
        if (arg1 != -12949) {
            this.method2202(null, null, 38, (byte) 0, null, -109);
        }
        return this.method2193(0, arg0, 7, 0, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIILjava/lang/Object;)Lam;", line = 434)
    private final class449 method2205(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class449 var6 = new class449();
        synchronized (var6) {
            var6.field6566 = arg1;
            var6.field6565 = arg2;
            var6.field6568 = arg4;
            synchronized (this) {
                if (this.field5192 == null) {
                    this.field5192 = this.field5187 = var6;
                } else {
                    this.field5192.field6567 = var6;
                    this.field5192 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
        }
        return arg3 == -26202 ? var6 : null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 707)
    public class352(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field5188 = "1.1";
        this.field5199 = arg0;
        this.field5191 = arg1;
        field5190 = "Unknown";
        this.field5189 = arg2;
        try {
            field5190 = System.getProperty("java.vendor");
            field5188 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field5193 = System.getProperty("os.name");
        } catch (Exception var11) {
            field5193 = "Unknown";
        }
        field5203 = field5193.toLowerCase();
        try {
            field5194 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field5194 = "";
        }
        try {
            field5186 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field5186 = "";
        }
        try {
            field5197 = System.getProperty("user.home");
            if (field5197 != null) {
                field5197 = field5197 + "/";
            }
        } catch (Exception var8) {
        }
        if (field5197 == null) {
            field5197 = "~/";
        }
        try {
            this.field5184 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field5208 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5208 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field5207 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5207 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field5202 = false;
        this.field5185 = new Thread(this);
        this.field5185.setPriority(10);
        this.field5185.setDaemon(true);
        this.field5185.start();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 473)
    public final void method2206(byte arg0) {
        synchronized (this) {
            if (arg0 != -125) {
                return;
            }
            this.field5202 = true;
            this.notifyAll();
        }
        try {
            this.field5185.join();
        } catch (InterruptedException var10) {
        }
        if (this.field5201 != null) {
            try {
                this.field5201.method496(-32307);
            } catch (IOException var9) {
            }
        }
        if (this.field5206 != null) {
            try {
                this.field5206.method496(-32307);
            } catch (IOException var8) {
            }
        }
        if (this.field5198 != null) {
            for (int var3 = 0; var3 < this.field5198.length; var3++) {
                if (this.field5198[var3] != null) {
                    try {
                        this.field5198[var3].method496(-32307);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field5204 != null) {
            try {
                this.field5204.method496(-32307);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIII)Lam;", line = 531)
    public final class449 method2207(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 107) {
            this.method2186(null, (byte) -109);
        }
        return this.method2193(0, null, 6, (arg3 << 16) + arg4, (arg2 << 16) + arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILjava/awt/Component;)Lam;", line = 541)
    public final class449 method2208(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 == -1686) {
            Point var5 = arg3.getLocationOnScreen();
            return this.method2193(0, null, 14, var5.y + arg0, var5.x + arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;", line = 557)
    public static final File method2209(String arg0, int arg1, int arg2, String arg3) {
        File var4 = (File) field5200.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5197, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        if (arg2 <= 97) {
            field5208 = null;
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg3;
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
                                field5200.put(arg3, var12);
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

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lfa;", line = 656)
    public final class159 method2210(boolean arg0) {
        if (!arg0) {
            this.method2189(126);
        }
        return this.field5195;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 674)
    public final byte[] method2211(int arg0, String arg1) {
        class449 var3 = this.method2205(0, 21, 0, -26202, arg1);
        return arg0 == -24846 ? (byte[]) var3.field6569 : null;
    }
}
