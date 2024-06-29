import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class130 extends class320 {

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "B")
    public byte field2072 = 0;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Z")
    private boolean field2067 = false;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public int field2083 = 0;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public int field2053 = 0;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "[I")
    public int[] field2061;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "[I")
    public int[] field2092;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "[I")
    public int[] field2062;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "[I")
    public int[] field2093;

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "[I")
    public int[] field2098;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "[I")
    public int[] field2057;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "[I")
    public int[] field2070;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[B")
    public byte[] field2055;

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "[B")
    public byte[] field2097;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "[B")
    public byte[] field2078;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "[S")
    public short[] field2060;

    @OriginalMember(owner = "client!qa", name = "ib", descriptor = "[S")
    public short[] field2101;

    @OriginalMember(owner = "client!qa", name = "jb", descriptor = "[B")
    public byte[] field2102;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "[I")
    public int[] field2085;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "[B")
    public byte[] field2079;

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "[S")
    public short[] field2099;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "[S")
    public short[] field2082;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "[S")
    public short[] field2056;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "[S")
    public short[] field2091;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "[S")
    public short[] field2066;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "[S")
    public short[] field2071;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "[B")
    public byte[] field2075;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "[B")
    public byte[] field2089;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "[B")
    public byte[] field2096;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "[B")
    public byte[] field2088;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[B")
    public byte[] field2059;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "[S")
    public short[] field2080;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "[S")
    public short[] field2095;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "[[I")
    public int[][] field2077;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "[[I")
    public int[][] field2054;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "[Lej;")
    public class160[] field2058;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "[Lm;")
    public class48[] field2076;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "[Lej;")
    public class160[] field2081;

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "S")
    public short field2103;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "S")
    public short field2073;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "[I")
    private static int[] field2063 = new int[10000];

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "[I")
    private static int[] field2074 = new int[10000];

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "[I")
    private static int[] field2090 = class174.field2732;

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "I")
    private static int field2100 = 0;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "[I")
    private static int[] field2094 = class174.field2731;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "S")
    private short field2064;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "S")
    private short field2065;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "S")
    private short field2069;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "S")
    private short field2084;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "S")
    private short field2086;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "S")
    private short field2087;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V", line = 8)
    public final void method964() {
        for (int var1 = 0; var1 < this.field2053; var1++) {
            this.field2061[var1] = -this.field2061[var1];
            this.field2062[var1] = -this.field2062[var1];
        }
        this.method996();
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()V", line = 22)
    public final void method965() {
        for (int var1 = 0; var1 < this.field2053; var1++) {
            int var2 = this.field2061[var1];
            this.field2061[var1] = this.field2062[var1];
            this.field2062[var1] = -var2;
        }
        this.method996();
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)I", line = 41)
    public final int method966(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2053; var4++) {
            if (this.field2061[var4] == arg0 && this.field2092[var4] == arg1 && this.field2062[var4] == arg2) {
                return var4;
            }
        }
        this.field2061[this.field2053] = arg0;
        this.field2092[this.field2053] = arg1;
        this.field2062[this.field2053] = arg2;
        return this.field2053++;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()Lqa;", line = 58)
    public final class130 method967() {
        class130 var1 = new class130();
        if (this.field2055 != null) {
            var1.field2055 = new byte[this.field2083];
            for (int var2 = 0; var2 < this.field2083; var2++) {
                var1.field2055[var2] = this.field2055[var2];
            }
        }
        var1.field2053 = this.field2053;
        var1.field2083 = this.field2083;
        var1.field2068 = this.field2068;
        var1.field2061 = this.field2061;
        var1.field2092 = this.field2092;
        var1.field2062 = this.field2062;
        var1.field2098 = this.field2098;
        var1.field2057 = this.field2057;
        var1.field2070 = this.field2070;
        var1.field2097 = this.field2097;
        var1.field2078 = this.field2078;
        var1.field2102 = this.field2102;
        var1.field2060 = this.field2060;
        var1.field2101 = this.field2101;
        var1.field2072 = this.field2072;
        var1.field2079 = this.field2079;
        var1.field2099 = this.field2099;
        var1.field2082 = this.field2082;
        var1.field2056 = this.field2056;
        var1.field2091 = this.field2091;
        var1.field2066 = this.field2066;
        var1.field2071 = this.field2071;
        var1.field2075 = this.field2075;
        var1.field2089 = this.field2089;
        var1.field2096 = this.field2096;
        var1.field2088 = this.field2088;
        var1.field2059 = this.field2059;
        var1.field2093 = this.field2093;
        var1.field2085 = this.field2085;
        var1.field2077 = this.field2077;
        var1.field2054 = this.field2054;
        var1.field2058 = this.field2058;
        var1.field2076 = this.field2076;
        var1.field2103 = this.field2103;
        var1.field2073 = this.field2073;
        return var1;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(III)V", line = 113)
    public final void method968(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2094[arg2];
            int var5 = field2090[arg2];
            for (int var6 = 0; var6 < this.field2053; var6++) {
                int var7 = this.field2092[var6] * var4 + this.field2061[var6] * var5 >> 16;
                this.field2092[var6] = this.field2092[var6] * var5 - this.field2061[var6] * var4 >> 16;
                this.field2061[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2094[arg0];
            int var9 = field2090[arg0];
            for (int var10 = 0; var10 < this.field2053; var10++) {
                int var11 = this.field2092[var10] * var9 - this.field2062[var10] * var8 >> 16;
                this.field2062[var10] = this.field2092[var10] * var8 + this.field2062[var10] * var9 >> 16;
                this.field2092[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2094[arg1];
        int var13 = field2090[arg1];
        for (int var14 = 0; var14 < this.field2053; var14++) {
            int var15 = this.field2062[var14] * var12 + this.field2061[var14] * var13 >> 16;
            this.field2062[var14] = this.field2062[var14] * var13 - this.field2061[var14] * var12 >> 16;
            this.field2061[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lja;II)Lqa;", line = 178)
    public static final class130 method969(class64 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method467(arg2, 93, arg1);
        return var3 == null ? null : new class130(var3);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 186)
    private final void method970(int arg0) {
        int var2 = field2094[arg0];
        int var3 = field2090[arg0];
        for (int var4 = 0; var4 < this.field2053; var4++) {
            int var5 = this.field2092[var4] * var3 - this.field2062[var4] * var2 >> 16;
            this.field2062[var4] = this.field2092[var4] * var2 + this.field2062[var4] * var3 >> 16;
            this.field2092[var4] = var5;
        }
        this.method996();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(SS)V", line = 210)
    public final void method971(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2083; var3++) {
            if (this.field2060[var3] == arg0) {
                this.field2060[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqa;IS)I", line = 222)
    private final int method972(class130 arg0, int arg1, short arg2) {
        int var4 = arg0.field2061[arg1];
        int var5 = arg0.field2092[arg1];
        int var6 = arg0.field2062[arg1];
        for (int var7 = 0; var7 < this.field2053; var7++) {
            if (this.field2061[var7] == var4 && this.field2092[var7] == var5 && this.field2062[var7] == var6) {
                this.field2080[var7] |= arg2;
                return var7;
            }
        }
        this.field2061[this.field2053] = var4;
        this.field2092[this.field2053] = var5;
        this.field2062[this.field2053] = var6;
        this.field2080[this.field2053] = arg2;
        if (arg0.field2093 != null) {
            this.field2093[this.field2053] = arg0.field2093[arg1];
        }
        return this.field2053++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I", line = 252)
    public final int method207() {
        if (!this.field2067) {
            this.method992();
        }
        return this.field2065;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([B)V", line = 264)
    private final void method973(byte[] arg0) {
        class101 var2 = new class101(arg0);
        class101 var3 = new class101(arg0);
        class101 var4 = new class101(arg0);
        class101 var5 = new class101(arg0);
        class101 var6 = new class101(arg0);
        class101 var7 = new class101(arg0);
        class101 var8 = new class101(arg0);
        var2.field1667 = arg0.length - 23;
        int var9 = var2.method731(false);
        int var10 = var2.method731(false);
        int var11 = var2.method741(111);
        int var12 = var2.method741(120);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method741(39);
        int var16 = var2.method741(21);
        int var17 = var2.method741(55);
        int var18 = var2.method741(123);
        int var19 = var2.method741(111);
        int var20 = var2.method731(false);
        int var21 = var2.method731(false);
        int var22 = var2.method731(false);
        int var23 = var2.method731(false);
        int var24 = var2.method731(false);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2079 = new byte[var11];
            var2.field1667 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2079[var28] = var2.method727((byte) 118);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field2053 = var9;
        this.field2083 = var10;
        this.field2068 = var11;
        this.field2061 = new int[var9];
        this.field2092 = new int[var9];
        this.field2062 = new int[var9];
        this.field2098 = new int[var10];
        this.field2057 = new int[var10];
        this.field2070 = new int[var10];
        if (var19 == 1) {
            this.field2093 = new int[var9];
        }
        if (var13) {
            this.field2055 = new byte[var10];
        }
        if (var15 == 255) {
            this.field2097 = new byte[var10];
        } else {
            this.field2072 = (byte) var15;
        }
        if (var16 == 1) {
            this.field2078 = new byte[var10];
        }
        if (var17 == 1) {
            this.field2085 = new int[var10];
        }
        if (var18 == 1) {
            this.field2101 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field2102 = new byte[var10];
        }
        this.field2060 = new short[var10];
        if (var11 > 0) {
            this.field2099 = new short[var11];
            this.field2082 = new short[var11];
            this.field2056 = new short[var11];
            if (var26 > 0) {
                this.field2091 = new short[var26];
                this.field2066 = new short[var26];
                this.field2071 = new short[var26];
                this.field2075 = new byte[var26];
                this.field2089 = new byte[var26];
                this.field2096 = new byte[var26];
            }
            if (var27 > 0) {
                this.field2088 = new byte[var27];
                this.field2059 = new byte[var27];
            }
        }
        var2.field1667 = var11;
        var3.field1667 = var46;
        var4.field1667 = var48;
        var5.field1667 = var50;
        var6.field1667 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var70 = var2.method741(93);
            int var71 = 0;
            if ((var70 & 0x1) != 0) {
                var71 = var3.method779((byte) 101);
            }
            int var72 = 0;
            if ((var70 & 0x2) != 0) {
                var72 = var4.method779((byte) 95);
            }
            int var73 = 0;
            if ((var70 & 0x4) != 0) {
                var73 = var5.method779((byte) 103);
            }
            this.field2061[var69] = var66 + var71;
            this.field2092[var69] = var67 + var72;
            this.field2062[var69] = var68 + var73;
            var66 = this.field2061[var69];
            var67 = this.field2092[var69];
            var68 = this.field2062[var69];
            if (var19 == 1) {
                this.field2093[var69] = var6.method741(17);
            }
        }
        var2.field1667 = var44;
        var3.field1667 = var33;
        var4.field1667 = var36;
        var5.field1667 = var39;
        var6.field1667 = var37;
        var7.field1667 = var42;
        var8.field1667 = var41;
        for (int var74 = 0; var74 < var10; var74++) {
            this.field2060[var74] = (short) var2.method731(false);
            if (var13) {
                this.field2055[var74] = var3.method727((byte) 114);
            }
            if (var15 == 255) {
                this.field2097[var74] = var4.method727((byte) 120);
            }
            if (var16 == 1) {
                this.field2078[var74] = var5.method727((byte) 113);
            }
            if (var17 == 1) {
                this.field2085[var74] = var6.method741(108);
            }
            if (var18 == 1) {
                this.field2101[var74] = (short) (var7.method731(false) - 1);
            }
            if (this.field2102 != null) {
                if (this.field2101[var74] == -1) {
                    this.field2102[var74] = -1;
                } else {
                    this.field2102[var74] = (byte) (var8.method741(39) - 1);
                }
            }
        }
        var2.field1667 = var35;
        var3.field1667 = var32;
        int var75 = 0;
        int var76 = 0;
        int var77 = 0;
        int var78 = 0;
        for (int var79 = 0; var79 < var10; var79++) {
            int var80 = var3.method741(52);
            if (var80 == 1) {
                var75 = var2.method779((byte) 101) + var78;
                var76 = var2.method779((byte) 93) + var75;
                var77 = var2.method779((byte) -1) + var76;
                var78 = var77;
                this.field2098[var79] = var75;
                this.field2057[var79] = var76;
                this.field2070[var79] = var77;
            }
            if (var80 == 2) {
                var76 = var77;
                var77 = var2.method779((byte) 115) + var78;
                var78 = var77;
                this.field2098[var79] = var75;
                this.field2057[var79] = var76;
                this.field2070[var79] = var77;
            }
            if (var80 == 3) {
                var75 = var77;
                var77 = var2.method779((byte) 1) + var78;
                var78 = var77;
                this.field2098[var79] = var75;
                this.field2057[var79] = var76;
                this.field2070[var79] = var77;
            }
            if (var80 == 4) {
                int var83 = var75;
                var75 = var76;
                var76 = var83;
                var77 = var2.method779((byte) 93) + var78;
                var78 = var77;
                this.field2098[var79] = var75;
                this.field2057[var79] = var83;
                this.field2070[var79] = var77;
            }
        }
        var2.field1667 = var52;
        var3.field1667 = var54;
        var4.field1667 = var56;
        var5.field1667 = var58;
        var6.field1667 = var60;
        var7.field1667 = var62;
        for (int var84 = 0; var84 < var11; var84++) {
            int var85 = this.field2079[var84] & 0xFF;
            if (var85 == 0) {
                this.field2099[var84] = (short) var2.method731(false);
                this.field2082[var84] = (short) var2.method731(false);
                this.field2056[var84] = (short) var2.method731(false);
            }
            if (var85 == 1) {
                this.field2099[var84] = (short) var3.method731(false);
                this.field2082[var84] = (short) var3.method731(false);
                this.field2056[var84] = (short) var3.method731(false);
                this.field2091[var84] = (short) var4.method731(false);
                this.field2066[var84] = (short) var4.method731(false);
                this.field2071[var84] = (short) var4.method731(false);
                this.field2075[var84] = var5.method727((byte) 125);
                this.field2089[var84] = var6.method727((byte) 117);
                this.field2096[var84] = var7.method727((byte) 123);
            }
            if (var85 == 2) {
                this.field2099[var84] = (short) var3.method731(false);
                this.field2082[var84] = (short) var3.method731(false);
                this.field2056[var84] = (short) var3.method731(false);
                this.field2091[var84] = (short) var4.method731(false);
                this.field2066[var84] = (short) var4.method731(false);
                this.field2071[var84] = (short) var4.method731(false);
                this.field2075[var84] = var5.method727((byte) 112);
                this.field2089[var84] = var6.method727((byte) 121);
                this.field2096[var84] = var7.method727((byte) 114);
                this.field2088[var84] = var7.method727((byte) 108);
                this.field2059[var84] = var7.method727((byte) 113);
            }
            if (var85 == 3) {
                this.field2099[var84] = (short) var3.method731(false);
                this.field2082[var84] = (short) var3.method731(false);
                this.field2056[var84] = (short) var3.method731(false);
                this.field2091[var84] = (short) var4.method731(false);
                this.field2066[var84] = (short) var4.method731(false);
                this.field2071[var84] = (short) var4.method731(false);
                this.field2075[var84] = var5.method727((byte) 124);
                this.field2089[var84] = var6.method727((byte) 124);
                this.field2096[var84] = var7.method727((byte) 116);
            }
        }
        if (!var14) {
            return;
        }
        var2.field1667 = var64;
        int var86 = var2.method741(117);
        if (var86 > 0) {
            var2.field1667 += var86 * 4;
        }
        int var87 = var2.method741(114);
        if (var87 > 0) {
            var2.field1667 += var87 * 4;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([[III)I", line = 714)
    private static final int method974(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V", line = 732)
    public final void method975(int arg0) {
        int var2 = field2094[arg0];
        int var3 = field2090[arg0];
        for (int var4 = 0; var4 < this.field2053; var4++) {
            int var5 = this.field2062[var4] * var2 + this.field2061[var4] * var3 >> 16;
            this.field2062[var4] = this.field2062[var4] * var3 - this.field2061[var4] * var2 >> 16;
            this.field2061[var4] = var5;
        }
        this.method996();
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)Lfa;", line = 750)
    public final class199 method976(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class265.field4126) {
            class171 var6 = new class171(this, arg0, arg1, true);
            var6.method1258();
            return var6;
        } else {
            return new class146(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()V", line = 765)
    public final void method977() {
        for (int var1 = 0; var1 < this.field2053; var1++) {
            int var2 = this.field2062[var1];
            this.field2062[var1] = this.field2061[var1];
            this.field2061[var1] = -var2;
        }
        this.method996();
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()V", line = 779)
    public final void method978() {
        if (this.field2058 != null) {
            return;
        }
        this.field2058 = new class160[this.field2053];
        for (int var1 = 0; var1 < this.field2053; var1++) {
            this.field2058[var1] = new class160();
        }
        for (int var2 = 0; var2 < this.field2083; var2++) {
            int var3 = this.field2098[var2];
            int var4 = this.field2057[var2];
            int var5 = this.field2070[var2];
            int var6 = this.field2061[var4] - this.field2061[var3];
            int var7 = this.field2092[var4] - this.field2092[var3];
            int var8 = this.field2062[var4] - this.field2062[var3];
            int var9 = this.field2061[var5] - this.field2061[var3];
            int var10 = this.field2092[var5] - this.field2092[var3];
            int var11 = this.field2062[var5] - this.field2062[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2055 == null) {
                var19 = 0;
            } else {
                var19 = this.field2055[var2];
            }
            if (var19 == 0) {
                class160 var20 = this.field2058[var3];
                var20.field2523 += var16;
                var20.field2515 += var17;
                var20.field2520 += var18;
                var20.field2519++;
                class160 var21 = this.field2058[var4];
                var21.field2523 += var16;
                var21.field2515 += var17;
                var21.field2520 += var18;
                var21.field2519++;
                class160 var22 = this.field2058[var5];
                var22.field2523 += var16;
                var22.field2515 += var17;
                var22.field2520 += var18;
                var22.field2519++;
            } else if (var19 == 1) {
                if (this.field2076 == null) {
                    this.field2076 = new class48[this.field2083];
                }
                class48 var23 = this.field2076[var2] = new class48();
                var23.field798 = var16;
                var23.field797 = var17;
                var23.field799 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(SS)V", line = 880)
    public final void method979(short arg0, short arg1) {
        if (this.field2101 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2083; var3++) {
            if (this.field2101[var3] == arg0) {
                this.field2101[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V", line = 907)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V", line = 910)
    private final void method980(int arg0) {
        int var2 = field2094[arg0];
        int var3 = field2090[arg0];
        for (int var4 = 0; var4 < this.field2053; var4++) {
            int var5 = this.field2092[var4] * var2 + this.field2061[var4] * var3 >> 16;
            this.field2092[var4] = this.field2092[var4] * var3 - this.field2061[var4] * var2 >> 16;
            this.field2061[var4] = var5;
        }
        this.method996();
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)Lnc;", line = 931)
    public final class146 method981(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class146(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()V", line = 936)
    public static void method982() {
        field2063 = null;
        field2074 = null;
        field2094 = null;
        field2090 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z", line = 942)
    public final boolean method983() {
        return true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([[IIIIII)V", line = 950)
    private final void method984(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method974(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method974(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method974(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method974(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method970(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method980(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method987(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()V", line = 1017)
    public final void method985() {
        for (int var1 = 0; var1 < this.field2053; var1++) {
            this.field2062[var1] = -this.field2062[var1];
        }
        for (int var2 = 0; var2 < this.field2083; var2++) {
            int var3 = this.field2098[var2];
            this.field2098[var2] = this.field2070[var2];
            this.field2070[var2] = var3;
        }
        this.method996();
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 2012)
    private class130() {
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([B)V", line = 2014)
    private class130(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method973(arg0);
        } else {
            this.method994(arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(III)V", line = 2021)
    public class130(int arg0, int arg1, int arg2) {
        this.field2061 = new int[arg0];
        this.field2092 = new int[arg0];
        this.field2062 = new int[arg0];
        this.field2093 = new int[arg0];
        this.field2098 = new int[arg1];
        this.field2057 = new int[arg1];
        this.field2070 = new int[arg1];
        this.field2055 = new byte[arg1];
        this.field2097 = new byte[arg1];
        this.field2078 = new byte[arg1];
        this.field2060 = new short[arg1];
        this.field2101 = new short[arg1];
        this.field2102 = new byte[arg1];
        this.field2085 = new int[arg1];
        if (arg2 > 0) {
            this.field2079 = new byte[arg2];
            this.field2099 = new short[arg2];
            this.field2082 = new short[arg2];
            this.field2056 = new short[arg2];
            this.field2091 = new short[arg2];
            this.field2066 = new short[arg2];
            this.field2071 = new short[arg2];
            this.field2075 = new byte[arg2];
            this.field2089 = new byte[arg2];
            this.field2096 = new byte[arg2];
            this.field2088 = new byte[arg2];
            this.field2059 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([Lqa;I)V", line = 2054)
    public class130(class130[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2053 = 0;
        this.field2083 = 0;
        this.field2068 = 0;
        byte var9 = 0;
        byte var10 = 0;
        this.field2072 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class130 var12 = arg0[var11];
            if (var12 != null) {
                this.field2053 += var12.field2053;
                this.field2083 += var12.field2083;
                this.field2068 += var12.field2068;
                if (var12.field2097 == null) {
                    if (this.field2072 == -1) {
                        this.field2072 = var12.field2072;
                    }
                    if (this.field2072 != var12.field2072) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var12.field2055 != null;
                var5 |= var12.field2078 != null;
                var6 |= var12.field2085 != null;
                var7 |= var12.field2101 != null;
                var8 |= var12.field2102 != null;
            }
        }
        this.field2061 = new int[this.field2053];
        this.field2092 = new int[this.field2053];
        this.field2062 = new int[this.field2053];
        this.field2093 = new int[this.field2053];
        this.field2080 = new short[this.field2053];
        this.field2098 = new int[this.field2083];
        this.field2057 = new int[this.field2083];
        this.field2070 = new int[this.field2083];
        if (var3) {
            this.field2055 = new byte[this.field2083];
        }
        if (var4) {
            this.field2097 = new byte[this.field2083];
        }
        if (var5) {
            this.field2078 = new byte[this.field2083];
        }
        if (var6) {
            this.field2085 = new int[this.field2083];
        }
        if (var7) {
            this.field2101 = new short[this.field2083];
        }
        if (var8) {
            this.field2102 = new byte[this.field2083];
        }
        if (var9 > 0) {
        }
        if (var10 > 0) {
        }
        this.field2060 = new short[this.field2083];
        this.field2095 = new short[this.field2083];
        if (this.field2068 > 0) {
            this.field2079 = new byte[this.field2068];
            this.field2099 = new short[this.field2068];
            this.field2082 = new short[this.field2068];
            this.field2056 = new short[this.field2068];
            this.field2091 = new short[this.field2068];
            this.field2066 = new short[this.field2068];
            this.field2071 = new short[this.field2068];
            this.field2075 = new byte[this.field2068];
            this.field2089 = new byte[this.field2068];
            this.field2096 = new byte[this.field2068];
            this.field2088 = new byte[this.field2068];
            this.field2059 = new byte[this.field2068];
        }
        this.field2053 = 0;
        this.field2083 = 0;
        this.field2068 = 0;
        boolean var13 = false;
        boolean var14 = false;
        for (int var15 = 0; var15 < arg1; var15++) {
            short var16 = (short) (0x1 << var15);
            class130 var17 = arg0[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < var17.field2083; var18++) {
                    if (var3 && var17.field2055 != null) {
                        this.field2055[this.field2083] = var17.field2055[var18];
                    }
                    if (var4) {
                        if (var17.field2097 == null) {
                            this.field2097[this.field2083] = var17.field2072;
                        } else {
                            this.field2097[this.field2083] = var17.field2097[var18];
                        }
                    }
                    if (var5 && var17.field2078 != null) {
                        this.field2078[this.field2083] = var17.field2078[var18];
                    }
                    if (var6 && var17.field2085 != null) {
                        this.field2085[this.field2083] = var17.field2085[var18];
                    }
                    if (var7) {
                        if (var17.field2101 == null) {
                            this.field2101[this.field2083] = -1;
                        } else {
                            this.field2101[this.field2083] = var17.field2101[var18];
                        }
                    }
                    if (var8) {
                        if (var17.field2102 == null || var17.field2102[var18] == -1) {
                            this.field2102[this.field2083] = -1;
                        } else {
                            this.field2102[this.field2083] = (byte) (var17.field2102[var18] + this.field2068);
                        }
                    }
                    this.field2060[this.field2083] = var17.field2060[var18];
                    this.field2095[this.field2083] = var16;
                    this.field2098[this.field2083] = this.method972(var17, var17.field2098[var18], var16);
                    this.field2057[this.field2083] = this.method972(var17, var17.field2057[var18], var16);
                    this.field2070[this.field2083] = this.method972(var17, var17.field2070[var18], var16);
                    this.field2083++;
                }
                for (int var19 = 0; var19 < var17.field2068; var19++) {
                    byte var20 = this.field2079[this.field2068] = var17.field2079[var19];
                    if (var20 == 0) {
                        this.field2099[this.field2068] = (short) this.method972(var17, var17.field2099[var19], var16);
                        this.field2082[this.field2068] = (short) this.method972(var17, var17.field2082[var19], var16);
                        this.field2056[this.field2068] = (short) this.method972(var17, var17.field2056[var19], var16);
                    }
                    if (var20 >= 1 && var20 <= 3) {
                        this.field2099[this.field2068] = var17.field2099[var19];
                        this.field2082[this.field2068] = var17.field2082[var19];
                        this.field2056[this.field2068] = var17.field2056[var19];
                        this.field2091[this.field2068] = var17.field2091[var19];
                        this.field2066[this.field2068] = var17.field2066[var19];
                        this.field2071[this.field2068] = var17.field2071[var19];
                        this.field2075[this.field2068] = var17.field2075[var19];
                        this.field2089[this.field2068] = var17.field2089[var19];
                        this.field2096[this.field2068] = var17.field2096[var19];
                    }
                    if (var20 == 2) {
                        this.field2088[this.field2068] = var17.field2088[var19];
                        this.field2059[this.field2068] = var17.field2059[var19];
                    }
                    this.field2068++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lqa;ZZZZ)V", line = 2286)
    public class130(class130 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2053 = arg0.field2053;
        this.field2083 = arg0.field2083;
        this.field2068 = arg0.field2068;
        if (arg1) {
            this.field2061 = arg0.field2061;
            this.field2092 = arg0.field2092;
            this.field2062 = arg0.field2062;
        } else {
            this.field2061 = new int[this.field2053];
            this.field2092 = new int[this.field2053];
            this.field2062 = new int[this.field2053];
            for (int var6 = 0; var6 < this.field2053; var6++) {
                this.field2061[var6] = arg0.field2061[var6];
                this.field2092[var6] = arg0.field2092[var6];
                this.field2062[var6] = arg0.field2062[var6];
            }
        }
        if (arg2) {
            this.field2060 = arg0.field2060;
        } else {
            this.field2060 = new short[this.field2083];
            for (int var7 = 0; var7 < this.field2083; var7++) {
                this.field2060[var7] = arg0.field2060[var7];
            }
        }
        if (arg3 || arg0.field2101 == null) {
            this.field2101 = arg0.field2101;
        } else {
            this.field2101 = new short[this.field2083];
            for (int var8 = 0; var8 < this.field2083; var8++) {
                this.field2101[var8] = arg0.field2101[var8];
            }
        }
        if (arg4) {
            this.field2078 = arg0.field2078;
        } else {
            this.field2078 = new byte[this.field2083];
            if (arg0.field2078 == null) {
                for (int var9 = 0; var9 < this.field2083; var9++) {
                    this.field2078[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2083; var10++) {
                    this.field2078[var10] = arg0.field2078[var10];
                }
            }
        }
        this.field2098 = arg0.field2098;
        this.field2057 = arg0.field2057;
        this.field2070 = arg0.field2070;
        this.field2055 = arg0.field2055;
        this.field2097 = arg0.field2097;
        this.field2102 = arg0.field2102;
        this.field2072 = arg0.field2072;
        this.field2079 = arg0.field2079;
        this.field2099 = arg0.field2099;
        this.field2082 = arg0.field2082;
        this.field2056 = arg0.field2056;
        this.field2091 = arg0.field2091;
        this.field2066 = arg0.field2066;
        this.field2071 = arg0.field2071;
        this.field2075 = arg0.field2075;
        this.field2089 = arg0.field2089;
        this.field2096 = arg0.field2096;
        this.field2088 = arg0.field2088;
        this.field2059 = arg0.field2059;
        this.field2093 = arg0.field2093;
        this.field2085 = arg0.field2085;
        this.field2077 = arg0.field2077;
        this.field2054 = arg0.field2054;
        this.field2058 = arg0.field2058;
        this.field2076 = arg0.field2076;
        this.field2081 = arg0.field2081;
        this.field2103 = arg0.field2103;
        this.field2073 = arg0.field2073;
    }

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()V", line = 1054)
    public final void method986() {
        this.field2093 = null;
        this.field2085 = null;
        this.field2077 = (int[][]) null;
        this.field2054 = (int[][]) null;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(III)V", line = 1062)
    public final void method987(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2053; var4++) {
            this.field2061[var4] += arg0;
            this.field2092[var4] += arg1;
            this.field2062[var4] += arg2;
        }
        this.method996();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Ldg;", line = 1079)
    public final class320 method988(int arg0, int arg1, int arg2) {
        return this.method976(this.field2103, this.field2073, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldg;IIIZ)V", line = 1084)
    public final void method989(class320 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class130 var6 = (class130) arg0;
        var6.method992();
        var6.method978();
        field2100++;
        int var7 = 0;
        int[] var8 = var6.field2061;
        int var9 = var6.field2053;
        for (int var10 = 0; var10 < this.field2053; var10++) {
            class160 var11 = this.field2058[var10];
            if (var11.field2519 != 0) {
                int var12 = this.field2092[var10] - arg2;
                if (var12 >= var6.field2065 && var12 <= var6.field2064) {
                    int var13 = this.field2061[var10] - arg1;
                    if (var13 >= var6.field2086 && var13 <= var6.field2084) {
                        int var14 = this.field2062[var10] - arg3;
                        if (var14 >= var6.field2087 && var14 <= var6.field2069) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class160 var16 = var6.field2058[var15];
                                if (var8[var15] == var13 && var6.field2062[var15] == var14 && var6.field2092[var15] == var12 && var16.field2519 != 0) {
                                    if (this.field2081 == null) {
                                        this.field2081 = new class160[this.field2053];
                                    }
                                    if (var6.field2081 == null) {
                                        var6.field2081 = new class160[var9];
                                    }
                                    class160 var17 = this.field2081[var10];
                                    if (var17 == null) {
                                        var17 = this.field2081[var10] = new class160(var11);
                                    }
                                    class160 var18 = var6.field2081[var15];
                                    if (var18 == null) {
                                        var18 = var6.field2081[var15] = new class160(var16);
                                    }
                                    var17.field2523 += var16.field2523;
                                    var17.field2515 += var16.field2515;
                                    var17.field2520 += var16.field2520;
                                    var17.field2519 += var16.field2519;
                                    var18.field2523 += var11.field2523;
                                    var18.field2515 += var11.field2515;
                                    var18.field2520 += var11.field2520;
                                    var18.field2519 += var11.field2519;
                                    var7++;
                                    field2063[var10] = field2100;
                                    field2074[var15] = field2100;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field2083; var19++) {
            if (field2063[this.field2098[var19]] == field2100 && field2063[this.field2057[var19]] == field2100 && field2063[this.field2070[var19]] == field2100) {
                if (this.field2055 == null) {
                    this.field2055 = new byte[this.field2083];
                }
                this.field2055[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field2083; var20++) {
            if (field2074[var6.field2098[var20]] == field2100 && field2074[var6.field2057[var20]] == field2100 && field2074[var6.field2070[var20]] == field2100) {
                if (var6.field2055 == null) {
                    var6.field2055 = new byte[var6.field2083];
                }
                var6.field2055[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()V", line = 1205)
    public final void method990() {
        int var10002;
        if (this.field2093 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2053; var3++) {
                int var4 = this.field2093[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2077 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2077[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2053) {
                int var7 = this.field2093[var6];
                this.field2077[var7][var1[var7]++] = var6++;
            }
            this.field2093 = null;
        }
        if (this.field2085 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2083; var10++) {
            int var11 = this.field2085[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2054 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2054[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2083) {
            int var14 = this.field2085[var13];
            this.field2054[var14][var8[var14]++] = var13++;
        }
        this.field2085 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIIIZZ)Lqa;", line = 1297)
    public final class130 method991(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method992();
        int var10 = this.field2086 + arg4;
        int var11 = this.field2084 + arg4;
        int var12 = this.field2087 + arg6;
        int var13 = this.field2069 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class130 var18;
        if (arg7) {
            var18 = new class130();
            var18.field2053 = this.field2053;
            var18.field2083 = this.field2083;
            var18.field2068 = this.field2068;
            var18.field2098 = this.field2098;
            var18.field2057 = this.field2057;
            var18.field2070 = this.field2070;
            var18.field2055 = this.field2055;
            var18.field2097 = this.field2097;
            var18.field2078 = this.field2078;
            var18.field2102 = this.field2102;
            var18.field2060 = this.field2060;
            var18.field2101 = this.field2101;
            var18.field2072 = this.field2072;
            var18.field2079 = this.field2079;
            var18.field2099 = this.field2099;
            var18.field2082 = this.field2082;
            var18.field2056 = this.field2056;
            var18.field2091 = this.field2091;
            var18.field2066 = this.field2066;
            var18.field2071 = this.field2071;
            var18.field2075 = this.field2075;
            var18.field2089 = this.field2089;
            var18.field2096 = this.field2096;
            var18.field2088 = this.field2088;
            var18.field2059 = this.field2059;
            var18.field2093 = this.field2093;
            var18.field2085 = this.field2085;
            var18.field2077 = this.field2077;
            var18.field2054 = this.field2054;
            var18.field2103 = this.field2103;
            var18.field2073 = this.field2073;
            var18.field2058 = this.field2058;
            var18.field2076 = this.field2076;
            var18.field2081 = this.field2081;
            if (arg0 == 3) {
                var18.field2061 = class274.method1971(this.field2061, 0);
                var18.field2092 = class274.method1971(this.field2092, 0);
                var18.field2062 = class274.method1971(this.field2062, 0);
            } else {
                var18.field2061 = this.field2061;
                var18.field2092 = new int[var18.field2053];
                var18.field2062 = this.field2062;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2053; var19++) {
                int var20 = this.field2061[var19] + arg4;
                int var21 = this.field2062[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2092[var19] = this.field2092[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2053; var29++) {
                int var30 = (this.field2092[var29] << 16) / this.field2065;
                if (var30 < arg1) {
                    int var31 = this.field2061[var29] + arg4;
                    int var32 = this.field2062[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2092[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2092[var29];
                } else {
                    var18.field2092[var29] = this.field2092[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method984(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2064 - this.field2065;
            for (int var43 = 0; var43 < this.field2053; var43++) {
                int var44 = this.field2061[var43] + arg4;
                int var45 = this.field2062[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2092[var43] = var52 + this.field2092[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2064 - this.field2065;
            for (int var54 = 0; var54 < this.field2053; var54++) {
                int var55 = this.field2061[var54] + arg4;
                int var56 = this.field2062[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2092[var54] = ((this.field2092[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method996();
        } else {
            this.field2067 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 1563)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
    }

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V", line = 1567)
    private final void method992() {
        if (this.field2067) {
            return;
        }
        this.field2067 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2053; var7++) {
            int var8 = this.field2061[var7];
            int var9 = this.field2092[var7];
            int var10 = this.field2062[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2086 = (short) var1;
        this.field2084 = (short) var4;
        this.field2065 = (short) var2;
        this.field2064 = (short) var5;
        this.field2087 = (short) var3;
        this.field2069 = (short) var6;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(III)V", line = 1625)
    public final void method993(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2053; var4++) {
            this.field2061[var4] = this.field2061[var4] * arg0 / 128;
            this.field2092[var4] = this.field2092[var4] * arg1 / 128;
            this.field2062[var4] = this.field2062[var4] * arg2 / 128;
        }
        this.method996();
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "([B)V", line = 1640)
    private final void method994(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class101 var4 = new class101(arg0);
        class101 var5 = new class101(arg0);
        class101 var6 = new class101(arg0);
        class101 var7 = new class101(arg0);
        class101 var8 = new class101(arg0);
        var4.field1667 = arg0.length - 18;
        int var9 = var4.method731(false);
        int var10 = var4.method731(false);
        int var11 = var4.method741(30);
        int var12 = var4.method741(125);
        int var13 = var4.method741(73);
        int var14 = var4.method741(75);
        int var15 = var4.method741(122);
        int var16 = var4.method741(35);
        int var17 = var4.method731(false);
        int var18 = var4.method731(false);
        int var19 = var4.method731(false);
        int var20 = var4.method731(false);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2053 = var9;
        this.field2083 = var10;
        this.field2068 = var11;
        this.field2061 = new int[var9];
        this.field2092 = new int[var9];
        this.field2062 = new int[var9];
        this.field2098 = new int[var10];
        this.field2057 = new int[var10];
        this.field2070 = new int[var10];
        if (var11 > 0) {
            this.field2079 = new byte[var11];
            this.field2099 = new short[var11];
            this.field2082 = new short[var11];
            this.field2056 = new short[var11];
        }
        if (var16 == 1) {
            this.field2093 = new int[var9];
        }
        if (var12 == 1) {
            this.field2055 = new byte[var10];
            this.field2102 = new byte[var10];
            this.field2101 = new short[var10];
        }
        if (var13 == 255) {
            this.field2097 = new byte[var10];
        } else {
            this.field2072 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2078 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2085 = new int[var10];
        }
        this.field2060 = new short[var10];
        var4.field1667 = var21;
        var5.field1667 = var36;
        var6.field1667 = var38;
        var7.field1667 = var40;
        var8.field1667 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method741(58);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method779((byte) 92);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method779((byte) 114);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method779((byte) 91);
            }
            this.field2061[var46] = var43 + var48;
            this.field2092[var46] = var44 + var49;
            this.field2062[var46] = var45 + var50;
            var43 = this.field2061[var46];
            var44 = this.field2092[var46];
            var45 = this.field2062[var46];
            if (var16 == 1) {
                this.field2093[var46] = var8.method741(59);
            }
        }
        var4.field1667 = var32;
        var5.field1667 = var28;
        var6.field1667 = var26;
        var7.field1667 = var30;
        var8.field1667 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2060[var51] = (short) var4.method731(false);
            if (var12 == 1) {
                int var52 = var5.method741(115);
                if ((var52 & 0x1) == 1) {
                    this.field2055[var51] = 1;
                    var2 = true;
                } else {
                    this.field2055[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2102[var51] = (byte) (var52 >> 2);
                    this.field2101[var51] = this.field2060[var51];
                    this.field2060[var51] = 127;
                    if (this.field2101[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2102[var51] = -1;
                    this.field2101[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2097[var51] = var6.method727((byte) 126);
            }
            if (var14 == 1) {
                this.field2078[var51] = var7.method727((byte) 116);
            }
            if (var15 == 1) {
                this.field2085[var51] = var8.method741(94);
            }
        }
        var4.field1667 = var25;
        var5.field1667 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method741(108);
            if (var58 == 1) {
                var53 = var4.method779((byte) -29) + var56;
                var54 = var4.method779((byte) -38) + var53;
                var55 = var4.method779((byte) -13) + var54;
                var56 = var55;
                this.field2098[var57] = var53;
                this.field2057[var57] = var54;
                this.field2070[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method779((byte) 120) + var56;
                var56 = var55;
                this.field2098[var57] = var53;
                this.field2057[var57] = var54;
                this.field2070[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method779((byte) -127) + var56;
                var56 = var55;
                this.field2098[var57] = var53;
                this.field2057[var57] = var54;
                this.field2070[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method779((byte) -33) + var56;
                var56 = var55;
                this.field2098[var57] = var53;
                this.field2057[var57] = var61;
                this.field2070[var57] = var55;
            }
        }
        var4.field1667 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2079[var62] = 0;
            this.field2099[var62] = (short) var4.method731(false);
            this.field2082[var62] = (short) var4.method731(false);
            this.field2056[var62] = (short) var4.method731(false);
        }
        if (this.field2102 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2102[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2099[var65] & 0xFFFF) == this.field2098[var64] && (this.field2082[var65] & 0xFFFF) == this.field2057[var64] && (this.field2056[var65] & 0xFFFF) == this.field2070[var64]) {
                        this.field2102[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2102 = null;
            }
        }
        if (!var3) {
            this.field2101 = null;
        }
        if (!var2) {
            this.field2055 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIBSB)I", line = 1985)
    public final int method995(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2098[this.field2083] = arg0;
        this.field2057[this.field2083] = arg1;
        this.field2070[this.field2083] = arg2;
        this.field2055[this.field2083] = arg3;
        this.field2102[this.field2083] = -1;
        this.field2060[this.field2083] = arg4;
        this.field2101[this.field2083] = -1;
        this.field2078[this.field2083] = arg5;
        return this.field2083++;
    }

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()V", line = 2003)
    private final void method996() {
        this.field2058 = null;
        this.field2081 = null;
        this.field2076 = null;
        this.field2067 = false;
    }
}
