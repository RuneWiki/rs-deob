import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class18 {

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "I")
    public static volatile int field183 = 0;

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "Lia;")
    public static class15 field186 = class28.method196("overlay2)3dat", false);

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "Lia;")
    public static class15 field181 = class28.method196("Loading", false);

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "Lia;")
    public static class15 field185 = class28.method196("Spice Shop", false);

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "[I")
    public static int[] field187;

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "[Ll;")
    public static class20[] field182;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ZLoa;ILoa;I)Lm;", line = 4)
    public static final class22 method138(boolean arg0, class27 arg1, int arg2, class27 arg3, int arg4) {
        if (class9.method49(arg3, -123, arg2, arg4)) {
            return arg0 ? class30.method203(0, arg1.method183(arg4, arg2, 37)) : (class22) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ljava/lang/Object;ILi;)V", line = 21)
    public static final void method139(Object arg0, int arg1, class14 arg2) {
        if (arg2.field135 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field135.peekEvent() != null; var3++) {
            class2.method15(1L, 127);
        }
        if (arg1 != -51) {
            field185 = null;
        }
        if (arg0 != null) {
            arg2.field135.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)V", line = 46)
    public static void method140(int arg0) {
        field185 = null;
        field181 = null;
        field182 = null;
        field187 = null;
        int var1 = 45 % ((arg0 + 52) / 54);
        field186 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)I", line = 74)
    public static final int method141(int arg0) {
        if (arg0 != -20501) {
            method140(10);
        }
        if (class6.field55 == null) {
            return 0;
        } else if (class6.field55.field57 == null) {
            return field187[class6.field55.field51 & 0xFF];
        } else {
            return field187[class6.field55.field57[class13.field111] & 0xFF];
        }
    }
}
