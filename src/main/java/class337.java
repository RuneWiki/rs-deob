import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class337 {

    @OriginalMember(owner = "client!k", name = "p", descriptor = "[B")
    private byte[] field4638;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "[[B")
    private byte[][] field4641;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lkn;")
    public static class442 field4627 = new class442("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lkn;")
    public static class442 field4639 = new class442("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lbj;")
    public static class131 field4640 = new class131(64);

    @OriginalMember(owner = "client!k", name = "t", descriptor = "[I")
    public static int[] field4642 = new int[6];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(CII)I", line = 6)
    public final int method2151(char arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method2154((String) null, true, (class226[]) null);
        }
        field4637++;
        return this.field4641 == null ? 0 : this.field4641[arg2][arg0];
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([[IB)V", line = 23)
    public static final void method2152(int[][] arg0, byte arg1) {
        field4626++;
        if (arg1 > -121) {
            field4642 = null;
        }
        class296.field4138 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([IZLjava/lang/String;[Ljava/lang/String;[Lsg;)I", line = 36)
    public final int method2153(int[] arg0, boolean arg1, String arg2, String[] arg3, class226[] arg4) {
        field4635++;
        if (arg2 == null) {
            return 0;
        }
        if (!arg1) {
            this.field4638 = null;
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
            int var16 = class14.method232(21381, arg2.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2159(var16, 6741);
                    var18 = var15;
                    if (this.field4641 != null && var12 != -1) {
                        var17 += this.field4641[var12][var16];
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
                        if (var13 >= arg3.length) {
                            return 0;
                        }
                        var6 = 0;
                        var8 = -1;
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2159(60, 6741);
                        if (this.field4641 != null && var12 != -1) {
                            var17 += this.field4641[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2159(62, 6741);
                        if (this.field4641 != null && var12 != -1) {
                            var17 += this.field4641[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2159(160, 6741);
                        if (this.field4641 != null && var12 != -1) {
                            var17 += this.field4641[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2159(173, 6741);
                        if (this.field4641 != null && var12 != -1) {
                            var17 += this.field4641[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2159(215, 6741);
                        if (this.field4641 != null && var12 != -1) {
                            var17 += this.field4641[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2159(8364, 6741);
                        if (this.field4641 != null && var12 != -1) {
                            var17 += this.field4641[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2159(169, 6741);
                        if (this.field4641 != null && var12 != -1) {
                            var17 += this.field4641[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2159(174, 6741);
                        if (this.field4641 != null && var12 != -1) {
                            var17 += this.field4641[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class66.method512((byte) 118, var19.substring(4));
                            var17 += arg4[var20].method597();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg0 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var9 = var6;
                            var8 = var15;
                        }
                        if (var6 > arg0[arg0.length > var13 ? var13 : arg0.length - 1]) {
                            if (var8 < 0) {
                                arg3[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var6 = var17;
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
                            } else {
                                arg3[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
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
            arg3[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;Z[Lsg;)I", line = 285)
    public final int method2154(String arg0, boolean arg1, class226[] arg2) {
        field4631++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg0.length();
        int var8 = 0;
        if (arg1) {
            field4642 = null;
        }
        while (var8 < var7) {
            char var9 = arg0.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                label78: {
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
                                        int var11 = class66.method512((byte) 118, var10.substring(4));
                                        var5 = -1;
                                        var6 += arg2[var11].method597();
                                    } catch (Exception var12) {
                                    }
                                }
                                break label78;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field4638[class14.method232(21381, var9) & 0xFF] & 0xFF;
                        if (this.field4641 != null && var5 != -1) {
                            var6 += this.field4641[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            var8++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 390)
    public static final void method2155(byte arg0) {
        class131 var1 = field4640;
        synchronized (field4640) {
            field4640.method905((byte) 69);
        }
        field4636++;
        class131 var2 = class360.field4970;
        synchronized (class360.field4970) {
            class360.field4970.method905((byte) 69);
        }
        class131 var3 = class387.field5560;
        synchronized (class387.field5560) {
            class387.field5560.method905((byte) 49);
        }
        class131 var4 = class141.field2011;
        synchronized (class141.field2011) {
            if (arg0 < 51) {
                field4640 = null;
            }
            class141.field2011.method905((byte) 31);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 415)
    public final int method2156(String arg0, int arg1) {
        if (arg1 == 60) {
            field4634++;
            return this.method2154(arg0, false, (class226[]) null);
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 427)
    public static void method2157(int arg0) {
        field4627 = null;
        field4642 = null;
        field4639 = null;
        if (arg0 == 8090) {
            field4640 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI[Lsg;Ljava/lang/String;)I", line = 440)
    public final int method2158(boolean arg0, int arg1, class226[] arg2, String arg3) {
        field4628++;
        if (!arg0) {
            method2152((int[][]) null, (byte) -23);
        }
        return this.method2153(new int[] { arg1 }, true, arg3, class263.field3658, arg2);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I", line = 465)
    public final int method2159(int arg0, int arg1) {
        field4630++;
        if (arg1 != 6741) {
            this.method2153((int[]) null, false, (String) null, (String[]) null, (class226[]) null);
        }
        return this.field4638[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([Lsg;ILjava/lang/String;B)I", line = 476)
    public final int method2160(class226[] arg0, int arg1, String arg2, byte arg3) {
        int var5 = 114 / ((arg3 + 83) / 34);
        field4624++;
        int var6 = this.method2153(new int[] { arg1 }, true, arg2, class263.field3658, arg0);
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            int var9 = this.method2154(class263.field3658[var8], false, arg0);
            if (var9 > var7) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;I[Lsg;I)I", line = 504)
    public final int method2161(int arg0, String arg1, int arg2, class226[] arg3, int arg4) {
        if (arg0 == arg2) {
            arg0 = this.field4625;
        }
        field4623++;
        int var6 = this.method2153(new int[] { arg4 }, true, arg1, class263.field3658, arg3);
        int var7 = (var6 - 1) * arg0;
        return this.field4632 + var7 + this.field4633;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "([B)V", line = 530)
    public class337(byte[] arg0) {
        class11 var2 = new class11(arg0);
        int var3 = var2.method172((byte) 52);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method172((byte) 52) == 1;
        this.field4638 = new byte[256];
        var2.method196(this.field4638, 256, 255, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method172((byte) 52);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method172((byte) 52);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method162(-4436);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method162(-4436);
                    var11[var12][var16] = var15;
                }
            }
            this.field4641 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4641[var13][var14] = (byte) class394.method2499(var11, var9, this.field4638, var14, var6, var5, var13, (byte) 93);
                        }
                    }
                }
            }
            this.field4625 = var5[32] + var6[32];
        } else {
            this.field4625 = var2.method172((byte) 52);
        }
        var2.method172((byte) 52);
        var2.method172((byte) 52);
        this.field4633 = var2.method172((byte) 52);
        this.field4632 = var2.method172((byte) 52);
    }
}
