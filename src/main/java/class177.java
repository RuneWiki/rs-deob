import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class177 extends class115 {

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
    private static boolean field2605 = false;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    private static int field2607;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    private static int field2616;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    private int field2619;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    private int field2620;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    private static int field2622;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    private int field2623;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    private static int field2626;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    private int field2629;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    private int field2631;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    private int field2632;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    private int field2633;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Z")
    private boolean field2604;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "Z")
    private boolean field2628;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "[B")
    private static byte[] field2614;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "[B")
    private byte[] field2634;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[F")
    private static float[] field2601;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "[F")
    private static float[] field2608;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "[F")
    private static float[] field2609;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "[F")
    private static float[] field2611;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "[F")
    private static float[] field2613;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "[F")
    private float[] field2617;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "[F")
    private static float[] field2624;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "[F")
    private static float[] field2627;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
    private static int[] field2602;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "[I")
    private static int[] field2621;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "[I")
    private static int[] field2625;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[Lfc;")
    private static class255[] field2603;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "[Lpd;")
    private static class322[] field2615;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "[Los;")
    public static class388[] field2630;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "[Lwu;")
    private static class417[] field2612;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[Z")
    private static boolean[] field2606;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "[[B")
    private byte[][] field2610;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lok;I)Lpj;")
    public static final class177 method1205(class74 arg0, int arg1) {
        if (method1209(arg0)) {
            byte[] var2 = arg0.method526(arg1, 1);
            return var2 == null ? null : new class177(var2);
        } else {
            arg0.method551(-80, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([B)V")
    private final void method1206(byte[] arg0) {
        class468 var2 = new class468(arg0);
        this.field2619 = var2.method2722(false);
        this.field2623 = var2.method2722(false);
        this.field2629 = var2.method2722(false);
        this.field2618 = var2.method2722(false);
        if (this.field2618 < 0) {
            this.field2618 = ~this.field2618;
            this.field2628 = true;
        }
        int var3 = var2.method2722(false);
        this.field2610 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2765(99);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2716(0, -117, var7, var5);
            this.field2610[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "([B)V")
    private static final void method1207(byte[] arg0) {
        method1213(arg0, 0);
        field2616 = 0x1 << method1212(4);
        field2622 = 0x1 << method1212(4);
        field2624 = new float[field2622];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2616 : field2622;
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
            int var25 = class34.method292(var17 - 1, 108);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class504.method2981(var26, var25, -93);
            }
            if (var1 == 0) {
                field2627 = var18;
                field2611 = var20;
                field2601 = var22;
                field2621 = var24;
            } else {
                field2608 = var18;
                field2609 = var20;
                field2613 = var22;
                field2602 = var24;
            }
        }
        int var2 = method1212(8) + 1;
        field2630 = new class388[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2630[var3] = new class388();
        }
        int var4 = method1212(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1212(16);
        }
        int var6 = method1212(6) + 1;
        field2603 = new class255[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2603[var7] = new class255();
        }
        int var8 = method1212(6) + 1;
        field2612 = new class417[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2612[var9] = new class417();
        }
        int var10 = method1212(6) + 1;
        field2615 = new class322[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2615[var11] = new class322();
        }
        int var12 = method1212(6) + 1;
        field2606 = new boolean[var12];
        field2625 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2606[var13] = method1215() != 0;
            method1212(16);
            method1212(16);
            field2625[var13] = method1212(8);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)[F")
    private final float[] method1208(int arg0) {
        method1213(this.field2610[arg0], 0);
        method1215();
        int var2 = method1212(class34.method292(field2625.length - 1, 118));
        boolean var3 = field2606[var2];
        int var4 = var3 ? field2622 : field2616;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1215() != 0;
            var6 = method1215() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2616 >> 2);
            var9 = (field2616 >> 2) + (var4 >> 2);
            var10 = field2616 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2616 >> 2);
            var12 = (field2616 >> 2) + (var4 - (var4 >> 2));
            var13 = field2616 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class322 var14 = field2615[field2625[var2]];
        int var15 = var14.field4943;
        int var16 = var14.field4944[var15];
        boolean var17 = !field2603[var16].method1521();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4945; var19++) {
            class417 var95 = field2612[var14.field4946[var19]];
            float[] var96 = field2624;
            var95.method2490(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4943;
            int var21 = var14.field4944[var20];
            field2603[var21].method1516(field2624, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2624[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2624;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2608 : field2627;
            float[] var30 = var3 ? field2609 : field2611;
            float[] var31 = var3 ? field2613 : field2601;
            int[] var32 = var3 ? field2602 : field2621;
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
            int var35 = class34.method292(var4 - 1, 119);
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
                field2624[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2624[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2620 > 0) {
            int var49 = this.field2620 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2604) {
                for (int var50 = 0; var50 < this.field2631; var50++) {
                    int var51 = (this.field2620 >> 1) + var50;
                    var48[var50] += this.field2617[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2624[var52];
                }
            }
        }
        float[] var54 = this.field2617;
        this.field2617 = field2624;
        field2624 = var54;
        this.field2620 = var4;
        this.field2631 = var12 - (var4 >> 1);
        this.field2604 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lok;)Z")
    private static final boolean method1209(class74 arg0) {
        if (!field2605) {
            byte[] var1 = arg0.method541(0, 0, (byte) -122);
            if (var1 == null) {
                return false;
            }
            method1207(var1);
            field2605 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
    public static void method1210() {
        field2614 = null;
        field2630 = null;
        field2603 = null;
        field2612 = null;
        field2615 = null;
        field2606 = null;
        field2625 = null;
        field2624 = null;
        field2627 = null;
        field2611 = null;
        field2601 = null;
        field2608 = null;
        field2609 = null;
        field2613 = null;
        field2621 = null;
        field2602 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lok;II)Lpj;")
    public static final class177 method1211(class74 arg0, int arg1, int arg2) {
        if (method1209(arg0)) {
            byte[] var3 = arg0.method541(arg2, arg1, (byte) -122);
            return var3 == null ? null : new class177(var3);
        } else {
            arg0.method538(arg1, 100, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)I")
    public static final int method1212(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2626) {
            int var4 = 8 - field2626;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2614[field2607] >> field2626 & var5) << var2;
            field2626 = 0;
            field2607++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2614[field2607] >> field2626 & var3) << var2;
            field2626 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([BI)V")
    private static final void method1213(byte[] arg0, int arg1) {
        field2614 = arg0;
        field2607 = arg1;
        field2626 = 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([I)Llv;")
    public final class528 method1214(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2634 == null) {
            this.field2620 = 0;
            this.field2617 = new float[field2622];
            this.field2634 = new byte[this.field2623];
            this.field2632 = 0;
            this.field2633 = 0;
        }
        while (this.field2633 < this.field2610.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1208(this.field2633);
            if (var3 != null) {
                int var4 = this.field2632;
                int var5 = var3.length;
                if (var5 > this.field2623 - var4) {
                    var5 = this.field2623 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2634[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2632;
                }
                this.field2632 = var4;
            }
            this.field2633++;
        }
        this.field2617 = null;
        byte[] var2 = this.field2634;
        this.field2634 = null;
        return new class528(this.field2619, var2, this.field2629, this.field2618, this.field2628);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()I")
    public static final int method1215() {
        int var0 = field2614[field2607] >> field2626 & 0x1;
        field2626++;
        field2607 += field2626 >> 3;
        field2626 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)F")
    public static final float method1216(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([B)V")
    private class177(byte[] arg0) {
        this.method1206(arg0);
    }
}
