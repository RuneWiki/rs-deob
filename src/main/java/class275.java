import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class275 extends class98 {

    @OriginalMember(owner = "client!so", name = "U", descriptor = "I")
    private int field3913 = 0;

    @OriginalMember(owner = "client!so", name = "V", descriptor = "I")
    private int field3914 = 2048;

    @OriginalMember(owner = "client!so", name = "T", descriptor = "I")
    private int field3912 = 10;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!so", name = "M", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!so", name = "N", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!so", name = "P", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!so", name = "R", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!so", name = "W", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!so", name = "Q", descriptor = "[I")
    private int[] field3909;

    @OriginalMember(owner = "client!so", name = "S", descriptor = "[I")
    private int[] field3911;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 5)
    public final void method188(int arg0) {
        ++field3910;
        if (arg0 != 1) {
            this.field3914 = 121;
        }
        this.method1821((byte) -39);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIZIII)V", line = 18)
    public static final void method1819(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class55.method318(arg2, 123);
        ++field3905;
        if (arg3) {
            method1820((byte) 104);
        }
        int var7 = 0;
        int var8 = -arg0 + arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg6 >= class388.field5464 && arg6 <= class219.field3080) {
            int[] var15 = class291.field4067[arg6];
            int var16 = class130.method805(true, class235.field3295, arg4 - arg2, class81.field946);
            int var17 = class130.method805(true, class235.field3295, arg2 + arg4, class81.field946);
            int var18 = class130.method805(true, class235.field3295, -var8 + arg4, class81.field946);
            int var19 = class130.method805(true, class235.field3295, arg4 + var8, class81.field946);
            class296.method1954(arg5, var18, var15, var16, -1);
            class296.method1954(arg1, var19, var15, var18, -1);
            class296.method1954(arg5, var17, var15, var19, -1);
        }
        while (~var9 < ~var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && ~var11 <= -2) {
                --var11;
                class367.field5203[var11] = var7;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg6;
                int var21 = arg6 + var9;
                if (class388.field5464 <= var21 && ~class219.field3080 <= ~var20) {
                    if (~var9 <= ~var8) {
                        int var22 = class130.method805(true, class235.field3295, arg4 + var7, class81.field946);
                        int var23 = class130.method805(!arg3, class235.field3295, -var7 + arg4, class81.field946);
                        if (class219.field3080 >= var21) {
                            class296.method1954(arg5, var22, class291.field4067[var21], var23, -1);
                        }
                        if (~class388.field5464 >= ~var20) {
                            class296.method1954(arg5, var22, class291.field4067[var20], var23, -1);
                        }
                    } else {
                        int var24 = class367.field5203[var9];
                        int var25 = class130.method805(true, class235.field3295, arg4 - -var7, class81.field946);
                        int var26 = class130.method805(!arg3, class235.field3295, -var7 + arg4, class81.field946);
                        int var27 = class130.method805(true, class235.field3295, arg4 + var24, class81.field946);
                        int var28 = class130.method805(!arg3, class235.field3295, -var24 + arg4, class81.field946);
                        if (~class219.field3080 <= ~var21) {
                            int[] var29 = class291.field4067[var21];
                            class296.method1954(arg5, var28, var29, var26, -1);
                            class296.method1954(arg1, var27, var29, var28, -1);
                            class296.method1954(arg5, var25, var29, var27, -1);
                        }
                        if (~class388.field5464 >= ~var20) {
                            int[] var30 = class291.field4067[var20];
                            class296.method1954(arg5, var28, var30, var26, -1);
                            class296.method1954(arg1, var27, var30, var28, -1);
                            class296.method1954(arg5, var25, var30, var27, -1);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (~class388.field5464 >= ~var32 && var31 <= class219.field3080) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (var33 >= class81.field946 && class235.field3295 >= var34) {
                    int var35 = class130.method805(true, class235.field3295, var33, class81.field946);
                    int var36 = class130.method805(!arg3, class235.field3295, var34, class81.field946);
                    if (var7 < var8) {
                        int var37 = var7 <= var11 ? var11 : class367.field5203[var7];
                        int var38 = class130.method805(true, class235.field3295, arg4 - -var37, class81.field946);
                        int var39 = class130.method805(true, class235.field3295, -var37 + arg4, class81.field946);
                        if (var32 <= class219.field3080) {
                            int[] var40 = class291.field4067[var32];
                            class296.method1954(arg5, var39, var40, var36, -1);
                            class296.method1954(arg1, var38, var40, var39, -1);
                            class296.method1954(arg5, var35, var40, var38, -1);
                        }
                        if (var31 >= class388.field5464) {
                            int[] var41 = class291.field4067[var31];
                            class296.method1954(arg5, var39, var41, var36, -1);
                            class296.method1954(arg1, var38, var41, var39, -1);
                            class296.method1954(arg5, var35, var41, var38, -1);
                        }
                    } else {
                        if (~class219.field3080 <= ~var32) {
                            class296.method1954(arg5, var35, class291.field4067[var32], var36, -1);
                        }
                        if (class388.field5464 <= var31) {
                            class296.method1954(arg5, var35, class291.field4067[var31], var36, -1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 203)
    public class275() {
        super(0, true);
    }

    @OriginalMember(owner = "client!so", name = "f", descriptor = "(B)V", line = 206)
    public static final void method1820(byte arg0) {
        int var1 = -11 % ((63 - arg0) / 52);
        ++field3906;
        class25.field310.method1626((byte) 106);
    }

    @OriginalMember(owner = "client!so", name = "g", descriptor = "(B)V", line = 226)
    private final void method1821(byte arg0) {
        ++field3908;
        int var2 = 0;
        if (arg0 == -39) {
            this.field3909 = new int[this.field3912 + 1];
            this.field3911 = new int[this.field3912 + 1];
            int var3 = 4096 / this.field3912;
            int var4 = this.field3914 * var3 >> 12;
            for (int var5 = 0; ~this.field3912 < ~var5; ++var5) {
                this.field3911[var5] = var2;
                this.field3909[var5] = var2 + var4;
                var2 += var3;
            }
            this.field3911[this.field3912] = 4096;
            this.field3909[this.field3912] = this.field3909[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[I", line = 257)
    public final int[] method83(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field3914 = 122;
        }
        ++field3904;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int var4 = class163.field2285[arg1];
            if (~this.field3913 != -1) {
                for (int var5 = 0; ~class268.field3811 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class189.field2722[var5];
                    int var9 = this.field3913;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = 2048 - -(var8 - var4 >> 1);
                            }
                        } else {
                            var6 = (var8 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field3912 > var10; ++var10) {
                        if (var6 >= this.field3911[var10] && this.field3911[var10 + 1] > var6) {
                            if (~var6 > ~this.field3909[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field3912 < ~var12; ++var12) {
                    if (var4 >= this.field3911[var12] && var4 < this.field3911[var12 - -1]) {
                        if (~this.field3909[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class316.method2073(var3, 0, class268.field3811, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILdg;I)V", line = 377)
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field3913 = arg1.method1574(-126);
                }
            } else {
                this.field3914 = arg1.method1617((byte) 48);
            }
        } else {
            this.field3912 = arg1.method1574(-18);
        }
        if (arg2 == 0) {
            ++field3907;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZCLjava/lang/String;)I", line = 430)
    public static final int method1822(boolean arg0, char arg1, String arg2) {
        ++field3915;
        if (arg0) {
            return -19;
        } else {
            int var3 = 0;
            int var4 = arg2.length();
            for (int var5 = 0; ~var4 < ~var5; ++var5) {
                if (~arg2.charAt(var5) == ~arg1) {
                    ++var3;
                }
            }
            return var3;
        }
    }
}
