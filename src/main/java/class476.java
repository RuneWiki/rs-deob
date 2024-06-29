import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class476 extends class513 {

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "Z")
    private static boolean field6662 = false;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "I")
    private int field6659;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    private static int field6664;

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "I")
    private static int field6672;

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "I")
    private int field6673;

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
    private static int field6674;

    @OriginalMember(owner = "client!uca", name = "D", descriptor = "I")
    private int field6677;

    @OriginalMember(owner = "client!uca", name = "F", descriptor = "I")
    private int field6679;

    @OriginalMember(owner = "client!uca", name = "M", descriptor = "I")
    private int field6686;

    @OriginalMember(owner = "client!uca", name = "N", descriptor = "I")
    private static int field6687;

    @OriginalMember(owner = "client!uca", name = "O", descriptor = "I")
    private int field6688;

    @OriginalMember(owner = "client!uca", name = "P", descriptor = "I")
    private int field6689;

    @OriginalMember(owner = "client!uca", name = "Q", descriptor = "I")
    private int field6690;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "Z")
    private boolean field6660;

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "Z")
    private boolean field6671;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "[B")
    private static byte[] field6663;

    @OriginalMember(owner = "client!uca", name = "R", descriptor = "[B")
    private byte[] field6691;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "[F")
    private static float[] field6661;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "[F")
    private static float[] field6665;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "[F")
    private static float[] field6667;

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "[F")
    private static float[] field6669;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "[F")
    private static float[] field6670;

    @OriginalMember(owner = "client!uca", name = "A", descriptor = "[F")
    private static float[] field6675;

    @OriginalMember(owner = "client!uca", name = "E", descriptor = "[F")
    private static float[] field6678;

    @OriginalMember(owner = "client!uca", name = "H", descriptor = "[F")
    private float[] field6681;

    @OriginalMember(owner = "client!uca", name = "G", descriptor = "[I")
    private static int[] field6680;

    @OriginalMember(owner = "client!uca", name = "I", descriptor = "[I")
    private static int[] field6682;

    @OriginalMember(owner = "client!uca", name = "L", descriptor = "[I")
    private static int[] field6685;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "[Lgm;")
    private static class107[] field6666;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "[Lwk;")
    public static class126[] field6668;

    @OriginalMember(owner = "client!uca", name = "J", descriptor = "[Lnb;")
    private static class274[] field6683;

    @OriginalMember(owner = "client!uca", name = "K", descriptor = "[Lpb;")
    private static class606[] field6684;

    @OriginalMember(owner = "client!uca", name = "B", descriptor = "[Z")
    private static boolean[] field6676;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "[[B")
    private byte[][] field6658;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)I")
    public static final int method2793(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field6664) {
            int var4 = 8 - field6664;
            int var5 = (0x1 << var4) - 1;
            var1 += (field6663[field6687] >> field6664 & var5) << var2;
            field6664 = 0;
            field6687++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field6663[field6687] >> field6664 & var3) << var2;
            field6664 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)[F")
    private final float[] method2794(int arg0) {
        method2804(this.field6658[arg0], 0);
        method2800();
        int var2 = method2793(class565.method3314((byte) 17, field6680.length - 1));
        boolean var3 = field6676[var2];
        int var4 = var3 ? field6672 : field6674;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2800() != 0;
            var6 = method2800() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field6674 >> 2);
            var9 = (field6674 >> 2) + (var4 >> 2);
            var10 = field6674 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field6674 >> 2);
            var12 = (field6674 >> 2) + (var4 - (var4 >> 2));
            var13 = field6674 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class606 var14 = field6684[field6680[var2]];
        int var15 = var14.field8720;
        int var16 = var14.field8723[var15];
        boolean var17 = !field6666[var16].method779();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field8721; var19++) {
            class274 var95 = field6683[var14.field8722[var19]];
            float[] var96 = field6665;
            var95.method1666(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field8720;
            int var21 = var14.field8723[var20];
            field6666[var21].method777(field6665, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field6665[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field6665;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field6678 : field6669;
            float[] var30 = var3 ? field6670 : field6675;
            float[] var31 = var3 ? field6667 : field6661;
            int[] var32 = var3 ? field6682 : field6685;
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
            int var35 = class565.method3314((byte) 17, var4 - 1);
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
                field6665[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field6665[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field6679 > 0) {
            int var49 = this.field6679 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field6660) {
                for (int var50 = 0; var50 < this.field6677; var50++) {
                    int var51 = (this.field6679 >> 1) + var50;
                    var48[var50] += this.field6681[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field6665[var52];
                }
            }
        }
        float[] var54 = this.field6681;
        this.field6681 = field6665;
        field6665 = var54;
        this.field6679 = var4;
        this.field6677 = var12 - (var4 >> 1);
        this.field6660 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljn;I)Luca;")
    public static final class476 method2795(class668 arg0, int arg1) {
        if (method2796(arg0)) {
            byte[] var2 = arg0.method3811(117, arg1);
            return var2 == null ? null : new class476(var2);
        } else {
            arg0.method3802(arg1, (byte) 105);
            return null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljn;)Z")
    private static final boolean method2796(class668 arg0) {
        if (!field6662) {
            byte[] var1 = arg0.method3800(0, 0, (byte) -92);
            if (var1 == null) {
                return false;
            }
            method2802(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "()V")
    public static void method2797() {
        field6663 = null;
        field6668 = null;
        field6666 = null;
        field6683 = null;
        field6684 = null;
        field6676 = null;
        field6680 = null;
        field6665 = null;
        field6669 = null;
        field6675 = null;
        field6661 = null;
        field6678 = null;
        field6670 = null;
        field6667 = null;
        field6685 = null;
        field6682 = null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([I)Lep;")
    public final class387 method2798(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field6691 == null) {
            this.field6679 = 0;
            this.field6681 = new float[field6672];
            this.field6691 = new byte[this.field6688];
            this.field6689 = 0;
            this.field6690 = 0;
        }
        while (this.field6690 < this.field6658.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2794(this.field6690);
            if (var3 != null) {
                int var4 = this.field6689;
                int var5 = var3.length;
                if (var5 > this.field6688 - var4) {
                    var5 = this.field6688 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field6691[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field6689;
                }
                this.field6689 = var4;
            }
            this.field6690++;
        }
        this.field6681 = null;
        byte[] var2 = this.field6691;
        this.field6691 = null;
        return new class387(this.field6673, var2, this.field6686, this.field6659, this.field6671);
    }

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "(I)F")
    public static final float method2799(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "()I")
    public static final int method2800() {
        int var0 = field6663[field6687] >> field6664 & 0x1;
        field6664++;
        field6687 += field6664 >> 3;
        field6664 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([B)V")
    private final void method2801(byte[] arg0) {
        class389 var2 = new class389(arg0);
        this.field6673 = var2.method2255(255);
        this.field6688 = var2.method2255(255);
        this.field6686 = var2.method2255(255);
        this.field6659 = var2.method2255(255);
        if (this.field6659 < 0) {
            this.field6659 = ~this.field6659;
            this.field6671 = true;
        }
        int var3 = var2.method2255(255);
        this.field6658 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2229(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2250(-1, var5, var7, 0);
            this.field6658[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "([B)V")
    private static final void method2802(byte[] arg0) {
        method2804(arg0, 0);
        field6674 = 0x1 << method2793(4);
        field6672 = 0x1 << method2793(4);
        field6665 = new float[field6672];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field6674 : field6672;
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
            int var25 = class565.method3314((byte) 17, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class529.method3113(var25, var26, (byte) 104);
            }
            if (var1 == 0) {
                field6669 = var18;
                field6675 = var20;
                field6661 = var22;
                field6685 = var24;
            } else {
                field6678 = var18;
                field6670 = var20;
                field6667 = var22;
                field6682 = var24;
            }
        }
        int var2 = method2793(8) + 1;
        field6668 = new class126[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field6668[var3] = new class126();
        }
        int var4 = method2793(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2793(16);
        }
        int var6 = method2793(6) + 1;
        field6666 = new class107[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field6666[var7] = new class107();
        }
        int var8 = method2793(6) + 1;
        field6683 = new class274[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field6683[var9] = new class274();
        }
        int var10 = method2793(6) + 1;
        field6684 = new class606[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field6684[var11] = new class606();
        }
        int var12 = method2793(6) + 1;
        field6676 = new boolean[var12];
        field6680 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field6676[var13] = method2800() != 0;
            method2793(16);
            method2793(16);
            field6680[var13] = method2793(8);
        }
        field6662 = true;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljn;II)Luca;")
    public static final class476 method2803(class668 arg0, int arg1, int arg2) {
        if (method2796(arg0)) {
            byte[] var3 = arg0.method3800(arg2, arg1, (byte) -92);
            return var3 == null ? null : new class476(var3);
        } else {
            arg0.method3783(arg1, arg2, 32069);
            return null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([BI)V")
    private static final void method2804(byte[] arg0, int arg1) {
        field6663 = arg0;
        field6687 = arg1;
        field6664 = 0;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "([B)V")
    private class476(byte[] arg0) {
        this.method2801(arg0);
    }
}
