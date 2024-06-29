import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class208 extends class397 {

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    private int field2926 = 2;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "[B")
    private byte[] field2931 = new byte[512];

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    private int field2925 = 0;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    private int field2928 = 2048;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    private int field2930 = 5;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    private int field2934 = 5;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "[S")
    private short[] field2932 = new short[512];

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    private int field2937 = 1;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "[I")
    public static int[] field2927 = new int[5];

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "[I")
    public static int[] field2936;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)[I", line = 7)
    public final int[] method31(int arg0, int arg1) {
        ++field2935;
        if (arg0 != -780833076) {
            method1282((class210) null, -114, 34);
        }
        int[] var3 = super.field5854.method465(arg1, 116);
        if (super.field5854.field991) {
            int var4 = class447.field6523[arg1] * this.field2934 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class164.field2152 < ~var7; ++var7) {
                class130.field1651 = Integer.MAX_VALUE;
                class131.field1681 = Integer.MAX_VALUE;
                class199.field2778 = Integer.MAX_VALUE;
                class84.field1156 = Integer.MAX_VALUE;
                int var8 = class228.field3210[var7] * this.field2930 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field2931[(~var11 > ~this.field2934 ? var11 : -this.field2934 + var11) & 255] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field2931[(~this.field2930 >= ~var14 ? -this.field2930 + var14 : var14) + var13 & 255] & 255);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field2932[var15] + var8;
                        int var17 = -(var11 << 12) + -this.field2932[var27] + var4;
                        int var18 = this.field2937;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class84.field1156 >= ~var19) {
                            if (class199.field2778 <= var19) {
                                if (var19 >= class131.field1681) {
                                    if (~var19 > ~class130.field1651) {
                                        class130.field1651 = var19;
                                    }
                                } else {
                                    class130.field1651 = class131.field1681;
                                    class131.field1681 = var19;
                                }
                            } else {
                                class130.field1651 = class131.field1681;
                                class131.field1681 = class199.field2778;
                                class199.field2778 = var19;
                            }
                        } else {
                            class130.field1651 = class131.field1681;
                            class131.field1681 = class199.field2778;
                            class199.field2778 = class84.field1156;
                            class84.field1156 = var19;
                        }
                    }
                }
                int var12 = this.field2926;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = class199.field2778 - class84.field1156;
                                }
                            } else {
                                var3[var7] = class130.field1651;
                            }
                        } else {
                            var3[var7] = class131.field1681;
                        }
                    } else {
                        var3[var7] = class199.field2778;
                    }
                } else {
                    var3[var7] = class84.field1156;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljo;II)Lkp;", line = 214)
    public static final class323 method1282(class210 arg0, int arg1, int arg2) {
        if (arg2 != -2872) {
            return null;
        } else {
            ++field2933;
            class323 var3;
            if (class83.field1132 != null) {
                var3 = class83.field1132;
                class83.field1132 = class83.field1132.field4727;
                var3.field4727 = null;
                --class198.field2771;
            } else {
                var3 = new class323();
            }
            var3.field4730 = arg1;
            var3.field4726 = arg0;
            return var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 409)
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V", line = 253)
    private final void method1283(byte arg0) {
        ++field2938;
        Random var2 = new Random((long) this.field2925);
        this.field2932 = new short[512];
        if (this.field2928 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field2932[var3] = (short) class154.method931(var2, this.field2928, (byte) 8);
            }
        }
        if (arg0 >= -10) {
            this.method24(-116);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 286)
    public final void method24(int arg0) {
        if (arg0 != 255) {
            method1282((class210) null, -24, -90);
        }
        this.field2931 = class3.method17((byte) -126, this.field2925);
        ++field2939;
        this.method1283((byte) -24);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIZI)V", line = 307)
    public static final void method1284(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class84.field1159 = 0L;
        ++field2941;
        int var5 = class262.method1618(-29489);
        int var6 = -61 / ((-19 - arg4) / 48);
        if (arg0 == 3 || ~var5 == -4) {
            arg3 = true;
        }
        if (!class481.field6937.method816()) {
            arg3 = true;
        }
        class146.method909(arg0, 768, arg2, arg3, var5, arg1);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLae;)V", line = 328)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field2940;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field2934 = arg2.method941((byte) 123);
                                }
                            } else {
                                this.field2930 = arg2.method941((byte) 127);
                            }
                        } else {
                            this.field2937 = arg2.method941((byte) 124);
                        }
                    } else {
                        this.field2926 = arg2.method941((byte) 124);
                    }
                } else {
                    this.field2928 = arg2.method993((byte) -122);
                }
            } else {
                this.field2925 = arg2.method941((byte) 127);
            }
        } else {
            this.field2930 = this.field2934 = arg2.method941((byte) 126);
        }
        if (arg1 != 80) {
            this.field2931 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(B)V", line = 412)
    public static void method1285(byte arg0) {
        if (arg0 != -60) {
            method1285((byte) -71);
        }
        field2936 = null;
        field2927 = null;
    }
}
