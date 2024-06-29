import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class288 extends class287 {

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public int field4439;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "[Lbd;")
    public class28[] field4438;

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I[Lbd;)V", line = 4)
    public class288(int arg0, class28[] arg1) {
        this.field4439 = arg0;
        this.field4438 = arg1;
    }
}
