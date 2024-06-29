import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class447 {

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field6331 = -50;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method2676(int arg0) {
        field6330++;
        return arg0 >= -1 ? true : class27.field744 == this | class378.field5514 == this;
    }

    @OriginalMember(owner = "client!qv", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field6329++;
        throw new IllegalStateException();
    }
}
