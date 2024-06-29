import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class193 extends class135 {

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    private int field3384 = 4;

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
    private int field3385 = 409;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    private int field3381 = 81;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    private int field3379 = 8;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    private int field3383 = 1024;

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "I")
    private int field3388 = 204;

    @OriginalMember(owner = "client!hj", name = "nb", descriptor = "I")
    private int field3396 = 0;

    @OriginalMember(owner = "client!hj", name = "ib", descriptor = "I")
    private int field3391 = 1024;

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "Ls;")
    public static class227 field3386 = new class227(64);

    @OriginalMember(owner = "client!hj", name = "tb", descriptor = "Z")
    public static boolean field3402 = false;

    @OriginalMember(owner = "client!hj", name = "vb", descriptor = "Lqj;")
    public static class196 field3404 = class80.method502("weiss:", -48);

    @OriginalMember(owner = "client!hj", name = "sb", descriptor = "[I")
    public static int[] field3401 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hj", name = "ub", descriptor = "Lmf;")
    public static class82 field3403 = new class82();

    @OriginalMember(owner = "client!hj", name = "wb", descriptor = "I")
    public static int field3405 = 0;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!hj", name = "hb", descriptor = "I")
    private int field3390;

    @OriginalMember(owner = "client!hj", name = "kb", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!hj", name = "lb", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!hj", name = "mb", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!hj", name = "ob", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!hj", name = "pb", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!hj", name = "qb", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!hj", name = "rb", descriptor = "I")
    private int field3400;

    @OriginalMember(owner = "client!hj", name = "gb", descriptor = "[I")
    private int[] field3389;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "[[I")
    private int[][] field3380;

    @OriginalMember(owner = "client!hj", name = "jb", descriptor = "[[I")
    private int[][] field3392;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field3393;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 == 7) {
                                        this.field3391 = arg0.method318(true);
                                    }
                                } else {
                                    this.field3381 = arg0.method318(true);
                                }
                            } else {
                                this.field3396 = arg0.method318(true);
                            }
                        } else {
                            this.field3383 = arg0.method318(true);
                        }
                    } else {
                        this.field3388 = arg0.method318(true);
                    }
                } else {
                    this.field3385 = arg0.method318(true);
                }
            } else {
                this.field3379 = arg0.method367(1);
            }
        } else {
            this.field3384 = arg0.method367(1);
        }
        if (arg2 != -16231) {
            method1276((byte) 33);
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    private final void method1273(int arg0) {
        ++field3397;
        Random var2 = new Random((long) this.field3379);
        this.field3389 = new int[this.field3379 - -1];
        this.field3398 = 4096 / this.field3384;
        this.field3389[0] = 0;
        this.field3400 = this.field3381 / 2;
        this.field3392 = new int[this.field3379][this.field3384 + 1];
        this.field3390 = 4096 / this.field3379;
        if (arg0 == 395) {
            int var3 = this.field3390 / 2;
            int var4 = this.field3398 / 2;
            this.field3380 = new int[this.field3379][this.field3384];
            for (int var5 = 0; ~this.field3379 < ~var5; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field3390;
                    int var7 = (-2048 + class217.method1484(true, var2, 4096)) * this.field3388 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field3389[var5] = this.field3389[var5 + -1] - -var8;
                }
                this.field3392[var5][0] = 0;
                for (int var9 = 0; ~this.field3384 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field3398;
                        int var11 = (-2048 + class217.method1484(true, var2, 4096)) * this.field3385 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field3392[var5][var9] = this.field3392[var5][var9 + -1] + var12;
                    }
                    this.field3380[var5][var9] = this.field3391 <= 0 ? 4096 : 4096 - class217.method1484(true, var2, this.field3391);
                }
                this.field3392[var5][this.field3384] = 4096;
            }
            this.field3389[this.field3379] = 4096;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        ++field3399;
        if (arg0 != -85) {
            this.method102((byte) -20);
        }
        this.method1273(arg0 ^ -480);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            this.field3385 = 115;
        }
        ++field3394;
        int[] var3 = super.field1954.method110(arg0, -105);
        if (super.field1954.field244) {
            int var4 = 0;
            int var5;
            for (var5 = class123.field1756[arg0] + this.field3396; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field3379 && var5 >= this.field3389[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field3389[var4];
            int var9 = this.field3389[var4 + -1];
            if (~var5 < ~(var9 - -this.field3400) && var5 < -this.field3400 + var8) {
                for (int var10 = 0; class131.field1862 > var10; ++var10) {
                    int var11 = !var7 ? -this.field3383 : this.field3383;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field3398 * var11 >> 12) + class82.field1189[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var12 > ~this.field3384 && ~var13 <= ~this.field3392[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field3392[var6][var12];
                    int var16 = this.field3392[var6][var14];
                    if (~(this.field3400 + var16) > ~var13 && ~(-this.field3400 + var15) < ~var13) {
                        var3[var10] = this.field3380[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class37.method186(var3, 0, class131.field1862, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(III)I")
    public static final int method1274(int arg0, int arg1, int arg2) {
        ++field3395;
        if (arg1 < 104) {
            method1274(-88, 69, 3);
        }
        int var3 = 1;
        while (arg2 > 1) {
            if (~(arg2 & 1) != -1) {
                var3 = arg0 * var3;
            }
            arg2 >>= 1;
            arg0 *= arg0;
        }
        if (~arg2 == -2) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILbk;)I")
    public static final int method1275(int arg0, class136 arg1) {
        int var2 = 0;
        ++field3382;
        if (arg1.method838((byte) 23, class168.field2818)) {
            ++var2;
        }
        if (arg0 != 16457) {
            method1276((byte) 65);
        }
        if (arg1.method838((byte) 23, class151.field2427)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
    public static void method1276(byte arg0) {
        field3404 = null;
        field3403 = null;
        if (arg0 != -87) {
            field3402 = false;
        }
        field3401 = null;
        field3386 = null;
    }
}
