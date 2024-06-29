import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class163 {

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V", line = 5)
    public class163() {
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Leea;)V", line = 7)
    public class163(class163 arg0) {
        this.field2299 = arg0.field2299;
        this.field2300 = arg0.field2300;
        this.field2301 = arg0.field2301;
    }
}
