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

@OriginalClass("mapview!ia")
public class class18 implements Runnable {

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "Lg;")
    public class13 field219 = null;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "Lha;")
    private class16 field218 = null;

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "I")
    public int field220 = 0;

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "Ljava/lang/String;")
    private String field221 = null;

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "Ljava/lang/String;")
    private String field224 = null;

    @OriginalMember(owner = "mapview!ia", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field227 = null;

    @OriginalMember(owner = "mapview!ia", name = "o", descriptor = "Z")
    private boolean field232 = false;

    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "Ljava/lang/String;")
    public String field234 = null;

    @OriginalMember(owner = "mapview!ia", name = "k", descriptor = "Lg;")
    public class13 field228 = null;

    @OriginalMember(owner = "mapview!ia", name = "p", descriptor = "Lha;")
    private class16 field233 = null;

    @OriginalMember(owner = "mapview!ia", name = "s", descriptor = "Ljava/lang/String;")
    public String field236 = null;

    @OriginalMember(owner = "mapview!ia", name = "r", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field235;

    @OriginalMember(owner = "mapview!ia", name = "h", descriptor = "[Lg;")
    public class13[] field225;

    @OriginalMember(owner = "mapview!ia", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field231;

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "I")
    public static int field223 = 3;

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "Ljava/lang/String;")
    public static String field222;

    @OriginalMember(owner = "mapview!ia", name = "i", descriptor = "Ljava/lang/String;")
    private static String field226;

    @OriginalMember(owner = "mapview!ia", name = "l", descriptor = "Ljava/lang/String;")
    public static String field229;

    @OriginalMember(owner = "mapview!ia", name = "m", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field230;

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 416)
    public class18(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field227 = arg1;
        field229 = "Unknown";
        field222 = "1.1";
        this.field235 = arg2;
        try {
            field229 = System.getProperty("java.vendor");
            field222 = System.getProperty("java.version");
            field226 = System.getProperty("user.home");
            if (field226 != null) {
                field226 = field226 + "/";
            }
        } catch (Exception var11) {
        }
        try {
            if (arg1 == null) {
                field230 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field230 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var10) {
        }
        if (arg0) {
            this.method104(arg3, -35, arg4);
            this.field219 = new class13(new File(this.field224 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field225 = new class13[arg5];
            for (int var9 = 0; var9 < arg5; var9++) {
                this.field225[var9] = new class13(new File(this.field224 + "main_file_cache.idx" + var9), "rw", 1048576L);
            }
            this.field228 = new class13(new File(this.field224 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method108(4);
        }
        this.field232 = false;
        this.field231 = new Thread(this);
        this.field231.setPriority(10);
        this.field231.setDaemon(true);
        this.field231.start();
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ZI)Lha;", line = 43)
    public final class16 method102(boolean arg0, int arg1) {
        if (!arg0) {
            this.method102(true, -71);
        }
        return this.method105(arg1, 1, null, 0, 96);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(BI)Lha;", line = 58)
    public final class16 method103(byte arg0, int arg1) {
        if (arg0 != -79) {
            this.field234 = null;
        }
        return this.method105(arg1, 3, null, 0, 125);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IILjava/lang/String;)V", line = 72)
    private final void method104(int arg0, int arg1, String arg2) {
        if (arg1 != -35) {
            return;
        }
        if (field226 == null) {
            field226 = "~/";
        }
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field226, "/tmp/", "" };
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
                    this.field234 = this.field221 = var9.getParent() + "/";
                    this.field236 = this.field224 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var11) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IILjava/lang/Object;II)Lha;", line = 143)
    private final class16 method105(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        if (arg4 <= 72) {
            this.field218 = null;
        }
        class16 var6 = new class16();
        var6.field199 = arg1;
        var6.field202 = arg2;
        var6.field204 = arg0;
        synchronized (this) {
            if (this.field233 == null) {
                this.field233 = this.field218 = var6;
            } else {
                this.field233.field200 = var6;
                this.field233 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "run", descriptor = "()V", line = 176)
    public final void run() {
        while (true) {
            class16 var2;
            synchronized (this) {
                while (true) {
                    if (this.field232) {
                        return;
                    }
                    if (this.field218 != null) {
                        var2 = this.field218;
                        this.field218 = this.field218.field200;
                        if (this.field218 == null) {
                            this.field233 = null;
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
                int var5 = var2.field199;
                if (var5 == 1) {
                    var2.field201 = new Socket(this.field235, var2.field204);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field202);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field204);
                    var2.field201 = var8;
                } else if (var5 == 4) {
                    var2.field201 = new DataInputStream(((URL) var2.field202).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field202;
                    var2.field201 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var6 = (Object[]) var2.field202;
                    var2.field201 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field203 = 1;
            } catch (Exception var10) {
                var2.field203 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lha;", line = 265)
    public final class16 method106(Runnable arg0, int arg1, int arg2) {
        return arg1 <= 33 ? (class16) null : this.method105(arg2, 2, arg0, 0, 99);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ILjava/net/URL;)Lha;", line = 279)
    public final class16 method107(int arg0, URL arg1) {
        if (arg0 != 7796) {
            this.method103((byte) -25, 79);
        }
        return this.method105(0, 4, arg1, 0, arg0 - 7700);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)V", line = 293)
    private final void method108(int arg0) {
        try {
            File var2 = new File(this.field221 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field221 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        try {
            if (arg0 != 4) {
                this.field233 = null;
            }
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field221 + "uid.dat"));
            this.field220 = var5.readInt() + 1;
            var5.close();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lha;", line = 325)
    public final class16 method109(Class arg0, Class[] arg1, int arg2, String arg3) {
        if (arg2 != 0) {
            this.method103((byte) -100, 71);
        }
        return this.method105(0, 9, new Object[] { arg0, arg3, arg1 }, 0, 91);
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)V", line = 364)
    public final void method110(int arg0) {
        synchronized (this) {
            this.field232 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != 0) {
                return;
            }
            this.field231.join();
        } catch (InterruptedException var12) {
        }
        if (this.field219 != null) {
            try {
                this.field219.method88(-13514);
            } catch (IOException var11) {
            }
        }
        if (this.field228 != null) {
            try {
                this.field228.method88(-13514);
            } catch (IOException var10) {
            }
        }
        if (this.field225 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field225.length; var7++) {
            if (this.field225[var7] != null) {
                try {
                    this.field225[var7].method88(-13514);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lha;", line = 478)
    public final class16 method111(int arg0, Class arg1, String arg2) {
        return arg0 == 26852 ? this.method105(0, 10, new Object[] { arg1, arg2 }, 0, 122) : (class16) null;
    }
}
