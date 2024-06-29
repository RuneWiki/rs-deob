import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class352 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Z")
    public static boolean field5420 = false;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5421 = 0;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field5426 = 0;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5425 = "Face here";

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "F")
    public static float field5427;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "[I")
    public static int[] field5424;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V", line = 9)
    public static final void method2454(int arg0, int arg1, int arg2) {
        int var3 = -14 / ((-arg0 - 54) / 39);
        class95 var4 = class227.method1699(7, -1855723168, arg2);
        var4.method738((byte) -113);
        var4.field1328 = arg1;
        field5423++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lmc;Z)V", line = 26)
    public static final void method2455(class167 arg0, boolean arg1) {
        class76.field1107.method106(arg0, -126);
        while (true) {
            class167 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class167[][] var7;
            class167 var120;
            do {
                class167 var119;
                do {
                    class167 var118;
                    do {
                        class167 var117;
                        do {
                            do {
                                do {
                                    float var8;
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class167) class76.field1107.method102((byte) -40);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2389);
                                            var3 = var2.field2392;
                                            var4 = var2.field2399;
                                            var5 = var2.field2398;
                                            var6 = var2.field2401;
                                            var7 = class302.field4502[var5];
                                            var8 = 0.0F;
                                            if (class141.field2031) {
                                                if (class240.field3567 == class132.field1930) {
                                                    int var9 = class165.field2358[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class139.field1999 != var10) {
                                                        class139.field1999 = var10;
                                                        class316.method2206(0, var10);
                                                        class222.method1628(class221.method1619(1));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class146.field2106 != var11) {
                                                        class146.field2106 = var11;
                                                        class243.method1786(var11, (byte) 76);
                                                    }
                                                    int var12 = class287.field4340[0][var3 + 1][var4] + class287.field4340[0][var3][var4] + class287.field4340[0][var3][var4 + 1] + class287.field4340[0][var3 + 1][var4 + 1] >> 2;
                                                    class2.method9(3, 10691, -var12);
                                                    var8 = 201.5F;
                                                    class141.method989(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class141.method989(var8);
                                                }
                                            }
                                            if (!var2.field2396) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class167 var13 = class302.field4502[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field2389) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class351.field5419 && var3 > class99.field1401) {
                                                    class167 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field2389 && (var14.field2396 || (var2.field2409 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class351.field5419 && var3 < class88.field1241 - 1) {
                                                    class167 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field2389 && (var15.field2396 || (var2.field2409 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class294.field4433 && var4 > class107.field1542) {
                                                    class167 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field2389 && (var16.field2396 || (var2.field2409 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class294.field4433 && var4 < class207.field3032 - 1) {
                                                    class167 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field2389 && (var17.field2396 || (var2.field2409 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2396 = false;
                                            if (var2.field2416 != null) {
                                                class167 var18 = var2.field2416;
                                                if (class141.field2031) {
                                                    class141.method989(201.5F - (float) (var18.field2401 + 1) * 50.0F);
                                                }
                                                if (var18.field2394 == null) {
                                                    if (var18.field2415 != null) {
                                                        if (class362.method2547(0, var3, var4)) {
                                                            class98.method773(var18.field2415, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var3, var4, true);
                                                        } else {
                                                            class98.method773(var18.field2415, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class362.method2547(0, var3, var4)) {
                                                    class329.method2283(var18.field2394, 0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var3, var4, true);
                                                } else {
                                                    class329.method2283(var18.field2394, 0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var3, var4, false);
                                                }
                                                class11 var19 = var18.field2387;
                                                if (var19 != null) {
                                                    if (class141.field2031) {
                                                        if ((var19.field170 & var2.field2403) == 0) {
                                                            class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                        } else {
                                                            class268.method1974(var19.field170, class7.field142, class253.field3770, class126.field1843, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field165.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var19.field177 - class7.field142, var19.field175 - class253.field3770, var19.field168 - class126.field1843, var19.field172, var5, (class155) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field2407; var20++) {
                                                    class180 var21 = var18.field2406[var20];
                                                    if (var21 != null) {
                                                        if (class141.field2031) {
                                                            class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                        }
                                                        var21.field2591.method380(var21.field2596, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var21.field2600 - class7.field142, var21.field2599 - class253.field3770, var21.field2589 - class126.field1843, var21.field2585, var5, (class155) null);
                                                    }
                                                }
                                                if (class141.field2031) {
                                                    class141.method989(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field2394 == null) {
                                                if (var2.field2415 != null) {
                                                    if (class362.method2547(var6, var3, var4)) {
                                                        class98.method773(var2.field2415, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class98.method773(var2.field2415, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var3, var4, false);
                                                    }
                                                }
                                            } else if (class362.method2547(var6, var3, var4)) {
                                                class329.method2283(var2.field2394, var6, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field2394.field2486 != 12345678 || class179.field2562 && var5 <= class314.field4666) {
                                                    class329.method2283(var2.field2394, var6, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class85 var23 = var2.field2390;
                                                if (var23 != null && (var23.field1195 & 0x80000000L) != 0L) {
                                                    if (class141.field2031 && var23.field1206) {
                                                        class141.method989(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class141.field2031) {
                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                    }
                                                    var23.field1202.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var23.field1207 - class7.field142, var23.field1196 - class253.field3770, var23.field1200 - class126.field1843, var23.field1195, var5, (class155) null);
                                                    if (class141.field2031 && var23.field1206) {
                                                        class141.method989(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class11 var26 = var2.field2387;
                                            class94 var27 = var2.field2412;
                                            if (var26 != null || var27 != null) {
                                                if (class351.field5419 == var3) {
                                                    var24++;
                                                } else if (class351.field5419 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class294.field4433 == var4) {
                                                    var24 += 3;
                                                } else if (class294.field4433 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class279.field4237[var24];
                                                var2.field2403 = class360.field5690[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field170 & class58.field862[var24]) == 0) {
                                                    var2.field2395 = 0;
                                                } else if (var26.field170 == 16) {
                                                    var2.field2395 = 3;
                                                    var2.field2405 = class199.field2897[var24];
                                                    var2.field2408 = 3 - var2.field2405;
                                                } else if (var26.field170 == 32) {
                                                    var2.field2395 = 6;
                                                    var2.field2405 = class97.field1369[var24];
                                                    var2.field2408 = 6 - var2.field2405;
                                                } else if (var26.field170 == 64) {
                                                    var2.field2395 = 12;
                                                    var2.field2405 = class56.field820[var24];
                                                    var2.field2408 = 12 - var2.field2405;
                                                } else {
                                                    var2.field2395 = 9;
                                                    var2.field2405 = class124.field1808[var24];
                                                    var2.field2408 = 9 - var2.field2405;
                                                }
                                                if ((var26.field170 & var25) != 0 && !class77.method631(var6, var3, var4, var26.field170)) {
                                                    if (class141.field2031) {
                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                    }
                                                    var26.field165.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var26.field177 - class7.field142, var26.field175 - class253.field3770, var26.field168 - class126.field1843, var26.field172, var5, (class155) null);
                                                }
                                                if ((var26.field166 & var25) != 0 && !class77.method631(var6, var3, var4, var26.field166)) {
                                                    if (class141.field2031) {
                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                    }
                                                    var26.field174.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var26.field177 - class7.field142, var26.field175 - class253.field3770, var26.field168 - class126.field1843, var26.field172, var5, (class155) null);
                                                }
                                            }
                                            if (var27 != null && !class257.method1890(var6, var3, var4, var27.field1313.method371())) {
                                                if (class141.field2031) {
                                                    class141.method989(var8 - 0.5F);
                                                }
                                                if ((var27.field1314 & var25) != 0) {
                                                    if (class141.field2031) {
                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                    }
                                                    var27.field1313.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var27.field1316 + var27.field1309 - class7.field142, var27.field1307 - class253.field3770, var27.field1322 + var27.field1319 - class126.field1843, var27.field1311, var5, (class155) null);
                                                } else if (var27.field1314 == 256) {
                                                    int var28 = var27.field1316 - class7.field142;
                                                    int var29 = var27.field1307 - class253.field3770;
                                                    int var30 = var27.field1322 - class126.field1843;
                                                    int var31 = var27.field1318;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class141.field2031) {
                                                            class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                        }
                                                        var27.field1313.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var27.field1309 + var28, var29, var27.field1319 + var30, var27.field1311, var5, (class155) null);
                                                    } else if (var27.field1317 != null) {
                                                        if (class141.field2031) {
                                                            class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                        }
                                                        var27.field1317.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var28, var29, var30, var27.field1311, var5, (class155) null);
                                                    }
                                                }
                                                if (class141.field2031) {
                                                    class141.method989(var8);
                                                }
                                            }
                                            if (var22) {
                                                class85 var34 = var2.field2390;
                                                if (var34 != null && (var34.field1195 & 0x80000000L) == 0L) {
                                                    if (class141.field2031 && var34.field1206) {
                                                        class141.method989(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class141.field2031) {
                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                    }
                                                    var34.field1202.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var34.field1207 - class7.field142, var34.field1196 - class253.field3770, var34.field1200 - class126.field1843, var34.field1195, var5, (class155) null);
                                                    if (class141.field2031 && var34.field1206) {
                                                        class141.method989(var8);
                                                    }
                                                }
                                                class47 var35 = var2.field2402;
                                                if (var35 != null && var35.field717 == 0) {
                                                    if (class141.field2031) {
                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                    }
                                                    if (var35.field707 != null) {
                                                        var35.field707.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var35.field716 - class7.field142, var35.field706 - class253.field3770, var35.field713 - class126.field1843, var35.field705, var5, (class155) null);
                                                    }
                                                    if (var35.field708 != null) {
                                                        var35.field708.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var35.field716 - class7.field142, var35.field706 - class253.field3770, var35.field713 - class126.field1843, var35.field705, var5, (class155) null);
                                                    }
                                                    if (var35.field712 != null) {
                                                        var35.field712.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var35.field716 - class7.field142, var35.field706 - class253.field3770, var35.field713 - class126.field1843, var35.field705, var5, (class155) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field2409;
                                            if (var36 != 0) {
                                                if (var3 < class351.field5419 && (var36 & 0x4) != 0) {
                                                    class167 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field2389) {
                                                        class76.field1107.method106(var37, -127);
                                                    }
                                                }
                                                if (var4 < class294.field4433 && (var36 & 0x2) != 0) {
                                                    class167 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field2389) {
                                                        class76.field1107.method106(var38, -126);
                                                    }
                                                }
                                                if (var3 > class351.field5419 && (var36 & 0x1) != 0) {
                                                    class167 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field2389) {
                                                        class76.field1107.method106(var39, -126);
                                                    }
                                                }
                                                if (var4 > class294.field4433 && (var36 & 0x8) != 0) {
                                                    class167 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field2389) {
                                                        class76.field1107.method106(var40, -126);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2395 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field2407; var42++) {
                                                if (class252.field3742 != var2.field2406[var42].field2595 && (var2.field2413[var42] & var2.field2395) == var2.field2405) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class11 var43 = var2.field2387;
                                                if (!class77.method631(var6, var3, var4, var43.field170)) {
                                                    if (class141.field2031) {
                                                        label1037: {
                                                            if ((var43.field172 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field177 - class7.field142;
                                                                int var45 = var43.field168 - class126.field1843;
                                                                int var46 = (int) (var43.field172 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class146.field2109 - 1) {
                                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3 - 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class18.field295 - 1 && var4 < class146.field2109 - 1) {
                                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3 + 1, var4 + 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class18.field295 - 1 && var4 > 0) {
                                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3 + 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3 - 1, var4 - 1);
                                                                        break label1037;
                                                                    }
                                                                }
                                                            }
                                                            class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field165.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var43.field177 - class7.field142, var43.field175 - class253.field3770, var43.field168 - class126.field1843, var43.field172, var5, (class155) null);
                                                }
                                                var2.field2395 = 0;
                                            }
                                        }
                                        if (!var2.field2410) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field2407;
                                            var2.field2410 = false;
                                            int var48 = 0;
                                            label844: for (int var49 = 0; var49 < var47; var49++) {
                                                class180 var50 = var2.field2406[var49];
                                                if (class252.field3742 != var50.field2595) {
                                                    for (int var51 = var50.field2590; var51 <= var50.field2581; var51++) {
                                                        for (int var52 = var50.field2580; var52 <= var50.field2601; var52++) {
                                                            class167 var53 = var7[var51][var52];
                                                            if (var53.field2396) {
                                                                var2.field2410 = true;
                                                                continue label844;
                                                            }
                                                            if (var53.field2395 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field2590) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field2581) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field2580) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field2601) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field2395) == var2.field2408) {
                                                                    var2.field2410 = true;
                                                                    continue label844;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class331.field5039[var48++] = var50;
                                                    int var55 = class351.field5419 - var50.field2590;
                                                    int var56 = var50.field2581 - class351.field5419;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class294.field4433 - var50.field2580;
                                                    int var58 = var50.field2601 - class294.field4433;
                                                    if (var58 > var57) {
                                                        var50.field2588 = var55 + var58;
                                                    } else {
                                                        var50.field2588 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class180 var62 = class331.field5039[var61];
                                                    if (class252.field3742 != var62.field2595) {
                                                        if (var62.field2588 > var59) {
                                                            var59 = var62.field2588;
                                                            var60 = var61;
                                                        } else if (var62.field2588 == var59) {
                                                            int var63 = var62.field2600 - class7.field142;
                                                            int var64 = var62.field2589 - class126.field1843;
                                                            int var65 = class331.field5039[var60].field2600 - class7.field142;
                                                            int var66 = class331.field5039[var60].field2589 - class126.field1843;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class180 var67 = class331.field5039[var60];
                                                var67.field2595 = class252.field3742;
                                                if (!class152.method1096(var6, var67.field2590, var67.field2581, var67.field2580, var67.field2601, var67.field2591.method371())) {
                                                    if (class141.field2031) {
                                                        if ((var67.field2585 & 0xFC000L) == 147456L) {
                                                            class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                                                            int var68 = var67.field2600 - class7.field142;
                                                            int var69 = var67.field2589 - class126.field1843;
                                                            int var70 = (int) (var67.field2585 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class268.method1983(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class268.method1983(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class268.method1983(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class268.method1983(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class268.method1990(class7.field142, class253.field3770, class126.field1843, var5, var67.field2590, var67.field2580, var67.field2581, var67.field2601);
                                                        }
                                                    }
                                                    var67.field2591.method380(var67.field2596, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var67.field2600 - class7.field142, var67.field2599 - class253.field3770, var67.field2589 - class126.field1843, var67.field2585, var5, (class155) null);
                                                }
                                                for (int var71 = var67.field2590; var71 <= var67.field2581; var71++) {
                                                    for (int var72 = var67.field2580; var72 <= var67.field2601; var72++) {
                                                        class167 var73 = var7[var71][var72];
                                                        if (var73.field2395 != 0) {
                                                            class76.field1107.method106(var73, -128);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field2389) {
                                                            class76.field1107.method106(var73, -127);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2410) {
                                                break;
                                            }
                                        } catch (Exception var135) {
                                            var2.field2410 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field2404 != null) {
                                        if (class141.field2031) {
                                            GL var75 = class141.field2025;
                                            class141.method989(var8);
                                            class155.method1108(class7.field142, class253.field3770, class126.field1843);
                                            int var76 = var2.field2392 * 128 + 64 - class7.field142;
                                            int var77 = class132.field1930[var5][var2.field2392][var2.field2399] - class253.field3770;
                                            int var78 = var2.field2399 * 128 + 64 - class126.field1843;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class132.field1930[var5][var2.field2392][var2.field2399] - class132.field1930[var5 + 1][var2.field2392][var2.field2399];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class170.field2454 * var78 - class351.field5413 * var76 >> 16;
                                            int var81 = class273.field4151 * var80 + class232.field3505 * var77 >> 16;
                                            int var82 = (class273.field4151 * 91 + class232.field3505 * 0 >> 16) + var81;
                                            int var83 = (class273.field4151 * -91 - class232.field3505 * var79 >> 16) + var81;
                                            if (var83 < var82 - 1597) {
                                                var83 = var82 - 1597;
                                            }
                                            int var84 = var82 + 2 - var83;
                                            class341 var85 = null;
                                            class303 var86 = null;
                                            int var87 = -1;
                                            class341 var88 = (class341) var2.field2404.method1754(9858);
                                            while (true) {
                                                label1054: {
                                                    if (var88 != null) {
                                                        if (var88.field5263 == null || var88.field5263.field4532.field2220) {
                                                            var88.method1389(4096);
                                                            break label1054;
                                                        }
                                                        if ((byte) ((int) (var88.field5263.field4532.field2219 & 0xFFL)) != var2.field2391) {
                                                            var2.field2404 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field5263;
                                                            var87 = var86.field4553.field5;
                                                            break label1054;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field5263 != var86 || var88.field5263.field4553.field5 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class155.field2243[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class155.field2246[var90] = 0;
                                                        }
                                                        class155.field2244 = 0;
                                                        for (class341 var91 = var85; var91 != var88; var91 = (class341) var91.field877) {
                                                            if (var91.field5263 != null) {
                                                                int var92 = (var91.field5264 >> 12) - class7.field142;
                                                                int var93 = (var91.field5262 >> 12) - class253.field3770;
                                                                int var94 = (var91.field5266 >> 12) - class126.field1843;
                                                                int var95 = class170.field2454 * var94 - class351.field5413 * var92 >> 16;
                                                                int var96 = (class273.field4151 * var95 + class232.field3505 * var93 >> 16) - var83;
                                                                if (class155.field2243[var96] < 32) {
                                                                    class155.field2236[var96][class155.field2243[var96]++] = var91.field5275;
                                                                } else {
                                                                    if (class155.field2243[var96] == 32) {
                                                                        if (class155.field2244 == 32) {
                                                                            if (class155.field2216) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class155.field2243[var96] += class155.field2244++ + 1;
                                                                    }
                                                                    int var97 = class155.field2246[class155.field2243[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class155.field2245[class155.field2243[var96] - 32 - 1];
                                                                        int var10002 = class155.field2243[var96] - 32 - 1;
                                                                        int var10004 = class155.field2246[class155.field2243[var96] - 32 - 1];
                                                                        class155.field2246[var10002] = class155.field2246[class155.field2243[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field5275;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field2404.field3535 == var91.field877) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class155.field2210 && var86.field4553.field48 != -1) {
                                                            class345.field5336.method583(var86.field4553.field48, 64);
                                                            var98 = true;
                                                        } else {
                                                            class141.method1000(-1);
                                                        }
                                                        float var99 = (float) var87 * class155.field2255;
                                                        if (var99 > 64.0F) {
                                                            var99 = 64.0F;
                                                        }
                                                        var75.glPointSize(var99);
                                                        var86.field4532.method1113(var75, var84, var98, var86.field4553.field9);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field5263;
                                                            var87 = var88.field5263.field4553.field5;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class341) var2.field2404.method1749(false);
                                            }
                                            class155.method1123();
                                        } else {
                                            int var100 = class345.field5348 + class155.field2214;
                                            int var101 = class345.field5344 + class155.field2217;
                                            class60 var102 = var2.field2404.field3535;
                                            for (class60 var103 = var102.field877; var103 != var102; var103 = var103.field877) {
                                                class341 var104 = (class341) var103;
                                                if (var104.field5263 != null && !var104.field5263.field4532.field2220) {
                                                    if ((byte) ((int) (var104.field5263.field4532.field2219 & 0xFFL)) != var2.field2391) {
                                                        var2.field2404 = null;
                                                        break;
                                                    }
                                                    int var105 = (var104.field5264 >> 12) - class7.field142;
                                                    int var106 = (var104.field5262 >> 12) - class253.field3770;
                                                    int var107 = (var104.field5266 >> 12) - class126.field1843;
                                                    int var108 = class351.field5413 * var107 + class170.field2454 * var105 >> 16;
                                                    int var109 = class170.field2454 * var107 - class351.field5413 * var105 >> 16;
                                                    int var111 = class273.field4151 * var106 - class232.field3505 * var109 >> 16;
                                                    int var112 = class273.field4151 * var109 + class232.field3505 * var106 >> 16;
                                                    if (var112 >= 50) {
                                                        int var114 = (var108 << 9) / var112 + var100;
                                                        int var115 = (var111 << 9) / var112 + var101;
                                                        int var116 = var112 * 400;
                                                        if (var116 == 0) {
                                                            var116 = 1;
                                                        }
                                                        class44.method336(var114, var115, (var104.field5263.field4553.field5 << 16) / var116, var104.field5274, var104.field5274 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field2389);
                            } while (var2.field2395 != 0);
                            if (var3 > class351.field5419 || var3 <= class99.field1401) {
                                break;
                            }
                            var117 = var7[var3 - 1][var4];
                        } while (var117 != null && var117.field2389);
                        if (var3 < class351.field5419 || var3 >= class88.field1241 - 1) {
                            break;
                        }
                        var118 = var7[var3 + 1][var4];
                    } while (var118 != null && var118.field2389);
                    if (var4 > class294.field4433 || var4 <= class107.field1542) {
                        break;
                    }
                    var119 = var7[var3][var4 - 1];
                } while (var119 != null && var119.field2389);
                if (var4 < class294.field4433 || var4 >= class207.field3032 - 1) {
                    break;
                }
                var120 = var7[var3][var4 + 1];
            } while (var120 != null && var120.field2389);
            var2.field2389 = false;
            class292.field4422--;
            class47 var121 = var2.field2402;
            if (var121 != null && var121.field717 != 0) {
                if (class141.field2031) {
                    class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                }
                if (var121.field707 != null) {
                    var121.field707.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var121.field716 - class7.field142, var121.field706 - class253.field3770 - var121.field717, var121.field713 - class126.field1843, var121.field705, var5, (class155) null);
                }
                if (var121.field708 != null) {
                    var121.field708.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var121.field716 - class7.field142, var121.field706 - class253.field3770 - var121.field717, var121.field713 - class126.field1843, var121.field705, var5, (class155) null);
                }
                if (var121.field712 != null) {
                    var121.field712.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var121.field716 - class7.field142, var121.field706 - class253.field3770 - var121.field717, var121.field713 - class126.field1843, var121.field705, var5, (class155) null);
                }
            }
            if (var2.field2403 != 0) {
                class94 var122 = var2.field2412;
                if (var122 != null && !class257.method1890(var6, var3, var4, var122.field1313.method371())) {
                    if ((var122.field1314 & var2.field2403) != 0) {
                        if (class141.field2031) {
                            class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                        }
                        var122.field1313.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var122.field1316 + var122.field1309 - class7.field142, var122.field1307 - class253.field3770, var122.field1322 + var122.field1319 - class126.field1843, var122.field1311, var5, (class155) null);
                    } else if (var122.field1314 == 256) {
                        int var123 = var122.field1316 - class7.field142;
                        int var124 = var122.field1307 - class253.field3770;
                        int var125 = var122.field1322 - class126.field1843;
                        int var126 = var122.field1318;
                        int var127;
                        if (var126 == 1 || var126 == 2) {
                            var127 = -var123;
                        } else {
                            var127 = var123;
                        }
                        int var128;
                        if (var126 == 2 || var126 == 3) {
                            var128 = -var125;
                        } else {
                            var128 = var125;
                        }
                        if (var128 >= var127) {
                            if (class141.field2031) {
                                class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                            }
                            var122.field1313.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var122.field1309 + var123, var124, var122.field1319 + var125, var122.field1311, var5, (class155) null);
                        } else if (var122.field1317 != null) {
                            if (class141.field2031) {
                                class268.method1987(class7.field142, class253.field3770, class126.field1843, var5, var3, var4);
                            }
                            var122.field1317.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var123, var124, var125, var122.field1311, var5, (class155) null);
                        }
                    }
                }
                class11 var129 = var2.field2387;
                if (var129 != null) {
                    if ((var129.field166 & var2.field2403) != 0 && !class77.method631(var6, var3, var4, var129.field166)) {
                        if (class141.field2031) {
                            class268.method1974(var129.field166, class7.field142, class253.field3770, class126.field1843, var6, var3, var4);
                        }
                        var129.field174.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var129.field177 - class7.field142, var129.field175 - class253.field3770, var129.field168 - class126.field1843, var129.field172, var5, (class155) null);
                    }
                    if ((var129.field170 & var2.field2403) != 0 && !class77.method631(var6, var3, var4, var129.field170)) {
                        if (class141.field2031) {
                            class268.method1974(var129.field170, class7.field142, class253.field3770, class126.field1843, var6, var3, var4);
                        }
                        var129.field165.method380(0, class232.field3505, class273.field4151, class351.field5413, class170.field2454, var129.field177 - class7.field142, var129.field175 - class253.field3770, var129.field168 - class126.field1843, var129.field172, var5, (class155) null);
                    }
                }
            }
            if (var5 < class252.field3748 - 1) {
                class167 var130 = class302.field4502[var5 + 1][var3][var4];
                if (var130 != null && var130.field2389) {
                    class76.field1107.method106(var130, -126);
                }
            }
            if (var3 < class351.field5419) {
                class167 var131 = var7[var3 + 1][var4];
                if (var131 != null && var131.field2389) {
                    class76.field1107.method106(var131, -126);
                }
            }
            if (var4 < class294.field4433) {
                class167 var132 = var7[var3][var4 + 1];
                if (var132 != null && var132.field2389) {
                    class76.field1107.method106(var132, -126);
                }
            }
            if (var3 > class351.field5419) {
                class167 var133 = var7[var3 - 1][var4];
                if (var133 != null && var133.field2389) {
                    class76.field1107.method106(var133, -128);
                }
            }
            if (var4 > class294.field4433) {
                class167 var134 = var7[var3][var4 - 1];
                if (var134 != null && var134.field2389) {
                    class76.field1107.method106(var134, -127);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIII)V", line = 1245)
    public static final void method2456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class252 var7 = new class252();
        var7.field3760 = arg1 / 128;
        var7.field3749 = arg2 / 128;
        var7.field3752 = arg3 / 128;
        var7.field3731 = arg4 / 128;
        var7.field3753 = arg0;
        var7.field3745 = arg1;
        var7.field3740 = arg2;
        var7.field3755 = arg3;
        var7.field3747 = arg4;
        var7.field3739 = arg5;
        var7.field3743 = arg6;
        class294.field4430[class132.field1926++] = var7;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)[Lwg;", line = 1262)
    public static final class267[] method2457(byte arg0) {
        field5422++;
        int var1 = 57 % ((-arg0 - 57) / 34);
        if (class36.field528 == null) {
            class267[] var2 = class77.method634(class54.field787, (byte) -29);
            int var3 = 0;
            class267[] var4 = new class267[var2.length];
            label53: for (int var5 = 0; var5 < var2.length; var5++) {
                class267 var6 = var2[var5];
                if ((var6.field4074 <= 0 || var6.field4074 >= 24) && var6.field4075 >= 800 && var6.field4073 >= 600) {
                    for (int var7 = 0; var7 < var3; var7++) {
                        class267 var8 = var4[var7];
                        if (var6.field4075 == var8.field4075 && var6.field4073 == var8.field4073) {
                            if (var8.field4074 < var6.field4074) {
                                var4[var7] = var6;
                            }
                            continue label53;
                        }
                    }
                    var4[var3] = var6;
                    var3++;
                }
            }
            class36.field528 = new class267[var3];
            class84.method687(var4, 0, class36.field528, 0, var3);
            int[] var9 = new int[class36.field528.length];
            for (int var10 = 0; var10 < class36.field528.length; var10++) {
                class267 var11 = class36.field528[var10];
                var9[var10] = var11.field4075 * var11.field4073;
            }
            class92.method724(class36.field528, var9, 29361);
        }
        return class36.field528;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V", line = 1338)
    public static void method2458(byte arg0) {
        field5424 = null;
        field5425 = null;
        if (arg0 != -6) {
            field5425 = (String) null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILqf;)V", line = 1360)
    public static final void method2459(int arg0, class359 arg1) {
        if (arg0 <= 75) {
            field5426 = -17;
        }
        int var2 = arg1.field5515;
        field5428++;
        if (var2 == 324) {
            if (class243.field3610 == -1) {
                class191.field2793 = arg1.field5628;
                class243.field3610 = arg1.field5618;
            }
            if (class274.field4159.field3836) {
                arg1.field5618 = class243.field3610;
            } else {
                arg1.field5618 = class191.field2793;
            }
        } else if (var2 == 325) {
            if (class243.field3610 == -1) {
                class191.field2793 = arg1.field5628;
                class243.field3610 = arg1.field5618;
            }
            if (class274.field4159.field3836) {
                arg1.field5618 = class191.field2793;
            } else {
                arg1.field5618 = class243.field3610;
            }
        } else if (var2 == 327) {
            arg1.field5517 = 150;
            arg1.field5609 = (int) (Math.sin((double) class304.field4560 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field5623 = 5;
            arg1.field5595 = -1;
        } else if (var2 == 328) {
            if (class1.field55.field3453 == null) {
                arg1.field5595 = 0;
                arg1.field5606 = 0;
            } else {
                arg1.field5517 = 150;
                arg1.field5609 = (int) (Math.sin((double) class304.field4560 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field5595 = 2047;
                arg1.field5623 = 5;
                arg1.field5606 = class36.method268(class1.field55.field3453, (byte) 21);
                arg1.field5519 = 0;
                arg1.field5593 = class1.field55.field5180;
                arg1.field5547 = class1.field55.field5096;
                arg1.field5621 = class1.field55.field5151;
            }
        }
    }
}
