import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class160 extends class68 {

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    private int field2228 = 0;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    private int field2233 = 0;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    private int field2237 = 0;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2230 = " is already on your friend list.";

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "J")
    public static long field2231 = 0L;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "Lt;")
    public static class203 field2238 = new class203(0, -1);

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "Llc;")
    public static class86 field2244 = new class86(260);

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "[Lj;")
    public static class168[] field2246 = new class168[29];

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "I")
    public static int field2247 = 0;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    private int field2226;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    private int field2232;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    private int field2236;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
    private int field2241;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
    private int field2242;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "[I")
    public static int[] field2245;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBII)V")
    private final void method1062(int arg0, byte arg1, int arg2, int arg3) {
        ++field2235;
        if (arg1 <= 64) {
            method1064(-47, -26);
        }
        int var5 = arg0 > arg3 ? arg0 : arg3;
        int var6 = arg2 <= var5 ? var5 : arg2;
        int var7 = ~arg0 > ~arg3 ? arg0 : arg3;
        int var8 = var7 <= arg2 ? var7 : arg2;
        int var9 = -var8 + var6;
        if (var9 > 0) {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (var6 - arg2 << 12) / var9;
            if (arg0 != var6) {
                if (arg3 == var6) {
                    this.field2242 = arg2 != var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field2242 = arg0 != var8 ? -var10 + 20480 : 12288 - -var11;
                }
            } else {
                this.field2242 = arg3 == var8 ? var12 + 20480 : 4096 - var11;
            }
            this.field2242 /= 6;
        } else {
            this.field2242 = 0;
        }
        this.field2226 = (var6 + var8) / 2;
        if (this.field2226 > 0 && ~this.field2226 > -4097) {
            this.field2232 = (var9 << 12) / (~this.field2226 >= -2049 ? this.field2226 * 2 : -(this.field2226 * 2) + 8192);
        } else {
            this.field2232 = 0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(B)V")
    public static void method1063(byte arg0) {
        field2230 = null;
        field2246 = null;
        field2245 = null;
        if (arg0 <= -88) {
            field2238 = null;
            field2244 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Z")
    public static final boolean method1064(int arg0, int arg1) {
        ++field2239;
        if (arg0 >= 0 && ~class93.field1296.length < ~arg0) {
            return arg1 != 41 ? true : class93.field1296[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2228 = (arg0.method1437((byte) -74) << 12) / 100;
                }
            } else {
                this.field2237 = (arg0.method1437((byte) -74) << 12) / 100;
            }
        } else {
            this.field2233 = arg0.method1479(false);
        }
        if (!arg2) {
            field2245 = null;
        }
        ++field2243;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V")
    private final void method1065(int arg0, int arg1, int arg2, int arg3) {
        ++field2240;
        if (arg3 <= 89) {
            this.field2233 = -1;
        }
        int var5 = ~arg2 < -2049 ? -(arg1 * arg2 >> 12) + arg2 - -arg1 : (arg1 + 4096) * arg2 >> 12;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = -var5 + arg2 + arg2;
            int var8 = var6 >> 12;
            int var10 = (-var7 + var5 << 12) / var5;
            int var11 = var5 * var10 >> 12;
            int var12 = var6 - (var8 << 12);
            int var13 = var11 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var8 == 0) {
                this.field2241 = var14;
                this.field2234 = var7;
                this.field2236 = var5;
                return;
            }
            if (var8 == 1) {
                this.field2236 = var15;
                this.field2234 = var7;
                this.field2241 = var5;
                return;
            }
            if (var8 == 2) {
                this.field2234 = var14;
                this.field2241 = var5;
                this.field2236 = var7;
                return;
            }
            if (var8 == 3) {
                this.field2234 = var5;
                this.field2236 = var7;
                this.field2241 = var15;
                return;
            }
            if (var8 == 4) {
                this.field2236 = var14;
                this.field2241 = var7;
                this.field2234 = var5;
                return;
            }
            if (var8 == 5) {
                this.field2236 = var5;
                this.field2241 = var7;
                this.field2234 = var15;
                return;
            }
        } else {
            this.field2236 = this.field2241 = this.field2234 = arg2;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field2227;
        int[][] var3 = super.field920.method184((byte) -21, arg0);
        int var4 = -127 / ((arg1 - 63) / 61);
        if (super.field920.field374) {
            int[][] var5 = this.method429(0, arg0, 2);
            int[] var6 = var5[0];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var5[1];
            int[] var10 = var5[2];
            int[] var11 = var3[1];
            for (int var12 = 0; ~class89.field1248 < ~var12; ++var12) {
                this.method1062(var6[var12], (byte) 124, var10[var12], var9[var12]);
                for (this.field2242 += this.field2233; ~this.field2242 > -1; this.field2242 += 4096) {
                }
                this.field2232 += this.field2237;
                this.field2226 += this.field2228;
                if (this.field2226 < 0) {
                    this.field2226 = 0;
                }
                if (~this.field2232 > -1) {
                    this.field2232 = 0;
                }
                while (this.field2242 > 4096) {
                    this.field2242 -= 4096;
                }
                if (~this.field2226 < -4097) {
                    this.field2226 = 4096;
                }
                if (this.field2232 > 4096) {
                    this.field2232 = 4096;
                }
                this.method1065(this.field2242, this.field2232, this.field2226, 94);
                var7[var12] = this.field2236;
                var11[var12] = this.field2241;
                var8[var12] = this.field2234;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I[Lse;I)V")
    public static final void method1066(int arg0, class211[] arg1, int arg2) {
        for (int var3 = 0; ~arg1.length < ~var3; ++var3) {
            class211 var5 = arg1[var3];
            if (var5 != null) {
                if (~var5.field3035 == -1) {
                    if (var5.field3180 != null) {
                        method1066(69, var5.field3180, arg2);
                    }
                    class56 var6 = (class56) class289.field4559.method23(216, (long) var5.field3093);
                    if (var6 != null) {
                        class10.method64((byte) -107, arg2, var6.field808);
                    }
                }
                if (arg2 == 0 && var5.field3110 != null) {
                    class27 var7 = new class27();
                    var7.field341 = var5.field3110;
                    var7.field338 = var5;
                    class213.method1392(var7, 95);
                }
                if (arg2 == 1 && var5.field3121 != null) {
                    if (~var5.field3042 <= -1) {
                        class211 var8 = class67.method421(var5.field3093, 0);
                        if (var8 == null || var8.field3180 == null || ~var5.field3042 <= ~var8.field3180.length || var8.field3180[var5.field3042] != var5) {
                            continue;
                        }
                    }
                    class27 var9 = new class27();
                    var9.field341 = var5.field3121;
                    var9.field338 = var5;
                    class213.method1392(var9, -95);
                }
            }
        }
        int var4 = 10 % ((14 - arg0) / 50);
        ++field2229;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class160() {
        super(1, false);
    }
}
