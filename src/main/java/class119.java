import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class119 extends class238 {

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Loa;")
    public static class99 field2104 = class221.method1463(2844, "lila:");

    @OriginalMember(owner = "client!u", name = "A", descriptor = "[[[I")
    public static int[][][] field2106 = new int[4][13][13];

    @OriginalMember(owner = "client!u", name = "F", descriptor = "D")
    public static double field2110 = -1.0D;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Loa;")
    private static class99 field2103 = class221.method1463(2844, "Face here");

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Loa;")
    public static class99 field2111 = class221.method1463(2844, "www)2wtqa");

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Loa;")
    public static class99 field2107 = field2103;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Ltg;")
    public static class182 field2112;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Ltf;I)V")
    public static final void method797(class107 arg0, int arg1) {
        if (arg1 != -16960) {
            field2111 = null;
        }
        field2105++;
        int var2 = arg0.field1937;
        if (var2 == 324) {
            if (class259.field4530 == -1) {
                class259.field4530 = arg0.field1798;
                class171.field3043 = arg0.field1852;
            }
            if (class18.field186.field520) {
                arg0.field1798 = class259.field4530;
            } else {
                arg0.field1798 = class171.field3043;
            }
        } else if (var2 == 325) {
            if (class259.field4530 == -1) {
                class171.field3043 = arg0.field1852;
                class259.field4530 = arg0.field1798;
            }
            if (class18.field186.field520) {
                arg0.field1798 = class171.field3043;
            } else {
                arg0.field1798 = class259.field4530;
            }
        } else if (var2 == 327) {
            arg0.field1788 = 150;
            arg0.field1781 = (int) (Math.sin((double) class56.field926 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1939 = -1;
            arg0.field1851 = 5;
        } else if (var2 == 328) {
            if (class168.field3006.field3224 == null) {
                arg0.field1939 = 0;
            } else {
                arg0.field1788 = 150;
                arg0.field1781 = (int) (Math.sin((double) class56.field926 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1851 = 5;
                arg0.field1939 = ((int) class168.field3006.field3224.method697(-23666) << 11) + 2047;
                arg0.field1928 = class168.field3006.field1282;
                arg0.field1911 = class168.field3006.field1299;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method798(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class112.field2022++;
        class54.field881 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class58.field981; var12 < class13.field128; var12++) {
            class216[][] var38 = class128.field2236[var12];
            for (int var39 = class171.field3040; var39 < class138.field2441; var39++) {
                for (int var40 = class273.field4830; var40 < class149.field2624; var40++) {
                    class216 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class196.field3414[var39 + class24.field366 - class62.field1031][var40 + class24.field366 - class135.field2355] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3760 = true;
                            var41.field3764 = true;
                            if (var41.field3748 > 0) {
                                var41.field3741 = true;
                            } else {
                                var41.field3741 = false;
                            }
                            class54.field881++;
                        } else {
                            var41.field3760 = false;
                            var41.field3764 = false;
                            var41.field3765 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3762 != null) {
                                    class167 var42 = var41.field3762;
                                    var42.field2988.method320(0, var12, var42.field2981, var42.field2985, var42.field2978);
                                    if (var42.field2989 != null) {
                                        var42.field2989.method320(0, var12, var42.field2981, var42.field2985, var42.field2978);
                                    }
                                }
                                if (var41.field3758 != null) {
                                    class62 var43 = var41.field3758;
                                    var43.field1032.method320(var43.field1038, var12, var43.field1035, var43.field1039, var43.field1028);
                                    if (var43.field1029 != null) {
                                        var43.field1029.method320(var43.field1038, var12, var43.field1035, var43.field1039, var43.field1028);
                                    }
                                }
                                if (var41.field3757 != null) {
                                    class278 var44 = var41.field3757;
                                    var44.field4891.method320(0, var12, var44.field4878, var44.field4884, var44.field4882);
                                }
                                if (var41.field3743 != null) {
                                    for (int var45 = 0; var45 < var41.field3748; var45++) {
                                        class77 var46 = var41.field3743[var45];
                                        var46.field1367.method320(var46.field1373, var12, var46.field1359, var46.field1363, var46.field1369);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class64.field1079 == class189.field3337;
        for (int var14 = class58.field981; var14 < class13.field128; var14++) {
            class216[][] var27 = class128.field2236[var14];
            for (int var28 = -class24.field366; var28 <= 0; var28++) {
                int var29 = class62.field1031 + var28;
                int var30 = class62.field1031 - var28;
                if (var29 >= class171.field3040 || var30 < class138.field2441) {
                    for (int var31 = -class24.field366; var31 <= 0; var31++) {
                        int var32 = class135.field2355 + var31;
                        int var33 = class135.field2355 - var31;
                        if (var29 >= class171.field3040) {
                            if (var32 >= class273.field4830) {
                                class216 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3760) {
                                    class59.method402(var34, true);
                                }
                            }
                            if (var33 < class149.field2624) {
                                class216 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3760) {
                                    class59.method402(var35, true);
                                }
                            }
                        }
                        if (var30 < class138.field2441) {
                            if (var32 >= class273.field4830) {
                                class216 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3760) {
                                    class59.method402(var36, true);
                                }
                            }
                            if (var33 < class149.field2624) {
                                class216 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3760) {
                                    class59.method402(var37, true);
                                }
                            }
                        }
                        if (class54.field881 == 0) {
                            if (!var13) {
                                class281.field4917 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class58.field981; var15 < class13.field128; var15++) {
            class216[][] var16 = class128.field2236[var15];
            for (int var17 = -class24.field366; var17 <= 0; var17++) {
                int var18 = class62.field1031 + var17;
                int var19 = class62.field1031 - var17;
                if (var18 >= class171.field3040 || var19 < class138.field2441) {
                    for (int var20 = -class24.field366; var20 <= 0; var20++) {
                        int var21 = class135.field2355 + var20;
                        int var22 = class135.field2355 - var20;
                        if (var18 >= class171.field3040) {
                            if (var21 >= class273.field4830) {
                                class216 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3760) {
                                    class59.method402(var23, false);
                                }
                            }
                            if (var22 < class149.field2624) {
                                class216 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3760) {
                                    class59.method402(var24, false);
                                }
                            }
                        }
                        if (var19 < class138.field2441) {
                            if (var21 >= class273.field4830) {
                                class216 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3760) {
                                    class59.method402(var25, false);
                                }
                            }
                            if (var22 < class149.field2624) {
                                class216 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3760) {
                                    class59.method402(var26, false);
                                }
                            }
                        }
                        if (class54.field881 == 0) {
                            if (!var13) {
                                class281.field4917 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class281.field4917 = false;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public static final void method799(int arg0) {
        field2109++;
        for (int var1 = 0; var1 < class179.field3110; var1++) {
            int var10002 = class171.field3044[var1]--;
            if (class171.field3044[var1] >= -10) {
                class113 var4 = class118.field2083[var1];
                if (var4 == null) {
                    var4 = class113.method772(class271.field4788, class267.field4711[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class171.field3044[var1] += var4.method771();
                    class118.field2083[var1] = var4;
                }
                if (class171.field3044[var1] < 0) {
                    int var5;
                    if (class227.field3926[var1] == 0) {
                        var5 = class262.field4636;
                    } else {
                        int var6 = (class227.field3926[var1] & 0xFF) * 128;
                        int var7 = class227.field3926[var1] >> 8 & 0xFF;
                        int var8 = (class227.field3926[var1] & 0xFFAEF4) >> 16;
                        int var9 = var7 * 128 - (class168.field3006.field1301 - 64);
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 * 128 + 64 - class168.field3006.field1325;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        int var11 = var10 + var9 - 128;
                        if (var6 < var11) {
                            class171.field3044[var1] = -100;
                            continue;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        var5 = (var6 - var11) * class92.field1550 / var6;
                    }
                    if (var5 > 0) {
                        class72 var12 = var4.method773().method503(class51.field844);
                        class286 var13 = class286.method1929(var12, 100, var5);
                        var13.method1896(class166.field2960[var1] - 1);
                        class165.field2899.method1080(var13);
                    }
                    class171.field3044[var1] = -100;
                }
            } else {
                class179.field3110--;
                for (int var3 = var1; var3 < class179.field3110; var3++) {
                    class267.field4711[var3] = class267.field4711[var3 + 1];
                    class118.field2083[var3] = class118.field2083[var3 + 1];
                    class166.field2960[var3] = class166.field2960[var3 + 1];
                    class171.field3044[var3] = class171.field3044[var3 + 1];
                    class227.field3926[var3] = class227.field3926[var3 + 1];
                }
                var1--;
            }
        }
        int var2 = -6 % ((-arg0 - 17) / 40);
        if (class127.field2222 && !class118.method795((byte) 124)) {
            if (class160.field2839 != 0 && class62.field1037 != -1) {
                class240.method1562(class62.field1037, class227.field3923, 0, class160.field2839, 1, false);
            }
            class127.field2222 = false;
        } else if (class160.field2839 != 0 && class62.field1037 != -1 && !class118.method795((byte) 124)) {
            class131.field2277.method966((byte) 49, 167);
            class254.field4383++;
            class131.field2277.method1701(class62.field1037, 4994);
            class62.field1037 = -1;
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public static void method800(int arg0) {
        field2112 = null;
        field2106 = null;
        field2104 = null;
        field2103 = null;
        field2107 = null;
        field2111 = null;
        if (arg0 > -85) {
            field2102 = 39;
        }
    }
}
