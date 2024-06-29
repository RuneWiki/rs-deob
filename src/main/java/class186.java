import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class186 {

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "[B")
    private byte[] field2733;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "[[B")
    private byte[][] field2736;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "Ljj;")
    public static class156 field2728 = new class156(64);

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2746 = "yellow:";

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "[Lof;")
    public static class421[] field2739;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([Lof;ILjava/lang/String;Z)I")
    public final int method1439(class421[] arg0, int arg1, String arg2, boolean arg3) {
        field2737++;
        if (!arg3) {
            method1447(-100);
        }
        return this.method1440(class375.field5317, new int[] { arg1 }, arg0, -125, arg2);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([Ljava/lang/String;[I[Lof;ILjava/lang/String;)I")
    public final int method1440(String[] arg0, int[] arg1, class421[] arg2, int arg3, String arg4) {
        field2745++;
        if (arg4 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg3 > -90) {
            return -4;
        }
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class123.method1042(arg4.charAt(var15), -54) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method1441(var16, (byte) -127);
                    var18 = var15;
                    if (this.field2736 != null && var12 != -1) {
                        var17 += this.field2736[var12][var16];
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
                        var6 = 0;
                        var7 = var15 + 1;
                        var8 = -1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1441(60, (byte) -54);
                        if (this.field2736 != null && var12 != -1) {
                            var17 += this.field2736[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1441(62, (byte) -125);
                        if (this.field2736 != null && var12 != -1) {
                            var17 += this.field2736[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1441(160, (byte) -127);
                        if (this.field2736 != null && var12 != -1) {
                            var17 += this.field2736[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1441(173, (byte) -125);
                        if (this.field2736 != null && var12 != -1) {
                            var17 += this.field2736[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1441(215, (byte) 0);
                        if (this.field2736 != null && var12 != -1) {
                            var17 += this.field2736[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1441(8364, (byte) -126);
                        if (this.field2736 != null && var12 != -1) {
                            var17 += this.field2736[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1441(169, (byte) -126);
                        if (this.field2736 != null && var12 != -1) {
                            var17 += this.field2736[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1441(174, (byte) -126);
                        if (this.field2736 != null && var12 != -1) {
                            var17 += this.field2736[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class36.method259(var19.substring(4), (byte) 109);
                            var12 = -1;
                            var17 += arg2[var20].method1461();
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
                            var8 = var15;
                            var9 = var6;
                        }
                        if (var6 > arg1[arg1.length <= var13 ? arg1.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg0[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var7 = var8 + 1;
                                var13++;
                                var12 = -1;
                                var6 -= var9;
                                var8 = -1;
                            } else {
                                arg0[var13] = arg4.substring(var7, var18);
                                var7 = var18;
                                var8 = -1;
                                var12 = -1;
                                var6 = var17;
                                var13++;
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
        if (var7 < arg4.length()) {
            arg0[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)I")
    public final int method1441(int arg0, byte arg1) {
        field2731++;
        int var3 = 97 % ((-arg1 - 93) / 32);
        return this.field2733[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIII)I")
    public static final int method1442(int arg0, int arg1, int arg2, int arg3) {
        field2730++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (arg3 == 32) {
            return var4 == 2 ? 1023 - arg2 : arg1;
        } else {
            return 88;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;[Lof;BI)I")
    public final int method1443(String arg0, class421[] arg1, byte arg2, int arg3) {
        field2738++;
        int var5 = -112 % ((45 - arg2) / 50);
        int var6 = this.method1440(class375.field5317, new int[] { arg3 }, arg1, -103, arg0);
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            int var9 = this.method1448(class375.field5317[var8], -20814);
            if (var9 > var7) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ICI)I")
    public final int method1444(int arg0, char arg1, int arg2) {
        int var4 = 46 / ((86 - arg0) / 38);
        field2729++;
        return this.field2736 == null ? 0 : this.field2736[arg2][arg1];
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;[Lof;I)I")
    public final int method1445(String arg0, class421[] arg1, int arg2) {
        field2744++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        if (arg2 != -13290) {
            return 100;
        }
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
                                    int var11 = class36.method259(var10.substring(4), (byte) 104);
                                    var5 = -1;
                                    var6 += arg1[var11].method1461();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field2733[class123.method1042(var9, -54) & 0xFF] & 0xFF;
                    if (this.field2736 != null && var5 != -1) {
                        var6 += this.field2736[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;[Lof;II)I")
    public final int method1446(int arg0, String arg1, class421[] arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            arg4 = this.field2741;
        }
        field2742++;
        int var6 = this.method1440(class375.field5317, new int[] { arg3 }, arg2, arg0 ^ 0x494E, arg1);
        int var7 = (var6 - 1) * arg4;
        if (arg0 != -18743) {
            this.field2736 = null;
        }
        return this.field2734 + var7 + this.field2740;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static void method1447(int arg0) {
        field2746 = null;
        field2728 = null;
        field2739 = null;
        if (arg0 != -1) {
            field2739 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1448(String arg0, int arg1) {
        if (arg1 != -20814) {
            this.method1441(98, (byte) 66);
        }
        field2732++;
        return this.method1445(arg0, (class421[]) null, -13290);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
    public static final void method1449(boolean arg0) {
        class137.field2190.method106((byte) -115);
        field2735++;
        if (arg0) {
            field2728 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([B)V")
    public class186(byte[] arg0) {
        class37 var2 = new class37(arg0);
        int var3 = var2.method271((byte) 127);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method271((byte) 110) == 1;
        this.field2733 = new byte[256];
        var2.method285(0, (byte) 109, 256, this.field2733);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method271((byte) 126);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method271((byte) 112);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method291(0);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method291(0);
                    var11[var12][var16] = var15;
                }
            }
            this.field2736 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2736[var13][var14] = (byte) class308.method2106(var14, var5, var13, 5608, var7, this.field2733, var9, var11);
                        }
                    }
                }
            }
            this.field2741 = var5[32] + var7[32];
        } else {
            this.field2741 = var2.method271((byte) 127);
        }
        var2.method271((byte) 123);
        var2.method271((byte) 122);
        this.field2734 = var2.method271((byte) 106);
        this.field2740 = var2.method271((byte) 106);
    }
}
