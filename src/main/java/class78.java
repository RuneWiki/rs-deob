import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class78 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[Lta;")
    public static class27[] field1059;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 7)
    public static void method473(byte arg0) {
        if (arg0 == 108) {
            field1059 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 19)
    public static final void method474(int arg0) {
        field1061++;
        int var1 = class674.field9500.field5122.method3071(0);
        if (arg0 != -3625) {
            return;
        }
        if (var1 == 0) {
            class634.field9017 = null;
            class453.method2730(0, 7943);
        } else if (var1 == 1) {
            class409.method2494((byte) 0, (byte) -123);
            class453.method2730(512, arg0 ^ 0xFFFFEED0);
            if (class429.field5916 != null) {
                class304.method1784((byte) 63);
            }
        } else {
            class409.method2494((byte) (class54.field757 - 4 & 0xFF), (byte) -127);
            class453.method2730(2, arg0 + 11568);
        }
        class41.field576 = class392.field5459;
    }
}
