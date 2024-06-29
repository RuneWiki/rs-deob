import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class15 extends class264 {

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
    public int field127 = 1638;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "[B")
    private byte[] field128 = new byte[512];

    @OriginalMember(owner = "client!nr", name = "W", descriptor = "I")
    public int field134 = 4;

    @OriginalMember(owner = "client!nr", name = "X", descriptor = "I")
    public int field135 = 4;

    @OriginalMember(owner = "client!nr", name = "eb", descriptor = "I")
    public int field142 = 4;

    @OriginalMember(owner = "client!nr", name = "ab", descriptor = "Z")
    public boolean field138 = true;

    @OriginalMember(owner = "client!nr", name = "fb", descriptor = "I")
    public int field143 = 0;

    @OriginalMember(owner = "client!nr", name = "gb", descriptor = "Lch;")
    public static class151 field144 = new class151("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!nr", name = "ib", descriptor = "I")
    public static int field146 = 765;

    @OriginalMember(owner = "client!nr", name = "hb", descriptor = "Lch;")
    public static class151 field145 = new class151("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!nr", name = "jb", descriptor = "I")
    public static int field147 = -50;

    @OriginalMember(owner = "client!nr", name = "lb", descriptor = "I")
    public static int field149 = -1;

    @OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!nr", name = "R", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!nr", name = "V", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!nr", name = "Z", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!nr", name = "bb", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!nr", name = "cb", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!nr", name = "db", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "Lnl;")
    public static class435 field131;

    @OriginalMember(owner = "client!nr", name = "kb", descriptor = "Lis;")
    public static class65 field148;

    @OriginalMember(owner = "client!nr", name = "T", descriptor = "[S")
    private short[] field132;

    @OriginalMember(owner = "client!nr", name = "Y", descriptor = "[S")
    private short[] field136;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIZIIII)I", line = 4)
    private final int method89(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field141;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        int var10 = arg6 & 4095;
        if (~var9 <= ~arg5) {
            var9 = 0;
        }
        int var11 = var8 & 255;
        int var12 = arg1 - 4096;
        int var13 = var9 & 255;
        int var14 = var10 - 4096;
        int var15 = class462.field6528[var10];
        int var16 = this.field128[arg4 + var11] & 3;
        int var17;
        if (~var16 >= -2) {
            var17 = ~var16 == -1 ? arg1 + var10 : -var10 + arg1;
        } else {
            var17 = ~var16 == -3 ? var10 - arg1 : -arg1 + -var10;
        }
        int var18 = this.field128[arg4 + var13] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = ~var18 != -3 ? -arg1 + -var14 : -arg1 + var14;
        } else {
            var19 = ~var18 != -1 ? -var14 + arg1 : var14 - -arg1;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        if (!arg2) {
            return 121;
        } else {
            int var21 = 3 & this.field128[var11 - -arg3];
            int var22;
            if (var21 <= 1) {
                var22 = var21 != 0 ? -var10 + var12 : var10 + var12;
            } else {
                var22 = ~var21 != -3 ? -var10 - var12 : var10 - var12;
            }
            int var23 = 3 & this.field128[arg3 + var13];
            int var24;
            if (var23 <= 1) {
                var24 = var23 != 0 ? -var14 + var12 : var12 + var14;
            } else {
                var24 = ~var23 != -3 ? -var12 + -var14 : -var12 + var14;
            }
            int var25 = ((var24 - var22) * var15 >> 12) + var22;
            return ((var25 - var20) * arg0 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V", line = 284)
    public class15() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)[I", line = 83)
    public final int[] method90(int arg0, int arg1) {
        ++field140;
        int[] var3 = super.field3808.method958((byte) 48, arg0);
        if (arg1 != 21034) {
            this.method7((byte) -13, (class161) null, -120);
        }
        if (super.field3808.field1732) {
            this.method91(var3, arg0, -31157);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([III)V", line = 109)
    public final void method91(int[] arg0, int arg1, int arg2) {
        ++field137;
        if (arg2 == -31157) {
            int var4 = class379.field5216[arg1] * this.field135;
            if (this.field134 != 1) {
                short var5 = this.field132[0];
                if (var5 > 8 || var5 < -8) {
                    int var6 = this.field136[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = this.field142 * var6 >> 12;
                    int var9 = this.field135 * var6 >> 12;
                    int var10 = var7 >> 12;
                    int var11 = var10 + 1;
                    if (var9 <= var11) {
                        var11 = 0;
                    }
                    int var12 = var7 & 4095;
                    int var13 = class462.field6528[var12];
                    int var14 = 255 & this.field128[var10 & 255];
                    int var15 = 255 & this.field128[255 & var11];
                    for (int var16 = 0; var16 < class478.field6792; ++var16) {
                        int var36 = class151.field2084[var16] * this.field142;
                        int var37 = this.method89(var13, var12, true, var15, var14, var8, var6 * var36 >> 12);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; this.field134 > var17; ++var17) {
                    short var18 = this.field132[var17];
                    if (~var18 < -9 || var18 < -8) {
                        int var19 = this.field136[var17] << 12;
                        int var20 = var4 * var19 >> 12;
                        int var21 = this.field135 * var19 >> 12;
                        int var22 = this.field142 * var19 >> 12;
                        int var23 = var20 >> 12;
                        int var24 = var23 - -1;
                        int var25 = var20 & 4095;
                        if (var24 >= var21) {
                            var24 = 0;
                        }
                        int var26 = 255 & this.field128[255 & var23];
                        int var27 = 255 & this.field128[255 & var24];
                        int var28 = class462.field6528[var25];
                        if (this.field138 && this.field134 + -1 == var17) {
                            for (int var29 = 0; ~var29 > ~class478.field6792; ++var29) {
                                int var30 = class151.field2084[var29] * this.field142;
                                int var31 = this.method89(var28, var25, true, var27, var26, var22, var19 * var30 >> 12);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; var33 < class478.field6792; ++var33) {
                                int var34 = class151.field2084[var33] * this.field142;
                                int var35 = this.method89(var28, var25, true, var27, var26, var22, var19 * var34 >> 12);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field136[0] << 12;
                short var39 = this.field132[0];
                int var40 = this.field135 * var38 >> 12;
                int var41 = this.field142 * var38 >> 12;
                int var42 = var4 * var38 >> 12;
                int var43 = var42 >> 12;
                int var44 = var43 + 1;
                if (~var44 <= ~var40) {
                    var44 = 0;
                }
                int var45 = var42 & 4095;
                int var46 = 255 & this.field128[255 & var44];
                int var47 = class462.field6528[var45];
                int var48 = this.field128[var43 & 255] & 255;
                if (!this.field138) {
                    for (int var49 = 0; var49 < class478.field6792; ++var49) {
                        int var50 = class151.field2084[var49] * this.field142;
                        int var51 = this.method89(var47, var45, true, var46, var48, var41, var38 * var50 >> 12);
                        arg0[var49] = var39 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; var52 < class478.field6792; ++var52) {
                        int var53 = class151.field2084[var52] * this.field142;
                        int var54 = this.method89(var47, var45, true, var46, var48, var41, var38 * var53 >> 12);
                        int var55 = var39 * var54 >> 12;
                        arg0[var52] = 2048 - -(var55 >> 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)V", line = 270)
    public static void method92(int arg0) {
        field131 = null;
        field145 = null;
        if (arg0 != 4) {
            field147 = 8;
        }
        field144 = null;
        field148 = null;
    }

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "(I)V", line = 292)
    public static final void method93(int arg0) {
        ++field130;
        class334 var1 = class352.method2172(0, 15, 16711935);
        int var2 = 83 / ((41 - arg0) / 57);
        var1.method2099(true);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V", line = 304)
    private final void method94(boolean arg0) {
        if (this.field127 > 0) {
            this.field136 = new short[this.field134];
            this.field132 = new short[this.field134];
            for (int var2 = 0; ~this.field134 < ~var2; ++var2) {
                this.field132[var2] = (short) ((int) (Math.pow((double) ((float) this.field127 / 4096.0F), (double) var2) * 4096.0D));
                this.field136[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field132 != null && this.field132.length == this.field134) {
            this.field136 = new short[this.field134];
            for (int var3 = 0; var3 < this.field134; ++var3) {
                this.field136[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (!arg0) {
            ++field129;
        }
    }

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)V", line = 344)
    public final void method95(int arg0) {
        this.field128 = class4.method29(this.field143, (byte) -58);
        ++field139;
        this.method94(false);
        for (int var2 = this.field134 + -1; var2 >= 1; --var2) {
            short var3 = this.field132[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            --this.field134;
        }
        if (arg0 != -8) {
            this.field134 = 114;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLkk;I)V", line = 397)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field135 = arg1.method1172((byte) -116);
                                }
                            } else {
                                this.field142 = arg1.method1172((byte) -121);
                            }
                        } else {
                            this.field143 = arg1.method1172((byte) 76);
                        }
                    } else {
                        this.field142 = this.field135 = arg1.method1172((byte) 87);
                    }
                } else {
                    this.field127 = arg1.method1163(9988);
                    if (this.field127 < 0) {
                        this.field132 = new short[this.field134];
                        for (int var5 = 0; ~var5 > ~this.field134; ++var5) {
                            this.field132[var5] = (short) arg1.method1163(9988);
                        }
                    }
                }
            } else {
                this.field134 = arg1.method1172((byte) -126);
            }
        } else {
            this.field138 = arg1.method1172((byte) 57) == 1;
        }
        ++field133;
        if (arg0 < 31) {
            field148 = null;
        }
    }
}
