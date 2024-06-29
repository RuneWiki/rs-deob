import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class489 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lre;")
    private class425 field6785;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lqa;")
    private class162 field6799;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field6789 = 0;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[Z")
    public static boolean[] field6793;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method2805(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field6795++;
        if (arg4 == null) {
            return;
        }
        this.method2821(true, arg3, arg1);
        int var8 = arg4.length();
        if (arg2 != 5) {
            this.field6785 = null;
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2806(var10, (byte) -113, arg0, null, arg4, var9, arg5 - (this.field6785.method2455((byte) 112, arg4) / 2), null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IBI[Lf;Ljava/lang/String;[II[I)V")
    private final void method2806(int[] arg0, byte arg1, int arg2, class529[] arg3, String arg4, int[] arg5, int arg6, int[] arg7) {
        field6797++;
        int var9 = arg2 - this.field6785.field5814;
        int var10 = -1;
        int var11 = -1;
        int var12 = 39 % ((arg1 + 28) / 62);
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class427.method2463(true, arg4.charAt(var15)) & 0xFF);
            if (var16 == '<') {
                var10 = var15;
            } else {
                if (var16 == '>' && var10 != -1) {
                    String var17 = arg4.substring(var10 + 1, var15);
                    var10 = -1;
                    if (var17.equals("lt")) {
                        var16 = '<';
                    } else if (var17.equals("gt")) {
                        var16 = '>';
                    } else if (var17.equals("nbsp")) {
                        var16 = ' ';
                    } else if (var17.equals("shy")) {
                        var16 = '\u00AD';
                    } else if (var17.equals("times")) {
                        var16 = '×';
                    } else if (var17.equals("euro")) {
                        var16 = '€';
                    } else if (var17.equals("copy")) {
                        var16 = '©';
                    } else {
                        if (!var17.equals("reg")) {
                            if (var17.startsWith("img=")) {
                                try {
                                    int var18;
                                    if (arg5 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg5[var13];
                                    }
                                    int var19;
                                    if (arg0 == null) {
                                        var19 = 0;
                                    } else {
                                        var19 = arg0[var13];
                                    }
                                    var13++;
                                    int var20 = class300.method1752(true, var17.substring(4));
                                    class529 var21 = arg3[var20];
                                    int var22 = arg7 == null ? var21.method149() : arg7[var20];
                                    var21.method158(arg6 + var18, -var22 + this.field6785.field5814 + var9 + var19, 1, 0, 1);
                                    arg6 += arg3[var20].method151();
                                    var11 = -1;
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method2823(16765, var17);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg6 += this.field6785.method2446(var16, 0, var11);
                    }
                    int var23;
                    if (arg5 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg5[var13];
                    }
                    int var24;
                    if (arg0 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg0[var13];
                    }
                    var13++;
                    if (var16 != ' ') {
                        if ((class196.field2750 & 0xFF000000) != 0) {
                            this.method218(var16, arg6 + var23 + 1, var9 + var24 + 1, class196.field2750, true);
                        }
                        this.method218(var16, arg6 + var23, var9 - -var24, class140.field2041, false);
                    } else if (class85.field1298 > 0) {
                        class375.field5096 += class85.field1298;
                        arg6 += class375.field5096 >> 8;
                        class375.field5096 &= 0xFF;
                    }
                    int var25 = this.field6785.method2444(var16, -1);
                    if (class255.field3363 != -1) {
                        this.field6799.method1092(class255.field3363, -19380, var25, (int) ((double) this.field6785.field5814 * 0.7D) + var9, arg6);
                    }
                    if (class348.field4706 != -1) {
                        this.field6799.method1092(class348.field4706, -19380, var25, this.field6785.field5814 + var9, arg6);
                    }
                    arg6 += var25;
                    var11 = var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIILea;Ljava/lang/String;[Lf;I[III)I")
    public final int method2807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class381 arg10, String arg11, class529[] arg12, int arg13, int[] arg14, int arg15, int arg16) {
        field6792++;
        if (arg11 == null) {
            return 0;
        }
        this.method2821(true, arg7, arg0);
        if (arg1 == 0) {
            arg1 = this.field6785.field5814;
        }
        int[] var18;
        if ((this.field6785.field5803 + this.field6785.field5800 + arg1) > arg13 && arg13 < arg1 + arg1) {
            var18 = null;
        } else {
            var18 = new int[] { arg5 };
        }
        if (arg4 == -1) {
            arg4 = arg13 / arg1;
            if (arg4 <= 0) {
                arg4 = 1;
            }
        }
        int var19 = this.field6785.method2453(class378.field5112, arg11, arg12, (byte) -128, var18);
        if (arg15 < arg4 && var19 >= arg4) {
            var19 = arg4;
            class378.field5112[arg4 - 1] = this.field6785.method2448(class378.field5112[arg4 - 1], (byte) -125, arg12, arg5);
        }
        if (arg3 == 3 && var19 == 1) {
            arg3 = 1;
        }
        int var20;
        if (arg3 == 0) {
            var20 = arg2 + this.field6785.field5803;
        } else if (arg3 == 1) {
            var20 = arg2 - (-this.field6785.field5803 - (arg13 - this.field6785.field5800 - ((var19 + -1) * arg1) - this.field6785.field5803) / 2);
        } else if (arg3 == 2) {
            var20 = arg2 - this.field6785.field5800 - ((var19 + -1) * arg1 + -arg13);
        } else {
            int var21 = (arg13 - (var19 - 1) * arg1 - this.field6785.field5803 - this.field6785.field5800) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg2 + var21 + this.field6785.field5803;
            arg1 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg16 == 0) {
                this.method2814(arg9, arg12, 0, arg6, arg10, arg8, class378.field5112[var22], var20, arg14);
            } else if (arg16 == 1) {
                this.method2814(arg9 + (arg5 - this.field6785.method2455((byte) 121, class378.field5112[var22])) / 2, arg12, 0, arg6, arg10, arg8, class378.field5112[var22], var20, arg14);
            } else if (arg16 == 2) {
                this.method2814(arg9 + arg5 - this.field6785.method2455((byte) 124, class378.field5112[var22]), arg12, 0, arg6, arg10, arg8, class378.field5112[var22], var20, arg14);
            } else if ((var19 - 1) == var22) {
                this.method2814(arg9, arg12, arg15, arg6, arg10, arg8, class378.field5112[var22], var20, arg14);
            } else {
                this.method2813(arg5, class378.field5112[var22], 0);
                this.method2814(arg9, arg12, 0, arg6, arg10, arg8, class378.field5112[var22], var20, arg14);
                class85.field1298 = 0;
            }
            var20 += arg1;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method2808(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field6805++;
        if (arg4 == null) {
            return;
        }
        this.method2821(true, arg3, arg1);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg6 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2806(var9, (byte) -122, arg0, null, arg4, null, arg2 - this.field6785.method2455((byte) 104, arg4) / arg5, null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method2809(int arg0) {
        if (arg0 != 0) {
            method2815(77, -50, -28, 108, 39, 53, -121, 47, -39, -93);
        }
        field6800++;
        class32.field526 = true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method2810(byte arg0) {
        field6793 = null;
        if (arg0 != 97) {
            field6789 = 91;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;[IIILjava/util/Random;IIII[Lf;)I")
    public final int method2811(String arg0, int[] arg1, int arg2, int arg3, Random arg4, int arg5, int arg6, int arg7, int arg8, class529[] arg9) {
        field6802++;
        if (arg0 == null) {
            return 0;
        }
        arg4.setSeed((long) arg2);
        int var11 = (arg4.nextInt() & 0x1F) + 192;
        this.method2821(true, arg5 & 0xFFFFFF | var11 << 24, var11 << 24 | arg6 & 0xFFFFFF);
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = -77 / ((5 - arg3) / 40);
        int var15 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            var13[var16] = var15;
            if ((arg4.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        this.method2806(null, (byte) 63, arg8, arg9, arg0, var13, arg7, arg1);
        return var15;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
    public final void method2812(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        field6803++;
        if (arg5 == null) {
            return;
        }
        this.method2821(true, arg3, arg0);
        this.method2814(arg4 - (this.field6785.method2455((byte) 106, arg5) / 2), null, 0, 0, null, 0, arg5, arg1, null);
        if (arg2 < 27) {
            field6793 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method2813(int arg0, String arg1, int arg2) {
        field6801++;
        int var4 = arg2;
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
        if (var4 > 0) {
            class85.field1298 = (arg0 - this.field6785.method2455((byte) 120, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lf;IILea;ILjava/lang/String;I[I)V")
    private final void method2814(int arg0, class529[] arg1, int arg2, int arg3, class381 arg4, int arg5, String arg6, int arg7, int[] arg8) {
        field6790++;
        int var10 = arg7 - this.field6785.field5814;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg6.length();
        for (int var14 = arg2; var14 < var13; var14++) {
            char var15 = (char) (class427.method2463(true, arg6.charAt(var14)) & 0xFF);
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
                                    int var17 = class300.method1752(true, var16.substring(4));
                                    class529 var18 = arg1[var17];
                                    int var19 = arg8 == null ? var18.method149() : arg8[var17];
                                    if ((class140.field2041 & 0xFF000000) == -16777216) {
                                        var18.method158(arg0, this.field6785.field5814 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method158(arg0, this.field6785.field5814 + var10 - var19, 0, class140.field2041 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg0 += arg1[var17].method151();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2823(arg2 ^ 0x417D, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field6785.method2446(var15, 0, var12);
                    }
                    if (var15 == ' ') {
                        if (class85.field1298 > 0) {
                            class375.field5096 += class85.field1298;
                            arg0 += class375.field5096 >> 8;
                            class375.field5096 &= 0xFF;
                        }
                    } else if (arg4 == null) {
                        if ((class196.field2750 & 0xFF000000) != 0) {
                            this.method218(var15, arg0 + 1, var10 + 1, class196.field2750, true);
                        }
                        this.method218(var15, arg0, var10, class140.field2041, false);
                    } else {
                        if ((class196.field2750 & 0xFF000000) != 0) {
                            this.method213(var15, arg0 + 1, var10 + 1, class196.field2750, true, arg4, arg5, arg3);
                        }
                        this.method213(var15, arg0, var10, class140.field2041, false, arg4, arg5, arg3);
                    }
                    int var20 = this.field6785.method2444(var15, -1);
                    if (class255.field3363 != -1) {
                        this.field6799.method1092(class255.field3363, -19380, var20, (int) ((double) this.field6785.field5814 * 0.7D) + var10, arg0);
                    }
                    if (class348.field4706 != -1) {
                        this.field6799.method1092(class348.field4706, -19380, var20, var10 + this.field6785.field5814 + 1, arg0);
                    }
                    var12 = var15;
                    arg0 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method218(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6804++;
        if (!class28.method230(arg3, 106) || arg6 > -9) {
            return;
        }
        if (class462.field6402[arg3] == null) {
            client.method1263(class238.field3185[arg3], -1, arg7, arg5, arg0, arg4, arg2, arg8, arg9, arg1);
        } else {
            client.method1263(class462.field6402[arg3], -1, arg7, arg5, arg0, arg4, arg2, arg8, arg9, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V")
    public final void method2816(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field6798++;
        if (arg0 != null && arg1) {
            this.method2821(arg1, arg3, arg5);
            this.method2814(arg4, null, 0, 0, null, 0, arg0, arg2, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[Lf;II[IILjava/lang/String;)V")
    public final void method2817(int arg0, int arg1, class529[] arg2, int arg3, int arg4, int[] arg5, int arg6, String arg7) {
        field6786++;
        if (arg7 != null) {
            this.method2821(true, arg3, arg4);
            this.method2814(arg0, arg2, 0, arg6, null, 0, arg7, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLea;II)V")
    public abstract void method213(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBLea;II[Lf;IIIIII[IILjava/lang/String;)I")
    public final int method2818(int arg0, int arg1, byte arg2, class381 arg3, int arg4, int arg5, class529[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14, String arg15) {
        field6787++;
        if (arg2 > -127) {
            method2822(51);
        }
        return this.method2807(arg0, arg12, arg5, arg4, 0, arg8, arg7, arg9, arg1, arg11, arg3, arg15, arg6, arg10, arg13, 0, arg14);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;IBIIII)V")
    public final void method2819(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field6791++;
        if (arg1 == null) {
            return;
        }
        this.method2821(true, arg0, arg4);
        if (arg3 != 109) {
            this.method2818(105, -51, (byte) 99, null, 25, -103, null, 18, -116, -51, -6, -75, -65, null, 125, null);
        }
        double var9 = 7.0D - ((double) arg2 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg7));
        }
        this.method2806(var12, (byte) 56, arg5, null, arg1, null, arg6 - (this.field6785.method2455((byte) 116, arg1) / 2), null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method2820(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6796++;
        if (arg0 != null) {
            this.method2821(true, arg5, arg2);
            this.method2814(arg4 - this.field6785.method2455((byte) 126, arg0), null, 0, arg1, null, 0, arg0, arg3, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)V")
    private final void method2821(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field6793 = null;
        }
        class255.field3363 = -1;
        class375.field5096 = 0;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class48.field747 = arg1;
        class140.field2041 = arg1;
        class348.field4706 = -1;
        class85.field1298 = 0;
        field6806++;
        class222.field3001 = arg2;
        class196.field2750 = arg2;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static final void method2822(int arg0) {
        field6794++;
        int var1 = -64 % ((49 - arg0) / 62);
        class485.field6744 = new class280();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method2823(int arg0, String arg1) {
        field6807++;
        if (arg0 != 16765) {
            return;
        }
        try {
            if (arg1.startsWith("col=")) {
                class140.field2041 = class140.field2041 & 0xFF000000 | class451.method2576(arg0 - 16650, 16, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class140.field2041 = class48.field747 & 0xFFFFFF | class140.field2041 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class140.field2041 = class451.method2576(107, 16, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class140.field2041 = class48.field747;
            } else if (arg1.startsWith("str=")) {
                class255.field3363 = class451.method2576(arg0 - 16715, 16, arg1.substring(4)) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class255.field3363 = -8388608;
            } else if (arg1.equals("/str")) {
                class255.field3363 = -1;
            } else if (arg1.startsWith("u=")) {
                class348.field4706 = class451.method2576(59, 16, arg1.substring(2)) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class348.field4706 = -16777216;
            } else if (arg1.equals("/u")) {
                class348.field4706 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class196.field2750 = 0;
            } else if (arg1.startsWith("shad=")) {
                class196.field2750 = class451.method2576(89, 16, arg1.substring(5)) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class196.field2750 = -16777216;
            } else if (arg1.equals("/shad")) {
                class196.field2750 = class222.field3001;
                return;
            } else if (arg1.equals("br")) {
                this.method2821(true, class48.field747, class222.field3001);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lqa;Lre;)V")
    public class489(class162 arg0, class425 arg1) {
        this.field6785 = arg1;
        this.field6799 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB[IILjava/util/Random;I[ILjava/lang/String;IIII[Lf;II)I")
    public final int method2824(int arg0, byte arg1, int[] arg2, int arg3, Random arg4, int arg5, int[] arg6, String arg7, int arg8, int arg9, int arg10, int arg11, class529[] arg12, int arg13, int arg14) {
        field6788++;
        if (arg7 == null) {
            return 0;
        }
        arg4.setSeed((long) arg10);
        int var16 = (arg4.nextInt() & 0x1F) + 192;
        this.method2821(true, var16 << 24 | arg9 & 0xFFFFFF, var16 << 24 | arg13 & 0xFFFFFF);
        int var17 = arg7.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg4.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg5;
        int var22 = this.field6785.field5803 + arg0;
        int var23 = -1;
        if (arg1 != 61) {
            method2822(-119);
        }
        if (arg11 == 1) {
            var22 += (arg3 - (this.field6785.field5803 + this.field6785.field5800)) / 2;
        } else if (arg11 == 2) {
            var22 = arg0 + arg3 - this.field6785.field5800;
        }
        if (arg8 == 1) {
            var23 = this.field6785.method2455((byte) 126, arg7) + var19;
            var21 = (arg14 - var23) / 2 + arg5;
        } else if (arg8 == 2) {
            var23 = this.field6785.method2455((byte) 109, arg7) + var19;
            var21 = arg14 + arg5 - var23;
        }
        this.method2806(null, (byte) 80, var22, arg12, arg7, var18, var21, arg6);
        if (arg2 != null) {
            if (var23 == -1) {
                var23 = this.field6785.method2455((byte) 114, arg7) + var19;
            }
            arg2[1] = var22 - this.field6785.field5803;
            arg2[2] = var23;
            arg2[0] = var21;
            arg2[3] = this.field6785.field5803 + this.field6785.field5800;
        }
        return var19;
    }
}
