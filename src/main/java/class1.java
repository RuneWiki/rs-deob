import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class157 {

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    private int field7 = 5;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    private int field4 = 5;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "[B")
    private byte[] field11 = new byte[512];

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    private int field9 = 2048;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "I")
    private int field17 = 2;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    private int field6 = 0;

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "[S")
    private short[] field16 = new short[512];

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    private int field13 = 1;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "[[S")
    public static short[][] field5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "J")
    public static long field18 = 0L;

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "Lcc;")
    private static class209 field15 = class95.method669(85, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "Lcc;")
    public static class209 field19 = field15;

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "Lla;")
    public static class95 field20 = new class95(64);

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
    public static int field22 = 0;

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "[Ltj;")
    public static class273[] field21 = new class273[4];

    @OriginalMember(owner = "client!wf", name = "kb", descriptor = "Lcc;")
    public static class209 field24 = class95.method669(98, ")1a2)1m");

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "[Lij;")
    public static class194[] field1;

    @OriginalMember(owner = "client!wf", name = "jb", descriptor = "[[[S")
    public static short[][][] field23;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field3;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field7 = arg2.method774((byte) 108);
                                }
                            } else {
                                this.field4 = arg2.method774((byte) 99);
                            }
                        } else {
                            this.field13 = arg2.method774((byte) 114);
                        }
                    } else {
                        this.field17 = arg2.method774((byte) 112);
                    }
                } else {
                    this.field9 = arg2.method736(126);
                }
            } else {
                this.field6 = arg2.method774((byte) 75);
            }
        } else {
            this.field4 = this.field7 = arg2.method774((byte) 127);
        }
        if (arg1 >= -29) {
            field19 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(JB)V")
    public static final void method2(long arg0, byte arg1) {
        ++field10;
        if (~arg0 != -1L) {
            int var3 = -71 / ((-40 - arg1) / 49);
            for (int var4 = 0; var4 < class163.field2949; ++var4) {
                if (~class253.field4566[var4] == ~arg0) {
                    ++class35.field616;
                    --class163.field2949;
                    for (int var5 = var4; var5 < class163.field2949; ++var5) {
                        class253.field4566[var5] = class253.field4566[var5 + 1];
                        class129.field2474[var5] = class129.field2474[var5 + 1];
                    }
                    class264.field4744 = class54.field1069;
                    class84.field1677.method287((byte) 124, 110);
                    class84.field1677.method756(arg0, (byte) -88);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        int var2 = -102 % ((-51 - arg0) / 52);
        this.field11 = class259.method1800(-256, this.field6);
        this.method5(-1);
        ++field12;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field2;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (arg0 != -98) {
            field20 = null;
        }
        if (super.field2879.field3363) {
            int var4 = class129.field2479[arg1] * this.field7 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class226.field4124; ++var7) {
                class213.field3854 = Integer.MAX_VALUE;
                class66.field1272 = Integer.MAX_VALUE;
                class193.field3491 = Integer.MAX_VALUE;
                class184.field3319 = Integer.MAX_VALUE;
                int var8 = class50.field987[var7] * this.field4 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field11[255 & (~var11 <= ~this.field7 ? var11 - this.field7 : var11)];
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field11[255 & (this.field4 <= var14 ? -this.field4 + var14 : var14) + var13] & 255);
                        int var27 = var15 + 1;
                        int var16 = -this.field16[var15] + -(var14 << 12) + var8;
                        int var17 = var4 - (var11 << 12) - this.field16[var27];
                        int var18 = this.field13;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) - -(var17 < 0 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var26 > ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 > ~class184.field3319) {
                            class213.field3854 = class66.field1272;
                            class66.field1272 = class193.field3491;
                            class193.field3491 = class184.field3319;
                            class184.field3319 = var19;
                        } else if (var19 >= class193.field3491) {
                            if (~var19 <= ~class66.field1272) {
                                if (var19 < class213.field3854) {
                                    class213.field3854 = var19;
                                }
                            } else {
                                class213.field3854 = class66.field1272;
                                class66.field1272 = var19;
                            }
                        } else {
                            class213.field3854 = class66.field1272;
                            class66.field1272 = class193.field3491;
                            class193.field3491 = var19;
                        }
                    }
                }
                int var12 = this.field17;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = class193.field3491 - class184.field3319;
                                }
                            } else {
                                var3[var7] = class213.field3854;
                            }
                        } else {
                            var3[var7] = class66.field1272;
                        }
                    } else {
                        var3[var7] = class193.field3491;
                    }
                } else {
                    var3[var7] = class184.field3319;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "(I)V")
    private final void method5(int arg0) {
        ++field14;
        Random var2 = new Random((long) this.field6);
        this.field16 = new short[512];
        if (~this.field9 < arg0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field16[var3] = (short) class39.method295(-61, var2, this.field9);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "(I)V")
    public static void method6(int arg0) {
        if (arg0 == 21830) {
            field5 = null;
            field15 = null;
            field20 = null;
            field24 = null;
            field23 = null;
            field19 = null;
            field21 = null;
            field1 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class1() {
        super(0, true);
    }
}
