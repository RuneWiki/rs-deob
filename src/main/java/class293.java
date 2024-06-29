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

@OriginalClass("client!li")
public class class293 implements Runnable {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lve;")
    public class346 field4163 = null;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lve;")
    public class346 field4166 = null;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Lcq;")
    private class324 field4168 = null;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Lve;")
    public class346 field4176 = null;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field4170 = null;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Z")
    private boolean field4182 = false;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Lcq;")
    private class324 field4178 = null;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    private int field4171;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "Ljava/lang/String;")
    private String field4174;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4180;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field4177;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field4179 = 3;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field4172 = new Hashtable(16);

    @OriginalMember(owner = "client!li", name = "x", descriptor = "J")
    public static volatile long field4185 = 0L;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lol;")
    private class186 field4164;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Ljava/lang/String;")
    private static String field4162;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4165;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4167;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4169;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4175;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4181;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4183;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4184;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4186;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "[Lve;")
    public class346[] field4173;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)Lcq;")
    public final class324 method1844(int arg0, String arg1) {
        int var3 = 1 / ((-arg0 - 28) / 61);
        return this.method1867(0, 0, 21, 44, arg1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Ljava/io/File;")
    public static final File method1845(String arg0, String arg1, boolean arg2, int arg3) {
        File var4 = (File) field4172.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4162, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        if (arg2) {
            field4185 = -10L;
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
                                field4172.put(arg0, var12);
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

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/Frame;I)Lcq;")
    public final class324 method1846(Frame arg0, int arg1) {
        return arg1 == 7 ? this.method1867(0, 0, 7, 74, arg0) : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public final void method1847(int arg0) {
        synchronized (this) {
            this.field4182 = true;
            this.notifyAll();
        }
        try {
            this.field4177.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 != 0) {
            return;
        }
        if (this.field4166 != null) {
            try {
                this.field4166.method2199((byte) -122);
            } catch (IOException var7) {
            }
        }
        if (this.field4163 != null) {
            try {
                this.field4163.method2199((byte) -122);
            } catch (IOException var6) {
            }
        }
        if (this.field4173 != null) {
            for (int var3 = 0; var3 < this.field4173.length; var3++) {
                if (this.field4173[var3] != null) {
                    try {
                        this.field4173[var3].method2199((byte) -122);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4176 != null) {
            try {
                this.field4176.method2199((byte) -122);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)Lcq;")
    public final class324 method1848(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg1 == 12 ? this.method1867((arg3 << 16) + arg2, (arg0 << 16) + arg4, 6, -125, null) : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILjava/lang/Object;II)Lcq;")
    private final class324 method1849(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class324 var6 = new class324();
        synchronized (var6) {
            if (arg3 != -9) {
                return null;
            }
            var6.field4941 = arg4;
            var6.field4942 = arg2;
            var6.field4943 = arg1;
            synchronized (this) {
                if (this.field4168 == null) {
                    this.field4168 = this.field4178 = var6;
                } else {
                    this.field4168.field4944 = var6;
                    this.field4168 = var6;
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

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lcq;")
    public final class324 method1850(int arg0, String arg1, Class arg2) {
        if (arg0 != -10) {
            field4172 = null;
        }
        return this.method1867(0, 0, 9, 70, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Lcq;")
    public final class324 method1851(int arg0) {
        return arg0 > -1 ? null : this.method1867(0, 0, 18, 53, null);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;B)Lcq;")
    public final class324 method1852(int arg0, String arg1, byte arg2) {
        if (arg2 != 38) {
            this.method1847(22);
        }
        return this.method1867(0, arg0, 1, 101, arg1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Lcq;")
    public final class324 method1853(int arg0, byte arg1) {
        if (arg1 >= -106) {
            this.method1846(null, -100);
        }
        return this.method1867(0, arg0, 3, -118, null);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/net/URL;)Lcq;")
    public final class324 method1854(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.method1847(3);
        }
        return this.method1867(0, 0, 4, -97, arg1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Z")
    public final boolean method1855(boolean arg0) {
        if (arg0) {
            this.method1854(66, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(ILjava/lang/String;)Lcq;")
    public final class324 method1856(int arg0, String arg1) {
        if (arg0 != 0) {
            field4169 = null;
        }
        return this.method1867(0, 0, 12, 102, arg1);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public final void method1857(int arg0) {
        field4185 = class211.method1419(12921) + 5000L;
        if (arg0 != 5000) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/Class;)V")
    public final void method1858(int arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (arg0 != 4) {
            field4167 = null;
        }
        if (!field4167.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field4167.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method1872(true, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lcq;")
    public final class324 method1859(int arg0, boolean arg1, Runnable arg2) {
        return arg1 ? this.method1867(0, arg0, 2, -125, arg2) : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lcq;")
    public final class324 method1860(boolean arg0, Transferable arg1) {
        if (arg0) {
            this.method1856(90, null);
        }
        return this.method1867(0, 0, 19, -96, arg1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILjava/awt/Component;)Lcq;")
    public final class324 method1861(boolean arg0, int arg1, Component arg2) {
        if (arg1 <= 88) {
            this.method1869(null, (byte) -68);
        }
        return this.method1867(0, arg0 ? 1 : 0, 15, 51, arg2);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLjava/lang/String;)Lcq;")
    public final class324 method1862(boolean arg0, String arg1) {
        return arg0 ? null : this.method1867(0, 0, 16, -109, arg1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBILjava/awt/Component;)Lcq;")
    public final class324 method1863(int arg0, byte arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        return arg1 == -14 ? this.method1867(arg2 + var5.y, arg0 - -var5.x, 14, 81, null) : null;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)Lol;")
    public final class186 method1864(int arg0) {
        if (arg0 != -34009168) {
            this.method1867(6, 105, 24, -117, null);
        }
        return this.field4164;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLjava/lang/Class;)Lcq;")
    public final class324 method1865(boolean arg0, Class arg1) {
        if (arg0) {
            this.method1866(-124, -120, (byte) -73, null, null, null);
        }
        return this.method1867(0, 0, 11, -119, arg1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB[ILjava/awt/Point;Ljava/awt/Component;)Lcq;")
    public final class324 method1866(int arg0, int arg1, byte arg2, int[] arg3, Point arg4, Component arg5) {
        return arg2 == -2 ? this.method1867(arg0, arg1, 17, -108, new Object[] { arg5, arg3, arg4 }) : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIILjava/lang/Object;)Lcq;")
    private final class324 method1867(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class324 var6 = new class324();
        var6.field4943 = arg1;
        var6.field4941 = arg2;
        var6.field4942 = arg4;
        synchronized (this) {
            int var8 = -73 / ((arg3 + 40) / 54);
            if (this.field4168 == null) {
                this.field4168 = this.field4178 = var6;
            } else {
                this.field4168.field4944 = var6;
                this.field4168 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lcq;")
    public final class324 method1868(int arg0, Class arg1, Class[] arg2, String arg3) {
        if (arg0 != 0) {
            this.field4170 = null;
        }
        return this.method1867(0, 0, 8, 30, new Object[] { arg1, arg3, arg2 });
    }

    @OriginalMember(owner = "client!li", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class324 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4182) {
                        return;
                    }
                    if (this.field4178 != null) {
                        var2 = this.field4178;
                        this.field4178 = this.field4178.field4944;
                        if (this.field4178 == null) {
                            this.field4168 = null;
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
                int var3 = var2.field4941;
                if (var3 == 1) {
                    if (field4185 > class211.method1419(12921)) {
                        throw new IOException();
                    }
                    var2.field4939 = new Socket(InetAddress.getByName((String) var2.field4942), var2.field4943);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field4942);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field4943);
                    var2.field4939 = var9;
                } else if (var3 == 4) {
                    if (class211.method1419(12921) < field4185) {
                        throw new IOException();
                    }
                    var2.field4939 = new DataInputStream(((URL) var2.field4942).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field4942;
                    var2.field4939 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field4942;
                    var2.field4939 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4939 = var5.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field4942;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else {
                    throw new Exception("");
                }
                var2.field4940 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4940 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public final byte[] method1869(String arg0, byte arg1) {
        if (arg1 != 67) {
            this.method1854(71, null);
        }
        class324 var3 = this.method1849(0, 0, arg0, -9, 21);
        return (byte[]) var3.field4939;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/Class;B)Lcq;")
    public final class324 method1870(Class arg0, byte arg1) {
        return arg1 == -18 ? this.method1867(0, 0, 20, -121, arg0) : null;
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)Lcq;")
    public final class324 method1871(int arg0) {
        if (arg0 != 5) {
            field4184 = null;
        }
        return this.method1867(0, 0, 5, -94, null);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
    public final File method1872(boolean arg0, String arg1) {
        return arg0 ? method1845(arg1, this.field4174, false, this.field4171) : null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class293(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field4171 = arg1;
        field4165 = "Unknown";
        this.field4170 = arg0;
        this.field4174 = arg2;
        field4169 = "1.1";
        try {
            field4165 = System.getProperty("java.vendor");
            field4169 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4181 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4181 = "Unknown";
        }
        field4167 = field4181.toLowerCase();
        try {
            field4175 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4175 = "";
        }
        try {
            field4183 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4183 = "";
        }
        try {
            field4162 = System.getProperty("user.home");
            if (field4162 != null) {
                field4162 = field4162 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4162 == null) {
            field4162 = "~/";
        }
        try {
            this.field4180 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4184 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4184 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4186 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4186 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4182 = false;
        this.field4177 = new Thread(this);
        this.field4177.setPriority(10);
        this.field4177.setDaemon(true);
        this.field4177.start();
    }
}
