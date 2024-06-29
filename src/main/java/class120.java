import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class120 extends class166 {

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    private int field2258 = 0;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    private int field2260 = 0;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    private int field2256 = 0;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "Lhj;")
    public static class69 field2264 = class181.method1318("Verbindung mit Update)2Server)3)3)3", (byte) -120);

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    public static int field2266 = -1;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    private int field2262;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    private int field2263;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "Lnc;")
    public static class83 field2268;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)V")
    private final void method867(int arg0, int arg1, int arg2, int arg3) {
        ++field2253;
        int var5 = arg1 > arg2 ? arg1 : arg2;
        int var6 = ~arg0 >= ~var5 ? var5 : arg0;
        int var7 = arg2 > arg1 ? arg1 : arg2;
        int var8 = var7 > arg0 ? arg0 : var7;
        this.field2263 = (var6 + var8) / 2;
        if (arg3 == -2035105236) {
            int var9 = -var8 + var6;
            if (this.field2263 > 0 && ~this.field2263 > -4097) {
                this.field2259 = (var9 << 12) / (~this.field2263 >= -2049 ? this.field2263 * 2 : -(this.field2263 * 2) + 8192);
            } else {
                this.field2259 = 0;
            }
            if (var9 > 0) {
                int var10 = (var6 - arg1 << 12) / var9;
                int var11 = (-arg2 + var6 << 12) / var9;
                int var12 = (-arg0 + var6 << 12) / var9;
                if (arg1 == var6) {
                    this.field2252 = arg2 != var8 ? -var11 + 4096 : var12 + 20480;
                } else if (~arg2 != ~var6) {
                    this.field2252 = ~arg1 != ~var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field2252 = arg0 == var8 ? var10 + 4096 : -var12 + 12288;
                }
                this.field2252 /= 6;
            } else {
                this.field2252 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
    public static void method868(int arg0) {
        if (arg0 == 0) {
            field2264 = null;
            field2268 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        int[][] var3 = super.field3064.method320(arg1, (byte) -113);
        ++field2254;
        if (super.field3064.field979) {
            int[][] var4 = this.method1229(arg1, 23580, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class253.field4565 < ~var11; ++var11) {
                this.method867(var9[var11], var5[var11], var6[var11], -2035105236);
                this.field2259 += this.field2260;
                this.field2252 += this.field2258;
                this.field2263 += this.field2256;
                if (this.field2263 < 0) {
                    this.field2263 = 0;
                }
                if (this.field2259 < 0) {
                    this.field2259 = 0;
                }
                if (this.field2263 > 4096) {
                    this.field2263 = 4096;
                }
                while (this.field2252 < 0) {
                    this.field2252 += 4096;
                }
                while (~this.field2252 < -4097) {
                    this.field2252 -= 4096;
                }
                if (this.field2259 > 4096) {
                    this.field2259 = 4096;
                }
                this.method869(this.field2259, this.field2263, -15066, this.field2252);
                var7[var11] = this.field2255;
                var8[var11] = this.field2257;
                var10[var11] = this.field2262;
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIII)V")
    private final void method869(int arg0, int arg1, int arg2, int arg3) {
        ++field2261;
        if (arg2 != -15066) {
            this.method867(-108, -39, 100, -91);
        }
        int var5 = arg1 <= 2048 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 + -(arg0 * arg1 >> 12);
        if (var5 > 0) {
            int var6 = arg3 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var11 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 == 0) {
                this.field2262 = var7;
                this.field2257 = var14;
                this.field2255 = var5;
                return;
            }
            if (var9 == 1) {
                this.field2255 = var15;
                this.field2257 = var5;
                this.field2262 = var7;
                return;
            }
            if (~var9 == -3) {
                this.field2257 = var5;
                this.field2255 = var7;
                this.field2262 = var14;
                return;
            }
            if (var9 == 3) {
                this.field2255 = var7;
                this.field2262 = var5;
                this.field2257 = var15;
                return;
            }
            if (var9 == 4) {
                this.field2262 = var5;
                this.field2255 = var14;
                this.field2257 = var7;
                return;
            }
            if (var9 == 5) {
                this.field2255 = var5;
                this.field2257 = var7;
                this.field2262 = var15;
                return;
            }
        } else {
            this.field2255 = this.field2257 = this.field2262 = arg1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 == 96) {
            ++field2265;
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field2256 = (arg1.method950(1495791448) << 12) / 100;
                    }
                } else {
                    this.field2260 = (arg1.method950(1495791448) << 12) / 100;
                }
            } else {
                this.field2258 = arg1.method955((byte) 114);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class120() {
        super(1, false);
    }
}
