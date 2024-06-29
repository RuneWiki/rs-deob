import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class98 {

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[I")
    private int[] field2416;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lmb;")
    public static class84 field2414 = class79.method672(true, "Menge eingeben:");

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lmb;")
    public static class84 field2417 = class79.method672(true, "_");

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lmb;")
    public static class84 field2421 = class79.method672(true, "(X100(U(Y");

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lr;")
    public static class112 field2415;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
    public static final boolean method810(int arg0, int arg1) {
        if (arg0 >= -69) {
            field2415 = null;
        }
        field2412++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILia;IIIIIBIII[Lia;)Lia;")
    public static final class57 method811(int arg0, class57 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, class57[] arg11) {
        field2410++;
        if (arg7 != -100) {
            field2421 = null;
        }
        if (arg3 < arg5 || arg10 > arg6 || arg4 <= arg3 || arg2 <= arg6) {
            return null;
        }
        for (int var12 = 0; var12 < arg11.length; var12++) {
            class57 var13 = arg11[var12];
            if (var13 != null && var13.field1443 == arg9 && !class75.method647((byte) 97, var13) && arg1 != var13) {
                int var14 = var13.field1433 + arg10 - arg0;
                int var15 = var13.field1348 + arg5 - arg8;
                if (var13.field1385 == 0) {
                    class57 var16 = method811(var13.field1334, arg1, var13.field1332 + var14, arg3, var13.field1365 + var15, var15, arg6, (byte) -100, var13.field1380, var13.field1369, var14, arg11);
                    if (var16 != null) {
                        return var16;
                    }
                    if (var13.field1410 != null) {
                        class57 var17 = method811(var13.field1334, arg1, var13.field1332 + var14, arg3, var13.field1365 + var15, var15, arg6, (byte) -100, var13.field1380, var13.field1369, var14, var13.field1410);
                        if (var17 != null) {
                            return var17;
                        }
                    }
                }
                if (class63.method574(-126, class91.method780(-150310624, var13)) && var15 <= arg3 && arg6 >= var14 && arg3 < var15 + var13.field1365 && var14 + var13.field1332 > arg6) {
                    return var13;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)I")
    public final int method812(int arg0, byte arg1) {
        field2418++;
        int var3 = this.field2416.length - 2;
        int var4 = var3 & arg0 << 1;
        if (arg1 != -112) {
            field2417 = null;
        }
        while (true) {
            int var5 = this.field2416[var4];
            if (arg0 == var5) {
                return this.field2416[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)Lbe;")
    public static final class13 method813(int arg0, int arg1) {
        field2413++;
        class13 var2 = (class13) class119.field2857.method970(-27059, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field2396.method986(arg1, 10, (byte) 67);
        class13 var4 = new class13();
        var4.field213 = arg1;
        if (var3 != null) {
            var4.method87(-8646, new class51(var3));
        }
        var4.method85(-113);
        if (var4.field266 != arg0) {
            var4.method82(method813(-1, var4.field266), method813(-1, var4.field211), -102);
        }
        if (!class13.field241 && var4.field250) {
            var4.field215 = class40.field921;
            var4.field231 = null;
            var4.field264 = 0;
            var4.field263 = null;
        }
        class119.field2857.method965(var4, 208, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([I)V")
    public class98(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2416 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2416[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2416[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2416[var5 + var5] = arg0[var4];
            this.field2416[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method814(byte arg0) {
        field2414 = null;
        field2421 = null;
        field2417 = null;
        if (arg0 != 119) {
            method814((byte) -118);
        }
        field2415 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static final void method815(byte arg0) {
        field2420++;
        if (arg0 == 110) {
            class40.field912.method966(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)V")
    public static final void method816(int arg0, byte arg1, int arg2) {
        field2419++;
        class16 var3 = class39.field875[class13.field251][arg2][arg0];
        if (var3 == null) {
            class133.field3173.method496(class13.field251, arg2, arg0);
            return;
        }
        int var4 = -99999999;
        class14 var5 = null;
        for (class14 var6 = (class14) var3.method104((byte) 101); var6 != null; var6 = (class14) var3.method107(-2)) {
            class13 var11 = method813(-1, var6.field274);
            int var12 = var11.field222;
            if (var11.field257 == 1) {
                var12 = (var6.field275 + 1) * var12;
            }
            if (var12 > var4) {
                var4 = var12;
                var5 = var6;
            }
        }
        if (arg1 > -122) {
            return;
        }
        if (var5 == null) {
            class133.field3173.method496(class13.field251, arg2, arg0);
            return;
        }
        var3.method109((byte) 75, var5);
        class14 var7 = null;
        class14 var8 = (class14) var3.method104((byte) 101);
        class14 var9 = null;
        while (var8 != null) {
            if (var5.field274 != var8.field274) {
                if (var7 == null) {
                    var7 = var8;
                }
                if (var7.field274 != var8.field274 && var9 == null) {
                    var9 = var8;
                }
            }
            var8 = (class14) var3.method107(-2);
        }
        int var10 = (arg0 << 7) + arg2 + 1610612736;
        class133.field3173.method492(class13.field251, arg2, arg0, class41.method309((byte) 64, arg2 * 128 + 64, arg0 * 128 + 64, class13.field251), var5, var10, var7, var9);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([Lia;IIIIIIIII)Z")
    public static final boolean method817(class57[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        boolean var10 = true;
        class142.method1162(arg9, arg1, arg5, arg3);
        for (int var11 = arg8; var11 < arg0.length; var11++) {
            class57 var12 = arg0[var11];
            if (var12 != null && (var12.field1443 == arg6 || arg6 == -1412584499 && class125.field3019 == var12)) {
                if (var12.field1382 > 0) {
                    class30.method226(var12, arg8 + 2);
                }
                int var13 = var12.field1348 + arg9 - arg7;
                int var14 = var12.field1364;
                int var15 = arg1 + var12.field1433 - arg2;
                if (class125.field3019 == var12) {
                    if (arg6 != -1412584499 && !var12.field1423) {
                        class77.field1947 = arg2;
                        class105.field2560 = arg7;
                        class62.field1546 = arg0;
                        continue;
                    }
                    class57 var16 = class96.method802(1000, var12);
                    if (var16 == null) {
                        class125.field3019 = null;
                    } else {
                        int[] var17 = class54.method448((byte) 125, var16);
                        int[] var18 = class54.method448((byte) 122, var12);
                        int var19 = class20.field427 - class120.field2893;
                        int var20 = class60.field1498 - class54.field1241;
                        if (var19 <= var12.field1434 && -var12.field1434 <= var19 && var20 <= var12.field1434 && var20 >= -var12.field1434 && !class83.field2045) {
                            var20 = 0;
                            var19 = 0;
                        } else if (var12.field1432 < class52.field1158 || class83.field2045) {
                            class83.field2045 = true;
                        } else {
                            var20 = 0;
                            var19 = 0;
                        }
                        int var21 = var18[0] + var19 - var17[0];
                        if (!var12.field1423) {
                            var14 = 128;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var12.field1365 + var21 > var16.field1365) {
                            var21 = var16.field1365 - var12.field1365;
                        }
                        var13 = var17[0] + var21;
                        int var22 = var18[1] + var20 - var17[1];
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var16.field1332 < var12.field1332 + var22) {
                            var22 = var16.field1332 - var12.field1332;
                        }
                        var15 = var17[1] + var22;
                    }
                }
                if ((!var12.field1392 || class142.field3423 >= var13 && var15 <= class142.field3420 && var12.field1365 + var13 >= class142.field3421 && var12.field1332 + var15 >= class142.field3424) && (!var12.field1392 || !class75.method647((byte) 97, var12))) {
                    if (var12.field1385 == 0) {
                        if (!var12.field1392 && class75.method647((byte) 97, var12) && !class136.method1113(arg4, (byte) 127, var11)) {
                            continue;
                        }
                        if (!var12.field1392) {
                            if (var12.field1334 > var12.field1314 - var12.field1332) {
                                var12.field1334 = var12.field1314 - var12.field1332;
                            }
                            if (var12.field1334 < 0) {
                                var12.field1334 = 0;
                            }
                        }
                        var10 &= method817(arg0, var15, var12.field1334, var12.field1332 + var15, arg4, var12.field1365 + var13, var12.field1369, var12.field1380, 0, var13);
                        if (var12.field1410 != null) {
                            var10 &= method817(var12.field1410, var15, var12.field1334, var12.field1332 + var15, arg4, var12.field1365 + var13, var12.field1369, var12.field1380, 0, var13);
                        }
                        class142.method1162(arg9, arg1, arg5, arg3);
                        if (var12.field1314 > var12.field1332 && !var12.field1392) {
                            class66.method601(var12.field1332, arg8 ^ 0xFFFFFFE0, var15, var12.field1334, var12.field1365 + var13, var12.field1314);
                        }
                    }
                    if (var12.field1385 != 1) {
                        if (var12.field1385 == 2) {
                            int var23 = 0;
                            for (int var24 = 0; var24 < var12.field1332; var24++) {
                                for (int var25 = 0; var25 < var12.field1365; var25++) {
                                    int var26 = (var12.field1429 + 32) * var25 + var13;
                                    int var27 = (var12.field1413 + 32) * var24 + var15;
                                    if (var23 < 20) {
                                        var26 += var12.field1441[var23];
                                        var27 += var12.field1391[var23];
                                    }
                                    if (var12.field1349[var23] > 0) {
                                        boolean var28 = false;
                                        int var29 = var12.field1349[var23] - 1;
                                        boolean var30 = false;
                                        if (class142.field3421 - 32 < var26 && var26 < class142.field3423 && var27 > class142.field3424 - 32 && var27 < class142.field3420 || class115.field2745 != 0 && class87.field2174 == var23) {
                                            class112 var31;
                                            if (client.field465 == 1 && class52.field1188 == var23 && class6.field103 == var12.field1369) {
                                                var31 = class94.method791(-2, var12.field1394[var23], var29, 0, false, 2);
                                            } else {
                                                var31 = class94.method791(arg8 ^ 0xFFFFFFFE, var12.field1394[var23], var29, 3153952, false, 1);
                                            }
                                            if (var31 == null) {
                                                var10 = false;
                                            } else if (class115.field2745 != 0 && class87.field2174 == var23 && class64.field1576 == var12.field1369) {
                                                int var32 = class20.field427 - class120.field2869;
                                                int var33 = class60.field1498 - class143.field3431;
                                                if (var33 < 5 && var33 > -5) {
                                                    var33 = 0;
                                                }
                                                if (var32 < 5 && var32 > -5) {
                                                    var32 = 0;
                                                }
                                                if (class120.field2896 < 5) {
                                                    var32 = 0;
                                                    var33 = 0;
                                                }
                                                var31.method926(var26 + var32, var27 + var33, 128);
                                                if (arg6 != -1) {
                                                    class57 var34 = arg0[arg6 & 0xFFFF];
                                                    if (var27 + var33 < class142.field3424 && var34.field1334 > 0) {
                                                        int var35 = (class142.field3424 - var27 - var33) * class108.field2613 / 3;
                                                        if (var35 > class108.field2613 * 10) {
                                                            var35 = class108.field2613 * 10;
                                                        }
                                                        if (var34.field1334 < var35) {
                                                            var35 = var34.field1334;
                                                        }
                                                        var34.field1334 -= var35;
                                                        class143.field3431 += var35;
                                                    }
                                                    if (class142.field3420 < var33 + var27 + 32 && var34.field1314 - var34.field1332 > var34.field1334) {
                                                        int var36 = (var27 + var33 + 32 - class142.field3420) * class108.field2613 / 3;
                                                        if (var36 > class108.field2613 * 10) {
                                                            var36 = class108.field2613 * 10;
                                                        }
                                                        if (var34.field1314 - var34.field1332 - var34.field1334 < var36) {
                                                            var36 = var34.field1314 - var34.field1334 - var34.field1332;
                                                        }
                                                        class143.field3431 -= var36;
                                                        var34.field1334 += var36;
                                                    }
                                                }
                                            } else if (class37.field829 != 0 && class108.field2610 == var23 && class120.field2891 == var12.field1369) {
                                                var31.method926(var26, var27, 128);
                                            } else {
                                                var31.method928(var26, var27);
                                            }
                                        }
                                    } else if (var12.field1371 != null && var23 < 20) {
                                        class112 var37 = var12.method508(arg8, var23);
                                        if (var37 != null) {
                                            var37.method928(var26, var27);
                                        } else if (class141.field3401) {
                                            var10 = false;
                                        }
                                    }
                                    var23++;
                                }
                            }
                        } else if (var12.field1385 == 3) {
                            int var38;
                            if (class103.method855(var12, -32)) {
                                var38 = var12.field1363;
                                if (class136.method1113(arg4, (byte) 127, var11) && var12.field1337 != 0) {
                                    var38 = var12.field1337;
                                }
                            } else {
                                var38 = var12.field1316;
                                if (class136.method1113(arg4, (byte) 127, var11) && var12.field1342 != 0) {
                                    var38 = var12.field1342;
                                }
                            }
                            if (var14 == 0) {
                                if (var12.field1325) {
                                    class142.method1151(var13, var15, var12.field1365, var12.field1332, var38);
                                } else {
                                    class142.method1160(var13, var15, var12.field1365, var12.field1332, var38);
                                }
                            } else if (var12.field1325) {
                                class142.method1164(var13, var15, var12.field1365, var12.field1332, var38, 256 - (var14 & 0xFF));
                            } else {
                                class142.method1165(var13, var15, var12.field1365, var12.field1332, var38, 256 - (var14 & 0xFF));
                            }
                        } else if (var12.field1385 == 4) {
                            class28 var39 = var12.method509(arg8 ^ 0xFFFFFFA2);
                            if (var39 != null) {
                                class84 var40 = var12.field1377;
                                int var41;
                                if (class103.method855(var12, arg8 ^ 0x12)) {
                                    var41 = var12.field1363;
                                    if (class136.method1113(arg4, (byte) 127, var11) && var12.field1337 != 0) {
                                        var41 = var12.field1337;
                                    }
                                    if (var12.field1417.method718(102) > 0) {
                                        var40 = var12.field1417;
                                    }
                                } else {
                                    var41 = var12.field1316;
                                    if (class136.method1113(arg4, (byte) 127, var11) && var12.field1342 != 0) {
                                        var41 = var12.field1342;
                                    }
                                }
                                if (var12.field1392 && var12.field1427 != -1) {
                                    class13 var42 = method813(-1, var12.field1427);
                                    var40 = var42.field215;
                                    if (var40 == null) {
                                        var40 = class92.field2290;
                                    }
                                    if ((var42.field257 == 1 || var12.field1420 != 1) && var12.field1420 != -1) {
                                        var40 = class51.method408(new class84[] { var40, class52.field1177, class88.method751(var12.field1420, (byte) -119) }, -106);
                                    }
                                }
                                if (class143.field3432 == var12.field1369 && class69.field1687 == var12.field1425) {
                                    var41 = var12.field1316;
                                    var40 = class115.field2774;
                                }
                                if (class142.field3422 == 479) {
                                    if (var41 == 16776960) {
                                        var41 = 255;
                                    }
                                    if (var41 == 49152) {
                                        var41 = 16777215;
                                    }
                                }
                                class84 var43 = class11.method61(var12, var40, -1);
                                var39.method220(var43, var13, var15, var12.field1365, var12.field1332, var41, var12.field1338, var12.field1409, var12.field1322, var12.field1331);
                            } else if (class141.field3401) {
                                var10 = false;
                            }
                        } else if (var12.field1385 == 5) {
                            if (var12.field1392) {
                                class112 var44;
                                if (var12.field1427 == -1) {
                                    var44 = var12.method512(false, (byte) -108);
                                } else {
                                    var44 = class94.method791(-2, var12.field1420, var12.field1427, var12.field1390, false, var12.field1387);
                                }
                                if (var44 != null) {
                                    int var45 = var44.field2689;
                                    int var46 = var44.field2688;
                                    if (var12.field1347) {
                                        int var47 = var15;
                                        int[] var48 = new int[4];
                                        class142.method1154(var48);
                                        if (var15 < var48[1]) {
                                            var47 = var48[1];
                                        }
                                        int var49 = var12.field1365 + var13;
                                        if (var48[2] < var49) {
                                            var49 = var48[2];
                                        }
                                        int var50 = var13;
                                        int var51 = var12.field1332 + var15;
                                        if (var48[3] < var51) {
                                            var51 = var48[3];
                                        }
                                        if (var48[0] > var13) {
                                            var50 = var48[0];
                                        }
                                        class142.method1162(var50, var47, var49, var51);
                                        int var52 = (var12.field1332 + var46 - 1) / var46;
                                        int var53 = (var12.field1365 + var45 - 1) / var45;
                                        for (int var54 = 0; var54 < var53; var54++) {
                                            for (int var55 = 0; var55 < var52; var55++) {
                                                if (var12.field1396 != 0) {
                                                    var44.method915(var45 / 2 + var45 * var54 + var13, var46 / 2 + var46 * var55 + var15, var12.field1396, 4096);
                                                } else if (var14 == 0) {
                                                    var44.method928(var45 * var54 + var13, var15 - -(var46 * var55));
                                                } else {
                                                    var44.method926(var45 * var54 + var13, var46 * var55 + var15, 256 - (var14 & 0xFF));
                                                }
                                            }
                                        }
                                        class142.method1163(var48);
                                    } else {
                                        int var56 = var12.field1365 * 4096 / var45;
                                        if (var12.field1396 != 0) {
                                            var44.method915(var12.field1365 / 2 + var13, var12.field1332 / 2 + var15, var12.field1396, var56);
                                        } else if (var14 != 0) {
                                            var44.method916(var13, var15, var12.field1365, var12.field1332, 256 - (var14 & 0xFF));
                                        } else if (var12.field1365 == var45 && var12.field1332 == var46) {
                                            var44.method928(var13, var15);
                                        } else {
                                            var44.method913(var13, var15, var12.field1365, var12.field1332);
                                        }
                                    }
                                } else if (class141.field3401) {
                                    var10 = false;
                                }
                            } else {
                                class112 var57 = var12.method512(class103.method855(var12, 118), (byte) -87);
                                if (var57 != null) {
                                    var57.method928(var13, var15);
                                } else if (class141.field3401) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field1385 == 6) {
                            class26 var58 = null;
                            boolean var59 = class103.method855(var12, arg8 - 8);
                            int var60;
                            if (var59) {
                                var60 = var12.field1398;
                            } else {
                                var60 = var12.field1408;
                            }
                            int var61 = 0;
                            if (var12.field1427 != -1) {
                                class13 var63 = method813(-1, var12.field1427);
                                if (var63 != null) {
                                    class13 var64 = var63.method88(88, var12.field1420);
                                    var58 = var64.method73(1, (byte) -89);
                                    if (var58 == null) {
                                        var10 = false;
                                    } else {
                                        var58.method175();
                                        var61 = var58.field1668 / 2;
                                    }
                                }
                            } else if (var12.field1430 == 5) {
                                if (var12.field1355 == 0) {
                                    var58 = class44.field966.method429(-1, -1, null, null, (byte) -113);
                                } else {
                                    var58 = class40.field925.method89(-6767);
                                }
                            } else if (var60 == -1) {
                                var58 = var12.method511((byte) -78, var59, null, -1, class40.field925.field1528);
                                if (var58 == null && class141.field3401) {
                                    var10 = false;
                                }
                            } else {
                                class70 var62 = class79.method673(var60, false);
                                var58 = var12.method511((byte) -92, var59, var62, var12.field1320, class40.field925.field1528);
                                if (var58 == null && class141.field3401) {
                                    var10 = false;
                                }
                            }
                            class104.method872(var12.field1365 / 2 + var13, var12.field1332 / 2 + var15);
                            int var65 = class104.field2520[var12.field1381] * var12.field1411 >> 16;
                            int var66 = class104.field2527[var12.field1381] * var12.field1411 >> 16;
                            if (var58 != null) {
                                if (var12.field1392) {
                                    var58.method175();
                                    if (var12.field1368) {
                                        var58.method182(0, var12.field1319, var12.field1386, var12.field1381, var12.field1437, var65 + var61 + var12.field1421, var12.field1421 + var66, var12.field1411);
                                    } else {
                                        var58.method185(0, var12.field1319, var12.field1386, var12.field1381, var12.field1437, var61 + var65 + var12.field1421, var12.field1421 + var66);
                                    }
                                } else {
                                    var58.method185(0, var12.field1319, 0, var12.field1381, 0, var65, var66);
                                }
                            }
                            class104.method870();
                        } else {
                            if (var12.field1385 == 7) {
                                class28 var67 = var12.method509(22);
                                if (var67 == null) {
                                    if (class141.field3401) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var68 = 0;
                                for (int var69 = 0; var69 < var12.field1332; var69++) {
                                    for (int var70 = 0; var70 < var12.field1365; var70++) {
                                        if (var12.field1349[var68] > 0) {
                                            class13 var71 = method813(-1, var12.field1349[var68] - 1);
                                            class84 var72 = var71.field215;
                                            if (var72 == null) {
                                                var72 = class92.field2290;
                                            }
                                            if (var71.field257 == 1 || var12.field1394[var68] != 1) {
                                                var72 = class51.method408(new class84[] { var72, class52.field1177, class88.method751(var12.field1394[var68], (byte) -81) }, 127);
                                            }
                                            int var73 = (var12.field1413 + 12) * var69 + var15;
                                            int var74 = (var12.field1429 + 115) * var70 + var13;
                                            if (var12.field1409 == 0) {
                                                var67.method223(var72, var74, var73, var12.field1316, var12.field1338);
                                            } else if (var12.field1409 == 1) {
                                                var67.method202(var72, var12.field1365 / 2 + var74, var73, var12.field1316, var12.field1338);
                                            } else {
                                                var67.method211(var72, var74 + var12.field1365 - 1, var73, var12.field1316, var12.field1338);
                                            }
                                        }
                                        var68++;
                                    }
                                }
                            }
                            if (var12.field1385 == 8 && class95.method795((byte) -77, var11, arg4) && class72.field1773 == class68.field1660) {
                                int var75 = 0;
                                class28 var76 = class95.field2364;
                                int var77 = 0;
                                class84 var78 = var12.field1377;
                                class84 var79 = class11.method61(var12, var78, ~arg8);
                                while (var79.method718(-106) > 0) {
                                    int var87 = var79.method729(arg8 ^ 0x41, class92.field2286);
                                    class84 var88;
                                    if (var87 == -1) {
                                        var88 = var79;
                                        var79 = class95.field2361;
                                    } else {
                                        var88 = var79.method723(false, var87, 0);
                                        var79 = var79.method697(97, var87 + 2);
                                    }
                                    int var89 = var76.method200(var88);
                                    var75 += var76.field668 + 1;
                                    if (var77 < var89) {
                                        var77 = var89;
                                    }
                                }
                                var75 += 7;
                                var77 += 6;
                                int var80 = var12.field1332 + var15 + 5;
                                int var81 = var12.field1365 + var13 - var77 - 5;
                                if (var75 + var80 > arg3) {
                                    var80 = arg3 - var75;
                                }
                                if (var81 < var13 + 5) {
                                    var81 = var13 + 5;
                                }
                                if (arg5 < var81 + var77) {
                                    var81 = arg5 - var77;
                                }
                                class142.method1151(var81, var80, var77, var75, 16777120);
                                class142.method1160(var81, var80, var77, var75, 0);
                                int var82 = var76.field668 + var80 + 2;
                                class84 var83 = var12.field1377;
                                class84 var84 = class11.method61(var12, var83, -1);
                                while (var84.method718(71) > 0) {
                                    int var85 = var84.method729(65, class92.field2286);
                                    class84 var86;
                                    if (var85 == -1) {
                                        var86 = var84;
                                        var84 = class95.field2361;
                                    } else {
                                        var86 = var84.method723(false, var85, 0);
                                        var84 = var84.method697(28, var85 + 2);
                                    }
                                    var76.method223(var86, var81 + 3, var82, 0, false);
                                    var82 += var76.field668 + 1;
                                }
                            }
                            if (var12.field1385 == 9) {
                                if (var12.field1438 == 1) {
                                    class142.method1159(var13, var15, var12.field1365 + var13, var12.field1332 + var15, var12.field1316);
                                } else {
                                    int var90 = var12.field1365 >= 0 ? var12.field1365 : -var12.field1365;
                                    int var91 = var12.field1332 < 0 ? -var12.field1332 : var12.field1332;
                                    int var92 = var90;
                                    if (var90 < var91) {
                                        var92 = var91;
                                    }
                                    if (var92 != 0) {
                                        int var93 = (var12.field1365 << 16) / var92;
                                        int var94 = (var12.field1332 << 16) / var92;
                                        if (var93 < var94) {
                                            var94 = -var94;
                                        } else {
                                            var93 = -var93;
                                        }
                                        int var95 = var12.field1438 * var93 >> 17;
                                        int var96 = var12.field1438 * var94 + 1 >> 17;
                                        int var97 = var12.field1438 * var94 >> 17;
                                        int var98 = var13 + var97;
                                        int var99 = var13 - var96;
                                        int var100 = var12.field1438 * var93 + 1 >> 17;
                                        int var101 = var13 + var12.field1365 + var97;
                                        int var102 = var13 + var12.field1365 - var96;
                                        int var103 = var15 - var100;
                                        int var104 = var15 + var95;
                                        int var105 = var12.field1332 + var15 + var95;
                                        int var106 = var12.field1332 + var15 - var100;
                                        class104.method856(var98, var99, var102);
                                        class104.method867(var104, var103, var106, var98, var99, var102, var12.field1316);
                                        class104.method856(var98, var102, var101);
                                        class104.method867(var104, var106, var105, var98, var102, var101, var12.field1316);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field2422++;
        return var10;
    }
}
