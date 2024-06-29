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

@OriginalClass("client!aa")
public class class2 implements Runnable {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field23 = 0;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lo;")
    public class84 field25 = null;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lo;")
    public class84 field26 = null;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lkb;")
    private class62 field22 = null;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field34 = null;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Ljava/lang/String;")
    public String field29 = null;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Ljava/lang/String;")
    private String field31 = null;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "Z")
    private boolean field39 = false;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lkb;")
    private class62 field37 = null;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Ljava/lang/String;")
    public String field38 = null;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "Ljava/lang/String;")
    private String field40 = null;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field35;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[Lo;")
    public class84[] field27;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field41;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field24 = 3;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lse;")
    private class113 field21;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Ljc;")
    private class57 field30;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/lang/String;")
    public static String field20;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Ljava/lang/String;")
    private static String field32;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Ljava/lang/String;")
    public static String field36;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field28;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field33;

    @OriginalMember(owner = "client!aa", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        while (true) {
            class62 var2;
            synchronized (this) {
                while (true) {
                    if (this.field39) {
                        return;
                    }
                    if (this.field22 != null) {
                        var2 = this.field22;
                        this.field22 = this.field22.field1514;
                        if (this.field22 == null) {
                            this.field37 = null;
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
                int var3 = var2.field1512;
                if (var3 == 1) {
                    var2.field1516 = new Socket(this.field35, var2.field1515);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1517);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1515);
                    var2.field1516 = var6;
                } else if (var3 == 4) {
                    var2.field1516 = new DataInputStream(((URL) var2.field1517).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1517;
                    var2.field1516 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var4 = (Object[]) var2.field1517;
                    var2.field1516 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field1513 = 1;
            } catch (Exception var9) {
                var2.field1513 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Lse;", line = 103)
    public final class113 method5(int arg0) {
        if (arg0 != 0) {
            this.method14(null, -83);
        }
        return this.field21;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lkb;", line = 114)
    public final class62 method6(int arg0, String arg1, Class arg2) {
        if (arg0 <= 3) {
            this.method12(-2);
        }
        return this.method10(10, 0, 0, (byte) -33, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)Ljc;", line = 126)
    public final class57 method7(int arg0) {
        if (arg0 != 4) {
            field20 = null;
        }
        return this.field30;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Lkb;", line = 138)
    public final class62 method8(byte arg0) {
        return arg0 > -88 ? null : null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lkb;", line = 153)
    public final class62 method9(int arg0, byte arg1) {
        return arg1 <= 37 ? null : this.method10(3, 0, arg0, (byte) -33, null);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIBLjava/lang/Object;)Lkb;", line = 166)
    private final class62 method10(int arg0, int arg1, int arg2, byte arg3, Object arg4) {
        class62 var6 = new class62();
        var6.field1512 = arg0;
        var6.field1515 = arg2;
        if (arg3 != -33) {
            this.field40 = null;
        }
        var6.field1517 = arg4;
        synchronized (this) {
            if (this.field37 == null) {
                this.field37 = this.field22 = var6;
            } else {
                this.field37.field1514 = var6;
                this.field37 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 453)
    public class2(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field36 = "Unknown";
        this.field35 = arg2;
        this.field34 = arg1;
        field20 = "1.1";
        try {
            field36 = System.getProperty("java.vendor");
            field20 = System.getProperty("java.version");
            field32 = System.getProperty("user.home");
            if (field32 != null) {
                field32 = field32 + "/";
            }
        } catch (Exception var10) {
        }
        try {
            if (arg1 == null) {
                field33 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field33 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field28 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field28 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method17(0, arg4, arg3);
            this.field26 = new class84(new File(this.field40 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field27 = new class84[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field27[var7] = new class84(new File(this.field40 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field25 = new class84(new File(this.field40 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method12(-1);
        }
        this.field39 = false;
        this.field41 = new Thread(this);
        this.field41.setPriority(10);
        this.field41.setDaemon(true);
        this.field41.start();
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V", line = 209)
    public final void method11(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                return;
            }
            this.field39 = true;
            this.notifyAll();
        }
        try {
            this.field41.join();
        } catch (InterruptedException var9) {
        }
        if (this.field30 != null) {
            this.field30.method460((byte) -35);
        }
        if (this.field26 != null) {
            try {
                this.field26.method646((byte) -76);
            } catch (IOException var8) {
            }
        }
        if (this.field25 != null) {
            try {
                this.field25.method646((byte) -76);
            } catch (IOException var7) {
            }
        }
        if (this.field27 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field27.length; var3++) {
            if (this.field27[var3] != null) {
                try {
                    this.field27[var3].method646((byte) -76);
                } catch (IOException var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V", line = 282)
    private final void method12(int arg0) {
        try {
            File var2 = new File(this.field31 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field31 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field31 + "uid.dat"));
            this.field23 = var4.readInt() - arg0;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lkb;", line = 325)
    public final class62 method13(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 0) {
            this.field29 = null;
        }
        return this.method10(2, 0, arg0, (byte) -33, arg1);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/net/URL;I)Lkb;", line = 335)
    public final class62 method14(URL arg0, int arg1) {
        if (arg1 != 0) {
            field20 = null;
        }
        return this.method10(4, 0, 0, (byte) -33, arg0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Lkb;", line = 345)
    public final class62 method15(String arg0, Class[] arg1, byte arg2, Class arg3) {
        if (arg2 != -94) {
            this.method12(-79);
        }
        return this.method10(9, 0, 0, (byte) -33, new Object[] { arg3, arg0, arg1 });
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Lkb;", line = 358)
    public final class62 method16(boolean arg0, int arg1) {
        if (!arg0) {
            this.method16(false, -102);
        }
        return this.method10(1, 0, arg1, (byte) -33, null);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 371)
    private final void method17(int arg0, String arg1, int arg2) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        if (field32 == null) {
            field32 = "~/";
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field32, "/tmp/", "" };
        String var5 = ".file_store_" + arg2;
        for (int var6 = arg0; var6 < var4.length; var6++) {
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
                    this.field29 = this.field31 = var9.getParent() + "/";
                    this.field38 = this.field40 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }
}
