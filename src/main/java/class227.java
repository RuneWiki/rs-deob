import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class227 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lqe;")
    private static class168 field3865 = class66.method448("purple:", -125);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lqe;")
    public static class168 field3864 = class66.method448(")4g", -108);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lqe;")
    public static class168 field3869 = field3865;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
    public static boolean field3868 = false;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Z")
    public static boolean field3866 = true;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3870 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lqe;")
    public static class168 field3863 = field3865;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lqe;")
    public static class168 field3871 = class66.method448("<br>(X100(U(Y", 48);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lig;")
    public static class192 field3872;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1469(int arg0) {
        if (arg0 != 0) {
            method1470(null, true);
        }
        field3869 = null;
        field3864 = null;
        field3871 = null;
        field3872 = null;
        field3863 = null;
        field3865 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lqe;Z)Lw;")
    public static final class4 method1470(class168 arg0, boolean arg1) {
        if (!arg1) {
            field3868 = true;
        }
        field3874++;
        if (arg0.method1109((byte) 48) == 0) {
            return null;
        }
        for (class4 var2 = (class4) class161.field2759.method315(-31594); var2 != null; var2 = (class4) class161.field2759.method312(1012)) {
            if (var2.field52.method1101((byte) -53, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLnh;)Lk;")
    public static final class34 method1471(boolean arg0, class112 arg1) {
        class34 var2 = new class34();
        var2.field421 = arg1.method731(arg0);
        field3875++;
        var2.field419 = class120.method821(var2.field421, 4);
        return var2;
    }
}
