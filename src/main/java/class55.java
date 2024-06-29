import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class55 extends class308 {

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "[I")
    public static int[] field657 = new int[50];

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public static int field658 = 0;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "[I")
    public static int[] field666 = new int[100];

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "[S")
    public static short[] field660 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "Liq;")
    public static class362 field659 = new class362("K", "T", "K", "K");

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field668 = 0;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field667;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field669;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "[Lon;")
    public static class184[] field665;

    // $FF: synthetic method
    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method320(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 13)
    public static final void method314(int arg0) {
        field661++;
        while (true) {
            class241 var1;
            class396 var3;
            do {
                do {
                    var1 = (class241) class87.field991.method513(-2);
                    if (var1 == null) {
                        if (arg0 != 64) {
                            field660 = null;
                            return;
                        }
                        return;
                    }
                } while (class250.field3570 == null);
                if (var1.field3426 < 0) {
                    int var2 = -var1.field3426 - 1;
                    if (class414.field5948 == var2) {
                        var3 = class384.field5422;
                    } else {
                        var3 = class26.field314[var2];
                    }
                } else {
                    int var4 = var1.field3426 - 1;
                    var3 = class167.field2335[var4];
                }
            } while (var3 == null);
            class88 var5 = class374.method2382(var1.field3434, false);
            int var6;
            int var7;
            if (var1.field3421 == 1 || var1.field3421 == 3) {
                var7 = var5.field1008;
                var6 = var5.field1029;
            } else {
                var6 = var5.field1008;
                var7 = var5.field1029;
            }
            int var8 = (var6 >> 1) + var1.field3430;
            int var9 = (var6 + 1 >> 1) + var1.field3430;
            int var10 = (var7 >> 1) + var1.field3433;
            int var11 = (var7 + 1 >> 1) + var1.field3433;
            class327 var12 = class161.field2122[var3.field3285];
            int var13 = var12.method328(var8, var10) + var12.method328(var9, var10) + (var12.method328(var8, var11) - -var12.method328(var9, var11)) >> 2;
            class9 var14 = null;
            int var15 = class356.field5018[var1.field3437];
            if (var15 == 0) {
                var14 = (class9) class137.method847(var3.field3285, var1.field3430, var1.field3433);
            } else if (var15 == 1) {
                var14 = (class9) class109.method696(var3.field3285, var1.field3430, var1.field3433);
            } else if (var15 == 2) {
                var14 = (class9) class159.method1013(var3.field3285, var1.field3430, var1.field3433, field669 == null ? (field669 = method320("vl")) : field669);
            } else if (var15 == 3) {
                var14 = (class9) class327.method2118(var3.field3285, var1.field3430, var1.field3433);
            }
            if (var14 != null) {
                class167.method1133(var1.field3433, 0, var1.field3430, 0, var1.field3432, var3.field3285, var15, var1.field3428 + 1, false, -1);
                var3.field5658 = var14;
                var3.field5669 = var1.field3432 + class189.field2726;
                var3.field5659 = var1.field3433 * 128 + var7 * 64;
                var3.field5661 = var1.field3430 * 128 + var6 * 64;
                var3.field5673 = var13;
                var3.field5662 = class189.field2726 + var1.field3428;
                int var16 = var1.field3436;
                int var17 = var1.field3424;
                int var18 = var1.field3420;
                if (var17 < var16) {
                    int var19 = var16;
                    var16 = var17;
                    var17 = var19;
                }
                int var20 = var1.field3425;
                if (var20 < var18) {
                    int var21 = var18;
                    var18 = var20;
                    var20 = var21;
                }
                var3.field5663 = var1.field3430 + var17;
                var3.field5660 = var1.field3430 + var16;
                var3.field5676 = var1.field3433 + var20;
                var3.field5672 = var1.field3433 + var18;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 148)
    public static final void method315(byte arg0) {
        if (class299.field4191 == null || class247.field3531 == null) {
            class247.field3531 = new int[256];
            class299.field4191 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class299.field4191[var1] = (int) (Math.sin(var2) * 4096.0D);
                class247.field3531[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field667++;
        if (arg0 != 42) {
            method319(true, (class184) null, -44, 88);
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 179)
    public static void method316(int arg0) {
        field657 = null;
        int var1 = -55 % ((1 - arg0) / 49);
        field660 = null;
        field659 = null;
        field666 = null;
        field665 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IIIIIIII)V", line = 194)
    public static final void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field662++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg6 - arg5;
        int var12 = arg3 - arg5;
        int var13 = arg6 * arg6;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        if (arg4 != 14064) {
            field660 = null;
        }
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class388.field5464 <= arg2 && class219.field3080 >= arg2) {
            int[] var39 = class291.field4067[arg2];
            int var40 = class130.method805(true, class235.field3295, arg1 - arg6, class81.field946);
            int var41 = class130.method805(true, class235.field3295, arg1 + arg6, class81.field946);
            int var42 = class130.method805(true, class235.field3295, arg1 - var11, class81.field946);
            int var43 = class130.method805(true, class235.field3295, arg1 + var11, class81.field946);
            class296.method1954(arg0, var42, var39, var40, -1);
            class296.method1954(arg7, var43, var39, var42, -1);
            class296.method1954(arg0, var41, var39, var43, -1);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg2 - var9;
            int var46 = arg2 + var9;
            if (var46 >= class388.field5464 && class219.field3080 >= var45) {
                int var47 = class130.method805(true, class235.field3295, arg1 + var8, class81.field946);
                int var48 = class130.method805(true, class235.field3295, arg1 - var8, class81.field946);
                if (var44) {
                    int var49 = class130.method805(true, class235.field3295, arg1 + var10, class81.field946);
                    int var50 = class130.method805(true, class235.field3295, arg1 - var10, class81.field946);
                    if (class388.field5464 <= var45) {
                        int[] var51 = class291.field4067[var45];
                        class296.method1954(arg0, var50, var51, var48, -1);
                        class296.method1954(arg7, var49, var51, var50, -1);
                        class296.method1954(arg0, var47, var51, var49, -1);
                    }
                    if (var46 <= class219.field3080) {
                        int[] var52 = class291.field4067[var46];
                        class296.method1954(arg0, var50, var52, var48, -1);
                        class296.method1954(arg7, var49, var52, var50, -1);
                        class296.method1954(arg0, var47, var52, var49, -1);
                    }
                } else {
                    if (class388.field5464 <= var45) {
                        class296.method1954(arg0, var47, class291.field4067[var45], var48, arg4 ^ 0xFFFFC90F);
                    }
                    if (class219.field3080 >= var46) {
                        class296.method1954(arg0, var47, class291.field4067[var46], var48, arg4 ^ 0xFFFFC90F);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)V", line = 402)
    public static final void method318(int arg0, int arg1) {
        field664++;
        if (arg1 < 26) {
            field657 = null;
        }
        if (class367.field5203 == null || class367.field5203.length < arg0) {
            class367.field5203 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLon;II)V", line = 433)
    public static final void method319(boolean arg0, class184 arg1, int arg2, int arg3) {
        field663++;
        if (arg1.field2554 == 0) {
            arg1.field2567 = arg1.field2512;
        } else if (arg1.field2554 == 1) {
            arg1.field2567 = (arg2 - arg1.field2618) / 2 + arg1.field2512;
        } else if (arg1.field2554 == 2) {
            arg1.field2567 = arg2 - arg1.field2618 - arg1.field2512;
        } else if (arg1.field2554 == 3) {
            arg1.field2567 = arg1.field2512 * arg2 >> 14;
        } else if (arg1.field2554 == 4) {
            arg1.field2567 = (arg1.field2512 * arg2 >> 14) + (arg2 - arg1.field2618) / 2;
        } else {
            arg1.field2567 = arg2 - (arg1.field2512 * arg2 >> 14) - arg1.field2618;
        }
        if (arg1.field2662 == 0) {
            arg1.field2602 = arg1.field2559;
        } else if (arg1.field2662 == 1) {
            arg1.field2602 = (arg3 - arg1.field2516) / 2 + arg1.field2559;
        } else if (arg1.field2662 == 2) {
            arg1.field2602 = arg3 - arg1.field2516 - arg1.field2559;
        } else if (arg1.field2662 == 3) {
            arg1.field2602 = arg1.field2559 * arg3 >> 14;
        } else if (arg1.field2662 == 4) {
            arg1.field2602 = (arg1.field2559 * arg3 >> 14) + (arg3 - arg1.field2516) / 2;
        } else {
            arg1.field2602 = arg3 - arg1.field2516 - (arg1.field2559 * arg3 >> 14);
        }
        if (arg0) {
            field659 = null;
        }
        if (!class367.field5204 || client.method1121(arg1).field3981 == 0 && arg1.field2524 != 0) {
            return;
        }
        if (arg1.field2602 < 0) {
            arg1.field2602 = 0;
        } else if (arg3 < (arg1.field2602 + arg1.field2516)) {
            arg1.field2602 = arg3 - arg1.field2516;
        }
        if (arg1.field2567 < 0) {
            arg1.field2567 = 0;
        } else if (arg1.field2618 + arg1.field2567 > arg2) {
            arg1.field2567 = arg2 - arg1.field2618;
            return;
        }
    }
}
