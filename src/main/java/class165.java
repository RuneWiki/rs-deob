import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class165 {

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "[I")
    public static int[] field2237 = new int[13];

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILqu;)V")
    public static final void method1046(int arg0, class364 arg1) {
        if (arg0 != -3466) {
            method1047(121);
        }
        class221.field3268.method2926(8, arg1.method2232(arg0 + 3344));
        field2235++;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method1047(int arg0) {
        field2237 = null;
        if (arg0 < 72) {
            field2236 = -89;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static final void method1048(byte arg0) {
        int var1 = 91 / ((-arg0 - 21) / 47);
        field2238++;
        class604.field8896.method347(class321.field4777, class493.field7442, class417.field5995);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)I")
    public static final int method1049(int arg0) {
        field2234++;
        if (arg0 >= -7) {
            method1047(125);
        }
        return 6;
    }
}
