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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class353 implements Runnable {

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Lbca;")
    private class286 field5136 = null;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field5129 = null;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lin;")
    public class211 field5130 = null;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lin;")
    public class211 field5135 = null;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lbca;")
    private class286 field5139 = null;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Z")
    private boolean field5144 = false;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Lin;")
    public class211 field5146 = null;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    private int field5133;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Ljava/lang/String;")
    private String field5145;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5137;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field5141;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field5140 = 3;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5126 = new Hashtable(16);

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "J")
    public static volatile long field5148 = 0L;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lap;")
    private class38 field5132;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5125;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5127;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5128;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Ljava/lang/String;")
    private static String field5134;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5138;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5142;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5143;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5147;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5149;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[Lin;")
    public class211[] field5131;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;I)Lbca;", line = 4)
    public final class286 method2154(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field5146 = null;
        }
        return this.method2180(-1, arg0, 0, 0, 21);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Frame;)Lbca;", line = 15)
    public final class286 method2155(int arg0, Frame arg1) {
        int var3 = -106 / (-arg0 / 63);
        return this.method2180(-1, arg1, 0, 0, 7);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lbca;", line = 24)
    public final class286 method2156(Transferable arg0, int arg1) {
        if (arg1 != 2444) {
            field5148 = -27L;
        }
        return this.method2180(-1, arg0, 0, 0, 19);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Ljava/io/File;", line = 34)
    public static final File method2157(String arg0, byte arg1, String arg2, int arg3) {
        File var4 = (File) field5126.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5134, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        int var7 = 0;
        int var8 = -57 / ((-arg1 - 46) / 40);
        while (var7 < 2) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    String var11 = var5[var10] + var6[var9] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var7 != 0 || var13.exists()) {
                            String var14 = var5[var10];
                            if (var7 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var5[var10] + var6[var9])).mkdir();
                                if (arg2 != null) {
                                    (new File(var5[var10] + var6[var9] + "/" + arg2)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field5126.put(arg0, var13);
                                return var13;
                            }
                        }
                    } catch (Exception var18) {
                        try {
                            if (var12 != null) {
                                var12.close();
                                Object var16 = null;
                            }
                        } catch (Exception var17) {
                        }
                    }
                }
            }
            var7++;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 121)
    public final byte[] method2158(String arg0, byte arg1) {
        if (arg1 >= -50) {
            return null;
        } else {
            class286 var3 = this.method2161(0, 0, 21, false, arg0);
            return (byte[]) var3.field4213;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lbca;", line = 134)
    public final class286 method2159(int arg0, byte arg1, Runnable arg2) {
        if (arg1 != 26) {
            this.method2158(null, (byte) 102);
        }
        return this.method2180(-1, arg2, arg0, 0, 2);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Lbca;", line = 149)
    public final class286 method2160(byte arg0) {
        int var2 = -80 % ((arg0 + 65) / 55);
        return this.method2180(-1, null, 0, 0, 5);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIZLjava/lang/Object;)Lbca;", line = 164)
    private final class286 method2161(int arg0, int arg1, int arg2, boolean arg3, Object arg4) {
        class286 var6 = new class286();
        synchronized (var6) {
            var6.field4212 = arg4;
            if (arg3) {
                return null;
            }
            var6.field4210 = arg1;
            var6.field4211 = arg2;
            synchronized (this) {
                if (this.field5139 == null) {
                    this.field5139 = this.field5136 = var6;
                } else {
                    this.field5139.field4209 = var6;
                    this.field5139 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var12) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIBII)Lbca;", line = 205)
    public final class286 method2162(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 75) {
            this.method2156(null, 73);
        }
        return this.method2180(-1, null, (arg3 << 16) + arg4, (arg0 << 16) - -arg1, 6);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lbca;", line = 215)
    public final class286 method2163(Component arg0, int arg1, boolean arg2) {
        if (arg1 < 92) {
            this.method2158(null, (byte) 19);
        }
        return this.method2180(-1, arg0, arg2 ? 1 : 0, 0, 15);
    }

    @OriginalMember(owner = "client!uf", name = "run", descriptor = "()V", line = 226)
    public final void run() {
        while (true) {
            class286 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5144) {
                        return;
                    }
                    if (this.field5136 != null) {
                        var2 = this.field5136;
                        this.field5136 = this.field5136.field4209;
                        if (this.field5136 == null) {
                            this.field5139 = null;
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
                int var3 = var2.field4211;
                if (var3 == 1) {
                    if (class450.method2719((byte) -73) < field5148) {
                        throw new IOException();
                    }
                    var2.field4213 = new Socket(InetAddress.getByName((String) var2.field4212), var2.field4210);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4212);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4210);
                    var2.field4213 = var4;
                } else if (var3 == 4) {
                    if (field5148 > class450.method2719((byte) 121)) {
                        throw new IOException();
                    }
                    var2.field4213 = new DataInputStream(((URL) var2.field4212).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field4212;
                    var2.field4213 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field4212;
                    var2.field4213 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4213 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var8 = (Transferable) var2.field4212;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, null);
                } else {
                    throw new Exception("");
                }
                var2.field4208 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4208 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;BI)Lbca;", line = 352)
    public final class286 method2164(String arg0, byte arg1, int arg2) {
        return arg1 == -96 ? this.method2180(-1, arg0, arg2, 0, 1) : null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 366)
    public final void method2165(int arg0) {
        field5148 = class450.method2719((byte) -105) + 5000L;
        if (arg0 != 0) {
            this.method2170(null, -74, null);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lbca;", line = 376)
    public final class286 method2166(Class[] arg0, Class arg1, String arg2, int arg3) {
        if (arg3 > -127) {
            method2157(null, (byte) -39, null, -21);
        }
        return this.method2180(-1, new Object[] { arg1, arg2, arg0 }, 0, 0, 8);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/net/URL;I)Lbca;", line = 387)
    public final class286 method2167(URL arg0, int arg1) {
        int var3 = -63 % (-arg1 / 36);
        return this.method2180(-1, arg0, 0, 0, 4);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Lap;", line = 399)
    public final class38 method2168(int arg0) {
        if (arg0 >= -65) {
            this.method2171(-42);
        }
        return this.field5132;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lbca;", line = 411)
    public final class286 method2169(int arg0, int arg1) {
        if (arg1 < 95) {
            this.method2181(null, -91);
        }
        return this.method2180(-1, null, arg0, 0, 3);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/io/File;I[B)Z", line = 422)
    public final boolean method2170(File arg0, int arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg0);
            var4.write(arg2, 0, arg2.length);
            var4.close();
            if (arg1 != 2) {
                this.field5133 = -94;
            }
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 700)
    public class353(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field5138 = "1.1";
        field5127 = "Unknown";
        this.field5129 = arg0;
        this.field5133 = arg1;
        this.field5145 = arg2;
        try {
            field5127 = System.getProperty("java.vendor");
            field5138 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field5128 = System.getProperty("os.name");
        } catch (Exception var11) {
            field5128 = "Unknown";
        }
        field5142 = field5128.toLowerCase();
        try {
            field5125 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field5125 = "";
        }
        try {
            field5143 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field5143 = "";
        }
        try {
            field5134 = System.getProperty("user.home");
            if (field5134 != null) {
                field5134 = field5134 + "/";
            }
        } catch (Exception var8) {
        }
        if (field5134 == null) {
            field5134 = "~/";
        }
        try {
            this.field5137 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field5147 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5147 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field5149 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5149 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field5144 = false;
        this.field5141 = new Thread(this);
        this.field5141.setPriority(10);
        this.field5141.setDaemon(true);
        this.field5141.start();
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 447)
    public final void method2171(int arg0) {
        synchronized (this) {
            this.field5144 = true;
            this.notifyAll();
        }
        try {
            this.field5141.join();
        } catch (InterruptedException var8) {
        }
        if (this.field5130 != null) {
            try {
                this.field5130.method1367(0);
            } catch (IOException var7) {
            }
        }
        if (this.field5146 != null) {
            try {
                this.field5146.method1367(0);
            } catch (IOException var6) {
            }
        }
        if (this.field5131 != null) {
            for (int var3 = 0; var3 < this.field5131.length; var3++) {
                if (this.field5131[var3] != null) {
                    try {
                        this.field5131[var3].method1367(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field5135 != null) {
            try {
                this.field5135.method1367(0);
            } catch (IOException var4) {
            }
        }
        if (arg0 < 27) {
            this.method2171(-15);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([ILjava/awt/Point;IILjava/awt/Component;B)Lbca;", line = 513)
    public final class286 method2172(int[] arg0, Point arg1, int arg2, int arg3, Component arg4, byte arg5) {
        return arg5 == -74 ? this.method2180(arg5 + 73, new Object[] { arg4, arg0, arg1 }, arg3, arg2, 17) : null;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)Lbca;", line = 523)
    public final class286 method2173(int arg0) {
        return arg0 == -30551 ? this.method2180(arg0 ^ 0x7756, null, 0, 0, 18) : null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBILjava/awt/Component;)Lbca;", line = 534)
    public final class286 method2174(int arg0, byte arg1, int arg2, Component arg3) {
        if (arg1 == 113) {
            Point var5 = arg3.getLocationOnScreen();
            return this.method2180(arg1 ^ 0xFFFFFF8E, null, var5.x + arg0, var5.y + arg2, 14);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;IZ)Lbca;", line = 546)
    public final class286 method2175(String arg0, int arg1, boolean arg2) {
        if (arg1 < 3) {
            return null;
        } else if (arg2) {
            return this.method2180(-1, arg0, 0, 0, 12);
        } else {
            return this.method2180(-1, arg0, 0, 0, 13);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lbca;", line = 573)
    public final class286 method2176(String arg0, Class arg1, int arg2) {
        if (arg2 >= -43) {
            field5140 = 121;
        }
        return this.method2180(-1, new Object[] { arg1, arg0 }, 0, 0, 9);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 588)
    public final File method2177(String arg0, int arg1) {
        return arg1 == 0 ? method2157(arg0, (byte) -90, this.field5145, this.field5133) : null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z", line = 607)
    public final boolean method2178(byte arg0) {
        if (arg0 >= -104) {
            field5147 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/Class;B)V", line = 622)
    public final void method2179(Class arg0, byte arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field5142.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        if (arg1 != 45) {
            field5138 = null;
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field5142.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method2177("sw3d.dll", 0).toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/lang/Object;III)Lbca;", line = 658)
    private final class286 method2180(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class286 var6 = new class286();
        var6.field4212 = arg1;
        var6.field4210 = arg2;
        var6.field4211 = arg4;
        synchronized (this) {
            if (this.field5139 == null) {
                this.field5139 = this.field5136 = var6;
            } else {
                this.field5139.field4209 = var6;
                this.field5139 = var6;
            }
            this.notify();
            if (arg0 != -1) {
                method2157(null, (byte) -93, null, 98);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(Ljava/lang/String;I)Lbca;", line = 691)
    public final class286 method2181(String arg0, int arg1) {
        if (arg1 < 78) {
            this.method2165(77);
        }
        return this.method2180(-1, arg0, 0, 0, 16);
    }
}
