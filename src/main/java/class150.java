import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class150 {

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "Z")
    public static boolean field2283 = false;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field2285 = -1;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "Lit;")
    public static class555 field2281;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    public static void method983(int arg0) {
        if (arg0 != -1) {
            method983(54);
        }
        field2281 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)Z")
    public final boolean method984(byte arg0) {
        if (arg0 != 84) {
            field2285 = -120;
        }
        field2282++;
        return class457.field6436 == this | class305.field4156 == this;
    }

    @OriginalMember(owner = "client!aba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2284++;
        throw new IllegalStateException();
    }
}
