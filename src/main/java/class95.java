import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class95 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lqn;")
    private class47 field1153;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)Z", line = 11)
    public static final boolean method728(int arg0, int arg1, byte arg2) {
        int var3 = -126 / ((arg2 + 48) / 57);
        field1156++;
        return class279.method1659((byte) -119, arg1, arg0) & class286.method1689(arg0, arg1, 2048);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 28)
    public static final void method729(int arg0) {
        field1154++;
        if (class175.field2277 < 0) {
            class179.field2366 = -1;
            class175.field2277 = 0;
            class9.field144 = -1;
        }
        if (class175.field2277 > class241.field3116) {
            class9.field144 = -1;
            class175.field2277 = class241.field3116;
            class179.field2366 = -1;
        }
        if (arg0 > class38.field496) {
            class38.field496 = 0;
            class179.field2366 = -1;
            class9.field144 = -1;
        }
        if (class38.field496 > class241.field3117) {
            class38.field496 = class241.field3117;
            class179.field2366 = -1;
            class9.field144 = -1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 71)
    public class95(class165 arg0, int arg1, class47 arg2) {
        new class449(64);
        this.field1153 = arg2;
        this.field1155 = this.field1153.method469(30322, 15);
    }
}
