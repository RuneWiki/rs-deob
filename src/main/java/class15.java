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

@OriginalClass("client!cc")
public class class15 implements Runnable {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lsa;")
    public class107 field296 = null;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Ljava/lang/String;")
    public String field305 = null;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Ljava/lang/String;")
    public String field306 = null;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lf;")
    private class34 field309 = null;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lsa;")
    public class107 field308 = null;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Z")
    private boolean field310 = false;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lf;")
    private class34 field314 = null;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Ljava/lang/String;")
    private String field315 = null;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public int field307 = 0;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Ljava/applet/Applet;")
    public Applet field316 = null;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Ljava/lang/String;")
    private String field300 = null;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field311;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[Lsa;")
    public class107[] field304;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field298;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field299 = 3;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lrd;")
    private class106 field313;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lsc;")
    private class109 field302;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field297;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Ljava/lang/String;")
    private static String field303;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field312;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field301;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lf;", line = 3)
    public final class34 method92(String arg0, Class arg1, int arg2) {
        if (arg2 <= 101) {
            this.field300 = null;
        }
        return this.method99(0, false, new Object[] { arg1, arg0 }, 10, 0);
    }

    @OriginalMember(owner = "client!cc", name = "run", descriptor = "()V", line = 21)
    public final void run() {
        while (true) {
            class34 var2;
            synchronized (this) {
                while (true) {
                    if (this.field310) {
                        return;
                    }
                    if (this.field309 != null) {
                        var2 = this.field309;
                        this.field309 = this.field309.field876;
                        if (this.field309 == null) {
                            this.field314 = null;
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
                int var3 = var2.field879;
                if (var3 == 1) {
                    var2.field878 = new Socket(this.field311, var2.field877);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field874);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field877);
                    var2.field878 = var6;
                } else if (var3 == 4) {
                    var2.field878 = new DataInputStream(((URL) var2.field874).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field874;
                    var2.field878 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var4 = (Object[]) var2.field874;
                    var2.field878 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field875 = 1;
            } catch (Exception var9) {
                var2.field875 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 445)
    public class15(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field311 = arg2;
        this.field316 = arg1;
        field297 = "1.1";
        field312 = "Unknown";
        try {
            field312 = System.getProperty("java.vendor");
            field297 = System.getProperty("java.version");
            field303 = System.getProperty("user.home");
            if (field303 != null) {
                field303 = field303 + "/";
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field301 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field301 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method103(arg3, (byte) -98, arg4);
            this.field296 = new class107(new File(this.field300 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field304 = new class107[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field304[var7] = new class107(new File(this.field300 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field308 = new class107(new File(this.field300 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method102((byte) -109);
        }
        this.field310 = false;
        this.field298 = new Thread(this);
        this.field298.setPriority(10);
        this.field298.setDaemon(true);
        this.field298.start();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lf;", line = 122)
    public final class34 method93(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method97(false);
        }
        return this.method99(arg1, false, null, 1, 0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/net/URL;I)Lf;", line = 135)
    public final class34 method94(URL arg0, int arg1) {
        if (arg1 != 0) {
            field301 = null;
        }
        return this.method99(0, false, arg0, 4, 0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lf;", line = 146)
    public final class34 method95(byte arg0, Runnable arg1, int arg2) {
        return arg0 == 21 ? this.method99(arg2, false, arg1, 2, 0) : null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lf;", line = 159)
    public final class34 method96(int arg0, int arg1) {
        if (arg1 > -113) {
            this.method92(null, null, 40);
        }
        return this.method99(arg0, false, null, 3, 0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 179)
    public final void method97(boolean arg0) {
        synchronized (this) {
            this.field310 = arg0;
            this.notifyAll();
        }
        try {
            this.field298.join();
        } catch (InterruptedException var7) {
        }
        if (this.field313 != null) {
            this.field313.method875((byte) 87);
        }
        if (this.field296 != null) {
            try {
                this.field296.method877(true);
            } catch (IOException var6) {
            }
        }
        if (this.field308 != null) {
            try {
                this.field308.method877(arg0);
            } catch (IOException var5) {
            }
        }
        if (this.field304 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field304.length; var3++) {
            if (this.field304[var3] != null) {
                try {
                    this.field304[var3].method877(true);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)Lsc;", line = 244)
    public final class109 method98(boolean arg0) {
        return arg0 ? null : this.field302;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZLjava/lang/Object;II)Lf;", line = 259)
    private final class34 method99(int arg0, boolean arg1, Object arg2, int arg3, int arg4) {
        class34 var6 = new class34();
        if (arg1) {
            this.method96(30, -112);
        }
        var6.field874 = arg2;
        var6.field877 = arg0;
        var6.field879 = arg3;
        synchronized (this) {
            if (this.field314 == null) {
                this.field314 = this.field309 = var6;
            } else {
                this.field314.field876 = var6;
                this.field314 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Lf;", line = 289)
    public final class34 method100(String arg0, Class[] arg1, byte arg2, Class arg3) {
        int var5 = -7 / ((44 - arg2) / 47);
        return this.method99(0, false, new Object[] { arg3, arg0, arg1 }, 9, 0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lrd;", line = 308)
    public final class106 method101(int arg0) {
        if (arg0 != 0) {
            this.field309 = null;
        }
        return this.field313;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 324)
    private final void method102(byte arg0) {
        try {
            File var2 = new File(this.field315 + "uid.dat");
            if (arg0 != -109) {
                field299 = -56;
            }
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field315 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field315 + "uid.dat"));
            this.field307 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 365)
    private final void method103(int arg0, byte arg1, String arg2) {
        if (field303 == null) {
            field303 = "~/";
        }
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        if (arg1 > -48) {
            return;
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field303, "/tmp/", "" };
        String var5 = ".file_store_" + arg0;
        for (int var6 = 0; var6 < var4.length; var6++) {
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
                    if (arg2.length() > 0) {
                        var9 = new File(var9, arg2);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field305 = this.field315 = var9.getParent() + "/";
                    this.field306 = this.field300 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Lf;", line = 505)
    public final class34 method104(int arg0) {
        return arg0 >= -1 ? null : null;
    }
}
