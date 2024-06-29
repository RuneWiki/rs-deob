import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class168 extends class287 {

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Z")
    private static boolean field2761 = false;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    private static int field2749;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    private int field2752;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    private static int field2757;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    private static int field2763;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    private int field2765;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    private static int field2768;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    private int field2771;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    private int field2774;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    private int field2778;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    private int field2779;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "Z")
    private boolean field2766;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "Z")
    private boolean field2776;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "[B")
    private static byte[] field2764;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "[B")
    private byte[] field2780;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "[F")
    private static float[] field2748;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "[F")
    private float[] field2750;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[F")
    private static float[] field2751;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "[F")
    private static float[] field2753;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "[F")
    private static float[] field2769;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "[F")
    private static float[] field2770;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "[F")
    private static float[] field2772;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "[F")
    private static float[] field2775;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "[I")
    private static int[] field2747;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "[I")
    private static int[] field2756;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "[I")
    private static int[] field2760;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "[Lnc;")
    private static class13[] field2754;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "[Ldh;")
    private static class140[] field2767;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "[Lde;")
    public static class236[] field2762;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "[Lu;")
    private static class35[] field2777;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "[Z")
    private static boolean[] field2759;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "[[B")
    private byte[][] field2773;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()V", line = 8)
    public static void method1251() {
        field2764 = null;
        field2762 = null;
        field2767 = null;
        field2777 = null;
        field2754 = null;
        field2759 = null;
        field2747 = null;
        field2775 = null;
        field2753 = null;
        field2770 = null;
        field2769 = null;
        field2748 = null;
        field2751 = null;
        field2772 = null;
        field2756 = null;
        field2760 = null;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)[F", line = 26)
    private final float[] method1252(int arg0) {
        method1255(this.field2773[arg0], 0);
        method1254();
        int var2 = method1257(class141.method1050(field2747.length - 1, (byte) -41));
        boolean var3 = field2759[var2];
        int var4 = var3 ? field2749 : field2757;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1254() != 0;
            var6 = method1254() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2757 >> 2);
            var9 = (field2757 >> 2) + (var4 >> 2);
            var10 = field2757 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2757 >> 2);
            var12 = (field2757 >> 2) + (var4 - (var4 >> 2));
            var13 = field2757 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class13 var14 = field2754[field2747[var2]];
        int var15 = var14.field217;
        int var16 = var14.field216[var15];
        boolean var17 = !field2767[var16].method1044();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field214; var19++) {
            class35 var20 = field2777[var14.field215[var19]];
            float[] var21 = field2775;
            var20.method310(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field217;
            int var23 = var14.field216[var22];
            field2767[var23].method1045(field2775, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2775[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2775;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2748 : field2753;
            float[] var32 = var3 ? field2751 : field2770;
            float[] var33 = var3 ? field2772 : field2769;
            int[] var34 = var3 ? field2760 : field2756;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class141.method1050(var4 - 1, (byte) -41);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field2775[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2775[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2771 > 0) {
            int var91 = this.field2771 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2776) {
                for (int var92 = 0; var92 < this.field2752; var92++) {
                    int var93 = (this.field2771 >> 1) + var92;
                    var90[var92] += this.field2750[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2775[var94];
                }
            }
        }
        float[] var96 = this.field2750;
        this.field2750 = field2775;
        field2775 = var96;
        this.field2771 = var4;
        this.field2752 = var12 - (var4 >> 1);
        this.field2776 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([B)V", line = 439)
    private static final void method1253(byte[] arg0) {
        method1255(arg0, 0);
        field2757 = 0x1 << method1257(4);
        field2749 = 0x1 << method1257(4);
        field2775 = new float[field2749];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2757 : field2749;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class141.method1050(var5 - 1, (byte) -41);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class342.method2369((byte) 62, var14, var13);
            }
            if (var1 == 0) {
                field2753 = var6;
                field2770 = var8;
                field2769 = var10;
                field2756 = var12;
            } else {
                field2748 = var6;
                field2751 = var8;
                field2772 = var10;
                field2760 = var12;
            }
        }
        int var15 = method1257(8) + 1;
        field2762 = new class236[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2762[var16] = new class236();
        }
        int var17 = method1257(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1257(16);
        }
        int var19 = method1257(6) + 1;
        field2767 = new class140[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2767[var20] = new class140();
        }
        int var21 = method1257(6) + 1;
        field2777 = new class35[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2777[var22] = new class35();
        }
        int var23 = method1257(6) + 1;
        field2754 = new class13[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2754[var24] = new class13();
        }
        int var25 = method1257(6) + 1;
        field2759 = new boolean[var25];
        field2747 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2759[var26] = method1254() != 0;
            method1257(16);
            method1257(16);
            field2747[var26] = method1257(8);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()I", line = 592)
    public static final int method1254() {
        int var0 = field2764[field2763] >> field2768 & 0x1;
        field2768++;
        field2763 += field2768 >> 3;
        field2768 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([BI)V", line = 603)
    private static final void method1255(byte[] arg0, int arg1) {
        field2764 = arg0;
        field2763 = arg1;
        field2768 = 0;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)F", line = 620)
    public static final float method1256(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)I", line = 637)
    public static final int method1257(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2768) {
            int var3 = 8 - field2768;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2764[field2763] >> field2768 & var4) << var2;
            field2768 = 0;
            field2763++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2764[field2763] >> field2768 & var5) << var2;
            field2768 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lug;)Z", line = 665)
    private static final boolean method1258(class253 arg0) {
        if (!field2761) {
            byte[] var1 = arg0.method1813(0, 0, true);
            if (var1 == null) {
                return false;
            }
            method1253(var1);
            field2761 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lug;II)Loj;", line = 682)
    public static final class168 method1259(class253 arg0, int arg1, int arg2) {
        if (method1258(arg0)) {
            byte[] var3 = arg0.method1813(arg2, arg1, true);
            return var3 == null ? null : new class168(var3);
        } else {
            arg0.method1823(arg1, arg2, (byte) -59);
            return null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([B)V", line = 703)
    private final void method1260(byte[] arg0) {
        class6 var2 = new class6(arg0);
        this.field2765 = var2.method73((byte) 19);
        this.field2774 = var2.method73((byte) 19);
        this.field2755 = var2.method73((byte) 19);
        this.field2758 = var2.method73((byte) 19);
        if (this.field2758 < 0) {
            this.field2758 = ~this.field2758;
            this.field2766 = true;
        }
        int var3 = var2.method73((byte) 19);
        this.field2773 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method58(-288140008);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method60((byte) 71, 0, var5, var7);
            this.field2773[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([I)Lid;", line = 746)
    public final class266 method1261(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2780 == null) {
            this.field2771 = 0;
            this.field2750 = new float[field2749];
            this.field2780 = new byte[this.field2774];
            this.field2779 = 0;
            this.field2778 = 0;
        }
        while (this.field2778 < this.field2773.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1252(this.field2778);
            if (var2 != null) {
                int var3 = this.field2779;
                int var4 = var2.length;
                if (var4 > this.field2774 - var3) {
                    var4 = this.field2774 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2780[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2779;
                }
                this.field2779 = var3;
            }
            this.field2778++;
        }
        this.field2750 = null;
        byte[] var7 = this.field2780;
        this.field2780 = null;
        return new class266(this.field2765, var7, this.field2755, this.field2758, this.field2766);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([B)V", line = 803)
    private class168(byte[] arg0) {
        this.method1260(arg0);
    }
}
