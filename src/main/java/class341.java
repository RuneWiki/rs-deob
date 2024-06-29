import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class341 {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lrda;")
    private class663 field4809;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4808 = null;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
    public static int[] field4812 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lha;")
    public static class59 field4807;

    @OriginalMember(owner = "client!rd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4809.method3597(this.field4814, (byte) -51);
        field4811++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method2047(int arg0) {
        field4807 = null;
        field4808 = null;
        if (arg0 > -111) {
            method2048(-97);
        }
        field4812 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static final void method2048(int arg0) {
        class485.method2737(true);
        if (arg0 == -11017) {
            field4813++;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lrda;II)V")
    public class341(class663 arg0, int arg1, int arg2) {
        this.field4814 = arg2;
        this.field4809 = arg0;
    }
}
