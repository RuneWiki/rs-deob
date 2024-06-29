import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class285 {

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "Ljava/lang/String;")
    public String field4209;

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "I")
    public int field4207;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "Lhka;")
    public static class56 field4208;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laka;", line = 9)
    public static final class85 method1823(Throwable arg0, String arg1) {
        field4205++;
        class85 var2;
        if (arg0 instanceof class85) {
            var2 = (class85) arg0;
            var2.field1187 = var2.field1187 + ' ' + arg1;
        } else {
            var2 = new class85(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gia", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field4206++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V", line = 38)
    public static void method1824(int arg0) {
        field4208 = null;
        if (arg0 <= 39) {
            field4208 = null;
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 49)
    public class285(String arg0, String arg1, int arg2) {
        this.field4209 = arg0;
        this.field4207 = arg2;
    }
}
