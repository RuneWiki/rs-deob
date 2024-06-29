import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class303 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4439 = new String[100];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lfh;")
    public static class140 field4440;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
    public static int[] field4441;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[I")
    public static int[] field4442;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I", line = 21)
    public static final int method2121(int arg0, byte arg1) {
        field4437++;
        if (arg1 != -67) {
            method2122(-44);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 37)
    public static void method2122(int arg0) {
        field4440 = null;
        field4441 = null;
        if (arg0 != 100) {
            method2123((byte) 28, (class140) null);
        }
        field4439 = null;
        field4442 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLfh;)V", line = 50)
    public static final void method2123(byte arg0, class140 arg1) {
        field4438++;
        class314.field4614 = arg1;
        int var2 = -16 / ((arg0 - 27) / 40);
    }
}
