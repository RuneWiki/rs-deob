import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class65 extends class512 {

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public int field959 = 1638;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Z")
    public boolean field957 = true;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public int field960 = 4;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public int field966 = 4;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public int field967 = 0;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "[B")
    private byte[] field973 = new byte[512];

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
    public int field974 = 4;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "Lvv;")
    public static class313 field972 = new class313(8, 3);

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "Lug;")
    public static class322 field975;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "[S")
    private short[] field968;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "[S")
    private short[] field970;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field958;
        if (!arg0) {
            this.field960 = -84;
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field966 = arg2.method126((byte) -73);
            } else {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field960 = this.field974 = arg2.method126((byte) -124);
                        return;
                    }
                    if (~arg1 == -5) {
                        this.field967 = arg2.method126((byte) -97);
                        return;
                    }
                    if (arg1 == 5) {
                        this.field960 = arg2.method126((byte) -97);
                        return;
                    }
                    if (~arg1 == -7) {
                        this.field974 = arg2.method126((byte) -123);
                        return;
                    }
                } else {
                    this.field959 = arg2.method170(492756037);
                    if (this.field959 < 0) {
                        this.field970 = new short[this.field966];
                        for (int var5 = 0; var5 < this.field966; ++var5) {
                            this.field970[var5] = (short) arg2.method170(492756037);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field957 = arg2.method126((byte) -82) == 1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    public final void method74(int arg0) {
        this.field973 = class78.method569((byte) -95, this.field967);
        ++field965;
        this.method427(2);
        int var2 = this.field966 + -1;
        if (arg0 != 12388) {
            field975 = null;
        }
        while (~var2 <= -2) {
            short var3 = this.field970[var2];
            if (var3 > 8 || var3 < -8) {
                return;
            }
            --this.field966;
            --var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIZI)I")
    private final int method423(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field962;
        if (!arg5) {
            this.method75(87, (byte) 9);
        }
        int var8 = arg1 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (var9 >= arg6) {
            var9 = 0;
        }
        int var11 = arg1 & 4095;
        int var12 = arg3 + -4096;
        int var13 = var9 & 255;
        int var14 = var11 + -4096;
        int var15 = class515.field7623[var11];
        int var16 = 3 & this.field973[arg4 + var10];
        int var17;
        if (var16 <= 1) {
            var17 = var16 != 0 ? -var11 + arg3 : arg3 + var11;
        } else {
            var17 = var16 != 2 ? -arg3 + -var11 : -arg3 + var11;
        }
        int var18 = 3 & this.field973[arg4 + var13];
        int var19;
        if (var18 <= 1) {
            var19 = var18 != 0 ? -var14 + arg3 : var14 - -arg3;
        } else {
            var19 = var18 == 2 ? -arg3 + var14 : -arg3 + -var14;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = this.field973[arg2 + var10] & 3;
        int var22;
        if (~var21 < -2) {
            var22 = var21 == 2 ? -var12 + var11 : -var11 + -var12;
        } else {
            var22 = var21 != 0 ? -var11 + var12 : var11 + var12;
        }
        int var23 = 3 & this.field973[arg2 + var13];
        int var24;
        if (var23 > 1) {
            var24 = ~var23 == -3 ? -var12 + var14 : -var14 - var12;
        } else {
            var24 = ~var23 == -1 ? var12 + var14 : var12 - var14;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg0 >> 12) + var20;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        ++field964;
        int[] var3 = super.field7494.method232(arg0, true);
        int var4 = -6 % ((arg1 - 43) / 48);
        if (super.field7494.field474) {
            this.method425(var3, -22048, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public static void method424(int arg0) {
        field975 = null;
        if (arg0 >= -24) {
            method426(85, 19, false, true, 120);
        }
        field972 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([III)V")
    public final void method425(int[] arg0, int arg1, int arg2) {
        if (arg1 == -22048) {
            ++field963;
            int var4 = class412.field6233[arg2] * this.field974;
            if (~this.field966 != -2) {
                short var5 = this.field970[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field968[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = this.field974 * var6 >> 12;
                    int var9 = this.field960 * var6 >> 12;
                    int var10 = var7 >> 12;
                    int var11 = var10 + 1;
                    int var12 = var7 & 4095;
                    if (~var11 <= ~var8) {
                        var11 = 0;
                    }
                    int var13 = 255 & this.field973[255 & var11];
                    int var14 = 255 & this.field973[255 & var10];
                    int var15 = class515.field7623[var12];
                    for (int var16 = 0; ~class402.field6113 < ~var16; ++var16) {
                        int var36 = class276.field4540[var16] * this.field960;
                        int var37 = this.method423(var15, var6 * var36 >> 12, var13, var12, var14, true, var9);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field966; ++var17) {
                    short var18 = this.field970[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field968[var17] << 12;
                        int var20 = this.field974 * var19 >> 12;
                        int var21 = this.field960 * var19 >> 12;
                        int var22 = var4 * var19 >> 12;
                        int var23 = var22 >> 12;
                        int var24 = var23 + 1;
                        if (var24 >= var20) {
                            var24 = 0;
                        }
                        int var25 = var22 & 4095;
                        int var26 = 255 & this.field973[var24 & 255];
                        int var27 = class515.field7623[var25];
                        int var28 = this.field973[var23 & 255] & 255;
                        if (this.field957 && this.field966 - 1 == var17) {
                            for (int var29 = 0; ~var29 > ~class402.field6113; ++var29) {
                                int var30 = class276.field4540[var29] * this.field960;
                                int var31 = this.method423(var27, var19 * var30 >> 12, var26, var25, var28, true, var21);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; var33 < class402.field6113; ++var33) {
                                int var34 = class276.field4540[var33] * this.field960;
                                int var35 = this.method423(var27, var19 * var34 >> 12, var26, var25, var28, true, var21);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field968[0] << 12;
                short var39 = this.field970[0];
                int var40 = var4 * var38 >> 12;
                int var41 = this.field960 * var38 >> 12;
                int var42 = this.field974 * var38 >> 12;
                int var43 = var40 >> 12;
                int var44 = var43 + 1;
                int var45 = var40 & 4095;
                if (~var44 <= ~var42) {
                    var44 = 0;
                }
                int var46 = 255 & this.field973[var44 & 255];
                int var47 = class515.field7623[var45];
                int var48 = this.field973[var43 & 255] & 255;
                if (!this.field957) {
                    for (int var49 = 0; ~var49 > ~class402.field6113; ++var49) {
                        int var50 = class276.field4540[var49] * this.field960;
                        int var51 = this.method423(var47, var38 * var50 >> 12, var46, var45, var48, true, var41);
                        arg0[var49] = var39 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; ~var52 > ~class402.field6113; ++var52) {
                        int var53 = class276.field4540[var52] * this.field960;
                        int var54 = this.method423(var47, var38 * var53 >> 12, var46, var45, var48, true, var41);
                        int var55 = var39 * var54 >> 12;
                        arg0[var52] = (var55 >> 1) + 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class65() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZZI)I")
    public static final int method426(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field971;
        class112 var5 = class295.method1888(arg2, arg4, (byte) 113);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            int var7 = 0;
            if (arg0 != -2) {
                field972 = null;
            }
            while (~var7 > ~var5.field1971.length) {
                if (~var5.field1971[var7] <= -1 && ~class20.field218.field5385 < ~var5.field1971[var7]) {
                    class104 var8 = class20.field218.method2221(var5.field1971[var7], -1);
                    int var9 = var8.method711(class213.field3383.method2258(true, arg1).field3853, arg1, (byte) 119);
                    if (arg3) {
                        var6 += var5.field1973[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
                ++var7;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
    private final void method427(int arg0) {
        if (this.field959 <= 0) {
            if (this.field970 != null && ~this.field970.length == ~this.field966) {
                this.field968 = new short[this.field966];
                for (int var2 = 0; ~this.field966 < ~var2; ++var2) {
                    this.field968[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field970 = new short[this.field966];
            this.field968 = new short[this.field966];
            for (int var3 = 0; var3 < this.field966; ++var3) {
                this.field970[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field959 / 4096.0F), (double) var3)));
                this.field968[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 2) {
            this.field974 = -6;
        }
        ++field969;
    }
}
