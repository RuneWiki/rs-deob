import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field2958 = 0;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
    public static boolean field2962 = false;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lpe;")
    public static class109 field2957 = class141.method1120("blaugr-Un:", 0);

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lpe;")
    private static class109 field2960 = class141.method1120("Please try using a different world)3", 0);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lpe;")
    public static class109 field2959 = field2960;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lpe;")
    public static class109 field2965 = field2960;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lpe;")
    public static class109 field2964 = class141.method1120("Ihr Charakter)2Profil wird in:", 0);

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Lpe;")
    public static class109 field2970 = class141.method1120("scrollbar", 0);

    @OriginalMember(owner = "client!td", name = "t", descriptor = "[I")
    public static int[] field2976 = new int[128];

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lpe;")
    public static class109 field2963 = field2960;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Lpe;")
    public static class109 field2977 = field2960;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lpe;")
    public static class109 field2967 = field2960;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "Lpe;")
    public static class109 field2978 = field2960;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Le;")
    public static class29 field2969;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lha;")
    public static class50 field2975;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field2976 = null;
        field2975 = null;
        field2967 = null;
        field2978 = null;
        field2970 = null;
        if (arg0 != 19895) {
            return;
        }
        field2959 = null;
        field2964 = null;
        field2957 = null;
        field2977 = null;
        field2965 = null;
        field2960 = null;
        field2963 = null;
        field2969 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static final void method1081(byte arg0) {
        class131.field2883 = null;
        class89.field1885 = null;
        class67.field1359 = null;
        class14.field377 = null;
        class12.field273 = null;
        class112.field2400 = null;
        class126.field2796 = null;
        if (arg0 != -73) {
            field2960 = null;
        }
        class82.field1765 = null;
        class101.field2108 = null;
        field2968++;
        class153.field3374 = null;
        class135.field2939 = null;
        class6.field133 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lna;II)Z")
    public static final boolean method1082(class91 arg0, int arg1, int arg2) {
        field2972++;
        byte[] var3 = arg0.method751((byte) -88, arg2);
        if (arg1 != 1084488686) {
            method1083(125, -2, 10, -90, -127);
        }
        if (var3 == null) {
            return false;
        } else {
            class47.method415(var3, 1);
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
    public static final void method1083(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2966++;
        int var5 = -1;
        if (class135.field2936 == 0 && !class139.field3031) {
            class47.field978++;
            class121.method983(arg0 - arg4, class79.field1663, arg3 - arg1, 0, 48, 40, class131.field2866);
        }
        for (int var6 = 0; var6 < class155.field3565; var6++) {
            int var7 = class155.field3579[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && class147.field3201.method661(class75.field1513, var8, var9, var7) >= 0) {
                    class148 var12 = class89.method736(var11, 11893);
                    if (var12.field3229 != null) {
                        var12 = var12.method1157(true);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class135.field2936 == 1) {
                        class121.method983(var8, class92.field1982, var9, var7, 48, 17, class44.method405(new class109[] { class20.field500, class62.field1283, var12.field3277 }, (byte) -74));
                        class50.field1052++;
                    } else if (!class139.field3031) {
                        class86.field1826++;
                        class109[] var13 = var12.field3263;
                        if (class119.field2651) {
                            var13 = class61.method475((byte) 97, var13);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    class15.field384++;
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 8;
                                    }
                                    if (var14 == 1) {
                                        var15 = 28;
                                    }
                                    if (var14 == 2) {
                                        var15 = 14;
                                    }
                                    if (var14 == 3) {
                                        var15 = 41;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1002;
                                    }
                                    class121.method983(var8, var13[var14], var9, var7, 48, var15, class44.method405(new class109[] { class6.field148, var12.field3277 }, (byte) -74));
                                }
                            }
                        }
                        class121.method983(var8, class139.field3033, var9, var12.field3260 << 14, 48, 1004, class44.method405(new class109[] { class6.field148, var12.field3277 }, (byte) -74));
                    } else if ((class18.field438 & 0x4) == 4) {
                        class121.method983(var8, class123.field2698, var9, var7, 48, 51, class44.method405(new class109[] { class25.field621, class62.field1283, var12.field3277 }, (byte) -74));
                        class60.field1171++;
                    }
                }
                if (var10 == 1) {
                    class108 var16 = class52.field1067[var11];
                    if (var16.field2265.field2490 == 1 && (var16.field3094 & 0x7F) == 64 && (var16.field3106 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class131.field2885; var17++) {
                            class108 var20 = class52.field1067[class139.field3035[var17]];
                            if (var20 != null && var16 != var20 && var20.field2265.field2490 == 1 && var16.field3094 == var20.field3094 && var16.field3106 == var20.field3106) {
                                class121.method985(var20.field2265, -88, class139.field3035[var17], var9, var8);
                            }
                        }
                        for (int var18 = 0; var18 < class44.field927; var18++) {
                            class50 var19 = class104.field2194[class92.field1973[var18]];
                            if (var19 != null && var16.field3094 == var19.field3094 && var16.field3106 == var19.field3106) {
                                class46.method411(class92.field1973[var18], var9, (byte) -26, var19, var8);
                            }
                        }
                    }
                    class121.method985(var16.field2265, -72, var11, var9, var8);
                }
                if (var10 == 0) {
                    class50 var21 = class104.field2194[var11];
                    if ((var21.field3094 & 0x7F) == 64 && (var21.field3106 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class131.field2885; var22++) {
                            class108 var25 = class52.field1067[class139.field3035[var22]];
                            if (var25 != null && var25.field2265.field2490 == 1 && var21.field3094 == var25.field3094 && var21.field3106 == var25.field3106) {
                                class121.method985(var25.field2265, -90, class139.field3035[var22], var9, var8);
                            }
                        }
                        for (int var23 = 0; var23 < class44.field927; var23++) {
                            class50 var24 = class104.field2194[class92.field1973[var23]];
                            if (var24 != null && var21 != var24 && var21.field3094 == var24.field3094 && var21.field3106 == var24.field3106) {
                                class46.method411(class92.field1973[var23], var9, (byte) -26, var24, var8);
                            }
                        }
                    }
                    class46.method411(var11, var9, (byte) -26, var21, var8);
                }
                if (var10 == 3) {
                    class19 var26 = class92.field1987[class75.field1513][var8][var9];
                    if (var26 != null) {
                        for (class131 var27 = (class131) var26.method190((byte) -121); var27 != null; var27 = (class131) var26.method193(-15)) {
                            class112 var28 = class4.method43((byte) 94, var27.field2882);
                            if (class135.field2936 == 1) {
                                class121.method983(var8, class92.field1982, var9, var27.field2882, 48, 4, class44.method405(new class109[] { class20.field500, class32.field691, var28.field2381 }, (byte) -74));
                                class104.field2188++;
                            } else if (!class139.field3031) {
                                class109[] var29 = var28.field2419;
                                class38.field824++;
                                if (class119.field2651) {
                                    var29 = class61.method475((byte) -12, var29);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        class141.field3104++;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 58;
                                        }
                                        if (var30 == 1) {
                                            var31 = 5;
                                        }
                                        if (var30 == 2) {
                                            var31 = 47;
                                        }
                                        if (var30 == 3) {
                                            var31 = 22;
                                        }
                                        if (var30 == 4) {
                                            var31 = 44;
                                        }
                                        class121.method983(var8, var29[var30], var9, var27.field2882, 48, var31, class44.method405(new class109[] { class52.field1071, var28.field2381 }, (byte) -74));
                                    } else if (var30 == 2) {
                                        class121.method983(var8, class112.field2391, var9, var27.field2882, 48, 47, class44.method405(new class109[] { class52.field1071, var28.field2381 }, (byte) -74));
                                        class109.field2309++;
                                    }
                                }
                                class121.method983(var8, class139.field3033, var9, var27.field2882, 48, 1006, class44.method405(new class109[] { class52.field1071, var28.field2381 }, (byte) -74));
                            } else if ((class18.field438 & 0x1) == 1) {
                                class83.field1766++;
                                class121.method983(var8, class123.field2698, var9, var27.field2882, 48, 49, class44.method405(new class109[] { class25.field621, class32.field691, var28.field2381 }, (byte) -74));
                            }
                        }
                    }
                }
            }
        }
        if (arg2 > -60) {
            field2964 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILwa;)I")
    public static final int method1084(int arg0, class154 arg1) {
        field2979++;
        class158 var2 = (class158) class100.field2095.method505((byte) -46, ((long) arg1.field3514 << 32) + (long) arg1.field3478);
        if (arg0 != 0) {
            method1084(-15, null);
        }
        return var2 == null ? arg1.field3463 : var2.field3651;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IJ)V")
    public static final void method1085(int arg0, long arg1) {
        field2974++;
        if (arg1 == 0L) {
            return;
        }
        if (class110.field2330 >= 100 && class66.field1338 != 1 || class110.field2330 >= 200) {
            class75.method593(0, class131.field2866, -8870, class52.field1084);
            return;
        }
        int var3 = 44 % ((4 - arg0) / 35);
        class109 var4 = class72.method582(false, arg1).method902((byte) 42);
        for (int var5 = 0; var5 < class110.field2330; var5++) {
            if (class112.field2415[var5] == arg1) {
                class75.method593(0, class131.field2866, -8870, class44.method405(new class109[] { var4, class15.field399 }, (byte) -74));
                return;
            }
        }
        for (int var6 = 0; var6 < class63.field1295; var6++) {
            if (class38.field838[var6] == arg1) {
                class75.method593(0, class131.field2866, -8870, class44.method405(new class109[] { class91.field1952, var4, class113.field2468 }, (byte) -74));
                return;
            }
        }
        if (var4.method908(field2975.field1051, (byte) 73)) {
            class75.method593(0, class131.field2866, -8870, class41.field858);
            return;
        }
        class143.field3150++;
        class107.field2255[class110.field2330] = var4;
        class112.field2415[class110.field2330] = arg1;
        class77.field1623[class110.field2330] = 0;
        class13.field312[class110.field2330] = 0;
        class75.field1498 = class9.field219;
        class110.field2330++;
        class63.field1299.method535(66, -25013);
        class63.field1299.method157((byte) 37, arg1);
    }
}
