import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class254 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lht;")
    public class378 field3726;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lmi;")
    private class315 field3728;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "B")
    public byte field3724;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "B")
    public byte field3725;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "S")
    public short field3727;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public final void method1580(boolean arg0) {
        this.field3728.method1983(this.field3726);
        if (!arg0) {
            this.method1581(0);
        }
        this.field3726.method838(this);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public final void method1581(int arg0) {
        this.field3728.method1983(this.field3726);
        if (arg0 < 122) {
            this.method1583(51);
        }
        this.field3726.method840(this);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public final void method1582(boolean arg0) {
        if (!arg0) {
            this.field3728.method1983(this.field3726);
            this.field3726.method841(this);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public final void method1583(int arg0) {
        if (arg0 != -27316) {
            this.method1582(true);
        }
        this.field3728.method1983(this.field3726);
        this.field3726.method839(this);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lmi;Lht;III)V")
    public class254(class315 arg0, class378 arg1, int arg2, int arg3, int arg4) {
        this.field3726 = arg1;
        this.field3728 = arg0;
        this.field3724 = (byte) arg4;
        this.field3725 = (byte) arg3;
        this.field3727 = (short) arg2;
    }
}
