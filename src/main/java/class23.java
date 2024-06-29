import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ICYNFRTV")
public class class23 extends class56 {

    @OriginalMember(owner = "client!ICYNFRTV", name = "h", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ICYNFRTV", name = "f", descriptor = "LICYNFRTV;")
    public class23 field831;

    @OriginalMember(owner = "client!ICYNFRTV", name = "g", descriptor = "LICYNFRTV;")
    public class23 field832;

    @OriginalMember(owner = "client!ICYNFRTV", name = "b", descriptor = "()V")
    public void method320() {
        if (this.field832 != null) {
            this.field832.field831 = this.field831;
            this.field831.field832 = this.field832;
            this.field831 = null;
            this.field832 = null;
        }
    }
}
