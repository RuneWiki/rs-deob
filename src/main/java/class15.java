import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FLQEGCUY")
public class class15 {

    @OriginalMember(owner = "FLQEGCUY", name = "a", descriptor = "J")
    public long field714;

    @OriginalMember(owner = "FLQEGCUY", name = "b", descriptor = "LFLQEGCUY;")
    public class15 field715;

    @OriginalMember(owner = "FLQEGCUY", name = "c", descriptor = "LFLQEGCUY;")
    public class15 field716;

    @OriginalMember(owner = "FLQEGCUY", name = "d", descriptor = "Z")
    public static boolean field717;

    @OriginalMember(owner = "FLQEGCUY", name = "a", descriptor = "()V")
    public void method195() {
        if (this.field716 != null) {
            this.field716.field715 = this.field715;
            this.field715.field716 = this.field716;
            this.field715 = null;
            this.field716 = null;
        }
    }
}
