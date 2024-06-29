import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class106 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lri;")
    public static class73 field1528 = new class73(40, -1);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLhf;)V", line = 4)
    public static final void method652(byte arg0, class270 arg1) {
        field1529++;
        if (arg1.field3931 != null) {
            arg1.field3931.field4027 = 0;
        }
        arg1.field3929 = false;
        if (arg0 >= -104) {
            field1528 = null;
        }
        for (class270 var2 = arg1.method563(); var2 != null; var2 = arg1.method585()) {
            method652((byte) -127, var2);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 26)
    public static void method653(byte arg0) {
        if (arg0 != -18) {
            field1528 = null;
        }
        field1528 = null;
    }
}
