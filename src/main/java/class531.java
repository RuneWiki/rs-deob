import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class531 extends class177 {

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field7452 = 0;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Lgfa;")
    public class697 field7450;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "[Lql;")
    public class684[] field7451;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method3085(int arg0) {
        field7453++;
        class364.field5409.method2600((byte) -114);
        if (arg0 == -1) {
            class480.field6895.method2600((byte) -114);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method3086(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field7448++;
        if (class225.method1539(arg1, 4)) {
            int var10 = -87 / ((arg4 + 50) / 56);
            if (class91.field1668[arg1] == null) {
                class623.method3552(arg6, arg0, arg3, arg2, -95, arg8, -1, class156.field2667[arg1], arg5, arg7);
            } else {
                class623.method3552(arg6, arg0, arg3, arg2, -108, arg8, -1, class91.field1668[arg1], arg5, arg7);
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class248.field3731[var9] = true;
            }
        } else {
            class248.field3731[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method3087(class167 arg0, int arg1, int arg2, int arg3) {
        field7455++;
        if (this.field7451 != null) {
            for (int var5 = 0; var5 < this.field7451.length; var5++) {
                if (this.field7451[var5].method3852(arg2, arg1) && this.field7450.method444(arg0, (byte) -87, arg2, arg1)) {
                    return true;
                }
            }
        }
        if (arg3 != -1) {
            field7452 = -63;
        }
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Llk;B)V")
    public static final void method3088(class545 arg0, byte arg1) {
        if (arg1 < 12) {
            field7452 = 61;
        }
        if (class545.field7632 == arg0.field7721) {
            class248.field3731[arg0.field7623] = true;
        }
        field7454++;
    }
}
