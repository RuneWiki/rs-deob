import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class145 {

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[B")
    private byte[] field2446;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[[B")
    private byte[][] field2436;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Z[I[Lnf;[Ljava/lang/String;)I", line = 3)
    public final int method1163(String arg0, boolean arg1, int[] arg2, class604[] arg3, String[] arg4) {
        field2449++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (!arg1) {
            this.method1163(null, true, null, null, null);
        }
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class687.method3863(arg0.charAt(var15), (byte) 57) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method1171(-1, var16);
                    var18 = var15;
                    if (this.field2436 != null && var12 != -1) {
                        var17 += this.field2436[var12][var16];
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
                        if (arg4.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var7 = var15 + 1;
                        var12 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1171(-1, 60);
                        if (this.field2436 != null && var12 != -1) {
                            var17 += this.field2436[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1171(-1, 62);
                        if (this.field2436 != null && var12 != -1) {
                            var17 += this.field2436[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1171(-1, 160);
                        if (this.field2436 != null && var12 != -1) {
                            var17 += this.field2436[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1171(-1, 173);
                        if (this.field2436 != null && var12 != -1) {
                            var17 += this.field2436[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1171(-1, 215);
                        if (this.field2436 != null && var12 != -1) {
                            var17 += this.field2436[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1171(-1, 8364);
                        if (this.field2436 != null && var12 != -1) {
                            var17 += this.field2436[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1171(-1, 169);
                        if (this.field2436 != null && var12 != -1) {
                            var17 += this.field2436[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1171(-1, 174);
                        if (this.field2436 != null && var12 != -1) {
                            var17 += this.field2436[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class287.method1832(-113, var19.substring(4));
                            var17 += arg3[var20].method224();
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
                            var10 = 1;
                            var8 = var15;
                            var9 = var6;
                        }
                        if (arg2[arg2.length <= var13 ? arg2.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg4[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg4[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var7 = var18;
                                var12 = -1;
                                var6 = var17;
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
        if (var7 < arg0.length()) {
            arg4[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;I[Lnf;)I", line = 258)
    public final int method1164(String arg0, int arg1, class604[] arg2) {
        field2442++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg1 != 455) {
            this.field2434 = 43;
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
                            if (var10.startsWith("img=") && arg2 != null) {
                                try {
                                    int var11 = class287.method1832(-108, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg2[var11].method224();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field2446[class687.method3863(var9, (byte) -115) & 0xFF] & 0xFF;
                    if (this.field2436 != null && var5 != -1) {
                        var6 += this.field2436[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([Lnf;ILjava/lang/String;II)I", line = 363)
    public final int method1165(class604[] arg0, int arg1, String arg2, int arg3, int arg4) {
        field2441++;
        if (arg1 == arg3) {
            arg1 = this.field2447;
        }
        int var6 = this.method1163(arg2, true, new int[] { arg4 }, arg0, class502.field6867);
        int var7 = (var6 - 1) * arg1;
        return this.field2444 + var7 + this.field2434;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI[Lnf;Ljava/lang/String;)I", line = 379)
    public final int method1166(byte arg0, int arg1, class604[] arg2, String arg3) {
        field2435++;
        int var5 = this.method1163(arg3, true, new int[] { arg1 }, arg2, class502.field6867);
        if (arg0 < 78) {
            this.field2436 = null;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1164(class502.field6867[var7], 455, arg2);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIC)I", line = 409)
    public final int method1167(int arg0, int arg1, char arg2) {
        field2445++;
        if (arg0 >= -33) {
            this.method1173(null, -43, -20, null);
        }
        return this.field2436 == null ? 0 : this.field2436[arg1][arg2];
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIBLuv;II)V", line = 424)
    public static final void method1168(int arg0, int arg1, int arg2, byte arg3, class385 arg4, int arg5, int arg6) {
        if (arg3 != 93) {
            method1170(null, (byte) -39);
        }
        field2437++;
        class549.method3084(arg0, arg5, arg2, arg4.field7398, -5, arg4.field7391, 0, arg1, arg4.field7396, arg6);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILjava/lang/String;[Lnf;)Ljava/lang/String;", line = 437)
    public final String method1169(int arg0, int arg1, String arg2, class604[] arg3) {
        field2448++;
        if (arg0 >= this.method1164(arg2, 455, arg3)) {
            return arg2;
        }
        int var5 = arg0 - this.method1164("...", 455, null);
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
                                    int var14 = class287.method1832(-110, var13.substring(4));
                                    var8 += arg3[var14].method224();
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
                    var8 += this.field2446[class687.method3863(var12, (byte) 81) & 0xFF] & 0xFF;
                    if (this.field2436 != null && var7 != -1) {
                        var8 += this.field2436[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field2436 != null) {
                        var15 = this.field2436[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        if (arg1 != -61) {
            this.method1163(null, false, null, null, null);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lfca;B)Luu;", line = 565)
    public static final class303 method1170(class93 arg0, byte arg1) {
        field2443++;
        return arg1 > -41 ? null : new class303(arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method767((byte) -119), arg0.method793((byte) 84));
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I", line = 576)
    public final int method1171(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field2447 = 80;
        }
        field2439++;
        return this.field2446[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 589)
    public final int method1172(String arg0, byte arg1) {
        if (arg1 <= 28) {
            this.method1173(null, -61, -4, null);
        }
        field2440++;
        return this.method1164(arg0, 455, null);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;II[Lnf;)I", line = 602)
    public final int method1173(String arg0, int arg1, int arg2, class604[] arg3) {
        field2438++;
        return arg2 == 174 ? this.method1163(arg0, true, new int[] { arg1 }, arg3, class502.field6867) : 15;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V", line = 612)
    public class145(byte[] arg0) {
        class93 var2 = new class93(arg0);
        int var3 = var2.method793((byte) 108);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method793((byte) 105) == 1;
        this.field2446 = new byte[256];
        var2.method737(-32768, this.field2446, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method793((byte) 101);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method793((byte) 10);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method766((byte) 122);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method766((byte) 122);
                    var11[var12][var16] = var15;
                }
            }
            this.field2436 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2436[var13][var14] = (byte) class738.method4092(var13, var7, var11, (byte) 106, var14, var5, var9, this.field2446);
                        }
                    }
                }
            }
            this.field2447 = var7[32] + var5[32];
        } else {
            this.field2447 = var2.method793((byte) 99);
        }
        var2.method793((byte) 35);
        var2.method793((byte) 75);
        this.field2444 = var2.method793((byte) 58);
        this.field2434 = var2.method793((byte) 109);
    }
}
