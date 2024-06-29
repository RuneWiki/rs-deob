import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class60 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Ltg;")
    public static class215 field1017 = new class215(16);

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lie;")
    public static class18 field1020 = null;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lr;")
    public static class66 field1021 = class93.method641(43, "b12_full");

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lr;")
    public static class66 field1023 = class93.method641(43, "null");

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lr;")
    public static class66 field1022 = class93.method641(43, " GMT");

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
    public static int[] field1025 = new int[500];

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lr;")
    public static class66 field1026 = class93.method641(43, "Welt");

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lr;")
    public static class66 field1024;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method392(int arg0) {
        field1022 = null;
        field1023 = null;
        field1020 = null;
        if (arg0 >= -66) {
            field1021 = null;
        }
        field1025 = null;
        field1021 = null;
        field1024 = null;
        field1017 = null;
        field1026 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lr;Z)Z")
    public static final boolean method393(class66 arg0, boolean arg1) {
        field1019++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class124.field2338; var2++) {
            if (arg0.method470(false, class17.field245[var2])) {
                return true;
            }
        }
        if (!arg1) {
            field1017 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method394(int arg0) {
        class193.field3343 = null;
        field1018++;
        class242.field4231 = null;
        class7.field71 = null;
        if (arg0 == 500) {
            class194.field3353 = null;
        }
    }
}
