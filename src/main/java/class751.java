import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class751 {

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lsi;")
    private static class769 field10422 = new class769(16);

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[B")
    private static byte[] field10423 = new byte[1];

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field10427 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[S")
    private static short[] field10426 = new short[1];

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field10431 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Low;")
    public static class665 field10432 = new class665();

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "F")
    public static float field10425;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "F")
    public static float field10428;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field10434;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field10439;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field10441;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field10442;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field10445;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field10447;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field10449;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field10452;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Loo;")
    private static class12 field10418;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Ljea;")
    public static class250 field10419;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lsc;")
    public static class47 field10416;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lqp;")
    public static class489 field10417;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lgga;")
    public static class513 field10420;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lui;")
    private static class556 field10414;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lu;")
    public static class65 field10421;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lac;")
    public static class743 field10415;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "Lsi;")
    private static class769 field10443;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Ldl;")
    public static class78 field10430;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[B")
    private static byte[] field10435;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "[B")
    private static byte[] field10436;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "[B")
    private static byte[] field10438;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "[B")
    private static byte[] field10440;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "[B")
    private static byte[] field10448;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "[I")
    private static int[] field10450;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "[S")
    private static short[] field10433;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "[S")
    private static short[] field10444;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "[[[B")
    public static byte[][][] field10429;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "[[[Lcp;")
    private static class271[][][] field10454;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 3)
    private static final void method4130(class475 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method436(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field10450[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method436(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class75.method692(arg0, arg1, arg4, field10429, arg5, var12, (byte) 125, arg3, var11, arg7 >> 6 & 0x3, field10424, arg2, field10450[arg6]);
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
                class416 var18 = field10416.method369((byte) 125, arg8[var16] & 0xFFFF);
                if (var18.field5775 == -1) {
                    int var19 = -3355444;
                    if (var18.field5754 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method468(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method521(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method468(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method521(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method468(arg1, arg2, arg4, -1, 0);
                            arg0.method521(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method468(var14, arg2, arg4, -1, 0);
                            arg0.method521(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method468(var14, arg2, arg4, -1, 0);
                            arg0.method521(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method468(arg1, arg2, arg4, -1, 0);
                            arg0.method521(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method521(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method521(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method521(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method521(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method521(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method521(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lha;II)V", line = 165)
    public static final void method4131(class475 arg0, int arg1, int arg2) {
        class431 var3 = new class431(field10420.method3017(0, "area", field10419.field3589));
        int var4 = var3.method2557(14929);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2557(14929);
        }
        int var7 = var3.method2557(14929);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2557(14929);
        }
        while (true) {
            while (var3.field5983 < var3.field6002.length) {
                if (var3.method2557(14929) == 0) {
                    int var22 = var3.method2557(14929);
                    int var23 = var3.method2557(14929);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field10445;
                            int var27 = var23 * 64 + var25 - field10446;
                            method4143(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2557(14929);
                    int var29 = var3.method2557(14929);
                    int var30 = var3.method2557(14929);
                    int var31 = var3.method2557(14929);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field10445;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field10446;
                            method4143(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field10436 = new byte[field10452 * field10441];
            field10444 = new short[field10452 * field10441];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field10452 * field10441];
                for (int var13 = 0; var13 < field10454[var11].length; var13++) {
                    for (int var19 = 0; var19 < field10454[var11][0].length; var19++) {
                        class271 var20 = field10454[var11][var13][var19];
                        if (var20 != null) {
                            for (class550 var21 = (class550) var20.method1730((byte) 43); var21 != null; var21 = (class550) var20.method1729((byte) 100)) {
                                var12[(var19 * 64 + var21.field7636) * field10441 + var13 * 64 + var21.field7641] = (byte) var21.field7639;
                            }
                        }
                    }
                }
                method4147(var12, field10436, field10444, arg1, arg2);
                for (int var14 = 0; var14 < field10454[var11].length; var14++) {
                    for (int var15 = 0; var15 < field10454[var11][0].length; var15++) {
                        class271 var16 = field10454[var11][var14][var15];
                        if (var16 != null) {
                            for (class550 var17 = (class550) var16.method1730((byte) 74); var17 != null; var17 = (class550) var16.method1729((byte) 100)) {
                                int var18 = (var15 * 64 + var17.field7636) * field10441 + var14 * 64 + var17.field7641;
                                var17.field7639 = (field10436[var18] & 0xFF) << 16 | field10444[var18] & 0xFFFF;
                                if (var17.field7639 != 0) {
                                    var17.field7639 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method4147(field10448, field10436, field10444, arg1, arg2);
            field10448 = null;
            method4142();
            return;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lgga;Loo;Lui;Lsc;Lac;Lu;Lqp;)V", line = 343)
    public static final void method4132(class513 arg0, class12 arg1, class556 arg2, class47 arg3, class743 arg4, class65 arg5, class489 arg6) {
        field10420 = arg0;
        field10418 = arg1;
        field10414 = arg2;
        field10416 = arg3;
        field10415 = arg4;
        field10421 = arg5;
        field10417 = arg6;
        field10422.method4249((byte) 108);
        int var7 = field10420.method3016(70, "details");
        int[] var8 = field10420.method3012(-92, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class250 var10 = class721.method4009(var7, -2, field10420, var8[var9]);
                field10422.method4252(false, var10, (long) var10.field3596);
            }
        }
        class588.method3450(true, (byte) -6, false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 373)
    private static final void method4133(class475 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class416 var8 = field10416.method369((byte) 127, arg5[var7] & 0xFFFF);
            int var9 = var8.field5775;
            if (var9 != -1) {
                class309 var10 = field10421.method654(var9, -31772);
                class85 var11 = var10.method1898(var8.field5720 ? arg6[var7] >> 6 & 0x3 : 0, arg0, var8.field5715 ? var8.field5724 : false, 262144);
                if (var11 != null) {
                    int var12 = arg3 * var11.method11() >> 2;
                    int var13 = arg4 * var11.method14() >> 2;
                    if (var10.field4405) {
                        int var14 = var8.field5776;
                        int var15 = var8.field5734;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4400 == 0) {
                            var11.method755(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method758(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field4400 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 432)
    public static final void method4134() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field10430.field1170; var1++) {
            boolean var2 = field10419.method1658((byte) -40, field10430.field1167[var1] & 0x3FFF, field10430.field1167[var1] >> 28 & 0x3, var0, field10430.field1167[var1] >> 14 & 0x3FFF);
            if (var2) {
                class770 var3 = new class770(field10430.field1168[var1]);
                var3.field10629 = var0[1] - field10445;
                var3.field10626 = var0[2] - field10446;
                field10432.method3728((byte) 115, var3);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 454)
    public static final void method4135(int arg0) {
        field10419 = (class250) field10422.method4253((long) arg0, -1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lha;Ljg;Lll;)V", line = 459)
    public static final void method4136(class475 arg0, class770 arg1, class548 arg2) {
        if (arg2.field7592 == null) {
            return;
        }
        int[] var3 = new int[arg2.field7592.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field7592[var4 * 2] + arg1.field10629;
            int var22 = arg2.field7592[var4 * 2 + 1] + arg1.field10626;
            var3[var4 * 2] = (var21 - field10449) * (field10439 - field10447) / (field10434 - field10449) + field10447;
            var3[var4 * 2 + 1] = field10453 - (field10453 - field10451) * (var22 - field10442) / (field10437 - field10442);
        }
        class52.method412(arg0, var3, arg2.field7625);
        if (arg2.field7584 > 0) {
            for (int var5 = 0; var5 < var3.length / 2 - 1; var5++) {
                int var13 = var3[var5 * 2];
                int var14 = var3[var5 * 2 + 1];
                int var15 = var3[(var5 + 1) * 2];
                int var16 = var3[(var5 + 1) * 2 + 1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg0.method442(var13, var14, var15, var16, arg2.field7602[arg2.field7630[var5] & 0xFF], 1, arg2.field7584, arg2.field7612, arg2.field7620);
            }
            int var6 = var3[var3.length - 2];
            int var7 = var3[var3.length - 1];
            int var8 = var3[0];
            int var9 = var3[1];
            if (var8 < var6) {
                int var10 = var6;
                int var11 = var7;
                var6 = var8;
                var7 = var9;
                var8 = var10;
                var9 = var11;
            } else if (var6 == var8 && var9 < var7) {
                int var12 = var7;
                var7 = var9;
                var9 = var12;
            }
            arg0.method442(var6, var7, var8, var9, arg2.field7602[arg2.field7630[arg2.field7630.length - 1] & 0xFF], 1, arg2.field7584, arg2.field7612, arg2.field7620);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method2769(var3[var20 * 2], arg2.field7602[arg2.field7630[var20] & 0xFF], var3[(var20 + 1) * 2], var3[(var20 + 1) * 2 + 1], var3[var20 * 2 + 1], 7166);
        }
        arg0.method2769(var3[var3.length - 2], arg2.field7602[arg2.field7630[arg2.field7630.length - 1] & 0xFF], var3[0], var3[1], var3[var3.length - 1], 7166);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIII)V", line = 567)
    public static final void method4137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10449 = arg0 - field10445;
        field10437 = arg1 - field10446;
        field10434 = arg2 - field10445;
        field10442 = arg3 - field10446;
        field10447 = arg4;
        field10451 = arg5;
        field10439 = arg6;
        field10453 = arg7;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V", line = 578)
    public static void method4138() {
        field10418 = null;
        field10414 = null;
        field10416 = null;
        field10415 = null;
        field10421 = null;
        field10417 = null;
        field10419 = null;
        field10420 = null;
        field10422 = null;
        field10429 = null;
        field10426 = null;
        field10423 = null;
        field10430 = null;
        field10432 = null;
        field10450 = null;
        field10448 = null;
        field10436 = null;
        field10444 = null;
        field10438 = null;
        field10435 = null;
        field10433 = null;
        field10440 = null;
        field10443 = null;
        field10454 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lha;)V", line = 607)
    public static final void method4139(class475 arg0) {
        int var1 = field10434 - field10449;
        int var2 = field10437 - field10442;
        int var3 = (field10439 - field10447 << 16) / var1;
        int var4 = (field10453 - field10451 << 16) / var2;
        method4153(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lha;IIII)Low;", line = 621)
    private static final class665 method4140(class475 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class770 var5 = (class770) field10432.method3731((byte) -109); var5 != null; var5 = (class770) field10432.method3729((byte) -120)) {
            method4151(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field10432;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Ljea;", line = 633)
    public static final class250 method4141(int arg0) {
        return (class250) field10422.method4253((long) arg0, -1);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()V", line = 638)
    private static final void method4142() {
        for (int var0 = 0; var0 < field10441; var0++) {
            for (int var11 = 0; var11 < field10452; var11++) {
                int var12 = field10433[field10441 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class516 var13 = (class516) field10443.method4253((long) (var0 << 16 | var11), -1);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field7104.length; var14++) {
                                class416 var15 = field10416.method369((byte) 126, var13.field7104[var14] & 0xFFFF);
                                int var16 = var15.field5737;
                                if (var15.field5736 != null) {
                                    class416 var17 = var15.method2458(field10417, -1);
                                    if (var17 != null) {
                                        var16 = var17.field5737;
                                    }
                                }
                                if (var16 != -1) {
                                    class770 var18 = new class770(var16);
                                    var18.field10629 = var0;
                                    var18.field10626 = var11;
                                    field10432.method3728((byte) 107, var18);
                                }
                            }
                        }
                    } else {
                        class416 var19 = field10416.method369((byte) 125, var12 - 1);
                        int var20 = var19.field5737;
                        if (var19.field5736 != null) {
                            class416 var21 = var19.method2458(field10417, -1);
                            if (var21 != null) {
                                var20 = var21.field5737;
                            }
                        }
                        if (var20 != -1) {
                            class770 var22 = new class770(var20);
                            var22.field10629 = var0;
                            var22.field10626 = var11;
                            field10432.method3728((byte) 125, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field10454[0].length; var2++) {
                for (int var3 = 0; var3 < field10454[0][0].length; var3++) {
                    class271 var4 = field10454[var1][var2][var3];
                    if (var4 != null) {
                        for (class550 var5 = (class550) var4.method1730((byte) 92); var5 != null; var5 = (class550) var4.method1729((byte) 100)) {
                            if (var5.field7638 != null) {
                                for (int var6 = 0; var6 < var5.field7638.length; var6++) {
                                    class416 var7 = field10416.method369((byte) 125, var5.field7638[var6] & 0xFFFF);
                                    int var8 = var7.field5737;
                                    if (var7.field5736 != null) {
                                        class416 var9 = var7.method2458(field10417, -1);
                                        if (var9 != null) {
                                            var8 = var9.field5737;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class770 var10 = new class770(var8);
                                        var10.field10629 = ((field10445 >> 6) + var2) * 64 + var5.field7641 - field10445;
                                        var10.field10626 = ((field10446 >> 6) + var3) * 64 + var5.field7636 - field10446;
                                        field10432.method3728((byte) 105, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lha;Lol;IIII[I[I)V", line = 795)
    private static final void method4143(class475 arg0, class431 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2557(14929);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2557(14929);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field10448[field10441 * arg5 + arg4] = (byte) var11;
                    field10438[field10441 * arg5 + arg4] = 0;
                } else {
                    field10438[field10441 * arg5 + arg4] = (byte) var11;
                    field10435[field10441 * arg5 + arg4] = 0;
                    field10448[field10441 * arg5 + arg4] = arg1.method2529(36);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2557(14929);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2557(14929);
                var18 = arg1.method2557(14929);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2557(14929);
            }
            if (var15 == 0) {
                field10448[field10441 * arg5 + arg4] = (byte) var16;
                field10438[field10441 * arg5 + arg4] = (byte) var17;
                field10435[field10441 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field10433[field10441 * arg5 + arg4] = (short) (arg1.method2565((byte) -124) + 1);
                    field10440[field10441 * arg5 + arg4] = arg1.method2529(62);
                } else if (var19 > 1) {
                    field10433[field10441 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2565((byte) -95);
                        var21[var22] = arg1.method2529(81);
                    }
                    field10443.method4252(false, new class516(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2565((byte) -106);
                        var24[var25] = arg1.method2529(65);
                    }
                }
                if (field10454[var15 - 1][arg2 - (field10445 >> 6)][arg3 - (field10446 >> 6)] == null) {
                    field10454[var15 - 1][arg2 - (field10445 >> 6)][arg3 - (field10446 >> 6)] = new class271();
                }
                class550 var26 = new class550(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field10454[var15 - 1][arg2 - (field10445 >> 6)][arg3 - (field10446 >> 6)].method1734(var26, 0);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Ljea;", line = 931)
    public static final class250 method4144(int arg0, int arg1) {
        for (class250 var2 = (class250) field10422.method4254((byte) 8); var2 != null; var2 = (class250) field10422.method4251(-44)) {
            if (var2.field3601 && var2.method1659(arg1, -1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "()V", line = 943)
    public static final void method4145() {
        field10448 = null;
        field10436 = null;
        field10444 = null;
        field10438 = null;
        field10435 = null;
        field10433 = null;
        field10440 = null;
        field10443 = null;
        field10454 = null;
        field10450 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)Lpf;", line = 958)
    public static final class30 method4146(int arg0, int arg1) {
        class30 var2 = new class30();
        for (class250 var3 = (class250) field10422.method4254((byte) 8); var3 != null; var3 = (class250) field10422.method4251(-60)) {
            if (var3.field3601 && var3.method1659(arg1, -1, arg0)) {
                var2.method248((byte) 52, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([B[B[SII)V", line = 975)
    private static final void method4147(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field10452];
        int[] var6 = new int[field10452];
        int[] var7 = new int[field10452];
        int[] var8 = new int[field10452];
        int[] var9 = new int[field10452];
        for (int var10 = -5; var10 < field10441; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field10452; var13++) {
                int var10002;
                if (var11 < field10441) {
                    int var28 = arg0[field10441 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class100 var29 = field10414.method3210(1, var28 - 1);
                        var5[var13] += var29.field1489;
                        var6[var13] += var29.field1476;
                        var7[var13] += var29.field1479;
                        var8[var13] += var29.field1477;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field10441 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class100 var31 = field10414.method3210(1, var30 - 1);
                        var5[var13] -= var31.field1489;
                        var6[var13] -= var31.field1476;
                        var7[var13] -= var31.field1479;
                        var8[var13] -= var31.field1477;
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
                for (int var19 = -5; var19 < field10452; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field10452) {
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
                        if ((arg0[field10441 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field10441 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class237.method1605(var15 / var18, var16 / var18, var14 * 256 / var17, (byte) -68);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field10441 * var19 + var10;
                            int var27 = class621.field8768[class314.method1915((byte) -116, class346.method2115((byte) 102, var25, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Lha;)Low;", line = 1121)
    public static final class665 method4148(class475 arg0) {
        int var1 = field10434 - field10449;
        int var2 = field10437 - field10442;
        int var3 = (field10439 - field10447 << 16) / var1;
        int var4 = (field10453 - field10451 << 16) / var2;
        return method4140(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ld;II)V", line = 1133)
    public static final void method4149(class103 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field10418.field157; var3++) {
            field10450[var3 + 1] = method4152(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "()V", line = 1143)
    public static final void method4150() {
        field10448 = new byte[field10452 * field10441];
        field10438 = new byte[field10452 * field10441];
        field10435 = new byte[field10452 * field10441];
        field10433 = new short[field10452 * field10441];
        field10440 = new byte[field10452 * field10441];
        field10443 = new class769(1024);
        field10454 = new class271[3][field10441 >> 6][field10452 >> 6];
        field10450 = new int[field10418.field157 + 1];
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lha;Ljg;IIII)V", line = 1153)
    private static final void method4151(class475 arg0, class770 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field10637 = ((arg1.field10629 - field10449) * arg2 + arg4 >> 16) + field10447;
        arg1.field10628 = field10453 - ((arg1.field10626 - field10442) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ld;III)I", line = 1164)
    private static final int method4152(class103 arg0, int arg1, int arg2, int arg3) {
        class405 var4 = field10418.method159(arg1, 0);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field5564;
        if (var5 >= 0 && arg0.method847(var5, -128).field10029) {
            var5 = -1;
        }
        int var9;
        if (var4.field5566 >= 0) {
            int var6 = var4.field5566;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class621.field8768[class314.method1915((byte) 78, class342.method2101(119, var8, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class621.field8768[class314.method1915((byte) -110, class342.method2101(127, arg0.method847(var5, -114).field10035, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field5567 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field5567;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class621.field8768[class314.method1915((byte) -124, class342.method2101(48, var12, 96)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Lha;IIII)V", line = 1237)
    private static final void method4153(class475 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field10434 - field10449;
        int var6 = field10437 - field10442;
        if (field10434 < field10441) {
            var5++;
        }
        if (field10437 < field10452) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field10447;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field10447;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field10449 + var7;
                if (var52 >= 0 && var52 < field10441) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field10453 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field10453 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field10442 + var53;
                            int var58 = field10441 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field10452) {
                                var59 = (field10436[var58] & 0xFF) << 16 | field10444[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field10438[var58] & 0xFF;
                                var61 = field10433[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field10419.field3592 != -1) {
                                    var62 = field10419.field3592 | 0xFF000000;
                                } else if ((field10449 + var7 & 0x4) == (field10437 + var53 & 0x4)) {
                                    var62 = field10450[field10418.field158 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method436(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method4130(arg0, var49, var54, var51, var56, var59, var60, field10435[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class516 var63 = (class516) field10443.method4253((long) (var52 << 16 | var57), -1);
                                if (var63 != null) {
                                    method4130(arg0, var49, var54, var51, var56, var59, var60, field10435[var58], var63.field7104, var63.field7105, true);
                                }
                            } else {
                                field10426[0] = (short) (var61 - 1);
                                field10423[0] = field10440[var58];
                                method4130(arg0, var49, var54, var51, var56, var59, var60, field10435[var58], field10426, field10423, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field10453 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field10453 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field10419.field3592 != -1) {
                            var68 = field10419.field3592 | 0xFF000000;
                        } else if ((field10449 + var7 & 0x4) == (field10437 + var64 & 0x4)) {
                            var68 = field10450[field10418.field158 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method436(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field10447;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field10447;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field10449 + var8;
                if (var41 >= 0 && var41 < field10441) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field10453 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field10453 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field10442 + var42;
                            if (var46 >= 0 && var46 < field10452) {
                                int var47 = field10433[field10441 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method4133(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class516 var48 = (class516) field10443.method4253((long) (var41 << 16 | var46), -1);
                                    if (var48 != null) {
                                        method4133(arg0, var38, var43, var40, var45, var48.field7104, var48.field7105);
                                    }
                                } else {
                                    field10426[0] = (short) (var47 - 1);
                                    field10423[0] = field10440[field10441 * var46 + var41];
                                    method4133(arg0, var38, var43, var40, var45, field10426, field10423);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field10449 >> 6;
        int var10 = field10442 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field10434 >> 6;
        int var12 = field10437 >> 6;
        if (var11 >= field10454[0].length) {
            var11 = field10454[0].length - 1;
        }
        if (var12 >= field10454[0][0].length) {
            var12 = field10454[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class271 var28 = field10454[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field10445 >> 6) + var14) * 64;
                        int var30 = ((field10446 >> 6) + var27) * 64;
                        for (class550 var31 = (class550) var28.method1730((byte) 118); var31 != null; var31 = (class550) var28.method1729((byte) 100)) {
                            int var32 = var31.field7641 + var29 - field10445 - field10449;
                            int var33 = var31.field7636 + var30 - field10446 - field10442;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field10447;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field10447;
                            int var36 = field10453 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field10453 - (arg2 * var33 + arg4 >> 16);
                            method4130(arg0, var34, var36, var35 - var34, var37 - var36, var31.field7639, var31.field7640 & 0xFF, var31.field7642, var31.field7638, var31.field7637, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class271 var17 = field10454[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field10445 >> 6) + var15) * 64;
                        int var19 = ((field10446 >> 6) + var16) * 64;
                        for (class550 var20 = (class550) var17.method1730((byte) 78); var20 != null; var20 = (class550) var17.method1729((byte) 100)) {
                            int var21 = var20.field7641 + var18 - field10445 - field10449;
                            int var22 = var20.field7636 + var19 - field10446 - field10442;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field10447;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field10447;
                            int var25 = field10453 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field10453 - (arg2 * var22 + arg4 >> 16);
                            method4133(arg0, var23, var25, var24 - var23, var26 - var25, var20.field7638, var20.field7637);
                        }
                    }
                }
            }
        }
    }
}
