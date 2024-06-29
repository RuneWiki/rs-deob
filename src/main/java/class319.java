import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class319 extends class504 {

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Ljava/lang/String;")
    public String field4371;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Lgj;")
    public static class593 field4368 = new class593();

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "[I")
    public static int[] field4369 = new int[1];

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "F")
    public static float field4370;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 17)
    public static void method1891(byte arg0) {
        field4369 = null;
        int var1 = -31 % ((34 - arg0) / 63);
        field4368 = null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 26)
    public class319() {
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 28)
    public class319(String arg0) {
        this.field4371 = arg0;
    }
}
