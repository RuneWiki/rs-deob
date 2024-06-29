import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class114 extends class222 {

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "Z")
    private static boolean field1960 = false;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    private int field1937;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    private static int field1939;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    private int field1942;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    private int field1943;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    private int field1949;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    private int field1953;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    private static int field1955;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    private static int field1959;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    private int field1962;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    private static int field1965;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    private int field1968;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    private int field1969;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Z")
    private boolean field1945;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Z")
    private boolean field1951;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "[B")
    private static byte[] field1961;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "[B")
    private byte[] field1967;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "[F")
    private static float[] field1938;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[F")
    private static float[] field1940;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[F")
    private static float[] field1947;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[F")
    private static float[] field1948;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "[F")
    private static float[] field1950;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "[F")
    private static float[] field1957;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "[F")
    private static float[] field1963;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "[F")
    private float[] field1966;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "[I")
    private static int[] field1952;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "[I")
    private static int[] field1954;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "[I")
    private static int[] field1958;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "[Lfd;")
    private static class122[] field1956;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[Lnj;")
    private static class142[] field1944;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[Lqh;")
    private static class201[] field1964;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[Lud;")
    public static class2[] field1946;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[Z")
    private static boolean[] field1936;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[[B")
    private byte[][] field1941;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhg;II)Lua;")
    public static final class114 method813(class177 arg0, int arg1, int arg2) {
        if (method821(arg0)) {
            byte[] var3 = arg0.method1271(arg1, -2154, arg2);
            return var3 == null ? null : new class114(var3);
        } else {
            arg0.method1287(arg2, arg1, (byte) -65);
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()I")
    public static final int method814() {
        int var0 = field1961[field1959] >> field1939 & 0x1;
        field1939++;
        field1959 += field1939 >> 3;
        field1939 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)F")
    public static final float method815(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([I)Lcl;")
    public final class194 method816(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1967 == null) {
            this.field1943 = 0;
            this.field1966 = new float[field1965];
            this.field1967 = new byte[this.field1937];
            this.field1969 = 0;
            this.field1968 = 0;
        }
        while (this.field1968 < this.field1941.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method822(this.field1968);
            if (var3 != null) {
                int var4 = this.field1969;
                int var5 = var3.length;
                if (var5 > this.field1937 - var4) {
                    var5 = this.field1937 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1967[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1969;
                }
                this.field1969 = var4;
            }
            this.field1968++;
        }
        this.field1966 = null;
        byte[] var2 = this.field1967;
        this.field1967 = null;
        return new class194(this.field1962, var2, this.field1953, this.field1942, this.field1945);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([B)V")
    private final void method817(byte[] arg0) {
        class280 var2 = new class280(arg0);
        this.field1962 = var2.method1872(91);
        this.field1937 = var2.method1872(127);
        this.field1953 = var2.method1872(127);
        this.field1942 = var2.method1872(111);
        if (this.field1942 < 0) {
            this.field1942 = ~this.field1942;
            this.field1945 = true;
        }
        int var3 = var2.method1872(127);
        this.field1941 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1907(16832);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1928(var5, var7, -16777216, 0);
            this.field1941[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
    public static void method818() {
        field1961 = null;
        field1946 = null;
        field1944 = null;
        field1956 = null;
        field1964 = null;
        field1936 = null;
        field1958 = null;
        field1948 = null;
        field1947 = null;
        field1963 = null;
        field1950 = null;
        field1940 = null;
        field1938 = null;
        field1957 = null;
        field1952 = null;
        field1954 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([BI)V")
    private static final void method819(byte[] arg0, int arg1) {
        field1961 = arg0;
        field1959 = arg1;
        field1939 = 0;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "([B)V")
    private static final void method820(byte[] arg0) {
        method819(arg0, 0);
        field1955 = 0x1 << method823(4);
        field1965 = 0x1 << method823(4);
        field1948 = new float[field1965];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1955 : field1965;
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
            int var25 = class94.method689(var17 - 1, 128);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class87.method594(var25, true, var26);
            }
            if (var1 == 0) {
                field1947 = var18;
                field1963 = var20;
                field1950 = var22;
                field1952 = var24;
            } else {
                field1940 = var18;
                field1938 = var20;
                field1957 = var22;
                field1954 = var24;
            }
        }
        int var2 = method823(8) + 1;
        field1946 = new class2[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1946[var3] = new class2();
        }
        int var4 = method823(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method823(16);
        }
        int var6 = method823(6) + 1;
        field1944 = new class142[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1944[var7] = new class142();
        }
        int var8 = method823(6) + 1;
        field1956 = new class122[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1956[var9] = new class122();
        }
        int var10 = method823(6) + 1;
        field1964 = new class201[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1964[var11] = new class201();
        }
        int var12 = method823(6) + 1;
        field1936 = new boolean[var12];
        field1958 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1936[var13] = method814() != 0;
            method823(16);
            method823(16);
            field1958[var13] = method823(8);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhg;)Z")
    private static final boolean method821(class177 arg0) {
        if (!field1960) {
            byte[] var1 = arg0.method1271(0, -2154, 0);
            if (var1 == null) {
                return false;
            }
            method820(var1);
            field1960 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)[F")
    private final float[] method822(int arg0) {
        method819(this.field1941[arg0], 0);
        method814();
        int var2 = method823(class94.method689(field1958.length - 1, 128));
        boolean var3 = field1936[var2];
        int var4 = var3 ? field1965 : field1955;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method814() != 0;
            var6 = method814() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1955 >> 2);
            var9 = (field1955 >> 2) + (var4 >> 2);
            var10 = field1955 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1955 >> 2);
            var12 = (field1955 >> 2) + (var4 - (var4 >> 2));
            var13 = field1955 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class201 var14 = field1964[field1958[var2]];
        int var15 = var14.field3649;
        int var16 = var14.field3647[var15];
        boolean var17 = !field1944[var16].method1033();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3650; var19++) {
            class122 var95 = field1956[var14.field3648[var19]];
            float[] var96 = field1948;
            var95.method903(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3649;
            int var21 = var14.field3647[var20];
            field1944[var21].method1031(field1948, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1948[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1948;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1940 : field1947;
            float[] var30 = var3 ? field1938 : field1963;
            float[] var31 = var3 ? field1957 : field1950;
            int[] var32 = var3 ? field1954 : field1952;
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
            int var35 = class94.method689(var4 - 1, 128);
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
                field1948[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1948[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1943 > 0) {
            int var49 = this.field1943 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1951) {
                for (int var50 = 0; var50 < this.field1949; var50++) {
                    int var51 = (this.field1943 >> 1) + var50;
                    var48[var50] += this.field1966[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1948[var52];
                }
            }
        }
        float[] var54 = this.field1966;
        this.field1966 = field1948;
        field1948 = var54;
        this.field1943 = var4;
        this.field1949 = var12 - (var4 >> 1);
        this.field1951 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I")
    public static final int method823(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1939) {
            int var4 = 8 - field1939;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1961[field1959] >> field1939 & var5) << var2;
            field1939 = 0;
            field1959++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1961[field1959] >> field1939 & var3) << var2;
            field1939 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V")
    private class114(byte[] arg0) {
        this.method817(arg0);
    }
}
