import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class276 {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "Ljava/lang/String;")
    public String field3742;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "J")
    public long field3740;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "Ljava/lang/String;")
    public String field3739;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "[I")
    public static int[] field3745 = new int[2048];

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "Z")
    public static boolean field3741 = false;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Lvb;")
    public static class411 field3744;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V", line = 3)
    public static void method1682(byte arg0) {
        if (arg0 == -33) {
            field3745 = null;
            field3744 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 25)
    public class276(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field3738 = arg0;
        this.field3742 = arg3;
        this.field3740 = arg4;
        this.field3739 = arg1;
        this.field3743 = arg2;
    }
}
