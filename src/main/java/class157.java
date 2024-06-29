import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class157 {

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[B")
    private byte[] field2043;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "[[B")
    private byte[][] field2041;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "[F")
    public static float[] field2047;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lvda;")
    public static class311 field2045;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "Luv;")
    public static class3 field2048;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method850(byte arg0) {
        field2048 = null;
        field2045 = null;
        if (arg0 < 37) {
            field2032 = 113;
        }
        field2047 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lha;ILjava/lang/String;I)Ljava/lang/String;")
    public final String method851(class116[] arg0, int arg1, String arg2, int arg3) {
        field2030++;
        if (arg1 >= this.method853(arg2, arg0, 1)) {
            return arg2;
        }
        int var5 = arg1 - this.method853("...", null, arg3 + 2);
        int var6 = -1;
        int var7 = arg3;
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
                            if (var13.startsWith("img=") && arg0 != null) {
                                try {
                                    int var14 = class254.method1532(var13.substring(4), 2);
                                    var8 += arg0[var14].method627();
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
                    var8 += this.field2043[class373.method2274(false, var12) & 0xFF] & 0xFF;
                    if (this.field2041 != null && var7 != -1) {
                        var8 += this.field2041[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field2041 != null) {
                        var15 = this.field2041[var12][46] + var8;
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

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIC)I")
    public final int method852(int arg0, int arg1, char arg2) {
        if (arg0 != 0) {
            this.field2042 = -12;
        }
        field2027++;
        return this.field2041 == null ? 0 : this.field2041[arg1][arg2];
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;[Lha;I)I")
    public final int method853(String arg0, class116[] arg1, int arg2) {
        field2036++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        if (arg2 != 1) {
            method857(-109);
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
                                    int var11 = class254.method1532(var10.substring(4), 2);
                                    var5 = -1;
                                    var6 += arg1[var11].method627();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field2043[class373.method2274(false, var9) & 0xFF] & 0xFF;
                    if (this.field2041 != null && var5 != -1) {
                        var6 += this.field2041[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)V")
    public static final void method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2026++;
        int var6 = class69.method398((byte) -107, arg0, class113.field1453, class535.field7467);
        int var7 = class69.method398((byte) -20, arg4, class113.field1453, class535.field7467);
        int var8 = class69.method398((byte) -123, arg2, class355.field4972, class594.field8575);
        int var9 = class69.method398((byte) -35, arg5, class355.field4972, class594.field8575);
        for (int var10 = var6; var10 <= var7; var10++) {
            class373.method2275((byte) -9, var9, arg3, var8, class256.field3173[var10]);
        }
        int var11 = 34 / ((arg1 - 28) / 46);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
    public static final boolean method855(int arg0, int arg1, int arg2) {
        field2029++;
        if (arg0 != 0) {
            method850((byte) -32);
        }
        return class195.method1248(-70, arg2, arg1) || class267.method1641(arg1, 34069, arg2);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method856(int arg0, String arg1) {
        field2034++;
        return arg0 == 0 ? this.method853(arg1, null, 1) : -67;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static final void method857(int arg0) {
        field2046++;
        class578 var1 = null;
        try {
            class441 var2 = class31.field488.method1727(true, (byte) -35, "2");
            while (var2.field6001 == 0) {
                class353.method2204(1L, arg0 + 7802);
            }
            if (var2.field6001 == 1) {
                var1 = (class578) var2.field6000;
                byte[] var3 = new byte[(int) var1.method3251(-25730)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3247(var3.length - var4, var3, var4, arg0 ^ 0xFFFFFF80);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class414.method2468(118, new class551(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3252(arg0 - 4);
            }
        } catch (Exception var6) {
        }
        if (arg0 != 4) {
            field2032 = 52;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[Lha;Ljava/lang/String;I)I")
    public final int method858(int arg0, class116[] arg1, String arg2, int arg3) {
        field2039++;
        return arg0 == -28763 ? this.method859(arg2, arg1, new int[] { arg3 }, 63, class505.field7039) : -2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;[Lha;[II[Ljava/lang/String;)I")
    public final int method859(String arg0, class116[] arg1, int[] arg2, int arg3, String[] arg4) {
        field2033++;
        if (arg0 == null) {
            return 0;
        }
        if (arg3 <= 39) {
            field2044 = -100;
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
            int var16 = class373.method2274(false, arg0.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method860(var16, 32);
                    if (this.field2041 != null && var12 != -1) {
                        var17 += this.field2041[var12][var16];
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
                        arg4[var13] = arg0.substring(var7, var15 + 1);
                        var13++;
                        if (arg4.length <= var13) {
                            return 0;
                        }
                        var12 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method860(60, 32);
                        if (this.field2041 != null && var12 != -1) {
                            var17 += this.field2041[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method860(62, 32);
                        if (this.field2041 != null && var12 != -1) {
                            var17 += this.field2041[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method860(160, 32);
                        if (this.field2041 != null && var12 != -1) {
                            var17 += this.field2041[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method860(173, 32);
                        if (this.field2041 != null && var12 != -1) {
                            var17 += this.field2041[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method860(215, 32);
                        if (this.field2041 != null && var12 != -1) {
                            var17 += this.field2041[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method860(8364, 32);
                        if (this.field2041 != null && var12 != -1) {
                            var17 += this.field2041[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method860(169, 32);
                        if (this.field2041 != null && var12 != -1) {
                            var17 += this.field2041[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method860(174, 32);
                        if (this.field2041 != null && var12 != -1) {
                            var17 += this.field2041[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class254.method1532(var19.substring(4), 2);
                            var17 += arg1[var20].method627();
                            var12 = -1;
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
                            var9 = var6;
                            var8 = var15;
                        }
                        if (arg2[var13 < arg2.length ? var13 : arg2.length - 1] < var6) {
                            if (var8 < 0) {
                                arg4[var13] = arg0.substring(var7, var18);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var6 = var17;
                                var7 = var18;
                                var12 = -1;
                            } else {
                                arg4[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
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
            arg4[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public final int method860(int arg0, int arg1) {
        if (arg1 != 32) {
            this.method862(null, 85, 84, null);
        }
        field2040++;
        return this.field2043[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BILjava/lang/String;I[Lha;)I")
    public final int method861(byte arg0, int arg1, String arg2, int arg3, class116[] arg4) {
        field2031++;
        if (arg3 == 0) {
            arg3 = this.field2042;
        }
        int var6 = this.method859(arg2, arg4, new int[] { arg1 }, 109, class505.field7039);
        int var7 = (var6 - 1) * arg3;
        int var8 = -77 % ((18 - arg0) / 62);
        return this.field2028 - (-this.field2037 - var7);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lha;IILjava/lang/String;)I")
    public final int method862(class116[] arg0, int arg1, int arg2, String arg3) {
        field2038++;
        int var5 = this.method859(arg3, arg0, new int[] { arg1 }, 99, class505.field7039);
        if (arg2 != -27128) {
            return -42;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method853(class505.field7039[var7], arg0, arg2 + 27129);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)I")
    public static final int method863(int arg0, int arg1, int arg2) {
        if (arg1 <= 96) {
            field2044 = -19;
        }
        field2035++;
        int var3 = class126.method677(4, arg2 + 91923, arg0 + 45365, -85) + ((class126.method677(2, arg2 - -37821, arg0 + 10294, -126) + -128 >> 1) - -(class126.method677(1, arg2, arg0, -50) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B)V")
    public class157(byte[] arg0) {
        class551 var2 = new class551(arg0);
        int var3 = var2.method3045(-128);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3045(-127) == 1;
        this.field2043 = new byte[256];
        var2.method3086(0, this.field2043, true, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method3045(-125);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method3045(-128);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3051((byte) 81);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3051((byte) -81);
                    var11[var12][var16] = var15;
                }
            }
            this.field2041 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2041[var13][var14] = (byte) class251.method1531(this.field2043, var14, var5, var13, 255, var9, var11, var7);
                        }
                    }
                }
            }
            this.field2042 = var5[32] + var7[32];
        } else {
            this.field2042 = var2.method3045(-126);
        }
        var2.method3045(-126);
        var2.method3045(-125);
        this.field2028 = var2.method3045(-126);
        this.field2037 = var2.method3045(-125);
    }

    static {
        new class344("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field2044 = 0;
        new class344("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field2047 = new float[16];
        field2045 = new class311();
        field2048 = new class3(13, -1);
    }
}
