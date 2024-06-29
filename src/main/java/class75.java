import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class75 {

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "S")
    public static short field1113 = 1;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "Ljs;")
    public static class302 field1116;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V", line = 7)
    public static void method647(int arg0) {
        if (arg0 == 1) {
            field1116 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field1115++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(I)V", line = 29)
    public class75(int arg0) {
        this.field1114 = arg0;
    }
}
