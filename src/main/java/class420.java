import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class420 extends class40 {

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)I")
    public static final int method2642(int arg0, int arg1) {
        return class25.field314 != null ? class25.field314[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
    public class420() {
        super(3, false);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field6015;
        if (arg0 > -20) {
            return null;
        } else {
            int[] var3 = super.field551.method185(65280, arg1);
            if (super.field551.field441) {
                int[] var4 = this.method266((byte) -116, arg1, 0);
                int[] var5 = this.method266((byte) -116, arg1, 1);
                int[] var6 = this.method266((byte) -116, arg1, 2);
                for (int var7 = 0; var7 < class410.field5886; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lvq;Z)V")
    public static final void method2643(class269 arg0, boolean arg1) {
        ++field6016;
        int var2 = class129.field1832;
        int var3 = class352.field5116;
        int var4 = class264.field3882;
        int var5 = class291.field4227 - 3;
        byte var6 = 20;
        if (class310.field4499 == null || class409.field5867 == null) {
            if (class15.field216.method660(class84.field1075, (byte) 80) && class15.field216.method660(class224.field3359, (byte) -88)) {
                class310.field4499 = arg0.method870(class337.method2225(class15.field216, class84.field1075, 0), true);
                class337 var7 = class337.method2225(class15.field216, class224.field3359, 0);
                class409.field5867 = arg0.method870(var7, true);
                var7.method2212();
                class413.field5909 = arg0.method870(var7, true);
            } else {
                arg0.method1012(var2, var3, var4, var6, -class331.field4775 + 255 << 24 | class448.field6397, 1);
            }
        }
        if (class310.field4499 != null && class409.field5867 != null) {
            int var8 = (-(2 * class409.field5867.method87()) + var4) / class310.field4499.method87();
            for (int var9 = 0; ~var9 > ~var8; ++var9) {
                class310.field4499.method1772(var2 + class409.field5867.method87() + var9 * class310.field4499.method87(), var3);
            }
            class409.field5867.method1772(var2, var3);
            class413.field5909.method1772(var2 - (-var4 - -class413.field5909.method87()), var3);
        }
        class154.field2285.method2197(class390.field5483 | -16777216, -1, var2 + 3, (byte) -114, class190.field2725.method2284((byte) -93, class309.field4497), var3 + 14);
        arg0.method1012(var2, var3 + var6, var4, var5 - var6, 255 - class331.field4775 << 24 | class448.field6397, 1);
        int var10 = class270.field3949.method536(0);
        int var11 = class270.field3949.method543(7);
        for (int var12 = 0; class381.field5412 > var12; ++var12) {
            int var26 = 13 - -((class381.field5412 - 1 - var12) * 16) + (var3 - -var6);
            if (var10 > var2 && ~(var2 + var4) < ~var10 && var26 - 13 < var11 && var26 + 4 > var11) {
                arg0.method1012(var2, var26 + -12, var4, 16, class87.field1129 | -class261.field3866 + 255 << 24, 1);
            }
        }
        if ((class341.field4937 == null || class376.field5351 == null || class324.field4716 == null) && class15.field216.method660(class187.field2675, (byte) -75) && class15.field216.method660(class139.field2129, (byte) 80) && class15.field216.method660(class62.field834, (byte) -113)) {
            class337 var13 = class337.method2225(class15.field216, class139.field2129, 0);
            class376.field5351 = arg0.method870(var13, true);
            var13.method2212();
            class13.field187 = arg0.method870(var13, true);
            class341.field4937 = arg0.method870(class337.method2225(class15.field216, class187.field2675, 0), true);
            class337 var14 = class337.method2225(class15.field216, class62.field834, 0);
            class324.field4716 = arg0.method870(var14, true);
            var14.method2212();
            class103.field1302 = arg0.method870(var14, true);
        }
        if (class341.field4937 != null && class376.field5351 != null && class324.field4716 != null) {
            int var15 = (-(2 * class324.field4716.method87()) + var4) / class341.field4937.method87();
            for (int var16 = 0; ~var16 > ~var15; ++var16) {
                class341.field4937.method1772(var2 + class324.field4716.method87() + var16 * class341.field4937.method87(), var3 - -var5 + -class341.field4937.method80());
            }
            int var17 = (-var6 + var5 + -class324.field4716.method80()) / class376.field5351.method80();
            for (int var18 = 0; var18 < var17; ++var18) {
                class376.field5351.method1772(var2, var18 * class376.field5351.method80() + var6 + var3);
                class13.field187.method1772(-class13.field187.method87() + var2 + var4, class376.field5351.method80() * var18 + var6 + var3);
            }
            class324.field4716.method1772(var2, var3 - -var5 - class324.field4716.method80());
            class103.field1302.method1772(-class324.field4716.method87() + var2 + var4, var3 - -var5 - class324.field4716.method80());
        }
        int var19 = 0;
        for (class382 var20 = (class382) class228.field3392.method2752(-128); var20 != null; var20 = (class382) class228.field3392.method2754(-1)) {
            int var21 = (class381.field5412 + -1 + -var19) * 16 + (var6 - -13) + var3;
            int var22 = class390.field5483 | -16777216;
            if (~var10 < ~var2 && var10 < var2 + var4 && var11 > var21 + -13 && ~var11 > ~(var21 + 4)) {
                var22 = class304.field4439 | -16777216;
            }
            int[] var23 = null;
            if (!class411.method2601(-3, var20.field5420)) {
                if (!class126.method762(var20.field5420, false)) {
                    if (class204.method1426(var20.field5420, false)) {
                        if (~var20.field5420 != -1005) {
                            var23 = class398.method2496(-117, (int) (var20.field5421 >>> 32 & 2147483647L)).field4073;
                        } else {
                            var23 = class398.method2496(-115, (int) var20.field5421).field4073;
                        }
                    }
                } else {
                    class446 var24 = class442.field6317[(int) var20.field5421];
                    if (var24 != null) {
                        var23 = var24.field6375.field4985;
                    }
                }
            } else {
                var23 = class167.method1202(!arg1, (int) var20.field5421).field5807;
            }
            String var25 = class239.method1631((byte) 28, var20);
            if (var23 != null) {
                var25 = var25 + class291.method1971(114, var23);
            }
            class154.field2285.method2196(var21, var2 + 3, class376.field5361, class110.field1426, -2401, var22, var25, 0);
            ++var19;
        }
        class401.method2516(class129.field1832, class264.field3882, arg1, class352.field5116, class291.field4227);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)[[I")
    public final int[][] method112(int arg0, int arg1) {
        ++field6018;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int[] var4 = this.method266((byte) -116, arg1, 2);
            int[][] var5 = this.method261(0, 28552, arg1);
            int[][] var6 = this.method261(1, arg0 + 28551, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class410.field5886; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        if (arg0 != 1) {
            method2642(-49, -73);
        }
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg1 <= 79) {
            this.method43(38, -78, (class130) null);
        }
        if (arg0 == 0) {
            super.field550 = arg2.method837(true) == 1;
        }
        ++field6017;
    }
}
