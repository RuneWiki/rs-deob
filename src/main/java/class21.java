import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class21 extends class93 {

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    private int field503 = 0;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    private int field505 = 0;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
    private int field502 = 0;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "[J")
    public static long[] field499 = new long[256];

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "Lrf;")
    public static class167 field512;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (super.field1873.field1656) {
            int[][] var4 = this.method649(0, true, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class150.field2985 > var11; ++var11) {
                this.method133(var5[var11], var8[var11], var6[var11], 109);
                this.field501 += this.field503;
                this.field511 += this.field502;
                while (~this.field501 > -1) {
                    this.field501 += 4096;
                }
                this.field506 += this.field505;
                if (this.field506 < 0) {
                    this.field506 = 0;
                }
                while (~this.field501 < -4097) {
                    this.field501 -= 4096;
                }
                if (~this.field506 < -4097) {
                    this.field506 = 4096;
                }
                if (~this.field511 > -1) {
                    this.field511 = 0;
                }
                if (this.field511 > 4096) {
                    this.field511 = 4096;
                }
                this.method129(this.field501, -61733780, this.field506, this.field511);
                var7[var11] = this.field497;
                var9[var11] = this.field513;
                var10[var11] = this.field510;
            }
        }
        if (arg1 != 4096) {
            field499 = null;
        }
        ++field508;
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    private final void method129(int arg0, int arg1, int arg2, int arg3) {
        ++field509;
        if (arg1 != -61733780) {
            method130(103);
        }
        int var5 = ~arg2 >= -2049 ? (arg3 + 4096) * arg2 >> 12 : arg2 - -arg3 + -(arg2 * arg3 >> 12);
        if (var5 <= 0) {
            this.field497 = this.field513 = this.field510 = arg2;
        } else {
            int var6 = -var5 + arg2 + arg2;
            int var7 = (-var6 + var5 << 12) / var5;
            int var8 = arg0 * 6;
            int var9 = var8 >> 12;
            int var10 = -(var9 << 12) + var8;
            int var12 = var7 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var6 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field497 = var5;
                                    this.field510 = var15;
                                    this.field513 = var6;
                                }
                            } else {
                                this.field510 = var5;
                                this.field497 = var14;
                                this.field513 = var6;
                            }
                        } else {
                            this.field497 = var6;
                            this.field513 = var15;
                            this.field510 = var5;
                        }
                    } else {
                        this.field513 = var5;
                        this.field510 = var14;
                        this.field497 = var6;
                    }
                } else {
                    this.field497 = var15;
                    this.field510 = var6;
                    this.field513 = var5;
                }
            } else {
                this.field513 = var14;
                this.field510 = var6;
                this.field497 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public static final void method130(int arg0) {
        class197.field3859 = 0;
        ++field498;
        int var1 = (class15.field423.field246 >> 7) + class115.field2343;
        if (arg0 != 3491) {
            field499 = null;
        }
        int var2 = (class15.field423.field208 >> 7) + class210.field4077;
        if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && ~var2 >= -3137) {
            class197.field3859 = 1;
        }
        if (~var1 <= -3073 && ~var1 >= -3119 && var2 >= 9492 && var2 <= 9535) {
            class197.field3859 = 1;
        }
        if (~class197.field3859 == -2 && ~var1 <= -3140 && var1 <= 3199 && ~var2 <= -3009 && ~var2 >= -3063) {
            class197.field3859 = 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(III)Z")
    public static final boolean method131(int arg0, int arg1, int arg2) {
        if (arg0 > -88) {
            return true;
        } else {
            ++field504;
            return (1 & arg2 >> arg1 + 1) != 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public static void method132(int arg0) {
        if (arg0 != -3728) {
            method132(30);
        }
        field512 = null;
        field499 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class21() {
        super(1, false);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
    private final void method133(int arg0, int arg1, int arg2, int arg3) {
        int var5 = ~arg0 >= ~arg2 ? arg2 : arg0;
        int var6 = arg0 < arg2 ? arg0 : arg2;
        int var7 = arg1 <= var5 ? var5 : arg1;
        ++field500;
        if (arg3 <= 107) {
            this.field510 = 75;
        }
        int var8 = ~arg1 > ~var6 ? arg1 : var6;
        this.field506 = (var7 + var8) / 2;
        int var9 = var7 - var8;
        if (var9 > 0) {
            if (this.field506 > 0 && this.field506 < 4096) {
                this.field511 = (var9 << 12) / (~this.field506 >= -2049 ? this.field506 * 2 : -(this.field506 * 2) + 8192);
            }
            int var10 = (-arg2 + var7 << 12) / var9;
            int var11 = (var7 - arg0 << 12) / var9;
            int var12 = (var7 - arg1 << 12) / var9;
            if (arg0 != var7) {
                if (~arg2 != ~var7) {
                    this.field501 = arg0 == var8 ? var10 + 12288 : 20480 - var11;
                } else {
                    this.field501 = ~arg1 != ~var8 ? 12288 - var12 : var11 + 4096;
                }
            } else {
                this.field501 = ~arg2 == ~var8 ? 20480 - -var12 : -var10 + 4096;
            }
            this.field501 /= 6;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field496;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field505 = (arg1.method431(-12469) << 12) / 100;
                }
            } else {
                this.field502 = (arg1.method431(-12469) << 12) / 100;
            }
        } else {
            this.field503 = arg1.method417((byte) -55);
        }
        if (arg2 != 0) {
            this.method129(7, 69, -19, -93);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(JIZZ)Ljd;")
    public static final class92 method134(long arg0, int arg1, boolean arg2, boolean arg3) {
        ++field507;
        if (!arg3) {
            field499 = null;
        }
        if (arg1 >= 2 && arg1 <= 36) {
            int var5 = 1;
            for (long var6 = arg0 / (long) arg1; ~var6 != -1L; var6 /= (long) arg1) {
                ++var5;
            }
            int var8 = var5;
            if (arg0 < 0L || arg2) {
                var8 = var5 + 1;
            }
            byte[] var9 = new byte[var8];
            if (arg0 < 0L) {
                var9[0] = 45;
            } else if (arg2) {
                var9[0] = 43;
            }
            for (int var10 = 0; ~var5 < ~var10; ++var10) {
                int var12 = (int) (arg0 % (long) arg1);
                arg0 /= (long) arg1;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -10) {
                    var12 += 39;
                }
                var9[var8 + -1 + -var10] = (byte) (var12 + 48);
            }
            class92 var11 = new class92();
            var11.field1856 = var9;
            var11.field1838 = var8;
            return var11;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if ((var1 & 1L) != 1L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field499[var0] = var1;
        }
    }
}
