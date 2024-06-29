import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class490 {

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "[B")
    private byte[] field7146;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public int field7153;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "[[B")
    private byte[][] field7156;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    public int field7165;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public int field7155;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Lar;")
    public static class479 field7151 = new class479();

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "Lwj;")
    public static class270 field7164 = new class270(38, 4);

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "Lqp;")
    public static class466 field7166 = new class466("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([SZ)[S")
    public static final short[] method2864(short[] arg0, boolean arg1) {
        field7157++;
        if (arg1) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class91.method676(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[Ll;Ljava/lang/String;)I")
    public final int method2865(int arg0, int arg1, class16[] arg2, String arg3) {
        field7162++;
        if (arg0 > -77) {
            return 71;
        }
        int var5 = this.method2875(class244.field3419, 0, arg2, arg3, new int[] { arg1 });
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2876(class244.field3419[var7], 255, arg2);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[Ll;BILjava/lang/String;)I")
    public final int method2866(int arg0, class16[] arg1, byte arg2, int arg3, String arg4) {
        field7147++;
        if (arg0 == 0) {
            arg0 = this.field7153;
        }
        int var6 = this.method2875(class244.field3419, 0, arg1, arg4, new int[] { arg3 });
        int var7 = (var6 - 1) * arg0;
        return arg2 == 89 ? this.field7165 + var7 + this.field7155 : 113;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method2867(String arg0, byte arg1) {
        if (arg1 != -70) {
            this.method2875(null, 91, null, null, null);
        }
        field7158++;
        return this.method2876(arg0, arg1 + 325, null);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)I")
    public final int method2868(int arg0, int arg1) {
        field7150++;
        return arg0 >= -80 ? -2 : this.field7146[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILem;)V")
    public static final void method2869(int arg0, class150 arg1) {
        field7154++;
        class150 var2 = class3.method9(118, arg1);
        if (arg0 >= -80) {
            field7164 = null;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class117.field1754;
            var4 = class27.field359;
        } else {
            var4 = var2.field2322;
            var3 = var2.field2204;
        }
        class122.method860(var4, false, var3, false, arg1);
        class362.method2183(arg1, var4, var3, -5);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(II[Ll;Ljava/lang/String;)I")
    public final int method2870(int arg0, int arg1, class16[] arg2, String arg3) {
        if (arg1 != 62) {
            this.method2876(null, -72, null);
        }
        field7159++;
        return this.method2875(class244.field3419, 0, arg2, arg3, new int[] { arg0 });
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static final void method2871(int arg0) {
        if (arg0 != -1475793664) {
            method2873((byte) -67);
        }
        field7152++;
        class485.field7085.method252(((float) class20.field269.field7666 * 0.1F + 0.7F) * class235.field3335);
        class485.field7085.method232(class276.field3804, class517.field7626, class238.field3352, (float) (class331.field4496 << 0), (float) (class360.field5256 << 0), (float) (class48.field574 << 0));
        class485.field7085.method315(class288.field3999);
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(II[Ll;Ljava/lang/String;)Ljava/lang/String;")
    public final String method2872(int arg0, int arg1, class16[] arg2, String arg3) {
        field7161++;
        if (this.method2876(arg3, arg1 + 255, arg2) <= arg0) {
            return arg3;
        }
        int var5 = arg0 - this.method2876("...", arg1 ^ 0xFF, null);
        int var6 = -1;
        int var7 = -1;
        int var8 = arg1;
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
                                    int var14 = class104.method765(var13.substring(4), 128);
                                    var8 += arg2[var14].method84();
                                    var7 = -1;
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
                    var8 += this.field7146[class80.method649(arg1 ^ 0x5A, var12) & 0xFF] & 0xFF;
                    if (this.field7156 != null && var7 != -1) {
                        var8 += this.field7156[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field7156 != null) {
                        var15 = this.field7156[var12][46] + var8;
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

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static void method2873(byte arg0) {
        field7166 = null;
        field7151 = null;
        field7164 = null;
        if (arg0 != -38) {
            field7164 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(CZI)I")
    public final int method2874(char arg0, boolean arg1, int arg2) {
        field7148++;
        if (!arg1) {
            field7151 = null;
        }
        return this.field7156 == null ? 0 : this.field7156[arg2][arg0];
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([Ljava/lang/String;I[Ll;Ljava/lang/String;[I)I")
    public final int method2875(String[] arg0, int arg1, class16[] arg2, String arg3, int[] arg4) {
        field7163++;
        if (arg3 == null) {
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
        int var14 = arg3.length();
        for (int var15 = arg1; var15 < var14; var15++) {
            int var16 = class80.method649(arg1 ^ 0x69, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2868(-123, var16);
                    var18 = var15;
                    if (this.field7156 != null && var12 != -1) {
                        var17 += this.field7156[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg3.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg0[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg0.length) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var6 = 0;
                        var8 = -1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2868(-101, 60);
                        if (this.field7156 != null && var12 != -1) {
                            var17 += this.field7156[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2868(-98, 62);
                        if (this.field7156 != null && var12 != -1) {
                            var17 += this.field7156[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2868(-101, 160);
                        if (this.field7156 != null && var12 != -1) {
                            var17 += this.field7156[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2868(-117, 173);
                        if (this.field7156 != null && var12 != -1) {
                            var17 += this.field7156[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2868(-91, 215);
                        if (this.field7156 != null && var12 != -1) {
                            var17 += this.field7156[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2868(-108, 8364);
                        if (this.field7156 != null && var12 != -1) {
                            var17 += this.field7156[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2868(-89, 169);
                        if (this.field7156 != null && var12 != -1) {
                            var17 += this.field7156[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2868(arg1 ^ 0xFFFFFFAA, 174);
                        if (this.field7156 != null && var12 != -1) {
                            var17 += this.field7156[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class104.method765(var19.substring(4), 128);
                            var17 += arg2[var20].method84();
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
                            var9 = var6;
                            var10 = 1;
                            var8 = var15;
                        }
                        if (arg4[arg4.length <= var13 ? arg4.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg0[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg0[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var7 = var18;
                                var8 = -1;
                                var12 = -1;
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
        if (arg3.length() > var7) {
            arg0[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;I[Ll;)I")
    public final int method2876(String arg0, int arg1, class16[] arg2) {
        field7160++;
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
                                    int var11 = class104.method765(var10.substring(4), arg1 - 127);
                                    var6 += arg2[var11].method84();
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
                    var6 += this.field7146[class80.method649(102, var9) & 0xFF] & 0xFF;
                    if (this.field7156 != null && var5 != -1) {
                        var6 += this.field7156[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        if (arg1 != 255) {
            method2871(-23);
        }
        return var6;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "([B)V")
    public class490(byte[] arg0) {
        class391 var2 = new class391(arg0);
        int var3 = var2.method2348(-2);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2348(-2) == 1;
        this.field7146 = new byte[256];
        var2.method2362(256, this.field7146, 0, (byte) -54);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2348(-2);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2348(-2);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2337(-1);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2337(-1);
                    var11[var12][var16] = var15;
                }
            }
            this.field7156 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field7156[var13][var14] = (byte) class250.method1498(var6, var9, var5, 255, var14, var13, var11, this.field7146);
                        }
                    }
                }
            }
            this.field7153 = var5[32] + var6[32];
        } else {
            this.field7153 = var2.method2348(-2);
        }
        var2.method2348(-2);
        var2.method2348(-2);
        this.field7165 = var2.method2348(-2);
        this.field7155 = var2.method2348(-2);
    }
}
