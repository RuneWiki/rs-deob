import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class59 {

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field897 = -1;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lve;")
    public static class255 field902 = class87.method607(53, " loggt sich ein)3");

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lve;")
    public static class255 field906 = class87.method607(99, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lve;")
    public static class255 field904 = class87.method607(26, ":tradereq:");

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lve;")
    private static class255 field903 = class87.method607(42, "Loaded fonts");

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lve;")
    public static class255 field908 = field903;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lve;")
    public static class255 field898 = class87.method607(106, "");

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lve;")
    public static class255 field911 = class87.method607(109, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field913 = 0;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "F")
    public static float field905;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lud;")
    public static class269 field899;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lrg;")
    public static class88 field895;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lrg;")
    public static class88 field901;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "[Lud;")
    public static class269[] field894;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lve;", line = 8)
    public static final class255 method359(int arg0, int arg1) {
        int var2 = -57 / ((arg1 - 83) / 42);
        field907++;
        if (arg0 >= 100000) {
            return arg0 < 10000000 ? class3.method14(new class255[] { class280.field4798, class215.method1532(arg0 / 1000, true), class249.field4177, class229.field3786 }, (byte) -79) : class3.method14(new class255[] { class119.field1990, class215.method1532(arg0 / 1000000, true), class187.field3013, class229.field3786 }, (byte) -81);
        } else {
            return class3.method14(new class255[] { class252.field4246, class215.method1532(arg0, true), class229.field3786 }, (byte) -80);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V", line = 39)
    public static final void method360(int arg0, boolean arg1) {
        class314.field5334 = -1;
        if (!arg1) {
            return;
        }
        field900++;
        class314.field5334 = -1;
        if (arg0 == 37) {
            class97.field1683 = 3.0F;
        } else if (arg0 == 50) {
            class97.field1683 = 4.0F;
        } else if (arg0 == 75) {
            class97.field1683 = 6.0F;
        } else {
            class97.field1683 = 8.0F;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 66)
    public static void method361(int arg0) {
        field895 = null;
        field898 = null;
        field904 = null;
        if (arg0 > -114) {
            return;
        }
        field894 = null;
        field901 = null;
        field902 = null;
        field911 = null;
        field899 = null;
        field906 = null;
        field903 = null;
        field908 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILrg;I)[Lud;", line = 106)
    public static final class269[] method362(int arg0, int arg1, class88 arg2, int arg3) {
        field896++;
        if (class96.method763((byte) 115, arg1, arg3, arg2)) {
            if (arg0 != -200) {
                method362(-32, -81, (class88) null, -61);
            }
            return class297.method2091(arg0 + 72);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Z", line = 144)
    public static final boolean method363(int arg0, int arg1) {
        field910++;
        if (arg1 != 239) {
            return false;
        } else if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
