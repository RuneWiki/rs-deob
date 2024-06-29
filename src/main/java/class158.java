import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class158 {

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field2457 = 0;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2455 = "Members object";

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2461 = 0;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field2462 = 1;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)V")
    public static final void method1067(int arg0, int arg1, int arg2, int arg3) {
        field2456++;
        class41 var4 = class221.method1492((byte) -42, arg3, 9);
        var4.method301(8792);
        var4.field583 = arg1;
        var4.field584 = arg0;
        if (arg2 != -5) {
            method1071((byte) 74);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method1068(int arg0) {
        field2455 = null;
        if (arg0 != -13344) {
            method1068(21);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)I")
    public static final int method1069(int arg0, int arg1, int arg2) {
        field2459++;
        int var3 = class179.method1211(arg0 + 45365, arg1 + 91923, 4, arg2 - 186742851) + (-(-(class179.method1211(arg0 + 10294, arg1 + 37821, 2, arg2 ^ -186742851) - 128 >> 1) - (class179.method1211(arg0, arg1, 1, -1) - 128 >> 2)) - 128);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg2 != 186742850) {
            field2461 = 1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILhc;IILhc;)Lvl;")
    public static final class242 method1070(int arg0, class235 arg1, int arg2, int arg3, class235 arg4) {
        field2463++;
        if (arg2 != 16383) {
            method1069(-72, -68, -128);
        }
        return class212.method1440(arg0, arg1, arg3, 41) ? class209.method1406(-102, arg4.method1590(arg0, (byte) -25, arg3)) : null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    public static final void method1071(byte arg0) {
        if (arg0 != -43) {
            method1070(-57, (class235) null, -78, 47, (class235) null);
        }
        int[] var1 = new int[class31.field461];
        int var2 = 0;
        field2458++;
        for (int var3 = 0; var3 < class31.field461; var3++) {
            class72 var5 = class85.method602(false, var3);
            if (var5.field1181 >= 0 || var5.field1180 >= 0) {
                var1[var2++] = var3;
            }
        }
        class231.field3682 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class231.field3682[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILua;)V")
    public static final void method1072(int arg0, int arg1, class116 arg2) {
        field2454++;
        Object[] var3 = arg2.field1895;
        int var4 = (Integer) var3[0];
        class248 var5 = class116.method821(var4, (byte) -92);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class182.field2835 = 0;
        if (arg1 != -5103) {
            method1070(-122, (class235) null, -118, 66, (class235) null);
        }
        int var7 = 0;
        int var8 = -1;
        byte var9 = -1;
        int[] var10 = var5.field4007;
        int[] var11 = var5.field4011;
        try {
            class191.field2967 = new int[var5.field4015];
            class214.field3331 = new String[var5.field4021];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field1888;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field1884;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field1892 == null ? -1 : arg2.field1892.field3480;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field1887;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field1892 == null ? -1 : arg2.field1892.field3551;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field1885 == null ? -1 : arg2.field1885.field3480;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field1885 == null ? -1 : arg2.field1885.field3551;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field1894;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field1900;
                    }
                    class191.field2967[var13++] = var16;
                } else if (var3[var14] instanceof String) {
                    String var15 = (String) var3[var14];
                    if (var15.equals("event_opbase")) {
                        var15 = arg2.field1893;
                    }
                    class214.field3331[var12++] = var15;
                }
            }
            int var17 = 0;
            label4018: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var517 = var10[var8];
                if (var517 < 100) {
                    if (var517 == 0) {
                        class79.field1318[var6++] = var11[var8];
                        continue;
                    }
                    if (var517 == 1) {
                        int var18 = var11[var8];
                        class79.field1318[var6++] = class31.field462[var18];
                        continue;
                    }
                    if (var517 == 2) {
                        int var19 = var11[var8];
                        var6--;
                        class80.method577(class79.field1318[var6], 2, var19);
                        continue;
                    }
                    if (var517 == 3) {
                        class90.field1577[var7++] = var5.field4006[var8];
                        continue;
                    }
                    if (var517 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var517 == 7) {
                        var6 -= 2;
                        if (class79.field1318[var6 + 1] != class79.field1318[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 8) {
                        var6 -= 2;
                        if (class79.field1318[var6 + 1] == class79.field1318[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 9) {
                        var6 -= 2;
                        if (class79.field1318[var6] < class79.field1318[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 10) {
                        var6 -= 2;
                        if (class79.field1318[var6 + 1] < class79.field1318[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 21) {
                        if (class182.field2835 == 0) {
                            return;
                        }
                        class40 var20 = class104.field1736[--class182.field2835];
                        class191.field2967 = var20.field573;
                        var8 = var20.field577;
                        class214.field3331 = var20.field576;
                        var5 = var20.field582;
                        var10 = var5.field4007;
                        var11 = var5.field4011;
                        continue;
                    }
                    if (var517 == 25) {
                        int var21 = var11[var8];
                        class79.field1318[var6++] = class251.method1719(true, var21);
                        continue;
                    }
                    if (var517 == 27) {
                        int var22 = var11[var8];
                        var6--;
                        class198.method1347(var22, class79.field1318[var6], false);
                        continue;
                    }
                    if (var517 == 31) {
                        var6 -= 2;
                        if (class79.field1318[var6] <= class79.field1318[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 32) {
                        var6 -= 2;
                        if (class79.field1318[var6] >= class79.field1318[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var517 == 33) {
                        class79.field1318[var6++] = class191.field2967[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var517 == 34) {
                        var10001 = var11[var8];
                        var6--;
                        class191.field2967[var10001] = class79.field1318[var6];
                        continue;
                    }
                    if (var517 == 35) {
                        class90.field1577[var7++] = class214.field3331[var11[var8]];
                        continue;
                    }
                    if (var517 == 36) {
                        var10001 = var11[var8];
                        var7--;
                        class214.field3331[var10001] = class90.field1577[var7];
                        continue;
                    }
                    if (var517 == 37) {
                        int var23 = var11[var8];
                        var7 -= var23;
                        String var24 = class277.method1871(class90.field1577, var23, (byte) 99, var7);
                        class90.field1577[var7++] = var24;
                        continue;
                    }
                    if (var517 == 38) {
                        var6--;
                        continue;
                    }
                    if (var517 == 39) {
                        var7--;
                        continue;
                    }
                    if (var517 == 40) {
                        int var25 = var11[var8];
                        class248 var26 = class116.method821(var25, (byte) -92);
                        int[] var27 = new int[var26.field4015];
                        String[] var28 = new String[var26.field4021];
                        for (int var29 = 0; var29 < var26.field4018; var29++) {
                            var27[var29] = class79.field1318[var6 + var29 - var26.field4018];
                        }
                        for (int var30 = 0; var30 < var26.field4013; var30++) {
                            var28[var30] = class90.field1577[var7 + var30 - var26.field4013];
                        }
                        var6 -= var26.field4018;
                        var7 -= var26.field4013;
                        class40 var31 = new class40();
                        var31.field577 = var8;
                        var31.field573 = class191.field2967;
                        var31.field582 = var5;
                        var31.field576 = class214.field3331;
                        if (class182.field2835 >= class104.field1736.length) {
                            throw new RuntimeException();
                        }
                        class104.field1736[class182.field2835++] = var31;
                        var5 = var26;
                        var10 = var26.field4007;
                        var8 = -1;
                        class214.field3331 = var28;
                        class191.field2967 = var27;
                        var11 = var26.field4011;
                        continue;
                    }
                    if (var517 == 42) {
                        class79.field1318[var6++] = class167.field2621[var11[var8]];
                        continue;
                    }
                    if (var517 == 43) {
                        int var32 = var11[var8];
                        var6--;
                        class167.field2621[var32] = class79.field1318[var6];
                        class249.method1713(var32, (byte) -90);
                        continue;
                    }
                    if (var517 == 44) {
                        int var33 = var11[var8] & 0xFFFF;
                        int var34 = var11[var8] >> 16;
                        var6--;
                        int var35 = class79.field1318[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class147.field2326[var34] = var35;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label4018;
                                }
                                class113.field1846[var34][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 45) {
                        int var38 = var11[var8];
                        var6--;
                        int var39 = class79.field1318[var6];
                        if (var39 >= 0 && var39 < class147.field2326[var38]) {
                            class79.field1318[var6++] = class113.field1846[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 46) {
                        var6 -= 2;
                        int var40 = var11[var8];
                        int var41 = class79.field1318[var6];
                        if (var41 >= 0 && var41 < class147.field2326[var40]) {
                            class113.field1846[var40][var41] = class79.field1318[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 47) {
                        String var42 = class30.field451[var11[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class90.field1577[var7++] = var42;
                        continue;
                    }
                    if (var517 == 48) {
                        int var43 = var11[var8];
                        var7--;
                        class30.field451[var43] = class90.field1577[var7];
                        class55.method425(var43, (byte) 124);
                        continue;
                    }
                    if (var517 == 51) {
                        class39 var44 = var5.field4009[var11[var8]];
                        var6--;
                        class120 var45 = (class120) var44.method285((long) class79.field1318[var6], 13821);
                        if (var45 != null) {
                            var8 += var45.field1932;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var517 < 300) {
                    if (var517 == 100) {
                        var6 -= 3;
                        int var497 = class79.field1318[var6];
                        int var498 = class79.field1318[var6 + 2];
                        int var499 = class79.field1318[var6 + 1];
                        if (var499 == 0) {
                            throw new RuntimeException();
                        }
                        class228 var500 = class84.method596((byte) 35, var497);
                        if (var500.field3498 == null) {
                            var500.field3498 = new class228[var498 + 1];
                        }
                        if (var500.field3498.length <= var498) {
                            class228[] var501 = new class228[var498 + 1];
                            for (int var502 = 0; var502 < var500.field3498.length; var502++) {
                                var501[var502] = var500.field3498[var502];
                            }
                            var500.field3498 = var501;
                        }
                        if (var498 > 0 && var500.field3498[var498 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var498 - 1));
                        }
                        class228 var503 = new class228();
                        var503.field3467 = var503.field3480 = var500.field3480;
                        var503.field3520 = true;
                        var503.field3551 = var498;
                        var503.field3477 = var499;
                        var500.field3498[var498] = var503;
                        if (var46) {
                            class24.field326 = var503;
                        } else {
                            class190.field2942 = var503;
                        }
                        class82.method591(var500, false);
                        continue;
                    }
                    if (var517 == 101) {
                        class228 var504 = var46 ? class24.field326 : class190.field2942;
                        if (var504.field3551 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class228 var505 = class84.method596((byte) 35, var504.field3480);
                        var505.field3498[var504.field3551] = null;
                        class82.method591(var505, false);
                        continue;
                    }
                    if (var517 == 102) {
                        var6--;
                        class228 var506 = class84.method596((byte) 35, class79.field1318[var6]);
                        var506.field3498 = null;
                        class82.method591(var506, false);
                        continue;
                    }
                    if (var517 == 200) {
                        var6 -= 2;
                        int var507 = class79.field1318[var6];
                        int var508 = class79.field1318[var6 + 1];
                        class228 var509 = class31.method239(var508, arg1 ^ 0x13EE, var507);
                        if (var509 != null && var508 != -1) {
                            class79.field1318[var6++] = 1;
                            if (var46) {
                                class24.field326 = var509;
                            } else {
                                class190.field2942 = var509;
                            }
                            continue;
                        }
                        class79.field1318[var6++] = 0;
                        continue;
                    }
                    if (var517 == 201) {
                        var6--;
                        int var510 = class79.field1318[var6];
                        class228 var511 = class84.method596((byte) 35, var510);
                        if (var511 == null) {
                            class79.field1318[var6++] = 0;
                        } else {
                            class79.field1318[var6++] = 1;
                            if (var46) {
                                class24.field326 = var511;
                            } else {
                                class190.field2942 = var511;
                            }
                        }
                        continue;
                    }
                } else if (var517 < 500) {
                    if (var517 == 403) {
                        var6 -= 2;
                        int var47 = class79.field1318[var6];
                        int var48 = class79.field1318[var6 + 1];
                        for (int var49 = 0; var49 < class148.field2352.length; var49++) {
                            if (class148.field2352[var49] == var47) {
                                class283.field4473.field3800.method358(var48, (byte) -127, var49);
                                continue label4018;
                            }
                        }
                        int var50 = 0;
                        while (true) {
                            if (class103.field1725.length <= var50) {
                                continue label4018;
                            }
                            if (class103.field1725[var50] == var47) {
                                class283.field4473.field3800.method358(var48, (byte) -127, var50);
                                continue label4018;
                            }
                            var50++;
                        }
                    }
                    if (var517 == 404) {
                        var6 -= 2;
                        int var51 = class79.field1318[var6];
                        int var52 = class79.field1318[var6 + 1];
                        class283.field4473.field3800.method355((byte) 104, var51, var52);
                        continue;
                    }
                    if (var517 == 410) {
                        var6--;
                        boolean var53 = class79.field1318[var6] != 0;
                        class283.field4473.field3800.method370(var53, 126);
                        continue;
                    }
                } else if (!(var517 < 1000 || var517 >= 1100) || !(var517 < 2000 || var517 >= 2100)) {
                    class228 var491;
                    if (var517 >= 2000) {
                        var517 -= 1000;
                        var6--;
                        var491 = class84.method596((byte) 35, class79.field1318[var6]);
                    } else {
                        var491 = var46 ? class24.field326 : class190.field2942;
                    }
                    if (var517 == 1000) {
                        var6 -= 4;
                        var491.field3633 = class79.field1318[var6];
                        var491.field3616 = class79.field1318[var6 + 1];
                        int var492 = class79.field1318[var6 + 2];
                        if (var492 < 0) {
                            var492 = 0;
                        } else if (var492 > 5) {
                            var492 = 5;
                        }
                        int var493 = class79.field1318[var6 + 3];
                        var491.field3632 = (byte) var492;
                        if (var493 < 0) {
                            var493 = 0;
                        } else if (var493 > 5) {
                            var493 = 5;
                        }
                        var491.field3579 = (byte) var493;
                        class82.method591(var491, false);
                        class191.method1281((byte) -74, var491);
                        if (var491.field3551 == -1) {
                            class267.method1803(false, var491.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1001) {
                        var6 -= 4;
                        var491.field3464 = class79.field1318[var6];
                        var491.field3485 = class79.field1318[var6 + 1];
                        var491.field3482 = 0;
                        var491.field3491 = 0;
                        int var494 = class79.field1318[var6 + 3];
                        int var495 = class79.field1318[var6 + 2];
                        if (var494 < 0) {
                            var494 = 0;
                        } else if (var494 > 4) {
                            var494 = 4;
                        }
                        if (var495 < 0) {
                            var495 = 0;
                        } else if (var495 > 4) {
                            var495 = 4;
                        }
                        var491.field3511 = (byte) var494;
                        var491.field3586 = (byte) var495;
                        class82.method591(var491, false);
                        class191.method1281((byte) -71, var491);
                        if (var491.field3477 == 0) {
                            class258.method1753(var491, -15085, false);
                        }
                        continue;
                    }
                    if (var517 == 1003) {
                        var6--;
                        boolean var496 = class79.field1318[var6] == 1;
                        if (var491.field3622 != var496) {
                            var491.field3622 = var496;
                            class82.method591(var491, false);
                        }
                        if (var491.field3551 == -1) {
                            class150.method1012(-92, var491.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1004) {
                        var6 -= 2;
                        var491.field3475 = class79.field1318[var6];
                        var491.field3516 = class79.field1318[var6 + 1];
                        class82.method591(var491, false);
                        class191.method1281((byte) -86, var491);
                        if (var491.field3477 == 0) {
                            class258.method1753(var491, -15085, false);
                        }
                        continue;
                    }
                    if (var517 == 1005) {
                        var6--;
                        var491.field3636 = class79.field1318[var6] == 1;
                        continue;
                    }
                } else if (!(var517 < 1100 || var517 >= 1200) || !(var517 < 2100 || var517 >= 2200)) {
                    class228 var487;
                    if (var517 >= 2000) {
                        var517 -= 1000;
                        var6--;
                        var487 = class84.method596((byte) 35, class79.field1318[var6]);
                    } else {
                        var487 = var46 ? class24.field326 : class190.field2942;
                    }
                    if (var517 == 1100) {
                        var6 -= 2;
                        var487.field3606 = class79.field1318[var6];
                        if (var487.field3606 > var487.field3522 - var487.field3574) {
                            var487.field3606 = var487.field3522 - var487.field3574;
                        }
                        if (var487.field3606 < 0) {
                            var487.field3606 = 0;
                        }
                        var487.field3523 = class79.field1318[var6 + 1];
                        if (var487.field3513 - var487.field3625 < var487.field3523) {
                            var487.field3523 = var487.field3513 - var487.field3625;
                        }
                        if (var487.field3523 < 0) {
                            var487.field3523 = 0;
                        }
                        class82.method591(var487, false);
                        if (var487.field3551 == -1) {
                            class186.method1259(var487.field3480, 0);
                        }
                        continue;
                    }
                    if (var517 == 1101) {
                        var6--;
                        var487.field3493 = class79.field1318[var6];
                        class82.method591(var487, false);
                        if (var487.field3551 == -1) {
                            class181.method1234((byte) 87, var487.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1102) {
                        var6--;
                        var487.field3571 = class79.field1318[var6] == 1;
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1103) {
                        var6--;
                        var487.field3570 = class79.field1318[var6];
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1104) {
                        var6--;
                        var487.field3605 = class79.field1318[var6];
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1105) {
                        var6--;
                        var487.field3507 = class79.field1318[var6];
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1106) {
                        var6--;
                        var487.field3486 = class79.field1318[var6];
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1107) {
                        var6--;
                        var487.field3497 = class79.field1318[var6] == 1;
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1108) {
                        var487.field3515 = 1;
                        var6--;
                        var487.field3496 = class79.field1318[var6];
                        class82.method591(var487, false);
                        if (var487.field3551 == -1) {
                            class179.method1212(4, var487.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1109) {
                        var6 -= 6;
                        var487.field3502 = class79.field1318[var6];
                        var487.field3509 = class79.field1318[var6 + 1];
                        var487.field3614 = class79.field1318[var6 + 2];
                        var487.field3618 = class79.field1318[var6 + 3];
                        var487.field3585 = class79.field1318[var6 + 4];
                        var487.field3500 = class79.field1318[var6 + 5];
                        class82.method591(var487, false);
                        if (var487.field3551 == -1) {
                            class49.method366(arg1 + 5228, var487.field3480);
                            class2.method4(var487.field3480, 10);
                        }
                        continue;
                    }
                    if (var517 == 1110) {
                        var6--;
                        int var488 = class79.field1318[var6];
                        if (var487.field3504 != var488) {
                            var487.field3504 = var488;
                            var487.field3538 = 1;
                            var487.field3580 = 0;
                            var487.field3598 = 0;
                            class82.method591(var487, false);
                        }
                        if (var487.field3551 == -1) {
                            class286.method1917(var487.field3480, -1);
                        }
                        continue;
                    }
                    if (var517 == 1111) {
                        var6--;
                        var487.field3593 = class79.field1318[var6] == 1;
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1112) {
                        var7--;
                        String var489 = class90.field1577[var7];
                        if (!var489.equals(var487.field3643)) {
                            var487.field3643 = var489;
                            class82.method591(var487, false);
                        }
                        if (var487.field3551 == -1) {
                            class40.method294(24685, var487.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1113) {
                        var6--;
                        var487.field3610 = class79.field1318[var6];
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1114) {
                        var6 -= 3;
                        var487.field3621 = class79.field1318[var6];
                        var487.field3521 = class79.field1318[var6 + 1];
                        var487.field3608 = class79.field1318[var6 + 2];
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1115) {
                        var6--;
                        var487.field3470 = class79.field1318[var6] == 1;
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1116) {
                        var6--;
                        var487.field3531 = class79.field1318[var6];
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1117) {
                        var6--;
                        var487.field3530 = class79.field1318[var6];
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1118) {
                        var6--;
                        var487.field3505 = class79.field1318[var6] == 1;
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1119) {
                        var6--;
                        var487.field3572 = class79.field1318[var6] == 1;
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1120) {
                        var6 -= 2;
                        var487.field3522 = class79.field1318[var6];
                        var487.field3513 = class79.field1318[var6 + 1];
                        class82.method591(var487, false);
                        if (var487.field3477 == 0) {
                            class258.method1753(var487, -15085, false);
                        }
                        continue;
                    }
                    if (var517 == 1121) {
                        var6 -= 2;
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1122) {
                        var6--;
                        var487.field3465 = class79.field1318[var6] == 1;
                        class82.method591(var487, false);
                        continue;
                    }
                    if (var517 == 1123) {
                        var6--;
                        var487.field3500 = class79.field1318[var6];
                        class82.method591(var487, false);
                        if (var487.field3551 == -1) {
                            class49.method366(arg1 ^ 0xFFFFEC6E, var487.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1124) {
                        var6--;
                        int var490 = class79.field1318[var6];
                        var487.field3539 = var490 == 1;
                        class82.method591(var487, false);
                        continue;
                    }
                } else if (!(var517 < 1200 || var517 >= 1300) || !(var517 < 2200 || var517 >= 2300)) {
                    class228 var54;
                    if (var517 < 2000) {
                        var54 = var46 ? class24.field326 : class190.field2942;
                    } else {
                        var6--;
                        var54 = class84.method596((byte) 35, class79.field1318[var6]);
                        var517 -= 1000;
                    }
                    class82.method591(var54, false);
                    if (var517 == 1200 || var517 == 1205 || var517 == 1208 || var517 == 1209) {
                        var6 -= 2;
                        int var55 = class79.field1318[var6 + 1];
                        int var56 = class79.field1318[var6];
                        if (var54.field3551 == -1) {
                            class217.method1457((byte) -103, var54.field3480);
                            class49.method366(120, var54.field3480);
                            class2.method4(var54.field3480, 10);
                        }
                        if (var56 == -1) {
                            var54.field3496 = -1;
                            var54.field3515 = 1;
                            var54.field3481 = -1;
                            continue;
                        }
                        var54.field3481 = var56;
                        if (var517 == 1208 || var517 == 1209) {
                            var54.field3644 = true;
                        } else {
                            var54.field3644 = false;
                        }
                        var54.field3596 = var55;
                        class72 var57 = class85.method602(false, var56);
                        var54.field3618 = var57.field1165;
                        var54.field3502 = var57.field1204;
                        if (var517 == 1205) {
                            var54.field3638 = false;
                        } else {
                            var54.field3638 = true;
                        }
                        var54.field3585 = var57.field1174;
                        var54.field3500 = var57.field1153;
                        var54.field3509 = var57.field1210;
                        if (var54.field3482 > 0) {
                            var54.field3500 = var54.field3500 * 32 / var54.field3482;
                        } else if (var54.field3464 > 0) {
                            var54.field3500 = var54.field3500 * 32 / var54.field3464;
                        }
                        var54.field3614 = var57.field1206;
                        continue;
                    }
                    if (var517 == 1201) {
                        var54.field3515 = 2;
                        var6--;
                        var54.field3496 = class79.field1318[var6];
                        if (var54.field3551 == -1) {
                            class179.method1212(4, var54.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1202) {
                        var54.field3515 = 3;
                        var54.field3496 = class283.field4473.field3800.method357(65535);
                        if (var54.field3551 == -1) {
                            class179.method1212(4, var54.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1203) {
                        var54.field3515 = 6;
                        var6--;
                        var54.field3496 = class79.field1318[var6];
                        if (var54.field3551 == -1) {
                            class179.method1212(4, var54.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1204) {
                        var54.field3515 = 5;
                        var6--;
                        var54.field3496 = class79.field1318[var6];
                        if (var54.field3551 == -1) {
                            class179.method1212(4, var54.field3480);
                        }
                        continue;
                    }
                    if (var517 == 1206) {
                        var6 -= 4;
                        var54.field3615 = class79.field1318[var6];
                        var54.field3584 = class79.field1318[var6 + 1];
                        var54.field3569 = class79.field1318[var6 + 2];
                        var54.field3637 = class79.field1318[var6 + 3];
                        class82.method591(var54, false);
                        continue;
                    }
                    if (var517 == 1207) {
                        var6 -= 2;
                        var54.field3487 = class79.field1318[var6];
                        var54.field3468 = class79.field1318[var6 + 1];
                        class82.method591(var54, false);
                        continue;
                    }
                } else if ((var517 < 1300 || var517 >= 1400) && (var517 < 2300 || var517 >= 2400)) {
                    if (var517 >= 1400 && var517 < 1500 || var517 >= 2400 && var517 < 2500) {
                        class228 var64;
                        if (var517 < 2000) {
                            var64 = var46 ? class24.field326 : class190.field2942;
                        } else {
                            var517 -= 1000;
                            var6--;
                            var64 = class84.method596((byte) 35, class79.field1318[var6]);
                        }
                        int[] var65 = null;
                        var7--;
                        String var66 = class90.field1577[var7];
                        if (var66.length() > 0 && var66.charAt(var66.length() - 1) == 'Y') {
                            var6--;
                            int var67 = class79.field1318[var6];
                            if (var67 > 0) {
                                var65 = new int[var67];
                                while ((var67--) > 0) {
                                    var6--;
                                    var65[var67] = class79.field1318[var6];
                                }
                            }
                            var66 = var66.substring(0, var66.length() - 1);
                        }
                        Object[] var68 = new Object[var66.length() + 1];
                        for (int var69 = var68.length - 1; var69 >= 1; var69--) {
                            if (var66.charAt(var69 - 1) == 's') {
                                var7--;
                                var68[var69] = class90.field1577[var7];
                            } else {
                                var6--;
                                var68[var69] = Integer.valueOf(class79.field1318[var6]);
                            }
                        }
                        var6--;
                        int var70 = class79.field1318[var6];
                        if (var70 == -1) {
                            var68 = null;
                        } else {
                            var68[0] = Integer.valueOf(var70);
                        }
                        var64.field3588 = true;
                        if (var517 == 1400) {
                            var64.field3490 = var68;
                        } else if (var517 == 1401) {
                            var64.field3478 = var68;
                        } else if (var517 == 1402) {
                            var64.field3514 = var68;
                        } else if (var517 == 1403) {
                            var64.field3558 = var68;
                        } else if (var517 == 1404) {
                            var64.field3473 = var68;
                        } else if (var517 == 1405) {
                            var64.field3645 = var68;
                        } else if (var517 == 1406) {
                            var64.field3612 = var68;
                        } else if (var517 == 1407) {
                            var64.field3640 = var65;
                            var64.field3559 = var68;
                        } else if (var517 == 1408) {
                            var64.field3619 = var68;
                        } else if (var517 == 1409) {
                            var64.field3536 = var68;
                        } else if (var517 == 1410) {
                            var64.field3529 = var68;
                        } else if (var517 == 1411) {
                            var64.field3518 = var68;
                        } else if (var517 == 1412) {
                            var64.field3583 = var68;
                        } else if (var517 == 1414) {
                            var64.field3554 = var68;
                            var64.field3556 = var65;
                        } else if (var517 == 1415) {
                            var64.field3597 = var65;
                            var64.field3582 = var68;
                        } else if (var517 == 1416) {
                            var64.field3562 = var68;
                        } else if (var517 == 1417) {
                            var64.field3566 = var68;
                        } else if (var517 == 1418) {
                            var64.field3561 = var68;
                        } else if (var517 == 1419) {
                            var64.field3503 = var68;
                        } else if (var517 == 1420) {
                            var64.field3525 = var68;
                        } else if (var517 == 1421) {
                            var64.field3512 = var68;
                        } else if (var517 == 1422) {
                            var64.field3599 = var68;
                        } else if (var517 == 1423) {
                            var64.field3573 = var68;
                        } else if (var517 == 1424) {
                            var64.field3526 = var68;
                        } else if (var517 == 1425) {
                            var64.field3474 = var68;
                        } else if (var517 == 1426) {
                            var64.field3535 = var68;
                        } else if (var517 == 1427) {
                            var64.field3489 = var68;
                        } else if (var517 == 1428) {
                            var64.field3630 = var65;
                            var64.field3563 = var68;
                        } else if (var517 == 1429) {
                            var64.field3534 = var65;
                            var64.field3587 = var68;
                        }
                        continue;
                    }
                    if (var517 < 1600) {
                        class228 var486 = var46 ? class24.field326 : class190.field2942;
                        if (var517 == 1500) {
                            class79.field1318[var6++] = var486.field3577;
                            continue;
                        }
                        if (var517 == 1501) {
                            class79.field1318[var6++] = var486.field3532;
                            continue;
                        }
                        if (var517 == 1502) {
                            class79.field1318[var6++] = var486.field3574;
                            continue;
                        }
                        if (var517 == 1503) {
                            class79.field1318[var6++] = var486.field3625;
                            continue;
                        }
                        if (var517 == 1504) {
                            class79.field1318[var6++] = var486.field3622 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 1505) {
                            class79.field1318[var6++] = var486.field3467;
                            continue;
                        }
                    } else if (var517 < 1700) {
                        class228 var485 = var46 ? class24.field326 : class190.field2942;
                        if (var517 == 1600) {
                            class79.field1318[var6++] = var485.field3606;
                            continue;
                        }
                        if (var517 == 1601) {
                            class79.field1318[var6++] = var485.field3523;
                            continue;
                        }
                        if (var517 == 1602) {
                            class90.field1577[var7++] = var485.field3643;
                            continue;
                        }
                        if (var517 == 1603) {
                            class79.field1318[var6++] = var485.field3522;
                            continue;
                        }
                        if (var517 == 1604) {
                            class79.field1318[var6++] = var485.field3513;
                            continue;
                        }
                        if (var517 == 1605) {
                            class79.field1318[var6++] = var485.field3500;
                            continue;
                        }
                        if (var517 == 1606) {
                            class79.field1318[var6++] = var485.field3614;
                            continue;
                        }
                        if (var517 == 1607) {
                            class79.field1318[var6++] = var485.field3585;
                            continue;
                        }
                        if (var517 == 1608) {
                            class79.field1318[var6++] = var485.field3618;
                            continue;
                        }
                        if (var517 == 1609) {
                            class79.field1318[var6++] = var485.field3570;
                            continue;
                        }
                        if (var517 == 1610) {
                            class79.field1318[var6++] = var485.field3502;
                            continue;
                        }
                        if (var517 == 1611) {
                            class79.field1318[var6++] = var485.field3509;
                            continue;
                        }
                        if (var517 == 1612) {
                            class79.field1318[var6++] = var485.field3507;
                            continue;
                        }
                    } else if (var517 < 1800) {
                        class228 var484 = var46 ? class24.field326 : class190.field2942;
                        if (var517 == 1700) {
                            class79.field1318[var6++] = var484.field3481;
                            continue;
                        }
                        if (var517 == 1701) {
                            if (var484.field3481 == -1) {
                                class79.field1318[var6++] = 0;
                            } else {
                                class79.field1318[var6++] = var484.field3596;
                            }
                            continue;
                        }
                        if (var517 == 1702) {
                            class79.field1318[var6++] = var484.field3551;
                            continue;
                        }
                    } else if (var517 < 1900) {
                        class228 var71 = var46 ? class24.field326 : class190.field2942;
                        if (var517 == 1800) {
                            class79.field1318[var6++] = client.method1059(var71).method1828(-111);
                            continue;
                        }
                        if (var517 == 1801) {
                            var6--;
                            int var72 = class79.field1318[var6];
                            int var518 = var72 - 1;
                            if (var71.field3576 != null && var518 < var71.field3576.length && var71.field3576[var518] != null) {
                                class90.field1577[var7++] = var71.field3576[var518];
                                continue;
                            }
                            class90.field1577[var7++] = "";
                            continue;
                        }
                        if (var517 == 1802) {
                            if (var71.field3592 == null) {
                                class90.field1577[var7++] = "";
                            } else {
                                class90.field1577[var7++] = var71.field3592;
                            }
                            continue;
                        }
                    } else if (var517 < 2600) {
                        var6--;
                        class228 var73 = class84.method596((byte) 35, class79.field1318[var6]);
                        if (var517 == 2500) {
                            class79.field1318[var6++] = var73.field3577;
                            continue;
                        }
                        if (var517 == 2501) {
                            class79.field1318[var6++] = var73.field3532;
                            continue;
                        }
                        if (var517 == 2502) {
                            class79.field1318[var6++] = var73.field3574;
                            continue;
                        }
                        if (var517 == 2503) {
                            class79.field1318[var6++] = var73.field3625;
                            continue;
                        }
                        if (var517 == 2504) {
                            class79.field1318[var6++] = var73.field3622 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 2505) {
                            class79.field1318[var6++] = var73.field3467;
                            continue;
                        }
                    } else if (var517 < 2700) {
                        var6--;
                        class228 var74 = class84.method596((byte) 35, class79.field1318[var6]);
                        if (var517 == 2600) {
                            class79.field1318[var6++] = var74.field3606;
                            continue;
                        }
                        if (var517 == 2601) {
                            class79.field1318[var6++] = var74.field3523;
                            continue;
                        }
                        if (var517 == 2602) {
                            class90.field1577[var7++] = var74.field3643;
                            continue;
                        }
                        if (var517 == 2603) {
                            class79.field1318[var6++] = var74.field3522;
                            continue;
                        }
                        if (var517 == 2604) {
                            class79.field1318[var6++] = var74.field3513;
                            continue;
                        }
                        if (var517 == 2605) {
                            class79.field1318[var6++] = var74.field3500;
                            continue;
                        }
                        if (var517 == 2606) {
                            class79.field1318[var6++] = var74.field3614;
                            continue;
                        }
                        if (var517 == 2607) {
                            class79.field1318[var6++] = var74.field3585;
                            continue;
                        }
                        if (var517 == 2608) {
                            class79.field1318[var6++] = var74.field3618;
                            continue;
                        }
                        if (var517 == 2609) {
                            class79.field1318[var6++] = var74.field3570;
                            continue;
                        }
                        if (var517 == 2610) {
                            class79.field1318[var6++] = var74.field3502;
                            continue;
                        }
                        if (var517 == 2611) {
                            class79.field1318[var6++] = var74.field3509;
                            continue;
                        }
                        if (var517 == 2612) {
                            class79.field1318[var6++] = var74.field3507;
                            continue;
                        }
                    } else if (var517 < 2800) {
                        if (var517 == 2700) {
                            var6--;
                            class228 var75 = class84.method596((byte) 35, class79.field1318[var6]);
                            class79.field1318[var6++] = var75.field3481;
                            continue;
                        }
                        if (var517 == 2701) {
                            var6--;
                            class228 var76 = class84.method596((byte) 35, class79.field1318[var6]);
                            if (var76.field3481 == -1) {
                                class79.field1318[var6++] = 0;
                            } else {
                                class79.field1318[var6++] = var76.field3596;
                            }
                            continue;
                        }
                        if (var517 == 2702) {
                            var6--;
                            int var77 = class79.field1318[var6];
                            class251 var78 = (class251) class127.field2007.method285((long) var77, 13821);
                            if (var78 == null) {
                                class79.field1318[var6++] = 0;
                            } else {
                                class79.field1318[var6++] = 1;
                            }
                            continue;
                        }
                        if (var517 == 2703) {
                            var6--;
                            class228 var79 = class84.method596((byte) 35, class79.field1318[var6]);
                            if (var79.field3498 == null) {
                                class79.field1318[var6++] = 0;
                                continue;
                            }
                            int var80 = var79.field3498.length;
                            for (int var81 = 0; var81 < var79.field3498.length; var81++) {
                                if (var79.field3498[var81] == null) {
                                    var80 = var81;
                                    break;
                                }
                            }
                            class79.field1318[var6++] = var80;
                            continue;
                        }
                        if (var517 == 2704 || var517 == 2705) {
                            var6 -= 2;
                            int var82 = class79.field1318[var6 + 1];
                            int var83 = class79.field1318[var6];
                            class251 var84 = (class251) class127.field2007.method285((long) var83, 13821);
                            if (var84 != null && var84.field4041 == var82) {
                                class79.field1318[var6++] = 1;
                                continue;
                            }
                            class79.field1318[var6++] = 0;
                            continue;
                        }
                    } else if (var517 < 2900) {
                        var6--;
                        class228 var85 = class84.method596((byte) 35, class79.field1318[var6]);
                        if (var517 == 2800) {
                            class79.field1318[var6++] = client.method1059(var85).method1828(-105);
                            continue;
                        }
                        if (var517 == 2801) {
                            var6--;
                            int var86 = class79.field1318[var6];
                            int var519 = var86 - 1;
                            if (var85.field3576 != null && var85.field3576.length > var519 && var85.field3576[var519] != null) {
                                class90.field1577[var7++] = var85.field3576[var519];
                                continue;
                            }
                            class90.field1577[var7++] = "";
                            continue;
                        }
                        if (var517 == 2802) {
                            if (var85.field3592 == null) {
                                class90.field1577[var7++] = "";
                            } else {
                                class90.field1577[var7++] = var85.field3592;
                            }
                            continue;
                        }
                    } else if (var517 < 3200) {
                        if (var517 == 3100) {
                            var7--;
                            String var469 = class90.field1577[var7];
                            class81.method579(arg1 ^ 0x13EE, "", 0, var469);
                            continue;
                        }
                        if (var517 == 3101) {
                            var6 -= 2;
                            class209.method1403(class79.field1318[var6], class79.field1318[var6 + 1], class283.field4473, -2);
                            continue;
                        }
                        if (var517 == 3103) {
                            class75.method534(21812);
                            continue;
                        }
                        if (var517 == 3104) {
                            class113.field1848++;
                            var7--;
                            String var470 = class90.field1577[var7];
                            int var471 = 0;
                            if (class7.method65(var470, -52)) {
                                var471 = class57.method438(var470, 47);
                            }
                            client.field2435.method536((byte) -104, 175);
                            client.field2435.method639(var471, (byte) -97);
                            continue;
                        }
                        if (var517 == 3105) {
                            class131.field2064++;
                            var7--;
                            String var472 = class90.field1577[var7];
                            client.field2435.method536((byte) -104, 250);
                            client.field2435.method638(class148.method1000(var472, 934), false);
                            continue;
                        }
                        if (var517 == 3106) {
                            var7--;
                            String var473 = class90.field1577[var7];
                            client.field2435.method536((byte) -104, 120);
                            class115.field1870++;
                            client.field2435.method654((byte) -100, var473.length() + 1);
                            client.field2435.method680(var473, (byte) 101);
                            continue;
                        }
                        if (var517 == 3107) {
                            var7--;
                            String var474 = class90.field1577[var7];
                            var6--;
                            int var475 = class79.field1318[var6];
                            class65.method480(var474, var475, -1);
                            continue;
                        }
                        if (var517 == 3108) {
                            var6 -= 3;
                            int var476 = class79.field1318[var6 + 1];
                            int var477 = class79.field1318[var6];
                            int var478 = class79.field1318[var6 + 2];
                            class228 var479 = class84.method596((byte) 35, var478);
                            class237.method1631(var479, var476, (byte) 117, var477);
                            continue;
                        }
                        if (var517 == 3109) {
                            var6 -= 2;
                            int var480 = class79.field1318[var6 + 1];
                            class228 var481 = var46 ? class24.field326 : class190.field2942;
                            int var482 = class79.field1318[var6];
                            class237.method1631(var481, var480, (byte) 74, var482);
                            continue;
                        }
                        if (var517 == 3110) {
                            var6--;
                            int var483 = class79.field1318[var6];
                            class84.field1412++;
                            client.field2435.method536((byte) -104, 38);
                            client.field2435.method634(var483, 28);
                            continue;
                        }
                    } else if (var517 < 3300) {
                        if (var517 == 3200) {
                            var6 -= 3;
                            class49.method365((byte) -46, class79.field1318[var6 + 2], 255, class79.field1318[var6 + 1], class79.field1318[var6]);
                            continue;
                        }
                        if (var517 == 3201) {
                            var6--;
                            class260.method1762(class79.field1318[var6], (byte) -45, 255);
                            continue;
                        }
                        if (var517 == 3202) {
                            var6 -= 2;
                            class218.method1463(1469421928, 255, class79.field1318[var6], class79.field1318[var6 + 1]);
                            continue;
                        }
                    } else if (var517 < 3400) {
                        if (var517 == 3300) {
                            class79.field1318[var6++] = class192.field2978;
                            continue;
                        }
                        if (var517 == 3301) {
                            var6 -= 2;
                            int var435 = class79.field1318[var6];
                            int var436 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class219.method1469(var435, var436, (byte) 124);
                            continue;
                        }
                        if (var517 == 3302) {
                            var6 -= 2;
                            int var437 = class79.field1318[var6];
                            int var438 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class161.method1100(62, var437, var438);
                            continue;
                        }
                        if (var517 == 3303) {
                            var6 -= 2;
                            int var439 = class79.field1318[var6];
                            int var440 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class16.method160(var439, 3339, var440);
                            continue;
                        }
                        if (var517 == 3304) {
                            var6--;
                            int var441 = class79.field1318[var6];
                            class79.field1318[var6++] = class146.method989(var441, -80).field1837;
                            continue;
                        }
                        if (var517 == 3305) {
                            var6--;
                            int var442 = class79.field1318[var6];
                            class79.field1318[var6++] = class11.field194[var442];
                            continue;
                        }
                        if (var517 == 3306) {
                            var6--;
                            int var443 = class79.field1318[var6];
                            class79.field1318[var6++] = class28.field382[var443];
                            continue;
                        }
                        if (var517 == 3307) {
                            var6--;
                            int var444 = class79.field1318[var6];
                            class79.field1318[var6++] = class166.field2595[var444];
                            continue;
                        }
                        if (var517 == 3308) {
                            int var445 = class240.field3892;
                            int var446 = (class283.field4473.field2278 >> 7) + class260.field4162;
                            int var447 = (class283.field4473.field2240 >> 7) + class46.field656;
                            class79.field1318[var6++] = (var445 << 28) + var446 + (var447 << 14);
                            continue;
                        }
                        if (var517 == 3309) {
                            var6--;
                            int var448 = class79.field1318[var6];
                            class79.field1318[var6++] = class55.method420(var448 >> 14, 16383);
                            continue;
                        }
                        if (var517 == 3310) {
                            var6--;
                            int var449 = class79.field1318[var6];
                            class79.field1318[var6++] = var449 >> 28;
                            continue;
                        }
                        if (var517 == 3311) {
                            var6--;
                            int var450 = class79.field1318[var6];
                            class79.field1318[var6++] = class55.method420(16383, var450);
                            continue;
                        }
                        if (var517 == 3312) {
                            class79.field1318[var6++] = class43.field616 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3313) {
                            var6 -= 2;
                            int var451 = class79.field1318[var6] + 32768;
                            int var452 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class219.method1469(var451, var452, (byte) 16);
                            continue;
                        }
                        if (var517 == 3314) {
                            var6 -= 2;
                            int var453 = class79.field1318[var6] + 32768;
                            int var454 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class161.method1100(-67, var453, var454);
                            continue;
                        }
                        if (var517 == 3315) {
                            var6 -= 2;
                            int var455 = class79.field1318[var6] + 32768;
                            int var456 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class16.method160(var455, arg1 + 8442, var456);
                            continue;
                        }
                        if (var517 == 3316) {
                            if (class140.field2141 >= 2) {
                                class79.field1318[var6++] = class140.field2141;
                            } else {
                                class79.field1318[var6++] = 0;
                            }
                            continue;
                        }
                        if (var517 == 3317) {
                            class79.field1318[var6++] = class133.field2086;
                            continue;
                        }
                        if (var517 == 3318) {
                            class79.field1318[var6++] = class152.field2385;
                            continue;
                        }
                        if (var517 == 3321) {
                            class79.field1318[var6++] = class180.field2800;
                            continue;
                        }
                        if (var517 == 3322) {
                            class79.field1318[var6++] = class102.field1705;
                            continue;
                        }
                        if (var517 == 3323) {
                            if (class261.field4166 >= 5 && class261.field4166 <= 9) {
                                class79.field1318[var6++] = 1;
                                continue;
                            }
                            class79.field1318[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3324) {
                            if (class261.field4166 >= 5 && class261.field4166 <= 9) {
                                class79.field1318[var6++] = class261.field4166;
                                continue;
                            }
                            class79.field1318[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3325) {
                            class79.field1318[var6++] = class83.field1398 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3326) {
                            class79.field1318[var6++] = class283.field4473.field3821;
                            continue;
                        }
                        if (var517 == 3327) {
                            class79.field1318[var6++] = class283.field4473.field3800.field720 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3328) {
                            class79.field1318[var6++] = class230.field3658 && !class115.field1878 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3329) {
                            class79.field1318[var6++] = class179.field2794 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3330) {
                            var6--;
                            int var457 = class79.field1318[var6];
                            class79.field1318[var6++] = class277.method1869(var457, -115);
                            continue;
                        }
                        if (var517 == 3331) {
                            var6 -= 2;
                            int var458 = class79.field1318[var6];
                            int var459 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class49.method371(var459, 42, var458, false);
                            continue;
                        }
                        if (var517 == 3332) {
                            var6 -= 2;
                            int var460 = class79.field1318[var6];
                            int var461 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class49.method371(var461, 78, var460, true);
                            continue;
                        }
                        if (var517 == 3333) {
                            class79.field1318[var6++] = class71.field1137;
                            continue;
                        }
                        if (var517 == 3335) {
                            class79.field1318[var6++] = class177.field2770;
                            continue;
                        }
                        if (var517 == 3336) {
                            var6 -= 4;
                            int var462 = class79.field1318[var6];
                            int var463 = class79.field1318[var6 + 2];
                            int var464 = class79.field1318[var6 + 1];
                            int var465 = (var464 << 14) + var462;
                            int var466 = class79.field1318[var6 + 3];
                            int var467 = (var463 << 28) + var465;
                            int var468 = var466 + var467;
                            class79.field1318[var6++] = var468;
                            continue;
                        }
                        if (var517 == 3337) {
                            class79.field1318[var6++] = class232.field3696;
                            continue;
                        }
                    } else if (var517 < 3500) {
                        if (var517 == 3400) {
                            var6 -= 2;
                            int var418 = class79.field1318[var6 + 1];
                            int var419 = class79.field1318[var6];
                            class173 var420 = class42.method312(var419, -123);
                            class90.field1577[var7++] = var420.method1173(arg1 + 11249, var418);
                            continue;
                        }
                        if (var517 == 3408) {
                            var6 -= 4;
                            int var421 = class79.field1318[var6 + 1];
                            int var422 = class79.field1318[var6];
                            int var423 = class79.field1318[var6 + 2];
                            int var424 = class79.field1318[var6 + 3];
                            class173 var425 = class42.method312(var423, -123);
                            if (var425.field2721 == var422 && var425.field2733 == var421) {
                                if (var421 == 115) {
                                    class90.field1577[var7++] = var425.method1173(6146, var424);
                                } else {
                                    class79.field1318[var6++] = var425.method1175(var424, arg1 + 21107);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var517 == 3409) {
                            var6 -= 3;
                            int var426 = class79.field1318[var6 + 1];
                            int var427 = class79.field1318[var6];
                            int var428 = class79.field1318[var6 + 2];
                            if (var426 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class173 var429 = class42.method312(var426, -123);
                            if (var429.field2733 != var427) {
                                throw new RuntimeException("C3409-1");
                            }
                            class79.field1318[var6++] = var429.method1174(var428, (byte) 66) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3410) {
                            var6--;
                            int var430 = class79.field1318[var6];
                            var7--;
                            String var431 = class90.field1577[var7];
                            if (var430 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class173 var432 = class42.method312(var430, arg1 + 4980);
                            if (var432.field2733 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class79.field1318[var6++] = var432.method1170(false, var431) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3411) {
                            var6--;
                            int var433 = class79.field1318[var6];
                            class173 var434 = class42.method312(var433, -123);
                            class79.field1318[var6++] = var434.field2722.method280(true);
                            continue;
                        }
                    } else if (var517 < 3700) {
                        if (var517 == 3600) {
                            if (class206.field3209 == 0) {
                                class79.field1318[var6++] = -2;
                            } else if (class206.field3209 == 1) {
                                class79.field1318[var6++] = -1;
                            } else {
                                class79.field1318[var6++] = class166.field2604;
                            }
                            continue;
                        }
                        if (var517 == 3601) {
                            var6--;
                            int var87 = class79.field1318[var6];
                            if (class206.field3209 == 2 && var87 < class166.field2604) {
                                class90.field1577[var7++] = class129.field2024[var87];
                                continue;
                            }
                            class90.field1577[var7++] = "";
                            continue;
                        }
                        if (var517 == 3602) {
                            var6--;
                            int var88 = class79.field1318[var6];
                            if (class206.field3209 == 2 && class166.field2604 > var88) {
                                class79.field1318[var6++] = class295.field4659[var88];
                                continue;
                            }
                            class79.field1318[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3603) {
                            var6--;
                            int var89 = class79.field1318[var6];
                            if (class206.field3209 == 2 && class166.field2604 > var89) {
                                class79.field1318[var6++] = class152.field2386[var89];
                                continue;
                            }
                            class79.field1318[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3604) {
                            var7--;
                            String var90 = class90.field1577[var7];
                            var6--;
                            int var91 = class79.field1318[var6];
                            class197.method1341(var91, arg1 + 5181, var90);
                            continue;
                        }
                        if (var517 == 3605) {
                            var7--;
                            String var92 = class90.field1577[var7];
                            class238.method1633((byte) -32, class148.method1000(var92, 934));
                            continue;
                        }
                        if (var517 == 3606) {
                            var7--;
                            String var93 = class90.field1577[var7];
                            class27.method217(-15354, class148.method1000(var93, 934));
                            continue;
                        }
                        if (var517 == 3607) {
                            var7--;
                            String var94 = class90.field1577[var7];
                            class269.method1817(class148.method1000(var94, 934), false, false);
                            continue;
                        }
                        if (var517 == 3608) {
                            var7--;
                            String var95 = class90.field1577[var7];
                            class128.method886((byte) 35, class148.method1000(var95, 934));
                            continue;
                        }
                        if (var517 == 3609) {
                            var7--;
                            String var96 = class90.field1577[var7];
                            if (var96.startsWith("<img=0>") || var96.startsWith("<img=1>")) {
                                var96 = var96.substring(7);
                            }
                            class79.field1318[var6++] = class93.method707(var96, (byte) -95) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3610) {
                            var6--;
                            int var97 = class79.field1318[var6];
                            if (class206.field3209 == 2 && class166.field2604 > var97) {
                                class90.field1577[var7++] = class272.field4363[var97];
                                continue;
                            }
                            class90.field1577[var7++] = "";
                            continue;
                        }
                        if (var517 == 3611) {
                            if (class139.field2126 == null) {
                                class90.field1577[var7++] = "";
                            } else {
                                class90.field1577[var7++] = class181.method1232(115, class139.field2126);
                            }
                            continue;
                        }
                        if (var517 == 3612) {
                            if (class139.field2126 == null) {
                                class79.field1318[var6++] = 0;
                            } else {
                                class79.field1318[var6++] = class139.field2119;
                            }
                            continue;
                        }
                        if (var517 == 3613) {
                            var6--;
                            int var98 = class79.field1318[var6];
                            if (class139.field2126 != null && var98 < class139.field2119) {
                                class90.field1577[var7++] = class181.method1232(98, class83.field1401[var98].field4104);
                                continue;
                            }
                            class90.field1577[var7++] = "";
                            continue;
                        }
                        if (var517 == 3614) {
                            var6--;
                            int var99 = class79.field1318[var6];
                            if (class139.field2126 != null && class139.field2119 > var99) {
                                class79.field1318[var6++] = class83.field1401[var99].field4100;
                                continue;
                            }
                            class79.field1318[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3615) {
                            var6--;
                            int var100 = class79.field1318[var6];
                            if (class139.field2126 != null && var100 < class139.field2119) {
                                class79.field1318[var6++] = class83.field1401[var100].field4097;
                                continue;
                            }
                            class79.field1318[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3616) {
                            class79.field1318[var6++] = class102.field1703;
                            continue;
                        }
                        if (var517 == 3617) {
                            var7--;
                            String var101 = class90.field1577[var7];
                            class280.method1882(-13554, var101);
                            continue;
                        }
                        if (var517 == 3618) {
                            class79.field1318[var6++] = class105.field1752;
                            continue;
                        }
                        if (var517 == 3619) {
                            var7--;
                            String var102 = class90.field1577[var7];
                            class53.method392(true, class148.method1000(var102, 934));
                            continue;
                        }
                        if (var517 == 3620) {
                            class131.method913(-92);
                            continue;
                        }
                        if (var517 == 3621) {
                            if (class206.field3209 == 0) {
                                class79.field1318[var6++] = -1;
                            } else {
                                class79.field1318[var6++] = class268.field4284;
                            }
                            continue;
                        }
                        if (var517 == 3622) {
                            var6--;
                            int var103 = class79.field1318[var6];
                            if (class206.field3209 != 0 && class268.field4284 > var103) {
                                class90.field1577[var7++] = class28.method222(class87.method619(arg1, 4881), class106.field1766[var103]);
                                continue;
                            }
                            class90.field1577[var7++] = "";
                            continue;
                        }
                        if (var517 == 3623) {
                            var7--;
                            String var104 = class90.field1577[var7];
                            if (var104.startsWith("<img=0>") || var104.startsWith("<img=1>")) {
                                var104 = var104.substring(7);
                            }
                            class79.field1318[var6++] = class182.method1237(var104, false) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3624) {
                            var6--;
                            int var105 = class79.field1318[var6];
                            if (class83.field1401 != null && class139.field2119 > var105 && class83.field1401[var105].field4104.equalsIgnoreCase(class283.field4473.field3803)) {
                                class79.field1318[var6++] = 1;
                                continue;
                            }
                            class79.field1318[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3625) {
                            if (class264.field4192 == null) {
                                class90.field1577[var7++] = "";
                            } else {
                                class90.field1577[var7++] = class181.method1232(83, class264.field4192);
                            }
                            continue;
                        }
                        if (var517 == 3626) {
                            var6--;
                            int var106 = class79.field1318[var6];
                            if (class139.field2126 != null && var106 < class139.field2119) {
                                class90.field1577[var7++] = class83.field1401[var106].field4102;
                                continue;
                            }
                            class90.field1577[var7++] = "";
                            continue;
                        }
                        if (var517 == 3627) {
                            var6--;
                            int var107 = class79.field1318[var6];
                            if (class206.field3209 == 2 && var107 >= 0 && var107 < class166.field2604) {
                                class79.field1318[var6++] = class52.field786[var107] ? 1 : 0;
                                continue;
                            }
                            class79.field1318[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3628) {
                            var7--;
                            String var108 = class90.field1577[var7];
                            if (var108.startsWith("<img=0>") || var108.startsWith("<img=1>")) {
                                var108 = var108.substring(7);
                            }
                            class79.field1318[var6++] = class192.method1289(-20473, var108);
                            continue;
                        }
                        if (var517 == 3629) {
                            class79.field1318[var6++] = class138.field2113;
                            continue;
                        }
                        if (var517 == 3630) {
                            var7--;
                            String var109 = class90.field1577[var7];
                            class269.method1817(class148.method1000(var109, 934), false, true);
                            continue;
                        }
                        if (var517 == 3631) {
                            var6--;
                            int var110 = class79.field1318[var6];
                            class79.field1318[var6++] = class138.field2117[var110] ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4000) {
                        if (var517 == 3903) {
                            var6--;
                            int var404 = class79.field1318[var6];
                            class79.field1318[var6++] = class33.field495[var404].method999((byte) -44);
                            continue;
                        }
                        if (var517 == 3904) {
                            var6--;
                            int var405 = class79.field1318[var6];
                            class79.field1318[var6++] = class33.field495[var405].field2344;
                            continue;
                        }
                        if (var517 == 3905) {
                            var6--;
                            int var406 = class79.field1318[var6];
                            class79.field1318[var6++] = class33.field495[var406].field2336;
                            continue;
                        }
                        if (var517 == 3906) {
                            var6--;
                            int var407 = class79.field1318[var6];
                            class79.field1318[var6++] = class33.field495[var407].field2337;
                            continue;
                        }
                        if (var517 == 3907) {
                            var6--;
                            int var408 = class79.field1318[var6];
                            class79.field1318[var6++] = class33.field495[var408].field2345;
                            continue;
                        }
                        if (var517 == 3908) {
                            var6--;
                            int var409 = class79.field1318[var6];
                            class79.field1318[var6++] = class33.field495[var409].field2349;
                            continue;
                        }
                        if (var517 == 3910) {
                            var6--;
                            int var410 = class79.field1318[var6];
                            int var411 = class33.field495[var410].method998((byte) 127);
                            class79.field1318[var6++] = var411 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3911) {
                            var6--;
                            int var412 = class79.field1318[var6];
                            int var413 = class33.field495[var412].method998((byte) 126);
                            class79.field1318[var6++] = var413 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3912) {
                            var6--;
                            int var414 = class79.field1318[var6];
                            int var415 = class33.field495[var414].method998((byte) 120);
                            class79.field1318[var6++] = var415 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3913) {
                            var6--;
                            int var416 = class79.field1318[var6];
                            int var417 = class33.field495[var416].method998((byte) 123);
                            class79.field1318[var6++] = var417 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4100) {
                        if (var517 == 4000) {
                            var6 -= 2;
                            int var359 = class79.field1318[var6];
                            int var360 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = var359 + var360;
                            continue;
                        }
                        if (var517 == 4001) {
                            var6 -= 2;
                            int var361 = class79.field1318[var6 + 1];
                            int var362 = class79.field1318[var6];
                            class79.field1318[var6++] = var362 - var361;
                            continue;
                        }
                        if (var517 == 4002) {
                            var6 -= 2;
                            int var363 = class79.field1318[var6];
                            int var364 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = var363 * var364;
                            continue;
                        }
                        if (var517 == 4003) {
                            var6 -= 2;
                            int var365 = class79.field1318[var6];
                            int var366 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = var365 / var366;
                            continue;
                        }
                        if (var517 == 4004) {
                            var6--;
                            int var367 = class79.field1318[var6];
                            class79.field1318[var6++] = (int) (Math.random() * (double) var367);
                            continue;
                        }
                        if (var517 == 4005) {
                            var6--;
                            int var368 = class79.field1318[var6];
                            class79.field1318[var6++] = (int) (Math.random() * (double) (var368 + 1));
                            continue;
                        }
                        if (var517 == 4006) {
                            var6 -= 5;
                            int var369 = class79.field1318[var6 + 2];
                            int var370 = class79.field1318[var6 + 3];
                            int var371 = class79.field1318[var6 + 4];
                            int var372 = class79.field1318[var6];
                            int var373 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = (var371 - var369) * (var373 - var372) / (var370 - var369) + var372;
                            continue;
                        }
                        if (var517 == 4007) {
                            var6 -= 2;
                            long var374 = (long) class79.field1318[var6];
                            long var376 = (long) class79.field1318[var6 + 1];
                            class79.field1318[var6++] = (int) (var374 * var376 / 100L + var374);
                            continue;
                        }
                        if (var517 == 4008) {
                            var6 -= 2;
                            int var378 = class79.field1318[var6];
                            int var379 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class45.method330(0x1 << var379, var378);
                            continue;
                        }
                        if (var517 == 4009) {
                            var6 -= 2;
                            int var380 = class79.field1318[var6 + 1];
                            int var381 = class79.field1318[var6];
                            class79.field1318[var6++] = class55.method420(var381, -(0x1 << var380) - 1);
                            continue;
                        }
                        if (var517 == 4010) {
                            var6 -= 2;
                            int var382 = class79.field1318[var6];
                            int var383 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class55.method420(var382, 0x1 << var383) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var517 == 4011) {
                            var6 -= 2;
                            int var384 = class79.field1318[var6 + 1];
                            int var385 = class79.field1318[var6];
                            class79.field1318[var6++] = var385 % var384;
                            continue;
                        }
                        if (var517 == 4012) {
                            var6 -= 2;
                            int var386 = class79.field1318[var6 + 1];
                            int var387 = class79.field1318[var6];
                            if (var387 == 0) {
                                class79.field1318[var6++] = 0;
                            } else {
                                class79.field1318[var6++] = (int) Math.pow((double) var387, (double) var386);
                            }
                            continue;
                        }
                        if (var517 == 4013) {
                            var6 -= 2;
                            int var388 = class79.field1318[var6 + 1];
                            int var389 = class79.field1318[var6];
                            if (var389 == 0) {
                                class79.field1318[var6++] = 0;
                            } else if (var388 == 0) {
                                class79.field1318[var6++] = Integer.MAX_VALUE;
                            } else {
                                class79.field1318[var6++] = (int) Math.pow((double) var389, 1.0D / (double) var388);
                            }
                            continue;
                        }
                        if (var517 == 4014) {
                            var6 -= 2;
                            int var390 = class79.field1318[var6];
                            int var391 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class55.method420(var390, var391);
                            continue;
                        }
                        if (var517 == 4015) {
                            var6 -= 2;
                            int var392 = class79.field1318[var6];
                            int var393 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class45.method330(var392, var393);
                            continue;
                        }
                        if (var517 == 4016) {
                            var6 -= 2;
                            int var394 = class79.field1318[var6];
                            int var395 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = var394 < var395 ? var394 : var395;
                            continue;
                        }
                        if (var517 == 4017) {
                            var6 -= 2;
                            int var396 = class79.field1318[var6];
                            int var397 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = var397 >= var396 ? var397 : var396;
                            continue;
                        }
                        if (var517 == 4018) {
                            var6 -= 3;
                            long var398 = (long) class79.field1318[var6];
                            long var400 = (long) class79.field1318[var6 + 2];
                            long var402 = (long) class79.field1318[var6 + 1];
                            class79.field1318[var6++] = (int) (var398 * var400 / var402);
                            continue;
                        }
                    } else if (var517 < 4200) {
                        if (var517 == 4100) {
                            var7--;
                            String var111 = class90.field1577[var7];
                            var6--;
                            int var112 = class79.field1318[var6];
                            class90.field1577[var7++] = var111 + var112;
                            continue;
                        }
                        if (var517 == 4101) {
                            var7 -= 2;
                            String var113 = class90.field1577[var7 + 1];
                            String var114 = class90.field1577[var7];
                            class90.field1577[var7++] = var114 + var113;
                            continue;
                        }
                        if (var517 == 4102) {
                            var6--;
                            int var115 = class79.field1318[var6];
                            var7--;
                            String var116 = class90.field1577[var7];
                            class90.field1577[var7++] = var116 + class66.method491(71, true, var115);
                            continue;
                        }
                        if (var517 == 4103) {
                            var7--;
                            String var117 = class90.field1577[var7];
                            class90.field1577[var7++] = var117.toLowerCase();
                            continue;
                        }
                        if (var517 == 4104) {
                            var6--;
                            int var118 = class79.field1318[var6];
                            long var119 = ((long) var118 + 11745L) * 86400000L;
                            class241.field3914.setTime(new Date(var119));
                            int var121 = class241.field3914.get(5);
                            int var122 = class241.field3914.get(2);
                            int var123 = class241.field3914.get(1);
                            class90.field1577[var7++] = var121 + "-" + class50.field742[var122] + "-" + var123;
                            continue;
                        }
                        if (var517 == 4105) {
                            var7 -= 2;
                            String var124 = class90.field1577[var7 + 1];
                            String var125 = class90.field1577[var7];
                            if (class283.field4473.field3800 != null && class283.field4473.field3800.field720) {
                                class90.field1577[var7++] = var124;
                                continue;
                            }
                            class90.field1577[var7++] = var125;
                            continue;
                        }
                        if (var517 == 4106) {
                            var6--;
                            int var126 = class79.field1318[var6];
                            class90.field1577[var7++] = Integer.toString(var126);
                            continue;
                        }
                        if (var517 == 4107) {
                            var7 -= 2;
                            class79.field1318[var6++] = class82.method589(class37.method273(class87.method619(arg1, 976491069), class90.field1577[var7 + 1], class90.field1577[var7], class177.field2770), 1);
                            continue;
                        }
                        if (var517 == 4108) {
                            var6 -= 2;
                            var7--;
                            String var127 = class90.field1577[var7];
                            int var128 = class79.field1318[var6 + 1];
                            int var129 = class79.field1318[var6];
                            class79.field1318[var6++] = class73.method529((byte) -91, var128).method1665(var127, var129);
                            continue;
                        }
                        if (var517 == 4109) {
                            var6 -= 2;
                            var7--;
                            String var130 = class90.field1577[var7];
                            int var131 = class79.field1318[var6];
                            int var132 = class79.field1318[var6 + 1];
                            class79.field1318[var6++] = class73.method529((byte) -91, var132).method1656(var130, var131);
                            continue;
                        }
                        if (var517 == 4110) {
                            var7 -= 2;
                            String var133 = class90.field1577[var7];
                            String var134 = class90.field1577[var7 + 1];
                            var6--;
                            if (class79.field1318[var6] == 1) {
                                class90.field1577[var7++] = var133;
                            } else {
                                class90.field1577[var7++] = var134;
                            }
                            continue;
                        }
                        if (var517 == 4111) {
                            var7--;
                            String var135 = class90.field1577[var7];
                            class90.field1577[var7++] = class242.method1675(var135);
                            continue;
                        }
                        if (var517 == 4112) {
                            var7--;
                            String var136 = class90.field1577[var7];
                            var6--;
                            int var137 = class79.field1318[var6];
                            if (var137 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class90.field1577[var7++] = var136 + (char) var137;
                            continue;
                        }
                        if (var517 == 4113) {
                            var6--;
                            int var138 = class79.field1318[var6];
                            class79.field1318[var6++] = class28.method218(class87.method619(arg1, -6004), (char) var138) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4114) {
                            var6--;
                            int var139 = class79.field1318[var6];
                            class79.field1318[var6++] = class98.method721((char) var139, -113) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4115) {
                            var6--;
                            int var140 = class79.field1318[var6];
                            class79.field1318[var6++] = class87.method620((char) var140, (byte) 79) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4116) {
                            var6--;
                            int var141 = class79.field1318[var6];
                            class79.field1318[var6++] = class65.method482(48, (char) var141) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4117) {
                            var7--;
                            String var142 = class90.field1577[var7];
                            if (var142 == null) {
                                class79.field1318[var6++] = 0;
                            } else {
                                class79.field1318[var6++] = var142.length();
                            }
                            continue;
                        }
                        if (var517 == 4118) {
                            var7--;
                            String var143 = class90.field1577[var7];
                            var6 -= 2;
                            int var144 = class79.field1318[var6];
                            int var145 = class79.field1318[var6 + 1];
                            class90.field1577[var7++] = var143.substring(var144, var145);
                            continue;
                        }
                        if (var517 == 4119) {
                            var7--;
                            String var146 = class90.field1577[var7];
                            boolean var147 = false;
                            StringBuffer var148 = new StringBuffer(var146.length());
                            for (int var149 = 0; var149 < var146.length(); var149++) {
                                char var150 = var146.charAt(var149);
                                if (var150 == '<') {
                                    var147 = true;
                                } else if (var150 == '>') {
                                    var147 = false;
                                } else if (!var147) {
                                    var148.append(var150);
                                }
                            }
                            class90.field1577[var7++] = var148.toString();
                            continue;
                        }
                        if (var517 == 4120) {
                            var7--;
                            String var151 = class90.field1577[var7];
                            var6 -= 2;
                            int var152 = class79.field1318[var6 + 1];
                            int var153 = class79.field1318[var6];
                            class79.field1318[var6++] = var151.indexOf(var153, var152);
                            continue;
                        }
                        if (var517 == 4121) {
                            var7 -= 2;
                            String var154 = class90.field1577[var7];
                            String var155 = class90.field1577[var7 + 1];
                            var6--;
                            int var156 = class79.field1318[var6];
                            class79.field1318[var6++] = var154.indexOf(var155, var156);
                            continue;
                        }
                        if (var517 == 4122) {
                            var6--;
                            int var157 = class79.field1318[var6];
                            class79.field1318[var6++] = Character.toLowerCase((char) var157);
                            continue;
                        }
                        if (var517 == 4123) {
                            var6--;
                            int var158 = class79.field1318[var6];
                            class79.field1318[var6++] = Character.toUpperCase((char) var158);
                            continue;
                        }
                        if (var517 == 4124) {
                            var6--;
                            boolean var159 = class79.field1318[var6] != 0;
                            var6--;
                            int var160 = class79.field1318[var6];
                            class90.field1577[var7++] = class128.method887((byte) -116, class177.field2770, (long) var160, var159, 0);
                            continue;
                        }
                    } else if (var517 < 4300) {
                        if (var517 == 4200) {
                            var6--;
                            int var161 = class79.field1318[var6];
                            class90.field1577[var7++] = class85.method602(false, var161).field1176;
                            continue;
                        }
                        if (var517 == 4201) {
                            var6 -= 2;
                            int var162 = class79.field1318[var6];
                            int var163 = class79.field1318[var6 + 1];
                            class72 var164 = class85.method602(false, var162);
                            if (var163 >= 1 && var163 <= 5 && var164.field1177[var163 - 1] != null) {
                                class90.field1577[var7++] = var164.field1177[var163 - 1];
                                continue;
                            }
                            class90.field1577[var7++] = "";
                            continue;
                        }
                        if (var517 == 4202) {
                            var6 -= 2;
                            int var165 = class79.field1318[var6];
                            int var166 = class79.field1318[var6 + 1];
                            class72 var167 = class85.method602(false, var165);
                            if (var166 >= 1 && var166 <= 5 && var167.field1195[var166 - 1] != null) {
                                class90.field1577[var7++] = var167.field1195[var166 - 1];
                                continue;
                            }
                            class90.field1577[var7++] = "";
                            continue;
                        }
                        if (var517 == 4203) {
                            var6--;
                            int var168 = class79.field1318[var6];
                            class79.field1318[var6++] = class85.method602(false, var168).field1212;
                            continue;
                        }
                        if (var517 == 4204) {
                            var6--;
                            int var169 = class79.field1318[var6];
                            class79.field1318[var6++] = class85.method602(false, var169).field1201 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4205) {
                            var6--;
                            int var170 = class79.field1318[var6];
                            class72 var171 = class85.method602(false, var170);
                            if (var171.field1168 == -1 && var171.field1217 >= 0) {
                                class79.field1318[var6++] = var171.field1217;
                                continue;
                            }
                            class79.field1318[var6++] = var170;
                            continue;
                        }
                        if (var517 == 4206) {
                            var6--;
                            int var172 = class79.field1318[var6];
                            class72 var173 = class85.method602(false, var172);
                            if (var173.field1168 >= 0 && var173.field1217 >= 0) {
                                class79.field1318[var6++] = var173.field1217;
                                continue;
                            }
                            class79.field1318[var6++] = var172;
                            continue;
                        }
                        if (var517 == 4207) {
                            var6--;
                            int var174 = class79.field1318[var6];
                            class79.field1318[var6++] = class85.method602(false, var174).field1169 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4208) {
                            var6 -= 2;
                            int var175 = class79.field1318[var6];
                            int var176 = class79.field1318[var6 + 1];
                            class200 var177 = class250.method1716(var176, (byte) 61);
                            if (var177.method1356(true)) {
                                class90.field1577[var7++] = class85.method602(false, var175).method526(var177.field3133, var176, (byte) 5);
                            } else {
                                class79.field1318[var6++] = class85.method602(false, var175).method516(class87.method619(arg1, -5103), var176, var177.field3132);
                            }
                            continue;
                        }
                        if (var517 == 4210) {
                            var7--;
                            String var178 = class90.field1577[var7];
                            var6--;
                            int var179 = class79.field1318[var6];
                            class263.method1775(var178, var179 == 1, (byte) -114);
                            class79.field1318[var6++] = class39.field557;
                            continue;
                        }
                        if (var517 == 4211) {
                            if (class292.field4594 != null && class39.field557 > class148.field2339) {
                                class79.field1318[var6++] = class55.method420(65535, class292.field4594[class148.field2339++]);
                                continue;
                            }
                            class79.field1318[var6++] = -1;
                            continue;
                        }
                        if (var517 == 4212) {
                            class148.field2339 = 0;
                            continue;
                        }
                    } else if (var517 >= 4400) {
                        if (var517 < 4500) {
                            if (var517 == 4400) {
                                var6 -= 2;
                                int var180 = class79.field1318[var6];
                                int var181 = class79.field1318[var6 + 1];
                                class200 var182 = class250.method1716(var181, (byte) -53);
                                if (var182.method1356(true)) {
                                    class90.field1577[var7++] = class69.method501(0, var180).method1306(var182.field3133, 119, var181);
                                } else {
                                    class79.field1318[var6++] = class69.method501(0, var180).method1304(var182.field3132, (byte) -81, var181);
                                }
                                continue;
                            }
                        } else if (var517 >= 4600) {
                            if (var517 < 5100) {
                                if (var517 == 5000) {
                                    class79.field1318[var6++] = class102.field1711;
                                    continue;
                                }
                                if (var517 == 5001) {
                                    class257.field4115++;
                                    var6 -= 3;
                                    class102.field1711 = class79.field1318[var6];
                                    class204.field3193 = class79.field1318[var6 + 1];
                                    class45.field647 = class79.field1318[var6 + 2];
                                    client.field2435.method536((byte) -104, 48);
                                    client.field2435.method654((byte) -121, class102.field1711);
                                    client.field2435.method654((byte) -114, class204.field3193);
                                    client.field2435.method654((byte) -119, class45.field647);
                                    continue;
                                }
                                if (var517 == 5002) {
                                    class140.field2142++;
                                    var7--;
                                    String var288 = class90.field1577[var7];
                                    var6 -= 2;
                                    int var289 = class79.field1318[var6];
                                    int var290 = class79.field1318[var6 + 1];
                                    client.field2435.method536((byte) -104, 201);
                                    client.field2435.method638(class148.method1000(var288, 934), false);
                                    client.field2435.method654((byte) -92, var289 - 1);
                                    client.field2435.method654((byte) -107, var290);
                                    continue;
                                }
                                if (var517 == 5003) {
                                    String var291 = null;
                                    var6--;
                                    int var292 = class79.field1318[var6];
                                    if (var292 < 100) {
                                        var291 = class193.field3060[var292];
                                    }
                                    if (var291 == null) {
                                        var291 = "";
                                    }
                                    class90.field1577[var7++] = var291;
                                    continue;
                                }
                                if (var517 == 5004) {
                                    var6--;
                                    int var293 = class79.field1318[var6];
                                    int var294 = -1;
                                    if (var293 < 100 && class193.field3060[var293] != null) {
                                        var294 = class152.field2382[var293];
                                    }
                                    class79.field1318[var6++] = var294;
                                    continue;
                                }
                                if (var517 == 5005) {
                                    class79.field1318[var6++] = class204.field3193;
                                    continue;
                                }
                                if (var517 == 5008) {
                                    var7--;
                                    String var295 = class90.field1577[var7];
                                    if (var295.startsWith("::")) {
                                        class277.method1875(true, var295);
                                        continue;
                                    }
                                    if (class140.field2141 == 0 && (class230.field3658 && !class115.field1878 || class179.field2794)) {
                                        continue;
                                    }
                                    String var296 = var295.toLowerCase();
                                    class69.field1117++;
                                    byte var297 = 0;
                                    byte var298 = 0;
                                    if (var296.startsWith(class190.field2943)) {
                                        var297 = 0;
                                        var295 = var295.substring(class190.field2943.length());
                                    } else if (var296.startsWith(class138.field2116)) {
                                        var297 = 1;
                                        var295 = var295.substring(class138.field2116.length());
                                    } else if (var296.startsWith(class296.field4676)) {
                                        var297 = 2;
                                        var295 = var295.substring(class296.field4676.length());
                                    } else if (var296.startsWith(class292.field4597)) {
                                        var297 = 3;
                                        var295 = var295.substring(class292.field4597.length());
                                    } else if (var296.startsWith(class294.field4636)) {
                                        var295 = var295.substring(class294.field4636.length());
                                        var297 = 4;
                                    } else if (var296.startsWith(class283.field4488)) {
                                        var297 = 5;
                                        var295 = var295.substring(class283.field4488.length());
                                    } else if (var296.startsWith(class29.field396)) {
                                        var295 = var295.substring(class29.field396.length());
                                        var297 = 6;
                                    } else if (var296.startsWith(class173.field2732)) {
                                        var295 = var295.substring(class173.field2732.length());
                                        var297 = 7;
                                    } else if (var296.startsWith(class65.field1099)) {
                                        var297 = 8;
                                        var295 = var295.substring(class65.field1099.length());
                                    } else if (var296.startsWith(class256.field4092)) {
                                        var297 = 9;
                                        var295 = var295.substring(class256.field4092.length());
                                    } else if (var296.startsWith(class62.field1075)) {
                                        var297 = 10;
                                        var295 = var295.substring(class62.field1075.length());
                                    } else if (var296.startsWith(class197.field3109)) {
                                        var297 = 11;
                                        var295 = var295.substring(class197.field3109.length());
                                    } else if (class177.field2770 != 0) {
                                        if (var296.startsWith(class118.field1904)) {
                                            var295 = var295.substring(class118.field1904.length());
                                            var297 = 0;
                                        } else if (var296.startsWith(class194.field3071)) {
                                            var295 = var295.substring(class194.field3071.length());
                                            var297 = 1;
                                        } else if (var296.startsWith(class245.field3983)) {
                                            var295 = var295.substring(class245.field3983.length());
                                            var297 = 2;
                                        } else if (var296.startsWith(class56.field926)) {
                                            var297 = 3;
                                            var295 = var295.substring(class56.field926.length());
                                        } else if (var296.startsWith(class75.field1249)) {
                                            var295 = var295.substring(class75.field1249.length());
                                            var297 = 4;
                                        } else if (var296.startsWith(class191.field2968)) {
                                            var297 = 5;
                                            var295 = var295.substring(class191.field2968.length());
                                        } else if (var296.startsWith(class216.field3350)) {
                                            var297 = 6;
                                            var295 = var295.substring(class216.field3350.length());
                                        } else if (var296.startsWith(class152.field2380)) {
                                            var295 = var295.substring(class152.field2380.length());
                                            var297 = 7;
                                        } else if (var296.startsWith(class94.field1607)) {
                                            var295 = var295.substring(class94.field1607.length());
                                            var297 = 8;
                                        } else if (var296.startsWith(class184.field2846)) {
                                            var297 = 9;
                                            var295 = var295.substring(class184.field2846.length());
                                        } else if (var296.startsWith(class86.field1441)) {
                                            var295 = var295.substring(class86.field1441.length());
                                            var297 = 10;
                                        } else if (var296.startsWith(class287.field4541)) {
                                            var297 = 11;
                                            var295 = var295.substring(class287.field4541.length());
                                        }
                                    }
                                    String var299 = var295.toLowerCase();
                                    if (var299.startsWith(class131.field2061)) {
                                        var298 = 1;
                                        var295 = var295.substring(class131.field2061.length());
                                    } else if (var299.startsWith(class203.field3170)) {
                                        var298 = 2;
                                        var295 = var295.substring(class203.field3170.length());
                                    } else if (var299.startsWith(class183.field2840)) {
                                        var295 = var295.substring(class183.field2840.length());
                                        var298 = 3;
                                    } else if (var299.startsWith(class117.field1902)) {
                                        var295 = var295.substring(class117.field1902.length());
                                        var298 = 4;
                                    } else if (var299.startsWith(class265.field4214)) {
                                        var298 = 5;
                                        var295 = var295.substring(class265.field4214.length());
                                    } else if (class177.field2770 != 0) {
                                        if (var299.startsWith(class130.field2045)) {
                                            var295 = var295.substring(class130.field2045.length());
                                            var298 = 1;
                                        } else if (var299.startsWith(class27.field368)) {
                                            var298 = 2;
                                            var295 = var295.substring(class27.field368.length());
                                        } else if (var299.startsWith(class87.field1468)) {
                                            var295 = var295.substring(class87.field1468.length());
                                            var298 = 3;
                                        } else if (var299.startsWith(class251.field4039)) {
                                            var295 = var295.substring(class251.field4039.length());
                                            var298 = 4;
                                        } else if (var299.startsWith(class174.field2743)) {
                                            var295 = var295.substring(class174.field2743.length());
                                            var298 = 5;
                                        }
                                    }
                                    client.field2435.method536((byte) -104, 251);
                                    client.field2435.method654((byte) -100, 0);
                                    int var300 = client.field2435.field1535;
                                    client.field2435.method654((byte) -124, var297);
                                    client.field2435.method654((byte) -95, var298);
                                    class15.method156(client.field2435, 0, var295);
                                    client.field2435.method648(1210551352, client.field2435.field1535 - var300);
                                    continue;
                                }
                                if (var517 == 5009) {
                                    var7 -= 2;
                                    String var301 = class90.field1577[var7];
                                    String var302 = class90.field1577[var7 + 1];
                                    if (class140.field2141 != 0 || (!class230.field3658 || class115.field1878) && !class179.field2794) {
                                        class214.field3329++;
                                        client.field2435.method536((byte) -104, 165);
                                        client.field2435.method654((byte) -127, 0);
                                        int var303 = client.field2435.field1535;
                                        client.field2435.method638(class148.method1000(var301, 934), false);
                                        class15.method156(client.field2435, 0, var302);
                                        client.field2435.method648(1210551352, client.field2435.field1535 - var303);
                                    }
                                    continue;
                                }
                                if (var517 == 5010) {
                                    var6--;
                                    int var304 = class79.field1318[var6];
                                    String var305 = null;
                                    if (var304 < 100) {
                                        var305 = class200.field3136[var304];
                                    }
                                    if (var305 == null) {
                                        var305 = "";
                                    }
                                    class90.field1577[var7++] = var305;
                                    continue;
                                }
                                if (var517 == 5011) {
                                    String var306 = null;
                                    var6--;
                                    int var307 = class79.field1318[var6];
                                    if (var307 < 100) {
                                        var306 = class260.field4161[var307];
                                    }
                                    if (var306 == null) {
                                        var306 = "";
                                    }
                                    class90.field1577[var7++] = var306;
                                    continue;
                                }
                                if (var517 == 5012) {
                                    var6--;
                                    int var308 = class79.field1318[var6];
                                    int var309 = -1;
                                    if (var308 < 100) {
                                        var309 = class62.field1073[var308];
                                    }
                                    class79.field1318[var6++] = var309;
                                    continue;
                                }
                                if (var517 == 5015) {
                                    String var310;
                                    if (class283.field4473 == null || class283.field4473.field3803 == null) {
                                        var310 = class245.field3980;
                                    } else {
                                        var310 = class283.field4473.method1620(false);
                                    }
                                    class90.field1577[var7++] = var310;
                                    continue;
                                }
                                if (var517 == 5016) {
                                    class79.field1318[var6++] = class45.field647;
                                    continue;
                                }
                                if (var517 == 5017) {
                                    class79.field1318[var6++] = class97.field1626;
                                    continue;
                                }
                                if (var517 == 5050) {
                                    var6--;
                                    int var311 = class79.field1318[var6];
                                    class90.field1577[var7++] = class189.method1273((byte) -24, var311).field267;
                                    continue;
                                }
                                if (var517 == 5051) {
                                    var6--;
                                    int var312 = class79.field1318[var6];
                                    class17 var313 = class189.method1273((byte) -10, var312);
                                    if (var313.field266 == null) {
                                        class79.field1318[var6++] = 0;
                                    } else {
                                        class79.field1318[var6++] = var313.field266.length;
                                    }
                                    continue;
                                }
                                if (var517 == 5052) {
                                    var6 -= 2;
                                    int var314 = class79.field1318[var6];
                                    int var315 = class79.field1318[var6 + 1];
                                    class17 var316 = class189.method1273((byte) -39, var314);
                                    int var317 = var316.field266[var315];
                                    class79.field1318[var6++] = var317;
                                    continue;
                                }
                                if (var517 == 5053) {
                                    var6--;
                                    int var318 = class79.field1318[var6];
                                    class17 var319 = class189.method1273((byte) -54, var318);
                                    if (var319.field258 == null) {
                                        class79.field1318[var6++] = 0;
                                    } else {
                                        class79.field1318[var6++] = var319.field258.length;
                                    }
                                    continue;
                                }
                                if (var517 == 5054) {
                                    var6 -= 2;
                                    int var320 = class79.field1318[var6 + 1];
                                    int var321 = class79.field1318[var6];
                                    class79.field1318[var6++] = class189.method1273((byte) -75, var321).field258[var320];
                                    continue;
                                }
                                if (var517 == 5055) {
                                    var6--;
                                    int var322 = class79.field1318[var6];
                                    class90.field1577[var7++] = class71.method512(-118, var322).method1158(60);
                                    continue;
                                }
                                if (var517 == 5056) {
                                    var6--;
                                    int var323 = class79.field1318[var6];
                                    class171 var324 = class71.method512(-121, var323);
                                    if (var324.field2660 == null) {
                                        class79.field1318[var6++] = 0;
                                    } else {
                                        class79.field1318[var6++] = var324.field2660.length;
                                    }
                                    continue;
                                }
                                if (var517 == 5057) {
                                    var6 -= 2;
                                    int var325 = class79.field1318[var6];
                                    int var326 = class79.field1318[var6 + 1];
                                    class79.field1318[var6++] = class71.method512(-121, var325).field2660[var326];
                                    continue;
                                }
                                if (var517 == 5058) {
                                    class164.field2576 = new class110();
                                    var6--;
                                    class164.field2576.field1809 = class79.field1318[var6];
                                    class164.field2576.field1801 = class71.method512(-123, class164.field2576.field1809);
                                    class164.field2576.field1799 = new int[class164.field2576.field1801.method1150(66)];
                                    continue;
                                }
                                if (var517 == 5059) {
                                    class1.field1++;
                                    client.field2435.method536((byte) -104, 197);
                                    client.field2435.method654((byte) -108, 0);
                                    int var327 = client.field2435.field1535;
                                    client.field2435.method654((byte) -96, 0);
                                    client.field2435.method634(class164.field2576.field1809, 88);
                                    class164.field2576.field1801.method1157(class164.field2576.field1799, arg1 + 5102, client.field2435);
                                    client.field2435.method648(1210551352, client.field2435.field1535 - var327);
                                    continue;
                                }
                                if (var517 == 5060) {
                                    var7--;
                                    String var328 = class90.field1577[var7];
                                    client.field2435.method536((byte) -104, 104);
                                    client.field2435.method654((byte) -108, 0);
                                    class219.field3377++;
                                    int var329 = client.field2435.field1535;
                                    client.field2435.method638(class148.method1000(var328, 934), false);
                                    client.field2435.method634(class164.field2576.field1809, 100);
                                    class164.field2576.field1801.method1157(class164.field2576.field1799, -1, client.field2435);
                                    client.field2435.method648(arg1 + 1210556455, client.field2435.field1535 - var329);
                                    continue;
                                }
                                if (var517 == 5061) {
                                    class1.field1++;
                                    client.field2435.method536((byte) -104, 197);
                                    client.field2435.method654((byte) -104, 0);
                                    int var330 = client.field2435.field1535;
                                    client.field2435.method654((byte) -110, 1);
                                    client.field2435.method634(class164.field2576.field1809, arg1 ^ 0xFFFFEC28);
                                    class164.field2576.field1801.method1157(class164.field2576.field1799, -1, client.field2435);
                                    client.field2435.method648(arg1 + 1210556455, client.field2435.field1535 - var330);
                                    continue;
                                }
                                if (var517 == 5062) {
                                    var6 -= 2;
                                    int var331 = class79.field1318[var6];
                                    int var332 = class79.field1318[var6 + 1];
                                    class79.field1318[var6++] = class189.method1273((byte) -8, var331).field264[var332];
                                    continue;
                                }
                                if (var517 == 5063) {
                                    var6 -= 2;
                                    int var333 = class79.field1318[var6];
                                    int var334 = class79.field1318[var6 + 1];
                                    class79.field1318[var6++] = class189.method1273((byte) -80, var333).field261[var334];
                                    continue;
                                }
                                if (var517 == 5064) {
                                    var6 -= 2;
                                    int var335 = class79.field1318[var6 + 1];
                                    int var336 = class79.field1318[var6];
                                    if (var335 == -1) {
                                        class79.field1318[var6++] = -1;
                                    } else {
                                        class79.field1318[var6++] = class189.method1273((byte) -107, var336).method162(false, (char) var335);
                                    }
                                    continue;
                                }
                                if (var517 == 5065) {
                                    var6 -= 2;
                                    int var337 = class79.field1318[var6 + 1];
                                    int var338 = class79.field1318[var6];
                                    if (var337 == -1) {
                                        class79.field1318[var6++] = -1;
                                    } else {
                                        class79.field1318[var6++] = class189.method1273((byte) -80, var338).method161((byte) -36, (char) var337);
                                    }
                                    continue;
                                }
                                if (var517 == 5066) {
                                    var6--;
                                    int var339 = class79.field1318[var6];
                                    class79.field1318[var6++] = class71.method512(-122, var339).method1150(101);
                                    continue;
                                }
                                if (var517 == 5067) {
                                    var6 -= 2;
                                    int var340 = class79.field1318[var6 + 1];
                                    int var341 = class79.field1318[var6];
                                    int var342 = class71.method512(-124, var341).method1153(false, var340);
                                    class79.field1318[var6++] = var342;
                                    continue;
                                }
                                if (var517 == 5068) {
                                    var6 -= 2;
                                    int var343 = class79.field1318[var6];
                                    int var344 = class79.field1318[var6 + 1];
                                    class164.field2576.field1799[var343] = var344;
                                    continue;
                                }
                                if (var517 == 5069) {
                                    var6 -= 2;
                                    int var345 = class79.field1318[var6];
                                    int var346 = class79.field1318[var6 + 1];
                                    class164.field2576.field1799[var345] = var346;
                                    continue;
                                }
                                if (var517 == 5070) {
                                    var6 -= 3;
                                    int var347 = class79.field1318[var6];
                                    int var348 = class79.field1318[var6 + 1];
                                    int var349 = class79.field1318[var6 + 2];
                                    class171 var350 = class71.method512(-121, var347);
                                    if (var350.method1153(false, var348) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class79.field1318[var6++] = var350.method1148((byte) -6, var349, var348);
                                    continue;
                                }
                                if (var517 == 5071) {
                                    var7--;
                                    String var351 = class90.field1577[var7];
                                    var6--;
                                    boolean var352 = class79.field1318[var6] == 1;
                                    class43.method316((byte) -81, var351, var352);
                                    class79.field1318[var6++] = class39.field557;
                                    continue;
                                }
                                if (var517 == 5072) {
                                    if (class292.field4594 != null && class148.field2339 < class39.field557) {
                                        class79.field1318[var6++] = class55.method420(class292.field4594[class148.field2339++], 65535);
                                        continue;
                                    }
                                    class79.field1318[var6++] = -1;
                                    continue;
                                }
                                if (var517 == 5073) {
                                    class148.field2339 = 0;
                                    continue;
                                }
                            } else if (var517 < 5200) {
                                if (var517 == 5100) {
                                    if (class106.field1764[86]) {
                                        class79.field1318[var6++] = 1;
                                    } else {
                                        class79.field1318[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5101) {
                                    if (class106.field1764[82]) {
                                        class79.field1318[var6++] = 1;
                                    } else {
                                        class79.field1318[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5102) {
                                    if (class106.field1764[81]) {
                                        class79.field1318[var6++] = 1;
                                    } else {
                                        class79.field1318[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var517 < 5300) {
                                if (var517 == 5200) {
                                    var6--;
                                    class106.method759(class79.field1318[var6], -7091);
                                    continue;
                                }
                                if (var517 == 5201) {
                                    class79.field1318[var6++] = class125.method866(false);
                                    continue;
                                }
                                if (var517 == 5202) {
                                    var6--;
                                    class150.method1013(class79.field1318[var6], 20);
                                    continue;
                                }
                                if (var517 == 5203) {
                                    var7--;
                                    class194.method1316(class90.field1577[var7], arg1 ^ 0x13EE);
                                    continue;
                                }
                                if (var517 == 5204) {
                                    class90.field1577[var7 - 1] = class269.method1810(class90.field1577[var7 - 1], false);
                                    continue;
                                }
                                if (var517 == 5205) {
                                    var6--;
                                    class143.method966(-1, -69, class79.field1318[var6], -1);
                                    continue;
                                }
                                if (var517 == 5206) {
                                    var6--;
                                    int var250 = class79.field1318[var6];
                                    class259 var251 = class297.method1980(var250 & 0x3FFF, (var250 & 0xFFFE06E) >> 14, arg1 ^ 0xFFFFEC60);
                                    if (var251 == null) {
                                        class79.field1318[var6++] = -1;
                                    } else {
                                        class79.field1318[var6++] = var251.field4138;
                                    }
                                    continue;
                                }
                                if (var517 == 5207) {
                                    var6--;
                                    class259 var252 = class30.method230(class79.field1318[var6], arg1 + 5092);
                                    if (var252 != null && var252.field4144 != null) {
                                        class90.field1577[var7++] = var252.field4144;
                                        continue;
                                    }
                                    class90.field1577[var7++] = "";
                                    continue;
                                }
                                if (var517 == 5208) {
                                    class79.field1318[var6++] = class25.field338;
                                    class79.field1318[var6++] = class82.field1386;
                                    continue;
                                }
                                if (var517 == 5209) {
                                    class79.field1318[var6++] = class293.field4621 + class101.field1697;
                                    class79.field1318[var6++] = class191.field2970 + class164.field2584 - class201.field3148 - 1;
                                    continue;
                                }
                                if (var517 == 5210) {
                                    var6--;
                                    int var253 = class79.field1318[var6];
                                    class259 var254 = class30.method230(var253, arg1 + 5092);
                                    if (var254 == null) {
                                        class79.field1318[var6++] = 0;
                                        class79.field1318[var6++] = 0;
                                    } else {
                                        class79.field1318[var6++] = class55.method420(var254.field4136, 268431358) >> 14;
                                        class79.field1318[var6++] = class55.method420(var254.field4136, 16383);
                                    }
                                    continue;
                                }
                                if (var517 == 5211) {
                                    var6--;
                                    int var255 = class79.field1318[var6];
                                    class259 var256 = class30.method230(var255, -11);
                                    if (var256 == null) {
                                        class79.field1318[var6++] = 0;
                                        class79.field1318[var6++] = 0;
                                    } else {
                                        class79.field1318[var6++] = var256.field4131 - var256.field4133;
                                        class79.field1318[var6++] = var256.field4148 - var256.field4143;
                                    }
                                    continue;
                                }
                                if (var517 == 5212) {
                                    int var257 = class240.method1648(arg1 ^ 0xFFFFD181);
                                    int var258 = 0;
                                    String var259;
                                    if (var257 == -1) {
                                        var259 = "";
                                    } else {
                                        var259 = class93.field1596.field3242[var257];
                                        var258 = class93.field1596.method1394(var257, arg1 ^ 0xFFFFEC4A);
                                    }
                                    String var260 = class50.method376(" ", 0, var259, "<br>");
                                    class90.field1577[var7++] = var260;
                                    class79.field1318[var6++] = var258;
                                    continue;
                                }
                                if (var517 == 5213) {
                                    int var261 = class261.method1766(false);
                                    int var262 = 0;
                                    String var263;
                                    if (var261 == -1) {
                                        var263 = "";
                                    } else {
                                        var263 = class93.field1596.field3242[var261];
                                        var262 = class93.field1596.method1394(var261, 98);
                                    }
                                    String var264 = class50.method376(" ", 0, var263, "<br>");
                                    class90.field1577[var7++] = var264;
                                    class79.field1318[var6++] = var262;
                                    continue;
                                }
                                if (var517 == 5214) {
                                    var6--;
                                    int var265 = class79.field1318[var6];
                                    class259 var266 = class65.method483(arg1 ^ 0xFFFF9922);
                                    if (var266 != null) {
                                        int[] var267 = var266.method1758((var265 & 0xFFFC919) >> 14, var265 & 0x3FFF, (byte) 103, (var265 & 0x3C931602) >> 28);
                                        if (var267 != null) {
                                            class223.method1501(var267[2], (byte) 104, var267[1]);
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 5215) {
                                    var6 -= 2;
                                    int var268 = class79.field1318[var6];
                                    int var269 = class79.field1318[var6 + 1];
                                    class86 var270 = class259.method1755(var268 & 0x3FFF, var268 >> 14 & 0x3FFF, 12800);
                                    boolean var271 = false;
                                    for (class259 var272 = (class259) var270.method607((byte) 106); var272 != null; var272 = (class259) var270.method611((byte) -2)) {
                                        if (var272.field4138 == var269) {
                                            var271 = true;
                                            break;
                                        }
                                    }
                                    if (var271) {
                                        class79.field1318[var6++] = 1;
                                    } else {
                                        class79.field1318[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5216) {
                                    var6--;
                                    int var273 = class79.field1318[var6];
                                    class80.method572((byte) 115, var273);
                                    continue;
                                }
                                if (var517 == 5217) {
                                    var6--;
                                    int var274 = class79.field1318[var6];
                                    if (class120.method836(32, var274)) {
                                        class79.field1318[var6++] = 1;
                                    } else {
                                        class79.field1318[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5218) {
                                    var6--;
                                    int var275 = class79.field1318[var6];
                                    class259 var276 = class30.method230(var275, -11);
                                    if (var276 == null) {
                                        class79.field1318[var6++] = -1;
                                    } else {
                                        class79.field1318[var6++] = var276.field4149;
                                    }
                                    continue;
                                }
                                if (var517 == 5219) {
                                    var7--;
                                    class192.method1291(1, class90.field1577[var7]);
                                    continue;
                                }
                                if (var517 == 5220) {
                                    class79.field1318[var6++] = class275.field4386 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 5221) {
                                    var6--;
                                    int var277 = class79.field1318[var6];
                                    class223.method1501(var277 & 0x3FFF, (byte) 111, (var277 & 0xFFFE552) >> 14);
                                    continue;
                                }
                                if (var517 == 5222) {
                                    class259 var278 = class65.method483(30003);
                                    if (var278 == null) {
                                        class79.field1318[var6++] = -1;
                                        class79.field1318[var6++] = -1;
                                    } else {
                                        int[] var279 = var278.method1760(class293.field4621 + class101.field1697, class191.field2970 + -1 + -class201.field3148 - -class164.field2584, -97);
                                        if (var279 == null) {
                                            class79.field1318[var6++] = -1;
                                            class79.field1318[var6++] = -1;
                                        } else {
                                            class79.field1318[var6++] = var279[1];
                                            class79.field1318[var6++] = var279[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 5223) {
                                    var6 -= 2;
                                    int var280 = class79.field1318[var6];
                                    int var281 = class79.field1318[var6 + 1];
                                    class143.method966(var281 & 0x3FFF, -55, var280, (var281 & 0xFFFC0F3) >> 14);
                                    continue;
                                }
                                if (var517 == 5224) {
                                    var6--;
                                    int var282 = class79.field1318[var6];
                                    class259 var283 = class65.method483(30003);
                                    if (var283 == null) {
                                        class79.field1318[var6++] = -1;
                                        class79.field1318[var6++] = -1;
                                    } else {
                                        int[] var284 = var283.method1758(var282 >> 14 & 0x3FFF, var282 & 0x3FFF, (byte) -73, (var282 & 0x3EBB2FC9) >> 28);
                                        if (var284 == null) {
                                            class79.field1318[var6++] = -1;
                                            class79.field1318[var6++] = -1;
                                        } else {
                                            class79.field1318[var6++] = var284[1];
                                            class79.field1318[var6++] = var284[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 5225) {
                                    var6--;
                                    int var285 = class79.field1318[var6];
                                    class259 var286 = class65.method483(arg1 ^ 0xFFFF9922);
                                    if (var286 == null) {
                                        class79.field1318[var6++] = -1;
                                        class79.field1318[var6++] = -1;
                                    } else {
                                        int[] var287 = var286.method1760((var285 & 0xFFFFFF3) >> 14, var285 & 0x3FFF, -59);
                                        if (var287 == null) {
                                            class79.field1318[var6++] = -1;
                                            class79.field1318[var6++] = -1;
                                        } else {
                                            class79.field1318[var6++] = var287[1];
                                            class79.field1318[var6++] = var287[2];
                                        }
                                    }
                                    continue;
                                }
                            } else if (var517 < 5400) {
                                if (var517 == 5300) {
                                    var6 -= 2;
                                    class79.field1318[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 5301) {
                                    continue;
                                }
                                if (var517 == 5302) {
                                    class79.field1318[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 5303) {
                                    var6--;
                                    class79.field1318[var6++] = 0;
                                    class79.field1318[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 5305) {
                                    byte var247 = -1;
                                    class79.field1318[var6++] = var247;
                                    continue;
                                }
                                if (var517 == 5306) {
                                    class79.field1318[var6++] = class33.method262(class87.method619(arg1, -5103));
                                    continue;
                                }
                                if (var517 == 5307) {
                                    var6--;
                                    int var248 = class79.field1318[var6];
                                    if (var248 < 0 || var248 > 2) {
                                        var248 = 0;
                                    }
                                    class118.method829(var248, false, -1, -1, false);
                                    continue;
                                }
                                if (var517 == 5308) {
                                    class79.field1318[var6++] = class181.field2829;
                                    continue;
                                }
                                if (var517 == 5309) {
                                    var6--;
                                    int var249 = class79.field1318[var6];
                                    if (var249 < 0 || var249 > 2) {
                                        var249 = 0;
                                    }
                                    class181.field2829 = var249;
                                    class73.method531((byte) 8, class179.field2788);
                                    continue;
                                }
                            } else if (var517 < 5500) {
                                if (var517 == 5400) {
                                    var7 -= 2;
                                    class16.field238++;
                                    String var183 = class90.field1577[var7];
                                    String var184 = class90.field1577[var7 + 1];
                                    var6--;
                                    int var185 = class79.field1318[var6];
                                    client.field2435.method536((byte) -104, 176);
                                    client.field2435.method654((byte) -105, class125.method871(var183, true) + class125.method871(var184, true) + 1);
                                    client.field2435.method680(var183, (byte) 101);
                                    client.field2435.method680(var184, (byte) 101);
                                    client.field2435.method654((byte) -98, var185);
                                    continue;
                                }
                                if (var517 == 5401) {
                                    var6 -= 2;
                                    class287.field4543[class79.field1318[var6]] = (short) class42.method311((byte) -30, class79.field1318[var6 + 1]);
                                    class183.method1241((byte) -69);
                                    class240.method1645(17548);
                                    class75.method544(arg1 + 5016);
                                    class94.method709(-1);
                                    class256.method1738(arg1 + 5181);
                                    continue;
                                }
                                if (var517 == 5405) {
                                    var6 -= 2;
                                    int var186 = class79.field1318[var6];
                                    int var187 = class79.field1318[var6 + 1];
                                    if (var186 >= 0 && var186 < 2) {
                                        class36.field516[var186] = new int[var187 << 1][4];
                                    }
                                    continue;
                                }
                                if (var517 == 5406) {
                                    var6 -= 7;
                                    int var188 = class79.field1318[var6];
                                    int var189 = class79.field1318[var6 + 1] << 1;
                                    int var190 = class79.field1318[var6 + 2];
                                    int var191 = class79.field1318[var6 + 3];
                                    int var192 = class79.field1318[var6 + 4];
                                    int var193 = class79.field1318[var6 + 5];
                                    int var194 = class79.field1318[var6 + 6];
                                    if (var188 >= 0 && var188 < 2 && class36.field516[var188] != null && var189 >= 0 && var189 < class36.field516[var188].length) {
                                        class36.field516[var188][var189] = new int[] { class55.method420(var190 >> 14, 16383) * 128, var191, class55.method420(var190, 16383) * 128, var194 };
                                        class36.field516[var188][var189 + 1] = new int[] { (class55.method420(268430459, var192) >> 14) * 128, var193, class55.method420(16383, var192) * 128 };
                                    }
                                    continue;
                                }
                                if (var517 == 5407) {
                                    var6--;
                                    int var195 = class36.field516[class79.field1318[var6]].length >> 1;
                                    class79.field1318[var6++] = var195;
                                    continue;
                                }
                                if (var517 == 5411) {
                                    if (class47.field685 == null) {
                                        class34.method268(arg1 ^ 0xFFFFEC11, class297.method1984(99), false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var517 == 5419) {
                                    String var196 = "";
                                    if (class50.field738 != null) {
                                        if (class50.field738.field1258 == null) {
                                            var196 = class97.method715(class50.field738.field1253, arg1 + 5003);
                                        } else {
                                            var196 = (String) class50.field738.field1258;
                                        }
                                    }
                                    class90.field1577[var7++] = var196;
                                    continue;
                                }
                                if (var517 == 5420) {
                                    class79.field1318[var6++] = class32.field468 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 5421) {
                                    var7--;
                                    String var197 = class90.field1577[var7];
                                    var6--;
                                    boolean var198 = class79.field1318[var6] == 1;
                                    String var199 = class297.method1984(arg1 + 5216) + var197;
                                    if (class47.field685 == null && (!var198 || class32.field468 == 3 || !class32.field477.startsWith("win") || class193.field3021)) {
                                        class34.method268(0, var199, var198);
                                        continue;
                                    }
                                    class106.field1774 = var198;
                                    class142.field2157 = var199;
                                    class221.field3399 = class179.field2788.method250(16, var199);
                                    continue;
                                }
                                if (var517 == 5422) {
                                    var7 -= 2;
                                    String var200 = class90.field1577[var7];
                                    var6--;
                                    int var201 = class79.field1318[var6];
                                    String var202 = class90.field1577[var7 + 1];
                                    if (var200.length() > 0) {
                                        if (class98.field1652 == null) {
                                            class98.field1652 = new String[class250.field4027[class167.field2613]];
                                        }
                                        class98.field1652[var201] = var200;
                                    }
                                    if (var202.length() > 0) {
                                        if (class72.field1216 == null) {
                                            class72.field1216 = new String[class250.field4027[class167.field2613]];
                                        }
                                        class72.field1216[var201] = var202;
                                    }
                                    continue;
                                }
                                if (var517 == 5423) {
                                    var7--;
                                    System.out.println(class90.field1577[var7]);
                                    continue;
                                }
                                if (var517 == 5424) {
                                    var6 -= 11;
                                    class244.field3976 = class79.field1318[var6];
                                    class69.field1114 = class79.field1318[var6 + 1];
                                    class141.field2152 = class79.field1318[var6 + 2];
                                    class97.field1627 = class79.field1318[var6 + 3];
                                    class10.field175 = class79.field1318[var6 + 4];
                                    class56.field929 = class79.field1318[var6 + 5];
                                    class265.field4215 = class79.field1318[var6 + 6];
                                    class295.field4657 = class79.field1318[var6 + 7];
                                    class259.field4129 = class79.field1318[var6 + 8];
                                    class259.field4147 = class79.field1318[var6 + 9];
                                    class294.field4635 = class79.field1318[var6 + 10];
                                    class130.field2055.method1613(false, class10.field175);
                                    class130.field2055.method1613(false, class56.field929);
                                    class130.field2055.method1613(false, class265.field4215);
                                    class130.field2055.method1613(false, class295.field4657);
                                    class130.field2055.method1613(false, class259.field4129);
                                    class180.field2798 = true;
                                    continue;
                                }
                                if (var517 == 5425) {
                                    class148.method994(-103);
                                    class180.field2798 = false;
                                    continue;
                                }
                                if (var517 == 5426) {
                                    var6--;
                                    class28.field395 = class79.field1318[var6];
                                    continue;
                                }
                                if (var517 == 5427) {
                                    var6 -= 2;
                                    class140.field2139 = class79.field1318[var6];
                                    class34.field504 = class79.field1318[var6 + 1];
                                    continue;
                                }
                                if (var517 == 5428) {
                                    var6 -= 2;
                                    int var203 = class79.field1318[var6];
                                    int var204 = class79.field1318[var6 + 1];
                                    class79.field1318[var6++] = class135.method925(40, var204, var203) ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 5600) {
                                if (var517 == 5500) {
                                    var6 -= 4;
                                    int var235 = class79.field1318[var6 + 1];
                                    int var236 = class79.field1318[var6 + 2];
                                    int var237 = class79.field1318[var6 + 3];
                                    int var238 = class79.field1318[var6];
                                    class209.method1405((var238 >> 14 & 0x3FFF) - class46.field656, (var238 & 0x3FFF) + -class260.field4162, var235, var236, (byte) -112, var237, false);
                                    continue;
                                }
                                if (var517 == 5501) {
                                    var6 -= 4;
                                    int var239 = class79.field1318[var6 + 1];
                                    int var240 = class79.field1318[var6];
                                    int var241 = class79.field1318[var6 + 2];
                                    int var242 = class79.field1318[var6 + 3];
                                    class269.method1814(var242, (byte) 127, var239, ((var240 & 0xFFFD6E0) >> 14) - class46.field656, (var240 & 0x3FFF) - class260.field4162, var241);
                                    continue;
                                }
                                if (var517 == 5502) {
                                    var6 -= 6;
                                    int var243 = class79.field1318[var6];
                                    if (var243 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class33.field497 = var243;
                                    int var244 = class79.field1318[var6 + 1];
                                    if (var244 + 1 >= class36.field516[class33.field497].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class206.field3212 = var244;
                                    class77.field1266 = 0;
                                    class87.field1465 = class79.field1318[var6 + 2];
                                    class274.field4375 = class79.field1318[var6 + 3];
                                    int var245 = class79.field1318[var6 + 4];
                                    if (var245 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class160.field2477 = var245;
                                    int var246 = class79.field1318[var6 + 5];
                                    if ((class36.field516[class160.field2477].length >> 1) <= (var246 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class259.field4130 = 3;
                                    class241.field3911 = var246;
                                    continue;
                                }
                                if (var517 == 5503) {
                                    class203.method1369(-20406);
                                    continue;
                                }
                                if (var517 == 5504) {
                                    var6 -= 2;
                                    class163.method1105(class79.field1318[var6 + 1], true, class79.field1318[var6]);
                                    continue;
                                }
                                if (var517 == 5505) {
                                    class79.field1318[var6++] = (int) class142.field2160;
                                    continue;
                                }
                                if (var517 == 5506) {
                                    class79.field1318[var6++] = (int) class16.field244;
                                    continue;
                                }
                                if (var517 == 5507) {
                                    class57.method435(arg1 + 5113);
                                    continue;
                                }
                                if (var517 == 5508) {
                                    class167.method1125(-17);
                                    continue;
                                }
                                if (var517 == 5509) {
                                    class206.method1388(16777215);
                                    continue;
                                }
                                if (var517 == 5510) {
                                    class45.method325((byte) 122);
                                    continue;
                                }
                                if (var517 == 5512) {
                                    class171.method1149(0);
                                    continue;
                                }
                            } else if (var517 < 5700) {
                                if (var517 == 5600) {
                                    var7 -= 2;
                                    var6--;
                                    int var205 = class79.field1318[var6];
                                    String var206 = class90.field1577[var7 + 1];
                                    String var207 = class90.field1577[var7];
                                    if (class39.field551 == 10 && class3.field21 == 0 && class235.field3794 == 0 && class255.field4087 == 0 && class29.field406 == 0) {
                                        class133.method918(var205, var206, (byte) 106, var207);
                                    }
                                    continue;
                                }
                                if (var517 == 5601) {
                                    class223.method1500(true);
                                    continue;
                                }
                                if (var517 == 5602) {
                                    if (class235.field3794 == 0) {
                                        class217.field3353 = -2;
                                    }
                                    continue;
                                }
                                if (var517 == 5603) {
                                    var6 -= 4;
                                    if (class39.field551 == 10 && class3.field21 == 0 && class235.field3794 == 0 && class255.field4087 == 0 && class29.field406 == 0) {
                                        class143.method963(class79.field1318[var6 + 1], 0, class79.field1318[var6 + 2], class79.field1318[var6], class79.field1318[var6 + 3]);
                                    }
                                    continue;
                                }
                                if (var517 == 5604) {
                                    var7--;
                                    if (class39.field551 == 10 && class3.field21 == 0 && class235.field3794 == 0 && class255.field4087 == 0 && class29.field406 == 0) {
                                        class131.method911(120, class148.method1000(class90.field1577[var7], 934));
                                    }
                                    continue;
                                }
                                if (var517 == 5605) {
                                    var7 -= 3;
                                    var6 -= 7;
                                    if (class39.field551 == 10 && class3.field21 == 0 && class235.field3794 == 0 && class255.field4087 == 0 && class29.field406 == 0) {
                                        class80.method576(class148.method1000(class90.field1577[var7], 934), class79.field1318[var6 + 4] == 1, class79.field1318[var6 + 5] == 1, class90.field1577[var7 + 2], class79.field1318[var6 + 2], class79.field1318[var6 + 6] == 1, class79.field1318[var6 + 3], 0, class90.field1577[var7 + 1], class79.field1318[var6], class79.field1318[var6 + 1]);
                                    }
                                    continue;
                                }
                                if (var517 == 5606) {
                                    if (class255.field4087 == 0) {
                                        class171.field2677 = -2;
                                    }
                                    continue;
                                }
                                if (var517 == 5607) {
                                    class79.field1318[var6++] = class217.field3353;
                                    continue;
                                }
                                if (var517 == 5608) {
                                    class79.field1318[var6++] = class245.field3988;
                                    continue;
                                }
                                if (var517 == 5609) {
                                    class79.field1318[var6++] = class171.field2677;
                                    continue;
                                }
                                if (var517 == 5610) {
                                    for (int var208 = 0; var208 < 5; var208++) {
                                        class90.field1577[var7++] = var208 < class26.field347.length ? class181.method1232(92, class26.field347[var208]) : "";
                                    }
                                    class26.field347 = null;
                                    continue;
                                }
                                if (var517 == 5611) {
                                    class79.field1318[var6++] = class5.field57;
                                    continue;
                                }
                            } else if (var517 < 6100) {
                                if (var517 == 6001) {
                                    var6--;
                                    int var226 = class79.field1318[var6];
                                    if (var226 < 1) {
                                        var226 = 1;
                                    }
                                    if (var226 > 4) {
                                        var226 = 4;
                                    }
                                    class50.field740 = var226;
                                    if (class50.field740 == 1) {
                                        class195.method1318(0.9F);
                                    }
                                    if (class50.field740 == 2) {
                                        class195.method1318(0.8F);
                                    }
                                    if (class50.field740 == 3) {
                                        class195.method1318(0.7F);
                                    }
                                    if (class50.field740 == 4) {
                                        class195.method1318(0.6F);
                                    }
                                    class240.method1645(17548);
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6002) {
                                    var6--;
                                    class133.method922(class79.field1318[var6] == 1, 3);
                                    class212.method1435((byte) 27);
                                    class281.method1889((byte) 93);
                                    class244.method1685(-109);
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6003) {
                                    var6--;
                                    class132.field2070 = class79.field1318[var6] == 1;
                                    class244.method1685(57);
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6005) {
                                    var6--;
                                    class132.field2072 = class79.field1318[var6] == 1;
                                    class281.method1889((byte) -119);
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6006) {
                                    var6--;
                                    class210.field3264 = class79.field1318[var6] == 1;
                                    ((class187) class195.field3087).method1267((byte) -85, !class210.field3264);
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6007) {
                                    var6--;
                                    class77.field1260 = class79.field1318[var6] == 1;
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6008) {
                                    var6--;
                                    class147.field2331 = class79.field1318[var6] == 1;
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6009) {
                                    var6--;
                                    class170.field2648 = class79.field1318[var6] == 1;
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6010) {
                                    var6--;
                                    class19.field291 = class79.field1318[var6] == 1;
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6011) {
                                    var6--;
                                    int var227 = class79.field1318[var6];
                                    if (var227 < 0 || var227 > 2) {
                                        var227 = 0;
                                    }
                                    class190.field2948 = var227;
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6012) {
                                    var6--;
                                    class197.field3116 = class79.field1318[var6] == 1;
                                    if (class50.field740 == 1) {
                                        class195.method1318(0.9F);
                                    }
                                    if (class50.field740 == 2) {
                                        class195.method1318(0.8F);
                                    }
                                    if (class50.field740 == 3) {
                                        class195.method1318(0.7F);
                                    }
                                    if (class50.field740 == 4) {
                                        class195.method1318(0.6F);
                                    }
                                    class281.method1889((byte) -30);
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6014) {
                                    var6--;
                                    class293.field4622 = class79.field1318[var6] == 1;
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6015) {
                                    var6--;
                                    class179.field2790 = class79.field1318[var6] == 1;
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6016) {
                                    var6--;
                                    int var228 = class79.field1318[var6];
                                    if (var228 < 0 || var228 > 2) {
                                        var228 = 0;
                                    }
                                    class180.field2815 = var228;
                                    continue;
                                }
                                if (var517 == 6017) {
                                    var6--;
                                    class155.field2407 = class79.field1318[var6] == 1;
                                    class245.method1686(115);
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6018) {
                                    var6--;
                                    int var229 = class79.field1318[var6];
                                    if (var229 < 0) {
                                        var229 = 0;
                                    }
                                    if (var229 > 127) {
                                        var229 = 127;
                                    }
                                    class18.field272 = var229;
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6019) {
                                    var6--;
                                    int var230 = class79.field1318[var6];
                                    if (var230 < 0) {
                                        var230 = 0;
                                    }
                                    if (var230 > 255) {
                                        var230 = 255;
                                    }
                                    if (class294.field4633 != var230) {
                                        if (class294.field4633 == 0 && class167.field2618 != -1) {
                                            class132.method916(-6178, class31.field459, class167.field2618, 0, false, var230);
                                            class148.field2341 = false;
                                        } else if (var230 == 0) {
                                            class113.method800((byte) -43);
                                            class148.field2341 = false;
                                        } else {
                                            class154.method1037(var230, -129);
                                        }
                                        class294.field4633 = var230;
                                    }
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6020) {
                                    var6--;
                                    int var231 = class79.field1318[var6];
                                    if (var231 < 0) {
                                        var231 = 0;
                                    }
                                    if (var231 > 127) {
                                        var231 = 127;
                                    }
                                    class86.field1445 = var231;
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    continue;
                                }
                                if (var517 == 6021) {
                                    var6--;
                                    class125.field1975 = class79.field1318[var6] == 1;
                                    class244.method1685(73);
                                    continue;
                                }
                                if (var517 == 6023) {
                                    boolean var232 = false;
                                    var6--;
                                    int var233 = class79.field1318[var6];
                                    if (var233 < 0) {
                                        var233 = 0;
                                    }
                                    if (var233 > 2) {
                                        var233 = 2;
                                    }
                                    if (class50.field741 < 96) {
                                        var232 = true;
                                        var233 = 0;
                                    }
                                    class67.method493(var233);
                                    class73.method531((byte) 8, class179.field2788);
                                    class216.field3351 = false;
                                    class79.field1318[var6++] = var232 ? 0 : 1;
                                    continue;
                                }
                                if (var517 == 6024) {
                                    var6--;
                                    int var234 = class79.field1318[var6];
                                    if (var234 < 0 || var234 > 2) {
                                        var234 = 0;
                                    }
                                    field2461 = var234;
                                    class73.method531((byte) 8, class179.field2788);
                                    continue;
                                }
                                if (var517 == 6027) {
                                    var6--;
                                    continue;
                                }
                                if (var517 == 6028) {
                                    var6--;
                                    class10.field171 = class79.field1318[var6] != 0;
                                    class73.method531((byte) 8, class179.field2788);
                                    continue;
                                }
                            } else if (var517 < 6200) {
                                if (var517 == 6101) {
                                    class79.field1318[var6++] = class50.field740;
                                    continue;
                                }
                                if (var517 == 6102) {
                                    class79.field1318[var6++] = class191.method1284(-110) ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6103) {
                                    class79.field1318[var6++] = class132.field2070 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6105) {
                                    class79.field1318[var6++] = class132.field2072 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6106) {
                                    class79.field1318[var6++] = class210.field3264 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6107) {
                                    class79.field1318[var6++] = class77.field1260 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6108) {
                                    class79.field1318[var6++] = class147.field2331 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6109) {
                                    class79.field1318[var6++] = class170.field2648 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6110) {
                                    class79.field1318[var6++] = class19.field291 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6111) {
                                    class79.field1318[var6++] = class190.field2948;
                                    continue;
                                }
                                if (var517 == 6112) {
                                    class79.field1318[var6++] = class197.field3116 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6114) {
                                    class79.field1318[var6++] = class293.field4622 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6115) {
                                    class79.field1318[var6++] = class179.field2790 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6116) {
                                    class79.field1318[var6++] = class180.field2815;
                                    continue;
                                }
                                if (var517 == 6117) {
                                    class79.field1318[var6++] = class155.field2407 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6118) {
                                    class79.field1318[var6++] = class18.field272;
                                    continue;
                                }
                                if (var517 == 6119) {
                                    class79.field1318[var6++] = class294.field4633;
                                    continue;
                                }
                                if (var517 == 6120) {
                                    class79.field1318[var6++] = class86.field1445;
                                    continue;
                                }
                                if (var517 == 6121) {
                                    class79.field1318[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 6123) {
                                    class79.field1318[var6++] = class67.method494();
                                    continue;
                                }
                                if (var517 == 6124) {
                                    class79.field1318[var6++] = field2461;
                                    continue;
                                }
                                if (var517 == 6126) {
                                    class79.field1318[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 6127) {
                                    class79.field1318[var6++] = class105.field1751 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6128) {
                                    class79.field1318[var6++] = class10.field171 ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 6300) {
                                if (var517 == 6200) {
                                    var6 -= 2;
                                    class166.field2594 = (short) class79.field1318[var6];
                                    if (class166.field2594 <= 0) {
                                        class166.field2594 = 256;
                                    }
                                    class194.field3072 = (short) class79.field1318[var6 + 1];
                                    if (class194.field3072 <= 0) {
                                        class194.field3072 = 205;
                                    }
                                    continue;
                                }
                                if (var517 == 6201) {
                                    var6 -= 2;
                                    class238.field3861 = (short) class79.field1318[var6];
                                    if (class238.field3861 <= 0) {
                                        class238.field3861 = 256;
                                    }
                                    class243.field3954 = (short) class79.field1318[var6 + 1];
                                    if (class243.field3954 <= 0) {
                                        class243.field3954 = 320;
                                    }
                                    continue;
                                }
                                if (var517 == 6202) {
                                    var6 -= 4;
                                    class239.field3878 = (short) class79.field1318[var6];
                                    if (class239.field3878 <= 0) {
                                        class239.field3878 = 1;
                                    }
                                    class170.field2654 = (short) class79.field1318[var6 + 1];
                                    if (class170.field2654 <= 0) {
                                        class170.field2654 = 32767;
                                    } else if (class239.field3878 > class170.field2654) {
                                        class170.field2654 = class239.field3878;
                                    }
                                    class213.field3319 = (short) class79.field1318[var6 + 2];
                                    if (class213.field3319 <= 0) {
                                        class213.field3319 = 1;
                                    }
                                    class16.field242 = (short) class79.field1318[var6 + 3];
                                    if (class16.field242 <= 0) {
                                        class16.field242 = 32767;
                                    } else if (class213.field3319 > class16.field242) {
                                        class16.field242 = class213.field3319;
                                    }
                                    continue;
                                }
                                if (var517 == 6203) {
                                    class268.method1804(false, arg1 ^ 0xFFFFEC10, 0, 0, class177.field2767.field3574, class177.field2767.field3625);
                                    class79.field1318[var6++] = class43.field620;
                                    class79.field1318[var6++] = class72.field1226;
                                    continue;
                                }
                                if (var517 == 6204) {
                                    class79.field1318[var6++] = class238.field3861;
                                    class79.field1318[var6++] = class243.field3954;
                                    continue;
                                }
                                if (var517 == 6205) {
                                    class79.field1318[var6++] = class166.field2594;
                                    class79.field1318[var6++] = class194.field3072;
                                    continue;
                                }
                            } else if (var517 < 6400) {
                                if (var517 == 6300) {
                                    class79.field1318[var6++] = (int) (class134.method924(false) / 60000L);
                                    continue;
                                }
                                if (var517 == 6301) {
                                    class79.field1318[var6++] = (int) (class134.method924(false) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var517 == 6302) {
                                    var6 -= 3;
                                    int var209 = class79.field1318[var6];
                                    int var210 = class79.field1318[var6 + 1];
                                    int var211 = class79.field1318[var6 + 2];
                                    class241.field3914.clear();
                                    class241.field3914.set(11, 12);
                                    class241.field3914.set(var211, var210, var209);
                                    class79.field1318[var6++] = (int) (class241.field3914.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var517 == 6303) {
                                    class241.field3914.clear();
                                    class241.field3914.setTime(new Date(class134.method924(false)));
                                    class79.field1318[var6++] = class241.field3914.get(1);
                                    continue;
                                }
                                if (var517 == 6304) {
                                    var6--;
                                    int var212 = class79.field1318[var6];
                                    boolean var213 = true;
                                    if (var212 < 0) {
                                        var213 = ((var212 + 1) % 4) == 0;
                                    } else if (var212 < 1582) {
                                        var213 = var212 % 4 == 0;
                                    } else if (var212 % 4 != 0) {
                                        var213 = false;
                                    } else if ((var212 % 100) != 0) {
                                        var213 = true;
                                    } else if ((var212 % 400) != 0) {
                                        var213 = false;
                                    }
                                    class79.field1318[var6++] = var213 ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 6500) {
                                if (var517 == 6405) {
                                    class79.field1318[var6++] = class176.method1194(0) ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6406) {
                                    class79.field1318[var6++] = class115.method814(class87.method619(arg1, 5012)) ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 6600) {
                                if (var517 == 6500) {
                                    if (class39.field551 == 10 && class3.field21 == 0 && class235.field3794 == 0 && class255.field4087 == 0) {
                                        class79.field1318[var6++] = class122.method844((byte) -86) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class79.field1318[var6++] = 1;
                                    continue;
                                }
                                if (var517 == 6501) {
                                    class284 var214 = class137.method930((byte) -3);
                                    if (var214 == null) {
                                        class79.field1318[var6++] = -1;
                                        class79.field1318[var6++] = 0;
                                        class90.field1577[var7++] = "";
                                        class79.field1318[var6++] = 0;
                                        class90.field1577[var7++] = "";
                                        class79.field1318[var6++] = 0;
                                    } else {
                                        class79.field1318[var6++] = var214.field4508;
                                        class79.field1318[var6++] = var214.field652;
                                        class90.field1577[var7++] = var214.field4507;
                                        class146 var215 = var214.method1907(0);
                                        class79.field1318[var6++] = var215.field2324;
                                        class90.field1577[var7++] = var215.field2320;
                                        class79.field1318[var6++] = var214.field651;
                                    }
                                    continue;
                                }
                                if (var517 == 6502) {
                                    class284 var216 = class218.method1468(arg1 + 5103);
                                    if (var216 == null) {
                                        class79.field1318[var6++] = -1;
                                        class79.field1318[var6++] = 0;
                                        class90.field1577[var7++] = "";
                                        class79.field1318[var6++] = 0;
                                        class90.field1577[var7++] = "";
                                        class79.field1318[var6++] = 0;
                                    } else {
                                        class79.field1318[var6++] = var216.field4508;
                                        class79.field1318[var6++] = var216.field652;
                                        class90.field1577[var7++] = var216.field4507;
                                        class146 var217 = var216.method1907(0);
                                        class79.field1318[var6++] = var217.field2324;
                                        class90.field1577[var7++] = var217.field2320;
                                        class79.field1318[var6++] = var216.field651;
                                    }
                                    continue;
                                }
                                if (var517 == 6503) {
                                    var6--;
                                    int var218 = class79.field1318[var6];
                                    if (class39.field551 == 10 && class3.field21 == 0 && class235.field3794 == 0 && class255.field4087 == 0) {
                                        class79.field1318[var6++] = class286.method1919(var218, 0) ? 1 : 0;
                                        continue;
                                    }
                                    class79.field1318[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 6504) {
                                    var6--;
                                    class112.field1839 = class79.field1318[var6];
                                    class73.method531((byte) 8, class179.field2788);
                                    continue;
                                }
                                if (var517 == 6505) {
                                    class79.field1318[var6++] = class112.field1839;
                                    continue;
                                }
                                if (var517 == 6506) {
                                    var6--;
                                    int var219 = class79.field1318[var6];
                                    class284 var220 = class112.method797(0, var219);
                                    if (var220 == null) {
                                        class79.field1318[var6++] = -1;
                                        class90.field1577[var7++] = "";
                                        class79.field1318[var6++] = 0;
                                        class90.field1577[var7++] = "";
                                        class79.field1318[var6++] = 0;
                                    } else {
                                        class79.field1318[var6++] = var220.field652;
                                        class90.field1577[var7++] = var220.field4507;
                                        class146 var221 = var220.method1907(arg1 + 5103);
                                        class79.field1318[var6++] = var221.field2324;
                                        class90.field1577[var7++] = var221.field2320;
                                        class79.field1318[var6++] = var220.field651;
                                    }
                                    continue;
                                }
                                if (var517 == 6507) {
                                    var6 -= 4;
                                    int var222 = class79.field1318[var6 + 2];
                                    boolean var223 = class79.field1318[var6 + 1] == 1;
                                    int var224 = class79.field1318[var6];
                                    boolean var225 = class79.field1318[var6 + 3] == 1;
                                    class121.method837(var222, var223, var224, var225, (byte) 81);
                                    continue;
                                }
                            } else if (var517 < 6700) {
                                if (var517 == 6600) {
                                    var6--;
                                    class109.field1782 = class79.field1318[var6] == 1;
                                    class73.method531((byte) 8, class179.field2788);
                                    continue;
                                }
                                if (var517 == 6601) {
                                    class79.field1318[var6++] = class109.field1782 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var517 == 4500) {
                            var6 -= 2;
                            int var353 = class79.field1318[var6];
                            int var354 = class79.field1318[var6 + 1];
                            class200 var355 = class250.method1716(var354, (byte) -78);
                            if (var355.method1356(true)) {
                                class90.field1577[var7++] = class200.method1353(26, var353).method545(var355.field3133, (byte) 18, var354);
                            } else {
                                class79.field1318[var6++] = class200.method1353(26, var353).method550(false, var354, var355.field3132);
                            }
                            continue;
                        }
                    } else if (var517 == 4300) {
                        var6 -= 2;
                        int var356 = class79.field1318[var6];
                        int var357 = class79.field1318[var6 + 1];
                        class200 var358 = class250.method1716(var357, (byte) -123);
                        if (var358.method1356(true)) {
                            class90.field1577[var7++] = class62.method469(var356, 101).method455(var357, var358.field3133, arg1 + 5103);
                        } else {
                            class79.field1318[var6++] = class62.method469(var356, -97).method452(-115, var358.field3132, var357);
                        }
                        continue;
                    }
                } else {
                    class228 var58;
                    if (var517 < 2000) {
                        var58 = var46 ? class24.field326 : class190.field2942;
                    } else {
                        var517 -= 1000;
                        var6--;
                        var58 = class84.method596((byte) 35, class79.field1318[var6]);
                    }
                    if (var517 == 1300) {
                        var6--;
                        int var59 = class79.field1318[var6] - 1;
                        if (var59 >= 0 && var59 <= 9) {
                            var7--;
                            var58.method1520(6415, class90.field1577[var7], var59);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var517 == 1301) {
                        var6 -= 2;
                        int var60 = class79.field1318[var6];
                        int var61 = class79.field1318[var6 + 1];
                        var58.field3568 = class31.method239(var61, arg1 ^ 0x13EE, var60);
                        continue;
                    }
                    if (var517 == 1302) {
                        var6--;
                        var58.field3472 = class79.field1318[var6] == 1;
                        continue;
                    }
                    if (var517 == 1303) {
                        var6--;
                        var58.field3492 = class79.field1318[var6];
                        continue;
                    }
                    if (var517 == 1304) {
                        var6--;
                        var58.field3501 = class79.field1318[var6];
                        continue;
                    }
                    if (var517 == 1305) {
                        var7--;
                        var58.field3592 = class90.field1577[var7];
                        continue;
                    }
                    if (var517 == 1306) {
                        var7--;
                        var58.field3607 = class90.field1577[var7];
                        continue;
                    }
                    if (var517 == 1307) {
                        var58.field3576 = null;
                        continue;
                    }
                    if (var517 == 1308) {
                        var6--;
                        var58.field3548 = class79.field1318[var6];
                        var6--;
                        var58.field3631 = class79.field1318[var6];
                        continue;
                    }
                    if (var517 == 1309) {
                        var6--;
                        int var62 = class79.field1318[var6];
                        var6--;
                        int var63 = class79.field1318[var6];
                        if (var63 >= 1 && var63 <= 10) {
                            var58.method1522(var63 - 1, -111, var62);
                        }
                        continue;
                    }
                    if (var517 == 1310) {
                        var7--;
                        var58.field3567 = class90.field1577[var7];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var516) {
            if (var5.field4014 == null) {
                if (class212.field3292 != 0) {
                    class81.method579(-1, "", 0, "Clientscript error - check log for details");
                }
                class168.method1130("CS2 - scr:" + var5.field2603 + " op:" + var9, var516, -99);
            } else {
                StringBuffer var513 = new StringBuffer(30);
                var513.append("%0a - in: ").append(var5.field4014);
                for (int var514 = class182.field2835 - 1; var514 >= 0; var514--) {
                    var513.append("%0a - via: ").append(class104.field1736[var514].field582.field4014);
                }
                if (var9 == 40) {
                    int var515 = var11[var8];
                    var513.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var515));
                }
                if (class212.field3292 != 0) {
                    class81.method579(arg1 + 5102, "", 0, "Clientscript error in: " + var5.field4014);
                }
                class168.method1130("CS2 - scr:" + var5.field2603 + " op:" + var9 + var513.toString(), var516, arg1 ^ 0x138B);
            }
        }
    }
}
