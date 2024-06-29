import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class436 extends class425 {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lan;")
    public class22 field6298;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
    public static boolean field6299 = false;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lbh;")
    public static class34 field6300;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lfu;")
    public static class360 field6297;

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lan;)V")
    public class436(class22 arg0) {
        this.field6298 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method2644(int arg0) {
        field6297 = null;
        field6300 = null;
        if (arg0 > -104) {
            field6300 = null;
        }
    }
}
