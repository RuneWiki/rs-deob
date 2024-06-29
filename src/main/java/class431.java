import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class431 {

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "[B")
    private byte[] field6269;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public int field6257;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "[[B")
    private byte[][] field6252;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public int field6255;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public int field6259;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "Luc;")
    public static class51 field6263 = new class51(260);

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "Z")
    public static boolean field6272 = false;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "Ljava/lang/String;")
    public static String field6271 = "slide:";

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "[B")
    public static byte[] field6274 = new byte[520];

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "Ll;")
    public static class315 field6266;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "Lhg;")
    public static class49 field6270;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILps;ILps;IIIIII)V")
    public static final void method2687(int arg0, class162 arg1, int arg2, class162 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6256++;
        int var10 = arg3.method1087((byte) 73);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class315 var12 = (class315) class278.field4074.method378((byte) 28, (long) var10);
        if (var12 == null) {
            class10[] var13 = class10.method75(class118.field1532, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class126.field1647.method463(var13[0], true);
            class278.field4074.method367((long) var10, var12, true);
        }
        class264.method1774(arg6, arg1.field5921, arg7 >> 1, arg1.method1091((byte) 60) * 64, arg2, arg8, arg0 >> 1, -2, arg1.field5930);
        int var14 = class53.field814[0] + arg4 - 18;
        int var15 = class53.field814[1] + arg9 - 70;
        int var16 = arg5 / 4 * 18 + var14;
        int var17 = arg5 % 4 * 18 + var15;
        var12.method2070(var16, var17);
        if (arg1 == arg3) {
            class126.field1647.method2014(var17 - 1, arg6, -256, var16 - 1, 18, 18);
        }
        class438 var18 = class179.method1180(true);
        var18.field6359 = var17;
        var18.field6354 = arg3;
        var18.field6362 = var16;
        var18.field6363 = var16 + 16;
        var18.field6356 = var17 + 16;
        class197.field2718.method50(var18, (byte) 115);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILsj;Ljava/lang/String;Lvn;Los;IIIIILsf;I)V")
    public static final void method2688(int arg0, class248 arg1, String arg2, class431 arg3, class129 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class421 arg10, int arg11) {
        if (arg11 != -12318) {
            field6271 = null;
        }
        field6273++;
        int var12;
        if (class212.field2884 == 4) {
            var12 = (int) class247.field3479 & 0x3FFF;
        } else {
            var12 = (int) class247.field3479 + class93.field1268 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field3531 / 2, arg1.field3564 / 2) + 10;
        int var14 = arg6 * arg6 + (arg0 * arg0);
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class240.field3364[var12];
        int var16 = class240.field3365[var12];
        if (class212.field2884 != 4) {
            var15 = var15 * 256 / (class30.field484 + 256);
            var16 = var16 * 256 / (class30.field484 + 256);
        }
        int var17 = arg0 * var15 + (arg6 * var16) >> 15;
        int var18 = arg0 * var16 - (arg6 * var15) >> 15;
        int var19 = arg3.method2700((class315[]) null, (byte) -21, arg2, 100);
        int var20 = var17 - var19 / 2;
        int var21 = arg3.method2699(0, arg2, 100, (byte) -75, (class315[]) null);
        if ((-arg1.field3531) <= var20 && var20 <= arg1.field3531 && (-arg1.field3564) <= var18 && var18 <= arg1.field3564) {
            arg4.method916(var20 + (arg1.field3531 / 2) + arg7, 16, 50, arg7, arg5, arg2, arg10, arg1.field3564 / 2 + arg8 - arg9 - var18 - var21, arg8, 1, (int[]) null, 0, (class315[]) null, 0, var19, 0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static final void method2689(int arg0) {
        if (class238.field3323 == null || class72.field1021 == null) {
            class72.field1021 = new int[256];
            class238.field3323 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class238.field3323[var1] = (int) (Math.sin(var2) * 4096.0D);
                class72.field1021[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field6253++;
        if (arg0 != 256) {
            field6272 = false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B[ILjava/lang/String;[Ljava/lang/String;[Ll;)I")
    public final int method2690(byte arg0, int[] arg1, String arg2, String[] arg3, class315[] arg4) {
        field6260++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        if (arg0 <= 65) {
            return 103;
        }
        int var12 = -1;
        int var13 = 0;
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class245.method1594(arg2.charAt(var15), true) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2693(-112, var16);
                    if (this.field6252 != null && var12 != -1) {
                        var17 += this.field6252[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg2.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg3[var13] = arg2.substring(var7, var15 + 1);
                        var12 = -1;
                        var7 = var15 + 1;
                        var13++;
                        var6 = 0;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2693(-54, 60);
                        if (this.field6252 != null && var12 != -1) {
                            var17 += this.field6252[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2693(-91, 62);
                        if (this.field6252 != null && var12 != -1) {
                            var17 += this.field6252[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2693(-122, 160);
                        if (this.field6252 != null && var12 != -1) {
                            var17 += this.field6252[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2693(-109, 173);
                        if (this.field6252 != null && var12 != -1) {
                            var17 += this.field6252[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2693(-53, 215);
                        if (this.field6252 != null && var12 != -1) {
                            var17 += this.field6252[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2693(-124, 8364);
                        if (this.field6252 != null && var12 != -1) {
                            var17 += this.field6252[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2693(-61, 169);
                        if (this.field6252 != null && var12 != -1) {
                            var17 += this.field6252[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2693(-94, 174);
                        if (this.field6252 != null && var12 != -1) {
                            var17 += this.field6252[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class212.method1392(true, var19.substring(4));
                            var12 = -1;
                            var17 += arg4[var20].method199();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg1 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var10 = 1;
                            var8 = var15;
                        }
                        if (arg1[arg1.length <= var13 ? arg1.length - 1 : var13] < var6) {
                            if (var8 < 0) {
                                arg3[var13] = arg2.substring(var7, var18);
                                var6 = var17;
                                var7 = var18;
                                var12 = -1;
                                var13++;
                                var8 = -1;
                            } else {
                                arg3[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var7 = var8 + 1;
                                var13++;
                                var8 = -1;
                                var12 = -1;
                                var6 -= var9;
                            }
                        }
                        if (var16 == 45) {
                            var10 = 0;
                            var9 = var6;
                            var8 = var15;
                        }
                    }
                }
            }
        }
        if (var7 < arg2.length()) {
            arg3[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
    public static final void method2691(int arg0, int arg1) {
        class249.field3679 = new int[class143.field1815];
        class263.field3853 = new byte[arg1][class351.field5217][class143.field1815];
        class386.field5642 = null;
        class1.field1 = new int[class143.field1815];
        if (arg0 != 28437) {
            method2691(-75, -62);
        }
        class112.field1452 = new byte[arg1][class351.field5217][class143.field1815];
        class50.field760 = new byte[arg1][class351.field5217][class143.field1815];
        field6254++;
        class164.field2231 = new int[arg1][class351.field5217 + 1][class143.field1815 + 1];
        class108.field1417 = new int[5];
        class48.field735 = new int[class143.field1815];
        class255.field3723 = new int[class143.field1815];
        class173.field2355 = new byte[arg1][class351.field5217 + 1][class143.field1815 + 1];
        class359.field5323 = new int[class143.field1815];
        class113.field1458 = 99;
        class428.field6220 = new byte[arg1][class351.field5217][class143.field1815];
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIC)I")
    public final int method2692(int arg0, int arg1, char arg2) {
        field6261++;
        if (arg1 != 0) {
            this.method2693(-30, 108);
        }
        return this.field6252 == null ? 0 : this.field6252[arg0][arg2];
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)I")
    public final int method2693(int arg0, int arg1) {
        field6264++;
        if (arg0 > -47) {
            this.method2694(34, (String) null, (class315[]) null, 81);
        }
        return this.field6269[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;[Ll;I)I")
    public final int method2694(int arg0, String arg1, class315[] arg2, int arg3) {
        field6258++;
        int var5 = -120 / ((-arg3 - 19) / 35);
        return this.method2690((byte) 90, new int[] { arg0 }, arg1, class27.field473, arg2);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method2695(int arg0, String arg1) {
        field6262++;
        if (arg0 != -1) {
            field6263 = null;
        }
        return this.method2696(62, arg1, (class315[]) null);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;[Ll;)I")
    public final int method2696(int arg0, String arg1, class315[] arg2) {
        field6267++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        if (arg0 != 62) {
            this.field6269 = null;
        }
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
                            if (var10.startsWith("img=") && arg2 != null) {
                                try {
                                    int var11 = class212.method1392(true, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg2[var11].method199();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field6269[class245.method1594(var9, true) & 0xFF] & 0xFF;
                    if (this.field6252 != null && var5 != -1) {
                        var6 += this.field6252[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static final void method2697(int arg0) {
        field6265++;
        int var1 = class27.field471.method1832(8, (byte) -40);
        if (class402.field5869 > var1) {
            for (int var2 = var1; var2 < class402.field5869; var2++) {
                class3.field41[class388.field5678++] = class117.field1528[var2];
            }
        }
        if (class402.field5869 < var1) {
            throw new RuntimeException("gppov1");
        }
        class402.field5869 = 0;
        if (arg0 != 3) {
            field6274 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class117.field1528[var3];
            class317 var5 = class176.field2382[var4];
            int var6 = class27.field471.method1832(1, (byte) -63);
            if (var6 == 0) {
                class117.field1528[class402.field5869++] = var4;
                var5.field2154 = class231.field3179;
            } else {
                int var7 = class27.field471.method1832(2, (byte) -48);
                if (var7 == 0) {
                    class117.field1528[class402.field5869++] = var4;
                    var5.field2154 = class231.field3179;
                    class298.field4500[class421.field6124++] = var4;
                } else if (var7 == 1) {
                    class117.field1528[class402.field5869++] = var4;
                    var5.field2154 = class231.field3179;
                    int var8 = class27.field471.method1832(3, (byte) -57);
                    var5.method1085(1, arg0 - 3, var8);
                    int var9 = class27.field471.method1832(1, (byte) -89);
                    if (var9 == 1) {
                        class298.field4500[class421.field6124++] = var4;
                    }
                } else if (var7 == 2) {
                    class117.field1528[class402.field5869++] = var4;
                    var5.field2154 = class231.field3179;
                    if (class27.field471.method1832(1, (byte) -94) == 1) {
                        int var10 = class27.field471.method1832(3, (byte) -120);
                        var5.method1085(2, 0, var10);
                        int var11 = class27.field471.method1832(3, (byte) -46);
                        var5.method1085(2, arg0 - 3, var11);
                    } else {
                        int var12 = class27.field471.method1832(3, (byte) -70);
                        var5.method1085(0, 0, var12);
                    }
                    int var13 = class27.field471.method1832(1, (byte) -104);
                    if (var13 == 1) {
                        class298.field4500[class421.field6124++] = var4;
                    }
                } else if (var7 == 3) {
                    class3.field41[class388.field5678++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public static void method2698(byte arg0) {
        field6266 = null;
        field6274 = null;
        field6270 = null;
        field6271 = null;
        field6263 = null;
        int var1 = 70 % ((arg0 + 25) / 37);
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([B)V")
    public class431(byte[] arg0) {
        class341 var2 = new class341(arg0);
        int var3 = var2.method2233((byte) 104);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2233((byte) 104) == 1;
        this.field6269 = new byte[256];
        var2.method2210(false, 256, this.field6269, 0);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method2233((byte) 104);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method2233((byte) 104);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2211(255);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2211(255);
                    var11[var12][var16] = var15;
                }
            }
            this.field6252 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field6252[var13][var14] = (byte) class395.method2540(var9, var13, var5, var14, this.field6269, 83, var11, var7);
                        }
                    }
                }
            }
            this.field6257 = var7[32] + var5[32];
        } else {
            this.field6257 = var2.method2233((byte) 104);
        }
        var2.method2233((byte) 104);
        var2.method2233((byte) 104);
        this.field6255 = var2.method2233((byte) 104);
        this.field6259 = var2.method2233((byte) 104);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;IB[Ll;)I")
    private final int method2699(int arg0, String arg1, int arg2, byte arg3, class315[] arg4) {
        field6251++;
        if (arg0 == 0) {
            arg0 = this.field6257;
        }
        int var6 = this.method2690((byte) 85, new int[] { arg2 }, arg1, class27.field473, arg4);
        int var7 = (var6 - 1) * arg0;
        if (arg3 > -62) {
            this.method2700((class315[]) null, (byte) 92, (String) null, 21);
        }
        return this.field6255 + var7 + this.field6259;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([Ll;BLjava/lang/String;I)I")
    public final int method2700(class315[] arg0, byte arg1, String arg2, int arg3) {
        field6268++;
        int var5 = this.method2690((byte) 97, new int[] { arg3 }, arg2, class27.field473, arg0);
        int var6 = 0;
        if (arg1 != -21) {
            field6274 = null;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2695(-1, class27.field473[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }
}
