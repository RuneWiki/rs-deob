import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class52 {

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "Z")
    public static boolean field1042 = false;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "Lka;")
    public static class435 field1041;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 11)
    public static void method579(int arg0) {
        if (arg0 < -104) {
            field1041 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IBII)V", line = 24)
    public static final void method580(int arg0, byte arg1, int arg2, int arg3) {
        field1040++;
        class672.field9500 = new byte[arg2][arg3][arg0];
        if (arg1 < 71) {
            method580(32, (byte) 77, -30, -97);
        }
    }
}
