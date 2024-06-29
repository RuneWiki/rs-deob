import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class306 extends class665 {

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Lwea;")
    public class142 field4502;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lwea;I)V", line = 6)
    public class306(class142 arg0, int arg1) {
        this.field4503 = arg1;
        this.field4502 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Z")
    public abstract boolean method366(int arg0);

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method367(int arg0);
}
