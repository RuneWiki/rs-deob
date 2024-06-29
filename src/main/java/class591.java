import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class591 extends class739 {

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "Z")
    private boolean field8402 = true;

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "Z")
    private boolean field8403 = true;

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "Lmfa;")
    public static class407 field8401 = new class407(2);

    @OriginalMember(owner = "client!mq", name = "I", descriptor = "[I")
    public static int[] field8405 = new int[1];

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "[I")
    public static int[] field8408 = new int[14];

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "Lgr;")
    public static class530 field8406 = new class530(18, 8);

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "Lqp;")
    public static class715 field8409 = new class715(64);

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "Lqp;")
    public static class715 field8410 = new class715(8);

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "[Lsj;")
    public static class474[] field8407;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V", line = 3)
    public static final void method3470(byte arg0) {
        class196.method1381(false);
        ++field8398;
        class94.field1353 = null;
        class93.field1338 = null;
        class362.field5296 = null;
        class322.field4395 = 0;
        class326.field4421 = 0;
        class352.field5213.field6864 = 0;
        class53.field834 = null;
        class671.field9570 = 0;
        class696.method3917(0);
        class718.method4033(0);
        for (int var1 = 0; var1 < 2048; ++var1) {
            class536.field7796[var1] = null;
        }
        class108.field1536 = null;
        for (int var2 = 0; class551.field8042 > var2; ++var2) {
            class571 var4 = class414.field5889[var2].field1004;
            if (var4 != null) {
                var4.field4576 = -1;
            }
        }
        class401.method2437(-108);
        class165.field2351 = 1;
        class616.field8773 = -1;
        class539.field7824 = -1;
        class79.method649(-19704, 10);
        int var3 = 0;
        if (arg0 > -105) {
            method3470((byte) 31);
        }
        while (var3 < 100) {
            class108.field1545[var3] = true;
            ++var3;
        }
        class496.method3021(-56);
        class191.field2695 = 0L;
        class269.field3820 = null;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V", line = 65)
    public static void method3471(byte arg0) {
        field8401 = null;
        field8409 = null;
        field8410 = null;
        field8405 = null;
        field8408 = null;
        field8407 = null;
        if (arg0 <= 39) {
            field8407 = null;
        }
        field8406 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)[I", line = 85)
    public final int[] method445(boolean arg0, int arg1) {
        ++field8396;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (arg0) {
            return null;
        } else {
            if (super.field10317.field2170) {
                int[] var4 = this.method4127(!this.field8403 ? arg1 : -arg1 + class311.field4223, 120, 0);
                if (this.field8402) {
                    for (int var5 = 0; ~class399.field5703 < ~var5; ++var5) {
                        var3[var5] = var4[-var5 + class423.field6029];
                    }
                } else {
                    class85.method684(var4, 0, var3, 0, class399.field5703);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)[[I", line = 124)
    public final int[][] method113(int arg0, int arg1) {
        ++field8397;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int[][] var4 = this.method4124(!this.field8403 ? arg0 : -arg0 + class311.field4223, 0, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field8402) {
                for (int var11 = 0; var11 < class399.field5703; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class399.field5703 < ~var12; ++var12) {
                    var8[var12] = var5[-var12 + class423.field6029];
                    var9[var12] = var6[-var12 + class423.field6029];
                    var10[var12] = var7[-var12 + class423.field6029];
                }
            }
        }
        if (arg1 != 8213) {
            field8401 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V", line = 190)
    public class591() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIZ)Z", line = 195)
    public static final boolean method3472(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return false;
        } else {
            ++field8399;
            return (2048 & arg1) != 0;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lsl;IB)V", line = 207)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field10320 = ~arg0.method2886(true) == -2;
                }
            } else {
                this.field8403 = arg0.method2886(true) == 1;
            }
        } else {
            this.field8402 = ~arg0.method2886(true) == -2;
        }
        if (arg2 == 1) {
            ++field8400;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V", line = 251)
    public static final void method3473(int arg0) {
        ++field8404;
        if (arg0 < 6) {
            field8408 = null;
        }
        if (class333.field4519 != null) {
            if (~class333.field4519.field6198 == -2) {
                class333.field4519 = null;
                return;
            }
            if (~class333.field4519.field6198 == -3) {
                class338.method2082(class441.field6279, 2, class488.field7029, -15453);
                class333.field4519 = null;
                return;
            }
        }
    }
}
