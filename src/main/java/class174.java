import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class174 extends class320 {

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "[Lef;")
    public class350[] field2982;

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(I[Lef;)V", line = 4)
    public class174(int arg0, class350[] arg1) {
        this.field2983 = arg0;
        this.field2982 = arg1;
    }
}
