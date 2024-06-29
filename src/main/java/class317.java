import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class317 {

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lya;")
    private class38 field4789;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Llm;")
    private class348 field4782;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field4798;

    static {
        new class234("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;II[IIII[IILjava/lang/String;II[Ll;BI)I", line = 6)
    public final int method2027(Random arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, String arg9, int arg10, int arg11, class16[] arg12, byte arg13, int arg14) {
        field4784++;
        if (arg9 == null) {
            return 0;
        }
        arg0.setSeed((long) arg10);
        int var16 = (arg0.nextInt() & 0x1F) + 192;
        this.method2033(var16 << 24 | arg6 & 0xFFFFFF, var16 << 24 | arg5 & 0xFFFFFF, (byte) -94);
        int var17 = arg9.length();
        int[] var18 = new int[var17];
        if (arg13 != -107) {
            this.field4782 = null;
        }
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg0.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg1;
        int var22 = arg8 + this.field4782.field5150;
        if (arg14 == 1) {
            var22 += (arg4 - this.field4782.field5137 - this.field4782.field5150) / 2;
        } else if (arg14 == 2) {
            var22 = arg4 + arg8 - this.field4782.field5137;
        }
        int var23 = -1;
        if (arg11 == 1) {
            var23 = var19 + this.field4782.method2174(-33, arg9);
            var21 = (arg2 - var23) / 2 + arg1;
        } else if (arg11 == 2) {
            var23 = var19 + this.field4782.method2174(arg13 + 74, arg9);
            var21 = arg2 + arg1 - var23;
        }
        this.method2039(var21, var22, arg9, arg12, null, arg7, (byte) 112, var18);
        if (arg3 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field4782.method2174(-33, arg9);
            }
            arg3[3] = this.field4782.field5150 + this.field4782.field5137;
            arg3[1] = var22 - this.field4782.field5150;
            arg3[2] = var23;
            arg3[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 86)
    private final void method2028(int arg0, String arg1, int arg2) {
        field4797++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg1.length(); var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg0 > ~var4) {
            class155.field2314 = (arg2 - this.field4782.method2174(-33, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 130)
    private final void method2029(String arg0, int arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class204.field3374 = class204.field3374 & 0xFF000000 | class529.method3132((byte) 84, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class204.field3374 = class420.field6267 & 0xFFFFFF | class204.field3374 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class204.field3374 = class529.method3132((byte) 72, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class204.field3374 = class420.field6267;
            } else if (arg0.startsWith("str=")) {
                class409.field6104 = class204.field3374 & 0xFF000000 | class529.method3132((byte) 111, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                class409.field6104 = class204.field3374 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class409.field6104 = -1;
            } else if (arg0.startsWith("u=")) {
                class74.field1070 = class204.field3374 & 0xFF000000 | class529.method3132((byte) 70, arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                class74.field1070 = class204.field3374 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class74.field1070 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class465.field6732 = 0;
            } else if (arg0.startsWith("shad=")) {
                class465.field6732 = class204.field3374 & 0xFF000000 | class529.method3132((byte) 100, arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                class465.field6732 = class204.field3374 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class465.field6732 = class175.field2602;
            } else if (arg0.equals("br")) {
                this.method2033(class175.field2602, class420.field6267, (byte) -83);
            }
        } catch (Exception var3) {
        }
        field4780++;
        if (arg1 != -31576) {
            this.field4782 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 213)
    public final void method2030(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4798++;
        if (arg1 != null) {
            this.method2033(arg2, arg4, (byte) 125);
            this.method2040(null, null, -18, arg0, arg1, null, arg5 - this.field4782.method2174(arg3 - 33, arg1) / 2, 0, arg3);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIBLjava/lang/String;I)V", line = 225)
    public final void method2031(int arg0, int arg1, int arg2, int arg3, byte arg4, String arg5, int arg6) {
        int var8 = 30 / ((arg4 - 61) / 62);
        field4793++;
        if (arg5 == null) {
            return;
        }
        this.method2033(arg2, arg6, (byte) -96);
        int var9 = arg5.length();
        int[] var10 = new int[var9];
        for (int var11 = 0; var11 < var9; var11++) {
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method2039(arg1 - (this.field4782.method2174(-33, arg5) / 2), arg3, arg5, null, var10, null, (byte) 109, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;IIILma;I[Ll;I[IIIIIIII)I", line = 250)
    public final int method2032(byte arg0, String arg1, int arg2, int arg3, int arg4, class10 arg5, int arg6, class16[] arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field4787++;
        if (arg1 == null) {
            return 0;
        }
        this.method2033(arg12, arg3, (byte) -89);
        if (arg2 == 0) {
            arg2 = this.field4782.field5151;
        }
        int[] var18;
        if (arg16 < this.field4782.field5150 + this.field4782.field5137 + arg2 && arg16 < arg2 + arg2) {
            var18 = null;
        } else {
            var18 = new int[] { arg15 };
        }
        if (arg11 == -1) {
            arg11 = arg16 / arg2;
            if (arg11 <= 0) {
                arg11 = 1;
            }
        }
        int var19 = this.field4782.method2164(arg7, (byte) 92, arg1, var18, class329.field4937);
        if (arg0 >= -113) {
            this.method2027(null, 105, -110, null, -45, 63, -112, null, -114, null, -6, -51, null, (byte) -5, 26);
        }
        if (arg11 > 0 && var19 >= arg11) {
            class329.field4937[arg11 - 1] = this.field4782.method2167(arg7, arg15, class329.field4937[arg11 - 1], (byte) -12);
            var19 = arg11;
        }
        if (arg10 == 3 && var19 == 1) {
            arg10 = 1;
        }
        int var20;
        if (arg10 == 0) {
            var20 = this.field4782.field5150 + arg4;
        } else if (arg10 == 1) {
            var20 = arg4 - (-((arg16 - (this.field4782.field5150 + this.field4782.field5137) - ((var19 + -1) * arg2)) / 2) - this.field4782.field5150);
        } else if (arg10 == 2) {
            var20 = arg16 + arg4 - this.field4782.field5137 - ((var19 + -1) * arg2);
        } else {
            int var21 = (arg16 - this.field4782.field5150 - this.field4782.field5137 - ((var19 + -1) * arg2)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg2 += var21;
            var20 = this.field4782.field5150 + var21 + arg4;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg14 == 0) {
                this.method2040(arg7, arg5, 120, var20, class329.field4937[var22], arg9, arg8, arg13, arg6);
            } else if (arg14 == 1) {
                this.method2040(arg7, arg5, -43, var20, class329.field4937[var22], arg9, (arg15 - this.field4782.method2174(-33, class329.field4937[var22])) / 2 + arg8, arg13, arg6);
            } else if (arg14 == 2) {
                this.method2040(arg7, arg5, 107, var20, class329.field4937[var22], arg9, (arg8 + arg15) - this.field4782.method2174(-33, class329.field4937[var22]), arg13, arg6);
            } else if ((var19 - 1) == var22) {
                this.method2040(arg7, arg5, 121, var20, class329.field4937[var22], arg9, arg8, arg13, arg6);
            } else {
                this.method2028(-1, class329.field4937[var22], arg15);
                this.method2040(arg7, arg5, 122, var20, class329.field4937[var22], arg9, arg8, arg13, arg6);
                class155.field2314 = 0;
            }
            var20 += arg2;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V", line = 353)
    private final void method2033(int arg0, int arg1, byte arg2) {
        class155.field2314 = 0;
        int var4 = 111 / ((-arg2 - 24) / 57);
        if (arg0 == -1) {
            arg0 = 0;
        }
        class318.field4806 = 0;
        class409.field6104 = -1;
        field4790++;
        class420.field6267 = arg1;
        class204.field3374 = arg1;
        class74.field1070 = -1;
        class175.field2602 = arg0;
        class465.field6732 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 374)
    public final void method2034(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field4785++;
        if (arg4 == null) {
            return;
        }
        this.method2033(arg5, arg1, (byte) 95);
        int var8 = arg4.length();
        if (arg2 != -1) {
            this.method2031(61, -119, -128, -33, (byte) 105, null, -38);
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2039(arg3 - (this.field4782.method2174(arg2 - 32, arg4) / 2), arg0, arg4, null, var10, null, (byte) 120, var9);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/String;IIII)V", line = 407)
    public final void method2035(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4779++;
        if (arg1 != null) {
            this.method2033(arg3, arg5, (byte) -84);
            this.method2040(null, null, -86, arg0, arg1, null, arg4 - this.field4782.method2174(-33, arg1), 0, arg2);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;II[Ll;I[IIIILjava/lang/String;)I", line = 422)
    public final int method2036(Random arg0, int arg1, int arg2, class16[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, String arg9) {
        field4786++;
        if (arg9 == null) {
            return 0;
        }
        arg0.setSeed((long) arg8);
        int var11 = (arg0.nextInt() & 0x1F) + 192;
        this.method2033(arg4 & 0xFFFFFF | var11 << 24, var11 << 24 | arg1 & 0xFFFFFF, (byte) 99);
        int var12 = arg9.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg0.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2039(arg2, arg7, arg9, arg3, null, arg5, (byte) 92, var13);
        if (arg6 == -8304) {
            return var14;
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Ll;[IIILjava/lang/String;III)V", line = 462)
    public final void method2037(class16[] arg0, int[] arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        if (arg5 > -28) {
            return;
        }
        field4788++;
        if (arg4 != null) {
            this.method2033(arg7, arg3, (byte) -128);
            this.method2040(arg0, null, -32, arg6, arg4, arg1, arg2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIIILjava/lang/String;)V", line = 478)
    public final void method2038(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5) {
        field4795++;
        if (arg5 == null) {
            return;
        }
        this.method2033(arg2, arg3, (byte) 92);
        if (arg1) {
            this.field4789 = null;
        }
        this.method2040(null, null, 122, arg4, arg5, null, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;[Ll;[I[IB[I)V", line = 493)
    private final void method2039(int arg0, int arg1, String arg2, class16[] arg3, int[] arg4, int[] arg5, byte arg6, int[] arg7) {
        field4792++;
        int var9 = arg1 - this.field4782.field5151;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class121.method903(-8303, arg2.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg2.substring(var10 + 1, var14);
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
                                    if (arg7 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg7[var12];
                                    }
                                    int var18;
                                    if (arg4 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg4[var12];
                                    }
                                    var12++;
                                    int var19 = class64.method555((byte) 124, var16.substring(4));
                                    class16 var20 = arg3[var19];
                                    int var21 = arg5 == null ? var20.method139() : arg5[var19];
                                    var20.method141(arg0 + var17, -var21 + var9 - (-this.field4782.field5151 - var18), 1, 0, 1);
                                    var11 = -1;
                                    arg0 += arg3[var19].method129();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2029(var16, -31576);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg0 += this.field4782.method2168(-102, var11, var15);
                    }
                    int var22;
                    if (arg7 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg7[var12];
                    }
                    int var23;
                    if (arg4 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg4[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class465.field6732 & 0xFF000000) != 0) {
                            this.method874(var15, var22 + arg0 + 1, var9 - -var23 + 1, class465.field6732, true);
                        }
                        this.method874(var15, arg0 + var22, var9 + var23, class204.field3374, false);
                    } else if (class155.field2314 > 0) {
                        class318.field4806 += class155.field2314;
                        arg0 += class318.field4806 >> 8;
                        class318.field4806 &= 0xFF;
                    }
                    int var24 = this.field4782.method2171(var15, 126);
                    if (class409.field6104 != -1) {
                        this.field4789.method278(arg0, var24, class409.field6104, var9 + ((int) ((double) this.field4782.field5151 * 0.7D)), true);
                    }
                    if (class74.field1070 != -1) {
                        this.field4789.method278(arg0, var24, class74.field1070, this.field4782.field5151 + var9, true);
                    }
                    var11 = var15;
                    arg0 += var24;
                }
            }
        }
        if (arg6 < 73) {
            this.method2034(-93, 45, -3, -128, null, 38, -13);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Ll;Lma;IILjava/lang/String;[IIII)V", line = 662)
    private final void method2040(class16[] arg0, class10 arg1, int arg2, int arg3, String arg4, int[] arg5, int arg6, int arg7, int arg8) {
        field4791++;
        int var10 = arg3 - this.field4782.field5151;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class121.method903(-8303, arg4.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg4.substring(var11 + 1, var14);
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
                                    int var17 = class64.method555((byte) 124, var16.substring(4));
                                    class16 var18 = arg0[var17];
                                    int var19 = arg5 == null ? var18.method139() : arg5[var17];
                                    if ((class204.field3374 & 0xFF000000) == -16777216) {
                                        var18.method141(arg6, var10 + this.field4782.field5151 - var19, 1, 0, 1);
                                    } else {
                                        var18.method141(arg6, this.field4782.field5151 + var10 - var19, 0, class204.field3374 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg6 += arg0[var17].method129();
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method2029(var16, -31576);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg6 += this.field4782.method2168(-82, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class155.field2314 > 0) {
                            class318.field4806 += class155.field2314;
                            arg6 += class318.field4806 >> 8;
                            class318.field4806 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class465.field6732 & 0xFF000000) != 0) {
                            this.method874(var15, arg6 + 1, var10 + 1, class465.field6732, true);
                        }
                        this.method874(var15, arg6, var10, class204.field3374, false);
                    } else {
                        if ((class465.field6732 & 0xFF000000) != 0) {
                            this.method872(var15, arg6 + 1, var10 + 1, class465.field6732, true, arg1, arg8, arg7);
                        }
                        this.method872(var15, arg6, var10, class204.field3374, false, arg1, arg8, arg7);
                    }
                    int var20 = this.field4782.method2171(var15, 122);
                    if (class409.field6104 != -1) {
                        this.field4789.method278(arg6, var20, class409.field6104, (int) ((double) this.field4782.field5151 * 0.7D) + var10, true);
                    }
                    if (class74.field1070 != -1) {
                        this.field4789.method278(arg6, var20, class74.field1070, this.field4782.field5151 + var10 + 1, true);
                    }
                    var12 = var15;
                    arg6 += var20;
                }
            }
        }
        int var21 = -24 % ((40 - arg2) / 55);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lya;Llm;)V", line = 818)
    public class317(class38 arg0, class348 arg1) {
        this.field4789 = arg0;
        this.field4782 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIIIILjava/lang/String;)V", line = 827)
    public final void method2041(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field4781++;
        if (arg7 == null) {
            return;
        }
        this.method2033(arg6, arg0, (byte) -123);
        double var9 = 7.0D - (double) arg1 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        if (!arg2) {
            this.method2035(5, null, -63, 17, -94, 110);
        }
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg4));
        }
        this.method2039(arg5 - (this.field4782.method2174(-33, arg7) / 2), arg3, arg7, null, var12, null, (byte) 83, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 859)
    public static final void method2042(byte arg0) {
        class221.method1588(-26648, class377.field5692, (long) class475.field6854);
        field4783++;
        if (class155.field2310 != -1) {
            class6.method34(class155.field2310, 31673);
        }
        for (int var1 = 0; var1 < class109.field1529; var1++) {
            if (class277.field4219[var1]) {
                class8.field115[var1] = true;
            }
            class74.field1049[var1] = class277.field4219[var1];
            class277.field4219[var1] = false;
        }
        class376.field5641 = class475.field6854;
        if (class377.field5692.method347()) {
            class477.field6885 = true;
        }
        if (class155.field2310 != -1) {
            class109.field1529 = 0;
            class498.method2950(25477);
        }
        class377.field5692.method267();
        class52.method501(class377.field5692, 0);
        int var2 = class431.method2678(2);
        if (var2 == -1) {
            var2 = class287.field4348;
        }
        if (var2 == -1) {
            var2 = class23.field284;
        }
        class193.method1359(var2, (byte) -117);
        class295.field4496 = 0;
        if (arg0 <= 110) {
            method2042((byte) -69);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[Ll;Ljava/lang/String;ILma;[IIIIIIII)I", line = 915)
    public final int method2043(int arg0, int arg1, int arg2, int arg3, class16[] arg4, String arg5, int arg6, class10 arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field4796++;
        if (arg10 != 0) {
            this.field4789 = null;
        }
        return this.method2032((byte) -117, arg5, arg2, arg6, arg13, arg7, arg11, arg4, arg12, arg8, arg14, 0, arg15, arg0, arg1, arg3, arg9);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLma;II)V")
    public abstract void method872(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method874(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
