import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class147 extends class46 {

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "[Lpa;")
    public class283[] field2241;

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I[Lpa;)V", line = 4)
    public class147(int arg0, class283[] arg1) {
        this.field2240 = arg0;
        this.field2241 = arg1;
    }
}
