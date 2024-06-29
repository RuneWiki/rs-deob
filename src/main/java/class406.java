import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class406 extends class436 {

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "[B")
    private byte[] field5891 = new byte[512];

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    private int field5894 = 0;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    private int field5900 = 2048;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "[S")
    private short[] field5902 = new short[512];

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    private int field5906 = 2;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    private int field5896 = 1;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    private int field5910 = 5;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    private int field5909 = 5;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "Lpj;")
    public static class79 field5893 = new class79(128);

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field5895 = 127;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "Ljava/lang/String;")
    public static String field5903 = "wave2:";

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "Z")
    public static boolean field5904 = true;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V")
    private final void method2605(byte arg0) {
        ++field5911;
        Random var2 = new Random((long) this.field5894);
        int var3 = 67 / ((-63 - arg0) / 53);
        this.field5902 = new short[512];
        if (~this.field5900 < -1) {
            for (int var4 = 0; var4 < 512; ++var4) {
                this.field5902[var4] = (short) class99.method704(var2, this.field5900, (byte) -10);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIB)I")
    public static final int method2606(int arg0, int arg1, byte arg2) {
        ++field5892;
        if (arg2 != -48) {
            return 105;
        } else {
            int var3 = arg1 >> 31 & arg0 + -1;
            return ((arg1 >>> 31) + arg1) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)Lne;")
    public static final class173 method2607(int arg0) {
        ++field5912;
        if (class42.field622 != null && class300.field4148 != null) {
            if (arg0 > -100) {
                return null;
            } else {
                class300.field4148.method226(12, class42.field622);
                class173 var1 = (class173) class300.field4148.method229(12398);
                if (var1 == null) {
                    return null;
                } else {
                    class46 var2 = class368.method2358(var1.field2464, 36);
                    return var2 != null && var2.field720 && var2.method330((byte) 123) ? var1 : class156.method1048(121);
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(B)V")
    public static void method2608(byte arg0) {
        field5893 = null;
        if (arg0 >= 116) {
            field5903 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field5907;
        if (arg1 != 18338) {
            method2609(40, (byte) 28);
        }
        int[] var3 = super.field6258.method2688((byte) -125, arg0);
        if (super.field6258.field6138) {
            int var4 = class32.field499[arg0] * this.field5909 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class43.field653; ++var7) {
                class413.field6001 = Integer.MAX_VALUE;
                class168.field2400 = Integer.MAX_VALUE;
                class365.field5118 = Integer.MAX_VALUE;
                class120.field1713 = Integer.MAX_VALUE;
                int var8 = class249.field3455[var7] * this.field5910 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field5891[255 & (~this.field5909 >= ~var11 ? -this.field5909 + var11 : var11)];
                    for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (255 & this.field5891[255 & (~this.field5910 >= ~var14 ? -this.field5910 + var14 : var14) + var13]);
                        int var27 = var15 + 1;
                        int var16 = -this.field5902[var15] + -(var14 << 12) + var8;
                        int var17 = var4 - this.field5902[var27] - (var11 << 12);
                        int var18 = this.field5896;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 >= 0 ? var16 : -var16) - -(var17 < 0 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = ~var26 > ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (var19 >= class120.field1713) {
                            if (var19 >= class365.field5118) {
                                if (~var19 <= ~class168.field2400) {
                                    if (~var19 > ~class413.field6001) {
                                        class413.field6001 = var19;
                                    }
                                } else {
                                    class413.field6001 = class168.field2400;
                                    class168.field2400 = var19;
                                }
                            } else {
                                class413.field6001 = class168.field2400;
                                class168.field2400 = class365.field5118;
                                class365.field5118 = var19;
                            }
                        } else {
                            class413.field6001 = class168.field2400;
                            class168.field2400 = class365.field5118;
                            class365.field5118 = class120.field1713;
                            class120.field1713 = var19;
                        }
                    }
                }
                int var12 = this.field5906;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class120.field1713 + class365.field5118;
                                }
                            } else {
                                var3[var7] = class413.field6001;
                            }
                        } else {
                            var3[var7] = class168.field2400;
                        }
                    } else {
                        var3[var7] = class365.field5118;
                    }
                } else {
                    var3[var7] = class120.field1713;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V")
    public static final void method2609(int arg0, byte arg1) {
        ++field5908;
        class26.field420 = arg0;
        class410.field5951.method1249(1);
        if (arg1 >= -15) {
            method2607(-128);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 != -14) {
            field5903 = null;
        }
        this.field5891 = class20.method125(this.field5894, arg0 ^ 69);
        ++field5897;
        this.method2605((byte) -125);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field5901;
        if (arg0 == 34) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (~arg1 != -6) {
                                    if (~arg1 == -7) {
                                        this.field5909 = arg2.method2429(0);
                                    }
                                } else {
                                    this.field5910 = arg2.method2429(0);
                                }
                            } else {
                                this.field5896 = arg2.method2429(0);
                            }
                        } else {
                            this.field5906 = arg2.method2429(0);
                        }
                    } else {
                        this.field5900 = arg2.method2403((byte) 91);
                    }
                } else {
                    this.field5894 = arg2.method2429(0);
                }
            } else {
                this.field5910 = this.field5909 = arg2.method2429(arg0 ^ 34);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(B)V")
    public static final void method2610(byte arg0) {
        if (class389.field5708 && class293.field4056[81] && ~class390.field5740 < -3) {
            class20.method132((class207) class167.field2393.field2720.field5369.field5369, 2);
        } else {
            class20.method132((class207) class167.field2393.field2720.field5369, 2);
        }
        int var1 = -37 % ((arg0 - -87) / 37);
        ++field5899;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class406() {
        super(0, true);
    }
}
