import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class class105 {

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Ljf;")
    private static class229 field1821 = class212.method1457((byte) 124, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljf;")
    public static class229 field1820 = field1821;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[[[Ljg;")
    public static class303[][][] field1822 = new class303[4][104][104];

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Ljf;")
    public static class229 field1823 = class212.method1457((byte) 107, "::wm2");

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Ljg;")
    public static class303 field1818 = new class303();

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 34)
    public static void method706(int arg0) {
        if (arg0 < 36) {
            field1821 = (class229) null;
        }
        field1818 = null;
        field1822 = (class303[][][]) null;
        field1821 = null;
        field1820 = null;
        field1823 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILrh;)Lrh;")
    public abstract class137 method705(int arg0, class137 arg1);
}
