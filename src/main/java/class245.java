import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class245 {

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lqi;")
    private static class406 field3551 = new class406(16);

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[S")
    private static short[] field3558 = new short[1];

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[B")
    private static byte[] field3559 = new byte[1];

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field3561 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field3564 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lam;")
    public static class455 field3560 = new class455();

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "F")
    public static float field3555;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "F")
    public static float field3556;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lce;")
    public static class206 field3553;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lvk;")
    public static class252 field3548;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "Lku;")
    public static class259 field3562;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Lrp;")
    public static class305 field3550;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lti;")
    public static class309 field3547;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Luf;")
    public static class316 field3552;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "Lqi;")
    private static class406 field3583;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Ldq;")
    private static class501 field3549;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Lpv;")
    private static class52 field3546;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Loi;")
    public static class53 field3554;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "[B")
    private static byte[] field3569;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "[B")
    private static byte[] field3570;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "[B")
    private static byte[] field3575;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "[B")
    private static byte[] field3578;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "[B")
    private static byte[] field3584;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "[I")
    private static int[] field3565;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "[S")
    private static short[] field3576;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "[S")
    private static short[] field3580;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[[[B")
    public static byte[][][] field3557;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "[[[Ldv;")
    private static class477[][][] field3567;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lti;", line = 5)
    public static final class309 method1536(int arg0, int arg1) {
        for (class309 var2 = (class309) field3551.method2414((byte) -127); var2 != null; var2 = (class309) field3551.method2410((byte) 126)) {
            if (var2.field4509 && var2.method1874(arg1, arg0, 41)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)Lmq;", line = 18)
    public static final class358 method1537(int arg0, int arg1) {
        class358 var2 = new class358();
        for (class309 var3 = (class309) field3551.method2414((byte) -128); var3 != null; var3 = (class309) field3551.method2410((byte) 112)) {
            if (var3.field4509 && var3.method1874(arg1, arg0, 60)) {
                var2.method2118(var3, true);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V", line = 34)
    public static final void method1538() {
        field3570 = new byte[field3582 * field3571];
        field3578 = new byte[field3582 * field3571];
        field3584 = new byte[field3582 * field3571];
        field3576 = new short[field3582 * field3571];
        field3569 = new byte[field3582 * field3571];
        field3583 = new class406(1024);
        field3567 = new class477[3][field3582 >> 6][field3571 >> 6];
        field3565 = new int[field3546.field632 + 1];
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;IIII)V", line = 45)
    private static final void method1539(class290 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field3577 - field3572;
        int var6 = field3581 - field3579;
        if (field3577 < field3582) {
            var5++;
        }
        if (field3581 < field3571) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field3566;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field3566;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field3572 + var7;
                if (var52 >= 0 && var52 < field3582) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field3568 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field3568 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field3579 + var53;
                            int var58 = field3582 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field3571) {
                                var59 = (field3575[var58] & 0xFF) << 16 | field3580[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field3578[var58] & 0xFF;
                                var61 = field3576[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field3547.field4493 != -1) {
                                    var62 = field3547.field4493 | 0xFF000000;
                                } else if ((field3581 + var53 & 0x4) == (field3572 + var7 & 0x4)) {
                                    var62 = field3565[field3546.field640 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method325(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1549(arg0, var49, var54, var51, var56, var59, var60, field3584[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class448 var63 = (class448) field3583.method2405((long) (var52 << 16 | var57), -58);
                                if (var63 != null) {
                                    method1549(arg0, var49, var54, var51, var56, var59, var60, field3584[var58], var63.field6242, var63.field6241, true);
                                }
                            } else {
                                field3558[0] = (short) (var61 - 1);
                                field3559[0] = field3569[var58];
                                method1549(arg0, var49, var54, var51, var56, var59, var60, field3584[var58], field3558, field3559, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field3568 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field3568 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field3547.field4493 != -1) {
                            var68 = field3547.field4493 | 0xFF000000;
                        } else if ((field3581 + var64 & 0x4) == (field3572 + var7 & 0x4)) {
                            var68 = field3565[field3546.field640 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method325(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field3566;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field3566;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field3572 + var8;
                if (var41 >= 0 && var41 < field3582) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field3568 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field3568 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field3579 + var42;
                            if (var46 >= 0 && var46 < field3571) {
                                int var47 = field3576[field3582 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1548(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class448 var48 = (class448) field3583.method2405((long) (var41 << 16 | var46), -69);
                                    if (var48 != null) {
                                        method1548(arg0, var38, var43, var40, var45, var48.field6242, var48.field6241);
                                    }
                                } else {
                                    field3558[0] = (short) (var47 - 1);
                                    field3559[0] = field3569[field3582 * var46 + var41];
                                    method1548(arg0, var38, var43, var40, var45, field3558, field3559);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field3572 >> 6;
        int var10 = field3579 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field3577 >> 6;
        int var12 = field3581 >> 6;
        if (var11 >= field3567[0].length) {
            var11 = field3567[0].length - 1;
        }
        if (var12 >= field3567[0][0].length) {
            var12 = field3567[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class477 var28 = field3567[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field3574 >> 6) + var14) * 64;
                        int var30 = ((field3586 >> 6) + var27) * 64;
                        for (class128 var31 = (class128) var28.method2748(2); var31 != null; var31 = (class128) var28.method2751(-16195)) {
                            int var32 = var31.field1718 + var29 - field3574 - field3572;
                            int var33 = var31.field1716 + var30 - field3586 - field3579;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field3566;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field3566;
                            int var36 = field3568 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field3568 - (arg2 * var33 + arg4 >> 16);
                            method1549(arg0, var34, var36, var35 - var34, var37 - var36, var31.field1720, var31.field1714 & 0xFF, var31.field1717, var31.field1715, var31.field1719, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class477 var17 = field3567[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field3574 >> 6) + var15) * 64;
                        int var19 = ((field3586 >> 6) + var16) * 64;
                        for (class128 var20 = (class128) var17.method2748(2); var20 != null; var20 = (class128) var17.method2751(-16195)) {
                            int var21 = var20.field1718 + var18 - field3574 - field3572;
                            int var22 = var20.field1716 + var19 - field3586 - field3579;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field3566;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field3566;
                            int var25 = field3568 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field3568 - (arg2 * var22 + arg4 >> 16);
                            method1548(arg0, var23, var25, var24 - var23, var26 - var25, var20.field1715, var20.field1719);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Lti;", line = 387)
    public static final class309 method1540(int arg0) {
        return (class309) field3551.method2405((long) arg0, -96);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;II)V", line = 391)
    public static final void method1541(class290 arg0, int arg1, int arg2) {
        class403 var3 = new class403(field3554.method418(10701, field3547.field4492, "area"));
        int var4 = var3.method2357((byte) 125);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2357((byte) 124);
        }
        int var7 = var3.method2357((byte) 105);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2357((byte) 117);
        }
        while (true) {
            while (var3.field5665 < var3.field5663.length) {
                if (var3.method2357((byte) 127) == 0) {
                    int var22 = var3.method2357((byte) 111);
                    int var23 = var3.method2357((byte) 127);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field3574;
                            int var27 = var23 * 64 + var25 - field3586;
                            method1555(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2357((byte) 111);
                    int var29 = var3.method2357((byte) 123);
                    int var30 = var3.method2357((byte) 120);
                    int var31 = var3.method2357((byte) 106);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field3574;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field3586;
                            method1555(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field3575 = new byte[field3582 * field3571];
            field3580 = new short[field3582 * field3571];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field3582 * field3571];
                for (int var13 = 0; var13 < field3567[var11].length; var13++) {
                    for (int var19 = 0; var19 < field3567[var11][0].length; var19++) {
                        class477 var20 = field3567[var11][var13][var19];
                        if (var20 != null) {
                            for (class128 var21 = (class128) var20.method2748(2); var21 != null; var21 = (class128) var20.method2751(-16195)) {
                                var12[(var19 * 64 + var21.field1716) * field3582 + var13 * 64 + var21.field1718] = (byte) var21.field1720;
                            }
                        }
                    }
                }
                method1544(var12, field3575, field3580, arg1, arg2);
                for (int var14 = 0; var14 < field3567[var11].length; var14++) {
                    for (int var15 = 0; var15 < field3567[var11][0].length; var15++) {
                        class477 var16 = field3567[var11][var14][var15];
                        if (var16 != null) {
                            for (class128 var17 = (class128) var16.method2748(2); var17 != null; var17 = (class128) var16.method2751(-16195)) {
                                int var18 = (var15 * 64 + var17.field1716) * field3582 + var14 * 64 + var17.field1718;
                                var17.field1720 = (field3575[var18] & 0xFF) << 16 | field3580[var18] & 0xFFFF;
                                if (var17.field1720 != 0) {
                                    var17.field1720 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1544(field3570, field3575, field3580, arg1, arg2);
            field3570 = null;
            method1542();
            return;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()V", line = 574)
    private static final void method1542() {
        for (int var0 = 0; var0 < field3582; var0++) {
            for (int var11 = 0; var11 < field3571; var11++) {
                int var12 = field3576[field3582 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class448 var13 = (class448) field3583.method2405((long) (var0 << 16 | var11), -44);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field6242.length; var14++) {
                                class270 var15 = field3552.method1901(50, var13.field6242[var14] & 0xFFFF);
                                int var16 = var15.field3959;
                                if (var15.field3998 != null) {
                                    class270 var17 = var15.method1704((byte) 24, field3548);
                                    if (var17 != null) {
                                        var16 = var17.field3959;
                                    }
                                }
                                if (var16 != -1) {
                                    class216 var18 = new class216(var16);
                                    var18.field3122 = var0;
                                    var18.field3121 = var11;
                                    field3560.method2657(8492, var18);
                                }
                            }
                        }
                    } else {
                        class270 var19 = field3552.method1901(50, var12 - 1);
                        int var20 = var19.field3959;
                        if (var19.field3998 != null) {
                            class270 var21 = var19.method1704((byte) 117, field3548);
                            if (var21 != null) {
                                var20 = var21.field3959;
                            }
                        }
                        if (var20 != -1) {
                            class216 var22 = new class216(var20);
                            var22.field3122 = var0;
                            var22.field3121 = var11;
                            field3560.method2657(8492, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field3567[0].length; var2++) {
                for (int var3 = 0; var3 < field3567[0][0].length; var3++) {
                    class477 var4 = field3567[var1][var2][var3];
                    if (var4 != null) {
                        for (class128 var5 = (class128) var4.method2748(2); var5 != null; var5 = (class128) var4.method2751(-16195)) {
                            if (var5.field1715 != null) {
                                for (int var6 = 0; var6 < var5.field1715.length; var6++) {
                                    class270 var7 = field3552.method1901(50, var5.field1715[var6] & 0xFFFF);
                                    int var8 = var7.field3959;
                                    if (var7.field3998 != null) {
                                        class270 var9 = var7.method1704((byte) 118, field3548);
                                        if (var9 != null) {
                                            var8 = var9.field3959;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class216 var10 = new class216(var8);
                                        var10.field3122 = ((field3574 >> 6) + var2) * 64 + var5.field1718 - field3574;
                                        var10.field3121 = ((field3586 >> 6) + var3) * 64 + var5.field1716 - field3586;
                                        field3560.method2657(8492, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;)Lam;", line = 734)
    public static final class455 method1543(class290 arg0) {
        int var1 = field3577 - field3572;
        int var2 = field3581 - field3579;
        int var3 = (field3585 - field3566 << 16) / var1;
        int var4 = (field3568 - field3573 << 16) / var2;
        return method1558(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([B[B[SII)V", line = 746)
    private static final void method1544(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field3571];
        int[] var6 = new int[field3571];
        int[] var7 = new int[field3571];
        int[] var8 = new int[field3571];
        int[] var9 = new int[field3571];
        for (int var10 = -5; var10 < field3582; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field3571; var13++) {
                int var10002;
                if (var11 < field3582) {
                    int var28 = arg0[field3582 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class168 var29 = field3549.method2912(var28 - 1, false);
                        var5[var13] += var29.field2447;
                        var6[var13] += var29.field2442;
                        var7[var13] += var29.field2438;
                        var8[var13] += var29.field2452;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field3582 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class168 var31 = field3549.method2912(var30 - 1, false);
                        var5[var13] -= var31.field2447;
                        var6[var13] -= var31.field2442;
                        var7[var13] -= var31.field2438;
                        var8[var13] -= var31.field2452;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field3571; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field3571) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field3582 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field3582 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class158.method1014(var14 * 256 / var17, var15 / var18, (byte) 124, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field3582 * var19 + var10;
                            int var27 = class538.field7872[class517.method3068((byte) -4, class43.method250(89, var25, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ll;II)V", line = 891)
    public static final void method1545(class16 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field3546.field632; var3++) {
            field3565[var3 + 1] = method1552(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;Lfp;IIII)V", line = 901)
    private static final void method1546(class290 arg0, class216 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3127 = ((arg1.field3122 - field3572) * arg2 + arg4 >> 16) + field3566;
        arg1.field3130 = field3568 - ((arg1.field3121 - field3579) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "()V", line = 906)
    public static final void method1547() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field3562.field3839; var1++) {
            boolean var2 = field3547.method1872(field3562.field3837[var1] & 0x3FFF, field3562.field3837[var1] >> 28 & 0x3, var0, 0, field3562.field3837[var1] >> 14 & 0x3FFF);
            if (var2) {
                class216 var3 = new class216(field3562.field3840[var1]);
                var3.field3122 = var0[1] - field3574;
                var3.field3121 = var0[2] - field3586;
                field3560.method2657(8492, var3);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;IIII[S[B)V", line = 927)
    private static final void method1548(class290 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class270 var8 = field3552.method1901(50, arg5[var7] & 0xFFFF);
            int var9 = var8.field3985;
            if (var9 != -1) {
                class326 var10 = field3550.method1856((byte) -79, var9);
                class24 var11 = var10.method1965(var8.field3990 ? var8.field3964 : false, 874, arg0, var8.field3993 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method145() >> 2;
                    int var13 = arg4 * var11.method157() >> 2;
                    if (var10.field4762) {
                        int var14 = var8.field3937;
                        int var15 = var8.field4012;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4759 == 0) {
                            var11.method150(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method162(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field4759 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;IIIIIII[S[BZ)V", line = 985)
    private static final void method1549(class290 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method325(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field3565[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method325(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class149.method929(arg3, var11, arg2, arg5, arg7 >> 6 & 0x3, -111, arg4, arg0, var12, field3557, field3563, arg1, field3565[arg6]);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class270 var18 = field3552.method1901(50, arg8[var16] & 0xFFFF);
                if (var18.field3985 == -1) {
                    int var19 = -3355444;
                    if (var18.field3957 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method376(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method387(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method376(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method387(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method376(arg1, arg2, arg4, -1, 0);
                            arg0.method387(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method376(var14, arg2, arg4, -1, 0);
                            arg0.method387(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method376(var14, arg2, arg4, -1, 0);
                            arg0.method387(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method376(arg1, arg2, arg4, -1, 0);
                            arg0.method387(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method387(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method387(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method387(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method387(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method387(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method387(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "()V", line = 1148)
    public static void method1550() {
        field3546 = null;
        field3549 = null;
        field3552 = null;
        field3553 = null;
        field3550 = null;
        field3548 = null;
        field3547 = null;
        field3554 = null;
        field3551 = null;
        field3557 = null;
        field3558 = null;
        field3559 = null;
        field3562 = null;
        field3560 = null;
        field3565 = null;
        field3570 = null;
        field3575 = null;
        field3580 = null;
        field3578 = null;
        field3584 = null;
        field3576 = null;
        field3569 = null;
        field3583 = null;
        field3567 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII)V", line = 1174)
    public static final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3572 = arg0 - field3574;
        field3581 = arg1 - field3586;
        field3577 = arg2 - field3574;
        field3579 = arg3 - field3586;
        field3566 = arg4;
        field3573 = arg5;
        field3585 = arg6;
        field3568 = arg7;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ll;III)I", line = 1185)
    private static final int method1552(class16 arg0, int arg1, int arg2, int arg3) {
        class105 var4 = field3546.method415((byte) -32, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1385;
        if (var5 >= 0 && arg0.method83(var5, 70).field3199) {
            var5 = -1;
        }
        int var9;
        if (var4.field1381 >= 0) {
            int var6 = var4.field1381;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class538.field7872[class517.method3068((byte) -4, class189.method1203(var8, -2, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class538.field7872[class517.method3068((byte) -4, class189.method1203(arg0.method83(var5, 125).field3204, -2, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1377 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1377;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class538.field7872[class517.method3068((byte) -4, class189.method1203(var12, -2, 96)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lza;)V", line = 1245)
    public static final void method1553(class290 arg0) {
        int var1 = field3577 - field3572;
        int var2 = field3581 - field3579;
        int var3 = (field3585 - field3566 << 16) / var1;
        int var4 = (field3568 - field3573 << 16) / var2;
        method1539(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 1255)
    public static final void method1554(int arg0) {
        field3547 = (class309) field3551.method2405((long) arg0, -61);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lza;Lwm;IIII[I[I)V", line = 1259)
    private static final void method1555(class290 arg0, class403 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2357((byte) 127);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2357((byte) 117);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field3570[field3582 * arg5 + arg4] = (byte) var11;
                    field3578[field3582 * arg5 + arg4] = 0;
                } else {
                    field3578[field3582 * arg5 + arg4] = (byte) var11;
                    field3584[field3582 * arg5 + arg4] = 0;
                    field3570[field3582 * arg5 + arg4] = arg1.method2359(-3);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2357((byte) 127);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2357((byte) 115);
                var18 = arg1.method2357((byte) 125);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2357((byte) 127);
            }
            if (var15 == 0) {
                field3570[field3582 * arg5 + arg4] = (byte) var16;
                field3578[field3582 * arg5 + arg4] = (byte) var17;
                field3584[field3582 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field3576[field3582 * arg5 + arg4] = (short) (arg1.method2338(0) + 1);
                    field3569[field3582 * arg5 + arg4] = arg1.method2359(53);
                } else if (var19 > 1) {
                    field3576[field3582 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2338(0);
                        var21[var22] = arg1.method2359(-108);
                    }
                    field3583.method2413((long) (arg4 << 16 | arg5), new class448(var20, var21), -1);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2338(0);
                        var24[var25] = arg1.method2359(109);
                    }
                }
                if (field3567[var15 - 1][arg2 - (field3574 >> 6)][arg3 - (field3586 >> 6)] == null) {
                    field3567[var15 - 1][arg2 - (field3574 >> 6)][arg3 - (field3586 >> 6)] = new class477();
                }
                class128 var26 = new class128(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field3567[var15 - 1][arg2 - (field3574 >> 6)][arg3 - (field3586 >> 6)].method2753(4, var26);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "()V", line = 1393)
    public static final void method1556() {
        field3570 = null;
        field3575 = null;
        field3580 = null;
        field3578 = null;
        field3584 = null;
        field3576 = null;
        field3569 = null;
        field3583 = null;
        field3567 = null;
        field3565 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Loi;Lpv;Ldq;Luf;Lce;Lrp;Lvk;)V", line = 1405)
    public static final void method1557(class53 arg0, class52 arg1, class501 arg2, class316 arg3, class206 arg4, class305 arg5, class252 arg6) {
        field3554 = arg0;
        field3546 = arg1;
        field3549 = arg2;
        field3552 = arg3;
        field3553 = arg4;
        field3550 = arg5;
        field3548 = arg6;
        field3551.method2408(102);
        int var7 = field3554.method429("details", -1);
        int[] var8 = field3554.method419(true, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class309 var10 = class432.method2554(var8[var9], field3554, 27374, var7);
                field3551.method2413((long) var10.field4512, var10, -1);
            }
        }
        class108.method737(false, true, (byte) -101);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lza;IIII)Lam;", line = 1444)
    private static final class455 method1558(class290 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class216 var5 = (class216) field3560.method2655(15152); var5 != null; var5 = (class216) field3560.method2660((byte) 67)) {
            method1546(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field3560;
    }
}
