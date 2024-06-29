import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class77 {

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public int field1386 = 0;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public int field1390 = 0;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lkb;")
    public static class93 field1388 = class76.method390("mapedge", 0);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lkb;")
    public static class93 field1383 = class76.method390("Mem:", 0);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lqd;")
    public static class149 field1393;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lac;")
    public class4 field1381;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lac;")
    public class4 field1392;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
    public static int[] field1382;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public static final void method392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg4; var5 < class23.field357; var5++) {
            if (class49.field783[var5] + class136.field2645[var5] > arg0 && arg0 + arg3 > class136.field2645[var5] && class64.field1024[var5] + class36.field592[var5] > arg1 && arg1 + arg2 > class36.field592[var5]) {
                class203.field3927[var5] = true;
            }
        }
        field1398++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lef;ILef;)V")
    public static final void method393(class45 arg0, int arg1, class45 arg2) {
        field1396++;
        if (class157.field3105) {
            class104.method575(120, arg2, arg0);
            return;
        }
        if (class28.field455 == 0 || class28.field455 == 5) {
            byte var3 = 20;
            arg0.method997(class63.field1004, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class118.method669(230, var4, 304, 34, 9179409);
            class118.method669(231, var4 + 1, 302, 32, 0);
            class118.method651(232, var4 + 2, class62.field985 * 3, 30, 9179409);
            class118.method651(class62.field985 * 3 + 232, var4 + 2, 300 - class62.field985 * 3, 30, 0);
            arg0.method997(class148.field2843, 382, 276 - var3, 16777215, -1);
        }
        if (class28.field455 == 20) {
            class141.field2758.method674(382 - class141.field2758.field2211 / 2, 271 - class141.field2758.field2212 / 2);
            short var5 = 211;
            arg0.method997(class148.field2849, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method997(class148.field2845, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method997(class148.field2856, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method1013(class203.method1321(new class93[] { class175.field3459, class156.method1007(class148.field2862) }, arg1 - 16777278), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg0.method1013(class203.method1321(new class93[] { class124.field2316, class148.field2850.method509(-1) }, -78), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (arg1 != 16777215) {
            method393(null, 74, null);
        }
        if (class28.field455 == 10) {
            class141.field2758.method674(202, 171);
            if (class139.field2694 == 0) {
                short var6 = 251;
                arg0.method997(class89.field1609, 382, var6, 16776960, 0);
                int var27 = var6 + 30;
                short var7 = 302;
                short var8 = 291;
                class9.field155.method674(var7 - 73, var8 + -20);
                arg0.method1011(class114.field2115, var7 - 73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class9.field155.method674(var9 - 73, var8 - 20);
                arg0.method1011(class73.field1333, var9 - 73, var8 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class139.field2694 == 2) {
                short var10 = 211;
                arg0.method997(class148.field2849, 382, var10, 16776960, 0);
                short var11 = 321;
                short var12 = 302;
                int var30 = var10 + 15;
                arg0.method997(class148.field2845, 382, var30, 16776960, 0);
                int var31 = var30 + 15;
                arg0.method997(class148.field2856, 382, var31, 16776960, 0);
                boolean var13;
                if (client.field498 == 0 && class21.field338 % 40 < 20 && class102.field1888) {
                    var13 = true;
                } else {
                    var13 = false;
                }
                var30 = var31 + 15;
                var30 += 10;
                arg0.method1013(class203.method1321(new class93[] { class175.field3459, class156.method1007(class148.field2862), var13 ? class166.field3326 : class148.field2863 }, 114), 272, var30, 16777215, 0);
                boolean var14;
                if (client.field498 == 1 && class21.field338 % 40 < 20 && class102.field1888) {
                    var14 = true;
                } else {
                    var14 = false;
                }
                var30 += 15;
                arg0.method1013(class203.method1321(new class93[] { class124.field2316, class148.field2850.method509(-1), var14 ? class166.field3326 : class148.field2863 }, -30), 274, var30, 16777215, 0);
                var30 += 15;
                class9.field155.method674(var12 - 73, var11 + -20);
                arg0.method997(class145.field2820, var12, var11 + 5, 16777215, 0);
                short var15 = 462;
                class9.field155.method674(var15 - 73, var11 + -20);
                arg0.method997(class32.field530, var15, var11 + 5, 16777215, 0);
            } else if (class139.field2694 == 3) {
                arg0.method997(class205.field3963, 382, 211, 16776960, 0);
                short var16 = 382;
                short var17 = 236;
                arg0.method997(class69.field1282, 382, var17, 16777215, 0);
                int var32 = var17 + 15;
                arg0.method997(class157.field3108, 382, var32, 16777215, 0);
                int var33 = var32 + 15;
                arg0.method997(class83.field1529, 382, var33, 16777215, 0);
                short var18 = 321;
                int var34 = var33 + 15;
                arg0.method997(class40.field668, 382, var34, 16777215, 0);
                class9.field155.method674(var16 - 73, var18 + -20);
                int var35 = var34 + 15;
                arg0.method997(class32.field530, var16, var18 + 5, 16777215, 0);
            }
        }
        if (class141.field2749 != 1) {
            if (class40.field671 > 0) {
                class53.method291(class40.field671, 0);
                class40.field671 = 0;
            }
            class114.method632(arg1 ^ 0x77395D17);
        }
        class166.field3320[class169.field3360 ? 1 : 0].method674(725, 463);
        if (class28.field455 <= 5 || class57.field936 == 2 || class139.field2693 != 0) {
            return;
        }
        if (class114.field2127 == null) {
            class114.field2127 = class122.method697(arg1 - 16777093, class197.field3835, class206.field4030, class148.field2863);
            return;
        }
        short var19 = 463;
        byte var20 = 100;
        byte var21 = 5;
        byte var22 = 35;
        class114.field2127.method674(var21, var19);
        arg0.method997(class203.method1321(new class93[] { class68.field1254, class108.field1961, class67.method357((byte) -123, class204.field3947) }, 97), var20 / 2 + var21, var19 - (-(var22 / 2) + 2), 16777215, 0);
        if (class61.field967 == null) {
            arg2.method997(class40.field660, var20 / 2 + var21, var22 / 2 + var19 + 12, 16777215, 0);
        } else {
            arg2.method997(class37.field623, var20 / 2 + var21, var22 / 2 + var19 + 12, 16777215, 0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static void method394(boolean arg0) {
        field1383 = null;
        field1393 = null;
        field1388 = null;
        if (arg0) {
            field1382 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZI)I")
    public static final int method395(boolean arg0, boolean arg1, int arg2) {
        field1389++;
        int var3 = 0;
        if (arg1) {
            var3 += class25.field373 + class155.field3054;
        }
        if (arg0) {
            var3 += class85.field1549 + class15.field271;
        }
        if (arg2 > -35) {
            field1383 = null;
        }
        return var3;
    }
}
