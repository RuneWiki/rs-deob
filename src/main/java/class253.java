import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class253 extends class5 {

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "[Lsm;")
    public class124[] field3809;

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I[Lsm;)V", line = 4)
    public class253(int arg0, class124[] arg1) {
        this.field3810 = arg0;
        this.field3809 = arg1;
    }
}
