import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class59 {

    @OriginalMember(owner = "client!in", name = "d", descriptor = "[I")
    public static int[] field795 = new int[250];

    @OriginalMember(owner = "client!in", name = "f", descriptor = "Z")
    public static boolean field797 = false;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Ltm;")
    public static class264 field792;

    // $FF: synthetic field
    @OriginalMember(owner = "client!in", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field798;

    // $FF: synthetic method
    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method379(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 11)
    public static void method377(byte arg0) {
        field792 = null;
        if (arg0 >= -24) {
            field795 = null;
        }
        field795 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILiv;)V", line = 30)
    public static final void method378(int arg0, class64 arg1) {
        if (arg0 != -21863) {
            method378(-59, null);
        }
        field793++;
        if (class385.field5410 == null) {
            return;
        }
        class55 var2 = null;
        if (arg1.field876 == 0) {
            var2 = (class55) class195.method1184(arg1.field883, arg1.field885, arg1.field884);
        }
        if (arg1.field876 == 1) {
            var2 = (class55) class503.method2956(arg1.field883, arg1.field885, arg1.field884);
        }
        if (arg1.field876 == 2) {
            var2 = (class55) class490.method2876(arg1.field883, arg1.field885, arg1.field884, field798 == null ? (field798 = method379("jv")) : field798);
        }
        if (arg1.field876 == 3) {
            var2 = (class55) class391.method2240(arg1.field883, arg1.field885, arg1.field884);
        }
        if (var2 == null) {
            arg1.field875 = 0;
            arg1.field879 = -1;
            arg1.field877 = 0;
        } else {
            arg1.field879 = var2.method354((byte) -115);
            arg1.field877 = var2.method355(13599);
            arg1.field875 = var2.method359((byte) -8);
        }
    }
}
