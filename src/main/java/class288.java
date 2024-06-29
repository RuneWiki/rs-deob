import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class288 extends class483 implements class36 {

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    private int field4575;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lhga;")
    public static class158 field4573 = new class158(39, 6);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lor;")
    public static class594 field4576 = new class594();

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lrl;")
    public static class672 field4577 = new class672(50, 3);

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ler;ILjaclib/memory/Buffer;IZ)V")
    public class288(class92 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4575 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ler;I[BIZ)V")
    public class288(class92 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4575 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class265.method1877((byte) 97, arg3);
        if (arg0 != -14061) {
            field4577 = null;
        }
        ++field4578;
        int var7 = 0;
        int var8 = arg3 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class545.field7931 <= arg5 && arg5 <= class585.field8331) {
            int[] var14 = class39.field527[arg5];
            int var15 = class160.method1320(0, -arg3 + arg1, class576.field8218, class340.field5510);
            int var16 = class160.method1320(0, arg1 + arg3, class576.field8218, class340.field5510);
            int var17 = class160.method1320(0, arg1 - var8, class576.field8218, class340.field5510);
            int var18 = class160.method1320(0, arg1 + var8, class576.field8218, class340.field5510);
            class367.method2427(3803, arg4, var17, var14, var15);
            class367.method2427(arg0 ^ -14392, arg6, var18, var14, var17);
            class367.method2427(3803, arg4, var16, var14, var18);
        }
        int var19 = -1;
        while (~var7 > ~var9) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (~var12 <= -1 && var11 >= 1) {
                --var11;
                var12 -= var11 << 1;
                class613.field8706[var11] = var7;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg5;
                int var21 = arg5 + var9;
                if (~class545.field7931 >= ~var21 && var20 <= class585.field8331) {
                    if (~var8 >= ~var9) {
                        int var22 = class160.method1320(arg0 ^ -14061, arg1 + var7, class576.field8218, class340.field5510);
                        int var23 = class160.method1320(0, arg1 - var7, class576.field8218, class340.field5510);
                        if (~var21 >= ~class585.field8331) {
                            class367.method2427(3803, arg4, var22, class39.field527[var21], var23);
                        }
                        if (~var20 <= ~class545.field7931) {
                            class367.method2427(3803, arg4, var22, class39.field527[var20], var23);
                        }
                    } else {
                        int var24 = class613.field8706[var9];
                        int var25 = class160.method1320(0, arg1 - -var7, class576.field8218, class340.field5510);
                        int var26 = class160.method1320(0, -var7 + arg1, class576.field8218, class340.field5510);
                        int var27 = class160.method1320(0, arg1 + var24, class576.field8218, class340.field5510);
                        int var28 = class160.method1320(arg0 ^ -14061, -var24 + arg1, class576.field8218, class340.field5510);
                        if (~class585.field8331 <= ~var21) {
                            int[] var29 = class39.field527[var21];
                            class367.method2427(arg0 + 17864, arg4, var28, var29, var26);
                            class367.method2427(3803, arg6, var27, var29, var28);
                            class367.method2427(3803, arg4, var25, var29, var27);
                        }
                        if (var20 >= class545.field7931) {
                            int[] var30 = class39.field527[var20];
                            class367.method2427(3803, arg4, var28, var30, var26);
                            class367.method2427(3803, arg6, var27, var30, var28);
                            class367.method2427(3803, arg4, var25, var30, var27);
                        }
                    }
                }
            }
            int var31 = arg5 - var7;
            int var32 = arg5 - -var7;
            if (~var32 <= ~class545.field7931 && class585.field8331 >= var31) {
                int var33 = arg1 - -var9;
                int var34 = arg1 - var9;
                if (~var33 <= ~class576.field8218 && ~class340.field5510 <= ~var34) {
                    int var35 = class160.method1320(0, var33, class576.field8218, class340.field5510);
                    int var36 = class160.method1320(0, var34, class576.field8218, class340.field5510);
                    if (~var7 <= ~var8) {
                        if (~var32 >= ~class585.field8331) {
                            class367.method2427(3803, arg4, var35, class39.field527[var32], var36);
                        }
                        if (~var31 <= ~class545.field7931) {
                            class367.method2427(3803, arg4, var35, class39.field527[var31], var36);
                        }
                    } else {
                        int var37 = var11 >= var7 ? var11 : class613.field8706[var7];
                        int var38 = class160.method1320(arg0 ^ -14061, arg1 + var37, class576.field8218, class340.field5510);
                        int var39 = class160.method1320(0, arg1 - var37, class576.field8218, class340.field5510);
                        if (class585.field8331 >= var32) {
                            int[] var40 = class39.field527[var32];
                            class367.method2427(3803, arg4, var39, var40, var36);
                            class367.method2427(3803, arg6, var38, var40, var39);
                            class367.method2427(3803, arg4, var35, var40, var38);
                        }
                        if (var31 >= class545.field7931) {
                            int[] var41 = class39.field527[var31];
                            class367.method2427(3803, arg4, var39, var41, var36);
                            class367.method2427(arg0 + 17864, arg6, var38, var41, var39);
                            class367.method2427(3803, arg4, var35, var41, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B[BII)V")
    public final void method472(byte arg0, byte[] arg1, int arg2, int arg3) {
        this.method2973(arg1, arg3, (byte) -124);
        ++field4571;
        this.field4575 = arg2;
        int var5 = 3 % ((-48 - arg0) / 48);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public final void method689(byte arg0) {
        super.field7093.method859(34962, this);
        ++field4570;
        if (arg0 != 112) {
            method2040(-44, 99, -47, 49, 40, -77, -28);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)I")
    public final int method469(boolean arg0) {
        if (!arg0) {
            return -49;
        } else {
            ++field4580;
            return this.field4575;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public static void method2041(int arg0) {
        field4577 = null;
        field4576 = null;
        if (arg0 <= 92) {
            method2040(-42, 63, 87, 1, -114, -126, 64);
        }
        field4573 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)J")
    public final long method471(boolean arg0) {
        ++field4572;
        if (!arg0) {
            this.method470(-70);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
    public final int method470(int arg0) {
        ++field4574;
        if (arg0 != -2834) {
            field4579 = -102;
        }
        return super.field7098;
    }
}
