import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class755 extends class154 {

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "Lwda;")
    public class666 field10414;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "[Lofa;")
    public static class349[] field10415 = new class349[75];

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
    public static final int method4184(int arg0, int arg1) {
        return class625.field8717 == null ? 0 : class625.field8717[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lwda;)V")
    public class755(class666 arg0) {
        this.field10414 = arg0;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static void method4185(int arg0) {
        field10415 = null;
        if (arg0 != 16777215) {
            method4185(122);
        }
    }
}
