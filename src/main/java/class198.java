import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class198 extends class172 {

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[Lvg;")
    public class8[] field3089;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I[Lvg;)V", line = 4)
    public class198(int arg0, class8[] arg1) {
        this.field3088 = arg0;
        this.field3089 = arg1;
    }
}
