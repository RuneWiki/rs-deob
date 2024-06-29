import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class598 {

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[B")
    private byte[] field8182;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public int field8183;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "[[B")
    private byte[][] field8185;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public int field8188;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public int field8190;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "[Z")
    public static boolean[] field8189 = new boolean[200];

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field8179 = 0;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[[[I")
    public static int[][][] field8178 = new int[2][][];

    @OriginalMember(owner = "client!il", name = "c", descriptor = "F")
    public static float field8175;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;[Lxa;I)I")
    public final int method3308(int arg0, String arg1, class424[] arg2, int arg3) {
        field8174++;
        int var5 = this.method3311(arg1, class562.field7689, arg2, new int[] { arg0 }, 94);
        int var6 = arg3;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method3313(arg2, (byte) -99, class562.field7689[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method3309(byte arg0) {
        field8189 = null;
        if (arg0 == -61) {
            field8178 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;I[Lxa;B)Ljava/lang/String;")
    public final String method3310(String arg0, int arg1, class424[] arg2, byte arg3) {
        field8184++;
        if (this.method3313(arg2, (byte) 79, arg0) <= arg1) {
            return arg0;
        }
        int var5 = arg1 - this.method3313(null, (byte) 74, "...");
        int var6 = 57 / ((arg3 + 87) / 37);
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        int var10 = arg0.length();
        String var11 = "";
        for (int var12 = 0; var12 < var10; var12++) {
            char var13 = arg0.charAt(var12);
            if (var13 == '<') {
                var7 = var12;
            } else {
                if (var13 == '>' && var7 != -1) {
                    String var14 = arg0.substring(var7 + 1, var12);
                    var7 = -1;
                    if (var14.equals("lt")) {
                        var13 = '<';
                    } else if (var14.equals("gt")) {
                        var13 = '>';
                    } else if (var14.equals("nbsp")) {
                        var13 = ' ';
                    } else if (var14.equals("shy")) {
                        var13 = '\u00AD';
                    } else if (var14.equals("times")) {
                        var13 = '×';
                    } else if (var14.equals("euro")) {
                        var13 = '€';
                    } else if (var14.equals("copy")) {
                        var13 = '©';
                    } else {
                        if (!var14.equals("reg")) {
                            if (var14.startsWith("img=") && arg2 != null) {
                                try {
                                    int var15 = class433.method2495(var14.substring(4), 0);
                                    var8 = -1;
                                    var9 += arg2[var15].method1160();
                                    if (var9 > var5) {
                                        return var11 + "...";
                                    }
                                    var11 = arg0.substring(0, var12 + 1);
                                } catch (Exception var17) {
                                }
                            }
                            continue;
                        }
                        var13 = '®';
                    }
                }
                if (var7 == -1) {
                    var9 += this.field8182[class9.method61(var13, 2174) & 0xFF] & 0xFF;
                    if (this.field8185 != null && var8 != -1) {
                        var9 += this.field8185[var8][var13];
                    }
                    var8 = var13;
                    int var16 = var9;
                    if (this.field8185 != null) {
                        var16 = this.field8185[var13][46] + var9;
                    }
                    if (var5 < var16) {
                        return var11 + "...";
                    }
                    var11 = arg0.substring(0, var12 + 1);
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;[Lxa;[II)I")
    public final int method3311(String arg0, String[] arg1, class424[] arg2, int[] arg3, int arg4) {
        field8173++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        if (arg4 < 80) {
            this.method3316((char) 65520, -90, -45);
        }
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class9.method61(arg0.charAt(var15), 2174) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method3317(var16, false);
                    if (this.field8185 != null && var12 != -1) {
                        var17 += this.field8185[var12][var16];
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
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var6 = 0;
                        var8 = -1;
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3317(60, false);
                        if (this.field8185 != null && var12 != -1) {
                            var17 += this.field8185[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3317(62, false);
                        if (this.field8185 != null && var12 != -1) {
                            var17 += this.field8185[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3317(160, false);
                        if (this.field8185 != null && var12 != -1) {
                            var17 += this.field8185[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3317(173, false);
                        if (this.field8185 != null && var12 != -1) {
                            var17 += this.field8185[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3317(215, false);
                        if (this.field8185 != null && var12 != -1) {
                            var17 += this.field8185[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3317(8364, false);
                        if (this.field8185 != null && var12 != -1) {
                            var17 += this.field8185[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3317(169, false);
                        if (this.field8185 != null && var12 != -1) {
                            var17 += this.field8185[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3317(174, false);
                        if (this.field8185 != null && var12 != -1) {
                            var17 += this.field8185[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class433.method2495(var19.substring(4), 0);
                            var17 += arg2[var20].method1160();
                            var12 = -1;
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
                            var10 = 1;
                            var8 = var15;
                        }
                        if (arg3[arg3.length > var13 ? var13 : arg3.length - 1] < var6) {
                            if (var8 < 0) {
                                arg1[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
                                var6 = var17;
                            } else {
                                arg1[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            }
                        }
                        if (var16 == 45) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 0;
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

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method3312(int arg0, String arg1) {
        field8186++;
        if (arg0 != -23728) {
            this.method3313(null, (byte) 22, null);
        }
        return this.method3313(null, (byte) -92, arg1);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([Lxa;BLjava/lang/String;)I")
    public final int method3313(class424[] arg0, byte arg1, String arg2) {
        field8180++;
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class433.method2495(var10.substring(4), 0);
                                    var6 += arg0[var11].method1160();
                                    var5 = -1;
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field8182[class9.method61(var9, 2174) & 0xFF] & 0xFF;
                    if (this.field8185 != null && var5 != -1) {
                        var6 += this.field8185[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        int var12 = 105 % ((arg1 + 6) / 55);
        return var6;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;[Lxa;ZI)I")
    public final int method3314(String arg0, class424[] arg1, boolean arg2, int arg3) {
        field8187++;
        if (arg2) {
            this.field8182 = null;
        }
        return this.method3311(arg0, class562.field7689, arg1, new int[] { arg3 }, 90);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BII[Lxa;Ljava/lang/String;)I")
    public final int method3315(byte arg0, int arg1, int arg2, class424[] arg3, String arg4) {
        if (arg2 == 0) {
            arg2 = this.field8183;
        }
        int var6 = -108 / ((34 - arg0) / 35);
        field8176++;
        int var7 = this.method3311(arg4, class562.field7689, arg3, new int[] { arg1 }, 122);
        int var8 = (var7 - 1) * arg2;
        return this.field8188 + var8 + this.field8190;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(CII)I")
    public final int method3316(char arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field8190 = -113;
        }
        field8177++;
        return this.field8185 == null ? 0 : this.field8185[arg1][arg0];
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)I")
    public final int method3317(int arg0, boolean arg1) {
        field8181++;
        if (arg1) {
            this.field8182 = null;
        }
        return this.field8182[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "([B)V")
    public class598(byte[] arg0) {
        class138 var2 = new class138(arg0);
        int var3 = var2.method957((byte) -68);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method957((byte) -84) == 1;
        this.field8182 = new byte[256];
        var2.method934(8, 0, 256, this.field8182);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method957((byte) -95);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method957((byte) -107);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method950(false);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method950(false);
                    var11[var12][var16] = var15;
                }
            }
            this.field8185 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field8185[var13][var14] = (byte) class91.method504((byte) 68, var13, var14, this.field8182, var7, var11, var9, var5);
                        }
                    }
                }
            }
            this.field8183 = var5[32] + var7[32];
        } else {
            this.field8183 = var2.method957((byte) -76);
        }
        var2.method957((byte) -63);
        var2.method957((byte) -76);
        this.field8188 = var2.method957((byte) -106);
        this.field8190 = var2.method957((byte) -87);
    }
}
