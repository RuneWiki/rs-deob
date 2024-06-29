import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class63 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Ltm;")
    private class327 field623;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lil;")
    public static class7 field624 = new class7("WTQA", 2);

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "[I")
    public static int[] field627 = new int[25];

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 14)
    public static void method366(int arg0) {
        field624 = null;
        field627 = null;
        if (arg0 != 2) {
            field627 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)I", line = 27)
    public static final int method367(boolean arg0, int arg1) {
        if (arg0) {
            field625++;
            return arg1 >>> 8;
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "client!oi", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        this.field623.method1840(this.field629, 2918);
        field626++;
        super.finalize();
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ltm;II)V", line = 50)
    public class63(class327 arg0, int arg1, int arg2) {
        this.field623 = arg0;
        this.field629 = arg2;
    }
}
