import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class166 {

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "[B")
    private byte[] field2246;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[[B")
    private byte[][] field2243;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[B")
    public static byte[] field2240 = new byte[520];

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "F")
    public static float field2255;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI[Lha;Ljava/lang/String;)Ljava/lang/String;")
    public final String method1050(byte arg0, int arg1, class116[] arg2, String arg3) {
        field2244++;
        if (this.method1051(arg3, arg2, (byte) 108) <= arg1) {
            return arg3;
        }
        int var5 = arg1 - this.method1051("...", null, (byte) 111);
        int var6 = -1;
        if (arg0 < 17) {
            return null;
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
                            if (var13.startsWith("img=") && arg2 != null) {
                                try {
                                    int var14 = class233.method1518(var13.substring(4), (byte) -128);
                                    var7 = -1;
                                    var8 += arg2[var14].method722();
                                    if (var8 > var5) {
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
                    var8 += this.field2246[class644.method3724(var12, -124) & 0xFF] & 0xFF;
                    if (this.field2243 != null && var7 != -1) {
                        var8 += this.field2243[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field2243 != null) {
                        var15 = this.field2243[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg3.substring(0, var11 + 1);
                }
            }
        }
        return arg3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;[Lha;B)I")
    public final int method1051(String arg0, class116[] arg1, byte arg2) {
        field2249++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (arg2 < 89) {
            this.method1054((char) 65488, 35, 101);
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
                            if (var10.startsWith("img=") && arg1 != null) {
                                try {
                                    int var11 = class233.method1518(var10.substring(4), (byte) -127);
                                    var6 += arg1[var11].method722();
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
                    var6 += this.field2246[class644.method3724(var9, -105) & 0xFF] & 0xFF;
                    if (this.field2243 != null && var5 != -1) {
                        var6 += this.field2243[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([Ljava/lang/String;B[Lha;[ILjava/lang/String;)I")
    public final int method1052(String[] arg0, byte arg1, class116[] arg2, int[] arg3, String arg4) {
        field2241++;
        if (arg4 == null) {
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
        int var14 = 30 % ((arg1 + 55) / 46);
        int var15 = arg4.length();
        for (int var16 = 0; var16 < var15; var16++) {
            int var17 = class644.method3724(arg4.charAt(var16), -99) & 0xFF;
            int var18 = 0;
            if (var17 == 60) {
                var11 = var16;
            } else {
                int var19;
                if (var11 == -1) {
                    var19 = var16;
                    var18 += this.method1057(var17, 126);
                    if (this.field2243 != null && var12 != -1) {
                        var18 += this.field2243[var12][var17];
                    }
                    var12 = var17;
                } else {
                    if (var17 != 62) {
                        continue;
                    }
                    var19 = var11;
                    String var20 = arg4.substring(var11 + 1, var16);
                    var11 = -1;
                    if (var20.equals("br")) {
                        arg0[var13] = arg4.substring(var7, var16 + 1);
                        var13++;
                        if (arg0.length <= var13) {
                            return 0;
                        }
                        var6 = 0;
                        var8 = -1;
                        var7 = var16 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var20.equals("lt")) {
                        var18 += this.method1057(60, 127);
                        if (this.field2243 != null && var12 != -1) {
                            var18 += this.field2243[var12][60];
                        }
                        var12 = 60;
                    } else if (var20.equals("gt")) {
                        var18 += this.method1057(62, 127);
                        if (this.field2243 != null && var12 != -1) {
                            var18 += this.field2243[var12][62];
                        }
                        var12 = 62;
                    } else if (var20.equals("nbsp")) {
                        var18 += this.method1057(160, 127);
                        if (this.field2243 != null && var12 != -1) {
                            var18 += this.field2243[var12][160];
                        }
                        var12 = 160;
                    } else if (var20.equals("shy")) {
                        var18 += this.method1057(173, 127);
                        if (this.field2243 != null && var12 != -1) {
                            var18 += this.field2243[var12][173];
                        }
                        var12 = 173;
                    } else if (var20.equals("times")) {
                        var18 += this.method1057(215, 127);
                        if (this.field2243 != null && var12 != -1) {
                            var18 += this.field2243[var12][215];
                        }
                        var12 = 215;
                    } else if (var20.equals("euro")) {
                        var18 += this.method1057(8364, 126);
                        if (this.field2243 != null && var12 != -1) {
                            var18 += this.field2243[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var20.equals("copy")) {
                        var18 += this.method1057(169, 125);
                        if (this.field2243 != null && var12 != -1) {
                            var18 += this.field2243[var12][169];
                        }
                        var12 = 169;
                    } else if (var20.equals("reg")) {
                        var18 += this.method1057(174, 126);
                        if (this.field2243 != null && var12 != -1) {
                            var18 += this.field2243[var12][174];
                        }
                        var12 = 174;
                    } else if (var20.startsWith("img=") && arg2 != null) {
                        try {
                            int var21 = class233.method1518(var20.substring(4), (byte) -126);
                            var12 = -1;
                            var18 += arg2[var21].method722();
                        } catch (Exception var22) {
                        }
                    }
                    var17 = -1;
                }
                if (var18 > 0) {
                    var6 += var18;
                    if (arg3 != null) {
                        if (var17 == 32) {
                            var9 = var6;
                            var8 = var16;
                            var10 = 1;
                        }
                        if (var6 > arg3[var13 < arg3.length ? var13 : arg3.length - 1]) {
                            if (var8 >= 0) {
                                arg0[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
                                var8 = -1;
                            } else {
                                arg0[var13] = arg4.substring(var7, var19);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var6 = var18;
                                var7 = var19;
                                var12 = -1;
                                var8 = -1;
                            }
                        }
                        if (var17 == 45) {
                            var10 = 0;
                            var8 = var16;
                            var9 = var6;
                        }
                    }
                }
            }
        }
        if (var7 < arg4.length()) {
            arg0[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method1053(byte arg0, String arg1) {
        field2257++;
        int var3 = -90 % ((arg0 + 28) / 32);
        return this.method1051(arg1, null, (byte) 115);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(CII)I")
    public final int method1054(char arg0, int arg1, int arg2) {
        field2239++;
        int var4 = 68 / ((60 - arg1) / 61);
        return this.field2243 == null ? 0 : this.field2243[arg2][arg0];
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([Lha;BLjava/lang/String;I)I")
    public final int method1055(class116[] arg0, byte arg1, String arg2, int arg3) {
        field2248++;
        int var5 = this.method1052(class642.field9328, (byte) -116, arg0, new int[] { arg3 }, arg2);
        int var6 = 0;
        if (arg1 != 98) {
            method1059(77);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1051(class642.field9328[var7], arg0, (byte) 114);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIILos;)Lgg;")
    public static final class273 method1056(int arg0, int arg1, int arg2, int arg3, int arg4, class468 arg5) {
        field2252++;
        int var6 = -17 % ((-arg2 - 51) / 45);
        if (!arg5.field7022 && (!class154.method899(arg4, 85) || !class154.method899(arg1, 90))) {
            return arg5.field7095 ? new class273(arg5, 34037, arg0, arg3, arg4, arg1, true) : new class273(arg5, arg0, arg3, arg4, arg1, class479.method2908((byte) -99, arg4), class479.method2908((byte) -99, arg1), true);
        } else {
            return new class273(arg5, 3553, arg0, arg3, arg4, arg1, true);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
    public final int method1057(int arg0, int arg1) {
        field2245++;
        if (arg1 <= 124) {
            this.field2243 = null;
        }
        return this.field2246[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/String;[Lha;I)I")
    public final int method1058(int arg0, String arg1, class116[] arg2, int arg3) {
        field2254++;
        if (arg0 < 30) {
            this.method1052(null, (byte) -44, null, null, null);
        }
        return this.method1052(class642.field9328, (byte) 32, arg2, new int[] { arg3 }, arg1);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method1059(int arg0) {
        if (arg0 != 0) {
            method1056(-100, 96, -105, 0, -38, null);
        }
        field2240 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[Lha;Ljava/lang/String;I)I")
    public final int method1060(int arg0, int arg1, class116[] arg2, String arg3, int arg4) {
        if (arg1 == 0) {
            arg1 = this.field2250;
        }
        field2242++;
        int var6 = -64 / ((arg0 + 48) / 46);
        int var7 = this.method1052(class642.field9328, (byte) 27, arg2, new int[] { arg4 }, arg3);
        int var8 = (var7 - 1) * arg1;
        return this.field2256 + var8 + this.field2253;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B)V")
    public class166(byte[] arg0) {
        class428 var2 = new class428(arg0);
        int var3 = var2.method2561((byte) -108);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2561((byte) -64) == 1;
        this.field2246 = new byte[256];
        var2.method2575(28637, 256, this.field2246, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2561((byte) 117);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2561((byte) -96);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2570((byte) 57);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2570((byte) 57);
                    var11[var12][var16] = var15;
                }
            }
            this.field2243 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2243[var13][var14] = (byte) class102.method593(var11, this.field2246, var13, var14, var9, var5, 255, var6);
                        }
                    }
                }
            }
            this.field2250 = var5[32] + var6[32];
        } else {
            this.field2250 = var2.method2561((byte) -46);
        }
        var2.method2561((byte) -49);
        var2.method2561((byte) -47);
        this.field2256 = var2.method2561((byte) 111);
        this.field2253 = var2.method2561((byte) -125);
    }

    static {
        new class487("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }
}
