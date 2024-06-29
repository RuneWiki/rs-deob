import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class274 {

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "[B")
    private byte[] field3436;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "[[B")
    private byte[][] field3431;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "Lhg;")
    public static class693 field3446;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field3445;

    static {
        new class526("", 76);
        field3446 = new class693(55, 4);
        field3447 = 2;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1614(byte arg0) {
        field3442++;
        if (class27.field484 == 7) {
            class98.method785((byte) 38, false);
            return;
        }
        class651.field9061 = class12.field143;
        class12.field143 = null;
        if (arg0 != 83) {
            method1621(-33);
        }
        class571.method3275(27461, 13);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIC)I", line = 25)
    public final int method1615(int arg0, int arg1, char arg2) {
        if (arg0 > -72) {
            this.method1623(95, false);
        }
        field3433++;
        return this.field3431 == null ? 0 : this.field3431[arg1][arg2];
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([Liea;IILjava/lang/String;)I", line = 41)
    public final int method1616(class481[] arg0, int arg1, int arg2, String arg3) {
        if (arg1 != -1) {
            this.method1622(null, null, 52, -24, 82);
        }
        field3437++;
        return this.method1624(arg3, class546.field7617, false, new int[] { arg2 }, arg0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;B[Liea;)Ljava/lang/String;", line = 57)
    public final String method1617(int arg0, String arg1, byte arg2, class481[] arg3) {
        field3440++;
        if (arg0 >= this.method1620(arg1, arg3, -77)) {
            return arg1;
        }
        int var5 = arg0 - this.method1620("...", null, 119);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = 85 / ((52 - arg2) / 33);
        int var10 = arg1.length();
        String var11 = "";
        for (int var12 = 0; var12 < var10; var12++) {
            char var13 = arg1.charAt(var12);
            if (var13 == '<') {
                var6 = var12;
            } else {
                if (var13 == '>' && var6 != -1) {
                    String var14 = arg1.substring(var6 + 1, var12);
                    var6 = -1;
                    if (var14.equals("lt")) {
                        var13 = '<';
                    } else if (var14.equals("gt")) {
                        var13 = '>';
                    } else if (var14.equals("nbsp")) {
                        var13 = ' ';
                    } else if (var14.equals("shy")) {
                        var13 = '\u00AD';
                    } else if (var14.equals("times")) {
                        var13 = '×';
                    } else if (var14.equals("euro")) {
                        var13 = '€';
                    } else if (var14.equals("copy")) {
                        var13 = '©';
                    } else {
                        if (!var14.equals("reg")) {
                            if (var14.startsWith("img=") && arg3 != null) {
                                try {
                                    int var15 = class160.method1124(var14.substring(4), 112);
                                    var8 += arg3[var15].method142();
                                    var7 = -1;
                                    if (var8 > var5) {
                                        return var11 + "...";
                                    }
                                    var11 = arg1.substring(0, var12 + 1);
                                } catch (Exception var17) {
                                }
                            }
                            continue;
                        }
                        var13 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field3436[class518.method3007(true, var13) & 0xFF] & 0xFF;
                    if (this.field3431 != null && var7 != -1) {
                        var8 += this.field3431[var7][var13];
                    }
                    var7 = var13;
                    int var16 = var8;
                    if (this.field3431 != null) {
                        var16 = this.field3431[var13][46] + var8;
                    }
                    if (var5 < var16) {
                        return var11 + "...";
                    }
                    var11 = arg1.substring(0, var12 + 1);
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[Liea;Ljava/lang/String;I)I", line = 181)
    public final int method1618(int arg0, class481[] arg1, String arg2, int arg3) {
        field3445++;
        int var5 = this.method1624(arg2, class546.field7617, false, new int[] { arg0 }, arg1);
        int var6 = 0;
        if (arg3 != 46) {
            field3446 = null;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1620(class546.field7617[var7], arg1, arg3 ^ 0xFFFFFFC3);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 211)
    public final int method1619(boolean arg0, String arg1) {
        if (arg0) {
            this.method1622(null, null, 59, 18, -63);
        }
        field3435++;
        return this.method1620(arg1, null, 110);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;[Liea;I)I", line = 222)
    public final int method1620(String arg0, class481[] arg1, int arg2) {
        field3443++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = 55 % ((arg2 - 57) / 47);
        int var6 = -1;
        int var7 = 0;
        int var8 = arg0.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 == '<') {
                var4 = var9;
            } else {
                if (var10 == '>' && var4 != -1) {
                    String var11 = arg0.substring(var4 + 1, var9);
                    var4 = -1;
                    if (var11.equals("lt")) {
                        var10 = '<';
                    } else if (var11.equals("gt")) {
                        var10 = '>';
                    } else if (var11.equals("nbsp")) {
                        var10 = ' ';
                    } else if (var11.equals("shy")) {
                        var10 = '\u00AD';
                    } else if (var11.equals("times")) {
                        var10 = '×';
                    } else if (var11.equals("euro")) {
                        var10 = '€';
                    } else if (var11.equals("copy")) {
                        var10 = '©';
                    } else {
                        if (!var11.equals("reg")) {
                            if (var11.startsWith("img=") && arg1 != null) {
                                try {
                                    int var12 = class160.method1124(var11.substring(4), 120);
                                    var7 += arg1[var12].method142();
                                    var6 = -1;
                                } catch (Exception var13) {
                                }
                            }
                            continue;
                        }
                        var10 = '®';
                    }
                }
                if (var4 == -1) {
                    var7 += this.field3436[class518.method3007(true, var10) & 0xFF] & 0xFF;
                    if (this.field3431 != null && var6 != -1) {
                        var7 += this.field3431[var6][var10];
                    }
                    var6 = var10;
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 325)
    public static void method1621(int arg0) {
        if (arg0 != 255) {
            field3446 = null;
        }
        field3446 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([Liea;Ljava/lang/String;III)I", line = 343)
    public final int method1622(class481[] arg0, String arg1, int arg2, int arg3, int arg4) {
        field3441++;
        if (arg4 == 0) {
            arg4 = this.field3444;
        }
        int var6 = this.method1624(arg1, class546.field7617, false, new int[] { arg2 }, arg0);
        if (arg3 <= 64) {
            return -35;
        } else {
            int var7 = (var6 - 1) * arg4;
            return this.field3432 + var7 + this.field3434;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)I", line = 362)
    public final int method1623(int arg0, boolean arg1) {
        field3439++;
        if (!arg1) {
            this.field3432 = -76;
        }
        return this.field3436[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;Z[I[Liea;)I", line = 376)
    public final int method1624(String arg0, String[] arg1, boolean arg2, int[] arg3, class481[] arg4) {
        field3438++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        if (arg2) {
            this.method1617(-127, null, (byte) 80, null);
        }
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class518.method3007(!arg2, arg0.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method1623(var16, !arg2);
                    if (this.field3431 != null && var12 != -1) {
                        var17 += this.field3431[var12][var16];
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
                        arg1[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var8 = -1;
                        var12 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1623(60, true);
                        if (this.field3431 != null && var12 != -1) {
                            var17 += this.field3431[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1623(62, !arg2);
                        if (this.field3431 != null && var12 != -1) {
                            var17 += this.field3431[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1623(160, !arg2);
                        if (this.field3431 != null && var12 != -1) {
                            var17 += this.field3431[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1623(173, true);
                        if (this.field3431 != null && var12 != -1) {
                            var17 += this.field3431[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1623(215, !arg2);
                        if (this.field3431 != null && var12 != -1) {
                            var17 += this.field3431[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1623(8364, true);
                        if (this.field3431 != null && var12 != -1) {
                            var17 += this.field3431[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1623(169, true);
                        if (this.field3431 != null && var12 != -1) {
                            var17 += this.field3431[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1623(174, true);
                        if (this.field3431 != null && var12 != -1) {
                            var17 += this.field3431[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class160.method1124(var19.substring(4), 124);
                            var17 += arg4[var20].method142();
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
                            var10 = 1;
                            var9 = var6;
                            var8 = var15;
                        }
                        if (var6 > arg3[var13 >= arg3.length ? arg3.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg1[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var12 = -1;
                                var7 = var18;
                                var8 = -1;
                                var6 = var17;
                            } else {
                                arg1[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
                                var8 = -1;
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
            arg1[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "([B)V", line = 627)
    public class274(byte[] arg0) {
        class461 var2 = new class461(arg0);
        int var3 = var2.method2600((byte) -124);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2600((byte) -127) == 1;
        this.field3436 = new byte[256];
        var2.method2573(this.field3436, (byte) -77, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2600((byte) -123);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2600((byte) -125);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2601(0);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2601(0);
                    var11[var12][var16] = var15;
                }
            }
            this.field3431 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field3431[var13][var14] = (byte) class379.method2166(var13, 104, var6, var5, this.field3436, var11, var9, var14);
                        }
                    }
                }
            }
            this.field3444 = var5[32] + var6[32];
        } else {
            this.field3444 = var2.method2600((byte) -124);
        }
        var2.method2600((byte) -125);
        var2.method2600((byte) -124);
        this.field3432 = var2.method2600((byte) -123);
        this.field3434 = var2.method2600((byte) -125);
    }
}
