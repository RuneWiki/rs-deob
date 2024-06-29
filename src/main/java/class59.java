import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class59 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[I")
    public static int[] field1200 = new int[] { 7, 0, 0, 0, 0, 2, 3, 0, 0, 12, 8, -1, 0, 0, 12, -1, 2, -2, 0, 0, 0, 0, 9, 2, 0, 0, 5, 0, 0, -2, 0, 0, 0, 8, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 10, 0, 0, 0, -2, 20, 0, 0, 0, 5, 10, -2, 0, 2, 0, 0, 4, -1, 0, 0, 2, 0, 0, 3, 6, 0, 10, 1, 10, -2, 0, 5, 0, 0, 0, 0, 0, -1, 0, 6, 8, 0, 8, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, -2, 15, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 2, 14, 0, 0, 7, 6, 0, 0, 0, 1, 24, -2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, -1, 0, 0, 0, 0, -2, 3, 0, 4, 0, 4, -2, 0, 0, 0, 0, -1, 0, 0, 6, 0, 6, 0, 0, 0, -2, 7, 0, 0, 0, 5, 5, 0, 0, 1, -2, 0, 8, 0, 0, 7, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 4, 0, 0, 3, 0, 15, 0, 0, 0, -1, 1, 6, 0, 0, 0, 8, 0, -1, 0, 14, 6, 4, 0, 0, 0, 0, 0, 0, 0, -2, 5, 0 };

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[Lpj;")
    public static class237[] field1201 = new class237[1000];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Z")
    public static boolean field1212 = true;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Z")
    public static boolean field1207 = true;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lak;")
    public static class135 field1208 = new class135(64);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lw;")
    public static class141 field1210;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lwi;")
    public static final class131 method508(int arg0, int arg1) {
        field1205++;
        class131 var2 = (class131) class73.field1406.method1549((long) arg1, 9447);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1467.method1645(true, class92.method692((byte) 123, arg1), class176.method1214(arg1, arg0 + 50328));
        class131 var4 = new class131();
        if (var3 != null) {
            var4.method929(-1, new class32(var3));
        }
        class73.field1406.method1552((byte) -85, var4, (long) arg1);
        if (arg0 != -23216) {
            field1204 = -57;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZB)V")
    public static final void method509(boolean arg0, byte arg1) {
        field1203++;
        if (arg1 > -7) {
            return;
        }
        byte var2 = 4;
        byte[][] var3 = class163.field2903;
        for (int var4 = 0; var4 < var2; var4++) {
            class96.method718((byte) -52);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class273.field4718[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFF427) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class224.field3855.length; var14++) {
                                if (class224.field3855[var14] == var13 && var3[var14] != null) {
                                    var7 = true;
                                    class7.method79(class146.field2613, arg0, var6 * 8, (byte) 62, var9, (var11 & 0x7) * 8, var3[var14], var4, (var12 & 0x7) * 8, var10, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class53.method473(-7936, var4, var5 * 8, 8, var6 * 8, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class112.field1959 = 0;
        field1199++;
        for (int var7 = -1; var7 < (class89.field1636 + class258.field4439); var7++) {
            class215 var23;
            if (var7 == -1) {
                var23 = class229.field3911;
            } else if (var7 < class258.field4439) {
                var23 = class232.field4025[class126.field2202[var7]];
            } else {
                var23 = class232.field4022[class263.field4498[var7 - class258.field4439]];
            }
            if (var23 != null && var23.method1403((byte) 84)) {
                if (var23 instanceof class210) {
                    class231 var24 = ((class210) var23).field3586;
                    if (var24.field3991 != null) {
                        var24 = var24.method1530(-1);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class258.field4439) {
                    class231 var25 = ((class210) var23).field3586;
                    if (var25.field3991 != null) {
                        var25 = var25.method1530(-1);
                    }
                    if (var25.field3962 >= 0 && var25.field3962 < class46.field986.length) {
                        int var26;
                        if (var25.field3964 == -1) {
                            var26 = var23.method1448(-126) + 15;
                        } else {
                            var26 = var25.field3964 + 15;
                        }
                        class95.method709(-43, arg6 >> 1, var26, var23, arg4, arg5, arg0 >> 1);
                        if (class7.field105 > -1) {
                            class46.field986[var25.field3962].method806(arg2 + class7.field105 - 12, class213.field3632 + arg1 - 30);
                        }
                    }
                    int var27 = 0;
                    class71[] var28 = class144.field2599;
                    while (var27 < var28.length) {
                        class71 var29 = var28[var27];
                        if (var29 != null && var29.field1397 == 1 && class263.field4498[var7 - class258.field4439] == var29.field1391 && class241.field4246 % 20 < 10) {
                            int var30;
                            if (var25.field3964 == -1) {
                                var30 = var23.method1448(-29) + 15;
                            } else {
                                var30 = var25.field3964 + 15;
                            }
                            class95.method709(-95, arg6 >> 1, var30, var23, arg4, arg5, arg0 >> 1);
                            if (class7.field105 > -1) {
                                class164.field2925[var29.field1388].method806(class7.field105 + arg2 - 12, arg1 - (-class213.field3632 + 28));
                            }
                        }
                        var27++;
                    }
                } else {
                    class271 var31 = (class271) var23;
                    int var32 = 30;
                    if (var31.field4667 != -1 || var31.field4637 != -1) {
                        class95.method709(-71, arg6 >> 1, var23.method1448(40) + 15, var23, arg4, arg5, arg0 >> 1);
                        if (class7.field105 > -1) {
                            if (var31.field4667 != -1) {
                                class241.field4236[var31.field4667].method806(class7.field105 + arg2 - 12, class213.field3632 + arg1 + -var32);
                                var32 += 25;
                            }
                            if (var31.field4637 != -1) {
                                class46.field986[var31.field4637].method806(arg2 + class7.field105 - 12, -var32 + class213.field3632 + arg1);
                                var32 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var33 = 0;
                        class71[] var34 = class144.field2599;
                        while (var34.length > var33) {
                            class71 var35 = var34[var33];
                            if (var35 != null && var35.field1397 == 10 && class126.field2202[var7] == var35.field1391) {
                                class95.method709(-10, arg6 >> 1, var23.method1448(58) + 15, var23, arg4, arg5, arg0 >> 1);
                                if (class7.field105 > -1) {
                                    class164.field2925[var35.field1388].method806(arg2 + class7.field105 - 12, class213.field3632 + arg1 - var32);
                                }
                            }
                            var33++;
                        }
                    }
                }
                if (var23.field3713 != null && (class258.field4439 <= var7 || class166.field2936 == 0 || class166.field2936 == 3 || class166.field2936 == 1 && class253.method1714(-91, ((class271) var23).field4655))) {
                    class95.method709(-98, arg6 >> 1, var23.method1448(-121), var23, arg4, arg5, arg0 >> 1);
                    if (class7.field105 > -1 && class149.field2643 > class112.field1959) {
                        class149.field2657[class112.field1959] = class80.field1507.method1342(var23.field3713) / 2;
                        class149.field2648[class112.field1959] = class80.field1507.field3351;
                        class149.field2646[class112.field1959] = class7.field105;
                        class149.field2661[class112.field1959] = class213.field3632;
                        class149.field2653[class112.field1959] = var23.field3725;
                        class149.field2649[class112.field1959] = var23.field3702;
                        class149.field2660[class112.field1959] = var23.field3694;
                        class149.field2656[class112.field1959] = var23.field3713;
                        class112.field1959++;
                    }
                }
                if (var23.field3746 > class241.field4246) {
                    class115 var36 = class213.field3642[0];
                    class115 var37 = class213.field3642[1];
                    int var38;
                    if ((var23 instanceof class210)) {
                        class210 var39 = (class210) var23;
                        class115[] var40 = (class115[]) class180.field3165.method940((long) var39.field3586.field3956, 87);
                        if (var40 == null) {
                            var40 = class23.method215(0, class76.field1440, var39.field3586.field3956, (byte) 107);
                            if (var40 != null) {
                                class180.field3165.method937(-50, var40, (long) var39.field3586.field3956);
                            }
                        }
                        if (var40 != null && var40.length == 2) {
                            var36 = var40[0];
                            var37 = var40[1];
                        }
                        class231 var41 = var39.field3586;
                        if (var41.field3964 == -1) {
                            var38 = var23.method1448(-119);
                        } else {
                            var38 = var41.field3964;
                        }
                    } else {
                        var38 = var23.method1448(21);
                    }
                    class95.method709(-20, arg6 >> 1, var38 + var36.field2014 + 10, var23, arg4, arg5, arg0 >> 1);
                    if (class7.field105 > -1) {
                        int var42 = arg2 + class7.field105 - (var36.field2018 >> 1);
                        int var43 = class213.field3632 + arg1 - 3;
                        var36.method806(var42, var43);
                        int var44 = var36.field2014;
                        int var45 = var23.field3727 * var36.field2018 / 255;
                        class192.method1315(var42, var43, var42 + var45, var43 + var44);
                        var37.method806(var42, var43);
                        class192.method1309(arg2, arg1, arg2 + arg6, arg1 - -arg0);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (var23.field3674[var46] > class241.field4246) {
                        int var47;
                        if ((var23 instanceof class210)) {
                            class210 var48 = (class210) var23;
                            class231 var49 = var48.field3586;
                            if (var49.field3964 == -1) {
                                var47 = var23.method1448(-119) / 2;
                            } else {
                                var47 = var49.field3964 / 2;
                            }
                        } else {
                            var47 = var23.method1448(-120) / 2;
                        }
                        class95.method709(-60, arg6 >> 1, var47, var23, arg4, arg5, arg0 >> 1);
                        if (class7.field105 > -1) {
                            if (var46 == 1) {
                                class213.field3632 -= 20;
                            }
                            if (var46 == 2) {
                                class213.field3632 -= 10;
                                class7.field105 -= 15;
                            }
                            if (var46 == 3) {
                                class7.field105 += 15;
                                class213.field3632 -= 10;
                            }
                            class112.field1967[var23.field3686[var46]].method806(arg2 + class7.field105 - 12, class213.field3632 + arg1 + -12);
                            class96.field1708.method1341(class14.method130(var23.field3744[var46], (byte) 117), arg2 + class7.field105 - 1, arg1 + 3 + class213.field3632, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg3 >= -69) {
            field1207 = false;
        }
        for (int var8 = 0; var8 < class112.field1959; var8++) {
            int var9 = class149.field2646[var8];
            int var10 = class149.field2661[var8];
            int var11 = class149.field2657[var8];
            int var12 = class149.field2648[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class149.field2661[var22] - class149.field2648[var22] < var10 - -2 && var10 - var12 < class149.field2661[var22] + 2 && (class149.field2657[var22] + class149.field2646[var22]) > (var9 - var11) && (var9 + var11) > (class149.field2646[var22] - class149.field2657[var22]) && var10 > (class149.field2661[var22] - class149.field2648[var22])) {
                        var13 = true;
                        var10 = class149.field2661[var22] - class149.field2648[var22];
                    }
                }
            }
            class7.field105 = class149.field2646[var8];
            class213.field3632 = class149.field2661[var8] = var10;
            class237 var14 = class149.field2656[var8];
            if (class182.field3208 == 0) {
                int var15 = 16776960;
                if (class149.field2653[var8] < 6) {
                    var15 = class92.field1663[class149.field2653[var8]];
                }
                if (class149.field2653[var8] == 6) {
                    var15 = (class152.field2698 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class149.field2653[var8] == 7) {
                    var15 = (class152.field2698 % 20) >= 10 ? 65535 : 255;
                }
                if (class149.field2653[var8] == 8) {
                    var15 = (class152.field2698 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class149.field2653[var8] == 9) {
                    int var16 = 150 - class149.field2660[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - ((var16 - 50) * 327680);
                    } else if (var16 < 150) {
                        var15 = (var16 * 5) + 64780;
                    }
                }
                if (class149.field2653[var8] == 10) {
                    int var17 = 150 - class149.field2660[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 33095935 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 255 - ((var17 - 100) * 5) - 32768000;
                    }
                }
                if (class149.field2653[var8] == 11) {
                    int var18 = 150 - class149.field2660[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = ((var18 - 50) * 327685) + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 - ((var18 - 100) * 327680);
                    }
                }
                if (class149.field2649[var8] == 0) {
                    class80.field1507.method1341(var14, class7.field105 + arg2, class213.field3632 + arg1, var15, 0);
                }
                if (class149.field2649[var8] == 1) {
                    class80.field1507.method1331(var14, arg2 + class7.field105, arg1 - -class213.field3632, var15, 0, class152.field2698);
                }
                if (class149.field2649[var8] == 2) {
                    class80.field1507.method1339(var14, arg2 + class7.field105, arg1 - -class213.field3632, var15, 0, class152.field2698);
                }
                if (class149.field2649[var8] == 3) {
                    class80.field1507.method1328(var14, class7.field105 + arg2, class213.field3632 + arg1, var15, 0, class152.field2698, 150 - class149.field2660[var8]);
                }
                if (class149.field2649[var8] == 4) {
                    int var19 = (150 - class149.field2660[var8]) * (class80.field1507.method1342(var14) + 100) / 150;
                    class192.method1315(class7.field105 + arg2 - 50, arg1, class7.field105 + arg2 + 50, arg0 + arg1);
                    class80.field1507.method1337(var14, arg2 + 50 - (-class7.field105 + var19), arg1 - -class213.field3632, var15, 0);
                    class192.method1309(arg2, arg1, arg2 + arg6, arg0 + arg1);
                }
                if (class149.field2649[var8] == 5) {
                    int var20 = 150 - class149.field2660[var8];
                    class192.method1315(arg2, arg1 + class213.field3632 - class80.field1507.field3351 - 1, arg2 + arg6, arg1 + class213.field3632 + 5);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class80.field1507.method1341(var14, class7.field105 + arg2, class213.field3632 + var21 + arg1, var15, 0);
                    class192.method1309(arg2, arg1, arg2 + arg6, arg0 + arg1);
                }
            } else {
                class80.field1507.method1341(var14, class7.field105 + arg2, arg1 - -class213.field3632, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)Z")
    public static final boolean method511(int arg0, byte arg1) {
        field1202++;
        class122 var2 = class49.method450((byte) -120, arg0);
        if (var2 == null) {
            return false;
        } else if (class67.field1311 == 1 || class67.field1311 == 2 || class12.field212 == 2) {
            byte[] var3 = var2.field2155.method1578(-31321);
            class174.field3042 = new String(var3, 0, var3.length);
            class126.field2205 = var2.field2157;
            if (class12.field212 != 0) {
                class56.field1162 = class126.field2205 + 50000;
                class258.field4433 = class126.field2205 + 40000;
                class96.field1714 = class258.field4433;
            }
            return true;
        } else {
            class237 var4 = class127.field2226;
            if (class12.field212 != 0) {
                var4 = class238.method1626(new class237[] { class138.field2391, class14.method130(var2.field2157 + 7000, (byte) 117) }, -59);
            }
            class237 var5 = class127.field2226;
            if (class117.field2050 != null) {
                var5 = class238.method1626(new class237[] { class156.field2768, class117.field2050 }, -53);
            }
            class237 var6 = class238.method1626(new class237[] { class141.field2560, var2.field2155, var4, class101.field1789, class14.method130(class37.field835, (byte) 117), class44.field968, class14.method130(class106.field1873, (byte) 117), var5, class151.field2690, class53.field1106 ? class41.field934 : class210.field3591, class272.field4675, class84.field1563 ? class41.field934 : class210.field3591, class102.field1818, class170.field2979 ? class41.field934 : class210.field3591 }, -47);
            try {
                class269.field4606.getAppletContext().showDocument(var6.method1621(-109), "_self");
                if (arg1 <= 39) {
                    field1204 = -19;
                }
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method58(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method512(int arg0) {
        field1208 = null;
        field1200 = null;
        field1210 = null;
        if (arg0 != 150) {
            field1211 = 0;
        }
        field1201 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method60(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZLjava/awt/Color;Lpj;)V")
    public static final void method513(int arg0, int arg1, boolean arg2, Color arg3, class237 arg4) {
        try {
            Graphics var5 = class20.field379.getGraphics();
            if (class138.field2389 == null) {
                class138.field2389 = new Font("Helvetica", 1, 13);
                class36.field820 = class20.field379.getFontMetrics(class138.field2389);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class142.field2585, class119.field2087);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class259.field4447 == null) {
                    class259.field4447 = class20.field379.createImage(304, 34);
                }
                if (arg1 != -1) {
                    return;
                }
                Graphics var6 = class259.field4447.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class138.field2389);
                var6.setColor(Color.white);
                arg4.method1609((304 - arg4.method1619(class36.field820, false)) / 2, 22, (byte) 84, var6);
                var5.drawImage(class259.field4447, class142.field2585 / 2 - 152, class119.field2087 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class119.field2087 / 2 - 18;
                int var8 = class142.field2585 / 2 - 152;
                var5.setColor(arg3);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var8 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var5.setFont(class138.field2389);
                var5.setColor(Color.white);
                arg4.method1609((304 - arg4.method1619(class36.field820, false)) / 2 + var8, var7 + 22, (byte) 123, var5);
            }
            if (class199.field3455 != null) {
                var5.setFont(class138.field2389);
                var5.setColor(Color.white);
                class199.field3455.method1609(class142.field2585 / 2 - (class199.field3455.method1619(class36.field820, false) / 2), class119.field2087 / 2 + -26, (byte) 89, var5);
            }
        } catch (Exception var10) {
            class20.field379.repaint();
        }
        field1206++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIZ)V")
    public static final void method514(int arg0, int arg1, int arg2, boolean arg3) {
        if (class78.field1459 != 0 && arg1 != 0 && class264.field4517 < 50 && arg2 != -1) {
            class230.field3935[class264.field4517] = arg2;
            class52.field1102[class264.field4517] = arg1;
            class147.field2619[class264.field4517] = arg0;
            class166.field2942[class264.field4517] = null;
            class19.field371[class264.field4517] = 0;
            class264.field4517++;
        }
        if (arg3) {
            field1211 = -62;
        }
        field1209++;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I")
    public abstract int method59(int arg0);
}
