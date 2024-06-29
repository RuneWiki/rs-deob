import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class150 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lob;")
    public static class141 field2890 = class175.method1195(40, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2896 = 0;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2893 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Ltb;")
    public static class191 field2889 = new class191();

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lca;")
    public static class22 field2899;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILpe;II)[Lfa;")
    public static final class52[] method1043(int arg0, class154 arg1, int arg2, int arg3) {
        if (arg3 != 865) {
            method1045(-70);
        }
        field2895++;
        return class53.method353(-95, arg0, arg1, arg2) ? class24.method168(false) : null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILpe;)V")
    public static final void method1044(int arg0, class154 arg1) {
        field2894++;
        class62.field1227 = arg1;
        if (arg0 != -30393) {
            field2889 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1045(int arg0) {
        field2899 = null;
        field2889 = null;
        if (arg0 <= 65) {
            field2899 = null;
        }
        field2890 = null;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static final void method1046(int arg0) {
        field2891++;
        class49.field916 = new class158();
        if (arg0 != 3) {
            field2893 = -33;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)I")
    public static final int method1047(int arg0, int arg1, int arg2, int arg3) {
        field2897++;
        int var4 = arg2 & 0x3;
        if (arg3 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }
}
