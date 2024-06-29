import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class194 extends class263 {

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    private int field2855 = 5;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    private int field2857 = 0;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "[S")
    private short[] field2859 = new short[512];

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    private int field2852 = 2048;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    private int field2854 = 5;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    private int field2856 = 2;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "[B")
    private byte[] field2864 = new byte[512];

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    private int field2862 = 1;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "Luv;")
    public static class2 field2865 = new class2(100, -2);

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "[[B")
    public static byte[][] field2866;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)[Lns;", line = 3)
    public static final class62[] method1285(byte arg0) {
        ++field2858;
        if (arg0 != -113) {
            field2865 = null;
        }
        return new class62[] { class526.field7777, class51.field651, class460.field6707 };
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V", line = 19)
    private final void method1286(byte arg0) {
        ++field2853;
        Random var2 = new Random((long) this.field2857);
        this.field2859 = new short[512];
        if (~this.field2852 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2859[var3] = (short) class363.method2166(22591, this.field2852, var2);
            }
        }
        if (arg0 <= 126) {
            this.field2852 = -67;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZLgk;)V", line = 49)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field2860;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field2854 = arg2.method2765(98);
                                }
                            } else {
                                this.field2855 = arg2.method2765(55);
                            }
                        } else {
                            this.field2862 = arg2.method2765(122);
                        }
                    } else {
                        this.field2856 = arg2.method2765(91);
                    }
                } else {
                    this.field2852 = arg2.method2727((byte) 43);
                }
            } else {
                this.field2857 = arg2.method2765(105);
            }
        } else {
            this.field2855 = this.field2854 = arg2.method2765(118);
        }
        if (!arg1) {
            this.field2859 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 151)
    public class194() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)V", line = 132)
    public static void method1287(byte arg0) {
        if (arg0 == 103) {
            field2865 = null;
            field2866 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V", line = 154)
    public final void method748(byte arg0) {
        this.field2864 = class372.method2213(this.field2857, (byte) -51);
        if (arg0 != 110) {
            this.field2857 = -8;
        }
        ++field2863;
        this.method1286((byte) 127);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)[I", line = 166)
    public final int[] method33(int arg0, byte arg1) {
        ++field2861;
        if (arg1 <= 40) {
            return null;
        } else {
            int[] var3 = super.field3917.method41(arg0, 1);
            if (super.field3917.field91) {
                int var4 = class170.field2509[arg0] * this.field2854 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; ~class367.field5597 < ~var7; ++var7) {
                    class145.field2187 = Integer.MAX_VALUE;
                    class316.field4873 = Integer.MAX_VALUE;
                    class74.field1054 = Integer.MAX_VALUE;
                    class355.field5455 = Integer.MAX_VALUE;
                    int var8 = class379.field5711[var7] * this.field2855 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 - -1;
                    for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                        int var13 = 255 & this.field2864[(this.field2854 <= var11 ? var11 - this.field2854 : var11) & 255];
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = 2 * (this.field2864[(var14 >= this.field2855 ? -this.field2855 + var14 : var14) + var13 & 255] & 255);
                            int var27 = var15 + 1;
                            int var16 = var8 + -this.field2859[var15] + -(var14 << 12);
                            int var17 = -(var11 << 12) + -this.field2859[var27] + var4;
                            int var18 = this.field2862;
                            int var19;
                            if (var18 != 1) {
                                if (var18 != 3) {
                                    if (var18 != 4) {
                                        if (~var18 != -6) {
                                            if (var18 == 2) {
                                                var19 = (~var17 > -1 ? -var17 : var17) + (~var16 <= -1 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                        int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var17 > -1 ? -var17 : var17;
                                    int var26 = ~var16 <= -1 ? var16 : -var16;
                                    var19 = var26 <= var25 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 - -(var17 * var17) >> 12;
                            }
                            if (~class355.field5455 >= ~var19) {
                                if (~var19 > ~class74.field1054) {
                                    class145.field2187 = class316.field4873;
                                    class316.field4873 = class74.field1054;
                                    class74.field1054 = var19;
                                } else if (class316.field4873 <= var19) {
                                    if (~var19 > ~class145.field2187) {
                                        class145.field2187 = var19;
                                    }
                                } else {
                                    class145.field2187 = class316.field4873;
                                    class316.field4873 = var19;
                                }
                            } else {
                                class145.field2187 = class316.field4873;
                                class316.field4873 = class74.field1054;
                                class74.field1054 = class355.field5455;
                                class355.field5455 = var19;
                            }
                        }
                    }
                    int var12 = this.field2856;
                    if (~var12 != -1) {
                        if (~var12 != -2) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class355.field5455 + class74.field1054;
                                    }
                                } else {
                                    var3[var7] = class145.field2187;
                                }
                            } else {
                                var3[var7] = class316.field4873;
                            }
                        } else {
                            var3[var7] = class74.field1054;
                        }
                    } else {
                        var3[var7] = class355.field5455;
                    }
                }
            }
            return var3;
        }
    }
}
