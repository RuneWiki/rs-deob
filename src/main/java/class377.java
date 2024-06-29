import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class377 {

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "[B")
    private byte[] field5243;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "[[B")
    private byte[][] field5238;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public int field5236;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "J")
    public static long field5237 = 0L;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field5245 = 2;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILjava/lang/String;[Lufa;)I", line = 4)
    public final int method2211(int arg0, int arg1, String arg2, class680[] arg3) {
        field5249++;
        return arg1 == 0 ? this.method2217(arg2, class52.field547, new int[] { arg0 }, arg3, -1) : 121;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILjava/lang/String;[Lufa;B)I", line = 30)
    public final int method2212(int arg0, String arg1, class680[] arg2, byte arg3) {
        field5250++;
        int var5 = -79 % ((-arg3 - 55) / 58);
        int var6 = this.method2217(arg1, class52.field547, new int[] { arg0 }, arg2, -1);
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            int var9 = this.method2218((byte) 64, arg2, class52.field547[var8]);
            if (var7 < var9) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BCI)I", line = 59)
    public final int method2213(byte arg0, char arg1, int arg2) {
        if (arg0 != -50) {
            this.method2215((byte) -79, 29);
        }
        field5244++;
        return this.field5238 == null ? 0 : this.field5238[arg2][arg1];
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "([Lufa;IILjava/lang/String;Z)I", line = 82)
    public final int method2214(class680[] arg0, int arg1, int arg2, String arg3, boolean arg4) {
        field5242++;
        if (!arg4) {
            return 61;
        }
        if (arg2 == 0) {
            arg2 = this.field5241;
        }
        int var6 = this.method2217(arg3, class52.field547, new int[] { arg1 }, arg0, -1);
        int var7 = (var6 - 1) * arg2;
        return this.field5239 + this.field5236 + var7;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)I", line = 102)
    public final int method2215(byte arg0, int arg1) {
        field5240++;
        int var3 = -43 % ((arg0 + 77) / 37);
        return this.field5243[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 112)
    public final int method2216(String arg0, int arg1) {
        if (arg1 < 98) {
            this.method2212(-112, null, null, (byte) 87);
        }
        field5251++;
        return this.method2218((byte) 118, null, arg0);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;[I[Lufa;I)I", line = 126)
    public final int method2217(String arg0, String[] arg1, int[] arg2, class680[] arg3, int arg4) {
        field5247++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = arg4;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class153.method933((byte) 88, arg0.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2215((byte) -117, var16);
                    if (this.field5238 != null && var12 != -1) {
                        var17 += this.field5238[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg0.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg1[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg1.length) {
                            return 0;
                        }
                        var8 = -1;
                        var6 = 0;
                        var12 = -1;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2215((byte) 49, 60);
                        if (this.field5238 != null && var12 != -1) {
                            var17 += this.field5238[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2215((byte) 51, 62);
                        if (this.field5238 != null && var12 != -1) {
                            var17 += this.field5238[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2215((byte) 9, 160);
                        if (this.field5238 != null && var12 != -1) {
                            var17 += this.field5238[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2215((byte) -114, 173);
                        if (this.field5238 != null && var12 != -1) {
                            var17 += this.field5238[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2215((byte) 77, 215);
                        if (this.field5238 != null && var12 != -1) {
                            var17 += this.field5238[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2215((byte) -124, 8364);
                        if (this.field5238 != null && var12 != -1) {
                            var17 += this.field5238[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2215((byte) -126, 169);
                        if (this.field5238 != null && var12 != -1) {
                            var17 += this.field5238[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2215((byte) 5, 174);
                        if (this.field5238 != null && var12 != -1) {
                            var17 += this.field5238[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class436.method2477(48, var19.substring(4));
                            var17 += arg3[var20].method666();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg2 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var9 = var6;
                            var8 = var15;
                        }
                        if (arg2[var13 < arg2.length ? var13 : arg2.length - 1] < var6) {
                            if (var8 < 0) {
                                arg1[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var8 = -1;
                                var7 = var18;
                                var12 = -1;
                                var6 = var17;
                            } else {
                                arg1[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var8 = -1;
                                var12 = -1;
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
        if (arg0.length() > var7) {
            arg1[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "([B)V", line = 370)
    public class377(byte[] arg0) {
        class611 var2 = new class611(arg0);
        int var3 = var2.method3428((byte) -110);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3428((byte) 121) == 1;
        this.field5243 = new byte[256];
        var2.method3389(this.field5243, true, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method3428((byte) 94);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method3428((byte) -114);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3390((byte) -19);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3390((byte) -19);
                    var11[var12][var16] = var15;
                }
            }
            this.field5238 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5238[var13][var14] = (byte) class375.method2204(var14, var13, var9, false, var5, var11, var6, this.field5243);
                        }
                    }
                }
            }
            this.field5241 = var5[32] + var6[32];
        } else {
            this.field5241 = var2.method3428((byte) -104);
        }
        var2.method3428((byte) 21);
        var2.method3428((byte) -109);
        this.field5239 = var2.method3428((byte) 119);
        this.field5236 = var2.method3428((byte) -98);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B[Lufa;Ljava/lang/String;)I", line = 493)
    public final int method2218(byte arg0, class680[] arg1, String arg2) {
        field5248++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
        int var8 = 0;
        int var9 = 75 / ((arg0 - 7) / 57);
        while (var8 < var7) {
            char var10 = arg2.charAt(var8);
            if (var10 == '<') {
                var4 = var8;
            } else {
                label76: {
                    if (var10 == '>' && var4 != -1) {
                        String var11 = arg2.substring(var4 + 1, var8);
                        var4 = -1;
                        if (var11.equals("lt")) {
                            var10 = '<';
                        } else if (var11.equals("gt")) {
                            var10 = '>';
                        } else if (var11.equals("nbsp")) {
                            var10 = ' ';
                        } else if (var11.equals("shy")) {
                            var10 = '\u00AD';
                        } else if (var11.equals("times")) {
                            var10 = '×';
                        } else if (var11.equals("euro")) {
                            var10 = '€';
                        } else if (var11.equals("copy")) {
                            var10 = '©';
                        } else {
                            if (!var11.equals("reg")) {
                                if (var11.startsWith("img=") && arg1 != null) {
                                    try {
                                        int var12 = class436.method2477(-51, var11.substring(4));
                                        var5 = -1;
                                        var6 += arg1[var12].method666();
                                    } catch (Exception var13) {
                                    }
                                }
                                break label76;
                            }
                            var10 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field5243[class153.method933((byte) 88, var10) & 0xFF] & 0xFF;
                        if (this.field5238 != null && var5 != -1) {
                            var6 += this.field5238[var5][var10];
                        }
                        var5 = var10;
                    }
                }
            }
            var8++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;Z[Lufa;I)Ljava/lang/String;", line = 598)
    public final String method2219(String arg0, boolean arg1, class680[] arg2, int arg3) {
        field5246++;
        if (arg3 >= this.method2218((byte) -110, arg2, arg0)) {
            return arg0;
        }
        int var5 = arg3 - this.method2218((byte) 87, null, "...");
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        if (arg1) {
            this.field5238 = null;
        }
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
                            if (var13.startsWith("img=") && arg2 != null) {
                                try {
                                    int var14 = class436.method2477(-96, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg2[var14].method666();
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
                    var8 += this.field5243[class153.method933((byte) 88, var12) & 0xFF] & 0xFF;
                    if (this.field5238 != null && var7 != -1) {
                        var8 += this.field5238[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field5238 != null) {
                        var15 = this.field5238[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg0.substring(0, var11 + 1);
                }
            }
        }
        return arg0;
    }
}
