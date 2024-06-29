import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class202 extends class26 {

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "[Lec;")
    public class349[] field2824;

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I[Lec;)V", line = 4)
    public class202(int arg0, class349[] arg1) {
        this.field2825 = arg0;
        this.field2824 = arg1;
    }
}
