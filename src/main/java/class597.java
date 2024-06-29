import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class597 {

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "[B")
    private byte[] field8153;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "[[B")
    private byte[][] field8146;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
    public int field8159;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
    public int field8155;

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
    public int field8160;

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "Lej;")
    public static class124 field8154 = new class124(66, -1);

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V", line = 3)
    public static void method3386(byte arg0) {
        if (arg0 != -76) {
            method3386((byte) 27);
        }
        field8154 = null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([Lmi;ILjava/lang/String;B)Ljava/lang/String;", line = 14)
    public final String method3387(class496[] arg0, int arg1, String arg2, byte arg3) {
        field8156++;
        if (this.method3392(arg2, arg0, false) <= arg1) {
            return arg2;
        }
        int var5 = arg1 - this.method3392("...", null, false);
        int var6 = -1;
        if (arg3 < 54) {
            field8154 = null;
        }
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
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class432.method2626(true, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg0[var14].method1618();
                                    if (var8 > var5) {
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
                    var8 += this.field8153[class299.method1953(var12, false) & 0xFF] & 0xFF;
                    if (this.field8146 != null && var7 != -1) {
                        var8 += this.field8146[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field8146 != null) {
                        var15 = this.field8146[var12][46] + var8;
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

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IBC)I", line = 138)
    public final int method3388(int arg0, byte arg1, char arg2) {
        if (arg1 > -47) {
            field8154 = null;
        }
        field8152++;
        return this.field8146 == null ? 0 : this.field8146[arg0][arg2];
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 153)
    public final int method3389(boolean arg0, String arg1) {
        field8148++;
        if (!arg0) {
            this.method3387(null, 54, null, (byte) 21);
        }
        return this.method3392(arg1, null, false);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BI)I", line = 166)
    public final int method3390(byte arg0, int arg1) {
        field8149++;
        if (arg0 != -48) {
            this.field8146 = null;
        }
        return this.field8153[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([Lmi;IIILjava/lang/String;)I", line = 177)
    public final int method3391(class496[] arg0, int arg1, int arg2, int arg3, String arg4) {
        field8157++;
        if (arg1 == arg2) {
            arg2 = this.field8159;
        }
        int var6 = this.method3394(arg4, new int[] { arg3 }, class463.field6508, (byte) 87, arg0);
        int var7 = (var6 - 1) * arg2;
        return this.field8160 + var7 + this.field8155;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;[Lmi;Z)I", line = 195)
    public final int method3392(String arg0, class496[] arg1, boolean arg2) {
        if (arg2) {
            this.field8160 = 95;
        }
        field8147++;
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
                                    int var11 = class432.method2626(true, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg1[var11].method1618();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field8153[class299.method1953(var9, false) & 0xFF] & 0xFF;
                    if (this.field8146 != null && var5 != -1) {
                        var6 += this.field8146[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;ZI[Lmi;)I", line = 303)
    public final int method3393(String arg0, boolean arg1, int arg2, class496[] arg3) {
        field8151++;
        int var5 = this.method3394(arg0, new int[] { arg2 }, class463.field6508, (byte) 87, arg3);
        int var6 = 0;
        if (arg1) {
            this.field8155 = -58;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method3392(class463.field6508[var7], arg3, false);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;B[Lmi;)I", line = 332)
    public final int method3394(String arg0, int[] arg1, String[] arg2, byte arg3, class496[] arg4) {
        field8145++;
        if (arg3 != 87) {
            this.method3396(null, 80, null, 55);
        }
        if (arg0 == null) {
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
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class299.method1953(arg0.charAt(var15), false) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method3390((byte) -48, var16);
                    var18 = var15;
                    if (this.field8146 != null && var12 != -1) {
                        var17 += this.field8146[var12][var16];
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
                        arg2[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (arg2.length <= var13) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var12 = -1;
                        var6 = 0;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3390((byte) -48, 60);
                        if (this.field8146 != null && var12 != -1) {
                            var17 += this.field8146[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3390((byte) -48, 62);
                        if (this.field8146 != null && var12 != -1) {
                            var17 += this.field8146[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3390((byte) -48, 160);
                        if (this.field8146 != null && var12 != -1) {
                            var17 += this.field8146[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3390((byte) -48, 173);
                        if (this.field8146 != null && var12 != -1) {
                            var17 += this.field8146[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3390((byte) -48, 215);
                        if (this.field8146 != null && var12 != -1) {
                            var17 += this.field8146[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3390((byte) -48, 8364);
                        if (this.field8146 != null && var12 != -1) {
                            var17 += this.field8146[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3390((byte) -48, 169);
                        if (this.field8146 != null && var12 != -1) {
                            var17 += this.field8146[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3390((byte) -48, 174);
                        if (this.field8146 != null && var12 != -1) {
                            var17 += this.field8146[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class432.method2626(true, var19.substring(4));
                            var12 = -1;
                            var17 += arg4[var20].method1618();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg1 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var9 = var6;
                            var8 = var15;
                        }
                        if (arg1[arg1.length > var13 ? var13 : arg1.length - 1] < var6) {
                            if (var8 >= 0) {
                                arg2[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
                            } else {
                                arg2[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg2.length <= var13) {
                                    return 0;
                                }
                                var7 = var18;
                                var12 = -1;
                                var8 = -1;
                                var6 = var17;
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
        if (var7 < arg0.length()) {
            arg2[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)V", line = 582)
    public static final void method3395(int arg0, int arg1) {
        field8158++;
        if (arg0 != -1) {
            field8154 = null;
        }
        class7 var2 = (class7) class581.field7954.method1465((long) arg1, -6008);
        if (var2 != null) {
            var2.field60 = !var2.field60;
            var2.field47.method1908((byte) 116, var2.field60);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([Lmi;ILjava/lang/String;I)I", line = 604)
    public final int method3396(class496[] arg0, int arg1, String arg2, int arg3) {
        field8150++;
        if (arg1 != 1) {
            this.field8159 = -13;
        }
        return this.method3394(arg2, new int[] { arg3 }, class463.field6508, (byte) 87, arg0);
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "([B)V", line = 623)
    public class597(byte[] arg0) {
        class215 var2 = new class215(arg0);
        int var3 = var2.method1535(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1535(255) == 1;
        this.field8153 = new byte[256];
        var2.method1537(Integer.MAX_VALUE, 0, 256, this.field8153);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1535(255);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1535(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1536(-83);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1536(-115);
                    var11[var12][var16] = var15;
                }
            }
            this.field8146 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field8146[var13][var14] = (byte) class616.method3500(this.field8153, -34, var14, var13, var9, var11, var6, var5);
                        }
                    }
                }
            }
            this.field8159 = var6[32] + var5[32];
        } else {
            this.field8159 = var2.method1535(255);
        }
        var2.method1535(255);
        var2.method1535(255);
        this.field8155 = var2.method1535(255);
        this.field8160 = var2.method1535(255);
    }
}
