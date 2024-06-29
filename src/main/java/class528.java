import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class528 extends class238 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field7684 = null;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lmp;")
    public static class315 field7683 = null;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Lgw;")
    public static final class685 method3193(int arg0) {
        field7682++;
        return arg0 == -26132 ? class664.field9481 : null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method3194(int arg0) {
        field7684 = null;
        if (arg0 == 11319) {
            field7683 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method3195(byte arg0) {
        field7685++;
        class348 var1 = class11.field100;
        synchronized (class11.field100) {
            class11.field100.method2220(false);
            if (arg0 != -38) {
                field7684 = null;
            }
        }
    }
}
