import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class221 {

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lgb;")
    public static class158 field3764 = new class158(50);

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lwa;")
    public static class75 field3768 = class66.method560(" )2> <col=ffffff>", false);

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lwa;")
    public static class75 field3769 = class66.method560("RuneScape wird geladen )2 bitte warten)3)3)3", false);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lcb;")
    public static class267 field3765;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Z")
    public static boolean field3770;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1620(int arg0) {
        class112.field1905 = null;
        class116.field1968 = null;
        class52.field860 = (byte[][][]) null;
        field3763++;
        if (arg0 >= -40) {
            field3764 = (class158) null;
        }
        class206.field3489 = null;
        class66.field1147 = (byte[][][]) null;
        class238.field4006 = null;
        class164.field2788 = null;
        class242.field4102 = (byte[][][]) null;
        class261.field4365 = (byte[][][]) null;
        class164.field2786 = (byte[][][]) null;
        class51.field847 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 33)
    public static final void method1621(int arg0) {
        if (class7.field102 > class205.field3468) {
            class205.field3468 = (float) ((double) class205.field3468 / 30.0D + (double) class205.field3468);
            if (class205.field3468 > class7.field102) {
                class205.field3468 = class7.field102;
            }
            class3.method15(8887);
        } else if (class7.field102 < class205.field3468) {
            class205.field3468 = (float) ((double) class205.field3468 - (double) class205.field3468 / 30.0D);
            if (class205.field3468 < class7.field102) {
                class205.field3468 = class7.field102;
            }
            class3.method15(arg0 - 4789);
        }
        if (arg0 != 13676) {
            return;
        }
        if (class104.field1774 != -1 && class167.field2813 != -1) {
            int var1 = class104.field1774 - class76.field1320;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class167.field2813 - class215.field3666;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class104.field1774 = -1;
                class167.field2813 = -1;
            }
            class76.field1320 += var1;
            class215.field3666 += var2;
            class3.method15(arg0 - 4789);
        }
        field3762++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)Z", line = 91)
    public static final boolean method1622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 118)
    public static void method1623(int arg0) {
        if (arg0 < 103) {
            method1621(-45);
        }
        field3769 = null;
        field3765 = null;
        field3764 = null;
        field3768 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBZLcb;II)V", line = 132)
    public static final void method1624(int arg0, int arg1, byte arg2, boolean arg3, class267 arg4, int arg5, int arg6) {
        class235.field3968 = arg3;
        class136.field2338 = arg6;
        class147.field2556 = arg5;
        field3766++;
        class139.field2413 = 1;
        if (arg2 != 115) {
            field3764 = (class158) null;
        }
        class5.field57 = arg0;
        class76.field1318 = arg1;
        class127.field2212 = arg4;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lcb;B)V", line = 158)
    public static final void method1625(class267 arg0, byte arg1) {
        class210.field3588 = arg0.method1915(-15621, class115.field1944);
        int var2 = 115 / ((60 - arg1) / 56);
        field3761++;
        class271.field4687 = arg0.method1915(-15621, class157.field2695);
    }
}
