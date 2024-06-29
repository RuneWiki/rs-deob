import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class271 extends class225 {

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Ljd;")
    public static class85 field4802 = class221.method1499(" <col=ffffff>", (byte) 121);

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "[I")
    public static int[] field4803 = new int[256];

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field4799 = 0;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "Ljd;")
    public static class85 field4804 = class221.method1499("Sprites geladen)3", (byte) -65);

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Lge;")
    public static class68 field4798;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lge;B)I")
    public static final int method1854(class68 arg0, byte arg1) {
        field4805++;
        int var2 = 0;
        if (arg1 > -19) {
            method1854((class68) null, (byte) 92);
        }
        if (arg0.method468(true, class210.field3694)) {
            var2++;
        }
        if (arg0.method468(true, class72.field1346)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method1855(byte arg0) {
        field4802 = null;
        int var1 = 5 % ((-arg0 - 7) / 45);
        field4803 = null;
        field4798 = null;
        field4804 = null;
    }
}
