import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class246 {

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field3932 = 0;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Lvg;")
    public static class49 field3929 = new class49(4);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Lla;")
    public static class418 field3928;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
    public static boolean field3927;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 6)
    public static void method1755(int arg0) {
        if (arg0 != -9909) {
            field3927 = false;
        }
        field3928 = null;
        field3929 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V", line = 22)
    public static final void method1756(int arg0, int arg1) {
        field3931++;
        if (arg0 != 7916) {
            method1756(-115, 99);
        }
        class413 var2 = class674.method3852(5, arg1, 125);
        var2.method2634(1065768928);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()V", line = 37)
    public static final void method1757() {
        for (int var0 = 0; var0 < class15.field203; var0++) {
            class459 var1 = class56.field730[var0];
            class663.method3803(var1, true);
            class56.field730[var0] = null;
        }
        class15.field203 = 0;
    }
}
