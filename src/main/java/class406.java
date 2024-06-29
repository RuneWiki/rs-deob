import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class406 {

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[B")
    private byte[] field5772;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public int field5766;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[[B")
    private byte[][] field5761;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public int field5770;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public int field5763;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lss;")
    public static class140 field5768 = new class140(14, -1);

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Lec;")
    public static class40 field5776 = new class40(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "S")
    public static short field5778 = 32767;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Lec;")
    public static class40 field5777 = new class40("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lrg;Ljava/lang/String;III)I")
    public final int method2416(class395[] arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -7563) {
            return -112;
        }
        if (arg4 == 0) {
            arg4 = this.field5766;
        }
        field5771++;
        int var6 = this.method2424(new int[] { arg2 }, class307.field4516, arg1, -101, arg0);
        int var7 = (var6 - 1) * arg4;
        return this.field5763 + var7 + this.field5770;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBC)I")
    public final int method2417(int arg0, byte arg1, char arg2) {
        if (arg1 != -18) {
            this.method2425((byte) 43, -16, (class395[]) null, (String) null);
        }
        field5767++;
        return this.field5761 == null ? 0 : this.field5761[arg0][arg2];
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lrg;Ljava/lang/String;II)I")
    public final int method2418(class395[] arg0, String arg1, int arg2, int arg3) {
        field5773++;
        return arg3 == -1 ? this.method2424(new int[] { arg2 }, class307.field4516, arg1, arg3 - 102, arg0) : 44;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public final int method2419(boolean arg0, String arg1) {
        if (arg0) {
            return -40;
        } else {
            field5769++;
            return this.method2423((class395[]) null, true, arg1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)I")
    public final int method2420(int arg0, boolean arg1) {
        field5765++;
        if (!arg1) {
            field5779 = 101;
        }
        return this.field5772[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lg;Lg;ILg;Lg;)V")
    public static final void method2421(class470 arg0, class470 arg1, int arg2, class470 arg3, class470 arg4) {
        class375.field5351 = arg3;
        field5760++;
        class12.field179 = arg4;
        class101.field1229 = arg1;
        class210.field2901 = arg0;
        class284.field4130 = new class256[class101.field1229.method2756(true)][];
        if (arg2 < -72) {
            class92.field1150 = new boolean[class101.field1229.method2756(true)];
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method2422(int arg0) {
        field5768 = null;
        field5777 = null;
        field5776 = null;
        if (arg0 >= -94) {
            field5779 = 116;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([Lrg;ZLjava/lang/String;)I")
    public final int method2423(class395[] arg0, boolean arg1, String arg2) {
        field5775++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
        int var8 = 0;
        if (!arg1) {
            this.method2420(-61, false);
        }
        while (var8 < var7) {
            char var9 = arg2.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                label82: {
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
                                if (var10.startsWith("img=") && arg0 != null) {
                                    try {
                                        int var11 = class184.method997(var10.substring(4), !arg1);
                                        var5 = -1;
                                        var6 += arg0[var11].method216();
                                    } catch (Exception var12) {
                                    }
                                }
                                break label82;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field5772[class470.method2781((byte) -42, var9) & 0xFF] & 0xFF;
                        if (this.field5761 != null && var5 != -1) {
                            var6 += this.field5761[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            var8++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([I[Ljava/lang/String;Ljava/lang/String;I[Lrg;)I")
    public final int method2424(int[] arg0, String[] arg1, String arg2, int arg3, class395[] arg4) {
        field5764++;
        if (arg2 == null) {
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
        int var14 = arg2.length();
        int var15 = 1 / ((-arg3 - 41) / 33);
        for (int var16 = 0; var16 < var14; var16++) {
            int var17 = class470.method2781((byte) -42, arg2.charAt(var16)) & 0xFF;
            int var18 = 0;
            if (var17 == 60) {
                var11 = var16;
            } else {
                int var19;
                if (var11 == -1) {
                    var19 = var16;
                    var18 += this.method2420(var17, true);
                    if (this.field5761 != null && var12 != -1) {
                        var18 += this.field5761[var12][var17];
                    }
                    var12 = var17;
                } else {
                    if (var17 != 62) {
                        continue;
                    }
                    var19 = var11;
                    String var20 = arg2.substring(var11 + 1, var16);
                    var11 = -1;
                    if (var20.equals("br")) {
                        arg1[var13] = arg2.substring(var7, var16 + 1);
                        var13++;
                        if (var13 >= arg1.length) {
                            return 0;
                        }
                        var6 = 0;
                        var7 = var16 + 1;
                        var8 = -1;
                        var12 = -1;
                        continue;
                    }
                    if (var20.equals("lt")) {
                        var18 += this.method2420(60, true);
                        if (this.field5761 != null && var12 != -1) {
                            var18 += this.field5761[var12][60];
                        }
                        var12 = 60;
                    } else if (var20.equals("gt")) {
                        var18 += this.method2420(62, true);
                        if (this.field5761 != null && var12 != -1) {
                            var18 += this.field5761[var12][62];
                        }
                        var12 = 62;
                    } else if (var20.equals("nbsp")) {
                        var18 += this.method2420(160, true);
                        if (this.field5761 != null && var12 != -1) {
                            var18 += this.field5761[var12][160];
                        }
                        var12 = 160;
                    } else if (var20.equals("shy")) {
                        var18 += this.method2420(173, true);
                        if (this.field5761 != null && var12 != -1) {
                            var18 += this.field5761[var12][173];
                        }
                        var12 = 173;
                    } else if (var20.equals("times")) {
                        var18 += this.method2420(215, true);
                        if (this.field5761 != null && var12 != -1) {
                            var18 += this.field5761[var12][215];
                        }
                        var12 = 215;
                    } else if (var20.equals("euro")) {
                        var18 += this.method2420(8364, true);
                        if (this.field5761 != null && var12 != -1) {
                            var18 += this.field5761[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var20.equals("copy")) {
                        var18 += this.method2420(169, true);
                        if (this.field5761 != null && var12 != -1) {
                            var18 += this.field5761[var12][169];
                        }
                        var12 = 169;
                    } else if (var20.equals("reg")) {
                        var18 += this.method2420(174, true);
                        if (this.field5761 != null && var12 != -1) {
                            var18 += this.field5761[var12][174];
                        }
                        var12 = 174;
                    } else if (var20.startsWith("img=") && arg4 != null) {
                        try {
                            int var21 = class184.method997(var20.substring(4), false);
                            var12 = -1;
                            var18 += arg4[var21].method216();
                        } catch (Exception var22) {
                        }
                    }
                    var17 = -1;
                }
                if (var18 > 0) {
                    var6 += var18;
                    if (arg0 != null) {
                        if (var17 == 32) {
                            var10 = 1;
                            var9 = var6;
                            var8 = var16;
                        }
                        if (var6 > arg0[arg0.length > var13 ? var13 : arg0.length - 1]) {
                            if (var8 >= 0) {
                                arg1[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg1.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            } else {
                                arg1[var13] = arg2.substring(var7, var19);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var12 = -1;
                                var7 = var19;
                                var8 = -1;
                                var6 = var18;
                            }
                        }
                        if (var17 == 45) {
                            var8 = var16;
                            var9 = var6;
                            var10 = 0;
                        }
                    }
                }
            }
        }
        if (var7 < arg2.length()) {
            arg1[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI[Lrg;Ljava/lang/String;)I")
    public final int method2425(byte arg0, int arg1, class395[] arg2, String arg3) {
        field5774++;
        int var5 = this.method2424(new int[] { arg1 }, class307.field4516, arg3, -82, arg2);
        int var6 = 0;
        int var7 = 108 / ((-arg0 - 41) / 52);
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method2423(arg2, true, class307.field4516[var8]);
            if (var6 < var9) {
                var6 = var9;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "([B)V")
    public class406(byte[] arg0) {
        class179 var2 = new class179(arg0);
        int var3 = var2.method895((byte) -82);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method895((byte) -85) == 1;
        this.field5772 = new byte[256];
        var2.method919(false, this.field5772, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method895((byte) -105);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method895((byte) -95);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method922(32429);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method922(32429);
                    var11[var12][var16] = var15;
                }
            }
            this.field5761 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5761[var13][var14] = (byte) class79.method396(var7, var9, var14, (byte) 92, var13, var11, this.field5772, var5);
                        }
                    }
                }
            }
            this.field5766 = var5[32] + var7[32];
        } else {
            this.field5766 = var2.method895((byte) -82);
        }
        var2.method895((byte) -104);
        var2.method895((byte) -84);
        this.field5770 = var2.method895((byte) -83);
        this.field5763 = var2.method895((byte) -84);
    }
}
