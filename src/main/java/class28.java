import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class28 extends class23 {

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "Ljava/lang/Object;")
    private Object field486;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "Lrk;")
    public static class427 field487;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "Lrk;")
    public static class427 field488;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLcc;)V", line = 3)
    public static final void method331(byte arg0, class338 arg1) {
        int var2 = -35 % ((arg0 + 68) / 49);
        field482++;
        class417 var3 = (class417) class218.field3018.method614(-121, (long) arg1.field4957);
        if (var3 == null) {
            return;
        }
        if (var3.field5836 != null) {
            class315.field4277.method1431(var3.field5836);
            var3.field5836 = null;
        }
        var3.method2367(5);
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lpc;Ljava/lang/Object;)V", line = 28)
    public class28(class34 arg0, Object arg1) {
        super(arg0);
        this.field486 = arg1;
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(B)Z", line = 37)
    public final boolean method287(byte arg0) {
        if (arg0 >= -69) {
            return true;
        } else {
            field485++;
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 58)
    public final Object method289(int arg0) {
        if (arg0 != -14795) {
            field488 = null;
        }
        field483++;
        return this.field486;
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V", line = 69)
    public static void method332(int arg0) {
        if (arg0 != -1) {
            field484 = 27;
        }
        field487 = null;
        field488 = null;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)V", line = 81)
    public static final void method333(int arg0, int arg1) {
        int var2 = -16 / ((-arg1 - 50) / 39);
        if (!class338.field4590) {
            arg0 = -1;
        }
        field481++;
        if (class31.field519 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class121 var3 = class411.method2547(arg0, 8);
            class214 var4 = var3.method953(-7580);
            if (var4 == null) {
                arg0 = -1;
            } else {
                class30.field502.method1964(var4.method1463(), var4.method1468(), new Point(var3.field1695, var3.field1692), 0, var4.method1458(), class418.field5867);
                class31.field519 = arg0;
            }
        }
        if (arg0 == -1 && class31.field519 != -1) {
            class30.field502.method1964(-1, -1, new Point(), 0, (int[]) null, class418.field5867);
            class31.field519 = -1;
        }
    }
}
