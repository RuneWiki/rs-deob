import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class527 extends class42 {

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "Z")
    private static boolean field7686 = false;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    private int field7685;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    private static int field7689;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    private int field7694;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    private static int field7697;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    private int field7701;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    private static int field7702;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    private int field7703;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    private int field7704;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    private int field7705;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    private int field7707;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    private static int field7710;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    private int field7711;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Z")
    private boolean field7682;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "Z")
    private boolean field7696;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "[B")
    private static byte[] field7679;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "[B")
    private byte[] field7708;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "[F")
    private static float[] field7678;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "[F")
    private static float[] field7680;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "[F")
    private static float[] field7681;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "[F")
    private float[] field7683;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "[F")
    private static float[] field7691;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "[F")
    private static float[] field7692;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "[F")
    private static float[] field7698;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "[F")
    private static float[] field7699;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "[I")
    private static int[] field7684;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "[I")
    private static int[] field7690;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "[I")
    private static int[] field7706;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "[Lae;")
    private static class169[] field7709;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "[Llp;")
    public static class273[] field7688;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "[Lwe;")
    private static class286[] field7687;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "[Lps;")
    private static class64[] field7700;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "[Z")
    private static boolean[] field7695;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "[[B")
    private byte[][] field7693;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I")
    public static final int method3121(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field7697) {
            int var4 = 8 - field7697;
            int var5 = (0x1 << var4) - 1;
            var1 += (field7679[field7689] >> field7697 & var5) << var2;
            field7697 = 0;
            field7689++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field7679[field7689] >> field7697 & var3) << var2;
            field7697 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([B)V")
    private static final void method3122(byte[] arg0) {
        method3124(arg0, 0);
        field7710 = 0x1 << method3121(4);
        field7702 = 0x1 << method3121(4);
        field7699 = new float[field7702];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field7710 : field7702;
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
            int var25 = class100.method743(var17 - 1, (byte) -125);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class153.method1083(-19392, var25, var26);
            }
            if (var1 == 0) {
                field7698 = var18;
                field7678 = var20;
                field7691 = var22;
                field7706 = var24;
            } else {
                field7681 = var18;
                field7692 = var20;
                field7680 = var22;
                field7684 = var24;
            }
        }
        int var2 = method3121(8) + 1;
        field7688 = new class273[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field7688[var3] = new class273();
        }
        int var4 = method3121(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3121(16);
        }
        int var6 = method3121(6) + 1;
        field7700 = new class64[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field7700[var7] = new class64();
        }
        int var8 = method3121(6) + 1;
        field7709 = new class169[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field7709[var9] = new class169();
        }
        int var10 = method3121(6) + 1;
        field7687 = new class286[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field7687[var11] = new class286();
        }
        int var12 = method3121(6) + 1;
        field7695 = new boolean[var12];
        field7690 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field7695[var13] = method3130() != 0;
            method3121(16);
            method3121(16);
            field7690[var13] = method3121(8);
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)F")
    public static final float method3123(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([BI)V")
    private static final void method3124(byte[] arg0, int arg1) {
        field7679 = arg0;
        field7689 = arg1;
        field7697 = 0;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)[F")
    private final float[] method3125(int arg0) {
        method3124(this.field7693[arg0], 0);
        method3130();
        int var2 = method3121(class100.method743(field7690.length - 1, (byte) -101));
        boolean var3 = field7695[var2];
        int var4 = var3 ? field7702 : field7710;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3130() != 0;
            var6 = method3130() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field7710 >> 2);
            var9 = (field7710 >> 2) + (var4 >> 2);
            var10 = field7710 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field7710 >> 2);
            var12 = (field7710 >> 2) + (var4 - (var4 >> 2));
            var13 = field7710 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class286 var14 = field7687[field7690[var2]];
        int var15 = var14.field4244;
        int var16 = var14.field4243[var15];
        boolean var17 = !field7700[var16].method521();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4242; var19++) {
            class169 var95 = field7709[var14.field4245[var19]];
            float[] var96 = field7699;
            var95.method1205(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4244;
            int var21 = var14.field4243[var20];
            field7700[var21].method522(field7699, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field7699[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field7699;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field7681 : field7698;
            float[] var30 = var3 ? field7692 : field7678;
            float[] var31 = var3 ? field7680 : field7691;
            int[] var32 = var3 ? field7684 : field7706;
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
            int var35 = class100.method743(var4 - 1, (byte) -92);
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
                field7699[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field7699[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field7694 > 0) {
            int var49 = this.field7694 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field7696) {
                for (int var50 = 0; var50 < this.field7704; var50++) {
                    int var51 = (this.field7694 >> 1) + var50;
                    var48[var50] += this.field7683[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field7699[var52];
                }
            }
        }
        float[] var54 = this.field7683;
        this.field7683 = field7699;
        field7699 = var54;
        this.field7694 = var4;
        this.field7704 = var12 - (var4 >> 1);
        this.field7696 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([I)Lcv;")
    public final class407 method3126(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field7708 == null) {
            this.field7694 = 0;
            this.field7683 = new float[field7702];
            this.field7708 = new byte[this.field7701];
            this.field7711 = 0;
            this.field7707 = 0;
        }
        while (this.field7707 < this.field7693.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3125(this.field7707);
            if (var3 != null) {
                int var4 = this.field7711;
                int var5 = var3.length;
                if (var5 > this.field7701 - var4) {
                    var5 = this.field7701 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field7708[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field7711;
                }
                this.field7711 = var4;
            }
            this.field7707++;
        }
        this.field7683 = null;
        byte[] var2 = this.field7708;
        this.field7708 = null;
        return new class407(this.field7703, var2, this.field7685, this.field7705, this.field7682);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "([B)V")
    private final void method3127(byte[] arg0) {
        class519 var2 = new class519(arg0);
        this.field7703 = var2.method3053(-129);
        this.field7701 = var2.method3053(-129);
        this.field7685 = var2.method3053(-129);
        this.field7705 = var2.method3053(-129);
        if (this.field7705 < 0) {
            this.field7705 = ~this.field7705;
            this.field7682 = true;
        }
        int var3 = var2.method3053(-129);
        this.field7693 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3072((byte) -125);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3024(var5, var7, 0, (byte) -62);
            this.field7693[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lci;I)Lql;")
    public static final class527 method3128(class320 arg0, int arg1) {
        if (method3129(arg0)) {
            byte[] var2 = arg0.method2029(arg1, false);
            return var2 == null ? null : new class527(var2);
        } else {
            arg0.method2035(arg1, (byte) -94);
            return null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lci;)Z")
    private static final boolean method3129(class320 arg0) {
        if (!field7686) {
            byte[] var1 = arg0.method2037(0, (byte) 78, 0);
            if (var1 == null) {
                return false;
            }
            method3122(var1);
            field7686 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()I")
    public static final int method3130() {
        int var0 = field7679[field7689] >> field7697 & 0x1;
        field7697++;
        field7689 += field7697 >> 3;
        field7697 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lci;II)Lql;")
    public static final class527 method3131(class320 arg0, int arg1, int arg2) {
        if (method3129(arg0)) {
            byte[] var3 = arg0.method2037(arg2, (byte) 106, arg1);
            return var3 == null ? null : new class527(var3);
        } else {
            arg0.method2019(arg1, arg2, 107);
            return null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "([B)V")
    private class527(byte[] arg0) {
        this.method3127(arg0);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()V")
    public static void method3132() {
        field7679 = null;
        field7688 = null;
        field7700 = null;
        field7709 = null;
        field7687 = null;
        field7695 = null;
        field7690 = null;
        field7699 = null;
        field7698 = null;
        field7678 = null;
        field7691 = null;
        field7681 = null;
        field7692 = null;
        field7680 = null;
        field7706 = null;
        field7684 = null;
    }
}
