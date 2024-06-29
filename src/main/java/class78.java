import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class78 {

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    public static int field1118 = -1;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "[Lwea;")
    public static class167[] field1117;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method673(int arg0) {
        field1119++;
        return arg0 < 28 ? true : class276.field4094 == this | class584.field7799 == this;
    }

    @OriginalMember(owner = "client!naa", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field1116++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V", line = 30)
    public static void method674(int arg0) {
        if (arg0 > 86) {
            field1117 = null;
        }
    }
}
