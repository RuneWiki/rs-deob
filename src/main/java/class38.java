import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class38 extends class181 {

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Z")
    private static boolean field659 = false;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    private static int field656;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    private int field657;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    private static int field661;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    private static int field674;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    private static int field675;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    private int field678;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    private int field680;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    private int field687;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Z")
    private boolean field679;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "Z")
    private boolean field683;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "[B")
    private static byte[] field669;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "[B")
    private byte[] field686;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "[F")
    private float[] field658;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "[F")
    private static float[] field660;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "[F")
    private static float[] field664;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "[F")
    private static float[] field665;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "[F")
    private static float[] field667;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "[F")
    private static float[] field670;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "[F")
    private static float[] field671;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "[F")
    private static float[] field672;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "[I")
    private static int[] field655;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "[I")
    private static int[] field668;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "[I")
    private static int[] field676;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "[Ldj;")
    private static class193[] field663;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "[Lwj;")
    public static class230[] field682;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "[Lba;")
    private static class48[] field681;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "[Lpl;")
    private static class95[] field684;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "[Z")
    private static boolean[] field685;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "[[B")
    private byte[][] field662;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([I)Ltf;")
    public final class98 method294(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field686 == null) {
            this.field678 = 0;
            this.field658 = new float[field661];
            this.field686 = new byte[this.field657];
            this.field688 = 0;
            this.field687 = 0;
        }
        while (this.field687 < this.field662.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method303(this.field687);
            if (var3 != null) {
                int var4 = this.field688;
                int var5 = var3.length;
                if (var5 > this.field657 - var4) {
                    var5 = this.field657 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field686[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field688;
                }
                this.field688 = var4;
            }
            this.field687++;
        }
        this.field658 = null;
        byte[] var2 = this.field686;
        this.field686 = null;
        return new class98(this.field673, var2, this.field666, this.field680, this.field679);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
    public static void method295() {
        field669 = null;
        field682 = null;
        field684 = null;
        field681 = null;
        field663 = null;
        field685 = null;
        field655 = null;
        field664 = null;
        field660 = null;
        field665 = null;
        field667 = null;
        field671 = null;
        field672 = null;
        field670 = null;
        field668 = null;
        field676 = null;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)F")
    public static final float method296(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BI)V")
    private static final void method297(byte[] arg0, int arg1) {
        field669 = arg0;
        field674 = arg1;
        field656 = 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lpk;)Z")
    private static final boolean method298(class237 arg0) {
        if (!field659) {
            byte[] var1 = arg0.method1605(-125, 0, 0);
            if (var1 == null) {
                return false;
            }
            method304(var1);
            field659 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)I")
    public static final int method299(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field656) {
            int var4 = 8 - field656;
            int var5 = (0x1 << var4) - 1;
            var1 += (field669[field674] >> field656 & var5) << var2;
            field656 = 0;
            field674++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field669[field674] >> field656 & var3) << var2;
            field656 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
    public static final int method300() {
        int var0 = field669[field674] >> field656 & 0x1;
        field656++;
        field674 += field656 >> 3;
        field656 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([B)V")
    private final void method301(byte[] arg0) {
        class54 var2 = new class54(arg0);
        this.field673 = var2.method420((byte) -78);
        this.field657 = var2.method420((byte) 105);
        this.field666 = var2.method420((byte) 58);
        this.field680 = var2.method420((byte) 44);
        if (this.field680 < 0) {
            this.field680 = ~this.field680;
            this.field679 = true;
        }
        int var3 = var2.method420((byte) 47);
        this.field662 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method407(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method410(-251030480, var7, var5, 0);
            this.field662[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lpk;II)Ld;")
    public static final class38 method302(class237 arg0, int arg1, int arg2) {
        if (method298(arg0)) {
            byte[] var3 = arg0.method1605(-124, arg2, arg1);
            return var3 == null ? null : new class38(var3);
        } else {
            arg0.method1609(false, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)[F")
    private final float[] method303(int arg0) {
        method297(this.field662[arg0], 0);
        method300();
        int var2 = method299(class171.method1147(256, field655.length - 1));
        boolean var3 = field685[var2];
        int var4 = var3 ? field661 : field675;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method300() != 0;
            var6 = method300() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field675 >> 2);
            var9 = (field675 >> 2) + (var4 >> 2);
            var10 = field675 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field675 >> 2);
            var12 = (field675 >> 2) + (var4 - (var4 >> 2));
            var13 = field675 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class193 var14 = field663[field655[var2]];
        int var15 = var14.field2925;
        int var16 = var14.field2927[var15];
        boolean var17 = !field684[var16].method716();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2926; var19++) {
            class48 var95 = field681[var14.field2928[var19]];
            float[] var96 = field664;
            var95.method375(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2925;
            int var21 = var14.field2927[var20];
            field684[var21].method718(field664, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field664[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field664;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field671 : field660;
            float[] var30 = var3 ? field672 : field665;
            float[] var31 = var3 ? field670 : field667;
            int[] var32 = var3 ? field676 : field668;
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
            int var35 = class171.method1147(256, var4 - 1);
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
                field664[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field664[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field678 > 0) {
            int var49 = this.field678 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field683) {
                for (int var50 = 0; var50 < this.field677; var50++) {
                    int var51 = (this.field678 >> 1) + var50;
                    var48[var50] += this.field658[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field664[var52];
                }
            }
        }
        float[] var54 = this.field658;
        this.field658 = field664;
        field664 = var54;
        this.field678 = var4;
        this.field677 = var12 - (var4 >> 1);
        this.field683 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "([B)V")
    private static final void method304(byte[] arg0) {
        method297(arg0, 0);
        field675 = 0x1 << method299(4);
        field661 = 0x1 << method299(4);
        field664 = new float[field661];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field675 : field661;
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
            int var25 = class171.method1147(256, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class115.method822(var25, var26, 1);
            }
            if (var1 == 0) {
                field660 = var18;
                field665 = var20;
                field667 = var22;
                field668 = var24;
            } else {
                field671 = var18;
                field672 = var20;
                field670 = var22;
                field676 = var24;
            }
        }
        int var2 = method299(8) + 1;
        field682 = new class230[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field682[var3] = new class230();
        }
        int var4 = method299(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method299(16);
        }
        int var6 = method299(6) + 1;
        field684 = new class95[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field684[var7] = new class95();
        }
        int var8 = method299(6) + 1;
        field681 = new class48[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field681[var9] = new class48();
        }
        int var10 = method299(6) + 1;
        field663 = new class193[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field663[var11] = new class193();
        }
        int var12 = method299(6) + 1;
        field685 = new boolean[var12];
        field655 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field685[var13] = method300() != 0;
            method299(16);
            method299(16);
            field655[var13] = method299(8);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "([B)V")
    private class38(byte[] arg0) {
        this.method301(arg0);
    }
}
