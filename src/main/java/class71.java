import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class71 {

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    public static int field1059 = 0;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "J")
    public static long field1060;

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(II)V")
    public class71(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!qw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1061++;
        throw new IllegalStateException();
    }
}
