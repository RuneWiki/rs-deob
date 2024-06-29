import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class348 {

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "[B")
    private byte[] field5140;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "[[B")
    private byte[][] field5135;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public int field5150;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Lak;")
    public static class234 field5145 = new class234("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Lhn;")
    public static class509 field5148 = new class509(35, 6);

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "F")
    public static float field5153;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Lc;")
    public static class125 field5152;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
    public static int[] field5146;

    static {
        new class234("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        new class234("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([Ll;BLjava/lang/String;[I[Ljava/lang/String;)I", line = 4)
    public final int method2164(class16[] arg0, byte arg1, String arg2, int[] arg3, String[] arg4) {
        if (arg1 < 31) {
            field5148 = null;
        }
        field5142++;
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
            int var16 = class121.method903(-8303, arg2.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2171(var16, 125);
                    if (this.field5135 != null && var12 != -1) {
                        var17 += this.field5135[var12][var16];
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
                        var8 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2171(60, 122);
                        if (this.field5135 != null && var12 != -1) {
                            var17 += this.field5135[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2171(62, 123);
                        if (this.field5135 != null && var12 != -1) {
                            var17 += this.field5135[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2171(160, 126);
                        if (this.field5135 != null && var12 != -1) {
                            var17 += this.field5135[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2171(173, 125);
                        if (this.field5135 != null && var12 != -1) {
                            var17 += this.field5135[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2171(215, 123);
                        if (this.field5135 != null && var12 != -1) {
                            var17 += this.field5135[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2171(8364, 123);
                        if (this.field5135 != null && var12 != -1) {
                            var17 += this.field5135[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2171(169, 126);
                        if (this.field5135 != null && var12 != -1) {
                            var17 += this.field5135[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2171(174, 115);
                        if (this.field5135 != null && var12 != -1) {
                            var17 += this.field5135[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class64.method555((byte) 124, var19.substring(4));
                            var17 += arg0[var20].method129();
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
                        if (var6 > arg3[var13 >= arg3.length ? arg3.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg4[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var6 = var17;
                                var12 = -1;
                                var7 = var18;
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
                            var8 = var15;
                            var10 = 0;
                            var9 = var6;
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

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 256)
    public static void method2165(int arg0) {
        field5148 = null;
        field5145 = null;
        int var1 = -6 % ((arg0 - 17) / 41);
        field5146 = null;
        field5152 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[Ll;Ljava/lang/String;B)I", line = 269)
    public final int method2166(int arg0, class16[] arg1, String arg2, byte arg3) {
        field5149++;
        if (arg3 < 81) {
            this.field5140 = null;
        }
        return this.method2164(arg1, (byte) 115, arg2, new int[] { arg0 }, class137.field2086);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([Ll;ILjava/lang/String;B)Ljava/lang/String;", line = 283)
    public final String method2167(class16[] arg0, int arg1, String arg2, byte arg3) {
        field5143++;
        if (arg1 >= this.method2170(arg2, arg0, -106)) {
            return arg2;
        }
        if (arg3 != -12) {
            this.method2170(null, null, 59);
        }
        int var5 = arg1 - this.method2170("...", null, -69);
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
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class64.method555((byte) 124, var13.substring(4));
                                    var8 += arg0[var14].method129();
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
                    var8 += this.field5140[class121.method903(-8303, var12) & 0xFF] & 0xFF;
                    if (this.field5135 != null && var7 != -1) {
                        var8 += this.field5135[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field5135 != null) {
                        var15 = this.field5135[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIC)I", line = 404)
    public final int method2168(int arg0, int arg1, char arg2) {
        field5141++;
        if (arg0 >= -68) {
            this.method2164(null, (byte) 29, null, null, null);
        }
        return this.field5135 == null ? 0 : this.field5135[arg1][arg2];
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Lkl;", line = 421)
    public static final class56 method2169(byte arg0, int arg1) {
        field5136++;
        int var2 = -121 % ((arg0 + 43) / 40);
        class56[] var3 = class376.method2365(2);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class56 var5 = var3[var4];
            if (var5.field688 == arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;[Ll;I)I", line = 451)
    public final int method2170(String arg0, class16[] arg1, int arg2) {
        field5147++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg2 >= -7) {
            this.method2172((byte) -77, -40, null, null);
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
                            if (var10.startsWith("img=") && arg1 != null) {
                                try {
                                    int var11 = class64.method555((byte) 124, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg1[var11].method129();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field5140[class121.method903(-8303, var9) & 0xFF] & 0xFF;
                    if (this.field5135 != null && var5 != -1) {
                        var6 += this.field5135[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I", line = 553)
    public final int method2171(int arg0, int arg1) {
        if (arg1 <= 114) {
            this.method2171(56, 92);
        }
        field5138++;
        return this.field5140[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI[Ll;Ljava/lang/String;)I", line = 572)
    public final int method2172(byte arg0, int arg1, class16[] arg2, String arg3) {
        if (arg0 < 78) {
            method2165(-19);
        }
        field5154++;
        int var5 = this.method2164(arg2, (byte) 48, arg3, new int[] { arg1 }, class137.field2086);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2170(class137.field2086[var7], arg2, -33);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;II[Ll;)I", line = 605)
    public final int method2173(int arg0, String arg1, int arg2, int arg3, class16[] arg4) {
        field5139++;
        if (arg2 == 0) {
            arg2 = this.field5151;
        }
        int var6 = this.method2164(arg4, (byte) 57, arg1, new int[] { arg3 }, class137.field2086);
        if (arg0 < 30) {
            this.method2170(null, null, 30);
        }
        int var7 = (var6 - 1) * arg2;
        return this.field5150 + var7 + this.field5137;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V", line = 635)
    public class348(byte[] arg0) {
        class217 var2 = new class217(arg0);
        int var3 = var2.method1515((byte) 126);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1515((byte) 126) == 1;
        this.field5140 = new byte[256];
        var2.method1540(0, this.field5140, 256, 81);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1515((byte) 122);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1515((byte) 123);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1565(true);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1565(true);
                    var11[var12][var16] = var15;
                }
            }
            this.field5135 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5135[var13][var14] = (byte) class360.method2261(var6, var5, this.field5140, var14, var9, var13, 255, var11);
                        }
                    }
                }
            }
            this.field5151 = var5[32] + var6[32];
        } else {
            this.field5151 = var2.method1515((byte) 125);
        }
        var2.method1515((byte) 121);
        var2.method1515((byte) 124);
        this.field5150 = var2.method1515((byte) 123);
        this.field5137 = var2.method1515((byte) 127);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)I", line = 757)
    public final int method2174(int arg0, String arg1) {
        if (arg0 != -33) {
            field5153 = 0.19819227F;
        }
        field5144++;
        return this.method2170(arg1, null, arg0 ^ 0x6F);
    }
}
