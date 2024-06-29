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

@OriginalClass("mapview!na")
public class class27 implements Runnable {

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "Lja;")
    private class20 field362 = null;

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "I")
    public int field365 = 0;

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Ljava/lang/String;")
    private String field364 = null;

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "Lla;")
    public class24 field366 = null;

    @OriginalMember(owner = "mapview!na", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field370 = null;

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "Ljava/lang/String;")
    public String field363 = null;

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "Ljava/lang/String;")
    public String field367 = null;

    @OriginalMember(owner = "mapview!na", name = "o", descriptor = "Lla;")
    public class24 field374 = null;

    @OriginalMember(owner = "mapview!na", name = "p", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "Lja;")
    private class20 field360 = null;

    @OriginalMember(owner = "mapview!na", name = "s", descriptor = "Ljava/lang/String;")
    private String field378 = null;

    @OriginalMember(owner = "mapview!na", name = "q", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field376;

    @OriginalMember(owner = "mapview!na", name = "m", descriptor = "[Lla;")
    public class24[] field372;

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field361;

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "I")
    public static int field369 = 3;

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "Ljava/lang/String;")
    public static String field368;

    @OriginalMember(owner = "mapview!na", name = "n", descriptor = "Ljava/lang/String;")
    public static String field373;

    @OriginalMember(owner = "mapview!na", name = "r", descriptor = "Ljava/lang/String;")
    private static String field377;

    @OriginalMember(owner = "mapview!na", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field371;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 9)
    private final void method193(int arg0, String arg1, int arg2) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        if (field377 == null) {
            field377 = "~/";
        }
        String var4 = ".file_store_" + arg2;
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field377, "/tmp/", "" };
        int var6 = 0;
        if (arg0 > -87) {
            this.run();
        }
        while (var6 < var5.length) {
            try {
                label66: {
                    String var7 = var5[var6];
                    if (var7.length() > 0) {
                        File var8 = new File(var7);
                        if (!var8.exists()) {
                            break label66;
                        }
                    }
                    File var9 = new File(var7 + var4);
                    if (var9.exists() || var9.mkdir()) {
                        label67: {
                            if (arg1.length() > 0) {
                                var9 = new File(var9, arg1);
                                if (!var9.exists() && !var9.mkdir()) {
                                    break label67;
                                }
                            }
                            this.field367 = this.field378 = var9.getParent() + "/";
                            this.field363 = this.field364 = var9.getPath() + "/";
                            return;
                        }
                    }
                }
            } catch (Exception var11) {
            }
            var6++;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(II)Lja;", line = 84)
    public final class20 method194(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method196(3, false, -30, 12, null);
        }
        return this.method196(1, true, 0, arg1, null);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/net/URL;I)Lja;", line = 96)
    public final class20 method195(URL arg0, int arg1) {
        if (arg1 != -31561) {
            this.method194(8, 106);
        }
        return this.method196(4, true, 0, 0, arg0);
    }

    @OriginalMember(owner = "mapview!na", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 426)
    public class27(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field370 = arg1;
        field368 = "Unknown";
        this.field376 = arg2;
        field373 = "1.1";
        try {
            field368 = System.getProperty("java.vendor");
            field373 = System.getProperty("java.version");
            field377 = System.getProperty("user.home");
            if (field377 != null) {
                field377 = field377 + "/";
            }
        } catch (Exception var11) {
        }
        try {
            if (arg1 == null) {
                field371 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field371 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var10) {
        }
        if (arg0) {
            this.method193(-103, arg4, arg3);
            this.field374 = new class24(new File(this.field364 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field372 = new class24[arg5];
            for (int var9 = 0; var9 < arg5; var9++) {
                this.field372[var9] = new class24(new File(this.field364 + "main_file_cache.idx" + var9), "rw", 1048576L);
            }
            this.field366 = new class24(new File(this.field364 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method200((byte) -88);
        }
        this.field375 = false;
        this.field361 = new Thread(this);
        this.field361.setPriority(10);
        this.field361.setDaemon(true);
        this.field361.start();
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IZIILjava/lang/Object;)Lja;", line = 114)
    private final class20 method196(int arg0, boolean arg1, int arg2, int arg3, Object arg4) {
        if (!arg1) {
            return (class20) null;
        }
        class20 var6 = new class20();
        var6.field297 = arg0;
        var6.field299 = arg4;
        var6.field302 = arg3;
        synchronized (this) {
            if (this.field360 == null) {
                this.field360 = this.field362 = var6;
            } else {
                this.field360.field300 = var6;
                this.field360 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lja;", line = 142)
    public final class20 method197(int arg0, String arg1, Class arg2) {
        if (arg0 > -33) {
            this.field361 = null;
        }
        return this.method196(10, true, 0, 0, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)V", line = 155)
    public final void method198(int arg0) {
        synchronized (this) {
            this.field375 = true;
            this.notifyAll();
        }
        try {
            this.field361.join();
        } catch (InterruptedException var12) {
        }
        if (this.field374 != null) {
            try {
                this.field374.method183((byte) -105);
            } catch (IOException var11) {
            }
        }
        if (arg0 != 22442) {
            this.method198(-95);
        }
        if (this.field366 != null) {
            try {
                this.field366.method183((byte) -112);
            } catch (IOException var10) {
            }
        }
        if (this.field372 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field372.length; var7++) {
            if (this.field372[var7] != null) {
                try {
                    this.field372[var7].method183((byte) -103);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!na", name = "run", descriptor = "()V", line = 206)
    public final void run() {
        while (true) {
            class20 var2;
            synchronized (this) {
                while (true) {
                    if (this.field375) {
                        return;
                    }
                    if (this.field362 != null) {
                        var2 = this.field362;
                        this.field362 = this.field362.field300;
                        if (this.field362 == null) {
                            this.field360 = null;
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
                int var5 = var2.field297;
                if (var5 == 1) {
                    var2.field298 = new Socket(this.field376, var2.field302);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field299);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field302);
                    var2.field298 = var8;
                } else if (var5 == 4) {
                    var2.field298 = new DataInputStream(((URL) var2.field299).openStream());
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) var2.field299;
                    var2.field298 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var5 == 10) {
                    Object[] var7 = (Object[]) var2.field299;
                    var2.field298 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field301 = 1;
            } catch (Exception var10) {
                var2.field301 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IZ)Lja;", line = 309)
    public final class20 method199(int arg0, boolean arg1) {
        if (arg1) {
            field373 = null;
        }
        return this.method196(3, true, 0, arg0, null);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)V", line = 330)
    private final void method200(byte arg0) {
        try {
            File var2 = new File(this.field378 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field378 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        if (arg0 != -88) {
            this.method201(null, (byte) -79, null, null);
        }
        try {
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field378 + "uid.dat"));
            this.field365 = var5.readInt() + 1;
            var5.close();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Class;Ljava/lang/Class;)Lja;", line = 388)
    public final class20 method201(String arg0, byte arg1, Class[] arg2, Class arg3) {
        if (arg1 != 51) {
            field377 = null;
        }
        return this.method196(9, true, 0, 0, new Object[] { arg3, arg0, arg2 });
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IILjava/lang/Runnable;)Lja;", line = 402)
    public final class20 method202(int arg0, int arg1, Runnable arg2) {
        if (arg0 != 274507376) {
            this.method201(null, (byte) 125, null, null);
        }
        return this.method196(2, true, 0, arg1, arg2);
    }
}
