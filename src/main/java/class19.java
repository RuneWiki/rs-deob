import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 implements class404 {

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "[Lna;")
    public static class35[] field195;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V", line = 5)
    public static void method143(boolean arg0) {
        field195 = null;
        if (!arg0) {
            field195 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 28)
    public class19(String arg0, int arg1) {
        this.field194 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "toString", descriptor = "()Ljava/lang/String;", line = 38)
    public final String toString() {
        field196++;
        throw new IllegalStateException();
    }
}
