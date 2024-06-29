import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class150 extends class71 {

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "[Ldl;")
    public class43[] field2308;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[Ldl;)V", line = 4)
    public class150(int arg0, class43[] arg1) {
        this.field2307 = arg0;
        this.field2308 = arg1;
    }
}
