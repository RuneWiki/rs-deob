import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class41 {

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public static final void method275(boolean arg0) {
        field496++;
        if (!arg0) {
            class184.method1165(1);
            class485.method2904((byte) 82);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public static final void method276(byte arg0) {
        if (class202.field2644.field4385 && class103.field1231.field10399 != -1) {
            class518.method3038((byte) 49, class103.field1231.field10402, class103.field1231.field10399);
        }
        if (arg0 < 48) {
            method276((byte) 109);
        }
        field497++;
    }
}
