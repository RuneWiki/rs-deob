import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class166 {

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "[B")
    private byte[] field2207;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[[B")
    private byte[][] field2211;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lqt;")
    public static class525 field2196 = new class525();

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Luw;")
    public static class208 field2213 = new class208(54, 6);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[Llq;")
    public static class210[] field2215;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[Lkv;")
    public static class710[] field2206;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)I", line = 3)
    public final int method1049(int arg0, String arg1) {
        int var3 = -113 % ((arg0 - 27) / 34);
        field2197++;
        return this.method1054(arg1, true, null);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILha;Lg;ILkj;Lek;IZI)V", line = 18)
    public static final void method1050(int arg0, class570 arg1, class619 arg2, int arg3, class307 arg4, class624 arg5, int arg6, boolean arg7, int arg8) {
        field2205++;
        int var9 = arg6 - (arg3 / 2) - 5;
        int var10 = arg0 + 2;
        if (arg5.field7921 != 0) {
            arg1.method3068(false, var9, var10, arg3 + 10, arg5.field7921, arg0 + arg2.method3309() * arg8 + 1 - var10);
        }
        if (arg5.field7940 != 0) {
            arg1.method3075(var9, arg3 + 10, arg8 * arg2.method3309() + 1 + arg0 - var10, (byte) 85, var10, arg5.field7940);
        }
        int var11 = arg5.field7925;
        if (arg7) {
            return;
        }
        if (arg4.field3854 && arg5.field7933 != -1) {
            var11 = arg5.field7933;
        }
        for (int var12 = 0; var12 < arg8; var12++) {
            String var13 = class414.field5483[var12];
            if (var12 < (arg8 - 1)) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg2.method3311(arg1, var13, arg6, arg0, var11, true);
            arg0 += arg2.method3309();
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(CIB)I", line = 59)
    public final int method1051(char arg0, int arg1, byte arg2) {
        if (arg2 >= -19) {
            method1050(66, null, null, 50, null, null, -101, true, -40);
        }
        field2195++;
        return this.field2211 == null ? 0 : this.field2211[arg1][arg0];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I", line = 75)
    public final int method1052(int arg0, int arg1) {
        field2210++;
        return arg0 == 255 ? this.field2207[arg1] & 0xFF : 85;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;[Lpu;III)I", line = 86)
    public final int method1053(String arg0, class772[] arg1, int arg2, int arg3, int arg4) {
        field2203++;
        if (arg4 != 22036) {
            method1050(-77, null, null, -74, null, null, -121, true, 73);
        }
        if (arg3 == 0) {
            arg3 = this.field2209;
        }
        int var6 = this.method1058(arg0, new int[] { arg2 }, class29.field262, (byte) 127, arg1);
        int var7 = (var6 - 1) * arg3;
        return this.field2212 + this.field2201 + var7;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;Z[Lpu;)I", line = 104)
    public final int method1054(String arg0, boolean arg1, class772[] arg2) {
        field2214++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        if (!arg1) {
            return 114;
        }
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
                                    int var11 = class530.method2908((byte) 93, var10.substring(4));
                                    var6 += arg2[var11].method623();
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
                    var6 += this.field2207[class755.method4099(-256, var9) & 0xFF] & 0xFF;
                    if (this.field2211 != null && var5 != -1) {
                        var6 += this.field2211[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 212)
    public static void method1055(int arg0) {
        field2213 = null;
        if (arg0 <= 58) {
            method1057(-46, true, -49, 87, -60);
        }
        field2196 = null;
        field2215 = null;
        field2206 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;I[Lpu;)I", line = 230)
    public final int method1056(int arg0, String arg1, int arg2, class772[] arg3) {
        field2198++;
        return arg2 == -1 ? this.method1058(arg1, new int[] { arg0 }, class29.field262, (byte) 122, arg3) : 102;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZIII)V", line = 245)
    public static final void method1057(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2208++;
        if (!arg1 && class527.field6693 == arg0 && class742.field10047 == arg2 && class711.field9393 == class309.field3877 || class485.field6252.field6942.method2278(false) == 1) {
            return;
        }
        class742.field10047 = arg2;
        class527.field6693 = arg0;
        class711.field9393 = class309.field3877;
        if (class485.field6252.field6942.method2278(false) == 1) {
            class711.field9393 = 0;
        }
        class26.method113((byte) 95, arg3);
        class530.method2903(class659.field8556.method3589(class496.field6338, -22395), class576.field7320, class225.field3058, true, -1, class411.field5453);
        int var5 = class714.field9407;
        class714.field9407 = (class527.field6693 - (class240.field3280 >> 4)) * 8;
        int var6 = class240.field3293;
        class240.field3293 = (class742.field10047 - (class276.field3602 >> 4)) * 8;
        class606.field7677 = class402.method2342(class527.field6693 * 8, class742.field10047 * 8);
        class17.field159 = null;
        int var7 = class714.field9407 - var5;
        int var8 = class240.field3293 - var6;
        if (arg3 == 11) {
            for (int var9 = 0; var9 < class750.field10228; var9++) {
                class232 var10 = class542.field6811[var9];
                if (var10 != null) {
                    class727 var11 = var10.field3125;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field4767[var12] -= var7;
                        var11.field4758[var12] -= var8;
                    }
                    var11.field2900 -= var8 * 512;
                    var11.field2896 -= var7 * 512;
                }
            }
        } else {
            boolean var13 = false;
            class349.field4271 = 0;
            int var14 = (class240.field3280 - 1) * 512;
            int var15 = class276.field3602 * 512 - 512;
            for (int var16 = 0; var16 < class750.field10228; var16++) {
                class232 var30 = class542.field6811[var16];
                if (var30 != null) {
                    class727 var31 = var30.field3125;
                    var31.field2900 -= var8 * 512;
                    var31.field2896 -= var7 * 512;
                    if (var31.field2896 >= 0 && var31.field2896 <= var14 && var31.field2900 >= 0 && var31.field2900 <= var15) {
                        boolean var32 = true;
                        for (int var33 = 0; var33 < 10; var33++) {
                            var31.field4767[var33] -= var7;
                            var31.field4758[var33] -= var8;
                            if (var31.field4767[var33] < 0 || var31.field4767[var33] >= class240.field3280 || var31.field4758[var33] < 0 || var31.field4758[var33] >= class276.field3602) {
                                var32 = false;
                            }
                        }
                        if (var32) {
                            class88.field1224[class349.field4271++] = var31.field4737;
                        } else {
                            var31.method3887(null, 1);
                            var13 = true;
                            var30.method1946(-10364);
                        }
                    } else {
                        var31.method3887(null, 1);
                        var30.method1946(-10364);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class750.field10228 = class444.field5811.method2618(-1);
                class444.field5811.method2612(class542.field6811, -1);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class33 var28 = class263.field3508[var17];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field4767[var29] -= var7;
                    var28.field4758[var29] -= var8;
                }
                var28.field2900 -= var8 * 512;
                var28.field2896 -= var7 * 512;
            }
        }
        class28[] var18 = class589.field7475;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class28 var27 = var18[var19];
            if (var27 != null) {
                var27.field240 -= var7 * 512;
                var27.field249 -= var8 * 512;
            }
        }
        for (class136 var20 = (class136) class332.field4061.method3591(0); var20 != null; var20 = (class136) class332.field4061.method3600((byte) 39)) {
            var20.field1799 -= var8;
            var20.field1800 -= var7;
            if (class449.field5854 != 4 && (var20.field1800 < 0 || var20.field1799 < 0 || var20.field1800 >= class240.field3280 || class276.field3602 <= var20.field1799)) {
                var20.method1946(-10364);
            }
        }
        for (class136 var21 = (class136) class338.field4126.method3591(0); var21 != null; var21 = (class136) class338.field4126.method3600((byte) 71)) {
            var21.field1799 -= var8;
            var21.field1800 -= var7;
            if (class449.field5854 != 4 && (var21.field1800 < 0 || var21.field1799 < 0 || class240.field3280 <= var21.field1800 || class276.field3602 <= var21.field1799)) {
                var21.method1946(-10364);
            }
        }
        if (class449.field5854 != 4) {
            for (class89 var22 = (class89) class407.field5401.method2610((byte) -37); var22 != null; var22 = (class89) class407.field5401.method2620(0)) {
                int var23 = (int) (var22.field4108 & 0x3FFFL);
                int var24 = var23 - class714.field9407;
                int var25 = (int) (var22.field4108 >> 14 & 0x3FFFL);
                int var26 = var25 - class240.field3293;
                if (var24 < 0 || var26 < 0 || var24 >= class240.field3280 || class276.field3602 <= var26) {
                    var22.method1946(-10364);
                }
            }
        }
        if (class270.field3560 != 0) {
            class167.field2221 -= var8;
            class270.field3560 -= var7;
        }
        class592.method3187(0);
        if (arg3 != 11) {
            class285.field3668 -= var7;
            class97.field1309 -= var7 * 512;
            class650.field8287 -= var8;
            class148.field1890 -= var8 * 512;
            class270.field3557 -= var8;
            class746.field10193 -= var7;
            if (Math.abs(var7) > class240.field3280 || Math.abs(var8) > class276.field3602) {
                class193.method1346((byte) -84);
            }
        } else if (class507.field6476 == 4) {
            class433.field5674 -= var8 * 512;
            class599.field7622 -= var7 * 512;
            class572.field7251 -= var8 * 512;
            class12.field125 -= var7 * 512;
        } else {
            class525.field6679 = -1;
            class524.field6672 = -1;
            class507.field6476 = 1;
        }
        class187.method1318(6);
        class493.method2749(false);
        class604.field7674.method3594(-99);
        class139.field1833.method3594(-70);
        if (arg4 > 78) {
            class21.field195.method863(0);
            class32.method165(false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;B[Lpu;)I", line = 523)
    public final int method1058(String arg0, int[] arg1, String[] arg2, byte arg3, class772[] arg4) {
        field2200++;
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
        int var13 = 0;
        int var14 = arg0.length();
        int var15 = 0;
        if (arg3 < 117) {
            this.method1054(null, false, null);
        }
        while (var15 < var14) {
            int var16 = class755.method4099(-256, arg0.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                label170: {
                    int var18;
                    if (var11 == -1) {
                        var18 = var15;
                        var17 += this.method1052(255, var16);
                        if (this.field2211 != null && var12 != -1) {
                            var17 += this.field2211[var12][var16];
                        }
                        var12 = var16;
                    } else {
                        if (var16 != 62) {
                            break label170;
                        }
                        var18 = var11;
                        String var19 = arg0.substring(var11 + 1, var15);
                        var11 = -1;
                        if (var19.equals("br")) {
                            arg2[var13] = arg0.substring(var7, var15 + 1);
                            var13++;
                            if (arg2.length <= var13) {
                                return 0;
                            }
                            var6 = 0;
                            var7 = var15 + 1;
                            var12 = -1;
                            var8 = -1;
                            break label170;
                        }
                        if (var19.equals("lt")) {
                            var17 += this.method1052(255, 60);
                            if (this.field2211 != null && var12 != -1) {
                                var17 += this.field2211[var12][60];
                            }
                            var12 = 60;
                        } else if (var19.equals("gt")) {
                            var17 += this.method1052(255, 62);
                            if (this.field2211 != null && var12 != -1) {
                                var17 += this.field2211[var12][62];
                            }
                            var12 = 62;
                        } else if (var19.equals("nbsp")) {
                            var17 += this.method1052(255, 160);
                            if (this.field2211 != null && var12 != -1) {
                                var17 += this.field2211[var12][160];
                            }
                            var12 = 160;
                        } else if (var19.equals("shy")) {
                            var17 += this.method1052(255, 173);
                            if (this.field2211 != null && var12 != -1) {
                                var17 += this.field2211[var12][173];
                            }
                            var12 = 173;
                        } else if (var19.equals("times")) {
                            var17 += this.method1052(255, 215);
                            if (this.field2211 != null && var12 != -1) {
                                var17 += this.field2211[var12][215];
                            }
                            var12 = 215;
                        } else if (var19.equals("euro")) {
                            var17 += this.method1052(255, 8364);
                            if (this.field2211 != null && var12 != -1) {
                                var17 += this.field2211[var12][8364];
                            }
                            var12 = 8364;
                        } else if (var19.equals("copy")) {
                            var17 += this.method1052(255, 169);
                            if (this.field2211 != null && var12 != -1) {
                                var17 += this.field2211[var12][169];
                            }
                            var12 = 169;
                        } else if (var19.equals("reg")) {
                            var17 += this.method1052(255, 174);
                            if (this.field2211 != null && var12 != -1) {
                                var17 += this.field2211[var12][174];
                            }
                            var12 = 174;
                        } else if (var19.startsWith("img=") && arg4 != null) {
                            try {
                                int var20 = class530.method2908((byte) 59, var19.substring(4));
                                var12 = -1;
                                var17 += arg4[var20].method623();
                            } catch (Exception var21) {
                            }
                        }
                        var16 = -1;
                    }
                    if (var17 > 0) {
                        var6 += var17;
                        if (arg1 != null) {
                            if (var16 == 32) {
                                var8 = var15;
                                var10 = 1;
                                var9 = var6;
                            }
                            if (var6 > arg1[var13 >= arg1.length ? arg1.length - 1 : var13]) {
                                if (var8 >= 0) {
                                    arg2[var13] = arg0.substring(var7, var8 + 1 - var10);
                                    var13++;
                                    if (arg2.length <= var13) {
                                        return 0;
                                    }
                                    var7 = var8 + 1;
                                    var12 = -1;
                                    var6 -= var9;
                                    var8 = -1;
                                } else {
                                    arg2[var13] = arg0.substring(var7, var18);
                                    var13++;
                                    if (arg2.length <= var13) {
                                        return 0;
                                    }
                                    var7 = var18;
                                    var12 = -1;
                                    var6 = var17;
                                    var8 = -1;
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
            var15++;
        }
        if (var7 < arg0.length()) {
            arg2[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;[Lpu;I)I", line = 771)
    public final int method1059(byte arg0, String arg1, class772[] arg2, int arg3) {
        field2204++;
        if (arg0 != -119) {
            this.field2201 = 103;
        }
        int var5 = this.method1058(arg1, new int[] { arg3 }, class29.field262, (byte) 126, arg2);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1054(class29.field262[var7], true, arg2);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZILjava/lang/String;[Lpu;)Ljava/lang/String;", line = 808)
    public final String method1060(boolean arg0, int arg1, String arg2, class772[] arg3) {
        field2202++;
        if (arg1 >= this.method1054(arg2, arg0, arg3)) {
            return arg2;
        }
        int var5 = arg1 - this.method1054("...", arg0, null);
        int var6 = -1;
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
                                    int var14 = class530.method2908((byte) 122, var13.substring(4));
                                    var8 += arg3[var14].method623();
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
                    var8 += this.field2207[class755.method4099(-256, var12) & 0xFF] & 0xFF;
                    if (this.field2211 != null && var7 != -1) {
                        var8 += this.field2211[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field2211 != null) {
                        var15 = this.field2211[var12][46] + var8;
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

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V", line = 926)
    public class166(byte[] arg0) {
        class234 var2 = new class234(arg0);
        int var3 = var2.method1509(true);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1509(true) == 1;
        this.field2207 = new byte[256];
        var2.method1495(256, 0, (byte) -127, this.field2207);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1509(true);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1509(true);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1554(27806);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1554(27806);
                    var11[var12][var16] = var15;
                }
            }
            this.field2211 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2211[var13][var14] = (byte) class184.method1303(this.field2207, var6, var11, var9, -107, var14, var13, var5);
                        }
                    }
                }
            }
            this.field2209 = var5[32] + var6[32];
        } else {
            this.field2209 = var2.method1509(true);
        }
        var2.method1509(true);
        var2.method1509(true);
        this.field2212 = var2.method1509(true);
        this.field2201 = var2.method1509(true);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)[Lpf;", line = 1049)
    public static final class759[] method1061(int arg0) {
        if (arg0 != 0) {
            method1055(-119);
        }
        field2199++;
        return new class759[] { class121.field1630, class518.field6593, class503.field6450 };
    }
}
