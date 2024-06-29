import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class732 {

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field10164 = 765;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)V")
    public static final void method4078(boolean arg0) {
        if (arg0) {
            class137.field1948 = class319.field4435;
            class433.field6043 = class371.field5240;
        } else {
            class137.field1948 = class320.field4443;
            class433.field6043 = class550.field7649;
        }
        class370.field5229 = class137.field1948.length;
    }
}
