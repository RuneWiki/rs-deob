import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class167 extends class240 {

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Z")
    private static boolean field2593 = false;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    private static int field2569;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    private static int field2575;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    private int field2577;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    private static int field2579;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    private int field2581;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    private int field2582;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    private static int field2587;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    private int field2592;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    private int field2595;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    private int field2596;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Z")
    private boolean field2570;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "Z")
    private boolean field2591;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "[B")
    private static byte[] field2583;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "[B")
    private byte[] field2600;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[F")
    private static float[] field2567;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[F")
    private float[] field2568;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "[F")
    private static float[] field2573;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "[F")
    private static float[] field2584;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "[F")
    private static float[] field2586;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "[F")
    private static float[] field2588;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "[F")
    private static float[] field2590;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "[F")
    private static float[] field2598;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "[I")
    private static int[] field2572;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "[I")
    private static int[] field2574;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "[I")
    private static int[] field2585;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "[Lfl;")
    public static class225[] field2580;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "[Lqj;")
    private static class253[] field2576;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "[Lak;")
    private static class313[] field2599;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "[Lih;")
    private static class32[] field2589;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "[Z")
    private static boolean[] field2571;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "[[B")
    private byte[][] field2594;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()I", line = 6)
    public static final int method1218() {
        int var0 = field2583[field2575] >> field2579 & 0x1;
        field2579++;
        field2575 += field2579 >> 3;
        field2579 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lja;II)Llc;", line = 13)
    public static final class167 method1219(class64 arg0, int arg1, int arg2) {
        if (method1223(arg0)) {
            byte[] var3 = arg0.method467(arg2, 108, arg1);
            return var3 == null ? null : new class167(var3);
        } else {
            arg0.method464((byte) 23, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)I", line = 33)
    public static final int method1220(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2579) {
            int var3 = 8 - field2579;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2583[field2575] >> field2579 & var4) << var2;
            field2579 = 0;
            field2575++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2583[field2575] >> field2579 & var5) << var2;
            field2579 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([B)V", line = 61)
    private final void method1221(byte[] arg0) {
        class101 var2 = new class101(arg0);
        this.field2595 = var2.method775(58);
        this.field2592 = var2.method775(50);
        this.field2577 = var2.method775(49);
        this.field2578 = var2.method775(-107);
        if (this.field2578 < 0) {
            this.field2578 = ~this.field2578;
            this.field2591 = true;
        }
        int var3 = var2.method775(-109);
        this.field2594 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method741(38);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method770(var5, var7, -1127, 0);
            this.field2594[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)[F", line = 109)
    private final float[] method1222(int arg0) {
        method1227(this.field2594[arg0], 0);
        method1218();
        int var2 = method1220(class86.method615((byte) 71, field2572.length - 1));
        boolean var3 = field2571[var2];
        int var4 = var3 ? field2587 : field2569;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1218() != 0;
            var6 = method1218() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2569 >> 2);
            var9 = (field2569 >> 2) + (var4 >> 2);
            var10 = field2569 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2569 >> 2);
            var12 = (field2569 >> 2) + (var4 - (var4 >> 2));
            var13 = field2569 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class313 var14 = field2599[field2572[var2]];
        int var15 = var14.field4908;
        int var16 = var14.field4911[var15];
        boolean var17 = !field2589[var16].method226();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4910; var19++) {
            class253 var20 = field2576[var14.field4909[var19]];
            float[] var21 = field2588;
            var20.method1783(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field4908;
            int var23 = var14.field4911[var22];
            field2589[var23].method223(field2588, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2588[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2588;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2584 : field2590;
            float[] var32 = var3 ? field2567 : field2573;
            float[] var33 = var3 ? field2586 : field2598;
            int[] var34 = var3 ? field2585 : field2574;
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
            int var47 = class86.method615((byte) 57, var4 - 1);
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
                field2588[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2588[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2581 > 0) {
            int var91 = this.field2581 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2570) {
                for (int var92 = 0; var92 < this.field2582; var92++) {
                    int var93 = (this.field2581 >> 1) + var92;
                    var90[var92] += this.field2568[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2588[var94];
                }
            }
        }
        float[] var96 = this.field2568;
        this.field2568 = field2588;
        field2588 = var96;
        this.field2581 = var4;
        this.field2582 = var12 - (var4 >> 1);
        this.field2570 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lja;)Z", line = 527)
    private static final boolean method1223(class64 arg0) {
        if (!field2593) {
            byte[] var1 = arg0.method467(0, 92, 0);
            if (var1 == null) {
                return false;
            }
            method1226(var1);
            field2593 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()V", line = 543)
    public static void method1224() {
        field2583 = null;
        field2580 = null;
        field2589 = null;
        field2576 = null;
        field2599 = null;
        field2571 = null;
        field2572 = null;
        field2588 = null;
        field2590 = null;
        field2573 = null;
        field2598 = null;
        field2584 = null;
        field2567 = null;
        field2586 = null;
        field2574 = null;
        field2585 = null;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)F", line = 564)
    public static final float method1225(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([B)V", line = 581)
    private static final void method1226(byte[] arg0) {
        method1227(arg0, 0);
        field2569 = 0x1 << method1220(4);
        field2587 = 0x1 << method1220(4);
        field2588 = new float[field2587];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2569 : field2587;
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
            int var13 = class86.method615((byte) 108, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class56.method413(var14, var13, 100);
            }
            if (var1 == 0) {
                field2590 = var6;
                field2573 = var8;
                field2598 = var10;
                field2574 = var12;
            } else {
                field2584 = var6;
                field2567 = var8;
                field2586 = var10;
                field2585 = var12;
            }
        }
        int var15 = method1220(8) + 1;
        field2580 = new class225[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2580[var16] = new class225();
        }
        int var17 = method1220(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1220(16);
        }
        int var19 = method1220(6) + 1;
        field2589 = new class32[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2589[var20] = new class32();
        }
        int var21 = method1220(6) + 1;
        field2576 = new class253[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2576[var22] = new class253();
        }
        int var23 = method1220(6) + 1;
        field2599 = new class313[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2599[var24] = new class313();
        }
        int var25 = method1220(6) + 1;
        field2571 = new boolean[var25];
        field2572 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2571[var26] = method1218() != 0;
            method1220(16);
            method1220(16);
            field2572[var26] = method1220(8);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BI)V", line = 732)
    private static final void method1227(byte[] arg0, int arg1) {
        field2583 = arg0;
        field2575 = arg1;
        field2579 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([I)Loc;", line = 737)
    public final class144 method1228(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2600 == null) {
            this.field2581 = 0;
            this.field2568 = new float[field2587];
            this.field2600 = new byte[this.field2592];
            this.field2597 = 0;
            this.field2596 = 0;
        }
        while (this.field2596 < this.field2594.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1222(this.field2596);
            if (var2 != null) {
                int var3 = this.field2597;
                int var4 = var2.length;
                if (var4 > this.field2592 - var3) {
                    var4 = this.field2592 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2600[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2597;
                }
                this.field2597 = var3;
            }
            this.field2596++;
        }
        this.field2568 = null;
        byte[] var7 = this.field2600;
        this.field2600 = null;
        return new class144(this.field2595, var7, this.field2577, this.field2578, this.field2591);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([B)V", line = 798)
    private class167(byte[] arg0) {
        this.method1221(arg0);
    }
}
