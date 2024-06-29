import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class685 extends class69 {

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lkf;")
    public class359 field9573;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lcc;")
    public static class187 field9570 = new class187(0, 0);

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lfm;")
    public static class279 field9571;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lae;")
    public static class283 field9574;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method3904(int arg0) {
        if (arg0 <= -6) {
            field9574 = null;
            field9570 = null;
            field9571 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lkf;)V")
    public class685(class359 arg0) {
        this.field9573 = arg0;
    }
}
