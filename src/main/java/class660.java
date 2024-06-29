import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class660 extends class159 {

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "Ljava/lang/String;")
    public String field8888;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field8890 = -1;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V", line = 13)
    public class660() {
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 15)
    public class660(String arg0, int arg1) {
        this.field8888 = arg0;
    }
}
