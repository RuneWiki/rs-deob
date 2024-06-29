import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class228 extends class337 {

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    private int field3709 = 5;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    private int field3708 = 0;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "[B")
    private byte[] field3710 = new byte[512];

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "[S")
    private short[] field3707 = new short[512];

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    private int field3712 = 2048;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
    private int field3713 = 1;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
    private int field3718 = 2;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "I")
    private int field3717 = 5;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field3714;
        if (arg1 != -11) {
            return null;
        } else {
            int[] var3 = super.field5007.method512(arg0, 0);
            if (super.field5007.field687) {
                int var4 = class505.field7381[arg0] * this.field3709 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; class402.field5977 > var7; ++var7) {
                    class356.field5261 = Integer.MAX_VALUE;
                    class165.field2422 = Integer.MAX_VALUE;
                    class280.field4235 = Integer.MAX_VALUE;
                    class97.field1394 = Integer.MAX_VALUE;
                    int var8 = class109.field1530[var7] * this.field3717 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                        int var13 = 255 & this.field3710[255 & (var11 >= this.field3709 ? var11 - this.field3709 : var11)];
                        for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                            int var15 = (this.field3710[255 & var13 + (var14 >= this.field3717 ? -this.field3717 + var14 : var14)] & 255) * 2;
                            int var27 = var15 + 1;
                            int var16 = -this.field3707[var15] + -(var14 << 12) + var8;
                            int var17 = var4 - ((var11 << 12) + this.field3707[var27]);
                            int var18 = this.field3713;
                            int var19;
                            if (~var18 != -2) {
                                if (~var18 != -4) {
                                    if (var18 != 4) {
                                        if (var18 != 5) {
                                            if (var18 == 2) {
                                                var19 = (var16 < 0 ? -var16 : var16) - -(var17 < 0 ? -var17 : var17);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 - -var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var16 < 0 ? -var16 : var16;
                                    int var26 = var17 < 0 ? -var17 : var17;
                                    var19 = ~var26 > ~var25 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 - -(var17 * var17) >> 12;
                            }
                            if (class97.field1394 <= var19) {
                                if (~class280.field4235 >= ~var19) {
                                    if (class165.field2422 > var19) {
                                        class356.field5261 = class165.field2422;
                                        class165.field2422 = var19;
                                    } else if (var19 < class356.field5261) {
                                        class356.field5261 = var19;
                                    }
                                } else {
                                    class356.field5261 = class165.field2422;
                                    class165.field2422 = class280.field4235;
                                    class280.field4235 = var19;
                                }
                            } else {
                                class356.field5261 = class165.field2422;
                                class165.field2422 = class280.field4235;
                                class280.field4235 = class97.field1394;
                                class97.field1394 = var19;
                            }
                        }
                    }
                    int var12 = this.field3718;
                    if (~var12 != -1) {
                        if (var12 != 1) {
                            if (~var12 != -4) {
                                if (~var12 != -5) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class97.field1394 + class280.field4235;
                                    }
                                } else {
                                    var3[var7] = class356.field5261;
                                }
                            } else {
                                var3[var7] = class165.field2422;
                            }
                        } else {
                            var3[var7] = class280.field4235;
                        }
                    } else {
                        var3[var7] = class97.field1394;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1616(String arg0, byte arg1) {
        ++field3719;
        if (class285.field4333 != null) {
            ++class517.field7532;
            class74.method640(-29627, class375.field5625);
            if (arg1 <= -74) {
                class71.field1020.method1545(class4.method10(arg0, 94), -71);
                class71.field1020.method1534(arg0, false);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "(I)V")
    private final void method1617(int arg0) {
        ++field3715;
        if (arg0 == 512) {
            Random var2 = new Random((long) this.field3708);
            this.field3707 = new short[512];
            if (~this.field3712 < -1) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field3707[var3] = (short) class477.method2873(var2, 79, this.field3712);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (arg0 <= 1) {
            this.field3709 = -56;
        }
        this.field3710 = class38.method312(-88, this.field3708);
        ++field3711;
        this.method1617(512);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = -5 / ((arg0 - 82) / 40);
        ++field3716;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field3709 = arg2.method1515((byte) 122);
                                }
                            } else {
                                this.field3717 = arg2.method1515((byte) 123);
                            }
                        } else {
                            this.field3713 = arg2.method1515((byte) 121);
                        }
                    } else {
                        this.field3718 = arg2.method1515((byte) 124);
                    }
                } else {
                    this.field3712 = arg2.method1511(88);
                }
            } else {
                this.field3708 = arg2.method1515((byte) 125);
            }
        } else {
            this.field3717 = this.field3709 = arg2.method1515((byte) 121);
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
    public class228() {
        super(0, true);
    }

    static {
        new class234("Ok", "Okay", "OK", "Ok");
    }
}
