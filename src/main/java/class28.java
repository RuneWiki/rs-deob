import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class28 extends class213 {

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Z")
    private static boolean field527 = false;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    private static int field533;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    private static int field543;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    private static int field545;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
    private static int field553;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Z")
    private boolean field532;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "Z")
    private boolean field548;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "[B")
    private static byte[] field540;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "[B")
    private byte[] field554;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "[F")
    private static float[] field523;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[F")
    private static float[] field524;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "[F")
    private static float[] field528;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "[F")
    private static float[] field529;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "[F")
    private static float[] field531;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "[F")
    private float[] field541;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "[F")
    private static float[] field544;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "[F")
    private static float[] field551;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "[I")
    private static int[] field536;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "[I")
    private static int[] field537;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "[I")
    private static int[] field546;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "[Lmh;")
    private static class127[] field530;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "[Lvh;")
    private static class217[] field549;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "[Lf;")
    private static class51[] field538;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "[Lhd;")
    public static class74[] field539;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "[Z")
    private static boolean[] field547;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "[[B")
    private byte[][] field552;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)[F")
    private final float[] method194(int arg0) {
        method198(this.field552[arg0], 0);
        method200();
        int var2 = method201(class113.method733(field536.length - 1, 16));
        boolean var3 = field547[var2];
        int var4 = var3 ? field545 : field553;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method200() != 0;
            var6 = method200() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field553 >> 2);
            var9 = (field553 >> 2) + (var4 >> 2);
            var10 = field553 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field553 >> 2);
            var12 = (field553 >> 2) + (var4 - (var4 >> 2));
            var13 = field553 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class127 var14 = field530[field536[var2]];
        int var15 = var14.field2432;
        int var16 = var14.field2431[var15];
        boolean var17 = !field538[var16].method340();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2433; var19++) {
            class217 var95 = field549[var14.field2434[var19]];
            float[] var96 = field524;
            var95.method1412(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2432;
            int var21 = var14.field2431[var20];
            field538[var21].method342(field524, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field524[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field524;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field528 : field544;
            float[] var30 = var3 ? field531 : field529;
            float[] var31 = var3 ? field523 : field551;
            int[] var32 = var3 ? field537 : field546;
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
            int var35 = class113.method733(var4 - 1, 16);
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
                field524[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field524[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field542 > 0) {
            int var49 = this.field542 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field548) {
                for (int var50 = 0; var50 < this.field525; var50++) {
                    int var51 = (this.field542 >> 1) + var50;
                    var48[var50] += this.field541[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field524[var52];
                }
            }
        }
        float[] var54 = this.field541;
        this.field541 = field524;
        field524 = var54;
        this.field542 = var4;
        this.field525 = var12 - (var4 >> 1);
        this.field548 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
    public static void method195() {
        field540 = null;
        field539 = null;
        field538 = null;
        field549 = null;
        field530 = null;
        field547 = null;
        field536 = null;
        field524 = null;
        field544 = null;
        field529 = null;
        field551 = null;
        field528 = null;
        field531 = null;
        field523 = null;
        field546 = null;
        field537 = null;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)F")
    public static final float method196(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I)Loa;")
    public final class140 method197(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field554 == null) {
            this.field542 = 0;
            this.field541 = new float[field545];
            this.field554 = new byte[this.field550];
            this.field555 = 0;
            this.field556 = 0;
        }
        while (this.field556 < this.field552.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method194(this.field556);
            if (var3 != null) {
                int var4 = this.field555;
                int var5 = var3.length;
                if (var5 > this.field550 - var4) {
                    var5 = this.field550 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field554[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field555;
                }
                this.field555 = var4;
            }
            this.field556++;
        }
        this.field541 = null;
        byte[] var2 = this.field554;
        this.field554 = null;
        return new class140(this.field534, var2, this.field535, this.field526, this.field532);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([BI)V")
    private static final void method198(byte[] arg0, int arg1) {
        field540 = arg0;
        field533 = arg1;
        field543 = 0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lpe;II)Lcg;")
    public static final class28 method199(class154 arg0, int arg1, int arg2) {
        if (method202(arg0)) {
            byte[] var3 = arg0.method1065((byte) -124, arg2, arg1);
            return var3 == null ? null : new class28(var3);
        } else {
            arg0.method1080((byte) 123, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()I")
    public static final int method200() {
        int var0 = field540[field533] >> field543 & 0x1;
        field543++;
        field533 += field543 >> 3;
        field543 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I")
    public static final int method201(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field543) {
            int var4 = 8 - field543;
            int var5 = (0x1 << var4) - 1;
            var1 += (field540[field533] >> field543 & var5) << var2;
            field543 = 0;
            field533++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field540[field533] >> field543 & var3) << var2;
            field543 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lpe;)Z")
    private static final boolean method202(class154 arg0) {
        if (!field527) {
            byte[] var1 = arg0.method1065((byte) -105, 0, 0);
            if (var1 == null) {
                return false;
            }
            method204(var1);
            field527 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([B)V")
    private final void method203(byte[] arg0) {
        class146 var2 = new class146(arg0);
        this.field534 = var2.method979(1029109968);
        this.field550 = var2.method979(1029109968);
        this.field535 = var2.method979(1029109968);
        this.field526 = var2.method979(1029109968);
        if (this.field526 < 0) {
            this.field526 = ~this.field526;
            this.field532 = true;
        }
        int var3 = var2.method979(1029109968);
        this.field552 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method991(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1001(var5, 0, 91, var7);
            this.field552[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "([B)V")
    private static final void method204(byte[] arg0) {
        method198(arg0, 0);
        field553 = 0x1 << method201(4);
        field545 = 0x1 << method201(4);
        field524 = new float[field545];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field553 : field545;
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
            int var25 = class113.method733(var17 - 1, 16);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class187.method1248(var25, var26, 1);
            }
            if (var1 == 0) {
                field544 = var18;
                field529 = var20;
                field551 = var22;
                field546 = var24;
            } else {
                field528 = var18;
                field531 = var20;
                field523 = var22;
                field537 = var24;
            }
        }
        int var2 = method201(8) + 1;
        field539 = new class74[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field539[var3] = new class74();
        }
        int var4 = method201(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method201(16);
        }
        int var6 = method201(6) + 1;
        field538 = new class51[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field538[var7] = new class51();
        }
        int var8 = method201(6) + 1;
        field549 = new class217[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field549[var9] = new class217();
        }
        int var10 = method201(6) + 1;
        field530 = new class127[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field530[var11] = new class127();
        }
        int var12 = method201(6) + 1;
        field547 = new boolean[var12];
        field536 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field547[var13] = method200() != 0;
            method201(16);
            method201(16);
            field536[var13] = method201(8);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([B)V")
    private class28(byte[] arg0) {
        this.method203(arg0);
    }
}
