import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class454 {

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "Ltm;")
    private class389 field6524 = new class389();

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Z")
    public static boolean field6521 = true;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Ltm;")
    private class389 field6529;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 8)
    public final void method2787(int arg0) {
        while (true) {
            class389 var2 = this.field6524.field5387;
            if (this.field6524 == var2) {
                field6523++;
                this.field6529 = null;
                int var3 = 17 / ((arg0 - 61) / 59);
                return;
            }
            var2.method2401((byte) -57);
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Ltm;", line = 30)
    public final class389 method2788(int arg0) {
        field6527++;
        class389 var2 = this.field6524.field5382;
        if (this.field6524 == var2) {
            this.field6529 = null;
            return null;
        } else {
            this.field6529 = var2.field5382;
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)Z", line = 57)
    public final boolean method2789(byte arg0) {
        if (arg0 < 35) {
            this.field6524 = null;
        }
        field6530++;
        return this.field6524.field5387 == this.field6524;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V", line = 155)
    public class454() {
        this.field6524.field5387 = this.field6524;
        this.field6524.field5382 = this.field6524;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Ltm;", line = 72)
    public final class389 method2790(int arg0) {
        field6531++;
        if (arg0 <= 100) {
            this.field6529 = null;
        }
        class389 var2 = this.field6524.field5387;
        if (this.field6524 == var2) {
            this.field6529 = null;
            return null;
        } else {
            this.field6529 = var2.field5387;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)I", line = 92)
    public final int method2791(int arg0) {
        field6522++;
        int var2 = arg0;
        class389 var3 = this.field6524.field5387;
        while (this.field6524 != var3) {
            var3 = var3.field5387;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLtm;)V", line = 114)
    public final void method2792(byte arg0, class389 arg1) {
        field6526++;
        if (arg1.field5382 != null) {
            arg1.method2401((byte) -57);
        }
        arg1.field5387 = this.field6524;
        if (arg0 != -13) {
            this.field6524 = null;
        }
        arg1.field5382 = this.field6524.field5382;
        arg1.field5382.field5387 = arg1;
        arg1.field5387.field5382 = arg1;
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)Ltm;", line = 132)
    public final class389 method2793(int arg0) {
        field6525++;
        if (arg0 != 14711) {
            field6521 = true;
        }
        class389 var2 = this.field6524.field5387;
        if (this.field6524 == var2) {
            return null;
        } else {
            var2.method2401((byte) -57);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)Ltm;", line = 164)
    public final class389 method2794(int arg0) {
        if (arg0 < 22) {
            this.field6529 = null;
        }
        field6528++;
        class389 var2 = this.field6529;
        if (this.field6524 == var2) {
            this.field6529 = null;
            return null;
        } else {
            this.field6529 = var2.field5387;
            return var2;
        }
    }
}
