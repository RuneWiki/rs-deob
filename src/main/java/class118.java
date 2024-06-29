import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class118 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public int field1905 = 8;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public int field1910 = 16777215;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1904 = "yellow:";

    @OriginalMember(owner = "client!m", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1913 = new String[8];

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lvg;")
    public static class75 field1914 = new class75(5000);

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lhc;")
    public static class235 field1918;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Z")
    public boolean field1906;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIILai;)V")
    private final void method826(int arg0, int arg1, int arg2, class88 arg3) {
        field1908++;
        if (arg0 == 1) {
            this.field1905 = arg3.method645(arg2 + 11592);
        } else if (arg0 == 2) {
            this.field1906 = true;
        } else if (arg0 == 3) {
            this.field1912 = arg3.method649(-2);
            this.field1917 = arg3.method649(-2);
            this.field1911 = arg3.method649(-2);
        } else if (arg0 == 4) {
            this.field1909 = arg3.method633(126);
        } else if (arg0 == 5) {
            this.field1916 = arg3.method645(11596);
        } else if (arg0 == 6) {
            this.field1910 = arg3.method671(99);
        }
        if (arg2 != 4) {
            this.field1916 = -22;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method827(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class297.field4689++;
        class110.field1798 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class31.field460; var12 < class217.field3352; var12++) {
            class6[][] var38 = class269.field4298[var12];
            for (int var39 = class151.field2372; var39 < class55.field918; var39++) {
                for (int var40 = class163.field2560; var40 < class52.field781; var40++) {
                    class6 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class94.field1605[var39 + class79.field1320 - class99.field1669][var40 + class79.field1320 - class99.field1664] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field142 = true;
                            var41.field141 = true;
                            if (var41.field125 > 0) {
                                var41.field136 = true;
                            } else {
                                var41.field136 = false;
                            }
                            class110.field1798++;
                        } else {
                            var41.field142 = false;
                            var41.field141 = false;
                            var41.field140 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field147 != null) {
                                    class7 var42 = var41.field147;
                                    var42.field149.method82(0, var12, var42.field153, var42.field150, var42.field158);
                                    if (var42.field156 != null) {
                                        var42.field156.method82(0, var12, var42.field153, var42.field150, var42.field158);
                                    }
                                }
                                if (var41.field123 != null) {
                                    class206 var43 = var41.field123;
                                    var43.field3224.method82(var43.field3216, var12, var43.field3223, var43.field3213, var43.field3211);
                                    if (var43.field3222 != null) {
                                        var43.field3222.method82(var43.field3216, var12, var43.field3223, var43.field3213, var43.field3211);
                                    }
                                }
                                if (var41.field144 != null) {
                                    class140 var44 = var41.field144;
                                    var44.field2137.method82(0, var12, var44.field2136, var44.field2143, var44.field2138);
                                }
                                if (var41.field134 != null) {
                                    for (int var45 = 0; var45 < var41.field125; var45++) {
                                        class293 var46 = var41.field134[var45];
                                        var46.field4619.method82(var46.field4611, var12, var46.field4629, var46.field4609, var46.field4627);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class66.field1107 == class116.field1890;
        for (int var14 = class31.field460; var14 < class217.field3352; var14++) {
            class6[][] var27 = class269.field4298[var14];
            for (int var28 = -class79.field1320; var28 <= 0; var28++) {
                int var29 = class99.field1669 + var28;
                int var30 = class99.field1669 - var28;
                if (var29 >= class151.field2372 || var30 < class55.field918) {
                    for (int var31 = -class79.field1320; var31 <= 0; var31++) {
                        int var32 = class99.field1664 + var31;
                        int var33 = class99.field1664 - var31;
                        if (var29 >= class151.field2372) {
                            if (var32 >= class163.field2560) {
                                class6 var34 = var27[var29][var32];
                                if (var34 != null && var34.field142) {
                                    class128.method890(var34, true);
                                }
                            }
                            if (var33 < class52.field781) {
                                class6 var35 = var27[var29][var33];
                                if (var35 != null && var35.field142) {
                                    class128.method890(var35, true);
                                }
                            }
                        }
                        if (var30 < class55.field918) {
                            if (var32 >= class163.field2560) {
                                class6 var36 = var27[var30][var32];
                                if (var36 != null && var36.field142) {
                                    class128.method890(var36, true);
                                }
                            }
                            if (var33 < class52.field781) {
                                class6 var37 = var27[var30][var33];
                                if (var37 != null && var37.field142) {
                                    class128.method890(var37, true);
                                }
                            }
                        }
                        if (class110.field1798 == 0) {
                            if (!var13) {
                                class16.field248 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class31.field460; var15 < class217.field3352; var15++) {
            class6[][] var16 = class269.field4298[var15];
            for (int var17 = -class79.field1320; var17 <= 0; var17++) {
                int var18 = class99.field1669 + var17;
                int var19 = class99.field1669 - var17;
                if (var18 >= class151.field2372 || var19 < class55.field918) {
                    for (int var20 = -class79.field1320; var20 <= 0; var20++) {
                        int var21 = class99.field1664 + var20;
                        int var22 = class99.field1664 - var20;
                        if (var18 >= class151.field2372) {
                            if (var21 >= class163.field2560) {
                                class6 var23 = var16[var18][var21];
                                if (var23 != null && var23.field142) {
                                    class128.method890(var23, false);
                                }
                            }
                            if (var22 < class52.field781) {
                                class6 var24 = var16[var18][var22];
                                if (var24 != null && var24.field142) {
                                    class128.method890(var24, false);
                                }
                            }
                        }
                        if (var19 < class55.field918) {
                            if (var21 >= class163.field2560) {
                                class6 var25 = var16[var19][var21];
                                if (var25 != null && var25.field142) {
                                    class128.method890(var25, false);
                                }
                            }
                            if (var22 < class52.field781) {
                                class6 var26 = var16[var19][var22];
                                if (var26 != null && var26.field142) {
                                    class128.method890(var26, false);
                                }
                            }
                        }
                        if (class110.field1798 == 0) {
                            if (!var13) {
                                class16.field248 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class16.field248 = false;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILai;)V")
    public final void method828(int arg0, int arg1, class88 arg2) {
        while (true) {
            int var4 = arg2.method633(arg1 ^ 0x68);
            if (var4 == 0) {
                field1915++;
                if (arg1 != 3) {
                    this.field1917 = -71;
                    return;
                }
                return;
            }
            this.method826(var4, arg0, 4, arg2);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZIIZ)V")
    public static final void method829(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class241.field3920 = 0L;
        int var5 = class33.method262(0);
        field1919++;
        if (arg0 == 3 || var5 == 3) {
            arg4 = true;
        }
        boolean var6 = arg1;
        if (class32.field477.startsWith("mac") && arg0 > 0) {
            arg4 = true;
        }
        if (arg0 > 0 == var5 <= 0) {
            var6 = true;
        }
        if (arg4 && arg0 > 0) {
            var6 = true;
        }
        class280.method1883(arg0, var6, arg2, arg4, var5, -765, arg3);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method830(byte arg0) {
        field1904 = null;
        field1913 = null;
        if (arg0 != -57) {
            field1904 = null;
        }
        field1918 = null;
        field1914 = null;
    }
}
