import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class25 extends class183 {

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "Z")
    private static boolean field443 = false;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    private static int field436;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    private static int field439;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    private static int field449;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    private static int field453;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Z")
    private boolean field426;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "Z")
    private boolean field438;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "[B")
    private static byte[] field442;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "[B")
    private byte[] field452;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[F")
    private static float[] field424;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "[F")
    private static float[] field432;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "[F")
    private static float[] field434;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "[F")
    private static float[] field437;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "[F")
    private float[] field444;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "[F")
    private static float[] field445;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "[F")
    private static float[] field447;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "[F")
    private static float[] field448;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[I")
    private static int[] field421;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "[I")
    private static int[] field428;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "[I")
    private static int[] field430;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "[Lji;")
    private static class107[] field431;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "[Ln;")
    public static class141[] field433;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "[Lna;")
    private static class142[] field427;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "[Ld;")
    private static class34[] field422;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "[Z")
    private static boolean[] field425;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "[[B")
    private byte[][] field441;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
    public static final int method179() {
        int var0 = field442[field449] >> field439 & 0x1;
        field439++;
        field449 += field439 >> 3;
        field439 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lve;II)Lcb;")
    public static final class25 method180(class225 arg0, int arg1, int arg2) {
        if (method188(arg0)) {
            byte[] var3 = arg0.method1466(arg1, arg2, (byte) -126);
            return var3 == null ? null : new class25(var3);
        } else {
            arg0.method1453(arg1, true, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([BI)V")
    private static final void method181(byte[] arg0, int arg1) {
        field442 = arg0;
        field449 = arg1;
        field439 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)I")
    public static final int method182(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field439) {
            int var4 = 8 - field439;
            int var5 = (0x1 << var4) - 1;
            var1 += (field442[field449] >> field439 & var5) << var2;
            field439 = 0;
            field449++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field442[field449] >> field439 & var3) << var2;
            field439 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([I)Lti;")
    public final class209 method183(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field452 == null) {
            this.field429 = 0;
            this.field444 = new float[field453];
            this.field452 = new byte[this.field450];
            this.field451 = 0;
            this.field454 = 0;
        }
        while (this.field454 < this.field441.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method186(this.field454);
            if (var3 != null) {
                int var4 = this.field451;
                int var5 = var3.length;
                if (var5 > this.field450 - var4) {
                    var5 = this.field450 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field452[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field451;
                }
                this.field451 = var4;
            }
            this.field454++;
        }
        this.field444 = null;
        byte[] var2 = this.field452;
        this.field452 = null;
        return new class209(this.field446, var2, this.field435, this.field423, this.field426);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([B)V")
    private final void method184(byte[] arg0) {
        class66 var2 = new class66(arg0);
        this.field446 = var2.method528(true);
        this.field450 = var2.method528(true);
        this.field435 = var2.method528(true);
        this.field423 = var2.method528(true);
        if (this.field423 < 0) {
            this.field423 = ~this.field423;
            this.field426 = true;
        }
        int var3 = var2.method528(true);
        this.field441 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method506(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method515(var5, 0, var7, 0);
            this.field441[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "([B)V")
    private static final void method185(byte[] arg0) {
        method181(arg0, 0);
        field436 = 0x1 << method182(4);
        field453 = 0x1 << method182(4);
        field424 = new float[field453];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field436 : field453;
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
            int var25 = class59.method449(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class192.method1217(var25, var26, 702);
            }
            if (var1 == 0) {
                field432 = var18;
                field445 = var20;
                field448 = var22;
                field421 = var24;
            } else {
                field434 = var18;
                field437 = var20;
                field447 = var22;
                field430 = var24;
            }
        }
        int var2 = method182(8) + 1;
        field433 = new class141[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field433[var3] = new class141();
        }
        int var4 = method182(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method182(16);
        }
        int var6 = method182(6) + 1;
        field431 = new class107[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field431[var7] = new class107();
        }
        int var8 = method182(6) + 1;
        field422 = new class34[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field422[var9] = new class34();
        }
        int var10 = method182(6) + 1;
        field427 = new class142[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field427[var11] = new class142();
        }
        int var12 = method182(6) + 1;
        field425 = new boolean[var12];
        field428 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field425[var13] = method179() != 0;
            method182(16);
            method182(16);
            field428[var13] = method182(8);
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)[F")
    private final float[] method186(int arg0) {
        method181(this.field441[arg0], 0);
        method179();
        int var2 = method182(class59.method449(field428.length - 1, false));
        boolean var3 = field425[var2];
        int var4 = var3 ? field453 : field436;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method179() != 0;
            var6 = method179() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field436 >> 2);
            var9 = (field436 >> 2) + (var4 >> 2);
            var10 = field436 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field436 >> 2);
            var12 = (field436 >> 2) + (var4 - (var4 >> 2));
            var13 = field436 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class142 var14 = field427[field428[var2]];
        int var15 = var14.field2528;
        int var16 = var14.field2529[var15];
        boolean var17 = !field431[var16].method775();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2530; var19++) {
            class34 var95 = field422[var14.field2527[var19]];
            float[] var96 = field424;
            var95.method237(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2528;
            int var21 = var14.field2529[var20];
            field431[var21].method770(field424, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field424[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field424;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field434 : field432;
            float[] var30 = var3 ? field437 : field445;
            float[] var31 = var3 ? field447 : field448;
            int[] var32 = var3 ? field430 : field421;
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
            int var35 = class59.method449(var4 - 1, false);
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
                field424[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field424[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field429 > 0) {
            int var49 = this.field429 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field438) {
                for (int var50 = 0; var50 < this.field440; var50++) {
                    int var51 = (this.field429 >> 1) + var50;
                    var48[var50] += this.field444[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field424[var52];
                }
            }
        }
        float[] var54 = this.field444;
        this.field444 = field424;
        field424 = var54;
        this.field429 = var4;
        this.field440 = var12 - (var4 >> 1);
        this.field438 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
    public static void method187() {
        field442 = null;
        field433 = null;
        field431 = null;
        field422 = null;
        field427 = null;
        field425 = null;
        field428 = null;
        field424 = null;
        field432 = null;
        field445 = null;
        field448 = null;
        field434 = null;
        field437 = null;
        field447 = null;
        field421 = null;
        field430 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lve;)Z")
    private static final boolean method188(class225 arg0) {
        if (!field443) {
            byte[] var1 = arg0.method1466(0, 0, (byte) -125);
            if (var1 == null) {
                return false;
            }
            method185(var1);
            field443 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([B)V")
    private class25(byte[] arg0) {
        this.method184(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)F")
    public static final float method189(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }
}
