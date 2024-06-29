import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class89 extends class51 {

    @OriginalMember(owner = "client!na", name = "Tb", descriptor = "Z")
    public static boolean field2220 = false;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Lmb;")
    public static class84 field2217 = class79.method672(true, "Stufe)2");

    @OriginalMember(owner = "client!na", name = "Wb", descriptor = "[S")
    public static short[] field2223 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!na", name = "Sb", descriptor = "Lmb;")
    public static class84 field2219 = class79.method672(true, "Freunde)2Server)3)3)3");

    @OriginalMember(owner = "client!na", name = "hc", descriptor = "Lmb;")
    private static class84 field2234 = class79.method672(true, "Login");

    @OriginalMember(owner = "client!na", name = "dc", descriptor = "Lmb;")
    private static class84 field2230 = class79.method672(true, "Enter name:");

    @OriginalMember(owner = "client!na", name = "Vb", descriptor = "Lmb;")
    public static class84 field2222 = field2234;

    @OriginalMember(owner = "client!na", name = "bc", descriptor = "Lmb;")
    public static class84 field2228 = field2230;

    @OriginalMember(owner = "client!na", name = "gc", descriptor = "I")
    public static int field2233 = -1;

    @OriginalMember(owner = "client!na", name = "mc", descriptor = "Lsa;")
    public static class119 field2239 = new class119(20);

    @OriginalMember(owner = "client!na", name = "Rb", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!na", name = "Ub", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!na", name = "Xb", descriptor = "I")
    private int field2224;

    @OriginalMember(owner = "client!na", name = "Yb", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!na", name = "Zb", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!na", name = "ac", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!na", name = "cc", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!na", name = "fc", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!na", name = "ic", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!na", name = "jc", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!na", name = "lc", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!na", name = "nc", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!na", name = "ec", descriptor = "Lid;")
    private class60 field2231;

    @OriginalMember(owner = "client!na", name = "kc", descriptor = "[Lr;")
    public static class112[] field2237;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "(II)I")
    public final int method759(int arg0, int arg1) {
        ++field2229;
        int var3 = -(7 & this.field2224) + 8;
        int var4 = this.field2224 >> 3;
        this.field2224 += arg1;
        if (arg0 != 26024) {
            method760(-128, 102, -28);
        }
        int var5 = 0;
        while (arg1 > var3) {
            var5 += (class138.field3324[var3] & super.field1084[var4++]) << -var3 + arg1;
            arg1 -= var3;
            var3 = 8;
        }
        int var6;
        if (~arg1 != ~var3) {
            var6 = (super.field1084[var4] >> var3 - arg1 & class138.field3324[arg1]) + var5;
        } else {
            var6 = (super.field1084[var4] & class138.field3324[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)Z")
    public static final boolean method760(int arg0, int arg1, int arg2) {
        ++field2235;
        class36 var3 = class77.method661(arg1, -121);
        int var4 = -31 / ((-71 - arg2) / 46);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && ~arg0 >= -9) {
            arg0 = 4;
        }
        return var3.method271((byte) -57, arg0);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
    public class89(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!na", name = "v", descriptor = "(I)I")
    public final int method761(int arg0) {
        if (arg0 != 7595) {
            field2234 = null;
        }
        ++field2225;
        return super.field1084[super.field1128++] + -this.field2231.method523(true) & 255;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(IB)I")
    public final int method762(int arg0, byte arg1) {
        ++field2236;
        if (arg1 != 99) {
            this.method767(48);
        }
        return arg0 * 8 - this.field2224;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B[I)V")
    public final void method763(byte arg0, int[] arg1) {
        ++field2232;
        this.field2231 = new class60(arg1);
        if (arg0 != 32) {
            field2219 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
    public static final void method764(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -7642) {
            field2233 = 41;
        }
        ++field2240;
        if (class49.field1051 != 0 && arg2 != 0 && class122.field2934 < 50) {
            class50.field1069[class122.field2934] = arg1;
            class52.field1182[class122.field2934] = arg2;
            class39.field888[class122.field2934] = arg0;
            class111.field2676[class122.field2934] = null;
            class1.field6[class122.field2934] = 0;
            ++class122.field2934;
        }
    }

    @OriginalMember(owner = "client!na", name = "w", descriptor = "(I)V")
    public final void method765(int arg0) {
        ++field2238;
        this.field2224 = super.field1128 * arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([Lia;IBIIIIIII)V")
    public static final void method766(class57[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2218;
        if (arg2 < -32) {
            for (int var10 = 0; ~arg0.length < ~var10; ++var10) {
                class57 var11 = arg0[var10];
                if (var11 != null && (var11.field1385 == 0 || var11.field1439) && var11 != null && ~var11.field1443 == ~arg3 && !class75.method647((byte) 97, var11)) {
                    int var12 = var11.field1348 + arg1 + -arg5;
                    int var13 = var11.field1433 + arg6 + -arg9;
                    int var14 = ~arg1 <= ~var12 ? arg1 : var12;
                    int var15 = var11.field1332 + var13;
                    int var16 = var11.field1365 + var12;
                    int var17 = arg6 >= var13 ? arg6 : var13;
                    int var18 = ~arg8 >= ~var16 ? arg8 : var16;
                    int var19 = ~var15 <= ~arg4 ? arg4 : var15;
                    if (var11.field1385 == 0) {
                        method766(arg0, var14, (byte) -93, var11.field1369, var19, -var12 + var14 + var11.field1380, var17, arg7, var18, -var13 + var17 + var11.field1334);
                        if (var11.field1410 != null) {
                            method766(var11.field1410, var14, (byte) -58, var11.field1369, var19, -var12 + var11.field1380 + var14, var17, arg7, var18, var17 - var13 + var11.field1334);
                        }
                    }
                    if (var11.field1439) {
                        boolean var20;
                        if (~class20.field427 <= ~var14 && ~var17 >= ~class60.field1498 && ~class20.field427 > ~var18 && class60.field1498 < var19) {
                            var20 = true;
                        } else {
                            var20 = false;
                        }
                        boolean var21 = false;
                        if (class129.field3109 == 1 && var20) {
                            var21 = true;
                        }
                        boolean var22 = false;
                        if (~class37.field831 == -2 && ~var14 >= ~class83.field2034 && ~class47.field1035 <= ~var17 && var18 > class83.field2034 && ~var19 < ~class47.field1035) {
                            var22 = true;
                        }
                        if (var22 && class125.field3019 == null && ~(arg7 & 512) != -1 && !class2.field42 && class96.method802(1000, var11) != null) {
                            class125.field3019 = var11;
                            class120.field2893 = class20.field427;
                            class83.field2045 = false;
                            class52.field1158 = 0;
                            class54.field1241 = class60.field1498;
                        }
                        if (class125.field3019 != null || class2.field42) {
                            var22 = false;
                            var21 = false;
                            var20 = false;
                        }
                        if (!var11.field1358 && var22 && (arg7 & 1) != 0) {
                            var11.field1358 = true;
                            if (var11.field1376 != null) {
                                class43.method320(0, (class57) null, -var13 + class47.field1035, var11.field1376, true, -var12 + class83.field2034, var11);
                            }
                        }
                        if (var11.field1358 && var21 && ~(4 & arg7) != -1 && var11.field1428 != null) {
                            class43.method320(0, (class57) null, class60.field1498 - var13, var11.field1428, true, -var12 + class20.field427, var11);
                        }
                        if (var11.field1358 && !var21 && ~(arg7 & 2) != -1) {
                            var11.field1358 = false;
                            if (var11.field1324 != null) {
                                class43.method320(0, (class57) null, -var13 + class60.field1498, var11.field1324, true, -var12 + class20.field427, var11);
                            }
                        }
                        if (var21 && (8 & arg7) != 0 && var11.field1373 != null) {
                            class43.method320(0, (class57) null, -var13 + class60.field1498, var11.field1373, true, class20.field427 - var12, var11);
                        }
                        if (!var11.field1393 && var20 && ~(16 & arg7) != -1) {
                            var11.field1393 = true;
                            if (var11.field1388 != null) {
                                class43.method320(0, (class57) null, -var13 + class60.field1498, var11.field1388, true, class20.field427 - var12, var11);
                            }
                        }
                        if (var11.field1393 && var20 && (64 & arg7) != 0 && var11.field1372 != null) {
                            class43.method320(0, (class57) null, class60.field1498 - var13, var11.field1372, true, class20.field427 - var12, var11);
                        }
                        if (var11.field1393 && !var20 && (32 & arg7) != 0) {
                            var11.field1393 = false;
                            if (var11.field1326 != null) {
                                class43.method320(0, (class57) null, -var13 + class60.field1498, var11.field1326, true, -var12 + class20.field427, var11);
                            }
                        }
                        if (var11.field1367 != null && (arg7 & 128) != 0) {
                            class43.method320(0, (class57) null, 0, var11.field1367, true, 0, var11);
                        }
                        if (var20 && class37.field832 != 0 && var11.field1379 != null && (1024 & arg7) != 0) {
                            class43.method320(0, (class57) null, class37.field832, var11.field1379, true, 0, var11);
                        }
                        if ((256 & arg7) != 0) {
                            if (class129.field3102 > var11.field1343 && var11.field1351 != null) {
                                class43.method320(0, (class57) null, 0, var11.field1351, true, 0, var11);
                            }
                            if (var11.field1343 < class94.field2330 && var11.field1346 != null) {
                                class43.method320(0, (class57) null, 0, var11.field1346, true, 0, var11);
                            }
                            if (~class74.field1815 < ~var11.field1343 && var11.field1341 != null) {
                                class43.method320(0, (class57) null, 0, var11.field1341, true, 0, var11);
                            }
                            var11.field1343 = class5.field100;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "x", descriptor = "(I)V")
    public final void method767(int arg0) {
        ++field2227;
        super.field1128 = (this.field2224 + arg0) / 8;
    }

    @OriginalMember(owner = "client!na", name = "k", descriptor = "(B)V")
    public static void method768(byte arg0) {
        field2230 = null;
        if (arg0 <= 1) {
            method768((byte) -58);
        }
        field2219 = null;
        field2234 = null;
        field2222 = null;
        field2228 = null;
        field2223 = null;
        field2217 = null;
        field2239 = null;
        field2237 = null;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(BI)V")
    public final void method769(byte arg0, int arg1) {
        int var3 = 64 / ((-53 - arg0) / 36);
        ++field2221;
        super.field1084[super.field1128++] = (byte) (this.field2231.method523(true) + arg1);
    }
}
