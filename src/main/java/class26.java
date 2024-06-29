import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class26 extends class210 {

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "Lwn;")
    public class30 field442 = new class30();

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Ldg;")
    public class336 field444 = new class336();

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Lka;")
    private class201 field434;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Z")
    public static boolean field436 = false;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field437 = -1;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Ljava/lang/String;")
    public static String field439 = "scroll:";

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "Lwd;")
    public static class88 field441;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "([III)V", line = 7)
    public final void method232(int[] arg0, int arg1, int arg2) {
        this.field444.method232(arg0, arg1, arg2);
        field438++;
        for (class218 var4 = (class218) this.field442.method268(-1); var4 != null; var4 = (class218) this.field442.method278(1)) {
            if (!this.field434.method1428(16, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field3387 >= var5) {
                        this.method237(var4, var6, arg0, 1048575, var5 + var6, var5);
                        var4.field3387 -= var5;
                        break;
                    }
                    this.method237(var4, var6, arg0, 1048575, var5 + var6, var4.field3387);
                    var5 -= var4.field3387;
                    var6 += var4.field3387;
                } while (!this.field434.method1424(arg0, -89, var6, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()Lkn;", line = 44)
    public final class210 method233() {
        field431++;
        class218 var1;
        do {
            var1 = (class218) this.field442.method278(1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3412 == null);
        return var1.field3412;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 66)
    public static final void method234(int arg0) {
        field429++;
        if (class82.field1281 > 0) {
            class82.field1281--;
        }
        if (class260.field3870 > 1) {
            class260.field3870--;
            class142.field2294 = class200.field3060;
        }
        if (class344.field5340) {
            class344.field5340 = false;
            class41.method379(40);
            return;
        }
        for (int var1 = 0; var1 < 100 && class191.method1372((byte) 97); var1++) {
        }
        if (class289.field4548 != 30) {
            return;
        }
        class204.method1459(class209.field3305, 127, 108);
        Object var2 = class49.field755.field3628;
        synchronized (class49.field755.field3628) {
            if (!class166.field2684) {
                class49.field755.field3634 = 0;
            } else if (class200.field3072 != 0 || class49.field755.field3634 >= 40) {
                class209.field3305.method1808((byte) -74, 212);
                class133.field2116++;
                class209.field3305.method21(-120, 0);
                int var3 = class209.field3305.field48;
                int var4 = 0;
                for (int var5 = 0; class49.field755.field3634 > var5 && class209.field3305.field48 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class49.field755.field3632[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class49.field755.field3631[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class49.field755.field3631[var5] == -1 && class49.field755.field3632[var5] == -1) {
                        var8 = -1;
                        var6 = -1;
                        var7 = true;
                    }
                    if (class281.field4414 != var6 || class135.field2152 != var8) {
                        int var9 = var8 - class135.field2152;
                        int var10 = var6 - class281.field4414;
                        class135.field2152 = var8;
                        class281.field4414 = var6;
                        if (class62.field909 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class209.field3305.method14(-246866616, (class62.field909 << 12) + (var10 << 6) + var9);
                            class62.field909 = 0;
                        } else if (class62.field909 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class209.field3305.method21(86, class62.field909 + 128);
                            var9 += 128;
                            var10 += 128;
                            class209.field3305.method14(-246866616, (var10 << 8) + var9);
                            class62.field909 = 0;
                        } else if (class62.field909 < 32) {
                            class209.field3305.method21(124, class62.field909 + 192);
                            if (var7) {
                                class209.field3305.method11(Integer.MIN_VALUE, 31932);
                            } else {
                                class209.field3305.method11(var6 | var8 << 16, 31932);
                            }
                            class62.field909 = 0;
                        } else {
                            class209.field3305.method14(-246866616, class62.field909 + 57344);
                            if (var7) {
                                class209.field3305.method11(Integer.MIN_VALUE, 31932);
                            } else {
                                class209.field3305.method11(var6 | var8 << 16, 31932);
                            }
                            class62.field909 = 0;
                        }
                    } else if (class62.field909 < 2047) {
                        class62.field909++;
                    }
                }
                class209.field3305.method2(97, class209.field3305.field48 - var3);
                if (var4 >= class49.field755.field3634) {
                    class49.field755.field3634 = 0;
                } else {
                    class49.field755.field3634 -= var4;
                    for (int var11 = 0; var11 < class49.field755.field3634; var11++) {
                        class49.field755.field3632[var11] = class49.field755.field3632[var4 + var11];
                        class49.field755.field3631[var11] = class49.field755.field3631[var4 + var11];
                    }
                }
            }
        }
        if (class200.field3072 != 0) {
            class22.field401++;
            int var13 = class243.field3639;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            long var14 = (class319.field5004 - class38.field572) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = class170.field2740;
            int var17 = (int) var14;
            byte var18 = 0;
            if (class200.field3072 == 2) {
                var18 = 1;
            }
            class38.field572 = class319.field5004;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            class209.field3305.method1808((byte) -74, 51);
            class209.field3305.method26(-37, var18 << 15 | var17);
            class209.field3305.method10(var13 << 16 | var16, -117);
        }
        if (class13.field297 > 0) {
            class13.field297--;
        }
        if (class6.field134 && class13.field297 <= 0) {
            class92.field1503++;
            class6.field134 = false;
            class13.field297 = 20;
            class209.field3305.method1808((byte) -74, 113);
            class209.field3305.method47((int) class171.field2747, false);
            class209.field3305.method44((byte) 97, (int) class86.field1388);
        }
        if (class281.field4413 && !class237.field3555) {
            class237.field3555 = true;
            class209.field3305.method1808((byte) -74, 244);
            class209.field3305.method21(-128, 1);
            class280.field4396++;
        }
        if (!class281.field4413 && class237.field3555) {
            class237.field3555 = false;
            class209.field3305.method1808((byte) -74, 244);
            class209.field3305.method21(-99, 0);
            class280.field4396++;
        }
        if (!class117.field1905) {
            class209.field3305.method1808((byte) -74, 205);
            class190.field2978++;
            class209.field3305.method7(-5628, class168.method1254(1));
            class117.field1905 = true;
        }
        if (class78.field1222) {
            class78.field1222 = false;
        } else {
            class104.field1712 /= 2.0F;
        }
        if (class128.field2052) {
            class128.field2052 = false;
        } else {
            class217.field3376 /= 2.0F;
        }
        class43.method385(-111);
        if (class289.field4548 != 30) {
            return;
        }
        class316.method2232(-61);
        class315.method2225(128);
        class257.method1778(true);
        class99.field1580++;
        if (class99.field1580 > 750) {
            class41.method379(40);
            return;
        }
        class104.method843((byte) 98);
        class92.method737(0);
        class214.method1554(572);
        if (class133.field2119 != null) {
            class117.method918(-1);
        }
        for (int var19 = class11.method159(true, (byte) -112); var19 != -1; var19 = class11.method159(false, (byte) -97)) {
            class314.method2210(31845, var19);
            class117.field1900[class164.method1234(31, class121.field1980++)] = var19;
        }
        for (class170 var20 = class266.method1842((byte) -127); var20 != null; var20 = class266.method1842((byte) -123)) {
            int var21 = var20.method1266(-15430);
            int var22 = var20.method1271(1193026792);
            if (var21 == 1) {
                class92.field1487[var22] = var20.field2730;
                class75.field1165[class164.method1234(class56.field856++, 31)] = var22;
            } else if (var21 == 2) {
                class151.field2463[var22] = var20.field2729;
                class36.field548[class164.method1234(class294.field4706++, 31)] = var22;
            } else if (var21 == 3) {
                class266 var43 = class171.method1276(var22, (byte) -118);
                if (!var20.field2729.equals(var43.field3927)) {
                    var43.field3927 = var20.field2729;
                    class280.method1971((byte) 101, var43);
                }
            } else if (var21 == 4) {
                class266 var23 = class171.method1276(var22, (byte) 14);
                int var24 = var20.field2737;
                int var25 = var20.field2730;
                int var26 = var20.field2734;
                if (var23.field4003 != var25 || var23.field4005 != var26 || var23.field4028 != var24) {
                    var23.field4005 = var26;
                    var23.field4028 = var24;
                    var23.field4003 = var25;
                    class280.method1971((byte) 101, var23);
                }
            } else if (var21 == 5) {
                class266 var42 = class171.method1276(var22, (byte) 17);
                if (var20.field2730 != var42.field3975 || var20.field2730 == -1) {
                    var42.field4041 = 0;
                    var42.field4077 = 0;
                    var42.field3966 = 1;
                    var42.field3975 = var20.field2730;
                    class280.method1971((byte) 101, var42);
                }
            } else if (var21 == 6) {
                int var36 = var20.field2730;
                int var37 = var36 & 0x1F;
                int var38 = (var36 & 0x3EA) >> 5;
                class266 var39 = class171.method1276(var22, (byte) -123);
                int var40 = (var36 & 0x7C6A) >> 10;
                int var41 = (var37 << 3) + (var38 << 11) + (var40 << 19);
                if (var39.field4076 != var41) {
                    var39.field4076 = var41;
                    class280.method1971((byte) 101, var39);
                }
            } else if (var21 == 7) {
                class266 var34 = class171.method1276(var22, (byte) 83);
                boolean var35 = var20.field2730 == 1;
                if (var35 != var34.field4046) {
                    var34.field4046 = var35;
                    class280.method1971((byte) 101, var34);
                }
            } else if (var21 == 8) {
                class266 var33 = class171.method1276(var22, (byte) -120);
                if (var20.field2730 != var33.field4020 || var20.field2734 != var33.field3968 || var20.field2737 != var33.field4105) {
                    var33.field4105 = var20.field2737;
                    var33.field4020 = var20.field2730;
                    var33.field3968 = var20.field2734;
                    if (var33.field3947 != -1) {
                        if (var33.field4090 > 0) {
                            var33.field4105 = var33.field4105 * 32 / var33.field4090;
                        } else if (var33.field3987 > 0) {
                            var33.field4105 = var33.field4105 * 32 / var33.field3987;
                        }
                    }
                    class280.method1971((byte) 101, var33);
                }
            } else if (var21 == 9) {
                class266 var27 = class171.method1276(var22, (byte) -116);
                if (var20.field2730 != var27.field3947 || var20.field2734 != var27.field4016) {
                    var27.field4016 = var20.field2734;
                    var27.field3947 = var20.field2730;
                    class280.method1971((byte) 101, var27);
                }
            } else if (var21 == 10) {
                class266 var32 = class171.method1276(var22, (byte) -116);
                if (var20.field2730 != var32.field4055 || var20.field2734 != var32.field3960 || var20.field2737 != var32.field3937) {
                    var32.field4055 = var20.field2730;
                    var32.field3937 = var20.field2737;
                    var32.field3960 = var20.field2734;
                    class280.method1971((byte) 101, var32);
                }
            } else if (var21 == 11) {
                class266 var31 = class171.method1276(var22, (byte) -11);
                var31.field4011 = 0;
                var31.field4099 = var31.field4012 = var20.field2730;
                var31.field4087 = var31.field4036 = var20.field2734;
                var31.field4103 = 0;
                class280.method1971((byte) 101, var31);
            } else if (var21 == 12) {
                class266 var28 = class171.method1276(var22, (byte) -120);
                int var29 = var20.field2730;
                if (var28 != null && var28.field4084 == 0) {
                    if (var29 > var28.field4097 - var28.field3939) {
                        var29 = var28.field4097 - var28.field3939;
                    }
                    if (var29 < 0) {
                        var29 = 0;
                    }
                    if (var28.field4045 != var29) {
                        var28.field4045 = var29;
                        class280.method1971((byte) 101, var28);
                    }
                }
            } else if (var21 == 13) {
                class266 var30 = class171.method1276(var22, (byte) 19);
                var30.field4073 = var20.field2730;
            }
        }
        if (class172.field2762 != 0) {
            class18.field349 += 20;
            if (class18.field349 >= 400) {
                class172.field2762 = 0;
            }
        }
        class137.field2241++;
        if (class64.field936 != null) {
            class173.field2769++;
            if (class173.field2769 >= 15) {
                class280.method1971((byte) 101, class64.field936);
                class64.field936 = null;
            }
        }
        int var44 = -24 / ((-arg0 - 77) / 48);
        if (class109.field1774 != null) {
            class280.method1971((byte) 101, class109.field1774);
            if (class303.field4832 > (class89.field1424 + 5) || class303.field4832 < class89.field1424 - 5 || class22.field389 > (class85.field1369 + 5) || (class85.field1369 - 5) > class22.field389) {
                class8.field204 = true;
            }
            class9.field216++;
            if (class129.field2062 == 0) {
                if (class8.field204 && class9.field216 >= 5) {
                    if (class14.field305 == class109.field1774 && class179.field2846 != class16.field334) {
                        class285.field4447++;
                        class266 var45 = class109.field1774;
                        byte var46 = 0;
                        if (class266.field4052 == 1 && var45.field4064 == 206) {
                            var46 = 1;
                        }
                        if (var45.field3928[class179.field2846] <= 0) {
                            var46 = 0;
                        }
                        if (client.method1867(var45).method1786(113)) {
                            int var47 = class16.field334;
                            int var48 = class179.field2846;
                            var45.field3928[var48] = var45.field3928[var47];
                            var45.field3976[var48] = var45.field3976[var47];
                            var45.field3928[var47] = -1;
                            var45.field3976[var47] = 0;
                        } else if (var46 == 1) {
                            int var49 = class16.field334;
                            int var50 = class179.field2846;
                            while (var49 != var50) {
                                if (var49 > var50) {
                                    var45.method1841(-65536, var49 - 1, var49);
                                    var49--;
                                } else if (var49 < var50) {
                                    var45.method1841(-65536, var49 + 1, var49);
                                    var49++;
                                }
                            }
                        } else {
                            var45.method1841(-65536, class179.field2846, class16.field334);
                        }
                        class209.field3305.method1808((byte) -74, 252);
                        class209.field3305.method7(-5628, class109.field1774.field4088);
                        class209.field3305.method47(class179.field2846, false);
                        class209.field3305.method47(class16.field334, false);
                        class209.field3305.method21(41, var46);
                    }
                } else if ((class118.field1907 == 1 || class221.method1607(0, class137.field2225 - 1)) && class137.field2225 > 2) {
                    class136.method1051(true);
                } else if (class137.field2225 > 0) {
                    class345.method2394((byte) 88);
                }
                class200.field3072 = 0;
                class173.field2769 = 10;
                class109.field1774 = null;
            }
        }
        class66.field1010 = false;
        class314.field4959 = false;
        class128.field2056 = null;
        class185.field2930 = 0;
        class266 var51 = class143.field2313;
        class266 var52 = class321.field5028;
        class321.field5028 = null;
        class143.field2313 = null;
        while (class103.method839(-14632) && class185.field2930 < 128) {
            class113.field1832[class185.field2930] = class217.field3371;
            class338.field5217[class185.field2930] = class327.field5115;
            class185.field2930++;
        }
        class133.field2119 = null;
        if (class168.field2707 != -1) {
            class160.method1175(class211.field3314, false, class168.field2707, 0, 0, 0, 0, class338.field5219);
        }
        class200.field3060++;
        while (true) {
            class150 var53;
            class266 var54;
            class266 var55;
            do {
                var53 = (class150) class299.field4787.method275(-1);
                if (var53 == null) {
                    while (true) {
                        class150 var56;
                        class266 var57;
                        class266 var58;
                        do {
                            var56 = (class150) class247.field3675.method275(-1);
                            if (var56 == null) {
                                while (true) {
                                    class150 var59;
                                    class266 var60;
                                    class266 var61;
                                    do {
                                        var59 = (class150) class44.field698.method275(-1);
                                        if (var59 == null) {
                                            if (class133.field2119 == null) {
                                                class70.field1058 = 0;
                                            }
                                            if (class86.field1377 != null) {
                                                class306.method2171(true);
                                            }
                                            if (class233.field3543 > 0 && class48.field737[82] && class48.field737[81] && class307.field4865 != 0) {
                                                int var62 = class75.field1153 - class307.field4865;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class71.method571(class345.field5363.field4643[0] + class117.field1902, var62, class345.field5363.field4619[0] + class133.field2118, -107);
                                            }
                                            if (class233.field3543 > 0 && class48.field737[82] && class48.field737[81]) {
                                                if (class289.field4552 != -1) {
                                                    class71.method571(class289.field4552 + class117.field1902, class75.field1153, class184.field2923 + class133.field2118, -122);
                                                }
                                                class309.field4894 = 0;
                                                class226.field3505 = 0;
                                            } else if (class226.field3505 == 2) {
                                                if (class289.field4552 != -1) {
                                                    class31.field483++;
                                                    class209.field3305.method1808((byte) -74, 229);
                                                    class209.field3305.method26(-83, class289.field4552 + class117.field1902);
                                                    class209.field3305.method11(class22.field392, 31932);
                                                    class209.field3305.method44((byte) -71, class184.field2923 + class133.field2118);
                                                    class209.field3305.method47(class201.field3076, false);
                                                    class18.field349 = 0;
                                                    class44.field697 = class243.field3639;
                                                    class36.field538 = class170.field2740;
                                                    class172.field2762 = 1;
                                                }
                                                class226.field3505 = 0;
                                            } else if (class309.field4894 == 2) {
                                                if (class289.field4552 != -1) {
                                                    class209.field3305.method1808((byte) -74, 226);
                                                    class227.field3507++;
                                                    class209.field3305.method44((byte) 115, class184.field2923 + class133.field2118);
                                                    class209.field3305.method26(-124, class289.field4552 + class117.field1902);
                                                    class172.field2762 = 1;
                                                    class18.field349 = 0;
                                                    class36.field538 = class170.field2740;
                                                    class44.field697 = class243.field3639;
                                                }
                                                class309.field4894 = 0;
                                            } else if (class289.field4552 != -1 && class226.field3505 == 0 && class309.field4894 == 0) {
                                                class6.method103((class184.field2923 << 1) + 1 - class345.field5363.method738(-6421) >> 1, (byte) 36, (class289.field4552 << 1) + 1 - class345.field5363.method738(-6421) >> 1, 0);
                                                class44.field697 = class243.field3639;
                                                class172.field2762 = 1;
                                                class36.field538 = class170.field2740;
                                                class18.field349 = 0;
                                            }
                                            class289.field4552 = -1;
                                            class344.method2390(0);
                                            if (class143.field2313 != var51) {
                                                if (var51 != null) {
                                                    class280.method1971((byte) 101, var51);
                                                }
                                                if (class143.field2313 != null) {
                                                    class280.method1971((byte) 101, class143.field2313);
                                                }
                                            }
                                            if (class321.field5028 != var52 && class325.field5083 == class102.field1689) {
                                                if (var52 != null) {
                                                    class280.method1971((byte) 101, var52);
                                                }
                                                if (class321.field5028 != null) {
                                                    class280.method1971((byte) 101, class321.field5028);
                                                }
                                            }
                                            if (class321.field5028 == null) {
                                                if (class102.field1689 > 0) {
                                                    class102.field1689--;
                                                }
                                            } else if (class325.field5083 > class102.field1689) {
                                                class102.field1689++;
                                                if (class325.field5083 == class102.field1689) {
                                                    class280.method1971((byte) 101, class321.field5028);
                                                }
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class334.field5194[var63]++;
                                            }
                                            int var64 = class288.method2028(1);
                                            int var65 = class108.method857(2);
                                            if (var64 > 15000 && var65 > 15000) {
                                                class82.field1281 = 250;
                                                class146.method1110(-20720, 14500);
                                                class209.field3305.method1808((byte) -74, 192);
                                                class130.field2077++;
                                            }
                                            if (class157.field2575 != null && class157.field2575.field405 == 1) {
                                                if (class157.field2575.field409 != null) {
                                                    class149.method1129(class255.field3753, class308.field4882, (byte) 125);
                                                }
                                                class157.field2575 = null;
                                                class308.field4882 = false;
                                                class255.field3753 = null;
                                            }
                                            class327.field5116++;
                                            class315.field4974++;
                                            if (class327.field5116 > 500) {
                                                class327.field5116 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x4) == 4) {
                                                    class147.field2399 += class184.field2914;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class294.field4694 += class115.field1846;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class144.field2331 += class1.field71;
                                                }
                                            }
                                            class93.field1512++;
                                            if (class294.field4694 < -50) {
                                                class115.field1846 = 2;
                                            }
                                            if (class147.field2399 < -40) {
                                                class184.field2914 = 1;
                                            }
                                            if (class294.field4694 > 50) {
                                                class115.field1846 = -2;
                                            }
                                            if (class147.field2399 > 40) {
                                                class184.field2914 = -1;
                                            }
                                            if (class93.field1512 > 500) {
                                                class93.field1512 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class10.field242 += class167.field2691;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class150.field2455 += class104.field1713;
                                                }
                                            }
                                            if (class150.field2455 < -60) {
                                                class104.field1713 = 2;
                                            }
                                            if (class144.field2331 < -55) {
                                                class1.field71 = 2;
                                            }
                                            if (class150.field2455 > 60) {
                                                class104.field1713 = -2;
                                            }
                                            if (class10.field242 < -20) {
                                                class167.field2691 = 1;
                                            }
                                            if (class10.field242 > 10) {
                                                class167.field2691 = -1;
                                            }
                                            if (class144.field2331 > 55) {
                                                class1.field71 = -2;
                                            }
                                            if (class315.field4974 > 50) {
                                                class326.field5106++;
                                                class209.field3305.method1808((byte) -74, 219);
                                            }
                                            if (class141.field2275) {
                                                class294.method2063(-74);
                                                class141.field2275 = false;
                                            }
                                            try {
                                                if (class319.field5005 != null && class209.field3305.field48 > 0) {
                                                    class319.field5005.method373(1, 0, class209.field3305.field34, class209.field3305.field48);
                                                    class315.field4974 = 0;
                                                    class209.field3305.field48 = 0;
                                                }
                                            } catch (IOException var69) {
                                                class41.method379(40);
                                            }
                                            return;
                                        }
                                        var60 = var59.field2458;
                                        if (var60.field3958 < 0) {
                                            break;
                                        }
                                        var61 = class171.method1276(var60.field3926, (byte) -116);
                                    } while (var61 == null || var61.field3994 == null || var60.field3958 >= var61.field3994.length || var61.field3994[var60.field3958] != var60);
                                    class172.method1280(var59, (byte) 12);
                                }
                            }
                            var57 = var56.field2458;
                            if (var57.field3958 < 0) {
                                break;
                            }
                            var58 = class171.method1276(var57.field3926, (byte) -119);
                        } while (var58 == null || var58.field3994 == null || var58.field3994.length <= var57.field3958 || var58.field3994[var57.field3958] != var57);
                        class172.method1280(var56, (byte) 12);
                    }
                }
                var54 = var53.field2458;
                if (var54.field3958 < 0) {
                    break;
                }
                var55 = class171.method1276(var54.field3926, (byte) -128);
            } while (var55 == null || var55.field3994 == null || var55.field3994.length <= var54.field3958 || var55.field3994[var54.field3958] != var54);
            class172.method1280(var53, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 1059)
    public final void method235(int arg0) {
        this.field444.method235(arg0);
        field443++;
        for (class218 var2 = (class218) this.field442.method268(-1); var2 != null; var2 = (class218) this.field442.method278(1)) {
            if (!this.field434.method1428(16, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3387) {
                        this.method236(var3, false, var2);
                        var2.field3387 -= var3;
                        break;
                    }
                    this.method236(var2.field3387, false, var2);
                    var3 -= var2.field3387;
                } while (!this.field434.method1424((int[]) null, -69, 0, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZLbg;)V", line = 1095)
    private final void method236(int arg0, boolean arg1, class218 arg2) {
        field433++;
        if (arg1) {
            this.method232((int[]) null, -82, -110);
        }
        if ((this.field434.field3107[arg2.field3389] & 0x4) != 0 && arg2.field3400 < 0) {
            int var4 = this.field434.field3101[arg2.field3389] / class297.field4778;
            int var5 = (var4 + 1048575 - arg2.field3394) / var4;
            arg2.field3394 = arg0 * var4 + arg2.field3394 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field434.field3117[arg2.field3389] == 0) {
                    arg2.field3412 = class269.method1904(arg2.field3404, arg2.field3412.method1885(), arg2.field3412.method1877(), arg2.field3412.method1894());
                } else {
                    arg2.field3412 = class269.method1904(arg2.field3404, arg2.field3412.method1885(), 0, arg2.field3412.method1894());
                    this.field434.method1440(arg2.field3390.field753[arg2.field3388] < 0, -100, arg2);
                }
                if (arg2.field3390.field753[arg2.field3388] < 0) {
                    arg2.field3412.method1880(-1);
                }
                arg0 = arg2.field3394 / var4;
            }
        }
        arg2.field3412.method235(arg0);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lbg;I[IIII)V", line = 1140)
    private final void method237(class218 arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 1048575) {
            return;
        }
        field430++;
        if ((this.field434.field3107[arg0.field3389] & 0x4) != 0 && arg0.field3400 < 0) {
            int var7 = this.field434.field3101[arg0.field3389] / class297.field4778;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field3394) / var7;
                if (arg5 < var8) {
                    arg0.field3394 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg0.field3412.method232(arg2, arg1, var8);
                class269 var9 = arg0.field3412;
                arg0.field3394 += var7 * var8 - 1048576;
                arg1 += var8;
                int var10 = class297.field4778 / 100;
                int var11 = 262144 / var7;
                if (var11 < var10) {
                    var10 = var11;
                }
                if (this.field434.field3117[arg0.field3389] == 0) {
                    arg0.field3412 = class269.method1904(arg0.field3404, var9.method1885(), var9.method1877(), var9.method1894());
                } else {
                    arg0.field3412 = class269.method1904(arg0.field3404, var9.method1885(), 0, var9.method1894());
                    this.field434.method1440(arg0.field3390.field753[arg0.field3388] < 0, -74, arg0);
                    arg0.field3412.method1892(var10, var9.method1877());
                }
                if (arg0.field3390.field753[arg0.field3388] < 0) {
                    arg0.field3412.method1880(-1);
                }
                var9.method1889(var10);
                var9.method232(arg2, arg1, arg4 - arg1);
                if (var9.method1898()) {
                    this.field444.method2342(var9);
                }
            }
        }
        arg0.field3412.method232(arg2, arg1, arg5);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 1203)
    public static void method238(int arg0) {
        if (arg0 != 0) {
            method238(-21);
        }
        field439 = null;
        field441 = null;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()Lkn;", line = 1223)
    public final class210 method239() {
        field435++;
        class218 var1 = (class218) this.field442.method268(-1);
        if (var1 == null) {
            return null;
        } else if (var1.field3412 == null) {
            return this.method233();
        } else {
            return var1.field3412;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()I", line = 1242)
    public final int method240() {
        field440++;
        return 0;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lka;)V", line = 1258)
    public class26(class201 arg0) {
        this.field434 = arg0;
    }
}
