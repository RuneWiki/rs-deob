import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class115 extends class16 {

    @OriginalMember(owner = "client!ld", name = "Lb", descriptor = "Ls;")
    public static class261 field1926 = new class261(30);

    @OriginalMember(owner = "client!ld", name = "Qb", descriptor = "Lmh;")
    private static class128 field1931 = class22.method156(127, "Tue");

    @OriginalMember(owner = "client!ld", name = "Ub", descriptor = "Lmh;")
    private static class128 field1935 = class22.method156(123, "Sun");

    @OriginalMember(owner = "client!ld", name = "Pb", descriptor = "Lmh;")
    public static class128 field1930 = class22.method156(126, "<col=c0ff00>");

    @OriginalMember(owner = "client!ld", name = "Xb", descriptor = "Lmh;")
    private static class128 field1938 = class22.method156(124, "Mon");

    @OriginalMember(owner = "client!ld", name = "Vb", descriptor = "Lmh;")
    private static class128 field1936 = class22.method156(122, "Sat");

    @OriginalMember(owner = "client!ld", name = "cc", descriptor = "I")
    public static int field1943 = 0;

    @OriginalMember(owner = "client!ld", name = "bc", descriptor = "Lmh;")
    private static class128 field1942 = class22.method156(127, "Fri");

    @OriginalMember(owner = "client!ld", name = "ac", descriptor = "Lmh;")
    private static class128 field1941 = class22.method156(126, "Thu");

    @OriginalMember(owner = "client!ld", name = "Rb", descriptor = "Lmh;")
    public static class128 field1932 = class22.method156(125, "<)4col>");

    @OriginalMember(owner = "client!ld", name = "ec", descriptor = "I")
    public static int field1945 = 128;

    @OriginalMember(owner = "client!ld", name = "gc", descriptor = "Lmh;")
    public static class128 field1947 = class22.method156(122, "::fpson");

    @OriginalMember(owner = "client!ld", name = "fc", descriptor = "Lmh;")
    private static class128 field1946 = class22.method156(127, "Wed");

    @OriginalMember(owner = "client!ld", name = "ic", descriptor = "[Lmh;")
    public static class128[] field1949 = new class128[] { field1935, field1938, field1931, field1946, field1941, field1942, field1936 };

    @OriginalMember(owner = "client!ld", name = "Mb", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ld", name = "Nb", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ld", name = "Ob", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ld", name = "Wb", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ld", name = "Yb", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!ld", name = "hc", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ld", name = "Zb", descriptor = "Lek;")
    public static class174 field1940;

    @OriginalMember(owner = "client!ld", name = "Tb", descriptor = "Lh;")
    public class208 field1934;

    @OriginalMember(owner = "client!ld", name = "dc", descriptor = "Ldj;")
    public static class314 field1944;

    @OriginalMember(owner = "client!ld", name = "Sb", descriptor = "[I")
    public static int[] field1933;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V", line = 9)
    public static void method693(int arg0) {
        field1947 = null;
        field1926 = null;
        field1949 = null;
        field1946 = null;
        field1942 = null;
        field1930 = null;
        if (arg0 != -1) {
            return;
        }
        field1933 = null;
        field1935 = null;
        field1936 = null;
        field1944 = null;
        field1932 = null;
        field1941 = null;
        field1940 = null;
        field1931 = null;
        field1938 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)Z", line = 35)
    public final boolean method122(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field1928++;
            return this.field1934 != null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLdj;)I", line = 75)
    public static final int method694(byte arg0, class314 arg1) {
        if (arg0 > -67) {
            field1944 = (class314) null;
        }
        field1937++;
        int var2 = 0;
        if (arg1.method2157(63, class104.field1786)) {
            var2++;
        }
        if (arg1.method2157(118, class229.field3977)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()I", line = 102)
    public final int method204() {
        field1948++;
        return this.field424;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIJ)V", line = 120)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1929++;
        if (this.field1934 == null) {
            return;
        }
        class1 var11 = this.field451 != -1 && this.field463 == 0 ? class167.method1091(49, this.field451) : null;
        class1 var12 = this.field474 == -1 || this.field482 == this.field474 && var11 != null ? null : class167.method1091(-40, this.field474);
        class60 var13 = this.field1934.method1426(var11, this.field444, (byte) -127, this.field461, var12);
        if (var13 == null) {
            return;
        }
        this.field424 = var13.method204();
        class208 var14 = this.field1934;
        if (var14.field3655 != null) {
            var14 = var14.method1429((byte) -96);
        }
        if (class114.field1916 && var14.field3657) {
            class60 var15 = class103.method637(var13, this.field418, this.field445, arg0, this.field1934.field3670, this.field1934.field3693, this.field1934.field3667, this.field415, (byte) -118, var12 == null ? var11 : var12, this.field1934.field3662, var12 == null ? this.field461 : this.field444, this.field1934.field3706, this.field478);
            if (class247.field4247) {
                float var16 = class247.method1697();
                float var17 = class247.method1714();
                class247.method1688();
                class247.method1716(var16, var17 - 150.0F);
                var15.method201(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                class247.method1692();
                class247.method1716(var16, var17);
            } else {
                var15.method201(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            }
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field1934.field3661 != 0 || this.field1934.field3689 != 0) {
            int var21 = class141.field2424[arg0];
            int var22 = class141.field2411[arg0];
            short var23 = this.field1934.field3661;
            int var24 = -var23 / 2;
            int var25 = var23 / 2;
            short var26 = this.field1934.field3689;
            int var27 = var26 / 2;
            int var28 = -var26 / 2;
            int var29 = var22 * var28 - (var21 * var24) >> 16;
            int var30 = -var26 / 2;
            int var31 = var21 * var30 + var22 * var25 >> 16;
            int var32 = var21 * var28 + var22 * var24 >> 16;
            int var33 = var22 * var30 - (var21 * var25) >> 16;
            int var34 = class64.method427(this.field478 + var32, this.field418 + var29, class133.field2315, (byte) 105);
            int var35 = class64.method427(this.field478 + var31, this.field418 + var33, class133.field2315, (byte) 120);
            int var36 = var23 / 2;
            int var37 = -var23 / 2;
            int var38 = var21 * var27 + var22 * var37 >> 16;
            int var39 = var26 / 2;
            int var40 = var22 * var39 - (var21 * var36) >> 16;
            int var41 = var22 * var27 - var21 * var37 >> 16;
            int var42 = var21 * var39 + var22 * var36 >> 16;
            int var43 = var35 <= var34 ? var35 : var34;
            int var44 = class64.method427(this.field478 + var38, this.field418 + var41, class133.field2315, (byte) 124);
            int var45 = class64.method427(this.field478 + var42, this.field418 + var40, class133.field2315, (byte) 120);
            int var46 = var34 + var45;
            int var47 = var45 <= var44 ? var45 : var44;
            int var48 = var35 < var45 ? var35 : var45;
            if (var26 != 0) {
                var18 = (int) (Math.atan2((double) (var43 - var47), (double) var26) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method208(var18);
                }
            }
            if (var35 + var44 < var46) {
                var46 = var35 + var44;
            }
            int var49 = var44 > var34 ? var34 : var44;
            if (var23 != 0) {
                var19 = (int) (Math.atan2((double) (var49 - var48), (double) var23) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method181(var19);
                }
            }
            var20 = (var46 >> 1) - this.field415;
            if (var20 != 0) {
                var13.method186(0, var20, 0);
            }
        }
        class60 var50 = null;
        if (this.field416 != -1 && this.field475 != -1) {
            class133 var51 = class169.method1134(2, this.field416);
            var50 = var51.method887(this.field475, (byte) 118);
            if (var50 != null) {
                var50.method186(0, -this.field466, 0);
                if (var51.field2323) {
                    if (var18 != 0) {
                        var50.method208(var18);
                    }
                    if (var19 != 0) {
                        var50.method181(var19);
                    }
                    if (var20 != 0) {
                        var50.method186(0, var20, 0);
                    }
                }
            }
        }
        if (!class247.field4247) {
            if (var50 != null) {
                var13 = ((class29) var13).method183(var50);
            }
            if (this.field1934.field3706 == 1) {
                var13.field1123 = true;
            }
            var13.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            return;
        }
        if (this.field1934.field3706 == 1) {
            var13.field1123 = true;
        }
        var13.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field1934.field3706 == 1) {
                var50.field1123 = true;
            }
            var50.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}
