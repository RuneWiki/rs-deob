import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class105 extends class504 {

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "J")
    public long field1566;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field1569 = 0;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "F")
    public static float field1568;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "[[Lr;")
    public static class170[][] field1570;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public static void method799(int arg0) {
        if (arg0 != 1399495239) {
            field1570 = null;
        }
        field1570 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)I")
    public static final int method800(int arg0, int arg1) {
        if (arg0 == 1399495239) {
            field1567++;
            return arg1 >>> 7;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
    public class105() {
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(J)V")
    public class105(long arg0) {
        this.field1566 = arg0;
    }
}
