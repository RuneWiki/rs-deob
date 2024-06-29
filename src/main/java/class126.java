import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class126 implements class338 {

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "Lkc;")
    public class120 field1431;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "Ljo;")
    private class303 field1426;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field1422 = 16777215;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "[I")
    public static int[] field1425 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Lxa;")
    public class458 field1427;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lxa;")
    public static class458 field1430;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        if (arg0 != -18257) {
            field1422 = -120;
        }
        field1428++;
        return this.field1426.method1711(this.field1431.field1364, 1);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        this.field1427 = class505.method2907((byte) -125, this.field1426.method1722(this.field1431.field1364, arg0 ^ arg0));
        field1421++;
        this.method725(true, -2536);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIII)V")
    public static final void method724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1429++;
        if (arg0 < 100) {
            return;
        }
        if (arg2 == arg4) {
            class480.method2803(arg2, 1, arg3, arg5, arg1);
        } else if (class326.field4246 <= (arg3 - arg2) && class163.field1942 >= (arg2 + arg3) && class58.field602 <= arg5 - arg4 && arg4 + arg5 <= class501.field7217) {
            class299.method1695(-1958332894, arg2, arg4, arg3, arg5, arg1);
        } else {
            class117.method707(2051411841, arg5, arg4, arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)V")
    public void method725(boolean arg0, int arg1) {
        if (arg1 != -2536) {
            this.method725(false, -94);
        }
        if (arg0) {
            int var3 = this.field1431.field1366.method1281((byte) -109, class466.field6460, this.field1427.method418()) + this.field1431.field1369;
            int var4 = this.field1431.field1367.method1586(class137.field1567, this.field1427.method408(), (byte) -16) + this.field1431.field1362;
            this.field1427.method2612(var3, var4);
        }
        field1423++;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static final void method726(byte arg0) {
        if (class285.method1619(true, class351.field4601) || class521.method2973(arg0 + 19, class351.field4601)) {
            class572.method3237(class662.field9411 >> 12, class345.field4493 >> 12, (byte) -70, 5000);
        } else {
            int var1 = class377.field4914.field3839[0] >> 3;
            int var2 = class377.field4914.field3841[0] >> 3;
            if (var1 >= 0 && class399.field5338 >> 3 > var1 && var2 >= 0 && var2 < (class349.field4567 >> 3)) {
                class572.method3237(var2, var1, (byte) -70, 5000);
            } else {
                class572.method3237(class349.field4567 >> 4, class399.field5338 >> 4, (byte) -70, 0);
            }
        }
        if (arg0 != -12) {
            field1422 = 85;
        }
        field1424++;
        class300.method1701(true);
        class99.method611((byte) -88);
        class663.method3723(true);
        class562.method3172(false);
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
    public static void method727(int arg0) {
        field1430 = null;
        if (arg0 != -524213725) {
            field1430 = null;
        }
        field1425 = null;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Ljo;Lkc;)V")
    public class126(class303 arg0, class120 arg1) {
        this.field1431 = arg1;
        this.field1426 = arg0;
    }
}
