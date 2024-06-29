import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class313 extends class667 {

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "Z")
    public boolean field4416 = true;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public int field4419 = 4;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public int field4425 = 4;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "[B")
    private byte[] field4428 = new byte[512];

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public int field4431 = 1638;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public int field4422 = 0;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public int field4430 = 4;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lnga;")
    public static class510 field4417 = new class510(5);

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "F")
    public static float field4424;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "[S")
    private short[] field4423;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "[S")
    private short[] field4426;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 == 3) {
            ++field4418;
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field4419 = arg0.method273(255);
                } else {
                    if (arg2 != 2) {
                        if (arg2 == 3) {
                            this.field4430 = this.field4425 = arg0.method273(255);
                            return;
                        }
                        if (arg2 == 4) {
                            this.field4422 = arg0.method273(255);
                            return;
                        }
                        if (arg2 == 5) {
                            this.field4430 = arg0.method273(255);
                            return;
                        }
                        if (arg2 == 6) {
                            this.field4425 = arg0.method273(255);
                            return;
                        }
                    } else {
                        this.field4431 = arg0.method225((byte) 117);
                        if (this.field4431 < 0) {
                            this.field4423 = new short[this.field4419];
                            for (int var5 = 0; this.field4419 > var5; ++var5) {
                                this.field4423[var5] = (short) arg0.method225((byte) 118);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field4416 = arg0.method273(255) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)Z")
    public static final boolean method2024(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            method2024(69, -46, 80);
        }
        ++field4427;
        return (32768 & arg0) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field4429;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 >= -87) {
            this.field4416 = true;
        }
        if (super.field9355.field3728) {
            this.method2026(arg1, var3, 2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        ++field4415;
        this.field4428 = class532.method3126(255, this.field4422);
        this.method2027((byte) 73);
        if (arg0) {
            field4417 = null;
        }
        for (int var2 = this.field4419 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field4423[var2];
            if (var3 > 8) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field4419;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public static void method2025(byte arg0) {
        field4417 = null;
        int var1 = 66 % ((34 - arg0) / 38);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[II)V")
    public final void method2026(int arg0, int[] arg1, int arg2) {
        ++field4420;
        int var4 = class385.field5384[arg0] * this.field4425;
        if (arg2 == 2) {
            if (this.field4419 != 1) {
                short var5 = this.field4423[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field4426[0] << 12;
                    int var7 = this.field4430 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = this.field4425 * var6 >> 12;
                    int var10 = var8 >> 12;
                    int var11 = var10 + 1;
                    if (~var9 >= ~var11) {
                        var11 = 0;
                    }
                    int var12 = var8 & 4095;
                    int var13 = 255 & this.field4428[var11 & 255];
                    int var14 = 255 & this.field4428[var10 & 255];
                    int var15 = class199.field2866[var12];
                    for (int var16 = 0; ~class77.field1455 < ~var16; ++var16) {
                        int var36 = class20.field261[var16] * this.field4430;
                        int var37 = this.method2028(var15, (byte) 96, var7, var12, var14, var6 * var36 >> 12, var13);
                        arg1[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; var17 < this.field4419; ++var17) {
                    short var18 = this.field4423[var17];
                    if (~var18 < -9 || ~var18 > 7) {
                        int var19 = this.field4426[var17] << 12;
                        int var20 = var4 * var19 >> 12;
                        int var21 = this.field4425 * var19 >> 12;
                        int var22 = this.field4430 * var19 >> 12;
                        int var23 = var20 >> 12;
                        int var24 = var23 + 1;
                        if (~var24 <= ~var21) {
                            var24 = 0;
                        }
                        int var25 = var20 & 4095;
                        int var26 = class199.field2866[var25];
                        int var27 = 255 & this.field4428[var24 & 255];
                        int var28 = 255 & this.field4428[255 & var23];
                        if (this.field4416 && ~(this.field4419 + -1) == ~var17) {
                            for (int var29 = 0; var29 < class77.field1455; ++var29) {
                                int var30 = class20.field261[var29] * this.field4430;
                                int var31 = this.method2028(var26, (byte) 48, var22, var25, var28, var19 * var30 >> 12, var27);
                                int var32 = arg1[var29] - -(var18 * var31 >> 12);
                                arg1[var29] = 2048 - -(var32 >> 1);
                            }
                        } else {
                            for (int var33 = 0; class77.field1455 > var33; ++var33) {
                                int var34 = class20.field261[var33] * this.field4430;
                                int var35 = this.method2028(var26, (byte) -111, var22, var25, var28, var19 * var34 >> 12, var27);
                                arg1[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field4423[0];
                int var39 = this.field4426[0] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = this.field4425 * var39 >> 12;
                int var42 = this.field4430 * var39 >> 12;
                int var43 = var40 >> 12;
                int var44 = var43 - -1;
                if (~var44 <= ~var41) {
                    var44 = 0;
                }
                int var45 = var40 & 4095;
                int var46 = class199.field2866[var45];
                int var47 = this.field4428[var44 & 255] & 255;
                int var48 = 255 & this.field4428[var43 & 255];
                if (this.field4416) {
                    for (int var49 = 0; class77.field1455 > var49; ++var49) {
                        int var50 = class20.field261[var49] * this.field4430;
                        int var51 = this.method2028(var46, (byte) -117, var42, var45, var48, var39 * var50 >> 12, var47);
                        int var52 = var38 * var51 >> 12;
                        arg1[var49] = 2048 - -(var52 >> 1);
                    }
                } else {
                    for (int var53 = 0; ~var53 > ~class77.field1455; ++var53) {
                        int var54 = class20.field261[var53] * this.field4430;
                        int var55 = this.method2028(var46, (byte) -127, var42, var45, var48, var39 * var54 >> 12, var47);
                        arg1[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V")
    private final void method2027(byte arg0) {
        ++field4432;
        if (~this.field4431 < -1) {
            this.field4423 = new short[this.field4419];
            this.field4426 = new short[this.field4419];
            for (int var2 = 0; var2 < this.field4419; ++var2) {
                this.field4423[var2] = (short) ((int) (Math.pow((double) ((float) this.field4431 / 4096.0F), (double) var2) * 4096.0D));
                this.field4426[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4423 != null && this.field4423.length == this.field4419) {
            this.field4426 = new short[this.field4419];
            for (int var3 = 0; this.field4419 > var3; ++var3) {
                this.field4426[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 < 72) {
            this.method117((byte) -9, 83);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class313() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIIIII)I")
    private final int method2028(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4421;
        int var8 = arg5 >> 12;
        int var9 = 75 % ((arg1 - -57) / 41);
        int var10 = var8 + 1;
        int var11 = var8 & 255;
        if (var10 >= arg2) {
            var10 = 0;
        }
        int var12 = arg5 & 4095;
        int var13 = var12 + -4096;
        int var14 = arg3 + -4096;
        int var15 = var10 & 255;
        int var16 = 3 & this.field4428[arg4 + var11];
        int var17 = class199.field2866[var12];
        int var18;
        if (var16 <= 1) {
            var18 = var16 != 0 ? -var12 + arg3 : arg3 + var12;
        } else {
            var18 = var16 == 2 ? var12 - arg3 : -arg3 + -var12;
        }
        int var19 = this.field4428[arg4 + var15] & 3;
        int var20;
        if (var19 > 1) {
            var20 = ~var19 != -3 ? -arg3 + -var13 : var13 - arg3;
        } else {
            var20 = ~var19 != -1 ? arg3 - var13 : arg3 + var13;
        }
        int var21 = ((-var18 + var20) * var17 >> 12) + var18;
        int var22 = this.field4428[arg6 + var11] & 3;
        int var23;
        if (~var22 >= -2) {
            var23 = ~var22 == -1 ? var12 + var14 : -var12 + var14;
        } else {
            var23 = var22 != 2 ? -var12 + -var14 : var12 - var14;
        }
        int var24 = 3 & this.field4428[arg6 + var15];
        int var25;
        if (~var24 < -2) {
            var25 = ~var24 != -3 ? -var13 + -var14 : -var14 + var13;
        } else {
            var25 = ~var24 != -1 ? -var13 + var14 : var13 + var14;
        }
        int var26 = ((var25 - var23) * var17 >> 12) + var23;
        return ((-var21 + var26) * arg0 >> 12) + var21;
    }
}
