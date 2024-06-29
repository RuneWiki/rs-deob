import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class290 {

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public int field4061;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "Ldb;")
    public static class324 field4063;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "Lin;")
    public static class91 field4057;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "[Lat;")
    public static class378[] field4059;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
    public static void method1897(byte arg0) {
        if (arg0 <= -42) {
            field4057 = null;
            field4063 = null;
            field4059 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(IIII)V")
    public class290(int arg0, int arg1, int arg2, int arg3) {
        this.field4060 = arg2;
        this.field4062 = arg1;
        this.field4058 = arg0;
        this.field4061 = arg3;
    }

    @OriginalMember(owner = "client!oaa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4064++;
        throw new IllegalStateException();
    }
}
