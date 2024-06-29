import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class219 extends class183 {

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lhd;")
    public static class214 field3773 = new class214(512);

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lsc;")
    public static class181 field3776 = class149.method967(255, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[I")
    public static int[] field3775 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Ldf;")
    public static class117 field3770;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Ljb;")
    public static class11 field3779;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static final void method1457(byte arg0) {
        if (arg0 >= -51) {
            field3775 = null;
        }
        field3774++;
        class171.field2865.method1790(0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)V")
    public static final void method1458(byte arg0, int arg1) {
        int var2 = -55 % ((-arg0 - 26) / 56);
        class80.field1294 = 50;
        client.field2704 = arg1;
        field3778++;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static void method1459(byte arg0) {
        int var1 = 104 / ((29 - arg0) / 62);
        field3775 = null;
        field3779 = null;
        field3770 = null;
        field3776 = null;
        field3773 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Z")
    public static final boolean method1460(int arg0) {
        field3769++;
        if (arg0 != 51885665) {
            field3779 = null;
        }
        return class259.field4527;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class177.field3099 = 0;
        for (int var7 = -1; var7 < class152.field2538 + class137.field2237; var7++) {
            class157 var23;
            if (var7 == -1) {
                var23 = class258.field4507;
            } else if (var7 >= class152.field2538) {
                var23 = class129.field2140[class263.field4581[var7 - class152.field2538]];
            } else {
                var23 = class39.field602[class218.field3750[var7]];
            }
            if (var23 != null && var23.method768((byte) 69)) {
                if (var23 instanceof class178) {
                    class64 var24 = ((class178) var23).field3117;
                    if (var24.field1050 != null) {
                        var24 = var24.method458((byte) -54);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class152.field2538) {
                    class64 var25 = ((class178) var23).field3117;
                    if (var25.field1050 != null) {
                        var25 = var25.method458((byte) -54);
                    }
                    if (var25.field1027 >= 0 && var25.field1027 < class190.field3350.length) {
                        class196.method1337((byte) -103, arg0 >> 1, arg6, arg2, var23, var23.method1050(200) + 15, arg4 >> 1);
                        if (class238.field4135 > -1) {
                            class190.field3350[var25.field1027].method322(arg5 - (12 - class238.field4135), class11.field228 + arg3 - 30);
                        }
                    }
                    class203[] var26 = class74.field1187;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        class203 var28 = var26[var27];
                        if (var28 != null && var28.field3503 == 1 && class263.field4581[var7 - class152.field2538] == var28.field3496 && class237.field4125 % 20 < 10) {
                            class196.method1337((byte) -87, arg0 >> 1, arg6, arg2, var23, var23.method1050(200) + 15, arg4 >> 1);
                            if (class238.field4135 > -1) {
                                class18.field318[var28.field3488].method322(arg5 + class238.field4135 - 12, class11.field228 + -28 + arg3);
                            }
                        }
                    }
                } else {
                    int var29 = 30;
                    class116 var30 = (class116) var23;
                    if (var30.field1913 != -1 || var30.field1915 != -1) {
                        class196.method1337((byte) -58, arg0 >> 1, arg6, arg2, var23, var23.method1050(200) + 15, arg4 >> 1);
                        if (class238.field4135 > -1) {
                            if (var30.field1913 != -1) {
                                class47.field746[var30.field1913].method322(class238.field4135 + arg5 - 12, class11.field228 + arg3 - var29);
                                var29 += 25;
                            }
                            if (var30.field1915 != -1) {
                                class190.field3350[var30.field1915].method322(arg5 + class238.field4135 - 12, class11.field228 + arg3 - var29);
                                var29 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var31 = 0;
                        class203[] var32 = class74.field1187;
                        while (var31 < var32.length) {
                            class203 var33 = var32[var31];
                            if (var33 != null && var33.field3503 == 10 && class218.field3750[var7] == var33.field3496) {
                                class196.method1337((byte) -102, arg0 >> 1, arg6, arg2, var23, var23.method1050(200) + 15, arg4 >> 1);
                                if (class238.field4135 > -1) {
                                    class18.field318[var33.field3488].method322(class238.field4135 + arg5 - 12, -var29 + arg3 - -class11.field228);
                                }
                            }
                            var31++;
                        }
                    }
                }
                if (var23.field2668 != null && (class152.field2538 <= var7 || class109.field1781 == 0 || class109.field1781 == 3 || class109.field1781 == 1 && class177.method1185(0, ((class116) var23).field1883))) {
                    class196.method1337((byte) -65, arg0 >> 1, arg6, arg2, var23, var23.method1050(200), arg4 >> 1);
                    if (class238.field4135 > -1 && class177.field3099 < class241.field4196) {
                        class241.field4180[class177.field3099] = class114.field1853.method1677(var23.field2668) / 2;
                        class241.field4185[class177.field3099] = class114.field1853.field4255;
                        class241.field4184[class177.field3099] = class238.field4135;
                        class241.field4199[class177.field3099] = class11.field228;
                        class241.field4197[class177.field3099] = var23.field2642;
                        class241.field4190[class177.field3099] = var23.field2648;
                        class241.field4198[class177.field3099] = var23.field2620;
                        class241.field4182[class177.field3099] = var23.field2668;
                        class177.field3099++;
                    }
                }
                if (class237.field4125 < var23.field2640) {
                    class107 var34 = class135.field2203[1];
                    class107 var35 = class135.field2203[0];
                    if (var23 instanceof class178) {
                        class178 var36 = (class178) var23;
                        class107[] var37 = (class107[]) class148.field2473.method1794(arg1 ^ 0xFFFFE648, (long) var36.field3117.field991);
                        if (var37 == null) {
                            var37 = class196.method1335(class254.field4453, 0, (byte) 35, var36.field3117.field991);
                            if (var37 != null) {
                                class148.field2473.method1795(14177, (long) var36.field3117.field991, var37);
                            }
                        }
                        if (var37 != null && var37.length == 2) {
                            var34 = var37[1];
                            var35 = var37[0];
                        }
                    }
                    class196.method1337((byte) -39, arg0 >> 1, arg6, arg2, var23, var23.method1050(200) + var35.field1756 + 10, arg4 >> 1);
                    if (class238.field4135 > -1) {
                        int var38 = arg5 + class238.field4135 - (var35.field1757 >> 1);
                        int var39 = arg3 + class11.field228 - 3;
                        var35.method322(var38, var39);
                        int var40 = var35.field1756;
                        int var41 = var23.field2688 * var35.field1757 / 255;
                        class17.method161(var38, var39, var38 + var41, var39 + var40);
                        var34.method322(var38, var39);
                        class17.method157(arg5, arg3, arg0 + arg5, arg3 + arg4);
                    }
                }
                for (int var42 = 0; var42 < 4; var42++) {
                    if (class237.field4125 < var23.field2633[var42]) {
                        class196.method1337((byte) -78, arg0 >> 1, arg6, arg2, var23, var23.method1050(200) / 2, arg4 >> 1);
                        if (class238.field4135 > -1) {
                            if (var42 == 1) {
                                class11.field228 -= 20;
                            }
                            if (var42 == 2) {
                                class11.field228 -= 10;
                                class238.field4135 -= 15;
                            }
                            if (var42 == 3) {
                                class238.field4135 += 15;
                                class11.field228 -= 10;
                            }
                            class96.field1554[var23.field2649[var42]].method322(arg5 + class238.field4135 - 12, class11.field228 + arg3 + -12);
                            class164.field2797.method1655(class169.method1119((byte) -113, var23.field2638[var42]), class238.field4135 + arg5 - 1, class11.field228 + arg3 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg1 != 6583) {
            return;
        }
        for (int var8 = 0; var8 < class177.field3099; var8++) {
            int var9 = class241.field4184[var8];
            int var10 = class241.field4180[var8];
            int var11 = class241.field4185[var8];
            int var12 = class241.field4199[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((var12 + 2) > (class241.field4199[var22] - class241.field4185[var22]) && class241.field4199[var22] + 2 > -var11 + var12 && (class241.field4184[var22] + class241.field4180[var22]) > (var9 - var10) && (class241.field4184[var22] - class241.field4180[var22]) < (var9 + var10) && (class241.field4199[var22] - class241.field4185[var22]) < var12) {
                        var13 = true;
                        var12 = class241.field4199[var22] - class241.field4185[var22];
                    }
                }
            }
            class238.field4135 = class241.field4184[var8];
            class11.field228 = class241.field4199[var8] = var12;
            class181 var14 = class241.field4182[var8];
            if (class151.field2519 == 0) {
                int var15 = 16776960;
                if (class241.field4197[var8] < 6) {
                    var15 = class230.field3974[class241.field4197[var8]];
                }
                if (class241.field4197[var8] == 6) {
                    var15 = (class94.field1505 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class241.field4197[var8] == 7) {
                    var15 = (class94.field1505 % 20) < 10 ? 255 : 65535;
                }
                if (class241.field4197[var8] == 8) {
                    var15 = (class94.field1505 % 20) < 10 ? 45056 : 8454016;
                }
                if (class241.field4197[var8] == 9) {
                    int var16 = 150 - class241.field4198[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 33160960 - var16 * 327680;
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class241.field4197[var8] == 10) {
                    int var17 = 150 - class241.field4198[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 + 16384000 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 255 + 500 - (var17 * 5) - 32768000;
                    }
                }
                if (class241.field4197[var8] == 11) {
                    int var18 = 150 - class241.field4198[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = (var18 - 50) * 327685 + 65280;
                    } else if (var18 < 150) {
                        var15 = 32768000 + 16777215 - var18 * 327680;
                    }
                }
                if (class241.field4190[var8] == 0) {
                    class114.field1853.method1655(var14, arg5 + class238.field4135, class11.field228 + arg3, var15, 0);
                }
                if (class241.field4190[var8] == 1) {
                    class114.field1853.method1669(var14, class238.field4135 + arg5, class11.field228 + arg3, var15, 0, class94.field1505);
                }
                if (class241.field4190[var8] == 2) {
                    class114.field1853.method1661(var14, class238.field4135 + arg5, arg3 - -class11.field228, var15, 0, class94.field1505);
                }
                if (class241.field4190[var8] == 3) {
                    class114.field1853.method1670(var14, class238.field4135 + arg5, class11.field228 + arg3, var15, 0, class94.field1505, 150 - class241.field4198[var8]);
                }
                if (class241.field4190[var8] == 4) {
                    int var19 = (150 - class241.field4198[var8]) * (class114.field1853.method1677(var14) + 100) / 150;
                    class17.method161(class238.field4135 + arg5 - 50, arg3, class238.field4135 + arg5 + 50, arg3 + arg4);
                    class114.field1853.method1659(var14, class238.field4135 + arg5 + 50 - var19, arg3 - -class11.field228, var15, 0);
                    class17.method157(arg5, arg3, arg5 + arg0, arg3 + arg4);
                }
                if (class241.field4190[var8] == 5) {
                    int var20 = 150 - class241.field4198[var8];
                    int var21 = 0;
                    class17.method161(arg5, class11.field228 + arg3 - (class114.field1853.field4255 - -1), arg0 + arg5, class11.field228 + arg3 + 5);
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class114.field1853.method1655(var14, class238.field4135 + arg5, class11.field228 + arg3 + var21, var15, 0);
                    class17.method157(arg5, arg3, arg5 + arg0, arg3 + arg4);
                }
            } else {
                class114.field1853.method1655(var14, arg5 + class238.field4135, arg3 - -class11.field228, 16776960, 0);
            }
        }
        field3772++;
    }
}
