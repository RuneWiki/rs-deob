import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class217 {

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lfr;")
    private class231 field3776 = new class231(64);

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lqs;")
    private class496 field3781;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Lqs;")
    public class496 field3774;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[I")
    public static int[] field3770 = new int[14];

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field3775 = 104;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field3780;

    static {
        new class306("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field3778 = 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V", line = 7)
    public final void method1497(int arg0, int arg1) {
        if (arg1 != -13594) {
            return;
        }
        class231 var3 = this.field3776;
        synchronized (this.field3776) {
            this.field3776.method1603((byte) -128, arg0);
        }
        field3777++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 29)
    public static void method1498(int arg0) {
        field3770 = null;
        if (arg0 != 0) {
            field3770 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 41)
    public final void method1499(byte arg0) {
        class231 var2 = this.field3776;
        synchronized (this.field3776) {
            this.field3776.method1604(4);
            if (arg0 != -112) {
                this.method1497(79, 55);
            }
        }
        field3769++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)V", line = 59)
    public static final void method1500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 1) {
            field3770 = null;
        }
        field3771++;
        if (arg6 >= class182.field2877 && arg3 <= class235.field4076 && arg5 >= class29.field460 && class472.field6996 >= arg0) {
            if (arg1 == 1) {
                class379.method2401(arg2, arg3, arg6, arg0, (byte) -88, arg5);
            } else {
                class167.method1148(arg6, arg2, 0, arg1, arg0, arg5, arg3);
            }
        } else if (arg1 == 1) {
            class199.method1319(arg6, arg3, arg0, arg5, (byte) 126, arg2);
        } else {
            class120.method949(arg3, arg1, arg6, 2, arg2, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V", line = 90)
    public static final void method1501(int arg0) {
        if (arg0 != -1) {
            return;
        }
        class118.method942(false, 25616);
        field3772++;
        if (class173.field2772 >= 0 && class173.field2772 != 0) {
            class86.method616(class173.field2772, -123);
            class173.field2772 = -1;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Ldp;", line = 115)
    public final class337 method1502(int arg0, byte arg1) {
        field3773++;
        class231 var3 = this.field3776;
        class337 var5;
        synchronized (this.field3776) {
            if (arg1 != -118) {
                return null;
            }
            var5 = (class337) this.field3776.method1593((byte) -125, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class496 var6 = this.field3781;
        byte[] var7;
        synchronized (this.field3781) {
            var7 = this.field3781.method2926(arg0, -76, 3);
        }
        class337 var8 = new class337();
        var8.field5280 = this;
        if (var7 != null) {
            var8.method2130(new class23(var7), (byte) -128);
        }
        class231 var9 = this.field3776;
        synchronized (this.field3776) {
            this.field3776.method1595(var8, (long) arg0, (byte) -125);
            return var8;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V", line = 146)
    public final void method1503(int arg0) {
        class231 var2 = this.field3776;
        synchronized (this.field3776) {
            this.field3776.method1598(-52);
            if (arg0 != 3) {
                this.field3774 = null;
            }
        }
        field3780++;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lwv;ILqs;Lqs;)V", line = 165)
    public class217(class535 arg0, int arg1, class496 arg2, class496 arg3) {
        this.field3781 = arg2;
        this.field3774 = arg3;
        this.field3781.method2940(3, -10511);
    }
}
