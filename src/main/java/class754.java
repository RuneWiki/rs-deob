import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class754 extends class601 {

    @OriginalMember(owner = "client!uha", name = "K", descriptor = "I")
    private int field10269 = 0;

    @OriginalMember(owner = "client!uha", name = "G", descriptor = "I")
    private int field10266 = 0;

    @OriginalMember(owner = "client!uha", name = "V", descriptor = "I")
    private int field10279 = 0;

    @OriginalMember(owner = "client!uha", name = "T", descriptor = "Z")
    public static boolean field10277 = false;

    @OriginalMember(owner = "client!uha", name = "F", descriptor = "Lwu;")
    public static class582 field10265 = new class582("", 14);

    @OriginalMember(owner = "client!uha", name = "H", descriptor = "I")
    private int field10267;

    @OriginalMember(owner = "client!uha", name = "J", descriptor = "I")
    public static int field10268;

    @OriginalMember(owner = "client!uha", name = "L", descriptor = "I")
    public static int field10270;

    @OriginalMember(owner = "client!uha", name = "M", descriptor = "I")
    private int field10271;

    @OriginalMember(owner = "client!uha", name = "O", descriptor = "I")
    private int field10272;

    @OriginalMember(owner = "client!uha", name = "P", descriptor = "I")
    private int field10273;

    @OriginalMember(owner = "client!uha", name = "R", descriptor = "I")
    public static int field10275;

    @OriginalMember(owner = "client!uha", name = "S", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!uha", name = "U", descriptor = "I")
    private int field10278;

    @OriginalMember(owner = "client!uha", name = "W", descriptor = "I")
    private int field10280;

    @OriginalMember(owner = "client!uha", name = "X", descriptor = "I")
    public static int field10281;

    @OriginalMember(owner = "client!uha", name = "Q", descriptor = "Lmp;")
    public static class334 field10274;

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "()V", line = 9)
    public class754() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIII)V", line = 27)
    private final void method4090(int arg0, int arg1, int arg2, int arg3) {
        ++field10281;
        int var5 = arg2 <= arg3 ? arg3 : arg2;
        if (arg1 != 4096) {
            this.method4091(-25, (byte) -13, -105, 122);
        }
        int var6 = ~arg0 >= ~var5 ? var5 : arg0;
        int var7 = ~arg3 < ~arg2 ? arg2 : arg3;
        int var8 = ~var7 >= ~arg0 ? var7 : arg0;
        this.field10271 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (var9 > 0) {
            int var10 = (-arg2 + var6 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (~arg2 == ~var6) {
                this.field10273 = arg3 != var8 ? 4096 - var11 : var12 + 20480;
            } else if (arg3 == var6) {
                this.field10273 = ~arg0 == ~var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field10273 = ~arg2 == ~var8 ? var11 + 12288 : 20480 - var10;
            }
            this.field10273 /= 6;
        } else {
            this.field10273 = 0;
        }
        if (~this.field10271 < -1 && this.field10271 < 4096) {
            this.field10272 = (var9 << 12) / (this.field10271 > 2048 ? -(this.field10271 * 2) + 8192 : this.field10271 * 2);
        } else {
            this.field10272 = 0;
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)[[I", line = 81)
    public final int[][] method638(int arg0, int arg1) {
        if (arg0 != 2017) {
            method4092((byte) 57);
        }
        ++field10268;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[][] var4 = this.method3247((byte) -99, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class418.field5518; ++var11) {
                this.method4090(var7[var11], 4096, var5[var11], var6[var11]);
                this.field10273 += this.field10266;
                this.field10271 += this.field10269;
                this.field10272 += this.field10279;
                while (this.field10273 < 0) {
                    this.field10273 += 4096;
                }
                if (this.field10272 < 0) {
                    this.field10272 = 0;
                }
                while (~this.field10273 < -4097) {
                    this.field10273 -= 4096;
                }
                if (this.field10271 < 0) {
                    this.field10271 = 0;
                }
                if (~this.field10272 < -4097) {
                    this.field10272 = 4096;
                }
                if (this.field10271 > 4096) {
                    this.field10271 = 4096;
                }
                this.method4091(this.field10273, (byte) -109, this.field10272, this.field10271);
                var8[var11] = this.field10278;
                var9[var11] = this.field10280;
                var10[var11] = this.field10267;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IBII)V", line = 153)
    private final void method4091(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -69) {
            field10277 = true;
        }
        ++field10275;
        int var5 = arg3 <= 2048 ? (arg2 + 4096) * arg3 >> 12 : -(arg2 * arg3 >> 12) + arg3 + arg2;
        if (~var5 >= -1) {
            this.field10278 = this.field10280 = this.field10267 = arg3;
        } else {
            int var6 = arg0 * 6;
            int var7 = -var5 + arg3 + arg3;
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
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field10278 = var5;
                                    this.field10280 = var7;
                                    this.field10267 = var15;
                                }
                            } else {
                                this.field10267 = var5;
                                this.field10278 = var14;
                                this.field10280 = var7;
                            }
                        } else {
                            this.field10278 = var7;
                            this.field10267 = var5;
                            this.field10280 = var15;
                        }
                    } else {
                        this.field10278 = var7;
                        this.field10267 = var14;
                        this.field10280 = var5;
                    }
                } else {
                    this.field10267 = var7;
                    this.field10280 = var5;
                    this.field10278 = var15;
                }
            } else {
                this.field10278 = var5;
                this.field10267 = var7;
                this.field10280 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "(B)V", line = 259)
    public static void method4092(byte arg0) {
        field10274 = null;
        if (arg0 != 77) {
            field10274 = null;
        }
        field10265 = null;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lmc;II)V", line = 271)
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field10276;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field10269 = (arg0.method1554(27806) << 12) / 100;
                }
            } else {
                this.field10279 = (arg0.method1554(27806) << 12) / 100;
            }
        } else {
            this.field10266 = arg0.method1542(27067);
        }
        int var5 = -90 / ((40 - arg2) / 52);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIBILmea;)V", line = 314)
    public static final void method4093(int arg0, int arg1, int arg2, byte arg3, int arg4, class702 arg5) {
        ++field10270;
        class136 var6 = null;
        for (class136 var7 = (class136) class338.field4126.method3591(0); var7 != null; var7 = (class136) class338.field4126.method3600((byte) 90)) {
            if (~var7.field1806 == ~arg4 && var7.field1800 == arg0 && var7.field1799 == arg1 && ~var7.field1809 == ~arg2) {
                var6 = var7;
                break;
            }
        }
        if (var6 == null) {
            var6 = new class136();
            var6.field1799 = arg1;
            var6.field1809 = arg2;
            var6.field1806 = arg4;
            var6.field1800 = arg0;
            class338.field4126.method3593(var6, 15);
        }
        var6.field1803 = false;
        int var8 = 80 / ((arg3 - -23) / 52);
        var6.field1801 = arg5;
        var6.field1805 = true;
    }
}
