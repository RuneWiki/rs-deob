import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class121 extends class124 {

    @OriginalMember(owner = "client!la", name = "Gb", descriptor = "Ldj;")
    public static class44 field2151 = class89.method650(255, "mod_icons");

    @OriginalMember(owner = "client!la", name = "Hb", descriptor = "Ldj;")
    public static class44 field2152 = class89.method650(255, "leuchten3:");

    @OriginalMember(owner = "client!la", name = "Jb", descriptor = "I")
    public static volatile int field2154 = 0;

    @OriginalMember(owner = "client!la", name = "Fb", descriptor = "Ldj;")
    public static class44 field2150 = class89.method650(255, "::clientdrop");

    @OriginalMember(owner = "client!la", name = "Eb", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!la", name = "Ib", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!la", name = "Kb", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!la", name = "Mb", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!la", name = "Lb", descriptor = "Ltb;")
    public class202 field2156;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        ++field2153;
        if (this.field2156 == null) {
            return false;
        } else {
            if (arg0 != 2047) {
                field2154 = -121;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)V")
    public static void method834(int arg0) {
        field2151 = null;
        if (arg0 != -1206903440) {
            method834(102);
        }
        field2152 = null;
        field2150 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2155;
        if (this.field2156 != null) {
            class204 var11 = ~super.field2243 != 0 && ~super.field2222 == -1 ? class94.method672(super.field2243, 107) : null;
            class204 var12 = super.field2264 == -1 || super.field2264 == super.field2196 && var11 != null ? null : class94.method672(super.field2264, -105);
            class127 var13 = this.field2156.method1308(-1, super.field2249, var11, super.field2252, var12);
            if (var13 != null) {
                int var14 = 0;
                int var15 = 0;
                super.field2263 = var13.method67();
                int var16 = 0;
                if (this.field2156.field3626 != 0 && ~this.field2156.field3627 != -1) {
                    int var17 = class206.field3684[arg0];
                    int var18 = class206.field3700[arg0];
                    short var19 = this.field2156.field3627;
                    short var20 = this.field2156.field3626;
                    int var21 = -var20 / 2;
                    int var22 = -var19 / 2;
                    int var23 = var20 / 2;
                    int var24 = -var19 / 2;
                    int var25 = var17 * var22 + var18 * var21 >> 16;
                    int var26 = var17 * var24 + var18 * var23 >> 16;
                    int var27 = var18 * var24 + -(var17 * var23) >> 16;
                    int var28 = var18 * var22 + -(var17 * var21) >> 16;
                    int var29 = class40.method278(super.field2195 + var28, class194.field3403, super.field2260 + var25, (byte) 101);
                    int var30 = class40.method278(super.field2195 + var27, class194.field3403, super.field2260 - -var26, (byte) 101);
                    int var31 = -var20 / 2;
                    int var32 = var19 / 2;
                    int var33 = var18 * var32 + -(var17 * var31) >> 16;
                    int var34 = var20 / 2;
                    int var35 = var19 / 2;
                    int var36 = var17 * var35 - -(var18 * var34) >> 16;
                    int var37 = var17 * var32 + var18 * var31 >> 16;
                    int var38 = class40.method278(super.field2195 + var33, class194.field3403, super.field2260 - -var37, (byte) 101);
                    int var39 = var18 * var35 + -(var17 * var34) >> 16;
                    int var40 = var30 <= var29 ? var30 : var29;
                    int var41 = class40.method278(super.field2195 + var39, class194.field3403, super.field2260 + var36, (byte) 101);
                    int var42 = var29 - -var41;
                    int var43 = ~var38 < ~var29 ? var29 : var38;
                    int var44 = ~var38 <= ~var41 ? var41 : var38;
                    var14 = (int) (325.95D * Math.atan2((double) (var40 - var44), (double) var19)) & 2047;
                    if (var14 != 0) {
                        var13.method43(var14);
                    }
                    if (~(var30 - -var38) > ~var42) {
                        var42 = var30 - -var38;
                    }
                    int var45 = ~var30 <= ~var41 ? var41 : var30;
                    var15 = (int) (325.95D * Math.atan2((double) (-var45 + var43), (double) var20)) & 2047;
                    if (var15 != 0) {
                        var13.method54(var15);
                    }
                    var16 = (var42 >> 1) + -super.field2206;
                    if (~var16 != -1) {
                        var13.method62(0, var16, 0);
                    }
                }
                class127 var46 = null;
                if (super.field2205 != -1 && ~super.field2221 != 0) {
                    class13 var47 = class79.method606(super.field2205, -1830);
                    var46 = var47.method117(false, super.field2221);
                    if (var46 != null) {
                        var46.method62(0, -super.field2209, 0);
                        if (var47.field255) {
                            if (~var14 != -1) {
                                var46.method43(var14);
                            }
                            if (~var15 != -1) {
                                var46.method54(var15);
                            }
                            if (var16 != 0) {
                                var46.method62(0, var16, 0);
                            }
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class6) var13).method57(var46);
                }
                if (this.field2156.field3620 == 1) {
                    var13.field2274 = true;
                }
                var13.method42(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
    public final int method67() {
        ++field2149;
        return super.field2263;
    }
}
