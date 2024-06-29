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

@OriginalClass("client!pq")
public class class165 implements Runnable {

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "Lvs;")
    private class506 field2015 = null;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "Lob;")
    public class627 field2019 = null;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field2014 = null;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "Lob;")
    public class627 field2021 = null;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "Z")
    private boolean field2013 = false;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "Lob;")
    public class627 field2029 = null;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "Lvs;")
    private class506 field2022 = null;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "Ljava/lang/String;")
    private String field2027;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2009;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field2017;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public static int field2028 = 3;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2023 = new Hashtable(16);

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "J")
    public static volatile long field2033 = 0L;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Lch;")
    private class392 field2020;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2010;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2011;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2012;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2016;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "Ljava/lang/String;")
    private static String field2018;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2026;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2030;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2031;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2032;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "[Lob;")
    public class627[] field2025;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILjava/lang/Object;B)Lvs;")
    private final class506 method897(int arg0, int arg1, int arg2, Object arg3, byte arg4) {
        class506 var6 = new class506();
        var6.field7029 = arg2;
        var6.field7027 = arg3;
        var6.field7028 = arg0;
        synchronized (this) {
            if (this.field2022 == null) {
                this.field2022 = this.field2015 = var6;
            } else {
                this.field2022.field7026 = var6;
                this.field2022 = var6;
            }
            if (arg4 > -62) {
                this.method904(null, -29);
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pq", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class506 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2013) {
                        return;
                    }
                    if (this.field2015 != null) {
                        var2 = this.field2015;
                        this.field2015 = this.field2015.field7026;
                        if (this.field2015 == null) {
                            this.field2022 = null;
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
                int var3 = var2.field7028;
                if (var3 == 1) {
                    if (class190.method1030(false) < field2033) {
                        throw new IOException();
                    }
                    var2.field7030 = new Socket(InetAddress.getByName((String) var2.field7027), var2.field7029);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field7027);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field7029);
                    var2.field7030 = var9;
                } else if (var3 == 4) {
                    if (field2033 > class190.method1030(false)) {
                        throw new IOException();
                    }
                    var2.field7030 = new DataInputStream(((URL) var2.field7027).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field7027;
                    var2.field7030 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field7027;
                    var2.field7030 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field7030 = var4.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field7027;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else {
                    throw new Exception("");
                }
                var2.field7031 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field7031 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;B)Lvs;")
    public final class506 method898(String arg0, byte arg1) {
        return arg1 == -44 ? this.method897(21, 0, 0, arg0, (byte) -103) : null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILjava/lang/Object;I)Lvs;")
    private final class506 method899(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class506 var6 = new class506();
        synchronized (var6) {
            var6.field7027 = arg3;
            var6.field7029 = arg2;
            if (arg1 != 0) {
                this.method900(58, 69, -4, null);
            }
            var6.field7028 = arg4;
            synchronized (this) {
                if (this.field2022 == null) {
                    this.field2022 = this.field2015 = var6;
                } else {
                    this.field2022.field7026 = var6;
                    this.field2022 = var6;
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

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILjava/awt/Component;)Lvs;")
    public final class506 method900(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        return arg2 == 7471 ? this.method897(14, var5.y + arg0, arg1 - -var5.x, null, (byte) -123) : null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BILjava/lang/Runnable;)Lvs;")
    public final class506 method901(byte arg0, int arg1, Runnable arg2) {
        if (arg0 > -83) {
            this.method901((byte) 42, -114, null);
        }
        return this.method897(2, 0, arg1, arg2, (byte) -123);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lvs;")
    public final class506 method902(Class[] arg0, byte arg1, String arg2, Class arg3) {
        if (arg1 != -71) {
            this.method924(37, null, 35);
        }
        return this.method897(8, 0, 0, new Object[] { arg3, arg2, arg0 }, (byte) -104);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/io/File;[B)Z")
    public final boolean method903(int arg0, File arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, 0, arg2.length);
            var4.close();
            if (arg0 <= 34) {
                this.method908((byte) 107);
            }
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lvs;")
    public final class506 method904(Frame arg0, int arg1) {
        if (arg1 > -19) {
            field2016 = null;
        }
        return this.method897(7, 0, 0, arg0, (byte) -108);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
    public final boolean method905(int arg0) {
        if (arg0 != 683) {
            this.field2017 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public final void method906(boolean arg0) {
        synchronized (this) {
            this.field2013 = true;
            this.notifyAll();
        }
        try {
            if (arg0) {
                return;
            }
            this.field2017.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2021 != null) {
            try {
                this.field2021.method3596((byte) -95);
            } catch (IOException var7) {
            }
        }
        if (this.field2029 != null) {
            try {
                this.field2029.method3596((byte) -95);
            } catch (IOException var6) {
            }
        }
        if (this.field2025 != null) {
            for (int var3 = 0; var3 < this.field2025.length; var3++) {
                if (this.field2025[var3] != null) {
                    try {
                        this.field2025[var3].method3596((byte) -95);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2019 != null) {
            try {
                this.field2019.method3596((byte) -95);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/Class;)V")
    public final void method907(int arg0, Class arg1) throws Exception {
        int var3 = 64 % ((-arg0 - 34) / 38);
        Class[] var4 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var5 = Runtime.getRuntime();
        Method var6 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field2026.startsWith("mac")) {
            Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var4);
            var6.invoke(var7, Boolean.TRUE);
            var7.invoke(var5, arg1, "jawt");
            var6.invoke(var7, Boolean.FALSE);
        }
        Method var8 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var4);
        var6.invoke(var8, Boolean.TRUE);
        if (!field2026.startsWith("win")) {
            throw new Exception();
        }
        var8.invoke(var5, arg1, this.method917(93, "sw3d.dll").toString());
        var6.invoke(var8, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Lvs;")
    public final class506 method908(byte arg0) {
        if (arg0 != -81) {
            this.method919(50, null);
        }
        return this.method897(5, 0, 0, null, (byte) -122);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Lvs;")
    public final class506 method909(int arg0) {
        if (arg0 >= -34) {
            this.method910(93);
        }
        return this.method897(18, 0, 0, null, (byte) -85);
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
    public final void method910(int arg0) {
        if (arg0 > -79) {
            field2012 = null;
        }
        field2033 = class190.method1030(false) + 5000L;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Ljava/lang/String;B)Lvs;")
    public final class506 method911(String arg0, byte arg1) {
        if (arg1 != 83) {
            this.field2022 = null;
        }
        return this.method897(16, 0, 0, arg0, (byte) -117);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;IZ)Lvs;")
    public final class506 method912(String arg0, int arg1, boolean arg2) {
        if (arg1 != -4588) {
            this.field2025 = null;
        }
        return arg2 ? this.method897(12, 0, 0, arg0, (byte) -106) : this.method897(13, 0, 0, arg0, (byte) -87);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lvs;")
    public final class506 method913(int arg0, Transferable arg1) {
        if (arg0 != 8) {
            this.method924(-82, null, 110);
        }
        return this.method897(19, 0, 0, arg1, (byte) -69);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lvs;")
    public final class506 method914(String arg0, Class arg1, byte arg2) {
        return arg2 >= -50 ? null : this.method897(9, 0, 0, new Object[] { arg1, arg0 }, (byte) -86);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;I[I)Lvs;")
    public final class506 method915(int arg0, int arg1, Component arg2, Point arg3, int arg4, int[] arg5) {
        int var7 = -69 % ((arg4 - 31) / 32);
        return this.method897(17, arg0, arg1, new Object[] { arg2, arg5, arg3 }, (byte) -111);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Lvs;")
    public final class506 method916(int arg0, int arg1) {
        if (arg0 != 15135) {
            this.field2021 = null;
        }
        return this.method897(3, 0, arg1, null, (byte) -116);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
    public final File method917(int arg0, String arg1) {
        int var3 = -11 / ((2 - arg0) / 32);
        return method918(arg1, this.field2027, this.field2024, false);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)Ljava/io/File;")
    public static final File method918(String arg0, String arg1, int arg2, boolean arg3) {
        File var4 = (File) field2023.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2018, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        if (arg3) {
            field2030 = null;
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg1 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg1)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field2023.put(arg0, var12);
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

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/net/URL;)Lvs;")
    public final class506 method919(int arg0, URL arg1) {
        if (arg0 != 0) {
            field2033 = -110L;
        }
        return this.method897(4, 0, 0, arg1, (byte) -114);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILjava/lang/String;)[B")
    public final byte[] method920(int arg0, String arg1) {
        class506 var3 = this.method899(0, 0, 0, arg1, 21);
        int var4 = -128 % ((arg0 - 51) / 62);
        return (byte[]) var3.field7030;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLjava/awt/Component;I)Lvs;")
    public final class506 method921(boolean arg0, Component arg1, int arg2) {
        if (arg2 != 0) {
            field2011 = null;
        }
        return this.method897(15, 0, arg0 ? 1 : 0, arg1, (byte) -90);
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Lch;")
    public final class392 method922(int arg0) {
        int var2 = -35 % ((arg0 + 11) / 55);
        return this.field2020;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BIIII)Lvs;")
    public final class506 method923(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 == 73 ? this.method897(6, (arg2 << 16) + arg3, (arg4 << 16) + arg1, null, (byte) -107) : null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;I)Lvs;")
    public final class506 method924(int arg0, String arg1, int arg2) {
        return arg2 == 1 ? this.method897(1, 0, arg0, arg1, (byte) -91) : null;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class165(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2014 = arg0;
        this.field2027 = arg2;
        this.field2024 = arg1;
        field2016 = "Unknown";
        field2030 = "1.1";
        try {
            field2016 = System.getProperty("java.vendor");
            field2030 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2011 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2011 = "Unknown";
        }
        field2026 = field2011.toLowerCase();
        try {
            field2010 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2010 = "";
        }
        try {
            field2012 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2012 = "";
        }
        try {
            field2018 = System.getProperty("user.home");
            if (field2018 != null) {
                field2018 = field2018 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2018 == null) {
            field2018 = "~/";
        }
        try {
            this.field2009 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2032 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2032 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2031 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2031 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2013 = false;
        this.field2017 = new Thread(this);
        this.field2017.setPriority(10);
        this.field2017.setDaemon(true);
        this.field2017.start();
    }
}
