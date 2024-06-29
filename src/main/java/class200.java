import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class200 extends class182 {

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3912 = 0;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lqf;")
    public class150 field3907;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "Lqf;")
    public class150 field3909;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Lsg;")
    public class169 field3903;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Lke;")
    public static class95 field3905;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[Ljava/lang/Object;")
    public Object[] field3911;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1308(byte arg0) {
        int var1 = -33 % (-arg0 / 41);
        field3905 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILke;II)Lbg;")
    public static final class18 method1309(int arg0, class95 arg1, int arg2, int arg3) {
        field3910++;
        if (class174.method1166(arg2, arg3, false, arg1)) {
            if (arg0 != 0) {
                method1308((byte) 60);
            }
            return class149.method979(-15580);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public static final void method1310(int arg0, int arg1, int arg2) {
        if (arg1 == -7102) {
            field3902++;
            if (class44.method280(arg0, true)) {
                class164.method1057((byte) -36, class142.field2647[arg0], arg2);
            }
        }
    }
}
