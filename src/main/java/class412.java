import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class412 {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field6117;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Luu;")
    public static class188 field6113 = null;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field6116 = -1;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field6114 = -1;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!id", name = "toString", descriptor = "()Ljava/lang/String;", line = 10)
    public final String toString() {
        field6115++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 22)
    public static void method2519(byte arg0) {
        int var1 = 44 / ((arg0 + 68) / 40);
        field6113 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V", line = 34)
    public class412(int arg0) {
        this.field6117 = arg0;
    }
}
