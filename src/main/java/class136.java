import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class136 extends class142 {

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    private int field2546 = 4;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    private int field2549 = 1638;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    private int field2551 = 0;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "[I")
    private int[] field2563 = new int[512];

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "Z")
    private boolean field2557 = true;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    private int field2545 = 4;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "I")
    private int field2564 = 4;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Lai;")
    public static class10 field2547 = class44.method278("blinken2:", -10);

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "[I")
    public static int[] field2555 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!p", name = "mb", descriptor = "Lai;")
    public static class10 field2567 = class44.method278("Wordpack geladen)3", 109);

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "[I")
    private int[] field2552;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "[I")
    private int[] field2562;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    private final void method924(byte arg0) {
        ++field2558;
        if (arg0 < -92) {
            if (~this.field2549 < -1) {
                this.field2552 = new int[this.field2545];
                this.field2562 = new int[this.field2545];
                for (int var2 = 0; this.field2545 > var2; ++var2) {
                    this.field2562[var2] = (int) (4096.0D * Math.pow((double) (this.field2549 / 4096), (double) var2));
                    this.field2552[var2] = (int) (4096.0D * Math.pow(2.0D, (double) var2));
                }
            } else if (this.field2562 != null && ~this.field2562.length == ~this.field2545) {
                this.field2552 = new int[this.field2545];
                for (int var3 = 0; this.field2545 > var3; ++var3) {
                    this.field2552[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field2546 = arg0.method767(true);
                                }
                            } else {
                                this.field2564 = arg0.method767(true);
                            }
                        } else {
                            this.field2551 = arg0.method767(true);
                        }
                    } else {
                        this.field2564 = this.field2546 = arg0.method767(true);
                    }
                } else {
                    this.field2549 = arg0.method765(106);
                    if (~this.field2549 > -1) {
                        this.field2562 = new int[this.field2545];
                        for (int var5 = 0; this.field2545 > var5; ++var5) {
                            this.field2562[var5] = arg0.method765(58);
                        }
                    }
                }
            } else {
                this.field2545 = arg0.method767(true);
            }
        } else {
            this.field2557 = ~arg0.method767(true) == -2;
        }
        if (arg2 > -34) {
            this.method927((byte) 92);
        }
        ++field2556;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field2550;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int var4 = this.field2564 << 12;
            int var5 = this.field2546 << 12;
            int var6 = class13.field212[arg1] * this.field2546;
            for (int var7 = 0; class133.field2499 > var7; ++var7) {
                int var8 = 0;
                int var9 = class79.field1395[var7] * this.field2564;
                for (int var10 = 0; var10 < this.field2545; ++var10) {
                    int var11 = this.field2562[var10];
                    int var12 = this.field2552[var10];
                    int var13 = this.method926(true, var4 * var12 >> 12, var5 * var12 >> 12, var6 * var12 >> 12, var9 * var12 >> 12);
                    var8 += var11 * var13 >> 12;
                }
                if (this.field2557) {
                    var8 = (var8 >> 1) + 2048;
                }
                var3[var7] = var8;
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    public static final void method925(byte arg0) {
        if (arg0 == 18) {
            ++field2560;
            class99.field1823.method226((byte) -90);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZIIII)I")
    private final int method926(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2566;
        int var6 = arg4 & -4096;
        int var7 = arg4 - var6;
        int var8 = var6 >> 12;
        int var9 = arg3 & -4096;
        int var10 = arg3 - var9;
        int var11 = arg2 & -4096;
        int var12 = var9 >> 12;
        int var13 = arg1 & -4096;
        int var14 = var8 + 1;
        if (var14 >= var13 >> 12) {
            var14 = 0;
        }
        int var15 = var14 & 255;
        int var16 = var8 & 255;
        int var17 = var12 - -1;
        int var18 = var12 & 255;
        if (var17 >= var11 >> 12) {
            var17 = 0;
        }
        int var19 = var17 & 255;
        int var20 = this.field2563[var15 - -this.field2563[var19]] % 4;
        int var21 = this.field2563[this.field2563[var18] + var15] % 4;
        if (!arg0) {
            this.method927((byte) -60);
        }
        int var22 = this.field2563[this.field2563[var19] + var16] % 4;
        int var23 = this.field2563[this.field2563[var18] + var16] % 4;
        int var24 = class200.method1296(var10, class107.field1992[var23], (byte) 27, var7);
        int var25 = class200.method1296(var10, class107.field1992[var21], (byte) 35, var7 + -4096);
        int var26 = class200.method1296(var10 + -4096, class107.field1992[var22], (byte) 33, var7);
        int var27 = class200.method1296(var10 + -4096, class107.field1992[var20], (byte) 65, var7 + -4096);
        int var28 = class180.method1164(var7, (byte) 75);
        int var29 = class180.method1164(var10, (byte) 112);
        int var30 = class159.method1062(var24, var28, -101, var25);
        int var31 = class159.method1062(var26, var28, 55, var27);
        return class159.method1062(var30, var29, -80, var31);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(B)V")
    private final void method927(byte arg0) {
        ++field2559;
        Random var2 = new Random((long) this.field2551);
        for (int var3 = 0; var3 < 255; ++var3) {
            this.field2563[var3] = -1;
        }
        int var4 = 0;
        if (arg0 > -112) {
            method928(105, 77, -113, 30, 82, true, 114, 62, -105, 30);
        }
        while (var4 < 255) {
            int var5;
            do {
                var5 = class89.method548(255, var2, (byte) -73);
            } while (this.field2563[var5] != -1);
            this.field2563[var5 + 255] = this.field2563[var5] = var4;
            ++var4;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIZIIII)V")
    public static final void method928(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2548;
        class171 var10 = null;
        for (class171 var11 = (class171) class123.field2360.method1223(!arg5); var11 != null; var11 = (class171) class123.field2360.method1226((byte) -57)) {
            if (~var11.field3307 == ~arg1 && ~var11.field3302 == ~arg4 && var11.field3314 == arg8 && var11.field3303 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class171();
            var10.field3302 = arg4;
            var10.field3307 = arg1;
            var10.field3314 = arg8;
            var10.field3303 = arg9;
            class15.method93(var10, -94);
            class123.field2360.method1230(var10, true);
        }
        var10.field3308 = arg3;
        var10.field3306 = arg6;
        if (arg5) {
            field2547 = null;
        }
        var10.field3309 = arg7;
        var10.field3315 = arg0;
        var10.field3310 = arg2;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class136() {
        super(0, true);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        this.method927((byte) -124);
        this.method924((byte) -105);
        ++field2561;
        if (arg0 != -1) {
            this.method78((class114) null, -123, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public static void method929(int arg0) {
        field2547 = null;
        field2567 = null;
        field2555 = null;
        if (arg0 != 0) {
            field2553 = 90;
        }
    }
}
