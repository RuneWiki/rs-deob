import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class475 extends class417 {

    @OriginalMember(owner = "client!jw", name = "A", descriptor = "Z")
    private static boolean field6718 = false;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
    private int field6705;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
    private static int field6707;

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "I")
    private static int field6708;

    @OriginalMember(owner = "client!jw", name = "t", descriptor = "I")
    private int field6711;

    @OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
    private int field6713;

    @OriginalMember(owner = "client!jw", name = "w", descriptor = "I")
    private int field6714;

    @OriginalMember(owner = "client!jw", name = "F", descriptor = "I")
    private int field6722;

    @OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
    private static int field6723;

    @OriginalMember(owner = "client!jw", name = "H", descriptor = "I")
    private int field6724;

    @OriginalMember(owner = "client!jw", name = "I", descriptor = "I")
    private static int field6725;

    @OriginalMember(owner = "client!jw", name = "O", descriptor = "I")
    private int field6731;

    @OriginalMember(owner = "client!jw", name = "P", descriptor = "I")
    private int field6732;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "Z")
    private boolean field6703;

    @OriginalMember(owner = "client!jw", name = "B", descriptor = "Z")
    private boolean field6719;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "[B")
    private static byte[] field6700;

    @OriginalMember(owner = "client!jw", name = "Q", descriptor = "[B")
    private byte[] field6733;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "[F")
    private static float[] field6702;

    @OriginalMember(owner = "client!jw", name = "s", descriptor = "[F")
    private static float[] field6710;

    @OriginalMember(owner = "client!jw", name = "x", descriptor = "[F")
    private static float[] field6715;

    @OriginalMember(owner = "client!jw", name = "y", descriptor = "[F")
    private static float[] field6716;

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "[F")
    private static float[] field6717;

    @OriginalMember(owner = "client!jw", name = "J", descriptor = "[F")
    private static float[] field6726;

    @OriginalMember(owner = "client!jw", name = "K", descriptor = "[F")
    private float[] field6727;

    @OriginalMember(owner = "client!jw", name = "N", descriptor = "[F")
    private static float[] field6730;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "[I")
    private static int[] field6704;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "[I")
    private static int[] field6706;

    @OriginalMember(owner = "client!jw", name = "D", descriptor = "[I")
    private static int[] field6720;

    @OriginalMember(owner = "client!jw", name = "E", descriptor = "[Lnt;")
    private static class189[] field6721;

    @OriginalMember(owner = "client!jw", name = "L", descriptor = "[Ldt;")
    private static class202[] field6728;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "[Lkj;")
    private static class486[] field6701;

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "[Lki;")
    public static class608[] field6709;

    @OriginalMember(owner = "client!jw", name = "M", descriptor = "[Z")
    private static boolean[] field6729;

    @OriginalMember(owner = "client!jw", name = "u", descriptor = "[[B")
    private byte[][] field6712;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "([B)V")
    private static final void method2855(byte[] arg0) {
        method2863(arg0, 0);
        field6707 = 0x1 << method2858(4);
        field6725 = 0x1 << method2858(4);
        field6702 = new float[field6725];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field6707 : field6725;
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
            int var25 = class136.method950((byte) 73, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class62.method404(var25, -116, var26);
            }
            if (var1 == 0) {
                field6726 = var18;
                field6710 = var20;
                field6716 = var22;
                field6706 = var24;
            } else {
                field6730 = var18;
                field6717 = var20;
                field6715 = var22;
                field6704 = var24;
            }
        }
        int var2 = method2858(8) + 1;
        field6709 = new class608[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field6709[var3] = new class608();
        }
        int var4 = method2858(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2858(16);
        }
        int var6 = method2858(6) + 1;
        field6721 = new class189[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field6721[var7] = new class189();
        }
        int var8 = method2858(6) + 1;
        field6728 = new class202[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field6728[var9] = new class202();
        }
        int var10 = method2858(6) + 1;
        field6701 = new class486[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field6701[var11] = new class486();
        }
        int var12 = method2858(6) + 1;
        field6729 = new boolean[var12];
        field6720 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field6729[var13] = method2856() != 0;
            method2858(16);
            method2858(16);
            field6720[var13] = method2858(8);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "()I")
    public static final int method2856() {
        int var0 = field6700[field6723] >> field6708 & 0x1;
        field6708++;
        field6723 += field6708 >> 3;
        field6708 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "([I)Lqk;")
    public final class16 method2857(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field6733 == null) {
            this.field6722 = 0;
            this.field6727 = new float[field6725];
            this.field6733 = new byte[this.field6714];
            this.field6731 = 0;
            this.field6732 = 0;
        }
        while (this.field6732 < this.field6712.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2859(this.field6732);
            if (var3 != null) {
                int var4 = this.field6731;
                int var5 = var3.length;
                if (var5 > this.field6714 - var4) {
                    var5 = this.field6714 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field6733[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field6731;
                }
                this.field6731 = var4;
            }
            this.field6732++;
        }
        this.field6727 = null;
        byte[] var2 = this.field6733;
        this.field6733 = null;
        return new class16(this.field6713, var2, this.field6705, this.field6724, this.field6719);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I")
    public static final int method2858(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field6708) {
            int var4 = 8 - field6708;
            int var5 = (0x1 << var4) - 1;
            var1 += (field6700[field6723] >> field6708 & var5) << var2;
            field6708 = 0;
            field6723++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field6700[field6723] >> field6708 & var3) << var2;
            field6708 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)[F")
    private final float[] method2859(int arg0) {
        method2863(this.field6712[arg0], 0);
        method2856();
        int var2 = method2858(class136.method950((byte) 73, field6720.length - 1));
        boolean var3 = field6729[var2];
        int var4 = var3 ? field6725 : field6707;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2856() != 0;
            var6 = method2856() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field6707 >> 2);
            var9 = (field6707 >> 2) + (var4 >> 2);
            var10 = field6707 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field6707 >> 2);
            var12 = (field6707 >> 2) + (var4 - (var4 >> 2));
            var13 = field6707 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class486 var14 = field6701[field6720[var2]];
        int var15 = var14.field6912;
        int var16 = var14.field6915[var15];
        boolean var17 = !field6721[var16].method1299();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6913; var19++) {
            class202 var95 = field6728[var14.field6914[var19]];
            float[] var96 = field6702;
            var95.method1347(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6912;
            int var21 = var14.field6915[var20];
            field6721[var21].method1302(field6702, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field6702[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field6702;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field6730 : field6726;
            float[] var30 = var3 ? field6717 : field6710;
            float[] var31 = var3 ? field6715 : field6716;
            int[] var32 = var3 ? field6704 : field6706;
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
            int var35 = class136.method950((byte) 73, var4 - 1);
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
                field6702[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field6702[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field6722 > 0) {
            int var49 = this.field6722 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field6703) {
                for (int var50 = 0; var50 < this.field6711; var50++) {
                    int var51 = (this.field6722 >> 1) + var50;
                    var48[var50] += this.field6727[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field6702[var52];
                }
            }
        }
        float[] var54 = this.field6727;
        this.field6727 = field6702;
        field6702 = var54;
        this.field6722 = var4;
        this.field6711 = var12 - (var4 >> 1);
        this.field6703 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lkda;)Z")
    private static final boolean method2860(class328 arg0) {
        if (!field6718) {
            byte[] var1 = arg0.method1966(0, 0, true);
            if (var1 == null) {
                return false;
            }
            method2855(var1);
            field6718 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lkda;I)Ljw;")
    public static final class475 method2861(class328 arg0, int arg1) {
        if (method2860(arg0)) {
            byte[] var2 = arg0.method1984(1670, arg1);
            return var2 == null ? null : new class475(var2);
        } else {
            arg0.method1981(true, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "()V")
    public static void method2862() {
        field6700 = null;
        field6709 = null;
        field6721 = null;
        field6728 = null;
        field6701 = null;
        field6729 = null;
        field6720 = null;
        field6702 = null;
        field6726 = null;
        field6710 = null;
        field6716 = null;
        field6730 = null;
        field6717 = null;
        field6715 = null;
        field6706 = null;
        field6704 = null;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "([BI)V")
    private static final void method2863(byte[] arg0, int arg1) {
        field6700 = arg0;
        field6723 = arg1;
        field6708 = 0;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)F")
    public static final float method2864(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "([B)V")
    private final void method2865(byte[] arg0) {
        class148 var2 = new class148(arg0);
        this.field6713 = var2.method1026(-917302120);
        this.field6714 = var2.method1026(-917302120);
        this.field6705 = var2.method1026(-917302120);
        this.field6724 = var2.method1026(-917302120);
        if (this.field6724 < 0) {
            this.field6724 = ~this.field6724;
            this.field6719 = true;
        }
        int var3 = var2.method1026(-917302120);
        this.field6712 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1032((byte) -33);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1060((byte) 120, var7, 0, var5);
            this.field6712[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lkda;II)Ljw;")
    public static final class475 method2866(class328 arg0, int arg1, int arg2) {
        if (method2860(arg0)) {
            byte[] var3 = arg0.method1966(arg2, arg1, true);
            return var3 == null ? null : new class475(var3);
        } else {
            arg0.method1980(arg2, arg1, (byte) -16);
            return null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "([B)V")
    private class475(byte[] arg0) {
        this.method2865(arg0);
    }
}
