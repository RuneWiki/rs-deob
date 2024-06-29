import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class386 extends IOException {

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "[I")
    public static int[] field4954 = new int[8];

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Lxa;")
    public static class468 field4953;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Lqj;")
    public static class476 field4955;

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 5)
    public class386(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 8)
    public static void method2212(int arg0) {
        field4953 = null;
        field4955 = null;
        field4954 = null;
        if (arg0 != 8) {
            field4954 = null;
        }
    }
}
