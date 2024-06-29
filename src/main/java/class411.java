import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class411 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[B")
    private byte[] field5802;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[[B")
    private byte[][] field5800;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public int field5808;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public int field5804;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public int field5813;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Lhm;")
    public static class150 field5809 = null;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Leh;")
    public static class246 field5801 = new class246(52, 0);

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Lo;")
    public static class24 field5805;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ICI)I")
    public final int method2429(int arg0, char arg1, int arg2) {
        if (arg2 == 5572) {
            field5814++;
            return this.field5800 == null ? 0 : this.field5800[arg0][arg1];
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method2430(String arg0, byte arg1) {
        if (arg1 >= -102) {
            this.method2434(true, null, null);
        }
        field5807++;
        return this.method2434(true, arg0, null);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;B[Lo;)I")
    public final int method2431(int arg0, String arg1, byte arg2, class24[] arg3) {
        int var5 = -90 / ((arg2 + 65) / 53);
        field5816++;
        return this.method2436(arg1, false, class386.field5423, arg3, new int[] { arg0 });
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static void method2432(byte arg0) {
        field5801 = null;
        if (arg0 == -59) {
            field5805 = null;
            field5809 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;I[Lo;)Ljava/lang/String;")
    public final String method2433(int arg0, String arg1, int arg2, class24[] arg3) {
        field5817++;
        if (arg0 != 169) {
            field5801 = null;
        }
        if (this.method2434(true, arg1, arg3) <= arg2) {
            return arg1;
        }
        int var5 = arg2 - this.method2434(true, "...", null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg1.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg1.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg1.substring(var6 + 1, var11);
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
                                    int var14 = class387.method2244(var13.substring(4), 10);
                                    var7 = -1;
                                    var8 += arg3[var14].method145();
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg1.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field5802[class224.method1382(true, var12) & 0xFF] & 0xFF;
                    if (this.field5800 != null && var7 != -1) {
                        var8 += this.field5800[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field5800 != null) {
                        var15 = this.field5800[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg1.substring(0, var11 + 1);
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLjava/lang/String;[Lo;)I")
    public final int method2434(boolean arg0, String arg1, class24[] arg2) {
        field5815++;
        if (arg1 == null) {
            return 0;
        }
        if (!arg0) {
            this.method2430(null, (byte) -117);
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
                                    int var11 = class387.method2244(var10.substring(4), 10);
                                    var5 = -1;
                                    var6 += arg2[var11].method145();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field5802[class224.method1382(true, var9) & 0xFF] & 0xFF;
                    if (this.field5800 != null && var5 != -1) {
                        var6 += this.field5800[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BILjava/lang/String;[Lo;)I")
    public final int method2435(byte arg0, int arg1, String arg2, class24[] arg3) {
        field5811++;
        int var5 = this.method2436(arg2, false, class386.field5423, arg3, new int[] { arg1 });
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2434(true, class386.field5423[var7], arg3);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        if (arg0 == 114) {
            return var6;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;Z[Ljava/lang/String;[Lo;[I)I")
    public final int method2436(String arg0, boolean arg1, String[] arg2, class24[] arg3, int[] arg4) {
        field5812++;
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
        if (arg1) {
            field5801 = null;
        }
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class224.method1382(true, arg0.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2438(-113, var16);
                    if (this.field5800 != null && var12 != -1) {
                        var17 += this.field5800[var12][var16];
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
                        arg2[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg2.length) {
                            return 0;
                        }
                        var8 = -1;
                        var12 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2438(36, 60);
                        if (this.field5800 != null && var12 != -1) {
                            var17 += this.field5800[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2438(-109, 62);
                        if (this.field5800 != null && var12 != -1) {
                            var17 += this.field5800[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2438(-120, 160);
                        if (this.field5800 != null && var12 != -1) {
                            var17 += this.field5800[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2438(-116, 173);
                        if (this.field5800 != null && var12 != -1) {
                            var17 += this.field5800[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2438(-119, 215);
                        if (this.field5800 != null && var12 != -1) {
                            var17 += this.field5800[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2438(-124, 8364);
                        if (this.field5800 != null && var12 != -1) {
                            var17 += this.field5800[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2438(-106, 169);
                        if (this.field5800 != null && var12 != -1) {
                            var17 += this.field5800[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2438(-120, 174);
                        if (this.field5800 != null && var12 != -1) {
                            var17 += this.field5800[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class387.method2244(var19.substring(4), 10);
                            var17 += arg3[var20].method145();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg4 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var8 = var15;
                            var9 = var6;
                        }
                        if (var6 > arg4[arg4.length > var13 ? var13 : arg4.length - 1]) {
                            if (var8 >= 0) {
                                arg2[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg2.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg2[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var7 = var18;
                                var12 = -1;
                                var8 = -1;
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
        if (var7 < arg0.length()) {
            arg2[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I[Lo;II)I")
    public final int method2437(String arg0, int arg1, class24[] arg2, int arg3, int arg4) {
        field5803++;
        int var6 = 38 / ((arg1 - 4) / 52);
        if (arg3 == 0) {
            arg3 = this.field5808;
        }
        int var7 = this.method2436(arg0, false, class386.field5423, arg2, new int[] { arg4 });
        int var8 = (var7 - 1) * arg3;
        return this.field5804 + this.field5813 + var8;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I")
    public final int method2438(int arg0, int arg1) {
        int var3 = -122 % ((-arg0 - 37) / 54);
        field5806++;
        return this.field5802[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([B)V")
    public class411(byte[] arg0) {
        class403 var2 = new class403(arg0);
        int var3 = var2.method2357((byte) 124);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2357((byte) 119) == 1;
        this.field5802 = new byte[256];
        var2.method2379(256, -118, this.field5802, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2357((byte) 109);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2357((byte) 124);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2359(66);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2359(86);
                    var11[var12][var16] = var15;
                }
            }
            this.field5800 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5800[var13][var14] = (byte) class58.method479(var6, this.field5802, (byte) 125, var11, var14, var5, var13, var9);
                        }
                    }
                }
            }
            this.field5808 = var5[32] + var6[32];
        } else {
            this.field5808 = var2.method2357((byte) 115);
        }
        var2.method2357((byte) 120);
        var2.method2357((byte) 122);
        this.field5804 = var2.method2357((byte) 118);
        this.field5813 = var2.method2357((byte) 111);
    }
}
