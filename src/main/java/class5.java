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

@OriginalClass("mapview!c")
public class class5 implements Runnable {

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "Lfa;")
    public class12 field62 = null;

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "Lfa;")
    public class12 field65 = null;

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "I")
    public int field68 = 0;

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "Ljava/lang/String;")
    private String field67 = null;

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "Ljava/lang/String;")
    public String field72 = null;

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "Ljava/lang/String;")
    private String field70 = null;

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "Z")
    private boolean field69 = false;

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "Ls;")
    private class33 field64 = null;

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field66 = null;

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "Ljava/lang/String;")
    public String field63 = null;

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "Ls;")
    private class33 field75 = null;

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field74;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "[Lfa;")
    public class12[] field61;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field59;

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "I")
    public static int field60 = 3;

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "Ljava/lang/String;")
    public static String field71;

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "Ljava/lang/String;")
    private static String field76;

    @OriginalMember(owner = "mapview!c", name = "t", descriptor = "Ljava/lang/String;")
    public static String field77;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field58;

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field73;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(BLjava/net/URL;)Ls;", line = 8)
    public final class33 method34(byte arg0, URL arg1) {
        if (arg0 != 9) {
            this.field69 = true;
        }
        return this.method43(0, 4, 0, arg1, 7);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(II)Ls;", line = 19)
    public final class33 method35(int arg0, int arg1) {
        if (arg1 != 19877) {
            this.method38(-119, null, false);
        }
        return this.method43(0, 1, arg0, null, 7);
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(II)Ls;", line = 30)
    public final class33 method36(int arg0, int arg1) {
        return arg1 <= 68 ? (class33) null : this.method43(0, 3, arg0, null, 7);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)V", line = 44)
    private final void method37(int arg0) {
        try {
            File var2 = new File(this.field70 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field70 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        try {
            if (arg0 != 99999999) {
                return;
            }
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field70 + "uid.dat"));
            this.field68 = var5.readInt() + 1;
            var5.close();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Ls;", line = 76)
    public final class33 method38(int arg0, Runnable arg1, boolean arg2) {
        if (!arg2) {
            this.field66 = null;
        }
        return this.method43(0, 2, arg0, arg1, 7);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Ls;", line = 87)
    public final class33 method39(byte arg0, Class arg1, String arg2) {
        return arg0 < 57 ? (class33) null : this.method43(0, 10, 0, new Object[] { arg1, arg2 }, 7);
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I)V", line = 102)
    public final void method40(int arg0) {
        synchronized (this) {
            this.field69 = true;
            this.notifyAll();
        }
        try {
            this.field59.join();
        } catch (InterruptedException var12) {
        }
        if (arg0 != -33) {
            return;
        }
        if (this.field65 != null) {
            try {
                this.field65.method95(arg0 + 11815);
            } catch (IOException var11) {
            }
        }
        if (this.field62 != null) {
            try {
                this.field62.method95(11782);
            } catch (IOException var10) {
            }
        }
        if (this.field61 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field61.length; var7++) {
            if (this.field61[var7] != null) {
                try {
                    this.field61[var7].method95(11782);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Ls;", line = 160)
    public final class33 method41(Class[] arg0, byte arg1, String arg2, Class arg3) {
        int var5 = -109 % ((arg1 - 55) / 60);
        return this.method43(0, 9, 0, new Object[] { arg3, arg2, arg0 }, 7);
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 430)
    public class5(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field77 = "Unknown";
        this.field66 = arg1;
        this.field74 = arg2;
        field71 = "1.1";
        try {
            field77 = System.getProperty("java.vendor");
            field71 = System.getProperty("java.version");
            field76 = System.getProperty("user.home");
            if (field76 != null) {
                field76 = field76 + "/";
            }
        } catch (Exception var13) {
        }
        try {
            if (arg1 == null) {
                field73 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field73 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field58 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field58 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method42(arg3, arg4, -99);
            this.field65 = new class12(new File(this.field67 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field61 = new class12[arg5];
            for (int var10 = 0; var10 < arg5; var10++) {
                this.field61[var10] = new class12(new File(this.field67 + "main_file_cache.idx" + var10), "rw", 1048576L);
            }
            this.field62 = new class12(new File(this.field67 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method37(99999999);
        }
        this.field69 = false;
        this.field59 = new Thread(this);
        this.field59.setPriority(10);
        this.field59.setDaemon(true);
        this.field59.start();
    }

    @OriginalMember(owner = "mapview!c", name = "run", descriptor = "()V", line = 178)
    public final void run() {
        while (true) {
            class33 var2;
            synchronized (this) {
                while (true) {
                    if (this.field69) {
                        return;
                    }
                    if (this.field64 != null) {
                        var2 = this.field64;
                        this.field64 = this.field64.field474;
                        if (this.field64 == null) {
                            this.field75 = null;
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
                int var5 = var2.field475;
                if (var5 == 1) {
                    var2.field476 = new Socket(this.field74, var2.field473);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field471);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field473);
                    var2.field476 = var8;
                } else if (var5 == 4) {
                    var2.field476 = new DataInputStream(((URL) var2.field471).openStream());
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) var2.field471;
                    var2.field476 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var5 == 10) {
                    Object[] var7 = (Object[]) var2.field471;
                    var2.field476 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field472 = 1;
            } catch (Exception var10) {
                var2.field472 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 289)
    private final void method42(int arg0, String arg1, int arg2) {
        if (field76 == null) {
            field76 = "~/";
        }
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String var4 = ".file_store_" + arg0;
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field76, "/tmp/", "" };
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
                    this.field72 = this.field70 = var9.getParent() + "/";
                    this.field63 = this.field67 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var11) {
            }
        }
        if (arg2 >= -56) {
            field76 = null;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIILjava/lang/Object;I)Ls;", line = 370)
    private final class33 method43(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class33 var6 = new class33();
        if (arg4 != 7) {
            return (class33) null;
        }
        var6.field473 = arg2;
        var6.field475 = arg1;
        var6.field471 = arg3;
        synchronized (this) {
            if (this.field75 == null) {
                this.field75 = this.field64 = var6;
            } else {
                this.field75.field474 = var6;
                this.field75 = var6;
            }
            this.notify();
            return var6;
        }
    }
}
