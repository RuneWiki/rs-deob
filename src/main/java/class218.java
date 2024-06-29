import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class218 extends class264 {

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
    private int field3151 = 32768;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "Lwk;")
    public static class155 field3152 = new class155(16);

    @OriginalMember(owner = "client!vl", name = "Y", descriptor = "Lvb;")
    public static class247 field3158 = class289.method1900((byte) -37);

    @OriginalMember(owner = "client!vl", name = "bb", descriptor = "Lap;")
    public static class310 field3161 = new class310(81, 2);

    @OriginalMember(owner = "client!vl", name = "cb", descriptor = "Z")
    public static boolean field3162 = false;

    @OriginalMember(owner = "client!vl", name = "eb", descriptor = "[I")
    public static int[] field3164 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!vl", name = "ab", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!vl", name = "db", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!vl", name = "X", descriptor = "[[B")
    public static byte[][] field3157;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "(I)Lfl;", line = 4)
    public static final class67 method1500(int arg0) {
        if (arg0 != -28935) {
            field3164 = null;
        }
        ++field3154;
        return class330.field4570;
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)V", line = 15)
    public final void method95(int arg0) {
        class163.method1206((byte) -114);
        if (arg0 == -8) {
            ++field3160;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLkk;I)V", line = 30)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field3150;
        if (arg0 < 31) {
            this.method5((byte) -75, -26);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field3794 = ~arg1.method1172((byte) -108) == -2;
            }
        } else {
            this.field3151 = arg1.method1134(-16848) << 4;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lrs;ZLrs;)V", line = 67)
    public static final void method1501(class449 arg0, boolean arg1, class449 arg2) {
        ++field3159;
        if (arg2.field6388 != null) {
            arg2.method2714(-102);
        }
        arg2.field6385 = arg0;
        arg2.field6388 = arg0.field6388;
        if (arg1) {
            field3162 = true;
        }
        arg2.field6388.field6385 = arg2;
        arg2.field6385.field6388 = arg2;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 339)
    public class218() {
        super(3, false);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIILtq;Lvc;)V", line = 91)
    public static final void method1502(int arg0, int arg1, int arg2, int arg3, int arg4, class248 arg5, class89 arg6) {
        ++field3147;
        if (~class4.field33 > -101) {
            class323.method2043(arg6, (byte) -30, arg5);
        }
        arg6.method453(arg3, arg0, arg3 + arg4, arg0 - -arg1);
        if (class4.field33 < 100) {
            byte var7 = 20;
            int var8 = arg4 / 2 + arg3;
            arg6.method438(arg3, arg0, arg4, arg1, -16777216, 0);
            int var9 = arg1 / 2 + (arg0 - var7) + -18;
            arg6.method348(var8 + -152, var9, 304, 34, class116.field1617[class105.field1474].getRGB(), 0);
            arg6.method438(var8 + -150, var9 + 2, class4.field33 * 3, 30, class167.field2421[class105.field1474].getRGB(), 0);
            class408.field5584.method1385(class177.field2677.method1078(class66.field967, arg2 + 101), class99.field1408[class105.field1474].getRGB(), -1, var9 - -var7, var8, 1453761640);
        } else {
            int var10 = class309.field4388 - (int) ((float) arg4 / class330.field4577);
            int var11 = (int) ((float) arg1 / class330.field4577) + class25.field267;
            int var12 = (int) ((float) arg4 / class330.field4577) + class309.field4388;
            class211.field3078 = -((int) ((float) arg1 / class330.field4577)) + class25.field267;
            class486.field6874 = (int) ((float) (arg4 * 2) / class330.field4577);
            class158.field2260 = class309.field4388 - (int) ((float) arg4 / class330.field4577);
            int var13 = -((int) ((float) arg1 / class330.field4577)) + class25.field267;
            class480.field6801 = (int) ((float) (arg1 * 2) / class330.field4577);
            class330.method2066(class330.field4596 + var10, class330.field4602 + var11, class330.field4596 + var12, class330.field4602 + var13, arg3, arg0, arg3 - -arg4, arg1 + 1 + arg0);
            class330.method2078(arg6);
            class92 var14 = class330.method2079(arg6);
            class164.method1208(var14, 0, true, arg6, 0);
            if (arg2 > ~class349.field4804) {
                --class182.field2752;
                if (~class182.field2752 == -1) {
                    --class349.field4804;
                    class182.field2752 = 20;
                }
            }
            if (class76.field1129) {
                int var15 = arg3 + -5 + arg4;
                int var16 = arg1 + -8 + arg0;
                class189.field2830.method1380(var15, var16, "Fps:" + class59.field851, -1, 16776960, 112);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() + -var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (~var18 < -65537) {
                    var19 = 16711680;
                }
                class189.field2830.method1380(var15, var20, "Mem:" + var18 + "k", -1, var19, arg2 ^ 101);
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILfo;)I", line = 170)
    public static final int method1503(int arg0, class418 arg1) {
        ++field3153;
        if (arg1.field5780 == 0) {
            return 0;
        } else {
            if (arg0 >= -28) {
                field3158 = null;
            }
            if (arg1.field5748 != -1) {
                class418 var2 = null;
                if (arg1.field5748 < 32768) {
                    var2 = class163.field2377[arg1.field5748];
                } else if (~arg1.field5748 <= -32769) {
                    var2 = class112.field1570[arg1.field5748 + -32768];
                }
                if (var2 != null) {
                    int var3 = -var2.field4537 + arg1.field4537;
                    int var4 = arg1.field4530 - var2.field4530;
                    if (var3 != 0 || var4 != 0) {
                        arg1.method2507((int) (2607.5945876176133D * Math.atan2((double) var3, (double) var4)) & 16383, false);
                    }
                }
            }
            if (!(arg1 instanceof class39)) {
                if (arg1 instanceof class361) {
                    class361 var5 = (class361) arg1;
                    if (var5.field4954 != -1 && (~var5.field5810 == -1 || ~var5.field5805 < -1)) {
                        int var6 = -((-class279.field4012 + var5.field4954 - class279.field4012) * 64) + var5.field4537;
                        int var7 = var5.field4530 - (var5.field4972 - (class189.field2810 - -class189.field2810)) * 64;
                        if (var6 != 0 || var7 != 0) {
                            var5.method2507((int) (2607.5945876176133D * Math.atan2((double) var6, (double) var7)) & 16383, false);
                        }
                        var5.field4954 = -1;
                    }
                }
            } else {
                class39 var8 = (class39) arg1;
                if (~var8.field497 != 0 && (~var8.field5810 == -1 || var8.field5805 > 0)) {
                    var8.method2507(var8.field497, false);
                    var8.field497 = -1;
                }
            }
            return arg1.method2509((byte) 124);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V", line = 243)
    public static void method1504(byte arg0) {
        field3157 = null;
        if (arg0 != -49) {
            method1503(46, (class418) null);
        }
        field3164 = null;
        field3161 = null;
        field3158 = null;
        field3152 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[I", line = 265)
    public final int[] method90(int arg0, int arg1) {
        ++field3155;
        int[] var3 = super.field3808.method958((byte) 114, arg0);
        if (arg1 != 21034) {
            method1503(7, (class418) null);
        }
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(arg0, (byte) -66, 1);
            int[] var5 = this.method1788(arg0, (byte) -6, 2);
            for (int var6 = 0; class478.field6792 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field3151 >> 12;
                int var9 = class41.field550[var7] * var8 >> 12;
                int var10 = class421.field5827[var7] * var8 >> 12;
                int var11 = class205.field3007 & (var9 >> 12) + var6;
                int var12 = class301.field4265 & (var10 >> 12) + arg0;
                int[] var13 = this.method1788(var12, (byte) -128, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V", line = 313)
    public static final void method1505(byte arg0) {
        ++field3148;
        for (class399 var1 = (class399) class236.field3436.method775(1); var1 != null; var1 = (class399) class236.field3436.method763(0)) {
            if (~var1.field5477 == 0) {
                var1.field5470 = 0;
                class217.method1496(var1, (byte) -15);
            } else {
                var1.method2714(101);
            }
        }
        int var2 = -111 / ((39 - arg0) / 39);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)I", line = 343)
    public static final int method1506(int arg0, int arg1, int arg2) {
        ++field3156;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        if (arg1 >= -72) {
            return -21;
        } else {
            int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (133787612 & var5) >> 19;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(BI)[[I", line = 368)
    public final int[][] method5(byte arg0, int arg1) {
        ++field3149;
        if (arg0 != 116) {
            field3164 = null;
        }
        int[][] var3 = super.field3816.method1928((byte) 66, arg1);
        if (super.field3816.field4208) {
            int[] var4 = this.method1788(arg1, (byte) -4, 1);
            int[] var5 = this.method1788(arg1, (byte) -117, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class478.field6792 < ~var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field3151 >> 12;
                int var12 = class41.field550[var10] * var11 >> 12;
                int var13 = class421.field5827[var10] * var11 >> 12;
                int var14 = class205.field3007 & (var12 >> 12) + var9;
                int var15 = class301.field4265 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1782(var15, (byte) 125, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
