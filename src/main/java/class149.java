import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class149 extends class213 {

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Ldd;")
    public class37 field2842;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Lvd;")
    private static class222 field2847 = class212.method1357("Fri", 10731);

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Lvd;")
    private static class222 field2848 = class212.method1357("flash2:", 10731);

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Lvd;")
    public static class222 field2845 = class212.method1357("oder benutzen Sie eine andere Welt)3", 10731);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lvd;")
    private static class222 field2844 = class212.method1357("Sun", 10731);

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "Lvd;")
    private static class222 field2852 = class212.method1357("Thu", 10731);

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "Lvd;")
    private static class222 field2855 = class212.method1357("Tue", 10731);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "Lvd;")
    public static class222 field2846 = field2848;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "Lvd;")
    public static class222 field2853 = class212.method1357("Lade Benutzeroberfl-=che )2 ", 10731);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Lvd;")
    public static class222 field2843 = field2848;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "Lvd;")
    private static class222 field2854 = class212.method1357("Wed", 10731);

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "Lvd;")
    private static class222 field2856 = class212.method1357("Sat", 10731);

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "Lvd;")
    private static class222 field2857 = class212.method1357("Mon", 10731);

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "[Lvd;")
    public static class222[] field2851 = new class222[] { field2844, field2857, field2855, field2854, field2852, field2847, field2856 };

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Leg;")
    public static class51 field2850;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public static void method957(int arg0) {
        field2855 = null;
        field2847 = null;
        field2853 = null;
        if (arg0 != -5556) {
            return;
        }
        field2852 = null;
        field2850 = null;
        field2851 = null;
        field2854 = null;
        field2856 = null;
        field2843 = null;
        field2844 = null;
        field2845 = null;
        field2846 = null;
        field2857 = null;
        field2848 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ldd;)V")
    public class149(class37 arg0) {
        this.field2842 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvd;ILvd;Lab;Lab;)Lr;")
    public static final class178 method958(class222 arg0, int arg1, class222 arg2, class3 arg3, class3 arg4) {
        field2849++;
        if (arg1 != -27316) {
            field2844 = null;
        }
        int var5 = arg4.method14(arg1 ^ 0x174B, arg0);
        int var6 = arg4.method30(arg2, var5, (byte) 74);
        return class211.method1348(true, var5, arg4, var6, arg3);
    }
}
