import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class659 implements class685 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Ljava/lang/String;")
    private String field8700;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "Lhda;")
    public static class752 field8701 = new class752(77, -1);

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Z")
    private boolean field8702;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "[Lhu;")
    public static class133[] field8707;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method3574(int arg0) {
        if (arg0 > -17) {
            return false;
        } else {
            field8706++;
            return this.field8702;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Lsaa;", line = 15)
    public final class331 method77(byte arg0) {
        field8703++;
        if (arg0 >= -120) {
            this.method77((byte) -9);
        }
        return class331.field4722;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)V", line = 30)
    public static void method3575(byte arg0) {
        field8701 = null;
        field8707 = null;
        int var1 = -85 / ((arg0 - 1) / 48);
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 42)
    public class659(String arg0) {
        this.field8700 = arg0;
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V", line = 52)
    public static final void method3576(int arg0) {
        field8705++;
        client var1 = class243.field3401;
        synchronized (class243.field3401) {
            if (class200.field3012 == null) {
                Container var2;
                if (class218.field3143 != null) {
                    var2 = class218.field3143;
                } else if (class514.field6818 == null) {
                    var2 = class670.field9145;
                } else {
                    var2 = class514.field6818;
                }
                class201.field3018 = var2.getSize().width;
                class749.field10428 = var2.getSize().height;
                if (class218.field3143 == var2) {
                    Insets var3 = class218.field3143.getInsets();
                    class201.field3018 -= var3.right + var3.left;
                    class749.field10428 -= var3.top + var3.bottom;
                }
                if (~class343.method2050((byte) -112) == arg0) {
                    class348.field4882 = (class201.field3018 - class69.field844) / 2;
                    class733.field10148 = 0;
                    class199.field2993 = class304.field4321;
                    class228.field3251 = class69.field844;
                } else {
                    class313.method1920(true);
                }
                if (class508.field6778 != class304.field4326) {
                    boolean var10000;
                    if (class228.field3251 < 1024 && class199.field2993 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class295.field4217.setSize(class228.field3251, class199.field2993);
                if (class341.field4807 != null) {
                    if (class24.field412) {
                        class615.method3361(false, class295.field4217);
                    } else {
                        class341.field4807.method484(class295.field4217, class228.field3251, class199.field2993);
                    }
                }
                if (class218.field3143 == var2) {
                    Insets var4 = class218.field3143.getInsets();
                    class295.field4217.setLocation(class348.field4882 + var4.left, class733.field10148 + var4.top);
                } else {
                    class295.field4217.setLocation(class348.field4882, class733.field10148);
                }
                if (class443.field6101 != -1) {
                    class411.method2400(true, -105);
                }
                class565.method3123(false);
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)I", line = 139)
    public final int method78(int arg0) {
        field8704++;
        if (arg0 != -20701) {
            this.method78(73);
        }
        int var2 = class437.method2511(56, this.field8700);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field8702 = true;
            return 100;
        }
    }
}
