import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class423 extends class44 implements class111 {

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "Lpl;")
    public class447 field5918;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "Z")
    private boolean field5915;

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "Ljava/lang/String;")
    public static String field5919 = " has logged in.";

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "Ljava/lang/String;")
    public static String field5921 = "Opened title screen";

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)I")
    public final int method580(int arg0) {
        if (arg0 != 24493) {
            return 18;
        } else {
            ++field5924;
            return this.field5918.field6462;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lpe;B)Lca;")
    public final class415 method572(class391 arg0, byte arg1) {
        ++field5920;
        if (arg1 >= -45) {
            field5919 = null;
        }
        class73 var3 = this.field5918.method2782(super.field707, arg0, true, 1024, super.field706, 0, false);
        if (var3 == null) {
            return null;
        } else {
            class156 var4 = arg0.method226();
            var4.method308(super.field707, super.field704, super.field706);
            class415 var5 = null;
            if (this.field5915) {
                var5 = class340.method2159(24579, 1);
            }
            if (this.field5918.field6484 == null) {
                var3.method478(var4, var5 == null ? null : var5.field5799[0], 0);
            } else {
                class374 var6 = this.field5918.field6484.method489();
                arg0.method166(var3, var6, var4, var5 == null ? null : var5.field5799[0], 0);
            }
            this.field5918.method2776(var3, super.field707 >> 7, super.field707 >> 7, super.field706 >> 7, arg0, super.field706 >> 7, 13, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lpe;II)Lsj;")
    public final class73 method576(class391 arg0, int arg1, int arg2) {
        if (arg2 != -2705) {
            this.method532(true, -95, (class184) null, (class391) null, -43, -96, -31);
        }
        ++field5927;
        return this.field5918.method2782(0, arg0, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)Z")
    public final boolean method537(int arg0) {
        if (arg0 > -48) {
            field5921 = null;
        }
        ++field5912;
        return false;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(B)V")
    public final void method535(byte arg0) {
        if (arg0 < 110) {
            field5919 = null;
        }
        ++field5931;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILpe;)V")
    public final void method581(int arg0, class391 arg1) {
        ++field5929;
        class73 var3 = this.field5918.method2782(super.field707, arg1, true, 131072, super.field706, arg0, true);
        if (var3 != null) {
            this.field5918.method2776(var3, super.field707 >> 7, super.field707 >> 7, super.field706 >> 7, arg1, super.field706 >> 7, arg0 + 13, false);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILpe;I)Z")
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field5922;
        class73 var5 = this.field5918.method2782(super.field707, arg2, false, arg3, super.field706, 0, false);
        if (var5 == null) {
            return false;
        } else {
            class156 var6 = arg2.method226();
            var6.method308(super.field707, super.field704, super.field706);
            return var5.method455(arg1, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)I")
    public final int method575(int arg0) {
        if (arg0 != -15863) {
            this.method575(124);
        }
        ++field5926;
        return this.field5918.field6450;
    }

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "(I)V")
    public static final void method2602(int arg0) {
        class410 var1 = class263.field3531;
        synchronized (class263.field3531) {
            if (arg0 <= 94) {
                field5919 = null;
            }
            class263.field3531.method2539(103);
        }
        ++field5916;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLpe;)V")
    public final void method570(byte arg0, class391 arg1) {
        int var3 = 78 % ((66 - arg0) / 39);
        this.field5918.method2781(arg1, -4136);
        ++field5917;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
    public final void method573(byte arg0) {
        ++field5914;
        if (arg0 >= -100) {
            this.field5915 = false;
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lpe;Lkk;IIIIIIZI)V")
    public class423(class391 arg0, class372 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field5183, arg1.field5159);
        this.field5918 = new class447(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field5915 = arg1.field5204 != 0;
    }

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)V")
    public static final void method2603(int arg0) {
        ++field5930;
        class410 var1 = class243.field3362;
        synchronized (class243.field3362) {
            class243.field3362.method2539(106);
        }
        class410 var2 = class373.field5245;
        synchronized (class373.field5245) {
            class373.field5245.method2539(125);
            if (arg0 > -61) {
                method2603(-126);
            }
        }
        class410 var3 = class418.field5861;
        synchronized (class418.field5861) {
            class418.field5861.method2539(118);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZILhh;Lpe;III)V")
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        int var8 = 15 / ((arg1 - 76) / 38);
        ++field5923;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)Z")
    public final boolean method577(int arg0) {
        ++field5913;
        return arg0 != -16528 ? false : this.field5918.method2787(38);
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)I")
    public final int method582(byte arg0) {
        ++field5925;
        if (arg0 != 22) {
            this.field5915 = false;
        }
        return this.field5918.field6458;
    }

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "(B)V")
    public static void method2604(byte arg0) {
        field5921 = null;
        field5919 = null;
        if (arg0 < 77) {
            field5921 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lpe;I)V")
    public final void method574(class391 arg0, int arg1) {
        if (arg1 != -28992) {
            this.method582((byte) -78);
        }
        ++field5928;
        this.field5918.method2783(arg0, (byte) -25);
    }
}
