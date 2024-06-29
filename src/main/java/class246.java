import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class246 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lqb;")
    public class122 field3470;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "S")
    public short field3473;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ltb;")
    private class227 field3469;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "B")
    public byte field3472;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "B")
    public byte field3471;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 4)
    public final void method1661(int arg0) {
        this.field3469.method1568(this.field3470);
        if (arg0 != 6813) {
            this.method1661(-108);
        }
        this.field3470.method815(this);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 19)
    public final void method1662(byte arg0) {
        this.field3469.method1568(this.field3470);
        this.field3470.method813(this);
        if (arg0 != -13) {
            this.method1664(-124);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 30)
    public final void method1663(boolean arg0) {
        if (arg0) {
            this.method1664(-126);
        }
        this.field3469.method1568(this.field3470);
        this.field3470.method817(this);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 41)
    public final void method1664(int arg0) {
        if (arg0 == 16005) {
            this.field3469.method1568(this.field3470);
            this.field3470.method816(this);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Ltb;Lqb;III)V", line = 52)
    public class246(class227 arg0, class122 arg1, int arg2, int arg3, int arg4) {
        this.field3470 = arg1;
        this.field3473 = (short) arg2;
        this.field3469 = arg0;
        this.field3472 = (byte) arg4;
        this.field3471 = (byte) arg3;
    }
}
