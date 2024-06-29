import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class225 {

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2767 = -1;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field2766 = -1;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "[Lrc;")
    public static class458[] field2765 = new class458[8];

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "Z")
    public static volatile boolean field2768 = true;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "[I")
    public static int[] field2764;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1289(boolean arg0) {
        field2765 = null;
        field2764 = null;
        if (!arg0) {
            field2765 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)[B", line = 30)
    public static final synchronized byte[] method1290(int arg0, byte arg1) {
        field2769++;
        if (arg1 >= -86) {
            field2764 = null;
        }
        if (arg0 == 100 && class621.field8961 > 0) {
            byte[] var2 = class267.field3488[--class621.field8961];
            class267.field3488[class621.field8961] = null;
            return var2;
        } else if (arg0 == 5000 && class89.field1085 > 0) {
            byte[] var3 = class352.field4582[--class89.field1085];
            class352.field4582[class89.field1085] = null;
            return var3;
        } else if (arg0 == 30000 && class267.field3486 > 0) {
            byte[] var4 = class299.field3842[--class267.field3486];
            class299.field3842[class267.field3486] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
