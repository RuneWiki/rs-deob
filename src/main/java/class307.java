import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class307 {

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "[B")
    private byte[] field3784;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "[[B")
    private byte[][] field3770;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "Llja;")
    public static class744 field3780 = new class744(61, -1);

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "Liga;")
    public static class482 field3785 = new class482(14, 0);

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "Liga;")
    public static class482 field3786 = new class482(15, 4);

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "Liga;")
    public static class482 field3787 = new class482(16, -2);

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "Liga;")
    public static class482 field3788 = new class482(17, 0);

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "Liga;")
    public static class482 field3789 = new class482(19, -2);

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "Liga;")
    public static class482 field3790 = new class482(22, -2);

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "Liga;")
    public static class482 field3791 = new class482(23, 4);

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "Liga;")
    public static class482 field3792 = new class482(24, -1);

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "Liga;")
    public static class482 field3793 = new class482(26, 0);

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "Liga;")
    public static class482 field3794 = new class482(27, 0);

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "Liga;")
    public static class482 field3795 = new class482(28, -2);

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "Liga;")
    public static class482 field3796 = new class482(29, -2);

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "Liga;")
    public static class482 field3797 = new class482(30, -2);

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "[Liga;")
    private static class482[] field3798 = new class482[32];

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "[Z")
    public static boolean[] field3801;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BCI)I")
    public final int method1809(byte arg0, char arg1, int arg2) {
        field3774++;
        int var4 = -124 % ((arg0 + 54) / 57);
        return this.field3770 == null ? 0 : this.field3770[arg2][arg1];
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "([Ltf;Ljava/lang/String;IZ)Ljava/lang/String;")
    public final String method1810(class312[] arg0, String arg1, int arg2, boolean arg3) {
        field3771++;
        if (this.method1817(false, arg1, arg0) <= arg2) {
            return arg1;
        }
        int var5 = arg2 - this.method1817(false, "...", null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        if (!arg3) {
            this.method1818(118, null, null, null, null);
        }
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
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class445.method2623(0, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg0[var14].method1634();
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
                    var8 += this.field3784[class61.method526(var12, (byte) -102) & 0xFF] & 0xFF;
                    if (this.field3770 != null && var7 != -1) {
                        var8 += this.field3770[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field3770 != null) {
                        var15 = this.field3770[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg1.substring(0, var11 + 1);
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static void method1811(int arg0) {
        field3789 = null;
        int var1 = -16 / ((52 - arg0) / 62);
        field3786 = null;
        field3801 = null;
        field3794 = null;
        field3785 = null;
        field3780 = null;
        field3798 = null;
        field3795 = null;
        field3791 = null;
        field3796 = null;
        field3790 = null;
        field3793 = null;
        field3788 = null;
        field3792 = null;
        field3787 = null;
        field3797 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "([Ltf;Ljava/lang/String;II)I")
    public final int method1812(class312[] arg0, String arg1, int arg2, int arg3) {
        field3779++;
        if (arg2 != -14563) {
            this.method1819(null, (byte) 4);
        }
        return this.method1818(62, new int[] { arg3 }, arg1, class478.field6629, arg0);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class519.method3113(arg5, -7294);
        field3777++;
        int var7 = 0;
        int var8 = arg5 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        if (arg3 != -2) {
            method1813(-10, 1, -125, 88, 85, -114, 95);
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class4.field49[arg0];
        int var16 = arg1 - var8;
        int var17 = arg1 + var8;
        class455.method2755(arg6, var15, (byte) 32, var16, arg1 - arg5);
        class455.method2755(arg2, var15, (byte) 78, var17, var16);
        class455.method2755(arg6, var15, (byte) 112, arg1 + arg5, var17);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class506.field7199[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class4.field49[arg0 + var9];
                    int[] var19 = class4.field49[arg0 - var9];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    class455.method2755(arg6, var18, (byte) 54, var20, var21);
                    class455.method2755(arg6, var19, (byte) 91, var20, var21);
                } else {
                    int[] var22 = class4.field49[arg0 + var9];
                    int[] var23 = class4.field49[arg0 - var9];
                    int var24 = class506.field7199[var9];
                    int var25 = arg1 + var7;
                    int var26 = arg1 - var7;
                    int var27 = arg1 + var24;
                    int var28 = arg1 - var24;
                    class455.method2755(arg6, var22, (byte) 67, var28, var26);
                    class455.method2755(arg2, var22, (byte) 110, var27, var28);
                    class455.method2755(arg6, var22, (byte) 65, var25, var27);
                    class455.method2755(arg6, var23, (byte) 101, var28, var26);
                    class455.method2755(arg2, var23, (byte) 90, var27, var28);
                    class455.method2755(arg6, var23, (byte) 22, var25, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class4.field49[arg0 + var7];
            int[] var30 = class4.field49[arg0 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var8 <= var7) {
                class455.method2755(arg6, var29, (byte) 70, var31, var32);
                class455.method2755(arg6, var30, (byte) 97, var31, var32);
            } else {
                int var33 = var7 > var11 ? class506.field7199[var7] : var11;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class455.method2755(arg6, var29, (byte) 34, var35, var32);
                class455.method2755(arg2, var29, (byte) 123, var34, var35);
                class455.method2755(arg6, var29, (byte) 62, var31, var34);
                class455.method2755(arg6, var30, (byte) 50, var35, var32);
                class455.method2755(arg2, var30, (byte) 43, var34, var35);
                class455.method2755(arg6, var30, (byte) 22, var31, var34);
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)I")
    public final int method1814(int arg0, boolean arg1) {
        if (arg1) {
            return 38;
        } else {
            field3781++;
            return this.field3784[arg0] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[Ltf;Ljava/lang/String;I)I")
    public final int method1815(boolean arg0, class312[] arg1, String arg2, int arg3) {
        field3776++;
        if (arg0) {
            this.field3784 = null;
        }
        int var5 = this.method1818(62, new int[] { arg3 }, arg2, class478.field6629, arg1);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1817(false, class478.field6629[var7], arg1);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "([Ltf;IIBLjava/lang/String;)I")
    public final int method1816(class312[] arg0, int arg1, int arg2, byte arg3, String arg4) {
        if (arg1 == 0) {
            arg1 = this.field3782;
        }
        field3783++;
        int var6 = this.method1818(62, new int[] { arg2 }, arg4, class478.field6629, arg0);
        int var7 = 101 / ((arg3 - 4) / 40);
        int var8 = (var6 - 1) * arg1;
        return this.field3773 + this.field3769 + var8;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZLjava/lang/String;[Ltf;)I")
    public final int method1817(boolean arg0, String arg1, class312[] arg2) {
        field3778++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        int var8 = 0;
        if (arg0) {
            field3780 = null;
        }
        while (var8 < var7) {
            char var9 = arg1.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                label77: {
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
                                if (var10.startsWith("img=") && arg2 != null) {
                                    try {
                                        int var11 = class445.method2623(0, var10.substring(4));
                                        var6 += arg2[var11].method1634();
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
                        var6 += this.field3784[class61.method526(var9, (byte) -102) & 0xFF] & 0xFF;
                        if (this.field3770 != null && var5 != -1) {
                            var6 += this.field3770[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            var8++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I[ILjava/lang/String;[Ljava/lang/String;[Ltf;)I")
    public final int method1818(int arg0, int[] arg1, String arg2, String[] arg3, class312[] arg4) {
        field3772++;
        if (arg0 != 62) {
            return 65;
        } else if (arg2 == null) {
            return 0;
        } else {
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
                int var16 = class61.method526(arg2.charAt(var15), (byte) -102) & 0xFF;
                int var17 = 0;
                if (var16 == 60) {
                    var11 = var15;
                } else {
                    int var18;
                    if (var11 == -1) {
                        var17 += this.method1814(var16, false);
                        var18 = var15;
                        if (this.field3770 != null && var12 != -1) {
                            var17 += this.field3770[var12][var16];
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
                            if (arg3.length <= var13) {
                                return 0;
                            }
                            var12 = -1;
                            var6 = 0;
                            var7 = var15 + 1;
                            var8 = -1;
                            continue;
                        }
                        if (var19.equals("lt")) {
                            var17 += this.method1814(60, false);
                            if (this.field3770 != null && var12 != -1) {
                                var17 += this.field3770[var12][60];
                            }
                            var12 = 60;
                        } else if (var19.equals("gt")) {
                            var17 += this.method1814(62, false);
                            if (this.field3770 != null && var12 != -1) {
                                var17 += this.field3770[var12][62];
                            }
                            var12 = 62;
                        } else if (var19.equals("nbsp")) {
                            var17 += this.method1814(160, false);
                            if (this.field3770 != null && var12 != -1) {
                                var17 += this.field3770[var12][160];
                            }
                            var12 = 160;
                        } else if (var19.equals("shy")) {
                            var17 += this.method1814(173, false);
                            if (this.field3770 != null && var12 != -1) {
                                var17 += this.field3770[var12][173];
                            }
                            var12 = 173;
                        } else if (var19.equals("times")) {
                            var17 += this.method1814(215, false);
                            if (this.field3770 != null && var12 != -1) {
                                var17 += this.field3770[var12][215];
                            }
                            var12 = 215;
                        } else if (var19.equals("euro")) {
                            var17 += this.method1814(8364, false);
                            if (this.field3770 != null && var12 != -1) {
                                var17 += this.field3770[var12][8364];
                            }
                            var12 = 8364;
                        } else if (var19.equals("copy")) {
                            var17 += this.method1814(169, false);
                            if (this.field3770 != null && var12 != -1) {
                                var17 += this.field3770[var12][169];
                            }
                            var12 = 169;
                        } else if (var19.equals("reg")) {
                            var17 += this.method1814(174, false);
                            if (this.field3770 != null && var12 != -1) {
                                var17 += this.field3770[var12][174];
                            }
                            var12 = 174;
                        } else if (var19.startsWith("img=") && arg4 != null) {
                            try {
                                int var20 = class445.method2623(0, var19.substring(4));
                                var17 += arg4[var20].method1634();
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
                                var8 = var15;
                                var10 = 1;
                                var9 = var6;
                            }
                            if (var6 > arg1[arg1.length <= var13 ? arg1.length - 1 : var13]) {
                                if (var8 >= 0) {
                                    arg3[var13] = arg2.substring(var7, var8 - (var10 - 1));
                                    var13++;
                                    if (var13 >= arg3.length) {
                                        return 0;
                                    }
                                    var7 = var8 + 1;
                                    var8 = -1;
                                    var6 -= var9;
                                    var12 = -1;
                                } else {
                                    arg3[var13] = arg2.substring(var7, var18);
                                    var13++;
                                    if (arg3.length <= var13) {
                                        return 0;
                                    }
                                    var7 = var18;
                                    var6 = var17;
                                    var12 = -1;
                                    var8 = -1;
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
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method1819(String arg0, byte arg1) {
        field3775++;
        int var3 = -37 / ((arg1 - 51) / 60);
        return this.method1817(false, arg0, null);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "([B)V")
    public class307(byte[] arg0) {
        class403 var2 = new class403(arg0);
        int var3 = var2.method2396((byte) -110);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2396((byte) 87) == 1;
        this.field3784 = new byte[256];
        var2.method2401(65280, this.field3784, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2396((byte) -110);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2396((byte) -86);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2392(15);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2392(-72);
                    var11[var12][var16] = var15;
                }
            }
            this.field3770 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field3770[var13][var14] = (byte) class148.method1069(var14, var9, this.field3784, (byte) -9, var7, var5, var11, var13);
                        }
                    }
                }
            }
            this.field3782 = var5[32] + var7[32];
        } else {
            this.field3782 = var2.method2396((byte) -93);
        }
        var2.method2396((byte) -121);
        var2.method2396((byte) -119);
        this.field3773 = var2.method2396((byte) 20);
        this.field3769 = var2.method2396((byte) -83);
    }

    static {
        class482[] var0 = class291.method1700(-31550);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3798[var0[var1].field6730] = var0[var1];
        }
        field3800 = 1339;
    }
}
