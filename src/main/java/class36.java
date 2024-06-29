import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class36 extends class152 {

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    private int field528 = 4096;

    @OriginalMember(owner = "client!rf", name = "kb", descriptor = "I")
    private int field538 = 0;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "[I")
    public static int[] field519 = new int[100];

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "Lce;")
    public static class126 field524 = null;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static volatile int field526 = -1;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    public static int field525 = 0;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field527 = 0;

    @OriginalMember(owner = "client!rf", name = "jb", descriptor = "Lce;")
    public static class126 field537 = class206.method1445(-7923, "Null");

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    public static int field529 = 0;

    @OriginalMember(owner = "client!rf", name = "ib", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!rf", name = "lb", descriptor = "B")
    public static byte field539;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!rf", name = "gb", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!rf", name = "hb", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!rf", name = "mb", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V", line = 6)
    public static void method195(int arg0) {
        field524 = null;
        field519 = null;
        if (arg0 != 2) {
            field537 = (class126) null;
        }
        field537 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 29)
    public class36() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(III)I", line = 34)
    public static final int method196(int arg0, int arg1, int arg2) {
        field530++;
        int var3 = (class252.method1710(4, arg1 + 91923, arg2 + 45365, 16) + (class252.method1710(2, arg1 + 37821, arg2 + 10294, 16) - 128 >> 1) + (class252.method1710(1, arg1, arg2, 16) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        int var5 = -33 / ((-arg0 - 64) / 52);
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Z", line = 56)
    public static final boolean method197(byte arg0, int arg1) {
        field520++;
        if (arg0 == -104) {
            return (arg1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIZFIII)[I", line = 73)
    public static final int[] method198(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5, int arg6, int arg7) {
        field534++;
        int[] var8 = new int[arg6];
        class91 var9 = new class91();
        var9.field1436 = (int) (arg4 * 4096.0F);
        var9.field1440 = arg3;
        var9.field1430 = arg1;
        if (arg0 != 2) {
            return (int[]) null;
        }
        var9.field1438 = arg5;
        var9.field1442 = arg7;
        var9.field1433 = arg2;
        var9.method2((byte) 72);
        class320.method2228(1, arg6, -46);
        var9.method633(var8, 0, true);
        return var8;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILbb;)V", line = 96)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field532++;
        if (arg1 == 0) {
            this.field538 = arg2.method942(true);
        } else if (arg1 == 1) {
            this.field528 = arg2.method942(true);
        } else if (arg1 == 2) {
            this.field2781 = arg2.method948(arg0 ^ 0xFFFFFF8A) == 1;
        }
        if (arg0 != 8) {
            method196(119, -71, -16);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)[I", line = 147)
    public final int[] method6(boolean arg0, int arg1) {
        field540++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (!arg0) {
            field527 = 77;
        }
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(arg1, 69, 0);
            for (int var5 = 0; var5 < class244.field4133; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field538) {
                    var3[var5] = this.field538;
                } else if (this.field528 < var6) {
                    var3[var5] = this.field528;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)Z", line = 192)
    public static final boolean method199(boolean arg0) throws IOException {
        field533++;
        if (class59.field953 == null) {
            return false;
        }
        int var1 = class59.field953.method1939((byte) 86);
        if (var1 == 0) {
            return false;
        }
        if (class122.field2051 == -1) {
            class59.field953.method1935(0, class227.field3834.field2282, 1, -1);
            class227.field3834.field2299 = 0;
            class122.field2051 = class227.field3834.method1234(7);
            class315.field5404 = class175.field3096[class122.field2051];
            var1--;
        }
        if (class315.field5404 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class59.field953.method1935(0, class227.field3834.field2282, 1, -1);
            class315.field5404 = class227.field3834.field2282[0] & 0xFF;
            var1--;
        }
        if (class315.field5404 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class59.field953.method1935(0, class227.field3834.field2282, 2, -1);
            class227.field3834.field2299 = 0;
            class315.field5404 = class227.field3834.method942(true);
        }
        if (class315.field5404 > var1) {
            return false;
        }
        class227.field3834.field2299 = 0;
        class59.field953.method1935(0, class227.field3834.field2282, class315.field5404, -1);
        class218.field3663 = 0;
        class189.field3249 = class17.field231;
        class17.field231 = class152.field2769;
        class152.field2769 = class122.field2051;
        if (class122.field2051 == 73) {
            int var352 = class227.field3834.method954((byte) 95);
            int var353 = class227.field3834.method942(true);
            int var354 = class227.field3834.method932(65);
            if (class229.method1556((byte) 42, var353)) {
                class15.method84(1, var354, var352);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 24) {
            int var349 = class227.field3834.method971(12);
            int var350 = class227.field3834.method942(true);
            class126 var351 = class227.field3834.method970(1);
            if (class229.method1556((byte) 42, var349)) {
                class44.method275(0, var350, var351);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 142) {
            int var347 = class227.field3834.method932(110);
            int var348 = class227.field3834.method937(3);
            class227.method1549(var348, -1, var347);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 39) {
            class224.field3777 = class227.field3834.method966(97);
            class124.field2102 = class227.field3834.method948(-126);
            while (class227.field3834.field2299 < class315.field5404) {
                class122.field2051 = class227.field3834.method948(-128);
                class51.method322((byte) 62);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 182) {
            class118.method773(true, 121);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 63 || class122.field2051 == 139 || class122.field2051 == 116 || class122.field2051 == 12 || class122.field2051 == 92 || class122.field2051 == 128 || class122.field2051 == 42 || class122.field2051 == 38 || class122.field2051 == 79 || class122.field2051 == 99 || class122.field2051 == 15 || class122.field2051 == 156) {
            class51.method322((byte) 62);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 34) {
            class126 var344 = class227.field3834.method970(1);
            int var345 = class227.field3834.method954((byte) 80);
            int var346 = class227.field3834.method942(true);
            if (class229.method1556((byte) 42, var346)) {
                class81.method579(var344, (byte) 78, var345);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 207) {
            int var2 = class227.field3834.method932(109);
            int var3 = class227.field3834.method954((byte) 63);
            int var4 = var3 >> 28 & 0x3;
            if (var2 == 65535) {
                var2 = -1;
            }
            int var5 = (var3 & 0xFFFE829) >> 14;
            int var6 = var3 & 0x3FFF;
            int var7 = class227.field3834.method928((byte) -25);
            int var8 = var7 >> 2;
            int var9 = var6 - class138.field2473;
            int var10 = var7 & 0x3;
            int var11 = var5 - class58.field914;
            int var12 = class132.field2266[var8];
            class84.method592(var2, var10, var9, -104, var11, var12, var4, var8);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 162) {
            long var328 = class227.field3834.method939(-642283040);
            class227.field3834.method977(19773);
            long var330 = class227.field3834.method939(-642283040);
            long var332 = (long) class227.field3834.method942(!arg0);
            long var334 = (long) class227.field3834.method949(20732);
            int var336 = class227.field3834.method948(-124);
            boolean var337 = false;
            long var338 = (var332 << 32) + var334;
            int var340 = class227.field3834.method942(true);
            int var341 = 0;
            label1651: while (true) {
                if (var341 >= 100) {
                    if (var336 <= 1) {
                        for (int var342 = 0; var342 < class116.field1961; var342++) {
                            if (class163.field2922[var342] == var328) {
                                var337 = true;
                                break label1651;
                            }
                        }
                    }
                    break;
                }
                if (class259.field4353[var341] == var338) {
                    var337 = true;
                    break;
                }
                var341++;
            }
            if (!var337 && class238.field4025 == 0) {
                class259.field4353[class4.field25] = var338;
                class4.field25 = (class4.field25 + 1) % 100;
                class126 var343 = class241.method1665(var340, (byte) -53).method1512(class227.field3834, 21622);
                if (var336 == 2 || var336 == 3) {
                    client.method807(class250.method1696(arg0, var330).method869(-34), var343, 92, 20, class12.method69(new class126[] { class169.field3004, class250.method1696(arg0, var328).method869(123) }, (byte) 118), var340);
                } else if (var336 == 1) {
                    client.method807(class250.method1696(false, var330).method869(126), var343, 25, 20, class12.method69(new class126[] { class300.field4976, class250.method1696(false, var328).method869(-97) }, (byte) 123), var340);
                } else {
                    client.method807(class250.method1696(false, var330).method869(124), var343, 68, 20, class250.method1696(arg0, var328).method869(-65), var340);
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 155) {
            int var325 = class227.field3834.method948(-121);
            int var326 = class227.field3834.method966(57);
            int var327 = class227.field3834.method966(35);
            class131.field2250 = var326 >> 1;
            class286.field4744.method2027(var327, (var326 & 0x1) == 1, var325, 0);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 59) {
            class219.method1498((byte) 101);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 109) {
            long var322 = class227.field3834.method939(-642283040);
            class126 var324 = class312.method2150(class173.method1258(class227.field3834, 93).method842((byte) -55));
            class73.method530(class250.method1696(false, var322).method869(123), (byte) 89, 6, var324);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 40) {
            int var13 = class227.field3834.method982((byte) 68);
            int var14 = class227.field3834.method982((byte) 66);
            int var15 = class227.field3834.method966(62);
            if (class229.method1556((byte) 42, var14)) {
                if (var15 == 2) {
                    class39.method248(false);
                }
                class182.field3162 = var13;
                class229.method1559(var13, -115);
                class100.method679(false, -14575);
                class122.method800(1, class182.field3162);
                for (int var16 = 0; var16 < 100; var16++) {
                    class220.field3698[var16] = true;
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 31) {
            int var17 = class227.field3834.method971(13);
            class270.method1817((byte) -96, var17);
            class180.field3135[class47.method289(class176.field3101++, 31)] = class47.method289(32767, var17);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 129) {
            int var18 = class227.field3834.method937(3);
            int var19 = class227.field3834.method932(119);
            int var20 = class227.field3834.method928((byte) -37);
            int var21 = class227.field3834.method982((byte) 74);
            if (class229.method1556((byte) 42, var19)) {
                class65 var22 = (class65) class16.field222.method1631(arg0, (long) var18);
                if (var22 != null) {
                    class257.method1744(var22, 1819444368, var22.field1097 != var21);
                }
                class174.method1266(var20, var21, (byte) 62, var18);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 46) {
            int var23 = class227.field3834.method937(3);
            int var24 = class227.field3834.method932(63);
            int var25 = class227.field3834.method982((byte) 86);
            int var26 = class227.field3834.method942(true);
            if ((var23 >> 30) != 0) {
                int var37 = var23 >> 28 & 0x3;
                int var38 = ((var23 & 0xFFFCF34) >> 14) - class58.field914;
                int var39 = (var23 & 0x3FFF) - class138.field2473;
                if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                    int var40 = var39 * 128 + 64;
                    int var41 = var38 * 128 + 64;
                    class238 var42 = new class238(var25, var37, var41, var40, class174.method1265(var40, 8100, var37, var41) - var24, var26, class249.field4174);
                    class63.field1037.method899(new class288(var42), -28);
                }
            } else if (var23 >> 29 != 0) {
                int var27 = var23 & 0xFFFF;
                class89 var28 = class199.field3391[var27];
                if (var28 != null) {
                    if (var25 == 65535) {
                        var25 = -1;
                    }
                    boolean var29 = true;
                    if (var25 != -1 && var28.field2445 != -1 && class110.method721(-125, class173.method1261(false, var25).field2976).field4878 < class110.method721(-126, class173.method1261(arg0, var28.field2445).field2976).field4878) {
                        var29 = false;
                    }
                    if (var29) {
                        var28.field2495 = var24;
                        var28.field2439 = 0;
                        var28.field2466 = class249.field4174 + var26;
                        var28.field2445 = var25;
                        var28.field2477 = 0;
                        if (var28.field2466 > class249.field4174) {
                            var28.field2477 = -1;
                        }
                        if (var28.field2445 != -1 && class249.field4174 == var28.field2466) {
                            int var30 = class173.method1261(arg0, var28.field2445).field2976;
                            if (var30 != -1) {
                                class294 var31 = class110.method721(-127, var30);
                                if (var31 != null && var31.field4890 != null) {
                                    class241.method1660(0, var28.field2461, false, var28.field2487, var31, (byte) -77);
                                }
                            }
                        }
                    }
                }
            } else if (var23 >> 28 != 0) {
                int var32 = var23 & 0xFFFF;
                class301 var33;
                if (class11.field145 == var32) {
                    var33 = class286.field4744;
                } else {
                    var33 = class85.field1352[var32];
                }
                if (var33 != null) {
                    boolean var34 = true;
                    if (var25 == 65535) {
                        var25 = -1;
                    }
                    if (var25 != -1 && var33.field2445 != -1 && class110.method721(-125, class173.method1261(false, var25).field2976).field4878 < class110.method721(-125, class173.method1261(arg0, var33.field2445).field2976).field4878) {
                        var34 = false;
                    }
                    if (var34) {
                        var33.field2439 = 0;
                        var33.field2495 = var24;
                        var33.field2445 = var25;
                        var33.field2477 = 0;
                        if (var33.field2445 == 65535) {
                            var33.field2445 = -1;
                        }
                        var33.field2466 = class249.field4174 + var26;
                        if (var33.field2466 > class249.field4174) {
                            var33.field2477 = -1;
                        }
                        if (var33.field2445 != -1 && class249.field4174 == var33.field2466) {
                            int var35 = class173.method1261(false, var33.field2445).field2976;
                            if (var35 != -1) {
                                class294 var36 = class110.method721(-128, var35);
                                if (var36 != null && var36.field4890 != null) {
                                    class241.method1660(0, var33.field2461, class286.field4744 == var33, var33.field2487, var36, (byte) -96);
                                }
                            }
                        }
                    }
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 196) {
            int var317 = class227.field3834.method971(-108);
            int var318 = class227.field3834.method932(110);
            int var319 = class227.field3834.method932(84);
            int var320 = class227.field3834.method937(3);
            int var321 = class227.field3834.method942(!arg0);
            if (class229.method1556((byte) 42, var321)) {
                class241.method1647(var319, var317, var320, var318, 8);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 231) {
            class293.field4869 = class227.field3834.method971(-125) * 30;
            class45.field700 = class50.field777;
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 184) {
            int var43 = class227.field3834.method982((byte) 98);
            int var44 = class227.field3834.method982((byte) 116);
            int var45 = class227.field3834.method966(30);
            if (class229.method1556((byte) 42, var44)) {
                class15.method84(1, var43, var45);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 234) {
            class189.method1356((byte) -103);
            class122.field2051 = -1;
            return false;
        } else if (class122.field2051 == 35) {
            int var314 = class227.field3834.method942(true);
            if (var314 == 65535) {
                var314 = -1;
            }
            int var315 = class227.field3834.method948(-121);
            int var316 = class227.field3834.method942(true);
            class221.method1517(var315, var314, 566320496, var316);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 114) {
            int var311 = class227.field3834.method932(95);
            int var312 = class227.field3834.method957(496113200);
            int var313 = class227.field3834.method971(125);
            if (class229.method1556((byte) 42, var311)) {
                class195.method1384(var313, var312, 103);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 246) {
            class116.field1961 = class315.field5404 / 8;
            for (int var46 = 0; var46 < class116.field1961; var46++) {
                class163.field2922[var46] = class227.field3834.method939(-642283040);
                class112.field1887[var46] = class250.method1696(arg0, class163.field2922[var46]);
            }
            class122.field2051 = -1;
            class130.field2227 = class50.field777;
            return true;
        } else if (class122.field2051 == 149) {
            long var297 = class227.field3834.method939(-642283040);
            long var299 = (long) class227.field3834.method942(!arg0);
            long var301 = (long) class227.field3834.method949(20732);
            long var303 = (var299 << 32) + var301;
            boolean var305 = false;
            int var306 = class227.field3834.method948(-121);
            int var307 = class227.field3834.method942(true);
            int var308 = 0;
            label1623: while (true) {
                if (var308 >= 100) {
                    if (var306 <= 1) {
                        for (int var309 = 0; var309 < class116.field1961; var309++) {
                            if (class163.field2922[var309] == var297) {
                                var305 = true;
                                break label1623;
                            }
                        }
                    }
                    break;
                }
                if (class259.field4353[var308] == var303) {
                    var305 = true;
                    break;
                }
                var308++;
            }
            if (!var305 && class238.field4025 == 0) {
                class259.field4353[class4.field25] = var303;
                class4.field25 = (class4.field25 + 1) % 100;
                class126 var310 = class241.method1665(var307, (byte) -53).method1512(class227.field3834, 21622);
                if (var306 == 2) {
                    client.method807((class126) null, var310, -102, 18, class12.method69(new class126[] { class169.field3004, class250.method1696(false, var297).method869(125) }, (byte) 115), var307);
                } else if (var306 == 1) {
                    client.method807((class126) null, var310, 24, 18, class12.method69(new class126[] { class300.field4976, class250.method1696(arg0, var297).method869(-53) }, (byte) 115), var307);
                } else {
                    client.method807((class126) null, var310, 60, 18, class250.method1696(false, var297).method869(-123), var307);
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 90) {
            int var295 = class227.field3834.method942(true);
            int var296 = class227.field3834.method982((byte) 97);
            class144.field2618 = var296;
            class292.field4832 = var295;
            if (class254.field4261 == 2) {
                class102.field1640 = class292.field4832;
                class29.field404 = class144.field2618;
            }
            class234.method1592((byte) -93);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 183) {
            class28.method132(class227.field3834, class161.field2907, class315.field5404, -61);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 30) {
            class126 var254 = class227.field3834.method970(1);
            if (var254.method848(-121, class40.field644)) {
                class126 var290 = var254.method859(var254.method875(class229.field3863, -126), 72, 0);
                long var291 = var290.method845((byte) -128);
                boolean var293 = false;
                for (int var294 = 0; var294 < class116.field1961; var294++) {
                    if (class163.field2922[var294] == var291) {
                        var293 = true;
                        break;
                    }
                }
                if (!var293 && class238.field4025 == 0) {
                    class73.method530(var290, (byte) 124, 4, class81.field1308);
                }
            } else if (var254.method848(-89, class142.field2583)) {
                class126 var255 = var254.method859(var254.method875(class229.field3863, -66), 70, 0);
                long var256 = var255.method845((byte) -122);
                boolean var258 = false;
                for (int var259 = 0; var259 < class116.field1961; var259++) {
                    if (class163.field2922[var259] == var256) {
                        var258 = true;
                        break;
                    }
                }
                if (!var258 && class238.field4025 == 0) {
                    class126 var260 = var254.method859(var254.method878((byte) 64) - 9, 103, var254.method875(class229.field3863, -53) + 1);
                    class73.method530(var255, (byte) 99, 8, var260);
                }
            } else if (var254.method848(-86, class321.field5493)) {
                class126 var261 = var254.method859(var254.method875(class229.field3863, -20), 96, 0);
                boolean var262 = false;
                long var263 = var261.method845((byte) -120);
                for (int var265 = 0; var265 < class116.field1961; var265++) {
                    if (class163.field2922[var265] == var263) {
                        var262 = true;
                        break;
                    }
                }
                if (!var262 && class238.field4025 == 0) {
                    class73.method530(var261, (byte) 82, 10, class224.field3772);
                }
            } else if (var254.method848(-61, class18.field244)) {
                class126 var266 = var254.method859(var254.method875(class18.field244, -114), 78, 0);
                class73.method530(class224.field3772, (byte) 112, 11, var266);
            } else if (var254.method848(-117, class40.field639)) {
                class126 var289 = var254.method859(var254.method875(class40.field639, -56), -93, 0);
                if (class238.field4025 == 0) {
                    class73.method530(class224.field3772, (byte) 92, 12, var289);
                }
            } else if (var254.method848(-75, class227.field3831)) {
                class126 var267 = var254.method859(var254.method875(class227.field3831, -19), -101, 0);
                if (class238.field4025 == 0) {
                    class73.method530(class224.field3772, (byte) 117, 13, var267);
                }
            } else if (var254.method848(-97, class223.field3765)) {
                class126 var284 = var254.method859(var254.method875(class229.field3863, -34), -123, 0);
                boolean var285 = false;
                long var286 = var284.method845((byte) -121);
                for (int var288 = 0; var288 < class116.field1961; var288++) {
                    if (class163.field2922[var288] == var286) {
                        var285 = true;
                        break;
                    }
                }
                if (!var285 && class238.field4025 == 0) {
                    class73.method530(var284, (byte) 90, 14, class224.field3772);
                }
            } else if (var254.method848(75, class93.field1453)) {
                class126 var268 = var254.method859(var254.method875(class229.field3863, -69), -111, 0);
                long var269 = var268.method845((byte) -127);
                boolean var271 = false;
                for (int var272 = 0; var272 < class116.field1961; var272++) {
                    if (class163.field2922[var272] == var269) {
                        var271 = true;
                        break;
                    }
                }
                if (!var271 && class238.field4025 == 0) {
                    class73.method530(var268, (byte) 99, 15, class224.field3772);
                }
            } else if (var254.method848(110, class274.field4607)) {
                boolean var279 = false;
                class126 var280 = var254.method859(var254.method875(class229.field3863, -39), -124, 0);
                long var281 = var280.method845((byte) -118);
                for (int var283 = 0; var283 < class116.field1961; var283++) {
                    if (class163.field2922[var283] == var281) {
                        var279 = true;
                        break;
                    }
                }
                if (!var279 && class238.field4025 == 0) {
                    class73.method530(var280, (byte) 96, 16, class224.field3772);
                }
            } else if (var254.method848(-127, class44.field683)) {
                class126 var273 = var254.method859(var254.method875(class229.field3863, -20), 80, 0);
                long var274 = var273.method845((byte) -119);
                boolean var276 = false;
                for (int var277 = 0; var277 < class116.field1961; var277++) {
                    if (class163.field2922[var277] == var274) {
                        var276 = true;
                        break;
                    }
                }
                if (!var276 && class238.field4025 == 0) {
                    class126 var278 = var254.method859(var254.method878((byte) 41) - 9, -105, var254.method875(class229.field3863, -23) + 1);
                    class73.method530(var273, (byte) 84, 21, var278);
                }
            } else {
                class73.method530(class224.field3772, (byte) 111, 0, var254);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 164) {
            class182.field3175 = class227.field3834.method948(-125);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 233) {
            int var246 = class227.field3834.method957(496113200);
            int var247 = class227.field3834.method942(true);
            class112 var248;
            if (var246 < 0) {
                var248 = null;
            } else {
                var248 = class252.method1706(5157, var246);
            }
            if (var246 < -70000) {
                var247 += 32768;
            }
            if (var248 != null) {
                for (int var249 = 0; var249 < var248.field1849.length; var249++) {
                    var248.field1849[var249] = 0;
                    var248.field1899[var249] = 0;
                }
            }
            class11.method63(var247, (byte) -100);
            int var250 = class227.field3834.method942(!arg0);
            for (int var251 = 0; var251 < var250; var251++) {
                int var252 = class227.field3834.method971(-106);
                int var253 = class227.field3834.method951(-1);
                if (var253 == 255) {
                    var253 = class227.field3834.method954((byte) 62);
                }
                if (var248 != null && var248.field1849.length > var251) {
                    var248.field1849[var251] = var252;
                    var248.field1899[var251] = var253;
                }
                class139.method1025(93, var252 - 1, var253, var251, var247);
            }
            if (var248 != null) {
                class23.method114(var248, (byte) 94);
            }
            class74.method540(0);
            class180.field3135[class47.method289(class176.field3101++, 31)] = class47.method289(32767, var247);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 131) {
            long var231 = class227.field3834.method939(-642283040);
            class227.field3834.method977(19773);
            long var233 = class227.field3834.method939(-642283040);
            long var235 = (long) class227.field3834.method942(!arg0);
            boolean var237 = false;
            long var238 = (long) class227.field3834.method949(20732);
            long var240 = (var235 << 32) + var238;
            int var242 = class227.field3834.method948(-128);
            int var243 = 0;
            label1503: while (true) {
                if (var243 < 100) {
                    if (class259.field4353[var243] != var240) {
                        var243++;
                        continue;
                    }
                    var237 = true;
                    break;
                }
                if (var242 <= 1) {
                    if ((!class239.field4038 || class162.field2920) && !class242.field4099) {
                        for (int var244 = 0; var244 < class116.field1961; var244++) {
                            if (class163.field2922[var244] == var231) {
                                var237 = true;
                                break label1503;
                            }
                        }
                    } else {
                        var237 = true;
                    }
                }
                break;
            }
            if (!var237 && class238.field4025 == 0) {
                class259.field4353[class4.field25] = var240;
                class4.field25 = (class4.field25 + 1) % 100;
                class126 var245 = class312.method2150(class173.method1258(class227.field3834, 100).method842((byte) -107));
                if (var242 == 2 || var242 == 3) {
                    class167.method1221(-1, class250.method1696(false, var233).method869(-105), var245, 9, class12.method69(new class126[] { class169.field3004, class250.method1696(false, var231).method869(123) }, (byte) 116));
                } else if (var242 == 1) {
                    class167.method1221(-1, class250.method1696(false, var233).method869(126), var245, 9, class12.method69(new class126[] { class300.field4976, class250.method1696(arg0, var231).method869(-45) }, (byte) 117));
                } else {
                    class167.method1221(-1, class250.method1696(false, var233).method869(-97), var245, 9, class250.method1696(false, var231).method869(-67));
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 50) {
            class302.method2028(class227.field3834, false);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 212) {
            int var228 = class227.field3834.method954((byte) 41);
            class112 var229 = class252.method1706(5157, var228);
            for (int var230 = 0; var230 < var229.field1849.length; var230++) {
                var229.field1849[var230] = -1;
                var229.field1849[var230] = 0;
            }
            class23.method114(var229, (byte) 94);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 154) {
            int var47 = class227.field3834.method948(-124);
            class190 var48 = new class190();
            var48.field3268 = var47 & 0x3F;
            var48.field3263 = class227.field3834.method948(-124);
            int var49 = var47 >> 6;
            if (var48.field3263 >= 0 && var48.field3263 < class315.field5406.length) {
                if (var48.field3268 == 1 || var48.field3268 == 10) {
                    var48.field3257 = class227.field3834.method942(true);
                    class227.field3834.field2299 += 3;
                } else if (var48.field3268 >= 2 && var48.field3268 <= 6) {
                    if (var48.field3268 == 2) {
                        var48.field3254 = 64;
                        var48.field3265 = 64;
                    }
                    if (var48.field3268 == 3) {
                        var48.field3265 = 0;
                        var48.field3254 = 64;
                    }
                    if (var48.field3268 == 4) {
                        var48.field3265 = 128;
                        var48.field3254 = 64;
                    }
                    if (var48.field3268 == 5) {
                        var48.field3265 = 64;
                        var48.field3254 = 0;
                    }
                    if (var48.field3268 == 6) {
                        var48.field3254 = 128;
                        var48.field3265 = 64;
                    }
                    var48.field3268 = 2;
                    var48.field3270 = class227.field3834.method942(!arg0);
                    var48.field3266 = class227.field3834.method942(true);
                    var48.field3251 = class227.field3834.method948(-123);
                }
                var48.field3267 = class227.field3834.method942(true);
                if (var48.field3267 == 65535) {
                    var48.field3267 = -1;
                }
                class100.field1623[var49] = var48;
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 110) {
            int var221 = class227.field3834.method954((byte) 41);
            int var222 = class227.field3834.method975(arg0);
            int var223 = class227.field3834.method942(true);
            if (class229.method1556((byte) 42, var223)) {
                class65 var224 = (class65) class16.field222.method1631(false, (long) var221);
                class65 var225 = (class65) class16.field222.method1631(false, (long) var222);
                if (var225 != null) {
                    class257.method1744(var225, 1819444368, var224 == null || var224.field1097 != var225.field1097);
                }
                if (var224 != null) {
                    var224.method499((byte) 64);
                    class16.field222.method1636(11311, var224, (long) var222);
                }
                class112 var226 = class252.method1706(5157, var221);
                if (var226 != null) {
                    class23.method114(var226, (byte) 94);
                }
                class112 var227 = class252.method1706(5157, var222);
                if (var227 != null) {
                    class23.method114(var227, (byte) 94);
                    class304.method2039(true, (byte) 24, var227);
                }
                if (class182.field3162 != -1) {
                    class266.method1793(1, false, class182.field3162);
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 57) {
            int var50 = class227.field3834.method957(496113200);
            int var51 = class227.field3834.method942(true);
            int var52 = class227.field3834.method971(-125);
            int var53 = class227.field3834.method971(89);
            if (class229.method1556((byte) 42, var51)) {
                class247.method1690(4, 7, var50, var52 | var53 << 16);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 51) {
            int var217 = class227.field3834.method951(-1);
            int var218 = class227.field3834.method928((byte) -91);
            class126 var219 = class227.field3834.method970(1);
            int var220 = class227.field3834.method971(24);
            if (var220 == 65535) {
                var220 = -1;
            }
            if (var218 >= 1 && var218 <= 8) {
                if (var219.method881(class234.field3950, (byte) 92)) {
                    var219 = null;
                }
                class76.field1245[var218 - 1] = var219;
                class212.field3618[var218 - 1] = var220;
                class313.field5343[var218 - 1] = var217 == 0;
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 25) {
            long var54 = class227.field3834.method939(-642283040);
            boolean var56 = true;
            if (var54 < 0L) {
                var54 &= Long.MAX_VALUE;
                var56 = false;
            }
            int var57 = class227.field3834.method942(!arg0);
            int var58 = class227.field3834.method948(-123);
            class126 var59 = class224.field3772;
            if (var57 > 0) {
                var59 = class227.field3834.method970(1);
            }
            class126 var60 = class250.method1696(false, var54).method869(123);
            for (int var61 = 0; var61 < class14.field197; var61++) {
                if (class64.field1088[var61] == var54) {
                    if (class262.field4381[var61] != var57) {
                        class262.field4381[var61] = var57;
                        if (var57 > 0) {
                            class73.method530(class224.field3772, (byte) 87, 5, class12.method69(new class126[] { var60, class239.field4033 }, (byte) 124));
                        }
                        if (var57 == 0) {
                            class73.method530(class224.field3772, (byte) 118, 5, class12.method69(new class126[] { var60, class226.field3807 }, (byte) 127));
                        }
                    }
                    class87.field1372[var61] = var59;
                    var60 = null;
                    class200.field3404[var61] = var58;
                    class132.field2265[var61] = var56;
                    break;
                }
            }
            if (var60 != null && class14.field197 < 200) {
                class64.field1088[class14.field197] = var54;
                class298.field4953[class14.field197] = var60;
                class262.field4381[class14.field197] = var57;
                class87.field1372[class14.field197] = var59;
                class200.field3404[class14.field197] = var58;
                class132.field2265[class14.field197] = var56;
                class14.field197++;
            }
            int var62 = class14.field197;
            boolean var63 = false;
            class130.field2227 = class50.field777;
            while (var62 > 0) {
                boolean var64 = true;
                var62--;
                for (int var65 = 0; var65 < var62; var65++) {
                    if (class262.field4381[var65] != class91.field1422 && class262.field4381[var65 + 1] == class91.field1422 || class262.field4381[var65] == 0 && class262.field4381[var65 + 1] != 0) {
                        var64 = false;
                        int var66 = class262.field4381[var65];
                        class262.field4381[var65] = class262.field4381[var65 + 1];
                        class262.field4381[var65 + 1] = var66;
                        class126 var67 = class87.field1372[var65];
                        class87.field1372[var65] = class87.field1372[var65 + 1];
                        class87.field1372[var65 + 1] = var67;
                        class126 var68 = class298.field4953[var65];
                        class298.field4953[var65] = class298.field4953[var65 + 1];
                        class298.field4953[var65 + 1] = var68;
                        long var69 = class64.field1088[var65];
                        class64.field1088[var65] = class64.field1088[var65 + 1];
                        class64.field1088[var65 + 1] = var69;
                        int var71 = class200.field3404[var65];
                        class200.field3404[var65] = class200.field3404[var65 + 1];
                        class200.field3404[var65 + 1] = var71;
                        boolean var72 = class132.field2265[var65];
                        class132.field2265[var65] = class132.field2265[var65 + 1];
                        class132.field2265[var65 + 1] = var72;
                    }
                }
                if (var64) {
                    break;
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 11) {
            class241.field4084 = class227.field3834.method948(-128);
            class15.field204 = class227.field3834.method948(-128);
            class169.field3018 = class227.field3834.method948(-127);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 191) {
            if (class315.field5404 == 0) {
                class286.field4745 = class283.field4714;
            } else {
                class286.field4745 = class227.field3834.method970(1);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 161) {
            class99.method669(true);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 150) {
            class250.field4182 = class50.field777;
            long var205 = class227.field3834.method939(-642283040);
            if (var205 == 0L) {
                class159.field2865 = null;
                class78.field1276 = 0;
                class122.field2051 = -1;
                class227.field3835 = null;
                field524 = null;
                return true;
            }
            long var207 = class227.field3834.method939(-642283040);
            class227.field3835 = class250.method1696(arg0, var207);
            field524 = class250.method1696(arg0, var205);
            field539 = class227.field3834.method977(19773);
            int var209 = class227.field3834.method948(-122);
            if (var209 == 255) {
                class122.field2051 = -1;
                return true;
            }
            class78.field1276 = var209;
            class82[] var210 = new class82[100];
            for (int var211 = 0; var211 < class78.field1276; var211++) {
                var210[var211] = new class82();
                var210[var211].field1117 = class227.field3834.method939(-642283040);
                var210[var211].field1321 = class250.method1696(false, var210[var211].field1117);
                var210[var211].field1317 = class227.field3834.method942(!arg0);
                var210[var211].field1316 = class227.field3834.method977(19773);
                var210[var211].field1323 = class227.field3834.method970(1);
                if (class89.field1395 == var210[var211].field1117) {
                    class31.field437 = var210[var211].field1316;
                }
            }
            boolean var212 = false;
            int var213 = class78.field1276;
            while (var213 > 0) {
                var213--;
                boolean var214 = true;
                for (int var215 = 0; var215 < var213; var215++) {
                    if (var210[var215].field1321.method882((byte) 117, var210[var215 + 1].field1321) > 0) {
                        class82 var216 = var210[var215];
                        var214 = false;
                        var210[var215] = var210[var215 + 1];
                        var210[var215 + 1] = var216;
                    }
                }
                if (var214) {
                    break;
                }
            }
            class122.field2051 = -1;
            class159.field2865 = var210;
            return true;
        } else if (class122.field2051 == 43) {
            int var73 = class227.field3834.method982((byte) 90);
            int var74 = class227.field3834.method957(496113200);
            int var75 = class227.field3834.method945((byte) -126);
            if (class229.method1556((byte) 42, var73)) {
                class260.method1759(var75, var74, (byte) 78);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 28) {
            class74.method540(0);
            class297.field4945 = class227.field3834.method948(-124);
            class45.field700 = class50.field777;
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 215) {
            class20.field270 = class227.field3834.method948(-125);
            class130.field2227 = class50.field777;
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 87) {
            int var201 = class227.field3834.method928((byte) -109);
            int var202 = class227.field3834.method942(!arg0);
            int var203 = class227.field3834.method982((byte) 94);
            class89 var204 = class199.field3391[var203];
            if (var204 != null) {
                class41.method262(var204, var201, var202, 0);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 61) {
            int var198 = class227.field3834.method982((byte) 93);
            int var199 = class227.field3834.method942(!arg0);
            if (var199 == 65535) {
                var199 = -1;
            }
            int var200 = class227.field3834.method975(false);
            if (class229.method1556((byte) 42, var198)) {
                class247.method1690(4, 2, var200, var199);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 80) {
            int var196 = class227.field3834.method982((byte) 116);
            int var197 = class227.field3834.method957(496113200);
            class103.method702(var197, var196, -16598);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 202) {
            if (class182.field3162 != -1) {
                class266.method1793(0, arg0, class182.field3162);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 248) {
            int var76 = class227.field3834.method957(496113200);
            int var77 = class227.field3834.method942(!arg0);
            if (class229.method1556((byte) 42, var77)) {
                int var78 = 0;
                if (class286.field4744.field5004 != null) {
                    var78 = class286.field4744.field5004.method1648((byte) -41);
                }
                class247.method1690(4, 3, var76, var78);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 189) {
            for (int var79 = 0; var79 < class138.field2462.length; var79++) {
                if (class254.field4275[var79] != class138.field2462[var79]) {
                    class138.field2462[var79] = class254.field4275[var79];
                    class100.method674((byte) -104, var79);
                    class254.field4268[class47.method289(class124.field2100++, 31)] = var79;
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 67) {
            int var80 = class227.field3834.method937(3);
            class32.field470 = class161.field2907.method1088(-54, var80);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 104) {
            class53.method331(-55);
            class74.method540(0);
            class122.field2051 = -1;
            class124.field2100 += 32;
            return true;
        } else if (class122.field2051 == 167) {
            int var195 = class227.field3834.method948(-121);
            if (class227.field3834.method948(-125) == 0) {
                class173.field3056[var195] = new class120();
            } else {
                class227.field3834.field2299--;
                class173.field3056[var195] = new class120(class227.field3834);
            }
            class122.field2051 = -1;
            class285.field4727 = class50.field777;
            return true;
        } else if (class122.field2051 == 8) {
            int var81 = class227.field3834.method948(-124);
            int var82 = class227.field3834.method948(-122);
            int var83 = class227.field3834.method948(-127);
            int var84 = class227.field3834.method948(-124);
            int var85 = class227.field3834.method942(true);
            class195.field3355[var81] = true;
            class207.field3543[var81] = var82;
            class242.field4106[var81] = var83;
            class315.field5419[var81] = var84;
            class106.field1670[var81] = var85;
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 243) {
            class224.field3777 = class227.field3834.method948(-125);
            class124.field2102 = class227.field3834.method951(-1);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 209) {
            int var86 = class227.field3834.method971(-114);
            class126 var87 = class227.field3834.method970(1);
            int var88 = class227.field3834.method932(75);
            if (class229.method1556((byte) 42, var86)) {
                class44.method275(0, var88, var87);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 113) {
            int var190 = class227.field3834.method948(-127);
            int var191 = class227.field3834.method948(-122);
            int var192 = class227.field3834.method942(true);
            int var193 = class227.field3834.method948(-124);
            int var194 = class227.field3834.method948(-124);
            class289.method1919(var193, 0, var191, true, var192, var190, var194);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 137) {
            if (class45.field693 != null) {
                class152.method1134(-1, class189.field3242, -1, false, -1);
            }
            byte[] var89 = new byte[class315.field5404];
            class227.field3834.method1239(class315.field5404, var89, 0, 1620031587);
            class126 var90 = class301.method2021(0, class315.field5404, var89, false);
            if (class253.field4250 == null && (class147.field2708 == 3 || !class147.field2715.startsWith("win") || class111.field1746)) {
                class315.method2196((byte) 114, true, var90);
            } else {
                class5.field63 = true;
                class207.field3549 = var90;
                class257.field4317 = class161.field2907.method1102(0, new String(var90.method860((byte) -49), "ISO-8859-1"));
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 186) {
            long var91 = class227.field3834.method939(-642283040);
            long var93 = (long) class227.field3834.method942(!arg0);
            long var95 = (long) class227.field3834.method949(20732);
            int var97 = class227.field3834.method948(-127);
            long var98 = (var93 << 32) + var95;
            boolean var100 = false;
            int var101 = 0;
            label1308: while (true) {
                if (var101 >= 100) {
                    if (var97 <= 1) {
                        if ((!class239.field4038 || class162.field2920) && !class242.field4099) {
                            for (int var102 = 0; var102 < class116.field1961; var102++) {
                                if (class163.field2922[var102] == var91) {
                                    var100 = true;
                                    break label1308;
                                }
                            }
                        } else {
                            var100 = true;
                        }
                    }
                    break;
                }
                if (class259.field4353[var101] == var98) {
                    var100 = true;
                    break;
                }
                var101++;
            }
            if (!var100 && class238.field4025 == 0) {
                class259.field4353[class4.field25] = var98;
                class4.field25 = (class4.field25 + 1) % 100;
                class126 var103 = class312.method2150(class173.method1258(class227.field3834, 118).method842((byte) -76));
                if (var97 == 2 || var97 == 3) {
                    class73.method530(class12.method69(new class126[] { class169.field3004, class250.method1696(false, var91).method869(123) }, (byte) 124), (byte) 106, 7, var103);
                } else if (var97 == 1) {
                    class73.method530(class12.method69(new class126[] { class300.field4976, class250.method1696(arg0, var91).method869(-33) }, (byte) 123), (byte) 102, 7, var103);
                } else {
                    class73.method530(class250.method1696(false, var91).method869(-116), (byte) 101, 3, var103);
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 41) {
            int var104 = class227.field3834.method971(90);
            if (var104 == 65535) {
                var104 = -1;
            }
            int var105 = class227.field3834.method982((byte) 66);
            int var106 = class227.field3834.method937(3);
            if (var105 == 65535) {
                var105 = -1;
            }
            int var107 = class227.field3834.method971(25);
            int var108 = class227.field3834.method975(false);
            if (class229.method1556((byte) 42, var107)) {
                for (int var109 = var104; var109 <= var105; var109++) {
                    long var110 = ((long) var108 << 32) + (long) var109;
                    class68 var112 = class183.field3191.method1631(arg0, var110);
                    if (var112 != null) {
                        var112.method499((byte) 64);
                    }
                    class183.field3191.method1636(11311, new class27(var106), var110);
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 179) {
            int var188 = class227.field3834.method971(23);
            int var189 = class227.field3834.method948(-125);
            class227.method1549(var189, -1, var188);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 6) {
            class122.field2051 = -1;
            class27.field378 = 0;
            return true;
        } else if (class122.field2051 == 16) {
            byte var186 = class227.field3834.method963((byte) 93);
            int var187 = class227.field3834.method971(-125);
            class103.method702(var186, var187, -16598);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 242) {
            int var179 = class227.field3834.method942(true);
            if (var179 == 65535) {
                var179 = -1;
            }
            int var180 = class227.field3834.method954((byte) 78);
            int var181 = class227.field3834.method937(3);
            int var182 = class227.field3834.method971(97);
            if (class229.method1556((byte) 42, var182)) {
                class112 var183 = class252.method1706(5157, var181);
                if (var183.field1916) {
                    class231.method1574(var181, var180, 9, var179);
                    class137 var184 = class68.method498(26, var179);
                    class241.method1647(var184.field2423, var184.field2365, var181, var184.field2420, 8);
                    class152.method1129(var184.field2398, var181, var184.field2401, (byte) 48, var184.field2421);
                } else if (var179 == -1) {
                    var183.field1800 = 0;
                    class122.field2051 = -1;
                    return true;
                } else {
                    class137 var185 = class68.method498(122, var179);
                    var183.field1774 = var179;
                    var183.field1891 = var185.field2420;
                    var183.field1770 = var185.field2423 * 100 / var180;
                    var183.field1800 = 4;
                    var183.field1843 = var185.field2365;
                    class23.method114(var183, (byte) 94);
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 232) {
            int var176 = class227.field3834.method942(true);
            int var177 = class227.field3834.method982((byte) 73);
            int var178 = class227.field3834.method957(496113200);
            if (var177 == 65535) {
                var177 = -1;
            }
            if (class229.method1556((byte) 42, var176)) {
                class247.method1690(4, 1, var178, var177);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 111) {
            class54.method342(-6);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 163) {
            class118.method773(false, 119);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 74) {
            class124.field2102 = class227.field3834.method951(-1);
            class224.field3777 = class227.field3834.method966(83);
            for (int var113 = class124.field2102; var113 < class124.field2102 + 8; var113++) {
                for (int var114 = class224.field3777; var114 < (class224.field3777 + 8); var114++) {
                    if (class89.field1388[class131.field2250][var113][var114] != null) {
                        class89.field1388[class131.field2250][var113][var114] = null;
                        class213.method1480(126, var113, var114);
                    }
                }
            }
            for (class252 var115 = (class252) class264.field4399.method898((byte) -96); var115 != null; var115 = (class252) class264.field4399.method893((byte) 70)) {
                if (var115.field4209 >= class124.field2102 && (class124.field2102 + 8) > var115.field4209 && class224.field3777 <= var115.field4230 && var115.field4230 < class224.field3777 + 8 && class131.field2250 == var115.field4228) {
                    var115.field4235 = 0;
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 48) {
            int var116 = class227.field3834.method945((byte) -128);
            int var117 = class227.field3834.method954((byte) 112);
            int var118 = class227.field3834.method945((byte) -128);
            int var119 = class227.field3834.method932(125);
            if (class229.method1556((byte) 42, var119)) {
                class70.method510(false, var117, var116, var118);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 190) {
            for (int var174 = 0; var174 < class85.field1352.length; var174++) {
                if (class85.field1352[var174] != null) {
                    class85.field1352[var174].field2476 = -1;
                }
            }
            for (int var175 = 0; var175 < class199.field3391.length; var175++) {
                if (class199.field3391[var175] != null) {
                    class199.field3391[var175].field2476 = -1;
                }
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 88) {
            int var171 = class227.field3834.method971(-116);
            int var172 = class227.field3834.method948(-125);
            int var173 = class227.field3834.method937(3);
            if (class229.method1556((byte) 42, var171)) {
                class218.method1496((byte) 29, var173, var172);
            }
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 229) {
            class267.method1805(class227.field3834.method970(1), (byte) -119);
            class122.field2051 = -1;
            return true;
        } else if (class122.field2051 == 250) {
            int var120 = class227.field3834.method948(-128);
            int var121 = class227.field3834.method948(-127);
            int var122 = class227.field3834.method942(true);
            int var123 = class227.field3834.method948(-125);
            int var124 = class227.field3834.method948(-125);
            class5.method32(var121, var123, var120, var124, 6164, var122);
            class122.field2051 = -1;
            return true;
        } else {
            if (arg0) {
                field524 = (class126) null;
            }
            if (class122.field2051 == 37) {
                int var166 = class227.field3834.method942(!arg0);
                class126 var167 = class227.field3834.method970(1);
                Object[] var168 = new Object[var167.method878((byte) 74) + 1];
                for (int var169 = var167.method878((byte) 110) - 1; var169 >= 0; var169--) {
                    if (var167.method843(var169, (byte) -94) == 115) {
                        var168[var169 + 1] = class227.field3834.method970(1);
                    } else {
                        var168[var169 + 1] = Integer.valueOf(class227.field3834.method957(496113200));
                    }
                }
                var168[0] = Integer.valueOf(class227.field3834.method957(496113200));
                if (class229.method1556((byte) 42, var166)) {
                    class282 var170 = new class282();
                    var170.field4699 = var168;
                    class309.method2111(var170, 200000);
                }
                class122.field2051 = -1;
                return true;
            } else if (class122.field2051 == 78) {
                long var162 = class227.field3834.method939(-642283040);
                int var164 = class227.field3834.method942(true);
                class126 var165 = class241.method1665(var164, (byte) -53).method1512(class227.field3834, 21622);
                client.method807((class126) null, var165, -122, 19, class250.method1696(false, var162).method869(-33), var164);
                class122.field2051 = -1;
                return true;
            } else if (class122.field2051 == 13) {
                int var159 = class227.field3834.method942(true);
                int var160 = class227.field3834.method957(496113200);
                if (class229.method1556((byte) 42, var159)) {
                    class65 var161 = (class65) class16.field222.method1631(false, (long) var160);
                    if (var161 != null) {
                        class257.method1744(var161, 1819444368, true);
                    }
                    if (class64.field1084 != null) {
                        class23.method114(class64.field1084, (byte) 94);
                        class64.field1084 = null;
                    }
                }
                class122.field2051 = -1;
                return true;
            } else if (class122.field2051 == 200) {
                int var156 = class227.field3834.method932(70);
                int var157 = class227.field3834.method971(-106);
                int var158 = class227.field3834.method937(3);
                if (class229.method1556((byte) 42, var157)) {
                    class75.method542(var156, var158, 6);
                }
                class122.field2051 = -1;
                return true;
            } else if (class122.field2051 == 187) {
                long var142 = class227.field3834.method939(-642283040);
                int var144 = class227.field3834.method942(true);
                byte var145 = class227.field3834.method977(19773);
                boolean var146 = false;
                if ((Long.MIN_VALUE & var142) != 0L) {
                    var146 = true;
                }
                if (var146) {
                    if (class78.field1276 == 0) {
                        class122.field2051 = -1;
                        return true;
                    }
                    long var147 = var142 & Long.MAX_VALUE;
                    boolean var149 = false;
                    int var150;
                    for (var150 = 0; var150 < class78.field1276 && (class159.field2865[var150].field1117 != var147 || class159.field2865[var150].field1317 != var144); var150++) {
                    }
                    if (var150 < class78.field1276) {
                        while (var150 < (class78.field1276 - 1)) {
                            class159.field2865[var150] = class159.field2865[var150 + 1];
                            var150++;
                        }
                        class78.field1276--;
                        class159.field2865[class78.field1276] = null;
                    }
                } else {
                    class126 var151 = class227.field3834.method970(1);
                    class82 var152 = new class82();
                    var152.field1117 = var142;
                    var152.field1321 = class250.method1696(false, var152.field1117);
                    var152.field1316 = var145;
                    var152.field1317 = var144;
                    var152.field1323 = var151;
                    int var153;
                    for (var153 = class78.field1276 - 1; var153 >= 0; var153--) {
                        int var154 = class159.field2865[var153].field1321.method882((byte) 96, var152.field1321);
                        if (var154 == 0) {
                            class159.field2865[var153].field1317 = var144;
                            class159.field2865[var153].field1316 = var145;
                            class159.field2865[var153].field1323 = var151;
                            if (class89.field1395 == var142) {
                                class31.field437 = var145;
                            }
                            class122.field2051 = -1;
                            class250.field4182 = class50.field777;
                            return true;
                        }
                        if (var154 < 0) {
                            break;
                        }
                    }
                    if (class159.field2865.length <= class78.field1276) {
                        class122.field2051 = -1;
                        return true;
                    }
                    for (int var155 = class78.field1276 - 1; var155 > var153; var155--) {
                        class159.field2865[var155 + 1] = class159.field2865[var155];
                    }
                    if (class78.field1276 == 0) {
                        class159.field2865 = new class82[100];
                    }
                    class159.field2865[var153 + 1] = var152;
                    if (class89.field1395 == var142) {
                        class31.field437 = var145;
                    }
                    class78.field1276++;
                }
                class250.field4182 = class50.field777;
                class122.field2051 = -1;
                return true;
            } else if (class122.field2051 == 197) {
                int var125 = class227.field3834.method932(114);
                int var126 = class227.field3834.method957(496113200);
                int var127 = class227.field3834.method942(true);
                int var128 = class227.field3834.method971(-103);
                if (class229.method1556((byte) 42, var127)) {
                    class266.method1794(false, (var125 << 16) + var128, var126);
                }
                class122.field2051 = -1;
                return true;
            } else if (class122.field2051 == 219) {
                class74.method540(0);
                class189.field3246 = class227.field3834.method931((byte) 70);
                class122.field2051 = -1;
                class45.field700 = class50.field777;
                return true;
            } else if (class122.field2051 == 53) {
                class74.method540(0);
                int var129 = class227.field3834.method937(3);
                int var130 = class227.field3834.method951(-1);
                int var131 = class227.field3834.method966(15);
                class182.field3174[var130] = var129;
                class116.field1956[var130] = var131;
                class231.field3882[var130] = 1;
                for (int var132 = 0; var132 < 98; var132++) {
                    if (var129 >= class287.field4777[var132]) {
                        class231.field3882[var130] = var132 + 2;
                    }
                }
                class221.field3749[class47.method289(31, class107.field1693++)] = var130;
                class122.field2051 = -1;
                return true;
            } else if (class122.field2051 == 168) {
                int var141 = class227.field3834.method932(93);
                if (var141 == 65535) {
                    var141 = -1;
                }
                class69.method506(2, var141);
                class122.field2051 = -1;
                return true;
            } else if (class122.field2051 == 218) {
                int var133 = class227.field3834.method950(95);
                int var134 = class227.field3834.method932(122);
                if (var134 == 65535) {
                    var134 = -1;
                }
                class34.method190(var134, var133, 0);
                class122.field2051 = -1;
                return true;
            } else if (class122.field2051 == 225) {
                int var135 = class227.field3834.method957(496113200);
                int var136 = class227.field3834.method942(true);
                if (var135 < -70000) {
                    var136 += 32768;
                }
                class112 var137;
                if (var135 >= 0) {
                    var137 = class252.method1706(5157, var135);
                } else {
                    var137 = null;
                }
                while (class315.field5404 > class227.field3834.field2299) {
                    int var138 = class227.field3834.method930(-15535);
                    int var139 = 0;
                    int var140 = class227.field3834.method942(true);
                    if (var140 != 0) {
                        var139 = class227.field3834.method948(-125);
                        if (var139 == 255) {
                            var139 = class227.field3834.method957(496113200);
                        }
                    }
                    if (var137 != null && var138 >= 0 && var137.field1849.length > var138) {
                        var137.field1849[var138] = var140;
                        var137.field1899[var138] = var139;
                    }
                    class139.method1025(103, var140 - 1, var139, var138, var136);
                }
                if (var137 != null) {
                    class23.method114(var137, (byte) 94);
                }
                class74.method540(0);
                class180.field3135[class47.method289(31, class176.field3101++)] = class47.method289(32767, var136);
                class122.field2051 = -1;
                return true;
            } else {
                class54.method345("T1 - " + class122.field2051 + "," + class17.field231 + "," + class189.field3249 + " - " + class315.field5404, -71, (Throwable) null);
                class189.method1356((byte) -103);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(II)[[I", line = 2863)
    public final int[][] method26(int arg0, int arg1) {
        field523++;
        if (arg0 != 0) {
            method198(65, 46, -113, true, -1.0436617F, 113, 8, -121);
        }
        int[][] var3 = this.field2775.method319(111, arg1);
        if (this.field2775.field775) {
            int[][] var4 = this.method1133(arg1, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class244.field4133; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var9[var11];
                if (var12 < this.field538) {
                    var6[var11] = this.field538;
                } else if (this.field528 >= var12) {
                    var6[var11] = var12;
                } else {
                    var6[var11] = this.field528;
                }
                if (var13 < this.field538) {
                    var8[var11] = this.field538;
                } else if (var13 > this.field528) {
                    var8[var11] = this.field528;
                } else {
                    var8[var11] = var13;
                }
                if (this.field538 > var14) {
                    var10[var11] = this.field538;
                } else if (var14 > this.field528) {
                    var10[var11] = this.field528;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)I", line = 2956)
    public static final int method200(int arg0, boolean arg1) {
        if (arg0 != -1) {
            method197((byte) 56, 47);
        }
        long var2 = class261.method1765(arg0 + 16300);
        field522++;
        for (class44 var4 = arg1 ? (class44) class265.field4471.method1630((byte) 56) : (class44) class265.field4471.method1632(arg0 - 71); var4 != null; var4 = (class44) class265.field4471.method1632(arg0 ^ 0x62)) {
            if (var2 > (var4.field688 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field688 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1117;
                    class138.field2462[var5] = class254.field4275[var5];
                    var4.method499((byte) 64);
                    return var5;
                }
                var4.method499((byte) 64);
            }
        }
        return -1;
    }
}
