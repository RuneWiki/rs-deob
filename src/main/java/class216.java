import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class216 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Ldh;")
    public static class216 field3241 = new class216(7, 4);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!dh", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field3240++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 12)
    public static void method1440(byte arg0) {
        int var1 = -8 / ((12 - arg0) / 39);
        field3241 = null;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V", line = 29)
    public class216(int arg0, int arg1) {
    }
}
