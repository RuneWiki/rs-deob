import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BEBSUZBY")
public class class7 {

    @OriginalMember(owner = "client!BEBSUZBY", name = "a", descriptor = "J")
    public long field139;

    @OriginalMember(owner = "client!BEBSUZBY", name = "b", descriptor = "LBEBSUZBY;")
    public class7 field140;

    @OriginalMember(owner = "client!BEBSUZBY", name = "c", descriptor = "LBEBSUZBY;")
    public class7 field141;

    @OriginalMember(owner = "client!BEBSUZBY", name = "d", descriptor = "Z")
    public static boolean field142;

    @OriginalMember(owner = "client!BEBSUZBY", name = "a", descriptor = "()V")
    public void method41() {
        if (this.field141 != null) {
            this.field141.field140 = this.field140;
            this.field140.field141 = this.field141;
            this.field140 = null;
            this.field141 = null;
        }
    }
}
