import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class22 extends class54 {

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "Z")
    private static boolean field378 = false;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    private static int field359;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    private static int field372;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    private static int field373;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    private static int field382;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "Z")
    private boolean field370;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "Z")
    private boolean field389;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "[B")
    private static byte[] field380;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "[B")
    private byte[] field392;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "[F")
    private float[] field360;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "[F")
    private static float[] field364;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "[F")
    private static float[] field366;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "[F")
    private static float[] field369;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "[F")
    private static float[] field374;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "[F")
    private static float[] field379;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "[F")
    private static float[] field381;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "[F")
    private static float[] field383;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "[I")
    private static int[] field367;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "[I")
    private static int[] field368;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "[I")
    private static int[] field371;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "[Lpi;")
    public static class172[] field375;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "[Lvg;")
    private static class234[] field386;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "[Lei;")
    private static class53[] field365;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "[Li;")
    private static class87[] field361;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "[Z")
    private static boolean[] field384;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "[[B")
    private byte[][] field363;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lwa;)Z")
    private static final boolean method146(class238 arg0) {
        if (!field378) {
            byte[] var1 = arg0.method1547(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method152(var1);
            field378 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BI)V")
    private static final void method147(byte[] arg0, int arg1) {
        field380 = arg0;
        field382 = arg1;
        field372 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    public static void method148() {
        field380 = null;
        field375 = null;
        field386 = null;
        field361 = null;
        field365 = null;
        field384 = null;
        field367 = null;
        field374 = null;
        field369 = null;
        field381 = null;
        field364 = null;
        field383 = null;
        field379 = null;
        field366 = null;
        field371 = null;
        field368 = null;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)[F")
    private final float[] method149(int arg0) {
        method147(this.field363[arg0], 0);
        method156();
        int var2 = method154(class232.method1499(8, field367.length - 1));
        boolean var3 = field384[var2];
        int var4 = var3 ? field359 : field373;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method156() != 0;
            var6 = method156() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field373 >> 2);
            var9 = (field373 >> 2) + (var4 >> 2);
            var10 = field373 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field373 >> 2);
            var12 = (field373 >> 2) + (var4 - (var4 >> 2));
            var13 = field373 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class53 var14 = field365[field367[var2]];
        int var15 = var14.field1054;
        int var16 = var14.field1052[var15];
        boolean var17 = !field386[var16].method1510();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1053; var19++) {
            class87 var95 = field361[var14.field1051[var19]];
            float[] var96 = field374;
            var95.method584(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1054;
            int var21 = var14.field1052[var20];
            field386[var21].method1514(field374, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field374[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field374;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field383 : field369;
            float[] var30 = var3 ? field379 : field381;
            float[] var31 = var3 ? field366 : field364;
            int[] var32 = var3 ? field368 : field371;
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
            int var35 = class232.method1499(8, var4 - 1);
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
                field374[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field374[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field385 > 0) {
            int var49 = this.field385 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field370) {
                for (int var50 = 0; var50 < this.field387; var50++) {
                    int var51 = (this.field385 >> 1) + var50;
                    var48[var50] += this.field360[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field374[var52];
                }
            }
        }
        float[] var54 = this.field360;
        this.field360 = field374;
        field374 = var54;
        this.field385 = var4;
        this.field387 = var12 - (var4 >> 1);
        this.field370 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lwa;II)Lbj;")
    public static final class22 method150(class238 arg0, int arg1, int arg2) {
        if (method146(arg0)) {
            byte[] var3 = arg0.method1547(arg2, 0, arg1);
            return var3 == null ? null : new class22(var3);
        } else {
            arg0.method1563(-14250, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([I)Lne;")
    public final class146 method151(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field392 == null) {
            this.field385 = 0;
            this.field360 = new float[field359];
            this.field392 = new byte[this.field376];
            this.field390 = 0;
            this.field391 = 0;
        }
        while (this.field391 < this.field363.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method149(this.field391);
            if (var3 != null) {
                int var4 = this.field390;
                int var5 = var3.length;
                if (var5 > this.field376 - var4) {
                    var5 = this.field376 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field392[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field390;
                }
                this.field390 = var4;
            }
            this.field391++;
        }
        this.field360 = null;
        byte[] var2 = this.field392;
        this.field392 = null;
        return new class146(this.field362, var2, this.field388, this.field377, this.field389);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([B)V")
    private static final void method152(byte[] arg0) {
        method147(arg0, 0);
        field373 = 0x1 << method154(4);
        field359 = 0x1 << method154(4);
        field374 = new float[field359];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field373 : field359;
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
            int var25 = class232.method1499(8, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class96.method641(var25, var26, 32768);
            }
            if (var1 == 0) {
                field369 = var18;
                field381 = var20;
                field364 = var22;
                field371 = var24;
            } else {
                field383 = var18;
                field379 = var20;
                field366 = var22;
                field368 = var24;
            }
        }
        int var2 = method154(8) + 1;
        field375 = new class172[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field375[var3] = new class172();
        }
        int var4 = method154(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method154(16);
        }
        int var6 = method154(6) + 1;
        field386 = new class234[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field386[var7] = new class234();
        }
        int var8 = method154(6) + 1;
        field361 = new class87[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field361[var9] = new class87();
        }
        int var10 = method154(6) + 1;
        field365 = new class53[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field365[var11] = new class53();
        }
        int var12 = method154(6) + 1;
        field384 = new boolean[var12];
        field367 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field384[var13] = method156() != 0;
            method154(16);
            method154(16);
            field367[var13] = method154(8);
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)F")
    public static final float method153(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
    public static final int method154(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field372) {
            int var4 = 8 - field372;
            int var5 = (0x1 << var4) - 1;
            var1 += (field380[field382] >> field372 & var5) << var2;
            field372 = 0;
            field382++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field380[field382] >> field372 & var3) << var2;
            field372 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "([B)V")
    private final void method155(byte[] arg0) {
        class28 var2 = new class28(arg0);
        this.field362 = var2.method226(97);
        this.field376 = var2.method226(118);
        this.field388 = var2.method226(127);
        this.field377 = var2.method226(100);
        if (this.field377 < 0) {
            this.field377 = ~this.field377;
            this.field389 = true;
        }
        int var3 = var2.method226(-110);
        this.field363 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method215(-1797813752);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method204(var5, var7, 115, 0);
            this.field363[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()I")
    public static final int method156() {
        int var0 = field380[field382] >> field372 & 0x1;
        field372++;
        field382 += field372 >> 3;
        field372 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([B)V")
    private class22(byte[] arg0) {
        this.method155(arg0);
    }
}
