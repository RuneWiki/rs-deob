import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class307 extends class70 {

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Z")
    private static boolean field4990 = false;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    private static int field4984;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    private static int field4996;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    private static int field4998;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    private int field4999;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    private int field5000;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    private int field5002;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    private int field5007;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    private static int field5010;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    private int field5012;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    private int field5013;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Z")
    private boolean field4988;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "Z")
    private boolean field5003;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "[B")
    private static byte[] field5011;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "[B")
    private byte[] field5016;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "[F")
    private float[] field4985;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[F")
    private static float[] field4987;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[F")
    private static float[] field4993;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "[F")
    private static float[] field4994;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "[F")
    private static float[] field4995;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "[F")
    private static float[] field4997;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "[F")
    private static float[] field5001;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "[F")
    private static float[] field5009;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "[I")
    private static int[] field4989;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "[I")
    private static int[] field4992;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "[I")
    private static int[] field5006;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[Lq;")
    private static class113[] field4986;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "[Lmj;")
    private static class256[] field5008;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "[Lwi;")
    public static class290[] field4991;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "[Lef;")
    private static class357[] field5014;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "[Z")
    private static boolean[] field5005;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "[[B")
    private byte[][] field5004;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)[F", line = 5)
    private final float[] method2236(int arg0) {
        method2244(this.field5004[arg0], 0);
        method2238();
        int var2 = method2242(class52.method454(field5006.length - 1, (byte) -111));
        boolean var3 = field5005[var2];
        int var4 = var3 ? field4998 : field5010;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2238() != 0;
            var6 = method2238() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5010 >> 2);
            var9 = (field5010 >> 2) + (var4 >> 2);
            var10 = field5010 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5010 >> 2);
            var12 = (field5010 >> 2) + (var4 - (var4 >> 2));
            var13 = field5010 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class113 var14 = field4986[field5006[var2]];
        int var15 = var14.field2052;
        int var16 = var14.field2053[var15];
        boolean var17 = !field5008[var16].method1796();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2051; var19++) {
            class357 var20 = field5014[var14.field2054[var19]];
            float[] var21 = field5001;
            var20.method2528(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field2052;
            int var23 = var14.field2053[var22];
            field5008[var23].method1792(field5001, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field5001[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field5001;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field5009 : field4993;
            float[] var32 = var3 ? field4995 : field4994;
            float[] var33 = var3 ? field4987 : field4997;
            int[] var34 = var3 ? field4992 : field4989;
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
            int var47 = class52.method454(var4 - 1, (byte) -109);
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
                field5001[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5001[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field5000 > 0) {
            int var91 = this.field5000 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4988) {
                for (int var92 = 0; var92 < this.field5013; var92++) {
                    int var93 = (this.field5000 >> 1) + var92;
                    var90[var92] += this.field4985[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field5001[var94];
                }
            }
        }
        float[] var96 = this.field4985;
        this.field4985 = field5001;
        field5001 = var96;
        this.field5000 = var4;
        this.field5013 = var12 - (var4 >> 1);
        this.field4988 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([B)V", line = 422)
    private static final void method2237(byte[] arg0) {
        method2244(arg0, 0);
        field5010 = 0x1 << method2242(4);
        field4998 = 0x1 << method2242(4);
        field5001 = new float[field4998];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field5010 : field4998;
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
            int var13 = class52.method454(var5 - 1, (byte) -121);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class78.method592(var13, false, var14);
            }
            if (var1 == 0) {
                field4993 = var6;
                field4994 = var8;
                field4997 = var10;
                field4989 = var12;
            } else {
                field5009 = var6;
                field4995 = var8;
                field4987 = var10;
                field4992 = var12;
            }
        }
        int var15 = method2242(8) + 1;
        field4991 = new class290[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4991[var16] = new class290();
        }
        int var17 = method2242(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2242(16);
        }
        int var19 = method2242(6) + 1;
        field5008 = new class256[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field5008[var20] = new class256();
        }
        int var21 = method2242(6) + 1;
        field5014 = new class357[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field5014[var22] = new class357();
        }
        int var23 = method2242(6) + 1;
        field4986 = new class113[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4986[var24] = new class113();
        }
        int var25 = method2242(6) + 1;
        field5005 = new boolean[var25];
        field5006 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field5005[var26] = method2238() != 0;
            method2242(16);
            method2242(16);
            field5006[var26] = method2242(8);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()I", line = 580)
    public static final int method2238() {
        int var0 = field5011[field4984] >> field4996 & 0x1;
        field4996++;
        field4984 += field4996 >> 3;
        field4996 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lek;II)Luh;", line = 592)
    public static final class307 method2239(class206 arg0, int arg1, int arg2) {
        if (method2240(arg0)) {
            byte[] var3 = arg0.method1404(arg1, arg2, (byte) -71);
            return var3 == null ? null : new class307(var3);
        } else {
            arg0.method1421(arg1, arg2, -111);
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lek;)Z", line = 608)
    private static final boolean method2240(class206 arg0) {
        if (!field4990) {
            byte[] var1 = arg0.method1404(0, 0, (byte) -109);
            if (var1 == null) {
                return false;
            }
            method2237(var1);
            field4990 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)F", line = 629)
    public static final float method2241(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)I", line = 641)
    public static final int method2242(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4996) {
            int var3 = 8 - field4996;
            int var4 = (0x1 << var3) - 1;
            var1 += (field5011[field4984] >> field4996 & var4) << var2;
            field4996 = 0;
            field4984++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field5011[field4984] >> field4996 & var5) << var2;
            field4996 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([I)Llb;", line = 674)
    public final class236 method2243(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5016 == null) {
            this.field5000 = 0;
            this.field4985 = new float[field4998];
            this.field5016 = new byte[this.field4999];
            this.field5017 = 0;
            this.field5015 = 0;
        }
        while (this.field5015 < this.field5004.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2236(this.field5015);
            if (var2 != null) {
                int var3 = this.field5017;
                int var4 = var2.length;
                if (var4 > this.field4999 - var3) {
                    var4 = this.field4999 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field5016[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field5017;
                }
                this.field5017 = var3;
            }
            this.field5015++;
        }
        this.field4985 = null;
        byte[] var7 = this.field5016;
        this.field5016 = null;
        return new class236(this.field5007, var7, this.field5012, this.field5002, this.field5003);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([BI)V", line = 734)
    private static final void method2244(byte[] arg0, int arg1) {
        field5011 = arg0;
        field4984 = arg1;
        field4996 = 0;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "([B)V", line = 740)
    private final void method2245(byte[] arg0) {
        class146 var2 = new class146(arg0);
        this.field5007 = var2.method1004(3);
        this.field4999 = var2.method1004(3);
        this.field5012 = var2.method1004(3);
        this.field5002 = var2.method1004(3);
        if (this.field5002 < 0) {
            this.field5002 = ~this.field5002;
            this.field5003 = true;
        }
        int var3 = var2.method1004(3);
        this.field5004 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1005((byte) 122);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method994(-1, var7, var5, 0);
            this.field5004[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()V", line = 782)
    public static void method2246() {
        field5011 = null;
        field4991 = null;
        field5008 = null;
        field5014 = null;
        field4986 = null;
        field5005 = null;
        field5006 = null;
        field5001 = null;
        field4993 = null;
        field4994 = null;
        field4997 = null;
        field5009 = null;
        field4995 = null;
        field4987 = null;
        field4989 = null;
        field4992 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "([B)V", line = 803)
    private class307(byte[] arg0) {
        this.method2245(arg0);
    }
}
