import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class283 {

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "[B")
    private byte[] field3865;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "[[B")
    private byte[][] field3863;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public int field3859;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lch;")
    public static class428 field3860 = new class428(0);

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "Lpn;")
    public static class692 field3875 = new class692(2);

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "Lrg;")
    public static class596 field3876 = new class596(2, 4);

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3878 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B[Lf;ILjava/lang/String;I)I", line = 4)
    public final int method1734(byte arg0, class702[] arg1, int arg2, String arg3, int arg4) {
        if (arg2 == 0) {
            arg2 = this.field3864;
        }
        field3871++;
        int var6 = this.method1739(new int[] { arg4 }, arg1, class534.field7231, arg3, false);
        if (arg0 != -96) {
            field3875 = null;
        }
        int var7 = (var6 - 1) * arg2;
        return this.field3874 + var7 + this.field3859;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(JI)V", line = 25)
    public static final void method1735(long arg0, int arg1) {
        field3873++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != -1) {
            method1742(-81);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;)I", line = 39)
    public final int method1736(int arg0, String arg1) {
        field3877++;
        return arg0 == 17046 ? this.method1741(arg1, null, 1) : -84;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([Lf;ILjava/lang/String;I)Ljava/lang/String;", line = 56)
    public final String method1737(class702[] arg0, int arg1, String arg2, int arg3) {
        field3866++;
        if (arg3 >= this.method1741(arg2, arg0, 1)) {
            return arg2;
        }
        int var5 = arg3 - this.method1741("...", null, arg1 + 1);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg2.length();
        String var10 = "";
        for (int var11 = arg1; var11 < var9; var11++) {
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
                                    int var14 = class214.method1376(0, var13.substring(4));
                                    var8 += arg0[var14].method1660();
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
                    var8 += this.field3865[class631.method3536(var12, true) & 0xFF] & 0xFF;
                    if (this.field3863 != null && var7 != -1) {
                        var8 += this.field3863[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field3863 != null) {
                        var15 = this.field3863[var12][46] + var8;
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

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BILjava/lang/String;[Lf;)I", line = 176)
    public final int method1738(byte arg0, int arg1, String arg2, class702[] arg3) {
        if (arg0 <= 81) {
            return 119;
        }
        field3862++;
        int var5 = this.method1739(new int[] { arg1 }, arg3, class534.field7231, arg2, false);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1741(class534.field7231[var7], arg3, 1);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([I[Lf;[Ljava/lang/String;Ljava/lang/String;Z)I", line = 205)
    public final int method1739(int[] arg0, class702[] arg1, String[] arg2, String arg3, boolean arg4) {
        field3861++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        if (arg4) {
            this.field3865 = null;
        }
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class631.method3536(arg3.charAt(var15), true) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method1743(var16, 118);
                    var18 = var15;
                    if (this.field3863 != null && var12 != -1) {
                        var17 += this.field3863[var12][var16];
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
                        var6 = 0;
                        var12 = -1;
                        var7 = var15 + 1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1743(60, 72);
                        if (this.field3863 != null && var12 != -1) {
                            var17 += this.field3863[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1743(62, 78);
                        if (this.field3863 != null && var12 != -1) {
                            var17 += this.field3863[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1743(160, 83);
                        if (this.field3863 != null && var12 != -1) {
                            var17 += this.field3863[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1743(173, 89);
                        if (this.field3863 != null && var12 != -1) {
                            var17 += this.field3863[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1743(215, 127);
                        if (this.field3863 != null && var12 != -1) {
                            var17 += this.field3863[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1743(8364, 47);
                        if (this.field3863 != null && var12 != -1) {
                            var17 += this.field3863[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1743(169, 79);
                        if (this.field3863 != null && var12 != -1) {
                            var17 += this.field3863[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1743(174, 88);
                        if (this.field3863 != null && var12 != -1) {
                            var17 += this.field3863[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class214.method1376(0, var19.substring(4));
                            var12 = -1;
                            var17 += arg1[var20].method1660();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg0 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 1;
                        }
                        if (var6 > arg0[var13 < arg0.length ? var13 : arg0.length - 1]) {
                            if (var8 >= 0) {
                                arg2[var13] = arg3.substring(var7, var8 - (var10 - 1));
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg2[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var12 = -1;
                                var8 = -1;
                                var7 = var18;
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
        if (var7 < arg3.length()) {
            arg2[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(CBI)I", line = 457)
    public final int method1740(char arg0, byte arg1, int arg2) {
        if (arg1 == 111) {
            field3872++;
            return this.field3863 == null ? 0 : this.field3863[arg2][arg0];
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;[Lf;I)I", line = 475)
    public final int method1741(String arg0, class702[] arg1, int arg2) {
        field3868++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg2 != 1) {
            field3875 = null;
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
                                    int var11 = class214.method1376(0, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg1[var11].method1660();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field3865[class631.method3536(var9, true) & 0xFF] & 0xFF;
                    if (this.field3863 != null && var5 != -1) {
                        var6 += this.field3863[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 586)
    public static void method1742(int arg0) {
        field3860 = null;
        field3875 = null;
        field3876 = null;
        int var1 = 68 % ((-arg0 - 37) / 51);
        field3878 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I", line = 599)
    public final int method1743(int arg0, int arg1) {
        if (arg1 < 28) {
            this.field3864 = -121;
        }
        field3869++;
        return this.field3865[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZII)V", line = 610)
    public static final void method1744(boolean arg0, int arg1, int arg2) {
        field3867++;
        class373 var3 = class687.method3877(arg1, arg0, 31);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 < 14) {
            field3860 = null;
        }
        while (var3.field5021.length > var4) {
            var3.field5021[var4] = -1;
            var3.field5020[var4] = 0;
            var4++;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([Lf;Ljava/lang/String;II)I", line = 636)
    public final int method1745(class702[] arg0, String arg1, int arg2, int arg3) {
        field3870++;
        int var5 = 26 / ((arg3 + 34) / 55);
        return this.method1739(new int[] { arg2 }, arg0, class534.field7231, arg1, false);
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([B)V", line = 654)
    public class283(byte[] arg0) {
        class501 var2 = new class501(arg0);
        int var3 = var2.method2874((byte) -75);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2874((byte) -75) == 1;
        this.field3865 = new byte[256];
        var2.method2857(this.field3865, 256, (byte) 125, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2874((byte) -75);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2874((byte) -75);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2863(94);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2863(105);
                    var11[var12][var16] = var15;
                }
            }
            this.field3863 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field3863[var13][var14] = (byte) class284.method1747(-14696, this.field3865, var9, var5, var7, var13, var11, var14);
                        }
                    }
                }
            }
            this.field3864 = var5[32] + var7[32];
        } else {
            this.field3864 = var2.method2874((byte) -75);
        }
        var2.method2874((byte) -75);
        var2.method2874((byte) -75);
        this.field3859 = var2.method2874((byte) -75);
        this.field3874 = var2.method2874((byte) -75);
    }
}
