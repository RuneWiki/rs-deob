import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class194 {

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[B")
    private byte[] field2887;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "[[B")
    private byte[][] field2889;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Leo;")
    public static class443 field2885 = new class443(14, -1);

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "[I")
    public static int[] field2893 = new int[14];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lrn;Ljava/lang/String;ZI)I", line = 4)
    public final int method1350(class417[] arg0, String arg1, boolean arg2, int arg3) {
        field2891++;
        int var5 = this.method1353(new int[] { arg3 }, client.field874, arg0, (byte) 97, arg1);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1352(client.field874[var7], arg0, (byte) 67);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        if (!arg2) {
            field2894 = 103;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;B[Lrn;I)I", line = 32)
    public final int method1351(int arg0, String arg1, byte arg2, class417[] arg3, int arg4) {
        if (arg2 <= 19) {
            this.method1355((char) 65486, 42, (byte) 51);
        }
        if (arg0 == 0) {
            arg0 = this.field2890;
        }
        field2881++;
        int var6 = this.method1353(new int[] { arg4 }, client.field874, arg3, (byte) 86, arg1);
        int var7 = (var6 - 1) * arg0;
        return this.field2888 + var7 + this.field2883;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;[Lrn;B)I", line = 50)
    public final int method1352(String arg0, class417[] arg1, byte arg2) {
        field2882++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        if (arg2 < 40) {
            return 59;
        }
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
                                    int var11 = class270.method1827(var10.substring(4), false);
                                    var5 = -1;
                                    var6 += arg1[var11].method1294();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field2887[class187.method1324((byte) 110, var9) & 0xFF] & 0xFF;
                    if (this.field2889 != null && var5 != -1) {
                        var6 += this.field2889[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([I[Ljava/lang/String;[Lrn;BLjava/lang/String;)I", line = 154)
    public final int method1353(int[] arg0, String[] arg1, class417[] arg2, byte arg3, String arg4) {
        if (arg3 <= 68) {
            this.field2889 = null;
        }
        field2886++;
        if (arg4 == null) {
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
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class187.method1324((byte) 110, arg4.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method1356(var16, 215);
                    if (this.field2889 != null && var12 != -1) {
                        var17 += this.field2889[var12][var16];
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
                        arg1[var13] = arg4.substring(var7, var15 + 1);
                        var13++;
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var6 = 0;
                        var8 = -1;
                        var12 = -1;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1356(60, 215);
                        if (this.field2889 != null && var12 != -1) {
                            var17 += this.field2889[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1356(62, 215);
                        if (this.field2889 != null && var12 != -1) {
                            var17 += this.field2889[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1356(160, 215);
                        if (this.field2889 != null && var12 != -1) {
                            var17 += this.field2889[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1356(173, 215);
                        if (this.field2889 != null && var12 != -1) {
                            var17 += this.field2889[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1356(215, 215);
                        if (this.field2889 != null && var12 != -1) {
                            var17 += this.field2889[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1356(8364, 215);
                        if (this.field2889 != null && var12 != -1) {
                            var17 += this.field2889[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1356(169, 215);
                        if (this.field2889 != null && var12 != -1) {
                            var17 += this.field2889[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1356(174, 215);
                        if (this.field2889 != null && var12 != -1) {
                            var17 += this.field2889[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class270.method1827(var19.substring(4), false);
                            var17 += arg2[var20].method1294();
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
                            var8 = var15;
                            var10 = 1;
                            var9 = var6;
                        }
                        if (var6 > arg0[var13 >= arg0.length ? arg0.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg1[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
                            } else {
                                arg1[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var6 = var17;
                                var7 = var18;
                                var8 = -1;
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
        if (arg4.length() > var7) {
            arg1[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/lang/String;)I", line = 407)
    public final int method1354(byte arg0, String arg1) {
        field2878++;
        if (arg0 > -53) {
            this.method1351(-128, (String) null, (byte) -63, (class417[]) null, -41);
        }
        return this.method1352(arg1, (class417[]) null, (byte) 97);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(CIB)I", line = 428)
    public final int method1355(char arg0, int arg1, byte arg2) {
        field2880++;
        if (arg2 < 38) {
            this.method1354((byte) -108, (String) null);
        }
        return this.field2889 == null ? 0 : this.field2889[arg1][arg0];
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I", line = 443)
    public final int method1356(int arg0, int arg1) {
        field2892++;
        return arg1 == 215 ? this.field2887[arg0] & 0xFF : -81;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lrn;BLjava/lang/String;I)I", line = 462)
    public final int method1357(class417[] arg0, byte arg1, String arg2, int arg3) {
        field2884++;
        if (arg1 < 101) {
            this.method1353((int[]) null, (String[]) null, (class417[]) null, (byte) 8, (String) null);
        }
        return this.method1353(new int[] { arg3 }, client.field874, arg0, (byte) 124, arg2);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 477)
    public static void method1358(int arg0) {
        field2885 = null;
        if (arg0 != 173) {
            field2885 = null;
        }
        field2893 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([B)V", line = 488)
    public class194(byte[] arg0) {
        class161 var2 = new class161(arg0);
        int var3 = var2.method1172((byte) -115);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1172((byte) -109) == 1;
        this.field2887 = new byte[256];
        var2.method1179(256, 0, this.field2887, false);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1172((byte) -117);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1172((byte) -126);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1152(-1910700904);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1152(-1910700904);
                    var11[var12][var16] = var15;
                }
            }
            this.field2889 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2889[var13][var14] = (byte) class209.method1426(var9, var13, var11, this.field2887, var5, var14, (byte) -27, var6);
                        }
                    }
                }
            }
            this.field2890 = var5[32] + var6[32];
        } else {
            this.field2890 = var2.method1172((byte) -13);
        }
        var2.method1172((byte) -112);
        var2.method1172((byte) 116);
        this.field2888 = var2.method1172((byte) -121);
        this.field2883 = var2.method1172((byte) -120);
    }
}
