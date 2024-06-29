import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class606 {

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "[B")
    private byte[] field8746;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public int field8754;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "[[B")
    private byte[][] field8756;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public int field8749;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public int field8759;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "Lvg;")
    public static class622 field8761 = new class622(0, 0);

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "Lcq;")
    public static class273 field8762 = new class273(6, 0, 4, 2);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "Ljw;")
    public static class426 field8763;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI[Lf;Ljava/lang/String;)I", line = 7)
    public final int method3452(int arg0, byte arg1, int arg2, class256[] arg3, String arg4) {
        if (arg1 > -117) {
            field8763 = null;
        }
        field8751++;
        if (arg0 == 0) {
            arg0 = this.field8754;
        }
        int var6 = this.method3459(arg3, class191.field2589, new int[] { arg2 }, arg4, -36);
        int var7 = (var6 - 1) * arg0;
        return this.field8759 + this.field8749 + var7;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[Lf;Ljava/lang/String;)Ljava/lang/String;", line = 26)
    public final String method3453(int arg0, int arg1, class256[] arg2, String arg3) {
        field8745++;
        if (this.method3456(arg2, arg3, 60) <= arg1) {
            return arg3;
        }
        int var5 = arg1 - this.method3456(null, "...", 60);
        int var6 = -1;
        int var7 = -1;
        int var8 = arg0;
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
                                    int var14 = class87.method496(var13.substring(4), (byte) -125);
                                    var8 += arg2[var14].method50();
                                    var7 = -1;
                                    if (var8 > var5) {
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
                    var8 += this.field8746[class91.method507((byte) 108, var12) & 0xFF] & 0xFF;
                    if (this.field8756 != null && var7 != -1) {
                        var8 += this.field8756[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field8756 != null) {
                        var15 = this.field8756[var12][46] + var8;
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

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 145)
    public static final void method3454(int arg0) {
        field8750++;
        if (!class335.field4872.method3439(class62.field996, false) && class49.field779 != class432.field6276) {
            class699.method3924(class22.field426, 117, 11, class697.field9827, false);
            return;
        }
        class160.method1141(class332.field4821, (byte) 51);
        if (class595.field8621 != class49.field779) {
            class508.method2889((byte) 0);
        }
        if (arg0 != 11) {
            method3464(null, 124);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 167)
    public final int method3455(String arg0, byte arg1) {
        field8753++;
        if (arg1 != 1) {
            this.method3452(-2, (byte) 1, -37, null, null);
        }
        return this.method3456(null, arg0, 60);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lf;Ljava/lang/String;I)I", line = 178)
    public final int method3456(class256[] arg0, String arg1, int arg2) {
        if (arg2 != 60) {
            method3454(0);
        }
        field8747++;
        if (arg1 == null) {
            return 0;
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class87.method496(var10.substring(4), (byte) -112);
                                    var6 += arg0[var11].method50();
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
                    var6 += this.field8746[class91.method507((byte) 94, var9) & 0xFF] & 0xFF;
                    if (this.field8756 != null && var5 != -1) {
                        var6 += this.field8756[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(CBI)I", line = 287)
    public final int method3457(char arg0, byte arg1, int arg2) {
        field8760++;
        if (arg1 >= -114) {
            field8762 = null;
        }
        return this.field8756 == null ? 0 : this.field8756[arg2][arg0];
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I", line = 303)
    public final int method3458(int arg0, int arg1) {
        field8758++;
        if (arg1 != 255) {
            this.method3460(null, true, -100, null);
        }
        return this.field8746[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lf;[Ljava/lang/String;[ILjava/lang/String;I)I", line = 314)
    public final int method3459(class256[] arg0, String[] arg1, int[] arg2, String arg3, int arg4) {
        field8748++;
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
        if (arg4 >= -29) {
            method3454(-84);
        }
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class91.method507((byte) 98, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method3458(var16, 255);
                    if (this.field8756 != null && var12 != -1) {
                        var17 += this.field8756[var12][var16];
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
                        arg1[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3458(60, 255);
                        if (this.field8756 != null && var12 != -1) {
                            var17 += this.field8756[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3458(62, 255);
                        if (this.field8756 != null && var12 != -1) {
                            var17 += this.field8756[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3458(160, 255);
                        if (this.field8756 != null && var12 != -1) {
                            var17 += this.field8756[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3458(173, 255);
                        if (this.field8756 != null && var12 != -1) {
                            var17 += this.field8756[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3458(215, 255);
                        if (this.field8756 != null && var12 != -1) {
                            var17 += this.field8756[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3458(8364, 255);
                        if (this.field8756 != null && var12 != -1) {
                            var17 += this.field8756[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3458(169, 255);
                        if (this.field8756 != null && var12 != -1) {
                            var17 += this.field8756[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3458(174, 255);
                        if (this.field8756 != null && var12 != -1) {
                            var17 += this.field8756[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class87.method496(var19.substring(4), (byte) -92);
                            var12 = -1;
                            var17 += arg0[var20].method50();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg2 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg2[var13 >= arg2.length ? arg2.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg1[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var6 = var17;
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
                            } else {
                                arg1[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var8 = -1;
                                var12 = -1;
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
        if (var7 < arg3.length()) {
            arg1[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lf;ZILjava/lang/String;)I", line = 562)
    public final int method3460(class256[] arg0, boolean arg1, int arg2, String arg3) {
        field8757++;
        if (!arg1) {
            this.method3455(null, (byte) -9);
        }
        int var5 = this.method3459(arg0, class191.field2589, new int[] { arg2 }, arg3, -41);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method3456(arg0, class191.field2589[var7], 60);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB[Lf;Ljava/lang/String;)I", line = 592)
    public final int method3461(int arg0, byte arg1, class256[] arg2, String arg3) {
        if (arg1 != -126) {
            this.method3452(-59, (byte) -117, -46, null, null);
        }
        field8752++;
        return this.method3459(arg2, class191.field2589, new int[] { arg0 }, arg3, arg1 + 51);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZBI)Ljava/lang/String;", line = 606)
    public static final String method3462(boolean arg0, byte arg1, int arg2) {
        field8744++;
        if (arg0 && arg2 >= 0) {
            if (arg1 != -120) {
                method3463((byte) 69);
            }
            return class82.method474((byte) 103, arg2, arg0, 10);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 620)
    public static void method3463(byte arg0) {
        int var1 = 3 / ((-arg0 - 61) / 32);
        field8762 = null;
        field8761 = null;
        field8763 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([BI)V", line = 640)
    public static final void method3464(byte[] arg0, int arg1) {
        field8755++;
        class540 var2 = new class540(arg0);
        while (true) {
            int var3 = var2.method3115(29871);
            if (var3 == 0) {
                if (arg1 != 496) {
                    method3464(null, -94);
                    return;
                }
                return;
            }
            if (var3 == 2) {
                class197.field2698 = var2.method3169(26488);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "([B)V", line = 673)
    public class606(byte[] arg0) {
        class540 var2 = new class540(arg0);
        int var3 = var2.method3115(29871);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3115(29871) == 1;
        this.field8746 = new byte[256];
        var2.method3155(256, 0, this.field8746, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method3115(29871);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method3115(29871);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3128(32767);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3128(32767);
                    var11[var12][var16] = var15;
                }
            }
            this.field8756 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field8756[var13][var14] = (byte) class204.method1317(var7, var13, var9, var14, this.field8746, var11, var5, (byte) 39);
                        }
                    }
                }
            }
            this.field8754 = var5[32] + var7[32];
        } else {
            this.field8754 = var2.method3115(29871);
        }
        var2.method3115(29871);
        var2.method3115(29871);
        this.field8749 = var2.method3115(29871);
        this.field8759 = var2.method3115(29871);
    }
}
