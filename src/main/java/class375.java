import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class375 extends class320 {

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "Z")
    private static boolean field5695 = false;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    private static int field5672;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    private int field5674;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    private int field5675;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    private int field5679;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    private static int field5681;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    private static int field5684;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    private static int field5690;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    private int field5696;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    private int field5699;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    private int field5700;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    private int field5703;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    private int field5705;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Z")
    private boolean field5683;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "Z")
    private boolean field5693;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "[B")
    private static byte[] field5688;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "[B")
    private byte[] field5702;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "[F")
    private static float[] field5676;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "[F")
    private static float[] field5686;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "[F")
    private float[] field5687;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "[F")
    private static float[] field5689;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "[F")
    private static float[] field5691;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "[F")
    private static float[] field5694;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "[F")
    private static float[] field5697;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "[F")
    private static float[] field5704;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "[I")
    private static int[] field5673;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
    private static int[] field5677;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "[I")
    private static int[] field5680;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "[Ltu;")
    private static class230[] field5678;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "[Lmi;")
    private static class340[] field5682;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "[Lpm;")
    private static class411[] field5692;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "[Lcp;")
    public static class508[] field5701;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "[Z")
    private static boolean[] field5698;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "[[B")
    private byte[][] field5685;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
    public static void method2330() {
        field5688 = null;
        field5701 = null;
        field5678 = null;
        field5692 = null;
        field5682 = null;
        field5698 = null;
        field5677 = null;
        field5676 = null;
        field5704 = null;
        field5689 = null;
        field5691 = null;
        field5697 = null;
        field5694 = null;
        field5686 = null;
        field5673 = null;
        field5680 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()I")
    public static final int method2331() {
        int var0 = field5688[field5681] >> field5690 & 0x1;
        field5690++;
        field5681 += field5690 >> 3;
        field5690 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lbu;I)Lvi;")
    public static final class375 method2332(class17 arg0, int arg1) {
        if (method2341(arg0)) {
            byte[] var2 = arg0.method140(arg1, 1);
            return var2 == null ? null : new class375(var2);
        } else {
            arg0.method129(true, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([I)Lbq;")
    public final class189 method2333(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5702 == null) {
            this.field5696 = 0;
            this.field5687 = new float[field5684];
            this.field5702 = new byte[this.field5679];
            this.field5705 = 0;
            this.field5703 = 0;
        }
        while (this.field5703 < this.field5685.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2340(this.field5703);
            if (var3 != null) {
                int var4 = this.field5705;
                int var5 = var3.length;
                if (var5 > this.field5679 - var4) {
                    var5 = this.field5679 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5702[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5705;
                }
                this.field5705 = var4;
            }
            this.field5703++;
        }
        this.field5687 = null;
        byte[] var2 = this.field5702;
        this.field5702 = null;
        return new class189(this.field5700, var2, this.field5699, this.field5675, this.field5683);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([B)V")
    private final void method2334(byte[] arg0) {
        class145 var2 = new class145(arg0);
        this.field5700 = var2.method1070(-32387);
        this.field5679 = var2.method1070(-32387);
        this.field5699 = var2.method1070(-32387);
        this.field5675 = var2.method1070(-32387);
        if (this.field5675 < 0) {
            this.field5675 = ~this.field5675;
            this.field5683 = true;
        }
        int var3 = var2.method1070(-32387);
        this.field5685 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1063((byte) 103);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1061(var5, var7, 0, 101);
            this.field5685[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lbu;II)Lvi;")
    public static final class375 method2335(class17 arg0, int arg1, int arg2) {
        if (method2341(arg0)) {
            byte[] var3 = arg0.method114(arg2, arg1, -53);
            return var3 == null ? null : new class375(var3);
        } else {
            arg0.method137(0, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)F")
    public static final float method2336(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([BI)V")
    private static final void method2337(byte[] arg0, int arg1) {
        field5688 = arg0;
        field5681 = arg1;
        field5690 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "([B)V")
    private static final void method2338(byte[] arg0) {
        method2337(arg0, 0);
        field5672 = 0x1 << method2339(4);
        field5684 = 0x1 << method2339(4);
        field5676 = new float[field5684];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5672 : field5684;
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
            int var25 = class210.method1417(var17 - 1, 0);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class422.method2549(var25, var26, (byte) 125);
            }
            if (var1 == 0) {
                field5704 = var18;
                field5689 = var20;
                field5691 = var22;
                field5673 = var24;
            } else {
                field5697 = var18;
                field5694 = var20;
                field5686 = var22;
                field5680 = var24;
            }
        }
        int var2 = method2339(8) + 1;
        field5701 = new class508[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5701[var3] = new class508();
        }
        int var4 = method2339(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2339(16);
        }
        int var6 = method2339(6) + 1;
        field5678 = new class230[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5678[var7] = new class230();
        }
        int var8 = method2339(6) + 1;
        field5692 = new class411[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5692[var9] = new class411();
        }
        int var10 = method2339(6) + 1;
        field5682 = new class340[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5682[var11] = new class340();
        }
        int var12 = method2339(6) + 1;
        field5698 = new boolean[var12];
        field5677 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5698[var13] = method2331() != 0;
            method2339(16);
            method2339(16);
            field5677[var13] = method2339(8);
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)I")
    public static final int method2339(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5690) {
            int var4 = 8 - field5690;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5688[field5681] >> field5690 & var5) << var2;
            field5690 = 0;
            field5681++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5688[field5681] >> field5690 & var3) << var2;
            field5690 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)[F")
    private final float[] method2340(int arg0) {
        method2337(this.field5685[arg0], 0);
        method2331();
        int var2 = method2339(class210.method1417(field5677.length - 1, 0));
        boolean var3 = field5698[var2];
        int var4 = var3 ? field5684 : field5672;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2331() != 0;
            var6 = method2331() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5672 >> 2);
            var9 = (field5672 >> 2) + (var4 >> 2);
            var10 = field5672 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5672 >> 2);
            var12 = (field5672 >> 2) + (var4 - (var4 >> 2));
            var13 = field5672 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class340 var14 = field5682[field5677[var2]];
        int var15 = var14.field5140;
        int var16 = var14.field5143[var15];
        boolean var17 = !field5678[var16].method1502();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5141; var19++) {
            class411 var95 = field5692[var14.field5142[var19]];
            float[] var96 = field5676;
            var95.method2494(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5140;
            int var21 = var14.field5143[var20];
            field5678[var21].method1496(field5676, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5676[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5676;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5697 : field5704;
            float[] var30 = var3 ? field5694 : field5689;
            float[] var31 = var3 ? field5686 : field5691;
            int[] var32 = var3 ? field5680 : field5673;
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
            int var35 = class210.method1417(var4 - 1, 0);
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
                field5676[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5676[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5696 > 0) {
            int var49 = this.field5696 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5693) {
                for (int var50 = 0; var50 < this.field5674; var50++) {
                    int var51 = (this.field5696 >> 1) + var50;
                    var48[var50] += this.field5687[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5676[var52];
                }
            }
        }
        float[] var54 = this.field5687;
        this.field5687 = field5676;
        field5676 = var54;
        this.field5696 = var4;
        this.field5674 = var12 - (var4 >> 1);
        this.field5693 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lbu;)Z")
    private static final boolean method2341(class17 arg0) {
        if (!field5695) {
            byte[] var1 = arg0.method114(0, 0, 121);
            if (var1 == null) {
                return false;
            }
            method2338(var1);
            field5695 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
    private class375(byte[] arg0) {
        this.method2334(arg0);
    }
}
