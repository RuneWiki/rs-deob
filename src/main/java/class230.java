import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class230 extends class196 {

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "[B")
    public byte[] field3478;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static volatile int field3475 = 0;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3479 = "Allocating memory";

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field3476 = 0;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "[Lea;")
    public static class235[] field3482;

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "([B)V", line = 10)
    public class230(byte[] arg0) {
        this.field3478 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 24)
    public static void method1593(byte arg0) {
        field3479 = null;
        field3482 = null;
        if (arg0 != 75) {
            method1593((byte) 85);
        }
    }
}
