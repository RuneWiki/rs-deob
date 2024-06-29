import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class212 implements class77 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Z")
    private boolean field3373 = false;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    private int field3376 = 50;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lce;")
    private class239 field3378;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Lce;")
    private class239 field3396;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Lch;")
    private class133 field3397;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "Lch;")
    private class133 field3405;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[S")
    private short[] field3369;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "[Z")
    private boolean[] field3406;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "[B")
    private byte[] field3385;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "[B")
    private byte[] field3370;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "[Z")
    private boolean[] field3408;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "[Z")
    private boolean[] field3374;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[Z")
    private boolean[] field3377;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "[B")
    private byte[] field3391;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[B")
    private byte[] field3375;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[Z")
    private boolean[] field3393;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lqd;")
    public static class40 field3381 = class147.method1106(":duelstake:", (byte) -52);

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "[I")
    public static int[] field3390 = new int[2048];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Lce;")
    public static class239 field3400;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIILrb;)V", line = 12)
    public static final void method1487(int arg0, int arg1, int arg2, int arg3, class213 arg4) {
        field3394++;
        class194.method1385(4);
        int var5 = 65 / ((74 - arg3) / 34);
        if (class21.field350) {
            class111.method847(arg0, arg1, arg0 + arg4.field3502, arg1 - -arg4.field3565);
        } else {
            class115.method870(arg0, arg1, arg0 + arg4.field3502, arg4.field3565 + arg1);
        }
        if (class44.field827 != 2 && class44.field827 != 5 && class252.field4189 != null) {
            int var6 = class108.field1893 + class309.field5191 & 0x7FF;
            int var7 = class255.field4233.field1531 / 32 + 48;
            int var8 = 464 - (class255.field4233.field1497 / 32);
            if (class21.field350) {
                ((class100) class252.field4189).method755(arg0, arg1, arg4.field3502, arg4.field3565, var7, var8, var6, class33.field662 + 256, (class100) arg4.method1505(false, 21730));
            } else {
                ((class99) class252.field4189).method745(arg0, arg1, arg4.field3502, arg4.field3565, var7, var8, var6, class33.field662 + 256, arg4.field3572, arg4.field3425);
            }
            if (class45.field880 != null) {
                for (int var9 = 0; var9 < class45.field880.field5275; var9++) {
                    if (class45.field880.method2159(-1, var9)) {
                        int var10 = (class45.field880.field5272[var9] - class196.field3152) * 4 + 2 - class255.field4233.field1531 / 32;
                        int var11 = class203.field3216[var6];
                        int var12 = (class45.field880.field5292[var9] - class263.field4407) * 4 + 2 - (class255.field4233.field1497 / 32);
                        int var13 = var11 * 256 / (class33.field662 + 256);
                        int var14 = class203.field3208[var6];
                        int var15 = var14 * 256 / (class33.field662 + 256);
                        int var16 = var10 * var13 + var12 * var15 >> 16;
                        class259 var17 = class49.field945;
                        if (class45.field880.method2163((byte) -86, var9) == 1) {
                            var17 = class146.field2428;
                        }
                        int var18 = var12 * var13 - var10 * var15 >> 16;
                        if (class45.field880.method2163((byte) 126, var9) == 2) {
                            var17 = class230.field3789;
                        }
                        int var19 = var17.method1838(class45.field880.field5291[var9], 100);
                        int var20 = var16 - var19 / 2;
                        if (-arg4.field3502 <= var20 && arg4.field3502 >= var20 && var18 >= (-arg4.field3565) && arg4.field3565 >= var18) {
                            int var21 = 16777215;
                            if (class45.field880.field5295[var9] != -1) {
                                var21 = class45.field880.field5295[var9];
                            }
                            if (class21.field350) {
                                class111.method840((class100) arg4.method1505(false, 21730));
                            } else {
                                class115.method867(arg4.field3572, arg4.field3425);
                            }
                            var17.method1820(class45.field880.field5291[var9], arg4.field3502 / 2 + arg0 + var20, arg4.field3565 / 2 + arg1 + -var18, var19, 50, var21, 0, 256, 1, 0, 0);
                            if (class21.field350) {
                                class111.method843();
                            } else {
                                class115.method872();
                            }
                        }
                    }
                }
            }
            for (int var22 = 0; var22 < class164.field2719; var22++) {
                int var23 = class94.field1702[var22] * 4 + 2 - class255.field4233.field1531 / 32;
                int var24 = class146.field2425[var22] * 4 + 2 - (class255.field4233.field1497 / 32);
                class27 var25 = class72.method540(0, class139.field2351[var22]);
                if (var25.field546 != null) {
                    var25 = var25.method258((byte) 25);
                    if (var25 == null || var25.field558 == -1) {
                        continue;
                    }
                }
                class78.method585(class165.field2727[var25.field558], 65534, arg4, arg1, arg0, var24, var23);
            }
            for (int var26 = 0; var26 < 104; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    class282 var28 = class51.field983[class160.field2671][var26][var27];
                    if (var28 != null) {
                        int var29 = var26 * 4 + 2 - (class255.field4233.field1531 / 32);
                        int var30 = var27 * 4 + 2 - (class255.field4233.field1497 / 32);
                        class78.method585(class96.field1738[0], 65534, arg4, arg1, arg0, var30, var29);
                    }
                }
            }
            for (int var31 = 0; var31 < class177.field2923; var31++) {
                class42 var32 = class91.field1656[class65.field1229[var31]];
                if (var32 != null && var32.method386(64)) {
                    class121 var33 = var32.field796;
                    if (var33 != null && var33.field2098 != null) {
                        var33 = var33.method918(-1);
                    }
                    if (var33 != null && var33.field2072 && var33.field2079) {
                        int var34 = var32.field1531 / 32 - (class255.field4233.field1531 / 32);
                        int var35 = var32.field1497 / 32 - (class255.field4233.field1497 / 32);
                        class78.method585(class96.field1738[1], 65534, arg4, arg1, arg0, var35, var34);
                    }
                }
            }
            for (int var36 = 0; var36 < class159.field2663; var36++) {
                class258 var37 = class298.field4979[field3390[var36]];
                if (var37 != null && var37.method386(64)) {
                    int var38 = var37.field1531 / 32 - (class255.field4233.field1531 / 32);
                    int var39 = var37.field1497 / 32 - (class255.field4233.field1497 / 32);
                    boolean var40 = false;
                    long var41 = var37.field4319.method362(-25194);
                    for (int var43 = 0; var43 < class233.field3844; var43++) {
                        if (class2.field20[var43] == var41 && class72.field1277[var43] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    for (int var45 = 0; var45 < class147.field2446; var45++) {
                        if (class276.field4603[var45].field5149 == var41) {
                            var44 = true;
                            break;
                        }
                    }
                    boolean var46 = false;
                    if (class255.field4233.field4308 != 0 && var37.field4308 != 0 && class255.field4233.field4308 == var37.field4308) {
                        var46 = true;
                    }
                    if (var40) {
                        class78.method585(class96.field1738[3], 65534, arg4, arg1, arg0, var39, var38);
                    } else if (var44) {
                        class78.method585(class96.field1738[5], 65534, arg4, arg1, arg0, var39, var38);
                    } else if (var46) {
                        class78.method585(class96.field1738[4], 65534, arg4, arg1, arg0, var39, var38);
                    } else {
                        class78.method585(class96.field1738[2], 65534, arg4, arg1, arg0, var39, var38);
                    }
                }
            }
            class189[] var47 = class276.field4608;
            for (int var48 = 0; var48 < var47.length; var48++) {
                class189 var49 = var47[var48];
                if (var49 != null && var49.field3064 != 0 && class256.field4266 % 20 < 10) {
                    if (var49.field3064 == 1 && var49.field3078 >= 0 && var49.field3078 < class91.field1656.length) {
                        class42 var50 = class91.field1656[var49.field3078];
                        if (var50 != null) {
                            int var51 = var50.field1531 / 32 - (class255.field4233.field1531 / 32);
                            int var52 = var50.field1497 / 32 - (class255.field4233.field1497 / 32);
                            class34.method297(var52, arg4, arg0, var51, true, var49.field3073, arg1);
                        }
                    }
                    if (var49.field3064 == 2) {
                        int var53 = (var49.field3071 - class196.field3152) * 4 + 2 - class255.field4233.field1531 / 32;
                        int var54 = (var49.field3076 - class263.field4407) * 4 + 2 - (class255.field4233.field1497 / 32);
                        class34.method297(var54, arg4, arg0, var53, true, var49.field3073, arg1);
                    }
                    if (var49.field3064 == 10 && var49.field3078 >= 0 && var49.field3078 < class298.field4979.length) {
                        class258 var55 = class298.field4979[var49.field3078];
                        if (var55 != null) {
                            int var56 = var55.field1531 / 32 - (class255.field4233.field1531 / 32);
                            int var57 = var55.field1497 / 32 - (class255.field4233.field1497 / 32);
                            class34.method297(var57, arg4, arg0, var56, true, var49.field3073, arg1);
                        }
                    }
                }
            }
            if (class185.field2985 != 0) {
                int var58 = class185.field2985 * 4 - (class255.field4233.field1531 / 32 - 2);
                int var59 = class170.field2794 * 4 + 2 - class255.field4233.field1497 / 32;
                class78.method585(class139.field2346, 65534, arg4, arg1, arg0, var59, var58);
            }
            if (class21.field350) {
                class111.method846(arg0 + (arg4.field3502 / 2) - 1, arg1 - (-(arg4.field3565 / 2) - -1), 3, 3, 16777215);
            } else {
                class115.method880(arg4.field3502 / 2 + arg0 - 1, arg4.field3565 / 2 - 1 + arg1, 3, 3, 16777215);
            }
        } else if (class21.field350) {
            class185 var60 = arg4.method1505(false, 21730);
            if (var60 != null) {
                var60.method744(arg0, arg1);
            }
        } else {
            class115.method860(arg0, arg1, 0, arg4.field3572, arg4.field3425);
        }
        class309.field5192[arg2] = true;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IFI)[I", line = 349)
    public final int[] method570(int arg0, float arg1, int arg2) {
        field3407++;
        if (arg0 <= 4) {
            method1489(31L, (byte) -13);
        }
        class254 var4 = this.method1498((byte) -105, arg2);
        if (var4 == null) {
            return null;
        } else {
            var4.field4198 = true;
            return var4.method1788(this.field3396, this.field3373 || this.field3377[arg2], arg1, (byte) -62, this);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLqd;)V", line = 368)
    public static final void method1488(byte arg0, class40 arg1) {
        if (arg0 >= -75) {
            field3400 = (class239) null;
        }
        class257.method1805(false, 0);
        field3404++;
        class150.method1122(arg1, (byte) -94);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JB)Lqd;", line = 381)
    public static final class40 method1489(long arg0, byte arg1) {
        class148.field2492.setTime(new Date(arg0));
        field3401++;
        int var3 = class148.field2492.get(7);
        int var4 = class148.field2492.get(5);
        if (arg1 != -114) {
            field3384 = -123;
        }
        int var5 = class148.field2492.get(2);
        int var6 = class148.field2492.get(1);
        int var7 = class148.field2492.get(11);
        int var8 = class148.field2492.get(12);
        int var9 = class148.field2492.get(13);
        return class153.method1192(new class40[] { class54.field1047[var3 - 1], class225.field3714, class276.method1927((byte) -75, var4 / 10), class276.method1927((byte) -107, var4 % 10), class73.field1295, class293.field4932[var5], class73.field1295, class276.method1927((byte) -67, var6), class73.field1294, class276.method1927((byte) -113, var7 / 10), class276.method1927((byte) -64, var7 % 10), class243.field4007, class276.method1927((byte) -117, var8 / 10), class276.method1927((byte) -123, var8 % 10), class243.field4007, class276.method1927((byte) -77, var9 / 10), class276.method1927((byte) -86, var9 % 10), class14.field234 }, (byte) -67);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 408)
    public static final void method1490(int arg0) {
        field3403++;
        if (class27.field523 == 187) {
            int var131 = class95.field1715.method243(255);
            int var132 = var131 & 0x3;
            int var133 = var131 >> 2;
            int var134 = class213.field3463[var133];
            int var135 = class95.field1715.method190((byte) 113);
            int var136 = (var135 >> 4 & 0x7) + class307.field5142;
            int var137 = (var135 & 0x7) + class269.field4478;
            if (var136 >= 0 && var137 >= 0 && var136 < 104 && var137 < 104) {
                class225.method1582(class160.field2671, var136, -1, 2, var137, var133, var132, var134, 0, -1);
            }
        } else if (class27.field523 == 241) {
            int var123 = class95.field1715.method243(255);
            int var124 = var123 >> 2;
            int var125 = class213.field3463[var124];
            int var126 = var123 & 0x3;
            int var127 = class95.field1715.method197(-1);
            if (var127 == 65535) {
                var127 = -1;
            }
            int var128 = class95.field1715.method226(255);
            int var129 = class269.field4478 + (var128 & 0x7);
            int var130 = ((var128 & 0x74) >> 4) + class307.field5142;
            class284.method1978(class160.field2671, var126, var130, var124, var125, true, var129, var127);
        } else if (class27.field523 == 227) {
            int var1 = class95.field1715.method204(2043908512);
            int var2 = (var1 >> 4 & 0x7) + class307.field5142;
            int var3 = class269.field4478 + (var1 & 0x7);
            int var4 = class95.field1715.method230((byte) -58);
            int var5 = class95.field1715.method197(-1);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class146 var6 = new class146();
                var6.field2423 = var4;
                var6.field2427 = var5;
                if (class51.field983[class160.field2671][var2][var3] == null) {
                    class51.field983[class160.field2671][var2][var3] = new class282();
                }
                class51.field983[class160.field2671][var2][var3].method1972(new class229(var6), 38);
                class185.method1337(false, var3, var2);
            }
        } else if (class27.field523 == 222) {
            int var114 = class95.field1715.method226(255);
            int var115 = ((var114 & 0x78) >> 4) + class307.field5142;
            int var116 = (var114 & 0x7) + class269.field4478;
            int var117 = class95.field1715.method197(-1);
            int var118 = class95.field1715.method197(-1);
            int var119 = class95.field1715.method197(-1);
            if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                class282 var120 = class51.field983[class160.field2671][var115][var116];
                if (var120 != null) {
                    for (class229 var121 = (class229) var120.method1971(100); var121 != null; var121 = (class229) var120.method1967(100)) {
                        class146 var122 = var121.field3786;
                        if ((var117 & 0x7FFF) == var122.field2423 && var122.field2427 == var118) {
                            var122.field2427 = var119;
                            break;
                        }
                    }
                    class185.method1337(false, var116, var115);
                }
            }
        } else if (class27.field523 == 101) {
            int var7 = class95.field1715.method226(255);
            int var8 = ((var7 & 0x70) >> 4) + class307.field5142;
            int var9 = (var7 & 0x7) + class269.field4478;
            int var10 = class95.field1715.method234(2193) + var8;
            int var11 = class95.field1715.method234(2193) + var9;
            int var12 = class95.field1715.method201(true);
            int var13 = class95.field1715.method197(-1);
            int var14 = class95.field1715.method226(255) * 4;
            int var15 = class95.field1715.method226(255) * 4;
            int var16 = class95.field1715.method197(-1);
            int var17 = class95.field1715.method197(-1);
            int var18 = class95.field1715.method226(255);
            int var19 = class95.field1715.method226(255);
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var13 != 65535) {
                int var20 = var8 * 128 + 64;
                int var21 = var10 * 128 + 64;
                int var22 = var11 * 128 + 64;
                int var23 = var9 * 128 + 64;
                class147 var24 = new class147(var13, class160.field2671, var20, var23, class293.method2012(class160.field2671, var23, 0, var20) - var14, class256.field4266 + var16, class256.field4266 + var17, var18, var19, var12, var15);
                var24.method1111(class256.field4266 + var16, -111, var22, var21, class293.method2012(class160.field2671, var22, 0, var21) - var15);
                class265.field4445.method1972(new class116(var24), 2);
            }
        } else if (class27.field523 == 210) {
            int var25 = class95.field1715.method226(255);
            int var26 = (var25 & 0x7) + class269.field4478;
            int var27 = class307.field5142 + (var25 >> 4 & 0x7);
            int var28 = class95.field1715.method197(-1);
            int var29 = class95.field1715.method226(255);
            int var30 = var29 & 0x7;
            if (var28 == 65535) {
                var28 = -1;
            }
            int var31 = class95.field1715.method226(255);
            int var32 = (var29 & 0xF7) >> 4;
            if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
                int var33 = var32 + 1;
                if (class255.field4233.field1489[0] >= var27 - var33 && var27 + var33 >= class255.field4233.field1489[0] && class255.field4233.field1532[0] >= (var26 - var33) && var26 + var33 >= class255.field4233.field1532[0] && class105.field1854 != 0 && var30 > 0 && class227.field3747 < 50 && var28 != -1) {
                    class78.field1324[class227.field3747] = var28;
                    class59.field1129[class227.field3747] = var30;
                    class307.field5146[class227.field3747] = var31;
                    class162.field2693[class227.field3747] = null;
                    class116.field1990[class227.field3747] = (var26 << 8) + (var27 << 16) + var32;
                    class227.field3747++;
                }
            }
        } else if (class27.field523 == 176) {
            int var34 = class95.field1715.method226(255);
            int var35 = (var34 >> 4 & 0x7) + class307.field5142;
            int var36 = (var34 & 0x7) + class269.field4478;
            int var37 = class95.field1715.method197(-1);
            int var38 = class95.field1715.method226(255);
            int var39 = class95.field1715.method197(-1);
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                int var40 = var35 * 128 + 64;
                int var41 = var36 * 128 + 64;
                class12 var42 = new class12(var37, class160.field2671, var40, var41, class293.method2012(class160.field2671, var41, 0, var40) - var38, var39, class256.field4266);
                class55.field1066.method1972(new class246(var42), -106);
            }
        } else if (class27.field523 == 214) {
            int var106 = class95.field1715.method204(2043908512);
            int var107 = var106 >> 2;
            int var108 = var106 & 0x3;
            int var109 = class213.field3463[var107];
            int var110 = class95.field1715.method197(-1);
            int var111 = class95.field1715.method243(255);
            int var112 = ((var111 & 0x7C) >> 4) + class307.field5142;
            int var113 = class269.field4478 + (var111 & 0x7);
            if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                class225.method1582(class160.field2671, var112, var110, 2, var113, var107, var108, var109, 0, -1);
            }
        } else if (class27.field523 == 186) {
            int var100 = class95.field1715.method208(-10556);
            int var101 = class95.field1715.method243(255);
            int var102 = class269.field4478 + (var101 & 0x7);
            int var103 = (var101 >> 4 & 0x7) + class307.field5142;
            if (var103 >= 0 && var102 >= 0 && var103 < 104 && var102 < 104) {
                class282 var104 = class51.field983[class160.field2671][var103][var102];
                if (var104 != null) {
                    for (class229 var105 = (class229) var104.method1971(100); var105 != null; var105 = (class229) var104.method1967(100)) {
                        if ((var100 & 0x7FFF) == var105.field3786.field2423) {
                            var105.method2095(0);
                            break;
                        }
                    }
                    if (var104.method1971(100) == null) {
                        class51.field983[class160.field2671][var103][var102] = null;
                    }
                    class185.method1337(false, var102, var103);
                }
            }
        } else {
            int var43 = 114 % ((arg0 + 66) / 53);
            if (class27.field523 == 179) {
                byte var44 = class95.field1715.method250(true);
                int var45 = class95.field1715.method230((byte) -58);
                byte var46 = class95.field1715.method205(-108);
                int var47 = class95.field1715.method204(2043908512);
                int var48 = var47 >> 2;
                int var49 = class213.field3463[var48];
                int var50 = class95.field1715.method216((byte) -127);
                int var51 = var47 & 0x3;
                int var52 = class95.field1715.method243(255);
                int var53 = class269.field4478 + (var52 & 0x7);
                int var54 = (var52 >> 4 & 0x7) + class307.field5142;
                int var55 = class95.field1715.method216((byte) -126);
                byte var56 = class95.field1715.method205(-78);
                byte var57 = class95.field1715.method250(true);
                int var58 = class95.field1715.method197(-1);
                class258 var59;
                if (class289.field4842 == var50) {
                    var59 = class255.field4233;
                } else {
                    var59 = class298.field4979[var50];
                }
                if (!class21.field350 && var59 != null) {
                    class27 var60 = class72.method540(0, var58);
                    int var61;
                    int var62;
                    if (var51 == 1 || var51 == 3) {
                        var61 = var60.field519;
                        var62 = var60.field568;
                    } else {
                        var61 = var60.field568;
                        var62 = var60.field519;
                    }
                    int var63 = (var61 >> 1) + var53;
                    int var64 = (var62 >> 1) + var54;
                    int var65 = (var62 + 1 >> 1) + var54;
                    int var66 = (var61 + 1 >> 1) + var53;
                    int[][] var67 = (int[][]) null;
                    int var68 = (var54 << 7) + (var62 << 6);
                    int[][] var69 = class78.field1316[class160.field2671];
                    if (class160.field2671 < 3) {
                        var67 = class78.field1316[class160.field2671 + 1];
                    }
                    int var70 = var69[var64][var63] + var69[var65][var66] + var69[var64][var66] + var69[var65][var63] >> 2;
                    int var71 = (var53 << 7) + (var61 << 6);
                    class294 var72 = var60.method257(var67, var48, var68, -128, var51, var70, var69, (class114) null, false, var71, var60.field583);
                    if (var72 != null) {
                        if (var46 > var57) {
                            byte var73 = var46;
                            var46 = var57;
                            var57 = var73;
                        }
                        class225.method1582(class160.field2671, var54, -1, 2, var53, 0, 0, var49, var45 + 1, var55 - -1);
                        var59.field4304 = class256.field4266 + var55;
                        if (var44 > var56) {
                            byte var74 = var44;
                            var44 = var56;
                            var56 = var74;
                        }
                        var59.field4295 = var46 + var54;
                        var59.field4305 = (class266) var72.field4941;
                        var59.field4321 = var54 + var57;
                        var59.field4302 = var53 + var44;
                        var59.field4310 = var54 * 128 + (var62 * 64);
                        var59.field4297 = var70;
                        var59.field4311 = var53 + var56;
                        var59.field4313 = var45 + class256.field4266;
                        var59.field4309 = var53 * 128 + var61 * 64;
                    }
                }
            }
            if (class27.field523 == 24) {
                int var93 = class95.field1715.method243(255);
                int var94 = ((var93 & 0x7C) >> 4) + class307.field5142;
                int var95 = class269.field4478 + (var93 & 0x7);
                int var96 = class95.field1715.method197(-1);
                int var97 = class95.field1715.method216((byte) -125);
                int var98 = class95.field1715.method208(-10556);
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && class289.field4842 != var97) {
                    class146 var99 = new class146();
                    var99.field2423 = var96;
                    var99.field2427 = var98;
                    if (class51.field983[class160.field2671][var94][var95] == null) {
                        class51.field983[class160.field2671][var94][var95] = new class282();
                    }
                    class51.field983[class160.field2671][var94][var95].method1972(new class229(var99), 2);
                    class185.method1337(false, var95, var94);
                }
            } else if (class27.field523 == 105) {
                int var75 = class95.field1715.method226(255);
                int var76 = (var75 >> 4 & 0xF) + class307.field5142 * 2;
                int var77 = (var75 & 0xF) + class269.field4478 * 2;
                int var78 = var76 + class95.field1715.method234(2193);
                int var79 = class95.field1715.method234(2193) + var77;
                int var80 = class95.field1715.method201(true);
                int var81 = class95.field1715.method197(-1);
                int var82 = class95.field1715.method226(255) * 4;
                int var83 = class95.field1715.method226(255) * 4;
                int var84 = class95.field1715.method197(-1);
                int var85 = class95.field1715.method197(-1);
                int var86 = class95.field1715.method226(255);
                int var87 = class95.field1715.method226(255);
                if (var76 >= 0 && var77 >= 0 && var76 < 208 && var77 < 208 && var78 >= 0 && var79 >= 0 && var78 < 208 && var79 < 208 && var81 != 65535) {
                    int var88 = var77 * 64;
                    int var89 = var78 * 64;
                    int var90 = var79 * 64;
                    int var91 = var76 * 64;
                    class147 var92 = new class147(var81, class160.field2671, var91, var88, class293.method2012(class160.field2671, var88, 0, var91) - var82, class256.field4266 + var84, class256.field4266 + var85, var86, var87, var80, var83);
                    var92.method1111(class256.field4266 + var84, -118, var90, var89, class293.method2012(class160.field2671, var90, 0, var89) - var83);
                    class265.field4445.method1972(new class116(var92), 20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "(II)I", line = 960)
    public final int method577(int arg0, int arg1) {
        if (arg0 > -108) {
            this.method1495(-94, -54);
        }
        field3379++;
        return this.field3385[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lce;Lce;Lce;IZ)V", line = 1322)
    public class212(class239 arg0, class239 arg1, class239 arg2, int arg3, boolean arg4) {
        this.field3378 = arg0;
        this.field3373 = arg4;
        this.field3396 = arg2;
        this.field3376 = arg3;
        this.field3397 = new class133(this.field3376);
        if (class21.field350) {
            this.field3405 = new class133(this.field3376);
        } else {
            this.field3405 = null;
        }
        class26 var6 = new class26(arg1.method1651(0, 0, -1));
        int var7 = var6.method197(-1);
        this.field3369 = new short[var7];
        this.field3406 = new boolean[var7];
        this.field3385 = new byte[var7];
        this.field3370 = new byte[var7];
        this.field3408 = new boolean[var7];
        this.field3374 = new boolean[var7];
        this.field3377 = new boolean[var7];
        this.field3391 = new byte[var7];
        this.field3375 = new byte[var7];
        this.field3393 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3406[var8] = var6.method226(255) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3406[var9]) {
                this.field3393[var9] = var6.method226(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3406[var10]) {
                this.field3374[var10] = var6.method226(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3406[var11]) {
                this.field3377[var11] = var6.method226(255) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3406[var12]) {
                this.field3408[var12] = var6.method226(255) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3406[var13]) {
                this.field3370[var13] = var6.method234(2193);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3406[var14]) {
                this.field3391[var14] = var6.method234(2193);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3406[var15]) {
                this.field3375[var15] = var6.method234(2193);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3406[var16]) {
                this.field3385[var16] = var6.method234(2193);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3406[var17]) {
                this.field3369[var17] = (short) var6.method197(-1);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "(II)[I", line = 978)
    public final int[] method578(int arg0, int arg1) {
        field3402++;
        class254 var3 = this.method1498((byte) -105, arg1);
        if (arg0 == 0) {
            return var3 == null ? null : var3.method1792((byte) -75, this, this.field3373 || this.field3377[arg1], this.field3396);
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 998)
    public static void method1491(int arg0) {
        field3381 = null;
        field3400 = null;
        field3390 = null;
        if (arg0 >= -39) {
            method1491(80);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)I", line = 1011)
    public final int method571(byte arg0, int arg1) {
        field3371++;
        if (arg0 >= -32) {
            this.method571((byte) 57, 2);
        }
        return this.field3375[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V", line = 1048)
    public final void method1492(boolean arg0, int arg1) {
        field3389++;
        if (arg1 != 2) {
            this.method577(-40, 83);
        }
        this.field3373 = arg0;
        this.method1496((byte) -30);
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(II)Z", line = 1061)
    public final boolean method572(int arg0, int arg1) {
        field3383++;
        int var3 = 6 / ((arg0 + 70) / 32);
        return this.field3408[arg1];
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(BI)V", line = 1071)
    public final void method1493(byte arg0, int arg1) {
        this.field3376 = arg1;
        field3372++;
        this.field3397 = new class133(this.field3376);
        if (arg0 != 87) {
            this.field3393 = (boolean[]) null;
        }
        if (class21.field350) {
            this.field3405 = new class133(this.field3376);
        } else {
            this.field3405 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(II)Z", line = 1090)
    public final boolean method576(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method578(20, 47);
        }
        field3392++;
        class254 var3 = this.method1498((byte) -105, arg1);
        return var3 == null ? false : var3.method1786(this.field3396, this, 4);
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(II)I", line = 1107)
    public final int method569(int arg0, int arg1) {
        field3382++;
        if (arg0 >= -11) {
            this.field3374 = (boolean[]) null;
        }
        return this.field3370[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V", line = 1118)
    public final void method567(int arg0, int arg1) {
        field3387++;
        class60.method504(this.field3385[arg1] & 0xFF, this.field3375[arg1] & 0xFF, 20789);
        boolean var3 = false;
        class254 var4 = this.method1498((byte) -105, arg1);
        if (var4 != null) {
            var3 = var4.method1791(false, this, this.field3373 || this.field3377[arg1], this.field3396);
        }
        if (arg0 != 10) {
            field3390 = (int[]) null;
        }
        if (!var3) {
            class182 var5 = this.method1495(arg0 - 84, arg1);
            var5.method1327((byte) 80);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(ZI)Z", line = 1149)
    public static final boolean method1494(boolean arg0, int arg1) {
        field3386++;
        if (arg0) {
            field3384 = 124;
        }
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)Z", line = 1165)
    public final boolean method568(int arg0, int arg1) {
        field3410++;
        if (arg1 != 104) {
            this.field3405 = (class133) null;
        }
        return this.field3393[arg0];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I", line = 1176)
    public final int method566(int arg0, int arg1) {
        if (arg0 >= -25) {
            field3384 = -71;
        }
        field3395++;
        return this.field3369[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "(II)Luc;", line = 1189)
    private final class182 method1495(int arg0, int arg1) {
        if (arg0 >= -67) {
            this.field3375 = (byte[]) null;
        }
        field3367++;
        class182 var3 = (class182) this.field3405.method984(0, (long) arg1);
        if (var3 == null) {
            class182 var4 = new class182(this.field3369[arg1] & 0xFFFF);
            this.field3405.method982(var4, (long) arg1, (byte) 79);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(II)Z", line = 1207)
    public final boolean method573(int arg0, int arg1) {
        field3409++;
        if (arg1 != -8850) {
            method1487(-33, -32, -9, 51, (class213) null);
        }
        return this.field3374[arg0];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 1220)
    public final void method1496(byte arg0) {
        this.field3397.method985(58);
        if (arg0 != -30) {
            this.method1495(-99, -119);
        }
        field3399++;
        if (this.field3405 != null) {
            this.field3405.method985(-25);
        }
    }

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "(II)V", line = 1234)
    public final void method1497(int arg0, int arg1) {
        field3368++;
        if (arg0 != 6005) {
            this.method567(51, 24);
        }
        for (class254 var3 = (class254) this.field3397.method981(0); var3 != null; var3 = (class254) this.field3397.method988((byte) -113)) {
            if (var3.field4198) {
                var3.method1790(arg1, 25089);
                var3.field4198 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(BI)Lwi;", line = 1271)
    private final class254 method1498(byte arg0, int arg1) {
        field3398++;
        class254 var3 = (class254) this.field3397.method984(0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        if (arg0 != -105) {
            method1491(66);
        }
        byte[] var4 = this.field3378.method1651(arg1, 0, -1);
        if (var4 == null) {
            return null;
        } else {
            class26 var5 = new class26(var4);
            class254 var6 = new class254(var5);
            this.field3397.method982(var6, (long) arg1, (byte) 79);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(II)Z", line = 1295)
    public final boolean method575(int arg0, int arg1) {
        if (arg0 == 0) {
            field3380++;
            return this.field3373 || this.field3377[arg1];
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(II)I", line = 1311)
    public final int method574(int arg0, int arg1) {
        int var3 = -24 % ((arg1 - 58) / 41);
        field3388++;
        return this.field3391[arg0] & 0xFF;
    }
}
