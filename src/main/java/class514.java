import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class514 extends class232 {

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "Lag;")
    public static class710 field7344;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)V")
    public final void method569(int arg0, int arg1, int arg2) {
        int var4 = 5 / ((48 - arg0) / 51);
        ++field7340;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lwk;)V")
    public class514(class151 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(I)V")
    public static void method2993(int arg0) {
        if (arg0 != 17619) {
            method2995(-52, (class66) null, 79);
        }
        field7344 = null;
    }

    @OriginalMember(owner = "client!np", name = "g", descriptor = "(I)V")
    public static final void method2994(int arg0) {
        class336.field4995 = -1;
        class697.field9843 = -1;
        if (arg0 == 4119) {
            class2.field22 = 0;
            ++field7343;
            class546.field7706 = -1;
        }
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        if (arg0 != -30998) {
            field7344 = null;
        }
        ++field7341;
        return true;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZB)V")
    public final void method568(boolean arg0, byte arg1) {
        super.field3368.method1093(768, true);
        if (arg1 != -126) {
            this.method572(true, -86);
        }
        ++field7345;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILdr;I)V")
    public final void method570(int arg0, class749 arg1, int arg2) {
        if (arg0 == 2305) {
            super.field3368.method1104(true, arg1);
            ++field7337;
            super.field3368.method1088((byte) -31, arg2);
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
    public final void method573(byte arg0) {
        ++field7339;
        if (arg0 > 77) {
            super.field3368.method1093(768, false);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI)V")
    public final void method572(boolean arg0, int arg1) {
        ++field7338;
        if (arg1 <= 21) {
            this.method570(-82, (class749) null, 66);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILha;I)Lkf;")
    public static final class263 method2995(int arg0, class66 arg1, int arg2) {
        ++field7342;
        class461 var3 = class263.method1732(true, (byte) -120, arg1, arg2);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 0) {
                method2994(-99);
            }
            return var3.field6592;
        }
    }
}
