import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class76 {

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "[B")
    private byte[] field1149;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "[[B")
    private byte[][] field1153;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Lfn;")
    public static class52 field1152 = new class52(54, -2);

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;II[Laq;I)I", line = 6)
    public final int method519(String arg0, int arg1, int arg2, class385[] arg3, int arg4) {
        if (arg2 == 0) {
            arg2 = this.field1150;
        }
        field1151++;
        int var6 = this.method521(arg3, arg0, new int[] { arg4 }, class468.field6566, (byte) 26);
        int var7 = (var6 - 1) * arg2;
        return arg1 == -16019 ? this.field1156 + var7 + this.field1148 : -77;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I", line = 24)
    public final int method520(int arg0, int arg1) {
        if (arg0 != -24356) {
            this.method522(101, (String) null);
        }
        field1159++;
        return this.field1149[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "([Laq;Ljava/lang/String;[I[Ljava/lang/String;B)I", line = 35)
    public final int method521(class385[] arg0, String arg1, int[] arg2, String[] arg3, byte arg4) {
        if (arg4 != 26) {
            return 106;
        }
        field1155++;
        if (arg1 == null) {
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
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class161.method977((byte) -113, arg1.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method520(-24356, var16);
                    if (this.field1153 != null && var12 != -1) {
                        var17 += this.field1153[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg1.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg3[var13] = arg1.substring(var7, var15 + 1);
                        var13++;
                        if (arg3.length <= var13) {
                            return 0;
                        }
                        var6 = 0;
                        var8 = -1;
                        var12 = -1;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method520(-24356, 60);
                        if (this.field1153 != null && var12 != -1) {
                            var17 += this.field1153[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method520(-24356, 62);
                        if (this.field1153 != null && var12 != -1) {
                            var17 += this.field1153[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method520(-24356, 160);
                        if (this.field1153 != null && var12 != -1) {
                            var17 += this.field1153[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method520(-24356, 173);
                        if (this.field1153 != null && var12 != -1) {
                            var17 += this.field1153[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method520(arg4 - 24382, 215);
                        if (this.field1153 != null && var12 != -1) {
                            var17 += this.field1153[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method520(-24356, 8364);
                        if (this.field1153 != null && var12 != -1) {
                            var17 += this.field1153[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method520(-24356, 169);
                        if (this.field1153 != null && var12 != -1) {
                            var17 += this.field1153[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method520(-24356, 174);
                        if (this.field1153 != null && var12 != -1) {
                            var17 += this.field1153[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class168.method1039(var19.substring(4), false);
                            var12 = -1;
                            var17 += arg0[var20].method382();
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
                        if (arg2[arg2.length <= var13 ? arg2.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg3[var13] = arg1.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg3[var13] = arg1.substring(var7, var18);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var7 = var18;
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
        if (arg1.length() > var7) {
            arg3[var13] = arg1.substring(var7, arg1.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILjava/lang/String;)I", line = 286)
    public final int method522(int arg0, String arg1) {
        field1158++;
        int var3 = -35 / ((arg0 + 55) / 44);
        return this.method524((class385[]) null, arg1, 119);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 302)
    public static void method523(int arg0) {
        field1152 = null;
        if (arg0 != 0) {
            field1161 = -52;
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "([B)V", line = 317)
    public class76(byte[] arg0) {
        class425 var2 = new class425(arg0);
        int var3 = var2.method2503(true);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2503(true) == 1;
        this.field1149 = new byte[256];
        var2.method2507(this.field1149, (byte) 118, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2503(true);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2503(true);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2480(-8315);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2480(-8315);
                    var11[var12][var16] = var15;
                }
            }
            this.field1153 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field1153[var13][var14] = (byte) class167.method1025(var11, this.field1149, var7, var5, var14, var13, var9, (byte) 124);
                        }
                    }
                }
            }
            this.field1150 = var5[32] + var7[32];
        } else {
            this.field1150 = var2.method2503(true);
        }
        var2.method2503(true);
        var2.method2503(true);
        this.field1156 = var2.method2503(true);
        this.field1148 = var2.method2503(true);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "([Laq;Ljava/lang/String;I)I", line = 451)
    public final int method524(class385[] arg0, String arg1, int arg2) {
        field1154++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        if (arg2 < 37) {
            return -41;
        }
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class168.method1039(var10.substring(4), false);
                                    var5 = -1;
                                    var6 += arg0[var11].method382();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field1149[class161.method977((byte) -63, var9) & 0xFF] & 0xFF;
                    if (this.field1153 != null && var5 != -1) {
                        var6 += this.field1153[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;IB[Laq;)I", line = 556)
    public final int method525(String arg0, int arg1, byte arg2, class385[] arg3) {
        int var5 = -104 % ((arg2 + 60) / 44);
        field1162++;
        return this.method521(arg3, arg0, new int[] { arg1 }, class468.field6566, (byte) 26);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ICB)I", line = 566)
    public final int method526(int arg0, char arg1, byte arg2) {
        int var4 = -45 / ((-arg2 - 18) / 55);
        field1157++;
        return this.field1153 == null ? 0 : this.field1153[arg0][arg1];
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;II[Laq;)I", line = 580)
    public final int method527(String arg0, int arg1, int arg2, class385[] arg3) {
        field1160++;
        int var5 = this.method521(arg3, arg0, new int[] { arg1 }, class468.field6566, (byte) 26);
        if (arg2 != 255) {
            field1161 = -87;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method524(arg3, class468.field6566[var7], 124);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }
}
