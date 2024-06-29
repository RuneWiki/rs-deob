import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class207 extends class45 {

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "[Lul;")
    public class228[] field3261;

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I[Lul;)V", line = 4)
    public class207(int arg0, class228[] arg1) {
        this.field3262 = arg0;
        this.field3261 = arg1;
    }
}
