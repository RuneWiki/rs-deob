import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class357 {

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lea;")
    public static class547 field4743 = new class547(85, -1);

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[B")
    public static byte[] field4746 = new byte[520];

    @OriginalMember(owner = "client!km", name = "e", descriptor = "F")
    public static float field4745;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[[Lsba;")
    public static class218[][] field4742;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIBLha;)V")
    public static final void method2055(int arg0, int arg1, byte arg2, class60 arg3) {
        field4741++;
        class395.field5617 = arg3;
        class493.field6722 = new class308[arg0][arg1];
        if (class346.field4614 != null) {
            class267.field3537 = class380.method2221(5, class346.field4614[3], class346.field4614[5], class346.field4614[4], class346.field4614[2], class346.field4614[0], class346.field4614[1]);
        }
        class518.field6971 = new class308();
        class158.method950(0);
        if (arg2 != -50) {
            field4745 = 0.79444367F;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lsba;")
    public static final class218 method2056(int arg0, int arg1) {
        field4744++;
        int var2 = arg0 >> 16;
        if (arg1 != -9820) {
            field4742 = null;
        }
        int var3 = arg0 & 0xFFFF;
        if (field4742[var2] == null || field4742[var2][var3] == null) {
            boolean var4 = class382.method2244(var2, 85);
            if (!var4) {
                return null;
            }
        }
        return field4742[var2][var3];
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static void method2057(int arg0) {
        field4743 = null;
        if (arg0 != 4) {
            method2056(21, -77);
        }
        field4746 = null;
        field4742 = null;
    }
}
