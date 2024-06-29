import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class190 extends class123 {

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
    private int field3343 = 0;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "I")
    private int field3345 = 0;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
    private int field3349 = 0;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "[I")
    public static int[] field3336 = new int[256];

    @OriginalMember(owner = "client!mc", name = "qb", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!mc", name = "tb", descriptor = "Leb;")
    public static class230 field3357;

    @OriginalMember(owner = "client!mc", name = "wb", descriptor = "Leb;")
    public static class230 field3360;

    @OriginalMember(owner = "client!mc", name = "rb", descriptor = "Leb;")
    private static class230 field3355;

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "Leb;")
    public static class230 field3353;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!mc", name = "xb", descriptor = "[Ldg;")
    public static class137[] field3361;

    @OriginalMember(owner = "client!mc", name = "ub", descriptor = "Leb;")
    public static class230 field3358;

    @OriginalMember(owner = "client!mc", name = "vb", descriptor = "Leb;")
    public static class230 field3359;

    @OriginalMember(owner = "client!mc", name = "sb", descriptor = "[I")
    public static int[] field3356;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    private int field3337;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    private int field3338;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    private int field3340;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "I")
    private int field3346;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "I")
    private int field3347;

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "Lka;")
    public static class245 field3350;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI[II)Leb;")
    public static final class230 method1354(long arg0, int arg1, int[] arg2, int arg3) {
        ++field3342;
        if (arg3 != -2) {
            method1357((byte) 58);
        }
        if (class52.field900 != null) {
            class230 var5 = class52.field900.method806(arg3 + -64, arg2, arg0, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return arg1 == 5 ? class113.method906(arg0, (byte) -111).method1623(-30947) : class61.method516(arg0, (byte) 48);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V")
    private final void method1355(int arg0, int arg1, int arg2, int arg3) {
        ++field3339;
        int var5 = ~arg0 >= ~arg1 ? arg1 : arg0;
        int var6 = arg3 <= var5 ? var5 : arg3;
        if (arg2 != -23049) {
            this.field3340 = -92;
        }
        int var7 = arg1 > arg0 ? arg0 : arg1;
        int var8 = ~var7 < ~arg3 ? arg3 : var7;
        this.field3346 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (~var9 < -1) {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (var6 - arg3 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (~arg0 != ~var6) {
                if (arg1 == var6) {
                    this.field3338 = ~arg3 != ~var8 ? -var11 + 12288 : var10 + 4096;
                } else {
                    this.field3338 = arg0 != var8 ? 20480 - var10 : 12288 - -var12;
                }
            } else {
                this.field3338 = arg1 != var8 ? -var12 + 4096 : var11 + 20480;
            }
            this.field3338 /= 6;
        } else {
            this.field3338 = 0;
        }
        if (~this.field3346 < -1 && this.field3346 < 4096) {
            this.field3341 = (var9 << 12) / (~this.field3346 >= -2049 ? this.field3346 * 2 : -(this.field3346 * 2) + 8192);
        } else {
            this.field3341 = 0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 == 1876195788) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field3343 = (arg1.method198(false) << 12) / 100;
                    }
                } else {
                    this.field3349 = (arg1.method198(false) << 12) / 100;
                }
            } else {
                this.field3345 = arg1.method178(arg2 + -1876195789);
            }
            ++field3348;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class190() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field3351;
        if (arg1 != 26080) {
            field3350 = null;
        }
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (super.field2152.field2616) {
            int[][] var4 = this.method960(0, arg0, (byte) -75);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class140.field2505; ++var11) {
                this.method1355(var6[var11], var7[var11], -23049, var5[var11]);
                this.field3338 += this.field3345;
                this.field3346 += this.field3343;
                while (this.field3338 < 0) {
                    this.field3338 += 4096;
                }
                this.field3341 += this.field3349;
                while (this.field3338 > 4096) {
                    this.field3338 -= 4096;
                }
                if (this.field3346 < 0) {
                    this.field3346 = 0;
                }
                if (this.field3341 < 0) {
                    this.field3341 = 0;
                }
                if (~this.field3346 < -4097) {
                    this.field3346 = 4096;
                }
                if (~this.field3341 < -4097) {
                    this.field3341 = 4096;
                }
                this.method1356(this.field3341, this.field3338, 474364876, this.field3346);
                var8[var11] = this.field3347;
                var9[var11] = this.field3340;
                var10[var11] = this.field3337;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IIII)V")
    private final void method1356(int arg0, int arg1, int arg2, int arg3) {
        int var5 = ~arg3 < -2049 ? arg0 + arg3 + -(arg0 * arg3 >> 12) : (arg0 + 4096) * arg3 >> 12;
        ++field3335;
        if (~var5 >= -1) {
            this.field3347 = this.field3340 = this.field3337 = arg3;
        } else {
            int var6 = arg1 * 6;
            int var7 = -var5 + arg3 + arg3;
            int var8 = (-var7 + var5 << 12) / var5;
            int var10 = var6 >> 12;
            int var11 = var8 * var5 >> 12;
            int var12 = -(var10 << 12) + var6;
            int var13 = var11 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var7 + var13;
            if (~var10 != -1) {
                if (var10 != 1) {
                    if (~var10 != -3) {
                        if (~var10 != -4) {
                            if (var10 != 4) {
                                if (var10 == 5) {
                                    this.field3337 = var14;
                                    this.field3347 = var5;
                                    this.field3340 = var7;
                                }
                            } else {
                                this.field3347 = var15;
                                this.field3337 = var5;
                                this.field3340 = var7;
                            }
                        } else {
                            this.field3337 = var5;
                            this.field3340 = var14;
                            this.field3347 = var7;
                        }
                    } else {
                        this.field3337 = var15;
                        this.field3340 = var5;
                        this.field3347 = var7;
                    }
                } else {
                    this.field3340 = var5;
                    this.field3337 = var7;
                    this.field3347 = var14;
                }
            } else {
                this.field3347 = var5;
                this.field3340 = var15;
                this.field3337 = var7;
            }
        }
        if (arg2 != 474364876) {
            field3354 = -72;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public static void method1357(byte arg0) {
        if (arg0 >= -22) {
            field3357 = null;
        }
        field3356 = null;
        field3359 = null;
        field3350 = null;
        field3357 = null;
        field3358 = null;
        field3336 = null;
        field3355 = null;
        field3353 = null;
        field3361 = null;
        field3360 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(1 & var1) == -2) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field3336[var0] = var1;
        }
        field3354 = 0;
        field3357 = class68.method589(0, "<img=0>");
        field3360 = class68.method589(0, ")4a=");
        field3355 = class68.method589(0, " from your ignore list first)3");
        field3353 = field3355;
        field3352 = 0;
        field3361 = new class137[50];
        field3358 = class68.method589(0, "<col=ff0000>");
        field3359 = class68.method589(0, " steht bereits auf Ihrer Freunde)2Liste(Q");
        field3356 = new int[2];
    }
}
