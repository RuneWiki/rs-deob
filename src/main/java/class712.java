import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class712 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "J")
    public long field9800;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lhk;")
    private class111 field9806;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field9804 = 0;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lot;")
    public static class617 field9802;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public static void method3965(boolean arg0) {
        if (!arg0) {
            field9802 = null;
        }
        field9802 = null;
    }

    @OriginalMember(owner = "client!ag", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field9801++;
        this.field9806.method998(this.field9800, (byte) 56);
        super.finalize();
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lhk;J[Lhv;)V")
    public class712(class111 arg0, long arg1, class546[] arg2) {
        this.field9800 = arg1;
        this.field9806 = arg0;
    }
}
