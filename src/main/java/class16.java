import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class16 extends class165 {

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "[Ldn;")
    public class132[] field196;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I[Ldn;)V", line = 4)
    public class16(int arg0, class132[] arg1) {
        this.field195 = arg0;
        this.field196 = arg1;
    }
}
