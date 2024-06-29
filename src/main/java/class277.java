import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class277 {

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lqj;")
    public class548 field3475;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lou;")
    public static class598 field3470;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[[B")
    public static byte[][] field3474;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 9)
    public static final void method1573(byte arg0) {
        field3469++;
        class309.field3946 = -1;
        class135.field1758 = 0;
        class20.field314 = -1;
        if (arg0 < -96) {
            class436.field5446 = -1;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V", line = 23)
    public static void method1574(byte arg0) {
        field3474 = null;
        field3470 = null;
        if (arg0 > -61) {
            field3474 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIIII)V", line = 39)
    public static final void method1575(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3468++;
        if (arg1 != ~(arg2 ? class301.field3698.field6635 : class301.field3698.field6628) && arg4 != 0 && class265.field3368 < 50 && arg0 != -1) {
            class572.field7993[class265.field3368++] = new class377((byte) (arg2 ? 3 : 2), arg0, arg4, arg5, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I", line = 54)
    public static final int method1576(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field3472++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else {
            if (arg2 > -59) {
                method1574((byte) 63);
            }
            return var4 == 2 ? 7 - arg3 : arg0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lqj;)V", line = 80)
    public class277(class548 arg0) {
        this.field3475 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILrg;)V")
    public abstract void method279(int arg0, int arg1, class615 arg2);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public abstract void method278(int arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Z")
    public abstract boolean method284(byte arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
    public abstract void method280(int arg0, boolean arg1);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public abstract void method276(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IZ)V")
    public abstract void method277(int arg0, boolean arg1);
}
