import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class131 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lvc;")
    private static class137 field3038 = class45.method325("Login limit exceeded)3", -46);

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3040 = -1;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lvc;")
    public static class137 field3041 = class45.method325("@yel@*V", -46);

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field3043 = -1;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lvc;")
    public static class137 field3047 = class45.method325("Ihr Spielkonto wird bereits benutzt)3", -46);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lvc;")
    public static class137 field3037 = field3038;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[Lic;")
    public static class59[] field3046 = new class59[4];

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lvc;")
    private static class137 field3042 = class45.method325("Existing user", -46);

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lvc;")
    public static class137 field3044 = field3042;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field3052 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lha;")
    public static class50 field3048;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[[B")
    public static byte[][] field3039;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public abstract void method22(byte arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZI)I")
    public abstract int method30(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public abstract void method23(boolean arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Z")
    public static final boolean method963(int arg0) {
        field3045++;
        if (arg0 == 14251) {
            return class143.field3362 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static void method964(byte arg0) {
        field3046 = null;
        field3042 = null;
        field3039 = null;
        field3044 = null;
        field3041 = null;
        field3038 = null;
        if (arg0 != -77) {
            field3042 = null;
        }
        field3037 = null;
        field3047 = null;
        field3048 = null;
    }
}
