import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class672 {

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "Lwh;")
    private static class546 field9550 = new class546(16);

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "[B")
    private static byte[] field9561 = new byte[1];

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "[S")
    private static short[] field9564 = new short[1];

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
    public static int field9566 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field9565 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "Lwo;")
    public static class445 field9563 = new class445();

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "F")
    public static float field9558;

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "F")
    public static float field9562;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
    public static int field9559;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!lw", name = "A", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!lw", name = "B", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!lw", name = "Q", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "Lcq;")
    private static class107 field9556;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "Lkaa;")
    public static class166 field9552;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "Llp;")
    private static class202 field9553;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "Lsfa;")
    public static class289 field9548;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "Lga;")
    public static class332 field9551;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "Lml;")
    public static class36 field9549;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "Lcf;")
    public static class377 field9554;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "Lwh;")
    private static class546 field9568;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "Loca;")
    public static class592 field9557;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "Lmg;")
    public static class695 field9555;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "[B")
    private static byte[] field9570;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "[B")
    private static byte[] field9573;

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "[B")
    private static byte[] field9579;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "[B")
    private static byte[] field9580;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "[B")
    private static byte[] field9582;

    @OriginalMember(owner = "client!lw", name = "R", descriptor = "[I")
    private static int[] field9588;

    @OriginalMember(owner = "client!lw", name = "D", descriptor = "[S")
    private static short[] field9577;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "[S")
    private static short[] field9581;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "[[[B")
    public static byte[][][] field9560;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "[[[Lvu;")
    private static class204[][][] field9583;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "()V")
    public static final void method3815() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field9557.field8161; var1++) {
            boolean var2 = field9548.method1713(field9557.field8156[var1] & 0x3FFF, var0, field9557.field8156[var1] >> 14 & 0x3FFF, field9557.field8156[var1] >> 28 & 0x3, (byte) 126);
            if (var2) {
                class694 var3 = new class694(field9557.field8163[var1]);
                var3.field9789 = var0[1] - field9567;
                var3.field9784 = var0[2] - field9587;
                field9563.method2507(var3, (byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;)V")
    public static final void method3816(class562 arg0) {
        int var1 = field9572 - field9584;
        int var2 = field9585 - field9574;
        int var3 = (field9576 - field9575 << 16) / var1;
        int var4 = (field9578 - field9569 << 16) / var2;
        method3826(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;IIIIIII[S[BZ)V")
    private static final void method3817(class562 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1113(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field9588[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1113(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class549.method3073(var11, 1, arg2, arg4, arg3, arg0, var12, field9588[arg6], field9560, arg1, arg7 >> 6 & 0x3, arg5, field9559);
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
                class600 var18 = field9555.method3921(arg8[var16] & 0xFFFF, -117);
                if (var18.field8300 == -1) {
                    int var19 = -3355444;
                    if (var18.field8293 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1149(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1144(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1149(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1144(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1149(arg1, arg2, arg4, -1, 0);
                            arg0.method1144(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1149(var14, arg2, arg4, -1, 0);
                            arg0.method1144(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1149(var14, arg2, arg4, -1, 0);
                            arg0.method1144(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1149(arg1, arg2, arg4, -1, 0);
                            arg0.method1144(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1144(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1144(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1144(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1144(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1144(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1144(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
    public static final void method3818(int arg0) {
        field9548 = (class289) field9550.method3057(1, (long) arg0);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)Lsfa;")
    public static final class289 method3819(int arg0) {
        return (class289) field9550.method3057(1, (long) arg0);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "()V")
    public static final void method3820() {
        field9582 = new byte[field9586 * field9571];
        field9573 = new byte[field9586 * field9571];
        field9579 = new byte[field9586 * field9571];
        field9577 = new short[field9586 * field9571];
        field9570 = new byte[field9586 * field9571];
        field9568 = new class546(1024);
        field9583 = new class204[3][field9586 >> 6][field9571 >> 6];
        field9588 = new int[field9553.field2713 + 1];
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "()V")
    public static void method3821() {
        field9553 = null;
        field9556 = null;
        field9555 = null;
        field9554 = null;
        field9552 = null;
        field9549 = null;
        field9548 = null;
        field9551 = null;
        field9550 = null;
        field9560 = null;
        field9564 = null;
        field9561 = null;
        field9557 = null;
        field9563 = null;
        field9588 = null;
        field9582 = null;
        field9580 = null;
        field9581 = null;
        field9573 = null;
        field9579 = null;
        field9577 = null;
        field9570 = null;
        field9568 = null;
        field9583 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;II)V")
    public static final void method3822(class562 arg0, int arg1, int arg2) {
        class157 var3 = new class157(field9551.method1947(5, "area", field9548.field3814));
        int var4 = var3.method930(255);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method930(255);
        }
        int var7 = var3.method930(255);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method930(255);
        }
        while (true) {
            while (var3.field2219 < var3.field2199.length) {
                if (var3.method930(255) == 0) {
                    int var22 = var3.method930(255);
                    int var23 = var3.method930(255);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field9567;
                            int var27 = var23 * 64 + var25 - field9587;
                            method3830(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method930(255);
                    int var29 = var3.method930(255);
                    int var30 = var3.method930(255);
                    int var31 = var3.method930(255);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field9567;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field9587;
                            method3830(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field9580 = new byte[field9586 * field9571];
            field9581 = new short[field9586 * field9571];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field9586 * field9571];
                for (int var13 = 0; var13 < field9583[var11].length; var13++) {
                    for (int var19 = 0; var19 < field9583[var11][0].length; var19++) {
                        class204 var20 = field9583[var11][var13][var19];
                        if (var20 != null) {
                            for (class444 var21 = (class444) var20.method1298((byte) 40); var21 != null; var21 = (class444) var20.method1305((byte) -114)) {
                                var12[(var19 * 64 + var21.field5878) * field9586 + var13 * 64 + var21.field5879] = (byte) var21.field5876;
                            }
                        }
                    }
                }
                method3835(var12, field9580, field9581, arg1, arg2);
                for (int var14 = 0; var14 < field9583[var11].length; var14++) {
                    for (int var15 = 0; var15 < field9583[var11][0].length; var15++) {
                        class204 var16 = field9583[var11][var14][var15];
                        if (var16 != null) {
                            for (class444 var17 = (class444) var16.method1298((byte) 40); var17 != null; var17 = (class444) var16.method1305((byte) -127)) {
                                int var18 = (var15 * 64 + var17.field5878) * field9586 + var14 * 64 + var17.field5879;
                                var17.field5876 = (field9580[var18] & 0xFF) << 16 | field9581[var18] & 0xFFFF;
                                if (var17.field5876 != 0) {
                                    var17.field5876 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3835(field9582, field9580, field9581, arg1, arg2);
            field9582 = null;
            method3829();
            return;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lfa;II)V")
    public static final void method3823(class522 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field9553.field2713; var3++) {
            field9588[var3 + 1] = method3828(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;Llv;IIII)V")
    private static final void method3824(class562 arg0, class694 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field9788 = ((arg1.field9789 - field9584) * arg2 + arg4 >> 16) + field9575;
        arg1.field9782 = field9578 - ((arg1.field9784 - field9574) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Lgfa;")
    public static final class150 method3825(int arg0, int arg1) {
        class150 var2 = new class150();
        for (class289 var3 = (class289) field9550.method3053((byte) 82); var3 != null; var3 = (class289) field9550.method3056(18113)) {
            if (var3.field3813 && var3.method1716(arg0, arg1, true)) {
                var2.method879((byte) -106, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;IIII)V")
    private static final void method3826(class562 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field9572 - field9584;
        int var6 = field9585 - field9574;
        if (field9572 < field9586) {
            var5++;
        }
        if (field9585 < field9571) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field9575;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field9575;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field9584 + var7;
                if (var52 >= 0 && var52 < field9586) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field9578 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field9578 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field9574 + var53;
                            int var58 = field9586 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field9571) {
                                var59 = (field9580[var58] & 0xFF) << 16 | field9581[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field9573[var58] & 0xFF;
                                var61 = field9577[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field9548.field3822 != -1) {
                                    var62 = field9548.field3822 | 0xFF000000;
                                } else if ((field9585 + var53 & 0x4) == (field9584 + var7 & 0x4)) {
                                    var62 = field9588[field9553.field2722 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1113(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3817(arg0, var49, var54, var51, var56, var59, var60, field9579[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class357 var63 = (class357) field9568.method3057(1, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method3817(arg0, var49, var54, var51, var56, var59, var60, field9579[var58], var63.field4756, var63.field4757, true);
                                }
                            } else {
                                field9564[0] = (short) (var61 - 1);
                                field9561[0] = field9570[var58];
                                method3817(arg0, var49, var54, var51, var56, var59, var60, field9579[var58], field9564, field9561, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field9578 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field9578 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field9548.field3822 != -1) {
                            var68 = field9548.field3822 | 0xFF000000;
                        } else if ((field9585 + var64 & 0x4) == (field9584 + var7 & 0x4)) {
                            var68 = field9588[field9553.field2722 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1113(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field9575;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field9575;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field9584 + var8;
                if (var41 >= 0 && var41 < field9586) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field9578 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field9578 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field9574 + var42;
                            if (var46 >= 0 && var46 < field9571) {
                                int var47 = field9577[field9586 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3834(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class357 var48 = (class357) field9568.method3057(1, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method3834(arg0, var38, var43, var40, var45, var48.field4756, var48.field4757);
                                    }
                                } else {
                                    field9564[0] = (short) (var47 - 1);
                                    field9561[0] = field9570[field9586 * var46 + var41];
                                    method3834(arg0, var38, var43, var40, var45, field9564, field9561);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field9584 >> 6;
        int var10 = field9574 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field9572 >> 6;
        int var12 = field9585 >> 6;
        if (var11 >= field9583[0].length) {
            var11 = field9583[0].length - 1;
        }
        if (var12 >= field9583[0][0].length) {
            var12 = field9583[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class204 var28 = field9583[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field9567 >> 6) + var14) * 64;
                        int var30 = ((field9587 >> 6) + var27) * 64;
                        for (class444 var31 = (class444) var28.method1298((byte) 40); var31 != null; var31 = (class444) var28.method1305((byte) -108)) {
                            int var32 = var31.field5879 + var29 - field9567 - field9584;
                            int var33 = var31.field5878 + var30 - field9587 - field9574;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field9575;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field9575;
                            int var36 = field9578 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field9578 - (arg2 * var33 + arg4 >> 16);
                            method3817(arg0, var34, var36, var35 - var34, var37 - var36, var31.field5876, var31.field5874 & 0xFF, var31.field5880, var31.field5877, var31.field5875, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class204 var17 = field9583[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field9567 >> 6) + var15) * 64;
                        int var19 = ((field9587 >> 6) + var16) * 64;
                        for (class444 var20 = (class444) var17.method1298((byte) 40); var20 != null; var20 = (class444) var17.method1305((byte) -111)) {
                            int var21 = var20.field5879 + var18 - field9567 - field9584;
                            int var22 = var20.field5878 + var19 - field9587 - field9574;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field9575;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field9575;
                            int var25 = field9578 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field9578 - (arg2 * var22 + arg4 >> 16);
                            method3834(arg0, var23, var25, var24 - var23, var26 - var25, var20.field5877, var20.field5875);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(Lr;)Lwo;")
    public static final class445 method3827(class562 arg0) {
        int var1 = field9572 - field9584;
        int var2 = field9585 - field9574;
        int var3 = (field9576 - field9575 << 16) / var1;
        int var4 = (field9578 - field9569 << 16) / var2;
        return method3831(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lfa;III)I")
    private static final int method3828(class522 arg0, int arg1, int arg2, int arg3) {
        class425 var4 = field9553.method1290(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field5739;
        if (var5 >= 0 && arg0.method2959(87, var5).field1249) {
            var5 = -1;
        }
        int var9;
        if (var4.field5729 >= 0) {
            int var6 = var4.field5729;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class310.field4189[class227.method1412(0, class650.method3608(var8, 96, -113)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class310.field4189[class227.method1412(111, class650.method3608(arg0.method2959(88, var5).field1262, 96, -123)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field5723 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field5723;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class310.field4189[class227.method1412(123, class650.method3608(var12, 96, 122)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "()V")
    private static final void method3829() {
        for (int var0 = 0; var0 < field9586; var0++) {
            for (int var11 = 0; var11 < field9571; var11++) {
                int var12 = field9577[field9586 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class357 var13 = (class357) field9568.method3057(1, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field4756.length; var14++) {
                                class600 var15 = field9555.method3921(var13.field4756[var14] & 0xFFFF, -116);
                                int var16 = var15.field8332;
                                if (var15.field8257 != null) {
                                    class600 var17 = var15.method3324((byte) 91, field9549);
                                    if (var17 != null) {
                                        var16 = var17.field8332;
                                    }
                                }
                                if (var16 != -1) {
                                    class694 var18 = new class694(var16);
                                    var18.field9789 = var0;
                                    var18.field9784 = var11;
                                    field9563.method2507(var18, (byte) -120);
                                }
                            }
                        }
                    } else {
                        class600 var19 = field9555.method3921(var12 - 1, -84);
                        int var20 = var19.field8332;
                        if (var19.field8257 != null) {
                            class600 var21 = var19.method3324((byte) 90, field9549);
                            if (var21 != null) {
                                var20 = var21.field8332;
                            }
                        }
                        if (var20 != -1) {
                            class694 var22 = new class694(var20);
                            var22.field9789 = var0;
                            var22.field9784 = var11;
                            field9563.method2507(var22, (byte) -122);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field9583[0].length; var2++) {
                for (int var3 = 0; var3 < field9583[0][0].length; var3++) {
                    class204 var4 = field9583[var1][var2][var3];
                    if (var4 != null) {
                        for (class444 var5 = (class444) var4.method1298((byte) 40); var5 != null; var5 = (class444) var4.method1305((byte) -103)) {
                            if (var5.field5877 != null) {
                                for (int var6 = 0; var6 < var5.field5877.length; var6++) {
                                    class600 var7 = field9555.method3921(var5.field5877[var6] & 0xFFFF, -121);
                                    int var8 = var7.field8332;
                                    if (var7.field8257 != null) {
                                        class600 var9 = var7.method3324((byte) 92, field9549);
                                        if (var9 != null) {
                                            var8 = var9.field8332;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class694 var10 = new class694(var8);
                                        var10.field9789 = ((field9567 >> 6) + var2) * 64 + var5.field5879 - field9567;
                                        var10.field9784 = ((field9587 >> 6) + var3) * 64 + var5.field5878 - field9587;
                                        field9563.method2507(var10, (byte) -127);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;Lio;IIII[I[I)V")
    private static final void method3830(class562 arg0, class157 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method930(255);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method930(255);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field9582[field9586 * arg5 + arg4] = (byte) var11;
                    field9573[field9586 * arg5 + arg4] = 0;
                } else {
                    field9573[field9586 * arg5 + arg4] = (byte) var11;
                    field9579[field9586 * arg5 + arg4] = 0;
                    field9582[field9586 * arg5 + arg4] = arg1.method969(3);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method930(255);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method930(255);
                var18 = arg1.method930(255);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method930(255);
            }
            if (var15 == 0) {
                field9582[field9586 * arg5 + arg4] = (byte) var16;
                field9573[field9586 * arg5 + arg4] = (byte) var17;
                field9579[field9586 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field9577[field9586 * arg5 + arg4] = (short) (arg1.method963(-128) + 1);
                    field9570[field9586 * arg5 + arg4] = arg1.method969(3);
                } else if (var19 > 1) {
                    field9577[field9586 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method963(-127);
                        var21[var22] = arg1.method969(3);
                    }
                    field9568.method3061(127, (long) (arg4 << 16 | arg5), new class357(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method963(-121);
                        var24[var25] = arg1.method969(3);
                    }
                }
                if (field9583[var15 - 1][arg2 - (field9567 >> 6)][arg3 - (field9587 >> 6)] == null) {
                    field9583[var15 - 1][arg2 - (field9567 >> 6)][arg3 - (field9587 >> 6)] = new class204();
                }
                class444 var26 = new class444(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field9583[var15 - 1][arg2 - (field9567 >> 6)][arg3 - (field9587 >> 6)].method1300(var26, -1);
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(Lr;IIII)Lwo;")
    private static final class445 method3831(class562 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class694 var5 = (class694) field9563.method2506(68); var5 != null; var5 = (class694) field9563.method2505(-121)) {
            method3824(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field9563;
    }

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "()V")
    public static final void method3832() {
        field9582 = null;
        field9580 = null;
        field9581 = null;
        field9573 = null;
        field9579 = null;
        field9577 = null;
        field9570 = null;
        field9568 = null;
        field9583 = null;
        field9588 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lga;Llp;Lcq;Lmg;Lcf;Lkaa;Lml;)V")
    public static final void method3833(class332 arg0, class202 arg1, class107 arg2, class695 arg3, class377 arg4, class166 arg5, class36 arg6) {
        field9551 = arg0;
        field9553 = arg1;
        field9556 = arg2;
        field9555 = arg3;
        field9554 = arg4;
        field9552 = arg5;
        field9549 = arg6;
        field9550.method3063((byte) 88);
        int var7 = field9551.method1959(5743, "details");
        int[] var8 = field9551.method1954(0, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class289 var10 = class600.method3328(-2, field9551, var7, var8[var9]);
                field9550.method3061(123, (long) var10.field3812, var10);
            }
        }
        class413.method2341(-93, false, true);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;IIII[S[B)V")
    private static final void method3834(class562 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class600 var8 = field9555.method3921(arg5[var7] & 0xFFFF, -85);
            int var9 = var8.field8300;
            if (var9 != -1) {
                class55 var10 = field9552.method1013(var9, (byte) 125);
                class532 var11 = var10.method326(var8.field8258 ? var8.field8272 : false, var8.field8352 ? arg6[var7] >> 6 & 0x3 : 0, arg0, 262144);
                if (var11 != null) {
                    int var12 = arg3 * var11.method523() >> 2;
                    int var13 = arg4 * var11.method532() >> 2;
                    if (var10.field718) {
                        int var14 = var8.field8290;
                        int var15 = var8.field8343;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field722 == 0) {
                            var11.method2993(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method2991(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field722 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "([B[B[SII)V")
    private static final void method3835(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field9571];
        int[] var6 = new int[field9571];
        int[] var7 = new int[field9571];
        int[] var8 = new int[field9571];
        int[] var9 = new int[field9571];
        for (int var10 = -5; var10 < field9586; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field9571; var13++) {
                int var10002;
                if (var11 < field9586) {
                    int var28 = arg0[field9586 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class263 var29 = field9556.method587(var28 - 1, 1);
                        var5[var13] += var29.field3428;
                        var6[var13] += var29.field3423;
                        var7[var13] += var29.field3435;
                        var8[var13] += var29.field3426;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field9586 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class263 var31 = field9556.method587(var30 - 1, 1);
                        var5[var13] -= var31.field3428;
                        var6[var13] -= var31.field3423;
                        var7[var13] -= var31.field3435;
                        var8[var13] -= var31.field3426;
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
                for (int var19 = -5; var19 < field9571; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field9571) {
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
                        if ((arg0[field9586 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field9586 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class606.method3371(var16 / var18, var15 / var18, var14 * 256 / var17, (byte) -77);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field9586 * var19 + var10;
                            int var27 = class310.field4189[class227.method1412(108, class49.method262(128, var25, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)Lsfa;")
    public static final class289 method3836(int arg0, int arg1) {
        for (class289 var2 = (class289) field9550.method3053((byte) 110); var2 != null; var2 = (class289) field9550.method3056(18113)) {
            if (var2.field3813 && var2.method1716(arg0, arg1, true)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9584 = arg0 - field9567;
        field9585 = arg1 - field9587;
        field9572 = arg2 - field9567;
        field9574 = arg3 - field9587;
        field9575 = arg4;
        field9569 = arg5;
        field9576 = arg6;
        field9578 = arg7;
    }
}
