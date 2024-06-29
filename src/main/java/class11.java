import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 {

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "[B")
    private byte[] field567;

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "[[B")
    private byte[][] field572;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!daa", name = "n", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "Lsb;")
    public static class266 field565 = new class266(64, 8);

    @OriginalMember(owner = "client!daa", name = "p", descriptor = "Lkj;")
    public static class527 field577 = new class527(1, -1);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!daa", name = "o", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!daa", name = "q", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(FFFI)F")
    public static final float method283(float arg0, float arg1, float arg2, int arg3) {
        field573++;
        return arg3 == 256 ? (arg2 - arg1) * arg0 + arg1 : 0.052251276F;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)V")
    public static final void method284(int arg0, boolean arg1) {
        if (arg1 && class407.field5871 != null) {
            class10.field558 = class407.field5871.field7887;
        } else {
            class10.field558 = -1;
        }
        field566++;
        class660.field9506 = 0;
        class36.field1037 = null;
        class407.field5871 = null;
        class38.field1052 = null;
        class407.method2478();
        class407.field5880.method1222((byte) -99);
        class247.field3717 = null;
        class436.field6297 = null;
        class220.field3334 = null;
        class409.field5928 = null;
        class297.field4450 = null;
        class407.field5875 = null;
        class459.field6560 = -1;
        class580.field8422 = null;
        class453.field6461 = -1;
        class216.field3281 = null;
        class244.field3690 = null;
        class20.field846 = null;
        if (class407.field5864 != null) {
            class407.field5864.method3359(arg0 - 156);
            class407.field5864.method3356((byte) 123, 64, 128);
        }
        if (class407.field5865 != null) {
            class407.field5865.method2797((byte) 121, 64, 64);
        }
        if (class407.field5869 != null) {
            class407.field5869.method3513(64, (byte) -78);
        }
        class661.field9519.method622(arg0, (byte) 123);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;[Lf;II)I")
    public final int method285(String arg0, class702[] arg1, int arg2, int arg3) {
        if (arg2 != 20034) {
            this.field567 = null;
        }
        field581++;
        int var5 = this.method297(class432.field6238, (byte) -109, new int[] { arg3 }, arg1, arg0);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method295(class432.field6238[var7], (byte) -101, arg1);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method286(String arg0, int arg1) {
        if (arg1 == -5113) {
            field576++;
            return this.method295(arg0, (byte) -101, null);
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "([Lf;ILjava/lang/String;I)Ljava/lang/String;")
    public final String method287(class702[] arg0, int arg1, String arg2, int arg3) {
        field578++;
        if (this.method295(arg2, (byte) -101, arg0) <= arg3) {
            return arg2;
        }
        int var5 = arg3 - this.method295("...", (byte) -101, null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg2.length();
        String var10 = "";
        for (int var11 = arg1; var11 < var9; var11++) {
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
                                    int var14 = class108.method975(var13.substring(4), -10426);
                                    var8 += arg0[var14].method1784();
                                    var7 = -1;
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
                    var8 += this.field567[class376.method2361(-40, var12) & 0xFF] & 0xFF;
                    if (this.field572 != null && var7 != -1) {
                        var8 += this.field572[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field572 != null) {
                        var15 = this.field572[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(IZ)I")
    public final int method288(int arg0, boolean arg1) {
        field582++;
        if (arg1) {
            this.method297(null, (byte) 107, null, null, null);
        }
        return this.field567[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method289(String arg0, byte arg1) {
        field574++;
        if (arg1 != -14) {
            method289(null, (byte) -74);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;IIB[Lf;)I")
    public final int method290(String arg0, int arg1, int arg2, byte arg3, class702[] arg4) {
        if (arg2 == 0) {
            arg2 = this.field568;
        }
        field579++;
        int var6 = this.method297(class432.field6238, (byte) -109, new int[] { arg1 }, arg4, arg0);
        if (arg3 == 116) {
            int var7 = (var6 - 1) * arg2;
            return this.field575 + var7 + this.field564;
        } else {
            return -98;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ICI)I")
    public final int method291(int arg0, char arg1, int arg2) {
        field580++;
        if (arg0 <= 71) {
            this.method295(null, (byte) -15, null);
        }
        return this.field572 == null ? 0 : this.field572[arg2][arg1];
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
    public static void method292(byte arg0) {
        field565 = null;
        int var1 = 36 % (arg0 / 47);
        field577 = null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IBIIII)V")
    public static final void method293(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class540.field7553 = arg2;
        if (arg1 >= -51) {
            method284(47, false);
        }
        class519.field7365 = arg0;
        class146.field2541 = arg3;
        class184.field2956 = arg4;
        class525.field7402 = arg5;
        field569++;
        if (class525.field7402 >= 100) {
            int var6 = class540.field7553 * 512 + 256;
            int var7 = class184.field2956 * 512 + 256;
            int var8 = class460.method2757(0, var7, class37.field1046, var6) - class146.field2541;
            int var9 = var6 - class206.field3158;
            int var10 = var8 - class1.field97;
            int var11 = var7 - class537.field7518;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class499.field7113 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class517.field7300 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class499.field7113 < 1024) {
                class499.field7113 = 1024;
            }
            class596.field8558 = 0;
            if (class499.field7113 > 3072) {
                class499.field7113 = 3072;
            }
        }
        class423.field6123 = 2;
        class488.field6995 = -1;
        class266.field3950 = -1;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILjava/lang/String;[Lf;I)I")
    public final int method294(int arg0, String arg1, class702[] arg2, int arg3) {
        int var5 = -98 / ((arg3 - 20) / 44);
        field563++;
        return this.method297(class432.field6238, (byte) -109, new int[] { arg0 }, arg2, arg1);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;B[Lf;)I")
    public final int method295(String arg0, byte arg1, class702[] arg2) {
        field562++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg1 != -101) {
            this.method285(null, null, -7, 90);
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
                                    int var11 = class108.method975(var10.substring(4), arg1 ^ 0x28DD);
                                    var5 = -1;
                                    var6 += arg2[var11].method1784();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field567[class376.method2361(62, var9) & 0xFF] & 0xFF;
                    if (this.field572 != null && var5 != -1) {
                        var6 += this.field572[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)Lfq;")
    public static final class186 method296(int arg0) {
        field571++;
        if (arg0 != 15667) {
            method289(null, (byte) -96);
        }
        return class23.method469(1, (byte) -15);
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "([B)V")
    public class11(byte[] arg0) {
        class61 var2 = new class61(arg0);
        int var3 = var2.method732(-559537960);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method732(-559537960) == 1;
        this.field567 = new byte[256];
        var2.method704(0, 256, this.field567, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method732(-559537960);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method732(-559537960);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method710((byte) 43);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method710((byte) 43);
                    var11[var12][var16] = var15;
                }
            }
            this.field572 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field572[var13][var14] = (byte) class532.method3090(var13, var9, this.field567, var5, var6, -17829, var14, var11);
                        }
                    }
                }
            }
            this.field568 = var5[32] + var6[32];
        } else {
            this.field568 = var2.method732(-559537960);
        }
        var2.method732(-559537960);
        var2.method732(-559537960);
        this.field575 = var2.method732(-559537960);
        this.field564 = var2.method732(-559537960);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "([Ljava/lang/String;B[I[Lf;Ljava/lang/String;)I")
    public final int method297(String[] arg0, byte arg1, int[] arg2, class702[] arg3, String arg4) {
        field570++;
        if (arg4 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        if (arg1 != -109) {
            return 103;
        }
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class376.method2361(122, arg4.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method288(var16, false);
                    var18 = var15;
                    if (this.field572 != null && var12 != -1) {
                        var17 += this.field572[var12][var16];
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
                        arg0[var13] = arg4.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg0.length) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var8 = -1;
                        var6 = 0;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method288(60, false);
                        if (this.field572 != null && var12 != -1) {
                            var17 += this.field572[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method288(62, false);
                        if (this.field572 != null && var12 != -1) {
                            var17 += this.field572[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method288(160, false);
                        if (this.field572 != null && var12 != -1) {
                            var17 += this.field572[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method288(173, false);
                        if (this.field572 != null && var12 != -1) {
                            var17 += this.field572[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method288(215, false);
                        if (this.field572 != null && var12 != -1) {
                            var17 += this.field572[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method288(8364, false);
                        if (this.field572 != null && var12 != -1) {
                            var17 += this.field572[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method288(169, false);
                        if (this.field572 != null && var12 != -1) {
                            var17 += this.field572[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method288(174, false);
                        if (this.field572 != null && var12 != -1) {
                            var17 += this.field572[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class108.method975(var19.substring(4), -10426);
                            var17 += arg3[var20].method1784();
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
                            var9 = var6;
                            var10 = 1;
                            var8 = var15;
                        }
                        if (var6 > arg2[var13 >= arg2.length ? arg2.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg0[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var8 = -1;
                                var12 = -1;
                            } else {
                                arg0[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var7 = var18;
                                var12 = -1;
                                var8 = -1;
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
        if (arg4.length() > var7) {
            arg0[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }
}
