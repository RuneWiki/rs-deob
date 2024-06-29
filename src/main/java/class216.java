import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class216 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V", line = 3)
    public static final void method1265(int arg0, boolean arg1) {
        field2610++;
        class76 var2 = class3.method28(12, (byte) 42, arg0);
        var2.method406(-975503968);
        if (arg1) {
            method1265(121, false);
        }
    }

    @OriginalMember(owner = "client!qg", name = "toString", descriptor = "()Ljava/lang/String;", line = 21)
    public final String toString() {
        field2611++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 32)
    public class216(String arg0, int arg1) {
        this.field2609 = arg1;
    }
}
