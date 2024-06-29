import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class1 {

    @OriginalMember(owner = "client!is", name = "l", descriptor = "[B")
    private byte[] field12;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "[[B")
    private byte[][] field14;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "Lsh;")
    public static class472 field9 = new class472(33, 3);

    @OriginalMember(owner = "client!is", name = "o", descriptor = "[[I")
    public static int[][] field15 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!is", name = "q", descriptor = "J")
    public static long field17;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "Lui;")
    public static class451 field18;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "Lui;")
    public static class451 field19;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;I[Ldp;I)I")
    public final int method1(String arg0, int arg1, class319[] arg2, int arg3) {
        field2++;
        int var5 = this.method4(arg0, 1, arg2, class233.field3419, new int[] { arg1 });
        int var6 = arg3;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2(class233.field3419[var7], arg2, -127);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;[Ldp;I)I")
    public final int method2(String arg0, class319[] arg1, int arg2) {
        field10++;
        if (arg0 == null) {
            return 0;
        } else if (arg2 >= -69) {
            return 35;
        } else {
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
                                        int var11 = class427.method2512(10, var10.substring(4));
                                        var5 = -1;
                                        var6 += arg1[var11].method791();
                                    } catch (Exception var12) {
                                    }
                                }
                                continue;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field12[class156.method1065((byte) 81, var9) & 0xFF] & 0xFF;
                        if (this.field14 != null && var5 != -1) {
                            var6 += this.field14[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method3(String arg0, byte arg1) {
        field1++;
        if (arg1 != 92) {
            this.method4((String) null, -108, (class319[]) null, (String[]) null, (int[]) null);
        }
        return this.method2(arg0, (class319[]) null, -101);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;I[Ldp;[Ljava/lang/String;[I)I")
    public final int method4(String arg0, int arg1, class319[] arg2, String[] arg3, int[] arg4) {
        field7++;
        if (arg0 == null) {
            return 0;
        } else if (arg1 == 1) {
            int var6 = 0;
            int var7 = 0;
            int var8 = -1;
            int var9 = 0;
            byte var10 = 0;
            int var11 = -1;
            int var12 = -1;
            int var13 = 0;
            int var14 = arg0.length();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = class156.method1065((byte) -81, arg0.charAt(var15)) & 0xFF;
                int var17 = 0;
                if (var16 == 60) {
                    var11 = var15;
                } else {
                    int var18;
                    if (var11 == -1) {
                        var18 = var15;
                        var17 += this.method9(var16, 0);
                        if (this.field14 != null && var12 != -1) {
                            var17 += this.field14[var12][var16];
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
                            arg3[var13] = arg0.substring(var7, var15 + 1);
                            var13++;
                            if (var13 >= arg3.length) {
                                return 0;
                            }
                            var8 = -1;
                            var6 = 0;
                            var12 = -1;
                            var7 = var15 + 1;
                            continue;
                        }
                        if (var19.equals("lt")) {
                            var17 += this.method9(60, 0);
                            if (this.field14 != null && var12 != -1) {
                                var17 += this.field14[var12][60];
                            }
                            var12 = 60;
                        } else if (var19.equals("gt")) {
                            var17 += this.method9(62, 0);
                            if (this.field14 != null && var12 != -1) {
                                var17 += this.field14[var12][62];
                            }
                            var12 = 62;
                        } else if (var19.equals("nbsp")) {
                            var17 += this.method9(160, 0);
                            if (this.field14 != null && var12 != -1) {
                                var17 += this.field14[var12][160];
                            }
                            var12 = 160;
                        } else if (var19.equals("shy")) {
                            var17 += this.method9(173, arg1 - 1);
                            if (this.field14 != null && var12 != -1) {
                                var17 += this.field14[var12][173];
                            }
                            var12 = 173;
                        } else if (var19.equals("times")) {
                            var17 += this.method9(215, 0);
                            if (this.field14 != null && var12 != -1) {
                                var17 += this.field14[var12][215];
                            }
                            var12 = 215;
                        } else if (var19.equals("euro")) {
                            var17 += this.method9(8364, arg1 ^ 0x1);
                            if (this.field14 != null && var12 != -1) {
                                var17 += this.field14[var12][8364];
                            }
                            var12 = 8364;
                        } else if (var19.equals("copy")) {
                            var17 += this.method9(169, arg1 - 1);
                            if (this.field14 != null && var12 != -1) {
                                var17 += this.field14[var12][169];
                            }
                            var12 = 169;
                        } else if (var19.equals("reg")) {
                            var17 += this.method9(174, 0);
                            if (this.field14 != null && var12 != -1) {
                                var17 += this.field14[var12][174];
                            }
                            var12 = 174;
                        } else if (var19.startsWith("img=") && arg2 != null) {
                            try {
                                int var20 = class427.method2512(arg1 + 9, var19.substring(4));
                                var17 += arg2[var20].method791();
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
                                var9 = var6;
                                var10 = 1;
                                var8 = var15;
                            }
                            if (var6 > arg4[arg4.length <= var13 ? arg4.length - 1 : var13]) {
                                if (var8 < 0) {
                                    arg3[var13] = arg0.substring(var7, var18);
                                    var13++;
                                    if (var13 >= arg3.length) {
                                        return 0;
                                    }
                                    var8 = -1;
                                    var6 = var17;
                                    var12 = -1;
                                    var7 = var18;
                                } else {
                                    arg3[var13] = arg0.substring(var7, var8 + 1 - var10);
                                    var13++;
                                    if (var13 >= arg3.length) {
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
            if (arg0.length() > var7) {
                arg3[var13] = arg0.substring(var7, arg0.length());
                var13++;
            }
            return var13;
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I[Ldp;ILjava/lang/String;)I")
    public final int method5(int arg0, class319[] arg1, int arg2, String arg3) {
        field4++;
        return arg0 == -1 ? this.method4(arg3, arg0 + 2, arg1, class233.field3419, new int[] { arg2 }) : 124;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static final void method6(int arg0) {
        field11++;
        class336.field5036.method585(((float) class337.field5038.field3932 * 0.1F + 0.7F) * 1.1523438F);
        class336.field5036.method575(class14.field200, 0.69921875F, 1.2F, (float) arg0, -60.0F, -50.0F);
        class336.field5036.method548(class85.field1221, -1);
        class336.field5036.method498(class473.field6633);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;I[Ldp;II)I")
    public final int method7(String arg0, int arg1, class319[] arg2, int arg3, int arg4) {
        field5++;
        if (arg4 == 0) {
            arg4 = this.field3;
        }
        int var6 = this.method4(arg0, 1, arg2, class233.field3419, new int[] { arg3 });
        int var7 = (var6 - arg1) * arg4;
        return this.field16 - (-this.field6 - var7);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
    public static void method8(int arg0) {
        field18 = null;
        field9 = null;
        field19 = null;
        if (arg0 == -1) {
            field15 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
    public final int method9(int arg0, int arg1) {
        if (arg1 == 0) {
            field13++;
            return this.field12[arg0] & 0xFF;
        } else {
            return -100;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(CII)I")
    public final int method10(char arg0, int arg1, int arg2) {
        field8++;
        if (arg2 == 15338) {
            return this.field14 == null ? 0 : this.field14[arg1][arg0];
        } else {
            return -99;
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "([B)V")
    public class1(byte[] arg0) {
        class446 var2 = new class446(arg0);
        int var3 = var2.method2628(49152);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2628(49152) == 1;
        this.field12 = new byte[256];
        var2.method2589(256, 0, 94, this.field12);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2628(49152);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2628(49152);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2642(true);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2642(true);
                    var11[var12][var16] = var15;
                }
            }
            this.field14 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field14[var13][var14] = (byte) class90.method699(var11, var7, var5, var9, this.field12, var14, -75, var13);
                        }
                    }
                }
            }
            this.field3 = var5[32] + var7[32];
        } else {
            this.field3 = var2.method2628(49152);
        }
        var2.method2628(49152);
        var2.method2628(49152);
        this.field16 = var2.method2628(49152);
        this.field6 = var2.method2628(49152);
    }

    static {
        new class332("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field17 = 0L;
    }
}
