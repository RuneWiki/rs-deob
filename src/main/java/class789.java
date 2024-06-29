import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class789 extends class601 {

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    private int field10800 = -1;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "[I")
    public static int[] field10804 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    public static int field10799;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field10801;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    private int field10802;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    private int field10803;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public static int field10805;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field10806;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public static int field10807;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field10808;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "I")
    public static int field10810;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "[I")
    private int[] field10809;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 5)
    public final void method2038(byte arg0) {
        ++field10807;
        int var2 = -69 % ((arg0 - -47) / 58);
        super.method2038((byte) 48);
        this.field10809 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 16)
    public static final void method4318(String arg0, boolean arg1) {
        if (class210.field2891 == null) {
            class549.method2971(-30820);
        }
        ++field10808;
        class497.field6375.setTime(new Date(class502.method2786(-7114)));
        int var2 = class497.field6375.get(11);
        int var3 = class497.field6375.get(12);
        int var4 = class497.field6375.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class340.method1966(1, '\n', arg0);
        int var7 = 0;
        if (!arg1) {
            while (var7 < var6.length) {
                for (int var8 = class184.field2591; ~var8 < -1; --var8) {
                    class210.field2891[var8] = class210.field2891[var8 + -1];
                }
                class210.field2891[0] = var5 + ": " + var6[var7];
                if (class659.field8608 != null) {
                    try {
                        class659.field8608.write(class318.method1858(class210.field2891[0] + "\n", (byte) -91));
                    } catch (IOException var9) {
                    }
                }
                if (~class184.field2591 > ~(class210.field2891.length + -1)) {
                    ++class184.field2591;
                    if (~class435.field5714 < -1) {
                        ++class435.field5714;
                    }
                }
                ++var7;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V", line = 83)
    public class789() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)V", line = 91)
    public final void method3245(int arg0, int arg1, int arg2) {
        super.method3245(arg0, arg1, arg2);
        ++field10810;
        if (this.field10800 >= 0 && class345.field4228 != null) {
            int var4 = !class345.field4228.method1732((byte) 124, this.field10800).field2673 ? 128 : 64;
            this.field10809 = class345.field4228.method1737(this.field10800, var4, 1.0F, false, var4, (byte) 45);
            this.field10803 = var4;
            this.field10802 = var4;
        }
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V", line = 109)
    public static void method4319(int arg0) {
        field10804 = null;
        if (arg0 > -78) {
            method4320(74);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)[[I", line = 124)
    public final int[][] method638(int arg0, int arg1) {
        ++field10801;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (arg0 != 2017) {
            this.method638(-38, 113);
        }
        if (super.field7647.field8306) {
            int var4 = (class418.field5514 != this.field10802 ? this.field10802 * arg1 / class418.field5514 : arg1) * this.field10803;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class418.field5518 != this.field10803) {
                for (int var8 = 0; ~var8 > ~class418.field5518; ++var8) {
                    int var9 = this.field10803 * var8 / class418.field5518;
                    int var10 = this.field10809[var4 - -var9];
                    var7[var8] = class249.method1625(var10, 255) << 4;
                    var6[var8] = class249.method1625(65280, var10) >> 4;
                    var5[var8] = class249.method1625(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class418.field5518 < ~var11; ++var11) {
                    int var12 = this.field10809[var4++];
                    var7[var11] = class249.method1625(255, var12) << 4;
                    var6[var11] = class249.method1625(var12 >> 4, 4080);
                    var5[var11] = class249.method1625(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)I", line = 192)
    public final int method3248(int arg0) {
        if (arg0 != 32727) {
            field10804 = null;
        }
        ++field10805;
        return this.field10800;
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)I", line = 203)
    public static final int method4320(int arg0) {
        ++field10806;
        if (arg0 != 3) {
            field10804 = null;
        }
        if (class430.field5649 == null) {
            if (!class525.field6678 && class643.field8232 != null) {
                return class643.field8232.field10399;
            }
            int var1 = class737.field9980.method210(0);
            int var2 = class737.field9980.method208(arg0 ^ -36);
            if (!class269.field3555) {
                if (~var1 < ~class283.field3665 && var1 < class71.field968 + class283.field3665) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class628.field7982; ++var4) {
                        if (!class689.field8857) {
                            int var8 = (-var4 + class628.field7982 + -1) * 16 + 31 + class721.field9471;
                            if (~(var8 - 13) > ~var2 && ~var2 >= ~(var8 - -3)) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = class721.field9471 + 33 - -((class628.field7982 + -1 + -var4) * 16);
                            if (var9 - 13 < var2 && ~var2 >= ~(var9 + 3)) {
                                var3 = var4;
                            }
                        }
                    }
                    if (~var3 != 0) {
                        int var5 = 0;
                        class454 var6 = new class454(class595.field7563);
                        for (class765 var7 = (class765) var6.method2583((byte) -30); var7 != null; var7 = (class765) var6.method2580(-13)) {
                            if (var3 == var5++) {
                                return var7.field10399;
                            }
                        }
                    }
                }
            } else if (class283.field3665 < var1 && ~var1 > ~(class71.field968 + class283.field3665)) {
                int var10 = -1;
                for (int var11 = 0; class486.field6268 > var11; ++var11) {
                    if (class689.field8857) {
                        int var15 = var11 * 16 + class721.field9471 + 33;
                        if (var15 + -13 < var2 && var15 + 3 >= var2) {
                            var10 = var11;
                        }
                    } else {
                        int var16 = var11 * 16 + class721.field9471 - -31;
                        if (~var2 < ~(var16 + -13) && ~var2 >= ~(var16 + 3)) {
                            var10 = var11;
                        }
                    }
                }
                if (var10 != -1) {
                    int var12 = 0;
                    class695 var13 = new class695(class253.field3440);
                    for (class403 var14 = (class403) var13.method3703(-28643); var14 != null; var14 = (class403) var13.method3704((byte) 121)) {
                        if (var12++ == var10) {
                            return ((class765) var14.field5365.field9453.field2279).field10399;
                        }
                    }
                }
            } else if (class223.field3036 != null && ~var1 < ~class29.field256 && var1 < class650.field8290 + class29.field256) {
                int var17 = -1;
                for (int var18 = 0; class223.field3036.field5360 > var18; ++var18) {
                    if (class689.field8857) {
                        int var22 = var18 * 16 + 33 + class256.field3472;
                        if (~var2 < ~(var22 - 13) && ~var2 >= ~(var22 + 3)) {
                            var17 = var18;
                        }
                    } else {
                        int var23 = var18 * 16 + class256.field3472 + 31;
                        if (var23 + -13 < var2 && var2 <= var23 + 3) {
                            var17 = var18;
                        }
                    }
                }
                if (~var17 != 0) {
                    int var19 = 0;
                    class695 var20 = new class695(class223.field3036.field5365);
                    for (class765 var21 = (class765) var20.method3703(-28643); var21 != null; var21 = (class765) var20.method3704((byte) 121)) {
                        if (~(var19++) == ~var17) {
                            return var21.field10399;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lmc;II)V", line = 396)
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field10800 = arg0.method1553((byte) 44);
        }
        int var4 = 6 % ((40 - arg2) / 52);
        ++field10799;
    }
}
