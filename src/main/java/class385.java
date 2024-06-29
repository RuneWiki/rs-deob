import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class385 extends class398 {

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public int field5569 = 4;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "[B")
    private byte[] field5577 = new byte[512];

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public int field5579 = 1638;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public int field5573 = 0;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public int field5576 = 4;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
    public int field5582 = 4;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "Z")
    public boolean field5584 = true;

    @OriginalMember(owner = "client!fl", name = "bb", descriptor = "Lke;")
    public static class162 field5587 = new class162();

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "Llm;")
    public static class347 field5583;

    @OriginalMember(owner = "client!fl", name = "cb", descriptor = "Lii;")
    public static class405 field5588;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "[S")
    private short[] field5571;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "[S")
    private short[] field5580;

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 4)
    public class385() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lnj;II)V", line = 10)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 == -13132) {
            ++field5574;
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    this.field5576 = arg0.method1348(arg2 ^ 13093);
                } else {
                    if (arg1 != 2) {
                        if (~arg1 == -4) {
                            this.field5582 = this.field5569 = arg0.method1348(-125);
                            return;
                        }
                        if (arg1 == 4) {
                            this.field5573 = arg0.method1348(arg2 + 13045);
                            return;
                        }
                        if (~arg1 == -6) {
                            this.field5582 = arg0.method1348(-128);
                            return;
                        }
                        if (~arg1 == -7) {
                            this.field5569 = arg0.method1348(arg2 + 13023);
                            return;
                        }
                    } else {
                        this.field5579 = arg0.method1319((byte) -13);
                        if (~this.field5579 > -1) {
                            this.field5580 = new short[this.field5576];
                            for (int var5 = 0; var5 < this.field5576; ++var5) {
                                this.field5580[var5] = (short) arg0.method1319((byte) -13);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field5584 = arg0.method1348(-122) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I", line = 102)
    public final int[] method95(int arg0, int arg1) {
        ++field5586;
        if (arg1 != 0) {
            this.field5580 = null;
        }
        int[] var3 = super.field5927.method305(arg0, (byte) 124);
        if (super.field5927.field591) {
            this.method2480(arg1 ^ 255, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 142)
    public final void method209(int arg0) {
        this.field5577 = class335.method2206(true, this.field5573);
        ++field5581;
        this.method2482((byte) 26);
        for (int var2 = this.field5576 + -1; var2 >= 1; --var2) {
            short var3 = this.field5580[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field5576;
        }
        if (arg0 != 16) {
            method2481(true);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(IB)V", line = 172)
    public static final void method2478(int arg0, byte arg1) {
        class333.field4826.method1142((byte) -52, arg0);
        if (arg1 != -11) {
            method2481(false);
        }
        ++field5578;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIII)I", line = 190)
    private final int method2479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5570;
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (var9 >= arg2) {
            var9 = 0;
        }
        int var11 = arg3 & 4095;
        int var12 = arg6 + -4096;
        int var13 = var11 + -4096;
        if (arg1 != -604) {
            return -96;
        } else {
            int var14 = var9 & 255;
            int var15 = 3 & this.field5577[var10 - -arg0];
            int var16 = class281.field4091[var11];
            int var17;
            if (var15 <= 1) {
                var17 = ~var15 != -1 ? -var11 + arg6 : arg6 + var11;
            } else {
                var17 = ~var15 == -3 ? -arg6 + var11 : -arg6 + -var11;
            }
            int var18 = this.field5577[arg0 + var14] & 3;
            int var19;
            if (var18 > 1) {
                var19 = var18 != 2 ? -arg6 + -var13 : var13 - arg6;
            } else {
                var19 = ~var18 == -1 ? arg6 + var13 : -var13 + arg6;
            }
            int var20 = 3 & this.field5577[var10 - -arg5];
            int var21 = var17 - -((-var17 + var19) * var16 >> 12);
            int var22;
            if (var20 > 1) {
                var22 = var20 != 2 ? -var11 - var12 : var11 - var12;
            } else {
                var22 = ~var20 != -1 ? var12 - var11 : var11 + var12;
            }
            int var23 = 3 & this.field5577[arg5 + var14];
            int var24;
            if (var23 <= 1) {
                var24 = ~var23 != -1 ? -var13 + var12 : var12 + var13;
            } else {
                var24 = ~var23 != -3 ? -var12 + -var13 : -var12 + var13;
            }
            int var25 = ((var24 - var22) * var16 >> 12) + var22;
            return var21 - -((-var21 + var25) * arg4 >> 12);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[II)V", line = 278)
    public final void method2480(int arg0, int[] arg1, int arg2) {
        ++field5572;
        int var4 = class84.field1206[arg2] * this.field5569;
        if (arg0 != 255) {
            this.method208((class228) null, 71, -32);
        }
        if (this.field5576 != 1) {
            short var5 = this.field5580[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field5571[0] << 12;
                int var7 = this.field5582 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field5569 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 - -1;
                if (~var11 <= ~var9) {
                    var11 = 0;
                }
                int var12 = var8 & 4095;
                int var13 = this.field5577[255 & var10] & 255;
                int var14 = class281.field4091[var12];
                int var15 = 255 & this.field5577[255 & var11];
                for (int var16 = 0; ~var16 > ~class140.field1922; ++var16) {
                    int var36 = class375.field5448[var16] * this.field5582;
                    int var37 = this.method2479(var13, -604, var7, var6 * var36 >> 12, var14, var15, var12);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~var17 > ~this.field5576; ++var17) {
                short var18 = this.field5580[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field5571[var17] << 12;
                    int var20 = this.field5569 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field5582 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var21 & 4095;
                    if (var24 >= var20) {
                        var24 = 0;
                    }
                    int var26 = class281.field4091[var25];
                    int var27 = this.field5577[255 & var24] & 255;
                    int var28 = 255 & this.field5577[var23 & 255];
                    if (this.field5584 && this.field5576 + -1 == var17) {
                        for (int var29 = 0; var29 < class140.field1922; ++var29) {
                            int var30 = class375.field5448[var29] * this.field5582;
                            int var31 = this.method2479(var28, arg0 + -859, var22, var19 * var30 >> 12, var26, var27, var25);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; class140.field1922 > var33; ++var33) {
                            int var34 = class375.field5448[var33] * this.field5582;
                            int var35 = this.method2479(var28, -604, var22, var19 * var34 >> 12, var26, var27, var25);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field5580[0];
            int var39 = this.field5571[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = this.field5582 * var39 >> 12;
            int var42 = this.field5569 * var39 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            int var45 = var40 & 4095;
            if (var44 >= var42) {
                var44 = 0;
            }
            int var46 = 255 & this.field5577[var44 & 255];
            int var47 = class281.field4091[var45];
            int var48 = this.field5577[var43 & 255] & 255;
            if (this.field5584) {
                for (int var49 = 0; class140.field1922 > var49; ++var49) {
                    int var50 = class375.field5448[var49] * this.field5582;
                    int var51 = this.method2479(var48, -604, var41, var39 * var50 >> 12, var47, var46, var45);
                    int var52 = var38 * var51 >> 12;
                    arg1[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; ~class140.field1922 < ~var53; ++var53) {
                    int var54 = class375.field5448[var53] * this.field5582;
                    int var55 = this.method2479(var48, -604, var41, var39 * var54 >> 12, var47, var46, var45);
                    arg1[var53] = var38 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(Z)V", line = 449)
    public static void method2481(boolean arg0) {
        field5588 = null;
        if (!arg0) {
            field5583 = null;
            field5587 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V", line = 461)
    private final void method2482(byte arg0) {
        ++field5585;
        if (~this.field5579 < -1) {
            this.field5580 = new short[this.field5576];
            this.field5571 = new short[this.field5576];
            for (int var2 = 0; ~var2 > ~this.field5576; ++var2) {
                this.field5580[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field5579 / 4096.0F), (double) var2)));
                this.field5571[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field5580 != null && this.field5580.length == this.field5576) {
            this.field5571 = new short[this.field5576];
            for (int var3 = 0; var3 < this.field5576; ++var3) {
                this.field5571[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 < 3) {
            this.method209(-126);
        }
    }
}
