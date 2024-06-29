import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class251 implements class49 {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Z")
    public static boolean field4204 = false;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[Lqf;")
    public static class144[] field4202 = new class144[4];

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field4207 = 99;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field4203 = 0;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 17)
    public static void method1837(int arg0) {
        field4202 = null;
        if (arg0 >= -87) {
            method1838(true, (byte) -56, 44, 66, false);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZBIIZ)V", line = 30)
    public static final void method1838(boolean arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field4206++;
        if (arg1 != 117) {
            field4204 = false;
        }
        class301.method2123(0, arg0, arg2, class288.field4927.length - 1, arg4, arg3, -126);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IJ[II)Lok;", line = 49)
    public final class146 method409(int arg0, long arg1, int[] arg2, int arg3) {
        field4201++;
        if (arg3 == 0) {
            class169 var7 = class263.method1900(arg2[0], (byte) -68);
            return var7.method1304((byte) -96, (int) arg1);
        } else if (arg3 == 1 || arg3 == 10) {
            class248 var6 = class84.method589(false, (int) arg1);
            return var6.field4149;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class263.method1900(arg2[0], (byte) -68).method1304((byte) -96, (int) arg1);
        } else {
            if (arg0 != -14326) {
                field4202 = (class144[]) null;
            }
            return null;
        }
    }
}
