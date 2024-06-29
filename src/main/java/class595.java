import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class595 extends class237 implements class620 {

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Lmda;")
    public class587 field8035;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Z")
    private boolean field8041;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field8042 = 0;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field8047 = 0;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "Lra;")
    public static class361 field8049 = new class361(100, -2);

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "Lcd;")
    private class564 field8043;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILoa;I)Z", line = 4)
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        ++field8034;
        class107 var5 = this.field8035.method3207(arg2, super.field3186, false, 131072, false, 28869, super.field3195);
        if (arg3 > -98) {
            this.method71((class43) null, (byte) -32);
        }
        if (var5 == null) {
            return false;
        } else {
            class151 var6 = arg2.method402();
            var6.method146(super.field3195 + super.field3189, super.field3187, super.field3199 + super.field3186);
            return var5.method832(arg1, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Loa;B)Lpl;", line = 26)
    public final class215 method71(class43 arg0, byte arg1) {
        ++field8040;
        class107 var3 = this.field8035.method3207(arg0, super.field3186, true, 2048, false, 28869, super.field3195);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -26 % ((12 - arg1) / 41);
            class151 var5 = arg0.method402();
            var5.method146(super.field3195 + super.field3189, super.field3187, super.field3199 + super.field3186);
            class215 var6 = null;
            if (this.field8041) {
                var6 = class207.method1331(true, 1);
            }
            int var7 = super.field3195 >> 9;
            int var8 = super.field3186 >> 9;
            this.field8035.method3201(var8, arg0, var7, var5, -71, var8, true, var3, var7);
            if (this.field8035.field7979 == null) {
                var3.method827(var5, var6 == null ? null : var6.field2770[0], 0);
            } else {
                class282 var9 = this.field8035.field7979.method1468();
                arg0.method365(var3, var9, var5, var6 != null ? var6.field2770[0] : null, 0);
            }
            if (this.field8043 == null) {
                this.field8043 = class240.method1519(super.field3187, var3, super.field3195, 1, super.field3186);
            } else {
                class434.method2480(7065, super.field3186, this.field8043, super.field3195, var3, super.field3187);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I", line = 71)
    public final int method1497(int arg0) {
        int var2 = 25 % ((arg0 - 33) / 53);
        ++field8037;
        return this.field8035.method3209((byte) 38);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Loa;I)V", line = 83)
    public final void method62(class43 arg0, int arg1) {
        this.field8035.method3205(8231, arg0);
        if (arg1 != 6526) {
            this.field8041 = true;
        }
        ++field8038;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 95)
    public final void method64(byte arg0) {
        ++field8033;
        int var2 = -32 % ((arg0 - -71) / 39);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)I", line = 105)
    public final int method70(boolean arg0) {
        if (!arg0) {
            return -9;
        } else {
            ++field8039;
            return this.field8035.field7959;
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)V", line = 118)
    public static void method3229(byte arg0) {
        field8049 = null;
        if (arg0 != 85) {
            field8049 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(Loa;I)V", line = 129)
    public final void method67(class43 arg0, int arg1) {
        ++field8031;
        class107 var3 = this.field8035.method3207(arg0, super.field3186, true, 262144, false, 28869, super.field3195);
        if (arg1 != 2) {
            this.method70(true);
        }
        if (var3 != null) {
            int var4 = super.field3195 >> 9;
            int var5 = super.field3186 >> 9;
            class151 var6 = arg0.method402();
            var6.method146(super.field3195, super.field3187, super.field3186);
            this.field8035.method3201(var5, arg0, var4, var6, arg1 + -126, var5, false, var3, var4);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Z", line = 153)
    public final boolean method75(int arg0) {
        ++field8048;
        int var2 = 57 % ((arg0 - 26) / 38);
        return this.field8035.method3200(-87);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Loa;I)V", line = 164)
    public final void method65(class43 arg0, int arg1) {
        ++field8044;
        this.field8035.method3210(true, arg0);
        if (arg1 > -121) {
            field8047 = -35;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Loa;II)Lba;", line = 183)
    public final class107 method63(class43 arg0, int arg1, int arg2) {
        ++field8045;
        if (arg2 != 25871) {
            this.method72((class43) null, -11);
        }
        return this.field8035.method3207(arg0, 0, false, arg1, false, 28869, 0);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(Loa;I)Lcd;", line = 194)
    public final class564 method72(class43 arg0, int arg1) {
        ++field8036;
        return arg1 != 21098 ? null : this.field8043;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Loa;Lsa;IIIIIZIIIIII)V", line = 205)
    public class595(class43 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class499.method2703(arg12, arg11, 0));
        this.field8035 = new class587(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field8041 = ~arg1.field9660 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)I", line = 220)
    public final int method66(byte arg0) {
        if (arg0 != -42) {
            return 40;
        } else {
            ++field8032;
            return this.field8035.field7976;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I", line = 232)
    public final int method76(byte arg0) {
        ++field8046;
        if (arg0 > -92) {
            this.method66((byte) -25);
        }
        return this.field8035.field7955;
    }
}
