import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class347 {

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[B")
    private byte[] field4707;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "[[B")
    private byte[][] field4721;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field4713;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field4708;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
    public static int[] field4704 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Ltm;")
    public static class349 field4714 = new class349(16);

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lhq;")
    public static class365 field4723 = new class365(5);

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field4725 = 0;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "F")
    public static float field4705;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Lc;")
    public static class436 field4724;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "[[[Lsq;")
    public static class316[][][] field4722;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([Ljava/lang/String;[Lc;[ILjava/lang/String;B)I", line = 3)
    public final int method2202(String[] arg0, class436[] arg1, int[] arg2, String arg3, byte arg4) {
        field4719++;
        if (arg3 == null) {
            return 0;
        }
        int var6 = 37 / ((76 - arg4) / 37);
        int var7 = 0;
        int var8 = 0;
        int var9 = -1;
        int var10 = 0;
        byte var11 = 0;
        int var12 = -1;
        int var13 = -1;
        int var14 = 0;
        int var15 = arg3.length();
        for (int var16 = 0; var16 < var15; var16++) {
            int var17 = class376.method2343((byte) -111, arg3.charAt(var16)) & 0xFF;
            int var18 = 0;
            if (var17 == 60) {
                var12 = var16;
            } else {
                int var19;
                if (var12 == -1) {
                    var18 += this.method2213(-8773, var17);
                    var19 = var16;
                    if (this.field4721 != null && var13 != -1) {
                        var18 += this.field4721[var13][var17];
                    }
                    var13 = var17;
                } else {
                    if (var17 != 62) {
                        continue;
                    }
                    var19 = var12;
                    String var20 = arg3.substring(var12 + 1, var16);
                    var12 = -1;
                    if (var20.equals("br")) {
                        arg0[var14] = arg3.substring(var8, var16 + 1);
                        var14++;
                        if (arg0.length <= var14) {
                            return 0;
                        }
                        var9 = -1;
                        var13 = -1;
                        var8 = var16 + 1;
                        var7 = 0;
                        continue;
                    }
                    if (var20.equals("lt")) {
                        var18 += this.method2213(-8773, 60);
                        if (this.field4721 != null && var13 != -1) {
                            var18 += this.field4721[var13][60];
                        }
                        var13 = 60;
                    } else if (var20.equals("gt")) {
                        var18 += this.method2213(-8773, 62);
                        if (this.field4721 != null && var13 != -1) {
                            var18 += this.field4721[var13][62];
                        }
                        var13 = 62;
                    } else if (var20.equals("nbsp")) {
                        var18 += this.method2213(-8773, 160);
                        if (this.field4721 != null && var13 != -1) {
                            var18 += this.field4721[var13][160];
                        }
                        var13 = 160;
                    } else if (var20.equals("shy")) {
                        var18 += this.method2213(-8773, 173);
                        if (this.field4721 != null && var13 != -1) {
                            var18 += this.field4721[var13][173];
                        }
                        var13 = 173;
                    } else if (var20.equals("times")) {
                        var18 += this.method2213(-8773, 215);
                        if (this.field4721 != null && var13 != -1) {
                            var18 += this.field4721[var13][215];
                        }
                        var13 = 215;
                    } else if (var20.equals("euro")) {
                        var18 += this.method2213(-8773, 8364);
                        if (this.field4721 != null && var13 != -1) {
                            var18 += this.field4721[var13][8364];
                        }
                        var13 = 8364;
                    } else if (var20.equals("copy")) {
                        var18 += this.method2213(-8773, 169);
                        if (this.field4721 != null && var13 != -1) {
                            var18 += this.field4721[var13][169];
                        }
                        var13 = 169;
                    } else if (var20.equals("reg")) {
                        var18 += this.method2213(-8773, 174);
                        if (this.field4721 != null && var13 != -1) {
                            var18 += this.field4721[var13][174];
                        }
                        var13 = 174;
                    } else if (var20.startsWith("img=") && arg1 != null) {
                        try {
                            int var21 = class366.method2311(var20.substring(4), -126);
                            var13 = -1;
                            var18 += arg1[var21].method235();
                        } catch (Exception var22) {
                        }
                    }
                    var17 = -1;
                }
                if (var18 > 0) {
                    var7 += var18;
                    if (arg2 != null) {
                        if (var17 == 32) {
                            var9 = var16;
                            var11 = 1;
                            var10 = var7;
                        }
                        if (var7 > arg2[var14 >= arg2.length ? arg2.length - 1 : var14]) {
                            if (var9 >= 0) {
                                arg0[var14] = arg3.substring(var8, var9 + 1 - var11);
                                var14++;
                                if (arg0.length <= var14) {
                                    return 0;
                                }
                                var8 = var9 + 1;
                                var9 = -1;
                                var13 = -1;
                                var7 -= var10;
                            } else {
                                arg0[var14] = arg3.substring(var8, var19);
                                var14++;
                                if (var14 >= arg0.length) {
                                    return 0;
                                }
                                var8 = var19;
                                var7 = var18;
                                var13 = -1;
                                var9 = -1;
                            }
                        }
                        if (var17 == 45) {
                            var9 = var16;
                            var11 = 0;
                            var10 = var7;
                        }
                    }
                }
            }
        }
        if (var8 < arg3.length()) {
            arg0[var14] = arg3.substring(var8, arg3.length());
            var14++;
        }
        return var14;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLjava/lang/String;)I", line = 253)
    public final int method2203(byte arg0, String arg1) {
        if (arg0 != -105) {
            field4722 = null;
        }
        field4710++;
        return this.method2212(71, (class436[]) null, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([[[Lsq;Z)V", line = 264)
    public static final void method2204(class316[][][] arg0, boolean arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class316[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class316 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field4255 instanceof class171) {
                            ((class171) var6.field4255).method423(22486);
                        }
                        if (var6.field4259 instanceof class171) {
                            ((class171) var6.field4259).method423(22486);
                        }
                        if (var6.field4266 instanceof class171) {
                            ((class171) var6.field4266).method423(22486);
                        }
                        if (var6.field4268 instanceof class171) {
                            ((class171) var6.field4268).method423(22486);
                        }
                        if (var6.field4269 instanceof class171) {
                            ((class171) var6.field4269).method423(22486);
                        }
                        for (class272 var7 = var6.field4256; var7 != null; var7 = var7.field3514) {
                            class133 var8 = var7.field3512;
                            if (var8 instanceof class171) {
                                ((class171) var8).method423(22486);
                            }
                        }
                    }
                }
            }
        }
        field4718++;
        if (!arg1) {
            field4724 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 342)
    public static void method2205(byte arg0) {
        int var1 = -67 % ((arg0 + 30) / 56);
        field4722 = null;
        field4723 = null;
        field4704 = null;
        field4724 = null;
        field4714 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBIIIIIII)Z", line = 358)
    public static final boolean method2206(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4709++;
        if (arg1 > -52) {
            field4723 = null;
        }
        if ((arg0 + arg5) > arg2 && (arg2 + arg3) > arg0) {
            return arg7 < (arg4 + arg6) && arg7 + arg8 > arg6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;[Lc;IZ)I", line = 377)
    public final int method2207(String arg0, class436[] arg1, int arg2, boolean arg3) {
        field4726++;
        return arg3 ? -6 : this.method2202(class354.field4815, arg1, new int[] { arg2 }, arg0, (byte) 116);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI[Lc;Ljava/lang/String;)I", line = 389)
    public final int method2208(int arg0, byte arg1, int arg2, class436[] arg3, String arg4) {
        int var6 = -25 % ((-arg1 - 67) / 50);
        field4712++;
        if (arg0 == 0) {
            arg0 = this.field4713;
        }
        int var7 = this.method2202(class354.field4815, arg3, new int[] { arg2 }, arg4, (byte) -107);
        int var8 = (var7 - 1) * arg0;
        return this.field4708 + var8 + this.field4706;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;I[Lc;)I", line = 415)
    public final int method2209(int arg0, String arg1, int arg2, class436[] arg3) {
        field4715++;
        int var5 = this.method2202(class354.field4815, arg3, new int[] { arg2 }, arg1, (byte) 117);
        int var6 = 0;
        for (int var7 = arg0; var7 < var5; var7++) {
            int var8 = this.method2212(85, arg3, class354.field4815[var7]);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBII)V", line = 442)
    public static final void method2210(int arg0, byte arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            class367.field5010++;
            class427.field5837.method2162(false, 69);
        }
        field4703++;
        if (arg0 == 1) {
            class169.field1977++;
            class427.field5837.method2162(false, 52);
        }
        class427.field5837.method1546(arg3 + class278.field3608, -1990920344);
        class427.field5837.method1579((byte) -69, class261.field3359.method623(9, 82) ? 1 : 0);
        if (arg1 != -3) {
            return;
        }
        class427.field5837.method1592(class129.field1432 + arg2, (byte) 104);
        class249.field3276 = arg2;
        class319.field4292 = false;
        class90.field1043 = arg3;
        class57.method315((byte) 122);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V", line = 473)
    public static final void method2211(int arg0, byte arg1) {
        class68.field820 = 1000 / arg0;
        field4727++;
        if (arg1 < 25) {
            method2206(38, (byte) 69, 97, -17, -105, 14, 36, 72, -29);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Lc;Ljava/lang/String;)I", line = 495)
    public final int method2212(int arg0, class436[] arg1, String arg2) {
        if (arg0 <= 66) {
            return 62;
        }
        field4717++;
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
                                    int var11 = class366.method2311(var10.substring(4), 114);
                                    var6 += arg1[var11].method235();
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
                    var6 += this.field4707[class376.method2343((byte) -111, var9) & 0xFF] & 0xFF;
                    if (this.field4721 != null && var5 != -1) {
                        var6 += this.field4721[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I", line = 602)
    public final int method2213(int arg0, int arg1) {
        field4711++;
        return arg0 == -8773 ? this.field4707[arg1] & 0xFF : 20;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(CII)I", line = 620)
    public final int method2214(char arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method2207((String) null, (class436[]) null, 41, false);
        }
        field4716++;
        return this.field4721 == null ? 0 : this.field4721[arg2][arg0];
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([B)V", line = 638)
    public class347(byte[] arg0) {
        class242 var2 = new class242(arg0);
        int var3 = var2.method1563(-128);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1563(-128) == 1;
        this.field4707 = new byte[256];
        var2.method1550(256, 0, (byte) 100, this.field4707);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1563(-128);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1563(-128);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1589(false);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1589(false);
                    var11[var12][var16] = var15;
                }
            }
            this.field4721 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4721[var13][var14] = (byte) class325.method2039(this.field4707, var11, var9, var7, 255, var13, var5, var14);
                        }
                    }
                }
            }
            this.field4713 = var7[32] + var5[32];
        } else {
            this.field4713 = var2.method1563(-128);
        }
        var2.method1563(-128);
        var2.method1563(-128);
        this.field4708 = var2.method1563(-128);
        this.field4706 = var2.method1563(-128);
    }
}
