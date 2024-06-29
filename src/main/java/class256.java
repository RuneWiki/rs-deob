import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class256 {

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lka;")
    private class473 field3486 = new class473(64);

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Ldk;")
    private class421 field3489;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Ldk;")
    private class421 field3480;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lkc;")
    public static class157 field3484 = new class157("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lpu;")
    public static class177 field3487;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1524(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3485++;
        int var7 = class210.field3001;
        class248.field3372 = 0;
        int[] var8 = class169.field2570;
        for (int var9 = 0; var9 < (class273.field3692 + var7); var9++) {
            class83 var32 = null;
            class16 var33;
            if (var9 < var7) {
                var33 = class45.field642[var8[var9]];
            } else {
                var33 = ((class326) class281.field3826.method1592((byte) -25, (long) class159.field2416[var9 - var7])).field4455;
                var32 = ((class209) var33).field2976;
                if (var32.field1272 != null) {
                    var32 = var32.method655(class309.field4200, (byte) 124);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field248 >= 0 && (class367.field5267 == var33.field201 || class81.field1158.field6279 == var33.field6279)) {
                class133.method963(arg3, (byte) 107, var33.method119(14336), arg0 >> 1, arg1 >> 1, arg5, var33);
                if (class385.field5520[0] >= 0) {
                    if (var33.field218 != null && (var7 <= var9 || class206.field2963 == 0 || class206.field2963 == 3 || class206.field2963 == 1 && class488.method2898((byte) -71, ((class487) var33).field7036)) && class248.field3372 < class55.field797) {
                        class55.field806[class248.field3372] = class80.field1127.method416(8364, var33.field218) / 2;
                        class55.field793[class248.field3372] = class385.field5520[0];
                        class55.field803[class248.field3372] = class385.field5520[1];
                        class55.field800[class248.field3372] = var33.field178;
                        class55.field787[class248.field3372] = var33.field157;
                        class55.field804[class248.field3372] = var33.field234;
                        class55.field786[class248.field3372] = var33.field218;
                        class248.field3372++;
                    }
                    int var34 = class385.field5520[1] + arg2;
                    int var45;
                    if (var33.field213 || class28.field417 >= var33.field238) {
                        var45 = var34 - Math.max(class80.field1127.field896, class166.field2548[0].method200());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class487 var37 = class45.field642[var8[var9]];
                            var38 = var33.method108(true).field7204;
                            if (var37.field7046) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field1287;
                            if (var38 == -1) {
                                var38 = var33.method108(!arg4).field7204;
                            }
                        }
                        class359[] var39 = class166.field2548;
                        if (var38 != -1) {
                            class359[] var40 = (class359[]) class32.field487.method2767((long) var38, 0);
                            if (var40 == null) {
                                class396[] var41 = class396.method2347(class509.field7453, var38, 0);
                                if (var41 != null) {
                                    var40 = new class359[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class275.field3737.method555(var41[var42], true);
                                    }
                                    class32.field487.method2777(-1025, var40, (long) var38);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class359 var43 = var39[0];
                        class359 var44 = var39[var36];
                        var45 = var34 - Math.max(class80.field1127.field896, var43.method200());
                        int var46 = class385.field5520[0] + arg6 - (var43.method205() >> 1);
                        int var47 = var43.method205() * var33.field189 / 255;
                        if (var33.field189 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2142(var46, var45);
                        class275.field3737.method515(var46, var45, var46 + var47, var45 - -var43.method200());
                        var44.method2142(var46, var45);
                        class275.field3737.method511(arg6, arg2, arg0 + arg6, arg1 + arg2);
                    }
                    var45 -= 2;
                    if (!var33.field213) {
                        if (class28.field417 < var33.field244) {
                            class359 var48 = class230.field3224[var33.field245 ? 2 : 0];
                            class359 var49 = class230.field3224[var33.field245 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class209) {
                                var51 = var32.field1248;
                                if (var51 == -1) {
                                    var51 = var33.method108(!arg4).field7207;
                                }
                            } else {
                                var51 = var33.method108(true).field7207;
                            }
                            if (var51 != -1) {
                                class359[] var52 = (class359[]) class269.field3626.method2767((long) var51, 0);
                                if (var52 == null) {
                                    class396[] var53 = class396.method2347(class509.field7453, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class359[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class275.field3737.method555(var53[var54], true);
                                        }
                                        class269.field3626.method2777(-1025, var52, (long) var51);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field245 ? 2 : 0];
                                    var49 = var52[var33.field245 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field244 - class28.field417;
                            int var56;
                            if (var55 <= var33.field207) {
                                var56 = var48.method205();
                            } else {
                                int var57 = var55 - var33.field207;
                                int var58 = var33.field228 == 0 ? 0 : (var33.field197 - var57) / var33.field228 * var33.field228;
                                var56 = var48.method205() * var58 / var33.field197;
                            }
                            int var59 = var48.method200();
                            var45 -= var59;
                            int var60 = arg6 + class385.field5520[0] - (var48.method205() >> 1);
                            var48.method2142(var60, var45);
                            class275.field3737.method515(var60, var45, var56 + var60, var45 + var59);
                            var49.method2142(var60, var45);
                            var45 -= 2;
                            class275.field3737.method511(arg6, arg2, arg0 + arg6, arg1 + arg2);
                        }
                        if (var9 < var7) {
                            class487 var62 = (class487) var33;
                            if (var62.field7034 != -1) {
                                var45 -= 25;
                                class487.field7056[var62.field7034].method2142(arg6 + class385.field5520[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field7038 != -1) {
                                var45 -= 25;
                                class360.field5175[var62.field7038].method2142(class385.field5520[0] + arg6 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field1261 >= 0 && class360.field5175.length > var32.field1261) {
                            var45 -= 25;
                            class359 var61 = class360.field5175[var32.field1261];
                            var61.method2142(class385.field5520[0] + arg6 - (var61.method205() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class487) {
                        int var69 = 0;
                        class449[] var70 = class413.field5884;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class449 var76 = var70[var71];
                            if (var76 != null && var76.field6572 == 1 && class159.field2416[var9 - var7] == var76.field6581) {
                                class359 var77 = class443.field6382[var76.field6577];
                                if (var77.method200() > var69) {
                                    var69 = var77.method200();
                                }
                                if (class28.field417 % 20 < 10) {
                                    var77.method2142(class385.field5520[0] + arg6 - 12, -var77.method200() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class449[] var64 = class413.field5884;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class449 var67 = var64[var65];
                            if (var67 != null && var67.field6572 == 10 && var8[var9] == var67.field6581) {
                                class359 var68 = class443.field6382[var67.field6577];
                                if (var68.method200() > var63) {
                                    var63 = var68.method200();
                                }
                                var68.method2142(class385.field5520[0] + arg6 - 12, -var68.method200() + var45);
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (var33.field229[var73] > class28.field417) {
                            int var74 = var33.method119(14336) / 2;
                            class133.method963(arg3, (byte) 120, var74, arg0 >> 1, arg1 >> 1, arg5, var33);
                            if (class385.field5520[0] > -1) {
                                int var75 = class306.field4149[var33.field216[var73]].method205();
                                if (var73 == 1) {
                                    class385.field5520[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class385.field5520[0] -= var75 - 9;
                                    class385.field5520[1] -= 10;
                                }
                                if (var73 == 3) {
                                    class385.field5520[0] += var75 - 9;
                                    class385.field5520[1] -= 10;
                                }
                                class306.field4149[var33.field216[var73]].method2142(arg6 + class385.field5520[0] - (var75 >> 1), class385.field5520[1] + arg2 + -12);
                                class347.field4988.method1772(-1, Integer.toString(var33.field217[var73]), -117, 0, arg2 + class385.field5520[1] + 3, class385.field5520[0] + arg6 + -1);
                            }
                        }
                    }
                }
            }
        }
        if (arg4) {
            field3488 = -17;
        }
        for (int var10 = 0; var10 < class17.field276; var10++) {
            int var28 = class367.field5263[var10];
            class16 var29;
            if (var28 >= 2048) {
                var29 = ((class326) class281.field3826.method1592((byte) -25, (long) (var28 - 2048))).field4455;
            } else {
                var29 = class45.field642[var28];
            }
            int var30 = class394.field5684[var10];
            class16 var31;
            if (var30 < 2048) {
                var31 = class45.field642[var30];
            } else {
                var31 = ((class326) class281.field3826.method1592((byte) -25, (long) (var30 - 2048))).field4455;
            }
            class383.method2272(arg6, --var29.field224, arg1, var31, arg2, arg0, arg5, false, arg3, var29);
        }
        int var11 = class80.field1127.field883 + class80.field1127.field896 + 2;
        for (int var12 = 0; var12 < class248.field3372; var12++) {
            int var13 = class55.field793[var12];
            int var14 = class55.field803[var12];
            int var15 = class55.field806[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((class55.field803[var27] - var11) < (var14 + 2) && class55.field803[var27] + 2 > -var11 + var14 && var13 - var15 < class55.field793[var27] - -class55.field806[var27] && class55.field793[var27] - class55.field806[var27] < var13 + var15 && var14 > (class55.field803[var27] - var11)) {
                        var14 = class55.field803[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class55.field803[var12] = var14;
            String var17 = class55.field786[var12];
            if (class26.field347 == 0) {
                int var18 = 16776960;
                if (class55.field800[var12] < 6) {
                    var18 = class508.field7420[class55.field800[var12]];
                }
                if (class55.field800[var12] == 6) {
                    var18 = (class367.field5267 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class55.field800[var12] == 7) {
                    var18 = (class367.field5267 % 20) >= 10 ? 65535 : 255;
                }
                if (class55.field800[var12] == 8) {
                    var18 = class367.field5267 % 20 < 10 ? 45056 : 8454016;
                }
                if (class55.field800[var12] == 9) {
                    int var19 = 150 - class55.field804[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16384000 + 16776960 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class55.field800[var12] == 10) {
                    int var20 = 150 - class55.field804[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + 500 + 255 - var20 * 5 - 32768000;
                    }
                }
                if (class55.field800[var12] == 11) {
                    int var21 = 150 - class55.field804[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 + 65280 - 16384250;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class55.field787[var12] == 0) {
                    class108.field1751.method1772(var22, var17, -81, -16777216, arg2 + var14, arg6 + var13);
                }
                if (class55.field787[var12] == 1) {
                    class108.field1751.method1770(arg2 + var14, var22, class367.field5267, arg6 + var13, var17, -16777216, 115);
                }
                if (class55.field787[var12] == 2) {
                    class108.field1751.method1773(class367.field5267, -16777216, (byte) -43, var17, var22, arg2 + var14, arg6 + var13);
                }
                if (class55.field787[var12] == 3) {
                    class108.field1751.method1759(arg2 + var14, 150 - class55.field804[var12], class367.field5267, var22, var17, arg6 + var13, true, -16777216);
                }
                if (class55.field787[var12] == 4) {
                    int var23 = (150 - class55.field804[var12]) * (class80.field1127.method416(8364, var17) + 100) / 150;
                    class275.field3737.method515(arg6 + var13 - 50, arg2, arg6 + var13 + 50, arg2 - -arg1);
                    class108.field1751.method1769(arg2 + var14, arg6 - -50 + var13 - var23, var17, var22, 0, -16777216);
                    class275.field3737.method511(arg6, arg2, arg0 + arg6, arg1 + arg2);
                }
                if (class55.field787[var12] == 5) {
                    int var24 = 150 - class55.field804[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class80.field1127.field896 + class80.field1127.field883;
                    class275.field3737.method515(arg6, arg2 + var14 - var26 - 1, arg0 + arg6, arg2 + var14 + 5);
                    class108.field1751.method1772(var22, var17, -99, -16777216, arg2 + var25 + var14, arg6 - -var13);
                    class275.field3737.method511(arg6, arg2, arg6 + arg0, arg1 + arg2);
                }
            } else {
                class108.field1751.method1772(-256, var17, -102, -16777216, arg2 + var14, arg6 - -var13);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static final void method1525(boolean arg0) {
        field3481++;
        if (arg0) {
            class71.field1020 = new class530();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method1526(int arg0) {
        if (arg0 != 11394) {
            method1526(120);
        }
        field3487 = null;
        field3484 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Ldd;")
    public final class130 method1527(int arg0, int arg1) {
        field3483++;
        class130 var3 = (class130) this.field3486.method2767((long) arg0, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field3480.method2512(0, (byte) -93, arg0 & 0x7FFF);
        } else {
            var4 = this.field3489.method2512(0, (byte) -93, arg0);
        }
        if (arg1 > -122) {
            field3487 = null;
        }
        class130 var5 = new class130();
        if (var4 != null) {
            var5.method939((byte) -108, new class319(var4));
        }
        if (arg0 >= 32768) {
            var5.method932(true);
        }
        this.field3486.method2777(-1025, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZI)I")
    public static final int method1528(int arg0, int arg1, boolean arg2, int arg3) {
        field3479++;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 - 1;
        int var6 = arg3 / arg1;
        int var7 = arg1 - 1 & arg3;
        int var8 = class209.method1329(var6, arg2, var4);
        int var9 = class209.method1329(var6, arg2, var4 + 1);
        int var10 = class209.method1329(var6 + 1, false, var4);
        int var11 = class209.method1329(var6 + 1, arg2, var4 + 1);
        int var12 = class221.method1380(var5, arg1, var9, var8, 118);
        int var13 = class221.method1380(var5, arg1, var11, var10, -18);
        return class221.method1380(var7, arg1, var13, var12, 116);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILdk;Ldk;)V")
    public class256(int arg0, class421 arg1, class421 arg2) {
        this.field3489 = arg1;
        this.field3480 = arg2;
        if (this.field3489 != null) {
            this.field3489.method2509(0, 0);
        }
        if (this.field3480 != null) {
            this.field3480.method2509(0, 0);
        }
    }
}
