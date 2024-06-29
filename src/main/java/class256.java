import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class256 extends class117 {

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    private int field4479 = 5;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    private int field4482 = 0;

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "[S")
    private short[] field4485 = new short[512];

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    private int field4474 = 1;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    private int field4486 = 2048;

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "[B")
    private byte[] field4487 = new byte[512];

    @OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
    private int field4488 = 2;

    @OriginalMember(owner = "client!ag", name = "mb", descriptor = "I")
    private int field4489 = 5;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field4476 = 0;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "Lhh;")
    public static class163 field4481 = class137.method1065("sl_flags", 17);

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "Lad;")
    public static class43 field4484 = new class43(64);

    @OriginalMember(owner = "client!ag", name = "ob", descriptor = "[Lhh;")
    public static class163[] field4491 = new class163[100];

    @OriginalMember(owner = "client!ag", name = "qb", descriptor = "Lhh;")
    public static class163 field4493 = class137.method1065("::", 17);

    @OriginalMember(owner = "client!ag", name = "nb", descriptor = "Lmi;")
    public static class128 field4490 = new class128();

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ag", name = "pb", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "Lud;")
    public static class198 field4472;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "[I")
    public static int[] field4478;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        if (arg0 < -92) {
            ++field4471;
            this.field4487 = class4.method37((byte) -107, this.field4482);
            this.method1734(-1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field4489 = arg2.method622(true);
                                }
                            } else {
                                this.field4479 = arg2.method622(true);
                            }
                        } else {
                            this.field4474 = arg2.method622(true);
                        }
                    } else {
                        this.field4488 = arg2.method622(true);
                    }
                } else {
                    this.field4486 = arg2.method658(arg0 ^ 72);
                }
            } else {
                this.field4482 = arg2.method622(true);
            }
        } else {
            this.field4479 = this.field4489 = arg2.method622(true);
        }
        if (arg0 != 0) {
            method1733((byte) 18);
        }
        ++field4480;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIZ)Lhh;")
    public static final class163 method1732(int arg0, boolean arg1, int arg2, boolean arg3) {
        ++field4475;
        if (~arg0 <= -3 && arg0 <= 36) {
            int var4 = arg2 / arg0;
            int var5 = 1;
            while (~var4 != -1) {
                ++var5;
                var4 /= arg0;
            }
            if (arg1) {
                method1732(-118, true, -72, false);
            }
            int var6 = var5;
            if (~arg2 > -1 || arg3) {
                var6 = var5 + 1;
            }
            byte[] var7 = new byte[var6];
            if (~arg2 <= -1) {
                if (arg3) {
                    var7[0] = 43;
                }
            } else {
                var7[0] = 45;
            }
            for (int var8 = 0; var8 < var5; ++var8) {
                int var10 = arg2 % arg0;
                arg2 /= arg0;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (~var10 < -10) {
                    var10 += 39;
                }
                var7[var6 - 1 + -var8] = (byte) (var10 + 48);
            }
            class163 var9 = new class163();
            var9.field2990 = var6;
            var9.field3020 = var7;
            return var9;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V")
    public static void method1733(byte arg0) {
        field4481 = null;
        if (arg0 <= -44) {
            field4493 = null;
            field4478 = null;
            field4491 = null;
            field4484 = null;
            field4490 = null;
            field4472 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class256() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != -21393) {
            this.method1734(-92);
        }
        ++field4469;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int var4 = class214.field3911[arg1] * this.field4489 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class143.field2702 > var7; ++var7) {
                class129.field2506 = Integer.MAX_VALUE;
                class218.field3962 = Integer.MAX_VALUE;
                class5.field98 = Integer.MAX_VALUE;
                class64.field1089 = Integer.MAX_VALUE;
                int var8 = class26.field402[var7] * this.field4479 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field4487[(~var11 > ~this.field4489 ? var11 : -this.field4489 + var11) & 255] & 255;
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field4487[255 & (this.field4479 <= var14 ? -this.field4479 + var14 : var14) + var13] & 255) * 2;
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field4485[var15]);
                        int var17 = -(var11 << 12) - this.field4485[var27] + var4;
                        int var18 = this.field4474;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (~var16 <= -1 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = ~var26 < ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class64.field1089 > var19) {
                            class129.field2506 = class218.field3962;
                            class218.field3962 = class5.field98;
                            class5.field98 = class64.field1089;
                            class64.field1089 = var19;
                        } else if (class5.field98 > var19) {
                            class129.field2506 = class218.field3962;
                            class218.field3962 = class5.field98;
                            class5.field98 = var19;
                        } else if (~class218.field3962 < ~var19) {
                            class129.field2506 = class218.field3962;
                            class218.field3962 = var19;
                        } else if (~class129.field2506 < ~var19) {
                            class129.field2506 = var19;
                        }
                    }
                }
                int var12 = this.field4488;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class64.field1089 + class5.field98;
                                }
                            } else {
                                var3[var7] = class129.field2506;
                            }
                        } else {
                            var3[var7] = class218.field3962;
                        }
                    } else {
                        var3[var7] = class5.field98;
                    }
                } else {
                    var3[var7] = class64.field1089;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
    private final void method1734(int arg0) {
        Random var2 = new Random((long) this.field4482);
        ++field4470;
        this.field4485 = new short[512];
        if (arg0 > ~this.field4486) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field4485[var3] = (short) class127.method1012(this.field4486, var2, -22067);
            }
        }
    }
}
