import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class129 extends class282 {

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
    private int field2014 = 0;

    @OriginalMember(owner = "client!vo", name = "lb", descriptor = "I")
    private int field2052 = 0;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "Z")
    private boolean field2031 = false;

    @OriginalMember(owner = "client!vo", name = "qb", descriptor = "I")
    private int field2057 = 0;

    @OriginalMember(owner = "client!vo", name = "vc", descriptor = "I")
    private int field2114 = 0;

    @OriginalMember(owner = "client!vo", name = "hc", descriptor = "Z")
    private boolean field2100 = false;

    @OriginalMember(owner = "client!vo", name = "bb", descriptor = "I")
    private int field2042 = 0;

    @OriginalMember(owner = "client!vo", name = "dc", descriptor = "Z")
    private boolean field2096 = false;

    @OriginalMember(owner = "client!vo", name = "Jb", descriptor = "Z")
    private boolean field2076 = true;

    @OriginalMember(owner = "client!vo", name = "Z", descriptor = "Lrs;")
    private class166 field2040;

    @OriginalMember(owner = "client!vo", name = "fb", descriptor = "Lak;")
    private class497 field2046;

    @OriginalMember(owner = "client!vo", name = "Tb", descriptor = "Lak;")
    private class497 field2086;

    @OriginalMember(owner = "client!vo", name = "jc", descriptor = "Lak;")
    private class497 field2102;

    @OriginalMember(owner = "client!vo", name = "wb", descriptor = "Lak;")
    private class497 field2063;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "Lig;")
    private class674 field2000;

    @OriginalMember(owner = "client!vo", name = "Cb", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!vo", name = "Bc", descriptor = "I")
    private int field2120;

    @OriginalMember(owner = "client!vo", name = "Dc", descriptor = "[I")
    private int[] field2122;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "[I")
    private int[] field2026;

    @OriginalMember(owner = "client!vo", name = "Db", descriptor = "[I")
    private int[] field2070;

    @OriginalMember(owner = "client!vo", name = "Bb", descriptor = "[I")
    private int[] field2068;

    @OriginalMember(owner = "client!vo", name = "Pb", descriptor = "[S")
    private short[] field2082;

    @OriginalMember(owner = "client!vo", name = "gc", descriptor = "[Lou;")
    private class157[] field2099;

    @OriginalMember(owner = "client!vo", name = "rb", descriptor = "[Lsn;")
    private class158[] field2058;

    @OriginalMember(owner = "client!vo", name = "Nb", descriptor = "I")
    private int field2080;

    @OriginalMember(owner = "client!vo", name = "tc", descriptor = "[Lnca;")
    private class628[] field2112;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "[Lnv;")
    private class683[] field2020;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "[S")
    private short[] field2012;

    @OriginalMember(owner = "client!vo", name = "ab", descriptor = "[B")
    private byte[] field2041;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "[S")
    private short[] field2005;

    @OriginalMember(owner = "client!vo", name = "Xb", descriptor = "S")
    private short field2090;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "[S")
    private short[] field2010;

    @OriginalMember(owner = "client!vo", name = "Wb", descriptor = "[B")
    private byte[] field2089;

    @OriginalMember(owner = "client!vo", name = "W", descriptor = "[S")
    private short[] field2037;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "[F")
    private float[] field2017;

    @OriginalMember(owner = "client!vo", name = "cb", descriptor = "[S")
    private short[] field2043;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "S")
    private short field2025;

    @OriginalMember(owner = "client!vo", name = "qc", descriptor = "[S")
    private short[] field2109;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "[F")
    private float[] field2002;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "[S")
    private short[] field2022;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "[S")
    private short[] field2008;

    @OriginalMember(owner = "client!vo", name = "rc", descriptor = "[S")
    private short[] field2110;

    @OriginalMember(owner = "client!vo", name = "uc", descriptor = "[S")
    private short[] field2113;

    @OriginalMember(owner = "client!vo", name = "T", descriptor = "[I")
    private int[] field2034;

    @OriginalMember(owner = "client!vo", name = "Y", descriptor = "[[I")
    private int[][] field2039;

    @OriginalMember(owner = "client!vo", name = "jb", descriptor = "[[I")
    private int[][] field2050;

    @OriginalMember(owner = "client!vo", name = "nb", descriptor = "[[I")
    private int[][] field2054;

    @OriginalMember(owner = "client!vo", name = "Qb", descriptor = "Leh;")
    public static class256 field2083 = class702.method3900(-129);

    @OriginalMember(owner = "client!vo", name = "ic", descriptor = "[Llk;")
    public static class249[] field2101 = new class249[14];

    @OriginalMember(owner = "client!vo", name = "bc", descriptor = "Lew;")
    public static class685 field2094 = new class685("", 11);

    @OriginalMember(owner = "client!vo", name = "xc", descriptor = "[I")
    public static int[] field2116 = new int[2];

    @OriginalMember(owner = "client!vo", name = "zc", descriptor = "I")
    public static int field2118 = 0;

    @OriginalMember(owner = "client!vo", name = "pc", descriptor = "B")
    private byte field2108;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!vo", name = "U", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!vo", name = "db", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!vo", name = "eb", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!vo", name = "gb", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!vo", name = "hb", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!vo", name = "ib", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!vo", name = "kb", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!vo", name = "mb", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!vo", name = "ob", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!vo", name = "pb", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!vo", name = "sb", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!vo", name = "tb", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!vo", name = "ub", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!vo", name = "vb", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!vo", name = "xb", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!vo", name = "yb", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!vo", name = "zb", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!vo", name = "Ab", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!vo", name = "Eb", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!vo", name = "Fb", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!vo", name = "Gb", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!vo", name = "Hb", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!vo", name = "Ib", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!vo", name = "Kb", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!vo", name = "Lb", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!vo", name = "Mb", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!vo", name = "Ob", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!vo", name = "Rb", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!vo", name = "Sb", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!vo", name = "Ub", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!vo", name = "ac", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!vo", name = "cc", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!vo", name = "ec", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!vo", name = "fc", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!vo", name = "kc", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!vo", name = "lc", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!vo", name = "mc", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!vo", name = "nc", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!vo", name = "oc", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!vo", name = "yc", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!vo", name = "Cc", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!vo", name = "sc", descriptor = "Ljs;")
    private class170 field2111;

    @OriginalMember(owner = "client!vo", name = "Yb", descriptor = "Lsf;")
    private class525 field2091;

    @OriginalMember(owner = "client!vo", name = "wc", descriptor = "Lsda;")
    private class749 field2115;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "S")
    private short field2016;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "S")
    private short field2027;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "S")
    private short field2029;

    @OriginalMember(owner = "client!vo", name = "V", descriptor = "S")
    private short field2036;

    @OriginalMember(owner = "client!vo", name = "X", descriptor = "S")
    private short field2038;

    @OriginalMember(owner = "client!vo", name = "Vb", descriptor = "S")
    private short field2088;

    @OriginalMember(owner = "client!vo", name = "Zb", descriptor = "S")
    private short field2092;

    @OriginalMember(owner = "client!vo", name = "Ac", descriptor = "S")
    private short field2119;

    @OriginalMember(owner = "client!vo", name = "HA", descriptor = "()I", line = 3)
    public final int method996() {
        field2105++;
        if (!this.field2096) {
            this.method1055(-119);
        }
        return this.field2036;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII)V", line = 17)
    public final void method997(int arg0, int arg1, int arg2, int arg3) {
        field2004++;
        for (int var5 = 0; var5 < this.field2052; var5++) {
            int var9 = this.field2113[var5] & 0xFFFF;
            int var10 = (var9 & 0xFFCF) >> 10;
            int var11 = var9 >> 7 & 0x7;
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field2113[var5] = (short) class112.method903(class112.method903(var10 << 10, var11 << 7), var12);
        }
        if (this.field2020 != null) {
            for (int var6 = 0; var6 < this.field2080; var6++) {
                class683 var7 = this.field2020[var6];
                class628 var8 = this.field2112[var6];
                var8.field8809 = var8.field8809 & 0xFF000000 | class510.field7397[this.field2113[var7.field9667] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field2063 != null) {
            this.field2063.field7210 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "(III)V", line = 88)
    public final void method998(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2042; var4++) {
            if (arg0 != 128) {
                this.field2026[var4] = this.field2026[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field2068[var4] = this.field2068[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field2070[var4] = this.field2070[var4] * arg2 >> 7;
            }
        }
        field1999++;
        this.field2096 = false;
        if (this.field2046 != null) {
            this.field2046.field7210 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "na", descriptor = "()I", line = 119)
    public final int method999() {
        field2055++;
        if (!this.field2096) {
            this.method1055(44);
        }
        return this.field2092;
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "()V", line = 130)
    public final void method1000() {
        field2035++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILtc;IZIII)Z", line = 138)
    private final boolean method1001(int arg0, class73 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2064++;
        class174 var8 = (class174) arg1;
        int var9 = 52 / ((-arg6 - 3) / 51);
        class174 var10 = this.field2040.field2786;
        float var11 = var8.field2978 * var10.field2964 + var8.field2992 * var10.field2985 + var8.field2982 * var10.field2969 + var10.field2982;
        float var12 = var8.field2978 * var10.field2995 + var8.field2992 * var10.field2976 + var8.field2982 * var10.field2994 + var10.field2992;
        class544.field7777 = var8.field2988 * var10.field2995 + var8.field2994 * var10.field2976 + var8.field2969 * var10.field2994;
        class413.field6088 = var8.field2991 * var10.field2964 + var8.field2985 * var10.field2969 + var8.field2976 * var10.field2985;
        class624.field8746 = var8.field2988 * var10.field2965 + var8.field2994 * var10.field2991 + var8.field2969 * var10.field2988;
        class734.field10339 = var8.field2965 * var10.field2995 + var8.field2995 * var10.field2976 + var8.field2964 * var10.field2994;
        class193.field3345 = var8.field2991 * var10.field2995 + var8.field2985 * var10.field2994 + var8.field2976 * var10.field2976;
        class25.field257 = var8.field2991 * var10.field2965 + var8.field2985 * var10.field2988 + var8.field2976 * var10.field2991;
        float var13 = var8.field2978 * var10.field2965 + var8.field2992 * var10.field2991 + var8.field2982 * var10.field2988 + var10.field2978;
        class79.field1159 = var8.field2965 * var10.field2964 + var8.field2995 * var10.field2985 + var8.field2964 * var10.field2969;
        class266.field4130 = var8.field2965 * var10.field2965 + var8.field2995 * var10.field2991 + var8.field2964 * var10.field2988;
        class569.field8083 = var8.field2988 * var10.field2964 + var8.field2994 * var10.field2985 + var8.field2969 * var10.field2969;
        boolean var14 = false;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        float var17 = Float.MAX_VALUE;
        float var18 = -3.4028235E38F;
        int var19 = this.field2040.field2873;
        int var20 = this.field2040.field2832;
        if (!this.field2096) {
            this.method1055(-108);
        }
        int var21 = this.field2038 - this.field2088 >> 1;
        int var22 = this.field2027 - this.field2119 >> 1;
        int var23 = this.field2029 - this.field2036 >> 1;
        int var24 = this.field2088 + var21;
        int var25 = this.field2119 + var22;
        int var26 = this.field2036 + var23;
        int var27 = var24 - (var21 << arg5);
        int var28 = var25 - (var22 << arg5);
        int var29 = var26 - (var23 << arg5);
        int var30 = var24 + (var21 << arg5);
        int var31 = (var22 << arg5) + var25;
        int var32 = (var23 << arg5) + var26;
        class110.field1713[0] = var27;
        class172.field2943[0] = var28;
        class110.field1713[1] = var30;
        class121.field1868[0] = var29;
        class172.field2943[1] = var28;
        class110.field1713[2] = var27;
        class121.field1868[1] = var29;
        class172.field2943[2] = var31;
        class110.field1713[3] = var30;
        class121.field1868[2] = var29;
        class172.field2943[3] = var31;
        class121.field1868[3] = var29;
        class110.field1713[4] = var27;
        class172.field2943[4] = var28;
        class121.field1868[4] = var32;
        class110.field1713[5] = var30;
        class172.field2943[5] = var28;
        class121.field1868[5] = var32;
        class110.field1713[6] = var27;
        class172.field2943[6] = var31;
        class121.field1868[6] = var32;
        class110.field1713[7] = var30;
        class172.field2943[7] = var31;
        class121.field1868[7] = var32;
        for (int var33 = 0; var33 < 8; var33++) {
            float var54 = (float) class121.field1868[var33];
            float var55 = (float) class172.field2943[var33];
            float var56 = (float) class110.field1713[var33];
            float var57 = class734.field10339 * var54 + class544.field7777 * var56 + class193.field3345 * var55 + var12;
            float var58 = class79.field1159 * var54 + class569.field8083 * var56 + class413.field6088 * var55 + var11;
            float var59 = class266.field4130 * var54 + class624.field8746 * var56 + class25.field257 * var55 + var13;
            if (var59 >= (float) this.field2040.field2819) {
                if (arg2 > 0) {
                    var59 = arg2;
                }
                float var60 = (float) var19 * var58 / var59 + (float) this.field2040.field2811;
                if (var60 > var16) {
                    var16 = var60;
                }
                if (var15 > var60) {
                    var15 = var60;
                }
                float var61 = (float) var20 * var57 / var59 + (float) this.field2040.field2830;
                if (var61 < var17) {
                    var17 = var61;
                }
                var14 = true;
                if (var18 < var61) {
                    var18 = var61;
                }
            }
        }
        if (var14 && var15 < (float) arg4 && (float) arg4 < var16 && (float) arg0 > var17 && (float) arg0 < var18) {
            if (arg3) {
                return true;
            }
            if (this.field2040.field2908.length < this.field2057) {
                this.field2040.field2904 = new int[this.field2057];
                this.field2040.field2908 = new int[this.field2057];
            }
            int[] var34 = this.field2040.field2908;
            int[] var35 = this.field2040.field2904;
            for (int var36 = 0; var36 < this.field2042; var36++) {
                float var38 = (float) this.field2026[var36];
                float var39 = (float) this.field2070[var36];
                float var40 = (float) this.field2068[var36];
                float var41 = class266.field4130 * var39 + class624.field8746 * var38 + class25.field257 * var40 + var13;
                float var42 = class79.field1159 * var39 + class569.field8083 * var38 + class413.field6088 * var40 + var11;
                float var43 = class734.field10339 * var39 + class544.field7777 * var38 + class193.field3345 * var40 + var12;
                if ((float) this.field2040.field2819 <= var41) {
                    if (arg2 > 0) {
                        var41 = arg2;
                    }
                    int var44 = (int) ((float) var19 * var42 / var41 + (float) this.field2040.field2811);
                    int var45 = (int) ((float) var20 * var43 / var41 + (float) this.field2040.field2830);
                    int var46 = this.field2122[var36];
                    int var47 = this.field2122[var36 + 1];
                    for (int var48 = var46; var48 < var47; var48++) {
                        int var49 = this.field2110[var48] - 1;
                        if (var49 == -1) {
                            break;
                        }
                        var34[var49] = var44;
                        var35[var49] = var45;
                    }
                } else {
                    int var50 = this.field2122[var36];
                    int var51 = this.field2122[var36 + 1];
                    for (int var52 = var50; var52 < var51; var52++) {
                        int var53 = this.field2110[var52] - 1;
                        if (var53 == -1) {
                            break;
                        }
                        var34[this.field2110[var52] - 1] = -999999;
                    }
                }
            }
            for (int var37 = 0; var37 < this.field2052; var37++) {
                if (var34[this.field2008[var37]] != -999999 && var34[this.field2012[var37]] != -999999 && var34[this.field2005[var37]] != -999999 && this.method1004(var35[this.field2008[var37]], var35[this.field2012[var37]], arg4, 118, var34[this.field2005[var37]], var34[this.field2012[var37]], var34[this.field2008[var37]], arg0, var35[this.field2005[var37]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "()V", line = 383)
    public final void method1002() {
        field2093++;
        if (this.field2057 <= 0 || this.field2114 <= 0) {
            return;
        }
        this.method1015(false, -103);
        if ((this.field2108 & 0x10) == 0 && this.field2000.field9532 == null) {
            this.method1058(false, (byte) 66);
        }
        this.method1012(-55);
    }

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "()I", line = 402)
    public final int method1003() {
        if (!this.field2096) {
            this.method1055(-94);
        }
        field2001++;
        return this.field2029;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIIII)Z", line = 417)
    private final boolean method1004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 <= 110) {
            this.method1029((short) 95, (short) -1);
        }
        field2018++;
        if (arg7 < arg0 && arg7 < arg1 && arg7 < arg8) {
            return false;
        } else if (arg7 > arg0 && arg7 > arg1 && arg7 > arg8) {
            return false;
        } else if (arg2 < arg6 && arg5 > arg2 && arg4 > arg2) {
            return false;
        } else {
            return arg6 >= arg2 || arg2 <= arg5 || arg2 <= arg4;
        }
    }

    @OriginalMember(owner = "client!vo", name = "EA", descriptor = "()I", line = 443)
    public final int method1005() {
        field2049++;
        if (!this.field2096) {
            this.method1055(56);
        }
        return this.field2027;
    }

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "(I)V", line = 454)
    public final void method1006(int arg0) {
        field2098++;
        if (this.field2063 != null) {
            this.field2063.field7210 = null;
        }
        this.field2025 = (short) arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ltc;Lqw;I)V", line = 469)
    public final void method1007(class73 arg0, class385 arg1, int arg2) {
        field2062++;
        if (this.field2057 == 0) {
            return;
        }
        class174 var4 = this.field2040.field2786;
        class174 var5 = (class174) arg0;
        if (!this.field2096) {
            this.method1055(-102);
        }
        class25.field257 = var4.field2965 * var5.field2991 + var4.field2991 * var5.field2976 + var4.field2988 * var5.field2985;
        class281.field4365 = var4.field2965 * var5.field2978 + var4.field2991 * var5.field2992 + var4.field2988 * var5.field2982 + var4.field2978;
        float var6 = (float) this.field2119 * class25.field257 + class281.field4365;
        float var7 = (float) this.field2027 * class25.field257 + class281.field4365;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field2092 + var6;
            var9 = (float) (-this.field2092) + var7;
        } else {
            var9 = var6 - (float) this.field2092;
            var8 = (float) this.field2092 + var7;
        }
        if ((this.field2040.field2813 <= var9) || ((float) this.field2040.field2819 >= var8)) {
            return;
        }
        class413.field6088 = var4.field2964 * var5.field2991 + var4.field2985 * var5.field2976 + var4.field2969 * var5.field2985;
        class207.field3467 = var4.field2964 * var5.field2978 + var4.field2985 * var5.field2992 + var4.field2969 * var5.field2982 + var4.field2982;
        float var10 = (float) this.field2119 * class413.field6088 + class207.field3467;
        float var11 = (float) this.field2027 * class413.field6088 + class207.field3467;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) (-this.field2092) + var11) * (float) this.field2040.field2873;
            var13 = ((float) this.field2092 + var10) * (float) this.field2040.field2873;
        } else {
            var12 = ((float) (-this.field2092) + var10) * (float) this.field2040.field2873;
            var13 = ((float) this.field2092 + var11) * (float) this.field2040.field2873;
        }
        if ((var12 / var8 >= this.field2040.field2838) || (var13 / var8 <= this.field2040.field2887)) {
            return;
        }
        class203.field3432 = var4.field2995 * var5.field2978 + var4.field2994 * var5.field2982 + var4.field2976 * var5.field2992 + var4.field2992;
        class193.field3345 = var4.field2995 * var5.field2991 + var4.field2994 * var5.field2985 + var4.field2976 * var5.field2976;
        float var14 = (float) this.field2119 * class193.field3345 + class203.field3432;
        float var15 = (float) this.field2027 * class193.field3345 + class203.field3432;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = (var15 - (float) this.field2092) * (float) this.field2040.field2832;
            var17 = ((float) this.field2092 + var14) * (float) this.field2040.field2832;
        } else {
            var16 = (var14 - (float) this.field2092) * (float) this.field2040.field2832;
            var17 = ((float) this.field2092 + var15) * (float) this.field2040.field2832;
        }
        if ((this.field2040.field2828 <= var16 / var8) || (var17 / var8 <= this.field2040.field2897)) {
            return;
        }
        if (arg1 != null || this.field2020 != null) {
            class79.field1159 = var4.field2964 * var5.field2965 + var4.field2985 * var5.field2995 + var4.field2969 * var5.field2964;
            class544.field7777 = var4.field2995 * var5.field2988 + var4.field2994 * var5.field2969 + var4.field2976 * var5.field2994;
            class266.field4130 = var4.field2965 * var5.field2965 + var4.field2991 * var5.field2995 + var4.field2988 * var5.field2964;
            class734.field10339 = var4.field2995 * var5.field2965 + var4.field2994 * var5.field2964 + var4.field2976 * var5.field2995;
            class624.field8746 = var4.field2965 * var5.field2988 + var4.field2991 * var5.field2994 + var4.field2988 * var5.field2969;
            class569.field8083 = var4.field2964 * var5.field2988 + var4.field2985 * var5.field2994 + var4.field2969 * var5.field2969;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field2088 + this.field2038 >> 1;
            int var21 = this.field2036 + this.field2029 >> 1;
            int var22 = (int) ((float) var21 * class79.field1159 + (float) this.field2119 * class413.field6088 + (float) var20 * class569.field8083 + class207.field3467);
            int var23 = (int) ((float) var21 * class734.field10339 + (float) this.field2119 * class193.field3345 + (float) var20 * class544.field7777 + class203.field3432);
            int var24 = (int) ((float) var21 * class266.field4130 + (float) this.field2119 * class25.field257 + (float) var20 * class624.field8746 + class281.field4365);
            if (var24 < this.field2040.field2819) {
                var18 = true;
            } else {
                arg1.field5764 = this.field2040.field2811 + (this.field2040.field2873 * var22 / var24);
                arg1.field5766 = this.field2040.field2830 + (this.field2040.field2832 * var23 / var24);
            }
            int var25 = (int) ((float) var21 * class79.field1159 + (float) this.field2027 * class413.field6088 + (float) var20 * class569.field8083 + class207.field3467);
            int var26 = (int) ((float) var21 * class734.field10339 + (float) this.field2027 * class193.field3345 + (float) var20 * class544.field7777 + class203.field3432);
            int var27 = (int) ((float) var21 * class266.field4130 + (float) this.field2027 * class25.field257 + (float) var20 * class624.field8746 + class281.field4365);
            if (var27 >= this.field2040.field2819) {
                arg1.field5765 = this.field2040.field2830 + (this.field2040.field2832 * var26 / var27);
                arg1.field5767 = this.field2040.field2811 + (this.field2040.field2873 * var25 / var27);
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field2040.field2819 > var24 && var27 < this.field2040.field2819) {
                    var19 = false;
                } else if (var24 < this.field2040.field2819) {
                    int var28 = (var27 - this.field2040.field2819 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field5764 = this.field2040.field2873 * var29 / this.field2040.field2819 + this.field2040.field2811;
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field5766 = this.field2040.field2832 * var30 / this.field2040.field2819 + this.field2040.field2830;
                } else if (var27 < this.field2040.field2819) {
                    int var31 = (var24 - this.field2040.field2819 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field5764 = this.field2040.field2811 + (this.field2040.field2873 * var32 / this.field2040.field2819);
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field5766 = this.field2040.field2832 * var33 / this.field2040.field2819 + this.field2040.field2830;
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field5769 = (var25 + this.field2092) * this.field2040.field2873 / var27 + this.field2040.field2811 - arg1.field5767;
                } else {
                    arg1.field5769 = (this.field2092 + var22) * this.field2040.field2873 / var24 + this.field2040.field2811 - arg1.field5764;
                }
                arg1.field5768 = true;
            }
        }
        this.field2040.method1331((byte) -113);
        this.field2040.method1294(var5, 16670);
        this.method1034(3);
        this.field2040.method1245(false);
        this.method1053(true);
    }

    @OriginalMember(owner = "client!vo", name = "V", descriptor = "()I", line = 680)
    public final int method1008() {
        if (!this.field2096) {
            this.method1055(-121);
        }
        field2072++;
        return this.field2088;
    }

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "(I[IIIIZI[I)V", line = 692)
    public final void method1009(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field2067++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class358.field5406 = 0;
            class601.field8489 = 0;
            class251.field3992 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field2039.length > var15) {
                    int[] var16 = this.field2039[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2082 == null || (this.field2082[var18] & arg6) != 0) {
                            class358.field5406 += this.field2026[var18];
                            class601.field8489 += this.field2068[var18];
                            class251.field3992 += this.field2070[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class601.field8489 = var12;
                class358.field5406 = var11;
                class251.field3992 = var10;
            } else {
                class601.field8489 = class601.field8489 / var13 + var12;
                class358.field5406 = class358.field5406 / var13 + var11;
                class251.field3992 = class251.field3992 / var13 + var10;
                class279.field4272 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[2] * arg4 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 8192 >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field2039.length > var26) {
                    int[] var27 = this.field2039[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2082 == null || (this.field2082[var29] & arg6) != 0) {
                            this.field2026[var29] += var23;
                            this.field2068[var29] += var24;
                            this.field2070[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field2039.length) {
                        int[] var50 = this.field2039[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field2082 == null || (this.field2082[var52] & arg6) != 0) {
                                this.field2026[var52] -= class358.field5406;
                                this.field2068[var52] -= class601.field8489;
                                this.field2070[var52] -= class251.field3992;
                                if (arg4 != 0) {
                                    int var53 = class582.field8226[arg4];
                                    int var54 = class582.field8230[arg4];
                                    int var55 = this.field2068[var52] * var53 + this.field2026[var52] * var54 + 16383 >> 14;
                                    this.field2068[var52] = this.field2068[var52] * var54 + 16383 - (this.field2026[var52] * var53) >> 14;
                                    this.field2026[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class582.field8226[arg2];
                                    int var57 = class582.field8230[arg2];
                                    int var58 = this.field2068[var52] * var57 + 16383 - (this.field2070[var52] * var56) >> 14;
                                    this.field2070[var52] = this.field2070[var52] * var57 + this.field2068[var52] * var56 + 16383 >> 14;
                                    this.field2068[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class582.field8226[arg3];
                                    int var60 = class582.field8230[arg3];
                                    int var61 = this.field2070[var52] * var59 + this.field2026[var52] * var60 + 16383 >> 14;
                                    this.field2070[var52] = this.field2070[var52] * var60 + 16383 - (this.field2026[var52] * var59) >> 14;
                                    this.field2026[var52] = var61;
                                }
                                this.field2026[var52] += class358.field5406;
                                this.field2068[var52] += class601.field8489;
                                this.field2070[var52] += class251.field3992;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field2039.length > var32) {
                            int[] var33 = this.field2039[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field2082 == null || (arg6 & this.field2082[var35]) != 0) {
                                    int var36 = this.field2122[var35];
                                    int var37 = this.field2122[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field2110[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class582.field8226[arg4];
                                            int var41 = class582.field8230[arg4];
                                            int var42 = this.field2037[var39] * var40 + this.field2109[var39] * var41 + 16383 >> 14;
                                            this.field2037[var39] = (short) (this.field2037[var39] * var41 + 16383 - (this.field2109[var39] * var40) >> 14);
                                            this.field2109[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class582.field8226[arg2];
                                            int var44 = class582.field8230[arg2];
                                            int var45 = this.field2037[var39] * var44 + 16383 - (this.field2010[var39] * var43) >> 14;
                                            this.field2010[var39] = (short) (this.field2037[var39] * var43 + this.field2010[var39] * var44 + 16383 >> 14);
                                            this.field2037[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class582.field8226[arg3];
                                            int var47 = class582.field8230[arg3];
                                            int var48 = this.field2010[var39] * var46 + this.field2109[var39] * var47 + 16383 >> 14;
                                            this.field2010[var39] = (short) (this.field2010[var39] * var47 + 16383 - (this.field2109[var39] * var46) >> 14);
                                            this.field2109[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2102 == null && this.field2063 != null) {
                        this.field2063.field7210 = null;
                    }
                    if (this.field2102 != null) {
                        this.field2102.field7210 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class279.field4272) {
                    int var68 = arg7[0] * class358.field5406 + (arg7[6] * class251.field3992) + arg7[3] * class601.field8489 + 8192 >> 14;
                    int var69 = arg7[1] * class358.field5406 + arg7[7] * class251.field3992 + arg7[4] * class601.field8489 + 8192 >> 14;
                    int var70 = arg7[8] * class251.field3992 + arg7[5] * class601.field8489 + arg7[2] * class358.field5406 + 8192 >> 14;
                    int var71 = var66 + var69;
                    int var72 = var65 + var68;
                    int var73 = var67 + var70;
                    class358.field5406 = var72;
                    class601.field8489 = var71;
                    class251.field3992 = var73;
                    class279.field4272 = false;
                }
                int[] var74 = new int[9];
                int var75 = class582.field8230[arg2];
                int var76 = class582.field8226[arg2];
                int var77 = class582.field8230[arg3];
                int var78 = class582.field8226[arg3];
                int var79 = class582.field8230[arg4];
                int var80 = class582.field8226[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[7] = var78 * var80 - (-(var77 * var81) - 8192) >> 14;
                var74[5] = -var76;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                int var83 = var74[0] * -class358.field5406 + (var74[1] * -class601.field8489) + var74[2] * -class251.field3992 + 8192 >> 14;
                int var84 = var74[4] * -class601.field8489 + var74[5] * -class251.field3992 + var74[3] * -class358.field5406 + 8192 >> 14;
                int var85 = var74[6] * -class358.field5406 + var74[7] * -class601.field8489 + (var74[8] * -class251.field3992) + 8192 >> 14;
                int var86 = class358.field5406 + var83;
                int var87 = class601.field8489 + var84;
                int var88 = class251.field3992 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[2] * var67 + var74[1] * var66 + var74[0] * var65 + 8192 >> 14;
                int var92 = var74[5] * var67 + var74[4] * var66 + (var74[3] * var65 - -8192) >> 14;
                int var93 = var74[6] * var65 + (var74[7] * var66) + (var74[8] * var67 - -8192) >> 14;
                int var94 = var87 + var92;
                int var95 = var86 + var91;
                int var96 = var88 + var93;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[0] * var95 + arg7[1] * var94 + 8192 >> 14;
                int var100 = arg7[3] * var95 + arg7[4] * var94 + arg7[5] * var96 + 8192 >> 14;
                int var101 = arg7[8] * var96 + (arg7[6] * var95 + (arg7[7] * var94)) + 8192 >> 14;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field2039.length > var106) {
                        int[] var107 = this.field2039[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field2082 == null || (this.field2082[var109] & arg6) != 0) {
                                int var110 = this.field2070[var109] * var97[2] + this.field2068[var109] * var97[1] + this.field2026[var109] * var97[0] + 8192 >> 14;
                                int var111 = this.field2068[var109] * var97[4] + this.field2070[var109] * var97[5] + this.field2026[var109] * var97[3] + 8192 >> 14;
                                int var112 = this.field2070[var109] * var97[8] + this.field2026[var109] * var97[6] + (this.field2068[var109] * var97[7]) + 8192 >> 14;
                                int var113 = var102 + var111;
                                int var114 = var103 + var110;
                                this.field2026[var109] = var114;
                                int var115 = var104 + var112;
                                this.field2068[var109] = var113;
                                this.field2070[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field2039.length > var123) {
                        int[] var124 = this.field2039[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field2082 == null || (arg6 & this.field2082[var126]) != 0) {
                                this.field2026[var126] -= class358.field5406;
                                this.field2068[var126] -= class601.field8489;
                                this.field2070[var126] -= class251.field3992;
                                this.field2026[var126] = this.field2026[var126] * arg2 >> 7;
                                this.field2068[var126] = this.field2068[var126] * arg3 >> 7;
                                this.field2070[var126] = this.field2070[var126] * arg4 >> 7;
                                this.field2026[var126] += class358.field5406;
                                this.field2068[var126] += class601.field8489;
                                this.field2070[var126] += class251.field3992;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class279.field4272) {
                    int var133 = arg7[6] * class251.field3992 + arg7[3] * class601.field8489 + arg7[0] * class358.field5406 + 8192 >> 14;
                    int var134 = arg7[7] * class251.field3992 + arg7[4] * class601.field8489 + arg7[1] * class358.field5406 + 8192 >> 14;
                    int var135 = var131 + var134;
                    int var136 = var130 + var133;
                    int var137 = arg7[8] * class251.field3992 + arg7[2] * class358.field5406 + (arg7[5] * class601.field8489) + 8192 >> 14;
                    class358.field5406 = var136;
                    int var138 = var132 + var137;
                    class601.field8489 = var135;
                    class251.field3992 = var138;
                    class279.field4272 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class358.field5406 * var139 + 8192 >> 14;
                int var143 = -class601.field8489 * var140 + 8192 >> 14;
                int var144 = -class251.field3992 * var141 + 8192 >> 14;
                int var145 = class358.field5406 + var142;
                int var146 = class601.field8489 + var143;
                int var147 = class251.field3992 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var145 + var149;
                int var153 = var132 * var141 + 8192 >> 14;
                int var154 = var147 + var153;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[0] * var152 - (-(arg7[1] * var151) - 8192) >> 14;
                int var158 = arg7[4] * var151 + arg7[5] * var154 + arg7[3] * var152 + 8192 >> 14;
                int var159 = arg7[6] * var152 - (-(arg7[7] * var151) - arg7[8] * var154 - 8192) >> 14;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field2039.length) {
                        int[] var165 = this.field2039[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field2082 == null || (arg6 & this.field2082[var167]) != 0) {
                                int var168 = this.field2026[var167] * var155[0] + 8192 - (-(this.field2068[var167] * var155[1]) - this.field2070[var167] * var155[2]) >> 14;
                                int var169 = this.field2026[var167] * var155[3] + (this.field2068[var167] * var155[4]) + this.field2070[var167] * var155[5] + 8192 >> 14;
                                int var170 = this.field2026[var167] * var155[6] + (this.field2068[var167] * var155[7]) + (this.field2070[var167] * var155[8]) + 8192 >> 14;
                                int var171 = var161 + var169;
                                int var172 = var160 + var168;
                                this.field2026[var167] = var172;
                                int var173 = var162 + var170;
                                this.field2068[var167] = var171;
                                this.field2070[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2054 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field2054.length) {
                        int[] var182 = this.field2054[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field2043 == null || (arg6 & this.field2043[var184]) != 0) {
                                int var185 = (this.field2041[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field2041[var184] = (byte) var185;
                                if (this.field2063 != null) {
                                    this.field2063.field7210 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2020 != null) {
                    for (int var178 = 0; var178 < this.field2080; var178++) {
                        class683 var179 = this.field2020[var178];
                        class628 var180 = this.field2112[var178];
                        var180.field8809 = var180.field8809 & 0xFFFFFF | 255 - (this.field2041[var179.field9667] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2054 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field2054.length > var190) {
                        int[] var191 = this.field2054[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field2043 == null || (arg6 & this.field2043[var193]) != 0) {
                                int var194 = this.field2113[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = var194 & 0x7F;
                                int var200 = arg4 + var199;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field2113[var193] = (short) class112.method903(var200, class112.method903(var198 << 10, var197 << 7));
                                if (this.field2063 != null) {
                                    this.field2063.field7210 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2020 != null) {
                    for (int var187 = 0; var187 < this.field2080; var187++) {
                        class683 var188 = this.field2020[var187];
                        class628 var189 = this.field2112[var187];
                        var189.field8809 = var189.field8809 & 0xFF000000 | class510.field7397[this.field2113[var188.field9667] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2050 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field2050.length) {
                        int[] var203 = this.field2050[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class628 var205 = this.field2112[var203[var204]];
                            var205.field8813 += arg3;
                            var205.field8811 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2050 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field2050.length > var207) {
                        int[] var208 = this.field2050[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class628 var210 = this.field2112[var208[var209]];
                            var210.field8810 = var210.field8810 * arg2 >> 7;
                            var210.field8812 = var210.field8812 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2050 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field2050.length > var212) {
                    int[] var213 = this.field2050[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class628 var215 = this.field2112[var213[var214]];
                        var215.field8807 = var215.field8807 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILtc;ZI)Z", line = 1683)
    public final boolean method1010(int arg0, int arg1, class73 arg2, boolean arg3, int arg4) {
        field2117++;
        return this.method1001(arg1, arg2, -1, arg3, arg0, arg4, 102);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[IIIIIZ)V", line = 1694)
    public final void method1011(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2104++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = 0;
            class251.field3992 = 0;
            class358.field5406 = 0;
            class601.field8489 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2039.length) {
                    int[] var15 = this.field2039[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class358.field5406 += this.field2026[var17];
                        class601.field8489 += this.field2068[var17];
                        var12++;
                        class251.field3992 += this.field2070[var17];
                    }
                }
            }
            if (var12 > 0) {
                class601.field8489 = class601.field8489 / var12 + var11;
                class251.field3992 = class251.field3992 / var12 + var10;
                class358.field5406 = class358.field5406 / var12 + var9;
            } else {
                class601.field8489 = var11;
                class358.field5406 = var9;
                class251.field3992 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field2039.length) {
                    int[] var23 = this.field2039[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field2026[var25] += var19;
                        this.field2068[var25] += var20;
                        this.field2070[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field2039.length > var45) {
                    int[] var46 = this.field2039[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field2026[var48] -= class358.field5406;
                            this.field2068[var48] -= class601.field8489;
                            this.field2070[var48] -= class251.field3992;
                            if (arg4 != 0) {
                                int var49 = class582.field8226[arg4];
                                int var50 = class582.field8230[arg4];
                                int var51 = this.field2068[var48] * var49 + this.field2026[var48] * var50 + 16383 >> 14;
                                this.field2068[var48] = this.field2068[var48] * var50 + 16383 - (this.field2026[var48] * var49) >> 14;
                                this.field2026[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class582.field8226[arg2];
                                int var53 = class582.field8230[arg2];
                                int var54 = this.field2068[var48] * var53 + 16383 - (this.field2070[var48] * var52) >> 14;
                                this.field2070[var48] = this.field2068[var48] * var52 + this.field2070[var48] * var53 + 16383 >> 14;
                                this.field2068[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class582.field8226[arg3];
                                int var56 = class582.field8230[arg3];
                                int var57 = this.field2070[var48] * var55 + this.field2026[var48] * var56 + 16383 >> 14;
                                this.field2070[var48] = this.field2070[var48] * var56 + 16383 - (this.field2026[var48] * var55) >> 14;
                                this.field2026[var48] = var57;
                            }
                            this.field2026[var48] += class358.field5406;
                            this.field2068[var48] += class601.field8489;
                            this.field2070[var48] += class251.field3992;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field2026[var59] -= class358.field5406;
                            this.field2068[var59] -= class601.field8489;
                            this.field2070[var59] -= class251.field3992;
                            if (arg2 != 0) {
                                int var60 = class582.field8226[arg2];
                                int var61 = class582.field8230[arg2];
                                int var62 = this.field2068[var59] * var61 + 16383 - this.field2070[var59] * var60 >> 14;
                                this.field2070[var59] = this.field2068[var59] * var60 + (this.field2070[var59] * var61) + 16383 >> 14;
                                this.field2068[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class582.field8226[arg4];
                                int var64 = class582.field8230[arg4];
                                int var65 = this.field2026[var59] * var64 + (this.field2068[var59] * var63 + 16383) >> 14;
                                this.field2068[var59] = this.field2068[var59] * var64 + 16383 - (this.field2026[var59] * var63) >> 14;
                                this.field2026[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class582.field8226[arg3];
                                int var67 = class582.field8230[arg3];
                                int var68 = this.field2026[var59] * var67 + this.field2070[var59] * var66 + 16383 >> 14;
                                this.field2070[var59] = this.field2070[var59] * var67 + 16383 - (this.field2026[var59] * var66) >> 14;
                                this.field2026[var59] = var68;
                            }
                            this.field2026[var59] += class358.field5406;
                            this.field2068[var59] += class601.field8489;
                            this.field2070[var59] += class251.field3992;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field2039.length > var28) {
                        int[] var29 = this.field2039[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field2122[var31];
                            int var33 = this.field2122[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field2110[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class582.field8226[arg4];
                                    int var37 = class582.field8230[arg4];
                                    int var38 = this.field2109[var35] * var37 + this.field2037[var35] * var36 + 16383 >> 14;
                                    this.field2037[var35] = (short) (this.field2037[var35] * var37 + 16383 - (this.field2109[var35] * var36) >> 14);
                                    this.field2109[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class582.field8226[arg2];
                                    int var40 = class582.field8230[arg2];
                                    int var41 = this.field2037[var35] * var40 + 16383 - (this.field2010[var35] * var39) >> 14;
                                    this.field2010[var35] = (short) (this.field2010[var35] * var40 + this.field2037[var35] * var39 + 16383 >> 14);
                                    this.field2037[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class582.field8226[arg3];
                                    int var43 = class582.field8230[arg3];
                                    int var44 = this.field2010[var35] * var42 + (this.field2109[var35] * var43 + 16383) >> 14;
                                    this.field2010[var35] = (short) (this.field2010[var35] * var43 + 16383 - (this.field2109[var35] * var42) >> 14);
                                    this.field2109[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field2102 == null && this.field2063 != null) {
                    this.field2063.field7210 = null;
                }
                if (this.field2102 != null) {
                    this.field2102.field7210 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field2039.length) {
                    int[] var71 = this.field2039[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field2026[var73] -= class358.field5406;
                        this.field2068[var73] -= class601.field8489;
                        this.field2070[var73] -= class251.field3992;
                        this.field2026[var73] = this.field2026[var73] * arg2 >> 7;
                        this.field2068[var73] = this.field2068[var73] * arg3 >> 7;
                        this.field2070[var73] = this.field2070[var73] * arg4 >> 7;
                        this.field2026[var73] += class358.field5406;
                        this.field2068[var73] += class601.field8489;
                        this.field2070[var73] += class251.field3992;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2054 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field2054.length > var78) {
                        int[] var79 = this.field2054[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field2041[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field2041[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field2063 != null) {
                            this.field2063.field7210 = null;
                        }
                    }
                }
                if (this.field2020 != null) {
                    for (int var75 = 0; var75 < this.field2080; var75++) {
                        class683 var76 = this.field2020[var75];
                        class628 var77 = this.field2112[var75];
                        var77.field8809 = var77.field8809 & 0xFFFFFF | 255 - (this.field2041[var76.field9667] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2054 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field2054.length > var87) {
                        int[] var88 = this.field2054[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field2113[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFDE3) >> 10;
                            int var93 = (var91 & 0x39E) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field2113[var90] = (short) class112.method903(class112.method903(var95 << 10, var94 << 7), var97);
                        }
                        if (var88.length > 0 && this.field2063 != null) {
                            this.field2063.field7210 = null;
                        }
                    }
                }
                if (this.field2020 != null) {
                    for (int var84 = 0; var84 < this.field2080; var84++) {
                        class683 var85 = this.field2020[var84];
                        class628 var86 = this.field2112[var84];
                        var86.field8809 = class510.field7397[this.field2113[var85.field9667] & 0xFFFF] & 0xFFFFFF | var86.field8809 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2050 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field2050.length) {
                        int[] var100 = this.field2050[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class628 var102 = this.field2112[var100[var101]];
                            var102.field8811 += arg2;
                            var102.field8813 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2050 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field2050.length) {
                        int[] var105 = this.field2050[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class628 var107 = this.field2112[var105[var106]];
                            var107.field8810 = var107.field8810 * arg2 >> 7;
                            var107.field8812 = var107.field8812 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2050 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field2050.length > var109) {
                    int[] var110 = this.field2050[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class628 var112 = this.field2112[var110[var111]];
                        var112.field8807 = var112.field8807 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 2350)
    private final void method1012(int arg0) {
        field2060++;
        if (!this.field2076) {
            return;
        }
        this.field2076 = false;
        if (this.field2099 == null && this.field2058 == null && this.field2020 == null) {
            if (this.field2026 != null && !class186.method1419(this.field2069, 458752, this.field2120)) {
                if (this.field2046 != null && this.field2046.field7210 == null) {
                    this.field2076 = true;
                } else {
                    if (!this.field2096) {
                        this.method1055(-112);
                    }
                    this.field2026 = null;
                }
            }
            if (this.field2068 != null && !class518.method3092(this.field2069, 458752, this.field2120)) {
                if (this.field2046 != null && this.field2046.field7210 == null) {
                    this.field2076 = true;
                } else {
                    if (!this.field2096) {
                        this.method1055(-66);
                    }
                    this.field2068 = null;
                }
            }
            if (this.field2070 != null && !class675.method3767((byte) -18, this.field2069, this.field2120)) {
                if (this.field2046 != null && this.field2046.field7210 == null) {
                    this.field2076 = true;
                } else {
                    if (!this.field2096) {
                        this.method1055(-66);
                    }
                    this.field2070 = null;
                }
            }
        }
        if (this.field2110 != null && this.field2026 == null && this.field2068 == null && this.field2070 == null) {
            this.field2122 = null;
            this.field2110 = null;
        }
        if (this.field2089 != null && !class742.method4159(this.field2120, true, this.field2069)) {
            if (this.field2102 == null) {
                if (this.field2063 != null && this.field2063.field7210 == null) {
                    this.field2076 = true;
                } else {
                    this.field2089 = null;
                    this.field2109 = this.field2037 = this.field2010 = null;
                }
            } else if (this.field2102.field7210 == null) {
                this.field2076 = true;
            } else {
                this.field2089 = null;
                this.field2109 = this.field2037 = this.field2010 = null;
            }
        }
        if (this.field2113 != null && !class100.method823(this.field2120, this.field2069, false)) {
            if (this.field2063 != null && this.field2063.field7210 == null) {
                this.field2076 = true;
            } else {
                this.field2113 = null;
            }
        }
        if (this.field2041 != null && !class471.method2872(this.field2069, this.field2120, 0)) {
            if (this.field2063 != null && this.field2063.field7210 == null) {
                this.field2076 = true;
            } else {
                this.field2041 = null;
            }
        }
        if (this.field2002 != null && !class436.method2694(this.field2120, this.field2069, -1)) {
            if (this.field2086 != null && this.field2086.field7210 == null) {
                this.field2076 = true;
            } else {
                this.field2002 = this.field2017 = null;
            }
        }
        if (this.field2022 != null && !class44.method464(2048, this.field2120, this.field2069)) {
            if (this.field2063 != null && this.field2063.field7210 == null) {
                this.field2076 = true;
            } else {
                this.field2022 = null;
            }
        }
        if (this.field2008 != null && !class317.method2076(this.field2120, false, this.field2069)) {
            if ((this.field2000 == null || this.field2000.field9532 != null) && (this.field2063 == null || this.field2063.field7210 != null)) {
                this.field2008 = this.field2012 = this.field2005 = null;
            } else {
                this.field2076 = true;
            }
        }
        if (arg0 > -40) {
            this.field2040 = null;
        }
        if (this.field2054 != null && !class594.method3400(this.field2120, (byte) -91, this.field2069)) {
            this.field2054 = null;
            this.field2043 = null;
        }
        if (this.field2039 != null && !class156.method1169(54, this.field2069, this.field2120)) {
            this.field2039 = null;
            this.field2082 = null;
        }
        if (this.field2050 != null && !class254.method1723(this.field2069, 28510, this.field2120)) {
            this.field2050 = null;
        }
        if (this.field2034 != null && (this.field2069 & 0x800) == 0 && (this.field2069 & 0x40000) == 0) {
            this.field2034 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "ma", descriptor = "()I", line = 2523)
    public final int method1013() {
        field2021++;
        if (!this.field2096) {
            this.method1055(-90);
        }
        return this.field2016;
    }

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "(I)V", line = 2535)
    public final void method1014(int arg0) {
        this.field2069 = arg0;
        field2066++;
        this.field2076 = true;
        if (this.field2091 != null && (this.field2069 & 0x10000) == 0) {
            this.field2037 = this.field2091.field7563;
            this.field2109 = this.field2091.field7559;
            this.field2089 = this.field2091.field7561;
            this.field2010 = this.field2091.field7560;
            this.field2091 = null;
        }
        this.method1012(-115);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V", line = 2558)
    private final void method1015(boolean arg0, int arg1) {
        if (arg1 > -83) {
            return;
        }
        field2009++;
        boolean var3 = this.field2063 != null && this.field2063.field7210 == null;
        boolean var4 = this.field2102 != null && this.field2102.field7210 == null;
        boolean var5 = this.field2046 != null && this.field2046.field7210 == null;
        boolean var6 = this.field2086 != null && this.field2086.field7210 == null;
        if (arg0) {
            var6 &= (this.field2108 & 0x8) != 0;
            var3 &= (this.field2108 & 0x2) != 0;
            var5 &= (this.field2108 & 0x1) != 0;
            var4 &= (this.field2108 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if ((this.field2057 * var7) <= this.field2040.field2870.field4543.length) {
            this.field2040.field2870.field4534 = 0;
        } else {
            this.field2040.field2870 = new class547((this.field2057 + 100) * var7);
        }
        class547 var12 = this.field2040.field2870;
        if (var5) {
            if (this.field2040.field2796) {
                for (int var21 = 0; var21 < this.field2042; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field2026[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field2068[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field2070[var21]);
                    int var25 = this.field2122[var21];
                    int var26 = this.field2122[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field2110[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field4534 = var7 * var28;
                        var12.method1970((byte) 29, var22);
                        var12.method1970((byte) 29, var23);
                        var12.method1970((byte) 29, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field2042; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field2026[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field2068[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field2070[var13]);
                    int var17 = this.field2122[var13];
                    int var18 = this.field2122[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field2110[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field4534 = var7 * var20;
                        var12.method1975(var14, 112);
                        var12.method1975(var15, 84);
                        var12.method1975(var16, 58);
                    }
                }
            }
        }
        if (var3) {
            if (this.field2102 == null) {
                byte[] var29;
                short[] var30;
                short[] var31;
                short[] var32;
                if (this.field2091 == null) {
                    var30 = this.field2037;
                    var31 = this.field2010;
                    var32 = this.field2109;
                    var29 = this.field2089;
                } else {
                    var29 = this.field2091.field7561;
                    var30 = this.field2091.field7563;
                    var31 = this.field2091.field7560;
                    var32 = this.field2091.field7559;
                }
                float var33 = this.field2040.field2868[0];
                float var34 = this.field2040.field2868[1];
                float var35 = this.field2040.field2868[2];
                float var36 = this.field2040.field2795;
                float var37 = this.field2040.field2792 * 768.0F / (float) this.field2090;
                float var38 = this.field2040.field2855 * 768.0F / (float) this.field2090;
                for (int var39 = 0; var39 < this.field2052; var39++) {
                    int var40 = this.method1041(this.field2113[var39], this.field2022[var39], (byte) 43, this.field2041[var39], this.field2025);
                    float var41 = (float) ((var40 & 0xFF13) >> 8) * this.field2040.field2835;
                    float var42 = (float) (var40 >> 16 & 0xFF) * this.field2040.field2803;
                    float var43 = (float) (var40 >>> 24) * this.field2040.field2814;
                    short var44 = this.field2008[var39];
                    short var45 = (short) var29[var44];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var44] * var35 + (float) var30[var44] * var34 + (float) var32[var44] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var44] * var35 + (float) var30[var44] * var34 + (float) var32[var44] * var33) / (float) (var45 * 256);
                    }
                    float var47 = ((var46 < 0.0F) ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var43 * var47);
                    int var49 = (int) (var42 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var41 * var47);
                    var12.field4534 = var7 * var44 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method1926(var48, 65280);
                    var12.method1926(var49, 65280);
                    var12.method1926(var50, 65280);
                    var12.method1926(255 - (this.field2041[var39] & 0xFF), 65280);
                    short var51 = this.field2012[var39];
                    short var52 = (short) var29[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + var53 * ((var53 < 0.0F) ? var38 : var37);
                    int var55 = (int) (var43 * var54);
                    int var56 = (int) (var42 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var57 = (int) (var41 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field4534 = var7 * var51 + var9;
                    var12.method1926(var55, 65280);
                    var12.method1926(var56, 65280);
                    var12.method1926(var57, 65280);
                    var12.method1926(255 - (this.field2041[var39] & 0xFF), 65280);
                    short var58 = this.field2005[var39];
                    short var59 = (short) var29[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = (var60 < 0.0F ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var43 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var42 * var61);
                    int var64 = (int) (var41 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field4534 = var7 * var58 + var9;
                    var12.method1926(var62, 65280);
                    var12.method1926(var63, 65280);
                    var12.method1926(var64, 65280);
                    var12.method1926(255 - (this.field2041[var39] & 0xFF), 65280);
                }
            } else {
                for (int var65 = 0; var65 < this.field2052; var65++) {
                    int var66 = this.method1041(this.field2113[var65], this.field2022[var65], (byte) 43, this.field2041[var65], this.field2025);
                    var12.field4534 = this.field2008[var65] * var7 + var9;
                    var12.method1970((byte) 29, var66);
                    var12.field4534 = this.field2012[var65] * var7 + var9;
                    var12.method1970((byte) 29, var66);
                    var12.field4534 = this.field2005[var65] * var7 + var9;
                    var12.method1970((byte) 29, var66);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field2091 == null) {
                var69 = this.field2010;
                var68 = this.field2109;
                var70 = this.field2089;
                var67 = this.field2037;
            } else {
                var67 = this.field2091.field7563;
                var68 = this.field2091.field7559;
                var69 = this.field2091.field7560;
                var70 = this.field2091.field7561;
            }
            float var71 = 3.0F / (float) this.field2090;
            float var72 = 3.0F / (float) (this.field2090 / 2 + this.field2090);
            var12.field4534 = var10;
            if (this.field2040.field2796) {
                for (int var73 = 0; var73 < this.field2057; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3200((float) var68[var73] * var72, 238551736);
                        var12.method3200((float) var67[var73] * var72, 238551736);
                        var12.method3200((float) var69[var73] * var72, 238551736);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3200((float) var68[var73] * var75, 238551736);
                        var12.method3200((float) var67[var73] * var75, 238551736);
                        var12.method3200((float) var69[var73] * var75, 238551736);
                    }
                    var12.field4534 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field2057; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3201(-1581865480, (float) var68[var76] * var72);
                        var12.method3201(-1581865480, (float) var67[var76] * var72);
                        var12.method3201(-1581865480, (float) var69[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3201(-1581865480, (float) var68[var76] * var78);
                        var12.method3201(-1581865480, (float) var67[var76] * var78);
                        var12.method3201(-1581865480, (float) var69[var76] * var78);
                    }
                    var12.field4534 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field4534 = var11;
            if (this.field2040.field2796) {
                for (int var80 = 0; var80 < this.field2057; var80++) {
                    var12.method3200(this.field2002[var80], 238551736);
                    var12.method3200(this.field2017[var80], 238551736);
                    var12.field4534 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field2057; var79++) {
                    var12.method3201(-1581865480, this.field2002[var79]);
                    var12.method3201(-1581865480, this.field2017[var79]);
                    var12.field4534 += var7 - 8;
                }
            }
        }
        var12.field4534 = this.field2057 * var7;
        class170 var81;
        if (arg0) {
            if (this.field2111 == null) {
                this.field2111 = this.field2040.method1255(516, true, var12.field4534, var12.field4543, var7);
            } else {
                this.field2111.method846(var12.field4543, (byte) 106, var7, var12.field4534);
            }
            var81 = this.field2111;
            this.field2108 = 0;
        } else {
            var81 = this.field2040.method1255(516, false, var12.field4534, var12.field4543, var7);
            this.field2076 = true;
        }
        if (var5) {
            this.field2046.field7210 = var81;
            this.field2046.field7207 = var8;
        }
        if (var6) {
            this.field2086.field7207 = var11;
            this.field2086.field7210 = var81;
        }
        if (var3) {
            this.field2063.field7207 = var9;
            this.field2063.field7210 = var81;
        }
        if (var4) {
            this.field2102.field7210 = var81;
            this.field2102.field7207 = var10;
        }
    }

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "()V", line = 3088)
    public final void method1016() {
        for (int var1 = 0; var1 < this.field2042; var1++) {
            this.field2070[var1] = -this.field2070[var1];
        }
        field2071++;
        for (int var2 = 0; var2 < this.field2057; var2++) {
            this.field2010[var2] = (short) (-this.field2010[var2]);
        }
        for (int var3 = 0; var3 < this.field2052; var3++) {
            short var4 = this.field2008[var3];
            this.field2008[var3] = this.field2005[var3];
            this.field2005[var3] = var4;
        }
        if (this.field2102 == null && this.field2063 != null) {
            this.field2063.field7210 = null;
        }
        if (this.field2102 != null) {
            this.field2102.field7210 = null;
        }
        this.field2096 = false;
        if (this.field2000 != null) {
            this.field2000.field9532 = null;
        }
        if (this.field2046 != null) {
            this.field2046.field7210 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILvo;ZIZLvo;)Lka;", line = 3140)
    private final class282 method1017(int arg0, class129 arg1, boolean arg2, int arg3, boolean arg4, class129 arg5) {
        if ((arg3 & 0x100) == 0) {
            arg5.field2031 = this.field2031;
        } else {
            arg5.field2031 = true;
        }
        arg5.field2042 = this.field2042;
        field2097++;
        arg5.field2052 = this.field2052;
        arg5.field2014 = this.field2014;
        arg5.field2100 = this.field2100;
        arg5.field2090 = this.field2090;
        arg5.field2080 = this.field2080;
        arg5.field2057 = this.field2057;
        arg5.field2069 = arg3;
        arg5.field2120 = this.field2120;
        arg5.field2025 = this.field2025;
        arg5.field2108 = 0;
        arg5.field2114 = this.field2114;
        boolean var7 = class629.method3565(this.field2120, (byte) 54, arg3);
        boolean var8 = class502.method3038(arg3, this.field2120, arg0 - 105);
        boolean var9 = class4.method15(arg3, this.field2120, true);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg5.field2026 = this.field2026;
            } else if (arg1.field2026 == null || arg1.field2026.length < this.field2014) {
                arg5.field2026 = arg1.field2026 = new int[this.field2014];
            } else {
                arg5.field2026 = arg1.field2026;
            }
            if (!var8) {
                arg5.field2068 = this.field2068;
            } else if (arg1.field2068 == null || this.field2014 > arg1.field2068.length) {
                arg5.field2068 = arg1.field2068 = new int[this.field2014];
            } else {
                arg5.field2068 = arg1.field2068;
            }
            if (!var9) {
                arg5.field2070 = this.field2070;
            } else if (arg1.field2070 == null || arg1.field2070.length < this.field2014) {
                arg5.field2070 = arg1.field2070 = new int[this.field2014];
            } else {
                arg5.field2070 = arg1.field2070;
            }
            for (int var11 = 0; var11 < this.field2014; var11++) {
                if (var7) {
                    arg5.field2026[var11] = this.field2026[var11];
                }
                if (var8) {
                    arg5.field2068[var11] = this.field2068[var11];
                }
                if (var9) {
                    arg5.field2070[var11] = this.field2070[var11];
                }
            }
        } else {
            arg5.field2068 = this.field2068;
            arg5.field2026 = this.field2026;
            arg5.field2070 = this.field2070;
        }
        if (class461.method2827(0, arg3, this.field2120)) {
            if (arg2) {
                arg5.field2108 = (byte) (arg5.field2108 | 0x1);
            }
            arg5.field2046 = arg1.field2046;
            arg5.field2046.field7207 = this.field2046.field7207;
            arg5.field2046.field7210 = this.field2046.field7210;
        } else if (class512.method3077(this.field2120, arg3, -122)) {
            arg5.field2046 = this.field2046;
        } else {
            arg5.field2046 = null;
        }
        if (class395.method2455(arg3, true, this.field2120)) {
            if (arg1.field2113 == null || this.field2052 > arg1.field2113.length) {
                arg5.field2113 = arg1.field2113 = new short[this.field2052];
            } else {
                arg5.field2113 = arg1.field2113;
            }
            for (int var12 = 0; var12 < this.field2052; var12++) {
                arg5.field2113[var12] = this.field2113[var12];
            }
        } else {
            arg5.field2113 = this.field2113;
        }
        if (class328.method2117(this.field2120, arg3, true)) {
            if (arg1.field2041 == null || arg1.field2041.length < this.field2052) {
                arg5.field2041 = arg1.field2041 = new byte[this.field2052];
            } else {
                arg5.field2041 = arg1.field2041;
            }
            for (int var13 = 0; var13 < this.field2052; var13++) {
                arg5.field2041[var13] = this.field2041[var13];
            }
        } else {
            arg5.field2041 = this.field2041;
        }
        if (class496.method3008(this.field2120, arg0 + 45049, arg3)) {
            if (arg2) {
                arg5.field2108 = (byte) (arg5.field2108 | 0x2);
            }
            arg5.field2063 = arg1.field2063;
            arg5.field2063.field7207 = this.field2063.field7207;
            arg5.field2063.field7210 = this.field2063.field7210;
        } else if (class214.method1540((byte) -108, arg3, this.field2120)) {
            arg5.field2063 = this.field2063;
        } else {
            arg5.field2063 = null;
        }
        if (class476.method2896(arg3, 24, this.field2120)) {
            if (arg1.field2109 == null || arg1.field2109.length < this.field2057) {
                int var14 = this.field2057;
                arg5.field2037 = arg1.field2037 = new short[var14];
                arg5.field2010 = arg1.field2010 = new short[var14];
                arg5.field2109 = arg1.field2109 = new short[var14];
            } else {
                arg5.field2109 = arg1.field2109;
                arg5.field2010 = arg1.field2010;
                arg5.field2037 = arg1.field2037;
            }
            if (this.field2091 == null) {
                for (int var18 = 0; var18 < this.field2057; var18++) {
                    arg5.field2109[var18] = this.field2109[var18];
                    arg5.field2037[var18] = this.field2037[var18];
                    arg5.field2010[var18] = this.field2010[var18];
                }
            } else {
                if (arg1.field2091 == null) {
                    arg1.field2091 = new class525();
                }
                class525 var15 = arg5.field2091 = arg1.field2091;
                if (var15.field7559 == null || var15.field7559.length < this.field2057) {
                    int var16 = this.field2057;
                    var15.field7560 = new short[var16];
                    var15.field7561 = new byte[var16];
                    var15.field7559 = new short[var16];
                    var15.field7563 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field2057; var17++) {
                    arg5.field2109[var17] = this.field2109[var17];
                    arg5.field2037[var17] = this.field2037[var17];
                    arg5.field2010[var17] = this.field2010[var17];
                    var15.field7559[var17] = this.field2091.field7559[var17];
                    var15.field7563[var17] = this.field2091.field7563[var17];
                    var15.field7560[var17] = this.field2091.field7560[var17];
                    var15.field7561[var17] = this.field2091.field7561[var17];
                }
            }
            arg5.field2089 = this.field2089;
        } else {
            arg5.field2037 = this.field2037;
            arg5.field2089 = this.field2089;
            arg5.field2010 = this.field2010;
            arg5.field2109 = this.field2109;
            arg5.field2091 = this.field2091;
        }
        if (class217.method1555(arg3, this.field2120, false)) {
            arg5.field2102 = arg1.field2102;
            if (arg2) {
                arg5.field2108 = (byte) (arg5.field2108 | 0x4);
            }
            arg5.field2102.field7210 = this.field2102.field7210;
            arg5.field2102.field7207 = this.field2102.field7207;
        } else if (class64.method634(107, this.field2120, arg3)) {
            arg5.field2102 = this.field2102;
        } else {
            arg5.field2102 = null;
        }
        if (class635.method3597(arg3, this.field2120, arg0 + 9936)) {
            if (arg1.field2002 == null || this.field2052 > arg1.field2002.length) {
                int var19 = this.field2057;
                arg5.field2017 = arg1.field2017 = new float[var19];
                arg5.field2002 = arg1.field2002 = new float[var19];
            } else {
                arg5.field2002 = arg1.field2002;
                arg5.field2017 = arg1.field2017;
            }
            for (int var20 = 0; var20 < this.field2057; var20++) {
                arg5.field2002[var20] = this.field2002[var20];
                arg5.field2017[var20] = this.field2017[var20];
            }
        } else {
            arg5.field2002 = this.field2002;
            arg5.field2017 = this.field2017;
        }
        if (class476.method2888(11149, arg3, this.field2120)) {
            if (arg2) {
                arg5.field2108 = (byte) (arg5.field2108 | 0x8);
            }
            arg5.field2086 = arg1.field2086;
            arg5.field2086.field7210 = this.field2086.field7210;
            arg5.field2086.field7207 = this.field2086.field7207;
        } else if (class55.method522(arg3, 2048, this.field2120)) {
            arg5.field2086 = this.field2086;
        } else {
            arg5.field2086 = null;
        }
        if (class367.method2346(arg3, this.field2120, false)) {
            if (arg1.field2008 == null || this.field2052 > arg1.field2008.length) {
                int var21 = this.field2052;
                arg5.field2012 = arg1.field2012 = new short[var21];
                arg5.field2005 = arg1.field2005 = new short[var21];
                arg5.field2008 = arg1.field2008 = new short[var21];
            } else {
                arg5.field2005 = arg1.field2005;
                arg5.field2012 = arg1.field2012;
                arg5.field2008 = arg1.field2008;
            }
            for (int var22 = 0; var22 < this.field2052; var22++) {
                arg5.field2008[var22] = this.field2008[var22];
                arg5.field2012[var22] = this.field2012[var22];
                arg5.field2005[var22] = this.field2005[var22];
            }
        } else {
            arg5.field2012 = this.field2012;
            arg5.field2008 = this.field2008;
            arg5.field2005 = this.field2005;
        }
        if (class135.method1086(0, arg3, this.field2120)) {
            if (arg2) {
                arg5.field2108 = (byte) (arg5.field2108 | 0x10);
            }
            arg5.field2000 = arg1.field2000;
            arg5.field2000.field9532 = this.field2000.field9532;
        } else if (class405.method2497(this.field2120, (byte) 70, arg3)) {
            arg5.field2000 = this.field2000;
        } else {
            arg5.field2000 = null;
        }
        if (arg0 != 7) {
            this.field2120 = 97;
        }
        if (class339.method2163(arg3, this.field2120, true)) {
            if (arg1.field2022 == null || arg1.field2022.length < this.field2052) {
                int var23 = this.field2052;
                arg5.field2022 = arg1.field2022 = new short[var23];
            } else {
                arg5.field2022 = arg1.field2022;
            }
            for (int var24 = 0; var24 < this.field2052; var24++) {
                arg5.field2022[var24] = this.field2022[var24];
            }
        } else {
            arg5.field2022 = this.field2022;
        }
        if (!class550.method3211(this.field2120, arg3, true)) {
            arg5.field2112 = this.field2112;
        } else if (arg1.field2112 == null || this.field2080 > arg1.field2112.length) {
            int var26 = this.field2080;
            arg5.field2112 = arg1.field2112 = new class628[var26];
            for (int var27 = 0; var27 < this.field2080; var27++) {
                arg5.field2112[var27] = this.field2112[var27].method3562((byte) -18);
            }
        } else {
            arg5.field2112 = arg1.field2112;
            for (int var25 = 0; var25 < this.field2080; var25++) {
                arg5.field2112[var25].method3563(-104, this.field2112[var25]);
            }
        }
        arg5.field2034 = this.field2034;
        arg5.field2082 = this.field2082;
        arg5.field2050 = this.field2050;
        arg5.field2099 = this.field2099;
        arg5.field2020 = this.field2020;
        arg5.field2039 = this.field2039;
        arg5.field2058 = this.field2058;
        arg5.field2122 = this.field2122;
        if (this.field2096) {
            arg5.field2029 = this.field2029;
            arg5.field2092 = this.field2092;
            arg5.field2119 = this.field2119;
            arg5.field2036 = this.field2036;
            arg5.field2038 = this.field2038;
            arg5.field2027 = this.field2027;
            arg5.field2096 = true;
            arg5.field2088 = this.field2088;
            arg5.field2016 = this.field2016;
        } else {
            arg5.field2096 = false;
        }
        arg5.field2110 = this.field2110;
        arg5.field2043 = this.field2043;
        arg5.field2054 = this.field2054;
        return arg5;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lrs;)V", line = 5910)
    public class129(class166 arg0) {
        this.field2040 = arg0;
        this.field2046 = new class497(null, 5126, 3, 0);
        this.field2086 = new class497(null, 5126, 2, 0);
        this.field2102 = new class497(null, 5126, 3, 0);
        this.field2063 = new class497(null, 5121, 4, 0);
        this.field2000 = new class674();
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lrs;Lb;IIII)V", line = 5922)
    public class129(class166 arg0, class352 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2069 = arg2;
        this.field2040 = arg0;
        this.field2120 = arg5;
        if (class512.method3077(arg5, arg2, 96)) {
            this.field2046 = new class497(null, 5126, 3, 0);
        }
        if (class55.method522(arg2, 2048, arg5)) {
            this.field2086 = new class497(null, 5126, 2, 0);
        }
        if (class64.method634(-92, arg5, arg2)) {
            this.field2102 = new class497(null, 5126, 3, 0);
        }
        if (class214.method1540((byte) -103, arg2, arg5)) {
            this.field2063 = new class497(null, 5121, 4, 0);
        }
        if (class405.method2497(arg5, (byte) 95, arg2)) {
            this.field2000 = new class674();
        }
        class267 var7 = arg0.field7764;
        int[] var8 = new int[arg1.field5186];
        this.field2122 = new int[arg1.field5145 + 1];
        for (int var9 = 0; var9 < arg1.field5186; var9++) {
            if (arg1.field5167 == null || arg1.field5167[var9] != 2) {
                if (arg1.field5168 != null && arg1.field5168[var9] != -1) {
                    class569 var173 = var7.method1774(80, arg1.field5168[var9] & 0xFFFF);
                    if (((this.field2120 & 0x40) == 0 || !var173.field8062) && var173.field8068) {
                        continue;
                    }
                }
                var8[this.field2052++] = var9;
                this.field2122[arg1.field5150[var9]]++;
                this.field2122[arg1.field5177[var9]]++;
                this.field2122[arg1.field5183[var9]]++;
            }
        }
        this.field2114 = this.field2052;
        long[] var10 = new long[this.field2052];
        boolean var11 = (this.field2069 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field2052; var12++) {
            int var156 = var8[var12];
            class569 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field5189 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field5189.length; var163++) {
                    class562 var164 = arg1.field5189[var163];
                    if (var164.field7964 == var156) {
                        class355 var165 = class176.method1378(var164.field7954, (byte) 122);
                        if (var165.field5374) {
                            var162 = true;
                        }
                        if (var165.field5378 != -1) {
                            class569 var166 = var7.method1774(94, var165.field5378);
                            if (var166.field8072 == 2) {
                                this.field2031 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field2114--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field5168 != null) {
                var167 = arg1.field5168[var156];
                if (var167 != -1) {
                    var157 = var7.method1774(99, var167 & 0xFFFF);
                    if ((this.field2120 & 0x40) != 0 && var157.field8062) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        var161 = var157.field8065;
                        if (var157.field8058 != 0 || var157.field8066 != 0) {
                            this.field2100 = true;
                        }
                        var160 = var157.field8079;
                    }
                }
            }
            boolean var168 = arg1.field5196 != null && arg1.field5196[var156] != 0 || var157 != null && var157.field8072 != 0;
            if ((var11 || var168) && arg1.field5143 != null) {
                var158 += arg1.field5143[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var167 & 0xFFFF << 16) + var159;
            int var171 = (var161 & 0xFF) + var169;
            int var172 = (var12 & 0xFFFF) + var170;
            var10[var12] = ((long) var171 << 32) + (long) var172;
            this.field2031 |= var168;
            this.field2100 |= var157 != null && (var157.field8058 != 0 || var157.field8066 != 0);
        }
        class180.method1395(var8, -1, var10);
        this.field2026 = arg1.field5159;
        this.field2070 = arg1.field5164;
        this.field2042 = arg1.field5145;
        this.field2068 = arg1.field5175;
        this.field2014 = arg1.field5180;
        this.field2082 = arg1.field5160;
        this.field2099 = arg1.field5153;
        class515[] var13 = new class515[this.field2042];
        this.field2058 = arg1.field5191;
        if (arg1.field5189 != null) {
            this.field2080 = arg1.field5189.length;
            this.field2112 = new class628[this.field2080];
            this.field2020 = new class683[this.field2080];
            for (int var14 = 0; var14 < this.field2080; var14++) {
                class562 var15 = arg1.field5189[var14];
                class355 var16 = class176.method1378(var15.field7954, (byte) 123);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field2052; var18++) {
                    if (var8[var18] == var15.field7964) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class510.field7397[arg1.field5161[var15.field7964] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field5196 == null ? 0 : arg1.field5196[var15.field7964]) << 24;
                this.field2020[var14] = new class683(var17, arg1.field5150[var15.field7964], arg1.field5177[var15.field7964], arg1.field5183[var15.field7964], var16.field5381, var16.field5383, var16.field5378, var16.field5382, var16.field5379, var16.field5374, var16.field5376, var15.field7960);
                this.field2112[var14] = new class628(var20);
            }
        }
        int var21 = this.field2052 * 3;
        this.field2012 = new short[this.field2052];
        this.field2041 = new byte[this.field2052];
        this.field2005 = new short[this.field2052];
        this.field2090 = (short) arg4;
        this.field2010 = new short[var21];
        this.field2089 = new byte[var21];
        this.field2037 = new short[var21];
        this.field2017 = new float[var21];
        class594.field8339 = new long[var21];
        if (arg1.field5154 != null) {
            this.field2043 = new short[this.field2052];
        }
        this.field2025 = (short) arg3;
        this.field2109 = new short[var21];
        this.field2002 = new float[var21];
        this.field2022 = new short[this.field2052];
        this.field2008 = new short[this.field2052];
        this.field2110 = new short[var21];
        this.field2113 = new short[this.field2052];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field5145; var23++) {
            int var155 = this.field2122[var23];
            this.field2122[var23] = var22;
            var13[var23] = new class515();
            var22 += var155;
        }
        this.field2122[arg1.field5145] = var22;
        class705 var24 = class397.method2458(var8, arg1, 18767, this.field2052);
        class247[] var25 = new class247[arg1.field5186];
        for (int var26 = 0; var26 < arg1.field5186; var26++) {
            short var134 = arg1.field5150[var26];
            short var135 = arg1.field5177[var26];
            short var136 = arg1.field5183[var26];
            int var137 = this.field2026[var135] - this.field2026[var134];
            int var138 = this.field2068[var135] - this.field2068[var134];
            int var139 = this.field2070[var135] - this.field2070[var134];
            int var140 = this.field2026[var136] - this.field2026[var134];
            int var141 = this.field2068[var136] - this.field2068[var134];
            int var142 = this.field2070[var136] - this.field2070[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var145 >>= 0x1;
                var143 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var145 * var145 + var143 * var143 + var144 * var144));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var145 * 256 / var146;
            int var149 = var143 * 256 / var146;
            byte var150 = arg1.field5167 == null ? 0 : arg1.field5167[var26];
            if (var150 == 0) {
                class515 var151 = var13[var134];
                var151.field7464 += var149;
                var151.field7462 += var148;
                var151.field7467++;
                var151.field7465 += var147;
                class515 var152 = var13[var135];
                var152.field7462 += var148;
                var152.field7464 += var149;
                var152.field7467++;
                var152.field7465 += var147;
                class515 var153 = var13[var136];
                var153.field7467++;
                var153.field7465 += var147;
                var153.field7462 += var148;
                var153.field7464 += var149;
            } else if (var150 == 1) {
                class247 var154 = var25[var26] = new class247();
                var154.field3957 = var149;
                var154.field3956 = var148;
                var154.field3955 = var147;
            }
        }
        for (int var27 = 0; var27 < this.field2052; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field5161[var43] & 0xFFFF;
            int var45;
            if (arg1.field5195 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field5195[var43];
            }
            int var46;
            if (arg1.field5196 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field5196[var43] & 0xFF;
            }
            short var47 = arg1.field5168 == null ? -1 : arg1.field5168[var43];
            if (var47 != -1 && (this.field2120 & 0x40) != 0) {
                class569 var48 = var7.method1774(84, var47 & 0xFFFF);
                if (var48.field8062) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var50 = 1.0F;
                    var55 = 1;
                    var51 = 1.0F;
                    var53 = 0.0F;
                    var52 = 1.0F;
                    var56 = 2;
                    var49 = 0.0F;
                    var54 = 0.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field5162[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field5150[var43];
                        short var60 = arg1.field5177[var43];
                        short var61 = arg1.field5183[var43];
                        short var62 = arg1.field5156[var45];
                        short var63 = arg1.field5155[var45];
                        short var64 = arg1.field5152[var45];
                        float var65 = (float) arg1.field5159[var62];
                        float var66 = (float) arg1.field5175[var62];
                        float var67 = (float) arg1.field5164[var62];
                        float var68 = (float) arg1.field5159[var63] - var65;
                        float var69 = (float) arg1.field5175[var63] - var66;
                        float var70 = (float) arg1.field5164[var63] - var67;
                        float var71 = (float) arg1.field5159[var64] - var65;
                        float var72 = (float) arg1.field5175[var64] - var66;
                        float var73 = (float) arg1.field5164[var64] - var67;
                        float var74 = (float) arg1.field5159[var59] - var65;
                        float var75 = (float) arg1.field5175[var59] - var66;
                        float var76 = (float) arg1.field5164[var59] - var67;
                        float var77 = (float) arg1.field5159[var60] - var65;
                        float var78 = (float) arg1.field5175[var60] - var66;
                        float var79 = (float) arg1.field5164[var60] - var67;
                        float var80 = (float) arg1.field5159[var61] - var65;
                        float var81 = (float) arg1.field5175[var61] - var66;
                        float var82 = (float) arg1.field5164[var61] - var67;
                        float var83 = var69 * var73 - (var70 * var72);
                        float var84 = var70 * var71 - (var68 * var73);
                        float var85 = var68 * var72 - (var69 * var71);
                        float var86 = var72 * var85 - var73 * var84;
                        float var87 = var73 * var83 - var71 * var85;
                        float var88 = var71 * var84 - var72 * var83;
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        float var90 = var70 * var83 - (var68 * var85);
                        float var91 = var68 * var84 - var69 * var83;
                        float var92 = var69 * var85 - (var70 * var84);
                        float var93 = 1.0F / (var73 * var91 + var71 * var92 + var72 * var90);
                        var54 = (var82 * var91 + var80 * var92 + var81 * var90) * var93;
                        var52 = (var79 * var91 + var77 * var92 + var78 * var90) * var93;
                        var50 = (var76 * var91 + var74 * var92 + var75 * var90) * var93;
                    } else {
                        short var94 = arg1.field5150[var43];
                        short var95 = arg1.field5177[var43];
                        short var96 = arg1.field5183[var43];
                        int var97 = var24.field9957[var45];
                        int var98 = var24.field9952[var45];
                        int var99 = var24.field9958[var45];
                        float[] var100 = var24.field9953[var45];
                        byte var101 = arg1.field5188[var45];
                        float var102 = (float) arg1.field5174[var45] / 256.0F;
                        if (var58 == 1) {
                            float var120 = (float) arg1.field5172[var45] / 1024.0F;
                            class520.method3098(arg1.field5159[var94], var102, var101, var97, arg1.field5164[var94], var99, arg1.field5175[var94], var98, var120, var100, -56, class424.field6230);
                            var50 = class424.field6230[1];
                            var49 = class424.field6230[0];
                            class520.method3098(arg1.field5159[var95], var102, var101, var97, arg1.field5164[var95], var99, arg1.field5175[var95], var98, var120, var100, -94, class424.field6230);
                            var52 = class424.field6230[1];
                            var51 = class424.field6230[0];
                            class520.method3098(arg1.field5159[var96], var102, var101, var97, arg1.field5164[var96], var99, arg1.field5175[var96], var98, var120, var100, -62, class424.field6230);
                            var54 = class424.field6230[1];
                            var53 = class424.field6230[0];
                            float var121 = var120 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if ((var121 < var53 - var49)) {
                                    var56 = 1;
                                    var53 -= var120;
                                } else if (var49 - var53 > var121) {
                                    var56 = 2;
                                    var53 += var120;
                                }
                                if ((var51 - var49 > var121)) {
                                    var55 = 1;
                                    var51 -= var120;
                                } else if (var121 < var49 - var51) {
                                    var51 += var120;
                                    var55 = 2;
                                }
                            } else {
                                if ((var52 - var50 > var121)) {
                                    var55 = 1;
                                    var52 -= var120;
                                } else if (var50 - var52 > var121) {
                                    var52 += var120;
                                    var55 = 2;
                                }
                                if (var121 < var54 - var50) {
                                    var54 -= var120;
                                    var56 = 1;
                                } else if (var50 - var54 > var121) {
                                    var56 = 2;
                                    var54 += var120;
                                }
                            }
                        } else if (var58 == 2) {
                            float var103 = (float) arg1.field5157[var45] / 256.0F;
                            float var104 = (float) arg1.field5169[var45] / 256.0F;
                            int var105 = arg1.field5159[var95] - arg1.field5159[var94];
                            int var106 = arg1.field5175[var95] - arg1.field5175[var94];
                            int var107 = arg1.field5164[var95] - arg1.field5164[var94];
                            int var108 = arg1.field5159[var96] - arg1.field5159[var94];
                            int var109 = arg1.field5175[var96] - arg1.field5175[var94];
                            int var110 = arg1.field5164[var96] - arg1.field5164[var94];
                            int var111 = var106 * var110 - (var107 * var109);
                            int var112 = var107 * var108 - var105 * var110;
                            int var113 = var105 * var109 - var106 * var108;
                            float var114 = 64.0F / (float) arg1.field5185[var45];
                            float var115 = 64.0F / (float) arg1.field5190[var45];
                            float var116 = 64.0F / (float) arg1.field5172[var45];
                            float var117 = (var100[2] * (float) var113 + var100[1] * (float) var112 + var100[0] * (float) var111) / var114;
                            float var118 = (var100[5] * (float) var113 + var100[4] * (float) var112 + var100[3] * (float) var111) / var115;
                            float var119 = (var100[8] * (float) var113 + var100[6] * (float) var111 + var100[7] * (float) var112) / var116;
                            var57 = class668.method3744(0, var118, var117, var119);
                            class189.method1434(arg1.field5159[var94], var103, var101, 110, var100, arg1.field5164[var94], class424.field6230, var57, var99, var102, var98, var104, var97, arg1.field5175[var94]);
                            var50 = class424.field6230[1];
                            var49 = class424.field6230[0];
                            class189.method1434(arg1.field5159[var95], var103, var101, 118, var100, arg1.field5164[var95], class424.field6230, var57, var99, var102, var98, var104, var97, arg1.field5175[var95]);
                            var52 = class424.field6230[1];
                            var51 = class424.field6230[0];
                            class189.method1434(arg1.field5159[var96], var103, var101, 116, var100, arg1.field5164[var96], class424.field6230, var57, var99, var102, var98, var104, var97, arg1.field5175[var96]);
                            var53 = class424.field6230[0];
                            var54 = class424.field6230[1];
                        } else if (var58 == 3) {
                            class690.method3855(class424.field6230, var102, var99, arg1.field5175[var94], var98, var101, arg1.field5164[var94], arg1.field5159[var94], 2616, var100, var97);
                            var50 = class424.field6230[1];
                            var49 = class424.field6230[0];
                            class690.method3855(class424.field6230, var102, var99, arg1.field5175[var95], var98, var101, arg1.field5164[var95], arg1.field5159[var95], 2616, var100, var97);
                            var51 = class424.field6230[0];
                            var52 = class424.field6230[1];
                            class690.method3855(class424.field6230, var102, var99, arg1.field5175[var96], var98, var101, arg1.field5164[var96], arg1.field5159[var96], 2616, var100, var97);
                            var53 = class424.field6230[0];
                            var54 = class424.field6230[1];
                            if ((var101 & 0x1) == 0) {
                                if (var53 - var49 > 0.5F) {
                                    var56 = 1;
                                    var53--;
                                } else if (var49 - var53 > 0.5F) {
                                    var53++;
                                    var56 = 2;
                                }
                                if ((var51 - var49 > 0.5F)) {
                                    var51--;
                                    var55 = 1;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                            } else {
                                if (var52 - var50 > 0.5F) {
                                    var52--;
                                    var55 = 1;
                                } else if (var50 - var52 > 0.5F) {
                                    var52++;
                                    var55 = 2;
                                }
                                if (var54 - var50 > 0.5F) {
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field5167 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field5167[var43];
            }
            if (var122 == 0) {
                long var123 = ((long) (var57 << 24) + ((long) var46) + (long) (var44 << 8) << 32) + (long) (var45 << 2);
                short var125 = arg1.field5150[var43];
                short var126 = arg1.field5177[var43];
                short var127 = arg1.field5183[var43];
                class515 var128 = var13[var125];
                this.field2008[var27] = this.method1038(var125, var128.field7464, var49, true, var128.field7467, var128.field7465, var123, var128.field7462, var50, arg1);
                class515 var129 = var13[var126];
                this.field2012[var27] = this.method1038(var126, var129.field7464, var51, true, var129.field7467, var129.field7465, (long) var55 + var123, var129.field7462, var52, arg1);
                class515 var130 = var13[var127];
                this.field2005[var27] = this.method1038(var127, var130.field7464, var53, true, var130.field7467, var130.field7465, (long) var56 + var123, var130.field7462, var54, arg1);
            } else if (var122 == 1) {
                class247 var131 = var25[var43];
                long var132 = (long) ((var131.field3957 > 0 ? 1024 : 2048) + (var45 << 2) + (var131.field3956 - -256 << 22) + (var131.field3955 + 256 << 12)) + ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32);
                this.field2008[var27] = this.method1038(arg1.field5150[var43], var131.field3957, var49, true, 0, var131.field3955, var132, var131.field3956, var50, arg1);
                this.field2012[var27] = this.method1038(arg1.field5177[var43], var131.field3957, var51, true, 0, var131.field3955, (long) var55 + var132, var131.field3956, var52, arg1);
                this.field2005[var27] = this.method1038(arg1.field5183[var43], var131.field3957, var53, true, 0, var131.field3955, (long) var56 + var132, var131.field3956, var54, arg1);
            }
            if (arg1.field5196 != null) {
                this.field2041[var27] = arg1.field5196[var43];
            }
            if (arg1.field5154 != null) {
                this.field2043[var27] = arg1.field5154[var43];
            }
            this.field2113[var27] = arg1.field5161[var43];
            this.field2022[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field2114; var30++) {
            short var42 = this.field2022[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field2034 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field2114; var33++) {
            short var41 = this.field2022[var33];
            if (var32 != var41) {
                var32 = var41;
                this.field2034[var31++] = var33;
            }
        }
        this.field2034[var31] = this.field2114;
        class594.field8339 = null;
        this.field2109 = class344.method2207(this.field2109, 0, this.field2057);
        this.field2037 = class344.method2207(this.field2037, 0, this.field2057);
        this.field2010 = class344.method2207(this.field2010, 0, this.field2057);
        this.field2089 = class616.method3518(this.field2089, this.field2057, false);
        this.field2002 = class614.method3505(false, this.field2057, this.field2002);
        this.field2017 = class614.method3505(false, this.field2057, this.field2017);
        if (arg1.field5194 != null && class156.method1169(89, arg2, this.field2120)) {
            this.field2039 = arg1.method2240((byte) -3, false);
        }
        if (arg1.field5189 != null && class254.method1723(arg2, 28510, this.field2120)) {
            this.field2050 = arg1.method2245((byte) -115);
        }
        if (arg1.field5178 != null && class594.method3400(this.field2120, (byte) 32, arg2)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field2052; var36++) {
                int var40 = arg1.field5178[var8[var36]];
                if (var40 >= 0) {
                    if (var40 > var34) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field2054 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field2054[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field2052; var38++) {
                int var39 = arg1.field5178[var8[var38]];
                if (var39 >= 0) {
                    this.field2054[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "ia", descriptor = "(SS)V", line = 3610)
    public final void method1018(short arg0, short arg1) {
        field2015++;
        for (int var3 = 0; var3 < this.field2052; var3++) {
            if (this.field2113[var3] == arg0) {
                this.field2113[var3] = arg1;
            }
        }
        if (this.field2020 != null) {
            for (int var4 = 0; var4 < this.field2080; var4++) {
                class683 var5 = this.field2020[var4];
                class628 var6 = this.field2112[var4];
                var6.field8809 = var6.field8809 & 0xFF000000 | class510.field7397[this.field2113[var5.field9667] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field2063 != null) {
            this.field2063.field7210 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 3655)
    public final void method1019(int arg0) {
        field2033++;
        int var2 = class582.field8226[arg0];
        int var3 = class582.field8230[arg0];
        for (int var4 = 0; var4 < this.field2042; var4++) {
            int var5 = this.field2070[var4] * var2 + this.field2026[var4] * var3 >> 14;
            this.field2070[var4] = this.field2070[var4] * var3 - (this.field2026[var4] * var2) >> 14;
            this.field2026[var4] = var5;
        }
        this.field2096 = false;
        if (this.field2046 != null) {
            this.field2046.field7210 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "()[Lou;", line = 3685)
    public final class157[] method1020() {
        field2045++;
        return this.field2099;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILnj;)V", line = 3697)
    private final void method1021(int arg0, class711 arg1) {
        if (this.field2057 > this.field2040.field2908.length) {
            this.field2040.field2908 = new int[this.field2057];
            this.field2040.field2904 = new int[this.field2057];
        }
        field2032++;
        int[] var3 = this.field2040.field2908;
        int[] var4 = this.field2040.field2904;
        for (int var5 = arg0; var5 < this.field2042; var5++) {
            int var16 = (this.field2026[var5] - (this.field2068[var5] * this.field2040.field2881 >> 8) >> this.field2040.field2756) - arg1.field10013;
            int var17 = (this.field2070[var5] - (this.field2068[var5] * this.field2040.field2829 >> 8) >> this.field2040.field2756) - arg1.field10003;
            int var18 = this.field2122[var5];
            int var19 = this.field2122[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field2110[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field2114; var6++) {
            if (this.field2041 == null || this.field2041[var6] <= 128) {
                short var7 = this.field2008[var6];
                short var8 = this.field2012[var6];
                short var9 = this.field2005[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13))) > 0) {
                    arg1.method3936(var13, var15, var11, var12, var14, (byte) -88, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "()V", line = 3786)
    public final void method1022() {
        field2011++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILtc;ZII)Z", line = 3795)
    public final boolean method1023(int arg0, int arg1, class73 arg2, boolean arg3, int arg4, int arg5) {
        field2087++;
        return this.method1001(arg1, arg2, arg5, arg3, arg0, arg4, 124);
    }

    @OriginalMember(owner = "client!vo", name = "RA", descriptor = "()I", line = 3803)
    public final int method1024() {
        if (!this.field2096) {
            this.method1055(-108);
        }
        field2019++;
        return this.field2038;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BIZ)Lka;", line = 3819)
    public final class282 method1025(byte arg0, int arg1, boolean arg2) {
        field2006++;
        class129 var4;
        class129 var5;
        if (arg0 == 1) {
            var4 = this.field2040.field2845;
            var5 = this.field2040.field2836;
        } else if (arg0 == 2) {
            var5 = this.field2040.field2843;
            var4 = this.field2040.field2889;
        } else if (arg0 == 3) {
            var5 = this.field2040.field2798;
            var4 = this.field2040.field2865;
        } else if (arg0 == 4) {
            var4 = this.field2040.field2880;
            var5 = this.field2040.field2812;
        } else if (arg0 == 5) {
            var5 = this.field2040.field2891;
            var4 = this.field2040.field2849;
        } else {
            var5 = var4 = new class129(this.field2040);
        }
        return this.method1017(7, var4, arg0 != 0, arg1, arg2, var5);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ltc;Lqw;II)V", line = 3867)
    public final void method1026(class73 arg0, class385 arg1, int arg2, int arg3) {
        field2106++;
        if (this.field2057 == 0) {
            return;
        }
        class174 var5 = this.field2040.field2786;
        class174 var6 = (class174) arg0;
        if (!this.field2096) {
            this.method1055(97);
        }
        class25.field257 = var5.field2965 * var6.field2991 + var5.field2991 * var6.field2976 + var5.field2988 * var6.field2985;
        class281.field4365 = var5.field2965 * var6.field2978 + var5.field2991 * var6.field2992 + var5.field2988 * var6.field2982 + var5.field2978;
        float var7 = (float) this.field2119 * class25.field257 + class281.field4365;
        float var8 = (float) this.field2027 * class25.field257 + class281.field4365;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field2092 + var7;
            var10 = var8 - (float) this.field2092;
        } else {
            var10 = (float) (-this.field2092) + var7;
            var9 = (float) this.field2092 + var8;
        }
        if ((var10 >= this.field2040.field2862) || ((float) this.field2040.field2819 >= var9)) {
            return;
        }
        class207.field3467 = var5.field2964 * var6.field2978 + var5.field2985 * var6.field2992 + var5.field2969 * var6.field2982 + var5.field2982;
        class413.field6088 = var5.field2964 * var6.field2991 + var5.field2985 * var6.field2976 + var5.field2969 * var6.field2985;
        float var11 = (float) this.field2119 * class413.field6088 + class207.field3467;
        float var12 = (float) this.field2027 * class413.field6088 + class207.field3467;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) (-this.field2092) + var12) * (float) this.field2040.field2873;
            var14 = ((float) this.field2092 + var11) * (float) this.field2040.field2873;
        } else {
            var13 = (var11 - (float) this.field2092) * (float) this.field2040.field2873;
            var14 = ((float) this.field2092 + var12) * (float) this.field2040.field2873;
        }
        if ((this.field2040.field2838 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field2040.field2887)) {
            return;
        }
        class203.field3432 = var5.field2995 * var6.field2978 + var5.field2994 * var6.field2982 + var5.field2976 * var6.field2992 + var5.field2992;
        class193.field3345 = var5.field2995 * var6.field2991 + var5.field2994 * var6.field2985 + var5.field2976 * var6.field2976;
        float var15 = (float) this.field2119 * class193.field3345 + class203.field3432;
        float var16 = (float) this.field2027 * class193.field3345 + class203.field3432;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = ((float) this.field2092 + var15) * (float) this.field2040.field2832;
            var17 = (var16 - (float) this.field2092) * (float) this.field2040.field2832;
        } else {
            var17 = (var15 - (float) this.field2092) * (float) this.field2040.field2832;
            var18 = ((float) this.field2092 + var16) * (float) this.field2040.field2832;
        }
        if ((var17 / (float) arg2 >= this.field2040.field2828) || (this.field2040.field2897 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field2020 != null) {
            class79.field1159 = var5.field2964 * var6.field2965 + var5.field2985 * var6.field2995 + var5.field2969 * var6.field2964;
            class544.field7777 = var5.field2995 * var6.field2988 + var5.field2994 * var6.field2969 + var5.field2976 * var6.field2994;
            class569.field8083 = var5.field2964 * var6.field2988 + var5.field2985 * var6.field2994 + var5.field2969 * var6.field2969;
            class734.field10339 = var5.field2995 * var6.field2965 + var5.field2994 * var6.field2964 + var5.field2976 * var6.field2995;
            class266.field4130 = var5.field2965 * var6.field2965 + var5.field2991 * var6.field2995 + var5.field2988 * var6.field2964;
            class624.field8746 = var5.field2965 * var6.field2988 + var5.field2991 * var6.field2994 + var5.field2988 * var6.field2969;
        }
        if (arg1 != null) {
            int var19 = this.field2088 + this.field2038 >> 1;
            int var20 = this.field2036 + this.field2029 >> 1;
            int var21 = (int) ((float) var20 * class79.field1159 + (float) this.field2119 * class413.field6088 + (float) var19 * class569.field8083 + class207.field3467);
            int var22 = (int) ((float) var20 * class734.field10339 + (float) this.field2119 * class193.field3345 + (float) var19 * class544.field7777 + class203.field3432);
            int var23 = (int) ((float) var20 * class266.field4130 + (float) this.field2119 * class25.field257 + (float) var19 * class624.field8746 + class281.field4365);
            int var24 = (int) ((float) var20 * class79.field1159 + (float) this.field2027 * class413.field6088 + (float) var19 * class569.field8083 + class207.field3467);
            int var25 = (int) ((float) var20 * class734.field10339 + (float) this.field2027 * class193.field3345 + (float) var19 * class544.field7777 + class203.field3432);
            arg1.field5764 = this.field2040.field2873 * var21 / arg2 + this.field2040.field2811;
            arg1.field5766 = this.field2040.field2832 * var22 / arg2 + this.field2040.field2830;
            arg1.field5765 = this.field2040.field2832 * var25 / arg2 + this.field2040.field2830;
            int var26 = (int) ((float) var20 * class266.field4130 + (float) this.field2027 * class25.field257 + (float) var19 * class624.field8746 + class281.field4365);
            arg1.field5767 = this.field2040.field2873 * var24 / arg2 + this.field2040.field2811;
            if (var23 >= this.field2040.field2819 || this.field2040.field2819 <= var26) {
                arg1.field5769 = (this.field2092 + var21) * this.field2040.field2873 / arg2 + this.field2040.field2811 - arg1.field5764;
                arg1.field5768 = true;
            }
        }
        this.field2040.method1316((byte) -127, (float) arg2);
        this.field2040.method1309(25508);
        this.field2040.method1294(var6, 16670);
        this.method1034(3);
        this.field2040.method1245(false);
        this.method1053(true);
    }

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "(I)V", line = 4017)
    public final void method1027(int arg0) {
        field2059++;
        int var2 = class582.field8226[arg0];
        int var3 = class582.field8230[arg0];
        for (int var4 = 0; var4 < this.field2042; var4++) {
            int var7 = this.field2070[var4] * var2 + this.field2026[var4] * var3 >> 14;
            this.field2070[var4] = this.field2070[var4] * var3 - (this.field2026[var4] * var2) >> 14;
            this.field2026[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field2057; var5++) {
            int var6 = this.field2109[var5] * var3 + this.field2010[var5] * var2 >> 14;
            this.field2010[var5] = (short) (this.field2010[var5] * var3 - (this.field2109[var5] * var2) >> 14);
            this.field2109[var5] = (short) var6;
        }
        if (this.field2102 == null && this.field2063 != null) {
            this.field2063.field7210 = null;
        }
        if (this.field2102 != null) {
            this.field2102.field7210 = null;
        }
        this.field2096 = false;
        if (this.field2046 != null) {
            this.field2046.field7210 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ltc;)V", line = 4067)
    public final void method1028(class73 arg0) {
        field2075++;
        class174 var2 = (class174) arg0;
        if (this.field2099 != null) {
            for (int var3 = 0; var3 < this.field2099.length; var3++) {
                class157 var4 = this.field2099[var3];
                class157 var5 = var4;
                if (var4.field2428 != null) {
                    var5 = var4.field2428;
                }
                var5.field2438 = (int) ((float) this.field2070[var4.field2444] * var2.field2964 + (float) this.field2068[var4.field2444] * var2.field2985 + (float) this.field2026[var4.field2444] * var2.field2969 + var2.field2982);
                var5.field2431 = (int) ((float) this.field2070[var4.field2444] * var2.field2995 + (float) this.field2068[var4.field2444] * var2.field2976 + (float) this.field2026[var4.field2444] * var2.field2994 + var2.field2992);
                var5.field2445 = (int) ((float) this.field2070[var4.field2444] * var2.field2965 + (float) this.field2068[var4.field2444] * var2.field2991 + (float) this.field2026[var4.field2444] * var2.field2988 + var2.field2978);
                var5.field2443 = (int) ((float) this.field2070[var4.field2432] * var2.field2964 + (float) this.field2068[var4.field2432] * var2.field2985 + (float) this.field2026[var4.field2432] * var2.field2969 + var2.field2982);
                var5.field2435 = (int) ((float) this.field2070[var4.field2432] * var2.field2995 + (float) this.field2068[var4.field2432] * var2.field2976 + (float) this.field2026[var4.field2432] * var2.field2994 + var2.field2992);
                var5.field2427 = (int) ((float) this.field2070[var4.field2432] * var2.field2965 + (float) this.field2068[var4.field2432] * var2.field2991 + (float) this.field2026[var4.field2432] * var2.field2988 + var2.field2978);
                var5.field2439 = (int) ((float) this.field2070[var4.field2429] * var2.field2964 + (float) this.field2068[var4.field2429] * var2.field2985 + (float) this.field2026[var4.field2429] * var2.field2969 + var2.field2982);
                var5.field2430 = (int) ((float) this.field2070[var4.field2429] * var2.field2995 + (float) this.field2068[var4.field2429] * var2.field2976 + (float) this.field2026[var4.field2429] * var2.field2994 + var2.field2992);
                var5.field2436 = (int) ((float) this.field2070[var4.field2429] * var2.field2965 + (float) this.field2068[var4.field2429] * var2.field2991 + (float) this.field2026[var4.field2429] * var2.field2988 + var2.field2978);
            }
        }
        if (this.field2058 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2058.length; var6++) {
            class158 var7 = this.field2058[var6];
            class158 var8 = var7;
            if (var7.field2450 != null) {
                var8 = var7.field2450;
            }
            if (var7.field2449 == null) {
                var7.field2449 = var2.method663();
            } else {
                var7.field2449.method673(var2);
            }
            var8.field2455 = (int) ((float) this.field2070[var7.field2451] * var2.field2964 + (float) this.field2068[var7.field2451] * var2.field2985 + (float) this.field2026[var7.field2451] * var2.field2969 + var2.field2982);
            var8.field2448 = (int) ((float) this.field2070[var7.field2451] * var2.field2995 + (float) this.field2068[var7.field2451] * var2.field2976 + (float) this.field2026[var7.field2451] * var2.field2994 + var2.field2992);
            var8.field2454 = (int) ((float) this.field2070[var7.field2451] * var2.field2965 + (float) this.field2068[var7.field2451] * var2.field2991 + (float) this.field2026[var7.field2451] * var2.field2988 + var2.field2978);
        }
    }

    @OriginalMember(owner = "client!vo", name = "aa", descriptor = "(SS)V", line = 4132)
    public final void method1029(short arg0, short arg1) {
        field2074++;
        class267 var3 = this.field2040.field7764;
        for (int var4 = 0; var4 < this.field2052; var4++) {
            if (this.field2022[var4] == arg0) {
                this.field2022[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class569 var7 = var3.method1774(125, arg0 & 0xFFFF);
            var6 = var7.field8077;
            var5 = var7.field8069;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class569 var10 = var3.method1774(82, arg1 & 0xFFFF);
            if (var10.field8058 != 0 || var10.field8066 != 0) {
                this.field2100 = true;
            }
            var8 = var10.field8069;
            var9 = var10.field8077;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field2020 != null) {
            for (int var11 = 0; var11 < this.field2080; var11++) {
                class683 var12 = this.field2020[var11];
                class628 var13 = this.field2112[var11];
                var13.field8809 = class510.field7397[this.field2113[var12.field9667] & 0xFFFF] & 0xFFFFFF | var13.field8809 & 0xFF000000;
            }
        }
        if (this.field2063 != null) {
            this.field2063.field7210 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "(IILs;Ls;III)V", line = 4212)
    public final void method1030(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6) {
        field2065++;
        if (!this.field2096) {
            this.method1055(55);
        }
        int var8 = this.field2088 + arg4;
        int var9 = this.field2038 + arg4;
        int var10 = this.field2036 + arg6;
        int var11 = arg6 + this.field2029;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field4956 <= arg2.field4958 + var9 >> arg2.field4962 || var10 < 0 || (arg2.field4958 + var11 >> arg2.field4962) >= arg2.field4960) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (var9 + arg3.field4958 >> arg3.field4962) >= arg3.field4956 || var10 < 0 || arg3.field4960 <= (arg3.field4958 + var11 >> arg3.field4962)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4962;
            int var13 = var9 + arg2.field4958 - 1 >> arg2.field4962;
            int var14 = var10 >> arg2.field4962;
            int var15 = -(-arg2.field4958 - var11) - 1 >> arg2.field4962;
            if (arg2.method2160(-114, var14, var12) == arg5 && arg2.method2160(-107, var14, var13) == arg5 && arg2.method2160(-118, var15, var12) == arg5 && arg2.method2160(-110, var15, var13) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field2042; var32++) {
                this.field2068[var32] = this.field2068[var32] + arg2.method2162(this.field2070[var32] - -arg6, 1, this.field2026[var32] + arg4) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field2119;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field2042; var17++) {
                int var18 = (this.field2068[var17] << 16) / var16;
                if (var18 < arg1) {
                    this.field2068[var17] -= -((arg2.method2162(this.field2070[var17] + arg6, 1, this.field2026[var17] + arg4) - arg5) * (arg1 - var18) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = (arg1 >> 8 & 0xFF) * 4;
            int var30 = (arg1 & 0xFFE3CD) >> 16 << 6;
            int var31 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var28 >> 1) < 0 || ((var28 >> 1) + arg4 + arg2.field4958) >= (arg2.field4956 << arg2.field4962) || (arg6 - (var29 >> 1)) < 0 || arg2.field4960 << arg2.field4962 <= (var29 >> 1) + arg2.field4958 + arg6) {
                return;
            }
            this.method1855(arg2, arg5, (byte) -116, var29, var30, arg4, var28, arg6, var31);
        } else if (arg0 == 4) {
            int var26 = this.field2027 - this.field2119;
            for (int var27 = 0; var27 < this.field2042; var27++) {
                this.field2068[var27] = this.field2068[var27] + arg3.method2162(this.field2070[var27] + arg6, 1, this.field2026[var27] + arg4) + (-arg5 - -var26);
            }
        } else if (arg0 == 5) {
            int var19 = this.field2027 - this.field2119;
            for (int var20 = 0; var20 < this.field2042; var20++) {
                int var21 = this.field2026[var20] + arg4;
                int var22 = this.field2070[var20] + arg6;
                int var23 = arg2.method2162(var22, 1, var21);
                int var24 = arg3.method2162(var22, 1, var21);
                int var25 = var23 - arg1 - var24;
                this.field2068[var20] = ((this.field2068[var20] << 8) / var19 * var25 >> 8) + var23 - arg5;
            }
        }
        if (this.field2046 != null) {
            this.field2046.field7210 = null;
        }
        this.field2096 = false;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lka;IIIZ)V", line = 4368)
    public final void method1031(class282 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2007++;
        class129 var6 = (class129) arg0;
        if (this.field2052 == 0 || var6.field2052 == 0) {
            return;
        }
        int var7 = var6.field2042;
        int[] var8 = var6.field2026;
        int[] var9 = var6.field2068;
        int[] var10 = var6.field2070;
        short[] var11 = var6.field2109;
        short[] var12 = var6.field2037;
        short[] var13 = var6.field2010;
        byte[] var14 = var6.field2089;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2091 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field2091.field7560;
            var17 = this.field2091.field7563;
            var15 = this.field2091.field7561;
            var16 = this.field2091.field7559;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2091 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field2091.field7563;
            var22 = var6.field2091.field7559;
            var20 = var6.field2091.field7561;
            var19 = var6.field2091.field7560;
        }
        int[] var23 = var6.field2122;
        short[] var24 = var6.field2110;
        if (!var6.field2096) {
            var6.method1055(74);
        }
        short var25 = var6.field2119;
        short var26 = var6.field2027;
        short var27 = var6.field2088;
        short var28 = var6.field2038;
        short var29 = var6.field2036;
        short var30 = var6.field2029;
        for (int var31 = 0; var31 < this.field2042; var31++) {
            int var32 = this.field2068[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field2026[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field2070[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2122[var31];
                        int var37 = this.field2122[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2110[var38] - 1;
                            if (var35 == -1 || this.field2089[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = -1;
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var40; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var16 == null) {
                                            this.field2091 = new class525();
                                            var16 = this.field2091.field7559 = class314.method2067(true, this.field2109);
                                            var17 = this.field2091.field7563 = class314.method2067(true, this.field2037);
                                            var18 = this.field2091.field7560 = class314.method2067(true, this.field2010);
                                            var15 = this.field2091.field7561 = class290.method1895((byte) -120, this.field2089);
                                        }
                                        if (var22 == null) {
                                            class525 var44 = var6.field2091 = new class525();
                                            var22 = var44.field7559 = class314.method2067(true, var11);
                                            var21 = var44.field7563 = class314.method2067(true, var12);
                                            var19 = var44.field7560 = class314.method2067(true, var13);
                                            var20 = var44.field7561 = class290.method1895((byte) -120, var14);
                                        }
                                        short var45 = this.field2109[var35];
                                        short var46 = this.field2037[var35];
                                        short var47 = this.field2010[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field2089[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var22[var52] += var45;
                                                var21[var52] += var46;
                                                var19[var52] += var47;
                                                var20[var52] += var49;
                                            }
                                        }
                                        short var53 = var13[var41];
                                        int var54 = this.field2122[var31];
                                        short var55 = var12[var41];
                                        short var56 = var11[var41];
                                        int var57 = this.field2122[var31 + 1];
                                        byte var58 = var14[var41];
                                        for (int var59 = var54; var59 < var57; var59++) {
                                            int var60 = this.field2110[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var16[var60] += var56;
                                                var17[var60] += var55;
                                                var18[var60] += var53;
                                                var15[var60] += var58;
                                            }
                                        }
                                        if (this.field2102 == null && this.field2063 != null) {
                                            this.field2063.field7210 = null;
                                        }
                                        if (this.field2102 != null) {
                                            this.field2102.field7210 = null;
                                        }
                                        if (var6.field2102 == null && var6.field2063 != null) {
                                            var6.field2063.field7210 = null;
                                        }
                                        if (var6.field2102 != null) {
                                            var6.field2102.field7210 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ltc;IZ)V", line = 4638)
    public final void method1032(class73 arg0, int arg1, boolean arg2) {
        field2061++;
        if (this.field2082 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field2042; var5++) {
            if ((arg1 & this.field2082[var5]) != 0) {
                if (arg2) {
                    arg0.method662(this.field2026[var5], this.field2068[var5], this.field2070[var5], var4);
                } else {
                    arg0.method665(this.field2026[var5], this.field2068[var5], this.field2070[var5], var4);
                }
                this.field2026[var5] = var4[0];
                this.field2068[var5] = var4[1];
                this.field2070[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "fa", descriptor = "()I", line = 4670)
    public final int method1033() {
        field2028++;
        if (!this.field2096) {
            this.method1055(56);
        }
        return this.field2119;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V", line = 4682)
    private final void method1034(int arg0) {
        if (arg0 != 3) {
            this.method1027(69);
        }
        field2095++;
        if (this.field2114 == 0) {
            return;
        }
        if (this.field2108 != 0) {
            this.method1015(true, -109);
        }
        this.method1015(false, -105);
        if (this.field2000 != null) {
            if (this.field2000.field9532 == null) {
                this.method1058((this.field2108 & 0x10) != 0, (byte) 122);
            }
            if (this.field2000.field9532 != null) {
                this.field2040.method1284(this.field2102 != null, 5890);
                this.field2040.method1329(this.field2102, this.field2063, this.field2086, this.field2046, 59);
                int var2 = this.field2034.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field2034[var3];
                    int var5 = this.field2034[var3 + 1];
                    int var6 = this.field2022[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field2040.method1312(var6, (byte) 127, this.field2102 != null);
                    this.field2040.method1315(var4 * 3, true, 4, (var5 - var4) * 3, this.field2000.field9532);
                }
            }
        }
        this.method1012(-126);
    }

    @OriginalMember(owner = "client!vo", name = "WA", descriptor = "()I", line = 4747)
    public final int method1035() {
        field1998++;
        return this.field2025;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "()[Lsn;", line = 4766)
    public final class158[] method1036() {
        field2053++;
        return this.field2058;
    }

    @OriginalMember(owner = "client!vo", name = "wa", descriptor = "()V", line = 4774)
    public final void method1037() {
        for (int var1 = 0; var1 < this.field2014; var1++) {
            this.field2026[var1] = this.field2026[var1] + 7 >> 4;
            this.field2068[var1] = this.field2068[var1] + 7 >> 4;
            this.field2070[var1] = this.field2070[var1] + 7 >> 4;
        }
        field2084++;
        this.field2096 = false;
        if (this.field2046 != null) {
            this.field2046.field7210 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIFZIIJIFLb;)S", line = 4798)
    private final short method1038(int arg0, int arg1, float arg2, boolean arg3, int arg4, int arg5, long arg6, int arg7, float arg8, class352 arg9) {
        field2103++;
        int var12 = this.field2122[arg0];
        int var13 = this.field2122[arg0 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field2110[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class594.field8339[var15] == arg6) {
                return (short) (var16 - 1);
            }
        }
        if (!arg3) {
            this.field2017 = null;
        }
        this.field2110[var14] = (short) (this.field2057 + 1);
        class594.field8339[var14] = arg6;
        this.field2109[this.field2057] = (short) arg1;
        this.field2037[this.field2057] = (short) arg5;
        this.field2010[this.field2057] = (short) arg7;
        this.field2089[this.field2057] = (byte) arg4;
        this.field2002[this.field2057] = arg2;
        this.field2017[this.field2057] = arg8;
        return (short) (this.field2057++);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBIIIIIII)Z", line = 4846)
    public static final boolean method1039(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2056++;
        if (!class753.method4195(arg0, arg7, (byte) 92, arg3)) {
            return false;
        }
        int var10 = client.field6497[1];
        int var11 = client.field6497[0];
        int var12 = client.field6497[2];
        if (!class753.method4195(arg6, arg1, (byte) 92, arg9)) {
            return false;
        }
        int var13 = client.field6497[1];
        int var14 = client.field6497[0];
        int var15 = client.field6497[2];
        if (!class753.method4195(arg4, arg5, (byte) 111, arg8)) {
            return false;
        }
        if (arg2 >= -11) {
            method1039(-37, 15, (byte) 30, 106, -1, -88, 89, 28, 32, 29);
        }
        int var16 = client.field6497[0];
        int var17 = client.field6497[2];
        int var18 = client.field6497[1];
        return class641.method3623(var10, var13, var12, -13509, var18, var16, var17, var14, var11, var15);
    }

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "(IIII)V", line = 4885)
    public final void method1040(int arg0, int arg1, int arg2, int arg3) {
        field2044++;
        if (arg0 == 0) {
            class251.field3992 = 0;
            class358.field5406 = 0;
            class601.field8489 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field2042; var6++) {
                class358.field5406 += this.field2026[var6];
                class601.field8489 += this.field2068[var6];
                var5++;
                class251.field3992 += this.field2070[var6];
            }
            if (var5 <= 0) {
                class601.field8489 = arg2;
                class251.field3992 = arg3;
                class358.field5406 = arg1;
            } else {
                class601.field8489 = class601.field8489 / var5 + arg2;
                class251.field3992 = class251.field3992 / var5 + arg3;
                class358.field5406 = class358.field5406 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2042; var7++) {
                this.field2026[var7] += arg1;
                this.field2068[var7] += arg2;
                this.field2070[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2042; var8++) {
                this.field2026[var8] -= class358.field5406;
                this.field2068[var8] -= class601.field8489;
                this.field2070[var8] -= class251.field3992;
                if (arg3 != 0) {
                    int var9 = class582.field8226[arg3];
                    int var10 = class582.field8230[arg3];
                    int var11 = this.field2026[var8] * var10 + this.field2068[var8] * var9 + 16383 >> 14;
                    this.field2068[var8] = this.field2068[var8] * var10 + (16383 - (this.field2026[var8] * var9)) >> 14;
                    this.field2026[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class582.field8226[arg1];
                    int var13 = class582.field8230[arg1];
                    int var14 = this.field2068[var8] * var13 + 16383 - (this.field2070[var8] * var12) >> 14;
                    this.field2070[var8] = this.field2070[var8] * var13 + this.field2068[var8] * var12 + 16383 >> 14;
                    this.field2068[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class582.field8226[arg2];
                    int var16 = class582.field8230[arg2];
                    int var17 = this.field2026[var8] * var16 + this.field2070[var8] * var15 + 16383 >> 14;
                    this.field2070[var8] = this.field2070[var8] * var16 + 16383 - (this.field2026[var8] * var15) >> 14;
                    this.field2026[var8] = var17;
                }
                this.field2026[var8] += class358.field5406;
                this.field2068[var8] += class601.field8489;
                this.field2070[var8] += class251.field3992;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2042; var18++) {
                this.field2026[var18] -= class358.field5406;
                this.field2068[var18] -= class601.field8489;
                this.field2070[var18] -= class251.field3992;
                this.field2026[var18] = this.field2026[var18] * arg1 / 128;
                this.field2068[var18] = this.field2068[var18] * arg2 / 128;
                this.field2070[var18] = this.field2070[var18] * arg3 / 128;
                this.field2026[var18] += class358.field5406;
                this.field2068[var18] += class601.field8489;
                this.field2070[var18] += class251.field3992;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2052; var19++) {
                int var23 = (this.field2041[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field2041[var19] = (byte) var23;
            }
            if (this.field2063 != null) {
                this.field2063.field7210 = null;
            }
            if (this.field2020 != null) {
                for (int var20 = 0; var20 < this.field2080; var20++) {
                    class683 var21 = this.field2020[var20];
                    class628 var22 = this.field2112[var20];
                    var22.field8809 = 255 - (this.field2041[var21.field9667] & 0xFF) << 24 | var22.field8809 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field2052; var24++) {
                int var28 = this.field2113[var24] & 0xFFFF;
                int var29 = (var28 & 0xFDB6) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg2 / 4 + var30;
                int var32 = var28 & 0x7F;
                int var33 = var29 + arg1 & 0x3F;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field2113[var24] = (short) class112.method903(class112.method903(var31 << 7, var33 << 10), var34);
            }
            if (this.field2063 != null) {
                this.field2063.field7210 = null;
            }
            if (this.field2020 != null) {
                for (int var25 = 0; var25 < this.field2080; var25++) {
                    class683 var26 = this.field2020[var25];
                    class628 var27 = this.field2112[var25];
                    var27.field8809 = class510.field7397[this.field2113[var26.field9667] & 0xFFFF] & 0xFFFFFF | var27.field8809 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field2080; var35++) {
                class628 var36 = this.field2112[var35];
                var36.field8811 += arg1;
                var36.field8813 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field2080; var37++) {
                class628 var38 = this.field2112[var37];
                var38.field8812 = var38.field8812 * arg2 >> 7;
                var38.field8810 = var38.field8810 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field2080; var39++) {
                class628 var40 = this.field2112[var39];
                var40.field8807 = var40.field8807 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ISBBI)I", line = 5189)
    private final int method1041(int arg0, short arg1, byte arg2, byte arg3, int arg4) {
        field2030++;
        if (arg2 != 43) {
            this.field2110 = null;
        }
        int var6 = class510.field7397[class487.method2963(arg4, -125, arg0)];
        if (arg1 != -1) {
            class569 var7 = this.field2040.field7764.method1774(76, arg1 & 0xFFFF);
            int var8 = var7.field8069 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg4 < 0) {
                    var9 = 0;
                } else if (arg4 <= 127) {
                    var9 = arg4 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field8077 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = ((var13 & 0xA00FF00) << 8) + ((var14 & 0xFF00) + (var15 >> 8));
            }
        }
        return (var6 << 8) + 255 - (arg3 & 0xFF);
    }

    @OriginalMember(owner = "client!vo", name = "FA", descriptor = "(I)V", line = 5262)
    public final void method1042(int arg0) {
        field2051++;
        int var2 = class582.field8226[arg0];
        int var3 = class582.field8230[arg0];
        for (int var4 = 0; var4 < this.field2042; var4++) {
            int var5 = this.field2068[var4] * var3 - (this.field2070[var4] * var2) >> 14;
            this.field2070[var4] = this.field2070[var4] * var3 + this.field2068[var4] * var2 >> 14;
            this.field2068[var4] = var5;
        }
        this.field2096 = false;
        if (this.field2046 != null) {
            this.field2046.field7210 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljf;)V", line = 5295)
    public static final void method1043(class639 arg0) {
        if (class145.field2253 >= 65535) {
            return;
        }
        class759 var1 = arg0.field8979;
        class96.field1422[class145.field2253] = arg0;
        class700.field9901[class145.field2253] = false;
        class145.field2253++;
        int var2 = arg0.field8965;
        if (arg0.field8985) {
            var2 = 0;
        }
        int var3 = arg0.field8965;
        if (arg0.field8975) {
            var3 = class386.field5782 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method4223((byte) -15) + class581.field8224 - var1.method4224((byte) 127) >> class662.field9425;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method4223((byte) -30) + var1.method4224((byte) 127) - class581.field8224 >> class662.field9425;
            if (var7 >= class54.field870) {
                var7 = class54.field870 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field8986[var5++];
                int var10 = (var1.method4228(-116) + class581.field8224 - var1.method4224((byte) 127) >> class662.field9425) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class42.field727) {
                    var11 = class42.field727 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class324.field4792[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class324.field4792[var4][var12][var8] = var13 | (long) class145.field2253;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class324.field4792[var4][var12][var8] = var13 | (long) class145.field2253 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class324.field4792[var4][var12][var8] = var13 | (long) class145.field2253 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class324.field4792[var4][var12][var8] = var13 | (long) class145.field2253 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "ua", descriptor = "()I", line = 5388)
    public final int method1044() {
        field2003++;
        return this.field2069;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V", line = 5397)
    public static final void method1045(int arg0, int arg1) {
        if (arg0 <= 122) {
            method1039(-94, -124, (byte) -122, -8, -97, 0, -47, -65, -39, 73);
        }
        if (class377.field5674 == 1) {
            class372.field5638 = arg1;
        } else if (class377.field5674 == 2) {
            class203.field3430 = arg1;
        }
        field2085++;
    }

    @OriginalMember(owner = "client!vo", name = "LA", descriptor = "(I)V", line = 5417)
    public final void method1046(int arg0) {
        field2073++;
        this.field2090 = (short) arg0;
        if (this.field2063 != null) {
            this.field2063.field7210 = null;
        }
        if (this.field2102 != null) {
            this.field2102.field7210 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "(III)V", line = 5436)
    public final void method1047(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2042; var4++) {
            if (arg0 != 0) {
                this.field2026[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field2068[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field2070[var4] += arg2;
            }
        }
        field2121++;
        if (this.field2046 != null) {
            this.field2046.field7210 = null;
        }
        this.field2096 = false;
    }

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "()Z", line = 5476)
    public final boolean method1048() {
        field2077++;
        return this.field2031;
    }

    @OriginalMember(owner = "client!vo", name = "VA", descriptor = "(I)V", line = 5484)
    public final void method1049(int arg0) {
        field2079++;
        int var2 = class582.field8226[arg0];
        int var3 = class582.field8230[arg0];
        for (int var4 = 0; var4 < this.field2042; var4++) {
            int var5 = this.field2068[var4] * var2 + this.field2026[var4] * var3 >> 14;
            this.field2068[var4] = this.field2068[var4] * var3 - this.field2026[var4] * var2 >> 14;
            this.field2026[var4] = var5;
        }
        if (this.field2046 != null) {
            this.field2046.field7210 = null;
        }
        this.field2096 = false;
    }

    @OriginalMember(owner = "client!vo", name = "NA", descriptor = "()Z", line = 5517)
    public final boolean method1050() {
        field2107++;
        if (this.field2039 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2014; var1++) {
            this.field2026[var1] <<= 0x4;
            this.field2068[var1] <<= 0x4;
            this.field2070[var1] <<= 0x4;
        }
        class358.field5406 = 0;
        class251.field3992 = 0;
        class601.field8489 = 0;
        return true;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "()Z", line = 5545)
    public final boolean method1051() {
        field2013++;
        if (this.field2022 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field2022.length; var1++) {
            if (this.field2022[var1] != -1 && !this.field2040.field7764.method1772(-5919, this.field2022[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vo", name = "ba", descriptor = "(Lr;)Lr;", line = 5570)
    public final class706 method1052(class706 arg0) {
        field2078++;
        if (this.field2057 == 0) {
            return null;
        }
        if (!this.field2096) {
            this.method1055(112);
        }
        int var2;
        int var3;
        if (this.field2040.field2881 <= 0) {
            var2 = this.field2088 - (this.field2040.field2881 * this.field2119 >> 8) >> this.field2040.field2756;
            var3 = this.field2038 - (this.field2040.field2881 * this.field2027 >> 8) >> this.field2040.field2756;
        } else {
            var2 = this.field2088 - (this.field2040.field2881 * this.field2027 >> 8) >> this.field2040.field2756;
            var3 = this.field2038 - (this.field2040.field2881 * this.field2119 >> 8) >> this.field2040.field2756;
        }
        int var4;
        int var5;
        if (this.field2040.field2829 > 0) {
            var4 = this.field2036 - (this.field2040.field2829 * this.field2027 >> 8) >> this.field2040.field2756;
            var5 = this.field2029 - (this.field2040.field2829 * this.field2119 >> 8) >> this.field2040.field2756;
        } else {
            var4 = this.field2036 - (this.field2040.field2829 * this.field2119 >> 8) >> this.field2040.field2756;
            var5 = this.field2029 - (this.field2040.field2829 * this.field2027 >> 8) >> this.field2040.field2756;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class711 var8 = (class711) arg0;
        class711 var9;
        if (var8 != null && var8.method3941(-21017, var7, var6)) {
            var9 = var8;
            var8.method3937(-104);
        } else {
            var9 = new class711(this.field2040, var6, var7);
        }
        var9.method3939(var4, var5, 0, var2, var3);
        this.method1021(0, var9);
        return var9;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V", line = 5634)
    private final void method1053(boolean arg0) {
        field2024++;
        if (this.field2020 != null) {
            class174 var2 = this.field2040.field2753;
            this.field2040.method1243(34842);
            this.field2040.method326(!this.field2031);
            this.field2040.method1284(false, 5890);
            this.field2040.method1329(null, null, this.field2040.field2863, this.field2040.field2827, 43);
            for (int var3 = 0; var3 < this.field2080; var3++) {
                class683 var4 = this.field2020[var3];
                class628 var5 = this.field2112[var3];
                if (!var4.field9668 || !this.field2040.method1237()) {
                    float var6 = (float) (this.field2026[var4.field9666] + this.field2026[var4.field9655] + this.field2026[var4.field9663]) * 0.3333333F;
                    float var7 = (float) (this.field2068[var4.field9666] + this.field2068[var4.field9655] + this.field2068[var4.field9663]) * 0.3333333F;
                    float var8 = (float) (this.field2070[var4.field9666] + this.field2070[var4.field9655] + this.field2070[var4.field9663]) * 0.3333333F;
                    float var9 = class79.field1159 * var8 + class569.field8083 * var6 + class413.field6088 * var7 + class207.field3467;
                    float var10 = class734.field10339 * var8 + class544.field7777 * var6 + class193.field3345 * var7 + class203.field3432;
                    float var11 = class266.field4130 * var8 + class624.field8746 * var6 + class25.field257 * var7 + class281.field4365;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field9669;
                    var2.method1367(var11 * var12 - var11, var4.field9662 * var5.field8812 >> 7, 1, (float) var5.field8811 + var9 - (var9 * var12), var5.field8807, var4.field9657 * var5.field8810 >> 7, var10 * var12 + (float) var5.field8813 - var10);
                    this.field2040.method1257((byte) 88, var2);
                    int var13 = var5.field8809;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field2040.method1327(-97, var4.field9664);
                    this.field2040.method1320(var4.field9658, false);
                    this.field2040.method1252(0, 7, (byte) -86, 4);
                }
            }
            this.field2040.method326(true);
            this.field2040.method1245(false);
        }
        if (!arg0) {
            this.method1003();
        }
    }

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "()Z", line = 5695)
    public final boolean method1054() {
        field2047++;
        return this.field2100;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V", line = 5707)
    private final void method1055(int arg0) {
        field2048++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2042; var10++) {
            int var12 = this.field2026[var10];
            int var13 = this.field2068[var10];
            if (var12 < var2) {
                var2 = var12;
            }
            if (var6 < var13) {
                var6 = var13;
            }
            if (var12 > var5) {
                var5 = var12;
            }
            if (var3 > var13) {
                var3 = var13;
            }
            int var14 = this.field2070[var10];
            if (var14 > var7) {
                var7 = var14;
            }
            if (var4 > var14) {
                var4 = var14;
            }
            int var15 = var12 * var12 + var14 * var14;
            if (var8 < var15) {
                var8 = var15;
            }
            int var16 = var12 * var12 + (var14 * var14) + (var13 * var13);
            if (var9 < var16) {
                var9 = var16;
            }
        }
        this.field2119 = (short) var3;
        this.field2038 = (short) var5;
        int var11 = 60 % ((-arg0 - 10) / 52);
        this.field2088 = (short) var2;
        this.field2029 = (short) var7;
        this.field2036 = (short) var4;
        this.field2027 = (short) var6;
        this.field2092 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field2016 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field2096 = true;
    }

    @OriginalMember(owner = "client!vo", name = "da", descriptor = "()I", line = 5804)
    public final int method1056() {
        field2023++;
        return this.field2090;
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)V", line = 5815)
    public static void method1057(int arg0) {
        field2083 = null;
        field2116 = null;
        field2101 = null;
        if (arg0 != 2) {
            field2101 = null;
        }
        field2094 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V", line = 5841)
    private final void method1058(boolean arg0, byte arg1) {
        field2081++;
        if (this.field2040.field2870.field4543.length >= this.field2114 * 6) {
            this.field2040.field2870.field4534 = 0;
        } else {
            this.field2040.field2870 = new class547(this.field2114 * 6 + 600);
        }
        if (arg1 < 61) {
            return;
        }
        class547 var3 = this.field2040.field2870;
        if (this.field2040.field2796) {
            for (int var4 = 0; var4 < this.field2114; var4++) {
                var3.method1939(this.field2008[var4], 1134947720);
                var3.method1939(this.field2012[var4], 1134947720);
                var3.method1939(this.field2005[var4], 1134947720);
            }
        } else {
            for (int var5 = 0; var5 < this.field2114; var5++) {
                var3.method1969(this.field2008[var5], (byte) -100);
                var3.method1969(this.field2012[var5], (byte) -100);
                var3.method1969(this.field2005[var5], (byte) -100);
            }
        }
        if (var3.field4534 == 0) {
            return;
        }
        if (arg0) {
            if (this.field2115 == null) {
                this.field2115 = this.field2040.method1302(var3.field4543, (byte) -14, true, 5123, var3.field4534);
            } else {
                this.field2115.method1409(var3.field4543, var3.field4534, 5123, true);
            }
            this.field2000.field9532 = this.field2115;
        } else {
            this.field2000.field9532 = this.field2040.method1302(var3.field4543, (byte) -14, false, 5123, var3.field4534);
        }
        if (!arg0) {
            this.field2076 = true;
        }
    }
}
