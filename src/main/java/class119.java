import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class119 {

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[B")
    private byte[] field1855;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[[B")
    private byte[][] field1858;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "[I")
    public static int[] field1856 = new int[6];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Ltv;")
    public static class400 field1848 = class244.method1603(31649);

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Lqt;")
    public static class459 field1864 = new class459(11, 8);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;B[Laa;)Ljava/lang/String;")
    public final String method868(int arg0, String arg1, byte arg2, class343[] arg3) {
        field1861++;
        if (this.method877(arg3, (byte) -87, arg1) <= arg0) {
            return arg1;
        }
        int var5 = arg0 - this.method877(null, (byte) -87, "...");
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg1.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg1.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg1.substring(var6 + 1, var11);
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
                                    int var14 = class292.method1880(125, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg3[var14].method376();
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg1.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field1855[class297.method1912(var12, arg2 - 7758) & 0xFF] & 0xFF;
                    if (this.field1858 != null && var7 != -1) {
                        var8 += this.field1858[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field1858 != null) {
                        var15 = this.field1858[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg1.substring(0, var11 + 1);
                }
            }
        }
        if (arg2 != 40) {
            this.method869(null, 26, -14, null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([Laa;IILjava/lang/String;)I")
    public final int method869(class343[] arg0, int arg1, int arg2, String arg3) {
        field1849++;
        if (arg1 > -29) {
            this.method875(null, (byte) 39);
        }
        int var5 = this.method870(new int[] { arg2 }, 8611, arg3, class447.field6379, arg0);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method877(arg0, (byte) -87, class447.field6379[var7]);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([IILjava/lang/String;[Ljava/lang/String;[Laa;)I")
    public final int method870(int[] arg0, int arg1, String arg2, String[] arg3, class343[] arg4) {
        field1859++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != 8611) {
            method872((byte) 6);
        }
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class297.method1912(arg2.charAt(var15), -7718) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method876(var16, 255);
                    if (this.field1858 != null && var12 != -1) {
                        var17 += this.field1858[var12][var16];
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
                        var8 = -1;
                        var7 = var15 + 1;
                        var12 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method876(60, 255);
                        if (this.field1858 != null && var12 != -1) {
                            var17 += this.field1858[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method876(62, arg1 ^ 0x215C);
                        if (this.field1858 != null && var12 != -1) {
                            var17 += this.field1858[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method876(160, 255);
                        if (this.field1858 != null && var12 != -1) {
                            var17 += this.field1858[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method876(173, 255);
                        if (this.field1858 != null && var12 != -1) {
                            var17 += this.field1858[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method876(215, arg1 ^ 0x215C);
                        if (this.field1858 != null && var12 != -1) {
                            var17 += this.field1858[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method876(8364, 255);
                        if (this.field1858 != null && var12 != -1) {
                            var17 += this.field1858[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method876(169, 255);
                        if (this.field1858 != null && var12 != -1) {
                            var17 += this.field1858[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method876(174, 255);
                        if (this.field1858 != null && var12 != -1) {
                            var17 += this.field1858[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class292.method1880(61, var19.substring(4));
                            var12 = -1;
                            var17 += arg4[var20].method376();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg0 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (arg0[var13 >= arg0.length ? arg0.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg3[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
                                var8 = -1;
                            } else {
                                arg3[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var12 = -1;
                                var7 = var18;
                                var6 = var17;
                                var8 = -1;
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
        if (var7 < arg2.length()) {
            arg3[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)S")
    public static final short method871(int arg0, int arg1) {
        field1857++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = (arg0 & 0x387) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (arg1 == var6) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method872(byte arg0) {
        field1856 = null;
        field1848 = null;
        field1864 = null;
        if (arg0 != 41) {
            field1848 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(CII)I")
    public final int method873(char arg0, int arg1, int arg2) {
        if (arg1 >= -67) {
            this.method876(-53, -25);
        }
        field1862++;
        return this.field1858 == null ? 0 : this.field1858[arg2][arg0];
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[Laa;ILjava/lang/String;)I")
    public final int method874(int arg0, class343[] arg1, int arg2, String arg3) {
        field1850++;
        if (arg0 < 14) {
            field1864 = null;
        }
        return this.method870(new int[] { arg2 }, 8611, arg3, class447.field6379, arg1);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method875(String arg0, byte arg1) {
        if (arg1 == 5) {
            field1852++;
            return this.method877(null, (byte) -87, arg0);
        } else {
            return -71;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I")
    public final int method876(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field1860 = -73;
        }
        field1853++;
        return this.field1855[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([Laa;BLjava/lang/String;)I")
    public final int method877(class343[] arg0, byte arg1, String arg2) {
        field1865++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
        int var8 = 0;
        if (arg1 != -87) {
            return -87;
        }
        while (var8 < var7) {
            char var9 = arg2.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                label77: {
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
                                        int var11 = class292.method1880(120, var10.substring(4));
                                        var6 += arg0[var11].method376();
                                        var5 = -1;
                                    } catch (Exception var12) {
                                    }
                                }
                                break label77;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field1855[class297.method1912(var9, arg1 - 7631) & 0xFF] & 0xFF;
                        if (this.field1858 != null && var5 != -1) {
                            var6 += this.field1858[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            var8++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[Laa;Ljava/lang/String;ZI)I")
    public final int method878(int arg0, class343[] arg1, String arg2, boolean arg3, int arg4) {
        if (arg4 == 0) {
            arg4 = this.field1860;
        }
        field1851++;
        int var6 = this.method870(new int[] { arg0 }, 8611, arg2, class447.field6379, arg1);
        int var7 = (var6 - 1) * arg4;
        if (!arg3) {
            this.field1863 = -13;
        }
        return this.field1854 - (-this.field1863 - var7);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([B)V")
    public class119(byte[] arg0) {
        class519 var2 = new class519(arg0);
        int var3 = var2.method3072((byte) -128);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3072((byte) -119) == 1;
        this.field1855 = new byte[256];
        var2.method3024(256, this.field1855, 0, (byte) -100);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method3072((byte) -128);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method3072((byte) -119);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3034((byte) -108);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3034((byte) -70);
                    var11[var12][var16] = var15;
                }
            }
            this.field1858 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field1858[var13][var14] = (byte) class114.method807(this.field1855, var14, var13, var5, var7, var11, 82, var9);
                        }
                    }
                }
            }
            this.field1860 = var5[32] + var7[32];
        } else {
            this.field1860 = var2.method3072((byte) -121);
        }
        var2.method3072((byte) -127);
        var2.method3072((byte) -120);
        this.field1854 = var2.method3072((byte) -120);
        this.field1863 = var2.method3072((byte) -125);
    }
}
