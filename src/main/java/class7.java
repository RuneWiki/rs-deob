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

@OriginalClass("mapview!d")
public class class7 implements Runnable {

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Lw;")
    private class37 field136 = null;

    @OriginalMember(owner = "mapview!d", name = "k", descriptor = "Ljava/lang/String;")
    private String field146 = null;

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Z")
    private boolean field143 = false;

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field139 = null;

    @OriginalMember(owner = "mapview!d", name = "l", descriptor = "Lw;")
    private class37 field147 = null;

    @OriginalMember(owner = "mapview!d", name = "q", descriptor = "Ljava/lang/String;")
    public String field152 = null;

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Lk;")
    public class19 field137 = null;

    @OriginalMember(owner = "mapview!d", name = "m", descriptor = "Lk;")
    public class19 field148 = null;

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Ljava/lang/String;")
    public String field138 = null;

    @OriginalMember(owner = "mapview!d", name = "t", descriptor = "I")
    public int field155 = 0;

    @OriginalMember(owner = "mapview!d", name = "j", descriptor = "Ljava/lang/String;")
    private String field145 = null;

    @OriginalMember(owner = "mapview!d", name = "r", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field153;

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "[Lk;")
    public class19[] field144;

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field142;

    @OriginalMember(owner = "mapview!d", name = "s", descriptor = "I")
    public static int field154 = 3;

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Ljava/lang/String;")
    public static String field140;

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "Ljava/lang/String;")
    public static String field141;

    @OriginalMember(owner = "mapview!d", name = "n", descriptor = "Ljava/lang/String;")
    private static String field149;

    @OriginalMember(owner = "mapview!d", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field150;

    @OriginalMember(owner = "mapview!d", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field151;

    @OriginalMember(owner = "mapview!d", name = "run", descriptor = "()V", line = 20)
    public final void run() {
        while (true) {
            class37 var2;
            synchronized (this) {
                while (true) {
                    if (this.field143) {
                        return;
                    }
                    if (this.field147 != null) {
                        var2 = this.field147;
                        this.field147 = this.field147.field461;
                        if (this.field147 == null) {
                            this.field136 = null;
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
                int var5 = var2.field460;
                if (var5 == 1) {
                    var2.field459 = new Socket(this.field153, var2.field462);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field457);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field462);
                    var2.field459 = var6;
                } else if (var5 == 4) {
                    var2.field459 = new DataInputStream(((URL) var2.field457).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field457;
                    var2.field459 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var8 = (Object[]) var2.field457;
                    var2.field459 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field458 = 1;
            } catch (Exception var10) {
                var2.field458 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 429)
    public class7(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field139 = arg1;
        field140 = "1.1";
        field141 = "Unknown";
        this.field153 = arg2;
        try {
            field141 = System.getProperty("java.vendor");
            field140 = System.getProperty("java.version");
            field149 = System.getProperty("user.home");
            if (field149 != null) {
                field149 = field149 + "/";
            }
        } catch (Exception var13) {
        }
        try {
            if (arg1 == null) {
                field150 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field150 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field151 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field151 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method70(-35, arg3, arg4);
            this.field148 = new class19(new File(this.field146 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field144 = new class19[arg5];
            for (int var10 = 0; var10 < arg5; var10++) {
                this.field144[var10] = new class19(new File(this.field146 + "main_file_cache.idx" + var10), "rw", 1048576L);
            }
            this.field137 = new class19(new File(this.field146 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method72(-8891);
        }
        this.field143 = false;
        this.field142 = new Thread(this);
        this.field142.setPriority(10);
        this.field142.setDaemon(true);
        this.field142.start();
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lw;", line = 115)
    public final class37 method66(int arg0, String arg1, Class arg2) {
        if (arg0 != 5019) {
            this.field152 = null;
        }
        return this.method67(0, 98, 10, 0, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IIIILjava/lang/Object;)Lw;", line = 128)
    private final class37 method67(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class37 var6 = new class37();
        var6.field457 = arg4;
        if (arg1 < 8) {
            this.field139 = null;
        }
        var6.field460 = arg2;
        var6.field462 = arg3;
        synchronized (this) {
            if (this.field136 == null) {
                this.field136 = this.field147 = var6;
            } else {
                this.field136.field461 = var6;
                this.field136 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IILjava/lang/Runnable;)Lw;", line = 163)
    public final class37 method68(int arg0, int arg1, Runnable arg2) {
        return arg1 == 10448 ? this.method67(0, arg1 - 10370, 2, arg0, arg2) : (class37) null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ILjava/net/URL;)Lw;", line = 191)
    public final class37 method69(int arg0, URL arg1) {
        return arg0 >= -73 ? (class37) null : this.method67(0, 127, 4, 0, arg1);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IILjava/lang/String;)V", line = 211)
    private final void method70(int arg0, int arg1, String arg2) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        if (field149 == null) {
            field149 = "~/";
        }
        String var4 = ".file_store_" + arg1;
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field149, "/tmp/", "" };
        if (arg0 != -35) {
            this.field145 = null;
        }
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
                    this.field152 = this.field145 = var9.getParent() + "/";
                    this.field138 = this.field146 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var11) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Class;)Lw;", line = 285)
    public final class37 method71(Class[] arg0, String arg1, byte arg2, Class arg3) {
        int var5 = -105 / ((-arg2 - 12) / 40);
        return this.method67(0, 31, 9, 0, new Object[] { arg3, arg1, arg0 });
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 304)
    private final void method72(int arg0) {
        try {
            File var2 = new File(this.field145 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field145 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        try {
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field145 + "uid.dat"));
            this.field155 = var5.readInt() + 1;
            if (arg0 != -8891) {
                this.field136 = null;
            }
            var5.close();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)V", line = 340)
    public final void method73(byte arg0) {
        synchronized (this) {
            this.field143 = true;
            this.notifyAll();
        }
        try {
            this.field142.join();
            int var4 = 87 / ((arg0 - 66) / 34);
        } catch (InterruptedException var13) {
        }
        if (this.field148 != null) {
            try {
                this.field148.method144(62);
            } catch (IOException var12) {
            }
        }
        if (this.field137 != null) {
            try {
                this.field137.method144(-101);
            } catch (IOException var11) {
            }
        }
        if (this.field144 == null) {
            return;
        }
        for (int var8 = 0; var8 < this.field144.length; var8++) {
            if (this.field144[var8] != null) {
                try {
                    this.field144[var8].method144(-96);
                } catch (IOException var10) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BI)Lw;", line = 390)
    public final class37 method74(byte arg0, int arg1) {
        if (arg0 < 62) {
            this.method74((byte) -119, -44);
        }
        return this.method67(0, 114, 1, arg1, null);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(II)Lw;", line = 405)
    public final class37 method75(int arg0, int arg1) {
        return arg1 == 0 ? this.method67(0, arg1 ^ 0x48, 3, arg0, null) : (class37) null;
    }
}
