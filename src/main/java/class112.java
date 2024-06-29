import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class112 extends class122 {

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "Z")
    private boolean field2071 = false;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "B")
    public byte field2073 = 0;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
    public int field2088 = 0;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public int field2068 = 0;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!mc", name = "tb", descriptor = "[I")
    public int[] field2096;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "[I")
    public int[] field2077;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "[I")
    public int[] field2066;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "[I")
    private int[] field2090;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "[I")
    public int[] field2075;

    @OriginalMember(owner = "client!mc", name = "Fb", descriptor = "[I")
    public int[] field2108;

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "[I")
    public int[] field2082;

    @OriginalMember(owner = "client!mc", name = "ub", descriptor = "[B")
    public byte[] field2097;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "[B")
    public byte[] field2076;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "[B")
    public byte[] field2069;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "[I")
    private int[] field2065;

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "[S")
    public short[] field2087;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "[B")
    public byte[] field2083;

    @OriginalMember(owner = "client!mc", name = "Gb", descriptor = "[S")
    public short[] field2109;

    @OriginalMember(owner = "client!mc", name = "Bb", descriptor = "[B")
    public byte[] field2104;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "[S")
    public short[] field2080;

    @OriginalMember(owner = "client!mc", name = "vb", descriptor = "[S")
    public short[] field2098;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "[S")
    public short[] field2074;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "[S")
    private short[] field2079;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "[S")
    private short[] field2078;

    @OriginalMember(owner = "client!mc", name = "wb", descriptor = "[S")
    private short[] field2099;

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "[B")
    private byte[] field2092;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "[B")
    private byte[] field2063;

    @OriginalMember(owner = "client!mc", name = "rb", descriptor = "[B")
    private byte[] field2094;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "[B")
    private byte[] field2091;

    @OriginalMember(owner = "client!mc", name = "Ab", descriptor = "[B")
    private byte[] field2103;

    @OriginalMember(owner = "client!mc", name = "qb", descriptor = "[[I")
    public int[][] field2093;

    @OriginalMember(owner = "client!mc", name = "xb", descriptor = "[[I")
    public int[][] field2100;

    @OriginalMember(owner = "client!mc", name = "Cb", descriptor = "[Lkg;")
    public class98[] field2105;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "[Lge;")
    public class61[] field2085;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "[Lkg;")
    public class98[] field2070;

    @OriginalMember(owner = "client!mc", name = "Db", descriptor = "S")
    public short field2106;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "S")
    public short field2081;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "[I")
    private static int[] field2072 = class113.field2120;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "[I")
    private static int[] field2084 = class113.field2124;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "[I")
    private static int[] field2086 = new int[10000];

    @OriginalMember(owner = "client!mc", name = "yb", descriptor = "I")
    private static int field2101 = 0;

    @OriginalMember(owner = "client!mc", name = "Eb", descriptor = "[I")
    private static int[] field2107 = new int[10000];

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "S")
    private short field2064;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "S")
    private short field2067;

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "S")
    private short field2089;

    @OriginalMember(owner = "client!mc", name = "sb", descriptor = "S")
    private short field2095;

    @OriginalMember(owner = "client!mc", name = "zb", descriptor = "S")
    private short field2102;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmc;I)I")
    private final int method718(class112 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2096[arg1];
        int var5 = arg0.field2077[arg1];
        int var6 = arg0.field2066[arg1];
        for (int var7 = 0; var7 < this.field2088; ++var7) {
            if (this.field2096[var7] == var4 && this.field2077[var7] == var5 && this.field2066[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2096[this.field2088] = var4;
            this.field2077[this.field2088] = var5;
            this.field2066[this.field2088] = var6;
            if (arg0.field2090 != null) {
                this.field2090[this.field2088] = arg0.field2090[arg1];
            }
            var3 = this.field2088++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)Lsd;")
    public final class167 method719(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class167(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
    public final void method720(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2088; ++var4) {
            this.field2096[var4] = this.field2096[var4] * arg0 / 128;
            this.field2077[var4] = this.field2077[var4] * arg1 / 128;
            this.field2066[var4] = this.field2066[var4] * arg2 / 128;
        }
        this.method733();
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public final void method721(int arg0) {
        int var2 = field2084[arg0];
        int var3 = field2072[arg0];
        for (int var4 = 0; var4 < this.field2088; ++var4) {
            int var5 = this.field2096[var4] * var3 + this.field2066[var4] * var2 >> 16;
            this.field2066[var4] = this.field2066[var4] * var3 - this.field2096[var4] * var2 >> 16;
            this.field2096[var4] = var5;
        }
        this.method733();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
    public final void method722() {
        for (int var1 = 0; var1 < this.field2088; ++var1) {
            int var2 = this.field2096[var1];
            this.field2096[var1] = this.field2066[var1];
            this.field2066[var1] = -var2;
        }
        this.method733();
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()V")
    private final void method723() {
        if (!this.field2071) {
            this.field2071 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field2088; ++var7) {
                int var8 = this.field2096[var7];
                int var9 = this.field2077[var7];
                int var10 = this.field2066[var7];
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
            this.field2095 = (short) var1;
            this.field2102 = (short) var4;
            super.field2341 = (short) var2;
            this.field2089 = (short) var5;
            this.field2064 = (short) var3;
            this.field2067 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([B)V")
    private final void method724(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class114 var4 = new class114(arg0);
        class114 var5 = new class114(arg0);
        class114 var6 = new class114(arg0);
        class114 var7 = new class114(arg0);
        class114 var8 = new class114(arg0);
        var4.field2170 = arg0.length - 18;
        int var9 = var4.method762((byte) 90);
        int var10 = var4.method762((byte) 99);
        int var11 = var4.method767(true);
        int var12 = var4.method767(true);
        int var13 = var4.method767(true);
        int var14 = var4.method767(true);
        int var15 = var4.method767(true);
        int var16 = var4.method767(true);
        int var17 = var4.method762((byte) 127);
        int var18 = var4.method762((byte) 110);
        int var19 = var4.method762((byte) 108);
        int var20 = var4.method762((byte) 84);
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
        this.field2088 = var9;
        this.field2068 = var10;
        this.field2062 = var11;
        this.field2096 = new int[var9];
        this.field2077 = new int[var9];
        this.field2066 = new int[var9];
        this.field2075 = new int[var10];
        this.field2108 = new int[var10];
        this.field2082 = new int[var10];
        if (var11 > 0) {
            this.field2104 = new byte[var11];
            this.field2080 = new short[var11];
            this.field2098 = new short[var11];
            this.field2074 = new short[var11];
        }
        if (var16 == 1) {
            this.field2090 = new int[var9];
        }
        if (var12 == 1) {
            this.field2097 = new byte[var10];
            this.field2083 = new byte[var10];
            this.field2087 = new short[var10];
        }
        if (var13 == 255) {
            this.field2076 = new byte[var10];
        } else {
            this.field2073 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2069 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2065 = new int[var10];
        }
        this.field2109 = new short[var10];
        var4.field2170 = var21;
        var5.field2170 = var36;
        var6.field2170 = var38;
        var7.field2170 = var40;
        var8.field2170 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method767(true);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method794((byte) 21);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method794((byte) 21);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method794((byte) 21);
            }
            this.field2096[var46] = var43 + var63;
            this.field2077[var46] = var44 + var64;
            this.field2066[var46] = var45 + var65;
            var43 = this.field2096[var46];
            var44 = this.field2077[var46];
            var45 = this.field2066[var46];
            if (var16 == 1) {
                this.field2090[var46] = var8.method767(true);
            }
        }
        var4.field2170 = var32;
        var5.field2170 = var28;
        var6.field2170 = var26;
        var7.field2170 = var30;
        var8.field2170 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2109[var47] = (short) var4.method762((byte) 72);
            if (var12 == 1) {
                int var61 = var5.method767(true);
                if ((var61 & 1) == 1) {
                    this.field2097[var47] = 1;
                    var2 = true;
                } else {
                    this.field2097[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field2083[var47] = (byte) (var61 >> 2);
                    this.field2087[var47] = this.field2109[var47];
                    this.field2109[var47] = 127;
                    if (this.field2087[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2083[var47] = -1;
                    this.field2087[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2076[var47] = var6.method759((byte) 127);
            }
            if (var14 == 1) {
                this.field2069[var47] = var7.method759((byte) 127);
            }
            if (var15 == 1) {
                this.field2065[var47] = var8.method767(true);
            }
        }
        var4.field2170 = var25;
        var5.field2170 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method767(true);
            if (var57 == 1) {
                var48 = var4.method794((byte) 21) + var51;
                var49 = var4.method794((byte) 21) + var48;
                var50 = var4.method794((byte) 21) + var49;
                var51 = var50;
                this.field2075[var52] = var48;
                this.field2108[var52] = var49;
                this.field2082[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method794((byte) 21) + var51;
                var51 = var50;
                this.field2075[var52] = var48;
                this.field2108[var52] = var49;
                this.field2082[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method794((byte) 21) + var51;
                var51 = var50;
                this.field2075[var52] = var48;
                this.field2108[var52] = var49;
                this.field2082[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method794((byte) 21) + var51;
                var51 = var50;
                this.field2075[var52] = var48;
                this.field2108[var52] = var60;
                this.field2082[var52] = var50;
            }
        }
        var4.field2170 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2104[var53] = 0;
            this.field2080[var53] = (short) var4.method762((byte) 120);
            this.field2098[var53] = (short) var4.method762((byte) 93);
            this.field2074[var53] = (short) var4.method762((byte) 102);
        }
        if (this.field2083 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field2083[var55] & 255;
                if (var56 != 255) {
                    if ((this.field2080[var56] & 65535) == this.field2075[var55] && (this.field2098[var56] & 65535) == this.field2108[var55] && (this.field2074[var56] & 65535) == this.field2082[var55]) {
                        this.field2083[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2083 = null;
            }
        }
        if (!var3) {
            this.field2087 = null;
        }
        if (!var2) {
            this.field2097 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmc;Lmc;IIIZ)V")
    public static final void method725(class112 arg0, class112 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method723();
        arg0.method728();
        arg1.method723();
        arg1.method728();
        ++field2101;
        int var6 = 0;
        int[] var7 = arg1.field2096;
        int var8 = arg1.field2088;
        for (int var9 = 0; var9 < arg0.field2088; ++var9) {
            class98 var12 = arg0.field2105[var9];
            if (var12.field1807 != 0) {
                int var13 = arg0.field2077[var9] - arg3;
                if (var13 >= arg1.field2341 && var13 <= arg1.field2089) {
                    int var14 = arg0.field2096[var9] - arg2;
                    if (var14 >= arg1.field2095 && var14 <= arg1.field2102) {
                        int var15 = arg0.field2066[var9] - arg4;
                        if (var15 >= arg1.field2064 && var15 <= arg1.field2067) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class98 var17 = arg1.field2105[var16];
                                if (var7[var16] == var14 && arg1.field2066[var16] == var15 && arg1.field2077[var16] == var13 && var17.field1807 != 0) {
                                    if (arg0.field2070 == null) {
                                        arg0.field2070 = new class98[arg0.field2088];
                                    }
                                    if (arg1.field2070 == null) {
                                        arg1.field2070 = new class98[var8];
                                    }
                                    class98 var18 = arg0.field2070[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2070[var9] = new class98(var12);
                                    }
                                    class98 var19 = arg1.field2070[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2070[var16] = new class98(var17);
                                    }
                                    var18.field1814 += var17.field1814;
                                    var18.field1801 += var17.field1801;
                                    var18.field1817 += var17.field1817;
                                    var18.field1807 += var17.field1807;
                                    var19.field1814 += var12.field1814;
                                    var19.field1801 += var12.field1801;
                                    var19.field1817 += var12.field1817;
                                    var19.field1807 += var12.field1807;
                                    ++var6;
                                    field2086[var9] = field2101;
                                    field2107[var16] = field2101;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2068; ++var10) {
                if (field2086[arg0.field2075[var10]] == field2101 && field2086[arg0.field2108[var10]] == field2101 && field2086[arg0.field2082[var10]] == field2101) {
                    if (arg0.field2097 == null) {
                        arg0.field2097 = new byte[arg0.field2068];
                    }
                    arg0.field2097[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2068; ++var11) {
                if (field2107[arg1.field2075[var11]] == field2101 && field2107[arg1.field2108[var11]] == field2101 && field2107[arg1.field2082[var11]] == field2101) {
                    if (arg1.field2097 == null) {
                        arg1.field2097 = new byte[arg1.field2068];
                    }
                    arg1.field2097[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()V")
    public final void method726() {
        for (int var1 = 0; var1 < this.field2088; ++var1) {
            int var2 = this.field2066[var1];
            this.field2066[var1] = this.field2096[var1];
            this.field2096[var1] = -var2;
        }
        this.method733();
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "([B)V")
    private final void method727(byte[] arg0) {
        class114 var2 = new class114(arg0);
        class114 var3 = new class114(arg0);
        class114 var4 = new class114(arg0);
        class114 var5 = new class114(arg0);
        class114 var6 = new class114(arg0);
        class114 var7 = new class114(arg0);
        class114 var8 = new class114(arg0);
        var2.field2170 = arg0.length - 23;
        int var9 = var2.method762((byte) 78);
        int var10 = var2.method762((byte) 90);
        int var11 = var2.method767(true);
        int var12 = var2.method767(true);
        int var13 = var2.method767(true);
        int var14 = var2.method767(true);
        int var15 = var2.method767(true);
        int var16 = var2.method767(true);
        int var17 = var2.method767(true);
        int var18 = var2.method762((byte) 106);
        int var19 = var2.method762((byte) 113);
        int var20 = var2.method762((byte) 103);
        int var21 = var2.method762((byte) 113);
        int var22 = var2.method762((byte) 82);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2104 = new byte[var11];
            var2.field2170 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field2104[var26] = var2.method759((byte) 127);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2088 = var9;
        this.field2068 = var10;
        this.field2062 = var11;
        this.field2096 = new int[var9];
        this.field2077 = new int[var9];
        this.field2066 = new int[var9];
        this.field2075 = new int[var10];
        this.field2108 = new int[var10];
        this.field2082 = new int[var10];
        if (var17 == 1) {
            this.field2090 = new int[var9];
        }
        if (var12 == 1) {
            this.field2097 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2076 = new byte[var10];
        } else {
            this.field2073 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2069 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2065 = new int[var10];
        }
        if (var16 == 1) {
            this.field2087 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2083 = new byte[var10];
        }
        this.field2109 = new short[var10];
        if (var11 > 0) {
            this.field2080 = new short[var11];
            this.field2098 = new short[var11];
            this.field2074 = new short[var11];
            if (var24 > 0) {
                this.field2079 = new short[var24];
                this.field2078 = new short[var24];
                this.field2099 = new short[var24];
                this.field2092 = new byte[var24];
                this.field2063 = new byte[var24];
                this.field2094 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2091 = new byte[var25];
                this.field2103 = new byte[var25];
            }
        }
        var2.field2170 = var11;
        var3.field2170 = var44;
        var4.field2170 = var46;
        var5.field2170 = var48;
        var6.field2170 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method767(true);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method794((byte) 21);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method794((byte) 21);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method794((byte) 21);
            }
            this.field2096[var67] = var64 + var82;
            this.field2077[var67] = var65 + var83;
            this.field2066[var67] = var66 + var84;
            var64 = this.field2096[var67];
            var65 = this.field2077[var67];
            var66 = this.field2066[var67];
            if (var17 == 1) {
                this.field2090[var67] = var6.method767(true);
            }
        }
        var2.field2170 = var42;
        var3.field2170 = var31;
        var4.field2170 = var34;
        var5.field2170 = var37;
        var6.field2170 = var35;
        var7.field2170 = var40;
        var8.field2170 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field2109[var68] = (short) var2.method762((byte) 75);
            if (var12 == 1) {
                this.field2097[var68] = var3.method759((byte) 127);
            }
            if (var13 == 255) {
                this.field2076[var68] = var4.method759((byte) 127);
            }
            if (var14 == 1) {
                this.field2069[var68] = var5.method759((byte) 127);
            }
            if (var15 == 1) {
                this.field2065[var68] = var6.method767(true);
            }
            if (var16 == 1) {
                this.field2087[var68] = (short) (var7.method762((byte) 115) - 1);
            }
            if (this.field2083 != null) {
                if (this.field2087[var68] != -1) {
                    this.field2083[var68] = (byte) (var8.method767(true) - 1);
                } else {
                    this.field2083[var68] = -1;
                }
            }
        }
        var2.field2170 = var33;
        var3.field2170 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method767(true);
            if (var77 == 1) {
                var69 = var2.method794((byte) 21) + var72;
                var70 = var2.method794((byte) 21) + var69;
                var71 = var2.method794((byte) 21) + var70;
                var72 = var71;
                this.field2075[var73] = var69;
                this.field2108[var73] = var70;
                this.field2082[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method794((byte) 21) + var72;
                var72 = var71;
                this.field2075[var73] = var69;
                this.field2108[var73] = var70;
                this.field2082[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method794((byte) 21) + var72;
                var72 = var71;
                this.field2075[var73] = var69;
                this.field2108[var73] = var70;
                this.field2082[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method794((byte) 21) + var72;
                var72 = var71;
                this.field2075[var73] = var69;
                this.field2108[var73] = var80;
                this.field2082[var73] = var71;
            }
        }
        var2.field2170 = var50;
        var3.field2170 = var52;
        var4.field2170 = var54;
        var5.field2170 = var56;
        var6.field2170 = var58;
        var7.field2170 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field2104[var74] & 255;
            if (var76 == 0) {
                this.field2080[var74] = (short) var2.method762((byte) 93);
                this.field2098[var74] = (short) var2.method762((byte) 88);
                this.field2074[var74] = (short) var2.method762((byte) 91);
            }
            if (var76 == 1) {
                this.field2080[var74] = (short) var3.method762((byte) 121);
                this.field2098[var74] = (short) var3.method762((byte) 119);
                this.field2074[var74] = (short) var3.method762((byte) 95);
                this.field2079[var74] = (short) var4.method762((byte) 76);
                this.field2078[var74] = (short) var4.method762((byte) 75);
                this.field2099[var74] = (short) var4.method762((byte) 95);
                this.field2092[var74] = var5.method759((byte) 127);
                this.field2063[var74] = var6.method759((byte) 127);
                this.field2094[var74] = var7.method759((byte) 127);
            }
            if (var76 == 2) {
                this.field2080[var74] = (short) var3.method762((byte) 125);
                this.field2098[var74] = (short) var3.method762((byte) 71);
                this.field2074[var74] = (short) var3.method762((byte) 82);
                this.field2079[var74] = (short) var4.method762((byte) 97);
                this.field2078[var74] = (short) var4.method762((byte) 79);
                this.field2099[var74] = (short) var4.method762((byte) 89);
                this.field2092[var74] = var5.method759((byte) 127);
                this.field2063[var74] = var6.method759((byte) 127);
                this.field2094[var74] = var7.method759((byte) 127);
                this.field2091[var74] = var7.method759((byte) 127);
                this.field2103[var74] = var7.method759((byte) 127);
            }
            if (var76 == 3) {
                this.field2080[var74] = (short) var3.method762((byte) 104);
                this.field2098[var74] = (short) var3.method762((byte) 85);
                this.field2074[var74] = (short) var3.method762((byte) 118);
                this.field2079[var74] = (short) var4.method762((byte) 117);
                this.field2078[var74] = (short) var4.method762((byte) 91);
                this.field2099[var74] = (short) var4.method762((byte) 114);
                this.field2092[var74] = var5.method759((byte) 127);
                this.field2063[var74] = var6.method759((byte) 127);
                this.field2094[var74] = var7.method759((byte) 127);
            }
        }
        var2.field2170 = var62;
        int var75 = var2.method767(true);
        if (var75 != 0) {
            new class64();
            var2.method762((byte) 127);
            var2.method762((byte) 77);
            var2.method762((byte) 109);
            var2.method761(255);
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()V")
    public final void method728() {
        if (this.field2105 == null) {
            this.field2105 = new class98[this.field2088];
            for (int var1 = 0; var1 < this.field2088; ++var1) {
                this.field2105[var1] = new class98();
            }
            for (int var2 = 0; var2 < this.field2068; ++var2) {
                int var3 = this.field2075[var2];
                int var4 = this.field2108[var2];
                int var5 = this.field2082[var2];
                int var6 = this.field2096[var4] - this.field2096[var3];
                int var7 = this.field2077[var4] - this.field2077[var3];
                int var8 = this.field2066[var4] - this.field2066[var3];
                int var9 = this.field2096[var5] - this.field2096[var3];
                int var10 = this.field2077[var5] - this.field2077[var3];
                int var11 = this.field2066[var5] - this.field2066[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field2097 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2097[var2];
                }
                if (var19 == 0) {
                    class98 var20 = this.field2105[var3];
                    var20.field1814 += var16;
                    var20.field1801 += var17;
                    var20.field1817 += var18;
                    ++var20.field1807;
                    class98 var21 = this.field2105[var4];
                    var21.field1814 += var16;
                    var21.field1801 += var17;
                    var21.field1817 += var18;
                    ++var21.field1807;
                    class98 var22 = this.field2105[var5];
                    var22.field1814 += var16;
                    var22.field1801 += var17;
                    var22.field1817 += var18;
                    ++var22.field1807;
                } else if (var19 == 1) {
                    if (this.field2085 == null) {
                        this.field2085 = new class61[this.field2068];
                    }
                    class61 var23 = this.field2085[var2] = new class61();
                    var23.field1043 = var16;
                    var23.field1044 = var17;
                    var23.field1035 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lc;II)Lmc;")
    public static final class112 method729(class21 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method159((byte) -121, arg2, arg1);
        return var3 == null ? null : new class112(var3);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([[IIIIZI)Lmc;")
    public final class112 method730(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method723();
        int var7 = this.field2095 + arg1;
        int var8 = this.field2102 + arg1;
        int var9 = this.field2064 + arg3;
        int var10 = this.field2067 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class112 var15;
                if (arg4) {
                    var15 = new class112();
                    var15.field2088 = this.field2088;
                    var15.field2068 = this.field2068;
                    var15.field2062 = this.field2062;
                    var15.field2096 = this.field2096;
                    var15.field2066 = this.field2066;
                    var15.field2075 = this.field2075;
                    var15.field2108 = this.field2108;
                    var15.field2082 = this.field2082;
                    var15.field2097 = this.field2097;
                    var15.field2076 = this.field2076;
                    var15.field2069 = this.field2069;
                    var15.field2083 = this.field2083;
                    var15.field2109 = this.field2109;
                    var15.field2087 = this.field2087;
                    var15.field2073 = this.field2073;
                    var15.field2104 = this.field2104;
                    var15.field2080 = this.field2080;
                    var15.field2098 = this.field2098;
                    var15.field2074 = this.field2074;
                    var15.field2079 = this.field2079;
                    var15.field2078 = this.field2078;
                    var15.field2099 = this.field2099;
                    var15.field2092 = this.field2092;
                    var15.field2063 = this.field2063;
                    var15.field2094 = this.field2094;
                    var15.field2091 = this.field2091;
                    var15.field2103 = this.field2103;
                    var15.field2090 = this.field2090;
                    var15.field2065 = this.field2065;
                    var15.field2093 = this.field2093;
                    var15.field2100 = this.field2100;
                    var15.field2106 = this.field2106;
                    var15.field2081 = this.field2081;
                    var15.field2077 = new int[var15.field2088];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2088; ++var16) {
                        int var17 = this.field2096[var16] + arg1;
                        int var18 = this.field2066[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2077[var16] = this.field2077[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2088; ++var26) {
                        int var27 = (this.field2077[var26] << 16) / super.field2341;
                        if (var27 < arg5) {
                            int var28 = this.field2096[var26] + arg1;
                            int var29 = this.field2066[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2077[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2077[var26];
                        } else {
                            var15.field2077[var26] = this.field2077[var26];
                        }
                    }
                }
                var15.method733();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V")
    public final void method731(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2088; ++var4) {
            this.field2096[var4] += arg0;
            this.field2077[var4] += arg1;
            this.field2066[var4] += arg2;
        }
        this.method733();
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "()Lmc;")
    public final class112 method732() {
        class112 var1 = new class112();
        if (this.field2097 != null) {
            var1.field2097 = new byte[this.field2068];
            for (int var2 = 0; var2 < this.field2068; ++var2) {
                var1.field2097[var2] = this.field2097[var2];
            }
        }
        var1.field2088 = this.field2088;
        var1.field2068 = this.field2068;
        var1.field2062 = this.field2062;
        var1.field2096 = this.field2096;
        var1.field2077 = this.field2077;
        var1.field2066 = this.field2066;
        var1.field2075 = this.field2075;
        var1.field2108 = this.field2108;
        var1.field2082 = this.field2082;
        var1.field2076 = this.field2076;
        var1.field2069 = this.field2069;
        var1.field2083 = this.field2083;
        var1.field2109 = this.field2109;
        var1.field2087 = this.field2087;
        var1.field2073 = this.field2073;
        var1.field2104 = this.field2104;
        var1.field2080 = this.field2080;
        var1.field2098 = this.field2098;
        var1.field2074 = this.field2074;
        var1.field2079 = this.field2079;
        var1.field2078 = this.field2078;
        var1.field2099 = this.field2099;
        var1.field2092 = this.field2092;
        var1.field2063 = this.field2063;
        var1.field2094 = this.field2094;
        var1.field2091 = this.field2091;
        var1.field2103 = this.field2103;
        var1.field2090 = this.field2090;
        var1.field2065 = this.field2065;
        var1.field2093 = this.field2093;
        var1.field2100 = this.field2100;
        var1.field2105 = this.field2105;
        var1.field2085 = this.field2085;
        var1.field2106 = this.field2106;
        var1.field2081 = this.field2081;
        return var1;
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "()V")
    private final void method733() {
        this.field2105 = null;
        this.field2070 = null;
        this.field2085 = null;
        this.field2071 = false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIZZ)Lsa;")
    public final class164 method734(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class167(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "()V")
    public final void method735() {
        for (int var1 = 0; var1 < this.field2088; ++var1) {
            this.field2096[var1] = -this.field2096[var1];
            this.field2066[var1] = -this.field2066[var1];
        }
        this.method733();
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(SS)V")
    public final void method736(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2068; ++var3) {
            if (this.field2109[var3] == arg0) {
                this.field2109[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "()V")
    public static void method737() {
        field2086 = null;
        field2107 = null;
        field2084 = null;
        field2072 = null;
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "()V")
    public final void method738() {
        int var10002;
        if (this.field2090 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2088; ++var3) {
                int var7 = this.field2090[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2093 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2093[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2088) {
                int var6 = this.field2090[var5];
                this.field2093[var6][var1[var6]++] = var5++;
            }
            this.field2090 = null;
        }
        if (this.field2065 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2068; ++var10) {
                int var14 = this.field2065[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2100 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2100[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2068) {
                int var13 = this.field2065[var12];
                this.field2100[var13][var8[var13]++] = var12++;
            }
            this.field2065 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "()V")
    public final void method739() {
        for (int var1 = 0; var1 < this.field2088; ++var1) {
            this.field2066[var1] = -this.field2066[var1];
        }
        for (int var2 = 0; var2 < this.field2068; ++var2) {
            int var3 = this.field2075[var2];
            this.field2075[var2] = this.field2082[var2];
            this.field2082[var2] = var3;
        }
        this.method733();
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(SS)V")
    public final void method740(short arg0, short arg1) {
        if (this.field2087 != null) {
            for (int var3 = 0; var3 < this.field2068; ++var3) {
                if (this.field2087[var3] == arg0) {
                    this.field2087[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    private class112() {
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
    private class112(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method727(arg0);
        } else {
            this.method724(arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([Lmc;I)V")
    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2088 = 0;
        this.field2068 = 0;
        this.field2062 = 0;
        this.field2073 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class112 var15 = arg0[var9];
            if (var15 != null) {
                this.field2088 += var15.field2088;
                this.field2068 += var15.field2068;
                this.field2062 += var15.field2062;
                if (var15.field2076 != null) {
                    var4 = true;
                } else {
                    if (this.field2073 == -1) {
                        this.field2073 = var15.field2073;
                    }
                    if (this.field2073 != var15.field2073) {
                        var4 = true;
                    }
                }
                var3 |= var15.field2097 != null;
                var5 |= var15.field2069 != null;
                var6 |= var15.field2065 != null;
                var7 |= var15.field2087 != null;
                var8 |= var15.field2083 != null;
            }
        }
        this.field2096 = new int[this.field2088];
        this.field2077 = new int[this.field2088];
        this.field2066 = new int[this.field2088];
        this.field2090 = new int[this.field2088];
        this.field2075 = new int[this.field2068];
        this.field2108 = new int[this.field2068];
        this.field2082 = new int[this.field2068];
        if (var3) {
            this.field2097 = new byte[this.field2068];
        }
        if (var4) {
            this.field2076 = new byte[this.field2068];
        }
        if (var5) {
            this.field2069 = new byte[this.field2068];
        }
        if (var6) {
            this.field2065 = new int[this.field2068];
        }
        if (var7) {
            this.field2087 = new short[this.field2068];
        }
        if (var8) {
            this.field2083 = new byte[this.field2068];
        }
        this.field2109 = new short[this.field2068];
        if (this.field2062 > 0) {
            this.field2104 = new byte[this.field2062];
            this.field2080 = new short[this.field2062];
            this.field2098 = new short[this.field2062];
            this.field2074 = new short[this.field2062];
            this.field2079 = new short[this.field2062];
            this.field2078 = new short[this.field2062];
            this.field2099 = new short[this.field2062];
            this.field2092 = new byte[this.field2062];
            this.field2063 = new byte[this.field2062];
            this.field2094 = new byte[this.field2062];
            this.field2091 = new byte[this.field2062];
            this.field2103 = new byte[this.field2062];
        }
        this.field2088 = 0;
        this.field2068 = 0;
        this.field2062 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class112 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2068; ++var12) {
                    if (var3 && var11.field2097 != null) {
                        this.field2097[this.field2068] = var11.field2097[var12];
                    }
                    if (var4) {
                        if (var11.field2076 != null) {
                            this.field2076[this.field2068] = var11.field2076[var12];
                        } else {
                            this.field2076[this.field2068] = var11.field2073;
                        }
                    }
                    if (var5 && var11.field2069 != null) {
                        this.field2069[this.field2068] = var11.field2069[var12];
                    }
                    if (var6 && var11.field2065 != null) {
                        this.field2065[this.field2068] = var11.field2065[var12];
                    }
                    if (var7) {
                        if (var11.field2087 != null) {
                            this.field2087[this.field2068] = var11.field2087[var12];
                        } else {
                            this.field2087[this.field2068] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field2083 != null && var11.field2083[var12] != -1) {
                            this.field2083[this.field2068] = (byte) (var11.field2083[var12] + this.field2062);
                        } else {
                            this.field2083[this.field2068] = -1;
                        }
                    }
                    this.field2109[this.field2068] = var11.field2109[var12];
                    this.field2075[this.field2068] = this.method718(var11, var11.field2075[var12]);
                    this.field2108[this.field2068] = this.method718(var11, var11.field2108[var12]);
                    this.field2082[this.field2068] = this.method718(var11, var11.field2082[var12]);
                    ++this.field2068;
                }
                for (int var13 = 0; var13 < var11.field2062; ++var13) {
                    byte var14 = this.field2104[this.field2062] = var11.field2104[var13];
                    if (var14 == 0) {
                        this.field2080[this.field2062] = (short) this.method718(var11, var11.field2080[var13]);
                        this.field2098[this.field2062] = (short) this.method718(var11, var11.field2098[var13]);
                        this.field2074[this.field2062] = (short) this.method718(var11, var11.field2074[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2080[this.field2062] = var11.field2080[var13];
                        this.field2098[this.field2062] = var11.field2098[var13];
                        this.field2074[this.field2062] = var11.field2074[var13];
                        this.field2079[this.field2062] = var11.field2079[var13];
                        this.field2078[this.field2062] = var11.field2078[var13];
                        this.field2099[this.field2062] = var11.field2099[var13];
                        this.field2092[this.field2062] = var11.field2092[var13];
                        this.field2063[this.field2062] = var11.field2063[var13];
                        this.field2094[this.field2062] = var11.field2094[var13];
                    }
                    if (var14 == 2) {
                        this.field2091[this.field2062] = var11.field2091[var13];
                        this.field2103[this.field2062] = var11.field2103[var13];
                    }
                    ++this.field2062;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lmc;ZZZZ)V")
    public class112(class112 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2088 = arg0.field2088;
        this.field2068 = arg0.field2068;
        this.field2062 = arg0.field2062;
        if (arg1) {
            this.field2096 = arg0.field2096;
            this.field2077 = arg0.field2077;
            this.field2066 = arg0.field2066;
        } else {
            this.field2096 = new int[this.field2088];
            this.field2077 = new int[this.field2088];
            this.field2066 = new int[this.field2088];
            for (int var6 = 0; var6 < this.field2088; ++var6) {
                this.field2096[var6] = arg0.field2096[var6];
                this.field2077[var6] = arg0.field2077[var6];
                this.field2066[var6] = arg0.field2066[var6];
            }
        }
        if (arg2) {
            this.field2109 = arg0.field2109;
        } else {
            this.field2109 = new short[this.field2068];
            for (int var7 = 0; var7 < this.field2068; ++var7) {
                this.field2109[var7] = arg0.field2109[var7];
            }
        }
        if (!arg3 && arg0.field2087 != null) {
            this.field2087 = new short[this.field2068];
            for (int var8 = 0; var8 < this.field2068; ++var8) {
                this.field2087[var8] = arg0.field2087[var8];
            }
        } else {
            this.field2087 = arg0.field2087;
        }
        if (arg4) {
            this.field2069 = arg0.field2069;
        } else {
            this.field2069 = new byte[this.field2068];
            if (arg0.field2069 == null) {
                for (int var9 = 0; var9 < this.field2068; ++var9) {
                    this.field2069[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2068; ++var10) {
                    this.field2069[var10] = arg0.field2069[var10];
                }
            }
        }
        this.field2075 = arg0.field2075;
        this.field2108 = arg0.field2108;
        this.field2082 = arg0.field2082;
        this.field2097 = arg0.field2097;
        this.field2076 = arg0.field2076;
        this.field2083 = arg0.field2083;
        this.field2073 = arg0.field2073;
        this.field2104 = arg0.field2104;
        this.field2080 = arg0.field2080;
        this.field2098 = arg0.field2098;
        this.field2074 = arg0.field2074;
        this.field2079 = arg0.field2079;
        this.field2078 = arg0.field2078;
        this.field2099 = arg0.field2099;
        this.field2092 = arg0.field2092;
        this.field2063 = arg0.field2063;
        this.field2094 = arg0.field2094;
        this.field2091 = arg0.field2091;
        this.field2103 = arg0.field2103;
        this.field2090 = arg0.field2090;
        this.field2065 = arg0.field2065;
        this.field2093 = arg0.field2093;
        this.field2100 = arg0.field2100;
        this.field2105 = arg0.field2105;
        this.field2085 = arg0.field2085;
        this.field2070 = arg0.field2070;
        this.field2106 = arg0.field2106;
        this.field2081 = arg0.field2081;
    }
}
