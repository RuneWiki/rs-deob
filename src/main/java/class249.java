import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class249 extends class66 {

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Z")
    private static boolean field3963 = false;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    private static int field3960;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    private int field3971;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    private static int field3977;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    private int field3978;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    private int field3979;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    private static int field3981;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    private int field3986;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    private int field3987;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    private static int field3988;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    private int field3989;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    private int field3992;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    private int field3993;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "Z")
    private boolean field3968;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "Z")
    private boolean field3990;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "[B")
    private static byte[] field3969;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "[B")
    private byte[] field3991;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "[F")
    private static float[] field3964;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "[F")
    private static float[] field3965;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "[F")
    private static float[] field3967;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "[F")
    private static float[] field3972;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "[F")
    private float[] field3975;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "[F")
    private static float[] field3982;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "[F")
    private static float[] field3984;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "[F")
    private static float[] field3985;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "[I")
    private static int[] field3966;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "[I")
    private static int[] field3970;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "[I")
    private static int[] field3974;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "[Lvw;")
    private static class279[] field3980;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "[Lrg;")
    private static class596[] field3976;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "[Lhn;")
    private static class671[] field3983;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[Leca;")
    public static class704[] field3962;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "[Z")
    private static boolean[] field3973;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "[[B")
    private byte[][] field3961;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()I", line = 10)
    public static final int method1766() {
        int var0 = field3969[field3988] >> field3960 & 0x1;
        field3960++;
        field3988 += field3960 >> 3;
        field3960 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)F", line = 20)
    public static final float method1767(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([I)Lqr;", line = 32)
    public final class59 method1768(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3991 == null) {
            this.field3987 = 0;
            this.field3975 = new float[field3981];
            this.field3991 = new byte[this.field3986];
            this.field3992 = 0;
            this.field3993 = 0;
        }
        while (this.field3993 < this.field3961.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1772(this.field3993);
            if (var3 != null) {
                int var4 = this.field3992;
                int var5 = var3.length;
                if (var5 > this.field3986 - var4) {
                    var5 = this.field3986 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3991[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3992;
                }
                this.field3992 = var4;
            }
            this.field3993++;
        }
        this.field3975 = null;
        byte[] var2 = this.field3991;
        this.field3991 = null;
        return new class59(this.field3989, var2, this.field3978, this.field3971, this.field3990);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()V", line = 94)
    public static void method1769() {
        field3969 = null;
        field3962 = null;
        field3983 = null;
        field3976 = null;
        field3980 = null;
        field3973 = null;
        field3970 = null;
        field3965 = null;
        field3985 = null;
        field3982 = null;
        field3972 = null;
        field3964 = null;
        field3984 = null;
        field3967 = null;
        field3966 = null;
        field3974 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lri;)Z", line = 118)
    private static final boolean method1770(class97 arg0) {
        if (!field3963) {
            byte[] var1 = arg0.method926(0, -127, 0);
            if (var1 == null) {
                return false;
            }
            method1771(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([B)V", line = 137)
    private static final void method1771(byte[] arg0) {
        method1775(arg0, 0);
        field3977 = 0x1 << method1774(4);
        field3981 = 0x1 << method1774(4);
        field3965 = new float[field3981];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3977 : field3981;
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
            int var25 = class622.method3610((byte) -125, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class414.method2639(24819, var25, var26);
            }
            if (var1 == 0) {
                field3985 = var18;
                field3982 = var20;
                field3972 = var22;
                field3966 = var24;
            } else {
                field3964 = var18;
                field3984 = var20;
                field3967 = var22;
                field3974 = var24;
            }
        }
        int var2 = method1774(8) + 1;
        field3962 = new class704[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3962[var3] = new class704();
        }
        int var4 = method1774(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1774(16);
        }
        int var6 = method1774(6) + 1;
        field3983 = new class671[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3983[var7] = new class671();
        }
        int var8 = method1774(6) + 1;
        field3976 = new class596[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3976[var9] = new class596();
        }
        int var10 = method1774(6) + 1;
        field3980 = new class279[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3980[var11] = new class279();
        }
        int var12 = method1774(6) + 1;
        field3973 = new boolean[var12];
        field3970 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3973[var13] = method1766() != 0;
            method1774(16);
            method1774(16);
            field3970[var13] = method1774(8);
        }
        field3963 = true;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)[F", line = 290)
    private final float[] method1772(int arg0) {
        method1775(this.field3961[arg0], 0);
        method1766();
        int var2 = method1774(class622.method3610((byte) -127, field3970.length - 1));
        boolean var3 = field3973[var2];
        int var4 = var3 ? field3981 : field3977;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1766() != 0;
            var6 = method1766() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3977 >> 2);
            var9 = (field3977 >> 2) + (var4 >> 2);
            var10 = field3977 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3977 >> 2);
            var12 = (field3977 >> 2) + (var4 - (var4 >> 2));
            var13 = field3977 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class279 var14 = field3980[field3970[var2]];
        int var15 = var14.field4492;
        int var16 = var14.field4494[var15];
        boolean var17 = !field3983[var16].method3840();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4491; var19++) {
            class596 var95 = field3976[var14.field4493[var19]];
            float[] var96 = field3965;
            var95.method3478(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4492;
            int var21 = var14.field4494[var20];
            field3983[var21].method3843(field3965, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3965[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3965;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3964 : field3985;
            float[] var30 = var3 ? field3984 : field3982;
            float[] var31 = var3 ? field3967 : field3972;
            int[] var32 = var3 ? field3974 : field3966;
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
            int var35 = class622.method3610((byte) -125, var4 - 1);
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
                field3965[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3965[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3987 > 0) {
            int var49 = this.field3987 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3968) {
                for (int var50 = 0; var50 < this.field3979; var50++) {
                    int var51 = (this.field3987 >> 1) + var50;
                    var48[var50] += this.field3975[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3965[var52];
                }
            }
        }
        float[] var54 = this.field3975;
        this.field3975 = field3965;
        field3965 = var54;
        this.field3987 = var4;
        this.field3979 = var12 - (var4 >> 1);
        this.field3968 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lri;II)Lkg;", line = 708)
    public static final class249 method1773(class97 arg0, int arg1, int arg2) {
        if (method1770(arg0)) {
            byte[] var3 = arg0.method926(arg1, -124, arg2);
            return var3 == null ? null : new class249(var3);
        } else {
            arg0.method931(-1, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)I", line = 726)
    public static final int method1774(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3960) {
            int var4 = 8 - field3960;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3969[field3988] >> field3960 & var5) << var2;
            field3960 = 0;
            field3988++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3969[field3988] >> field3960 & var3) << var2;
            field3960 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([BI)V", line = 754)
    private static final void method1775(byte[] arg0, int arg1) {
        field3969 = arg0;
        field3988 = arg1;
        field3960 = 0;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "([B)V", line = 761)
    private final void method1776(byte[] arg0) {
        class6 var2 = new class6(arg0);
        this.field3989 = var2.method72(-118);
        this.field3986 = var2.method72(-97);
        this.field3978 = var2.method72(-115);
        this.field3971 = var2.method72(-70);
        if (this.field3971 < 0) {
            this.field3971 = ~this.field3971;
            this.field3990 = true;
        }
        int var3 = var2.method72(-97);
        this.field3961 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method70(-9059);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method50(var7, 0, var5, (byte) 19);
            this.field3961[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lri;I)Lkg;", line = 803)
    public static final class249 method1777(class97 arg0, int arg1) {
        if (method1770(arg0)) {
            byte[] var2 = arg0.method952(62, arg1);
            return var2 == null ? null : new class249(var2);
        } else {
            arg0.method942(0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([B)V", line = 817)
    private class249(byte[] arg0) {
        this.method1776(arg0);
    }
}
