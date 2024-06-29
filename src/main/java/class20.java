import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[B")
    private byte[] field213;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[[B")
    private byte[][] field212;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    public static int[] field211 = new int[50];

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "F")
    public static float field209;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "F")
    public static float field214;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lps;")
    public static class86 field223;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILjava/lang/String;[Lxa;I)I", line = 7)
    public final int method119(int arg0, int arg1, String arg2, class468[] arg3, int arg4) {
        field224++;
        if (arg0 == arg4) {
            arg0 = this.field215;
        }
        int var6 = this.method122(arg3, arg2, new int[] { arg1 }, (byte) -123, class640.field8670);
        int var7 = (var6 - 1) * arg0;
        return this.field207 - (-this.field225 - var7);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILjava/lang/String;[Lxa;)I", line = 24)
    public final int method120(byte arg0, int arg1, String arg2, class468[] arg3) {
        field220++;
        int var5 = this.method122(arg3, arg2, new int[] { arg1 }, (byte) 97, class640.field8670);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method129(class640.field8670[var7], arg3, (byte) 29);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        if (arg0 < 95) {
            return -91;
        } else {
            return var6;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIC)I", line = 65)
    public final int method121(int arg0, int arg1, char arg2) {
        field208++;
        if (arg0 == 9603) {
            return this.field212 == null ? 0 : this.field212[arg1][arg2];
        } else {
            return -91;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lxa;Ljava/lang/String;[IB[Ljava/lang/String;)I", line = 80)
    public final int method122(class468[] arg0, String arg1, int[] arg2, byte arg3, String[] arg4) {
        field218++;
        if (arg1 == null) {
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
        int var14 = arg1.length();
        int var15 = 9 / ((arg3 - 12) / 36);
        for (int var16 = 0; var16 < var14; var16++) {
            int var17 = class648.method3614(arg1.charAt(var16), (byte) -97) & 0xFF;
            int var18 = 0;
            if (var17 == 60) {
                var11 = var16;
            } else {
                int var19;
                if (var11 == -1) {
                    var19 = var16;
                    var18 += this.method128(var17, 127);
                    if (this.field212 != null && var12 != -1) {
                        var18 += this.field212[var12][var17];
                    }
                    var12 = var17;
                } else {
                    if (var17 != 62) {
                        continue;
                    }
                    var19 = var11;
                    String var20 = arg1.substring(var11 + 1, var16);
                    var11 = -1;
                    if (var20.equals("br")) {
                        arg4[var13] = arg1.substring(var7, var16 + 1);
                        var13++;
                        if (arg4.length <= var13) {
                            return 0;
                        }
                        var7 = var16 + 1;
                        var12 = -1;
                        var8 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var20.equals("lt")) {
                        var18 += this.method128(60, 126);
                        if (this.field212 != null && var12 != -1) {
                            var18 += this.field212[var12][60];
                        }
                        var12 = 60;
                    } else if (var20.equals("gt")) {
                        var18 += this.method128(62, 125);
                        if (this.field212 != null && var12 != -1) {
                            var18 += this.field212[var12][62];
                        }
                        var12 = 62;
                    } else if (var20.equals("nbsp")) {
                        var18 += this.method128(160, 126);
                        if (this.field212 != null && var12 != -1) {
                            var18 += this.field212[var12][160];
                        }
                        var12 = 160;
                    } else if (var20.equals("shy")) {
                        var18 += this.method128(173, 126);
                        if (this.field212 != null && var12 != -1) {
                            var18 += this.field212[var12][173];
                        }
                        var12 = 173;
                    } else if (var20.equals("times")) {
                        var18 += this.method128(215, 126);
                        if (this.field212 != null && var12 != -1) {
                            var18 += this.field212[var12][215];
                        }
                        var12 = 215;
                    } else if (var20.equals("euro")) {
                        var18 += this.method128(8364, 126);
                        if (this.field212 != null && var12 != -1) {
                            var18 += this.field212[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var20.equals("copy")) {
                        var18 += this.method128(169, 125);
                        if (this.field212 != null && var12 != -1) {
                            var18 += this.field212[var12][169];
                        }
                        var12 = 169;
                    } else if (var20.equals("reg")) {
                        var18 += this.method128(174, 125);
                        if (this.field212 != null && var12 != -1) {
                            var18 += this.field212[var12][174];
                        }
                        var12 = 174;
                    } else if (var20.startsWith("img=") && arg0 != null) {
                        try {
                            int var21 = class504.method2750(var20.substring(4), 10);
                            var18 += arg0[var21].method1552();
                            var12 = -1;
                        } catch (Exception var22) {
                        }
                    }
                    var17 = -1;
                }
                if (var18 > 0) {
                    var6 += var18;
                    if (arg2 != null) {
                        if (var17 == 32) {
                            var10 = 1;
                            var8 = var16;
                            var9 = var6;
                        }
                        if (arg2[arg2.length > var13 ? var13 : arg2.length - 1] < var6) {
                            if (var8 < 0) {
                                arg4[var13] = arg1.substring(var7, var19);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var7 = var19;
                                var12 = -1;
                                var6 = var18;
                                var8 = -1;
                            } else {
                                arg4[var13] = arg1.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
                                var8 = -1;
                            }
                        }
                        if (var17 == 45) {
                            var8 = var16;
                            var9 = var6;
                            var10 = 0;
                        }
                    }
                }
            }
        }
        if (var7 < arg1.length()) {
            arg4[var13] = arg1.substring(var7, arg1.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/lang/String;[Lxa;I)I", line = 333)
    public final int method123(int arg0, String arg1, class468[] arg2, int arg3) {
        field219++;
        if (arg3 != -63) {
            this.method128(48, 44);
        }
        return this.method122(arg2, arg1, new int[] { arg0 }, (byte) -76, class640.field8670);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z", line = 345)
    public static final boolean method124(int arg0, int arg1, int arg2) {
        field222++;
        if (arg1 != 23008) {
            method126(-32);
        }
        return (class549.method2935((byte) 123, arg0, arg2) | class39.method252(arg0, (byte) -117, arg2) | class89.method668(arg2, true, arg0)) & class38.method244(arg2, false, arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[Lxa;ILjava/lang/String;)Ljava/lang/String;", line = 356)
    public final String method125(byte arg0, class468[] arg1, int arg2, String arg3) {
        field217++;
        if (this.method129(arg3, arg1, (byte) 49) <= arg2) {
            return arg3;
        }
        int var5 = arg2 - this.method129("...", null, (byte) 102);
        int var6 = -1;
        if (arg0 > -119) {
            this.method129(null, null, (byte) -56);
        }
        int var7 = -1;
        int var8 = 0;
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
                            if (var13.startsWith("img=") && arg1 != null) {
                                try {
                                    int var14 = class504.method2750(var13.substring(4), 10);
                                    var7 = -1;
                                    var8 += arg1[var14].method1552();
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
                    var8 += this.field213[class648.method3614(var12, (byte) -97) & 0xFF] & 0xFF;
                    if (this.field212 != null && var7 != -1) {
                        var8 += this.field212[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field212 != null) {
                        var15 = this.field212[var12][46] + var8;
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

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 485)
    public static void method126(int arg0) {
        field211 = null;
        field223 = null;
        if (arg0 != 256) {
            field206 = 72;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 496)
    public final int method127(String arg0, byte arg1) {
        if (arg1 >= -14) {
            this.method125((byte) 25, null, -116, null);
        }
        field221++;
        return this.method129(arg0, null, (byte) 85);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I", line = 508)
    public final int method128(int arg0, int arg1) {
        if (arg1 <= 124) {
            return 35;
        } else {
            field216++;
            return this.field213[arg0] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;[Lxa;B)I", line = 520)
    public final int method129(String arg0, class468[] arg1, byte arg2) {
        field210++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg0.length();
        int var8 = -17 % ((-arg2 - 53) / 33);
        for (int var9 = 0; var9 < var7; var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 == '<') {
                var4 = var9;
            } else {
                if (var10 == '>' && var4 != -1) {
                    String var11 = arg0.substring(var4 + 1, var9);
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
                                    int var12 = class504.method2750(var11.substring(4), 10);
                                    var6 += arg1[var12].method1552();
                                    var5 = -1;
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var10 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field213[class648.method3614(var10, (byte) -97) & 0xFF] & 0xFF;
                    if (this.field212 != null && var5 != -1) {
                        var6 += this.field212[var5][var10];
                    }
                    var5 = var10;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V", line = 623)
    public class20(byte[] arg0) {
        class572 var2 = new class572(arg0);
        int var3 = var2.method3097((byte) 12);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3097((byte) 12) == 1;
        this.field213 = new byte[256];
        var2.method3081(256, -24643, this.field213, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method3097((byte) 12);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method3097((byte) 12);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3083(255);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3083(255);
                    var11[var12][var16] = var15;
                }
            }
            this.field212 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field212[var13][var14] = (byte) class242.method1453(this.field213, var6, var5, var9, (byte) -45, var13, var11, var14);
                        }
                    }
                }
            }
            this.field215 = var5[32] + var6[32];
        } else {
            this.field215 = var2.method3097((byte) 12);
        }
        var2.method3097((byte) 12);
        var2.method3097((byte) 12);
        this.field207 = var2.method3097((byte) 12);
        this.field225 = var2.method3097((byte) 12);
    }
}
