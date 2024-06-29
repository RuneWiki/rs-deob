import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class77 {

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "[I")
    public static int[] field1001 = new int[1];

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 3)
    public static void method604(int arg0) {
        field1001 = null;
        if (arg0 != 15046) {
            method604(-47);
        }
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)Ljava/lang/String;", line = 22)
    public static final String method605(int arg0) {
        if (arg0 != 1) {
            method605(113);
        }
        field1002++;
        return class367.field4752 || class67.field817 == null ? "" : class67.field817.field6249;
    }
}
