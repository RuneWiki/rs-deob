import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class278 {

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[Lhn;")
    public static class420[] field4014 = new class420[50];

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
    public static int[] field4012 = new int[13];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lmq;")
    public static class85 field4013;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Z")
    public static final boolean method1775(byte arg0) {
        field4017++;
        if (class152.field2434 == null) {
            return false;
        }
        if (class152.field2434.field7682 >= 2000) {
            class152.field2434.field7682 -= 2000;
        }
        if (class152.field2434.field7682 == 1001) {
            return true;
        } else {
            if (arg0 > -97) {
                method1776(-13);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method1776(int arg0) {
        field4012 = null;
        field4014 = null;
        if (arg0 == -18196) {
            field4013 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
    public static final boolean method1777(int arg0, int arg1, int arg2) {
        if (arg1 > -102) {
            field4008 = 28;
        }
        field4010++;
        if (arg0 >= 1000 && arg2 < 1000) {
            return true;
        } else if (arg0 >= 1000 || arg2 >= 1000) {
            return arg0 >= 1000 && arg2 >= 1000;
        } else if (class149.method1177(arg2, -19371)) {
            return true;
        } else {
            return !class149.method1177(arg0, -19371);
        }
    }
}
