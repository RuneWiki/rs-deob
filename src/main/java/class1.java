import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class233 implements class438 {

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "Loh;")
    public class443 field21;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Z")
    private boolean field3;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "Lvq;")
    public static class24 field12 = new class24(22, 6);

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "F")
    public static float field19 = 0.0F;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "Ljn;")
    public static class409 field20 = new class409("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)I", line = 3)
    public final int method1(int arg0) {
        if (arg0 >= -72) {
            return -19;
        } else {
            ++field5;
            return this.field21.field6465;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILfp;)Luq;", line = 17)
    public final class241 method2(int arg0, class9 arg1) {
        ++field1;
        if (arg0 >= -125) {
            field17 = -87;
        }
        class143 var3 = this.field21.method2718(false, super.field3497, true, super.field3494, arg1, 1024, false);
        if (var3 == null) {
            return null;
        } else {
            class187 var4 = arg1.method145();
            var4.method831(super.field3497 - -super.field3491, super.field3490, super.field3495 + super.field3494);
            class241 var5 = null;
            if (this.field3) {
                var5 = class395.method2485(-29083, 1);
            }
            if (this.field21.field6437 != null) {
                class400 var6 = this.field21.field6437.method2076();
                arg1.method166(var3, var6, var4, var5 == null ? null : var5.field3578[0], 0);
            } else {
                var3.method947(var4, var5 != null ? var5.field3578[0] : null, 0);
            }
            this.field21.method2720(super.field3494 >> 7, (byte) 86, super.field3494 >> 7, super.field3497 >> 7, true, arg1, var3, super.field3497 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIIBZ)Lct;", line = 56)
    public static final class104 method3(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        ++field8;
        if (arg3 <= 90) {
            return null;
        } else {
            class70 var5 = null;
            if (class458.field6778 != null) {
                var5 = new class70(arg1, class458.field6778, class318.field4675[arg1], 1000000);
            }
            class298.field4344[arg1] = class217.field3089.method1947((byte) 102, var5, arg1, class325.field4781);
            if (arg0) {
                class298.field4344[arg1].method1997(86);
            }
            return new class104(class298.field4344[arg1], arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 77)
    public final void method4(int arg0) {
        if (arg0 != -27030) {
            this.method7((class9) null, 13);
        }
        ++field18;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lfp;III)Z", line = 87)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        ++field7;
        class143 var5 = this.field21.method2718(false, super.field3497, false, super.field3494, arg0, 65536, false);
        if (var5 == null) {
            return false;
        } else {
            class187 var6 = arg0.method145();
            if (arg2 != -754) {
                return true;
            } else {
                var6.method831(super.field3497 + super.field3491, super.field3490, super.field3495 + super.field3494);
                return var5.method988(arg3, arg1, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)I", line = 106)
    public final int method6(int arg0) {
        if (arg0 != -20839) {
            return 70;
        } else {
            ++field2;
            return this.field21.field6462;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lfp;I)V", line = 121)
    public final void method7(class9 arg0, int arg1) {
        if (arg1 >= 98) {
            this.field21.method2724(arg0, 75);
            ++field11;
        }
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(B)V", line = 132)
    public static void method8(byte arg0) {
        field20 = null;
        int var1 = 45 / ((-1 - arg0) / 33);
        field12 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)I", line = 142)
    public final int method9(byte arg0) {
        ++field10;
        if (arg0 <= 102) {
            field17 = 27;
        }
        return this.field21.field6453;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lfp;Lgn;IIIIIIIZIIII)V", line = 153)
    public class1(class9 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class37.method336(arg3, arg2, 4));
        this.field21 = new class443(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field3 = arg1.field2479 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lfp;Z)V", line = 162)
    public final void method10(class9 arg0, boolean arg1) {
        if (!arg1) {
            ++field9;
            this.field21.method2726(18143, arg0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lfp;II)Lbi;", line = 179)
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        ++field15;
        if (arg2 != -23109) {
            field17 = -29;
        }
        return this.field21.method2718(false, 0, false, 0, arg0, arg1, false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z", line = 190)
    public static final boolean method12(int arg0, int arg1) {
        if (arg0 != -519438041) {
            field20 = null;
        }
        ++field13;
        return ~arg1 == -1 || ~arg1 == -2 || ~arg1 == -3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)I", line = 203)
    public static final int method13(byte arg0, int arg1) {
        ++field16;
        int var2 = -92 % ((arg0 - 72) / 39);
        return arg1 == 16711935 ? -1 : class289.method1932(arg1, true);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(ILfp;)V", line = 227)
    public final void method14(int arg0, class9 arg1) {
        ++field4;
        class143 var3 = this.field21.method2718(false, super.field3497, true, super.field3494, arg1, 131072, false);
        if (arg0 == -7561) {
            if (var3 != null) {
                this.field21.method2720(super.field3494 >> 7, (byte) 72, super.field3494 >> 7, super.field3497 >> 7, false, arg1, var3, super.field3497 >> 7);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Z", line = 243)
    public final boolean method15(boolean arg0) {
        if (!arg0) {
            field17 = -27;
        }
        ++field6;
        return this.field21.method2729(94);
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(B)I", line = 258)
    public final int method16(byte arg0) {
        ++field14;
        int var2 = 116 % ((arg0 - 21) / 54);
        return this.field21.method2728(25997);
    }
}
