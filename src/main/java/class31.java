import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KTAHMSMP")
public class class31 extends class62 {

    @OriginalMember(owner = "client!KTAHMSMP", name = "e", descriptor = "I")
    private int field947 = -5381;

    @OriginalMember(owner = "client!KTAHMSMP", name = "h", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!KTAHMSMP", name = "f", descriptor = "LKTAHMSMP;")
    public class31 field948;

    @OriginalMember(owner = "client!KTAHMSMP", name = "g", descriptor = "LKTAHMSMP;")
    public class31 field949;

    @OriginalMember(owner = "client!KTAHMSMP", name = "b", descriptor = "()V")
    public void method342() {
        if (this.field949 != null) {
            this.field949.field948 = this.field948;
            this.field948.field949 = this.field949;
            this.field948 = null;
            this.field949 = null;
        }
    }
}
