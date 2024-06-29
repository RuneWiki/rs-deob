import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class29 {

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "[B")
    private byte[] field308;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "[[B")
    private byte[][] field307;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field311 = 0;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Lsc;")
    public static class270 field309 = new class270(10, 2, 2, 0);

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "Lpu;")
    public static class179 field321 = new class179("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "Z")
    public static boolean field324 = false;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)I", line = 3)
    public final int method165(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method166(null, null, null, null, -107);
        }
        field314++;
        return this.field308[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([Lo;[ILjava/lang/String;[Ljava/lang/String;I)I", line = 16)
    public final int method166(class363[] arg0, int[] arg1, String arg2, String[] arg3, int arg4) {
        field315++;
        if (arg2 == null) {
            return 0;
        }
        if (arg4 != 5256) {
            this.method166(null, null, null, null, 16);
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class365.method2328(arg2.charAt(var15), (byte) -108) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method165(0, var16);
                    if (this.field307 != null && var12 != -1) {
                        var17 += this.field307[var12][var16];
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
                        arg3[var13] = arg2.substring(var7, var15 + 1);
                        var13++;
                        if (arg3.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var6 = 0;
                        var12 = -1;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method165(arg4 - 5256, 60);
                        if (this.field307 != null && var12 != -1) {
                            var17 += this.field307[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method165(0, 62);
                        if (this.field307 != null && var12 != -1) {
                            var17 += this.field307[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method165(0, 160);
                        if (this.field307 != null && var12 != -1) {
                            var17 += this.field307[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method165(0, 173);
                        if (this.field307 != null && var12 != -1) {
                            var17 += this.field307[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method165(0, 215);
                        if (this.field307 != null && var12 != -1) {
                            var17 += this.field307[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method165(0, 8364);
                        if (this.field307 != null && var12 != -1) {
                            var17 += this.field307[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method165(arg4 ^ 0x1488, 169);
                        if (this.field307 != null && var12 != -1) {
                            var17 += this.field307[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method165(0, 174);
                        if (this.field307 != null && var12 != -1) {
                            var17 += this.field307[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class453.method2777(var19.substring(4), 10);
                            var12 = -1;
                            var17 += arg0[var20].method394();
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
                        if (arg1[var13 >= arg1.length ? arg1.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg3[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg3[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var6 = var17;
                                var8 = -1;
                                var7 = var18;
                                var12 = -1;
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
        if (var7 < arg2.length()) {
            arg3[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIC)I", line = 269)
    public final int method167(byte arg0, int arg1, char arg2) {
        if (arg0 < 109) {
            this.field306 = -114;
        }
        field318++;
        return this.field307 == null ? 0 : this.field307[arg1][arg2];
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;II[Lo;I)I", line = 285)
    public final int method168(String arg0, int arg1, int arg2, class363[] arg3, int arg4) {
        if (arg2 == 0) {
            arg2 = this.field306;
        }
        if (arg4 == -20304) {
            field310++;
            int var6 = this.method166(arg3, new int[] { arg1 }, arg0, class537.field7886, 5256);
            int var7 = (var6 - 1) * arg2;
            return var7 + this.field316 + this.field313;
        } else {
            return -81;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 304)
    public static void method169(int arg0) {
        field321 = null;
        if (arg0 < 81) {
            field323 = 31;
        }
        field309 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[Lo;Ljava/lang/String;)I", line = 318)
    public final int method170(int arg0, class363[] arg1, String arg2) {
        field312++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = arg0;
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
                                    int var11 = class453.method2777(var10.substring(4), 10);
                                    var6 += arg1[var11].method394();
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
                    var6 += this.field308[class365.method2328(var9, (byte) -108) & 0xFF] & 0xFF;
                    if (this.field307 != null && var5 != -1) {
                        var6 += this.field307[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIBI)I", line = 428)
    public static final int method171(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field304++;
        int var7 = arg2 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 7 + 1 - arg1 - arg3;
        } else if (var7 == 2) {
            return 8 - arg0 - arg6;
        } else {
            if (arg5 != -88) {
                field309 = null;
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;[Lo;B)I", line = 459)
    public final int method172(int arg0, String arg1, class363[] arg2, byte arg3) {
        if (arg3 <= 37) {
            this.method173(-23, null, -116, null);
        }
        field319++;
        return this.method166(arg2, new int[] { arg0 }, arg1, class537.field7886, 5256);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;I[Lo;)I", line = 471)
    public final int method173(int arg0, String arg1, int arg2, class363[] arg3) {
        field320++;
        int var5 = this.method166(arg3, new int[] { arg0 }, arg1, class537.field7886, 5256);
        int var6 = 0;
        if (arg2 != -11352) {
            field323 = 51;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method170(0, arg3, class537.field7886[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 500)
    public final int method174(String arg0, byte arg1) {
        field305++;
        if (arg1 > -17) {
            this.method165(84, -86);
        }
        return this.method170(0, null, arg0);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "([B)V", line = 520)
    public class29(byte[] arg0) {
        class194 var2 = new class194(arg0);
        int var3 = var2.method1337((byte) 92);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1337((byte) -119) == 1;
        this.field308 = new byte[256];
        var2.method1338(0, 256, this.field308, 127);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1337((byte) -108);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1337((byte) 13);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1398(12);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1398(10);
                    var11[var12][var16] = var15;
                }
            }
            this.field307 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field307[var13][var14] = (byte) class262.method1832(255, var5, var7, var13, var9, var14, var11, this.field308);
                        }
                    }
                }
            }
            this.field306 = var5[32] + var7[32];
        } else {
            this.field306 = var2.method1337((byte) -127);
        }
        var2.method1337((byte) -116);
        var2.method1337((byte) -128);
        this.field313 = var2.method1337((byte) 26);
        this.field316 = var2.method1337((byte) -114);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;I[Lo;I)Ljava/lang/String;", line = 643)
    public final String method175(String arg0, int arg1, class363[] arg2, int arg3) {
        field317++;
        if (arg3 >= this.method170(0, arg2, arg0)) {
            return arg0;
        }
        int var5 = arg3 - this.method170(0, null, "...");
        int var6 = -1;
        int var7 = -1;
        if (arg1 != 160) {
            this.method165(-18, -56);
        }
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
                            if (var13.startsWith("img=") && arg2 != null) {
                                try {
                                    int var14 = class453.method2777(var13.substring(4), 10);
                                    var8 += arg2[var14].method394();
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
                    var8 += this.field308[class365.method2328(var12, (byte) -108) & 0xFF] & 0xFF;
                    if (this.field307 != null && var7 != -1) {
                        var8 += this.field307[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field307 != null) {
                        var15 = this.field307[var12][46] + var8;
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
