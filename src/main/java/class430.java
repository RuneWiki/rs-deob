import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class430 {

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Lwd;")
    public static class272 field6247 = new class272(3);

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "Lof;")
    public static class620 field6248 = new class620(4);

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "[I")
    public static int[] field6250 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Ltaa;")
    public static class407 field6249;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static final void method2692(int arg0) {
        field6246++;
        if (arg0 != 2) {
            return;
        }
        for (class376 var1 = (class376) class1.field6.method1719(65280); var1 != null; var1 = (class376) class1.field6.method1723(-20665)) {
            if (var1.field4831) {
                var1.method2189(117);
            }
        }
        for (class376 var2 = (class376) class375.field4815.method1719(arg0 + 65278); var2 != null; var2 = (class376) class375.field4815.method1723(-20665)) {
            if (var2.field4831) {
                var2.method2189(arg0 + 120);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
    public static void method2693(int arg0) {
        field6249 = null;
        field6250 = null;
        if (arg0 != 1) {
            field6249 = null;
        }
        field6247 = null;
        field6248 = null;
    }
}
