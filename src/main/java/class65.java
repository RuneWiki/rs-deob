import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class65 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lwo;")
    public static class690 field1020 = new class690(111, 7);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lqk;")
    public static class16 field1021;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static final void method615(byte arg0) {
        class415.field5866.method2778((byte) 115);
        if (arg0 <= 75) {
            field1021 = null;
        }
        field1022++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method616(int arg0) {
        if (arg0 < 25) {
            method615((byte) 22);
        }
        field1020 = null;
        field1021 = null;
    }
}
