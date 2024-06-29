import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 extends class198 {

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    private int field508 = 4;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "[B")
    private byte[] field515 = new byte[512];

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    private int field510 = 4;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "Z")
    private boolean field516 = true;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    private int field524 = 1638;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    private int field525 = 4;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    private int field512 = 0;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public static int field517 = -1;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "Lt;")
    public static class212 field513;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "[S")
    private short[] field520;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "[S")
    private short[] field523;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method262(String arg0, int arg1, int arg2, String arg3) {
        if (arg2 > -30) {
            field517 = -81;
        }
        class36.field469 = arg0;
        class11.field146 = arg1;
        ++field518;
        class217.field3453 = arg3;
        if (!class217.field3453.equals("") && !class36.field469.equals("")) {
            if (~class285.field4763 != 0) {
                class264.method1823(102);
            } else {
                class198.field3133 = -3;
                class72.field1044 = 0;
                class144.field2266 = 0;
                class189.field2916 = 1;
                class202 var4 = new class202(128);
                var4.method1446((byte) 29, 10);
                var4.method1425((int) (9.9999999E7D * Math.random()), (byte) -126);
                var4.method1413(-349748560, class294.method2051(-107, class217.field3453));
                var4.method1425((int) (9.9999999E7D * Math.random()), (byte) -126);
                var4.method1409(class36.field469, (byte) 77);
                var4.method1425((int) (9.9999999E7D * Math.random()), (byte) -120);
                var4.method1441((byte) -114, class60.field912, class105.field1572);
                class276.field4572.field3272 = 0;
                class276.field4572.method1446((byte) 43, 24);
                class276.field4572.method1446((byte) 98, var4.field3272 + 2);
                class276.field4572.method1412(553, false);
                class276.field4572.method1453(var4.field3234, 0, var4.field3272, (byte) -12);
            }
        } else {
            class198.field3133 = 3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIZI)I")
    private final int method263(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            return 37;
        } else {
            ++field519;
            int var8 = arg3 - 4096;
            int var9 = arg1 >> 12;
            int var10 = var9 + 1;
            int var11 = arg1 & 4095;
            int var12 = var11 - 4096;
            int var13 = var9 & 255;
            if (~arg6 >= ~var10) {
                var10 = 0;
            }
            int var14 = class260.field4263[var11];
            int var15 = var10 & 255;
            int var16 = this.field515[var13 - -arg4] & 3;
            int var17;
            if (~var16 < -2) {
                var17 = ~var16 == -3 ? -arg3 + var11 : -var11 - arg3;
            } else {
                var17 = var16 != 0 ? -var11 + arg3 : var11 - -arg3;
            }
            int var18 = this.field515[arg4 + var15] & 3;
            int var19;
            if (~var18 < -2) {
                var19 = var18 == 2 ? -arg3 + var12 : -arg3 + -var12;
            } else {
                var19 = var18 == 0 ? var12 - -arg3 : -var12 + arg3;
            }
            int var20 = var17 - -((-var17 + var19) * var14 >> 12);
            int var21 = this.field515[var13 - -arg0] & 3;
            int var22;
            if (var21 > 1) {
                var22 = ~var21 != -3 ? -var8 + -var11 : -var8 + var11;
            } else {
                var22 = var21 == 0 ? var8 + var11 : -var11 + var8;
            }
            int var23 = this.field515[arg0 + var15] & 3;
            int var24;
            if (~var23 < -2) {
                var24 = var23 == 2 ? -var8 + var12 : -var12 - var8;
            } else {
                var24 = var23 != 0 ? var8 - var12 : var8 + var12;
            }
            int var25 = ((-var22 + var24) * var14 >> 12) + var22;
            return var20 - -((-var20 + var25) * arg2 >> 12);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        this.field515 = class65.method418(this.field512, (byte) -82);
        this.method266((byte) 76);
        int var2 = this.field510 - 1;
        int var3 = 115 % ((arg0 - -46) / 47);
        while (var2 >= 1) {
            short var4 = this.field523[var2];
            if (~var4 < -9 || ~var4 > 7) {
                break;
            }
            --this.field510;
            --var2;
        }
        ++field522;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)V")
    public static void method264(int arg0) {
        field513 = null;
        if (arg0 != 1) {
            field517 = 61;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field525 = arg1.method1420((byte) 0);
                                }
                            } else {
                                this.field508 = arg1.method1420((byte) 0);
                            }
                        } else {
                            this.field512 = arg1.method1420((byte) 0);
                        }
                    } else {
                        this.field508 = this.field525 = arg1.method1420((byte) 0);
                    }
                } else {
                    this.field524 = arg1.method1442(-1970239824);
                    if (~this.field524 > -1) {
                        this.field523 = new short[this.field510];
                        for (int var5 = 0; var5 < this.field510; ++var5) {
                            this.field523[var5] = (short) arg1.method1442(-1970239824);
                        }
                    }
                }
            } else {
                this.field510 = arg1.method1420((byte) 0);
            }
        } else {
            this.field516 = ~arg1.method1420((byte) 0) == -2;
        }
        int var6 = -125 % ((60 - arg0) / 61);
        ++field521;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[II)V")
    private final void method265(byte arg0, int[] arg1, int arg2) {
        ++field509;
        int var4 = class42.field591[arg2] * this.field525;
        if (arg0 >= -110) {
            this.field515 = null;
        }
        if (~this.field510 != -2) {
            short var5 = this.field523[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field520[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = var7 >> 12;
                int var9 = var7 & 4095;
                int var10 = this.field525 * var6 >> 12;
                int var11 = var8 - -1;
                int var12 = this.field515[255 & var8] & 255;
                if (~var10 >= ~var11) {
                    var11 = 0;
                }
                int var13 = this.field508 * var6 >> 12;
                int var14 = class260.field4263[var9];
                int var15 = 255 & this.field515[var11 & 255];
                for (int var16 = 0; ~var16 > ~class42.field590; ++var16) {
                    int var36 = class152.field2367[var16] * this.field508;
                    int var37 = this.method263(var15, var6 * var36 >> 12, var14, var9, var12, false, var13);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field510 < ~var17; ++var17) {
                short var18 = this.field523[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field520[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = var20 >> 12;
                    int var22 = this.field515[255 & var21] & 255;
                    int var23 = this.field508 * var19 >> 12;
                    int var24 = this.field525 * var19 >> 12;
                    int var25 = var21 - -1;
                    if (var25 >= var24) {
                        var25 = 0;
                    }
                    int var26 = var20 & 4095;
                    int var27 = class260.field4263[var26];
                    int var28 = 255 & this.field515[var25 & 255];
                    if (this.field516 && this.field510 + -1 == var17) {
                        for (int var29 = 0; ~class42.field590 < ~var29; ++var29) {
                            int var30 = class152.field2367[var29] * this.field508;
                            int var31 = this.method263(var28, var19 * var30 >> 12, var27, var26, var22, false, var23);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class42.field590; ++var33) {
                            int var34 = class152.field2367[var33] * this.field508;
                            int var35 = this.method263(var28, var19 * var34 >> 12, var27, var26, var22, false, var23);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field523[0];
            int var39 = this.field520[0] << 12;
            int var40 = this.field508 * var39 >> 12;
            int var41 = this.field525 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            int var45 = var42 & 4095;
            if (var41 <= var44) {
                var44 = 0;
            }
            int var46 = class260.field4263[var45];
            int var47 = this.field515[var43 & 255] & 255;
            int var48 = 255 & this.field515[255 & var44];
            if (this.field516) {
                for (int var49 = 0; ~class42.field590 < ~var49; ++var49) {
                    int var50 = class152.field2367[var49] * this.field508;
                    int var51 = this.method263(var48, var39 * var50 >> 12, var46, var45, var47, false, var40);
                    int var52 = var38 * var51 >> 12;
                    arg1[var49] = 2048 - -(var52 >> 1);
                }
            } else {
                for (int var53 = 0; var53 < class42.field590; ++var53) {
                    int var54 = class152.field2367[var53] * this.field508;
                    int var55 = this.method263(var48, var39 * var54 >> 12, var46, var45, var47, false, var40);
                    arg1[var53] = var38 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V")
    private final void method266(byte arg0) {
        if (arg0 != 76) {
            method264(-12);
        }
        ++field514;
        if (~this.field524 >= -1) {
            if (this.field523 != null && this.field523.length == this.field510) {
                this.field520 = new short[this.field510];
                for (int var2 = 0; ~this.field510 < ~var2; ++var2) {
                    this.field520[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field523 = new short[this.field510];
            this.field520 = new short[this.field510];
            for (int var3 = 0; ~var3 > ~this.field510; ++var3) {
                this.field523[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field524 / 4096.0F), (double) var3)));
                this.field520[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field511;
            int[] var3 = super.field3134.method36(arg1, 30672);
            if (super.field3134.field69) {
                this.method265((byte) -122, var3, arg1);
            }
            return var3;
        }
    }
}
