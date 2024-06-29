import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class332 {

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "[B")
    private byte[] field5025;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "[[B")
    private byte[][] field5021;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public int field5026;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public int field5028;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public int field5018;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(CII)I")
    public final int method2127(char arg0, int arg1, int arg2) {
        field5022++;
        int var4 = -53 / ((74 - arg1) / 42);
        return this.field5021 == null ? 0 : this.field5021[arg2][arg0];
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I[Lf;IILjava/lang/String;)I")
    public final int method2128(int arg0, class529[] arg1, int arg2, int arg3, String arg4) {
        if (arg2 == 0) {
            arg2 = this.field5026;
        }
        field5020++;
        int var6 = this.method2134(class195.field2864, arg1, arg4, arg0 + 10148, new int[] { arg3 });
        if (arg0 != -10148) {
            this.field5026 = 74;
        }
        int var7 = (var6 - 1) * arg2;
        return this.field5028 + var7 + this.field5018;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([Lf;IILjava/lang/String;)I")
    public final int method2129(class529[] arg0, int arg1, int arg2, String arg3) {
        field5023++;
        int var5 = this.method2134(class195.field2864, arg0, arg3, 0, new int[] { arg1 });
        int var6 = 0;
        if (arg2 < 106) {
            this.method2127('%', -4, -111);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2133((byte) 78, arg0, class195.field2864[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;IB[Lf;)Ljava/lang/String;")
    public final String method2130(String arg0, int arg1, byte arg2, class529[] arg3) {
        field5017++;
        if (arg1 >= this.method2133((byte) 78, arg3, arg0)) {
            return arg0;
        }
        int var5 = arg1 - this.method2133((byte) 78, null, "...");
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg0.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg0.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg0.substring(var6 + 1, var11);
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
                            if (var13.startsWith("img=") && arg3 != null) {
                                try {
                                    int var14 = class463.method2758(-84, var13.substring(4));
                                    var8 += arg3[var14].method100();
                                    var7 = -1;
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg0.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field5025[class429.method2572(-10707, var12) & 0xFF] & 0xFF;
                    if (this.field5021 != null && var7 != -1) {
                        var8 += this.field5021[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field5021 != null) {
                        var15 = this.field5021[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg0.substring(0, var11 + 1);
                }
            }
        }
        if (arg2 == -40) {
            return arg0;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)I")
    public final int method2131(int arg0, int arg1) {
        field5031++;
        int var3 = 39 / ((arg0 - 49) / 48);
        return this.field5025[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I[Lf;BLjava/lang/String;)I")
    public final int method2132(int arg0, class529[] arg1, byte arg2, String arg3) {
        field5019++;
        return arg2 > -68 ? 41 : this.method2134(class195.field2864, arg1, arg3, 0, new int[] { arg0 });
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B[Lf;Ljava/lang/String;)I")
    public final int method2133(byte arg0, class529[] arg1, String arg2) {
        if (arg0 != 78) {
            this.field5025 = null;
        }
        field5016++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg2.substring(var4 + 1, var8);
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
                            if (var10.startsWith("img=") && arg1 != null) {
                                try {
                                    int var11 = class463.method2758(-87, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg1[var11].method100();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field5025[class429.method2572(arg0 - 10785, var9) & 0xFF] & 0xFF;
                    if (this.field5021 != null && var5 != -1) {
                        var6 += this.field5021[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([Ljava/lang/String;[Lf;Ljava/lang/String;I[I)I")
    public final int method2134(String[] arg0, class529[] arg1, String arg2, int arg3, int[] arg4) {
        field5030++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = arg3;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class429.method2572(-10707, arg2.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2131(101, var16);
                    if (this.field5021 != null && var12 != -1) {
                        var17 += this.field5021[var12][var16];
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
                        arg0[var13] = arg2.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg0.length) {
                            return 0;
                        }
                        var12 = -1;
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2131(arg3 + 118, 60);
                        if (this.field5021 != null && var12 != -1) {
                            var17 += this.field5021[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2131(arg3 + 121, 62);
                        if (this.field5021 != null && var12 != -1) {
                            var17 += this.field5021[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2131(-80, 160);
                        if (this.field5021 != null && var12 != -1) {
                            var17 += this.field5021[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2131(arg3 ^ 0x7B, 173);
                        if (this.field5021 != null && var12 != -1) {
                            var17 += this.field5021[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2131(-43, 215);
                        if (this.field5021 != null && var12 != -1) {
                            var17 += this.field5021[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2131(99, 8364);
                        if (this.field5021 != null && var12 != -1) {
                            var17 += this.field5021[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2131(112, 169);
                        if (this.field5021 != null && var12 != -1) {
                            var17 += this.field5021[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2131(104, 174);
                        if (this.field5021 != null && var12 != -1) {
                            var17 += this.field5021[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class463.method2758(-85, var19.substring(4));
                            var17 += arg1[var20].method100();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg4 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg4[var13 >= arg4.length ? arg4.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg0[var13] = arg2.substring(var7, var8 - (var10 - 1));
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            } else {
                                arg0[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
                            }
                        }
                        if (var16 == 45) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 0;
                        }
                    }
                }
            }
        }
        if (arg2.length() > var7) {
            arg0[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IBI)I")
    public static final int method2135(int arg0, byte arg1, int arg2) {
        field5024++;
        int var3 = class446.method2663(arg0 + 45365, arg2 + 91923, (byte) 45, 4) + (class446.method2663(arg0 + 10294, arg2 + 37821, (byte) 45, 2) - 128 >> 1) + (class446.method2663(arg0, arg2, (byte) 45, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 != 116) {
            return -89;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2136(String arg0, int arg1) {
        field5029++;
        if (arg1 != 13216) {
            this.field5018 = -35;
        }
        return this.method2133((byte) 78, null, arg0);
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "([B)V")
    public class332(byte[] arg0) {
        class145 var2 = new class145(arg0);
        int var3 = var2.method1063((byte) 111);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1063((byte) -121) == 1;
        this.field5025 = new byte[256];
        var2.method1061(256, this.field5025, 0, 73);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1063((byte) -31);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1063((byte) 115);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1093(15);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1093(15);
                    var11[var12][var16] = var15;
                }
            }
            this.field5021 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5021[var13][var14] = (byte) class384.method2380(var13, 90, var7, var5, this.field5025, var11, var14, var9);
                        }
                    }
                }
            }
            this.field5026 = var5[32] + var7[32];
        } else {
            this.field5026 = var2.method1063((byte) 108);
        }
        var2.method1063((byte) -123);
        var2.method1063((byte) -85);
        this.field5028 = var2.method1063((byte) 108);
        this.field5018 = var2.method1063((byte) 125);
    }
}
