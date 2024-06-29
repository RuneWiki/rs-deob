import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class117 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1673 = "slide:";

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1675 = null;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "[[[B")
    public static byte[][][] field1676;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method850(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class200.field3209++;
        class144.field2335 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class113.field1630; var12 < class80.field1158; var12++) {
            class286[][] var38 = class220.field3525[var12];
            for (int var39 = class181.field2916; var39 < class76.field1091; var39++) {
                for (int var40 = class288.field4574; var40 < class133.field2192; var40++) {
                    class286 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class290.field4603[var39 + class263.field4276 - class24.field278][var40 + class263.field4276 - class52.field768] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field4542 = true;
                            var41.field4516 = true;
                            if (var41.field4541 > 0) {
                                var41.field4533 = true;
                            } else {
                                var41.field4533 = false;
                            }
                            class144.field2335++;
                        } else {
                            var41.field4542 = false;
                            var41.field4516 = false;
                            var41.field4520 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field4526 != null) {
                                    class99 var42 = var41.field4526;
                                    var42.field1466.method4(0, var12, var42.field1457, var42.field1463, var42.field1459);
                                    if (var42.field1458 != null) {
                                        var42.field1458.method4(0, var12, var42.field1457, var42.field1463, var42.field1459);
                                    }
                                }
                                if (var41.field4532 != null) {
                                    class156 var43 = var41.field4532;
                                    var43.field2560.method4(var43.field2559, var12, var43.field2570, var43.field2558, var43.field2572);
                                    if (var43.field2569 != null) {
                                        var43.field2569.method4(var43.field2559, var12, var43.field2570, var43.field2558, var43.field2572);
                                    }
                                }
                                if (var41.field4518 != null) {
                                    class159 var44 = var41.field4518;
                                    var44.field2601.method4(0, var12, var44.field2603, var44.field2606, var44.field2595);
                                }
                                if (var41.field4530 != null) {
                                    for (int var45 = 0; var45 < var41.field4541; var45++) {
                                        class166 var46 = var41.field4530[var45];
                                        var46.field2681.method4(var46.field2693, var12, var46.field2695, var46.field2682, var46.field2687);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class241.field3841 == class220.field3533;
        for (int var14 = class113.field1630; var14 < class80.field1158; var14++) {
            class286[][] var27 = class220.field3525[var14];
            for (int var28 = -class263.field4276; var28 <= 0; var28++) {
                int var29 = class24.field278 + var28;
                int var30 = class24.field278 - var28;
                if (var29 >= class181.field2916 || var30 < class76.field1091) {
                    for (int var31 = -class263.field4276; var31 <= 0; var31++) {
                        int var32 = class52.field768 + var31;
                        int var33 = class52.field768 - var31;
                        if (var29 >= class181.field2916) {
                            if (var32 >= class288.field4574) {
                                class286 var34 = var27[var29][var32];
                                if (var34 != null && var34.field4542) {
                                    class291.method1970(var34, true);
                                }
                            }
                            if (var33 < class133.field2192) {
                                class286 var35 = var27[var29][var33];
                                if (var35 != null && var35.field4542) {
                                    class291.method1970(var35, true);
                                }
                            }
                        }
                        if (var30 < class76.field1091) {
                            if (var32 >= class288.field4574) {
                                class286 var36 = var27[var30][var32];
                                if (var36 != null && var36.field4542) {
                                    class291.method1970(var36, true);
                                }
                            }
                            if (var33 < class133.field2192) {
                                class286 var37 = var27[var30][var33];
                                if (var37 != null && var37.field4542) {
                                    class291.method1970(var37, true);
                                }
                            }
                        }
                        if (class144.field2335 == 0) {
                            if (!var13) {
                                class238.field3806 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class113.field1630; var15 < class80.field1158; var15++) {
            class286[][] var16 = class220.field3525[var15];
            for (int var17 = -class263.field4276; var17 <= 0; var17++) {
                int var18 = class24.field278 + var17;
                int var19 = class24.field278 - var17;
                if (var18 >= class181.field2916 || var19 < class76.field1091) {
                    for (int var20 = -class263.field4276; var20 <= 0; var20++) {
                        int var21 = class52.field768 + var20;
                        int var22 = class52.field768 - var20;
                        if (var18 >= class181.field2916) {
                            if (var21 >= class288.field4574) {
                                class286 var23 = var16[var18][var21];
                                if (var23 != null && var23.field4542) {
                                    class291.method1970(var23, false);
                                }
                            }
                            if (var22 < class133.field2192) {
                                class286 var24 = var16[var18][var22];
                                if (var24 != null && var24.field4542) {
                                    class291.method1970(var24, false);
                                }
                            }
                        }
                        if (var19 < class76.field1091) {
                            if (var21 >= class288.field4574) {
                                class286 var25 = var16[var19][var21];
                                if (var25 != null && var25.field4542) {
                                    class291.method1970(var25, false);
                                }
                            }
                            if (var22 < class133.field2192) {
                                class286 var26 = var16[var19][var22];
                                if (var26 != null && var26.field4542) {
                                    class291.method1970(var26, false);
                                }
                            }
                        }
                        if (class144.field2335 == 0) {
                            if (!var13) {
                                class238.field3806 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class238.field3806 = false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLni;)Lni;")
    public abstract class155 method1(boolean arg0, class155 arg1);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method851(byte arg0) {
        field1675 = null;
        field1676 = null;
        field1673 = null;
        if (arg0 != 90) {
            method850(-8, 54, -110, (byte[][][]) null, 126, (byte) 114, 6, 100);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lv;B)V")
    public static final void method852(class152 arg0, byte arg1) {
        field1674++;
        if (arg1 <= 78) {
            method850(-39, -66, -87, (byte[][][]) null, -82, (byte) -47, -114, 75);
        }
        for (int var2 = 0; var2 < class290.field4599; var2++) {
            int var3 = arg0.method1103(3);
            int var4 = arg0.method1126(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class10.field104[var3] != null) {
                class10.field104[var3].field2616 = var4;
            }
        }
    }
}
