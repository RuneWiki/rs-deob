import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class54 {

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "[B")
    private byte[] field866;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "[[B")
    private byte[][] field867;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public static int field852 = 4;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "Lcb;")
    public static class631 field863 = new class631(37, 0);

    @OriginalMember(owner = "client!pia", name = "r", descriptor = "Lcb;")
    public static class631 field869 = new class631(68, 2);

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!pia", name = "q", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "([Lov;II)V")
    public static final void method505(class668[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class668 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field9480;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field9480 > (var7 & 0x1) + var6) {
                class668 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method505(arg0, arg1, var4 - 1);
        method505(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILjava/lang/String;I[Lit;)I")
    public final int method506(int arg0, String arg1, int arg2, class34[] arg3) {
        field853++;
        int var5 = this.method511(new int[] { arg2 }, -7205, arg3, arg1, class546.field7809);
        int var6 = arg0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method508(arg3, class546.field7809[var7], 173);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method507(int arg0, String arg1) {
        field860++;
        if (arg0 < 56) {
            method505(null, 122, 112);
        }
        return arg1.length() + 2;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "([Lit;Ljava/lang/String;I)I")
    public final int method508(class34[] arg0, String arg1, int arg2) {
        field865++;
        if (arg1 == null) {
            return 0;
        }
        if (arg2 != 173) {
            this.method513(101, -102, null, null);
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
                                    int var11 = class714.method3949((byte) -126, var10.substring(4));
                                    var6 += arg0[var11].method177();
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
                    var6 += this.field866[class127.method983((byte) 108, var9) & 0xFF] & 0xFF;
                    if (this.field867 != null && var5 != -1) {
                        var6 += this.field867[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IZ)I")
    public final int method509(int arg0, boolean arg1) {
        if (arg1) {
            method514(82);
        }
        field855++;
        return this.field866[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method510(String arg0, int arg1) {
        field857++;
        if (arg1 != 174) {
            field869 = null;
        }
        return this.method508(null, arg0, 173);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "([II[Lit;Ljava/lang/String;[Ljava/lang/String;)I")
    public final int method511(int[] arg0, int arg1, class34[] arg2, String arg3, String[] arg4) {
        field856++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        if (arg1 != -7205) {
            field863 = null;
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class127.method983((byte) 110, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method509(var16, false);
                    if (this.field867 != null && var12 != -1) {
                        var17 += this.field867[var12][var16];
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
                        arg4[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (arg4.length <= var13) {
                            return 0;
                        }
                        var12 = -1;
                        var6 = 0;
                        var8 = -1;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method509(60, false);
                        if (this.field867 != null && var12 != -1) {
                            var17 += this.field867[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method509(62, false);
                        if (this.field867 != null && var12 != -1) {
                            var17 += this.field867[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method509(160, false);
                        if (this.field867 != null && var12 != -1) {
                            var17 += this.field867[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method509(173, false);
                        if (this.field867 != null && var12 != -1) {
                            var17 += this.field867[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method509(215, false);
                        if (this.field867 != null && var12 != -1) {
                            var17 += this.field867[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method509(8364, false);
                        if (this.field867 != null && var12 != -1) {
                            var17 += this.field867[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method509(169, false);
                        if (this.field867 != null && var12 != -1) {
                            var17 += this.field867[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method509(174, false);
                        if (this.field867 != null && var12 != -1) {
                            var17 += this.field867[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class714.method3949((byte) -80, var19.substring(4));
                            var17 += arg2[var20].method177();
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
                            var8 = var15;
                            var9 = var6;
                        }
                        if (var6 > arg0[arg0.length <= var13 ? arg0.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg4[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg4[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var7 = var18;
                                var8 = -1;
                                var12 = -1;
                                var6 = var17;
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
        if (var7 < arg3.length()) {
            arg4[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I[Lit;ILjava/lang/String;I)I")
    public final int method512(int arg0, class34[] arg1, int arg2, String arg3, int arg4) {
        field864++;
        if (arg0 == 0) {
            arg0 = this.field854;
        }
        int var6 = this.method511(new int[] { arg4 }, -7205, arg1, arg3, class546.field7809);
        if (arg2 != 1384) {
            this.method512(52, null, 72, null, -55);
        }
        int var7 = (var6 - 1) * arg0;
        return this.field858 + var7 + this.field861;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IILjava/lang/String;[Lit;)Ljava/lang/String;")
    public final String method513(int arg0, int arg1, String arg2, class34[] arg3) {
        field868++;
        if (arg0 >= this.method508(arg3, arg2, 173)) {
            return arg2;
        }
        int var5 = arg0 - this.method508(null, "...", 173);
        int var6 = -1;
        int var7 = -1;
        if (arg1 <= 23) {
            this.method508(null, null, -77);
        }
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
                            if (var13.startsWith("img=") && arg3 != null) {
                                try {
                                    int var14 = class714.method3949((byte) -42, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg3[var14].method177();
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
                    var8 += this.field866[class127.method983((byte) -36, var12) & 0xFF] & 0xFF;
                    if (this.field867 != null && var7 != -1) {
                        var8 += this.field867[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field867 != null) {
                        var15 = this.field867[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
    public static void method514(int arg0) {
        field863 = null;
        if (arg0 != 8364) {
            method507(-63, null);
        }
        field869 = null;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ICI)I")
    public final int method515(int arg0, char arg1, int arg2) {
        field859++;
        if (arg0 != -2784) {
            this.field861 = 41;
        }
        return this.field867 == null ? 0 : this.field867[arg2][arg1];
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILjava/lang/String;B[Lit;)I")
    public final int method516(int arg0, String arg1, byte arg2, class34[] arg3) {
        if (arg2 > -98) {
            return 30;
        } else {
            field862++;
            return this.method511(new int[] { arg0 }, -7205, arg3, arg1, class546.field7809);
        }
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "([B)V")
    public class54(byte[] arg0) {
        class301 var2 = new class301(arg0);
        int var3 = var2.method1987(-42);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1987(-96) == 1;
        this.field866 = new byte[256];
        var2.method1936(0, 10046, 256, this.field866);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1987(-3);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1987(-84);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1984(4);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1984(4);
                    var11[var12][var16] = var15;
                }
            }
            this.field867 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field867[var13][var14] = (byte) class128.method990(this.field866, var13, 255, var14, var11, var5, var9, var7);
                        }
                    }
                }
            }
            this.field854 = var5[32] + var7[32];
        } else {
            this.field854 = var2.method1987(-32);
        }
        var2.method1987(-40);
        var2.method1987(-85);
        this.field858 = var2.method1987(-24);
        this.field861 = var2.method1987(-33);
    }
}
