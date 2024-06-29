import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class278 extends class161 {

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "Z")
    private static boolean field4425 = false;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    private int field4430;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    private int field4432;

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
    private int field4434;

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "I")
    private static int field4436;

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
    private int field4437;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
    private static int field4440;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "I")
    private static int field4441;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    private int field4444;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    private static int field4451;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    private int field4454;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    private int field4455;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "Z")
    private boolean field4429;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "Z")
    private boolean field4438;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "[B")
    private static byte[] field4450;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "[B")
    private byte[] field4453;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "[F")
    private static float[] field4424;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "[F")
    private static float[] field4427;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "[F")
    private static float[] field4431;

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "[F")
    private float[] field4435;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "[F")
    private static float[] field4443;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "[F")
    private static float[] field4445;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "[F")
    private static float[] field4448;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "[F")
    private static float[] field4452;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "[I")
    private static int[] field4426;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "[I")
    private static int[] field4433;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "[I")
    private static int[] field4446;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "[Ldh;")
    private static class174[] field4423;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "[Ldf;")
    private static class227[] field4449;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "[Lsi;")
    public static class332[] field4428;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "[Lei;")
    private static class95[] field4447;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "[Z")
    private static boolean[] field4456;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "[[B")
    private byte[][] field4442;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([BI)V", line = 4)
    private static final void method1869(byte[] arg0, int arg1) {
        field4450 = arg0;
        field4451 = arg1;
        field4436 = 0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([B)V", line = 13)
    private final void method1870(byte[] arg0) {
        class186 var2 = new class186(arg0);
        this.field4444 = var2.method1284(8388607);
        this.field4432 = var2.method1284(8388607);
        this.field4434 = var2.method1284(8388607);
        this.field4439 = var2.method1284(8388607);
        if (this.field4439 < 0) {
            this.field4439 = ~this.field4439;
            this.field4438 = true;
        }
        int var3 = var2.method1284(8388607);
        this.field4442 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1322(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1292(0, var7, 1847860680, var5);
            this.field4442[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([I)Lkr;", line = 55)
    public final class445 method1871(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4453 == null) {
            this.field4437 = 0;
            this.field4435 = new float[field4440];
            this.field4453 = new byte[this.field4432];
            this.field4455 = 0;
            this.field4454 = 0;
        }
        while (this.field4454 < this.field4442.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1875(this.field4454);
            if (var3 != null) {
                int var4 = this.field4455;
                int var5 = var3.length;
                if (var5 > this.field4432 - var4) {
                    var5 = this.field4432 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4453[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4455;
                }
                this.field4455 = var4;
            }
            this.field4454++;
        }
        this.field4435 = null;
        byte[] var2 = this.field4453;
        this.field4453 = null;
        return new class445(this.field4444, var2, this.field4434, this.field4439, this.field4438);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "([B)V", line = 117)
    private static final void method1872(byte[] arg0) {
        method1869(arg0, 0);
        field4441 = 0x1 << method1874(4);
        field4440 = 0x1 << method1874(4);
        field4443 = new float[field4440];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4441 : field4440;
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
            int var25 = class181.method1243(var17 - 1, (byte) 123);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class328.method2176(var25, var26, -89);
            }
            if (var1 == 0) {
                field4427 = var18;
                field4431 = var20;
                field4452 = var22;
                field4433 = var24;
            } else {
                field4445 = var18;
                field4424 = var20;
                field4448 = var22;
                field4426 = var24;
            }
        }
        int var2 = method1874(8) + 1;
        field4428 = new class332[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4428[var3] = new class332();
        }
        int var4 = method1874(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1874(16);
        }
        int var6 = method1874(6) + 1;
        field4423 = new class174[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4423[var7] = new class174();
        }
        int var8 = method1874(6) + 1;
        field4449 = new class227[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4449[var9] = new class227();
        }
        int var10 = method1874(6) + 1;
        field4447 = new class95[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4447[var11] = new class95();
        }
        int var12 = method1874(6) + 1;
        field4456 = new boolean[var12];
        field4446 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4456[var13] = method1878() != 0;
            method1874(16);
            method1874(16);
            field4446[var13] = method1874(8);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "()V", line = 268)
    public static void method1873() {
        field4450 = null;
        field4428 = null;
        field4423 = null;
        field4449 = null;
        field4447 = null;
        field4456 = null;
        field4446 = null;
        field4443 = null;
        field4427 = null;
        field4431 = null;
        field4452 = null;
        field4445 = null;
        field4424 = null;
        field4448 = null;
        field4433 = null;
        field4426 = null;
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)I", line = 291)
    public static final int method1874(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4436) {
            int var4 = 8 - field4436;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4450[field4451] >> field4436 & var5) << var2;
            field4436 = 0;
            field4451++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4450[field4451] >> field4436 & var3) << var2;
            field4436 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)[F", line = 318)
    private final float[] method1875(int arg0) {
        method1869(this.field4442[arg0], 0);
        method1878();
        int var2 = method1874(class181.method1243(field4446.length - 1, (byte) 127));
        boolean var3 = field4456[var2];
        int var4 = var3 ? field4440 : field4441;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1878() != 0;
            var6 = method1878() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4441 >> 2);
            var9 = (field4441 >> 2) + (var4 >> 2);
            var10 = field4441 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4441 >> 2);
            var12 = (field4441 >> 2) + (var4 - (var4 >> 2));
            var13 = field4441 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class95 var14 = field4447[field4446[var2]];
        int var15 = var14.field1152;
        int var16 = var14.field1151[var15];
        boolean var17 = !field4423[var16].method1216();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1150; var19++) {
            class227 var95 = field4449[var14.field1149[var19]];
            float[] var96 = field4443;
            var95.method1625(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1152;
            int var21 = var14.field1151[var20];
            field4423[var21].method1214(field4443, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4443[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4443;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4445 : field4427;
            float[] var30 = var3 ? field4424 : field4431;
            float[] var31 = var3 ? field4448 : field4452;
            int[] var32 = var3 ? field4426 : field4433;
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
            int var35 = class181.method1243(var4 - 1, (byte) 114);
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
                field4443[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4443[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4437 > 0) {
            int var49 = this.field4437 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4429) {
                for (int var50 = 0; var50 < this.field4430; var50++) {
                    int var51 = (this.field4437 >> 1) + var50;
                    var48[var50] += this.field4435[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4443[var52];
                }
            }
        }
        float[] var54 = this.field4435;
        this.field4435 = field4443;
        field4443 = var54;
        this.field4437 = var4;
        this.field4430 = var12 - (var4 >> 1);
        this.field4429 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)F", line = 733)
    public static final float method1876(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lmo;)Z", line = 750)
    private static final boolean method1877(class447 arg0) {
        if (!field4425) {
            byte[] var1 = arg0.method2771(0, 0, 3);
            if (var1 == null) {
                return false;
            }
            method1872(var1);
            field4425 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "()I", line = 773)
    public static final int method1878() {
        int var0 = field4450[field4451] >> field4436 & 0x1;
        field4436++;
        field4451 += field4436 >> 3;
        field4436 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lmo;II)Lqq;", line = 781)
    public static final class278 method1879(class447 arg0, int arg1, int arg2) {
        if (method1877(arg0)) {
            byte[] var3 = arg0.method2771(arg1, arg2, 3);
            return var3 == null ? null : new class278(var3);
        } else {
            arg0.method2775(arg2, (byte) -37, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "([B)V", line = 801)
    private class278(byte[] arg0) {
        this.method1870(arg0);
    }
}
