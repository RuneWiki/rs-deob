import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class20 {

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lia;")
    private static class257 field425 = class28.method234(96, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Lia;")
    public static class257 field424 = class28.method234(110, "<col=80ff00>");

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lia;")
    public static class257 field415 = field425;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lie;")
    public static class117 field419 = new class117(64);

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Lia;")
    private static class257 field428 = class28.method234(-99, "Loaded fonts");

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lia;")
    public static class257 field426 = field428;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lmb;")
    public static class178 field416;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lmb;")
    public static class178 field418;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "[Lte;")
    public static class184[] field423;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public abstract void method175(int arg0);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I")
    public abstract int method176(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field414++;
        if (arg0 < 112) {
            method179(40);
        }
        if (class123.field2211 <= arg1 && arg3 <= class145.field2540 && class40.field834 <= arg6 && arg5 <= class255.field4371) {
            class126.method876(arg6, arg5, arg7, arg3, true, arg2, arg1, arg4);
        } else {
            class149.method1009(arg4, -118, arg3, arg5, arg7, arg1, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIB)I")
    public static final int method178(int arg0, int arg1, byte arg2) {
        field421++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            if (arg2 <= 84) {
                field420 = -103;
            }
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static void method179(int arg0) {
        if (arg0 != 126) {
            return;
        }
        field425 = null;
        field424 = null;
        field415 = null;
        field416 = null;
        field426 = null;
        field428 = null;
        field418 = null;
        field419 = null;
        field423 = null;
    }
}
