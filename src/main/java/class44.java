import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class44 extends class119 {

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    private int field741;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "[I")
    public static int[] field739 = new int[2];

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "Ltc;")
    public static class73 field744;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[Lem;")
    public static class627[] field747;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method459(int arg0) {
        int var1 = 99 / ((arg0 - 7) / 36);
        field747 = null;
        field739 = null;
        field744 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIZ)V")
    public final void method460(int arg0, int arg1, boolean arg2) {
        ++field749;
        int var4 = this.field748 * arg1 >> 12;
        int var5 = this.field738 * arg0 >> 12;
        int var6 = this.field746 * arg1 >> 12;
        int var7 = this.field745 * arg0 >> 12;
        int var8 = this.field743 * arg1 >> 12;
        if (arg2) {
            this.field743 = 99;
        }
        int var9 = this.field737 * arg0 >> 12;
        int var10 = this.field741 * arg1 >> 12;
        int var11 = this.field742 * arg0 >> 12;
        class614.method3504((byte) -30, var7, super.field1832, var6, var10, var5, var9, var11, var8, var4);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field741 = arg6;
        this.field746 = arg2;
        this.field745 = arg3;
        this.field737 = arg5;
        this.field743 = arg4;
        this.field742 = arg7;
        this.field738 = arg1;
        this.field748 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lda;)V")
    public static final void method461(class400 arg0) {
        class35.field332 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method462(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field751;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = -arg4 + arg0;
        int var12 = -arg4 + arg7;
        int var13 = arg0 * arg0;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
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
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = 15 % ((arg2 - 44) / 45);
        int var36 = var28;
        int var37 = (arg7 + -1) * var27;
        int var38 = var30;
        if (class76.field1126 <= arg1 && ~class461.field6699 <= ~arg1) {
            int[] var39 = class77.field1131[arg1];
            int var40 = class487.method2955(class184.field3102, class657.field9347, (byte) -103, -arg0 + arg5);
            int var41 = class487.method2955(class184.field3102, class657.field9347, (byte) -84, arg0 + arg5);
            int var42 = class487.method2955(class184.field3102, class657.field9347, (byte) -75, -var11 + arg5);
            int var43 = class487.method2955(class184.field3102, class657.field9347, (byte) 44, arg5 + var11);
            class608.method3484(var39, var40, -7, arg6, var42);
            class608.method3484(var39, var42, -7, arg3, var43);
            class608.method3484(var39, var43, -7, arg6, var41);
        }
        int var44 = (var12 + -1) * var29;
        while (~var9 < -1) {
            boolean var45 = ~var12 <= ~var9;
            if (var45) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var26 += var38;
                        var25 += var33;
                        var38 += var30;
                        ++var10;
                        var33 += var30;
                    }
                }
                if (~var26 > -1) {
                    var26 += var38;
                    var25 += var33;
                    ++var10;
                    var38 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var44;
                var44 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (~var23 > -1) {
                    var23 += var31;
                    var24 += var36;
                    var36 += var28;
                    var31 += var28;
                    ++var8;
                }
            }
            if (~var24 > -1) {
                var24 += var36;
                var23 += var31;
                var31 += var28;
                var36 += var28;
                ++var8;
            }
            var24 += -var32;
            var23 += -var37;
            --var9;
            var32 -= var27;
            var37 -= var27;
            int var46 = -var9 + arg1;
            int var47 = arg1 + var9;
            if (class76.field1126 <= var47 && var46 <= class461.field6699) {
                int var48 = class487.method2955(class184.field3102, class657.field9347, (byte) -116, arg5 + var8);
                int var49 = class487.method2955(class184.field3102, class657.field9347, (byte) -119, -var8 + arg5);
                if (var45) {
                    int var50 = class487.method2955(class184.field3102, class657.field9347, (byte) -119, arg5 + var10);
                    int var51 = class487.method2955(class184.field3102, class657.field9347, (byte) -127, -var10 + arg5);
                    if (~var46 <= ~class76.field1126) {
                        int[] var52 = class77.field1131[var46];
                        class608.method3484(var52, var49, -7, arg6, var51);
                        class608.method3484(var52, var51, -7, arg3, var50);
                        class608.method3484(var52, var50, -7, arg6, var48);
                    }
                    if (~var47 >= ~class461.field6699) {
                        int[] var53 = class77.field1131[var47];
                        class608.method3484(var53, var49, -7, arg6, var51);
                        class608.method3484(var53, var51, -7, arg3, var50);
                        class608.method3484(var53, var50, -7, arg6, var48);
                    }
                } else {
                    if (var46 >= class76.field1126) {
                        class608.method3484(class77.field1131[var46], var49, -7, arg6, var48);
                    }
                    if (var47 <= class461.field6699) {
                        class608.method3484(class77.field1131[var47], var49, -7, arg6, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZII)V")
    public final void method463(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            ++field740;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(III)Z")
    public static final boolean method464(int arg0, int arg1, int arg2) {
        if (arg0 != 2048) {
            field739 = null;
        }
        ++field752;
        return class339.method2163(arg2, arg1, true) | (arg2 & 2048) != 0 || class496.method3008(arg1, arg0 ^ 47104, arg2);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
    public final void method465(int arg0, int arg1, int arg2) {
        ++field750;
        if (arg1 != 2) {
            this.field742 = -46;
        }
    }
}
