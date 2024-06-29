import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class465 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lnc;")
    public class26 field6315;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Ldh;")
    public static class341 field6312;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIII)V")
    public static final void method2682(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6313++;
        class281 var5 = class54.method395((byte) -53, (long) arg4, 10);
        var5.method1821((byte) -126);
        var5.field3901 = arg2;
        var5.field3909 = arg3;
        var5.field3910 = arg0;
        if (!arg1) {
            field6312 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZI)V")
    public static final void method2683(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6314++;
        if (!arg3 && class666.field9269 == arg2 && class171.field2735 == arg4 && class426.field5820 == class282.field3917 || class111.field1911.field6734.method3639((byte) 82) == 1) {
            return;
        }
        int var5 = 124 % ((60 - arg0) / 55);
        class171.field2735 = arg4;
        class426.field5820 = class282.field3917;
        class666.field9269 = arg2;
        if (class111.field1911.field6734.method3639((byte) 91) == 1) {
            class426.field5820 = 0;
        }
        class139.method1142(2, arg1);
        class289.method1844(class95.field1472, class16.field239, class359.field4908, class641.field8830.method3566((byte) -62, class464.field6309), true, (byte) 11);
        int var6 = class217.field3198;
        int var7 = class400.field5510;
        class217.field3198 = (class666.field9269 - (class483.field6515 >> 4)) * 8;
        class400.field5510 = (class171.field2735 - (class65.field926 >> 4)) * 8;
        class668.field9304 = class64.method460(class666.field9269 * 8, class171.field2735 * 8);
        class333.field4502 = null;
        int var8 = class217.field3198 - var6;
        int var9 = class400.field5510 - var7;
        if (arg1 == 11) {
            for (int var10 = 0; var10 < class406.field5583; var10++) {
                class755 var11 = class491.field6712[var10];
                if (var11 != null) {
                    class666 var12 = var11.field10414;
                    for (int var13 = 0; var13 < 10; var13++) {
                        var12.field5304[var13] -= var8;
                        var12.field5308[var13] -= var9;
                    }
                    var12.field7396 -= var8 * 512;
                    var12.field7398 -= var9 * 512;
                }
            }
        } else {
            boolean var14 = false;
            class610.field8520 = 0;
            int var15 = class483.field6515 * 512 - 512;
            int var16 = (class65.field926 - 1) * 512;
            for (int var17 = 0; var17 < class406.field5583; var17++) {
                class755 var31 = class491.field6712[var17];
                if (var31 != null) {
                    class666 var32 = var31.field10414;
                    var32.field7398 -= var9 * 512;
                    var32.field7396 -= var8 * 512;
                    if (var32.field7396 >= 0 && var15 >= var32.field7396 && var32.field7398 >= 0 && var32.field7398 <= var16) {
                        boolean var33 = true;
                        for (int var34 = 0; var34 < 10; var34++) {
                            var32.field5304[var34] -= var8;
                            var32.field5308[var34] -= var9;
                            if (var32.field5304[var34] < 0 || var32.field5304[var34] >= class483.field6515 || var32.field5308[var34] < 0 || class65.field926 <= var32.field5308[var34]) {
                                var33 = false;
                            }
                        }
                        if (var33) {
                            class744.field10273[class610.field8520++] = var32.field5288;
                        } else {
                            var32.method3764(44, null);
                            var31.method1207(83);
                            var14 = true;
                        }
                    } else {
                        var32.method3764(117, null);
                        var31.method1207(127);
                        var14 = true;
                    }
                }
            }
            if (var14) {
                class406.field5583 = class664.field9216.method343(-119);
                class664.field9216.method342(class491.field6712, -20773);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class771 var29 = class527.field7150[var18];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field5304[var30] -= var8;
                    var29.field5308[var30] -= var9;
                }
                var29.field7396 -= var8 * 512;
                var29.field7398 -= var9 * 512;
            }
        }
        class12[] var19 = class13.field198;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class12 var28 = var19[var20];
            if (var28 != null) {
                var28.field187 -= var9 * 512;
                var28.field188 -= var8 * 512;
            }
        }
        for (class300 var21 = (class300) class211.field3155.method3589((byte) -128); var21 != null; var21 = (class300) class211.field3155.method3591(0)) {
            var21.field4125 -= var9;
            var21.field4132 -= var8;
            if (class215.field3195 != 4 && (var21.field4132 < 0 || var21.field4125 < 0 || var21.field4132 >= class483.field6515 || var21.field4125 >= class65.field926)) {
                var21.method1207(113);
            }
        }
        for (class300 var22 = (class300) class488.field6589.method3589((byte) -127); var22 != null; var22 = (class300) class488.field6589.method3591(0)) {
            var22.field4125 -= var9;
            var22.field4132 -= var8;
            if (class215.field3195 != 4 && (var22.field4132 < 0 || var22.field4125 < 0 || var22.field4132 >= class483.field6515 || var22.field4125 >= class65.field926)) {
                var22.method1207(97);
            }
        }
        if (class215.field3195 != 4) {
            for (class234 var23 = (class234) class214.field3181.method335(-29067); var23 != null; var23 = (class234) class214.field3181.method336(111)) {
                int var24 = (int) (var23.field2528 & 0x3FFFL);
                int var25 = var24 - class217.field3198;
                int var26 = (int) (var23.field2528 >> 14 & 0x3FFFL);
                int var27 = var26 - class400.field5510;
                if (var25 < 0 || var27 < 0 || class483.field6515 <= var25 || class65.field926 <= var27) {
                    var23.method1207(117);
                }
            }
        }
        if (class231.field3356 != 0) {
            class231.field3356 -= var8;
            class392.field5380 -= var9;
        }
        class791.method4317((byte) -34);
        if (arg1 != 11) {
            class326.field4453 -= var9;
            class450.field6172 -= var9 * 512;
            class113.field2114 -= var9;
            class733.field10131 -= var8 * 512;
            class152.field2496 -= var8;
            class619.field8609 -= var8;
            if (Math.abs(var8) > class483.field6515 || Math.abs(var9) > class65.field926) {
                class596.method3394(9);
            }
        } else if (class536.field7291 == 4) {
            class97.field1557 -= var8 * 512;
            class488.field6593 -= var9 * 512;
            class229.field3347 -= var9 * 512;
            class492.field6736 -= var8 * 512;
        } else {
            class100.field1626 = -1;
            class577.field8185 = -1;
            class536.field7291 = 1;
        }
        class313.method1987(false);
        class420.method2468((byte) 8);
        class280.field3893.method3590((byte) 44);
        class243.field3469.method3590((byte) -112);
        class236.field3389.method1598((byte) 47);
        class750.method4162((byte) -48);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method2684(int arg0) {
        field6312 = null;
        if (arg0 != 10) {
            field6312 = null;
        }
    }
}
