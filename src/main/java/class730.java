import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class730 {

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
    public static int field10241 = -1;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method4069(boolean arg0) {
        if (!arg0) {
            field10241 = 119;
        }
        field10240++;
        class734.field10292.method2220(false);
    }
}
