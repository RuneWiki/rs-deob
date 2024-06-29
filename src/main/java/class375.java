import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class375 extends class386 {

    @OriginalMember(owner = "client!taa", name = "H", descriptor = "I")
    private int field5040;

    @OriginalMember(owner = "client!taa", name = "G", descriptor = "I")
    public static int field5039 = -1;

    @OriginalMember(owner = "client!taa", name = "D", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!taa", name = "E", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!taa", name = "F", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!taa", name = "I", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!taa", name = "J", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(I)V")
    public class375(int arg0) {
        super(0, true);
        this.field5040 = 4096;
        this.field5040 = arg0;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -29441) {
            method2181(-83, -53, 99, -8, 88, -11, 94, 14);
        }
        ++field5041;
        int var8 = arg0 + -334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (-class127.field1621 + class331.field4402) * var8 / 100 + class127.field1621;
        int var10 = arg5 * var9 >> 8;
        int var11 = 16383 & -arg2 + 16384;
        int var12 = -arg4 + 16384 & 16383;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class395.field5579[var11] * -var10 >> 14;
            var15 = class395.field5582[var11] * var10 >> 14;
        }
        if (~var12 != -1) {
            var13 = class395.field5579[var12] * var15 >> 14;
            var15 = class395.field5582[var12] * var15 >> 14;
        }
        class614.field8846 = arg6 - var14;
        class627.field8995 = arg1 - var15;
        class569.field8329 = arg2;
        class377.field5071 = 0;
        class89.field1250 = arg4;
        class346.field4550 = -var13 + arg3;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIII[I)V")
    public static final void method2180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        ++field5038;
        if (arg5 < arg1 && !class326.method1894(arg1, 32)) {
            throw new IllegalArgumentException("");
        } else if (~arg6 < -1 && !class326.method1894(arg6, arg5 ^ 32)) {
            throw new IllegalArgumentException("");
        } else if (arg3 != 32993) {
            throw new IllegalArgumentException("");
        } else {
            int var8 = 0;
            int var9 = arg1 >= arg6 ? arg6 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg6 >> 1;
            int[] var12 = arg7;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg4, arg1, arg6, 0, arg3, arg2, var12, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg1 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var11 > var18; ++var18) {
                    for (int var19 = 0; var19 < var10; ++var19) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 >> 16 & 255;
                        int var24 = 255 & var20;
                        int var25 = var12[var16++];
                        int var26 = var20 >> 24 & 255;
                        int var27 = 255 & var20 >> 8;
                        int var28 = ((var21 & 16772528) >> 16) + var23;
                        int var29 = (var21 & 255) + var24;
                        int var30 = (255 & var21 >> 8) + var27;
                        int var31 = (var21 >> 24 & 255) + var26;
                        int var32 = (255 & var22 >> 24) + var31;
                        int var33 = ((var22 & 16717115) >> 16) + var28;
                        int var34 = (var22 >> 8 & 255) + var30;
                        int var35 = (var22 & 255) + var29;
                        int var36 = (var25 & 255) + var35;
                        int var37 = (255 & var25 >> 16) + var33;
                        int var38 = (var25 >> 24 & 255) + var32;
                        int var39 = ((var25 & 65294) >> 8) + var34;
                        var13[var14++] = class242.method1474(class435.method2605(var36 >> 2, 255), class242.method1474(class435.method2605(var39 << 6, 65280), class242.method1474(class435.method2605(var38, 1020) << 22, class435.method2605(var37 << 14, 16711680))));
                    }
                    var15 += arg1;
                    var16 += arg1;
                }
                var13 = var12;
                arg6 = var11;
                arg1 = var10;
                var12 = var17;
                var9 >>= 1;
                var10 >>= 1;
                ++var8;
                var11 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        int var3 = -42 / ((arg1 - 13) / 40);
        ++field5036;
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            class252.method1539(var4, 0, class599.field8643, this.field5040);
        }
        return var4;
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "()V")
    public class375() {
        this(4096);
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method2181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5042;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = -arg2 + arg7;
        if (arg4 != -1553984318) {
            field5039 = -38;
        }
        int var12 = -arg2 + arg3;
        int var13 = arg7 * arg7;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 - -var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg3 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class598.field8632 <= arg6 && arg6 <= class288.field3883) {
            int[] var39 = class678.field9722[arg6];
            int var40 = class396.method2393(class587.field8513, class221.field2866, 5890, -arg7 + arg5);
            int var41 = class396.method2393(class587.field8513, class221.field2866, 5890, arg5 + arg7);
            int var42 = class396.method2393(class587.field8513, class221.field2866, arg4 ^ -1553988672, -var11 + arg5);
            int var43 = class396.method2393(class587.field8513, class221.field2866, 5890, arg5 - -var11);
            class359.method2018(var39, var42, 118, arg0, var40);
            class359.method2018(var39, var43, 67, arg1, var42);
            class359.method2018(var39, var41, -123, arg0, var43);
        }
        while (var9 > 0) {
            boolean var44 = ~var12 <= ~var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        ++var10;
                    }
                }
                if (~var26 > -1) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    ++var10;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (~var23 > -1) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    ++var8;
                    var35 += var28;
                }
            }
            if (~var24 > -1) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                ++var8;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            --var9;
            var36 -= var27;
            var32 -= var27;
            int var45 = -var9 + arg6;
            int var46 = arg6 + var9;
            if (var46 >= class598.field8632 && ~class288.field3883 <= ~var45) {
                int var47 = class396.method2393(class587.field8513, class221.field2866, 5890, arg5 + var8);
                int var48 = class396.method2393(class587.field8513, class221.field2866, 5890, arg5 - var8);
                if (var44) {
                    int var49 = class396.method2393(class587.field8513, class221.field2866, 5890, arg5 + var10);
                    int var50 = class396.method2393(class587.field8513, class221.field2866, arg4 + 1553990208, -var10 + arg5);
                    if (var45 >= class598.field8632) {
                        int[] var51 = class678.field9722[var45];
                        class359.method2018(var51, var50, -32, arg0, var48);
                        class359.method2018(var51, var49, -41, arg1, var50);
                        class359.method2018(var51, var47, 77, arg0, var49);
                    }
                    if (var46 <= class288.field3883) {
                        int[] var52 = class678.field9722[var46];
                        class359.method2018(var52, var50, -49, arg0, var48);
                        class359.method2018(var52, var49, 87, arg1, var50);
                        class359.method2018(var52, var47, -111, arg0, var49);
                    }
                } else {
                    if (~var45 <= ~class598.field8632) {
                        class359.method2018(class678.field9722[var45], var47, -66, arg0, var48);
                    }
                    if (~var46 >= ~class288.field3883) {
                        class359.method2018(class678.field9722[var46], var47, 62, arg0, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field5037;
        if (~arg0 == -1) {
            this.field5040 = (arg2.method2229(255) << 12) / 255;
        }
        if (arg1 <= 111) {
            this.method355(-29, (byte) 18, (class389) null);
        }
    }
}
