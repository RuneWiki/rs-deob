import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class26 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lq;")
    private class99 field693 = new class99();

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field699 = 0;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field695 = 2;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field705 = 0;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field697 = 0;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lpd;")
    public static class94 field696 = class28.method249(-104, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lpd;")
    public static class94 field698 = class28.method249(-93, "backbase1");

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lta;")
    public static class114 field700;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lc;")
    public static class16 field707;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "[I")
    public static int[] field703;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLq;)V", line = 8)
    public final void method230(boolean arg0, class99 arg1) {
        if (arg1.field2497 != null) {
            arg1.method744((byte) 112);
        }
        arg1.field2497 = this.field693;
        arg1.field2496 = this.field693.field2496;
        arg1.field2497.field2496 = arg1;
        arg1.field2496.field2497 = arg1;
        if (!arg0) {
            field694++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 31)
    public static void method231(byte arg0) {
        field707 = null;
        if (arg0 != -123) {
            method231((byte) -10);
        }
        field703 = null;
        field696 = null;
        field698 = null;
        field700 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Lq;", line = 55)
    public final class99 method232(int arg0) {
        field704++;
        class99 var2 = this.field693.field2496;
        if (this.field693 == var2) {
            return null;
        } else {
            if (arg0 != 29272) {
                method231((byte) -60);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Lq;", line = 82)
    public final class99 method233(int arg0) {
        class99 var2 = this.field693.field2496;
        field702++;
        if (this.field693 == var2) {
            return null;
        }
        var2.method744((byte) -116);
        if (arg0 != 30414) {
            field705 = 19;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 155)
    public class26() {
        this.field693.field2496 = this.field693;
        this.field693.field2497 = this.field693;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILq;)V", line = 133)
    public final void method234(int arg0, class99 arg1) {
        field706++;
        if (arg1.field2497 != null) {
            arg1.method744((byte) 64);
        }
        arg1.field2497 = this.field693.field2497;
        arg1.field2496 = this.field693;
        int var3 = 88 % ((28 - arg0) / 57);
        arg1.field2497.field2496 = arg1;
        arg1.field2496.field2497 = arg1;
    }
}
