import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class699 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public int field9683;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lp;")
    public static class206 field9680 = null;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field9684;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method3860(byte arg0, int arg1) {
        if (arg0 != -70) {
            method3860((byte) 16, 86);
        }
        field9681++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!nh", name = "toString", descriptor = "()Ljava/lang/String;", line = 23)
    public final String toString() {
        field9684++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V", line = 30)
    public class699(int arg0) {
        this.field9683 = arg0;
    }
}
