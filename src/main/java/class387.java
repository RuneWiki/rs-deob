import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class387 {

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "Z")
    public boolean field4871;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Lhh;")
    public class666 field4868;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "Lhh;")
    public class666 field4870;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Z")
    public boolean field4866;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Z")
    public final boolean method2080(int arg0) {
        field4869++;
        if (arg0 < 20) {
            this.method2080(59);
        }
        return this.field4866 && !this.field4871;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
    public final void method2081(int arg0) {
        field4872++;
        if (arg0 == 23331) {
            if (this.field4870 != null) {
                this.field4870.method323(-21271);
            }
            this.field4866 = false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Z)V")
    public class387(boolean arg0) {
        this.field4871 = arg0;
    }
}
