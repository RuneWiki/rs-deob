import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class106 extends class72 {

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    private int field2234 = 0;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "Z")
    public boolean field2228 = false;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    private int field2231 = 0;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public int field2236 = -1;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "Lec;")
    public class28 field2242 = class20.field438;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    private int field2229 = -1;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
    public int field2249 = -1;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public int field2235 = 1;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "Z")
    public boolean field2244 = true;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    private int field2233 = 128;

    @OriginalMember(owner = "client!sa", name = "xb", descriptor = "I")
    private int field2261 = -1;

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
    public int field2252 = -1;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public int field2238 = -1;

    @OriginalMember(owner = "client!sa", name = "vb", descriptor = "I")
    public int field2259 = -1;

    @OriginalMember(owner = "client!sa", name = "yb", descriptor = "I")
    private int field2262 = 128;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
    public int field2246 = -1;

    @OriginalMember(owner = "client!sa", name = "Bb", descriptor = "[Lec;")
    public class28[] field2265 = new class28[5];

    @OriginalMember(owner = "client!sa", name = "Ab", descriptor = "I")
    public int field2264 = 32;

    @OriginalMember(owner = "client!sa", name = "Eb", descriptor = "I")
    public int field2268 = -1;

    @OriginalMember(owner = "client!sa", name = "Fb", descriptor = "Z")
    public boolean field2269 = true;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    public static int field2247 = -1;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
    public static int field2253 = 0;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "Lec;")
    public static class28 field2248 = class28.method210(-46, "@gr2@");

    @OriginalMember(owner = "client!sa", name = "tb", descriptor = "[[B")
    public static byte[][] field2257 = new byte[1000][];

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!sa", name = "sb", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!sa", name = "ub", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!sa", name = "zb", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!sa", name = "Cb", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!sa", name = "Db", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "Lce;")
    public static class18 field2239;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "Lec;")
    public class28 field2251;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[I")
    private int[] field2230;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "[I")
    private int[] field2232;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "[I")
    private int[] field2237;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "[I")
    public int[] field2245;

    @OriginalMember(owner = "client!sa", name = "wb", descriptor = "[I")
    private int[] field2260;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static void method730(int arg0) {
        int var1 = -7 % ((arg0 + 23) / 55);
        field2248 = null;
        field2257 = null;
        field2239 = null;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Z")
    public final boolean method731(byte arg0) {
        field2263++;
        if (this.field2245 == null) {
            return true;
        } else if (arg0 <= 0) {
            return true;
        } else {
            int var2 = -1;
            if (this.field2261 != -1) {
                var2 = class103.method726(84, this.field2261);
            } else if (this.field2229 != -1) {
                var2 = class36.field818[this.field2229];
            }
            return var2 >= 0 && this.field2245.length > var2 && this.field2245[var2] != -1;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I")
    public static int method732(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)Lfb;")
    public final class33 method733(byte arg0) {
        field2256++;
        if (this.field2245 != null) {
            class106 var2 = this.method736(false);
            return var2 == null ? null : var2.method733((byte) 30);
        } else if (this.field2230 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field2230.length; var4++) {
                if (!class66.field1514.method941(0, (byte) -110, this.field2230[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            if (arg0 != 30) {
                field2248 = null;
            }
            class33[] var5 = new class33[this.field2230.length];
            for (int var6 = 0; var6 < this.field2230.length; var6++) {
                var5[var6] = class33.method285(class66.field1514, this.field2230[var6], 0);
            }
            class33 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class33(var5, var5.length);
            }
            if (this.field2237 != null) {
                for (int var8 = 0; var8 < this.field2237.length; var8++) {
                    var7.method270(this.field2237[var8], this.field2232[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILc;ILc;B)Lfb;")
    public final class33 method734(int arg0, class13 arg1, int arg2, class13 arg3, byte arg4) {
        field2255++;
        if (this.field2245 != null) {
            class106 var6 = this.method736(false);
            return var6 == null ? null : var6.method734(arg0, arg1, arg2, arg3, (byte) 65);
        }
        int var7 = -3 / ((arg4 - 3) / 49);
        class33 var8 = (class33) class9.field156.method660(-2, (long) this.field2258);
        if (var8 == null) {
            boolean var9 = false;
            for (int var10 = 0; var10 < this.field2260.length; var10++) {
                if (!class66.field1514.method941(0, (byte) -110, this.field2260[var10])) {
                    var9 = true;
                }
            }
            if (var9) {
                return null;
            }
            class33[] var11 = new class33[this.field2260.length];
            for (int var12 = 0; var12 < this.field2260.length; var12++) {
                var11[var12] = class33.method285(class66.field1514, this.field2260[var12], 0);
            }
            if (var11.length == 1) {
                var8 = var11[0];
            } else {
                var8 = new class33(var11, var11.length);
            }
            if (this.field2237 != null) {
                for (int var13 = 0; var13 < this.field2237.length; var13++) {
                    var8.method270(this.field2237[var13], this.field2232[var13]);
                }
            }
            var8.method277();
            var8.method282(this.field2234 + 64, this.field2231 + 850, -30, -50, -30, true);
            class9.field156.method666(false, var8, (long) this.field2258);
        }
        class33 var14;
        if (arg1 != null && arg3 != null) {
            var14 = arg1.method74(arg3, var8, arg2, arg0, 708184976);
        } else if (arg1 != null) {
            var14 = arg1.method68((byte) -128, var8, arg0);
        } else if (arg3 == null) {
            var14 = var8.method283(true);
        } else {
            var14 = arg3.method68((byte) -128, var8, arg2);
        }
        if (this.field2262 != 128 || this.field2233 != 128) {
            var14.method259(this.field2262, this.field2233, this.field2262);
        }
        return var14;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BILud;)V")
    private final void method735(byte arg0, int arg1, class119 arg2) {
        if (arg0 != 98) {
            this.field2265 = null;
        }
        field2267++;
        if (arg1 == 1) {
            int var4 = arg2.method879((byte) 45);
            this.field2260 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2260[var5] = arg2.method903(arg0 - 96);
            }
        } else if (arg1 == 2) {
            this.field2242 = arg2.method885((byte) -91);
        } else if (arg1 == 3) {
            this.field2251 = arg2.method885((byte) -99);
        } else if (arg1 == 12) {
            this.field2235 = arg2.method879((byte) 45);
        } else if (arg1 == 13) {
            this.field2236 = arg2.method903(2);
        } else if (arg1 == 14) {
            this.field2249 = arg2.method903(2);
        } else if (arg1 == 17) {
            this.field2249 = arg2.method903(2);
            this.field2259 = arg2.method903(2);
            this.field2252 = arg2.method903(arg0 ^ 0x60);
            this.field2268 = arg2.method903(2);
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2265[arg1 - 30] = arg2.method885((byte) -69);
            if (this.field2265[arg1 - 30].method206(class49.field1134, true)) {
                this.field2265[arg1 - 30] = null;
                return;
            }
        } else if (arg1 == 40) {
            int var6 = arg2.method879((byte) 45);
            this.field2232 = new int[var6];
            this.field2237 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2237[var7] = arg2.method903(2);
                this.field2232[var7] = arg2.method903(arg0 - 96);
            }
            return;
        } else if (arg1 == 60) {
            int var10 = arg2.method879((byte) 45);
            this.field2230 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2230[var11] = arg2.method903(2);
            }
            return;
        } else if (arg1 == 93) {
            this.field2269 = false;
            return;
        } else if (arg1 == 95) {
            this.field2238 = arg2.method903(2);
            return;
        } else if (arg1 == 97) {
            this.field2262 = arg2.method903(2);
            return;
        } else if (arg1 == 98) {
            this.field2233 = arg2.method903(2);
            return;
        } else if (arg1 == 99) {
            this.field2228 = true;
            return;
        } else if (arg1 == 100) {
            this.field2234 = arg2.method904(-31558);
            return;
        } else if (arg1 == 101) {
            this.field2231 = arg2.method904(-31558) * 5;
            return;
        } else if (arg1 == 102) {
            this.field2246 = arg2.method903(arg0 ^ 0x60);
            return;
        } else {
            if (arg1 == 103) {
                this.field2264 = arg2.method903(2);
            } else if (arg1 == 106) {
                this.field2261 = arg2.method903(arg0 - 96);
                if (this.field2261 == 65535) {
                    this.field2261 = -1;
                }
                this.field2229 = arg2.method903(2);
                if (this.field2229 == 65535) {
                    this.field2229 = -1;
                }
                int var8 = arg2.method879((byte) 45);
                this.field2245 = new int[var8 + 1];
                for (int var9 = 0; var9 <= var8; var9++) {
                    this.field2245[var9] = arg2.method903(2);
                    if (this.field2245[var9] == 65535) {
                        this.field2245[var9] = -1;
                    }
                }
                return;
            } else if (arg1 == 107) {
                this.field2244 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(Z)Lsa;")
    public final class106 method736(boolean arg0) {
        int var2 = -1;
        field2241++;
        if (this.field2261 != -1) {
            var2 = class103.method726(-91, this.field2261);
        } else if (this.field2229 != -1) {
            var2 = class36.field818[this.field2229];
        }
        if (arg0) {
            this.field2244 = false;
        }
        return var2 < 0 || var2 >= this.field2245.length || this.field2245[var2] == -1 ? null : class8.method42(this.field2245[var2], 105);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLud;)V")
    public final void method737(byte arg0, class119 arg1) {
        field2243++;
        if (arg0 != 70) {
            this.method734(-104, null, -21, null, (byte) -32);
        }
        while (true) {
            int var3 = arg1.method879((byte) 45);
            if (var3 == 0) {
                return;
            }
            this.method735((byte) 98, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method738(int arg0) {
        field2240++;
        if (arg0 != -1) {
            this.field2249 = -28;
        }
    }
}
