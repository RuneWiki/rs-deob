import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class262 extends class35 {

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "[Lkm;")
    public class92[] field4083;

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I[Lkm;)V", line = 4)
    public class262(int arg0, class92[] arg1) {
        this.field4082 = arg0;
        this.field4083 = arg1;
    }
}
