import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class470 {

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "[B")
    private byte[] field6404;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "[[B")
    private byte[][] field6401;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public int field6398;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public int field6402;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public int field6399;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "Low;")
    public static class665 field6400 = new class665();

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6405 = null;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "Lgga;")
    public static class513 field6407;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)I", line = 5)
    public final int method2743(int arg0, byte arg1) {
        if (arg1 == 93) {
            field6406++;
            return this.field6404[arg0] & 0xFF;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/lang/String;[Lmq;I)I", line = 16)
    public final int method2744(int arg0, String arg1, class85[] arg2, int arg3) {
        field6410++;
        int var5 = this.method2753(class473.field6434, arg2, arg1, new int[] { arg0 }, (byte) 34);
        int var6 = 0;
        int var7 = -108 / ((-arg3 - 16) / 32);
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method2746(class473.field6434[var8], arg2, true);
            if (var6 < var9) {
                var6 = var9;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/lang/String;I[Lmq;I)I", line = 44)
    public final int method2745(int arg0, String arg1, int arg2, class85[] arg3, int arg4) {
        if (~arg4 == arg2) {
            arg4 = this.field6398;
        }
        field6403++;
        int var6 = this.method2753(class473.field6434, arg3, arg1, new int[] { arg0 }, (byte) 34);
        int var7 = (var6 - 1) * arg4;
        return this.field6402 + this.field6399 + var7;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;[Lmq;Z)I", line = 64)
    public final int method2746(String arg0, class85[] arg1, boolean arg2) {
        if (!arg2) {
            this.method2749(-57, '\n', -78);
        }
        field6397++;
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
                                    int var11 = class185.method1340(var10.substring(4), (byte) 33);
                                    var5 = -1;
                                    var6 += arg1[var11].method11();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field6404[class406.method2404(var9, !arg2) & 0xFF] & 0xFF;
                    if (this.field6401 != null && var5 != -1) {
                        var6 += this.field6401[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 172)
    public static void method2747(int arg0) {
        if (arg0 != 0) {
            field6400 = null;
        }
        field6407 = null;
        field6400 = null;
        field6405 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 188)
    public final int method2748(String arg0, int arg1) {
        field6413++;
        if (arg1 != 8364) {
            this.method2753(null, null, null, null, (byte) -91);
        }
        return this.method2746(arg0, null, true);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ICI)I", line = 203)
    public final int method2749(int arg0, char arg1, int arg2) {
        if (arg2 <= 53) {
            return -118;
        } else {
            field6408++;
            return this.field6401 == null ? 0 : this.field6401[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(ILjava/lang/String;[Lmq;I)I", line = 220)
    public final int method2750(int arg0, String arg1, class85[] arg2, int arg3) {
        if (arg0 != -9233) {
            this.field6398 = 59;
        }
        field6409++;
        return this.method2753(class473.field6434, arg2, arg1, new int[] { arg3 }, (byte) 34);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "([B)V", line = 234)
    public class470(byte[] arg0) {
        class431 var2 = new class431(arg0);
        int var3 = var2.method2557(14929);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2557(14929) == 1;
        this.field6404 = new byte[256];
        var2.method2530(-100, this.field6404, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2557(14929);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2557(14929);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2529(122);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2529(54);
                    var11[var12][var16] = var15;
                }
            }
            this.field6401 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field6401[var13][var14] = (byte) class145.method1156((byte) -72, this.field6404, var9, var5, var14, var6, var13, var11);
                        }
                    }
                }
            }
            this.field6398 = var5[32] + var6[32];
        } else {
            this.field6398 = var2.method2557(14929);
        }
        var2.method2557(14929);
        var2.method2557(14929);
        this.field6402 = var2.method2557(14929);
        this.field6399 = var2.method2557(14929);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;[Lmq;BI)Ljava/lang/String;", line = 360)
    public final String method2751(String arg0, class85[] arg1, byte arg2, int arg3) {
        field6411++;
        if (this.method2746(arg0, arg1, true) <= arg3) {
            return arg0;
        }
        if (arg2 != 0) {
            this.field6404 = null;
        }
        int var5 = arg3 - this.method2746("...", null, true);
        int var6 = -1;
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
                            if (var13.startsWith("img=") && arg1 != null) {
                                try {
                                    int var14 = class185.method1340(var13.substring(4), (byte) 29);
                                    var7 = -1;
                                    var8 += arg1[var14].method11();
                                    if (var5 < var8) {
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
                    var8 += this.field6404[class406.method2404(var12, false) & 0xFF] & 0xFF;
                    if (this.field6401 != null && var7 != -1) {
                        var8 += this.field6401[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field6401 != null) {
                        var15 = this.field6401[var12][46] + var8;
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

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIB)V", line = 485)
    public static final void method2752(int arg0, int arg1, byte arg2) {
        field6412++;
        class209.field3055++;
        class302 var3 = class582.method3419(class425.field5915, (byte) 125, class626.field8901);
        var3.field4341.method2541((byte) -118, arg0);
        var3.field4341.method2531((byte) -118, arg1);
        if (arg2 > -107) {
            field6400 = null;
        }
        class501.method2928(0, var3);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "([Ljava/lang/String;[Lmq;Ljava/lang/String;[IB)I", line = 503)
    public final int method2753(String[] arg0, class85[] arg1, String arg2, int[] arg3, byte arg4) {
        field6396++;
        if (arg4 != 34) {
            return 65;
        } else if (arg2 == null) {
            return 0;
        } else {
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
                int var16 = class406.method2404(arg2.charAt(var15), false) & 0xFF;
                int var17 = 0;
                if (var16 == 60) {
                    var11 = var15;
                } else {
                    int var18;
                    if (var11 == -1) {
                        var17 += this.method2743(var16, (byte) 93);
                        var18 = var15;
                        if (this.field6401 != null && var12 != -1) {
                            var17 += this.field6401[var12][var16];
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
                            arg0[var13] = arg2.substring(var7, var15 + 1);
                            var13++;
                            if (var13 >= arg0.length) {
                                return 0;
                            }
                            var8 = -1;
                            var6 = 0;
                            var12 = -1;
                            var7 = var15 + 1;
                            continue;
                        }
                        if (var19.equals("lt")) {
                            var17 += this.method2743(60, (byte) 93);
                            if (this.field6401 != null && var12 != -1) {
                                var17 += this.field6401[var12][60];
                            }
                            var12 = 60;
                        } else if (var19.equals("gt")) {
                            var17 += this.method2743(62, (byte) 93);
                            if (this.field6401 != null && var12 != -1) {
                                var17 += this.field6401[var12][62];
                            }
                            var12 = 62;
                        } else if (var19.equals("nbsp")) {
                            var17 += this.method2743(160, (byte) 93);
                            if (this.field6401 != null && var12 != -1) {
                                var17 += this.field6401[var12][160];
                            }
                            var12 = 160;
                        } else if (var19.equals("shy")) {
                            var17 += this.method2743(173, (byte) 93);
                            if (this.field6401 != null && var12 != -1) {
                                var17 += this.field6401[var12][173];
                            }
                            var12 = 173;
                        } else if (var19.equals("times")) {
                            var17 += this.method2743(215, (byte) 93);
                            if (this.field6401 != null && var12 != -1) {
                                var17 += this.field6401[var12][215];
                            }
                            var12 = 215;
                        } else if (var19.equals("euro")) {
                            var17 += this.method2743(8364, (byte) 93);
                            if (this.field6401 != null && var12 != -1) {
                                var17 += this.field6401[var12][8364];
                            }
                            var12 = 8364;
                        } else if (var19.equals("copy")) {
                            var17 += this.method2743(169, (byte) 93);
                            if (this.field6401 != null && var12 != -1) {
                                var17 += this.field6401[var12][169];
                            }
                            var12 = 169;
                        } else if (var19.equals("reg")) {
                            var17 += this.method2743(174, (byte) 93);
                            if (this.field6401 != null && var12 != -1) {
                                var17 += this.field6401[var12][174];
                            }
                            var12 = 174;
                        } else if (var19.startsWith("img=") && arg1 != null) {
                            try {
                                int var20 = class185.method1340(var19.substring(4), (byte) 113);
                                var12 = -1;
                                var17 += arg1[var20].method11();
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
                                var8 = var15;
                                var9 = var6;
                            }
                            if (arg3[var13 < arg3.length ? var13 : arg3.length - 1] < var6) {
                                if (var8 >= 0) {
                                    arg0[var13] = arg2.substring(var7, var8 + 1 - var10);
                                    var13++;
                                    if (var13 >= arg0.length) {
                                        return 0;
                                    }
                                    var7 = var8 + 1;
                                    var6 -= var9;
                                    var8 = -1;
                                    var12 = -1;
                                } else {
                                    arg0[var13] = arg2.substring(var7, var18);
                                    var13++;
                                    if (arg0.length <= var13) {
                                        return 0;
                                    }
                                    var8 = -1;
                                    var12 = -1;
                                    var7 = var18;
                                    var6 = var17;
                                }
                            }
                            if (var16 == 45) {
                                var8 = var15;
                                var10 = 0;
                                var9 = var6;
                            }
                        }
                    }
                }
            }
            if (arg2.length() > var7) {
                arg0[var13] = arg2.substring(var7, arg2.length());
                var13++;
            }
            return var13;
        }
    }
}
