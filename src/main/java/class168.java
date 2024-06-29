import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class168 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[I")
    public static int[] field2960 = new int[256];

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lcf;")
    public static class93 field2961 = class147.method1066("::shiftclick", -48);

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Z")
    public static boolean field2959 = false;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
    public static int[] field2963 = new int[500];

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2955 = 0;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Z")
    public static boolean field2956 = false;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Lcf;")
    public static class93 field2965 = class147.method1066("(U (X", -48);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lg;")
    public static class276 field2954 = new class276(64);

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Lcf;")
    public static class93 field2966 = class147.method1066("(U4", -48);

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lcd;")
    public static class27 field2958;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILhg;I)[Ldh;")
    public static final class120[] method1211(int arg0, int arg1, class177 arg2, int arg3) {
        field2964++;
        if (arg0 < 126) {
            return null;
        } else if (class149.method1074(arg1, arg2, 16597, arg3)) {
            return class134.method980(-64);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)I")
    public static final int method1212(int arg0, byte arg1) {
        if (arg1 < 55) {
            field2965 = null;
        }
        field2957++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1213(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class150.field2639++;
        class137.field2396 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class54.field889; var12 < class170.field3002; var12++) {
            class41[][] var38 = class232.field4138[var12];
            for (int var39 = class246.field4427; var39 < class273.field4862; var39++) {
                for (int var40 = class37.field560; var40 < class5.field65; var40++) {
                    class41 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class15.field200[var39 + class11.field153 - class206.field3703][var40 + class11.field153 - class133.field2335] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field635 = true;
                            var41.field649 = true;
                            if (var41.field645 > 0) {
                                var41.field650 = true;
                            } else {
                                var41.field650 = false;
                            }
                            class137.field2396++;
                        } else {
                            var41.field635 = false;
                            var41.field649 = false;
                            var41.field653 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field643 != null) {
                                    class70 var42 = var41.field643;
                                    var42.field1269.method95(0, var12, var42.field1272, var42.field1271, var42.field1270);
                                    if (var42.field1274 != null) {
                                        var42.field1274.method95(0, var12, var42.field1272, var42.field1271, var42.field1270);
                                    }
                                }
                                if (var41.field641 != null) {
                                    class24 var43 = var41.field641;
                                    var43.field295.method95(var43.field299, var12, var43.field307, var43.field293, var43.field304);
                                    if (var43.field301 != null) {
                                        var43.field301.method95(var43.field299, var12, var43.field307, var43.field293, var43.field304);
                                    }
                                }
                                if (var41.field652 != null) {
                                    class30 var44 = var41.field652;
                                    var44.field459.method95(0, var12, var44.field449, var44.field447, var44.field442);
                                }
                                if (var41.field637 != null) {
                                    for (int var45 = 0; var45 < var41.field645; var45++) {
                                        class229 var46 = var41.field637[var45];
                                        var46.field4104.method95(var46.field4096, var12, var46.field4107, var46.field4109, var46.field4102);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class270.field4815 == class233.field4151;
        for (int var14 = class54.field889; var14 < class170.field3002; var14++) {
            class41[][] var27 = class232.field4138[var14];
            for (int var28 = -class11.field153; var28 <= 0; var28++) {
                int var29 = class206.field3703 + var28;
                int var30 = class206.field3703 - var28;
                if (var29 >= class246.field4427 || var30 < class273.field4862) {
                    for (int var31 = -class11.field153; var31 <= 0; var31++) {
                        int var32 = class133.field2335 + var31;
                        int var33 = class133.field2335 - var31;
                        if (var29 >= class246.field4427) {
                            if (var32 >= class37.field560) {
                                class41 var34 = var27[var29][var32];
                                if (var34 != null && var34.field635) {
                                    class136.method994(var34, true);
                                }
                            }
                            if (var33 < class5.field65) {
                                class41 var35 = var27[var29][var33];
                                if (var35 != null && var35.field635) {
                                    class136.method994(var35, true);
                                }
                            }
                        }
                        if (var30 < class273.field4862) {
                            if (var32 >= class37.field560) {
                                class41 var36 = var27[var30][var32];
                                if (var36 != null && var36.field635) {
                                    class136.method994(var36, true);
                                }
                            }
                            if (var33 < class5.field65) {
                                class41 var37 = var27[var30][var33];
                                if (var37 != null && var37.field635) {
                                    class136.method994(var37, true);
                                }
                            }
                        }
                        if (class137.field2396 == 0) {
                            if (!var13) {
                                class198.field3599 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class54.field889; var15 < class170.field3002; var15++) {
            class41[][] var16 = class232.field4138[var15];
            for (int var17 = -class11.field153; var17 <= 0; var17++) {
                int var18 = class206.field3703 + var17;
                int var19 = class206.field3703 - var17;
                if (var18 >= class246.field4427 || var19 < class273.field4862) {
                    for (int var20 = -class11.field153; var20 <= 0; var20++) {
                        int var21 = class133.field2335 + var20;
                        int var22 = class133.field2335 - var20;
                        if (var18 >= class246.field4427) {
                            if (var21 >= class37.field560) {
                                class41 var23 = var16[var18][var21];
                                if (var23 != null && var23.field635) {
                                    class136.method994(var23, false);
                                }
                            }
                            if (var22 < class5.field65) {
                                class41 var24 = var16[var18][var22];
                                if (var24 != null && var24.field635) {
                                    class136.method994(var24, false);
                                }
                            }
                        }
                        if (var19 < class273.field4862) {
                            if (var21 >= class37.field560) {
                                class41 var25 = var16[var19][var21];
                                if (var25 != null && var25.field635) {
                                    class136.method994(var25, false);
                                }
                            }
                            if (var22 < class5.field65) {
                                class41 var26 = var16[var19][var22];
                                if (var26 != null && var26.field635) {
                                    class136.method994(var26, false);
                                }
                            }
                        }
                        if (class137.field2396 == 0) {
                            if (!var13) {
                                class198.field3599 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class198.field3599 = false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1214(int arg0) {
        field2966 = null;
        if (arg0 < 42) {
            return;
        }
        field2965 = null;
        field2958 = null;
        field2960 = null;
        field2954 = null;
        field2961 = null;
        field2963 = null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)I")
    public static final int method1215(int arg0, byte arg1) {
        if (arg1 >= -58) {
            field2958 = null;
        }
        field2962++;
        return arg0 & 0x7F;
    }
}
