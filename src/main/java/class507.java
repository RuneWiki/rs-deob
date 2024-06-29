import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class507 {

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "[B")
    private byte[] field7741;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public int field7725;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "[[B")
    private byte[][] field7735;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public int field7727;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public int field7724;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lag;")
    public static class463 field7729 = new class463("WIP", 2);

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "Ldc;")
    public static class5 field7737 = new class5(10);

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field7740 = 0;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([Lqg;ILjava/lang/String;[Ljava/lang/String;[I)I", line = 3)
    public final int method3046(class307[] arg0, int arg1, String arg2, String[] arg3, int[] arg4) {
        field7733++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg1 != -5111) {
            this.method3050(-119, null, null, true);
        }
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class164.method1040((byte) -103, arg2.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method3049((byte) -62, var16);
                    if (this.field7735 != null && var12 != -1) {
                        var17 += this.field7735[var12][var16];
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
                        arg3[var13] = arg2.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg3.length) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var6 = 0;
                        var12 = -1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3049((byte) -62, 60);
                        if (this.field7735 != null && var12 != -1) {
                            var17 += this.field7735[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3049((byte) -62, 62);
                        if (this.field7735 != null && var12 != -1) {
                            var17 += this.field7735[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3049((byte) -62, 160);
                        if (this.field7735 != null && var12 != -1) {
                            var17 += this.field7735[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3049((byte) -62, 173);
                        if (this.field7735 != null && var12 != -1) {
                            var17 += this.field7735[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3049((byte) -62, 215);
                        if (this.field7735 != null && var12 != -1) {
                            var17 += this.field7735[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3049((byte) -62, 8364);
                        if (this.field7735 != null && var12 != -1) {
                            var17 += this.field7735[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3049((byte) -62, 169);
                        if (this.field7735 != null && var12 != -1) {
                            var17 += this.field7735[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3049((byte) -62, 174);
                        if (this.field7735 != null && var12 != -1) {
                            var17 += this.field7735[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class103.method622(var19.substring(4), arg1 ^ 0xFFFFEC09);
                            var17 += arg0[var20].method87();
                            var12 = -1;
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
                        if (var6 > arg4[var13 >= arg4.length ? arg4.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg3[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var7 = var18;
                                var8 = -1;
                                var6 = var17;
                            } else {
                                arg3[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
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
        if (var7 < arg2.length()) {
            arg3[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I[Lqg;)I", line = 254)
    public final int method3047(String arg0, int arg1, class307[] arg2) {
        field7734++;
        if (arg0 == null) {
            return 0;
        }
        if (arg1 != -11538) {
            this.method3046(null, -36, null, null, null);
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
                            if (var10.startsWith("img=") && arg2 != null) {
                                try {
                                    int var11 = class103.method622(var10.substring(4), 0);
                                    var5 = -1;
                                    var6 += arg2[var11].method87();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field7741[class164.method1040((byte) -103, var9) & 0xFF] & 0xFF;
                    if (this.field7735 != null && var5 != -1) {
                        var6 += this.field7735[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(CII)I", line = 363)
    public final int method3048(char arg0, int arg1, int arg2) {
        field7738++;
        if (arg2 == 0) {
            return this.field7735 == null ? 0 : this.field7735[arg1][arg0];
        } else {
            return -120;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)I", line = 380)
    public final int method3049(byte arg0, int arg1) {
        if (arg0 == -62) {
            field7732++;
            return this.field7741[arg1] & 0xFF;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;[Lqg;Z)I", line = 393)
    public final int method3050(int arg0, String arg1, class307[] arg2, boolean arg3) {
        field7730++;
        if (arg3) {
            this.field7735 = null;
        }
        int var5 = this.method3046(arg2, -5111, arg1, class348.field5030, new int[] { arg0 });
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method3047(class348.field5030[var7], -11538, arg2);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I[Lqg;I)Ljava/lang/String;", line = 422)
    public final String method3051(String arg0, int arg1, class307[] arg2, int arg3) {
        field7736++;
        if (this.method3047(arg0, -11538, arg2) <= arg3) {
            return arg0;
        }
        int var5 = arg3 - this.method3047("...", -11538, null);
        int var6 = arg1;
        int var7 = -1;
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
                            if (var13.startsWith("img=") && arg2 != null) {
                                try {
                                    int var14 = class103.method622(var13.substring(4), 0);
                                    var8 += arg2[var14].method87();
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
                    var8 += this.field7741[class164.method1040((byte) -103, var12) & 0xFF] & 0xFF;
                    if (this.field7735 != null && var7 != -1) {
                        var8 += this.field7735[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field7735 != null) {
                        var15 = this.field7735[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg0.substring(0, var11 + 1);
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLjava/lang/String;[Lqg;I)I", line = 544)
    public final int method3052(byte arg0, String arg1, class307[] arg2, int arg3) {
        field7728++;
        return arg0 >= -127 ? 58 : this.method3046(arg2, -5111, arg1, class348.field5030, new int[] { arg3 });
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIILps;ILeq;)V", line = 562)
    public static final void method3053(int arg0, int arg1, int arg2, int arg3, class59 arg4, int arg5, class134 arg6) {
        field7742++;
        if (class389.field5768 < 100) {
            class221.method1356(arg4, (byte) 68, arg6);
        }
        arg6.method810(arg1, arg2, arg1 + arg3, arg2 + arg5);
        if (class389.field5768 < 100) {
            byte var7 = 20;
            int var8 = arg1 + (arg3 / 2);
            int var9 = arg5 / 2 + arg2 - var7 - 18;
            arg6.method770(arg1, arg2, arg3, arg5, -16777216, 0);
            arg6.method738(var8 - 152, var9, 304, 34, class152.field1953[class181.field2594].getRGB(), 0);
            arg6.method770(var8 - 150, var9 - -2, class389.field5768 * 3, 30, class337.field4904[class181.field2594].getRGB(), 0);
            class458.field6676.method2107(var8, class34.field551.method1220(arg0 ^ 0x3F6A, class81.field1122), var7 + var9, class438.field6409[class181.field2594].getRGB(), -14014, -1);
            return;
        }
        int var10 = class192.field2715 - ((int) ((float) arg3 / class249.field3581));
        int var11 = (int) ((float) arg5 / class249.field3581) + class364.field5477;
        if (arg0 != 13555) {
            method3053(35, 76, -40, -91, null, -44, null);
        }
        int var12 = class192.field2715 + ((int) ((float) arg3 / class249.field3581));
        class337.field4905 = class364.field5477 - ((int) ((float) arg5 / class249.field3581));
        class107.field1434 = (int) ((float) (arg3 * 2) / class249.field3581);
        class334.field4851 = (int) ((float) (arg5 * 2) / class249.field3581);
        class223.field3155 = class192.field2715 - (int) ((float) arg3 / class249.field3581);
        int var13 = class364.field5477 - (int) ((float) arg5 / class249.field3581);
        class249.method1565(var10 + class249.field3584, class249.field3604 + var11, class249.field3584 + var12, var13 - -class249.field3604, arg1, arg2, arg1 + arg3, arg2 + arg5 + 1);
        class249.method1557(arg6);
        class347 var14 = class249.method1562(arg6);
        class303.method1826(0, 0, var14, (byte) 109, arg6);
        if (class440.field6432 > 0) {
            class135.field1729--;
            if (class135.field1729 == 0) {
                class135.field1729 = 20;
                class440.field6432--;
            }
        }
        if (!class174.field2389) {
            return;
        }
        int var15 = arg3 + arg1 - 5;
        int var16 = arg2 + arg5 - 8;
        class181.field2587.method2103(var16, false, "Fps:" + class35.field556, var15, 16776960, -1);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class181.field2587.method2103(var20, false, "Mem:" + var18 + "k", var15, var19, -1);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 648)
    public static void method3054(byte arg0) {
        field7729 = null;
        field7737 = null;
        if (arg0 != -97) {
            method3054((byte) -17);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;)I", line = 659)
    public final int method3055(int arg0, String arg1) {
        if (arg0 == 7748) {
            field7739++;
            return this.method3047(arg1, -11538, null);
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;[Lqg;II)I", line = 670)
    public final int method3056(int arg0, String arg1, class307[] arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            arg4 = this.field7725;
        }
        field7731++;
        if (arg0 >= -89) {
            this.method3050(67, null, null, false);
        }
        int var6 = this.method3046(arg2, -5111, arg1, class348.field5030, new int[] { arg3 });
        int var7 = (var6 - 1) * arg4;
        return this.field7724 + var7 + this.field7727;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "([B)V", line = 700)
    public class507(byte[] arg0) {
        class156 var2 = new class156(arg0);
        int var3 = var2.method941((byte) 125);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method941((byte) 124) == 1;
        this.field7741 = new byte[256];
        var2.method942(this.field7741, -5403, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method941((byte) 124);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method941((byte) 127);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method946(28);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method946(110);
                    var11[var12][var16] = var15;
                }
            }
            this.field7735 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field7735[var13][var14] = (byte) class81.method521(var5, var9, var14, (byte) -123, var11, this.field7741, var13, var7);
                        }
                    }
                }
            }
            this.field7725 = var5[32] + var7[32];
        } else {
            this.field7725 = var2.method941((byte) 125);
        }
        var2.method941((byte) 127);
        var2.method941((byte) 127);
        this.field7727 = var2.method941((byte) 124);
        this.field7724 = var2.method941((byte) 124);
    }
}
