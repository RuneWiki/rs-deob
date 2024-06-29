import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class184 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public int field2910;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field2914 = 0;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Lub;")
    public static class92 field2902;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "[I")
    public static int[] field2913;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[[I")
    public static int[][] field2909;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public static final void method1316(byte arg0) {
        field2906++;
        if (!class162.field2438) {
            return;
        }
        if (arg0 != 126) {
            field2902 = null;
        }
        class222 var1 = class77.method605(class305.field4894, class84.field1258, (byte) -32);
        if (var1 != null && var1.field3546 != null) {
            class26 var2 = new class26();
            var2.field453 = var1;
            var2.field450 = var1.field3546;
            class15.method116(arg0 ^ 0x76, var2);
        }
        class114.field1755 = -1;
        class162.field2438 = false;
        class80.method628((byte) -73, var1);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V")
    private static final void method1317(int arg0, byte arg1) {
        field2912++;
        class69 var2 = class255.method1723((byte) 32, arg0, 4);
        var2.method554(2009563296);
        int var3 = -60 / ((89 - arg1) / 34);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZILlj;)V")
    public static final void method1318(boolean arg0, int arg1, class26 arg2) {
        field2905++;
        Object[] var3 = arg2.field450;
        int var4 = (Integer) var3[0];
        class219 var5 = class218.method1501(arg0, var4);
        if (var5 == null) {
            return;
        }
        class266.field4197 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field3347;
        int[] var10 = var5.field3344;
        byte var11 = -1;
        try {
            class7.field122 = new String[var5.field3345];
            class116.field1768 = new int[var5.field3346];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field442;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field449;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field453 == null ? -1 : arg2.field453.field3554;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field444;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field453 == null ? -1 : arg2.field453.field3411;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field443 == null ? -1 : arg2.field443.field3554;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field443 == null ? -1 : arg2.field443.field3411;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field448;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field456;
                    }
                    class116.field1768[var13++] = var16;
                } else if (var3[var14] instanceof String) {
                    String var15 = (String) var3[var14];
                    if (var15.equals("event_opbase")) {
                        var15 = arg2.field451;
                    }
                    class7.field122[var12++] = var15;
                }
            }
            int var17 = 0;
            label4090: while (true) {
                var17++;
                if (arg1 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var517 = var10[var8];
                if (var517 < 100) {
                    if (var517 == 0) {
                        class198.field3084[var6++] = var9[var8];
                        continue;
                    }
                    if (var517 == 1) {
                        int var18 = var9[var8];
                        class198.field3084[var6++] = class257.field4090[var18];
                        continue;
                    }
                    if (var517 == 2) {
                        int var19 = var9[var8];
                        var6--;
                        class200.method1413(class198.field3084[var6], var19, 107);
                        continue;
                    }
                    if (var517 == 3) {
                        class290.field4510[var7++] = var5.field3341[var8];
                        continue;
                    }
                    if (var517 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var517 == 7) {
                        var6 -= 2;
                        if (class198.field3084[var6 + 1] != class198.field3084[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 8) {
                        var6 -= 2;
                        if (class198.field3084[var6 + 1] == class198.field3084[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 9) {
                        var6 -= 2;
                        if (class198.field3084[var6 + 1] > class198.field3084[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 10) {
                        var6 -= 2;
                        if (class198.field3084[var6] > class198.field3084[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 21) {
                        if (class266.field4197 == 0) {
                            return;
                        }
                        class284 var20 = class297.field4784[--class266.field4197];
                        var8 = var20.field4469;
                        var5 = var20.field4472;
                        class7.field122 = var20.field4477;
                        var9 = var5.field3347;
                        class116.field1768 = var20.field4473;
                        var10 = var5.field3344;
                        continue;
                    }
                    if (var517 == 25) {
                        int var21 = var9[var8];
                        class198.field3084[var6++] = class41.method362(var21, (byte) -118);
                        continue;
                    }
                    if (var517 == 27) {
                        int var22 = var9[var8];
                        var6--;
                        class102.method781(var22, class198.field3084[var6], 125);
                        continue;
                    }
                    if (var517 == 31) {
                        var6 -= 2;
                        if (class198.field3084[var6] <= class198.field3084[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 32) {
                        var6 -= 2;
                        if (class198.field3084[var6 + 1] <= class198.field3084[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 33) {
                        class198.field3084[var6++] = class116.field1768[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var517 == 34) {
                        var10001 = var9[var8];
                        var6--;
                        class116.field1768[var10001] = class198.field3084[var6];
                        continue;
                    }
                    if (var517 == 35) {
                        class290.field4510[var7++] = class7.field122[var9[var8]];
                        continue;
                    }
                    if (var517 == 36) {
                        var10001 = var9[var8];
                        var7--;
                        class7.field122[var10001] = class290.field4510[var7];
                        continue;
                    }
                    if (var517 == 37) {
                        int var23 = var9[var8];
                        var7 -= var23;
                        String var24 = class194.method1377(var23, var7, class290.field4510, (byte) 98);
                        class290.field4510[var7++] = var24;
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
                        int var25 = var9[var8];
                        class219 var26 = class218.method1501(arg0, var25);
                        String[] var27 = new String[var26.field3345];
                        int[] var28 = new int[var26.field3346];
                        for (int var29 = 0; var29 < var26.field3338; var29++) {
                            var28[var29] = class198.field3084[var6 + var29 - var26.field3338];
                        }
                        for (int var30 = 0; var30 < var26.field3336; var30++) {
                            var27[var30] = class290.field4510[var30 + var7 - var26.field3336];
                        }
                        var7 -= var26.field3336;
                        var6 -= var26.field3338;
                        class284 var31 = new class284();
                        var31.field4469 = var8;
                        var31.field4473 = class116.field1768;
                        var31.field4472 = var5;
                        var31.field4477 = class7.field122;
                        if (class266.field4197 >= class297.field4784.length) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        class297.field4784[class266.field4197++] = var31;
                        class116.field1768 = var28;
                        class7.field122 = var27;
                        var5 = var26;
                        var9 = var26.field3347;
                        var10 = var26.field3344;
                        continue;
                    }
                    if (var517 == 42) {
                        class198.field3084[var6++] = class205.field3155[var9[var8]];
                        continue;
                    }
                    if (var517 == 43) {
                        int var32 = var9[var8];
                        var6--;
                        class205.field3155[var32] = class198.field3084[var6];
                        class169.method1218(1, var32);
                        continue;
                    }
                    if (var517 == 44) {
                        int var33 = var9[var8] >> 16;
                        int var34 = var9[var8] & 0xFFFF;
                        var6--;
                        int var35 = class198.field3084[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class286.field4492[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label4090;
                                }
                                class43.field723[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 45) {
                        var6--;
                        int var38 = class198.field3084[var6];
                        int var39 = var9[var8];
                        if (var38 >= 0 && class286.field4492[var39] > var38) {
                            class198.field3084[var6++] = class43.field723[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 46) {
                        var6 -= 2;
                        int var40 = var9[var8];
                        int var41 = class198.field3084[var6];
                        if (var41 >= 0 && var41 < class286.field4492[var40]) {
                            class43.field723[var40][var41] = class198.field3084[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 47) {
                        String var42 = class2.field30[var9[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class290.field4510[var7++] = var42;
                        continue;
                    }
                    if (var517 == 48) {
                        int var43 = var9[var8];
                        var7--;
                        class2.field30[var43] = class290.field4510[var7];
                        class9.method56(var43, -22840);
                        continue;
                    }
                    if (var517 == 51) {
                        class305 var44 = var5.field3339[var9[var8]];
                        var6--;
                        class283 var45 = (class283) var44.method2043((long) class198.field3084[var6], -1);
                        if (var45 != null) {
                            var8 += var45.field4457;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var517 < 300) {
                    if (var517 == 100) {
                        var6 -= 3;
                        int var497 = class198.field3084[var6 + 1];
                        int var498 = class198.field3084[var6 + 2];
                        int var499 = class198.field3084[var6];
                        if (var497 == 0) {
                            throw new RuntimeException();
                        }
                        class222 var500 = class169.method1217(var499, 12180);
                        if (var500.field3526 == null) {
                            var500.field3526 = new class222[var498 + 1];
                        }
                        if (var498 >= var500.field3526.length) {
                            class222[] var501 = new class222[var498 + 1];
                            for (int var502 = 0; var502 < var500.field3526.length; var502++) {
                                var501[var502] = var500.field3526[var502];
                            }
                            var500.field3526 = var501;
                        }
                        if (var498 > 0 && var500.field3526[var498 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var498 - 1));
                        }
                        class222 var503 = new class222();
                        var503.field3441 = true;
                        var503.field3392 = var503.field3554 = var500.field3554;
                        var503.field3552 = var497;
                        var503.field3411 = var498;
                        var500.field3526[var498] = var503;
                        if (var46) {
                            class307.field4922 = var503;
                        } else {
                            class300.field4828 = var503;
                        }
                        class80.method628((byte) -83, var500);
                        continue;
                    }
                    if (var517 == 101) {
                        class222 var504 = var46 ? class307.field4922 : class300.field4828;
                        if (var504.field3411 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class222 var505 = class169.method1217(var504.field3554, 12180);
                        var505.field3526[var504.field3411] = null;
                        class80.method628((byte) -73, var505);
                        continue;
                    }
                    if (var517 == 102) {
                        var6--;
                        class222 var506 = class169.method1217(class198.field3084[var6], 12180);
                        var506.field3526 = null;
                        class80.method628((byte) -108, var506);
                        continue;
                    }
                    if (var517 == 200) {
                        var6 -= 2;
                        int var507 = class198.field3084[var6];
                        int var508 = class198.field3084[var6 + 1];
                        class222 var509 = class77.method605(var508, var507, (byte) -32);
                        if (var509 != null && var508 != -1) {
                            class198.field3084[var6++] = 1;
                            if (var46) {
                                class307.field4922 = var509;
                            } else {
                                class300.field4828 = var509;
                            }
                            continue;
                        }
                        class198.field3084[var6++] = 0;
                        continue;
                    }
                    if (var517 == 201) {
                        var6--;
                        int var510 = class198.field3084[var6];
                        class222 var511 = class169.method1217(var510, 12180);
                        if (var511 == null) {
                            class198.field3084[var6++] = 0;
                        } else {
                            class198.field3084[var6++] = 1;
                            if (var46) {
                                class307.field4922 = var511;
                            } else {
                                class300.field4828 = var511;
                            }
                        }
                        continue;
                    }
                } else if (var517 < 500) {
                    if (var517 == 403) {
                        var6 -= 2;
                        int var490 = class198.field3084[var6];
                        int var491 = class198.field3084[var6 + 1];
                        for (int var492 = 0; var492 < class206.field3170.length; var492++) {
                            if (class206.field3170[var492] == var490) {
                                class263.field4168.field2044.method1328(var492, -5934, var491);
                                continue label4090;
                            }
                        }
                        int var493 = 0;
                        while (true) {
                            if (var493 >= client.field2388.length) {
                                continue label4090;
                            }
                            if (client.field2388[var493] == var490) {
                                class263.field4168.field2044.method1328(var493, -5934, var491);
                                continue label4090;
                            }
                            var493++;
                        }
                    }
                    if (var517 == 404) {
                        var6 -= 2;
                        int var494 = class198.field3084[var6 + 1];
                        int var495 = class198.field3084[var6];
                        class263.field4168.field2044.method1330((byte) -120, var495, var494);
                        continue;
                    }
                    if (var517 == 410) {
                        var6--;
                        boolean var496 = class198.field3084[var6] != 0;
                        class263.field4168.field2044.method1325((byte) -43, var496);
                        continue;
                    }
                } else if (!(var517 < 1000 || var517 >= 1100) || !(var517 < 2000 || var517 >= 2100)) {
                    class222 var484;
                    if (var517 >= 2000) {
                        var517 -= 1000;
                        var6--;
                        var484 = class169.method1217(class198.field3084[var6], 12180);
                    } else {
                        var484 = var46 ? class307.field4922 : class300.field4828;
                    }
                    if (var517 == 1000) {
                        var6 -= 4;
                        var484.field3564 = class198.field3084[var6];
                        var484.field3508 = class198.field3084[var6 + 1];
                        int var485 = class198.field3084[var6 + 2];
                        if (var485 < 0) {
                            var485 = 0;
                        } else if (var485 > 5) {
                            var485 = 5;
                        }
                        int var486 = class198.field3084[var6 + 3];
                        if (var486 < 0) {
                            var486 = 0;
                        } else if (var486 > 5) {
                            var486 = 5;
                        }
                        var484.field3387 = (byte) var486;
                        var484.field3445 = (byte) var485;
                        class80.method628((byte) -87, var484);
                        class211.method1469(true, var484);
                        if (var484.field3411 == -1) {
                            class196.method1397(var484.field3554, 984031332);
                        }
                        continue;
                    }
                    if (var517 == 1001) {
                        var6 -= 4;
                        var484.field3487 = class198.field3084[var6];
                        var484.field3479 = class198.field3084[var6 + 1];
                        var484.field3449 = 0;
                        var484.field3458 = 0;
                        int var487 = class198.field3084[var6 + 2];
                        int var488 = class198.field3084[var6 + 3];
                        if (var488 < 0) {
                            var488 = 0;
                        } else if (var488 > 4) {
                            var488 = 4;
                        }
                        if (var487 < 0) {
                            var487 = 0;
                        } else if (var487 > 4) {
                            var487 = 4;
                        }
                        var484.field3398 = (byte) var488;
                        var484.field3428 = (byte) var487;
                        class80.method628((byte) -121, var484);
                        class211.method1469(!arg0, var484);
                        if (var484.field3552 == 0) {
                            class305.method2041(var484, -9, false);
                        }
                        continue;
                    }
                    if (var517 == 1003) {
                        var6--;
                        boolean var489 = class198.field3084[var6] == 1;
                        if (var489 != var484.field3535) {
                            var484.field3535 = var489;
                            class80.method628((byte) -71, var484);
                        }
                        if (var484.field3411 == -1) {
                            class235.method1614(var484.field3554, 125);
                        }
                        continue;
                    }
                    if (var517 == 1004) {
                        var6 -= 2;
                        var484.field3437 = class198.field3084[var6];
                        var484.field3390 = class198.field3084[var6 + 1];
                        class80.method628((byte) -71, var484);
                        class211.method1469(true, var484);
                        if (var484.field3552 == 0) {
                            class305.method2041(var484, -119, false);
                        }
                        continue;
                    }
                    if (var517 == 1005) {
                        var6--;
                        var484.field3469 = class198.field3084[var6] == 1;
                        continue;
                    }
                } else if (var517 >= 1100 && var517 < 1200 || var517 >= 2100 && var517 < 2200) {
                    class222 var47;
                    if (var517 < 2000) {
                        var47 = var46 ? class307.field4922 : class300.field4828;
                    } else {
                        var6--;
                        var47 = class169.method1217(class198.field3084[var6], 12180);
                        var517 -= 1000;
                    }
                    if (var517 == 1100) {
                        var6 -= 2;
                        var47.field3563 = class198.field3084[var6];
                        if (var47.field3563 > (var47.field3443 - var47.field3408)) {
                            var47.field3563 = var47.field3443 - var47.field3408;
                        }
                        if (var47.field3563 < 0) {
                            var47.field3563 = 0;
                        }
                        var47.field3569 = class198.field3084[var6 + 1];
                        if (var47.field3569 > var47.field3460 - var47.field3561) {
                            var47.field3569 = var47.field3460 - var47.field3561;
                        }
                        if (var47.field3569 < 0) {
                            var47.field3569 = 0;
                        }
                        class80.method628((byte) -83, var47);
                        if (var47.field3411 == -1) {
                            class188.method1345(12, var47.field3554);
                        }
                        continue;
                    }
                    if (var517 == 1101) {
                        var6--;
                        var47.field3522 = class198.field3084[var6];
                        class80.method628((byte) -87, var47);
                        if (var47.field3411 == -1) {
                            class264.method1774(var47.field3554, (byte) 115);
                        }
                        continue;
                    }
                    if (var517 == 1102) {
                        var6--;
                        var47.field3499 = class198.field3084[var6] == 1;
                        class80.method628((byte) -128, var47);
                        continue;
                    }
                    if (var517 == 1103) {
                        var6--;
                        var47.field3525 = class198.field3084[var6];
                        class80.method628((byte) -128, var47);
                        continue;
                    }
                    if (var517 == 1104) {
                        var6--;
                        var47.field3405 = class198.field3084[var6];
                        class80.method628((byte) -64, var47);
                        continue;
                    }
                    if (var517 == 1105) {
                        var6--;
                        var47.field3427 = class198.field3084[var6];
                        class80.method628((byte) -70, var47);
                        continue;
                    }
                    if (var517 == 1106) {
                        var6--;
                        var47.field3493 = class198.field3084[var6];
                        class80.method628((byte) -92, var47);
                        continue;
                    }
                    if (var517 == 1107) {
                        var6--;
                        var47.field3409 = class198.field3084[var6] == 1;
                        class80.method628((byte) -101, var47);
                        continue;
                    }
                    if (var517 == 1108) {
                        var47.field3432 = 1;
                        var6--;
                        var47.field3524 = class198.field3084[var6];
                        class80.method628((byte) -76, var47);
                        if (var47.field3411 == -1) {
                            method1317(var47.field3554, (byte) 124);
                        }
                        continue;
                    }
                    if (var517 == 1109) {
                        var6 -= 6;
                        var47.field3414 = class198.field3084[var6];
                        var47.field3386 = class198.field3084[var6 + 1];
                        var47.field3406 = class198.field3084[var6 + 2];
                        var47.field3448 = class198.field3084[var6 + 3];
                        var47.field3456 = class198.field3084[var6 + 4];
                        var47.field3450 = class198.field3084[var6 + 5];
                        class80.method628((byte) -126, var47);
                        if (var47.field3411 == -1) {
                            class191.method1357(var47.field3554, false);
                            class140.method1025(10, var47.field3554);
                        }
                        continue;
                    }
                    if (var517 == 1110) {
                        var6--;
                        int var48 = class198.field3084[var6];
                        if (var47.field3462 != var48) {
                            var47.field3442 = 0;
                            var47.field3470 = 1;
                            var47.field3462 = var48;
                            var47.field3498 = 0;
                            class80.method628((byte) -78, var47);
                        }
                        if (var47.field3411 == -1) {
                            client.method1145(82, var47.field3554);
                        }
                        continue;
                    }
                    if (var517 == 1111) {
                        var6--;
                        var47.field3399 = class198.field3084[var6] == 1;
                        class80.method628((byte) -70, var47);
                        continue;
                    }
                    if (var517 == 1112) {
                        var7--;
                        String var49 = class290.field4510[var7];
                        if (!var49.equals(var47.field3544)) {
                            var47.field3544 = var49;
                            class80.method628((byte) -124, var47);
                        }
                        if (var47.field3411 == -1) {
                            class113.method840(var47.field3554, 109);
                        }
                        continue;
                    }
                    if (var517 == 1113) {
                        var6--;
                        var47.field3490 = class198.field3084[var6];
                        class80.method628((byte) -102, var47);
                        continue;
                    }
                    if (var517 == 1114) {
                        var6 -= 3;
                        var47.field3562 = class198.field3084[var6];
                        var47.field3473 = class198.field3084[var6 + 1];
                        var47.field3468 = class198.field3084[var6 + 2];
                        class80.method628((byte) -123, var47);
                        continue;
                    }
                    if (var517 == 1115) {
                        var6--;
                        var47.field3520 = class198.field3084[var6] == 1;
                        class80.method628((byte) -96, var47);
                        continue;
                    }
                    if (var517 == 1116) {
                        var6--;
                        var47.field3559 = class198.field3084[var6];
                        class80.method628((byte) -98, var47);
                        continue;
                    }
                    if (var517 == 1117) {
                        var6--;
                        var47.field3423 = class198.field3084[var6];
                        class80.method628((byte) -114, var47);
                        continue;
                    }
                    if (var517 == 1118) {
                        var6--;
                        var47.field3418 = class198.field3084[var6] == 1;
                        class80.method628((byte) -124, var47);
                        continue;
                    }
                    if (var517 == 1119) {
                        var6--;
                        var47.field3510 = class198.field3084[var6] == 1;
                        class80.method628((byte) -125, var47);
                        continue;
                    }
                    if (var517 == 1120) {
                        var6 -= 2;
                        var47.field3443 = class198.field3084[var6];
                        var47.field3460 = class198.field3084[var6 + 1];
                        class80.method628((byte) -101, var47);
                        if (var47.field3552 == 0) {
                            class305.method2041(var47, 108, false);
                        }
                        continue;
                    }
                    if (var517 == 1121) {
                        var6 -= 2;
                        class80.method628((byte) -78, var47);
                        continue;
                    }
                    if (var517 == 1122) {
                        var6--;
                        var47.field3560 = class198.field3084[var6] == 1;
                        class80.method628((byte) -96, var47);
                        continue;
                    }
                    if (var517 == 1123) {
                        var6--;
                        var47.field3450 = class198.field3084[var6];
                        class80.method628((byte) -117, var47);
                        if (var47.field3411 == -1) {
                            class191.method1357(var47.field3554, false);
                        }
                        continue;
                    }
                    if (var517 == 1124) {
                        var6--;
                        int var50 = class198.field3084[var6];
                        var47.field3488 = var50 == 1;
                        class80.method628((byte) -73, var47);
                        continue;
                    }
                } else if (var517 >= 1200 && var517 < 1300 || var517 >= 2200 && var517 < 2300) {
                    class222 var480;
                    if (var517 < 2000) {
                        var480 = var46 ? class307.field4922 : class300.field4828;
                    } else {
                        var517 -= 1000;
                        var6--;
                        var480 = class169.method1217(class198.field3084[var6], 12180);
                    }
                    class80.method628((byte) -99, var480);
                    if (var517 == 1200 || var517 == 1205 || var517 == 1208 || var517 == 1209) {
                        var6 -= 2;
                        int var481 = class198.field3084[var6];
                        int var482 = class198.field3084[var6 + 1];
                        if (var480.field3411 == -1) {
                            class131.method970(true, var480.field3554);
                            class191.method1357(var480.field3554, false);
                            class140.method1025(10, var480.field3554);
                        }
                        if (var481 == -1) {
                            var480.field3391 = -1;
                            var480.field3432 = 1;
                            var480.field3524 = -1;
                            continue;
                        }
                        var480.field3391 = var481;
                        if (var517 == 1208 || var517 == 1209) {
                            var480.field3463 = true;
                        } else {
                            var480.field3463 = false;
                        }
                        var480.field3551 = var482;
                        class179 var483 = class123.method929(22497, var481);
                        if (var517 == 1205) {
                            var480.field3529 = false;
                        } else {
                            var480.field3529 = true;
                        }
                        var480.field3406 = var483.field2787;
                        var480.field3386 = var483.field2794;
                        var480.field3450 = var483.field2752;
                        var480.field3414 = var483.field2803;
                        var480.field3456 = var483.field2809;
                        if (var480.field3458 > 0) {
                            var480.field3450 = var480.field3450 * 32 / var480.field3458;
                        } else if (var480.field3487 > 0) {
                            var480.field3450 = var480.field3450 * 32 / var480.field3487;
                        }
                        var480.field3448 = var483.field2750;
                        continue;
                    }
                    if (var517 == 1201) {
                        var480.field3432 = 2;
                        var6--;
                        var480.field3524 = class198.field3084[var6];
                        if (var480.field3411 == -1) {
                            method1317(var480.field3554, (byte) 126);
                        }
                        continue;
                    }
                    if (var517 == 1202) {
                        var480.field3432 = 3;
                        var480.field3524 = class263.field4168.field2044.method1322(-44);
                        if (var480.field3411 == -1) {
                            method1317(var480.field3554, (byte) -59);
                        }
                        continue;
                    }
                    if (var517 == 1203) {
                        var480.field3432 = 6;
                        var6--;
                        var480.field3524 = class198.field3084[var6];
                        if (var480.field3411 == -1) {
                            method1317(var480.field3554, (byte) 125);
                        }
                        continue;
                    }
                    if (var517 == 1204) {
                        var480.field3432 = 5;
                        var6--;
                        var480.field3524 = class198.field3084[var6];
                        if (var480.field3411 == -1) {
                            method1317(var480.field3554, (byte) 127);
                        }
                        continue;
                    }
                    if (var517 == 1206) {
                        var6 -= 4;
                        var480.field3527 = class198.field3084[var6];
                        var480.field3400 = class198.field3084[var6 + 1];
                        var480.field3530 = class198.field3084[var6 + 2];
                        var480.field3417 = class198.field3084[var6 + 3];
                        class80.method628((byte) -86, var480);
                        continue;
                    }
                    if (var517 == 1207) {
                        var6 -= 2;
                        var480.field3465 = class198.field3084[var6];
                        var480.field3534 = class198.field3084[var6 + 1];
                        class80.method628((byte) -90, var480);
                        continue;
                    }
                } else if (var517 >= 1300 && var517 < 1400 || var517 >= 2300 && var517 < 2400) {
                    class222 var51;
                    if (var517 < 2000) {
                        var51 = var46 ? class307.field4922 : class300.field4828;
                    } else {
                        var6--;
                        var51 = class169.method1217(class198.field3084[var6], 12180);
                        var517 -= 1000;
                    }
                    if (var517 == 1300) {
                        var6--;
                        int var52 = class198.field3084[var6] - 1;
                        if (var52 >= 0 && var52 <= 9) {
                            var7--;
                            var51.method1521(class290.field4510[var7], -7, var52);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var517 == 1301) {
                        var6 -= 2;
                        int var53 = class198.field3084[var6];
                        int var54 = class198.field3084[var6 + 1];
                        var51.field3451 = class77.method605(var54, var53, (byte) -32);
                        continue;
                    }
                    if (var517 == 1302) {
                        var6--;
                        var51.field3497 = class198.field3084[var6] == 1;
                        continue;
                    }
                    if (var517 == 1303) {
                        var6--;
                        var51.field3480 = class198.field3084[var6];
                        continue;
                    }
                    if (var517 == 1304) {
                        var6--;
                        var51.field3509 = class198.field3084[var6];
                        continue;
                    }
                    if (var517 == 1305) {
                        var7--;
                        var51.field3537 = class290.field4510[var7];
                        continue;
                    }
                    if (var517 == 1306) {
                        var7--;
                        var51.field3471 = class290.field4510[var7];
                        continue;
                    }
                    if (var517 == 1307) {
                        var51.field3549 = null;
                        continue;
                    }
                    if (var517 == 1308) {
                        var6--;
                        var51.field3550 = class198.field3084[var6];
                        var6--;
                        var51.field3545 = class198.field3084[var6];
                        continue;
                    }
                    if (var517 == 1309) {
                        var6--;
                        int var55 = class198.field3084[var6];
                        var6--;
                        int var56 = class198.field3084[var6];
                        if (var56 >= 1 && var56 <= 10) {
                            var51.method1523(-13090, var56 - 1, var55);
                        }
                        continue;
                    }
                    if (var517 == 1310) {
                        var7--;
                        var51.field3496 = class290.field4510[var7];
                        continue;
                    }
                } else {
                    if (var517 >= 1400 && var517 < 1500 || var517 >= 2400 && var517 < 2500) {
                        class222 var57;
                        if (var517 < 2000) {
                            var57 = var46 ? class307.field4922 : class300.field4828;
                        } else {
                            var517 -= 1000;
                            var6--;
                            var57 = class169.method1217(class198.field3084[var6], 12180);
                        }
                        int[] var58 = null;
                        var7--;
                        String var59 = class290.field4510[var7];
                        if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                            var6--;
                            int var60 = class198.field3084[var6];
                            if (var60 > 0) {
                                var58 = new int[var60];
                                while (var60-- > 0) {
                                    var6--;
                                    var58[var60] = class198.field3084[var6];
                                }
                            }
                            var59 = var59.substring(0, var59.length() - 1);
                        }
                        Object[] var61 = new Object[var59.length() + 1];
                        for (int var62 = var61.length - 1; var62 >= 1; var62--) {
                            if (var59.charAt(var62 - 1) == 's') {
                                var7--;
                                var61[var62] = class290.field4510[var7];
                            } else {
                                var6--;
                                var61[var62] = Integer.valueOf(class198.field3084[var6]);
                            }
                        }
                        var6--;
                        int var63 = class198.field3084[var6];
                        if (var63 == -1) {
                            var61 = null;
                        } else {
                            var61[0] = Integer.valueOf(var63);
                        }
                        var57.field3513 = true;
                        if (var517 == 1400) {
                            var57.field3514 = var61;
                        } else if (var517 == 1401) {
                            var57.field3533 = var61;
                        } else if (var517 == 1402) {
                            var57.field3475 = var61;
                        } else if (var517 == 1403) {
                            var57.field3395 = var61;
                        } else if (var517 == 1404) {
                            var57.field3491 = var61;
                        } else if (var517 == 1405) {
                            var57.field3516 = var61;
                        } else if (var517 == 1406) {
                            var57.field3546 = var61;
                        } else if (var517 == 1407) {
                            var57.field3548 = var61;
                            var57.field3444 = var58;
                        } else if (var517 == 1408) {
                            var57.field3464 = var61;
                        } else if (var517 == 1409) {
                            var57.field3519 = var61;
                        } else if (var517 == 1410) {
                            var57.field3495 = var61;
                        } else if (var517 == 1411) {
                            var57.field3396 = var61;
                        } else if (var517 == 1412) {
                            var57.field3434 = var61;
                        } else if (var517 == 1414) {
                            var57.field3507 = var58;
                            var57.field3440 = var61;
                        } else if (var517 == 1415) {
                            var57.field3466 = var61;
                            var57.field3504 = var58;
                        } else if (var517 == 1416) {
                            var57.field3419 = var61;
                        } else if (var517 == 1417) {
                            var57.field3506 = var61;
                        } else if (var517 == 1418) {
                            var57.field3474 = var61;
                        } else if (var517 == 1419) {
                            var57.field3461 = var61;
                        } else if (var517 == 1420) {
                            var57.field3501 = var61;
                        } else if (var517 == 1421) {
                            var57.field3481 = var61;
                        } else if (var517 == 1422) {
                            var57.field3415 = var61;
                        } else if (var517 == 1423) {
                            var57.field3455 = var61;
                        } else if (var517 == 1424) {
                            var57.field3528 = var61;
                        } else if (var517 == 1425) {
                            var57.field3389 = var61;
                        } else if (var517 == 1426) {
                            var57.field3565 = var61;
                        } else if (var517 == 1427) {
                            var57.field3435 = var61;
                        } else if (var517 == 1428) {
                            var57.field3484 = var58;
                            var57.field3446 = var61;
                        } else if (var517 == 1429) {
                            var57.field3413 = var61;
                            var57.field3447 = var58;
                        }
                        continue;
                    }
                    if (var517 < 1600) {
                        class222 var479 = var46 ? class307.field4922 : class300.field4828;
                        if (var517 == 1500) {
                            class198.field3084[var6++] = var479.field3515;
                            continue;
                        }
                        if (var517 == 1501) {
                            class198.field3084[var6++] = var479.field3401;
                            continue;
                        }
                        if (var517 == 1502) {
                            class198.field3084[var6++] = var479.field3408;
                            continue;
                        }
                        if (var517 == 1503) {
                            class198.field3084[var6++] = var479.field3561;
                            continue;
                        }
                        if (var517 == 1504) {
                            class198.field3084[var6++] = var479.field3535 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 1505) {
                            class198.field3084[var6++] = var479.field3392;
                            continue;
                        }
                    } else if (var517 < 1700) {
                        class222 var478 = var46 ? class307.field4922 : class300.field4828;
                        if (var517 == 1600) {
                            class198.field3084[var6++] = var478.field3563;
                            continue;
                        }
                        if (var517 == 1601) {
                            class198.field3084[var6++] = var478.field3569;
                            continue;
                        }
                        if (var517 == 1602) {
                            class290.field4510[var7++] = var478.field3544;
                            continue;
                        }
                        if (var517 == 1603) {
                            class198.field3084[var6++] = var478.field3443;
                            continue;
                        }
                        if (var517 == 1604) {
                            class198.field3084[var6++] = var478.field3460;
                            continue;
                        }
                        if (var517 == 1605) {
                            class198.field3084[var6++] = var478.field3450;
                            continue;
                        }
                        if (var517 == 1606) {
                            class198.field3084[var6++] = var478.field3406;
                            continue;
                        }
                        if (var517 == 1607) {
                            class198.field3084[var6++] = var478.field3456;
                            continue;
                        }
                        if (var517 == 1608) {
                            class198.field3084[var6++] = var478.field3448;
                            continue;
                        }
                        if (var517 == 1609) {
                            class198.field3084[var6++] = var478.field3525;
                            continue;
                        }
                        if (var517 == 1610) {
                            class198.field3084[var6++] = var478.field3414;
                            continue;
                        }
                        if (var517 == 1611) {
                            class198.field3084[var6++] = var478.field3386;
                            continue;
                        }
                        if (var517 == 1612) {
                            class198.field3084[var6++] = var478.field3427;
                            continue;
                        }
                    } else if (var517 < 1800) {
                        class222 var477 = var46 ? class307.field4922 : class300.field4828;
                        if (var517 == 1700) {
                            class198.field3084[var6++] = var477.field3391;
                            continue;
                        }
                        if (var517 == 1701) {
                            if (var477.field3391 == -1) {
                                class198.field3084[var6++] = 0;
                            } else {
                                class198.field3084[var6++] = var477.field3551;
                            }
                            continue;
                        }
                        if (var517 == 1702) {
                            class198.field3084[var6++] = var477.field3411;
                            continue;
                        }
                    } else if (var517 < 1900) {
                        class222 var475 = var46 ? class307.field4922 : class300.field4828;
                        if (var517 == 1800) {
                            class198.field3084[var6++] = client.method1159(var475).method232(119);
                            continue;
                        }
                        if (var517 == 1801) {
                            var6--;
                            int var476 = class198.field3084[var6];
                            int var519 = var476 - 1;
                            if (var475.field3549 != null && var475.field3549.length > var519 && var475.field3549[var519] != null) {
                                class290.field4510[var7++] = var475.field3549[var519];
                                continue;
                            }
                            class290.field4510[var7++] = "";
                            continue;
                        }
                        if (var517 == 1802) {
                            if (var475.field3537 == null) {
                                class290.field4510[var7++] = "";
                            } else {
                                class290.field4510[var7++] = var475.field3537;
                            }
                            continue;
                        }
                    } else if (var517 < 2600) {
                        var6--;
                        class222 var474 = class169.method1217(class198.field3084[var6], 12180);
                        if (var517 == 2500) {
                            class198.field3084[var6++] = var474.field3515;
                            continue;
                        }
                        if (var517 == 2501) {
                            class198.field3084[var6++] = var474.field3401;
                            continue;
                        }
                        if (var517 == 2502) {
                            class198.field3084[var6++] = var474.field3408;
                            continue;
                        }
                        if (var517 == 2503) {
                            class198.field3084[var6++] = var474.field3561;
                            continue;
                        }
                        if (var517 == 2504) {
                            class198.field3084[var6++] = var474.field3535 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 2505) {
                            class198.field3084[var6++] = var474.field3392;
                            continue;
                        }
                    } else if (var517 < 2700) {
                        var6--;
                        class222 var473 = class169.method1217(class198.field3084[var6], 12180);
                        if (var517 == 2600) {
                            class198.field3084[var6++] = var473.field3563;
                            continue;
                        }
                        if (var517 == 2601) {
                            class198.field3084[var6++] = var473.field3569;
                            continue;
                        }
                        if (var517 == 2602) {
                            class290.field4510[var7++] = var473.field3544;
                            continue;
                        }
                        if (var517 == 2603) {
                            class198.field3084[var6++] = var473.field3443;
                            continue;
                        }
                        if (var517 == 2604) {
                            class198.field3084[var6++] = var473.field3460;
                            continue;
                        }
                        if (var517 == 2605) {
                            class198.field3084[var6++] = var473.field3450;
                            continue;
                        }
                        if (var517 == 2606) {
                            class198.field3084[var6++] = var473.field3406;
                            continue;
                        }
                        if (var517 == 2607) {
                            class198.field3084[var6++] = var473.field3456;
                            continue;
                        }
                        if (var517 == 2608) {
                            class198.field3084[var6++] = var473.field3448;
                            continue;
                        }
                        if (var517 == 2609) {
                            class198.field3084[var6++] = var473.field3525;
                            continue;
                        }
                        if (var517 == 2610) {
                            class198.field3084[var6++] = var473.field3414;
                            continue;
                        }
                        if (var517 == 2611) {
                            class198.field3084[var6++] = var473.field3386;
                            continue;
                        }
                        if (var517 == 2612) {
                            class198.field3084[var6++] = var473.field3427;
                            continue;
                        }
                    } else if (var517 < 2800) {
                        if (var517 == 2700) {
                            var6--;
                            class222 var64 = class169.method1217(class198.field3084[var6], 12180);
                            class198.field3084[var6++] = var64.field3391;
                            continue;
                        }
                        if (var517 == 2701) {
                            var6--;
                            class222 var65 = class169.method1217(class198.field3084[var6], 12180);
                            if (var65.field3391 == -1) {
                                class198.field3084[var6++] = 0;
                            } else {
                                class198.field3084[var6++] = var65.field3551;
                            }
                            continue;
                        }
                        if (var517 == 2702) {
                            var6--;
                            int var66 = class198.field3084[var6];
                            class288 var67 = (class288) class48.field787.method2043((long) var66, -1);
                            if (var67 == null) {
                                class198.field3084[var6++] = 0;
                            } else {
                                class198.field3084[var6++] = 1;
                            }
                            continue;
                        }
                        if (var517 == 2703) {
                            var6--;
                            class222 var68 = class169.method1217(class198.field3084[var6], 12180);
                            if (var68.field3526 == null) {
                                class198.field3084[var6++] = 0;
                                continue;
                            }
                            int var69 = var68.field3526.length;
                            for (int var70 = 0; var70 < var68.field3526.length; var70++) {
                                if (var68.field3526[var70] == null) {
                                    var69 = var70;
                                    break;
                                }
                            }
                            class198.field3084[var6++] = var69;
                            continue;
                        }
                        if (var517 == 2704 || var517 == 2705) {
                            var6 -= 2;
                            int var71 = class198.field3084[var6];
                            int var72 = class198.field3084[var6 + 1];
                            class288 var73 = (class288) class48.field787.method2043((long) var71, -1);
                            if (var73 != null && var73.field4505 == var72) {
                                class198.field3084[var6++] = 1;
                                continue;
                            }
                            class198.field3084[var6++] = 0;
                            continue;
                        }
                    } else if (var517 < 2900) {
                        var6--;
                        class222 var471 = class169.method1217(class198.field3084[var6], 12180);
                        if (var517 == 2800) {
                            class198.field3084[var6++] = client.method1159(var471).method232(109);
                            continue;
                        }
                        if (var517 == 2801) {
                            var6--;
                            int var472 = class198.field3084[var6];
                            int var518 = var472 - 1;
                            if (var471.field3549 != null && var518 < var471.field3549.length && var471.field3549[var518] != null) {
                                class290.field4510[var7++] = var471.field3549[var518];
                                continue;
                            }
                            class290.field4510[var7++] = "";
                            continue;
                        }
                        if (var517 == 2802) {
                            if (var471.field3537 == null) {
                                class290.field4510[var7++] = "";
                            } else {
                                class290.field4510[var7++] = var471.field3537;
                            }
                            continue;
                        }
                    } else if (var517 < 3200) {
                        if (var517 == 3100) {
                            var7--;
                            String var74 = class290.field4510[var7];
                            class247.method1671(0, var74, -1, "");
                            continue;
                        }
                        if (var517 == 3101) {
                            var6 -= 2;
                            class84.method646(false, class198.field3084[var6], class263.field4168, class198.field3084[var6 + 1]);
                            continue;
                        }
                        if (var517 == 3103) {
                            class78.method610((byte) 91);
                            continue;
                        }
                        if (var517 == 3104) {
                            class85.field1269++;
                            var7--;
                            String var75 = class290.field4510[var7];
                            int var76 = 0;
                            if (class79.method623((byte) -23, var75)) {
                                var76 = class297.method1995(var75, -94);
                            }
                            class240.field3826.method1762(34, true);
                            class240.field3826.method258(var76, -1527329320);
                            continue;
                        }
                        if (var517 == 3105) {
                            class264.field4178++;
                            var7--;
                            String var77 = class290.field4510[var7];
                            class240.field3826.method1762(27, true);
                            class240.field3826.method313(-6968, class170.method1223(true, var77));
                            continue;
                        }
                        if (var517 == 3106) {
                            class84.field1255++;
                            var7--;
                            String var78 = class290.field4510[var7];
                            class240.field3826.method1762(136, true);
                            class240.field3826.method305(var78.length() + 1, !arg0);
                            class240.field3826.method288(var78, (byte) -43);
                            continue;
                        }
                        if (var517 == 3107) {
                            var6--;
                            int var79 = class198.field3084[var6];
                            var7--;
                            String var80 = class290.field4510[var7];
                            class159.method1142(var80, var79, -13995);
                            continue;
                        }
                        if (var517 == 3108) {
                            var6 -= 3;
                            int var81 = class198.field3084[var6];
                            int var82 = class198.field3084[var6 + 1];
                            int var83 = class198.field3084[var6 + 2];
                            class222 var84 = class169.method1217(var83, 12180);
                            class208.method1452(0, var84, var81, var82);
                            continue;
                        }
                        if (var517 == 3109) {
                            var6 -= 2;
                            int var85 = class198.field3084[var6];
                            class222 var86 = var46 ? class307.field4922 : class300.field4828;
                            int var87 = class198.field3084[var6 + 1];
                            class208.method1452(0, var86, var85, var87);
                            continue;
                        }
                        if (var517 == 3110) {
                            class8.field138++;
                            var6--;
                            int var88 = class198.field3084[var6];
                            class240.field3826.method1762(51, !arg0);
                            class240.field3826.method281((byte) -108, var88);
                            continue;
                        }
                    } else if (var517 < 3300) {
                        if (var517 == 3200) {
                            var6 -= 3;
                            class24.method216((byte) -127, class198.field3084[var6], 255, class198.field3084[var6 + 2], class198.field3084[var6 + 1]);
                            continue;
                        }
                        if (var517 == 3201) {
                            var6--;
                            class260.method1745(class198.field3084[var6], 0, 255);
                            continue;
                        }
                        if (var517 == 3202) {
                            var6 -= 2;
                            class268.method1816(255, (byte) -121, class198.field3084[var6], class198.field3084[var6 + 1]);
                            continue;
                        }
                    } else if (var517 < 3400) {
                        if (var517 == 3300) {
                            class198.field3084[var6++] = class41.field686;
                            continue;
                        }
                        if (var517 == 3301) {
                            var6 -= 2;
                            int var89 = class198.field3084[var6];
                            int var90 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class209.method1462(0, var89, var90);
                            continue;
                        }
                        if (var517 == 3302) {
                            var6 -= 2;
                            int var91 = class198.field3084[var6 + 1];
                            int var92 = class198.field3084[var6];
                            class198.field3084[var6++] = class264.method1776((byte) 73, var92, var91);
                            continue;
                        }
                        if (var517 == 3303) {
                            var6 -= 2;
                            int var93 = class198.field3084[var6];
                            int var94 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class274.method1871(var94, var93, 0);
                            continue;
                        }
                        if (var517 == 3304) {
                            var6--;
                            int var95 = class198.field3084[var6];
                            class198.field3084[var6++] = class266.method1782(var95, 105).field3742;
                            continue;
                        }
                        if (var517 == 3305) {
                            var6--;
                            int var96 = class198.field3084[var6];
                            class198.field3084[var6++] = class9.field160[var96];
                            continue;
                        }
                        if (var517 == 3306) {
                            var6--;
                            int var97 = class198.field3084[var6];
                            class198.field3084[var6++] = class56.field885[var97];
                            continue;
                        }
                        if (var517 == 3307) {
                            var6--;
                            int var98 = class198.field3084[var6];
                            class198.field3084[var6++] = class207.field3187[var98];
                            continue;
                        }
                        if (var517 == 3308) {
                            int var99 = (class263.field4168.field4725 >> 7) + class138.field2072;
                            int var100 = (class263.field4168.field4709 >> 7) + class159.field2379;
                            int var101 = class130.field1941;
                            class198.field3084[var6++] = (var101 << 28) + var100 + (var99 << 14);
                            continue;
                        }
                        if (var517 == 3309) {
                            var6--;
                            int var102 = class198.field3084[var6];
                            class198.field3084[var6++] = class118.method863(16383, var102 >> 14);
                            continue;
                        }
                        if (var517 == 3310) {
                            var6--;
                            int var103 = class198.field3084[var6];
                            class198.field3084[var6++] = var103 >> 28;
                            continue;
                        }
                        if (var517 == 3311) {
                            var6--;
                            int var104 = class198.field3084[var6];
                            class198.field3084[var6++] = class118.method863(var104, 16383);
                            continue;
                        }
                        if (var517 == 3312) {
                            class198.field3084[var6++] = class272.field4344 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3313) {
                            var6 -= 2;
                            int var105 = class198.field3084[var6 + 1];
                            int var106 = class198.field3084[var6] + 32768;
                            class198.field3084[var6++] = class209.method1462(0, var106, var105);
                            continue;
                        }
                        if (var517 == 3314) {
                            var6 -= 2;
                            int var107 = class198.field3084[var6] + 32768;
                            int var108 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class264.method1776((byte) -64, var107, var108);
                            continue;
                        }
                        if (var517 == 3315) {
                            var6 -= 2;
                            int var109 = class198.field3084[var6] + 32768;
                            int var110 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class274.method1871(var110, var109, 0);
                            continue;
                        }
                        if (var517 == 3316) {
                            if (class53.field835 >= 2) {
                                class198.field3084[var6++] = class53.field835;
                            } else {
                                class198.field3084[var6++] = 0;
                            }
                            continue;
                        }
                        if (var517 == 3317) {
                            class198.field3084[var6++] = class304.field4892;
                            continue;
                        }
                        if (var517 == 3318) {
                            class198.field3084[var6++] = class49.field807;
                            continue;
                        }
                        if (var517 == 3321) {
                            class198.field3084[var6++] = class203.field3132;
                            continue;
                        }
                        if (var517 == 3322) {
                            class198.field3084[var6++] = class20.field278;
                            continue;
                        }
                        if (var517 == 3323) {
                            if (class156.field2325 >= 5 && class156.field2325 <= 9) {
                                class198.field3084[var6++] = 1;
                                continue;
                            }
                            class198.field3084[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3324) {
                            if (class156.field2325 >= 5 && class156.field2325 <= 9) {
                                class198.field3084[var6++] = class156.field2325;
                                continue;
                            }
                            class198.field3084[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3325) {
                            class198.field3084[var6++] = class248.field3935 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3326) {
                            class198.field3084[var6++] = class263.field4168.field2052;
                            continue;
                        }
                        if (var517 == 3327) {
                            class198.field3084[var6++] = class263.field4168.field2044.field2935 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3328) {
                            class198.field3084[var6++] = class112.field1733 && !class166.field2508 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3329) {
                            class198.field3084[var6++] = class54.field854 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3330) {
                            var6--;
                            int var111 = class198.field3084[var6];
                            class198.field3084[var6++] = class265.method1779((byte) 119, var111);
                            continue;
                        }
                        if (var517 == 3331) {
                            var6 -= 2;
                            int var112 = class198.field3084[var6];
                            int var113 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class281.method1903(0, var112, false, var113);
                            continue;
                        }
                        if (var517 == 3332) {
                            var6 -= 2;
                            int var114 = class198.field3084[var6];
                            int var115 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class281.method1903(0, var114, true, var115);
                            continue;
                        }
                        if (var517 == 3333) {
                            class198.field3084[var6++] = class20.field289;
                            continue;
                        }
                        if (var517 == 3335) {
                            class198.field3084[var6++] = class130.field1939;
                            continue;
                        }
                        if (var517 == 3336) {
                            var6 -= 4;
                            int var116 = class198.field3084[var6 + 2];
                            int var117 = class198.field3084[var6 + 3];
                            int var118 = class198.field3084[var6];
                            int var119 = class198.field3084[var6 + 1];
                            int var120 = (var119 << 14) + var118;
                            int var121 = (var116 << 28) + var120;
                            int var122 = var117 + var121;
                            class198.field3084[var6++] = var122;
                            continue;
                        }
                        if (var517 == 3337) {
                            class198.field3084[var6++] = class178.field2734;
                            continue;
                        }
                    } else if (var517 < 3500) {
                        if (var517 == 3400) {
                            var6 -= 2;
                            int var454 = class198.field3084[var6];
                            int var455 = class198.field3084[var6 + 1];
                            class231 var456 = class61.method497(var454, 7324);
                            class290.field4510[var7++] = var456.method1588(var455, -16375);
                            continue;
                        }
                        if (var517 == 3408) {
                            var6 -= 4;
                            int var457 = class198.field3084[var6 + 2];
                            int var458 = class198.field3084[var6];
                            int var459 = class198.field3084[var6 + 1];
                            int var460 = class198.field3084[var6 + 3];
                            class231 var461 = class61.method497(var457, 7324);
                            if (var461.field3661 == var458 && var461.field3654 == var459) {
                                if (var459 == 115) {
                                    class290.field4510[var7++] = var461.method1588(var460, -16375);
                                } else {
                                    class198.field3084[var6++] = var461.method1591(var460, -5);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var517 == 3409) {
                            var6 -= 3;
                            int var462 = class198.field3084[var6];
                            int var463 = class198.field3084[var6 + 1];
                            int var464 = class198.field3084[var6 + 2];
                            if (var463 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class231 var465 = class61.method497(var463, 7324);
                            if (var465.field3654 != var462) {
                                throw new RuntimeException("C3409-1");
                            }
                            class198.field3084[var6++] = var465.method1587((byte) -88, var464) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3410) {
                            var6--;
                            int var466 = class198.field3084[var6];
                            var7--;
                            String var467 = class290.field4510[var7];
                            if (var466 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class231 var468 = class61.method497(var466, 7324);
                            if (var468.field3654 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class198.field3084[var6++] = var468.method1586(var467, (byte) -7) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3411) {
                            var6--;
                            int var469 = class198.field3084[var6];
                            class231 var470 = class61.method497(var469, 7324);
                            class198.field3084[var6++] = var470.field3666.method2042((byte) 124);
                            continue;
                        }
                    } else if (var517 < 3700) {
                        if (var517 == 3600) {
                            if (class194.field3046 == 0) {
                                class198.field3084[var6++] = -2;
                            } else if (class194.field3046 == 1) {
                                class198.field3084[var6++] = -1;
                            } else {
                                class198.field3084[var6++] = class181.field2843;
                            }
                            continue;
                        }
                        if (var517 == 3601) {
                            var6--;
                            int var430 = class198.field3084[var6];
                            if (class194.field3046 == 2 && class181.field2843 > var430) {
                                class290.field4510[var7++] = class64.field1015[var430];
                                continue;
                            }
                            class290.field4510[var7++] = "";
                            continue;
                        }
                        if (var517 == 3602) {
                            var6--;
                            int var431 = class198.field3084[var6];
                            if (class194.field3046 == 2 && var431 < class181.field2843) {
                                class198.field3084[var6++] = class143.field2139[var431];
                                continue;
                            }
                            class198.field3084[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3603) {
                            var6--;
                            int var432 = class198.field3084[var6];
                            if (class194.field3046 == 2 && class181.field2843 > var432) {
                                class198.field3084[var6++] = class157.field2353[var432];
                                continue;
                            }
                            class198.field3084[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3604) {
                            var7--;
                            String var433 = class290.field4510[var7];
                            var6--;
                            int var434 = class198.field3084[var6];
                            class57.method473(var434, (byte) -105, var433);
                            continue;
                        }
                        if (var517 == 3605) {
                            var7--;
                            String var435 = class290.field4510[var7];
                            class226.method1562(-101, class170.method1223(true, var435));
                            continue;
                        }
                        if (var517 == 3606) {
                            var7--;
                            String var436 = class290.field4510[var7];
                            class304.method2036(class170.method1223(true, var436), 1);
                            continue;
                        }
                        if (var517 == 3607) {
                            var7--;
                            String var437 = class290.field4510[var7];
                            class147.method1057((byte) 24, class170.method1223(true, var437), false);
                            continue;
                        }
                        if (var517 == 3608) {
                            var7--;
                            String var438 = class290.field4510[var7];
                            class59.method485(class170.method1223(!arg0, var438), 1);
                            continue;
                        }
                        if (var517 == 3609) {
                            var7--;
                            String var439 = class290.field4510[var7];
                            if (var439.startsWith("<img=0>") || var439.startsWith("<img=1>")) {
                                var439 = var439.substring(7);
                            }
                            class198.field3084[var6++] = class191.method1358(false, var439) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3610) {
                            var6--;
                            int var440 = class198.field3084[var6];
                            if (class194.field3046 == 2 && var440 < class181.field2843) {
                                class290.field4510[var7++] = class241.field3873[var440];
                                continue;
                            }
                            class290.field4510[var7++] = "";
                            continue;
                        }
                        if (var517 == 3611) {
                            if (class138.field2073 == null) {
                                class290.field4510[var7++] = "";
                            } else {
                                class290.field4510[var7++] = class30.method248(125, class138.field2073);
                            }
                            continue;
                        }
                        if (var517 == 3612) {
                            if (class138.field2073 == null) {
                                class198.field3084[var6++] = 0;
                            } else {
                                class198.field3084[var6++] = class297.field4776;
                            }
                            continue;
                        }
                        if (var517 == 3613) {
                            var6--;
                            int var441 = class198.field3084[var6];
                            if (class138.field2073 != null && var441 < class297.field4776) {
                                class290.field4510[var7++] = class30.method248(126, class83.field1249[var441].field2321);
                                continue;
                            }
                            class290.field4510[var7++] = "";
                            continue;
                        }
                        if (var517 == 3614) {
                            var6--;
                            int var442 = class198.field3084[var6];
                            if (class138.field2073 != null && class297.field4776 > var442) {
                                class198.field3084[var6++] = class83.field1249[var442].field2324;
                                continue;
                            }
                            class198.field3084[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3615) {
                            var6--;
                            int var443 = class198.field3084[var6];
                            if (class138.field2073 != null && var443 < class297.field4776) {
                                class198.field3084[var6++] = class83.field1249[var443].field2327;
                                continue;
                            }
                            class198.field3084[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3616) {
                            class198.field3084[var6++] = class36.field621;
                            continue;
                        }
                        if (var517 == 3617) {
                            var7--;
                            String var444 = class290.field4510[var7];
                            class199.method1412((byte) -103, var444);
                            continue;
                        }
                        if (var517 == 3618) {
                            class198.field3084[var6++] = class204.field3148;
                            continue;
                        }
                        if (var517 == 3619) {
                            var7--;
                            String var445 = class290.field4510[var7];
                            class110.method821(-60, class170.method1223(true, var445));
                            continue;
                        }
                        if (var517 == 3620) {
                            class181.method1297(-93);
                            continue;
                        }
                        if (var517 == 3621) {
                            if (class194.field3046 == 0) {
                                class198.field3084[var6++] = -1;
                            } else {
                                class198.field3084[var6++] = class40.field677;
                            }
                            continue;
                        }
                        if (var517 == 3622) {
                            var6--;
                            int var446 = class198.field3084[var6];
                            if (class194.field3046 != 0 && var446 < class40.field677) {
                                class290.field4510[var7++] = class292.method1939(class78.field1189[var446], -100);
                                continue;
                            }
                            class290.field4510[var7++] = "";
                            continue;
                        }
                        if (var517 == 3623) {
                            var7--;
                            String var447 = class290.field4510[var7];
                            if (var447.startsWith("<img=0>") || var447.startsWith("<img=1>")) {
                                var447 = var447.substring(7);
                            }
                            class198.field3084[var6++] = class269.method1824(var447, (byte) -14) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3624) {
                            var6--;
                            int var448 = class198.field3084[var6];
                            if (class83.field1249 != null && class297.field4776 > var448 && class83.field1249[var448].field2321.equalsIgnoreCase(class263.field4168.field2064)) {
                                class198.field3084[var6++] = 1;
                                continue;
                            }
                            class198.field3084[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3625) {
                            if (class218.field3332 == null) {
                                class290.field4510[var7++] = "";
                            } else {
                                class290.field4510[var7++] = class30.method248(127, class218.field3332);
                            }
                            continue;
                        }
                        if (var517 == 3626) {
                            var6--;
                            int var449 = class198.field3084[var6];
                            if (class138.field2073 != null && class297.field4776 > var449) {
                                class290.field4510[var7++] = class83.field1249[var449].field2329;
                                continue;
                            }
                            class290.field4510[var7++] = "";
                            continue;
                        }
                        if (var517 == 3627) {
                            var6--;
                            int var450 = class198.field3084[var6];
                            if (class194.field3046 == 2 && var450 >= 0 && var450 < class181.field2843) {
                                class198.field3084[var6++] = class253.field4049[var450] ? 1 : 0;
                                continue;
                            }
                            class198.field3084[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3628) {
                            var7--;
                            String var451 = class290.field4510[var7];
                            if (var451.startsWith("<img=0>") || var451.startsWith("<img=1>")) {
                                var451 = var451.substring(7);
                            }
                            class198.field3084[var6++] = class270.method1825(var451, (byte) -6);
                            continue;
                        }
                        if (var517 == 3629) {
                            class198.field3084[var6++] = class210.field3245;
                            continue;
                        }
                        if (var517 == 3630) {
                            var7--;
                            String var452 = class290.field4510[var7];
                            class147.method1057((byte) 24, class170.method1223(true, var452), true);
                            continue;
                        }
                        if (var517 == 3631) {
                            var6--;
                            int var453 = class198.field3084[var6];
                            class198.field3084[var6++] = class214.field3275[var453] ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4000) {
                        if (var517 == 3903) {
                            var6--;
                            int var416 = class198.field3084[var6];
                            class198.field3084[var6++] = class28.field475[var416].method1436(0);
                            continue;
                        }
                        if (var517 == 3904) {
                            var6--;
                            int var417 = class198.field3084[var6];
                            class198.field3084[var6++] = class28.field475[var417].field3141;
                            continue;
                        }
                        if (var517 == 3905) {
                            var6--;
                            int var418 = class198.field3084[var6];
                            class198.field3084[var6++] = class28.field475[var418].field3144;
                            continue;
                        }
                        if (var517 == 3906) {
                            var6--;
                            int var419 = class198.field3084[var6];
                            class198.field3084[var6++] = class28.field475[var419].field3140;
                            continue;
                        }
                        if (var517 == 3907) {
                            var6--;
                            int var420 = class198.field3084[var6];
                            class198.field3084[var6++] = class28.field475[var420].field3138;
                            continue;
                        }
                        if (var517 == 3908) {
                            var6--;
                            int var421 = class198.field3084[var6];
                            class198.field3084[var6++] = class28.field475[var421].field3143;
                            continue;
                        }
                        if (var517 == 3910) {
                            var6--;
                            int var422 = class198.field3084[var6];
                            int var423 = class28.field475[var422].method1433((byte) -120);
                            class198.field3084[var6++] = var423 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3911) {
                            var6--;
                            int var424 = class198.field3084[var6];
                            int var425 = class28.field475[var424].method1433((byte) -126);
                            class198.field3084[var6++] = var425 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3912) {
                            var6--;
                            int var426 = class198.field3084[var6];
                            int var427 = class28.field475[var426].method1433((byte) -128);
                            class198.field3084[var6++] = var427 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3913) {
                            var6--;
                            int var428 = class198.field3084[var6];
                            int var429 = class28.field475[var428].method1433((byte) -109);
                            class198.field3084[var6++] = var429 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4100) {
                        if (var517 == 4000) {
                            var6 -= 2;
                            int var371 = class198.field3084[var6 + 1];
                            int var372 = class198.field3084[var6];
                            class198.field3084[var6++] = var372 + var371;
                            continue;
                        }
                        if (var517 == 4001) {
                            var6 -= 2;
                            int var373 = class198.field3084[var6];
                            int var374 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = var373 - var374;
                            continue;
                        }
                        if (var517 == 4002) {
                            var6 -= 2;
                            int var375 = class198.field3084[var6];
                            int var376 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = var375 * var376;
                            continue;
                        }
                        if (var517 == 4003) {
                            var6 -= 2;
                            int var377 = class198.field3084[var6 + 1];
                            int var378 = class198.field3084[var6];
                            class198.field3084[var6++] = var378 / var377;
                            continue;
                        }
                        if (var517 == 4004) {
                            var6--;
                            int var379 = class198.field3084[var6];
                            class198.field3084[var6++] = (int) ((double) var379 * Math.random());
                            continue;
                        }
                        if (var517 == 4005) {
                            var6--;
                            int var380 = class198.field3084[var6];
                            class198.field3084[var6++] = (int) (Math.random() * (double) (var380 + 1));
                            continue;
                        }
                        if (var517 == 4006) {
                            var6 -= 5;
                            int var381 = class198.field3084[var6];
                            int var382 = class198.field3084[var6 + 1];
                            int var383 = class198.field3084[var6 + 2];
                            int var384 = class198.field3084[var6 + 4];
                            int var385 = class198.field3084[var6 + 3];
                            class198.field3084[var6++] = (var382 - var381) * (var384 - var383) / (var385 - var383) + var381;
                            continue;
                        }
                        if (var517 == 4007) {
                            var6 -= 2;
                            long var386 = (long) class198.field3084[var6];
                            long var388 = (long) class198.field3084[var6 + 1];
                            class198.field3084[var6++] = (int) (var386 * var388 / 100L + var386);
                            continue;
                        }
                        if (var517 == 4008) {
                            var6 -= 2;
                            int var390 = class198.field3084[var6];
                            int var391 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class44.method377(var390, 0x1 << var391);
                            continue;
                        }
                        if (var517 == 4009) {
                            var6 -= 2;
                            int var392 = class198.field3084[var6];
                            int var393 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class118.method863(var392, -(0x1 << var393) - 1);
                            continue;
                        }
                        if (var517 == 4010) {
                            var6 -= 2;
                            int var394 = class198.field3084[var6];
                            int var395 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class118.method863(0x1 << var395, var394) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var517 == 4011) {
                            var6 -= 2;
                            int var396 = class198.field3084[var6];
                            int var397 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = var396 % var397;
                            continue;
                        }
                        if (var517 == 4012) {
                            var6 -= 2;
                            int var398 = class198.field3084[var6];
                            int var399 = class198.field3084[var6 + 1];
                            if (var398 == 0) {
                                class198.field3084[var6++] = 0;
                            } else {
                                class198.field3084[var6++] = (int) Math.pow((double) var398, (double) var399);
                            }
                            continue;
                        }
                        if (var517 == 4013) {
                            var6 -= 2;
                            int var400 = class198.field3084[var6];
                            int var401 = class198.field3084[var6 + 1];
                            if (var400 == 0) {
                                class198.field3084[var6++] = 0;
                            } else if (var401 == 0) {
                                class198.field3084[var6++] = Integer.MAX_VALUE;
                            } else {
                                class198.field3084[var6++] = (int) Math.pow((double) var400, 1.0D / (double) var401);
                            }
                            continue;
                        }
                        if (var517 == 4014) {
                            var6 -= 2;
                            int var402 = class198.field3084[var6];
                            int var403 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class118.method863(var403, var402);
                            continue;
                        }
                        if (var517 == 4015) {
                            var6 -= 2;
                            int var404 = class198.field3084[var6];
                            int var405 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class44.method377(var405, var404);
                            continue;
                        }
                        if (var517 == 4016) {
                            var6 -= 2;
                            int var406 = class198.field3084[var6];
                            int var407 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = var407 <= var406 ? var407 : var406;
                            continue;
                        }
                        if (var517 == 4017) {
                            var6 -= 2;
                            int var408 = class198.field3084[var6];
                            int var409 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = var408 <= var409 ? var409 : var408;
                            continue;
                        }
                        if (var517 == 4018) {
                            var6 -= 3;
                            long var410 = (long) class198.field3084[var6];
                            long var412 = (long) class198.field3084[var6 + 1];
                            long var414 = (long) class198.field3084[var6 + 2];
                            class198.field3084[var6++] = (int) (var410 * var414 / var412);
                            continue;
                        }
                    } else if (var517 < 4200) {
                        if (var517 == 4100) {
                            var7--;
                            String var321 = class290.field4510[var7];
                            var6--;
                            int var322 = class198.field3084[var6];
                            class290.field4510[var7++] = var321 + var322;
                            continue;
                        }
                        if (var517 == 4101) {
                            var7 -= 2;
                            String var323 = class290.field4510[var7 + 1];
                            String var324 = class290.field4510[var7];
                            class290.field4510[var7++] = var324 + var323;
                            continue;
                        }
                        if (var517 == 4102) {
                            var6--;
                            int var325 = class198.field3084[var6];
                            var7--;
                            String var326 = class290.field4510[var7];
                            class290.field4510[var7++] = var326 + class89.method678(true, 10, var325);
                            continue;
                        }
                        if (var517 == 4103) {
                            var7--;
                            String var327 = class290.field4510[var7];
                            class290.field4510[var7++] = var327.toLowerCase();
                            continue;
                        }
                        if (var517 == 4104) {
                            var6--;
                            int var328 = class198.field3084[var6];
                            long var329 = (long) var328 * 86400000L + 1014768000000L;
                            class210.field3244.setTime(new Date(var329));
                            int var331 = class210.field3244.get(5);
                            int var332 = class210.field3244.get(2);
                            int var333 = class210.field3244.get(1);
                            class290.field4510[var7++] = var331 + "-" + class121.field1830[var332] + "-" + var333;
                            continue;
                        }
                        if (var517 == 4105) {
                            var7 -= 2;
                            String var334 = class290.field4510[var7 + 1];
                            String var335 = class290.field4510[var7];
                            if (class263.field4168.field2044 != null && class263.field4168.field2044.field2935) {
                                class290.field4510[var7++] = var334;
                                continue;
                            }
                            class290.field4510[var7++] = var335;
                            continue;
                        }
                        if (var517 == 4106) {
                            var6--;
                            int var336 = class198.field3084[var6];
                            class290.field4510[var7++] = Integer.toString(var336);
                            continue;
                        }
                        if (var517 == 4107) {
                            var7 -= 2;
                            class198.field3084[var6++] = class67.method539((byte) 97, class75.method592(-27644, class130.field1939, class290.field4510[var7], class290.field4510[var7 + 1]));
                            continue;
                        }
                        if (var517 == 4108) {
                            var6 -= 2;
                            var7--;
                            String var337 = class290.field4510[var7];
                            int var338 = class198.field3084[var6 + 1];
                            int var339 = class198.field3084[var6];
                            class198.field3084[var6++] = class80.method630((byte) 115, var338).method1803(var337, var339);
                            continue;
                        }
                        if (var517 == 4109) {
                            var7--;
                            String var340 = class290.field4510[var7];
                            var6 -= 2;
                            int var341 = class198.field3084[var6];
                            int var342 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = class80.method630((byte) 115, var342).method1802(var340, var341);
                            continue;
                        }
                        if (var517 == 4110) {
                            var7 -= 2;
                            String var343 = class290.field4510[var7];
                            String var344 = class290.field4510[var7 + 1];
                            var6--;
                            if (class198.field3084[var6] == 1) {
                                class290.field4510[var7++] = var343;
                            } else {
                                class290.field4510[var7++] = var344;
                            }
                            continue;
                        }
                        if (var517 == 4111) {
                            var7--;
                            String var345 = class290.field4510[var7];
                            class290.field4510[var7++] = class267.method1791(var345);
                            continue;
                        }
                        if (var517 == 4112) {
                            var7--;
                            String var346 = class290.field4510[var7];
                            var6--;
                            int var347 = class198.field3084[var6];
                            if (var347 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class290.field4510[var7++] = var346 + (char) var347;
                            continue;
                        }
                        if (var517 == 4113) {
                            var6--;
                            int var348 = class198.field3084[var6];
                            class198.field3084[var6++] = class218.method1502((byte) -120, (char) var348) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4114) {
                            var6--;
                            int var349 = class198.field3084[var6];
                            class198.field3084[var6++] = class166.method1206((char) var349, -66) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4115) {
                            var6--;
                            int var350 = class198.field3084[var6];
                            class198.field3084[var6++] = class28.method236(false, (char) var350) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4116) {
                            var6--;
                            int var351 = class198.field3084[var6];
                            class198.field3084[var6++] = class79.method622(1, (char) var351) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4117) {
                            var7--;
                            String var352 = class290.field4510[var7];
                            if (var352 == null) {
                                class198.field3084[var6++] = 0;
                            } else {
                                class198.field3084[var6++] = var352.length();
                            }
                            continue;
                        }
                        if (var517 == 4118) {
                            var6 -= 2;
                            var7--;
                            String var353 = class290.field4510[var7];
                            int var354 = class198.field3084[var6];
                            int var355 = class198.field3084[var6 + 1];
                            class290.field4510[var7++] = var353.substring(var354, var355);
                            continue;
                        }
                        if (var517 == 4119) {
                            var7--;
                            String var356 = class290.field4510[var7];
                            StringBuffer var357 = new StringBuffer(var356.length());
                            boolean var358 = false;
                            for (int var359 = 0; var356.length() > var359; var359++) {
                                char var360 = var356.charAt(var359);
                                if (var360 == '<') {
                                    var358 = true;
                                } else if (var360 == '>') {
                                    var358 = false;
                                } else if (!var358) {
                                    var357.append(var360);
                                }
                            }
                            class290.field4510[var7++] = var357.toString();
                            continue;
                        }
                        if (var517 == 4120) {
                            var6 -= 2;
                            int var361 = class198.field3084[var6];
                            var7--;
                            String var362 = class290.field4510[var7];
                            int var363 = class198.field3084[var6 + 1];
                            class198.field3084[var6++] = var362.indexOf(var361, var363);
                            continue;
                        }
                        if (var517 == 4121) {
                            var7 -= 2;
                            String var364 = class290.field4510[var7];
                            var6--;
                            int var365 = class198.field3084[var6];
                            String var366 = class290.field4510[var7 + 1];
                            class198.field3084[var6++] = var364.indexOf(var366, var365);
                            continue;
                        }
                        if (var517 == 4122) {
                            var6--;
                            int var367 = class198.field3084[var6];
                            class198.field3084[var6++] = Character.toLowerCase((char) var367);
                            continue;
                        }
                        if (var517 == 4123) {
                            var6--;
                            int var368 = class198.field3084[var6];
                            class198.field3084[var6++] = Character.toUpperCase((char) var368);
                            continue;
                        }
                        if (var517 == 4124) {
                            var6--;
                            boolean var369 = class198.field3084[var6] != 0;
                            var6--;
                            int var370 = class198.field3084[var6];
                            class290.field4510[var7++] = class206.method1440(class130.field1939, 0, (long) var370, 0, var369);
                            continue;
                        }
                    } else if (var517 < 4300) {
                        if (var517 == 4200) {
                            var6--;
                            int var302 = class198.field3084[var6];
                            class290.field4510[var7++] = class123.method929(22497, var302).field2778;
                            continue;
                        }
                        if (var517 == 4201) {
                            var6 -= 2;
                            int var303 = class198.field3084[var6 + 1];
                            int var304 = class198.field3084[var6];
                            class179 var305 = class123.method929(22497, var304);
                            if (var303 >= 1 && var303 <= 5 && var305.field2754[var303 - 1] != null) {
                                class290.field4510[var7++] = var305.field2754[var303 - 1];
                                continue;
                            }
                            class290.field4510[var7++] = "";
                            continue;
                        }
                        if (var517 == 4202) {
                            var6 -= 2;
                            int var306 = class198.field3084[var6];
                            int var307 = class198.field3084[var6 + 1];
                            class179 var308 = class123.method929(22497, var306);
                            if (var307 >= 1 && var307 <= 5 && var308.field2783[var307 - 1] != null) {
                                class290.field4510[var7++] = var308.field2783[var307 - 1];
                                continue;
                            }
                            class290.field4510[var7++] = "";
                            continue;
                        }
                        if (var517 == 4203) {
                            var6--;
                            int var309 = class198.field3084[var6];
                            class198.field3084[var6++] = class123.method929(22497, var309).field2751;
                            continue;
                        }
                        if (var517 == 4204) {
                            var6--;
                            int var310 = class198.field3084[var6];
                            class198.field3084[var6++] = class123.method929(22497, var310).field2795 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4205) {
                            var6--;
                            int var311 = class198.field3084[var6];
                            class179 var312 = class123.method929(22497, var311);
                            if (var312.field2747 == -1 && var312.field2804 >= 0) {
                                class198.field3084[var6++] = var312.field2804;
                                continue;
                            }
                            class198.field3084[var6++] = var311;
                            continue;
                        }
                        if (var517 == 4206) {
                            var6--;
                            int var313 = class198.field3084[var6];
                            class179 var314 = class123.method929(22497, var313);
                            if (var314.field2747 >= 0 && var314.field2804 >= 0) {
                                class198.field3084[var6++] = var314.field2804;
                                continue;
                            }
                            class198.field3084[var6++] = var313;
                            continue;
                        }
                        if (var517 == 4207) {
                            var6--;
                            int var315 = class198.field3084[var6];
                            class198.field3084[var6++] = class123.method929(22497, var315).field2769 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4208) {
                            var6 -= 2;
                            int var316 = class198.field3084[var6 + 1];
                            int var317 = class198.field3084[var6];
                            class238 var318 = class55.method463(0, var316);
                            if (var318.method1631(-116)) {
                                class290.field4510[var7++] = class123.method929(22497, var317).method1280(var316, var318.field3755, (byte) -118);
                            } else {
                                class198.field3084[var6++] = class123.method929(22497, var317).method1277(var318.field3753, var316, 114);
                            }
                            continue;
                        }
                        if (var517 == 4210) {
                            var7--;
                            String var319 = class290.field4510[var7];
                            var6--;
                            int var320 = class198.field3084[var6];
                            class192.method1363(var319, 0, var320 == 1);
                            class198.field3084[var6++] = class121.field1819;
                            continue;
                        }
                        if (var517 == 4211) {
                            if (class162.field2443 != null && class121.field1819 > class204.field3150) {
                                class198.field3084[var6++] = class118.method863(class162.field2443[class204.field3150++], 65535);
                                continue;
                            }
                            class198.field3084[var6++] = -1;
                            continue;
                        }
                        if (var517 == 4212) {
                            class204.field3150 = 0;
                            continue;
                        }
                    } else if (var517 >= 4400) {
                        if (var517 >= 4500) {
                            if (var517 < 4600) {
                                if (var517 == 4500) {
                                    var6 -= 2;
                                    int var123 = class198.field3084[var6 + 1];
                                    int var124 = class198.field3084[var6];
                                    class238 var125 = class55.method463(0, var123);
                                    if (var125.method1631(-116)) {
                                        class290.field4510[var7++] = class189.method1350(78, var124).method1091(true, var125.field3755, var123);
                                    } else {
                                        class198.field3084[var6++] = class189.method1350(117, var124).method1087(var123, var125.field3753, false);
                                    }
                                    continue;
                                }
                            } else if (var517 < 5100) {
                                if (var517 == 5000) {
                                    class198.field3084[var6++] = class149.field2215;
                                    continue;
                                }
                                if (var517 == 5001) {
                                    class24.field427++;
                                    var6 -= 3;
                                    class149.field2215 = class198.field3084[var6];
                                    class206.field3174 = class198.field3084[var6 + 1];
                                    class182.field2876 = class198.field3084[var6 + 2];
                                    class240.field3826.method1762(181, true);
                                    class240.field3826.method305(class149.field2215, true);
                                    class240.field3826.method305(class206.field3174, true);
                                    class240.field3826.method305(class182.field2876, true);
                                    continue;
                                }
                                if (var517 == 5002) {
                                    var6 -= 2;
                                    int var231 = class198.field3084[var6 + 1];
                                    var7--;
                                    String var232 = class290.field4510[var7];
                                    int var233 = class198.field3084[var6];
                                    class240.field3826.method1762(200, true);
                                    class240.field3826.method313(-6968, class170.method1223(true, var232));
                                    class250.field4011++;
                                    class240.field3826.method305(var233 - 1, !arg0);
                                    class240.field3826.method305(var231, true);
                                    continue;
                                }
                                if (var517 == 5003) {
                                    var6--;
                                    int var234 = class198.field3084[var6];
                                    String var235 = null;
                                    if (var234 < 100) {
                                        var235 = class278.field4415[var234];
                                    }
                                    if (var235 == null) {
                                        var235 = "";
                                    }
                                    class290.field4510[var7++] = var235;
                                    continue;
                                }
                                if (var517 == 5004) {
                                    var6--;
                                    int var236 = class198.field3084[var6];
                                    int var237 = -1;
                                    if (var236 < 100 && class278.field4415[var236] != null) {
                                        var237 = class39.field668[var236];
                                    }
                                    class198.field3084[var6++] = var237;
                                    continue;
                                }
                                if (var517 == 5005) {
                                    class198.field3084[var6++] = class206.field3174;
                                    continue;
                                }
                                if (var517 == 5008) {
                                    var7--;
                                    String var238 = class290.field4510[var7];
                                    if (var238.startsWith("::")) {
                                        class277.method1890((byte) 102, var238);
                                        continue;
                                    }
                                    if (class53.field835 == 0 && (class112.field1733 && !class166.field2508 || class54.field854)) {
                                        continue;
                                    }
                                    class82.field1240++;
                                    byte var239 = 0;
                                    String var240 = var238.toLowerCase();
                                    if (var240.startsWith(class274.field4371)) {
                                        var238 = var238.substring(class274.field4371.length());
                                        var239 = 0;
                                    } else if (var240.startsWith(class24.field428)) {
                                        var239 = 1;
                                        var238 = var238.substring(class24.field428.length());
                                    } else if (var240.startsWith(class284.field4468)) {
                                        var239 = 2;
                                        var238 = var238.substring(class284.field4468.length());
                                    } else if (var240.startsWith(class147.field2171)) {
                                        var239 = 3;
                                        var238 = var238.substring(class147.field2171.length());
                                    } else if (var240.startsWith(class101.field1578)) {
                                        var238 = var238.substring(class101.field1578.length());
                                        var239 = 4;
                                    } else if (var240.startsWith(class237.field3735)) {
                                        var239 = 5;
                                        var238 = var238.substring(class237.field3735.length());
                                    } else if (var240.startsWith(class296.field4741)) {
                                        var239 = 6;
                                        var238 = var238.substring(class296.field4741.length());
                                    } else if (var240.startsWith(class7.field123)) {
                                        var239 = 7;
                                        var238 = var238.substring(class7.field123.length());
                                    } else if (var240.startsWith(class114.field1754)) {
                                        var239 = 8;
                                        var238 = var238.substring(class114.field1754.length());
                                    } else if (var240.startsWith(class57.field899)) {
                                        var239 = 9;
                                        var238 = var238.substring(class57.field899.length());
                                    } else if (var240.startsWith(class216.field3307)) {
                                        var239 = 10;
                                        var238 = var238.substring(class216.field3307.length());
                                    } else if (var240.startsWith(class244.field3905)) {
                                        var239 = 11;
                                        var238 = var238.substring(class244.field3905.length());
                                    } else if (class130.field1939 != 0) {
                                        if (var240.startsWith(class64.field1020)) {
                                            var239 = 0;
                                            var238 = var238.substring(class64.field1020.length());
                                        } else if (var240.startsWith(class6.field96)) {
                                            var238 = var238.substring(class6.field96.length());
                                            var239 = 1;
                                        } else if (var240.startsWith(class167.field2524)) {
                                            var239 = 2;
                                            var238 = var238.substring(class167.field2524.length());
                                        } else if (var240.startsWith(class178.field2735)) {
                                            var239 = 3;
                                            var238 = var238.substring(class178.field2735.length());
                                        } else if (var240.startsWith(class252.field4021)) {
                                            var238 = var238.substring(class252.field4021.length());
                                            var239 = 4;
                                        } else if (var240.startsWith(class244.field3895)) {
                                            var238 = var238.substring(class244.field3895.length());
                                            var239 = 5;
                                        } else if (var240.startsWith(class9.field161)) {
                                            var239 = 6;
                                            var238 = var238.substring(class9.field161.length());
                                        } else if (var240.startsWith(class42.field702)) {
                                            var238 = var238.substring(class42.field702.length());
                                            var239 = 7;
                                        } else if (var240.startsWith(class126.field1893)) {
                                            var239 = 8;
                                            var238 = var238.substring(class126.field1893.length());
                                        } else if (var240.startsWith(class265.field4189)) {
                                            var239 = 9;
                                            var238 = var238.substring(class265.field4189.length());
                                        } else if (var240.startsWith(class48.field797)) {
                                            var239 = 10;
                                            var238 = var238.substring(class48.field797.length());
                                        } else if (var240.startsWith(class297.field4778)) {
                                            var238 = var238.substring(class297.field4778.length());
                                            var239 = 11;
                                        }
                                    }
                                    String var241 = var238.toLowerCase();
                                    byte var242 = 0;
                                    if (var241.startsWith(class172.field2646)) {
                                        var242 = 1;
                                        var238 = var238.substring(class172.field2646.length());
                                    } else if (var241.startsWith(class294.field4572)) {
                                        var242 = 2;
                                        var238 = var238.substring(class294.field4572.length());
                                    } else if (var241.startsWith(class171.field2585)) {
                                        var242 = 3;
                                        var238 = var238.substring(class171.field2585.length());
                                    } else if (var241.startsWith(class64.field1010)) {
                                        var242 = 4;
                                        var238 = var238.substring(class64.field1010.length());
                                    } else if (var241.startsWith(class240.field3827)) {
                                        var238 = var238.substring(class240.field3827.length());
                                        var242 = 5;
                                    } else if (class130.field1939 != 0) {
                                        if (var241.startsWith(class98.field1570)) {
                                            var238 = var238.substring(class98.field1570.length());
                                            var242 = 1;
                                        } else if (var241.startsWith(class222.field3404)) {
                                            var238 = var238.substring(class222.field3404.length());
                                            var242 = 2;
                                        } else if (var241.startsWith(class2.field40)) {
                                            var238 = var238.substring(class2.field40.length());
                                            var242 = 3;
                                        } else if (var241.startsWith(class288.field4503)) {
                                            var242 = 4;
                                            var238 = var238.substring(class288.field4503.length());
                                        } else if (var241.startsWith(class270.field4281)) {
                                            var242 = 5;
                                            var238 = var238.substring(class270.field4281.length());
                                        }
                                    }
                                    class240.field3826.method1762(129, true);
                                    class240.field3826.method305(0, true);
                                    int var243 = class240.field3826.field541;
                                    class240.field3826.method305(var239, true);
                                    class240.field3826.method305(var242, true);
                                    class58.method478(class240.field3826, var238, 29963);
                                    class240.field3826.method309(class240.field3826.field541 - var243, !arg0);
                                    continue;
                                }
                                if (var517 == 5009) {
                                    var7 -= 2;
                                    String var244 = class290.field4510[var7 + 1];
                                    String var245 = class290.field4510[var7];
                                    if (class53.field835 != 0 || (!class112.field1733 || class166.field2508) && !class54.field854) {
                                        class3.field49++;
                                        class240.field3826.method1762(114, !arg0);
                                        class240.field3826.method305(0, true);
                                        int var246 = class240.field3826.field541;
                                        class240.field3826.method313(-6968, class170.method1223(true, var245));
                                        class58.method478(class240.field3826, var244, 29963);
                                        class240.field3826.method309(class240.field3826.field541 - var246, !arg0);
                                    }
                                    continue;
                                }
                                if (var517 == 5010) {
                                    var6--;
                                    int var247 = class198.field3084[var6];
                                    String var248 = null;
                                    if (var247 < 100) {
                                        var248 = class152.field2251[var247];
                                    }
                                    if (var248 == null) {
                                        var248 = "";
                                    }
                                    class290.field4510[var7++] = var248;
                                    continue;
                                }
                                if (var517 == 5011) {
                                    var6--;
                                    int var249 = class198.field3084[var6];
                                    String var250 = null;
                                    if (var249 < 100) {
                                        var250 = class61.field966[var249];
                                    }
                                    if (var250 == null) {
                                        var250 = "";
                                    }
                                    class290.field4510[var7++] = var250;
                                    continue;
                                }
                                if (var517 == 5012) {
                                    var6--;
                                    int var251 = class198.field3084[var6];
                                    int var252 = -1;
                                    if (var251 < 100) {
                                        var252 = class174.field2677[var251];
                                    }
                                    class198.field3084[var6++] = var252;
                                    continue;
                                }
                                if (var517 == 5015) {
                                    String var253;
                                    if (class263.field4168 == null || class263.field4168.field2064 == null) {
                                        var253 = class76.field1174;
                                    } else {
                                        var253 = class263.field4168.method1005(-13232);
                                    }
                                    class290.field4510[var7++] = var253;
                                    continue;
                                }
                                if (var517 == 5016) {
                                    class198.field3084[var6++] = class182.field2876;
                                    continue;
                                }
                                if (var517 == 5017) {
                                    class198.field3084[var6++] = class166.field2519;
                                    continue;
                                }
                                if (var517 == 5050) {
                                    var6--;
                                    int var254 = class198.field3084[var6];
                                    class290.field4510[var7++] = class141.method1031(-122, var254).field4933;
                                    continue;
                                }
                                if (var517 == 5051) {
                                    var6--;
                                    int var255 = class198.field3084[var6];
                                    class308 var256 = class141.method1031(-124, var255);
                                    if (var256.field4943 == null) {
                                        class198.field3084[var6++] = 0;
                                    } else {
                                        class198.field3084[var6++] = var256.field4943.length;
                                    }
                                    continue;
                                }
                                if (var517 == 5052) {
                                    var6 -= 2;
                                    int var257 = class198.field3084[var6 + 1];
                                    int var258 = class198.field3084[var6];
                                    class308 var259 = class141.method1031(-128, var258);
                                    int var260 = var259.field4943[var257];
                                    class198.field3084[var6++] = var260;
                                    continue;
                                }
                                if (var517 == 5053) {
                                    var6--;
                                    int var261 = class198.field3084[var6];
                                    class308 var262 = class141.method1031(-128, var261);
                                    if (var262.field4942 == null) {
                                        class198.field3084[var6++] = 0;
                                    } else {
                                        class198.field3084[var6++] = var262.field4942.length;
                                    }
                                    continue;
                                }
                                if (var517 == 5054) {
                                    var6 -= 2;
                                    int var263 = class198.field3084[var6];
                                    int var264 = class198.field3084[var6 + 1];
                                    class198.field3084[var6++] = class141.method1031(-127, var263).field4942[var264];
                                    continue;
                                }
                                if (var517 == 5055) {
                                    var6--;
                                    int var265 = class198.field3084[var6];
                                    class290.field4510[var7++] = class261.method1749(45, var265).method1064((byte) -91);
                                    continue;
                                }
                                if (var517 == 5056) {
                                    var6--;
                                    int var266 = class198.field3084[var6];
                                    class147 var267 = class261.method1749(-126, var266);
                                    if (var267.field2166 == null) {
                                        class198.field3084[var6++] = 0;
                                    } else {
                                        class198.field3084[var6++] = var267.field2166.length;
                                    }
                                    continue;
                                }
                                if (var517 == 5057) {
                                    var6 -= 2;
                                    int var268 = class198.field3084[var6];
                                    int var269 = class198.field3084[var6 + 1];
                                    class198.field3084[var6++] = class261.method1749(-120, var268).field2166[var269];
                                    continue;
                                }
                                if (var517 == 5058) {
                                    class190.field2983 = new class121();
                                    var6--;
                                    class190.field2983.field1827 = class198.field3084[var6];
                                    class190.field2983.field1828 = class261.method1749(-11, class190.field2983.field1827);
                                    class190.field2983.field1824 = new int[class190.field2983.field1828.method1065(42)];
                                    continue;
                                }
                                if (var517 == 5059) {
                                    class240.field3826.method1762(77, !arg0);
                                    class112.field1730++;
                                    class240.field3826.method305(0, !arg0);
                                    int var270 = class240.field3826.field541;
                                    class240.field3826.method305(0, true);
                                    class240.field3826.method281((byte) -112, class190.field2983.field1827);
                                    class190.field2983.field1828.method1070(class240.field3826, -15820, class190.field2983.field1824);
                                    class240.field3826.method309(class240.field3826.field541 - var270, true);
                                    continue;
                                }
                                if (var517 == 5060) {
                                    var7--;
                                    String var271 = class290.field4510[var7];
                                    class240.field3826.method1762(44, true);
                                    class240.field3826.method305(0, true);
                                    class151.field2234++;
                                    int var272 = class240.field3826.field541;
                                    class240.field3826.method313(-6968, class170.method1223(!arg0, var271));
                                    class240.field3826.method281((byte) -123, class190.field2983.field1827);
                                    class190.field2983.field1828.method1070(class240.field3826, -15820, class190.field2983.field1824);
                                    class240.field3826.method309(class240.field3826.field541 - var272, true);
                                    continue;
                                }
                                if (var517 == 5061) {
                                    class240.field3826.method1762(77, true);
                                    class112.field1730++;
                                    class240.field3826.method305(0, true);
                                    int var273 = class240.field3826.field541;
                                    class240.field3826.method305(1, true);
                                    class240.field3826.method281((byte) -110, class190.field2983.field1827);
                                    class190.field2983.field1828.method1070(class240.field3826, -15820, class190.field2983.field1824);
                                    class240.field3826.method309(class240.field3826.field541 - var273, true);
                                    continue;
                                }
                                if (var517 == 5062) {
                                    var6 -= 2;
                                    int var274 = class198.field3084[var6];
                                    int var275 = class198.field3084[var6 + 1];
                                    class198.field3084[var6++] = class141.method1031(-126, var274).field4946[var275];
                                    continue;
                                }
                                if (var517 == 5063) {
                                    var6 -= 2;
                                    int var276 = class198.field3084[var6 + 1];
                                    int var277 = class198.field3084[var6];
                                    class198.field3084[var6++] = class141.method1031(-125, var277).field4939[var276];
                                    continue;
                                }
                                if (var517 == 5064) {
                                    var6 -= 2;
                                    int var278 = class198.field3084[var6 + 1];
                                    int var279 = class198.field3084[var6];
                                    if (var278 == -1) {
                                        class198.field3084[var6++] = -1;
                                    } else {
                                        class198.field3084[var6++] = class141.method1031(-121, var279).method2063((char) var278, 32448);
                                    }
                                    continue;
                                }
                                if (var517 == 5065) {
                                    var6 -= 2;
                                    int var280 = class198.field3084[var6 + 1];
                                    int var281 = class198.field3084[var6];
                                    if (var280 == -1) {
                                        class198.field3084[var6++] = -1;
                                    } else {
                                        class198.field3084[var6++] = class141.method1031(-124, var281).method2059(!arg0, (char) var280);
                                    }
                                    continue;
                                }
                                if (var517 == 5066) {
                                    var6--;
                                    int var282 = class198.field3084[var6];
                                    class198.field3084[var6++] = class261.method1749(99, var282).method1065(61);
                                    continue;
                                }
                                if (var517 == 5067) {
                                    var6 -= 2;
                                    int var283 = class198.field3084[var6];
                                    int var284 = class198.field3084[var6 + 1];
                                    int var285 = class261.method1749(9, var283).method1063((byte) -112, var284);
                                    class198.field3084[var6++] = var285;
                                    continue;
                                }
                                if (var517 == 5068) {
                                    var6 -= 2;
                                    int var286 = class198.field3084[var6];
                                    int var287 = class198.field3084[var6 + 1];
                                    class190.field2983.field1824[var286] = var287;
                                    continue;
                                }
                                if (var517 == 5069) {
                                    var6 -= 2;
                                    int var288 = class198.field3084[var6];
                                    int var289 = class198.field3084[var6 + 1];
                                    class190.field2983.field1824[var288] = var289;
                                    continue;
                                }
                                if (var517 == 5070) {
                                    var6 -= 3;
                                    int var290 = class198.field3084[var6 + 1];
                                    int var291 = class198.field3084[var6 + 2];
                                    int var292 = class198.field3084[var6];
                                    class147 var293 = class261.method1749(-116, var292);
                                    if (var293.method1063((byte) -105, var290) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class198.field3084[var6++] = var293.method1062(var291, var290, (byte) 126);
                                    continue;
                                }
                                if (var517 == 5071) {
                                    var7--;
                                    String var294 = class290.field4510[var7];
                                    var6--;
                                    boolean var295 = class198.field3084[var6] == 1;
                                    class55.method464(var295, (byte) -93, var294);
                                    class198.field3084[var6++] = class121.field1819;
                                    continue;
                                }
                                if (var517 == 5072) {
                                    if (class162.field2443 != null && class204.field3150 < class121.field1819) {
                                        class198.field3084[var6++] = class118.method863(class162.field2443[class204.field3150++], 65535);
                                        continue;
                                    }
                                    class198.field3084[var6++] = -1;
                                    continue;
                                }
                                if (var517 == 5073) {
                                    class204.field3150 = 0;
                                    continue;
                                }
                            } else if (var517 < 5200) {
                                if (var517 == 5100) {
                                    if (class292.field4537[86]) {
                                        class198.field3084[var6++] = 1;
                                    } else {
                                        class198.field3084[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5101) {
                                    if (class292.field4537[82]) {
                                        class198.field3084[var6++] = 1;
                                    } else {
                                        class198.field3084[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5102) {
                                    if (class292.field4537[81]) {
                                        class198.field3084[var6++] = 1;
                                    } else {
                                        class198.field3084[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var517 < 5300) {
                                if (var517 == 5200) {
                                    var6--;
                                    class28.method234(class198.field3084[var6], 13281);
                                    continue;
                                }
                                if (var517 == 5201) {
                                    class198.field3084[var6++] = class257.method1733((byte) 87);
                                    continue;
                                }
                                if (var517 == 5202) {
                                    var6--;
                                    class53.method447(class198.field3084[var6], (byte) -112);
                                    continue;
                                }
                                if (var517 == 5203) {
                                    var7--;
                                    class143.method1042(class290.field4510[var7], 22062);
                                    continue;
                                }
                                if (var517 == 5204) {
                                    class290.field4510[var7 - 1] = class54.method456(class290.field4510[var7 - 1], 0);
                                    continue;
                                }
                                if (var517 == 5205) {
                                    var6--;
                                    class164.method1186(class198.field3084[var6], 0, -1, -1);
                                    continue;
                                }
                                if (var517 == 5206) {
                                    var6--;
                                    int var126 = class198.field3084[var6];
                                    class303 var127 = class98.method763(false, var126 >> 14 & 0x3FFF, var126 & 0x3FFF);
                                    if (var127 == null) {
                                        class198.field3084[var6++] = -1;
                                    } else {
                                        class198.field3084[var6++] = var127.field4861;
                                    }
                                    continue;
                                }
                                if (var517 == 5207) {
                                    var6--;
                                    class303 var128 = class214.method1479(class198.field3084[var6], 0);
                                    if (var128 != null && var128.field4874 != null) {
                                        class290.field4510[var7++] = var128.field4874;
                                        continue;
                                    }
                                    class290.field4510[var7++] = "";
                                    continue;
                                }
                                if (var517 == 5208) {
                                    class198.field3084[var6++] = class266.field4203;
                                    class198.field3084[var6++] = class117.field1784;
                                    continue;
                                }
                                if (var517 == 5209) {
                                    class198.field3084[var6++] = class129.field1920 + class147.field2165;
                                    class198.field3084[var6++] = class92.field1475 + class141.field2107 - class175.field2698 - 1;
                                    continue;
                                }
                                if (var517 == 5210) {
                                    var6--;
                                    int var129 = class198.field3084[var6];
                                    class303 var130 = class214.method1479(var129, 0);
                                    if (var130 == null) {
                                        class198.field3084[var6++] = 0;
                                        class198.field3084[var6++] = 0;
                                    } else {
                                        class198.field3084[var6++] = class118.method863(var130.field4875 >> 14, 16383);
                                        class198.field3084[var6++] = class118.method863(16383, var130.field4875);
                                    }
                                    continue;
                                }
                                if (var517 == 5211) {
                                    var6--;
                                    int var131 = class198.field3084[var6];
                                    class303 var132 = class214.method1479(var131, 0);
                                    if (var132 == null) {
                                        class198.field3084[var6++] = 0;
                                        class198.field3084[var6++] = 0;
                                    } else {
                                        class198.field3084[var6++] = var132.field4871 - var132.field4864;
                                        class198.field3084[var6++] = var132.field4863 - var132.field4865;
                                    }
                                    continue;
                                }
                                if (var517 == 5212) {
                                    int var133 = class27.method223(false);
                                    int var134 = 0;
                                    String var135;
                                    if (var133 == -1) {
                                        var135 = "";
                                    } else {
                                        var135 = class183.field2895.field4797[var133];
                                        var134 = class183.field2895.method1990((byte) -57, var133);
                                    }
                                    String var136 = class260.method1743(" ", "<br>", var135, -1);
                                    class290.field4510[var7++] = var136;
                                    class198.field3084[var6++] = var134;
                                    continue;
                                }
                                if (var517 == 5213) {
                                    int var137 = class142.method1037(-126);
                                    int var138 = 0;
                                    String var139;
                                    if (var137 == -1) {
                                        var139 = "";
                                    } else {
                                        var139 = class183.field2895.field4797[var137];
                                        var138 = class183.field2895.method1990((byte) -57, var137);
                                    }
                                    String var140 = class260.method1743(" ", "<br>", var139, -1);
                                    class290.field4510[var7++] = var140;
                                    class198.field3084[var6++] = var138;
                                    continue;
                                }
                                if (var517 == 5214) {
                                    var6--;
                                    int var141 = class198.field3084[var6];
                                    class303 var142 = client.method1149(-3);
                                    if (var142 != null) {
                                        int[] var143 = var142.method2033((var141 & 0xFFFC919) >> 14, 0, var141 & 0x3FFF, (var141 & 0x383F1A44) >> 28);
                                        if (var143 != null) {
                                            class61.method496(var143[1], var143[2], -78);
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 5215) {
                                    var6 -= 2;
                                    int var144 = class198.field3084[var6 + 1];
                                    boolean var145 = false;
                                    int var146 = class198.field3084[var6];
                                    class79 var147 = class141.method1029((byte) 117, (var146 & 0xFFFC7F5) >> 14, var146 & 0x3FFF);
                                    for (class303 var148 = (class303) var147.method620((byte) 115); var148 != null; var148 = (class303) var147.method626((byte) 116)) {
                                        if (var148.field4861 == var144) {
                                            var145 = true;
                                            break;
                                        }
                                    }
                                    if (var145) {
                                        class198.field3084[var6++] = 1;
                                    } else {
                                        class198.field3084[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5216) {
                                    var6--;
                                    int var149 = class198.field3084[var6];
                                    class283.method1909(var149, (byte) -120);
                                    continue;
                                }
                                if (var517 == 5217) {
                                    var6--;
                                    int var150 = class198.field3084[var6];
                                    if (class120.method911((byte) -109, var150)) {
                                        class198.field3084[var6++] = 1;
                                    } else {
                                        class198.field3084[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var517 == 5218) {
                                    var6--;
                                    int var151 = class198.field3084[var6];
                                    class303 var152 = class214.method1479(var151, 0);
                                    if (var152 == null) {
                                        class198.field3084[var6++] = -1;
                                    } else {
                                        class198.field3084[var6++] = var152.field4862;
                                    }
                                    continue;
                                }
                                if (var517 == 5219) {
                                    var7--;
                                    class116.method853((byte) 82, class290.field4510[var7]);
                                    continue;
                                }
                                if (var517 == 5220) {
                                    class198.field3084[var6++] = class298.field4807 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 5221) {
                                    var6--;
                                    int var153 = class198.field3084[var6];
                                    class61.method496((var153 & 0xFFFF608) >> 14, var153 & 0x3FFF, -56);
                                    continue;
                                }
                                if (var517 == 5222) {
                                    class303 var154 = client.method1149(-3);
                                    if (var154 == null) {
                                        class198.field3084[var6++] = -1;
                                        class198.field3084[var6++] = -1;
                                    } else {
                                        int[] var155 = var154.method2028(class129.field1920 + class147.field2165, (byte) -24, class92.field1475 + class141.field2107 - class175.field2698 - 1);
                                        if (var155 == null) {
                                            class198.field3084[var6++] = -1;
                                            class198.field3084[var6++] = -1;
                                        } else {
                                            class198.field3084[var6++] = var155[1];
                                            class198.field3084[var6++] = var155[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 5223) {
                                    var6 -= 2;
                                    int var156 = class198.field3084[var6];
                                    int var157 = class198.field3084[var6 + 1];
                                    class164.method1186(var156, 0, var157 & 0x3FFF, (var157 & 0xFFFC55F) >> 14);
                                    continue;
                                }
                                if (var517 == 5224) {
                                    var6--;
                                    int var158 = class198.field3084[var6];
                                    class303 var159 = client.method1149(-3);
                                    if (var159 == null) {
                                        class198.field3084[var6++] = -1;
                                        class198.field3084[var6++] = -1;
                                    } else {
                                        int[] var160 = var159.method2033(var158 >> 14 & 0x3FFF, 0, var158 & 0x3FFF, var158 >> 28 & 0x3);
                                        if (var160 == null) {
                                            class198.field3084[var6++] = -1;
                                            class198.field3084[var6++] = -1;
                                        } else {
                                            class198.field3084[var6++] = var160[1];
                                            class198.field3084[var6++] = var160[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var517 == 5225) {
                                    var6--;
                                    int var161 = class198.field3084[var6];
                                    class303 var162 = client.method1149(-3);
                                    if (var162 == null) {
                                        class198.field3084[var6++] = -1;
                                        class198.field3084[var6++] = -1;
                                    } else {
                                        int[] var163 = var162.method2028(var161 >> 14 & 0x3FFF, (byte) -24, var161 & 0x3FFF);
                                        if (var163 == null) {
                                            class198.field3084[var6++] = -1;
                                            class198.field3084[var6++] = -1;
                                        } else {
                                            class198.field3084[var6++] = var163[1];
                                            class198.field3084[var6++] = var163[2];
                                        }
                                    }
                                    continue;
                                }
                            } else if (var517 < 5400) {
                                if (var517 == 5300) {
                                    var6 -= 2;
                                    class198.field3084[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 5301) {
                                    continue;
                                }
                                if (var517 == 5302) {
                                    class198.field3084[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 5303) {
                                    var6--;
                                    class198.field3084[var6++] = 0;
                                    class198.field3084[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 5305) {
                                    byte var164 = -1;
                                    class198.field3084[var6++] = var164;
                                    continue;
                                }
                                if (var517 == 5306) {
                                    class198.field3084[var6++] = class194.method1382(true);
                                    continue;
                                }
                                if (var517 == 5307) {
                                    var6--;
                                    int var165 = class198.field3084[var6];
                                    if (var165 < 0 || var165 > 2) {
                                        var165 = 0;
                                    }
                                    class74.method581(-1, false, -1, -4, var165);
                                    continue;
                                }
                                if (var517 == 5308) {
                                    class198.field3084[var6++] = class42.field709;
                                    continue;
                                }
                                if (var517 == 5309) {
                                    var6--;
                                    int var166 = class198.field3084[var6];
                                    if (var166 < 0 || var166 > 2) {
                                        var166 = 0;
                                    }
                                    class42.field709 = var166;
                                    class67.method543(class123.field1863, (byte) -39);
                                    continue;
                                }
                            } else if (var517 < 5500) {
                                if (var517 == 5400) {
                                    class179.field2806++;
                                    var7 -= 2;
                                    String var167 = class290.field4510[var7];
                                    String var168 = class290.field4510[var7 + 1];
                                    var6--;
                                    int var169 = class198.field3084[var6];
                                    class240.field3826.method1762(12, true);
                                    class240.field3826.method305(class74.method586(21321, var167) + class74.method586(21321, var168) + 1, true);
                                    class240.field3826.method288(var167, (byte) -43);
                                    class240.field3826.method288(var168, (byte) -43);
                                    class240.field3826.method305(var169, true);
                                    continue;
                                }
                                if (var517 == 5401) {
                                    var6 -= 2;
                                    class197.field3075[class198.field3084[var6]] = (short) class301.method2015(class198.field3084[var6 + 1], -4357);
                                    class162.method1171(128);
                                    class121.method916((byte) 114);
                                    class40.method355((byte) 127);
                                    class92.method699(-31932);
                                    class67.method545(100);
                                    continue;
                                }
                                if (var517 == 5405) {
                                    var6 -= 2;
                                    int var170 = class198.field3084[var6 + 1];
                                    int var171 = class198.field3084[var6];
                                    if (var171 >= 0 && var171 < 2) {
                                        class285.field4483[var171] = new int[var170 << 1][4];
                                    }
                                    continue;
                                }
                                if (var517 == 5406) {
                                    var6 -= 7;
                                    int var172 = class198.field3084[var6];
                                    int var173 = class198.field3084[var6 + 1] << 1;
                                    int var174 = class198.field3084[var6 + 3];
                                    int var175 = class198.field3084[var6 + 4];
                                    int var176 = class198.field3084[var6 + 2];
                                    int var177 = class198.field3084[var6 + 5];
                                    int var178 = class198.field3084[var6 + 6];
                                    if (var172 >= 0 && var172 < 2 && class285.field4483[var172] != null && var173 >= 0 && class285.field4483[var172].length > var173) {
                                        class285.field4483[var172][var173] = new int[] { class118.method863(16383, var176 >> 14) * 128, var174, class118.method863(var176, 16383) * 128, var178 };
                                        class285.field4483[var172][var173 + 1] = new int[] { class118.method863(var175 >> 14, 16383) * 128, var177, class118.method863(var175, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var517 == 5407) {
                                    var6--;
                                    int var179 = class285.field4483[class198.field3084[var6]].length >> 1;
                                    class198.field3084[var6++] = var179;
                                    continue;
                                }
                                if (var517 == 5411) {
                                    if (class170.field2582 == null) {
                                        class118.method865(68, class216.method1494(-127), false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var517 == 5419) {
                                    String var180 = "";
                                    if (class142.field2133 != null) {
                                        if (class142.field2133.field2080 == null) {
                                            var180 = class122.method920(class142.field2133.field2083, -1);
                                        } else {
                                            var180 = (String) class142.field2133.field2080;
                                        }
                                    }
                                    class290.field4510[var7++] = var180;
                                    continue;
                                }
                                if (var517 == 5420) {
                                    class198.field3084[var6++] = class4.field60 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 5421) {
                                    var6--;
                                    boolean var181 = class198.field3084[var6] == 1;
                                    var7--;
                                    String var182 = class290.field4510[var7];
                                    String var183 = class216.method1494(-126) + var182;
                                    if (class170.field2582 != null || var181 && class4.field60 != 3 && class4.field59.startsWith("win") && !class60.field958) {
                                        class290.field4514 = var181;
                                        class58.field937 = var183;
                                        class82.field1239 = class123.field1863.method22(0, var183);
                                        continue;
                                    }
                                    class118.method865(64, var183, var181);
                                    continue;
                                }
                                if (var517 == 5422) {
                                    var7 -= 2;
                                    String var184 = class290.field4510[var7 + 1];
                                    String var185 = class290.field4510[var7];
                                    var6--;
                                    int var186 = class198.field3084[var6];
                                    if (var185.length() > 0) {
                                        if (class173.field2659 == null) {
                                            class173.field2659 = new String[class60.field946[class152.field2248]];
                                        }
                                        class173.field2659[var186] = var185;
                                    }
                                    if (var184.length() > 0) {
                                        if (class155.field2311 == null) {
                                            class155.field2311 = new String[class60.field946[class152.field2248]];
                                        }
                                        class155.field2311[var186] = var184;
                                    }
                                    continue;
                                }
                                if (var517 == 5423) {
                                    var7--;
                                    System.out.println(class290.field4510[var7]);
                                    continue;
                                }
                                if (var517 == 5424) {
                                    var6 -= 11;
                                    class36.field618 = class198.field3084[var6];
                                    class250.field4013 = class198.field3084[var6 + 1];
                                    class294.field4565 = class198.field3084[var6 + 2];
                                    class77.field1179 = class198.field3084[var6 + 3];
                                    class238.field3759 = class198.field3084[var6 + 4];
                                    class125.field1887 = class198.field3084[var6 + 5];
                                    class295.field4658 = class198.field3084[var6 + 6];
                                    class276.field4394 = class198.field3084[var6 + 7];
                                    class173.field2660 = class198.field3084[var6 + 8];
                                    class163.field2453 = class198.field3084[var6 + 9];
                                    class200.field3102 = class198.field3084[var6 + 10];
                                    class246.field3910.method697(43, class238.field3759);
                                    class246.field3910.method697(-96, class125.field1887);
                                    class246.field3910.method697(41, class295.field4658);
                                    class246.field3910.method697(-117, class276.field4394);
                                    class246.field3910.method697(-93, class173.field2660);
                                    class284.field4471 = true;
                                    continue;
                                }
                                if (var517 == 5425) {
                                    class261.method1750(81);
                                    class284.field4471 = false;
                                    continue;
                                }
                                if (var517 == 5426) {
                                    var6--;
                                    class166.field2516 = class198.field3084[var6];
                                    continue;
                                }
                                if (var517 == 5427) {
                                    var6 -= 2;
                                    class265.field4194 = class198.field3084[var6];
                                    class37.field631 = class198.field3084[var6 + 1];
                                    continue;
                                }
                                if (var517 == 5428) {
                                    var6 -= 2;
                                    int var187 = class198.field3084[var6];
                                    int var188 = class198.field3084[var6 + 1];
                                    class198.field3084[var6++] = class226.method1563(var187, false, var188) ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 5600) {
                                if (var517 == 5500) {
                                    var6 -= 4;
                                    int var189 = class198.field3084[var6 + 1];
                                    int var190 = class198.field3084[var6 + 2];
                                    int var191 = class198.field3084[var6];
                                    int var192 = class198.field3084[var6 + 3];
                                    class7.method48(var189, var190, false, -115, (var191 & 0x3FFF) - class159.field2379, var192, (var191 >> 14 & 0x3FFF) - class138.field2072);
                                    continue;
                                }
                                if (var517 == 5501) {
                                    var6 -= 4;
                                    int var193 = class198.field3084[var6 + 2];
                                    int var194 = class198.field3084[var6 + 1];
                                    int var195 = class198.field3084[var6];
                                    int var196 = class198.field3084[var6 + 3];
                                    class62.method501(var196, (var195 >> 14 & 0x3FFF) - class138.field2072, (byte) 118, (var195 & 0x3FFF) - class159.field2379, var194, var193);
                                    continue;
                                }
                                if (var517 == 5502) {
                                    var6 -= 6;
                                    int var197 = class198.field3084[var6];
                                    if (var197 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class263.field4169 = var197;
                                    int var198 = class198.field3084[var6 + 1];
                                    if ((var198 + 1) >= (class285.field4483[class263.field4169].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class222.field3502 = var198;
                                    class80.field1212 = 0;
                                    class15.field204 = class198.field3084[var6 + 2];
                                    class181.field2837 = class198.field3084[var6 + 3];
                                    int var199 = class198.field3084[var6 + 4];
                                    if (var199 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class91.field1421 = var199;
                                    int var200 = class198.field3084[var6 + 5];
                                    if (var200 + 1 >= class285.field4483[class91.field1421].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class282.field4451 = var200;
                                    class175.field2704 = 3;
                                    continue;
                                }
                                if (var517 == 5503) {
                                    class254.method1715(0);
                                    continue;
                                }
                                if (var517 == 5504) {
                                    var6 -= 2;
                                    class307.method2054(68, class198.field3084[var6], class198.field3084[var6 + 1]);
                                    continue;
                                }
                                if (var517 == 5505) {
                                    class198.field3084[var6++] = (int) class248.field3941;
                                    continue;
                                }
                                if (var517 == 5506) {
                                    class198.field3084[var6++] = (int) class50.field818;
                                    continue;
                                }
                                if (var517 == 5507) {
                                    class74.method590(-47);
                                    continue;
                                }
                                if (var517 == 5508) {
                                    class160.method1160(false);
                                    continue;
                                }
                                if (var517 == 5509) {
                                    class285.method1918(873626860);
                                    continue;
                                }
                                if (var517 == 5510) {
                                    class296.method1981(-65);
                                    continue;
                                }
                                if (var517 == 5512) {
                                    class178.method1265(5);
                                    continue;
                                }
                            } else if (var517 < 5700) {
                                if (var517 == 5600) {
                                    var6--;
                                    int var227 = class198.field3084[var6];
                                    var7 -= 2;
                                    String var228 = class290.field4510[var7 + 1];
                                    String var229 = class290.field4510[var7];
                                    if (class23.field382 == 10 && class233.field3686 == 0 && class278.field4411 == 0 && class128.field1918 == 0 && class92.field1459 == 0) {
                                        class91.method690(var228, -1, var229, var227);
                                    }
                                    continue;
                                }
                                if (var517 == 5601) {
                                    class234.method1607(102);
                                    continue;
                                }
                                if (var517 == 5602) {
                                    if (class278.field4411 == 0) {
                                        class129.field1921 = -2;
                                    }
                                    continue;
                                }
                                if (var517 == 5603) {
                                    var6 -= 4;
                                    if (class23.field382 == 10 && class233.field3686 == 0 && class278.field4411 == 0 && class128.field1918 == 0 && class92.field1459 == 0) {
                                        class239.method1636(class198.field3084[var6 + 3], -22860, class198.field3084[var6 + 1], class198.field3084[var6], class198.field3084[var6 + 2]);
                                    }
                                    continue;
                                }
                                if (var517 == 5604) {
                                    var7--;
                                    if (class23.field382 == 10 && class233.field3686 == 0 && class278.field4411 == 0 && class128.field1918 == 0 && class92.field1459 == 0) {
                                        class77.method607((byte) 107, class170.method1223(true, class290.field4510[var7]));
                                    }
                                    continue;
                                }
                                if (var517 == 5605) {
                                    var6 -= 7;
                                    var7 -= 3;
                                    if (class23.field382 == 10 && class233.field3686 == 0 && class278.field4411 == 0 && class128.field1918 == 0 && class92.field1459 == 0) {
                                        class33.method323(class198.field3084[var6 + 5] == 1, class290.field4510[var7 + 1], class198.field3084[var6 + 1], class198.field3084[var6 + 3], class198.field3084[var6 + 2], class198.field3084[var6], class198.field3084[var6 + 6] == 1, 0, class198.field3084[var6 + 4] == 1, class290.field4510[var7 + 2], class170.method1223(!arg0, class290.field4510[var7]));
                                    }
                                    continue;
                                }
                                if (var517 == 5606) {
                                    if (class128.field1918 == 0) {
                                        class231.field3667 = -2;
                                    }
                                    continue;
                                }
                                if (var517 == 5607) {
                                    class198.field3084[var6++] = class129.field1921;
                                    continue;
                                }
                                if (var517 == 5608) {
                                    class198.field3084[var6++] = class234.field3691;
                                    continue;
                                }
                                if (var517 == 5609) {
                                    class198.field3084[var6++] = class231.field3667;
                                    continue;
                                }
                                if (var517 == 5610) {
                                    for (int var230 = 0; var230 < 5; var230++) {
                                        class290.field4510[var7++] = var230 >= class163.field2450.length ? "" : class30.method248(125, class163.field2450[var230]);
                                    }
                                    class163.field2450 = null;
                                    continue;
                                }
                                if (var517 == 5611) {
                                    class198.field3084[var6++] = class216.field3315;
                                    continue;
                                }
                            } else if (var517 < 6100) {
                                if (var517 == 6001) {
                                    var6--;
                                    int var201 = class198.field3084[var6];
                                    if (var201 < 1) {
                                        var201 = 1;
                                    }
                                    if (var201 > 4) {
                                        var201 = 4;
                                    }
                                    class150.field2228 = var201;
                                    if (class150.field2228 == 1) {
                                        class224.method1555(0.9F);
                                    }
                                    if (class150.field2228 == 2) {
                                        class224.method1555(0.8F);
                                    }
                                    if (class150.field2228 == 3) {
                                        class224.method1555(0.7F);
                                    }
                                    if (class150.field2228 == 4) {
                                        class224.method1555(0.6F);
                                    }
                                    class121.method916((byte) 114);
                                    class67.method543(class123.field1863, (byte) -41);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6002) {
                                    var6--;
                                    class129.method958(0, class198.field3084[var6] == 1);
                                    class167.method1213(0);
                                    class152.method1102((byte) -58);
                                    class166.method1207((byte) -56);
                                    class67.method543(class123.field1863, (byte) -110);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6003) {
                                    var6--;
                                    class109.field1685 = class198.field3084[var6] == 1;
                                    class166.method1207((byte) -90);
                                    class67.method543(class123.field1863, (byte) -95);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6005) {
                                    var6--;
                                    class292.field4536 = class198.field3084[var6] == 1;
                                    class152.method1102((byte) 126);
                                    class67.method543(class123.field1863, (byte) -57);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6006) {
                                    var6--;
                                    class201.field3105 = class198.field3084[var6] == 1;
                                    ((class293) class224.field3596).method1943(true, !class201.field3105);
                                    class67.method543(class123.field1863, (byte) -43);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6007) {
                                    var6--;
                                    class140.field2089 = class198.field3084[var6] == 1;
                                    class67.method543(class123.field1863, (byte) -2);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6008) {
                                    var6--;
                                    class178.field2730 = class198.field3084[var6] == 1;
                                    class67.method543(class123.field1863, (byte) -42);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6009) {
                                    var6--;
                                    class106.field1665 = class198.field3084[var6] == 1;
                                    class67.method543(class123.field1863, (byte) -92);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6010) {
                                    var6--;
                                    class216.field3309 = class198.field3084[var6] == 1;
                                    class67.method543(class123.field1863, (byte) -2);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6011) {
                                    var6--;
                                    int var202 = class198.field3084[var6];
                                    if (var202 < 0 || var202 > 2) {
                                        var202 = 0;
                                    }
                                    client.field2386 = var202;
                                    class67.method543(class123.field1863, (byte) -79);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6012) {
                                    var6--;
                                    class142.field2111 = class198.field3084[var6] == 1;
                                    if (class150.field2228 == 1) {
                                        class224.method1555(0.9F);
                                    }
                                    if (class150.field2228 == 2) {
                                        class224.method1555(0.8F);
                                    }
                                    if (class150.field2228 == 3) {
                                        class224.method1555(0.7F);
                                    }
                                    if (class150.field2228 == 4) {
                                        class224.method1555(0.6F);
                                    }
                                    class152.method1102((byte) 125);
                                    class67.method543(class123.field1863, (byte) -8);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6014) {
                                    var6--;
                                    class218.field3335 = class198.field3084[var6] == 1;
                                    class67.method543(class123.field1863, (byte) -44);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6015) {
                                    var6--;
                                    class40.field678 = class198.field3084[var6] == 1;
                                    class67.method543(class123.field1863, (byte) -94);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6016) {
                                    var6--;
                                    int var203 = class198.field3084[var6];
                                    if (var203 < 0 || var203 > 2) {
                                        var203 = 0;
                                    }
                                    class52.field825 = var203;
                                    continue;
                                }
                                if (var517 == 6017) {
                                    var6--;
                                    class189.field2971 = class198.field3084[var6] == 1;
                                    class189.method1347((byte) 113);
                                    class67.method543(class123.field1863, (byte) -49);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6018) {
                                    var6--;
                                    int var204 = class198.field3084[var6];
                                    if (var204 < 0) {
                                        var204 = 0;
                                    }
                                    if (var204 > 127) {
                                        var204 = 127;
                                    }
                                    class174.field2684 = var204;
                                    class67.method543(class123.field1863, (byte) -62);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6019) {
                                    var6--;
                                    int var205 = class198.field3084[var6];
                                    if (var205 < 0) {
                                        var205 = 0;
                                    }
                                    if (var205 > 255) {
                                        var205 = 255;
                                    }
                                    if (class85.field1274 != var205) {
                                        if (class85.field1274 == 0 && class75.field1164 != -1) {
                                            class104.method791(0, class75.field1164, false, 103, class205.field3153, var205);
                                            class41.field697 = false;
                                        } else if (var205 == 0) {
                                            class180.method1290((byte) 117);
                                            class41.field697 = false;
                                        } else {
                                            class252.method1708(var205, 0);
                                        }
                                        class85.field1274 = var205;
                                    }
                                    class67.method543(class123.field1863, (byte) -55);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6020) {
                                    var6--;
                                    int var206 = class198.field3084[var6];
                                    if (var206 < 0) {
                                        var206 = 0;
                                    }
                                    if (var206 > 127) {
                                        var206 = 127;
                                    }
                                    class70.field1106 = var206;
                                    class67.method543(class123.field1863, (byte) -101);
                                    class24.field426 = false;
                                    continue;
                                }
                                if (var517 == 6021) {
                                    var6--;
                                    class183.field2893 = class198.field3084[var6] == 1;
                                    class166.method1207((byte) -99);
                                    continue;
                                }
                                if (var517 == 6023) {
                                    var6--;
                                    int var207 = class198.field3084[var6];
                                    if (var207 < 0) {
                                        var207 = 0;
                                    }
                                    boolean var208 = false;
                                    if (var207 > 2) {
                                        var207 = 2;
                                    }
                                    if (class49.field805 < 96) {
                                        var207 = 0;
                                        var208 = true;
                                    }
                                    class249.method1684(var207);
                                    class67.method543(class123.field1863, (byte) -55);
                                    class24.field426 = false;
                                    class198.field3084[var6++] = var208 ? 0 : 1;
                                    continue;
                                }
                                if (var517 == 6024) {
                                    var6--;
                                    int var209 = class198.field3084[var6];
                                    if (var209 < 0 || var209 > 2) {
                                        var209 = 0;
                                    }
                                    class94.field1483 = var209;
                                    class67.method543(class123.field1863, (byte) -86);
                                    continue;
                                }
                                if (var517 == 6027) {
                                    var6--;
                                    continue;
                                }
                                if (var517 == 6028) {
                                    var6--;
                                    class230.field3648 = class198.field3084[var6] != 0;
                                    class67.method543(class123.field1863, (byte) -68);
                                    continue;
                                }
                            } else if (var517 < 6200) {
                                if (var517 == 6101) {
                                    class198.field3084[var6++] = class150.field2228;
                                    continue;
                                }
                                if (var517 == 6102) {
                                    class198.field3084[var6++] = class110.method819(arg0) ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6103) {
                                    class198.field3084[var6++] = class109.field1685 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6105) {
                                    class198.field3084[var6++] = class292.field4536 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6106) {
                                    class198.field3084[var6++] = class201.field3105 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6107) {
                                    class198.field3084[var6++] = class140.field2089 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6108) {
                                    class198.field3084[var6++] = class178.field2730 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6109) {
                                    class198.field3084[var6++] = class106.field1665 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6110) {
                                    class198.field3084[var6++] = class216.field3309 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6111) {
                                    class198.field3084[var6++] = client.field2386;
                                    continue;
                                }
                                if (var517 == 6112) {
                                    class198.field3084[var6++] = class142.field2111 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6114) {
                                    class198.field3084[var6++] = class218.field3335 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6115) {
                                    class198.field3084[var6++] = class40.field678 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6116) {
                                    class198.field3084[var6++] = class52.field825;
                                    continue;
                                }
                                if (var517 == 6117) {
                                    class198.field3084[var6++] = class189.field2971 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6118) {
                                    class198.field3084[var6++] = class174.field2684;
                                    continue;
                                }
                                if (var517 == 6119) {
                                    class198.field3084[var6++] = class85.field1274;
                                    continue;
                                }
                                if (var517 == 6120) {
                                    class198.field3084[var6++] = class70.field1106;
                                    continue;
                                }
                                if (var517 == 6121) {
                                    class198.field3084[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 6123) {
                                    class198.field3084[var6++] = class249.method1685();
                                    continue;
                                }
                                if (var517 == 6124) {
                                    class198.field3084[var6++] = class94.field1483;
                                    continue;
                                }
                                if (var517 == 6126) {
                                    class198.field3084[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 6127) {
                                    class198.field3084[var6++] = class58.field904 ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6128) {
                                    class198.field3084[var6++] = class230.field3648 ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 6300) {
                                if (var517 == 6200) {
                                    var6 -= 2;
                                    class91.field1424 = (short) class198.field3084[var6];
                                    if (class91.field1424 <= 0) {
                                        class91.field1424 = 256;
                                    }
                                    class24.field410 = (short) class198.field3084[var6 + 1];
                                    if (class24.field410 <= 0) {
                                        class24.field410 = 205;
                                    }
                                    continue;
                                }
                                if (var517 == 6201) {
                                    var6 -= 2;
                                    class239.field3775 = (short) class198.field3084[var6];
                                    if (class239.field3775 <= 0) {
                                        class239.field3775 = 256;
                                    }
                                    class23.field394 = (short) class198.field3084[var6 + 1];
                                    if (class23.field394 <= 0) {
                                        class23.field394 = 320;
                                    }
                                    continue;
                                }
                                if (var517 == 6202) {
                                    var6 -= 4;
                                    class52.field833 = (short) class198.field3084[var6];
                                    if (class52.field833 <= 0) {
                                        class52.field833 = 1;
                                    }
                                    class278.field4408 = (short) class198.field3084[var6 + 1];
                                    if (class278.field4408 <= 0) {
                                        class278.field4408 = 32767;
                                    } else if (class278.field4408 < class52.field833) {
                                        class278.field4408 = class52.field833;
                                    }
                                    client.field2385 = (short) class198.field3084[var6 + 2];
                                    if (client.field2385 <= 0) {
                                        client.field2385 = 1;
                                    }
                                    class103.field1591 = (short) class198.field3084[var6 + 3];
                                    if (class103.field1591 <= 0) {
                                        class103.field1591 = 32767;
                                    } else if (client.field2385 > class103.field1591) {
                                        class103.field1591 = client.field2385;
                                    }
                                    continue;
                                }
                                if (var517 == 6203) {
                                    class123.method924((byte) -46, 0, 0, false, class308.field4938.field3561, class308.field4938.field3408);
                                    class198.field3084[var6++] = class94.field1484;
                                    class198.field3084[var6++] = class50.field817;
                                    continue;
                                }
                                if (var517 == 6204) {
                                    class198.field3084[var6++] = class239.field3775;
                                    class198.field3084[var6++] = class23.field394;
                                    continue;
                                }
                                if (var517 == 6205) {
                                    class198.field3084[var6++] = class91.field1424;
                                    class198.field3084[var6++] = class24.field410;
                                    continue;
                                }
                            } else if (var517 < 6400) {
                                if (var517 == 6300) {
                                    class198.field3084[var6++] = (int) (class242.method1650(62) / 60000L);
                                    continue;
                                }
                                if (var517 == 6301) {
                                    class198.field3084[var6++] = (int) (class242.method1650(117) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var517 == 6302) {
                                    var6 -= 3;
                                    int var222 = class198.field3084[var6];
                                    int var223 = class198.field3084[var6 + 2];
                                    int var224 = class198.field3084[var6 + 1];
                                    class210.field3244.clear();
                                    class210.field3244.set(11, 12);
                                    class210.field3244.set(var223, var224, var222);
                                    class198.field3084[var6++] = (int) (class210.field3244.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var517 == 6303) {
                                    class210.field3244.clear();
                                    class210.field3244.setTime(new Date(class242.method1650(76)));
                                    class198.field3084[var6++] = class210.field3244.get(1);
                                    continue;
                                }
                                if (var517 == 6304) {
                                    var6--;
                                    int var225 = class198.field3084[var6];
                                    boolean var226 = true;
                                    if (var225 < 0) {
                                        var226 = ((var225 + 1) % 4) == 0;
                                    } else if (var225 < 1582) {
                                        var226 = (var225 % 4) == 0;
                                    } else if ((var225 % 4) != 0) {
                                        var226 = false;
                                    } else if (var225 % 100 != 0) {
                                        var226 = true;
                                    } else if (var225 % 400 != 0) {
                                        var226 = false;
                                    }
                                    class198.field3084[var6++] = var226 ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 6500) {
                                if (var517 == 6405) {
                                    class198.field3084[var6++] = class179.method1275(-108) ? 1 : 0;
                                    continue;
                                }
                                if (var517 == 6406) {
                                    class198.field3084[var6++] = class261.method1748(4) ? 1 : 0;
                                    continue;
                                }
                            } else if (var517 < 6600) {
                                if (var517 == 6500) {
                                    if (class23.field382 == 10 && class233.field3686 == 0 && class278.field4411 == 0 && class128.field1918 == 0) {
                                        class198.field3084[var6++] = class127.method951((byte) 39) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class198.field3084[var6++] = 1;
                                    continue;
                                }
                                if (var517 == 6501) {
                                    class98 var210 = class299.method2004((byte) -55);
                                    if (var210 == null) {
                                        class198.field3084[var6++] = -1;
                                        class198.field3084[var6++] = 0;
                                        class290.field4510[var7++] = "";
                                        class198.field3084[var6++] = 0;
                                        class290.field4510[var7++] = "";
                                        class198.field3084[var6++] = 0;
                                    } else {
                                        class198.field3084[var6++] = var210.field1565;
                                        class198.field3084[var6++] = var210.field1997;
                                        class290.field4510[var7++] = var210.field1572;
                                        class265 var211 = var210.method766((byte) -121);
                                        class198.field3084[var6++] = var211.field4192;
                                        class290.field4510[var7++] = var211.field4190;
                                        class198.field3084[var6++] = var210.field1998;
                                    }
                                    continue;
                                }
                                if (var517 == 6502) {
                                    class98 var212 = class82.method641(false);
                                    if (var212 == null) {
                                        class198.field3084[var6++] = -1;
                                        class198.field3084[var6++] = 0;
                                        class290.field4510[var7++] = "";
                                        class198.field3084[var6++] = 0;
                                        class290.field4510[var7++] = "";
                                        class198.field3084[var6++] = 0;
                                    } else {
                                        class198.field3084[var6++] = var212.field1565;
                                        class198.field3084[var6++] = var212.field1997;
                                        class290.field4510[var7++] = var212.field1572;
                                        class265 var213 = var212.method766((byte) -121);
                                        class198.field3084[var6++] = var213.field4192;
                                        class290.field4510[var7++] = var213.field4190;
                                        class198.field3084[var6++] = var212.field1998;
                                    }
                                    continue;
                                }
                                if (var517 == 6503) {
                                    var6--;
                                    int var214 = class198.field3084[var6];
                                    if (class23.field382 == 10 && class233.field3686 == 0 && class278.field4411 == 0 && class128.field1918 == 0) {
                                        class198.field3084[var6++] = class48.method404(var214, (byte) 126) ? 1 : 0;
                                        continue;
                                    }
                                    class198.field3084[var6++] = 0;
                                    continue;
                                }
                                if (var517 == 6504) {
                                    var6--;
                                    class48.field793 = class198.field3084[var6];
                                    class67.method543(class123.field1863, (byte) -50);
                                    continue;
                                }
                                if (var517 == 6505) {
                                    class198.field3084[var6++] = class48.field793;
                                    continue;
                                }
                                if (var517 == 6506) {
                                    var6--;
                                    int var215 = class198.field3084[var6];
                                    class98 var216 = class41.method358(var215, (byte) 124);
                                    if (var216 == null) {
                                        class198.field3084[var6++] = -1;
                                        class290.field4510[var7++] = "";
                                        class198.field3084[var6++] = 0;
                                        class290.field4510[var7++] = "";
                                        class198.field3084[var6++] = 0;
                                    } else {
                                        class198.field3084[var6++] = var216.field1997;
                                        class290.field4510[var7++] = var216.field1572;
                                        class265 var217 = var216.method766((byte) -121);
                                        class198.field3084[var6++] = var217.field4192;
                                        class290.field4510[var7++] = var217.field4190;
                                        class198.field3084[var6++] = var216.field1998;
                                    }
                                    continue;
                                }
                                if (var517 == 6507) {
                                    var6 -= 4;
                                    int var218 = class198.field3084[var6];
                                    int var219 = class198.field3084[var6 + 2];
                                    boolean var220 = class198.field3084[var6 + 1] == 1;
                                    boolean var221 = class198.field3084[var6 + 3] == 1;
                                    class195.method1394(var218, var220, -23100, var221, var219);
                                    continue;
                                }
                            } else if (var517 < 6700) {
                                if (var517 == 6600) {
                                    var6--;
                                    class189.field2972 = class198.field3084[var6] == 1;
                                    class67.method543(class123.field1863, (byte) -34);
                                    continue;
                                }
                                if (var517 == 6601) {
                                    class198.field3084[var6++] = class189.field2972 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var517 == 4400) {
                            var6 -= 2;
                            int var296 = class198.field3084[var6];
                            int var297 = class198.field3084[var6 + 1];
                            class238 var298 = class55.method463(0, var297);
                            if (var298.method1631(-116)) {
                                class290.field4510[var7++] = class166.method1209(-63, var296).method1955(var298.field3755, var297, true);
                            } else {
                                class198.field3084[var6++] = class166.method1209(-77, var296).method1963(65535, var297, var298.field3753);
                            }
                            continue;
                        }
                    } else if (var517 == 4300) {
                        var6 -= 2;
                        int var299 = class198.field3084[var6];
                        int var300 = class198.field3084[var6 + 1];
                        class238 var301 = class55.method463(0, var300);
                        if (var301.method1631(-116)) {
                            class290.field4510[var7++] = class175.method1250(var299, (byte) -44).method737((byte) -103, var301.field3755, var300);
                        } else {
                            class198.field3084[var6++] = class175.method1250(var299, (byte) -89).method742(4209, var301.field3753, var300);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var516) {
            if (var5.field3348 == null) {
                if (class110.field1709 != 0) {
                    class247.method1671(0, "Clientscript error - check log for details", -1, "");
                }
                class79.method624("CS2 - scr:" + var5.field2009 + " op:" + var11, var516, 0);
            } else {
                StringBuffer var513 = new StringBuffer(30);
                var513.append("%0a - in: ").append(var5.field3348);
                for (int var514 = class266.field4197 - 1; var514 >= 0; var514--) {
                    var513.append("%0a - via: ").append(class297.field4784[var514].field4472.field3348);
                }
                if (var11 == 40) {
                    int var515 = var9[var8];
                    var513.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var515));
                }
                if (class110.field1709 != 0) {
                    class247.method1671(0, "Clientscript error in: " + var5.field3348, -1, "");
                }
                class79.method624("CS2 - scr:" + var5.field2009 + " op:" + var11 + var513.toString(), var516, 0);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class184() {
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lam;)V")
    public class184(class184 arg0) {
        this.field2907 = arg0.field2907;
        this.field2911 = arg0.field2911;
        this.field2908 = arg0.field2908;
        this.field2910 = arg0.field2910;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public static void method1319(boolean arg0) {
        field2913 = null;
        field2902 = null;
        if (!arg0) {
            field2909 = null;
        }
    }
}
