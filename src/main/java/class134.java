import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class134 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    public static int[] field2098 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lfd;")
    public static class130 field2100 = new class130(16);

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static volatile int field2109 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "J")
    public long field2102;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lq;")
    public class134 field2104;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lq;")
    public class134 field2108;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lfa;")
    public static class273 field2107;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z")
    public final boolean method898(int arg0) {
        int var2 = -82 % ((20 - arg0) / 43);
        field2099++;
        return this.field2108 != null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjm;)V")
    public static final void method899(int arg0, class113 arg1) {
        class36.field470 = arg1;
        if (arg0 != 0) {
            field2100 = null;
        }
        field2103++;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public final void method900(int arg0) {
        field2105++;
        if (this.field2108 == null) {
            return;
        }
        this.field2108.field2104 = this.field2104;
        this.field2104.field2108 = this.field2108;
        this.field2108 = null;
        this.field2104 = null;
        if (arg0 <= 17) {
            method901(-124, 3, 112, (byte[][][]) null, 48, (byte) 71, -35, 88);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method901(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class92.field1399++;
        class282.field4666 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class1.field3; var12 < class277.field4590; var12++) {
            class154[][] var38 = class27.field346[var12];
            for (int var39 = class152.field2376; var39 < class287.field4788; var39++) {
                for (int var40 = class151.field2348; var40 < class79.field1249; var40++) {
                    class154 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class2.field12[var39 + class35.field448 - class111.field1690][var40 + class35.field448 - class100.field1512] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2412 = true;
                            var41.field2421 = true;
                            if (var41.field2431 > 0) {
                                var41.field2420 = true;
                            } else {
                                var41.field2420 = false;
                            }
                            class282.field4666++;
                        } else {
                            var41.field2412 = false;
                            var41.field2421 = false;
                            var41.field2425 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2411 != null) {
                                    class169 var42 = var41.field2411;
                                    var42.field2639.method209(0, var12, var42.field2641, var42.field2645, var42.field2642);
                                    if (var42.field2634 != null) {
                                        var42.field2634.method209(0, var12, var42.field2641, var42.field2645, var42.field2642);
                                    }
                                }
                                if (var41.field2414 != null) {
                                    class98 var43 = var41.field2414;
                                    var43.field1480.method209(var43.field1464, var12, var43.field1468, var43.field1475, var43.field1472);
                                    if (var43.field1479 != null) {
                                        var43.field1479.method209(var43.field1464, var12, var43.field1468, var43.field1475, var43.field1472);
                                    }
                                }
                                if (var41.field2419 != null) {
                                    class286 var44 = var41.field2419;
                                    var44.field4769.method209(0, var12, var44.field4764, var44.field4771, var44.field4774);
                                }
                                if (var41.field2418 != null) {
                                    for (int var45 = 0; var45 < var41.field2431; var45++) {
                                        class114 var46 = var41.field2418[var45];
                                        var46.field1726.method209(var46.field1720, var12, var46.field1723, var46.field1713, var46.field1721);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class304.field4965 == class242.field3842;
        for (int var14 = class1.field3; var14 < class277.field4590; var14++) {
            class154[][] var27 = class27.field346[var14];
            for (int var28 = -class35.field448; var28 <= 0; var28++) {
                int var29 = class111.field1690 + var28;
                int var30 = class111.field1690 - var28;
                if (var29 >= class152.field2376 || var30 < class287.field4788) {
                    for (int var31 = -class35.field448; var31 <= 0; var31++) {
                        int var32 = class100.field1512 + var31;
                        int var33 = class100.field1512 - var31;
                        if (var29 >= class152.field2376) {
                            if (var32 >= class151.field2348) {
                                class154 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2412) {
                                    class271.method1862(var34, true);
                                }
                            }
                            if (var33 < class79.field1249) {
                                class154 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2412) {
                                    class271.method1862(var35, true);
                                }
                            }
                        }
                        if (var30 < class287.field4788) {
                            if (var32 >= class151.field2348) {
                                class154 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2412) {
                                    class271.method1862(var36, true);
                                }
                            }
                            if (var33 < class79.field1249) {
                                class154 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2412) {
                                    class271.method1862(var37, true);
                                }
                            }
                        }
                        if (class282.field4666 == 0) {
                            if (!var13) {
                                class34.field418 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class1.field3; var15 < class277.field4590; var15++) {
            class154[][] var16 = class27.field346[var15];
            for (int var17 = -class35.field448; var17 <= 0; var17++) {
                int var18 = class111.field1690 + var17;
                int var19 = class111.field1690 - var17;
                if (var18 >= class152.field2376 || var19 < class287.field4788) {
                    for (int var20 = -class35.field448; var20 <= 0; var20++) {
                        int var21 = class100.field1512 + var20;
                        int var22 = class100.field1512 - var20;
                        if (var18 >= class152.field2376) {
                            if (var21 >= class151.field2348) {
                                class154 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2412) {
                                    class271.method1862(var23, false);
                                }
                            }
                            if (var22 < class79.field1249) {
                                class154 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2412) {
                                    class271.method1862(var24, false);
                                }
                            }
                        }
                        if (var19 < class287.field4788) {
                            if (var21 >= class151.field2348) {
                                class154 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2412) {
                                    class271.method1862(var25, false);
                                }
                            }
                            if (var22 < class79.field1249) {
                                class154 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2412) {
                                    class271.method1862(var26, false);
                                }
                            }
                        }
                        if (class282.field4666 == 0) {
                            if (!var13) {
                                class34.field418 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class34.field418 = false;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public static final void method902(int arg0) {
        class266.field4373++;
        class276.field4572.method1391(0, 60);
        field2101++;
        int var1 = 99 / ((arg0 + 3) / 40);
        class276.field4572.method1412(class45.field613, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static void method903(boolean arg0) {
        if (arg0) {
            method904(7, -70, 2, 8, -63, (class293) null, (byte) 52);
        }
        field2100 = null;
        field2107 = null;
        field2098 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIILrk;B)Lrk;")
    public static final class293 method904(int arg0, int arg1, int arg2, int arg3, int arg4, class293 arg5, byte arg6) {
        long var7 = (long) arg1;
        field2106++;
        class293 var9 = (class293) class109.field1668.method149((byte) -95, var7);
        if (var9 == null) {
            class228 var10 = class228.method1590(class120.field1846, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1594(64, 768, -50, -10, -50);
            class109.field1668.method152(var9, var7, true);
        }
        int var11 = arg5.method1319();
        if (arg6 != -102) {
            method899(-117, (class113) null);
        }
        int var12 = arg5.method1322();
        int var13 = arg5.method1297();
        int var14 = arg5.method1309();
        class293 var15 = var9.method1295(true, true, true);
        if (arg2 != 0) {
            var15.method1327(arg2);
        }
        class191 var16 = (class191) var15;
        if (class12.method66(arg0 + var11, class165.field2600, arg4 + var13, 0) != arg3 || arg3 != class12.method66(arg0 + var12, class165.field2600, arg4 + var14, 0)) {
            for (int var17 = 0; var17 < var16.field2945; var17++) {
                var16.field2965[var17] += class12.method66(var16.field2944[var17] + arg0, class165.field2600, var16.field2973[var17] + arg4, 0) - arg3;
            }
            var16.field2971 = false;
        }
        return var15;
    }
}
