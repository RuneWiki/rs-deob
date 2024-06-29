import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class81 extends class499 {

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "Ljm;")
    public static class485 field1143 = new class485(36, 7);

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "Z")
    public static boolean field1147 = false;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    public static int field1148 = 0;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "F")
    public static float field1149;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1146++;
        if (arg0 != 18850) {
            method584(-14, 30, -111, 57, -107, 45);
        }
        if (arg2 >= class382.field5379 && class175.field2497 >= arg4 && class343.field4727 <= arg5 && class54.field753 >= arg3) {
            class385.method2212((byte) -106, arg4, arg1, arg3, arg5, arg2);
        } else {
            class119.method757(arg1, arg3, true, arg2, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V", line = 23)
    public class81(int arg0, int arg1) {
        this.field1145 = arg0;
        this.field1144 = arg1;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V", line = 32)
    public static void method585(int arg0) {
        field1143 = null;
        if (arg0 != 0) {
            method585(24);
        }
    }
}
