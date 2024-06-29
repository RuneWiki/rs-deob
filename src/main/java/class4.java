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

@OriginalClass("mapview!ba")
public class class4 implements Runnable {

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Lt;")
    public class34 field65 = null;

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "Ljava/lang/String;")
    private String field72 = null;

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "Ljava/lang/String;")
    public String field71 = null;

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Lt;")
    public class34 field70 = null;

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Ljava/lang/String;")
    public String field69 = null;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field68 = null;

    @OriginalMember(owner = "mapview!ba", name = "k", descriptor = "I")
    public int field73 = 0;

    @OriginalMember(owner = "mapview!ba", name = "m", descriptor = "Z")
    private boolean field75 = false;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Ljava/lang/String;")
    private String field63 = null;

    @OriginalMember(owner = "mapview!ba", name = "q", descriptor = "Ln;")
    private class27 field79 = null;

    @OriginalMember(owner = "mapview!ba", name = "p", descriptor = "Ln;")
    private class27 field78 = null;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field66;

    @OriginalMember(owner = "mapview!ba", name = "o", descriptor = "[Lt;")
    public class34[] field77;

    @OriginalMember(owner = "mapview!ba", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field81;

    @OriginalMember(owner = "mapview!ba", name = "r", descriptor = "I")
    public static int field80 = 3;

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Ljava/lang/String;")
    private static String field64;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Ljava/lang/String;")
    public static String field67;

    @OriginalMember(owner = "mapview!ba", name = "n", descriptor = "Ljava/lang/String;")
    public static String field76;

    @OriginalMember(owner = "mapview!ba", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field74;

    @OriginalMember(owner = "mapview!ba", name = "run", descriptor = "()V", line = 18)
    public final void run() {
        while (true) {
            class27 var2;
            synchronized (this) {
                while (true) {
                    if (this.field75) {
                        return;
                    }
                    if (this.field79 != null) {
                        var2 = this.field79;
                        this.field79 = this.field79.field350;
                        if (this.field79 == null) {
                            this.field78 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var11) {
                    }
                }
            }
            try {
                int var5 = var2.field352;
                if (var5 == 1) {
                    var2.field354 = new Socket(this.field66, var2.field349);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field351);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field349);
                    var2.field354 = var8;
                } else if (var5 == 4) {
                    var2.field354 = new DataInputStream(((URL) var2.field351).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field351;
                    var2.field354 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var6 = (Object[]) var2.field351;
                    var2.field354 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field353 = 1;
            } catch (Exception var10) {
                var2.field353 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(II)Ln;", line = 106)
    public final class27 method38(int arg0, int arg1) {
        return arg0 > -60 ? (class27) null : this.method40(null, 1, arg1, 9, 0);
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 428)
    public class4(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field76 = "1.1";
        this.field68 = arg1;
        field67 = "Unknown";
        this.field66 = arg2;
        try {
            field67 = System.getProperty("java.vendor");
            field76 = System.getProperty("java.version");
            field64 = System.getProperty("user.home");
            if (field64 != null) {
                field64 = field64 + "/";
            }
        } catch (Exception var11) {
        }
        try {
            if (arg1 == null) {
                field74 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field74 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var10) {
        }
        if (arg0) {
            this.method44(18589, arg3, arg4);
            this.field65 = new class34(new File(this.field72 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field77 = new class34[arg5];
            for (int var9 = 0; var9 < arg5; var9++) {
                this.field77[var9] = new class34(new File(this.field72 + "main_file_cache.idx" + var9), "rw", 1048576L);
            }
            this.field70 = new class34(new File(this.field72 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method45(32463);
        }
        this.field75 = false;
        this.field81 = new Thread(this);
        this.field81.setPriority(10);
        this.field81.setDaemon(true);
        this.field81.start();
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;I)Ln;", line = 123)
    public final class27 method39(Class arg0, String arg1, Class[] arg2, int arg3) {
        return arg3 == 0 ? this.method40(new Object[] { arg0, arg1, arg2 }, 9, 0, 9, 0) : (class27) null;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/lang/Object;IIII)Ln;", line = 139)
    private final class27 method40(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class27 var6 = new class27();
        var6.field351 = arg0;
        var6.field349 = arg2;
        var6.field352 = arg1;
        synchronized (this) {
            if (this.field78 == null) {
                this.field78 = this.field79 = var6;
            } else {
                this.field78.field350 = var6;
                this.field78 = var6;
            }
            if (arg3 != 9) {
                this.field81 = null;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(BLjava/net/URL;)Ln;", line = 177)
    public final class27 method41(byte arg0, URL arg1) {
        int var3 = 19 / ((arg0 - 55) / 63);
        return this.method40(arg1, 4, 0, 9, 0);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IB)Ln;", line = 210)
    public final class27 method42(int arg0, byte arg1) {
        int var3 = 86 % ((arg1 + 34) / 39);
        return this.method40(null, 3, arg0, 9, 0);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ln;", line = 219)
    public final class27 method43(String arg0, Class arg1, int arg2) {
        int var4 = 24 % ((arg2 + 17) / 57);
        return this.method40(new Object[] { arg1, arg0 }, 10, 0, 9, 0);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IILjava/lang/String;)V", line = 228)
    private final void method44(int arg0, int arg1, String arg2) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        if (field64 == null) {
            field64 = "~/";
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field64, "/tmp/", "" };
        String var5 = ".file_store_" + arg1;
        if (arg0 != 18589) {
            return;
        }
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
                    this.field71 = this.field63 = var9.getParent() + "/";
                    this.field69 = this.field72 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var11) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 303)
    private final void method45(int arg0) {
        try {
            File var2 = new File(this.field63 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field63 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        try {
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field63 + "uid.dat"));
            this.field73 = var5.readInt() + 1;
            var5.close();
        } catch (Exception var7) {
        }
        if (arg0 != 32463) {
            this.method38(61, 115);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I)V", line = 334)
    public final void method46(int arg0) {
        synchronized (this) {
            this.field75 = true;
            if (arg0 != 16530) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field81.join();
        } catch (InterruptedException var12) {
        }
        if (this.field65 != null) {
            try {
                this.field65.method230((byte) 114);
            } catch (IOException var11) {
            }
        }
        if (this.field70 != null) {
            try {
                this.field70.method230((byte) 114);
            } catch (IOException var10) {
            }
        }
        if (this.field77 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field77.length; var7++) {
            if (this.field77[var7] != null) {
                try {
                    this.field77[var7].method230((byte) 114);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ln;", line = 397)
    public final class27 method47(Runnable arg0, int arg1, int arg2) {
        if (arg1 >= -33) {
            this.method42(-31, (byte) 23);
        }
        return this.method40(arg0, 2, arg2, 9, 0);
    }
}
