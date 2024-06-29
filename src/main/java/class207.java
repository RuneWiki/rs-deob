import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class207 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    public static int[] field3289 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field3291;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lqa;IIIIIIIZ)V", line = 16)
    public static final void method1363(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class211.field3365;
        int var11;
        int var12 = var11 = (arg7 << 7) - class57.field898;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class208.field3304[arg1][arg6][arg7] - class67.field1038;
        int var18 = class208.field3304[arg1][arg6 + 1][arg7] - class67.field1038;
        int var19 = class208.field3304[arg1][arg6 + 1][arg7 + 1] - class67.field1038;
        int var20 = class208.field3304[arg1][arg6][arg7 + 1] - class67.field1038;
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
        int var45 = (var21 << 9) / var25 + class229.field3792;
        int var46 = (var24 << 9) / var25 + class229.field3803;
        int var47 = (var27 << 9) / var31 + class229.field3792;
        int var48 = (var30 << 9) / var31 + class229.field3803;
        int var49 = (var33 << 9) / var37 + class229.field3792;
        int var50 = (var36 << 9) / var37 + class229.field3803;
        int var51 = (var39 << 9) / var43 + class229.field3792;
        int var52 = (var42 << 9) / var43 + class229.field3803;
        class229.field3799 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0 && class101.field1516 && class239.method1687(class229.field3792 + class201.field3188, class241.field4020 + class229.field3803, var50, var52, var48, var49, var51, var47)) {
            class242.field4026 = arg6;
            class182.field2772 = arg7;
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0 && class101.field1516 && class239.method1687(class229.field3792 + class201.field3188, class241.field4020 + class229.field3803, var46, var48, var52, var45, var47, var51)) {
            class242.field4026 = arg6;
            class182.field2772 = arg7;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 119)
    public static void method1364(int arg0) {
        field3291 = null;
        if (arg0 == 0) {
            field3289 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 140)
    public static final void method1365(int arg0) {
        class88.field1315 = null;
        class268.field4610 = null;
        class112.field1665 = null;
        field3288++;
        class37.field590 = (byte[][]) null;
        class179.field2718 = null;
        if (arg0 != 9) {
            method1363((class96) null, 25, 87, -77, -83, 69, 30, 52, false);
        }
        class287.field4836 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I", line = 167)
    public static final int method1366(int arg0, int arg1, int arg2) {
        if (arg0 != 9) {
            return -48;
        }
        field3290++;
        class255 var3 = (class255) class300.field5062.method1372(false, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field4360.length) {
            return var3.field4360[arg2];
        } else {
            return 0;
        }
    }
}
