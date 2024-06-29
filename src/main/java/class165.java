import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class165 extends class69 {

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "Z")
    private static boolean field2697 = false;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    private int field2675;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    private static int field2677;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    private static int field2679;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    private static int field2684;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    private int field2687;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    private static int field2691;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    private int field2693;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    private int field2698;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    private int field2699;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
    private int field2701;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "Z")
    private boolean field2676;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Z")
    private boolean field2678;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "[B")
    private static byte[] field2674;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "[B")
    private byte[] field2700;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "[F")
    private static float[] field2669;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "[F")
    private static float[] field2670;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "[F")
    private static float[] field2671;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "[F")
    private static float[] field2673;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "[F")
    private static float[] field2685;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "[F")
    private static float[] field2686;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "[F")
    private static float[] field2688;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "[F")
    private float[] field2694;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "[I")
    private static int[] field2672;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "[I")
    private static int[] field2690;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "[I")
    private static int[] field2695;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "[Ljd;")
    public static class126[] field2692;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "[Lab;")
    private static class132[] field2681;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "[Lfg;")
    private static class192[] field2683;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "[Lkd;")
    private static class65[] field2689;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "[Z")
    private static boolean[] field2680;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "[[B")
    private byte[][] field2668;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I)Lwc;")
    public final class91 method1147(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2700 == null) {
            this.field2675 = 0;
            this.field2694 = new float[field2691];
            this.field2700 = new byte[this.field2693];
            this.field2701 = 0;
            this.field2699 = 0;
        }
        while (this.field2699 < this.field2668.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1154(this.field2699);
            if (var3 != null) {
                int var4 = this.field2701;
                int var5 = var3.length;
                if (var5 > this.field2693 - var4) {
                    var5 = this.field2693 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2700[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2701;
                }
                this.field2701 = var4;
            }
            this.field2699++;
        }
        this.field2694 = null;
        byte[] var2 = this.field2700;
        this.field2700 = null;
        return new class91(this.field2696, var2, this.field2687, this.field2682, this.field2678);
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)I")
    public static final int method1148(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2684) {
            int var4 = 8 - field2684;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2674[field2679] >> field2684 & var5) << var2;
            field2684 = 0;
            field2679++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2674[field2679] >> field2684 & var3) << var2;
            field2684 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([B)V")
    private final void method1149(byte[] arg0) {
        class264 var2 = new class264(arg0);
        this.field2696 = var2.method1765((byte) 104);
        this.field2693 = var2.method1765((byte) 121);
        this.field2687 = var2.method1765((byte) 102);
        this.field2682 = var2.method1765((byte) 92);
        if (this.field2682 < 0) {
            this.field2682 = ~this.field2682;
            this.field2678 = true;
        }
        int var3 = var2.method1765((byte) 95);
        this.field2668 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1779(-87);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1754(var5, var7, 114, 0);
            this.field2668[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V")
    public static void method1150() {
        field2674 = null;
        field2692 = null;
        field2689 = null;
        field2683 = null;
        field2681 = null;
        field2680 = null;
        field2695 = null;
        field2673 = null;
        field2671 = null;
        field2669 = null;
        field2685 = null;
        field2686 = null;
        field2670 = null;
        field2688 = null;
        field2672 = null;
        field2690 = null;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "([B)V")
    private static final void method1151(byte[] arg0) {
        method1155(arg0, 0);
        field2677 = 0x1 << method1148(4);
        field2691 = 0x1 << method1148(4);
        field2673 = new float[field2691];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2677 : field2691;
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
            int var25 = class19.method130(var17 - 1, 256);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class151.method1025(26965, var25, var26);
            }
            if (var1 == 0) {
                field2671 = var18;
                field2669 = var20;
                field2685 = var22;
                field2672 = var24;
            } else {
                field2686 = var18;
                field2670 = var20;
                field2688 = var22;
                field2690 = var24;
            }
        }
        int var2 = method1148(8) + 1;
        field2692 = new class126[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2692[var3] = new class126();
        }
        int var4 = method1148(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1148(16);
        }
        int var6 = method1148(6) + 1;
        field2689 = new class65[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2689[var7] = new class65();
        }
        int var8 = method1148(6) + 1;
        field2683 = new class192[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2683[var9] = new class192();
        }
        int var10 = method1148(6) + 1;
        field2681 = new class132[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2681[var11] = new class132();
        }
        int var12 = method1148(6) + 1;
        field2680 = new boolean[var12];
        field2695 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2680[var13] = method1156() != 0;
            method1148(16);
            method1148(16);
            field2695[var13] = method1148(8);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljj;)Z")
    private static final boolean method1152(class134 arg0) {
        if (!field2697) {
            byte[] var1 = arg0.method940((byte) 40, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1151(var1);
            field2697 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljj;II)Lek;")
    public static final class165 method1153(class134 arg0, int arg1, int arg2) {
        if (method1152(arg0)) {
            byte[] var3 = arg0.method940((byte) 111, arg2, arg1);
            return var3 == null ? null : new class165(var3);
        } else {
            arg0.method934(arg2, (byte) -33, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)[F")
    private final float[] method1154(int arg0) {
        method1155(this.field2668[arg0], 0);
        method1156();
        int var2 = method1148(class19.method130(field2695.length - 1, 256));
        boolean var3 = field2680[var2];
        int var4 = var3 ? field2691 : field2677;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1156() != 0;
            var6 = method1156() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2677 >> 2);
            var9 = (field2677 >> 2) + (var4 >> 2);
            var10 = field2677 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2677 >> 2);
            var12 = (field2677 >> 2) + (var4 - (var4 >> 2));
            var13 = field2677 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class132 var14 = field2681[field2695[var2]];
        int var15 = var14.field2199;
        int var16 = var14.field2198[var15];
        boolean var17 = !field2689[var16].method520();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2200; var19++) {
            class192 var95 = field2683[var14.field2201[var19]];
            float[] var96 = field2673;
            var95.method1300(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2199;
            int var21 = var14.field2198[var20];
            field2689[var21].method518(field2673, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2673[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2673;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2686 : field2671;
            float[] var30 = var3 ? field2670 : field2669;
            float[] var31 = var3 ? field2688 : field2685;
            int[] var32 = var3 ? field2690 : field2672;
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
            int var35 = class19.method130(var4 - 1, 256);
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
                field2673[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2673[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2675 > 0) {
            int var49 = this.field2675 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2676) {
                for (int var50 = 0; var50 < this.field2698; var50++) {
                    int var51 = (this.field2675 >> 1) + var50;
                    var48[var50] += this.field2694[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2673[var52];
                }
            }
        }
        float[] var54 = this.field2694;
        this.field2694 = field2673;
        field2673 = var54;
        this.field2675 = var4;
        this.field2698 = var12 - (var4 >> 1);
        this.field2676 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([BI)V")
    private static final void method1155(byte[] arg0, int arg1) {
        field2674 = arg0;
        field2679 = arg1;
        field2684 = 0;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()I")
    public static final int method1156() {
        int var0 = field2674[field2679] >> field2684 & 0x1;
        field2684++;
        field2679 += field2684 >> 3;
        field2684 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)F")
    public static final float method1157(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "([B)V")
    private class165(byte[] arg0) {
        this.method1149(arg0);
    }
}
