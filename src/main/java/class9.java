import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class102 {

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lqe;")
    public static class179 field261 = class206.method1380("cookiehost", (byte) -13);

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "Lqe;")
    public static class179 field264 = class206.method1380("Ablegen", (byte) -127);

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "[[[B")
    public static byte[][][] field265 = new byte[4][104][104];

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "Lme;")
    public static class135 field262 = new class135(0, 0);

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "Lqe;")
    public static class179 field267 = class206.method1380("Eingabeprozedur geladen)3", (byte) -127);

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "Lqe;")
    public static class179 field268 = class206.method1380(" <col=ffffff>", (byte) -126);

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "Lpj;")
    public static class173 field266;

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        ++field259;
        int var9 = -arg5 + arg6;
        int var10 = -arg1 + arg3;
        int var11 = (-arg2 + arg4 << 16) / var10;
        if (arg8 <= -44) {
            int var12 = (-arg7 + arg0 << 16) / var9;
            boolean var13;
            if (~class232.field4282 < -1 && class232.field4282 % 10 < 5) {
                var13 = true;
            } else {
                var13 = false;
            }
            for (int var14 = 0; var10 > var14; ++var14) {
                int var31 = var11 * var14 >> 16;
                int var32 = (var14 + 1) * var11 >> 16;
                int var33 = var32 - var31;
                if (var33 > 0) {
                    int var10000 = arg2 + var32;
                    int var35 = arg2 + var31;
                    int[][] var36 = class32.field687[var14 - -arg1 >> 6];
                    for (int var37 = 0; ~var9 < ~var37; ++var37) {
                        int var38 = var12 * var37 >> 16;
                        int var39 = (var37 - -1) * var12 >> 16;
                        int var40 = -var38 + var39;
                        if (var40 > 0) {
                            int var41 = arg5 + var37 >> 6;
                            var10000 = arg7 + var39;
                            int var43 = arg7 + var38;
                            if (var36[var41] != null) {
                                int var44 = ((arg5 + var37 & 63) << 6) + (63 & arg1 + var14);
                                int var45 = var36[var41][var44];
                                if (var45 != 0) {
                                    class134 var46 = class114.method735((byte) -77, var45 + -1);
                                    if (var13 && class146.field2649 == var46.field2423) {
                                        class66 var47 = new class66();
                                        var47.field1336 = var43;
                                        var47.field1351 = var35;
                                        var47.field1338 = var46.field2423;
                                        class215.field3994.method235(-61, var47);
                                    }
                                    class149.field2688[var46.field2423].method799(var35 + -7, var43 + -7);
                                }
                            }
                        }
                    }
                }
            }
            if (class55.field1218 == class150.field2698) {
                for (class25 var15 = (class25) class136.field2519.method242(16711680); var15 != null; var15 = (class25) class136.field2519.method237(10)) {
                    int var16 = var15.field581;
                    int var17 = var16 - class176.field3209;
                    int var18 = var15.field583;
                    int var19 = class66.field1350 + class202.field3736 - var18;
                    int var20 = (-arg1 + var17) * (-arg2 + arg4) / (-arg1 + arg3) + arg2;
                    int var21 = (var19 - arg5) * (-arg7 + arg0) / (-arg5 + arg6) + arg7;
                    int var22 = var15.field590;
                    class166 var23 = null;
                    if (var22 == 0) {
                        if (class150.field2698 == 3.0D) {
                            var23 = class89.field1685;
                        }
                        if (class150.field2698 == 4.0D) {
                            var23 = class127.field2318;
                        }
                        if (class150.field2698 == 6.0D) {
                            var23 = class131.field2387;
                        }
                        if (class150.field2698 == 8.0D) {
                            var23 = class133.field2413;
                        }
                    }
                    int var24 = 16777215;
                    if (~var22 == -2) {
                        if (class150.field2698 == 3.0D) {
                            var23 = class131.field2387;
                        }
                        if (class150.field2698 == 4.0D) {
                            var23 = class133.field2413;
                        }
                        if (class150.field2698 == 6.0D) {
                            var23 = class121.field2255;
                        }
                        if (class150.field2698 == 8.0D) {
                            var23 = class222.field4098;
                        }
                    }
                    if (~var22 == -3) {
                        var24 = 16755200;
                        if (class150.field2698 == 3.0D) {
                            var23 = class121.field2255;
                        }
                        if (class150.field2698 == 4.0D) {
                            var23 = class222.field4098;
                        }
                        if (class150.field2698 == 6.0D) {
                            var23 = class40.field867;
                        }
                        if (class150.field2698 == 8.0D) {
                            var23 = class147.field2666;
                        }
                    }
                    if (var23 != null) {
                        class179[] var25 = var15.field585;
                        int var26 = var25.length;
                        int var27 = var21 - var23.method1067() * (var26 + -1) / 2;
                        int var28 = var27 + var23.method1066() / 2;
                        for (int var29 = 0; ~var26 < ~var29; ++var29) {
                            var23.method1062(var25[var29], var20, var28, var24, true);
                            var28 += var23.method1067();
                        }
                    }
                }
            }
            for (class66 var30 = (class66) class215.field3994.method242(16711680); var30 != null; var30 = (class66) class215.field3994.method237(10)) {
                class149.field2688[var30.field1338].method799(var30.field1351 + -7, var30.field1336 - 7);
                class145.method926(var30.field1351, var30.field1336, 15, 16776960, 128);
                class145.method926(var30.field1351, var30.field1336, 7, 16777215, 256);
            }
            class215.field3994.method236((byte) -91);
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
    public static void method57(int arg0) {
        field262 = null;
        field264 = null;
        field268 = null;
        field261 = null;
        field265 = null;
        if (arg0 != -1536269808) {
            method56(70, 114, 123, 88, 57, -76, 72, -68, (byte) -16);
        }
        field267 = null;
        field266 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILqe;I)V")
    public static final void method58(int arg0, int arg1, int arg2, class179 arg3, int arg4) {
        class6 var5 = class227.method1485(arg1, arg0, (byte) 112);
        ++field260;
        if (var5 != null) {
            if (var5.field155 != null) {
                class19 var6 = new class19();
                var6.field499 = var5;
                var6.field490 = arg3;
                var6.field493 = arg2;
                var6.field491 = var5.field155;
                class102.method681(200000, var6);
            }
            boolean var7 = true;
            if (var5.field220 > 0) {
                var7 = class226.method1483(arg4 + -20891, var5);
            }
            if (var7) {
                if (class116.method746(false, arg2 - 1, class159.method1026(var5, -1493540320))) {
                    if (~arg2 == -2) {
                        ++class146.field2653;
                        class81.field1564.method70((byte) -62, 137);
                        class81.field1564.method1229((byte) -109, arg0);
                        class81.field1564.method1222((byte) -85, arg1);
                    }
                    if (arg2 == 2) {
                        class81.field1564.method70((byte) -62, 248);
                        ++class22.field542;
                        class81.field1564.method1229((byte) -68, arg0);
                        class81.field1564.method1222((byte) -111, arg1);
                    }
                    if (arg2 == 3) {
                        ++class116.field2183;
                        class81.field1564.method70((byte) -62, 250);
                        class81.field1564.method1229((byte) -79, arg0);
                        class81.field1564.method1222((byte) -120, arg1);
                    }
                    if (arg2 == 4) {
                        class81.field1564.method70((byte) -62, 6);
                        ++class52.field1100;
                        class81.field1564.method1229((byte) -117, arg0);
                        class81.field1564.method1222((byte) -117, arg1);
                    }
                    if (arg4 == 20947) {
                        if (arg2 == 5) {
                            class81.field1564.method70((byte) -62, 91);
                            class81.field1564.method1229((byte) -93, arg0);
                            class81.field1564.method1222((byte) -118, arg1);
                            ++class93.field1762;
                        }
                        if (arg2 == 6) {
                            class81.field1564.method70((byte) -62, 140);
                            class81.field1564.method1229((byte) -106, arg0);
                            ++class58.field1250;
                            class81.field1564.method1222((byte) -106, arg1);
                        }
                        if (arg2 == 7) {
                            ++class182.field3370;
                            class81.field1564.method70((byte) -62, 225);
                            class81.field1564.method1229((byte) -87, arg0);
                            class81.field1564.method1222((byte) -84, arg1);
                        }
                        if (~arg2 == -9) {
                            class81.field1564.method70((byte) -62, 58);
                            ++class46.field1006;
                            class81.field1564.method1229((byte) -124, arg0);
                            class81.field1564.method1222((byte) -78, arg1);
                        }
                        if (~arg2 == -10) {
                            class81.field1564.method70((byte) -62, 52);
                            ++class133.field2409;
                            class81.field1564.method1229((byte) -98, arg0);
                            class81.field1564.method1222((byte) -112, arg1);
                        }
                        if (~arg2 == -11) {
                            ++class32.field682;
                            class81.field1564.method70((byte) -62, 122);
                            class81.field1564.method1229((byte) -76, arg0);
                            class81.field1564.method1222((byte) -125, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lae;IBI)V")
    public static final void method59(class6 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field174 == 1) {
            ++class25.field587;
            class49.method330(arg0.field81, 0, arg0.field173, class207.field3868, (short) 26, (byte) -123, 0L);
        }
        if (arg0.field174 == 2 && !class163.field2940) {
            class179 var4 = class108.method708(-32755, arg0);
            if (var4 != null) {
                ++class81.field1567;
                class49.method330(var4, -1, arg0.field173, class78.method502((byte) -93, new class179[] { class134.field2464, arg0.field189 }), (short) 50, (byte) -105, 0L);
            }
        }
        if (~arg0.field174 == -4) {
            ++class138.field2548;
            class49.method330(class70.field1407, 0, arg0.field173, class207.field3868, (short) 7, (byte) 28, 0L);
        }
        ++field263;
        if (~arg0.field174 == -5) {
            ++class202.field3743;
            class49.method330(arg0.field81, 0, arg0.field173, class207.field3868, (short) 36, (byte) -118, 0L);
        }
        if (~arg0.field174 == -6) {
            ++class106.field1985;
            class49.method330(arg0.field81, 0, arg0.field173, class207.field3868, (short) 24, (byte) -119, 0L);
        }
        if (arg0.field174 == 6 && class120.field2249 == null) {
            ++class191.field3564;
            class49.method330(arg0.field81, -1, arg0.field173, class207.field3868, (short) 14, (byte) -110, 0L);
        }
        if (~arg0.field128 == -3) {
            int var5 = 0;
            for (int var6 = 0; ~arg0.field86 < ~var6; ++var6) {
                for (int var7 = 0; arg0.field89 > var7; ++var7) {
                    int var8 = (arg0.field82 + 32) * var7;
                    int var9 = (arg0.field103 + 32) * var6;
                    if (~var5 > -21) {
                        var8 += arg0.field158[var5];
                        var9 += arg0.field117[var5];
                    }
                    if (~arg3 <= ~var8 && ~var9 >= ~arg1 && ~(var8 + 32) < ~arg3 && var9 + 32 > arg1) {
                        class78.field1521 = var5;
                        class100.field1868 = arg0;
                        if (arg0.field111[var5] > 0) {
                            class15 var10 = class131.method835((byte) -20, arg0.field111[var5] + -1);
                            if (~class172.field3086 == -2 && class194.method1301(class159.method1026(arg0, -1493540320), 49)) {
                                if (class73.field1436 != arg0.field173 || class208.field3912 != var5) {
                                    ++class77.field1503;
                                    class49.method330(class232.field4285, var5, arg0.field173, class78.method502((byte) -107, new class179[] { class114.field2139, class100.field1871, var10.field418 }), (short) 18, (byte) -30, (long) var10.field414);
                                }
                            } else if (class163.field2940 && class194.method1301(class159.method1026(arg0, -1493540320), 23)) {
                                if ((16 & class88.field1679) == 16) {
                                    class49.method330(class195.field3630, var5, arg0.field173, class78.method502((byte) -110, new class179[] { class187.field3487, class100.field1871, var10.field418 }), (short) 28, (byte) -121, (long) var10.field414);
                                    ++class209.field3919;
                                }
                            } else {
                                ++class77.field1501;
                                class179[] var11 = var10.field381;
                                if (class91.field1726) {
                                    var11 = class84.method566(-32701, var11);
                                }
                                if (class194.method1301(class159.method1026(arg0, -1493540320), -102)) {
                                    for (int var12 = 4; var12 >= 3; --var12) {
                                        if (var11 != null && var11[var12] != null) {
                                            ++class4.field49;
                                            byte var13;
                                            if (~var12 == -4) {
                                                var13 = 35;
                                            } else {
                                                var13 = 43;
                                            }
                                            class49.method330(var11[var12], var5, arg0.field173, class78.method502((byte) -94, new class179[] { class207.field3866, var10.field418 }), var13, (byte) -111, (long) var10.field414);
                                        } else if (~var12 == -5) {
                                            class49.method330(class33.field721, var5, arg0.field173, class78.method502((byte) -87, new class179[] { class207.field3866, var10.field418 }), (short) 43, (byte) 87, (long) var10.field414);
                                            ++client.field710;
                                        }
                                    }
                                }
                                if (class236.method1535(32, class159.method1026(arg0, -1493540320))) {
                                    ++class198.field3694;
                                    class49.method330(class232.field4285, var5, arg0.field173, class78.method502((byte) -82, new class179[] { class207.field3866, var10.field418 }), (short) 19, (byte) 0, (long) var10.field414);
                                }
                                if (class194.method1301(class159.method1026(arg0, -1493540320), -111) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; --var14) {
                                        if (var11[var14] != null) {
                                            ++class31.field673;
                                            byte var15 = 0;
                                            if (~var14 == -1) {
                                                var15 = 46;
                                            }
                                            if (~var14 == -2) {
                                                var15 = 25;
                                            }
                                            if (var14 == 2) {
                                                var15 = 34;
                                            }
                                            class49.method330(var11[var14], var5, arg0.field173, class78.method502((byte) -91, new class179[] { class207.field3866, var10.field418 }), var15, (byte) -107, (long) var10.field414);
                                        }
                                    }
                                }
                                class179[] var16 = arg0.field138;
                                if (class91.field1726) {
                                    var16 = class84.method566(-32701, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; --var17) {
                                        if (var16[var17] != null) {
                                            ++class132.field2407;
                                            byte var18 = 0;
                                            if (~var17 == -1) {
                                                var18 = 16;
                                            }
                                            if (var17 == 1) {
                                                var18 = 51;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (~var17 == -4) {
                                                var18 = 22;
                                            }
                                            if (~var17 == -5) {
                                                var18 = 29;
                                            }
                                            class49.method330(var16[var17], var5, arg0.field173, class78.method502((byte) -113, new class179[] { class207.field3866, var10.field418 }), var18, (byte) 123, (long) var10.field414);
                                        }
                                    }
                                }
                                class49.method330(class120.field2246, var5, arg0.field173, class78.method502((byte) -97, new class179[] { class207.field3866, var10.field418 }), (short) 1002, (byte) -110, (long) var10.field414);
                            }
                        }
                    }
                    ++var5;
                }
            }
        }
        if (arg0.field108) {
            if (!class163.field2940) {
                for (int var19 = 9; var19 >= 5; --var19) {
                    class179 var23 = class16.method124(var19, 4, arg0);
                    if (var23 != null) {
                        class49.method330(var23, arg0.field130, arg0.field173, arg0.field198, (short) 1003, (byte) 5, (long) (var19 + 1));
                        ++class205.field3822;
                    }
                }
                class179 var20 = class108.method708(-32755, arg0);
                if (var20 != null) {
                    ++class81.field1567;
                    class49.method330(var20, arg0.field130, arg0.field173, arg0.field198, (short) 50, (byte) -121, 0L);
                }
                for (int var21 = 4; ~var21 <= -1; --var21) {
                    class179 var22 = class16.method124(var21, 4, arg0);
                    if (var22 != null) {
                        ++class205.field3822;
                        class49.method330(var22, arg0.field130, arg0.field173, arg0.field198, (short) 9, (byte) 83, (long) (var21 - -1));
                    }
                }
                if (class117.method759((byte) -72, class159.method1026(arg0, -1493540320))) {
                    class49.method330(class134.field2451, arg0.field130, arg0.field173, class207.field3868, (short) 14, (byte) -22, 0L);
                    ++class191.field3564;
                }
            } else if (class68.method441(262144, class159.method1026(arg0, -1493540320)) && ~(class88.field1679 & 32) == -33) {
                ++class219.field4052;
                class49.method330(class195.field3630, arg0.field130, arg0.field173, class78.method502((byte) -80, new class179[] { class187.field3487, class86.field1651, arg0.field198 }), (short) 15, (byte) -106, 0L);
            }
        }
        if (arg2 > -31) {
            method59((class6) null, -62, (byte) 113, -73);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field258;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int[][] var4 = this.method677(112, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class155.field2796; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (!arg0) {
            method56(39, -95, 45, 86, 115, 122, -72, 60, (byte) -79);
        }
        return var3;
    }
}
