import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class279 extends class18 {

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "[Luc;")
    public static class191[] field4777 = new class191[4];

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field4780 = 0;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "Ljf;")
    public static class229 field4785 = class212.method1457((byte) 82, "<img=0>");

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "Ljf;")
    public static class229 field4786 = class212.method1457((byte) 74, "p12_full");

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "Ljf;")
    public static class229 field4787 = class212.method1457((byte) 116, " x ");

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "Lek;")
    public static class185 field4781;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Luh;")
    public class279 field4776;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "Luh;")
    public class279 field4784;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[I")
    public static int[] field4779;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljf;I)I", line = 19)
    public static final int method1958(class229 arg0, int arg1) {
        field4783++;
        if (class124.field2183 == null || arg0.method1626(-105) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class124.field2183.field5616; var2++) {
            if (class124.field2183.field5618[var2].method1633(class56.field993, (byte) -89, class150.field2602).method1621(arg0, (byte) 100)) {
                return var2;
            }
        }
        if (arg1 != 31924) {
            method1958((class229) null, 42);
        }
        return -1;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V", line = 52)
    public final void method1959(int arg0) {
        field4778++;
        if (this.field4784 == null) {
            return;
        }
        this.field4784.field4776 = this.field4776;
        this.field4776.field4784 = this.field4784;
        this.field4784 = null;
        int var2 = 23 % ((arg0 + 1) / 49);
        this.field4776 = null;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V", line = 80)
    public static void method1960(int arg0) {
        if (arg0 != -1) {
            field4782 = 45;
        }
        field4777 = null;
        field4779 = null;
        field4787 = null;
        field4786 = null;
        field4785 = null;
        field4781 = null;
    }
}
