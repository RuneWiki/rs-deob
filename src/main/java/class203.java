import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class203 extends class273 {

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "[B")
    private byte[] field3667 = new byte[512];

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    private int field3670 = 2;

    @OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
    private int field3673 = 1;

    @OriginalMember(owner = "client!sh", name = "gb", descriptor = "I")
    private int field3679 = 5;

    @OriginalMember(owner = "client!sh", name = "cb", descriptor = "I")
    private int field3675 = 0;

    @OriginalMember(owner = "client!sh", name = "bb", descriptor = "[S")
    private short[] field3674 = new short[512];

    @OriginalMember(owner = "client!sh", name = "eb", descriptor = "I")
    private int field3677 = 2048;

    @OriginalMember(owner = "client!sh", name = "lb", descriptor = "I")
    private int field3684 = 5;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "Ljd;")
    public static class86 field3671 = class122.method868("Mem:", true);

    @OriginalMember(owner = "client!sh", name = "jb", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "[I")
    public static int[] field3668 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!sh", name = "db", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!sh", name = "fb", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!sh", name = "hb", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!sh", name = "ib", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!sh", name = "kb", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(B)V")
    private final void method1451(byte arg0) {
        Random var2 = new Random((long) this.field3675);
        if (arg0 != 75) {
            this.method31(84, 74);
        }
        ++field3678;
        this.field3674 = new short[512];
        if (~this.field3677 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field3674[var3] = (short) class30.method197(87, this.field3677, var2);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(B)V")
    public static void method1452(byte arg0) {
        if (arg0 != 86) {
            field3671 = null;
        }
        field3668 = null;
        field3671 = null;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class203() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZII)V")
    public static final void method1453(boolean arg0, int arg1, int arg2) {
        ++field3669;
        if (arg0) {
            field3668 = null;
        }
        class161 var3 = class204.method1456(true, 6, arg2);
        var3.method1174(0);
        var3.field3027 = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZIII)V")
    public static final void method1454(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var8 = arg4 + 1;
        class56.method412(arg1, (byte) -125, arg0, class249.field4420[arg4], arg3);
        ++field3681;
        int var9 = arg5 - 1;
        class56.method412(arg1, (byte) -102, arg0, class249.field4420[arg5], arg3);
        if (arg2) {
            for (int var6 = var8; ~var9 <= ~var6; ++var6) {
                int[] var7 = class249.field4420[var6];
                var7[arg3] = var7[arg0] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -7420) {
            field3680 = -75;
        }
        ++field3666;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int var4 = class143.field2711[arg1] * this.field3679 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class176.field3200; ++var7) {
                class173.field3171 = Integer.MAX_VALUE;
                class24.field594 = Integer.MAX_VALUE;
                class165.field3094 = Integer.MAX_VALUE;
                class126.field2438 = Integer.MAX_VALUE;
                int var8 = class114.field2184[var7] * this.field3684 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = this.field3667[(var11 >= this.field3679 ? -this.field3679 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = (this.field3667[255 & var13 + (this.field3684 <= var14 ? var14 - this.field3684 : var14)] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field3674[var15] - (var14 << 12);
                        int var17 = var4 - ((var11 << 12) + this.field3674[var27]);
                        int var18 = this.field3673;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var16 > -1 ? -var16 : var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var26 > ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (var19 >= class126.field2438) {
                            if (~class165.field3094 < ~var19) {
                                class173.field3171 = class24.field594;
                                class24.field594 = class165.field3094;
                                class165.field3094 = var19;
                            } else if (~class24.field594 < ~var19) {
                                class173.field3171 = class24.field594;
                                class24.field594 = var19;
                            } else if (~class173.field3171 < ~var19) {
                                class173.field3171 = var19;
                            }
                        } else {
                            class173.field3171 = class24.field594;
                            class24.field594 = class165.field3094;
                            class165.field3094 = class126.field2438;
                            class126.field2438 = var19;
                        }
                    }
                }
                int var12 = this.field3670;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class126.field2438 + class165.field3094;
                                }
                            } else {
                                var3[var7] = class173.field3171;
                            }
                        } else {
                            var3[var7] = class24.field594;
                        }
                    } else {
                        var3[var7] = class165.field3094;
                    }
                } else {
                    var3[var7] = class126.field2438;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII[Lig;I[BIIIZ)V")
    public static final void method1455(int arg0, int arg1, int arg2, int arg3, class9[] arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, boolean arg10) {
        if (arg0 == 63) {
            int var11 = -1;
            class200 var12 = new class200(arg6);
            while (true) {
                int var13 = var12.method1424(arg0 ^ 32704);
                if (var13 == 0) {
                    ++field3665;
                    return;
                }
                int var14 = 0;
                var11 += var13;
                while (true) {
                    int var15 = var12.method1402(20740);
                    if (var15 == 0) {
                        break;
                    }
                    var14 += var15 + -1;
                    int var16 = 63 & var14;
                    int var17 = var14 >> 12;
                    int var18 = var14 >> 6 & 63;
                    int var19 = var12.method1408((byte) -125);
                    int var20 = var19 >> 2;
                    int var21 = var19 & 3;
                    if (arg1 == var17 && ~var18 <= ~arg7 && ~(arg7 - -8) < ~var18 && ~arg3 >= ~var16 && var16 < arg3 + 8) {
                        class117 var22 = class268.method1845(var11, (byte) -40);
                        int var23 = class194.method1350(7 & var16, var22.field2307, false, var22.field2273, arg2, 7 & var18, var21) + arg9;
                        int var24 = class204.method1459(7 & var18, var16 & 7, 56, arg2, var22.field2273, var21, var22.field2307) + arg5;
                        if (~var23 < -1 && ~var24 < -1 && ~var23 > -104 && ~var24 > -104) {
                            class9 var25 = null;
                            if (!arg10) {
                                int var26 = arg8;
                                if ((2 & class86.field1693[1][var23][var24]) == 2) {
                                    var26 = arg8 - 1;
                                }
                                if (var26 >= 0) {
                                    var25 = arg4[var26];
                                }
                            }
                            class183.method1267(!arg10, var24, arg8, arg8, false, var23, var25, var20, var11, 3 & arg2 + var21, arg10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        ++field3676;
        if (arg0 != 4095) {
            field3682 = 16;
        }
        this.field3667 = class107.method765((byte) -110, this.field3675);
        this.method1451((byte) 75);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field3683;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field3679 = arg1.method1408((byte) -108);
                                }
                            } else {
                                this.field3684 = arg1.method1408((byte) -23);
                            }
                        } else {
                            this.field3673 = arg1.method1408((byte) -110);
                        }
                    } else {
                        this.field3670 = arg1.method1408((byte) -30);
                    }
                } else {
                    this.field3677 = arg1.method1410(-106);
                }
            } else {
                this.field3675 = arg1.method1408((byte) -126);
            }
        } else {
            this.field3684 = this.field3679 = arg1.method1408((byte) -61);
        }
        if (arg2 > -16) {
            field3671 = null;
        }
    }
}
