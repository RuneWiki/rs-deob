import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class479 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "Ltk;")
    private class347 field6518;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public int field6520;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Lhm;")
    public static class223 field6521 = new class223(6, 1);

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "Lkg;")
    public static class275 field6522 = new class275(100, 4);

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Lbp;")
    public static class389 field6523 = new class389();

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!ap", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6518.method1984(this.field6520, (byte) -58);
        field6519++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
    public static void method2755(int arg0) {
        if (arg0 <= 22) {
            method2755(-47);
        }
        field6522 = null;
        field6523 = null;
        field6521 = null;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ltk;II)V")
    public class479(class347 arg0, int arg1, int arg2) {
        this.field6518 = arg0;
        this.field6520 = arg2;
    }
}
