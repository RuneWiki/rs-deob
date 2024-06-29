import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class266 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4320 = "scroll:";

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "F")
    public static float field4323 = 0.0F;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4321 = 0;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[Lrk;")
    public static class292[] field4325;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    public static final void method1782(int arg0, int arg1) {
        class168.field2765.method1880(-91, arg0);
        class292.field4790.method1880(-65, arg0);
        if (arg1 <= -74) {
            class186.field3076.method1880(-124, arg0);
            field4322++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1783(int arg0) {
        field4325 = null;
        if (arg0 >= -67) {
            method1783(-94);
        }
        field4320 = null;
    }
}
