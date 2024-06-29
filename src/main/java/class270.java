import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class270 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lqk;")
    public static class207 field4771 = class24.method212(255, "::rect_debug");

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Z")
    public static boolean field4772 = false;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lqk;")
    public static class207 field4776 = class24.method212(255, "(Y");

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field4778 = 0;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lqk;")
    public static class207 field4779 = class24.method212(255, "<img=1>");

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Z")
    public static boolean field4783 = false;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public int field4770;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    private int field4780;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lqe;")
    public static class96 field4775;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "[[[Lbc;")
    public static class174[][][] field4782;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static void method1842(boolean arg0) {
        field4775 = null;
        field4782 = null;
        if (arg0) {
            field4771 = null;
            field4779 = null;
            field4776 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBLv;)V")
    public final void method1843(int arg0, byte arg1, class149 arg2) {
        while (true) {
            int var4 = arg2.method1045((byte) 83);
            if (var4 == 0) {
                if (arg1 != -119) {
                    field4782 = null;
                }
                field4774++;
                return;
            }
            this.method1846(arg0, -127, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Ldg;")
    public final class139 method1844(byte arg0) {
        field4769++;
        class139 var2 = (class139) class125.field2174.method1387((long) this.field4780, 121);
        if (var2 != null) {
            return var2;
        }
        class139 var3 = class240.method1697(class21.field342, 0, (byte) 34, this.field4780);
        if (var3 != null) {
            class125.field2174.method1385((long) this.field4780, var3, (byte) -119);
        }
        if (arg0 <= 86) {
            method1845((byte) 114, 38);
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Z")
    public static final boolean method1845(byte arg0, int arg1) {
        field4777++;
        class115.field1984 = true;
        if (arg0 <= 125) {
            method1842(false);
        }
        class261.field4651 = arg1 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILv;I)V")
    private final void method1846(int arg0, int arg1, class149 arg2, int arg3) {
        if (arg1 > -123) {
            this.method1844((byte) -69);
        }
        field4773++;
        if (arg3 == 1) {
            this.field4780 = arg2.method1050(1272006568);
        } else if (arg3 == 2) {
            this.field4770 = arg2.method1045((byte) 126);
            this.field4781 = arg2.method1045((byte) -99);
            return;
        }
    }
}
