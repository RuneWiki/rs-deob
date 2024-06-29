import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class330 {

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "Lwk;")
    private static class155 field4565 = new class155(16);

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field4573 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "[B")
    private static byte[] field4575 = new byte[1];

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public static int field4580 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "[S")
    private static short[] field4578 = new short[1];

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "Lcf;")
    public static class92 field4572 = new class92();

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "F")
    public static float field4574;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "F")
    public static float field4577;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Lrf;")
    public static class106 field4568;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "Lwk;")
    private static class155 field4593;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "Laf;")
    private static class22 field4564;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Ldi;")
    private static class300 field4566;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "Ltm;")
    public static class380 field4569;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Lnl;")
    public static class435 field4562;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "Lqr;")
    public static class456 field4563;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "Lrj;")
    public static class481 field4571;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "Lje;")
    public static class53 field4567;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Lfl;")
    public static class67 field4570;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "[B")
    private static byte[] field4589;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "[B")
    private static byte[] field4590;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "[B")
    private static byte[] field4591;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "[B")
    private static byte[] field4597;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "[B")
    private static byte[] field4601;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "[I")
    private static int[] field4598;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "[S")
    private static short[] field4583;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "[S")
    private static short[] field4588;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "[[[B")
    public static byte[][][] field4576;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "[[[Lmb;")
    private static class262[][][] field4599;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "()V")
    private static final void method2062() {
        for (int var0 = 0; var0 < field4600; var0++) {
            for (int var11 = 0; var11 < field4581; var11++) {
                int var12 = field4588[field4600 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class331 var13 = (class331) field4593.method1104(-127, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field4604.length; var14++) {
                                class267 var15 = field4567.method506(-121, var13.field4604[var14] & 0xFFFF);
                                int var16 = var15.field3842;
                                if (var15.field3846 != null) {
                                    class267 var17 = var15.method1799(field4563, (byte) -111);
                                    if (var17 != null) {
                                        var16 = var17.field3842;
                                    }
                                }
                                if (var16 != -1) {
                                    class266 var18 = new class266(var16);
                                    var18.field3825 = var0;
                                    var18.field3828 = var11;
                                    field4572.method766(var18, -1);
                                }
                            }
                        }
                    } else {
                        class267 var19 = field4567.method506(-118, var12 - 1);
                        int var20 = var19.field3842;
                        if (var19.field3846 != null) {
                            class267 var21 = var19.method1799(field4563, (byte) -111);
                            if (var21 != null) {
                                var20 = var21.field3842;
                            }
                        }
                        if (var20 != -1) {
                            class266 var22 = new class266(var20);
                            var22.field3825 = var0;
                            var22.field3828 = var11;
                            field4572.method766(var22, -1);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field4599[0].length; var2++) {
                for (int var3 = 0; var3 < field4599[0][0].length; var3++) {
                    class262 var4 = field4599[var1][var2][var3];
                    if (var4 != null) {
                        for (class28 var5 = (class28) var4.method1763((byte) -88); var5 != null; var5 = (class28) var4.method1767(true)) {
                            if (var5.field295 != null) {
                                for (int var6 = 0; var6 < var5.field295.length; var6++) {
                                    class267 var7 = field4567.method506(-125, var5.field295[var6] & 0xFFFF);
                                    int var8 = var7.field3842;
                                    if (var7.field3846 != null) {
                                        class267 var9 = var7.method1799(field4563, (byte) -111);
                                        if (var9 != null) {
                                            var8 = var9.field3842;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class266 var10 = new class266(var8);
                                        var10.field3825 = ((field4596 >> 6) + var2) * 64 + var5.field291 - field4596;
                                        var10.field3828 = ((field4602 >> 6) + var3) * 64 + var5.field292 - field4602;
                                        field4572.method766(var10, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "()V")
    public static final void method2063() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field4571.field6807; var1++) {
            boolean var2 = field4570.method628(-19313, field4571.field6804[var1] & 0x3FFF, field4571.field6804[var1] >> 28 & 0x3, field4571.field6804[var1] >> 14 & 0x3FFF, var0);
            if (var2) {
                class266 var3 = new class266(field4571.field6805[var1]);
                var3.field3825 = var0[1] - field4596;
                var3.field3828 = var0[2] - field4602;
                field4572.method766(var3, -1);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "()V")
    public static void method2064() {
        field4564 = null;
        field4566 = null;
        field4567 = null;
        field4569 = null;
        field4568 = null;
        field4563 = null;
        field4570 = null;
        field4562 = null;
        field4565 = null;
        field4576 = null;
        field4578 = null;
        field4575 = null;
        field4571 = null;
        field4572 = null;
        field4598 = null;
        field4589 = null;
        field4597 = null;
        field4583 = null;
        field4601 = null;
        field4591 = null;
        field4588 = null;
        field4590 = null;
        field4593 = null;
        field4599 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ltq;II)V")
    public static final void method2065(class248 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field4564.field244; var3++) {
            field4598[var3 + 1] = method2083(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4585 = arg0 - field4596;
        field4586 = arg1 - field4602;
        field4582 = arg2 - field4596;
        field4584 = arg3 - field4602;
        field4592 = arg4;
        field4587 = arg5;
        field4594 = arg6;
        field4595 = arg7;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lvc;IIII)Lcf;")
    private static final class92 method2067(class89 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class266 var5 = (class266) field4572.method775(1); var5 != null; var5 = (class266) field4572.method763(0)) {
            method2074(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field4572;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)Lgo;")
    public static final class304 method2068(int arg0, int arg1) {
        class304 var2 = new class304();
        for (class67 var3 = (class67) field4565.method1097(64); var3 != null; var3 = (class67) field4565.method1105(false)) {
            if (var3.field988 && var3.method629(arg1, arg0, (byte) -111)) {
                var2.method1962((byte) -67, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "()V")
    public static final void method2069() {
        field4589 = new byte[field4600 * field4581];
        field4601 = new byte[field4600 * field4581];
        field4591 = new byte[field4600 * field4581];
        field4588 = new short[field4600 * field4581];
        field4590 = new byte[field4600 * field4581];
        field4593 = new class155(1024);
        field4599 = new class262[3][field4600 >> 6][field4581 >> 6];
        field4598 = new int[field4564.field244 + 1];
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2070(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field4581];
        int[] var6 = new int[field4581];
        int[] var7 = new int[field4581];
        int[] var8 = new int[field4581];
        int[] var9 = new int[field4581];
        for (int var10 = -5; var10 < field4600; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field4581; var13++) {
                int var10002;
                if (var11 < field4600) {
                    int var28 = arg0[field4600 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class354 var29 = field4566.method1934(var28 - 1, (byte) 82);
                        var5[var13] += var29.field4869;
                        var6[var13] += var29.field4870;
                        var7[var13] += var29.field4861;
                        var8[var13] += var29.field4860;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field4600 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class354 var31 = field4566.method1934(var30 - 1, (byte) 113);
                        var5[var13] -= var31.field4869;
                        var6[var13] -= var31.field4870;
                        var7[var13] -= var31.field4861;
                        var8[var13] -= var31.field4860;
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
                for (int var19 = -5; var19 < field4581; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field4581) {
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
                        if ((arg0[field4600 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field4600 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class82.method701(-19925, var16 / var18, var15 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field4600 * var19 + var10;
                            int var27 = class21.field227[class487.method2868(50, class266.method1797(96, var25, (byte) -76)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lvc;IIII[S[B)V")
    private static final void method2071(class89 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class267 var8 = field4567.method506(-126, arg5[var7] & 0xFFFF);
            int var9 = var8.field3865;
            if (var9 != -1) {
                class51 var10 = field4568.method843(64, var9);
                class417 var11 = var10.method489(arg0, var8.field3909 ? var8.field3848 : false, var8.field3849 ? arg6[var7] >> 6 & 0x3 : 0, (byte) 84);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1294() >> 2;
                    int var13 = arg4 * var11.method1295() >> 2;
                    if (var10.field737) {
                        int var14 = var8.field3843;
                        int var15 = var8.field3856;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field738 == 0) {
                            var11.method2497(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method725(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field738 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lnl;Laf;Ldi;Lje;Ltm;Lrf;Lqr;)V")
    public static final void method2072(class435 arg0, class22 arg1, class300 arg2, class53 arg3, class380 arg4, class106 arg5, class456 arg6) {
        field4562 = arg0;
        field4564 = arg1;
        field4566 = arg2;
        field4567 = arg3;
        field4569 = arg4;
        field4568 = arg5;
        field4563 = arg6;
        field4565.method1101((byte) 103);
        int var7 = field4562.method2657("details", (byte) 15);
        int[] var8 = field4562.method2655(0, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class67 var10 = class145.method1035(var8[var9], var7, field4562, (byte) 88);
            field4565.method1100(var10, -46, (long) var10.field968);
        }
        class157.method1126(124, false, true);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Lfl;")
    public static final class67 method2073(int arg0) {
        return (class67) field4565.method1104(-128, (long) arg0);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lvc;Lid;IIII)V")
    private static final void method2074(class89 arg0, class266 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3830 = ((arg1.field3825 - field4585) * arg2 + arg4 >> 16) + field4592;
        arg1.field3827 = field4595 - ((arg1.field3828 - field4584) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lvc;IIIIIII[S[BZ)V")
    private static final void method2075(class89 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method438(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field4598[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method438(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class363.method2231(arg1, field4598[arg6], var11, arg3, var12, (byte) -45, arg4, field4579, arg7 >> 6 & 0x3, arg0, arg2, field4576, arg5);
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
                class267 var18 = field4567.method506(-121, arg8[var16] & 0xFFFF);
                if (var18.field3865 == -1) {
                    int var19 = -3355444;
                    if (var18.field3902 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method387(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method374(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method387(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method374(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method387(arg1, arg2, arg4, -1, 0);
                            arg0.method374(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method387(var14, arg2, arg4, -1, 0);
                            arg0.method374(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method387(var14, arg2, arg4, -1, 0);
                            arg0.method374(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method387(arg1, arg2, arg4, -1, 0);
                            arg0.method374(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method374(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method374(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method374(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method374(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method374(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method374(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lvc;IIII)V")
    private static final void method2076(class89 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field4582 - field4585;
        int var6 = field4586 - field4584;
        if (field4582 < field4600) {
            var5++;
        }
        if (field4586 < field4581) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field4592;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field4592;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field4585 + var7;
                if (var52 >= 0 && var52 < field4600) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field4595 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field4595 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field4584 + var53;
                            int var58 = field4600 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field4581) {
                                var59 = (field4597[var58] & 0xFF) << 16 | field4583[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field4601[var58] & 0xFF;
                                var61 = field4588[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field4570.field972 != -1) {
                                    var62 = field4570.field972 | 0xFF000000;
                                } else if ((field4586 + var53 & 0x4) == (field4585 + var7 & 0x4)) {
                                    var62 = field4598[field4564.field249 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method438(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2075(arg0, var49, var54, var51, var56, var59, var60, field4591[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class331 var63 = (class331) field4593.method1104(-128, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2075(arg0, var49, var54, var51, var56, var59, var60, field4591[var58], var63.field4604, var63.field4603, true);
                                }
                            } else {
                                field4578[0] = (short) (var61 - 1);
                                field4575[0] = field4590[var58];
                                method2075(arg0, var49, var54, var51, var56, var59, var60, field4591[var58], field4578, field4575, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field4595 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field4595 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field4570.field972 != -1) {
                            var68 = field4570.field972 | 0xFF000000;
                        } else if ((field4586 + var64 & 0x4) == (field4585 + var7 & 0x4)) {
                            var68 = field4598[field4564.field249 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method438(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field4592;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field4592;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field4585 + var8;
                if (var41 >= 0 && var41 < field4600) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field4595 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field4595 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field4584 + var42;
                            if (var46 >= 0 && var46 < field4581) {
                                int var47 = field4588[field4600 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2071(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class331 var48 = (class331) field4593.method1104(-126, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2071(arg0, var38, var43, var40, var45, var48.field4604, var48.field4603);
                                    }
                                } else {
                                    field4578[0] = (short) (var47 - 1);
                                    field4575[0] = field4590[field4600 * var46 + var41];
                                    method2071(arg0, var38, var43, var40, var45, field4578, field4575);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field4585 >> 6;
        int var10 = field4584 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field4582 >> 6;
        int var12 = field4586 >> 6;
        if (var11 >= field4599[0].length) {
            var11 = field4599[0].length - 1;
        }
        if (var12 >= field4599[0][0].length) {
            var12 = field4599[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class262 var28 = field4599[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field4596 >> 6) + var14) * 64;
                        int var30 = ((field4602 >> 6) + var27) * 64;
                        for (class28 var31 = (class28) var28.method1763((byte) -90); var31 != null; var31 = (class28) var28.method1767(true)) {
                            int var32 = var31.field291 + var29 - field4596 - field4585;
                            int var33 = var31.field292 + var30 - field4602 - field4584;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field4592;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field4592;
                            int var36 = field4595 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field4595 - (arg2 * var33 + arg4 >> 16);
                            method2075(arg0, var34, var36, var35 - var34, var37 - var36, var31.field293, var31.field297 & 0xFF, var31.field296, var31.field295, var31.field294, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class262 var17 = field4599[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field4596 >> 6) + var15) * 64;
                        int var19 = ((field4602 >> 6) + var16) * 64;
                        for (class28 var20 = (class28) var17.method1763((byte) -63); var20 != null; var20 = (class28) var17.method1767(true)) {
                            int var21 = var20.field291 + var18 - field4596 - field4585;
                            int var22 = var20.field292 + var19 - field4602 - field4584;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field4592;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field4592;
                            int var25 = field4595 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field4595 - (arg2 * var22 + arg4 >> 16);
                            method2071(arg0, var23, var25, var24 - var23, var26 - var25, var20.field295, var20.field294);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "()V")
    public static final void method2077() {
        field4589 = null;
        field4597 = null;
        field4583 = null;
        field4601 = null;
        field4591 = null;
        field4588 = null;
        field4590 = null;
        field4593 = null;
        field4599 = null;
        field4598 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lvc;)V")
    public static final void method2078(class89 arg0) {
        int var1 = field4582 - field4585;
        int var2 = field4586 - field4584;
        int var3 = (field4594 - field4592 << 16) / var1;
        int var4 = (field4595 - field4587 << 16) / var2;
        method2076(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lvc;)Lcf;")
    public static final class92 method2079(class89 arg0) {
        int var1 = field4582 - field4585;
        int var2 = field4586 - field4584;
        int var3 = (field4594 - field4592 << 16) / var1;
        int var4 = (field4595 - field4587 << 16) / var2;
        return method2067(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
    public static final void method2080(int arg0) {
        field4570 = (class67) field4565.method1104(-128, (long) arg0);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)Lfl;")
    public static final class67 method2081(int arg0, int arg1) {
        for (class67 var2 = (class67) field4565.method1097(64); var2 != null; var2 = (class67) field4565.method1105(false)) {
            if (var2.field988 && var2.method629(arg1, arg0, (byte) -124)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lvc;II)V")
    public static final void method2082(class89 arg0, int arg1, int arg2) {
        class161 var3 = new class161(field4562.method2626("area", (byte) 121, field4570.field984));
        int var4 = var3.method1172((byte) -110);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1172((byte) 11);
        }
        int var7 = var3.method1172((byte) -117);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1172((byte) -121);
        }
        while (true) {
            while (var3.field2298 < var3.field2262.length) {
                if (var3.method1172((byte) -125) == 0) {
                    int var22 = var3.method1172((byte) 117);
                    int var23 = var3.method1172((byte) -121);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field4596;
                            int var27 = var23 * 64 + var25 - field4602;
                            method2084(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1172((byte) -111);
                    int var29 = var3.method1172((byte) 40);
                    int var30 = var3.method1172((byte) -108);
                    int var31 = var3.method1172((byte) 56);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field4596;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field4602;
                            method2084(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field4597 = new byte[field4600 * field4581];
            field4583 = new short[field4600 * field4581];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field4600 * field4581];
                for (int var13 = 0; var13 < field4599[var11].length; var13++) {
                    for (int var19 = 0; var19 < field4599[var11][0].length; var19++) {
                        class262 var20 = field4599[var11][var13][var19];
                        if (var20 != null) {
                            for (class28 var21 = (class28) var20.method1763((byte) -76); var21 != null; var21 = (class28) var20.method1767(true)) {
                                var12[(var19 * 64 + var21.field292) * field4600 + var13 * 64 + var21.field291] = (byte) var21.field293;
                            }
                        }
                    }
                }
                method2070(var12, field4597, field4583, arg1, arg2);
                for (int var14 = 0; var14 < field4599[var11].length; var14++) {
                    for (int var15 = 0; var15 < field4599[var11][0].length; var15++) {
                        class262 var16 = field4599[var11][var14][var15];
                        if (var16 != null) {
                            for (class28 var17 = (class28) var16.method1763((byte) -126); var17 != null; var17 = (class28) var16.method1767(true)) {
                                int var18 = (var15 * 64 + var17.field292) * field4600 + var14 * 64 + var17.field291;
                                var17.field293 = (field4597[var18] & 0xFF) << 16 | field4583[var18] & 0xFFFF;
                                if (var17.field293 != 0) {
                                    var17.field293 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2070(field4589, field4597, field4583, arg1, arg2);
            field4589 = null;
            method2062();
            return;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ltq;III)I")
    private static final int method2083(class248 arg0, int arg1, int arg2, int arg3) {
        class261 var4 = field4564.method158(arg1, true);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3751;
        if (var5 >= 0 && arg0.method1224((byte) 110, var5).field4375) {
            var5 = -1;
        }
        int var9;
        if (var4.field3741 >= 0) {
            int var6 = var4.field3741;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class21.field227[class487.method2868(-77, class339.method2123(var8, -7604, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class21.field227[class487.method2868(106, class339.method2123(arg0.method1224((byte) 110, var5).field4365, -7604, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3758 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3758;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class21.field227[class487.method2868(103, class339.method2123(var12, -7604, 96)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lvc;Lkk;IIII[I[I)V")
    private static final void method2084(class89 arg0, class161 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1172((byte) -126);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1172((byte) 126);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field4589[field4600 * arg5 + arg4] = (byte) var11;
                    field4601[field4600 * arg5 + arg4] = 0;
                } else {
                    field4601[field4600 * arg5 + arg4] = (byte) var11;
                    field4591[field4600 * arg5 + arg4] = 0;
                    field4589[field4600 * arg5 + arg4] = arg1.method1152(-1910700904);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1172((byte) -112);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1172((byte) 11);
                var18 = arg1.method1172((byte) -112);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1172((byte) 68);
            }
            if (var15 == 0) {
                field4589[field4600 * arg5 + arg4] = (byte) var16;
                field4601[field4600 * arg5 + arg4] = (byte) var17;
                field4591[field4600 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field4588[field4600 * arg5 + arg4] = (short) (arg1.method1134(-16848) + 1);
                    field4590[field4600 * arg5 + arg4] = arg1.method1152(-1910700904);
                } else if (var19 > 1) {
                    field4588[field4600 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1134(-16848);
                        var21[var22] = arg1.method1152(-1910700904);
                    }
                    field4593.method1100(new class331(var20, var21), -115, (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1134(-16848);
                        var24[var25] = arg1.method1152(-1910700904);
                    }
                }
                if (field4599[var15 - 1][arg2 - (field4596 >> 6)][arg3 - (field4602 >> 6)] == null) {
                    field4599[var15 - 1][arg2 - (field4596 >> 6)][arg3 - (field4602 >> 6)] = new class262();
                }
                class28 var26 = new class28(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field4599[var15 - 1][arg2 - (field4596 >> 6)][arg3 - (field4602 >> 6)].method1765(125, var26);
            }
        }
    }
}
