import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class29 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Llc;")
    public static class175 field370;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V", line = 7)
    public static final void method178(byte arg0, int arg1, int arg2) {
        class96 var3 = class141.method935(arg1, 7, 70);
        field369++;
        int var4 = -98 / ((arg0 + 28) / 45);
        var3.method581((byte) -106);
        var3.field1243 = arg2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 34)
    public static void method179(int arg0) {
        field370 = null;
        if (arg0 != 4738) {
            field367 = -101;
        }
    }
}
