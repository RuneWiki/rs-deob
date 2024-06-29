import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XAQVXEIR")
public class class66 {

    @OriginalMember(owner = "client!XAQVXEIR", name = "a", descriptor = "J")
    public long field1689;

    @OriginalMember(owner = "client!XAQVXEIR", name = "b", descriptor = "LXAQVXEIR;")
    public class66 field1690;

    @OriginalMember(owner = "client!XAQVXEIR", name = "c", descriptor = "LXAQVXEIR;")
    public class66 field1691;

    @OriginalMember(owner = "client!XAQVXEIR", name = "d", descriptor = "Z")
    public static boolean field1692;

    @OriginalMember(owner = "client!XAQVXEIR", name = "a", descriptor = "()V")
    public void method589() {
        if (this.field1691 != null) {
            this.field1691.field1690 = this.field1690;
            this.field1690.field1691 = this.field1691;
            this.field1690 = null;
            this.field1691 = null;
        }
    }
}
