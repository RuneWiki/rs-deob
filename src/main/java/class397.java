import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class397 extends class86 {

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public static int field5232 = -1;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "Lrn;")
    public static class633 field5238 = new class633(27, -1);

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "[Lwfa;")
    public static class408[] field5237;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IZ)V", line = 6)
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        if (arg1) {
            this.method71((byte) 85);
        }
        ++field5230;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(II)I", line = 17)
    public final int method72(int arg0, int arg1) {
        ++field5231;
        if (super.field1203.method2981(arg1 ^ 12)) {
            return 3;
        } else {
            if (arg1 != -2) {
                field5232 = -69;
            }
            if (super.field1203.method2987(2) == class433.field5672) {
                if (arg0 == 0) {
                    if (~super.field1203.field6920.method75(false) == -2) {
                        return 2;
                    }
                    if (~super.field1203.field6913.method3304(false) == -2) {
                        return 2;
                    }
                    if (~super.field1203.field6951.method1703(false) < -1) {
                        return 2;
                    }
                }
                return 1;
            } else {
                return 3;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)I", line = 51)
    public final int method73(int arg0) {
        ++field5234;
        if (arg0 != 0) {
            field5232 = 104;
        }
        return 1;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lsf;)V", line = 62)
    public class397(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V", line = 69)
    public static void method2295(int arg0) {
        field5237 = null;
        field5238 = null;
        if (arg0 != 27) {
            field5237 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V", line = 80)
    public final void method71(byte arg0) {
        if (super.field1203.method2987(2) != class433.field5672) {
            super.field1200 = 1;
        } else if (super.field1203.method2981(-14)) {
            super.field1200 = 0;
        }
        ++field5236;
        if (arg0 != -65) {
            field5232 = -3;
        }
        if (super.field1200 != 0 && ~super.field1200 != -2) {
            super.field1200 = this.method73(0);
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(ILsf;)V", line = 100)
    public class397(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)Z", line = 104)
    public final boolean method2296(int arg0) {
        ++field5235;
        if (super.field1203.method2981(-14)) {
            return false;
        } else {
            int var2 = -89 % ((-57 - arg0) / 57);
            return super.field1203.method2987(2) == class433.field5672;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)I", line = 125)
    public final int method2297(boolean arg0) {
        if (arg0) {
            method2295(84);
        }
        ++field5233;
        return super.field1200;
    }
}
