import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class53 extends class143 {

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field915 = "wishes to trade with you.";

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field920 = "Drop";

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field916 = 5063219;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "J")
    public static long field919;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method403(int arg0) {
        if (arg0 != 23291) {
            field917 = 40;
        }
        field915 = null;
        field920 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lqh;III)Lcb;")
    public static final class243 method404(class201 arg0, int arg1, int arg2, int arg3) {
        field921++;
        if (arg3 == 25308) {
            return class239.method1657(arg1, -94, arg2, arg0) ? class23.method218((byte) 10) : null;
        } else {
            return null;
        }
    }
}
