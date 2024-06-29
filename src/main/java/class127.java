import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class127 extends class182 {

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "Ldd;")
    public class38 field2357;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "Z")
    public static boolean field2346 = false;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "Lkh;")
    private static class117 field2345 = class224.method1450((byte) -79, " is already on your friend list)3");

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "Lkh;")
    public static class117 field2352 = class224.method1450((byte) -5, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "[B")
    public static byte[] field2350 = new byte[520];

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "Lkh;")
    private static class117 field2354 = class224.method1450((byte) -12, "Please use a different world)3");

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Lkh;")
    public static class117 field2356 = class224.method1450((byte) 11, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "Lkh;")
    public static class117 field2353 = field2345;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field2351 = 0;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "Lkh;")
    public static class117 field2347 = field2354;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field2348 = 0;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "Lkh;")
    public static class117 field2359 = field2354;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "[J")
    public static long[] field2358 = new long[32];

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "Lme;")
    public static class136 field2355;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "[I")
    public static int[] field2344;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lkh;")
    public static final class117 method870(int arg0, int arg1) {
        if (arg0 != 0) {
            method871(true);
        }
        field2360++;
        return class56.field1160[arg1].method819((byte) -127) > 0 ? class36.method316((byte) -34, new class117[] { class25.field612[arg1], class68.field1300, class56.field1160[arg1] }) : class25.field612[arg1];
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V")
    public static void method871(boolean arg0) {
        field2347 = null;
        field2350 = null;
        field2359 = null;
        field2352 = null;
        field2358 = null;
        field2353 = null;
        if (!arg0) {
            return;
        }
        field2356 = null;
        field2344 = null;
        field2354 = null;
        field2345 = null;
        field2355 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IJ[IB)Lkh;")
    public static final class117 method872(int arg0, long arg1, int[] arg2, byte arg3) {
        if (arg3 != -110) {
            field2353 = null;
        }
        field2349++;
        if (class48.field1012 != null) {
            class117 var5 = class48.field1012.method1054(arg2, arg0, arg1, (byte) 110);
            if (var5 != null) {
                return var5;
            }
        }
        return arg0 == 5 ? class162.method1156(arg1, (byte) -98).method796((byte) -40) : class151.method1077((byte) -128, arg1);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method873(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class8.field146++;
        class6.field103 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class224.field4037; var12 < class60.field1208; var12++) {
            class170[][] var38 = class109.field2063[var12];
            for (int var39 = class75.field1414; var39 < class209.field3757; var39++) {
                for (int var40 = class158.field2880; var40 < class13.field411; var40++) {
                    class170 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (var41.field3076 <= class76.field1451 && class95.field1740[var39 + class41.field933 - class38.field870][var40 + class41.field933 - class225.field4065] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3068 = true;
                            var41.field3071 = true;
                            if (var41.field3065 > 0) {
                                var41.field3075 = true;
                            } else {
                                var41.field3075 = false;
                            }
                            class6.field103++;
                        } else {
                            var41.field3068 = false;
                            var41.field3071 = false;
                            var41.field3078 = 0;
                            if (var41.field3063 != null && var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                for (int var42 = 0; var42 < var41.field3065; var42++) {
                                    class57 var43 = var41.field3063[var42];
                                    var43.field1182.method337(((var43.field1179 - var43.field1170 >> 1) + var43.field1170) * 128 + 64, -96, ((var43.field1178 - var43.field1186 >> 1) + var43.field1186) * 128 + 64);
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class75.field1423 == class156.field2839;
        for (int var14 = class224.field4037; var14 < class60.field1208; var14++) {
            class170[][] var27 = class109.field2063[var14];
            for (int var28 = -class41.field933; var28 <= 0; var28++) {
                int var29 = class38.field870 + var28;
                int var30 = class38.field870 - var28;
                if (var29 >= class75.field1414 || var30 < class209.field3757) {
                    for (int var31 = -class41.field933; var31 <= 0; var31++) {
                        int var32 = class225.field4065 + var31;
                        int var33 = class225.field4065 - var31;
                        if (var29 >= class75.field1414) {
                            if (var32 >= class158.field2880) {
                                class170 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3068) {
                                    class74.method517(var34, true);
                                }
                            }
                            if (var33 < class13.field411) {
                                class170 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3068) {
                                    class74.method517(var35, true);
                                }
                            }
                        }
                        if (var30 < class209.field3757) {
                            if (var32 >= class158.field2880) {
                                class170 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3068) {
                                    class74.method517(var36, true);
                                }
                            }
                            if (var33 < class13.field411) {
                                class170 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3068) {
                                    class74.method517(var37, true);
                                }
                            }
                        }
                        if (class6.field103 == 0) {
                            if (!var13) {
                                class78.field1487 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class224.field4037; var15 < class60.field1208; var15++) {
            class170[][] var16 = class109.field2063[var15];
            for (int var17 = -class41.field933; var17 <= 0; var17++) {
                int var18 = class38.field870 + var17;
                int var19 = class38.field870 - var17;
                if (var18 >= class75.field1414 || var19 < class209.field3757) {
                    for (int var20 = -class41.field933; var20 <= 0; var20++) {
                        int var21 = class225.field4065 + var20;
                        int var22 = class225.field4065 - var20;
                        if (var18 >= class75.field1414) {
                            if (var21 >= class158.field2880) {
                                class170 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3068) {
                                    class74.method517(var23, false);
                                }
                            }
                            if (var22 < class13.field411) {
                                class170 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3068) {
                                    class74.method517(var24, false);
                                }
                            }
                        }
                        if (var19 < class209.field3757) {
                            if (var21 >= class158.field2880) {
                                class170 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3068) {
                                    class74.method517(var25, false);
                                }
                            }
                            if (var22 < class13.field411) {
                                class170 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3068) {
                                    class74.method517(var26, false);
                                }
                            }
                        }
                        if (class6.field103 == 0) {
                            if (!var13) {
                                class78.field1487 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class78.field1487 = false;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Ldd;)V")
    public class127(class38 arg0) {
        this.field2357 = arg0;
    }
}
