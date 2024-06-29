import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class210 extends class117 {

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    private int field3798 = 32768;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "Lhh;")
    public static class163 field3805 = class137.method1065("(Z", 17);

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "Z")
    public static boolean field3801 = true;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "Ljava/util/Random;")
    public static Random field3800 = new Random();

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "Lhh;")
    private static class163 field3812 = class137.method1065("Use", 17);

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "Lhh;")
    public static class163 field3811 = field3812;

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "Loj;")
    public static class17 field3813 = new class17(100);

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "Lhh;")
    public static class163 field3814 = class137.method1065("unzap", 17);

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "[I")
    public static int[] field3799;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)Lhh;")
    public static final class163 method1502(boolean arg0, int arg1) {
        if (arg0) {
            method1504((class123) null, 26, (class123) null);
        }
        ++field3804;
        return class145.method1101(0, new class163[] { class136.method1061(255 & arg1 >> 24, (byte) 120), class48.field807, class136.method1061((16716358 & arg1) >> 16, (byte) 127), class48.field807, class136.method1061(arg1 >> 8 & 255, (byte) 127), class48.field807, class136.method1061(arg1 & 255, (byte) 116) });
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static void method1503(boolean arg0) {
        field3814 = null;
        if (arg0) {
            method1505(16, -51, 24, (class79) null, (class69) null, -94, (class79) null, -11);
        }
        field3805 = null;
        field3812 = null;
        field3813 = null;
        field3811 = null;
        field3799 = null;
        field3800 = null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class210() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 != 0) {
            method1504((class123) null, -64, (class123) null);
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field2208 = ~arg2.method622(true) == -2;
            }
        } else {
            this.field3798 = arg2.method658(-58) << 4;
        }
        ++field3803;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        if (!arg1) {
            field3814 = null;
        }
        ++field3808;
        int[][] var3 = super.field2228.method1304(arg0, (byte) 93);
        if (super.field2228.field3221) {
            int[] var4 = this.method932(arg0, false, 1);
            int[] var5 = this.method932(arg0, false, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class143.field2702; ++var9) {
                int var10 = var5[var9] * this.field3798 >> 12;
                int var11 = 255 & var4[var9] * 255 >> 12;
                int var12 = class46.field775[var11] * var10 >> 12;
                int var13 = class26.field412[var11] * var10 >> 12;
                int var14 = class258.field4520 & (var12 >> 12) + arg0;
                int var15 = class54.field884 & (var13 >> 12) + var9;
                int[][] var16 = this.method931(var14, 87, 0);
                var6[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var7[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lpa;ILpa;)I")
    public static final int method1504(class123 arg0, int arg1, class123 arg2) {
        ++field3806;
        int var3 = 0;
        if (arg2.method970(class45.field757, 0)) {
            ++var3;
        }
        if (arg2.method970(class59.field976, 0)) {
            ++var3;
        }
        if (arg2.method970(class58.field947, 0)) {
            ++var3;
        }
        if (arg0.method970(class45.field757, 0)) {
            ++var3;
        }
        if (arg1 != 4197) {
            field3801 = true;
        }
        if (arg0.method970(class59.field976, 0)) {
            ++var3;
        }
        if (arg0.method970(class58.field947, 0)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        class223.method1578(true);
        ++field3809;
        if (arg0 >= -92) {
            method1502(false, -57);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != -21393) {
            field3800 = null;
        }
        ++field3807;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int[] var4 = this.method932(arg1, false, 1);
            int[] var5 = this.method932(arg1, false, 2);
            for (int var6 = 0; var6 < class143.field2702; ++var6) {
                int var7 = (var4[var6] & 4085) >> 4;
                int var8 = var5[var6] * this.field3798 >> 12;
                int var9 = class26.field412[var7] * var8 >> 12;
                int var10 = (var9 >> 12) + var6 & class54.field884;
                int var11 = class46.field775[var7] * var8 >> 12;
                int var12 = class258.field4520 & (var11 >> 12) + arg1;
                int[] var13 = this.method932(var12, false, 0);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILoh;Lqh;ILoh;I)V")
    public static final void method1505(int arg0, int arg1, int arg2, class79 arg3, class69 arg4, int arg5, class79 arg6, int arg7) {
        ++field3810;
        class244.field4314 = arg0;
        class222.field4044 = arg1;
        class190.field3482 = arg4;
        class157.field2916 = arg7;
        class93.field1768 = arg5;
        if (class50.field836 == null) {
            class124.field2393 = true;
            int var8 = -45 / ((-7 - arg2) / 39);
            if (class212.field3847 == null) {
                class212.field3847 = class211.method1509(false, 0, class94.field1786, client.field1994);
            }
            if (class20.field329 == null) {
                class20.field329 = class36.method265(class94.field1786, class214.field3910, 0, -1);
            }
            if (class238.field4244 == null) {
                class238.field4244 = class36.method265(class94.field1786, class196.field3539, 0, -1);
            }
            if (class204.field3695 == null) {
                class204.field3695 = class36.method265(class94.field1786, class186.field3417, 0, -1);
            }
            int var9 = class222.field4044 / 5;
            int var10 = class222.field4044 / 5 * 4;
            class206.method1461(class93.field1768, class244.field4314, class222.field4044, class157.field2916, 0, 168);
            class206.method1470(class93.field1768, class244.field4314, var9, 23, 12425273, 9135624);
            class206.method1470(class93.field1768 + var9, class244.field4314, var10, 23, 5197647, 2697513);
            arg6.method584(class137.field2643, class93.field1768 - -(var9 / 2), class244.field4314 + 15, 0, -1);
            if (class204.field3695 != null) {
                class204.field3695[1].method751(class93.field1768 - -2 + var9, class244.field4314 + 1);
                arg3.method592(class81.field1544, var9 - -12 + class93.field1768, class244.field4314 + 10, 16777215, -1);
                class204.field3695[0].method751(class93.field1768 + 2 + var9, class244.field4314 - -12);
                arg3.method592(class216.field3934, class93.field1768 - -var9 - -12, class244.field4314 - -21, 16777215, -1);
            }
            if (class238.field4244 != null) {
                int var11 = class93.field1768 + var9 - -140;
                if (~class30.field473[0] == -1 && class69.field1300[0] == 0) {
                    class238.field4244[2].method751(var11, class244.field4314 + 4);
                } else {
                    class238.field4244[0].method751(var11, class244.field4314 + 4);
                }
                if (class30.field473[0] == 0 && ~class69.field1300[0] == -2) {
                    class238.field4244[3].method751(var11 + 15, class244.field4314 + 4);
                } else {
                    class238.field4244[1].method751(var11 + 15, class244.field4314 + 4);
                }
                arg6.method592(class151.field2825, var11 + 32, class244.field4314 - -17, 16777215, -1);
                int var12 = class93.field1768 - (-var9 + -250);
                if (~class30.field473[0] == -2 && ~class69.field1300[0] == -1) {
                    class238.field4244[2].method751(var12, class244.field4314 - -4);
                } else {
                    class238.field4244[0].method751(var12, class244.field4314 + 4);
                }
                if (~class30.field473[0] == -2 && ~class69.field1300[0] == -2) {
                    class238.field4244[3].method751(var12 + 15, class244.field4314 - -4);
                } else {
                    class238.field4244[1].method751(var12 + 15, class244.field4314 + 4);
                }
                arg6.method592(class219.field3988, var12 + 32, class244.field4314 + 17, 16777215, -1);
                int var13 = class93.field1768 + var9 + 360;
                if (class30.field473[0] == 2 && ~class69.field1300[0] == -1) {
                    class238.field4244[2].method751(var13, class244.field4314 + 4);
                } else {
                    class238.field4244[0].method751(var13, class244.field4314 + 4);
                }
                if (class30.field473[0] == 2 && ~class69.field1300[0] == -2) {
                    class238.field4244[3].method751(var13 + 15, class244.field4314 - -4);
                } else {
                    class238.field4244[1].method751(var13 + 15, class244.field4314 + 4);
                }
                arg6.method592(class63.field1075, var13 - -32, class244.field4314 - -17, 16777215, -1);
                int var14 = class93.field1768 - -var9 + 470;
                if (~class30.field473[0] == -4 && ~class69.field1300[0] == -1) {
                    class238.field4244[2].method751(var14, class244.field4314 + 4);
                } else {
                    class238.field4244[0].method751(var14, class244.field4314 - -4);
                }
                if (class30.field473[0] == 3 && class69.field1300[0] == 1) {
                    class238.field4244[3].method751(var14 + 15, class244.field4314 + 4);
                } else {
                    class238.field4244[1].method751(var14 - -15, class244.field4314 + 4);
                }
                arg6.method592(class96.field1809, var14 + 32, class244.field4314 + 17, 16777215, -1);
            }
            class206.method1483(class222.field4044 + -10 - 58, class244.field4314 + 4, 58, 16, 0);
            class227.field4093 = -1;
            if (class212.field3847 != null) {
                byte var15 = 19;
                byte var16 = 88;
                int var17 = class222.field4044 / (var16 + 1);
                int var18 = (class157.field2916 - 23) / (var15 + 1);
                int var19;
                int var20;
                do {
                    var19 = var17;
                    if (~class33.field513 >= ~((var17 - 1) * var18)) {
                        --var17;
                    }
                    var20 = var18;
                    if (~((var18 + -1) * var17) <= ~class33.field513) {
                        --var18;
                    }
                    if (~class33.field513 >= ~((var18 + -1) * var17)) {
                        --var18;
                    }
                } while (var18 != var20 || ~var17 != ~var19);
                int var21 = (class222.field4044 - var16 * var17) / (var17 + 1);
                int var22 = (-(var15 * var18) + class157.field2916 + -23) / (var18 - -1);
                if (~var22 < -6) {
                    var22 = 5;
                }
                int var23 = 0;
                if (~var21 < -6) {
                    var21 = 5;
                }
                int var24 = (class157.field2916 + -23 + -((var18 + -1) * var22) - var15 * var18) / 2;
                int var25 = var24 + 23;
                int var26 = (-((var17 + -1) * var21) + -(var16 * var17) + class222.field4044) / 2;
                int var27 = var26;
                for (int var28 = 0; var28 < class33.field513; ++var28) {
                    class223 var29 = class144.field2722[var28];
                    class163 var30 = class136.method1061(var29.field4061, (byte) 115);
                    boolean var31 = true;
                    if (var29.field4061 == -1) {
                        var30 = class257.field4502;
                        var31 = false;
                    } else if (~var29.field4061 < -1981) {
                        var31 = false;
                        var30 = class10.field169;
                    }
                    if (class36.field608 >= var27 && var25 <= class240.field4281 && var16 + var27 > class36.field608 && ~class240.field4281 > ~(var15 + var25) && var31) {
                        class227.field4093 = var28;
                        class212.field3847[!var29.field4056 ? 0 : 1].method522(class93.field1768 + var27, class244.field4314 + var25, 128, 16777215);
                    } else {
                        class212.field3847[!var29.field4056 ? 0 : 1].method101(class93.field1768 - -var27, class244.field4314 + var25);
                    }
                    if (class20.field329 != null) {
                        class20.field329[(!var29.field4056 ? 0 : class20.field329.length / 2) + var29.field4053].method751(class93.field1768 + 29 - -var27, class244.field4314 + var25);
                    }
                    arg6.method584(class136.method1061(var29.field4065, (byte) 125), class93.field1768 - -var27 + 15, class244.field4314 - -(var15 / 2) + var25 + 5, 0, -1);
                    arg3.method584(var30, class93.field1768 + 60 + var27, var15 / 2 + class244.field4314 + var25 + 5, 268435455, -1);
                    var25 += var15 + var22;
                    int var10000 = ~var18;
                    ++var23;
                    if (var10000 >= ~var23) {
                        var27 += var16 + var21;
                        var23 = 0;
                        var25 = var24 + 23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)I")
    public static final int method1506(int arg0, int arg1, int arg2) {
        if (arg2 <= 49) {
            return 95;
        } else {
            ++field3802;
            int var3 = class97.method770((byte) -108, arg1 - 1, arg0 + -1) - -class97.method770((byte) 53, arg1 + -1, arg0 + 1) - -class97.method770((byte) 3, arg1 + 1, arg0 - 1) - -class97.method770((byte) 29, arg1 - -1, arg0 + 1);
            int var4 = class97.method770((byte) -109, arg1, arg0 - 1) + (class97.method770((byte) -108, arg1, arg0 + 1) - -class97.method770((byte) 24, arg1 + -1, arg0) - -class97.method770((byte) 30, arg1 + 1, arg0));
            int var5 = class97.method770((byte) 125, arg1, arg0);
            return var4 / 8 + var3 / 16 + var5 / 4;
        }
    }
}
