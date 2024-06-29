import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class33 extends class45 {

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "Z")
    private static boolean field491 = false;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    private static int field468;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    private static int field469;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    private static int field470;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    private static int field483;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Z")
    private boolean field472;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "Z")
    private boolean field477;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "[B")
    private static byte[] field487;

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "[B")
    private byte[] field500;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "[F")
    private float[] field467;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[F")
    private static float[] field478;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "[F")
    private static float[] field479;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "[F")
    private static float[] field482;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "[F")
    private static float[] field489;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "[F")
    private static float[] field492;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "[F")
    private static float[] field494;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "[F")
    private static float[] field498;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "[I")
    private static int[] field480;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "[I")
    private static int[] field495;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "[I")
    private static int[] field499;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "[Llg;")
    private static class100[] field474;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "[Ltj;")
    private static class312[] field481;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "[Lvc;")
    private static class69[] field493;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "[Lb;")
    public static class91[] field488;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "[Z")
    private static boolean[] field475;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "[[B")
    private byte[][] field471;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lth;)Z", line = 4)
    private static final boolean method225(class57 arg0) {
        if (!field491) {
            byte[] var1 = arg0.method472(0, 82, 0);
            if (var1 == null) {
                return false;
            }
            method233(var1);
            field491 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)[F", line = 26)
    private final float[] method226(int arg0) {
        method235(this.field471[arg0], 0);
        method232();
        int var2 = method229(class148.method1151(field499.length - 1, -13523));
        boolean var3 = field475[var2];
        int var4 = var3 ? field468 : field470;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method232() != 0;
            var6 = method232() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field470 >> 2);
            var9 = (field470 >> 2) + (var4 >> 2);
            var10 = field470 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field470 >> 2);
            var12 = (field470 >> 2) + (var4 - (var4 >> 2));
            var13 = field470 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class100 var14 = field474[field499[var2]];
        int var15 = var14.field1648;
        int var16 = var14.field1646[var15];
        boolean var17 = !field493[var16].method587();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1649; var19++) {
            class312 var20 = field481[var14.field1647[var19]];
            float[] var21 = field478;
            var20.method2214(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1648;
            int var23 = var14.field1646[var22];
            field493[var23].method589(field478, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field478[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field478;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field482 : field494;
            float[] var32 = var3 ? field492 : field489;
            float[] var33 = var3 ? field498 : field479;
            int[] var34 = var3 ? field480 : field495;
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
            int var47 = class148.method1151(var4 - 1, -13523);
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
                field478[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field478[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field490 > 0) {
            int var91 = this.field490 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field472) {
                for (int var92 = 0; var92 < this.field486; var92++) {
                    int var93 = (this.field490 >> 1) + var92;
                    var90[var92] += this.field467[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field478[var94];
                }
            }
        }
        float[] var96 = this.field467;
        this.field467 = field478;
        field478 = var96;
        this.field490 = var4;
        this.field486 = var12 - (var4 >> 1);
        this.field472 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V", line = 441)
    public static void method227() {
        field487 = null;
        field488 = null;
        field493 = null;
        field481 = null;
        field474 = null;
        field475 = null;
        field499 = null;
        field478 = null;
        field494 = null;
        field489 = null;
        field479 = null;
        field482 = null;
        field492 = null;
        field498 = null;
        field495 = null;
        field480 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([I)Lh;", line = 460)
    public final class110 method228(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field500 == null) {
            this.field490 = 0;
            this.field467 = new float[field468];
            this.field500 = new byte[this.field473];
            this.field497 = 0;
            this.field496 = 0;
        }
        while (this.field496 < this.field471.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method226(this.field496);
            if (var2 != null) {
                int var3 = this.field497;
                int var4 = var2.length;
                if (var4 > this.field473 - var3) {
                    var4 = this.field473 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field500[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field497;
                }
                this.field497 = var3;
            }
            this.field496++;
        }
        this.field467 = null;
        byte[] var7 = this.field500;
        this.field500 = null;
        return new class110(this.field484, var7, this.field476, this.field485, this.field477);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)I", line = 523)
    public static final int method229(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field469) {
            int var3 = 8 - field469;
            int var4 = (0x1 << var3) - 1;
            var1 += (field487[field483] >> field469 & var4) << var2;
            field469 = 0;
            field483++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field487[field483] >> field469 & var5) << var2;
            field469 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lth;II)Ldl;", line = 550)
    public static final class33 method230(class57 arg0, int arg1, int arg2) {
        if (method225(arg0)) {
            byte[] var3 = arg0.method472(arg2, 47, arg1);
            return var3 == null ? null : new class33(var3);
        } else {
            arg0.method486(arg1, arg2, -86);
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([B)V", line = 575)
    private final void method231(byte[] arg0) {
        class227 var2 = new class227(arg0);
        this.field484 = var2.method1715((byte) -107);
        this.field473 = var2.method1715((byte) 97);
        this.field476 = var2.method1715((byte) 91);
        this.field485 = var2.method1715((byte) 29);
        if (this.field485 < 0) {
            this.field485 = ~this.field485;
            this.field477 = true;
        }
        int var3 = var2.method1715((byte) 104);
        this.field471 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1720((byte) -77);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1753(var5, -8988, 0, var7);
            this.field471[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()I", line = 620)
    public static final int method232() {
        int var0 = field487[field483] >> field469 & 0x1;
        field469++;
        field483 += field469 >> 3;
        field469 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([B)V", line = 632)
    private class33(byte[] arg0) {
        this.method231(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "([B)V", line = 637)
    private static final void method233(byte[] arg0) {
        method235(arg0, 0);
        field470 = 0x1 << method229(4);
        field468 = 0x1 << method229(4);
        field478 = new float[field468];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field470 : field468;
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
            int var13 = class148.method1151(var5 - 1, -13523);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class169.method1316(var13, -1423101567, var14);
            }
            if (var1 == 0) {
                field494 = var6;
                field489 = var8;
                field479 = var10;
                field495 = var12;
            } else {
                field482 = var6;
                field492 = var8;
                field498 = var10;
                field480 = var12;
            }
        }
        int var15 = method229(8) + 1;
        field488 = new class91[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field488[var16] = new class91();
        }
        int var17 = method229(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method229(16);
        }
        int var19 = method229(6) + 1;
        field493 = new class69[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field493[var20] = new class69();
        }
        int var21 = method229(6) + 1;
        field481 = new class312[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field481[var22] = new class312();
        }
        int var23 = method229(6) + 1;
        field474 = new class100[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field474[var24] = new class100();
        }
        int var25 = method229(6) + 1;
        field475 = new boolean[var25];
        field499 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field475[var26] = method232() != 0;
            method229(16);
            method229(16);
            field499[var26] = method229(8);
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)F", line = 791)
    public static final float method234(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([BI)V", line = 803)
    private static final void method235(byte[] arg0, int arg1) {
        field487 = arg0;
        field483 = arg1;
        field469 = 0;
    }
}
