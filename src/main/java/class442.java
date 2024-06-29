import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class442 extends class535 {

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "Z")
    public boolean field6289 = true;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "[B")
    private byte[] field6290 = new byte[512];

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public int field6295 = 4;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public int field6291 = 4;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public int field6299 = 1638;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    public int field6302 = 0;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    public int field6308 = 4;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "[C")
    public static char[] field6307;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "F")
    public static float field6304;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "[S")
    private short[] field6301;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "[S")
    private short[] field6306;

    static {
        new class44("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field6307 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 153)
    public class442() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 11)
    public static final void method2599(int arg0) {
        class369.field5336.method2990((byte) -125);
        if (arg0 >= -83) {
            field6304 = 0.110141985F;
        }
        ++field6293;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)I", line = 22)
    public static int method2600(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V", line = 29)
    public static final void method2601(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            ++class44.field869;
            class228.method1528(true, class242.field3622);
        }
        ++field6296;
        int var4 = -99 / ((-41 - arg0) / 53);
        if (~arg3 == -2) {
            class228.method1528(true, class256.field3799);
            ++class295.field4419;
        }
        class276.field4124.method3029(-53, class501.field7240 + arg1);
        class276.field4124.method3023((byte) 61, !class218.field3339.method74(82, 64) ? 0 : 1);
        class276.field4124.method3068((byte) 57, class82.field1315 + arg2);
        class112.field1651 = arg1;
        class17.field186 = arg2;
        class121.field1890 = false;
        class320.method2041(-117);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILwn;I)V", line = 63)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 == -6232) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field6295 = arg1.method3072((byte) -125);
                                    }
                                } else {
                                    this.field6308 = arg1.method3072((byte) -127);
                                }
                            } else {
                                this.field6302 = arg1.method3072((byte) -120);
                            }
                        } else {
                            this.field6308 = this.field6295 = arg1.method3072((byte) -124);
                        }
                    } else {
                        this.field6299 = arg1.method3044((byte) -104);
                        if (this.field6299 < 0) {
                            this.field6306 = new short[this.field6291];
                            for (int var5 = 0; ~var5 > ~this.field6291; ++var5) {
                                this.field6306[var5] = (short) arg1.method3044((byte) -82);
                            }
                        }
                    }
                } else {
                    this.field6291 = arg1.method3072((byte) -122);
                }
            } else {
                this.field6289 = arg1.method3072((byte) -128) == 1;
            }
            ++field6298;
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)V", line = 156)
    public final void method66(byte arg0) {
        this.field6290 = class12.method68(this.field6302, 0);
        ++field6300;
        if (arg0 <= 111) {
            this.method2605(44);
        }
        this.method2605(117);
        for (int var2 = this.field6291 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field6306[var2];
            if (~var3 < -9 || ~var3 > 7) {
                return;
            }
            --this.field6291;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)[I", line = 185)
    public final int[] method65(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field6297;
            int[] var3 = super.field7885.method974(-30531, arg0);
            if (super.field7885.field2086) {
                this.method2603(var3, arg0, -120);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)V", line = 209)
    public static void method2602(int arg0) {
        if (arg0 == 1674279052) {
            field6307 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([III)V", line = 219)
    public final void method2603(int[] arg0, int arg1, int arg2) {
        ++field6303;
        int var4 = class448.field6442[arg1] * this.field6295;
        if (arg2 > -18) {
            this.field6299 = -29;
        }
        if (this.field6291 == 1) {
            short var5 = this.field6306[0];
            int var6 = this.field6301[0] << 12;
            int var7 = this.field6308 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field6295 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var10 + 1;
            int var12 = var8 & 4095;
            if (~var9 >= ~var11) {
                var11 = 0;
            }
            int var13 = 255 & this.field6290[255 & var10];
            int var14 = class51.field941[var12];
            int var15 = 255 & this.field6290[255 & var11];
            if (this.field6289) {
                for (int var16 = 0; var16 < class174.field2597; ++var16) {
                    int var17 = class539.field7939[var16] * this.field6308;
                    int var18 = this.method2604(var6 * var17 >> 12, 11679, var12, var7, var15, var13, var14);
                    int var19 = var5 * var18 >> 12;
                    arg0[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class174.field2597; ++var20) {
                    int var21 = class539.field7939[var20] * this.field6308;
                    int var22 = this.method2604(var6 * var21 >> 12, 11679, var12, var7, var15, var13, var14);
                    arg0[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field6306[0];
            if (var23 > 8 || ~var23 > 7) {
                int var24 = this.field6301[0] << 12;
                int var25 = this.field6295 * var24 >> 12;
                int var26 = var4 * var24 >> 12;
                int var27 = this.field6308 * var24 >> 12;
                int var28 = var26 >> 12;
                int var29 = var28 + 1;
                int var30 = var26 & 4095;
                if (var25 <= var29) {
                    var29 = 0;
                }
                int var31 = 255 & this.field6290[255 & var28];
                int var32 = 255 & this.field6290[var29 & 255];
                int var33 = class51.field941[var30];
                for (int var34 = 0; ~class174.field2597 < ~var34; ++var34) {
                    int var54 = class539.field7939[var34] * this.field6308;
                    int var55 = this.method2604(var24 * var54 >> 12, 11679, var30, var27, var32, var31, var33);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field6291; ++var35) {
                short var36 = this.field6306[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field6301[var35] << 12;
                    int var38 = this.field6308 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = this.field6295 * var37 >> 12;
                    int var41 = var39 >> 12;
                    int var42 = var41 + 1;
                    if (var40 <= var42) {
                        var42 = 0;
                    }
                    int var43 = var39 & 4095;
                    int var44 = this.field6290[255 & var42] & 255;
                    int var45 = 255 & this.field6290[255 & var41];
                    int var46 = class51.field941[var43];
                    if (this.field6289 && ~(this.field6291 + -1) == ~var35) {
                        for (int var47 = 0; class174.field2597 > var47; ++var47) {
                            int var48 = class539.field7939[var47] * this.field6308;
                            int var49 = this.method2604(var37 * var48 >> 12, 11679, var43, var38, var44, var45, var46);
                            int var50 = arg0[var47] - -(var36 * var49 >> 12);
                            arg0[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; var51 < class174.field2597; ++var51) {
                            int var52 = class539.field7939[var51] * this.field6308;
                            int var53 = this.method2604(var37 * var52 >> 12, 11679, var43, var38, var44, var45, var46);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)I", line = 383)
    private final int method2604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 11679) {
            method2599(28);
        }
        ++field6294;
        int var8 = arg0 >> 12;
        int var9 = var8 - -1;
        int var10 = arg0 & 4095;
        if (arg3 <= var9) {
            var9 = 0;
        }
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = arg2 - 4096;
        int var14 = var10 + -4096;
        int var15 = class51.field941[var10];
        int var16 = 3 & this.field6290[arg5 + var11];
        int var17;
        if (var16 > 1) {
            var17 = ~var16 != -3 ? -arg2 + -var10 : var10 - arg2;
        } else {
            var17 = var16 == 0 ? arg2 + var10 : -var10 + arg2;
        }
        int var18 = this.field6290[arg5 + var12] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 != 0 ? -var14 + arg2 : arg2 + var14;
        } else {
            var19 = ~var18 == -3 ? -arg2 + var14 : -var14 - arg2;
        }
        int var20 = var17 - -((-var17 + var19) * var15 >> 12);
        int var21 = 3 & this.field6290[arg4 + var11];
        int var22;
        if (~var21 >= -2) {
            var22 = var21 != 0 ? -var10 + var13 : var10 + var13;
        } else {
            var22 = ~var21 != -3 ? -var10 + -var13 : -var13 + var10;
        }
        int var23 = 3 & this.field6290[arg4 + var12];
        int var24;
        if (var23 > 1) {
            var24 = ~var23 == -3 ? var14 - var13 : -var14 - var13;
        } else {
            var24 = var23 != 0 ? var13 - var14 : var13 + var14;
        }
        int var25 = var22 - -((var24 - var22) * var15 >> 12);
        return ((-var20 + var25) * arg6 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V", line = 475)
    private final void method2605(int arg0) {
        if (~this.field6299 < -1) {
            this.field6306 = new short[this.field6291];
            this.field6301 = new short[this.field6291];
            for (int var2 = 0; var2 < this.field6291; ++var2) {
                this.field6306[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field6299 / 4096.0F), (double) var2)));
                this.field6301[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field6306 != null && ~this.field6306.length == ~this.field6291) {
            this.field6301 = new short[this.field6291];
            for (int var3 = 0; ~var3 > ~this.field6291; ++var3) {
                this.field6301[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 >= 45) {
            ++field6305;
        }
    }
}
