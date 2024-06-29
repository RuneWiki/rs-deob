import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class607 {

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Lwf;")
    private class117 field9010 = new class117(64);

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "Lwf;")
    public class117 field9019 = new class117(2);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Lkda;")
    private class328 field9009;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "Lkda;")
    public class328 field9018;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public final void method3568(byte arg0) {
        class117 var2 = this.field9010;
        synchronized (this.field9010) {
            this.field9010.method846(arg0 ^ 0xFFFFFFE1);
        }
        field9014++;
        class117 var3 = this.field9019;
        synchronized (this.field9019) {
            this.field9019.method846(0);
        }
        if (arg0 != -31) {
            field9016 = -128;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BI)V")
    public final void method3569(byte arg0, int arg1) {
        field9013++;
        class117 var3 = this.field9010;
        synchronized (this.field9010) {
            this.field9010.method834(arg1, 0);
        }
        class117 var4 = this.field9019;
        synchronized (this.field9019) {
            if (arg0 <= 31) {
                this.field9009 = null;
            }
            this.field9019.method834(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9012++;
        if (arg3 != 21893) {
            method3570(66, -29, -61, 40, 30, 90, -127, -116);
        }
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg1 - arg0;
        int var12 = arg6 - arg0;
        int var13 = arg1 * arg1;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class604.field8993[arg2];
        class140.method969(arg7 - arg1, 15888, arg4, arg7 - var11, var39);
        class140.method969(arg7 - var11, 15888, arg5, arg7 + var11, var39);
        class140.method969(arg7 + var11, 15888, arg4, arg7 + arg1, var39);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class140.method969(var44, 15888, arg4, var46, class604.field8993[var41]);
                class140.method969(var46, arg3 - 6005, arg5, var45, class604.field8993[var41]);
                class140.method969(var45, 15888, arg4, var43, class604.field8993[var41]);
                class140.method969(var44, 15888, arg4, var46, class604.field8993[var42]);
                class140.method969(var46, 15888, arg5, var45, class604.field8993[var42]);
                class140.method969(var45, 15888, arg4, var43, class604.field8993[var42]);
            } else {
                class140.method969(var44, 15888, arg4, var43, class604.field8993[var41]);
                class140.method969(var44, 15888, arg4, var43, class604.field8993[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lpc;)V")
    public static final void method3571(class577 arg0) {
        for (int var1 = arg0.field8504; var1 <= arg0.field8508; var1++) {
            for (int var2 = arg0.field8509; var2 <= arg0.field8499; var2++) {
                class205 var3 = class420.field5697[arg0.field8501][var1][var2];
                if (var3 != null) {
                    class636 var4 = var3.field3029;
                    class636 var5 = null;
                    while (var4 != null) {
                        if (var4.field9299 == arg0) {
                            if (var5 == null) {
                                var3.field3029 = var4.field9302;
                            } else {
                                var5.field9302 = var4.field9302;
                            }
                            var4.method3694(-501);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field9302;
                    }
                    var3.field3038 = 0;
                    for (class636 var6 = var3.field3029; var6 != null; var6 = var6.field9302) {
                        var3.field3038 = (byte) (var3.field3038 | var6.field9301);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)Ltu;")
    public final class293 method3572(int arg0, boolean arg1) {
        field9017++;
        class117 var3 = this.field9010;
        class293 var4;
        synchronized (this.field9010) {
            var4 = (class293) this.field9010.method842(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1) {
            this.field9018 = null;
        }
        class328 var5 = this.field9009;
        byte[] var6;
        synchronized (this.field9009) {
            var6 = this.field9009.method1966(arg0, 33, true);
        }
        class293 var7 = new class293();
        var7.field4040 = this;
        if (var6 != null) {
            var7.method1804((byte) -102, new class148(var6));
        }
        class117 var8 = this.field9010;
        synchronized (this.field9010) {
            this.field9010.method835((byte) 124, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public final void method3573(boolean arg0) {
        field9015++;
        if (!arg0) {
            this.field9018 = null;
        }
        class117 var2 = this.field9010;
        synchronized (this.field9010) {
            this.field9010.method837(127);
        }
        class117 var3 = this.field9019;
        synchronized (this.field9019) {
            this.field9019.method837(126);
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lbt;ILkda;Lkda;)V")
    public class607(class39 arg0, int arg1, class328 arg2, class328 arg3) {
        this.field9009 = arg2;
        this.field9018 = arg3;
        this.field9009.method1975(91, 33);
    }
}
