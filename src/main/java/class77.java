import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class77 extends class116 implements class535 {

    @OriginalMember(owner = "client!naa", name = "B", descriptor = "Lbja;")
    private class34 field875;

    @OriginalMember(owner = "client!naa", name = "G", descriptor = "J")
    public static long field880 = 1L;

    @OriginalMember(owner = "client!naa", name = "D", descriptor = "D")
    public static double field877;

    @OriginalMember(owner = "client!naa", name = "x", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!naa", name = "y", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!naa", name = "C", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!naa", name = "E", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!naa", name = "H", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!naa", name = "I", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field879;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = -arg6 + arg0;
        int var12 = arg2 - arg6;
        int var13 = arg0 * arg0;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = 114 / ((arg7 - 29) / 39);
        int var33 = (var21 - 3) * var18;
        int var34 = var19 * 3;
        int var35 = (var22 + -3) * var20;
        int var36 = var28;
        int var37 = (arg2 + -1) * var27;
        int var38 = var30;
        int var39 = (var12 + -1) * var29;
        if (~class734.field10153 >= ~arg4 && class407.field5535 >= arg4) {
            int[] var40 = class746.field10330[arg4];
            int var41 = class527.method3176(-arg0 + arg1, class463.field6533, class618.field8645, -2);
            int var42 = class527.method3176(arg1 - -arg0, class463.field6533, class618.field8645, -2);
            int var43 = class527.method3176(-var11 + arg1, class463.field6533, class618.field8645, -2);
            int var44 = class527.method3176(arg1 + var11, class463.field6533, class618.field8645, -2);
            class434.method2601(var40, var41, arg3, (byte) -62, var43);
            class434.method2601(var40, var43, arg5, (byte) -62, var44);
            class434.method2601(var40, var44, arg3, (byte) -62, var42);
        }
        while (~var9 < -1) {
            boolean var45 = var9 <= var12;
            if (~var23 > -1) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var36;
                    ++var8;
                    var36 += var28;
                    var31 += var28;
                }
            }
            if (var45) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var26 += var38;
                        var25 += var34;
                        ++var10;
                        var34 += var30;
                        var38 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var34;
                    var26 += var38;
                    ++var10;
                    var34 += var30;
                    var38 += var30;
                }
                var25 += -var39;
                var26 += -var35;
                var35 -= var29;
                var39 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var36;
                var31 += var28;
                var36 += var28;
                ++var8;
            }
            var24 += -var33;
            var23 += -var37;
            --var9;
            var37 -= var27;
            var33 -= var27;
            int var46 = -var9 + arg4;
            int var47 = arg4 + var9;
            if (~var47 <= ~class734.field10153 && var46 <= class407.field5535) {
                int var48 = class527.method3176(arg1 + var8, class463.field6533, class618.field8645, -2);
                int var49 = class527.method3176(-var8 + arg1, class463.field6533, class618.field8645, -2);
                if (!var45) {
                    if (~class734.field10153 >= ~var46) {
                        class434.method2601(class746.field10330[var46], var49, arg3, (byte) -62, var48);
                    }
                    if (var47 <= class407.field5535) {
                        class434.method2601(class746.field10330[var47], var49, arg3, (byte) -62, var48);
                    }
                } else {
                    int var50 = class527.method3176(arg1 + var10, class463.field6533, class618.field8645, -2);
                    int var51 = class527.method3176(-var10 + arg1, class463.field6533, class618.field8645, -2);
                    if (~var46 <= ~class734.field10153) {
                        int[] var52 = class746.field10330[var46];
                        class434.method2601(var52, var49, arg3, (byte) -62, var51);
                        class434.method2601(var52, var51, arg5, (byte) -62, var50);
                        class434.method2601(var52, var50, arg3, (byte) -62, var48);
                    }
                    if (var47 <= class407.field5535) {
                        int[] var53 = class746.field10330[var47];
                        class434.method2601(var53, var49, arg3, (byte) -62, var51);
                        class434.method2601(var53, var51, arg5, (byte) -62, var50);
                        class434.method2601(var53, var50, arg3, (byte) -62, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)I")
    public final int method600(int arg0) {
        int var2 = -65 % ((arg0 - -54) / 56);
        ++field873;
        return super.method600(-126);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)Z")
    public final boolean method601(int arg0) {
        ++field872;
        if (arg0 >= -49) {
            this.method604(119, -111);
        }
        return super.method868((byte) 75, super.field1766.field7657);
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V")
    public final void method602(byte arg0) {
        super.method602(arg0);
        ++field882;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lko;Lbja;Z)V")
    public class77(class529 arg0, class34 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field875 = arg1;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)Lbja;")
    public final class34 method603(byte arg0) {
        ++field876;
        return arg0 >= -65 ? null : this.field875;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)V")
    public final void method604(int arg0, int arg1) {
        if (arg1 > 113) {
            ++field871;
            super.method604(this.field875.field453 * arg0, 116);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method605(byte arg0, boolean arg1) {
        int var3 = 106 / ((31 - arg0) / 53);
        ++field881;
        return super.method869(arg1, super.field1766.field7657, (byte) -3);
    }
}
