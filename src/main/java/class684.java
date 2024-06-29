import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class684 extends Exception {

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "[S")
    public static short[] field9682 = new short[256];

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "Lhk;")
    public static class153 field9683 = new class153(0, 2, 2, 1);

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "Lsv;")
    public static class570 field9684 = new class570(67, -1);

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)V")
    public static void method3871(byte arg0) {
        if (arg0 > -73) {
            method3871((byte) -54);
        }
        field9683 = null;
        field9682 = null;
        field9684 = null;
    }
}
