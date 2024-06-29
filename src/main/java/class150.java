import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class150 extends class401 {

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public volatile int field2204 = -1;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Ljava/lang/String;")
    public volatile String field2205;

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class150(String arg0) {
        this.field2205 = arg0;
    }
}
