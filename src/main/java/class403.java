import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class403 extends class233 implements class438 {

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Lds;")
    public class233 field5812;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field5825 = -1;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "Lig;")
    public static class15 field5828 = new class15();

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "Lbn;")
    public static class160 field5829 = new class160(15, 3);

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field5832 = new String[100];

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "Lbt;")
    public static class363 field5830 = new class363(2);

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field5833 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "Z")
    public static boolean field5834 = true;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "Z")
    public static boolean field5827;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "[Lae;")
    public static class285[] field5831;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 4)
    public static final void method2514(int arg0) {
        if (arg0 != 26995) {
            method2514(107);
        }
        class417.field6024.method2313(122);
        field5822++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 17)
    public final void method4(int arg0) {
        if (arg0 != -27030) {
            method2515((byte) 37);
        }
        field5815++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I", line = 29)
    public final int method9(byte arg0) {
        field5813++;
        if (arg0 < 102) {
            this.method10((class9) null, false);
        }
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lfp;Z)V", line = 45)
    public final void method10(class9 arg0, boolean arg1) {
        if (!arg1) {
            field5810++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lfp;III)Z", line = 55)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -754) {
            method2518(90, 120, 29, -6, -5, 112, 32, (byte) 2, -36);
        }
        field5823++;
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(B)V", line = 67)
    public static final void method2515(byte arg0) {
        class363 var1 = class264.field3902;
        synchronized (class264.field3902) {
            class264.field3902.method2307(-95);
            if (arg0 != 126) {
                method2516(-1, -89, 74, -19, -101, 58);
            }
        }
        field5819++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I", line = 80)
    public final int method1(int arg0) {
        if (arg0 >= -72) {
            return 20;
        } else {
            field5820++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)V", line = 94)
    public static final void method2516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -1) {
            field5832 = null;
        }
        if (arg2 >= class9.field128 && class63.field838 >= arg4 && class248.field3659 <= arg3 && class146.field1978 >= arg0) {
            class376.method2379(true, arg0, arg2, arg5, arg3, arg4);
        } else {
            class210.method1446(arg0, arg3, arg5, arg2, (byte) 21, arg4);
        }
        field5824++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lfp;I)V", line = 112)
    public final void method7(class9 arg0, int arg1) {
        if (arg1 < 98) {
            method2514(125);
        }
        field5809++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILfp;)Luq;", line = 123)
    public final class241 method2(int arg0, class9 arg1) {
        field5811++;
        return arg0 >= -125 ? null : null;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)I", line = 134)
    public final int method16(byte arg0) {
        field5826++;
        int var2 = -105 / ((arg0 - 21) / 54);
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(B)V", line = 146)
    public static void method2517(byte arg0) {
        field5830 = null;
        field5832 = null;
        field5829 = null;
        field5831 = null;
        field5833 = null;
        if (arg0 != -63) {
            field5834 = false;
        }
        field5828 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIBI)V", line = 161)
    public static final void method2518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field5814++;
        if (arg7 != 40) {
            field5829 = null;
        }
        if (class103.method695(arg0, -124)) {
            class336.method2178(arg1, arg3, arg4, arg2, arg5, arg6, class444.field6470[arg0], -1, -104, arg8);
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class344.field5053[var9] = true;
            }
        } else {
            class344.field5053[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Z", line = 192)
    public final boolean method15(boolean arg0) {
        if (!arg0) {
            this.method10((class9) null, false);
        }
        field5818++;
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lfp;II)Lbi;", line = 203)
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        field5817++;
        if (arg2 != -23109) {
            this.method2(-87, (class9) null);
        }
        return null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIILds;)V", line = 215)
    public class403(int arg0, int arg1, int arg2, int arg3, int arg4, class233 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class124.method835(arg1, arg0, (byte) 97));
        this.field5812 = arg5;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(ILfp;)V", line = 224)
    public final void method14(int arg0, class9 arg1) {
        if (arg0 != -7561) {
            method2517((byte) 9);
        }
        field5821++;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)I", line = 237)
    public final int method6(int arg0) {
        field5808++;
        return arg0 == -20839 ? 0 : 38;
    }
}
