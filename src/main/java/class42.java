import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class42 extends class110 {

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "Z")
    private static boolean field845 = false;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    private int field835;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    private static int field842;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    private static int field844;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    private static int field846;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    private static int field854;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
    private boolean field827;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
    private boolean field828;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "[B")
    private static byte[] field832;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "[B")
    private byte[] field856;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "[F")
    private static float[] field829;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "[F")
    private static float[] field837;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "[F")
    private static float[] field838;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "[F")
    private float[] field839;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "[F")
    private static float[] field841;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "[F")
    private static float[] field847;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "[F")
    private static float[] field848;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "[F")
    private static float[] field853;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "[I")
    private static int[] field830;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "[I")
    private static int[] field834;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "[I")
    private static int[] field836;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "[Lme;")
    private static class113[] field850;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "[Lsb;")
    private static class164[] field825;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "[La;")
    public static class1[] field852;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "[Lhb;")
    private static class66[] field833;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "[Z")
    private static boolean[] field826;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "[[B")
    private byte[][] field843;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
    public static void method355() {
        field832 = null;
        field852 = null;
        field825 = null;
        field833 = null;
        field850 = null;
        field826 = null;
        field834 = null;
        field837 = null;
        field853 = null;
        field847 = null;
        field848 = null;
        field838 = null;
        field841 = null;
        field829 = null;
        field836 = null;
        field830 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()I")
    public static final int method356() {
        int var0 = field832[field854] >> field844 & 0x1;
        field844++;
        field854 += field844 >> 3;
        field844 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)[F")
    private final float[] method357(int arg0) {
        method362(this.field843[arg0], 0);
        method356();
        int var2 = method361(class161.method1103(8, field834.length - 1));
        boolean var3 = field826[var2];
        int var4 = var3 ? field846 : field842;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method356() != 0;
            var6 = method356() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field842 >> 2);
            var9 = (field842 >> 2) + (var4 >> 2);
            var10 = field842 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field842 >> 2);
            var12 = (field842 >> 2) + (var4 - (var4 >> 2));
            var13 = field842 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class113 var14 = field850[field834[var2]];
        int var15 = var14.field2307;
        int var16 = var14.field2305[var15];
        boolean var17 = !field825[var16].method1118();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2306; var19++) {
            class66 var95 = field833[var14.field2304[var19]];
            float[] var96 = field837;
            var95.method554(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2307;
            int var21 = var14.field2305[var20];
            field825[var21].method1116(field837, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field837[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field837;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field838 : field853;
            float[] var30 = var3 ? field841 : field847;
            float[] var31 = var3 ? field829 : field848;
            int[] var32 = var3 ? field830 : field836;
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
            int var35 = class161.method1103(8, var4 - 1);
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
                field837[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field837[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field835 > 0) {
            int var49 = this.field835 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field828) {
                for (int var50 = 0; var50 < this.field831; var50++) {
                    int var51 = (this.field835 >> 1) + var50;
                    var48[var50] += this.field839[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field837[var52];
                }
            }
        }
        float[] var54 = this.field839;
        this.field839 = field837;
        field837 = var54;
        this.field835 = var4;
        this.field831 = var12 - (var4 >> 1);
        this.field828 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lah;II)Lec;")
    public static final class42 method358(class9 arg0, int arg1, int arg2) {
        if (method364(arg0)) {
            byte[] var3 = arg0.method67(arg1, -1, arg2);
            return var3 == null ? null : new class42(var3);
        } else {
            arg0.method60((byte) 113, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)F")
    public static final float method359(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([B)V")
    private static final void method360(byte[] arg0) {
        method362(arg0, 0);
        field842 = 0x1 << method361(4);
        field846 = 0x1 << method361(4);
        field837 = new float[field846];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field842 : field846;
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
            int var25 = class161.method1103(8, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class53.method470(var26, -1, var25);
            }
            if (var1 == 0) {
                field853 = var18;
                field847 = var20;
                field848 = var22;
                field836 = var24;
            } else {
                field838 = var18;
                field841 = var20;
                field829 = var22;
                field830 = var24;
            }
        }
        int var2 = method361(8) + 1;
        field852 = new class1[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field852[var3] = new class1();
        }
        int var4 = method361(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method361(16);
        }
        int var6 = method361(6) + 1;
        field825 = new class164[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field825[var7] = new class164();
        }
        int var8 = method361(6) + 1;
        field833 = new class66[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field833[var9] = new class66();
        }
        int var10 = method361(6) + 1;
        field850 = new class113[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field850[var11] = new class113();
        }
        int var12 = method361(6) + 1;
        field826 = new boolean[var12];
        field834 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field826[var13] = method356() != 0;
            method361(16);
            method361(16);
            field834[var13] = method361(8);
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)I")
    public static final int method361(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field844) {
            int var4 = 8 - field844;
            int var5 = (0x1 << var4) - 1;
            var1 += (field832[field854] >> field844 & var5) << var2;
            field844 = 0;
            field854++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field832[field854] >> field844 & var3) << var2;
            field844 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BI)V")
    private static final void method362(byte[] arg0, int arg1) {
        field832 = arg0;
        field854 = arg1;
        field844 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "([B)V")
    private final void method363(byte[] arg0) {
        class68 var2 = new class68(arg0);
        this.field824 = var2.method599((byte) 96);
        this.field849 = var2.method599((byte) 96);
        this.field851 = var2.method599((byte) 96);
        this.field840 = var2.method599((byte) 96);
        if (this.field840 < 0) {
            this.field840 = ~this.field840;
            this.field827 = true;
        }
        int var3 = var2.method599((byte) 96);
        this.field843 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method604((byte) -126);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method565(var5, 0, (byte) 65, var7);
            this.field843[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lah;)Z")
    private static final boolean method364(class9 arg0) {
        if (!field845) {
            byte[] var1 = arg0.method67(0, -1, 0);
            if (var1 == null) {
                return false;
            }
            method360(var1);
            field845 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([I)Lle;")
    public final class104 method365(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field856 == null) {
            this.field835 = 0;
            this.field839 = new float[field846];
            this.field856 = new byte[this.field849];
            this.field857 = 0;
            this.field855 = 0;
        }
        while (this.field855 < this.field843.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method357(this.field855);
            if (var3 != null) {
                int var4 = this.field857;
                int var5 = var3.length;
                if (var5 > this.field849 - var4) {
                    var5 = this.field849 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field856[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field857;
                }
                this.field857 = var4;
            }
            this.field855++;
        }
        this.field839 = null;
        byte[] var2 = this.field856;
        this.field856 = null;
        return new class104(this.field824, var2, this.field851, this.field840, this.field827);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V")
    private class42(byte[] arg0) {
        this.method363(arg0);
    }
}
