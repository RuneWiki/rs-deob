import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class314 {

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public int field4662;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "Len;")
    private class289 field4660;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "[F")
    public static float[] field4663 = new float[16];

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "Luc;")
    public static class27 field4664 = new class27(18, 7);

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public static void method1926(int arg0) {
        if (arg0 != -3109) {
            method1926(-63);
        }
        field4664 = null;
        field4663 = null;
    }

    @OriginalMember(owner = "client!afa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4660.method1793(1, this.field4662);
        field4661++;
        super.finalize();
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Len;II)V")
    public class314(class289 arg0, int arg1, int arg2) {
        this.field4662 = arg2;
        this.field4660 = arg0;
    }
}
