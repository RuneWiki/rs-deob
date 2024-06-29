import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class379 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field5507 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Loga;")
    public static class561 field5506;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2352(byte arg0) {
        if (arg0 >= -113) {
            method2353((byte) 115);
        }
        for (class394 var1 = (class394) class186.field2611.method4023((byte) -111); var1 != null; var1 = (class394) class186.field2611.method4021((byte) 80)) {
            if (var1.field5660) {
                var1.field5660 = false;
            } else {
                class405.method2463((byte) -108, var1.field5659);
            }
        }
        field5505++;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 35)
    public static void method2353(byte arg0) {
        if (arg0 <= -23) {
            field5506 = null;
        }
    }
}
