import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class245 extends class135 {

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    private int field4356 = 16;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    private int field4357 = 4096;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    private int field4360 = 0;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    private int field4366 = 0;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
    private int field4370 = 2000;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "Lqj;")
    public static class196 field4369 = class80.method502("::fpson", -48);

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "Lqj;")
    public static class196 field4358;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "Lcg;")
    public static class1 field4363;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(B)V")
    public static void method1669(byte arg0) {
        field4358 = null;
        field4369 = null;
        int var1 = -123 % ((36 - arg0) / 48);
        field4363 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, byte arg13, int arg14, int arg15) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class23.field293 * 128) {
            arg0 = class23.field293 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class110.field1566 * 128) {
            arg2 = class110.field1566 * 128 - 1;
        }
        class109.field1561 = class15.field170[arg3];
        class8.field79 = class15.field172[arg3];
        class235.field4171 = class15.field170[arg4];
        class120.field1734 = class15.field172[arg4];
        class202.field3586 = arg0;
        class253.field4483 = arg1;
        class224.field4012 = arg2;
        class71.field1006 = arg0 / 128;
        class238.field4236 = arg2 / 128;
        class218.field3913 = arg5;
        class135.field1959 = class71.field1006 - class168.field2827;
        if (class135.field1959 < 0) {
            class135.field1959 = 0;
        }
        class149.field2380 = class238.field4236 - class168.field2827;
        if (class149.field2380 < 0) {
            class149.field2380 = 0;
        }
        class24.field313 = class71.field1006 + class168.field2827;
        if (class24.field313 > class23.field293) {
            class24.field313 = class23.field293;
        }
        class242.field4299 = class238.field4236 + class168.field2827;
        if (class242.field4299 > class110.field1566) {
            class242.field4299 = class110.field1566;
        }
        short var16 = 3500;
        for (int var17 = 0; var17 < class168.field2827 + class168.field2827 + 2; ++var17) {
            for (int var20 = 0; var20 < class168.field2827 + class168.field2827 + 2; ++var20) {
                int var21 = (var17 - class168.field2827 << 7) - (class202.field3586 & 127);
                int var22 = (var20 - class168.field2827 << 7) - (class224.field4012 & 127);
                int var23 = class71.field1006 - class168.field2827 + var17;
                int var24 = class238.field4236 - class168.field2827 + var20;
                if (var23 >= 0 && var24 >= 0 && var23 < class23.field293 && var24 < class110.field1566) {
                    int var25;
                    if (class145.field2265 != null) {
                        var25 = class145.field2265[0][var23][var24] - class253.field4483 + 128;
                    } else {
                        var25 = class203.field3667[0][var23][var24] - class253.field4483 + 128;
                    }
                    int var26 = class203.field3667[3][var23][var24] - class253.field4483 - 1000;
                    class64.field884[var17][var20] = class169.method1107(var21, var26, var25, var22, var16);
                } else {
                    class64.field884[var17][var20] = false;
                }
            }
        }
        for (int var18 = 0; var18 < class168.field2827 + class168.field2827 + 1; ++var18) {
            for (int var19 = 0; var19 < class168.field2827 + class168.field2827 + 1; ++var19) {
                class195.field3423[var18][var19] = class64.field884[var18][var19] || class64.field884[var18 + 1][var19] || class64.field884[var18][var19 + 1] || class64.field884[var18 + 1][var19 + 1];
            }
        }
        class218.field3917 = arg7;
        class134.field1906 = arg8;
        class217.field3902 = arg9;
        class242.field4301 = arg10;
        class154.field2487 = arg11;
        class258.method1733();
        class212.method1467(arg0, arg1, arg2, arg6, arg12, arg13, arg14, arg15);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field4367;
            int[] var3 = super.field1954.method110(arg0, -126);
            if (super.field1954.field244) {
                int var4 = this.field4357 >> 1;
                int[][] var5 = super.field1954.method111((byte) 80);
                Random var6 = new Random((long) this.field4360);
                for (int var7 = 0; ~this.field4370 < ~var7; ++var7) {
                    int var8 = ~this.field4357 < -1 ? this.field4366 - var4 - -class217.method1484(true, var6, this.field4357) : this.field4366;
                    int var9 = class217.method1484(true, var6, class131.field1862);
                    int var10 = (var8 & 4090) >> 4;
                    int var11 = class217.method1484(true, var6, class150.field2400);
                    int var12 = var11 - -(class173.field2914[var10] * this.field4356 >> 12);
                    int var13 = (class20.field231[var10] * this.field4356 >> 12) + var9;
                    int var14 = var12 - var11;
                    int var15 = -var9 + var13;
                    if (~var15 != -1 || ~var14 != -1) {
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        boolean var16 = var14 > var15;
                        if (var16) {
                            int var17 = var9;
                            int var18 = var13;
                            var9 = var11;
                            var13 = var12;
                            var12 = var18;
                            var11 = var17;
                        }
                        if (var13 < var9) {
                            int var19 = var9;
                            int var20 = var11;
                            var11 = var12;
                            var12 = var20;
                            var9 = var13;
                            var13 = var19;
                        }
                        int var21 = var11;
                        int var22 = -var9 + var13;
                        int var23 = -var11 + var12;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class217.method1484(!arg1, var6, 4096) >> 2) + 1024;
                        int var27 = ~var12 < ~var11 ? 1 : -1;
                        for (int var28 = var9; var28 < var13; ++var28) {
                            int var29 = var26 - (-1024 - (-var9 + var28) * var25);
                            var24 += var23;
                            int var30 = class61.field816 & var28;
                            int var31 = class53.field667 & var21;
                            if (~var24 < -1) {
                                var21 += var27;
                                var24 -= var22;
                            }
                            if (!var16) {
                                var5[var30][var31] = var29;
                            } else {
                                var5[var31][var30] = var29;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)V")
    public static final void method1671(int arg0, int arg1) {
        class48.field573 = arg1;
        class235.field4182 = 50;
        if (arg0 != 17866) {
            field4358 = null;
        }
        ++field4372;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(II)Lqj;")
    public static final class196 method1672(int arg0, int arg1) {
        if (arg1 != 0) {
            field4358 = null;
        }
        ++field4359;
        return class93.method572(arg1 ^ -86, new class196[] { class163.method1029(255 & arg0 >> 24, false), client.field1459, class163.method1029(255 & arg0 >> 16, false), client.field1459, class163.method1029((65296 & arg0) >> 8, false), client.field1459, class163.method1029(arg0 & 255, false) });
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        if (arg0 != -85) {
            field4362 = 78;
        }
        ++field4365;
        class87.method546((byte) 97);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field4361;
        if (arg2 != -16231) {
            field4368 = -76;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field4357 = arg0.method318(true);
                        }
                    } else {
                        this.field4366 = arg0.method318(true);
                    }
                } else {
                    this.field4356 = arg0.method367(arg2 + 16232);
                }
            } else {
                this.field4370 = arg0.method318(true);
            }
        } else {
            this.field4360 = arg0.method367(1);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqj;Lqj;ILqj;Z)V")
    public static final void method1673(class196 arg0, class196 arg1, int arg2, class196 arg3, boolean arg4) {
        class3.method10(arg3, arg1, -1, arg0, 99, arg2);
        ++field4371;
        if (!arg4) {
            field4363 = null;
        }
    }
}
