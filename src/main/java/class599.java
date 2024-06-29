import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class599 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[B")
    private byte[] field8305;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "[[B")
    private byte[][] field8302;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public int field8295;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public int field8307;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public int field8301;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lfc;")
    public static class235 field8299 = new class235(108, 19);

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Lfc;")
    public static class235 field8309 = new class235(87, 6);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Lpq;")
    public static class176 field8310 = new class176(14, 1);

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Lpq;")
    public static class176 field8311 = new class176(15, 4);

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "Lpq;")
    public static class176 field8312 = new class176(16, -2);

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Lpq;")
    public static class176 field8314 = new class176(17, 0);

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Lpq;")
    public static class176 field8315 = new class176(18, -2);

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "Lpq;")
    public static class176 field8316 = new class176(19, -2);

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "Lpq;")
    public static class176 field8317 = new class176(20, 6);

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "Lpq;")
    public static class176 field8318 = new class176(21, 9);

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "Lpq;")
    public static class176 field8319 = new class176(22, -2);

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "Lpq;")
    public static class176 field8320 = new class176(23, 4);

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Lpq;")
    public static class176 field8321 = new class176(24, -1);

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "Lpq;")
    public static class176 field8322 = new class176(25, -2);

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "Lpq;")
    public static class176 field8323 = new class176(26, 0);

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "Lpq;")
    public static class176 field8324 = new class176(27, 0);

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "[Lpq;")
    private static class176[] field8325 = new class176[32];

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field8327;

    static {
        class176[] var0 = class164.method1142(-119);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field8325[var0[var1].field2617] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 17)
    public final int method3314(String arg0, int arg1) {
        int var3 = -62 % ((arg1 + 32) / 39);
        field8296++;
        return this.method3321((byte) -11, arg0, null);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;[Lxa;ZI)I", line = 27)
    public final int method3315(int arg0, String arg1, class461[] arg2, boolean arg3, int arg4) {
        field8304++;
        if (arg4 == 0) {
            arg4 = this.field8295;
        }
        int var6 = this.method3319(class78.field1071, arg1, arg2, new int[] { arg0 }, 29169);
        if (arg3) {
            return 38;
        } else {
            int var7 = (var6 - 1) * arg4;
            return this.field8307 + var7 + this.field8301;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)I", line = 46)
    public final int method3316(int arg0, int arg1) {
        field8308++;
        if (arg1 <= 55) {
            field8325 = null;
        }
        return this.field8305[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;I[Lxa;I)Ljava/lang/String;", line = 60)
    public final String method3317(String arg0, int arg1, class461[] arg2, int arg3) {
        field8298++;
        if (arg3 >= this.method3321((byte) -11, arg0, arg2)) {
            return arg0;
        }
        int var5 = arg3 - this.method3321((byte) -11, "...", null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        if (arg1 != 19062) {
            field8325 = null;
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
                                    int var14 = class551.method3028(arg1 ^ 0x4A72, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg2[var14].method33();
                                    if (var8 > var5) {
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
                    var8 += this.field8305[class417.method2382(var12, (byte) 71) & 0xFF] & 0xFF;
                    if (this.field8302 != null && var7 != -1) {
                        var8 += this.field8302[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field8302 != null) {
                        var15 = this.field8302[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg0.substring(0, var11 + 1);
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;I[Lxa;)I", line = 181)
    public final int method3318(int arg0, String arg1, int arg2, class461[] arg3) {
        field8297++;
        int var5 = this.method3319(class78.field1071, arg1, arg3, new int[] { arg2 }, 29169);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var9 = this.method3321((byte) -11, class78.field1071[var7], arg3);
            if (var9 > var6) {
                var6 = var9;
            }
        }
        int var8 = -29 / ((arg0 + 40) / 47);
        return var6;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Ljava/lang/String;Ljava/lang/String;[Lxa;[II)I", line = 213)
    public final int method3319(String[] arg0, String arg1, class461[] arg2, int[] arg3, int arg4) {
        field8303++;
        if (arg1 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg4 != 29169) {
            return -113;
        }
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class417.method2382(arg1.charAt(var15), (byte) 71) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method3316(var16, 72);
                    var18 = var15;
                    if (this.field8302 != null && var12 != -1) {
                        var17 += this.field8302[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg1.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg0[var13] = arg1.substring(var7, var15 + 1);
                        var13++;
                        if (arg0.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var12 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3316(60, 127);
                        if (this.field8302 != null && var12 != -1) {
                            var17 += this.field8302[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3316(62, 94);
                        if (this.field8302 != null && var12 != -1) {
                            var17 += this.field8302[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3316(160, arg4 ^ 0x7181);
                        if (this.field8302 != null && var12 != -1) {
                            var17 += this.field8302[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3316(173, 101);
                        if (this.field8302 != null && var12 != -1) {
                            var17 += this.field8302[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3316(215, arg4 - 29054);
                        if (this.field8302 != null && var12 != -1) {
                            var17 += this.field8302[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3316(8364, 97);
                        if (this.field8302 != null && var12 != -1) {
                            var17 += this.field8302[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3316(169, 60);
                        if (this.field8302 != null && var12 != -1) {
                            var17 += this.field8302[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3316(174, 98);
                        if (this.field8302 != null && var12 != -1) {
                            var17 += this.field8302[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class551.method3028(4, var19.substring(4));
                            var12 = -1;
                            var17 += arg2[var20].method33();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg3 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg3[arg3.length > var13 ? var13 : arg3.length - 1]) {
                            if (var8 < 0) {
                                arg0[var13] = arg1.substring(var7, var18);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var8 = -1;
                                var6 = var17;
                                var12 = -1;
                                var7 = var18;
                            } else {
                                arg0[var13] = arg1.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
                            }
                        }
                        if (var16 == 45) {
                            var10 = 0;
                            var9 = var6;
                            var8 = var15;
                        }
                    }
                }
            }
        }
        if (var7 < arg1.length()) {
            arg0[var13] = arg1.substring(var7, arg1.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Ljava/lang/String;I[Lxa;I)I", line = 464)
    public final int method3320(String arg0, int arg1, class461[] arg2, int arg3) {
        if (arg3 != 0) {
            field8317 = null;
        }
        field8300++;
        return this.method3319(class78.field1071, arg0, arg2, new int[] { arg1 }, 29169);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/String;[Lxa;)I", line = 480)
    public final int method3321(byte arg0, String arg1, class461[] arg2) {
        field8306++;
        if (arg0 != -11) {
            this.field8307 = 4;
        }
        if (arg1 == null) {
            return 0;
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
                                    int var11 = class551.method3028(4, var10.substring(4));
                                    var6 += arg2[var11].method33();
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
                    var6 += this.field8305[class417.method2382(var9, (byte) 71) & 0xFF] & 0xFF;
                    if (this.field8302 != null && var5 != -1) {
                        var6 += this.field8302[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 589)
    public static void method3322(int arg0) {
        field8320 = null;
        field8314 = null;
        field8316 = null;
        field8321 = null;
        field8318 = null;
        field8319 = null;
        field8312 = null;
        field8299 = null;
        field8323 = null;
        field8317 = null;
        if (arg0 >= -109) {
            method3322(58);
        }
        field8309 = null;
        field8324 = null;
        field8322 = null;
        field8315 = null;
        field8310 = null;
        field8311 = null;
        field8325 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ICI)I", line = 619)
    public final int method3323(int arg0, char arg1, int arg2) {
        field8313++;
        if (arg2 == 0) {
            return this.field8302 == null ? 0 : this.field8302[arg0][arg1];
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V", line = 647)
    public class599(byte[] arg0) {
        class96 var2 = new class96(arg0);
        int var3 = var2.method718(-92);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method718(111) == 1;
        this.field8305 = new byte[256];
        var2.method719(this.field8305, 256, -7861, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method718(-72);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method718(-78);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method748(-813976688);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method748(-813976688);
                    var11[var12][var16] = var15;
                }
            }
            this.field8302 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field8302[var13][var14] = (byte) class585.method3263(this.field8305, var11, var13, var6, var9, var14, var5, true);
                        }
                    }
                }
            }
            this.field8295 = var5[32] + var6[32];
        } else {
            this.field8295 = var2.method718(125);
        }
        var2.method718(115);
        var2.method718(-107);
        this.field8307 = var2.method718(-60);
        this.field8301 = var2.method718(-79);
    }
}
