import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class56 {

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "[B")
    private byte[] field764;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "[[B")
    private byte[][] field761;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Lfg;")
    public static class83 field767 = new class83("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "[Ljava/lang/String;")
    private static String[] field768 = new String[100];

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "S")
    public static short field772 = 1;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "Ljm;")
    public static class485 field773 = new class485(66, 8);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "J")
    public static long field770;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "Lnn;")
    public static class285 field771;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 7)
    public final int method362(String arg0, byte arg1) {
        if (arg1 <= 54) {
            return 122;
        } else {
            field763++;
            return this.method365(arg0, 13299, null);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[Lf;Ljava/lang/String;B)I", line = 18)
    public final int method363(int arg0, class529[] arg1, String arg2, byte arg3) {
        if (arg3 != 86) {
            this.method363(24, null, null, (byte) 99);
        }
        field769++;
        return this.method367(arg1, new int[] { arg0 }, arg2, false, field768);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 29)
    public static void method364(int arg0) {
        field767 = null;
        field773 = null;
        field768 = null;
        if (arg0 >= 1) {
            field771 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;I[Lf;)I", line = 43)
    public final int method365(String arg0, int arg1, class529[] arg2) {
        field775++;
        if (arg1 != 13299) {
            field773 = null;
        }
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
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
                                    int var11 = class47.method298(false, var10.substring(4));
                                    var6 += arg2[var11].method126();
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
                    var6 += this.field764[class509.method2990(var9, (byte) -128) & 0xFF] & 0xFF;
                    if (this.field761 != null && var5 != -1) {
                        var6 += this.field761[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(CII)I", line = 153)
    public final int method366(char arg0, int arg1, int arg2) {
        field756++;
        if (arg1 != 62) {
            field772 = -44;
        }
        return this.field761 == null ? 0 : this.field761[arg2][arg0];
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([Lf;[ILjava/lang/String;Z[Ljava/lang/String;)I", line = 170)
    public final int method367(class529[] arg0, int[] arg1, String arg2, boolean arg3, String[] arg4) {
        field762++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        if (arg3) {
            this.method372(-81, null, 45, null);
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class509.method2990(arg2.charAt(var15), (byte) 60) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method370(false, var16);
                    if (this.field761 != null && var12 != -1) {
                        var17 += this.field761[var12][var16];
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
                        arg4[var13] = arg2.substring(var7, var15 + 1);
                        var13++;
                        if (arg4.length <= var13) {
                            return 0;
                        }
                        var6 = 0;
                        var7 = var15 + 1;
                        var8 = -1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method370(false, 60);
                        if (this.field761 != null && var12 != -1) {
                            var17 += this.field761[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method370(false, 62);
                        if (this.field761 != null && var12 != -1) {
                            var17 += this.field761[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method370(false, 160);
                        if (this.field761 != null && var12 != -1) {
                            var17 += this.field761[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method370(arg3, 173);
                        if (this.field761 != null && var12 != -1) {
                            var17 += this.field761[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method370(false, 215);
                        if (this.field761 != null && var12 != -1) {
                            var17 += this.field761[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method370(false, 8364);
                        if (this.field761 != null && var12 != -1) {
                            var17 += this.field761[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method370(false, 169);
                        if (this.field761 != null && var12 != -1) {
                            var17 += this.field761[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method370(false, 174);
                        if (this.field761 != null && var12 != -1) {
                            var17 += this.field761[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class47.method298(false, var19.substring(4));
                            var12 = -1;
                            var17 += arg0[var20].method126();
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
                        if (arg1[arg1.length <= var13 ? arg1.length - 1 : var13] < var6) {
                            if (var8 < 0) {
                                arg4[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var7 = var18;
                                var8 = -1;
                                var12 = -1;
                                var6 = var17;
                            } else {
                                arg4[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
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
        if (arg2.length() > var7) {
            arg4[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II[Lf;Ljava/lang/String;)Ljava/lang/String;", line = 421)
    public final String method368(int arg0, int arg1, class529[] arg2, String arg3) {
        field765++;
        if (arg0 >= this.method365(arg3, arg1 ^ 0x33F3, arg2)) {
            return arg3;
        }
        int var5 = arg0 - this.method365("...", arg1 + 13299, null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg3.length();
        String var10 = "";
        for (int var11 = arg1; var11 < var9; var11++) {
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
                                    int var14 = class47.method298(false, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg2[var14].method126();
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
                    var8 += this.field764[class509.method2990(var12, (byte) -128) & 0xFF] & 0xFF;
                    if (this.field761 != null && var7 != -1) {
                        var8 += this.field761[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field761 != null) {
                        var15 = this.field761[var12][46] + var8;
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

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)V", line = 541)
    public static final void method369(byte arg0, int arg1) {
        field760++;
        if (arg0 >= -67) {
            method364(-67);
        }
        class504.field7415 = new int[arg1];
        class517.field7595 = new int[arg1];
        class308.field4227 = new int[arg1];
        class289.field3887 = new int[arg1];
        class207.field2940 = new int[arg1];
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI)I", line = 557)
    public final int method370(boolean arg0, int arg1) {
        if (arg0) {
            field772 = -62;
        }
        field759++;
        return this.field764[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;[Lf;III)I", line = 571)
    public final int method371(String arg0, class529[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 == arg4) {
            arg4 = this.field757;
        }
        field758++;
        int var6 = this.method367(arg1, new int[] { arg3 }, arg0, false, field768);
        int var7 = (var6 - 1) * arg4;
        return this.field776 - (-var7 - this.field774);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[Lf;ILjava/lang/String;)I", line = 604)
    public final int method372(int arg0, class529[] arg1, int arg2, String arg3) {
        field766++;
        if (arg0 != 1) {
            this.method363(48, null, null, (byte) 89);
        }
        int var5 = this.method367(arg1, new int[] { arg2 }, arg3, false, field768);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method365(field768[var7], arg0 + 13298, arg1);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "([B)V", line = 637)
    public class56(byte[] arg0) {
        class365 var2 = new class365(arg0);
        int var3 = var2.method2099(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2099(255) == 1;
        this.field764 = new byte[256];
        var2.method2071(this.field764, 256, 0, -713458872);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2099(255);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2099(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2081((byte) -89);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2081((byte) 93);
                    var11[var12][var16] = var15;
                }
            }
            this.field761 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field761[var13][var14] = (byte) class17.method139(this.field764, var7, var14, var13, var9, var5, var11, false);
                        }
                    }
                }
            }
            this.field757 = var5[32] + var7[32];
        } else {
            this.field757 = var2.method2099(255);
        }
        var2.method2099(255);
        var2.method2099(255);
        this.field776 = var2.method2099(255);
        this.field774 = var2.method2099(255);
    }
}
