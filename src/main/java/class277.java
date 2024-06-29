import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class277 {

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "[B")
    private byte[] field3911;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "[[B")
    private byte[][] field3900;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "[I")
    public static int[] field3902 = new int[128];

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "J")
    public static long field3897 = 0L;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)I", line = 3)
    public final int method1744(int arg0, byte arg1) {
        field3913++;
        if (arg1 != 45) {
            this.method1752((int[]) null, (String) null, (String[]) null, (class11[]) null, 49);
        }
        return this.field3911[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;I[Lkh;I)I", line = 22)
    public final int method1745(String arg0, int arg1, class11[] arg2, int arg3) {
        field3899++;
        int var5 = this.method1752(new int[] { arg3 }, arg0, class174.field2417, arg2, -117);
        if (arg1 != -46) {
            return -127;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1748(class174.field2417[var7], 68);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIC)I", line = 50)
    public final int method1746(int arg0, int arg1, char arg2) {
        if (arg0 == -7221) {
            field3907++;
            return this.field3900 == null ? 0 : this.field3900[arg1][arg2];
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 68)
    public static final void method1747(byte arg0) {
        field3895++;
        class40.field428.method301(-1);
        for (int var1 = 0; var1 < 32; var1++) {
            class16.field162[var1] = 0L;
        }
        if (arg0 <= -69) {
            for (int var2 = 0; var2 < 32; var2++) {
                class260.field3526[var2] = 0L;
            }
            class430.field6236 = 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 96)
    public final int method1748(String arg0, int arg1) {
        field3908++;
        int var3 = 15 % ((1 - arg1) / 52);
        return this.method1750((byte) -117, (class11[]) null, arg0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lra;I)V", line = 108)
    public static final void method1749(class57 arg0, int arg1) {
        field3909++;
        class151.field2119 = arg0;
        class315.field4483 = class151.field2119.method352(arg1, (byte) -75);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B[Lkh;Ljava/lang/String;)I", line = 117)
    public final int method1750(byte arg0, class11[] arg1, String arg2) {
        field3910++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
        if (arg0 >= -105) {
            this.field3911 = null;
        }
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
                                    int var11 = class99.method531(var10.substring(4), (byte) 125);
                                    var5 = -1;
                                    var6 += arg1[var11].method52();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field3911[class38.method229((byte) -98, var9) & 0xFF] & 0xFF;
                    if (this.field3900 != null && var5 != -1) {
                        var6 += this.field3900[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILjava/lang/String;[Lkh;II)I", line = 222)
    public final int method1751(int arg0, String arg1, class11[] arg2, int arg3, int arg4) {
        if (arg0 == 0) {
            arg0 = this.field3903;
        }
        field3901++;
        if (arg3 == 32) {
            int var6 = this.method1752(new int[] { arg4 }, arg1, class174.field2417, arg2, arg3 ^ 0xFFFFFFA4);
            int var7 = (var6 - 1) * arg0;
            return this.field3912 - (-this.field3906 - var7);
        } else {
            return -26;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([ILjava/lang/String;[Ljava/lang/String;[Lkh;I)I", line = 242)
    public final int method1752(int[] arg0, String arg1, String[] arg2, class11[] arg3, int arg4) {
        field3898++;
        if (arg1 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        if (arg4 > -85) {
            this.field3903 = 28;
        }
        int var12 = -1;
        int var13 = 0;
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class38.method229((byte) -98, arg1.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method1744(var16, (byte) 45);
                    if (this.field3900 != null && var12 != -1) {
                        var17 += this.field3900[var12][var16];
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
                        arg2[var13] = arg1.substring(var7, var15 + 1);
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        var8 = -1;
                        var13++;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1744(60, (byte) 45);
                        if (this.field3900 != null && var12 != -1) {
                            var17 += this.field3900[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1744(62, (byte) 45);
                        if (this.field3900 != null && var12 != -1) {
                            var17 += this.field3900[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1744(160, (byte) 45);
                        if (this.field3900 != null && var12 != -1) {
                            var17 += this.field3900[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1744(173, (byte) 45);
                        if (this.field3900 != null && var12 != -1) {
                            var17 += this.field3900[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1744(215, (byte) 45);
                        if (this.field3900 != null && var12 != -1) {
                            var17 += this.field3900[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1744(8364, (byte) 45);
                        if (this.field3900 != null && var12 != -1) {
                            var17 += this.field3900[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1744(169, (byte) 45);
                        if (this.field3900 != null && var12 != -1) {
                            var17 += this.field3900[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1744(174, (byte) 45);
                        if (this.field3900 != null && var12 != -1) {
                            var17 += this.field3900[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class99.method531(var19.substring(4), (byte) -21);
                            var17 += arg3[var20].method52();
                            var12 = -1;
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg0 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var9 = var6;
                            var8 = var15;
                        }
                        if (arg0[var13 >= arg0.length ? arg0.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg2[var13] = arg1.substring(var7, var8 + 1 - var10);
                                var13++;
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg2[var13] = arg1.substring(var7, var18);
                                var12 = -1;
                                var6 = var17;
                                var8 = -1;
                                var7 = var18;
                                var13++;
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
        if (arg1.length() > var7) {
            arg2[var13] = arg1.substring(var7, arg1.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 486)
    public static void method1753(byte arg0) {
        field3902 = null;
        int var1 = -103 / ((48 - arg0) / 46);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(CB)Z", line = 500)
    public static final boolean method1754(char arg0, byte arg1) {
        field3896++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class353.method2245(-127, arg0)) {
            return true;
        } else {
            char[] var2 = class355.field5198;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            if (arg1 != 52) {
                method1753((byte) -39);
            }
            char[] var4 = class67.field764;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;[Lkh;II)I", line = 546)
    public final int method1755(String arg0, class11[] arg1, int arg2, int arg3) {
        if (arg2 != 4) {
            field3897 = -98L;
        }
        field3904++;
        return this.method1752(new int[] { arg3 }, arg0, class174.field2417, arg1, -122);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "([B)V", line = 559)
    public class277(byte[] arg0) {
        class211 var2 = new class211(arg0);
        int var3 = var2.method1342((byte) -128);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1342((byte) -126) == 1;
        this.field3911 = new byte[256];
        var2.method1370(this.field3911, 0, 19294, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1342((byte) -127);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1342((byte) -126);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1373((byte) 30);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1373((byte) 30);
                    var11[var12][var16] = var15;
                }
            }
            this.field3900 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field3900[var13][var14] = (byte) class70.method409(var11, var14, var9, this.field3911, var7, var5, 121, var13);
                        }
                    }
                }
            }
            this.field3903 = var5[32] + var7[32];
        } else {
            this.field3903 = var2.method1342((byte) -128);
        }
        var2.method1342((byte) -128);
        var2.method1342((byte) -128);
        this.field3912 = var2.method1342((byte) -127);
        this.field3906 = var2.method1342((byte) -127);
    }
}
