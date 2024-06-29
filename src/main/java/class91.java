import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class91 extends class86 {

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Ljava/lang/String;")
    public String field1244;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V", line = 6)
    public class91() {
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 12)
    public class91(String arg0, int arg1) {
        this.field1244 = arg0;
    }
}
