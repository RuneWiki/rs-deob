import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public abstract class class85 extends class219 {

    @OriginalMember(owner = "client!dha", name = "t", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(I)V", line = 5)
    public class85(int arg0) {
        this.field1110 = arg0;
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method599(int arg0);

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)Z")
    public abstract boolean method598(byte arg0);
}
