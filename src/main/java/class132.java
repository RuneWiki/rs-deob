import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class132 {

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Ltm;")
    public static class112 field1858 = new class112("K", "T", "K", "K");

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "Lfn;")
    public static class52 field1862 = new class52(7, 3);

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field1863 = 0;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Lbn;")
    public static class106 field1859;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Laq;")
    public static class385 field1861;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "[S")
    public static short[] field1856;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "[[I")
    public static int[][] field1860;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
    public static void method794(boolean arg0) {
        field1862 = null;
        field1861 = null;
        field1856 = null;
        if (arg0) {
            field1858 = null;
        }
        field1860 = null;
        field1859 = null;
        field1858 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBI)V")
    public static final void method795(int arg0, byte arg1, int arg2) {
        field1855++;
        class265 var3 = class440.method2554(arg2, 2, 13);
        var3.method1675(false);
        var3.field3698 = arg0;
        if (arg1 > -75) {
            field1856 = null;
        }
    }
}
