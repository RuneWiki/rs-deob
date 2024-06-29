import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class179 extends class272 {

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    private int field3287 = 1024;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    private int field3295 = 2048;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    private int field3298 = 3072;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "Lli;")
    private static class185 field3285 = class245.method1649("Loading world list data", -55);

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Lli;")
    public static class185 field3293 = field3285;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "[S")
    public static short[] field3284 = new short[256];

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "Lli;")
    public static class185 field3297 = class245.method1649(")1", 127);

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field3296 = 0;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Z")
    public static boolean field3286 = false;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    public static int field3300 = 0;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "Lli;")
    public static class185 field3301 = class245.method1649("document)3cookie=(R", -50);

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "[I")
    public static int[] field3292;

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class179() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
    public static void method1266(byte arg0) {
        field3284 = null;
        field3301 = null;
        if (arg0 < 3) {
            field3285 = null;
        }
        field3293 = null;
        field3297 = null;
        field3292 = null;
        field3285 = null;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        if (arg0 == 0) {
            this.field3295 = -this.field3287 + this.field3298;
            ++field3299;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lb;)V")
    public static final void method1267(class49 arg0) {
        for (int var1 = arg0.field816; var1 <= arg0.field812; ++var1) {
            for (int var2 = arg0.field796; var2 <= arg0.field793; ++var2) {
                class198 var3 = class153.field2896[arg0.field805][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3627; ++var4) {
                        if (var3.field3646[var4] == arg0) {
                            --var3.field3627;
                            for (int var5 = var4; var5 < var3.field3627; ++var5) {
                                var3.field3646[var5] = var3.field3646[var5 + 1];
                                var3.field3638[var5] = var3.field3638[var5 + 1];
                            }
                            var3.field3646[var3.field3627] = null;
                            break;
                        }
                    }
                    var3.field3647 = 0;
                    for (int var6 = 0; var6 < var3.field3627; ++var6) {
                        var3.field3647 |= var3.field3638[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lmb;I)V")
    public static final void method1268(class86 arg0, int arg1) {
        class15.field265 = arg0;
        if (arg1 < 98) {
            method1268((class86) null, 126);
        }
        ++field3294;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field3290;
        int var3 = 18 / ((-60 - arg1) / 45);
        int[][] var4 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int[][] var5 = this.method1860(arg0, 3, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; ~var12 > ~class246.field4385; ++var12) {
                var9[var12] = (var6[var12] * this.field3295 >> 12) + this.field3287;
                var11[var12] = (var7[var12] * this.field3295 >> 12) + this.field3287;
                var10[var12] = (var8[var12] * this.field3295 >> 12) + this.field3287;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = 107 / ((-21 - arg1) / 55);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field4832 = arg0.method867(false) == 1;
                }
            } else {
                this.field3298 = arg0.method827(255);
            }
        } else {
            this.field3287 = arg0.method827(255);
        }
        ++field3291;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3289;
        int var8 = 0;
        int var9 = arg0;
        int var10 = arg2 - arg7;
        int var11 = arg4;
        int var12 = -arg7 + arg0;
        int var13 = arg2 * arg2;
        int var14 = var10 * var10;
        int var15 = arg0 * arg0;
        int var16 = var12 * var12;
        int var17 = var15 << 1;
        int var18 = arg0 << 1;
        int var19 = var16 << 1;
        int var20 = var13 << 1;
        int var21 = var12 << 1;
        int var22 = var14 << 1;
        int var23 = var15 - (var18 + -1) * var20;
        int var24 = (-var21 + 1) * var14 - -var19;
        int var25 = var16 - (var21 + -1) * var22;
        int var26 = (1 - var18) * var13 + var17;
        int var27 = var15 << 2;
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var14 << 2;
        int var31 = var17 * 3;
        int var32 = var19 * 3;
        int var33 = (var18 + -3) * var20;
        int var34 = var27;
        int var35 = (var21 - 3) * var22;
        int var36 = (arg0 + -1) * var28;
        int var37 = var29;
        int var38 = (var12 + -1) * var30;
        if (arg6 >= class216.field3964 && class113.field2040 >= arg6) {
            int[] var39 = class145.field2757[arg6];
            int var40 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg1 - arg2);
            int var41 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg1 + arg2);
            int var42 = class42.method260(class66.field1163, class207.field3810, (byte) 98, -var10 + arg1);
            int var43 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg1 + var10);
            class157.method1116(arg3, var40, var42, var39, -75);
            class157.method1116(arg5, var42, var43, var39, -91);
            class157.method1116(arg3, var43, var41, var39, -80);
        }
        while (~var9 < -1) {
            if (~var26 > -1) {
                while (var26 < 0) {
                    ++var8;
                    var26 += var31;
                    var31 += var27;
                    var23 += var34;
                    var34 += var27;
                }
            }
            if (~var23 > -1) {
                ++var8;
                var26 += var31;
                var23 += var34;
                var34 += var27;
                var31 += var27;
            }
            var23 += -var33;
            var26 += -var36;
            var36 -= var28;
            var33 -= var28;
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var25 += var37;
                        var24 += var32;
                        ++var11;
                        var37 += var29;
                        var32 += var29;
                    }
                }
                if (var25 < 0) {
                    var24 += var32;
                    var32 += var29;
                    var25 += var37;
                    ++var11;
                    var37 += var29;
                }
                var24 += -var38;
                var25 += -var35;
                var38 -= var30;
                var35 -= var30;
            }
            --var9;
            int var45 = -var9 + arg6;
            int var46 = arg6 - -var9;
            if (~var46 <= ~class216.field3964 && var45 <= class113.field2040) {
                int var47 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg1 - -var8);
                int var48 = class42.method260(class66.field1163, class207.field3810, (byte) 98, -var8 + arg1);
                if (!var44) {
                    if (~var45 <= ~class216.field3964) {
                        class157.method1116(arg3, var48, var47, class145.field2757[var45], -90);
                    }
                    if (~class113.field2040 <= ~var46) {
                        class157.method1116(arg3, var48, var47, class145.field2757[var46], arg4 + -71);
                    }
                } else {
                    int var49 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg1 + var11);
                    int var50 = class42.method260(class66.field1163, class207.field3810, (byte) 98, -var11 + arg1);
                    if (~var45 <= ~class216.field3964) {
                        int[] var51 = class145.field2757[var45];
                        class157.method1116(arg3, var48, var50, var51, -49);
                        class157.method1116(arg5, var50, var49, var51, -58);
                        class157.method1116(arg3, var49, var47, var51, arg4 ^ -81);
                    }
                    if (~var46 >= ~class113.field2040) {
                        int[] var52 = class145.field2757[var46];
                        class157.method1116(arg3, var48, var50, var52, -82);
                        class157.method1116(arg5, var50, var49, var52, -37);
                        class157.method1116(arg3, var49, var47, var52, arg4 + -94);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3288;
        int[] var3 = super.field4819.method1632(arg1 ^ arg1, arg0);
        if (super.field4819.field4294) {
            int[] var4 = this.method1866(arg0, 0, 74);
            for (int var5 = 0; var5 < class246.field4385; ++var5) {
                var3[var5] = this.field3287 - -(var4[var5] * this.field3295 >> 12);
            }
        }
        return var3;
    }
}
