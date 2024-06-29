import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class323 {

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "[B")
    private byte[] field4381;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "[[B")
    private byte[][] field4394;

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "[I")
    public static int[] field4387 = new int[1000];

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "Lfi;")
    public static class166 field4395 = new class166();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!vm", name = "p", descriptor = "[I")
    public static int[] field4388;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)Lgs;")
    public static final class40 method2046(byte arg0) {
        int var1 = 108 / ((arg0 + 58) / 58);
        field4391++;
        return class99.field1409;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I")
    public final int method2047(int arg0, int arg1) {
        int var3 = -48 / ((arg1 + 37) / 62);
        field4378++;
        return this.field4381[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/String;[Lkb;[I)I")
    public final int method2048(byte arg0, String arg1, String[] arg2, class80[] arg3, int[] arg4) {
        field4385++;
        if (arg1 == null) {
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
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class286.method1798(116, arg1.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method2047(var16, -100);
                    if (this.field4394 != null && var12 != -1) {
                        var17 += this.field4394[var12][var16];
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
                        arg2[var13] = arg1.substring(var7, var15 + 1);
                        var8 = -1;
                        var6 = 0;
                        var12 = -1;
                        var7 = var15 + 1;
                        var13++;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2047(60, 84);
                        if (this.field4394 != null && var12 != -1) {
                            var17 += this.field4394[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2047(62, 30);
                        if (this.field4394 != null && var12 != -1) {
                            var17 += this.field4394[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2047(160, 72);
                        if (this.field4394 != null && var12 != -1) {
                            var17 += this.field4394[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2047(173, -117);
                        if (this.field4394 != null && var12 != -1) {
                            var17 += this.field4394[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2047(215, 110);
                        if (this.field4394 != null && var12 != -1) {
                            var17 += this.field4394[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2047(8364, 99);
                        if (this.field4394 != null && var12 != -1) {
                            var17 += this.field4394[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2047(169, 96);
                        if (this.field4394 != null && var12 != -1) {
                            var17 += this.field4394[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2047(174, -127);
                        if (this.field4394 != null && var12 != -1) {
                            var17 += this.field4394[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg3 != null) {
                        try {
                            int var20 = class362.method2277(var19.substring(4), -94);
                            var17 += arg3[var20].method740();
                            var12 = -1;
                        } catch (Exception var22) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg4 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var10 = 1;
                            var8 = var15;
                        }
                        if (arg4[var13 >= arg4.length ? arg4.length - 1 : var13] < var6) {
                            if (var8 < 0) {
                                arg2[var13] = arg1.substring(var7, var18);
                                var13++;
                                var7 = var18;
                                var8 = -1;
                                var6 = var17;
                                var12 = -1;
                            } else {
                                arg2[var13] = arg1.substring(var7, var8 - (var10 - 1));
                                var7 = var8 + 1;
                                var13++;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
                            }
                        }
                        if (var16 == 45) {
                            var9 = var6;
                            var8 = var15;
                            var10 = 0;
                        }
                    }
                }
            }
        }
        int var21 = -103 / ((-arg0 - 2) / 55);
        if (var7 < arg1.length()) {
            arg2[var13] = arg1.substring(var7, arg1.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2049(int arg0, String arg1, int arg2) {
        if (arg2 <= 22) {
            field4384 = 18;
        }
        field4377++;
        class450 var3 = class59.method540(3, arg0, 1000);
        var3.method2800(256);
        var3.field6504 = arg1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;BI[Lkb;)I")
    public final int method2050(String arg0, byte arg1, int arg2, class80[] arg3) {
        field4390++;
        return arg1 >= -60 ? -33 : this.method2048((byte) 86, arg0, class263.field3534, arg3, new int[] { arg2 });
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method2051(int arg0) {
        field4395 = null;
        field4387 = null;
        field4388 = null;
        if (arg0 <= 78) {
            field4384 = -51;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II[Lkb;ILjava/lang/String;)I")
    public final int method2052(int arg0, int arg1, class80[] arg2, int arg3, String arg4) {
        if (arg3 == 0) {
            arg3 = this.field4383;
        }
        field4373++;
        int var6 = this.method2048((byte) -83, arg4, class263.field3534, arg2, new int[] { arg0 });
        int var7 = (var6 - 1) * arg3;
        if (arg1 >= -25) {
            field4388 = null;
        }
        return this.field4389 + var7 + this.field4376;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public static final void method2053(int arg0) {
        field4382++;
        class410 var1 = class63.field963;
        synchronized (class63.field963) {
            class63.field963.method2539(121);
        }
        class410 var2 = class443.field6386;
        synchronized (class443.field6386) {
            class443.field6386.method2539(arg0 ^ 0x76);
        }
        class410 var3 = class431.field6128;
        synchronized (class431.field6128) {
            class431.field6128.method2539(127);
        }
        class410 var4 = class68.field1026;
        synchronized (class68.field1026) {
            class68.field1026.method2539(39);
        }
        if (arg0 != 0) {
            field4388 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBC)I")
    public final int method2054(int arg0, byte arg1, char arg2) {
        int var4 = -20 / ((43 - arg1) / 49);
        field4393++;
        return this.field4394 == null ? 0 : this.field4394[arg0][arg2];
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;B[Lkb;I)I")
    public final int method2055(String arg0, byte arg1, class80[] arg2, int arg3) {
        field4396++;
        int var5 = this.method2048((byte) 119, arg0, class263.field3534, arg2, new int[] { arg3 });
        int var6 = 0;
        if (arg1 != -97) {
            this.method2055((String) null, (byte) 107, (class80[]) null, 41);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2060(class263.field3534[var7], (byte) 40);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
    public static final void method2056(int arg0, String arg1, String arg2, int arg3, String arg4, int arg5, String arg6, int arg7) {
        field4374++;
        if (arg0 != 31437) {
            field4388 = null;
        }
        for (int var8 = 99; var8 > 0; var8--) {
            class360.field4882[var8] = class360.field4882[var8 - 1];
            class398.field5567[var8] = class398.field5567[var8 - 1];
            class31.field522[var8] = class31.field522[var8 - 1];
            class399.field5587[var8] = class399.field5587[var8 - 1];
            class360.field4878[var8] = class360.field4878[var8 - 1];
            class316.field4294[var8] = class316.field4294[var8 - 1];
            class113.field1607[var8] = class113.field1607[var8 - 1];
        }
        class360.field4882[0] = arg5;
        class31.field522[0] = arg1;
        class398.field5567[0] = arg3;
        class399.field5587[0] = arg4;
        class360.field4878[0] = arg2;
        class122.field1720 = class387.field5445;
        class316.field4294[0] = arg6;
        class113.field1607[0] = arg7;
        class413.field5779++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)I")
    public static final int method2057(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method2051(78);
        }
        field4386++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([Lkb;ILjava/lang/String;)I")
    public final int method2058(class80[] arg0, int arg1, String arg2) {
        field4380++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
        if (arg1 != -63) {
            return -5;
        }
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class362.method2277(var10.substring(4), -62);
                                    var5 = -1;
                                    var6 += arg0[var11].method740();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field4381[class286.method1798(106, var9) & 0xFF] & 0xFF;
                    if (this.field4394 != null && var5 != -1) {
                        var6 += this.field4394[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)I")
    public static int method2059(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method2060(String arg0, byte arg1) {
        field4392++;
        return arg1 <= 29 ? -96 : this.method2058((class80[]) null, -63, arg0);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([B)V")
    public class323(byte[] arg0) {
        class289 var2 = new class289(arg0);
        int var3 = var2.method1861((byte) -72);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1861((byte) -72) == 1;
        this.field4381 = new byte[256];
        var2.method1882(-127, 256, 0, this.field4381);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1861((byte) -72);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1861((byte) -72);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1868((byte) -122);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1868((byte) -128);
                    var11[var12][var16] = var15;
                }
            }
            this.field4394 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4394[var13][var14] = (byte) class223.method1522(var13, var14, this.field4381, var9, var11, 44, var6, var5);
                        }
                    }
                }
            }
            this.field4383 = var6[32] + var5[32];
        } else {
            this.field4383 = var2.method1861((byte) -72);
        }
        var2.method1861((byte) -72);
        var2.method1861((byte) -72);
        this.field4389 = var2.method1861((byte) -72);
        this.field4376 = var2.method1861((byte) -72);
    }
}
