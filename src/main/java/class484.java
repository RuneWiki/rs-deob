import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class484 {

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "J")
    public long field6547;

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "Lsb;")
    private class93 field6548;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "Z")
    public static boolean field6549 = false;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!wga", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6548.method605(this.field6547, 111);
        field6546++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lsb;J[Ljr;)V")
    public class484(class93 arg0, long arg1, class133[] arg2) {
        this.field6547 = arg1;
        this.field6548 = arg0;
    }
}
