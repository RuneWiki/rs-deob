import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class164 extends class192 {

    @OriginalMember(owner = "client!cfa", name = "L", descriptor = "[S")
    private short[] field2041 = new short[512];

    @OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
    private int field2038 = 1;

    @OriginalMember(owner = "client!cfa", name = "O", descriptor = "I")
    private int field2044 = 2048;

    @OriginalMember(owner = "client!cfa", name = "S", descriptor = "[B")
    private byte[] field2048 = new byte[512];

    @OriginalMember(owner = "client!cfa", name = "J", descriptor = "I")
    private int field2039 = 5;

    @OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
    private int field2040 = 5;

    @OriginalMember(owner = "client!cfa", name = "M", descriptor = "I")
    private int field2042 = 0;

    @OriginalMember(owner = "client!cfa", name = "V", descriptor = "I")
    private int field2051 = 2;

    @OriginalMember(owner = "client!cfa", name = "R", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!cfa", name = "P", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!cfa", name = "Q", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!cfa", name = "T", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!cfa", name = "U", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!cfa", name = "N", descriptor = "Z")
    public static boolean field2043;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field2045;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 >= -123) {
            this.method618((byte) -52);
        }
        if (super.field2448.field7266) {
            int var4 = 2048 - -(class221.field2895[arg0] * this.field2040);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class561.field7319; ++var7) {
                class572.field7450 = Integer.MAX_VALUE;
                class574.field7482 = Integer.MAX_VALUE;
                class543.field7053 = Integer.MAX_VALUE;
                class109.field1408 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class183.field2359[var7] * this.field2039);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field2048[255 & (~this.field2040 < ~var11 ? var11 : -this.field2040 + var11)];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (this.field2048[var13 - -(~this.field2039 >= ~var14 ? var14 - this.field2039 : var14) & 255] & 255);
                        int var27 = var15 + 1;
                        int var16 = -this.field2041[var15] + -(var14 << 12) + var8;
                        int var17 = -(var11 << 12) + -this.field2041[var27] + var4;
                        int var18 = this.field2038;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (~var16 <= -1 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = ~var26 < ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class109.field1408 <= var19) {
                            if (~class543.field7053 < ~var19) {
                                class572.field7450 = class574.field7482;
                                class574.field7482 = class543.field7053;
                                class543.field7053 = var19;
                            } else if (~var19 <= ~class574.field7482) {
                                if (var19 < class572.field7450) {
                                    class572.field7450 = var19;
                                }
                            } else {
                                class572.field7450 = class574.field7482;
                                class574.field7482 = var19;
                            }
                        } else {
                            class572.field7450 = class574.field7482;
                            class574.field7482 = class543.field7053;
                            class543.field7053 = class109.field1408;
                            class109.field1408 = var19;
                        }
                    }
                }
                int var12 = this.field2051;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class109.field1408 + class543.field7053;
                                }
                            } else {
                                var3[var7] = class572.field7450;
                            }
                        } else {
                            var3[var7] = class574.field7482;
                        }
                    } else {
                        var3[var7] = class543.field7053;
                    }
                } else {
                    var3[var7] = class109.field1408;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)V")
    private final void method1150(int arg0) {
        ++field2046;
        if (arg0 == 5) {
            Random var2 = new Random((long) this.field2042);
            this.field2041 = new short[512];
            if (this.field2044 > 0) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field2041[var3] = (short) class562.method3002((byte) -14, var2, this.field2044);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(B)V")
    public final void method618(byte arg0) {
        this.field2048 = class697.method3801(this.field2042, (byte) -63);
        ++field2049;
        this.method1150(5);
        if (arg0 != 63) {
            this.method1150(45);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field2040 = arg1.method2396(37);
                                }
                            } else {
                                this.field2039 = arg1.method2396(59);
                            }
                        } else {
                            this.field2038 = arg1.method2396(arg2 + 12228);
                        }
                    } else {
                        this.field2051 = arg1.method2396(arg2 ^ -12039);
                    }
                } else {
                    this.field2044 = arg1.method2393(-30727);
                }
            } else {
                this.field2042 = arg1.method2396(-125);
            }
        } else {
            this.field2039 = this.field2040 = arg1.method2396(-125);
        }
        if (arg2 != -12160) {
            this.field2048 = null;
        }
        ++field2050;
    }
}
