import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class215 extends class34 {

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    private int field3298 = 0;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    private int field3306 = 0;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    private int field3295 = 0;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field3304 = 0;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "F")
    public static float field3310 = 0.0F;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    private int field3300;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    private int field3307;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    private int field3308;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
    private int field3311;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    private int field3313;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "Lpk;")
    public static class237 field3301;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
    public static final void method1446(boolean arg0) {
        ++field3296;
        class15.field288.method940(65);
        if (arg0) {
            field3310 = 0.089302406F;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIB)V")
    private final void method1447(int arg0, int arg1, int arg2, byte arg3) {
        ++field3297;
        if (arg3 != 42) {
            this.method50(-114, 17, (class54) null);
        }
        int var5 = arg2 <= 2048 ? (arg0 + 4096) * arg2 >> 12 : -(arg0 * arg2 >> 12) + arg2 + arg0;
        if (~var5 < -1) {
            int var6 = arg1 * 6;
            int var7 = -var5 + arg2 + arg2;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field3313 = var5;
                this.field3311 = var7;
                this.field3300 = var14;
                return;
            }
            if (var9 == 1) {
                this.field3313 = var15;
                this.field3300 = var5;
                this.field3311 = var7;
                return;
            }
            if (var9 == 2) {
                this.field3311 = var14;
                this.field3313 = var7;
                this.field3300 = var5;
                return;
            }
            if (~var9 == -4) {
                this.field3311 = var5;
                this.field3313 = var7;
                this.field3300 = var15;
                return;
            }
            if (~var9 == -5) {
                this.field3300 = var7;
                this.field3311 = var5;
                this.field3313 = var14;
                return;
            }
            if (var9 == 5) {
                this.field3311 = var15;
                this.field3300 = var7;
                this.field3313 = var5;
                return;
            }
        } else {
            this.field3313 = this.field3300 = this.field3311 = arg2;
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static final void method1448(int arg0) {
        ++field3302;
        class157.field2302.method940(27);
        if (arg0 != 1608943980) {
            field3305 = -35;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class215() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field3303;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field3298 = (arg2.method459(false) << 12) / 100;
                }
            } else {
                this.field3306 = (arg2.method459(false) << 12) / 100;
            }
        } else {
            this.field3295 = arg2.method457((byte) 42);
        }
        if (arg0 != 6) {
            method1448(-28);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIII)V")
    private final void method1449(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = ~arg3 < ~arg2 ? arg3 : arg2;
        int var6 = arg1 > var5 ? arg1 : var5;
        if (arg0 <= 120) {
            field3304 = -15;
        }
        int var7 = ~arg3 > ~arg2 ? arg3 : arg2;
        int var8 = arg1 < var7 ? arg1 : var7;
        this.field3308 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        ++field3299;
        if (~var9 >= -1) {
            this.field3307 = 0;
        } else {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (var6 - arg1 << 12) / var9;
            if (~arg3 != ~var6) {
                if (arg2 == var6) {
                    this.field3307 = ~arg1 != ~var8 ? -var12 + 12288 : 4096 - -var10;
                } else {
                    this.field3307 = arg3 == var8 ? var11 + 12288 : 20480 - var10;
                }
            } else {
                this.field3307 = arg2 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field3307 /= 6;
        }
        if (~this.field3308 < -1 && ~this.field3308 > -4097) {
            this.field3312 = (var9 << 12) / (this.field3308 <= 2048 ? this.field3308 * 2 : 8192 - this.field3308 * 2);
        } else {
            this.field3312 = 0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int var3 = 78 / ((-54 - arg0) / 44);
        ++field3309;
        int[][] var4 = super.field618.method91(-107, arg1);
        if (super.field618.field211) {
            int[][] var5 = this.method231(arg1, (byte) 100, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; class226.field3527 > var12; ++var12) {
                this.method1449((byte) 125, var8[var12], var6[var12], var7[var12]);
                this.field3312 += this.field3306;
                this.field3308 += this.field3298;
                if (this.field3308 < 0) {
                    this.field3308 = 0;
                }
                this.field3307 += this.field3295;
                if (this.field3312 < 0) {
                    this.field3312 = 0;
                }
                if (this.field3308 > 4096) {
                    this.field3308 = 4096;
                }
                while (this.field3307 < 0) {
                    this.field3307 += 4096;
                }
                while (~this.field3307 < -4097) {
                    this.field3307 -= 4096;
                }
                if (this.field3312 > 4096) {
                    this.field3312 = 4096;
                }
                this.method1447(this.field3312, this.field3307, this.field3308, (byte) 42);
                var9[var12] = this.field3313;
                var11[var12] = this.field3300;
                var10[var12] = this.field3311;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
    public static void method1450(int arg0) {
        if (arg0 != 4096) {
            method1450(-28);
        }
        field3301 = null;
    }
}
