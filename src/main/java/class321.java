import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class321 extends class28 {

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Ljava/lang/String;")
    public String field4714;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lfo;")
    public static class417 field4713 = new class417();

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method2076(int arg0) {
        field4713 = null;
        if (arg0 != 12622) {
            field4715 = 25;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class321() {
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class321(String arg0, int arg1) {
        this.field4714 = arg0;
    }
}
