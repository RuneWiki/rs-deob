import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CZLFLPZK")
public class class8 {

    @OriginalMember(owner = "client!CZLFLPZK", name = "a", descriptor = "J")
    public long field619;

    @OriginalMember(owner = "client!CZLFLPZK", name = "b", descriptor = "LCZLFLPZK;")
    public class8 field620;

    @OriginalMember(owner = "client!CZLFLPZK", name = "c", descriptor = "LCZLFLPZK;")
    public class8 field621;

    @OriginalMember(owner = "client!CZLFLPZK", name = "d", descriptor = "Z")
    public static boolean field622;

    @OriginalMember(owner = "client!CZLFLPZK", name = "a", descriptor = "()V")
    public void method163() {
        if (this.field621 != null) {
            this.field621.field620 = this.field620;
            this.field620.field621 = this.field621;
            this.field620 = null;
            this.field621 = null;
        }
    }
}
