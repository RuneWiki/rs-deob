import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class135 {

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "[B")
    private byte[] field1795;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[[B")
    private byte[][] field1784;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[Lok;")
    public static class153[] field1790 = new class153[14];

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[I")
    public static int[] field1787 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lwf;")
    public static class79 field1794 = new class79(20, -1);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Lb;")
    public static class201 field1800;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lnp;")
    public static class313 field1783;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[[B")
    public static byte[][] field1788;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Ltr;Ljava/lang/String;II)I")
    public final int method852(class176[] arg0, String arg1, int arg2, int arg3) {
        int var5 = -93 % ((34 - arg3) / 34);
        field1797++;
        int var6 = this.method859((byte) 93, new int[] { arg2 }, class451.field6243, arg1, arg0);
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            int var9 = this.method858(arg0, -17498, class451.field6243[var8]);
            if (var9 > var7) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lqc;III)V")
    public static final void method853(class483 arg0, int arg1, int arg2, int arg3) {
        long var4 = class337.field4910[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field6802 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field6799[arg0.field6802++] = class478.field6712[var8 - 1];
            var6 += 16L;
        }
        for (int var9 = arg0.field6802; var9 < 4; var9++) {
            arg0.field6799[var9] = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method854(int arg0) {
        field1800 = null;
        field1788 = null;
        field1794 = null;
        field1790 = null;
        field1783 = null;
        if (arg0 == 4) {
            field1787 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;[Ltr;IZ)I")
    public final int method855(String arg0, class176[] arg1, int arg2, boolean arg3) {
        field1789++;
        if (arg3) {
            field1788 = null;
        }
        return this.method859((byte) 93, new int[] { arg2 }, class451.field6243, arg0, arg1);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(CII)I")
    public final int method856(char arg0, int arg1, int arg2) {
        if (arg1 <= 56) {
            field1794 = null;
        }
        field1792++;
        return this.field1784 == null ? 0 : this.field1784[arg2][arg0];
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I[Ltr;II)I")
    public final int method857(String arg0, int arg1, class176[] arg2, int arg3, int arg4) {
        if (arg1 == 0) {
            arg1 = this.field1796;
        }
        field1798++;
        int var6 = this.method859((byte) 93, new int[] { arg4 }, class451.field6243, arg0, arg2);
        int var7 = (arg3 + var6) * arg1;
        return this.field1785 + this.field1793 + var7;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Ltr;ILjava/lang/String;)I")
    public final int method858(class176[] arg0, int arg1, String arg2) {
        field1782++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (arg1 != -17498) {
            return -101;
        }
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg2.substring(var4 + 1, var8);
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
                                    int var11 = class151.method952(var10.substring(4), 16046);
                                    var5 = -1;
                                    var6 += arg0[var11].method516();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field1795[class367.method2262(var9, (byte) -99) & 0xFF] & 0xFF;
                    if (this.field1784 != null && var5 != -1) {
                        var6 += this.field1784[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B[I[Ljava/lang/String;Ljava/lang/String;[Ltr;)I")
    public final int method859(byte arg0, int[] arg1, String[] arg2, String arg3, class176[] arg4) {
        field1799++;
        if (arg3 == null) {
            return 0;
        }
        if (arg0 != 93) {
            field1783 = null;
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
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class367.method2262(arg3.charAt(var15), (byte) -99) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method861(var16, 60);
                    var18 = var15;
                    if (this.field1784 != null && var12 != -1) {
                        var17 += this.field1784[var12][var16];
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
                        var6 = 0;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method861(60, 60);
                        if (this.field1784 != null && var12 != -1) {
                            var17 += this.field1784[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method861(62, 60);
                        if (this.field1784 != null && var12 != -1) {
                            var17 += this.field1784[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method861(160, 60);
                        if (this.field1784 != null && var12 != -1) {
                            var17 += this.field1784[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method861(173, 60);
                        if (this.field1784 != null && var12 != -1) {
                            var17 += this.field1784[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method861(215, 60);
                        if (this.field1784 != null && var12 != -1) {
                            var17 += this.field1784[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method861(8364, 60);
                        if (this.field1784 != null && var12 != -1) {
                            var17 += this.field1784[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method861(169, 60);
                        if (this.field1784 != null && var12 != -1) {
                            var17 += this.field1784[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method861(174, 60);
                        if (this.field1784 != null && var12 != -1) {
                            var17 += this.field1784[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class151.method952(var19.substring(4), 16046);
                            var17 += arg4[var20].method516();
                            var12 = -1;
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
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg1[var13 < arg1.length ? var13 : arg1.length - 1]) {
                            if (var8 < 0) {
                                arg2[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
                            } else {
                                arg2[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            }
                        }
                        if (var16 == 45) {
                            var10 = 0;
                            var9 = var6;
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method860(int arg0, String arg1) {
        if (arg0 != -46) {
            this.method859((byte) 51, (int[]) null, (String[]) null, (String) null, (class176[]) null);
        }
        field1791++;
        return this.method858((class176[]) null, -17498, arg1);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I")
    public final int method861(int arg0, int arg1) {
        field1786++;
        return arg1 == 60 ? this.field1795[arg0] & 0xFF : -63;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "([B)V")
    public class135(byte[] arg0) {
        class276 var2 = new class276(arg0);
        int var3 = var2.method1701(-23121);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1701(-23121) == 1;
        this.field1795 = new byte[256];
        var2.method1706(this.field1795, 0, -56, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1701(-23121);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1701(-23121);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1715((byte) 102);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1715((byte) 111);
                    var11[var12][var16] = var15;
                }
            }
            this.field1784 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field1784[var13][var14] = (byte) class326.method2069(this.field1795, var6, (byte) 124, var11, var5, var13, var9, var14);
                        }
                    }
                }
            }
            this.field1796 = var5[32] + var6[32];
        } else {
            this.field1796 = var2.method1701(-23121);
        }
        var2.method1701(-23121);
        var2.method1701(-23121);
        this.field1785 = var2.method1701(-23121);
        this.field1793 = var2.method1701(-23121);
    }
}
