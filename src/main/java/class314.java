import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class314 extends class531 {

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field4856 = 0;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "Ltv;")
    public static class294 field4858;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "[I")
    public static int[] field4854;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(B)V", line = 3)
    public static void method1972(byte arg0) {
        field4858 = null;
        field4854 = null;
        int var1 = 67 % ((arg0 - -49) / 32);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBI)V", line = 16)
    public final void method1491(int arg0, int arg1, byte arg2, int arg3) {
        ++field4853;
        super.field7820 = arg0;
        super.field7827 = arg3;
        if (arg2 <= 106) {
            field4858 = null;
        }
        super.field7817 = arg1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLya;)V", line = 29)
    public static final void method1973(byte arg0, class11 arg1) {
        if (arg0 != -106) {
            field4854 = null;
        }
        ++field4857;
        if (class133.field1990 != class410.field6198.field7686) {
            if (class236.field3305 != null) {
                if (class30.method268((byte) -108, class410.field6198.field7686, arg1)) {
                    class133.field1990 = class410.field6198.field7686;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIF)V", line = 52)
    public class314(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(FI)V", line = 61)
    public final void method1493(float arg0, int arg1) {
        if (arg1 > 26) {
            ++field4855;
            super.field7818 = arg0;
        }
    }
}
