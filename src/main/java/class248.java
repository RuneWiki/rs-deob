import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class248 extends class34 implements class620 {

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "Lmda;")
    public class587 field3367;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "Z")
    private boolean field3358;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field3351 = 0;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Lcd;")
    private class564 field3354;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Loa;II)Lba;", line = 6)
    public final class107 method63(class43 arg0, int arg1, int arg2) {
        if (arg2 != 25871) {
            return null;
        } else {
            ++field3368;
            return this.field3367.method3207(arg0, 0, false, arg1, false, arg2 + 2998, 0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILoa;ILcq;ZI)V", line = 22)
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        if (arg6 >= -2) {
            this.method270(-8);
        }
        ++field3366;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Z", line = 33)
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            this.method66((byte) -29);
        }
        ++field3360;
        return false;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I", line = 47)
    public static final int method1557(int arg0, int arg1) {
        if (arg1 != 127) {
            field3351 = -111;
        }
        ++field3352;
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(Loa;I)V", line = 58)
    public final void method67(class43 arg0, int arg1) {
        ++field3361;
        if (arg1 != 2) {
            this.field3354 = null;
        }
        class107 var3 = this.field3367.method3207(arg0, super.field503, true, 262144, true, 28869, super.field506);
        if (var3 != null) {
            class151 var4 = arg0.method402();
            var4.method146(super.field506, super.field510, super.field503);
            this.field3367.method3201(super.field505, arg0, super.field497, var4, -79, super.field502, false, var3, super.field501);
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)I", line = 85)
    public final int method270(int arg0) {
        ++field3349;
        return arg0 != 2495 ? 122 : this.field3367.method3209((byte) 38);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Loa;Lsa;IIIIIZIIIIIII)V", line = 96)
    public class248(class43 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field9628 == -2, class408.method2315(false, arg13, arg12));
        this.field3367 = new class587(arg0, arg1, arg12, arg13, super.field508, arg3, arg4, arg6, arg7, arg14);
        this.field3358 = ~arg1.field9660 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)I", line = 105)
    public final int method70(boolean arg0) {
        ++field3364;
        if (!arg0) {
            this.method64((byte) -43);
        }
        return this.field3367.field7959;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(Loa;I)Lcd;", line = 118)
    public final class564 method72(class43 arg0, int arg1) {
        if (arg1 != 21098) {
            this.field3358 = true;
        }
        ++field3362;
        return this.field3354;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Loa;I)V", line = 129)
    public final void method62(class43 arg0, int arg1) {
        if (arg1 != 6526) {
            this.field3358 = false;
        }
        ++field3357;
        this.field3367.method3205(arg1 ^ 14681, arg0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Loa;B)Lpl;", line = 145)
    public final class215 method71(class43 arg0, byte arg1) {
        ++field3356;
        class107 var3 = this.field3367.method3207(arg0, super.field503, true, 2048, false, 28869, super.field506);
        if (var3 == null) {
            return null;
        } else {
            class151 var4 = arg0.method402();
            int var5 = -103 / ((arg1 - 12) / 41);
            var4.method146(super.field506, super.field510, super.field503);
            class215 var6 = null;
            if (this.field3358) {
                var6 = class207.method1331(true, 1);
            }
            this.field3367.method3201(super.field505, arg0, super.field497, var4, -95, super.field502, true, var3, super.field501);
            if (this.field3367.field7979 != null) {
                class282 var7 = this.field3367.field7979.method1468();
                arg0.method365(var3, var7, var4, var6 == null ? null : var6.field2770[0], 0);
            } else {
                var3.method827(var4, var6 == null ? null : var6.field2770[0], 0);
            }
            if (this.field3354 != null) {
                class434.method2480(7065, super.field503, this.field3354, super.field506, var3, super.field510);
            } else {
                this.field3354 = class240.method1519(super.field510, var3, super.field506, 1, super.field503);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V", line = 191)
    public final void method77(byte arg0) {
        if (arg0 == 7) {
            ++field3353;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Z", line = 202)
    public final boolean method75(int arg0) {
        int var2 = 123 / ((arg0 - 26) / 38);
        ++field3355;
        return this.field3367.method3200(-126);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)I", line = 212)
    public final int method76(byte arg0) {
        ++field3350;
        if (arg0 >= -92) {
            this.method75(112);
        }
        return this.field3367.field7955;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)I", line = 224)
    public final int method66(byte arg0) {
        if (arg0 != -42) {
            return -84;
        } else {
            ++field3365;
            return this.field3367.field7976;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILoa;I)Z", line = 235)
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        if (arg3 > -98) {
            method1557(99, 73);
        }
        ++field3363;
        class107 var5 = this.field3367.method3207(arg2, super.field503, false, 131072, false, 28869, super.field506);
        if (var5 == null) {
            return false;
        } else {
            class151 var6 = arg2.method402();
            var6.method146(super.field506, super.field510, super.field503);
            return var5.method832(arg1, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Loa;I)V", line = 256)
    public final void method65(class43 arg0, int arg1) {
        ++field3348;
        this.field3367.method3210(true, arg0);
        if (arg1 > -121) {
            this.field3354 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 268)
    public final void method64(byte arg0) {
        ++field3359;
        int var2 = 17 % ((-71 - arg0) / 39);
    }
}
