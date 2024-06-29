import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class580 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Ldk;")
    public static class488 field8005 = new class488();

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[Lfh;")
    public static class260[] field8003;

    @OriginalMember(owner = "client!nc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8004++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method3260(int arg0) {
        field8005 = null;
        field8003 = null;
        if (arg0 < 68) {
            field8003 = null;
        }
    }
}
