import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
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

@OriginalClass("client!gi")
public class class285 implements Runnable {

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lrd;")
    public class202 field4867 = null;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Z")
    private boolean field4871 = false;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lga;")
    private class147 field4868 = null;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lga;")
    private class147 field4876 = null;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field4878 = null;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "Lrd;")
    public class202 field4881 = null;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lrd;")
    public class202 field4879 = null;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    private int field4887;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Ljava/lang/String;")
    private String field4872;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4885;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[Lrd;")
    public class202[] field4870;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field4874;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field4883 = 3;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field4877 = new Hashtable(16);

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lej;")
    private class210 field4884;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4865;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Ljava/lang/String;")
    private static String field4866;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4869;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4873;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4875;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4880;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4882;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4886;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4888;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lga;", line = 6)
    public final class147 method1938(Class arg0, int arg1, String arg2) {
        int var4 = 29 % ((arg1 + 34) / 59);
        return this.method1956(0, 0, 9, new Object[] { arg0, arg2 }, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLjava/awt/Frame;)Lga;", line = 14)
    public final class147 method1939(boolean arg0, Frame arg1) {
        if (!arg0) {
            field4875 = (String) null;
        }
        return this.method1956(0, 0, 7, arg1, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZII)Lga;", line = 24)
    public final class147 method1940(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            this.field4887 = -99;
        }
        return this.method1956((arg3 << 16) + arg4, (arg1 << 16) - -arg0, 6, (Object) null, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Z", line = 40)
    public final boolean method1941(int arg0) {
        return arg0 != 3;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lga;", line = 52)
    public final class147 method1942(int arg0) {
        return arg0 > -14 ? (class147) null : this.method1956(0, 0, 5, (Object) null, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;B)Lga;", line = 62)
    public final class147 method1943(String arg0, byte arg1) {
        if (arg1 > -105) {
            this.method1942(49);
        }
        return this.method1956(0, 0, 16, arg0, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/awt/Component;II)Lga;", line = 72)
    public final class147 method1944(int arg0, Component arg1, int arg2, int arg3) {
        if (arg3 != -1312) {
            this.method1944(-97, (Component) null, 23, -73);
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method1956(arg2 + var5.y, var5.x + arg0, 14, (Object) null, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "run", descriptor = "()V", line = 87)
    public final void run() {
        while (true) {
            class147 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4871) {
                        return;
                    }
                    if (this.field4868 != null) {
                        var2 = this.field4868;
                        this.field4868 = this.field4868.field2321;
                        if (this.field4868 == null) {
                            this.field4876 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field2325;
                if (var5 == 1) {
                    var2.field2323 = new Socket(InetAddress.getByName((String) var2.field2324), var2.field2320);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field2324);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field2320);
                    var2.field2323 = var8;
                } else if (var5 == 4) {
                    var2.field2323 = new DataInputStream(((URL) var2.field2324).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2324);
                    var2.field2323 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2324);
                    var2.field2323 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field2322 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field2322 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 524)
    public class285(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) throws Exception {
        this.field4887 = arg2;
        field4880 = "Unknown";
        this.field4872 = arg3;
        field4869 = "1.1";
        this.field4878 = arg1;
        try {
            field4880 = System.getProperty("java.vendor");
            field4869 = System.getProperty("java.version");
        } catch (Exception var26) {
        }
        try {
            field4873 = System.getProperty("os.name");
        } catch (Exception var25) {
            field4873 = "Unknown";
        }
        field4865 = field4873.toLowerCase();
        try {
            field4882 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var24) {
            field4882 = "";
        }
        try {
            field4875 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var23) {
            field4875 = "";
        }
        try {
            field4866 = System.getProperty("user.home");
            if (field4866 != null) {
                field4866 = field4866 + "/";
            }
        } catch (Exception var22) {
        }
        if (field4866 == null) {
            field4866 = "~/";
        }
        try {
            this.field4885 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var21) {
        }
        try {
            if (arg1 == null) {
                field4886 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4886 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var20) {
        }
        try {
            if (arg1 == null) {
                field4888 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4888 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var19) {
        }
        if (arg0) {
            this.field4867 = new class202(method1955((byte) -82, (String) null, this.field4887, "random.dat"), "rw", 25L);
            this.field4881 = new class202(method1955((byte) -87, this.field4872, this.field4887, "main_file_cache.dat2"), "rw", 104857600L);
            this.field4879 = new class202(method1955((byte) 25, this.field4872, this.field4887, "main_file_cache.idx255"), "rw", 1048576L);
            this.field4870 = new class202[arg4];
            for (int var14 = 0; var14 < arg4; var14++) {
                this.field4870[var14] = new class202(method1955((byte) 83, this.field4872, this.field4887, "main_file_cache.idx" + var14), "rw", 1048576L);
            }
        }
        if (arg0) {
            ThreadGroup var15 = Thread.currentThread().getThreadGroup();
            ThreadGroup var16 = var15.getParent();
            Thread[] var17 = new Thread[1000];
            while (var16 != null) {
                var15 = var16;
                var16 = var16.getParent();
            }
            var15.enumerate(var17);
            for (int var18 = 0; var18 < var17.length; var18++) {
                if (var17[var18] != null && var17[var18].getName().startsWith("AWT")) {
                    var17[var18].setPriority(1);
                }
            }
        }
        this.field4871 = false;
        this.field4874 = new Thread(this);
        this.field4874.setPriority(10);
        this.field4874.setDaemon(true);
        this.field4874.start();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Lga;", line = 185)
    public final class147 method1945(int arg0, int arg1) {
        if (arg1 > -71) {
            this.field4868 = (class147) null;
        }
        return this.method1956(0, arg0, 3, (Object) null, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/Class;)Lga;", line = 197)
    public final class147 method1946(int arg0, Class arg1) {
        return arg0 == 10 ? this.method1956(0, 0, 10, arg1, (byte) -91) : (class147) null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZILjava/lang/String;)Lga;", line = 207)
    public final class147 method1947(boolean arg0, int arg1, String arg2) {
        if (arg0) {
            this.method1949((Class[]) null, (Class) null, (String) null, true);
        }
        return this.method1956(0, arg1, 1, arg2, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLjava/lang/Class;)Lga;", line = 218)
    public final class147 method1948(boolean arg0, Class arg1) {
        return arg0 ? (class147) null : this.method1956(0, 0, 11, arg1, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lga;", line = 229)
    public final class147 method1949(Class[] arg0, Class arg1, String arg2, boolean arg3) {
        return arg3 ? this.method1956(0, 0, 8, new Object[] { arg1, arg2, arg0 }, (byte) -91) : (class147) null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)Lej;", line = 243)
    public final class210 method1950(boolean arg0) {
        if (!arg0) {
            field4866 = (String) null;
        }
        return this.field4884;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)Lga;", line = 266)
    public final class147 method1951(int arg0, String arg1) {
        return arg0 == -7135 ? this.method1956(0, 0, 12, arg1, (byte) -91) : (class147) null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 277)
    public final void method1952(byte arg0) {
        synchronized (this) {
            this.field4871 = true;
            this.notifyAll();
        }
        try {
            this.field4874.join();
        } catch (InterruptedException var14) {
        }
        if (this.field4881 != null) {
            try {
                this.field4881.method1414(0);
            } catch (IOException var13) {
            }
        }
        if (this.field4879 != null) {
            try {
                this.field4879.method1414(0);
            } catch (IOException var12) {
            }
        }
        if (arg0 != -117) {
            return;
        }
        if (this.field4870 != null) {
            for (int var7 = 0; var7 < this.field4870.length; var7++) {
                if (this.field4870[var7] != null) {
                    try {
                        this.field4870[var7].method1414(0);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field4867 != null) {
            try {
                this.field4867.method1414(0);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lga;", line = 340)
    public final class147 method1953(Component arg0, int arg1, boolean arg2) {
        int var4 = 96 % ((33 - arg1) / 38);
        return this.method1956(0, arg2 ? 1 : 0, 15, arg0, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILjava/lang/Runnable;)Lga;", line = 351)
    public final class147 method1954(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 0) {
            this.field4870 = (class202[]) null;
        }
        return this.method1956(0, arg0, 2, arg2, (byte) -91);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)Ljava/io/File;", line = 362)
    private static final File method1955(byte arg0, String arg1, int arg2, String arg3) {
        File var4 = (File) field4877.get(arg3);
        if (var4 != null) {
            return var4;
        }
        int var5 = 56 % ((arg0 + 39) / 34);
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        String[] var7 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4866, "/tmp/", "" };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var7.length; var10++) {
                    String var11 = var7[var10] + var6[var9] + "/" + (arg1 == null ? "" : arg1 + "/") + arg3;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var8 != 0 || var13.exists()) {
                            String var14 = var7[var10];
                            if (var8 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var7[var10] + var6[var9])).mkdir();
                                if (arg1 != null) {
                                    (new File(var7[var10] + var6[var9] + "/" + arg1)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field4877.put(arg3, var13);
                                return var13;
                            }
                        }
                    } catch (Exception var20) {
                        try {
                            if (var12 != null) {
                                var12.close();
                                Object var17 = null;
                            }
                        } catch (Exception var19) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILjava/lang/Object;B)Lga;", line = 452)
    private final class147 method1956(int arg0, int arg1, int arg2, Object arg3, byte arg4) {
        class147 var6 = new class147();
        if (arg4 != -91) {
            return (class147) null;
        }
        var6.field2324 = arg3;
        var6.field2320 = arg1;
        var6.field2325 = arg2;
        synchronized (this) {
            if (this.field4876 == null) {
                this.field4876 = this.field4868 = var6;
            } else {
                this.field4876.field2321 = var6;
                this.field4876 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/net/URL;I)Lga;", line = 509)
    public final class147 method1957(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.method1946(24, (Class) null);
        }
        return this.method1956(0, 0, 4, arg0, (byte) -91);
    }
}
