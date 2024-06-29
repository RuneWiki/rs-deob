import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class75 {

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public int field1266 = 16777215;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public int field1271 = 8;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Z")
    public boolean field1268;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[Laa;")
    public static class172[] field1264;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILag;I)V")
    public static final void method594(int arg0, int arg1, class188 arg2, int arg3) {
        field1262++;
        if (class292.field4606 != null || class64.field1025 || arg2 == null || class186.method1255((byte) 109, arg2) == null) {
            return;
        }
        class292.field4606 = arg2;
        class53.field822 = class186.method1255((byte) 122, arg2);
        class205.field3192 = arg0;
        class34.field548 = false;
        class184.field2781 = arg1;
        class210.field3255 = arg3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Laa;)V")
    public static final void method595(class172 arg0) {
        for (int var1 = arg0.field2558; var1 <= arg0.field2565; var1++) {
            for (int var2 = arg0.field2560; var2 <= arg0.field2563; var2++) {
                class23 var3 = class255.field3907[arg0.field2553][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field360; var4++) {
                        if (var3.field358[var4] == arg0) {
                            var3.field360--;
                            for (int var5 = var4; var5 < var3.field360; var5++) {
                                var3.field358[var5] = var3.field358[var5 + 1];
                                var3.field346[var5] = var3.field346[var5 + 1];
                            }
                            var3.field358[var3.field360] = null;
                            break;
                        }
                    }
                    var3.field340 = 0;
                    for (int var6 = 0; var6 < var3.field360; var6++) {
                        var3.field340 |= var3.field346[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method596(int arg0) {
        field1264 = null;
        if (arg0 != 3) {
            method597(21, (class37) null);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILf;)Lsl;")
    public static final class18 method597(int arg0, class37 arg1) {
        field1267++;
        class18 var2 = new class18();
        var2.field288 = arg1.method293(126);
        if (arg0 != 0) {
            method596(-31);
        }
        var2.field286 = class266.method1810((byte) 121, var2.field288);
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method598(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class90.field1449++;
        class44.field704 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class142.field2186; var12 < class179.field2680; var12++) {
            class23[][] var38 = class255.field3907[var12];
            for (int var39 = class19.field297; var39 < class41.field670; var39++) {
                for (int var40 = class202.field3161; var40 < class47.field780; var40++) {
                    class23 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class256.field3918[var39 + class227.field3557 - class117.field1818][var40 + class227.field3557 - class195.field3076] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field349 = true;
                            var41.field362 = true;
                            if (var41.field360 > 0) {
                                var41.field351 = true;
                            } else {
                                var41.field351 = false;
                            }
                            class44.field704++;
                        } else {
                            var41.field349 = false;
                            var41.field362 = false;
                            var41.field355 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field344 != null) {
                                    class228 var42 = var41.field344;
                                    var42.field3565.method227(0, var12, var42.field3563, var42.field3561, var42.field3574);
                                    if (var42.field3570 != null) {
                                        var42.field3570.method227(0, var12, var42.field3563, var42.field3561, var42.field3574);
                                    }
                                }
                                if (var41.field356 != null) {
                                    class247 var43 = var41.field356;
                                    var43.field3814.method227(var43.field3815, var12, var43.field3823, var43.field3821, var43.field3811);
                                    if (var43.field3816 != null) {
                                        var43.field3816.method227(var43.field3815, var12, var43.field3823, var43.field3821, var43.field3811);
                                    }
                                }
                                if (var41.field363 != null) {
                                    class180 var44 = var41.field363;
                                    var44.field2689.method227(0, var12, var44.field2687, var44.field2692, var44.field2688);
                                }
                                if (var41.field358 != null) {
                                    for (int var45 = 0; var45 < var41.field360; var45++) {
                                        class172 var46 = var41.field358[var45];
                                        var46.field2566.method227(var46.field2552, var12, var46.field2559, var46.field2568, var46.field2570);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class68.field1079 == class118.field1825;
        for (int var14 = class142.field2186; var14 < class179.field2680; var14++) {
            class23[][] var27 = class255.field3907[var14];
            for (int var28 = -class227.field3557; var28 <= 0; var28++) {
                int var29 = class117.field1818 + var28;
                int var30 = class117.field1818 - var28;
                if (var29 >= class19.field297 || var30 < class41.field670) {
                    for (int var31 = -class227.field3557; var31 <= 0; var31++) {
                        int var32 = class195.field3076 + var31;
                        int var33 = class195.field3076 - var31;
                        if (var29 >= class19.field297) {
                            if (var32 >= class202.field3161) {
                                class23 var34 = var27[var29][var32];
                                if (var34 != null && var34.field349) {
                                    class259.method1715(var34, true);
                                }
                            }
                            if (var33 < class47.field780) {
                                class23 var35 = var27[var29][var33];
                                if (var35 != null && var35.field349) {
                                    class259.method1715(var35, true);
                                }
                            }
                        }
                        if (var30 < class41.field670) {
                            if (var32 >= class202.field3161) {
                                class23 var36 = var27[var30][var32];
                                if (var36 != null && var36.field349) {
                                    class259.method1715(var36, true);
                                }
                            }
                            if (var33 < class47.field780) {
                                class23 var37 = var27[var30][var33];
                                if (var37 != null && var37.field349) {
                                    class259.method1715(var37, true);
                                }
                            }
                        }
                        if (class44.field704 == 0) {
                            if (!var13) {
                                class222.field3479 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class142.field2186; var15 < class179.field2680; var15++) {
            class23[][] var16 = class255.field3907[var15];
            for (int var17 = -class227.field3557; var17 <= 0; var17++) {
                int var18 = class117.field1818 + var17;
                int var19 = class117.field1818 - var17;
                if (var18 >= class19.field297 || var19 < class41.field670) {
                    for (int var20 = -class227.field3557; var20 <= 0; var20++) {
                        int var21 = class195.field3076 + var20;
                        int var22 = class195.field3076 - var20;
                        if (var18 >= class19.field297) {
                            if (var21 >= class202.field3161) {
                                class23 var23 = var16[var18][var21];
                                if (var23 != null && var23.field349) {
                                    class259.method1715(var23, false);
                                }
                            }
                            if (var22 < class47.field780) {
                                class23 var24 = var16[var18][var22];
                                if (var24 != null && var24.field349) {
                                    class259.method1715(var24, false);
                                }
                            }
                        }
                        if (var19 < class41.field670) {
                            if (var21 >= class202.field3161) {
                                class23 var25 = var16[var19][var21];
                                if (var25 != null && var25.field349) {
                                    class259.method1715(var25, false);
                                }
                            }
                            if (var22 < class47.field780) {
                                class23 var26 = var16[var19][var22];
                                if (var26 != null && var26.field349) {
                                    class259.method1715(var26, false);
                                }
                            }
                        }
                        if (class44.field704 == 0) {
                            if (!var13) {
                                class222.field3479 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class222.field3479 = false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILf;B)V")
    public final void method599(int arg0, class37 arg1, byte arg2) {
        if (arg2 != -128) {
            return;
        }
        field1270++;
        while (true) {
            int var4 = arg1.method333((byte) -59);
            if (var4 == 0) {
                return;
            }
            this.method600(arg0, arg1, var4, 6);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILf;II)V")
    private final void method600(int arg0, class37 arg1, int arg2, int arg3) {
        field1260++;
        if (arg3 != 6) {
            method596(121);
        }
        if (arg2 == 1) {
            this.field1271 = arg1.method293(-16);
        } else if (arg2 == 2) {
            this.field1268 = true;
        } else if (arg2 == 3) {
            this.field1269 = arg1.method306(67);
            this.field1259 = arg1.method306(114);
            this.field1263 = arg1.method306(62);
        } else if (arg2 == 4) {
            this.field1261 = arg1.method333((byte) -59);
        } else if (arg2 == 5) {
            this.field1258 = arg1.method293(89);
        } else if (arg2 == 6) {
            this.field1266 = arg1.method336(23362);
            return;
        }
    }
}
