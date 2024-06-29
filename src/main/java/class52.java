import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class52 extends class370 implements class232 {

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Lws;")
    public class238 field759;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Z")
    private boolean field754;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "[I")
    public static int[] field767;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field770;

    static {
        new class180("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field767 = new int[] { 16, 32, 64, 128 };
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lqa;Lbo;IIIIIZIIIIIII)V", line = 4)
    public class52(class162 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7458 == 1, class344.method2240(arg13, 0, arg12));
        this.field759 = new class238(arg0, arg1, arg12, arg13, super.field5538, arg3, arg4, arg6, arg7, arg14);
        this.field754 = ~arg1.field7491 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)I", line = 17)
    public final int method107(boolean arg0) {
        ++field765;
        if (arg0) {
            this.method373((class162) null, 31);
        }
        return this.field759.method1546(-26616);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V", line = 28)
    public final void method117(int arg0) {
        ++field756;
        if (arg0 < -127) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Lqa;I)V", line = 39)
    public final void method373(class162 arg0, int arg1) {
        if (arg1 == -2304) {
            this.field759.method1542(arg0, true);
            ++field760;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lqa;I)V", line = 58)
    public final void method374(class162 arg0, int arg1) {
        this.field759.method1544(0, arg0);
        if (arg1 != 28339) {
            field767 = null;
        }
        ++field757;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I", line = 69)
    public final int method375(int arg0) {
        ++field763;
        if (arg0 != -13015) {
            this.field754 = false;
        }
        return this.field759.field3467;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V", line = 81)
    public final void method376(int arg0) {
        ++field768;
        if (arg0 != 16931) {
            this.field754 = true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Z", line = 92)
    public final boolean method377(int arg0) {
        ++field758;
        if (arg0 > -27) {
            this.method107(true);
        }
        return this.field759.method1545(-21741);
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)V", line = 105)
    public static void method378(int arg0) {
        field767 = null;
        if (arg0 != 15502) {
            method378(125);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILqa;IZLha;I)V", line = 115)
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        if (arg3 > 5) {
            ++field766;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I", line = 126)
    public final int method379(byte arg0) {
        ++field769;
        if (arg0 != -96) {
            this.method122(108, -73, 34, (class162) null);
        }
        return this.field759.field3469;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(Lqa;I)V", line = 137)
    public final void method126(class162 arg0, int arg1) {
        if (arg1 >= -43) {
            this.field759 = null;
        }
        ++field762;
        class121 var3 = this.field759.method1549(super.field5539, 125, super.field5529, true, arg0, 262144, true);
        if (var3 != null) {
            this.field759.method1551(super.field5542, super.field5535, super.field5540, var3, false, super.field5532, arg0, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILqa;)Lbw;", line = 153)
    public final class482 method114(int arg0, class162 arg1) {
        ++field761;
        class121 var3 = this.field759.method1549(super.field5539, arg0 ^ -6908, super.field5529, false, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class413 var4 = arg1.method439();
            if (arg0 != -6796) {
                this.field759 = null;
            }
            var4.method1008(super.field5529, super.field5534, super.field5539);
            class482 var5 = null;
            if (this.field754) {
                var5 = class410.method2537((byte) -48, 1);
            }
            if (this.field759.field3455 == null) {
                var3.method910(var4, var5 != null ? var5.field7079[0] : null, 0);
            } else {
                class492 var6 = this.field759.field3455.method1519();
                arg1.method531(var3, var6, var4, var5 != null ? var5.field7079[0] : null, 0);
            }
            this.field759.method1551(super.field5542, super.field5535, super.field5540, var3, true, super.field5532, arg1, (byte) -105);
            return var5;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILqa;)Z", line = 194)
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field770;
        class121 var5 = this.field759.method1549(super.field5539, 122, super.field5529, false, arg3, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class413 var6 = arg3.method439();
            var6.method1008(super.field5529, super.field5534, super.field5539);
            if (arg1 != -1) {
                this.method377(31);
            }
            return var5.method909(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)I", line = 219)
    public final int method380(boolean arg0) {
        ++field764;
        if (!arg0) {
            this.field759 = null;
        }
        return this.field759.field3443;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILqa;)Lc;", line = 230)
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        if (arg0 != 1584) {
            return null;
        } else {
            ++field755;
            return this.field759.method1549(0, arg0 ^ 1610, 0, false, arg2, arg1, false);
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)Z", line = 241)
    public final boolean method121(int arg0) {
        ++field753;
        if (arg0 != 26923) {
            this.field754 = true;
        }
        return false;
    }
}
