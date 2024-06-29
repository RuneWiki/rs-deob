import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class56 implements Runnable {

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Ltb;")
    public class114 field1427 = null;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Ltb;")
    public class114 field1434 = null;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Ljava/lang/String;")
    public String field1435 = null;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field1431 = null;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lva;")
    private class123 field1428 = null;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Lva;")
    private class123 field1439 = null;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
    private boolean field1430 = false;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Ljava/lang/String;")
    private String field1426 = null;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Ljava/lang/String;")
    private String field1436 = null;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public int field1438 = 0;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Ljava/lang/String;")
    public String field1443 = null;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field1440;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[Ltb;")
    public class114[] field1432;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field1433;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field1441 = 3;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lrd;")
    private class106 field1425;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lqc;")
    private class99 field1429;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1423;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1437;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Ljava/lang/String;")
    private static String field1442;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1424;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lva;", line = 4)
    public final class123 method514(int arg0, int arg1) {
        if (arg1 <= 103) {
            this.method523(37, false);
        }
        return this.method522(0, -10577, 3, null, arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Lrd;", line = 16)
    public final class106 method515(int arg0) {
        if (arg0 <= 33) {
            this.method517(null, null, null, (byte) -116);
        }
        return this.field1425;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lva;", line = 30)
    public final class123 method516(Class arg0, String arg1, byte arg2) {
        if (arg2 <= 108) {
            this.method519(63);
        }
        return this.method522(0, -10577, 10, new Object[] { arg0, arg1 }, 0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;B)Lva;", line = 40)
    public final class123 method517(Class arg0, String arg1, Class[] arg2, byte arg3) {
        if (arg3 < 35) {
            field1423 = null;
        }
        return this.method522(0, -10577, 9, new Object[] { arg0, arg1, arg2 }, 0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Lqc;", line = 50)
    public final class99 method518(byte arg0) {
        if (arg0 != 101) {
            this.field1425 = null;
        }
        return this.field1429;
    }

    @OriginalMember(owner = "client!jb", name = "run", descriptor = "()V", line = 60)
    public final void run() {
        while (true) {
            class123 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1430) {
                        return;
                    }
                    if (this.field1428 != null) {
                        var2 = this.field1428;
                        this.field1428 = this.field1428.field2994;
                        if (this.field1428 == null) {
                            this.field1439 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var10) {
                    }
                }
            }
            try {
                int var3 = var2.field2996;
                if (var3 == 1) {
                    var2.field2995 = new Socket(this.field1440, var2.field2997);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2993);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2997);
                    var2.field2995 = var6;
                } else if (var3 == 4) {
                    var2.field2995 = new DataInputStream(((URL) var2.field2993).openStream());
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2993;
                    var2.field2995 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field2993;
                    var2.field2995 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2998 = 1;
            } catch (Exception var9) {
                var2.field2998 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 153)
    private final void method519(int arg0) {
        try {
            File var2 = new File(this.field1436 + "uid.dat");
            if (arg0 <= 91) {
                this.method526(45);
            }
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field1436 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field1436 + "uid.dat"));
            this.field1438 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 195)
    public final void method520(int arg0) {
        synchronized (this) {
            this.field1430 = true;
            this.notifyAll();
        }
        try {
            this.field1433.join();
            if (arg0 != -10577) {
                this.method515(-95);
            }
        } catch (InterruptedException var7) {
        }
        if (this.field1425 != null) {
            this.field1425.method836(-23278);
        }
        if (this.field1434 != null) {
            try {
                this.field1434.method868(-21426);
            } catch (IOException var6) {
            }
        }
        if (this.field1427 != null) {
            try {
                this.field1427.method868(-21426);
            } catch (IOException var5) {
            }
        }
        if (this.field1432 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1432.length; var3++) {
            if (this.field1432[var3] != null) {
                try {
                    this.field1432[var3].method868(-21426);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 457)
    public class56(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field1437 = "1.1";
        this.field1431 = arg1;
        this.field1440 = arg2;
        field1423 = "Unknown";
        try {
            field1423 = System.getProperty("java.vendor");
            field1437 = System.getProperty("java.version");
            field1442 = System.getProperty("user.home");
            if (field1442 != null) {
                field1442 = field1442 + "/";
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field1424 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1424 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method521(arg3, arg4, 0);
            this.field1434 = new class114(new File(this.field1426 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field1432 = new class114[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field1432[var7] = new class114(new File(this.field1426 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field1427 = new class114(new File(this.field1426 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method519(97);
        }
        this.field1430 = false;
        this.field1433 = new Thread(this);
        this.field1433.setPriority(10);
        this.field1433.setDaemon(true);
        this.field1433.start();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 262)
    private final void method521(int arg0, String arg1, int arg2) {
        if (field1442 == null) {
            field1442 = "~/";
        }
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field1442, "/tmp/", "" };
        String var5 = ".file_store_" + arg0;
        for (int var6 = arg2; var6 < var4.length; var6++) {
            try {
                String var7 = var4[var6];
                if (var7.length() > 0) {
                    File var8 = new File(var7);
                    if (!var8.exists()) {
                        continue;
                    }
                }
                File var9 = new File(var7 + var5);
                if (var9.exists() || var9.mkdir()) {
                    if (arg1.length() > 0) {
                        var9 = new File(var9, arg1);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field1443 = this.field1436 = var9.getParent() + "/";
                    this.field1435 = this.field1426 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILjava/lang/Object;I)Lva;", line = 342)
    private final class123 method522(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg1 != -10577) {
            return null;
        }
        class123 var6 = new class123();
        var6.field2997 = arg4;
        var6.field2993 = arg3;
        var6.field2996 = arg2;
        synchronized (this) {
            if (this.field1439 == null) {
                this.field1439 = this.field1428 = var6;
            } else {
                this.field1439.field2994 = var6;
                this.field1439 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Lva;", line = 380)
    public final class123 method523(int arg0, boolean arg1) {
        return arg1 ? null : this.method522(0, -10577, 1, null, arg0);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lva;", line = 394)
    public final class123 method524(int arg0, Runnable arg1, byte arg2) {
        return arg2 == 43 ? this.method522(0, -10577, 2, arg1, arg0) : null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/net/URL;I)Lva;", line = 409)
    public final class123 method525(URL arg0, int arg1) {
        if (arg1 != 9018) {
            this.method522(-64, 16, 65, null, 13);
        }
        return this.method522(0, -10577, 4, arg0, 0);
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Lva;", line = 442)
    public final class123 method526(int arg0) {
        if (arg0 < 90) {
            this.field1427 = null;
        }
        return null;
    }
}
