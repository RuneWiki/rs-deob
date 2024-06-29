import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MCYIFIZT")
public class class36 extends class33 {

    @OriginalMember(owner = "client!MCYIFIZT", name = "g", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!MCYIFIZT", name = "e", descriptor = "LMCYIFIZT;")
    public class36 field1035;

    @OriginalMember(owner = "client!MCYIFIZT", name = "f", descriptor = "LMCYIFIZT;")
    public class36 field1036;

    @OriginalMember(owner = "client!MCYIFIZT", name = "b", descriptor = "()V")
    public void method380() {
        if (this.field1036 != null) {
            this.field1036.field1035 = this.field1035;
            this.field1035.field1036 = this.field1036;
            this.field1035 = null;
            this.field1036 = null;
        }
    }
}
