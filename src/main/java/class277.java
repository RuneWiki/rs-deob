import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class277 {

    @OriginalMember(owner = "client!js", name = "e", descriptor = "Lbu;")
    private class19 field3887;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Lkp;")
    private class417 field3883;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1736(int arg0) {
        field3885++;
        if (arg0 != 15362) {
            method1736(81);
        }
        class519.field7397.method837(126);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lbu;I)V", line = 17)
    public final void method1737(class19 arg0, int arg1) {
        this.field3887 = arg0;
        field3886++;
        if (arg1 != -1803) {
            this.method1739(-85);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)Lkp;", line = 29)
    public final class417 method1738(boolean arg0) {
        field3888++;
        if (!arg0) {
            return null;
        }
        class417 var2 = this.field3887.field179.field5645;
        if (this.field3887.field179 == var2) {
            this.field3883 = null;
            return null;
        } else {
            this.field3883 = var2.field5645;
            return var2;
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Lkp;", line = 52)
    public final class417 method1739(int arg0) {
        field3884++;
        if (arg0 != -5301) {
            this.method1738(false);
        }
        class417 var2 = this.field3883;
        if (this.field3887.field179 == var2) {
            this.field3883 = null;
            return null;
        } else {
            this.field3883 = var2.field5645;
            return var2;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V", line = 79)
    public class277() {
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lbu;)V", line = 81)
    public class277(class19 arg0) {
        this.field3887 = arg0;
    }
}
