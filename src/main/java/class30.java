import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class30 {

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field747 = 0;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "[I")
    public static int[] field752 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Z")
    public static boolean field743 = false;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lci;")
    public static class234 field745;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lse;IIIIIIIZ)V")
    public static final void method193(class200 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class43.field940;
        int var11;
        int var12 = var11 = (arg7 << 7) - class1.field5;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class112.field2102[arg1][arg6][arg7] - class220.field3907;
        int var18 = class112.field2102[arg1][arg6 + 1][arg7] - class220.field3907;
        int var19 = class112.field2102[arg1][arg6 + 1][arg7 + 1] - class220.field3907;
        int var20 = class112.field2102[arg1][arg6][arg7 + 1] - class220.field3907;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class270.field4756;
        int var46 = (var24 << 9) / var25 + class270.field4757;
        int var47 = (var27 << 9) / var31 + class270.field4756;
        int var48 = (var30 << 9) / var31 + class270.field4757;
        int var49 = (var33 << 9) / var37 + class270.field4756;
        int var50 = (var36 << 9) / var37 + class270.field4757;
        int var51 = (var39 << 9) / var43 + class270.field4756;
        int var52 = (var42 << 9) / var43 + class270.field4757;
        class270.field4766 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class207.field3745 && class202.method1402(class270.field4756 + class184.field3332, class5.field105 + class270.field4757, var50, var52, var48, var49, var51, var47)) {
                class142.field2608 = arg6;
                class90.field1775 = arg7;
            }
            if (!arg8) {
                class270.field4772 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class270.field4771 || var51 > class270.field4771 || var47 > class270.field4771) {
                    class270.field4772 = true;
                }
                if (arg0.field3604 == -1) {
                    if (arg0.field3609 != 12345678) {
                        class270.method1836(var50, var52, var48, var49, var51, var47, arg0.field3609, arg0.field3605, arg0.field3613);
                    }
                } else if (!class107.field2028) {
                    int var53 = class270.field4764.method60(65535, arg0.field3604);
                    class270.method1836(var50, var52, var48, var49, var51, var47, class217.method1483(var53, arg0.field3609), class217.method1483(var53, arg0.field3605), class217.method1483(var53, arg0.field3613));
                } else if (arg0.field3618) {
                    class270.method1835(var50, var52, var48, var49, var51, var47, arg0.field3609, arg0.field3605, arg0.field3613, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3604);
                } else {
                    class270.method1835(var50, var52, var48, var49, var51, var47, arg0.field3609, arg0.field3605, arg0.field3613, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3604);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class207.field3745 && class202.method1402(class270.field4756 + class184.field3332, class5.field105 + class270.field4757, var46, var48, var52, var45, var47, var51)) {
            class142.field2608 = arg6;
            class90.field1775 = arg7;
        }
        if (arg8) {
            return;
        }
        class270.field4772 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class270.field4771 || var47 > class270.field4771 || var51 > class270.field4771) {
            class270.field4772 = true;
        }
        if (arg0.field3604 != -1) {
            if (class107.field2028) {
                class270.method1835(var46, var48, var52, var45, var47, var51, arg0.field3611, arg0.field3613, arg0.field3605, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3604);
                return;
            }
            int var54 = class270.field4764.method60(65535, arg0.field3604);
            class270.method1836(var46, var48, var52, var45, var47, var51, class217.method1483(var54, arg0.field3611), class217.method1483(var54, arg0.field3613), class217.method1483(var54, arg0.field3605));
        } else if (arg0.field3611 != 12345678) {
            class270.method1836(var46, var48, var52, var45, var47, var51, arg0.field3611, arg0.field3613, arg0.field3605);
            return;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method194(Component arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method195(int arg0) {
        class153.field2775.method29(91);
        if (arg0 != 405) {
            method199((class21) null, true, false, 1, 30);
        }
        field749++;
        class20.field463.method257(true);
        class176.field3178.method257(true);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I")
    public abstract int method196(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class34.field814.field358; var9++) {
            int var10 = class34.field814.field356[var9] - class54.field1146;
            int var11 = class116.field2163 + class112.field2110 - class34.field814.field364[var9] - 1;
            int var12 = (var10 - arg3) * (arg0 - arg4) / (arg6 - arg3) + arg4;
            int var13 = (var11 - arg1) * (arg8 - arg2) / (arg5 - arg1) + arg2;
            int var14 = 16777215;
            class104 var15 = null;
            int var16 = class34.field814.method108(var9, 3);
            if (var16 == 0) {
                if ((double) class201.field3627 == 3.0D) {
                    var15 = class66.field1360;
                }
                if ((double) class201.field3627 == 4.0D) {
                    var15 = class252.field4378;
                }
                if ((double) class201.field3627 == 6.0D) {
                    var15 = class200.field3623;
                }
                if ((double) class201.field3627 == 8.0D) {
                    var15 = class156.field2803;
                }
            }
            if (var16 == 1) {
                if ((double) class201.field3627 == 3.0D) {
                    var15 = class200.field3623;
                }
                if ((double) class201.field3627 == 4.0D) {
                    var15 = class156.field2803;
                }
                if ((double) class201.field3627 == 6.0D) {
                    var15 = class145.field2660;
                }
                if ((double) class201.field3627 == 8.0D) {
                    var15 = class268.field4721;
                }
            }
            if (var16 == 2) {
                var14 = 16755200;
                if ((double) class201.field3627 == 3.0D) {
                    var15 = class145.field2660;
                }
                if ((double) class201.field3627 == 4.0D) {
                    var15 = class268.field4721;
                }
                if ((double) class201.field3627 == 6.0D) {
                    var15 = class109.field2052;
                }
                if ((double) class201.field3627 == 8.0D) {
                    var15 = class271.field4784;
                }
            }
            if (class34.field814.field352[var9] != -1) {
                var14 = class34.field814.field352[var9];
            }
            if (var15 != null) {
                class263[] var17 = new class263[class34.field814.field357[var9].method1747((byte) -108, 60) + 1];
                class11.field243.method420(class34.field814.field357[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - var15.method696() * (var18 - 1) / 2;
                int var20 = var19 + var15.method698() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class263 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method1763(-124, var17[var21].method1740(arg7 ^ -125) - 4, 0);
                    var15.method705(var22, var12, var20, var14, true);
                    var20 += var15.method696();
                }
            }
        }
        field751++;
        if (arg7 != 1) {
            method193((class200) null, -45, 109, 59, -64, 22, -45, -74, false);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V")
    public static final void method198(int arg0, byte arg1) {
        if (arg1 == -2) {
            class101.field1932.method829(arg0, (byte) -52);
            class46.field989.method829(arg0, (byte) -75);
            field744++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpc;ZZII)V")
    public static final void method199(class21 arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        if (arg1) {
            return;
        }
        field746++;
        int var5 = arg0.field539;
        if (arg0.field506 == 0) {
            arg0.field539 = arg0.field491;
        } else if (arg0.field506 == 1) {
            arg0.field539 = arg3 - arg0.field491;
        } else if (arg0.field506 == 2) {
            arg0.field539 = arg0.field491 * arg3 >> 14;
        } else if (arg0.field506 == 3) {
            if (arg0.field519 == 2) {
                arg0.field539 = arg0.field491 * 32 + ((arg0.field491 - 1) * arg0.field494);
            } else if (arg0.field519 == 7) {
                arg0.field539 = (arg0.field491 - 1) * arg0.field494 + arg0.field491 * 115;
            }
        }
        int var6 = arg0.field479;
        if (arg0.field578 == 0) {
            arg0.field479 = arg0.field541;
        } else if (arg0.field578 == 1) {
            arg0.field479 = arg4 - arg0.field541;
        } else if (arg0.field578 == 2) {
            arg0.field479 = arg0.field541 * arg4 >> 14;
        } else if (arg0.field578 == 3) {
            if (arg0.field519 == 2) {
                arg0.field479 = (arg0.field541 - 1) * arg0.field542 + arg0.field541 * 32;
            } else if (arg0.field519 == 7) {
                arg0.field479 = (arg0.field541 - 1) * arg0.field542 + arg0.field541 * 12;
            }
        }
        if (arg0.field506 == 4) {
            arg0.field539 = arg0.field479 * arg0.field473 / arg0.field472;
        }
        if (arg0.field578 == 4) {
            arg0.field479 = arg0.field539 * arg0.field472 / arg0.field473;
        }
        if (class121.field2246 && (client.method1005(arg0) != 0 || arg0.field519 == 0)) {
            if (arg0.field479 < 5 && arg0.field539 < 5) {
                arg0.field539 = 5;
                arg0.field479 = 5;
            } else {
                if (arg0.field479 <= 0) {
                    arg0.field479 = 5;
                }
                if (arg0.field539 <= 0) {
                    arg0.field539 = 5;
                }
            }
        }
        if (arg0.field516 == 1337) {
            class113.field2122 = arg0;
        }
        if (arg2 && arg0.field593 != null && arg0.field539 != var5 || arg0.field479 != var6) {
            class116 var7 = new class116();
            var7.field2166 = arg0;
            var7.field2173 = arg0.field593;
            class261.field4531.method1883(var7, (byte) -3);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method200(int arg0, Component arg1);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public static void method201(int arg0) {
        field745 = null;
        if (arg0 != -9754) {
            method193((class200) null, -70, 27, 62, -37, 18, 116, -87, true);
        }
        field752 = null;
    }
}
