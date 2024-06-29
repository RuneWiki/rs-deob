import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class4 {

    @OriginalMember(owner = "client!se", name = "g", descriptor = "[B")
    private byte[] field49;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "[[B")
    private byte[][] field54;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lui;")
    public static class375 field47 = new class375("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field50 = 16777215;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[Lf;")
    public static class191[] field62;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[I[Ljava/lang/String;Ljava/lang/String;[Lf;)I")
    public final int method35(int arg0, int[] arg1, String[] arg2, String arg3, class191[] arg4) {
        field48++;
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
        int var13 = 0;
        if (arg0 != 160) {
            return 100;
        }
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class227.method1559((byte) -79, arg3.charAt(var15)) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method40(var16, (byte) 41);
                    var18 = var15;
                    if (this.field54 != null && var12 != -1) {
                        var17 += this.field54[var12][var16];
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
                        arg2[var13] = arg3.substring(var7, var15 + 1);
                        var13++;
                        if (arg2.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var6 = 0;
                        var7 = var15 + 1;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method40(60, (byte) 85);
                        if (this.field54 != null && var12 != -1) {
                            var17 += this.field54[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method40(62, (byte) 65);
                        if (this.field54 != null && var12 != -1) {
                            var17 += this.field54[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method40(160, (byte) 44);
                        if (this.field54 != null && var12 != -1) {
                            var17 += this.field54[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method40(173, (byte) 83);
                        if (this.field54 != null && var12 != -1) {
                            var17 += this.field54[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method40(215, (byte) 125);
                        if (this.field54 != null && var12 != -1) {
                            var17 += this.field54[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method40(8364, (byte) 111);
                        if (this.field54 != null && var12 != -1) {
                            var17 += this.field54[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method40(169, (byte) 41);
                        if (this.field54 != null && var12 != -1) {
                            var17 += this.field54[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method40(174, (byte) 103);
                        if (this.field54 != null && var12 != -1) {
                            var17 += this.field54[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class188.method1320(var19.substring(4), -126);
                            var12 = -1;
                            var17 += arg4[var20].method209();
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
                            var9 = var6;
                            var10 = 1;
                        }
                        if (arg1[arg1.length > var13 ? var13 : arg1.length - 1] < var6) {
                            if (var8 >= 0) {
                                arg2[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (arg2.length <= var13) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var12 = -1;
                                var8 = -1;
                                var6 -= var9;
                            } else {
                                arg2[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (var13 >= arg2.length) {
                                    return 0;
                                }
                                var6 = var17;
                                var8 = -1;
                                var12 = -1;
                                var7 = var18;
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
        if (var7 < arg3.length()) {
            arg2[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([Lf;ILjava/lang/String;II)I")
    public final int method36(class191[] arg0, int arg1, String arg2, int arg3, int arg4) {
        field51++;
        if (arg3 == 0) {
            arg3 = this.field53;
        }
        int var6 = this.method35(160, new int[] { arg4 }, class256.field3545, arg2, arg0);
        if (arg1 != -257) {
            field62 = null;
        }
        int var7 = (var6 - 1) * arg3;
        return this.field58 + var7 + this.field44;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B[Lf;ILjava/lang/String;)I")
    public final int method37(byte arg0, class191[] arg1, int arg2, String arg3) {
        if (arg0 == -20) {
            field55++;
            return this.method35(160, new int[] { arg2 }, class256.field3545, arg3, arg1);
        } else {
            return -113;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[Lf;Ljava/lang/String;I)I")
    public final int method38(int arg0, class191[] arg1, String arg2, int arg3) {
        field61++;
        int var5 = this.method35(160, new int[] { arg0 }, class256.field3545, arg2, arg1);
        int var6 = 0;
        for (int var7 = arg3; var7 < var5; var7++) {
            int var8 = this.method42((byte) -126, class256.field3545[var7], arg1);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(CII)I")
    public final int method39(char arg0, int arg1, int arg2) {
        field56++;
        if (arg2 < 92) {
            this.method36(null, 50, null, -1, -78);
        }
        return this.field54 == null ? 0 : this.field54[arg1][arg0];
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)I")
    public final int method40(int arg0, byte arg1) {
        field45++;
        if (arg1 < 38) {
            this.field58 = 20;
        }
        return this.field49[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I[Lf;ILjava/lang/String;)Ljava/lang/String;")
    public final String method41(int arg0, class191[] arg1, int arg2, String arg3) {
        field46++;
        if (this.method42((byte) -123, arg3, arg1) <= arg2) {
            return arg3;
        }
        int var5 = arg2 - this.method42((byte) -126, "...", null);
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = 78 % ((63 - arg0) / 52);
        int var10 = arg3.length();
        String var11 = "";
        for (int var12 = 0; var12 < var10; var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 == '<') {
                var6 = var12;
            } else {
                if (var13 == '>' && var6 != -1) {
                    String var14 = arg3.substring(var6 + 1, var12);
                    var6 = -1;
                    if (var14.equals("lt")) {
                        var13 = '<';
                    } else if (var14.equals("gt")) {
                        var13 = '>';
                    } else if (var14.equals("nbsp")) {
                        var13 = ' ';
                    } else if (var14.equals("shy")) {
                        var13 = '\u00AD';
                    } else if (var14.equals("times")) {
                        var13 = '×';
                    } else if (var14.equals("euro")) {
                        var13 = '€';
                    } else if (var14.equals("copy")) {
                        var13 = '©';
                    } else {
                        if (!var14.equals("reg")) {
                            if (var14.startsWith("img=") && arg1 != null) {
                                try {
                                    int var15 = class188.method1320(var14.substring(4), -124);
                                    var8 += arg1[var15].method209();
                                    var7 = -1;
                                    if (var5 < var8) {
                                        return var11 + "...";
                                    }
                                    var11 = arg3.substring(0, var12 + 1);
                                } catch (Exception var17) {
                                }
                            }
                            continue;
                        }
                        var13 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field49[class227.method1559((byte) -79, var13) & 0xFF] & 0xFF;
                    if (this.field54 != null && var7 != -1) {
                        var8 += this.field54[var7][var13];
                    }
                    var7 = var13;
                    int var16 = var8;
                    if (this.field54 != null) {
                        var16 = this.field54[var13][46] + var8;
                    }
                    if (var16 > var5) {
                        return var11 + "...";
                    }
                    var11 = arg3.substring(0, var12 + 1);
                }
            }
        }
        return arg3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/lang/String;[Lf;)I")
    public final int method42(byte arg0, String arg1, class191[] arg2) {
        field59++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        if (arg0 > -112) {
            field47 = null;
        }
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
                            if (var10.startsWith("img=") && arg2 != null) {
                                try {
                                    int var11 = class188.method1320(var10.substring(4), -127);
                                    var5 = -1;
                                    var6 += arg2[var11].method209();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field49[class227.method1559((byte) -79, var9) & 0xFF] & 0xFF;
                    if (this.field54 != null && var5 != -1) {
                        var6 += this.field54[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqa;IILia;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method43(class496 arg0, int arg1, int arg2, class23 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class351.field5447 = arg0;
        class332.field5132 = arg1;
        class164.field2397 = arg3;
        class17.field277 = class351.field5447.method1084() > 0;
        class10.field149 = arg4 >> class386.field5882;
        class29.field458 = arg6 >> class386.field5882;
        class346.field5413 = arg4;
        class178.field2540 = arg6;
        class82.field1106 = arg5;
        class350.field5446 = class10.field149 - class75.field1021;
        if (class350.field5446 < 0) {
            class338.field5356 = -class350.field5446;
            class350.field5446 = 0;
        } else {
            class338.field5356 = 0;
        }
        class425.field6327 = class29.field458 - class75.field1021;
        if (class425.field6327 < 0) {
            class5.field73 = -class425.field6327;
            class425.field6327 = 0;
        } else {
            class5.field73 = 0;
        }
        class180.field2570 = class75.field1021 + class10.field149;
        if (class180.field2570 > class492.field7186) {
            class180.field2570 = class492.field7186;
        }
        class95.field1379 = class75.field1021 + class29.field458;
        if (class95.field1379 > class285.field4248) {
            class95.field1379 = class285.field4248;
        }
        for (int var18 = 0; var18 < class75.field1021 + class75.field1021 + 2; var18++) {
            for (int var23 = 0; var23 < class75.field1021 + class75.field1021 + 2; var23++) {
                int var24 = class10.field149 + var18 - class75.field1021;
                int var25 = class29.field458 + var23 - class75.field1021;
                if (var24 >= 0 && var25 >= 0 && var24 < class492.field7186 && var25 < class285.field4248) {
                    int var26 = var24 << class386.field5882;
                    int var27 = var25 << class386.field5882;
                    int var28 = class204.field2871[class204.field2871.length - 1].method849(var24, var25) - (0x3E8 << class386.field5882 - 7);
                    int var29 = class187.field2632 == null ? class204.field2871[0].method849(var24, var25) + class215.field2995 : class187.field2632[0].method849(var24, var25) + class215.field2995;
                    class25.field408[var18][var23] = class351.field5447.method1123(var26, var28, var27, var26, var29, var27);
                } else {
                    class25.field408[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class75.field1021 + class75.field1021 + 1; var19++) {
            for (int var22 = 0; var22 < class75.field1021 + class75.field1021 + 1; var22++) {
                class11.field171[var19][var22] = class25.field408[var19][var22] || class25.field408[var19 + 1][var22] || class25.field408[var19][var22 + 1] || class25.field408[var19 + 1][var22 + 1];
            }
        }
        class344.field5395 = arg8;
        class482.field7027 = arg9;
        class391.field5946 = arg10;
        class113.field1577 = arg11;
        class27.field448 = arg12;
        class27.method207();
        class94.method654(2100623105);
        for (class507 var20 = (class507) class404.field6112.method2358((byte) 126); var20 != null; var20 = (class507) class404.field6112.method2363(31844)) {
            var20.method142(0);
            class415.method2519(var20, 16642);
        }
        if (class17.field277) {
            for (int var21 = 0; var21 < class309.field4630; var21++) {
                class515.field7632[var21].method923(arg17, arg1, 50);
            }
        }
        if (arg2 > 1) {
            class351.field5447.method1131(0);
            if (class307.field4503 == null || class307.field4503 instanceof class382) {
                class307.field4503 = new class84();
            }
        } else if (class307.field4503 == null || class307.field4503 instanceof class84) {
            class307.field4503 = new class382();
        }
        class307.field4503.method547(5754, arg2);
        class307.field4503.method546(0);
        if (class483.field7028 != null) {
            class439.method2655(true);
            class307.field4503.method543(false, 22);
            class141.method946(arg2, null, 0, (byte) 0, arg15, arg16);
            class307.field4503.method546(0);
            class307.field4503.method543(false, 23);
            class439.method2655(false);
        }
        class141.method946(arg2, arg7, arg13, arg14, arg15, arg16);
        class307.field4503.method546(0);
        class307.field4503.method551((byte) -78);
        class307.field4503.method546(0);
        if (arg2 > 1) {
            class351.field5447.method1105(0);
        }
        class351.field5447.method1106(0, null);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        if (arg0 == 31477) {
            field47 = null;
            field62 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method45(String arg0, byte arg1) {
        if (arg1 > -43) {
            this.field54 = null;
        }
        field52++;
        return this.method42((byte) -120, arg0, null);
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V")
    public class4(byte[] arg0) {
        class91 var2 = new class91(arg0);
        int var3 = var2.method618((byte) 100);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method618((byte) 100) == 1;
        this.field49 = new byte[256];
        var2.method617(0, 256, false, this.field49);
        if (var4) {
            int[] var5 = new int[256];
            for (int var6 = 0; var6 < 256; var6++) {
                var5[var6] = var2.method618((byte) 100);
            }
            int[] var7 = new int[256];
            for (int var8 = 0; var8 < 256; var8++) {
                var7[var8] = var2.method618((byte) 100);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method619((byte) -23);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method619((byte) -23);
                    var11[var12][var16] = var15;
                }
            }
            this.field54 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field54[var13][var14] = (byte) class235.method1599(-109, var9, var7, this.field49, var5, var14, var13, var11);
                        }
                    }
                }
            }
            this.field53 = var5[32] + var7[32];
        } else {
            this.field53 = var2.method618((byte) 100);
        }
        var2.method618((byte) 100);
        var2.method618((byte) 100);
        this.field58 = var2.method618((byte) 100);
        this.field44 = var2.method618((byte) 100);
    }
}
