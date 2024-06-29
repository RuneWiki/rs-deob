import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class387 extends class86 {

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Luw;")
    public static class208 field4943 = new class208(83, -1);

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        ++field4939;
        if (super.field1203.method2987(2) == class433.field5672) {
            if (super.field1203.method2981(arg0 + 51)) {
                super.field1200 = 0;
            }
        } else {
            super.field1200 = 1;
        }
        if (super.field1200 != 0 && ~super.field1200 != -2) {
            super.field1200 = this.method73(0);
        }
        if (arg0 != -65) {
            field4943 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            this.method72(20, 52);
        }
        ++field4942;
        if (super.field1203.method2981(arg1 ^ 12)) {
            return 3;
        } else {
            return super.field1203.method2987(2) == class433.field5672 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(ILsf;)V")
    public class387(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lsf;)V")
    public class387(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        if (arg0 != 0) {
            return -128;
        } else {
            ++field4941;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
    public final int method2223(boolean arg0) {
        if (arg0) {
            field4943 = null;
        }
        ++field4944;
        return super.field1200;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        ++field4938;
        if (arg1) {
            field4943 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)Z")
    public final boolean method2224(int arg0) {
        ++field4940;
        if (super.field1203.method2981(-14)) {
            return false;
        } else if (super.field1203.method2987(2) == class433.field5672) {
            return true;
        } else {
            int var2 = 114 / ((-57 - arg0) / 57);
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static void method2225(byte arg0) {
        if (arg0 < 28) {
            field4943 = null;
        }
        field4943 = null;
    }
}
