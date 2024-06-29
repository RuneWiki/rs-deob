import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class171 extends class38 {

    @OriginalMember(owner = "client!gw", name = "I", descriptor = "[B")
    private byte[] field2661 = new byte[512];

    @OriginalMember(owner = "client!gw", name = "D", descriptor = "I")
    private int field2656 = 2048;

    @OriginalMember(owner = "client!gw", name = "M", descriptor = "I")
    private int field2665 = 5;

    @OriginalMember(owner = "client!gw", name = "L", descriptor = "I")
    private int field2664 = 5;

    @OriginalMember(owner = "client!gw", name = "J", descriptor = "I")
    private int field2662 = 0;

    @OriginalMember(owner = "client!gw", name = "O", descriptor = "I")
    private int field2667 = 1;

    @OriginalMember(owner = "client!gw", name = "R", descriptor = "I")
    private int field2670 = 2;

    @OriginalMember(owner = "client!gw", name = "P", descriptor = "[S")
    private short[] field2668 = new short[512];

    @OriginalMember(owner = "client!gw", name = "K", descriptor = "Lsca;")
    public static class46 field2663 = null;

    @OriginalMember(owner = "client!gw", name = "E", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!gw", name = "F", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!gw", name = "G", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!gw", name = "Q", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!gw", name = "N", descriptor = "Laga;")
    public static class668 field2666;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)[I", line = 8)
    public final int[] method199(byte arg0, int arg1) {
        ++field2669;
        if (arg0 >= -43) {
            this.field2661 = null;
        }
        int[] var3 = super.field397.method1376(arg1, (byte) 110);
        if (super.field397.field3005) {
            int var4 = class136.field1816[arg1] * this.field2664 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class729.field10216; ++var7) {
                class263.field3724 = Integer.MAX_VALUE;
                class521.field7454 = Integer.MAX_VALUE;
                class277.field3945 = Integer.MAX_VALUE;
                class78.field1082 = Integer.MAX_VALUE;
                int var8 = class255.field3666[var7] * this.field2665 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field2661[(~this.field2664 >= ~var11 ? -this.field2664 + var11 : var11) & 255];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = (this.field2661[(this.field2665 > var14 ? var14 : -this.field2665 + var14) + var13 & 255] & 255) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - (this.field2668[var15] - var8);
                        int var17 = -this.field2668[var27] + var4 + -(var11 << 12);
                        int var18 = this.field2667;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
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
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = var25 <= var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class78.field1082 <= var19) {
                            if (~class277.field3945 < ~var19) {
                                class263.field3724 = class521.field7454;
                                class521.field7454 = class277.field3945;
                                class277.field3945 = var19;
                            } else if (class521.field7454 <= var19) {
                                if (~var19 > ~class263.field3724) {
                                    class263.field3724 = var19;
                                }
                            } else {
                                class263.field3724 = class521.field7454;
                                class521.field7454 = var19;
                            }
                        } else {
                            class263.field3724 = class521.field7454;
                            class521.field7454 = class277.field3945;
                            class277.field3945 = class78.field1082;
                            class78.field1082 = var19;
                        }
                    }
                }
                int var12 = this.field2670;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class78.field1082 + class277.field3945;
                                }
                            } else {
                                var3[var7] = class263.field3724;
                            }
                        } else {
                            var3[var7] = class521.field7454;
                        }
                    } else {
                        var3[var7] = class277.field3945;
                    }
                } else {
                    var3[var7] = class78.field1082;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V", line = 218)
    private final void method1230(int arg0) {
        ++field2658;
        Random var2 = new Random((long) this.field2662);
        this.field2668 = new short[512];
        if (~this.field2656 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2668[var3] = (short) class162.method1180(var2, this.field2656, -123);
            }
        }
        if (arg0 >= -75) {
            field2663 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "()V", line = 245)
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V", line = 255)
    public final void method191(byte arg0) {
        ++field2660;
        this.field2661 = class647.method3763(this.field2662, (byte) 118);
        if (arg0 < 120) {
            this.method190(-6, -83, (class645) null);
        }
        this.method1230(-122);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)V", line = 278)
    public static void method1231(boolean arg0) {
        field2663 = null;
        field2666 = null;
        if (arg0) {
            field2666 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIII)V", line = 292)
    public static final void method1232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2659;
        int var9 = arg1 + 1;
        class238.method1577(arg2, class664.field9322[arg1], arg3, arg4, (byte) 22);
        int var8 = arg0 - 1;
        class238.method1577(arg2, class664.field9322[arg0], arg3, arg4, (byte) -63);
        for (int var6 = var9; var6 <= var8; ++var6) {
            int[] var7 = class664.field9322[var6];
            var7[arg4] = var7[arg3] = arg2;
        }
        if (arg5 != -26674) {
            field2666 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IILrg;)V", line = 324)
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg0 < 34) {
            field2663 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field2664 = arg2.method3745(-6314);
                                }
                            } else {
                                this.field2665 = arg2.method3745(-6314);
                            }
                        } else {
                            this.field2667 = arg2.method3745(-6314);
                        }
                    } else {
                        this.field2670 = arg2.method3745(-6314);
                    }
                } else {
                    this.field2656 = arg2.method3712((byte) -106);
                }
            } else {
                this.field2662 = arg2.method3745(-6314);
            }
        } else {
            this.field2665 = this.field2664 = arg2.method3745(-6314);
        }
        ++field2657;
    }
}
