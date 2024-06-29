import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class88 extends class123 {

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field1420 = 0;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Lkc;")
    public static class41 field1418;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 14)
    public static void method696(int arg0) {
        field1418 = null;
        if (arg0 != -1491191832) {
            method702((class106) null, -79, -75, 13, 73, -87, -68, 9, true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIII)V", line = 40)
    public final void method700(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -923612572) {
            field1420 = -86;
        }
        int var6 = this.field1422 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field1421 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method701(var6, var8, var7, var9, arg3, arg4);
        field1419++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lca;IIIIIIIZ)V", line = 71)
    public static final void method702(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class104.field1720;
        int var11;
        int var12 = var11 = (arg7 << 7) - class339.field5231;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class85.field1374[arg1][arg6][arg7] - class237.field3561;
        int var18 = class85.field1374[arg1][arg6 + 1][arg7] - class237.field3561;
        int var19 = class85.field1374[arg1][arg6 + 1][arg7 + 1] - class237.field3561;
        int var20 = class85.field1374[arg1][arg6][arg7 + 1] - class237.field3561;
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
        int var45 = (var21 << 9) / var25 + class40.field616;
        int var46 = (var24 << 9) / var25 + class40.field610;
        int var47 = (var27 << 9) / var31 + class40.field616;
        int var48 = (var30 << 9) / var31 + class40.field610;
        int var49 = (var33 << 9) / var37 + class40.field616;
        int var50 = (var36 << 9) / var37 + class40.field610;
        int var51 = (var39 << 9) / var43 + class40.field616;
        int var52 = (var42 << 9) / var43 + class40.field610;
        class40.field607 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class30.field480 && class85.method674(class40.field616 + class257.field3809, class40.field610 + class243.field3638, var50, var52, var48, var49, var51, var47)) {
                class289.field4552 = arg6;
                class184.field2923 = arg7;
            }
            if (!class162.field2623 && !arg8) {
                class40.field603 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class40.field615 || var51 > class40.field615 || var47 > class40.field615) {
                    class40.field603 = true;
                }
                if (arg0.field1752 == -1) {
                    if (arg0.field1744 != 12345678) {
                        class40.method359(var50, var52, var48, var49, var51, var47, arg0.field1744, arg0.field1751, arg0.field1741);
                    }
                } else if (!class109.field1777) {
                    int var53 = class40.field614.method251(false, arg0.field1752);
                    class40.method359(var50, var52, var48, var49, var51, var47, class143.method1102(var53, arg0.field1744), class143.method1102(var53, arg0.field1751), class143.method1102(var53, arg0.field1741));
                } else if (arg0.field1750) {
                    class40.method364(var50, var52, var48, var49, var51, var47, arg0.field1744, arg0.field1751, arg0.field1741, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1752);
                } else {
                    class40.method364(var50, var52, var48, var49, var51, var47, arg0.field1744, arg0.field1751, arg0.field1741, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1752);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class30.field480 && class85.method674(class40.field616 + class257.field3809, class40.field610 + class243.field3638, var46, var48, var52, var45, var47, var51)) {
            class289.field4552 = arg6;
            class184.field2923 = arg7;
        }
        if (class162.field2623 || arg8) {
            return;
        }
        class40.field603 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class40.field615 || var47 > class40.field615 || var51 > class40.field615) {
            class40.field603 = true;
        }
        if (arg0.field1752 == -1) {
            if (arg0.field1738 != 12345678) {
                class40.method359(var46, var48, var52, var45, var47, var51, arg0.field1738, arg0.field1741, arg0.field1751);
            }
        } else if (class109.field1777) {
            class40.method364(var46, var48, var52, var45, var47, var51, arg0.field1738, arg0.field1741, arg0.field1751, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1752);
        } else {
            int var54 = class40.field614.method251(false, arg0.field1752);
            class40.method359(var46, var48, var52, var45, var47, var51, class143.method1102(var54, arg0.field1738), class143.method1102(var54, arg0.field1741), class143.method1102(var54, arg0.field1751));
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V", line = 230)
    public static final void method703(byte arg0, int arg1) {
        field1416++;
        if (arg1 == -1 || !class135.field2158[arg1]) {
            return;
        }
        class251.field3702.method949(arg1, false);
        if (class110.field1789[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class110.field1789[arg1].length; var3++) {
            if (class110.field1789[arg1][var3] != null) {
                if (class110.field1789[arg1][var3].field4084 == 2) {
                    var2 = false;
                } else {
                    class110.field1789[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class110.field1789[arg1] = null;
        }
        class135.field2158[arg1] = false;
        if (arg0 != 54) {
            field1420 = 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public abstract void method693(int arg0, int arg1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
    public abstract void method694(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
    public abstract void method695(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public abstract void method697(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
    public abstract void method698(int arg0, int arg1);

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
    public abstract void method699(int arg0, int arg1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method701(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
