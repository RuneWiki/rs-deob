import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class212 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Ltv;")
    public class558 field2494;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
    public static final boolean method1257(int arg0, int arg1, int arg2) {
        field2495++;
        if (arg1 == 0) {
            return (arg2 & 0x21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1258(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg2 > 81) {
            field2496++;
            if ((arg4 ? class654.field9334.field9860.method1500(38) : class654.field9334.field9828.method1500(12)) != 0 && arg7 != 0 && class306.field3815 < 50 && arg5 != -1) {
                class313.field3888[class306.field3815++] = new class590((byte) (arg4 ? 3 : 2), arg5, arg7, arg6, arg0, arg3, arg1, null);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method1259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field2493++;
        if (arg1 < 512 || arg4 < 512 || class489.field6976 * 512 - 1024 < arg1 || (class153.field1677 * 512 - 1024) < arg4) {
            class595.field8399[0] = class595.field8399[1] = -1;
            return;
        }
        int var10 = class676.method3845(arg4, arg1, arg6 - 102, arg3) - arg2;
        if (arg6 != 102) {
            method1258(33, 120, -15, -75, true, -27, -1, -115);
        }
        if (class397.field5443) {
            class367.method2144(512, true);
        } else {
            class667.field9490.method1033(arg5, 0, 0);
            class275.field3370.method339(class667.field9490);
        }
        if (class626.field8994) {
            class275.field3370.method363(arg1, var10, arg4, class586.field8268, class595.field8399);
        } else {
            class275.field3370.method436(arg1, var10, arg4, class595.field8399);
        }
        if (class397.field5443) {
            class105.method719(false);
        } else {
            class667.field9490.method1033(-arg5, 0, 0);
            class275.field3370.method339(class667.field9490);
        }
    }
}
