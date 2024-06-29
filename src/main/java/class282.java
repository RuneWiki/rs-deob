import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class282 extends class601 {

    @OriginalMember(owner = "client!uga", name = "F", descriptor = "I")
    private int field3646 = 4096;

    @OriginalMember(owner = "client!uga", name = "K", descriptor = "I")
    private int field3650 = 0;

    @OriginalMember(owner = "client!uga", name = "H", descriptor = "Luw;")
    public static class208 field3648 = new class208(41, -2);

    @OriginalMember(owner = "client!uga", name = "Q", descriptor = "Ltq;")
    public static class536 field3656 = new class536(50);

    @OriginalMember(owner = "client!uga", name = "R", descriptor = "[B")
    public static byte[] field3657 = new byte[2048];

    @OriginalMember(owner = "client!uga", name = "G", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!uga", name = "J", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!uga", name = "L", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!uga", name = "M", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!uga", name = "N", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!uga", name = "O", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!uga", name = "P", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)[[I", line = 4)
    public final int[][] method638(int arg0, int arg1) {
        ++field3649;
        if (arg0 != 2017) {
            return null;
        } else {
            int[][] var3 = super.field7647.method3510((byte) -51, arg1);
            if (super.field7647.field8306) {
                int[][] var4 = this.method3247((byte) -127, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class418.field5518 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~this.field3650 < ~var12) {
                        var8[var11] = this.field3650;
                    } else if (~var12 >= ~this.field3646) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field3646;
                    }
                    if (~this.field3650 >= ~var13) {
                        if (~var13 < ~this.field3646) {
                            var9[var11] = this.field3646;
                        } else {
                            var9[var11] = var13;
                        }
                    } else {
                        var9[var11] = this.field3650;
                    }
                    if (var14 < this.field3650) {
                        var10[var11] = this.field3650;
                    } else if (var14 > this.field3646) {
                        var10[var11] = this.field3646;
                    } else {
                        var10[var11] = var14;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V", line = 171)
    public class282() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lmc;II)V", line = 85)
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field3655;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field7646 = arg0.method1509(true) == 1;
                }
            } else {
                this.field3646 = arg0.method1553((byte) -113);
            }
        } else {
            this.field3650 = arg0.method1553((byte) 105);
        }
        int var5 = -8 / ((arg2 - 40) / 52);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IB)[I", line = 128)
    public final int[] method261(int arg0, byte arg1) {
        ++field3652;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int[] var4 = this.method3243(arg0, 27123, 0);
            for (int var5 = 0; var5 < class418.field5518; ++var5) {
                int var6 = var4[var5];
                if (this.field3650 > var6) {
                    var3[var5] = this.field3650;
                } else if (this.field3646 < var6) {
                    var3[var5] = this.field3646;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return arg1 >= -76 ? null : var3;
    }

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "(B)V", line = 176)
    public static void method1725(byte arg0) {
        field3648 = null;
        field3656 = null;
        if (arg0 > -23) {
            method1725((byte) 15);
        }
        field3657 = null;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIZILha;I)V", line = 192)
    public static final void method1726(int arg0, int arg1, boolean arg2, int arg3, class570 arg4, int arg5) {
        arg4.method915(arg1, arg3, arg0 + arg1, arg3 - -arg5);
        ++field3651;
        if (!arg2) {
            method1726(-55, -57, false, 29, (class570) null, -59);
        }
        arg4.method3068(!arg2, arg1, arg3, arg0, -16777216, arg5);
        if (class562.field7147 >= 100) {
            float var6 = (float) class402.field5342 / (float) class402.field5356;
            int var7 = arg0;
            int var8 = arg5;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg0 * var6);
            } else {
                var7 = (int) ((float) arg5 / var6);
            }
            int var9 = (arg5 - var8) / 2 + arg3;
            int var10 = (-var7 + arg0) / 2 + arg1;
            if (class381.field4749 == null || class381.field4749.method620() != arg0 || ~arg5 != ~class381.field4749.method612()) {
                class402.method2349(class402.field5357, class402.field5347 + class402.field5342, class402.field5357 - -class402.field5356, class402.field5347, var10, var9, var7 + var10, var8 + var9);
                class402.method2351(arg4);
                class381.field4749 = arg4.method955(var10, var9, var7, var8, false);
            }
            class381.field4749.method4203(var10, var9);
            int var11 = class152.field1936 * var7 / class402.field5356;
            int var12 = class580.field7341 * var8 / class402.field5342;
            int var13 = var10 - -(class522.field6628 * var7 / class402.field5356);
            int var14 = -(class187.field2613 * var8 / class402.field5342) + var8 + -var12 + var9;
            int var15 = -1996554240;
            if (class201.field2799 == class186.field2600) {
                var15 = -1996488705;
            }
            arg4.method921(var13, var14, var11, var12, var15, 1);
            arg4.method911(var13, var14, var11, var12, var15, 0);
            if (class568.field7179 > 0) {
                int var16;
                if (~class317.field3954 >= -51) {
                    var16 = class317.field3954 * 5;
                } else {
                    var16 = -(class317.field3954 * 5) + 500;
                }
                for (class307 var17 = (class307) class402.field5329.method3591(0); var17 != null; var17 = (class307) class402.field5329.method3600((byte) 107)) {
                    class624 var18 = class402.field5322.method2323(var17.field3860, true);
                    if (class756.method4106(var18, (byte) -113)) {
                        if (class207.field2846 != var17.field3860) {
                            if (~class670.field8696 != 0 && class670.field8696 == var18.field7931) {
                                int var19 = var17.field3857 * var7 / class402.field5356 + var10;
                                int var20 = var9 - -((-var17.field3859 + class402.field5342) * var8 / class402.field5342);
                                arg4.method3068(false, var19 + -2, var20 - 2, 4, var16 << 24 | 16776960, 4);
                            }
                        } else {
                            int var21 = var17.field3857 * var7 / class402.field5356 + var10;
                            int var22 = (class402.field5342 - var17.field3859) * var8 / class402.field5342 + var9;
                            arg4.method3068(!arg2, var21 - 2, var22 - 2, 4, var16 << 24 | 16776960, 4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "(I)V", line = 299)
    public static final void method1727(int arg0) {
        class85.field1197.method2617(28812);
        if (arg0 != -1996488705) {
            method1727(-112);
        }
        ++field3654;
    }
}
