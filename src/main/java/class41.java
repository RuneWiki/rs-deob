import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class41 {

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field435 = 1;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "[J")
    public static long[] field437 = new long[32];

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!gs", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field432++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public static void method213(int arg0) {
        field437 = null;
        if (arg0 >= -85) {
            method215(null, 82);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIZIZ)V")
    public static final void method214(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg1 != -1) {
            field437 = null;
        }
        field430++;
        if (arg5 <= arg2) {
            return;
        }
        int var7 = (arg2 + arg5) / 2;
        int var8 = arg2;
        class620 var9 = class520.field7448[var7];
        class520.field7448[var7] = class520.field7448[arg5];
        class520.field7448[arg5] = var9;
        for (int var10 = arg2; var10 < arg5; var10++) {
            if (class545.method3090((byte) -57, var9, arg4, arg3, class520.field7448[var10], arg0, arg6) <= 0) {
                class620 var11 = class520.field7448[var10];
                class520.field7448[var10] = class520.field7448[var8];
                class520.field7448[var8++] = var11;
            }
        }
        class520.field7448[arg5] = class520.field7448[var8];
        class520.field7448[var8] = var9;
        method214(arg0, -1, arg2, arg3, arg4, var8 - 1, arg6);
        method214(arg0, -1, var8 + 1, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lcd;I)V")
    public static final void method215(class283 arg0, int arg1) {
        if (arg0.field3597 != null) {
            arg0.field3597.field9405 = 0;
        }
        field431++;
        arg0.field3595 = false;
        if (arg1 <= 1) {
            field435 = -13;
        }
        for (class283 var2 = arg0.method650(); var2 != null; var2 = arg0.method651()) {
            method215(var2, 127);
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class41(String arg0, int arg1) {
        this.field436 = arg1;
    }
}
