import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class50 {

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "[B")
    private byte[] field828;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "[[B")
    private byte[][] field841;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "[[B")
    public static byte[][] field830;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "[[[I")
    public static int[][][] field831;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)I", line = 4)
    public final int method547(int arg0, int arg1) {
        field827++;
        if (arg1 != 11724) {
            this.method554(null, -108, -94, null);
        }
        return this.field828[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V", line = 15)
    public static void method548(int arg0) {
        field830 = null;
        field831 = null;
        if (arg0 != -16073) {
            method548(-59);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BCI)I", line = 30)
    public final int method549(byte arg0, char arg1, int arg2) {
        field840++;
        if (arg0 < 125) {
            this.field841 = null;
        }
        return this.field841 == null ? 0 : this.field841[arg2][arg1];
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;[Lf;[IB)I", line = 50)
    public final int method550(String arg0, String[] arg1, class701[] arg2, int[] arg3, byte arg4) {
        field838++;
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
        if (arg4 != 107) {
            return 4;
        }
        int var13 = 0;
        int var14 = arg0.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class49.method545(arg0.charAt(var15), true) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method547(var16, 11724);
                    var18 = var15;
                    if (this.field841 != null && var12 != -1) {
                        var17 += this.field841[var12][var16];
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
                        arg1[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (arg1.length <= var13) {
                            return 0;
                        }
                        var12 = -1;
                        var6 = 0;
                        var8 = -1;
                        var7 = var15 + 1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method547(60, 11724);
                        if (this.field841 != null && var12 != -1) {
                            var17 += this.field841[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method547(62, 11724);
                        if (this.field841 != null && var12 != -1) {
                            var17 += this.field841[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method547(160, 11724);
                        if (this.field841 != null && var12 != -1) {
                            var17 += this.field841[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method547(173, arg4 + 11617);
                        if (this.field841 != null && var12 != -1) {
                            var17 += this.field841[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method547(215, 11724);
                        if (this.field841 != null && var12 != -1) {
                            var17 += this.field841[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method547(8364, arg4 ^ 0x2DA7);
                        if (this.field841 != null && var12 != -1) {
                            var17 += this.field841[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method547(169, 11724);
                        if (this.field841 != null && var12 != -1) {
                            var17 += this.field841[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method547(174, 11724);
                        if (this.field841 != null && var12 != -1) {
                            var17 += this.field841[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class79.method663(10, var19.substring(4));
                            var12 = -1;
                            var17 += arg2[var20].method896();
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
                        if (arg3[arg3.length <= var13 ? arg3.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg1[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            } else {
                                arg1[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (var13 >= arg1.length) {
                                    return 0;
                                }
                                var7 = var18;
                                var8 = -1;
                                var6 = var17;
                                var12 = -1;
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
            arg1[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I[Lf;Ljava/lang/String;Z)I", line = 301)
    public final int method551(int arg0, class701[] arg1, String arg2, boolean arg3) {
        field839++;
        if (!arg3) {
            return 14;
        }
        int var5 = this.method550(arg2, class473.field6624, arg1, new int[] { arg0 }, (byte) 107);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method552(class473.field6624[var7], -1, arg1);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;I[Lf;)I", line = 333)
    public final int method552(String arg0, int arg1, class701[] arg2) {
        field835++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = arg1;
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
                                    int var11 = class79.method663(10, var10.substring(4));
                                    var6 += arg2[var11].method896();
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
                    var6 += this.field828[class49.method545(var9, true) & 0xFF] & 0xFF;
                    if (this.field841 != null && var5 != -1) {
                        var6 += this.field841[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 434)
    public final int method553(String arg0, int arg1) {
        field836++;
        int var3 = -97 % ((arg1 - 16) / 33);
        return this.method552(arg0, -1, null);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;II[Lf;)I", line = 450)
    public final int method554(String arg0, int arg1, int arg2, class701[] arg3) {
        if (arg1 != 6114) {
            this.field833 = 122;
        }
        field834++;
        return this.method550(arg0, class473.field6624, arg3, new int[] { arg2 }, (byte) 107);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IILjava/lang/String;[Lf;I)I", line = 461)
    public final int method555(int arg0, int arg1, String arg2, class701[] arg3, int arg4) {
        field826++;
        if (arg4 == 0) {
            arg4 = this.field832;
        }
        int var6 = this.method550(arg2, class473.field6624, arg3, new int[] { arg1 }, (byte) 107);
        int var7 = (var6 - arg0) * arg4;
        return this.field833 + var7 + this.field829;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;[Lf;II)Ljava/lang/String;", line = 477)
    public final String method556(String arg0, class701[] arg1, int arg2, int arg3) {
        field837++;
        if (this.method552(arg0, -1, arg1) <= arg3) {
            return arg0;
        }
        int var5 = arg3 - this.method552("...", -1, null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg0.length();
        String var10 = "";
        for (int var11 = arg2; var11 < var9; var11++) {
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
                                    int var14 = class79.method663(10, var13.substring(4));
                                    var7 = -1;
                                    var8 += arg1[var14].method896();
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
                    var8 += this.field828[class49.method545(var12, true) & 0xFF] & 0xFF;
                    if (this.field841 != null && var7 != -1) {
                        var8 += this.field841[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field841 != null) {
                        var15 = this.field841[var12][46] + var8;
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

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "([B)V", line = 602)
    public class50(byte[] arg0) {
        class389 var2 = new class389(arg0);
        int var3 = var2.method2229(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2229(255) == 1;
        this.field828 = new byte[256];
        var2.method2250(-1, 256, this.field828, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2229(255);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2229(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2249((byte) -70);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2249((byte) -70);
                    var11[var12][var16] = var15;
                }
            }
            this.field841 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field841[var13][var14] = (byte) class28.method385(var6, var9, var14, false, var13, var11, var5, this.field828);
                        }
                    }
                }
            }
            this.field832 = var6[32] + var5[32];
        } else {
            this.field832 = var2.method2229(255);
        }
        var2.method2229(255);
        var2.method2229(255);
        this.field829 = var2.method2229(255);
        this.field833 = var2.method2229(255);
    }
}
