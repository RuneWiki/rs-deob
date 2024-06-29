import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class278 {

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "[B")
    private byte[] field3561;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "[[B")
    private byte[][] field3552;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "[I")
    public static int[] field3558;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "Lpi;")
    public static class340 field3557;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1702(String arg0, int arg1) {
        field3549++;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;I[Lf;)Ljava/lang/String;")
    public final String method1703(byte arg0, String arg1, int arg2, class404[] arg3) {
        field3551++;
        if (arg2 >= this.method1709((byte) 54, arg3, arg1)) {
            return arg1;
        }
        int var5 = arg2 - this.method1709((byte) 105, null, "...");
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        if (arg0 != -98) {
            method1705((byte) -40, true, -98, 83, 22);
        }
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
                            if (var13.startsWith("img=") && arg3 != null) {
                                try {
                                    int var14 = class109.method716(var13.substring(4), 10);
                                    var7 = -1;
                                    var8 += arg3[var14].method370();
                                    if (var8 > var5) {
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
                    var8 += this.field3561[class355.method2080(var12, -8219) & 0xFF] & 0xFF;
                    if (this.field3552 != null && var7 != -1) {
                        var8 += this.field3552[var7][var12];
                    }
                    var7 = var12;
                    int var15 = var8;
                    if (this.field3552 != null) {
                        var15 = this.field3552[var12][46] + var8;
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

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method1704(byte arg0, String arg1) {
        if (arg0 < 78) {
            this.method1703((byte) 50, null, -87, null);
        }
        field3550++;
        return this.method1709((byte) 116, null, arg1);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BZIII)Lte;")
    public static final class367 method1705(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3559++;
        int var5 = 101 / ((18 - arg0) / 43);
        class367 var6 = new class367();
        var6.field4719 = arg2;
        var6.field4721 = arg3;
        class381.field4963.method2096((long) arg4, var6, (byte) 76);
        class78.method450((byte) 92, arg2);
        class423 var7 = class497.method2965(0, arg4);
        if (var7 != null) {
            class415.method2440(10, var7);
        }
        if (class310.field4000 != null) {
            class415.method2440(10, class310.field4000);
            class310.field4000 = null;
        }
        class260.method1623((byte) -107);
        if (var7 != null) {
            class474.method2838(!arg1, var7, 23311);
        }
        if (!arg1) {
            class490.method2927(arg2);
        }
        if (!arg1 && class282.field3610 != -1) {
            class194.method1256(class282.field3610, 0, 1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IILjava/lang/String;I[Lf;)I")
    public final int method1706(int arg0, int arg1, String arg2, int arg3, class404[] arg4) {
        if (arg0 == 0) {
            arg0 = this.field3566;
        }
        field3567++;
        int var6 = this.method1710((byte) -41, new int[] { arg3 }, arg4, arg2, class508.field7463);
        int var7 = (arg1 + var6) * arg0;
        return this.field3565 + var7 + this.field3546;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public static final void method1707(int arg0) {
        for (int var1 = 0; var1 < class24.field428; var1++) {
            int var2 = class9.field96[var1];
            class295 var3 = class527.field7791[var2];
            int var4 = class109.field1514.method617(arg0 ^ 0xFFFFFFFD);
            if ((var4 & 0x80) != 0) {
                var4 += class109.field1514.method617(arg0 + 3) << 8;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class109.field1514.method570(true);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class109.field1514.method577(255);
                class514.method3060(var5, arg0 + 11037, var3, var6);
            }
            if ((var4 & 0x2000) != 0) {
                int var7 = class109.field1514.method608((byte) -116);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class109.field1514.method605(31981);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var9[var11] = class109.field1514.method608((byte) 76);
                    var10[var11] = class109.field1514.method567((byte) 112);
                }
                class142.method984(125, var10, var8, var9, var3);
            }
            if ((var4 & 0x1) != 0) {
                int var13 = class109.field1514.method604(arg0 ^ 0x2479);
                int var14 = class109.field1514.method561(1110991096);
                var3.method2352(var13, class264.field3353, 0, var14);
                var3.field5151 = class264.field3353 + 300;
                var3.field5199 = class109.field1514.method577(255);
            }
            if ((var4 & 0x20) != 0) {
                var3.field5229 = class109.field1514.method591(20557);
                var3.field5223 = 100;
            }
            if ((var4 & 0x100) != 0) {
                var3.field3829 = class109.field1514.method570(true);
                var3.field3835 = class109.field1514.method568((byte) 110);
            }
            if ((var4 & 0x800) != 0) {
                int var15 = class109.field1514.method605(31981);
                var3.field5197 = class109.field1514.method561(arg0 ^ 0xBDC79F07);
                var3.field5207 = class109.field1514.method561(1110991096);
                var3.field5189 = (var15 & 0x8000) != 0;
                var3.field5210 = var15 & 0x7FFF;
                var3.field5214 = var3.field5210 + var3.field5197 + class264.field3353;
            }
            if ((var4 & 0x10) != 0) {
                var3.field5202 = class109.field1514.method567((byte) 112);
                if (var3.field5202 == 65535) {
                    var3.field5202 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field3831.method72(0)) {
                    class11.method81(var3, (byte) -58);
                }
                var3.method1776(class192.field2495.method1869(class109.field1514.method570(true), false), (byte) 92);
                var3.method2353(var3.field3831.field128, (byte) 89);
                var3.field5200 = var3.field3831.field138 << 3;
                if (var3.field3831.method72(0)) {
                    class25.method167(null, var3, null, var3.field5246[0], 0, arg0 ^ 0xFFFFFF00, var3.field6220, var3.field5251[0]);
                }
            }
            if ((var4 & 0x40) != 0) {
                int var16 = class109.field1514.method604(-9338);
                int var17 = class109.field1514.method577(255);
                var3.method2352(var16, class264.field3353, 0, var17);
            }
            if ((var4 & 0x8) != 0) {
                int var18 = class109.field1514.method568((byte) 110);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class109.field1514.method589(true);
                int var20 = class109.field1514.method608((byte) -127);
                var3.method2345(false, (byte) -117, var19, var18, var20);
            }
            if ((var4 & 0x400) != 0) {
                var3.field5158 = class109.field1514.method613(128);
                var3.field5154 = class109.field1514.method612((byte) 21);
                var3.field5164 = class109.field1514.method612((byte) 21);
                var3.field5179 = class109.field1514.method575(arg0 - 112);
                var3.field5228 = class109.field1514.method567((byte) 112) + class264.field3353;
                var3.field5208 = class109.field1514.method570(true) + class264.field3353;
                var3.field5187 = class109.field1514.method617(arg0 ^ 0xFFFFFFFD);
                var3.field5179 += var3.field5251[0];
                var3.field5164 += var3.field5246[0];
                var3.field5244 = 1;
                var3.field5154 += var3.field5251[0];
                var3.field5158 += var3.field5246[0];
                var3.field5252 = 0;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field5182 = class109.field1514.method575(-26);
                var3.field5235 = class109.field1514.method575(-38);
                var3.field5215 = class109.field1514.method613(arg0 + 129);
                var3.field5226 = (byte) class109.field1514.method617(arg0 ^ 0xFFFFFFFD);
                var3.field5219 = class264.field3353 + class109.field1514.method605(31981);
                var3.field5203 = class264.field3353 + class109.field1514.method567((byte) 112);
            }
            if ((var4 & 0x200) != 0) {
                int var21 = class109.field1514.method570(true);
                int var22 = class109.field1514.method578(arg0 + 122);
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var23 = class109.field1514.method561(1110991096);
                var3.method2345(true, (byte) -98, var22, var21, var23);
            }
        }
        field3547++;
        if (arg0 != -1) {
            method1705((byte) -28, true, 20, 51, -52);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/lang/String;B[Lf;I)I")
    public final int method1708(String arg0, byte arg1, class404[] arg2, int arg3) {
        if (arg1 == -84) {
            field3554++;
            return this.method1710((byte) -41, new int[] { arg3 }, arg2, arg0, class508.field7463);
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B[Lf;Ljava/lang/String;)I")
    public final int method1709(byte arg0, class404[] arg1, String arg2) {
        field3560++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
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
                                    int var11 = class109.method716(var10.substring(4), 10);
                                    var6 += arg1[var11].method370();
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
                    var6 += this.field3561[class355.method2080(var9, -8219) & 0xFF] & 0xFF;
                    if (this.field3552 != null && var5 != -1) {
                        var6 += this.field3552[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        if (arg0 < 28) {
            this.method1711(13, null, -66, null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B[I[Lf;Ljava/lang/String;[Ljava/lang/String;)I")
    public final int method1710(byte arg0, int[] arg1, class404[] arg2, String arg3, String[] arg4) {
        field3553++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        if (arg0 != -41) {
            return -71;
        }
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class355.method2080(arg3.charAt(var15), -8219) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method1713(var16, true);
                    var18 = var15;
                    if (this.field3552 != null && var12 != -1) {
                        var17 += this.field3552[var12][var16];
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
                        arg4[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (arg4.length <= var13) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var6 = 0;
                        var12 = -1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1713(60, true);
                        if (this.field3552 != null && var12 != -1) {
                            var17 += this.field3552[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1713(62, true);
                        if (this.field3552 != null && var12 != -1) {
                            var17 += this.field3552[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1713(160, true);
                        if (this.field3552 != null && var12 != -1) {
                            var17 += this.field3552[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1713(173, true);
                        if (this.field3552 != null && var12 != -1) {
                            var17 += this.field3552[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1713(215, true);
                        if (this.field3552 != null && var12 != -1) {
                            var17 += this.field3552[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1713(8364, true);
                        if (this.field3552 != null && var12 != -1) {
                            var17 += this.field3552[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1713(169, true);
                        if (this.field3552 != null && var12 != -1) {
                            var17 += this.field3552[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1713(174, true);
                        if (this.field3552 != null && var12 != -1) {
                            var17 += this.field3552[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg2 != null) {
                        try {
                            int var20 = class109.method716(var19.substring(4), 10);
                            var12 = -1;
                            var17 += arg2[var20].method370();
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
                        if (var6 > arg1[var13 >= arg1.length ? arg1.length - 1 : var13]) {
                            if (var8 >= 0) {
                                arg4[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            } else {
                                arg4[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var12 = -1;
                                var7 = var18;
                                var8 = -1;
                                var6 = var17;
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
        if (var7 < arg3.length()) {
            arg4[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/lang/String;I[Lf;)I")
    public final int method1711(int arg0, String arg1, int arg2, class404[] arg3) {
        field3562++;
        int var5 = this.method1710((byte) -41, new int[] { arg0 }, arg3, arg1, class508.field7463);
        int var6 = 14 / ((arg2 + 11) / 37);
        int var7 = 0;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = this.method1709((byte) 98, arg3, class508.field7463[var8]);
            if (var7 < var9) {
                var7 = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(CZI)I")
    public final int method1712(char arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field3561 = null;
        }
        field3555++;
        return this.field3552 == null ? 0 : this.field3552[arg2][arg0];
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)I")
    public final int method1713(int arg0, boolean arg1) {
        if (!arg1) {
            this.field3552 = null;
        }
        field3563++;
        return this.field3561[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)V")
    public static void method1714(boolean arg0) {
        field3558 = null;
        if (arg0) {
            field3558 = null;
        }
        field3557 = null;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1715(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "([B)V")
    public class278(byte[] arg0) {
        class88 var2 = new class88(arg0);
        int var3 = var2.method617(2);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method617(2) == 1;
        this.field3561 = new byte[256];
        var2.method596(30576, 0, this.field3561, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method617(2);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method617(2);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method575(-37);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method575(-29);
                    var11[var12][var16] = var15;
                }
            }
            this.field3552 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field3552[var13][var14] = (byte) class52.method310(var13, 26415, var5, var14, var11, this.field3561, var9, var6);
                        }
                    }
                }
            }
            this.field3566 = var5[32] + var6[32];
        } else {
            this.field3566 = var2.method617(2);
        }
        var2.method617(2);
        var2.method617(2);
        this.field3565 = var2.method617(2);
        this.field3546 = var2.method617(2);
    }

    static {
        new class169("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field3558 = new int[13];
        field3557 = new class340(103, -2);
    }
}
