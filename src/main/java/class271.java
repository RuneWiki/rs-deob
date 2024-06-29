import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class271 extends class37 implements class338 {

    @OriginalMember(owner = "client!mt", name = "T", descriptor = "Lid;")
    public class412 field3567;

    @OriginalMember(owner = "client!mt", name = "K", descriptor = "Z")
    private boolean field3558;

    @OriginalMember(owner = "client!mt", name = "O", descriptor = "F")
    public static float field3562;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!mt", name = "E", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!mt", name = "F", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!mt", name = "H", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!mt", name = "J", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!mt", name = "L", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!mt", name = "M", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!mt", name = "N", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!mt", name = "P", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!mt", name = "Q", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!mt", name = "R", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!mt", name = "S", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!mt", name = "U", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "(I)Z", line = 12)
    public final boolean method338(int arg0) {
        ++field3561;
        if (arg0 >= -8) {
            this.method343(89, 7, (class162) null, -16);
        }
        return this.field3567.method2387(false);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILqa;I)Z", line = 23)
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field3551;
        if (arg0 != -1) {
            this.method334((class162) null, false);
        }
        class121 var5 = this.field3567.method2380(false, false, arg2, super.field574, super.field584, 131072, arg0);
        if (var5 == null) {
            return false;
        } else {
            class414 var6 = arg2.method611();
            var6.method971(super.field584, super.field568, super.field574);
            return var5.method847(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(CB)Z", line = 43)
    public static final boolean method1618(char arg0, byte arg1) {
        ++field3554;
        if ((arg0 <= 0 || ~arg0 <= -129) && (~arg0 > -161 || arg0 > 255)) {
            if (~arg0 != -1) {
                char[] var2 = class106.field1560;
                for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                    char var4 = var2[var3];
                    if (~arg0 == ~var4) {
                        return true;
                    }
                }
            }
            int var5 = -57 / ((arg1 - 41) / 34);
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "(B)V", line = 77)
    public static final void method1619(byte arg0) {
        class399.field5369.method1951((byte) 127);
        ++field3556;
        class60.field943 = null;
        if (arg0 != 117) {
            method1618('\u0005', (byte) 89);
        }
        class342.field4520 = 1;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lqa;Lus;IIIIIZIIIIIII)V", line = 92)
    public class271(class162 arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field6 == -2, class22.method204(-1, arg13, arg12));
        this.field3567 = new class412(arg0, arg1, arg12, arg13, super.field573, arg3, arg4, arg6, arg7, arg14);
        this.field3558 = ~arg1.field83 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)I", line = 102)
    public final int method345(int arg0) {
        ++field3549;
        if (arg0 != -1736) {
            this.field3558 = false;
        }
        return this.field3567.field5659;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lqa;Z)V", line = 113)
    public final void method334(class162 arg0, boolean arg1) {
        ++field3555;
        class121 var3 = this.field3567.method2380(arg1, true, arg0, super.field574, super.field584, 262144, -1);
        if (var3 != null) {
            this.field3567.method2376(var3, arg0, super.field581, true, super.field569, super.field587, super.field580, false);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLqa;I)Lc;", line = 129)
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        if (arg0 != -102) {
            this.field3567 = null;
        }
        ++field3553;
        return this.field3567.method2380(false, false, arg1, 0, 0, arg2, -1);
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)I", line = 140)
    public final int method285(byte arg0) {
        if (arg0 < 113) {
            return 37;
        } else {
            ++field3563;
            return this.field3567.method2385(-1);
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(ILqa;)Lfm;", line = 152)
    public final class514 method339(int arg0, class162 arg1) {
        ++field3560;
        class121 var3 = this.field3567.method2380(false, true, arg1, super.field574, super.field584, 2048, -1);
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method611();
            var4.method971(super.field584, super.field568, super.field574);
            if (arg0 != 9124) {
                return null;
            } else {
                class514 var5 = null;
                if (this.field3558) {
                    var5 = class148.method1020(arg0 ^ 9124, 1);
                }
                if (this.field3567.field5691 != null) {
                    class411 var6 = this.field3567.field5691.method3100();
                    arg1.method534(var3, var6, var4, var5 != null ? var5.field7563[0] : null, 0);
                } else {
                    var3.method853(var4, var5 != null ? var5.field7563[0] : null, 0);
                }
                this.field3567.method2376(var3, arg1, super.field581, true, super.field569, super.field587, super.field580, true);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V", line = 189)
    public final void method125(boolean arg0) {
        ++field3568;
        if (arg0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILqa;Leq;IIZ)V", line = 200)
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 != 1) {
            method1619((byte) 40);
        }
        ++field3557;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 213)
    public final void method342(int arg0) {
        int var2 = 98 / ((arg0 - 56) / 52);
        ++field3564;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)Z", line = 222)
    public final boolean method126(byte arg0) {
        if (arg0 != 54) {
            this.field3567 = null;
        }
        ++field3550;
        return false;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)I", line = 235)
    public final int method344(int arg0) {
        if (arg0 != -4534) {
            return -2;
        } else {
            ++field3559;
            return this.field3567.field5667;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I", line = 246)
    public final int method347(byte arg0) {
        ++field3565;
        if (arg0 != -87) {
            field3562 = -1.2618645F;
        }
        return this.field3567.field5671;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lqa;I)V", line = 258)
    public final void method340(class162 arg0, int arg1) {
        this.field3567.method2381(arg1 ^ arg1, arg0);
        ++field3566;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILqa;)V", line = 267)
    public final void method337(int arg0, class162 arg1) {
        if (arg0 != -7803) {
            this.method334((class162) null, true);
        }
        ++field3552;
        this.field3567.method2379(arg1, -6659);
    }
}
