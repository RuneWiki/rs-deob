import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class318 {

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "J")
    public long field4360;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "Ltba;")
    private class147 field4361;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "Llca;")
    public static class598 field4364 = new class598();

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Lhd;")
    public static class689 field4362;

    @OriginalMember(owner = "client!tu", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        this.field4361.method1046(this.field4360, 107);
        field4359++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 13)
    public static void method1919(byte arg0) {
        if (arg0 < 63) {
            field4364 = null;
        }
        field4362 = null;
        field4364 = null;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Ltba;JI)V", line = 35)
    public class318(class147 arg0, long arg1, int arg2) {
        this.field4360 = arg1;
        this.field4361 = arg0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 47)
    public static final void method1920(int arg0) {
        if (class11.field99 != null) {
            class11.field99.method3556(arg0 - 29436);
        }
        field4363++;
        if (arg0 == 29370 && class681.field9723 != null) {
            class681.field9723.method3556(-72);
        }
    }
}
