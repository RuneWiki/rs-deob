import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class class190 {

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "Ljj;")
    public class66 field2722;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field2719 = 1403;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "Lvb;")
    public static class289 field2724;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V")
    public abstract void method919(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILaba;I)V")
    public abstract void method927(int arg0, class222 arg1, int arg2);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method1261(int arg0) {
        field2724 = null;
        if (arg0 != 0) {
            field2724 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)V")
    public abstract void method921(boolean arg0, int arg1);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
    public abstract void method925(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljj;[IZ[III)Len;")
    public static final class435 method1262(class66 arg0, int[] arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
        field2721++;
        byte[] var6 = new byte[arg4 * arg5];
        int var7 = 0;
        if (!arg2) {
            field2719 = -30;
        }
        while (arg5 > var7) {
            int var8 = arg4 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class435(arg0, arg4, arg5, var6);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public abstract void method926(byte arg0);

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z")
    public abstract boolean method928(int arg0);

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Ljj;)V")
    public class190(class66 arg0) {
        this.field2722 = arg0;
    }
}
