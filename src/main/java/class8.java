import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BRISMNPP")
public class class8 {

    @OriginalMember(owner = "client!BRISMNPP", name = "a", descriptor = "J")
    public long field110;

    @OriginalMember(owner = "client!BRISMNPP", name = "b", descriptor = "LBRISMNPP;")
    public class8 field111;

    @OriginalMember(owner = "client!BRISMNPP", name = "c", descriptor = "LBRISMNPP;")
    public class8 field112;

    @OriginalMember(owner = "client!BRISMNPP", name = "d", descriptor = "Z")
    public static boolean field113;

    @OriginalMember(owner = "client!BRISMNPP", name = "a", descriptor = "()V")
    public void method20() {
        if (this.field112 != null) {
            this.field112.field111 = this.field111;
            this.field111.field112 = this.field112;
            this.field111 = null;
            this.field112 = null;
        }
    }
}
