import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class340 extends class83 {

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
    private int field4544 = 0;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    private int field4540 = 0;

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "I")
    private int field4551 = 0;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "Lun;")
    public static class317 field4545 = new class317(0, 0);

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
    public static int field4549 = 104;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    private int field4534;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    private int field4536;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    private int field4539;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    private int field4546;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    private int field4547;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
    private int field4548;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILlh;)V")
    public static final void method1982(int arg0, class450 arg1) {
        if (arg0 != 6288) {
            method1982(-118, (class450) null);
        }
        ++field4538;
        class55 var2 = null;
        try {
            class304 var3 = arg1.method2787(-111);
            while (~var3.field4123 == -1) {
                class370.method2235(1L, 10);
            }
            if (var3.field4123 == 1) {
                var2 = (class55) var3.field4126;
                class250 var4 = class17.method79(1);
                var2.method282(0, var4.field3389, var4.field3406, -106);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method285(0);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILjp;ILgo;Lfd;ILjava/lang/String;ILwm;IBI)V")
    public static final void method1983(int arg0, class402 arg1, int arg2, class175 arg3, class194 arg4, int arg5, String arg6, int arg7, class298 arg8, int arg9, byte arg10, int arg11) {
        if (arg10 != 21) {
            field4549 = -89;
        }
        ++field4542;
        int var12;
        if (class294.field3993 == 4) {
            var12 = 16383 & (int) class425.field6241;
        } else {
            var12 = (int) class425.field6241 + class136.field1731 & 16383;
        }
        int var13 = 10 + Math.max(arg4.field2501 / 2, arg4.field2460 / 2);
        int var14 = arg9 * arg9 - -(arg0 * arg0);
        if (~(var13 * var13) <= ~var14) {
            int var15 = class356.field5037[var12];
            int var16 = class356.field5025[var12];
            if (~class294.field3993 != -5) {
                var16 = var16 * 256 / (class411.field5937 + 256);
                var15 = var15 * 256 / (class411.field5937 - -256);
            }
            int var17 = arg0 * var15 + arg9 * var16 >> 15;
            int var18 = arg0 * var16 + -(arg9 * var15) >> 15;
            int var19 = arg1.method2529(100, (class20[]) null, arg6, 0);
            int var20 = var17 - var19 / 2;
            int var21 = arg1.method2521(3699, (class20[]) null, 100, 0, arg6);
            if (var20 >= -arg4.field2501 && arg4.field2501 >= var20 && -arg4.field2460 <= var18 && ~arg4.field2460 <= ~var18) {
                arg8.method1762(var19, arg5, 0, (int[]) null, true, arg4.field2501 / 2 + var20 - -arg2, 0, arg6, arg4.field2460 / 2 - var18 - arg11 + -var21 + arg5, 50, arg2, (class20[]) null, arg3, 0, 1, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class340() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V")
    private final void method1984(int arg0, int arg1, int arg2, int arg3) {
        ++field4541;
        int var5 = arg2 > arg3 ? arg2 : arg3;
        int var6 = ~arg3 < ~arg2 ? arg2 : arg3;
        if (arg1 == 19450) {
            int var7 = ~arg0 < ~var5 ? arg0 : var5;
            int var8 = var6 > arg0 ? arg0 : var6;
            this.field4548 = (var8 - -var7) / 2;
            int var9 = -var8 + var7;
            if (~var9 < -1) {
                int var10 = (-arg2 + var7 << 12) / var9;
                int var11 = (-arg3 + var7 << 12) / var9;
                int var12 = (-arg0 + var7 << 12) / var9;
                if (arg2 == var7) {
                    this.field4536 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
                } else if (~arg3 != ~var7) {
                    this.field4536 = arg2 != var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field4536 = ~arg0 != ~var8 ? -var12 + 12288 : var10 + 4096;
                }
                this.field4536 /= 6;
            } else {
                this.field4536 = 0;
            }
            if (~this.field4548 < -1 && this.field4548 < 4096) {
                this.field4539 = (var9 << 12) / (~this.field4548 >= -2049 ? this.field4548 * 2 : -(this.field4548 * 2) + 8192);
            } else {
                this.field4539 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field4535;
        int[][] var3 = super.field927.method1774((byte) 114, arg1);
        if (!arg0) {
            this.method1985(-42, -61, -9, -114);
        }
        if (super.field927.field4104) {
            int[][] var4 = this.method449(0, true, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class420.field6139 > var11; ++var11) {
                this.method1984(var7[var11], 19450, var5[var11], var6[var11]);
                this.field4539 += this.field4544;
                this.field4536 += this.field4551;
                this.field4548 += this.field4540;
                while (this.field4536 < 0) {
                    this.field4536 += 4096;
                }
                while (~this.field4536 < -4097) {
                    this.field4536 -= 4096;
                }
                if (~this.field4539 > -1) {
                    this.field4539 = 0;
                }
                if (this.field4548 < 0) {
                    this.field4548 = 0;
                }
                if (~this.field4539 < -4097) {
                    this.field4539 = 4096;
                }
                if (this.field4548 > 4096) {
                    this.field4548 = 4096;
                }
                this.method1985(this.field4548, -77, this.field4539, this.field4536);
                var8[var11] = this.field4534;
                var9[var11] = this.field4546;
                var10[var11] = this.field4547;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field4540 = (arg2.method1363((byte) 127) << 12) / 100;
                }
            } else {
                this.field4544 = (arg2.method1363((byte) 105) << 12) / 100;
            }
        } else {
            this.field4551 = arg2.method1366((byte) 104);
        }
        ++field4537;
        int var5 = 115 / ((-27 - arg1) / 50);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)V")
    private final void method1985(int arg0, int arg1, int arg2, int arg3) {
        ++field4543;
        if (arg1 <= -66) {
            int var5 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
            if (var5 > 0) {
                int var6 = arg3 * 6;
                int var7 = arg0 + arg0 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (~var9 == -1) {
                    this.field4547 = var7;
                    this.field4546 = var14;
                    this.field4534 = var5;
                    return;
                }
                if (var9 == 1) {
                    this.field4534 = var15;
                    this.field4547 = var7;
                    this.field4546 = var5;
                    return;
                }
                if (var9 == 2) {
                    this.field4546 = var5;
                    this.field4534 = var7;
                    this.field4547 = var14;
                    return;
                }
                if (var9 == 3) {
                    this.field4547 = var5;
                    this.field4534 = var7;
                    this.field4546 = var15;
                    return;
                }
                if (~var9 == -5) {
                    this.field4547 = var5;
                    this.field4534 = var14;
                    this.field4546 = var7;
                    return;
                }
                if (var9 == 5) {
                    this.field4534 = var5;
                    this.field4547 = var15;
                    this.field4546 = var7;
                    return;
                }
            } else {
                this.field4534 = this.field4546 = this.field4547 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public static void method1986(int arg0) {
        field4545 = null;
        if (arg0 != -2140894385) {
            method1986(22);
        }
    }
}
