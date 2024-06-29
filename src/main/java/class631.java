import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class631 {

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljaa;")
    private class576 field8558;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field8554;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field8559 = 0;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Ldr;")
    public static class675 field8561 = new class675(57, 10);

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Ldr;")
    public static class675 field8563 = new class675(60, 1);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 6)
    public static void method3543(byte arg0) {
        if (arg0 != -92) {
            method3543((byte) 43);
        }
        field8563 = null;
        field8561 = null;
    }

    @OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() throws Throwable {
        this.field8558.method3178(-128, this.field8554);
        field8555++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljaa;II)V", line = 37)
    public class631(class576 arg0, int arg1, int arg2) {
        this.field8558 = arg0;
        this.field8554 = arg2;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;IIIBIII)V", line = 53)
    public static final void method3544(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field8560++;
        class190 var8 = new class190();
        var8.field2257 = arg3;
        if (arg4 != -119) {
            return;
        }
        var8.field2259 = arg7;
        var8.field2260 = arg0;
        var8.field2258 = arg6;
        var8.field2263 = arg5;
        var8.field2265 = arg1;
        var8.field2262 = class665.field9027 + arg2;
        class67.field803.method1714(var8, (byte) 11);
    }
}
