import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class80 {

    @OriginalMember(owner = "client!dp", name = "L", descriptor = "I")
    private int field56 = 2048;

    @OriginalMember(owner = "client!dp", name = "P", descriptor = "I")
    private int field60 = 0;

    @OriginalMember(owner = "client!dp", name = "O", descriptor = "I")
    private int field59 = 8192;

    @OriginalMember(owner = "client!dp", name = "K", descriptor = "I")
    private int field55 = 2048;

    @OriginalMember(owner = "client!dp", name = "U", descriptor = "I")
    private int field65 = 4096;

    @OriginalMember(owner = "client!dp", name = "V", descriptor = "I")
    private int field66 = 12288;

    @OriginalMember(owner = "client!dp", name = "T", descriptor = "I")
    private int field64 = 0;

    @OriginalMember(owner = "client!dp", name = "S", descriptor = "Los;")
    public static class309 field63 = new class309("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!dp", name = "W", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!dp", name = "I", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!dp", name = "J", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!dp", name = "M", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!dp", name = "N", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!dp", name = "Q", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!dp", name = "R", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!dp", name = "Z", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!dp", name = "X", descriptor = "Llf;")
    public static class160 field68;

    @OriginalMember(owner = "client!dp", name = "Y", descriptor = "Lbc;")
    public static class248 field69;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILsd;IIBIIZIII[II[I)I")
    public static final int method22(int arg0, int arg1, class63 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, int[] arg14) {
        ++field57;
        for (int var15 = 0; var15 < 128; ++var15) {
            for (int var35 = 0; var35 < 128; ++var35) {
                class416.field6275[var15][var35] = 0;
                class290.field4437[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (~arg13 != -2) {
            if (arg13 != 2) {
                var16 = class91.method824(arg4, arg9, arg3, (byte) 85, arg6, arg11, arg10, arg0, arg2, arg7, arg1, arg13);
            } else {
                var16 = class46.method456(arg11, arg2, arg5 ^ 3953, arg4, arg7, arg9, arg3, arg10, arg1, arg6, arg0);
            }
        } else {
            var16 = class506.method3035(arg11, arg3, arg10, arg2, arg0, arg1, arg7, arg6, arg9, arg4, (byte) 87);
        }
        int var17 = arg6 + -64;
        int var18 = arg0 + -64;
        int var19 = class129.field2204;
        int var20 = class81.field1634;
        if (!var16) {
            if (!arg8) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = -var23 + arg9; arg9 - -var23 >= var24; ++var24) {
                for (int var25 = -var23 + arg10; var25 <= arg10 + var23; ++var25) {
                    int var26 = -var17 + var24;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && ~var27 <= -1 && ~var26 > -129 && var27 < 128 && ~class290.field4437[var26][var27] > -101) {
                        int var28 = 0;
                        if (var24 >= arg9) {
                            if (~(arg4 + arg9 + -1) > ~var24) {
                                var28 = -arg9 - arg4 + 1 + var24;
                            }
                        } else {
                            var28 = arg9 - var24;
                        }
                        int var29 = 0;
                        if (var25 >= arg10) {
                            if (var25 > arg7 + arg10 + -1) {
                                var29 = -arg10 - arg7 + 1 + var25;
                            }
                        } else {
                            var29 = arg10 - var25;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (~var21 < ~var30 || var21 == var30 && ~var22 < ~class290.field4437[var26][var27]) {
                            var21 = var30;
                            var19 = var24;
                            var20 = var25;
                            var22 = class290.field4437[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (~arg6 == ~var19 && ~arg0 == ~var20) {
            return 0;
        } else {
            if (arg5 != 60) {
                method22(72, 80, (class63) null, 52, 70, (byte) 30, -51, -1, false, -4, 105, -50, (int[]) null, 34, (int[]) null);
            }
            byte var31 = 0;
            class246.field3801[var31] = var19;
            int var37 = var31 + 1;
            class441.field6555[var31] = var20;
            int var32;
            int var33 = var32 = class416.field6275[-var17 + var19][-var18 + var20];
            while (~arg6 != ~var19 || ~arg0 != ~var20) {
                if (~var32 != ~var33) {
                    var32 = var33;
                    class246.field3801[var37] = var19;
                    class441.field6555[var37++] = var20;
                }
                if ((var33 & 2) != 0) {
                    ++var19;
                } else if (~(var33 & 8) != -1) {
                    --var19;
                }
                if ((var33 & 1) != 0) {
                    ++var20;
                } else if ((var33 & 4) != 0) {
                    --var20;
                }
                var33 = class416.field6275[-var17 + var19][-var18 + var20];
            }
            int var34 = 0;
            while (~(var37--) < -1) {
                arg14[var34] = class246.field3801[var37];
                arg12[var34++] = class441.field6555[var37];
                if (~var34 <= ~arg14.length) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
    public class3() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        ++field54;
        class488.method2956(-15926);
        if (!arg0) {
            this.method26(96, 20, (class289) null);
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(III)Z")
    private final boolean method24(int arg0, int arg1, int arg2) {
        ++field58;
        int var4 = (arg0 + arg1) * this.field66 >> 12;
        int var5 = class482.field7106[255 & var4 * 255 >> 12];
        int var6 = -127 % ((arg2 - -90) / 36);
        int var7 = (var5 << 12) / this.field66;
        int var8 = (var7 << 12) / this.field59;
        int var9 = this.field65 * var8 >> 12;
        return var9 > -arg0 + arg1 && -var9 < -arg0 + arg1;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != -16828) {
            return null;
        } else {
            ++field62;
            int[] var3 = super.field1601.method48(arg0, (byte) 0);
            if (super.field1601.field124) {
                int var4 = class44.field795[arg0] + -2048;
                for (int var5 = 0; ~class137.field2308 < ~var5; ++var5) {
                    int var6 = class460.field6860[var5] + -2048;
                    int var7 = this.field55 + var6;
                    int var8 = var7 < -2048 ? var7 + 4096 : var7;
                    int var9 = var8 > 2048 ? var8 + -4096 : var8;
                    int var10 = this.field60 + var4;
                    int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                    int var12 = var11 > 2048 ? var11 + -4096 : var11;
                    int var13 = this.field64 + var6;
                    int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                    int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                    int var16 = this.field56 + var4;
                    int var17 = var16 < -2048 ? var16 + 4096 : var16;
                    int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                    var3[var5] = !this.method28(var12, (byte) -110, var9) && !this.method24(var15, var18, -127) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field59 = arg2.method1841((byte) 60);
                                }
                            } else {
                                this.field65 = arg2.method1841((byte) 67);
                            }
                        } else {
                            this.field66 = arg2.method1841((byte) 112);
                        }
                    } else {
                        this.field56 = arg2.method1841((byte) 94);
                    }
                } else {
                    this.field64 = arg2.method1841((byte) -128);
                }
            } else {
                this.field60 = arg2.method1841((byte) -126);
            }
        } else {
            this.field55 = arg2.method1841((byte) -124);
        }
        ++field53;
        int var5 = 30 % ((arg1 - 28) / 53);
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(Z)V")
    public static void method27(boolean arg0) {
        field69 = null;
        field68 = null;
        field63 = null;
        if (!arg0) {
            method27(false);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IBI)Z")
    private final boolean method28(int arg0, byte arg1, int arg2) {
        ++field61;
        int var4 = (-arg2 + arg0) * this.field66 >> 12;
        if (arg1 > -69) {
            field69 = null;
        }
        int var5 = class482.field7106[(var4 * 255 & 1047929) >> 12];
        int var6 = (var5 << 12) / this.field66;
        int var7 = (var6 << 12) / this.field59;
        int var8 = this.field65 * var7 >> 12;
        return ~var8 < ~(arg0 + arg2) && arg0 + arg2 > -var8;
    }

    static {
        new class309("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field67 = -1;
    }
}
