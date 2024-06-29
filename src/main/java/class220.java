import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class220 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lja;")
    private class90 field3263;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lbs;")
    private class186 field3274;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3272 = "Unable to find ";

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lsd;")
    public static class68 field3275;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "[I")
    public static int[] field3280;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1666(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3286++;
        if (arg0 == null) {
            return;
        }
        this.method1683(arg6, arg3, arg5);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1686(arg4 - (this.field3274.method1448(arg0, -20814) / 2), -6394, arg0, (int[]) null, (int[]) null, (class421[]) null, arg2, var9);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/lang/String;ILjava/util/Random;II[IIII[Lof;II[II)I")
    public final int method1667(boolean arg0, String arg1, int arg2, Random arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, class421[] arg10, int arg11, int arg12, int[] arg13, int arg14) {
        field3287++;
        if (!arg0) {
            field3280 = null;
        }
        if (arg1 == null) {
            return 0;
        }
        arg3.setSeed((long) arg9);
        int var16 = (arg3.nextInt() & 0x1F) + 192;
        this.method1683(var16 << 24 | arg12 & 0xFFFFFF, -1, arg8 & 0xFFFFFF | var16 << 24);
        int var17 = arg1.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg3.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg11;
        int var22 = this.field3274.field2734 + arg5;
        if (arg14 == 1) {
            var22 += (arg4 - this.field3274.field2734 - this.field3274.field2740) / 2;
        } else if (arg14 == 2) {
            var22 = arg5 + arg4 - this.field3274.field2740;
        }
        int var23 = -1;
        if (arg2 == 1) {
            var23 = var19 + this.field3274.method1448(arg1, -20814);
            var21 = (arg7 - var23) / 2 + arg11;
        } else if (arg2 == 2) {
            var23 = this.field3274.method1448(arg1, -20814) + var19;
            var21 = arg7 + arg11 - var23;
        }
        this.method1686(var21, -6394, arg1, arg6, var18, arg10, var22, (int[]) null);
        if (arg13 != null) {
            if (var23 == -1) {
                var23 = this.field3274.method1448(arg1, -20814) + var19;
            }
            arg13[0] = var21;
            arg13[2] = var23;
            arg13[1] = var22 - this.field3274.field2734;
            arg13[3] = this.field3274.field2740 + this.field3274.field2734;
        }
        return var19;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI[IILjava/lang/String;II[Lof;)V")
    public final void method1668(byte arg0, int arg1, int[] arg2, int arg3, String arg4, int arg5, int arg6, class421[] arg7) {
        if (arg0 <= 79) {
            method1676((class127) null, 26);
        }
        field3265++;
        if (arg4 != null) {
            this.method1683(arg3, -1, arg5);
            this.method1684(arg6 - (this.field3274.method1448(arg4, -20814) / 2), (byte) 11, (class134) null, arg2, 0, arg4, arg1, arg7, 0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public final void method1669(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field3264++;
        if (arg5 == null) {
            return;
        }
        this.method1683(arg0, -1, arg3);
        double var9 = 7.0D - (double) arg6 / 8.0D;
        if (arg2 != 62) {
            this.method1670(15, -123, (String) null, -100, 20, -4);
        }
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var9);
        }
        this.method1686(arg1 - (this.field3274.method1448(arg5, -20814) / 2), -6394, arg5, (int[]) null, (int[]) null, (class421[]) null, arg7, var12);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method1670(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -32009) {
            this.method1669(101, -29, 42, -31, -120, (String) null, 116, -91);
        }
        field3277++;
        if (arg2 != null) {
            this.method1683(arg0, -1, arg4);
            this.method1684(arg1 - (this.field3274.method1448(arg2, -20814) / 2), (byte) -108, (class134) null, (int[]) null, 0, arg2, arg5, (class421[]) null, 0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method1671(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3269++;
        if (arg1 == null) {
            return;
        }
        this.method1683(arg0, -1, arg5);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        int var11 = 0;
        if (arg3 != -806) {
            return;
        }
        while (var11 < var8) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
            var11++;
        }
        this.method1686(arg4 - (this.field3274.method1448(arg1, -20814) / 2), -6394, arg1, (int[]) null, var9, (class421[]) null, arg2, var10);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method1672(int arg0, int arg1, String arg2) {
        field3267++;
        if (arg0 != 5636) {
            this.method1666((String) null, 22, 60, 62, 111, 73, 45);
        }
        int var4 = 0;
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
            class14.field222 = (arg1 - this.field3274.method1448(arg2, arg0 ^ 0xFFFFB8B6) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lja;Lbs;)V")
    public class220(class90 arg0, class186 arg1) {
        this.field3263 = arg0;
        this.field3274 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method1673(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field3279++;
        if (arg4 >= -100) {
            this.method1681(-13, -104, 0, -109, (int[]) null, (class421[]) null, (Random) null, -31, (String) null, 43);
        }
        if (arg1 != null) {
            this.method1683(arg3, -1, arg2);
            this.method1684(arg0 - this.field3274.method1448(arg1, -20814), (byte) 29, (class134) null, (int[]) null, 0, arg1, arg5, (class421[]) null, 0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[Lof;II[IIIIILrn;Ljava/lang/String;BIII)I")
    public final int method1674(int arg0, int arg1, class421[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, class134 arg10, String arg11, byte arg12, int arg13, int arg14, int arg15) {
        field3266++;
        if (arg11 == null) {
            return 0;
        }
        this.method1683(arg13, -1, arg15);
        if (arg12 != -5) {
            return 18;
        }
        if (arg3 == 0) {
            arg3 = this.field3274.field2741;
        }
        int[] var17;
        if (this.field3274.field2740 + this.field3274.field2734 + arg3 > arg14 && arg14 < arg3 + arg3) {
            var17 = null;
        } else {
            var17 = new int[] { arg4 };
        }
        int var18 = this.field3274.method1440(class86.field1395, var17, arg2, arg12 ^ 0x7F, arg11);
        if (arg6 == 3 && var18 == 1) {
            arg6 = 1;
        }
        int var19;
        if (arg6 == 0) {
            var19 = this.field3274.field2734 + arg1;
        } else if (arg6 == 1) {
            var19 = (arg14 - this.field3274.field2734 - this.field3274.field2740 - ((var18 - 1) * arg3)) / 2 + (arg1 + this.field3274.field2734);
        } else if (arg6 == 2) {
            var19 = arg1 + arg14 - ((var18 + -1) * arg3) - this.field3274.field2740;
        } else {
            int var20 = (arg14 - ((var18 - 1) * arg3) - this.field3274.field2740 - this.field3274.field2734) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg3 += var20;
            var19 = arg1 + var20 + this.field3274.field2734;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg7 == 0) {
                this.method1684(arg0, (byte) 62, arg10, arg5, arg9, class86.field1395[var21], var19, arg2, arg8);
            } else if (arg7 == 1) {
                this.method1684((arg4 - this.field3274.method1448(class86.field1395[var21], -20814)) / 2 + arg0, (byte) 22, arg10, arg5, arg9, class86.field1395[var21], var19, arg2, arg8);
            } else if (arg7 == 2) {
                this.method1684(arg0 + arg4 - this.field3274.method1448(class86.field1395[var21], arg12 - 20809), (byte) -95, arg10, arg5, arg9, class86.field1395[var21], var19, arg2, arg8);
            } else if (var18 - 1 == var21) {
                this.method1684(arg0, (byte) 89, arg10, arg5, arg9, class86.field1395[var21], var19, arg2, arg8);
            } else {
                this.method1672(5636, arg4, class86.field1395[var21]);
                this.method1684(arg0, (byte) 6, arg10, arg5, arg9, class86.field1395[var21], var19, arg2, arg8);
                class14.field222 = 0;
            }
            var19 += arg3;
        }
        return var18;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1675(byte arg0) {
        if (arg0 >= -104) {
            field3275 = null;
        }
        field3275 = null;
        field3280 = null;
        field3272 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lqo;I)I")
    public static final int method1676(class127 arg0, int arg1) {
        field3271++;
        if (arg1 != 21386) {
            field3280 = null;
        }
        int var2 = arg0.field2048;
        class419 var3 = arg0.method2476((byte) 110);
        if (arg0.field5661) {
            var2 = arg0.field2067;
        } else if (arg0.field5642 == var3.field6081 || arg0.field5642 == var3.field6096 || arg0.field5642 == var3.field6116 || arg0.field5642 == var3.field6098) {
            var2 = arg0.field2047;
        } else if (arg0.field5642 == var3.field6103 || arg0.field5642 == var3.field6117 || arg0.field5642 == var3.field6086 || arg0.field5642 == var3.field6076) {
            var2 = arg0.field2079;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIBILjava/lang/String;I)V")
    public final void method1677(int arg0, int arg1, byte arg2, int arg3, String arg4, int arg5) {
        field3270++;
        if (arg2 == 20 && arg4 != null) {
            this.method1683(arg1, -1, arg3);
            this.method1684(arg5, (byte) -123, (class134) null, (int[]) null, 0, arg4, arg0, (class421[]) null, 0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I[Lof;ILjava/lang/String;[IIIB)V")
    public final void method1678(int arg0, class421[] arg1, int arg2, String arg3, int[] arg4, int arg5, int arg6, byte arg7) {
        field3282++;
        int var9 = 60 / ((arg7 + 55) / 61);
        if (arg3 != null) {
            this.method1683(arg2, -1, arg5);
            this.method1684(arg0 - this.field3274.method1448(arg3, -20814), (byte) -12, (class134) null, arg4, 0, arg3, arg6, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lej;")
    public static final class74 method1679(byte arg0, int arg1) {
        field3262++;
        class18 var2 = class234.field3395;
        class74 var3;
        synchronized (class234.field3395) {
            var3 = (class74) class234.field3395.method103(arg0 + 15, (long) arg1);
        }
        if (arg0 != -15) {
            field3272 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class234.field3394.method1355(class439.method2743((byte) -94, arg1), arg0 - 12592, class380.method2408(-1, arg1));
        class74 var5 = new class74();
        if (var4 != null) {
            var5.method588(new class37(var4), (byte) -68);
        }
        class18 var6 = class234.field3395;
        synchronized (class234.field3395) {
            class234.field3395.method113(var5, 0, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[Lmb;)V")
    public static final void method1680(int arg0, int arg1, class258[] arg2) {
        for (int var3 = arg1; var3 < arg2.length; var3++) {
            class258 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field3793 == 0) {
                    if (var4.field3869 != null) {
                        method1680(arg0, 0, var4.field3869);
                    }
                    class120 var5 = (class120) class355.field5045.method1219((long) var4.field3854, -97);
                    if (var5 != null) {
                        class135.method1111((byte) 12, var5.field1874, arg0);
                    }
                }
                if (arg0 == 0 && var4.field3848 != null) {
                    class254 var6 = new class254();
                    var6.field3683 = var4.field3848;
                    var6.field3678 = var4;
                    class216.method1636(var6);
                }
                if (arg0 == 1 && var4.field3884 != null) {
                    if (var4.field3860 >= 0) {
                        class258 var7 = class342.method2207(var4.field3854, (byte) 14);
                        if (var7 == null || var7.field3869 == null || var4.field3860 >= var7.field3869.length || var7.field3869[var4.field3860] != var4) {
                            continue;
                        }
                    }
                    class254 var8 = new class254();
                    var8.field3678 = var4;
                    var8.field3683 = var4.field3884;
                    class216.method1636(var8);
                }
            }
        }
        field3284++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII[I[Lof;Ljava/util/Random;ILjava/lang/String;I)I")
    public final int method1681(int arg0, int arg1, int arg2, int arg3, int[] arg4, class421[] arg5, Random arg6, int arg7, String arg8, int arg9) {
        field3278++;
        if (arg8 == null) {
            return 0;
        }
        arg6.setSeed((long) arg9);
        int var11 = (arg6.nextInt() & 0x1F) + 192;
        this.method1683(var11 << 24 | arg1 & 0xFFFFFF, -1, arg0 & 0xFFFFFF | var11 << 24);
        int var12 = arg8.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        if (arg7 != 8583) {
            return -82;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg6.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1686(arg3, -6394, arg8, arg4, var13, arg5, arg2, (int[]) null);
        return var14;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([III[Lof;IILjava/lang/String;Z)V")
    public final void method1682(int[] arg0, int arg1, int arg2, class421[] arg3, int arg4, int arg5, String arg6, boolean arg7) {
        field3276++;
        if (arg6 == null) {
            return;
        }
        if (arg7) {
            method1687(-113);
        }
        this.method1683(arg5, -1, arg2);
        this.method1684(arg4, (byte) -124, (class134) null, arg0, 0, arg6, arg1, arg3, 0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
    private final void method1683(int arg0, int arg1, int arg2) {
        class377.field5339 = -1;
        class428.field6200 = arg1;
        if (arg2 == -1) {
            arg2 = 0;
        }
        field3281++;
        class420.field6120 = 0;
        class124.field1965 = arg0;
        class364.field5191 = arg0;
        class14.field222 = 0;
        class237.field3413 = arg2;
        class136.field2173 = arg2;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBLrn;[IILjava/lang/String;I[Lof;I)V")
    private final void method1684(int arg0, byte arg1, class134 arg2, int[] arg3, int arg4, String arg5, int arg6, class421[] arg7, int arg8) {
        int var10 = 33 / ((-arg1 - 56) / 36);
        int var11 = arg6 - this.field3274.field2741;
        field3268++;
        int var12 = -1;
        int var13 = -1;
        int var14 = arg5.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class123.method1042(arg5.charAt(var15), -54) & 0xFF);
            if (var16 == '<') {
                var12 = var15;
            } else {
                if (var16 == '>' && var12 != -1) {
                    String var17 = arg5.substring(var12 + 1, var15);
                    var12 = -1;
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
                                    int var18 = class36.method259(var17.substring(4), (byte) 127);
                                    class421 var19 = arg7[var18];
                                    int var20 = arg3 == null ? var19.method1463() : arg3[var18];
                                    if ((class364.field5191 & 0xFF000000) == -16777216) {
                                        var19.method498(arg0, this.field3274.field2741 + var11 - var20, 0, 0, 1);
                                    } else {
                                        var19.method498(arg0, var11 + this.field3274.field2741 - var20, 1, class364.field5191 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg0 += arg7[var18].method1461();
                                    var13 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method1685(var17, (byte) -124);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var12 == -1) {
                    if (var13 != -1) {
                        arg0 += this.field3274.method1444(-104, var16, var13);
                    }
                    if (var16 == ' ') {
                        if (class14.field222 > 0) {
                            class420.field6120 += class14.field222;
                            arg0 += class420.field6120 >> 8;
                            class420.field6120 &= 0xFF;
                        }
                    } else if (arg2 == null) {
                        if ((class136.field2173 & 0xFF000000) != 0) {
                            this.method354(var16, arg0 + 1, var11 - -1, class136.field2173, true);
                        }
                        this.method354(var16, arg0, var11, class364.field5191, false);
                    } else {
                        if ((class136.field2173 & 0xFF000000) != 0) {
                            this.method349(var16, arg0 + 1, var11 + 1, class136.field2173, true, arg2, arg4, arg8);
                        }
                        this.method349(var16, arg0, var11, class364.field5191, false, arg2, arg4, arg8);
                    }
                    int var21 = this.field3274.method1441(var16, (byte) 30);
                    if (class428.field6200 != -1) {
                        this.field3263.method718(var21, 6, (int) ((double) this.field3274.field2741 * 0.7D) + var11, arg0, class428.field6200);
                    }
                    if (class377.field5339 != -1) {
                        this.field3263.method718(var21, 6, this.field3274.field2741 + var11 + 1, arg0, class377.field5339);
                    }
                    var13 = var16;
                    arg0 += var21;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;B)V")
    private final void method1685(String arg0, byte arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class364.field5191 = class364.field5191 & 0xFF000000 | class168.method1283(16, 127, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class364.field5191 = class124.field1965 & 0xFFFFFF | class364.field5191 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class364.field5191 = class168.method1283(16, 110, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class364.field5191 = class124.field1965;
            } else if (arg0.startsWith("str=")) {
                class428.field6200 = class168.method1283(16, 113, arg0.substring(4)) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class428.field6200 = -8388608;
            } else if (arg0.equals("/str")) {
                class428.field6200 = -1;
            } else if (arg0.startsWith("u=")) {
                class377.field5339 = class168.method1283(16, 109, arg0.substring(2)) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class377.field5339 = -16777216;
            } else if (arg0.equals("/u")) {
                class377.field5339 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class136.field2173 = 0;
            } else if (arg0.startsWith("shad=")) {
                class136.field2173 = class168.method1283(16, 110, arg0.substring(5)) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class136.field2173 = -16777216;
            } else if (arg0.equals("/shad")) {
                class136.field2173 = class237.field3413;
            } else if (arg0.equals("br")) {
                this.method1683(class124.field1965, -1, class237.field3413);
            }
        } catch (Exception var3) {
        }
        if (arg1 > -23) {
            this.method1684(39, (byte) -91, (class134) null, (int[]) null, -103, (String) null, 17, (class421[]) null, -97);
        }
        field3273++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(CIIIZLrn;II)V")
    public abstract void method349(char arg0, int arg1, int arg2, int arg3, boolean arg4, class134 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/lang/String;[I[I[Lof;I[I)V")
    private final void method1686(int arg0, int arg1, String arg2, int[] arg3, int[] arg4, class421[] arg5, int arg6, int[] arg7) {
        field3285++;
        int var9 = arg6 - this.field3274.field2741;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        if (arg1 != -6394) {
            return;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class123.method1042(arg2.charAt(var14), -54) & 0xFF);
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
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg7 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg7[var12];
                                    }
                                    var12++;
                                    int var19 = class36.method259(var16.substring(4), (byte) 127);
                                    class421 var20 = arg5[var19];
                                    int var21 = arg3 == null ? var20.method1463() : arg3[var19];
                                    var20.method498(arg0 + var17, -var21 + var9 - -this.field3274.field2741 - -var18, 0, 0, 1);
                                    arg0 += arg5[var19].method1461();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1685(var16, (byte) -37);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg0 += this.field3274.method1444(arg1 ^ 0xFFFFE778, var15, var11);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg7 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg7[var12];
                    }
                    if (var15 != ' ') {
                        if ((class136.field2173 & 0xFF000000) != 0) {
                            this.method354(var15, arg0 + var22 + 1, var9 - -1 + var23, class136.field2173, true);
                        }
                        this.method354(var15, arg0 + var22, var9 - -var23, class364.field5191, false);
                    } else if (class14.field222 > 0) {
                        class420.field6120 += class14.field222;
                        arg0 += class420.field6120 >> 8;
                        class420.field6120 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field3274.method1441(var15, (byte) -128);
                    if (class428.field6200 != -1) {
                        this.field3263.method718(var24, 6, var9 + ((int) ((double) this.field3274.field2741 * 0.7D)), arg0, class428.field6200);
                    }
                    if (class377.field5339 != -1) {
                        this.field3263.method718(var24, arg1 + 6400, this.field3274.field2741 + var9, arg0, class377.field5339);
                    }
                    var11 = var15;
                    arg0 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static final void method1687(int arg0) {
        class168.method1288(-6, arg0);
        field3283++;
        class210.method1579((byte) 77);
        System.gc();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method354(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
