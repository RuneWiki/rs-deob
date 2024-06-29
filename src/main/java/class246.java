import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class246 extends class30 {

    @OriginalMember(owner = "client!li", name = "O", descriptor = "[S")
    private short[] field4035 = new short[512];

    @OriginalMember(owner = "client!li", name = "L", descriptor = "[B")
    private byte[] field4032 = new byte[512];

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    private int field4046 = 2048;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    private int field4041 = 5;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    private int field4036 = 0;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    private int field4042 = 2;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    private int field4047 = 1;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
    private int field4048 = 5;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "[I")
    public static int[] field4037 = new int[500];

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "[[B")
    public static byte[][] field4031;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method1710(int arg0, boolean arg1) {
        if (arg1) {
            method1710(105, true);
        }
        class362.field5525.method337(arg0, (byte) -119);
        ++field4039;
        class121.field1663.method337(arg0, (byte) -104);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 20)
    public class246() {
        super(0, true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljg;II)V", line = 32)
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field4048 = arg0.method1322(false);
                                }
                            } else {
                                this.field4041 = arg0.method1322(false);
                            }
                        } else {
                            this.field4047 = arg0.method1322(false);
                        }
                    } else {
                        this.field4042 = arg0.method1322(false);
                    }
                } else {
                    this.field4046 = arg0.method1272((byte) -66);
                }
            } else {
                this.field4036 = arg0.method1322(false);
            }
        } else {
            this.field4041 = this.field4048 = arg0.method1322(false);
        }
        if (arg1 == 6456) {
            ++field4030;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V", line = 110)
    public final void method111(byte arg0) {
        this.field4032 = class33.method222(67, this.field4036);
        if (arg0 <= 90) {
            this.method111((byte) 113);
        }
        ++field4045;
        this.method1712(-11925);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[I", line = 125)
    public final int[] method116(int arg0, byte arg1) {
        if (arg1 <= 49) {
            this.method116(-4, (byte) -69);
        }
        ++field4044;
        int[] var3 = super.field371.method2367((byte) 113, arg0);
        if (super.field371.field5586) {
            int var4 = class132.field2064[arg0] * this.field4048 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class369.field5610 > var7; ++var7) {
                class140.field2182 = Integer.MAX_VALUE;
                class254.field4121 = Integer.MAX_VALUE;
                class358.field5477 = Integer.MAX_VALUE;
                class422.field6244 = Integer.MAX_VALUE;
                int var8 = class79.field995[var7] * this.field4041 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field4032[255 & (this.field4048 > var11 ? var11 : -this.field4048 + var11)] & 255;
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (255 & this.field4032[(~var14 > ~this.field4041 ? var14 : -this.field4041 + var14) + var13 & 255]) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field4035[var15] + var8;
                        int var17 = -(var11 << 12) + var4 + -this.field4035[var27];
                        int var18 = this.field4047;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = ~var26 <= ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class422.field6244 >= ~var19) {
                            if (var19 >= class358.field5477) {
                                if (~var19 <= ~class254.field4121) {
                                    if (class140.field2182 > var19) {
                                        class140.field2182 = var19;
                                    }
                                } else {
                                    class140.field2182 = class254.field4121;
                                    class254.field4121 = var19;
                                }
                            } else {
                                class140.field2182 = class254.field4121;
                                class254.field4121 = class358.field5477;
                                class358.field5477 = var19;
                            }
                        } else {
                            class140.field2182 = class254.field4121;
                            class254.field4121 = class358.field5477;
                            class358.field5477 = class422.field6244;
                            class422.field6244 = var19;
                        }
                    }
                }
                int var12 = this.field4042;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class422.field6244 + class358.field5477;
                                }
                            } else {
                                var3[var7] = class140.field2182;
                            }
                        } else {
                            var3[var7] = class254.field4121;
                        }
                    } else {
                        var3[var7] = class358.field5477;
                    }
                } else {
                    var3[var7] = class422.field6244;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(I)V", line = 352)
    public static void method1711(int arg0) {
        field4037 = null;
        field4031 = null;
        if (arg0 <= 3) {
            method1710(-25, true);
        }
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V", line = 375)
    private final void method1712(int arg0) {
        if (arg0 == -11925) {
            ++field4040;
            Random var2 = new Random((long) this.field4036);
            this.field4035 = new short[512];
            if (this.field4046 > 0) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field4035[var3] = (short) class105.method797(var2, -109, this.field4046);
                }
            }
        }
    }
}
