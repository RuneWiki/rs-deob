import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class55 extends class130 {

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "Z")
    public boolean field1465 = false;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "Ljf;")
    private class88 field1449;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "Z")
    public boolean field1447;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "Z")
    public boolean field1463;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "[Lae;")
    public static class6[] field1458 = new class6[32768];

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "Lgg;")
    private static class63 field1464 = class116.method911(43, "Your account has been disabled)3");

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "Lgg;")
    public static class63 field1457 = field1464;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "Lgg;")
    private static class63 field1456 = class116.method911(43, "Loading fonts )2 ");

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "Lgg;")
    public static class63 field1455 = field1456;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "F")
    private float field1467;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "[I")
    private int[] field1454;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III[Lff;IIIIB)V")
    public static final void method539(int arg0, int arg1, int arg2, class54[] arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field1446++;
        if (arg8 <= 110) {
            field1458 = null;
        }
        for (int var9 = 0; var9 < arg3.length; var9++) {
            class54 var10 = arg3[var9];
            if (var10 != null && (!var10.field1336 || var10.field1432 == 0 || var10.field1378 || class10.method136((byte) -124, var10) != 0 || class174.field3584 == var10 || var10.field1367 == 1338) && var10.field1353 == arg0 && (!var10.field1336 || !class183.method1208((byte) 99, var10))) {
                int var11 = var10.field1333 + arg1;
                int var12 = var10.field1304 + arg6;
                if (class198.field3963 == var10) {
                    class162.field3338 = true;
                    class93.field2198 = var12;
                    class132.field2873 = var11;
                }
                int var18;
                int var20;
                int var21;
                int var22;
                if (var10.field1432 == 2) {
                    var21 = arg2;
                    var18 = arg5;
                    var22 = arg4;
                    var20 = arg7;
                } else if (var10.field1432 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var11 + var10.field1302;
                    int var16 = var10.field1435 + var12;
                    if (var15 < var11) {
                        var13 = var15;
                        var15 = var11;
                    }
                    var15++;
                    var18 = arg5 < var13 ? var13 : arg5;
                    if (var16 < var12) {
                        var14 = var16;
                        var16 = var12;
                    }
                    var20 = arg7 > var15 ? var15 : arg7;
                    var21 = var14 > arg2 ? var14 : arg2;
                    var16++;
                    var22 = var16 < arg4 ? var16 : arg4;
                } else {
                    var18 = var11 > arg5 ? var11 : arg5;
                    var21 = arg2 >= var12 ? arg2 : var12;
                    int var23 = var10.field1302 + var11;
                    int var24 = var12 + var10.field1435;
                    var22 = var24 < arg4 ? var24 : arg4;
                    var20 = var23 >= arg7 ? arg7 : var23;
                }
                if (!var10.field1336 || var20 > var18 && var22 > var21) {
                    if (var10.field1367 == 1337) {
                        class113.method901(0, var10);
                    } else {
                        if (var10.field1432 == 0) {
                            if (!var10.field1336 && class183.method1208((byte) 105, var10) && class11.field257 != var10) {
                                continue;
                            }
                            method539(var10.field1323, var11 - var10.field1390, var21, arg3, var22, var18, var12 - var10.field1405, var20, (byte) 122);
                            if (var10.field1368 != null) {
                                method539(var10.field1323, var11 - var10.field1390, var21, var10.field1368, var22, var18, var12 - var10.field1405, var20, (byte) 117);
                            }
                            class132 var25 = (class132) class133.field2885.method694(-23979, (long) var10.field1323);
                            if (var25 != null) {
                                class196.method1283(var21, var11, var18, var20, var25.field2865, var22, var12, (byte) 83);
                            }
                        }
                        if (var10.field1336) {
                            boolean var26;
                            if (class100.field2365 >= var18 && var21 <= class188.field3794 && class100.field2365 < var20 && class188.field3794 < var22) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            boolean var28 = false;
                            if (class168.field3471 == 1 && var26) {
                                var28 = true;
                            }
                            if (class158.field3280 == 1 && var18 <= class110.field2480 && var21 <= class143.field3074 && class110.field2480 < var20 && var22 > class143.field3074) {
                                var27 = true;
                            }
                            if (var10.field1367 == 1338) {
                                if (var27) {
                                    class100.method842(class110.field2480 - var11, -var12 + class143.field3074, 106, var10);
                                }
                                continue;
                            }
                            if (var27) {
                                class189.method1241(class110.field2480 - var11, -var12 + class143.field3074, var10, false);
                            }
                            if (class198.field3963 != null && class198.field3963 != var10 && var26 && class151.method1058((byte) -47, class10.method136((byte) -91, var10))) {
                                class106.field2411 = var10;
                            }
                            if (class174.field3584 == var10) {
                                class103.field2380 = var11;
                                class142.field3051 = true;
                                class28.field648 = var12;
                            }
                            if (var10.field1378) {
                                if (var26 && class164.field3384 != 0 && var10.field1387 != null) {
                                    class131 var29 = new class131();
                                    var29.field2862 = var10;
                                    var29.field2856 = class164.field3384;
                                    var29.field2853 = var10.field1387;
                                    class157.field3263.method1034(0, var29);
                                }
                                if (class198.field3963 != null || class89.field2094 != null || class188.field3796) {
                                    var28 = false;
                                    var26 = false;
                                    var27 = false;
                                }
                                if (!var10.field1397 && var27) {
                                    var10.field1397 = true;
                                    if (var10.field1375 != null) {
                                        class131 var30 = new class131();
                                        var30.field2854 = class110.field2480 - var11;
                                        var30.field2862 = var10;
                                        var30.field2853 = var10.field1375;
                                        var30.field2856 = class143.field3074 - var12;
                                        class157.field3263.method1034(0, var30);
                                    }
                                }
                                if (var10.field1397 && var28 && var10.field1354 != null) {
                                    class131 var31 = new class131();
                                    var31.field2854 = class100.field2365 - var11;
                                    var31.field2862 = var10;
                                    var31.field2853 = var10.field1354;
                                    var31.field2856 = class188.field3794 - var12;
                                    class157.field3263.method1034(0, var31);
                                }
                                if (var10.field1397 && !var28) {
                                    var10.field1397 = false;
                                    if (var10.field1303 != null) {
                                        class131 var32 = new class131();
                                        var32.field2862 = var10;
                                        var32.field2854 = class100.field2365 - var11;
                                        var32.field2856 = class188.field3794 - var12;
                                        var32.field2853 = var10.field1303;
                                        class163.field3362.method1034(0, var32);
                                    }
                                }
                                if (var28 && var10.field1330 != null) {
                                    class131 var33 = new class131();
                                    var33.field2853 = var10.field1330;
                                    var33.field2862 = var10;
                                    var33.field2856 = class188.field3794 - var12;
                                    var33.field2854 = class100.field2365 - var11;
                                    class157.field3263.method1034(0, var33);
                                }
                                if (!var10.field1425 && var26) {
                                    var10.field1425 = true;
                                    if (var10.field1394 != null) {
                                        class131 var34 = new class131();
                                        var34.field2854 = class100.field2365 - var11;
                                        var34.field2856 = class188.field3794 - var12;
                                        var34.field2853 = var10.field1394;
                                        var34.field2862 = var10;
                                        class157.field3263.method1034(0, var34);
                                    }
                                }
                                if (var10.field1425 && var26 && var10.field1377 != null) {
                                    class131 var35 = new class131();
                                    var35.field2853 = var10.field1377;
                                    var35.field2856 = class188.field3794 - var12;
                                    var35.field2862 = var10;
                                    var35.field2854 = class100.field2365 - var11;
                                    class157.field3263.method1034(0, var35);
                                }
                                if (var10.field1425 && !var26) {
                                    var10.field1425 = false;
                                    if (var10.field1371 != null) {
                                        class131 var36 = new class131();
                                        var36.field2856 = class188.field3794 - var12;
                                        var36.field2853 = var10.field1371;
                                        var36.field2854 = class100.field2365 - var11;
                                        var36.field2862 = var10;
                                        class163.field3362.method1034(0, var36);
                                    }
                                }
                                if (var10.field1305 != null) {
                                    class131 var37 = new class131();
                                    var37.field2853 = var10.field1305;
                                    var37.field2862 = var10;
                                    class163.field3358.method1034(0, var37);
                                }
                                if (var10.field1441 != null && var10.field1348 < class10.field231) {
                                    if (var10.field1347 == null || class10.field231 - var10.field1348 > 32) {
                                        class131 var42 = new class131();
                                        var42.field2862 = var10;
                                        var42.field2853 = var10.field1441;
                                        class157.field3263.method1034(0, var42);
                                    } else {
                                        label396: for (int var38 = var10.field1348; var38 < class10.field231; var38++) {
                                            int var39 = class50.field1217[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field1347.length; var40++) {
                                                if (var10.field1347[var40] == var39) {
                                                    class131 var41 = new class131();
                                                    var41.field2862 = var10;
                                                    var41.field2853 = var10.field1441;
                                                    class157.field3263.method1034(0, var41);
                                                    break label396;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1348 = class10.field231;
                                }
                                if (var10.field1399 != null && var10.field1364 < class175.field3601) {
                                    if (var10.field1396 == null || class175.field3601 - var10.field1364 > 32) {
                                        class131 var47 = new class131();
                                        var47.field2862 = var10;
                                        var47.field2853 = var10.field1399;
                                        class157.field3263.method1034(0, var47);
                                    } else {
                                        label372: for (int var43 = var10.field1364; var43 < class175.field3601; var43++) {
                                            int var44 = class138.field2961[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field1396.length; var45++) {
                                                if (var10.field1396[var45] == var44) {
                                                    class131 var46 = new class131();
                                                    var46.field2853 = var10.field1399;
                                                    var46.field2862 = var10;
                                                    class157.field3263.method1034(0, var46);
                                                    break label372;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1364 = class175.field3601;
                                }
                                if (var10.field1395 != null && var10.field1409 < class206.field4056) {
                                    if (var10.field1438 == null || class206.field4056 - var10.field1409 > 32) {
                                        class131 var52 = new class131();
                                        var52.field2862 = var10;
                                        var52.field2853 = var10.field1395;
                                        class157.field3263.method1034(0, var52);
                                    } else {
                                        label348: for (int var48 = var10.field1409; var48 < class206.field4056; var48++) {
                                            int var49 = class203.field4033[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field1438.length; var50++) {
                                                if (var10.field1438[var50] == var49) {
                                                    class131 var51 = new class131();
                                                    var51.field2862 = var10;
                                                    var51.field2853 = var10.field1395;
                                                    class157.field3263.method1034(0, var51);
                                                    break label348;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1409 = class206.field4056;
                                }
                                if (var10.field1391 < class121.field2660 && var10.field1312 != null) {
                                    class131 var53 = new class131();
                                    var53.field2862 = var10;
                                    var53.field2853 = var10.field1312;
                                    class157.field3263.method1034(0, var53);
                                }
                                if (var10.field1391 < client.field705 && var10.field1366 != null) {
                                    class131 var54 = new class131();
                                    var54.field2862 = var10;
                                    var54.field2853 = var10.field1366;
                                    class157.field3263.method1034(0, var54);
                                }
                                if (class16.field396 > var10.field1391 && var10.field1318 != null) {
                                    class131 var55 = new class131();
                                    var55.field2862 = var10;
                                    var55.field2853 = var10.field1318;
                                    class157.field3263.method1034(0, var55);
                                }
                                if (class118.field2637 > var10.field1391 && var10.field1316 != null) {
                                    class131 var56 = new class131();
                                    var56.field2862 = var10;
                                    var56.field2853 = var10.field1316;
                                    class157.field3263.method1034(0, var56);
                                }
                                if (var10.field1391 < class48.field1178 && var10.field1326 != null) {
                                    class131 var57 = new class131();
                                    var57.field2862 = var10;
                                    var57.field2853 = var10.field1326;
                                    class157.field3263.method1034(0, var57);
                                }
                                var10.field1391 = class72.field1807;
                                if (var10.field1388 != null) {
                                    for (int var58 = 0; var58 < class140.field3014; var58++) {
                                        class131 var59 = new class131();
                                        var59.field2862 = var10;
                                        var59.field2863 = class148.field3119[var58];
                                        var59.field2850 = class191.field3884[var58];
                                        var59.field2853 = var10.field1388;
                                        class157.field3263.method1034(0, var59);
                                    }
                                }
                            }
                        }
                        if (!var10.field1336) {
                            if (class198.field3963 != null || class89.field2094 != null || class188.field3796) {
                                return;
                            }
                            if ((var10.field1308 >= 0 || var10.field1365 != 0) && class100.field2365 >= var18 && var21 <= class188.field3794 && var20 > class100.field2365 && class188.field3794 < var22) {
                                if (var10.field1308 >= 0) {
                                    class11.field257 = arg3[var10.field1308];
                                } else {
                                    class11.field257 = var10;
                                }
                            }
                            if (var10.field1432 == 8 && var18 <= class100.field2365 && var21 <= class188.field3794 && var20 > class100.field2365 && var22 > class188.field3794) {
                                class114.field2557 = var10;
                            }
                            if (var10.field1369 > var10.field1435) {
                                class206.method1354(var10, 541, class188.field3794, class100.field2365, var10.field1369, var10.field1435, var12, var11 + var10.field1302);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
    public final void method540(byte arg0, int arg1) {
        field1452++;
        if (this.field1454 == null) {
            return;
        }
        if (this.field1461 != 0) {
            if (class187.field3773 == null || class187.field3773.length < this.field1454.length) {
                class187.field3773 = new int[this.field1454.length];
            }
            int var3 = this.field1454.length;
            short var4;
            if (this.field1454.length == 4096) {
                var4 = 64;
            } else {
                var4 = 128;
            }
            int var5 = this.field1448 * arg1 * var4;
            if (this.field1461 == 2) {
                var5 = -var5;
            }
            int var6 = var3 - 1;
            for (int var7 = 0; var7 < var3; var7++) {
                int var9 = var6 & var7 + var5;
                class187.field3773[var7] = this.field1454[var9];
            }
            int[] var8 = this.field1454;
            this.field1454 = class187.field3773;
            class187.field3773 = var8;
        }
        if (this.field1450 != 0) {
            if (class187.field3773 == null || this.field1454.length > class187.field3773.length) {
                class187.field3773 = new int[this.field1454.length];
            }
            short var10;
            if (this.field1454.length == 4096) {
                var10 = 64;
            } else {
                var10 = 128;
            }
            int var11 = this.field1454.length;
            int var12 = this.field1448 * arg1;
            if (this.field1450 == 1) {
                var12 = -var12;
            }
            int var13 = var10 - 1;
            for (int var14 = 0; var14 < var11; var14 += var10) {
                for (int var16 = 0; var16 < var10; var16++) {
                    int var17 = var14 + var16;
                    int var18 = (var12 + var16 & var13) + var14;
                    class187.field3773[var17] = this.field1454[var18];
                }
            }
            int[] var15 = this.field1454;
            this.field1454 = class187.field3773;
            class187.field3773 = var15;
        }
        if (arg0 != -70) {
            this.method545(6, null, null, 87);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljc;Lwc;I)Z")
    public final boolean method541(class85 arg0, class201 arg1, int arg2) {
        if (arg2 != 0) {
            this.field1450 = -110;
        }
        field1451++;
        return this.field1449.method769(125, arg0, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1466++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(Z)V")
    public static void method542(boolean arg0) {
        field1464 = null;
        field1456 = null;
        field1458 = null;
        if (!arg0) {
            method542(true);
        }
        field1457 = null;
        field1455 = null;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
    public static final int method543(int arg0) {
        field1444++;
        int var1 = 3;
        if (class123.field2719 < 310) {
            int var2 = class35.field828 >> 7;
            int var3 = class21.field491 >> 7;
            int var4 = class3.field72.field1144 >> 7;
            int var5 = class3.field72.field1141 >> 7;
            if ((class49.field1194[class112.field2528][var2][var3] & 0x4) != 0) {
                var1 = class112.field2528;
            }
            int var6;
            if (var3 < var4) {
                var6 = var4 - var3;
            } else {
                var6 = var3 - var4;
            }
            int var7;
            if (var2 >= var5) {
                var7 = var2 - var5;
            } else {
                var7 = var5 - var2;
            }
            if (var6 < var7) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var2 != var5) {
                    var9 += var8;
                    if (var2 < var5) {
                        var2++;
                    } else if (var5 < var2) {
                        var2--;
                    }
                    if ((class49.field1194[class112.field2528][var2][var3] & 0x4) != 0) {
                        var1 = class112.field2528;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var4 > var3) {
                            var3++;
                        } else if (var3 > var4) {
                            var3--;
                        }
                        if ((class49.field1194[class112.field2528][var2][var3] & 0x4) != 0) {
                            var1 = class112.field2528;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var3 != var4) {
                    var11 += var10;
                    if (var4 > var3) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    if ((class49.field1194[class112.field2528][var2][var3] & 0x4) != 0) {
                        var1 = class112.field2528;
                    }
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var2 < var5) {
                            var2++;
                        } else if (var5 < var2) {
                            var2--;
                        }
                        if ((class49.field1194[class112.field2528][var2][var3] & 0x4) != 0) {
                            var1 = class112.field2528;
                        }
                    }
                }
            }
        }
        if ((class49.field1194[class112.field2528][class3.field72.field1141 >> 7][class3.field72.field1144 >> 7] & 0x4) != arg0) {
            var1 = class112.field2528;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIFLwc;Ljc;)[I")
    public final int[] method544(int arg0, int arg1, float arg2, class201 arg3, class85 arg4) {
        field1462++;
        if (arg0 != -1) {
            this.method541(null, null, 8);
        }
        if (this.field1454 == null || this.field1467 != arg2) {
            if (!this.field1449.method769(38, arg4, arg3)) {
                return null;
            }
            int var6 = arg1 < this.field1453 ? arg1 : this.field1453;
            this.field1454 = this.field1449.method767(arg4, 58, var6, (double) arg2, var6, arg3, true);
            this.field1467 = arg2;
        }
        return this.field1454;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILwc;Ljc;I)[I")
    public final int[] method545(int arg0, class201 arg1, class85 arg2, int arg3) {
        int var5 = 120 / ((51 - arg3) / 36);
        field1460++;
        if (this.field1449.method769(116, arg2, arg1)) {
            int var6 = arg0 >= this.field1453 ? this.field1453 : arg0;
            return this.field1449.method767(arg2, 92, var6, 1.0D, var6, arg1, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lab;)V")
    public class55(class3 arg0) {
        this.field1449 = new class88(arg0);
        int var2 = arg0.method64(31790);
        this.field1447 = (var2 & 0x1) != 0;
        this.field1463 = (var2 & 0x2) != 0;
        this.field1453 = arg0.method64(31790);
        this.field1459 = arg0.method46((byte) 65);
        this.field1445 = arg0.method64(31790);
        if (this.field1445 == 255) {
            this.field1445 = 256;
        }
        int var3 = arg0.method64(31790);
        int var4 = arg0.method64(31790);
        this.field1450 = var3 >> 6 & 0x3;
        this.field1448 = (var4 & 0x3F) - 6;
        this.field1461 = var4 >> 6 & 0x3;
        arg0.method64(31790);
        arg0.method64(31790);
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class55() {
        this.field1449 = new class88();
        this.field1447 = true;
        this.field1453 = 1;
    }
}
