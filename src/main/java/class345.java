import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class345 {

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Z")
    public static boolean field5103 = false;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IJ)V")
    public static final void method2141(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 >= -38) {
                method2142(96, (byte) -61);
            }
        } catch (InterruptedException var3) {
        }
        field5104++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V")
    public static final void method2142(int arg0, byte arg1) {
        field5102++;
        if (arg1 != 111) {
            field5103 = true;
        }
        class489 var2 = class704.method3942(arg0, 3, 0);
        var2.method2799(-94);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5106++;
        if (~arg7 > arg1 || arg0 < 1 || arg7 > (class72.field1144 - 2) || class668.field9444 - 2 < arg0) {
            return;
        }
        int var9 = arg8;
        if (arg8 < 3 && class125.method898(97, arg7, arg0)) {
            var9 = arg8 + 1;
        }
        if (!class335.field4872.method3439(class62.field996, false) && !class257.method1538(109, arg0, class432.field6276, arg7, var9)) {
            return;
        }
        if (class603.field8695 == null) {
            return;
        }
        class619.field8968.method588(arg7, class629.field9104[arg8], (byte) 79, class332.field4821, arg8, arg6, arg0);
        if (arg5 < 0) {
            return;
        }
        boolean var10 = class335.field4872.field9480;
        class335.field4872.field9480 = true;
        class619.field8968.method593(class332.field4821, arg8, arg7, arg2, var9, (byte) -128, arg4, arg0, class629.field9104[arg8], arg5, arg3);
        class335.field4872.field9480 = var10;
        return;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
    public static final void method2144(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
        class356.field5267 = class503.field7110.method669() > 0;
        class476.field6821 = arg15;
        class361.field5293 = arg1 >> class125.field1831;
        class545.field8045 = arg3 >> class125.field1831;
        class653.field9353 = arg1;
        class46.field717 = arg3;
        class36.field559 = arg2;
        class617.field8900 = class361.field5293 - class176.field2466;
        if (class617.field8900 < 0) {
            class330.field4794 = -class617.field8900;
            class617.field8900 = 0;
        } else {
            class330.field4794 = 0;
        }
        class181.field2501 = class545.field8045 - class176.field2466;
        if (class181.field2501 < 0) {
            class23.field432 = -class181.field2501;
            class181.field2501 = 0;
        } else {
            class23.field432 = 0;
        }
        class656.field9373 = class361.field5293 + class176.field2466;
        if (class656.field9373 > class91.field1390) {
            class656.field9373 = class91.field1390;
        }
        class489.field6953 = class545.field8045 + class176.field2466;
        if (class489.field6953 > class575.field8372) {
            class489.field6953 = class575.field8372;
        }
        boolean[][] var16 = class406.field6066;
        boolean[][] var17 = class501.field7093;
        if (class476.field6821) {
            for (int var18 = 0; var18 < class176.field2466 + class176.field2466 + 2; var18++) {
                for (int var21 = 0; var21 < class176.field2466 + class176.field2466 + 2; var21++) {
                    int var22 = class361.field5293 + var18 - class176.field2466;
                    int var23 = class545.field8045 + var21 - class176.field2466;
                    if (var22 >= 0 && var23 >= 0 && var22 < class91.field1390 && var23 < class575.field8372) {
                        int var24 = var22 << class125.field1831;
                        int var25 = var23 << class125.field1831;
                        int var26 = class262.field3404[class262.field3404.length - 1].method3822(var23, var22, 0) - (0x3E8 << class125.field1831 - 7);
                        int var27 = class383.field5753 == null ? class262.field3404[0].method3822(var23, var22, 0) + class263.field3412 : class383.field5753[0].method3822(var23, var22, 0) + class263.field3412;
                        class501.field7093[var18][var21] = class503.field7110.method637(var24, var26, var25, var24, var27, var25);
                    } else {
                        class501.field7093[var18][var21] = false;
                    }
                }
            }
            for (int var19 = 0; var19 < class176.field2466 + class176.field2466 + 1; var19++) {
                for (int var20 = 0; var20 < class176.field2466 + class176.field2466 + 1; var20++) {
                    class406.field6066[var19][var20] = class501.field7093[var19][var20] || class501.field7093[var19 + 1][var20] || class501.field7093[var19][var20 + 1] || class501.field7093[var19 + 1][var20 + 1];
                }
            }
            class474.field6809 = arg5;
            class236.field3109 = arg6;
            class501.field7089 = arg7;
            class486.field6916 = arg8;
            class280.field3709 = arg9;
            class41.method236(0, arg10, class503.field7110);
        } else {
            if (class313.field4592 == null) {
                class313.field4592 = new boolean[class91.field1390 + class91.field1390 + 1][class91.field1390 + class575.field8372 + 1];
                for (int var28 = 0; var28 < class313.field4592.length; var28++) {
                    for (int var29 = 0; var29 < class313.field4592[0].length; var29++) {
                        class313.field4592[var28][var29] = true;
                    }
                }
            }
            class501.field7093 = class313.field4592;
            class406.field6066 = class313.field4592;
            class617.field8900 = 0;
            class181.field2501 = 0;
            class656.field9373 = class91.field1390;
            class489.field6953 = class575.field8372;
            class231.field3064 = 0;
        }
        class321.method1988(class503.field7110, 21151);
        for (class218 var30 = (class218) class604.field8729.method2370(-26173); var30 != null; var30 = (class218) class604.field8729.method2369((byte) 122)) {
            var30.method300((byte) 61);
            class561.method3248(var30, -120);
        }
        if (class356.field5267) {
            for (int var31 = 0; var31 < class291.field4276; var31++) {
                class324.field4707[var31].method2717((byte) -74, arg14, arg0);
            }
        }
        if (class96.field1479) {
            class517.field7266 = class503.field7110.method625();
            class503.field7110.method628(class70.field1092);
            int var32 = (class70.field1092[2] - class70.field1092[0]) / class346.field5108;
            for (int var33 = 0; var33 < class346.field5108 - 1; var33++) {
                class347.field5150[var33] = (var33 + 1) * var32 + class6.field207[var33];
            }
            for (int var34 = 0; var34 < class466.field6718.length; var34++) {
                class466.field6718[var34].method3953();
            }
        }
        if (class591.field8590 != null) {
            if (class96.field1479) {
                class139.method981(0);
            }
            class243.method1491(true);
            class503.field7110.method680(-1, 1583160, 40, 127);
            class315.method1964(true, arg4, arg10, arg11);
            if (class96.field1479) {
                class237.method1464();
            }
            class503.field7110.method647();
            class243.method1491(false);
        }
        class315.method1964(false, arg4, arg10, arg11);
        if (class96.field1479) {
            for (int var35 = 0; var35 < class555.field8157; var35++) {
                class297.field4370[var35] = class60.field964[var35];
            }
            class139.method981(0);
            for (int var36 = 0; var36 < class466.field6718.length; var36++) {
                class466.field6718[var36].method3953();
            }
        }
        if (class96.field1479) {
            class237.method1464();
            for (int var37 = 0; var37 < class555.field8157; var37++) {
                class60.field964[var37] = class297.field4370[var37];
            }
            if (class281.field3735 == 2) {
                int var10002;
                if (class102.field1529[0] < class102.field1529[1]) {
                    if (class6.field207[0] + class347.field5150[0] > class70.field1092[0]) {
                        var10002 = class6.field207[0]++;
                    }
                } else if (class102.field1529[0] > class102.field1529[1] && class6.field207[0] + class347.field5150[0] < class70.field1092[2]) {
                    var10002 = class6.field207[0]--;
                }
            }
        }
        if (!class476.field6821) {
            class406.field6066 = var16;
            class501.field7093 = var17;
        }
        class641.method3654();
    }
}
