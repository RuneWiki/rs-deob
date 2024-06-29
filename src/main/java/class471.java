import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class471 extends class573 {

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Z")
    public static boolean field6445 = false;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field6449 = 0;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Lkaa;")
    public static class47 field6444 = new class47(8, -1);

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "Lhda;")
    public static class752 field6451 = new class752(62, 1);

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method610(boolean arg0, int arg1) {
        ++field6450;
        if (arg1 < 109) {
            this.method602(-7, 77, -81);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lvfa;IIIIILaa;ILha;)V", line = 15)
    public static final void method2652(class672 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, class59 arg8) {
        ++field6441;
        class325 var9 = class361.field5088.method3192((byte) 117, arg5);
        int var10 = 97 / ((arg4 - -46) / 52);
        if (var9 != null && var9.field4642 && var9.method1968((byte) -14, class74.field901)) {
            if (var9.field4625 != null) {
                int[] var11 = new int[var9.field4625.length];
                for (int var12 = 0; var11.length / 2 > var12; ++var12) {
                    int var29;
                    if (~class278.field3898 == -5) {
                        var29 = (int) class547.field7230 & 16383;
                    } else {
                        var29 = 16383 & (int) class547.field7230 + class649.field8626;
                    }
                    int var30 = class451.field6174[var29];
                    int var31 = class451.field6177[var29];
                    if (class278.field3898 != 4) {
                        var30 = var30 * 256 / (class260.field3629 - -256);
                        var31 = var31 * 256 / (class260.field3629 + 256);
                    }
                    var11[var12 * 2] = ((arg7 - -(var9.field4625[var12 * 2] * 4)) * var31 + (var9.field4625[var12 * 2 + 1] * 4 + arg1) * var30 >> 14) + arg0.field9287 / 2 + arg3;
                    var11[var12 * 2 + 1] = arg0.field9178 / 2 + arg2 + -((var9.field4625[var12 * 2 - -1] * 4 + arg1) * var31 + -((var9.field4625[var12 * 2] * 4 + arg7) * var30) >> 14);
                }
                class699.method3937(arg8, var11, var9.field4619, arg0.field9193, arg0.field9317);
                if (~var9.field4654 >= -1) {
                    for (int var13 = 0; var11.length / 2 + -1 > var13; ++var13) {
                        arg8.method411(var11[var13 * 2], var11[var13 * 2 + 1], var11[(var13 + 1) * 2], var11[var13 * 2 + 3], var9.field4621[255 & var9.field4632[var13]], 1, arg6, arg3, arg2);
                    }
                    arg8.method411(var11[var11.length - 2], var11[var11.length + -1], var11[0], var11[1], var9.field4621[var9.field4632[var9.field4632.length + -1] & 255], 1, arg6, arg3, arg2);
                } else {
                    for (int var14 = 0; ~(var11.length / 2 + -1) < ~var14; ++var14) {
                        int var22 = var11[var14 * 2];
                        int var23 = var11[var14 * 2 - -1];
                        int var24 = var11[var14 * 2 + 2];
                        int var25 = var11[(var14 - -1) * 2 + 1];
                        if (var24 >= var22) {
                            if (var22 == var24 && var23 > var25) {
                                int var26 = var23;
                                var23 = var25;
                                var25 = var26;
                            }
                        } else {
                            int var27 = var22;
                            var22 = var24;
                            int var28 = var23;
                            var23 = var25;
                            var24 = var27;
                            var25 = var28;
                        }
                        arg8.method447(var22, var23, var24, var25, var9.field4621[var9.field4632[var14] & 255], 1, arg6, arg3, arg2, var9.field4654, var9.field4644, var9.field4637);
                    }
                    int var15 = var11[var11.length + -2];
                    int var16 = var11[var11.length + -1];
                    int var17 = var11[0];
                    int var18 = var11[1];
                    if (var17 < var15) {
                        int var19 = var15;
                        int var20 = var16;
                        var15 = var17;
                        var16 = var18;
                        var17 = var19;
                        var18 = var20;
                    } else if (var15 == var17 && var16 > var18) {
                        int var21 = var16;
                        var16 = var18;
                        var18 = var21;
                    }
                    arg8.method447(var15, var16, var17, var18, var9.field4621[var9.field4632[var9.field4632.length + -1] & 255], 1, arg6, arg3, arg2, var9.field4654, var9.field4644, var9.field4637);
                }
            }
            class133 var32 = null;
            if (var9.field4615 != -1) {
                var32 = var9.method1971(false, arg8, (byte) 72);
                if (var32 != null) {
                    class394.method2326(arg6, arg3, var32, arg1, arg7, -110, arg2, arg0);
                }
            }
            if (var9.field4657 != null) {
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.method1043();
                }
                class60 var34 = class275.field3832;
                class539 var35 = class304.field4337;
                if (var9.field4634 == 1) {
                    var35 = class180.field2728;
                    var34 = class148.field2334;
                }
                if (~var9.field4634 == -3) {
                    var35 = class105.field1446;
                    var34 = class64.field785;
                }
                class262.method1587(arg0, (byte) -65, arg1, var9.field4650, var35, var9.field4657, arg2, arg3, arg7, var33, var34, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V", line = 186)
    public static final void method2653(int arg0, int arg1) {
        ++field6442;
        if (arg0 > -24) {
            field6444 = null;
        }
        class384.field5373.method553(arg1, -15782);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZZ)V", line = 198)
    public final void method611(boolean arg0, boolean arg1) {
        super.field7517.method814(0, arg0);
        ++field6447;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lwc;IB)V", line = 206)
    public final void method607(class67 arg0, int arg1, byte arg2) {
        ++field6446;
        if (arg2 <= 68) {
            field6445 = false;
        }
        super.field7517.method823(arg0, -8423);
        super.field7517.method887((byte) 114, arg1);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V", line = 221)
    public final void method603(boolean arg0) {
        if (!arg0) {
            this.method610(false, -127);
        }
        ++field6440;
        super.field7517.method814(0, false);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V", line = 233)
    public static void method2654(byte arg0) {
        if (arg0 > -111) {
            field6451 = null;
        }
        field6444 = null;
        field6451 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 246)
    public final void method602(int arg0, int arg1, int arg2) {
        ++field6443;
        if (arg0 != -26427) {
            field6445 = false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z", line = 262)
    public final boolean method605(int arg0) {
        ++field6448;
        return arg0 != 4095 ? true : true;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lrv;)V", line = 283)
    public class471(class111 arg0) {
        super(arg0);
    }
}
