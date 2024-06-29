import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class202 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3014 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field3016 = 0;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[Lvq;")
    public static class433[] field3018 = new class433[14];

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[Lnt;")
    public static class454[] field3019 = new class454[128];

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lfo;")
    public static class22 field3017 = new class22(2, 4);

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lqp;")
    public static class586 field3020 = new class586(112, -1);

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3021 = 100;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 3)
    public static void method1306(int arg0) {
        field3018 = null;
        field3019 = null;
        if (arg0 != 22266) {
            method1307(true, false, -104, null, (byte) -94, null, -65);
        }
        field3017 = null;
        field3020 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZILls;BLls;I)I", line = 21)
    public static final int method1307(boolean arg0, boolean arg1, int arg2, class418 arg3, byte arg4, class418 arg5, int arg6) {
        field3015++;
        int var7 = class249.method1582(arg2, -1, arg1, arg3, arg5);
        if (arg4 < 100) {
            return -85;
        } else if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class249.method1582(arg6, -1, arg0, arg3, arg5);
            return arg0 ? -var8 : var8;
        }
    }
}
