import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class531 extends class430 {

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Z")
    private static boolean field7756 = false;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    private static int field7729;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    private static int field7733;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    private int field7735;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    private int field7736;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    private static int field7748;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    private int field7751;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    private int field7752;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    private int field7753;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    private int field7754;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    private static int field7758;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field7760;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    private int field7762;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Z")
    private boolean field7745;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "Z")
    private boolean field7757;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[B")
    private static byte[] field7738;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "[B")
    private byte[] field7759;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[F")
    private static float[] field7730;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[F")
    private float[] field7732;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "[F")
    private static float[] field7734;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[F")
    private static float[] field7737;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "[F")
    private static float[] field7742;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "[F")
    private static float[] field7743;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "[F")
    private static float[] field7749;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "[F")
    private static float[] field7755;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
    private static int[] field7740;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[I")
    private static int[] field7741;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "[I")
    private static int[] field7744;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "[Lgh;")
    private static class49[] field7739;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "[Lkc;")
    private static class653[] field7746;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[Lto;")
    private static class712[] field7731;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "[Llga;")
    public static class723[] field7747;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "[Z")
    private static boolean[] field7761;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "[[B")
    private byte[][] field7750;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)V")
    private static final void method3219(byte[] arg0, int arg1) {
        field7738 = arg0;
        field7748 = arg1;
        field7758 = 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lla;)Z")
    private static final boolean method3220(class423 arg0) {
        if (!field7756) {
            byte[] var1 = arg0.method2600(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method3223(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
    public static void method3221() {
        field7738 = null;
        field7747 = null;
        field7731 = null;
        field7739 = null;
        field7746 = null;
        field7761 = null;
        field7740 = null;
        field7755 = null;
        field7737 = null;
        field7743 = null;
        field7749 = null;
        field7734 = null;
        field7742 = null;
        field7730 = null;
        field7741 = null;
        field7744 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
    public static final int method3222(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field7758) {
            int var4 = 8 - field7758;
            int var5 = (0x1 << var4) - 1;
            var1 += (field7738[field7748] >> field7758 & var5) << var2;
            field7758 = 0;
            field7748++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field7738[field7748] >> field7758 & var3) << var2;
            field7758 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([B)V")
    private static final void method3223(byte[] arg0) {
        method3219(arg0, 0);
        field7729 = 0x1 << method3222(4);
        field7733 = 0x1 << method3222(4);
        field7755 = new float[field7733];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field7729 : field7733;
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
            int var25 = class690.method3903(4, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class165.method1184(var25, 0, var26);
            }
            if (var1 == 0) {
                field7737 = var18;
                field7743 = var20;
                field7749 = var22;
                field7741 = var24;
            } else {
                field7734 = var18;
                field7742 = var20;
                field7730 = var22;
                field7744 = var24;
            }
        }
        int var2 = method3222(8) + 1;
        field7747 = new class723[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field7747[var3] = new class723();
        }
        int var4 = method3222(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3222(16);
        }
        int var6 = method3222(6) + 1;
        field7731 = new class712[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field7731[var7] = new class712();
        }
        int var8 = method3222(6) + 1;
        field7739 = new class49[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field7739[var9] = new class49();
        }
        int var10 = method3222(6) + 1;
        field7746 = new class653[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field7746[var11] = new class653();
        }
        int var12 = method3222(6) + 1;
        field7761 = new boolean[var12];
        field7740 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field7761[var13] = method3224() != 0;
            method3222(16);
            method3222(16);
            field7740[var13] = method3222(8);
        }
        field7756 = true;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
    public static final int method3224() {
        int var0 = field7738[field7748] >> field7758 & 0x1;
        field7758++;
        field7748 += field7758 >> 3;
        field7758 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "([B)V")
    private final void method3225(byte[] arg0) {
        class479 var2 = new class479(arg0);
        this.field7754 = var2.method2868(-106);
        this.field7736 = var2.method2868(-103);
        this.field7751 = var2.method2868(-118);
        this.field7753 = var2.method2868(-87);
        if (this.field7753 < 0) {
            this.field7753 = ~this.field7753;
            this.field7745 = true;
        }
        int var3 = var2.method2868(-42);
        this.field7750 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2886(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2867(-290150072, var7, var5, 0);
            this.field7750[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)[F")
    private final float[] method3226(int arg0) {
        method3219(this.field7750[arg0], 0);
        method3224();
        int var2 = method3222(class690.method3903(4, field7740.length - 1));
        boolean var3 = field7761[var2];
        int var4 = var3 ? field7733 : field7729;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3224() != 0;
            var6 = method3224() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field7729 >> 2);
            var9 = (field7729 >> 2) + (var4 >> 2);
            var10 = field7729 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field7729 >> 2);
            var12 = (field7729 >> 2) + (var4 - (var4 >> 2));
            var13 = field7729 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class653 var14 = field7746[field7740[var2]];
        int var15 = var14.field9352;
        int var16 = var14.field9353[var15];
        boolean var17 = !field7731[var16].method3981();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field9350; var19++) {
            class49 var95 = field7739[var14.field9351[var19]];
            float[] var96 = field7755;
            var95.method464(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field9352;
            int var21 = var14.field9353[var20];
            field7731[var21].method3979(field7755, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field7755[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field7755;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field7734 : field7737;
            float[] var30 = var3 ? field7742 : field7743;
            float[] var31 = var3 ? field7730 : field7749;
            int[] var32 = var3 ? field7744 : field7741;
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
            int var35 = class690.method3903(4, var4 - 1);
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
                field7755[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field7755[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field7752 > 0) {
            int var49 = this.field7752 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field7757) {
                for (int var50 = 0; var50 < this.field7735; var50++) {
                    int var51 = (this.field7752 >> 1) + var50;
                    var48[var50] += this.field7732[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field7755[var52];
                }
            }
        }
        float[] var54 = this.field7732;
        this.field7732 = field7755;
        field7755 = var54;
        this.field7752 = var4;
        this.field7735 = var12 - (var4 >> 1);
        this.field7757 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lla;I)Lpd;")
    public static final class531 method3227(class423 arg0, int arg1) {
        if (method3220(arg0)) {
            byte[] var2 = arg0.method2611((byte) -112, arg1);
            return var2 == null ? null : new class531(var2);
        } else {
            arg0.method2609(0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lla;II)Lpd;")
    public static final class531 method3228(class423 arg0, int arg1, int arg2) {
        if (method3220(arg0)) {
            byte[] var3 = arg0.method2600(0, arg1, arg2);
            return var3 == null ? null : new class531(var3);
        } else {
            arg0.method2613(arg2, arg1, -113);
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([I)Ljda;")
    public final class673 method3229(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field7759 == null) {
            this.field7752 = 0;
            this.field7732 = new float[field7733];
            this.field7759 = new byte[this.field7736];
            this.field7762 = 0;
            this.field7760 = 0;
        }
        while (this.field7760 < this.field7750.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3226(this.field7760);
            if (var3 != null) {
                int var4 = this.field7762;
                int var5 = var3.length;
                if (var5 > this.field7736 - var4) {
                    var5 = this.field7736 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field7759[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field7762;
                }
                this.field7762 = var4;
            }
            this.field7760++;
        }
        this.field7732 = null;
        byte[] var2 = this.field7759;
        this.field7759 = null;
        return new class673(this.field7754, var2, this.field7751, this.field7753, this.field7745);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)F")
    public static final float method3230(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
    private class531(byte[] arg0) {
        this.method3225(arg0);
    }
}
