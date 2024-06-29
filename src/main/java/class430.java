import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class430 {

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lab;")
    public class623 field6099 = new class623();

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "Lab;")
    private class623 field6101;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public final void method2563(boolean arg0) {
        while (true) {
            class623 var2 = this.field6099.field8705;
            if (this.field6099 == var2) {
                if (arg0) {
                    this.method2565((byte) 96);
                }
                field6098++;
                this.field6101 = null;
                return;
            }
            var2.method3409(-115);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lab;B)V")
    public final void method2564(class623 arg0, byte arg1) {
        field6095++;
        if (arg1 != -123) {
            this.method2564(null, (byte) -91);
        }
        if (arg0.field8708 != null) {
            arg0.method3409(-114);
        }
        arg0.field8705 = this.field6099;
        arg0.field8708 = this.field6099.field8708;
        arg0.field8708.field8705 = arg0;
        arg0.field8705.field8708 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Lab;")
    public final class623 method2565(byte arg0) {
        field6093++;
        class623 var2 = this.field6099.field8705;
        if (this.field6099 == var2) {
            this.field6101 = null;
            return null;
        } else {
            int var3 = -7 % ((29 - arg0) / 57);
            this.field6101 = var2.field8705;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Lab;")
    public final class623 method2566(int arg0) {
        field6092++;
        if (arg0 != 0) {
            return null;
        }
        class623 var2 = this.field6099.field8705;
        if (this.field6099 == var2) {
            return null;
        } else {
            var2.method3409(19);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
    public static final void method2567(int arg0, int arg1) {
        if (arg1 == 21855) {
            field6094++;
            class139.field1661 = arg0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lab;")
    public final class623 method2568(int arg0) {
        field6102++;
        class623 var2 = this.field6101;
        if (arg0 != -31355) {
            field6096 = -30;
        }
        if (this.field6099 == var2) {
            this.field6101 = null;
            return null;
        } else {
            this.field6101 = var2.field8705;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)I")
    public final int method2569(int arg0) {
        field6100++;
        if (arg0 != 13067) {
            this.method2566(25);
        }
        int var2 = 0;
        class623 var3 = this.field6099.field8705;
        while (this.field6099 != var3) {
            var3 = var3.field8705;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class430() {
        this.field6099.field8708 = this.field6099;
        this.field6099.field8705 = this.field6099;
    }
}
