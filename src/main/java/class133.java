import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class133 extends class202 {

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public int field2360 = 0;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "Lsb;")
    public static class98 field2358 = class47.method368("p12_full", 0);

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field2359 = 0;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "Z")
    public static boolean field2357;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILlj;)V")
    public final void method1001(int arg0, class216 arg1) {
        field2362++;
        while (true) {
            int var3 = arg1.method1446(5350);
            if (var3 == 0) {
                if (arg0 <= 92) {
                    field2357 = true;
                    return;
                } else {
                    return;
                }
            }
            this.method1005(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static final void method1002(int arg0) {
        field2361++;
        if (arg0 != 0) {
            field2357 = false;
        }
        if (class33.field573 != null && class132.field2351 != null) {
            return;
        }
        class132.field2351 = new int[256];
        class33.field573 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class33.field573[var1] = (int) (Math.sin(var2) * 4096.0D);
            class132.field2351[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method1003(int arg0) {
        field2358 = null;
        if (arg0 != -257) {
            field2357 = true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1004(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class1.field11++;
        class81.field1435 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class224.field3867; var12 < class228.field3920; var12++) {
            class71[][] var38 = class31.field553[var12];
            for (int var39 = class223.field3851; var39 < class200.field3436; var39++) {
                for (int var40 = class162.field2935; var40 < class238.field4097; var40++) {
                    class71 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class171.field3020[var39 + class171.field3012 - class101.field1786][var40 + class171.field3012 - class82.field1455] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1150 = true;
                            var41.field1154 = true;
                            if (var41.field1149 > 0) {
                                var41.field1146 = true;
                            } else {
                                var41.field1146 = false;
                            }
                            class81.field1435++;
                        } else {
                            var41.field1150 = false;
                            var41.field1154 = false;
                            var41.field1137 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1141 != null) {
                                    class225 var42 = var41.field1141;
                                    var42.field3880.method888(var42.field3877, var42.field3873, var42.field3877, var42.field3873, -1);
                                    if (var42.field3878 != null) {
                                        var42.field3878.method888(var42.field3877, var42.field3873, var42.field3877, var42.field3873, -1);
                                    }
                                }
                                if (var41.field1157 != null) {
                                    class207 var43 = var41.field1157;
                                    var43.field3533.method888(var43.field3542, var43.field3540, var43.field3542, var43.field3540, -1);
                                    if (var43.field3539 != null) {
                                        var43.field3539.method888(var43.field3542, var43.field3540, var43.field3542, var43.field3540, -1);
                                    }
                                }
                                if (var41.field1132 != null) {
                                    class53 var44 = var41.field1132;
                                    var44.field851.method888(var44.field850, var44.field848, var44.field850, var44.field848, -1);
                                }
                                if (var41.field1140 != null) {
                                    for (int var45 = 0; var45 < var41.field1149; var45++) {
                                        class14 var46 = var41.field1140[var45];
                                        var46.field273.method888(var46.field277, var46.field255, var46.field256, var46.field268, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class87.field1547 == class78.field1393;
        for (int var14 = class224.field3867; var14 < class228.field3920; var14++) {
            class71[][] var27 = class31.field553[var14];
            for (int var28 = -class171.field3012; var28 <= 0; var28++) {
                int var29 = class101.field1786 + var28;
                int var30 = class101.field1786 - var28;
                if (var29 >= class223.field3851 || var30 < class200.field3436) {
                    for (int var31 = -class171.field3012; var31 <= 0; var31++) {
                        int var32 = class82.field1455 + var31;
                        int var33 = class82.field1455 - var31;
                        if (var29 >= class223.field3851) {
                            if (var32 >= class162.field2935) {
                                class71 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1150) {
                                    class145.method1071(var34, true);
                                }
                            }
                            if (var33 < class238.field4097) {
                                class71 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1150) {
                                    class145.method1071(var35, true);
                                }
                            }
                        }
                        if (var30 < class200.field3436) {
                            if (var32 >= class162.field2935) {
                                class71 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1150) {
                                    class145.method1071(var36, true);
                                }
                            }
                            if (var33 < class238.field4097) {
                                class71 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1150) {
                                    class145.method1071(var37, true);
                                }
                            }
                        }
                        if (class81.field1435 == 0) {
                            if (!var13) {
                                class235.field4053 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class224.field3867; var15 < class228.field3920; var15++) {
            class71[][] var16 = class31.field553[var15];
            for (int var17 = -class171.field3012; var17 <= 0; var17++) {
                int var18 = class101.field1786 + var17;
                int var19 = class101.field1786 - var17;
                if (var18 >= class223.field3851 || var19 < class200.field3436) {
                    for (int var20 = -class171.field3012; var20 <= 0; var20++) {
                        int var21 = class82.field1455 + var20;
                        int var22 = class82.field1455 - var20;
                        if (var18 >= class223.field3851) {
                            if (var21 >= class162.field2935) {
                                class71 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1150) {
                                    class145.method1071(var23, false);
                                }
                            }
                            if (var22 < class238.field4097) {
                                class71 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1150) {
                                    class145.method1071(var24, false);
                                }
                            }
                        }
                        if (var19 < class200.field3436) {
                            if (var21 >= class162.field2935) {
                                class71 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1150) {
                                    class145.method1071(var25, false);
                                }
                            }
                            if (var22 < class238.field4097) {
                                class71 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1150) {
                                    class145.method1071(var26, false);
                                }
                            }
                        }
                        if (class81.field1435 == 0) {
                            if (!var13) {
                                class235.field4053 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class235.field4053 = false;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLlj;)V")
    private final void method1005(int arg0, boolean arg1, class216 arg2) {
        if (arg0 == 2) {
            this.field2360 = arg2.method1487(21);
        }
        if (arg1) {
            method1003(-122);
        }
        field2363++;
    }
}
