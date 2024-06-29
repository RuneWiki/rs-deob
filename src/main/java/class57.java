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

@OriginalClass("client!jc")
public class class57 implements Runnable {

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1491 = null;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lbe;")
    public class12 field1489 = null;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lqb;")
    private class98 field1495 = null;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Ljava/lang/String;")
    private String field1499 = null;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Ljava/lang/String;")
    public String field1492 = null;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Ljava/lang/String;")
    private String field1496 = null;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field1497 = null;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Z")
    private boolean field1500 = false;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lbe;")
    public class12 field1487 = null;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public int field1503 = 0;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lqb;")
    private class98 field1504 = null;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field1494;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[Lbe;")
    public class12[] field1501;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field1490;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field1502 = 3;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lcd;")
    private class17 field1488;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lgb;")
    private class39 field1486;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1493;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Ljava/lang/String;")
    private static String field1498;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1506;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1505;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 4)
    private final void method439(int arg0, String arg1, int arg2) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        if (field1498 == null) {
            field1498 = "~/";
        }
        if (arg0 <= 48) {
            this.field1504 = null;
        }
        String var4 = ".file_store_" + arg2;
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field1498, "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            try {
                String var7 = var5[var6];
                if (var7.length() > 0) {
                    File var8 = new File(var7);
                    if (!var8.exists()) {
                        continue;
                    }
                }
                File var9 = new File(var7 + var4);
                if (var9.exists() || var9.mkdir()) {
                    if (arg1.length() > 0) {
                        var9 = new File(var9, arg1);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field1491 = this.field1496 = var9.getParent() + "/";
                    this.field1492 = this.field1499 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Lgb;", line = 81)
    public final class39 method440(int arg0) {
        int var2 = 100 % ((44 - arg0) / 39);
        return this.field1486;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Lqb;", line = 93)
    public final class98 method441(byte arg0, int arg1) {
        if (arg0 != -120) {
            this.field1490 = null;
        }
        return this.method446(null, 1, 9, 0, arg1);
    }

    @OriginalMember(owner = "client!jc", name = "run", descriptor = "()V", line = 103)
    public final void run() {
        while (true) {
            class98 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1500) {
                        return;
                    }
                    if (this.field1495 != null) {
                        var2 = this.field1495;
                        this.field1495 = this.field1495.field2453;
                        if (this.field1495 == null) {
                            this.field1504 = null;
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
                int var3 = var2.field2452;
                if (var3 == 1) {
                    var2.field2456 = new Socket(this.field1494, var2.field2455);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2457);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2455);
                    var2.field2456 = var4;
                } else if (var3 == 4) {
                    var2.field2456 = new DataInputStream(((URL) var2.field2457).openStream());
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field2457;
                    var2.field2456 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field2457;
                    var2.field2456 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2454 = 1;
            } catch (Exception var9) {
                var2.field2454 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Lqb;", line = 193)
    public final class98 method442(int arg0, Runnable arg1, boolean arg2) {
        if (arg2) {
            this.field1490 = null;
        }
        return this.method446(arg1, 2, 9, 0, arg0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Lqb;", line = 203)
    public final class98 method443(boolean arg0) {
        if (!arg0) {
            this.field1503 = 77;
        }
        return null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 215)
    private final void method444(byte arg0) {
        try {
            File var2 = new File(this.field1496 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field1496 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
            if (arg0 != -24) {
                this.method451(-87, -8);
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field1496 + "uid.dat"));
            this.field1503 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Lcd;", line = 248)
    public final class17 method445(byte arg0) {
        return arg0 == -4 ? this.field1488 : null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lqb;", line = 258)
    private final class98 method446(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class98 var6 = new class98();
        var6.field2457 = arg0;
        var6.field2455 = arg4;
        var6.field2452 = arg1;
        synchronized (this) {
            if (this.field1504 == null) {
                this.field1504 = this.field1495 = var6;
            } else {
                this.field1504.field2453 = var6;
                this.field1504 = var6;
            }
            if (arg2 != 9) {
                this.method444((byte) 111);
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 453)
    public class57(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field1506 = "Unknown";
        this.field1494 = arg2;
        field1493 = "1.1";
        this.field1497 = arg1;
        try {
            field1506 = System.getProperty("java.vendor");
            field1493 = System.getProperty("java.version");
            field1498 = System.getProperty("user.home");
            if (field1498 != null) {
                field1498 = field1498 + "/";
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field1505 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1505 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method439(107, arg4, arg3);
            this.field1489 = new class12(new File(this.field1499 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field1501 = new class12[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field1501[var7] = new class12(new File(this.field1499 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field1487 = new class12(new File(this.field1499 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method444((byte) -24);
        }
        this.field1500 = false;
        this.field1490 = new Thread(this);
        this.field1490.setPriority(10);
        this.field1490.setDaemon(true);
        this.field1490.start();
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 295)
    public final void method447(boolean arg0) {
        synchronized (this) {
            this.field1500 = true;
            this.notifyAll();
        }
        try {
            this.field1490.join();
        } catch (InterruptedException var7) {
        }
        if (this.field1486 != null) {
            this.field1486.method340(false);
        }
        if (arg0) {
            this.method445((byte) -47);
        }
        if (this.field1489 != null) {
            try {
                this.field1489.method120((byte) -116);
            } catch (IOException var6) {
            }
        }
        if (this.field1487 != null) {
            try {
                this.field1487.method120((byte) -117);
            } catch (IOException var5) {
            }
        }
        if (this.field1501 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1501.length; var3++) {
            if (this.field1501[var3] != null) {
                try {
                    this.field1501[var3].method120((byte) -115);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lqb;", line = 353)
    public final class98 method448(Class arg0, byte arg1, String arg2) {
        if (arg1 > -24) {
            this.method440(44);
        }
        return this.method446(new Object[] { arg0, arg2 }, 10, 9, 0, 0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lqb;", line = 364)
    public final class98 method449(Class arg0, int arg1, String arg2, Class[] arg3) {
        int var5 = -1 / ((arg1 - 45) / 55);
        return this.method446(new Object[] { arg0, arg2, arg3 }, 9, 9, 0, 0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/net/URL;I)Lqb;", line = 401)
    public final class98 method450(URL arg0, int arg1) {
        return arg1 == -15028 ? this.method446(arg0, 4, 9, 0, 0) : null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Lqb;", line = 439)
    public final class98 method451(int arg0, int arg1) {
        if (arg1 > -29) {
            this.field1489 = null;
        }
        return this.method446(null, 3, 9, 0, arg0);
    }
}
