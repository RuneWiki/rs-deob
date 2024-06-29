import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class316 {

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "[B")
    private byte[] field4500;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "[[B")
    private byte[][] field4495;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public int field4497;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public int field4493;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "Lgk;")
    public static class331 field4501 = new class331("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "[Lak;")
    public static class232[] field4504;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "([Ll;[IB[Ljava/lang/String;Ljava/lang/String;)I")
    public final int method1968(class16[] arg0, int[] arg1, byte arg2, String[] arg3, String arg4) {
        field4502++;
        if (arg4 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg2 >= -2) {
            method1973(73, -43, 81);
        }
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class215.method1466(true, arg4.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method1972(22148, var16);
                    var18 = var15;
                    if (this.field4495 != null && var12 != -1) {
                        var17 += this.field4495[var12][var16];
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
                        var12 = -1;
                        var8 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1972(22148, 60);
                        if (this.field4495 != null && var12 != -1) {
                            var17 += this.field4495[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1972(22148, 62);
                        if (this.field4495 != null && var12 != -1) {
                            var17 += this.field4495[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1972(22148, 160);
                        if (this.field4495 != null && var12 != -1) {
                            var17 += this.field4495[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1972(22148, 173);
                        if (this.field4495 != null && var12 != -1) {
                            var17 += this.field4495[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1972(22148, 215);
                        if (this.field4495 != null && var12 != -1) {
                            var17 += this.field4495[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1972(22148, 8364);
                        if (this.field4495 != null && var12 != -1) {
                            var17 += this.field4495[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1972(22148, 169);
                        if (this.field4495 != null && var12 != -1) {
                            var17 += this.field4495[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1972(22148, 174);
                        if (this.field4495 != null && var12 != -1) {
                            var17 += this.field4495[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class56.method521(var19.substring(4), 10);
                            var12 = -1;
                            var17 += arg0[var20].method125();
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
                            var9 = var6;
                            var10 = 1;
                        }
                        if (arg1[var13 < arg1.length ? var13 : arg1.length - 1] < var6) {
                            if (var8 >= 0) {
                                arg3[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
                            } else {
                                arg3[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var8 = -1;
                                var6 = var17;
                                var12 = -1;
                                var7 = var18;
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
        if (var7 < arg4.length()) {
            arg3[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method1969(int arg0, String arg1) {
        if (arg0 == -1) {
            field4496++;
            return this.method1971(arg1, arg0 + 110, null);
        } else {
            return 24;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BIC)I")
    public final int method1970(byte arg0, int arg1, char arg2) {
        field4489++;
        if (arg0 > -50) {
            field4503 = -63;
        }
        return this.field4495 == null ? 0 : this.field4495[arg1][arg2];
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I[Ll;)I")
    public final int method1971(String arg0, int arg1, class16[] arg2) {
        field4490++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg1 <= 50) {
            return 11;
        }
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
                                    int var11 = class56.method521(var10.substring(4), 10);
                                    var5 = -1;
                                    var6 += arg2[var11].method125();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field4500[class215.method1466(true, var9) & 0xFF] & 0xFF;
                    if (this.field4495 != null && var5 != -1) {
                        var6 += this.field4495[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)I")
    public final int method1972(int arg0, int arg1) {
        if (arg0 != 22148) {
            this.method1974(null, -76, 2, null, -22);
        }
        field4498++;
        return this.field4500[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Lrb;")
    public static final class235 method1973(int arg0, int arg1, int arg2) {
        class148 var3 = class422.field6240[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2078;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;II[Ll;I)I")
    public final int method1974(String arg0, int arg1, int arg2, class16[] arg3, int arg4) {
        field4487++;
        if (~arg4 == arg2) {
            arg4 = this.field4497;
        }
        int var6 = this.method1968(arg3, new int[] { arg1 }, (byte) -52, class129.field1867, arg0);
        int var7 = (var6 - 1) * arg4;
        return this.field4493 - (-var7 - this.field4488);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[Ll;Ljava/lang/String;I)Ljava/lang/String;")
    public final String method1975(int arg0, class16[] arg1, String arg2, int arg3) {
        field4494++;
        if (arg3 >= this.method1971(arg2, 60, arg1)) {
            return arg2;
        }
        int var5 = arg3 - this.method1971("...", 93, null);
        int var6 = -1;
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
                                    int var14 = class56.method521(var13.substring(4), arg0 ^ 0x20A6);
                                    var8 += arg1[var14].method125();
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
                    var8 += this.field4500[class215.method1466(true, var12) & 0xFF] & 0xFF;
                    if (this.field4495 != null && var7 != -1) {
                        var8 += this.field4495[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field4495 != null) {
                        var15 = this.field4495[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        if (arg0 != 8364) {
            this.method1972(66, 61);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[Ll;ILjava/lang/String;)I")
    public final int method1976(int arg0, class16[] arg1, int arg2, String arg3) {
        field4491++;
        if (arg0 < 59) {
            field4501 = null;
        }
        return this.method1968(arg1, new int[] { arg2 }, (byte) -10, class129.field1867, arg3);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public static void method1977(int arg0) {
        field4504 = null;
        int var1 = -48 % ((-arg0 - 88) / 37);
        field4501 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLjava/lang/String;I[Ll;)I")
    public final int method1978(byte arg0, String arg1, int arg2, class16[] arg3) {
        field4492++;
        int var5 = this.method1968(arg3, new int[] { arg2 }, (byte) -76, class129.field1867, arg1);
        int var6 = 0;
        int var7 = 0;
        int var8 = 52 % ((-arg0 - 40) / 58);
        while (var5 > var7) {
            int var9 = this.method1971(class129.field1867[var7], 104, arg3);
            if (var6 < var9) {
                var6 = var9;
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "([B)V")
    public class316(byte[] arg0) {
        class65 var2 = new class65(arg0);
        int var3 = var2.method577(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method577(255) == 1;
        this.field4500 = new byte[256];
        var2.method595((byte) 22, 256, 0, this.field4500);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method577(255);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method577(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method629(false);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method629(false);
                    var11[var12][var16] = var15;
                }
            }
            this.field4495 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4495[var13][var14] = (byte) class431.method2618(var14, (byte) -79, var7, var11, this.field4500, var13, var5, var9);
                        }
                    }
                }
            }
            this.field4497 = var5[32] + var7[32];
        } else {
            this.field4497 = var2.method577(255);
        }
        var2.method577(255);
        var2.method577(255);
        this.field4493 = var2.method577(255);
        this.field4488 = var2.method577(255);
    }
}
