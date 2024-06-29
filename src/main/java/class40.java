import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class40 extends class223 {

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "J")
    public long field459;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Z")
    public static boolean field454 = false;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field457 = 0;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)V", line = 15)
    public static final void method400(byte arg0) {
        class473.field6977 = null;
        class467.field6906 = null;
        class516.field7597 = null;
        class441.field6545 = null;
        if (arg0 <= 105) {
            field458 = -90;
        }
        field456++;
        class448.field6607 = null;
        class250.field3681 = null;
        class124.field1818 = null;
        class253.field3737 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 36)
    public class40() {
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(J)V", line = 46)
    public class40(long arg0) {
        this.field459 = arg0;
    }
}
