import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field29 = 0;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "[[[I")
    public static int[][][] field30;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 6)
    public static void method18(int arg0) {
        field30 = null;
        if (arg0 != 0) {
            field29 = -84;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)V", line = 20)
    public static final void method19(int arg0, boolean arg1) {
        if (arg0 < 26) {
            field29 = -34;
        }
        if (arg1) {
            if (class397.field5320 != -1) {
                class63.method425(-794, class397.field5320);
            }
            for (class454 var2 = (class454) class234.field2982.method3232(-1); var2 != null; var2 = (class454) class234.field2982.method3236(-27646)) {
                if (!var2.method1520(112)) {
                    var2 = (class454) class234.field2982.method3232(-1);
                    if (var2 == null) {
                        break;
                    }
                }
                class39.method204(true, -28799, false, var2);
            }
            class397.field5320 = -1;
            class234.field2982 = new class572(8);
            class552.method3112(-1);
            class397.field5320 = class293.field3847;
            class433.method2313(-89, false);
            class14.method66(12287);
            class364.method2003(class397.field5320);
        }
        field31++;
        class662.field9407 = true;
    }
}
