import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class145 {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field2688 = 3353893;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[Lej;")
    public static class48[] field2687;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[[[I")
    public static int[][][] field2685;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZBI)Lhj;")
    public static final class69 method1100(boolean arg0, byte arg1, int arg2) {
        field2682++;
        if (arg1 >= -41) {
            field2687 = null;
        }
        return class26.method147(arg0, 10, 122, arg2);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static final void method1101(boolean arg0) {
        class49.field724.method383(-73);
        if (arg0) {
            field2684++;
            class98.field1863 = null;
            class194.field3534 = 1;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lfg;")
    public static final class12 method1102(int arg0, int arg1) {
        field2683++;
        class12 var2 = (class12) class75.field1469.method1714((long) arg0, (byte) -128);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class202.field3651.method590(class23.method129(arg0, (byte) -78), class220.method1560(arg0, arg1 ^ 0x7E), arg1);
        class12 var4 = new class12();
        var4.field179 = arg0;
        if (var3 != null) {
            var4.method66((byte) 46, new class128(var3));
        }
        var4.method58(64);
        if (var4.field146) {
            var4.field178 = false;
            var4.field177 = 0;
        }
        if (!class244.field4479 && var4.field159) {
            var4.field148 = null;
        }
        class75.field1469.method1705((byte) 126, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lej;")
    public static final class48 method1103(int arg0) {
        class121 var1 = new class121(class229.field4196, class53.field941, class138.field2585[0], class88.field1682[0], class69.field1350[arg0], class113.field2167[0], class157.field2919[0], class50.field841);
        field2689++;
        class229.method1636((byte) 120);
        return var1;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method1104(int arg0) {
        field2685 = null;
        field2687 = null;
        if (arg0 <= 54) {
            method1101(true);
        }
    }
}
