import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class184 extends class17 {

    @OriginalMember(owner = "client!up", name = "F", descriptor = "Z")
    public boolean field2643 = true;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    public int field2645 = 4;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "I")
    public int field2644 = 1638;

    @OriginalMember(owner = "client!up", name = "T", descriptor = "[B")
    private byte[] field2657 = new byte[512];

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public int field2652 = 4;

    @OriginalMember(owner = "client!up", name = "U", descriptor = "I")
    public int field2658 = 0;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    public int field2648 = 4;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "Lkn;")
    public static class530 field2653 = new class530("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!up", name = "W", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2660 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!up", name = "Y", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!up", name = "ab", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!up", name = "bb", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!up", name = "V", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!up", name = "X", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!up", name = "Z", descriptor = "Loi;")
    public static class53 field2663;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "[S")
    private short[] field2650;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "[S")
    private short[] field2655;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)V")
    private final void method1162(byte arg0) {
        if (arg0 <= -107) {
            if (~this.field2644 < -1) {
                this.field2650 = new short[this.field2652];
                this.field2655 = new short[this.field2652];
                for (int var2 = 0; var2 < this.field2652; ++var2) {
                    this.field2655[var2] = (short) ((int) (Math.pow((double) ((float) this.field2644 / 4096.0F), (double) var2) * 4096.0D));
                    this.field2650[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field2655 != null && this.field2655.length == this.field2652) {
                this.field2650 = new short[this.field2652];
                for (int var3 = 0; ~var3 > ~this.field2652; ++var3) {
                    this.field2650[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field2651;
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
    public class184() {
        super(0, true);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IBIIIII)I")
    private final int method1163(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2646;
        if (arg1 > -31) {
            return 48;
        } else {
            int var8 = arg4 >> 12;
            int var9 = var8 - -1;
            if (~arg3 >= ~var9) {
                var9 = 0;
            }
            int var10 = var8 & 255;
            int var11 = arg4 & 4095;
            int var12 = arg0 + -4096;
            int var13 = var11 - 4096;
            int var14 = var9 & 255;
            int var15 = this.field2657[arg2 + var10] & 3;
            int var16 = class226.field3254[var11];
            int var17;
            if (var15 <= 1) {
                var17 = ~var15 == -1 ? var11 - -arg0 : -var11 + arg0;
            } else {
                var17 = var15 != 2 ? -arg0 + -var11 : -arg0 + var11;
            }
            int var18 = this.field2657[var14 - -arg2] & 3;
            int var19;
            if (~var18 >= -2) {
                var19 = var18 == 0 ? arg0 + var13 : -var13 + arg0;
            } else {
                var19 = var18 == 2 ? -arg0 + var13 : -arg0 + -var13;
            }
            int var20 = var17 - -((var19 - var17) * var16 >> 12);
            int var21 = 3 & this.field2657[arg5 + var10];
            int var22;
            if (var21 > 1) {
                var22 = var21 != 2 ? -var11 + -var12 : -var12 + var11;
            } else {
                var22 = var21 != 0 ? -var11 + var12 : var11 - -var12;
            }
            int var23 = this.field2657[arg5 + var14] & 3;
            int var24;
            if (~var23 < -2) {
                var24 = var23 == 2 ? var13 - var12 : -var12 + -var13;
            } else {
                var24 = ~var23 != -1 ? -var13 + var12 : var12 + var13;
            }
            int var25 = ((-var22 + var24) * var16 >> 12) + var22;
            return ((-var20 + var25) * arg6 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!up", name = "h", descriptor = "(I)V")
    public static void method1164(int arg0) {
        if (arg0 == 1486958572) {
            field2663 = null;
            field2660 = null;
            field2653 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(III)V")
    public static final void method1165(int arg0, int arg1, int arg2) {
        if (~class358.field5129 != -2) {
            if (~class358.field5129 == -3) {
                class243.method1527(arg2, arg1, (byte) -97);
            }
        } else {
            class52.method417(class531.field7800, true, arg1, arg2);
        }
        ++field2649;
        if (arg0 >= 1) {
            class358.field5129 = 0;
            class531.field7800 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            this.field2658 = 122;
        }
        ++field2659;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2652 = arg0.method2357((byte) 108);
            } else {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field2648 = this.field2645 = arg0.method2357((byte) 109);
                        return;
                    }
                    if (~arg1 == -5) {
                        this.field2658 = arg0.method2357((byte) 110);
                        return;
                    }
                    if (arg1 == 5) {
                        this.field2648 = arg0.method2357((byte) 107);
                        return;
                    }
                    if (~arg1 == -7) {
                        this.field2645 = arg0.method2357((byte) 126);
                        return;
                    }
                } else {
                    this.field2644 = arg0.method2371(7162);
                    if (this.field2644 < 0) {
                        this.field2655 = new short[this.field2652];
                        for (int var5 = 0; ~this.field2652 < ~var5; ++var5) {
                            this.field2655[var5] = (short) arg0.method2371(7162);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2643 = arg0.method2357((byte) 104) == 1;
        }
    }

    @OriginalMember(owner = "client!up", name = "g", descriptor = "(I)V")
    public final void method31(int arg0) {
        this.field2657 = class327.method1972(this.field2658, (byte) -7);
        ++field2654;
        this.method1162((byte) -113);
        if (arg0 != -9) {
            this.field2643 = true;
        }
        for (int var2 = this.field2652 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field2655[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field2652;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI[I)V")
    public final void method1166(boolean arg0, int arg1, int[] arg2) {
        ++field2647;
        if (arg0) {
            int var4 = class40.field427[arg1] * this.field2645;
            if (this.field2652 != 1) {
                short var5 = this.field2655[0];
                if (~var5 < -9 || ~var5 > 7) {
                    int var6 = this.field2650[0] << 12;
                    int var7 = var4 * var6 >> 12;
                    int var8 = this.field2645 * var6 >> 12;
                    int var9 = this.field2648 * var6 >> 12;
                    int var10 = var7 >> 12;
                    int var11 = var10 + 1;
                    if (var11 >= var8) {
                        var11 = 0;
                    }
                    int var12 = var7 & 4095;
                    int var13 = this.field2657[255 & var11] & 255;
                    int var14 = 255 & this.field2657[255 & var10];
                    int var15 = class226.field3254[var12];
                    for (int var16 = 0; ~class530.field7763 < ~var16; ++var16) {
                        int var36 = class492.field6966[var16] * this.field2648;
                        int var37 = this.method1163(var12, (byte) -69, var14, var9, var6 * var36 >> 12, var13, var15);
                        arg2[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field2652; ++var17) {
                    short var18 = this.field2655[var17];
                    if (~var18 < -9 || ~var18 > 7) {
                        int var19 = this.field2650[var17] << 12;
                        int var20 = var4 * var19 >> 12;
                        int var21 = this.field2648 * var19 >> 12;
                        int var22 = this.field2645 * var19 >> 12;
                        int var23 = var20 >> 12;
                        int var24 = var23 + 1;
                        int var25 = var20 & 4095;
                        if (~var22 >= ~var24) {
                            var24 = 0;
                        }
                        int var26 = this.field2657[var24 & 255] & 255;
                        int var27 = this.field2657[255 & var23] & 255;
                        int var28 = class226.field3254[var25];
                        if (this.field2643 && this.field2652 + -1 == var17) {
                            for (int var29 = 0; class530.field7763 > var29; ++var29) {
                                int var30 = class492.field6966[var29] * this.field2648;
                                int var31 = this.method1163(var25, (byte) -63, var27, var21, var19 * var30 >> 12, var26, var28);
                                int var32 = (var18 * var31 >> 12) + arg2[var29];
                                arg2[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~class530.field7763; ++var33) {
                                int var34 = class492.field6966[var33] * this.field2648;
                                int var35 = this.method1163(var25, (byte) -68, var27, var21, var19 * var34 >> 12, var26, var28);
                                arg2[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field2650[0] << 12;
                short var39 = this.field2655[0];
                int var40 = var4 * var38 >> 12;
                int var41 = this.field2648 * var38 >> 12;
                int var42 = this.field2645 * var38 >> 12;
                int var43 = var40 >> 12;
                int var44 = var43 + 1;
                if (var42 <= var44) {
                    var44 = 0;
                }
                int var45 = var40 & 4095;
                int var46 = class226.field3254[var45];
                int var47 = this.field2657[var44 & 255] & 255;
                int var48 = this.field2657[255 & var43] & 255;
                if (!this.field2643) {
                    for (int var49 = 0; ~class530.field7763 < ~var49; ++var49) {
                        int var50 = class492.field6966[var49] * this.field2648;
                        int var51 = this.method1163(var45, (byte) -118, var48, var41, var38 * var50 >> 12, var47, var46);
                        arg2[var49] = var39 * var51 >> 12;
                    }
                } else {
                    for (int var52 = 0; ~class530.field7763 < ~var52; ++var52) {
                        int var53 = class492.field6966[var52] * this.field2648;
                        int var54 = this.method1163(var45, (byte) -97, var48, var41, var38 * var53 >> 12, var47, var46);
                        int var55 = var39 * var54 >> 12;
                        arg2[var52] = 2048 - -(var55 >> 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field2661;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 < 53) {
            this.method1162((byte) 127);
        }
        if (super.field210.field6442) {
            this.method1166(true, arg0, var3);
        }
        return var3;
    }

    static {
        new class530("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field2662 = 16777215;
        field2664 = 0;
        field2665 = 0;
    }
}
