import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class185 extends class81 {

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    private int field2251;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "I")
    private int field2250;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
    private int field2247;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    private int field2246;

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
    private int field2254;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "Luv;")
    private class367 field2244;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "[[F")
    public static float[][] field2245 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public static int field2248 = -1;

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "Lqia;")
    public static class21 field2255 = new class21();

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "Ltd;")
    private class455 field2253;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IBIII)V")
    public static final void method1040(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2241++;
        int var5 = -79 / ((-arg1 - 80) / 41);
        if (arg4 < arg3) {
            for (int var6 = arg4; var6 < arg3; var6++) {
                class300.field4036[var6][arg0] = arg2;
            }
        } else {
            for (int var7 = arg3; var7 < arg4; var7++) {
                class300.field4036[var7][arg0] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IILka;II)Loia;")
    public static final class90 method1041(int arg0, int arg1, class472 arg2, int arg3, int arg4) {
        field2242++;
        if (arg2 == null) {
            return null;
        } else {
            if (arg4 != 4) {
                field2248 = -48;
            }
            return new class90(arg1, arg0, arg3, arg2.method245(), arg2.method205(), arg2.method203(), arg2.method234(), arg2.method224(), arg2.method246(), arg2.method209());
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2240++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg5 - arg1;
        int var12 = arg3 - arg1;
        int var13 = arg5 * arg5;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        if (arg6 != -25682) {
            field2248 = -99;
        }
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        if (class759.field10576 <= arg0 && class29.field238 >= arg0) {
            int[] var38 = class300.field4036[arg0];
            int var39 = class105.method716(false, class165.field2070, class122.field1604, arg2 - arg5);
            int var40 = class105.method716(false, class165.field2070, class122.field1604, arg2 + arg5);
            int var41 = class105.method716(false, class165.field2070, class122.field1604, arg2 - var11);
            int var42 = class105.method716(false, class165.field2070, class122.field1604, arg2 + var11);
            class168.method980(arg4, var38, var39, var41, (byte) 24);
            class168.method980(arg7, var38, var41, var42, (byte) -128);
            class168.method980(arg4, var38, var42, var40, (byte) -128);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (var46 >= class759.field10576 && class29.field238 >= var45) {
                int var47 = class105.method716(false, class165.field2070, class122.field1604, arg2 + var8);
                int var48 = class105.method716(false, class165.field2070, class122.field1604, arg2 - var8);
                if (var44) {
                    int var49 = class105.method716(false, class165.field2070, class122.field1604, arg2 + var10);
                    int var50 = class105.method716(false, class165.field2070, class122.field1604, arg2 - var10);
                    if (class759.field10576 <= var45) {
                        int[] var51 = class300.field4036[var45];
                        class168.method980(arg4, var51, var48, var50, (byte) -125);
                        class168.method980(arg7, var51, var50, var49, (byte) -123);
                        class168.method980(arg4, var51, var49, var47, (byte) 47);
                    }
                    if (class29.field238 >= var46) {
                        int[] var52 = class300.field4036[var46];
                        class168.method980(arg4, var52, var48, var50, (byte) 40);
                        class168.method980(arg7, var52, var50, var49, (byte) -127);
                        class168.method980(arg4, var52, var49, var47, (byte) -123);
                    }
                } else {
                    if (var45 >= class759.field10576) {
                        class168.method980(arg4, class300.field4036[var45], var48, var47, (byte) 14);
                    }
                    if (class29.field238 >= var46) {
                        class168.method980(arg4, class300.field4036[var46], var48, var47, (byte) -125);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IB)I")
    public static final int method1043(int arg0, byte arg1) {
        field2243++;
        int var2 = 0;
        if (arg1 != 31) {
            field2248 = 28;
        }
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)V")
    public static void method1044(int arg0) {
        if (arg0 == 1187177570) {
            field2245 = null;
            field2255 = null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Ltd;")
    public final class455 method602(int arg0) {
        field2239++;
        if (this.field2253 == null) {
            class754.field10454[4] = this.field2250;
            class754.field10454[3] = this.field2246;
            class754.field10454[1] = this.field2251;
            class754.field10454[2] = this.field2247;
            class754.field10454[0] = this.field2252;
            class152 var2 = this.field2244.field636;
            class754.field10454[5] = this.field2254;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method922(97, class754.field10454[var5])) {
                    return null;
                }
                class335 var7 = var2.method925(class754.field10454[var5], -28755);
                int var8 = var7.field4524 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field4536 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class37.field377[var6] = var2.method923(class754.field10454[var6], (byte) -114, var4, 1.0F, false, var4);
            }
            this.field2253 = this.field2244.method1324(8, var3, class37.field377, var4);
        }
        int var9 = 84 % ((39 - arg0) / 57);
        return this.field2253;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)[Lhda;")
    public static final class750[] method1045(boolean arg0) {
        field2249++;
        if (arg0) {
            field2245 = null;
        }
        return new class750[] { class76.field925, class208.field2506, class291.field3849, class164.field2054, class50.field525, class268.field3558, class93.field1228, class659.field9196, class51.field535, class360.field4762 };
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Luv;IIIIII)V")
    public class185(class367 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2251 = arg2;
        this.field2250 = arg5;
        this.field2252 = arg1;
        this.field2247 = arg3;
        this.field2246 = arg4;
        this.field2254 = arg6;
        this.field2244 = arg0;
    }
}
