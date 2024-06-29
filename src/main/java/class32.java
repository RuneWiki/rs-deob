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

@OriginalClass("mapview!u")
public class class32 implements Runnable {

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "Z")
    private boolean field372 = false;

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "Lea;")
    public class8 field370 = null;

    @OriginalMember(owner = "mapview!u", name = "i", descriptor = "I")
    public int field373 = 0;

    @OriginalMember(owner = "mapview!u", name = "j", descriptor = "Ljava/lang/String;")
    private String field374 = null;

    @OriginalMember(owner = "mapview!u", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field375 = null;

    @OriginalMember(owner = "mapview!u", name = "m", descriptor = "Lea;")
    public class8 field377 = null;

    @OriginalMember(owner = "mapview!u", name = "l", descriptor = "Ljava/lang/String;")
    public String field376 = null;

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "Le;")
    private class7 field369 = null;

    @OriginalMember(owner = "mapview!u", name = "s", descriptor = "Le;")
    private class7 field383 = null;

    @OriginalMember(owner = "mapview!u", name = "n", descriptor = "Ljava/lang/String;")
    public String field378 = null;

    @OriginalMember(owner = "mapview!u", name = "o", descriptor = "Ljava/lang/String;")
    private String field379 = null;

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field371;

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "[Lea;")
    public class8[] field366;

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field368;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "I")
    public static int field365 = 3;

    @OriginalMember(owner = "mapview!u", name = "p", descriptor = "Ljava/lang/String;")
    public static String field380;

    @OriginalMember(owner = "mapview!u", name = "q", descriptor = "Ljava/lang/String;")
    private static String field381;

    @OriginalMember(owner = "mapview!u", name = "r", descriptor = "Ljava/lang/String;")
    public static String field382;

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field367;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Le;", line = 9)
    public final class7 method199(byte arg0, Class[] arg1, Class arg2, String arg3) {
        int var5 = -68 / ((arg0 - 43) / 50);
        return this.method200(0, -31524, new Object[] { arg2, arg3, arg1 }, 9, 0);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IILjava/lang/Object;II)Le;", line = 20)
    private final class7 method200(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class7 var6 = new class7();
        var6.field53 = arg4;
        var6.field55 = arg3;
        var6.field56 = arg2;
        synchronized (this) {
            if (this.field369 == null) {
                this.field369 = this.field383 = var6;
            } else {
                this.field369.field54 = var6;
                this.field369 = var6;
            }
            this.notify();
            if (arg1 != -31524) {
                this.field373 = 70;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "run", descriptor = "()V", line = 51)
    public final void run() {
        while (true) {
            class7 var2;
            synchronized (this) {
                while (true) {
                    if (this.field372) {
                        return;
                    }
                    if (this.field383 != null) {
                        var2 = this.field383;
                        this.field383 = this.field383.field54;
                        if (this.field383 == null) {
                            this.field369 = null;
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
                int var5 = var2.field55;
                if (var5 == 1) {
                    var2.field52 = new Socket(this.field371, var2.field53);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field56);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field53);
                    var2.field52 = var8;
                } else if (var5 == 4) {
                    var2.field52 = new DataInputStream(((URL) var2.field56).openStream());
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) var2.field56;
                    var2.field52 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var5 == 10) {
                    Object[] var7 = (Object[]) var2.field56;
                    var2.field52 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field57 = 1;
            } catch (Exception var10) {
                var2.field57 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)Le;", line = 145)
    public final class7 method201(int arg0, int arg1) {
        return arg0 == 0 ? this.method200(0, -31524, null, 1, arg1) : (class7) null;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IBLjava/lang/Runnable;)Le;", line = 162)
    public final class7 method202(int arg0, byte arg1, Runnable arg2) {
        return arg1 <= 98 ? (class7) null : this.method200(0, -31524, arg2, 2, arg0);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)V", line = 174)
    public final void method203(int arg0) {
        if (arg0 != 32) {
            return;
        }
        synchronized (this) {
            this.field372 = true;
            this.notifyAll();
        }
        try {
            this.field368.join();
        } catch (InterruptedException var12) {
        }
        if (this.field377 != null) {
            try {
                this.field377.method18(arg0 - 20929);
            } catch (IOException var11) {
            }
        }
        if (this.field370 != null) {
            try {
                this.field370.method18(-20897);
            } catch (IOException var10) {
            }
        }
        if (this.field366 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field366.length; var7++) {
            if (this.field366[var7] != null) {
                try {
                    this.field366[var7].method18(-20897);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(BLjava/net/URL;)Le;", line = 224)
    public final class7 method204(byte arg0, URL arg1) {
        if (arg0 != -51) {
            field382 = null;
        }
        return this.method200(0, -31524, arg1, 4, 0);
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 430)
    public class32(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field375 = arg1;
        this.field371 = arg2;
        field380 = "Unknown";
        field382 = "1.1";
        try {
            field380 = System.getProperty("java.vendor");
            field382 = System.getProperty("java.version");
            field381 = System.getProperty("user.home");
            if (field381 != null) {
                field381 = field381 + "/";
            }
        } catch (Exception var11) {
        }
        try {
            if (arg1 == null) {
                field367 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field367 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var10) {
        }
        if (arg0) {
            this.method208(1048576, arg3, arg4);
            this.field377 = new class8(new File(this.field374 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field366 = new class8[arg5];
            for (int var9 = 0; var9 < arg5; var9++) {
                this.field366[var9] = new class8(new File(this.field374 + "main_file_cache.idx" + var9), "rw", 1048576L);
            }
            this.field370 = new class8(new File(this.field374 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method206(32);
        }
        this.field372 = false;
        this.field368 = new Thread(this);
        this.field368.setPriority(10);
        this.field368.setDaemon(true);
        this.field368.start();
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Le;", line = 241)
    public final class7 method205(Class arg0, int arg1, String arg2) {
        if (arg1 <= 11) {
            this.field370 = null;
        }
        return this.method200(0, -31524, new Object[] { arg0, arg2 }, 10, 0);
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(I)V", line = 260)
    private final void method206(int arg0) {
        try {
            File var2 = new File(this.field379 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field379 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        try {
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field379 + "uid.dat"));
            this.field373 = var5.readInt() + 1;
            if (arg0 != 32) {
                this.field371 = null;
            }
            var5.close();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(BI)Le;", line = 334)
    public final class7 method207(byte arg0, int arg1) {
        if (arg0 <= 42) {
            this.method204((byte) 24, null);
        }
        return this.method200(0, -31524, null, 3, arg1);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IILjava/lang/String;)V", line = 346)
    private final void method208(int arg0, int arg1, String arg2) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        if (arg0 != 1048576) {
            return;
        }
        if (field381 == null) {
            field381 = "~/";
        }
        String var4 = ".file_store_" + arg1;
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field381, "/tmp/", "" };
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
                    if (arg2.length() > 0) {
                        var9 = new File(var9, arg2);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field376 = this.field379 = var9.getParent() + "/";
                    this.field378 = this.field374 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var11) {
            }
        }
        throw new RuntimeException();
    }
}
