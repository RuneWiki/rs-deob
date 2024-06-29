import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class129 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1921 = -2;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1922 = "";

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1919 = 0;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[I")
    public static int[] field1926 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method955(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class244.field3891++;
        class166.field2514 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class189.field2961; var12 < class57.field900; var12++) {
            class22[][] var38 = class149.field2210[var12];
            for (int var39 = class180.field2820; var39 < class22.field369; var39++) {
                for (int var40 = class135.field2022; var40 < class56.field888; var40++) {
                    class22 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class35.field617[var39 + class232.field3669 - class239.field3781][var40 + class232.field3669 - class150.field2230] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field374 = true;
                            var41.field360 = true;
                            if (var41.field371 > 0) {
                                var41.field354 = true;
                            } else {
                                var41.field354 = false;
                            }
                            class166.field2514++;
                        } else {
                            var41.field374 = false;
                            var41.field360 = false;
                            var41.field366 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field375 != null) {
                                    class163 var42 = var41.field375;
                                    var42.field2456.method91(0, var12, var42.field2466, var42.field2462, var42.field2458);
                                    if (var42.field2459 != null) {
                                        var42.field2459.method91(0, var12, var42.field2466, var42.field2462, var42.field2458);
                                    }
                                }
                                if (var41.field364 != null) {
                                    class56 var43 = var41.field364;
                                    var43.field886.method91(var43.field884, var12, var43.field891, var43.field893, var43.field881);
                                    if (var43.field890 != null) {
                                        var43.field890.method91(var43.field884, var12, var43.field891, var43.field893, var43.field881);
                                    }
                                }
                                if (var41.field377 != null) {
                                    class106 var44 = var41.field377;
                                    var44.field1664.method91(0, var12, var44.field1660, var44.field1656, var44.field1657);
                                }
                                if (var41.field355 != null) {
                                    for (int var45 = 0; var45 < var41.field371; var45++) {
                                        class19 var46 = var41.field355[var45];
                                        var46.field266.method91(var46.field257, var12, var46.field253, var46.field256, var46.field264);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class233.field3684 == class166.field2507;
        for (int var14 = class189.field2961; var14 < class57.field900; var14++) {
            class22[][] var27 = class149.field2210[var14];
            for (int var28 = -class232.field3669; var28 <= 0; var28++) {
                int var29 = class239.field3781 + var28;
                int var30 = class239.field3781 - var28;
                if (var29 >= class180.field2820 || var30 < class22.field369) {
                    for (int var31 = -class232.field3669; var31 <= 0; var31++) {
                        int var32 = class150.field2230 + var31;
                        int var33 = class150.field2230 - var31;
                        if (var29 >= class180.field2820) {
                            if (var32 >= class135.field2022) {
                                class22 var34 = var27[var29][var32];
                                if (var34 != null && var34.field374) {
                                    class259.method1742(var34, true);
                                }
                            }
                            if (var33 < class56.field888) {
                                class22 var35 = var27[var29][var33];
                                if (var35 != null && var35.field374) {
                                    class259.method1742(var35, true);
                                }
                            }
                        }
                        if (var30 < class22.field369) {
                            if (var32 >= class135.field2022) {
                                class22 var36 = var27[var30][var32];
                                if (var36 != null && var36.field374) {
                                    class259.method1742(var36, true);
                                }
                            }
                            if (var33 < class56.field888) {
                                class22 var37 = var27[var30][var33];
                                if (var37 != null && var37.field374) {
                                    class259.method1742(var37, true);
                                }
                            }
                        }
                        if (class166.field2514 == 0) {
                            if (!var13) {
                                class118.field1789 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class189.field2961; var15 < class57.field900; var15++) {
            class22[][] var16 = class149.field2210[var15];
            for (int var17 = -class232.field3669; var17 <= 0; var17++) {
                int var18 = class239.field3781 + var17;
                int var19 = class239.field3781 - var17;
                if (var18 >= class180.field2820 || var19 < class22.field369) {
                    for (int var20 = -class232.field3669; var20 <= 0; var20++) {
                        int var21 = class150.field2230 + var20;
                        int var22 = class150.field2230 - var20;
                        if (var18 >= class180.field2820) {
                            if (var21 >= class135.field2022) {
                                class22 var23 = var16[var18][var21];
                                if (var23 != null && var23.field374) {
                                    class259.method1742(var23, false);
                                }
                            }
                            if (var22 < class56.field888) {
                                class22 var24 = var16[var18][var22];
                                if (var24 != null && var24.field374) {
                                    class259.method1742(var24, false);
                                }
                            }
                        }
                        if (var19 < class22.field369) {
                            if (var21 >= class135.field2022) {
                                class22 var25 = var16[var19][var21];
                                if (var25 != null && var25.field374) {
                                    class259.method1742(var25, false);
                                }
                            }
                            if (var22 < class56.field888) {
                                class22 var26 = var16[var19][var22];
                                if (var26 != null && var26.field374) {
                                    class259.method1742(var26, false);
                                }
                            }
                        }
                        if (class166.field2514 == 0) {
                            if (!var13) {
                                class118.field1789 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class118.field1789 = false;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != -2105451988) {
            method957(-2);
        }
        if (arg1 == arg4 && arg0 == arg8 && arg2 == arg9 && arg3 == arg7) {
            class18.method133(arg2, arg6, -75, arg3, arg8, arg4);
        } else {
            int var10 = arg4;
            int var11 = arg4 * 3;
            int var12 = arg8;
            int var13 = arg8 * 3;
            int var14 = arg0 * 3;
            int var15 = arg9 * 3;
            int var16 = arg1 * 3;
            int var17 = arg2 + var16 - arg4 - var15;
            int var18 = arg7 * 3;
            int var19 = var13 + var18 - var14 - var14;
            int var20 = var11 + var15 - var16 - var16;
            int var21 = arg3 + var14 - var18 - arg8;
            int var22 = var16 - var11;
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var21 * var26;
                int var29 = var20 * var25;
                int var30 = var22 * var24;
                int var31 = var19 * var25;
                int var32 = var23 * var24;
                int var33 = arg4 + (var27 + var29 + var30 >> 12);
                int var34 = arg8 + (var28 + var32 + var31 >> 12);
                class18.method133(var33, arg6, -98, var34, var12, var10);
                var10 = var33;
                var12 = var34;
            }
        }
        field1923++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method957(int arg0) {
        if (arg0 != 128) {
            field1922 = null;
        }
        field1922 = null;
        field1926 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
    public static final void method958(int arg0, boolean arg1) {
        class122.field1835 = arg1;
        class291.field4518 = !class110.method819(false);
        field1924++;
        if (arg0 != 0) {
            method957(-124);
        }
    }
}
