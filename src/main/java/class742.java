import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class742 {

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "[B")
    private byte[] field10346;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "[[B")
    private byte[][] field10347;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public int field10344;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public int field10332;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public int field10338;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Lqk;")
    public static class148 field10342 = new class148(5, 8);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field10331;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field10334;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field10335;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field10336;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field10337;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field10339;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field10340;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field10341;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field10343;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field10345;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(JLpaa;IIIIIILaa;)V")
    public static final void method4132(long arg0, class712 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class571 arg8) {
        field10343++;
        if (arg6 != -24870) {
            return;
        }
        int var10 = arg5 * arg5 + (arg4 * arg4);
        if (arg0 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg1.field9966 / 2, arg1.field10011 / 2);
        if ((var11 * var11) >= var10) {
            class615.method3608(class611.field8687[arg3], (byte) 67, arg5, arg7, arg4, arg8, arg2, arg1);
            return;
        }
        var11 -= 10;
        int var12;
        if (class665.field9377 == 4) {
            var12 = (int) class403.field5597 & 0x3FFF;
        } else {
            var12 = (int) class403.field5597 + class732.field10234 & 0x3FFF;
        }
        int var13 = class231.field3217[var12];
        int var14 = class231.field3218[var12];
        if (class665.field9377 != 4) {
            var14 = var14 * 256 / (class592.field8541 + 256);
            var13 = var13 * 256 / (class592.field8541 + 256);
        }
        int var15 = arg4 * var13 + arg5 * var14 >> 14;
        int var16 = arg4 * var14 - (arg5 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class488.field6573[arg3].method112((float) arg1.field9966 / 2.0F + (float) arg7 + (float) var19, (float) arg1.field10011 / 2.0F + (float) arg2 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;I[Lcw;)I")
    public final int method4133(int arg0, String arg1, int arg2, class21[] arg3) {
        field10336++;
        int var5 = this.method4141(arg1, -123, class746.field10388, arg3, new int[] { arg0 });
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var9 = this.method4140(1, class746.field10388[var7], arg3);
            if (var9 > var6) {
                var6 = var9;
            }
        }
        int var8 = -108 / ((arg2 - 44) / 37);
        return var6;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method4134(byte arg0, String arg1) {
        field10331++;
        int var3 = -73 % ((arg0 - 7) / 45);
        return this.method4140(1, arg1, null);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)I")
    public final int method4135(int arg0, int arg1) {
        if (arg0 != 255) {
            this.field10338 = 17;
        }
        field10333++;
        return this.field10346[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIBLjava/lang/String;[Lcw;)I")
    public final int method4136(int arg0, int arg1, byte arg2, String arg3, class21[] arg4) {
        field10341++;
        if (arg0 == 0) {
            arg0 = this.field10344;
        }
        if (arg2 != -48) {
            this.field10332 = 1;
        }
        int var6 = this.method4141(arg3, arg2 ^ 0x43, class746.field10388, arg4, new int[] { arg1 });
        int var7 = (var6 - 1) * arg0;
        return this.field10338 + var7 + this.field10332;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "([Lcw;ILjava/lang/String;I)I")
    public final int method4137(class21[] arg0, int arg1, String arg2, int arg3) {
        if (arg1 == -8629) {
            field10339++;
            return this.method4141(arg2, -101, class746.field10388, arg0, new int[] { arg3 });
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ICI)I")
    public final int method4138(int arg0, char arg1, int arg2) {
        if (arg0 > -78) {
            return -25;
        } else {
            field10335++;
            return this.field10347 == null ? 0 : this.field10347[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;[Lcw;IB)Ljava/lang/String;")
    public final String method4139(String arg0, class21[] arg1, int arg2, byte arg3) {
        field10334++;
        if (arg2 >= this.method4140(1, arg0, arg1)) {
            return arg0;
        }
        int var5 = arg2 - this.method4140(1, "...", null);
        int var6 = -1;
        int var7 = -1;
        if (arg3 >= -86) {
            return null;
        }
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
                                    int var14 = class665.method3815(var13.substring(4), -126);
                                    var8 += arg1[var14].method116();
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
                    var8 += this.field10346[class228.method1474(var12, true) & 0xFF] & 0xFF;
                    if (this.field10347 != null && var7 != -1) {
                        var8 += this.field10347[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field10347 != null) {
                        var15 = this.field10347[var12][46] + var8;
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

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;[Lcw;)I")
    public final int method4140(int arg0, String arg1, class21[] arg2) {
        field10348++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        int var8 = 0;
        if (arg0 != 1) {
            this.method4134((byte) 80, null);
        }
        while (var7 > var8) {
            char var9 = arg1.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                label78: {
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
                                        int var11 = class665.method3815(var10.substring(4), arg0 - 128);
                                        var6 += arg2[var11].method116();
                                        var5 = -1;
                                    } catch (Exception var12) {
                                    }
                                }
                                break label78;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field10346[class228.method1474(var9, true) & 0xFF] & 0xFF;
                        if (this.field10347 != null && var5 != -1) {
                            var6 += this.field10347[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            var8++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/String;[Lcw;[I)I")
    public final int method4141(String arg0, int arg1, String[] arg2, class21[] arg3, int[] arg4) {
        field10337++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        if (arg1 > -82) {
            this.field10344 = 72;
        }
        int var12 = -1;
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class228.method1474(arg0.charAt(var15), true) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method4135(255, var16);
                    var18 = var15;
                    if (this.field10347 != null && var12 != -1) {
                        var17 += this.field10347[var12][var16];
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
                        var12 = -1;
                        var8 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method4135(255, 60);
                        if (this.field10347 != null && var12 != -1) {
                            var17 += this.field10347[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method4135(255, 62);
                        if (this.field10347 != null && var12 != -1) {
                            var17 += this.field10347[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method4135(255, 160);
                        if (this.field10347 != null && var12 != -1) {
                            var17 += this.field10347[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method4135(255, 173);
                        if (this.field10347 != null && var12 != -1) {
                            var17 += this.field10347[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method4135(255, 215);
                        if (this.field10347 != null && var12 != -1) {
                            var17 += this.field10347[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method4135(255, 8364);
                        if (this.field10347 != null && var12 != -1) {
                            var17 += this.field10347[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method4135(255, 169);
                        if (this.field10347 != null && var12 != -1) {
                            var17 += this.field10347[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method4135(255, 174);
                        if (this.field10347 != null && var12 != -1) {
                            var17 += this.field10347[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class665.method3815(var19.substring(4), -126);
                            var12 = -1;
                            var17 += arg3[var20].method116();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg4 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var8 = var15;
                            var9 = var6;
                        }
                        if (var6 > arg4[arg4.length <= var13 ? arg4.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg2[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg2.length <= var13) {
                                    return 0;
                                }
                                var7 = var18;
                                var6 = var17;
                                var8 = -1;
                                var12 = -1;
                            } else {
                                arg2[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
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

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static void method4142(byte arg0) {
        int var1 = 65 / ((arg0 - 27) / 32);
        field10342 = null;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([B)V")
    public class742(byte[] arg0) {
        class26 var2 = new class26(arg0);
        int var3 = var2.method194((byte) 119);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method194((byte) 119) == 1;
        this.field10346 = new byte[256];
        var2.method149(this.field10346, 0, (byte) -75, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method194((byte) 119);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method194((byte) 119);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method195(128);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method195(128);
                    var11[var12][var16] = var15;
                }
            }
            this.field10347 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field10347[var13][var14] = (byte) class583.method3456(var9, var13, this.field10346, (byte) -128, var5, var14, var7, var11);
                        }
                    }
                }
            }
            this.field10344 = var5[32] + var7[32];
        } else {
            this.field10344 = var2.method194((byte) 119);
        }
        var2.method194((byte) 119);
        var2.method194((byte) 119);
        this.field10332 = var2.method194((byte) 119);
        this.field10338 = var2.method194((byte) 119);
    }
}
