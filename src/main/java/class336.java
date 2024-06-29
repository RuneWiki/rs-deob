import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class336 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5222 = "";

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5223 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lo;")
    public static class21 field5228;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2216(int arg0) {
        class52 var1 = class47.field584;
        synchronized (class47.field584) {
            if (arg0 != -14416) {
                return;
            }
            class47.field584.method335((byte) -71);
        }
        field5227++;
        class52 var2 = class68.field849;
        synchronized (class68.field849) {
            class68.field849.method335((byte) 83);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIII)V", line = 40)
    public static final void method2217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class114.field1581 = 0;
        field5224++;
        for (int var7 = -1; var7 < class397.field5940 + class107.field1500; var7++) {
            class226 var31 = null;
            class124 var32;
            if (var7 < 0) {
                var32 = class261.field4201;
            } else if (var7 >= class107.field1500) {
                var32 = class39.field499[class423.field6253[var7 - class107.field1500]];
                var31 = ((class50) var32).field615;
                if (var31.field3771 != null) {
                    var31 = var31.method1619(-37);
                    if (var31 == null) {
                        continue;
                    }
                }
            } else {
                var32 = class216.field3517[class132.field2063[var7]];
            }
            if (var32.field1864 >= 0) {
                class43.method288(arg4, arg0, var32, arg1 >> 1, arg2 >> 1, (byte) -51, var32.method317(20155));
                if (class126.field1938[0] >= 0) {
                    if (var32.field1823 != null && (var7 >= class107.field1500 || class234.field3907 == 0 || class234.field3907 == 3 || class234.field3907 == 1 && class140.method1022(79, ((class219) var32).field3588)) && class232.field3888 > class114.field1581) {
                        class232.field3853[class114.field1581] = class413.field6111.method2162(var32.field1823, 104) / 2;
                        class232.field3882[class114.field1581] = class126.field1938[0];
                        class232.field3851[class114.field1581] = class126.field1938[1];
                        class232.field3862[class114.field1581] = var32.field1859;
                        class232.field3855[class114.field1581] = var32.field1855;
                        class232.field3854[class114.field1581] = var32.field1846;
                        class232.field3884[class114.field1581] = var32.field1823;
                        class114.field1581++;
                    }
                    class356 var33 = class241.field4008[0];
                    int var34 = arg5 + class126.field1938[1] - Math.max(class413.field6111.field5107, var33.method2325());
                    if (!var32.field1819 && class183.field2987 < var32.field1863) {
                        class356 var35 = class241.field4008[1];
                        if (var32 instanceof class50) {
                            class50 var36 = (class50) var32;
                            class356[] var37 = (class356[]) class427.field6300.method331((byte) 69, (long) var36.field615.field3777);
                            if (var37 == null) {
                                class100[] var38 = class100.method750(class223.field3727, var36.field615.field3777, 0);
                                if (var38 != null) {
                                    var37 = new class356[var38.length];
                                    for (int var39 = 0; var39 < var38.length; var39++) {
                                        var37[var39] = class284.field4547.method641(var38[var39], true);
                                    }
                                    class427.field6300.method341(55, (long) var36.field615.field3777, var37);
                                }
                            }
                            if (var37 != null && var37.length == 2) {
                                var35 = var37[1];
                                var33 = var37[0];
                            }
                        }
                        int var40 = arg6 - ((var33.method2324() >> 1) - class126.field1938[0]);
                        var33.method2327(var40, var34);
                        int var41 = var33.method2324() * var32.field1884 / 255;
                        class284.field4547.method682(var40, var34, var40 + var41, var33.method2325() + var34);
                        var35.method2327(var40, var34);
                        class284.field4547.method671(arg6, arg5, arg1 + arg6, arg2 + arg5);
                    }
                    var34 -= 2;
                    if (!var32.field1819) {
                        if (var32.field1820 > class183.field2987) {
                            class356 var42 = class359.field5499[var32.field1877 ? 2 : 0];
                            class356 var43 = class359.field5499[var32.field1877 ? 3 : 1];
                            boolean var44 = true;
                            int var45;
                            if ((var32 instanceof class50)) {
                                var45 = var31.field3759;
                                if (var45 == -1) {
                                    var45 = var32.method912(-5).field5403;
                                }
                            } else {
                                var45 = var32.method912(-5).field5403;
                            }
                            if (var45 != -1) {
                                class356[] var46 = (class356[]) class214.field3439.method331((byte) 69, (long) var45);
                                if (var46 == null) {
                                    class100[] var47 = class100.method750(class223.field3727, var45, 0);
                                    if (var47 != null) {
                                        var46 = new class356[var47.length];
                                        for (int var48 = 0; var48 < var47.length; var48++) {
                                            var46[var48] = class284.field4547.method641(var47[var48], true);
                                        }
                                        class214.field3439.method341(108, (long) var45, var46);
                                    }
                                }
                                if (var46 != null && var46.length == 4) {
                                    var43 = var46[var32.field1877 ? 3 : 1];
                                    var42 = var46[var32.field1877 ? 2 : 0];
                                }
                            }
                            int var49 = var32.field1820 - class183.field2987;
                            int var50;
                            if (var49 <= var32.field1822) {
                                var50 = var42.method2324();
                            } else {
                                int var51 = var49 - var32.field1822;
                                int var52 = var32.field1856 == 0 ? 0 : (var32.field1887 - var51) / var32.field1856 * var32.field1856;
                                var50 = var42.method2324() * var52 / var32.field1887;
                            }
                            int var53 = var42.method2325();
                            var34 -= var53;
                            int var54 = class126.field1938[0] + arg6 - (var42.method2324() >> 1);
                            var42.method2327(var54, var34);
                            class284.field4547.method682(var54, var34, var50 + var54, var34 - -var53);
                            var43.method2327(var54, var34);
                            class284.field4547.method671(arg6, arg5, arg1 + arg6, arg2 + arg5);
                            var34 -= 2;
                        }
                        if (var7 < class107.field1500) {
                            class219 var55 = (class219) var32;
                            if (var55.field3616 != -1) {
                                var34 -= 25;
                                class254.field4122[var55.field3616].method2327(class126.field1938[0] + arg6 - 12, var34);
                                var34 -= 2;
                            }
                            if (var55.field3611 != -1) {
                                var34 -= 25;
                                class248.field4062[var55.field3611].method2327(class126.field1938[0] + arg6 - 12, var34);
                                var34 -= 2;
                            }
                        } else if (var31.field3774 >= 0 && class248.field4062.length > var31.field3774) {
                            class356 var56 = class248.field4062[var31.field3774];
                            var34 -= 25;
                            var56.method2327(class126.field1938[0] + arg6 - (var56.method2324() >> 1), var34);
                            var34 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var32 instanceof class219)) {
                        int var57 = 0;
                        class136[] var58 = class256.field4144;
                        for (int var59 = 0; var59 < var58.length; var59++) {
                            class136 var61 = var58[var59];
                            if (var61 != null && var61.field2124 == 1 && class423.field6253[var7 - class107.field1500] == var61.field2121) {
                                class356 var62 = class245.field4021[var61.field2132];
                                if (var57 < var62.method2325()) {
                                    var57 = var62.method2325();
                                }
                                if (class183.field2987 % 20 < 10) {
                                    var62.method2327(class126.field1938[0] + arg6 - 12, -var62.method2325() + var34);
                                }
                            }
                        }
                        if (var57 > 0) {
                            var10000 = var34 - (var57 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var63 = 0;
                        class136[] var64 = class256.field4144;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class136 var67 = var64[var65];
                            if (var67 != null && var67.field2124 == 10 && class132.field2063[var7] == var67.field2121) {
                                class356 var68 = class245.field4021[var67.field2132];
                                if (var68.method2325() > var63) {
                                    var63 = var68.method2325();
                                }
                                var68.method2327(arg6 + class126.field1938[0] - 12, var34 + -var68.method2325());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var34 - (var63 + 2);
                        }
                    }
                    for (int var69 = 0; var69 < 4; var69++) {
                        if (var32.field1853[var69] > class183.field2987) {
                            int var70 = var32.method317(20155) / 2;
                            class43.method288(arg4, arg0, var32, arg1 >> 1, arg2 >> 1, (byte) -34, var70);
                            if (class126.field1938[0] > -1) {
                                if (var69 == 1) {
                                    class126.field1938[1] -= 20;
                                }
                                if (var69 == 2) {
                                    class126.field1938[0] -= 15;
                                    class126.field1938[1] -= 10;
                                }
                                if (var69 == 3) {
                                    class126.field1938[0] += 15;
                                    class126.field1938[1] -= 10;
                                }
                                class379.field5741[var32.field1828[var69]].method2327(class126.field1938[0] + arg6 - 12, class126.field1938[1] + -12 + arg5);
                                class292.field4680.method2820(Integer.toString(var32.field1891[var69]), 0, class126.field1938[1] + arg5 + 3, false, class126.field1938[0] + arg6 - 1, -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class145.field2275; var8++) {
            int var27 = class390.field5861[var8];
            class124 var28;
            if (var27 < 2048) {
                var28 = class216.field3517[var27];
            } else {
                var28 = class39.field499[var27 - 2048];
            }
            int var29 = class246.field4037[var8];
            class124 var30;
            if (var29 < 2048) {
                var30 = class216.field3517[var29];
            } else {
                var30 = class39.field499[var29 - 2048];
            }
            class79.method500(arg1, arg5, --var28.field1834, true, arg0, var30, arg4, arg6, var28, arg2);
        }
        int var9 = class413.field6111.field5107 + class413.field6111.field5108 + 2;
        for (int var10 = 0; var10 < class114.field1581; var10++) {
            int var12 = class232.field3882[var10];
            int var13 = class232.field3851[var10];
            int var14 = class232.field3853[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var26 = 0; var26 < var10; var26++) {
                    if (var13 + 2 > class232.field3851[var26] + -var9 && class232.field3851[var26] + 2 > -var9 + var13 && (var12 - var14) < (class232.field3882[var26] + class232.field3853[var26]) && (var12 + var14) > (class232.field3882[var26] - class232.field3853[var26]) && var13 > (class232.field3851[var26] - var9)) {
                        var13 = class232.field3851[var26] - var9;
                        var15 = true;
                    }
                }
            }
            class232.field3851[var10] = var13;
            String var16 = class232.field3884[var10];
            if (class358.field5482 == 0) {
                int var17 = 16776960;
                if (class232.field3862[var10] < 6) {
                    var17 = class36.field457[class232.field3862[var10]];
                }
                if (class232.field3862[var10] == 6) {
                    var17 = (class264.field4260 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class232.field3862[var10] == 7) {
                    var17 = (class264.field4260 % 20) < 10 ? 255 : 65535;
                }
                if (class232.field3862[var10] == 8) {
                    var17 = class264.field4260 % 20 < 10 ? 45056 : 8454016;
                }
                if (class232.field3862[var10] == 9) {
                    int var18 = 150 - class232.field3854[var10];
                    if (var18 < 50) {
                        var17 = var18 * 1280 + 16711680;
                    } else if (var18 < 100) {
                        var17 = 16776960 - ((var18 - 50) * 327680);
                    } else if (var18 < 150) {
                        var17 = (var18 * 5) + 64780;
                    }
                }
                if (class232.field3862[var10] == 10) {
                    int var19 = 150 - class232.field3854[var10];
                    if (var19 < 50) {
                        var17 = var19 * 5 + 16711680;
                    } else if (var19 < 100) {
                        var17 = 33095935 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var17 = ((var19 - 100) * 327680) + 255 - ((var19 + -100) * 5);
                    }
                }
                if (class232.field3862[var10] == 11) {
                    int var20 = 150 - class232.field3854[var10];
                    if (var20 < 50) {
                        var17 = 16777215 - (var20 * 327685);
                    } else if (var20 < 100) {
                        var17 = var20 * 327685 - 16318970;
                    } else if (var20 < 150) {
                        var17 = 16777215 - ((var20 - 100) * 327680);
                    }
                }
                int var21 = var17 | 0xFF000000;
                if (class232.field3855[var10] == 0) {
                    class11.field133.method2820(var16, -16777216, arg5 + var13, false, arg6 + var12, var21);
                }
                if (class232.field3855[var10] == 1) {
                    class11.field133.method2818(class264.field4260, var16, var21, (byte) 122, arg6 + var12, -16777216, arg5 + var13);
                }
                if (class232.field3855[var10] == 2) {
                    class11.field133.method2824(-16777216, arg5 + var13, var16, class264.field4260, arg6 + var12, var21, 117);
                }
                if (class232.field3855[var10] == 3) {
                    class11.field133.method2821(var16, -16777216, -119, var21, arg5 + var13, class264.field4260, 150 - class232.field3854[var10], arg6 + var12);
                }
                if (class232.field3855[var10] == 4) {
                    int var22 = (150 - class232.field3854[var10]) * (class413.field6111.method2162(var16, 106) + 100) / 150;
                    class284.field4547.method682(arg6 + var12 - 50, arg5, arg6 + var12 + 50, arg2 + arg5);
                    class11.field133.method2810(arg6 + var12 + 50 - var22, -16777216, var21, arg5 + var13, true, var16);
                    class284.field4547.method671(arg6, arg5, arg1 + arg6, arg2 + arg5);
                }
                if (class232.field3855[var10] == 5) {
                    int var23 = 150 - class232.field3854[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    int var25 = class413.field6111.field5108 + class413.field6111.field5107;
                    class284.field4547.method682(arg6, arg5 + var13 - var25 - 1, arg1 + arg6, arg5 + var13 + 5);
                    class11.field133.method2820(var16, -16777216, var13 + var24 + arg5, false, arg6 + var12, var21);
                    class284.field4547.method671(arg6, arg5, arg1 + arg6, arg2 + arg5);
                }
            } else {
                class11.field133.method2820(var16, -16777216, arg5 + var13, false, arg6 + var12, -256);
            }
        }
        int var11 = 73 % ((arg3 + 34) / 51);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 591)
    public static void method2218(byte arg0) {
        field5222 = null;
        field5223 = null;
        field5228 = null;
        if (arg0 != 119) {
            field5223 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLne;)V", line = 616)
    public static final void method2219(byte arg0, class172 arg1) {
        if (arg0 != 6) {
            field5223 = null;
        }
        if (class291.field4642 == arg1.field2773) {
            class267.field4296[arg1.field2781] = true;
        }
        field5225++;
    }
}
