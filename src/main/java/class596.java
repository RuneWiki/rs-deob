import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class596 extends class62 {

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public int field8807 = 1638;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public int field8805 = 0;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public int field8809 = 4;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "[B")
    private byte[] field8806 = new byte[512];

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public int field8818 = 4;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public int field8815 = 4;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "Z")
    public boolean field8814 = true;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "Lada;")
    public static class144 field8819 = new class144(47, -1);

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "Llb;")
    public static class465 field8821 = new class465(8);

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field8823 = 1403;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "[S")
    private short[] field8808;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "[S")
    private short[] field8817;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 4)
    private final void method3526(byte arg0) {
        if (~this.field8807 >= -1) {
            if (this.field8817 != null && ~this.field8817.length == ~this.field8815) {
                this.field8808 = new short[this.field8815];
                for (int var2 = 0; this.field8815 > var2; ++var2) {
                    this.field8808[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field8817 = new short[this.field8815];
            this.field8808 = new short[this.field8815];
            for (int var3 = 0; ~this.field8815 < ~var3; ++var3) {
                this.field8817[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field8807 / 4096.0F), (double) var3)));
                this.field8808[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != -38) {
            this.method11((class148) null, 113, 100);
        }
        ++field8810;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lgw;II)V", line = 44)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field8816;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field8809 = arg0.method1032((byte) -33);
                                }
                            } else {
                                this.field8818 = arg0.method1032((byte) -33);
                            }
                        } else {
                            this.field8805 = arg0.method1032((byte) -33);
                        }
                    } else {
                        this.field8818 = this.field8809 = arg0.method1032((byte) -33);
                    }
                } else {
                    this.field8807 = arg0.method1047(~arg1);
                    if (~this.field8807 > -1) {
                        this.field8817 = new short[this.field8815];
                        for (int var5 = 0; ~this.field8815 < ~var5; ++var5) {
                            this.field8817[var5] = (short) arg0.method1047(0);
                        }
                    }
                }
            } else {
                this.field8815 = arg0.method1032((byte) -33);
            }
        } else {
            this.field8814 = ~arg0.method1032((byte) -33) == -2;
        }
        if (arg1 != -1) {
            field8821 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 319)
    public class596() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[II)V", line = 143)
    public final void method3527(int arg0, int[] arg1, int arg2) {
        ++field8812;
        if (arg0 != 766389473) {
            this.field8817 = null;
        }
        int var4 = class309.field4265[arg2] * this.field8809;
        if (this.field8815 != 1) {
            short var5 = this.field8817[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field8808[0] << 12;
                int var7 = this.field8809 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field8818 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                if (var7 <= var11) {
                    var11 = 0;
                }
                int var12 = var8 & 4095;
                int var13 = this.field8806[var10 & 255] & 255;
                int var14 = class30.field335[var12];
                int var15 = this.field8806[var11 & 255] & 255;
                for (int var16 = 0; var16 < class438.field5847; ++var16) {
                    int var36 = class200.field2965[var16] * this.field8818;
                    int var37 = this.method3530((byte) 0, var13, var12, var9, var14, var15, var6 * var36 >> 12);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~var17 > ~this.field8815; ++var17) {
                short var18 = this.field8817[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field8808[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field8809 * var19 >> 12;
                    int var22 = this.field8818 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var20 & 4095;
                    if (~var21 >= ~var24) {
                        var24 = 0;
                    }
                    int var26 = this.field8806[var23 & 255] & 255;
                    int var27 = class30.field335[var25];
                    int var28 = this.field8806[var24 & 255] & 255;
                    if (this.field8814 && this.field8815 - 1 == var17) {
                        for (int var29 = 0; class438.field5847 > var29; ++var29) {
                            int var30 = class200.field2965[var29] * this.field8818;
                            int var31 = this.method3530((byte) 0, var26, var25, var22, var27, var28, var19 * var30 >> 12);
                            int var32 = arg1[var29] - -(var18 * var31 >> 12);
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~class438.field5847 < ~var33; ++var33) {
                            int var34 = class200.field2965[var33] * this.field8818;
                            int var35 = this.method3530((byte) 0, var26, var25, var22, var27, var28, var19 * var34 >> 12);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field8817[0];
            int var39 = this.field8808[0] << 12;
            int var40 = this.field8809 * var39 >> 12;
            int var41 = this.field8818 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 - -1;
            if (~var44 <= ~var40) {
                var44 = 0;
            }
            int var45 = var42 & 4095;
            int var46 = class30.field335[var45];
            int var47 = 255 & this.field8806[var43 & 255];
            int var48 = this.field8806[var44 & 255] & 255;
            if (this.field8814) {
                for (int var49 = 0; ~class438.field5847 < ~var49; ++var49) {
                    int var50 = class200.field2965[var49] * this.field8818;
                    int var51 = this.method3530((byte) 0, var47, var45, var41, var46, var48, var39 * var50 >> 12);
                    int var52 = var38 * var51 >> 12;
                    arg1[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; class438.field5847 > var53; ++var53) {
                    int var54 = class200.field2965[var53] * this.field8818;
                    int var55 = this.method3530((byte) 0, var47, var45, var41, var46, var48, var39 * var54 >> 12);
                    arg1[var53] = var38 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "(I)V", line = 308)
    public static void method3528(int arg0) {
        field8821 = null;
        if (arg0 == -4096) {
            field8819 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)[I", line = 336)
    public final int[] method13(int arg0, int arg1) {
        ++field8820;
        if (arg1 != 656024161) {
            this.field8806 = null;
        }
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            this.method3527(766389473, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V", line = 367)
    public static final void method3529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8813;
        int var6 = arg5;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg5 << 1) - -3) * var10;
        int var18 = ((arg1 << 1) + -3) * var11;
        int var19 = (arg5 + 1) * var16;
        class140.method969(arg2 - arg3, arg5 + 15888, arg4, arg2 - -arg3, class604.field8993[arg0]);
        int var20 = (arg1 + -1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (~var14 > -1) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                ++var6;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            --var7;
            var18 -= var15;
            var20 -= var15;
            int var21 = -var7 + arg0;
            int var22 = arg0 + var7;
            int var23 = arg2 - -var6;
            int var24 = -var6 + arg2;
            class140.method969(var24, 15888, arg4, var23, class604.field8993[var21]);
            class140.method969(var24, 15888, arg4, var23, class604.field8993[var22]);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIIIIII)I", line = 454)
    private final int method3530(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8811;
        int var8 = arg6 >> 12;
        int var9 = var8 - -1;
        int var10 = arg6 & 4095;
        int var11 = var8 & 255;
        if (arg3 <= var9) {
            var9 = 0;
        }
        int var12 = var9 & 255;
        int var13 = var10 + -4096;
        int var14 = arg2 + -4096;
        int var15 = class30.field335[var10];
        int var16 = 3 & this.field8806[arg1 + var11];
        if (arg0 != 0) {
            this.method3530((byte) -94, -114, 89, 62, 42, 60, -128);
        }
        int var17;
        if (~var16 >= -2) {
            var17 = var16 != 0 ? arg2 - var10 : arg2 + var10;
        } else {
            var17 = ~var16 == -3 ? -arg2 + var10 : -arg2 + -var10;
        }
        int var18 = 3 & this.field8806[arg1 + var12];
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg2 + var13 : -var13 + arg2;
        } else {
            var19 = ~var18 == -3 ? -arg2 + var13 : -arg2 + -var13;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = 3 & this.field8806[arg5 + var11];
        int var22;
        if (~var21 < -2) {
            var22 = ~var21 != -3 ? -var10 - var14 : -var14 + var10;
        } else {
            var22 = ~var21 != -1 ? -var10 + var14 : var10 + var14;
        }
        int var23 = 3 & this.field8806[arg5 + var12];
        int var24;
        if (~var23 >= -2) {
            var24 = var23 != 0 ? var14 - var13 : var13 + var14;
        } else {
            var24 = var23 == 2 ? -var14 + var13 : -var13 + -var14;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg4 >> 12) + var20;
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)V", line = 535)
    public final void method395(int arg0) {
        ++field8804;
        this.field8806 = class266.method1684(this.field8805, 36068);
        this.method3526((byte) -38);
        if (arg0 >= -37) {
            this.field8815 = -41;
        }
        for (int var2 = this.field8815 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field8817[var2];
            if (var3 > 8 || ~var3 > 7) {
                return;
            }
            --this.field8815;
        }
    }
}
