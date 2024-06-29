import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class255 {

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "[B")
    private byte[] field3797;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
    public int field3796;

    @OriginalMember(owner = "client!eia", name = "k", descriptor = "[[B")
    private byte[][] field3806;

    @OriginalMember(owner = "client!eia", name = "o", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!eia", name = "l", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3798 = new String[100];

    @OriginalMember(owner = "client!eia", name = "g", descriptor = "I")
    public static int field3802 = -1;

    @OriginalMember(owner = "client!eia", name = "n", descriptor = "Ltm;")
    public static class412 field3809 = new class412();

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!eia", name = "h", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!eia", name = "i", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!eia", name = "j", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!eia", name = "q", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!eia", name = "r", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!eia", name = "s", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!eia", name = "p", descriptor = "[[B")
    public static byte[][] field3811;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 4)
    public final int method1696(String arg0, int arg1) {
        field3814++;
        return arg1 == 0 ? this.method1702(arg1 + 18700, null, arg0) : 127;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I[Lvr;Ljava/lang/String;I)I", line = 16)
    public final int method1697(int arg0, class147[] arg1, String arg2, int arg3) {
        field3812++;
        if (arg0 > -42) {
            field3809 = null;
        }
        return this.method1706(arg1, class410.field5905, new int[] { arg3 }, arg2, -1);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(CII)I", line = 31)
    public final int method1698(char arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method1696(null, -85);
        }
        field3808++;
        return this.field3806 == null ? 0 : this.field3806[arg1][arg0];
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILjava/lang/String;Z[Lvr;)Ljava/lang/String;", line = 46)
    public final String method1699(int arg0, String arg1, boolean arg2, class147[] arg3) {
        field3801++;
        if (arg0 >= this.method1702(18700, arg3, arg1)) {
            return arg1;
        }
        int var5 = arg0 - this.method1702(18700, null, "...");
        int var6 = -1;
        int var7 = -1;
        if (!arg2) {
            return null;
        }
        int var8 = 0;
        int var9 = arg1.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg1.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg1.substring(var6 + 1, var11);
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
                                    int var14 = class334.method2123(1, var13.substring(4));
                                    var8 += arg3[var14].method1096();
                                    var7 = -1;
                                    if (var8 > var5) {
                                        return var10 + "...";
                                    }
                                    var10 = arg1.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field3797[class521.method3010(-112, var12) & 0xFF] & 0xFF;
                    if (this.field3806 != null && var7 != -1) {
                        var8 += this.field3806[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field3806 != null) {
                        var15 = this.field3806[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg1.substring(0, var11 + 1);
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZI)I", line = 171)
    public final int method1700(boolean arg0, int arg1) {
        if (arg0) {
            this.method1701((byte) 85, null, -13, null);
        }
        field3804++;
        return this.field3797[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(BLjava/lang/String;I[Lvr;)I", line = 182)
    public final int method1701(byte arg0, String arg1, int arg2, class147[] arg3) {
        field3800++;
        if (arg0 != -121) {
            return 15;
        }
        int var5 = this.method1706(arg3, class410.field5905, new int[] { arg2 }, arg1, arg0 ^ 0x78);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1702(arg0 ^ 0xFFFFB68B, arg3, class410.field5905[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I[Lvr;Ljava/lang/String;)I", line = 211)
    public final int method1702(int arg0, class147[] arg1, String arg2) {
        field3803++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (arg0 != 18700) {
            this.field3810 = 94;
        }
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg2.substring(var4 + 1, var8);
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
                                    int var11 = class334.method2123(1, var10.substring(4));
                                    var6 += arg1[var11].method1096();
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
                    var6 += this.field3797[class521.method3010(arg0 - 18816, var9) & 0xFF] & 0xFF;
                    if (this.field3806 != null && var5 != -1) {
                        var6 += this.field3806[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)V", line = 323)
    public static final void method1703(int arg0, int arg1) {
        field3799++;
        class16 var2 = class94.method753(arg1, 13175, (long) arg0);
        var2.method118(585134072);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZILjava/lang/String;[Lvr;I)I", line = 335)
    public final int method1704(boolean arg0, int arg1, String arg2, class147[] arg3, int arg4) {
        field3805++;
        if (arg4 == 0) {
            arg4 = this.field3796;
        }
        int var6 = this.method1706(arg3, class410.field5905, new int[] { arg1 }, arg2, -1);
        if (!arg0) {
            this.method1697(14, null, null, 36);
        }
        int var7 = (var6 - 1) * arg4;
        return this.field3810 + var7 + this.field3807;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)V", line = 356)
    public static void method1705(byte arg0) {
        field3798 = null;
        int var1 = -49 % ((-arg0 - 13) / 42);
        field3809 = null;
        field3811 = null;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "([Lvr;[Ljava/lang/String;[ILjava/lang/String;I)I", line = 375)
    public final int method1706(class147[] arg0, String[] arg1, int[] arg2, String arg3, int arg4) {
        field3813++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = arg4;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class521.method3010(-100, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method1700(false, var16);
                    if (this.field3806 != null && var12 != -1) {
                        var17 += this.field3806[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg3.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg1[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1700(false, 60);
                        if (this.field3806 != null && var12 != -1) {
                            var17 += this.field3806[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1700(false, 62);
                        if (this.field3806 != null && var12 != -1) {
                            var17 += this.field3806[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1700(false, 160);
                        if (this.field3806 != null && var12 != -1) {
                            var17 += this.field3806[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1700(false, 173);
                        if (this.field3806 != null && var12 != -1) {
                            var17 += this.field3806[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1700(false, 215);
                        if (this.field3806 != null && var12 != -1) {
                            var17 += this.field3806[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1700(false, 8364);
                        if (this.field3806 != null && var12 != -1) {
                            var17 += this.field3806[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1700(false, 169);
                        if (this.field3806 != null && var12 != -1) {
                            var17 += this.field3806[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1700(false, 174);
                        if (this.field3806 != null && var12 != -1) {
                            var17 += this.field3806[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg0 != null) {
                        try {
                            int var20 = class334.method2123(1, var19.substring(4));
                            var12 = -1;
                            var17 += arg0[var20].method1096();
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
                        if (arg2[var13 >= arg2.length ? arg2.length - 1 : var13] < var6) {
                            if (var8 < 0) {
                                arg1[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
                                var6 = var17;
                            } else {
                                arg1[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
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
        if (var7 < arg3.length()) {
            arg1[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "([B)V", line = 633)
    public class255(byte[] arg0) {
        class376 var2 = new class376(arg0);
        int var3 = var2.method2398(-1372747256);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2398(-1372747256) == 1;
        this.field3797 = new byte[256];
        var2.method2389(0, 689125352, 256, this.field3797);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2398(-1372747256);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2398(-1372747256);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2387((byte) 51);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2387((byte) 75);
                    var11[var12][var16] = var15;
                }
            }
            this.field3806 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field3806[var13][var14] = (byte) class722.method4026(var5, 2, var14, this.field3797, var13, var9, var7, var11);
                        }
                    }
                }
            }
            this.field3796 = var5[32] + var7[32];
        } else {
            this.field3796 = var2.method2398(-1372747256);
        }
        var2.method2398(-1372747256);
        var2.method2398(-1372747256);
        this.field3810 = var2.method2398(-1372747256);
        this.field3807 = var2.method2398(-1372747256);
    }
}
