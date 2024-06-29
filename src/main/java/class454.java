import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class454 {

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public int field6578;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "[I")
    public static int[] field6579;

    @OriginalMember(owner = "client!iga", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field6577++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V", line = 12)
    public static void method2779(int arg0) {
        if (arg0 != -13177) {
            method2779(-34);
        }
        field6579 = null;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIBII)V", line = 22)
    public static final void method2780(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = -38 % ((arg2 - 39) / 50);
        field6576++;
        if (arg0 <= arg3) {
            class399.method2472(27113, arg0, arg3, arg4, class329.field4651[arg1]);
        } else {
            class399.method2472(27113, arg3, arg0, arg4, class329.field4651[arg1]);
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(I)V", line = 43)
    public class454(int arg0) {
        this.field6578 = arg0;
    }
}
