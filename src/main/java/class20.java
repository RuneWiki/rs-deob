import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lub;")
    public class20 field284;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lbt;")
    public class39 field281;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([FII)[F", line = 11)
    public static final float[] method101(float[] arg0, int arg1, int arg2) {
        field285++;
        float[] var3 = new float[arg2];
        class282.method1707(arg0, 0, var3, arg1, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIII)V", line = 23)
    public static final void method102(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class429.field6020 == 0) {
            class212.method1390(64, false);
        } else {
            class539.field7310 = class429.field6020;
            class339.method2033(0, arg3 - 46006);
        }
        if (arg3 != 17143) {
            return;
        }
        field283++;
        class192.field2831 = arg4;
        class305.field4498 = arg1;
        class359.field5140 = arg0;
        class148.method1045(arg2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 46)
    public final void method103(int arg0) {
        field282++;
        if (class545.field7384 >= 500) {
            return;
        }
        this.field281 = null;
        if (arg0 >= -66) {
            this.field284 = null;
        }
        this.field284 = class15.field226;
        this.field286 = 0;
        class545.field7384++;
        class15.field226 = this;
    }
}
