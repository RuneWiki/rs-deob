import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class371 {

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "Lfr;")
    private static class497 field5617 = new class497();

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public static final synchronized void method2211(byte arg0) {
        while (true) {
            class135 var1 = (class135) field5617.method2951((byte) 108);
            if (var1 == null) {
                if (arg0 != -63) {
                    method2212((byte) 43, null);
                    return;
                }
                return;
            }
            var1.field2007.method471();
            var1.method876((byte) -96);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLd;)V")
    public static final synchronized void method2212(byte arg0, class240 arg1) {
        class135 var2 = new class135();
        var2.field2007 = arg1;
        field5617.method2958(var2, (byte) 37);
        if (arg0 != -72) {
            field5617 = null;
        }
    }
}
