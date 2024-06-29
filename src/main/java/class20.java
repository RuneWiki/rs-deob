import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class20 {

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field256 = 0;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field255 = 0;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 13)
    public static final void method189(int arg0) {
        field254++;
        if (class279.field4220 == -1) {
            return;
        }
        int var1 = class78.field1105.method1975(70);
        int var2 = class78.field1105.method1984((byte) -112);
        if (class260.field3872 != null) {
            var1 = class260.field3872.method912(arg0 - 8461);
            var2 = class260.field3872.method907(-118);
        }
        class36.method284(var1, 0, class279.field4220, var2, class233.field3411, 0, 0, -1, class342.field5115, 0);
        if (class330.field4954 != null) {
            class416.method2476(var1, var2, 0);
        }
        if (arg0 != -6260) {
            field257 = 22;
        }
    }
}
