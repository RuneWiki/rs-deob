import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class443 {

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lrt;")
    private class470 field6140;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lha;")
    private class475 field6130;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Lhl;")
    public static class353 field6134 = new class353(8, 1);

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field6145 = 0;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lin;")
    public static class380 field6137 = new class380(4, 6);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Ldm;")
    public static class765 field6148;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 6)
    public final void method2621(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field6132++;
        if (arg1 != null) {
            this.method2637(arg3, arg0, (byte) -77);
            if (arg2 < -21) {
                this.method2633(0, null, -104, arg4 - this.field6140.method2748(arg1, 8364), 0, null, arg1, null, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;[I[Lmq;IBIII)V", line = 24)
    public final void method2622(String arg0, int[] arg1, class85[] arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 119) {
            return;
        }
        field6139++;
        if (arg0 != null) {
            this.method2637(arg5, arg7, (byte) -45);
            this.method2633(0, arg2, -116, arg6, 0, arg1, arg0, null, arg3);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lmq;I[IILjava/lang/String;ILjava/util/Random;II)I", line = 41)
    public final int method2623(int arg0, class85[] arg1, int arg2, int[] arg3, int arg4, String arg5, int arg6, Random arg7, int arg8, int arg9) {
        field6146++;
        if (arg5 == null) {
            return 0;
        }
        arg7.setSeed((long) arg6);
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method2637(var11 << 24 | arg2 & 0xFFFFFF, arg8 & 0xFFFFFF | var11 << 24, (byte) -56);
        if (arg0 != 3) {
            this.method2632(null, -38);
        }
        int var12 = arg5.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg7.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2630(arg4, arg9, null, arg3, var13, arg1, -16777216, arg5);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIIBI[ILaa;II[Lmq;III)I", line = 81)
    public final int method2624(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int[] arg9, class88 arg10, int arg11, int arg12, class85[] arg13, int arg14, int arg15, int arg16) {
        field6147++;
        if (arg7 != -120) {
            return 85;
        } else if (arg2 == null) {
            return 0;
        } else {
            this.method2637(arg16, arg15, (byte) -6);
            if (arg1 == 0) {
                arg1 = this.field6140.field6398;
            }
            int[] var18;
            if (this.field6140.field6399 + arg1 + this.field6140.field6402 > arg5 && arg5 < (arg1 + arg1)) {
                var18 = null;
            } else {
                var18 = new int[] { arg8 };
            }
            int var19 = this.field6140.method2753(class701.field9840, arg13, arg2, var18, (byte) 34);
            if (arg3 == -1) {
                arg3 = arg5 / arg1;
                if (arg3 <= 0) {
                    arg3 = 1;
                }
            }
            if (arg3 > 0 && var19 >= arg3) {
                var19 = arg3;
                class701.field9840[arg3 - 1] = this.field6140.method2751(class701.field9840[arg3 - 1], arg13, (byte) 0, arg8);
            }
            if (arg14 == 3 && var19 == 1) {
                arg14 = 1;
            }
            int var20;
            if (arg14 == 0) {
                var20 = this.field6140.field6402 + arg11;
            } else if (arg14 == 1) {
                var20 = (arg5 - ((var19 - 1) * arg1) - this.field6140.field6402 - this.field6140.field6399) / 2 + this.field6140.field6402 + arg11;
            } else if (arg14 == 2) {
                var20 = arg11 + arg5 - this.field6140.field6399 - (var19 + -1) * arg1;
            } else {
                int var21 = (arg5 - this.field6140.field6399 - this.field6140.field6402 - ((var19 + -1) * arg1)) / (var19 + 1);
                if (var21 < 0) {
                    var21 = 0;
                }
                var20 = this.field6140.field6402 + arg11 + var21;
                arg1 += var21;
            }
            for (int var22 = 0; var22 < var19; var22++) {
                if (arg0 == 0) {
                    this.method2633(arg4, arg13, arg7 ^ 0x17, arg6, arg12, arg9, class701.field9840[var22], arg10, var20);
                } else if (arg0 == 1) {
                    this.method2633(arg4, arg13, arg7 + 26, arg6 - -((-this.field6140.method2748(class701.field9840[var22], 8364) + arg8) / 2), arg12, arg9, class701.field9840[var22], arg10, var20);
                } else if (arg0 == 2) {
                    this.method2633(arg4, arg13, -114, arg6 + arg8 - this.field6140.method2748(class701.field9840[var22], 8364), arg12, arg9, class701.field9840[var22], arg10, var20);
                } else if (var19 - 1 == var22) {
                    this.method2633(arg4, arg13, arg7 ^ 0x15, arg6, arg12, arg9, class701.field9840[var22], arg10, var20);
                } else {
                    this.method2631(arg8, arg7 ^ 0xFFFFFFED, class701.field9840[var22]);
                    this.method2633(arg4, arg13, -115, arg6, arg12, arg9, class701.field9840[var22], arg10, var20);
                    class499.field6860 = 0;
                }
                var20 += arg1;
            }
            return var19;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIBLjava/lang/String;II)V", line = 184)
    public final void method2625(int arg0, int arg1, int arg2, byte arg3, String arg4, int arg5, int arg6) {
        field6136++;
        if (arg4 == null) {
            return;
        }
        this.method2637(arg6, arg2, (byte) -108);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg3 != 82) {
            this.method2624(69, -36, null, -26, -47, 89, -71, (byte) 82, -21, null, null, -84, 61, null, -62, 85, -62);
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2630(arg0, arg1 - (this.field6140.method2748(arg4, 8364) / 2), var10, null, var9, null, -16777216, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 215)
    public final void method2626(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field6142++;
        if (arg5 == null) {
            return;
        }
        if (arg1 != -9678) {
            this.method2628(90, null, 26, 80, -12, 104);
        }
        this.method2637(arg6, arg2, (byte) 109);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2630(arg0, arg4 - (this.field6140.method2748(arg5, 8364) / 2), var9, null, null, null, -16777216, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIIIILaa;II[III[Lmq;)I", line = 245)
    public final int method2627(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class88 arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14, class85[] arg15) {
        if (arg13 != -1609) {
            this.method2628(-121, null, -12, 48, -83, 63);
        }
        field6128++;
        return this.method2624(arg0, arg5, arg1, 0, arg11, arg7, arg4, (byte) -120, arg3, arg12, arg9, arg14, arg8, arg15, arg6, arg2, arg10);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(ILjava/lang/String;IIII)V", line = 256)
    public final void method2628(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field6131++;
        if (arg1 == null) {
            return;
        }
        this.method2637(arg5, arg0, (byte) 116);
        if (arg3 >= -95) {
            this.method2621(24, null, -53, 58, -16, -96);
        }
        this.method2633(0, null, -97, arg2, 0, null, arg1, null, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIIII[Lmq;Ljava/lang/String;I[II[IIILjava/util/Random;)I", line = 274)
    public final int method2629(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class85[] arg6, String arg7, int arg8, int[] arg9, int arg10, int[] arg11, int arg12, int arg13, Random arg14) {
        field6135++;
        if (arg7 == null) {
            return 0;
        }
        arg14.setSeed((long) arg2);
        int var16 = (arg14.nextInt() & 0x1F) + 192;
        this.method2637(arg12 & 0xFFFFFF | var16 << 24, var16 << 24 | arg13 & 0xFFFFFF, (byte) 15);
        int var17 = arg7.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg14.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg10;
        if (arg1 >= -42) {
            field6134 = null;
        }
        int var22 = this.field6140.field6402 + arg4;
        int var23 = -1;
        if (arg5 == 1) {
            var22 += (arg8 - this.field6140.field6402 - this.field6140.field6399) / 2;
        } else if (arg5 == 2) {
            var22 = arg4 + arg8 - this.field6140.field6399;
        }
        if (arg3 == 1) {
            var23 = this.field6140.method2748(arg7, 8364) + var19;
            var21 = (arg0 - var23) / 2 + arg10;
        } else if (arg3 == 2) {
            var23 = this.field6140.method2748(arg7, 8364) + var19;
            var21 = arg0 + arg10 - var23;
        }
        this.method2630(var22, var21, null, arg11, var18, arg6, -16777216, arg7);
        if (arg9 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field6140.method2748(arg7, 8364);
            }
            arg9[2] = var23;
            arg9[1] = var22 - this.field6140.field6402;
            arg9[3] = this.field6140.field6402 + this.field6140.field6399;
            arg9[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I[I[Lmq;ILjava/lang/String;)V", line = 358)
    private final void method2630(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, class85[] arg5, int arg6, String arg7) {
        field6141++;
        int var9 = arg0 - this.field6140.field6398;
        int var10 = -1;
        int var11 = -1;
        if (arg6 != -16777216) {
            field6134 = null;
        }
        int var12 = 0;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class406.method2404(arg7.charAt(var14), false) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg7.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class185.method1340(var16.substring(4), (byte) 117);
                                    class85 var20 = arg5[var19];
                                    int var21 = arg3 == null ? var20.method14() : arg3[var19];
                                    var20.method6(arg1 + var17, var9 + var18 - (-this.field6140.field6398 - -var21), 1, 0, 1);
                                    arg1 += arg5[var19].method11();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2632(var16, 16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field6140.method2749(var11, var15, 126);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class486.field6696 & 0xFF000000) != 0) {
                            this.method179(var15, arg1 + var22 + 1, var9 + var23 + 1, class486.field6696, true);
                        }
                        this.method179(var15, arg1 + var22, var9 + var23, class713.field9948, false);
                    } else if (class499.field6860 > 0) {
                        class727.field10129 += class499.field6860;
                        arg1 += class727.field10129 >> 8;
                        class727.field10129 &= 0xFF;
                    }
                    int var24 = this.field6140.method2743(var15, (byte) 93);
                    if (class236.field3418 != -1) {
                        this.field6130.method2770(var9 + ((int) ((double) this.field6140.field6398 * 0.7D)), var24, arg1, 1, class236.field3418);
                    }
                    if (class209.field3051 != -1) {
                        this.field6130.method2770(this.field6140.field6398 + var9, var24, arg1, 1, class209.field3051);
                    }
                    var11 = var15;
                    arg1 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lrt;)V", line = 527)
    public class443(class475 arg0, class470 arg1) {
        this.field6140 = arg1;
        this.field6130 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V", line = 536)
    private final void method2631(int arg0, int arg1, String arg2) {
        field6129++;
        if (arg1 <= 44) {
            this.field6130 = null;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg2.length(); var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class499.field6860 = (arg0 - this.field6140.method2748(arg2, 8364) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 576)
    private final void method2632(String arg0, int arg1) {
        field6133++;
        try {
            if (arg1 != 16) {
                this.method179('\u0016', 29, -27, -44, false);
            }
            if (arg0.startsWith("col=")) {
                class713.field9948 = class713.field9948 & 0xFF000000 | class631.method3602(arg0.substring(4), 16, (byte) -128) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class713.field9948 = class355.field5030 & 0xFFFFFF | class713.field9948 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class713.field9948 = class631.method3602(arg0.substring(5), 16, (byte) 101);
            } else if (arg0.equals("/argb")) {
                class713.field9948 = class355.field5030;
            } else if (arg0.startsWith("str=")) {
                class236.field3418 = class713.field9948 & 0xFF000000 | class631.method3602(arg0.substring(4), 16, (byte) -37);
            } else if (arg0.equals("str")) {
                class236.field3418 = class713.field9948 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class236.field3418 = -1;
            } else if (arg0.startsWith("u=")) {
                class209.field3051 = class713.field9948 & 0xFF000000 | class631.method3602(arg0.substring(2), 16, (byte) -115);
            } else if (arg0.equals("u")) {
                class209.field3051 = class713.field9948 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class209.field3051 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class486.field6696 = 0;
            } else if (arg0.startsWith("shad=")) {
                class486.field6696 = class713.field9948 & 0xFF000000 | class631.method3602(arg0.substring(5), 16, (byte) -26);
            } else if (arg0.equals("shad")) {
                class486.field6696 = class713.field9948 & 0xFF000000;
                return;
            } else if (arg0.equals("/shad")) {
                class486.field6696 = class377.field5281;
                return;
            } else if (arg0.equals("br")) {
                this.method2637(class377.field5281, class355.field5030, (byte) -67);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lmq;III[ILjava/lang/String;Laa;I)V", line = 649)
    private final void method2633(int arg0, class85[] arg1, int arg2, int arg3, int arg4, int[] arg5, String arg6, class88 arg7, int arg8) {
        int var10 = arg8 - this.field6140.field6398;
        if (arg2 >= -86) {
            return;
        }
        field6138++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class406.method2404(arg6.charAt(var14), false) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg6.substring(var11 + 1, var14);
                    var11 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17 = class185.method1340(var16.substring(4), (byte) 73);
                                    class85 var18 = arg1[var17];
                                    int var19 = arg5 == null ? var18.method14() : arg5[var17];
                                    if ((class713.field9948 & 0xFF000000) == -16777216) {
                                        var18.method6(arg3, var10 + this.field6140.field6398 - var19, 1, 0, 1);
                                    } else {
                                        var18.method6(arg3, this.field6140.field6398 + var10 - var19, 0, class713.field9948 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg3 += arg1[var17].method11();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2632(var16, 16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field6140.method2749(var12, var15, 84);
                    }
                    if (var15 == ' ') {
                        if (class499.field6860 > 0) {
                            class727.field10129 += class499.field6860;
                            arg3 += class727.field10129 >> 8;
                            class727.field10129 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class486.field6696 & 0xFF000000) != 0) {
                            this.method179(var15, arg3 + 1, var10 + 1, class486.field6696, true);
                        }
                        this.method179(var15, arg3, var10, class713.field9948, false);
                    } else {
                        if ((class486.field6696 & 0xFF000000) != 0) {
                            this.method180(var15, arg3 + 1, var10 + 1, class486.field6696, true, arg7, arg0, arg4);
                        }
                        this.method180(var15, arg3, var10, class713.field9948, false, arg7, arg0, arg4);
                    }
                    int var20 = this.field6140.method2743(var15, (byte) 93);
                    if (class236.field3418 != -1) {
                        this.field6130.method2770(var10 + ((int) ((double) this.field6140.field6398 * 0.7D)), var20, arg3, 1, class236.field3418);
                    }
                    if (class209.field3051 != -1) {
                        this.field6130.method2770(var10 + this.field6140.field6398 + 1, var20, arg3, 1, class209.field3051);
                    }
                    arg3 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 803)
    public static void method2634(int arg0) {
        field6134 = null;
        field6137 = null;
        if (arg0 != -16777216) {
            field6137 = null;
        }
        field6148 = null;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(ILjava/lang/String;IIII)V", line = 823)
    public final void method2635(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field6144++;
        if (arg1 != null) {
            this.method2637(arg4, arg2, (byte) 118);
            this.method2633(arg3, null, -88, arg0 - (this.field6140.method2748(arg1, 8364) / 2), 0, null, arg1, null, arg5);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V", line = 841)
    public final void method2636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        if (arg4 >= -59) {
            field6134 = null;
        }
        field6127++;
        if (arg7 == null) {
            return;
        }
        this.method2637(arg5, arg3, (byte) 115);
        double var9 = 7.0D - (double) arg6 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg1));
        }
        this.method2630(arg0, arg2 - (this.field6140.method2748(arg7, 8364) / 2), var12, null, null, null, -16777216, arg7);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V", line = 873)
    private final void method2637(int arg0, int arg1, byte arg2) {
        class209.field3051 = -1;
        class355.field5030 = arg1;
        class713.field9948 = arg1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class499.field6860 = 0;
        int var4 = 49 % ((63 - arg2) / 38);
        class236.field3418 = -1;
        field6143++;
        class727.field10129 = 0;
        class377.field5281 = arg0;
        class486.field6696 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method180(char arg0, int arg1, int arg2, int arg3, boolean arg4, class88 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method179(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
