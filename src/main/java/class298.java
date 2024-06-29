import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class298 extends class117 {

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    private int field4747 = 5;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    private int field4749 = 2048;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    private int field4751 = 1;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    private int field4755 = 2;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "[B")
    private byte[] field4756 = new byte[512];

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    private int field4753 = 5;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "[S")
    private short[] field4761 = new short[512];

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
    private int field4763 = 0;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field4746 = -1;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4752 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "Z")
    public static boolean field4759 = false;

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "I")
    public static int field4765 = 0;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "Lam;")
    public static class314 field4762;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "Z")
    public static boolean field4748;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)Lsk;")
    public static final class203 method1969(int arg0, byte arg1) {
        if (arg1 >= -2) {
            return null;
        } else {
            ++field4750;
            return class111.field1754 && class180.field2942 <= arg0 && ~arg0 >= ~class77.field1287 ? class160.field2542[-class180.field2942 + arg0] : null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
    public static void method1970(byte arg0) {
        if (arg0 > 95) {
            field4752 = null;
            field4762 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLbm;)V")
    public static final void method1971(byte arg0, class131 arg1) {
        ++field4760;
        for (class107 var2 = (class107) class267.field4298.method1643((byte) 114); var2 != null; var2 = (class107) class267.field4298.method1642((byte) 86)) {
            if (var2.field1720 == arg1) {
                if (var2.field1699 != null) {
                    class6.field68.method1594(var2.field1699);
                    var2.field1699 = null;
                }
                var2.method913(-3542);
                return;
            }
        }
        if (arg0 != 35) {
            method1971((byte) -84, (class131) null);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 2) {
            this.field4749 = 121;
        }
        ++field4758;
        int[] var3 = super.field1883.method531(arg1, (byte) 83);
        if (super.field1883.field1313) {
            int var4 = 2048 - -(class173.field2835[arg1] * this.field4747);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class168.field2737; ++var7) {
                class314.field5037 = Integer.MAX_VALUE;
                class162.field2600 = Integer.MAX_VALUE;
                class71.field1200 = Integer.MAX_VALUE;
                class190.field3081 = Integer.MAX_VALUE;
                int var8 = class243.field3869[var7] * this.field4753 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field4756[255 & (this.field4747 > var11 ? var11 : -this.field4747 + var11)];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field4756[var13 + (~this.field4753 < ~var14 ? var14 : -this.field4753 + var14) & 255] & 255) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field4761[var15] + var8;
                        int var17 = var4 - (this.field4761[var27] - -(var11 << 12));
                        int var18 = this.field4751;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = ~var25 < ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class190.field3081 < ~var19) {
                            class314.field5037 = class162.field2600;
                            class162.field2600 = class71.field1200;
                            class71.field1200 = class190.field3081;
                            class190.field3081 = var19;
                        } else if (~var19 > ~class71.field1200) {
                            class314.field5037 = class162.field2600;
                            class162.field2600 = class71.field1200;
                            class71.field1200 = var19;
                        } else if (class162.field2600 > var19) {
                            class314.field5037 = class162.field2600;
                            class162.field2600 = var19;
                        } else if (~class314.field5037 < ~var19) {
                            class314.field5037 = var19;
                        }
                    }
                }
                int var12 = this.field4755;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class190.field3081 + class71.field1200;
                                }
                            } else {
                                var3[var7] = class314.field5037;
                            }
                        } else {
                            var3[var7] = class162.field2600;
                        }
                    } else {
                        var3[var7] = class71.field1200;
                    }
                } else {
                    var3[var7] = class190.field3081;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field4754;
        if (arg0 == 1) {
            this.field4756 = class174.method1274(this.field4763, 255);
            this.method1973(512);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class298() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            this.field4755 = -102;
        }
        ++field4745;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field4747 = arg0.method1133((byte) 53);
                                }
                            } else {
                                this.field4753 = arg0.method1133((byte) 53);
                            }
                        } else {
                            this.field4751 = arg0.method1133((byte) 53);
                        }
                    } else {
                        this.field4755 = arg0.method1133((byte) 53);
                    }
                } else {
                    this.field4749 = arg0.method1142(-18970);
                }
            } else {
                this.field4763 = arg0.method1133((byte) 53);
            }
        } else {
            this.field4753 = this.field4747 = arg0.method1133((byte) 53);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(III)I")
    public static final int method1972(int arg0, int arg1, int arg2) {
        ++field4764;
        int var3 = class44.method308(arg1 + -1, arg2 - 1, -903775002) - -class44.method308(arg1 + -1, arg2 + 1, -903775002) + class44.method308(arg1 + 1, arg2 - 1, -903775002) + class44.method308(arg1 + 1, arg2 + 1, -903775002);
        int var4 = class44.method308(arg1, arg2 + -1, -903775002) - (-class44.method308(arg1, arg2 - -1, -903775002) + -class44.method308(arg1 + -1, arg2, arg0 + -903805002) - class44.method308(arg1 + 1, arg2, -903775002));
        int var5 = class44.method308(arg1, arg2, arg0 + -903805002);
        return arg0 != 30000 ? 45 : var4 / 8 + (var3 / 16 - -(var5 / 4));
    }

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "(I)V")
    private final void method1973(int arg0) {
        Random var2 = new Random((long) this.field4763);
        ++field4757;
        this.field4761 = new short[arg0];
        if (this.field4749 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field4761[var3] = (short) class67.method469(0, this.field4749, var2);
            }
        }
    }
}
