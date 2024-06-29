import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class329 extends class362 {

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "Z")
    private static boolean field4600 = false;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    private int field4578;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    private static int field4587;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    private int field4593;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    private static int field4597;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    private static int field4601;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "I")
    private static int field4605;

    @OriginalMember(owner = "client!hp", name = "S", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!hp", name = "U", descriptor = "I")
    private int field4608;

    @OriginalMember(owner = "client!hp", name = "V", descriptor = "I")
    private int field4609;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "Z")
    private boolean field4582;

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "Z")
    private boolean field4604;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "[B")
    private static byte[] field4590;

    @OriginalMember(owner = "client!hp", name = "T", descriptor = "[B")
    private byte[] field4607;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "[F")
    private static float[] field4576;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "[F")
    private float[] field4577;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "[F")
    private static float[] field4583;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "[F")
    private static float[] field4584;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "[F")
    private static float[] field4588;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "[F")
    private static float[] field4596;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "[F")
    private static float[] field4598;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "[F")
    private static float[] field4602;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "[I")
    private static int[] field4581;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "[I")
    private static int[] field4585;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "[I")
    private static int[] field4595;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "[Leda;")
    private static class102[] field4586;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "[Lfq;")
    public static class203[] field4594;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "[Lrm;")
    private static class411[] field4591;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "[Lvba;")
    private static class41[] field4580;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "[Z")
    private static boolean[] field4589;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "[[B")
    private byte[][] field4579;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([BI)V", line = 3)
    private static final void method2087(byte[] arg0, int arg1) {
        field4590 = arg0;
        field4605 = arg1;
        field4587 = 0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "()V", line = 8)
    public static void method2088() {
        field4590 = null;
        field4594 = null;
        field4591 = null;
        field4586 = null;
        field4580 = null;
        field4589 = null;
        field4585 = null;
        field4583 = null;
        field4598 = null;
        field4596 = null;
        field4584 = null;
        field4588 = null;
        field4602 = null;
        field4576 = null;
        field4595 = null;
        field4581 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)F", line = 27)
    public static final float method2089(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([B)V", line = 43)
    private final void method2090(byte[] arg0) {
        class215 var2 = new class215(arg0);
        this.field4578 = var2.method1533((byte) -126);
        this.field4592 = var2.method1533((byte) -126);
        this.field4599 = var2.method1533((byte) -126);
        this.field4593 = var2.method1533((byte) -126);
        if (this.field4593 < 0) {
            this.field4593 = ~this.field4593;
            this.field4604 = true;
        }
        int var3 = var2.method1533((byte) -126);
        this.field4579 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1535(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1537(Integer.MAX_VALUE, 0, var5, var7);
            this.field4579[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "()I", line = 91)
    public static final int method2091() {
        int var0 = field4590[field4605] >> field4587 & 0x1;
        field4587++;
        field4605 += field4587 >> 3;
        field4587 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I", line = 106)
    public static final int method2092(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4587) {
            int var4 = 8 - field4587;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4590[field4605] >> field4587 & var5) << var2;
            field4587 = 0;
            field4605++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4590[field4605] >> field4587 & var3) << var2;
            field4587 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "([B)V", line = 136)
    private static final void method2093(byte[] arg0) {
        method2087(arg0, 0);
        field4601 = 0x1 << method2092(4);
        field4597 = 0x1 << method2092(4);
        field4583 = new float[field4597];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4601 : field4597;
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
            int var25 = class149.method1172(var17 - 1, -53);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class645.method3660(var25, 0, var26);
            }
            if (var1 == 0) {
                field4598 = var18;
                field4596 = var20;
                field4584 = var22;
                field4595 = var24;
            } else {
                field4588 = var18;
                field4602 = var20;
                field4576 = var22;
                field4581 = var24;
            }
        }
        int var2 = method2092(8) + 1;
        field4594 = new class203[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4594[var3] = new class203();
        }
        int var4 = method2092(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2092(16);
        }
        int var6 = method2092(6) + 1;
        field4591 = new class411[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4591[var7] = new class411();
        }
        int var8 = method2092(6) + 1;
        field4586 = new class102[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4586[var9] = new class102();
        }
        int var10 = method2092(6) + 1;
        field4580 = new class41[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4580[var11] = new class41();
        }
        int var12 = method2092(6) + 1;
        field4589 = new boolean[var12];
        field4585 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4589[var13] = method2091() != 0;
            method2092(16);
            method2092(16);
            field4585[var13] = method2092(8);
        }
        field4600 = true;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([I)Lob;", line = 290)
    public final class735 method2094(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4607 == null) {
            this.field4606 = 0;
            this.field4577 = new float[field4597];
            this.field4607 = new byte[this.field4592];
            this.field4609 = 0;
            this.field4608 = 0;
        }
        while (this.field4608 < this.field4579.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2097(this.field4608);
            if (var3 != null) {
                int var4 = this.field4609;
                int var5 = var3.length;
                if (var5 > this.field4592 - var4) {
                    var5 = this.field4592 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4607[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4609;
                }
                this.field4609 = var4;
            }
            this.field4608++;
        }
        this.field4577 = null;
        byte[] var2 = this.field4607;
        this.field4607 = null;
        return new class735(this.field4578, var2, this.field4599, this.field4593, this.field4604);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lin;)Z", line = 349)
    private static final boolean method2095(class91 arg0) {
        if (!field4600) {
            byte[] var1 = arg0.method863(-1860, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2093(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lin;I)Lhp;", line = 365)
    public static final class329 method2096(class91 arg0, int arg1) {
        if (method2095(arg0)) {
            byte[] var2 = arg0.method868((byte) 73, arg1);
            return var2 == null ? null : new class329(var2);
        } else {
            arg0.method874(false, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)[F", line = 387)
    private final float[] method2097(int arg0) {
        method2087(this.field4579[arg0], 0);
        method2091();
        int var2 = method2092(class149.method1172(field4585.length - 1, 123));
        boolean var3 = field4589[var2];
        int var4 = var3 ? field4597 : field4601;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2091() != 0;
            var6 = method2091() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4601 >> 2);
            var9 = (field4601 >> 2) + (var4 >> 2);
            var10 = field4601 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4601 >> 2);
            var12 = (field4601 >> 2) + (var4 - (var4 >> 2));
            var13 = field4601 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class41 var14 = field4580[field4585[var2]];
        int var15 = var14.field969;
        int var16 = var14.field968[var15];
        boolean var17 = !field4591[var16].method2547();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field967; var19++) {
            class102 var95 = field4586[var14.field966[var19]];
            float[] var96 = field4583;
            var95.method944(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field969;
            int var21 = var14.field968[var20];
            field4591[var21].method2543(field4583, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4583[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4583;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4588 : field4598;
            float[] var30 = var3 ? field4602 : field4596;
            float[] var31 = var3 ? field4576 : field4584;
            int[] var32 = var3 ? field4581 : field4595;
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
            int var35 = class149.method1172(var4 - 1, -52);
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
                field4583[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4583[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4606 > 0) {
            int var49 = this.field4606 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4582) {
                for (int var50 = 0; var50 < this.field4603; var50++) {
                    int var51 = (this.field4606 >> 1) + var50;
                    var48[var50] += this.field4577[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4583[var52];
                }
            }
        }
        float[] var54 = this.field4577;
        this.field4577 = field4583;
        field4583 = var54;
        this.field4606 = var4;
        this.field4603 = var12 - (var4 >> 1);
        this.field4582 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "([B)V", line = 803)
    private class329(byte[] arg0) {
        this.method2090(arg0);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lin;II)Lhp;", line = 810)
    public static final class329 method2098(class91 arg0, int arg1, int arg2) {
        if (method2095(arg0)) {
            byte[] var3 = arg0.method863(-1860, arg1, arg2);
            return var3 == null ? null : new class329(var3);
        } else {
            arg0.method873(-10499, arg1, arg2);
            return null;
        }
    }
}
