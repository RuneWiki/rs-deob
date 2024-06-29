import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DJXGSHIT")
public class class6 {

    @OriginalMember(owner = "client!DJXGSHIT", name = "a", descriptor = "J")
    public long field542;

    @OriginalMember(owner = "client!DJXGSHIT", name = "b", descriptor = "LDJXGSHIT;")
    public class6 field543;

    @OriginalMember(owner = "client!DJXGSHIT", name = "c", descriptor = "LDJXGSHIT;")
    public class6 field544;

    @OriginalMember(owner = "client!DJXGSHIT", name = "d", descriptor = "Z")
    public static boolean field545;

    @OriginalMember(owner = "client!DJXGSHIT", name = "a", descriptor = "()V")
    public void method156() {
        if (this.field544 != null) {
            this.field544.field543 = this.field543;
            this.field543.field544 = this.field544;
            this.field543 = null;
            this.field544 = null;
        }
    }
}
