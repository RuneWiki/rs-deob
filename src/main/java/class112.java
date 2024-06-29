import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class112 extends class18 {

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public int field1837 = 0;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "Loh;")
    public static class281 field1835 = new class281(5);

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field1839 = 0;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field1841 = 0;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field1840 = 0;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)Lbh;")
    public static final class7 method790(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        return var3 == null ? null : var3.field147;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLai;)V")
    public static final void method791(byte arg0, class88 arg1) {
        if (arg0 > -107) {
            return;
        }
        while (true) {
            while (arg1.field1471.length > arg1.field1535) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg1.method633(49) == 1) {
                    var3 = arg1.method633(76);
                    var2 = arg1.method633(89);
                    var4 = true;
                }
                int var5 = arg1.method633(114);
                int var6 = arg1.method633(101);
                int var7 = var5 * 64 - class101.field1697;
                int var8 = class164.field2584 - (var6 * 64 + 1 - class191.field2970);
                if (var7 >= 0 && var8 - 63 >= 0 && class85.field1431 > var7 + 63 && class191.field2970 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= (var2 * 8) && var12 < var2 * 8 + 8) {
                                byte var13 = arg1.method656(-252);
                                if (var13 != 0) {
                                    if (class106.field1755[var9][var10] == null) {
                                        class106.field1755[var9][var10] = new byte[4096];
                                    }
                                    class106.field1755[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method656(-252);
                                    if (class272.field4364[var9][var10] == null) {
                                        class272.field4364[var9][var10] = new byte[4096];
                                    }
                                    class272.field4364[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var4 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method656(-252);
                        if (var16 != 0) {
                            arg1.field1535++;
                        }
                    }
                }
            }
            field1828++;
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public static void method792(int arg0) {
        if (arg0 != 0) {
            field1835 = null;
        }
        field1835 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(BLai;)V")
    public final void method793(byte arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method633(88);
            if (var3 == 0) {
                field1831++;
                if (arg0 < 126) {
                    method797(100, 42);
                    return;
                }
                return;
            }
            this.method798(arg1, 2, var3);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class141.method951(arg4, false);
        int var7 = 0;
        field1834++;
        int var8 = arg4 - arg2;
        int var9 = arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg6 != 121) {
            return;
        }
        if (arg0 >= class90.field1568 && class266.field4247 >= arg0) {
            int[] var10 = class154.field2406[arg0];
            int var11 = class219.method1470(class223.field3423, arg5 - arg4, -1, class148.field2338);
            int var12 = class219.method1470(class223.field3423, arg4 + arg5, arg6 + -122, class148.field2338);
            int var13 = class219.method1470(class223.field3423, arg5 - var8, -1, class148.field2338);
            int var14 = class219.method1470(class223.field3423, arg5 + var8, -1, class148.field2338);
            class166.method1124(true, var10, var13, arg3, var11);
            class166.method1124(true, var10, var14, arg1, var13);
            class166.method1124(true, var10, var12, arg3, var14);
        }
        int var15 = -1;
        int var16 = -var8;
        int var17 = var8;
        int var18 = -arg4;
        int var19 = -1;
        while (var7 < var9) {
            var15 += 2;
            var19 += 2;
            var16 += var15;
            if (var16 >= 0 && var17 >= 1) {
                var17--;
                class243.field3963[var17] = var7;
                var16 -= var17 << 1;
            }
            var7++;
            var18 += var19;
            if (var18 >= 0) {
                var9--;
                var18 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (var21 >= class90.field1568 && var20 <= class266.field4247) {
                    if (var8 <= var9) {
                        int var22 = class219.method1470(class223.field3423, arg5 + var7, -1, class148.field2338);
                        int var23 = class219.method1470(class223.field3423, arg5 - var7, -1, class148.field2338);
                        if (class266.field4247 >= var21) {
                            class166.method1124(true, class154.field2406[var21], var22, arg3, var23);
                        }
                        if (var20 >= class90.field1568) {
                            class166.method1124(true, class154.field2406[var20], var22, arg3, var23);
                        }
                    } else {
                        int var24 = class243.field3963[var9];
                        int var25 = class219.method1470(class223.field3423, arg5 + var7, -1, class148.field2338);
                        int var26 = class219.method1470(class223.field3423, arg5 - var7, arg6 ^ 0xFFFFFF86, class148.field2338);
                        int var27 = class219.method1470(class223.field3423, arg5 + var24, -1, class148.field2338);
                        int var28 = class219.method1470(class223.field3423, arg5 - var24, -1, class148.field2338);
                        if (var21 <= class266.field4247) {
                            int[] var29 = class154.field2406[var21];
                            class166.method1124(true, var29, var28, arg3, var26);
                            class166.method1124(true, var29, var27, arg1, var28);
                            class166.method1124(true, var29, var25, arg3, var27);
                        }
                        if (var20 >= class90.field1568) {
                            int[] var30 = class154.field2406[var20];
                            class166.method1124(true, var30, var28, arg3, var26);
                            class166.method1124(true, var30, var27, arg1, var28);
                            class166.method1124(true, var30, var25, arg3, var27);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (class90.field1568 <= var32 && var31 <= class266.field4247) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (class223.field3423 <= var33 && class148.field2338 >= var34) {
                    int var35 = class219.method1470(class223.field3423, var33, -1, class148.field2338);
                    int var36 = class219.method1470(class223.field3423, var34, -1, class148.field2338);
                    if (var8 > var7) {
                        int var37 = var7 <= var17 ? var17 : class243.field3963[var7];
                        int var38 = class219.method1470(class223.field3423, arg5 + var37, arg6 + -122, class148.field2338);
                        int var39 = class219.method1470(class223.field3423, arg5 - var37, -1, class148.field2338);
                        if (var32 <= class266.field4247) {
                            int[] var40 = class154.field2406[var32];
                            class166.method1124(true, var40, var39, arg3, var36);
                            class166.method1124(true, var40, var38, arg1, var39);
                            class166.method1124(true, var40, var35, arg3, var38);
                        }
                        if (var31 >= class90.field1568) {
                            int[] var41 = class154.field2406[var31];
                            class166.method1124(true, var41, var39, arg3, var36);
                            class166.method1124(true, var41, var38, arg1, var39);
                            class166.method1124(true, var41, var35, arg3, var38);
                        }
                    } else {
                        if (var32 <= class266.field4247) {
                            class166.method1124(true, class154.field2406[var32], var35, arg3, var36);
                        }
                        if (class90.field1568 <= var31) {
                            class166.method1124(true, class154.field2406[var31], var35, arg3, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILhc;II)Ljb;")
    public static final class276 method795(int arg0, class235 arg1, int arg2, int arg3) {
        field1836++;
        if (arg2 == 0) {
            return class212.method1440(arg3, arg1, arg0, arg2 + 41) ? class28.method219(64) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public static final void method796(byte arg0) {
        field1832++;
        int var1 = class286.field4520;
        int var2 = class157.field2446;
        int var3 = class190.field2951 - 3;
        byte var4 = 20;
        int var5 = class141.field2150;
        if (class278.field4410 == null || class193.field3048 == null) {
            if (class130.field2055.method1613(false, class10.field175) && class130.field2055.method1613(false, class56.field929)) {
                class278.field4410 = method795(class10.field175, class130.field2055, 0, 0);
                class193.field3048 = method795(class56.field929, class130.field2055, 0, 0);
            } else {
                class211.method1423(var1, var2, var5, var4, class244.field3976, 256 - class69.field1114);
            }
        }
        if (class278.field4410 != null && class193.field3048 != null) {
            int var6 = (var5 - (class193.field3048.field2874 * 2)) / class278.field4410.field2874;
            for (int var7 = 0; var7 < var6; var7++) {
                class278.field4410.method856(class193.field3048.field2874 + var1 + (class278.field4410.field2874 * var7), var2);
            }
            class193.field3048.method856(var1, var2);
            class193.field3048.method858(var1 + var5 - class193.field3048.field2874, var2);
        }
        class228.field3517.method1676(class89.field1563, var1 + 3, var2 + 14, class259.field4147, -1);
        class211.method1423(var1, var2 + var4, var5, var3 - var4, class244.field3976, 256 - class69.field1114);
        if (arg0 <= 67) {
            field1841 = -54;
        }
        int var8 = class115.field1883;
        int var9 = class79.field1323;
        for (int var10 = 0; var10 < class128.field2018; var10++) {
            int var18 = (class128.field2018 - var10 - 1) * 15 + var2 + var4 + 13;
            if (var9 > var1 && var1 + var5 > var9 && var8 > var18 - 13 && (var18 + 3) > var8) {
                class211.method1423(var1, var18 - 12, var5, 15, class141.field2152, 256 - class97.field1627);
            }
        }
        if ((class47.field684 == null || class154.field2402 == null || class129.field2021 == null) && class130.field2055.method1613(false, class265.field4215) && class130.field2055.method1613(false, class295.field4657) && class130.field2055.method1613(false, class259.field4129)) {
            class47.field684 = method795(class265.field4215, class130.field2055, 0, 0);
            class154.field2402 = method795(class295.field4657, class130.field2055, 0, 0);
            class129.field2021 = method795(class259.field4129, class130.field2055, 0, 0);
        }
        if (class47.field684 != null && class154.field2402 != null && class129.field2021 != null) {
            int var11 = (var5 - (class129.field2021.field2874 * 2)) / class47.field684.field2874;
            for (int var12 = 0; var12 < var11; var12++) {
                class47.field684.method856(class47.field684.field2874 * var12 + var1 + class129.field2021.field2874, var2 + var3 + -class47.field684.field2871);
            }
            int var13 = (var3 - var4 - class129.field2021.field2871) / class154.field2402.field2871;
            for (int var14 = 0; var14 < var13; var14++) {
                class154.field2402.method856(var1, class154.field2402.field2871 * var14 + var2 + var4);
                class154.field2402.method858(var1 + var5 - class154.field2402.field2874, var2 + var4 - -(class154.field2402.field2871 * var14));
            }
            class129.field2021.method856(var1, var2 - (class129.field2021.field2871 - var3));
            class129.field2021.method858(var1 + var5 - class129.field2021.field2874, var2 + var3 + -class129.field2021.field2871);
        }
        for (int var15 = 0; var15 < class128.field2018; var15++) {
            int var16 = var2 - (-var4 - (((class128.field2018 - var15 - 1) * 15) + 13));
            int var17 = class259.field4147;
            if (var9 > var1 && (var1 + var5) > var9 && var8 > (var16 - 13) && (var16 + 3) > var8) {
                var17 = class294.field4635;
            }
            class228.field3517.method1676(class179.method1214(var15, -1), var1 + 3, var16, var17, 0);
        }
        class186.method1257(class157.field2446, class190.field2951, class141.field2150, class286.field4520, 0);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)Lg;")
    public static final class284 method797(int arg0, int arg1) {
        if (arg0 != 0) {
            field1835 = null;
        }
        field1830++;
        return class40.field572 && class65.field1085 <= arg1 && arg1 <= class52.field770 ? class136.field2103[arg1 - class65.field1085] : null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lai;II)V")
    private final void method798(class88 arg0, int arg1, int arg2) {
        field1829++;
        if (arg1 == arg2) {
            this.field1837 = arg0.method645(11596);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lhc;B)V")
    public static final void method799(class235 arg0, byte arg1) {
        if (arg1 != 27) {
            method795(-55, (class235) null, 13, -37);
        }
        field1833++;
        class208.field3236 = class39.method286(arg1 + 268423810, 0, class173.field2729, arg0);
        class222.field3405 = class159.method1074(arg0, 0, class111.field1813, (byte) 91);
        class28.field391 = class159.method1074(arg0, 0, class72.field1170, (byte) 110);
        class95.field1617 = class159.method1074(arg0, 0, class60.field1026, (byte) 123);
        class274.field4369 = class159.method1074(arg0, 0, class231.field3679, (byte) 125);
        class167.field2615 = class159.method1074(arg0, 0, class239.field3881, (byte) 87);
        class277.field4405 = class159.method1074(arg0, 0, class95.field1616, (byte) 113);
        class214.field3330 = class184.method1246(0, arg0, -26, class229.field3647);
        class145.field2306 = class254.method1733(class34.field509, (byte) -111, arg0, 0);
        class275.field4385 = class254.method1733(class61.field1051, (byte) -113, arg0, 0);
        class47.field680 = class98.method718(-34, 0, arg0, class40.field581);
        class132.field2071 = class98.method718(arg1 - 148, 0, arg0, class203.field3166);
        class28.field392.method1660(class132.field2071, (int[]) null);
        class179.field2784.method1660(class132.field2071, (int[]) null);
        class228.field3517.method1660(class132.field2071, (int[]) null);
        class276 var2 = class99.method726(arg0, 3, class48.field696, 0);
        var2.method1858();
        class41.field586 = var2;
        class276[] var3 = class39.method286(arg1 + 268423810, 0, class204.field3182, arg0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1858();
        }
        class244.field3967 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 41.0D) - 20;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        for (int var9 = 0; var9 < class208.field3236.length; var9++) {
            class208.field3236[var9].method1857(var5 + var7, var6 + var7, var7 + var8);
        }
        class197.field3108 = class208.field3236;
    }
}
