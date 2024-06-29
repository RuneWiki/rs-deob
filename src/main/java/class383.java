import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class383 extends class337 {

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Z")
    private static boolean field5793 = false;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    private int field5796;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    private static int field5799;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    private int field5800;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    private int field5801;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    private static int field5806;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    private static int field5810;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    private int field5812;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    private static int field5814;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    private int field5818;

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    private int field5819;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    private int field5823;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    private int field5825;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "Z")
    private boolean field5813;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Z")
    private boolean field5816;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "[B")
    private static byte[] field5820;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "[B")
    private byte[] field5822;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "[F")
    private static float[] field5794;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "[F")
    private static float[] field5795;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "[F")
    private static float[] field5802;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "[F")
    private static float[] field5804;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "[F")
    private static float[] field5808;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "[F")
    private static float[] field5809;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "[F")
    private float[] field5811;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "[F")
    private static float[] field5824;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "[I")
    private static int[] field5797;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "[I")
    private static int[] field5803;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "[I")
    private static int[] field5805;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "[Lwq;")
    private static class113[] field5807;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "[Lgd;")
    private static class224[] field5826;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "[Lhv;")
    private static class358[] field5821;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "[Lnl;")
    public static class384[] field5815;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "[Z")
    private static boolean[] field5798;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "[[B")
    private byte[][] field5817;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lic;)Z")
    private static final boolean method2337(class491 arg0) {
        if (!field5793) {
            byte[] var1 = arg0.method2945(0, 0, true);
            if (var1 == null) {
                return false;
            }
            method2341(var1);
            field5793 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
    public static void method2338() {
        field5820 = null;
        field5815 = null;
        field5807 = null;
        field5826 = null;
        field5821 = null;
        field5798 = null;
        field5797 = null;
        field5802 = null;
        field5824 = null;
        field5808 = null;
        field5809 = null;
        field5804 = null;
        field5795 = null;
        field5794 = null;
        field5805 = null;
        field5803 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BI)V")
    private static final void method2339(byte[] arg0, int arg1) {
        field5820 = arg0;
        field5799 = arg1;
        field5814 = 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)F")
    public static final float method2340(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([B)V")
    private static final void method2341(byte[] arg0) {
        method2339(arg0, 0);
        field5806 = 0x1 << method2344(4);
        field5810 = 0x1 << method2344(4);
        field5802 = new float[field5810];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5806 : field5810;
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
            int var25 = class495.method2972(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class23.method148((byte) 83, var26, var25);
            }
            if (var1 == 0) {
                field5824 = var18;
                field5808 = var20;
                field5809 = var22;
                field5805 = var24;
            } else {
                field5804 = var18;
                field5795 = var20;
                field5794 = var22;
                field5803 = var24;
            }
        }
        int var2 = method2344(8) + 1;
        field5815 = new class384[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5815[var3] = new class384();
        }
        int var4 = method2344(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2344(16);
        }
        int var6 = method2344(6) + 1;
        field5807 = new class113[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5807[var7] = new class113();
        }
        int var8 = method2344(6) + 1;
        field5826 = new class224[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5826[var9] = new class224();
        }
        int var10 = method2344(6) + 1;
        field5821 = new class358[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5821[var11] = new class358();
        }
        int var12 = method2344(6) + 1;
        field5798 = new boolean[var12];
        field5797 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5798[var13] = method2343() != 0;
            method2344(16);
            method2344(16);
            field5797[var13] = method2344(8);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([I)Lnq;")
    public final class319 method2342(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5822 == null) {
            this.field5812 = 0;
            this.field5811 = new float[field5810];
            this.field5822 = new byte[this.field5796];
            this.field5825 = 0;
            this.field5823 = 0;
        }
        while (this.field5823 < this.field5817.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2347(this.field5823);
            if (var3 != null) {
                int var4 = this.field5825;
                int var5 = var3.length;
                if (var5 > this.field5796 - var4) {
                    var5 = this.field5796 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5822[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5825;
                }
                this.field5825 = var4;
            }
            this.field5823++;
        }
        this.field5811 = null;
        byte[] var2 = this.field5822;
        this.field5822 = null;
        return new class319(this.field5800, var2, this.field5818, this.field5819, this.field5816);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
    public static final int method2343() {
        int var0 = field5820[field5799] >> field5814 & 0x1;
        field5814++;
        field5799 += field5814 >> 3;
        field5814 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)I")
    public static final int method2344(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5814) {
            int var4 = 8 - field5814;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5820[field5799] >> field5814 & var5) << var2;
            field5814 = 0;
            field5799++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5820[field5799] >> field5814 & var3) << var2;
            field5814 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lic;I)Lgh;")
    public static final class383 method2345(class491 arg0, int arg1) {
        if (method2337(arg0)) {
            byte[] var2 = arg0.method2944(arg1, 103);
            return var2 == null ? null : new class383(var2);
        } else {
            arg0.method2924((byte) -127, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "([B)V")
    private final void method2346(byte[] arg0) {
        class209 var2 = new class209(arg0);
        this.field5800 = var2.method1452(65280);
        this.field5796 = var2.method1452(65280);
        this.field5818 = var2.method1452(65280);
        this.field5819 = var2.method1452(65280);
        if (this.field5819 < 0) {
            this.field5819 = ~this.field5819;
            this.field5816 = true;
        }
        int var3 = var2.method1452(65280);
        this.field5817 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1428(32122);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1436((byte) 111, 0, var7, var5);
            this.field5817[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)[F")
    private final float[] method2347(int arg0) {
        method2339(this.field5817[arg0], 0);
        method2343();
        int var2 = method2344(class495.method2972(field5797.length - 1, false));
        boolean var3 = field5798[var2];
        int var4 = var3 ? field5810 : field5806;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2343() != 0;
            var6 = method2343() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5806 >> 2);
            var9 = (field5806 >> 2) + (var4 >> 2);
            var10 = field5806 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5806 >> 2);
            var12 = (field5806 >> 2) + (var4 - (var4 >> 2));
            var13 = field5806 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class358 var14 = field5821[field5797[var2]];
        int var15 = var14.field5496;
        int var16 = var14.field5498[var15];
        boolean var17 = !field5807[var16].method755();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5495; var19++) {
            class224 var95 = field5826[var14.field5497[var19]];
            float[] var96 = field5802;
            var95.method1530(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5496;
            int var21 = var14.field5498[var20];
            field5807[var21].method751(field5802, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5802[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5802;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5804 : field5824;
            float[] var30 = var3 ? field5795 : field5808;
            float[] var31 = var3 ? field5794 : field5809;
            int[] var32 = var3 ? field5803 : field5805;
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
            int var35 = class495.method2972(var4 - 1, false);
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
                field5802[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5802[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5812 > 0) {
            int var49 = this.field5812 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5813) {
                for (int var50 = 0; var50 < this.field5801; var50++) {
                    int var51 = (this.field5812 >> 1) + var50;
                    var48[var50] += this.field5811[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5802[var52];
                }
            }
        }
        float[] var54 = this.field5811;
        this.field5811 = field5802;
        field5802 = var54;
        this.field5812 = var4;
        this.field5801 = var12 - (var4 >> 1);
        this.field5813 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lic;II)Lgh;")
    public static final class383 method2348(class491 arg0, int arg1, int arg2) {
        if (method2337(arg0)) {
            byte[] var3 = arg0.method2945(arg1, arg2, true);
            return var3 == null ? null : new class383(var3);
        } else {
            arg0.method2922(arg2, arg1, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "([B)V")
    private class383(byte[] arg0) {
        this.method2346(arg0);
    }
}
