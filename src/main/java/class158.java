import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class158 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Leh;")
    public static class47 field3064 = class195.method1282((byte) -4, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Leh;")
    private static class47 field3063 = class195.method1282((byte) -4, "scroll:");

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Leh;")
    private static class47 field3074 = class195.method1282((byte) -4, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field3068 = -1;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Leh;")
    public static class47 field3066 = class195.method1282((byte) -4, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Leh;")
    private static class47 field3073 = class195.method1282((byte) -4, "Loading)3)3)3");

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Leh;")
    public static class47 field3067 = field3073;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Leh;")
    public static class47 field3072 = field3063;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "[Lhd;")
    public static class68[] field3070 = new class68[2048];

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field3078 = 0;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[Z")
    public static boolean[] field3077 = new boolean[100];

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Leh;")
    public static class47 field3071 = field3074;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Leh;")
    public static class47 field3079 = field3063;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lah;")
    public static class9 field3065;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILah;Lah;)Ljh;")
    public static final class89 method1082(int arg0, int arg1, int arg2, class9 arg3, class9 arg4) {
        field3075++;
        if (class187.method1240(arg2, (byte) 117, arg0, arg4)) {
            if (arg1 != -1) {
                field3074 = null;
            }
            return class184.method1224(-85, arg3.method67(arg2, arg1, arg0));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILah;)V")
    public static final void method1083(int arg0, class9 arg1) {
        class22.field432 = arg1;
        field3076++;
        class203.field3991 = class22.field432.method68(arg0 ^ 0x75, arg0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public static void method1084(boolean arg0) {
        field3067 = null;
        field3071 = null;
        field3074 = null;
        field3066 = null;
        field3077 = null;
        field3073 = null;
        field3064 = null;
        field3063 = null;
        field3079 = null;
        if (!arg0) {
            field3078 = -86;
        }
        field3070 = null;
        field3065 = null;
        field3072 = null;
    }
}
