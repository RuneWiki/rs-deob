import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DOUWNVSH")
public class class13 {

    @OriginalMember(owner = "client!DOUWNVSH", name = "a", descriptor = "J")
    public long field711;

    @OriginalMember(owner = "client!DOUWNVSH", name = "b", descriptor = "LDOUWNVSH;")
    public class13 field712;

    @OriginalMember(owner = "client!DOUWNVSH", name = "c", descriptor = "LDOUWNVSH;")
    public class13 field713;

    @OriginalMember(owner = "client!DOUWNVSH", name = "d", descriptor = "Z")
    public static boolean field714;

    @OriginalMember(owner = "client!DOUWNVSH", name = "a", descriptor = "()V")
    public void method205() {
        if (this.field713 != null) {
            this.field713.field712 = this.field712;
            this.field712.field713 = this.field713;
            this.field712 = null;
            this.field713 = null;
        }
    }
}
