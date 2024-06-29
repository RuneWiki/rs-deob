import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class204 extends class222 {

    @OriginalMember(owner = "client!u", name = "Nb", descriptor = "Z")
    public static boolean field3436 = false;

    @OriginalMember(owner = "client!u", name = "Qb", descriptor = "Lmh;")
    public static class62 field3439 = class201.method1405(true, "::fps ");

    @OriginalMember(owner = "client!u", name = "Ob", descriptor = "Lmh;")
    public static class62 field3437 = class201.method1405(true, "sl_flags");

    @OriginalMember(owner = "client!u", name = "Rb", descriptor = "Lud;")
    public static class52 field3440 = new class52();

    @OriginalMember(owner = "client!u", name = "Lb", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!u", name = "Pb", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!u", name = "Sb", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!u", name = "Mb", descriptor = "Lb;")
    public class275 field3435;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)Lpl;", line = 4)
    public static final class268 method1423(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2720;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)Z", line = 19)
    public final boolean method1100(int arg0) {
        field3434++;
        if (arg0 != 26422) {
            this.field3435 = (class275) null;
        }
        return this.field3435 != null;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V", line = 33)
    public static void method1424(int arg0) {
        field3437 = null;
        field3440 = null;
        field3439 = null;
        if (arg0 != 23891) {
            field3439 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I", line = 60)
    public final int method278() {
        field3441++;
        return this.field3820;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIIJ)V", line = 73)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3438++;
        if (this.field3435 == null) {
            return;
        }
        class96 var11 = this.field3836 != -1 && this.field3843 == 0 ? class151.method1085(this.field3836, (byte) 111) : null;
        class96 var12 = this.field3876 == -1 || this.field3879 == this.field3876 && var11 != null ? null : class151.method1085(this.field3876, (byte) 113);
        class138 var13 = this.field3435.method1882(this.field3838, true, var12, this.field3872, var11);
        if (var13 == null) {
            return;
        }
        this.field3820 = var13.method278();
        class275 var14 = this.field3435;
        if (var14.field4720 != null) {
            var14 = var14.method1878(false);
        }
        if (class158.field2547 && var14.field4711) {
            class138 var15 = class287.method1961(this.field3819, var13, this.field3435.field4662, arg0, this.field3435.field4714, this.field3435.field4691, this.field3839, this.field3435.field4717, var12 == null ? var11 : var12, this.field3814, this.field3821, false, var12 == null ? this.field3872 : this.field3838, this.field3435.field4663);
            float var16 = class154.method1134();
            float var17 = class154.method1129();
            class154.method1106();
            class154.method1108(var16, var17 - 150.0F);
            var15.method276(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class154.method1132();
            class154.method1108(var16, var17);
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field3435.field4722 != 0 || this.field3435.field4697 != 0) {
            int var21 = class23.field254[arg0];
            int var22 = class23.field245[arg0];
            short var23 = this.field3435.field4697;
            short var24 = this.field3435.field4722;
            int var25 = -var23 / 2;
            int var26 = -var24 / 2;
            int var27 = var21 * var25 - (var22 * var26) >> 16;
            int var28 = var24 / 2;
            int var29 = var21 * var26 + var22 * var25 >> 16;
            int var30 = -var23 / 2;
            int var31 = var21 * var28 + var22 * var30 >> 16;
            int var32 = var21 * var30 - (var22 * var28) >> 16;
            int var33 = -var24 / 2;
            int var34 = class165.method1186((byte) -58, this.field3814 + var27, this.field3821 + var29, class7.field85);
            int var35 = class165.method1186((byte) -58, this.field3814 + var32, this.field3821 + var31, class7.field85);
            int var36 = var23 / 2;
            int var37 = var21 * var33 + var22 * var36 >> 16;
            int var38 = var24 / 2;
            int var39 = var21 * var36 - (var22 * var33) >> 16;
            int var40 = class165.method1186((byte) -58, this.field3814 + var39, this.field3821 - -var37, class7.field85);
            int var41 = var23 / 2;
            int var42 = var21 * var41 - (var22 * var38) >> 16;
            int var43 = var21 * var38 + var22 * var41 >> 16;
            int var44 = var34 < var35 ? var34 : var35;
            int var45 = var40 > var34 ? var34 : var40;
            int var46 = class165.method1186((byte) -58, this.field3814 + var42, this.field3821 - -var43, class7.field85);
            int var47 = var34 + var46;
            int var48 = var40 >= var46 ? var46 : var40;
            if (var47 > var35 + var40) {
                var47 = var35 + var40;
            }
            if (var23 != 0) {
                var18 = (int) (Math.atan2((double) (var44 - var48), (double) var23) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method497(var18);
                }
            }
            int var49 = var35 >= var46 ? var46 : var35;
            if (var24 != 0) {
                var19 = (int) (Math.atan2((double) (var45 - var49), (double) var24) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method487(var19);
                }
            }
            var20 = (var47 >> 1) - this.field3819;
            if (var20 != 0) {
                var13.method477(0, var20, 0);
            }
        }
        class138 var50 = null;
        if (this.field3847 != -1 && this.field3813 != -1) {
            class271 var51 = class115.method895(-89, this.field3847);
            var50 = var51.method1862(true, this.field3813);
            if (var50 != null) {
                var50.method477(0, -this.field3855, 0);
                if (var51.field4612) {
                    if (var18 != 0) {
                        var50.method497(var18);
                    }
                    if (var19 != 0) {
                        var50.method487(var19);
                    }
                    if (var20 != 0) {
                        var50.method477(0, var20, 0);
                    }
                }
            }
        }
        if (this.field3435.field4714 == 1) {
            var13.field2236 = true;
        }
        var13.method276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field3435.field4714 == 1) {
                var50.field2236 = true;
            }
            var50.method276(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}
