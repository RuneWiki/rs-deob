import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class252 extends class476 {

    @OriginalMember(owner = "client!na", name = "C", descriptor = "Z")
    private static boolean field3459 = false;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    private int field3440;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    private int field3441;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    private static int field3442;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    private int field3443;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    private int field3451;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    private static int field3454;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    private static int field3461;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    private int field3466;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    private int field3468;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    private static int field3469;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    private int field3470;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Z")
    private boolean field3446;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Z")
    private boolean field3447;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[B")
    private static byte[] field3439;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "[B")
    private byte[] field3471;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "[F")
    private float[] field3444;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "[F")
    private static float[] field3445;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[F")
    private static float[] field3449;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "[F")
    private static float[] field3453;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "[F")
    private static float[] field3455;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "[F")
    private static float[] field3456;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "[F")
    private static float[] field3463;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "[F")
    private static float[] field3465;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "[I")
    private static int[] field3457;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[I")
    private static int[] field3458;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "[I")
    private static int[] field3467;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "[Lfo;")
    public static class15[] field3464;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "[Ljr;")
    private static class361[] field3450;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[Lwa;")
    private static class501[] field3452;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "[Lbt;")
    private static class89[] field3462;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "[Z")
    private static boolean[] field3460;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "[[B")
    private byte[][] field3448;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BI)V")
    private static final void method1504(byte[] arg0, int arg1) {
        field3439 = arg0;
        field3469 = arg1;
        field3461 = 0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldk;)Z")
    private static final boolean method1505(class421 arg0) {
        if (!field3459) {
            byte[] var1 = arg0.method2512(0, (byte) -93, 0);
            if (var1 == null) {
                return false;
            }
            method1510(var1);
            field3459 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([B)V")
    private final void method1506(byte[] arg0) {
        class319 var2 = new class319(arg0);
        this.field3451 = var2.method1863(-1);
        this.field3468 = var2.method1863(-1);
        this.field3443 = var2.method1863(-1);
        this.field3441 = var2.method1863(-1);
        if (this.field3441 < 0) {
            this.field3441 = ~this.field3441;
            this.field3446 = true;
        }
        int var3 = var2.method1863(-1);
        this.field3448 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1869(-74);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1887(0, var7, var5, true);
            this.field3448[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([I)Lhe;")
    public final class174 method1507(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3471 == null) {
            this.field3440 = 0;
            this.field3444 = new float[field3442];
            this.field3471 = new byte[this.field3468];
            this.field3472 = 0;
            this.field3470 = 0;
        }
        while (this.field3470 < this.field3448.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1508(this.field3470);
            if (var3 != null) {
                int var4 = this.field3472;
                int var5 = var3.length;
                if (var5 > this.field3468 - var4) {
                    var5 = this.field3468 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3471[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3472;
                }
                this.field3472 = var4;
            }
            this.field3470++;
        }
        this.field3444 = null;
        byte[] var2 = this.field3471;
        this.field3471 = null;
        return new class174(this.field3451, var2, this.field3443, this.field3441, this.field3446);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)[F")
    private final float[] method1508(int arg0) {
        method1504(this.field3448[arg0], 0);
        method1512();
        int var2 = method1511(class331.method1955((byte) -108, field3458.length - 1));
        boolean var3 = field3460[var2];
        int var4 = var3 ? field3442 : field3454;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1512() != 0;
            var6 = method1512() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3454 >> 2);
            var9 = (field3454 >> 2) + (var4 >> 2);
            var10 = field3454 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3454 >> 2);
            var12 = (field3454 >> 2) + (var4 - (var4 >> 2));
            var13 = field3454 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class501 var14 = field3452[field3458[var2]];
        int var15 = var14.field7331;
        int var16 = var14.field7329[var15];
        boolean var17 = !field3450[var16].method2154();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field7328; var19++) {
            class89 var95 = field3462[var14.field7330[var19]];
            float[] var96 = field3463;
            var95.method736(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field7331;
            int var21 = var14.field7329[var20];
            field3450[var21].method2160(field3463, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3463[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3463;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3445 : field3455;
            float[] var30 = var3 ? field3449 : field3456;
            float[] var31 = var3 ? field3453 : field3465;
            int[] var32 = var3 ? field3457 : field3467;
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
            int var35 = class331.method1955((byte) -108, var4 - 1);
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
                field3463[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3463[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3440 > 0) {
            int var49 = this.field3440 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3447) {
                for (int var50 = 0; var50 < this.field3466; var50++) {
                    int var51 = (this.field3440 >> 1) + var50;
                    var48[var50] += this.field3444[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3463[var52];
                }
            }
        }
        float[] var54 = this.field3444;
        this.field3444 = field3463;
        field3463 = var54;
        this.field3440 = var4;
        this.field3466 = var12 - (var4 >> 1);
        this.field3447 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public static void method1509() {
        field3439 = null;
        field3464 = null;
        field3450 = null;
        field3462 = null;
        field3452 = null;
        field3460 = null;
        field3458 = null;
        field3463 = null;
        field3455 = null;
        field3456 = null;
        field3465 = null;
        field3445 = null;
        field3449 = null;
        field3453 = null;
        field3467 = null;
        field3457 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "([B)V")
    private static final void method1510(byte[] arg0) {
        method1504(arg0, 0);
        field3454 = 0x1 << method1511(4);
        field3442 = 0x1 << method1511(4);
        field3463 = new float[field3442];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3454 : field3442;
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
            int var25 = class331.method1955((byte) -108, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class366.method2192(var25, (byte) -2, var26);
            }
            if (var1 == 0) {
                field3455 = var18;
                field3456 = var20;
                field3465 = var22;
                field3467 = var24;
            } else {
                field3445 = var18;
                field3449 = var20;
                field3453 = var22;
                field3457 = var24;
            }
        }
        int var2 = method1511(8) + 1;
        field3464 = new class15[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3464[var3] = new class15();
        }
        int var4 = method1511(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1511(16);
        }
        int var6 = method1511(6) + 1;
        field3450 = new class361[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3450[var7] = new class361();
        }
        int var8 = method1511(6) + 1;
        field3462 = new class89[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3462[var9] = new class89();
        }
        int var10 = method1511(6) + 1;
        field3452 = new class501[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3452[var11] = new class501();
        }
        int var12 = method1511(6) + 1;
        field3460 = new boolean[var12];
        field3458 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3460[var13] = method1512() != 0;
            method1511(16);
            method1511(16);
            field3458[var13] = method1511(8);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)I")
    public static final int method1511(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3461) {
            int var4 = 8 - field3461;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3439[field3469] >> field3461 & var5) << var2;
            field3461 = 0;
            field3469++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3439[field3469] >> field3461 & var3) << var2;
            field3461 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()I")
    public static final int method1512() {
        int var0 = field3439[field3469] >> field3461 & 0x1;
        field3461++;
        field3469 += field3461 >> 3;
        field3461 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldk;I)Lna;")
    public static final class252 method1513(class421 arg0, int arg1) {
        if (method1505(arg0)) {
            byte[] var2 = arg0.method2496(arg1, 7);
            return var2 == null ? null : new class252(var2);
        } else {
            arg0.method2517(arg1, (byte) -76);
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldk;II)Lna;")
    public static final class252 method1514(class421 arg0, int arg1, int arg2) {
        if (method1505(arg0)) {
            byte[] var3 = arg0.method2512(arg1, (byte) -93, arg2);
            return var3 == null ? null : new class252(var3);
        } else {
            arg0.method2498(-113, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)F")
    public static final float method1515(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B)V")
    private class252(byte[] arg0) {
        this.method1506(arg0);
    }
}
