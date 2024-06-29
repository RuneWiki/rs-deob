import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class323 {

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "[B")
    private byte[] field4599;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "[[B")
    private byte[][] field4596;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public int field4594;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field4588 = -1;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "[I")
    public static int[] field4590 = new int[1024];

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lkr;Ljava/lang/String;)I", line = 3)
    public final int method2068(int arg0, class743[] arg1, String arg2) {
        field4592++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = arg0;
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
                                    int var11 = class547.method3226((byte) 58, var10.substring(4));
                                    var6 += arg1[var11].method82();
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
                    var6 += this.field4599[class240.method1617(arg0 + 16698, var9) & 0xFF] & 0xFF;
                    if (this.field4596 != null && var5 != -1) {
                        var6 += this.field4596[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ICI)I", line = 106)
    public final int method2069(int arg0, char arg1, int arg2) {
        if (arg2 != 8448) {
            this.method2078(29, null, 100, null);
        }
        field4593++;
        return this.field4596 == null ? 0 : this.field4596[arg0][arg1];
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lkr;[I[Ljava/lang/String;Ljava/lang/String;)I", line = 131)
    public final int method2070(int arg0, class743[] arg1, int[] arg2, String[] arg3, String arg4) {
        field4597++;
        if (arg4 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        if (arg0 < 95) {
            return 31;
        }
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class240.method1617(16697, arg4.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2071(true, var16);
                    if (this.field4596 != null && var12 != -1) {
                        var17 += this.field4596[var12][var16];
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
                        arg3[var13] = arg4.substring(var7, var15 + 1);
                        var13++;
                        if (arg3.length <= var13) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var6 = 0;
                        var8 = -1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2071(true, 60);
                        if (this.field4596 != null && var12 != -1) {
                            var17 += this.field4596[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2071(true, 62);
                        if (this.field4596 != null && var12 != -1) {
                            var17 += this.field4596[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2071(true, 160);
                        if (this.field4596 != null && var12 != -1) {
                            var17 += this.field4596[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2071(true, 173);
                        if (this.field4596 != null && var12 != -1) {
                            var17 += this.field4596[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2071(true, 215);
                        if (this.field4596 != null && var12 != -1) {
                            var17 += this.field4596[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2071(true, 8364);
                        if (this.field4596 != null && var12 != -1) {
                            var17 += this.field4596[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2071(true, 169);
                        if (this.field4596 != null && var12 != -1) {
                            var17 += this.field4596[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2071(true, 174);
                        if (this.field4596 != null && var12 != -1) {
                            var17 += this.field4596[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class547.method3226((byte) -117, var19.substring(4));
                            var12 = -1;
                            var17 += arg1[var20].method82();
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
                        if (var6 > arg2[arg2.length <= var13 ? arg2.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg3[var13] = arg4.substring(var7, var18);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var7 = var18;
                                var8 = -1;
                                var6 = var17;
                                var12 = -1;
                            } else {
                                arg3[var13] = arg4.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
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
        if (arg4.length() > var7) {
            arg3[var13] = arg4.substring(var7, arg4.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)I", line = 390)
    public final int method2071(boolean arg0, int arg1) {
        field4589++;
        return arg0 ? this.field4599[arg1] & 0xFF : 48;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lkr;Ljava/lang/String;B)I", line = 401)
    public final int method2072(int arg0, class743[] arg1, String arg2, byte arg3) {
        field4591++;
        int var5 = this.method2070(arg3 + 84, arg1, new int[] { arg0 }, class103.field1724, arg2);
        int var6 = 0;
        if (arg3 != 40) {
            this.field4599 = null;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2068(-1, arg1, class103.field1724[var7]);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 431)
    public static void method2073(int arg0) {
        field4590 = null;
        int var1 = -92 % ((arg0 - 78) / 46);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "()V", line = 442)
    public static final void method2074() {
        for (int var0 = 0; var0 < class586.field8252; var0++) {
            class113 var1 = class120.field1870[var0];
            class395.method2453(var1, true);
            class120.field1870[var0] = null;
        }
        class586.field8252 = 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 456)
    public final int method2075(boolean arg0, String arg1) {
        if (arg0) {
            return 62;
        } else {
            field4600++;
            return this.method2068(-1, null, arg1);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjava/lang/String;[Lkr;I)I", line = 467)
    public final int method2076(int arg0, String arg1, class743[] arg2, int arg3) {
        field4595++;
        return arg3 == 60 ? this.method2070(107, arg2, new int[] { arg0 }, class103.field1724, arg1) : 88;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lkr;IILjava/lang/String;)I", line = 482)
    public final int method2077(int arg0, class743[] arg1, int arg2, int arg3, String arg4) {
        field4587++;
        if (arg2 == 0) {
            arg2 = this.field4601;
        }
        int var6 = this.method2070(113, arg1, new int[] { arg3 }, class103.field1724, arg4);
        int var7 = (arg0 + var6) * arg2;
        return this.field4594 + this.field4586 + var7;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lkr;ILjava/lang/String;)Ljava/lang/String;", line = 498)
    public final String method2078(int arg0, class743[] arg1, int arg2, String arg3) {
        field4598++;
        if (this.method2068(-1, arg1, arg3) <= arg0) {
            return arg3;
        }
        int var5 = arg0 - this.method2068(arg2 - 2, null, "...");
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg3.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg3.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg3.substring(var6 + 1, var11);
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
                                    int var14 = class547.method3226((byte) 14, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg1[var14].method82();
                                    if (var5 < var8) {
                                        return var10 + "...";
                                    }
                                    var10 = arg3.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field4599[class240.method1617(arg2 ^ 0x4138, var12) & 0xFF] & 0xFF;
                    if (this.field4596 != null && var7 != -1) {
                        var8 += this.field4596[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field4596 != null) {
                        var15 = this.field4596[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg3.substring(0, var11 + 1);
                }
            }
        }
        if (arg2 != 1) {
            this.field4596 = null;
        }
        return arg3;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "([B)V", line = 629)
    public class323(byte[] arg0) {
        class35 var2 = new class35(arg0);
        int var3 = var2.method273(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method273(255) == 1;
        this.field4599 = new byte[256];
        var2.method260(this.field4599, 117, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method273(255);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method273(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method277((byte) 90);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method277((byte) -8);
                    var11[var12][var16] = var15;
                }
            }
            this.field4596 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4596[var13][var14] = (byte) class143.method1121(var11, this.field4599, var7, var5, var9, var14, (byte) 95, var13);
                        }
                    }
                }
            }
            this.field4601 = var5[32] + var7[32];
        } else {
            this.field4601 = var2.method273(255);
        }
        var2.method273(255);
        var2.method273(255);
        this.field4594 = var2.method273(255);
        this.field4586 = var2.method273(255);
    }
}
