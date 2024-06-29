import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class278 extends class114 {

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    private int field4408 = 0;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    private int field4410 = 0;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    private int field4416 = 0;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "Lue;")
    public static class222 field4412 = new class222(32);

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    public static int field4424 = 1;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    private int field4409;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    private int field4411;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    private int field4414;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    private int field4421;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    private int field4422;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    private int field4423;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "Lnh;")
    public static class305 field4425;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "[I")
    public static int[] field4420;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BIII)V")
    private final void method1804(byte arg0, int arg1, int arg2, int arg3) {
        ++field4418;
        int var5 = arg3 > arg1 ? arg3 : arg1;
        int var6 = ~arg3 > ~arg1 ? arg3 : arg1;
        if (arg0 >= -86) {
            this.field4409 = 46;
        }
        int var7 = ~var6 >= ~arg2 ? var6 : arg2;
        int var8 = ~var5 > ~arg2 ? arg2 : var5;
        int var9 = var8 - var7;
        this.field4414 = (var7 + var8) / 2;
        if (~var9 < -1) {
            int var10 = (var8 - arg1 << 12) / var9;
            int var11 = (var8 - arg3 << 12) / var9;
            int var12 = (-arg2 + var8 << 12) / var9;
            if (arg3 == var8) {
                this.field4409 = arg1 == var7 ? var12 + 20480 : -var10 + 4096;
            } else if (~arg1 == ~var8) {
                this.field4409 = ~arg2 != ~var7 ? -var12 + 12288 : var11 + 4096;
            } else {
                this.field4409 = ~arg3 == ~var7 ? var10 + 12288 : 20480 - var11;
            }
            this.field4409 /= 6;
        } else {
            this.field4409 = 0;
        }
        if (this.field4414 > 0 && ~this.field4414 > -4097) {
            this.field4423 = (var9 << 12) / (~this.field4414 < -2049 ? 8192 - this.field4414 * 2 : this.field4414 * 2);
        } else {
            this.field4423 = 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class278() {
        super(1, false);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        if (arg0 != -112) {
            return null;
        } else {
            int[][] var3 = super.field1627.method104(arg1, (byte) 119);
            if (super.field1627.field280) {
                int[][] var4 = this.method727(0, arg1, 842);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[0];
                int[] var8 = var4[2];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class145.field2009; ++var11) {
                    this.method1804((byte) -119, var6[var11], var8[var11], var5[var11]);
                    this.field4409 += this.field4410;
                    this.field4423 += this.field4408;
                    if (~this.field4423 > -1) {
                        this.field4423 = 0;
                    }
                    this.field4414 += this.field4416;
                    if (this.field4423 > 4096) {
                        this.field4423 = 4096;
                    }
                    if (~this.field4414 > -1) {
                        this.field4414 = 0;
                    }
                    while (this.field4409 < 0) {
                        this.field4409 += 4096;
                    }
                    if (this.field4414 > 4096) {
                        this.field4414 = 4096;
                    }
                    while (~this.field4409 < -4097) {
                        this.field4409 -= 4096;
                    }
                    this.method1806(this.field4409, this.field4414, this.field4423, 0);
                    var7[var11] = this.field4422;
                    var9[var11] = this.field4421;
                    var10[var11] = this.field4411;
                }
            }
            ++field4417;
            return var3;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 != 12953) {
            this.method1804((byte) 9, -57, -86, -83);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field4416 = (arg0.method1350((byte) 127) << 12) / 100;
                }
            } else {
                this.field4408 = (arg0.method1350((byte) -119) << 12) / 100;
            }
        } else {
            this.field4410 = arg0.method1356(false);
        }
        ++field4415;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public static void method1805(byte arg0) {
        field4420 = null;
        field4425 = null;
        if (arg0 != 7) {
            field4412 = null;
        }
        field4412 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V")
    private final void method1806(int arg0, int arg1, int arg2, int arg3) {
        ++field4419;
        if (arg3 == 0) {
            int var5 = arg1 > 2048 ? arg1 - (-arg2 - -(arg1 * arg2 >> 12)) : (4096 - -arg2) * arg1 >> 12;
            if (~var5 < -1) {
                int var6 = arg0 * 6;
                int var7 = arg1 - (-arg1 + var5);
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = var5 - var13;
                if (~var9 == -1) {
                    this.field4411 = var7;
                    this.field4421 = var14;
                    this.field4422 = var5;
                    return;
                }
                if (var9 == 1) {
                    this.field4422 = var15;
                    this.field4421 = var5;
                    this.field4411 = var7;
                    return;
                }
                if (var9 == 2) {
                    this.field4421 = var5;
                    this.field4411 = var14;
                    this.field4422 = var7;
                    return;
                }
                if (~var9 == -4) {
                    this.field4422 = var7;
                    this.field4421 = var15;
                    this.field4411 = var5;
                    return;
                }
                if (var9 == 4) {
                    this.field4421 = var7;
                    this.field4411 = var5;
                    this.field4422 = var14;
                    return;
                }
                if (~var9 == -6) {
                    this.field4422 = var5;
                    this.field4421 = var7;
                    this.field4411 = var15;
                    return;
                }
            } else {
                this.field4422 = this.field4421 = this.field4411 = arg1;
            }
        }
    }
}
