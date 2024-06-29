import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class258 extends class314 {

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Z")
    private static boolean field4590 = false;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    private int field4578;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    private int field4580;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    private int field4583;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    private static int field4589;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    private static int field4596;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    private static int field4598;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    private static int field4604;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    private int field4606;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    private int field4607;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Z")
    private boolean field4586;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "Z")
    private boolean field4603;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[B")
    private static byte[] field4575;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "[B")
    private byte[] field4608;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "[F")
    private static float[] field4576;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[F")
    private static float[] field4581;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "[F")
    private static float[] field4582;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "[F")
    private static float[] field4587;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "[F")
    private static float[] field4593;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "[F")
    private float[] field4594;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "[F")
    private static float[] field4597;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "[F")
    private static float[] field4601;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
    private static int[] field4579;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "[I")
    private static int[] field4585;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "[I")
    private static int[] field4591;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[Leb;")
    private static class116[] field4600;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "[Lvc;")
    private static class188[] field4605;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "[Lfi;")
    private static class259[] field4577;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "[Lnd;")
    public static class313[] field4602;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "[Z")
    private static boolean[] field4584;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "[[B")
    private byte[][] field4588;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I", line = 5)
    public static final int method1846() {
        int var0 = field4575[field4596] >> field4598 & 0x1;
        field4598++;
        field4596 += field4598 >> 3;
        field4598 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([B)V", line = 13)
    private static final void method1847(byte[] arg0) {
        method1850(arg0, 0);
        field4589 = 0x1 << method1853(4);
        field4604 = 0x1 << method1853(4);
        field4597 = new float[field4604];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4589 : field4604;
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
            int var13 = class172.method1344(var5 - 1, 2);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class221.method1620(var14, var13, 0);
            }
            if (var1 == 0) {
                field4581 = var6;
                field4582 = var8;
                field4601 = var10;
                field4591 = var12;
            } else {
                field4576 = var6;
                field4593 = var8;
                field4587 = var10;
                field4585 = var12;
            }
        }
        int var15 = method1853(8) + 1;
        field4602 = new class313[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4602[var16] = new class313();
        }
        int var17 = method1853(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1853(16);
        }
        int var19 = method1853(6) + 1;
        field4600 = new class116[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4600[var20] = new class116();
        }
        int var21 = method1853(6) + 1;
        field4577 = new class259[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4577[var22] = new class259();
        }
        int var23 = method1853(6) + 1;
        field4605 = new class188[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4605[var24] = new class188();
        }
        int var25 = method1853(6) + 1;
        field4584 = new boolean[var25];
        field4579 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4584[var26] = method1846() != 0;
            method1853(16);
            method1853(16);
            field4579[var26] = method1853(8);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lok;II)Lsc;", line = 169)
    public static final class258 method1848(class149 arg0, int arg1, int arg2) {
        if (method1851(arg0)) {
            byte[] var3 = arg0.method1192(0, arg1, arg2);
            return var3 == null ? null : new class258(var3);
        } else {
            arg0.method1180(arg2, 11934, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V", line = 184)
    public static void method1849() {
        field4575 = null;
        field4602 = null;
        field4600 = null;
        field4577 = null;
        field4605 = null;
        field4584 = null;
        field4579 = null;
        field4597 = null;
        field4581 = null;
        field4582 = null;
        field4601 = null;
        field4576 = null;
        field4593 = null;
        field4587 = null;
        field4591 = null;
        field4585 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V", line = 202)
    private static final void method1850(byte[] arg0, int arg1) {
        field4575 = arg0;
        field4596 = arg1;
        field4598 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lok;)Z", line = 210)
    private static final boolean method1851(class149 arg0) {
        if (!field4590) {
            byte[] var1 = arg0.method1192(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1847(var1);
            field4590 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)[F", line = 225)
    private final float[] method1852(int arg0) {
        method1850(this.field4588[arg0], 0);
        method1846();
        int var2 = method1853(class172.method1344(field4579.length - 1, 2));
        boolean var3 = field4584[var2];
        int var4 = var3 ? field4604 : field4589;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1846() != 0;
            var6 = method1846() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4589 >> 2);
            var9 = (field4589 >> 2) + (var4 >> 2);
            var10 = field4589 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4589 >> 2);
            var12 = (field4589 >> 2) + (var4 - (var4 >> 2));
            var13 = field4589 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class188 var14 = field4605[field4579[var2]];
        int var15 = var14.field3407;
        int var16 = var14.field3406[var15];
        boolean var17 = !field4600[var16].method931();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3409; var19++) {
            class259 var20 = field4577[var14.field3408[var19]];
            float[] var21 = field4597;
            var20.method1857(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3407;
            int var23 = var14.field3406[var22];
            field4600[var23].method933(field4597, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4597[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4597;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4576 : field4581;
            float[] var32 = var3 ? field4593 : field4582;
            float[] var33 = var3 ? field4587 : field4601;
            int[] var34 = var3 ? field4585 : field4591;
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
            int var47 = class172.method1344(var4 - 1, 2);
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
                field4597[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4597[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4595 > 0) {
            int var91 = this.field4595 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4603) {
                for (int var92 = 0; var92 < this.field4580; var92++) {
                    int var93 = (this.field4595 >> 1) + var92;
                    var90[var92] += this.field4594[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4597[var94];
                }
            }
        }
        float[] var96 = this.field4594;
        this.field4594 = field4597;
        field4597 = var96;
        this.field4595 = var4;
        this.field4580 = var12 - (var4 >> 1);
        this.field4603 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I", line = 641)
    public static final int method1853(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4598) {
            int var3 = 8 - field4598;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4575[field4596] >> field4598 & var4) << var2;
            field4598 = 0;
            field4596++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4575[field4596] >> field4598 & var5) << var2;
            field4598 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([I)Ltc;", line = 671)
    public final class40 method1854(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4608 == null) {
            this.field4595 = 0;
            this.field4594 = new float[field4604];
            this.field4608 = new byte[this.field4578];
            this.field4607 = 0;
            this.field4606 = 0;
        }
        while (this.field4606 < this.field4588.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1852(this.field4606);
            if (var2 != null) {
                int var3 = this.field4607;
                int var4 = var2.length;
                if (var4 > this.field4578 - var3) {
                    var4 = this.field4578 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4608[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4607;
                }
                this.field4607 = var3;
            }
            this.field4606++;
        }
        this.field4594 = null;
        byte[] var7 = this.field4608;
        this.field4608 = null;
        return new class40(this.field4592, var7, this.field4599, this.field4583, this.field4586);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)F", line = 741)
    public static final float method1855(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "([B)V", line = 754)
    private final void method1856(byte[] arg0) {
        class53 var2 = new class53(arg0);
        this.field4592 = var2.method453(1);
        this.field4578 = var2.method453(1);
        this.field4599 = var2.method453(1);
        this.field4583 = var2.method453(1);
        if (this.field4583 < 0) {
            this.field4583 = ~this.field4583;
            this.field4586 = true;
        }
        int var3 = var2.method453(1);
        this.field4588 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method483(-123);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method496(0, var5, var7, 3);
            this.field4588[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B)V", line = 803)
    private class258(byte[] arg0) {
        this.method1856(arg0);
    }
}
