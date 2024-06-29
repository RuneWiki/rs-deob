import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 extends class45 {

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    public int field539 = 0;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "[B")
    private byte[] field541 = new byte[512];

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public int field537 = 4;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    public int field545 = 4;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public int field544 = 4;

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "Z")
    public boolean field553 = true;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "I")
    public int field548 = 1638;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "Liv;")
    public static class64 field542;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "Lhl;")
    public static class366 field552;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "[S")
    private short[] field535;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "[S")
    private short[] field538;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field536;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field537 = arg0.method1063((byte) -97);
                                }
                            } else {
                                this.field545 = arg0.method1063((byte) -42);
                            }
                        } else {
                            this.field539 = arg0.method1063((byte) 117);
                        }
                    } else {
                        this.field545 = this.field537 = arg0.method1063((byte) -42);
                    }
                } else {
                    this.field548 = arg0.method1122(65280);
                    if (~this.field548 > -1) {
                        this.field538 = new short[this.field544];
                        for (int var5 = 0; ~var5 > ~this.field544; ++var5) {
                            this.field538[var5] = (short) arg0.method1122(arg1 + 91751);
                        }
                    }
                }
            } else {
                this.field544 = arg0.method1063((byte) 108);
            }
        } else {
            this.field553 = arg0.method1063((byte) 106) == 1;
        }
        if (arg1 != -26471) {
            this.method310(-61);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[IB)V")
    public final void method308(int arg0, int[] arg1, byte arg2) {
        ++field549;
        int var4 = class433.field6429[arg0] * this.field537;
        if (this.field544 != 1) {
            short var5 = this.field538[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field535[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field545 * var6 >> 12;
                int var9 = this.field537 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                int var12 = var7 & 4095;
                if (var11 >= var9) {
                    var11 = 0;
                }
                int var13 = class464.field6943[var12];
                int var14 = this.field541[255 & var11] & 255;
                int var15 = 255 & this.field541[255 & var10];
                for (int var16 = 0; ~class259.field3768 < ~var16; ++var16) {
                    int var36 = class69.field1199[var16] * this.field545;
                    int var37 = this.method309(var12, var15, var13, var6 * var36 >> 12, (byte) 120, var8, var14);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field544 > var17; ++var17) {
                short var18 = this.field538[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field535[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field537 * var19 >> 12;
                    int var22 = this.field545 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var20 & 4095;
                    if (~var24 <= ~var21) {
                        var24 = 0;
                    }
                    int var26 = 255 & this.field541[var24 & 255];
                    int var27 = 255 & this.field541[255 & var23];
                    int var28 = class464.field6943[var25];
                    if (this.field553 && this.field544 - 1 == var17) {
                        for (int var29 = 0; ~var29 > ~class259.field3768; ++var29) {
                            int var30 = class69.field1199[var29] * this.field545;
                            int var31 = this.method309(var25, var27, var28, var19 * var30 >> 12, (byte) 120, var22, var26);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class259.field3768; ++var33) {
                            int var34 = class69.field1199[var33] * this.field545;
                            int var35 = this.method309(var25, var27, var28, var19 * var34 >> 12, (byte) 120, var22, var26);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field535[0] << 12;
            short var39 = this.field538[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field537 * var38 >> 12;
            int var42 = this.field545 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            int var45 = var40 & 4095;
            if (var44 >= var41) {
                var44 = 0;
            }
            int var46 = this.field541[255 & var43] & 255;
            int var47 = class464.field6943[var45];
            int var48 = this.field541[var44 & 255] & 255;
            if (!this.field553) {
                for (int var49 = 0; class259.field3768 > var49; ++var49) {
                    int var50 = class69.field1199[var49] * this.field545;
                    int var51 = this.method309(var45, var46, var47, var38 * var50 >> 12, (byte) 120, var42, var48);
                    arg1[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~class259.field3768 < ~var52; ++var52) {
                    int var53 = class69.field1199[var52] * this.field545;
                    int var54 = this.method309(var45, var46, var47, var38 * var53 >> 12, (byte) 120, var42, var48);
                    int var55 = var39 * var54 >> 12;
                    arg1[var52] = (var55 >> 1) + 2048;
                }
            }
        }
        if (arg2 != 126) {
            this.method308(-101, (int[]) null, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIBII)I")
    private final int method309(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field551;
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (~arg5 >= ~var9) {
            var9 = 0;
        }
        int var11 = arg3 & 4095;
        int var12 = var9 & 255;
        int var13 = arg0 - 4096;
        int var14 = var11 + -4096;
        int var15 = this.field541[arg1 + var10] & 3;
        int var16 = class464.field6943[var11];
        int var17;
        if (~var15 < -2) {
            var17 = var15 == 2 ? -arg0 + var11 : -arg0 + -var11;
        } else {
            var17 = var15 == 0 ? arg0 + var11 : -var11 + arg0;
        }
        int var18 = 3 & this.field541[arg1 + var12];
        int var19;
        if (var18 > 1) {
            var19 = ~var18 != -3 ? -arg0 + -var14 : -arg0 + var14;
        } else {
            var19 = ~var18 == -1 ? var14 - -arg0 : -var14 + arg0;
        }
        int var20 = ((var19 - var17) * var16 >> 12) + var17;
        if (arg4 != 120) {
            return 77;
        } else {
            int var21 = 3 & this.field541[arg6 + var10];
            int var22;
            if (~var21 < -2) {
                var22 = ~var21 != -3 ? -var11 + -var13 : -var13 + var11;
            } else {
                var22 = ~var21 != -1 ? -var11 + var13 : var11 + var13;
            }
            int var23 = this.field541[arg6 + var12] & 3;
            int var24;
            if (var23 > 1) {
                var24 = var23 == 2 ? -var13 + var14 : -var13 + -var14;
            } else {
                var24 = var23 != 0 ? var13 - var14 : var13 + var14;
            }
            int var25 = ((var24 - var22) * var16 >> 12) + var22;
            return ((-var20 + var25) * arg2 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field546;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field854.method863((byte) 12, arg1);
            if (super.field854.field1928) {
                this.method308(arg1, var3, (byte) 126);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
    private final void method310(int arg0) {
        if (~this.field548 < -1) {
            this.field535 = new short[this.field544];
            this.field538 = new short[this.field544];
            for (int var2 = 0; this.field544 > var2; ++var2) {
                this.field538[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field548 / 4096.0F), (double) var2)));
                this.field535[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field538 != null && this.field538.length == this.field544) {
            this.field535 = new short[this.field544];
            for (int var3 = 0; ~this.field544 < ~var3; ++var3) {
                this.field535[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field534;
        if (arg0 >= -43) {
            this.method308(-74, (int[]) null, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class25() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static void method311(boolean arg0) {
        if (arg0) {
            method313(true);
        }
        field552 = null;
        field542 = null;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Ldj;")
    public static final class227 method312(int arg0, int arg1) {
        if (arg0 > -31) {
            method313(false);
        }
        ++field550;
        class227 var2 = (class227) class308.field4696.method2289(126, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class201.field2946.method114(0, arg1, 125);
            if (var3 != null && var3.length > 1) {
                class227 var4 = class260.method1687((byte) 46, var3);
                class308.field4696.method2287((long) arg1, (byte) 73, var4);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Z)V")
    public static final void method313(boolean arg0) {
        ++field540;
        if (class427.field6349 != null) {
            class427.field6349.method664(84);
        }
        if (!arg0) {
            if (class199.field2921 != null) {
                class199.field2921.method664(115);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V")
    public final void method38(int arg0) {
        if (arg0 == 4095) {
            this.field541 = class89.method694(this.field539, 512);
            ++field547;
            this.method310(arg0 ^ -3992);
            for (int var2 = this.field544 + -1; var2 >= 1; --var2) {
                short var3 = this.field538[var2];
                if (~var3 < -9) {
                    return;
                }
                if (~var3 > 7) {
                    return;
                }
                --this.field544;
            }
        }
    }

    static {
        new class342("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field543 = 765;
        field542 = new class64(58, -2);
        field552 = new class366(16);
    }
}
