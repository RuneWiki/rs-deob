import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class189 {

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "Lkfa;")
    private class382 field2960;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "J")
    public long field2962;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field2958 = 0;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "Lbs;")
    public static class149 field2961;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V", line = 5)
    public static void method1346(byte arg0) {
        field2961 = null;
        int var1 = 39 % ((63 - arg0) / 63);
    }

    @OriginalMember(owner = "client!afa", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() throws Throwable {
        this.field2960.method2333(this.field2962, 59);
        field2959++;
        super.finalize();
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lkfa;JI)V", line = 33)
    public class189(class382 arg0, long arg1, int arg2) {
        this.field2960 = arg0;
        this.field2962 = arg1;
    }
}
