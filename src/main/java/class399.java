import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class399 {

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "Lwu;")
    private class557 field5519;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public int field5521;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "Lqk;")
    public static class148 field5522 = new class148(111, -2);

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lag;")
    public static class214 field5523 = new class214(7, 2);

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "Z")
    public static boolean field5526 = false;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lqk;")
    public static class148 field5525 = new class148(15, 2);

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "Lwu;")
    public static class557 field5524;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BII)V", line = 7)
    public static final void method2420(byte arg0, int arg1, int arg2) {
        if (arg0 <= 3) {
            field5523 = null;
        }
        field5520++;
        class118 var3 = class126.method814(true, arg1, 14);
        var3.method771(-30559);
        var3.field1636 = arg2;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 22)
    public static void method2421(int arg0) {
        if (arg0 != 15) {
            method2421(-69);
        }
        field5522 = null;
        field5525 = null;
        field5523 = null;
        field5524 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lwj;ILwu;)V", line = 61)
    public class399(class121 arg0, int arg1, class557 arg2) {
        new class538(64);
        this.field5519 = arg2;
        this.field5521 = this.field5519.method3333(15, 3443);
    }
}
