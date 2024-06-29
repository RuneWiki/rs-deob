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

@OriginalClass("mapview!aa")
public class class2 implements Runnable {

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "Ljava/lang/String;")
    private String field85 = null;

    @OriginalMember(owner = "mapview!aa", name = "l", descriptor = "Ljava/lang/String;")
    public String field90 = null;

    @OriginalMember(owner = "mapview!aa", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field89 = null;

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "I")
    public int field80 = 0;

    @OriginalMember(owner = "mapview!aa", name = "p", descriptor = "Ljava/lang/String;")
    private String field94 = null;

    @OriginalMember(owner = "mapview!aa", name = "o", descriptor = "Ljava/lang/String;")
    public String field93 = null;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "Lma;")
    private class25 field88 = null;

    @OriginalMember(owner = "mapview!aa", name = "n", descriptor = "Lb;")
    public class3 field92 = null;

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "Z")
    private boolean field81 = false;

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "Lb;")
    public class3 field82 = null;

    @OriginalMember(owner = "mapview!aa", name = "s", descriptor = "Lma;")
    private class25 field97 = null;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field79;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "[Lb;")
    public class3[] field86;

    @OriginalMember(owner = "mapview!aa", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field98;

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "I")
    public static int field84 = 3;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "Ljava/lang/String;")
    private static String field83;

    @OriginalMember(owner = "mapview!aa", name = "m", descriptor = "Ljava/lang/String;")
    public static String field91;

    @OriginalMember(owner = "mapview!aa", name = "q", descriptor = "Ljava/lang/String;")
    public static String field95;

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field87;

    @OriginalMember(owner = "mapview!aa", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field96;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(IB)Lma;", line = 11)
    public final class25 method40(int arg0, byte arg1) {
        int var3 = 24 / ((arg1 - 12) / 43);
        return this.method45((byte) -82, 0, arg0, 1, null);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lma;", line = 23)
    public final class25 method41(byte arg0, Class arg1, String arg2) {
        if (arg0 != 93) {
            this.field94 = null;
        }
        return this.method45((byte) -82, 0, 0, 10, new Object[] { arg1, arg2 });
    }

    @OriginalMember(owner = "mapview!aa", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 423)
    public class2(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field91 = "Unknown";
        field95 = "1.1";
        this.field89 = arg1;
        this.field79 = arg2;
        try {
            field91 = System.getProperty("java.vendor");
            field95 = System.getProperty("java.version");
            field83 = System.getProperty("user.home");
            if (field83 != null) {
                field83 = field83 + "/";
            }
        } catch (Exception var13) {
        }
        try {
            if (arg1 == null) {
                field87 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field87 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field96 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field96 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method47(arg4, arg3, 47);
            this.field92 = new class3(new File(this.field94 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field86 = new class3[arg5];
            for (int var10 = 0; var10 < arg5; var10++) {
                this.field86[var10] = new class3(new File(this.field94 + "main_file_cache.idx" + var10), "rw", 1048576L);
            }
            this.field82 = new class3(new File(this.field94 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method44(-14598);
        }
        this.field81 = false;
        this.field98 = new Thread(this);
        this.field98.setPriority(10);
        this.field98.setDaemon(true);
        this.field98.start();
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lma;", line = 41)
    public final class25 method42(String arg0, Class[] arg1, int arg2, Class arg3) {
        return arg2 == -27352 ? this.method45((byte) -82, 0, 0, 9, new Object[] { arg3, arg0, arg1 }) : (class25) null;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Z)V", line = 72)
    public final void method43(boolean arg0) {
        synchronized (this) {
            this.field81 = arg0;
            this.notifyAll();
        }
        try {
            this.field98.join();
        } catch (InterruptedException var12) {
        }
        if (this.field92 != null) {
            try {
                this.field92.method52(99);
            } catch (IOException var11) {
            }
        }
        if (this.field82 != null) {
            try {
                this.field82.method52(123);
            } catch (IOException var10) {
            }
        }
        if (this.field86 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field86.length; var7++) {
            if (this.field86[var7] != null) {
                try {
                    this.field86[var7].method52(124);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "run", descriptor = "()V", line = 124)
    public final void run() {
        while (true) {
            class25 var2;
            synchronized (this) {
                while (true) {
                    if (this.field81) {
                        return;
                    }
                    if (this.field97 != null) {
                        var2 = this.field97;
                        this.field97 = this.field97.field337;
                        if (this.field97 == null) {
                            this.field88 = null;
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
                int var5 = var2.field336;
                if (var5 == 1) {
                    var2.field341 = new Socket(this.field79, var2.field340);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field338);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field340);
                    var2.field341 = var6;
                } else if (var5 == 4) {
                    var2.field341 = new DataInputStream(((URL) var2.field338).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field338;
                    var2.field341 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var8 = (Object[]) var2.field338;
                    var2.field341 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field339 = 1;
            } catch (Exception var10) {
                var2.field339 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I)V", line = 215)
    private final void method44(int arg0) {
        try {
            File var2 = new File(this.field85 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field85 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        try {
            if (arg0 != -14598) {
                return;
            }
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field85 + "uid.dat"));
            this.field80 = var5.readInt() + 1;
            var5.close();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(BIIILjava/lang/Object;)Lma;", line = 263)
    private final class25 method45(byte arg0, int arg1, int arg2, int arg3, Object arg4) {
        class25 var6 = new class25();
        var6.field340 = arg2;
        var6.field338 = arg4;
        var6.field336 = arg3;
        synchronized (this) {
            if (this.field88 == null) {
                this.field88 = this.field97 = var6;
            } else {
                this.field88.field337 = var6;
                this.field88 = var6;
            }
            this.notify();
        }
        if (arg0 != -82) {
            field83 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(BI)Lma;", line = 300)
    public final class25 method46(byte arg0, int arg1) {
        if (arg0 != -43) {
            this.method43(true);
        }
        return this.method45((byte) -82, 0, arg1, 3, null);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 311)
    private final void method47(String arg0, int arg1, int arg2) {
        int var4 = 126 % ((-arg2 - 52) / 53);
        if (field83 == null) {
            field83 = "~/";
        }
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field83, "/tmp/", "" };
        String var6 = ".file_store_" + arg1;
        for (int var7 = 0; var7 < var5.length; var7++) {
            try {
                String var8 = var5[var7];
                if (var8.length() > 0) {
                    File var9 = new File(var8);
                    if (!var9.exists()) {
                        continue;
                    }
                }
                File var10 = new File(var8 + var6);
                if (var10.exists() || var10.mkdir()) {
                    if (arg0.length() > 0) {
                        var10 = new File(var10, arg0);
                        if (!var10.exists() && !var10.mkdir()) {
                            continue;
                        }
                    }
                    this.field93 = this.field85 = var10.getParent() + "/";
                    this.field90 = this.field94 = var10.getPath() + "/";
                    return;
                }
            } catch (Exception var12) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(BLjava/net/URL;)Lma;", line = 390)
    public final class25 method48(byte arg0, URL arg1) {
        if (arg0 >= -51) {
            this.field93 = null;
        }
        return this.method45((byte) -82, 0, 0, 4, arg1);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lma;", line = 404)
    public final class25 method49(Runnable arg0, byte arg1, int arg2) {
        return arg1 == 69 ? this.method45((byte) -82, 0, arg2, 2, arg0) : (class25) null;
    }
}
