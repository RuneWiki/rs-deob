import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class231 {

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lii;")
    public class481 field3242 = new class481();

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "F")
    public static float field3240;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lii;")
    private class481 field3244;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Lii;", line = 4)
    public final class481 method1484(byte arg0) {
        field3239++;
        class481 var2 = this.field3242.field7068;
        if (this.field3242 == var2) {
            this.field3244 = null;
            return null;
        }
        this.field3244 = var2.field7068;
        if (arg0 <= 88) {
            this.field3242 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 27)
    public final void method1485(boolean arg0) {
        if (!arg0) {
            this.field3242 = null;
        }
        while (true) {
            class481 var2 = this.field3242.field7068;
            if (this.field3242 == var2) {
                field3238++;
                this.field3244 = null;
                return;
            }
            var2.method2922(!arg0);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lii;Z)V", line = 54)
    public final void method1486(class481 arg0, boolean arg1) {
        if (arg0.field7065 != null) {
            arg0.method2922(false);
        }
        field3245++;
        if (arg1) {
            field3240 = 0.028871074F;
        }
        arg0.field7065 = this.field3242.field7065;
        arg0.field7068 = this.field3242;
        arg0.field7065.field7068 = arg0;
        arg0.field7068.field7065 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Lii;", line = 72)
    public final class481 method1487(int arg0) {
        field3246++;
        class481 var2 = this.field3244;
        if (arg0 != 4) {
            return null;
        } else if (this.field3242 == var2) {
            this.field3244 = null;
            return null;
        } else {
            this.field3244 = var2.field7068;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)I", line = 94)
    public final int method1488(boolean arg0) {
        field3243++;
        int var2 = 0;
        class481 var3 = this.field3242.field7068;
        if (arg0) {
            this.method1486(null, true);
        }
        while (this.field3242 != var3) {
            var3 = var3.field7068;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZIII)V", line = 115)
    public static final void method1489(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3241++;
        if (!arg1) {
            method1489(-44, false, -95, 126, 49);
        }
        class467 var5 = class541.method3144(arg3, (byte) -122, 4);
        var5.method2851(arg1);
        var5.field6930 = arg4;
        var5.field6926 = arg0;
        var5.field6925 = arg2;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 143)
    public class231() {
        this.field3242.field7068 = this.field3242;
        this.field3242.field7065 = this.field3242;
    }
}
