import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class597 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "J")
    public static long field8567;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lve;")
    public static class469 field8568;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3399(int arg0, byte arg1, int arg2) {
        if (arg1 != 88) {
            field8568 = null;
        }
        field8570++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILr;II)V")
    public static final void method3400(int arg0, class167 arg1, int arg2, int arg3) {
        field8569++;
        class240.field3541 = new class472[arg2][arg0];
        class140.field2463 = arg1;
        if (class406.field5862 != null) {
            class614.field8933 = class473.method2835(class406.field5862[1], (byte) 107, class406.field5862[4], class406.field5862[5], class406.field5862[3], class406.field5862[0], class406.field5862[2]);
        }
        class14.field742 = new class472();
        if (arg3 != 5) {
            field8567 = -112L;
        }
        class223.method1531(0);
    }

    @OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8566++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method3401(int arg0) {
        if (arg0 < 23) {
            field8567 = -34L;
        }
        field8568 = null;
    }
}
