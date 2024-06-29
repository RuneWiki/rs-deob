import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class64 extends class297 {

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "Z")
    private static boolean field994 = false;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    private static int field1004;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    private static int field1009;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    private static int field986;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    private static int field996;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Z")
    private boolean field1007;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "Z")
    private boolean field998;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "[B")
    private byte[] field1012;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "[B")
    private static byte[] field995;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "[F")
    private static float[] field1000;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "[F")
    private static float[] field1001;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "[F")
    private static float[] field1002;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "[F")
    private float[] field1003;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "[F")
    private static float[] field1005;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "[F")
    private static float[] field1010;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "[F")
    private static float[] field983;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "[F")
    private static float[] field989;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "[I")
    private static int[] field982;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "[I")
    private static int[] field984;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "[I")
    private static int[] field991;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "[Lfd;")
    private static class205[] field1006;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "[Ld;")
    private static class58[] field1008;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "[Lp;")
    private static class83[] field985;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "[Ljd;")
    public static class87[] field999;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "[Z")
    private static boolean[] field988;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "[[B")
    private byte[][] field993;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([BI)V", line = 7)
    private static final void method456(byte[] arg0, int arg1) {
        field995 = arg0;
        field996 = arg1;
        field1004 = 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([I)Lda;", line = 13)
    public final class26 method457(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1012 == null) {
            this.field981 = 0;
            this.field1003 = new float[field986];
            this.field1012 = new byte[this.field992];
            this.field1011 = 0;
            this.field1013 = 0;
        }
        while (this.field1013 < this.field993.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method461(this.field1013);
            if (var2 != null) {
                int var3 = this.field1011;
                int var4 = var2.length;
                if (var4 > this.field992 - var3) {
                    var4 = this.field992 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1012[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1011;
                }
                this.field1011 = var3;
            }
            this.field1013++;
        }
        this.field1003 = null;
        byte[] var7 = this.field1012;
        this.field1012 = null;
        return new class26(this.field997, var7, this.field980, this.field990, this.field1007);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lni;)Z", line = 71)
    private static final boolean method458(class202 arg0) {
        if (!field994) {
            byte[] var1 = arg0.method1342(-121, 0, 0);
            if (var1 == null) {
                return false;
            }
            method459(var1);
            field994 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([B)V", line = 88)
    private static final void method459(byte[] arg0) {
        method456(arg0, 0);
        field1009 = 0x1 << method464(4);
        field986 = 0x1 << method464(4);
        field1005 = new float[field986];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field1009 : field986;
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
            int var13 = class276.method1877(var5 - 1, (byte) -62);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class152.method955(64, var14, var13);
            }
            if (var1 == 0) {
                field983 = var6;
                field989 = var8;
                field1002 = var10;
                field982 = var12;
            } else {
                field1010 = var6;
                field1001 = var8;
                field1000 = var10;
                field991 = var12;
            }
        }
        int var15 = method464(8) + 1;
        field999 = new class87[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field999[var16] = new class87();
        }
        int var17 = method464(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method464(16);
        }
        int var19 = method464(6) + 1;
        field1008 = new class58[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field1008[var20] = new class58();
        }
        int var21 = method464(6) + 1;
        field985 = new class83[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field985[var22] = new class83();
        }
        int var23 = method464(6) + 1;
        field1006 = new class205[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field1006[var24] = new class205();
        }
        int var25 = method464(6) + 1;
        field988 = new boolean[var25];
        field984 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field988[var26] = method466() != 0;
            method464(16);
            method464(16);
            field984[var26] = method464(8);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V", line = 243)
    public static void method460() {
        field995 = null;
        field999 = null;
        field1008 = null;
        field985 = null;
        field1006 = null;
        field988 = null;
        field984 = null;
        field1005 = null;
        field983 = null;
        field989 = null;
        field1002 = null;
        field1010 = null;
        field1001 = null;
        field1000 = null;
        field982 = null;
        field991 = null;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)[F", line = 262)
    private final float[] method461(int arg0) {
        method456(this.field993[arg0], 0);
        method466();
        int var2 = method464(class276.method1877(field984.length - 1, (byte) -62));
        boolean var3 = field988[var2];
        int var4 = var3 ? field986 : field1009;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method466() != 0;
            var6 = method466() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1009 >> 2);
            var9 = (field1009 >> 2) + (var4 >> 2);
            var10 = field1009 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1009 >> 2);
            var12 = (field1009 >> 2) + (var4 - (var4 >> 2));
            var13 = field1009 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class205 var14 = field1006[field984[var2]];
        int var15 = var14.field3272;
        int var16 = var14.field3274[var15];
        boolean var17 = !field1008[var16].method437();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3275; var19++) {
            class83 var20 = field985[var14.field3273[var19]];
            float[] var21 = field1005;
            var20.method561(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3272;
            int var23 = var14.field3274[var22];
            field1008[var23].method438(field1005, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field1005[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field1005;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field1010 : field983;
            float[] var32 = var3 ? field1001 : field989;
            float[] var33 = var3 ? field1000 : field1002;
            int[] var34 = var3 ? field991 : field982;
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
            int var47 = class276.method1877(var4 - 1, (byte) -62);
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
                field1005[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1005[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field981 > 0) {
            int var91 = this.field981 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field998) {
                for (int var92 = 0; var92 < this.field987; var92++) {
                    int var93 = (this.field981 >> 1) + var92;
                    var90[var92] += this.field1003[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field1005[var94];
                }
            }
        }
        float[] var96 = this.field1003;
        this.field1003 = field1005;
        field1005 = var96;
        this.field981 = var4;
        this.field987 = var12 - (var4 >> 1);
        this.field998 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "([B)V", line = 683)
    private final void method462(byte[] arg0) {
        class221 var2 = new class221(arg0);
        this.field997 = var2.method1517((byte) -113);
        this.field992 = var2.method1517((byte) -110);
        this.field980 = var2.method1517((byte) -118);
        this.field990 = var2.method1517((byte) -117);
        if (this.field990 < 0) {
            this.field990 = ~this.field990;
            this.field1007 = true;
        }
        int var3 = var2.method1517((byte) -118);
        this.field993 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1509(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1537(var5, 0, var7, 2);
            this.field993[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)F", line = 727)
    public static final float method463(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)I", line = 739)
    public static final int method464(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1004) {
            int var3 = 8 - field1004;
            int var4 = (0x1 << var3) - 1;
            var1 += (field995[field996] >> field1004 & var4) << var2;
            field1004 = 0;
            field996++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field995[field996] >> field1004 & var5) << var2;
            field1004 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lni;II)Lld;", line = 768)
    public static final class64 method465(class202 arg0, int arg1, int arg2) {
        if (method458(arg0)) {
            byte[] var3 = arg0.method1342(-87, arg1, arg2);
            return var3 == null ? null : new class64(var3);
        } else {
            arg0.method1331((byte) -124, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()I", line = 789)
    public static final int method466() {
        int var0 = field995[field996] >> field1004 & 0x1;
        field1004++;
        field996 += field1004 >> 3;
        field1004 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([B)V", line = 803)
    private class64(byte[] arg0) {
        this.method462(arg0);
    }
}
