import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class347 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "[B")
    private byte[] field4770;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "[[B")
    private byte[][] field4783;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public int field4772;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public int field4782;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Lld;")
    public static class105 field4785;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[Ljava/lang/String;Ljava/lang/String;[I[Ljd;)I")
    public final int method2138(int arg0, String[] arg1, String arg2, int[] arg3, class139[] arg4) {
        field4781++;
        if (arg2 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 5 % ((arg0 + 50) / 42);
        int var8 = 0;
        int var9 = -1;
        int var10 = 0;
        byte var11 = 0;
        int var12 = -1;
        int var13 = -1;
        int var14 = 0;
        int var15 = arg2.length();
        for (int var16 = 0; var16 < var15; var16++) {
            int var17 = class332.method1905(arg2.charAt(var16), 18658) & 0xFF;
            int var18 = 0;
            if (var17 == 60) {
                var12 = var16;
            } else {
                int var19;
                if (var12 == -1) {
                    var19 = var16;
                    var18 += this.method2141(-117, var17);
                    if (this.field4783 != null && var13 != -1) {
                        var18 += this.field4783[var13][var17];
                    }
                    var13 = var17;
                } else {
                    if (var17 != 62) {
                        continue;
                    }
                    var19 = var12;
                    String var20 = arg2.substring(var12 + 1, var16);
                    var12 = -1;
                    if (var20.equals("br")) {
                        arg1[var14] = arg2.substring(var8, var16 + 1);
                        var14++;
                        if (var14 >= arg1.length) {
                            return 0;
                        }
                        var8 = var16 + 1;
                        var13 = -1;
                        var9 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var20.equals("lt")) {
                        var18 += this.method2141(-61, 60);
                        if (this.field4783 != null && var13 != -1) {
                            var18 += this.field4783[var13][60];
                        }
                        var13 = 60;
                    } else if (var20.equals("gt")) {
                        var18 += this.method2141(-97, 62);
                        if (this.field4783 != null && var13 != -1) {
                            var18 += this.field4783[var13][62];
                        }
                        var13 = 62;
                    } else if (var20.equals("nbsp")) {
                        var18 += this.method2141(-115, 160);
                        if (this.field4783 != null && var13 != -1) {
                            var18 += this.field4783[var13][160];
                        }
                        var13 = 160;
                    } else if (var20.equals("shy")) {
                        var18 += this.method2141(-82, 173);
                        if (this.field4783 != null && var13 != -1) {
                            var18 += this.field4783[var13][173];
                        }
                        var13 = 173;
                    } else if (var20.equals("times")) {
                        var18 += this.method2141(-60, 215);
                        if (this.field4783 != null && var13 != -1) {
                            var18 += this.field4783[var13][215];
                        }
                        var13 = 215;
                    } else if (var20.equals("euro")) {
                        var18 += this.method2141(-123, 8364);
                        if (this.field4783 != null && var13 != -1) {
                            var18 += this.field4783[var13][8364];
                        }
                        var13 = 8364;
                    } else if (var20.equals("copy")) {
                        var18 += this.method2141(-118, 169);
                        if (this.field4783 != null && var13 != -1) {
                            var18 += this.field4783[var13][169];
                        }
                        var13 = 169;
                    } else if (var20.equals("reg")) {
                        var18 += this.method2141(-124, 174);
                        if (this.field4783 != null && var13 != -1) {
                            var18 += this.field4783[var13][174];
                        }
                        var13 = 174;
                    } else if (var20.startsWith("img=") && arg4 != null) {
                        try {
                            int var21 = class455.method2673(121, var20.substring(4));
                            var13 = -1;
                            var18 += arg4[var21].method777();
                        } catch (Exception var22) {
                        }
                    }
                    var17 = -1;
                }
                if (var18 > 0) {
                    var6 += var18;
                    if (arg3 != null) {
                        if (var17 == 32) {
                            var10 = var6;
                            var11 = 1;
                            var9 = var16;
                        }
                        if (var6 > arg3[arg3.length <= var14 ? arg3.length - 1 : var14]) {
                            if (var9 >= 0) {
                                arg1[var14] = arg2.substring(var8, var9 + 1 - var11);
                                var14++;
                                if (arg1.length <= var14) {
                                    return 0;
                                }
                                var8 = var9 + 1;
                                var13 = -1;
                                var9 = -1;
                                var6 -= var10;
                            } else {
                                arg1[var14] = arg2.substring(var8, var19);
                                var14++;
                                if (var14 >= arg1.length) {
                                    return 0;
                                }
                                var8 = var19;
                                var6 = var18;
                                var9 = -1;
                                var13 = -1;
                            }
                        }
                        if (var17 == 45) {
                            var10 = var6;
                            var11 = 0;
                            var9 = var16;
                        }
                    }
                }
            }
        }
        if (arg2.length() > var8) {
            arg1[var14] = arg2.substring(var8, arg2.length());
            var14++;
        }
        return var14;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILqg;)V")
    public static final void method2139(int arg0, class296 arg1) {
        arg1.method1665(-2);
        field4773++;
        int var2 = class332.field4494;
        class487 var3 = class233.field3103 = class413.field5644[var2] = new class487();
        var3.field1163 = var2;
        int var4 = arg1.method1664((byte) -13, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFFF37) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field1193[0] = var6 - class162.field2260;
        var3.field6501 = (var3.field1193[0] << 7) + (var3.method545(false) << 6);
        var3.field1197[0] = var7 - class266.field3511;
        var3.field6507 = (var3.field1197[0] << 7) + (var3.method545(false) << 6);
        class373.field5104 = var3.field6502 = var5;
        if (class374.field5166[var2] != null) {
            var3.method2829(class374.field5166[var2], 97);
        }
        class239.field3187 = 0;
        class265.field3502[class239.field3187++] = var2;
        class111.field1689[var2] = 0;
        class16.field230 = 0;
        if (arg0 != 3695) {
            return;
        }
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1664((byte) -13, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class71.field978[var8] = (var10 << 28) - (-(var11 << 14) - var12);
                class108.field1617[var8] = 0;
                class15.field219[var8] = -1;
                class263.field3483[class16.field230++] = var8;
                class111.field1689[var8] = 0;
            }
        }
        arg1.method1661((byte) -43);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjava/lang/String;B[Ljd;I)I")
    public final int method2140(int arg0, String arg1, byte arg2, class139[] arg3, int arg4) {
        if (arg0 == 0) {
            arg0 = this.field4777;
        }
        field4780++;
        int var6 = this.method2138(-116, class106.field1596, arg1, new int[] { arg4 }, arg3);
        int var7 = (var6 - 1) * arg0;
        int var8 = -15 / ((arg2 - 8) / 57);
        return var7 + this.field4782 + this.field4772;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
    public final int method2141(int arg0, int arg1) {
        field4784++;
        return arg0 >= -38 ? 118 : this.field4770[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLjava/lang/String;I[Ljd;)I")
    public final int method2142(byte arg0, String arg1, int arg2, class139[] arg3) {
        field4778++;
        return arg0 > -13 ? 53 : this.method2138(-115, class106.field1596, arg1, new int[] { arg2 }, arg3);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([Ljd;Ljava/lang/String;BI)I")
    public final int method2143(class139[] arg0, String arg1, byte arg2, int arg3) {
        field4775++;
        int var5 = this.method2138(-107, class106.field1596, arg1, new int[] { arg3 }, arg0);
        int var6 = 0;
        int var7 = 0;
        if (arg2 > -24) {
            this.method2141(49, 116);
        }
        while (var7 < var5) {
            int var8 = this.method2146(arg0, true, class106.field1596[var7]);
            if (var6 < var8) {
                var6 = var8;
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIC)I")
    public final int method2144(int arg0, int arg1, char arg2) {
        field4779++;
        if (arg1 != 1) {
            method2148((class464) null, -68);
        }
        return this.field4783 == null ? 0 : this.field4783[arg0][arg2];
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2145(String arg0, int arg1) {
        if (arg1 != 13938) {
            method2147(83);
        }
        field4774++;
        return this.method2146((class139[]) null, true, arg0);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([Ljd;ZLjava/lang/String;)I")
    public final int method2146(class139[] arg0, boolean arg1, String arg2) {
        field4771++;
        if (!arg1) {
            this.method2145((String) null, -79);
        }
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
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class455.method2673(119, var10.substring(4));
                                    var6 += arg0[var11].method777();
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
                    var6 += this.field4770[class332.method1905(var9, 18658) & 0xFF] & 0xFF;
                    if (this.field4783 != null && var5 != -1) {
                        var6 += this.field4783[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method2147(int arg0) {
        field4785 = null;
        if (arg0 != 31208) {
            field4785 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lnk;I)V")
    public static final void method2148(class464 arg0, int arg1) {
        field4776++;
        if (!class289.field3899) {
            return;
        }
        class18.field253++;
        if (arg1 > -126) {
            field4785 = null;
        }
        class491.method2861(class4.field54, 1);
        class203.field2751.method199((byte) -117, arg0.field6440);
        class203.field2751.method241(arg0.field6397, (byte) -48);
        class203.field2751.method241(class38.field559, (byte) -103);
        class203.field2751.method229(class336.field4538, 1309449544);
        class203.field2751.method191(-839598448, class210.field2841);
        class203.field2751.method229(arg0.field6402, 1309449544);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
    public class347(byte[] arg0) {
        class32 var2 = new class32(arg0);
        int var3 = var2.method201((byte) -123);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method201((byte) -109) == 1;
        this.field4770 = new byte[256];
        var2.method185(this.field4770, 0, 256, true);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method201((byte) -106);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method201((byte) -117);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method211(29861);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method211(29861);
                    var11[var12][var16] = var15;
                }
            }
            this.field4783 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4783[var13][var14] = (byte) class422.method2500(var5, var13, this.field4770, var11, -260842484, var7, var9, var14);
                        }
                    }
                }
            }
            this.field4777 = var7[32] + var5[32];
        } else {
            this.field4777 = var2.method201((byte) -107);
        }
        var2.method201((byte) -119);
        var2.method201((byte) -112);
        this.field4772 = var2.method201((byte) -125);
        this.field4782 = var2.method201((byte) -123);
    }

    static {
        new class206("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field4785 = new class105();
        Math.sqrt(8192.0D);
    }
}
