import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class34 extends class273 {

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    private int field576 = 0;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    private int field571 = 0;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    private int field563 = 0;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "[Lwf;")
    public static class17[] field567;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public static void method285(int arg0) {
        field567 = null;
        if (arg0 != 1490763052) {
            method288(8, -26);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        ++field564;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631) {
            int[][] var4 = this.method1853(0, arg1, (byte) 8);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; class26.field458 > var11; ++var11) {
                this.method286(var5[var11], var7[var11], var6[var11], (byte) 122);
                this.field565 += this.field571;
                if (this.field565 < 0) {
                    this.field565 = 0;
                }
                this.field570 += this.field576;
                this.field569 += this.field563;
                while (~this.field570 > -1) {
                    this.field570 += 4096;
                }
                while (this.field570 > 4096) {
                    this.field570 -= 4096;
                }
                if (this.field569 < 0) {
                    this.field569 = 0;
                }
                if (~this.field569 < -4097) {
                    this.field569 = 4096;
                }
                if (~this.field565 < -4097) {
                    this.field565 = 4096;
                }
                this.method287((byte) -77, this.field570, this.field569, this.field565);
                var10[var11] = this.field575;
                var8[var11] = this.field561;
                var9[var11] = this.field566;
            }
        }
        if (arg0 < 122) {
            this.field575 = 82;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIB)V")
    private final void method286(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = ~arg0 >= ~arg2 ? arg2 : arg0;
        if (arg3 > 114) {
            int var6 = arg0 >= arg2 ? arg2 : arg0;
            int var7 = ~arg1 >= ~var5 ? var5 : arg1;
            int var8 = var6 <= arg1 ? var6 : arg1;
            int var9 = var7 - var8;
            ++field562;
            if (~var9 < -1) {
                int var10 = (-arg0 + var7 << 12) / var9;
                int var11 = (-arg1 + var7 << 12) / var9;
                int var12 = (-arg2 + var7 << 12) / var9;
                if (arg0 == var7) {
                    this.field570 = arg2 != var8 ? -var12 + 4096 : var11 + 20480;
                } else if (~arg2 != ~var7) {
                    this.field570 = ~arg0 != ~var8 ? -var10 + 20480 : var12 + 12288;
                } else {
                    this.field570 = arg1 != var8 ? -var11 + 12288 : var10 + 4096;
                }
                this.field570 /= 6;
            } else {
                this.field570 = 0;
            }
            this.field569 = (var7 + var8) / 2;
            if (~this.field569 < -1 && ~this.field569 > -4097) {
                this.field565 = (var9 << 12) / (~this.field569 < -2049 ? -(this.field569 * 2) + 8192 : this.field569 * 2);
            } else {
                this.field565 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIII)V")
    private final void method287(byte arg0, int arg1, int arg2, int arg3) {
        ++field560;
        int var5 = ~arg2 < -2049 ? -(arg2 * arg3 >> 12) + arg2 - -arg3 : (arg3 + 4096) * arg2 >> 12;
        if (var5 <= 0) {
            this.field575 = this.field561 = this.field566 = arg2;
        } else {
            int var6 = -var5 + arg2 + arg2;
            int var7 = arg1 * 6;
            int var8 = var7 >> 12;
            int var9 = -(var8 << 12) + var7;
            int var10 = (-var6 + var5 << 12) / var5;
            int var12 = var10 * var5 >> 12;
            int var13 = var9 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var6 + var13;
            if (var8 != 0) {
                if (var8 != 1) {
                    if (~var8 != -3) {
                        if (~var8 != -4) {
                            if (var8 != 4) {
                                if (~var8 == -6) {
                                    this.field561 = var6;
                                    this.field566 = var14;
                                    this.field575 = var5;
                                }
                            } else {
                                this.field575 = var15;
                                this.field561 = var6;
                                this.field566 = var5;
                            }
                        } else {
                            this.field575 = var6;
                            this.field566 = var5;
                            this.field561 = var14;
                        }
                    } else {
                        this.field575 = var6;
                        this.field561 = var5;
                        this.field566 = var15;
                    }
                } else {
                    this.field575 = var14;
                    this.field566 = var6;
                    this.field561 = var5;
                }
            } else {
                this.field575 = var5;
                this.field561 = var15;
                this.field566 = var6;
            }
        }
        if (arg0 >= -66) {
            this.field575 = 7;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            this.field566 = -61;
        }
        ++field568;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field563 = (arg0.method981(false) << 12) / 100;
                }
            } else {
                this.field571 = (arg0.method981(false) << 12) / 100;
            }
        } else {
            this.field576 = arg0.method1027((byte) 64);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I")
    public static final int method288(int arg0, int arg1) {
        if (arg1 <= 17) {
            field567 = null;
        }
        ++field572;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)Lmb;")
    public static final class128 method289(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class128 var4 = var3.field2144;
            var3.field2144 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BI)I")
    public static final int method290(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field573;
        if (arg0 != -2598) {
            return -9;
        } else {
            int var4 = -1;
            for (int var5 = arg3; ~var5 > ~arg1; ++var5) {
                var4 = class108.field1643[255 & (arg2[var5] ^ var4)] ^ var4 >>> 8;
            }
            return ~var4;
        }
    }
}
