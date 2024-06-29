import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class175 extends class577 {

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "Z")
    private static boolean field2705 = false;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "I")
    private static int field2703;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
    private int field2704;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    private int field2707;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
    private int field2708;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    private static int field2709;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
    private int field2716;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
    private static int field2718;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!dfa", name = "P", descriptor = "I")
    private static int field2727;

    @OriginalMember(owner = "client!dfa", name = "Q", descriptor = "I")
    private int field2728;

    @OriginalMember(owner = "client!dfa", name = "S", descriptor = "I")
    private int field2730;

    @OriginalMember(owner = "client!dfa", name = "T", descriptor = "I")
    private int field2731;

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "Z")
    private boolean field2721;

    @OriginalMember(owner = "client!dfa", name = "N", descriptor = "Z")
    private boolean field2725;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "[B")
    private static byte[] field2713;

    @OriginalMember(owner = "client!dfa", name = "R", descriptor = "[B")
    private byte[] field2729;

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "[F")
    private static float[] field2698;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "[F")
    private static float[] field2700;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "[F")
    private static float[] field2710;

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "[F")
    private static float[] field2714;

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "[F")
    private static float[] field2715;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "[F")
    private static float[] field2720;

    @OriginalMember(owner = "client!dfa", name = "L", descriptor = "[F")
    private static float[] field2723;

    @OriginalMember(owner = "client!dfa", name = "O", descriptor = "[F")
    private float[] field2726;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "[I")
    private static int[] field2702;

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "[I")
    private static int[] field2706;

    @OriginalMember(owner = "client!dfa", name = "M", descriptor = "[I")
    private static int[] field2724;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "[Ljt;")
    private static class112[] field2717;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "[Lcka;")
    private static class185[] field2712;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "[Lgk;")
    private static class499[] field2719;

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "[Lsca;")
    public static class50[] field2699;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "[Z")
    private static boolean[] field2701;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "[[B")
    private byte[][] field2711;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([BI)V", line = 3)
    private static final void method1266(byte[] arg0, int arg1) {
        field2713 = arg0;
        field2718 = arg1;
        field2703 = 0;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lwia;)Z", line = 9)
    private static final boolean method1267(class791 arg0) {
        if (!field2705) {
            byte[] var1 = arg0.method4339(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1272(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)I", line = 27)
    public static final int method1268(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2703) {
            int var4 = 8 - field2703;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2713[field2718] >> field2703 & var5) << var2;
            field2703 = 0;
            field2718++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2713[field2718] >> field2703 & var3) << var2;
            field2703 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "()V", line = 56)
    public static void method1269() {
        field2713 = null;
        field2699 = null;
        field2719 = null;
        field2712 = null;
        field2717 = null;
        field2701 = null;
        field2724 = null;
        field2723 = null;
        field2720 = null;
        field2698 = null;
        field2714 = null;
        field2700 = null;
        field2715 = null;
        field2710 = null;
        field2706 = null;
        field2702 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)F", line = 80)
    public static final float method1270(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([I)Ldga;", line = 94)
    public final class218 method1271(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2729 == null) {
            this.field2704 = 0;
            this.field2726 = new float[field2727];
            this.field2729 = new byte[this.field2722];
            this.field2730 = 0;
            this.field2731 = 0;
        }
        while (this.field2731 < this.field2711.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1276(this.field2731);
            if (var3 != null) {
                int var4 = this.field2730;
                int var5 = var3.length;
                if (var5 > this.field2722 - var4) {
                    var5 = this.field2722 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2729[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2730;
                }
                this.field2730 = var4;
            }
            this.field2731++;
        }
        this.field2726 = null;
        byte[] var2 = this.field2729;
        this.field2729 = null;
        return new class218(this.field2707, var2, this.field2716, this.field2728, this.field2725);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([B)V", line = 158)
    private static final void method1272(byte[] arg0) {
        method1266(arg0, 0);
        field2709 = 0x1 << method1268(4);
        field2727 = 0x1 << method1268(4);
        field2723 = new float[field2727];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2709 : field2727;
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
            int var25 = class89.method668(var17 - 1, (byte) 45);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class207.method1435(var26, var25, 0);
            }
            if (var1 == 0) {
                field2720 = var18;
                field2698 = var20;
                field2714 = var22;
                field2706 = var24;
            } else {
                field2700 = var18;
                field2715 = var20;
                field2710 = var22;
                field2702 = var24;
            }
        }
        int var2 = method1268(8) + 1;
        field2699 = new class50[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2699[var3] = new class50();
        }
        int var4 = method1268(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1268(16);
        }
        int var6 = method1268(6) + 1;
        field2719 = new class499[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2719[var7] = new class499();
        }
        int var8 = method1268(6) + 1;
        field2712 = new class185[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2712[var9] = new class185();
        }
        int var10 = method1268(6) + 1;
        field2717 = new class112[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2717[var11] = new class112();
        }
        int var12 = method1268(6) + 1;
        field2701 = new boolean[var12];
        field2724 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2701[var13] = method1274() != 0;
            method1268(16);
            method1268(16);
            field2724[var13] = method1268(8);
        }
        field2705 = true;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lwia;I)Ldfa;", line = 313)
    public static final class175 method1273(class791 arg0, int arg1) {
        if (method1267(arg0)) {
            byte[] var2 = arg0.method4335(arg1, 0);
            return var2 == null ? null : new class175(var2);
        } else {
            arg0.method4349((byte) -102, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "()I", line = 333)
    public static final int method1274() {
        int var0 = field2713[field2718] >> field2703 & 0x1;
        field2703++;
        field2718 += field2703 >> 3;
        field2703 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "([B)V", line = 343)
    private final void method1275(byte[] arg0) {
        class494 var2 = new class494(arg0);
        this.field2707 = var2.method2976(-127);
        this.field2722 = var2.method2976(-128);
        this.field2716 = var2.method2976(-128);
        this.field2728 = var2.method2976(-124);
        if (this.field2728 < 0) {
            this.field2728 = ~this.field2728;
            this.field2725 = true;
        }
        int var3 = var2.method2976(-127);
        this.field2711 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2964((byte) 37);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2958(true, var7, 0, var5);
            this.field2711[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)[F", line = 386)
    private final float[] method1276(int arg0) {
        method1266(this.field2711[arg0], 0);
        method1274();
        int var2 = method1268(class89.method668(field2724.length - 1, (byte) 45));
        boolean var3 = field2701[var2];
        int var4 = var3 ? field2727 : field2709;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1274() != 0;
            var6 = method1274() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2709 >> 2);
            var9 = (field2709 >> 2) + (var4 >> 2);
            var10 = field2709 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2709 >> 2);
            var12 = (field2709 >> 2) + (var4 - (var4 >> 2));
            var13 = field2709 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class112 var14 = field2717[field2724[var2]];
        int var15 = var14.field1716;
        int var16 = var14.field1714[var15];
        boolean var17 = !field2719[var16].method3025();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1715; var19++) {
            class185 var95 = field2712[var14.field1717[var19]];
            float[] var96 = field2723;
            var95.method1304(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1716;
            int var21 = var14.field1714[var20];
            field2719[var21].method3030(field2723, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2723[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2723;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2700 : field2720;
            float[] var30 = var3 ? field2715 : field2698;
            float[] var31 = var3 ? field2710 : field2714;
            int[] var32 = var3 ? field2702 : field2706;
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
            int var35 = class89.method668(var4 - 1, (byte) 45);
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
                field2723[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2723[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2704 > 0) {
            int var49 = this.field2704 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2721) {
                for (int var50 = 0; var50 < this.field2708; var50++) {
                    int var51 = (this.field2704 >> 1) + var50;
                    var48[var50] += this.field2726[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2723[var52];
                }
            }
        }
        float[] var54 = this.field2726;
        this.field2726 = field2723;
        field2723 = var54;
        this.field2704 = var4;
        this.field2708 = var12 - (var4 >> 1);
        this.field2721 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lwia;II)Ldfa;", line = 802)
    public static final class175 method1277(class791 arg0, int arg1, int arg2) {
        if (method1267(arg0)) {
            byte[] var3 = arg0.method4339(arg2, 0, arg1);
            return var3 == null ? null : new class175(var3);
        } else {
            arg0.method4359(arg1, 0, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "([B)V", line = 817)
    private class175(byte[] arg0) {
        this.method1275(arg0);
    }
}
