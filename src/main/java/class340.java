import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class340 {

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "[B")
    private byte[] field5309;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "[[B")
    private byte[][] field5297;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public int field5304;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public int field5295;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "Lbi;")
    public static class104 field5310 = new class104(12, 8);

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "Lss;")
    public static class213 field5312 = new class213("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method2250(int arg0) {
        field5312 = null;
        if (arg0 == 32) {
            field5310 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lo;Ljava/lang/String;II)Ljava/lang/String;")
    public final String method2251(class139[] arg0, String arg1, int arg2, int arg3) {
        field5300++;
        if (arg2 >= this.method2255(arg1, arg0, 169)) {
            return arg1;
        }
        int var5 = arg2 - this.method2255("...", null, 169);
        int var6 = -1;
        int var7 = -1;
        int var8 = arg3;
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
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class170.method1078(arg3 - 113, var13.substring(4));
                                    var8 += arg0[var14].method623();
                                    var7 = -1;
                                    if (var5 < var8) {
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
                    var8 += this.field5309[class345.method2283(23251, var12) & 0xFF] & 0xFF;
                    if (this.field5297 != null && var7 != -1) {
                        var8 += this.field5297[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field5297 != null) {
                        var15 = this.field5297[var12][46] + var8;
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

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2252(String arg0, int arg1) {
        field5303++;
        return arg1 == 0 ? this.method2255(arg0, null, 169) : -94;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;[Lo;IIZ)I")
    public final int method2253(String arg0, class139[] arg1, int arg2, int arg3, boolean arg4) {
        field5305++;
        if (!arg4) {
            this.method2251(null, null, -55, 123);
        }
        if (arg3 == 0) {
            arg3 = this.field5302;
        }
        int var6 = this.method2260(arg0, 215, arg1, class30.field321, new int[] { arg2 });
        int var7 = (var6 - 1) * arg3;
        return this.field5295 + var7 + this.field5304;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lo;ILjava/lang/String;I)I")
    public final int method2254(class139[] arg0, int arg1, String arg2, int arg3) {
        field5307++;
        int var5 = this.method2260(arg2, 215, arg0, class30.field321, new int[] { arg1 });
        int var6 = 13 / ((arg3 - 51) / 42);
        int var7 = 0;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method2255(class30.field321[var8], arg0, 169);
            if (var7 < var9) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;[Lo;I)I")
    public final int method2255(String arg0, class139[] arg1, int arg2) {
        field5306++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        if (arg2 != 169) {
            this.method2255(null, null, 51);
        }
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
                                    int var11 = class170.method1078(-109, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg1[var11].method623();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field5309[class345.method2283(arg2 ^ 0x5A7A, var9) & 0xFF] & 0xFF;
                    if (this.field5297 != null && var5 != -1) {
                        var6 += this.field5297[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)I")
    public final int method2256(int arg0, byte arg1) {
        if (arg1 < 27) {
            method2250(123);
        }
        field5296++;
        return this.field5309[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(CII)I")
    public final int method2257(char arg0, int arg1, int arg2) {
        int var4 = 11 % ((arg1 + 62) / 56);
        field5298++;
        return this.field5297 == null ? 0 : this.field5297[arg2][arg0];
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(IB)I")
    public static final int method2258(int arg0, byte arg1) {
        field5301++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg1 >= -61) {
            return 78;
        } else {
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return ~var7 & arg0;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "([B)V")
    public class340(byte[] arg0) {
        class208 var2 = new class208(arg0);
        int var3 = var2.method1445(-89);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1445(-101) == 1;
        this.field5309 = new byte[256];
        var2.method1471(256, true, this.field5309, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1445(-95);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1445(93);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1427(false);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1427(false);
                    var11[var12][var16] = var15;
                }
            }
            this.field5297 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5297[var13][var14] = (byte) class526.method3133(var5, var9, var13, -104, var14, var7, this.field5309, var11);
                        }
                    }
                }
            }
            this.field5302 = var5[32] + var7[32];
        } else {
            this.field5302 = var2.method1445(57);
        }
        var2.method1445(80);
        var2.method1445(-86);
        this.field5304 = var2.method1445(58);
        this.field5295 = var2.method1445(120);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I[Lo;ILjava/lang/String;)I")
    public final int method2259(int arg0, class139[] arg1, int arg2, String arg3) {
        field5299++;
        if (arg0 != 7007) {
            this.method2259(51, null, 76, null);
        }
        return this.method2260(arg3, 215, arg1, class30.field321, new int[] { arg2 });
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;I[Lo;[Ljava/lang/String;[I)I")
    public final int method2260(String arg0, int arg1, class139[] arg2, String[] arg3, int[] arg4) {
        field5308++;
        if (arg0 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        if (arg1 != 215) {
            this.method2257('g', -34, 71);
        }
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class345.method2283(23251, arg0.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2256(var16, (byte) 47);
                    if (this.field5297 != null && var12 != -1) {
                        var17 += this.field5297[var12][var16];
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
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2256(60, (byte) 69);
                        if (this.field5297 != null && var12 != -1) {
                            var17 += this.field5297[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2256(62, (byte) 74);
                        if (this.field5297 != null && var12 != -1) {
                            var17 += this.field5297[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2256(160, (byte) 81);
                        if (this.field5297 != null && var12 != -1) {
                            var17 += this.field5297[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2256(173, (byte) 95);
                        if (this.field5297 != null && var12 != -1) {
                            var17 += this.field5297[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2256(215, (byte) 55);
                        if (this.field5297 != null && var12 != -1) {
                            var17 += this.field5297[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2256(8364, (byte) 28);
                        if (this.field5297 != null && var12 != -1) {
                            var17 += this.field5297[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2256(169, (byte) 39);
                        if (this.field5297 != null && var12 != -1) {
                            var17 += this.field5297[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2256(174, (byte) 124);
                        if (this.field5297 != null && var12 != -1) {
                            var17 += this.field5297[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class170.method1078(arg1 ^ 0xFFFFFF58, var19.substring(4));
                            var17 += arg2[var20].method623();
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
                            var8 = var15;
                            var10 = 1;
                            var9 = var6;
                        }
                        if (arg4[var13 < arg4.length ? var13 : arg4.length - 1] < var6) {
                            if (var8 < 0) {
                                arg3[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var6 = var17;
                                var12 = -1;
                                var8 = -1;
                                var7 = var18;
                            } else {
                                arg3[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var6 -= var9;
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
        if (var7 < arg0.length()) {
            arg3[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }
}
