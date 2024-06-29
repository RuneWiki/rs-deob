import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class645 {

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "[B")
    private byte[] field9137;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field9128;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[[B")
    private byte[][] field9126;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field9130;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public int field9123;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lpca;")
    public static class653 field9139 = new class653(200);

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lvd;")
    public static class36 field9140 = new class36();

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lpr;")
    public static class407 field9141 = new class407(104, 8);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Lxa;Ljava/lang/String;I)Ljava/lang/String;")
    public final String method3616(int arg0, class458[] arg1, String arg2, int arg3) {
        field9127++;
        if (arg3 >= this.method3624(125, arg2, arg1)) {
            return arg2;
        }
        int var5 = arg3 - this.method3624(117, "...", null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = arg2.length();
        String var10 = "";
        for (int var11 = arg0; var11 < var9; var11++) {
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
                            if (var13.startsWith("img=") && arg1 != null) {
                                try {
                                    int var14 = class399.method2185(var13.substring(4), (byte) -34);
                                    var8 += arg1[var14].method418();
                                    var7 = -1;
                                    if (var5 < var8) {
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
                    var8 += this.field9137[class289.method1637(var12, (byte) -126) & 0xFF] & 0xFF;
                    if (this.field9126 != null && var7 != -1) {
                        var8 += this.field9126[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field9126 != null) {
                        var15 = this.field9126[var12][46] + var8;
                    }
                    if (var5 < var15) {
                        return var10 + "...";
                    }
                    var10 = arg2.substring(0, var11 + 1);
                }
            }
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;I[Lxa;)I")
    public final int method3617(int arg0, String arg1, int arg2, class458[] arg3) {
        field9134++;
        int var5 = this.method3621(arg1, arg3, 1, class93.field1052, new int[] { arg2 });
        int var6 = arg0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method3624(119, class93.field1052[var7], arg3);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([Lxa;IILjava/lang/String;)I")
    public final int method3618(class458[] arg0, int arg1, int arg2, String arg3) {
        field9136++;
        return arg2 == 3 ? this.method3621(arg3, arg0, 1, class93.field1052, new int[] { arg1 }) : -128;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
    public final int method3619(int arg0, int arg1) {
        field9132++;
        if (arg0 != 255) {
            this.method3618(null, -53, 34, null);
        }
        return this.field9137[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)[Llc;")
    public static final class590[] method3620(byte arg0) {
        if (arg0 == -121) {
            field9124++;
            return new class590[] { class523.field7486, class245.field3170, class414.field5487 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;[Lxa;I[Ljava/lang/String;[I)I")
    public final int method3621(String arg0, class458[] arg1, int arg2, String[] arg3, int[] arg4) {
        field9135++;
        if (arg0 == null) {
            return 0;
        }
        if (arg2 != 1) {
            this.method3624(-67, null, null);
        }
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
            int var16 = class289.method1637(arg0.charAt(var15), (byte) -126) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method3619(arg2 ^ 0xFE, var16);
                    var18 = var15;
                    if (this.field9126 != null && var12 != -1) {
                        var17 += this.field9126[var12][var16];
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
                        var12 = -1;
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method3619(arg2 ^ 0xFE, 60);
                        if (this.field9126 != null && var12 != -1) {
                            var17 += this.field9126[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method3619(255, 62);
                        if (this.field9126 != null && var12 != -1) {
                            var17 += this.field9126[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method3619(arg2 ^ 0xFE, 160);
                        if (this.field9126 != null && var12 != -1) {
                            var17 += this.field9126[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method3619(255, 173);
                        if (this.field9126 != null && var12 != -1) {
                            var17 += this.field9126[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method3619(255, 215);
                        if (this.field9126 != null && var12 != -1) {
                            var17 += this.field9126[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method3619(arg2 + 254, 8364);
                        if (this.field9126 != null && var12 != -1) {
                            var17 += this.field9126[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method3619(255, 169);
                        if (this.field9126 != null && var12 != -1) {
                            var17 += this.field9126[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method3619(arg2 + 254, 174);
                        if (this.field9126 != null && var12 != -1) {
                            var17 += this.field9126[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class399.method2185(var19.substring(4), (byte) -34);
                            var17 += arg1[var20].method418();
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
                            var10 = 1;
                            var9 = var6;
                            var8 = var15;
                        }
                        if (arg4[arg4.length > var13 ? var13 : arg4.length - 1] < var6) {
                            if (var8 < 0) {
                                arg3[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var18;
                                var12 = -1;
                                var6 = var17;
                                var8 = -1;
                            } else {
                                arg3[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var8 = -1;
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
        if (arg0.length() > var7) {
            arg3[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method3622(int arg0, String arg1) {
        if (arg0 != 62) {
            this.method3619(92, 91);
        }
        field9138++;
        return this.method3624(117, arg1, null);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(FIIIFFBI)[F")
    public static final float[] method3623(float arg0, int arg1, int arg2, int arg3, float arg4, float arg5, byte arg6, int arg7) {
        field9125++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[8] = var10;
        var8[0] = var10;
        var8[6] = -var11;
        var8[5] = 0.0F;
        var8[1] = 0.0F;
        var8[3] = 0.0F;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        var8[2] = var11;
        var8[7] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg7 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + arg3 * arg3));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg1) / var19;
                var15 = (float) arg3 / var19;
            }
            var13[3] = -var15 * var17;
            var13[7] = -var14 * var17;
            var13[5] = var14 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[6] = var14 * var15 * var18;
            var13[0] = var14 * var14 * var18 + var16;
            var13[4] = var16;
            var13[1] = var15 * var17;
            var13[2] = var14 * var15 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        if (arg6 != 13) {
            return null;
        }
        var9[5] *= arg4;
        var9[7] *= arg5;
        var9[0] *= arg0;
        var9[2] *= arg0;
        var9[3] *= arg4;
        var9[4] *= arg4;
        var9[8] *= arg5;
        var9[1] *= arg0;
        var9[6] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;[Lxa;)I")
    public final int method3624(int arg0, String arg1, class458[] arg2) {
        field9133++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        int var8 = 0;
        if (arg0 < 111) {
            this.method3618(null, -122, -25, null);
        }
        while (var8 < var7) {
            char var9 = arg1.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                label78: {
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
                                        int var11 = class399.method2185(var10.substring(4), (byte) -34);
                                        var6 += arg2[var11].method418();
                                        var5 = -1;
                                    } catch (Exception var12) {
                                    }
                                }
                                break label78;
                            }
                            var9 = '®';
                        }
                    }
                    if (var4 == -1) {
                        var6 += this.field9137[class289.method1637(var9, (byte) -127) & 0xFF] & 0xFF;
                        if (this.field9126 != null && var5 != -1) {
                            var6 += this.field9126[var5][var9];
                        }
                        var5 = var9;
                    }
                }
            }
            var8++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/String;I[Lxa;I)I")
    public final int method3625(int arg0, String arg1, int arg2, class458[] arg3, int arg4) {
        if (arg4 == 0) {
            arg4 = this.field9128;
        }
        field9131++;
        int var6 = this.method3621(arg1, arg3, arg2 ^ 0xFFFFFFFE, class93.field1052, new int[] { arg0 });
        int var7 = (arg2 + var6) * arg4;
        return this.field9130 + this.field9123 + var7;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ICB)I")
    public final int method3626(int arg0, char arg1, byte arg2) {
        if (arg2 < 35) {
            this.method3624(86, null, null);
        }
        field9129++;
        return this.field9126 == null ? 0 : this.field9126[arg0][arg1];
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
    public class645(byte[] arg0) {
        class452 var2 = new class452(arg0);
        int var3 = var2.method2541(45);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2541(85) == 1;
        this.field9137 = new byte[256];
        var2.method2552(0, 4, 256, this.field9137);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2541(58);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2541(47);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2547(true);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2547(true);
                    var11[var12][var16] = var15;
                }
            }
            this.field9126 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field9126[var13][var14] = (byte) class5.method20(var6, var9, var11, var14, this.field9137, (byte) 31, var13, var5);
                        }
                    }
                }
            }
            this.field9128 = var6[32] + var5[32];
        } else {
            this.field9128 = var2.method2541(83);
        }
        var2.method2541(58);
        var2.method2541(85);
        this.field9130 = var2.method2541(47);
        this.field9123 = var2.method2541(126);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static void method3627(byte arg0) {
        field9139 = null;
        field9140 = null;
        field9141 = null;
        if (arg0 > -92) {
            method3620((byte) 31);
        }
    }
}
