import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class165 extends class34 {

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
    private int field2527 = 0;

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    private int field2530 = 2;

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "[S")
    private short[] field2535 = new short[512];

    @OriginalMember(owner = "client!dt", name = "P", descriptor = "[B")
    private byte[] field2538 = new byte[512];

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    private int field2526 = 2048;

    @OriginalMember(owner = "client!dt", name = "N", descriptor = "I")
    private int field2536 = 1;

    @OriginalMember(owner = "client!dt", name = "Q", descriptor = "I")
    private int field2539 = 5;

    @OriginalMember(owner = "client!dt", name = "O", descriptor = "I")
    private int field2537 = 5;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "[F")
    public static float[] field2532 = new float[4];

    @OriginalMember(owner = "client!dt", name = "S", descriptor = "[I")
    public static int[] field2541 = new int[32];

    @OriginalMember(owner = "client!dt", name = "R", descriptor = "Lsn;")
    public static class205 field2540 = new class205(3, 4);

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lsv;II)V", line = 5)
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field2528;
        if (arg1 > 16) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (~arg2 == -7) {
                                        this.field2539 = arg0.method1869(-98);
                                    }
                                } else {
                                    this.field2537 = arg0.method1869(-67);
                                }
                            } else {
                                this.field2536 = arg0.method1869(-119);
                            }
                        } else {
                            this.field2530 = arg0.method1869(-117);
                        }
                    } else {
                        this.field2526 = arg0.method1844(-114);
                    }
                } else {
                    this.field2527 = arg0.method1869(-99);
                }
            } else {
                this.field2537 = this.field2539 = arg0.method1869(-113);
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)[I", line = 89)
    public final int[] method64(int arg0, byte arg1) {
        ++field2533;
        int var3 = -61 / (-arg1 / 50);
        int[] var4 = super.field537.method1780(arg0, (byte) 92);
        if (super.field537.field4191) {
            int var5 = class284.field3856[arg0] * this.field2539 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 - -1;
            for (int var8 = 0; ~var8 > ~class383.field5502; ++var8) {
                class387.field5566 = Integer.MAX_VALUE;
                class266.field3580 = Integer.MAX_VALUE;
                class113.field1821 = Integer.MAX_VALUE;
                class293.field3960 = Integer.MAX_VALUE;
                int var9 = class91.field1463[var8] * this.field2537 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 + -1; var12 <= var7; ++var12) {
                    int var14 = 255 & this.field2538[255 & (this.field2539 > var12 ? var12 : var12 - this.field2539)];
                    for (int var15 = var10 + -1; var15 <= var11; ++var15) {
                        int var16 = (255 & this.field2538[255 & (var15 >= this.field2537 ? var15 - this.field2537 : var15) + var14]) * 2;
                        int var28 = var16 + 1;
                        int var17 = -this.field2535[var16] - (var15 << 12) + var9;
                        int var18 = -this.field2535[var28] + var5 + -(var12 << 12);
                        int var19 = this.field2536;
                        int var20;
                        if (var19 != 1) {
                            if (var19 != 3) {
                                if (~var19 != -5) {
                                    if (var19 != 5) {
                                        if (~var19 == -3) {
                                            var20 = (~var17 <= -1 ? var17 : -var17) + (var18 >= 0 ? var18 : -var18);
                                        } else {
                                            var20 = (int) (Math.sqrt((double) ((float) (var17 * var17 - -(var18 * var18)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var21 = var17 * var17;
                                        int var22 = var18 * var18;
                                        var20 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = (int) (4096.0D * Math.sqrt((double) ((float) (~var18 > -1 ? -var18 : var18) / 4096.0F)));
                                    int var25 = var23 - -var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = ~var18 > -1 ? -var18 : var18;
                                int var27 = ~var17 > -1 ? -var17 : var17;
                                var20 = ~var27 >= ~var26 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 + var18 * var18 >> 12;
                        }
                        if (var20 < class293.field3960) {
                            class387.field5566 = class266.field3580;
                            class266.field3580 = class113.field1821;
                            class113.field1821 = class293.field3960;
                            class293.field3960 = var20;
                        } else if (~var20 > ~class113.field1821) {
                            class387.field5566 = class266.field3580;
                            class266.field3580 = class113.field1821;
                            class113.field1821 = var20;
                        } else if (class266.field3580 > var20) {
                            class387.field5566 = class266.field3580;
                            class266.field3580 = var20;
                        } else if (class387.field5566 > var20) {
                            class387.field5566 = var20;
                        }
                    }
                }
                int var13 = this.field2530;
                if (var13 != 0) {
                    if (var13 != 1) {
                        if (var13 != 3) {
                            if (~var13 != -5) {
                                if (~var13 == -3) {
                                    var4[var8] = class113.field1821 - class293.field3960;
                                }
                            } else {
                                var4[var8] = class387.field5566;
                            }
                        } else {
                            var4[var8] = class266.field3580;
                        }
                    } else {
                        var4[var8] = class113.field1821;
                    }
                } else {
                    var4[var8] = class293.field3960;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(B)V", line = 302)
    public static void method1154(byte arg0) {
        field2541 = null;
        field2532 = null;
        field2540 = null;
        if (arg0 != 20) {
            method1155((byte) -120, -119);
        }
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V", line = 314)
    public final void method146(byte arg0) {
        this.field2538 = class462.method2685((byte) -94, this.field2527);
        if (arg0 <= -84) {
            ++field2529;
            this.method1156(false);
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V", line = 353)
    public class165() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(BI)V", line = 331)
    public static final void method1155(byte arg0, int arg1) {
        class100.field1594 = arg1;
        class87.field1418 = 1;
        class135.field2056 = null;
        class238.field3287 = false;
        class390.field5635 = 0;
        int var2 = -36 % ((arg0 - 11) / 54);
        class428.field6223 = -1;
        ++field2534;
        class320.field4400 = -1;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)V", line = 369)
    private final void method1156(boolean arg0) {
        ++field2531;
        if (arg0) {
            this.field2530 = 28;
        }
        Random var2 = new Random((long) this.field2527);
        this.field2535 = new short[512];
        if (~this.field2526 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field2535[var3] = (short) class322.method1908(this.field2526, -128, var2);
            }
        }
    }
}
