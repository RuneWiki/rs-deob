import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class326 {

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "F")
    public static float field4658 = 1.0F;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!nha", name = "toString", descriptor = "()Ljava/lang/String;", line = 11)
    public final String toString() {
        field4661++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)I", line = 22)
    public static final int method1972(int arg0) {
        int var1 = 72 / ((14 - arg0) / 51);
        field4659++;
        return class595.field7748 == null ? 0 : class595.field7748.length * 2;
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(II)V", line = 37)
    public class326(int arg0, int arg1) {
        this.field4660 = arg0;
    }
}
