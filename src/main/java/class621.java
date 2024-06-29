import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class621 extends class324 {

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Ljava/lang/String;")
    public String field8996;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "J")
    public static long field8994 = -1L;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field8993 = 0;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "[I")
    public static int[] field8995;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 6)
    public static void method3571(int arg0) {
        field8995 = null;
        if (arg0 != 0) {
            method3571(82);
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 21)
    public class621() {
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 26)
    public class621(String arg0) {
        this.field8996 = arg0;
    }
}
