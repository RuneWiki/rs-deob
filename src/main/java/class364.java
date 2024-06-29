import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class364 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field5133 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5134 = new String[100];

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field5137 = -1;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lnq;")
    public static class268 field5135;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method2356(boolean arg0) {
        field5134 = null;
        if (!arg0) {
            field5135 = null;
        }
        field5135 = null;
    }
}
