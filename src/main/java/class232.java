import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class232 {

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Lkfa;")
    private class382 field3448;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "Leda;")
    public static class116 field3446 = new class116(18, 6);

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIBI)V", line = 3)
    public static final void method1526(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3445++;
        float var5 = (float) class161.field2631 / (float) class161.field2640;
        int var6 = arg4;
        int var7 = arg0;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg1 - (arg4 - var6) / 2;
        if (arg3 != 78) {
            field3446 = null;
        }
        int var9 = arg2 - (arg0 - var7) / 2;
        class371.field5147 = -1;
        class438.field6298 = class161.field2631 - (class161.field2631 * var9 / var7);
        class404.field5808 = class161.field2640 * var8 / var6;
        class34.field480 = -1;
        class105.method881((byte) 125);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(JI)V", line = 32)
    public static final void method1527(long arg0, int arg1) {
        field3443++;
        class699 var3 = class336.method1996((byte) 112);
        if (arg1 != 6) {
            return;
        }
        var3.field9908.method2753((byte) 88, class561.field8192.field4340);
        var3.field9908.method2721(arg0, 520596624);
        var3.field9908.method2753((byte) 79, class238.field3511);
        class149.method1134(var3, true);
        class693.field9848 = -3;
        class250.field3623 = 1;
        class211.field3232 = 0;
        class514.field7630 = 0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V", line = 54)
    public static void method1528(boolean arg0) {
        field3446 = null;
        if (arg0) {
            method1526(-115, -91, -68, (byte) 28, 13);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)Z", line = 70)
    public static final boolean method1529(boolean arg0, int arg1) {
        field3449++;
        if (!arg0) {
            field3446 = null;
        }
        for (class673 var2 = (class673) class150.field2533.method3905(-110); var2 != null; var2 = (class673) class150.field2533.method3899(0)) {
            if (class642.method3609((byte) 112, var2.field9544) && ((long) arg1) == var2.field9543) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V", line = 97)
    protected final void finalize() throws Throwable {
        field3444++;
        this.field3448.method2278(30249, this.field3447);
        super.finalize();
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lkfa;II)V", line = 105)
    public class232(class382 arg0, int arg1, int arg2) {
        this.field3447 = arg2;
        this.field3448 = arg0;
    }
}
