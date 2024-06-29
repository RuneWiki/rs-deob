import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class199 extends class107 {

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    private int field3441 = 0;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    private int field3447 = 0;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "I")
    private int field3449 = 0;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "Lak;")
    public static class135 field3448 = new class135(32);

    @OriginalMember(owner = "client!se", name = "jb", descriptor = "Lpj;")
    public static class237 field3453 = class33.method353("(U(Y", 80);

    @OriginalMember(owner = "client!se", name = "lb", descriptor = "Lpj;")
    public static class237 field3455 = null;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    private int field3435;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    private int field3438;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    private int field3440;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    private int field3446;

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!se", name = "ib", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!se", name = "kb", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "[I")
    public static int[] field3451;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V")
    public static final void method1357(int arg0) {
        ++field3439;
        int var1 = class186.method1273(true);
        if (arg0 != var1) {
            if (~var1 != -2) {
                class252.method1707((byte) (class152.field2698 - 4 & 255), arg0 ^ -5);
                class273.method1831(arg0 ^ 938, 2);
            } else {
                class252.method1707((byte) 0, -5);
                class273.method1831(arg0 ^ 938, 512);
                class126.method895(104);
            }
        } else {
            class186.field3257 = null;
            class273.method1831(arg0 ^ 938, 0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIBI)V")
    private final void method1358(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 33) {
            method1360(true);
        }
        ++field3445;
        int var5 = ~arg0 < -2049 ? arg0 + arg3 - (arg0 * arg3 >> 12) : (arg3 + 4096) * arg0 >> 12;
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = arg0 - -arg0 + -var5;
            int var8 = var6 >> 12;
            int var9 = (var5 - var7 << 12) / var5;
            int var10 = -(var8 << 12) + var6;
            int var12 = var9 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var8 == 0) {
                this.field3442 = var5;
                this.field3435 = var7;
                this.field3440 = var14;
                return;
            }
            if (var8 == 1) {
                this.field3435 = var7;
                this.field3440 = var5;
                this.field3442 = var15;
                return;
            }
            if (var8 == 2) {
                this.field3442 = var7;
                this.field3435 = var14;
                this.field3440 = var5;
                return;
            }
            if (~var8 == -4) {
                this.field3442 = var7;
                this.field3440 = var15;
                this.field3435 = var5;
                return;
            }
            if (var8 == 4) {
                this.field3440 = var7;
                this.field3435 = var5;
                this.field3442 = var14;
                return;
            }
            if (var8 == 5) {
                this.field3442 = var5;
                this.field3435 = var15;
                this.field3440 = var7;
                return;
            }
        } else {
            this.field3442 = this.field3440 = this.field3435 = arg0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field3436;
        if (arg2 != -32513) {
            method1360(true);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field3449 = (arg0.method325(52) << 12) / 100;
                }
            } else {
                this.field3441 = (arg0.method325(-115) << 12) / 100;
            }
        } else {
            this.field3447 = arg0.method309(-489706920);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V")
    private final void method1359(int arg0, int arg1, int arg2, int arg3) {
        int var5 = ~arg2 >= ~arg3 ? arg2 : arg3;
        int var6 = ~arg2 <= ~arg3 ? arg2 : arg3;
        if (arg0 >= -116) {
            method1357(-91);
        }
        ++field3437;
        int var7 = ~arg1 <= ~var5 ? var5 : arg1;
        int var8 = ~var6 <= ~arg1 ? var6 : arg1;
        int var9 = -var7 + var8;
        if (~var9 < -1) {
            int var10 = (-arg3 + var8 << 12) / var9;
            int var11 = (-arg2 + var8 << 12) / var9;
            int var12 = (var8 - arg1 << 12) / var9;
            if (arg3 == var8) {
                this.field3438 = arg2 == var7 ? var12 + 20480 : -var11 + 4096;
            } else if (~arg2 == ~var8) {
                this.field3438 = arg1 == var7 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field3438 = arg3 == var7 ? var11 + 12288 : -var10 + 20480;
            }
            this.field3438 /= 6;
        } else {
            this.field3438 = 0;
        }
        this.field3450 = (var7 + var8) / 2;
        if (this.field3450 > 0 && ~this.field3450 > -4097) {
            this.field3446 = (var9 << 12) / (this.field3450 > 2048 ? 8192 - this.field3450 * 2 : this.field3450 * 2);
        } else {
            this.field3446 = 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public static void method1360(boolean arg0) {
        field3448 = null;
        if (!arg0) {
            field3455 = null;
            field3453 = null;
            field3451 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        ++field3444;
        int[][] var3 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int[][] var4 = this.method802(3, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class106.field1862; ++var11) {
                this.method1359(-126, var8[var11], var6[var11], var5[var11]);
                this.field3450 += this.field3449;
                this.field3438 += this.field3447;
                if (~this.field3450 > -1) {
                    this.field3450 = 0;
                }
                while (this.field3438 < 0) {
                    this.field3438 += 4096;
                }
                while (~this.field3438 < -4097) {
                    this.field3438 -= 4096;
                }
                if (this.field3450 > 4096) {
                    this.field3450 = 4096;
                }
                this.field3446 += this.field3441;
                if (this.field3446 < 0) {
                    this.field3446 = 0;
                }
                if (this.field3446 > 4096) {
                    this.field3446 = 4096;
                }
                this.method1358(this.field3450, this.field3438, (byte) 33, this.field3446);
                var7[var11] = this.field3442;
                var10[var11] = this.field3440;
                var9[var11] = this.field3435;
            }
        }
        int var12 = 61 % ((arg0 - 26) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II[III)V")
    public static final void method1361(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        --arg3;
        int var6 = arg1 - 1;
        int var5 = var6 + -7;
        while (~arg3 > ~var5) {
            int var7 = arg3 + 1;
            arg2[var7] = arg0;
            int var8 = var7 + 1;
            arg2[var8] = arg0;
            int var9 = var8 + 1;
            arg2[var9] = arg0;
            int var10 = var9 + 1;
            arg2[var10] = arg0;
            int var11 = var10 + 1;
            arg2[var11] = arg0;
            int var12 = var11 + 1;
            arg2[var12] = arg0;
            int var13 = var12 + 1;
            arg2[var13] = arg0;
            arg3 = var13 + 1;
            arg2[arg3] = arg0;
        }
        ++field3443;
        while (arg3 < var6) {
            ++arg3;
            arg2[arg3] = arg0;
        }
        if (arg4 < 53) {
            field3451 = null;
        }
    }
}
