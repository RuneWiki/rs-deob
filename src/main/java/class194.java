import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class194 extends class264 {

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "Z")
    private static boolean field2714 = false;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    private int field2709;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    private int field2712;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "I")
    private int field2716;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
    private static int field2717;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    private static int field2724;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    private static int field2726;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "I")
    private int field2728;

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
    private int field2731;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!bs", name = "R", descriptor = "I")
    private static int field2736;

    @OriginalMember(owner = "client!bs", name = "W", descriptor = "I")
    private int field2741;

    @OriginalMember(owner = "client!bs", name = "X", descriptor = "I")
    private int field2742;

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "Z")
    private boolean field2727;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "Z")
    private boolean field2733;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "[B")
    private static byte[] field2719;

    @OriginalMember(owner = "client!bs", name = "V", descriptor = "[B")
    private byte[] field2740;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "[F")
    private static float[] field2715;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "[F")
    private static float[] field2720;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "[F")
    private static float[] field2722;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "[F")
    private static float[] field2729;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "[F")
    private static float[] field2730;

    @OriginalMember(owner = "client!bs", name = "Q", descriptor = "[F")
    private static float[] field2735;

    @OriginalMember(owner = "client!bs", name = "T", descriptor = "[F")
    private static float[] field2738;

    @OriginalMember(owner = "client!bs", name = "U", descriptor = "[F")
    private float[] field2739;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "[I")
    private static int[] field2713;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "[I")
    private static int[] field2725;

    @OriginalMember(owner = "client!bs", name = "S", descriptor = "[I")
    private static int[] field2737;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "[Lhq;")
    private static class181[] field2718;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "[Lib;")
    private static class255[] field2710;

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "[Lo;")
    public static class405[] field2723;

    @OriginalMember(owner = "client!bs", name = "O", descriptor = "[Lqc;")
    private static class98[] field2734;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "[Z")
    private static boolean[] field2711;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "[[B")
    private byte[][] field2721;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)[F")
    private final float[] method1341(int arg0) {
        method1351(this.field2721[arg0], 0);
        method1342();
        int var2 = method1349(class446.method2749((byte) -19, field2737.length - 1));
        boolean var3 = field2711[var2];
        int var4 = var3 ? field2736 : field2717;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1342() != 0;
            var6 = method1342() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2717 >> 2);
            var9 = (field2717 >> 2) + (var4 >> 2);
            var10 = field2717 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2717 >> 2);
            var12 = (field2717 >> 2) + (var4 - (var4 >> 2));
            var13 = field2717 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class181 var14 = field2718[field2737[var2]];
        int var15 = var14.field2558;
        int var16 = var14.field2559[var15];
        boolean var17 = !field2734[var16].method648();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2557; var19++) {
            class255 var95 = field2710[var14.field2556[var19]];
            float[] var96 = field2720;
            var95.method1706(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2558;
            int var21 = var14.field2559[var20];
            field2734[var21].method652(field2720, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2720[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2720;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2735 : field2715;
            float[] var30 = var3 ? field2729 : field2730;
            float[] var31 = var3 ? field2722 : field2738;
            int[] var32 = var3 ? field2725 : field2713;
            for (int var33 = 0; var33 < var24; var33++) {
                float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
                float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
                float var93 = var29[var33 * 2];
                float var94 = var29[var33 * 2 + 1];
                var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
                var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
            }
            for (int var34 = 0; var34 < var25; var34++) {
                float var85 = var26[var34 * 4 + var23 + 3];
                float var86 = var26[var34 * 4 + var23 + 1];
                float var87 = var26[var34 * 4 + 3];
                float var88 = var26[var34 * 4 + 1];
                var26[var34 * 4 + var23 + 3] = var85 + var87;
                var26[var34 * 4 + var23 + 1] = var86 + var88;
                float var89 = var29[var23 - var34 * 4 - 4];
                float var90 = var29[var23 - var34 * 4 - 3];
                var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
                var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
            }
            int var35 = class446.method2749((byte) -19, var4 - 1);
            for (int var36 = 0; var36 < var35 - 3; var36++) {
                int var72 = var4 >> var36 + 2;
                int var73 = 0x8 << var36;
                for (int var74 = 0; var74 < 0x2 << var36; var74++) {
                    int var75 = var4 - var72 * 2 * var74;
                    int var76 = var4 - (var74 * 2 + 1) * var72;
                    for (int var77 = 0; var77 < var4 >> var36 + 4; var77++) {
                        int var78 = var77 * 4;
                        float var79 = var26[var75 - var78 - 1];
                        float var80 = var26[var75 - var78 - 3];
                        float var81 = var26[var76 - var78 - 1];
                        float var82 = var26[var76 - var78 - 3];
                        var26[var75 - var78 - 1] = var79 + var81;
                        var26[var75 - var78 - 3] = var80 + var82;
                        float var83 = var29[var73 * var77];
                        float var84 = var29[var73 * var77 + 1];
                        var26[var76 - var78 - 1] = (var79 - var81) * var83 - (var80 - var82) * var84;
                        var26[var76 - var78 - 3] = (var79 - var81) * var84 + (var80 - var82) * var83;
                    }
                }
            }
            for (int var37 = 1; var37 < var25 - 1; var37++) {
                int var65 = var32[var37];
                if (var37 < var65) {
                    int var66 = var37 * 8;
                    int var67 = var65 * 8;
                    float var68 = var26[var66 + 1];
                    var26[var66 + 1] = var26[var67 + 1];
                    var26[var67 + 1] = var68;
                    float var69 = var26[var66 + 3];
                    var26[var66 + 3] = var26[var67 + 3];
                    var26[var67 + 3] = var69;
                    float var70 = var26[var66 + 5];
                    var26[var66 + 5] = var26[var67 + 5];
                    var26[var67 + 5] = var70;
                    float var71 = var26[var66 + 7];
                    var26[var66 + 7] = var26[var67 + 7];
                    var26[var67 + 7] = var71;
                }
            }
            for (int var38 = 0; var38 < var23; var38++) {
                var26[var38] = var26[var38 * 2 + 1];
            }
            for (int var39 = 0; var39 < var25; var39++) {
                var26[var4 - var39 * 2 - 1] = var26[var39 * 4];
                var26[var4 - var39 * 2 - 2] = var26[var39 * 4 + 1];
                var26[var4 - var24 - var39 * 2 - 1] = var26[var39 * 4 + 2];
                var26[var4 - var24 - var39 * 2 - 2] = var26[var39 * 4 + 3];
            }
            for (int var40 = 0; var40 < var25; var40++) {
                float var57 = var31[var40 * 2];
                float var58 = var31[var40 * 2 + 1];
                float var59 = var26[var40 * 2 + var23];
                float var60 = var26[var40 * 2 + var23 + 1];
                float var61 = var26[var4 - var40 * 2 - 2];
                float var62 = var26[var4 - var40 * 2 - 1];
                float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
                var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
                var26[var4 - var40 * 2 - 2] = (var59 + var61 - var63) * 0.5F;
                float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
                var26[var40 * 2 + var23 + 1] = (var60 + var64 - var62) * 0.5F;
                var26[var4 - var40 * 2 - 1] = (var62 + var64 - var60) * 0.5F;
            }
            for (int var41 = 0; var41 < var24; var41++) {
                var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + var23 + 1];
                var26[var23 - var41 - 1] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + var23 + 1];
            }
            for (int var42 = 0; var42 < var24; var42++) {
                var26[var4 + var42 - var24] = -var26[var42];
            }
            for (int var43 = 0; var43 < var24; var43++) {
                var26[var43] = var26[var24 + var43];
            }
            for (int var44 = 0; var44 < var24; var44++) {
                var26[var24 + var44] = -var26[var24 - var44 - 1];
            }
            for (int var45 = 0; var45 < var24; var45++) {
                var26[var23 + var45] = var26[var4 - var45 - 1];
            }
            for (int var46 = var8; var46 < var9; var46++) {
                float var56 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field2720[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2720[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2731 > 0) {
            int var49 = this.field2731 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2727) {
                for (int var50 = 0; var50 < this.field2728; var50++) {
                    int var51 = (this.field2731 >> 1) + var50;
                    var48[var50] += this.field2739[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2720[var52];
                }
            }
        }
        float[] var54 = this.field2739;
        this.field2739 = field2720;
        field2720 = var54;
        this.field2731 = var4;
        this.field2728 = var12 - (var4 >> 1);
        this.field2727 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "()I")
    public static final int method1342() {
        int var0 = field2719[field2726] >> field2724 & 0x1;
        field2724++;
        field2726 += field2724 >> 3;
        field2724 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([B)V")
    private static final void method1343(byte[] arg0) {
        method1351(arg0, 0);
        field2717 = 0x1 << method1349(4);
        field2736 = 0x1 << method1349(4);
        field2720 = new float[field2736];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2717 : field2736;
            int var15 = var14 >> 1;
            int var16 = var14 >> 2;
            int var17 = var14 >> 3;
            float[] var18 = new float[var15];
            for (int var19 = 0; var19 < var16; var19++) {
                var18[var19 * 2] = (float) Math.cos((double) (var19 * 4) * 3.141592653589793D / (double) var14);
                var18[var19 * 2 + 1] = -((float) Math.sin((double) (var19 * 4) * 3.141592653589793D / (double) var14));
            }
            float[] var20 = new float[var15];
            for (int var21 = 0; var21 < var16; var21++) {
                var20[var21 * 2] = (float) Math.cos((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
                var20[var21 * 2 + 1] = (float) Math.sin((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
            }
            float[] var22 = new float[var16];
            for (int var23 = 0; var23 < var17; var23++) {
                var22[var23 * 2] = (float) Math.cos((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14);
                var22[var23 * 2 + 1] = -((float) Math.sin((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14));
            }
            int[] var24 = new int[var17];
            int var25 = class446.method2749((byte) -19, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class137.method911(var26, false, var25);
            }
            if (var1 == 0) {
                field2715 = var18;
                field2730 = var20;
                field2738 = var22;
                field2713 = var24;
            } else {
                field2735 = var18;
                field2729 = var20;
                field2722 = var22;
                field2725 = var24;
            }
        }
        int var2 = method1349(8) + 1;
        field2723 = new class405[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2723[var3] = new class405();
        }
        int var4 = method1349(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1349(16);
        }
        int var6 = method1349(6) + 1;
        field2734 = new class98[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2734[var7] = new class98();
        }
        int var8 = method1349(6) + 1;
        field2710 = new class255[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2710[var9] = new class255();
        }
        int var10 = method1349(6) + 1;
        field2718 = new class181[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2718[var11] = new class181();
        }
        int var12 = method1349(6) + 1;
        field2711 = new boolean[var12];
        field2737 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2711[var13] = method1342() != 0;
            method1349(16);
            method1349(16);
            field2737[var13] = method1349(8);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([I)Lua;")
    public final class179 method1344(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2740 == null) {
            this.field2731 = 0;
            this.field2739 = new float[field2736];
            this.field2740 = new byte[this.field2712];
            this.field2741 = 0;
            this.field2742 = 0;
        }
        while (this.field2742 < this.field2721.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1341(this.field2742);
            if (var3 != null) {
                int var4 = this.field2741;
                int var5 = var3.length;
                if (var5 > this.field2712 - var4) {
                    var5 = this.field2712 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2740[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2741;
                }
                this.field2741 = var4;
            }
            this.field2742++;
        }
        this.field2739 = null;
        byte[] var2 = this.field2740;
        this.field2740 = null;
        return new class179(this.field2709, var2, this.field2732, this.field2716, this.field2733);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lct;II)Lbs;")
    public static final class194 method1345(class104 arg0, int arg1, int arg2) {
        if (method1348(arg0)) {
            byte[] var3 = arg0.method715(arg2, (byte) 43, arg1);
            return var3 == null ? null : new class194(var3);
        } else {
            arg0.method716(-32096, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "([B)V")
    private final void method1346(byte[] arg0) {
        class256 var2 = new class256(arg0);
        this.field2709 = var2.method1746(20972);
        this.field2712 = var2.method1746(20972);
        this.field2732 = var2.method1746(20972);
        this.field2716 = var2.method1746(20972);
        if (this.field2716 < 0) {
            this.field2716 = ~this.field2716;
            this.field2733 = true;
        }
        int var3 = var2.method1746(20972);
        this.field2721 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1738((byte) 71);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1710(var5, 0, var7, -99);
            this.field2721[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "()V")
    public static void method1347() {
        field2719 = null;
        field2723 = null;
        field2734 = null;
        field2710 = null;
        field2718 = null;
        field2711 = null;
        field2737 = null;
        field2720 = null;
        field2715 = null;
        field2730 = null;
        field2738 = null;
        field2735 = null;
        field2729 = null;
        field2722 = null;
        field2713 = null;
        field2725 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lct;)Z")
    private static final boolean method1348(class104 arg0) {
        if (!field2714) {
            byte[] var1 = arg0.method715(0, (byte) 69, 0);
            if (var1 == null) {
                return false;
            }
            method1343(var1);
            field2714 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)I")
    public static final int method1349(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2724) {
            int var4 = 8 - field2724;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2719[field2726] >> field2724 & var5) << var2;
            field2724 = 0;
            field2726++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2719[field2726] >> field2724 & var3) << var2;
            field2724 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)F")
    public static final float method1350(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([BI)V")
    private static final void method1351(byte[] arg0, int arg1) {
        field2719 = arg0;
        field2726 = arg1;
        field2724 = 0;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([B)V")
    private class194(byte[] arg0) {
        this.method1346(arg0);
    }
}
