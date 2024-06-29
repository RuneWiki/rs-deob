import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class15 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[Z")
    public static boolean[] field176 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Ljava/lang/String;")
    public static String field174 = " is already on your ignore list.";

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lkm;")
    public static class133 field173;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 9)
    public static final void method96(int arg0) {
        field178++;
        class248.field3574.method717((byte) 80);
        if (arg0 < 107) {
            field176 = (boolean[]) null;
        }
        class276.field4141.method717((byte) 64);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 34)
    public static void method97(boolean arg0) {
        if (arg0) {
            field174 = (String) null;
        }
        field176 = null;
        field173 = null;
        field174 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 47)
    public static final void method98(int arg0) {
        if (arg0 > -91) {
            return;
        }
        field175++;
        if (class344.field5325 != null) {
            class344.field5325.method1768(true);
        }
        if (class96.field1291 != null) {
            class96.field1291.method1768(true);
        }
    }
}
