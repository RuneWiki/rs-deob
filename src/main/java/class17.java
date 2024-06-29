import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 implements Runnable {

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    private int field444 = 0;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    private int field445 = 0;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
    private boolean field443 = false;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Z")
    private boolean field440 = false;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Ljava/net/Socket;")
    private Socket field450;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lue;")
    private class139 field438;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Ljava/io/InputStream;")
    private InputStream field436;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field433;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Lwd;")
    private static class150 field454 = class2.method9(true, "No response from server)3");

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lwd;")
    public static class150 field451 = field454;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field449 = new CRC32();

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "Lwd;")
    private static class150 field459 = class2.method9(true, "Loaded config");

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Lwd;")
    public static class150 field456 = field459;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "[I")
    public static int[] field458 = new int[1000];

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field464 = 0;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "Lwd;")
    private static class150 field463 = class2.method9(true, "World");

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "Lwd;")
    public static class150 field460 = field463;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Lwd;")
    public static class150 field465 = class2.method9(true, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Lwd;")
    public static class150 field461 = field463;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "Lwd;")
    public static class150 field467 = class2.method9(true, "Freie Welt");

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "Lwd;")
    public static class150 field462 = class2.method9(true, "Duell akzeptieren");

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "[I")
    public static int[] field468 = new int[2048];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Loc;")
    private class100 field453;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lff;")
    public static class42 field434;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "Lkc;")
    public static class72 field469;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[B")
    private byte[] field441;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method119(boolean arg0) {
        field454 = null;
        field449 = null;
        field451 = null;
        field463 = null;
        field434 = null;
        field469 = null;
        if (!arg0) {
            field454 = null;
        }
        field467 = null;
        field462 = null;
        field461 = null;
        field456 = null;
        field460 = null;
        field458 = null;
        field468 = null;
        field465 = null;
        field459 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I")
    public final int method120(byte arg0) throws IOException {
        field437++;
        if (this.field440) {
            return 0;
        } else if (arg0 <= 39) {
            return 121;
        } else {
            return this.field436.read();
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public final void method121(byte arg0) {
        field447++;
        if (this.field440) {
            return;
        }
        synchronized (this) {
            this.field440 = true;
            this.notifyAll();
        }
        if (this.field453 != null) {
            while (this.field453.field2281 == 0) {
                class72.method548(-71, 1L);
            }
            if (this.field453.field2281 == 1) {
                try {
                    ((Thread) this.field453.field2282).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        int var3 = 39 % ((6 - arg0) / 63);
        this.field453 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[BBI)V")
    public final void method122(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != 4) {
            return;
        }
        field452++;
        if (this.field440) {
            return;
        }
        if (this.field443) {
            this.field443 = false;
            throw new IOException();
        }
        if (this.field441 == null) {
            this.field441 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field441[this.field445] = arg1[arg0 + var6];
                this.field445 = (this.field445 + 1) % 5000;
                if ((this.field444 + 4900) % 5000 == this.field445) {
                    throw new IOException();
                }
            }
            if (this.field453 == null) {
                this.field453 = this.field438.method1031(3, this, 52);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cb", name = "run", descriptor = "()V")
    public final void run() {
        field435++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field445 == this.field444) {
                        if (this.field440) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field445 < this.field444) {
                        var2 = 5000 - this.field444;
                    } else {
                        var2 = this.field445 - this.field444;
                    }
                    var3 = this.field444;
                }
                if (var2 > 0) {
                    try {
                        this.field433.write(this.field441, var3, var2);
                    } catch (IOException var9) {
                        this.field443 = true;
                    }
                    this.field444 = (this.field444 + var2) % 5000;
                    try {
                        if (this.field445 == this.field444) {
                            this.field433.flush();
                        }
                    } catch (IOException var8) {
                        this.field443 = true;
                    }
                }
            }
            try {
                if (this.field436 != null) {
                    this.field436.close();
                }
                if (this.field433 != null) {
                    this.field433.close();
                }
                if (this.field450 != null) {
                    this.field450.close();
                }
            } catch (IOException var7) {
            }
            this.field441 = null;
        } catch (Exception var12) {
            class61.method467(null, (byte) -80, var12);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[BII)V")
    public final void method123(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field448++;
        if (arg0 != 0) {
            this.method121((byte) -20);
        }
        if (this.field440) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field436.read(arg1, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field455++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class2.field49[var12][var36] = 0;
                class73.field1837[var12][var36] = 99999999;
            }
        }
        int var13 = arg11;
        int var14 = arg0;
        class2.field49[arg11][arg0] = 99;
        byte var15 = 0;
        boolean var16 = false;
        int var17 = 0;
        class73.field1837[arg11][arg0] = 0;
        class88.field2057[var15] = arg11;
        int var37 = var15 + 1;
        class150.field3680[var15] = arg0;
        int var18 = class88.field2057.length;
        int[][] var19 = class18.field477[field466].field2056;
        while (var37 != var17) {
            var13 = class88.field2057[var17];
            var14 = class150.field3680[var17];
            var17 = (var17 + 1) % var18;
            if (arg9 == var13 && arg8 == var14) {
                var16 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class18.field477[field466].method634(arg1 - 1, arg9, 1, arg4, arg8, var14, var13)) {
                    var16 = true;
                    break;
                }
                if (arg1 < 10 && class18.field477[field466].method627(arg1 - 1, var13, arg9, arg8, var14, arg4, 4344)) {
                    var16 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg6 != 0 && class18.field477[field466].method629(arg7, arg9, var13, arg8, arg3, -1, arg6, var14)) {
                var16 = true;
                break;
            }
            int var35 = class73.field1837[var13][var14] + 1;
            if (var13 > 0 && class2.field49[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0) {
                class88.field2057[var37] = var13 - 1;
                class150.field3680[var37] = var14;
                class2.field49[var13 - 1][var14] = 2;
                class73.field1837[var13 - 1][var14] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && class2.field49[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0) {
                class88.field2057[var37] = var13 + 1;
                class150.field3680[var37] = var14;
                var37 = (var37 + 1) % var18;
                class2.field49[var13 + 1][var14] = 8;
                class73.field1837[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class2.field49[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class88.field2057[var37] = var13;
                class150.field3680[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class2.field49[var13][var14 - 1] = 1;
                class73.field1837[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class2.field49[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class88.field2057[var37] = var13;
                class150.field3680[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class2.field49[var13][var14 + 1] = 4;
                class73.field1837[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class2.field49[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x128010E) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class88.field2057[var37] = var13 - 1;
                class150.field3680[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class2.field49[var13 - 1][var14 - 1] = 3;
                class73.field1837[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class2.field49[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x1280183) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 - 1] & 0x1280102) == 0) {
                class88.field2057[var37] = var13 + 1;
                class150.field3680[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class2.field49[var13 + 1][var14 - 1] = 9;
                class73.field1837[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class2.field49[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x1280138) == 0 && (var19[var13 - 1][var14] & 0x1280108) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class88.field2057[var37] = var13 - 1;
                class150.field3680[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class2.field49[var13 - 1][var14 + 1] = 6;
                class73.field1837[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class2.field49[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12801E0) == 0 && (var19[var13 + 1][var14] & 0x1280180) == 0 && (var19[var13][var14 + 1] & 0x1280120) == 0) {
                class88.field2057[var37] = var13 + 1;
                class150.field3680[var37] = var14 + 1;
                class2.field49[var13 + 1][var14 + 1] = 12;
                var37 = (var37 + 1) % var18;
                class73.field1837[var13 + 1][var14 + 1] = var35;
            }
        }
        class68.field1719 = 0;
        if (!var16) {
            if (!arg10) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg9 - var22; var23 <= arg9 + var22; var23++) {
                for (int var24 = arg8 - var22; var24 <= arg8 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class73.field1837[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg9 > var23) {
                            var25 = arg9 - var23;
                        } else if (arg7 + arg9 - 1 < var23) {
                            var25 = var23 + 1 - arg7 - arg9;
                        }
                        if (var24 < arg8) {
                            var26 = arg8 - var24;
                        } else if (arg8 + arg6 - 1 < var24) {
                            var26 = var24 + 1 - arg6 - arg8;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class73.field1837[var23][var24] < var21) {
                            var14 = var24;
                            var13 = var23;
                            var20 = var27;
                            var21 = class73.field1837[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg11 == var13 && arg0 == var14) {
                return false;
            }
            class68.field1719 = 1;
        }
        byte var28 = 0;
        if (arg5 < 119) {
            field463 = null;
        }
        class88.field2057[var28] = var13;
        int var38 = var28 + 1;
        class150.field3680[var28] = var14;
        int var29;
        int var30 = var29 = class2.field49[var13][var14];
        while (arg11 != var13 || arg0 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class88.field2057[var38] = var13;
                class150.field3680[var38++] = var14;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class2.field49[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38--;
            int var32 = class150.field3680[var38];
            int var33 = class88.field2057[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            if (arg2 == 0) {
                class137.field3219++;
                class143.field3451.method965(true, 38);
                class143.field3451.method1126(31159, var31 + var31 + 3);
            }
            if (arg2 == 1) {
                class70.field1752++;
                class143.field3451.method965(true, 183);
                class143.field3451.method1126(31159, var31 + var31 + 14 + 3);
            }
            if (arg2 == 2) {
                class143.field3451.method965(true, 138);
                class143.field3451.method1126(31159, var31 + var31 + 3);
                class144.field3480++;
            }
            class143.field3451.method1133(var32 + class77.field1905, -112);
            class143.field3451.method1131(class66.field1686 + var33, 2014062376);
            class143.field3451.method1126(31159, class11.field259[82] ? 1 : 0);
            class142.field3442 = class88.field2057[0];
            class2.field47 = class150.field3680[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class143.field3451.method1132(class88.field2057[var38] - var33, true);
                class143.field3451.method1110(class150.field3680[var38] - var32, -109);
            }
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field446++;
        this.method121((byte) 111);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
    public final int method125(int arg0) throws IOException {
        field432++;
        if (arg0 != -16059) {
            method124(36, -37, 93, -45, 48, 28, 38, -76, 113, 41, true, -105);
        }
        return this.field440 ? 0 : this.field436.available();
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/net/Socket;Lue;)V")
    public class17(Socket arg0, class139 arg1) throws IOException {
        this.field450 = arg0;
        this.field438 = arg1;
        this.field450.setSoTimeout(30000);
        this.field450.setTcpNoDelay(true);
        this.field436 = this.field450.getInputStream();
        this.field433 = this.field450.getOutputStream();
    }
}
