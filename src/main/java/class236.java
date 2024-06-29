import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class236 extends class243 {

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    private int field4081 = 0;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
    private int field4083 = 0;

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "I")
    private int field4088 = 20;

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "I")
    private int field4087 = 1365;

    @OriginalMember(owner = "client!uf", name = "lb", descriptor = "I")
    public static int field4094 = 0;

    @OriginalMember(owner = "client!uf", name = "kb", descriptor = "Lbc;")
    public static class201 field4093 = new class201(32);

    @OriginalMember(owner = "client!uf", name = "pb", descriptor = "[[[I")
    public static int[][][] field4098 = new int[4][13][13];

    @OriginalMember(owner = "client!uf", name = "qb", descriptor = "[I")
    public static int[] field4099 = new int[500];

    @OriginalMember(owner = "client!uf", name = "rb", descriptor = "Lub;")
    private static class227 field4100 = class257.method1749(" has logged in)3", 17263);

    @OriginalMember(owner = "client!uf", name = "nb", descriptor = "Lub;")
    public static class227 field4096 = field4100;

    @OriginalMember(owner = "client!uf", name = "sb", descriptor = "[I")
    public static int[] field4101 = new int[50];

    @OriginalMember(owner = "client!uf", name = "mb", descriptor = "I")
    public static int field4095 = 0;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!uf", name = "hb", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!uf", name = "ib", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!uf", name = "jb", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!uf", name = "ob", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)V")
    public static void method1571(int arg0) {
        field4098 = null;
        field4093 = null;
        field4100 = null;
        field4099 = null;
        field4096 = null;
        int var1 = 85 % ((arg0 - -9) / 56);
        field4101 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field4086;
        if (!arg1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            this.field4081 = arg0.method1447(0);
                        }
                    } else {
                        this.field4083 = arg0.method1447(0);
                    }
                } else {
                    this.field4088 = arg0.method1447(0);
                }
            } else {
                this.field4087 = arg0.method1447(0);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)V")
    public static final void method1572(int arg0) {
        ++field4089;
        if (arg0 != 65535) {
            method1574((byte) -65, (class138) null);
        }
        class53.field931.method1728(true);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class236() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "(I)Z")
    public static final boolean method1573(int arg0) throws IOException {
        ++field4084;
        if (class9.field172 == null) {
            return false;
        } else {
            int var1 = class9.field172.method93(0);
            if (var1 == 0) {
                return false;
            } else {
                if (class134.field2318 == -1) {
                    --var1;
                    class9.field172.method99(1, 0, class32.field512.field3901, 112);
                    class32.field512.field3879 = 0;
                    class134.field2318 = class32.field512.method663(67);
                    class179.field3073 = class29.field471[class134.field2318];
                }
                if (~class179.field3073 == 0) {
                    if (var1 <= 0) {
                        return false;
                    }
                    class9.field172.method99(1, 0, class32.field512.field3901, -69);
                    --var1;
                    class179.field3073 = class32.field512.field3901[0] & 255;
                }
                if (~class179.field3073 == 1) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    class9.field172.method99(2, 0, class32.field512.field3901, -57);
                    var1 -= 2;
                    class32.field512.field3879 = 0;
                    class179.field3073 = class32.field512.method1447(0);
                }
                if (class179.field3073 > var1) {
                    return false;
                } else {
                    class32.field512.field3879 = 0;
                    class9.field172.method99(class179.field3073, 0, class32.field512.field3901, -126);
                    class85.field1473 = 0;
                    class245.field4275 = class112.field2081;
                    int var2 = -59 / ((51 - arg0) / 55);
                    class112.field2081 = class14.field277;
                    class14.field277 = class134.field2318;
                    if (~class134.field2318 == -44) {
                        int var3 = class32.field512.method1482(-128);
                        int var4 = class32.field512.method1441(-126);
                        class191.method1215(var3, -84, var4);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -40) {
                        class188.method1202(true);
                        class134.field2318 = -1;
                        return false;
                    } else if (~class134.field2318 == -134) {
                        long var5 = class32.field512.method1469((byte) 41);
                        boolean var7 = false;
                        long var8 = (long) class32.field512.method1447(0);
                        long var10 = (long) class32.field512.method1444(171285352);
                        int var12 = class32.field512.method1471(255);
                        long var13 = (var8 << 32) + var10;
                        int var15 = 0;
                        label1037: while (true) {
                            if (~var15 <= -101) {
                                if (~var12 >= -2) {
                                    if (class252.field4363 != 1 && ~class49.field858 != -2) {
                                        for (int var16 = 0; ~var16 > ~class86.field1485; ++var16) {
                                            if (~class230.field4031[var16] == ~var5) {
                                                var7 = true;
                                                break label1037;
                                            }
                                        }
                                    } else {
                                        var7 = true;
                                    }
                                }
                                break;
                            }
                            if (class220.field3714[var15] == var13) {
                                var7 = true;
                                break;
                            }
                            ++var15;
                        }
                        if (!var7 && ~class251.field4348 == -1) {
                            class220.field3714[class53.field933] = var13;
                            class53.field933 = (class53.field933 - -1) % 100;
                            class227 var17 = class196.method1249(class67.method419(class32.field512, -27885).method1490(true));
                            if (~var12 != -3 && var12 != 3) {
                                if (~var12 != -2) {
                                    class130.method799(1403, 3, class118.method744(var5, -121).method1527(-96), var17);
                                } else {
                                    class130.method799(1403, 7, class76.method445((byte) -73, new class227[] { class88.field1531, class118.method744(var5, -116).method1527(-96) }), var17);
                                }
                            } else {
                                class130.method799(1403, 7, class76.method445((byte) 41, new class227[] { class105.field1897, class118.method744(var5, -117).method1527(-96) }), var17);
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 71) {
                        int var18 = class32.field512.method1472(0);
                        int var19 = class32.field512.method1447(0);
                        int var20 = class32.field512.method1439(-116);
                        class124.method767(var18, -123);
                        class229.method1547((byte) 95, var20, var19);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 83) {
                        int var21 = class32.field512.method1482(-128);
                        if (~var21 == -65536) {
                            var21 = -1;
                        }
                        int var22 = class32.field512.method1478(-32053);
                        class105 var23 = class27.method137(var22, -954490064);
                        if (var23.field1850 != 2 || var23.field1910 != var21) {
                            var23.field1910 = var21;
                            var23.field1850 = 2;
                            class198.method1268(76, var23);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 69) {
                        class114.method722(0);
                        client.field1439 = class32.field512.method1471(255);
                        class216.field3649 = class77.field1356;
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 27) {
                        int var24 = class32.field512.method1456(-9944);
                        int var25 = class32.field512.method1481(false);
                        class191.method1215(var25, -113, var24);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -48) {
                        class226.method1458(true);
                        class114.method722(0);
                        class134.field2318 = -1;
                        class99.field1725 += 32;
                        return true;
                    } else if (class134.field2318 == 0) {
                        int var26 = class32.field512.method1473(false);
                        int var27 = class32.field512.method1432((byte) -121);
                        class105 var28 = class27.method137(var26, -954490064);
                        if (var28.field1914 != var27 || ~var27 == 0) {
                            var28.field1944 = 0;
                            var28.field1914 = var27;
                            var28.field1908 = 0;
                            class198.method1268(126, var28);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 140) {
                        long var29 = class32.field512.method1469((byte) 41);
                        long var31 = (long) class32.field512.method1447(0);
                        long var33 = (long) class32.field512.method1444(171285352);
                        int var35 = class32.field512.method1471(255);
                        int var36 = class32.field512.method1447(0);
                        boolean var37 = false;
                        long var38 = (var31 << 32) - -var33;
                        int var40 = 0;
                        label1066: while (true) {
                            if (var40 >= 100) {
                                if (~var35 >= -2) {
                                    for (int var41 = 0; ~var41 > ~class86.field1485; ++var41) {
                                        if (class230.field4031[var41] == var29) {
                                            var37 = true;
                                            break label1066;
                                        }
                                    }
                                }
                                break;
                            }
                            if (~class220.field3714[var40] == ~var38) {
                                var37 = true;
                                break;
                            }
                            ++var40;
                        }
                        if (!var37 && ~class251.field4348 == -1) {
                            class220.field3714[class53.field933] = var38;
                            class53.field933 = (class53.field933 + 1) % 100;
                            class227 var42 = class38.method201(var36, -16756).method797(class32.field512, -48);
                            if (~var35 != -3) {
                                if (var35 == 1) {
                                    class181.method1160(class76.method445((byte) 68, new class227[] { class88.field1531, class118.method744(var29, -122).method1527(-96) }), 0, var36, var42, 18, (class227) null);
                                } else {
                                    class181.method1160(class118.method744(var29, -123).method1527(-96), 0, var36, var42, 18, (class227) null);
                                }
                            } else {
                                class181.method1160(class76.method445((byte) 125, new class227[] { class105.field1897, class118.method744(var29, -114).method1527(-96) }), 0, var36, var42, 18, (class227) null);
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -206) {
                        boolean var43 = false;
                        long var44 = class32.field512.method1469((byte) 41);
                        int var46 = class32.field512.method1447(0);
                        if ((var44 & Long.MIN_VALUE) != 0L) {
                            var43 = true;
                        }
                        byte var47 = class32.field512.method1428(false);
                        if (var43) {
                            if (class44.field737 == 0) {
                                class134.field2318 = -1;
                                return true;
                            }
                            long var48 = var44 & Long.MAX_VALUE;
                            boolean var50 = false;
                            int var51;
                            for (var51 = 0; ~var51 > ~class44.field737 && (class79.field1382[var51].field1113 != var48 || ~class79.field1382[var51].field1193 != ~var46); ++var51) {
                            }
                            if (~var51 > ~class44.field737) {
                                while (~(class44.field737 - 1) < ~var51) {
                                    class79.field1382[var51] = class79.field1382[var51 + 1];
                                    ++var51;
                                }
                                --class44.field737;
                                class79.field1382[class44.field737] = null;
                            }
                        } else {
                            class227 var52 = class32.field512.method1480(94);
                            class65 var53 = new class65();
                            var53.field1113 = var44;
                            var53.field1189 = class118.method744(var53.field1113, -128);
                            var53.field1193 = var46;
                            var53.field1190 = var52;
                            var53.field1192 = var47;
                            int var54;
                            for (var54 = class44.field737 + -1; var54 >= 0; --var54) {
                                int var55 = class79.field1382[var54].field1189.method1491(var53.field1189, 5177);
                                if (~var55 == -1) {
                                    class79.field1382[var54].field1193 = var46;
                                    class79.field1382[var54].field1192 = var47;
                                    class79.field1382[var54].field1190 = var52;
                                    class134.field2318 = -1;
                                    if (~class151.field2632 == ~var44) {
                                        class228.field3983 = var47;
                                    }
                                    class19.field325 = class77.field1356;
                                    return true;
                                }
                                if (var55 < 0) {
                                    break;
                                }
                            }
                            if (class79.field1382.length <= class44.field737) {
                                class134.field2318 = -1;
                                return true;
                            }
                            for (int var56 = class44.field737 + -1; var54 < var56; --var56) {
                                class79.field1382[var56 + 1] = class79.field1382[var56];
                            }
                            if (class44.field737 == 0) {
                                class79.field1382 = new class65[100];
                            }
                            class79.field1382[var54 + 1] = var53;
                            if (class151.field2632 == var44) {
                                class228.field3983 = var47;
                            }
                            ++class44.field737;
                        }
                        class134.field2318 = -1;
                        class19.field325 = class77.field1356;
                        return true;
                    } else if (~class134.field2318 == -135) {
                        class92.field1568 = class32.field512.method1472(0) * 30;
                        class134.field2318 = -1;
                        class216.field3649 = class77.field1356;
                        return true;
                    } else if (~class134.field2318 == -34) {
                        int var57 = class32.field512.method1472(0);
                        int var58 = class32.field512.method1478(-32053);
                        int var59 = class32.field512.method1439(-119);
                        class182 var60 = (class182) class58.field1070.method1298(-117, (long) var58);
                        if (var60 != null) {
                            class81.method470(var60.field3106 != var57, -1, var60);
                        }
                        class178.method1133(-16998, var57, var59, var58);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -83) {
                        class199.method1286(class61.field1123, -37, class32.field512, class179.field3073);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -51) {
                        for (int var61 = 0; class27.field446.length > var61; ++var61) {
                            if (class27.field446[var61] != null) {
                                class27.field446[var61].field101 = -1;
                            }
                        }
                        for (int var62 = 0; ~class220.field3715.length < ~var62; ++var62) {
                            if (class220.field3715[var62] != null) {
                                class220.field3715[var62].field101 = -1;
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 108) {
                        class11.field219 = class32.field512.method1471(255);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 221) {
                        int var63 = class32.field512.method1482(-128);
                        byte var64 = class32.field512.method1440(-32543);
                        class7.method31(var63, true, var64);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -121) {
                        long var65 = class32.field512.method1469((byte) 41);
                        int var67 = class32.field512.method1447(0);
                        class227 var68 = class38.method201(var67, -16756).method797(class32.field512, -48);
                        class181.method1160(class118.method744(var65, -121).method1527(-96), 0, var67, var68, 19, (class227) null);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 75) {
                        class133.field2305 = class32.field512.method1471(255);
                        class134.field2318 = -1;
                        class152.field2645 = class77.field1356;
                        return true;
                    } else if (class134.field2318 == 74) {
                        int var69 = class32.field512.method1465(0);
                        int var70 = class32.field512.method1453(255);
                        int var71 = class32.field512.method1473(false);
                        class105 var72 = class27.method137(var71, -954490064);
                        var72.field1900 = 0;
                        var72.field1950 = var72.field1966 = var70;
                        var72.field1941 = var72.field1828 = var69;
                        var72.field1876 = 0;
                        class198.method1268(112, var72);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -93) {
                        int var73 = class179.field3073 + class32.field512.field3879;
                        int var74 = class32.field512.method1447(0);
                        int var75 = class32.field512.method1447(0);
                        if (~class116.field2131 != ~var74) {
                            class116.field2131 = var74;
                            class230.method1552((byte) -84, class116.field2131);
                            class12.method59(false, (byte) 112);
                            class60.method372((byte) -63, class116.field2131);
                            for (int var76 = 0; var76 < 100; ++var76) {
                                class10.field182[var76] = true;
                            }
                        }
                        while (~(var75--) < -1) {
                            int var85 = class32.field512.method1478(-32053);
                            int var86 = class32.field512.method1447(0);
                            int var87 = class32.field512.method1471(255);
                            class182 var88 = (class182) class58.field1070.method1298(-124, (long) var85);
                            if (var88 != null && var88.field3106 != var86) {
                                class81.method470(true, -1, var88);
                                var88 = null;
                            }
                            if (var88 == null) {
                                var88 = class178.method1133(-16998, var86, var87, var85);
                            }
                            var88.field3114 = true;
                        }
                        for (class182 var77 = (class182) class58.field1070.method1299((byte) 74); var77 != null; var77 = (class182) class58.field1070.method1295((byte) 31)) {
                            if (var77.field3114) {
                                var77.field3114 = false;
                            } else {
                                class81.method470(true, -1, var77);
                            }
                        }
                        class184.field3133.method1292(25028);
                        while (~var73 < ~class32.field512.field3879) {
                            int var78 = class32.field512.method1478(-32053);
                            int var79 = class32.field512.method1447(0);
                            int var80 = class32.field512.method1447(0);
                            int var81 = class32.field512.method1478(-32053);
                            for (int var82 = var79; var82 <= var80; ++var82) {
                                long var83 = ((long) var78 << 32) + (long) var82;
                                class184.field3133.method1300(new class216(var81), var83, -2875);
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -233) {
                        class114.method722(0);
                        int var89 = class32.field512.method1471(255);
                        int var90 = class32.field512.method1434(123);
                        int var91 = class32.field512.method1456(-9944);
                        class260.field4522[var89] = var90;
                        class105.field1913[var89] = var91;
                        class240.field4170[var89] = 1;
                        for (int var92 = 0; ~var92 > -99; ++var92) {
                            if (~class228.field3975[var92] >= ~var90) {
                                class240.field4170[var89] = var92 + 2;
                            }
                        }
                        class205.field3489[class76.method446(class73.field1275++, 31)] = var89;
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 100) {
                        class141.field2435 = class32.field512.method1456(-9944);
                        class229.field3997 = class32.field512.method1439(-127);
                        for (int var93 = class229.field3997; class229.field3997 + 8 > var93; ++var93) {
                            for (int var95 = class141.field2435; ~(class141.field2435 + 8) < ~var95; ++var95) {
                                if (class80.field1389[class64.field1171][var93][var95] != null) {
                                    class80.field1389[class64.field1171][var93][var95] = null;
                                    class241.method1609(var93, var95, 64);
                                }
                            }
                        }
                        for (class49 var94 = (class49) class190.field3214.method1277(87); var94 != null; var94 = (class49) class190.field3214.method1271(250)) {
                            if (~class229.field3997 >= ~var94.field856 && ~(class229.field3997 - -8) < ~var94.field856 && class141.field2435 <= var94.field866 && var94.field866 < class141.field2435 + 8 && ~class64.field1171 == ~var94.field873) {
                                var94.field865 = 0;
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 148) {
                        int var96 = class32.field512.method1439(-124);
                        class227 var97 = class32.field512.method1480(-128);
                        int var98 = class32.field512.method1456(-9944);
                        if (~var96 <= -2 && var96 <= 8) {
                            if (var97.method1522(class54.field946, (byte) -56)) {
                                var97 = null;
                            }
                            class92.field1574[var96 + -1] = var97;
                            class14.field271[var96 + -1] = ~var98 == -1;
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 53) {
                        long var99 = class32.field512.method1469((byte) 41);
                        class32.field512.method1428(false);
                        long var101 = class32.field512.method1469((byte) 41);
                        long var103 = (long) class32.field512.method1447(0);
                        long var105 = (long) class32.field512.method1444(171285352);
                        boolean var107 = false;
                        int var108 = class32.field512.method1471(255);
                        long var109 = (var103 << 32) + var105;
                        int var111 = 0;
                        label1163: while (true) {
                            if (~var111 <= -101) {
                                if (~var108 >= -2) {
                                    if (~class252.field4363 != -2 && class49.field858 != 1) {
                                        for (int var112 = 0; ~var112 > ~class86.field1485; ++var112) {
                                            if (~class230.field4031[var112] == ~var99) {
                                                var107 = true;
                                                break label1163;
                                            }
                                        }
                                    } else {
                                        var107 = true;
                                    }
                                }
                                break;
                            }
                            if (class220.field3714[var111] == var109) {
                                var107 = true;
                                break;
                            }
                            ++var111;
                        }
                        if (!var107 && ~class251.field4348 == -1) {
                            class220.field3714[class53.field933] = var109;
                            class53.field933 = (class53.field933 - -1) % 100;
                            class227 var113 = class196.method1249(class67.method419(class32.field512, -27885).method1490(true));
                            if (var108 != 2 && var108 != 3) {
                                if (~var108 == -2) {
                                    class254.method1724(9, class76.method445((byte) -74, new class227[] { class88.field1531, class118.method744(var99, -122).method1527(-96) }), 21590, var113, class118.method744(var101, -123).method1527(-96));
                                } else {
                                    class254.method1724(9, class118.method744(var99, -118).method1527(-96), 21590, var113, class118.method744(var101, -119).method1527(-96));
                                }
                            } else {
                                class254.method1724(9, class76.method445((byte) -103, new class227[] { class105.field1897, class118.method744(var99, -128).method1527(-96) }), 21590, var113, class118.method744(var101, -119).method1527(-96));
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -108) {
                        class213.method1354(-1411020925);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 204) {
                        class134.field2318 = -1;
                        class67.field1213 = 0;
                        return true;
                    } else if (~class134.field2318 == -250) {
                        class250.method1676((byte) -88, class32.field512);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -146) {
                        int var114 = class32.field512.method1472(0);
                        int var115 = class32.field512.method1472(0);
                        int var116 = class32.field512.method1481(false);
                        int var117 = class32.field512.method1441(-114);
                        class105 var118 = class27.method137(var117, -954490064);
                        if (~var118.field1983 != ~var114 || var118.field1844 != var115 || ~var118.field1905 != ~var116) {
                            var118.field1905 = var116;
                            var118.field1844 = var115;
                            var118.field1983 = var114;
                            class198.method1268(121, var118);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 1) {
                        int var119 = class32.field512.method1478(-32053);
                        int var120 = class32.field512.method1481(false);
                        class7.method31(var120, true, var119);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 128) {
                        int var121 = class32.field512.method1441(-128);
                        int var122 = class32.field512.method1472(0);
                        int var123 = var122 >> 10 & 31;
                        int var124 = 31 & var122;
                        int var125 = 31 & var122 >> 5;
                        int var126 = (var123 << 19) + (var124 << 3) + (var125 << 11);
                        class105 var127 = class27.method137(var121, -954490064);
                        if (~var127.field1894 != ~var126) {
                            var127.field1894 = var126;
                            class198.method1268(115, var127);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 216) {
                        class60.method366((byte) 117);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -241) {
                        int var128 = class32.field512.method1434(90);
                        int var129 = class32.field512.method1472(0);
                        int var130 = class32.field512.method1481(false);
                        class124.method767(var130, -98);
                        class229.method1547((byte) 106, var128, var129);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 178) {
                        class237.method1579(true);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -130) {
                        int var131 = class32.field512.method1482(-128);
                        class220.method1396(var131, 18832);
                        class252.field4364[class76.method446(31, class123.field2217++)] = class76.method446(32767, var131);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -246) {
                        int var132 = class32.field512.method1478(-32053);
                        int var133 = class32.field512.method1447(0);
                        int var134 = class32.field512.method1434(5);
                        class105 var135 = class27.method137(var134, -954490064);
                        if (~var133 == -65536) {
                            var133 = -1;
                        }
                        if (var135.field1853) {
                            var135.field1879 = var133;
                            var135.field1987 = var132;
                            class178 var136 = class133.method815(var133, (byte) -70);
                            var135.field1983 = var136.field2999;
                            var135.field1905 = var136.field2987;
                            if (~var135.field1947 >= -1) {
                                if (~var135.field1943 < -1) {
                                    var135.field1905 = var135.field1905 * 32 / var135.field1943;
                                }
                            } else {
                                var135.field1905 = var135.field1905 * 32 / var135.field1947;
                            }
                            var135.field1893 = var136.field3007;
                            var135.field1937 = var136.field3061;
                            var135.field1844 = var136.field3002;
                            var135.field1962 = var136.field2990;
                            class198.method1268(121, var135);
                        } else {
                            if (~var133 == 0) {
                                class134.field2318 = -1;
                                var135.field1850 = 0;
                                return true;
                            }
                            class178 var137 = class133.method815(var133, (byte) -70);
                            var135.field1910 = var133;
                            var135.field1983 = var137.field2999;
                            var135.field1844 = var137.field3002;
                            var135.field1905 = var137.field2987 * 100 / var132;
                            var135.field1850 = 4;
                            class198.method1268(96, var135);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -176) {
                        if (~class179.field3073 != -1) {
                            class218.field3675 = class32.field512.method1480(-126);
                        } else {
                            class218.field3675 = class181.field3100;
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 45) {
                        long var138 = class32.field512.method1469((byte) 41);
                        int var140 = class32.field512.method1447(0);
                        boolean var141 = true;
                        int var142 = class32.field512.method1471(255);
                        class227 var143 = class91.field1558;
                        if (~var138 > -1L) {
                            var141 = false;
                            var138 &= Long.MAX_VALUE;
                        }
                        if (var140 > 0) {
                            var143 = class32.field512.method1480(-122);
                        }
                        class227 var144 = class118.method744(var138, -117).method1527(-96);
                        for (int var145 = 0; ~var145 > ~class166.field2781; ++var145) {
                            if (~class28.field460[var145] == ~var138) {
                                if (class151.field2637[var145] != var140) {
                                    class151.field2637[var145] = var140;
                                    if (var140 > 0) {
                                        class130.method799(1403, 5, class91.field1558, class76.method445((byte) -116, new class227[] { var144, field4096 }));
                                    }
                                    if (var140 == 0) {
                                        class130.method799(1403, 5, class91.field1558, class76.method445((byte) 53, new class227[] { var144, class91.field1567 }));
                                    }
                                }
                                var144 = null;
                                class21.field363[var145] = var143;
                                class175.field2915[var145] = var142;
                                class71.field1248[var145] = var141;
                                break;
                            }
                        }
                        if (var144 != null && ~class166.field2781 > -201) {
                            class28.field460[class166.field2781] = var138;
                            class201.field3442[class166.field2781] = var144;
                            class151.field2637[class166.field2781] = var140;
                            class21.field363[class166.field2781] = var143;
                            class175.field2915[class166.field2781] = var142;
                            class71.field1248[class166.field2781] = var141;
                            ++class166.field2781;
                        }
                        class152.field2645 = class77.field1356;
                        boolean var146 = false;
                        int var147 = class166.field2781;
                        while (var147 > 0) {
                            --var147;
                            boolean var148 = true;
                            for (int var149 = 0; ~var147 < ~var149; ++var149) {
                                if (~class151.field2637[var149] != ~class131.field2286 && ~class151.field2637[var149 + 1] == ~class131.field2286 || class151.field2637[var149] == 0 && class151.field2637[var149 + 1] != 0) {
                                    var148 = false;
                                    int var150 = class151.field2637[var149];
                                    class151.field2637[var149] = class151.field2637[var149 + 1];
                                    class151.field2637[var149 + 1] = var150;
                                    class227 var151 = class21.field363[var149];
                                    class21.field363[var149] = class21.field363[var149 + 1];
                                    class21.field363[var149 + 1] = var151;
                                    class227 var152 = class201.field3442[var149];
                                    class201.field3442[var149] = class201.field3442[var149 + 1];
                                    class201.field3442[var149 + 1] = var152;
                                    long var153 = class28.field460[var149];
                                    class28.field460[var149] = class28.field460[var149 + 1];
                                    class28.field460[var149 + 1] = var153;
                                    int var155 = class175.field2915[var149];
                                    class175.field2915[var149] = class175.field2915[var149 + 1];
                                    class175.field2915[var149 + 1] = var155;
                                    boolean var156 = class71.field1248[var149];
                                    class71.field1248[var149] = class71.field1248[var149 + 1];
                                    class71.field1248[var149 + 1] = var156;
                                }
                            }
                            if (var148) {
                                break;
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 12) {
                        int var157 = class32.field512.method1478(-32053);
                        int var158 = class32.field512.method1447(0);
                        class105 var159;
                        if (var157 < 0) {
                            var159 = null;
                        } else {
                            var159 = class27.method137(var157, -954490064);
                        }
                        if (~var157 > 69999) {
                            var158 += 32768;
                        }
                        if (var159 != null) {
                            for (int var160 = 0; var159.field1865.length > var160; ++var160) {
                                var159.field1865[var160] = 0;
                                var159.field1921[var160] = 0;
                            }
                        }
                        class252.method1685(255, var158);
                        int var161 = class32.field512.method1447(0);
                        for (int var162 = 0; ~var162 > ~var161; ++var162) {
                            int var163 = class32.field512.method1472(0);
                            int var164 = class32.field512.method1456(-9944);
                            if (var164 == 255) {
                                var164 = class32.field512.method1441(-118);
                            }
                            if (var159 != null && ~var159.field1865.length < ~var162) {
                                var159.field1865[var162] = var163;
                                var159.field1921[var162] = var164;
                            }
                            class123.method762(var158, var164, var162, (byte) 18, var163 - 1);
                        }
                        if (var159 != null) {
                            class198.method1268(125, var159);
                        }
                        class114.method722(0);
                        class252.field4364[class76.method446(class123.field2217++, 31)] = class76.method446(var158, 32767);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -94) {
                        class227 var165 = class32.field512.method1480(18);
                        if (var165.method1495(23348, class40.field648)) {
                            class227 var166 = var165.method1532((byte) 109, 0, var165.method1506(-1646, class165.field2768));
                            long var167 = var166.method1485(122);
                            boolean var169 = false;
                            for (int var170 = 0; var170 < class86.field1485; ++var170) {
                                if (class230.field4031[var170] == var167) {
                                    var169 = true;
                                    break;
                                }
                            }
                            if (!var169 && class251.field4348 == 0) {
                                class130.method799(1403, 4, var166, class195.field3323);
                            }
                        } else if (!var165.method1495(23348, class21.field380)) {
                            if (var165.method1495(23348, class66.field1201)) {
                                class227 var171 = var165.method1532((byte) 98, 0, var165.method1506(-1646, class165.field2768));
                                long var172 = var171.method1485(122);
                                boolean var174 = false;
                                for (int var175 = 0; var175 < class86.field1485; ++var175) {
                                    if (class230.field4031[var175] == var172) {
                                        var174 = true;
                                        break;
                                    }
                                }
                                if (!var174 && class251.field4348 == 0) {
                                    class130.method799(1403, 10, var171, class91.field1558);
                                }
                            } else if (var165.method1495(23348, class32.field527)) {
                                class227 var176 = var165.method1532((byte) 113, 0, var165.method1506(-1646, class32.field527));
                                class130.method799(1403, 11, class91.field1558, var176);
                            } else if (!var165.method1495(23348, class246.field4295)) {
                                if (!var165.method1495(23348, class242.field4204)) {
                                    if (var165.method1495(23348, class104.field1814)) {
                                        class227 var177 = var165.method1532((byte) 102, 0, var165.method1506(-1646, class165.field2768));
                                        long var178 = var177.method1485(122);
                                        boolean var180 = false;
                                        for (int var181 = 0; class86.field1485 > var181; ++var181) {
                                            if (class230.field4031[var181] == var178) {
                                                var180 = true;
                                                break;
                                            }
                                        }
                                        if (!var180 && class251.field4348 == 0) {
                                            class130.method799(1403, 14, var177, class91.field1558);
                                        }
                                    } else if (var165.method1495(23348, class91.field1556)) {
                                        class227 var182 = var165.method1532((byte) 78, 0, var165.method1506(-1646, class165.field2768));
                                        boolean var183 = false;
                                        long var184 = var182.method1485(122);
                                        for (int var186 = 0; class86.field1485 > var186; ++var186) {
                                            if (class230.field4031[var186] == var184) {
                                                var183 = true;
                                                break;
                                            }
                                        }
                                        if (!var183 && ~class251.field4348 == -1) {
                                            class130.method799(1403, 15, var182, class91.field1558);
                                        }
                                    } else if (!var165.method1495(23348, class128.field2256)) {
                                        class130.method799(1403, 0, class91.field1558, var165);
                                    } else {
                                        class227 var187 = var165.method1532((byte) 94, 0, var165.method1506(-1646, class165.field2768));
                                        boolean var188 = false;
                                        long var189 = var187.method1485(122);
                                        for (int var191 = 0; class86.field1485 > var191; ++var191) {
                                            if (~class230.field4031[var191] == ~var189) {
                                                var188 = true;
                                                break;
                                            }
                                        }
                                        if (!var188 && ~class251.field4348 == -1) {
                                            class130.method799(1403, 16, var187, class91.field1558);
                                        }
                                    }
                                } else {
                                    class227 var192 = var165.method1532((byte) 88, 0, var165.method1506(-1646, class242.field4204));
                                    if (~class251.field4348 == -1) {
                                        class130.method799(1403, 13, class91.field1558, var192);
                                    }
                                }
                            } else {
                                class227 var193 = var165.method1532((byte) 57, 0, var165.method1506(-1646, class246.field4295));
                                if (~class251.field4348 == -1) {
                                    class130.method799(1403, 12, class91.field1558, var193);
                                }
                            }
                        } else {
                            class227 var194 = var165.method1532((byte) 41, 0, var165.method1506(-1646, class165.field2768));
                            boolean var195 = false;
                            long var196 = var194.method1485(122);
                            for (int var198 = 0; var198 < class86.field1485; ++var198) {
                                if (~class230.field4031[var198] == ~var196) {
                                    var195 = true;
                                    break;
                                }
                            }
                            if (!var195 && ~class251.field4348 == -1) {
                                class227 var199 = var165.method1532((byte) 100, var165.method1506(-1646, class165.field2768) - -1, -9 + var165.method1521((byte) 57));
                                class130.method799(1403, 8, var194, var199);
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 26) {
                        int var200 = class32.field512.method1481(false);
                        int var201 = class32.field512.method1441(-123);
                        if (~var200 == -65536) {
                            var200 = -1;
                        }
                        class105 var202 = class27.method137(var201, -954490064);
                        if (~var202.field1850 != -2 || ~var202.field1910 != ~var200) {
                            var202.field1910 = var200;
                            var202.field1850 = 1;
                            class198.method1268(92, var202);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 196) {
                        int var203 = class32.field512.method1447(0);
                        if (~var203 == -65536) {
                            var203 = -1;
                        }
                        int var204 = class32.field512.method1471(255);
                        int var205 = class32.field512.method1447(0);
                        class72.method435(var203, (byte) -50, var205, var204);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -210) {
                        int var206 = class32.field512.method1478(-32053);
                        int var207 = class32.field512.method1447(0);
                        class105 var208;
                        if (~var206 <= -1) {
                            var208 = class27.method137(var206, -954490064);
                        } else {
                            var208 = null;
                        }
                        if (~var206 > 69999) {
                            var207 += 32768;
                        }
                        while (class32.field512.field3879 < class179.field3073) {
                            int var209 = class32.field512.method1467(false);
                            int var210 = class32.field512.method1447(0);
                            int var211 = 0;
                            if (~var210 != -1) {
                                var211 = class32.field512.method1471(255);
                                if (~var211 == -256) {
                                    var211 = class32.field512.method1478(-32053);
                                }
                            }
                            if (var208 != null && ~var209 <= -1 && ~var208.field1865.length < ~var209) {
                                var208.field1865[var209] = var210;
                                var208.field1921[var209] = var211;
                            }
                            class123.method762(var207, var211, var209, (byte) 57, var210 + -1);
                        }
                        if (var208 != null) {
                            class198.method1268(101, var208);
                        }
                        class114.method722(0);
                        class252.field4364[class76.method446(class123.field2217++, 31)] = class76.method446(32767, var207);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 212) {
                        class193.method1226(class32.field512.method1480(-113), -2);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 228) {
                        int var212 = class32.field512.method1478(-32053);
                        class182 var213 = (class182) class58.field1070.method1298(-115, (long) var212);
                        if (var213 != null) {
                            class81.method470(true, -1, var213);
                        }
                        if (class125.field2249 != null) {
                            class198.method1268(76, class125.field2249);
                            class125.field2249 = null;
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -240) {
                        int var214 = class32.field512.method1472(0);
                        int var215 = class32.field512.method1473(false);
                        int var216 = class32.field512.method1447(0);
                        int var217 = class32.field512.method1472(0);
                        if (var215 >> 30 != 0) {
                            int var218 = ((var215 & 268434240) >> 14) + -class192.field3267;
                            int var219 = (16383 & var215) - class78.field1367;
                            int var220 = 3 & var215 >> 28;
                            if (~var218 <= -1 && var219 >= 0 && var218 < 104 && var219 < 104) {
                                int var221 = var219 * 128 + 64;
                                int var222 = var218 * 128 + 64;
                                class18 var223 = new class18(var217, var220, var222, var221, -var216 + class193.method1227(var222, true, var220, var221), var214, class253.field4393);
                                class235.field4074.method1272(5664, new class75(var223));
                            }
                        } else if (~(var215 >> 29) != -1) {
                            int var224 = var215 & 65535;
                            class195 var225 = class220.field3715[var224];
                            if (var225 != null) {
                                var225.field97 = class253.field4393 + var214;
                                var225.field46 = var216;
                                var225.field109 = 0;
                                if (var225.field97 > class253.field4393) {
                                    var225.field109 = -1;
                                }
                                var225.field69 = var217;
                                var225.field110 = 0;
                                if (~var225.field69 == -65536) {
                                    var225.field69 = -1;
                                }
                            }
                        } else if (~(var215 >> 28) != -1) {
                            int var226 = var215 & 65535;
                            class225 var227;
                            if (~class254.field4473 != ~var226) {
                                var227 = class27.field446[var226];
                            } else {
                                var227 = class216.field3639;
                            }
                            if (var227 != null) {
                                var227.field97 = class253.field4393 + var214;
                                var227.field109 = 0;
                                if (~var227.field97 < ~class253.field4393) {
                                    var227.field109 = -1;
                                }
                                var227.field69 = var217;
                                var227.field110 = 0;
                                if (var227.field69 == 65535) {
                                    var227.field69 = -1;
                                }
                                var227.field46 = var216;
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -31) {
                        int var228 = class32.field512.method1472(0);
                        if (var228 == 65535) {
                            var228 = -1;
                        }
                        class195.method1235((byte) -91, var228);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -119) {
                        int var229 = class32.field512.method1461(0);
                        int var230 = class32.field512.method1447(0);
                        if (~var230 == -65536) {
                            var230 = -1;
                        }
                        class44.method237(var230, var229, -31668);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 84) {
                        class229.field3997 = class32.field512.method1471(255);
                        class141.field2435 = class32.field512.method1456(-9944);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 9) {
                        int var231 = class32.field512.method1471(255);
                        int var232 = class32.field512.method1471(255);
                        int var233 = class32.field512.method1447(0);
                        int var234 = class32.field512.method1471(255);
                        int var235 = class32.field512.method1471(255);
                        class166.method1022(var232, var235, var233, var231, var234, -115);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 161) {
                        class19.field325 = class77.field1356;
                        long var236 = class32.field512.method1469((byte) 41);
                        if (~var236 == -1L) {
                            class44.field737 = 0;
                            class143.field2469 = null;
                            class79.field1382 = null;
                            class134.field2318 = -1;
                            class230.field4019 = null;
                            return true;
                        } else {
                            long var238 = class32.field512.method1469((byte) 41);
                            class143.field2469 = class118.method744(var238, -116);
                            class230.field4019 = class118.method744(var236, -117);
                            class215.field3636 = class32.field512.method1428(false);
                            int var240 = class32.field512.method1471(255);
                            if (~var240 == -256) {
                                class134.field2318 = -1;
                                return true;
                            } else {
                                class44.field737 = var240;
                                class65[] var241 = new class65[100];
                                for (int var242 = 0; var242 < class44.field737; ++var242) {
                                    var241[var242] = new class65();
                                    var241[var242].field1113 = class32.field512.method1469((byte) 41);
                                    var241[var242].field1189 = class118.method744(var241[var242].field1113, -118);
                                    var241[var242].field1193 = class32.field512.method1447(0);
                                    var241[var242].field1192 = class32.field512.method1428(false);
                                    var241[var242].field1190 = class32.field512.method1480(-121);
                                    if (class151.field2632 == var241[var242].field1113) {
                                        class228.field3983 = var241[var242].field1192;
                                    }
                                }
                                boolean var243 = false;
                                int var244 = class44.field737;
                                while (~var244 < -1) {
                                    boolean var245 = true;
                                    --var244;
                                    for (int var246 = 0; var244 > var246; ++var246) {
                                        if (~var241[var246].field1189.method1491(var241[var246 + 1].field1189, 5177) < -1) {
                                            class65 var247 = var241[var246];
                                            var241[var246] = var241[var246 + 1];
                                            var245 = false;
                                            var241[var246 + 1] = var247;
                                        }
                                    }
                                    if (var245) {
                                        break;
                                    }
                                }
                                class79.field1382 = var241;
                                class134.field2318 = -1;
                                return true;
                            }
                        }
                    } else if (class134.field2318 == 121) {
                        int var248 = class32.field512.method1434(66);
                        class227 var249 = class32.field512.method1480(-126);
                        class105 var250 = class27.method137(var248, -954490064);
                        if (!var249.method1487(127, var250.field1982)) {
                            var250.field1982 = var249;
                            class198.method1268(119, var250);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 163) {
                        int var251 = class32.field512.method1471(255);
                        int var252 = class32.field512.method1471(255);
                        int var253 = class32.field512.method1447(0);
                        int var254 = class32.field512.method1471(255);
                        int var255 = class32.field512.method1471(255);
                        class117.method739(true, var253, var254, var251, var252, 128, var255);
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -61) {
                        int var256 = class32.field512.method1482(-128);
                        int var257 = class32.field512.method1471(255);
                        int var258 = class32.field512.method1447(0);
                        class195 var259 = class220.field3715[var258];
                        if (var259 != null) {
                            class33.method174(var256, var259, 0, var257);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 103) {
                        int var260 = class32.field512.method1472(0);
                        int var261 = class32.field512.method1478(-32053);
                        class105 var262 = class27.method137(var261, -954490064);
                        if (var262 != null && var262.field1829 == 0) {
                            if (var262.field1935 - var262.field1952 < var260) {
                                var260 = -var262.field1952 + var262.field1935;
                            }
                            if (~var260 > -1) {
                                var260 = 0;
                            }
                            if (~var262.field1986 != ~var260) {
                                var262.field1986 = var260;
                                class198.method1268(113, var262);
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -20) {
                        class141.field2435 = class32.field512.method1439(-113);
                        class229.field3997 = class32.field512.method1426(false);
                        while (~class32.field512.field3879 > ~class179.field3073) {
                            class134.field2318 = class32.field512.method1471(255);
                            class186.method1185(115);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 51) {
                        long var263 = class32.field512.method1469((byte) 41);
                        class32.field512.method1428(false);
                        long var265 = class32.field512.method1469((byte) 41);
                        long var267 = (long) class32.field512.method1447(0);
                        long var269 = (long) class32.field512.method1444(171285352);
                        int var271 = class32.field512.method1471(255);
                        int var272 = class32.field512.method1447(0);
                        long var273 = (var267 << 32) + var269;
                        boolean var275 = false;
                        int var276 = 0;
                        label1330: while (true) {
                            if (var276 >= 100) {
                                if (var271 <= 1) {
                                    for (int var277 = 0; ~class86.field1485 < ~var277; ++var277) {
                                        if (~class230.field4031[var277] == ~var263) {
                                            var275 = true;
                                            break label1330;
                                        }
                                    }
                                }
                                break;
                            }
                            if (class220.field3714[var276] == var273) {
                                var275 = true;
                                break;
                            }
                            ++var276;
                        }
                        if (!var275 && class251.field4348 == 0) {
                            class220.field3714[class53.field933] = var273;
                            class53.field933 = (class53.field933 + 1) % 100;
                            class227 var278 = class38.method201(var272, -16756).method797(class32.field512, -48);
                            if (~var271 != -3 && ~var271 != -4) {
                                if (~var271 != -2) {
                                    class181.method1160(class118.method744(var263, -128).method1527(-96), 0, var272, var278, 20, class118.method744(var265, -124).method1527(-96));
                                } else {
                                    class181.method1160(class76.method445((byte) -110, new class227[] { class88.field1531, class118.method744(var263, -117).method1527(-96) }), 0, var272, var278, 20, class118.method744(var265, -118).method1527(-96));
                                }
                            } else {
                                class181.method1160(class76.method445((byte) 29, new class227[] { class105.field1897, class118.method744(var263, -118).method1527(-96) }), 0, var272, var278, 20, class118.method744(var265, -120).method1527(-96));
                            }
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -60) {
                        if (class116.field2131 != -1) {
                            class7.method27(0, class116.field2131, false);
                        }
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 == 155) {
                        int var279 = class32.field512.method1471(255);
                        if (~class32.field512.method1471(255) != -1) {
                            --class32.field512.field3879;
                            class58.field1075[var279] = new class38(class32.field512);
                        } else {
                            class58.field1075[var279] = new class38();
                        }
                        class200.field3438 = class77.field1356;
                        class134.field2318 = -1;
                        return true;
                    } else if (~class134.field2318 == -6) {
                        int var280 = class32.field512.method1473(false);
                        class105 var281 = class27.method137(var280, -954490064);
                        for (int var282 = 0; ~var282 > ~var281.field1865.length; ++var282) {
                            var281.field1865[var282] = -1;
                            var281.field1865[var282] = 0;
                        }
                        class198.method1268(87, var281);
                        class134.field2318 = -1;
                        return true;
                    } else if (class134.field2318 != 7 && ~class134.field2318 != -86 && ~class134.field2318 != -124 && class134.field2318 != 11 && ~class134.field2318 != -189 && ~class134.field2318 != -216 && class134.field2318 != 247 && ~class134.field2318 != -208 && ~class134.field2318 != -147 && class134.field2318 != 25 && class134.field2318 != 112 && ~class134.field2318 != -66) {
                        if (~class134.field2318 == -226) {
                            byte[] var283 = new byte[class179.field3073];
                            class32.field512.method661(0, var283, class179.field3073, 0);
                            class105.method652(class102.method623(0, -1, var283, class179.field3073), true, -1);
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -115) {
                            int var284 = class32.field512.method1478(-32053);
                            class192.field3258 = class61.field1123.method1590((byte) -43, var284);
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -192) {
                            boolean var285 = class32.field512.method1456(-9944) == 1;
                            int var286 = class32.field512.method1478(-32053);
                            class105 var287 = class27.method137(var286, -954490064);
                            if (var287.field1860 == !var285) {
                                var287.field1860 = var285;
                                class198.method1268(83, var287);
                            }
                            class134.field2318 = -1;
                            return true;
                        } else if (class134.field2318 == 214) {
                            long var288 = class32.field512.method1469((byte) 41);
                            class227 var290 = class196.method1249(class67.method419(class32.field512, -27885).method1490(true));
                            class130.method799(1403, 6, class118.method744(var288, -116).method1527(-96), var290);
                            class134.field2318 = -1;
                            return true;
                        } else if (class134.field2318 == 16) {
                            int var291 = class32.field512.method1447(0);
                            class227 var292 = class32.field512.method1480(-124);
                            int var293 = class32.field512.method1447(0);
                            class124.method767(var293, -104);
                            class109.method673(8, var292, var291);
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -224) {
                            class89.method533(-51, false);
                            class134.field2318 = -1;
                            return true;
                        } else if (class134.field2318 == 171) {
                            int var294 = class32.field512.method1434(69);
                            int var295 = 16383 & var294;
                            int var296 = (864366875 & var294) >> 28;
                            int var297 = (268423586 & var294) >> 14;
                            int var298 = class32.field512.method1426(false);
                            int var299 = var298 >> 2;
                            int var300 = class63.field1149[var299];
                            int var301 = class32.field512.method1472(0);
                            if (var301 == 65535) {
                                var301 = -1;
                            }
                            int var302 = var295 - class78.field1367;
                            int var303 = var297 - class192.field3267;
                            int var304 = 3 & var298;
                            class12.method56(var304, var303, var300, var302, var296, -4, var301, var299);
                            class134.field2318 = -1;
                            return true;
                        } else if (class134.field2318 == 13) {
                            int var305 = class32.field512.method1473(false);
                            class105 var306 = class27.method137(var305, -954490064);
                            var306.field1850 = 3;
                            var306.field1910 = class216.field3639.field3820.method337(-51);
                            class198.method1268(98, var306);
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -82) {
                            int var307 = class32.field512.method1426(false);
                            int var308 = class32.field512.method1439(-118);
                            int var309 = class32.field512.method1456(-9944);
                            class64.field1171 = var308 >> 1;
                            class216.field3639.method18(var309, var307, (var308 & 1) == 1, 94);
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -92) {
                            int var310 = class32.field512.method1482(-128);
                            int var311 = class32.field512.method1478(-32053);
                            int var312 = class32.field512.method1472(0);
                            class105 var313 = class27.method137(var311, -954490064);
                            var313.field1948 = (var312 << 16) - -var310;
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -200) {
                            int var314 = class32.field512.method1478(-32053);
                            int var315 = class32.field512.method1478(-32053);
                            class182 var316 = (class182) class58.field1070.method1298(-103, (long) var314);
                            class182 var317 = (class182) class58.field1070.method1298(-120, (long) var315);
                            if (var317 != null) {
                                class81.method470(var316 == null || var316.field3106 != var317.field3106, -1, var317);
                            }
                            if (var316 != null) {
                                var316.method369(-20);
                                class58.field1070.method1300(var316, (long) var315, -2875);
                            }
                            class105 var318 = class27.method137(var314, -954490064);
                            if (var318 != null) {
                                class198.method1268(80, var318);
                            }
                            class105 var319 = class27.method137(var315, -954490064);
                            if (var319 != null) {
                                class198.method1268(98, var319);
                                class118.method745(var319, true, (byte) 34);
                            }
                            if (~class116.field2131 != 0) {
                                class7.method27(1, class116.field2131, false);
                            }
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -225) {
                            class89.method533(-102, true);
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -128) {
                            int var320 = class32.field512.method1471(255);
                            int var321 = class32.field512.method1471(255);
                            int var322 = class32.field512.method1471(255);
                            int var323 = class32.field512.method1471(255);
                            int var324 = class32.field512.method1447(0);
                            class11.field222[var320] = true;
                            class197.field3380[var320] = var321;
                            class120.field2190[var320] = var322;
                            class258.field4512[var320] = var323;
                            class89.field1544[var320] = var324;
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -21) {
                            int var325 = class32.field512.method1481(false);
                            int var326 = class32.field512.method1471(255);
                            if (var326 == 2) {
                                class172.method1096(25);
                            }
                            class116.field2131 = var325;
                            class230.method1552((byte) 10, var325);
                            class12.method59(false, (byte) 112);
                            class60.method372((byte) -76, class116.field2131);
                            for (int var327 = 0; ~var327 > -101; ++var327) {
                                class10.field182[var327] = true;
                            }
                            class134.field2318 = -1;
                            return true;
                        } else if (class134.field2318 == 255) {
                            int var328 = class32.field512.method1481(false);
                            int var329 = class32.field512.method1447(0);
                            class29.field476 = var329;
                            class24.field409 = var328;
                            class194.method1232((byte) 46);
                            class134.field2318 = -1;
                            return true;
                        } else if (~class134.field2318 == -161) {
                            class86.field1485 = class179.field3073 / 8;
                            for (int var330 = 0; ~class86.field1485 < ~var330; ++var330) {
                                class230.field4031[var330] = class32.field512.method1469((byte) 41);
                                class249.field4321[var330] = class118.method744(class230.field4031[var330], -126);
                            }
                            class134.field2318 = -1;
                            class152.field2645 = class77.field1356;
                            return true;
                        } else if (~class134.field2318 != -71) {
                            if (~class134.field2318 == -221) {
                                class114.method722(0);
                                class153.field2656 = class32.field512.method1433(109);
                                class134.field2318 = -1;
                                class216.field3649 = class77.field1356;
                                return true;
                            } else if (~class134.field2318 == -196) {
                                int var334 = class32.field512.method1478(-32053);
                                int var335 = class32.field512.method1481(false);
                                int var336 = class32.field512.method1481(false);
                                int var337 = class32.field512.method1473(false);
                                if (var336 == 65535) {
                                    var336 = -1;
                                }
                                if (~var335 == -65536) {
                                    var335 = -1;
                                }
                                for (int var338 = var335; var336 >= var338; ++var338) {
                                    long var339 = ((long) var337 << 32) + (long) var338;
                                    class60 var341 = class184.field3133.method1298(-105, var339);
                                    if (var341 != null) {
                                        var341.method369(127);
                                    }
                                    class184.field3133.method1300(new class216(var334), var339, -2875);
                                }
                                class134.field2318 = -1;
                                return true;
                            } else if (class134.field2318 == 119) {
                                class227 var342 = class32.field512.method1480(-114);
                                Object[] var343 = new Object[1 + var342.method1521((byte) 81)];
                                for (int var344 = var342.method1521((byte) 22) + -1; ~var344 <= -1; --var344) {
                                    if (var342.method1533((byte) 39, var344) != 115) {
                                        var343[var344 + 1] = new Integer(class32.field512.method1478(-32053));
                                    } else {
                                        var343[var344 + 1] = class32.field512.method1480(-122);
                                    }
                                }
                                var343[0] = new Integer(class32.field512.method1478(-32053));
                                class34 var345 = new class34();
                                var345.field568 = var343;
                                class218.method1377(var345, false);
                                class134.field2318 = -1;
                                return true;
                            } else if (~class134.field2318 == -112) {
                                for (int var346 = 0; ~class139.field2416.length < ~var346; ++var346) {
                                    if (class139.field2416[var346] != class10.field189[var346]) {
                                        class139.field2416[var346] = class10.field189[var346];
                                        class225.method1417(var346, (byte) 111);
                                        class76.field1326[class76.method446(31, class99.field1725++)] = var346;
                                    }
                                }
                                class134.field2318 = -1;
                                return true;
                            } else if (class134.field2318 == 3) {
                                class227 var347 = class32.field512.method1480(118);
                                int var348 = class32.field512.method1447(0);
                                int var349 = class32.field512.method1472(0);
                                class124.method767(var348, -124);
                                class109.method673(8, var347, var349);
                                class134.field2318 = -1;
                                return true;
                            } else if (~class134.field2318 == -3) {
                                class76.field1331 = class32.field512.method1471(255);
                                class185.field3155 = class32.field512.method1471(255);
                                class245.field4291 = class32.field512.method1471(255);
                                class134.field2318 = -1;
                                return true;
                            } else {
                                class149.method949("T1 - " + class134.field2318 + "," + class112.field2081 + "," + class245.field4275 + " - " + class179.field3073, (Throwable) null, -111);
                                class188.method1202(true);
                                return true;
                            }
                        } else {
                            int var331 = class32.field512.method1471(255);
                            class190 var332 = new class190();
                            int var333 = var331 >> 6;
                            var332.field3226 = 63 & var331;
                            var332.field3220 = class32.field512.method1471(255);
                            if (~var332.field3220 <= -1 && class228.field3978.length > var332.field3220) {
                                if (var332.field3226 != 1 && var332.field3226 != 10) {
                                    if (var332.field3226 >= 2 && var332.field3226 <= 6) {
                                        if (~var332.field3226 == -3) {
                                            var332.field3211 = 64;
                                            var332.field3212 = 64;
                                        }
                                        if (~var332.field3226 == -4) {
                                            var332.field3212 = 64;
                                            var332.field3211 = 0;
                                        }
                                        if (~var332.field3226 == -5) {
                                            var332.field3212 = 64;
                                            var332.field3211 = 128;
                                        }
                                        if (var332.field3226 == 5) {
                                            var332.field3211 = 64;
                                            var332.field3212 = 0;
                                        }
                                        if (var332.field3226 == 6) {
                                            var332.field3212 = 128;
                                            var332.field3211 = 64;
                                        }
                                        var332.field3226 = 2;
                                        var332.field3225 = class32.field512.method1447(0);
                                        var332.field3219 = class32.field512.method1447(0);
                                        var332.field3216 = class32.field512.method1471(255);
                                    }
                                } else {
                                    var332.field3221 = class32.field512.method1447(0);
                                    class32.field512.field3879 += 3;
                                }
                                var332.field3213 = class32.field512.method1447(0);
                                if (~var332.field3213 == -65536) {
                                    var332.field3213 = -1;
                                }
                                class229.field3994[var333] = var332;
                            }
                            class134.field2318 = -1;
                            return true;
                        }
                    } else {
                        class186.method1185(115);
                        class134.field2318 = -1;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(BLn;)V")
    public static final void method1574(byte arg0, class138 arg1) {
        ++field4085;
        class52.field918 = arg1.method869(class231.field4037, 0);
        class223.field3780 = arg1.method869(class49.field869, 0);
        if (arg0 > -86) {
            field4093 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZLta;)V")
    public static final void method1575(boolean arg0, class105 arg1) {
        ++field4091;
        int var2 = arg1.field1975;
        if (var2 == 324) {
            if (class186.field3161 == -1) {
                class60.field1116 = arg1.field1904;
                class186.field3161 = arg1.field1931;
            }
            if (!class226.field3849.field1023) {
                arg1.field1931 = class60.field1116;
            } else {
                arg1.field1931 = class186.field3161;
            }
        } else if (~var2 == -326) {
            if (class186.field3161 == -1) {
                class186.field3161 = arg1.field1931;
                class60.field1116 = arg1.field1904;
            }
            if (class226.field3849.field1023) {
                arg1.field1931 = class60.field1116;
            } else {
                arg1.field1931 = class186.field3161;
            }
        } else {
            if (arg0) {
                method1574((byte) -86, (class138) null);
            }
            if (var2 == 327) {
                arg1.field1983 = 150;
                arg1.field1844 = (int) (Math.sin((double) class253.field4393 / 40.0D) * 256.0D) & 2047;
                arg1.field1850 = 5;
                arg1.field1910 = -1;
            } else if (~var2 == -329) {
                if (class216.field3639.field3819 == null) {
                    arg1.field1910 = 0;
                } else {
                    arg1.field1983 = 150;
                    arg1.field1844 = (int) (Math.sin((double) class253.field4393 / 40.0D) * 256.0D) & 2047;
                    arg1.field1850 = 5;
                    arg1.field1910 = ((int) class216.field3639.field3819.method1485(122) << 11) - -2047;
                    arg1.field1914 = class216.field3639.field82;
                    arg1.field1944 = class216.field3639.field72;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 3) {
            method1574((byte) 69, (class138) null);
        }
        ++field4090;
        if (~arg3 == ~arg7 && arg4 == arg6 && ~arg5 == ~arg8 && ~arg1 == ~arg9) {
            class221.method1399(arg2, (byte) 124, arg7, arg1, arg6, arg5);
        } else {
            int var10 = arg6;
            int var11 = arg7;
            int var12 = arg7 * 3;
            int var13 = arg6 * 3;
            int var14 = arg3 * 3;
            int var15 = arg4 * 3;
            int var16 = arg8 * 3;
            int var17 = arg5 + var14 - (var16 - -arg7);
            int var18 = arg9 * 3;
            int var19 = var16 - var14 - var14 - -var12;
            int var20 = -arg6 + var15 + -var18 + arg1;
            int var21 = -var15 - -var13 + var18 + -var15;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var22 * var24;
                int var29 = var19 * var25;
                int var30 = var21 * var25;
                int var31 = var20 * var26;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var28 >> 12) + arg7;
                int var34 = (var31 + var32 + var30 >> 12) + arg6;
                class221.method1399(arg2, (byte) 116, var11, var34, var10, var33);
                var10 = var34;
                var11 = var33;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field4082;
        int[] var3 = super.field4215.method984(arg1, 0);
        int var4 = -69 % ((-15 - arg0) / 51);
        if (super.field4215.field2707) {
            for (int var5 = 0; ~class212.field3586 < ~var5; ++var5) {
                int var6 = (class212.field3585[var5] << 12) / this.field4087 + this.field4083;
                int var7 = var6;
                int var8 = (class148.field2582[arg1] << 12) / this.field4087 + this.field4081;
                int var9 = var6;
                int var10 = var8;
                int var11 = var8;
                int var12 = var8 * var8 >> 12;
                int var13 = 0;
                int var14 = var6 * var6 >> 12;
                while (var12 + var14 < 16384 && ~var13 > ~this.field4088) {
                    ++var13;
                    var11 = (var9 * var11 >> 12) * 2 + var10;
                    var9 = -var12 + var7 + var14;
                    var14 = var9 * var9 >> 12;
                    var12 = var11 * var11 >> 12;
                }
                var3[var5] = ~var13 > ~(this.field4088 + -1) ? (var13 << 12) / this.field4088 : 0;
            }
        }
        return var3;
    }
}
