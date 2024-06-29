import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class285 {

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "Lwha;")
    public static class285 field3584 = new class285(1);

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "Lwha;")
    public static class285 field3587 = new class285(2);

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "Lwha;")
    public static class285 field3588 = new class285(4);

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "Lwha;")
    public static class285 field3589 = new class285(1);

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "Lwha;")
    public static class285 field3590 = new class285(2);

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "Lwha;")
    public static class285 field3591 = new class285(4);

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "Lwha;")
    public static class285 field3592 = new class285(2);

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "Lwha;")
    public static class285 field3593 = new class285(4);

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "Lkg;")
    public static class275 field3594 = new class275(62, 3);

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "F")
    public static float field3596;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "Lqg;")
    public static class465 field3595;

    @OriginalMember(owner = "client!wha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3583++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
    public static final void method1698(byte arg0) {
        field3585++;
        if (arg0 > -104) {
            field3594 = null;
        }
        if (!class647.field8963) {
            class647.field8963 = true;
            class631.field8710 += (12.0F - class631.field8710) / 2.0F;
            class366.field4718 = true;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
    public static void method1699(int arg0) {
        field3593 = null;
        field3588 = null;
        field3587 = null;
        field3594 = null;
        field3591 = null;
        field3584 = null;
        field3590 = null;
        field3595 = null;
        field3589 = null;
        if (arg0 != 2) {
            field3595 = null;
        }
        field3592 = null;
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(I)V")
    private class285(int arg0) {
        this.field3586 = arg0;
    }
}
