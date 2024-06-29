import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class17 extends class299 implements class425 {

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "Z")
    private boolean field258;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "B")
    private byte field252;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "B")
    private byte field245;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "S")
    private short field232;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "Z")
    private boolean field238;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "B")
    private byte field244;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Z")
    private boolean field260;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "Lri;")
    private class98 field254;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "Ldc;")
    private class375 field253;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "[I")
    public static int[] field233 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field230 = 0;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "[I")
    public static int[] field246 = new int[2];

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field259 = "Unable to find ";

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "Llm;")
    public static class347 field250;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "Ljava/lang/Class;")
    public static Class field261;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLii;)V")
    public final void method102(byte arg0, class405 arg1) {
        ++field251;
        if (arg0 != 76) {
            field230 = -50;
        }
        Object var3 = null;
        class98 var5;
        if (this.field254 == null && this.field260) {
            class386 var4 = this.method104(arg1, true, 131072, 45);
            var5 = var4 != null ? var4.field5595 : null;
        } else {
            var5 = this.field254;
            this.field254 = null;
        }
        if (var5 != null) {
            class161.method995(var5, this.field252, super.field4374, super.field4380, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILii;)V")
    public final void method103(int arg0, class405 arg1) {
        ++field241;
        if (arg0 <= 102) {
            field230 = -128;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lii;ZII)Lcb;")
    private final class386 method104(class405 arg0, boolean arg1, int arg2, int arg3) {
        ++field243;
        class104 var5 = class329.method2190((byte) 63, this.field232 & 65535);
        int var6 = -109 / ((arg3 - 4) / 32);
        class351 var7;
        class351 var8;
        if (this.field258) {
            var7 = class191.field2557[this.field252];
            var8 = class265.field3846[0];
        } else {
            if (this.field252 >= 3) {
                var8 = null;
            } else {
                var8 = class265.field3846[this.field252 + 1];
            }
            var7 = class265.field3846[this.field252];
        }
        return var5.method706(false, var8, super.field4380, arg1, super.field4374, arg2, this.field245, this.field244, var7, super.field4377, arg0);
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)I")
    public final int method105(int arg0) {
        if (arg0 > -4) {
            field259 = null;
        }
        ++field255;
        return this.field245;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
    public static final void method106(int arg0, int arg1) {
        class44.field624 = arg1;
        class135.field1874 = -1;
        class28.field399 = -1;
        if (arg0 == 1024) {
            ++field231;
            class62.method436((byte) -105);
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
    public static void method107(byte arg0) {
        field259 = null;
        field246 = null;
        if (arg0 < 73) {
            field247 = -108;
        }
        field233 = null;
        field250 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(ILii;I)Z")
    public static final boolean method108(int arg0, class405 arg1, int arg2) {
        ++field228;
        int var3 = (class192.field2574 + -104) / 2;
        int var4 = (class364.field5262 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; ++var6) {
            for (int var51 = var4; var51 < var4 + 104; ++var51) {
                for (int var52 = arg0; ~var52 >= -4; ++var52) {
                    if (class61.method424(var52, var51, var6, (byte) 109, arg0)) {
                        int var53 = var52;
                        if (class444.method2792(-124, var6, var51)) {
                            var53 = var52 - 1;
                        }
                        if (~var53 <= -1) {
                            var5 &= class34.method230(var51, -120, var53, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; ~var7.length < ~var8; ++var8) {
                var7[var8] = -16777216;
            }
            if (arg2 != -1) {
                field233 = null;
            }
            class253.field3497 = arg1.method1624(var7, 0, 512, 512, 512);
            class156.method968((byte) -46);
            int var9 = -16777216 | 238 + (int) (Math.random() * 20.0D) - (10 - (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) - ((int) (20.0D * Math.random()) + 228 << 16));
            int var10 = -16777216 | 238 + ((int) (Math.random() * 20.0D) - 10) << 16;
            int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
            boolean[][] var12 = new boolean[class71.field1015][class71.field1015];
            for (int var13 = var3; ~(var3 + 104) < ~var13; var13 += class71.field1015) {
                for (int var36 = var4; ~(var4 + 104) < ~var36; var36 += class71.field1015) {
                    arg1.method1767(0, 0, class71.field1015 * 4, class71.field1015 * 4);
                    arg1.method1686(-16777216);
                    for (int var37 = arg0; ~var37 >= -4; ++var37) {
                        for (int var44 = 0; class71.field1015 > var44; ++var44) {
                            for (int var50 = 0; class71.field1015 > var50; ++var50) {
                                var12[var44][var50] = class61.method424(var37, var36 + var50, var13 + var44, (byte) 98, arg0);
                            }
                        }
                        class265.field3846[var37].method747(0, 0, 1024, var13, var36, class71.field1015 + var13, var36 - -class71.field1015, var12);
                        if (!class207.field2789) {
                            for (int var45 = -4; var45 < class71.field1015; ++var45) {
                                for (int var46 = -4; ~var46 > ~class71.field1015; ++var46) {
                                    int var47 = var13 + var45;
                                    int var48 = var36 - -var46;
                                    if (~var3 >= ~var47 && var48 >= var4 && class61.method424(var37, var48, var47, (byte) 108, arg0)) {
                                        int var49 = var37;
                                        if (class444.method2792(-121, var47, var48)) {
                                            var49 = var37 - 1;
                                        }
                                        if (var49 >= 0) {
                                            class40.method289(var49, var9, var47, var45 * 4, var10, arg1, 3, var48, (class71.field1015 - var46) * 4 + -4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class207.field2789) {
                        class270 var38 = class365.field5294[arg0];
                        for (int var39 = 0; ~var39 > ~class71.field1015; ++var39) {
                            for (int var40 = 0; ~class71.field1015 < ~var40; ++var40) {
                                int var41 = var13 + var39;
                                int var42 = var36 - -var40;
                                int var43 = var38.field3914[var41 - var38.field3908][-var38.field3915 + var42];
                                if ((var43 & 1076101120) == 0) {
                                    if ((var43 & 8388608) == 0) {
                                        if (~(33554432 & var43) != -1) {
                                            arg1.method2615(-1713569622, 4, (-var40 + class71.field1015) * 4 + -4, var39 * 4 + 3, -118);
                                        } else if ((var43 & 134217728) != 0) {
                                            arg1.method2612(var39 * 4, -1713569622, (class71.field1015 - var40) * 4 - 1, 1, 4);
                                        } else if ((536870912 & var43) != 0) {
                                            arg1.method2615(-1713569622, 4, (class71.field1015 - var40) * 4 - 4, var39 * 4, 62);
                                        }
                                    } else {
                                        arg1.method2612(var39 * 4, -1713569622, (-var40 + class71.field1015) * 4 - 4, 1, 4);
                                    }
                                } else {
                                    arg1.method2610(4, -1713569622, true, 4, var39 * 4, (class71.field1015 - var40) * 4 + -4);
                                }
                            }
                        }
                    }
                    arg1.method1632(0, 0, class71.field1015 * 4, class71.field1015 * 4, var11, 2);
                    class253.field3497.method405((var13 - var3) * 4 + 48, 464 - (-var4 + var36) * 4 - class71.field1015 * 4, class71.field1015 * 4, class71.field1015 * 4, 0, 0);
                }
            }
            arg1.method1652();
            arg1.method1686(-16777215);
            class145.method927(0);
            class267.field3854 = 0;
            class164.field2210.method335((byte) -125);
            if (!class207.field2789) {
                for (int var14 = var3; ~(var3 + 104) < ~var14; ++var14) {
                    for (int var20 = var4; ~(var4 - -104) < ~var20; ++var20) {
                        for (int var21 = arg0; var21 <= arg0 + 1 && var21 <= 3; ++var21) {
                            if (class61.method424(var21, var20, var14, (byte) 107, arg0)) {
                                class425 var22 = (class425) class130.method823(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class425) class243.method1460(var21, var14, var20, field261 != null ? field261 : (field261 = method122("jb")));
                                }
                                if (var22 == null) {
                                    var22 = (class425) class40.method292(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class425) class376.method2434(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class104 var23 = class329.method2190((byte) 63, var22.method121(-15123));
                                    if (!var23.field1437 || class390.field5614) {
                                        int var24 = var23.field1504;
                                        if (var23.field1518 != null) {
                                            for (int var25 = 0; var23.field1518.length > var25; ++var25) {
                                                if (var23.field1518[var25] != -1) {
                                                    class104 var26 = class329.method2190((byte) 63, var23.field1518[var25]);
                                                    if (~var26.field1504 <= -1) {
                                                        var24 = var26.field1504;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class7 var28 = class99.method674(36, var24);
                                                if (var28 != null && var28.field125) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class365.field5294[var21].field3914;
                                                int var32 = class365.field5294[var21].field3908;
                                                int var33 = class365.field5294[var21].field3915;
                                                for (int var34 = 0; var34 < 10; ++var34) {
                                                    int var35 = (int) (4.0D * Math.random());
                                                    if (var35 == 0 && ~var3 > ~var29 && ~(var14 + -3) > ~var29 && (var31[var29 - 1 - var32][-var33 + var30] & 2883848) == 0) {
                                                        --var29;
                                                    }
                                                    if (var35 == 1 && var29 < var3 - -104 - 1 && ~var29 > ~(var14 + 3) && (var31[var29 + 1 + -var32][-var33 + var30] & 2883968) == 0) {
                                                        ++var29;
                                                    }
                                                    if (~var35 == -3 && var30 > var4 && ~var30 < ~(var20 - 3) && ~(2883842 & var31[-var32 + var29][-var33 + var30 + -1]) == -1) {
                                                        --var30;
                                                    }
                                                    if (var35 == 3 && var4 + -1 + 104 > var30 && var30 < var20 + 3 && (2883872 & var31[-var32 + var29][var30 + 1 + -var33]) == 0) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class11.field170[class267.field3854] = var23.field1507;
                                            class156.field2124[class267.field3854] = var29;
                                            class241.field3219[class267.field3854] = var30;
                                            ++class267.field3854;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class181.field2398 != null) {
                    class130.field1798.field5018 = 1;
                    class375.method2427(64, ~arg2, 1024);
                    for (int var15 = 0; class181.field2398.field860 > var15; ++var15) {
                        int var16 = class181.field2398.field864[var15];
                        if (var16 >> 28 == class227.field2981) {
                            int var17 = ((268429527 & var16) >> 14) + -class7.field138;
                            int var18 = (16383 & var16) + -class200.field2660;
                            if (~var17 <= -1 && ~var17 > ~class192.field2574 && var18 >= 0 && class364.field5262 > var18) {
                                class164.field2210.method330(new class279(var15), arg2 ^ 2130841183);
                            } else {
                                class7 var19 = class99.method674(arg2 ^ -37, class181.field2398.field863[var15]);
                                if (var19.field130 != null && ~(var19.field114 + var17) <= -1 && var19.field111 + var17 < class192.field2574 && ~(var18 - -var19.field122) <= -1 && var19.field117 + var18 < class364.field5262) {
                                    class164.field2210.method330(new class279(var15), -2130841184);
                                }
                            }
                        }
                    }
                    class375.method2427(64, 0, 128);
                    class130.field1798.field5018 = 2;
                    class130.field1798.method2274((byte) -100);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[BI)I")
    public static final int method109(byte arg0, byte[] arg1, int arg2) {
        if (arg0 >= -91) {
            field230 = 126;
        }
        ++field229;
        return class5.method33(arg2, arg1, 0, (byte) -113);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lii;Lge;IIIIZIIIII)V")
    public class17(class405 arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class103.method690((byte) -125, arg10, arg11));
        super.field4374 = (short) arg3;
        this.field258 = arg6;
        this.field252 = (byte) arg2;
        this.field245 = (byte) arg10;
        super.field4380 = (short) arg5;
        this.field232 = (short) arg1.field1507;
        this.field238 = arg1.field1455 != 0 && !arg6;
        this.field244 = (byte) arg11;
        this.field260 = arg0.method1740() && arg1.field1464 && !this.field258 && class423.field6238 != 0;
        class386 var13 = this.method104(arg0, this.field260, 1024, -49);
        if (var13 != null) {
            this.field254 = var13.field5595;
            this.field253 = var13.field5592;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)I")
    public final int method110(int arg0) {
        ++field239;
        if (arg0 != 0) {
            field233 = null;
        }
        return this.field253 != null ? this.field253.method1597() : 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILii;I)Ldc;")
    public final class375 method111(int arg0, class405 arg1, int arg2) {
        ++field256;
        if (arg2 <= 27) {
            this.method102((byte) -10, (class405) null);
        }
        return this.method115(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        if (this.field253 != null) {
            this.field253.method1598();
        }
        ++field235;
        if (arg0 > -108) {
            this.method102((byte) -17, (class405) null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lii;)V")
    public static final void method113(class405 arg0) {
        for (int var1 = class68.field875; var1 < class180.field2380; ++var1) {
            for (int var2 = 0; var2 < class104.field1436; ++var2) {
                for (int var3 = 0; var3 < class214.field2858; ++var3) {
                    class254 var4 = class213.field2852[var1][var2][var3];
                    if (var4 != null) {
                        class97 var5 = var4.field3510;
                        class97 var6 = var4.field3512;
                        if (var5 != null && var5.method166(-17506)) {
                            class129.method816(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method166(-17506)) {
                                class129.method816(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method169(arg0, 0, 0, -113, 0, var5, false);
                                var6.method176(false);
                            }
                            var5.method176(false);
                        }
                        for (class328 var7 = var4.field3515; var7 != null; var7 = var7.field4783) {
                            class55 var9 = var7.field4785;
                            if (var9 != null && var9.method166(-17506)) {
                                class129.method816(arg0, var9, var1, var2, var3, var9.field742 - var9.field743 + 1, var9.field737 - var9.field726 + 1);
                                var9.method176(false);
                            }
                        }
                        class147 var8 = var4.field3527;
                        if (var8 != null && var8.method166(-17506)) {
                            class98.method667(arg0, var8, var1, var2, var3);
                            var8.method176(false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Z")
    public final boolean method114(int arg0) {
        if (arg0 != 30582) {
            this.method119(21, 113, false, (class405) null);
        }
        ++field257;
        return this.field260;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILii;Z)Ldc;")
    private final class375 method115(int arg0, class405 arg1, boolean arg2) {
        ++field248;
        if (this.field253 != null && arg1.method1643(this.field253.method1608(), arg0) == 0) {
            return this.field253;
        } else {
            class386 var4 = this.method104(arg1, false, arg0, 97);
            if (!arg2) {
                return null;
            } else {
                return var4 != null ? var4.field5592 : null;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field242;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -60 % ((-43 - arg3) / 50);
        class207.method1221((byte) -122, -arg4 + arg1, arg1 + arg4, class384.field5560[arg0], arg2);
        int var9 = -1;
        while (var6 > var5) {
            var9 += 2;
            ++var5;
            var7 += var9;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var10 = class384.field5560[arg0 - -var6];
                int[] var11 = class384.field5560[-var6 + arg0];
                int var12 = arg1 + var5;
                int var13 = arg1 - var5;
                class207.method1221((byte) -128, var13, var12, var10, arg2);
                class207.method1221((byte) -126, var13, var12, var11, arg2);
            }
            int var14 = arg1 + var6;
            int var15 = -var6 + arg1;
            int[] var16 = class384.field5560[arg0 - -var5];
            int[] var17 = class384.field5560[-var5 + arg0];
            class207.method1221((byte) -123, var15, var14, var16, arg2);
            class207.method1221((byte) -126, var15, var14, var17, arg2);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lii;I)Leb;")
    public final class382 method117(class405 arg0, int arg1) {
        ++field237;
        if (this.field253 == null) {
            return null;
        } else {
            if (arg1 != -1) {
                method109((byte) 27, (byte[]) null, -79);
            }
            class177 var3 = arg0.method1735();
            var3.method985(super.field4383 + super.field4374, super.field4377, super.field4381 + super.field4380);
            class382 var4 = null;
            if (this.field238) {
                var4 = class397.method2554(1, 0);
            }
            this.field253.method1601(var3, var4 == null ? null : var4.field5543[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lii;I)V")
    public final void method118(class405 arg0, int arg1) {
        ++field249;
        Object var3 = null;
        class98 var5;
        if (this.field254 == null && this.field260) {
            class386 var4 = this.method104(arg0, true, 131072, -116);
            var5 = var4 == null ? null : var4.field5595;
        } else {
            var5 = this.field254;
            this.field254 = null;
        }
        if (arg1 != 22295) {
            this.field245 = 22;
        }
        if (var5 != null) {
            class142.method903(var5, this.field252, super.field4374, super.field4380, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZLii;)Z")
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field234;
        class375 var5 = this.method115(65536, arg3, true);
        if (arg2) {
            this.method121(-27);
        }
        if (var5 != null) {
            class177 var6 = arg3.method1735();
            var6.method985(super.field4374, super.field4377, super.field4380);
            return var5.method1594(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)I")
    public final int method120(int arg0) {
        ++field240;
        if (arg0 != 25940) {
            method116(68, 64, -80, -100, 126);
        }
        return this.field244;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
    public final int method121(int arg0) {
        ++field236;
        return arg0 != -15123 ? 15 : 65535 & this.field232;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method122(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
