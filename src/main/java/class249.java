import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class249 extends class14 {

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    private int field3301 = 0;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    private int field3304 = 0;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    private int field3299 = 0;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Lcu;")
    public static class145 field3298 = new class145(77, -1);

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "[I")
    public static int[] field3314 = new int[1000];

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    private int field3303;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    private int field3306;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    private int field3307;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    private int field3310;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    private int field3313;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = 99 % ((arg1 - -51) / 37);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3299 = (arg2.method2194(-1) << 12) / 100;
                }
            } else {
                this.field3304 = (arg2.method2194(-1) << 12) / 100;
            }
        } else {
            this.field3301 = arg2.method2202(-26372);
        }
        ++field3305;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class249() {
        super(1, false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)V")
    private final void method1505(int arg0, int arg1, int arg2, int arg3) {
        ++field3302;
        if (arg1 == 20480) {
            int var5 = arg3 < arg2 ? arg2 : arg3;
            int var6 = ~arg3 >= ~arg2 ? arg3 : arg2;
            int var7 = ~arg0 >= ~var5 ? var5 : arg0;
            int var8 = ~var6 >= ~arg0 ? var6 : arg0;
            this.field3309 = (var7 + var8) / 2;
            int var9 = -var8 + var7;
            if (~var9 < -1) {
                int var10 = (-arg2 + var7 << 12) / var9;
                int var11 = (-arg3 + var7 << 12) / var9;
                int var12 = (-arg0 + var7 << 12) / var9;
                if (arg2 == var7) {
                    this.field3313 = arg3 != var8 ? -var11 + 4096 : var12 + 20480;
                } else if (arg3 != var7) {
                    this.field3313 = arg2 == var8 ? var11 + 12288 : 20480 - var10;
                } else {
                    this.field3313 = arg0 != var8 ? -var12 + 12288 : 4096 - -var10;
                }
                this.field3313 /= 6;
            } else {
                this.field3313 = 0;
            }
            if (~this.field3309 < -1 && ~this.field3309 > -4097) {
                this.field3307 = (var9 << 12) / (~this.field3309 < -2049 ? -(this.field3309 * 2) + 8192 : this.field3309 * 2);
            } else {
                this.field3307 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public static void method1506(int arg0) {
        field3298 = null;
        field3314 = null;
        if (arg0 != 8192) {
            field3300 = -108;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        if (arg0 != -30909) {
            return null;
        } else {
            ++field3311;
            int[][] var3 = super.field268.method2561(arg1, 0);
            if (super.field268.field6091) {
                int[][] var4 = this.method139(0, 2, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class115.field1637 < ~var11; ++var11) {
                    this.method1505(var7[var11], 20480, var5[var11], var6[var11]);
                    this.field3309 += this.field3299;
                    this.field3307 += this.field3304;
                    for (this.field3313 += this.field3301; this.field3313 < 0; this.field3313 += 4096) {
                    }
                    while (this.field3313 > 4096) {
                        this.field3313 -= 4096;
                    }
                    if (this.field3307 < 0) {
                        this.field3307 = 0;
                    }
                    if (~this.field3309 > -1) {
                        this.field3309 = 0;
                    }
                    if (~this.field3307 < -4097) {
                        this.field3307 = 4096;
                    }
                    if (this.field3309 > 4096) {
                        this.field3309 = 4096;
                    }
                    this.method1507(this.field3307, this.field3309, true, this.field3313);
                    var8[var11] = this.field3310;
                    var9[var11] = this.field3306;
                    var10[var11] = this.field3303;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZI)V")
    private final void method1507(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.method1505(-85, 20, -54, -112);
        }
        ++field3312;
        int var5 = ~arg1 < -2049 ? -(arg0 * arg1 >> 12) + arg1 + arg0 : (4096 - -arg0) * arg1 >> 12;
        if (~var5 < -1) {
            int var6 = arg3 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field3310 = var5;
                this.field3303 = var7;
                this.field3306 = var14;
                return;
            }
            if (var9 == 1) {
                this.field3303 = var7;
                this.field3306 = var5;
                this.field3310 = var15;
                return;
            }
            if (var9 == 2) {
                this.field3310 = var7;
                this.field3306 = var5;
                this.field3303 = var14;
                return;
            }
            if (var9 == 3) {
                this.field3303 = var5;
                this.field3310 = var7;
                this.field3306 = var15;
                return;
            }
            if (~var9 == -5) {
                this.field3306 = var7;
                this.field3303 = var5;
                this.field3310 = var14;
                return;
            }
            if (~var9 == -6) {
                this.field3306 = var7;
                this.field3303 = var15;
                this.field3310 = var5;
                return;
            }
        } else {
            this.field3310 = this.field3306 = this.field3303 = arg1;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method1508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        ++field3308;
        if (arg7 != 37) {
            field3300 = -121;
        }
        class322 var10 = null;
        for (class322 var11 = (class322) class157.field2287.method1672((byte) -105); var11 != null; var11 = (class322) class157.field2287.method1668(arg7 + -38)) {
            if (~var11.field4222 == ~arg1 && ~var11.field4224 == ~arg8 && var11.field4228 == arg4 && ~var11.field4215 == ~arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class322();
            var10.field4215 = arg3;
            var10.field4228 = arg4;
            var10.field4224 = arg8;
            var10.field4222 = arg1;
            if (~arg8 <= -1 && arg4 >= 0 && ~class12.field251 < ~arg8 && ~arg4 > ~class289.field3782) {
                class261.method1576(true, var10);
            }
            class157.field2287.method1666((byte) -67, var10);
        }
        var10.field4223 = arg0;
        var10.field4217 = arg5;
        var10.field4227 = arg2;
        var10.field4218 = arg9;
        var10.field4226 = arg6;
    }
}
