import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FFAASUKE")
public class class13 extends class30 {

    @OriginalMember(owner = "client!FFAASUKE", name = "h", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!FFAASUKE", name = "f", descriptor = "LFFAASUKE;")
    public class13 field735;

    @OriginalMember(owner = "client!FFAASUKE", name = "g", descriptor = "LFFAASUKE;")
    public class13 field736;

    @OriginalMember(owner = "client!FFAASUKE", name = "b", descriptor = "()V")
    public void method300() {
        if (this.field736 != null) {
            this.field736.field735 = this.field735;
            this.field735.field736 = this.field736;
            this.field735 = null;
            this.field736 = null;
        }
    }
}
