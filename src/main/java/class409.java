import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class409 {

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lr;")
    private class562 field5382;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Laga;")
    private class658 field5388;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lfn;")
    public static class286 field5371 = new class286();

    @OriginalMember(owner = "client!la", name = "t", descriptor = "[I")
    public static int[] field5390 = new int[6];

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lmt;")
    public static class680 field5392 = new class680();

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Lti;")
    public static class325 field5387;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method2316(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field5379++;
        if (arg3 != null) {
            this.method2319(arg1, arg5 ^ 0xFFFFDC74, arg4);
            this.method2327(arg5 - 1, arg0, null, null, arg3, arg5, 0, arg2, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBII[I[Lf;ILjava/lang/String;)V")
    public final void method2317(int arg0, byte arg1, int arg2, int arg3, int[] arg4, class532[] arg5, int arg6, String arg7) {
        field5374++;
        if (arg7 != null) {
            this.method2319(arg6, -9100, arg3);
            if (arg1 > 10) {
                this.method2327(-1, arg2, arg5, null, arg7, 0, 0, arg0, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lf;IIIII[ILjava/lang/String;III[ILjava/util/Random;)I")
    public final int method2318(int arg0, int arg1, class532[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, String arg9, int arg10, int arg11, int arg12, int[] arg13, Random arg14) {
        field5375++;
        if (arg9 == null) {
            return 0;
        }
        arg14.setSeed((long) arg11);
        int var16 = (arg14.nextInt() & 0x1F) + 192;
        this.method2319(var16 << 24 | arg0 & 0xFFFFFF, arg1 ^ 0xFFFFAA5E, arg12 & 0xFFFFFF | var16 << 24);
        int var17 = arg9.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg14.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg7;
        int var22 = this.field5388.field9375 + arg10;
        int var23 = -1;
        if (arg4 == 1) {
            var22 += (arg5 - this.field5388.field9375 - this.field5388.field9366) / 2;
        } else if (arg4 == 2) {
            var22 = arg5 + arg10 - this.field5388.field9366;
        }
        if (arg1 != 30250) {
            this.field5388 = null;
        }
        if (arg3 == 1) {
            var23 = var19 + this.field5388.method3765(arg9, (byte) 6);
            var21 = (arg6 - var23) / 2 + arg7;
        } else if (arg3 == 2) {
            var23 = var19 + this.field5388.method3765(arg9, (byte) 6);
            var21 = arg6 + arg7 - var23;
        }
        this.method2333(arg9, var18, null, var22, var21, arg8, arg2, -15028);
        if (arg13 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field5388.method3765(arg9, (byte) 6);
            }
            arg13[0] = var21;
            arg13[1] = var22 - this.field5388.field9375;
            arg13[2] = var23;
            arg13[3] = this.field5388.field9375 + this.field5388.field9366;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    private final void method2319(int arg0, int arg1, int arg2) {
        class10.field101 = 0;
        class696.field9851 = arg0;
        class329.field4424 = arg0;
        class19.field249 = -1;
        class342.field4582 = 0;
        class98.field1192 = -1;
        field5391++;
        if (arg2 == -1) {
            arg2 = 0;
        }
        if (arg1 == -9100) {
            class610.field8470 = arg2;
            class419.field5509 = arg2;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)I")
    public static final int method2320(int arg0, boolean arg1) {
        if (arg1) {
            return 4;
        }
        field5381++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method2321(String arg0, int arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class329.field4424 = class329.field4424 & 0xFF000000 | class645.method3587(116, 16, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class329.field4424 = class329.field4424 & 0xFF000000 | class696.field9851 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class329.field4424 = class645.method3587(115, 16, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class329.field4424 = class696.field9851;
            } else if (arg0.startsWith("str=")) {
                class19.field249 = class329.field4424 & 0xFF000000 | class645.method3587(116, 16, arg0.substring(4));
            } else if (arg0.equals("str")) {
                class19.field249 = class329.field4424 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class19.field249 = -1;
            } else if (arg0.startsWith("u=")) {
                class98.field1192 = class329.field4424 & 0xFF000000 | class645.method3587(118, 16, arg0.substring(2));
            } else if (arg0.equals("u")) {
                class98.field1192 = class329.field4424 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class98.field1192 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class419.field5509 = 0;
            } else if (arg0.startsWith("shad=")) {
                class419.field5509 = class329.field4424 & 0xFF000000 | class645.method3587(115, 16, arg0.substring(5));
            } else if (arg0.equals("shad")) {
                class419.field5509 = class329.field4424 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class419.field5509 = class610.field8470;
            } else if (arg0.equals("br")) {
                this.method2319(class696.field9851, -9100, class610.field8470);
            }
            int var3 = -76 / ((-arg1 - 48) / 63);
        } catch (Exception var4) {
        }
        field5384++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method2322(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5386++;
        if (arg1 == null) {
            return;
        }
        this.method2319(arg0, arg3 - 9105, arg5);
        if (arg3 != 5) {
            return;
        }
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2333(arg1, null, var9, arg6, arg4 - this.field5388.method3765(arg1, (byte) 6) / 2, null, null, arg3 - 15033);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method2323(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field5372++;
        if (arg4 != null && arg0 > 4) {
            this.method2319(arg3, -9100, arg1);
            this.method2327(-1, arg2 - this.field5388.method3765(arg4, (byte) 6) / 2, null, null, arg4, 0, 0, arg5, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBLjava/lang/String;II)V")
    public final void method2324(int arg0, int arg1, byte arg2, String arg3, int arg4, int arg5) {
        field5380++;
        if (arg3 == null) {
            return;
        }
        this.method2319(arg0, -9100, arg1);
        if (arg2 != 115) {
            this.method2330(null, (byte) 75, 25);
        }
        this.method2327(-1, arg5 - this.field5388.method3765(arg3, (byte) 6), null, null, arg3, 0, 0, arg4, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IIIIZLjava/lang/String;I[Lf;IILua;IIIII)I")
    public final int method2325(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, String arg6, int arg7, class532[] arg8, int arg9, int arg10, class596 arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field5377++;
        if (arg6 == null) {
            return 0;
        }
        this.method2319(arg4, -9100, arg15);
        if (arg0 == 0) {
            arg0 = this.field5388.field9382;
        }
        int[] var18;
        if ((this.field5388.field9366 + arg0 + this.field5388.field9375) > arg10 && (arg0 + arg0) > arg10) {
            var18 = null;
        } else {
            var18 = new int[] { arg13 };
        }
        int var19 = this.field5388.method3760(var18, 1499, class601.field8400, arg6, arg8);
        if (arg7 == -1) {
            arg7 = arg10 / arg0;
            if (arg7 <= 0) {
                arg7 = 1;
            }
        }
        if (arg7 > 0 && var19 >= arg7) {
            class601.field8400[arg7 - 1] = this.field5388.method3764(arg13, 169, class601.field8400[arg7 - 1], arg8);
            var19 = arg7;
        }
        if (arg16 == 3 && var19 == 1) {
            arg16 = 1;
        }
        int var20;
        if (arg16 == 0) {
            var20 = this.field5388.field9375 + arg9;
        } else if (arg16 == 1) {
            var20 = (arg10 - this.field5388.field9375 - this.field5388.field9366 - ((var19 - 1) * arg0)) / 2 + arg9 + this.field5388.field9375;
        } else if (arg16 == 2) {
            var20 = arg9 + arg10 - this.field5388.field9366 - ((var19 - 1) * arg0);
        } else {
            int var21 = (arg10 - ((var19 - 1) * arg0 + this.field5388.field9375) - this.field5388.field9366) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg9 + var21 + this.field5388.field9375;
            arg0 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg14 == 0) {
                this.method2327(-1, arg12, arg8, arg11, class601.field8400[var22], arg2, arg3, var20, arg1);
            } else if (arg14 == 1) {
                this.method2327(-1, arg12 + (arg13 - this.field5388.method3765(class601.field8400[var22], (byte) 6)) / 2, arg8, arg11, class601.field8400[var22], arg2, arg3, var20, arg1);
            } else if (arg14 == 2) {
                this.method2327(-1, arg13 + arg12 - this.field5388.method3765(class601.field8400[var22], (byte) 6), arg8, arg11, class601.field8400[var22], arg2, arg3, var20, arg1);
            } else if (var19 - 1 == var22) {
                this.method2327(-1, arg12, arg8, arg11, class601.field8400[var22], arg2, arg3, var20, arg1);
            } else {
                this.method2330(class601.field8400[var22], (byte) -75, arg13);
                this.method2327(-1, arg12, arg8, arg11, class601.field8400[var22], arg2, arg3, var20, arg1);
                class10.field101 = 0;
            }
            var20 += arg0;
        }
        if (arg5) {
            this.field5382 = null;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method2326(int arg0) {
        if (arg0 != -1) {
            method2326(-83);
        }
        field5387 = null;
        field5371 = null;
        field5392 = null;
        field5390 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[Lf;Lua;Ljava/lang/String;III[I)V")
    private final void method2327(int arg0, int arg1, class532[] arg2, class596 arg3, String arg4, int arg5, int arg6, int arg7, int[] arg8) {
        field5383++;
        int var10 = arg7 - this.field5388.field9382;
        int var11 = arg0;
        int var12 = -1;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class63.method368((byte) -118, arg4.charAt(var14)) & 0xFF);
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
                                    int var17 = class289.method1717(var16.substring(4), -97);
                                    class532 var18 = arg2[var17];
                                    int var19 = arg8 == null ? var18.method532() : arg8[var17];
                                    if ((class329.field4424 & 0xFF000000) == -16777216) {
                                        var18.method217(arg1, this.field5388.field9382 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method217(arg1, var10 + this.field5388.field9382 - var19, 0, class329.field4424 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg1 += arg2[var17].method523();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2321(var16, -123);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field5388.method3757(var12, (byte) 114, var15);
                    }
                    if (var15 == ' ') {
                        if (class10.field101 > 0) {
                            class342.field4582 += class10.field101;
                            arg1 += class342.field4582 >> 8;
                            class342.field4582 &= 0xFF;
                        }
                    } else if (arg3 == null) {
                        if ((class419.field5509 & 0xFF000000) != 0) {
                            this.method754(var15, arg1 + 1, var10 + 1, class419.field5509, true);
                        }
                        this.method754(var15, arg1, var10, class329.field4424, false);
                    } else {
                        if ((class419.field5509 & 0xFF000000) != 0) {
                            this.method756(var15, arg1 + 1, var10 + 1, class419.field5509, true, arg3, arg6, arg5);
                        }
                        this.method756(var15, arg1, var10, class329.field4424, false, arg3, arg6, arg5);
                    }
                    int var20 = this.field5388.method3762(var15, (byte) 111);
                    if (class19.field249 != -1) {
                        this.field5382.method3122(1, arg1, (int) ((double) this.field5388.field9382 * 0.7D) + var10, class19.field249, var20);
                    }
                    if (class98.field1192 != -1) {
                        this.field5382.method3122(arg0 + 2, arg1, this.field5388.field9382 + var10 + 1, class98.field1192, var20);
                    }
                    var12 = var15;
                    arg1 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lf;I[ILjava/lang/String;ILjava/util/Random;IIII)I")
    public final int method2328(class532[] arg0, int arg1, int[] arg2, String arg3, int arg4, Random arg5, int arg6, int arg7, int arg8, int arg9) {
        field5378++;
        if (arg3 == null) {
            return 0;
        }
        arg5.setSeed((long) arg9);
        int var11 = (arg5.nextInt() & 0x1F) + 192;
        this.method2319(arg6 & 0xFFFFFF | var11 << 24, -9100, var11 << 24 | arg8 & 0xFFFFFF);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg5.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        if (arg1 == -1) {
            this.method2333(arg3, var13, null, arg4, arg7, arg2, arg0, arg1 - 15027);
            return var14;
        } else {
            return -47;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public final void method2329(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field5373++;
        if (arg5 == null) {
            return;
        }
        this.method2319(arg4, -9100, arg6);
        double var9 = 7.0D - ((double) arg2 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        int var13 = 78 / ((arg7 + 48) / 47);
        for (int var14 = 0; var14 < var11; var14++) {
            var12[var14] = (int) (Math.sin((double) var14 / 1.5D + (double) arg1) * var9);
        }
        this.method2333(arg5, null, var12, arg0, arg3 - (this.field5388.method3765(arg5, (byte) 6) / 2), null, null, -15028);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    private final void method2330(String arg0, byte arg1, int arg2) {
        if (arg1 != -75) {
            return;
        }
        field5389++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg0.length(); var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class10.field101 = (arg2 - this.field5388.method3765(arg0, (byte) 6) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLua;II)V")
    public abstract void method756(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(CIIIZ)V")
    public abstract void method754(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method2331(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field5376++;
        if (arg5 == null || arg4 < 56) {
            return;
        }
        this.method2319(arg6, -9100, arg1);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2333(arg5, var9, var10, arg3, arg0 - (this.field5388.method3765(arg5, (byte) 6) / 2), null, null, -15028);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[IILjava/lang/String;Lua;IIIIII[Lf;III)I")
    public final int method2332(int arg0, int arg1, int[] arg2, int arg3, String arg4, class596 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class532[] arg12, int arg13, int arg14, int arg15) {
        if (arg3 == 0) {
            field5393++;
            return this.method2325(arg6, arg2, arg7, arg8, arg11, false, arg4, 0, arg12, arg1, arg9, arg5, arg13, arg0, arg15, arg14, arg10);
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lr;Laga;)V")
    public class409(class562 arg0, class658 arg1) {
        this.field5382 = arg0;
        this.field5388 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;[I[III[I[Lf;I)V")
    private final void method2333(String arg0, int[] arg1, int[] arg2, int arg3, int arg4, int[] arg5, class532[] arg6, int arg7) {
        field5385++;
        int var9 = arg3 - this.field5388.field9382;
        if (arg7 != -15028) {
            this.method2319(-56, 50, -87);
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class63.method368((byte) -118, arg0.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg0.substring(var10 + 1, var14);
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
                                    if (arg1 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg1[var12];
                                    }
                                    int var18;
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class289.method1717(var16.substring(4), arg7 + 14924);
                                    class532 var20 = arg6[var19];
                                    int var21 = arg5 == null ? var20.method532() : arg5[var19];
                                    var20.method217(arg4 + var17, var9 + var18 + this.field5388.field9382 + -var21, 1, 0, 1);
                                    arg4 += arg6[var19].method523();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2321(var16, arg7 ^ 0x3AC8);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field5388.method3757(var11, (byte) 114, var15);
                    }
                    int var22;
                    if (arg1 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg1[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    if (var15 != ' ') {
                        if ((class419.field5509 & 0xFF000000) != 0) {
                            this.method754(var15, arg4 + var22 + 1, var9 + var23 - -1, class419.field5509, true);
                        }
                        this.method754(var15, arg4 + var22, var9 + var23, class329.field4424, false);
                    } else if (class10.field101 > 0) {
                        class342.field4582 += class10.field101;
                        arg4 += class342.field4582 >> 8;
                        class342.field4582 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field5388.method3762(var15, (byte) 117);
                    if (class19.field249 != -1) {
                        this.field5382.method3122(1, arg4, var9 + ((int) ((double) this.field5388.field9382 * 0.7D)), class19.field249, var24);
                    }
                    if (class98.field1192 != -1) {
                        this.field5382.method3122(arg7 ^ 0xFFFFC54D, arg4, this.field5388.field9382 + var9, class98.field1192, var24);
                    }
                    var11 = var15;
                    arg4 += var24;
                }
            }
        }
    }
}
