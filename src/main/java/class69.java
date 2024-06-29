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

@OriginalClass("client!lc")
public class class69 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
    private boolean field1703 = false;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Ljava/lang/String;")
    public String field1702 = null;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Led;")
    private class29 field1707 = null;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field1704 = 0;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Led;")
    private class29 field1713 = null;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Ljava/lang/String;")
    private String field1720 = null;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lq;")
    public class96 field1710 = null;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Ljava/lang/String;")
    private String field1716 = null;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lq;")
    public class96 field1718 = null;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Ljava/applet/Applet;")
    public Applet field1722 = null;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Ljava/lang/String;")
    public String field1723 = null;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field1712;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lq;")
    public class96[] field1705;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field1715;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1719 = 3;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Ldb;")
    private class21 field1709;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lle;")
    private class71 field1714;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Ljava/lang/String;")
    private static String field1708;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1717;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1721;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1706;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1711;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 3)
    public final void method650(int arg0) {
        synchronized (this) {
            this.field1703 = true;
            this.notifyAll();
        }
        try {
            this.field1715.join();
            if (arg0 != 0) {
                this.method661(-55);
            }
        } catch (InterruptedException var7) {
        }
        if (this.field1709 != null) {
            this.field1709.method310((byte) -102);
        }
        if (this.field1718 != null) {
            try {
                this.field1718.method834(1);
            } catch (IOException var6) {
            }
        }
        if (this.field1710 != null) {
            try {
                this.field1710.method834(arg0 ^ 0x1);
            } catch (IOException var5) {
            }
        }
        if (this.field1705 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1705.length; var3++) {
            if (this.field1705[var3] != null) {
                try {
                    this.field1705[var3].method834(arg0 ^ 0x1);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;B)Led;", line = 61)
    public final class29 method651(Class[] arg0, String arg1, Class arg2, byte arg3) {
        if (arg3 > -5) {
            this.method654(-96, -109, 81, -55, null);
        }
        return this.method654(106, 0, 9, 0, new Object[] { arg2, arg1, arg0 });
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lle;", line = 73)
    public final class71 method652(int arg0) {
        return arg0 == -25100 ? this.field1714 : null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/net/URL;)Led;", line = 85)
    public final class29 method653(boolean arg0, URL arg1) {
        if (arg0) {
            this.method662(-42, 102, null);
        }
        return this.method654(124, 0, 4, 0, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILjava/lang/Object;)Led;", line = 99)
    private final class29 method654(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class29 var6 = new class29();
        var6.field817 = arg4;
        if (arg0 < 100) {
            field1708 = null;
        }
        var6.field814 = arg1;
        var6.field815 = arg2;
        synchronized (this) {
            if (this.field1713 == null) {
                this.field1713 = this.field1707 = var6;
            } else {
                this.field1713.field818 = var6;
                this.field1713 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 461)
    public class69(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field1722 = arg1;
        this.field1712 = arg2;
        field1721 = "1.1";
        field1717 = "Unknown";
        try {
            field1717 = System.getProperty("java.vendor");
            field1721 = System.getProperty("java.version");
            field1708 = System.getProperty("user.home");
            if (field1708 != null) {
                field1708 = field1708 + "/";
            }
        } catch (Exception var10) {
        }
        try {
            if (arg1 == null) {
                field1711 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1711 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field1706 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1706 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method662(-3849, arg3, arg4);
            this.field1718 = new class96(new File(this.field1716 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field1705 = new class96[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field1705[var7] = new class96(new File(this.field1716 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field1710 = new class96(new File(this.field1716 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method655(6);
        }
        this.field1703 = false;
        this.field1715 = new Thread(this);
        this.field1715.setPriority(10);
        this.field1715.setDaemon(true);
        this.field1715.start();
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V", line = 133)
    private final void method655(int arg0) {
        try {
            File var2 = new File(this.field1720 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field1720 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        if (arg0 != 6) {
            this.field1704 = 116;
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field1720 + "uid.dat"));
            this.field1704 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Ldb;", line = 168)
    public final class21 method656(int arg0) {
        if (arg0 != 1048576) {
            this.method661(-47);
        }
        return this.field1709;
    }

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V", line = 182)
    public final void run() {
        while (true) {
            class29 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1703) {
                        return;
                    }
                    if (this.field1707 != null) {
                        var2 = this.field1707;
                        this.field1707 = this.field1707.field818;
                        if (this.field1707 == null) {
                            this.field1713 = null;
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
                int var3 = var2.field815;
                if (var3 == 1) {
                    var2.field819 = new Socket(this.field1712, var2.field814);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field817);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field814);
                    var2.field819 = var6;
                } else if (var3 == 4) {
                    var2.field819 = new DataInputStream(((URL) var2.field817).openStream());
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field817;
                    var2.field819 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field817;
                    var2.field819 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field816 = 1;
            } catch (Exception var9) {
                var2.field816 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Led;", line = 279)
    public final class29 method657(Class arg0, String arg1, boolean arg2) {
        if (!arg2) {
            field1717 = null;
        }
        return this.method654(126, 0, 10, 0, new Object[] { arg0, arg1 });
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Led;", line = 298)
    public final class29 method658(int arg0, int arg1) {
        return arg0 == 11545 ? this.method654(122, arg1, 3, 0, null) : null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/lang/Runnable;)Led;", line = 320)
    public final class29 method659(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 0) {
            this.method657(null, null, false);
        }
        return this.method654(114, arg0, 2, 0, arg2);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)Led;", line = 343)
    public final class29 method660(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method662(-29, 20, null);
        }
        return this.method654(125, arg1, 1, 0, null);
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Led;", line = 359)
    public final class29 method661(int arg0) {
        return arg0 < 81 ? null : null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/lang/String;)V", line = 378)
    private final void method662(int arg0, int arg1, String arg2) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        if (field1708 == null) {
            field1708 = "~/";
        }
        String var4 = ".file_store_" + arg1;
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field1708, "/tmp/", "" };
        if (arg0 != -3849) {
            this.method657(null, null, false);
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
                    this.field1723 = this.field1720 = var9.getParent() + "/";
                    this.field1702 = this.field1716 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }
}
