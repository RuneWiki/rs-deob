import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class310 {

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lap;")
    private class29 field4731;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lza;")
    private class299 field4726;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4721 = -1;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Ld;")
    public static class242 field4728 = new class242(64);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[Lo;[ILjava/lang/String;IIILta;I)V")
    private final void method2046(int arg0, class363[] arg1, int[] arg2, String arg3, int arg4, int arg5, int arg6, class340 arg7, int arg8) {
        int var10 = arg8 - this.field4731.field306;
        field4732++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg3.length();
        if (arg6 != 160) {
            this.method2060(120, 7, 35, -73, 71, null, null, null, (byte) 87, -80, -55, 62, 71, -28, null, -114, 89);
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class365.method2328(arg3.charAt(var14), (byte) -108) & 0xFF);
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
                                    int var17 = class453.method2777(var16.substring(4), arg6 - 150);
                                    class363 var18 = arg1[var17];
                                    int var19 = arg2 == null ? var18.method396() : arg2[var17];
                                    if ((class508.field7404 & 0xFF000000) == -16777216) {
                                        var18.method392(arg0, var10 + this.field4731.field306 - var19, 1, 0, 1);
                                    } else {
                                        var18.method392(arg0, this.field4731.field306 + var10 - var19, 0, class508.field7404 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg0 += arg1[var17].method394();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2062(true, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field4731.method167((byte) 127, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class174.field2685 > 0) {
                            class521.field7639 += class174.field2685;
                            arg0 += class521.field7639 >> 8;
                            class521.field7639 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class138.field2092 & 0xFF000000) != 0) {
                            this.method1441(var15, arg0 + 1, var10 + 1, class138.field2092, true);
                        }
                        this.method1441(var15, arg0, var10, class508.field7404, false);
                    } else {
                        if ((class138.field2092 & 0xFF000000) != 0) {
                            this.method1443(var15, arg0 + 1, var10 + 1, class138.field2092, true, arg7, arg5, arg4);
                        }
                        this.method1443(var15, arg0, var10, class508.field7404, false, arg7, arg5, arg4);
                    }
                    int var20 = this.field4731.method165(0, var15);
                    if (class138.field2083 != -1) {
                        this.field4726.method1986(1, class138.field2083, arg0, var20, (int) ((double) this.field4731.field306 * 0.7D) + var10);
                    }
                    if (class304.field4660 != -1) {
                        this.field4726.method1986(1, class304.field4660, arg0, var20, var10 + this.field4731.field306 + 1);
                    }
                    var12 = var15;
                    arg0 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method2047(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4736++;
        if (arg1 == null) {
            return;
        }
        if (arg4 != -1) {
            this.field4731 = null;
        }
        this.method2049(arg5, 103, arg3);
        this.method2046(arg0 - this.field4731.method174(arg1, (byte) -43) / 2, null, null, arg1, 0, 0, 160, null, arg2);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[II[Lo;IILjava/lang/String;I)V")
    public final void method2048(int arg0, int[] arg1, int arg2, class363[] arg3, int arg4, int arg5, String arg6, int arg7) {
        field4723++;
        if (arg6 == null) {
            return;
        }
        if (arg7 != 7701) {
            this.method1443('\u001f', 53, 86, 39, false, null, 56, 21);
        }
        this.method2049(arg5, 74, arg2);
        this.method2046(arg4, arg3, arg1, arg6, 0, 0, 160, null, arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    private final void method2049(int arg0, int arg1, int arg2) {
        field4729++;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class521.field7639 = 0;
        class304.field4660 = -1;
        class50.field775 = arg2;
        class508.field7404 = arg2;
        if (arg1 <= 64) {
            field4728 = null;
        }
        class174.field2685 = 0;
        class138.field2083 = -1;
        class366.field5402 = arg0;
        class138.field2092 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method2050(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field4718++;
        if (arg1 == null) {
            return;
        }
        this.method2049(arg2, arg4 ^ 0x2C6A, arg5);
        this.method2046(arg0 - this.field4731.method174(arg1, (byte) -71), null, null, arg1, 0, 0, 160, null, arg3);
        if (arg4 != 11308) {
            this.method2047(-77, null, -32, 105, -36, 122);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IBII)V")
    public final void method2051(int arg0, int arg1, String arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4725++;
        if (arg2 == null) {
            return;
        }
        this.method2049(arg1, 103, arg6);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        if (arg4 <= -54) {
            for (int var10 = 0; var10 < var8; var10++) {
                var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            }
            this.method2061(arg0 - (this.field4731.method174(arg2, (byte) -54) / 2), arg2, null, null, null, arg3, false, var9);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
    public final void method2052(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4739++;
        if (arg1 != null) {
            this.method2049(arg0, 70, arg2);
            if (arg3) {
                this.method2046(arg4, null, null, arg1, 0, 0, 160, null, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IBIII)V")
    public final void method2053(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4722++;
        if (arg1 == null) {
            return;
        }
        this.method2049(arg5, 127, arg2);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg3 >= -80) {
            this.method2049(-47, -46, 37);
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2061(arg4 - (this.field4731.method174(arg1, (byte) -124) / 2), arg1, var9, null, null, arg6, false, var10);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method2054(int arg0) {
        if (arg0 != 192) {
            return;
        }
        field4724++;
        if (class94.field1504) {
            return;
        }
        if (class40.field667.field4187) {
            class434.field6466 = ((int) class434.field6466 - 65 & 0xFFFFFF80);
        } else {
            class305.field4672 += (-class305.field4672 - 24.0F) / 2.0F;
        }
        class94.field1504 = true;
        class397.field5861 = true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public final void method2055(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4735++;
        if (arg0 == null) {
            return;
        }
        this.method2049(arg1, 102, arg4);
        if (arg2 != 30319) {
            this.field4726 = null;
        }
        double var9 = 7.0D - ((double) arg5 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg3) * var9);
        }
        this.method2061(arg7 - (this.field4731.method174(arg0, (byte) -50) / 2), arg0, null, null, null, arg6, false, var12);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLta;II)V")
    public abstract void method1443(char arg0, int arg1, int arg2, int arg3, boolean arg4, class340 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IZIIII[Lo;IILjava/util/Random;[I[I)I")
    public final int method2056(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, class363[] arg9, int arg10, int arg11, Random arg12, int[] arg13, int[] arg14) {
        field4738++;
        if (arg2 == null) {
            return 0;
        }
        arg12.setSeed((long) arg8);
        int var16 = (arg12.nextInt() & 0x1F) + 192;
        this.method2049(var16 << 24 | arg11 & 0xFFFFFF, 76, arg7 & 0xFFFFFF | var16 << 24);
        int var17 = arg2.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg12.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg0;
        int var22 = arg3 + this.field4731.field313;
        if (arg5 == 1) {
            var22 += (arg1 - this.field4731.field313 - this.field4731.field316) / 2;
        } else if (arg5 == 2) {
            var22 = arg3 + arg1 - this.field4731.field316;
        }
        if (arg4) {
            this.method2058(38, null, 71);
        }
        int var23 = -1;
        if (arg6 == 1) {
            var23 = var19 + this.field4731.method174(arg2, (byte) -83);
            var21 = (arg10 - var23) / 2 + arg0;
        } else if (arg6 == 2) {
            var23 = var19 + this.field4731.method174(arg2, (byte) -21);
            var21 = arg10 + arg0 - var23;
        }
        this.method2061(var21, arg2, var18, arg13, arg9, var22, arg4, null);
        if (arg14 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field4731.method174(arg2, (byte) -62);
            }
            arg14[1] = var22 - this.field4731.field313;
            arg14[3] = this.field4731.field313 + this.field4731.field316;
            arg14[0] = var21;
            arg14[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method1441(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI[Lo;Ljava/lang/String;I[IIILjava/util/Random;I)I")
    public final int method2057(boolean arg0, int arg1, class363[] arg2, String arg3, int arg4, int[] arg5, int arg6, int arg7, Random arg8, int arg9) {
        field4740++;
        if (arg3 == null) {
            return 0;
        }
        arg8.setSeed((long) arg4);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method2049(arg6 & 0xFFFFFF | var11 << 24, 74, arg1 & 0xFFFFFF | var11 << 24);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2061(arg9, arg3, var13, arg5, arg2, arg7, arg0, null);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method2058(int arg0, String arg1, int arg2) {
        field4734++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg1.length() > var6; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg0 != 1822293656) {
            this.method2051(-66, 97, null, 101, (byte) 81, -27, -57);
        }
        if (var4 > 0) {
            class174.field2685 = (arg2 - this.field4731.method174(arg1, (byte) -100) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lta;IIIII[Lo;I[IIIILjava/lang/String;III)I")
    public final int method2059(class340 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class363[] arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, String arg12, int arg13, int arg14, int arg15) {
        if (arg3 != 0) {
            this.method2061(-105, null, null, null, null, -126, true, null);
        }
        field4727++;
        return this.method2060(arg10, arg9, arg5, arg1, 0, arg0, arg12, arg8, (byte) -128, arg2, arg14, arg7, arg15, arg11, arg6, arg13, arg4);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILta;Ljava/lang/String;[IBIIIII[Lo;II)I")
    public final int method2060(int arg0, int arg1, int arg2, int arg3, int arg4, class340 arg5, String arg6, int[] arg7, byte arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class363[] arg14, int arg15, int arg16) {
        field4719++;
        if (arg6 == null) {
            return 0;
        }
        this.method2049(arg10, 110, arg16);
        if (arg2 == 0) {
            arg2 = this.field4731.field306;
        }
        int[] var18;
        if (this.field4731.field313 + arg2 + this.field4731.field316 > arg1 && arg1 < (arg2 + arg2)) {
            var18 = null;
        } else {
            var18 = new int[] { arg0 };
        }
        int var19 = this.field4731.method166(arg14, var18, arg6, class277.field4346, 5256);
        if (arg8 >= -14) {
            return 106;
        }
        if (arg4 == -1) {
            arg4 = arg1 / arg2;
            if (arg4 <= 0) {
                arg4 = 1;
            }
        }
        if (arg4 > 0 && arg4 <= var19) {
            var19 = arg4;
            class277.field4346[arg4 - 1] = this.field4731.method175(class277.field4346[arg4 - 1], 160, arg14, arg0);
        }
        if (arg3 == 3 && var19 == 1) {
            arg3 = 1;
        }
        int var20;
        if (arg3 == 0) {
            var20 = this.field4731.field313 + arg11;
        } else if (arg3 == 1) {
            var20 = (arg1 - this.field4731.field313 - (var19 + -1) * arg2 - this.field4731.field316) / 2 + this.field4731.field313 + arg11;
        } else if (arg3 == 2) {
            var20 = arg11 + arg1 - this.field4731.field316 - (var19 + -1) * arg2;
        } else {
            int var21 = (arg1 - this.field4731.field313 - ((var19 - 1) * arg2) - this.field4731.field316) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg2 += var21;
            var20 = this.field4731.field313 + arg11 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg13 == 0) {
                this.method2046(arg15, arg14, arg7, class277.field4346[var22], arg9, arg12, 160, arg5, var20);
            } else if (arg13 == 1) {
                this.method2046(arg15 + (arg0 - this.field4731.method174(class277.field4346[var22], (byte) -77)) / 2, arg14, arg7, class277.field4346[var22], arg9, arg12, 160, arg5, var20);
            } else if (arg13 == 2) {
                this.method2046(arg15 + (arg0 - this.field4731.method174(class277.field4346[var22], (byte) -35)), arg14, arg7, class277.field4346[var22], arg9, arg12, 160, arg5, var20);
            } else if (var19 - 1 == var22) {
                this.method2046(arg15, arg14, arg7, class277.field4346[var22], arg9, arg12, 160, arg5, var20);
            } else {
                this.method2058(1822293656, class277.field4346[var22], arg0);
                this.method2046(arg15, arg14, arg7, class277.field4346[var22], arg9, arg12, 160, arg5, var20);
                class174.field2685 = 0;
            }
            var20 += arg2;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;[I[I[Lo;IZ[I)V")
    private final void method2061(int arg0, String arg1, int[] arg2, int[] arg3, class363[] arg4, int arg5, boolean arg6, int[] arg7) {
        field4720++;
        int var9 = arg5 - this.field4731.field306;
        int var10 = -1;
        if (arg6) {
            method2054(4);
        }
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class365.method2328(arg1.charAt(var14), (byte) -108) & 0xFF);
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
                                    if (arg2 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg2[var12];
                                    }
                                    int var18;
                                    if (arg7 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg7[var12];
                                    }
                                    var12++;
                                    int var19 = class453.method2777(var16.substring(4), 10);
                                    class363 var20 = arg4[var19];
                                    int var21 = arg3 == null ? var20.method396() : arg3[var19];
                                    var20.method392(arg0 + var17, -var21 + var9 + var18 + this.field4731.field306, 1, 0, 1);
                                    var11 = -1;
                                    arg0 += arg4[var19].method394();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2062(true, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg0 += this.field4731.method167((byte) 115, var11, var15);
                    }
                    int var22;
                    if (arg2 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg2[var12];
                    }
                    int var23;
                    if (arg7 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg7[var12];
                    }
                    if (var15 != ' ') {
                        if ((class138.field2092 & 0xFF000000) != 0) {
                            this.method1441(var15, arg0 + var22 + 1, var23 + 1 + var9, class138.field2092, true);
                        }
                        this.method1441(var15, arg0 + var22, var9 - -var23, class508.field7404, false);
                    } else if (class174.field2685 > 0) {
                        class521.field7639 += class174.field2685;
                        arg0 += class521.field7639 >> 8;
                        class521.field7639 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4731.method165(0, var15);
                    if (class138.field2083 != -1) {
                        this.field4726.method1986(1, class138.field2083, arg0, var24, var9 + ((int) ((double) this.field4731.field306 * 0.7D)));
                    }
                    if (class304.field4660 != -1) {
                        this.field4726.method1986(1, class304.field4660, arg0, var24, var9 + this.field4731.field306);
                    }
                    arg0 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lza;Lap;)V")
    public class310(class299 arg0, class29 arg1) {
        this.field4731 = arg1;
        this.field4726 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLjava/lang/String;)V")
    private final void method2062(boolean arg0, String arg1) {
        try {
            if (arg1.startsWith("col=")) {
                class508.field7404 = class508.field7404 & 0xFF000000 | class444.method2742(arg1.substring(4), 16, 4) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class508.field7404 = class508.field7404 & 0xFF000000 | class50.field775 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class508.field7404 = class444.method2742(arg1.substring(5), 16, 4);
            } else if (arg1.equals("/argb")) {
                class508.field7404 = class50.field775;
            } else if (arg1.startsWith("str=")) {
                class138.field2083 = class508.field7404 & 0xFF000000 | class444.method2742(arg1.substring(4), 16, 4);
            } else if (arg1.equals("str")) {
                class138.field2083 = class508.field7404 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class138.field2083 = -1;
            } else if (arg1.startsWith("u=")) {
                class304.field4660 = class508.field7404 & 0xFF000000 | class444.method2742(arg1.substring(2), 16, 4);
            } else if (arg1.equals("u")) {
                class304.field4660 = class508.field7404 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class304.field4660 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class138.field2092 = 0;
            } else if (arg1.startsWith("shad=")) {
                class138.field2092 = class508.field7404 & 0xFF000000 | class444.method2742(arg1.substring(5), 16, 4);
            } else if (arg1.equals("shad")) {
                class138.field2092 = class508.field7404 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class138.field2092 = class366.field5402;
            } else if (arg1.equals("br")) {
                this.method2049(class366.field5402, 65, class50.field775);
            }
        } catch (Exception var3) {
        }
        field4737++;
        if (!arg0) {
            this.method2048(81, null, -47, null, 64, 100, null, 14);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method2063(byte arg0) {
        field4728 = null;
        if (arg0 != -92) {
            method2054(-95);
        }
    }
}
