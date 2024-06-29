import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class185 {

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    private int field3263 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lhe;")
    private class19 field3250;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lp;")
    public static class280 field3254 = class18.method140((byte) -117, "null");

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "J")
    public static long field3262 = 0L;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field3261 = 0;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lp;")
    private static class280 field3255 = class18.method140((byte) -124, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lp;")
    public static class280 field3266 = class18.method140((byte) -124, "null");

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lp;")
    public static class280 field3256 = field3255;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lp;")
    public static class280 field3258 = class18.method140((byte) -121, "event_opbase");

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lua;")
    public static class113 field3251;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lil;")
    private class161 field3264;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Z")
    public static boolean field3267;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[Lti;")
    public static class5[] field3257;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Lud;")
    public static final class2 method1286(int arg0) {
        class201.field3515 = 0;
        field3260++;
        if (arg0 != -13661) {
            method1289(false);
        }
        return class214.method1435((byte) 35);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lil;")
    public final class161 method1287(int arg0) {
        this.field3263 = 0;
        if (arg0 == 22580) {
            field3253++;
            return this.method1290(-1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1288(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class183.field3221++;
        class105.field1751 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class257.field4543; var12 < class78.field1281; var12++) {
            class162[][] var38 = class220.field3787[var12];
            for (int var39 = class46.field771; var39 < class45.field748; var39++) {
                for (int var40 = class271.field4744; var40 < class98.field1574; var40++) {
                    class162 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class55.field905[var39 + class18.field324 - class15.field284][var40 + class18.field324 - class277.field4811] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2853 = true;
                            var41.field2855 = true;
                            if (var41.field2841 > 0) {
                                var41.field2835 = true;
                            } else {
                                var41.field2835 = false;
                            }
                            class105.field1751++;
                        } else {
                            var41.field2853 = false;
                            var41.field2855 = false;
                            var41.field2854 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2849 != null) {
                                    class163 var42 = var41.field2849;
                                    var42.field2870.method429(0, var12, var42.field2866, var42.field2868, var42.field2864);
                                    if (var42.field2865 != null) {
                                        var42.field2865.method429(0, var12, var42.field2866, var42.field2868, var42.field2864);
                                    }
                                }
                                if (var41.field2852 != null) {
                                    class49 var43 = var41.field2852;
                                    var43.field800.method429(var43.field799, var12, var43.field813, var43.field796, var43.field803);
                                    if (var43.field798 != null) {
                                        var43.field798.method429(var43.field799, var12, var43.field813, var43.field796, var43.field803);
                                    }
                                }
                                if (var41.field2839 != null) {
                                    class245 var44 = var41.field2839;
                                    var44.field4301.method429(0, var12, var44.field4308, var44.field4306, var44.field4300);
                                }
                                if (var41.field2845 != null) {
                                    for (int var45 = 0; var45 < var41.field2841; var45++) {
                                        class160 var46 = var41.field2845[var45];
                                        var46.field2811.method429(var46.field2803, var12, var46.field2807, var46.field2809, var46.field2793);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class265.field4670 == class145.field2529;
        for (int var14 = class257.field4543; var14 < class78.field1281; var14++) {
            class162[][] var27 = class220.field3787[var14];
            for (int var28 = -class18.field324; var28 <= 0; var28++) {
                int var29 = class15.field284 + var28;
                int var30 = class15.field284 - var28;
                if (var29 >= class46.field771 || var30 < class45.field748) {
                    for (int var31 = -class18.field324; var31 <= 0; var31++) {
                        int var32 = class277.field4811 + var31;
                        int var33 = class277.field4811 - var31;
                        if (var29 >= class46.field771) {
                            if (var32 >= class271.field4744) {
                                class162 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2853) {
                                    class235.method1579(var34, true);
                                }
                            }
                            if (var33 < class98.field1574) {
                                class162 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2853) {
                                    class235.method1579(var35, true);
                                }
                            }
                        }
                        if (var30 < class45.field748) {
                            if (var32 >= class271.field4744) {
                                class162 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2853) {
                                    class235.method1579(var36, true);
                                }
                            }
                            if (var33 < class98.field1574) {
                                class162 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2853) {
                                    class235.method1579(var37, true);
                                }
                            }
                        }
                        if (class105.field1751 == 0) {
                            if (!var13) {
                                class193.field3397 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class257.field4543; var15 < class78.field1281; var15++) {
            class162[][] var16 = class220.field3787[var15];
            for (int var17 = -class18.field324; var17 <= 0; var17++) {
                int var18 = class15.field284 + var17;
                int var19 = class15.field284 - var17;
                if (var18 >= class46.field771 || var19 < class45.field748) {
                    for (int var20 = -class18.field324; var20 <= 0; var20++) {
                        int var21 = class277.field4811 + var20;
                        int var22 = class277.field4811 - var20;
                        if (var18 >= class46.field771) {
                            if (var21 >= class271.field4744) {
                                class162 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2853) {
                                    class235.method1579(var23, false);
                                }
                            }
                            if (var22 < class98.field1574) {
                                class162 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2853) {
                                    class235.method1579(var24, false);
                                }
                            }
                        }
                        if (var19 < class45.field748) {
                            if (var21 >= class271.field4744) {
                                class162 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2853) {
                                    class235.method1579(var25, false);
                                }
                            }
                            if (var22 < class98.field1574) {
                                class162 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2853) {
                                    class235.method1579(var26, false);
                                }
                            }
                        }
                        if (class105.field1751 == 0) {
                            if (!var13) {
                                class193.field3397 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class193.field3397 = false;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static void method1289(boolean arg0) {
        field3254 = null;
        field3255 = null;
        field3251 = null;
        field3256 = null;
        field3258 = null;
        if (!arg0) {
            method1289(true);
        }
        field3266 = null;
        field3257 = null;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Lil;")
    public final class161 method1290(int arg0) {
        field3252++;
        if (this.field3263 > 0 && this.field3250.field359[this.field3263 - 1] != this.field3264) {
            class161 var2 = this.field3264;
            this.field3264 = var2.field2828;
            return var2;
        }
        while (this.field3250.field346 > this.field3263) {
            class161 var3 = this.field3250.field359[this.field3263++].field2828;
            if (this.field3250.field359[this.field3263 - 1] != var3) {
                this.field3264 = var3.field2828;
                return var3;
            }
        }
        if (arg0 != -1) {
            field3267 = true;
        }
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lhe;)V")
    public class185(class19 arg0) {
        this.field3250 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static final void method1291(int arg0) {
        if (arg0 != 2) {
            method1288(30, 117, -52, (byte[][][]) null, -74, (byte) 48, 44, -37);
        }
        field3265++;
        if ((class53.field866 > class49.field809)) {
            class49.field809 = (float) ((double) class49.field809 / 30.0D + (double) class49.field809);
            if (class49.field809 > class53.field866) {
                class49.field809 = class53.field866;
            }
            class133.method922(-1);
        } else if (class49.field809 > class53.field866) {
            class49.field809 = (float) ((double) class49.field809 - (double) class49.field809 / 30.0D);
            if (class49.field809 < class53.field866) {
                class49.field809 = class53.field866;
            }
            class133.method922(arg0 - 3);
        }
        if (class277.field4818 == -1 || class97.field1558 == -1) {
            return;
        }
        int var1 = class277.field4818 - class266.field4684;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class266.field4684 += var1;
        int var2 = class97.field1558 - class47.field780;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 == 0 && var2 == 0) {
            class277.field4818 = -1;
            class97.field1558 = -1;
        }
        class47.field780 += var2;
        class133.method922(-1);
    }
}
