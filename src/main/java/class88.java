import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 extends class20 {

    @OriginalMember(owner = "client!me", name = "G", descriptor = "Z")
    private static boolean field1998 = false;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    private int field1993;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    private int field1994;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    private int field1996;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    private static int field2002;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    private static int field2006;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    private static int field2012;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    private int field2013;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    private int field2015;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    private static int field2016;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
    private int field2018;

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
    private int field2023;

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
    private int field2025;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "Z")
    private boolean field2007;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "Z")
    private boolean field2010;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "[B")
    private static byte[] field1995;

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "[B")
    private byte[] field2026;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "[F")
    private static float[] field1997;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "[F")
    private static float[] field2001;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "[F")
    private static float[] field2004;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "[F")
    private static float[] field2008;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "[F")
    private static float[] field2019;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "[F")
    private static float[] field2020;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "[F")
    private float[] field2021;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "[F")
    private static float[] field2022;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "[I")
    private static int[] field2005;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "[I")
    private static int[] field2014;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "[I")
    private static int[] field2024;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "[Lec;")
    private static class32[] field2009;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "[Lab;")
    public static class3[] field2000;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "[Lge;")
    private static class47[] field2011;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "[Lna;")
    private static class91[] field1999;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "[Z")
    private static boolean[] field2003;

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "[[B")
    private byte[][] field2017;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([I)Lu;")
    public final class139 method684(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2026 == null) {
            this.field2013 = 0;
            this.field2021 = new float[field2012];
            this.field2026 = new byte[this.field1994];
            this.field2025 = 0;
            this.field2023 = 0;
        }
        while (this.field2023 < this.field2017.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method694(this.field2023);
            if (var3 != null) {
                int var4 = this.field2025;
                int var5 = var3.length;
                if (var5 > this.field1994 - var4) {
                    var5 = this.field1994 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2026[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2025;
                }
                this.field2025 = var4;
            }
            this.field2023++;
        }
        this.field2021 = null;
        byte[] var2 = this.field2026;
        this.field2026 = null;
        return new class139(this.field2015, var2, this.field2018, this.field1993, this.field2010);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([B)V")
    private static final void method685(byte[] arg0) {
        method686(arg0, 0);
        field2016 = 0x1 << method690(4);
        field2012 = 0x1 << method690(4);
        field2020 = new float[field2012];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2016 : field2012;
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
            int var25 = class21.method179(var17 - 1, (byte) 5);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class142.method1160(var26, var25, (byte) 58);
            }
            if (var1 == 0) {
                field2004 = var18;
                field2022 = var20;
                field1997 = var22;
                field2014 = var24;
            } else {
                field2001 = var18;
                field2019 = var20;
                field2008 = var22;
                field2024 = var24;
            }
        }
        int var2 = method690(8) + 1;
        field2000 = new class3[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2000[var3] = new class3();
        }
        int var4 = method690(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method690(16);
        }
        int var6 = method690(6) + 1;
        field1999 = new class91[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1999[var7] = new class91();
        }
        int var8 = method690(6) + 1;
        field2011 = new class47[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2011[var9] = new class47();
        }
        int var10 = method690(6) + 1;
        field2009 = new class32[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2009[var11] = new class32();
        }
        int var12 = method690(6) + 1;
        field2003 = new boolean[var12];
        field2005 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2003[var13] = method687() != 0;
            method690(16);
            method690(16);
            field2005[var13] = method690(8);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)V")
    private static final void method686(byte[] arg0, int arg1) {
        field1995 = arg0;
        field2002 = arg1;
        field2006 = 0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()I")
    public static final int method687() {
        int var0 = field1995[field2002] >> field2006 & 0x1;
        field2006++;
        field2002 += field2006 >> 3;
        field2006 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "([B)V")
    private final void method688(byte[] arg0) {
        class86 var2 = new class86(arg0);
        this.field2015 = var2.method666(1183700424);
        this.field1994 = var2.method666(1183700424);
        this.field2018 = var2.method666(1183700424);
        this.field1993 = var2.method666(1183700424);
        if (this.field1993 < 0) {
            this.field1993 = ~this.field1993;
            this.field2010 = true;
        }
        int var3 = var2.method666(1183700424);
        this.field2017 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method646(-15447);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method642((byte) -35, 0, var5, var7);
            this.field2017[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()V")
    public static void method689() {
        field1995 = null;
        field2000 = null;
        field1999 = null;
        field2011 = null;
        field2009 = null;
        field2003 = null;
        field2005 = null;
        field2020 = null;
        field2004 = null;
        field2022 = null;
        field1997 = null;
        field2001 = null;
        field2019 = null;
        field2008 = null;
        field2014 = null;
        field2024 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
    public static final int method690(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2006) {
            int var4 = 8 - field2006;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1995[field2002] >> field2006 & var5) << var2;
            field2006 = 0;
            field2002++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1995[field2002] >> field2006 & var3) << var2;
            field2006 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lsf;II)Lme;")
    public static final class88 method691(class131 arg0, int arg1, int arg2) {
        if (method692(arg0)) {
            byte[] var3 = arg0.method1023(arg2, arg1, (byte) -35);
            return var3 == null ? null : new class88(var3);
        } else {
            arg0.method1034(arg1, arg2, -1);
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lsf;)Z")
    private static final boolean method692(class131 arg0) {
        if (!field1998) {
            byte[] var1 = arg0.method1023(0, 0, (byte) -35);
            if (var1 == null) {
                return false;
            }
            method685(var1);
            field1998 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)F")
    public static final float method693(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)[F")
    private final float[] method694(int arg0) {
        method686(this.field2017[arg0], 0);
        method687();
        int var2 = method690(class21.method179(field2005.length - 1, (byte) 99));
        boolean var3 = field2003[var2];
        int var4 = var3 ? field2012 : field2016;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method687() != 0;
            var6 = method687() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2016 >> 2);
            var9 = (field2016 >> 2) + (var4 >> 2);
            var10 = field2016 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2016 >> 2);
            var12 = (field2016 >> 2) + (var4 - (var4 >> 2));
            var13 = field2016 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class32 var14 = field2009[field2005[var2]];
        int var15 = var14.field618;
        int var16 = var14.field616[var15];
        boolean var17 = !field1999[var16].method706();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field617; var19++) {
            class47 var95 = field2011[var14.field619[var19]];
            float[] var96 = field2020;
            var95.method343(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field618;
            int var21 = var14.field616[var20];
            field1999[var21].method712(field2020, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2020[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2020;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2001 : field2004;
            float[] var30 = var3 ? field2019 : field2022;
            float[] var31 = var3 ? field2008 : field1997;
            int[] var32 = var3 ? field2024 : field2014;
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
            int var35 = class21.method179(var4 - 1, (byte) 78);
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
                field2020[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2020[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2013 > 0) {
            int var49 = this.field2013 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2007) {
                for (int var50 = 0; var50 < this.field1996; var50++) {
                    int var51 = (this.field2013 >> 1) + var50;
                    var48[var50] += this.field2021[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2020[var52];
                }
            }
        }
        float[] var54 = this.field2021;
        this.field2021 = field2020;
        field2020 = var54;
        this.field2013 = var4;
        this.field1996 = var12 - (var4 >> 1);
        this.field2007 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
    private class88(byte[] arg0) {
        this.method688(arg0);
    }
}
