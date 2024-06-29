import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class157 extends class270 {

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    private int field2393 = 4096;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
    private int field2392 = 0;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "[[B")
    public static byte[][] field2384 = new byte[250][];

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
    public static int field2397 = 0;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "[I")
    public static int[] field2399 = new int[25];

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2395 = "Loaded textures";

    @OriginalMember(owner = "client!sm", name = "ab", descriptor = "I")
    public static int field2401 = 0;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!sm", name = "bb", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "Lvj;")
    public static class177 field2394;

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "Lqp;")
    public static class278 field2400;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "Lck;")
    public static class351 field2389;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "[I")
    public static int[] field2385;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ldp;Ldp;Lfh;ILdp;)Z", line = 8)
    public static final boolean method1231(class174 arg0, class174 arg1, class210 arg2, int arg3, class174 arg4) {
        class416.field6028 = arg2;
        class310.field4524 = arg0;
        ++field2398;
        if (arg3 > -8) {
            field2397 = 28;
        }
        class102.field1582 = arg1;
        class7.field98 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)[I", line = 31)
    public final int[] method81(byte arg0, int arg1) {
        ++field2391;
        int[] var3 = super.field4053.method396(arg1, -90);
        if (super.field4053.field815) {
            int[] var4 = this.method1927(0, 0, arg1);
            for (int var5 = 0; var5 < class161.field2445; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field2392) {
                    if (~var6 >= ~this.field2393) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field2393;
                    }
                } else {
                    var3[var5] = this.field2392;
                }
            }
        }
        if (arg0 < 26) {
            method1233(-31, 40, 88, -127, 32, -98, false, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)I", line = 74)
    public static final int method1232(int arg0) {
        ++field2396;
        try {
            if (class394.field5749 == 0) {
                if (~(class10.method63(-21149) - 5000L) > ~class263.field3957) {
                    return 0;
                }
                class20.field296 = class188.field2783.method1383(class285.field4266, true, class409.field5971);
                class380.field5390 = class10.method63(-21149);
                class394.field5749 = 1;
            }
            if (class10.method63(-21149) > class380.field5390 - -30000L) {
                return class170.method1301(1000, -21216);
            } else {
                if (arg0 < 87) {
                    field2384 = null;
                }
                if (~class394.field5749 == -2) {
                    if (class20.field296.field2121 == 2) {
                        return class170.method1301(1001, -21216);
                    }
                    if (~class20.field296.field2121 != -2) {
                        return -1;
                    }
                    class124.field2028 = new class219((Socket) class20.field296.field2125, class188.field2783);
                    class20.field296 = null;
                    int var1 = 0;
                    class13.field216.field565 = 0;
                    if (class273.field4114) {
                        var1 = class268.field4013;
                    }
                    class13.field216.method267(23, false);
                    class13.field216.method275(var1, 1414495172);
                    class124.field2028.method1653(class13.field216.field578, 3, class13.field216.field565, 0);
                    if (field2389 != null) {
                        field2389.method2257(-17664);
                    }
                    if (class91.field1446 != null) {
                        class91.field1446.method2257(-17664);
                    }
                    int var2 = class124.field2028.method1662(1);
                    if (field2389 != null) {
                        field2389.method2257(-17664);
                    }
                    if (class91.field1446 != null) {
                        class91.field1446.method2257(-17664);
                    }
                    if (~var2 != -1) {
                        return class170.method1301(var2, -21216);
                    }
                    class394.field5749 = 2;
                }
                if (~class394.field5749 == -3) {
                    if (class124.field2028.method1655(-10561) < 2) {
                        return -1;
                    }
                    class115.field1831 = class124.field2028.method1662(1);
                    class115.field1831 <<= 8;
                    class115.field1831 += class124.field2028.method1662(1);
                    class52.field858 = new byte[class115.field1831];
                    class397.field5812 = 0;
                    class394.field5749 = 3;
                }
                if (~class394.field5749 == -4) {
                    int var3 = class124.field2028.method1655(-10561);
                    if (~var3 > -2) {
                        return -1;
                    } else {
                        if (~(-class397.field5812 + class115.field1831) > ~var3) {
                            var3 = -class397.field5812 + class115.field1831;
                        }
                        class124.field2028.method1659(121, class52.field858, var3, class397.field5812);
                        class397.field5812 += var3;
                        if (class115.field1831 > class397.field5812) {
                            return -1;
                        } else if (!class276.method1974(class52.field858, 121)) {
                            return class170.method1301(1002, -21216);
                        } else {
                            class221.field3299 = new class218[class33.field465];
                            int var4 = 0;
                            for (int var5 = class407.field5938; class328.field4729 >= var5; ++var5) {
                                class218 var6 = class33.method237(var5, (byte) -84);
                                if (var6 != null) {
                                    class221.field3299[var4++] = var6;
                                }
                            }
                            class225.field3322 = null;
                            class111.field1802 = 0;
                            class124.field2028.method1654(-21013);
                            class5.field42 = 0;
                            class124.field2028 = null;
                            class394.field5749 = 0;
                            class52.field858 = null;
                            class263.field3957 = class10.method63(-21149);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class170.method1301(1003, -21216);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIZZ)V", line = 210)
    public static final void method1233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        ++field2402;
        if (arg6 || ~class135.field2160 != ~arg4 || ~class231.field3378 != ~arg2 || ~class140.field2216 != ~arg5 && !class122.method1034(arg0 ^ 24057)) {
            class135.field2160 = arg4;
            class231.field3378 = arg2;
            class140.field2216 = arg5;
            if (class122.method1034(24037)) {
                class140.field2216 = 0;
            }
            if (arg7) {
                class168.method1288(-6, 28);
            } else {
                class168.method1288(-6, 25);
            }
            class30.method228(true, class117.field1851, class107.field1763, true);
            int var8 = class379.field5384;
            class379.field5384 = (-(class183.field2703 >> 4) + class135.field2160) * 8;
            int var9 = class294.field4362;
            class294.field4362 = (-(class66.field1056 >> 4) + class231.field3378) * 8;
            class289.field4307 = class272.method1934(class135.field2160 * 8, class231.field3378 * 8);
            class141.field2233 = null;
            int var10 = -var8 + class379.field5384;
            int var11 = class294.field4362 - var9;
            if (!arg7) {
                for (int var12 = 0; ~var12 > -32769; ++var12) {
                    class98 var13 = class447.field6512[var12];
                    if (var13 != null) {
                        for (int var14 = 0; ~var14 > -11; ++var14) {
                            var13.field5694[var14] -= var10;
                            var13.field5696[var14] -= var11;
                        }
                        var13.field6519 -= var11 * 128;
                        var13.field6520 -= var10 * 128;
                    }
                }
            } else {
                class156.field2376 = 0;
                int var15 = (class183.field2703 + -1) * 128;
                int var16 = (class66.field1056 - 1) * 128;
                for (int var17 = 0; ~var17 > -32769; ++var17) {
                    class98 var22 = class447.field6512[var17];
                    if (var22 != null) {
                        var22.field6519 -= var11 * 128;
                        var22.field6520 -= var10 * 128;
                        if (var22.field6520 >= 0 && ~var22.field6520 >= ~var15 && ~var22.field6519 <= -1 && ~var22.field6519 >= ~var16) {
                            boolean var23 = true;
                            for (int var24 = 0; var24 < 10; ++var24) {
                                var22.field5694[var24] -= var10;
                                var22.field5696[var24] -= var11;
                                if (~var22.field5694[var24] > -1 || var22.field5694[var24] >= class183.field2703 || var22.field5696[var24] < 0 || var22.field5696[var24] >= class66.field1056) {
                                    var23 = false;
                                }
                            }
                            if (var23) {
                                class416.field6027[class156.field2376++] = var17;
                            } else {
                                class447.field6512[var17].method817((class11) null, 17671);
                                class447.field6512[var17] = null;
                            }
                        } else {
                            class447.field6512[var17].method817((class11) null, 17671);
                            class447.field6512[var17] = null;
                        }
                    }
                }
            }
            for (int var18 = 0; var18 < 2048; ++var18) {
                class127 var20 = class367.field5225[var18];
                if (var20 != null) {
                    for (int var21 = 0; ~var21 > -11; ++var21) {
                        var20.field5694[var21] -= var10;
                        var20.field5696[var21] -= var11;
                    }
                    var20.field6519 -= var11 * 128;
                    var20.field6520 -= var10 * 128;
                }
            }
            class367.field5213 = arg5;
            class86.field1394.method1071(6289, arg3, false, class367.field5213, arg1);
            class364.method2326(783682364, var11, var10);
            for (class32 var19 = (class32) class346.field4881.method157((byte) -125); var19 != null; var19 = (class32) class346.field4881.method145(arg0 ^ 44)) {
                var19.field462 -= var11;
                var19.field459 -= var10;
                if (var19.field459 < 0 || ~var19.field462 > -1 || ~var19.field459 <= ~class183.field2703 || var19.field462 >= class66.field1056) {
                    var19.method251(arg0 + 82);
                }
            }
            if (class161.field2434 != 0) {
                class11.field136 -= var11;
                class161.field2434 -= var10;
            }
            class361.field5154 = 0;
            if (arg7) {
                class64.field1040 -= var10;
                class423.field6165 -= var11;
                class288.field4300 -= var11;
                class286.field4288 -= var11 * 128;
                class265.field3985 -= var10 * 128;
                class347.field4911 -= var10;
                if (~Math.abs(var10) < ~class183.field2703 || ~Math.abs(var11) < ~class66.field1056) {
                    class287.method2024(104);
                }
            } else if (class322.field4643 == 4) {
                class263.field3956 -= var11 * 128;
                class369.field5238 -= var10 * 128;
                class99.field1551 -= var10 * 128;
                class392.field5729 -= var11 * 128;
            } else {
                class322.field4643 = 1;
            }
            class105.method934((byte) -21);
            class244.field3549.method147(35);
            class321.field4640.method147(35);
            class61.field981.method2494(0);
            if (arg0 == 28) {
                class18.method116(arg0 ^ -100);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)[[I", line = 434)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field2387;
        int[][] var3 = super.field4046.method244(arg1, 125);
        if (!arg0) {
            field2401 = 24;
        }
        if (super.field4046.field488) {
            int[][] var4 = this.method1930(arg1, 0, (byte) -75);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class161.field2445; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field2392) {
                    var8[var11] = this.field2392;
                } else if (~var12 < ~this.field2393) {
                    var8[var11] = this.field2393;
                } else {
                    var8[var11] = var12;
                }
                if (this.field2392 <= var13) {
                    if (~this.field2393 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field2393;
                    }
                } else {
                    var9[var11] = this.field2392;
                }
                if (~this.field2392 < ~var14) {
                    var10[var11] = this.field2392;
                } else if (var14 > this.field2393) {
                    var10[var11] = this.field2393;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLec;I)V", line = 510)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.method81((byte) 5, -106);
        }
        ++field2381;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field4055 = ~arg1.method271((byte) 116) == -2;
                }
            } else {
                this.field2393 = arg1.method320((byte) -87);
            }
        } else {
            this.field2392 = arg1.method320((byte) -87);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 613)
    public class157() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)V", line = 559)
    public static final void method1234(int arg0, boolean arg1) {
        ++field2390;
        class221 var2 = class447.method2795(3, (byte) -49, arg0);
        if (!arg1) {
            var2.method1689(100);
        }
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(B)V", line = 575)
    public static void method1235(byte arg0) {
        field2395 = null;
        field2385 = null;
        field2384 = null;
        field2400 = null;
        if (arg0 == 34) {
            field2394 = null;
            field2399 = null;
            field2389 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(B)V", line = 591)
    public static final void method1236(byte arg0) {
        class14.field221 = false;
        class161.field2438 = null;
        class220.field3280 = null;
        class333.field4775 = null;
        class303.field4426 = null;
        class200.field2932 = null;
        if (arg0 != 19) {
            method1232(-39);
        }
        ++field2388;
        class126.method1061(false);
    }
}
