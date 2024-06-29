import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class300 {

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "[B")
    private byte[] field4350;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public int field4362;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "[[B")
    private byte[][] field4361;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public int field4355;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "Z")
    public static boolean field4359 = false;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "[I")
    public static int[] field4364 = new int[6];

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "D")
    public static double field4368;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "[I")
    public static int[] field4352;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)I")
    public final int method1952(int arg0, int arg1) {
        field4353++;
        if (arg0 != 0) {
            field4364 = null;
        }
        return this.field4350[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method1953(String arg0, byte arg1) {
        int var3 = 120 / ((arg1 + 6) / 40);
        field4367++;
        return this.method1956(null, arg0, false);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZLjava/lang/String;II[Lho;)I")
    public final int method1954(boolean arg0, String arg1, int arg2, int arg3, class318[] arg4) {
        if (arg3 == 0) {
            arg3 = this.field4362;
        }
        field4357++;
        int var6 = this.method1955(arg4, class235.field3533, arg1, new int[] { arg2 }, arg0);
        int var7 = (var6 - 1) * arg3;
        return this.field4363 + var7 + this.field4355;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "([Lho;[Ljava/lang/String;Ljava/lang/String;[IZ)I")
    public final int method1955(class318[] arg0, String[] arg1, String arg2, int[] arg3, boolean arg4) {
        field4351++;
        if (arg2 == null) {
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
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class253.method1695(arg2.charAt(var15), -8231) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method1952(0, var16);
                    if (this.field4361 != null && var12 != -1) {
                        var17 += this.field4361[var12][var16];
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
                        arg1[var13] = arg2.substring(var7, var15 + 1);
                        var13++;
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var6 = 0;
                        var8 = -1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1952(0, 60);
                        if (this.field4361 != null && var12 != -1) {
                            var17 += this.field4361[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1952(0, 62);
                        if (this.field4361 != null && var12 != -1) {
                            var17 += this.field4361[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1952(0, 160);
                        if (this.field4361 != null && var12 != -1) {
                            var17 += this.field4361[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1952(0, 173);
                        if (this.field4361 != null && var12 != -1) {
                            var17 += this.field4361[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1952(0, 215);
                        if (this.field4361 != null && var12 != -1) {
                            var17 += this.field4361[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1952(0, 8364);
                        if (this.field4361 != null && var12 != -1) {
                            var17 += this.field4361[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1952(0, 169);
                        if (this.field4361 != null && var12 != -1) {
                            var17 += this.field4361[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1952(0, 174);
                        if (this.field4361 != null && var12 != -1) {
                            var17 += this.field4361[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class157.method1014(var19.substring(4), -14534);
                            var12 = -1;
                            var17 += arg0[var20].method749();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg3 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg3[arg3.length <= var13 ? arg3.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg1[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
                                var8 = -1;
                            } else {
                                arg1[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var7 = var18;
                                var6 = var17;
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
        if (arg4) {
            this.field4363 = -2;
        }
        if (arg2.length() > var7) {
            arg1[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "([Lho;Ljava/lang/String;Z)I")
    public final int method1956(class318[] arg0, String arg1, boolean arg2) {
        field4365++;
        if (arg2) {
            this.method1954(true, null, -4, -116, null);
        }
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class157.method1014(var10.substring(4), -14534);
                                    var6 += arg0[var11].method749();
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
                    var6 += this.field4350[class253.method1695(var9, -8231) & 0xFF] & 0xFF;
                    if (this.field4361 != null && var5 != -1) {
                        var6 += this.field4361[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[Lho;Ljava/lang/String;)I")
    public final int method1957(int arg0, int arg1, class318[] arg2, String arg3) {
        field4354++;
        int var5 = this.method1955(arg2, class235.field3533, arg3, new int[] { arg1 }, false);
        int var6 = 0;
        for (int var7 = arg0; var7 < var5; var7++) {
            int var8 = this.method1956(arg2, class235.field3533[var7], false);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILgs;)V")
    public static final void method1958(int arg0, class432 arg1) {
        field4349++;
        int var2 = 0;
        arg1.method2590((byte) 127);
        for (int var3 = 0; var3 < class783.field10748; var3++) {
            int var15 = class244.field3610[var3];
            if ((class148.field1942[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class148.field1942[var15] = (byte) class613.method3544(class148.field1942[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method2591(-30, 1);
                    if (var16 == 0) {
                        var2 = class330.method2081(arg1, (byte) -59);
                        class148.field1942[var15] = (byte) class613.method3544(class148.field1942[var15], 2);
                    } else {
                        class629.method3614(111, var15, arg1);
                    }
                }
            }
        }
        if (arg0 <= 76) {
            method1961(-30);
        }
        arg1.method2596((byte) -33);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2590((byte) 127);
        for (int var4 = 0; var4 < class783.field10748; var4++) {
            int var13 = class244.field3610[var4];
            if ((class148.field1942[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class148.field1942[var13] = (byte) class613.method3544(class148.field1942[var13], 2);
                } else {
                    int var14 = arg1.method2591(-30, 1);
                    if (var14 == 0) {
                        var2 = class330.method2081(arg1, (byte) -61);
                        class148.field1942[var13] = (byte) class613.method3544(class148.field1942[var13], 2);
                    } else {
                        class629.method3614(107, var13, arg1);
                    }
                }
            }
        }
        arg1.method2596((byte) -33);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2590((byte) 127);
        for (int var5 = 0; var5 < class169.field2154; var5++) {
            int var11 = class172.field2189[var5];
            if ((class148.field1942[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class148.field1942[var11] = (byte) class613.method3544(class148.field1942[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method2591(-30, 1);
                    if (var12 == 0) {
                        var2 = class330.method2081(arg1, (byte) -62);
                        class148.field1942[var11] = (byte) class613.method3544(class148.field1942[var11], 2);
                    } else if (class455.method2744(var11, 805306368, arg1)) {
                        class148.field1942[var11] = (byte) class613.method3544(class148.field1942[var11], 2);
                    }
                }
            }
        }
        arg1.method2596((byte) -33);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2590((byte) 127);
        for (int var6 = 0; var6 < class169.field2154; var6++) {
            int var9 = class172.field2189[var6];
            if ((class148.field1942[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class148.field1942[var9] = (byte) class613.method3544(class148.field1942[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method2591(-30, 1);
                    if (var10 == 0) {
                        var2 = class330.method2081(arg1, (byte) -50);
                        class148.field1942[var9] = (byte) class613.method3544(class148.field1942[var9], 2);
                    } else if (class455.method2744(var9, 805306368, arg1)) {
                        class148.field1942[var9] = (byte) class613.method3544(class148.field1942[var9], 2);
                    }
                }
            }
        }
        arg1.method2596((byte) -33);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class783.field10748 = 0;
        class169.field2154 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class148.field1942[var7] = (byte) (class148.field1942[var7] >> 1);
            class723 var8 = class413.field5787[var7];
            if (var8 == null) {
                class172.field2189[class169.field2154++] = var7;
            } else {
                class244.field3610[class783.field10748++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "([Lho;IILjava/lang/String;)Ljava/lang/String;")
    public final String method1959(class318[] arg0, int arg1, int arg2, String arg3) {
        field4358++;
        if (arg2 >= this.method1956(arg0, arg3, false)) {
            return arg3;
        }
        int var5 = arg2 - this.method1956(null, "...", false);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg3.length();
        String var10 = "";
        if (arg1 != 46) {
            field4352 = null;
        }
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg3.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg3.substring(var6 + 1, var11);
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
                                    int var14 = class157.method1014(var13.substring(4), -14534);
                                    var7 = -1;
                                    var8 += arg0[var14].method749();
                                    if (var8 > var5) {
                                        return var10 + "...";
                                    }
                                    var10 = arg3.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field4350[class253.method1695(var12, -8231) & 0xFF] & 0xFF;
                    if (this.field4361 != null && var7 != -1) {
                        var8 += this.field4361[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field4361 != null) {
                        var15 = this.field4361[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg3.substring(0, var11 + 1);
                }
            }
        }
        return arg3;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILjava/lang/String;I[Lho;)I")
    public final int method1960(int arg0, String arg1, int arg2, class318[] arg3) {
        field4366++;
        if (arg2 > -81) {
            this.method1962(99, (char) 65517, -105);
        }
        return this.method1955(arg3, class235.field3533, arg1, new int[] { arg0 }, false);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public static void method1961(int arg0) {
        if (arg0 >= -97) {
            method1958(-51, null);
        }
        field4352 = null;
        field4364 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ICI)I")
    public final int method1962(int arg0, char arg1, int arg2) {
        field4360++;
        if (arg2 == 169) {
            return this.field4361 == null ? 0 : this.field4361[arg0][arg1];
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "([B)V")
    public class300(byte[] arg0) {
        class511 var2 = new class511(arg0);
        int var3 = var2.method3013(54);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3013(-127) == 1;
        this.field4350 = new byte[256];
        var2.method3014(256, this.field4350, 75212712, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method3013(114);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method3013(81);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3030(-25984);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3030(-25984);
                    var11[var12][var16] = var15;
                }
            }
            this.field4361 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4361[var13][var14] = (byte) class399.method2452(var14, (byte) -80, var11, var6, this.field4350, var9, var5, var13);
                        }
                    }
                }
            }
            this.field4362 = var6[32] + var5[32];
        } else {
            this.field4362 = var2.method3013(-92);
        }
        var2.method3013(48);
        var2.method3013(-103);
        this.field4363 = var2.method3013(-102);
        this.field4355 = var2.method3013(-94);
    }
}
