import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class260 implements Runnable {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    private int field3640 = 0;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    private int field3642 = 0;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3645;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "[B")
    private byte[] field3649;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field3648;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Lfja;")
    public static class783 field3644 = new class783(20, 3);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljava/io/IOException;")
    private IOException field3650;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "[[S")
    public static short[][] field3651;

    @OriginalMember(owner = "client!nj", name = "run", descriptor = "()V")
    public final void run() {
        field3643++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field3650 != null) {
                        return;
                    }
                    if (this.field3640 >= this.field3642) {
                        var2 = this.field3640 - this.field3642;
                    } else {
                        var2 = this.field3647 + this.field3640 - this.field3642;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if (this.field3642 + var2 > this.field3647) {
                    int var3 = this.field3647 - this.field3642;
                    this.field3645.write(this.field3649, this.field3642, var3);
                    this.field3645.write(this.field3649, 0, var2 - var3);
                } else {
                    this.field3645.write(this.field3649, this.field3642, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field3650 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field3642 = (this.field3642 + var2) % this.field3647;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIILjo;ZI[II[IIII)I")
    public static final int method1689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class355 arg6, boolean arg7, int arg8, int[] arg9, int arg10, int[] arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class567.field8018[var15][var35] = 0;
                class388.field5339[var15][var35] = 99999999;
            }
        }
        field3652++;
        boolean var16;
        if (arg2 == 1) {
            var16 = class130.method1100(arg13, arg10, arg0, arg4, arg6, true, arg14, arg5, arg3, arg12, arg8);
        } else if (arg2 == 2) {
            var16 = class543.method3064(arg6, arg5, arg12, arg3, arg14, arg13, arg0, arg4, arg10, arg1 - 56, arg8);
        } else {
            var16 = class413.method2443(arg3, arg0, arg2, arg10, arg13, (byte) 106, arg14, arg4, arg6, arg8, arg5, arg12);
        }
        int var17 = arg13 - 64;
        int var18 = arg1 + arg5;
        int var19 = class640.field8803;
        int var20 = class471.field6398;
        if (!var16) {
            if (!arg7) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg8 - var23; var24 <= arg8 + var23; var24++) {
                for (int var25 = arg4 - var23; var25 <= (arg4 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class388.field5339[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg8 > var24) {
                            var28 = arg8 - var24;
                        } else if (var24 > (arg14 + arg8 - 1)) {
                            var28 = var24 + 1 - arg8 - arg14;
                        }
                        int var29 = 0;
                        if (var25 < arg4) {
                            var29 = arg4 - var25;
                        } else if (arg12 + arg4 - 1 < var25) {
                            var29 = 1 - arg12 - (arg4 - var25);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class388.field5339[var26][var27] < var22) {
                            var19 = var24;
                            var21 = var30;
                            var20 = var25;
                            var22 = class388.field5339[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg13 == var19 && arg5 == var20) {
            return 0;
        }
        byte var31 = 0;
        class428.field5844[var31] = var19;
        int var37 = var31 + 1;
        class513.field7012[var31] = var20;
        int var32;
        int var33 = var32 = class567.field8018[var19 - var17][var20 - var18];
        while (arg13 != var19 || arg5 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class428.field5844[var37] = var19;
                class513.field7012[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class567.field8018[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg11[var34] = class428.field5844[var37];
            arg9[var34++] = class513.field7012[var37];
            if (var34 >= arg11.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public final void method1690(int arg0) {
        synchronized (this) {
            if (this.field3650 == null) {
                this.field3650 = new IOException("");
            }
            this.notifyAll();
        }
        field3641++;
        try {
            if (arg0 != -1) {
                this.method1690(-106);
            }
            this.field3648.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public final void method1691(byte arg0) {
        field3639++;
        this.field3645 = new class106();
        int var2 = 24 % ((-arg0 - 49) / 56);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public static void method1692(byte arg0) {
        if (arg0 < 109) {
            method1689(-22, -51, 122, -91, -57, 110, null, false, -30, null, -34, null, -10, -40, -30);
        }
        field3644 = null;
        field3651 = null;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class260(OutputStream arg0, int arg1) {
        this.field3645 = arg0;
        this.field3647 = arg1 + 1;
        this.field3649 = new byte[this.field3647];
        this.field3648 = new Thread(this);
        this.field3648.setDaemon(true);
        this.field3648.start();
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIBI)V")
    public final void method1693(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field3646++;
        if (arg3 < 0 || arg1 < 0 || arg1 + arg3 > arg0.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field3650 != null) {
                throw new IOException(this.field3650.toString());
            } else if (arg2 == -33) {
                int var6;
                if (this.field3642 > this.field3640) {
                    var6 = this.field3642 - this.field3640 - 1;
                } else {
                    var6 = this.field3647 + this.field3642 - this.field3640 - 1;
                }
                if (var6 < arg3) {
                    throw new IOException("");
                }
                if (this.field3640 + arg3 > this.field3647) {
                    int var7 = this.field3647 - this.field3640;
                    class275.method1771(arg0, arg1, this.field3649, this.field3640, var7);
                    class275.method1771(arg0, arg1 + var7, this.field3649, 0, arg3 - var7);
                } else {
                    class275.method1771(arg0, arg1, this.field3649, this.field3640, arg3);
                }
                this.field3640 = (this.field3640 + arg3) % this.field3647;
                this.notifyAll();
            }
        }
    }
}
