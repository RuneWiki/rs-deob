import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[I")
    public static int[] field86 = new int[32];

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field87 = 0;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Luh;IIIIIIIZ)V")
    public static final void method37(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class230.field3789;
        int var11;
        int var12 = var11 = (arg7 << 7) - class236.field3909;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class17.field209[arg1][arg6][arg7] - class57.field735;
        int var18 = class17.field209[arg1][arg6 + 1][arg7] - class57.field735;
        int var19 = class17.field209[arg1][arg6 + 1][arg7 + 1] - class57.field735;
        int var20 = class17.field209[arg1][arg6][arg7 + 1] - class57.field735;
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
        int var45 = (var21 << 9) / var25 + class174.field2763;
        int var46 = (var24 << 9) / var25 + class174.field2766;
        int var47 = (var27 << 9) / var31 + class174.field2763;
        int var48 = (var30 << 9) / var31 + class174.field2766;
        int var49 = (var33 << 9) / var37 + class174.field2763;
        int var50 = (var36 << 9) / var37 + class174.field2766;
        int var51 = (var39 << 9) / var43 + class174.field2763;
        int var52 = (var42 << 9) / var43 + class174.field2766;
        class174.field2755 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class101.field1367 && class198.method1384(class71.field903 + class174.field2763, class174.field2766 + class155.field2428, var50, var52, var48, var49, var51, var47)) {
                class155.field2458 = arg6;
                class115.field1640 = arg7;
            }
            if (!arg8) {
                class174.field2762 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class174.field2750 || var51 > class174.field2750 || var47 > class174.field2750) {
                    class174.field2762 = true;
                }
                if (arg0.field759 == -1) {
                    if (arg0.field756 != 12345678) {
                        class174.method1201(var50, var52, var48, var49, var51, var47, arg0.field756, arg0.field748, arg0.field753);
                    }
                } else if (!class196.field3131) {
                    int var53 = class174.field2756.method779(-7078, arg0.field759);
                    class174.method1201(var50, var52, var48, var49, var51, var47, class239.method1683(var53, arg0.field756), class239.method1683(var53, arg0.field748), class239.method1683(var53, arg0.field753));
                } else if (arg0.field751) {
                    class174.method1206(var50, var52, var48, var49, var51, var47, arg0.field756, arg0.field748, arg0.field753, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field759);
                } else {
                    class174.method1206(var50, var52, var48, var49, var51, var47, arg0.field756, arg0.field748, arg0.field753, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field759);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class101.field1367 && class198.method1384(class71.field903 + class174.field2763, class174.field2766 + class155.field2428, var46, var48, var52, var45, var47, var51)) {
            class155.field2458 = arg6;
            class115.field1640 = arg7;
        }
        if (arg8) {
            return;
        }
        class174.field2762 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class174.field2750 || var47 > class174.field2750 || var51 > class174.field2750) {
            class174.field2762 = true;
        }
        if (arg0.field759 != -1) {
            if (class196.field3131) {
                class174.method1206(var46, var48, var52, var45, var47, var51, arg0.field755, arg0.field753, arg0.field748, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field759);
                return;
            }
            int var54 = class174.field2756.method779(-7078, arg0.field759);
            class174.method1201(var46, var48, var52, var45, var47, var51, class239.method1683(var54, arg0.field755), class239.method1683(var54, arg0.field753), class239.method1683(var54, arg0.field748));
        } else if (arg0.field755 != 12345678) {
            class174.method1201(var46, var48, var52, var45, var47, var51, arg0.field755, arg0.field753, arg0.field748);
            return;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method38(byte arg0) {
        if (arg0 <= -112) {
            field86 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static final void method39(int arg0) {
        field89++;
        int var1 = 79 / ((-arg0 - 64) / 51);
        for (class86 var2 = (class86) class92.field1139.method710((byte) -108); var2 != null; var2 = (class86) class92.field1139.method709(false)) {
            int var3 = var2.field1064;
            if (class210.method1477((byte) 72, var3)) {
                boolean var4 = true;
                class123[] var5 = class75.field937[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field1796;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var2.field3923;
                    class123 var8 = class61.method358(var7, -123);
                    if (var8 != null) {
                        class129.method875((byte) -21, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V")
    public static final void method40(int arg0, byte arg1) {
        int var2 = 70 % ((-arg1 - 61) / 42);
        field90++;
        class139 var3 = class187.field2974;
        synchronized (class187.field2974) {
            class201.field3191 = arg0;
        }
    }
}
