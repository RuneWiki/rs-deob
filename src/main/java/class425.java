import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class425 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[B")
    private byte[] field5799;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "[[B")
    private byte[][] field5802;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public int field5814;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public int field5803;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public int field5800;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "[Ldc;")
    public static class5[] field5810 = new class5[14];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "[I")
    public static int[] field5815;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;II[Lf;)I")
    public final int method2442(int arg0, String arg1, int arg2, int arg3, class529[] arg4) {
        if (arg0 == arg3) {
            arg0 = this.field5814;
        }
        field5813++;
        int var6 = this.method2453(class496.field6880, arg1, arg4, (byte) -125, new int[] { arg2 });
        int var7 = (var6 - 1) * arg0;
        return this.field5803 + var7 + this.field5800;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILjava/lang/String;[Lf;)I")
    public final int method2443(int arg0, int arg1, String arg2, class529[] arg3) {
        if (arg1 >= -28) {
            this.field5803 = -90;
        }
        field5806++;
        return this.method2453(class496.field6880, arg2, arg3, (byte) -128, new int[] { arg0 });
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
    public final int method2444(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field5799 = null;
        }
        field5801++;
        return this.field5799[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)I")
    public static final int method2445(int arg0, int arg1) {
        field5798++;
        if (arg1 < arg0) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(CII)I")
    public final int method2446(char arg0, int arg1, int arg2) {
        field5817++;
        if (arg1 != 0) {
            this.method2453(null, null, null, (byte) -114, null);
        }
        return this.field5802 == null ? 0 : this.field5802[arg2][arg0];
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2447(int arg0, int arg1, byte arg2) {
        field5808++;
        int var3 = -108 % ((-arg2 - 17) / 33);
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;B[Lf;I)Ljava/lang/String;")
    public final String method2448(String arg0, byte arg1, class529[] arg2, int arg3) {
        field5797++;
        if (arg3 >= this.method2456(544, arg0, arg2)) {
            return arg0;
        }
        int var5 = arg3 - this.method2456(544, "...", null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        if (arg1 > -51) {
            field5815 = null;
        }
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
                                    int var14 = class300.method1752(true, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg2[var14].method151();
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
                    var8 += this.field5799[class427.method2463(true, var12) & 0xFF] & 0xFF;
                    if (this.field5802 != null && var7 != -1) {
                        var8 += this.field5802[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field5802 != null) {
                        var15 = this.field5802[var12][46] + var8;
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

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIILit;Lit;)V")
    public static final void method2449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class455 arg8, class455 arg9) {
        field5811++;
        int var10 = arg8.method807((byte) 24);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class529 var12 = (class529) class176.field2561.method1456((long) var10, 117);
        if (var12 == null) {
            class134[] var13 = class134.method937(class71.field1082, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class370.field4984.method596(var13[0], true);
            class176.field2561.method1462(var12, (long) var10, -104);
        }
        class435.method2505(arg9.field574, arg6 >> 1, 0, (byte) -95, arg9.field573, arg9.field584, arg9.method2590(0) * 64, arg7 >> 1, arg5, arg2);
        int var14 = class80.field1181[0] + arg1 - 18;
        int var15 = arg4 / 4 * 18 + var14;
        int var16 = -60 % ((-arg3 - 75) / 36);
        int var17 = class80.field1181[1] + arg0 - 70;
        int var18 = arg4 % 4 * 18 + var17;
        var12.method3109(var15, var18);
        if (arg8 == arg9) {
            class370.field4984.method1099(var15 - 1, 18, var18 - 1, -256, true, 18);
        }
        class437 var19 = class124.method908(-98);
        var19.field5993 = var18 + 16;
        var19.field5991 = var15;
        var19.field5990 = var15 + 16;
        var19.field5988 = arg8;
        var19.field5992 = var18;
        class234.field3148.method1766((byte) 56, var19);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIBLem;)V")
    public static final void method2450(int arg0, int arg1, byte arg2, class149 arg3) {
        int var4 = 97 / ((arg2 - 54) / 56);
        class259.field3425[arg0][arg1] = arg3;
        field5812++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ[Lf;Ljava/lang/String;)I")
    public final int method2451(int arg0, boolean arg1, class529[] arg2, String arg3) {
        field5807++;
        int var5 = this.method2453(class496.field6880, arg3, arg2, (byte) -126, new int[] { arg0 });
        int var6 = 0;
        if (!arg1) {
            this.method2456(88, null, null);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2456(544, class496.field6880[var7], arg2);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BIILjava/lang/Object;)[B")
    public static final byte[] method2452(byte arg0, int arg1, int arg2, Object arg3) {
        if (arg0 <= 102) {
            return null;
        }
        field5805++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class507.method2900(arg2, (byte) 53, var4, arg1);
        } else if (arg3 instanceof class299) {
            class299 var5 = (class299) arg3;
            return var5.method746(arg1, arg2, -13759);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([Ljava/lang/String;Ljava/lang/String;[Lf;B[I)I")
    public final int method2453(String[] arg0, String arg1, class529[] arg2, byte arg3, int[] arg4) {
        field5809++;
        if (arg1 == null) {
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
        if (arg3 > -124) {
            return -35;
        }
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class427.method2463(true, arg1.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2444(var16, -1);
                    var18 = var15;
                    if (this.field5802 != null && var12 != -1) {
                        var17 += this.field5802[var12][var16];
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
                        arg0[var13] = arg1.substring(var7, var15 + 1);
                        var13++;
                        if (arg0.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var6 = 0;
                        var12 = -1;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2444(60, -1);
                        if (this.field5802 != null && var12 != -1) {
                            var17 += this.field5802[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2444(62, -1);
                        if (this.field5802 != null && var12 != -1) {
                            var17 += this.field5802[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2444(160, -1);
                        if (this.field5802 != null && var12 != -1) {
                            var17 += this.field5802[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2444(173, -1);
                        if (this.field5802 != null && var12 != -1) {
                            var17 += this.field5802[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2444(215, -1);
                        if (this.field5802 != null && var12 != -1) {
                            var17 += this.field5802[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2444(8364, -1);
                        if (this.field5802 != null && var12 != -1) {
                            var17 += this.field5802[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2444(169, -1);
                        if (this.field5802 != null && var12 != -1) {
                            var17 += this.field5802[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2444(174, -1);
                        if (this.field5802 != null && var12 != -1) {
                            var17 += this.field5802[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class300.method1752(true, var19.substring(4));
                            var12 = -1;
                            var17 += arg2[var20].method151();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg4 != null) {
                        if (var16 == 32) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 1;
                        }
                        if (arg4[arg4.length <= var13 ? arg4.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg0[var13] = arg1.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            } else {
                                arg0[var13] = arg1.substring(var7, var18);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var7 = var18;
                                var6 = var17;
                                var8 = -1;
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
        if (var7 < arg1.length()) {
            arg0[var13] = arg1.substring(var7, arg1.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method2454(byte arg0) {
        if (arg0 < 83) {
            field5810 = null;
        }
        field5810 = null;
        field5815 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method2455(byte arg0, String arg1) {
        field5804++;
        if (arg0 < 100) {
            method2449(37, -97, 59, 43, -88, 28, 79, -65, null, null);
        }
        return this.method2456(544, arg1, null);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;[Lf;)I")
    public final int method2456(int arg0, String arg1, class529[] arg2) {
        field5816++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg0 != 544) {
            return -70;
        }
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
                            if (var10.startsWith("img=") && arg2 != null) {
                                try {
                                    int var11 = class300.method1752(true, var10.substring(4));
                                    var6 += arg2[var11].method151();
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
                    var6 += this.field5799[class427.method2463(true, var9) & 0xFF] & 0xFF;
                    if (this.field5802 != null && var5 != -1) {
                        var6 += this.field5802[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V")
    public class425(byte[] arg0) {
        class379 var2 = new class379(arg0);
        int var3 = var2.method2238(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2238(255) == 1;
        this.field5799 = new byte[256];
        var2.method2191(0, -9637, this.field5799, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2238(255);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2238(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2194(-1);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2194(-1);
                    var11[var12][var16] = var15;
                }
            }
            this.field5802 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5802[var13][var14] = (byte) class238.method1472(var11, var14, var5, var13, this.field5799, var6, (byte) 65, var9);
                        }
                    }
                }
            }
            this.field5814 = var5[32] + var6[32];
        } else {
            this.field5814 = var2.method2238(255);
        }
        var2.method2238(255);
        var2.method2238(255);
        this.field5803 = var2.method2238(255);
        this.field5800 = var2.method2238(255);
    }
}
