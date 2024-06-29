import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class529 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lof;")
    public static class620 field7530 = new class620(260);

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field7533 = 0;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 3)
    public static void method3105(byte arg0) {
        field7530 = null;
        if (arg0 < 66) {
            method3105((byte) 3);
        }
    }

    @OriginalMember(owner = "client!pt", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field7532++;
        throw new IllegalStateException();
    }
}
