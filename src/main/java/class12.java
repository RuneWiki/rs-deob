import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "[B")
    private byte[] field204;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "[[B")
    private byte[][] field200;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Lgf;")
    public static class180 field198 = new class180("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILjava/lang/String;I[Lf;)I")
    public final int method97(int arg0, String arg1, int arg2, class528[] arg3) {
        if (arg2 != 24619) {
            this.method99(96, null, null, -106);
        }
        field207++;
        return this.method106(class157.field2383, arg3, arg1, new int[] { arg0 }, false);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static void method98(int arg0) {
        if (arg0 < 70) {
            field196 = 21;
        }
        field198 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[Lf;Ljava/lang/String;I)Ljava/lang/String;")
    public final String method99(int arg0, class528[] arg1, String arg2, int arg3) {
        field195++;
        int var5 = 109 / ((arg0 - 77) / 46);
        if (arg3 >= this.method100(107, arg1, arg2)) {
            return arg2;
        }
        int var6 = arg3 - this.method100(118, null, "...");
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        int var10 = arg2.length();
        String var11 = "";
        for (int var12 = 0; var12 < var10; var12++) {
            char var13 = arg2.charAt(var12);
            if (var13 == '<') {
                var7 = var12;
            } else {
                if (var13 == '>' && var7 != -1) {
                    String var14 = arg2.substring(var7 + 1, var12);
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
                            if (var14.startsWith("img=") && arg1 != null) {
                                try {
                                    int var15 = class457.method2745(var14.substring(4), true);
                                    var9 += arg1[var15].method134();
                                    var8 = -1;
                                    if (var9 > var6) {
                                        return var11 + "...";
                                    }
                                    var11 = arg2.substring(0, var12 + 1);
                                } catch (Exception var17) {
                                }
                            }
                            continue;
                        }
                        var13 = '®';
                    }
                }
                if (var7 == -1) {
                    var9 += this.field204[class167.method1189(var13, 26421) & 0xFF] & 0xFF;
                    if (this.field200 != null && var8 != -1) {
                        var9 += this.field200[var8][var13];
                    }
                    var8 = var13;
                    int var16 = var9;
                    if (this.field200 != null) {
                        var16 = this.field200[var13][46] + var9;
                    }
                    if (var16 > var6) {
                        return var11 + "...";
                    }
                    var11 = arg2.substring(0, var12 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[Lf;Ljava/lang/String;)I")
    public final int method100(int arg0, class528[] arg1, String arg2) {
        field208++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = -119 / ((arg0 - 70) / 36);
        int var8 = arg2.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 == '<') {
                var4 = var9;
            } else {
                if (var10 == '>' && var4 != -1) {
                    String var11 = arg2.substring(var4 + 1, var9);
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
                                    int var12 = class457.method2745(var11.substring(4), true);
                                    var5 = -1;
                                    var6 += arg1[var12].method134();
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var10 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field204[class167.method1189(var10, 26421) & 0xFF] & 0xFF;
                    if (this.field200 != null && var5 != -1) {
                        var6 += this.field200[var5][var10];
                    }
                    var5 = var10;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([Lf;Ljava/lang/String;II)I")
    public final int method101(class528[] arg0, String arg1, int arg2, int arg3) {
        field209++;
        int var5 = this.method106(class157.field2383, arg0, arg1, new int[] { arg2 }, false);
        int var6 = arg3;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method100(arg3 - 7, arg0, class157.field2383[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(CBI)I")
    public final int method102(char arg0, byte arg1, int arg2) {
        field199++;
        if (arg1 <= 69) {
            this.method100(-25, null, null);
        }
        return this.field200 == null ? 0 : this.field200[arg2][arg0];
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)I")
    public final int method103(int arg0, byte arg1) {
        if (arg1 != -79) {
            this.method106(null, null, null, null, true);
        }
        field197++;
        return this.field204[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIILjava/lang/String;[Lf;)I")
    public final int method104(int arg0, int arg1, int arg2, String arg3, class528[] arg4) {
        field205++;
        if (~arg2 == arg0) {
            arg2 = this.field203;
        }
        int var6 = this.method106(class157.field2383, arg4, arg3, new int[] { arg1 }, false);
        int var7 = (var6 - 1) * arg2;
        return this.field194 + var7 + this.field201;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method105(String arg0, int arg1) {
        field202++;
        return arg1 == 1 ? this.method100(111, null, arg0) : -104;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([Ljava/lang/String;[Lf;Ljava/lang/String;[IZ)I")
    public final int method106(String[] arg0, class528[] arg1, String arg2, int[] arg3, boolean arg4) {
        field206++;
        if (arg2 == null) {
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
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class167.method1189(arg2.charAt(var15), 26421) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method103(var16, (byte) -79);
                    if (this.field200 != null && var12 != -1) {
                        var17 += this.field200[var12][var16];
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
                        arg0[var13] = arg2.substring(var7, var15 + 1);
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
                        var17 += this.method103(60, (byte) -79);
                        if (this.field200 != null && var12 != -1) {
                            var17 += this.field200[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method103(62, (byte) -79);
                        if (this.field200 != null && var12 != -1) {
                            var17 += this.field200[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method103(160, (byte) -79);
                        if (this.field200 != null && var12 != -1) {
                            var17 += this.field200[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method103(173, (byte) -79);
                        if (this.field200 != null && var12 != -1) {
                            var17 += this.field200[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method103(215, (byte) -79);
                        if (this.field200 != null && var12 != -1) {
                            var17 += this.field200[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method103(8364, (byte) -79);
                        if (this.field200 != null && var12 != -1) {
                            var17 += this.field200[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method103(169, (byte) -79);
                        if (this.field200 != null && var12 != -1) {
                            var17 += this.field200[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method103(174, (byte) -79);
                        if (this.field200 != null && var12 != -1) {
                            var17 += this.field200[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class457.method2745(var19.substring(4), true);
                            var17 += arg1[var20].method134();
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
                            var8 = var15;
                            var10 = 1;
                        }
                        if (arg3[arg3.length > var13 ? var13 : arg3.length - 1] < var6) {
                            if (var8 >= 0) {
                                arg0[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg0[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var12 = -1;
                                var8 = -1;
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
        if (arg4) {
            this.method97(63, null, -29, null);
        }
        if (arg2.length() > var7) {
            arg0[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "([B)V")
    public class12(byte[] arg0) {
        class303 var2 = new class303(arg0);
        int var3 = var2.method1918((byte) -128);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1918((byte) -35) == 1;
        this.field204 = new byte[256];
        var2.method1881(0, this.field204, 9624, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1918((byte) -84);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1918((byte) -66);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1899((byte) 53);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1899((byte) -96);
                    var11[var12][var16] = var15;
                }
            }
            this.field200 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field200[var13][var14] = (byte) class320.method2006(var13, var9, true, var5, var6, var14, this.field204, var11);
                        }
                    }
                }
            }
            this.field203 = var6[32] + var5[32];
        } else {
            this.field203 = var2.method1918((byte) 107);
        }
        var2.method1918((byte) -127);
        var2.method1918((byte) 78);
        this.field194 = var2.method1918((byte) 96);
        this.field201 = var2.method1918((byte) 96);
    }
}
