import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class class412 extends class60 {

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "Lhb;")
    public static class347 field5525 = new class347(1);

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field5526 = 0;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Lgk;")
    public static class616 field5527 = new class616();

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "Z")
    public static boolean field5528 = false;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Lsq;")
    public static class485 field5529 = new class485(4);

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field5531 = 0;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)Lld;")
    public static final class610 method2308(int arg0, int arg1) {
        field5524++;
        class610 var2 = (class610) class385.field5192.method78(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = -114 / ((arg0 - 57) / 43);
        byte[] var4 = class425.field5992.method3854((byte) 108, 0, arg1);
        class610 var5 = new class610();
        if (var4 != null) {
            var5.method3400(new class115(var4), -32363);
        }
        var5.method3398(true);
        class385.field5192.method92(1, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lfca;")
    public abstract class140 method1501(int arg0);

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
    public static void method2309(byte arg0) {
        field5529 = null;
        field5525 = null;
        field5527 = null;
        if (arg0 <= 105) {
            field5527 = null;
        }
    }
}
