import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class103 {

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "[J")
    private long[] field25 = new long[10];

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    private int field29 = 1;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    private int field23 = 0;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    private int field34 = 256;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "J")
    private long field18 = class51.method345((byte) -1);

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field38 = 50;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "[I")
    public static int[] field41 = new int[field38];

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "[I")
    public static int[] field20 = new int[field38];

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[I")
    public static int[] field17 = new int[field38];

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "[I")
    public static int[] field32 = new int[field38];

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "[I")
    public static int[] field31 = new int[field38];

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "[I")
    public static int[] field26 = new int[field38];

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "[I")
    public static int[] field42 = new int[field38];

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "[Lv;")
    public static class146[] field33 = new class146[field38];

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "Lua;")
    public static class140 field27 = new class140(200);

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "[I")
    public static int[] field43 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field45 = 0;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "Lv;")
    public static class146 field46 = class159.method1226((byte) -37, "Wordpack geladen)3");

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "Lv;")
    public static class146 field44 = class159.method1226((byte) -37, "<col=ffff00>");

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZZ)V")
    public static final void method5(boolean arg0, boolean arg1) {
        if (class116.field2696.field757 >> 7 == class63.field1421 && class116.field2696.field790 >> 7 == class110.field2608) {
            class63.field1421 = 0;
        }
        int var2 = class126.field2925;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class67 var4;
            int var5;
            if (arg0) {
                var4 = class116.field2696;
                var5 = 33538048;
            } else {
                var4 = class125.field2902[class136.field3080[var3]];
                var5 = class136.field3080[var3] << 14;
            }
            if (var4 != null && var4.method235(-81)) {
                int var6 = var4.field790 >> 7;
                var4.field1533 = false;
                if ((class91.field2196 && class126.field2925 > 50 || class126.field2925 > 200) && !arg0 && var4.field809 == var4.field752) {
                    var4.field1533 = true;
                }
                int var7 = var4.field757 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field1510 == null || class94.field2229 < var4.field1534 || class94.field2229 >= var4.field1509) {
                        if ((var4.field757 & 0x7F) == 64 && (var4.field790 & 0x7F) == 64) {
                            if (class38.field845[var7][var6] == class25.field431) {
                                continue;
                            }
                            class38.field845[var7][var6] = class25.field431;
                        }
                        var4.field1523 = class79.method612(class148.field3428, var4.field757, var4.field790, arg1);
                        class66.field1496.method1189(class148.field3428, var4.field757, var4.field790, var4.field1523, 60, var4, var4.field763, var5, var4.field758);
                    } else {
                        var4.field1533 = false;
                        var4.field1523 = class79.method612(class148.field3428, var4.field757, var4.field790, false);
                        class66.field1496.method1195(class148.field3428, var4.field757, var4.field790, var4.field1523, 60, var4, var4.field763, var5, var4.field1501, var4.field1499, var4.field1502, var4.field1540);
                    }
                }
            }
        }
        if (!arg1) {
            field36++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)I")
    public static final int method6(int arg0) {
        field37++;
        return arg0 == 28379 ? class110.field2604++ : 21;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public static final void method7(int arg0) {
        field30++;
        int var1 = 12 / ((11 - arg0) / 34);
        if (class76.field1813 == 0) {
            class66.field1496 = new class156(4, 104, 104, class78.field1891);
            for (int var2 = 0; var2 < 4; var2++) {
                class64.field1437[var2] = new class91(104, 104);
            }
            class124.field2879 = new class61(512, 512);
            class105.field2519 = 5;
            class76.field1813 = 20;
            class134.field3067 = class26.field463;
        } else if (class76.field1813 == 20) {
            int[] var3 = new int[9];
            for (int var4 = 0; var4 < 9; var4++) {
                int var5 = var4 * 32 + 143;
                int var6 = var5 * 3 + 600;
                int var7 = class45.field1030[var5];
                var3[var4] = var6 * var7 >> 16;
            }
            class156.method1178(var3, 500, 800, 512, 334);
            class134.field3067 = class158.field3636;
            class105.field2519 = 10;
            class76.field1813 = 30;
        } else if (class76.field1813 == 30) {
            class158.field3635 = class5.method45(-82, true, 0, true, false);
            class40.field878 = class5.method45(-60, true, 1, true, false);
            class28.field587 = class5.method45(-70, true, 2, false, true);
            class82.field1989 = class5.method45(-78, true, 3, true, false);
            class15.field251 = class5.method45(-74, true, 4, true, false);
            class8.field163 = class5.method45(-112, true, 5, true, true);
            class60.field1377 = class5.method45(-105, false, 6, true, true);
            class155.field3546 = class5.method45(-50, true, 7, true, false);
            class3.field89 = class5.method45(-73, true, 8, true, false);
            class68.field1557 = class5.method45(-95, true, 9, true, false);
            class22.field363 = class5.method45(-103, true, 10, true, false);
            class115.field2689 = class5.method45(-49, true, 11, true, false);
            class76.field1815 = class5.method45(-66, true, 12, true, false);
            class79.field1943 = class5.method45(-97, true, 13, false, true);
            class54.field1241 = class5.method45(-94, false, 14, true, false);
            class24.field389 = class5.method45(-124, true, 15, true, false);
            class76.field1813 = 40;
            class134.field3067 = class33.field688;
            class105.field2519 = 20;
        } else if (class76.field1813 == 40) {
            byte var8 = 0;
            int var9 = var8 + class158.field3635.method159(true) * 4 / 100;
            int var10 = var9 + class40.field878.method159(true) * 4 / 100;
            int var11 = var10 + class28.field587.method159(true) * 2 / 100;
            int var12 = var11 + class82.field1989.method159(true) * 2 / 100;
            int var13 = var12 + class15.field251.method159(true) * 6 / 100;
            int var14 = var13 + class8.field163.method159(true) * 4 / 100;
            int var15 = var14 + class60.field1377.method159(true) * 2 / 100;
            int var16 = var15 + class155.field3546.method159(true) * 60 / 100;
            int var17 = var16 + class3.field89.method159(true) * 2 / 100;
            int var18 = var17 + class68.field1557.method159(true) * 2 / 100;
            int var19 = var18 + class22.field363.method159(true) * 2 / 100;
            int var20 = var19 + class115.field2689.method159(true) * 2 / 100;
            int var21 = var20 + class76.field1815.method159(true) * 2 / 100;
            int var22 = var21 + class79.field1943.method159(true) * 2 / 100;
            int var23 = var22 + class54.field1241.method159(true) * 2 / 100;
            int var24 = var23 + class24.field389.method159(true) * 2 / 100;
            if (var24 == 100) {
                class76.field1813 = 45;
                class105.field2519 = 30;
                class134.field3067 = class159.field3657;
            } else {
                if (var24 != 0) {
                    class134.field3067 = class71.method509(new class146[] { class37.field821, class75.method564(false, var24), class145.field3314 }, (byte) -86);
                }
                class105.field2519 = 30;
            }
        } else if (class76.field1813 == 45) {
            class25.method151(2, !class91.field2196, 22050, -127);
            class74 var25 = new class74();
            var25.method527(128, 9, 73);
            class15.field249 = class81.method619(class145.field3293, (byte) -93, 22050, 0, class1.field3);
            class15.field249.method29(var25, false);
            class122.method920(true, var25, class54.field1241, class15.field251, class24.field389);
            class89.field2113 = class81.method619(class145.field3293, (byte) -93, 2048, 1, class1.field3);
            class18.field286 = new class133();
            class89.field2113.method29(class18.field286, false);
            class57.field1282 = new class148(22050, class126.field2922);
            class134.field3067 = class100.field2429;
            class105.field2519 = 35;
            class76.field1813 = 50;
        } else if (class76.field1813 == 50) {
            int var26 = 0;
            if (class103.field2508 == null) {
                class103.field2508 = class105.method854(class79.field1943, class158.field3633, true, class3.field89, class5.field97);
            } else {
                var26++;
            }
            if (class115.field2670 == null) {
                class115.field2670 = class105.method854(class79.field1943, class158.field3633, true, class3.field89, class150.field3473);
            } else {
                var26++;
            }
            if (class151.field3483 == null) {
                class151.field3483 = class105.method854(class79.field1943, class158.field3633, true, class3.field89, class68.field1560);
            } else {
                var26++;
            }
            if (var26 < 3) {
                class134.field3067 = class71.method509(new class146[] { class30.field636, class75.method564(false, var26 * 100 / 3), class145.field3314 }, (byte) 95);
                class105.field2519 = 40;
            } else {
                class76.field1813 = 60;
                class105.field2519 = 40;
                class134.field3067 = class101.field2445;
            }
        } else if (class76.field1813 == 60) {
            int var27 = class136.method1010(class3.field89, class22.field363, 123);
            int var28 = class72.method515(-2077634032);
            if (var28 > var27) {
                class134.field3067 = class71.method509(new class146[] { class46.field1050, class75.method564(false, var27 * 100 / var28), class145.field3314 }, (byte) -108);
                class105.field2519 = 50;
            } else {
                class105.field2519 = 50;
                class134.field3067 = class122.field2844;
                class88.method702(5, false);
                class76.field1813 = 70;
            }
        } else if (class76.field1813 == 70) {
            if (class28.field587.method590((byte) 80)) {
                class8.method61(1, class28.field587);
                class54.method363(class28.field587, 0);
                class74.method560(class155.field3546, -96, class28.field587);
                class8.method60((byte) -50, class91.field2196, class28.field587, class155.field3546);
                class63.method457(class28.field587, 1, class155.field3546);
                class132.method981(class155.field3546, class28.field587, class103.field2508, class81.field1961, (byte) -125);
                class59.method413(class40.field878, class28.field587, class158.field3635, -126);
                class17.method102(class28.field587, class155.field3546, (byte) -46);
                class47.method322((byte) -45, class28.field587);
                class41.method274(true, class28.field587);
                class120.method914(200, class79.field1943, class155.field3546, class3.field89, class82.field1989);
                class82.method625((byte) -20, class28.field587);
                class37.method252(class28.field587, (byte) -116);
                class134.field3067 = class113.field2639;
                class76.field1813 = 80;
                class105.field2519 = 60;
            } else {
                class134.field3067 = class71.method509(new class146[] { class81.field1977, class75.method564(false, class28.field587.method163(false)), class145.field3314 }, (byte) -98);
                class105.field2519 = 60;
            }
        } else if (class76.field1813 == 80) {
            int var29 = 0;
            if (class141.field3234 == null) {
                class141.field3234 = class40.method261(class3.field89, -2985, class158.field3633, class121.field2807);
            } else {
                var29++;
            }
            if (class107.field2566 == null) {
                class107.field2566 = class40.method261(class3.field89, -2985, class158.field3633, class79.field1952);
            } else {
                var29++;
            }
            if (class35.field746 == null) {
                class35.field746 = class100.method835(class3.field89, class158.field3633, class150.field3467, (byte) -124);
            } else {
                var29++;
            }
            if (class66.field1482 == null) {
                class66.field1482 = class67.method476(class3.field89, class59.field1314, class158.field3633, (byte) -113);
            } else {
                var29++;
            }
            if (class59.field1348 == null) {
                class59.field1348 = class67.method476(class3.field89, class119.field2771, class158.field3633, (byte) -103);
            } else {
                var29++;
            }
            if (class57.field1273 == null) {
                class57.field1273 = class67.method476(class3.field89, class111.field2624, class158.field3633, (byte) -112);
            } else {
                var29++;
            }
            if (class137.field3107 == null) {
                class137.field3107 = class67.method476(class3.field89, class97.field2351, class158.field3633, (byte) -125);
            } else {
                var29++;
            }
            if (class119.field2766 == null) {
                class119.field2766 = class67.method476(class3.field89, class123.field2852, class158.field3633, (byte) 42);
            } else {
                var29++;
            }
            if (class31.field661 == null) {
                class31.field661 = class67.method476(class3.field89, class116.field2703, class158.field3633, (byte) 122);
            } else {
                var29++;
            }
            if (class28.field583 == null) {
                class28.field583 = class67.method476(class3.field89, class100.field2419, class158.field3633, (byte) 120);
            } else {
                var29++;
            }
            if (class42.field969 == null) {
                class42.field969 = class67.method476(class3.field89, class35.field756, class158.field3633, (byte) 72);
            } else {
                var29++;
            }
            if (class138.field3128 == null) {
                class138.field3128 = class100.method835(class3.field89, class158.field3633, class118.field2757, (byte) -118);
            } else {
                var29++;
            }
            if (class120.field2798 == null) {
                class120.field2798 = class100.method835(class3.field89, class158.field3633, class127.field2933, (byte) -118);
            } else {
                var29++;
            }
            if (class77.field1854 == null) {
                class77.field1854 = class29.method199(class158.field3633, class90.field2126, class3.field89, 126);
            } else {
                var29++;
            }
            if (var29 < 14) {
                class134.field3067 = class71.method509(new class146[] { class132.field3004, class75.method564(false, var29 * 100 / 14), class145.field3314 }, (byte) -89);
                class105.field2519 = 70;
            } else {
                class99.field2393 = class120.field2798;
                int var30 = (int) (Math.random() * 21.0D) - 10;
                class107.field2566.method438();
                int var31 = (int) (Math.random() * 21.0D) - 10;
                int var32 = (int) (Math.random() * 21.0D) - 10;
                int var33 = (int) (Math.random() * 41.0D) - 20;
                for (int var34 = 0; var34 < class66.field1482.length; var34++) {
                    class66.field1482[var34].method444(var31 + var33, var30 - -var33, var32 + var33);
                }
                class35.field746[0].method1064(var31 + var33, var30 + var33, var32 + var33);
                class111.method875((byte) -114);
                class76.field1813 = 90;
                class105.field2519 = 70;
                class134.field3067 = class6.field137;
            }
        } else if (class76.field1813 == 90) {
            if (class68.field1557.method590((byte) -56)) {
                class49 var35 = new class49(class68.field1557, class3.field89, 20, 0.8D, class91.field2196 ? 64 : 128);
                class45.method298(var35);
                class45.method305(0.8D);
                class105.field2519 = 90;
                class134.field3067 = class120.field2784;
                class76.field1813 = 110;
            } else {
                class134.field3067 = class71.method509(new class146[] { class103.field2507, class75.method564(false, class68.field1557.method163(false)), class145.field3314 }, (byte) 118);
                class105.field2519 = 90;
            }
        } else if (class76.field1813 == 110) {
            class111.field2630 = new class29();
            class145.field3293.method123(class111.field2630, 10, -122);
            class105.field2519 = 94;
            class134.field3067 = class138.field3118;
            class76.field1813 = 120;
        } else if (class76.field1813 == 120) {
            if (class22.field363.method588(21014, class116.field2690, class158.field3633)) {
                class34 var36 = new class34(class22.field363.method583(class116.field2690, (byte) -122, class158.field3633));
                class77.method595(var36, (byte) -16);
                class105.field2519 = 96;
                class76.field1813 = 130;
                class134.field3067 = class71.field1642;
            } else {
                class134.field3067 = class71.method509(new class146[] { class73.field1699, class117.field2739 }, (byte) 59);
                class105.field2519 = 96;
            }
        } else if (class76.field1813 == 130) {
            if (!class82.field1989.method590((byte) -55)) {
                class134.field3067 = class71.method509(new class146[] { class52.field1183, class75.method564(false, class82.field1989.method163(false) * 4 / 5), class145.field3314 }, (byte) 56);
                class105.field2519 = 100;
            } else if (!class76.field1815.method590((byte) -40)) {
                class134.field3067 = class71.method509(new class146[] { class52.field1183, class75.method564(false, class76.field1815.method163(false) / 6 + 80), class145.field3314 }, (byte) -121);
                class105.field2519 = 100;
            } else if (class79.field1943.method590((byte) 124)) {
                class134.field3067 = class132.field3018;
                class105.field2519 = 100;
                class76.field1813 = 140;
            } else {
                class134.field3067 = class71.method509(new class146[] { class52.field1183, class75.method564(false, class79.field1943.method163(false) / 20 + 96), class145.field3314 }, (byte) -94);
                class105.field2519 = 100;
            }
        } else if (class76.field1813 == 140) {
            class88.method702(10, false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILdd;)Z")
    public static final boolean method8(int arg0, class26 arg1) {
        field40++;
        if (arg1.field518 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field518.length; var2++) {
            int var3 = class38.method258(false, arg1, var2);
            int var4 = arg1.field448[var2];
            if (arg1.field518[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field518[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field518[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 == 50) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public static final void method9(int arg0) {
        field39++;
        if (arg0 != 2) {
            method7(82);
        }
        class157.field3618.method1050(true);
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
    public static void method10(int arg0) {
        field20 = null;
        field44 = null;
        field32 = null;
        field43 = null;
        field31 = null;
        field27 = null;
        field17 = null;
        field46 = null;
        field42 = null;
        field26 = null;
        field33 = null;
        field41 = null;
        if (arg0 < 105) {
            method5(true, false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method11(KeyEvent arg0, int arg1) {
        field28++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= arg1 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)I")
    public final int method12(int arg0, int arg1, byte arg2) {
        field21++;
        int var4 = this.field34;
        this.field34 = 300;
        int var5 = this.field29;
        this.field29 = 1;
        this.field18 = class51.method345((byte) -1);
        if (this.field25[this.field19] == 0L) {
            this.field34 = var4;
            this.field29 = var5;
        } else if (this.field18 > this.field25[this.field19]) {
            this.field34 = (int) ((long) (arg0 * 2560) / (this.field18 - this.field25[this.field19]));
        }
        if (this.field34 < 25) {
            this.field34 = 25;
        }
        if (this.field34 > 256) {
            this.field34 = 256;
            this.field29 = (int) ((long) arg0 - (this.field18 - this.field25[this.field19]) / 10L);
        }
        if (this.field29 > arg0) {
            this.field29 = arg0;
        }
        this.field25[this.field19] = this.field18;
        if (arg2 != 12) {
            method6(-17);
        }
        this.field19 = (this.field19 + 1) % 10;
        if (this.field29 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field25[var6] != 0L) {
                    this.field25[var6] += this.field29;
                }
            }
        }
        if (arg1 > this.field29) {
            this.field29 = arg1;
        }
        class6.method51((long) this.field29, -14344);
        int var7 = 0;
        while (this.field23 < 256) {
            this.field23 += this.field34;
            var7++;
        }
        this.field23 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field25[var1] = this.field18;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public final void method13(boolean arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field25[var2] = 0L;
        }
        if (arg0) {
            method11(null, -24);
        }
        field24++;
    }
}
