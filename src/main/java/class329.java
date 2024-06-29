import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class329 {

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lbu;")
    public static class21 field4572 = new class21(76, 0);

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
    public static void method2091(int arg0) {
        field4572 = null;
        if (arg0 != 76) {
            field4572 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)Z")
    public final boolean method2092(byte arg0) {
        field4570++;
        int var2 = 108 / ((-arg0 - 13) / 48);
        return class359.field5040 == this | class309.field4419 == this;
    }

    @OriginalMember(owner = "client!hfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4571++;
        throw new IllegalStateException();
    }
}
