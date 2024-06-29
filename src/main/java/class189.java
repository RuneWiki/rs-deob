import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class189 {

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public int field3402 = 0;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
    public static int[] field3396 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Lvf;")
    private static class265 field3399 = class87.method582(-46, "Prepared sound engine");

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lvf;")
    public static class265 field3397 = field3399;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Lhf;")
    public static final class169 method1288(int arg0, int arg1) {
        if (arg1 != 26529) {
            field3397 = null;
        }
        field3401++;
        class169 var2 = (class169) class216.field3892.method1424((long) arg0, (byte) 98);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field1184.method1332(true, arg0, 26);
        class169 var4 = new class169();
        if (var3 != null) {
            var4.method1120(new class135(var3), (byte) -79);
        }
        class216.field3892.method1419(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLng;)V")
    public final void method1289(byte arg0, class135 arg1) {
        while (true) {
            int var3 = arg1.method920((byte) 89);
            if (var3 == 0) {
                field3404++;
                if (arg0 != -36) {
                    method1295((class192) null, false, -34);
                    return;
                }
                return;
            }
            this.method1291(var3, -6, arg1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III[Lvf;)Lvf;")
    public static final class265 method1290(int arg0, int arg1, int arg2, class265[] arg3) {
        field3405++;
        if (arg0 != 35) {
            method1292(69, 21, (class6) null, 99);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class80.field1519;
            }
            var4 += arg3[arg2 + var5].field4640;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class265 var10 = arg3[arg2 + var8];
            class194.method1342(var10.field4643, 0, var6, var7, var10.field4640);
            var7 += var10.field4640;
        }
        class265 var9 = new class265();
        var9.field4643 = var6;
        var9.field4640 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILng;)V")
    private final void method1291(int arg0, int arg1, class135 arg2) {
        if (~arg0 == arg1) {
            this.field3402 = arg2.method927(125);
        }
        field3400++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILgk;I)V")
    public static final void method1292(int arg0, int arg1, class6 arg2, int arg3) {
        field3406++;
        if (arg2.field215 == 1) {
            class182.method1213(false, arg2.field135, (short) 35, class4.field66, -1, arg2.field219, 0L, 0);
            class141.field2614++;
        }
        if (arg2.field215 == 2 && !class25.field695) {
            class265 var4 = class261.method1734(arg2, 85);
            if (var4 != null) {
                class31.field776++;
                class182.method1213(false, var4, (short) 50, class148.method1022(10, new class265[] { class21.field621, arg2.field247 }), -1, arg2.field219, 0L, -1);
            }
        }
        if (arg2.field215 == 3) {
            class182.method1213(false, class164.field2977, (short) 48, class4.field66, -1, arg2.field219, 0L, 0);
            class57.field1152++;
        }
        if (arg2.field215 == 4) {
            class182.method1213(false, arg2.field135, (short) 3, class4.field66, -1, arg2.field219, 0L, 0);
            class25.field697++;
        }
        if (arg2.field215 == 5) {
            class237.field4140++;
            class182.method1213(false, arg2.field135, (short) 1, class4.field66, -1, arg2.field219, 0L, 0);
        }
        if (arg2.field215 == 6 && class209.field3760 == null) {
            class182.method1213(false, arg2.field135, (short) 49, class4.field66, -1, arg2.field219, 0L, -1);
            class67.field1277++;
        }
        if (arg0 != 29) {
            method1294(-106, -75, -111, 120);
        }
        if (arg2.field187 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field105; var6++) {
                for (int var7 = 0; var7 < arg2.field161; var7++) {
                    int var8 = (arg2.field176 + 32) * var7;
                    int var9 = (arg2.field139 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field199[var5];
                        var9 += arg2.field203[var5];
                    }
                    if (var8 <= arg3 && var9 <= arg1 && var8 + 32 > arg3 && arg1 < var9 + 32) {
                        class4.field57 = var5;
                        class133.field2402 = arg2;
                        if (arg2.field92[var5] > 0) {
                            class261 var10 = class54.method418(arg2.field92[var5] - 1, 0);
                            if (class282.field4969 == 1 && class257.method1690(true, client.method1474(arg2))) {
                                if (class223.field3984 != arg2.field219 || class72.field1375 != var5) {
                                    class76.field1462++;
                                    class182.method1213(false, class205.field3694, (short) 37, class148.method1022(10, new class265[] { class9.field305, class273.field4840, var10.field4548 }), -1, arg2.field219, (long) var10.field4519, var5);
                                }
                            } else if (!class25.field695 || !class257.method1690(true, client.method1474(arg2))) {
                                class265[] var11 = var10.field4496;
                                if (class225.field3998) {
                                    var11 = class172.method1134(var11, -56);
                                }
                                if (class257.method1690(true, client.method1474(arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 4;
                                            } else {
                                                var13 = 14;
                                            }
                                            class182.method1213(false, var11[var12], var13, class148.method1022(10, new class265[] { class111.field1933, var10.field4548 }), -1, arg2.field219, (long) var10.field4519, var5);
                                            class145.field2701++;
                                        }
                                    }
                                }
                                class29.field744++;
                                if (class259.method1726(client.method1474(arg2), -12)) {
                                    class182.method1213(false, class205.field3694, (short) 22, class148.method1022(10, new class265[] { class111.field1933, var10.field4548 }), class104.field1846, arg2.field219, (long) var10.field4519, var5);
                                    class39.field881++;
                                }
                                if (class257.method1690(true, client.method1474(arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class30.field760++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 11;
                                            }
                                            if (var14 == 1) {
                                                var15 = 32;
                                            }
                                            if (var14 == 2) {
                                                var15 = 26;
                                            }
                                            class182.method1213(false, var11[var14], var15, class148.method1022(10, new class265[] { class111.field1933, var10.field4548 }), -1, arg2.field219, (long) var10.field4519, var5);
                                        }
                                    }
                                }
                                class265[] var16 = arg2.field144;
                                if (class225.field3998) {
                                    var16 = class172.method1134(var16, -128);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            class126.field2259++;
                                            if (var17 == 0) {
                                                var18 = 59;
                                            }
                                            if (var17 == 1) {
                                                var18 = 17;
                                            }
                                            if (var17 == 2) {
                                                var18 = 42;
                                            }
                                            if (var17 == 3) {
                                                var18 = 13;
                                            }
                                            if (var17 == 4) {
                                                var18 = 10;
                                            }
                                            class182.method1213(false, var16[var17], var18, class148.method1022(10, new class265[] { class111.field1933, var10.field4548 }), -1, arg2.field219, (long) var10.field4519, var5);
                                        }
                                    }
                                }
                                class182.method1213(false, class72.field1379, (short) 1003, class148.method1022(10, new class265[] { class111.field1933, var10.field4548 }), class277.field4885, arg2.field219, (long) var10.field4519, var5);
                            } else if ((class38.field874 & 0x10) == 16) {
                                class182.method1213(false, class239.field4170, (short) 28, class148.method1022(10, new class265[] { class130.field2286, class273.field4840, var10.field4548 }), -1, arg2.field219, (long) var10.field4519, var5);
                                class252.field4342++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field226) {
            return;
        }
        if (!class25.field695) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class265 var23 = class144.method996(var19, 23332, arg2);
                if (var23 != null) {
                    class93.field1659++;
                    class182.method1213(false, var23, (short) 1001, arg2.field231, class278.method1900(arg2, (byte) -122, var19), arg2.field219, (long) (var19 + 1), arg2.field233);
                }
            }
            class265 var20 = class261.method1734(arg2, 85);
            if (var20 != null) {
                class182.method1213(false, var20, (short) 50, arg2.field231, -1, arg2.field219, 0L, arg2.field233);
                class31.field776++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class265 var22 = class144.method996(var21, arg0 ^ 0x5B39, arg2);
                if (var22 != null) {
                    class93.field1659++;
                    class182.method1213(false, var22, (short) 18, arg2.field231, class278.method1900(arg2, (byte) -3, var21), arg2.field219, (long) (var21 + 1), arg2.field233);
                }
            }
            if (class97.method647(client.method1474(arg2), false)) {
                class67.field1277++;
                class182.method1213(false, class93.field1658, (short) 49, class4.field66, -1, arg2.field219, 0L, arg2.field233);
                return;
            }
            return;
        }
        if (class120.method805(client.method1474(arg2), -766449268) && (class38.field874 & 0x20) == 32) {
            class182.method1213(false, class239.field4170, (short) 29, class148.method1022(10, new class265[] { class130.field2286, class217.field3925, arg2.field231 }), -1, arg2.field219, 0L, arg2.field233);
            class75.field1433++;
            return;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method1293(byte arg0) {
        int var1 = 121 / ((25 - arg0) / 62);
        field3397 = null;
        field3396 = null;
        field3399 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)I")
    public static final int method1294(int arg0, int arg1, int arg2, int arg3) {
        field3407++;
        int var4 = arg1 & arg0 - arg3;
        int var5 = arg2 / arg0;
        int var6 = arg2 & arg0 - 1;
        int var7 = arg1 / arg0;
        int var8 = class54.method422(var7, (byte) 65, var5);
        int var9 = class54.method422(var7 + 1, (byte) 10, var5);
        int var10 = class54.method422(var7, (byte) -119, var5 + 1);
        int var11 = class54.method422(var7 + 1, (byte) -102, var5 + 1);
        int var12 = class42.method358(arg0, var4, arg3 + 65535, var8, var9);
        int var13 = class42.method358(arg0, var4, arg3 + 65535, var10, var11);
        return class42.method358(arg0, var6, 65536, var12, var13);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lfl;ZI)Lka;")
    public static final class160 method1295(class192 arg0, boolean arg1, int arg2) {
        field3403++;
        if (class53.method415(arg0, 11465, arg2)) {
            if (arg1) {
                method1294(24, 122, -35, -122);
            }
            return class140.method970((byte) 110);
        } else {
            return null;
        }
    }
}
