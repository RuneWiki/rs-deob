import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XNCSKJMM")
public class class67 {

    @OriginalMember(owner = "XNCSKJMM", name = "a", descriptor = "I")
    private int field1663 = 344;

    @OriginalMember(owner = "XNCSKJMM", name = "b", descriptor = "Z")
    private boolean field1664 = false;

    @OriginalMember(owner = "XNCSKJMM", name = "c", descriptor = "J")
    public long field1665;

    @OriginalMember(owner = "XNCSKJMM", name = "d", descriptor = "LXNCSKJMM;")
    public class67 field1666;

    @OriginalMember(owner = "XNCSKJMM", name = "e", descriptor = "LXNCSKJMM;")
    public class67 field1667;

    @OriginalMember(owner = "XNCSKJMM", name = "f", descriptor = "Z")
    public static boolean field1668;

    @OriginalMember(owner = "XNCSKJMM", name = "a", descriptor = "()V")
    public void method582() {
        if (this.field1667 != null) {
            this.field1667.field1666 = this.field1666;
            this.field1666.field1667 = this.field1667;
            this.field1666 = null;
            this.field1667 = null;
        }
    }
}
