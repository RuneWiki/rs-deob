import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IOXDUYYH")
public class class26 extends class1 {

    @OriginalMember(owner = "client!IOXDUYYH", name = "e", descriptor = "Z")
    private boolean field888 = true;

    @OriginalMember(owner = "client!IOXDUYYH", name = "h", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!IOXDUYYH", name = "f", descriptor = "LIOXDUYYH;")
    public class26 field889;

    @OriginalMember(owner = "client!IOXDUYYH", name = "g", descriptor = "LIOXDUYYH;")
    public class26 field890;

    @OriginalMember(owner = "client!IOXDUYYH", name = "b", descriptor = "()V")
    public void method304() {
        if (this.field890 != null) {
            this.field890.field889 = this.field889;
            this.field889.field890 = this.field890;
            this.field889 = null;
            this.field890 = null;
        }
    }
}
