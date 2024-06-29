import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class297 {

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[B")
    private byte[] field3816;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "[[B")
    private byte[][] field3818;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Ll;")
    public static class16 field3820;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Ll;Ljava/lang/String;II)I")
    public final int method1744(int arg0, class16[] arg1, String arg2, int arg3, int arg4) {
        if (arg3 > -51) {
            this.method1746(null, (byte) 44, 118, null);
        }
        field3807++;
        if (arg0 == 0) {
            arg0 = this.field3814;
        }
        int var6 = this.method1748(arg2, arg1, 105, new int[] { arg4 }, class110.field1478);
        int var7 = (var6 - 1) * arg0;
        return this.field3823 + var7 + this.field3824;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjava/lang/String;I[Ll;)Ljava/lang/String;")
    public final String method1745(byte arg0, String arg1, int arg2, class16[] arg3) {
        field3817++;
        if (arg2 >= this.method1751(false, arg1, arg3)) {
            return arg1;
        }
        int var5 = arg2 - this.method1751(false, "...", null);
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
                                    int var14 = class521.method3099(var13.substring(4), 34);
                                    var7 = -1;
                                    var8 += arg3[var14].method148();
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
                    var8 += this.field3816[class122.method871(var12, false) & 0xFF] & 0xFF;
                    if (this.field3818 != null && var7 != -1) {
                        var8 += this.field3818[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field3818 != null) {
                        var15 = this.field3818[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg1.substring(0, var11 + 1);
                }
            }
        }
        if (arg0 != 27) {
            method1758(-13, -72);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;BI[Ll;)I")
    public final int method1746(String arg0, byte arg1, int arg2, class16[] arg3) {
        field3821++;
        if (arg1 >= -102) {
            method1754(117, 115, -56, -52, 11, 19);
        }
        return this.method1748(arg0, arg3, 103, new int[] { arg2 }, class110.field1478);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(CI)C")
    public static final char method1747(char arg0, int arg1) {
        field3809++;
        if (arg1 != -246) {
            field3820 = null;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;[Ll;I[I[Ljava/lang/String;)I")
    public final int method1748(String arg0, class16[] arg1, int arg2, int[] arg3, String[] arg4) {
        field3808++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        if (arg2 <= 102) {
            field3820 = null;
        }
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class122.method871(arg0.charAt(var15), false) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method1749(var16, -117);
                    if (this.field3818 != null && var12 != -1) {
                        var17 += this.field3818[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg0.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg4[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg4.length) {
                            return 0;
                        }
                        var8 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1749(60, -91);
                        if (this.field3818 != null && var12 != -1) {
                            var17 += this.field3818[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1749(62, -83);
                        if (this.field3818 != null && var12 != -1) {
                            var17 += this.field3818[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1749(160, 100);
                        if (this.field3818 != null && var12 != -1) {
                            var17 += this.field3818[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1749(173, 78);
                        if (this.field3818 != null && var12 != -1) {
                            var17 += this.field3818[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1749(215, 43);
                        if (this.field3818 != null && var12 != -1) {
                            var17 += this.field3818[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1749(8364, 59);
                        if (this.field3818 != null && var12 != -1) {
                            var17 += this.field3818[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1749(169, 69);
                        if (this.field3818 != null && var12 != -1) {
                            var17 += this.field3818[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1749(174, -100);
                        if (this.field3818 != null && var12 != -1) {
                            var17 += this.field3818[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class521.method3099(var19.substring(4), 90);
                            var17 += arg1[var20].method148();
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
                        if (var6 > arg3[arg3.length > var13 ? var13 : arg3.length - 1]) {
                            if (var8 >= 0) {
                                arg4[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg4[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var7 = var18;
                                var6 = var17;
                                var8 = -1;
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
        if (arg0.length() > var7) {
            arg4[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
    public final int method1749(int arg0, int arg1) {
        int var3 = 126 / ((arg1 + 18) / 47);
        field3810++;
        return this.field3816[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ICI)I")
    public final int method1750(int arg0, char arg1, int arg2) {
        field3819++;
        if (arg2 != 0) {
            this.field3823 = 46;
        }
        return this.field3818 == null ? 0 : this.field3818[arg0][arg1];
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLjava/lang/String;[Ll;)I")
    public final int method1751(boolean arg0, String arg1, class16[] arg2) {
        field3806++;
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
                            if (var10.startsWith("img=") && arg2 != null) {
                                try {
                                    int var11 = class521.method3099(var10.substring(4), 81);
                                    var6 += arg2[var11].method148();
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
                    var6 += this.field3816[class122.method871(var9, arg0) & 0xFF] & 0xFF;
                    if (this.field3818 != null && var5 != -1) {
                        var6 += this.field3818[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        if (arg0) {
            this.field3818 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method1752(int arg0) {
        if (arg0 == -4930) {
            field3820 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1753(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII)V")
    public static final void method1754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3813++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        if (arg3 != -32672) {
            field3820 = null;
        }
        class184.method1160(class387.field5088[arg4], arg3 ^ 0x7F99, arg2, arg0 + arg1, -arg1 + arg0);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class184.method1160(class387.field5088[var21], -7, arg2, var23, var24);
            class184.method1160(class387.field5088[var22], arg3 ^ 0x7F99, arg2, var23, var24);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILjava/lang/String;[Ll;)I")
    public final int method1755(int arg0, int arg1, String arg2, class16[] arg3) {
        field3811++;
        int var5 = this.method1748(arg2, arg3, 115, new int[] { arg0 }, class110.field1478);
        int var6 = arg1;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1751(false, class110.field1478[var7], arg3);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1756(boolean arg0, int arg1, String arg2) {
        field3812++;
        class8.field76.field586 = 1;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class376.field4949.field903; var6++) {
            class9 var9 = class376.field4949.method624((byte) -115, var6);
            if ((!arg0 || var9.field107) && var9.field120 == -1 && var9.field131 == -1 && var9.field134 == 0 && var9.field140.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class218.field2786 = null;
                    class466.field6745 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class466.field6745 = var5;
        class218.field2786 = var4;
        class10.field164 = arg1;
        String[] var7 = new String[class466.field6745];
        for (int var8 = 0; var8 < class466.field6745; var8++) {
            var7[var8] = class376.field4949.method624((byte) -124, var4[var8]).field140;
        }
        class420.method2468(class218.field2786, var7, 1);
        class8.field76.method483(arg1);
        class8.field76.field586 = 2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method1757(byte arg0, String arg1) {
        int var3 = 19 % ((-arg0 - 80) / 43);
        field3815++;
        return this.method1751(false, arg1, null);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
    public class297(byte[] arg0) {
        class463 var2 = new class463(arg0);
        int var3 = var2.method2737(false);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2737(false) == 1;
        this.field3816 = new byte[256];
        var2.method2735(this.field3816, 256, 0, -447463096);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2737(false);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2737(false);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2793(32767);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2793(32767);
                    var11[var12][var16] = var15;
                }
            }
            this.field3818 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field3818[var13][var14] = (byte) class498.method3007(var11, var14, this.field3816, var5, var6, var13, 255, var9);
                        }
                    }
                }
            }
            this.field3814 = var5[32] + var6[32];
        } else {
            this.field3814 = var2.method2737(false);
        }
        var2.method2737(false);
        var2.method2737(false);
        this.field3823 = var2.method2737(false);
        this.field3824 = var2.method2737(false);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I")
    public static final int method1758(int arg0, int arg1) {
        return class140.field1804 == null ? 0 : class140.field1804[arg0][arg1] & 0xFFFFFF;
    }
}
