import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class462 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Ltja;")
    public static class288 field6485 = new class288(5);

    @OriginalMember(owner = "client!io", name = "d", descriptor = "Lhj;")
    public static class596 field6486 = new class596(124, -2);

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field6489 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "Ljava/lang/Thread;")
    public static Thread field6488;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLjava/lang/String;IB)V")
    public static final void method2784(boolean arg0, String arg1, int arg2, byte arg3) {
        field6487++;
        class30.method277(24121);
        class305.method1769((byte) 85);
        class190.method1248(true);
        class711.method4027(arg0, arg1, arg2, 0);
        class501.method2973(124);
        class402.method2351(0, class363.field4526);
        class213.method1342(class363.field4526, (byte) 48);
        if (arg3 != -10) {
            return;
        }
        class229.method1416(class208.field2470, class363.field4526, false);
        class783.method4339((byte) 110);
        class531.method3163(class388.field5008, -25468);
        class41.method341(-52);
        class725.method4110((byte) 114);
        if (class289.field3493 == 3) {
            class48.method454(4, arg3 + 9);
        } else if (class289.field3493 == 7) {
            class48.method454(8, arg3 ^ 0x9);
        } else if (class289.field3493 == 10) {
            class48.method454(11, -1);
        } else if (class289.field3493 == 1 || class289.field3493 == 2) {
            class720.method4074(arg3 + 133);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method2785(int arg0) {
        field6485 = null;
        field6488 = null;
        if (arg0 == 0) {
            field6486 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lbt;ILd;)V")
    public static final void method2786(class48 arg0, int arg1, class162 arg2) {
        class368.field4577 = arg0;
        field6483++;
        if (arg1 != -21044) {
            method2787(13, null);
        }
        class627.field8588 = arg2;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILkq;)V")
    public static final void method2787(int arg0, class620 arg1) {
        field6484++;
        if (arg0 != 11) {
            field6488 = null;
        }
        if (arg1.field8371 == 5 && arg1.field8438 != -1) {
            class465.method2791(true, class363.field4526, arg1);
        }
    }
}
