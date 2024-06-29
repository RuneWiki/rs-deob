import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class137 extends class381 {

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "Z")
    private static boolean field1981 = false;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
    private int field1984;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
    private static int field1986;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    private int field1988;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
    private static int field1990;

    @OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
    private int field1997;

    @OriginalMember(owner = "client!pda", name = "C", descriptor = "I")
    private static int field1999;

    @OriginalMember(owner = "client!pda", name = "D", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!pda", name = "H", descriptor = "I")
    private static int field2003;

    @OriginalMember(owner = "client!pda", name = "J", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!pda", name = "L", descriptor = "I")
    private int field2007;

    @OriginalMember(owner = "client!pda", name = "M", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!pda", name = "Q", descriptor = "I")
    private int field2011;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "Z")
    private boolean field1989;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "Z")
    private boolean field1993;

    @OriginalMember(owner = "client!pda", name = "O", descriptor = "[B")
    private static byte[] field2009;

    @OriginalMember(owner = "client!pda", name = "P", descriptor = "[B")
    private byte[] field2010;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "[F")
    private static float[] field1978;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "[F")
    private static float[] field1979;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "[F")
    private static float[] field1982;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "[F")
    private static float[] field1985;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "[F")
    private static float[] field1991;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "[F")
    private float[] field1992;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "[F")
    private static float[] field1994;

    @OriginalMember(owner = "client!pda", name = "I", descriptor = "[F")
    private static float[] field2004;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "[I")
    private static int[] field1983;

    @OriginalMember(owner = "client!pda", name = "B", descriptor = "[I")
    private static int[] field1998;

    @OriginalMember(owner = "client!pda", name = "K", descriptor = "[I")
    private static int[] field2006;

    @OriginalMember(owner = "client!pda", name = "G", descriptor = "[Lov;")
    private static class26[] field2002;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "[Lpn;")
    public static class294[] field1980;

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "[Lus;")
    private static class307[] field1987;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "[Lbea;")
    private static class31[] field1996;

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "[Z")
    private static boolean[] field1995;

    @OriginalMember(owner = "client!pda", name = "E", descriptor = "[[B")
    private byte[][] field2001;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)F", line = 8)
    public static final float method964(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([BI)V", line = 23)
    private static final void method965(byte[] arg0, int arg1) {
        field2009 = arg0;
        field1986 = arg1;
        field1999 = 0;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([B)V", line = 33)
    private static final void method966(byte[] arg0) {
        method965(arg0, 0);
        field1990 = 0x1 << method972(4);
        field2003 = 0x1 << method972(4);
        field1979 = new float[field2003];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1990 : field2003;
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
            int var25 = class341.method2115(27279, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class116.method860(0, var25, var26);
            }
            if (var1 == 0) {
                field1994 = var18;
                field1985 = var20;
                field2004 = var22;
                field1983 = var24;
            } else {
                field1978 = var18;
                field1982 = var20;
                field1991 = var22;
                field1998 = var24;
            }
        }
        int var2 = method972(8) + 1;
        field1980 = new class294[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1980[var3] = new class294();
        }
        int var4 = method972(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method972(16);
        }
        int var6 = method972(6) + 1;
        field1996 = new class31[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1996[var7] = new class31();
        }
        int var8 = method972(6) + 1;
        field2002 = new class26[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2002[var9] = new class26();
        }
        int var10 = method972(6) + 1;
        field1987 = new class307[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1987[var11] = new class307();
        }
        int var12 = method972(6) + 1;
        field1995 = new boolean[var12];
        field2006 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1995[var13] = method967() != 0;
            method972(16);
            method972(16);
            field2006[var13] = method972(8);
        }
        field1981 = true;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "()I", line = 186)
    public static final int method967() {
        int var0 = field2009[field1986] >> field1999 & 0x1;
        field1999++;
        field1986 += field1999 >> 3;
        field1999 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "([B)V", line = 194)
    private final void method968(byte[] arg0) {
        class540 var2 = new class540(arg0);
        this.field1988 = var2.method3160(false);
        this.field2007 = var2.method3160(false);
        this.field2000 = var2.method3160(false);
        this.field1984 = var2.method3160(false);
        if (this.field1984 < 0) {
            this.field1984 = ~this.field1984;
            this.field1993 = true;
        }
        int var3 = var2.method3160(false);
        this.field2001 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3115(29871);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3155(var5, 0, var7, 0);
            this.field2001[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "()V", line = 236)
    public static void method969() {
        field2009 = null;
        field1980 = null;
        field1996 = null;
        field2002 = null;
        field1987 = null;
        field1995 = null;
        field2006 = null;
        field1979 = null;
        field1994 = null;
        field1985 = null;
        field2004 = null;
        field1978 = null;
        field1982 = null;
        field1991 = null;
        field1983 = null;
        field1998 = null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lmv;II)Lpda;", line = 255)
    public static final class137 method970(class295 arg0, int arg1, int arg2) {
        if (method971(arg0)) {
            byte[] var3 = arg0.method1844(arg1, 31330, arg2);
            return var3 == null ? null : new class137(var3);
        } else {
            arg0.method1843((byte) 117, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lmv;)Z", line = 269)
    private static final boolean method971(class295 arg0) {
        if (!field1981) {
            byte[] var1 = arg0.method1844(0, 31330, 0);
            if (var1 == null) {
                return false;
            }
            method966(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)I", line = 286)
    public static final int method972(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1999) {
            int var4 = 8 - field1999;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2009[field1986] >> field1999 & var5) << var2;
            field1999 = 0;
            field1986++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2009[field1986] >> field1999 & var3) << var2;
            field1999 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)[F", line = 318)
    private final float[] method973(int arg0) {
        method965(this.field2001[arg0], 0);
        method967();
        int var2 = method972(class341.method2115(27279, field2006.length - 1));
        boolean var3 = field1995[var2];
        int var4 = var3 ? field2003 : field1990;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method967() != 0;
            var6 = method967() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1990 >> 2);
            var9 = (field1990 >> 2) + (var4 >> 2);
            var10 = field1990 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1990 >> 2);
            var12 = (field1990 >> 2) + (var4 - (var4 >> 2));
            var13 = field1990 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class307 var14 = field1987[field2006[var2]];
        int var15 = var14.field4538;
        int var16 = var14.field4537[var15];
        boolean var17 = !field1996[var16].method193();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4539; var19++) {
            class26 var95 = field2002[var14.field4536[var19]];
            float[] var96 = field1979;
            var95.method171(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4538;
            int var21 = var14.field4537[var20];
            field1996[var21].method192(field1979, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1979[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1979;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1978 : field1994;
            float[] var30 = var3 ? field1982 : field1985;
            float[] var31 = var3 ? field1991 : field2004;
            int[] var32 = var3 ? field1998 : field1983;
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
            int var35 = class341.method2115(27279, var4 - 1);
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
                field1979[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1979[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2005 > 0) {
            int var49 = this.field2005 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1989) {
                for (int var50 = 0; var50 < this.field1997; var50++) {
                    int var51 = (this.field2005 >> 1) + var50;
                    var48[var50] += this.field1992[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1979[var52];
                }
            }
        }
        float[] var54 = this.field1992;
        this.field1992 = field1979;
        field1979 = var54;
        this.field2005 = var4;
        this.field1997 = var12 - (var4 >> 1);
        this.field1989 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([I)Lwm;", line = 732)
    public final class396 method974(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2010 == null) {
            this.field2005 = 0;
            this.field1992 = new float[field2003];
            this.field2010 = new byte[this.field2007];
            this.field2011 = 0;
            this.field2008 = 0;
        }
        while (this.field2008 < this.field2001.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method973(this.field2008);
            if (var3 != null) {
                int var4 = this.field2011;
                int var5 = var3.length;
                if (var5 > this.field2007 - var4) {
                    var5 = this.field2007 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2010[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2011;
                }
                this.field2011 = var4;
            }
            this.field2008++;
        }
        this.field1992 = null;
        byte[] var2 = this.field2010;
        this.field2010 = null;
        return new class396(this.field1988, var2, this.field2000, this.field1984, this.field1993);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lmv;I)Lpda;", line = 792)
    public static final class137 method975(class295 arg0, int arg1) {
        if (method971(arg0)) {
            byte[] var2 = arg0.method1830(false, arg1);
            return var2 == null ? null : new class137(var2);
        } else {
            arg0.method1818(arg1, 4);
            return null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "([B)V", line = 816)
    private class137(byte[] arg0) {
        this.method968(arg0);
    }
}
