import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class191 extends class183 {

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "[Lfc;")
    public class261[] field2625;

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(I[Lfc;)V", line = 4)
    public class191(int arg0, class261[] arg1) {
        this.field2624 = arg0;
        this.field2625 = arg1;
    }
}
