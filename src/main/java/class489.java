import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class489 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lje;")
    private class275 field7216;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lqa;")
    private class162 field7229;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lso;")
    public static class327 field7225 = new class327(12, 4);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Ltd;")
    public static class314 field7212;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method2899(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field7215++;
        if (arg3 == null) {
            return;
        }
        this.method2907(arg2, (byte) -126, arg5);
        if (arg4 != -16777216) {
            this.method2902(-17, 30, 51, -66, null, -57, null, -23, null, 79, (byte) 40, -57, null, -109, 120, 36);
        }
        this.method2913(arg0, 0, null, arg4 + 16790591, null, arg1, null, 0, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method2900(int arg0, String arg1, int arg2) {
        field7221++;
        int var4 = arg0;
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
        if (var4 > 0) {
            class121.field1823 = (arg2 - this.field7216.method1797(false, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public final void method2901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field7231++;
        if (arg6 == null) {
            return;
        }
        this.method2907(arg0, (byte) -126, arg2);
        if (arg3 > -51) {
            return;
        }
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2909(var9, arg4 - (this.field7216.method1797(false, arg6) / 2), arg6, null, arg5, var10, 111, null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII[II[Lf;ILea;IBILjava/lang/String;III)I")
    public final int method2902(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, class529[] arg6, int arg7, class381 arg8, int arg9, byte arg10, int arg11, String arg12, int arg13, int arg14, int arg15) {
        field7217++;
        if (arg10 != -95) {
            this.method2903(120, null, 60, 92, 60, null, 84, 29, null, null);
        }
        return this.method2905(arg13, arg2, arg6, arg0, arg12, arg8, arg7, arg11, arg3, arg15, -104, arg14, 0, arg4, arg1, arg5, arg9);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLea;II)V")
    public abstract void method325(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[IIIILjava/lang/String;IILjava/util/Random;[Lf;)I")
    public final int method2903(int arg0, int[] arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7, Random arg8, class529[] arg9) {
        field7223++;
        if (arg5 == null) {
            return 0;
        }
        arg8.setSeed((long) arg3);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method2907(arg0 & 0xFFFFFF | var11 << 24, (byte) -126, var11 << 24 | arg2 & 0xFFFFFF);
        if (arg6 != 20579) {
            this.method2901(-117, 17, 11, 23, 12, 15, null);
        }
        int var12 = arg5.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2909(var13, arg7, arg5, arg9, arg4, null, arg6 ^ 0x5000, arg1);
        return var14;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLqa;Ldt;Lcn;)V")
    public static final void method2904(byte arg0, class162 arg1, class158 arg2, class355 arg3) {
        field7213++;
        class529 var4 = arg2.method1005(131072, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method108();
        if (var5 < var4.method103()) {
            var5 = var4.method103();
        }
        byte var6 = 10;
        int var7 = arg3.field5466;
        int var8 = arg3.field5462;
        int var9 = 0;
        if (arg0 >= -114) {
            method2914((byte) 27);
        }
        int var10 = 0;
        int var11 = 0;
        if (arg2.field2339 != null) {
            var9 = class343.field4952.method1805(85, null, arg2.field2339, null, class34.field361);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class34.field361[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class123.field1868.method2259(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class123.field1868.method2256() * var9 + (class123.field1868.method2258() / 2);
        }
        int var15 = arg3.field5466 + (var5 / 2);
        int var16 = arg3.field5462;
        if (class460.field6836 + var5 > var7) {
            var15 = var10 / 2 + var5 / 2 + class460.field6836 + var6 + 5;
            var7 = class460.field6836;
        } else if ((class460.field6822 - var5) < var7) {
            var7 = class460.field6822 - var5;
            var15 = class460.field6822 - (var10 / 2) - var6 - (var5 / 2) - 5;
        }
        if ((class460.field6828 + var5) > var8) {
            var8 = class460.field6828;
            var16 = var5 / 2 + var6 + class460.field6828;
        } else if (var8 > class460.field6826 - var5) {
            var16 = class460.field6826 - var6 - var11 - (var5 / 2);
            var8 = class460.field6826 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg3.field5466), (double) (var8 - arg3.field5462)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method3124((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field2339 != null) {
            var19 = var16;
            var18 = var15 - var10 / 2 - 5;
            var21 = (var16 + (var9 * class123.field1868.method2256())) + 3;
            var20 = var18 + var10 + 10;
            if (arg2.field2300 != 0) {
                arg1.method1087(var16, var18, 116, var21 - var16, arg2.field2300, var20 - var18);
            }
            if (arg2.field2332 != 0) {
                arg1.method1045(var18, var16, var21 - var16, 1, var20 - var18, arg2.field2332);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class34.field361[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class123.field1868.method2255(arg1, var23, var15, var16, arg2.field2326, true);
                var16 += class123.field1868.method2256();
            }
        }
        if (arg2.field2315 == -1 && arg2.field2339 == null) {
            return;
        }
        class325 var24 = new class325(arg3);
        int var25 = var5 >> 1;
        var24.field4635 = var18;
        var24.field4633 = var7 - var25;
        var24.field4639 = var19;
        var24.field4632 = var21;
        var24.field4643 = var20;
        var24.field4634 = var8 + var25;
        var24.field4645 = var7 + var25;
        var24.field4641 = var8 - var25;
        class365.field5583.method809(var24, false);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[Lf;ILjava/lang/String;Lea;IIIIIII[IIII)I")
    public final int method2905(int arg0, int arg1, class529[] arg2, int arg3, String arg4, class381 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14, int arg15, int arg16) {
        field7214++;
        if (arg4 == null) {
            return 0;
        }
        this.method2907(arg11, (byte) -126, arg1);
        if (arg3 == 0) {
            arg3 = this.field7216.field3986;
        }
        if (arg10 > -59) {
            this.method2907(-92, (byte) 27, -68);
        }
        int[] var18;
        if (arg15 < (this.field7216.field3988 + this.field7216.field3980 + arg3) && arg3 + arg3 > arg15) {
            var18 = null;
        } else {
            var18 = new int[] { arg16 };
        }
        int var19 = this.field7216.method1805(-116, arg2, arg4, var18, class111.field1599);
        if (arg12 == -1) {
            arg12 = arg15 / arg3;
            if (arg12 <= 0) {
                arg12 = 1;
            }
        }
        if (arg12 > 0 && arg12 <= var19) {
            class111.field1599[arg12 - 1] = this.field7216.method1803(class111.field1599[arg12 - 1], arg16, (byte) 104, arg2);
            var19 = arg12;
        }
        if (arg14 == 3 && var19 == 1) {
            arg14 = 1;
        }
        int var20;
        if (arg14 == 0) {
            var20 = this.field7216.field3980 + arg0;
        } else if (arg14 == 1) {
            var20 = arg0 - (-((arg15 - this.field7216.field3988 - this.field7216.field3980 - ((var19 - 1) * arg3)) / 2) - this.field7216.field3980);
        } else if (arg14 == 2) {
            var20 = arg0 - ((var19 - 1) * arg3) - (-arg15 + this.field7216.field3988);
        } else {
            int var21 = (arg15 - this.field7216.field3988 - this.field7216.field3980 - ((var19 + -1) * arg3)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg0 + var21 + this.field7216.field3980;
            arg3 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg8 == 0) {
                this.method2913(arg7, arg6, arg2, 13375, arg13, var20, arg5, arg9, class111.field1599[var22]);
            } else if (arg8 == 1) {
                this.method2913(arg7 + ((arg16 - this.field7216.method1797(false, class111.field1599[var22])) / 2), arg6, arg2, 13375, arg13, var20, arg5, arg9, class111.field1599[var22]);
            } else if (arg8 == 2) {
                this.method2913(arg7 + arg16 - this.field7216.method1797(false, class111.field1599[var22]), arg6, arg2, 13375, arg13, var20, arg5, arg9, class111.field1599[var22]);
            } else if (var19 - 1 == var22) {
                this.method2913(arg7, arg6, arg2, 13375, arg13, var20, arg5, arg9, class111.field1599[var22]);
            } else {
                this.method2900(0, class111.field1599[var22], arg16);
                this.method2913(arg7, arg6, arg2, 13375, arg13, var20, arg5, arg9, class111.field1599[var22]);
                class121.field1823 = 0;
            }
            var20 += arg3;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method2906(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field7226++;
        if (arg5 == null) {
            return;
        }
        this.method2907(arg0, (byte) -126, arg6);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        if (arg1 != -61) {
            this.method2900(-42, null, 115);
        }
        while (var10 < var8) {
            var9[var10] = (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            var10++;
        }
        this.method2909(null, arg2 - (this.field7216.method1797(false, arg5) / 2), arg5, null, arg3, var9, arg1 + 179, null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)V")
    private final void method2907(int arg0, byte arg1, int arg2) {
        if (arg1 != -126) {
            return;
        }
        class121.field1823 = 0;
        field7219++;
        class82.field1247 = -1;
        class133.field2046 = arg2;
        class5.field71 = arg2;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class226.field3323 = -1;
        class389.field5871 = 0;
        class94.field1397 = arg0;
        class451.field6716 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public final void method2908(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field7222++;
        if (arg5 == null) {
            return;
        }
        this.method2907(arg1, (byte) -126, arg2);
        double var9 = 7.0D - ((double) arg4 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = arg3; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg6));
        }
        this.method2909(null, arg0 - (this.field7216.method1797(false, arg5) / 2), arg5, null, arg7, var12, 79, null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IILjava/lang/String;[Lf;I[II[I)V")
    private final void method2909(int[] arg0, int arg1, String arg2, class529[] arg3, int arg4, int[] arg5, int arg6, int[] arg7) {
        if (arg6 <= 73) {
            this.method2910(15, null);
        }
        int var9 = arg4 - this.field7216.field3986;
        field7228++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class291.method1862(arg2.charAt(var14), 24237) & 0xFF);
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
                                    if (arg0 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg0[var12];
                                    }
                                    int var18;
                                    if (arg5 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg5[var12];
                                    }
                                    var12++;
                                    int var19 = class92.method532(var16.substring(4), 10);
                                    class529 var20 = arg3[var19];
                                    int var21 = arg7 == null ? var20.method100() : arg7[var19];
                                    var20.method110(arg1 + var17, -var21 + var9 - -this.field7216.field3986 + var18, 1, 0, 1);
                                    arg1 += arg3[var19].method105();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2910(-63, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field7216.method1799(var15, -121, var11);
                    }
                    int var22;
                    if (arg0 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg0[var12];
                    }
                    int var23;
                    if (arg5 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg5[var12];
                    }
                    if (var15 != ' ') {
                        if ((class451.field6716 & 0xFF000000) != 0) {
                            this.method326(var15, arg1 + var22 + 1, var9 + 1 + var23, class451.field6716, true);
                        }
                        this.method326(var15, arg1 + var22, var9 - -var23, class5.field71, false);
                    } else if (class121.field1823 > 0) {
                        class389.field5871 += class121.field1823;
                        arg1 += class389.field5871 >> 8;
                        class389.field5871 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field7216.method1802(121, var15);
                    if (class226.field3323 != -1) {
                        this.field7229.method1124(1, (int) ((double) this.field7216.field3986 * 0.7D) + var9, arg1, var24, class226.field3323);
                    }
                    if (class82.field1247 != -1) {
                        this.field7229.method1124(1, var9 + this.field7216.field3986, arg1, var24, class82.field1247);
                    }
                    arg1 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method2910(int arg0, String arg1) {
        if (arg0 != -63) {
            this.field7216 = null;
        }
        field7218++;
        try {
            if (arg1.startsWith("col=")) {
                class5.field71 = class5.field71 & 0xFF000000 | class318.method1988(arg1.substring(4), 16, 3) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class5.field71 = class133.field2046 & 0xFFFFFF | class5.field71 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class5.field71 = class318.method1988(arg1.substring(5), 16, 3);
            } else if (arg1.equals("/argb")) {
                class5.field71 = class133.field2046;
            } else if (arg1.startsWith("str=")) {
                class226.field3323 = class318.method1988(arg1.substring(4), 16, 3) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class226.field3323 = -8388608;
            } else if (arg1.equals("/str")) {
                class226.field3323 = -1;
            } else if (arg1.startsWith("u=")) {
                class82.field1247 = class318.method1988(arg1.substring(2), 16, 3) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class82.field1247 = -16777216;
            } else if (arg1.equals("/u")) {
                class82.field1247 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class451.field6716 = 0;
            } else if (arg1.startsWith("shad=")) {
                class451.field6716 = class318.method1988(arg1.substring(5), 16, arg0 + 66) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class451.field6716 = -16777216;
            } else if (arg1.equals("/shad")) {
                class451.field6716 = class94.field1397;
            } else if (arg1.equals("br")) {
                this.method2907(class94.field1397, (byte) -126, class133.field2046);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method326(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII[I[Lf;IIIBILjava/lang/String;Ljava/util/Random;I)I")
    public final int method2911(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, class529[] arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, String arg12, Random arg13, int arg14) {
        field7227++;
        if (arg12 == null) {
            return 0;
        }
        if (arg10 <= 2) {
            this.method2899(104, 87, -70, null, 8, -38);
        }
        arg13.setSeed((long) arg2);
        int var16 = (arg13.nextInt() & 0x1F) + 192;
        this.method2907(arg11 & 0xFFFFFF | var16 << 24, (byte) -126, arg14 & 0xFFFFFF | var16 << 24);
        int var17 = arg12.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg13.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg9;
        int var22 = this.field7216.field3980 + arg1;
        if (arg4 == 1) {
            var22 += (arg8 - this.field7216.field3988 - this.field7216.field3980) / 2;
        } else if (arg4 == 2) {
            var22 = arg8 + arg1 - this.field7216.field3988;
        }
        int var23 = -1;
        if (arg3 == 1) {
            var23 = var19 + this.field7216.method1797(false, arg12);
            var21 = (arg7 - var23) / 2 + arg9;
        } else if (arg3 == 2) {
            var23 = this.field7216.method1797(false, arg12) + var19;
            var21 = arg7 + arg9 - var23;
        }
        this.method2909(var18, var21, arg12, arg6, var22, null, 84, arg5);
        if (arg0 != null) {
            if (var23 == -1) {
                var23 = this.field7216.method1797(false, arg12) + var19;
            }
            arg0[0] = var21;
            arg0[3] = this.field7216.field3988 + this.field7216.field3980;
            arg0[2] = var23;
            arg0[1] = var22 - this.field7216.field3980;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lqa;Lje;)V")
    public class489(class162 arg0, class275 arg1) {
        this.field7216 = arg1;
        this.field7229 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IBIII)V")
    public final void method2912(String arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field7232++;
        if (arg0 == null) {
            return;
        }
        if (arg2 != 124) {
            field7225 = null;
        }
        this.method2907(arg4, (byte) -126, arg1);
        this.method2913(arg3 - this.field7216.method1797(false, arg0), 0, null, arg2 ^ 0x3443, null, arg5, null, 0, arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[Lf;I[IILea;ILjava/lang/String;)V")
    private final void method2913(int arg0, int arg1, class529[] arg2, int arg3, int[] arg4, int arg5, class381 arg6, int arg7, String arg8) {
        int var10 = arg5 - this.field7216.field3986;
        field7220++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg8.length();
        if (arg3 != 13375) {
            return;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class291.method1862(arg8.charAt(var14), 24237) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg8.substring(var11 + 1, var14);
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
                                    int var17 = class92.method532(var16.substring(4), 10);
                                    class529 var18 = arg2[var17];
                                    int var19 = arg4 == null ? var18.method100() : arg4[var17];
                                    if ((class5.field71 & 0xFF000000) == -16777216) {
                                        var18.method110(arg0, this.field7216.field3986 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method110(arg0, var10 + this.field7216.field3986 - var19, 0, class5.field71 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg0 += arg2[var17].method105();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2910(-63, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field7216.method1799(var15, -86, var12);
                    }
                    if (var15 == ' ') {
                        if (class121.field1823 > 0) {
                            class389.field5871 += class121.field1823;
                            arg0 += class389.field5871 >> 8;
                            class389.field5871 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class451.field6716 & 0xFF000000) != 0) {
                            this.method326(var15, arg0 + 1, var10 + 1, class451.field6716, true);
                        }
                        this.method326(var15, arg0, var10, class5.field71, false);
                    } else {
                        if ((class451.field6716 & 0xFF000000) != 0) {
                            this.method325(var15, arg0 + 1, var10 + 1, class451.field6716, true, arg6, arg7, arg1);
                        }
                        this.method325(var15, arg0, var10, class5.field71, false, arg6, arg7, arg1);
                    }
                    int var20 = this.field7216.method1802(122, var15);
                    if (class226.field3323 != -1) {
                        this.field7229.method1124(1, var10 + ((int) ((double) this.field7216.field3986 * 0.7D)), arg0, var20, class226.field3323);
                    }
                    if (class82.field1247 != -1) {
                        this.field7229.method1124(1, var10 + this.field7216.field3986 + 1, arg0, var20, class82.field1247);
                    }
                    var12 = var15;
                    arg0 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method2914(byte arg0) {
        field7212 = null;
        field7225 = null;
        if (arg0 > -69) {
            method2914((byte) 91);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILjava/lang/String;Z)V")
    public final void method2915(int arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5) {
        field7224++;
        if (arg4 == null) {
            return;
        }
        this.method2907(arg1, (byte) -126, arg0);
        this.method2913(arg2 - (this.field7216.method1797(false, arg4) / 2), 0, null, 13375, null, arg3, null, 0, arg4);
        if (!arg5) {
            this.method2912(null, -66, (byte) -83, 95, -92, -77);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;[Lf;III[III)V")
    public final void method2916(String arg0, class529[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field7230++;
        if (arg0 == null) {
            return;
        }
        this.method2907(arg6, (byte) -126, arg7);
        if (arg3 != 24382) {
            this.method2916(null, null, -59, -50, 113, null, -20, -68);
        }
        this.method2913(arg4, 0, arg1, 13375, arg5, arg2, null, 0, arg0);
    }
}
