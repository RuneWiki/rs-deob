import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class407 extends class615 {

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    private int field5482 = 0;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    private int field5484 = 0;

    @OriginalMember(owner = "client!io", name = "W", descriptor = "I")
    private int field5493 = 0;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field5480 = -1;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "Lkf;")
    public static class235 field5486 = new class235();

    @OriginalMember(owner = "client!io", name = "T", descriptor = "J")
    public static long field5490 = 0L;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    private int field5479;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    private int field5483;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    private int field5485;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "I")
    private int field5488;

    @OriginalMember(owner = "client!io", name = "S", descriptor = "I")
    private int field5489;

    @OriginalMember(owner = "client!io", name = "V", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!io", name = "X", descriptor = "I")
    private int field5494;

    @OriginalMember(owner = "client!io", name = "U", descriptor = "Lbi;")
    public static class449 field5491;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(IB)Z", line = 6)
    public static final boolean method2336(int arg0, byte arg1) {
        ++field5477;
        if (~arg0 != -4 && ~arg0 != -14 && ~arg0 != -50 && ~arg0 != -12 && arg0 != 1004) {
            if (~arg0 != -17 && arg0 != 1010) {
                int var2 = -68 / ((arg1 - 83) / 41);
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 26)
    public class407() {
        super(1, false);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZIILoa;)Lta;", line = 34)
    public static final class200 method2337(boolean arg0, int arg1, int arg2, class651 arg3) {
        if (arg2 >= -98) {
            method2337(false, -42, 126, (class651) null);
        }
        ++field5481;
        class305 var4 = class559.method3081(arg3, arg1, (byte) 113, arg0);
        return var4 == null ? null : var4.field4226;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)[[I", line = 55)
    public final int[][] method223(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method2340(-22, (byte) -15, 44, -94);
        }
        ++field5487;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int[][] var4 = this.method3368(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class505.field6740 < ~var11; ++var11) {
                this.method2340(var6[var11], (byte) 65, var7[var11], var5[var11]);
                this.field5489 += this.field5493;
                this.field5488 += this.field5484;
                this.field5485 += this.field5482;
                while (~this.field5488 > -1) {
                    this.field5488 += 4096;
                }
                while (~this.field5488 < -4097) {
                    this.field5488 -= 4096;
                }
                if (~this.field5485 > -1) {
                    this.field5485 = 0;
                }
                if (this.field5489 < 0) {
                    this.field5489 = 0;
                }
                if (this.field5485 > 4096) {
                    this.field5485 = 4096;
                }
                if (~this.field5489 < -4097) {
                    this.field5489 = 4096;
                }
                this.method2339(this.field5485, this.field5488, (byte) 124, this.field5489);
                var8[var11] = this.field5483;
                var9[var11] = this.field5479;
                var10[var11] = this.field5494;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V", line = 129)
    public static void method2338(byte arg0) {
        if (arg0 < -27) {
            field5486 = null;
            field5491 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIBI)V", line = 141)
    private final void method2339(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 124) {
            ++field5478;
            int var5 = arg3 > 2048 ? arg3 - -arg0 + -(arg0 * arg3 >> 12) : (4096 - -arg0) * arg3 >> 12;
            if (~var5 >= -1) {
                this.field5483 = this.field5479 = this.field5494 = arg3;
            } else {
                int var6 = arg1 * 6;
                int var7 = arg3 - var5 + arg3;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = var6 - (var9 << 12);
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (var9 != 3) {
                                if (~var9 != -5) {
                                    if (var9 == 5) {
                                        this.field5479 = var7;
                                        this.field5483 = var5;
                                        this.field5494 = var15;
                                    }
                                } else {
                                    this.field5483 = var14;
                                    this.field5494 = var5;
                                    this.field5479 = var7;
                                }
                            } else {
                                this.field5479 = var15;
                                this.field5494 = var5;
                                this.field5483 = var7;
                            }
                        } else {
                            this.field5479 = var5;
                            this.field5494 = var14;
                            this.field5483 = var7;
                        }
                    } else {
                        this.field5494 = var7;
                        this.field5479 = var5;
                        this.field5483 = var15;
                    }
                } else {
                    this.field5494 = var7;
                    this.field5483 = var5;
                    this.field5479 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IBII)V", line = 258)
    private final void method2340(int arg0, byte arg1, int arg2, int arg3) {
        ++field5492;
        int var5 = ~arg3 < ~arg0 ? arg3 : arg0;
        int var6 = arg3 < arg0 ? arg3 : arg0;
        int var7 = var5 < arg2 ? arg2 : var5;
        int var8 = arg2 >= var6 ? var6 : arg2;
        this.field5489 = (var7 + var8) / 2;
        int var9 = var7 - var8;
        if (~this.field5489 < -1 && ~this.field5489 > -4097) {
            this.field5485 = (var9 << 12) / (this.field5489 > 2048 ? -(this.field5489 * 2) + 8192 : this.field5489 * 2);
        } else {
            this.field5485 = 0;
        }
        if (var9 > 0) {
            int var10 = (-arg3 + var7 << 12) / var9;
            int var11 = (-arg0 + var7 << 12) / var9;
            int var12 = (-arg2 + var7 << 12) / var9;
            if (~arg3 != ~var7) {
                if (~arg0 != ~var7) {
                    this.field5488 = ~arg3 != ~var8 ? -var10 + 20480 : 12288 - -var11;
                } else {
                    this.field5488 = ~arg2 == ~var8 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field5488 = ~arg0 != ~var8 ? -var11 + 4096 : 20480 - -var12;
            }
            this.field5488 /= 6;
        } else {
            this.field5488 = 0;
        }
        if (arg1 < 27) {
            this.method2339(-112, 66, (byte) 14, -29);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BILeh;)V", line = 318)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field5493 = (arg2.method2040(-45) << 12) / 100;
                }
            } else {
                this.field5482 = (arg2.method2040(-46) << 12) / 100;
            }
        } else {
            this.field5484 = arg2.method2022(-29089);
        }
        if (arg0 <= 44) {
            field5491 = null;
        }
        ++field5476;
    }
}
