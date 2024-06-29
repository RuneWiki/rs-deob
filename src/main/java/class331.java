import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class331 {

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "[B")
    private byte[] field5203;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "[[B")
    private byte[][] field5219;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public int field5208;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public int field5218;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field5202;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "[I")
    public static int[] field5209 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field5206 = 0;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "[I")
    public static int[] field5215 = new int[32];

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Z")
    public static boolean field5216 = false;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;I[Lo;I)I", line = 5)
    public final int method2077(String arg0, int arg1, class138[] arg2, int arg3) {
        if (arg3 >= -120) {
            this.field5219 = null;
        }
        field5212++;
        int var5 = this.method2083(arg2, false, arg0, new int[] { arg1 }, class60.field920);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2078(-3789, class60.field920[var7], arg2);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILjava/lang/String;[Lo;)I", line = 35)
    public final int method2078(int arg0, String arg1, class138[] arg2) {
        field5200++;
        if (arg1 == null) {
            return 0;
        }
        if (arg0 != -3789) {
            this.method2088(118, -77);
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg1.substring(var4 + 1, var8);
                    var4 = -1;
                    if (var10.equals("lt")) {
                        var9 = '<';
                    } else if (var10.equals("gt")) {
                        var9 = '>';
                    } else if (var10.equals("nbsp")) {
                        var9 = ' ';
                    } else if (var10.equals("shy")) {
                        var9 = '\u00AD';
                    } else if (var10.equals("times")) {
                        var9 = '×';
                    } else if (var10.equals("euro")) {
                        var9 = '€';
                    } else if (var10.equals("copy")) {
                        var9 = '©';
                    } else {
                        if (!var10.equals("reg")) {
                            if (var10.startsWith("img=") && arg2 != null) {
                                try {
                                    int var11 = class508.method2990(var10.substring(4), 23403);
                                    var6 += arg2[var11].method200();
                                    var5 = -1;
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field5203[class376.method2389(var9, 352) & 0xFF] & 0xFF;
                    if (this.field5219 != null && var5 != -1) {
                        var6 += this.field5219[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([Lo;IILjava/lang/String;)I", line = 148)
    public final int method2079(class138[] arg0, int arg1, int arg2, String arg3) {
        field5201++;
        if (arg1 != 0) {
            this.field5219 = null;
        }
        return this.method2083(arg0, false, arg3, new int[] { arg2 }, class60.field920);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 163)
    public static void method2080(int arg0) {
        if (arg0 > -101) {
            method2081(-108, (byte) 92);
        }
        field5215 = null;
        field5209 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)Z", line = 179)
    public static final boolean method2081(int arg0, byte arg1) {
        if (arg1 != 113) {
            field5206 = -96;
        }
        field5217++;
        return arg0 == 18 || arg0 == 51 || arg0 == 1009 || arg0 == 2 || arg0 == 47;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ICI)I", line = 190)
    public final int method2082(int arg0, char arg1, int arg2) {
        field5205++;
        if (arg0 != 0) {
            field5209 = null;
        }
        return this.field5219 == null ? 0 : this.field5219[arg2][arg1];
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([Lo;ZLjava/lang/String;[I[Ljava/lang/String;)I", line = 206)
    public final int method2083(class138[] arg0, boolean arg1, String arg2, int[] arg3, String[] arg4) {
        field5204++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        if (arg1) {
            return -112;
        }
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class376.method2389(arg2.charAt(var15), 352) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2088(-16703, var16);
                    if (this.field5219 != null && var12 != -1) {
                        var17 += this.field5219[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg2.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg4[var13] = arg2.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg4.length) {
                            return 0;
                        }
                        var12 = -1;
                        var7 = var15 + 1;
                        var8 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2088(-16703, 60);
                        if (this.field5219 != null && var12 != -1) {
                            var17 += this.field5219[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2088(-16703, 62);
                        if (this.field5219 != null && var12 != -1) {
                            var17 += this.field5219[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2088(-16703, 160);
                        if (this.field5219 != null && var12 != -1) {
                            var17 += this.field5219[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2088(-16703, 173);
                        if (this.field5219 != null && var12 != -1) {
                            var17 += this.field5219[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2088(-16703, 215);
                        if (this.field5219 != null && var12 != -1) {
                            var17 += this.field5219[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2088(-16703, 8364);
                        if (this.field5219 != null && var12 != -1) {
                            var17 += this.field5219[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2088(-16703, 169);
                        if (this.field5219 != null && var12 != -1) {
                            var17 += this.field5219[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2088(-16703, 174);
                        if (this.field5219 != null && var12 != -1) {
                            var17 += this.field5219[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class508.method2990(var19.substring(4), 23403);
                            var12 = -1;
                            var17 += arg0[var20].method200();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg3 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 1;
                        }
                        if (arg3[var13 < arg3.length ? var13 : arg3.length - 1] < var6) {
                            if (var8 >= 0) {
                                arg4[var13] = arg2.substring(var7, var8 - (var10 - 1));
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg4[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var12 = -1;
                                var6 = var17;
                                var7 = var18;
                            }
                        }
                        if (var16 == 45) {
                            var9 = var6;
                            var10 = 0;
                            var8 = var15;
                        }
                    }
                }
            }
        }
        if (var7 < arg2.length()) {
            arg4[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([Lo;IBILjava/lang/String;)I", line = 454)
    public final int method2084(class138[] arg0, int arg1, byte arg2, int arg3, String arg4) {
        field5210++;
        if (arg1 == 0) {
            arg1 = this.field5208;
        }
        if (arg2 < 113) {
            return -89;
        } else {
            int var6 = this.method2083(arg0, false, arg4, new int[] { arg3 }, class60.field920);
            int var7 = (var6 - 1) * arg1;
            return this.field5218 + var7 + this.field5202;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLjava/lang/String;)I", line = 480)
    public final int method2085(byte arg0, String arg1) {
        field5214++;
        return arg0 >= -74 ? 101 : this.method2078(-3789, arg1, null);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "([Lo;IILjava/lang/String;)Ljava/lang/String;", line = 491)
    public final String method2086(class138[] arg0, int arg1, int arg2, String arg3) {
        field5213++;
        if (this.method2078(arg2 - 3789, arg3, arg0) <= arg1) {
            return arg3;
        }
        int var5 = arg1 - this.method2078(-3789, "...", null);
        int var6 = -1;
        int var7 = -1;
        int var8 = arg2;
        int var9 = arg3.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg3.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg3.substring(var6 + 1, var11);
                    var6 = -1;
                    if (var13.equals("lt")) {
                        var12 = '<';
                    } else if (var13.equals("gt")) {
                        var12 = '>';
                    } else if (var13.equals("nbsp")) {
                        var12 = ' ';
                    } else if (var13.equals("shy")) {
                        var12 = '\u00AD';
                    } else if (var13.equals("times")) {
                        var12 = '×';
                    } else if (var13.equals("euro")) {
                        var12 = '€';
                    } else if (var13.equals("copy")) {
                        var12 = '©';
                    } else {
                        if (!var13.equals("reg")) {
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class508.method2990(var13.substring(4), arg2 + 23403);
                                    var8 += arg0[var14].method200();
                                    var7 = -1;
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg3.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field5203[class376.method2389(var12, 352) & 0xFF] & 0xFF;
                    if (this.field5219 != null && var7 != -1) {
                        var8 += this.field5219[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field5219 != null) {
                        var15 = this.field5219[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg3.substring(0, var11 + 1);
                }
            }
        }
        return arg3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)Z", line = 614)
    public static final boolean method2087(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class387.field5963; var3++) {
            class194 var4 = class128.field2200[var3];
            if (var4.field3022 == 1) {
                int var5 = var4.field3018 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3026 * var5 >> 8) + var4.field3030;
                    int var7 = (var4.field3017 * var5 >> 8) + var4.field3033;
                    int var8 = (var4.field3034 * var5 >> 8) + var4.field3038;
                    int var9 = (var4.field3036 * var5 >> 8) + var4.field3032;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3022 == 2) {
                int var10 = arg0 - var4.field3018;
                if (var10 > 0) {
                    int var11 = (var4.field3026 * var10 >> 8) + var4.field3030;
                    int var12 = (var4.field3017 * var10 >> 8) + var4.field3033;
                    int var13 = (var4.field3034 * var10 >> 8) + var4.field3038;
                    int var14 = (var4.field3036 * var10 >> 8) + var4.field3032;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3022 == 3) {
                int var15 = var4.field3030 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3035 * var15 >> 8) + var4.field3018;
                    int var17 = (var4.field3039 * var15 >> 8) + var4.field3028;
                    int var18 = (var4.field3034 * var15 >> 8) + var4.field3038;
                    int var19 = (var4.field3036 * var15 >> 8) + var4.field3032;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3022 == 4) {
                int var20 = arg2 - var4.field3030;
                if (var20 > 0) {
                    int var21 = (var4.field3035 * var20 >> 8) + var4.field3018;
                    int var22 = (var4.field3039 * var20 >> 8) + var4.field3028;
                    int var23 = (var4.field3034 * var20 >> 8) + var4.field3038;
                    int var24 = (var4.field3036 * var20 >> 8) + var4.field3032;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3022 == 5) {
                int var25 = arg1 - var4.field3038;
                if (var25 > 0) {
                    int var26 = (var4.field3035 * var25 >> 8) + var4.field3018;
                    int var27 = (var4.field3039 * var25 >> 8) + var4.field3028;
                    int var28 = (var4.field3026 * var25 >> 8) + var4.field3030;
                    int var29 = (var4.field3017 * var25 >> 8) + var4.field3033;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I", line = 743)
    public final int method2088(int arg0, int arg1) {
        if (arg0 != -16703) {
            this.method2077(null, 10, null, 77);
        }
        field5207++;
        return this.field5203[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "([B)V", line = 753)
    public class331(byte[] arg0) {
        class23 var2 = new class23(arg0);
        int var3 = var2.method126((byte) -117);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method126((byte) -120) == 1;
        this.field5203 = new byte[256];
        var2.method128(this.field5203, 0, 10, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method126((byte) -75);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method126((byte) -108);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method167(-2);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method167(-2);
                    var11[var12][var16] = var15;
                }
            }
            this.field5219 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5219[var13][var14] = (byte) class188.method1276(var9, this.field5203, var14, var13, var11, 8, var7, var5);
                        }
                    }
                }
            }
            this.field5208 = var5[32] + var7[32];
        } else {
            this.field5208 = var2.method126((byte) -124);
        }
        var2.method126((byte) -121);
        var2.method126((byte) -125);
        this.field5218 = var2.method126((byte) -117);
        this.field5202 = var2.method126((byte) -103);
    }
}
