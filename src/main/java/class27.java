import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 6)
    public class27() {
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Luc;)V", line = 8)
    public class27(class27 arg0) {
        this.field191 = arg0.field191;
        this.field192 = arg0.field192;
        this.field190 = arg0.field190;
        this.field193 = arg0.field193;
    }
}
