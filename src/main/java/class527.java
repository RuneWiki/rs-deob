import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class527 extends class379 {

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "Z")
    private static boolean field7439 = false;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    private int field7436;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    private static int field7440;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    private static int field7442;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "I")
    private int field7443;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
    private static int field7447;

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
    private int field7449;

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "I")
    private int field7452;

    @OriginalMember(owner = "client!eaa", name = "D", descriptor = "I")
    private int field7456;

    @OriginalMember(owner = "client!eaa", name = "J", descriptor = "I")
    private static int field7462;

    @OriginalMember(owner = "client!eaa", name = "L", descriptor = "I")
    private int field7464;

    @OriginalMember(owner = "client!eaa", name = "M", descriptor = "I")
    private int field7465;

    @OriginalMember(owner = "client!eaa", name = "O", descriptor = "I")
    private int field7467;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "Z")
    private boolean field7435;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "Z")
    private boolean field7444;

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "[B")
    private static byte[] field7453;

    @OriginalMember(owner = "client!eaa", name = "N", descriptor = "[B")
    private byte[] field7466;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "[F")
    private static float[] field7434;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "[F")
    private static float[] field7438;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "[F")
    private static float[] field7448;

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "[F")
    private static float[] field7450;

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "[F")
    private static float[] field7451;

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "[F")
    private static float[] field7454;

    @OriginalMember(owner = "client!eaa", name = "F", descriptor = "[F")
    private float[] field7458;

    @OriginalMember(owner = "client!eaa", name = "K", descriptor = "[F")
    private static float[] field7463;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "[I")
    private static int[] field7437;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "[I")
    private static int[] field7441;

    @OriginalMember(owner = "client!eaa", name = "E", descriptor = "[I")
    private static int[] field7457;

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "[Ltr;")
    private static class311[] field7446;

    @OriginalMember(owner = "client!eaa", name = "G", descriptor = "[Lvd;")
    private static class42[] field7459;

    @OriginalMember(owner = "client!eaa", name = "I", descriptor = "[Liu;")
    private static class605[] field7461;

    @OriginalMember(owner = "client!eaa", name = "H", descriptor = "[Laga;")
    public static class696[] field7460;

    @OriginalMember(owner = "client!eaa", name = "C", descriptor = "[Z")
    private static boolean[] field7455;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "[[B")
    private byte[][] field7445;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "([BI)V", line = 5)
    private static final void method3146(byte[] arg0, int arg1) {
        field7453 = arg0;
        field7440 = arg1;
        field7447 = 0;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)[F", line = 10)
    private final float[] method3147(int arg0) {
        method3146(this.field7445[arg0], 0);
        method3150();
        int var2 = method3153(class391.method2293((byte) -21, field7441.length - 1));
        boolean var3 = field7455[var2];
        int var4 = var3 ? field7442 : field7462;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3150() != 0;
            var6 = method3150() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field7462 >> 2);
            var9 = (field7462 >> 2) + (var4 >> 2);
            var10 = field7462 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field7462 >> 2);
            var12 = (field7462 >> 2) + (var4 - (var4 >> 2));
            var13 = field7462 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class311 var14 = field7446[field7441[var2]];
        int var15 = var14.field3855;
        int var16 = var14.field3852[var15];
        boolean var17 = !field7459[var16].method349();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3854; var19++) {
            class605 var95 = field7461[var14.field3853[var19]];
            float[] var96 = field7454;
            var95.method3443(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3855;
            int var21 = var14.field3852[var20];
            field7459[var21].method344(field7454, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field7454[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field7454;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field7438 : field7448;
            float[] var30 = var3 ? field7450 : field7434;
            float[] var31 = var3 ? field7451 : field7463;
            int[] var32 = var3 ? field7457 : field7437;
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
            int var35 = class391.method2293((byte) -83, var4 - 1);
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
                field7454[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field7454[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field7449 > 0) {
            int var49 = this.field7449 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field7444) {
                for (int var50 = 0; var50 < this.field7452; var50++) {
                    int var51 = (this.field7449 >> 1) + var50;
                    var48[var50] += this.field7458[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field7454[var52];
                }
            }
        }
        float[] var54 = this.field7458;
        this.field7458 = field7454;
        field7454 = var54;
        this.field7449 = var4;
        this.field7452 = var12 - (var4 >> 1);
        this.field7444 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "([I)Laia;", line = 422)
    public final class242 method3148(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field7466 == null) {
            this.field7449 = 0;
            this.field7458 = new float[field7442];
            this.field7466 = new byte[this.field7443];
            this.field7467 = 0;
            this.field7465 = 0;
        }
        while (this.field7465 < this.field7445.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3147(this.field7465);
            if (var3 != null) {
                int var4 = this.field7467;
                int var5 = var3.length;
                if (var5 > this.field7443 - var4) {
                    var5 = this.field7443 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field7466[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field7467;
                }
                this.field7467 = var4;
            }
            this.field7465++;
        }
        this.field7458 = null;
        byte[] var2 = this.field7466;
        this.field7466 = null;
        return new class242(this.field7464, var2, this.field7456, this.field7436, this.field7435);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "()V", line = 481)
    public static void method3149() {
        field7453 = null;
        field7460 = null;
        field7459 = null;
        field7461 = null;
        field7446 = null;
        field7455 = null;
        field7441 = null;
        field7454 = null;
        field7448 = null;
        field7434 = null;
        field7463 = null;
        field7438 = null;
        field7450 = null;
        field7451 = null;
        field7437 = null;
        field7457 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "()I", line = 500)
    public static final int method3150() {
        int var0 = field7453[field7440] >> field7447 & 0x1;
        field7447++;
        field7440 += field7447 >> 3;
        field7447 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lbt;)Z", line = 513)
    private static final boolean method3151(class48 arg0) {
        if (!field7439) {
            byte[] var1 = arg0.method437(0, (byte) -72, 0);
            if (var1 == null) {
                return false;
            }
            method3157(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lbt;I)Leaa;", line = 526)
    public static final class527 method3152(class48 arg0, int arg1) {
        if (method3151(arg0)) {
            byte[] var2 = arg0.method453(arg1, 11040);
            return var2 == null ? null : new class527(var2);
        } else {
            arg0.method433((byte) -88, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)I", line = 541)
    public static final int method3153(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field7447) {
            int var4 = 8 - field7447;
            int var5 = (0x1 << var4) - 1;
            var1 += (field7453[field7440] >> field7447 & var5) << var2;
            field7447 = 0;
            field7440++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field7453[field7440] >> field7447 & var3) << var2;
            field7447 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "([B)V", line = 569)
    private final void method3154(byte[] arg0) {
        class403 var2 = new class403(arg0);
        this.field7464 = var2.method2381((byte) 79);
        this.field7443 = var2.method2381((byte) 91);
        this.field7456 = var2.method2381((byte) 22);
        this.field7436 = var2.method2381((byte) 41);
        if (this.field7436 < 0) {
            this.field7436 = ~this.field7436;
            this.field7435 = true;
        }
        int var3 = var2.method2381((byte) 105);
        this.field7445 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2396((byte) -128);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2401(65280, var7, 0, var5);
            this.field7445[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)F", line = 617)
    public static final float method3155(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lbt;II)Leaa;", line = 634)
    public static final class527 method3156(class48 arg0, int arg1, int arg2) {
        if (method3151(arg0)) {
            byte[] var3 = arg0.method437(arg1, (byte) 124, arg2);
            return var3 == null ? null : new class527(var3);
        } else {
            arg0.method443(arg2, arg1, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "([B)V", line = 666)
    private static final void method3157(byte[] arg0) {
        method3146(arg0, 0);
        field7462 = 0x1 << method3153(4);
        field7442 = 0x1 << method3153(4);
        field7454 = new float[field7442];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field7462 : field7442;
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
            int var25 = class391.method2293((byte) -76, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class126.method968(var26, var25, -88);
            }
            if (var1 == 0) {
                field7448 = var18;
                field7434 = var20;
                field7463 = var22;
                field7437 = var24;
            } else {
                field7438 = var18;
                field7450 = var20;
                field7451 = var22;
                field7457 = var24;
            }
        }
        int var2 = method3153(8) + 1;
        field7460 = new class696[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field7460[var3] = new class696();
        }
        int var4 = method3153(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3153(16);
        }
        int var6 = method3153(6) + 1;
        field7459 = new class42[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field7459[var7] = new class42();
        }
        int var8 = method3153(6) + 1;
        field7461 = new class605[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field7461[var9] = new class605();
        }
        int var10 = method3153(6) + 1;
        field7446 = new class311[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field7446[var11] = new class311();
        }
        int var12 = method3153(6) + 1;
        field7455 = new boolean[var12];
        field7441 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field7455[var13] = method3150() != 0;
            method3153(16);
            method3153(16);
            field7441[var13] = method3153(8);
        }
        field7439 = true;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "([B)V", line = 817)
    private class527(byte[] arg0) {
        this.method3154(arg0);
    }
}
