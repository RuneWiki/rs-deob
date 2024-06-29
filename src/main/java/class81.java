import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class81 implements Runnable {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Z")
    private boolean field1430 = false;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Z")
    private boolean field1442 = false;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    private int field1446 = 0;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    private int field1437 = 0;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "Lbi;")
    private class21 field1448;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field1440;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Ljava/io/InputStream;")
    private InputStream field1450;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1427;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Ldc;")
    public static class37 field1444 = class185.method1233((byte) 86, "; Expires=");

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Ldc;")
    public static class37 field1432 = class185.method1233((byte) 86, "mem=");

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Ldc;")
    private static class37 field1445 = class185.method1233((byte) 86, "Unable to find ");

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Ldc;")
    public static class37 field1443 = class185.method1233((byte) 86, "http:)4)4www)3runescape)3com)4l=");

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Ldc;")
    public static class37 field1433 = field1445;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lmb;")
    private class132 field1434;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "[B")
    private byte[] field1449;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BIIII)V")
    public static final void method551(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 10 % ((56 - arg0) / 52);
        for (class50 var6 = (class50) class238.field4337.method1338(-119); var6 != null; var6 = (class50) class238.field4337.method1332((byte) -89)) {
            if (var6.field995 != -1 || var6.field1007 != null) {
                int var7 = 0;
                if (arg2 > var6.field1022) {
                    var7 += arg2 - var6.field1022;
                } else if (arg2 < var6.field1014) {
                    var7 += var6.field1014 - arg2;
                }
                if (var6.field997 < arg3) {
                    var7 += arg3 - var6.field997;
                } else if (arg3 < var6.field1008) {
                    var7 += var6.field1008 - arg3;
                }
                if (var6.field1001 < var7 - 64 || class214.field4001 == 0 || var6.field1021 != arg4) {
                    if (var6.field996 != null) {
                        class49.field969.method1452(var6.field996);
                        var6.field996 = null;
                    }
                    if (var6.field1000 != null) {
                        class49.field969.method1452(var6.field1000);
                        var6.field1000 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = (var6.field1001 - var7) * class214.field4001 / var6.field1001;
                    if (var6.field996 != null) {
                        var6.field996.method752(var8);
                    } else if (var6.field995 >= 0) {
                        class40 var9 = class40.method356(class69.field1254, var6.field995, 0);
                        if (var9 != null) {
                            class146 var10 = var9.method357().method1009(class184.field3398);
                            class111 var11 = class111.method719(var10, 100, var8);
                            var11.method745(-1);
                            class49.field969.method1447(var11);
                            var6.field996 = var11;
                        }
                    }
                    if (var6.field1000 != null) {
                        var6.field1000.method752(var8);
                        if (!var6.field1000.method432(-18996)) {
                            var6.field1000 = null;
                        }
                    } else if (var6.field1007 != null && (var6.field1010 -= arg1) <= 0) {
                        int var12 = (int) (Math.random() * (double) var6.field1007.length);
                        class40 var13 = class40.method356(class69.field1254, var6.field1007[var12], 0);
                        if (var13 != null) {
                            class146 var14 = var13.method357().method1009(class184.field3398);
                            class111 var15 = class111.method719(var14, 100, var8);
                            var15.method745(0);
                            class49.field969.method1447(var15);
                            var6.field1010 = var6.field1004 + (int) ((double) (var6.field1009 - var6.field1004) * Math.random());
                            var6.field1000 = var15;
                        }
                    }
                }
            }
        }
        field1428++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
    public final int method552(byte arg0) throws IOException {
        field1451++;
        if (this.field1442) {
            return 0;
        } else {
            if (arg0 != 10) {
                field1435 = 97;
            }
            return this.field1450.read();
        }
    }

    @OriginalMember(owner = "client!he", name = "run", descriptor = "()V")
    public final void run() {
        field1438++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1446 == this.field1437) {
                        if (this.field1442) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1446;
                    if (this.field1446 > this.field1437) {
                        var3 = 5000 - this.field1446;
                    } else {
                        var3 = this.field1437 - this.field1446;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1427.write(this.field1449, var2, var3);
                    } catch (IOException var9) {
                        this.field1430 = true;
                    }
                    this.field1446 = (this.field1446 + var3) % 5000;
                    try {
                        if (this.field1446 == this.field1437) {
                            this.field1427.flush();
                        }
                    } catch (IOException var8) {
                        this.field1430 = true;
                    }
                }
            }
            try {
                if (this.field1450 != null) {
                    this.field1450.close();
                }
                if (this.field1427 != null) {
                    this.field1427.close();
                }
                if (this.field1440 != null) {
                    this.field1440.close();
                }
            } catch (IOException var7) {
            }
            this.field1449 = null;
        } catch (Exception var12) {
            class60.method455(95, var12, null);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public static void method553(byte arg0) {
        field1443 = null;
        field1444 = null;
        field1432 = null;
        field1445 = null;
        field1433 = null;
        if (arg0 != 25) {
            method556(-110, -52);
        }
    }

    @OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1429++;
        this.method557(false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
    public final int method554(int arg0) throws IOException {
        if (arg0 >= -7) {
            return 57;
        } else {
            field1431++;
            return this.field1442 ? 0 : this.field1450.available();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III[B)V")
    public final void method555(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 < 98) {
            this.method557(true);
        }
        field1441++;
        if (this.field1442) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1450.read(arg3, arg2, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lri;")
    public static final class194 method556(int arg0, int arg1) {
        field1447++;
        class194 var2 = (class194) class197.field3682.method87(-39, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class137.field2672.method1547(arg0, arg1 - 100, 3);
        if (arg1 != 100) {
            method551((byte) 12, 63, -52, 75, 30);
        }
        class194 var4 = new class194();
        if (var3 != null) {
            var4.method1288(-82, new class28(var3));
        }
        class197.field3682.method92((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public final void method557(boolean arg0) {
        field1436++;
        if (this.field1442) {
            return;
        }
        if (arg0) {
            this.field1430 = true;
        }
        synchronized (this) {
            this.field1442 = true;
            this.notifyAll();
        }
        if (this.field1434 != null) {
            while (this.field1434.field2461 == 0) {
                class238.method1548((byte) -88, 1L);
            }
            if (this.field1434.field2461 == 1) {
                try {
                    ((Thread) this.field1434.field2465).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1434 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III[B)V")
    public final void method558(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1439++;
        if (this.field1442) {
            return;
        }
        if (this.field1430) {
            this.field1430 = false;
            throw new IOException();
        }
        if (this.field1449 == null) {
            this.field1449 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field1449[this.field1437] = arg3[arg2 + var6];
                this.field1437 = (this.field1437 + 1) % 5000;
                if ((this.field1446 + 4900) % 5000 == this.field1437) {
                    throw new IOException();
                }
            }
            if (this.field1434 == null) {
                this.field1434 = this.field1448.method141(3, this, (byte) 72);
            }
            this.notifyAll();
            if (arg0 != 30000) {
                this.field1449 = null;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/net/Socket;Lbi;)V")
    public class81(Socket arg0, class21 arg1) throws IOException {
        this.field1448 = arg1;
        this.field1440 = arg0;
        this.field1440.setSoTimeout(30000);
        this.field1440.setTcpNoDelay(true);
        this.field1450 = this.field1440.getInputStream();
        this.field1427 = this.field1440.getOutputStream();
    }
}
