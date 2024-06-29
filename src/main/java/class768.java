import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class768 extends class219 {

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Ltfa;")
    public class36 field10604;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Ldba;")
    public static class101 field10603 = new class101(3, 7);

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method4234(int arg0) {
        if (arg0 <= -40) {
            field10603 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ltfa;)V")
    public class768(class36 arg0) {
        this.field10604 = arg0;
    }
}
