import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class264 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "J")
    public long field4733 = 0L;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lcc;")
    public static class209 field4730 = class95.method669(112, "overlay2");

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4732 = 0;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lcc;")
    public static class209 field4745 = class95.method669(121, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field4744 = 0;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lcc;")
    private static class209 field4750 = class95.method669(111, "Loaded update list");

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Lcc;")
    public static class209 field4751 = field4750;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public int field4736;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public int field4741;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field4743;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public int field4746;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public int field4747;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lpb;")
    public class126 field4735;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[Lij;")
    public static class194[] field4737;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1808(int arg0) {
        field4751 = null;
        field4745 = null;
        field4730 = null;
        if (arg0 != 16) {
            method1810(-36, -62, -72, (byte[][][]) null, 69, (byte) -45, 55, 48);
        }
        field4750 = null;
        field4737 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZI)V")
    public static final void method1809(int arg0, boolean arg1, int arg2) {
        class197 var3 = class37.method277(arg0, 50);
        field4742++;
        int var4 = var3.field3532;
        int var5 = var3.field3526;
        int var6 = var3.field3527;
        int var7 = class197.field3535[var6 - var5];
        if (!arg1) {
            return;
        }
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class256.method1768(3, arg2 << var5 & var8 | ~var8 & class38.field647[var4], var4);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1810(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class261.field4695++;
        class52.field1028 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class290.field5107; var12 < class50.field983; var12++) {
            class109[][] var38 = class106.field2089[var12];
            for (int var39 = class21.field401; var39 < class102.field1954; var39++) {
                for (int var40 = class52.field1025; var40 < class206.field3675; var40++) {
                    class109 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class160.field2909[var39 + class11.field222 - class20.field390][var40 + class11.field222 - class126.field2442] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2206 = true;
                            var41.field2190 = true;
                            if (var41.field2203 > 0) {
                                var41.field2200 = true;
                            } else {
                                var41.field2200 = false;
                            }
                            class52.field1028++;
                        } else {
                            var41.field2206 = false;
                            var41.field2190 = false;
                            var41.field2204 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2213 != null) {
                                    class187 var42 = var41.field2213;
                                    var42.field3377.method214(0, var12, var42.field3372, var42.field3380, var42.field3378);
                                    if (var42.field3387 != null) {
                                        var42.field3387.method214(0, var12, var42.field3372, var42.field3380, var42.field3378);
                                    }
                                }
                                if (var41.field2218 != null) {
                                    class181 var43 = var41.field2218;
                                    var43.field3269.method214(var43.field3277, var12, var43.field3274, var43.field3266, var43.field3280);
                                    if (var43.field3265 != null) {
                                        var43.field3265.method214(var43.field3277, var12, var43.field3274, var43.field3266, var43.field3280);
                                    }
                                }
                                if (var41.field2198 != null) {
                                    class230 var44 = var41.field2198;
                                    var44.field4183.method214(0, var12, var44.field4179, var44.field4175, var44.field4180);
                                }
                                if (var41.field2189 != null) {
                                    for (int var45 = 0; var45 < var41.field2203; var45++) {
                                        class264 var46 = var41.field2189[var45];
                                        var46.field4735.method214(var46.field4736, var12, var46.field4743, var46.field4734, var46.field4740);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class284.field4996 == class271.field4803;
        for (int var14 = class290.field5107; var14 < class50.field983; var14++) {
            class109[][] var27 = class106.field2089[var14];
            for (int var28 = -class11.field222; var28 <= 0; var28++) {
                int var29 = class20.field390 + var28;
                int var30 = class20.field390 - var28;
                if (var29 >= class21.field401 || var30 < class102.field1954) {
                    for (int var31 = -class11.field222; var31 <= 0; var31++) {
                        int var32 = class126.field2442 + var31;
                        int var33 = class126.field2442 - var31;
                        if (var29 >= class21.field401) {
                            if (var32 >= class52.field1025) {
                                class109 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2206) {
                                    class234.method1627(var34, true);
                                }
                            }
                            if (var33 < class206.field3675) {
                                class109 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2206) {
                                    class234.method1627(var35, true);
                                }
                            }
                        }
                        if (var30 < class102.field1954) {
                            if (var32 >= class52.field1025) {
                                class109 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2206) {
                                    class234.method1627(var36, true);
                                }
                            }
                            if (var33 < class206.field3675) {
                                class109 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2206) {
                                    class234.method1627(var37, true);
                                }
                            }
                        }
                        if (class52.field1028 == 0) {
                            if (!var13) {
                                class224.field4080 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class290.field5107; var15 < class50.field983; var15++) {
            class109[][] var16 = class106.field2089[var15];
            for (int var17 = -class11.field222; var17 <= 0; var17++) {
                int var18 = class20.field390 + var17;
                int var19 = class20.field390 - var17;
                if (var18 >= class21.field401 || var19 < class102.field1954) {
                    for (int var20 = -class11.field222; var20 <= 0; var20++) {
                        int var21 = class126.field2442 + var20;
                        int var22 = class126.field2442 - var20;
                        if (var18 >= class21.field401) {
                            if (var21 >= class52.field1025) {
                                class109 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2206) {
                                    class234.method1627(var23, false);
                                }
                            }
                            if (var22 < class206.field3675) {
                                class109 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2206) {
                                    class234.method1627(var24, false);
                                }
                            }
                        }
                        if (var19 < class102.field1954) {
                            if (var21 >= class52.field1025) {
                                class109 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2206) {
                                    class234.method1627(var25, false);
                                }
                            }
                            if (var22 < class206.field3675) {
                                class109 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2206) {
                                    class234.method1627(var26, false);
                                }
                            }
                        }
                        if (class52.field1028 == 0) {
                            if (!var13) {
                                class224.field4080 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class224.field4080 = false;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)V")
    public static final void method1811(byte arg0, int arg1) {
        field4738++;
        class98.field1912--;
        if (class98.field1912 == arg1) {
            return;
        }
        class270.method1845(class219.field3993, arg1 + 1, class219.field3993, arg1, class98.field1912 - arg1);
        class270.method1845(class20.field391, arg1 + 1, class20.field391, arg1, class98.field1912 - arg1);
        if (arg0 != 118) {
            field4744 = 22;
        }
        class270.method1846(class40.field680, arg1 + 1, class40.field680, arg1, class98.field1912 - arg1);
        class270.method1842(class111.field2248, arg1 + 1, class111.field2248, arg1, class98.field1912 - arg1);
        class270.method1843(class106.field2096, arg1 + 1, class106.field2096, arg1, class98.field1912 - arg1);
        class270.method1843(class52.field1032, arg1 + 1, class52.field1032, arg1, class98.field1912 - arg1);
    }
}
