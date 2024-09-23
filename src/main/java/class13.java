import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DLMMHADP")
public class class13 {

    @OriginalMember(owner = "DLMMHADP", name = "a", descriptor = "J")
    public long field720;

    @OriginalMember(owner = "DLMMHADP", name = "b", descriptor = "LDLMMHADP;")
    public class13 field721;

    @OriginalMember(owner = "DLMMHADP", name = "c", descriptor = "LDLMMHADP;")
    public class13 field722;

    @OriginalMember(owner = "DLMMHADP", name = "d", descriptor = "Z")
    public static boolean field723;

    @OriginalMember(owner = "DLMMHADP", name = "a", descriptor = "()V")
    public void method234() {
        if (this.field722 != null) {
            this.field722.field721 = this.field721;
            this.field721.field722 = this.field722;
            this.field721 = null;
            this.field722 = null;
        }
    }
}
