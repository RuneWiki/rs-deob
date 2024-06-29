import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class120 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "[Lgaa;")
    public static class460[] field1451;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public static final void method792(int arg0) {
        field1450++;
        class333.field4297.method2925(-22009);
        class402.field5566.method2328((byte) -72);
        if (arg0 != -17747) {
            method793(-16);
        }
        class612.field8463.method712(false);
        class68.field939.setBackground(Color.black);
        class659.field9051 = -1;
        class333.field4297 = class584.method3258(class68.field939, (byte) -93);
        class402.field5566 = class15.method194(true, 123, class68.field939);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
    public static void method793(int arg0) {
        field1451 = null;
        if (arg0 != 6728) {
            method792(53);
        }
    }
}
