import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class61 {

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "[B")
    private byte[] field892;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "[[B")
    private byte[][] field888;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "[I")
    public static int[] field890 = new int[14];

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field899 = -1;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "Lo;")
    public static class359 field884;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static void method406(int arg0) {
        field884 = null;
        field890 = null;
        if (arg0 >= -108) {
            method406(94);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([Lo;IBLjava/lang/String;)I")
    public final int method407(class359[] arg0, int arg1, byte arg2, String arg3) {
        if (arg2 != 29) {
            this.field888 = null;
        }
        field887++;
        return this.method412(arg0, (byte) 2, new int[] { arg1 }, arg3, class18.field279);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[Lo;ILjava/lang/String;)I")
    public final int method408(int arg0, class359[] arg1, int arg2, String arg3) {
        field886++;
        int var5 = this.method412(arg1, (byte) 2, new int[] { arg2 }, arg3, class18.field279);
        int var6 = arg0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method411(class18.field279[var7], arg1, -1);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BCI)I")
    public final int method409(byte arg0, char arg1, int arg2) {
        if (arg0 > -20) {
            this.field892 = null;
        }
        field895++;
        return this.field888 == null ? 0 : this.field888[arg2][arg1];
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILjava/lang/String;I[Lo;I)I")
    public final int method410(int arg0, String arg1, int arg2, class359[] arg3, int arg4) {
        field893++;
        if (arg2 == 0) {
            arg2 = this.field885;
        }
        int var6 = this.method412(arg3, (byte) 2, new int[] { arg0 }, arg1, class18.field279);
        int var7 = (arg4 + var6) * arg2;
        return this.field896 + var7 + this.field883;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;[Lo;I)I")
    public final int method411(String arg0, class359[] arg1, int arg2) {
        field898++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = arg2;
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
                                    int var11 = class410.method2405(-7, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg1[var11].method204();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field892[class355.method2125(arg2 - 15204, var9) & 0xFF] & 0xFF;
                    if (this.field888 != null && var5 != -1) {
                        var6 += this.field888[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([Lo;B[ILjava/lang/String;[Ljava/lang/String;)I")
    public final int method412(class359[] arg0, byte arg1, int[] arg2, String arg3, String[] arg4) {
        field891++;
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
        if (arg1 != 2) {
            return -51;
        }
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class355.method2125(arg1 ^ 0xFFFFC499, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method415(var16, (byte) 1);
                    if (this.field888 != null && var12 != -1) {
                        var17 += this.field888[var12][var16];
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
                        if (var13 >= arg4.length) {
                            return 0;
                        }
                        var12 = -1;
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method415(60, (byte) 1);
                        if (this.field888 != null && var12 != -1) {
                            var17 += this.field888[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method415(62, (byte) 1);
                        if (this.field888 != null && var12 != -1) {
                            var17 += this.field888[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method415(160, (byte) 1);
                        if (this.field888 != null && var12 != -1) {
                            var17 += this.field888[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method415(173, (byte) 1);
                        if (this.field888 != null && var12 != -1) {
                            var17 += this.field888[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method415(215, (byte) 1);
                        if (this.field888 != null && var12 != -1) {
                            var17 += this.field888[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method415(8364, (byte) 1);
                        if (this.field888 != null && var12 != -1) {
                            var17 += this.field888[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method415(169, (byte) 1);
                        if (this.field888 != null && var12 != -1) {
                            var17 += this.field888[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method415(174, (byte) 1);
                        if (this.field888 != null && var12 != -1) {
                            var17 += this.field888[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class410.method2405(arg1 ^ 0xFFFFFF82, var19.substring(4));
                            var17 += arg0[var20].method204();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg2 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 1;
                        }
                        if (var6 > arg2[arg2.length > var13 ? var13 : arg2.length - 1]) {
                            if (var8 >= 0) {
                                arg4[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg4[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var7 = var18;
                                var6 = var17;
                                var8 = -1;
                                var12 = -1;
                            }
                        }
                        if (var16 == 45) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 0;
                        }
                    }
                }
            }
        }
        if (arg3.length() > var7) {
            arg4[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BILjava/lang/String;[Lo;)Ljava/lang/String;")
    public final String method413(byte arg0, int arg1, String arg2, class359[] arg3) {
        field897++;
        if (this.method411(arg2, arg3, -1) <= arg1) {
            return arg2;
        }
        if (arg0 >= -35) {
            this.method410(119, null, -75, null, 78);
        }
        int var5 = arg1 - this.method411("...", null, -1);
        int var6 = -1;
        int var7 = -1;
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
                                    int var14 = class410.method2405(105, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg3[var14].method204();
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
                    var8 += this.field892[class355.method2125(-15205, var12) & 0xFF] & 0xFF;
                    if (this.field888 != null && var7 != -1) {
                        var8 += this.field888[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field888 != null) {
                        var15 = this.field888[var12][46] + var8;
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

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIZII)V")
    public static final void method414(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            method414(118, 4, 48, 46, false, -76, -107);
        }
        if (class519.field7633 <= arg2 - arg1 && arg1 + arg2 <= class375.field5387 && (arg0 - arg1) >= class23.field320 && class233.field3241 >= arg0 + arg1) {
            class371.method2211(arg3, arg5, arg2, false, arg6, arg0, arg1);
        } else {
            class147.method1050(arg6, arg0, (byte) 59, arg5, arg3, arg1, arg2);
        }
        field889++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IB)I")
    public final int method415(int arg0, byte arg1) {
        field894++;
        if (arg1 != 1) {
            this.method416(-92, null);
        }
        return this.field892[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "([B)V")
    public class61(byte[] arg0) {
        class319 var2 = new class319(arg0);
        int var3 = var2.method1869(-95);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1869(-124) == 1;
        this.field892 = new byte[256];
        var2.method1887(0, this.field892, 256, true);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1869(-98);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1869(-72);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1894(-2018);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1894(-2018);
                    var11[var12][var16] = var15;
                }
            }
            this.field888 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field888[var13][var14] = (byte) class149.method1077(var11, var5, var14, this.field892, var13, var9, 101, var7);
                        }
                    }
                }
            }
            this.field885 = var5[32] + var7[32];
        } else {
            this.field885 = var2.method1869(-118);
        }
        var2.method1869(-127);
        var2.method1869(-98);
        this.field896 = var2.method1869(-93);
        this.field883 = var2.method1869(-109);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method416(int arg0, String arg1) {
        if (arg0 == 8364) {
            field882++;
            return this.method411(arg1, null, -1);
        } else {
            return -127;
        }
    }
}
