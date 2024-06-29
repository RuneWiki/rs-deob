import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class226 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Ljava/lang/String;")
    public String field2824;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "J")
    public long field2826;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Ljava/lang/String;")
    public String field2822;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z")
    public static final boolean method1357(int arg0, int arg1, int arg2) {
        if (arg1 == 25728) {
            field2825++;
            return (arg0 & 0x60000) != 0 | class346.method1920(arg0, (byte) -93, arg2) || class182.method1136(128, arg0, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class226(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field2824 = arg3;
        this.field2823 = arg0;
        this.field2821 = arg2;
        this.field2826 = arg4;
        this.field2822 = arg1;
    }
}
