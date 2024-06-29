import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class238 extends class123 {

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    private int field4105 = 0;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    private int field4110 = 4;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "[B")
    private byte[] field4111 = new byte[512];

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
    private int field4112 = 4;

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "Z")
    private boolean field4116 = true;

    @OriginalMember(owner = "client!fa", name = "nb", descriptor = "I")
    private int field4119 = 4;

    @OriginalMember(owner = "client!fa", name = "tb", descriptor = "I")
    private int field4125 = 1638;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "I")
    public static int field4115 = 0;

    @OriginalMember(owner = "client!fa", name = "sb", descriptor = "Leb;")
    public static class230 field4124 = class68.method589(0, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!fa", name = "mb", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!fa", name = "pb", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!fa", name = "qb", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!fa", name = "rb", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "Lfh;")
    public static class129 field4109;

    @OriginalMember(owner = "client!fa", name = "ob", descriptor = "[Lge;")
    public static class69[] field4120;

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "[S")
    private short[] field4114;

    @OriginalMember(owner = "client!fa", name = "lb", descriptor = "[S")
    private short[] field4117;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
    public static void method1669(byte arg0) {
        field4109 = null;
        if (arg0 <= -111) {
            field4124 = null;
            field4120 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[I)V")
    private final void method1670(int arg0, int arg1, int[] arg2) {
        ++field4123;
        int var4 = class154.field2753[arg1] * this.field4119;
        if (arg0 != -16321) {
            this.method1673(25, -66, -38, -60, -22, (byte) -122, 29);
        }
        if (~this.field4110 != -2) {
            short var5 = this.field4114[0];
            if (~var5 < -9 || ~var5 > 7) {
                int var6 = this.field4117[0] << 12;
                int var7 = this.field4119 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = var8 >> 12;
                int var10 = var8 & 4095;
                int var11 = this.field4112 * var6 >> 12;
                int var12 = this.field4111[255 & var9] & 255;
                int var13 = var9 + 1;
                if (var13 >= var7) {
                    var13 = 0;
                }
                int var14 = class147.field2653[var10];
                int var15 = this.field4111[var13 & 255] & 255;
                for (int var16 = 0; var16 < class140.field2505; ++var16) {
                    int var36 = class214.field3705[var16] * this.field4112;
                    int var37 = this.method1673(var6 * var36 >> 12, var10, var12, var15, var11, (byte) -50, var14);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field4110; ++var17) {
                short var18 = this.field4114[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field4117[var17] << 12;
                    int var20 = this.field4119 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field4112 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = this.field4111[255 & var23] & 255;
                    int var25 = var21 & 4095;
                    int var26 = class147.field2653[var25];
                    int var27 = var23 + 1;
                    if (var27 >= var20) {
                        var27 = 0;
                    }
                    int var28 = this.field4111[255 & var27] & 255;
                    if (this.field4116 && ~(this.field4110 - 1) == ~var17) {
                        for (int var29 = 0; ~var29 > ~class140.field2505; ++var29) {
                            int var30 = class214.field3705[var29] * this.field4112;
                            int var31 = this.method1673(var19 * var30 >> 12, var25, var24, var28, var22, (byte) -50, var26);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; class140.field2505 > var33; ++var33) {
                            int var34 = class214.field3705[var33] * this.field4112;
                            int var35 = this.method1673(var19 * var34 >> 12, var25, var24, var28, var22, (byte) -50, var26);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field4117[0] << 12;
            short var39 = this.field4114[0];
            int var40 = this.field4119 * var38 >> 12;
            int var41 = this.field4112 * var38 >> 12;
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            int var45 = 255 & this.field4111[var43 & 255];
            int var46 = var42 & 4095;
            int var47 = class147.field2653[var46];
            if (var40 <= var44) {
                var44 = 0;
            }
            int var48 = 255 & this.field4111[var44 & 255];
            if (!this.field4116) {
                for (int var49 = 0; class140.field2505 > var49; ++var49) {
                    int var50 = class214.field3705[var49] * this.field4112;
                    int var51 = this.method1673(var38 * var50 >> 12, var46, var45, var48, var41, (byte) -50, var47);
                    arg2[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~var52 > ~class140.field2505; ++var52) {
                    int var53 = class214.field3705[var52] * this.field4112;
                    int var54 = this.method1673(var38 * var53 >> 12, var46, var45, var48, var41, (byte) -50, var47);
                    int var55 = var39 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)V")
    public static final void method1671(byte arg0) {
        if (arg0 > -87) {
            method1669((byte) -91);
        }
        ++field4104;
        class146.field2634.method1124(0);
        class1.field1.method1124(0);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class238() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        this.field4111 = class210.method1463(this.field4105, true);
        this.method1674((byte) 92);
        ++field4122;
        if (arg0 != 0) {
            this.field4110 = 93;
        }
        for (int var2 = this.field4110 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field4114[var2];
            if (~var3 < -9 || var3 < -8) {
                return;
            }
            --this.field4110;
        }
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)Z")
    public static final boolean method1672(int arg0) {
        if (arg0 <= 84) {
            return false;
        } else {
            ++field4103;
            return ~class173.field3058 != -1 ? true : class210.field3663.method443((byte) -123);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = 29 / ((-24 - arg1) / 57);
        ++field4108;
        int[] var4 = super.field2160.method1323((byte) -128, arg0);
        if (super.field2160.field3243) {
            this.method1670(-16321, arg0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 != 1876195788) {
            method1675(111, 88, -106, (Component) null);
        }
        ++field4118;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field4110 = arg1.method200(arg2 + -1876195533);
            } else {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field4112 = this.field4119 = arg1.method200(255);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.field4105 = arg1.method200(255);
                        return;
                    }
                    if (~arg0 == -6) {
                        this.field4112 = arg1.method200(255);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field4119 = arg1.method200(arg2 + -1876195533);
                        return;
                    }
                } else {
                    this.field4125 = arg1.method178(arg2 ^ -1876195789);
                    if (this.field4125 < 0) {
                        this.field4114 = new short[this.field4110];
                        for (int var5 = 0; ~var5 > ~this.field4110; ++var5) {
                            this.field4114[var5] = (short) arg1.method178(-1);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field4116 = arg1.method200(255) == 1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIBI)I")
    private final int method1673(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field4113;
        int var8 = arg1 + -4096;
        int var9 = arg0 >> 12;
        int var10 = var9 - -1;
        if (~var10 <= ~arg4) {
            var10 = 0;
        }
        int var11 = arg0 & 4095;
        int var12 = var10 & 255;
        if (arg5 != -50) {
            this.field4117 = null;
        }
        int var13 = var9 & 255;
        int var14 = 3 & this.field4111[arg2 + var13];
        int var15 = class147.field2653[var11];
        int var16 = var11 + -4096;
        int var17;
        if (var14 <= 1) {
            var17 = ~var14 == -1 ? arg1 + var11 : -var11 + arg1;
        } else {
            var17 = ~var14 != -3 ? -arg1 + -var11 : var11 - arg1;
        }
        int var18 = 3 & this.field4111[arg2 + var12];
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var16 - arg1 : -var16 - arg1;
        } else {
            var19 = var18 == 0 ? arg1 + var16 : -var16 + arg1;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = 3 & this.field4111[var13 - -arg3];
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? -var8 + var11 : -var11 - var8;
        } else {
            var22 = ~var21 != -1 ? -var11 + var8 : var11 - -var8;
        }
        int var23 = this.field4111[arg3 + var12] & 3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 != 0 ? -var16 + var8 : var8 + var16;
        } else {
            var24 = ~var23 == -3 ? -var8 + var16 : -var16 - var8;
        }
        int var25 = var22 - -((-var22 + var24) * var15 >> 12);
        return ((-var20 + var25) * arg6 >> 12) + var20;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(B)V")
    private final void method1674(byte arg0) {
        if (arg0 == 92) {
            if (~this.field4125 < -1) {
                this.field4114 = new short[this.field4110];
                this.field4117 = new short[this.field4110];
                for (int var2 = 0; var2 < this.field4110; ++var2) {
                    this.field4114[var2] = (short) ((int) (Math.pow((double) ((float) this.field4125 / 4096.0F), (double) var2) * 4096.0D));
                    this.field4117[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field4114 != null && this.field4114.length == this.field4110) {
                this.field4117 = new short[this.field4110];
                for (int var3 = 0; ~var3 > ~this.field4110; ++var3) {
                    this.field4117[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
            ++field4107;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIILjava/awt/Component;)Lkf;")
    public static final class175 method1675(int arg0, int arg1, int arg2, Component arg3) {
        ++field4121;
        try {
            Class var4 = Class.forName("fc");
            if (arg0 != -914585204) {
                return null;
            } else {
                class175 var5 = (class175) var4.newInstance();
                var5.method362(arg2, arg1, false, arg3);
                return var5;
            }
        } catch (Throwable var7) {
            class41 var6 = new class41();
            var6.method362(arg2, arg1, false, arg3);
            return var6;
        }
    }
}
