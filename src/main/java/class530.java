import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class530 extends class334 {

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
    private int field7383 = 409;

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
    private int field7386 = 4096;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "I")
    private int field7384 = 4096;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
    private int field7380 = 4096;

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "[I")
    private int[] field7388 = new int[3];

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "Z")
    public static boolean field7378 = false;

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "[I")
    public static int[] field7382 = new int[2];

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method3091(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7385;
        if (arg2 >= -68) {
            method3092(101);
        }
        if (~(2 & class336.field4782[0][arg0][arg3]) != -1) {
            return true;
        } else if (~(class336.field4782[arg4][arg0][arg3] & 16) != -1) {
            return false;
        } else {
            return ~arg1 == ~class153.method1201(arg3, -77, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method283(boolean arg0, int arg1) {
        ++field7381;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field4734.method275(26422, arg1);
            if (super.field4734.field425) {
                int[][] var4 = this.method2053(1, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class439.field6099 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var12 - this.field7388[0];
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (var13 > this.field7383) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field7388[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (this.field7383 < var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field7388[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (~this.field7383 > ~var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field7384 * var12 >> 12;
                                var9[var11] = this.field7380 * var14 >> 12;
                                var10[var11] = this.field7386 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "(I)V")
    public static void method3092(int arg0) {
        field7382 = null;
        if (arg0 != 1) {
            field7382 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
    public class530() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (!arg1) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (arg0 == 4) {
                                int var5 = arg2.method2515(85);
                                this.field7388[0] = class194.method1380(267386880, var5 << 4);
                                this.field7388[2] = class194.method1380(0, var5 >> 12);
                                this.field7388[1] = class194.method1380(var5 >> 4, 4080);
                            }
                        } else {
                            this.field7384 = arg2.method2565((byte) -108);
                        }
                    } else {
                        this.field7380 = arg2.method2565((byte) -117);
                    }
                } else {
                    this.field7386 = arg2.method2565((byte) -120);
                }
            } else {
                this.field7383 = arg2.method2565((byte) -126);
            }
            ++field7387;
        }
    }

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "(I)V")
    public static final void method3093(int arg0) {
        ++field7379;
        int[] var1 = new int[class422.field5873.field6908];
        int var2 = 0;
        for (int var3 = 0; ~var3 > ~class422.field5873.field6908; ++var3) {
            class42 var6 = class422.field5873.method2937((byte) -28, var3);
            if (~var6.field550 <= -1 || ~var6.field515 <= -1) {
                var1[var2++] = var3;
            }
        }
        class663.field9338 = new int[var2];
        int var4 = -39 / ((-64 - arg0) / 62);
        for (int var5 = 0; ~var5 > ~var2; ++var5) {
            class663.field9338[var5] = var1[var5];
        }
    }
}
