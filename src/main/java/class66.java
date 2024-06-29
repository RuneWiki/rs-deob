import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class66 {

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lie;")
    private class6 field813;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lha;")
    private class65 field809;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lfba;")
    public static class27 field800 = new class27(77, 3);

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field816 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lvk;")
    public static class387 field818;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;II)V", line = 4)
    public final void method555(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field797++;
        if (arg5 == null) {
            return;
        }
        this.method573(arg3, -2, arg1);
        double var9 = 7.0D - ((double) arg7 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg0));
        }
        if (arg2 > -108) {
            this.method556(72, -104, null);
        }
        this.method557(arg6, arg5, var12, arg4 - (this.field813.method41(arg5, -128) / 2), null, 255, null, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V", line = 40)
    private final void method556(int arg0, int arg1, String arg2) {
        field810++;
        int var4 = 0;
        if (arg0 != -63) {
            field818 = null;
        }
        boolean var5 = false;
        for (int var6 = 0; arg2.length() > var6; var6++) {
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
            class291.field4258 = (arg1 - this.field813.method41(arg2, -99) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;[II[II[I[Ljd;)V", line = 78)
    private final void method557(int arg0, String arg1, int[] arg2, int arg3, int[] arg4, int arg5, int[] arg6, class241[] arg7) {
        int var9 = arg0 - this.field813.field57;
        field798++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        if (arg5 != 255) {
            return;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class126.method950((byte) -102, arg1.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg1.substring(var10 + 1, var14);
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
                                    if (arg6 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg6[var12];
                                    }
                                    int var18;
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class163.method1224(false, var16.substring(4));
                                    class241 var20 = arg7[var19];
                                    int var21 = arg4 == null ? var20.method1505() : arg4[var19];
                                    var20.method364(arg3 + var17, var9 - -this.field813.field57 + -var21 + var18, 1, 0, 1);
                                    var11 = -1;
                                    arg3 += arg7[var19].method1507();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method558(var16, (byte) 109);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg3 += this.field813.method42(var15, (byte) -98, var11);
                    }
                    int var22;
                    if (arg6 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg6[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class83.field924 & 0xFF000000) != 0) {
                            this.method214(var15, arg3 + var22 + 1, var9 + 1 + var23, class83.field924, true);
                        }
                        this.method214(var15, arg3 + var22, var9 + var23, class192.field2963, false);
                    } else if (class291.field4258 > 0) {
                        class373.field5153 += class291.field4258;
                        arg3 += class373.field5153 >> 8;
                        class373.field5153 &= 0xFF;
                    }
                    int var24 = this.field813.method46(var15, (byte) -128);
                    if (class648.field9064 != -1) {
                        this.field809.method465(var24, 1, (int) ((double) this.field813.field57 * 0.7D) + var9, class648.field9064, arg3);
                    }
                    if (class222.field3422 != -1) {
                        this.field809.method465(var24, arg5 - 254, this.field813.field57 + var9, class222.field3422, arg3);
                    }
                    arg3 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 240)
    private final void method558(String arg0, byte arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class192.field2963 = class192.field2963 & 0xFF000000 | class771.method4250(arg0.substring(4), 16, -28990) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class192.field2963 = class226.field3470 & 0xFFFFFF | class192.field2963 & 0xFF000000;
            }
            int var3 = -52 % ((arg1 - 15) / 39);
            if (arg0.startsWith("argb=")) {
                class192.field2963 = class771.method4250(arg0.substring(5), 16, -28990);
            } else if (arg0.equals("/argb")) {
                class192.field2963 = class226.field3470;
            } else if (arg0.startsWith("str=")) {
                class648.field9064 = class192.field2963 & 0xFF000000 | class771.method4250(arg0.substring(4), 16, -28990);
            } else if (arg0.equals("str")) {
                class648.field9064 = class192.field2963 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class648.field9064 = -1;
            } else if (arg0.startsWith("u=")) {
                class222.field3422 = class192.field2963 & 0xFF000000 | class771.method4250(arg0.substring(2), 16, -28990);
            } else if (arg0.equals("u")) {
                class222.field3422 = class192.field2963 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class222.field3422 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class83.field924 = 0;
            } else if (arg0.startsWith("shad=")) {
                class83.field924 = class192.field2963 & 0xFF000000 | class771.method4250(arg0.substring(5), 16, -28990);
            } else if (arg0.equals("shad")) {
                class83.field924 = class192.field2963 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class83.field924 = class85.field937;
            } else if (arg0.equals("br")) {
                this.method573(class85.field937, -2, class226.field3470);
            }
        } catch (Exception var4) {
        }
        field801++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/util/Random;[Ljd;[IZILjava/lang/String;III)I", line = 315)
    public final int method559(int arg0, Random arg1, class241[] arg2, int[] arg3, boolean arg4, int arg5, String arg6, int arg7, int arg8, int arg9) {
        if (!arg4) {
            return -63;
        }
        field799++;
        if (arg6 == null) {
            return 0;
        }
        arg1.setSeed((long) arg7);
        int var11 = (arg1.nextInt() & 0x1F) + 192;
        this.method573(arg0 & 0xFFFFFF | var11 << 24, -2, arg9 & 0xFFFFFF | var11 << 24);
        int var12 = arg6.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg1.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method557(arg8, arg6, null, arg5, arg3, 255, var13, arg2);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V", line = 355)
    public static final void method560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field800 = null;
        }
        field817++;
        if (class618.field8645 <= arg1 && class463.field6533 >= arg1) {
            int var5 = class527.method3176(arg2, class407.field5535, class734.field10153, -2);
            int var6 = class527.method3176(arg0, class407.field5535, class734.field10153, -2);
            class515.method3104(arg3, -128, var6, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;I[Ljd;I[ILjava/util/Random;IIIII[II)I", line = 381)
    public final int method561(int arg0, int arg1, String arg2, int arg3, class241[] arg4, int arg5, int[] arg6, Random arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        field819++;
        if (arg2 == null) {
            return 0;
        }
        arg7.setSeed((long) arg0);
        int var16 = (arg7.nextInt() & 0x1F) + 192;
        this.method573(arg14 & 0xFFFFFF | var16 << 24, arg5 - 3, arg9 & 0xFFFFFF | var16 << 24);
        int var17 = arg2.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg7.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg1;
        int var22 = this.field813.field64 + arg3;
        int var23 = -1;
        if (arg10 == 1) {
            var22 += (arg12 - this.field813.field56 - this.field813.field64) / 2;
        } else if (arg10 == 2) {
            var22 = arg12 + arg3 - this.field813.field56;
        }
        if (arg5 == arg8) {
            var23 = var19 + this.field813.method41(arg2, -99);
            var21 = (arg11 - var23) / 2 + arg1;
        } else if (arg8 == 2) {
            var23 = var19 + this.field813.method41(arg2, arg5 ^ 0xFFFFFF98);
            var21 = arg11 + arg1 - var23;
        }
        this.method557(var22, arg2, null, var21, arg6, 255, var18, arg4);
        if (arg13 != null) {
            if (var23 == -1) {
                var23 = this.field813.method41(arg2, -106) + var19;
            }
            arg13[2] = var23;
            arg13[3] = this.field813.field64 + this.field813.field56;
            arg13[1] = var22 - this.field813.field64;
            arg13[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 455)
    public static void method562(byte arg0) {
        field800 = null;
        field818 = null;
        if (arg0 <= 38) {
            field816 = -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;BIIII)V", line = 466)
    public final void method563(String arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field807++;
        if (arg0 != null) {
            int var7 = 108 % ((arg1 + 16) / 37);
            this.method573(arg3, -2, arg2);
            this.method564(null, null, 0, arg0, arg5, null, arg4, (byte) -51, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljd;[IILjava/lang/String;ILaa;IBI)V", line = 488)
    private final void method564(class241[] arg0, int[] arg1, int arg2, String arg3, int arg4, class511 arg5, int arg6, byte arg7, int arg8) {
        if (arg7 != -51) {
            this.method564(null, null, 1, null, 25, null, 120, (byte) -39, -54);
        }
        field814++;
        int var10 = arg6 - this.field813.field57;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class126.method950((byte) 127, arg3.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg3.substring(var11 + 1, var14);
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
                                    int var17 = class163.method1224(false, var16.substring(4));
                                    class241 var18 = arg0[var17];
                                    int var19 = arg1 == null ? var18.method1505() : arg1[var17];
                                    if ((class192.field2963 & 0xFF000000) == -16777216) {
                                        var18.method364(arg4, var10 + this.field813.field57 - var19, 1, 0, 1);
                                    } else {
                                        var18.method364(arg4, this.field813.field57 + var10 - var19, 0, class192.field2963 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg4 += arg0[var17].method1507();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method558(var16, (byte) 74);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field813.method42(var15, (byte) 100, var12);
                    }
                    if (var15 == ' ') {
                        if (class291.field4258 > 0) {
                            class373.field5153 += class291.field4258;
                            arg4 += class373.field5153 >> 8;
                            class373.field5153 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class83.field924 & 0xFF000000) != 0) {
                            this.method214(var15, arg4 + 1, var10 + 1, class83.field924, true);
                        }
                        this.method214(var15, arg4, var10, class192.field2963, false);
                    } else {
                        if ((class83.field924 & 0xFF000000) != 0) {
                            this.method215(var15, arg4 + 1, var10 + 1, class83.field924, true, arg5, arg2, arg8);
                        }
                        this.method215(var15, arg4, var10, class192.field2963, false, arg5, arg2, arg8);
                    }
                    int var20 = this.field813.method46(var15, (byte) -116);
                    if (class648.field9064 != -1) {
                        this.field809.method465(var20, 1, (int) ((double) this.field813.field57 * 0.7D) + var10, class648.field9064, arg4);
                    }
                    if (class222.field3422 != -1) {
                        this.field809.method465(var20, arg7 ^ 0xFFFFFFCC, this.field813.field57 + var10 + 1, class222.field3422, arg4);
                    }
                    arg4 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILaa;I[Ljd;Ljava/lang/String;II[IIII)I", line = 637)
    public final int method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class511 arg7, int arg8, class241[] arg9, String arg10, int arg11, int arg12, int[] arg13, int arg14, int arg15, int arg16) {
        field811++;
        if (arg10 == null) {
            return 0;
        }
        this.method573(arg15, -2, arg5);
        if (arg0 == 0) {
            arg0 = this.field813.field57;
        }
        if (arg2 < 97) {
            field800 = null;
        }
        int[] var18;
        if ((this.field813.field64 + this.field813.field56 + arg0) > arg8 && arg8 < (arg0 + arg0)) {
            var18 = null;
        } else {
            var18 = new int[] { arg3 };
        }
        if (arg16 == -1) {
            arg16 = arg8 / arg0;
            if (arg16 <= 0) {
                arg16 = 1;
            }
        }
        int var19 = this.field813.method36(var18, class300.field4336, arg9, arg10, (byte) -52);
        if (arg16 > 0 && var19 >= arg16) {
            var19 = arg16;
            class300.field4336[arg16 - 1] = this.field813.method44(class300.field4336[arg16 - 1], arg9, -1, arg3);
        }
        if (arg1 == 3 && var19 == 1) {
            arg1 = 1;
        }
        int var20;
        if (arg1 == 0) {
            var20 = this.field813.field64 + arg14;
        } else if (arg1 == 1) {
            var20 = (arg8 - ((var19 - 1) * arg0) - (this.field813.field64 + this.field813.field56)) / 2 + this.field813.field64 + arg14;
        } else if (arg1 == 2) {
            var20 = arg8 + arg14 - ((var19 + -1) * arg0) - this.field813.field56;
        } else {
            int var21 = (arg8 - this.field813.field64 - this.field813.field56 - ((var19 + -1) * arg0)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field813.field64 + var21 + arg14;
            arg0 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg12 == 0) {
                this.method564(arg9, arg13, arg6, class300.field4336[var22], arg4, arg7, var20, (byte) -51, arg11);
            } else if (arg12 == 1) {
                this.method564(arg9, arg13, arg6, class300.field4336[var22], (arg3 - this.field813.method41(class300.field4336[var22], -114)) / 2 + arg4, arg7, var20, (byte) -51, arg11);
            } else if (arg12 == 2) {
                this.method564(arg9, arg13, arg6, class300.field4336[var22], arg3 + arg4 - this.field813.method41(class300.field4336[var22], -120), arg7, var20, (byte) -51, arg11);
            } else if (var19 - 1 == var22) {
                this.method564(arg9, arg13, arg6, class300.field4336[var22], arg4, arg7, var20, (byte) -51, arg11);
            } else {
                this.method556(-63, arg3, class300.field4336[var22]);
                this.method564(arg9, arg13, arg6, class300.field4336[var22], arg4, arg7, var20, (byte) -51, arg11);
                class291.field4258 = 0;
            }
            var20 += arg0;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 739)
    public final void method566(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field804++;
        if (arg0 != null) {
            this.method573(arg4, arg3 - 2, arg1);
            this.method564(null, null, arg3, arg0, arg5 - (this.field813.method41(arg0, arg3 - 123) / 2), null, arg2, (byte) -51, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 753)
    public final void method567(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field815++;
        if (arg5 != null) {
            this.method573(arg4, -2, arg0);
            this.method564(null, null, arg1, arg5, arg2 - this.field813.method41(arg5, -99), null, arg3, (byte) -51, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 766)
    public final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field803++;
        if (arg6 == null) {
            return;
        }
        this.method573(arg0, -2, arg2);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        int var12 = -117 / ((-arg3 - 4) / 51);
        this.method557(arg4, arg6, var10, arg5 - (this.field813.method41(arg6, -117) / 2), null, 255, var9, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILda;ZLha;Ljava/lang/String;Lie;)V", line = 797)
    public static final void method569(int arg0, class66 arg1, boolean arg2, class65 arg3, String arg4, class6 arg5) {
        field812++;
        boolean var6 = !class163.field2588 || class646.method3704((byte) -81);
        if (arg0 > -83 || !var6) {
            return;
        }
        if (class163.field2588 && var6) {
            class6 var12 = class739.field10188;
            class66 var13 = arg3.method437(var12, class728.field10055, true);
            int var14 = var12.method39(null, arg4, 250, (byte) -27);
            int var15 = var12.method47(250, null, arg4, 67, var12.field57);
            int var16 = class228.field3496.field4;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var14;
            int var19 = var17 * 2 + var15;
            if (var19 < class5.field46) {
                var19 = class5.field46;
            }
            if (var18 < class115.field1755) {
                var18 = class115.field1755;
            }
            int var20 = class562.field7983.method703(var18, class527.field7532, (byte) 16) + class163.field2589;
            int var21 = class653.field9126.method2781(var19, 0, class296.field4307) + class202.field3154;
            if (class195.field2997) {
                var20 += class493.method2933((byte) -70);
                var21 += class242.method1613(8220);
            }
            arg3.method551(class409.field5557, false).method1510(class229.field3499.field4 + var20, class229.field3499.field7 + var21, var18 - (class229.field3499.field4 * 2), var19 - class229.field3499.field7 * 2, 1, 0, 0);
            arg3.method551(class229.field3499, true).method1604(var20, var21);
            class229.field3499.method6();
            arg3.method551(class229.field3499, true).method1604(var18 + var20 - var16, var21);
            class229.field3499.method15();
            arg3.method551(class229.field3499, true).method1604(var20 + var18 - var16, var19 + var21 + -var16);
            class229.field3499.method6();
            arg3.method551(class229.field3499, true).method1604(var20, var19 + var21 - var16);
            class229.field3499.method15();
            arg3.method551(class228.field3496, true).method1610(var20, class229.field3499.field7 + var21, var16, var19 - (class229.field3499.field7 * 2));
            class228.field3496.method11();
            arg3.method551(class228.field3496, true).method1610(class229.field3499.field4 + var20, var21, var18 - (class229.field3499.field4 * 2), var16);
            class228.field3496.method11();
            arg3.method551(class228.field3496, true).method1610(var20 - (var16 - var18), var21 - -class229.field3499.field7, var16, var19 - (class229.field3499.field7 * 2));
            class228.field3496.method11();
            arg3.method551(class228.field3496, true).method1610(class229.field3499.field4 + var20, var19 + var21 + -var16, var18 - (class229.field3499.field4 * 2), var16);
            class228.field3496.method11();
            var13.method571(0, null, 1, var18 - (var17 * 2), var21 - -var17, 1, 0, -22888, arg4, var19 - (var17 * 2), null, var17 + var20, 0, class356.field5014 | 0xFF000000, null, -1);
            class110.method835(0, var19, var21, var18, var20);
        } else {
            int var7 = arg5.method39(null, arg4, 250, (byte) -27);
            int var8 = arg5.method43(arg4, (byte) 117, null, 250) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg3.method495(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -16777216, 0);
            arg3.method520(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -1, 0);
            arg1.method571(0, null, 1, var7, var11, 1, 0, -22888, arg4, var8, null, var10, 0, -1, null, -1);
            class110.method835(0, var9 + var9 + var8, var11 - var9, var9 + var9 + var7, var10 - var9);
        }
        if (!arg2) {
            return;
        }
        try {
            if (class195.field2997) {
                class762.method4228(35);
            } else {
                arg3.method508(126);
            }
        } catch (class736 var22) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[I[Ljd;IIILjava/lang/String;I)V", line = 896)
    public final void method570(int arg0, int[] arg1, class241[] arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        if (arg4 > -62) {
            this.method565(43, 22, -24, 63, -21, 78, 11, null, -77, null, null, -95, -121, null, -61, -48, 7);
        }
        field802++;
        if (arg6 != null) {
            this.method573(arg5, -2, arg0);
            this.method564(arg2, arg1, 0, arg6, arg7, null, arg3, (byte) -51, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Ljd;IIIIIILjava/lang/String;I[IIIILaa;I)I", line = 911)
    public final int method571(int arg0, class241[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, String arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, class511 arg14, int arg15) {
        field796++;
        if (arg7 != -22888) {
            this.method567(-74, 120, 10, 69, -112, null);
        }
        return this.method565(arg6, arg2, arg7 + 23005, arg3, arg11, arg13, arg12, arg14, arg9, arg1, arg8, arg0, arg5, arg10, arg4, arg15, 0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBILjava/lang/String;II)V", line = 925)
    public final void method572(int arg0, int arg1, byte arg2, int arg3, String arg4, int arg5, int arg6) {
        field808++;
        if (arg4 == null) {
            return;
        }
        this.method573(arg6, -2, arg3);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        if (arg2 > 1) {
            for (int var10 = 0; var10 < var8; var10++) {
                var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            }
            this.method557(arg0, arg4, var9, arg5 - this.field813.method41(arg4, -121) / 2, null, 255, null, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 959)
    private final void method573(int arg0, int arg1, int arg2) {
        class222.field3422 = -1;
        class226.field3470 = arg2;
        class192.field2963 = arg2;
        class373.field5153 = 0;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class648.field9064 = -1;
        class291.field4258 = 0;
        field806++;
        class85.field937 = arg0;
        class83.field924 = arg0;
        if (arg1 != -2) {
            field800 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lie;)V", line = 984)
    public class66(class65 arg0, class6 arg1) {
        this.field813 = arg1;
        this.field809 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V", line = 1000)
    public static final void method574(int arg0, int arg1, int arg2) {
        if (class635.field8929 == 1) {
            class625.method3596(1, arg2, arg0, class713.field9890);
        } else if (class635.field8929 == 2) {
            if (class195.field2997) {
                class93.method686(class242.method1613(8220) + arg0, 8, class493.method2933((byte) -90) + arg2);
            } else {
                class93.method686(arg0, 8, arg2);
            }
        }
        field805++;
        class635.field8929 = 0;
        class713.field9890 = null;
        if (arg1 != 16777215) {
            method569(69, null, false, null, null, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method214(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method215(char arg0, int arg1, int arg2, int arg3, boolean arg4, class511 arg5, int arg6, int arg7);
}
