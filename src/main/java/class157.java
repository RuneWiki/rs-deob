import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class157 extends class129 {

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public int field2628 = 0;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field2624 = 0;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field2627 = 0;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static volatile int field2625 = 0;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "Li;")
    public static class112 field2621 = new class112(512);

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILeh;I)V")
    private final void method1075(int arg0, class101 arg1, int arg2) {
        field2620++;
        if (arg0 == arg2) {
            this.field2628 = arg1.method677(false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public static final void method1076(byte arg0) {
        field2622++;
        if (class210.field3553 || class225.field3780 == 2) {
            return;
        }
        if (arg0 >= -102) {
            method1076((byte) 39);
        }
        try {
            class94.method604(class159.field2663, "tbrefresh", 27972);
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1077(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2630++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = arg6 - arg7;
        int var11 = 0;
        int var12 = arg6 * arg6;
        int var13 = arg3 * arg3;
        int var14 = arg3 - arg7;
        int var15 = var10 * var10;
        int var16 = var14 * var14;
        int var17 = var12 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = arg3 << 1;
        int var21 = var16 << 1;
        int var22 = var14 << 1;
        int var23 = (1 - var20) * var12 + var18;
        int var24 = var13 - ((var20 - 1) * var17);
        int var25 = (1 - var22) * var15 + var21;
        int var26 = var16 - ((var22 - 1) * var19);
        int var27 = var12 << 2;
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        if (arg4 <= 2) {
            field2627 = 120;
        }
        int var31 = var18 * 3;
        int var32 = var21 * 3;
        int var33 = (var22 - 3) * var19;
        int var34 = (var20 - 3) * var17;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var29;
        if (class118.field2094 <= arg0 && class89.field1582 >= arg0) {
            int[] var38 = class167.field2735[arg0];
            int var39 = class160.method1090(arg2 - arg6, (byte) 16, class118.field2098, class126.field2222);
            int var40 = class160.method1090(arg2 + arg6, (byte) 16, class118.field2098, class126.field2222);
            int var41 = class160.method1090(arg2 - var10, (byte) 16, class118.field2098, class126.field2222);
            int var42 = class160.method1090(arg2 + var10, (byte) 16, class118.field2098, class126.field2222);
            class93.method598(-7, var41, var39, var38, arg5);
            class93.method598(-7, var42, var41, var38, arg1);
            class93.method598(-7, var40, var42, var38, arg5);
        }
        int var43 = (var14 - 1) * var30;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var31;
                    var31 += var28;
                    var24 += var35;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var24 += -var34;
            var23 += -var36;
            boolean var44 = var14 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var32;
                        var32 += var29;
                        var26 += var37;
                        var11++;
                        var37 += var29;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var37 += var29;
                    var11++;
                    var25 += var32;
                    var32 += var29;
                }
                var25 += -var43;
                var26 += -var33;
                var43 -= var30;
                var33 -= var30;
            }
            var9--;
            var34 -= var27;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (class118.field2094 <= var46 && class89.field1582 >= var45) {
                int var47 = class160.method1090(arg2 + var8, (byte) 16, class118.field2098, class126.field2222);
                int var48 = class160.method1090(arg2 - var8, (byte) 16, class118.field2098, class126.field2222);
                if (var44) {
                    int var49 = class160.method1090(arg2 + var11, (byte) 16, class118.field2098, class126.field2222);
                    int var50 = class160.method1090(arg2 - var11, (byte) 16, class118.field2098, class126.field2222);
                    if (var45 >= class118.field2094) {
                        int[] var51 = class167.field2735[var45];
                        class93.method598(-7, var50, var48, var51, arg5);
                        class93.method598(-7, var49, var50, var51, arg1);
                        class93.method598(-7, var47, var49, var51, arg5);
                    }
                    if (var46 <= class89.field1582) {
                        int[] var52 = class167.field2735[var46];
                        class93.method598(-7, var50, var48, var52, arg5);
                        class93.method598(-7, var49, var50, var52, arg1);
                        class93.method598(-7, var47, var49, var52, arg5);
                    }
                } else {
                    if (var45 >= class118.field2094) {
                        class93.method598(-7, var47, var48, class167.field2735[var45], arg5);
                    }
                    if (var46 <= class89.field1582) {
                        class93.method598(-7, var47, var48, class167.field2735[var46], arg5);
                    }
                }
            }
            var36 -= var27;
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
    public static final void method1078(int arg0) {
        field2618++;
        if (arg0 != 16961) {
            field2627 = 5;
        }
        class82.field1502.method53(true);
        class142.field2449.method53(true);
        class276.field4422.method53(true);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Leh;B)V")
    public final void method1079(class101 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method669((byte) 36);
            if (var3 == 0) {
                if (arg1 > -62) {
                    return;
                }
                field2626++;
                return;
            }
            this.method1075(2, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V")
    public static void method1080(int arg0) {
        if (arg0 < -66) {
            field2621 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2623++;
        int var6 = arg0 - arg3;
        int var7 = arg5 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class98.method622(arg1, -1, arg3, arg5, arg2);
            }
        } else if (var7 == 0) {
            class291.method1971(false, arg3, arg0, arg2, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            if (arg4 != 1686341260) {
                field2627 = -85;
            }
            int var9 = arg1 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class126.field2222) {
                var10 = (class126.field2222 * var8 >> 12) + var9;
                var11 = class126.field2222;
            } else if (class118.field2098 >= arg3) {
                var10 = arg1;
                var11 = arg3;
            } else {
                var10 = (class118.field2098 * var8 >> 12) + var9;
                var11 = class118.field2098;
            }
            if (class118.field2094 > var10) {
                var11 = (class118.field2094 - var9 << 12) / var8;
                var10 = class118.field2094;
            } else if (var10 > class89.field1582) {
                var11 = (class89.field1582 - var9 << 12) / var8;
                var10 = class89.field1582;
            }
            int var12;
            int var13;
            if (arg0 < class126.field2222) {
                var13 = class126.field2222;
                var12 = (class126.field2222 * var8 >> 12) + var9;
            } else if (arg0 <= class118.field2098) {
                var12 = arg5;
                var13 = arg0;
            } else {
                var13 = class118.field2098;
                var12 = (class118.field2098 * var8 >> 12) + var9;
            }
            if (class118.field2094 > var12) {
                var13 = (class118.field2094 - var9 << 12) / var8;
                var12 = class118.field2094;
            } else if (var12 > class89.field1582) {
                var13 = (class89.field1582 - var9 << 12) / var8;
                var12 = class89.field1582;
            }
            class220.method1460(var13, arg2, var11, 0, var10, var12);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1082(int arg0, byte[] arg1) {
        field2619++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class235.method1557(arg1, arg0, var3, 0, var2);
        return var3;
    }
}
