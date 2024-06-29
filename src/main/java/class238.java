import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class238 extends class117 {

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "[Lac;")
    public class337[] field3557;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I[Lac;)V", line = 4)
    public class238(int arg0, class337[] arg1) {
        this.field3556 = arg0;
        this.field3557 = arg1;
    }
}
