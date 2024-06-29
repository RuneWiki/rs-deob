import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[B")
    private byte[] field65;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[[B")
    private byte[][] field61;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
    public static int[] field51 = new int[25];

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field58 = 1338;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Z")
    public static boolean field55 = true;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field66 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[Ljava/lang/String;[Ljd;Ljava/lang/String;B)I", line = 3)
    public final int method36(int[] arg0, String[] arg1, class241[] arg2, String arg3, byte arg4) {
        field52++;
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
        if (arg4 != -52) {
            field58 = -124;
        }
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class126.method950((byte) -71, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method46(var16, (byte) -119);
                    if (this.field61 != null && var12 != -1) {
                        var17 += this.field61[var12][var16];
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
                        if (var13 >= arg1.length) {
                            return 0;
                        }
                        var8 = -1;
                        var12 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method46(60, (byte) -120);
                        if (this.field61 != null && var12 != -1) {
                            var17 += this.field61[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method46(62, (byte) -127);
                        if (this.field61 != null && var12 != -1) {
                            var17 += this.field61[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method46(160, (byte) -123);
                        if (this.field61 != null && var12 != -1) {
                            var17 += this.field61[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method46(173, (byte) -124);
                        if (this.field61 != null && var12 != -1) {
                            var17 += this.field61[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method46(215, (byte) -119);
                        if (this.field61 != null && var12 != -1) {
                            var17 += this.field61[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method46(8364, (byte) -112);
                        if (this.field61 != null && var12 != -1) {
                            var17 += this.field61[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method46(169, (byte) -112);
                        if (this.field61 != null && var12 != -1) {
                            var17 += this.field61[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method46(174, (byte) -125);
                        if (this.field61 != null && var12 != -1) {
                            var17 += this.field61[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class163.method1224(false, var19.substring(4));
                            var17 += arg2[var20].method1507();
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
                            var9 = var6;
                            var8 = var15;
                        }
                        if (arg0[var13 < arg0.length ? var13 : arg0.length - 1] < var6) {
                            if (var8 < 0) {
                                arg1[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var12 = -1;
                                var6 = var17;
                                var8 = -1;
                                var7 = var18;
                            } else {
                                arg1[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
                                var8 = -1;
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
        if (var7 < arg3.length()) {
            arg1[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLwia;)V", line = 254)
    public static final void method37(boolean arg0, class791 arg1) {
        class523.field7389 = arg1.method4356(16, "p11_full");
        field63++;
        if (arg0) {
            method37(false, null);
        }
        class502.field7113 = arg1.method4356(112, "p12_full");
        class220.field3416 = arg1.method4356(46, "b12_full");
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 267)
    public static void method38(int arg0) {
        if (arg0 != 0) {
            method45(-21, -11, 45, -116, 52, 39, -38, 110, null, 0.6471985F, null);
        }
        field51 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([Ljd;Ljava/lang/String;IB)I", line = 280)
    public final int method39(class241[] arg0, String arg1, int arg2, byte arg3) {
        field62++;
        if (arg3 != -27) {
            this.method42((char) 65484, (byte) -78, 59);
        }
        int var5 = this.method36(new int[] { arg2 }, class305.field4395, arg0, arg1, (byte) -52);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method40(class305.field4395[var7], arg0, (byte) -115);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;[Ljd;B)I", line = 316)
    public final int method40(String arg0, class241[] arg1, byte arg2) {
        field59++;
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
                                    int var11 = class163.method1224(false, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg1[var11].method1507();
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field65[class126.method950((byte) 124, var9) & 0xFF] & 0xFF;
                    if (this.field61 != null && var5 != -1) {
                        var6 += this.field61[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        int var12 = -26 % ((arg2 + 70) / 35);
        return var6;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 418)
    public final int method41(String arg0, int arg1) {
        if (arg1 >= -96) {
            return 126;
        } else {
            field50++;
            return this.method40(arg0, null, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(CBI)I", line = 430)
    public final int method42(char arg0, byte arg1, int arg2) {
        field49++;
        int var4 = 61 / ((13 - arg1) / 47);
        return this.field61 == null ? 0 : this.field61[arg2][arg0];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;B[Ljd;I)I", line = 448)
    public final int method43(String arg0, byte arg1, class241[] arg2, int arg3) {
        int var5 = 73 / ((arg1 - 13) / 61);
        field48++;
        return this.method36(new int[] { arg3 }, class305.field4395, arg2, arg0, (byte) -52);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;[Ljd;II)Ljava/lang/String;", line = 464)
    public final String method44(String arg0, class241[] arg1, int arg2, int arg3) {
        field60++;
        if (this.method40(arg0, arg1, (byte) -109) <= arg3) {
            return arg0;
        }
        int var5 = arg3 - this.method40("...", null, (byte) 69);
        int var6 = -1;
        int var7 = arg2;
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
                                    int var14 = class163.method1224(false, var13.substring(4));
                                    var8 += arg1[var14].method1507();
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
                    var8 += this.field65[class126.method950((byte) 124, var12) & 0xFF] & 0xFF;
                    if (this.field61 != null && var7 != -1) {
                        var8 += this.field61[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field61 != null) {
                        var15 = this.field61[var12][46] + var8;
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

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII[FF[F)V", line = 588)
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, float arg9, float[] arg10) {
        field54++;
        int var11 = arg4 - arg5;
        int var12 = arg6 - arg3;
        int var13 = arg0 - arg1;
        float var14 = arg8[2] * (float) var13 + arg8[0] * (float) var12 + arg8[1] * (float) var11;
        float var15 = arg8[arg2] * (float) var13 + arg8[4] * (float) var11 + arg8[3] * (float) var12;
        float var16 = arg8[8] * (float) var13 + arg8[6] * (float) var12 + arg8[7] * (float) var11;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = arg9 + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F;
        if (arg7 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg7 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg7 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg10[1] = var19;
        arg10[0] = var18;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)I", line = 640)
    public final int method46(int arg0, byte arg1) {
        if (arg1 >= -107) {
            return 120;
        } else {
            field53++;
            return this.field65[arg0] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V", line = 655)
    public class6(byte[] arg0) {
        class494 var2 = new class494(arg0);
        int var3 = var2.method2964((byte) 116);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2964((byte) 75) == 1;
        this.field65 = new byte[256];
        var2.method2958(true, this.field65, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2964((byte) 85);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2964((byte) 66);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2943((byte) 16);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2943((byte) 16);
                    var11[var12][var16] = var15;
                }
            }
            this.field61 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field61[var13][var14] = (byte) class53.method370(var5, 18953, var14, var13, var11, var6, this.field65, var9);
                        }
                    }
                }
            }
            this.field57 = var5[32] + var6[32];
        } else {
            this.field57 = var2.method2964((byte) 80);
        }
        var2.method2964((byte) 73);
        var2.method2964((byte) 119);
        this.field64 = var2.method2964((byte) 99);
        this.field56 = var2.method2964((byte) 112);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[Ljd;Ljava/lang/String;II)I", line = 779)
    public final int method47(int arg0, class241[] arg1, String arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            arg4 = this.field57;
        }
        if (arg3 < 6) {
            field51 = null;
        }
        field67++;
        int var6 = this.method36(new int[] { arg0 }, class305.field4395, arg1, arg2, (byte) -52);
        int var7 = (var6 - 1) * arg4;
        return this.field56 + var7 + this.field64;
    }
}
