import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class5 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Lvf;")
    private static class265 field70 = class87.method582(-46, " from your ignore list first)3");

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lvf;")
    public static class265 field69 = class87.method582(-46, "null");

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Lvf;")
    public static class265 field72 = class87.method582(-46, "<col=80ff00>");

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Lvf;")
    private static class265 field73 = class87.method582(-46, "Take");

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lvf;")
    public static class265 field74 = field73;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Lvf;")
    public static class265 field76 = field70;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "[Lcg;")
    public static class34[] field71;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method31(int arg0) {
        field70 = null;
        field71 = null;
        field76 = null;
        field72 = null;
        field69 = null;
        field73 = null;
        field74 = null;
        if (arg0 != 0) {
            field73 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
    public static final int method32(int arg0, int arg1) {
        if (class197.field3520 != null) {
            class197.field3520.method990(4);
            class197.field3520 = null;
        }
        class134.field2421++;
        field75++;
        if (class134.field2421 > 4) {
            class134.field2421 = 0;
            class7.field262 = 0;
            return arg0;
        }
        if (class265.field4613 == class126.field2263) {
            class265.field4613 = class217.field3914;
        } else {
            class265.field4613 = class126.field2263;
        }
        class7.field262 = arg1;
        return -1;
    }
}
