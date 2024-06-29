import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class12 extends class237 {

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "Z")
    private static boolean field150 = false;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    private static int field130;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    private static int field144;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    private static int field145;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    private static int field154;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Z")
    private boolean field134;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "Z")
    private boolean field138;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "[B")
    private static byte[] field153;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "[B")
    private byte[] field162;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "[F")
    private static float[] field131;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "[F")
    private float[] field139;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "[F")
    private static float[] field141;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "[F")
    private static float[] field147;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "[F")
    private static float[] field149;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "[F")
    private static float[] field152;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "[F")
    private static float[] field155;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "[F")
    private static float[] field158;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "[I")
    private static int[] field140;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "[I")
    private static int[] field146;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "[I")
    private static int[] field156;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "[Lah;")
    private static class146[] field148;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "[Lsg;")
    private static class151[] field143;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[Lsf;")
    private static class199[] field136;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "[Lck;")
    public static class254[] field135;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "[Z")
    private static boolean[] field151;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "[[B")
    private byte[][] field159;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([BI)V")
    private static final void method57(byte[] arg0, int arg1) {
        field153 = arg0;
        field130 = arg1;
        field154 = 0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([I)Lqh;")
    public final class29 method58(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field162 == null) {
            this.field160 = 0;
            this.field139 = new float[field145];
            this.field162 = new byte[this.field133];
            this.field161 = 0;
            this.field163 = 0;
        }
        while (this.field163 < this.field159.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method61(this.field163);
            if (var3 != null) {
                int var4 = this.field161;
                int var5 = var3.length;
                if (var5 > this.field133 - var4) {
                    var5 = this.field133 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field162[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field161;
                }
                this.field161 = var4;
            }
            this.field163++;
        }
        this.field139 = null;
        byte[] var2 = this.field162;
        this.field162 = null;
        return new class29(this.field137, var2, this.field132, this.field142, this.field134);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Leh;)Z")
    private static final boolean method59(class137 arg0) {
        if (!field150) {
            byte[] var1 = arg0.method928(0, (byte) 124, 0);
            if (var1 == null) {
                return false;
            }
            method62(var1);
            field150 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Leh;II)Lnc;")
    public static final class12 method60(class137 arg0, int arg1, int arg2) {
        if (method59(arg0)) {
            byte[] var3 = arg0.method928(arg1, (byte) 119, arg2);
            return var3 == null ? null : new class12(var3);
        } else {
            arg0.method947(arg1, arg2, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)[F")
    private final float[] method61(int arg0) {
        method57(this.field159[arg0], 0);
        method64();
        int var2 = method65(class60.method352(field140.length - 1, (byte) -47));
        boolean var3 = field151[var2];
        int var4 = var3 ? field145 : field144;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method64() != 0;
            var6 = method64() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field144 >> 2);
            var9 = (field144 >> 2) + (var4 >> 2);
            var10 = field144 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field144 >> 2);
            var12 = (field144 >> 2) + (var4 - (var4 >> 2));
            var13 = field144 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class146 var14 = field148[field140[var2]];
        int var15 = var14.field2299;
        int var16 = var14.field2298[var15];
        boolean var17 = !field136[var16].method1392();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2300; var19++) {
            class151 var95 = field143[var14.field2301[var19]];
            float[] var96 = field149;
            var95.method1039(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2299;
            int var21 = var14.field2298[var20];
            field136[var21].method1386(field149, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field149[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field149;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field141 : field155;
            float[] var30 = var3 ? field152 : field147;
            float[] var31 = var3 ? field158 : field131;
            int[] var32 = var3 ? field156 : field146;
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
            int var35 = class60.method352(var4 - 1, (byte) -35);
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
                field149[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field149[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field160 > 0) {
            int var49 = this.field160 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field138) {
                for (int var50 = 0; var50 < this.field157; var50++) {
                    int var51 = (this.field160 >> 1) + var50;
                    var48[var50] += this.field139[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field149[var52];
                }
            }
        }
        float[] var54 = this.field139;
        this.field139 = field149;
        field149 = var54;
        this.field160 = var4;
        this.field157 = var12 - (var4 >> 1);
        this.field138 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B)V")
    private static final void method62(byte[] arg0) {
        method57(arg0, 0);
        field144 = 0x1 << method65(4);
        field145 = 0x1 << method65(4);
        field149 = new float[field145];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field144 : field145;
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
            int var25 = class60.method352(var17 - 1, (byte) -119);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class150.method1036((byte) -75, var25, var26);
            }
            if (var1 == 0) {
                field155 = var18;
                field147 = var20;
                field131 = var22;
                field146 = var24;
            } else {
                field141 = var18;
                field152 = var20;
                field158 = var22;
                field156 = var24;
            }
        }
        int var2 = method65(8) + 1;
        field135 = new class254[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field135[var3] = new class254();
        }
        int var4 = method65(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method65(16);
        }
        int var6 = method65(6) + 1;
        field136 = new class199[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field136[var7] = new class199();
        }
        int var8 = method65(6) + 1;
        field143 = new class151[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field143[var9] = new class151();
        }
        int var10 = method65(6) + 1;
        field148 = new class146[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field148[var11] = new class146();
        }
        int var12 = method65(6) + 1;
        field151 = new boolean[var12];
        field140 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field151[var13] = method64() != 0;
            method65(16);
            method65(16);
            field140[var13] = method65(8);
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)F")
    public static final float method63(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()I")
    public static final int method64() {
        int var0 = field153[field130] >> field154 & 0x1;
        field154++;
        field130 += field154 >> 3;
        field154 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I")
    public static final int method65(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field154) {
            int var4 = 8 - field154;
            int var5 = (0x1 << var4) - 1;
            var1 += (field153[field130] >> field154 & var5) << var2;
            field154 = 0;
            field130++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field153[field130] >> field154 & var3) << var2;
            field154 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "([B)V")
    private final void method66(byte[] arg0) {
        class96 var2 = new class96(arg0);
        this.field137 = var2.method597(-1197332568);
        this.field133 = var2.method597(-1197332568);
        this.field132 = var2.method597(-1197332568);
        this.field142 = var2.method597(-1197332568);
        if (this.field142 < 0) {
            this.field142 = ~this.field142;
            this.field134 = true;
        }
        int var3 = var2.method597(-1197332568);
        this.field159 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method584(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method596(32, var5, 0, var7);
            this.field159[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
    public static void method67() {
        field153 = null;
        field135 = null;
        field136 = null;
        field143 = null;
        field148 = null;
        field151 = null;
        field140 = null;
        field149 = null;
        field155 = null;
        field147 = null;
        field131 = null;
        field141 = null;
        field152 = null;
        field158 = null;
        field146 = null;
        field156 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
    private class12(byte[] arg0) {
        this.method66(arg0);
    }
}
