import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class36 extends class478 {

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public int field354 = 1638;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public int field361 = 4;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "[B")
    private byte[] field360 = new byte[512];

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public int field366 = 4;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public int field358 = 4;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "Z")
    public boolean field367 = true;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public int field364 = 0;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field365 = 0;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lnd;")
    public static class689 field355 = new class689();

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    public static int field369 = 0;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "Lsea;")
    public static class319 field371 = new class319();

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "[C")
    public static char[] field375 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "Lnh;")
    public static class680 field374;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "[S")
    private short[] field368;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "[S")
    private short[] field370;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
    public static void method188(int arg0) {
        field375 = null;
        field355 = null;
        field371 = null;
        field374 = null;
        if (arg0 >= -83) {
            field372 = -52;
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
    private final void method189(int arg0) {
        ++field356;
        if (arg0 != -31435) {
            method188(86);
        }
        if (~this.field354 < -1) {
            this.field370 = new short[this.field366];
            this.field368 = new short[this.field366];
            for (int var2 = 0; ~this.field366 < ~var2; ++var2) {
                this.field368[var2] = (short) ((int) (Math.pow((double) ((float) this.field354 / 4096.0F), (double) var2) * 4096.0D));
                this.field370[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field368 != null && ~this.field368.length == ~this.field366) {
            this.field370 = new short[this.field366];
            for (int var3 = 0; ~this.field366 < ~var3; ++var3) {
                this.field370[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class36() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)I")
    private final int method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field363;
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg3 & 4095;
        if (~var9 <= ~arg4) {
            var9 = 0;
        }
        int var12 = var11 + -4096;
        int var13 = var9 & 255;
        int var14 = arg1 + -4096;
        int var15 = class182.field2039[var11];
        int var16 = this.field360[var10 - -arg6] & 3;
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? -arg1 + var11 : -var11 - arg1;
        } else {
            var17 = var16 != 0 ? arg1 - var11 : arg1 + var11;
        }
        int var18 = this.field360[arg6 + var13] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 == -1 ? var12 - -arg1 : -var12 + arg1;
        } else {
            var19 = var18 == 2 ? -arg1 + var12 : -arg1 + -var12;
        }
        int var20 = ((var19 - var17) * var15 >> 12) + var17;
        int var21 = 3 & this.field360[var10 - -arg0];
        int var22;
        if (var21 <= 1) {
            var22 = ~var21 != -1 ? -var11 + var14 : var11 - -var14;
        } else {
            var22 = ~var21 == -3 ? -var14 + var11 : -var11 - var14;
        }
        if (arg2 != -1) {
            return 47;
        } else {
            int var23 = 3 & this.field360[arg0 + var13];
            int var24;
            if (var23 <= 1) {
                var24 = ~var23 != -1 ? -var12 + var14 : var12 + var14;
            } else {
                var24 = ~var23 == -3 ? -var14 + var12 : -var12 - var14;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return var20 - -((-var20 + var25) * arg5 >> 12);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[I)V")
    public final void method191(int arg0, int arg1, int[] arg2) {
        ++field362;
        int var4 = class695.field9740[arg1] * this.field358;
        if (arg0 < 100) {
            this.method190(53, -53, -93, -85, -93, 91, -63);
        }
        if (~this.field366 == -2) {
            short var5 = this.field368[0];
            int var6 = this.field370[0] << 12;
            int var7 = this.field361 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field358 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var10 + 1;
            if (~var11 <= ~var9) {
                var11 = 0;
            }
            int var12 = var8 & 4095;
            int var13 = 255 & this.field360[var11 & 255];
            int var14 = class182.field2039[var12];
            int var15 = this.field360[255 & var10] & 255;
            if (this.field367) {
                for (int var16 = 0; ~class436.field6154 < ~var16; ++var16) {
                    int var17 = class684.field9645[var16] * this.field361;
                    int var18 = this.method190(var13, var12, -1, var6 * var17 >> 12, var7, var14, var15);
                    int var19 = var5 * var18 >> 12;
                    arg2[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class436.field6154; ++var20) {
                    int var21 = class684.field9645[var20] * this.field361;
                    int var22 = this.method190(var13, var12, -1, var6 * var21 >> 12, var7, var14, var15);
                    arg2[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field368[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field370[0] << 12;
                int var25 = this.field358 * var24 >> 12;
                int var26 = var4 * var24 >> 12;
                int var27 = this.field361 * var24 >> 12;
                int var28 = var26 >> 12;
                int var29 = var28 + 1;
                if (var25 <= var29) {
                    var29 = 0;
                }
                int var30 = var26 & 4095;
                int var31 = this.field360[var29 & 255] & 255;
                int var32 = class182.field2039[var30];
                int var33 = 255 & this.field360[255 & var28];
                for (int var34 = 0; ~var34 > ~class436.field6154; ++var34) {
                    int var54 = class684.field9645[var34] * this.field361;
                    int var55 = this.method190(var31, var30, -1, var24 * var54 >> 12, var27, var32, var33);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~this.field366 < ~var35; ++var35) {
                short var36 = this.field368[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field370[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field358 * var37 >> 12;
                    int var40 = this.field361 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 - -1;
                    int var43 = var38 & 4095;
                    if (~var42 <= ~var39) {
                        var42 = 0;
                    }
                    int var44 = 255 & this.field360[255 & var42];
                    int var45 = class182.field2039[var43];
                    int var46 = 255 & this.field360[255 & var41];
                    if (this.field367 && this.field366 + -1 == var35) {
                        for (int var47 = 0; ~class436.field6154 < ~var47; ++var47) {
                            int var48 = class684.field9645[var47] * this.field361;
                            int var49 = this.method190(var44, var43, -1, var37 * var48 >> 12, var40, var45, var46);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~class436.field6154 < ~var51; ++var51) {
                            int var52 = class684.field9645[var51] * this.field361;
                            int var53 = this.method190(var44, var43, -1, var37 * var52 >> 12, var40, var45, var46);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field357;
        int[] var3 = super.field6886.method789(arg0, (byte) 122);
        if (super.field6886.field1592) {
            this.method191(arg1 ^ -11335, arg0, var3);
        }
        return arg1 != -11323 ? null : var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public final void method34(byte arg0) {
        this.field360 = class427.method2467(24122, this.field364);
        ++field353;
        if (arg0 != 23) {
            this.field364 = 69;
        }
        this.method189(arg0 + -31458);
        for (int var2 = this.field366 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field368[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field366;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field358 = arg1.method620((byte) 99);
                                }
                            } else {
                                this.field361 = arg1.method620((byte) -39);
                            }
                        } else {
                            this.field364 = arg1.method620((byte) -126);
                        }
                    } else {
                        this.field361 = this.field358 = arg1.method620((byte) -127);
                    }
                } else {
                    this.field354 = arg1.method676(arg0 + -260);
                    if (~this.field354 > -1) {
                        this.field368 = new short[this.field366];
                        for (int var5 = 0; this.field366 > var5; ++var5) {
                            this.field368[var5] = (short) arg1.method676(arg0 + -260);
                        }
                    }
                }
            } else {
                this.field366 = arg1.method620((byte) -128);
            }
        } else {
            this.field367 = ~arg1.method620((byte) -128) == -2;
        }
        if (arg0 == 255) {
            ++field359;
        }
    }
}
