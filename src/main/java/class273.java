import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class273 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "B")
    public byte field3963;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "S")
    public short field3962;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lmp;")
    public class454 field3961;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "B")
    public byte field3965;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Lig;")
    private class132 field3964;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 4)
    public final void method1860(byte arg0) {
        if (arg0 > 20) {
            this.field3964.method974(this.field3961);
            this.field3961.method37(this);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V", line = 16)
    public final void method1861(byte arg0) {
        this.field3964.method974(this.field3961);
        if (arg0 == 31) {
            this.field3961.method32(this);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 27)
    public final void method1862(int arg0) {
        if (arg0 <= 20) {
            this.method1861((byte) -72);
        }
        this.field3964.method974(this.field3961);
        this.field3961.method33(this);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V", line = 41)
    public final void method1863(byte arg0) {
        this.field3964.method974(this.field3961);
        int var2 = 27 / ((-arg0 - 14) / 41);
        this.field3961.method36(this);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lig;Lmp;III)V", line = 51)
    public class273(class132 arg0, class454 arg1, int arg2, int arg3, int arg4) {
        this.field3963 = (byte) arg4;
        this.field3962 = (short) arg2;
        this.field3961 = arg1;
        this.field3965 = (byte) arg3;
        this.field3964 = arg0;
    }
}
