import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class651 {

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[B")
    private byte[] field8774;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field8785;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "[[B")
    private byte[][] field8773;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public int field8769;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public int field8782;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Ljb;")
    public static class519 field8772 = new class519(82, -1);

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "J")
    public static volatile long field8778 = 0L;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[F")
    public static float[] field8776 = new float[4];

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field8786 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lmw;")
    public static class517 field8780 = new class517(69, -1);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lhh;ILjava/lang/String;I)I")
    public final int method3615(class140[] arg0, int arg1, String arg2, int arg3) {
        if (arg1 <= 75) {
            this.field8782 = -22;
        }
        field8788++;
        return this.method3621(arg0, new int[] { arg3 }, class543.field7512, arg2, (byte) 63);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lhh;IBILjava/lang/String;)I")
    public final int method3616(class140[] arg0, int arg1, byte arg2, int arg3, String arg4) {
        if (arg1 == 0) {
            arg1 = this.field8785;
        }
        field8770++;
        int var6 = this.method3621(arg0, new int[] { arg3 }, class543.field7512, arg4, (byte) 66);
        if (arg2 == 54) {
            int var7 = (var6 - 1) * arg1;
            return this.field8782 + var7 + this.field8769;
        } else {
            return -91;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[Lhh;ILjava/lang/String;)Ljava/lang/String;")
    public final String method3617(int arg0, class140[] arg1, int arg2, String arg3) {
        field8779++;
        if (arg2 >= this.method3627(arg3, arg1, 31033)) {
            return arg3;
        }
        int var5 = arg2 - this.method3627("...", null, 31033);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
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
                            if (var13.startsWith("img=") && arg1 != null) {
                                try {
                                    int var14 = class469.method2750((byte) 105, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg1[var14].method343();
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
                    var8 += this.field8774[class545.method3141(arg0 ^ 0x7E, var12) & 0xFF] & 0xFF;
                    if (this.field8773 != null && var7 != -1) {
                        var8 += this.field8773[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field8773 != null) {
                        var15 = this.field8773[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg3.substring(0, var11 + 1);
                }
            }
        }
        if (arg0 == 32) {
            return arg3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3618(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8787++;
        if (class422.method2542(-101, arg1)) {
            if (arg3 <= 87) {
                method3618(-102, 14, 17, 109, true);
            }
            class358.method2272(class419.field6032[arg1], arg4, (byte) -79, arg0, -1, arg2);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method3619(byte arg0, String arg1) {
        field8783++;
        if (arg0 != -69) {
            method3620(true, true, null);
        }
        return this.method3627(arg1, null, 31033);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZLtga;)V")
    public static final void method3620(boolean arg0, boolean arg1, class64 arg2) {
        class318.field4526.method2500(-27177, arg2);
        if (arg1) {
            field8781++;
            if (arg0) {
                class440.method2628(class466.field6600, class318.field4526, arg2, class8.field74, (byte) 52, class54.field643);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lhh;[I[Ljava/lang/String;Ljava/lang/String;B)I")
    public final int method3621(class140[] arg0, int[] arg1, String[] arg2, String arg3, byte arg4) {
        field8775++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        if (arg4 <= 60) {
            field8772 = null;
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class545.method3141(120, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method3623((byte) -48, var16);
                    var18 = var15;
                    if (this.field8773 != null && var12 != -1) {
                        var17 += this.field8773[var12][var16];
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
                        arg2[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg2.length) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var8 = -1;
                        var12 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3623((byte) -73, 60);
                        if (this.field8773 != null && var12 != -1) {
                            var17 += this.field8773[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3623((byte) -106, 62);
                        if (this.field8773 != null && var12 != -1) {
                            var17 += this.field8773[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3623((byte) -46, 160);
                        if (this.field8773 != null && var12 != -1) {
                            var17 += this.field8773[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3623((byte) -51, 173);
                        if (this.field8773 != null && var12 != -1) {
                            var17 += this.field8773[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3623((byte) -100, 215);
                        if (this.field8773 != null && var12 != -1) {
                            var17 += this.field8773[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3623((byte) -86, 8364);
                        if (this.field8773 != null && var12 != -1) {
                            var17 += this.field8773[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3623((byte) -69, 169);
                        if (this.field8773 != null && var12 != -1) {
                            var17 += this.field8773[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3623((byte) -82, 174);
                        if (this.field8773 != null && var12 != -1) {
                            var17 += this.field8773[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class469.method2750((byte) 66, var19.substring(4));
                            var12 = -1;
                            var17 += arg0[var20].method343();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg1 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var10 = 1;
                            var8 = var15;
                        }
                        if (var6 > arg1[var13 >= arg1.length ? arg1.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg2[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var12 = -1;
                                var7 = var18;
                                var8 = -1;
                            } else {
                                arg2[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
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
        if (var7 < arg3.length()) {
            arg2[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
    public static final boolean method3622(int arg0, int arg1) {
        field8771++;
        if (arg0 != -1) {
            field8780 = null;
        }
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I")
    public final int method3623(byte arg0, int arg1) {
        if (arg0 > -8) {
            this.field8774 = null;
        }
        field8789++;
        return this.field8774[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method3624(boolean arg0) {
        field8786 = null;
        field8780 = null;
        if (!arg0) {
            field8772 = null;
            field8776 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ICI)I")
    public final int method3625(int arg0, char arg1, int arg2) {
        field8768++;
        int var4 = -94 % ((-arg0 - 18) / 39);
        return this.field8773 == null ? 0 : this.field8773[arg2][arg1];
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([Lhh;Ljava/lang/String;ZI)I")
    public final int method3626(class140[] arg0, String arg1, boolean arg2, int arg3) {
        field8777++;
        int var5 = this.method3621(arg0, new int[] { arg3 }, class543.field7512, arg1, (byte) 73);
        int var6 = 0;
        if (!arg2) {
            field8778 = -63L;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method3627(class543.field7512[var7], arg0, 31033);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;[Lhh;I)I")
    public final int method3627(String arg0, class140[] arg1, int arg2) {
        if (arg2 != 31033) {
            return -120;
        }
        field8784++;
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
                            if (var10.startsWith("img=") && arg1 != null) {
                                try {
                                    int var11 = class469.method2750((byte) 127, var10.substring(4));
                                    var6 += arg1[var11].method343();
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
                    var6 += this.field8774[class545.method3141(89, var9) & 0xFF] & 0xFF;
                    if (this.field8773 != null && var5 != -1) {
                        var6 += this.field8773[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
    public class651(byte[] arg0) {
        class254 var2 = new class254(arg0);
        int var3 = var2.method1731((byte) 64);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1731((byte) 64) == 1;
        this.field8774 = new byte[256];
        var2.method1735(0, -125, this.field8774, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1731((byte) 64);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1731((byte) 64);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1737(true);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1737(true);
                    var11[var12][var16] = var15;
                }
            }
            this.field8773 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field8773[var13][var14] = (byte) class611.method3398(var9, var5, var7, var14, true, var13, var11, this.field8774);
                        }
                    }
                }
            }
            this.field8785 = var5[32] + var7[32];
        } else {
            this.field8785 = var2.method1731((byte) 64);
        }
        var2.method1731((byte) 64);
        var2.method1731((byte) 64);
        this.field8769 = var2.method1731((byte) 64);
        this.field8782 = var2.method1731((byte) 64);
    }
}
