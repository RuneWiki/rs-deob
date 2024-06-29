import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class102 extends class92 {

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public int field2109 = 0;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "Z")
    private boolean field2115 = false;

    @OriginalMember(owner = "client!lc", name = "Kb", descriptor = "I")
    public int field2151 = 0;

    @OriginalMember(owner = "client!lc", name = "Db", descriptor = "B")
    public byte field2144 = 0;

    @OriginalMember(owner = "client!lc", name = "sb", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "[I")
    public int[] field2119;

    @OriginalMember(owner = "client!lc", name = "jb", descriptor = "[I")
    public int[] field2124;

    @OriginalMember(owner = "client!lc", name = "ub", descriptor = "[I")
    public int[] field2135;

    @OriginalMember(owner = "client!lc", name = "yb", descriptor = "[I")
    private int[] field2139;

    @OriginalMember(owner = "client!lc", name = "mb", descriptor = "[I")
    public int[] field2127;

    @OriginalMember(owner = "client!lc", name = "nb", descriptor = "[I")
    public int[] field2128;

    @OriginalMember(owner = "client!lc", name = "zb", descriptor = "[I")
    public int[] field2140;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "[B")
    public byte[] field2113;

    @OriginalMember(owner = "client!lc", name = "Ab", descriptor = "[B")
    public byte[] field2141;

    @OriginalMember(owner = "client!lc", name = "Jb", descriptor = "[B")
    public byte[] field2150;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "[I")
    private int[] field2118;

    @OriginalMember(owner = "client!lc", name = "Nb", descriptor = "[S")
    public short[] field2154;

    @OriginalMember(owner = "client!lc", name = "ib", descriptor = "[B")
    public byte[] field2123;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "[S")
    public short[] field2112;

    @OriginalMember(owner = "client!lc", name = "Cb", descriptor = "[B")
    public byte[] field2143;

    @OriginalMember(owner = "client!lc", name = "vb", descriptor = "[S")
    public short[] field2136;

    @OriginalMember(owner = "client!lc", name = "Ob", descriptor = "[S")
    public short[] field2155;

    @OriginalMember(owner = "client!lc", name = "tb", descriptor = "[S")
    public short[] field2134;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "[S")
    private short[] field2116;

    @OriginalMember(owner = "client!lc", name = "pb", descriptor = "[S")
    private short[] field2130;

    @OriginalMember(owner = "client!lc", name = "rb", descriptor = "[S")
    private short[] field2132;

    @OriginalMember(owner = "client!lc", name = "hb", descriptor = "[B")
    private byte[] field2122;

    @OriginalMember(owner = "client!lc", name = "Fb", descriptor = "[B")
    private byte[] field2146;

    @OriginalMember(owner = "client!lc", name = "wb", descriptor = "[B")
    private byte[] field2137;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "[B")
    private byte[] field2110;

    @OriginalMember(owner = "client!lc", name = "Eb", descriptor = "[B")
    private byte[] field2145;

    @OriginalMember(owner = "client!lc", name = "Mb", descriptor = "[[I")
    public int[][] field2153;

    @OriginalMember(owner = "client!lc", name = "Lb", descriptor = "[[I")
    public int[][] field2152;

    @OriginalMember(owner = "client!lc", name = "qb", descriptor = "[Lbe;")
    public class16[] field2131;

    @OriginalMember(owner = "client!lc", name = "Ib", descriptor = "[Lbg;")
    public class18[] field2149;

    @OriginalMember(owner = "client!lc", name = "kb", descriptor = "[Lbe;")
    public class16[] field2125;

    @OriginalMember(owner = "client!lc", name = "Hb", descriptor = "S")
    public short field2148;

    @OriginalMember(owner = "client!lc", name = "Gb", descriptor = "S")
    public short field2147;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "[I")
    private static int[] field2111 = class17.field341;

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "[I")
    private static int[] field2120 = new int[10000];

    @OriginalMember(owner = "client!lc", name = "lb", descriptor = "I")
    private static int field2126 = 0;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "[I")
    private static int[] field2117 = new int[10000];

    @OriginalMember(owner = "client!lc", name = "ob", descriptor = "[I")
    private static int[] field2129 = class17.field350;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "S")
    private short field2108;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "S")
    private short field2114;

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "S")
    private short field2121;

    @OriginalMember(owner = "client!lc", name = "xb", descriptor = "S")
    private short field2138;

    @OriginalMember(owner = "client!lc", name = "Bb", descriptor = "S")
    private short field2142;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Llc;I)I")
    private final int method820(class102 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2119[arg1];
        int var5 = arg0.field2124[arg1];
        int var6 = arg0.field2135[arg1];
        for (int var7 = 0; var7 < this.field2109; ++var7) {
            if (this.field2119[var7] == var4 && this.field2124[var7] == var5 && this.field2135[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2119[this.field2109] = var4;
            this.field2124[this.field2109] = var5;
            this.field2135[this.field2109] = var6;
            if (arg0.field2139 != null) {
                this.field2139[this.field2109] = arg0.field2139[arg1];
            }
            var3 = this.field2109++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()V")
    public static void method821() {
        field2120 = null;
        field2117 = null;
        field2111 = null;
        field2129 = null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()V")
    public final void method822() {
        for (int var1 = 0; var1 < this.field2109; ++var1) {
            int var2 = this.field2119[var1];
            this.field2119[var1] = this.field2135[var1];
            this.field2135[var1] = -var2;
        }
        this.method836();
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()V")
    public final void method823() {
        for (int var1 = 0; var1 < this.field2109; ++var1) {
            this.field2135[var1] = -this.field2135[var1];
        }
        this.method836();
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    public final void method824(int arg0) {
        int var2 = field2111[arg0];
        int var3 = field2129[arg0];
        for (int var4 = 0; var4 < this.field2109; ++var4) {
            int var5 = this.field2135[var4] * var2 + this.field2119[var4] * var3 >> 16;
            this.field2135[var4] = this.field2135[var4] * var3 - this.field2119[var4] * var2 >> 16;
            this.field2119[var4] = var5;
        }
        this.method836();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([[IIIIZI)Llc;")
    public final class102 method825(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method830();
        int var7 = this.field2138 + arg1;
        int var8 = this.field2108 + arg1;
        int var9 = this.field2142 + arg3;
        int var10 = this.field2121 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class102 var15;
                if (arg4) {
                    var15 = new class102();
                    var15.field2109 = this.field2109;
                    var15.field2151 = this.field2151;
                    var15.field2133 = this.field2133;
                    var15.field2119 = this.field2119;
                    var15.field2135 = this.field2135;
                    var15.field2127 = this.field2127;
                    var15.field2128 = this.field2128;
                    var15.field2140 = this.field2140;
                    var15.field2113 = this.field2113;
                    var15.field2141 = this.field2141;
                    var15.field2150 = this.field2150;
                    var15.field2123 = this.field2123;
                    var15.field2112 = this.field2112;
                    var15.field2154 = this.field2154;
                    var15.field2144 = this.field2144;
                    var15.field2143 = this.field2143;
                    var15.field2136 = this.field2136;
                    var15.field2155 = this.field2155;
                    var15.field2134 = this.field2134;
                    var15.field2116 = this.field2116;
                    var15.field2130 = this.field2130;
                    var15.field2132 = this.field2132;
                    var15.field2122 = this.field2122;
                    var15.field2146 = this.field2146;
                    var15.field2137 = this.field2137;
                    var15.field2110 = this.field2110;
                    var15.field2145 = this.field2145;
                    var15.field2139 = this.field2139;
                    var15.field2118 = this.field2118;
                    var15.field2153 = this.field2153;
                    var15.field2152 = this.field2152;
                    var15.field2148 = this.field2148;
                    var15.field2147 = this.field2147;
                    var15.field2124 = new int[var15.field2109];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2109; ++var16) {
                        int var17 = this.field2119[var16] + arg1;
                        int var18 = this.field2135[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2124[var16] = this.field2124[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2109; ++var26) {
                        int var27 = (this.field2124[var26] << 16) / super.field1928;
                        if (var27 < arg5) {
                            int var28 = this.field2119[var26] + arg1;
                            int var29 = this.field2135[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2124[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2124[var26];
                        } else {
                            var15.field2124[var26] = this.field2124[var26];
                        }
                    }
                }
                var15.method836();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(SS)V")
    public final void method826(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2151; ++var3) {
            if (this.field2112[var3] == arg0) {
                this.field2112[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Llc;Llc;IIIZ)V")
    public static final void method827(class102 arg0, class102 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method830();
        arg0.method843();
        arg1.method830();
        arg1.method843();
        ++field2126;
        int var6 = 0;
        int[] var7 = arg1.field2119;
        int var8 = arg1.field2109;
        for (int var9 = 0; var9 < arg0.field2109; ++var9) {
            class16 var12 = arg0.field2131[var9];
            if (var12.field331 != 0) {
                int var13 = arg0.field2124[var9] - arg3;
                if (var13 >= arg1.field1928 && var13 <= arg1.field2114) {
                    int var14 = arg0.field2119[var9] - arg2;
                    if (var14 >= arg1.field2138 && var14 <= arg1.field2108) {
                        int var15 = arg0.field2135[var9] - arg4;
                        if (var15 >= arg1.field2142 && var15 <= arg1.field2121) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class16 var17 = arg1.field2131[var16];
                                if (var7[var16] == var14 && arg1.field2135[var16] == var15 && arg1.field2124[var16] == var13 && var17.field331 != 0) {
                                    if (arg0.field2125 == null) {
                                        arg0.field2125 = new class16[arg0.field2109];
                                    }
                                    if (arg1.field2125 == null) {
                                        arg1.field2125 = new class16[var8];
                                    }
                                    class16 var18 = arg0.field2125[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2125[var9] = new class16(var12);
                                    }
                                    class16 var19 = arg1.field2125[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2125[var16] = new class16(var17);
                                    }
                                    var18.field328 += var17.field328;
                                    var18.field330 += var17.field330;
                                    var18.field333 += var17.field333;
                                    var18.field331 += var17.field331;
                                    var19.field328 += var12.field328;
                                    var19.field330 += var12.field330;
                                    var19.field333 += var12.field333;
                                    var19.field331 += var12.field331;
                                    ++var6;
                                    field2120[var9] = field2126;
                                    field2117[var16] = field2126;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2151; ++var10) {
                if (field2120[arg0.field2127[var10]] == field2126 && field2120[arg0.field2128[var10]] == field2126 && field2120[arg0.field2140[var10]] == field2126) {
                    if (arg0.field2113 == null) {
                        arg0.field2113 = new byte[arg0.field2151];
                    }
                    arg0.field2113[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2151; ++var11) {
                if (field2117[arg1.field2127[var11]] == field2126 && field2117[arg1.field2128[var11]] == field2126 && field2117[arg1.field2140[var11]] == field2126) {
                    if (arg1.field2113 == null) {
                        arg1.field2113 = new byte[arg1.field2151];
                    }
                    arg1.field2113[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)Laf;")
    public final class7 method828(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class7(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(SS)V")
    public final void method829(short arg0, short arg1) {
        if (this.field2154 != null) {
            for (int var3 = 0; var3 < this.field2151; ++var3) {
                if (this.field2154[var3] == arg0) {
                    this.field2154[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "()V")
    private final void method830() {
        if (!this.field2115) {
            this.field2115 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field2109; ++var7) {
                int var8 = this.field2119[var7];
                int var9 = this.field2124[var7];
                int var10 = this.field2135[var7];
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
            this.field2138 = (short) var1;
            this.field2108 = (short) var4;
            super.field1928 = (short) var2;
            this.field2114 = (short) var5;
            this.field2142 = (short) var3;
            this.field2121 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(III)V")
    public final void method831(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2109; ++var4) {
            this.field2119[var4] = this.field2119[var4] * arg0 / 128;
            this.field2124[var4] = this.field2124[var4] * arg1 / 128;
            this.field2135[var4] = this.field2135[var4] * arg2 / 128;
        }
        this.method836();
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "()V")
    public final void method832() {
        for (int var1 = 0; var1 < this.field2109; ++var1) {
            int var2 = this.field2135[var1];
            this.field2135[var1] = this.field2119[var1];
            this.field2119[var1] = -var2;
        }
        this.method836();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([B)V")
    private final void method833(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class68 var4 = new class68(arg0);
        class68 var5 = new class68(arg0);
        class68 var6 = new class68(arg0);
        class68 var7 = new class68(arg0);
        class68 var8 = new class68(arg0);
        var4.field1454 = arg0.length - 18;
        int var9 = var4.method569(26496);
        int var10 = var4.method569(26496);
        int var11 = var4.method604((byte) 36);
        int var12 = var4.method604((byte) 95);
        int var13 = var4.method604((byte) -125);
        int var14 = var4.method604((byte) 22);
        int var15 = var4.method604((byte) -128);
        int var16 = var4.method604((byte) 82);
        int var17 = var4.method569(26496);
        int var18 = var4.method569(26496);
        int var19 = var4.method569(26496);
        int var20 = var4.method569(26496);
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
        this.field2109 = var9;
        this.field2151 = var10;
        this.field2133 = var11;
        this.field2119 = new int[var9];
        this.field2124 = new int[var9];
        this.field2135 = new int[var9];
        this.field2127 = new int[var10];
        this.field2128 = new int[var10];
        this.field2140 = new int[var10];
        if (var11 > 0) {
            this.field2143 = new byte[var11];
            this.field2136 = new short[var11];
            this.field2155 = new short[var11];
            this.field2134 = new short[var11];
        }
        if (var16 == 1) {
            this.field2139 = new int[var9];
        }
        if (var12 == 1) {
            this.field2113 = new byte[var10];
            this.field2123 = new byte[var10];
            this.field2154 = new short[var10];
        }
        if (var13 == 255) {
            this.field2141 = new byte[var10];
        } else {
            this.field2144 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2150 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2118 = new int[var10];
        }
        this.field2112 = new short[var10];
        var4.field1454 = var21;
        var5.field1454 = var36;
        var6.field1454 = var38;
        var7.field1454 = var40;
        var8.field1454 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method604((byte) 118);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method591(25006);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method591(25006);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method591(25006);
            }
            this.field2119[var46] = var43 + var63;
            this.field2124[var46] = var44 + var64;
            this.field2135[var46] = var45 + var65;
            var43 = this.field2119[var46];
            var44 = this.field2124[var46];
            var45 = this.field2135[var46];
            if (var16 == 1) {
                this.field2139[var46] = var8.method604((byte) -128);
            }
        }
        var4.field1454 = var32;
        var5.field1454 = var28;
        var6.field1454 = var26;
        var7.field1454 = var30;
        var8.field1454 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2112[var47] = (short) var4.method569(26496);
            if (var12 == 1) {
                int var61 = var5.method604((byte) -124);
                if ((var61 & 1) == 1) {
                    this.field2113[var47] = 1;
                    var2 = true;
                } else {
                    this.field2113[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field2123[var47] = (byte) (var61 >> 2);
                    this.field2154[var47] = this.field2112[var47];
                    this.field2112[var47] = 127;
                    if (this.field2154[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2123[var47] = -1;
                    this.field2154[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2141[var47] = var6.method567(-1);
            }
            if (var14 == 1) {
                this.field2150[var47] = var7.method567(-1);
            }
            if (var15 == 1) {
                this.field2118[var47] = var8.method604((byte) -123);
            }
        }
        var4.field1454 = var25;
        var5.field1454 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method604((byte) -128);
            if (var57 == 1) {
                var48 = var4.method591(25006) + var51;
                var49 = var4.method591(25006) + var48;
                var50 = var4.method591(25006) + var49;
                var51 = var50;
                this.field2127[var52] = var48;
                this.field2128[var52] = var49;
                this.field2140[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method591(25006) + var51;
                var51 = var50;
                this.field2127[var52] = var48;
                this.field2128[var52] = var49;
                this.field2140[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method591(25006) + var51;
                var51 = var50;
                this.field2127[var52] = var48;
                this.field2128[var52] = var49;
                this.field2140[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method591(25006) + var51;
                var51 = var50;
                this.field2127[var52] = var48;
                this.field2128[var52] = var60;
                this.field2140[var52] = var50;
            }
        }
        var4.field1454 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2143[var53] = 0;
            this.field2136[var53] = (short) var4.method569(26496);
            this.field2155[var53] = (short) var4.method569(26496);
            this.field2134[var53] = (short) var4.method569(26496);
        }
        if (this.field2123 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field2123[var55] & 255;
                if (var56 != 255) {
                    if ((this.field2136[var56] & 65535) == this.field2127[var55] && (this.field2155[var56] & 65535) == this.field2128[var55] && (this.field2134[var56] & 65535) == this.field2140[var55]) {
                        this.field2123[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2123 = null;
            }
        }
        if (!var3) {
            this.field2154 = null;
        }
        if (!var2) {
            this.field2113 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "()V")
    public final void method834() {
        for (int var1 = 0; var1 < this.field2109; ++var1) {
            this.field2119[var1] = -this.field2119[var1];
            this.field2135[var1] = -this.field2135[var1];
        }
        this.method836();
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(III)V")
    public final void method835(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2109; ++var4) {
            this.field2119[var4] += arg0;
            this.field2124[var4] += arg1;
            this.field2135[var4] += arg2;
        }
        this.method836();
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "()V")
    private final void method836() {
        this.field2131 = null;
        this.field2125 = null;
        this.field2149 = null;
        this.field2115 = false;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([B)V")
    private final void method837(byte[] arg0) {
        class68 var2 = new class68(arg0);
        class68 var3 = new class68(arg0);
        class68 var4 = new class68(arg0);
        class68 var5 = new class68(arg0);
        class68 var6 = new class68(arg0);
        class68 var7 = new class68(arg0);
        class68 var8 = new class68(arg0);
        var2.field1454 = arg0.length - 23;
        int var9 = var2.method569(26496);
        int var10 = var2.method569(26496);
        int var11 = var2.method604((byte) 109);
        int var12 = var2.method604((byte) 25);
        int var13 = var2.method604((byte) -123);
        int var14 = var2.method604((byte) -127);
        int var15 = var2.method604((byte) -125);
        int var16 = var2.method604((byte) -124);
        int var17 = var2.method604((byte) -127);
        int var18 = var2.method569(26496);
        int var19 = var2.method569(26496);
        int var20 = var2.method569(26496);
        int var21 = var2.method569(26496);
        int var22 = var2.method569(26496);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2143 = new byte[var11];
            var2.field1454 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field2143[var26] = var2.method567(-1);
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
        this.field2109 = var9;
        this.field2151 = var10;
        this.field2133 = var11;
        this.field2119 = new int[var9];
        this.field2124 = new int[var9];
        this.field2135 = new int[var9];
        this.field2127 = new int[var10];
        this.field2128 = new int[var10];
        this.field2140 = new int[var10];
        if (var17 == 1) {
            this.field2139 = new int[var9];
        }
        if (var12 == 1) {
            this.field2113 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2141 = new byte[var10];
        } else {
            this.field2144 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2150 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2118 = new int[var10];
        }
        if (var16 == 1) {
            this.field2154 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2123 = new byte[var10];
        }
        this.field2112 = new short[var10];
        if (var11 > 0) {
            this.field2136 = new short[var11];
            this.field2155 = new short[var11];
            this.field2134 = new short[var11];
            if (var24 > 0) {
                this.field2116 = new short[var24];
                this.field2130 = new short[var24];
                this.field2132 = new short[var24];
                this.field2122 = new byte[var24];
                this.field2146 = new byte[var24];
                this.field2137 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2110 = new byte[var25];
                this.field2145 = new byte[var25];
            }
        }
        var2.field1454 = var11;
        var3.field1454 = var44;
        var4.field1454 = var46;
        var5.field1454 = var48;
        var6.field1454 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method604((byte) -123);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method591(25006);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method591(25006);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method591(25006);
            }
            this.field2119[var67] = var64 + var82;
            this.field2124[var67] = var65 + var83;
            this.field2135[var67] = var66 + var84;
            var64 = this.field2119[var67];
            var65 = this.field2124[var67];
            var66 = this.field2135[var67];
            if (var17 == 1) {
                this.field2139[var67] = var6.method604((byte) -124);
            }
        }
        var2.field1454 = var42;
        var3.field1454 = var31;
        var4.field1454 = var34;
        var5.field1454 = var37;
        var6.field1454 = var35;
        var7.field1454 = var40;
        var8.field1454 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field2112[var68] = (short) var2.method569(26496);
            if (var12 == 1) {
                this.field2113[var68] = var3.method567(-1);
            }
            if (var13 == 255) {
                this.field2141[var68] = var4.method567(-1);
            }
            if (var14 == 1) {
                this.field2150[var68] = var5.method567(-1);
            }
            if (var15 == 1) {
                this.field2118[var68] = var6.method604((byte) 63);
            }
            if (var16 == 1) {
                this.field2154[var68] = (short) (var7.method569(26496) - 1);
            }
            if (this.field2123 != null) {
                if (this.field2154[var68] != -1) {
                    this.field2123[var68] = (byte) (var8.method604((byte) -128) - 1);
                } else {
                    this.field2123[var68] = -1;
                }
            }
        }
        var2.field1454 = var33;
        var3.field1454 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method604((byte) 72);
            if (var77 == 1) {
                var69 = var2.method591(25006) + var72;
                var70 = var2.method591(25006) + var69;
                var71 = var2.method591(25006) + var70;
                var72 = var71;
                this.field2127[var73] = var69;
                this.field2128[var73] = var70;
                this.field2140[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method591(25006) + var72;
                var72 = var71;
                this.field2127[var73] = var69;
                this.field2128[var73] = var70;
                this.field2140[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method591(25006) + var72;
                var72 = var71;
                this.field2127[var73] = var69;
                this.field2128[var73] = var70;
                this.field2140[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method591(25006) + var72;
                var72 = var71;
                this.field2127[var73] = var69;
                this.field2128[var73] = var80;
                this.field2140[var73] = var71;
            }
        }
        var2.field1454 = var50;
        var3.field1454 = var52;
        var4.field1454 = var54;
        var5.field1454 = var56;
        var6.field1454 = var58;
        var7.field1454 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field2143[var74] & 255;
            if (var76 == 0) {
                this.field2136[var74] = (short) var2.method569(26496);
                this.field2155[var74] = (short) var2.method569(26496);
                this.field2134[var74] = (short) var2.method569(26496);
            }
            if (var76 == 1) {
                this.field2136[var74] = (short) var3.method569(26496);
                this.field2155[var74] = (short) var3.method569(26496);
                this.field2134[var74] = (short) var3.method569(26496);
                this.field2116[var74] = (short) var4.method569(26496);
                this.field2130[var74] = (short) var4.method569(26496);
                this.field2132[var74] = (short) var4.method569(26496);
                this.field2122[var74] = var5.method567(-1);
                this.field2146[var74] = var6.method567(-1);
                this.field2137[var74] = var7.method567(-1);
            }
            if (var76 == 2) {
                this.field2136[var74] = (short) var3.method569(26496);
                this.field2155[var74] = (short) var3.method569(26496);
                this.field2134[var74] = (short) var3.method569(26496);
                this.field2116[var74] = (short) var4.method569(26496);
                this.field2130[var74] = (short) var4.method569(26496);
                this.field2132[var74] = (short) var4.method569(26496);
                this.field2122[var74] = var5.method567(-1);
                this.field2146[var74] = var6.method567(-1);
                this.field2137[var74] = var7.method567(-1);
                this.field2110[var74] = var7.method567(-1);
                this.field2145[var74] = var7.method567(-1);
            }
            if (var76 == 3) {
                this.field2136[var74] = (short) var3.method569(26496);
                this.field2155[var74] = (short) var3.method569(26496);
                this.field2134[var74] = (short) var3.method569(26496);
                this.field2116[var74] = (short) var4.method569(26496);
                this.field2130[var74] = (short) var4.method569(26496);
                this.field2132[var74] = (short) var4.method569(26496);
                this.field2122[var74] = var5.method567(-1);
                this.field2146[var74] = var6.method567(-1);
                this.field2137[var74] = var7.method567(-1);
            }
        }
        var2.field1454 = var62;
        int var75 = var2.method604((byte) 6);
        if (var75 != 0) {
            new class59();
            var2.method569(26496);
            var2.method569(26496);
            var2.method569(26496);
            var2.method599((byte) 96);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIZZ)Ld;")
    public final class30 method838(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class7(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "()Llc;")
    public final class102 method839() {
        class102 var1 = new class102();
        if (this.field2113 != null) {
            var1.field2113 = new byte[this.field2151];
            for (int var2 = 0; var2 < this.field2151; ++var2) {
                var1.field2113[var2] = this.field2113[var2];
            }
        }
        var1.field2109 = this.field2109;
        var1.field2151 = this.field2151;
        var1.field2133 = this.field2133;
        var1.field2119 = this.field2119;
        var1.field2124 = this.field2124;
        var1.field2135 = this.field2135;
        var1.field2127 = this.field2127;
        var1.field2128 = this.field2128;
        var1.field2140 = this.field2140;
        var1.field2141 = this.field2141;
        var1.field2150 = this.field2150;
        var1.field2123 = this.field2123;
        var1.field2112 = this.field2112;
        var1.field2154 = this.field2154;
        var1.field2144 = this.field2144;
        var1.field2143 = this.field2143;
        var1.field2136 = this.field2136;
        var1.field2155 = this.field2155;
        var1.field2134 = this.field2134;
        var1.field2116 = this.field2116;
        var1.field2130 = this.field2130;
        var1.field2132 = this.field2132;
        var1.field2122 = this.field2122;
        var1.field2146 = this.field2146;
        var1.field2137 = this.field2137;
        var1.field2110 = this.field2110;
        var1.field2145 = this.field2145;
        var1.field2139 = this.field2139;
        var1.field2118 = this.field2118;
        var1.field2153 = this.field2153;
        var1.field2152 = this.field2152;
        var1.field2131 = this.field2131;
        var1.field2149 = this.field2149;
        var1.field2148 = this.field2148;
        var1.field2147 = this.field2147;
        return var1;
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "()V")
    public final void method840() {
        int var10002;
        if (this.field2139 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2109; ++var3) {
                int var7 = this.field2139[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2153 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2153[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2109) {
                int var6 = this.field2139[var5];
                this.field2153[var6][var1[var6]++] = var5++;
            }
            this.field2139 = null;
        }
        if (this.field2118 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2151; ++var10) {
                int var14 = this.field2118[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2152 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2152[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2151) {
                int var13 = this.field2118[var12];
                this.field2152[var13][var8[var13]++] = var12++;
            }
            this.field2118 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lah;II)Llc;")
    public static final class102 method841(class9 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method67(arg1, -1, arg2);
        return var3 == null ? null : new class102(var3);
    }

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "()V")
    public final void method842() {
        for (int var1 = 0; var1 < this.field2151; ++var1) {
            int var2 = this.field2127[var1];
            this.field2127[var1] = this.field2140[var1];
            this.field2140[var1] = var2;
        }
        this.method836();
    }

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "()V")
    public final void method843() {
        if (this.field2131 == null) {
            this.field2131 = new class16[this.field2109];
            for (int var1 = 0; var1 < this.field2109; ++var1) {
                this.field2131[var1] = new class16();
            }
            for (int var2 = 0; var2 < this.field2151; ++var2) {
                int var3 = this.field2127[var2];
                int var4 = this.field2128[var2];
                int var5 = this.field2140[var2];
                int var6 = this.field2119[var4] - this.field2119[var3];
                int var7 = this.field2124[var4] - this.field2124[var3];
                int var8 = this.field2135[var4] - this.field2135[var3];
                int var9 = this.field2119[var5] - this.field2119[var3];
                int var10 = this.field2124[var5] - this.field2124[var3];
                int var11 = this.field2135[var5] - this.field2135[var3];
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
                if (this.field2113 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2113[var2];
                }
                if (var19 == 0) {
                    class16 var20 = this.field2131[var3];
                    var20.field328 += var16;
                    var20.field330 += var17;
                    var20.field333 += var18;
                    ++var20.field331;
                    class16 var21 = this.field2131[var4];
                    var21.field328 += var16;
                    var21.field330 += var17;
                    var21.field333 += var18;
                    ++var21.field331;
                    class16 var22 = this.field2131[var5];
                    var22.field328 += var16;
                    var22.field330 += var17;
                    var22.field333 += var18;
                    ++var22.field331;
                } else if (var19 == 1) {
                    if (this.field2149 == null) {
                        this.field2149 = new class18[this.field2151];
                    }
                    class18 var23 = this.field2149[var2] = new class18();
                    var23.field367 = var16;
                    var23.field360 = var17;
                    var23.field359 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    private class102() {
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([B)V")
    private class102(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method837(arg0);
        } else {
            this.method833(arg0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([Llc;I)V")
    public class102(class102[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2109 = 0;
        this.field2151 = 0;
        this.field2133 = 0;
        this.field2144 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class102 var15 = arg0[var9];
            if (var15 != null) {
                this.field2109 += var15.field2109;
                this.field2151 += var15.field2151;
                this.field2133 += var15.field2133;
                if (var15.field2141 != null) {
                    var4 = true;
                } else {
                    if (this.field2144 == -1) {
                        this.field2144 = var15.field2144;
                    }
                    if (this.field2144 != var15.field2144) {
                        var4 = true;
                    }
                }
                var3 |= var15.field2113 != null;
                var5 |= var15.field2150 != null;
                var6 |= var15.field2118 != null;
                var7 |= var15.field2154 != null;
                var8 |= var15.field2123 != null;
            }
        }
        this.field2119 = new int[this.field2109];
        this.field2124 = new int[this.field2109];
        this.field2135 = new int[this.field2109];
        this.field2139 = new int[this.field2109];
        this.field2127 = new int[this.field2151];
        this.field2128 = new int[this.field2151];
        this.field2140 = new int[this.field2151];
        if (var3) {
            this.field2113 = new byte[this.field2151];
        }
        if (var4) {
            this.field2141 = new byte[this.field2151];
        }
        if (var5) {
            this.field2150 = new byte[this.field2151];
        }
        if (var6) {
            this.field2118 = new int[this.field2151];
        }
        if (var7) {
            this.field2154 = new short[this.field2151];
        }
        if (var8) {
            this.field2123 = new byte[this.field2151];
        }
        this.field2112 = new short[this.field2151];
        if (this.field2133 > 0) {
            this.field2143 = new byte[this.field2133];
            this.field2136 = new short[this.field2133];
            this.field2155 = new short[this.field2133];
            this.field2134 = new short[this.field2133];
            this.field2116 = new short[this.field2133];
            this.field2130 = new short[this.field2133];
            this.field2132 = new short[this.field2133];
            this.field2122 = new byte[this.field2133];
            this.field2146 = new byte[this.field2133];
            this.field2137 = new byte[this.field2133];
            this.field2110 = new byte[this.field2133];
            this.field2145 = new byte[this.field2133];
        }
        this.field2109 = 0;
        this.field2151 = 0;
        this.field2133 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class102 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2151; ++var12) {
                    if (var3 && var11.field2113 != null) {
                        this.field2113[this.field2151] = var11.field2113[var12];
                    }
                    if (var4) {
                        if (var11.field2141 != null) {
                            this.field2141[this.field2151] = var11.field2141[var12];
                        } else {
                            this.field2141[this.field2151] = var11.field2144;
                        }
                    }
                    if (var5 && var11.field2150 != null) {
                        this.field2150[this.field2151] = var11.field2150[var12];
                    }
                    if (var6 && var11.field2118 != null) {
                        this.field2118[this.field2151] = var11.field2118[var12];
                    }
                    if (var7) {
                        if (var11.field2154 != null) {
                            this.field2154[this.field2151] = var11.field2154[var12];
                        } else {
                            this.field2154[this.field2151] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field2123 != null && var11.field2123[var12] != -1) {
                            this.field2123[this.field2151] = (byte) (var11.field2123[var12] + this.field2133);
                        } else {
                            this.field2123[this.field2151] = -1;
                        }
                    }
                    this.field2112[this.field2151] = var11.field2112[var12];
                    this.field2127[this.field2151] = this.method820(var11, var11.field2127[var12]);
                    this.field2128[this.field2151] = this.method820(var11, var11.field2128[var12]);
                    this.field2140[this.field2151] = this.method820(var11, var11.field2140[var12]);
                    ++this.field2151;
                }
                for (int var13 = 0; var13 < var11.field2133; ++var13) {
                    byte var14 = this.field2143[this.field2133] = var11.field2143[var13];
                    if (var14 == 0) {
                        this.field2136[this.field2133] = (short) this.method820(var11, var11.field2136[var13]);
                        this.field2155[this.field2133] = (short) this.method820(var11, var11.field2155[var13]);
                        this.field2134[this.field2133] = (short) this.method820(var11, var11.field2134[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2136[this.field2133] = var11.field2136[var13];
                        this.field2155[this.field2133] = var11.field2155[var13];
                        this.field2134[this.field2133] = var11.field2134[var13];
                        this.field2116[this.field2133] = var11.field2116[var13];
                        this.field2130[this.field2133] = var11.field2130[var13];
                        this.field2132[this.field2133] = var11.field2132[var13];
                        this.field2122[this.field2133] = var11.field2122[var13];
                        this.field2146[this.field2133] = var11.field2146[var13];
                        this.field2137[this.field2133] = var11.field2137[var13];
                    }
                    if (var14 == 2) {
                        this.field2110[this.field2133] = var11.field2110[var13];
                        this.field2145[this.field2133] = var11.field2145[var13];
                    }
                    ++this.field2133;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Llc;ZZZZ)V")
    public class102(class102 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2109 = arg0.field2109;
        this.field2151 = arg0.field2151;
        this.field2133 = arg0.field2133;
        if (arg1) {
            this.field2119 = arg0.field2119;
            this.field2124 = arg0.field2124;
            this.field2135 = arg0.field2135;
        } else {
            this.field2119 = new int[this.field2109];
            this.field2124 = new int[this.field2109];
            this.field2135 = new int[this.field2109];
            for (int var6 = 0; var6 < this.field2109; ++var6) {
                this.field2119[var6] = arg0.field2119[var6];
                this.field2124[var6] = arg0.field2124[var6];
                this.field2135[var6] = arg0.field2135[var6];
            }
        }
        if (arg2) {
            this.field2112 = arg0.field2112;
        } else {
            this.field2112 = new short[this.field2151];
            for (int var7 = 0; var7 < this.field2151; ++var7) {
                this.field2112[var7] = arg0.field2112[var7];
            }
        }
        if (!arg3 && arg0.field2154 != null) {
            this.field2154 = new short[this.field2151];
            for (int var8 = 0; var8 < this.field2151; ++var8) {
                this.field2154[var8] = arg0.field2154[var8];
            }
        } else {
            this.field2154 = arg0.field2154;
        }
        if (arg4) {
            this.field2150 = arg0.field2150;
        } else {
            this.field2150 = new byte[this.field2151];
            if (arg0.field2150 == null) {
                for (int var9 = 0; var9 < this.field2151; ++var9) {
                    this.field2150[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2151; ++var10) {
                    this.field2150[var10] = arg0.field2150[var10];
                }
            }
        }
        this.field2127 = arg0.field2127;
        this.field2128 = arg0.field2128;
        this.field2140 = arg0.field2140;
        this.field2113 = arg0.field2113;
        this.field2141 = arg0.field2141;
        this.field2123 = arg0.field2123;
        this.field2144 = arg0.field2144;
        this.field2143 = arg0.field2143;
        this.field2136 = arg0.field2136;
        this.field2155 = arg0.field2155;
        this.field2134 = arg0.field2134;
        this.field2116 = arg0.field2116;
        this.field2130 = arg0.field2130;
        this.field2132 = arg0.field2132;
        this.field2122 = arg0.field2122;
        this.field2146 = arg0.field2146;
        this.field2137 = arg0.field2137;
        this.field2110 = arg0.field2110;
        this.field2145 = arg0.field2145;
        this.field2139 = arg0.field2139;
        this.field2118 = arg0.field2118;
        this.field2153 = arg0.field2153;
        this.field2152 = arg0.field2152;
        this.field2131 = arg0.field2131;
        this.field2149 = arg0.field2149;
        this.field2125 = arg0.field2125;
        this.field2148 = arg0.field2148;
        this.field2147 = arg0.field2147;
    }
}
