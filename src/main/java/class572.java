import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class572 extends class108 {

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Z")
    private static boolean field7986 = false;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    private int field7977;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    private static int field7978;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    private static int field7982;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    private int field7984;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    private int field7987;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    private int field7988;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    private int field7992;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    private static int field7993;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
    private static int field7995;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    private int field8002;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    private int field8004;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    private int field8005;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Z")
    private boolean field7979;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "Z")
    private boolean field8000;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "[B")
    private static byte[] field7983;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "[B")
    private byte[] field8003;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "[F")
    private static float[] field7975;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "[F")
    private float[] field7980;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "[F")
    private static float[] field7981;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "[F")
    private static float[] field7989;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "[F")
    private static float[] field7991;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "[F")
    private static float[] field7994;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "[F")
    private static float[] field7998;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "[F")
    private static float[] field7999;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "[I")
    private static int[] field7997;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "[I")
    private static int[] field8001;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "[I")
    private static int[] field8006;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[Lnr;")
    private static class142[] field7990;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "[Lhm;")
    public static class461[] field7985;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "[Leo;")
    private static class517[] field7974;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "[Lus;")
    private static class524[] field7996;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "[Z")
    private static boolean[] field8007;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[[B")
    private byte[][] field7976;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkr;)Z")
    private static final boolean method3220(class329 arg0) {
        if (!field7986) {
            byte[] var1 = arg0.method2054(true, 0, 0);
            if (var1 == null) {
                return false;
            }
            method3228(var1);
            field7986 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)F")
    public static final float method3221(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkr;II)Lka;")
    public static final class572 method3222(class329 arg0, int arg1, int arg2) {
        if (method3220(arg0)) {
            byte[] var3 = arg0.method2054(true, arg1, arg2);
            return var3 == null ? null : new class572(var3);
        } else {
            arg0.method2051(arg2, arg1, -126);
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I)Lti;")
    public final class300 method3223(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field8003 == null) {
            this.field8002 = 0;
            this.field7980 = new float[field7995];
            this.field8003 = new byte[this.field7977];
            this.field8004 = 0;
            this.field8005 = 0;
        }
        while (this.field8005 < this.field7976.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3226(this.field8005);
            if (var3 != null) {
                int var4 = this.field8004;
                int var5 = var3.length;
                if (var5 > this.field7977 - var4) {
                    var5 = this.field7977 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field8003[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field8004;
                }
                this.field8004 = var4;
            }
            this.field8005++;
        }
        this.field7980 = null;
        byte[] var2 = this.field8003;
        this.field8003 = null;
        return new class300(this.field7987, var2, this.field7988, this.field7992, this.field8000);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkr;I)Lka;")
    public static final class572 method3224(class329 arg0, int arg1) {
        if (method3220(arg0)) {
            byte[] var2 = arg0.method2076(1, arg1);
            return var2 == null ? null : new class572(var2);
        } else {
            arg0.method2042((byte) -80, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)I")
    public static final int method3225(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field7978) {
            int var4 = 8 - field7978;
            int var5 = (0x1 << var4) - 1;
            var1 += (field7983[field7982] >> field7978 & var5) << var2;
            field7978 = 0;
            field7982++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field7983[field7982] >> field7978 & var3) << var2;
            field7978 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)[F")
    private final float[] method3226(int arg0) {
        method3227(this.field7976[arg0], 0);
        method3229();
        int var2 = method3225(class330.method2080((byte) -88, field7997.length - 1));
        boolean var3 = field8007[var2];
        int var4 = var3 ? field7995 : field7993;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3229() != 0;
            var6 = method3229() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field7993 >> 2);
            var9 = (field7993 >> 2) + (var4 >> 2);
            var10 = field7993 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field7993 >> 2);
            var12 = (field7993 >> 2) + (var4 - (var4 >> 2));
            var13 = field7993 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class142 var14 = field7990[field7997[var2]];
        int var15 = var14.field1818;
        int var16 = var14.field1821[var15];
        boolean var17 = !field7974[var16].method2876();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1820; var19++) {
            class524 var95 = field7996[var14.field1819[var19]];
            float[] var96 = field7994;
            var95.method2928(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1818;
            int var21 = var14.field1821[var20];
            field7974[var21].method2872(field7994, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field7994[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field7994;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field7981 : field7989;
            float[] var30 = var3 ? field7991 : field7975;
            float[] var31 = var3 ? field7998 : field7999;
            int[] var32 = var3 ? field8006 : field8001;
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
            int var35 = class330.method2080((byte) -126, var4 - 1);
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
                field7994[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field7994[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field8002 > 0) {
            int var49 = this.field8002 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field7979) {
                for (int var50 = 0; var50 < this.field7984; var50++) {
                    int var51 = (this.field8002 >> 1) + var50;
                    var48[var50] += this.field7980[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field7994[var52];
                }
            }
        }
        float[] var54 = this.field7980;
        this.field7980 = field7994;
        field7994 = var54;
        this.field8002 = var4;
        this.field7984 = var12 - (var4 >> 1);
        this.field7979 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BI)V")
    private static final void method3227(byte[] arg0, int arg1) {
        field7983 = arg0;
        field7982 = arg1;
        field7978 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([B)V")
    private static final void method3228(byte[] arg0) {
        method3227(arg0, 0);
        field7993 = 0x1 << method3225(4);
        field7995 = 0x1 << method3225(4);
        field7994 = new float[field7995];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field7993 : field7995;
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
            int var25 = class330.method2080((byte) -94, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class194.method1246(-74, var25, var26);
            }
            if (var1 == 0) {
                field7989 = var18;
                field7975 = var20;
                field7999 = var22;
                field8001 = var24;
            } else {
                field7981 = var18;
                field7991 = var20;
                field7998 = var22;
                field8006 = var24;
            }
        }
        int var2 = method3225(8) + 1;
        field7985 = new class461[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field7985[var3] = new class461();
        }
        int var4 = method3225(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3225(16);
        }
        int var6 = method3225(6) + 1;
        field7974 = new class517[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field7974[var7] = new class517();
        }
        int var8 = method3225(6) + 1;
        field7996 = new class524[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field7996[var9] = new class524();
        }
        int var10 = method3225(6) + 1;
        field7990 = new class142[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field7990[var11] = new class142();
        }
        int var12 = method3225(6) + 1;
        field8007 = new boolean[var12];
        field7997 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field8007[var13] = method3229() != 0;
            method3225(16);
            method3225(16);
            field7997[var13] = method3225(8);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()I")
    public static final int method3229() {
        int var0 = field7983[field7982] >> field7978 & 0x1;
        field7978++;
        field7982 += field7978 >> 3;
        field7978 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public static void method3230() {
        field7983 = null;
        field7985 = null;
        field7974 = null;
        field7996 = null;
        field7990 = null;
        field8007 = null;
        field7997 = null;
        field7994 = null;
        field7989 = null;
        field7975 = null;
        field7999 = null;
        field7981 = null;
        field7991 = null;
        field7998 = null;
        field8001 = null;
        field8006 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
    private class572(byte[] arg0) {
        this.method3231(arg0);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([B)V")
    private final void method3231(byte[] arg0) {
        class551 var2 = new class551(arg0);
        this.field7987 = var2.method3048(-4);
        this.field7977 = var2.method3048(-4);
        this.field7988 = var2.method3048(-4);
        this.field7992 = var2.method3048(-4);
        if (this.field7992 < 0) {
            this.field7992 = ~this.field7992;
            this.field8000 = true;
        }
        int var3 = var2.method3048(-4);
        this.field7976 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3045(-125);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3086(0, var7, true, var5);
            this.field7976[var4] = var7;
        }
    }
}
