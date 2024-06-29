import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class198 extends class184 {

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "Lsf;")
    public class108 field3566;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "Lsf;")
    private static class108 field3564 = class140.method973(255, " ");

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Lsf;")
    public static class108 field3565 = field3564;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 29)
    public class198() {
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V", line = 33)
    public static void method1401(byte arg0) {
        field3565 = null;
        int var1 = -43 / ((arg0 + 66) / 48);
        field3564 = null;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lsf;I)V", line = 43)
    public class198(class108 arg0, int arg1) {
        this.field3566 = arg0;
    }
}
