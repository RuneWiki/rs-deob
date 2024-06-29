import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class81 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1123 = 0;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "[Z")
    public static boolean[] field1128 = new boolean[8];

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1129 = 0;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1125 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[[B")
    public static byte[][] field1122;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIILeb;)V")
    public static final void method599(int arg0, int arg1, int arg2, int arg3, class103 arg4) {
        if (class52.field742 < 3) {
            ((class43) class131.field2184).method171(arg0, arg2, arg4.field1691, arg4.field1693, class131.field2184.field4383 / 2, class131.field2184.field4372 / 2, (int) class121.field2039, 256, arg4.field1711, arg4.field1617);
        } else {
            class63.method490(arg0, arg2, 0, arg4.field1711, arg4.field1617);
        }
        if (arg1 != 2) {
            field1128 = null;
        }
        class217.field3482[arg3] = true;
        field1127++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static void method600(byte arg0) {
        field1128 = null;
        field1122 = null;
        if (arg0 != -100) {
            field1129 = 93;
        }
    }
}
