import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class56 {

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "[B")
    private byte[] field815;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "[[B")
    private byte[][] field805;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "Lbj;")
    public static class430 field803 = new class430();

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "Lmq;")
    public static class78 field810 = new class78(119, 6);

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B[Lac;Ljava/lang/String;)I", line = 5)
    public final int method445(byte arg0, class712[] arg1, String arg2) {
        field809++;
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
                                    int var11 = class337.method1980(-27187, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg1[var11].method1892();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field815[class278.method1665(var9, (byte) 59) & 0xFF] & 0xFF;
                    if (this.field805 != null && var5 != -1) {
                        var6 += this.field805[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        if (arg0 < 47) {
            this.method448('\u0012', 89, -69);
        }
        return var6;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/String;[Lac;IB)Ljava/lang/String;", line = 112)
    public final String method446(String arg0, class712[] arg1, int arg2, byte arg3) {
        field802++;
        if (arg2 >= this.method445((byte) 118, arg1, arg0)) {
            return arg0;
        }
        if (arg3 != -98) {
            method452(19);
        }
        int var5 = arg2 - this.method445((byte) 55, null, "...");
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
                            if (var13.startsWith("img=") && arg1 != null) {
                                try {
                                    int var14 = class337.method1980(arg3 ^ 0x6A53, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg1[var14].method1892();
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
                    var8 += this.field815[class278.method1665(var12, (byte) 59) & 0xFF] & 0xFF;
                    if (this.field805 != null && var7 != -1) {
                        var8 += this.field805[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field805 != null) {
                        var15 = this.field805[var12][46] + var8;
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

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "([Lac;BILjava/lang/String;)I", line = 233)
    public final int method447(class712[] arg0, byte arg1, int arg2, String arg3) {
        field811++;
        int var5 = this.method454((byte) -60, arg0, new int[] { arg2 }, class145.field1722, arg3);
        if (arg1 <= 28) {
            return -3;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method445((byte) 48, arg0, class145.field1722[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(CII)I", line = 265)
    public final int method448(char arg0, int arg1, int arg2) {
        if (arg2 != -4959) {
            this.field813 = -13;
        }
        field807++;
        return this.field805 == null ? 0 : this.field805[arg1][arg0];
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILjava/lang/String;I[Lac;)I", line = 285)
    public final int method449(int arg0, String arg1, int arg2, class712[] arg3) {
        if (arg2 <= 66) {
            this.field808 = 80;
        }
        field804++;
        return this.method454((byte) -71, arg3, new int[] { arg0 }, class145.field1722, arg1);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "([Lac;Ljava/lang/String;IBI)I", line = 297)
    public final int method450(class712[] arg0, String arg1, int arg2, byte arg3, int arg4) {
        field812++;
        if (arg3 != -34) {
            field810 = null;
        }
        if (arg4 == 0) {
            arg4 = this.field813;
        }
        int var6 = this.method454((byte) -91, arg0, new int[] { arg2 }, class145.field1722, arg1);
        int var7 = (var6 - 1) * arg4;
        return this.field800 + var7 + this.field808;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)I", line = 317)
    public final int method451(int arg0, int arg1) {
        if (arg0 == 62) {
            field801++;
            return this.field815[arg1] & 0xFF;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V", line = 328)
    public static void method452(int arg0) {
        field810 = null;
        field803 = null;
        if (arg0 != -15889) {
            field810 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILjava/lang/String;)I", line = 343)
    public final int method453(int arg0, String arg1) {
        field806++;
        return arg0 == -1 ? this.method445((byte) 65, null, arg1) : -9;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "([B)V", line = 361)
    public class56(byte[] arg0) {
        class179 var2 = new class179(arg0);
        int var3 = var2.method1094(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1094(255) == 1;
        this.field815 = new byte[256];
        var2.method1096(256, 0, this.field815, 12050);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1094(255);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1094(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1133(8);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1133(8);
                    var11[var12][var16] = var15;
                }
            }
            this.field805 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field805[var13][var14] = (byte) class174.method1077(var14, this.field815, var9, var13, var5, var11, var7, (byte) -107);
                        }
                    }
                }
            }
            this.field813 = var5[32] + var7[32];
        } else {
            this.field813 = var2.method1094(255);
        }
        var2.method1094(255);
        var2.method1094(255);
        this.field800 = var2.method1094(255);
        this.field808 = var2.method1094(255);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B[Lac;[I[Ljava/lang/String;Ljava/lang/String;)I", line = 483)
    public final int method454(byte arg0, class712[] arg1, int[] arg2, String[] arg3, String arg4) {
        field814++;
        if (arg4 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg0 >= -36) {
            this.method454((byte) 107, null, null, null, null);
        }
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class278.method1665(arg4.charAt(var15), (byte) 59) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method451(62, var16);
                    var18 = var15;
                    if (this.field805 != null && var12 != -1) {
                        var17 += this.field805[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg4.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg3[var13] = arg4.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg3.length) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var12 = -1;
                        var8 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method451(62, 60);
                        if (this.field805 != null && var12 != -1) {
                            var17 += this.field805[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method451(62, 62);
                        if (this.field805 != null && var12 != -1) {
                            var17 += this.field805[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method451(62, 160);
                        if (this.field805 != null && var12 != -1) {
                            var17 += this.field805[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method451(62, 173);
                        if (this.field805 != null && var12 != -1) {
                            var17 += this.field805[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method451(62, 215);
                        if (this.field805 != null && var12 != -1) {
                            var17 += this.field805[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method451(62, 8364);
                        if (this.field805 != null && var12 != -1) {
                            var17 += this.field805[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method451(62, 169);
                        if (this.field805 != null && var12 != -1) {
                            var17 += this.field805[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method451(62, 174);
                        if (this.field805 != null && var12 != -1) {
                            var17 += this.field805[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class337.method1980(-27187, var19.substring(4));
                            var17 += arg1[var20].method1892();
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
                        if (arg2[arg2.length <= var13 ? arg2.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg3[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg3[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var8 = -1;
                                var7 = var18;
                                var6 = var17;
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
        if (var7 < arg4.length()) {
            arg3[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }
}
