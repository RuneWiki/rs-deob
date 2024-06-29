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

@OriginalClass("client!bd")
public class class11 implements Runnable {

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Ljava/lang/String;")
    private String field278 = null;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field277 = null;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lrc;")
    public class104 field280 = null;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Ljava/lang/String;")
    private String field279 = null;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lrc;")
    public class104 field283 = null;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field286 = 0;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Ljava/lang/String;")
    public String field276 = null;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Ltd;")
    private class118 field284 = null;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Z")
    private boolean field285 = false;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Ljava/lang/String;")
    public String field289 = null;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Ltd;")
    private class118 field291 = null;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field288;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "[Lrc;")
    public class104[] field293;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field290;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field275 = 3;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lwa;")
    private class132 field272;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Ld;")
    private class22 field273;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field274;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field282;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Ljava/lang/String;")
    private static String field292;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field281;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field287;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Ltd;", line = 3)
    public final class118 method62(String arg0, Class[] arg1, Class arg2, int arg3) {
        if (arg3 != -25053) {
            this.field293 = null;
        }
        return this.method67(0, 9, 0, true, new Object[] { arg2, arg0, arg1 });
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Ld;", line = 13)
    public final class22 method63(boolean arg0) {
        return arg0 ? this.field273 : null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Ltd;", line = 25)
    public final class118 method64(int arg0, int arg1) {
        if (arg1 != 10954) {
            this.method69(null, 108, null);
        }
        return this.method67(arg0, 3, 0, true, null);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Ltd;", line = 37)
    public final class118 method65(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field289 = null;
        }
        return this.method67(arg0, 1, 0, true, null);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 64)
    private final void method66(int arg0, String arg1, boolean arg2) {
        if (field292 == null) {
            field292 = "~/";
        }
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        if (!arg2) {
            this.method70(49);
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field292, "/tmp/", "" };
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
                    this.field289 = this.field279 = var9.getParent() + "/";
                    this.field276 = this.field278 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 459)
    public class11(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field274 = "1.1";
        this.field277 = arg1;
        this.field288 = arg2;
        field282 = "Unknown";
        try {
            field282 = System.getProperty("java.vendor");
            field274 = System.getProperty("java.version");
            field292 = System.getProperty("user.home");
            if (field292 != null) {
                field292 = field292 + "/";
            }
        } catch (Exception var10) {
        }
        try {
            if (arg1 == null) {
                field281 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field281 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field287 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field287 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method66(arg3, arg4, true);
            this.field280 = new class104(new File(this.field278 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field293 = new class104[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field293[var7] = new class104(new File(this.field278 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field283 = new class104(new File(this.field278 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method73((byte) 121);
        }
        this.field285 = false;
        this.field290 = new Thread(this);
        this.field290.setPriority(10);
        this.field290.setDaemon(true);
        this.field290.start();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZLjava/lang/Object;)Ltd;", line = 142)
    private final class118 method67(int arg0, int arg1, int arg2, boolean arg3, Object arg4) {
        class118 var6 = new class118();
        var6.field2943 = arg1;
        var6.field2945 = arg0;
        var6.field2948 = arg4;
        synchronized (this) {
            if (!arg3) {
                this.field277 = null;
            }
            if (this.field291 == null) {
                this.field291 = this.field284 = var6;
            } else {
                this.field291.field2947 = var6;
                this.field291 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Ltd;", line = 172)
    public final class118 method68(int arg0) {
        if (arg0 <= 84) {
            this.field279 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ltd;", line = 198)
    public final class118 method69(Class arg0, int arg1, String arg2) {
        return arg1 <= 18 ? null : this.method67(0, 10, 0, true, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lwa;", line = 220)
    public final class132 method70(int arg0) {
        return arg0 == 10 ? this.field272 : null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/net/URL;I)Ltd;", line = 231)
    public final class118 method71(URL arg0, int arg1) {
        if (arg1 != 1048576) {
            field281 = null;
        }
        return this.method67(0, 4, 0, true, arg0);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 251)
    public final void method72(boolean arg0) {
        synchronized (this) {
            this.field285 = arg0;
            this.notifyAll();
        }
        try {
            this.field290.join();
        } catch (InterruptedException var7) {
        }
        if (this.field272 != null) {
            this.field272.method1044(false);
        }
        if (this.field280 != null) {
            try {
                this.field280.method771(121);
            } catch (IOException var6) {
            }
        }
        if (this.field283 != null) {
            try {
                this.field283.method771(120);
            } catch (IOException var5) {
            }
        }
        if (this.field293 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field293.length; var3++) {
            if (this.field293[var3] != null) {
                try {
                    this.field293[var3].method771(64);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "run", descriptor = "()V", line = 303)
    public final void run() {
        while (true) {
            class118 var2;
            synchronized (this) {
                while (true) {
                    if (this.field285) {
                        return;
                    }
                    if (this.field284 != null) {
                        var2 = this.field284;
                        this.field284 = this.field284.field2947;
                        if (this.field284 == null) {
                            this.field291 = null;
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
                int var3 = var2.field2943;
                if (var3 == 1) {
                    var2.field2946 = new Socket(this.field288, var2.field2945);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2948);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2945);
                    var2.field2946 = var6;
                } else if (var3 == 4) {
                    var2.field2946 = new DataInputStream(((URL) var2.field2948).openStream());
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2948;
                    var2.field2946 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field2948;
                    var2.field2946 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2944 = 1;
            } catch (Exception var9) {
                var2.field2944 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 394)
    private final void method73(byte arg0) {
        if (arg0 <= 76) {
            this.field279 = null;
        }
        try {
            File var2 = new File(this.field279 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field279 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field279 + "uid.dat"));
            this.field286 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/Runnable;B)Ltd;", line = 424)
    public final class118 method74(int arg0, Runnable arg1, byte arg2) {
        return arg2 == 2 ? this.method67(arg0, 2, 0, true, arg1) : null;
    }
}
