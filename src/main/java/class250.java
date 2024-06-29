import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class250 extends class97 {

    @OriginalMember(owner = "client!jaa", name = "mb", descriptor = "Z")
    public boolean field3399 = false;

    @OriginalMember(owner = "client!jaa", name = "Ab", descriptor = "Z")
    public boolean field3413 = false;

    @OriginalMember(owner = "client!jaa", name = "rb", descriptor = "Z")
    public boolean field3404 = false;

    @OriginalMember(owner = "client!jaa", name = "Cb", descriptor = "Z")
    public boolean field3415 = false;

    @OriginalMember(owner = "client!jaa", name = "Hb", descriptor = "Z")
    public boolean field3420 = false;

    @OriginalMember(owner = "client!jaa", name = "S", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!jaa", name = "kb", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!jaa", name = "lb", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!jaa", name = "nb", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!jaa", name = "ob", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!jaa", name = "pb", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!jaa", name = "qb", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!jaa", name = "sb", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!jaa", name = "tb", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!jaa", name = "ub", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!jaa", name = "vb", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!jaa", name = "wb", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!jaa", name = "xb", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!jaa", name = "yb", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!jaa", name = "zb", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!jaa", name = "Bb", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!jaa", name = "Db", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!jaa", name = "Eb", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!jaa", name = "Fb", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!jaa", name = "Gb", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!jaa", name = "Ib", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method1571(int arg0, int arg1) {
        ++field3403;
        if (arg1 != -23572) {
            return true;
        } else {
            return arg0 == 0 && !this.field3415 ? super.field1274 : true;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BI)V", line = 18)
    public final void method1572(byte arg0, int arg1) {
        super.field1303 = arg1;
        ++field3400;
        if (arg0 != -107) {
            field3402 = 53;
        }
        class336.field4352 = null;
        class61.field832 = true;
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BII)I", line = 32)
    private final int method1573(byte arg0, int arg1, int arg2) {
        int var4 = 35 / ((1 - arg0) / 54);
        ++field3409;
        byte var5;
        if (arg2 > 20000) {
            var5 = 4;
            this.method1585(0);
        } else if (~arg2 < -10001) {
            this.method1575(true);
            var5 = 3;
        } else if (arg2 > 5000) {
            this.method1583((byte) 125);
            var5 = 2;
        } else {
            var5 = 1;
            this.method1576(false);
        }
        if (~class364.field4697 != ~arg1) {
            super.field1275 = arg1;
            class11.method58(arg1, -86);
        }
        this.method1574(class688.field9413, false);
        return var5;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lufa;Z)V", line = 81)
    public final void method1574(class140 arg0, boolean arg1) {
        if (arg1) {
            this.field3420 = false;
        }
        ++field3417;
        class218 var3 = null;
        try {
            class548 var4 = arg0.method1045("", (byte) -48, true);
            while (~var4.field7108 == -1) {
                class122.method905(1L, -6145);
            }
            if (var4.field7108 == 1) {
                var3 = (class218) var4.field7113;
                class418 var5 = new class418(class268.method1650(46));
                this.method736((byte) 68, var5);
                var3.method1393(var5.field5367, var5.field5393, (byte) -16, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method1397(true);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V", line = 120)
    public final void method1575(boolean arg0) {
        ++field3411;
        this.method1588(true, true);
        super.field1297 = true;
        super.field1290 = false;
        super.field1278 = true;
        super.field1269 = true;
        super.field1271 = 1;
        super.field1277 = super.field1287 = 0;
        super.field1267 = true;
        super.field1286 = true;
        super.field1279 = false;
        super.field1263 = super.field1272 = 1;
        super.field1282 = true;
        super.field1295 = true;
        super.field1281 = true;
        super.field1304 = arg0;
        if (~class331.field4308 < -96) {
            class635.method3509(1, -101);
        } else {
            class635.method3509(0, -101);
        }
        super.field1268 = true;
        super.field1261 = false;
        super.field1296 = 0;
        this.method1582(2);
        this.method1572((byte) -107, 1);
        super.field1298 = 3;
        class24.method129(28260);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)V", line = 156)
    public final void method1576(boolean arg0) {
        ++field3397;
        this.method1588(false, !arg0);
        super.field1304 = false;
        super.field1277 = super.field1287 = 0;
        super.field1269 = false;
        super.field1297 = arg0;
        super.field1295 = false;
        super.field1271 = 0;
        super.field1278 = false;
        super.field1263 = super.field1272 = 0;
        super.field1267 = false;
        super.field1282 = false;
        super.field1281 = false;
        super.field1286 = false;
        super.field1279 = false;
        super.field1290 = false;
        class635.method3509(0, -101);
        super.field1296 = 0;
        super.field1268 = false;
        super.field1261 = false;
        this.method1582(2);
        this.method1572((byte) -107, 2);
        super.field1298 = 1;
        class24.method129(28260);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZ)V", line = 188)
    public static final void method1577(int arg0, boolean arg1) {
        if (class2.field15 != null) {
            class2.field15.method281(arg0 ^ 3);
            class2.field15 = null;
        }
        ++field3414;
        class60.field816 = 0;
        class705.method3852(0);
        class459.method2584();
        for (int var2 = 0; ~var2 > -5; ++var2) {
            class703.field9806[var2].method284((byte) -48);
        }
        class495.method2697((byte) -108, false);
        System.gc();
        class385.method2195(2, 0);
        class166.field2085 = -1;
        class60.field823 = false;
        class628.method3486(true, (byte) 58);
        class105.field1383 = 0;
        class2.field10 = 0;
        class100.field1326 = 0;
        class677.field9340 = 0;
        class649.field9048 = 0;
        class186.field2376 = 0;
        for (int var3 = 0; class434.field5591.length > var3; ++var3) {
            class434.field5591[var3] = null;
        }
        class475.method2624(arg0 + 79);
        for (int var4 = 0; var4 < 2048; ++var4) {
            class592.field8019[var4] = null;
        }
        if (arg0 != 3) {
            field3402 = 66;
        }
        class248.field3351 = 0;
        class505.field6640.method41(62);
        class480.field6406 = 0;
        class197.field2589.method41(62);
        class284.method1696(-47);
        class30.field453 = 0;
        class397.field5054.method1715((byte) 95);
        class378.method2161(89);
        class425.method2446(-62);
        class363.field4686 = 0L;
        class268.field3583 = null;
        if (arg1) {
            class442.method2508(12, 1);
        } else {
            class442.method2508(3, arg0 ^ 2);
            try {
                class92.method688(-13381, "loggedout", class348.field4462);
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILfd;)V", line = 266)
    private final void method1578(int arg0, class418 arg1) {
        ++field3418;
        if (arg0 == -10892) {
            if (arg1.field5393.length + -arg1.field5367 >= 1) {
                int var3 = arg1.method2396(arg0 ^ 10891);
                if (var3 >= 0 && var3 <= 22) {
                    byte var4;
                    if (~var3 == -23) {
                        var4 = 45;
                    } else if (var3 == 21) {
                        var4 = 44;
                    } else if (~var3 == -21) {
                        var4 = 43;
                    } else if (~var3 != -20) {
                        if (~var3 == -19) {
                            var4 = 41;
                        } else if (var3 == 17) {
                            var4 = 40;
                        } else if (var3 == 16) {
                            var4 = 38;
                        } else if (~var3 != -16) {
                            if (var3 == 14) {
                                var4 = 36;
                            } else if (~var3 == -14) {
                                var4 = 35;
                            } else if (var3 == 12) {
                                var4 = 34;
                            } else if (~var3 != -12) {
                                if (~var3 == -11) {
                                    var4 = 32;
                                } else if (var3 != 9) {
                                    if (var3 != 8) {
                                        if (~var3 == -8) {
                                            var4 = 29;
                                        } else if (var3 == 6) {
                                            var4 = 28;
                                        } else if (var3 != 5) {
                                            if (~var3 == -5) {
                                                var4 = 24;
                                            } else if (~var3 == -4) {
                                                var4 = 23;
                                            } else if (~var3 != -3) {
                                                if (var3 == 1) {
                                                    var4 = 23;
                                                } else {
                                                    var4 = 19;
                                                }
                                            } else {
                                                var4 = 22;
                                            }
                                        } else {
                                            var4 = 28;
                                        }
                                    } else {
                                        var4 = 30;
                                    }
                                } else {
                                    var4 = 31;
                                }
                            } else {
                                var4 = 33;
                            }
                        } else {
                            var4 = 37;
                        }
                    } else {
                        var4 = 42;
                    }
                    if (~(arg1.field5393.length - arg1.field5367) <= ~var4) {
                        super.field1301 = arg1.method2396(34);
                        if (~super.field1301 > -2) {
                            super.field1301 = 1;
                        } else if (super.field1301 > 4) {
                            super.field1301 = 4;
                        }
                        this.method1588(arg1.method2396(arg0 ^ -10985) == 1, true);
                        super.field1295 = arg1.method2396(-123) == 1;
                        super.field1267 = arg1.method2396(arg0 ^ -10884) == 1;
                        super.field1297 = arg1.method2396(arg0 ^ -10959) == 1;
                        super.field1271 = ~arg1.method2396(arg0 ^ -10999) == -2 ? 1 : 0;
                        super.field1282 = ~arg1.method2396(-105) == -2;
                        super.field1304 = arg1.method2396(-111) == 1;
                        super.field1269 = arg1.method2396(-124) == 1;
                        super.field1263 = arg1.method2396(-113);
                        if (super.field1263 > 2) {
                            super.field1263 = 2;
                        }
                        if (~var3 <= -18) {
                            super.field1272 = arg1.method2396(116);
                        }
                        if (var3 < 2) {
                            super.field1281 = ~arg1.method2396(-121) == -2;
                            arg1.method2396(arg0 + 10790);
                        } else {
                            super.field1281 = arg1.method2396(-120) == 1;
                            if (~var3 <= -18) {
                                super.field1290 = ~arg1.method2396(-108) == -2;
                            }
                        }
                        super.field1279 = ~arg1.method2396(arg0 ^ -10975) == -2;
                        super.field1278 = ~arg1.method2396(arg0 ^ 10988) == -2;
                        super.field1277 = arg1.method2396(115);
                        if (~super.field1277 < -3) {
                            super.field1277 = 2;
                        }
                        super.field1287 = super.field1277;
                        super.field1294 = arg1.method2396(-126) == 1;
                        super.field1289 = arg1.method2396(arg0 + 10778);
                        if (~super.field1289 < -128) {
                            super.field1289 = 127;
                        }
                        if (~var3 > -21) {
                            super.field1280 = super.field1289;
                        } else {
                            super.field1280 = arg1.method2396(34);
                            if (super.field1280 > 127) {
                                super.field1280 = 127;
                            }
                        }
                        super.field1276 = arg1.method2396(117);
                        super.field1285 = arg1.method2396(-115);
                        if (~super.field1285 < -128) {
                            super.field1285 = 127;
                        }
                        if (var3 >= 21) {
                            super.field1302 = arg1.method2396(-119);
                            if (super.field1302 > 127) {
                                super.field1302 = 127;
                            }
                        } else {
                            super.field1302 = super.field1276;
                        }
                        if (~var3 <= -2) {
                            super.field1264 = arg1.method2393(-30727);
                            super.field1266 = arg1.method2393(-30727);
                        }
                        if (var3 >= 3 && ~var3 > -7) {
                            arg1.method2396(-117);
                        }
                        if (~var3 <= -5) {
                            int var5 = arg1.method2396(40);
                            if (~var5 > -1 || var5 > 2) {
                                var5 = 0;
                            }
                            if (class331.field4308 < 96) {
                                var5 = 0;
                            }
                            class635.method3509(var5, arg0 + 10791);
                        }
                        if (var3 >= 5) {
                            super.field1273 = arg1.method2355(105);
                        }
                        int var6 = 0;
                        if (var3 >= 6) {
                            super.field1293 = var6 = arg1.method2396(arg0 ^ -10889);
                        }
                        if (~super.field1293 != -2 && ~super.field1293 != -3) {
                            super.field1293 = 2;
                        }
                        if (var3 >= 7) {
                            super.field1265 = arg1.method2396(arg0 ^ 10981) == 1;
                        }
                        if (~var3 <= -9) {
                            super.field1283 = arg1.method2396(85) == 1;
                        }
                        if (~var3 <= -10) {
                            super.field1296 = arg1.method2396(arg0 + 10783);
                        }
                        if (super.field1296 < 0 || ~super.field1296 < ~class181.method1203(class331.field4308, 0)) {
                            super.field1296 = 0;
                        }
                        if (~var3 <= -11) {
                            super.field1261 = ~arg1.method2396(-128) != -1;
                        }
                        if (var3 >= 11) {
                            super.field1292 = arg1.method2396(123) != 0;
                        }
                        if (var3 >= 12) {
                            super.field1271 = arg1.method2396(-124);
                        }
                        if (~super.field1271 > -1 || super.field1271 > 2) {
                            super.field1271 = 1;
                        }
                        if (var3 >= 13) {
                            super.field1268 = arg1.method2396(76) == 1;
                        }
                        if (~var3 > -15) {
                            if (~var6 == -1) {
                                super.field1275 = 2;
                            } else {
                                super.field1275 = 1;
                            }
                        } else {
                            super.field1275 = arg1.method2396(-102);
                        }
                        if (super.field1275 < 0 || super.field1275 > 5) {
                            super.field1275 = 2;
                        }
                        if (var3 >= 15) {
                            super.field1306 = arg1.method2396(-128);
                            if (super.field1306 < 0 || super.field1306 > 4) {
                                super.field1306 = ~class590.field8011 != -2 ? 4 : 2;
                            }
                        }
                        if (~var3 <= -17) {
                            super.field1286 = ~arg1.method2396(53) == -2;
                            try {
                                if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                    super.field1286 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (var3 < 17 && super.field1275 == 0) {
                            super.field1275 = 2;
                        }
                        if (var3 >= 18) {
                            super.field1298 = arg1.method2396(-110);
                            if (super.field1298 < 0 || ~super.field1298 < -5) {
                                super.field1298 = 0;
                            }
                        }
                        if (~var3 > -20) {
                            if (super.field1298 != 1 && super.field1298 != 2) {
                                if (~super.field1298 != -4) {
                                    super.field1303 = 0;
                                } else {
                                    super.field1303 = 1;
                                }
                            } else {
                                super.field1303 = 2;
                            }
                        } else {
                            super.field1303 = arg1.method2396(arg0 ^ 10977);
                        }
                        if (~var3 <= -23) {
                            super.field1262 = arg1.method2396(37);
                        }
                        if (~super.field1275 == -1 && class331.field4308 < 96 && super.field1298 != 1 && ~super.field1298 != -1) {
                            this.method1576(false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IZ)I", line = 616)
    public final int method1579(int arg0, boolean arg1) {
        ++field3406;
        if (this.field3404) {
            return 0;
        } else {
            if (!arg1) {
                method1580(57, -17);
            }
            if (!this.method1571(arg0, -23572)) {
                return 1;
            } else {
                return !super.field1295 ? 1 : 2;
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)V", line = 638)
    public static final void method1580(int arg0, int arg1) {
        ++field3410;
        class367 var2 = class573.method3057(arg0, arg1, 2);
        var2.method2113(-123);
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(II)I", line = 651)
    private final int method1581(int arg0, int arg1) {
        ++field3412;
        if (arg1 != 17480) {
            return 88;
        } else {
            byte var3;
            if (arg0 <= 12000) {
                if (arg0 <= 5000) {
                    if (arg0 <= 2000) {
                        var3 = 1;
                        this.method1576(false);
                    } else {
                        this.method1583((byte) 123);
                        var3 = 2;
                    }
                } else {
                    this.method1575(true);
                    var3 = 3;
                }
            } else {
                var3 = 4;
                this.method1585(arg1 + -17480);
            }
            if (class364.field4697 != 2) {
                super.field1275 = 2;
                class11.method58(2, -110);
            }
            this.method1574(class688.field9413, false);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V", line = 700)
    private final void method1582(int arg0) {
        if (class590.field8011 > 1) {
            super.field1306 = 4;
        } else {
            super.field1306 = 2;
        }
        ++field3401;
        if (arg0 != 2) {
            this.method1575(false);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V", line = 723)
    public final void method1583(byte arg0) {
        ++field3408;
        this.method1588(true, true);
        super.field1277 = super.field1287 = 0;
        super.field1297 = false;
        super.field1278 = false;
        super.field1286 = false;
        super.field1290 = false;
        super.field1295 = false;
        super.field1304 = false;
        super.field1263 = super.field1272 = 0;
        super.field1271 = 0;
        if (arg0 <= 45) {
            method1580(105, -64);
        }
        super.field1281 = false;
        super.field1279 = false;
        super.field1282 = false;
        super.field1269 = false;
        super.field1267 = true;
        class635.method3509(0, -101);
        super.field1261 = false;
        super.field1296 = 0;
        super.field1268 = true;
        this.method1582(2);
        this.method1572((byte) -107, 2);
        super.field1298 = 2;
        class24.method129(28260);
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lufa;)V", line = 1104)
    public class250(class140 arg0) {
        super.field1301 = 3;
        super.field1298 = 3;
        this.method1588(true, true);
        super.field1297 = true;
        super.field1264 = 0;
        super.field1290 = false;
        super.field1304 = true;
        super.field1294 = true;
        super.field1269 = true;
        super.field1267 = true;
        super.field1279 = true;
        super.field1280 = 127;
        super.field1263 = 2;
        super.field1295 = true;
        super.field1272 = 0;
        super.field1276 = 127;
        super.field1278 = true;
        super.field1285 = 127;
        super.field1287 = 0;
        super.field1266 = 0;
        super.field1281 = true;
        super.field1271 = 1;
        super.field1302 = 127;
        super.field1282 = true;
        super.field1289 = 127;
        super.field1277 = 0;
        if (class331.field4308 >= 96) {
            class635.method3509(2, -101);
        } else {
            class635.method3509(0, -101);
        }
        super.field1293 = 2;
        super.field1303 = 0;
        super.field1283 = false;
        super.field1306 = class590.field8011 == 1 ? 2 : 4;
        super.field1268 = true;
        super.field1265 = false;
        super.field1292 = true;
        super.field1275 = 2;
        super.field1273 = 0;
        super.field1296 = 0;
        super.field1261 = false;
        class218 var2 = null;
        try {
            class548 var3 = arg0.method1045("", (byte) -48, true);
            while (var3.field7108 == 0) {
                class122.method905(1L, -6145);
            }
            if (~var3.field7108 == -2) {
                var2 = (class218) var3.field7113;
                byte[] var4 = new byte[(int) var2.method1391(14)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1390(0, var4.length - var5, var4, var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1578(-10892, new class418(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1397(true);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(II)Z", line = 764)
    public final boolean method1584(int arg0, int arg1) {
        ++field3398;
        return ~arg1 == arg0 ? super.field1274 : true;
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V", line = 782)
    public final void method1585(int arg0) {
        ++field3421;
        this.method1588(true, true);
        super.field1277 = super.field1287 = 0;
        super.field1297 = true;
        super.field1282 = true;
        super.field1271 = 1;
        super.field1290 = true;
        super.field1278 = true;
        super.field1269 = true;
        super.field1286 = true;
        super.field1295 = true;
        super.field1304 = true;
        super.field1267 = true;
        super.field1279 = true;
        super.field1263 = super.field1272 = 2;
        super.field1281 = true;
        if (class331.field4308 > 95) {
            class635.method3509(2, arg0 + -101);
        } else {
            class635.method3509(0, -101);
        }
        super.field1296 = 0;
        super.field1261 = false;
        super.field1268 = true;
        this.method1582(2);
        this.method1572((byte) -107, arg0);
        super.field1298 = 4;
        class24.method129(arg0 ^ 28260);
    }

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "(I)I", line = 819)
    public final int method1586(int arg0) {
        ++field3396;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class688.field9413.field1823 && !class688.field9413.field1841) {
            if (class140.field1828.startsWith("win")) {
                if (!class140.field1822.startsWith("amd64") && !class140.field1822.startsWith("x86_64")) {
                    var2 = true;
                }
                var3 = true;
                var4 = true;
            } else {
                var3 = true;
            }
        }
        if (this.field3399) {
            var2 = false;
        }
        if (this.field3420) {
            var4 = false;
        }
        if (this.field3413) {
            var3 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method1587(3);
        } else {
            int var5 = -1;
            int var6 = -1;
            if (arg0 != 3) {
                return -96;
            } else {
                if (var2) {
                    try {
                        var5 = class441.method2498((byte) 31, 1000, 2);
                    } catch (Exception var16) {
                    }
                }
                int var7 = -1;
                if (var4) {
                    try {
                        var7 = class441.method2498((byte) 31, 1000, 3);
                        if (~class364.field4697 == -4) {
                            class463 var8 = class520.field6799.method189();
                            long var9 = 281474976710655L & var8.field6062;
                            int var11 = var8.field6056;
                            if (var11 != 4318) {
                                if (~var11 == -4099) {
                                    var3 &= var9 >= 60129613779L;
                                }
                            } else {
                                var3 &= ~var9 <= -64425238955L;
                            }
                        }
                    } catch (Exception var15) {
                    }
                }
                if (var3) {
                    try {
                        var6 = class441.method2498((byte) 31, 1000, 1);
                    } catch (Exception var14) {
                    }
                }
                if (var5 == -1 && ~var6 == 0 && ~var7 == 0) {
                    return this.method1587(arg0);
                } else {
                    int var12 = (int) ((float) var6 * 1.1F);
                    int var13 = (int) ((float) var7 * 1.1F);
                    if (~var13 > ~var5 && var5 > var12) {
                        return this.method1581(var5, 17480);
                    } else {
                        return ~var13 >= ~var12 ? this.method1573((byte) -53, 1, var12) : this.method1573((byte) 78, 3, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "(I)I", line = 997)
    private final int method1587(int arg0) {
        ++field3405;
        byte var2;
        if (class331.field4308 < 96) {
            this.method1576(false);
            var2 = 1;
        } else {
            int var3 = class328.method1894(true);
            if (~var3 >= -101) {
                this.method1585(arg0 ^ 3);
                var2 = 4;
            } else if (var3 <= 500) {
                var2 = 3;
                this.method1575(true);
            } else if (~var3 >= -1001) {
                this.method1583((byte) 104);
                var2 = 2;
            } else {
                this.method1576(false);
                var2 = 1;
            }
        }
        if (arg0 != 3) {
            this.method1585(-8);
        }
        if (class364.field4697 != 0) {
            super.field1275 = 0;
            class11.method58(0, arg0 ^ -95);
        }
        this.method1574(class688.field9413, false);
        return var2;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZZ)V", line = 1063)
    public final void method1588(boolean arg0, boolean arg1) {
        ++field3419;
        super.field1274 = arg0;
        if (class348.field4436 != null) {
            class348.field4436.method1898(!this.method1571(class364.field4697, -23572), -25718);
        }
        if (!arg1) {
            this.method1575(false);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IB)I", line = 1081)
    public final int method1589(int arg0, byte arg1) {
        ++field3407;
        if (arg1 != 103) {
            this.method1578(52, (class418) null);
        }
        if (class477.method2642(arg0, (byte) 61) && !class133.method968((byte) 1, class566.field7391)) {
            return class331.field4308 < 96 && class135.method987(arg0, (byte) 120) && super.field1303 == 0 ? 1 : super.field1303;
        } else {
            return 0;
        }
    }
}
