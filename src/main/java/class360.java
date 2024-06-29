import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class360 extends class467 {

    @OriginalMember(owner = "client!vs", name = "A", descriptor = "Z")
    private static boolean field5581 = false;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    private int field5570;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    private int field5574;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "I")
    private int field5578;

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
    private int field5582;

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
    private static int field5584;

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "I")
    private int field5585;

    @OriginalMember(owner = "client!vs", name = "G", descriptor = "I")
    private static int field5587;

    @OriginalMember(owner = "client!vs", name = "I", descriptor = "I")
    private static int field5589;

    @OriginalMember(owner = "client!vs", name = "O", descriptor = "I")
    private static int field5595;

    @OriginalMember(owner = "client!vs", name = "P", descriptor = "I")
    private int field5596;

    @OriginalMember(owner = "client!vs", name = "S", descriptor = "I")
    private int field5599;

    @OriginalMember(owner = "client!vs", name = "T", descriptor = "I")
    private int field5600;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "Z")
    private boolean field5569;

    @OriginalMember(owner = "client!vs", name = "J", descriptor = "Z")
    private boolean field5590;

    @OriginalMember(owner = "client!vs", name = "Q", descriptor = "[B")
    private static byte[] field5597;

    @OriginalMember(owner = "client!vs", name = "U", descriptor = "[B")
    private byte[] field5601;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "[F")
    private static float[] field5568;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "[F")
    private static float[] field5571;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "[F")
    private static float[] field5572;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "[F")
    private static float[] field5573;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "[F")
    private static float[] field5586;

    @OriginalMember(owner = "client!vs", name = "K", descriptor = "[F")
    private static float[] field5591;

    @OriginalMember(owner = "client!vs", name = "N", descriptor = "[F")
    private float[] field5594;

    @OriginalMember(owner = "client!vs", name = "R", descriptor = "[F")
    private static float[] field5598;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "[I")
    private static int[] field5580;

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "[I")
    private static int[] field5583;

    @OriginalMember(owner = "client!vs", name = "H", descriptor = "[I")
    private static int[] field5588;

    @OriginalMember(owner = "client!vs", name = "L", descriptor = "[Luh;")
    private static class105[] field5592;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "[Lrf;")
    private static class118[] field5575;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "[Lqu;")
    public static class214[] field5577;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "[Llt;")
    private static class221[] field5576;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "[Z")
    private static boolean[] field5579;

    @OriginalMember(owner = "client!vs", name = "M", descriptor = "[[B")
    private byte[][] field5593;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "()V", line = 4)
    public static void method2267() {
        field5597 = null;
        field5577 = null;
        field5576 = null;
        field5575 = null;
        field5592 = null;
        field5579 = null;
        field5588 = null;
        field5571 = null;
        field5586 = null;
        field5572 = null;
        field5598 = null;
        field5568 = null;
        field5591 = null;
        field5573 = null;
        field5583 = null;
        field5580 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([B)V", line = 29)
    private static final void method2268(byte[] arg0) {
        method2274(arg0, 0);
        field5584 = 0x1 << method2271(4);
        field5595 = 0x1 << method2271(4);
        field5571 = new float[field5595];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5584 : field5595;
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
            int var25 = class166.method1168(1, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class397.method2439(122, var26, var25);
            }
            if (var1 == 0) {
                field5586 = var18;
                field5572 = var20;
                field5598 = var22;
                field5583 = var24;
            } else {
                field5568 = var18;
                field5591 = var20;
                field5573 = var22;
                field5580 = var24;
            }
        }
        int var2 = method2271(8) + 1;
        field5577 = new class214[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5577[var3] = new class214();
        }
        int var4 = method2271(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2271(16);
        }
        int var6 = method2271(6) + 1;
        field5576 = new class221[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5576[var7] = new class221();
        }
        int var8 = method2271(6) + 1;
        field5575 = new class118[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5575[var9] = new class118();
        }
        int var10 = method2271(6) + 1;
        field5592 = new class105[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5592[var11] = new class105();
        }
        int var12 = method2271(6) + 1;
        field5579 = new boolean[var12];
        field5588 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5579[var13] = method2277() != 0;
            method2271(16);
            method2271(16);
            field5588[var13] = method2271(8);
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "([B)V", line = 182)
    private final void method2269(byte[] arg0) {
        class91 var2 = new class91(arg0);
        this.field5585 = var2.method626((byte) 100);
        this.field5574 = var2.method626((byte) 100);
        this.field5570 = var2.method626((byte) 100);
        this.field5578 = var2.method626((byte) 100);
        if (this.field5578 < 0) {
            this.field5578 = ~this.field5578;
            this.field5590 = true;
        }
        int var3 = var2.method626((byte) 100);
        this.field5593 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method618((byte) 100);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method617(0, var5, false, var7);
            this.field5593[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)F", line = 226)
    public static final float method2270(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)I", line = 246)
    public static final int method2271(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5589) {
            int var4 = 8 - field5589;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5597[field5587] >> field5589 & var5) << var2;
            field5589 = 0;
            field5587++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5597[field5587] >> field5589 & var3) << var2;
            field5589 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lns;II)Lvs;", line = 279)
    public static final class360 method2272(class438 arg0, int arg1, int arg2) {
        if (method2275(arg0)) {
            byte[] var3 = arg0.method2650(arg2, -36, arg1);
            return var3 == null ? null : new class360(var3);
        } else {
            arg0.method2647(54, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lns;I)Lvs;", line = 295)
    public static final class360 method2273(class438 arg0, int arg1) {
        if (method2275(arg0)) {
            byte[] var2 = arg0.method2638(true, arg1);
            return var2 == null ? null : new class360(var2);
        } else {
            arg0.method2624(-119, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([BI)V", line = 311)
    private static final void method2274(byte[] arg0, int arg1) {
        field5597 = arg0;
        field5587 = arg1;
        field5589 = 0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lns;)Z", line = 318)
    private static final boolean method2275(class438 arg0) {
        if (!field5581) {
            byte[] var1 = arg0.method2650(0, -64, 0);
            if (var1 == null) {
                return false;
            }
            method2268(var1);
            field5581 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([I)Luq;", line = 335)
    public final class343 method2276(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5601 == null) {
            this.field5596 = 0;
            this.field5594 = new float[field5595];
            this.field5601 = new byte[this.field5574];
            this.field5599 = 0;
            this.field5600 = 0;
        }
        while (this.field5600 < this.field5593.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2278(this.field5600);
            if (var3 != null) {
                int var4 = this.field5599;
                int var5 = var3.length;
                if (var5 > this.field5574 - var4) {
                    var5 = this.field5574 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5601[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5599;
                }
                this.field5599 = var4;
            }
            this.field5600++;
        }
        this.field5594 = null;
        byte[] var2 = this.field5601;
        this.field5601 = null;
        return new class343(this.field5585, var2, this.field5570, this.field5578, this.field5590);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "()I", line = 397)
    public static final int method2277() {
        int var0 = field5597[field5587] >> field5589 & 0x1;
        field5589++;
        field5587 += field5589 >> 3;
        field5589 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)[F", line = 404)
    private final float[] method2278(int arg0) {
        method2274(this.field5593[arg0], 0);
        method2277();
        int var2 = method2271(class166.method1168(1, field5588.length - 1));
        boolean var3 = field5579[var2];
        int var4 = var3 ? field5595 : field5584;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2277() != 0;
            var6 = method2277() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5584 >> 2);
            var9 = (field5584 >> 2) + (var4 >> 2);
            var10 = field5584 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5584 >> 2);
            var12 = (field5584 >> 2) + (var4 - (var4 >> 2));
            var13 = field5584 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class105 var14 = field5592[field5588[var2]];
        int var15 = var14.field1502;
        int var16 = var14.field1503[var15];
        boolean var17 = !field5576[var16].method1496();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1501; var19++) {
            class118 var95 = field5575[var14.field1500[var19]];
            float[] var96 = field5571;
            var95.method763(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1502;
            int var21 = var14.field1503[var20];
            field5576[var21].method1497(field5571, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5571[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5571;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5568 : field5586;
            float[] var30 = var3 ? field5591 : field5572;
            float[] var31 = var3 ? field5573 : field5598;
            int[] var32 = var3 ? field5580 : field5583;
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
            int var35 = class166.method1168(1, var4 - 1);
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
                field5571[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5571[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5596 > 0) {
            int var49 = this.field5596 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5569) {
                for (int var50 = 0; var50 < this.field5582; var50++) {
                    int var51 = (this.field5596 >> 1) + var50;
                    var48[var50] += this.field5594[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5571[var52];
                }
            }
        }
        float[] var54 = this.field5594;
        this.field5594 = field5571;
        field5571 = var54;
        this.field5596 = var4;
        this.field5582 = var12 - (var4 >> 1);
        this.field5569 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "([B)V", line = 815)
    private class360(byte[] arg0) {
        this.method2269(arg0);
    }
}
