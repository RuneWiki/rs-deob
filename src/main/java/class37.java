import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class37 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Ljd;")
    public static class85 field572 = class221.method1499("k", (byte) -78);

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Ljd;")
    public static class85 field576 = class221.method1499("m-Ochte mit Ihnen handeln)3", (byte) 123);

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Ljd;")
    private static class85 field578 = class221.method1499("slide:", (byte) 109);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Ljd;")
    public static class85 field570 = field578;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Ljd;")
    public static class85 field573 = field578;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lge;")
    public static class68 field575;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[Z")
    public static boolean[] field577;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method246(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class134.field2343++;
        class88.field1644 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class95.field1747; var12 < class272.field4811; var12++) {
            class208[][] var38 = class99.field1780[var12];
            for (int var39 = class54.field952; var39 < class169.field2909; var39++) {
                for (int var40 = class114.field2048; var40 < class108.field1914; var40++) {
                    class208 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class210.field3683[var39 + class271.field4800 - class19.field275][var40 + class271.field4800 - class152.field2602] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3645 = true;
                            var41.field3649 = true;
                            if (var41.field3646 > 0) {
                                var41.field3643 = true;
                            } else {
                                var41.field3643 = false;
                            }
                            class88.field1644++;
                        } else {
                            var41.field3645 = false;
                            var41.field3649 = false;
                            var41.field3660 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3656 != null) {
                                    class233 var42 = var41.field3656;
                                    var42.field4040.method39(var42.field4034, false, var42.field4034, var42.field4039, var42.field4039);
                                    if (var42.field4025 != null) {
                                        var42.field4025.method39(var42.field4034, false, var42.field4034, var42.field4039, var42.field4039);
                                    }
                                }
                                if (var41.field3641 != null) {
                                    class267 var43 = var41.field3641;
                                    var43.field4759.method39(var43.field4746, false, var43.field4746, var43.field4752, var43.field4752);
                                    if (var43.field4753 != null) {
                                        var43.field4753.method39(var43.field4746, false, var43.field4746, var43.field4752, var43.field4752);
                                    }
                                }
                                if (var41.field3653 != null) {
                                    class93 var44 = var41.field3653;
                                    var44.field1700.method39(var44.field1704, false, var44.field1704, var44.field1701, var44.field1701);
                                }
                                if (var41.field3650 != null) {
                                    for (int var45 = 0; var45 < var41.field3646; var45++) {
                                        class213 var46 = var41.field3650[var45];
                                        var46.field3724.method39(var46.field3722, false, var46.field3729, var46.field3737, var46.field3731);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class245.field4193 == class135.field2348;
        for (int var14 = class95.field1747; var14 < class272.field4811; var14++) {
            class208[][] var27 = class99.field1780[var14];
            for (int var28 = -class271.field4800; var28 <= 0; var28++) {
                int var29 = class19.field275 + var28;
                int var30 = class19.field275 - var28;
                if (var29 >= class54.field952 || var30 < class169.field2909) {
                    for (int var31 = -class271.field4800; var31 <= 0; var31++) {
                        int var32 = class152.field2602 + var31;
                        int var33 = class152.field2602 - var31;
                        if (var29 >= class54.field952) {
                            if (var32 >= class114.field2048) {
                                class208 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3645) {
                                    class85.method596(var34, true);
                                }
                            }
                            if (var33 < class108.field1914) {
                                class208 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3645) {
                                    class85.method596(var35, true);
                                }
                            }
                        }
                        if (var30 < class169.field2909) {
                            if (var32 >= class114.field2048) {
                                class208 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3645) {
                                    class85.method596(var36, true);
                                }
                            }
                            if (var33 < class108.field1914) {
                                class208 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3645) {
                                    class85.method596(var37, true);
                                }
                            }
                        }
                        if (class88.field1644 == 0) {
                            if (!var13) {
                                class28.field436 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class95.field1747; var15 < class272.field4811; var15++) {
            class208[][] var16 = class99.field1780[var15];
            for (int var17 = -class271.field4800; var17 <= 0; var17++) {
                int var18 = class19.field275 + var17;
                int var19 = class19.field275 - var17;
                if (var18 >= class54.field952 || var19 < class169.field2909) {
                    for (int var20 = -class271.field4800; var20 <= 0; var20++) {
                        int var21 = class152.field2602 + var20;
                        int var22 = class152.field2602 - var20;
                        if (var18 >= class54.field952) {
                            if (var21 >= class114.field2048) {
                                class208 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3645) {
                                    class85.method596(var23, false);
                                }
                            }
                            if (var22 < class108.field1914) {
                                class208 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3645) {
                                    class85.method596(var24, false);
                                }
                            }
                        }
                        if (var19 < class169.field2909) {
                            if (var21 >= class114.field2048) {
                                class208 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3645) {
                                    class85.method596(var25, false);
                                }
                            }
                            if (var22 < class108.field1914) {
                                class208 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3645) {
                                    class85.method596(var26, false);
                                }
                            }
                        }
                        if (class88.field1644 == 0) {
                            if (!var13) {
                                class28.field436 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class28.field436 = false;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)V")
    public static final void method247(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class55.field971 == 1) {
            class216.field3799[class101.field1806 / 100].method56(class218.field3840 - 8, class168.field2900 - 8);
        }
        if (class55.field971 == 2) {
            class216.field3799[class101.field1806 / 100 + 4].method56(class218.field3840 - 8, class168.field2900 - 8);
        }
        class183.method1256(false);
        field574++;
        if (arg3 != 128) {
            method246(54, -128, -32, (byte[][][]) null, 95, (byte) -80, -4, -99);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Lla;")
    public static final class93 method248(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        return var3 == null || var3.field3653 == null ? null : var3.field3653;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method249(int arg0) {
        field570 = null;
        field575 = null;
        field572 = null;
        field576 = null;
        int var1 = 63 / ((arg0 - 87) / 39);
        field578 = null;
        field577 = null;
        field573 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class260 var7 = new class260();
        var7.field4586 = arg1 / 128;
        var7.field4608 = arg2 / 128;
        var7.field4594 = arg3 / 128;
        var7.field4607 = arg4 / 128;
        var7.field4592 = arg0;
        var7.field4605 = arg1;
        var7.field4604 = arg2;
        var7.field4606 = arg3;
        var7.field4601 = arg4;
        var7.field4584 = arg5;
        var7.field4585 = arg6;
        class203.field3534[class223.field3902++] = var7;
    }
}
