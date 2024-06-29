import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class56 extends class435 {

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Z")
    private static boolean field655 = false;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    private int field644;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    private static int field645;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    private static int field646;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    private static int field651;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    private static int field668;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "Z")
    private boolean field649;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "Z")
    private boolean field671;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "[B")
    private static byte[] field674;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "[B")
    private byte[] field675;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "[F")
    private float[] field654;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "[F")
    private static float[] field656;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "[F")
    private static float[] field662;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "[F")
    private static float[] field663;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "[F")
    private static float[] field664;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "[F")
    private static float[] field666;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "[F")
    private static float[] field669;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "[F")
    private static float[] field672;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "[I")
    private static int[] field657;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "[I")
    private static int[] field659;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "[I")
    private static int[] field660;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "[Lue;")
    private static class157[] field652;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "[Ltk;")
    private static class231[] field677;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "[Lwg;")
    public static class295[] field670;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "[Lda;")
    private static class44[] field650;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "[Z")
    private static boolean[] field658;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "[[B")
    private byte[][] field648;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([B)V", line = 8)
    private final void method326(byte[] arg0) {
        class396 var2 = new class396(arg0);
        this.field667 = var2.method2406((byte) -123);
        this.field661 = var2.method2406((byte) -126);
        this.field665 = var2.method2406((byte) -73);
        this.field653 = var2.method2406((byte) -90);
        if (this.field653 < 0) {
            this.field653 = ~this.field653;
            this.field649 = true;
        }
        int var3 = var2.method2406((byte) -113);
        this.field648 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2388((byte) -117);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2395((byte) 80, var7, 0, var5);
            this.field648[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)[F", line = 54)
    private final float[] method327(int arg0) {
        method332(this.field648[arg0], 0);
        method337();
        int var2 = method330(class250.method1551(field660.length - 1, (byte) 102));
        boolean var3 = field658[var2];
        int var4 = var3 ? field668 : field646;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method337() != 0;
            var6 = method337() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field646 >> 2);
            var9 = (field646 >> 2) + (var4 >> 2);
            var10 = field646 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field646 >> 2);
            var12 = (field646 >> 2) + (var4 - (var4 >> 2));
            var13 = field646 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class44 var14 = field650[field660[var2]];
        int var15 = var14.field465;
        int var16 = var14.field463[var15];
        boolean var17 = !field652[var16].method943();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field464; var19++) {
            class231 var95 = field677[var14.field466[var19]];
            float[] var96 = field663;
            var95.method1469(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field465;
            int var21 = var14.field463[var20];
            field652[var21].method944(field663, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field663[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field663;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field662 : field666;
            float[] var30 = var3 ? field672 : field664;
            float[] var31 = var3 ? field669 : field656;
            int[] var32 = var3 ? field657 : field659;
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
            int var35 = class250.method1551(var4 - 1, (byte) 107);
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
                field663[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field663[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field647 > 0) {
            int var49 = this.field647 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field671) {
                for (int var50 = 0; var50 < this.field644; var50++) {
                    int var51 = (this.field647 >> 1) + var50;
                    var48[var50] += this.field654[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field663[var52];
                }
            }
        }
        float[] var54 = this.field654;
        this.field654 = field663;
        field663 = var54;
        this.field647 = var4;
        this.field644 = var12 - (var4 >> 1);
        this.field671 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lfo;)Z", line = 468)
    private static final boolean method328(class361 arg0) {
        if (!field655) {
            byte[] var1 = arg0.method2130(0, 0, -63);
            if (var1 == null) {
                return false;
            }
            method334(var1);
            field655 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)F", line = 483)
    public static final float method329(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)I", line = 499)
    public static final int method330(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field651) {
            int var4 = 8 - field651;
            int var5 = (0x1 << var4) - 1;
            var1 += (field674[field645] >> field651 & var5) << var2;
            field651 = 0;
            field645++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field674[field645] >> field651 & var3) << var2;
            field651 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lfo;I)Lkl;", line = 528)
    public static final class56 method331(class361 arg0, int arg1) {
        if (method328(arg0)) {
            byte[] var2 = arg0.method2128(-2, arg1);
            return var2 == null ? null : new class56(var2);
        } else {
            arg0.method2133(0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([BI)V", line = 546)
    private static final void method332(byte[] arg0, int arg1) {
        field674 = arg0;
        field645 = arg1;
        field651 = 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 554)
    public static void method333() {
        field674 = null;
        field670 = null;
        field652 = null;
        field677 = null;
        field650 = null;
        field658 = null;
        field660 = null;
        field663 = null;
        field666 = null;
        field664 = null;
        field656 = null;
        field662 = null;
        field672 = null;
        field669 = null;
        field659 = null;
        field657 = null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "([B)V", line = 575)
    private static final void method334(byte[] arg0) {
        method332(arg0, 0);
        field646 = 0x1 << method330(4);
        field668 = 0x1 << method330(4);
        field663 = new float[field668];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field646 : field668;
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
            int var25 = class250.method1551(var17 - 1, (byte) 94);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class461.method2834(var25, 1, var26);
            }
            if (var1 == 0) {
                field666 = var18;
                field664 = var20;
                field656 = var22;
                field659 = var24;
            } else {
                field662 = var18;
                field672 = var20;
                field669 = var22;
                field657 = var24;
            }
        }
        int var2 = method330(8) + 1;
        field670 = new class295[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field670[var3] = new class295();
        }
        int var4 = method330(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method330(16);
        }
        int var6 = method330(6) + 1;
        field652 = new class157[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field652[var7] = new class157();
        }
        int var8 = method330(6) + 1;
        field677 = new class231[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field677[var9] = new class231();
        }
        int var10 = method330(6) + 1;
        field650 = new class44[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field650[var11] = new class44();
        }
        int var12 = method330(6) + 1;
        field658 = new boolean[var12];
        field660 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field658[var13] = method337() != 0;
            method330(16);
            method330(16);
            field660[var13] = method330(8);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lfo;II)Lkl;", line = 730)
    public static final class56 method335(class361 arg0, int arg1, int arg2) {
        if (method328(arg0)) {
            byte[] var3 = arg0.method2130(arg1, arg2, -94);
            return var3 == null ? null : new class56(var3);
        } else {
            arg0.method2142(arg1, arg2, (byte) 69);
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([I)Ljj;", line = 745)
    public final class77 method336(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field675 == null) {
            this.field647 = 0;
            this.field654 = new float[field668];
            this.field675 = new byte[this.field661];
            this.field673 = 0;
            this.field676 = 0;
        }
        while (this.field676 < this.field648.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method327(this.field676);
            if (var3 != null) {
                int var4 = this.field673;
                int var5 = var3.length;
                if (var5 > this.field661 - var4) {
                    var5 = this.field661 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field675[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field673;
                }
                this.field673 = var4;
            }
            this.field676++;
        }
        this.field654 = null;
        byte[] var2 = this.field675;
        this.field675 = null;
        return new class77(this.field667, var2, this.field665, this.field653, this.field649);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "([B)V", line = 806)
    private class56(byte[] arg0) {
        this.method326(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()I", line = 812)
    public static final int method337() {
        int var0 = field674[field645] >> field651 & 0x1;
        field651++;
        field645 += field651 >> 3;
        field651 &= 0x7;
        return var0;
    }
}
