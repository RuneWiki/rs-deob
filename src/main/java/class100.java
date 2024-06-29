import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class100 {

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Leb;")
    private static class230 field1854 = class68.method589(0, " has logged out)3");

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Leb;")
    public static class230 field1855 = field1854;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[[B")
    public static byte[][] field1849;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILhj;IJIIII)Z")
    public static final boolean method848(int arg0, int arg1, int arg2, int arg3, class70 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class150.method1134(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
    public static final void method849(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1844++;
        if (class203.field3580 == 1) {
            class218.field3763[class33.field600 / 100].method106(class27.field505 - 8, class76.field1380 + -8);
        }
        if (class203.field3580 == 2) {
            class218.field3763[class33.field600 / 100 + 4].method106(class27.field505 - 8, class76.field1380 + -8);
        }
        class84.method677((byte) -24);
        if (arg4 != 23237) {
            field1855 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lkk;Lkk;I)V")
    public static final void method850(class223 arg0, class223 arg1, int arg2) {
        class30.field548 = arg1;
        field1848++;
        class138.field2468 = arg0;
        class163.field2898 = class30.field548.method1533((byte) 112, arg2);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Z")
    public static final boolean method851(int arg0, int arg1) {
        if (arg1 != 100) {
            field1855 = null;
        }
        field1846++;
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BILfk;)V")
    private final void method852(byte arg0, int arg1, class14 arg2) {
        field1851++;
        if (arg0 < 11) {
            method851(10, 48);
        }
        if (arg1 == 1) {
            this.field1853 = arg2.method161(4);
            this.field1850 = arg2.method200(255);
            this.field1856 = arg2.method200(255);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILkk;Lkk;)V")
    public static final void method853(int arg0, class223 arg1, class223 arg2) {
        class56.field1036 = arg2;
        class128.field2257 = arg1;
        int var3 = 103 / ((-arg0 - 70) / 53);
        field1847++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLfk;)V")
    public final void method854(byte arg0, class14 arg1) {
        while (true) {
            int var3 = arg1.method200(255);
            if (var3 == 0) {
                field1845++;
                if (arg0 >= -50) {
                    method856(-112);
                    return;
                }
                return;
            }
            this.method852((byte) 55, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method855(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class168.field2968++;
        class268.field4760 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class200.field3559; var12 < class225.field3892; var12++) {
            class233[][] var38 = class53.field916[var12];
            for (int var39 = class237.field4093; var39 < class266.field4722; var39++) {
                for (int var40 = class167.field2951; var40 < class68.field1273; var40++) {
                    class233 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class13.field255[var39 + class108.field1945 - class158.field2821][var40 + class108.field1945 - class145.field2611] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field4068 = true;
                            var41.field4059 = true;
                            if (var41.field4058 > 0) {
                                var41.field4067 = true;
                            } else {
                                var41.field4067 = false;
                            }
                            class268.field4760++;
                        } else {
                            var41.field4068 = false;
                            var41.field4059 = false;
                            var41.field4055 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field4056 != null) {
                                    class108 var42 = var41.field4056;
                                    var42.field1951.method602(var42.field1949, var42.field1949, (byte) -116, var42.field1939, var42.field1939);
                                    if (var42.field1950 != null) {
                                        var42.field1950.method602(var42.field1949, var42.field1949, (byte) -96, var42.field1939, var42.field1939);
                                    }
                                }
                                if (var41.field4065 != null) {
                                    class265 var43 = var41.field4065;
                                    var43.field4718.method602(var43.field4714, var43.field4714, (byte) -90, var43.field4704, var43.field4704);
                                    if (var43.field4719 != null) {
                                        var43.field4719.method602(var43.field4714, var43.field4714, (byte) 69, var43.field4704, var43.field4704);
                                    }
                                }
                                if (var41.field4052 != null) {
                                    class56 var44 = var41.field4052;
                                    var44.field1026.method602(var44.field1024, var44.field1024, (byte) -91, var44.field1029, var44.field1029);
                                }
                                if (var41.field4050 != null) {
                                    for (int var45 = 0; var45 < var41.field4058; var45++) {
                                        class111 var46 = var41.field4050[var45];
                                        var46.field1993.method602(var46.field1994, var46.field2002, (byte) -119, var46.field1989, var46.field1988);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class168.field2976 == class106.field1912;
        for (int var14 = class200.field3559; var14 < class225.field3892; var14++) {
            class233[][] var27 = class53.field916[var14];
            for (int var28 = -class108.field1945; var28 <= 0; var28++) {
                int var29 = class158.field2821 + var28;
                int var30 = class158.field2821 - var28;
                if (var29 >= class237.field4093 || var30 < class266.field4722) {
                    for (int var31 = -class108.field1945; var31 <= 0; var31++) {
                        int var32 = class145.field2611 + var31;
                        int var33 = class145.field2611 - var31;
                        if (var29 >= class237.field4093) {
                            if (var32 >= class167.field2951) {
                                class233 var34 = var27[var29][var32];
                                if (var34 != null && var34.field4068) {
                                    class263.method1825(var34, true);
                                }
                            }
                            if (var33 < class68.field1273) {
                                class233 var35 = var27[var29][var33];
                                if (var35 != null && var35.field4068) {
                                    class263.method1825(var35, true);
                                }
                            }
                        }
                        if (var30 < class266.field4722) {
                            if (var32 >= class167.field2951) {
                                class233 var36 = var27[var30][var32];
                                if (var36 != null && var36.field4068) {
                                    class263.method1825(var36, true);
                                }
                            }
                            if (var33 < class68.field1273) {
                                class233 var37 = var27[var30][var33];
                                if (var37 != null && var37.field4068) {
                                    class263.method1825(var37, true);
                                }
                            }
                        }
                        if (class268.field4760 == 0) {
                            if (!var13) {
                                class267.field4748 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class200.field3559; var15 < class225.field3892; var15++) {
            class233[][] var16 = class53.field916[var15];
            for (int var17 = -class108.field1945; var17 <= 0; var17++) {
                int var18 = class158.field2821 + var17;
                int var19 = class158.field2821 - var17;
                if (var18 >= class237.field4093 || var19 < class266.field4722) {
                    for (int var20 = -class108.field1945; var20 <= 0; var20++) {
                        int var21 = class145.field2611 + var20;
                        int var22 = class145.field2611 - var20;
                        if (var18 >= class237.field4093) {
                            if (var21 >= class167.field2951) {
                                class233 var23 = var16[var18][var21];
                                if (var23 != null && var23.field4068) {
                                    class263.method1825(var23, false);
                                }
                            }
                            if (var22 < class68.field1273) {
                                class233 var24 = var16[var18][var22];
                                if (var24 != null && var24.field4068) {
                                    class263.method1825(var24, false);
                                }
                            }
                        }
                        if (var19 < class266.field4722) {
                            if (var21 >= class167.field2951) {
                                class233 var25 = var16[var19][var21];
                                if (var25 != null && var25.field4068) {
                                    class263.method1825(var25, false);
                                }
                            }
                            if (var22 < class68.field1273) {
                                class233 var26 = var16[var19][var22];
                                if (var26 != null && var26.field4068) {
                                    class263.method1825(var26, false);
                                }
                            }
                        }
                        if (class268.field4760 == 0) {
                            if (!var13) {
                                class267.field4748 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class267.field4748 = false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method856(int arg0) {
        field1854 = null;
        field1855 = null;
        if (arg0 <= -52) {
            field1849 = null;
        }
    }
}
