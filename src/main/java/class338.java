import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class338 {

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "Lcga;")
    public static class449 field4322 = new class449(58, 0);

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Lrr;")
    public static class337 field4324 = null;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4325 = "";

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field4326;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Z")
    public final boolean method1943(int arg0) {
        if (arg0 == 58) {
            field4320++;
            return class10.field96 == this | class79.field1029 == this;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4321++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public static void method1944(byte arg0) {
        field4325 = null;
        field4326 = null;
        int var1 = -65 % ((33 - arg0) / 47);
        field4322 = null;
        field4324 = null;
    }
}
