import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class666 extends class430 {

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public volatile int field9520 = -1;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "Ljava/lang/String;")
    public volatile String field9519;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field9518 = 0;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field9523 = 0;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(JJ)J")
    public static long method3806(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class666(String arg0) {
        this.field9519 = arg0;
    }
}
