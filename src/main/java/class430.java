import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class430 extends class97 {

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public int field6319;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public int field6320;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field6322 = new String[100];

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Lwl;")
    public static class452 field6323 = new class452(63, 28);

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "Z")
    public static boolean field6326 = false;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Liq;")
    public static class134 field6321;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Lkr;")
    public static class234 field6314;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "Ltn;")
    public static class378 field6325;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z")
    public static final boolean method2641(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class453.field6723; var3++) {
            class112 var4 = class191.field2848[var3];
            if (var4.field1475 == 1) {
                int var5 = var4.field1478 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1469 * var5 >> 8) + var4.field1481;
                    int var7 = (var4.field1473 * var5 >> 8) + var4.field1483;
                    int var8 = (var4.field1468 * var5 >> 8) + var4.field1464;
                    int var9 = (var4.field1476 * var5 >> 8) + var4.field1465;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1475 == 2) {
                int var10 = arg0 - var4.field1478;
                if (var10 > 0) {
                    int var11 = (var4.field1469 * var10 >> 8) + var4.field1481;
                    int var12 = (var4.field1473 * var10 >> 8) + var4.field1483;
                    int var13 = (var4.field1468 * var10 >> 8) + var4.field1464;
                    int var14 = (var4.field1476 * var10 >> 8) + var4.field1465;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1475 == 3) {
                int var15 = var4.field1481 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1467 * var15 >> 8) + var4.field1478;
                    int var17 = (var4.field1482 * var15 >> 8) + var4.field1472;
                    int var18 = (var4.field1468 * var15 >> 8) + var4.field1464;
                    int var19 = (var4.field1476 * var15 >> 8) + var4.field1465;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1475 == 4) {
                int var20 = arg2 - var4.field1481;
                if (var20 > 0) {
                    int var21 = (var4.field1467 * var20 >> 8) + var4.field1478;
                    int var22 = (var4.field1482 * var20 >> 8) + var4.field1472;
                    int var23 = (var4.field1468 * var20 >> 8) + var4.field1464;
                    int var24 = (var4.field1476 * var20 >> 8) + var4.field1465;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1475 == 5) {
                int var25 = arg1 - var4.field1464;
                if (var25 > 0) {
                    int var26 = (var4.field1467 * var25 >> 8) + var4.field1478;
                    int var27 = (var4.field1482 * var25 >> 8) + var4.field1472;
                    int var28 = (var4.field1469 * var25 >> 8) + var4.field1481;
                    int var29 = (var4.field1473 * var25 >> 8) + var4.field1483;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
    public static final void method2642(int arg0) {
        field6317++;
        if (arg0 != 17516) {
            method2642(-63);
        }
        class359.field5313.method1485(-22032);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
    public static final void method2643(int arg0) {
        for (int var1 = 0; var1 < class5.field64; var1++) {
            int var10002 = class38.field469[var1]--;
            if (class38.field469[var1] >= -10) {
                class23 var3 = class278.field4230[var1];
                if (var3 == null) {
                    var3 = class23.method146(class435.field6408, class177.field2688[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class38.field469[var1] += var3.method145();
                    class278.field4230[var1] = var3;
                }
                if (class38.field469[var1] < 0) {
                    int var11;
                    if (class20.field272[var1] == 0) {
                        var11 = class438.field6445[var1] * class465.field6842 >> 8;
                    } else {
                        int var4 = class20.field272[var1] >> 24 & 0x3;
                        if (class113.field1500.field1902 == var4) {
                            int var5 = (class20.field272[var1] & 0xFF) * 128;
                            int var6 = (class20.field272[var1] & 0xFF6A04) >> 16;
                            int var7 = var6 * 128 + 64 - class113.field1500.field1900;
                            if (var7 < 0) {
                                var7 = -var7;
                            }
                            int var8 = class20.field272[var1] >> 8 & 0xFF;
                            int var9 = var8 * 128 + 64 - class113.field1500.field1892;
                            if (var9 < 0) {
                                var9 = -var9;
                            }
                            int var10 = var7 + var9 - 128;
                            if (var5 < var10) {
                                class38.field469[var1] = -100;
                                continue;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            }
                            var11 = (var5 - var10) * class438.field6445[var1] * client.field6666 / var5 >> 8;
                        } else {
                            var11 = 0;
                        }
                    }
                    if (var11 > 0) {
                        class2 var12 = var3.method148().method18(class165.field2298);
                        class444 var13 = class444.method2740(var12, 100, var11);
                        var13.method2737(class174.field2664[var1] - 1);
                        class267.field4077.method2133(var13);
                    }
                    class38.field469[var1] = -100;
                }
            } else {
                class5.field64--;
                for (int var2 = var1; var2 < class5.field64; var2++) {
                    class177.field2688[var2] = class177.field2688[var2 + 1];
                    class278.field4230[var2] = class278.field4230[var2 + 1];
                    class174.field2664[var2] = class174.field2664[var2 + 1];
                    class38.field469[var2] = class38.field469[var2 + 1];
                    class20.field272[var2] = class20.field272[var2 + 1];
                    class438.field6445[var2] = class438.field6445[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 <= 17) {
            method2647(-96, (class261) null);
        }
        field6316++;
        if (class437.field6428 && !class120.method721(-15920)) {
            if (class438.field6450 != 0 && class195.field2944 != -1) {
                class250.method1523(class195.field2944, 0, class298.field4505, false, 179, class438.field6450);
            }
            class437.field6428 = false;
        } else if (class438.field6450 != 0 && class195.field2944 != -1 && !class120.method721(-15920)) {
            class292.field4452++;
            class177.method1082(class81.field1077, 0);
            class189.field2840.method2381(class195.field2944, 0);
            class195.field2944 = -1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILec;Ldr;IBII)V")
    public static final void method2644(int arg0, class96 arg1, class261 arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (class425.field6248 < 100) {
            class280.method1729(85, arg2, arg1);
        }
        if (arg4 != 29) {
            return;
        }
        field6315++;
        arg2.method436(arg0, arg6, arg0 + arg3, arg5 + arg6);
        if (class425.field6248 < 100) {
            byte var7 = 20;
            int var8 = arg3 / 2 + arg0;
            int var9 = arg5 / 2 + arg6 - var7 - 18;
            arg2.method358(arg0, arg6, arg3, arg5, -16777216, 0);
            arg2.method422(var8 - 152, var9, 304, 34, class364.field5354[class405.field6021].getRGB(), 0);
            arg2.method358(var8 - 150, var9 - -2, class425.field6248 * 3, 30, class253.field3864[class405.field6021].getRGB(), 0);
            class161.field2244.method858(-3700, class142.field1904[class405.field6021].getRGB(), -1, var9 + var7, var8, class121.field1591.method937((byte) 121, class27.field356));
            return;
        }
        int var10 = class295.field4480 - ((int) ((float) arg3 / class223.field3388));
        int var11 = class217.field3305 + ((int) ((float) arg5 / class223.field3388));
        int var12 = class295.field4480 + ((int) ((float) arg3 / class223.field3388));
        class176.field2678 = (int) ((float) (arg5 * 2) / class223.field3388);
        int var13 = class217.field3305 - (int) ((float) arg5 / class223.field3388);
        class100.field1371 = class217.field3305 - ((int) ((float) arg5 / class223.field3388));
        class217.field3301 = (int) ((float) (arg3 * 2) / class223.field3388);
        class405.field6030 = class295.field4480 - ((int) ((float) arg3 / class223.field3388));
        class223.method1358(class223.field3394 + var10, class223.field3405 + var11, var12 + class223.field3394, var13 - -class223.field3405, arg0, arg6, arg0 + arg3, arg5 + arg6 + 1);
        class223.method1367(arg2);
        class398 var14 = class223.method1352(arg2);
        class266.method1651(0, 0, (byte) -29, arg2, var14);
        if (class354.field5228 > 0) {
            class426.field6263--;
            if (class426.field6263 == 0) {
                class354.field5228--;
                class426.field6263 = 20;
            }
        }
        if (!class212.field3194) {
            return;
        }
        int var15 = arg0 + arg3 - 5;
        int var16 = arg5 + arg6 - 8;
        class380.field5552.method860(31, 16776960, -1, "Fps:" + class388.field5733, var16, var15);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class380.field5552.method860(31, var19, -1, "Mem:" + var18 + "k", var20, var15);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V")
    public static void method2645(int arg0) {
        field6323 = null;
        if (arg0 != -16441) {
            field6325 = null;
        }
        field6325 = null;
        field6322 = null;
        field6321 = null;
        field6314 = null;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)Z")
    public static final boolean method2646(int arg0, int arg1, int arg2) {
        field6324++;
        if ((class341.field5085[1][arg1][arg2] & 0x2) == 0) {
            if (arg0 != 27156) {
                field6323 = null;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(II)V")
    public class430(int arg0, int arg1) {
        this.field6319 = arg1;
        this.field6320 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILdr;)V")
    public static final void method2647(int arg0, class261 arg1) {
        field6318++;
        if (arg0 == 21282 && class423.field6227 != class113.field1500.field1902 && class277.field4216 != null && class338.method2065(class113.field1500.field1902, -19308, arg1)) {
            class423.field6227 = class113.field1500.field1902;
        }
    }
}
