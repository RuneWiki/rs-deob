import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class402 {

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "[B")
    private byte[] field6076;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public int field6079;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "[[B")
    private byte[][] field6080;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public int field6073;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public int field6077;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "Z")
    public static boolean field6085 = false;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "Llo;")
    public static class651 field6068 = new class651();

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "Lig;")
    public static class206 field6086 = new class206(66, -1);

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "B")
    public static byte field6071;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "Lpp;")
    public static class333 field6088;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "[[I")
    public static int[][] field6087;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIZI)V", line = 3)
    public static final void method2552(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field6084++;
        if (!arg4) {
            method2552(-101, -115, -119, 14, true, -116);
        }
        if (class595.field8694.field6532 != 0 && arg5 != 0 && class220.field3015 < 50 && arg1 != -1) {
            class526.field7632[class220.field3015++] = new class85((byte) 1, arg1, arg5, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(CIB)I", line = 24)
    public final int method2553(char arg0, int arg1, byte arg2) {
        field6083++;
        if (arg2 > -106) {
            field6087 = null;
        }
        return this.field6080 == null ? 0 : this.field6080[arg1][arg0];
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 41)
    public final int method2554(String arg0, byte arg1) {
        field6075++;
        return arg1 == 0 ? this.method2560(arg0, 1, null) : 118;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)I", line = 56)
    public final int method2555(int arg0, int arg1) {
        field6069++;
        if (arg1 <= 34) {
            this.field6079 = -2;
        }
        return this.field6076[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[Lxa;Ljava/lang/String;I)Ljava/lang/String;", line = 68)
    public final String method2556(int arg0, class433[] arg1, String arg2, int arg3) {
        field6082++;
        if (arg0 >= this.method2560(arg2, 1, arg1)) {
            return arg2;
        }
        int var5 = arg0 - this.method2560("...", 1, null);
        int var6 = arg3;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg2.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg2.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg2.substring(var6 + 1, var11);
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
                            if (var13.startsWith("img=") && arg1 != null) {
                                try {
                                    int var14 = class575.method3340((byte) 61, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg1[var14].method1577();
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg2.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field6076[class479.method2919(var12, -6030) & 0xFF] & 0xFF;
                    if (this.field6080 != null && var7 != -1) {
                        var8 += this.field6080[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field6080 != null) {
                        var15 = this.field6080[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "([Lxa;IILjava/lang/String;)I", line = 187)
    public final int method2557(class433[] arg0, int arg1, int arg2, String arg3) {
        field6072++;
        if (arg2 != 0) {
            field6071 = -31;
        }
        return this.method2561(arg3, new int[] { arg1 }, (byte) -106, arg0, class169.field2061);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 201)
    public static void method2558(int arg0) {
        if (arg0 <= -75) {
            field6088 = null;
            field6087 = null;
            field6068 = null;
            field6086 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B[Lxa;Ljava/lang/String;I)I", line = 214)
    public final int method2559(byte arg0, class433[] arg1, String arg2, int arg3) {
        field6070++;
        int var5 = -14 % ((-arg0 - 48) / 35);
        int var6 = this.method2561(arg2, new int[] { arg3 }, (byte) -109, arg1, class169.field2061);
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            int var9 = this.method2560(class169.field2061[var8], 1, arg1);
            if (var7 < var9) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;I[Lxa;)I", line = 247)
    public final int method2560(String arg0, int arg1, class433[] arg2) {
        field6078++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (arg1 != 1) {
            this.method2557(null, 27, 36, null);
        }
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg0.substring(var4 + 1, var8);
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
                                    int var11 = class575.method3340((byte) 61, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg2[var11].method1577();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field6076[class479.method2919(var9, -6030) & 0xFF] & 0xFF;
                    if (this.field6080 != null && var5 != -1) {
                        var6 += this.field6080[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;[IB[Lxa;[Ljava/lang/String;)I", line = 352)
    public final int method2561(String arg0, int[] arg1, byte arg2, class433[] arg3, String[] arg4) {
        field6074++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        if (arg2 > -84) {
            return -64;
        }
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class479.method2919(arg0.charAt(var15), -6030) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2555(var16, 56);
                    if (this.field6080 != null && var12 != -1) {
                        var17 += this.field6080[var12][var16];
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
                        arg4[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg4.length) {
                            return 0;
                        }
                        var8 = -1;
                        var12 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2555(60, 91);
                        if (this.field6080 != null && var12 != -1) {
                            var17 += this.field6080[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2555(62, 47);
                        if (this.field6080 != null && var12 != -1) {
                            var17 += this.field6080[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2555(160, 117);
                        if (this.field6080 != null && var12 != -1) {
                            var17 += this.field6080[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2555(173, 100);
                        if (this.field6080 != null && var12 != -1) {
                            var17 += this.field6080[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2555(215, 69);
                        if (this.field6080 != null && var12 != -1) {
                            var17 += this.field6080[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2555(8364, 80);
                        if (this.field6080 != null && var12 != -1) {
                            var17 += this.field6080[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2555(169, 80);
                        if (this.field6080 != null && var12 != -1) {
                            var17 += this.field6080[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2555(174, 111);
                        if (this.field6080 != null && var12 != -1) {
                            var17 += this.field6080[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class575.method3340((byte) -87, var19.substring(4));
                            var12 = -1;
                            var17 += arg3[var20].method1577();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg1 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var10 = 1;
                            var9 = var6;
                        }
                        if (var6 > arg1[var13 < arg1.length ? var13 : arg1.length - 1]) {
                            if (var8 >= 0) {
                                arg4[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
                            } else {
                                arg4[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var6 = var17;
                                var8 = -1;
                                var7 = var18;
                            }
                        }
                        if (var16 == 45) {
                            var10 = 0;
                            var8 = var15;
                            var9 = var6;
                        }
                    }
                }
            }
        }
        if (arg0.length() > var7) {
            arg4[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B[Lxa;IILjava/lang/String;)I", line = 603)
    public final int method2562(byte arg0, class433[] arg1, int arg2, int arg3, String arg4) {
        field6081++;
        if (arg2 == 0) {
            arg2 = this.field6079;
        }
        if (arg0 <= 43) {
            this.field6073 = -22;
        }
        int var6 = this.method2561(arg4, new int[] { arg3 }, (byte) -110, arg1, class169.field2061);
        int var7 = (var6 - 1) * arg2;
        return this.field6073 + var7 + this.field6077;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "([B)V", line = 636)
    public class402(byte[] arg0) {
        class194 var2 = new class194(arg0);
        int var3 = var2.method1177(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1177(255) == 1;
        this.field6076 = new byte[256];
        var2.method1200(this.field6076, (byte) -118, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1177(255);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1177(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1213((byte) 44);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1213((byte) 62);
                    var11[var12][var16] = var15;
                }
            }
            this.field6080 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field6080[var13][var14] = (byte) class567.method3289(var11, var14, var9, var5, 120, var7, var13, this.field6076);
                        }
                    }
                }
            }
            this.field6079 = var5[32] + var7[32];
        } else {
            this.field6079 = var2.method1177(255);
        }
        var2.method1177(255);
        var2.method1177(255);
        this.field6073 = var2.method1177(255);
        this.field6077 = var2.method1177(255);
    }
}
