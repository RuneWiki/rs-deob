import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class491 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Lhu;")
    public static class133 field6658;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Laha;")
    public static class385 field6656;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V", line = 3)
    public static final void method2782() {
        if (class483.field6607 != null) {
            for (int var0 = 0; var0 < class483.field6607.length; var0++) {
                for (int var1 = 0; var1 < class735.field10163; var1++) {
                    for (int var2 = 0; var2 < class143.field2290; var2++) {
                        if (class483.field6607[var0][var1][var2] != null) {
                            class483.field6607[var0][var1][var2].method3948(127);
                        }
                        class483.field6607[var0][var1][var2] = null;
                    }
                }
            }
        }
        class483.field6607 = null;
        class113.field1866 = null;
        if (class681.field9516 != null) {
            for (int var3 = 0; var3 < class681.field9516.length; var3++) {
                for (int var4 = 0; var4 < class735.field10163; var4++) {
                    for (int var5 = 0; var5 < class143.field2290; var5++) {
                        if (class681.field9516[var3][var4][var5] != null) {
                            class681.field9516[var3][var4][var5].method3948(-45);
                        }
                        class681.field9516[var3][var4][var5] = null;
                    }
                }
            }
        }
        class681.field9516 = null;
        class588.field7675 = null;
        class660.field8718 = null;
        class507.field6771 = null;
        class672.field9269 = null;
        class48.field604 = null;
        class762.field10625 = null;
        class204.field3053 = null;
        class54.field657 = null;
        class265.method1600(16711680);
        if (class43.field572 != null) {
            for (int var6 = 0; var6 < class197.field2980; var6++) {
                class43.field572[var6] = null;
            }
            class197.field2980 = 0;
        }
        class496.field6694 = null;
        class8.field162 = null;
        class15.field214 = null;
        if (class195.field2932 != null) {
            for (int var7 = 0; var7 < class195.field2932.length; var7++) {
                class195.field2932[var7] = null;
            }
            class5.field125 = 0;
        }
        if (class567.field7462 != null) {
            for (int var8 = 0; var8 < class567.field7462.length; var8++) {
                class567.field7462[var8] = null;
            }
            class503.field6749 = 0;
        }
        if (class573.field7526 != null) {
            for (int var9 = 0; var9 < class295.field4220; var9++) {
                class573.field7526[var9] = null;
            }
            for (int var10 = 0; var10 < class225.field3201; var10++) {
                for (int var11 = 0; var11 < class735.field10163; var11++) {
                    for (int var12 = 0; var12 < class143.field2290; var12++) {
                        class458.field6263[var10][var11][var12] = 0L;
                    }
                }
            }
            class295.field4220 = 0;
        }
        class125.method990((byte) -82);
        class277.field3864 = class277.field3863;
        class277.field3864.method3876(28);
        class671.field9152 = null;
        class363.field5106 = null;
        class649.field8625 = null;
        if (class550.field7263 != null) {
            class589.method3216();
            class184.field2781.method437(1);
            class184.field2781.method497(0);
        }
        if (class289.field4110 != null) {
            class289.field4110 = null;
        }
        class184.field2781 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZIII)V", line = 175)
    public static final void method2783(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class411.field5711.field3913.method3282(true) == 0) {
            class26.method249(false, (byte) -124);
        } else {
            class734.field10156 = class411.field5711.field3913.method3282(true);
            class421.method2435(true, arg2 + 2861, 0);
        }
        field6657++;
        class473.field6488 = arg4;
        class672.field9327 = arg0;
        if (arg2 != -2753) {
            method2784((byte) -118, 84);
        }
        class580.field7614 = arg1;
        class744.method4173(arg3);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Z", line = 201)
    public static final boolean method2784(byte arg0, int arg1) {
        if (arg0 == 114) {
            field6659++;
            return arg1 == 3 || arg1 == 4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 214)
    public static void method2785(int arg0) {
        field6658 = null;
        field6656 = null;
        if (arg0 != 26791) {
            method2784((byte) -87, 47);
        }
    }
}
