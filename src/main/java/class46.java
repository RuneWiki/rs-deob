import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class class46 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public int field686;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field684 = 0;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lmh;")
    public static class62 field691 = class201.method1405(true, "(Z");

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field692 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lmh;")
    public static class62 field693 = class201.method1405(true, "::tele ");

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lsk;")
    public static class199 field688 = new class199(64);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 5)
    public static void method296(int arg0) {
        field688 = null;
        if (arg0 != 19801) {
            method303((byte) -30, (class62) null);
        }
        field693 = null;
        field691 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lmi;II)Lmh;", line = 32)
    public static final class62 method299(class92 arg0, int arg1, int arg2) {
        field694++;
        try {
            class62 var3 = new class62();
            var3.field893 = arg0.method731(112);
            if (arg2 < var3.field893) {
                var3.field893 = arg2;
            }
            if (arg1 < 50) {
                return (class62) null;
            } else {
                var3.field906 = new byte[var3.field893];
                arg0.field1476 += class261.field4390.method291(0, 0, var3.field893, var3.field906, arg0.field1495, arg0.field1476);
                return var3;
            }
        } catch (Exception var5) {
            return class44.field667;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lhk;Z)V", line = 65)
    public static final void method300(class166 arg0, boolean arg1) {
        class52.field749.method330(arg0, -124);
        while (true) {
            class166 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class166[][] var7;
            class166 var79;
            do {
                class166 var78;
                do {
                    class166 var77;
                    do {
                        class166 var76;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class166) class52.field749.method329(25);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2714);
                                            var3 = var2.field2709;
                                            var4 = var2.field2722;
                                            var5 = var2.field2717;
                                            var6 = var2.field2727;
                                            var7 = class256.field4320[var5];
                                            float var8 = 0.0F;
                                            float var13;
                                            if (class41.field632 == class37.field569) {
                                                int var9 = class96.field1563[var3][var4];
                                                int var10 = var9 & 0xFFFFFF;
                                                if (class191.field3050 != var10) {
                                                    class191.field3050 = var10;
                                                    class153.method1095(-122, var10);
                                                    class179.method1253(class205.method1427(74));
                                                }
                                                int var11 = var9 >>> 24 << 3;
                                                if (class131.field2129 != var11) {
                                                    class131.field2129 = var11;
                                                    class150.method1076(var11, -70);
                                                }
                                                int var12 = class72.field1106[0][var3 + 1][var4] + class72.field1106[0][var3][var4] + class72.field1106[0][var3][var4 + 1] + class72.field1106[0][var3 + 1][var4 + 1] >> 2;
                                                class135.method1024(3, 42, -var12);
                                                var13 = 201.5F;
                                                class154.method1112(var13);
                                            } else {
                                                var13 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                class154.method1112(var13);
                                            }
                                            if (!var2.field2729) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class166 var14 = class256.field4320[var5 - 1][var3][var4];
                                                    if (var14 != null && var14.field2714) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class36.field480 && var3 > class49.field715) {
                                                    class166 var15 = var7[var3 - 1][var4];
                                                    if (var15 != null && var15.field2714 && (var15.field2729 || (var2.field2715 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class36.field480 && var3 < class108.field1752 - 1) {
                                                    class166 var16 = var7[var3 + 1][var4];
                                                    if (var16 != null && var16.field2714 && (var16.field2729 || (var2.field2715 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class24.field264 && var4 > class127.field2104) {
                                                    class166 var17 = var7[var3][var4 - 1];
                                                    if (var17 != null && var17.field2714 && (var17.field2729 || (var2.field2715 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class24.field264 && var4 < class164.field2671 - 1) {
                                                    class166 var18 = var7[var3][var4 + 1];
                                                    if (var18 != null && var18.field2714 && (var18.field2729 || (var2.field2715 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2729 = false;
                                            if (var2.field2707 != null) {
                                                class166 var19 = var2.field2707;
                                                class154.method1112(201.5F - (float) (var19.field2727 + 1) * 50.0F);
                                                if (var19.field2710 == null) {
                                                    if (var19.field2719 != null) {
                                                        if (class62.method416(0, var3, var4)) {
                                                            class113.method885(var19.field2719, class77.field1275, class55.field805, class37.field566, class200.field3388, var3, var4, true);
                                                        } else {
                                                            class113.method885(var19.field2719, class77.field1275, class55.field805, class37.field566, class200.field3388, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class62.method416(0, var3, var4)) {
                                                    class173.method1233(var19.field2710, 0, class77.field1275, class55.field805, class37.field566, class200.field3388, var3, var4, true);
                                                } else {
                                                    class173.method1233(var19.field2710, 0, class77.field1275, class55.field805, class37.field566, class200.field3388, var3, var4, false);
                                                }
                                                class54 var20 = var19.field2706;
                                                if (var20 != null) {
                                                    if ((var20.field789 & var2.field2712) == 0) {
                                                        class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                    } else {
                                                        class117.method908(var20.field789, class144.field2300, class293.field4981, class270.field4579, var6, var3, var4);
                                                    }
                                                    var20.field786.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var20.field793 - class144.field2300, var20.field796 - class293.field4981, var20.field784 - class270.field4579, var20.field787);
                                                }
                                                for (int var21 = 0; var21 < var19.field2724; var21++) {
                                                    class164 var22 = var19.field2713[var21];
                                                    if (var22 != null) {
                                                        class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                        var22.field2672.method276(var22.field2665, class77.field1275, class55.field805, class37.field566, class200.field3388, var22.field2659 - class144.field2300, var22.field2667 - class293.field4981, var22.field2663 - class270.field4579, var22.field2668);
                                                    }
                                                }
                                                class154.method1112(var13);
                                            }
                                            boolean var23 = false;
                                            if (var2.field2710 == null) {
                                                if (var2.field2719 != null) {
                                                    if (class62.method416(var6, var3, var4)) {
                                                        class113.method885(var2.field2719, class77.field1275, class55.field805, class37.field566, class200.field3388, var3, var4, true);
                                                    } else {
                                                        var23 = true;
                                                        class113.method885(var2.field2719, class77.field1275, class55.field805, class37.field566, class200.field3388, var3, var4, false);
                                                    }
                                                }
                                            } else if (class62.method416(var6, var3, var4)) {
                                                class173.method1233(var2.field2710, var6, class77.field1275, class55.field805, class37.field566, class200.field3388, var3, var4, true);
                                            } else {
                                                var23 = true;
                                                if (var2.field2710.field2988 != 12345678 || class264.field4446 && var5 <= class184.field2950) {
                                                    class173.method1233(var2.field2710, var6, class77.field1275, class55.field805, class37.field566, class200.field3388, var3, var4, false);
                                                }
                                            }
                                            if (var23) {
                                                class32 var24 = var2.field2711;
                                                if (var24 != null && (var24.field442 & 0x80000000L) != 0L) {
                                                    if (var24.field435) {
                                                        class154.method1112(var13 + 50.0F - 1.5F);
                                                    }
                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                    var24.field443.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var24.field430 - class144.field2300, var24.field433 - class293.field4981, var24.field434 - class270.field4579, var24.field442);
                                                    if (var24.field435) {
                                                        class154.method1112(var13);
                                                    }
                                                }
                                            }
                                            int var25 = 0;
                                            int var26 = 0;
                                            class54 var27 = var2.field2706;
                                            class268 var28 = var2.field2720;
                                            if (var27 != null || var28 != null) {
                                                if (class36.field480 == var3) {
                                                    var25++;
                                                } else if (class36.field480 < var3) {
                                                    var25 += 2;
                                                }
                                                if (class24.field264 == var4) {
                                                    var25 += 3;
                                                } else if (class24.field264 > var4) {
                                                    var25 += 6;
                                                }
                                                var26 = class69.field1068[var25];
                                                var2.field2712 = class32.field432[var25];
                                            }
                                            if (var27 != null) {
                                                if ((var27.field789 & class39.field609[var25]) == 0) {
                                                    var2.field2723 = 0;
                                                } else if (var27.field789 == 16) {
                                                    var2.field2723 = 3;
                                                    var2.field2731 = class283.field4821[var25];
                                                    var2.field2718 = 3 - var2.field2731;
                                                } else if (var27.field789 == 32) {
                                                    var2.field2723 = 6;
                                                    var2.field2731 = class122.field2030[var25];
                                                    var2.field2718 = 6 - var2.field2731;
                                                } else if (var27.field789 == 64) {
                                                    var2.field2723 = 12;
                                                    var2.field2731 = class20.field210[var25];
                                                    var2.field2718 = 12 - var2.field2731;
                                                } else {
                                                    var2.field2723 = 9;
                                                    var2.field2731 = class98.field1609[var25];
                                                    var2.field2718 = 9 - var2.field2731;
                                                }
                                                if ((var27.field789 & var26) != 0 && !class8.method36(var6, var3, var4, var27.field789)) {
                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                    var27.field786.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var27.field793 - class144.field2300, var27.field796 - class293.field4981, var27.field784 - class270.field4579, var27.field787);
                                                }
                                                if ((var27.field790 & var26) != 0 && !class8.method36(var6, var3, var4, var27.field790)) {
                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                    var27.field788.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var27.field793 - class144.field2300, var27.field796 - class293.field4981, var27.field784 - class270.field4579, var27.field787);
                                                }
                                            }
                                            if (var28 != null && !class187.method1314(var6, var3, var4, var28.field4559.method278())) {
                                                class154.method1112(var13 - 0.5F);
                                                if ((var28.field4555 & var26) != 0) {
                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                    var28.field4559.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var28.field4556 + var28.field4543 - class144.field2300, var28.field4557 - class293.field4981, var28.field4549 + var28.field4548 - class270.field4579, var28.field4554);
                                                } else if (var28.field4555 == 256) {
                                                    int var29 = var28.field4556 - class144.field2300;
                                                    int var30 = var28.field4557 - class293.field4981;
                                                    int var31 = var28.field4549 - class270.field4579;
                                                    int var32 = var28.field4553;
                                                    int var33;
                                                    if (var32 == 1 || var32 == 2) {
                                                        var33 = -var29;
                                                    } else {
                                                        var33 = var29;
                                                    }
                                                    int var34;
                                                    if (var32 == 2 || var32 == 3) {
                                                        var34 = -var31;
                                                    } else {
                                                        var34 = var31;
                                                    }
                                                    if (var34 < var33) {
                                                        class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                        var28.field4559.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var28.field4543 + var29, var30, var28.field4548 + var31, var28.field4554);
                                                    } else if (var28.field4552 != null) {
                                                        class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                        var28.field4552.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var29, var30, var31, var28.field4554);
                                                    }
                                                }
                                                class154.method1112(var13);
                                            }
                                            if (var23) {
                                                class32 var35 = var2.field2711;
                                                if (var35 != null && (var35.field442 & 0x80000000L) == 0L) {
                                                    if (var35.field435) {
                                                        class154.method1112(var13 + 50.0F - 1.5F);
                                                    }
                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                    var35.field443.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var35.field430 - class144.field2300, var35.field433 - class293.field4981, var35.field434 - class270.field4579, var35.field442);
                                                    if (var35.field435) {
                                                        class154.method1112(var13);
                                                    }
                                                }
                                                class264 var36 = var2.field2728;
                                                if (var36 != null && var36.field4443 == 0) {
                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                    if (var36.field4455 != null) {
                                                        var36.field4455.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var36.field4452 - class144.field2300, var36.field4448 - class293.field4981, var36.field4453 - class270.field4579, var36.field4456);
                                                    }
                                                    if (var36.field4445 != null) {
                                                        var36.field4445.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var36.field4452 - class144.field2300, var36.field4448 - class293.field4981, var36.field4453 - class270.field4579, var36.field4456);
                                                    }
                                                    if (var36.field4444 != null) {
                                                        var36.field4444.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var36.field4452 - class144.field2300, var36.field4448 - class293.field4981, var36.field4453 - class270.field4579, var36.field4456);
                                                    }
                                                }
                                            }
                                            int var37 = var2.field2715;
                                            if (var37 != 0) {
                                                if (var3 < class36.field480 && (var37 & 0x4) != 0) {
                                                    class166 var38 = var7[var3 + 1][var4];
                                                    if (var38 != null && var38.field2714) {
                                                        class52.field749.method330(var38, 120);
                                                    }
                                                }
                                                if (var4 < class24.field264 && (var37 & 0x2) != 0) {
                                                    class166 var39 = var7[var3][var4 + 1];
                                                    if (var39 != null && var39.field2714) {
                                                        class52.field749.method330(var39, 60);
                                                    }
                                                }
                                                if (var3 > class36.field480 && (var37 & 0x1) != 0) {
                                                    class166 var40 = var7[var3 - 1][var4];
                                                    if (var40 != null && var40.field2714) {
                                                        class52.field749.method330(var40, 78);
                                                    }
                                                }
                                                if (var4 > class24.field264 && (var37 & 0x8) != 0) {
                                                    class166 var41 = var7[var3][var4 - 1];
                                                    if (var41 != null && var41.field2714) {
                                                        class52.field749.method330(var41, 72);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2723 != 0) {
                                            boolean var42 = true;
                                            for (int var43 = 0; var43 < var2.field2724; var43++) {
                                                if (class187.field2992 != var2.field2713[var43].field2656 && (var2.field2726[var43] & var2.field2723) == var2.field2731) {
                                                    var42 = false;
                                                    break;
                                                }
                                            }
                                            if (var42) {
                                                class54 var44 = var2.field2706;
                                                if (!class8.method36(var6, var3, var4, var44.field789)) {
                                                    label593: {
                                                        if ((var44.field787 & 0xFC000L) == 16384L) {
                                                            int var45 = var44.field793 - class144.field2300;
                                                            int var46 = var44.field784 - class270.field4579;
                                                            int var47 = (int) (var44.field787 >> 20 & 0x3L);
                                                            if (var47 == 0) {
                                                                var45 -= 64;
                                                                var46 += 64;
                                                                if (var46 < var45 && var3 > 0 && var4 < class252.field4273 - 1) {
                                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3 - 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 1) {
                                                                var45 += 64;
                                                                var46 += 64;
                                                                if (var46 < -var45 && var3 < class114.field1900 - 1 && var4 < class252.field4273 - 1) {
                                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3 + 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 2) {
                                                                var45 += 64;
                                                                var46 -= 64;
                                                                if (var46 > var45 && var3 < class114.field1900 - 1 && var4 > 0) {
                                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3 + 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 3) {
                                                                var45 -= 64;
                                                                var46 -= 64;
                                                                if (var46 > -var45 && var3 > 0 && var4 > 0) {
                                                                    class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3 - 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            }
                                                        }
                                                        class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                    }
                                                    var44.field786.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var44.field793 - class144.field2300, var44.field796 - class293.field4981, var44.field784 - class270.field4579, var44.field787);
                                                }
                                                var2.field2723 = 0;
                                            }
                                        }
                                        if (!var2.field2730) {
                                            break;
                                        }
                                        try {
                                            int var48 = var2.field2724;
                                            var2.field2730 = false;
                                            int var49 = 0;
                                            label677: for (int var50 = 0; var50 < var48; var50++) {
                                                class164 var51 = var2.field2713[var50];
                                                if (class187.field2992 != var51.field2656) {
                                                    for (int var52 = var51.field2651; var52 <= var51.field2661; var52++) {
                                                        for (int var53 = var51.field2670; var53 <= var51.field2657; var53++) {
                                                            class166 var54 = var7[var52][var53];
                                                            if (var54.field2729) {
                                                                var2.field2730 = true;
                                                                continue label677;
                                                            }
                                                            if (var54.field2723 != 0) {
                                                                int var55 = 0;
                                                                if (var52 > var51.field2651) {
                                                                    var55++;
                                                                }
                                                                if (var52 < var51.field2661) {
                                                                    var55 += 4;
                                                                }
                                                                if (var53 > var51.field2670) {
                                                                    var55 += 8;
                                                                }
                                                                if (var53 < var51.field2657) {
                                                                    var55 += 2;
                                                                }
                                                                if ((var55 & var54.field2723) == var2.field2718) {
                                                                    var2.field2730 = true;
                                                                    continue label677;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class7.field76[var49++] = var51;
                                                    int var56 = class36.field480 - var51.field2651;
                                                    int var57 = var51.field2661 - class36.field480;
                                                    if (var57 > var56) {
                                                        var56 = var57;
                                                    }
                                                    int var58 = class24.field264 - var51.field2670;
                                                    int var59 = var51.field2657 - class24.field264;
                                                    if (var59 > var58) {
                                                        var51.field2664 = var56 + var59;
                                                    } else {
                                                        var51.field2664 = var56 + var58;
                                                    }
                                                }
                                            }
                                            while (var49 > 0) {
                                                int var60 = -50;
                                                int var61 = -1;
                                                for (int var62 = 0; var62 < var49; var62++) {
                                                    class164 var63 = class7.field76[var62];
                                                    if (class187.field2992 != var63.field2656) {
                                                        if (var63.field2664 > var60) {
                                                            var60 = var63.field2664;
                                                            var61 = var62;
                                                        } else if (var63.field2664 == var60) {
                                                            int var64 = var63.field2659 - class144.field2300;
                                                            int var65 = var63.field2663 - class270.field4579;
                                                            int var66 = class7.field76[var61].field2659 - class144.field2300;
                                                            int var67 = class7.field76[var61].field2663 - class270.field4579;
                                                            if (var64 * var64 + var65 * var65 > var66 * var66 + var67 * var67) {
                                                                var61 = var62;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var61 == -1) {
                                                    break;
                                                }
                                                class164 var68 = class7.field76[var61];
                                                var68.field2656 = class187.field2992;
                                                if (!class7.method30(var6, var68.field2651, var68.field2661, var68.field2670, var68.field2657, var68.field2672.method278())) {
                                                    if ((var68.field2668 & 0xFC000L) == 147456L) {
                                                        class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                                                        int var69 = var68.field2659 - class144.field2300;
                                                        int var70 = var68.field2663 - class270.field4579;
                                                        int var71 = (int) (var68.field2668 >> 20 & 0x3L);
                                                        if (var71 == 1 || var71 == 3) {
                                                            if (var70 > -var69) {
                                                                class117.method913(var5, var3, var4 - 1, var3 - 1, var4);
                                                            } else {
                                                                class117.method913(var5, var3, var4 + 1, var3 + 1, var4);
                                                            }
                                                        } else if (var70 > var69) {
                                                            class117.method913(var5, var3, var4 - 1, var3 + 1, var4);
                                                        } else {
                                                            class117.method913(var5, var3, var4 + 1, var3 - 1, var4);
                                                        }
                                                    } else {
                                                        class117.method914(class144.field2300, class293.field4981, class270.field4579, var5, var68.field2651, var68.field2670, var68.field2661, var68.field2657);
                                                    }
                                                    var68.field2672.method276(var68.field2665, class77.field1275, class55.field805, class37.field566, class200.field3388, var68.field2659 - class144.field2300, var68.field2667 - class293.field4981, var68.field2663 - class270.field4579, var68.field2668);
                                                }
                                                for (int var72 = var68.field2651; var72 <= var68.field2661; var72++) {
                                                    for (int var73 = var68.field2670; var73 <= var68.field2657; var73++) {
                                                        class166 var74 = var7[var72][var73];
                                                        if (var74.field2723 != 0) {
                                                            class52.field749.method330(var74, -83);
                                                        } else if ((var3 != var72 || var4 != var73) && var74.field2714) {
                                                            class52.field749.method330(var74, -107);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2730) {
                                                break;
                                            }
                                        } catch (Exception var94) {
                                            var2.field2730 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2714);
                            } while (var2.field2723 != 0);
                            if (var3 > class36.field480 || var3 <= class49.field715) {
                                break;
                            }
                            var76 = var7[var3 - 1][var4];
                        } while (var76 != null && var76.field2714);
                        if (var3 < class36.field480 || var3 >= class108.field1752 - 1) {
                            break;
                        }
                        var77 = var7[var3 + 1][var4];
                    } while (var77 != null && var77.field2714);
                    if (var4 > class24.field264 || var4 <= class127.field2104) {
                        break;
                    }
                    var78 = var7[var3][var4 - 1];
                } while (var78 != null && var78.field2714);
                if (var4 < class24.field264 || var4 >= class164.field2671 - 1) {
                    break;
                }
                var79 = var7[var3][var4 + 1];
            } while (var79 != null && var79.field2714);
            var2.field2714 = false;
            class293.field4983--;
            class264 var80 = var2.field2728;
            if (var80 != null && var80.field4443 != 0) {
                class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                if (var80.field4455 != null) {
                    var80.field4455.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var80.field4452 - class144.field2300, var80.field4448 - class293.field4981 - var80.field4443, var80.field4453 - class270.field4579, var80.field4456);
                }
                if (var80.field4445 != null) {
                    var80.field4445.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var80.field4452 - class144.field2300, var80.field4448 - class293.field4981 - var80.field4443, var80.field4453 - class270.field4579, var80.field4456);
                }
                if (var80.field4444 != null) {
                    var80.field4444.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var80.field4452 - class144.field2300, var80.field4448 - class293.field4981 - var80.field4443, var80.field4453 - class270.field4579, var80.field4456);
                }
            }
            if (var2.field2712 != 0) {
                class268 var81 = var2.field2720;
                if (var81 != null && !class187.method1314(var6, var3, var4, var81.field4559.method278())) {
                    if ((var81.field4555 & var2.field2712) != 0) {
                        class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                        var81.field4559.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var81.field4556 + var81.field4543 - class144.field2300, var81.field4557 - class293.field4981, var81.field4549 + var81.field4548 - class270.field4579, var81.field4554);
                    } else if (var81.field4555 == 256) {
                        int var82 = var81.field4556 - class144.field2300;
                        int var83 = var81.field4557 - class293.field4981;
                        int var84 = var81.field4549 - class270.field4579;
                        int var85 = var81.field4553;
                        int var86;
                        if (var85 == 1 || var85 == 2) {
                            var86 = -var82;
                        } else {
                            var86 = var82;
                        }
                        int var87;
                        if (var85 == 2 || var85 == 3) {
                            var87 = -var84;
                        } else {
                            var87 = var84;
                        }
                        if (var87 >= var86) {
                            class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                            var81.field4559.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var81.field4543 + var82, var83, var81.field4548 + var84, var81.field4554);
                        } else if (var81.field4552 != null) {
                            class117.method909(class144.field2300, class293.field4981, class270.field4579, var5, var3, var4);
                            var81.field4552.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var82, var83, var84, var81.field4554);
                        }
                    }
                }
                class54 var88 = var2.field2706;
                if (var88 != null) {
                    if ((var88.field790 & var2.field2712) != 0 && !class8.method36(var6, var3, var4, var88.field790)) {
                        class117.method908(var88.field790, class144.field2300, class293.field4981, class270.field4579, var6, var3, var4);
                        var88.field788.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var88.field793 - class144.field2300, var88.field796 - class293.field4981, var88.field784 - class270.field4579, var88.field787);
                    }
                    if ((var88.field789 & var2.field2712) != 0 && !class8.method36(var6, var3, var4, var88.field789)) {
                        class117.method908(var88.field789, class144.field2300, class293.field4981, class270.field4579, var6, var3, var4);
                        var88.field786.method276(0, class77.field1275, class55.field805, class37.field566, class200.field3388, var88.field793 - class144.field2300, var88.field796 - class293.field4981, var88.field784 - class270.field4579, var88.field787);
                    }
                }
            }
            if (var5 < class164.field2669 - 1) {
                class166 var89 = class256.field4320[var5 + 1][var3][var4];
                if (var89 != null && var89.field2714) {
                    class52.field749.method330(var89, -127);
                }
            }
            if (var3 < class36.field480) {
                class166 var90 = var7[var3 + 1][var4];
                if (var90 != null && var90.field2714) {
                    class52.field749.method330(var90, 81);
                }
            }
            if (var4 < class24.field264) {
                class166 var91 = var7[var3][var4 + 1];
                if (var91 != null && var91.field2714) {
                    class52.field749.method330(var91, -93);
                }
            }
            if (var3 > class36.field480) {
                class166 var92 = var7[var3 - 1][var4];
                if (var92 != null && var92.field2714) {
                    class52.field749.method330(var92, 68);
                }
            }
            if (var4 > class24.field264) {
                class166 var93 = var7[var3][var4 - 1];
                if (var93 != null && var93.field2714) {
                    class52.field749.method330(var93, 102);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZIIIB[[[Lhk;)Z", line = 1054)
    public static final boolean method302(boolean arg0, int arg1, int arg2, int arg3, byte arg4, class166[][][] arg5) {
        field685++;
        byte var6 = arg0 ? 1 : (byte) (class282.field4815 & 0xFF);
        if (class15.field121[class7.field85][arg3][arg2] == var6) {
            return false;
        } else if ((class42.field641[class7.field85][arg3][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class92.field1468[var7] = arg3;
            int var31 = var7 + 1;
            class182.field2900[var7] = arg2;
            class15.field121[class7.field85][arg3][arg2] = var6;
            if (arg4 != 40) {
                field688 = (class199) null;
            }
            while (var31 != var8) {
                int var9 = class92.field1468[var8] & 0xFFFF;
                int var10 = (class92.field1468[var8] & 0xFFA206) >> 16;
                int var11 = class182.field2900[var8] & 0xFFFF;
                boolean var12 = false;
                int var13 = class92.field1468[var8] >> 24 & 0xFF;
                boolean var14 = false;
                if ((class42.field641[class7.field85][var9][var11] & 0x4) == 0) {
                    var12 = true;
                }
                int var15 = class182.field2900[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                label238: for (int var16 = class7.field85 + 1; var16 <= 3; var16++) {
                    if ((class42.field641[var16][var9][var11] & 0x8) == 0) {
                        if (var12 && arg5[var16][var9][var11] != null) {
                            if (arg5[var16][var9][var11].field2706 != null) {
                                int var17 = class50.method323(var10, 1);
                                if (arg5[var16][var9][var11].field2706.field789 == var17 || arg5[var16][var9][var11].field2706.field790 == var17) {
                                    continue;
                                }
                                if (var13 != 0) {
                                    int var18 = class50.method323(var13, arg4 ^ 0x29);
                                    if (arg5[var16][var9][var11].field2706.field789 == var18 || arg5[var16][var9][var11].field2706.field790 == var18) {
                                        continue;
                                    }
                                }
                                if (var15 != 0) {
                                    int var19 = class50.method323(var15, arg4 ^ 0x29);
                                    if (arg5[var16][var9][var11].field2706.field789 == var19 || arg5[var16][var9][var11].field2706.field790 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg5[var16][var9][var11].field2713 != null) {
                                for (int var20 = 0; var20 < arg5[var16][var9][var11].field2724; var20++) {
                                    int var21 = (int) (arg5[var16][var9][var11].field2713[var20].field2668 >> 14 & 0x3FL);
                                    int var22 = (int) (arg5[var16][var9][var11].field2713[var20].field2668 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var22 << 6 | var21;
                                    if (var10 == var23 || var13 != 0 && var13 == var23 || var15 != 0 && var15 == var23) {
                                        continue label238;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class166 var24 = arg5[var16][var9][var11];
                        if (var24 != null && var24.field2724 > 0) {
                            for (int var25 = 0; var25 < var24.field2724; var25++) {
                                class164 var26 = var24.field2713[var25];
                                if (var26.field2661 != var26.field2651 || var26.field2670 != var26.field2657) {
                                    for (int var27 = var26.field2651; var27 <= var26.field2661; var27++) {
                                        for (int var28 = var26.field2670; var28 <= var26.field2657; var28++) {
                                            class15.field121[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class15.field121[var16][var9][var11] = var6;
                    }
                }
                if (var14) {
                    int var29 = var9 << 7;
                    if (class256.field4332[arg1] < class37.field569[class7.field85 + 1][var9][var11]) {
                        class256.field4332[arg1] = class37.field569[class7.field85 + 1][var9][var11];
                    }
                    int var30 = var11 << 7;
                    if (var29 < class21.field219[arg1]) {
                        class21.field219[arg1] = var29;
                    } else if (var29 > class219.field3779[arg1]) {
                        class219.field3779[arg1] = var29;
                    }
                    if (var30 < class122.field2026[arg1]) {
                        class122.field2026[arg1] = var30;
                    } else if (var30 > class54.field791[arg1]) {
                        class54.field791[arg1] = var30;
                    }
                }
                if (!var12) {
                    if (var9 >= 1 && class15.field121[class7.field85][var9 - 1][var11] != var6) {
                        class92.field1468[var31] = class270.method1854(class270.method1854(1179648, var9 - 1), -754974720);
                        class182.field2900[var31] = class270.method1854(1245184, var11);
                        var31 = var31 + 1 & 0xFFF;
                        class15.field121[class7.field85][var9 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var9 - 1 >= 0 && class15.field121[class7.field85][var9 - 1][var11] != var6 && (class42.field641[class7.field85][var9][var11] & 0x4) == 0 && (class42.field641[class7.field85][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class92.field1468[var31] = class270.method1854(class270.method1854(var9 - 1, 1179648), 1375731712);
                            class182.field2900[var31] = class270.method1854(1245184, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class15.field121[class7.field85][var9 - 1][var11] = var6;
                        }
                        if (class15.field121[class7.field85][var9][var11] != var6) {
                            class92.field1468[var31] = class270.method1854(318767104, class270.method1854(var9, 5373952));
                            class182.field2900[var31] = class270.method1854(var11, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class15.field121[class7.field85][var9][var11] = var6;
                        }
                        if ((var9 + 1) < 104 && class15.field121[class7.field85][var9 + 1][var11] != var6 && (class42.field641[class7.field85][var9][var11] & 0x4) == 0 && (class42.field641[class7.field85][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class92.field1468[var31] = class270.method1854(class270.method1854(5373952, var9 + 1), -1845493760);
                            class182.field2900[var31] = class270.method1854(5439488, var11);
                            class15.field121[class7.field85][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var11--;
                    if (var9 + 1 < 104 && class15.field121[class7.field85][var9 + 1][var11] != var6) {
                        class92.field1468[var31] = class270.method1854(class270.method1854(var9 + 1, 9568256), 1392508928);
                        class182.field2900[var31] = class270.method1854(var11, 9633792);
                        class15.field121[class7.field85][var9 + 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var9 - 1) >= 0 && class15.field121[class7.field85][var9 - 1][var11] != var6 && (class42.field641[class7.field85][var9][var11] & 0x4) == 0 && (class42.field641[class7.field85][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class92.field1468[var31] = class270.method1854(class270.method1854(13762560, var9 - 1), 301989888);
                            class182.field2900[var31] = class270.method1854(13828096, var11);
                            class15.field121[class7.field85][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class15.field121[class7.field85][var9][var11] != var6) {
                            class92.field1468[var31] = class270.method1854(class270.method1854(var9, 13762560), -1828716544);
                            class182.field2900[var31] = class270.method1854(13828096, var11);
                            class15.field121[class7.field85][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class15.field121[class7.field85][var9 + 1][var11] != var6 && (class42.field641[class7.field85][var9][var11] & 0x4) == 0 && (class42.field641[class7.field85][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class92.field1468[var31] = class270.method1854(class270.method1854(9568256, var9 + 1), -771751936);
                            class182.field2900[var31] = class270.method1854(var11, 9633792);
                            class15.field121[class7.field85][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class256.field4332[arg1] != -1000000) {
                class256.field4332[arg1] += 10;
                class21.field219[arg1] -= 50;
                class219.field3779[arg1] += 50;
                class54.field791[arg1] += 50;
                class122.field2026[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLmh;)Lmh;", line = 1354)
    public static final class62 method303(byte arg0, class62 arg1) {
        field689++;
        if (arg0 != 62) {
            field693 = (class62) null;
        }
        int var2 = class307.method2096(124, arg1);
        return var2 == -1 ? class262.field4403 : class252.field4270.field3934[var2].method445(class120.field2002, class181.field2876, 16058);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III)V", line = 1381)
    public class46(int arg0, int arg1, int arg2) {
        this.field686 = arg2;
        this.field690 = arg0;
        this.field687 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
    public abstract void method297(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZI)V")
    public abstract void method298(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)V")
    public abstract void method301(int arg0, byte arg1, int arg2);
}
