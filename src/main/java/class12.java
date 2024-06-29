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

@OriginalClass("mapview!g")
public class class12 implements Runnable {

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "Lh;")
    public class14 field190 = null;

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field191 = null;

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "Lga;")
    private class13 field194 = null;

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "Ljava/lang/String;")
    private String field195 = null;

    @OriginalMember(owner = "mapview!g", name = "m", descriptor = "Ljava/lang/String;")
    public String field200 = null;

    @OriginalMember(owner = "mapview!g", name = "p", descriptor = "Z")
    private boolean field203 = false;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Lga;")
    private class13 field188 = null;

    @OriginalMember(owner = "mapview!g", name = "n", descriptor = "Ljava/lang/String;")
    public String field201 = null;

    @OriginalMember(owner = "mapview!g", name = "q", descriptor = "I")
    public int field204 = 0;

    @OriginalMember(owner = "mapview!g", name = "l", descriptor = "Lh;")
    public class14 field199 = null;

    @OriginalMember(owner = "mapview!g", name = "s", descriptor = "Ljava/lang/String;")
    private String field206 = null;

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field197;

    @OriginalMember(owner = "mapview!g", name = "r", descriptor = "[Lh;")
    public class14[] field205;

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field198;

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "I")
    public static int field189 = 3;

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "Ljava/lang/String;")
    private static String field192;

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "Ljava/lang/String;")
    public static String field196;

    @OriginalMember(owner = "mapview!g", name = "o", descriptor = "Ljava/lang/String;")
    public static String field202;

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field193;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(BI)Lga;", line = 4)
    public final class13 method66(byte arg0, int arg1) {
        if (arg0 != -22) {
            this.method71((byte) -2, null, null);
        }
        return this.method75(arg1, null, (byte) 69, 1, 0);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Lga;", line = 17)
    public final class13 method67(Class arg0, int arg1, Class[] arg2, String arg3) {
        if (arg1 != 0) {
            this.method69((byte) 10, null);
        }
        return this.method75(0, new Object[] { arg0, arg3, arg2 }, (byte) 63, 9, 0);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 32)
    public final void method68(byte arg0) {
        synchronized (this) {
            this.field203 = true;
            this.notifyAll();
        }
        try {
            this.field198.join();
        } catch (InterruptedException var12) {
        }
        if (this.field199 != null) {
            try {
                this.field199.method80(false);
            } catch (IOException var11) {
            }
        }
        if (this.field190 != null) {
            try {
                this.field190.method80(false);
            } catch (IOException var10) {
            }
        }
        if (arg0 != 101 || this.field205 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field205.length; var7++) {
            if (this.field205[var7] != null) {
                try {
                    this.field205[var7].method80(false);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(BLjava/net/URL;)Lga;", line = 84)
    public final class13 method69(byte arg0, URL arg1) {
        return arg0 == -76 ? this.method75(0, arg1, (byte) 75, 4, 0) : (class13) null;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lga;", line = 98)
    public final class13 method70(Runnable arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field189 = 8;
        }
        return this.method75(arg2, arg0, (byte) 84, 2, 0);
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 398)
    public class12(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field197 = arg2;
        field196 = "1.1";
        this.field191 = arg1;
        field202 = "Unknown";
        try {
            field202 = System.getProperty("java.vendor");
            field196 = System.getProperty("java.version");
            field192 = System.getProperty("user.home");
            if (field192 != null) {
                field192 = field192 + "/";
            }
        } catch (Exception var11) {
        }
        try {
            if (arg1 == null) {
                field193 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field193 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var10) {
        }
        if (arg0) {
            this.method72(arg3, (byte) -104, arg4);
            this.field199 = new class14(new File(this.field206 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field205 = new class14[arg5];
            for (int var9 = 0; var9 < arg5; var9++) {
                this.field205[var9] = new class14(new File(this.field206 + "main_file_cache.idx" + var9), "rw", 1048576L);
            }
            this.field190 = new class14(new File(this.field206 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method74(99999999);
        }
        this.field203 = false;
        this.field198 = new Thread(this);
        this.field198.setPriority(10);
        this.field198.setDaemon(true);
        this.field198.start();
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lga;", line = 120)
    public final class13 method71(byte arg0, String arg1, Class arg2) {
        if (arg0 <= 108) {
            this.field190 = null;
        }
        return this.method75(0, new Object[] { arg2, arg1 }, (byte) -46, 10, 0);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 142)
    private final void method72(int arg0, byte arg1, String arg2) {
        if (field192 == null) {
            field192 = "~/";
        }
        if (arg1 >= -97) {
            return;
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field192, "/tmp/", "" };
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
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
                    this.field200 = this.field195 = var9.getParent() + "/";
                    this.field201 = this.field206 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var11) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(IB)Lga;", line = 220)
    public final class13 method73(int arg0, byte arg1) {
        return arg1 == -53 ? this.method75(arg0, null, (byte) 56, 3, 0) : (class13) null;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)V", line = 274)
    private final void method74(int arg0) {
        try {
            File var2 = new File(this.field195 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field195 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        try {
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field195 + "uid.dat"));
            this.field204 = var5.readInt() + 1;
            var5.close();
        } catch (Exception var7) {
        }
        if (arg0 != 99999999) {
            this.field205 = null;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "run", descriptor = "()V", line = 305)
    public final void run() {
        while (true) {
            class13 var2;
            synchronized (this) {
                while (true) {
                    if (this.field203) {
                        return;
                    }
                    if (this.field188 != null) {
                        var2 = this.field188;
                        this.field188 = this.field188.field208;
                        if (this.field188 == null) {
                            this.field194 = null;
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
                int var5 = var2.field209;
                if (var5 == 1) {
                    var2.field207 = new Socket(this.field197, var2.field211);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field210);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field211);
                    var2.field207 = var6;
                } else if (var5 == 4) {
                    var2.field207 = new DataInputStream(((URL) var2.field210).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field210;
                    var2.field207 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var8 = (Object[]) var2.field210;
                    var2.field207 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field212 = 1;
            } catch (Exception var10) {
                var2.field212 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(ILjava/lang/Object;BII)Lga;", line = 462)
    private final class13 method75(int arg0, Object arg1, byte arg2, int arg3, int arg4) {
        class13 var6 = new class13();
        int var7 = 12 % ((14 - arg2) / 37);
        var6.field211 = arg0;
        var6.field210 = arg1;
        var6.field209 = arg3;
        synchronized (this) {
            if (this.field194 == null) {
                this.field194 = this.field188 = var6;
            } else {
                this.field194.field208 = var6;
                this.field194 = var6;
            }
            this.notify();
            return var6;
        }
    }
}
