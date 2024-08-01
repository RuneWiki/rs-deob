import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("tc")
public class class178 extends class85 {

    @OriginalMember(owner = "tc", name = "cb", descriptor = "I")
    private int field3360 = 0;

    @OriginalMember(owner = "tc", name = "R", descriptor = "I")
    public static int field3349 = 255;

    @OriginalMember(owner = "tc", name = "W", descriptor = "Llf;")
    private static class109 field3354 = class35.method275("Close", 2);

    @OriginalMember(owner = "tc", name = "ib", descriptor = "Llf;")
    private static class109 field3366 = class35.method275("We suspect someone knows your password)3", 2);

    @OriginalMember(owner = "tc", name = "db", descriptor = "Llf;")
    private static class109 field3361 = class35.method275("slide:", 2);

    @OriginalMember(owner = "tc", name = "U", descriptor = "[S")
    public static short[] field3352 = new short[] { 48, 5, 22, 38, 11, 18, 33, 57 };

    @OriginalMember(owner = "tc", name = "gb", descriptor = "Llf;")
    public static class109 field3364 = field3354;

    @OriginalMember(owner = "tc", name = "Q", descriptor = "Llf;")
    public static class109 field3348 = field3361;

    @OriginalMember(owner = "tc", name = "nb", descriptor = "Llf;")
    public static class109 field3371 = field3361;

    @OriginalMember(owner = "tc", name = "eb", descriptor = "Llf;")
    public static class109 field3362 = class35.method275("::fps ", 2);

    @OriginalMember(owner = "tc", name = "rb", descriptor = "Llf;")
    private static class109 field3375 = class35.method275(" is already on your ignore list)3", 2);

    @OriginalMember(owner = "tc", name = "bb", descriptor = "Llf;")
    public static class109 field3359 = field3375;

    @OriginalMember(owner = "tc", name = "pb", descriptor = "Llf;")
    public static class109 field3373 = class35.method275(":clan:", 2);

    @OriginalMember(owner = "tc", name = "mb", descriptor = "Llf;")
    public static class109 field3370 = field3366;

    @OriginalMember(owner = "tc", name = "ob", descriptor = "Llf;")
    public static class109 field3372 = class35.method275("blinken2:", 2);

    @OriginalMember(owner = "tc", name = "T", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "tc", name = "X", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "tc", name = "Y", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "tc", name = "Z", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "tc", name = "ab", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "tc", name = "hb", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "tc", name = "jb", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "tc", name = "kb", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "tc", name = "lb", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "tc", name = "qb", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "tc", name = "V", descriptor = "[I")
    private int[] field3353;

    @OriginalMember(owner = "tc", name = "sb", descriptor = "[I")
    private int[] field3376;

    @OriginalMember(owner = "tc", name = "S", descriptor = "[Lkf;")
    public static class100[] field3350;

    @OriginalMember(owner = "tc", name = "fb", descriptor = "[[I")
    private int[][] field3363;

    @OriginalMember(owner = "tc", name = "c", descriptor = "(III)V")
    public static final void method1209(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field13; ++var4) {
                class45 var5 = var3.field17[var4];
                if ((var5.field949 >> 29 & 3L) == 2L && var5.field947 == arg1 && var5.field932 == arg2) {
                    class158.method1079(var5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "tc", name = "d", descriptor = "(III)J")
    public static final long method1210(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field13; ++var4) {
                class45 var5 = var3.field17[var4];
                if ((var5.field949 >> 29 & 3L) == 2L && var5.field947 == arg1 && var5.field932 == arg2) {
                    return var5.field949;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "tc", name = "d", descriptor = "(B)V")
    public static void method1211(byte arg0) {
        field3352 = null;
        int var1 = -108 % ((53 - arg0) / 55);
        field3361 = null;
        field3359 = null;
        field3364 = null;
        field3350 = null;
        field3372 = null;
        field3354 = null;
        field3373 = null;
        field3370 = null;
        field3348 = null;
        field3375 = null;
        field3371 = null;
        field3366 = null;
        field3362 = null;
    }

    @OriginalMember(owner = "tc", name = "c", descriptor = "(II)Z")
    public static final boolean method1212(int arg0, int arg1) {
        ++field3365;
        if (arg0 != 1) {
            field3370 = null;
        }
        return ~(1 & arg1 >> 31) != -1;
    }

    @OriginalMember(owner = "tc", name = "e", descriptor = "(B)V")
    public static final void method1213(byte arg0) {
        ++field3368;
        class59.field1165.method1088(-51);
        class147.field2841.method1088(-51);
        if (arg0 <= 32) {
            field3372 = null;
        }
        class45.field946.method1088(-51);
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        int[] var3 = super.field1736.method835(-314, arg1);
        ++field3374;
        if (super.field1736.field2253) {
            int[] var4 = this.method540(arg1, -125, 0);
            int var5 = this.field3360;
            if (~var5 != -3) {
                if (var5 == 1) {
                    for (int var6 = 0; ~var6 > ~class57.field1152; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; this.field3363.length + -1 > var8 && ~this.field3363[var8][0] >= ~var7; ++var8) {
                        }
                        int[] var9 = this.field3363[var8 + -1];
                        int[] var10 = this.field3363[var8];
                        int var11 = (-var9[0] + var7 << 12) / (var10[0] - var9[0]);
                        int var12 = -class109.field2173[255 & var11 >> 5] + 4096 >> 1;
                        int var13 = -var12 + 4096;
                        var3[var6] = var9[1] * var13 + var10[1] * var12 >> 12;
                    }
                } else {
                    for (int var14 = 0; var14 < class57.field1152; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; ~var16 > ~(this.field3363.length + -1) && ~this.field3363[var16][0] >= ~var15; ++var16) {
                        }
                        int[] var17 = this.field3363[var16];
                        int[] var18 = this.field3363[var16 - 1];
                        int var19 = (-var18[0] + var15 << 12) / (var17[0] + -var18[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var18[1] * var20 - -(var17[1] * var19) >> 12;
                    }
                }
            } else {
                for (int var21 = 0; ~class57.field1152 < ~var21; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; this.field3363.length + -1 > var23 && ~this.field3363[var23][0] >= ~var22; ++var23) {
                    }
                    int[] var24 = this.field3363[var23 - 1];
                    int[] var25 = this.field3363[var23];
                    int var26 = this.method1215(var23 + -2, true)[1];
                    int var27 = var24[1];
                    int var28 = var25[1];
                    int var29 = this.method1215(var23 - -1, true)[1];
                    int var30 = (var22 - var24[0] << 12) / (var25[0] + -var24[0]);
                    int var31 = var30 * var30 >> 12;
                    int var32 = var29 - (var28 - -var26) + var27;
                    int var33 = -var32 + var26 + -var27;
                    int var35 = -var26 + var28;
                    int var36 = (var30 * var32 >> 12) * var31 >> 12;
                    int var37 = var30 * var35 >> 12;
                    int var38 = var31 * var33 >> 12;
                    var3[var21] = var36 + var38 + var27 + var37;
                }
            }
        }
        if (arg0 > -49) {
            field3349 = -36;
        }
        return var3;
    }

    @OriginalMember(owner = "tc", name = "f", descriptor = "(B)V")
    private final void method1214(byte arg0) {
        ++field3355;
        int[] var2 = this.field3363[0];
        int[] var3 = this.field3363[this.field3363.length + -2];
        int[] var4 = this.field3363[1];
        int var5 = 52 / ((arg0 - 60) / 57);
        int[] var6 = this.field3363[this.field3363.length + -1];
        this.field3353 = new int[] { var3[0] + -var6[0] + var3[0], var3[1] - var6[1] - -var3[1] };
        this.field3376 = new int[] { var2[0] + -var4[0] + var2[0], var2[1] - (var4[1] + -var2[1]) };
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field3356;
        if (arg0 <= -120) {
            if (~arg1 == -1) {
                this.field3360 = arg2.method598((byte) 72);
                this.field3363 = new int[arg2.method598((byte) 102)][2];
                for (int var4 = 0; var4 < this.field3363.length; ++var4) {
                    this.field3363[var4][0] = arg2.method569(true);
                    this.field3363[var4][1] = arg2.method569(true);
                }
            }
        }
    }

    @OriginalMember(owner = "tc", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        if (this.field3363 == null) {
            this.field3363 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3367;
        if (this.field3363.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 != 25614) {
                this.field3363 = null;
            }
            if (~this.field3360 == -3) {
                this.method1214((byte) 117);
            }
            class179.method1217(127);
        }
    }

    @OriginalMember(owner = "tc", name = "<init>", descriptor = "()V")
    public class178() {
        super(1, true);
    }

    @OriginalMember(owner = "tc", name = "a", descriptor = "(IZ)[I")
    private final int[] method1215(int arg0, boolean arg1) {
        ++field3358;
        if (!arg1) {
            return null;
        } else if (arg0 < 0) {
            return this.field3376;
        } else {
            return arg0 >= this.field3363.length ? this.field3353 : this.field3363[arg0];
        }
    }

    @OriginalMember(owner = "tc", name = "g", descriptor = "(B)[Ldf;")
    public static final class37[] method1216(byte arg0) {
        if (arg0 != -12) {
            return null;
        } else {
            ++field3351;
            class37[] var1 = new class37[class131.field2540];
            for (int var2 = 0; ~var2 > ~class131.field2540; ++var2) {
                class37 var3 = new class37();
                var3.field805 = class116.field2298;
                var3.field808 = class168.field3114;
                var3.field803 = class160.field2992[var2];
                var3.field807 = class202.field3976[var2];
                var3.field801 = class21.field481[var2];
                var3.field806 = class69.field1345[var2];
                var3.field804 = class51.field1036;
                var3.field802 = class10.field166[var2];
                var1[var2] = var3;
            }
            class69.method444(-122);
            return var1;
        }
    }
}
