import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class306 extends class397 {

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "Z")
    public boolean field4445 = true;

    @OriginalMember(owner = "client!vq", name = "S", descriptor = "I")
    public int field4451 = 4;

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "[B")
    private byte[] field4447 = new byte[512];

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
    public int field4446 = 0;

    @OriginalMember(owner = "client!vq", name = "X", descriptor = "I")
    public int field4456 = 4;

    @OriginalMember(owner = "client!vq", name = "Y", descriptor = "I")
    public int field4457 = 1638;

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
    public int field4448 = 4;

    @OriginalMember(owner = "client!vq", name = "W", descriptor = "Lwt;")
    public static class194 field4455 = new class194("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!vq", name = "T", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!vq", name = "U", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!vq", name = "V", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!vq", name = "Z", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!vq", name = "ab", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!vq", name = "R", descriptor = "[S")
    private short[] field4450;

    @OriginalMember(owner = "client!vq", name = "bb", descriptor = "[S")
    private short[] field4460;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(B)V")
    public static void method1838(byte arg0) {
        field4455 = null;
        if (arg0 != -10) {
            method1838((byte) -124);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field4444;
        int[] var3 = super.field5854.method465(arg1, 104);
        if (arg0 != -780833076) {
            this.field4448 = -3;
        }
        if (super.field5854.field991) {
            this.method1839(arg1, var3, (byte) 29);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[IB)V")
    public final void method1839(int arg0, int[] arg1, byte arg2) {
        ++field4452;
        int var4 = class447.field6523[arg0] * this.field4451;
        if (arg2 > 4) {
            if (this.field4456 == 1) {
                int var5 = this.field4450[0] << 12;
                short var6 = this.field4460[0];
                int var7 = this.field4451 * var5 >> 12;
                int var8 = this.field4448 * var5 >> 12;
                int var9 = var4 * var5 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                int var12 = var9 & 4095;
                if (var7 <= var11) {
                    var11 = 0;
                }
                int var13 = this.field4447[var11 & 255] & 255;
                int var14 = 255 & this.field4447[var10 & 255];
                int var15 = class220.field3103[var12];
                if (this.field4445) {
                    for (int var16 = 0; class164.field2152 > var16; ++var16) {
                        int var17 = class228.field3210[var16] * this.field4448;
                        int var18 = this.method1841(var8, var15, var14, var13, (byte) 33, var12, var5 * var17 >> 12);
                        int var19 = var6 * var18 >> 12;
                        arg1[var16] = (var19 >> 1) + 2048;
                    }
                } else {
                    for (int var20 = 0; class164.field2152 > var20; ++var20) {
                        int var21 = class228.field3210[var20] * this.field4448;
                        int var22 = this.method1841(var8, var15, var14, var13, (byte) 33, var12, var5 * var21 >> 12);
                        arg1[var20] = var6 * var22 >> 12;
                    }
                }
            } else {
                short var23 = this.field4460[0];
                if (~var23 < -9 || var23 < -8) {
                    int var24 = this.field4450[0] << 12;
                    int var25 = this.field4451 * var24 >> 12;
                    int var26 = this.field4448 * var24 >> 12;
                    int var27 = var4 * var24 >> 12;
                    int var28 = var27 >> 12;
                    int var29 = var28 - -1;
                    if (~var29 <= ~var25) {
                        var29 = 0;
                    }
                    int var30 = var27 & 4095;
                    int var31 = this.field4447[255 & var29] & 255;
                    int var32 = class220.field3103[var30];
                    int var33 = 255 & this.field4447[255 & var28];
                    for (int var34 = 0; class164.field2152 > var34; ++var34) {
                        int var54 = class228.field3210[var34] * this.field4448;
                        int var55 = this.method1841(var26, var32, var33, var31, (byte) 33, var30, var24 * var54 >> 12);
                        arg1[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; ~var35 > ~this.field4456; ++var35) {
                    short var36 = this.field4460[var35];
                    if (~var36 < -9 || ~var36 > 7) {
                        int var37 = this.field4450[var35] << 12;
                        int var38 = this.field4451 * var37 >> 12;
                        int var39 = var4 * var37 >> 12;
                        int var40 = this.field4448 * var37 >> 12;
                        int var41 = var39 >> 12;
                        int var42 = var41 + 1;
                        int var43 = var39 & 4095;
                        if (var38 <= var42) {
                            var42 = 0;
                        }
                        int var44 = this.field4447[255 & var42] & 255;
                        int var45 = 255 & this.field4447[var41 & 255];
                        int var46 = class220.field3103[var43];
                        if (this.field4445 && this.field4456 + -1 == var35) {
                            for (int var47 = 0; ~var47 > ~class164.field2152; ++var47) {
                                int var48 = class228.field3210[var47] * this.field4448;
                                int var49 = this.method1841(var40, var46, var45, var44, (byte) 33, var43, var37 * var48 >> 12);
                                int var50 = (var36 * var49 >> 12) + arg1[var47];
                                arg1[var47] = 2048 - -(var50 >> 1);
                            }
                        } else {
                            for (int var51 = 0; class164.field2152 > var51; ++var51) {
                                int var52 = class228.field3210[var51] * this.field4448;
                                int var53 = this.method1841(var40, var46, var45, var44, (byte) 33, var43, var37 * var52 >> 12);
                                arg1[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field4451 = arg2.method941((byte) 124);
                                }
                            } else {
                                this.field4448 = arg2.method941((byte) 127);
                            }
                        } else {
                            this.field4446 = arg2.method941((byte) 126);
                        }
                    } else {
                        this.field4448 = this.field4451 = arg2.method941((byte) 127);
                    }
                } else {
                    this.field4457 = arg2.method936((byte) -96);
                    if (this.field4457 < 0) {
                        this.field4460 = new short[this.field4456];
                        for (int var5 = 0; this.field4456 > var5; ++var5) {
                            this.field4460[var5] = (short) arg2.method936((byte) -96);
                        }
                    }
                }
            } else {
                this.field4456 = arg2.method941((byte) 124);
            }
        } else {
            this.field4445 = arg2.method941((byte) 125) == 1;
        }
        ++field4453;
        if (arg1 != 80) {
            method1838((byte) 68);
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
    public class306() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V")
    private final void method1840(int arg0) {
        if (arg0 != -1379312980) {
            this.method1841(11, 16, -37, 45, (byte) -79, -106, -123);
        }
        ++field4459;
        if (~this.field4457 >= -1) {
            if (this.field4460 != null && this.field4460.length == this.field4456) {
                this.field4450 = new short[this.field4456];
                for (int var2 = 0; ~var2 > ~this.field4456; ++var2) {
                    this.field4450[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field4460 = new short[this.field4456];
            this.field4450 = new short[this.field4456];
            for (int var3 = 0; var3 < this.field4456; ++var3) {
                this.field4460[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field4457 / 4096.0F), (double) var3)));
                this.field4450[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        ++field4458;
        this.field4447 = class3.method17((byte) -69, this.field4446);
        this.method1840(-1379312980);
        for (int var2 = this.field4456 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field4460[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field4456;
        }
        if (arg0 != 255) {
            this.field4451 = 106;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIBII)I")
    private final int method1841(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field4449;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        if (arg0 <= var9) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg6 & 4095;
        int var12 = arg5 - 4096;
        if (arg4 != 33) {
            this.method24(-51);
        }
        int var13 = var11 + -4096;
        int var14 = var9 & 255;
        int var15 = class220.field3103[var11];
        int var16 = 3 & this.field4447[arg2 + var10];
        int var17;
        if (var16 <= 1) {
            var17 = var16 != 0 ? -var11 + arg5 : arg5 + var11;
        } else {
            var17 = var16 == 2 ? -arg5 + var11 : -arg5 + -var11;
        }
        int var18 = 3 & this.field4447[var14 - -arg2];
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? -arg5 + var13 : -arg5 + -var13;
        } else {
            var19 = ~var18 != -1 ? -var13 + arg5 : arg5 + var13;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = this.field4447[arg3 + var10] & 3;
        int var22;
        if (~var21 >= -2) {
            var22 = var21 != 0 ? -var11 + var12 : var11 - -var12;
        } else {
            var22 = ~var21 != -3 ? -var11 + -var12 : var11 - var12;
        }
        int var23 = 3 & this.field4447[var14 - -arg3];
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 != -3 ? -var12 + -var13 : -var12 + var13;
        } else {
            var24 = var23 != 0 ? var12 - var13 : var13 - -var12;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return var20 - -((-var20 + var25) * arg1 >> 12);
    }
}
