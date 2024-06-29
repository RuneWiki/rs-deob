import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class473 {

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public int field6153;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "Ljava/lang/String;")
    public String field6157;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "Luw;")
    public static class208 field6156 = new class208(89, -2);

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "Ldl;")
    public static class725 field6159 = new class725(0);

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z)Z", line = 3)
    public static final boolean method2668(boolean arg0) {
        field6154++;
        class340.field4172 = arg0;
        class515.field6574++;
        return true;
    }

    @OriginalMember(owner = "client!ega", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        field6155++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V", line = 26)
    public static void method2669(int arg0) {
        if (arg0 >= 10) {
            field6159 = null;
            field6156 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 43)
    public class473(String arg0, int arg1) {
        this.field6153 = arg1;
        this.field6157 = arg0;
    }
}
