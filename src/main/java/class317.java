import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class317 extends class188 {

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public int field4956;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[Lha;")
    public class335[] field4957;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I[Lha;)V", line = 4)
    public class317(int arg0, class335[] arg1) {
        this.field4956 = arg0;
        this.field4957 = arg1;
    }
}
