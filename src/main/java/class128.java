import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class128 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lcd;")
    public static class23 field2647 = class54.method414("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -1);

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2658 = 50;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lcd;")
    public static class23 field2660 = class54.method414("p12_full", -1);

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Lcd;")
    public static class23 field2668 = class54.method414("Verbindung abgebrochen)3", -1);

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lcd;")
    public static class23 field2657 = class54.method414("<col=00ff00>", -1);

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Lcd;")
    public static class23 field2671 = class54.method414("leuchten3:", -1);

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "B")
    public static byte field2659;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public int field2666;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method829(byte arg0) {
        field2671 = null;
        field2657 = null;
        field2647 = null;
        field2668 = null;
        if (arg0 <= 15) {
            field2658 = -45;
        }
        field2660 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V")
    public static final void method830(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2669++;
        if (class47.field1013 == 0 && !class73.field1660) {
            class162.method993(0, arg0 - arg3, 39, class112.field2367, 6349, class66.field1566, arg1 - arg4);
            class57.field1344++;
        }
        int var5 = -1;
        for (int var6 = 0; var6 < class45.field958; var6++) {
            int var7 = class45.field960[var6];
            int var8 = var7 >> 29 & 0x3;
            int var9 = var7 >> 14 & 0x7FFF;
            int var10 = var7 >> 7 & 0x7F;
            int var11 = var7 & 0x7F;
            if (var5 != var7) {
                var5 = var7;
                if (var8 == 2 && class205.field4041.method802(class59.field1385, var11, var10, var7) >= 0) {
                    class104 var12 = class65.method486(var9, (byte) -66);
                    if (var12.field2238 != null) {
                        var12 = var12.method685((byte) -111);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class47.field1013 == 1) {
                        class162.method993(var7, var10, 38, class170.field3390, arg2 ^ 0x74AC, class3.method14(true, new class23[] { class183.field3609, class101.field2157, var12.field2240 }), var11);
                        class154.field3093++;
                    } else if (!class73.field1660) {
                        class182.field3598++;
                        class23[] var13 = var12.field2234;
                        if (class177.field3526) {
                            var13 = class177.method1111(var13, 9);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 42;
                                    }
                                    if (var14 == 1) {
                                        var15 = 5;
                                    }
                                    class145.field2959++;
                                    if (var14 == 2) {
                                        var15 = 3;
                                    }
                                    if (var14 == 3) {
                                        var15 = 15;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1007;
                                    }
                                    class162.method993(var7, var10, var15, var13[var14], 6349, class3.method14(true, new class23[] { class27.field569, var12.field2240 }), var11);
                                }
                            }
                        }
                        class162.method993(var12.field2222 << 14, var10, 1002, class160.field3205, 6349, class3.method14(true, new class23[] { class27.field569, var12.field2240 }), var11);
                    } else if ((class166.field3312 & 0x4) == 4) {
                        class151.field3011++;
                        class162.method993(var7, var10, 47, class124.field2550, arg2 - 21396, class3.method14(true, new class23[] { class136.field2819, class101.field2157, var12.field2240 }), var11);
                    }
                }
                if (var8 == 1) {
                    class182 var16 = class91.field1944[var9];
                    if (var16.field3595.field69 == 1 && (var16.field215 & 0x7F) == 64 && (var16.field277 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class67.field1583; var17++) {
                            class182 var20 = class91.field1944[class8.field161[var17]];
                            if (var20 != null && var16 != var20 && var20.field3595.field69 == 1 && var16.field215 == var20.field215 && var16.field277 == var20.field277) {
                                class36.method258(class8.field161[var17], var20.field3595, var10, var11, -29956);
                            }
                        }
                        for (int var18 = 0; var18 < class57.field1348; var18++) {
                            class57 var19 = class95.field2007[class69.field1622[var18]];
                            if (var19 != null && var16.field215 == var19.field215 && var16.field277 == var19.field277) {
                                class138.method879(class69.field1622[var18], var19, var10, var11, -26615);
                            }
                        }
                    }
                    class36.method258(var9, var16.field3595, var10, var11, -29956);
                }
                if (var8 == 0) {
                    class57 var21 = class95.field2007[var9];
                    if ((var21.field215 & 0x7F) == 64 && (var21.field277 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class67.field1583; var22++) {
                            class182 var25 = class91.field1944[class8.field161[var22]];
                            if (var25 != null && var25.field3595.field69 == 1 && var21.field215 == var25.field215 && var21.field277 == var25.field277) {
                                class36.method258(class8.field161[var22], var25.field3595, var10, var11, -29956);
                            }
                        }
                        for (int var23 = 0; var23 < class57.field1348; var23++) {
                            class57 var24 = class95.field2007[class69.field1622[var23]];
                            if (var24 != null && var21 != var24 && var21.field215 == var24.field215 && var21.field277 == var24.field277) {
                                class138.method879(class69.field1622[var23], var24, var10, var11, -26615);
                            }
                        }
                    }
                    class138.method879(var9, var21, var10, var11, arg2 ^ 0xFFFFF468);
                }
                if (var8 == 3) {
                    class25 var26 = class150.field3006[class59.field1385][var11][var10];
                    if (var26 != null) {
                        for (class52 var27 = (class52) var26.method184(arg2 ^ 0xFFFF9076); var27 != null; var27 = (class52) var26.method181(-111)) {
                            class63 var28 = class85.method565(var27.field1241, (byte) -100);
                            if (class47.field1013 == 1) {
                                class117.field2440++;
                                class162.method993(var27.field1241, var10, 45, class170.field3390, arg2 - 21396, class3.method14(true, new class23[] { class183.field3609, class104.field2223, var28.field1483 }), var11);
                            } else if (!class73.field1660) {
                                class124.field2543++;
                                class23[] var29 = var28.field1498;
                                if (class177.field3526) {
                                    var29 = class177.method1111(var29, 85);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        class189.field3736++;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 57;
                                        }
                                        if (var30 == 1) {
                                            var31 = 44;
                                        }
                                        if (var30 == 2) {
                                            var31 = 49;
                                        }
                                        if (var30 == 3) {
                                            var31 = 30;
                                        }
                                        if (var30 == 4) {
                                            var31 = 26;
                                        }
                                        class162.method993(var27.field1241, var10, var31, var29[var30], 6349, class3.method14(true, new class23[] { class169.field3373, var28.field1483 }), var11);
                                    } else if (var30 == 2) {
                                        class162.method993(var27.field1241, var10, 49, class103.field2192, 6349, class3.method14(true, new class23[] { class169.field3373, var28.field1483 }), var11);
                                        class169.field3370++;
                                    }
                                }
                                class162.method993(var27.field1241, var10, 1004, class160.field3205, 6349, class3.method14(true, new class23[] { class169.field3373, var28.field1483 }), var11);
                            } else if ((class166.field3312 & 0x1) == 1) {
                                class162.method993(var27.field1241, var10, 37, class124.field2550, 6349, class3.method14(true, new class23[] { class136.field2819, class104.field2223, var28.field1483 }), var11);
                                class135.field2803++;
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != 27745) {
            method830(114, -43, -107, 47, -113);
        }
    }
}
