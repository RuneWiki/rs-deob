import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class67 extends class577 {

    @OriginalMember(owner = "client!mia", name = "m", descriptor = "Ljava/lang/String;")
    public String field821;

    @OriginalMember(owner = "client!mia", name = "l", descriptor = "[I")
    public static int[] field820 = new int[4];

    @OriginalMember(owner = "client!mia", name = "o", descriptor = "I")
    public static int field823 = -1;

    @OriginalMember(owner = "client!mia", name = "n", descriptor = "[Ljd;")
    public static class241[] field822;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)V", line = 9)
    public static void method575(int arg0) {
        field822 = null;
        if (arg0 != 4) {
            field820 = null;
        }
        field820 = null;
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "()V", line = 20)
    public class67() {
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 22)
    public class67(String arg0, int arg1) {
        this.field821 = arg0;
    }
}
