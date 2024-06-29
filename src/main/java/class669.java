import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class669 {

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[I")
    public static int[] field9457 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field9455 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field9454;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I", line = 3)
    public static final int method3834(int arg0) {
        if (arg0 != 20756) {
            method3834(79);
        }
        field9456++;
        return 16;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V", line = 31)
    public static void method3835(int arg0) {
        if (arg0 == 676) {
            field9457 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLgd;)Lgd;")
    public abstract class312 method2802(byte arg0, class312 arg1);
}
