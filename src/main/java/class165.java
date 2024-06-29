import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class165 {

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "[B")
    private byte[] field2149;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[[B")
    private byte[][] field2140;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "[Lil;")
    public static class265[] field2155 = new class265[2048];

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field2147 = -14475237;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I", line = 3)
    public final int method1018(int arg0, int arg1) {
        field2159++;
        if (arg1 <= 79) {
            method1023(-87, -39, 74);
        }
        return this.field2149[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[II)[I", line = 14)
    public static final int[] method1019(int arg0, int[] arg1, int arg2) {
        field2150++;
        if (arg2 != 36) {
            field2155 = null;
        }
        int[] var3 = new int[1152];
        int var4 = 0;
        for (int var5 = 0; var5 < 32; var5++) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg1[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg1[var4 - 1] != 0) {
                        var7 = arg0;
                    } else if (var5 > 0 && arg1[var4 - 36] != 0) {
                        var7 = arg0;
                    } else if (var6 < 35 && arg1[var4 + 1] != 0) {
                        var7 = arg0;
                    } else if (var5 < 31 && arg1[var4 + 36] != 0) {
                        var7 = arg0;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)Lta;", line = 68)
    public static final class404 method1020(int arg0, int arg1) {
        field2151++;
        class24 var2 = class249.field3592;
        class404 var3;
        synchronized (class249.field3592) {
            var3 = (class404) class249.field3592.method209(122, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class396.field5944.method1472(class288.method1823(-10210, arg0), class224.method1399(1867186728, arg0), 0);
        class404 var5 = new class404();
        var5.field6059 = arg0;
        if (var4 != null) {
            var5.method2630(new class265(var4), 4204);
        }
        var5.method2621(true);
        if (!class192.field2671 && var5.field6067) {
            var5.field6028 = null;
            var5.field6001 = null;
        }
        if (var5.field6070) {
            var5.field6039 = 0;
            var5.field6037 = false;
        }
        class24 var6 = class249.field3592;
        synchronized (class249.field3592) {
            class249.field3592.method202(true, var5, (long) arg0);
        }
        int var7 = 71 / ((arg1 - 79) / 34);
        return var5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(CZI)I", line = 114)
    public final int method1021(char arg0, boolean arg1, int arg2) {
        field2157++;
        if (arg1) {
            this.method1025((byte) 126, -9, (String) null, (class243[]) null);
        }
        return this.field2140 == null ? 0 : this.field2140[arg2][arg0];
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([Lqa;Ljava/lang/String;B)I", line = 131)
    public final int method1022(class243[] arg0, String arg1, byte arg2) {
        field2154++;
        if (arg1 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg2 != -43) {
            return 91;
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
                                    int var11 = class15.method105(var10.substring(4), (byte) 20);
                                    var6 += arg0[var11].method1088();
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
                    var6 += this.field2149[class213.method1331(var9, true) & 0xFF] & 0xFF;
                    if (this.field2140 != null && var5 != -1) {
                        var6 += this.field2140[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)I", line = 245)
    public static final int method1023(int arg0, int arg1, int arg2) {
        field2141++;
        if (arg0 == 1 || arg0 == 3) {
            return class15.field161[arg2 & 0x3];
        } else if (arg1 == 10036) {
            return class306.field4374[arg2 & 0x3];
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;I[Lqa;)I", line = 261)
    public final int method1024(int arg0, String arg1, int arg2, class243[] arg3) {
        field2144++;
        int var5 = -26 / ((-arg0 - 11) / 41);
        return this.method1028(new int[] { arg2 }, 117, arg1, class72.field984, arg3);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BILjava/lang/String;[Lqa;)I", line = 277)
    public final int method1025(byte arg0, int arg1, String arg2, class243[] arg3) {
        field2145++;
        int var5 = this.method1028(new int[] { arg1 }, -39, arg2, class72.field984, arg3);
        int var6 = 0;
        if (arg0 >= -54) {
            this.field2152 = -82;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1022(arg3, class72.field984[var7], (byte) -43);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([Lqa;Ljava/lang/String;III)I", line = 305)
    public final int method1026(class243[] arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            arg4 = this.field2156;
        }
        field2148++;
        int var6 = this.method1028(new int[] { arg2 }, arg3 + 110, arg1, class72.field984, arg0);
        int var7 = (var6 - arg3) * arg4;
        return this.field2152 + this.field2146 + var7;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 326)
    public static final void method1027(int arg0) {
        for (class259 var1 = (class259) class373.field5574.method2649(0); var1 != null; var1 = (class259) class373.field5574.method2656(0)) {
            if (class194.method1222(var1.field3777, 63)) {
                class297.method1887(false, var1);
            }
        }
        field2153++;
        if (class10.field97 == 1) {
            class229.field3230 = false;
            class271.method1739(class394.field5912, class263.field3828, class200.field2861, class272.field3995, -118);
        } else {
            class271.method1739(class394.field5912, class263.field3828, class200.field2861, class272.field3995, -76);
            int var2 = class272.field3986.method1029((byte) 100, class75.field1015);
            for (class259 var3 = (class259) class373.field5574.method2649(0); var3 != null; var3 = (class259) class373.field5574.method2656(0)) {
                int var5 = class342.method2259((byte) 120, var3);
                if (var2 < var5) {
                    var2 = var5;
                }
            }
            class263.field3828 = class10.field97 * 16 + (class446.field6493 ? 26 : 22);
            class272.field3995 = var2 + 8;
        }
        int var4 = -66 % ((45 - arg0) / 59);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([IILjava/lang/String;[Ljava/lang/String;[Lqa;)I", line = 377)
    public final int method1028(int[] arg0, int arg1, String arg2, String[] arg3, class243[] arg4) {
        field2142++;
        if (arg2 == null) {
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
        int var14 = arg2.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class213.method1331(arg2.charAt(var15), true) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var17 += this.method1018(var16, 108);
                    var18 = var15;
                    if (this.field2140 != null && var12 != -1) {
                        var17 += this.field2140[var12][var16];
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
                        var13++;
                        if (arg3.length <= var13) {
                            return 0;
                        }
                        var8 = -1;
                        var7 = var15 + 1;
                        var12 = -1;
                        var6 = 0;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1018(60, 97);
                        if (this.field2140 != null && var12 != -1) {
                            var17 += this.field2140[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1018(62, 103);
                        if (this.field2140 != null && var12 != -1) {
                            var17 += this.field2140[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1018(160, 92);
                        if (this.field2140 != null && var12 != -1) {
                            var17 += this.field2140[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1018(173, 117);
                        if (this.field2140 != null && var12 != -1) {
                            var17 += this.field2140[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1018(215, 117);
                        if (this.field2140 != null && var12 != -1) {
                            var17 += this.field2140[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1018(8364, 116);
                        if (this.field2140 != null && var12 != -1) {
                            var17 += this.field2140[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1018(169, 83);
                        if (this.field2140 != null && var12 != -1) {
                            var17 += this.field2140[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1018(174, 108);
                        if (this.field2140 != null && var12 != -1) {
                            var17 += this.field2140[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg4 != null) {
                        try {
                            int var20 = class15.method105(var19.substring(4), (byte) 20);
                            var17 += arg4[var20].method1088();
                            var12 = -1;
                        } catch (Exception var22) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg0 != null) {
                        if (var16 == 32) {
                            var10 = 1;
                            var9 = var6;
                            var8 = var15;
                        }
                        if (arg0[arg0.length > var13 ? var13 : arg0.length - 1] < var6) {
                            if (var8 >= 0) {
                                arg3[var13] = arg2.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg3.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var12 = -1;
                                var8 = -1;
                            } else {
                                arg3[var13] = arg2.substring(var7, var18);
                                var13++;
                                if (arg3.length <= var13) {
                                    return 0;
                                }
                                var7 = var18;
                                var12 = -1;
                                var6 = var17;
                                var8 = -1;
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
        if (arg2.length() > var7) {
            arg3[var13] = arg2.substring(var7, arg2.length());
            var13++;
        }
        int var21 = 25 % ((66 - arg1) / 39);
        return var13;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)I", line = 631)
    public final int method1029(byte arg0, String arg1) {
        field2158++;
        int var3 = -71 % ((29 - arg0) / 45);
        return this.method1022((class243[]) null, arg1, (byte) -43);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([B)V", line = 640)
    public class165(byte[] arg0) {
        class265 var2 = new class265(arg0);
        int var3 = var2.method1697(86);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method1697(65) == 1;
        this.field2149 = new byte[256];
        var2.method1710(0, 256, (byte) -101, this.field2149);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method1697(71);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method1697(-56);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method1708((byte) 127);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method1708((byte) 127);
                    var11[var12][var16] = var15;
                }
            }
            this.field2140 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2140[var13][var14] = (byte) class372.method2455(var13, false, var11, this.field2149, var14, var5, var9, var6);
                        }
                    }
                }
            }
            this.field2156 = var5[32] + var6[32];
        } else {
            this.field2156 = var2.method1697(-45);
        }
        var2.method1697(64);
        var2.method1697(63);
        this.field2152 = var2.method1697(123);
        this.field2146 = var2.method1697(104);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 763)
    public static void method1030(int arg0) {
        field2155 = null;
        if (arg0 < 32) {
            field2143 = -33;
        }
    }
}
