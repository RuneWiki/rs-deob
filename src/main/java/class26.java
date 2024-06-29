import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IVMCUDWL")
public class class26 extends class71 {

    @OriginalMember(owner = "client!IVMCUDWL", name = "f", descriptor = "I")
    private int field850 = -521;

    @OriginalMember(owner = "client!IVMCUDWL", name = "i", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!IVMCUDWL", name = "g", descriptor = "LIVMCUDWL;")
    public class26 field851;

    @OriginalMember(owner = "client!IVMCUDWL", name = "h", descriptor = "LIVMCUDWL;")
    public class26 field852;

    @OriginalMember(owner = "client!IVMCUDWL", name = "b", descriptor = "()V")
    public void method282() {
        if (this.field852 != null) {
            this.field852.field851 = this.field851;
            this.field851.field852 = this.field852;
            this.field851 = null;
            this.field852 = null;
        }
    }
}
