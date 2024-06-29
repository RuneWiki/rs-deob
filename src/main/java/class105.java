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

@OriginalClass("client!s")
public class class105 implements Runnable {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Ljava/lang/String;")
    private String field2403 = null;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Ljava/lang/String;")
    public String field2415 = null;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lqc;")
    public class98 field2410 = null;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lfa;")
    private class32 field2414 = null;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Ljava/lang/String;")
    public String field2411 = null;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lqc;")
    public class98 field2408 = null;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lfa;")
    private class32 field2407 = null;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Ljava/applet/Applet;")
    public Applet field2418 = null;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public int field2422 = 0;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Ljava/lang/String;")
    private String field2413 = null;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Z")
    private boolean field2423 = false;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field2419;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[Lqc;")
    public class98[] field2405;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field2409;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field2421 = 3;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lvc;")
    private class123 field2417;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lia;")
    private class49 field2416;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2404;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2406;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Ljava/lang/String;")
    private static String field2412;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2420;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLjava/net/URL;)Lfa;", line = 7)
    public final class32 method771(byte arg0, URL arg1) {
        int var3 = 5 / ((-arg0 - 27) / 37);
        return this.method776(0, arg1, 4, 2, 0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Lvc;", line = 23)
    public final class123 method772(boolean arg0) {
        if (arg0) {
            this.field2422 = -59;
        }
        return this.field2417;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lfa;", line = 36)
    public final class32 method773(String arg0, Class arg1, int arg2) {
        if (arg2 != 9) {
            this.method780(null, 93, 78);
        }
        return this.method776(0, new Object[] { arg1, arg0 }, 10, 2, 0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lfa;", line = 52)
    public final class32 method774(int arg0, int arg1) {
        return arg0 == 17009 ? this.method776(0, null, 3, 2, arg1) : null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;B)Lfa;", line = 62)
    public final class32 method775(Class[] arg0, String arg1, Class arg2, byte arg3) {
        if (arg3 < 68) {
            this.method777(null, (byte) -25, 83);
        }
        return this.method776(0, new Object[] { arg2, arg1, arg0 }, 9, 2, 0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/lang/Object;III)Lfa;", line = 73)
    private final class32 method776(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 2) {
            return null;
        }
        class32 var6 = new class32();
        var6.field798 = arg1;
        var6.field799 = arg4;
        var6.field796 = arg2;
        synchronized (this) {
            if (this.field2407 == null) {
                this.field2407 = this.field2414 = var6;
            } else {
                this.field2407.field797 = var6;
                this.field2407 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 103)
    private final void method777(String arg0, byte arg1, int arg2) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        if (field2412 == null) {
            field2412 = "~/";
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field2412, "/tmp/", "" };
        String var5 = ".file_store_" + arg2;
        int var6 = -117 / ((arg1 + 64) / 59);
        for (int var7 = 0; var7 < var4.length; var7++) {
            try {
                String var8 = var4[var7];
                if (var8.length() > 0) {
                    File var9 = new File(var8);
                    if (!var9.exists()) {
                        continue;
                    }
                }
                File var10 = new File(var8 + var5);
                if (var10.exists() || var10.mkdir()) {
                    if (arg0.length() > 0) {
                        var10 = new File(var10, arg0);
                        if (!var10.exists() && !var10.mkdir()) {
                            continue;
                        }
                    }
                    this.field2415 = this.field2403 = var10.getParent() + "/";
                    this.field2411 = this.field2413 = var10.getPath() + "/";
                    return;
                }
            } catch (Exception var11) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 175)
    public final void method778(byte arg0) {
        synchronized (this) {
            this.field2423 = true;
            this.notifyAll();
        }
        try {
            if (arg0 < 106) {
                this.method778((byte) -6);
            }
            this.field2409.join();
        } catch (InterruptedException var7) {
        }
        if (this.field2417 != null) {
            this.field2417.method974(-7435);
        }
        if (this.field2410 != null) {
            try {
                this.field2410.method665(true);
            } catch (IOException var6) {
            }
        }
        if (this.field2408 != null) {
            try {
                this.field2408.method665(true);
            } catch (IOException var5) {
            }
        }
        if (this.field2405 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2405.length; var3++) {
            if (this.field2405[var3] != null) {
                try {
                    this.field2405[var3].method665(true);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)Lfa;", line = 231)
    public final class32 method779(byte arg0) {
        if (arg0 < 29) {
            this.method771((byte) 74, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lfa;", line = 244)
    public final class32 method780(Runnable arg0, int arg1, int arg2) {
        return arg1 == 0 ? this.method776(0, arg0, 2, 2, arg2) : null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 459)
    public class105(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field2404 = "Unknown";
        this.field2418 = arg1;
        this.field2419 = arg2;
        field2406 = "1.1";
        try {
            field2404 = System.getProperty("java.vendor");
            field2406 = System.getProperty("java.version");
            field2412 = System.getProperty("user.home");
            if (field2412 != null) {
                field2412 = field2412 + "/";
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field2420 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2420 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method777(arg4, (byte) 49, arg3);
            this.field2410 = new class98(new File(this.field2413 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field2405 = new class98[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field2405[var7] = new class98(new File(this.field2413 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field2408 = new class98(new File(this.field2413 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method781(99999999);
        }
        this.field2423 = false;
        this.field2409 = new Thread(this);
        this.field2409.setPriority(10);
        this.field2409.setDaemon(true);
        this.field2409.start();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 263)
    private final void method781(int arg0) {
        try {
            File var2 = new File(this.field2403 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field2403 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
            if (arg0 != 99999999) {
                this.method779((byte) -5);
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field2403 + "uid.dat"));
            this.field2422 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!s", name = "run", descriptor = "()V", line = 305)
    public final void run() {
        while (true) {
            class32 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2423) {
                        return;
                    }
                    if (this.field2414 != null) {
                        var2 = this.field2414;
                        this.field2414 = this.field2414.field797;
                        if (this.field2414 == null) {
                            this.field2407 = null;
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
                int var3 = var2.field796;
                if (var3 == 1) {
                    var2.field800 = new Socket(this.field2419, var2.field799);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field798);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field799);
                    var2.field800 = var4;
                } else if (var3 == 4) {
                    var2.field800 = new DataInputStream(((URL) var2.field798).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field798;
                    var2.field800 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var6 = (Object[]) var2.field798;
                    var2.field800 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field795 = 1;
            } catch (Exception var9) {
                var2.field795 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lia;", line = 399)
    public final class49 method782(int arg0) {
        if (arg0 != 0) {
            this.method773(null, null, -67);
        }
        return this.field2416;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)Lfa;", line = 409)
    public final class32 method783(int arg0, byte arg1) {
        if (arg1 < 87) {
            this.method782(-22);
        }
        return this.method776(0, null, 1, 2, arg0);
    }
}
