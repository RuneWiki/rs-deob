import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class176 extends class64 {

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
    private int field3443 = 0;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    private int field3435 = 0;

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
    private int field3445 = 0;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "Lsg;")
    public static class169 field3432 = class165.method1060("Bitte starten Sie eine Mitgliedschaft", 1536);

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "Lsg;")
    private static class169 field3438 = class165.method1060("You need a members account to login to this world)3", 1536);

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "Lsg;")
    public static class169 field3433 = class165.method1060(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 1536);

    @OriginalMember(owner = "client!te", name = "tb", descriptor = "Lsg;")
    public static class169 field3450 = class165.method1060("(U0a )2 via: ", 1536);

    @OriginalMember(owner = "client!te", name = "sb", descriptor = "[Z")
    public static boolean[] field3449 = new boolean[100];

    @OriginalMember(owner = "client!te", name = "wb", descriptor = "Lsg;")
    public static class169 field3453 = field3438;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    private int field3437;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    private int field3439;

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
    private int field3440;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    private int field3441;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
    private int field3446;

    @OriginalMember(owner = "client!te", name = "qb", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!te", name = "rb", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!te", name = "ub", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!te", name = "vb", descriptor = "I")
    private int field3452;

    @OriginalMember(owner = "client!te", name = "xb", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "Lke;")
    public static class95 field3436;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "[I")
    public static int[] field3434;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILke;Lke;Lke;Lke;)V")
    public static final void method1178(int arg0, class95 arg1, class95 arg2, class95 arg3, class95 arg4) {
        class88.field1610 = arg4;
        class93.field1747 = arg1;
        class21.field447 = arg2;
        class96.field1825 = arg3;
        ++field3448;
        int var5 = 94 / ((36 - arg0) / 61);
        class142.field2647 = new class150[class21.field447.method554(-26436)][];
        class48.field871 = new boolean[class21.field447.method554(-26436)];
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIZ)V")
    private final void method1179(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            field3438 = null;
        }
        int var5 = ~arg0 >= -2049 ? (arg2 + 4096) * arg0 >> 12 : arg0 + arg2 + -(arg0 * arg2 >> 12);
        ++field3451;
        if (var5 <= 0) {
            this.field3452 = this.field3441 = this.field3437 = arg0;
        } else {
            int var6 = -var5 + arg0 + arg0;
            int var7 = arg1 * 6;
            int var8 = var7 >> 12;
            int var9 = (-var6 + var5 << 12) / var5;
            int var10 = var7 - (var8 << 12);
            int var12 = var9 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var6 + var13;
            int var15 = var5 - var13;
            if (~var8 != -1) {
                if (var8 != 1) {
                    if (var8 != 2) {
                        if (~var8 != -4) {
                            if (~var8 != -5) {
                                if (var8 == 5) {
                                    this.field3437 = var15;
                                    this.field3452 = var5;
                                    this.field3441 = var6;
                                }
                            } else {
                                this.field3437 = var5;
                                this.field3441 = var6;
                                this.field3452 = var14;
                            }
                        } else {
                            this.field3452 = var6;
                            this.field3437 = var5;
                            this.field3441 = var15;
                        }
                    } else {
                        this.field3452 = var6;
                        this.field3441 = var5;
                        this.field3437 = var14;
                    }
                } else {
                    this.field3441 = var5;
                    this.field3437 = var6;
                    this.field3452 = var15;
                }
            } else {
                this.field3437 = var6;
                this.field3441 = var14;
                this.field3452 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
    private final void method1180(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 113) {
            ++field3442;
            int var5 = ~arg0 <= ~arg3 ? arg3 : arg0;
            int var6 = ~arg3 <= ~arg0 ? arg3 : arg0;
            int var7 = arg1 < var5 ? arg1 : var5;
            int var8 = ~var6 > ~arg1 ? arg1 : var6;
            int var9 = -var7 + var8;
            this.field3446 = (var7 + var8) / 2;
            if (var9 > 0) {
                if (~this.field3446 < -1 && ~this.field3446 > -4097) {
                    this.field3440 = (var9 << 12) / (this.field3446 <= 2048 ? this.field3446 * 2 : -(this.field3446 * 2) + 8192);
                }
                int var10 = (var8 - arg3 << 12) / var9;
                int var11 = (-arg1 + var8 << 12) / var9;
                int var12 = (-arg0 + var8 << 12) / var9;
                if (~arg0 != ~var8) {
                    if (arg3 != var8) {
                        this.field3439 = arg0 != var7 ? -var12 + 20480 : var10 + 12288;
                    } else {
                        this.field3439 = ~arg1 == ~var7 ? var12 + 4096 : 12288 - var11;
                    }
                } else {
                    this.field3439 = ~arg3 == ~var7 ? 20480 - -var11 : -var10 + 4096;
                }
                this.field3439 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field3444;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3445 = (arg1.method824((byte) 94) << 12) / 100;
                }
            } else {
                this.field3435 = (arg1.method824((byte) 71) << 12) / 100;
            }
        } else {
            this.field3443 = arg1.method818(1629612104);
        }
        int var5 = -87 % ((arg0 - -60) / 36);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class176() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (super.field1195.field532) {
            int[][] var4 = this.method402(false, arg1, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class147.field2715; ++var11) {
                this.method1180(var8[var11], var5[var11], arg0 ^ -83, var6[var11]);
                this.field3440 += this.field3435;
                this.field3446 += this.field3445;
                for (this.field3439 += this.field3443; this.field3439 < 0; this.field3439 += 4096) {
                }
                if (~this.field3446 > -1) {
                    this.field3446 = 0;
                }
                if (this.field3446 > 4096) {
                    this.field3446 = 4096;
                }
                while (~this.field3439 < -4097) {
                    this.field3439 -= 4096;
                }
                if (~this.field3440 > -1) {
                    this.field3440 = 0;
                }
                if (this.field3440 > 4096) {
                    this.field3440 = 4096;
                }
                this.method1179(this.field3446, this.field3439, this.field3440, false);
                var7[var11] = this.field3452;
                var9[var11] = this.field3441;
                var10[var11] = this.field3437;
            }
        }
        if (arg0 != -40) {
            return null;
        } else {
            ++field3447;
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
    public static void method1181(int arg0) {
        field3436 = null;
        field3450 = null;
        int var1 = 71 % ((-76 - arg0) / 41);
        field3438 = null;
        field3433 = null;
        field3432 = null;
        field3434 = null;
        field3449 = null;
        field3453 = null;
    }
}
