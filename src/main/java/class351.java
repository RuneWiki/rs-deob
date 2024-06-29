import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class351 {

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "[Lir;")
    public static class22[] field5182 = new class22[14];

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZIIIIIII)V")
    public static final void method2180(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg2) {
            method2180(94, 75, false, 95, 0, -70, 15, -53, 33, -68);
        }
        field5183++;
        if (arg6 < 128 || arg1 < 128 || (class69.field976 * 128 - 256) < arg6 || class285.field4328 * 128 - 256 < arg1) {
            class229.field3733[0] = class229.field3733[1] = -1;
            return;
        }
        int var10 = class172.method1153(arg4, -4, arg6, arg1) - arg3;
        class210.field3431.method207(arg9, 0, 0);
        class377.field5692.method362(class210.field3431);
        class377.field5692.method356(arg6, var10, arg1, class229.field3733);
        class210.field3431.method207(-arg9, 0, 0);
        class377.field5692.method362(class210.field3431);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
    public static void method2181(int arg0) {
        if (arg0 <= 53) {
            method2180(-119, -6, true, -84, 81, 36, 4, -66, -121, -106);
        }
        field5182 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
    public static final void method2182(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5181++;
        if (arg0 < 102) {
            method2181(9);
        }
        if (class193.field3258.field7251 != 0 && arg1 != 0 && class384.field5774 < 50 && arg2 != -1) {
            class522.field7636[class384.field5774++] = new class85((byte) 2, arg2, arg1, arg3, arg4, 0);
        }
    }
}
