import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class117 extends class404 {

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "[Lcq;")
    public static class312[] field1963 = new class312[14];

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1964 = "";

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "Ldu;")
    public static class229 field1962;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLlt;Llt;)V", line = 4)
    public static final void method829(byte arg0, class458 arg1, class458 arg2) {
        if (arg0 != 52) {
            method830(69);
        }
        class58.field1002 = arg2;
        class23.field284 = arg1;
        field1965++;
    }

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "(I)V", line = 16)
    public static void method830(int arg0) {
        field1963 = null;
        field1964 = null;
        if (arg0 != 0) {
            field1962 = null;
        }
        field1962 = null;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V", line = 28)
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I", line = 37)
    public final int[] method90(int arg0, int arg1) {
        field1961++;
        if (arg0 >= -47) {
            field1963 = null;
        }
        return class167.field2594;
    }
}
