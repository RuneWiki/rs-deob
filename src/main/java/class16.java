import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class256 {

    @OriginalMember(owner = "client!n", name = "P", descriptor = "Ljd;")
    public static class86 field462 = class122.method868("Gegenstand f-Ur Mitglieder", true);

    @OriginalMember(owner = "client!n", name = "M", descriptor = "Ljd;")
    public static class86 field459 = class122.method868("<col=ffff00>", true);

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "Lmg;")
    public static class252 field461;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Ljd;")
    public class86 field453;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "[I")
    public int[] field449;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "[I")
    public int[] field450;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "[I")
    public int[] field458;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "[I")
    public int[] field460;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)I")
    public final int method113(int arg0, byte arg1) {
        field451++;
        if (this.field458 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != 3) {
            method120((byte) -79);
        }
        while (this.field458.length > var3) {
            if (this.field449[var3] == arg0) {
                return this.field458[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lqk;B)V")
    private static final void method114(class200 arg0, byte arg1) {
        field447++;
        byte[] var2 = new byte[24];
        if (class55.field1109 != null) {
            try {
                class55.field1109.method1135(true, 0L);
                class55.field1109.method1133((byte) 114, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1423(24, (byte) 57, var2, 0);
        if (arg1 > -31) {
            method123((class151) null, (class151) null, (byte) -33, (class151) null, (class37) null);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIB)V")
    public static final void method115(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 114) {
            method124(-104);
        }
        class86 var4 = class109.method783(2, new class86[] { class165.field3095, class4.method26(false, arg1), class10.field318, class4.method26(false, arg2 >> 6), class10.field318, class4.method26(false, arg0 >> 6), class10.field318, class4.method26(false, arg2 & 0x3F), class10.field318, class4.method26(false, arg0 & 0x3F) });
        field445++;
        var4.method614(60);
        class57.method416(var4, 81);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method116(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class2.field22++;
        class137.field2624 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class180.field3253; var12 < class194.field3462; var12++) {
            class249[][] var38 = class248.field4406[var12];
            for (int var39 = class6.field236; var39 < class33.field720; var39++) {
                for (int var40 = class198.field3526; var40 < class194.field3482; var40++) {
                    class249 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class79.field1548[var39 + class119.field2339 - class106.field2032][var40 + class119.field2339 - class158.field2966] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field4423 = true;
                            var41.field4440 = true;
                            if (var41.field4445 > 0) {
                                var41.field4424 = true;
                            } else {
                                var41.field4424 = false;
                            }
                            class137.field2624++;
                        } else {
                            var41.field4423 = false;
                            var41.field4440 = false;
                            var41.field4432 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field4435 != null) {
                                    class221 var42 = var41.field4435;
                                    var42.field3966.method561(var42.field3977, -108, var42.field3975, var42.field3975, var42.field3977);
                                    if (var42.field3976 != null) {
                                        var42.field3976.method561(var42.field3977, -100, var42.field3975, var42.field3975, var42.field3977);
                                    }
                                }
                                if (var41.field4433 != null) {
                                    class258 var43 = var41.field4433;
                                    var43.field4590.method561(var43.field4587, -89, var43.field4582, var43.field4582, var43.field4587);
                                    if (var43.field4583 != null) {
                                        var43.field4583.method561(var43.field4587, -122, var43.field4582, var43.field4582, var43.field4587);
                                    }
                                }
                                if (var41.field4437 != null) {
                                    class107 var44 = var41.field4437;
                                    var44.field2051.method561(var44.field2064, 63, var44.field2066, var44.field2066, var44.field2064);
                                }
                                if (var41.field4429 != null) {
                                    for (int var45 = 0; var45 < var41.field4445; var45++) {
                                        class228 var46 = var41.field4429[var45];
                                        var46.field4134.method561(var46.field4135, 108, var46.field4128, var46.field4127, var46.field4137);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class35.field796 == class219.field3930;
        for (int var14 = class180.field3253; var14 < class194.field3462; var14++) {
            class249[][] var27 = class248.field4406[var14];
            for (int var28 = -class119.field2339; var28 <= 0; var28++) {
                int var29 = class106.field2032 + var28;
                int var30 = class106.field2032 - var28;
                if (var29 >= class6.field236 || var30 < class33.field720) {
                    for (int var31 = -class119.field2339; var31 <= 0; var31++) {
                        int var32 = class158.field2966 + var31;
                        int var33 = class158.field2966 - var31;
                        if (var29 >= class6.field236) {
                            if (var32 >= class198.field3526) {
                                class249 var34 = var27[var29][var32];
                                if (var34 != null && var34.field4423) {
                                    class109.method781(var34, true);
                                }
                            }
                            if (var33 < class194.field3482) {
                                class249 var35 = var27[var29][var33];
                                if (var35 != null && var35.field4423) {
                                    class109.method781(var35, true);
                                }
                            }
                        }
                        if (var30 < class33.field720) {
                            if (var32 >= class198.field3526) {
                                class249 var36 = var27[var30][var32];
                                if (var36 != null && var36.field4423) {
                                    class109.method781(var36, true);
                                }
                            }
                            if (var33 < class194.field3482) {
                                class249 var37 = var27[var30][var33];
                                if (var37 != null && var37.field4423) {
                                    class109.method781(var37, true);
                                }
                            }
                        }
                        if (class137.field2624 == 0) {
                            if (!var13) {
                                class243.field4352 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class180.field3253; var15 < class194.field3462; var15++) {
            class249[][] var16 = class248.field4406[var15];
            for (int var17 = -class119.field2339; var17 <= 0; var17++) {
                int var18 = class106.field2032 + var17;
                int var19 = class106.field2032 - var17;
                if (var18 >= class6.field236 || var19 < class33.field720) {
                    for (int var20 = -class119.field2339; var20 <= 0; var20++) {
                        int var21 = class158.field2966 + var20;
                        int var22 = class158.field2966 - var20;
                        if (var18 >= class6.field236) {
                            if (var21 >= class198.field3526) {
                                class249 var23 = var16[var18][var21];
                                if (var23 != null && var23.field4423) {
                                    class109.method781(var23, false);
                                }
                            }
                            if (var22 < class194.field3482) {
                                class249 var24 = var16[var18][var22];
                                if (var24 != null && var24.field4423) {
                                    class109.method781(var24, false);
                                }
                            }
                        }
                        if (var19 < class33.field720) {
                            if (var21 >= class198.field3526) {
                                class249 var25 = var16[var19][var21];
                                if (var25 != null && var25.field4423) {
                                    class109.method781(var25, false);
                                }
                            }
                            if (var22 < class194.field3482) {
                                class249 var26 = var16[var19][var22];
                                if (var26 != null && var26.field4423) {
                                    class109.method781(var26, false);
                                }
                            }
                        }
                        if (class137.field2624 == 0) {
                            if (!var13) {
                                class243.field4352 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class243.field4352 = false;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method117(byte arg0) {
        field462 = null;
        field459 = null;
        if (arg0 != 12) {
            method116(-9, -41, 115, (byte[][][]) null, 3, (byte) -89, -63, 10);
        }
        field461 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
    public final int method118(int arg0, int arg1) {
        field452++;
        if (this.field450 == null) {
            return -1;
        } else if (arg1 == -1) {
            for (int var3 = 0; var3 < this.field450.length; var3++) {
                if (this.field460[var3] == arg0) {
                    return this.field450[var3];
                }
            }
            return -1;
        } else {
            return 80;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lqk;B)V")
    public final void method119(class200 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1408((byte) -50);
            if (var3 == 0) {
                if (arg1 <= 0) {
                    method126(-29, -120, -67, (byte) 51, 75, 99, 8, 18, 1, -35, 37);
                }
                field456++;
                return;
            }
            this.method121(63, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
    public static final void method120(byte arg0) {
        if (arg0 == -73) {
            class137.field2609.method702((byte) -88);
            class4.field60.method702((byte) -88);
            class158.field2973.method702((byte) -88);
            field457++;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILqk;)V")
    private final void method121(int arg0, int arg1, class200 arg2) {
        field446++;
        if (arg1 == 1) {
            this.field453 = arg2.method1376((byte) 24);
        } else if (arg1 == 2) {
            int var4 = arg2.method1408((byte) -46);
            this.field449 = new int[var4];
            this.field458 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field458[var5] = arg2.method1410(-57);
                int var6 = arg2.method1408((byte) -95);
                if (var6 == 0) {
                    this.field449[var5] = -1;
                } else {
                    this.field449[var5] = var6;
                }
            }
        } else if (arg1 == 3) {
            int var7 = arg2.method1408((byte) -40);
            this.field460 = new int[var7];
            this.field450 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field450[var8] = arg2.method1410(arg0 - 137);
                int var9 = arg2.method1408((byte) -47);
                if (var9 == 0) {
                    this.field460[var8] = -1;
                } else {
                    this.field460[var8] = var9;
                }
            }
        }
        if (arg0 != 63) {
            this.field453 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public static final void method122(int arg0) {
        while (true) {
            if (class168.field3102.method1354(class112.field2143, (byte) 123) >= 27) {
                int var1 = class168.field3102.method1352(15, -101);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class233.field4217[var1] == null) {
                        class233.field4217[var1] = new class170();
                        var2 = true;
                    }
                    class170 var3 = class233.field4217[var1];
                    class189.field3350[class61.field1207++] = var1;
                    var3.field702 = class236.field4265;
                    if (var3.field3130 != null && var3.field3130.method89(-1)) {
                        class54.method401((byte) 62, var3);
                    }
                    int var4 = class168.field3102.method1352(1, 105);
                    var3.field3130 = class178.method1251(class168.field3102.method1352(14, arg0 - 28180), (byte) -68);
                    int var5 = class168.field3102.method1352(1, 125);
                    if (var5 == 1) {
                        class271.field4762[class164.field3083++] = var1;
                    }
                    int var6 = class168.field3102.method1352(5, -64);
                    int var7 = class117.field2265[class168.field3102.method1352(3, 107)];
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var2) {
                        var3.field716 = var3.field700 = var7;
                    }
                    int var8 = class168.field3102.method1352(5, 86);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method246(var3.field3130.field333, -1);
                    var3.field675 = var3.field3130.field351;
                    var3.field718 = var3.field3130.field335;
                    var3.field692 = var3.field3130.field370;
                    var3.field739 = var3.field3130.field388;
                    if (var3.field675 == 0) {
                        var3.field700 = 0;
                    }
                    var3.field750 = var3.field3130.field369;
                    var3.field730 = var3.field3130.field376;
                    var3.field688 = var3.field3130.field328;
                    var3.field729 = var3.field3130.field345;
                    var3.method243(class124.field2412.field705[0] + var8, class124.field2412.field707[0] - -var6, var4 == 1, var3.method240((byte) 100), (byte) -69);
                    if (var3.field3130.method89(-1)) {
                        class14.method105((class117) null, var3.field705[0], 0, (class224) null, class180.field3244, false, var3, var3.field707[0]);
                    }
                    continue;
                }
            }
            field465++;
            if (arg0 != 28271) {
                return;
            }
            class168.field3102.method1359(arg0 ^ 0x6E00);
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lbj;Lbj;BLbj;Lea;)Z")
    public static final boolean method123(class151 arg0, class151 arg1, byte arg2, class151 arg3, class37 arg4) {
        class224.field4050 = arg3;
        class69.field1384 = arg0;
        class253.field4504 = arg4;
        field454++;
        if (arg2 != 83) {
            field463 = -64;
        }
        class126.field2437 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
    public static final void method124(int arg0) {
        field455++;
        if (class154.field2892 == 0 || class154.field2892 == 5) {
            return;
        }
        try {
            if ((++class140.field2667) > 2000) {
                if (class248.field4415 != null) {
                    class248.field4415.method207((byte) 108);
                    class248.field4415 = null;
                }
                if (class102.field1974 >= 1) {
                    class185.field3282 = -5;
                    class154.field2892 = 0;
                    return;
                }
                class102.field1974++;
                class140.field2667 = 0;
                class154.field2892 = 1;
                if (class59.field1188 == class191.field3390) {
                    class191.field3390 = class113.field2162;
                } else {
                    class191.field3390 = class59.field1188;
                }
            }
            if (class154.field2892 == 1) {
                class183.field3266 = class157.field2954.method1715(class91.field1852, class191.field3390, true);
                class154.field2892 = 2;
            }
            if (class154.field2892 == 2) {
                if (class183.field3266.field613 == 2) {
                    throw new IOException();
                }
                if (class183.field3266.field613 != 1) {
                    return;
                }
                class248.field4415 = new class31((Socket) class183.field3266.field611, class157.field2954);
                class183.field3266 = null;
                long var1 = class5.field66 = class56.field1152.method622(-2);
                class36.field809.field3565 = 0;
                class36.field809.method1388(-38, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class36.field809.method1388(-120, var3);
                class248.field4415.method209(class36.field809.field3547, arg0 + 4900, 2, 0);
                if (class25.field601 != null) {
                    class25.field601.method355((byte) 57);
                }
                if (class76.field1517 != null) {
                    class76.field1517.method355((byte) 35);
                }
                int var4 = class248.field4415.method204(-30290);
                if (class25.field601 != null) {
                    class25.field601.method355((byte) 89);
                }
                if (class76.field1517 != null) {
                    class76.field1517.method355((byte) 56);
                }
                if (var4 != 0) {
                    class154.field2892 = 0;
                    class185.field3282 = var4;
                    class248.field4415.method207((byte) 102);
                    class248.field4415 = null;
                    return;
                }
                class154.field2892 = 3;
            }
            if (class154.field2892 == 3) {
                if (class248.field4415.method208(arg0 ^ 0xFFFFD4B4) < 8) {
                    return;
                }
                class248.field4415.method210(class168.field3102.field3547, (byte) -99, 0, 8);
                class168.field3102.field3565 = 0;
                class3.field37 = class168.field3102.method1409(-119);
                int[] var5 = new int[4];
                class36.field809.field3565 = 0;
                var5[3] = (int) class3.field37;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class3.field37 >> 32);
                class36.field809.method1388(arg0 ^ 0xFFFFFFD2, 10);
                class36.field809.method1406(arg0 + 1472534024, var5[0]);
                class36.field809.method1406(1472534024, var5[1]);
                class36.field809.method1406(1472534024, var5[2]);
                class36.field809.method1406(1472534024, var5[3]);
                class36.field809.method1399((byte) -123, class56.field1152.method622(-2));
                class36.field809.method1379(arg0, class56.field1150);
                class36.field809.method1385(0, class81.field1586, class132.field2499);
                class82.field1601.field3565 = 0;
                if (class84.field1634 == 40) {
                    class82.field1601.method1388(-53, 18);
                } else {
                    class82.field1601.method1388(arg0 - 79, 16);
                }
                class82.field1601.method1428((byte) -94, class36.field809.field3565 + class268.method1841(0, class130.field2487) + 154);
                class82.field1601.method1406(1472534024, 514);
                class82.field1601.method1388(arg0 - 127, class257.field4552);
                class82.field1601.method1388(-38, class33.field723 ? 1 : 0);
                class82.field1601.method1388(arg0 ^ 0xFFFFFFDE, 0);
                class82.field1601.method1388(-57, class173.method1236(-49));
                class82.field1601.method1428((byte) 114, class4.field53);
                class82.field1601.method1428((byte) 101, class248.field4414);
                method114(class82.field1601, (byte) -106);
                class82.field1601.method1379(0, class130.field2487);
                class82.field1601.method1406(1472534024, class179.field3235);
                class82.field1601.method1406(1472534024, class252.method1706((byte) 57));
                class111.field2129 = true;
                class82.field1601.method1428((byte) -11, class84.field1643);
                class82.field1601.method1406(arg0 + 1472534024, class252.field4478.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class87.field1725.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class134.field2537.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class249.field4417.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class220.field3964.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class149.field2777.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class232.field4204.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class189.field3348.method1082((byte) 13));
                class82.field1601.method1406(arg0 + 1472534024, class56.field1141.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class12.field394.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class201.field3616.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class70.field1448.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class109.field2082.method1082((byte) 13));
                class82.field1601.method1406(arg0 + 1472534024, class98.field1951.method1082((byte) 13));
                class82.field1601.method1406(arg0 ^ 0x57C51608, class162.field3054.method1082((byte) 13));
                class82.field1601.method1406(arg0 ^ 0x57C51608, class161.field3017.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class130.field2479.method1082((byte) 13));
                class82.field1601.method1406(arg0 + 1472534024, class191.field3383.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class79.field1553.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class56.field1154.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class119.field2330.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class125.field2428.method1082((byte) 13));
                class82.field1601.method1406(arg0 ^ 0x57C51608, class43.field960.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class56.field1139.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class251.field4464.method1082((byte) 13));
                class82.field1601.method1406(arg0 ^ 0x57C51608, class18.field509.method1082((byte) 13));
                class82.field1601.method1406(1472534024, class181.field3261.method1082((byte) 13));
                class82.field1601.method1423(class36.field809.field3565, (byte) 57, class36.field809.field3547, 0);
                class248.field4415.method209(class82.field1601.field3547, 4900, class82.field1601.field3565, 0);
                class36.field809.method1355(var5, (byte) 84);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class168.field3102.method1355(var5, (byte) 84);
                class154.field2892 = 4;
            }
            if (class154.field2892 == 4) {
                if (class248.field4415.method208(-11084) < 1) {
                    return;
                }
                int var7 = class248.field4415.method204(-30290);
                if (var7 == 21) {
                    class154.field2892 = 7;
                } else if (var7 == 29) {
                    class154.field2892 = 10;
                } else if (var7 == 1) {
                    class185.field3282 = var7;
                    class154.field2892 = 5;
                    return;
                } else if (var7 == 2) {
                    class154.field2892 = 8;
                } else if (var7 == 15) {
                    class185.field3282 = var7;
                    class154.field2892 = 0;
                    return;
                } else if (var7 == 23 && class102.field1974 < 1) {
                    class154.field2892 = 1;
                    class102.field1974++;
                    class140.field2667 = 0;
                    class248.field4415.method207((byte) 123);
                    class248.field4415 = null;
                    return;
                } else {
                    class185.field3282 = var7;
                    class154.field2892 = 0;
                    class248.field4415.method207((byte) 118);
                    class248.field4415 = null;
                    return;
                }
            }
            if (arg0 == 0) {
                if (class154.field2892 == 6) {
                    class36.field809.field3565 = 0;
                    class36.field809.method1356(17, true);
                    class248.field4415.method209(class36.field809.field3547, arg0 + 4900, class36.field809.field3565, 0);
                    class154.field2892 = 4;
                } else if (class154.field2892 == 7) {
                    if (class248.field4415.method208(-11084) >= 1) {
                        class20.field533 = class248.field4415.method204(-30290) * 60 + 180;
                        class154.field2892 = 0;
                        class185.field3282 = 21;
                        class248.field4415.method207((byte) 123);
                        class248.field4415 = null;
                    }
                } else if (class154.field2892 != 10) {
                    if (class154.field2892 == 8) {
                        if (class248.field4415.method208(arg0 ^ 0xFFFFD4B4) < 12) {
                            return;
                        }
                        class248.field4415.method210(class168.field3102.field3547, (byte) 81, 0, 12);
                        class168.field3102.field3565 = 0;
                        class38.field905 = class168.field3102.method1408((byte) -75);
                        class75.field1505 = class168.field3102.method1408((byte) -37);
                        class21.field548 = class168.field3102.method1408((byte) -94);
                        if (!class33.field723) {
                            if (class21.field548 == 1) {
                                try {
                                    class151.field2823.method613(class157.field2954.field4514, -107);
                                } catch (Throwable var8) {
                                }
                            } else {
                                try {
                                    class106.field2023.method613(class157.field2954.field4514, arg0 ^ 0xFFFFFFD5);
                                } catch (Throwable var9) {
                                }
                            }
                        }
                        class134.field2542 = class168.field3102.method1408((byte) -125);
                        class180.field3242 = class168.field3102.method1408((byte) -44) == 1;
                        class176.field3189 = class168.field3102.method1410(arg0 - 119);
                        class122.field2376 = class168.field3102.method1408((byte) -95) == 1;
                        class125.field2422 = class168.field3102.method1408((byte) -101) == 1;
                        class25.method179(class125.field2422, -23565);
                        class31.method206(-118, class125.field2422);
                        class44.field969 = class168.field3102.method1353(-16511);
                        class112.field2143 = class168.field3102.method1410(-93);
                        class154.field2892 = 9;
                    }
                    if (class154.field2892 == 9 && class248.field4415.method208(-11084) >= class112.field2143) {
                        class168.field3102.field3565 = 0;
                        class248.field4415.method210(class168.field3102.field3547, (byte) 37, 0, class112.field2143);
                        class154.field2892 = 0;
                        class185.field3282 = 2;
                        class191.method1311(-21676);
                        class249.field4446 = -1;
                        class34.method263(arg0 - 58, false);
                        class44.field969 = -1;
                    }
                } else if (class248.field4415.method208(arg0 ^ 0xFFFFD4B4) >= 1) {
                    class243.field4349 = class248.field4415.method204(-30290);
                    class154.field2892 = 0;
                    class185.field3282 = 29;
                    class248.field4415.method207((byte) 125);
                    class248.field4415 = null;
                }
            }
        } catch (IOException var10) {
            if (class248.field4415 != null) {
                class248.field4415.method207((byte) 102);
                class248.field4415 = null;
            }
            if (class102.field1974 < 1) {
                class102.field1974++;
                class140.field2667 = 0;
                class154.field2892 = 1;
                if (class59.field1188 == class191.field3390) {
                    class191.field3390 = class113.field2162;
                } else {
                    class191.field3390 = class59.field1188;
                }
            } else {
                class185.field3282 = -4;
                class154.field2892 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public final void method125(byte arg0) {
        if (arg0 != -7) {
            return;
        }
        field444++;
        if (this.field450 != null) {
            for (int var2 = 0; var2 < this.field450.length; var2++) {
                this.field450[var2] = class49.method377(this.field450[var2], 32768);
            }
        }
        if (this.field458 != null) {
            for (int var3 = 0; var3 < this.field458.length; var3++) {
                this.field458[var3] = class49.method377(this.field458[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIBIIIIIII)V")
    public static final void method126(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field448++;
        int var11 = arg0 - arg1;
        int var12 = arg10 - arg4;
        boolean var13;
        if (class25.field603 > 0 && class25.field603 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg7;
        int var15 = 983040 / arg2;
        int var16 = -var14;
        int var17 = -25 % ((arg3 - 5) / 35);
        while (var11 + var14 > var16) {
            int var19 = arg7 * var16 + arg5 >> 16;
            int var20 = (var16 + 1) * arg7 + arg5 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var10000 = arg8 + var20;
                int var23 = arg8 + var19;
                int var24 = arg1 + var16 >> 6;
                if (var24 >= 0 && var24 <= (class177.field3211.length - 1)) {
                    int[][] var25 = class177.field3211[var24];
                    for (int var26 = -var15; var26 < (var12 + var15); var26++) {
                        int var27 = arg2 * var26 + arg6 >> 16;
                        int var28 = (var26 + 1) * arg2 + arg6 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg9 + var27;
                            var10000 = arg9 + var28;
                            int var32 = arg4 + var26 >> 6;
                            if (var32 >= 0 && var32 <= (var25.length - 1) && var25[var32] != null) {
                                int var33 = ((var26 + arg4 & 0x3F) << 6) + (var16 + arg1 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class117 var35 = class268.method1845(var34 - 1, (byte) -90);
                                    if (var13 && class270.field4747 == var35.field2287) {
                                        class220 var36 = new class220();
                                        var36.field3957 = var30;
                                        var36.field3953 = var35.field2287;
                                        var36.field3952 = var23;
                                        class129.field2469.method1731(-96, var36);
                                    }
                                    class3.field34[var35.field2287].method668(var23 - 7, var30 + -7);
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
        for (class220 var18 = (class220) class129.field2469.method1737((byte) 74); var18 != null; var18 = (class220) class129.field2469.method1740(-8843)) {
            class3.field34[var18.field3953].method668(var18.field3952 - 7, var18.field3957 + -7);
            class131.method938(var18.field3952, var18.field3957, 15, 16776960, 128);
            class131.method938(var18.field3952, var18.field3957, 7, 16777215, 256);
        }
        class129.field2469.method1739(true);
    }
}
