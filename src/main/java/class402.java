import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class402 {

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "[B")
    private byte[] field5868;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "[[B")
    private byte[][] field5869;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public int field5874;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public int field5866;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public int field5879;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "Z")
    public static boolean field5871;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "[I")
    public static int[] field5863;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)I")
    public final int method2520(int arg0, byte arg1) {
        if (arg1 <= 9) {
            this.field5866 = -90;
        }
        field5872++;
        return this.field5868[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[Llg;IILjava/lang/String;)I")
    public final int method2521(int arg0, class20[] arg1, int arg2, int arg3, String arg4) {
        if (arg0 != 3699) {
            this.method2522((String) null, (class20[]) null, (int[]) null, -5, (String[]) null);
        }
        field5875++;
        if (arg3 == 0) {
            arg3 = this.field5874;
        }
        int var6 = this.method2522(arg4, arg1, new int[] { arg2 }, 54, class5.field37);
        int var7 = (var6 - 1) * arg3;
        return this.field5879 + this.field5866 + var7;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;[Llg;[II[Ljava/lang/String;)I")
    public final int method2522(String arg0, class20[] arg1, int[] arg2, int arg3, String[] arg4) {
        field5878++;
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
        if (arg3 <= 22) {
            return 28;
        }
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class62.method338(arg0.charAt(var15), -128) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method2520(var16, (byte) 88);
                    var18 = var15;
                    if (this.field5869 != null && var12 != -1) {
                        var17 += this.field5869[var12][var16];
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
                        var8 = -1;
                        var13++;
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method2520(60, (byte) 33);
                        if (this.field5869 != null && var12 != -1) {
                            var17 += this.field5869[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method2520(62, (byte) 37);
                        if (this.field5869 != null && var12 != -1) {
                            var17 += this.field5869[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method2520(160, (byte) 39);
                        if (this.field5869 != null && var12 != -1) {
                            var17 += this.field5869[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method2520(173, (byte) 30);
                        if (this.field5869 != null && var12 != -1) {
                            var17 += this.field5869[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method2520(215, (byte) 48);
                        if (this.field5869 != null && var12 != -1) {
                            var17 += this.field5869[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method2520(8364, (byte) 78);
                        if (this.field5869 != null && var12 != -1) {
                            var17 += this.field5869[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method2520(169, (byte) 103);
                        if (this.field5869 != null && var12 != -1) {
                            var17 += this.field5869[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method2520(174, (byte) 76);
                        if (this.field5869 != null && var12 != -1) {
                            var17 += this.field5869[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class359.method2196((byte) 112, var19.substring(4));
                            var17 += arg1[var20].method101();
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
                            var8 = var15;
                            var10 = 1;
                            var9 = var6;
                        }
                        if (arg2[arg2.length <= var13 ? arg2.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg4[var13] = arg0.substring(var7, var8 + 1 - var10);
                                var13++;
                                var7 = var8 + 1;
                                var8 = -1;
                                var6 -= var9;
                                var12 = -1;
                            } else {
                                arg4[var13] = arg0.substring(var7, var18);
                                var6 = var17;
                                var13++;
                                var7 = var18;
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
        if (arg0.length() > var7) {
            arg4[var13] = arg0.substring(var7, arg0.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILjava/lang/String;[Llg;)I")
    public final int method2523(int arg0, int arg1, String arg2, class20[] arg3) {
        if (arg1 != 4) {
            this.field5874 = -109;
        }
        field5865++;
        return this.method2522(arg2, arg3, new int[] { arg0 }, 41, class5.field37);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([Llg;Ljava/lang/String;I)I")
    public final int method2524(class20[] arg0, String arg1, int arg2) {
        field5867++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
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
                                    int var11 = class359.method2196((byte) 108, var10.substring(4));
                                    var5 = -1;
                                    var6 += arg0[var11].method101();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field5868[class62.method338(var9, arg2 ^ 0xFFFFFA6E) & 0xFF] & 0xFF;
                    if (this.field5869 != null && var5 != -1) {
                        var6 += this.field5869[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        if (arg2 != 1518) {
            this.method2523(-18, -27, (String) null, (class20[]) null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static final void method2525(int arg0) {
        field5864++;
        if (arg0 != 160) {
            field5871 = true;
        }
        if (class429.field6292 != 2) {
            try {
                class245.method1313(class267.field3646, (byte) 80, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2526(String arg0, int arg1) {
        field5876++;
        if (arg1 != 160) {
            this.field5879 = 7;
        }
        return this.method2524((class20[]) null, arg0, arg1 + 1358);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lvm;B)V")
    public static final void method2527(class322 arg0, byte arg1) {
        field5862++;
        int var2 = class344.field4618;
        int var3 = class18.field179;
        int var4 = class344.field4620;
        int var5 = class229.field3159;
        int var6 = -10660793;
        arg0.method1860(var3, -3272, var4, var2, var5, var6);
        arg0.method1860(var3 + 1, -3272, var4 + -2, var2 + 1, 16, -16777216);
        arg0.method1862(var5 - 19, var4 - 2, var2 + 1, var3 + 18, (byte) 3, -16777216);
        class291.field3957.method1746(var6, class320.field4286, var2 + 3, (byte) -124, -1, var3 + 14);
        int var7 = class337.field4493;
        int var8 = -90 / ((arg1 + 68) / 57);
        int var9 = class306.field4146;
        int var10 = 0;
        for (class405 var11 = (class405) class342.field4577.method814((byte) 90); var11 != null; var11 = (class405) class342.field4577.method827(-128)) {
            int var12 = (class244.field3323 - var10 - 1) * 16 + var3 + 31;
            short var13 = -1;
            if (var7 > var2 && var7 < var2 + var4 && var12 - 13 < var9 && var12 + 3 > var9) {
                var13 = -256;
            }
            int[] var14 = null;
            if (class306.method1798(var11.field5892, 9055)) {
                var14 = class65.method368((int) var11.field5891, -123).field1543;
            } else if (class293.method1725((byte) -7, var11.field5892)) {
                class91 var15 = class38.field397[(int) var11.field5891];
                if (var15 != null) {
                    var14 = var15.field1035.field4655;
                }
            } else if (class376.method2259((byte) -89, var11.field5892)) {
                if (var11.field5892 == 1010) {
                    var14 = class281.method1655((byte) -28, (int) var11.field5891).field3068;
                } else {
                    var14 = class281.method1655((byte) -28, (int) (var11.field5891 >>> 32 & 0x7FFFFFFFL)).field3068;
                }
            }
            String var16 = class83.method452(var11, 14963);
            if (var14 != null) {
                var16 = var16 + client.method1409((byte) 101, var14);
            }
            class291.field3957.method1752(var13, class335.field4469, 0, var16, var2 + 3, -33, var12, class130.field1673);
            var10++;
        }
        class108.method575(class344.field4620, class229.field3159, class18.field179, 10636, class344.field4618);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static void method2528(int arg0) {
        field5863 = null;
        if (arg0 != 2) {
            field5871 = true;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[Llg;Ljava/lang/String;I)I")
    public final int method2529(int arg0, class20[] arg1, String arg2, int arg3) {
        field5870++;
        int var5 = this.method2522(arg2, arg1, new int[] { arg0 }, 29, class5.field37);
        int var6 = arg3;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method2526(class5.field37[var7], 160);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lwe;")
    public static final class24 method2530(int arg0, int arg1) {
        field5861++;
        class24 var2 = (class24) class29.field276.method616(125, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field449.method1687(arg0, arg1, arg1 ^ 0xDE);
        class24 var4 = new class24();
        if (var3 != null) {
            var4.method127(new class250(var3), arg0, -26357);
        }
        class29.field276.method615((byte) -122, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V")
    public class402(byte[] arg0) {
        class250 var2 = new class250(arg0);
        int var3 = var2.method1350(31351);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1350(31351) == 1;
        this.field5868 = new byte[256];
        var2.method1351(this.field5868, (byte) -127, 0, 256);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method1350(31351);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method1350(31351);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1363((byte) -101);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1363((byte) 123);
                    var11[var12][var16] = var15;
                }
            }
            this.field5869 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field5869[var13][var14] = (byte) class382.method2361(var5, var9, var7, this.field5868, 255, var11, var14, var13);
                        }
                    }
                }
            }
            this.field5874 = var7[32] + var5[32];
        } else {
            this.field5874 = var2.method1350(31351);
        }
        var2.method1350(31351);
        var2.method1350(31351);
        this.field5866 = var2.method1350(31351);
        this.field5879 = var2.method1350(31351);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIC)I")
    public final int method2531(int arg0, int arg1, char arg2) {
        if (arg1 >= -57) {
            return 24;
        } else {
            field5877++;
            return this.field5869 == null ? 0 : this.field5869[arg0][arg2];
        }
    }
}
