import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class267 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "J")
    public long field4751 = 0L;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Ljd;")
    public static class85 field4747 = class221.method1499("(U", (byte) -61);

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Ljd;")
    public static class85 field4761 = class221.method1499("rect_debug=", (byte) -113);

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Lve;")
    public static class184 field4757 = new class184(64);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public int field4746;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public int field4750;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field4754;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public int field4756;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lqb;")
    public class56 field4753;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Lqb;")
    public class56 field4759;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)[Lqf;")
    public static final class232[] method1841(int arg0) {
        field4748++;
        int var1 = 86 / ((arg0 - 44) / 55);
        class232[] var2 = new class232[class95.field1741];
        for (int var3 = 0; var3 < class95.field1741; var3++) {
            var2[var3] = new class103(class251.field4331, class229.field3961, class246.field4200[var3], class121.field2134[var3], class30.field443[var3], class244.field4165[var3], class178.field3060[var3], class2.field20);
        }
        class47.method322(-29493);
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static final void method1842(byte arg0) {
        field4760++;
        if (arg0 > -28) {
            field4762 = -29;
        }
        class131.field2289.method1262(17244);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static void method1843(byte arg0) {
        field4761 = null;
        field4757 = null;
        if (arg0 != -98) {
            field4761 = null;
        }
        field4747 = null;
    }
}
