import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class658 {

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "[B")
    private byte[] field9373;

    @OriginalMember(owner = "client!aga", name = "p", descriptor = "[[B")
    private byte[][] field9380;

    @OriginalMember(owner = "client!aga", name = "r", descriptor = "I")
    public int field9382;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
    public int field9375;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public int field9366;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "[Lnt;")
    public static class493[] field9369 = new class493[14];

    @OriginalMember(owner = "client!aga", name = "q", descriptor = "[F")
    public static float[] field9381 = new float[16];

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBC)I", line = 3)
    public final int method3757(int arg0, byte arg1, char arg2) {
        field9370++;
        if (arg1 != 114) {
            method3763((byte) 15);
        }
        return this.field9380 == null ? 0 : this.field9380[arg0][arg2];
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I[Lf;Ljava/lang/String;I)I", line = 18)
    public final int method3758(int arg0, class532[] arg1, String arg2, int arg3) {
        field9377++;
        if (arg0 != 169) {
            field9381 = null;
        }
        return this.method3760(new int[] { arg3 }, 1499, class16.field216, arg2, arg1);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIILjava/lang/String;[Lf;)I", line = 29)
    public final int method3759(int arg0, int arg1, int arg2, String arg3, class532[] arg4) {
        field9367++;
        if (arg0 == 0) {
            arg0 = this.field9382;
        }
        int var6 = this.method3760(new int[] { arg2 }, 1499, class16.field216, arg3, arg4);
        int var7 = (var6 - arg1) * arg0;
        return this.field9375 + this.field9366 + var7;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "([II[Ljava/lang/String;Ljava/lang/String;[Lf;)I", line = 50)
    public final int method3760(int[] arg0, int arg1, String[] arg2, String arg3, class532[] arg4) {
        field9365++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        if (arg1 != 1499) {
            return -38;
        }
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class63.method368((byte) -118, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method3762(var16, (byte) 114);
                    if (this.field9380 != null && var12 != -1) {
                        var17 += this.field9380[var12][var16];
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
                        arg2[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (arg2.length <= var13) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var6 = 0;
                        var12 = -1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3762(60, (byte) 121);
                        if (this.field9380 != null && var12 != -1) {
                            var17 += this.field9380[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3762(62, (byte) 110);
                        if (this.field9380 != null && var12 != -1) {
                            var17 += this.field9380[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3762(160, (byte) 116);
                        if (this.field9380 != null && var12 != -1) {
                            var17 += this.field9380[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3762(173, (byte) 124);
                        if (this.field9380 != null && var12 != -1) {
                            var17 += this.field9380[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3762(215, (byte) 116);
                        if (this.field9380 != null && var12 != -1) {
                            var17 += this.field9380[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3762(8364, (byte) 109);
                        if (this.field9380 != null && var12 != -1) {
                            var17 += this.field9380[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3762(169, (byte) 118);
                        if (this.field9380 != null && var12 != -1) {
                            var17 += this.field9380[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3762(174, (byte) 107);
                        if (this.field9380 != null && var12 != -1) {
                            var17 += this.field9380[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class289.method1717(var19.substring(4), -92);
                            var17 += arg4[var20].method523();
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
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg0[arg0.length <= var13 ? arg0.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg2[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (arg2.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var8 = -1;
                                var6 = var17;
                                var7 = var18;
                            } else {
                                arg2[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            }
                        }
                        if (var16 == 45) {
                            var8 = var15;
                            var9 = var6;
                            var10 = 0;
                        }
                    }
                }
            }
        }
        if (var7 < arg3.length()) {
            arg2[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V", line = 301)
    public static final void method3761(int arg0, int arg1, int arg2, Object[] arg3, int[] arg4) {
        field9372++;
        if (arg2 != 0) {
            method3763((byte) -6);
        }
        if (arg1 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg1;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var7;
        Object var8 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg0; var10++) {
            if ((var7 + (var10 & var9)) > arg4[var10]) {
                int var11 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6] = var11;
                Object var12 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var12;
            }
        }
        arg4[arg0] = arg4[var6];
        arg4[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var8;
        method3761(var6 - 1, arg1, 0, arg3, arg4);
        method3761(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IB)I", line = 357)
    public final int method3762(int arg0, byte arg1) {
        if (arg1 < 106) {
            field9381 = null;
        }
        field9376++;
        return this.field9373[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V", line = 370)
    public static void method3763(byte arg0) {
        field9369 = null;
        field9381 = null;
        if (arg0 > -115) {
            method3766(false, -122, (byte) 103, 114);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IILjava/lang/String;[Lf;)Ljava/lang/String;", line = 381)
    public final String method3764(int arg0, int arg1, String arg2, class532[] arg3) {
        field9374++;
        if (arg0 >= this.method3767(arg3, arg2, 17674)) {
            return arg2;
        }
        int var5 = arg0 - this.method3767(null, "...", arg1 ^ 0x45A3);
        int var6 = -1;
        if (arg1 != 169) {
            this.field9366 = -84;
        }
        int var7 = -1;
        int var8 = 0;
        int var9 = arg2.length();
        String var10 = "";
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = arg2.charAt(var11);
            if (var12 == '<') {
                var6 = var11;
            } else {
                if (var12 == '>' && var6 != -1) {
                    String var13 = arg2.substring(var6 + 1, var11);
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
                                    int var14 = class289.method1717(var13.substring(4), arg1 ^ 0xFFFFFF01);
                                    var8 += arg3[var14].method523();
                                    var7 = -1;
                                    if (var8 > var5) {
                                        return var10 + "...";
                                    }
                                    var10 = arg2.substring(0, var11 + 1);
                                } catch (Exception var16) {
                                }
                            }
                            continue;
                        }
                        var12 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field9373[class63.method368((byte) -118, var12) & 0xFF] & 0xFF;
                    if (this.field9380 != null && var7 != -1) {
                        var8 += this.field9380[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field9380 != null) {
                        var15 = this.field9380[var12][46] + var8;
                    }
                    if (var15 > var5) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 510)
    public final int method3765(String arg0, byte arg1) {
        if (arg1 != 6) {
            this.method3758(74, null, null, -40);
        }
        field9379++;
        return this.method3767(null, arg0, 17674);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZIBI)I", line = 521)
    public static final int method3766(boolean arg0, int arg1, byte arg2, int arg3) {
        field9378++;
        class16 var4 = class351.method2078(0, arg0, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && var4.field212.length > arg1) {
            return arg2 < 70 ? -2 : var4.field212[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "([Lf;Ljava/lang/String;I)I", line = 545)
    public final int method3767(class532[] arg0, String arg1, int arg2) {
        field9371++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        if (arg2 != 17674) {
            this.method3762(-66, (byte) -58);
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class289.method1717(var10.substring(4), -108);
                                    var6 += arg0[var11].method523();
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
                    var6 += this.field9373[class63.method368((byte) -118, var9) & 0xFF] & 0xFF;
                    if (this.field9380 != null && var5 != -1) {
                        var6 += this.field9380[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I[Lf;ILjava/lang/String;)I", line = 651)
    public final int method3768(int arg0, class532[] arg1, int arg2, String arg3) {
        field9368++;
        if (arg0 != 30061) {
            this.method3757(85, (byte) 22, (char) 65429);
        }
        int var5 = this.method3760(new int[] { arg2 }, 1499, class16.field216, arg3, arg1);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method3767(arg1, class16.field216[var7], 17674);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "([B)V", line = 687)
    public class658(byte[] arg0) {
        class157 var2 = new class157(arg0);
        int var3 = var2.method930(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method930(255) == 1;
        this.field9373 = new byte[256];
        var2.method962(this.field9373, -111, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method930(255);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method930(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method969(3);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method969(3);
                    var11[var12][var16] = var15;
                }
            }
            this.field9380 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field9380[var13][var14] = (byte) class581.method3203(var13, var11, var14, var7, var9, var5, this.field9373, 1624159016);
                        }
                    }
                }
            }
            this.field9382 = var5[32] + var7[32];
        } else {
            this.field9382 = var2.method930(255);
        }
        var2.method930(255);
        var2.method930(255);
        this.field9375 = var2.method930(255);
        this.field9366 = var2.method930(255);
    }
}
