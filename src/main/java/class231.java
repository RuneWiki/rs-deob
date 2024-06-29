import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class231 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field3718 = 1;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field3719 = 0;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[Llj;")
    public static class25[] field3724 = new class25[2048];

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3721 = null;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[I")
    public static int[] field3720;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method1579(int arg0) {
        if (arg0 == 2048) {
            field3720 = null;
            field3724 = null;
            field3721 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static final void method1580(boolean arg0) {
        class23.field290.method1420(-1);
        field3726++;
        class286.field4537.method1420(-1);
        if (!arg0) {
            method1579(80);
        }
        class182.field2886.method1420(-1);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method1581(int arg0) {
        class142.field2085.method1430(-1);
        field3725++;
        int var1 = 1 % ((14 - arg0) / 56);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I")
    public static final int method1582(int arg0, int arg1) {
        if (arg1 < 63) {
            return -58;
        } else {
            field3723++;
            return arg0 & 0x3FF;
        }
    }
}
