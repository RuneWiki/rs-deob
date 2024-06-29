import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class216 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lpea;")
    private class641 field2789;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "J")
    public long field2786;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[B")
    public static byte[] field2790 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "J")
    public static long field2787 = 0L;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2789.method3537(this.field2786, -31441);
        field2792++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method1335(int arg0) {
        field2790 = null;
        if (arg0 != -16013) {
            method1336(89, -112, (byte) 16);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1336(int arg0, int arg1, byte arg2) {
        field2788++;
        if (arg2 != -56) {
            method1335(-128);
        }
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lpea;JI)V")
    public class216(class641 arg0, long arg1, int arg2) {
        this.field2789 = arg0;
        this.field2786 = arg1;
    }
}
