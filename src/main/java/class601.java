import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class class601 {

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lgn;")
    public class699 field8563;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public int field8565;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
    public final void method3416(int arg0, int arg1) {
        if (this.method34(arg1, arg0 ^ 0x14A6) != 3) {
            this.method40(arg1, false);
        }
        field8564++;
        if (arg0 != 10748) {
            this.method3416(-89, -124);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public abstract void method35(byte arg0);

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)I")
    public abstract int method39(byte arg0);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
    public abstract void method40(int arg0, boolean arg1);

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)I")
    public abstract int method34(int arg0, int arg1);

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lgn;)V")
    public class601(class699 arg0) {
        this.field8563 = arg0;
        this.field8565 = this.method39((byte) -17);
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(ILgn;)V")
    public class601(int arg0, class699 arg1) {
        this.field8563 = arg1;
        this.field8565 = arg0;
    }
}
