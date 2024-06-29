import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class313 {

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "[B")
    private byte[] field4588;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[[B")
    private byte[][] field4577;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public int field4596;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field4576 = 0;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4587 = "Hidden";

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "Z")
    public static boolean field4594 = false;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "Lcq;")
    public static class67 field4582;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method2115(int arg0) {
        field4587 = null;
        if (arg0 != 0) {
            method2125(-12, 30, -89, (class405) null, (class394) null);
        }
        field4582 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
    public static final void method2116(int arg0, int arg1) {
        field4585++;
        class17.field246 = new int[arg0];
        class156.field2118 = new int[arg0];
        if (arg1 != -1) {
            method2125(67, 88, 111, (class405) null, (class394) null);
        }
        class205.field2772 = new int[arg0];
        class11.field169 = new int[arg0];
        class363.field5235 = new int[arg0];
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;[Lcq;I)I")
    public final int method2117(int arg0, String arg1, class67[] arg2, int arg3) {
        field4590++;
        if (arg3 < 114) {
            field4582 = null;
        }
        int var5 = this.method2128(class52.field717, arg1, new int[] { arg0 }, arg2, (byte) -83);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2123(arg2, class52.field717[var7], (byte) 103);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)I")
    public final int method2118(int arg0, byte arg1) {
        field4575++;
        if (arg1 != -27) {
            this.method2128((String[]) null, (String) null, (int[]) null, (class67[]) null, (byte) 119);
        }
        return this.field4588[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ICI)I")
    public final int method2119(int arg0, char arg1, int arg2) {
        if (arg0 == 0) {
            field4589++;
            return this.field4577 == null ? 0 : this.field4577[arg2][arg1];
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)Lhi;")
    public static final class353 method2120(boolean arg0, int arg1) {
        field4579++;
        class353 var2 = (class353) class377.field5489.method1137((long) arg1, 2108653711);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class161.field2157.method2261(arg1, 30, 93);
        if (!arg0) {
            return null;
        }
        class353 var4 = new class353();
        if (var3 != null) {
            var4.method2324(new class228(var3), -124, arg1);
        }
        class377.field5489.method1144((long) arg1, var4, -3480);
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lwj;")
    public static final class9 method2121(Canvas arg0, byte arg1) {
        field4583++;
        try {
            if (arg1 != 21) {
                field4582 = null;
            }
            Class var2 = Class.forName("qk");
            class9 var3 = (class9) var2.getDeclaredConstructor().newInstance();
            var3.method70(-28147, arg0);
            return var3;
        } catch (Throwable var5) {
            class281 var4 = new class281();
            var4.method70(-28147, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[Lcq;Ljava/lang/String;B)I")
    public final int method2122(int arg0, class67[] arg1, String arg2, byte arg3) {
        field4586++;
        int var5 = 16 % ((46 - arg3) / 48);
        return this.method2128(class52.field717, arg2, new int[] { arg0 }, arg1, (byte) -83);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([Lcq;Ljava/lang/String;B)I")
    public final int method2123(class67[] arg0, String arg1, byte arg2) {
        field4580++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg2 != 103) {
            field4587 = null;
        }
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
                                    int var11 = class351.method2312(arg2 - 1138, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg0[var11].method411();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field4588[class177.method1079(124, var9) & 0xFF] & 0xFF;
                    if (this.field4577 != null && var5 != -1) {
                        var6 += this.field4577[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static final void method2124(int arg0) {
        field4595++;
        class263 var1 = class47.method337(15, 0, arg0);
        var1.method1806(false);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILii;Lps;)V")
    public static final void method2125(int arg0, int arg1, int arg2, class405 arg3, class394 arg4) {
        if (arg4.field5671 == arg0) {
            for (int var6 = arg2; var6 <= arg1; var6++) {
                int var7 = arg4.field5777[var6] - 1;
                if (var7 != -1) {
                    if (class63.field844 == 1 && class215.field2863 == var6 && class377.field5495 == arg4.field5698) {
                        boolean var8 = class244.method1464(var7, (byte) -93, arg4.field5776[var6], arg3, 0, (class296) null, 2, arg4.field5640) == null;
                        if (var8) {
                            class397.field5909.method330(new class430(var7, arg4.field5776[var6], 2, 0, arg4.field5640, false), -2130841184);
                        }
                    } else {
                        boolean var9 = class244.method1464(var7, (byte) -83, arg4.field5776[var6], arg3, -13623264, (class296) null, 1, arg4.field5640) == null;
                        if (var9) {
                            class397.field5909.method330(new class430(var7, arg4.field5776[var6], 1, -13623264, arg4.field5640, false), arg0 - 2130841186);
                        }
                    }
                }
            }
        } else if (arg4.field5671 == 5) {
            boolean var5 = class244.method1464(arg4.field5650, (byte) -126, arg4.field5810, arg3, arg4.field5737 | 0xFF000000, arg4.field5735 ? class227.field2988.field341 : null, arg4.field5733, arg4.field5640) == null;
            if (var5) {
                class397.field5909.method330(new class430(arg4.field5650, arg4.field5810, arg4.field5733, arg4.field5737 | 0xFF000000, arg4.field5640, arg4.field5735), -2130841184);
            }
        }
        field4593++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;III[Lcq;)I")
    public final int method2126(String arg0, int arg1, int arg2, int arg3, class67[] arg4) {
        field4581++;
        if (arg1 == arg3) {
            arg3 = this.field4584;
        }
        int var6 = this.method2128(class52.field717, arg0, new int[] { arg2 }, arg4, (byte) -83);
        int var7 = (var6 - 1) * arg3;
        return this.field4596 + this.field4578 + var7;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method2127(int arg0, String arg1) {
        field4591++;
        return arg0 == 255 ? this.method2123((class67[]) null, arg1, (byte) 103) : 66;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([Ljava/lang/String;Ljava/lang/String;[I[Lcq;B)I")
    public final int method2128(String[] arg0, String arg1, int[] arg2, class67[] arg3, byte arg4) {
        field4592++;
        if (arg1 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        if (arg4 != -83) {
            return 1;
        }
        int var12 = -1;
        int var13 = 0;
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class177.method1079(125, arg1.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2118(var16, (byte) -27);
                    if (this.field4577 != null && var12 != -1) {
                        var17 += this.field4577[var12][var16];
                    }
                    var12 = var16;
                } else {
                    if (var16 != 62) {
                        continue;
                    }
                    var18 = var11;
                    String var19 = arg1.substring(var11 + 1, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                        arg0[var13] = arg1.substring(var7, var15 + 1);
                        var13++;
                        if (var13 >= arg0.length) {
                            return 0;
                        }
                        var7 = var15 + 1;
                        var6 = 0;
                        var12 = -1;
                        var8 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2118(60, (byte) -27);
                        if (this.field4577 != null && var12 != -1) {
                            var17 += this.field4577[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2118(62, (byte) -27);
                        if (this.field4577 != null && var12 != -1) {
                            var17 += this.field4577[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2118(160, (byte) -27);
                        if (this.field4577 != null && var12 != -1) {
                            var17 += this.field4577[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2118(173, (byte) -27);
                        if (this.field4577 != null && var12 != -1) {
                            var17 += this.field4577[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2118(215, (byte) -27);
                        if (this.field4577 != null && var12 != -1) {
                            var17 += this.field4577[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2118(8364, (byte) -27);
                        if (this.field4577 != null && var12 != -1) {
                            var17 += this.field4577[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2118(169, (byte) -27);
                        if (this.field4577 != null && var12 != -1) {
                            var17 += this.field4577[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2118(174, (byte) -27);
                        if (this.field4577 != null && var12 != -1) {
                            var17 += this.field4577[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class351.method2312(arg4 - 952, var19.substring(4));
                            var12 = -1;
                            var17 += arg3[var20].method411();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg2 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 1;
                        }
                        if (var6 > arg2[var13 >= arg2.length ? arg2.length - 1 : var13]) {
                            if (var8 < 0) {
                                arg0[var13] = arg1.substring(var7, var18);
                                var13++;
                                if (arg0.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var7 = var18;
                                var12 = -1;
                                var6 = var17;
                            } else {
                                arg0[var13] = arg1.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg0.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
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
        if (var7 < arg1.length()) {
            arg0[var13] = arg1.substring(var7, arg1.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "([B)V")
    public class313(byte[] arg0) {
        class228 var2 = new class228(arg0);
        int var3 = var2.method1348(-97);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1348(-118) == 1;
        this.field4588 = new byte[256];
        var2.method1358(0, 128, this.field4588, 256);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1348(-105);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1348(-88);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1349(3);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1349(3);
                    var11[var12][var16] = var15;
                }
            }
            this.field4577 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4577[var13][var14] = (byte) class41.method297(this.field4588, 255, var14, var13, var5, var9, var6, var11);
                        }
                    }
                }
            }
            this.field4584 = var5[32] + var6[32];
        } else {
            this.field4584 = var2.method1348(-119);
        }
        var2.method1348(-114);
        var2.method1348(-106);
        this.field4578 = var2.method1348(-102);
        this.field4596 = var2.method1348(-106);
    }
}
