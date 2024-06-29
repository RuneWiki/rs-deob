import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class522 extends class466 {

    @OriginalMember(owner = "client!raa", name = "J", descriptor = "I")
    private int field7338 = 2048;

    @OriginalMember(owner = "client!raa", name = "Q", descriptor = "I")
    private int field7344 = 1;

    @OriginalMember(owner = "client!raa", name = "O", descriptor = "[S")
    private short[] field7342 = new short[512];

    @OriginalMember(owner = "client!raa", name = "K", descriptor = "I")
    private int field7339 = 5;

    @OriginalMember(owner = "client!raa", name = "S", descriptor = "I")
    private int field7346 = 5;

    @OriginalMember(owner = "client!raa", name = "E", descriptor = "[B")
    private byte[] field7334 = new byte[512];

    @OriginalMember(owner = "client!raa", name = "U", descriptor = "I")
    private int field7348 = 0;

    @OriginalMember(owner = "client!raa", name = "T", descriptor = "I")
    private int field7347 = 2;

    @OriginalMember(owner = "client!raa", name = "F", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!raa", name = "G", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!raa", name = "H", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!raa", name = "M", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!raa", name = "N", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!raa", name = "P", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!raa", name = "R", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!raa", name = "V", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!raa", name = "W", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lhh;Z)I")
    public static final int method3011(class109 arg0, boolean arg1) {
        ++field7345;
        class593 var2 = arg0.field1669;
        if (var2.field8532 != null) {
            var2 = var2.method3516(class189.field2681, 107);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field8587;
        class107 var4 = arg0.method349(arg1);
        if (arg0.field567) {
            var3 = var2.field8584;
        } else if (arg0.field554 != var4.field1617 && arg0.field554 != var4.field1629 && arg0.field554 != var4.field1652 && arg0.field554 != var4.field1641) {
            if (~arg0.field554 == ~var4.field1647 || arg0.field554 == var4.field1627 || arg0.field554 == var4.field1642 || ~arg0.field554 == ~var4.field1636) {
                var3 = var2.field8530;
            }
        } else {
            var3 = var2.field8560;
        }
        return var3;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field7349;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field7346 = arg0.method110((byte) 122);
                                }
                            } else {
                                this.field7339 = arg0.method110((byte) 92);
                            }
                        } else {
                            this.field7344 = arg0.method110((byte) 62);
                        }
                    } else {
                        this.field7347 = arg0.method110((byte) 112);
                    }
                } else {
                    this.field7338 = arg0.method93((byte) 90);
                }
            } else {
                this.field7348 = arg0.method110((byte) 98);
            }
        } else {
            this.field7339 = this.field7346 = arg0.method110((byte) 74);
        }
        if (arg1 != -5062) {
            method3014(-63, (byte) 95);
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
    public class522() {
        super(0, true);
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(IZ)I")
    public static final int method3012(int arg0, boolean arg1) {
        if (!arg1) {
            return -59;
        } else {
            ++field7336;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 != -806066388) {
            this.method6((class11) null, 59, -107);
        }
        ++field7343;
        this.field7334 = class575.method3274(511, this.field7348);
        this.method3013(arg0 + 806079993);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field7341;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            method3015(119, (class442) null);
        }
        if (super.field6557.field1163) {
            int var4 = class63.field1085[arg0] * this.field7346 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class312.field4207 < ~var7; ++var7) {
                class470.field6616 = Integer.MAX_VALUE;
                class191.field2699 = Integer.MAX_VALUE;
                class495.field6930 = Integer.MAX_VALUE;
                class274.field3802 = Integer.MAX_VALUE;
                int var8 = class431.field6129[var7] * this.field7339 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; ++var11) {
                    int var13 = this.field7334[(~var11 <= ~this.field7346 ? var11 - this.field7346 : var11) & 255] & 255;
                    for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                        int var15 = (255 & this.field7334[255 & (var14 < this.field7339 ? var14 : var14 - this.field7339) + var13]) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - (this.field7342[var15] - var8);
                        int var17 = -(var11 << 12) + var4 + -this.field7342[var27];
                        int var18 = this.field7344;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = ~var26 > ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class274.field3802 <= var19) {
                            if (class495.field6930 > var19) {
                                class470.field6616 = class191.field2699;
                                class191.field2699 = class495.field6930;
                                class495.field6930 = var19;
                            } else if (~class191.field2699 < ~var19) {
                                class470.field6616 = class191.field2699;
                                class191.field2699 = var19;
                            } else if (class470.field6616 > var19) {
                                class470.field6616 = var19;
                            }
                        } else {
                            class470.field6616 = class191.field2699;
                            class191.field2699 = class495.field6930;
                            class495.field6930 = class274.field3802;
                            class274.field3802 = var19;
                        }
                    }
                }
                int var12 = this.field7347;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class274.field3802 + class495.field6930;
                                }
                            } else {
                                var3[var7] = class470.field6616;
                            }
                        } else {
                            var3[var7] = class191.field2699;
                        }
                    } else {
                        var3[var7] = class495.field6930;
                    }
                } else {
                    var3[var7] = class274.field3802;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "(I)V")
    private final void method3013(int arg0) {
        ++field7337;
        Random var2 = new Random((long) this.field7348);
        this.field7342 = new short[512];
        if (arg0 != 13605) {
            this.field7348 = -46;
        }
        if (this.field7338 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field7342[var3] = (short) class303.method1924((byte) -126, var2, this.field7338);
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)Z")
    public static final boolean method3014(int arg0, byte arg1) {
        ++field7340;
        int var2 = -34 % ((arg1 - -17) / 59);
        return arg0 == 6 || arg0 == 8;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILhv;)V")
    public static final void method3015(int arg0, class442 arg1) {
        ++field7335;
        if (arg0 != 5) {
            method3015(-75, (class442) null);
        }
        if (!class483.field6820) {
            arg1.method1117(0);
            --class210.field2958;
        }
    }
}
