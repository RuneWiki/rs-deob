import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class199 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3611 = 0;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "F")
    public static float field3616;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lkc;")
    public static class278 field3614;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILid;)Lgh;")
    public static final class24 method1359(int arg0, class149 arg1) {
        field3613++;
        for (class24 var2 = (class24) class167.field3095.method1140(0); var2 != null; var2 = (class24) class167.field3095.method1127(0)) {
            if (var2.field363.method1041((byte) -78, arg1)) {
                return var2;
            }
        }
        int var3 = 31 / ((11 - arg0) / 34);
        return null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lug;IIIZ)V")
    public void method1360(class199 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3618++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIIJILue;)V")
    public abstract void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Lug;")
    public class199 method1361(int arg0, int arg1, int arg2) {
        field3617++;
        return this;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1362(byte arg0) {
        if (arg0 > -124) {
            method1363(56, (class149[]) null, -9, (byte) -4);
        }
        field3614 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[Lid;IB)Lid;")
    public static final class149 method1363(int arg0, class149[] arg1, int arg2, byte arg3) {
        field3615++;
        int var4 = 0;
        if (arg3 != -67) {
            field3614 = null;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg1[arg2 + var5] == null) {
                arg1[arg2 + var5] = class44.field672;
            }
            var4 += arg1[arg2 + var5].field2670;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class149 var10 = arg1[arg2 + var8];
            class209.method1428(var10.field2694, 0, var6, var7, var10.field2670);
            var7 += var10.field2670;
        }
        class149 var9 = new class149();
        var9.field2694 = var6;
        var9.field2670 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()Z")
    public boolean method1364() {
        field3619++;
        return false;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "()I")
    public abstract int method53();

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lma;IIIIIIIZ)V")
    public static final void method1365(class188 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class82.field1495;
        int var11;
        int var12 = var11 = (arg7 << 7) - class226.field3971;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class189.field3393[arg1][arg6][arg7] - class37.field554;
        int var18 = class189.field3393[arg1][arg6 + 1][arg7] - class37.field554;
        int var19 = class189.field3393[arg1][arg6 + 1][arg7 + 1] - class37.field554;
        int var20 = class189.field3393[arg1][arg6][arg7 + 1] - class37.field554;
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
        int var45 = (var21 << 9) / var25 + class235.field4117;
        int var46 = (var24 << 9) / var25 + class235.field4113;
        int var47 = (var27 << 9) / var31 + class235.field4117;
        int var48 = (var30 << 9) / var31 + class235.field4113;
        int var49 = (var33 << 9) / var37 + class235.field4117;
        int var50 = (var36 << 9) / var37 + class235.field4113;
        int var51 = (var39 << 9) / var43 + class235.field4117;
        int var52 = (var42 << 9) / var43 + class235.field4113;
        class235.field4116 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class246.field4317 && class43.method252(class273.field4911 + class235.field4117, class67.field1173 + class235.field4113, var50, var52, var48, var49, var51, var47)) {
                class198.field3606 = arg6;
                class39.field615 = arg7;
            }
            if (!arg8) {
                class235.field4121 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class235.field4127 || var51 > class235.field4127 || var47 > class235.field4127) {
                    class235.field4121 = true;
                }
                if (arg0.field3374 == -1) {
                    if (arg0.field3371 != 12345678) {
                        class235.method1589(var50, var52, var48, var49, var51, var47, arg0.field3371, arg0.field3370, arg0.field3365);
                    }
                } else if (!class211.field3762) {
                    int var53 = class235.field4129.method123((byte) -120, arg0.field3374);
                    class235.method1589(var50, var52, var48, var49, var51, var47, class158.method1141(var53, arg0.field3371), class158.method1141(var53, arg0.field3370), class158.method1141(var53, arg0.field3365));
                } else if (arg0.field3366) {
                    class235.method1579(var50, var52, var48, var49, var51, var47, arg0.field3371, arg0.field3370, arg0.field3365, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3374);
                } else {
                    class235.method1579(var50, var52, var48, var49, var51, var47, arg0.field3371, arg0.field3370, arg0.field3365, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3374);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class246.field4317 && class43.method252(class273.field4911 + class235.field4117, class67.field1173 + class235.field4113, var46, var48, var52, var45, var47, var51)) {
            class198.field3606 = arg6;
            class39.field615 = arg7;
        }
        if (arg8) {
            return;
        }
        class235.field4121 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class235.field4127 || var47 > class235.field4127 || var51 > class235.field4127) {
            class235.field4121 = true;
        }
        if (arg0.field3374 != -1) {
            if (class211.field3762) {
                class235.method1579(var46, var48, var52, var45, var47, var51, arg0.field3368, arg0.field3365, arg0.field3370, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3374);
                return;
            }
            int var54 = class235.field4129.method123((byte) -118, arg0.field3374);
            class235.method1589(var46, var48, var52, var45, var47, var51, class158.method1141(var54, arg0.field3368), class158.method1141(var54, arg0.field3365), class158.method1141(var54, arg0.field3370));
        } else if (arg0.field3368 != 12345678) {
            class235.method1589(var46, var48, var52, var45, var47, var51, arg0.field3368, arg0.field3365, arg0.field3370);
            return;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
    public abstract void method49(int arg0, int arg1, int arg2, int arg3, int arg4);
}
