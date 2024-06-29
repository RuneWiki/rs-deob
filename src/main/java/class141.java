import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class141 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Lr;")
    public static class118 field3194 = class153.method1136(99, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lr;")
    public static class118 field3195 = class153.method1136(101, "<img=0>");

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3196 = 0;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lr;")
    public static class118 field3198 = class153.method1136(78, "Untersuchen");

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lr;")
    private static class118 field3202 = class153.method1136(119, " from your friend list first)3");

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lr;")
    public static class118 field3197 = field3202;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lr;")
    public static class118 field3204 = class153.method1136(98, "Titelbild geladen)3");

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Z")
    public static boolean field3203 = false;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field3200 = 1;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lge;")
    public static class47 field3193 = new class47(64);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static void method1051(byte arg0) {
        field3193 = null;
        field3195 = null;
        field3198 = null;
        field3202 = null;
        if (arg0 < -6) {
            field3194 = null;
            field3197 = null;
            field3204 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lr;Lff;ZZILr;)V")
    public static final void method1052(class118 arg0, class42 arg1, boolean arg2, boolean arg3, int arg4, class118 arg5) {
        field3201++;
        int var6 = arg1.method356(arg0, 0);
        int var7 = arg1.method351(5, arg5, var6);
        class100.method773(var7, arg4, arg1, 6116423, arg2, var6);
        if (arg3) {
            field3204 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static final void method1053(boolean arg0) {
        field3192++;
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < class92.field2216; var1++) {
            int var2 = class157.field3628[var1];
            class132 var3 = class108.field2526[var2];
            int var4 = class53.field1253.method831((byte) 76);
            if ((var4 & 0x4) != 0) {
                var4 += class53.field1253.method831((byte) 76) << 8;
            }
            class136.method1029(var2, var3, var4, 4390);
        }
    }
}
