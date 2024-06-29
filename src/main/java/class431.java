import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class431 extends class179 {

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Lpb;")
    public class204 field6222;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "[Loj;")
    public static class257[] field6220 = new class257[8];

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "S")
    public static short field6221 = 256;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
    public static void method2680(int arg0) {
        field6220 = null;
        if (arg0 != 8) {
            field6220 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lpb;)V")
    public class431(class204 arg0) {
        this.field6222 = arg0;
    }
}
