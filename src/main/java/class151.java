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

@OriginalClass("client!nt")
public class class151 implements Runnable {

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "Lum;")
    private class370 field2152 = null;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Lst;")
    public class302 field2151 = null;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Lst;")
    public class302 field2156 = null;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "Lst;")
    public class302 field2168 = null;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "Z")
    private boolean field2160 = false;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field2165 = null;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "Lum;")
    private class370 field2171 = null;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Ljava/lang/String;")
    private String field2153;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    private int field2162;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2154;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field2163;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public static int field2158 = 3;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2166 = new Hashtable(16);

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "J")
    public static volatile long field2173 = 0L;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "Lmi;")
    private class348 field2161;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2155;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2157;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2159;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2164;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2167;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2170;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "Ljava/lang/String;")
    private static String field2172;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2174;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2175;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "[Lst;")
    public class302[] field2169;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
    public final void method947(byte arg0) {
        synchronized (this) {
            this.field2160 = true;
            this.notifyAll();
        }
        try {
            this.field2163.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2151 != null) {
            try {
                this.field2151.method1844((byte) 102);
            } catch (IOException var7) {
            }
        }
        if (this.field2168 != null) {
            try {
                this.field2168.method1844((byte) 112);
            } catch (IOException var6) {
            }
        }
        if (this.field2169 != null) {
            for (int var3 = 0; var3 < this.field2169.length; var3++) {
                if (this.field2169[var3] != null) {
                    try {
                        this.field2169[var3].method1844((byte) 87);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2156 != null) {
            try {
                this.field2156.method1844((byte) 98);
            } catch (IOException var4) {
            }
        }
        if (arg0 != -94) {
            this.field2168 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;B)Lum;")
    public final class370 method948(String arg0, byte arg1) {
        if (arg1 != 64) {
            this.field2162 = -84;
        }
        return this.method949(arg1 - 64, 0, 0, arg0, 16);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILjava/lang/Object;I)Lum;")
    private final class370 method949(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class370 var6 = new class370();
        var6.field5275 = arg1;
        var6.field5278 = arg4;
        var6.field5279 = arg3;
        synchronized (this) {
            if (this.field2152 == null) {
                this.field2152 = this.field2171 = var6;
            } else {
                this.field2152.field5276 = var6;
                this.field2152 = var6;
            }
            if (arg0 != 0) {
                field2158 = -93;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/String;I)Lum;")
    public final class370 method950(boolean arg0, String arg1, int arg2) {
        if (arg2 != 0) {
            this.field2162 = 30;
        }
        return arg0 ? this.method949(0, 0, 0, arg1, 12) : this.method949(0, 0, 0, arg1, 13);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/Class;)Lum;")
    public final class370 method951(boolean arg0, Class arg1) {
        if (arg0) {
            field2155 = null;
        }
        return this.method949(0, 0, 0, arg1, 20);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lum;")
    public final class370 method952(String arg0, int arg1, Class arg2) {
        if (arg1 != 19824) {
            this.method974(null, null, (byte) -72, null);
        }
        return this.method949(0, 0, 0, new Object[] { arg2, arg0 }, 9);
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)Lum;")
    public final class370 method953(byte arg0) {
        if (arg0 < 69) {
            field2155 = null;
        }
        return this.method949(0, 0, 0, null, 18);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILjava/lang/Object;IB)Lum;")
    private final class370 method954(int arg0, int arg1, Object arg2, int arg3, byte arg4) {
        class370 var6 = new class370();
        synchronized (var6) {
            var6.field5279 = arg2;
            var6.field5275 = arg3;
            var6.field5278 = arg1;
            synchronized (this) {
                if (this.field2152 == null) {
                    this.field2152 = this.field2171 = var6;
                } else {
                    this.field2152.field5276 = var6;
                    this.field2152 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
                if (arg4 != 8) {
                    this.method951(true, null);
                }
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILjava/awt/Component;)Lum;")
    public final class370 method955(int arg0, int arg1, int arg2, Component arg3) {
        if (arg2 != 14) {
            method957(null, null, 93, (byte) 115);
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method949(0, var5.x + arg0, var5.y + arg1, null, 14);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/String;)[B")
    public final byte[] method956(boolean arg0, String arg1) {
        if (arg0) {
            class370 var3 = this.method954(0, 21, arg1, 0, (byte) 8);
            return (byte[]) var3.field5274;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class370 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2160) {
                        return;
                    }
                    if (this.field2171 != null) {
                        var2 = this.field2171;
                        this.field2171 = this.field2171.field5276;
                        if (this.field2171 == null) {
                            this.field2152 = null;
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
                int var3 = var2.field5278;
                if (var3 == 1) {
                    if (field2173 > class465.method2699((byte) 14)) {
                        throw new IOException();
                    }
                    var2.field5274 = new Socket(InetAddress.getByName((String) var2.field5279), var2.field5275);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field5279);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field5275);
                    var2.field5274 = var4;
                } else if (var3 == 4) {
                    if (class465.method2699((byte) 14) < field2173) {
                        throw new IOException();
                    }
                    var2.field5274 = new DataInputStream(((URL) var2.field5279).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field5279;
                    var2.field5274 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field5279;
                    var2.field5274 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5274 = var8.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field5279;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else {
                    throw new Exception("");
                }
                var2.field5277 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field5277 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static final File method957(String arg0, String arg1, int arg2, byte arg3) {
        File var4 = (File) field2166.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2172, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
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
                                field2166.put(arg1, var12);
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
        if (arg3 != 5) {
            method957(null, null, 81, (byte) -80);
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lum;")
    public final class370 method958(byte arg0, Runnable arg1, int arg2) {
        if (arg0 <= 64) {
            this.field2169 = null;
        }
        return this.method949(0, arg2, 0, arg1, 2);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILjava/lang/String;)Lum;")
    public final class370 method959(int arg0, int arg1, String arg2) {
        if (arg0 != -26521) {
            field2174 = null;
        }
        return this.method949(0, arg1, 0, arg2, 1);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Lum;")
    public final class370 method960(int arg0, int arg1) {
        if (arg0 >= -111) {
            this.field2163 = null;
        }
        return this.method949(0, arg1, 0, null, 3);
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(B)Z")
    public final boolean method961(byte arg0) {
        if (arg0 > -107) {
            this.method964(true, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLjava/awt/Frame;)Lum;")
    public final class370 method962(byte arg0, Frame arg1) {
        return arg0 < 53 ? null : this.method949(0, 0, 0, arg1, 7);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)Lmi;")
    public final class348 method963(boolean arg0) {
        if (arg0) {
            this.field2156 = null;
        }
        return this.field2161;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(ZLjava/lang/Class;)Lum;")
    public final class370 method964(boolean arg0, Class arg1) {
        if (arg0) {
            this.method966(-119);
        }
        return this.method949(0, 0, 0, arg1, 11);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/Class;B)V")
    public final void method965(Class arg0, byte arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        if (arg1 <= 60) {
            this.method971(77, 79, 88, null, null, null);
        }
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field2159.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field2159.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method972(false, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Lum;")
    public final class370 method966(int arg0) {
        return arg0 == 1 ? this.method949(0, 0, 0, null, 5) : null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lum;")
    public final class370 method967(Component arg0, boolean arg1, int arg2) {
        int var4 = -41 % ((63 - arg2) / 58);
        return this.method949(0, arg1 ? 1 : 0, 0, arg0, 15);
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(B)V")
    public final void method968(byte arg0) {
        if (arg0 < 79) {
            this.method959(-109, 63, null);
        }
        field2173 = class465.method2699((byte) 14) + 5000L;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/net/URL;I)Lum;")
    public final class370 method969(URL arg0, int arg1) {
        if (arg1 != 0) {
            field2172 = null;
        }
        return this.method949(0, 0, 0, arg0, 4);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lum;")
    public final class370 method970(byte arg0, Transferable arg1) {
        int var3 = -43 / ((59 - arg0) / 59);
        return this.method949(0, 0, 0, arg1, 19);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILjava/awt/Point;Ljava/awt/Component;[I)Lum;")
    public final class370 method971(int arg0, int arg1, int arg2, Point arg3, Component arg4, int[] arg5) {
        if (arg0 != 19) {
            this.field2165 = null;
        }
        return this.method949(0, arg2, arg1, new Object[] { arg4, arg5, arg3 }, 17);
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
    public final File method972(boolean arg0, String arg1) {
        if (arg0) {
            field2170 = null;
        }
        return method957(this.field2153, arg1, this.field2162, (byte) 5);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIB)Lum;")
    public final class370 method973(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 48) {
            this.method967(null, true, 57);
        }
        return this.method949(0, (arg3 << 16) + arg0, (arg1 << 16) - -arg2, null, 6);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;BLjava/lang/String;)Lum;")
    public final class370 method974(Class[] arg0, Class arg1, byte arg2, String arg3) {
        if (arg2 != 59) {
            field2158 = -42;
        }
        return this.method949(0, 0, 0, new Object[] { arg1, arg3, arg0 }, 8);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;I)Lum;")
    public final class370 method975(String arg0, int arg1) {
        return arg1 <= 93 ? null : this.method949(0, 0, 0, arg0, 21);
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class151(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2153 = arg2;
        field2164 = "1.1";
        this.field2162 = arg1;
        field2167 = "Unknown";
        this.field2165 = arg0;
        try {
            field2167 = System.getProperty("java.vendor");
            field2164 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2157 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2157 = "Unknown";
        }
        field2159 = field2157.toLowerCase();
        try {
            field2170 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2170 = "";
        }
        try {
            field2155 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2155 = "";
        }
        try {
            field2172 = System.getProperty("user.home");
            if (field2172 != null) {
                field2172 = field2172 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2172 == null) {
            field2172 = "~/";
        }
        try {
            this.field2154 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2174 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2174 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2175 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2175 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2160 = false;
        this.field2163 = new Thread(this);
        this.field2163.setPriority(10);
        this.field2163.setDaemon(true);
        this.field2163.start();
    }
}
