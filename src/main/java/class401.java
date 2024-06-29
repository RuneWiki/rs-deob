import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class401 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public int field5639;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Lih;")
    private class503 field5638;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[Z")
    public static boolean[] field5640;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 8)
    public static void method2316(int arg0) {
        int var1 = -75 / ((1 - arg0) / 48);
        field5640 = null;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lih;II)V", line = 16)
    public class401(class503 arg0, int arg1, int arg2) {
        this.field5639 = arg2;
        this.field5638 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "finalize", descriptor = "()V", line = 28)
    protected final void finalize() throws Throwable {
        field5637++;
        this.field5638.method2921(-93, this.field5639);
        super.finalize();
    }
}
