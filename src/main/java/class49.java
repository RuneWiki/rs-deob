import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class49 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lnq;")
    private class325 field696;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lfg;")
    public static class84 field698 = new class84(4, 1, 1, 1);

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field701 = 100;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lpa;")
    public static class254 field700 = new class254(10, 6);

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field702;

    static {
        new class446("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        field703 = -60;
    }

    @OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field697++;
        this.field696.method2046(this.field695, 0);
        super.finalize();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 17)
    public static void method376(byte arg0) {
        if (arg0 != -86) {
            field701 = -23;
        }
        field698 = null;
        field700 = null;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lnq;II)V", line = 30)
    public class49(class325 arg0, int arg1, int arg2) {
        this.field695 = arg2;
        this.field696 = arg0;
    }
}
