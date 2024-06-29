import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class443 {

    @OriginalMember(owner = "client!du", name = "s", descriptor = "[B")
    private byte[] field6519;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "[[B")
    private byte[][] field6518;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public int field6506;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public int field6516;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Lmt;")
    public static class517 field6502 = new class517(16);

    @OriginalMember(owner = "client!du", name = "o", descriptor = "[[I")
    public static int[][] field6515 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field6517 = 0;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "Lss;")
    public static class325 field6509;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B[Ll;Ljava/lang/String;)I", line = 6)
    public final int method2596(byte arg0, class127[] arg1, String arg2) {
        field6513++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
        if (arg0 <= 59) {
            this.field6516 = -101;
        }
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
                                    int var11 = class164.method1153(var10.substring(4), 10);
                                    var5 = -1;
                                    var6 += arg1[var11].method468();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field6519[class509.method3008((byte) -123, var9) & 0xFF] & 0xFF;
                    if (this.field6518 != null && var5 != -1) {
                        var6 += this.field6518[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([Ll;ILjava/lang/String;I)Ljava/lang/String;", line = 112)
    public final String method2597(class127[] arg0, int arg1, String arg2, int arg3) {
        field6507++;
        if (this.method2596((byte) 107, arg0, arg2) <= arg1) {
            return arg2;
        }
        int var5 = arg1 - this.method2596((byte) 64, null, "...");
        int var6 = -1;
        int var7 = arg3;
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
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class164.method1153(var13.substring(4), 10);
                                    var8 += arg0[var14].method468();
                                    var7 = -1;
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
                    var8 += this.field6519[class509.method3008((byte) -123, var12) & 0xFF] & 0xFF;
                    if (this.field6518 != null && var7 != -1) {
                        var8 += this.field6518[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field6518 != null) {
                        var15 = this.field6518[var12][46] + var8;
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

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([Ll;Ljava/lang/String;III)I", line = 232)
    public final int method2598(class127[] arg0, String arg1, int arg2, int arg3, int arg4) {
        field6505++;
        if (arg4 == 0) {
            arg4 = this.field6506;
        }
        int var6 = this.method2601(class393.field5896, new int[] { arg3 }, arg0, arg1, 0);
        if (arg2 > -94) {
            return -66;
        } else {
            int var7 = (var6 - 1) * arg4;
            return this.field6503 + var7 + this.field6516;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 252)
    public final int method2599(String arg0, byte arg1) {
        if (arg1 <= 57) {
            return -21;
        } else {
            field6504++;
            return this.method2596((byte) 68, null, arg0);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IZILgo;)V", line = 263)
    public static final void method2600(int arg0, boolean arg1, int arg2, class310 arg3) {
        if (!arg1) {
            class107.field1599 = arg3;
            class280.field4231 = arg2;
            field6508++;
            class169.field2478 = arg0;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([Ljava/lang/String;[I[Ll;Ljava/lang/String;I)I", line = 276)
    public final int method2601(String[] arg0, int[] arg1, class127[] arg2, String arg3, int arg4) {
        field6512++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        int var10 = arg4;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class509.method3008((byte) -123, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2603(var16, -1);
                    var18 = var15;
                    if (this.field6518 != null && var12 != -1) {
                        var17 += this.field6518[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg3.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg0[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (arg0.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2603(60, ~arg4);
                        if (this.field6518 != null && var12 != -1) {
                            var17 += this.field6518[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2603(62, -1);
                        if (this.field6518 != null && var12 != -1) {
                            var17 += this.field6518[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2603(160, -1);
                        if (this.field6518 != null && var12 != -1) {
                            var17 += this.field6518[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2603(173, -1);
                        if (this.field6518 != null && var12 != -1) {
                            var17 += this.field6518[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2603(215, -1);
                        if (this.field6518 != null && var12 != -1) {
                            var17 += this.field6518[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2603(8364, -1);
                        if (this.field6518 != null && var12 != -1) {
                            var17 += this.field6518[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2603(169, -1);
                        if (this.field6518 != null && var12 != -1) {
                            var17 += this.field6518[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2603(174, -1);
                        if (this.field6518 != null && var12 != -1) {
                            var17 += this.field6518[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class164.method1153(var19.substring(4), 10);
                            var12 = -1;
                            var17 += arg2[var20].method468();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg1 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var9 = var6;
                            var8 = var15;
                        }
                        if (arg1[var13 < arg1.length ? var13 : arg1.length - 1] < var6) {
                            if (var8 >= 0) {
                                arg0[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
                            } else {
                                arg0[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var8 = -1;
                                var6 = var17;
                                var12 = -1;
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
        if (arg3.length() > var7) {
            arg0[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II[Ll;Ljava/lang/String;)I", line = 522)
    public final int method2602(int arg0, int arg1, class127[] arg2, String arg3) {
        field6501++;
        int var5 = this.method2601(class393.field5896, new int[] { arg0 }, arg2, arg3, 0);
        int var6 = 0;
        int var7 = 86 % ((-arg1 - 59) / 36);
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method2596((byte) 63, arg2, class393.field5896[var8]);
            if (var6 < var9) {
                var6 = var9;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)I", line = 552)
    public final int method2603(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method2602(118, -48, null, null);
        }
        field6514++;
        return this.field6519[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 569)
    public static void method2604(byte arg0) {
        field6515 = null;
        field6502 = null;
        if (arg0 >= -13) {
            field6502 = null;
        }
        field6509 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[Ll;Ljava/lang/String;B)I", line = 589)
    public final int method2605(int arg0, class127[] arg1, String arg2, byte arg3) {
        if (arg3 == 22) {
            field6511++;
            return this.method2601(class393.field5896, new int[] { arg0 }, arg1, arg2, arg3 ^ 0x16);
        } else {
            return 89;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(CBI)I", line = 601)
    public final int method2606(char arg0, byte arg1, int arg2) {
        field6510++;
        int var4 = -122 / ((arg1 + 60) / 54);
        return this.field6518 == null ? 0 : this.field6518[arg2][arg0];
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "([B)V", line = 623)
    public class443(byte[] arg0) {
        class468 var2 = new class468(arg0);
        int var3 = var2.method2765(95);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2765(71) == 1;
        this.field6519 = new byte[256];
        var2.method2716(0, -118, this.field6519, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2765(84);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2765(109);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2714((byte) -70);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2714((byte) -92);
                    var11[var12][var16] = var15;
                }
            }
            this.field6518 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field6518[var13][var14] = (byte) class304.method1892(-64, var14, var11, var5, this.field6519, var13, var9, var6);
                        }
                    }
                }
            }
            this.field6506 = var5[32] + var6[32];
        } else {
            this.field6506 = var2.method2765(73);
        }
        var2.method2765(86);
        var2.method2765(121);
        this.field6516 = var2.method2765(79);
        this.field6503 = var2.method2765(87);
    }
}
