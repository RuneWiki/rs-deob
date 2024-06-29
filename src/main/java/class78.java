import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class78 {

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Z")
    public static boolean field1035 = true;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!mq", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field1036++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)I", line = 14)
    public final int method563(byte arg0) {
        field1038++;
        int var2 = -5 % ((arg0 + 65) / 41);
        return this.field1034;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(II)V", line = 35)
    public class78(int arg0, int arg1) {
        this.field1037 = arg1;
        this.field1034 = arg0;
    }
}
