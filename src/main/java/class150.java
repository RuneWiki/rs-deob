import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class150 extends class478 {

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "[S")
    private short[] field1659 = new short[512];

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
    private int field1655 = 5;

    @OriginalMember(owner = "client!ifa", name = "L", descriptor = "I")
    private int field1664 = 0;

    @OriginalMember(owner = "client!ifa", name = "D", descriptor = "I")
    private int field1656 = 1;

    @OriginalMember(owner = "client!ifa", name = "H", descriptor = "I")
    private int field1660 = 2;

    @OriginalMember(owner = "client!ifa", name = "M", descriptor = "I")
    private int field1665 = 2048;

    @OriginalMember(owner = "client!ifa", name = "K", descriptor = "I")
    private int field1663 = 5;

    @OriginalMember(owner = "client!ifa", name = "I", descriptor = "[B")
    private byte[] field1661 = new byte[512];

    @OriginalMember(owner = "client!ifa", name = "B", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ifa", name = "F", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ifa", name = "J", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ifa", name = "N", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1657;
        int[] var3 = super.field6886.method789(arg0, (byte) -80);
        if (arg1 != -11323) {
            this.method33(49, (class115) null, -27);
        }
        if (super.field6886.field1592) {
            int var4 = 2048 - -(class695.field9740[arg0] * this.field1655);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class436.field6154; ++var7) {
                class380.field5150 = Integer.MAX_VALUE;
                class309.field3801 = Integer.MAX_VALUE;
                class238.field2957 = Integer.MAX_VALUE;
                class26.field246 = Integer.MAX_VALUE;
                int var8 = class684.field9645[var7] * this.field1663 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field1661[255 & (this.field1655 > var11 ? var11 : -this.field1655 + var11)];
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (255 & this.field1661[255 & (var14 < this.field1663 ? var14 : -this.field1663 + var14) + var13]) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field1659[var15] + var8;
                        int var17 = -(var11 << 12) + var4 + -this.field1659[var27];
                        int var18 = this.field1656;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = var25 <= var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 <= ~class26.field246) {
                            if (var19 < class238.field2957) {
                                class380.field5150 = class309.field3801;
                                class309.field3801 = class238.field2957;
                                class238.field2957 = var19;
                            } else if (~var19 <= ~class309.field3801) {
                                if (var19 < class380.field5150) {
                                    class380.field5150 = var19;
                                }
                            } else {
                                class380.field5150 = class309.field3801;
                                class309.field3801 = var19;
                            }
                        } else {
                            class380.field5150 = class309.field3801;
                            class309.field3801 = class238.field2957;
                            class238.field2957 = class26.field246;
                            class26.field246 = var19;
                        }
                    }
                }
                int var12 = this.field1660;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class26.field246 + class238.field2957;
                                }
                            } else {
                                var3[var7] = class380.field5150;
                            }
                        } else {
                            var3[var7] = class309.field3801;
                        }
                    } else {
                        var3[var7] = class238.field2957;
                    }
                } else {
                    var3[var7] = class26.field246;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
    public final void method34(byte arg0) {
        this.field1661 = class427.method2467(24122, this.field1664);
        ++field1662;
        if (arg0 != 23) {
            this.field1661 = null;
        }
        this.method817(arg0 + -145);
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V")
    private final void method817(int arg0) {
        ++field1666;
        if (arg0 <= -33) {
            Random var2 = new Random((long) this.field1664);
            this.field1659 = new short[512];
            if (this.field1665 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field1659[var3] = (short) class304.method1756(var2, this.field1665, -1304107232);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field1655 = arg1.method620((byte) -10);
                                }
                            } else {
                                this.field1663 = arg1.method620((byte) -4);
                            }
                        } else {
                            this.field1656 = arg1.method620((byte) 84);
                        }
                    } else {
                        this.field1660 = arg1.method620((byte) 10);
                    }
                } else {
                    this.field1665 = arg1.method643((byte) -77);
                }
            } else {
                this.field1664 = arg1.method620((byte) -128);
            }
        } else {
            this.field1663 = this.field1655 = arg1.method620((byte) 123);
        }
        if (arg0 != 255) {
            this.method33(10, (class115) null, 10);
        }
        ++field1658;
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "(I)V")
    public static final void method818(int arg0) {
        ++field1654;
        class103 var1 = (class103) class156.field1744.method3434((byte) 2);
        boolean var2 = class497.field7199 != null || ~class667.field9317 < -1;
        if (var2) {
            class89.field898 = 1;
        }
        if (class701.field9845 && class140.field1549.method1945(81, false) && ~class661.field9266 < -3) {
            if (!var2) {
                class620.method3457((class336) class694.field9730.field8677.field4174.field4174, var1.method194((byte) -106), var1.method193((byte) -66), 1);
            } else {
                class633.field8923 = (class336) class694.field9730.field8677.field4174.field4174;
            }
        } else if (var2) {
            class633.field8923 = (class336) class694.field9730.field8677.field4174;
        } else {
            class620.method3457((class336) class694.field9730.field8677.field4174, var1.method194((byte) -106), var1.method193((byte) -104), arg0 + 19203);
        }
        if (arg0 == -19202) {
            ;
        }
    }
}
