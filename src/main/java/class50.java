import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class50 extends class268 {

    @OriginalMember(owner = "client!ie", name = "Mb", descriptor = "I")
    public static int field763 = 0;

    @OriginalMember(owner = "client!ie", name = "Nb", descriptor = "Lok;")
    public static class41 field764 = class137.method956("_labels", 45);

    @OriginalMember(owner = "client!ie", name = "Ob", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!ie", name = "Pb", descriptor = "[Llb;")
    public static class112[] field766 = new class112[2048];

    @OriginalMember(owner = "client!ie", name = "Ib", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ie", name = "Jb", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ie", name = "Kb", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ie", name = "Lb", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ie", name = "Hb", descriptor = "Lti;")
    public class147 field758;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()I", line = 7)
    public final int method125() {
        field759++;
        return this.field4337;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIJ)V", line = 31)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field761++;
        if (this.field758 == null) {
            return;
        }
        class205 var11 = this.field4300 != -1 && this.field4292 == 0 ? class285.method2000(this.field4300, 4442) : null;
        class205 var12 = this.field4333 == -1 || this.field4333 == this.field4321 && var11 != null ? null : class285.method2000(this.field4333, 4442);
        class287 var13 = this.field758.method1017(var11, var12, this.field4334, (byte) 34, this.field4338);
        if (var13 == null) {
            return;
        }
        this.field4337 = var13.method125();
        class147 var14 = this.field758;
        if (var14.field2284 != null) {
            var14 = var14.method1015(-1);
        }
        if (class46.field722 && var14.field2256) {
            class287 var15 = class110.method745(this.field758.field2244, this.field758.field2257, this.field758.field2271, this.field758.field2274, var12 == null ? this.field4338 : this.field4334, arg0, var13, this.field4280, var12 == null ? var11 : var12, 768, this.field4307, this.field4331, this.field4311, this.field758.field2251);
            if (class166.field2625) {
                float var16 = class166.method1165();
                float var17 = class166.method1187();
                class166.method1184();
                class166.method1175(var16, var17 - 150.0F);
                var15.method117(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                class166.method1172();
                class166.method1175(var16, var17);
            } else {
                var15.method117(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            }
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field758.field2243 != 0 || this.field758.field2276 != 0) {
            int var21 = class31.field455[arg0];
            int var22 = class31.field450[arg0];
            short var23 = this.field758.field2276;
            short var24 = this.field758.field2243;
            int var25 = -var24 / 2;
            int var26 = -var23 / 2;
            int var27 = var21 * var25 + var22 * var26 >> 16;
            int var28 = var21 * var26 - (var22 * var25) >> 16;
            int var29 = class140.method983((byte) 69, class55.field807, this.field4280 + var27, this.field4311 + var28);
            int var30 = -var23 / 2;
            int var31 = var24 / 2;
            int var32 = var21 * var30 - (var22 * var31) >> 16;
            int var33 = var21 * var31 + var22 * var30 >> 16;
            int var34 = class140.method983((byte) -92, class55.field807, this.field4280 + var33, this.field4311 + var32);
            int var35 = var23 / 2;
            int var36 = -var24 / 2;
            int var37 = var21 * var36 + var22 * var35 >> 16;
            int var38 = var21 * var35 - (var22 * var36) >> 16;
            int var39 = var24 / 2;
            int var40 = var23 / 2;
            int var41 = class140.method983((byte) -96, class55.field807, this.field4280 + var37, this.field4311 + var38);
            int var42 = var21 * var39 + var22 * var40 >> 16;
            int var43 = var21 * var40 - (var22 * var39) >> 16;
            int var44 = class140.method983((byte) 102, class55.field807, this.field4280 + var42, this.field4311 + var43);
            int var45 = var29 + var44;
            if (var34 + var41 < var45) {
                var45 = var34 + var41;
            }
            int var46 = var29 < var34 ? var29 : var34;
            int var47 = var44 <= var41 ? var44 : var41;
            int var48 = var34 >= var44 ? var44 : var34;
            if (var23 != 0) {
                var19 = (int) (Math.atan2((double) (var46 - var47), (double) var23) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method97(var19);
                }
            }
            int var49 = var29 >= var41 ? var41 : var29;
            if (var24 != 0) {
                var20 = (int) (Math.atan2((double) (var49 - var48), (double) var24) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var13.method110(var20);
                }
            }
            var18 = (var45 >> 1) - this.field4307;
            if (var18 != 0) {
                var13.method105(0, var18, 0);
            }
        }
        class287 var50 = null;
        if (this.field4289 != -1 && this.field4320 != -1) {
            class222 var51 = class5.method15(this.field4289, false);
            var50 = var51.method1589(-79, this.field4320);
            if (var50 != null) {
                var50.method105(0, -this.field4287, 0);
                if (var51.field3529) {
                    if (var19 != 0) {
                        var50.method97(var19);
                    }
                    if (var20 != 0) {
                        var50.method110(var20);
                    }
                    if (var18 != 0) {
                        var50.method105(0, var18, 0);
                    }
                }
            }
        }
        if (!class166.field2625) {
            if (var50 != null) {
                var13 = ((class19) var13).method129(var50);
            }
            if (this.field758.field2251 == 1) {
                var13.field4660 = true;
            }
            var13.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            return;
        }
        if (this.field758.field2251 == 1) {
            var13.field4660 = true;
        }
        var13.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field758.field2251 == 1) {
                var50.field4660 = true;
            }
            var50.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)Z", line = 242)
    public final boolean method351(boolean arg0) {
        field762++;
        if (arg0) {
            return this.field758 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V", line = 257)
    public static void method352(byte arg0) {
        field764 = null;
        field766 = null;
        int var1 = 50 / ((2 - arg0) / 61);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIILth;IJ)Z", line = 266)
    public static final boolean method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class126 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class314.method2174(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
