import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class243 {

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Ldd;")
    public static class132 field4416 = new class132();

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lqk;")
    public static class207 field4420 = class24.method212(255, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lqk;")
    public static class207 field4422 = null;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lpk;")
    public static class99 field4418;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Lpk;")
    public static class99 field4419;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
    public static int[] field4417;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
    public static int[] field4421;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static void method1712(byte arg0) {
        field4420 = null;
        field4417 = null;
        field4419 = null;
        if (arg0 == -100) {
            field4418 = null;
            field4421 = null;
            field4422 = null;
            field4416 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
    public static final int method1713(int arg0, int arg1) {
        field4415++;
        if (arg0 < 0) {
            return 0;
        }
        class40 var2 = (class40) class177.field3194.method1867((long) arg0, true);
        if (var2 == null) {
            return class174.method1248(5, arg0).field258;
        }
        int var3 = 0;
        for (int var4 = arg1; var4 < var2.field810.length; var4++) {
            if (var2.field810[var4] == -1) {
                var3++;
            }
        }
        return var3 + class174.method1248(5, arg0).field258 - var2.field810.length;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1714(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class147.field2528++;
        class246.field4467 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class261.field4650; var12 < class100.field1801; var12++) {
            class174[][] var38 = class82.field1498[var12];
            for (int var39 = class279.field4892; var39 < class164.field2898; var39++) {
                for (int var40 = class141.field2442; var40 < class204.field3591; var40++) {
                    class174 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class217.field3853[var39 + class93.field1643 - class157.field2787][var40 + class93.field1643 - class73.field1348] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3134 = true;
                            var41.field3153 = true;
                            if (var41.field3138 > 0) {
                                var41.field3144 = true;
                            } else {
                                var41.field3144 = false;
                            }
                            class246.field4467++;
                        } else {
                            var41.field3134 = false;
                            var41.field3153 = false;
                            var41.field3137 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3136 != null) {
                                    class209 var42 = var41.field3136;
                                    var42.field3704.method81(0, var12, var42.field3703, var42.field3709, var42.field3698);
                                    if (var42.field3712 != null) {
                                        var42.field3712.method81(0, var12, var42.field3703, var42.field3709, var42.field3698);
                                    }
                                }
                                if (var41.field3142 != null) {
                                    class28 var43 = var41.field3142;
                                    var43.field564.method81(var43.field575, var12, var43.field567, var43.field562, var43.field566);
                                    if (var43.field577 != null) {
                                        var43.field577.method81(var43.field575, var12, var43.field567, var43.field562, var43.field566);
                                    }
                                }
                                if (var41.field3152 != null) {
                                    class246 var44 = var41.field3152;
                                    var44.field4465.method81(0, var12, var44.field4454, var44.field4459, var44.field4456);
                                }
                                if (var41.field3140 != null) {
                                    for (int var45 = 0; var45 < var41.field3138; var45++) {
                                        class288 var46 = var41.field3140[var45];
                                        var46.field5136.method81(var46.field5135, var12, var46.field5151, var46.field5132, var46.field5153);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class252.field4536 == class163.field2881;
        for (int var14 = class261.field4650; var14 < class100.field1801; var14++) {
            class174[][] var27 = class82.field1498[var14];
            for (int var28 = -class93.field1643; var28 <= 0; var28++) {
                int var29 = class157.field2787 + var28;
                int var30 = class157.field2787 - var28;
                if (var29 >= class279.field4892 || var30 < class164.field2898) {
                    for (int var31 = -class93.field1643; var31 <= 0; var31++) {
                        int var32 = class73.field1348 + var31;
                        int var33 = class73.field1348 - var31;
                        if (var29 >= class279.field4892) {
                            if (var32 >= class141.field2442) {
                                class174 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3134) {
                                    class230.method1649(var34, true);
                                }
                            }
                            if (var33 < class204.field3591) {
                                class174 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3134) {
                                    class230.method1649(var35, true);
                                }
                            }
                        }
                        if (var30 < class164.field2898) {
                            if (var32 >= class141.field2442) {
                                class174 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3134) {
                                    class230.method1649(var36, true);
                                }
                            }
                            if (var33 < class204.field3591) {
                                class174 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3134) {
                                    class230.method1649(var37, true);
                                }
                            }
                        }
                        if (class246.field4467 == 0) {
                            if (!var13) {
                                class15.field243 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class261.field4650; var15 < class100.field1801; var15++) {
            class174[][] var16 = class82.field1498[var15];
            for (int var17 = -class93.field1643; var17 <= 0; var17++) {
                int var18 = class157.field2787 + var17;
                int var19 = class157.field2787 - var17;
                if (var18 >= class279.field4892 || var19 < class164.field2898) {
                    for (int var20 = -class93.field1643; var20 <= 0; var20++) {
                        int var21 = class73.field1348 + var20;
                        int var22 = class73.field1348 - var20;
                        if (var18 >= class279.field4892) {
                            if (var21 >= class141.field2442) {
                                class174 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3134) {
                                    class230.method1649(var23, false);
                                }
                            }
                            if (var22 < class204.field3591) {
                                class174 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3134) {
                                    class230.method1649(var24, false);
                                }
                            }
                        }
                        if (var19 < class164.field2898) {
                            if (var21 >= class141.field2442) {
                                class174 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3134) {
                                    class230.method1649(var25, false);
                                }
                            }
                            if (var22 < class204.field3591) {
                                class174 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3134) {
                                    class230.method1649(var26, false);
                                }
                            }
                        }
                        if (class246.field4467 == 0) {
                            if (!var13) {
                                class15.field243 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class15.field243 = false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[II[ILka;)V")
    public static final void method1715(int[] arg0, int[] arg1, int arg2, int[] arg3, class256 arg4) {
        for (int var5 = arg2; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && arg4.field5065.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field5065[var9] = null;
                    } else {
                        class65 var10 = class16.method101((byte) -81, var6);
                        int var11 = var10.field1171;
                        class195 var12 = arg4.field5065[var9];
                        if (var12 != null) {
                            if (var12.field3424 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field5065[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3433 = 0;
                                    var12.field3426 = 0;
                                    var12.field3429 = 1;
                                    var12.field3421 = 0;
                                    var12.field3427 = var8;
                                    class69.method497(arg4.field5104, false, 0, -74, arg4.field5072, var10);
                                } else if (var11 == 2) {
                                    var12.field3426 = 0;
                                }
                            } else if (var10.field1169 >= class16.method101((byte) 83, var12.field3424).field1169) {
                                var12 = arg4.field5065[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class195 var13 = arg4.field5065[var9] = new class195();
                            var13.field3426 = 0;
                            var13.field3427 = var8;
                            var13.field3429 = 1;
                            var13.field3424 = var6;
                            var13.field3433 = 0;
                            var13.field3421 = 0;
                            class69.method497(arg4.field5104, false, 0, -67, arg4.field5072, var10);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field4414++;
    }
}
