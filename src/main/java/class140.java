import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class140 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2028 = "Loaded textures";

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field2029 = -1;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    public static final void method912(int arg0, int arg1) {
        field2027++;
        if (arg0 <= 21) {
            method912(30, -41);
        }
        class39.field466.method62(-73, arg1);
        class158.field2276.method62(-47, arg1);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
    public static void method913(boolean arg0) {
        if (!arg0) {
            field2028 = null;
        }
        field2028 = null;
    }
}
