import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class77 {

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field1056 = -1;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "J")
    public static long field1057 = 0L;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1059 = "glow1:";

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lwe;")
    public static class24 field1055 = new class24(64);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "Lqj;")
    public static class238 field1058;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
    public static void method489(boolean arg0) {
        if (arg0) {
            method489(true);
        }
        field1059 = null;
        field1055 = null;
        field1058 = null;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(Z)V")
    public static final void method490(boolean arg0) {
        if (arg0) {
            field1054++;
            class139.field1853.method212(-85);
        }
    }
}
