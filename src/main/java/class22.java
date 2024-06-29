import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IMUKKQLH")
public class class22 extends class35 {

    @OriginalMember(owner = "client!IMUKKQLH", name = "n", descriptor = "Z")
    private boolean field812 = false;

    @OriginalMember(owner = "client!IMUKKQLH", name = "o", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!IMUKKQLH", name = "p", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "client!IMUKKQLH", name = "a", descriptor = "(I)LNGYJLUVS;")
    public final class37 method206(int arg0) {
        class4 var2 = class4.method22(this.field814);
        if (arg0 != -12617) {
            this.field812 = !this.field812;
        }
        return var2.method27(this.field813);
    }
}
