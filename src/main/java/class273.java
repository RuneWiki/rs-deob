import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class273 extends class55 {

    @OriginalMember(owner = "client!gia", name = "n", descriptor = "Ljava/lang/String;")
    public String field3594;

    @OriginalMember(owner = "client!gia", name = "l", descriptor = "[F")
    public static float[] field3592 = new float[4];

    @OriginalMember(owner = "client!gia", name = "k", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!gia", name = "m", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIZILni;IJ)V", line = 10)
    public static final void method1628(int arg0, int arg1, boolean arg2, int arg3, class522 arg4, int arg5, long arg6) {
        if (arg1 != 4) {
            field3591 = 126;
        }
        field3593++;
        class607.method3354(0, arg2, false, arg4, arg3, arg0, arg5, arg6);
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V", line = 23)
    public static void method1629(int arg0) {
        field3592 = null;
        int var1 = -121 / ((2 - arg0) / 63);
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V", line = 31)
    public class273() {
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 33)
    public class273(String arg0) {
        this.field3594 = arg0;
    }
}
