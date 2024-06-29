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

@OriginalClass("client!pc")
public class class476 implements Runnable {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lcw;")
    private class121 field6890 = null;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field6891 = null;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Z")
    private boolean field6906 = false;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Len;")
    public class210 field6901 = null;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Len;")
    public class210 field6903 = null;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Lcw;")
    private class121 field6910 = null;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Len;")
    public class210 field6907 = null;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    private int field6893;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Ljava/lang/String;")
    private String field6888;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6904;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field6892;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field6902 = 3;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field6900 = new Hashtable(16);

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "J")
    public static volatile long field6908 = 0L;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Leu;")
    private class336 field6897;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6887;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6894;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6895;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6896;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Ljava/lang/String;")
    private static String field6898;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6899;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field6905;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6909;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6911;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[Len;")
    public class210[] field6889;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lcw;")
    public final class121 method2868(int arg0) {
        if (arg0 != -25232) {
            this.method2879(-83, 86);
        }
        return this.method2877(0, 5, null, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lcw;")
    public final class121 method2869(Transferable arg0, byte arg1) {
        int var3 = -102 / ((arg1 - 6) / 43);
        return this.method2877(0, 19, arg0, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZILjava/lang/Runnable;)Lcw;")
    public final class121 method2870(boolean arg0, int arg1, Runnable arg2) {
        if (arg0) {
            this.field6889 = null;
        }
        return this.method2877(arg1, 2, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[IIB)Lcw;")
    public final class121 method2871(int arg0, Point arg1, Component arg2, int[] arg3, int arg4, byte arg5) {
        int var7 = -12 % ((arg5 + 26) / 61);
        return this.method2877(arg0, 17, new Object[] { arg2, arg3, arg1 }, false, arg4);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Leu;")
    public final class336 method2872(byte arg0) {
        return arg0 >= -76 ? null : this.field6897;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/Class;)Lcw;")
    public final class121 method2873(int arg0, Class arg1) {
        if (arg0 != 0) {
            this.method2883(69, null);
        }
        return this.method2877(0, 11, arg1, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/net/URL;)Lcw;")
    public final class121 method2874(int arg0, URL arg1) {
        return arg0 > -84 ? null : this.method2877(0, 4, arg1, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILjava/awt/Component;)Lcw;")
    public final class121 method2875(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        if (arg0 < 48) {
            this.method2884(-73);
        }
        return this.method2877(var5.x + arg1, 14, null, false, arg2 + var5.y);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lcw;")
    public final class121 method2876(boolean arg0, Class[] arg1, Class arg2, String arg3) {
        if (arg0) {
            this.method2883(30, null);
        }
        return this.method2877(0, 8, new Object[] { arg2, arg3, arg1 }, arg0, 0);
    }

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class121 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6906) {
                        return;
                    }
                    if (this.field6890 != null) {
                        var2 = this.field6890;
                        this.field6890 = this.field6890.field1629;
                        if (this.field6890 == null) {
                            this.field6910 = null;
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
                int var3 = var2.field1626;
                if (var3 == 1) {
                    if (class504.method3034((byte) -102) < field6908) {
                        throw new IOException();
                    }
                    var2.field1627 = new Socket(InetAddress.getByName((String) var2.field1630), var2.field1631);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1630);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1631);
                    var2.field1627 = var4;
                } else if (var3 == 4) {
                    if (class504.method3034((byte) -115) < field6908) {
                        throw new IOException();
                    }
                    var2.field1627 = new DataInputStream(((URL) var2.field1630).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1630;
                    var2.field1627 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field1630;
                    var2.field1627 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field1627 = var8.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field1630;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else {
                    throw new Exception("");
                }
                var2.field1628 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field1628 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILjava/lang/Object;ZI)Lcw;")
    private final class121 method2877(int arg0, int arg1, Object arg2, boolean arg3, int arg4) {
        class121 var6 = new class121();
        var6.field1626 = arg1;
        var6.field1631 = arg0;
        var6.field1630 = arg2;
        synchronized (this) {
            if (arg3) {
                this.method2883(23, null);
            }
            if (this.field6910 == null) {
                this.field6910 = this.field6890 = var6;
            } else {
                this.field6910.field1629 = var6;
                this.field6910 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Z")
    public final boolean method2878(boolean arg0) {
        if (arg0) {
            field6887 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lcw;")
    public final class121 method2879(int arg0, int arg1) {
        if (arg1 != -3390) {
            field6911 = null;
        }
        return this.method2877(arg0, 3, null, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
    public final File method2880(byte arg0, String arg1) {
        if (arg0 != 72) {
            this.method2868(64);
        }
        return method2893(this.field6893, (byte) 118, arg1, this.field6888);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZBLjava/awt/Component;)Lcw;")
    public final class121 method2881(boolean arg0, byte arg1, Component arg2) {
        if (arg1 != 108) {
            this.field6904 = null;
        }
        return this.method2877(arg0 ? 1 : 0, 15, arg2, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;ZB)Lcw;")
    public final class121 method2882(String arg0, boolean arg1, byte arg2) {
        if (arg2 >= -5) {
            field6902 = 116;
        }
        return arg1 ? this.method2877(0, 12, arg0, false, 0) : this.method2877(0, 13, arg0, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public final byte[] method2883(int arg0, String arg1) {
        class121 var3 = this.method2895(21, arg1, arg0, (byte) -78, 0);
        return (byte[]) var3.field1627;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public final void method2884(int arg0) {
        field6908 = (long) arg0 + class504.method3034((byte) -122);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lcw;")
    public final class121 method2885(String arg0, byte arg1, Class arg2) {
        return arg1 <= 120 ? null : this.method2877(0, 9, new Object[] { arg2, arg0 }, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/Class;)Lcw;")
    public final class121 method2886(byte arg0, Class arg1) {
        if (arg0 != 75) {
            this.method2883(-90, null);
        }
        return this.method2877(0, 20, arg1, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;B)Lcw;")
    public final class121 method2887(String arg0, byte arg1) {
        if (arg1 != -71) {
            this.field6907 = null;
        }
        return this.method2877(0, 16, arg0, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;IB)Lcw;")
    public final class121 method2888(String arg0, int arg1, byte arg2) {
        if (arg2 != 91) {
            this.field6888 = null;
        }
        return this.method2877(arg1, 1, arg0, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Lcw;")
    public final class121 method2889(int arg0) {
        if (arg0 < 103) {
            this.method2879(65, -63);
        }
        return this.method2877(0, 18, null, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public final void method2890(int arg0) {
        synchronized (this) {
            this.field6906 = true;
            this.notifyAll();
        }
        if (arg0 != 27251) {
            this.field6907 = null;
        }
        try {
            this.field6892.join();
        } catch (InterruptedException var8) {
        }
        if (this.field6903 != null) {
            try {
                this.field6903.method1303((byte) -66);
            } catch (IOException var7) {
            }
        }
        if (this.field6901 != null) {
            try {
                this.field6901.method1303((byte) -66);
            } catch (IOException var6) {
            }
        }
        if (this.field6889 != null) {
            for (int var3 = 0; var3 < this.field6889.length; var3++) {
                if (this.field6889[var3] != null) {
                    try {
                        this.field6889[var3].method1303((byte) -66);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6907 != null) {
            try {
                this.field6907.method1303((byte) -66);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Frame;I)Lcw;")
    public final class121 method2891(Frame arg0, int arg1) {
        int var3 = 127 % ((arg1 + 9) / 51);
        return this.method2877(0, 7, arg0, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;Z)Lcw;")
    public final class121 method2892(String arg0, boolean arg1) {
        if (arg1) {
            this.method2882(null, true, (byte) 114);
        }
        return this.method2877(0, 21, arg0, false, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    public static final File method2893(int arg0, byte arg1, String arg2, String arg3) {
        File var4 = (File) field6900.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field6898, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg2;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg3 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg3)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field6900.put(arg2, var12);
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
        if (arg1 <= 116) {
            field6900 = null;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZII)Lcw;")
    public final class121 method2894(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        return arg2 ? this.method2877((arg4 << 16) + arg1, 6, null, false, (arg3 << 16) + arg0) : null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lcw;")
    private final class121 method2895(int arg0, Object arg1, int arg2, byte arg3, int arg4) {
        class121 var6 = new class121();
        synchronized (var6) {
            var6.field1631 = arg4;
            var6.field1630 = arg1;
            var6.field1626 = arg0;
            synchronized (this) {
                if (arg3 != -78) {
                    this.method2892(null, false);
                }
                if (this.field6910 == null) {
                    this.field6910 = this.field6890 = var6;
                } else {
                    this.field6910.field1629 = var6;
                    this.field6910 = var6;
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

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILjava/lang/Class;)V")
    public final void method2896(int arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        if (arg0 != 2) {
            return;
        }
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field6896.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field6896.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method2880((byte) 72, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class476(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field6893 = arg1;
        this.field6891 = arg0;
        field6899 = "1.1";
        this.field6888 = arg2;
        field6887 = "Unknown";
        try {
            field6887 = System.getProperty("java.vendor");
            field6899 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field6905 = System.getProperty("os.name");
        } catch (Exception var11) {
            field6905 = "Unknown";
        }
        field6896 = field6905.toLowerCase();
        try {
            field6894 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field6894 = "";
        }
        try {
            field6895 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field6895 = "";
        }
        try {
            field6898 = System.getProperty("user.home");
            if (field6898 != null) {
                field6898 = field6898 + "/";
            }
        } catch (Exception var8) {
        }
        if (field6898 == null) {
            field6898 = "~/";
        }
        try {
            this.field6904 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field6909 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field6909 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field6911 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field6911 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field6906 = false;
        this.field6892 = new Thread(this);
        this.field6892.setPriority(10);
        this.field6892.setDaemon(true);
        this.field6892.start();
    }
}
