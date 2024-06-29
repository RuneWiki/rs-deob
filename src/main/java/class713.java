import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class713 implements class540 {

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
    public int field9889;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "Lfba;")
    public static class27 field9887 = new class27(39, 8);

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "Ljga;")
    public static class746 field9890;

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field9891;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIII)I")
    public static final int method4008(int arg0, int arg1, int arg2, int arg3) {
        field9888++;
        if ((class190.field2932[arg0][arg1][arg2] & 0x8) == 0) {
            if (arg3 != 1) {
                field9890 = null;
            }
            return arg0 <= 0 || (class190.field2932[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)Lsaa;")
    public final class345 method1656(int arg0) {
        field9886++;
        return arg0 == 0 ? class668.field9298 : null;
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(I)V")
    public class713(int arg0) {
        this.field9889 = arg0;
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)V")
    public static void method4009(int arg0) {
        if (arg0 >= 1) {
            field9887 = null;
            field9890 = null;
            field9891 = null;
        }
    }
}
