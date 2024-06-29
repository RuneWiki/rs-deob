import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class165 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2674 = "Loading wordpack - ";

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Ljava/lang/Thread;")
    public static Thread field2672;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V", line = 11)
    public static final void method1238(byte arg0, Object[] arg1, long[] arg2) {
        class227.method1659(0, arg2.length - 1, arg1, arg2, (byte) -70);
        field2673++;
        if (arg0 < 56) {
            field2672 = (Thread) null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 23)
    public static void method1239(int arg0) {
        field2672 = null;
        field2674 = null;
        if (arg0 != -1) {
            field2672 = (Thread) null;
        }
    }
}
