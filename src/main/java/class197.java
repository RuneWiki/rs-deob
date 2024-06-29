import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class197 extends class287 {

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lhi;")
    public static class45 field2890 = new class45(76, 8);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "[C")
    public static char[] field2895 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V", line = 7)
    public static void method1296(int arg0) {
        field2890 = null;
        if (arg0 == -10250) {
            field2895 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V", line = 24)
    public static final void method1297(int arg0, int arg1, int arg2) {
        field2891++;
        if (arg1 >= -75) {
            method1296(-108);
        }
        class314 var3 = class177.method1213(false, 6, arg0);
        var3.method1808(-7412);
        var3.field4253 = arg2;
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V", line = 41)
    public static final void method1298(int arg0) {
        if (arg0 != 26575) {
            method1297(-50, 125, 0);
        }
        field2893++;
        class121.field1880 = 0;
        class144.field2131 = 0;
        class522.field7650 = 0;
        class270.field3644 = 0;
    }
}
