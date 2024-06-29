import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class161 {

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "Lmo;")
    private static class482 field2610 = new class482(16);

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "[B")
    private static byte[] field2615 = new byte[1];

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "[S")
    private static short[] field2618 = new short[1];

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
    public static int field2620 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "I")
    public static int field2619 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "Lau;")
    public static class692 field2621 = new class692();

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "F")
    public static float field2614;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "F")
    public static float field2616;

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!waa", name = "u", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!waa", name = "x", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!waa", name = "C", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!waa", name = "F", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!waa", name = "H", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!waa", name = "I", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!waa", name = "J", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!waa", name = "L", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!waa", name = "N", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!waa", name = "O", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "Lbs;")
    public static class149 field2612;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "Lok;")
    public static class229 field2604;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "Lus;")
    private static class308 field2606;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "Lvo;")
    public static class345 field2608;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "Lqba;")
    public static class369 field2607;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "Lof;")
    public static class429 field2611;

    @OriginalMember(owner = "client!waa", name = "K", descriptor = "Lmo;")
    private static class482 field2639;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "Lrw;")
    public static class485 field2603;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "Lgda;")
    public static class486 field2609;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "Lud;")
    private static class86 field2605;

    @OriginalMember(owner = "client!waa", name = "v", descriptor = "[B")
    private static byte[] field2624;

    @OriginalMember(owner = "client!waa", name = "w", descriptor = "[B")
    private static byte[] field2625;

    @OriginalMember(owner = "client!waa", name = "y", descriptor = "[B")
    private static byte[] field2627;

    @OriginalMember(owner = "client!waa", name = "D", descriptor = "[B")
    private static byte[] field2632;

    @OriginalMember(owner = "client!waa", name = "G", descriptor = "[B")
    private static byte[] field2635;

    @OriginalMember(owner = "client!waa", name = "A", descriptor = "[I")
    private static int[] field2629;

    @OriginalMember(owner = "client!waa", name = "B", descriptor = "[S")
    private static short[] field2630;

    @OriginalMember(owner = "client!waa", name = "E", descriptor = "[S")
    private static short[] field2633;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "[[[B")
    public static byte[][][] field2613;

    @OriginalMember(owner = "client!waa", name = "M", descriptor = "[[[Liv;")
    private static class565[][][] field2641;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "()V")
    private static final void method1205() {
        for (int var0 = 0; var0 < field2640; var0++) {
            for (int var11 = 0; var11 < field2631; var11++) {
                int var12 = field2630[field2640 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class279 var13 = (class279) field2639.method2818(-22803, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field3941.length; var14++) {
                                class119 var15 = field2603.method2834(0, var13.field3941[var14] & 0xFFFF);
                                int var16 = var15.field1893;
                                if (var15.field1924 != null) {
                                    class119 var17 = var15.method969(field2611, 92);
                                    if (var17 != null) {
                                        var16 = var17.field1893;
                                    }
                                }
                                if (var16 != -1) {
                                    class66 var18 = new class66(var16);
                                    var18.field951 = var0;
                                    var18.field952 = var11;
                                    field2621.method3904(var18, 0);
                                }
                            }
                        }
                    } else {
                        class119 var19 = field2603.method2834(0, var12 - 1);
                        int var20 = var19.field1893;
                        if (var19.field1924 != null) {
                            class119 var21 = var19.method969(field2611, 92);
                            if (var21 != null) {
                                var20 = var21.field1893;
                            }
                        }
                        if (var20 != -1) {
                            class66 var22 = new class66(var20);
                            var22.field951 = var0;
                            var22.field952 = var11;
                            field2621.method3904(var22, 0);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field2641[0].length; var2++) {
                for (int var3 = 0; var3 < field2641[0][0].length; var3++) {
                    class565 var4 = field2641[var1][var2][var3];
                    if (var4 != null) {
                        for (class422 var5 = (class422) var4.method3313((byte) -28); var5 != null; var5 = (class422) var4.method3308(-91)) {
                            if (var5.field6023 != null) {
                                for (int var6 = 0; var6 < var5.field6023.length; var6++) {
                                    class119 var7 = field2603.method2834(0, var5.field6023[var6] & 0xFFFF);
                                    int var8 = var7.field1893;
                                    if (var7.field1924 != null) {
                                        class119 var9 = var7.method969(field2611, 92);
                                        if (var9 != null) {
                                            var8 = var9.field1893;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class66 var10 = new class66(var8);
                                        var10.field951 = ((field2628 >> 6) + var2) * 64 + var5.field6022 - field2628;
                                        var10.field952 = ((field2636 >> 6) + var3) * 64 + var5.field6019 - field2636;
                                        field2621.method3904(var10, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lfa;II)V")
    public static final void method1206(class615 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field2605.field1288; var3++) {
            field2629[var3 + 1] = method1217(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "()V")
    public static final void method1207() {
        field2624 = new byte[field2640 * field2631];
        field2635 = new byte[field2640 * field2631];
        field2625 = new byte[field2640 * field2631];
        field2630 = new short[field2640 * field2631];
        field2627 = new byte[field2640 * field2631];
        field2639 = new class482(1024);
        field2641 = new class565[3][field2640 >> 6][field2631 >> 6];
        field2629 = new int[field2605.field1288 + 1];
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;)V")
    public static final void method1208(class98 arg0) {
        int var1 = field2634 - field2643;
        int var2 = field2638 - field2623;
        int var3 = (field2626 - field2637 << 16) / var1;
        int var4 = (field2642 - field2622 << 16) / var2;
        method1222(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)Lqba;")
    public static final class369 method1209(int arg0) {
        return (class369) field2610.method2818(-22803, (long) arg0);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2643 = arg0 - field2628;
        field2638 = arg1 - field2636;
        field2634 = arg2 - field2628;
        field2623 = arg3 - field2636;
        field2637 = arg4;
        field2622 = arg5;
        field2626 = arg6;
        field2642 = arg7;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;Lek;IIII[I[I)V")
    private static final void method1211(class98 arg0, class465 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2705(-53);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2705(-22);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field2624[field2640 * arg5 + arg4] = (byte) var11;
                    field2635[field2640 * arg5 + arg4] = 0;
                } else {
                    field2635[field2640 * arg5 + arg4] = (byte) var11;
                    field2625[field2640 * arg5 + arg4] = 0;
                    field2624[field2640 * arg5 + arg4] = arg1.method2712(-80);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2705(-54);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2705(-28);
                var18 = arg1.method2705(-99);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2705(-104);
            }
            if (var15 == 0) {
                field2624[field2640 * arg5 + arg4] = (byte) var16;
                field2635[field2640 * arg5 + arg4] = (byte) var17;
                field2625[field2640 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field2630[field2640 * arg5 + arg4] = (short) (arg1.method2755((byte) -47) + 1);
                    field2627[field2640 * arg5 + arg4] = arg1.method2712(-80);
                } else if (var19 > 1) {
                    field2630[field2640 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2755((byte) -56);
                        var21[var22] = arg1.method2712(-115);
                    }
                    field2639.method2816(new class279(var20, var21), (long) (arg4 << 16 | arg5), false);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2755((byte) -43);
                        var24[var25] = arg1.method2712(-120);
                    }
                }
                if (field2641[var15 - 1][arg2 - (field2628 >> 6)][arg3 - (field2636 >> 6)] == null) {
                    field2641[var15 - 1][arg2 - (field2628 >> 6)][arg3 - (field2636 >> 6)] = new class565();
                }
                class422 var26 = new class422(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field2641[var15 - 1][arg2 - (field2628 >> 6)][arg3 - (field2636 >> 6)].method3307(0, var26);
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "()V")
    public static void method1212() {
        field2605 = null;
        field2606 = null;
        field2603 = null;
        field2609 = null;
        field2604 = null;
        field2611 = null;
        field2607 = null;
        field2608 = null;
        field2610 = null;
        field2613 = null;
        field2618 = null;
        field2615 = null;
        field2612 = null;
        field2621 = null;
        field2629 = null;
        field2624 = null;
        field2632 = null;
        field2633 = null;
        field2635 = null;
        field2625 = null;
        field2630 = null;
        field2627 = null;
        field2639 = null;
        field2641 = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "([B[B[SII)V")
    private static final void method1213(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field2631];
        int[] var6 = new int[field2631];
        int[] var7 = new int[field2631];
        int[] var8 = new int[field2631];
        int[] var9 = new int[field2631];
        for (int var10 = -5; var10 < field2640; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field2631; var13++) {
                int var10002;
                if (var11 < field2640) {
                    int var28 = arg0[field2640 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class177 var29 = field2606.method1868(var28 - 1, 1);
                        var5[var13] += var29.field2817;
                        var6[var13] += var29.field2826;
                        var7[var13] += var29.field2823;
                        var8[var13] += var29.field2829;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field2640 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class177 var31 = field2606.method1868(var30 - 1, 1);
                        var5[var13] -= var31.field2817;
                        var6[var13] -= var31.field2826;
                        var7[var13] -= var31.field2823;
                        var8[var13] -= var31.field2829;
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
                for (int var19 = -5; var19 < field2631; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field2631) {
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
                        if ((arg0[field2640 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field2640 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class503.method3001(var15 / var18, var14 * 256 / var17, var16 / var18, 6);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field2640 * var19 + var10;
                            int var27 = class324.field4520[class420.method2483(class59.method503((byte) 69, var25, 96), 0) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
    public static final void method1214(int arg0) {
        field2607 = (class369) field2610.method2818(-22803, (long) arg0);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;IIIIIII[S[BZ)V")
    private static final void method1215(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method824(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field2629[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method824(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class56.method453(field2613, field2629[arg6], arg1, var11, arg0, arg2, field2617, arg3, (byte) 66, arg5, arg4, var12, arg7 >> 6 & 0x3);
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
                class119 var18 = field2603.method2834(0, arg8[var16] & 0xFFFF);
                if (var18.field1934 == -1) {
                    int var19 = -3355444;
                    if (var18.field1903 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method817(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method741(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method817(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method741(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method817(arg1, arg2, arg4, -1, 0);
                            arg0.method741(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method817(var14, arg2, arg4, -1, 0);
                            arg0.method741(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method817(var14, arg2, arg4, -1, 0);
                            arg0.method741(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method817(arg1, arg2, arg4, -1, 0);
                            arg0.method741(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method741(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method741(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method741(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method741(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method741(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method741(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "()V")
    public static final void method1216() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field2612.field2512; var1++) {
            boolean var2 = field2607.method2208(field2612.field2514[var1] & 0x3FFF, field2612.field2514[var1] >> 28 & 0x3, field2612.field2514[var1] >> 14 & 0x3FFF, true, var0);
            if (var2) {
                class66 var3 = new class66(field2612.field2509[var1]);
                var3.field951 = var0[1] - field2628;
                var3.field952 = var0[2] - field2636;
                field2621.method3904(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lfa;III)I")
    private static final int method1217(class615 arg0, int arg1, int arg2, int arg3) {
        class219 var4 = field2605.method647(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3284;
        if (var5 >= 0 && arg0.method2359(-124, var5).field5232) {
            var5 = -1;
        }
        int var9;
        if (var4.field3283 >= 0) {
            int var6 = var4.field3283;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class324.field4520[class420.method2483(class9.method44(-101, var8, 96), 0) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class324.field4520[class420.method2483(class9.method44(-78, arg0.method2359(-128, var5).field5223, 96), 0) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3290 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3290;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class324.field4520[class420.method2483(class9.method44(-62, var12, 96), 0) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;Lfu;IIII)V")
    private static final void method1218(class98 arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field945 = ((arg1.field951 - field2643) * arg2 + arg4 >> 16) + field2637;
        arg1.field946 = field2642 - ((arg1.field952 - field2623) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;II)V")
    public static final void method1219(class98 arg0, int arg1, int arg2) {
        class465 var3 = new class465(field2608.method2073((byte) 115, "area", field2607.field5111));
        int var4 = var3.method2705(-27);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2705(-34);
        }
        int var7 = var3.method2705(-126);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2705(-56);
        }
        while (true) {
            while (var3.field6710 < var3.field6719.length) {
                if (var3.method2705(-34) == 0) {
                    int var22 = var3.method2705(-127);
                    int var23 = var3.method2705(-67);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field2628;
                            int var27 = var23 * 64 + var25 - field2636;
                            method1211(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2705(-67);
                    int var29 = var3.method2705(-119);
                    int var30 = var3.method2705(-52);
                    int var31 = var3.method2705(-45);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field2628;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field2636;
                            method1211(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field2632 = new byte[field2640 * field2631];
            field2633 = new short[field2640 * field2631];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field2640 * field2631];
                for (int var13 = 0; var13 < field2641[var11].length; var13++) {
                    for (int var19 = 0; var19 < field2641[var11][0].length; var19++) {
                        class565 var20 = field2641[var11][var13][var19];
                        if (var20 != null) {
                            for (class422 var21 = (class422) var20.method3313((byte) 117); var21 != null; var21 = (class422) var20.method3308(-113)) {
                                var12[(var19 * 64 + var21.field6019) * field2640 + var13 * 64 + var21.field6022] = (byte) var21.field6020;
                            }
                        }
                    }
                }
                method1213(var12, field2632, field2633, arg1, arg2);
                for (int var14 = 0; var14 < field2641[var11].length; var14++) {
                    for (int var15 = 0; var15 < field2641[var11][0].length; var15++) {
                        class565 var16 = field2641[var11][var14][var15];
                        if (var16 != null) {
                            for (class422 var17 = (class422) var16.method3313((byte) -121); var17 != null; var17 = (class422) var16.method3308(34)) {
                                int var18 = (var15 * 64 + var17.field6019) * field2640 + var14 * 64 + var17.field6022;
                                var17.field6020 = (field2632[var18] & 0xFF) << 16 | field2633[var18] & 0xFFFF;
                                if (var17.field6020 != 0) {
                                    var17.field6020 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1213(field2624, field2632, field2633, arg1, arg2);
            field2624 = null;
            method1205();
            return;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;IIII)Lau;")
    private static final class692 method1220(class98 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class66 var5 = (class66) field2621.method3905(-112); var5 != null; var5 = (class66) field2621.method3899(0)) {
            method1218(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field2621;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)Lqba;")
    public static final class369 method1221(int arg0, int arg1) {
        for (class369 var2 = (class369) field2610.method2815(0); var2 != null; var2 = (class369) field2610.method2814(4)) {
            if (var2.field5118 && var2.method2210(arg0, arg1, false)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(Lr;IIII)V")
    private static final void method1222(class98 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2634 - field2643;
        int var6 = field2638 - field2623;
        if (field2634 < field2640) {
            var5++;
        }
        if (field2638 < field2631) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field2637;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field2637;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field2643 + var7;
                if (var52 >= 0 && var52 < field2640) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field2642 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field2642 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field2623 + var53;
                            int var58 = field2640 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field2631) {
                                var59 = (field2632[var58] & 0xFF) << 16 | field2633[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field2635[var58] & 0xFF;
                                var61 = field2630[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field2607.field5102 != -1) {
                                    var62 = field2607.field5102 | 0xFF000000;
                                } else if ((field2643 + var7 & 0x4) == (field2638 + var53 & 0x4)) {
                                    var62 = field2629[field2605.field1291 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method824(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1215(arg0, var49, var54, var51, var56, var59, var60, field2625[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class279 var63 = (class279) field2639.method2818(-22803, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method1215(arg0, var49, var54, var51, var56, var59, var60, field2625[var58], var63.field3941, var63.field3940, true);
                                }
                            } else {
                                field2618[0] = (short) (var61 - 1);
                                field2615[0] = field2627[var58];
                                method1215(arg0, var49, var54, var51, var56, var59, var60, field2625[var58], field2618, field2615, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field2642 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field2642 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field2607.field5102 != -1) {
                            var68 = field2607.field5102 | 0xFF000000;
                        } else if ((field2643 + var7 & 0x4) == (field2638 + var64 & 0x4)) {
                            var68 = field2629[field2605.field1291 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method824(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field2637;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field2637;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field2643 + var8;
                if (var41 >= 0 && var41 < field2640) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field2642 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field2642 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field2623 + var42;
                            if (var46 >= 0 && var46 < field2631) {
                                int var47 = field2630[field2640 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1224(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class279 var48 = (class279) field2639.method2818(-22803, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method1224(arg0, var38, var43, var40, var45, var48.field3941, var48.field3940);
                                    }
                                } else {
                                    field2618[0] = (short) (var47 - 1);
                                    field2615[0] = field2627[field2640 * var46 + var41];
                                    method1224(arg0, var38, var43, var40, var45, field2618, field2615);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field2643 >> 6;
        int var10 = field2623 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field2634 >> 6;
        int var12 = field2638 >> 6;
        if (var11 >= field2641[0].length) {
            var11 = field2641[0].length - 1;
        }
        if (var12 >= field2641[0][0].length) {
            var12 = field2641[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class565 var28 = field2641[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field2628 >> 6) + var14) * 64;
                        int var30 = ((field2636 >> 6) + var27) * 64;
                        for (class422 var31 = (class422) var28.method3313((byte) 97); var31 != null; var31 = (class422) var28.method3308(-107)) {
                            int var32 = var31.field6022 + var29 - field2628 - field2643;
                            int var33 = var31.field6019 + var30 - field2636 - field2623;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field2637;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field2637;
                            int var36 = field2642 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field2642 - (arg2 * var33 + arg4 >> 16);
                            method1215(arg0, var34, var36, var35 - var34, var37 - var36, var31.field6020, var31.field6024 & 0xFF, var31.field6021, var31.field6023, var31.field6025, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class565 var17 = field2641[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field2628 >> 6) + var15) * 64;
                        int var19 = ((field2636 >> 6) + var16) * 64;
                        for (class422 var20 = (class422) var17.method3313((byte) 110); var20 != null; var20 = (class422) var17.method3308(20)) {
                            int var21 = var20.field6022 + var18 - field2628 - field2643;
                            int var22 = var20.field6019 + var19 - field2636 - field2623;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field2637;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field2637;
                            int var25 = field2642 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field2642 - (arg2 * var22 + arg4 >> 16);
                            method1224(arg0, var23, var25, var24 - var23, var26 - var25, var20.field6023, var20.field6025);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(II)Lgd;")
    public static final class346 method1223(int arg0, int arg1) {
        class346 var2 = new class346();
        for (class369 var3 = (class369) field2610.method2815(0); var3 != null; var3 = (class369) field2610.method2814(4)) {
            if (var3.field5118 && var3.method2210(arg0, arg1, false)) {
                var2.method2107(true, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lr;IIII[S[B)V")
    private static final void method1224(class98 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class119 var8 = field2603.method2834(0, arg5[var7] & 0xFFFF);
            int var9 = var8.field1934;
            if (var9 != -1) {
                class253 var10 = field2604.method1498(var9, (byte) 24);
                class257 var11 = var10.method1616(2, var8.field1920 ? var8.field1941 : false, var8.field1890 ? arg6[var7] >> 6 & 0x3 : 0, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method11() >> 2;
                    int var13 = arg4 * var11.method9() >> 2;
                    if (var10.field3660) {
                        int var14 = var8.field1965;
                        int var15 = var8.field1876;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field3657 == 0) {
                            var11.method1634(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1636(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field3657 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "()V")
    public static final void method1225() {
        field2624 = null;
        field2632 = null;
        field2633 = null;
        field2635 = null;
        field2625 = null;
        field2630 = null;
        field2627 = null;
        field2639 = null;
        field2641 = null;
        field2629 = null;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(Lr;)Lau;")
    public static final class692 method1226(class98 arg0) {
        int var1 = field2634 - field2643;
        int var2 = field2638 - field2623;
        int var3 = (field2626 - field2637 << 16) / var1;
        int var4 = (field2642 - field2622 << 16) / var2;
        return method1220(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lvo;Lud;Lus;Lrw;Lgda;Lok;Lof;)V")
    public static final void method1227(class345 arg0, class86 arg1, class308 arg2, class485 arg3, class486 arg4, class229 arg5, class429 arg6) {
        field2608 = arg0;
        field2605 = arg1;
        field2606 = arg2;
        field2603 = arg3;
        field2609 = arg4;
        field2604 = arg5;
        field2611 = arg6;
        field2610.method2821(1);
        int var7 = field2608.method2083(2, "details");
        int[] var8 = field2608.method2093(var7, false);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class369 var10 = class403.method2434((byte) -127, var8[var9], field2608, var7);
                field2610.method2816(var10, (long) var10.field5109, false);
            }
        }
        class12.method62(false, true, (byte) 113);
    }
}
