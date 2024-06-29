import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class268 {

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "()V", line = 5)
    public class268() {
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lvga;)V", line = 7)
    public class268(class268 arg0) {
        this.field3782 = arg0.field3782;
        this.field3783 = arg0.field3783;
        this.field3784 = arg0.field3784;
    }
}
