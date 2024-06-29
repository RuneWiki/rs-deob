import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class133 {

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lqi;")
    private class510 field1842;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "Luf;")
    public static class380 field1843 = new class380(32);

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "Z")
    public static boolean field1846 = false;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "Ltt;")
    public static class338 field1845 = new class338(14, 3);

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field1848;

    @OriginalMember(owner = "client!qaa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1842.method2890(this.field1847, (byte) 123);
        field1844++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public static void method775(int arg0) {
        field1845 = null;
        field1848 = null;
        if (arg0 >= -112) {
            method775(-49);
        }
        field1843 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lqi;II)V")
    public class133(class510 arg0, int arg1, int arg2) {
        this.field1842 = arg0;
        this.field1847 = arg2;
    }
}
