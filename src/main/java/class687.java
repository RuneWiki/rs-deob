import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class687 {

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Lva;")
    private class499 field9579 = new class499();

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "Lva;")
    private class499 field9584;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "[[B")
    public static byte[][] field9583;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)I")
    public final int method3866(byte arg0) {
        field9585++;
        int var2 = 0;
        if (arg0 != 4) {
            this.method3871(true);
        }
        for (class499 var3 = this.field9579.field6716; var3 != this.field9579; var3 = var3.field6716) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V")
    public static void method3867(byte arg0) {
        if (arg0 == 116) {
            field9583 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Lva;")
    public final class499 method3868(int arg0) {
        field9574++;
        class499 var2 = this.field9584;
        if (this.field9579 == var2) {
            this.field9584 = null;
            return null;
        }
        if (arg0 != -24951) {
            this.method3866((byte) 25);
        }
        this.field9584 = var2.field6716;
        return var2;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)Lva;")
    public final class499 method3869(boolean arg0) {
        field9577++;
        class499 var2 = this.field9579.field6720;
        if (!arg0) {
            this.method3873(true);
        }
        if (this.field9579 == var2) {
            this.field9584 = null;
            return null;
        } else {
            this.field9584 = var2.field6720;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lva;I)V")
    public final void method3870(class499 arg0, int arg1) {
        if (arg0.field6720 != null) {
            arg0.method2815(-127);
        }
        field9575++;
        arg0.field6716 = this.field9579;
        if (arg1 != 0) {
            field9583 = null;
        }
        arg0.field6720 = this.field9579.field6720;
        arg0.field6720.field6716 = arg0;
        arg0.field6716.field6720 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)Z")
    public final boolean method3871(boolean arg0) {
        if (arg0) {
            field9582 = 116;
        }
        field9580++;
        return this.field9579.field6716 == this.field9579;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public final void method3872(int arg0) {
        field9576++;
        while (true) {
            class499 var2 = this.field9579.field6716;
            if (this.field9579 == var2) {
                if (arg0 != 0) {
                    this.method3870(null, -69);
                }
                this.field9584 = null;
                return;
            }
            var2.method2815(-120);
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(Z)Lva;")
    public final class499 method3873(boolean arg0) {
        field9578++;
        if (arg0) {
            this.method3874((byte) -18);
        }
        class499 var2 = this.field9579.field6716;
        if (this.field9579 == var2) {
            return null;
        } else {
            var2.method2815(-123);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)Lva;")
    public final class499 method3874(byte arg0) {
        field9581++;
        if (arg0 < 2) {
            return null;
        }
        class499 var2 = this.field9579.field6716;
        if (this.field9579 == var2) {
            this.field9584 = null;
            return null;
        } else {
            this.field9584 = var2.field6716;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class687() {
        this.field9579.field6716 = this.field9579;
        this.field9579.field6720 = this.field9579;
    }
}
