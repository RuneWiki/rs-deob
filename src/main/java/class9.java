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

@OriginalClass("client!bb")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Ljava/lang/String;")
    private String field185 = null;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field186 = 0;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Z")
    private boolean field179 = false;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lqd;")
    private class98 field174 = null;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field187 = null;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Ljava/lang/String;")
    public String field177 = null;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lqd;")
    private class98 field191 = null;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Ljava/lang/String;")
    private String field178 = null;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Ldc;")
    public class22 field190 = null;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Ldc;")
    public class22 field192 = null;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Ldc;")
    public class22 field189 = null;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Ljava/lang/String;")
    public String field193 = null;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field182;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[Ldc;")
    public class22[] field176;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[Ldc;")
    public class22[] field181;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field188;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field173 = 3;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lc;")
    private class13 field184;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lid;")
    private class52 field180;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field175;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field183;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field194;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lqd;", line = 3)
    public final class98 method73(int arg0) {
        return arg0 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lc;", line = 22)
    public final class13 method74(byte arg0) {
        int var2 = 81 / ((77 - arg0) / 41);
        return this.field184;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)Lqd;", line = 31)
    public final class98 method75(boolean arg0, int arg1) {
        if (!arg0) {
            this.method81((byte) -97);
        }
        return this.method76(arg1, (byte) -34, 3, null, 0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBILjava/lang/Object;I)Lqd;", line = 54)
    private final class98 method76(int arg0, byte arg1, int arg2, Object arg3, int arg4) {
        class98 var6 = new class98();
        var6.field2089 = arg0;
        var6.field2090 = arg2;
        var6.field2092 = arg3;
        synchronized (this) {
            if (this.field191 == null) {
                this.field191 = this.field174 = var6;
            } else {
                this.field191.field2094 = var6;
                this.field191 = var6;
            }
            this.notify();
            if (arg1 != -34) {
                this.field193 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;I)Lqd;", line = 93)
    public final class98 method77(Class arg0, String arg1, Class[] arg2, int arg3) {
        if (arg3 != 9) {
            this.method78((byte) -63, 86);
        }
        return this.method76(0, (byte) -34, 9, new Object[] { arg0, arg1, arg2 }, 0);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 476)
    public class9(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field182 = arg2;
        field183 = "Unknown";
        this.field187 = arg1;
        field175 = "1.1";
        try {
            field183 = System.getProperty("java.vendor");
            field175 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field194 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field194 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method82(arg3, arg4, (byte) -96);
            File var7 = new File(this.field185 + "main_file_cache.dat");
            if (var7.exists()) {
                this.field190 = new class22(var7, "rw", 52428800L);
            }
            this.field176 = new class22[5];
            for (int var8 = 0; var8 < 5; var8++) {
                File var9 = new File(this.field185 + "main_file_cache.idx" + var8);
                if (var9.exists()) {
                    this.field176[var8] = new class22(var9, "rw", 1048576L);
                }
            }
            this.field189 = new class22(new File(this.field178 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field181 = new class22[arg5];
            for (int var10 = 0; var10 < arg5; var10++) {
                this.field181[var10] = new class22(new File(this.field178 + "main_file_cache.idx" + var10), "rw", 1048576L);
            }
            this.field192 = new class22(new File(this.field178 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method84(1);
        }
        this.field179 = false;
        this.field188 = new Thread(this);
        this.field188.setPriority(10);
        this.field188.setDaemon(true);
        this.field188.start();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Lqd;", line = 113)
    public final class98 method78(byte arg0, int arg1) {
        if (arg0 >= -34) {
            this.method84(-124);
        }
        return this.method76(arg1, (byte) -34, 1, null, 0);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 123)
    public final void method79(int arg0) {
        synchronized (this) {
            this.field179 = true;
            this.notifyAll();
        }
        try {
            this.field188.join();
        } catch (InterruptedException var10) {
        }
        if (this.field180 != null) {
            this.field180.method449(false);
        }
        if (arg0 != 0) {
            this.field188 = null;
        }
        if (this.field189 != null) {
            try {
                this.field189.method173(-1);
            } catch (IOException var9) {
            }
        }
        if (this.field192 != null) {
            try {
                this.field192.method173(-1);
            } catch (IOException var8) {
            }
        }
        if (this.field181 != null) {
            for (int var3 = 0; var3 < this.field181.length; var3++) {
                if (this.field181[var3] != null) {
                    try {
                        this.field181[var3].method173(-1);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field190 != null) {
            try {
                this.field190.method173(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field176 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field176.length; var4++) {
            if (this.field176[var4] != null) {
                try {
                    this.field176[var4].method173(arg0 - 1);
                } catch (IOException var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lqd;", line = 212)
    public final class98 method80(byte arg0, String arg1, Class arg2) {
        int var4 = 93 % ((-arg0 - 30) / 50);
        return this.method76(0, (byte) -34, 10, new Object[] { arg2, arg1 }, 0);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Lid;", line = 221)
    public final class52 method81(byte arg0) {
        return arg0 >= -108 ? null : this.field180;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 231)
    private final void method82(int arg0, String arg1, byte arg2) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
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
                    if (arg1.length() > 0) {
                        var9 = new File(var9, arg1);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field193 = this.field185 = var9.getParent() + "/";
                    this.field177 = this.field178 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        if (arg2 == -96) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bb", name = "run", descriptor = "()V", line = 298)
    public final void run() {
        while (true) {
            class98 var2;
            synchronized (this) {
                while (true) {
                    if (this.field179) {
                        return;
                    }
                    if (this.field174 != null) {
                        var2 = this.field174;
                        this.field174 = this.field174.field2094;
                        if (this.field174 == null) {
                            this.field191 = null;
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
                int var3 = var2.field2090;
                if (var3 == 1) {
                    var2.field2093 = new Socket(this.field182, var2.field2089);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2092);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2089);
                    var2.field2093 = var4;
                } else if (var3 == 4) {
                    var2.field2093 = new DataInputStream(((URL) var2.field2092).openStream());
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field2092;
                    var2.field2093 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field2092;
                    var2.field2093 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2091 = 1;
            } catch (Exception var9) {
                var2.field2091 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lqd;", line = 396)
    public final class98 method83(int arg0, Runnable arg1, byte arg2) {
        if (arg2 != 31) {
            this.method74((byte) 122);
        }
        return this.method76(arg0, (byte) -34, 2, arg1, 0);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 409)
    private final void method84(int arg0) {
        try {
            File var2 = new File(this.field185 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field185 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field185 + "uid.dat"));
            this.field186 = arg0 + var4.readInt();
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLjava/net/URL;)Lqd;", line = 458)
    public final class98 method85(byte arg0, URL arg1) {
        int var3 = 66 % ((56 - arg0) / 56);
        return this.method76(0, (byte) -34, 4, arg1, 0);
    }
}
