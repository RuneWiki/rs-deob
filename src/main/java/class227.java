import java.awt.Frame;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class227 extends class436 {

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    private int field3037 = 0;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    private int field3041 = 0;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    private int field3045 = 0;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    private int field3030;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    private int field3033;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    private int field3036;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Ljava/awt/Frame;")
    public static Frame field3044;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 == 34) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field3041 = (arg2.method2418(-21337) << 12) / 100;
                    }
                } else {
                    this.field3037 = (arg2.method2418(-21337) << 12) / 100;
                }
            } else {
                this.field3045 = arg2.method2378(-1);
            }
            ++field3029;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBI)V")
    private final void method1435(int arg0, int arg1, byte arg2, int arg3) {
        ++field3032;
        if (arg2 >= -127) {
            field3031 = 47;
        }
        int var5 = arg3 <= 2048 ? (arg1 + 4096) * arg3 >> 12 : arg3 - -arg1 + -(arg1 * arg3 >> 12);
        if (~var5 >= -1) {
            this.field3038 = this.field3039 = this.field3028 = arg3;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg3 + arg3 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field3039 = var7;
                                    this.field3038 = var5;
                                    this.field3028 = var15;
                                }
                            } else {
                                this.field3028 = var5;
                                this.field3039 = var7;
                                this.field3038 = var14;
                            }
                        } else {
                            this.field3028 = var5;
                            this.field3039 = var15;
                            this.field3038 = var7;
                        }
                    } else {
                        this.field3039 = var5;
                        this.field3028 = var14;
                        this.field3038 = var7;
                    }
                } else {
                    this.field3039 = var5;
                    this.field3038 = var15;
                    this.field3028 = var7;
                }
            } else {
                this.field3028 = var7;
                this.field3038 = var5;
                this.field3039 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)I")
    public static final int method1436(byte arg0) {
        ++field3034;
        try {
            if (class194.field2697 == 0) {
                if (-5000L + class224.method1425(-26805) < class236.field3218) {
                    return 0;
                }
                class413.field6002 = class204.field2772.method2239(class61.field932, class34.field530, 0);
                class424.field6097 = class224.method1425(-26805);
                class194.field2697 = 1;
            }
            if (class424.field6097 + 30000L < class224.method1425(arg0 + -26838)) {
                return class232.method1455(-1, 1000);
            } else if (arg0 != 33) {
                return -71;
            } else {
                if (class194.field2697 == 1) {
                    if (~class413.field6002.field4068 == -3) {
                        return class232.method1455(-1, 1001);
                    }
                    if (~class413.field6002.field4068 != -2) {
                        return -1;
                    }
                    class199.field2749 = new class258((Socket) class413.field6002.field4070, class204.field2772);
                    class413.field6002 = null;
                    int var1 = 0;
                    if (class196.field2722) {
                        var1 = class28.field442;
                    }
                    class442.field6400.field5273 = 0;
                    class442.field6400.method2396(23, 12450);
                    class442.field6400.method2386(var1, 19324);
                    class199.field2749.method1579(0, arg0 + 4967, class442.field6400.field5258, class442.field6400.field5273);
                    if (class326.field4451 != null) {
                        class326.field4451.method1475(923);
                    }
                    if (class64.field993 != null) {
                        class64.field993.method1475(arg0 ^ 954);
                    }
                    int var2 = class199.field2749.method1591(arg0 ^ 33);
                    if (class326.field4451 != null) {
                        class326.field4451.method1475(923);
                    }
                    if (class64.field993 != null) {
                        class64.field993.method1475(923);
                    }
                    if (~var2 != -1) {
                        return class232.method1455(-1, var2);
                    }
                    class194.field2697 = 2;
                }
                if (~class194.field2697 == -3) {
                    if (class199.field2749.method1580(1031) < 2) {
                        return -1;
                    }
                    class383.field5582 = class199.field2749.method1591(arg0 + -33);
                    class383.field5582 <<= 8;
                    class383.field5582 += class199.field2749.method1591(arg0 + -33);
                    class6.field89 = new byte[class383.field5582];
                    class194.field2697 = 3;
                    class209.field2823 = 0;
                }
                if (class194.field2697 == 3) {
                    int var3 = class199.field2749.method1580(1031);
                    if (~var3 > -2) {
                        return -1;
                    } else {
                        if (~(-class209.field2823 + class383.field5582) > ~var3) {
                            var3 = class383.field5582 - class209.field2823;
                        }
                        class199.field2749.method1584(var3, class6.field89, 101, class209.field2823);
                        class209.field2823 += var3;
                        if (~class383.field5582 < ~class209.field2823) {
                            return -1;
                        } else if (!class279.method1702((byte) -99, class6.field89)) {
                            return class232.method1455(-1, 1002);
                        } else {
                            class126.field1775 = new class31[class184.field2578];
                            int var4 = 0;
                            for (int var5 = class36.field549; var5 <= class244.field3376; ++var5) {
                                class31 var6 = class430.method2708(var5, 1);
                                if (var6 != null) {
                                    class126.field1775[var4++] = var6;
                                }
                            }
                            class281.field3848 = null;
                            class189.field2624 = 0;
                            class199.field2749.method1593(3);
                            class41.field616 = 0;
                            class199.field2749 = null;
                            class6.field89 = null;
                            class194.field2697 = 0;
                            class236.field3218 = class224.method1425(-26805);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class232.method1455(-1, 1003);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Laa;II[Lie;IIIIZ[BII)[I")
    public static final int[] method1437(class281 arg0, int arg1, int arg2, class4[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte[] arg9, int arg10, int arg11) {
        ++field3040;
        int var12 = (7 & arg11) * 8;
        int var13 = (7 & arg5) * 8;
        if (!arg8) {
            class4 var14 = arg3[arg2];
            for (int var15 = 0; var15 < 8; ++var15) {
                for (int var16 = 0; ~var16 > -9; ++var16) {
                    int var17 = arg7 + class231.method1454(arg4, 3, var16 & 7, 7 & var15);
                    int var18 = arg1 - -class250.method1554(var16 & 7, arg4, 7, 7 & var15);
                    if (~var17 < -1 && var17 < class432.field6220 + -1 && ~var18 < -1 && ~var18 > ~(class267.field3646 + -1)) {
                        var14.method21(var18, var17, (byte) -118);
                    }
                }
            }
        }
        byte var19;
        if (!arg8) {
            var19 = 4;
        } else {
            var19 = 1;
        }
        class371 var20 = new class371(arg9);
        int var21 = (-8 & arg11) << 3;
        int var22 = (arg5 & -8) << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (~arg4 == -2) {
            var24 = 1;
        } else if (arg4 != 2) {
            if (~arg4 == -4) {
                var23 = 1;
            }
        } else {
            var23 = 1;
            var24 = 1;
        }
        if (arg10 > -19) {
            field3044 = null;
        }
        for (int var25 = 0; var19 > var25; ++var25) {
            for (int var58 = 0; ~var58 > -65; ++var58) {
                for (int var59 = 0; var59 < 64; ++var59) {
                    if (~arg6 == ~var25 && var58 >= var12 && var12 + 8 >= var58 && var59 >= var13 && var13 + 8 >= var59) {
                        if (var12 + 8 != var58 && var13 + 8 != var59) {
                            int var60 = class231.method1454(arg4, 3, var59 & 7, var58 & 7) + arg7;
                            int var61 = arg1 + class250.method1554(7 & var59, arg4, 7, var58 & 7);
                            class359.method2319(arg8, var60, var24, -1, false, arg4, var20, arg2, var22 + var59, var61, var21 + var58, var23);
                            if (var58 == 63 || var59 == 63) {
                                int var62 = var58 == 63 ? 64 : var58;
                                int var63 = var59 != 63 ? var59 : 64;
                                int var64;
                                int var65;
                                if (~arg4 != -1) {
                                    if (~arg4 == -2) {
                                        var64 = arg7 + var63 + -var13;
                                        var65 = -var62 + var12 + arg1 + 8;
                                    } else if (~arg4 == -3) {
                                        var65 = arg1 + 8 - (-var13 + var63);
                                        var64 = arg7 + 8 + var12 + -var62;
                                    } else {
                                        var65 = arg1 - var12 - -var62;
                                        var64 = arg7 + 8 - var63 + var13;
                                    }
                                } else {
                                    var64 = -var12 + arg7 + var62;
                                    var65 = var63 - var13 + arg1;
                                }
                                if (var64 >= 0 && ~class432.field6220 < ~var64 && ~var65 <= -1 && ~var65 > ~class267.field3646) {
                                    class418.field6051[arg2][var64][var65] = class418.field6051[arg2][var23 + var60][var24 + var61];
                                }
                            }
                        } else {
                            int var66;
                            int var67;
                            if (~arg4 == -1) {
                                var66 = -var12 + var58 + arg7;
                                var67 = arg1 + var59 + -var13;
                            } else if (arg4 != 1) {
                                if (arg4 == 2) {
                                    var67 = -var59 + 8 + arg1 + var13;
                                    var66 = -var58 - -var12 + arg7 + 8;
                                } else {
                                    var66 = -var59 + arg7 + var13 + 8;
                                    var67 = arg1 - -var58 - var12;
                                }
                            } else {
                                var67 = arg1 - -8 + -var58 + var12;
                                var66 = -var13 + var59 + arg7;
                            }
                            class359.method2319(arg8, var66, 0, -1, true, 0, var20, arg2, var22 + var59, var67, var21 + var58, 0);
                        }
                    } else {
                        class359.method2319(arg8, -1, 0, -1, false, 0, var20, 0, 0, -1, 0, 0);
                    }
                }
            }
        }
        boolean var26 = false;
        boolean var27 = false;
        while (var20.field5258.length > var20.field5273) {
            int var28 = var20.method2429(0);
            if (~var28 == -129) {
                class289.field4000[0] = var20.method2403((byte) 98);
                class289.field4000[1] = var20.method2378(-1);
                class289.field4000[2] = var20.method2378(-1);
                class289.field4000[3] = var20.method2378(-1);
                class289.field4000[4] = var20.method2403((byte) 72);
                var26 = true;
            } else {
                if (var28 != 129) {
                    --var20.field5273;
                    break;
                }
                if (class446.field6435 == null) {
                    class446.field6435 = new byte[4][][];
                }
                for (int var45 = 0; ~var45 > -5; ++var45) {
                    byte var46 = var20.method2418(-21337);
                    if (~var46 == -1 && class446.field6435[arg2] != null) {
                        if (arg6 >= var45) {
                            int var47 = arg7;
                            int var48 = arg7 + 7;
                            int var49 = arg1;
                            if (arg7 >= 0) {
                                if (~arg7 <= ~class432.field6220) {
                                    var47 = class432.field6220;
                                }
                            } else {
                                var47 = 0;
                            }
                            if (arg1 < 0) {
                                var49 = 0;
                            } else if (arg1 >= class267.field3646) {
                                var49 = class267.field3646;
                            }
                            if (~var48 <= -1) {
                                if (~class432.field6220 >= ~var48) {
                                    var48 = class432.field6220;
                                }
                            } else {
                                var48 = 0;
                            }
                            int var50 = arg1 + 7;
                            if (~var50 > -1) {
                                var50 = 0;
                            } else if (var50 >= class267.field3646) {
                                var50 = class267.field3646;
                            }
                            while (~var48 < ~var47) {
                                while (var49 < var50) {
                                    class446.field6435[arg2][var47][var49] = 0;
                                    ++var49;
                                }
                                ++var47;
                            }
                        }
                    } else if (~var46 == -2) {
                        if (class446.field6435[arg2] == null) {
                            class446.field6435[arg2] = new byte[class432.field6220 + 1][class267.field3646 - -1];
                        }
                        for (int var51 = 0; ~var51 > -65; var51 += 4) {
                            for (int var52 = 0; ~var52 > -65; var52 += 4) {
                                byte var53 = var20.method2418(-21337);
                                if (~arg6 <= ~var45) {
                                    for (int var54 = var51; var51 + 4 > var54; ++var54) {
                                        for (int var55 = var52; var52 + 4 > var55; ++var55) {
                                            if (~var12 >= ~var54 && var54 < var12 - -8 && ~var55 <= ~var13 && ~(var13 + 8) < ~var13) {
                                                int var56 = arg7 + class231.method1454(arg4, 3, var55 & 7, var54 & 7);
                                                int var57 = arg1 - -class250.method1554(var55 & 7, arg4, 7, 7 & var54);
                                                if (var56 >= 0 && var56 < class432.field6220 && ~var57 <= -1 && ~var57 > ~class267.field3646) {
                                                    class446.field6435[arg2][var56][var57] = var53;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg8) {
            class44 var29 = null;
            while (true) {
                while (var20.field5273 < var20.field5258.length) {
                    int var30 = var20.method2429(0);
                    if (var30 == 0) {
                        var29 = new class44(var20);
                    } else if (~var30 != -2) {
                        if (~var30 != -3) {
                            throw new IllegalStateException();
                        }
                        if (var29 == null) {
                            var29 = new class44();
                        }
                        var29.method316(var20, 8);
                    } else {
                        int var31 = var20.method2429(0);
                        if (var31 > 0) {
                            for (int var32 = 0; var31 > var32; ++var32) {
                                class347 var33 = new class347(var20);
                                if (var33.field4867 == 31) {
                                    class311 var34 = class22.method147(var20.method2403((byte) 118), 2);
                                    var33.method2226(var34.field4255, var34.field4257, (byte) 17, var34.field4253, var34.field4252);
                                }
                                int var35 = var33.field1583 >> 7;
                                int var36 = var33.field1591 >> 7;
                                if (~var33.field4857 == ~arg6 && ~var35 <= ~var12 && var12 - -8 > var35 && var36 >= var13 && var36 < var13 + 8) {
                                    int var37 = (arg7 << 7) - -class318.method2024(arg4, -127, var33.field1583 & 1023, 1023 & var33.field1591);
                                    int var38 = (arg1 << 7) + class339.method2178(1023 & var33.field1583, var33.field1591 & 1023, arg4, 15);
                                    var33.field1591 = var38;
                                    var33.field1583 = var37;
                                    int var39 = var33.field1591 >> 7;
                                    int var40 = var33.field1583 >> 7;
                                    if (~var40 <= -1 && var39 >= 0 && var40 < class432.field6220 && ~var39 > ~class267.field3646) {
                                        var33.field1588 = class418.field6051[arg6][var40][var39] + -var33.field1588;
                                        if (~arg0.method1797() < -1) {
                                            class24.method162(var33);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var29 != null) {
                    class374.method2441(arg1 >> 3, var29, 32712, arg7 >> 3);
                }
                break;
            }
        }
        if (!var27 && class446.field6435 != null && class446.field6435[arg2] != null) {
            int var41 = arg7 - -7;
            int var42 = arg1 - -7;
            for (int var43 = arg7; var41 > var43; ++var43) {
                for (int var44 = arg1; ~var42 < ~var44; ++var44) {
                    class446.field6435[arg2][var43][var44] = 0;
                }
            }
        }
        if (var26) {
            return class289.field4000;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[[I")
    public final int[][] method85(int arg0, int arg1) {
        ++field3043;
        if (arg0 != -13348) {
            this.method85(37, 54);
        }
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[][] var4 = this.method2731(arg1, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class43.field653 > var11; ++var11) {
                this.method1439(var6[var11], true, var7[var11], var5[var11]);
                this.field3030 += this.field3037;
                this.field3033 += this.field3041;
                for (this.field3036 += this.field3045; ~this.field3036 > -1; this.field3036 += 4096) {
                }
                while (this.field3036 > 4096) {
                    this.field3036 -= 4096;
                }
                if (this.field3030 < 0) {
                    this.field3030 = 0;
                }
                if (this.field3033 < 0) {
                    this.field3033 = 0;
                }
                if (~this.field3030 < -4097) {
                    this.field3030 = 4096;
                }
                if (~this.field3033 < -4097) {
                    this.field3033 = 4096;
                }
                this.method1435(this.field3036, this.field3030, (byte) -128, this.field3033);
                var8[var11] = this.field3038;
                var9[var11] = this.field3039;
                var10[var11] = this.field3028;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public static void method1438(int arg0) {
        if (arg0 != 29805) {
            method1438(-105);
        }
        field3044 = null;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZII)V")
    private final void method1439(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3042;
        if (!arg1) {
            this.field3028 = 58;
        }
        int var5 = arg0 < arg3 ? arg3 : arg0;
        int var6 = ~arg3 > ~arg0 ? arg3 : arg0;
        int var7 = ~arg2 >= ~var5 ? var5 : arg2;
        int var8 = var6 <= arg2 ? var6 : arg2;
        this.field3033 = (var7 + var8) / 2;
        int var9 = var7 - var8;
        if (var9 > 0) {
            int var10 = (-arg3 + var7 << 12) / var9;
            int var11 = (var7 - arg0 << 12) / var9;
            int var12 = (var7 - arg2 << 12) / var9;
            if (arg3 == var7) {
                this.field3036 = arg0 != var8 ? 4096 - var11 : var12 + 20480;
            } else if (arg0 == var7) {
                this.field3036 = ~arg2 == ~var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field3036 = arg3 == var8 ? var11 + 12288 : 20480 - var10;
            }
            this.field3036 /= 6;
        } else {
            this.field3036 = 0;
        }
        if (~this.field3033 < -1 && this.field3033 < 4096) {
            this.field3030 = (var9 << 12) / (~this.field3033 >= -2049 ? this.field3033 * 2 : -(this.field3033 * 2) + 8192);
        } else {
            this.field3030 = 0;
        }
    }
}
