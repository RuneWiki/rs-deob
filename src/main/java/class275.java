import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class275 {

    @OriginalMember(owner = "client!je", name = "k", descriptor = "[B")
    private byte[] field3985;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[[B")
    private byte[][] field3976;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field3988;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lwt;")
    public static class202 field3978 = new class202("", 10);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public final int method1797(boolean arg0, String arg1) {
        field3982++;
        return arg0 ? 94 : this.method1807(arg1, 160, null);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method1798(int arg0) {
        field3978 = null;
        if (arg0 != -15676) {
            method1798(-24);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(CII)I")
    public final int method1799(char arg0, int arg1, int arg2) {
        field3979++;
        if (arg1 > -39) {
            this.field3985 = null;
        }
        return this.field3976 == null ? 0 : this.field3976[arg2][arg0];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLjava/lang/String;[Lf;I)I")
    public final int method1800(int arg0, boolean arg1, String arg2, class529[] arg3, int arg4) {
        if (arg0 == 0) {
            arg0 = this.field3986;
        }
        field3983++;
        int var6 = this.method1805(65, arg3, arg2, new int[] { arg4 }, class251.field3737);
        if (arg1) {
            this.field3985 = null;
        }
        int var7 = (var6 - 1) * arg0;
        return this.field3988 + var7 + this.field3980;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
    public static final int method1801(int arg0, int arg1) {
        return class339.field4778 == null ? 0 : (class339.field4778[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
    public final int method1802(int arg0, int arg1) {
        field3987++;
        return arg0 < 119 ? 50 : this.field3985[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IB[Lf;)Ljava/lang/String;")
    public final String method1803(String arg0, int arg1, byte arg2, class529[] arg3) {
        field3977++;
        if (arg1 >= this.method1807(arg0, 160, arg3)) {
            return arg0;
        }
        int var5 = arg1 - this.method1807("...", 160, null);
        if (arg2 <= 97) {
            return null;
        }
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
                                    int var14 = class92.method532(var13.substring(4), 10);
                                    var8 += arg3[var14].method105();
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
                    var8 += this.field3985[class291.method1862(var12, 24237) & 0xFF] & 0xFF;
                    if (this.field3976 != null && var7 != -1) {
                        var8 += this.field3976[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field3976 != null) {
                        var15 = this.field3976[var12][46] + var8;
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

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IZ[Lf;)I")
    public final int method1804(String arg0, int arg1, boolean arg2, class529[] arg3) {
        field3981++;
        if (!arg2) {
            this.method1800(50, false, null, null, 116);
        }
        return this.method1805(-104, arg3, arg0, new int[] { arg1 }, class251.field3737);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[Lf;Ljava/lang/String;[I[Ljava/lang/String;)I")
    public final int method1805(int arg0, class529[] arg1, String arg2, int[] arg3, String[] arg4) {
        field3984++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = 53 / ((6 - arg0) / 49);
        int var12 = -1;
        int var13 = -1;
        int var14 = 0;
        int var15 = arg2.length();
        for (int var16 = 0; var16 < var15; var16++) {
            int var17 = class291.method1862(arg2.charAt(var16), 24237) & 0xFF;
            int var18 = 0;
            if (var17 == 60) {
                var12 = var16;
            } else {
                int var19;
                if (var12 == -1) {
                    var19 = var16;
                    var18 += this.method1802(127, var17);
                    if (this.field3976 != null && var13 != -1) {
                        var18 += this.field3976[var13][var17];
                    }
                    var13 = var17;
                } else {
                    if (var17 != 62) {
                        continue;
                    }
                    var19 = var12;
                    String var20 = arg2.substring(var12 + 1, var16);
                    var12 = -1;
                    if (var20.equals("br")) {
                        arg4[var14] = arg2.substring(var7, var16 + 1);
                        var14++;
                        if (arg4.length <= var14) {
                            return 0;
                        }
                        var7 = var16 + 1;
                        var8 = -1;
                        var13 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var20.equals("lt")) {
                        var18 += this.method1802(127, 60);
                        if (this.field3976 != null && var13 != -1) {
                            var18 += this.field3976[var13][60];
                        }
                        var13 = 60;
                    } else if (var20.equals("gt")) {
                        var18 += this.method1802(123, 62);
                        if (this.field3976 != null && var13 != -1) {
                            var18 += this.field3976[var13][62];
                        }
                        var13 = 62;
                    } else if (var20.equals("nbsp")) {
                        var18 += this.method1802(122, 160);
                        if (this.field3976 != null && var13 != -1) {
                            var18 += this.field3976[var13][160];
                        }
                        var13 = 160;
                    } else if (var20.equals("shy")) {
                        var18 += this.method1802(121, 173);
                        if (this.field3976 != null && var13 != -1) {
                            var18 += this.field3976[var13][173];
                        }
                        var13 = 173;
                    } else if (var20.equals("times")) {
                        var18 += this.method1802(120, 215);
                        if (this.field3976 != null && var13 != -1) {
                            var18 += this.field3976[var13][215];
                        }
                        var13 = 215;
                    } else if (var20.equals("euro")) {
                        var18 += this.method1802(121, 8364);
                        if (this.field3976 != null && var13 != -1) {
                            var18 += this.field3976[var13][8364];
                        }
                        var13 = 8364;
                    } else if (var20.equals("copy")) {
                        var18 += this.method1802(125, 169);
                        if (this.field3976 != null && var13 != -1) {
                            var18 += this.field3976[var13][169];
                        }
                        var13 = 169;
                    } else if (var20.equals("reg")) {
                        var18 += this.method1802(120, 174);
                        if (this.field3976 != null && var13 != -1) {
                            var18 += this.field3976[var13][174];
                        }
                        var13 = 174;
                    } else if (var20.startsWith("img=") && arg1 != null) {
                        try {
                            int var21 = class92.method532(var20.substring(4), 10);
                            var13 = -1;
                            var18 += arg1[var21].method105();
                        } catch (Exception var22) {
                        }
                    }
                    var17 = -1;
                }
                if (var18 > 0) {
                    var6 += var18;
                    if (arg3 != null) {
                        if (var17 == 32) {
                            var10 = 1;
                            var9 = var6;
                            var8 = var16;
                        }
                        if (var6 > arg3[var14 >= arg3.length ? arg3.length - 1 : var14]) {
                            if (var8 >= 0) {
                                arg4[var14] = arg2.substring(var7, var8 + 1 - var10);
                                var14++;
                                if (arg4.length <= var14) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var8 = -1;
                                var13 = -1;
                            } else {
                                arg4[var14] = arg2.substring(var7, var19);
                                var14++;
                                if (arg4.length <= var14) {
                                    return 0;
                                }
                                var6 = var18;
                                var8 = -1;
                                var7 = var19;
                                var13 = -1;
                            }
                        }
                        if (var17 == 45) {
                            var10 = 0;
                            var9 = var6;
                            var8 = var16;
                        }
                    }
                }
            }
        }
        if (var7 < arg2.length()) {
            arg4[var14] = arg2.substring(var7, arg2.length());
            var14++;
        }
        return var14;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[Lf;ILjava/lang/String;)I")
    public final int method1806(int arg0, class529[] arg1, int arg2, String arg3) {
        field3975++;
        if (arg2 != -1) {
            this.field3980 = -106;
        }
        int var5 = this.method1805(-61, arg1, arg3, new int[] { arg0 }, class251.field3737);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1807(class251.field3737[var7], 160, arg1);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I[Lf;)I")
    public final int method1807(String arg0, int arg1, class529[] arg2) {
        field3989++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (arg1 != 160) {
            this.field3985 = null;
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
                                    int var11 = class92.method532(var10.substring(4), 10);
                                    var5 = -1;
                                    var6 += arg2[var11].method105();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field3985[class291.method1862(var9, 24237) & 0xFF] & 0xFF;
                    if (this.field3976 != null && var5 != -1) {
                        var6 += this.field3976[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
    public class275(byte[] arg0) {
        class209 var2 = new class209(arg0);
        int var3 = var2.method1428(32122);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1428(32122) == 1;
        this.field3985 = new byte[256];
        var2.method1436((byte) 124, 0, this.field3985, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1428(32122);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1428(32122);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1417(false);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1417(false);
                    var11[var12][var16] = var15;
                }
            }
            this.field3976 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field3976[var13][var14] = (byte) class6.method39(var14, var9, var5, this.field3985, var6, -92, var11, var13);
                        }
                    }
                }
            }
            this.field3986 = var5[32] + var6[32];
        } else {
            this.field3986 = var2.method1428(32122);
        }
        var2.method1428(32122);
        var2.method1428(32122);
        this.field3980 = var2.method1428(32122);
        this.field3988 = var2.method1428(32122);
    }
}
