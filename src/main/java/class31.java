import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LXNKZOGX")
public class class31 {

    @OriginalMember(owner = "client!LXNKZOGX", name = "a", descriptor = "J")
    public long field981;

    @OriginalMember(owner = "client!LXNKZOGX", name = "b", descriptor = "LLXNKZOGX;")
    public class31 field982;

    @OriginalMember(owner = "client!LXNKZOGX", name = "c", descriptor = "LLXNKZOGX;")
    public class31 field983;

    @OriginalMember(owner = "client!LXNKZOGX", name = "d", descriptor = "Z")
    public static boolean field984;

    @OriginalMember(owner = "client!LXNKZOGX", name = "a", descriptor = "()V")
    public void method331() {
        if (this.field983 != null) {
            this.field983.field982 = this.field982;
            this.field982.field983 = this.field983;
            this.field982 = null;
            this.field983 = null;
        }
    }
}
