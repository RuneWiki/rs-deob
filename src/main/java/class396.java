import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class396 extends class376 {

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public volatile int field5789 = -1;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Ljava/lang/String;")
    public volatile String field5787;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field5782 = 0;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Z")
    public static boolean field5786 = false;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field5788 = 127;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZZI)V", line = 31)
    public static final void method2566(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            class154.field2170++;
            class417.method2661(22214);
        }
        if (arg2 != -16653) {
            field5786 = true;
        }
        field5785++;
        if (arg1) {
            class41.field614++;
            class13.method73((byte) -128);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 56)
    public class396(String arg0) {
        this.field5787 = arg0;
    }
}
