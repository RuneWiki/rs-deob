import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class104 extends class27 {

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field1492 = 0;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Lth;")
    public static class57 field1491 = new class57(64);

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field1493 = 0;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)[I", line = 5)
    public final int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            field1493 = 44;
        }
        field1490++;
        return class251.field3721;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V", line = 21)
    public static void method798(byte arg0) {
        field1491 = null;
        if (arg0 > -93) {
            method798((byte) 125);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 32)
    public class104() {
        super(0, true);
    }
}
