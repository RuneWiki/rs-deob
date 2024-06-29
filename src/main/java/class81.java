import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public abstract class class81 {

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "F")
    public static float field1088;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Lpl;")
    public static class612 field1086;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "[[Z")
    public static boolean[][] field1089;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 5)
    public static void method469(int arg0) {
        field1086 = null;
        field1089 = null;
        if (arg0 != 0) {
            field1088 = -1.3738092F;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILni;I)V", line = 18)
    public static final void method470(int arg0, class687 arg1, int arg2) {
        field1090++;
        if (arg1.field9691 != null) {
            int var3 = arg1.field9691[arg2 + 1];
            if (arg1.field9689 != var3) {
                arg1.field9741 = 0;
                arg1.field9689 = var3;
                arg1.field9725 = 0;
                arg1.field9661 = 1;
                arg1.field9698 = 0;
                arg1.field9753 = arg1.field9756;
                if (arg1.field9689 != -1) {
                    class192.method1159(arg1.field6470, class583.field8149.method1844(arg0 ^ 0xFFFFE579, arg1.field9689), arg1.field6461, arg1.field6464, 82, arg1.field9741, class376.field4748 == arg1);
                }
            }
        }
        if (arg0 != -6855) {
            field1086 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I", line = 50)
    public static final int method471(int arg0, int arg1) {
        field1087++;
        return arg0 == 24231 ? arg1 & 0x7F : 16;
    }
}
