import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class185 extends class130 {

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Lsd;")
    public static class166 field3559 = class135.method935("mapmarker", 0);

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lsd;")
    private static class166 field3561 = class135.method935("Prepared sound engine", 0);

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Lsd;")
    public static class166 field3557 = class135.method935("RuneScape wird geladen )2 bitte warten)3)3)3", 0);

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lsd;")
    public static class166 field3558 = class135.method935("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", 0);

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lsd;")
    private static class166 field3560 = class135.method935("green:", 0);

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lsd;")
    public static class166 field3565 = field3560;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "Lsd;")
    public static class166 field3563 = field3561;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lsd;")
    public static class166 field3556 = field3560;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field3567 = -1;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Lsd;")
    public class166 field3562;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static void method1250(int arg0) {
        int var1 = -117 / ((arg0 + 49) / 39);
        field3561 = null;
        field3556 = null;
        field3557 = null;
        field3565 = null;
        field3559 = null;
        field3563 = null;
        field3560 = null;
        field3558 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lf;BI)Lse;")
    public static final class167 method1251(class47 arg0, byte arg1, int arg2) {
        field3566++;
        byte[] var3 = arg0.method352(arg2, 0);
        if (arg1 <= 35) {
            method1252(-30, -99);
        }
        return var3 == null ? null : new class167(var3);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Lid;")
    public static final class77 method1252(int arg0, int arg1) {
        field3555++;
        class77 var2 = (class77) class138.field2688.method64((byte) 28, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 24851) {
            field3557 = null;
        }
        byte[] var3 = class134.field2605.method353(9, arg0, arg1 ^ 0xFFFF9ED3);
        class77 var4 = new class77();
        var4.field1579 = arg0;
        if (var3 != null) {
            var4.method638(new class53(var3), 1);
        }
        var4.method639(-83);
        class138.field2688.method67(var4, 15266, (long) arg0);
        return var4;
    }
}
