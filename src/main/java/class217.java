import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class217 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[I")
    public static int[] field3971 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lli;")
    public static class185 field3974 = class245.method1649("Chargement de la liste des serveurs", -60);

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lfl;")
    public static class191 field3975 = new class191();

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field3976 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Z")
    public static boolean field3979 = true;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lgf;")
    public static class7 field3977 = new class7(4);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lbb;")
    public class75 field3972;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1518(int arg0) {
        field3977 = null;
        if (arg0 != 32) {
            method1520(34, (class82) null, -7, -24, 20);
        }
        field3971 = null;
        field3974 = null;
        field3975 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(JI)V")
    public static final void method1519(long arg0, int arg1) {
        field3973++;
        try {
            Thread.sleep(arg0);
            if (arg1 != 2) {
                method1520(90, (class82) null, -95, 71, -124);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILp;III)V")
    public static final void method1520(int arg0, class82 arg1, int arg2, int arg3, int arg4) {
        class125.method907((byte) -21);
        class159.method1148(arg4, arg2, arg1.field1505 + arg4, arg1.field1498 + arg2);
        if (arg3 != -18651) {
            method1519(-16L, -41);
        }
        field3978++;
        if (class256.field4531 == 2 || class256.field4531 == 5 || class131.field2355 == null) {
            class159.method1129(arg4, arg2, 0, arg1.field1621, arg1.field1609);
        } else {
            int var5 = class241.field4310.field2694 / 32 + 48;
            int var6 = 464 - class241.field4310.field2687 / 32;
            int var7 = class92.field1765 + class191.field3543 & 0x7FF;
            ((class101) class131.field2355).method713(arg4, arg2, arg1.field1505, arg1.field1498, var5, var6, var7, class239.field4270 + 256, arg1.field1621, arg1.field1609);
            if (class2.field44 != null) {
                for (int var8 = 0; var8 < class2.field44.field3133; var8++) {
                    if (class2.field44.method1214(arg3 ^ 0x79BD, var8)) {
                        int var9 = (class2.field44.field3142[var8] - class107.field1933) * 4 + 2 - (class241.field4310.field2687 / 32);
                        int var10 = (class2.field44.field3132[var8] - class77.field1339) * 4 + 2 - (class241.field4310.field2694 / 32);
                        int var11 = class167.field3112[var7];
                        int var12 = class167.field3110[var7];
                        int var13 = var12 * 256 / (class239.field4270 + 256);
                        int var14 = var11 * 256 / (class239.field4270 + 256);
                        int var15 = var9 * var13 + var10 * var14 >> 16;
                        class270 var16 = class189.field3523;
                        int var17 = var9 * var14 - (var10 * var13) >> 16;
                        if (class2.field44.method1212(var8, (byte) 17) == 1) {
                            var16 = class205.field3743;
                        }
                        if (class2.field44.method1212(var8, (byte) 17) == 2) {
                            var16 = class82.field1608;
                        }
                        int var18 = var16.method1853(class2.field44.field3136[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if ((-arg1.field1505) <= var19 && arg1.field1505 >= var19 && (-arg1.field1498) <= var17 && var17 <= arg1.field1498) {
                            int var20 = 16777215;
                            if (class2.field44.field3135[var8] != -1) {
                                var20 = class2.field44.field3135[var8];
                            }
                            class159.method1139(arg1.field1621, arg1.field1609);
                            var16.method1836(class2.field44.field3136[var8], arg1.field1505 / 2 + arg4 + var19, arg1.field1498 / 2 + -var17 + arg2, var18, 50, var20, 0, 256, 1, 0, 0);
                            class159.method1140();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class212.field3898; var21++) {
                int var56 = class97.field1813[var21] * 4 - ((class241.field4310.field2694 / 32) - 2);
                int var57 = class45.field711[var21] * 4 + 2 - (class241.field4310.field2687 / 32);
                class135 var58 = class184.method1294(class45.field713[var21], -28916);
                if (var58.field2502 != null) {
                    var58 = var58.method964((byte) -91);
                    if (var58 == null || var58.field2477 == -1) {
                        continue;
                    }
                }
                class193.method1396(arg4, var56, arg1, var57, class37.field569[var58.field2477], 2, arg2);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class191 var53 = class71.field1238[class265.field4703][var22][var52];
                    if (var53 != null) {
                        int var54 = var52 * 4 + 2 - (class241.field4310.field2687 / 32);
                        int var55 = var22 * 4 + 2 - (class241.field4310.field2694 / 32);
                        class193.method1396(arg4, var55, arg1, var54, class72.field1258[0], 2, arg2);
                    }
                }
            }
            for (int var23 = 0; var23 < class108.field1943; var23++) {
                class71 var48 = class87.field1712[class97.field1811[var23]];
                if (var48 != null && var48.method463(true)) {
                    class81 var49 = var48.field1236;
                    if (var49 != null && var49.field1411 != null) {
                        var49 = var49.method525((byte) -88);
                    }
                    if (var49 != null && var49.field1446 && var49.field1436) {
                        int var50 = var48.field2694 / 32 - (class241.field4310.field2694 / 32);
                        int var51 = var48.field2687 / 32 - (class241.field4310.field2687 / 32);
                        if (var49.field1429 == -1) {
                            class193.method1396(arg4, var50, arg1, var51, class72.field1258[1], 2, arg2);
                        } else {
                            class193.method1396(arg4, var50, arg1, var51, class37.field569[var49.field1429], 2, arg2);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class17.field281; var24++) {
                class188 var38 = class93.field1774[class174.field3187[var24]];
                if (var38 != null && var38.method463(true)) {
                    int var39 = var38.field2694 / 32 - (class241.field4310.field2694 / 32);
                    int var40 = var38.field2687 / 32 - class241.field4310.field2687 / 32;
                    long var41 = var38.field3514.method1327((byte) 101);
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class126.field2253; var44++) {
                        if (class259.field4602[var44] == var41 && class138.field2590[var44] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class48.field786; var46++) {
                        if (class81.field1455[var46].field1278 == var41) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class241.field4310.field3489 != 0 && var38.field3489 != 0 && class241.field4310.field3489 == var38.field3489) {
                        var47 = true;
                    }
                    if (var43) {
                        class193.method1396(arg4, var39, arg1, var40, class72.field1258[3], 2, arg2);
                    } else if (var45) {
                        class193.method1396(arg4, var39, arg1, var40, class72.field1258[5], 2, arg2);
                    } else if (var47) {
                        class193.method1396(arg4, var39, arg1, var40, class72.field1258[4], 2, arg2);
                    } else {
                        class193.method1396(arg4, var39, arg1, var40, class72.field1258[2], 2, arg2);
                    }
                }
            }
            class201[] var25 = class10.field204;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class201 var29 = var25[var26];
                if (var29 != null && var29.field3695 != 0 && (class211.field3851 % 20) < 10) {
                    if (var29.field3695 == 1 && var29.field3689 >= 0 && var29.field3689 < class87.field1712.length) {
                        class71 var30 = class87.field1712[var29.field3689];
                        if (var30 != null) {
                            int var31 = var30.field2694 / 32 - (class241.field4310.field2694 / 32);
                            int var32 = var30.field2687 / 32 - class241.field4310.field2687 / 32;
                            class68.method452(arg4, arg1, var29.field3685, arg2, (byte) 8, var32, var31);
                        }
                    }
                    if (var29.field3695 == 2) {
                        int var33 = (var29.field3677 - class77.field1339) * 4 + 2 - (class241.field4310.field2694 / 32);
                        int var34 = (var29.field3682 - class107.field1933) * 4 + 2 - (class241.field4310.field2687 / 32);
                        class68.method452(arg4, arg1, var29.field3685, arg2, (byte) 8, var34, var33);
                    }
                    if (var29.field3695 == 10 && var29.field3689 >= 0 && class93.field1774.length > var29.field3689) {
                        class188 var35 = class93.field1774[var29.field3689];
                        if (var35 != null) {
                            int var36 = var35.field2694 / 32 - (class241.field4310.field2694 / 32);
                            int var37 = var35.field2687 / 32 - (class241.field4310.field2687 / 32);
                            class68.method452(arg4, arg1, var29.field3685, arg2, (byte) 8, var37, var36);
                        }
                    }
                }
            }
            if (class256.field4551 != 0) {
                int var27 = class256.field4551 * 4 + 2 - (class241.field4310.field2694 / 32);
                int var28 = class24.field405 * 4 + 2 - (class241.field4310.field2687 / 32);
                class193.method1396(arg4, var27, arg1, var28, class118.field2160, 2, arg2);
            }
            class159.method1130(arg4 + (arg1.field1505 / 2) - 1, arg1.field1498 / 2 + (arg2 - 1), 3, 3, 16777215);
        }
        class274.field4855[arg0] = true;
    }
}
