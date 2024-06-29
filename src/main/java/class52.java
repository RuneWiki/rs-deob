import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class52 extends class101 {

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "S")
    public short field949 = -32768;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "[Lqh;")
    public static class158[] field948 = new class158[32768];

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "Ltg;")
    public static class184 field951 = class135.method812("Okay", 3);

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "Ltg;")
    public static class184 field946 = class135.method812("Benutzeroberfl-=che geladen)3", 3);

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "Ltg;")
    private static class184 field956 = class135.method812("and choose the (Wcreate account(W", 3);

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field954 = 1;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "Ltg;")
    public static class184 field957 = field956;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method285(int arg0) {
        field951 = null;
        field948 = null;
        field946 = null;
        field956 = null;
        field957 = null;
        if (arg0 != -6789) {
            method287(-61, 53, -41, 79, -128, 76, -67);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)J")
    public static final long method286(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        return var3 == null || var3.field1690 == null ? 0L : var3.field1690.field1652;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if (arg6 != 18492) {
            return -36;
        }
        if ((arg2 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg1;
            arg1 = var8;
        }
        field953++;
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg5;
        } else {
            return 1 + 7 - arg1 - arg4;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III[Lrh;IIIZI)V")
    public static final void method288(int arg0, int arg1, int arg2, class167[] arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field947++;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            class167 var10 = arg3[var9];
            if (var10 != null && (!var10.field3106 || var10.field3061 == 0 || var10.field2999 || class188.method1191((byte) -105, var10) != 0 || class6.field115 == var10 || var10.field3101 == 1338) && var10.field3001 == arg8 && (!var10.field3106 || !class173.method1071(0, var10))) {
                int var11 = var10.field3117 + arg2;
                int var12 = var10.field3067 + arg6;
                if (class34.field591 == var10) {
                    class167.field3028 = var11;
                    class208.field3997 = true;
                    class182.field3505 = var12;
                }
                int var19;
                int var20;
                int var21;
                int var22;
                if (var10.field3061 == 2) {
                    var22 = arg1;
                    var21 = arg5;
                    var19 = arg0;
                    var20 = arg4;
                } else if (var10.field3061 == 9) {
                    int var13 = var11;
                    int var14 = var10.field3045 + var11;
                    int var15 = var12;
                    int var16 = var10.field3089 + var12;
                    if (var14 < var11) {
                        var13 = var14;
                        var14 = var11;
                    }
                    var14++;
                    if (var16 < var12) {
                        var15 = var16;
                        var16 = var12;
                    }
                    var19 = arg0 <= var14 ? arg0 : var14;
                    var16++;
                    var20 = arg4 < var15 ? var15 : arg4;
                    var21 = arg5 < var13 ? var13 : arg5;
                    var22 = var16 >= arg1 ? arg1 : var16;
                } else {
                    var21 = var11 <= arg5 ? arg5 : var11;
                    int var23 = var10.field3089 + var12;
                    int var24 = var10.field3045 + var11;
                    var20 = arg4 < var12 ? var12 : arg4;
                    var22 = arg1 > var23 ? var23 : arg1;
                    var19 = var24 < arg0 ? var24 : arg0;
                }
                if (!var10.field3106 || var21 < var19 && var20 < var22) {
                    if (var10.field3101 == 1337) {
                        class57.method305(-119, var10);
                    } else {
                        if (var10.field3061 == 0) {
                            if (!var10.field3106 && class173.method1071(0, var10) && class68.field1305 != var10) {
                                continue;
                            }
                            method288(var19, var22, var11 - var10.field3109, arg3, var20, var21, var12 - var10.field3073, true, var10.field3069);
                            if (var10.field3097 != null) {
                                method288(var19, var22, var11 - var10.field3109, var10.field3097, var20, var21, var12 - var10.field3073, arg7, var10.field3069);
                            }
                            class7 var25 = (class7) class134.field2436.method51((long) var10.field3069, -113);
                            if (var25 != null) {
                                class190.method1209(var22, 120, var25.field119, var20, var11, var21, var12, var19);
                            }
                        }
                        if (var10.field3106) {
                            boolean var26 = false;
                            boolean var27 = false;
                            boolean var28;
                            if (class39.field736 >= var21 && class195.field3793 >= var20 && var19 > class39.field736 && var22 > class195.field3793) {
                                var28 = true;
                            } else {
                                var28 = false;
                            }
                            if (class133.field2410 == 1 && class158.field2823 >= var21 && var20 <= class134.field2429 && var19 > class158.field2823 && var22 > class134.field2429) {
                                var27 = true;
                            }
                            if (class1.field12 == 1 && var28) {
                                var26 = true;
                            }
                            if (var10.field3101 == 1338) {
                                if (var27) {
                                    class44.method253(class134.field2429 - var12, 13557, class158.field2823 - var11, var10);
                                }
                                continue;
                            }
                            if (var27) {
                                class202.method1290(class158.field2823 - var11, false, class134.field2429 - var12, var10);
                            }
                            if (class34.field591 != null && class34.field591 != var10 && var28 && class196.method1242(class188.method1191((byte) -78, var10), 0)) {
                                class94.field1717 = var10;
                            }
                            if (class6.field115 == var10) {
                                class24.field438 = var11;
                                class145.field2620 = var12;
                                class18.field328 = true;
                            }
                            if (var10.field2999) {
                                if (var28 && class141.field2566 != 0 && var10.field3107 != null) {
                                    class5 var29 = new class5();
                                    var29.field101 = var10;
                                    var29.field79 = class141.field2566;
                                    var29.field96 = var10.field3107;
                                    class44.field842.method402(16777215, var29);
                                }
                                if (class34.field591 != null || class31.field535 != null || class170.field3244) {
                                    var27 = false;
                                    var28 = false;
                                    var26 = false;
                                }
                                if (!var10.field3031 && var27) {
                                    var10.field3031 = true;
                                    if (var10.field3053 != null) {
                                        class5 var30 = new class5();
                                        var30.field99 = class158.field2823 - var11;
                                        var30.field96 = var10.field3053;
                                        var30.field101 = var10;
                                        var30.field79 = class134.field2429 - var12;
                                        class44.field842.method402(16777215, var30);
                                    }
                                }
                                if (var10.field3031 && var26 && var10.field3027 != null) {
                                    class5 var31 = new class5();
                                    var31.field79 = class195.field3793 - var12;
                                    var31.field101 = var10;
                                    var31.field99 = class39.field736 - var11;
                                    var31.field96 = var10.field3027;
                                    class44.field842.method402(16777215, var31);
                                }
                                if (var10.field3031 && !var26) {
                                    var10.field3031 = false;
                                    if (var10.field3074 != null) {
                                        class5 var32 = new class5();
                                        var32.field101 = var10;
                                        var32.field96 = var10.field3074;
                                        var32.field99 = class39.field736 - var11;
                                        var32.field79 = class195.field3793 - var12;
                                        class18.field342.method402(16777215, var32);
                                    }
                                }
                                if (var26 && var10.field3083 != null) {
                                    class5 var33 = new class5();
                                    var33.field101 = var10;
                                    var33.field99 = class39.field736 - var11;
                                    var33.field79 = class195.field3793 - var12;
                                    var33.field96 = var10.field3083;
                                    class44.field842.method402(16777215, var33);
                                }
                                if (!var10.field3011 && var28) {
                                    var10.field3011 = true;
                                    if (var10.field3114 != null) {
                                        class5 var34 = new class5();
                                        var34.field99 = class39.field736 - var11;
                                        var34.field96 = var10.field3114;
                                        var34.field79 = class195.field3793 - var12;
                                        var34.field101 = var10;
                                        class44.field842.method402(16777215, var34);
                                    }
                                }
                                if (var10.field3011 && var28 && var10.field3047 != null) {
                                    class5 var35 = new class5();
                                    var35.field99 = class39.field736 - var11;
                                    var35.field79 = class195.field3793 - var12;
                                    var35.field101 = var10;
                                    var35.field96 = var10.field3047;
                                    class44.field842.method402(16777215, var35);
                                }
                                if (var10.field3011 && !var28) {
                                    var10.field3011 = false;
                                    if (var10.field3010 != null) {
                                        class5 var36 = new class5();
                                        var36.field79 = class195.field3793 - var12;
                                        var36.field99 = class39.field736 - var11;
                                        var36.field96 = var10.field3010;
                                        var36.field101 = var10;
                                        class18.field342.method402(16777215, var36);
                                    }
                                }
                                if (var10.field3062 != null) {
                                    class5 var37 = new class5();
                                    var37.field96 = var10.field3062;
                                    var37.field101 = var10;
                                    class71.field1339.method402(16777215, var37);
                                }
                                if (var10.field3018 != null && class92.field1705 > var10.field3013) {
                                    if (var10.field3126 == null || class92.field1705 - var10.field3013 > 32) {
                                        class5 var42 = new class5();
                                        var42.field96 = var10.field3018;
                                        var42.field101 = var10;
                                        class44.field842.method402(16777215, var42);
                                    } else {
                                        label394: for (int var38 = var10.field3013; var38 < class92.field1705; var38++) {
                                            int var39 = class129.field2335[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field3126.length; var40++) {
                                                if (var10.field3126[var40] == var39) {
                                                    class5 var41 = new class5();
                                                    var41.field101 = var10;
                                                    var41.field96 = var10.field3018;
                                                    class44.field842.method402(16777215, var41);
                                                    break label394;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3013 = class92.field1705;
                                }
                                if (var10.field3068 != null && class209.field4005 > var10.field3046) {
                                    if (var10.field3100 == null || class209.field4005 - var10.field3046 > 32) {
                                        class5 var47 = new class5();
                                        var47.field101 = var10;
                                        var47.field96 = var10.field3068;
                                        class44.field842.method402(16777215, var47);
                                    } else {
                                        label370: for (int var43 = var10.field3046; var43 < class209.field4005; var43++) {
                                            int var44 = class133.field2407[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field3100.length; var45++) {
                                                if (var10.field3100[var45] == var44) {
                                                    class5 var46 = new class5();
                                                    var46.field96 = var10.field3068;
                                                    var46.field101 = var10;
                                                    class44.field842.method402(16777215, var46);
                                                    break label370;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3046 = class209.field4005;
                                }
                                if (var10.field3015 != null && class63.field1199 > var10.field3049) {
                                    if (var10.field3127 == null || class63.field1199 - var10.field3049 > 32) {
                                        class5 var52 = new class5();
                                        var52.field101 = var10;
                                        var52.field96 = var10.field3015;
                                        class44.field842.method402(16777215, var52);
                                    } else {
                                        label346: for (int var48 = var10.field3049; var48 < class63.field1199; var48++) {
                                            int var49 = class15.field286[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field3127.length; var50++) {
                                                if (var10.field3127[var50] == var49) {
                                                    class5 var51 = new class5();
                                                    var51.field96 = var10.field3015;
                                                    var51.field101 = var10;
                                                    class44.field842.method402(16777215, var51);
                                                    break label346;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3049 = class63.field1199;
                                }
                                if (class21.field407 > var10.field3125 && var10.field3128 != null) {
                                    class5 var53 = new class5();
                                    var53.field96 = var10.field3128;
                                    var53.field101 = var10;
                                    class44.field842.method402(16777215, var53);
                                }
                                if (class158.field2825 > var10.field3125 && var10.field3023 != null) {
                                    class5 var54 = new class5();
                                    var54.field96 = var10.field3023;
                                    var54.field101 = var10;
                                    class44.field842.method402(16777215, var54);
                                }
                                if (class177.field3379 > var10.field3125 && var10.field3090 != null) {
                                    class5 var55 = new class5();
                                    var55.field96 = var10.field3090;
                                    var55.field101 = var10;
                                    class44.field842.method402(16777215, var55);
                                }
                                if (var10.field3125 < class179.field3422 && var10.field3087 != null) {
                                    class5 var56 = new class5();
                                    var56.field96 = var10.field3087;
                                    var56.field101 = var10;
                                    class44.field842.method402(16777215, var56);
                                }
                                if (class191.field3733 > var10.field3125 && var10.field3091 != null) {
                                    class5 var57 = new class5();
                                    var57.field96 = var10.field3091;
                                    var57.field101 = var10;
                                    class44.field842.method402(16777215, var57);
                                }
                                var10.field3125 = class136.field2471;
                                if (var10.field3103 != null) {
                                    for (int var58 = 0; var58 < class79.field1430; var58++) {
                                        class5 var59 = new class5();
                                        var59.field101 = var10;
                                        var59.field106 = class18.field336[var58];
                                        var59.field92 = class191.field3725[var58];
                                        var59.field96 = var10.field3103;
                                        class44.field842.method402(16777215, var59);
                                    }
                                }
                            }
                        }
                        if (!var10.field3106) {
                            if (class34.field591 != null || class31.field535 != null || class170.field3244) {
                                return;
                            }
                            if ((var10.field3008 >= 0 || var10.field2988 != 0) && var21 <= class39.field736 && class195.field3793 >= var20 && class39.field736 < var19 && var22 > class195.field3793) {
                                if (var10.field3008 < 0) {
                                    class68.field1305 = var10;
                                } else {
                                    class68.field1305 = arg3[var10.field3008];
                                }
                            }
                            if (var10.field3061 == 8 && var21 <= class39.field736 && var20 <= class195.field3793 && var19 > class39.field736 && var22 > class195.field3793) {
                                class59.field1102 = var10;
                            }
                            if (var10.field3096 > var10.field3089) {
                                class132.method801(var10, class195.field3793, var12, class39.field736, var10.field3089, var10.field3096, var11 + var10.field3045, -9);
                            }
                        }
                    }
                }
            }
        }
        if (!arg7) {
            method288(101, 24, -117, null, -19, -10, 106, true, -20);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field952++;
        class140 var11 = this.method15(7);
        if (var11 != null) {
            var11.method289(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field949 = var11.field949;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)Loh;")
    public class140 method15(int arg0) {
        if (arg0 != 7) {
            method286(-97, 8, 26);
        }
        field950++;
        return null;
    }
}
