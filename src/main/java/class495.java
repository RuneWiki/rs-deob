import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class495 extends class134 {

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public volatile int field7005 = -1;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field7006;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Lbga;")
    public static class356 field7004 = new class356();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 6)
    public static void method2956(int arg0) {
        if (arg0 != -1) {
            field7004 = null;
        }
        field7004 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 21)
    public class495(String arg0) {
        this.field7006 = arg0;
    }
}
