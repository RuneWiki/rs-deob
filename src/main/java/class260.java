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

@OriginalClass("client!hf")
public class class260 implements Runnable {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lko;")
    public class333 field3928 = null;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lko;")
    public class333 field3927 = null;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Luu;")
    private class180 field3936 = null;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Z")
    private boolean field3937 = false;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field3929 = null;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Lko;")
    public class333 field3946 = null;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Luu;")
    private class180 field3944 = null;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    private int field3930;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Ljava/lang/String;")
    private String field3941;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3932;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field3931;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field3942 = 3;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field3943 = new Hashtable(16);

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "J")
    public static volatile long field3951 = 0L;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Ltd;")
    private class301 field3939;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3933;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3934;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3935;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3940;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Ljava/lang/String;")
    private static String field3945;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3947;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3948;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3949;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3950;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[Lko;")
    public class333[] field3938;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Ltd;")
    public final class301 method1557(int arg0) {
        if (arg0 <= 40) {
            this.field3946 = null;
        }
        return this.field3939;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLjava/awt/Component;I)Luu;")
    public final class180 method1558(boolean arg0, Component arg1, int arg2) {
        if (arg2 != 15) {
            this.field3936 = null;
        }
        return this.method1577(0, 15, arg1, (byte) 96, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Luu;")
    public final class180 method1559(int arg0) {
        return arg0 <= 107 ? null : this.method1577(0, 5, null, (byte) 96, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Component;BI)Luu;")
    public final class180 method1560(int arg0, Component arg1, byte arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        if (arg2 >= -71) {
            this.field3946 = null;
        }
        return this.method1577(arg0 + var5.y, 14, null, (byte) 96, var5.x + arg3);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)Z")
    public final boolean method1561(int arg0) {
        if (arg0 != -35) {
            this.method1577(-14, -78, null, (byte) -74, -11);
        }
        return false;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/awt/Frame;)Luu;")
    public final class180 method1562(byte arg0, Frame arg1) {
        if (arg0 >= -100) {
            this.method1575(null, (byte) 38);
        }
        return this.method1577(0, 7, arg1, (byte) 96, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Luu;")
    public final class180 method1563(byte arg0, Transferable arg1) {
        if (arg0 != -52) {
            this.method1559(-66);
        }
        return this.method1577(0, 19, arg1, (byte) 96, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)Luu;")
    public final class180 method1564(int arg0, boolean arg1) {
        return arg1 ? null : this.method1577(0, 3, null, (byte) 96, arg0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Luu;")
    public final class180 method1565(byte arg0) {
        return arg0 == -49 ? this.method1577(0, 18, null, (byte) 96, 0) : null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/lang/Class;)Luu;")
    public final class180 method1566(byte arg0, Class arg1) {
        if (arg0 <= 91) {
            this.method1565((byte) -15);
        }
        return this.method1577(0, 20, arg1, (byte) 96, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Object;IIII)Luu;")
    private final class180 method1567(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class180 var6 = new class180();
        synchronized (var6) {
            if (arg4 != 2) {
                this.method1582(118, 126, (byte) 30, -3, -80);
            }
            var6.field2804 = arg2;
            var6.field2806 = arg0;
            var6.field2805 = arg3;
            synchronized (this) {
                if (this.field3936 == null) {
                    this.field3936 = this.field3944 = var6;
                } else {
                    this.field3936.field2807 = var6;
                    this.field3936 = var6;
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

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLjava/lang/String;)Luu;")
    public final class180 method1568(byte arg0, String arg1) {
        if (arg0 != 72) {
            method1571(-99, null, 20, null);
        }
        return this.method1577(0, 12, arg1, (byte) 96, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/Class;)Luu;")
    public final class180 method1569(int arg0, Class arg1) {
        if (arg0 >= -15) {
            this.method1574(30);
        }
        return this.method1577(0, 11, arg1, (byte) 96, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Luu;")
    public final class180 method1570(int arg0, Class arg1, String arg2) {
        return arg0 == 9 ? this.method1577(0, 9, new Object[] { arg1, arg2 }, (byte) 96, 0) : null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
    public static final File method1571(int arg0, String arg1, int arg2, String arg3) {
        if (arg2 != 16) {
            field3949 = null;
        }
        File var4 = (File) field3943.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3945, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg3;
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
                                field3943.put(arg3, var12);
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

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILjava/awt/Component;[IBLjava/awt/Point;)Luu;")
    public final class180 method1572(int arg0, int arg1, Component arg2, int[] arg3, byte arg4, Point arg5) {
        if (arg4 != 104) {
            this.method1573(null, (byte) 55, null, null);
        }
        return this.method1577(arg1, 17, new Object[] { arg2, arg3, arg5 }, (byte) 96, arg0);
    }

    @OriginalMember(owner = "client!hf", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class180 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3937) {
                        return;
                    }
                    if (this.field3944 != null) {
                        var2 = this.field3944;
                        this.field3944 = this.field3944.field2807;
                        if (this.field3944 == null) {
                            this.field3936 = null;
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
                int var3 = var2.field2804;
                if (var3 == 1) {
                    if (field3951 > class344.method2111((byte) -25)) {
                        throw new IOException();
                    }
                    var2.field2803 = new Socket(InetAddress.getByName((String) var2.field2806), var2.field2805);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2806);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2805);
                    var2.field2803 = var4;
                } else if (var3 == 4) {
                    if (class344.method2111((byte) -45) < field3951) {
                        throw new IOException();
                    }
                    var2.field2803 = new DataInputStream(((URL) var2.field2806).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2806;
                    var2.field2803 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field2806;
                    var2.field2803 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2803 = var9.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field2806;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else {
                    throw new Exception("");
                }
                var2.field2802 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field2802 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Luu;")
    public final class180 method1573(Class arg0, byte arg1, Class[] arg2, String arg3) {
        if (arg1 != 60) {
            this.field3937 = true;
        }
        return this.method1577(0, 8, new Object[] { arg0, arg3, arg2 }, (byte) 96, 0);
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public final void method1574(int arg0) {
        field3951 = class344.method2111((byte) -82) + (long) arg0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;B)Luu;")
    public final class180 method1575(String arg0, byte arg1) {
        if (arg1 < 71) {
            this.method1570(-74, null, null);
        }
        return this.method1577(0, 16, arg0, (byte) 96, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;)Luu;")
    public final class180 method1576(int arg0, String arg1) {
        return arg0 == -1 ? this.method1577(0, 21, arg1, (byte) 96, 0) : null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILjava/lang/Object;BI)Luu;")
    private final class180 method1577(int arg0, int arg1, Object arg2, byte arg3, int arg4) {
        if (arg3 != 96) {
            this.method1559(-69);
        }
        class180 var6 = new class180();
        var6.field2805 = arg4;
        var6.field2804 = arg1;
        var6.field2806 = arg2;
        synchronized (this) {
            if (this.field3936 == null) {
                this.field3936 = this.field3944 = var6;
            } else {
                this.field3936.field2807 = var6;
                this.field3936 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
    public final byte[] method1578(String arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            class180 var3 = this.method1567(arg0, 0, 21, 0, 2);
            return (byte[]) var3.field2803;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/Runnable;I)Luu;")
    public final class180 method1579(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 2) {
            field3933 = null;
        }
        return this.method1577(0, 2, arg1, (byte) 96, arg0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/net/URL;I)Luu;")
    public final class180 method1580(URL arg0, int arg1) {
        if (arg1 <= 78) {
            this.field3937 = false;
        }
        return this.method1577(0, 4, arg0, (byte) 96, 0);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
    public final File method1581(byte arg0, String arg1) {
        return arg0 == 121 ? method1571(this.field3930, this.field3941, 16, arg1) : null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBII)Luu;")
    public final class180 method1582(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -107) {
            this.method1584(false);
        }
        return this.method1577((arg1 << 16) + arg3, 6, null, (byte) 96, (arg0 << 16) + arg4);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;IB)Luu;")
    public final class180 method1583(String arg0, int arg1, byte arg2) {
        int var4 = -122 % ((arg2 + 34) / 49);
        return this.method1577(0, 1, arg0, (byte) 96, arg1);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public final void method1584(boolean arg0) {
        synchronized (this) {
            this.field3937 = arg0;
            this.notifyAll();
        }
        try {
            this.field3931.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3946 != null) {
            try {
                this.field3946.method2066(0);
            } catch (IOException var7) {
            }
        }
        if (this.field3928 != null) {
            try {
                this.field3928.method2066(0);
            } catch (IOException var6) {
            }
        }
        if (this.field3938 != null) {
            for (int var3 = 0; var3 < this.field3938.length; var3++) {
                if (this.field3938[var3] != null) {
                    try {
                        this.field3938[var3].method2066(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3927 != null) {
            try {
                this.field3927.method2066(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class260(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field3929 = arg0;
        field3947 = "Unknown";
        this.field3930 = arg1;
        this.field3941 = arg2;
        field3935 = "1.1";
        try {
            field3947 = System.getProperty("java.vendor");
            field3935 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3948 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3948 = "Unknown";
        }
        field3940 = field3948.toLowerCase();
        try {
            field3933 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3933 = "";
        }
        try {
            field3934 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3934 = "";
        }
        try {
            field3945 = System.getProperty("user.home");
            if (field3945 != null) {
                field3945 = field3945 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3945 == null) {
            field3945 = "~/";
        }
        try {
            this.field3932 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3949 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3949 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3950 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3950 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3937 = false;
        this.field3931 = new Thread(this);
        this.field3931.setPriority(10);
        this.field3931.setDaemon(true);
        this.field3931.start();
    }
}
