import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class352 {

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "[B")
    private byte[] field4796;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[[B")
    private byte[][] field4789;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public int field4788;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public int field4792;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field4800 = 0;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[Lha;")
    public static class53[] field4793;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;I[Lha;)I", line = 3)
    public final int method2124(String arg0, int arg1, class53[] arg2) {
        field4790++;
        if (arg0 == null) {
            return 0;
        } else if (arg1 <= 89) {
            return 54;
        } else {
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
                                        int var11 = class197.method1327(var10.substring(4), -95);
                                        var6 += arg2[var11].method326();
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
                        var6 += this.field4796[class520.method3074(var9, true) & 0xFF] & 0xFF;
                        if (this.field4789 != null && var5 != -1) {
                            var6 += this.field4789[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;[Lha;IZ)I", line = 108)
    public final int method2125(String arg0, class53[] arg1, int arg2, boolean arg3) {
        field4799++;
        int var5 = this.method2129((byte) -112, arg1, class227.field3315, new int[] { arg2 }, arg0);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2124(class227.field3315[var7], 126, arg1);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        if (arg3) {
            this.method2127(null, null, false, 21);
        }
        return var6;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/String;)I", line = 139)
    public final int method2126(byte arg0, String arg1) {
        if (arg0 < 65) {
            this.method2127(null, null, true, -98);
        }
        field4805++;
        return this.method2124(arg1, 120, null);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;[Lha;ZI)Ljava/lang/String;", line = 154)
    public final String method2127(String arg0, class53[] arg1, boolean arg2, int arg3) {
        field4794++;
        if (arg3 >= this.method2124(arg0, 91, arg1)) {
            return arg0;
        } else if (arg2) {
            return null;
        } else {
            int var5 = arg3 - this.method2124("...", 108, null);
            int var6 = -1;
            int var7 = -1;
            int var8 = 0;
            int var9 = arg0.length();
            String var10 = "";
            for (int var11 = 0; var11 < var9; var11++) {
                char var12 = arg0.charAt(var11);
                if (var12 == '<') {
                    var6 = var11;
                } else {
                    if (var12 == '>' && var6 != -1) {
                        String var13 = arg0.substring(var6 + 1, var11);
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
                                        int var14 = class197.method1327(var13.substring(4), -62);
                                        var8 += arg1[var14].method326();
                                        var7 = -1;
                                        if (var8 > var5) {
                                            return var10 + "...";
                                        }
                                        var10 = arg0.substring(0, var11 + 1);
                                    } catch (Exception var16) {
                                    }
                                }
                                continue;
                            }
                            var12 = '®';
                        }
                    }
                    if (var6 == -1) {
                        var8 += this.field4796[class520.method3074(var12, true) & 0xFF] & 0xFF;
                        if (this.field4789 != null && var7 != -1) {
                            var8 += this.field4789[var7][var12];
                        }
                        var7 = var12;
                        int var15 = var8;
                        if (this.field4789 != null) {
                            var15 = this.field4789[var12][46] + var8;
                        }
                        if (var5 < var15) {
                            return var10 + "...";
                        }
                        var10 = arg0.substring(0, var11 + 1);
                    }
                }
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([Lha;IILjava/lang/String;)I", line = 279)
    public final int method2128(class53[] arg0, int arg1, int arg2, String arg3) {
        field4804++;
        return arg2 == 0 ? this.method2129((byte) -119, arg0, class227.field3315, new int[] { arg1 }, arg3) : 60;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B[Lha;[Ljava/lang/String;[ILjava/lang/String;)I", line = 291)
    public final int method2129(byte arg0, class53[] arg1, String[] arg2, int[] arg3, String arg4) {
        field4802++;
        if (arg4 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        if (arg0 >= -101) {
            this.field4789 = null;
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class520.method3074(arg4.charAt(var15), true) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2134(var16, 125);
                    if (this.field4789 != null && var12 != -1) {
                        var17 += this.field4789[var12][var16];
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
                        arg2[var13] = arg4.substring(var7, var15 + 1);
                        var13++;
                        if (arg2.length <= var13) {
                            return 0;
                        }
                        var6 = 0;
                        var12 = -1;
                        var7 = var15 + 1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2134(60, -47);
                        if (this.field4789 != null && var12 != -1) {
                            var17 += this.field4789[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2134(62, 123);
                        if (this.field4789 != null && var12 != -1) {
                            var17 += this.field4789[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2134(160, 2);
                        if (this.field4789 != null && var12 != -1) {
                            var17 += this.field4789[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2134(173, 123);
                        if (this.field4789 != null && var12 != -1) {
                            var17 += this.field4789[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2134(215, 127);
                        if (this.field4789 != null && var12 != -1) {
                            var17 += this.field4789[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2134(8364, 127);
                        if (this.field4789 != null && var12 != -1) {
                            var17 += this.field4789[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2134(169, 127);
                        if (this.field4789 != null && var12 != -1) {
                            var17 += this.field4789[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2134(174, -110);
                        if (this.field4789 != null && var12 != -1) {
                            var17 += this.field4789[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class197.method1327(var19.substring(4), -116);
                            var17 += arg1[var20].method326();
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
                            var8 = var15;
                            var10 = 1;
                            var9 = var6;
                        }
                        if (var6 > arg3[var13 < arg3.length ? var13 : arg3.length - 1]) {
                            if (var8 >= 0) {
                                arg2[var13] = arg4.substring(var7, var8 - (var10 - 1));
                                var13++;
                                if (arg2.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg2[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (arg2.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var6 = var17;
                                var7 = var18;
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
        if (var7 < arg4.length()) {
            arg2[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;[Lha;III)I", line = 550)
    public final int method2130(String arg0, class53[] arg1, int arg2, int arg3, int arg4) {
        field4798++;
        if (arg2 == 0) {
            arg2 = this.field4791;
        }
        int var6 = this.method2129((byte) -111, arg1, class227.field3315, new int[] { arg3 }, arg0);
        int var7 = (var6 - 1) * arg2;
        return arg4 == -24724 ? this.field4792 + var7 + this.field4788 : 59;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 568)
    public static void method2131(int arg0) {
        field4793 = null;
        if (arg0 != -15574) {
            method2135(-124, null, null, -92);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(CBI)I", line = 579)
    public final int method2132(char arg0, byte arg1, int arg2) {
        int var4 = 72 / ((56 - arg1) / 55);
        field4803++;
        return this.field4789 == null ? 0 : this.field4789[arg2][arg0];
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 596)
    public static final void method2133(boolean arg0) {
        field4797++;
        if (class577.field8514 == class301.field4131) {
            return;
        }
        try {
            if (arg0) {
                field4793 = null;
            }
            class640.method3702(class460.field6511, (byte) 94, "tbrefresh");
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I", line = 616)
    public final int method2134(int arg0, int arg1) {
        int var3 = -75 / ((arg1 - 68) / 55);
        field4795++;
        return this.field4796[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([B)V", line = 625)
    public class352(byte[] arg0) {
        class148 var2 = new class148(arg0);
        int var3 = var2.method1032((byte) -33);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1032((byte) -33) == 1;
        this.field4796 = new byte[256];
        var2.method1060((byte) 52, this.field4796, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1032((byte) -33);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1032((byte) -33);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1062(-21188);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1062(-21188);
                    var11[var12][var16] = var15;
                }
            }
            this.field4789 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4789[var13][var14] = (byte) class618.method3622(var11, 255, var14, this.field4796, var9, var6, var13, var5);
                        }
                    }
                }
            }
            this.field4791 = var5[32] + var6[32];
        } else {
            this.field4791 = var2.method1032((byte) -33);
        }
        var2.method1032((byte) -33);
        var2.method1032((byte) -33);
        this.field4788 = var2.method1032((byte) -33);
        this.field4792 = var2.method1032((byte) -33);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILlp;Lgw;I)V", line = 748)
    public static final void method2135(int arg0, class331 arg1, class148 arg2, int arg3) {
        field4801++;
        class22 var4 = new class22();
        var4.field216 = arg2.method1032((byte) -33);
        var4.field217 = arg2.method1026(-917302120);
        var4.field220 = new class21[var4.field216];
        var4.field214 = new class21[var4.field216];
        var4.field208 = new int[var4.field216];
        var4.field218 = new int[var4.field216];
        var4.field221 = new byte[var4.field216][][];
        var4.field209 = new int[var4.field216];
        if (arg3 != 8084) {
            return;
        }
        for (int var5 = 0; var5 < var4.field216; var5++) {
            try {
                int var6 = arg2.method1032((byte) -33);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method1023(-29153);
                    String var8 = arg2.method1023(arg3 - 37237);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method1026(-917302120);
                    }
                    var4.field208[var5] = var6;
                    var4.field209[var5] = var9;
                    var4.field220[var5] = arg1.method2014(var8, arg3 - 8084, class90.method672(var7, 112));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method1023(-29153);
                    String var11 = arg2.method1023(-29153);
                    int var12 = arg2.method1032((byte) -33);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method1023(arg3 - 37237);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1026(-917302120);
                            var15[var16] = new byte[var17];
                            arg2.method1060((byte) 125, var15[var16], 0, var17);
                        }
                    }
                    var4.field208[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class90.method672(var13[var19], 91);
                    }
                    var4.field214[var5] = arg1.method2003((byte) -7, var11, var18, class90.method672(var10, arg3 - 7959));
                    var4.field221[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field218[var5] = -1;
            } catch (SecurityException var21) {
                var4.field218[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field218[var5] = -3;
            } catch (Exception var23) {
                var4.field218[var5] = -4;
            } catch (Throwable var24) {
                var4.field218[var5] = -5;
            }
        }
        class359.field4877.method131(var4, 0);
    }
}
