import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class201 extends class276 {

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    private int field3300 = 0;

    @OriginalMember(owner = "client!bj", name = "eb", descriptor = "I")
    private int field3310 = 0;

    @OriginalMember(owner = "client!bj", name = "fb", descriptor = "I")
    private int field3311 = 0;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "Lrc;")
    public static class9 field3302 = new class9(100);

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field3308 = "yellow:";

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "I")
    public static int field3309 = 0;

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "[I")
    public static int[] field3307 = new int[2];

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "[Z")
    public static boolean[] field3306 = new boolean[5];

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    private int field3295;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    private int field3296;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    private int field3297;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    private int field3298;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "I")
    private int field3305;

    @OriginalMember(owner = "client!bj", name = "gb", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "Ldl;")
    public static class46 field3304;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IIII)V")
    private final void method1336(int arg0, int arg1, int arg2, int arg3) {
        ++field3299;
        if (arg2 != 4096) {
            field3307 = null;
        }
        int var5 = ~arg0 > ~arg1 ? arg1 : arg0;
        int var6 = ~arg3 >= ~var5 ? var5 : arg3;
        int var7 = ~arg0 < ~arg1 ? arg1 : arg0;
        int var8 = var7 <= arg3 ? var7 : arg3;
        this.field3295 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (this.field3295 > 0 && ~this.field3295 > -4097) {
            this.field3298 = (var9 << 12) / (this.field3295 <= 2048 ? this.field3295 * 2 : -(this.field3295 * 2) + 8192);
        } else {
            this.field3298 = 0;
        }
        if (var9 <= 0) {
            this.field3296 = 0;
        } else {
            int var10 = (var6 - arg1 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (var6 - arg3 << 12) / var9;
            if (~arg1 != ~var6) {
                if (arg0 == var6) {
                    this.field3296 = ~arg3 == ~var8 ? var10 + 4096 : -var12 + 12288;
                } else {
                    this.field3296 = ~arg1 != ~var8 ? 20480 - var10 : 12288 - -var11;
                }
            } else {
                this.field3296 = ~arg0 != ~var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field3296 /= 6;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class201() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field3310 = -5;
        }
        ++field3293;
        int[][] var3 = super.field4418.method835((byte) 106, arg0);
        if (super.field4418.field2164) {
            int[][] var4 = this.method1810((byte) -107, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            for (int var11 = 0; class53.field929 > var11; ++var11) {
                this.method1336(var10[var11], var5[var11], arg1 ^ -4097, var8[var11]);
                this.field3295 += this.field3311;
                if (~this.field3295 > -1) {
                    this.field3295 = 0;
                }
                if (this.field3295 > 4096) {
                    this.field3295 = 4096;
                }
                this.field3296 += this.field3300;
                this.field3298 += this.field3310;
                if (~this.field3298 > -1) {
                    this.field3298 = 0;
                }
                if (~this.field3298 < -4097) {
                    this.field3298 = 4096;
                }
                while (this.field3296 < 0) {
                    this.field3296 += 4096;
                }
                while (~this.field3296 < -4097) {
                    this.field3296 -= 4096;
                }
                this.method1337(this.field3295, 1, this.field3296, this.field3298);
                var6[var11] = this.field3297;
                var7[var11] = this.field3294;
                var9[var11] = this.field3305;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(IIII)V")
    private final void method1337(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            ++field3303;
            int var5 = ~arg0 < -2049 ? -(arg0 * arg3 >> 12) + arg3 + arg0 : (arg3 + 4096) * arg0 >> 12;
            if (var5 > 0) {
                int var6 = arg2 * 6;
                int var7 = var6 >> 12;
                int var8 = arg0 + arg0 - var5;
                int var9 = (var5 - var8 << 12) / var5;
                int var10 = -(var7 << 12) + var6;
                int var12 = var9 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var8 + var13;
                int var15 = -var13 + var5;
                if (var7 == 0) {
                    this.field3294 = var14;
                    this.field3297 = var5;
                    this.field3305 = var8;
                    return;
                }
                if (~var7 == -2) {
                    this.field3294 = var5;
                    this.field3297 = var15;
                    this.field3305 = var8;
                    return;
                }
                if (var7 == 2) {
                    this.field3297 = var8;
                    this.field3294 = var5;
                    this.field3305 = var14;
                    return;
                }
                if (~var7 == -4) {
                    this.field3305 = var5;
                    this.field3297 = var8;
                    this.field3294 = var15;
                    return;
                }
                if (~var7 == -5) {
                    this.field3294 = var8;
                    this.field3297 = var14;
                    this.field3305 = var5;
                    return;
                }
                if (var7 == 5) {
                    this.field3294 = var8;
                    this.field3305 = var15;
                    this.field3297 = var5;
                    return;
                }
            } else {
                this.field3297 = this.field3294 = this.field3305 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V")
    public static void method1338(int arg0) {
        field3302 = null;
        field3307 = null;
        if (arg0 != -3) {
            field3312 = -39;
        }
        field3304 = null;
        field3306 = null;
        field3308 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3311 = (arg1.method646(103) << 12) / 100;
                }
            } else {
                this.field3310 = (arg1.method646(122) << 12) / 100;
            }
        } else {
            this.field3300 = arg1.method686(-3);
        }
        ++field3301;
        if (arg2 != -1) {
            field3308 = null;
        }
    }
}
