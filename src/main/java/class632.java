import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class632 {

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "[B")
    private byte[] field8892;

    @OriginalMember(owner = "client!ufa", name = "q", descriptor = "I")
    public int field8898;

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "[[B")
    private byte[][] field8894;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public int field8890;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
    public int field8893;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "[I")
    public static int[] field8889 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "[I")
    public static int[] field8895 = new int[14];

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!ufa", name = "o", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!ufa", name = "p", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I[Lf;Ljava/lang/String;I)I", line = 9)
    public final int method3669(int arg0, class702[] arg1, String arg2, int arg3) {
        field8897++;
        int var5 = this.method3675(arg2, -121, arg1, new int[] { arg3 }, class330.field5107);
        int var6 = 0;
        for (int var7 = arg0; var7 < var5; var7++) {
            int var8 = this.method3677(arg1, (byte) -95, class330.field5107[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;[Lf;III)I", line = 35)
    public final int method3670(String arg0, class702[] arg1, int arg2, int arg3, int arg4) {
        if (~arg2 == arg3) {
            arg2 = this.field8898;
        }
        field8887++;
        int var6 = this.method3675(arg0, -125, arg1, new int[] { arg4 }, class330.field5107);
        int var7 = (var6 - 1) * arg2;
        return this.field8893 + var7 + this.field8890;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "([Lf;Ljava/lang/String;IB)Ljava/lang/String;", line = 51)
    public final String method3671(class702[] arg0, String arg1, int arg2, byte arg3) {
        field8888++;
        if (this.method3677(arg0, (byte) -97, arg1) <= arg2) {
            return arg1;
        }
        if (arg3 != 49) {
            this.method3670(null, null, 74, -62, -23);
        }
        int var5 = arg2 - this.method3677(null, (byte) -90, "...");
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
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class566.method3354((byte) -101, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg0[var14].method1076();
                                    if (var8 > var5) {
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
                    var8 += this.field8892[class132.method1149(arg3 - 305, var12) & 0xFF] & 0xFF;
                    if (this.field8894 != null && var7 != -1) {
                        var8 += this.field8894[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field8894 != null) {
                        var15 = this.field8894[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg1.substring(0, var11 + 1);
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 178)
    public final int method3672(String arg0, boolean arg1) {
        if (arg1) {
            return 12;
        } else {
            field8896++;
            return this.method3677(null, (byte) -125, arg0);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(CII)I", line = 193)
    public final int method3673(char arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method3675(null, -68, null, null, null);
        }
        field8882++;
        return this.field8894 == null ? 0 : this.field8894[arg1][arg0];
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILjava/lang/String;[Lf;B)I", line = 210)
    public final int method3674(int arg0, String arg1, class702[] arg2, byte arg3) {
        field8886++;
        int var5 = 77 % ((arg3 - 27) / 60);
        return this.method3675(arg1, 81, arg2, new int[] { arg0 }, class330.field5107);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;I[Lf;[I[Ljava/lang/String;)I", line = 221)
    public final int method3675(String arg0, int arg1, class702[] arg2, int[] arg3, String[] arg4) {
        field8884++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        int var10 = 115 / ((-arg1 - 57) / 61);
        byte var11 = 0;
        int var12 = -1;
        int var13 = -1;
        int var14 = 0;
        int var15 = arg0.length();
        for (int var16 = 0; var16 < var15; var16++) {
            int var17 = class132.method1149(-256, arg0.charAt(var16)) & 0xFF;
            int var18 = 0;
            if (var17 == 60) {
                var12 = var16;
            } else {
                int var19;
                if (var12 == -1) {
                    var18 += this.method3676((byte) 114, var17);
                    var19 = var16;
                    if (this.field8894 != null && var13 != -1) {
                        var18 += this.field8894[var13][var17];
                    }
                    var13 = var17;
                } else {
                    if (var17 != 62) {
                        continue;
                    }
                    var19 = var12;
                    String var20 = arg0.substring(var12 + 1, var16);
                    var12 = -1;
                    if (var20.equals("br")) {
                        arg4[var14] = arg0.substring(var7, var16 + 1);
                        var14++;
                        if (arg4.length <= var14) {
                            return 0;
                        }
                        var13 = -1;
                        var6 = 0;
                        var8 = -1;
                        var7 = var16 + 1;
                        continue;
                    }
                    if (var20.equals("lt")) {
                        var18 += this.method3676((byte) 114, 60);
                        if (this.field8894 != null && var13 != -1) {
                            var18 += this.field8894[var13][60];
                        }
                        var13 = 60;
                    } else if (var20.equals("gt")) {
                        var18 += this.method3676((byte) 114, 62);
                        if (this.field8894 != null && var13 != -1) {
                            var18 += this.field8894[var13][62];
                        }
                        var13 = 62;
                    } else if (var20.equals("nbsp")) {
                        var18 += this.method3676((byte) 114, 160);
                        if (this.field8894 != null && var13 != -1) {
                            var18 += this.field8894[var13][160];
                        }
                        var13 = 160;
                    } else if (var20.equals("shy")) {
                        var18 += this.method3676((byte) 114, 173);
                        if (this.field8894 != null && var13 != -1) {
                            var18 += this.field8894[var13][173];
                        }
                        var13 = 173;
                    } else if (var20.equals("times")) {
                        var18 += this.method3676((byte) 114, 215);
                        if (this.field8894 != null && var13 != -1) {
                            var18 += this.field8894[var13][215];
                        }
                        var13 = 215;
                    } else if (var20.equals("euro")) {
                        var18 += this.method3676((byte) 114, 8364);
                        if (this.field8894 != null && var13 != -1) {
                            var18 += this.field8894[var13][8364];
                        }
                        var13 = 8364;
                    } else if (var20.equals("copy")) {
                        var18 += this.method3676((byte) 114, 169);
                        if (this.field8894 != null && var13 != -1) {
                            var18 += this.field8894[var13][169];
                        }
                        var13 = 169;
                    } else if (var20.equals("reg")) {
                        var18 += this.method3676((byte) 114, 174);
                        if (this.field8894 != null && var13 != -1) {
                            var18 += this.field8894[var13][174];
                        }
                        var13 = 174;
                    } else if (var20.startsWith("img=") && arg2 != null) {
                        try {
                            int var21 = class566.method3354((byte) 28, var20.substring(4));
                            var18 += arg2[var21].method1076();
                            var13 = -1;
                        } catch (Exception var22) {
                        }
                    }
                    var17 = -1;
                }
                if (var18 > 0) {
                    var6 += var18;
                    if (arg3 != null) {
                        if (var17 == 32) {
                            var11 = 1;
                            var9 = var6;
                            var8 = var16;
                        }
                        if (var6 > arg3[var14 >= arg3.length ? arg3.length - 1 : var14]) {
                            if (var8 >= 0) {
                                arg4[var14] = arg0.substring(var7, var8 + 1 - var11);
                                var14++;
                                if (arg4.length <= var14) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var13 = -1;
                                var6 -= var9;
                                var8 = -1;
                            } else {
                                arg4[var14] = arg0.substring(var7, var19);
                                var14++;
                                if (arg4.length <= var14) {
                                    return 0;
                                }
                                var13 = -1;
                                var8 = -1;
                                var7 = var19;
                                var6 = var18;
                            }
                        }
                        if (var17 == 45) {
                            var8 = var16;
                            var11 = 0;
                            var9 = var6;
                        }
                    }
                }
            }
        }
        if (arg0.length() > var7) {
            arg4[var14] = arg0.substring(var7, arg0.length());
            var14++;
        }
        return var14;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BI)I", line = 473)
    public final int method3676(byte arg0, int arg1) {
        field8885++;
        if (arg0 != 114) {
            this.method3672(null, true);
        }
        return this.field8892[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "([Lf;BLjava/lang/String;)I", line = 490)
    public final int method3677(class702[] arg0, byte arg1, String arg2) {
        field8883++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (arg1 >= -84) {
            return -110;
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
                                    int var11 = class566.method3354((byte) 58, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg0[var11].method1076();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field8892[class132.method1149(-256, var9) & 0xFF] & 0xFF;
                    if (this.field8894 != null && var5 != -1) {
                        var6 += this.field8894[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIIIIIBI)V", line = 595)
    public static final void method3678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field8891++;
        if (arg8 > -74) {
            method3679(false);
        }
        if (arg1 == arg9 && arg0 == arg4 && arg3 == arg7 && arg2 == arg5) {
            class597.method3484(arg4, arg6, -1004229456, arg2, arg1, arg7);
            return;
        }
        int var10 = arg1;
        int var11 = arg4;
        int var12 = arg1 * 3;
        int var13 = arg4 * 3;
        int var14 = arg9 * 3;
        int var15 = arg0 * 3;
        int var16 = arg3 * 3;
        int var17 = arg5 * 3;
        int var18 = arg7 + var14 - var16 - arg1;
        int var19 = arg2 + var15 - arg4 - var17;
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var29 + var31 + var27 >> 12) + arg1;
            int var34 = (var28 + var30 + var32 >> 12) + arg4;
            class597.method3484(var11, arg6, -1004229456, var34, var10, var33);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)V", line = 673)
    public static void method3679(boolean arg0) {
        field8889 = null;
        field8895 = null;
        if (!arg0) {
            field8889 = null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "([B)V", line = 683)
    public class632(byte[] arg0) {
        class6 var2 = new class6(arg0);
        int var3 = var2.method70(-9059);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method70(-9059) == 1;
        this.field8892 = new byte[256];
        var2.method50(this.field8892, 0, 256, (byte) 19);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method70(-9059);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method70(-9059);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method81(true);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method81(true);
                    var11[var12][var16] = var15;
                }
            }
            this.field8894 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field8894[var13][var14] = (byte) class324.method2187(var7, var11, (byte) -77, var5, this.field8892, var9, var14, var13);
                        }
                    }
                }
            }
            this.field8898 = var5[32] + var7[32];
        } else {
            this.field8898 = var2.method70(-9059);
        }
        var2.method70(-9059);
        var2.method70(-9059);
        this.field8890 = var2.method70(-9059);
        this.field8893 = var2.method70(-9059);
    }
}
