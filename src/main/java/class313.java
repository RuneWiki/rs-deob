import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class313 extends class50 implements class649 {

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "Z")
    private boolean field4015 = false;

    @OriginalMember(owner = "client!fk", name = "gb", descriptor = "Lmt;")
    public class410 field4030;

    @OriginalMember(owner = "client!fk", name = "ib", descriptor = "Z")
    private boolean field4032;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "Lpf;")
    public static class728 field4010 = new class728();

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "[I")
    public static int[] field4019 = new int[1000];

    @OriginalMember(owner = "client!fk", name = "hb", descriptor = "I")
    public static int field4031 = -1;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!fk", name = "db", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!fk", name = "eb", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!fk", name = "fb", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "Lgp;")
    private class551 field4022;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "[Lta;")
    public static class27[] field4023;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBZILha;ILig;)V")
    public final void method365(int arg0, byte arg1, boolean arg2, int arg3, class545 arg4, int arg5, class674 arg6) {
        ++field4013;
        if (arg1 < 76) {
            this.method283((byte) 45);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)Z")
    public final boolean method283(byte arg0) {
        ++field4018;
        if (arg0 > -33) {
            this.field4022 = null;
        }
        return this.field4015;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(ILha;)V")
    public final void method271(int arg0, class545 arg1) {
        int var3 = -22 % ((-15 - arg0) / 57);
        ++field4028;
        class283 var4 = this.field4030.method2500(262144, true, true, (byte) -28, arg1);
        if (var4 != null) {
            int var5 = super.field9490 >> 9;
            int var6 = super.field9489 >> 9;
            class723 var7 = arg1.method2087();
            var7.method848(super.field9490, super.field9502, super.field9489);
            this.field4030.method2505(var5, var4, (byte) 14, var5, false, var6, var6, arg1, var7);
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)I")
    public final int method275(int arg0) {
        if (arg0 != 24263) {
            field4023 = null;
        }
        ++field4012;
        return this.field4030.field5711;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)Z")
    public final boolean method281(boolean arg0) {
        if (!arg0) {
            field4023 = null;
        }
        ++field4017;
        return this.field4030.method2508(arg0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)I")
    public final int method269(int arg0) {
        ++field4008;
        if (arg0 != -17174) {
            this.method270((class545) null, -3);
        }
        return this.field4030.field5722;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(ILha;)Lgp;")
    public final class551 method274(int arg0, class545 arg1) {
        if (arg0 != 0) {
            field4031 = 95;
        }
        ++field4011;
        return this.field4022;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILha;)V")
    public final void method272(int arg0, class545 arg1) {
        this.field4030.method2504(arg1, arg0 ^ -24100);
        ++field4029;
        if (arg0 != 24139) {
            this.field4022 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lha;Lkha;IIIIIZII)V")
    public class313(class545 arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field403);
        this.field4030 = new class410(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field4032 = arg1.field467 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        ++field4016;
        if (arg3 != -1) {
            this.method373((byte) 105);
        }
        class283 var5 = this.field4030.method2500(131072, false, false, (byte) -28, arg0);
        if (var5 == null) {
            return false;
        } else {
            class723 var6 = arg0.method2087();
            var6.method848(super.field9490, super.field9502, super.field9489);
            return !class286.field3774 ? var5.method1155(arg1, arg2, var6, false, 0) : var5.method1151(arg1, arg2, var6, false, 0, class527.field7375);
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)V")
    public final void method380(byte arg0) {
        ++field4024;
        int var2 = -87 / ((-45 - arg0) / 42);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)I")
    public final int method268(int arg0) {
        if (arg0 != -1) {
            this.method380((byte) -40);
        }
        ++field4027;
        return this.field4030.method2509(71);
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)I")
    public final int method282(int arg0) {
        if (arg0 != -1) {
            this.method283((byte) -90);
        }
        ++field4026;
        return this.field4030.method2498((byte) -67);
    }

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "(I)Z")
    public final boolean method277(int arg0) {
        ++field4020;
        return arg0 != 3;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Z")
    public final boolean method373(byte arg0) {
        ++field4006;
        if (arg0 != -57) {
            this.field4015 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)I")
    public final int method276(int arg0) {
        ++field4009;
        if (arg0 != -25963) {
            field4025 = 115;
        }
        return this.field4030.field5709;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)V")
    public static void method1825(byte arg0) {
        field4023 = null;
        field4019 = null;
        int var1 = 97 % ((-41 - arg0) / 38);
        field4010 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lha;I)Ljl;")
    public final class596 method278(class545 arg0, int arg1) {
        ++field4021;
        class283 var3 = this.field4030.method2500(2048, true, false, (byte) -28, arg0);
        if (var3 == null) {
            return null;
        } else {
            class723 var4 = arg0.method2087();
            var4.method848(super.field9490, super.field9502, super.field9489);
            if (arg1 != 2274) {
                field4010 = null;
            }
            class596 var5 = class589.method3502(1, this.field4032, 0);
            int var6 = super.field9490 >> 9;
            int var7 = super.field9489 >> 9;
            this.field4030.method2505(var6, var3, (byte) 14, var6, true, var7, var7, arg0, var4);
            if (!class286.field3774) {
                var3.method1168(var4, var5.field8579[0], 0);
            } else {
                var3.method1164(var4, var5.field8579[0], class527.field7375, 0);
            }
            if (this.field4030.field5705 != null) {
                class347 var8 = this.field4030.field5705.method1347();
                if (class286.field3774) {
                    arg0.method2112(var8, class527.field7375);
                } else {
                    arg0.method2122(var8);
                }
            }
            this.field4015 = var3.method1130() || this.field4030.field5705 != null;
            if (this.field4022 == null) {
                this.field4022 = class477.method2821(-1, super.field9489, var3, super.field9502, super.field9490);
            } else {
                class111.method747(34165, var3, super.field9489, super.field9502, super.field9490, this.field4022);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lha;I)V")
    public final void method270(class545 arg0, int arg1) {
        if (arg1 == -6060) {
            this.field4030.method2507(28806, arg0);
            ++field4007;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public final void method279(byte arg0) {
        if (arg0 > -4) {
            this.method274(79, (class545) null);
        }
        ++field4014;
    }
}
