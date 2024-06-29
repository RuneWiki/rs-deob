import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class272 {

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[B")
    private byte[] field4167;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "[[B")
    private byte[][] field4169;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "[S")
    public static short[] field4177 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field4165 = 0;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIC)I")
    public final int method1691(int arg0, int arg1, char arg2) {
        field4170++;
        if (arg0 >= -116) {
            return -33;
        } else if (this.field4169 == null) {
            return 0;
        } else {
            return this.field4169[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;[Lkr;B)I")
    public final int method1692(String arg0, class234[] arg1, byte arg2) {
        field4168++;
        if (arg0 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        if (arg2 != -55) {
            this.field4169 = null;
        }
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
                            if (var10.startsWith("img=") && arg1 != null) {
                                try {
                                    int var11 = class25.method154(var10.substring(4), (byte) 127);
                                    var5 = -1;
                                    var6 += arg1[var11].method1226();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field4167[class440.method2693(var9, (byte) -59) & 0xFF] & 0xFF;
                    if (this.field4169 != null && var5 != -1) {
                        var6 += this.field4169[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method1693(int arg0, String arg1) {
        if (arg0 >= -91) {
            this.field4175 = -73;
        }
        field4182++;
        return this.method1692(arg1, (class234[]) null, (byte) -55);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;BI)V")
    public static final void method1694(String arg0, int arg1, String arg2, String arg3, int arg4, String arg5, byte arg6, int arg7) {
        field4178++;
        for (int var8 = 99; var8 > 0; var8--) {
            class160.field2215[var8] = class160.field2215[var8 - 1];
            class394.field5916[var8] = class394.field5916[var8 - 1];
            class250.field3746[var8] = class250.field3746[var8 - 1];
            class72.field962[var8] = class72.field962[var8 - 1];
            class119.field1570[var8] = class119.field1570[var8 - 1];
            class430.field6322[var8] = class430.field6322[var8 - 1];
            class91.field1287[var8] = class91.field1287[var8 - 1];
        }
        class160.field2215[0] = arg1;
        class250.field3746[0] = arg2;
        class394.field5916[0] = arg7;
        class72.field962[0] = arg3;
        class119.field1570[0] = arg0;
        class91.field1287[0] = arg4;
        class413.field6134++;
        class430.field6322[0] = arg5;
        class153.field2105 = class172.field2639;
        if (arg6 <= 98) {
            field4177 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1695(int arg0, String arg1) {
        int var2 = 7 % ((16 - arg0) / 33);
        field4171++;
        return class312.method1901(true, arg1, 10, 13633);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
    public final int method1696(int arg0, int arg1) {
        if (arg0 != -9664) {
            this.field4172 = 115;
        }
        field4179++;
        return this.field4167[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([Lkr;Ljava/lang/String;IBI)I")
    public final int method1697(class234[] arg0, String arg1, int arg2, byte arg3, int arg4) {
        int var6 = -31 / ((arg3 - 20) / 63);
        field4173++;
        if (arg2 == 0) {
            arg2 = this.field4175;
        }
        int var7 = this.method1698(new int[] { arg4 }, arg0, (byte) 68, arg1, class172.field2645);
        int var8 = (var7 - 1) * arg2;
        return this.field4176 + this.field4172 + var8;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([I[Lkr;BLjava/lang/String;[Ljava/lang/String;)I")
    public final int method1698(int[] arg0, class234[] arg1, byte arg2, String arg3, String[] arg4) {
        field4180++;
        if (arg3 == null) {
            return 0;
        }
        if (arg2 < 67) {
            method1695(-63, (String) null);
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 0;
        byte var10 = 0;
        int var11 = -1;
        int var12 = -1;
        int var13 = 0;
        int var14 = arg3.length();
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = class440.method2693(arg3.charAt(var15), (byte) -59) & 0xFF;
            int var17 = 0;
            if (var16 == 60) {
                var11 = var15;
            } else {
                int var18;
                if (var11 == -1) {
                    var18 = var15;
                    var17 += this.method1696(-9664, var16);
                    if (this.field4169 != null && var12 != -1) {
                        var17 += this.field4169[var12][var16];
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
                        var8 = -1;
                        var7 = var15 + 1;
                        var6 = 0;
                        var12 = -1;
                        continue;
                    }
                    if (var19.equals("lt")) {
                        var17 += this.method1696(-9664, 60);
                        if (this.field4169 != null && var12 != -1) {
                            var17 += this.field4169[var12][60];
                        }
                        var12 = 60;
                    } else if (var19.equals("gt")) {
                        var17 += this.method1696(-9664, 62);
                        if (this.field4169 != null && var12 != -1) {
                            var17 += this.field4169[var12][62];
                        }
                        var12 = 62;
                    } else if (var19.equals("nbsp")) {
                        var17 += this.method1696(-9664, 160);
                        if (this.field4169 != null && var12 != -1) {
                            var17 += this.field4169[var12][160];
                        }
                        var12 = 160;
                    } else if (var19.equals("shy")) {
                        var17 += this.method1696(-9664, 173);
                        if (this.field4169 != null && var12 != -1) {
                            var17 += this.field4169[var12][173];
                        }
                        var12 = 173;
                    } else if (var19.equals("times")) {
                        var17 += this.method1696(-9664, 215);
                        if (this.field4169 != null && var12 != -1) {
                            var17 += this.field4169[var12][215];
                        }
                        var12 = 215;
                    } else if (var19.equals("euro")) {
                        var17 += this.method1696(-9664, 8364);
                        if (this.field4169 != null && var12 != -1) {
                            var17 += this.field4169[var12][8364];
                        }
                        var12 = 8364;
                    } else if (var19.equals("copy")) {
                        var17 += this.method1696(-9664, 169);
                        if (this.field4169 != null && var12 != -1) {
                            var17 += this.field4169[var12][169];
                        }
                        var12 = 169;
                    } else if (var19.equals("reg")) {
                        var17 += this.method1696(-9664, 174);
                        if (this.field4169 != null && var12 != -1) {
                            var17 += this.field4169[var12][174];
                        }
                        var12 = 174;
                    } else if (var19.startsWith("img=") && arg1 != null) {
                        try {
                            int var20 = class25.method154(var19.substring(4), (byte) -82);
                            var12 = -1;
                            var17 += arg1[var20].method1226();
                        } catch (Exception var21) {
                        }
                    }
                    var16 = -1;
                }
                if (var17 > 0) {
                    var6 += var17;
                    if (arg0 != null) {
                        if (var16 == 32) {
                            var9 = var6;
                            var10 = 1;
                            var8 = var15;
                        }
                        if (arg0[arg0.length <= var13 ? arg0.length - 1 : var13] < var6) {
                            if (var8 >= 0) {
                                arg4[var13] = arg3.substring(var7, var8 + 1 - var10);
                                var13++;
                                if (var13 >= arg4.length) {
                                    return 0;
                                }
                                var7 = var8 + 1;
                                var6 -= var9;
                                var8 = -1;
                                var12 = -1;
                            } else {
                                arg4[var13] = arg3.substring(var7, var18);
                                var13++;
                                if (arg4.length <= var13) {
                                    return 0;
                                }
                                var8 = -1;
                                var6 = var17;
                                var7 = var18;
                                var12 = -1;
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
        if (var7 < arg3.length()) {
            arg4[var13] = arg3.substring(var7, arg3.length());
            var13++;
        }
        return var13;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static void method1699(int arg0) {
        field4177 = null;
        if (arg0 != 0) {
            method1694((String) null, 31, (String) null, (String) null, -122, (String) null, (byte) 99, 43);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;I[Lkr;I)I")
    public final int method1700(String arg0, int arg1, class234[] arg2, int arg3) {
        field4174++;
        int var5 = this.method1698(new int[] { arg3 }, arg2, (byte) 108, arg0, class172.field2645);
        if (arg1 > -24) {
            method1695(-36, (String) null);
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method1692(class172.field2645[var7], arg2, (byte) -55);
            if (var6 < var8) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I[Lkr;ILjava/lang/String;)I")
    public final int method1701(int arg0, class234[] arg1, int arg2, String arg3) {
        field4181++;
        if (arg2 != -31755) {
            field4177 = null;
        }
        return this.method1698(new int[] { arg0 }, arg1, (byte) 107, arg3, class172.field2645);
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "([B)V")
    public class272(byte[] arg0) {
        class385 var2 = new class385(arg0);
        int var3 = var2.method2343(255);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method2343(255) == 1;
        this.field4167 = new byte[256];
        var2.method2356((byte) -115, this.field4167, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method2343(255);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method2343(255);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method2341((byte) 54);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method2341((byte) 54);
                    var11[var12][var16] = var15;
                }
            }
            this.field4169 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field4169[var13][var14] = (byte) class326.method2010(var11, var6, var9, this.field4167, var13, var5, 255, var14);
                        }
                    }
                }
            }
            this.field4175 = var5[32] + var6[32];
        } else {
            this.field4175 = var2.method2343(255);
        }
        var2.method2343(255);
        var2.method2343(255);
        this.field4176 = var2.method2343(255);
        this.field4172 = var2.method2343(255);
    }
}
